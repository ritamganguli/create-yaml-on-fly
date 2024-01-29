package com.aspire.guidewire.cc.pages.common;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.testng.Assert;

import com.aspire.guidewire.utils.BrowserActions;
import com.aspire.guidewire.utils.ElementLayer;
import com.aspire.guidewire.utils.EnvironmentPropertiesReader;
import com.aspire.guidewire.utils.Log;
import com.aspire.guidewire.utils.Utils;
import com.aspire.guidewire.utils.WaitUtils;

import ASPIREAI.customfactories.AjaxElementLocatorFactory;
import ASPIREAI.customfactories.IFindBy;
import ASPIREAI.customfactories.PageFactory;


	public class NewDocumentPage extends LoadableComponent<NewDocumentPage> {

		WebDriver driver;
		private boolean isPageLoaded;
		public ElementLayer elementLayer;
		public static List<Object> pageFactoryKey = new ArrayList<Object>();
		public static List<String> pageFactoryValue = new ArrayList<String>();

		@IFindBy(how = How.CSS, using = "div[id$='Update']", AI = false)
		public WebElement btnUpdate;

		@IFindBy(how = How.CSS, using = "div[id$='SelectTemplatePicker']", AI = false)
		public WebElement icnSearchDocument;

		@IFindBy(how = How.CSS, using = "select[name$='JurisdictionState']", AI = false)
		public WebElement drpJurisdictionState;

		@IFindBy(how = How.CSS, using = "select[name$='TemplateType']", AI = false)
		public WebElement drpType;
		
		@IFindBy(how = How.CSS, using = "div[id$='Select']", AI = false)
		public WebElement btnSelect;

		@IFindBy(how = How.CSS, using = "div[id$='CreateDocument']", AI = false)
		public WebElement btnCreateDocument;
		
		@IFindBy(how = How.CSS, using = "div[id$='-Search']", AI = false)
		public WebElement btnSearch;

		@IFindBy(how = How.CSS, using = "input[id$='UploadDocumentScreen-FileInput--file']", AI = false)
		public WebElement addFileBeforePolicyCreationButton;
		
		@IFindBy(how = How.CSS, using = "select[name$='Status']", AI = false)
		public WebElement drpStatus;

		@IFindBy(how = How.CSS, using = "select[name$='DocumentDetailsEditLV-0-Type']", AI = false)
		public WebElement drpUploadDocumentType;

		@IFindBy(how = How.CSS, using = "input[name$='Name']", AI = false)
		public WebElement txtName;
		
		@IFindBy(how = How.CSS, using = "select[name$='DocumentExistenceDetailsInputSet-Type']", AI = false)
		public WebElement drpDocumentType;
		
		@IFindBy(how = How.CSS, using = "div[id$='browseButton']", AI = false)
		public WebElement btnAddFiles;
		
		public NewDocumentPage() {}

		public NewDocumentPage(WebDriver driver){
			this.driver = driver;
			ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, Utils.maxElementWait);
			PageFactory.initElements(finder, this);
			elementLayer = new ElementLayer(driver);
		}

		@Override
		protected void load() {
			isPageLoaded = true;
			WaitUtils.waitForPageLoad(driver);
		}// load

		@Override
		protected void isLoaded() {
			if (!isPageLoaded) {
				Assert.fail();
			}

			if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, btnUpdate))) {
				Log.fail("Page did not open up. Site might be down.", driver);
			}
			elementLayer = new ElementLayer(driver);
		}// isLoaded

		
		  /**
	     * Used to click on "Search Document" icon
		 * @author siva.panjanathan
		 * @param driver
		 * @return
		 */
		public NewDocumentPage clickSearchDocumentIcon(WebDriver driver)  {
			BrowserActions.click(driver, icnSearchDocument,"Search Document icon");
			return this;
		}
		
		  /**
	     * Used to click on "Search Document" icon
		 * @author surendar.baskaran
		 * @param driver
		 * @return
		 */
		public NewDocumentPage clickSelect(WebDriver driver)  {
			BrowserActions.click(driver, btnSelect,"Select");
			return this;
		}

		/**
		 * @author surendar.baskaran
		 * Used to click on "Create Document" button
		 * @param driver
		 * @return
		 */
		public NewDocumentPage clickCreateDocument(WebDriver driver)  {
			BrowserActions.click(driver, btnCreateDocument,"Create Document");
			return this;
		}
		
		/**
		 * @author surendar.baskaran
		 * Used to click on "Create Document" button
		 * @param driver
		 * @return
		 */
		public NewDocumentPage clickSearch(WebDriver driver)  {
			BrowserActions.click(driver, btnSearch,"Search");
			return this;
		}
		
		/**
		 * select the Type
		 * @author surendar.baskaran
		 * @param driver,topic
		 */
		public NewDocumentPage selectType(WebDriver driver, String type) {
			BrowserActions.selectDropDownByVisibleText(driver, drpType, type, "Type");
			return this;
		}
		
		/**
		 * select JurisdictionState
		 * @author surendar.baskaran
		 * @param driver,topic
		 */
		public NewDocumentPage selectJurisdictionState(WebDriver driver, String jurisdictionState) {
			BrowserActions.selectDropDownByVisibleText(driver, drpJurisdictionState, jurisdictionState, "JurisdictionState");
			return this;
		}
		
		/**
		 * Clicks on  Update Button
		 * @author surendar.baskaran
		 * @param driver
		 * @return 
		 */
		public void clickUpdateButton(WebDriver driver)  {
			BrowserActions.click(driver, btnUpdate,"Update Button");	
		}
		
		/**
		 * Enters the Due Date date 
		 * @author manikandan.manohar
		 * @param driver
		 * @return NewContingencyPage
		 */
		public NewDocumentPage documentAttach(WebDriver driver, String documentName){
			
			EnvironmentPropertiesReader configProperty = EnvironmentPropertiesReader.getInstance();
			
			String env = configProperty.getProperty("runDesktop");
			
			String path = configProperty.getProperty("LT_RESOURCES_UPLOAD_PATH");
			
			if (env.equals("false")) {
				WebElement addFile = driver.findElement(By.cssSelector("input[id$='UploadDocumentScreen-FileInput--file']"));
				addFile.sendKeys(path);
			}
			
			//For local Upload
			else {
			
			String absolutePath = new File("./src/main/resources/assessmentMedia/"+documentName).getAbsolutePath();
			addFileBeforePolicyCreationButton.sendKeys(absolutePath);
			}
			return this;
			
		}
		
		/**
		 * used to select status
		 * @author surendar.baskaran
		 * @param driver,Status
		 * @return
		 */
		public NewDocumentPage selectStatus(WebDriver driver,String status) {
			BrowserActions.selectDropDownByVisibleText(driver, drpStatus,status, "Status");
			return this;
		}

		/**
		 * used to select upload document type
		 * @author surendar.baskaran
		 * @param driver,documentType
		 * @return
		 */
		public NewDocumentPage selectUploadDocumentType(WebDriver driver,String documentType)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpUploadDocumentType,documentType, "Upload Document Type");
			return this;
		}
		
		/**
		 * Enters Name in the field
		 * @author surendar.baskaran
		 * @param driver
		 * @param Name
		 * @return
		 */
		public NewDocumentPage enterName(WebDriver driver, String name)  {
			BrowserActions.type(driver, txtName, name, "name");
			return this;
		}
		
		/**
		 * used to select upload document type
		 * @author surendar.baskaran
		 * @param driver,documentType
		 * @return
		 */
		public NewDocumentPage selectDocumentType(WebDriver driver,String documentType)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpDocumentType,documentType, "Document Type");
			return this;
		}
		
		/**
		 * Used to click on "Add Files"
		 * @author anitha.raphel
		 * @param driver
		 * @return
		 */
		public NewDocumentPage clickAddFiles(WebDriver driver)  {
			BrowserActions.click(driver, btnAddFiles,"Add Files");
			return this;
		}

}
