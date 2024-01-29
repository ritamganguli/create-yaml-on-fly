package com.aspire.guidewire.pageobjectsgenerator;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.text.CaseUtils;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

public class CreatePageObjectsJSON {

	// table entries

	Map<String, String> tableData = new HashMap<String, String>();
	Map<String, ArrayList<String>> tableList = new HashMap<String, ArrayList<String>>();
	Map<String, ArrayList<String>> pageTableMap = new LinkedHashMap<String, ArrayList<String>>();

	@Test
	public void createJSON() throws Exception {
		readExcelAndCreateJSON();
	}

	@Test(dependsOnMethods = "createJSON")
	public void createJava() throws Exception {
		createOrUpdateJavaClass();
	}

	public void readExcelAndCreateJSON() throws IOException {

		File file = new File("./src/main/resources/pageobjectsoutput/PageObjects.xlsx");
		try (FileInputStream inputStream = new FileInputStream(file);
				Workbook workbook = new XSSFWorkbook(inputStream)) {
			if (workbook.getNumberOfSheets() != 0) {
				for (int j = 0; j < workbook.getNumberOfSheets(); j++) {

					String sheetName = workbook.getSheetName(j);
					Sheet pageObjectsSheet = workbook.getSheet(sheetName);

					int rowCount = pageObjectsSheet.getLastRowNum() - pageObjectsSheet.getFirstRowNum();
					boolean firstEntry = true;
					boolean containsYes = false;
					FileWriter fw = null;

					File JSONpath = new File("./src/main/resources/pageobjectsoutput/");

					int yesCount = 0;
					int yesIteration = 0;

					// to fetch number of "yes" counts
					for (int i = 1; i < rowCount + 1; i++) {

						Row row = pageObjectsSheet.getRow(i);

						if (row.getCell(5) != null) {
							if (row.getCell(5).getStringCellValue().equalsIgnoreCase("Yes")) {
								yesCount++;
							}
						}
					}

					for (int i = 1; i < rowCount + 1; i++) {

						Row row = pageObjectsSheet.getRow(i);
						if (row.getCell(5) != null) {
							if (row.getCell(5).getStringCellValue().equalsIgnoreCase("Yes")) {

								yesIteration++;
								if (firstEntry) {

									fw = new FileWriter(JSONpath + "/" + sheetName.replaceAll(" ", "").trim() + ".JSON");
									fw.write("{\r\n" + "	\"pageName\": \"" + sheetName.replaceAll(" ", "").trim()
											+ "\",\r\n" + "	\"pageObjects\": [");
									fw.write("\n");
									containsYes = true;
									firstEntry = false;
								}

								String elementDisplayName = null;
								String elementObject = null;

								if (row.getCell(2) != null && row.getCell(2).toString().length() > 0) {// check manually
									// updated element
									// name is not empty
									elementDisplayName = row.getCell(2).getStringCellValue().replaceAll(" ", "").trim();
								} else {
									elementDisplayName = row.getCell(1).getStringCellValue().replaceAll(" ", "").trim();
								}

								if (row.getCell(4) != null && row.getCell(4).toString().length() > 0) {// check manually
									// updated locator
									// is not empty
									elementObject = row.getCell(4).getStringCellValue();
								} else {
									elementObject = row.getCell(3).getStringCellValue();
								}

								if (elementDisplayName.startsWith("tbl")) {
									tableData.put(elementDisplayName, elementObject);
									String tableName = elementDisplayName.split("\\|\\|")[1];
									tableName = tableName.replace("LV.pcf", "").replace(".pcf", "").replace("LV.default",
											"");
									if (pageTableMap.isEmpty() || pageTableMap.get(sheetName) == null) {
										pageTableMap.put(sheetName, new ArrayList<String>());
										pageTableMap.get(sheetName).add(tableName);
									} else {
										if (!pageTableMap.get(sheetName).contains(tableName))
											pageTableMap.get(sheetName).add(tableName);
									}
								}
								if (yesIteration == yesCount) { // if last entry
									fw.write("		{\r\n" + "			\"elementName\": \"" + elementDisplayName.trim()
									+ "\",\r\n" + "			\"object\": \"" + elementObject + "\"\r\n" + "		}");
									fw.write("\n");
								} else {

									fw.write("		{\r\n" + "			\"elementName\": \"" + elementDisplayName.trim()
									+ "\",\r\n" + "			\"object\": \"" + elementObject + "\"\r\n"
									+ "		},");
									fw.write("\n");
								}
							} // yes row iteration-end

						}

						if (i == rowCount && containsYes) {
							fw.write("	]\r\n" + "}");
							fw.close();
						} else if (i == rowCount && containsYes == false) {
							System.out.println(
									"No elements in selected in page objects.xlsx sheet, kindly select the elements");
						}
						// System.out.println();
					}
					//				System.out.println("For loop");
				}
			}
			//        workbook.close();
		}
	}

	private void processTableData() {

		for (Map.Entry<String, String> e : tableData.entrySet()) {
			// System.out.println(e.getKey() + e.getValue());
			String[] tableDetails = e.getKey().split("\\|\\|");

			String currentTableName = tableDetails[1].replace("LV.pcf", "").replace(".pcf", "")
					.replace("LV.default", "").replace(".", "").replace("pcf", "");

			String tableRowName = tableDetails[0];
			String tableRowLocator = e.getValue();

			if (!tableList.containsKey(currentTableName)) {
				tableList.put(currentTableName, new ArrayList<String>());
				tableList.get(currentTableName).add(tableRowName + "||" + tableRowLocator);
			} else
				tableList.get(currentTableName).add(tableRowName + "||" + tableRowLocator);
		}
	}

	private void clearTableData() {
		tableData.clear();
		tableList.clear();
	}

	public void createOrUpdateJavaClass() throws Exception {
		File[] jsonFiles = new File("./src/main/resources/pageobjectsoutput/").listFiles();
		File[] javaFiles = new File("./src/main/java/ASPIREAI/wrappers/").listFiles();
		Boolean updFlag;
		for (File jsonFile : jsonFiles) {
			updFlag = false;
			for (File javaFile : javaFiles) {
				if (javaFile.getName().split("\\.")[0].equalsIgnoreCase(jsonFile.getName().split("\\.")[0])) {
					updFlag = true;
					updateJavaClass(javaFile.getName());
					break;
				}
			}
			if (!updFlag & jsonFile.getName().split("\\.")[1].equalsIgnoreCase("json")) {
				createJavaClass(jsonFile.getName());
			}
		}
	}

	public void createJavaClass(String classNameWithJsonExtn) throws Exception {
		String methodName;

		File JSONFile = new File("./src/main/resources/pageobjectsoutput/" + classNameWithJsonExtn);
		JSONParser parser = new JSONParser();
		FileReader reader = new FileReader(JSONFile);
		JSONObject jsonObject = (JSONObject) parser.parse(reader);
		JSONArray pageObjects = (JSONArray) jsonObject.get("pageObjects");
		//	FileWriter fw = null;
		boolean firstEntry = true;

		String className = classNameWithJsonExtn.split("\\.")[0];

		// figure out tables in current page
		processTableData();

		List<String> tableNames = new ArrayList<>();
		for (Entry<String, ArrayList<String>> table : tableList.entrySet())
			tableNames.add(table.getKey());

		if (firstEntry) {
			try (FileWriter fw = new FileWriter("./src/main/java/ASPIREAI/wrappers/" + className + ".java"))
			{

				fw.write("package ASPIREAI.wrappers;\r\n" + "import java.util.HashMap;\r\n" + "import java.util.List;\r\n"
						+ "import java.util.ArrayList;\r\n" + "import java.util.NoSuchElementException;\r\n"
						+ "import org.openqa.selenium.WebDriver;\r\n" + "import org.openqa.selenium.WebElement;\r\n"
						+ "import org.openqa.selenium.support.How;\r\n" + "import org.openqa.selenium.By;\r\n"
						+ "import org.openqa.selenium.Point;\r\n"
						+ "import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;\r\n"
						+ "import org.openqa.selenium.support.ui.LoadableComponent;\r\n"
						+ "import ASPIREAI.customfactories.AjaxElementLocatorFactory;\r\n"
						+ "import ASPIREAI.customfactories.PageFactory;\r\n" + "import com.aspire.guidewire.tables.*;\r\n"
						+ "import com.aspire.guidewire.utils.BrowserActions;\r\n"
						+ "import com.aspire.guidewire.utils.ElementLayer;\r\n"
						+ "import com.aspire.guidewire.utils.Log;\r\n" + "import com.aspire.guidewire.utils.Utils;\r\n"
						+ "import com.aspire.guidewire.utils.WaitUtils;" + "import org.testng.Assert;\r\n"
						+ "import ASPIREAI.customfactories.IFindBy;\r\n" + "\r\n" + "public class " + className
						+ " extends LoadableComponent<" + className + ">" + " {\r\n" + "\r\n" + "	WebDriver driver;\r\n"
						+ "	private boolean isPageLoaded;\r\n" + "	public ElementLayer elementLayer;\r\n"
						+ "	String elementObject;\r\n" + "	HashMap<String, String> getPageObjects;\r\n"
						+ " 	public static List<Object> pageFactoryKey = new ArrayList<Object>();\r\n"
						+ "	public static List<String> pageFactoryValue = new ArrayList<String>();\r\n" + "\r\n" + "");

				// Top Nav Bar obj creation
				if (!className.startsWith(Constants.TOPNAVBAR)) {
					fw.write("	//TopNavBar object\r\n");
					fw.write("	public " + Constants.TOPNAVBAR + " " + CaseUtils.toCamelCase(Constants.TOPNAVBAR, false)
					+ ";\r\n");
				}

				// Tables obj declaration
				for (Entry<String, ArrayList<String>> pageTableMapDetails : pageTableMap.entrySet()) {
					if (pageTableMapDetails.getKey().equalsIgnoreCase(className)) {
						String[] tableNameList = pageTableMapDetails.getValue().toString().split(",");
						for (String tableName : tableNameList) {
							tableName = tableName.replaceAll("\\W+", "");
							fw.write("	public " + tableName + " " + CaseUtils.toCamelCase(tableName, false)
							+ "Table;\r\n\r\n");
						}
					}
				}

				firstEntry = false;

				//}

				String elementName = null;
				String pageWaitElement = null;
				String elementObject;
				for (Object pageObject1 : pageObjects) {
					JSONObject JSONpageObject1 = (JSONObject) pageObject1;
					elementName = (String) JSONpageObject1.get("elementName");
					elementObject = (String) JSONpageObject1.get("object");

					String elementType = elementObject.split("\\|")[0];
					String elementUsing = elementObject.split("\\|")[1];

					if (!elementName.startsWith("tbl")) {
						pageWaitElement = elementName;
						fw.write("	@IFindBy(how = How." + elementType.toUpperCase() + ", using = \"" + elementUsing
								+ "\", AI = false)\r\n" + "	private WebElement " + elementName + ";\r\n");
						fw.write("\n");
					}
				}

				fw.write("	public " + className.split("\\.")[0] + "(){\r\n" + "	}\r\n" + "\r\n" + "	public "
						+ className.split("\\.")[0] + "(WebDriver driver) throws Exception{\r\n"
						+ "		this.driver = driver;\r\n"
						+ "		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, 10);\r\n"
						+ "		PageFactory.initElements(finder, this);\r\n");

				// create objects for tables

				for (Entry<String, ArrayList<String>> pageTableMapDetails : pageTableMap.entrySet()) {
					if (pageTableMapDetails.getKey().equalsIgnoreCase(className.split("\\.")[0])) {
						String[] tableNameList = pageTableMapDetails.getValue().toString().split(",");
						for (String tableName : tableNameList) {
							tableName = tableName.replaceAll("\\W+", "");
							fw.write("		" + CaseUtils.toCamelCase(tableName, false) + "Table" + " = new " + tableName
									+ "();\r\n");
						}
					}
				}

				// close constructor
				fw.write("}\r\n");

				fw.write("@Override\r\n" + "	protected void load() {\r\n" + "		isPageLoaded = true;\r\n"
						+ "		WaitUtils.waitForPageLoad(driver);\r\n" + "	}" + "@Override\r\n"
						+ "	protected void isLoaded() {\r\n" + "		if (!isPageLoaded) {\r\n"
						+ "			Assert.fail();\r\n" + "		}" + "if (isPageLoaded && !(Utils.waitForElement(driver, "
						+ pageWaitElement + "))) {\r\n"
						+ "			Log.fail(\"Page did not open up. Site might be down.\", driver);\r\n" + "		}"
						+ "elementLayer = new ElementLayer(driver);\r\n" + "}");

				for (Object pageObject : pageObjects) {
					JSONObject JSONpageObject = (JSONObject) pageObject;
					elementName = (String) JSONpageObject.get("elementName");
					// elementObject = (String) JSONpageObject.get("object");

					methodName = elementName.substring(3);
					char[] chars = methodName.toCharArray();
					Boolean mthdNum = false;
					StringBuilder sb = new StringBuilder();
					int cCount = 0;
					for (char c : chars) {
						if (Character.isDigit(c)) {
							cCount++;
						}
					}

					if (cCount == chars.length) {
						mthdNum = true;
					} else {
						mthdNum = false;
					}

					if (!mthdNum) {
						methodName = methodName.substring(0, 1).toUpperCase() + methodName.substring(1); // make first character
						// caps
					}

					if (elementName.startsWith("btn") && !methodName.isEmpty()) {

						fw.write(createActionMethodForButton(className, methodName, elementName));
						fw.write("\n");
					} else if (elementName.startsWith("inp") && !methodName.isEmpty()) {

						fw.write(createActionMethodForInput(className, methodName, elementName));
						fw.write("\n");

					} else if (elementName.startsWith("lnk") && !methodName.isEmpty()) {

						fw.write(createActionMethodForLabel(methodName, elementName));
						fw.write("\n");

					} else if (elementName.startsWith("chk") && !methodName.isEmpty()) {
						fw.write(createActionMethodForButton(className, methodName, elementName));
						fw.write("\n");
					} else if (elementName.startsWith("rdb") && !methodName.isEmpty()) {
						fw.write(createActionMethodForButton(className, methodName, elementName));
						fw.write("\n");
					} else if (elementName.startsWith("drp") && !methodName.isEmpty()) {
						fw.write(createActionMethodForDropDown(className, methodName, elementName));
						fw.write("\n");
					}

				} // End for loop

				fw.write("}\r\n");
				fw.close();
			}

			// create table wrappers if any
			createTableClass(tableList);

			clearTableData();
		}

	}

	private void createTableClass(Map<String, ArrayList<String>> tableList) {
	//	FileWriter fw = null;

		for (Entry<String, ArrayList<String>> table : tableList.entrySet()) {
			String className = table.getKey();
			try(FileWriter fw = new FileWriter("./src/main/java/com/aspire/guidewire/tables/" + className + ".java")) {
				
				fw.write("package com.aspire.guidewire.tables;\r\n" + "import java.util.HashMap;\r\n"
						+ "import java.util.List;\r\n" + "import java.util.ArrayList;\r\n"
						+ "import java.util.NoSuchElementException;\r\n" + "import org.openqa.selenium.WebDriver;\r\n"
						+ "import org.openqa.selenium.WebElement;\r\n" + "import org.openqa.selenium.support.How;\r\n"
						+ "import org.openqa.selenium.By;\r\n" + "import org.openqa.selenium.Point;\r\n"
						+ "import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;\r\n"
						+ "import ASPIREAI.customfactories.AjaxElementLocatorFactory;\r\n"
						+ "import ASPIREAI.customfactories.PageFactory;\r\n"
						+ "import ASPIREAI.customfactories.IFindBy;\r\n"
						+ "import ASPIREAI.customfactories.IFindBys;\r\n"
						+ "import com.aspire.guidewire.utils.BrowserActions;\r\n" + "\r\n" + "public class " + className
						+ " {\r\n" + "\r\n" + "	WebDriver driver;\r\n" + "	String elementIdentifier;\r\n"
						+ "	String elementObject;\r\n" + "	HashMap<String, String> getPageObjects;\r\n"
						+ " 	public static List<Object> pageFactoryKey = new ArrayList<Object>();\r\n"
						+ "	public static List<String> pageFactoryValue = new ArrayList<String>();\r\n" + "\r\n" + "");

				for (String locatorWithLabel : table.getValue())
					System.out.println(locatorWithLabel);

				for (String locatorWithLabel : table.getValue()) {
					String[] locatorDetails = locatorWithLabel.split("\\|\\|");
					String label = locatorDetails[0].split("\\|")[1];
					String locatorPart = locatorDetails[1];
					String[] locatorData = locatorPart.split("\\|");
					String locatorType = locatorData[0];
					String locatorValue = locatorData[1];
					fw.write("	@IFindBys({\r\n" + "			@IFindBy(how = How." + locatorType.toUpperCase()
					+ ", using = \"" + locatorValue + "\", AI = false)})\r\n" + "	private List<WebElement> "
					+ label + ";\r\n");
					fw.write("\n");
				}

				// create table methods
				for (String locatorWithLabel : table.getValue()) {
					String[] locatorDetails = locatorWithLabel.split("\\|\\|");
					String labelWithPrefix = locatorDetails[0].split("\\|")[1];
					String label = labelWithPrefix.substring(3);
					String methodType = labelWithPrefix.substring(0, 3);
					String methodName = null;

					fw.write("	// get label of " + label + "\r\n" + "	public List<String> getLabelOf" + label
							+ "(){\r\n" + "		List<String> returnItems = new ArrayList<String>();\r\n"
							+ "		for(WebElement element : " + labelWithPrefix + ") \r\n"
							+ "			returnItems.add(BrowserActions.getText(null, element, " + labelWithPrefix
							+ ".toString()));\r\n" + "\r\n" + "		return returnItems;\r\n" + "}\r\n");

					if (methodType.equalsIgnoreCase("btn"))
						methodName = "Buttons";
					else if (methodType.equalsIgnoreCase("chk"))
						methodName = "CheckBoxes";
					else if (methodType.equalsIgnoreCase("drp"))
						methodName = "Dropdowns";

					if (!methodType.equalsIgnoreCase("lbl"))
						fw.write("	// get " + methodName + " of " + label + "\r\n" + "	public List<WebElement> get"
								+ label + methodName + "(){\r\n"
								+ "		List<WebElement> returnItems = new ArrayList<WebElement>();\r\n"
								+ "		for(WebElement element : " + labelWithPrefix + ") \r\n"
								+ "			returnItems.add(element);\r\n" + "\r\n" + "		return returnItems;\r\n"
								+ "}\r\n");

				}

				// end of class
				fw.write("}\r\n");
				fw.close();
			} catch (Exception e) {

			}
		}

	}

	public void updateJavaClass(String className) throws IOException, ParseException {
		File file = new File("./src/main/java//Wrappers/" + className);
		Path flPath = file.toPath();
		String strPrev = null;
		Boolean elUpdate = false, mthdUpdate = false;
		StringBuffer buffer = new StringBuffer();
		if (file.exists()) {
			List<String> lines = Files.readAllLines(flPath, Charset.defaultCharset());
			int lineCount = 0;
			for (String line : lines) {
				lineCount++;
				if (!elUpdate && !mthdUpdate) {
					if (!line.trim().isEmpty() && (line.contains("public WebElement") || line.startsWith("\t}"))) {
						strPrev = line;
					} else {
						if (line.contains("public " + className.split("\\.")[0]) && strPrev != null
								&& strPrev.contains("public WebElement")) {
							System.out.println("placeholder to update elements");
							strPrev = line;
							elUpdate = true;
							int elLineNo = lineCount + 1;
						}

						// Commented by Bhaskar
						//                        if (line.trim().contains("/****Manual Functions****/") && strPrev != null &&
						//                                strPrev.startsWith("\t}")) {
						//                            System.out.println("placeholder to update methods");
						//                            strPrev=line;
						//                            mthdUpdate = true;
						//                            int mthdLineNo = lineCount + 1;
						//                        }

					}
					if (!elUpdate && !mthdUpdate) {
						buffer.append(line);
						buffer.append("\n");
					}

				} else {
					if (elUpdate) { // Updating Web Elements
						ArrayList<String> results = new ArrayList<String>();
						String methodName;
						File JSONFile = new File(
								"./src/main/resources/pageobjectsoutput/" + className.split("\\.")[0] + ".JSON");
						JSONParser parser = new JSONParser();
						FileReader reader = new FileReader(JSONFile);
						JSONObject jsonObject = (JSONObject) parser.parse(reader);
						JSONArray pageObjects = (JSONArray) jsonObject.get("pageObjects");
						String elementName;
						String elementObject;
						for (Object pageObject1 : pageObjects) {
							JSONObject JSONpageObject1 = (JSONObject) pageObject1;
							elementName = (String) JSONpageObject1.get("elementName");
							elementObject = (String) JSONpageObject1.get("object");
							String elementType = elementObject.split("\\|")[0];
							String elementUsing = elementObject.split("\\|")[1];
							if (buffer.indexOf(elementName) == -1) {
								buffer.append("    @IFindBy(how = How." + elementType.toUpperCase() + ", using = \""
										+ elementUsing + "\", AI = true)\r\n");
								buffer.append("    private WebElement " + elementName + ";\r\n");
								buffer.append("\n");
							}
						}
						elUpdate = false;
						buffer.append(strPrev);
						buffer.append("\n");
						buffer.append(line);
						buffer.append("\n");
					} //
				}

			} // Exit for loop

			// Updating Action methods by Bhaskar
			if (!mthdUpdate) {
				if (buffer.indexOf("}") != -1) { // Removing '}' of the class and adding later
					buffer.delete(buffer.lastIndexOf("}") - 1, buffer.lastIndexOf("}") + 1);
				}

				String methodName;
				File JSONFile = new File(
						"./src/main/resources/pageobjectsoutput/" + className.split("\\.")[0] + ".JSON");
				JSONParser parser = new JSONParser();
				FileReader reader = new FileReader(JSONFile);
				JSONObject jsonObject = (JSONObject) parser.parse(reader);
				JSONArray pageObjects = (JSONArray) jsonObject.get("pageObjects");
				String elementName;
				String elementObject;
				for (Object pageObject : pageObjects) {
					JSONObject JSONpageObject = (JSONObject) pageObject;
					elementName = (String) JSONpageObject.get("elementName");
					methodName = elementName.substring(3);

					/* Logic to identify elementName is not number */
					char[] chars = methodName.toCharArray();
					Boolean mthdNum = false;
					StringBuilder sb = new StringBuilder();
					int cCount = 0;
					for (char c : chars) {
						if (Character.isDigit(c)) {
							cCount++;
						}
					}

					if (cCount == chars.length) {
						mthdNum = true;
					} else {
						mthdNum = false;
					}

					if (!mthdNum) {
						methodName = methodName.substring(0, 1).toUpperCase() + methodName.substring(1); // make first
						// character
						// caps
					}

					if (elementName.startsWith("btn") && !methodName.isEmpty()
							&& buffer.indexOf(methodName) == buffer.lastIndexOf(methodName)) {
						buffer.append("	// Adding ActionMethods for 'button' element \r\n" + "	public void click"
								+ methodName + "Button(WebDriver driver) throws Exception {	\r\n"
								+ "		this.driver=driver;\r\n" + "		try{\r\n" + "			WebElement el="
								+ elementName + ";\r\n" + "			el.click();\r\n"
								+ "		}catch(NoSuchElementException e) {\r\n"
								+ "			System.out.println(\"Could not find WebElement:\"+elementObject);\r\n"
								+ "		}\r\n" + "	}\r\n" + "\r\n" + "	public void check" + methodName
								+ "ButtonEnabled(WebDriver driver) throws Exception {\r\n"
								+ "		this.driver=driver;\r\n" + "		try{\r\n" + "			WebElement el="
								+ elementName + ";\r\n" + "			el.isEnabled();\r\n"
								+ "		}catch(NoSuchElementException e) {\r\n"
								+ "			System.out.println(\"Could not find WebElement:\"+elementObject);\r\n"
								+ "		}\r\n" + "	}\r\n" + "\r\n" + "	public String get" + methodName
								+ "ButtonText(WebDriver driver) throws Exception {\r\n" + "		this.driver=driver;\r\n"
								+ "		WebElement el=null;\r\n" + "		try{\r\n" + "			el=" + elementName
								+ ";\r\n" + "			el.getText();\r\n"
								+ "		}catch(NoSuchElementException e) {\r\n"
								+ "			System.out.println(\"Could not find WebElement:\"+elementObject);\r\n"
								+ "		}\r\n" + "		return el.getText();\r\n" + "	}\r\n" + "\r\n"
								+ "	public Point get" + methodName
								+ "ButtonLocator(WebDriver driver) throws Exception {\r\n"
								+ "		this.driver=driver;\r\n" + "		Point locator=null;\r\n"
								+ "		WebElement el=null;\r\n" + "		try{\r\n" + "			el=" + elementName
								+ ";\r\n" + "			locator=el.getLocation();\r\n"
								+ "		}catch(NoSuchElementException e) {\r\n"
								+ "			System.out.println(\"Could not find WebElement:\"+elementObject);\r\n"
								+ "		}\r\n" + "		return locator;\r\n" + "	}\r\n" + "\r\n"
								+ "	public WebElement get" + methodName
								+ "ButtonWebElement(WebDriver driver) throws Exception {\r\n"
								+ "		this.driver=driver;\r\n" + "		WebElement el=null;\r\n"
								+ "		try{\r\n" + "			el=" + elementName + ";\r\n"
								+ "		}catch(NoSuchElementException e) {\r\n"
								+ "			System.out.println(\"Could not find WebElement:\"+elementObject);\r\n"
								+ "		}\r\n" + "		return el ;\r\n" + "	}\r\n");
						buffer.append("\n");

					} else if (elementName.startsWith("inp") && !methodName.isEmpty()
							&& buffer.indexOf(methodName) == buffer.lastIndexOf(methodName)) {
						buffer.append("	// Adding ActionMethods for 'input' element \r\n" + "	public void typeInto"
								+ methodName + "Field(WebDriver driver, String textToEnter) throws Exception {\r\n"
								+ "		this.driver=driver;\r\n" + "		try{\r\n" + "			WebElement el="
								+ elementName + ";\r\n" + "			el.sendKeys(textToEnter);\r\n"
								+ "		}catch(NoSuchElementException e) {\r\n"
								+ "			System.out.println(\"Could not find WebElement:\"+elementObject);\r\n"
								+ "		}\r\n" + "	}\r\n" + "\r\n" + "	public void check" + methodName
								+ "FieldIsVisible(WebDriver driver) throws Exception {\r\n"
								+ "		this.driver=driver;\r\n" + "		try{\r\n" + "			WebElement el="
								+ elementName + ";\r\n" + "			el.isDisplayed();\r\n"
								+ "		}catch(NoSuchElementException e) {\r\n"
								+ "			System.out.println(\"Could not find WebElement:\"+elementObject);\r\n"
								+ "		}\r\n" + "	}\r\n" + "\r\n" + "	public String get" + methodName
								+ "FieldText(WebDriver driver) throws Exception{\r\n" + "		this.driver=driver;\r\n"
								+ "		WebElement el = null;\r\n" + "		try{\r\n" + "			el=" + elementName
								+ ";\r\n" + "			el.getText();\r\n"
								+ "		}catch(NoSuchElementException e) {\r\n"
								+ "			System.out.println(\"Could not find WebElement:\"+elementObject);\r\n"
								+ "		}\r\n" + "		return el.getText();\r\n" + "	}\r\n" + "\r\n"
								+ "	public Point get" + methodName
								+ "FieldLocator(WebDriver driver) throws Exception {\r\n"
								+ "		this.driver=driver;\r\n" + "		Point locator=null;\r\n"
								+ "		WebElement el=null;\r\n" + "		try{\r\n" + "			el=" + elementName
								+ ";\r\n" + "			locator=el.getLocation();\r\n"
								+ "		}catch(NoSuchElementException e) {\r\n"
								+ "			System.out.println(\"Could not find WebElement:\"+elementObject);\r\n"
								+ "		}\r\n" + "		return locator;\r\n" + "	}\r\n" + "\r\n"
								+ "	public WebElement get" + methodName
								+ "FieldWebElement(WebDriver driver) throws Exception {\r\n"
								+ "		this.driver=driver;\r\n" + "		WebElement el=null;\r\n"
								+ "		try{\r\n" + "			el=" + elementName + ";\r\n"
								+ "		}catch(NoSuchElementException e) {\r\n"
								+ "			System.out.println(\"Could not find WebElement:\"+elementObject);\r\n"
								+ "		}\r\n" + "		return el ;\r\n" + "	}\r\n");
						buffer.append("\n");

					} else if (elementName.startsWith("lnk") && !methodName.isEmpty()
							&& buffer.indexOf(methodName) == buffer.lastIndexOf(methodName)) {
						buffer.append("	// Adding ActionMethods for 'link' element \r\n" + "	public void click"
								+ methodName + "(WebDriver driver) throws Exception {	\r\n"
								+ "		this.driver=driver;\r\n" + "		try{\r\n" + "			WebElement el="
								+ elementName + ";\r\n" + "			el.click();\r\n"
								+ "		}catch(NoSuchElementException e) {\r\n"
								+ "			System.out.println(\"Could not find WebElement:\"+elementObject);\r\n"
								+ "		}\r\n" + "	}\r\n" + "\r\n" + "	public void check" + methodName
								+ "Enabled(WebDriver driver) throws Exception {\r\n" + "		this.driver=driver;\r\n"
								+ "		try{\r\n" + "			WebElement el=" + elementName + ";\r\n"
								+ "			el.isEnabled();\r\n" + "		}catch(NoSuchElementException e) {\r\n"
								+ "			System.out.println(\"Could not find WebElement:\"+elementObject);\r\n"
								+ "		}\r\n" + "	}\r\n" + "\r\n" + "	public String get" + methodName
								+ "Text(WebDriver driver) throws Exception {\r\n" + "		this.driver=driver;\r\n"
								+ "		WebElement el=null;\r\n" + "		try{\r\n" + "			el=" + elementName
								+ ";\r\n" + "			el.getText();\r\n"
								+ "		}catch(NoSuchElementException e) {\r\n"
								+ "			System.out.println(\"Could not find WebElement:\"+elementObject);\r\n"
								+ "		}\r\n" + "		return el.getText();\r\n" + "	}\r\n" + "\r\n"
								+ "	public Point get" + methodName + "Locator(WebDriver driver) throws Exception {\r\n"
								+ "		this.driver=driver;\r\n" + "		Point locator=null;\r\n"
								+ "		WebElement el=null;\r\n" + "		try{\r\n" + "			el=" + elementName
								+ ";\r\n" + "			locator=el.getLocation();\r\n"
								+ "		}catch(NoSuchElementException e) {\r\n"
								+ "			System.out.println(\"Could not find WebElement:\"+elementObject);\r\n"
								+ "		}\r\n" + "		return locator;\r\n" + "	}\r\n" + "\r\n"
								+ "	public WebElement get" + methodName
								+ "WebElement(WebDriver driver) throws Exception {\r\n" + "		this.driver=driver;\r\n"
								+ "		WebElement el=null;\r\n" + "		try{\r\n" + "			el=" + elementName
								+ ";\r\n" + "		}catch(NoSuchElementException e) {\r\n"
								+ "			System.out.println(\"Could not find WebElement:\"+elementObject);\r\n"
								+ "		}\r\n" + "		return el ;\r\n" + "	}\r\n");
						buffer.append("\n");

						// Added by Bhaskar for 'table'
					} else if (elementName.startsWith("tbl") && !methodName.isEmpty()
							&& buffer.indexOf(methodName) == buffer.lastIndexOf(methodName)) {
						buffer.append("	// Adding ActionMethods for 'table' element \r\n" +
								// 1
								"	public void click" + methodName
								+ "Cell(WebDriver driver, int rowNum,  int colNum) throws Exception {	\r\n"
								+ "		this.driver=driver;\r\n" + "		List<WebElement> rowTableList;\r\n"
								+ "		List<WebElement> colTableList;\r\n" + "		try{\r\n"
								+ "			rowTableList = " + elementName + ".findElements(By.tagName(\"tr\"));\r\n"
								+ "			colTableList = rowTableList.get(rowNum).findElements(By.tagName(\"td\"));\r\n"
								+ "			colTableList.get(colNum).click();\r\n"
								+ "		}catch(NoSuchElementException e) {\r\n"
								+ "			System.out.println(\"Could not find WebElement:\"+elementObject);\r\n"
								+ "		}\r\n" + "	}\r\n" + "\r\n" +

								// 2
								"	public WebElement get" + methodName
								+ "WebElement(WebDriver driver) throws Exception {	\r\n"
								+ "		this.driver=driver;\r\n" + "		WebElement el=null;\r\n"
								+ "		try{\r\n" + "			el=" + elementName + ";\r\n"
								+ "		}catch(NoSuchElementException e) {\r\n"
								+ "			System.out.println(\"Could not find WebElement:\"+elementObject);\r\n"
								+ "		}\r\n" + "		return el;\r\n" + "	}\r\n" + "\r\n" +

								// 3
								"	public String get" + methodName
								+ "CellText(WebDriver driver, int rowNum, int colNum) throws Exception {	\r\n"
								+ "		this.driver=driver;\r\n" + "		List<WebElement> rowTableList;\r\n"
								+ "		List<WebElement> colTableList;\r\n" + "		String cellText = null;\r\n"
								+ "		try{\r\n" + "			rowTableList = " + elementName
								+ ".findElements(By.tagName(\"tr\"));\r\n"
								+ "			colTableList = rowTableList.get(rowNum).findElements(By.tagName(\"td\"));\r\n"
								+ "			cellText = colTableList.get(colNum).getText();\r\n"
								+ "		}catch(NoSuchElementException e) {\r\n"
								+ "			System.out.println(\"Could not find WebElement:\"+elementObject);\r\n"
								+ "		}\r\n" + "		return cellText;\r\n" + "	}\r\n" + "\r\n" +

								// 4
								"	public String get" + methodName
								+ "CellValue(WebDriver driver, int rowNum, int colNum) throws Exception {	\r\n"
								+ "		this.driver=driver;\r\n" + "		List<WebElement> rowTableList;\r\n"
								+ "		List<WebElement> colTableList;\r\n" + "		String cellValue = null;\r\n"
								+ "		try{\r\n" + "			rowTableList = " + elementName
								+ ".findElements(By.tagName(\"tr\"));\r\n"
								+ "			colTableList = rowTableList.get(rowNum).findElements(By.tagName(\"td\"));\r\n"
								+ "			cellValue = colTableList.get(colNum).getAttribute(\"value\");\r\n"
								+ "		}catch(NoSuchElementException e) {\r\n"
								+ "			System.out.println(\"Could not find WebElement:\"+elementObject);\r\n"
								+ "		}\r\n" + "		return cellValue;\r\n" + "	}\r\n" + "\r\n" +

								// 5
								"	public List<WebElement> get" + methodName
								+ "Rows(WebDriver driver) throws Exception {	\r\n" + "		this.driver=driver;\r\n"
								+ "		List<WebElement> rowTableList = null;\r\n" + "		try{\r\n"
								+ "			rowTableList = " + elementName + ".findElements(By.tagName(\"tr\"));\r\n"
								+ "		}catch(NoSuchElementException e) {\r\n"
								+ "			System.out.println(\"Could not find WebElement:\"+elementObject);\r\n"
								+ "		}\r\n" + "		return rowTableList;\r\n" + "	}\r\n" + "\r\n" +

								// 6
								"	public int get" + methodName
								+ "RowsCount(WebDriver driver) throws Exception {	\r\n"
								+ "		this.driver=driver;\r\n" + "		List<WebElement> rowTableList;\r\n"
								+ "		int rowsCount = 0;\r\n" + "		try{\r\n" + "			rowTableList = "
								+ elementName + ".findElements(By.tagName(\"tr\"));\r\n"
								+ "			rowsCount = rowTableList.size()-1;\r\n"
								+ "		}catch(NoSuchElementException e) {\r\n"
								+ "			System.out.println(\"Could not find WebElement:\"+elementObject);\r\n"
								+ "		}\r\n" + "		return rowsCount;\r\n" + "	}\r\n" + "\r\n" +

								// 7
								"	public WebElement get" + methodName
								+ "Row(WebDriver driver, int rowNum) throws Exception {	\r\n"
								+ "		this.driver=driver;\r\n" + "		List<WebElement> rowTableList;\r\n"
								+ "		WebElement specificRow = null;\r\n" + "		try{\r\n"
								+ "			rowTableList = " + elementName + ".findElements(By.tagName(\"tr\"));\r\n"
								+ "			specificRow = rowTableList.get(rowNum);\r\n"
								+ "		}catch(NoSuchElementException e) {\r\n"
								+ "			System.out.println(\"Could not find WebElement:\"+elementObject);\r\n"
								+ "		}\r\n" + "		return specificRow;\r\n" + "	}\r\n" + "\r\n" +

								// 8
								"	public List<WebElement> get" + methodName
								+ "Cols(WebDriver driver) throws Exception {	\r\n" + "		this.driver=driver;\r\n"
								+ "		List<WebElement> rowTableList;\r\n"
								+ "		List<WebElement> colTableList = null;\r\n" + "		try{\r\n"
								+ "			rowTableList = " + elementName + ".findElements(By.tagName(\"tr\"));\r\n"
								+ "			for (int row = 0; row < rowTableList.size(); row++) {\r\n"
								+ "				colTableList = rowTableList.get(row).findElements(By.tagName(\"td\"));\r\n"
								+ "			}\r\n" + "		}catch(NoSuchElementException e) {\r\n"
								+ "			System.out.println(\"Could not find WebElement:\"+elementObject);\r\n"
								+ "		}\r\n" + "		return colTableList;\r\n" + "	}\r\n" + "\r\n" +

								// 9
								"	public int get" + methodName
								+ "ColsCount(WebDriver driver) throws Exception {	\r\n"
								+ "		this.driver=driver;\r\n" + "		List<WebElement> rowTableList;\r\n"
								+ "		List<WebElement> colTableList;\r\n" + "		int colsCount = 0;\r\n"
								+ "		try{\r\n" + "			rowTableList = " + elementName
								+ ".findElements(By.tagName(\"tr\"));\r\n"
								+ "			colTableList = rowTableList.get(0).findElements(By.tagName(\"td\"));\r\n"
								+ "			colsCount = colTableList.size();\r\n"
								+ "		}catch(NoSuchElementException e) {\r\n"
								+ "			System.out.println(\"Could not find WebElement:\"+elementObject);\r\n"
								+ "		}\r\n" + "		return colsCount;\r\n" + "	}\r\n" + "\r\n" +

								// 10
								"	public List<WebElement> get" + methodName
								+ "ColumnHeaders(WebDriver driver) throws Exception {	\r\n"
								+ "		this.driver=driver;\r\n" + "		List<WebElement> rowTableList;\r\n"
								+ "		List<WebElement> colTableHeadersList = null;\r\n" + "		try{\r\n"
								+ "			rowTableList = " + elementName + ".findElements(By.tagName(\"tr\"));\r\n"
								+ "			colTableHeadersList = rowTableList.get(0).findElements(By.tagName(\"th\"));\r\n"
								+ "			if (colTableHeadersList.size() == 0){ \r\n"
								+ "				colTableHeadersList = rowTableList.get(0).findElements(By.tagName(\"td\"));\r\n"
								+ "			}\r\n" + "		}catch(NoSuchElementException e) {\r\n"
								+ "			System.out.println(\"Could not find WebElement:\"+elementObject);\r\n"
								+ "		}\r\n" + "		return colTableHeadersList;\r\n" + "	}\r\n");
						buffer.append("\n");
					}
					// buffer.append("\n");
				} // End for loop
			} // End mthdUpdate

			buffer.append("}"); // '}' for End of class
			buffer.append("\n");

			try(FileWriter updFile = new FileWriter("./src/main/java//Wrappers/" + className)){
			updFile.write(String.valueOf(buffer));
			updFile.close();
			}

		}
	}

	private String createActionMethodForButton(String methodName, String elementName) {
		String stringToReturn;

		stringToReturn = "	// Adding ActionMethods for 'button' element \r\n" + "	public void click" + methodName
				+ "Button() throws Exception {	\r\n" + "		try{\r\n" + "			WebElement el=" + elementName
				+ ";\r\n" + "			el.click();\r\n" + "		}catch(NoSuchElementException e) {\r\n"
				+ "			System.out.println(\"Could not find WebElement:\"+elementObject);\r\n" + "		}\r\n"
				+ "	}\r\n" + "\r\n" + "	public void check" + methodName + "ButtonEnabled() throws Exception {\r\n"
				+ "		try{\r\n" + "			WebElement el=" + elementName + ";\r\n" + "			el.isEnabled();\r\n"
				+ "		}catch(NoSuchElementException e) {\r\n"
				+ "			System.out.println(\"Could not find WebElement:\"+elementObject);\r\n" + "		}\r\n"
				+ "	}\r\n" + "\r\n" + "	public String get" + methodName + "ButtonText() throws Exception {\r\n"
				+ "		WebElement el=null;\r\n" + "		try{\r\n" + "			el=" + elementName + ";\r\n"
				+ "			el.getText();\r\n" + "		}catch(NoSuchElementException e) {\r\n"
				+ "			System.out.println(\"Could not find WebElement:\"+elementObject);\r\n" + "		}\r\n"
				+ "		return el.getText();\r\n" + "	}\r\n" + "\r\n" + "	public Point get" + methodName
				+ "ButtonLocator() throws Exception {\r\n" + "		Point locator=null;\r\n"
				+ "		WebElement el=null;\r\n" + "		try{\r\n" + "			el=" + elementName + ";\r\n"
				+ "			locator=el.getLocation();\r\n" + "		}catch(NoSuchElementException e) {\r\n"
				+ "			System.out.println(\"Could not find WebElement:\"+elementObject);\r\n" + "		}\r\n"
				+ "		return locator;\r\n" + "	}\r\n" + "\r\n" + "	public WebElement get" + methodName
				+ "ButtonWebElement() throws Exception {\r\n" + "		WebElement el=null;\r\n" + "		try{\r\n"
				+ "			el=" + elementName + ";\r\n" + "		}catch(NoSuchElementException e) {\r\n"
				+ "			System.out.println(\"Could not find WebElement:\"+elementObject);\r\n" + "		}\r\n"
				+ "		return el ;\r\n" + "	}\r\n";

		return stringToReturn;
	}

	private String createActionMethodForInput(String methodName, String elementName) {
		String stringToReturn;

		stringToReturn = "	// Adding ActionMethods for 'input' element \r\n" + "	public void typeInto" + methodName
				+ "Field(String textToEnter) throws Exception {\r\n" + "		try{\r\n" + "			WebElement el="
				+ elementName + ";\r\n" + "			el.sendKeys(textToEnter);\r\n"
				+ "		}catch(NoSuchElementException e) {\r\n"
				+ "			System.out.println(\"Could not find WebElement:\"+elementObject);\r\n" + "		}\r\n"
				+ "	}\r\n" + "\r\n" + "	public void check" + methodName + "FieldIsVisible() throws Exception {\r\n"
				+ "		try{\r\n" + "			WebElement el=" + elementName + ";\r\n"
				+ "			el.isDisplayed();\r\n" + "		}catch(NoSuchElementException e) {\r\n"
				+ "			System.out.println(\"Could not find WebElement:\"+elementObject);\r\n" + "		}\r\n"
				+ "	}\r\n" + "\r\n" + "	public String get" + methodName + "FieldText() throws Exception{\r\n"
				+ "		WebElement el = null;\r\n" + "		try{\r\n" + "			el=" + elementName + ";\r\n"
				+ "			el.getText();\r\n" + "		}catch(NoSuchElementException e) {\r\n"
				+ "			System.out.println(\"Could not find WebElement:\"+elementObject);\r\n" + "		}\r\n"
				+ "		return el.getText();\r\n" + "	}\r\n" + "\r\n" + "	public Point get" + methodName
				+ "FieldLocator() throws Exception {\r\n" + "		Point locator=null;\r\n"
				+ "		WebElement el=null;\r\n" + "		try{\r\n" + "			el=" + elementName + ";\r\n"
				+ "			locator=el.getLocation();\r\n" + "		}catch(NoSuchElementException e) {\r\n"
				+ "			System.out.println(\"Could not find WebElement:\"+elementObject);\r\n" + "		}\r\n"
				+ "		return locator;\r\n" + "	}\r\n" + "\r\n" + "	public WebElement get" + methodName
				+ "FieldWebElement() throws Exception {\r\n" + "		WebElement el=null;\r\n" + "		try{\r\n"
				+ "			el=" + elementName + ";\r\n" + "		}catch(NoSuchElementException e) {\r\n"
				+ "			System.out.println(\"Could not find WebElement:\"+elementObject);\r\n" + "		}\r\n"
				+ "		return el ;\r\n" + "	}\r\n";

		return stringToReturn;
	}

	private String createActionMethodForButton(String className, String methodName, String elementName) {
		String stringToReturn;

		stringToReturn = ("public " + className + " click" + methodName + "(WebDriver driver)  {\r\n"
				+ "					BrowserActions.click(driver, " + elementName + ",\"" + methodName + "\");\r\n"
				+ "				    return this;\r\n" + "			}");

		return stringToReturn;
	}

	private String createActionMethodForInput(String className, String methodName, String elementName) {
		String stringToReturn;

		stringToReturn = ("public " + className + " enter" + methodName + "(WebDriver driver,String " + methodName
				+ ") {\r\n" // here #changed by 'Bhaskar/Sudha'\r\n"
				+ "		            BrowserActions.type(driver, " + elementName + "," + methodName + ", \"" + methodName
				+ "\");\r\n" + "			        return this;\r\n" + "           }");
		return stringToReturn;
	}

	private String createActionMethodForLabel(String methodName, String elementName) {
		String stringToReturn;

		stringToReturn = "	// Adding ActionMethods for 'label' element \r\n" + "	public String getLabelOf"
				+ methodName + "() {\r\n" + "		return BrowserActions.getText(driver, " + elementName + ", " + "\""
				+ elementName + "\"" + ");\r\n}\r\n";

		return stringToReturn;
	}

	private String createActionMethodForLink(String methodName, String elementName) {
		String stringToReturn;

		stringToReturn = "	// Adding ActionMethods for 'link' element \r\n" + "	public String getLinkOf"
				+ methodName + "() {\r\n" + "		return BrowserActions.getText(driver, " + elementName + ", " + "\""
				+ elementName + "\"" + ");\r\n}\r\n" + "public void click" + methodName + "() {\r\n"
				+ "BrowserActions.click(driver, " + elementName + ", " + "\"" + elementName + "\"" + ");\r\n}\r\n";

		return stringToReturn;
	}

	private String createActionMethodForCheckbox(String methodName, String elementName) {
		String stringToReturn;

		stringToReturn = "	// Adding ActionMethods for 'checkbox' element \r\n" + "	public void check" + methodName
				+ "() {\r\n" + "		BrowserActions.selectCheckbox(driver, " + elementName + ", " + "\""
				+ elementName + "\"" + ");\r\n}\r\n" + "	public void unCheck" + methodName + "() {\r\n"
				+ "		BrowserActions.unSelectCheckbox(driver, " + elementName + ", " + "\"" + elementName + "\""
				+ ");\r\n}\r\n";

		return stringToReturn;
	}

	public String createActionMethodForRadioButton(String methodName, String elementName) {
		String stringToReturn;

		stringToReturn = "	// Adding ActionMethods for 'radiobutton' element \r\n" + "	public void check" + methodName
				+ "() {\r\n" + "		BrowserActions.selectRadioButton(driver, " + elementName + ", " + "\""
				+ elementName + "\"" + ");\r\n}\r\n" + "	public void unCheck" + methodName + "() {\r\n"
				+ "		BrowserActions.unSelectRadioButton(driver, " + elementName + ", " + "\"" + elementName + "\""
				+ ");\r\n}\r\n";

		return stringToReturn;
	}

	private String createActionMethodForDropDown(String className, String methodName, String elementName) {
		String stringToReturn;
		stringToReturn = ("public " + className + " select" + methodName + "(WebDriver driver,String " + methodName
				+ ")  {\r\n" + "					BrowserActions.selectDropDownByVisibleText(driver, " + elementName
				+ "," + methodName + ",\"" + methodName + "\");\r\n" + "				    return this;\r\n"
				+ "			}");

		return stringToReturn;
	}
}
