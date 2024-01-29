package com.aspire.guidewire.pc.pages.common;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

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

	@IFindBy(how = How.CSS, using = "div[id$='CreateDocument']", AI = false)
	public WebElement btnCreateDocument;

	@IFindBy(how = How.CSS, using = "div[id$='Update']", AI = false)
	public WebElement btnUpdate;

	@IFindBy(how = How.CSS, using = "div[id$='SelectTemplatePicker']", AI = false)
	public WebElement icnSearchDocument;

	@IFindBy(how = How.CSS, using = "div[id$='InputSet-Search']", AI = false)
	public WebElement btnSearch;

	@IFindBy(how = How.CSS, using = "select[name$='JurisdictionState']", AI = false)
	public WebElement drpJurisdictionState;

	@IFindBy(how = How.CSS, using = "tr[id*='DocumentTemplateSearchResultLV']", AI = false)
	public WebElement lblTemplates;

	@IFindBy(how = How.CSS, using = "div[id$='Select']", AI = false)
	public WebElement btnSelect;

	@IFindBy(how = How.CSS, using = "input[id$='UploadDocumentScreen-FileInput--file']", AI = false)
	public WebElement addFileBeforePolicyCreationButton;

	@IFindBy(how = How.CSS, using = "select[name$='Status']", AI = false)
	public WebElement drpStatus;

	@IFindBy(how = How.CSS, using = "select[name$='DocumentDetailsEditLVPanelSet-DocumentMetadataEditLV-0-Type']", AI = false)
	public WebElement drpDocumentType;

	@IFindBy(how = How.CSS, using = "select[name$='DocumentTemplateSearchDV-DocumentType']", AI = false)
	public WebElement drpUploadDocumentType;

	@IFindBy(how = How.CSS, using = "input[name$='DynamicInput']", AI = false)
	public WebElement inpSubject;

	@IFindBy(how = How.CSS, using = "textarea[name$='DynamicInput']", AI = false)
	public WebElement inpBody;

	@IFindBy(how = How.CSS, using = "div[id$='DocumentViewEdit']", AI = false)
	public WebElement btnViewEdit;

	@IFindBy(how = How.CSS, using = "input[name$='TemplatePicker']", AI = false)
	public WebElement inpDocumentTemplate;

	@IFindBy(how = How.CSS, using = "div[id$='NameLink']", AI = false)
	public WebElement lnkDocumentName;

	@IFindBy(how = How.CSS, using = "div[id$='PolicyFile_PolicyFile_Documents']", AI = false)
	public WebElement btnDocument;

	@IFindBy(how = How.TAG_NAME, using = "table", AI = false)
	public WebElement lblTable;

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
	 * Select the Jurisdiction
	 * @author vignesh.ravi
	 * @param driver
	 */
	public void selectJurisdiction(WebDriver driver, String state) {
		BrowserActions.selectDropDownByVisibleText(driver, drpJurisdictionState,state,"Jurisdiction State");
	}

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
	 * Click search button
	 * @author siva.panjanathan
	 * @param driver
	 */
	public NewDocumentPage clickSearch(WebDriver driver) {
		BrowserActions.click(driver, btnSearch,2,"Search button");
		return this;
	}

	/**
	 * click select button
	 * @author somasundaram.muthu
	 * @param driver
	 */
	public NewDocumentPage clickSelect(WebDriver driver) {
		BrowserActions.click(driver, btnSelect, 2,"Select document button");
		return this;
	}


	/**
	 * @author manikandan.manohar
	 * Used to click on "Create Document" button
	 * @param driver
	 * @return
	 */
	public NewDocumentPage clickCreateDocument(WebDriver driver)  {
		BrowserActions.click(driver, btnCreateDocument,true,"Create Document");
		return this;
	}

	/**
	 * Clicks on  Update Button
	 * @author manikandan.manohar
	 * @param driver
	 * @return 
	 */
	public NewDocumentPage clickUpdateButton(WebDriver driver)  {
		BrowserActions.click(driver, btnUpdate,"Update Button");	
		return this;
	}
	
	
	/**
	 * Enters the Due Date date 
	 * @author manikandan.manohar
	 * @param driver
	 * @return NewContingencyPage
	 */
	public NewDocumentPage documentAttach(WebDriver driver, String documentName){

		EnvironmentPropertiesReader configProperty = EnvironmentPropertiesReader.getInstance();

		String isLamdbaTestRun = configProperty.getProperty("runInLambdaTestTunnel");

		String isRunDesktop = configProperty.getProperty("runDesktop");

		String isHyperTestRun = configProperty.getProperty("runInHyperTest");

		String lambdaTestFilePath = configProperty.getProperty("LT_RESOURCES_UPLOAD_PATH");

		String filePath = null;

		if((isHyperTestRun.equals("true") && isLamdbaTestRun.equals("true")) || isRunDesktop.equals("true") ) {
			filePath = new File("./src/main/resources/assessmentMedia/"+documentName).getAbsolutePath();		
		}else if (isLamdbaTestRun.equals("true") && isHyperTestRun.equals("false")) {
			filePath = lambdaTestFilePath;
		}

		addFileBeforePolicyCreationButton.sendKeys(filePath);
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
	public NewDocumentPage selectUploadDocumentType(WebDriver driver,String documentType)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpDocumentType,documentType, "Upload Document Type");
		return this;
	}
	public NewDocumentPage selectDocumentType(WebDriver driver,String documentType)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpUploadDocumentType,documentType, "Upload Document Type");
		return this;
	}
	public NewDocumentPage enterSubject(WebDriver driver,String subject)  {
		BrowserActions.type(driver, inpSubject,subject,true, "Subject field");
		return this;
	}
	public NewDocumentPage enterBody(WebDriver driver,String body)  {
		BrowserActions.type(driver, inpBody,body, true,"Body field");
		return this;
	}
	public NewDocumentPage clickViewEdit(WebDriver driver)  {
		BrowserActions.click(driver, btnViewEdit,true,"View Edit Button");
		return this;
	}
	public String getDocumentTemplate(WebDriver driver)  {
		String documentTemplate = inpDocumentTemplate.getAttribute("value");
		return documentTemplate;
	}
	public NewDocumentPage verifyEmailSubject(WebDriver driver, String subject)  {
		By subjectBy = By.xpath("//td[text()='"+subject+"']");
		BrowserActions.waitForElementToDisplay(driver, subjectBy, "Subject");
		WebElement actualSubject = subjectBy.findElement(driver);
		String text = BrowserActions.getText(driver, actualSubject, "Email Subject");
		Log.assertThat(text.equals(subject), "Entered Subject is Matched", "Entered Subject is not Matched");
		this.switchToWindow(driver);
		return this;
	}
	public NewDocumentPage verifyEmailBody(WebDriver driver, String body)  {
		this.switchToWindow(driver);
		BrowserActions.waitForElementToDisplay(driver, lblTable,3);
		By emailBodyBy =By.xpath("(//td)[8]");
		BrowserActions.waitForElementToDisplay(driver, emailBodyBy, "Email Body");
		WebElement actualBody = emailBodyBy.findElement(driver);
		String text = BrowserActions.getText(driver, actualBody, "Actual body");
		Log.assertThat(text.contains("Hi"), "Entered Body is Matched", "Entered body is not Matched");
		return this;
	}
	public void switchToWindow(WebDriver driver)  {
		String parent = driver.getWindowHandle();
		Set<String> childWindows = driver.getWindowHandles();
		for(String child : childWindows){
			if(!child.equals(parent)) {
				driver.switchTo().window(child);
				break;
			}
		}
	}

	public String verifyEmailDocumentCreated(WebDriver driver) {
		String doc= BrowserActions.getText(driver, lnkDocumentName, "Document Name");
		return doc;
	}
	public NewDocumentPage clickDocument(WebDriver driver)  {
		BrowserActions.click(driver, btnDocument,2,"Document");
		return this;
	}
}