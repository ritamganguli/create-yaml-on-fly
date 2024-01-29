package com.aspire.guidewire.pageobjectsgenerator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.commons.lang.WordUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.xml.sax.SAXException;

import com.aspire.guidewire.pc.pages.common.LoginPage;
import com.aspire.guidewire.pc.pages.common.MySummaryPage;
import com.aspire.guidewire.utils.BrowserActions;
import com.aspire.guidewire.utils.Log;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageObjectGeneratorGW {
	WebDriver driver;

	private By byCollapser = By.className("collapser");
	private String locatorTableBody = ".schemaTable>tbody";
	private String locatorTableRow = "tr";
	private String locatorWdigetName = "th>.linker,th";
	private String locatorId = "td:nth-last-child(4)";
	private String locatorRenderId = "td:nth-last-child(3)";
	private String locatorFile = "td:nth-last-child(2)";
	private String locatorLabel = "td:nth-last-child(1)";

	Map<String, String> locatorKeyValue = new HashMap<String, String>();
	String pageName;

	@BeforeTest
	public void setUP() {
		//
		//		WebDriverManager.chromedriver().setup();
		//		DesiredCapabilities dc=new DesiredCapabilities();
		ChromeOptions chromeOpt=new ChromeOptions();
		//		co.addArguments("--remote-allow-origins=*");
		//		dc.setCapability(ChromeOptions.CAPABILITY, co);
		//		co.merge(dc);
		//		driver=new ChromeDriver(co);

		chromeOpt.addArguments("--start-maximized");
		chromeOpt.addArguments("--disable-web-security");
		// chromeOpt.setExperimentalOption("w3c", true);
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("credentials_enable_service", false);
		prefs.put("profile.password_manager_enabled", false);
		chromeOpt.setExperimentalOption("prefs", prefs);
		chromeOpt.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(chromeOpt);
		driver.manage().window().maximize();

		String url = System.getProperty("webSite") != null ? System.getProperty("webSite")
				: Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("webSite");
		driver.get(url);
		driver.manage().window().maximize();
	}

	@Test
	public void execute() {
		loginToGW();

		JFrame jf = new JFrame();
		jf.setAlwaysOnTop(true);
		int dialogButton;
		do {
			dialogButton = JOptionPane.showConfirmDialog(jf, "Do you want to generate page objects for current page?",
					"PCF Utility- Page Scrapper", JOptionPane.YES_NO_OPTION);
			if (dialogButton == JOptionPane.YES_OPTION) {
				pageName = JOptionPane.showInputDialog(jf, "Please enter the page name");
				navigateToPCF();
				switchToSecondWindow();
				expandAllTable();

				iterateRows(0, "");
			}
		} while (dialogButton == JOptionPane.YES_OPTION);

		if (dialogButton == JOptionPane.NO_OPTION) {
			// generate locators and POM for top menu bar
			dialogButton = JOptionPane.showConfirmDialog(jf,
					"Top Navigation Menu Bar - Do you want to generate page objects?",
					"PCF Utility- TopNavBar Scrapper", JOptionPane.YES_NO_OPTION);
			if (dialogButton == JOptionPane.YES_OPTION) {
				pageName = Constants.TOPNAVBAR;
				navigateToPCF();
				switchToSecondWindow();
				expandAllTable();

				iterateRows(1, Constants.TOPNAVBAR);
			}
		}

		if (dialogButton == JOptionPane.YES_NO_OPTION || dialogButton == JOptionPane.YES_NO_CANCEL_OPTION) {
			// generate locators and POM for top menu bar
			dialogButton = JOptionPane.showConfirmDialog(jf, "Left Menu Bar - Do you want to generate page objects?",
					"PCF Utility- LeftMenuBar Scrapper", JOptionPane.YES_NO_OPTION);
			if (dialogButton == JOptionPane.YES_OPTION) {
				pageName = JOptionPane.showInputDialog(jf, "Please enter the MenuBar name");
				navigateToPCF();
				switchToSecondWindow();
				expandAllTable();

				iterateRows(2, "");
			}
		}

	}

	private void iterateRows(int tableIndex, String tabBar) {
		List<GuidewirePageStructure> guidewirePageStructure = new ArrayList<GuidewirePageStructure>();
		Map<String, List<GuidewirePageStructure>> tableMap = new LinkedHashMap<String, List<GuidewirePageStructure>>();
		List<GuidewirePageStructure> guidewirePageStructureTable = new ArrayList<GuidewirePageStructure>();

		// using JSoup to parse HTML table
		Document document = Jsoup.parse(driver.getPageSource().toString());

		Elements tables = document.select(locatorTableBody);

		String fileName = null;
		List<String> tableNames = new ArrayList<String>();

		for (int j = tableIndex; j < tables.size(); j++) {
			Element table = tables.get(tableIndex);
			Elements tableRows = table.select(locatorTableRow);

			// split web tables and elements
			// for (Element tableRow : tableRows) {
			for (int i = 0; i < tableRows.size(); i++) {
				try {
					Element tableRow = tableRows.get(i);
					String widget = tableRow.select(locatorWdigetName).get(0).text().trim();
					String id = tableRow.select(locatorId).get(0).text().trim();
					String renderID = tableRow.select(locatorRenderId).get(0).text().trim();
					String file = tableRow.select(locatorFile).get(0).text().trim().split(":")[0];
					String label = tableRow.select(locatorLabel).get(0).text().trim();

					if (widget.equals(GuidewireTags.CARDTAB)) {
						System.out.println("s");
					}

					if (Constants.TOPNAVBAR.equals(tabBar)) {
						// find the 'ListView' widget name and get it's file name
						if (widget.equals(GuidewireTags.MENUITEM)) {
							if ((i - 1) != 0) {
								if (tableRows.get(i - 1).select(locatorWdigetName).get(0).text().trim()
										.equals(GuidewireTags.ITERATORENTRY)) {
									// ignore this entry
								} else {
									guidewirePageStructure
									.add(new GuidewirePageStructure(widget, id, renderID, file, label)); // elements
								}
							}
						} else {
							if (widget.equalsIgnoreCase(GuidewireTags.TAB)) { // add two entries of tab- 1.tab and
								// 2.expandIcon
								guidewirePageStructure
								.add(new GuidewirePageStructure(widget, id, renderID, file, label));
								guidewirePageStructure
								.add(new GuidewirePageStructure(widget + "Expand", id, renderID, file, label));
							}
						}
					} else {
						// find the 'ListView' widget name and get it's file name
						if (widget.equals(GuidewireTags.Table.LISTVIEW)) {

							if (fileName == null) {
								fileName = file;
								tableNames.add(fileName);
							} else {
								tableMap.put(fileName, guidewirePageStructureTable);
								fileName = file;
								tableNames.add(fileName);
								guidewirePageStructureTable = new ArrayList<GuidewirePageStructure>();
							}
						}
					}

					if (!Constants.TOPNAVBAR.equals(tabBar)) {
						if (file.equals(fileName)) {
							if (widget.equalsIgnoreCase(GuidewireTags.CARDTAB))
								guidewirePageStructure
								.add(new GuidewirePageStructure(widget, id, renderID, file, label)); // cardTab
							// element
							else
								guidewirePageStructureTable
								.add(new GuidewirePageStructure(widget, id, renderID, file, label)); // web
							// tables
						}
						// DATEVALUE
						if (widget.equalsIgnoreCase(GuidewireTags.DATEVALUE)) { // add two entries of DATEVALUE-
							// 1.DATEVALUE label and
							// 2.DATEVALUE Icon
							guidewirePageStructure.add(new GuidewirePageStructure(widget, id, renderID, file, label));
							guidewirePageStructure
							.add(new GuidewirePageStructure(widget + "Icon", id, renderID, file, label));
						} else
							guidewirePageStructure.add(new GuidewirePageStructure(widget, id, renderID, file, label)); // elements
					}
				} catch (Exception e) {

				}
			}

			if (tableIndex < 2)
				break;
		}

		if (tableIndex == 2) {
			try {
				List<String> menuLocators = parseXMLForActionsMenu(driver);

				for (String obj : menuLocators) {
					String[] nameWithLocator = obj.split("\\|\\|");
					String name = nameWithLocator[0];
					String locator = nameWithLocator[1];
					if (name.equalsIgnoreCase(GuidewireTags.ActionsMenu.MENUACTIONS))
						guidewirePageStructure.add(new GuidewirePageStructure(GuidewireTags.ActionsMenu.MENUACTIONS,
								name, locator, "", name));
					else
						guidewirePageStructure.add(new GuidewirePageStructure(GuidewireTags.ActionsMenu.MENUITEMS, name,
								locator, "", name));
				}

			} catch (Exception e) {
				try {
					Log.exception(e);
				} catch (Exception logException) {
					// TODO Auto-generated catch block
					System.err.println("Exception: " + e.getMessage());	
			}			}
		}

		// check all table are pushed to map entry
		if (!(tableMap.containsKey(fileName))) {
			if (fileName != null)
				tableMap.put(fileName, guidewirePageStructureTable);
			// guidewirePageStructureTable.clear();
		}

		// process web tables
		processWebTables(tableMap);

		// process HTML elements
		processHTMLElements(guidewirePageStructure);

		// write locators to excel
		flushDataToExcel(pageName);

		switchToDefaultContent();

		cleanUpLocatorMapping();
	}

	private List<String> parseXMLForActionsMenu(WebDriver driver)
			throws ParserConfigurationException, SAXException, IOException {

		List<WebElement> links = driver.findElements(By.tagName("a"));
		for (WebElement link : links) {
			String linkText = link.getText().trim();
			if (linkText.endsWith("MenuActions.pcf")) {
				BrowserActions.click(driver, link, linkText);
				break;
			}
		}

		List<String> actionsMenuList = new ArrayList<String>();
		Document document = Jsoup.parse(driver.getPageSource().toString());

		String actionsMenu = document.getElementsByTag(GuidewireTags.ActionsMenu.MENUACTIONS).get(0).attr("id")
				.toString().trim();
		actionsMenuList.add(GuidewireTags.ActionsMenu.MENUACTIONS + "||" + actionsMenu);
		Elements menuItems = document.getElementsByTag("MenuItem");
		for (Element element : menuItems) {
			String locator = element.attr("id").toString().trim();
			String name = element.attr("label").toString().trim();
			String[] names = name.split("\\.");
			name = names[names.length - 1];
			name = name.replaceAll("\\W+", "");
			actionsMenuList.add(name + "||" + locator);
		}

		return actionsMenuList;
	}

	/***
	 * Process web tables content and get's element locators out of it
	 * 
	 * @author magesh.nagamani
	 * @since 24-01-2023
	 * @param tableMap
	 */
	private void processWebTables(Map<String, List<GuidewirePageStructure>> tableMap) {

		// get Header and first row content
		tableMap.entrySet().forEach(tableData -> {
			System.out.println("-----------------------------------------------------------------------------");
			String currentTableName = tableData.getKey().split("ListViewTile")[0];
			System.out.println(currentTableName);
			Map<String, List<GuidewirePageStructure>> tableHeaderAndContentRows = getTableHeaderAndFirstRow(
					tableData.getValue());

			// get table associated dropdown
			tableData.getValue().forEach(obj -> {
				if (obj.getWidget().equalsIgnoreCase(GuidewireTags.Table.TOOLBARFILTERVALUE)) {

					String locator = getLocatorForElement(obj);
					if (locator != null) {
						String[] splitNameAndLocator = locator.split("\\|\\|");
						String currentElementName = splitNameAndLocator[0];
						locatorKeyValue.put(currentElementName, splitNameAndLocator[1]);
						System.out.println(locator);
					}
				}

			});

			// print header
			tableHeaderAndContentRows.entrySet().forEach(e -> {
				System.out.println("*******************************");
				System.out.println(e.getKey());
				if (e.getKey().equalsIgnoreCase("Header")) {
					e.getValue().forEach(obj -> {

						if (!(obj.getWidget().equalsIgnoreCase(GuidewireTags.Table.HEADERCELL)
								|| obj.getWidget().equalsIgnoreCase(GuidewireTags.Table.CELL)))
							if (getLocatorForTable(obj) != null)
								locatorKeyValue.put(
										"tblH|" + getPrefixForTable(obj) + obj.getId() + "||" + currentTableName,
										"css|" + getLocatorForTable(obj));

					});
				} else {
					e.getValue().forEach(obj -> {

						if (!(obj.getWidget().equalsIgnoreCase(GuidewireTags.Table.HEADERCELL)
								|| obj.getWidget().equalsIgnoreCase(GuidewireTags.Table.CELL)))
							if (getLocatorForTable(obj) != null)
								locatorKeyValue.put(
										"tblR|" + getPrefixForTable(obj) + obj.getId() + "||" + currentTableName,
										"css|" + getLocatorForTable(obj));

					});
				}
			});
		});

		System.out.println("--------------------------------------END---------------------------------------");

	}

	/**
	 * Process element locators for All HTML elements except table
	 * 
	 * @author magesh.nagamani
	 * @since 24-01-2023
	 * @param guidewirePageStructure
	 */
	private void processHTMLElements(List<GuidewirePageStructure> guidewirePageStructure) {
		System.out
		.println("-----------------------------------HTML Locators------------------------------------------");
		int i = 1;
		// split table rows
		for (GuidewirePageStructure obj : guidewirePageStructure) {
			try {
				String locator = getLocatorForElement(obj);
				if (locator != null) {
					String[] splitNameAndLocator = locator.split("\\|\\|");
					String currentElementName = splitNameAndLocator[0];
					// handle duplicate keys
					if (locatorKeyValue.containsKey(currentElementName)) {
						currentElementName = currentElementName + "_" + i;
						i++;
					}

					locatorKeyValue.put(currentElementName, splitNameAndLocator[1]);
					System.out.println(locator);
				}

			} catch (Exception e) {

			}
		}
		System.out.println("---------------------------------------END--------------------------------------");

	}

	/**
	 * Writes the element locators to an excel file
	 * 
	 * @author magesh.nagamani
	 * @since 24-01-2023
	 */
	private void flushDataToExcel(String pageName) {
		// writeToExcel
		PageObjectGenerator pog = new PageObjectGenerator();
		try {
			pog.writeToExcel(pageName, locatorKeyValue);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			try {
				Log.exception(e);
			} catch (Exception logException) {
				// TODO Auto-generated catch block
				System.err.println("Exception: " + e.getMessage());	
		}		}
	}

	private void cleanUpLocatorMapping() {
		locatorKeyValue.clear();
	}

	/**
	 * Login to the GW app
	 * 
	 * @author magesh.nagamani
	 * @since 24-01-2023
	 */
	public void loginToGW() {

		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsername(driver, "su")
		.enterPassword(driver, "gw")
		.clickLogin(driver);
		new MySummaryPage(driver).get();

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// Re-interrupt the current thread
	        Thread.currentThread().interrupt();
	        // Optionally, you might want to log the interruption or take other actions
	        throw new RuntimeException("Thread sleep interrupted", e);
		}
	}

	/**
	 * Navigate to pcf file section for current page
	 * 
	 * @author magesh.nagamani
	 * @since 24-01-2023
	 */
	public void navigateToPCF() {
		String pcfShortcut = Keys.chord(Keys.ALT, Keys.SHIFT, "w");
		driver.findElement(By.tagName("body")).sendKeys(pcfShortcut);

	}

	/**
	 * Switch to second window (where pcf files are listed)
	 * 
	 * @author magesh.nagamani
	 * @since 24-01-2023
	 */
	public void switchToSecondWindow() {
		// It will return the parent window name as a String
		String parent = driver.getWindowHandle();
		Set<String> s = driver.getWindowHandles();

		// Now iterate using Iterator
		Iterator<String> I1 = s.iterator();

		while (I1.hasNext()) {

			String child_window = I1.next();

			if (!parent.equals(child_window))
				driver.switchTo().window(child_window);
		}
	}

	/**
	 * Switch back to the GW app page
	 * 
	 * @author magesh.nagamani
	 * @since 24-01-2023
	 */
	public void switchToDefaultContent() {

		// close current window
		driver.close();

		// switch to default content
		// driver.switchTo().defaultContent();

		Set<String> s = driver.getWindowHandles();

		// Now iterate using Iterator
		Iterator<String> I1 = s.iterator();

		while (I1.hasNext()) {

			String child_window = I1.next();
			driver.switchTo().window(child_window);
		}
	}

	/**
	 * Expand all the table structure in pcf page
	 * 
	 * @author magesh.nagamani
	 * @since 24-01-2023
	 */
	public void expandAllTable() {
		List<WebElement> tableCollapser = driver.findElements(byCollapser);
		for (int i = tableCollapser.size() - 1; i >= 0; i--)
			tableCollapser.get(i).click();
	}

	/**
	 * Used to get the table header and row element locator
	 * 
	 * @author magesh.nagamani
	 * @since 24-01-2023
	 * @param currentTable
	 * @return
	 */
	public Map<String, List<GuidewirePageStructure>> getTableHeaderAndFirstRow(
			List<GuidewirePageStructure> currentTable) {
		Map<String, List<GuidewirePageStructure>> tableHeaderAndContentRows = new LinkedHashMap<>();
		try {

			List<GuidewirePageStructure> headerRow = new ArrayList<>();
			List<GuidewirePageStructure> firstRows = new ArrayList<>();
			List<Integer> rowIndex = new ArrayList<>();

			// iterate table rows
			// row.get(0) is header & row.get(1) is content locator
			for (int i = 0; i < currentTable.size(); i++) {
				// if currentRow widget is equals to Row
				if (currentTable.get(i).getWidget().equalsIgnoreCase(GuidewireTags.Table.ROW)) {
					rowIndex.add(i);
					if (rowIndex.size() > 3)
						break;
				}

			}

			// Header Row
			for (int i = rowIndex.get(0); i < rowIndex.get(1); i++) {
				headerRow.add(currentTable.get(i));
			}

			// push header to Map
			tableHeaderAndContentRows.put("Header", headerRow);

			// handle if table has only one row of table data
			if (rowIndex.size() == 2) {
				System.out.println(currentTable.size());
				for (int i = rowIndex.get(1); i < currentTable.size(); i++) {
					firstRows.add(currentTable.get(i));
				}
			}
			// Table locator Row - 2 or more rows of table data
			else {
				for (int i = rowIndex.get(1); i < rowIndex.get(2); i++) {
					firstRows.add(currentTable.get(i));
				}
			}
			// push first row to Map
			tableHeaderAndContentRows.put("FirstRow", firstRows);

		} catch (Exception e) {
			System.out.println("Error while capturing table locators");
		}
		return tableHeaderAndContentRows;
	}

	/**
	 * Used to get the locator for different HTML elements
	 * 
	 * @author magesh.nagamani
	 * @since 24-01-2023
	 * @param obj
	 * @return
	 */
	public String getLocatorForElement(GuidewirePageStructure obj) {
		String locatorWithLabel = null;
		String separator = "||";
		String buttonPrefix = "btn";
		String textBoxPrefix = "inp";
		String dropdownPrefix = "drp";
		String labelPrefix = "lbl";
		String checkboxPrefix = "chk";
		String radioBtnPrefix = "rdb";
		String linkPrefix = "lnk";

		String nameOfElement = obj.getLabel();
		if (nameOfElement.length() > 29 || nameOfElement.isBlank()) {
			if (!obj.getId().isEmpty())
				nameOfElement = obj.getId();
		}

		// String customizedElementName = CaseUtils.toCamelCase(nameOfElement, false,
		// null);
		String customizedElementName = WordUtils.capitalize(nameOfElement);

		switch (obj.getWidget()) {

		// buttons
		case GuidewireTags.BUTTONVALUE:
		case GuidewireTags.EDITBUTTON:
		case GuidewireTags.TOOLBARBUTTON:
		case GuidewireTags.TOOLBARFLAG:
		case GuidewireTags.CHECKEDVALUESTOOLBARBUTTON:
		case GuidewireTags.ITERATORREMOVEBUTTON:
		case GuidewireTags.ADDBUTTON:
		case GuidewireTags.ADDMENUITEM:
		case GuidewireTags.TILEACTION:
		case GuidewireTags.WIZARDBUTTON:
		case GuidewireTags.MENUICON:
			if (!nameOfElement.isEmpty())
				locatorWithLabel = buttonPrefix + customizedElementName + separator
				+ getLocatorForButton(obj.getRenderID());
			break;

			// buttons - link,search
		case GuidewireTags.LINK:
		case GuidewireTags.SEARCHITEMBUTTON:
		case GuidewireTags.IMAGEBUTTON:
		case GuidewireTags.BREADCRUMBLINK:
			if (!nameOfElement.isEmpty())

				locatorWithLabel = buttonPrefix + customizedElementName + separator
				+ getLocatorForButtonType(obj.getRenderID());
			break;

			// textboxs
		case GuidewireTags.TEXTVALUE:
		case GuidewireTags.SEARCHITEMVALUE:
		case GuidewireTags.BASEPICKERVALUE:
		case GuidewireTags.ORGANIZATIONVALUE:
		case GuidewireTags.PRIVACYVALUE:
		case GuidewireTags.ALTUSERVALUE:
		case GuidewireTags.DATEVALUE:
		case GuidewireTags.MONETARYAMOUNTVALUE:
			if (!nameOfElement.isEmpty())

				locatorWithLabel = textBoxPrefix + customizedElementName + separator
				+ getLocatorForTextBox(obj.getRenderID());
			break;

			// text area
		case GuidewireTags.TEXTAREAVALUE:
			if (!nameOfElement.isEmpty())

				locatorWithLabel = textBoxPrefix + customizedElementName + separator
				+ getLocatorForTextArea(obj.getRenderID());
			break;

			// dropdowns
		case GuidewireTags.TOOLBARFILTERVALUE:
		case GuidewireTags.TYPEKEYVALUE:
		case GuidewireTags.EXPRESSIONRANGEVALUE:
			if (!nameOfElement.isEmpty())

				locatorWithLabel = dropdownPrefix + customizedElementName + separator
				+ getLocatorForDropdown(obj.getRenderID());
			break;

			// checkboxes
		case GuidewireTags.BOOLEANCHECKBOXVALUE:
		case GuidewireTags.INPUTGROUPCHECKBOXVALUE:
			if (!nameOfElement.isEmpty())

				locatorWithLabel = checkboxPrefix + customizedElementName + separator
				+ getLocatorForCheckbox(obj.getRenderID());
			break;

			// radiobutton
		case GuidewireTags.BOOLEANRADIOVALUE:
			if (!nameOfElement.isEmpty())

				locatorWithLabel = radioBtnPrefix + customizedElementName + separator
				+ getLocatorForRadioButton(obj.getRenderID());
			break;

			// alert
		case GuidewireTags.ALERTBAR:
			if (!nameOfElement.isEmpty())

				locatorWithLabel = labelPrefix + customizedElementName + separator
				+ getLocatorForAlertLabel(obj.getRenderID());
			break;

			// label
		case GuidewireTags.PERFORMANCEINDICATOR:
		case GuidewireTags.TITLEBAR:
			if (!nameOfElement.isEmpty())

				locatorWithLabel = labelPrefix + customizedElementName + separator
				+ getLocatorForLabel(obj.getRenderID());
			break;

			// tab
		case GuidewireTags.CARDTAB:
			if (!nameOfElement.isEmpty())

				locatorWithLabel = buttonPrefix + customizedElementName + separator
				+ getLocatorForTab(obj.getRenderID());
			break;

			// link
		case GuidewireTags.VIEWMORELINK:
		case GuidewireTags.BULLETPOINTTEXTVALUE:
			if (!nameOfElement.isEmpty())

				locatorWithLabel = linkPrefix + customizedElementName + separator
				+ getLocatorForViewMoreLink(obj.getRenderID());
			break;

			// menu item
		case GuidewireTags.MENUITEM:
		case GuidewireTags.PICKERMENUITEM:
		case GuidewireTags.WIZARDMENULINK:
			if (!nameOfElement.isEmpty())

				locatorWithLabel = buttonPrefix + customizedElementName + separator
				+ getLocatorForMenuItemButton(obj.getRenderID());
			break;

		case GuidewireTags.TAB: // used in tab bar
		case GuidewireTags.TABBARLINK:
		case GuidewireTags.TABBARLOGOUT:
			if (!nameOfElement.isEmpty())

				locatorWithLabel = buttonPrefix + customizedElementName + separator
				+ getLocatorForMenuItemButton(obj.getRenderID());
			break;

		case GuidewireTags.TABEXPAND:
			if (!nameOfElement.isEmpty())
				customizedElementName = customizedElementName + "OptionsIcon";
			locatorWithLabel = buttonPrefix + customizedElementName + separator
					+ getLocatorForTabExpand(obj.getRenderID());
			break;

			// left menu item
		case GuidewireTags.ActionsMenu.MENUACTIONS:
			if (!nameOfElement.isEmpty())

				locatorWithLabel = buttonPrefix + customizedElementName + separator
				+ getLocatorForMenuAction(obj.getRenderID());
			break;

			// left menu item

		case GuidewireTags.ActionsMenu.MENUITEMS:
			if (!nameOfElement.isEmpty())

				locatorWithLabel = buttonPrefix + customizedElementName + separator
				+ getLocatorForMenuItem(obj.getRenderID());
			break;

		case GuidewireTags.DATEVALUEICON:
			if (!nameOfElement.isEmpty())
				customizedElementName = customizedElementName + "DateIcon";
			locatorWithLabel = buttonPrefix + customizedElementName + separator
					+ getLocatorForDateIcon(obj.getRenderID());
			break;
		}
		return locatorWithLabel;

	}

	/**
	 * Used to get the locator and element name for HTML element- Menu Actions
	 * button
	 * 
	 * @author magesh.nagamani
	 * @since 24-01-2023
	 * @param locatorID
	 * @return
	 */
	private String getLocatorForMenuAction(String locatorID) {
		String locatorForTextBoxValue = null;

		locatorForTextBoxValue = "css|" + GuidewireTagsToHtml.ActionsMenu.MENUACTIONS
				.replace(GuidewireTagsToHtml.LocatorReplacer.RENDER_ID, locatorID);

		return locatorForTextBoxValue;
	}

	/**
	 * Used to get the locator and element name for HTML element- Menu Item button
	 * 
	 * @author magesh.nagamani
	 * @since 24-01-2023
	 * @param locatorID
	 * @return
	 */
	private String getLocatorForMenuItem(String locatorID) {
		String locatorForTextBoxValue = null;

		locatorForTextBoxValue = "css|" + GuidewireTagsToHtml.ActionsMenu.MENUITEMS
				.replace(GuidewireTagsToHtml.LocatorReplacer.RENDER_ID, locatorID);

		return locatorForTextBoxValue;
	}

	/**
	 * Used to get the locator and element name for HTML element- button
	 * 
	 * @author magesh.nagamani
	 * @since 24-01-2023
	 * @param locatorID
	 * @return
	 */
	private String getLocatorForButton(String locatorID) {
		String locatorForTextBoxValue = null;

		locatorForTextBoxValue = "css|"
				+ GuidewireTagsToHtml.BUTTON.replace(GuidewireTagsToHtml.LocatorReplacer.RENDER_ID, locatorID);

		return locatorForTextBoxValue;
	}

	/**
	 * Used to get the locator and element name for HTML element-
	 * button(link/search)
	 * 
	 * @author magesh.nagamani
	 * @since 24-01-2023
	 * @param locatorID
	 * @return
	 */
	private String getLocatorForButtonType(String locatorID) {
		String locatorForTextBoxValue = null;

		locatorForTextBoxValue = "css|" + GuidewireTagsToHtml.LINK_SEARCH_IMAGE_BREADCRUMB_BUTTON
				.replace(GuidewireTagsToHtml.LocatorReplacer.RENDER_ID, locatorID);

		return locatorForTextBoxValue;
	}

	/**
	 * Used to get the locator and element name for HTML element- textbox
	 * 
	 * @author magesh.nagamani
	 * @since 24-01-2023
	 * @param locatorID
	 * @return
	 */
	private String getLocatorForTextBox(String locatorID) {
		String locatorForTextBoxValue = null;

		locatorForTextBoxValue = "css|"
				+ GuidewireTagsToHtml.TEXTBOX.replace(GuidewireTagsToHtml.LocatorReplacer.RENDER_ID, locatorID);

		return locatorForTextBoxValue;
	}

	/**
	 * Used to get the locator and element name for HTML element- textarea
	 * 
	 * @author magesh.nagamani
	 * @since 24-01-2023
	 * @param locatorID
	 * @return
	 */
	private String getLocatorForTextArea(String locatorID) {
		String locatorForTextArea = null;

		locatorForTextArea = "css|"
				+ GuidewireTagsToHtml.TEXTAREA.replace(GuidewireTagsToHtml.LocatorReplacer.RENDER_ID, locatorID);

		return locatorForTextArea;
	}

	/**
	 * Used to get the locator and element name for HTML element- checkbox
	 * 
	 * @author magesh.nagamani
	 * @since 24-01-2023
	 * @param locatorID
	 * @return
	 */
	private String getLocatorForCheckbox(String locatorID) {
		String locatorForCheckbox = null;

		locatorForCheckbox = "css|"
				+ GuidewireTagsToHtml.CHECKBOX.replace(GuidewireTagsToHtml.LocatorReplacer.RENDER_ID, locatorID);

		return locatorForCheckbox;
	}

	/**
	 * Used to get the locator and element name for HTML element- radiobutton
	 * 
	 * @author magesh.nagamani
	 * @since 24-01-2023
	 * @param locatorID
	 * @return
	 */
	private String getLocatorForRadioButton(String locatorID) {
		String locatorForRadioButton = null;

		locatorForRadioButton = "css|"
				+ GuidewireTagsToHtml.RADIOBUITTON.replace(GuidewireTagsToHtml.LocatorReplacer.RENDER_ID, locatorID);

		return locatorForRadioButton;
	}

	/**
	 * Used to get the locator and element name for HTML element- dropdown
	 * 
	 * @author magesh.nagamani
	 * @since 24-01-2023
	 * @param locatorID
	 * @return
	 */
	private String getLocatorForDropdown(String locatorID) {
		String locatorForToolbarFilterValue = null;

		locatorForToolbarFilterValue = "css|"
				+ GuidewireTagsToHtml.DROPDOWN.replace(GuidewireTagsToHtml.LocatorReplacer.RENDER_ID, locatorID);
		return locatorForToolbarFilterValue;
	}

	/**
	 * Used to get the locator and element name for HTML element- alert-label
	 * 
	 * @author magesh.nagamani
	 * @since 24-01-2023
	 * @param locatorID
	 * @return
	 */
	private String getLocatorForAlertLabel(String locatorID) {
		String locatorForAlertLabel = null;

		locatorForAlertLabel = "css|"
				+ GuidewireTagsToHtml.ALERT_LABEL.replace(GuidewireTagsToHtml.LocatorReplacer.RENDER_ID, locatorID);

		return locatorForAlertLabel;
	}

	/**
	 * Used to get the locator and element name for HTML element -label
	 * 
	 * @author magesh.nagamani
	 * @since 24-01-2023
	 * @param locatorID
	 * @return
	 */
	private String getLocatorForLabel(String locatorID) {
		String locatorForLabel = null;

		locatorForLabel = "css|"
				+ GuidewireTagsToHtml.LABEL.replace(GuidewireTagsToHtml.LocatorReplacer.RENDER_ID, locatorID);

		return locatorForLabel;
	}

	/**
	 * Used to get the locator and element name -tab
	 * 
	 * @author magesh.nagamani
	 * @since 24-01-2023
	 * @param locatorID
	 * @return
	 */
	private String getLocatorForTab(String locatorID) {
		String locatorForTab = null;

		locatorForTab = "css|"
				+ GuidewireTagsToHtml.TAB.replace(GuidewireTagsToHtml.LocatorReplacer.RENDER_ID, locatorID);

		return locatorForTab;
	}

	/**
	 * Used to get the locator and element name -view more link
	 * 
	 * @author magesh.nagamani
	 * @since 24-01-2023
	 * @param locatorID
	 * @return
	 */
	private String getLocatorForViewMoreLink(String locatorID) {
		String locatorForTab = null;

		locatorForTab = "css|"
				+ GuidewireTagsToHtml.VIEWMORELINK.replace(GuidewireTagsToHtml.LocatorReplacer.RENDER_ID, locatorID);

		return locatorForTab;
	}

	/**
	 * Used to get the locator and element name -menu item buttons
	 * 
	 * @author magesh.nagamani
	 * @since 24-01-2023
	 * @param locatorID
	 * @return
	 */
	private String getLocatorForMenuItemButton(String locatorID) {
		String locatorForTab = null;

		locatorForTab = "css|"
				+ GuidewireTagsToHtml.MENUITEM.replace(GuidewireTagsToHtml.LocatorReplacer.RENDER_ID, locatorID);

		return locatorForTab;
	}

	/**
	 * Used to get the locator and element name -menu item buttons
	 * 
	 * @author magesh.nagamani
	 * @since 24-01-2023
	 * @param locatorID
	 * @return
	 */
	private String getLocatorForTabExpand(String locatorID) {
		String locatorForTab = null;

		locatorForTab = "css|"
				+ GuidewireTagsToHtml.TABEXPAND.replace(GuidewireTagsToHtml.LocatorReplacer.RENDER_ID, locatorID);

		return locatorForTab;
	}

	/**
	 * Used to get the locator and element name for HTML element- Date Icon
	 * 
	 * @author magesh.nagamani
	 * @since 24-01-2023
	 * @param locatorID
	 * @return
	 */
	private String getLocatorForDateIcon(String locatorID) {
		String locatorForDateIcon = null;

		locatorForDateIcon = "css|"
				+ GuidewireTagsToHtml.DATEVALUEICON.replace(GuidewireTagsToHtml.LocatorReplacer.RENDER_ID, locatorID);

		return locatorForDateIcon;
	}

	/**
	 * Used to get the locator and element name for HTML element- table
	 * 
	 * @author magesh.nagamani
	 * @since 24-01-2023
	 * @param locatorID
	 * @return
	 */
	private String getLocatorForTable(GuidewirePageStructure obj) {
		String locator = null;

		switch (obj.getWidget()) {

		case GuidewireTags.Table.ITERATORHEADERCHECKBOX:
			if (!(obj.getId().isEmpty()))
				locator = obj.getRenderID();
			break;

		case GuidewireTags.Table.TOOLBARFILTERVALUE:
			if (!(obj.getId().isEmpty()))
				locator = getLocatorForDropdown(obj.getRenderID());
			break;

		case GuidewireTags.Table.HEADERCELLVALUE:
			if (!(obj.getLabel().isEmpty()))
				locator = obj.getRenderID();
			break;
		case GuidewireTags.Table.BOOLEANRADIOVALUE:
		case GuidewireTags.Table.DATEVALUE:
		case GuidewireTags.Table.TEXTVALUE:
		case GuidewireTags.Table.TYPEKEYVALUE:
		case GuidewireTags.Table.ALTUSERVALUE:
		case GuidewireTags.Table.MONETARYAMOUNTVALUE:
		case GuidewireTags.Table.BARVALUE:
			if (!(obj.getLabel().isEmpty()))
				locator = getTableRowLocator(obj.getRenderID());
			break;

		case GuidewireTags.Table.BUTTONVALUE:
		case GuidewireTags.Table.SELECTORCELLVALUE:
		case GuidewireTags.Table.LINK:
			if (!(obj.getId().isEmpty()))
				locator = getTableRowLocator(obj.getRenderID());
			break;

		}

		return locator;
	}

	/**
	 * Used to get the locator prefix for HTML element- table
	 * 
	 * @author magesh.nagamani
	 * @since 24-01-2023
	 * @param locatorID
	 * @return
	 */
	private String getPrefixForTable(GuidewirePageStructure obj) {
		String prefix = null;

		switch (obj.getWidget()) {
		case GuidewireTags.Table.ITERATORHEADERCHECKBOX:
			if (!(obj.getId().isEmpty()))
				prefix = "chk";
			break;

		case GuidewireTags.Table.TOOLBARFILTERVALUE:
			if (!(obj.getId().isEmpty()))
				prefix = "drp";
			break;

		case GuidewireTags.Table.HEADERCELLVALUE:
			if (!(obj.getLabel().isEmpty()))
				prefix = "btn";
			break;
		case GuidewireTags.Table.BOOLEANRADIOVALUE:
		case GuidewireTags.Table.DATEVALUE:
		case GuidewireTags.Table.TEXTVALUE:
		case GuidewireTags.Table.TYPEKEYVALUE:
		case GuidewireTags.Table.ALTUSERVALUE:
		case GuidewireTags.Table.BARVALUE:
			if (!(obj.getLabel().isEmpty()))
				prefix = "lbl";
			break;

		case GuidewireTags.Table.BUTTONVALUE:
		case GuidewireTags.Table.SELECTORCELLVALUE:
		case GuidewireTags.Table.LINK:
			if (!(obj.getId().isEmpty()))
				prefix = "btn";
			break;

		default:
			prefix = "";
			break;

		}

		return prefix;
	}

	private String getTableRowLocator(String locatorID) {
		String locatorForTableRow = null;
		String separator_1 = "LV-";
		String separator_2 = "-";

		String prefixLocator = locatorID.split(separator_1)[0] + separator_1;
		String[] suffixCalculation = locatorID.split(separator_2);
		String suffixLocator = suffixCalculation[suffixCalculation.length - 1];

		locatorForTableRow = GuidewireTagsToHtml.Table.CELL
				.replace(GuidewireTagsToHtml.LocatorReplacer.RENDER_ID, prefixLocator)
				.replace(GuidewireTagsToHtml.LocatorReplacer.LOCATOR_SUFFIX, suffixLocator);

		return locatorForTableRow;
	}

	@AfterTest
	public void tearDown() {
		if (driver != null)
			driver.quit();
	}
}
