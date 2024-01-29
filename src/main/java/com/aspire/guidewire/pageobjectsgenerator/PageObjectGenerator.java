package com.aspire.guidewire.pageobjectsgenerator;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.script.ScriptException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.jsonschema2pojo.DefaultGenerationConfig;
import org.jsonschema2pojo.GenerationConfig;
import org.jsonschema2pojo.Jackson2Annotator;
import org.jsonschema2pojo.SchemaGenerator;
import org.jsonschema2pojo.SchemaMapper;
import org.jsonschema2pojo.SchemaStore;
import org.jsonschema2pojo.SourceType;
import org.jsonschema2pojo.rules.RuleFactory;
import org.jsoup.nodes.Node;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aspire.guidewire.pageobjectsgenerator.pojo.Input;
import com.aspire.guidewire.utils.Log;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.codemodel.JCodeModel;

import edu.umd.cs.findbugs.annotations.SuppressWarnings;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PageObjectGenerator {

	String nav;
	WebDriver driver;
	LinkedHashMap<String, String> mapSecondaryLnkTxts;
	LinkedHashMap<String, String> mapAlteredSecondaryLnkTxts;
	LinkedHashMap<String, String> mapPrimaryLnkTxts;
	LinkedHashMap<String, String> mapATags;
	PrimarySecondaryMaps mapAllPageObjects;
	Map<String, String> attributeName = new LinkedHashMap<>();
	String doc;
	String headingText = null;
	String pageName;
	String pobj;
	boolean setJframe = true;
	Map<String, String> objBeforeRefresh;
	Map<String, String> objAfterRefresh;
	ArrayList<Map<String, String>> frameObjBeforeRefresh = null;
	ArrayList<Map<String, String>> frameObjAfterRefresh = null;
	boolean webPageElements = false;
	String refershedObj;
	String refreshedPage;
	int getIndex;
	String getMapValue;
	LinkedHashMap<String, String> allObjects = new LinkedHashMap<>();
	ArrayList<Map<String, String>> alfObjectsAfterRefersh = new ArrayList<Map<String, String>>();
	Map<String, Map<String, String>> frameElementsBeforeRefresh = new LinkedHashMap<String, Map<String, String>>();
	Map<String, Map<String, String>> frameElementsWithIndexBeforeRefresh = new LinkedHashMap<String, Map<String, String>>();
	Map<String, Map<String, String>> frameElementsAfterRefresh = new LinkedHashMap<String, Map<String, String>>();
	Map<String, Map<String, String>> frameElementsWithIndexAfterRefresh = new LinkedHashMap<String, Map<String, String>>();

	@BeforeTest
	public void setUP() {
		//		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		//		driver= new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		String url = System.getProperty("webSite") != null ? System.getProperty("webSite")
				: Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("webSite");
		driver.get(url);
		driver.manage().window().maximize();
	}

	@Test
	public void mainMethod() throws Exception {
		mapPrimaryLnkTxts = new LinkedHashMap<String, String>();
		mapATags = new LinkedHashMap<String, String>();
		mapSecondaryLnkTxts = new LinkedHashMap<String, String>();
		int firstTime = 0;
		if (setJframe) {
			JFrame jf = new JFrame();
			jf.setAlwaysOnTop(true);
			int dialogButton = JOptionPane.showConfirmDialog(jf,
					"Do you want to generate page objects for current page?", "WARNING", JOptionPane.YES_NO_OPTION);
			while (dialogButton == JOptionPane.YES_OPTION) {
				firstTime++;
				if (firstTime == 1) {
					pageName = JOptionPane.showInputDialog(jf, "Please enter the page name");
					// doc = getPageSource(driver);
					pobj = createPageObjectsJS(driver);
					objBeforeRefresh = interpretJS(pobj);
					// Get all the frame objects - Added by Sudha
					getFrameObjects(frameElementsBeforeRefresh, frameElementsWithIndexBeforeRefresh);

					try {
						refershPage();
					} catch (Exception e) {
						System.out.println(e);
					}
					if (webPageElements)
						writeToExcel(pageName, objBeforeRefresh);
					else
						writeToExcel(pageName, allObjects);

					if (alfObjectsAfterRefersh.size() != 0)
						writeFrameData(pageName, alfObjectsAfterRefersh);

				} else {

					dialogButton = JOptionPane.showConfirmDialog(jf,
							"Do you want to generate page objects for current page?", "WARNING",
							JOptionPane.YES_NO_OPTION);
					if (dialogButton == JOptionPane.NO_OPTION) {
						break;
					} else {
						pageName = JOptionPane.showInputDialog(jf, "Please enter the page name");
						pobj = createPageObjectsJS(driver);
						objBeforeRefresh = interpretJS(pobj);
						// Added by Sudha

						clearFrameObjects();
						getFrameObjects(frameElementsAfterRefresh, frameElementsWithIndexAfterRefresh);

						try {
							refershPage();
						} catch (Exception e) {
							System.out.println(e);
						}
						if (webPageElements)
							writeToExcel(pageName, objBeforeRefresh);
						else
							writeToExcel(pageName, allObjects);

						if (alfObjectsAfterRefersh.size() != 0)
							writeFrameData(pageName, alfObjectsAfterRefersh);
					}
				}
			}
		}
	}

	private void clearFrameObjects() {
		alfObjectsAfterRefersh.clear();
		frameElementsBeforeRefresh.clear();
		frameElementsWithIndexBeforeRefresh.clear();
		frameElementsAfterRefresh.clear();
		frameElementsWithIndexAfterRefresh.clear();

	}

	private void writeFrameData(String pageName, ArrayList<Map<String, String>> frameObj) throws Exception {
		if (frameObj != null) {
			int i = 0;
			XSSFWorkbook workbook = getWorkBook();
			XSSFSheet sheet = workbook.getSheet(pageName);
			
			if (sheet != null) {
			Map<Integer, Object[]> header = new LinkedHashMap<Integer, Object[]>();
			generateExcelHeadersForFrame(header);
			setCellValues(sheet, header, 0);
			writeToFile(workbook);
			
			for (Map<String, String> framepage : frameObj) {
				Map<Integer, Object[]> data = new LinkedHashMap<Integer, Object[]>();
				int j = sheet.getLastRowNum() + 1, k = sheet.getLastRowNum() + 1;
				generateExcelValues(framepage, data, j, k, "Frame" + i);
				setCellValues(sheet, data, sheet.getLastRowNum() + 1);
				writeToFile(workbook);
				i++;
			 }
	        } else {
	            // Handle the case when sheet is null
	            throw new Exception("Sheet is null for page: " + pageName);
	        }
		}
	}

	private Map<String, String> getFrameElements(WebElement iframe) {
		try {
			driver.switchTo().frame(iframe);
			String frameObject = createPageObjectsJS(driver);
			Map<String, String> frameElements = interpretJS(frameObject);
			driver.switchTo().parentFrame();
			return frameElements;
		} catch (Exception e) {
			return null;
		}

	}

	private void getFrameObjects(Map<String, Map<String, String>> frameObjects1,
			Map<String, Map<String, String>> frameObjects2) {

		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		try {
			int frameIndex = 0;
			for (WebElement iframe : frames) {
				String frameKey = "";
				String frameID = iframe.getAttribute("id");
				if (!frameID.equals("")) {
					frameKey = "id_" + frameID;
					Map<String, String> frameElements = getFrameElements(iframe);
					if (frameElements != null)
						frameObjects1.put(frameKey, frameElements);
					continue;
				}

				String frameName = iframe.getAttribute("name");
				if (!frameName.equals("")) {
					frameKey = "name_" + frameName;
					Map<String, String> frameElements = getFrameElements(iframe);
					if (frameElements != null)
						frameObjects1.put(frameKey, frameElements);
					continue;
				}

				String frameSrc = iframe.getAttribute("src");
				if (!frameSrc.equals("")) {
					frameKey = "src_" + frameSrc;
					Map<String, String> frameElements = getFrameElements(iframe);
					if (frameElements != null)
						frameObjects1.put(frameKey, frameElements);
					continue;
				}

				frameKey = "index_" + frameIndex;
				Map<String, String> frameElements = getFrameElements(iframe);
				if (frameElements != null)
					frameObjects2.put(frameKey, frameElements);
				frameIndex++;

			}

		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println("Frame Objects1 : " + frameObjects1 + "******" + "Frame Objects2 : " + frameObjects2);

	}

	@AfterTest
	public void closeDriver() {
		driver.quit();
	}

	public String getPageSource(WebDriver driver) {
		String doc = null;
		doc = driver.getPageSource();
		return doc;
	}

	@SuppressWarnings("finally")
	public String createPageObjectsJS(WebDriver driver) throws IOException, ScriptException, NoSuchMethodException {
		String po = null;
		try {
			// String jsContent = com.google.common.io.Files.toString(
			// new File("src/main/java/ASPIREAI/intelligentalgorithm/mainSource.js"),
			// com.google.common.base.Charsets.UTF_8);
			//String jsContent = JsToString.getMainSource();

			File file = new File("src\\main\\java\\ASPIREAI\\intelligentalgorithm\\mainSourceGW.js");
			try {
				// Read the entire contents of sample.txt
				String content = FileUtils.readFileToString(file, "UTF-8");
				// System.out.println("File content: " + content);
				po = (String) ((JavascriptExecutor) driver).executeScript(content);
			} catch (IOException e) {
				try {
					Log.exception(e);
				} catch (Exception logException) {
					// TODO Auto-generated catch block
					System.err.println("Exception: " + e.getMessage());	
			}
			}

			//			String source = driver.getPageSource();
			//po = (String) ((JavascriptExecutor) driver).executeScript(jsContent);
			// System.out.println(po);

		} catch (Exception name) {
			System.out.println("Exception from createPageObjectJS" + name);
		} finally {

		}
		return po;
	}

	public void convert2JSON(URL inputJson, File outputPojoDirectory, String packageName, String className)
			throws IOException {
		JCodeModel codeModel = new JCodeModel();
		URL source = inputJson;
		GenerationConfig config = new DefaultGenerationConfig() {
			@Override
			public boolean isGenerateBuilders() { // set config option by overriding method
				return true;
			}

			public SourceType getSourceType() {
				return SourceType.JSON;
			}
		};
		SchemaMapper mapper = new SchemaMapper(
				new RuleFactory(config, new Jackson2Annotator(config), new SchemaStore()), new SchemaGenerator());
		mapper.generate(codeModel, className, packageName, source);
		codeModel.build(outputPojoDirectory);
	}

	public Map<String, String> interpretJS(String inp) throws ParseException, IOException { // Updated by Sudha to
		// return attributeName
		String packageName = "com.learningservices.pageobjectsgenerator.pojo";
		JSONParser parser = new JSONParser();
		JSONObject json = (JSONObject) parser.parse(inp);
		try(FileWriter file = new FileWriter("src/main/resources/input.json"))
		{
		file.write(json.toJSONString());
		file.close();

		attributeName = new LinkedHashMap<>();
		/*
		 * File inputJson= new File("src/main/java/com/aspire/input.json"); File
		 * outputPojoDirectory=new
		 * File("src/main/java/com/aspire/pageobjectsgenerator/pojo");
		 * outputPojoDirectory.mkdirs();
		 */
		try {
			// convert2JSON(inputJson.toURI().toURL(), outputPojoDirectory, packageName,
			// inputJson.getName().replace(".json", ""));
			byte[] jsonData = json.toString().getBytes("UTF-8");
			String jsonString = json.toString();
			ObjectMapper mapper = new ObjectMapper();
			Input baseInp = null;
			baseInp = mapper.readValue(jsonData, Input.class);
			// System.out.println("BaseInp------------" + baseInp);
			Iterator iterator = baseInp.definitions.listIterator();
			int defSize = baseInp.definitions.size();

			for (int i = 0; i < defSize; i++) {
				if (baseInp.definitions.get(i).getAttribute().getValue() != null) {
					attributeName.put(
							customizeType(baseInp.definitions.get(i).getType())
							+ StringUtils.capitalize(baseInp.definitions.get(i).getAttribute().getName()),
							baseInp.definitions.get(i).getAttribute().getStrategy() + "|"
									+ baseInp.definitions.get(i).getAttribute().getValue());
					// System.out.println("attributeName-------------" + attributeName);
				}
			}
			int elCount = 0;
			for (Entry<String, String> entry : attributeName.entrySet()) {
				String key = entry.getKey();
				String value = entry.getValue();
				// System.out.println("attribute name: " + key + " value: " + value);
				elCount++;
			}
			// System.out.println("parse count is " + elCount + " js ele count is " +
			// defSize);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Encountered issue while converting to pojo: " + e.getMessage());
			try {
				Log.exception(e);
			} catch (Exception logException) {
				// TODO Auto-generated catch block
				System.err.println("Exception: " + e.getMessage());	
		}
		}
		return attributeName;
		}
	}

	public void removeComments(Node node) {
		// as we are removing child nodes while iterating, we cannot use a normal
		// foreach over children,
		// or will get a concurrent list modification error.
		int i = 0;
		while (i < node.childNodes().size()) {
			Node child = node.childNode(i);
			if (child.nodeName().equals("#comment"))
				child.remove();
			else {
				removeComments(child);
				i++;
			}
		}
	}

	public void writeToExcel(String sheetName, Map<String, String> excelValues) throws Exception {

		XSSFWorkbook workbook = getWorkBook();
		XSSFSheet sheet = getSheet(sheetName, workbook);

		if (sheet!=null) {
			// This data needs to be written (Object[])
			Map<Integer, Object[]> data = new LinkedHashMap<Integer, Object[]>();
			generateExcelHeaders(data);
			int j = 1, i = 1;
			generateExcelValues(excelValues, data, j, i, "");
			int rownum = 0;
			setCellValues(sheet, data, rownum);
			writeToFile(workbook);
		}

	}

	private void writeToFile(XSSFWorkbook workbook) {
		try {
			FileOutputStream out = new FileOutputStream(
					new File("./src/main/resources/pageobjectsoutput/PageObjects.xlsx"));
			workbook.write(out);
			out.close();
		} catch (Exception e) {
			try {
				Log.exception(e);
			} catch (Exception logException) {
				// TODO Auto-generated catch block
				System.err.println("Exception: " + e.getMessage());	
		}		}
	}

	private void generateExcelHeaders(Map<Integer, Object[]> data) {
		data.put(1, new Object[] { "S.No", "Element Display Name", "Manually Updated Element Name",
				"Generated Element Locator", "Manually Updated Element Locator", "Select", "Category", "Comments" });
	}

	private void generateExcelHeadersForFrame(Map<Integer, Object[]> data) {
		data.put(1,
				new Object[] { "S.No", "Element Display Name", "Manually Updated Element Name",
						"Generated Element Locator", "Manually Updated Element Locator", "Select", "Category",
						"Comments", "Frame" });
	}

	private XSSFSheet getSheet(String sheetName, XSSFWorkbook workbook) {
		XSSFSheet sheet = null;

		if (workbook.getNumberOfSheets() != 0) {
			for (int i = 0; i < workbook.getNumberOfSheets(); i++) {
				if (workbook.getSheetName(i).equals(sheetName)) {
					sheet = workbook.getSheet(sheetName);
				} else {
					sheet = workbook.createSheet(sheetName);
					break;
				}
			}
		} else {
			// Create new sheet to the workbook if empty
			sheet = workbook.createSheet(sheetName);
		}
		return sheet;
	}

	private XSSFWorkbook getWorkBook() throws FileNotFoundException, IOException {
		XSSFWorkbook workbook;
		File file = new File("./src/main/resources/pageobjectsoutput/PageObjects.xlsx");
		try {
			if (!file.exists()) { // to create a new workbook
				workbook = new XSSFWorkbook();
			} else { // to use an existing workbook
				try (InputStream is = new FileInputStream(file)) {
					workbook = new XSSFWorkbook(is);
				}
			}
		} catch (IOException e) {
			// Handle the exception (e.g., log it, throw a custom exception, etc.)
			throw new RuntimeException("Error while creating or reading the workbook", e);
		}

		return workbook;
	}

	private void setCellValues(XSSFSheet sheet, Map<Integer, Object[]> data, int rownum) {
		if(sheet!=null) {
			for (Object key : data.keySet()) {
				// this creates a new row in the sheet
				Row row = sheet.createRow(rownum++);
				Object[] objArr = data.get(key);
				int cellnum = 0;
				for (Object obj : objArr) {
					// this line creates a cell in the next column of that row

					Cell cell = row.createCell(cellnum++);
					if (obj instanceof String)
						cell.setCellValue((String) obj);
					else if (obj instanceof Integer)
						cell.setCellValue((Integer) obj);
				}
			}
		}
	}

	private void generateExcelValues(Map<String, String> excelValues, Map<Integer, Object[]> data, int j, int i,
			String frameName1) {
		// System.out.println("Data with column names alone----------" + data);
		for (Entry<String, String> entry : excelValues.entrySet()) {
			if (entry.getKey().endsWith("SecondReference") || entry.getValue().endsWith("ThirdReference")) {
				continue;
			}

			String comment = "";
			String frameName = "";

			getMapValue = entry.getValue();

			if (getMapValue.contains("frameName=")) {
				int index = entry.getValue().toString().indexOf("frameName=");
				String frameIdentifier = getMapValue.substring(index);
				frameName = frameIdentifier.split("=")[1];
				// System.out.println(frameName);
				getMapValue = getMapValue.substring(0, index);
			}

			if (getMapValue.endsWith("Dynamic web element")) {
				getIndex = entry.getValue().toString().indexOf("Dynamic web element");
				getMapValue = entry.getValue().toString().substring(0, getIndex);
				comment = "Dynamic web element";
			}

			if (getMapValue.endsWith("FrameBeforeRefresh")) {
				getIndex = entry.getValue().toString().indexOf("FrameBeforeRefresh");
				getMapValue = entry.getValue().toString().substring(0, getIndex);
				comment = "FrameBeforeRefresh";
			}

			if (getMapValue.endsWith("FrameAfterRefresh")) {
				getIndex = entry.getValue().toString().indexOf("FrameAfterRefresh");
				getMapValue = entry.getValue().toString().substring(0, getIndex);
				comment = "FrameAfterRefresh";
			}

			String category = "";
			if (entry.getKey().startsWith("lnk")) {
				category = "Link";
			} else if (entry.getKey().startsWith("lbl")) {
				category = "Label";
			} else if (entry.getKey().startsWith("inp")) {
				category = "Input";
			} else if (entry.getKey().startsWith("btn")) {
				category = "Button";
			} else if (entry.getKey().startsWith("drp")) {
				category = "Drop Down";
			} else if (entry.getKey().startsWith("chk")) {
				category = "CheckBox";
			} else if (entry.getKey().startsWith("rdb")) {
				category = "radio";
			} else if (entry.getKey().startsWith("tbl")) {
				category = "Table"; // Added by Bhaskar
			} else {
				category = "Other";
			}

			data.put(j + 1,
					new Object[] { i++, entry.getKey(), "", getMapValue, "", "Yes", category, comment, frameName });

			j++;
		}
	}

	private String customizeType(String input) {
		String output = null;
		switch (input) {
		case "label":
			// Label
			output = "lbl";
			break;

		case "text":
			// input field
			output = "txt";
			break;

		case "button":
			// button
			output = "btn";
			break;

		case "link":
			// link
			output = "lnk";
			break;

		case "select":
			// select drop down
			output = "sel";
			break;

		case "checkbox":
			// checkboxes
			output = "chk";
			break;

		case "radio":
			// radion box
			output = "rdb";
			break;

			// Added by Bhaskar
		case "table":
			// web table
			output = "tbl";
			break;

		default:
			// default as others
			output = "otr";
			break;
		}
		return output;
	}

	public void compareMaps(Map<String, String> map1, Map<String, String> map2, Map<String, String> mapToAdd) {
		for (Map.Entry<String, String> hm : map1.entrySet()) {
			String[] hmKeys = hm.toString().split("=", 2);
			if (map2.containsKey(hmKeys[0]) && !(map2.containsValue(hmKeys[1]))) {
				mapToAdd.put(hmKeys[0], hmKeys[1] + "Dynamic web element");
			} else {
				mapToAdd.put(hmKeys[0], hmKeys[1]);
			}
		}
	}

	public void refershPage() throws NoSuchMethodException, IOException, ScriptException, ParseException {

		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		refershedObj = createPageObjectsJS(driver);
		objAfterRefresh = interpretJS(refershedObj);
		getFrameObjects(frameElementsAfterRefresh, frameElementsWithIndexAfterRefresh);
		// System.out.println("frameElementsAfterRefresh = " +
		// frameElementsAfterRefresh);
		// System.out.println("frameElementsWithIndexAfterRefresh = " +
		// frameElementsWithIndexAfterRefresh);
		compareElements();

	}

	private void compareElements() {
		// System.out.println("Inside compareElements");
		if (objBeforeRefresh.equals(objAfterRefresh)) {
			webPageElements = true;
		} else {
			webPageElements = false;
			compareMaps(objBeforeRefresh, objAfterRefresh, allObjects);
			compareMaps(objAfterRefresh, objBeforeRefresh, allObjects);
		}

		if (!frameElementsBeforeRefresh.isEmpty() || !frameElementsAfterRefresh.isEmpty()
				|| !frameElementsWithIndexBeforeRefresh.isEmpty() || !frameElementsWithIndexAfterRefresh.isEmpty()) {
			compareFrameElements();
		}

	}

	private void compareFrameElements() {

		Set<String> frameKeysBeforeRefresh = frameElementsBeforeRefresh.keySet();
		Set<String> frameKeysAfterRefresh = frameElementsAfterRefresh.keySet();

		if (frameKeysBeforeRefresh.equals(frameKeysAfterRefresh)) {

			// frames are same. compare all frames
			for (String key : frameKeysBeforeRefresh) {

				Map<String, String> resultMap = new LinkedHashMap<String, String>();
				compareMaps(frameElementsBeforeRefresh.get(key), frameElementsAfterRefresh.get(key), resultMap);
				addComment(resultMap, "frameName=" + key);
				alfObjectsAfterRefersh.add(resultMap);
			}

		} else {
			// frames are different

			List<String> combinedFrameKeys = new ArrayList<>(frameElementsBeforeRefresh.keySet());

			for (String key : frameKeysAfterRefresh) {
				if (!combinedFrameKeys.contains(key)) {
					combinedFrameKeys.add(key);
				}
			}

			for (String key : combinedFrameKeys) {

				if (frameKeysBeforeRefresh.contains(key) && frameKeysAfterRefresh.contains(key)) {
					Map<String, String> resultMap = new LinkedHashMap<String, String>();
					compareMaps(frameElementsBeforeRefresh.get(key), frameElementsAfterRefresh.get(key), resultMap);
					addComment(resultMap, "frameName=" + key);
					alfObjectsAfterRefersh.add(resultMap);

				}

				else if (frameKeysBeforeRefresh.contains(key)) {
					Map<String, String> frameObject = frameElementsBeforeRefresh.get(key);
					addComment(frameObject, "FrameBeforeRefresh");
					addComment(frameObject, "frameName=" + key);
					// System.out.println("FrameBeforeRefresh = " + frameObject);
					alfObjectsAfterRefersh.add(frameObject);

				} else {
					Map<String, String> frameObject = frameElementsAfterRefresh.get(key);
					addComment(frameObject, "FrameAfterRefresh");
					addComment(frameObject, "frameName=" + key);
					// System.out.println("FrameAfterRefresh = " + frameObject);
					alfObjectsAfterRefersh.add(frameElementsAfterRefresh.get(key));
				}
			}

		}

		if (frameElementsWithIndexBeforeRefresh.equals(frameElementsWithIndexAfterRefresh)) {
			// same number of frames

			for (String key : frameElementsWithIndexBeforeRefresh.keySet()) {
				Map<String, String> resultMap = new LinkedHashMap<String, String>();
				compareMaps(frameElementsWithIndexBeforeRefresh.get(key), frameElementsWithIndexAfterRefresh.get(key),
						resultMap);
				addComment(resultMap, "frameName=" + key);
				alfObjectsAfterRefersh.add(resultMap);
			}
		} else {
			if (frameElementsWithIndexBeforeRefresh.size() > frameElementsWithIndexAfterRefresh.size()) {
				// Before Refresh has more frames

				for (String key : frameElementsWithIndexBeforeRefresh.keySet()) {
					Map<String, String> frameObject = frameElementsWithIndexBeforeRefresh.get(key);
					addComment(frameObject, "FrameBeforeRefresh");
					addComment(frameObject, "frameName=" + key);
					alfObjectsAfterRefersh.add(frameObject);
				}

			} else {
				// After Refresh has more frames

				for (String key : frameElementsWithIndexAfterRefresh.keySet()) {
					Map<String, String> frameObject = frameElementsWithIndexAfterRefresh.get(key);
					addComment(frameObject, "FrameAfterRefresh");
					addComment(frameObject, "frameName=" + key);
					alfObjectsAfterRefersh.add(frameObject);
				}
			}

		}
	}

	private void addComment(Map<String, String> pageObject, String comment) {
		for (String key : pageObject.keySet()) {
			pageObject.put(key, pageObject.get(key) + comment);
		}
	}

}
