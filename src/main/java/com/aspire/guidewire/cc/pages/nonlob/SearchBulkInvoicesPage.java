package com.aspire.guidewire.cc.pages.nonlob;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.testng.Assert;

import com.aspire.guidewire.utils.BrowserActions;
import com.aspire.guidewire.utils.ElementLayer;
import com.aspire.guidewire.utils.Log;
import com.aspire.guidewire.utils.WaitUtils;
import com.aspire.guidewire.webdriverManager.DriverManager;

import ASPIREAI.customfactories.AjaxElementLocatorFactory;
import ASPIREAI.customfactories.IFindBy;
import ASPIREAI.customfactories.PageFactory;

public class SearchBulkInvoicesPage extends LoadableComponent<SearchBulkInvoicesPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
	//	public TopNavBar topnavbar;
	//	public BulkInvoiceSearchResults bulkinvoicesearchresultsTable;

	@IFindBy(how = How.CSS, using = "input[name='BulkInvoiceSearch-BulkInvoiceSearchScreen-BulkInvoiceSearchDV-BulkInvoiceSearchRequiredInputSet-TaxID']", AI = false)
	private WebElement inpPayeeTaxID;

	@IFindBy(how = How.CSS, using = "input[name='BulkInvoiceSearch-BulkInvoiceSearchScreen-BulkInvoiceSearchDV-BulkInvoiceSearchOptionalInputSet-FinancialCurrencyLabel']", AI = false)
	private WebElement inpInvoiceApprovedTotal;

	@IFindBy(how = How.CSS, using = "input[name='BulkInvoiceSearch-BulkInvoiceSearchScreen-BulkInvoiceSearchDV-BulkInvoiceSearchRequiredInputSet-GlobalPersonNameInputSet-Particle']", AI = false)
	private WebElement inpParticle;

	@IFindBy(how = How.CSS, using = "input[name='BulkInvoiceSearch-BulkInvoiceSearchScreen-BulkInvoiceSearchDV-BulkInvoiceSearchRequiredInputSet-CheckNumber']", AI = false)
	private WebElement inpCheck;

	@IFindBy(how = How.CSS, using = "#BulkInvoiceSearch-BulkInvoiceSearchScreen-BulkInvoiceSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Search", AI = false)
	private WebElement btnSearch;

	@IFindBy(how = How.CSS, using = "input[name='BulkInvoiceSearch-BulkInvoiceSearchScreen-BulkInvoiceSearchDV-BulkInvoiceSearchRequiredInputSet-GlobalPersonNameInputSet-LastName']", AI = false)
	private WebElement inpPayeeLastName;

	@IFindBy(how = How.CSS, using = "select[name='BulkInvoiceSearch-BulkInvoiceSearchScreen-BulkInvoiceSearchDV-BulkInvoiceSearchOptionalInputSet-FinancialCurrency']", AI = false)
	private WebElement drpInvoiceApprovedTotal;

	@IFindBy(how = How.CSS, using = "input[name='BulkInvoiceSearch-BulkInvoiceSearchScreen-BulkInvoiceSearchDV-BulkInvoiceSearchOptionalInputSet-DateSearch-DateSearchEndDate']", AI = false)
	private WebElement inpTo;

	@IFindBy(how = How.CSS, using = "#BulkInvoiceSearch-BulkInvoiceSearchScreen-BulkInvoiceSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Reset", AI = false)
	private WebElement btnReset;

	@IFindBy(how = How.CSS, using = "#BulkInvoiceSearch-BulkInvoiceSearchScreen-BulkInvoiceSearchDV-BulkInvoiceSearchOptionalInputSet-DateSearch-DateSearchEndDate_dateIcon", AI = false)
	private WebElement btnToDateIcon;

	@IFindBy(how = How.CSS, using = "#BulkInvoiceSearch-BulkInvoiceSearchScreen-ttlBar", AI = false)
	private WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "select[name='BulkInvoiceSearch-BulkInvoiceSearchScreen-BulkInvoiceSearchDV-BulkInvoiceSearchOptionalInputSet-FinancialChosenOption']", AI = false)
	private WebElement drpInvoiceApprovedTotal_2;

	@IFindBy(how = How.CSS, using = "input[name='BulkInvoiceSearch-BulkInvoiceSearchScreen-BulkInvoiceSearchDV-BulkInvoiceSearchRequiredInputSet-GlobalPersonNameInputSet-MiddleName']", AI = false)
	private WebElement inpMiddlename;

	@IFindBy(how = How.CSS, using = "select[name='BulkInvoiceSearch-BulkInvoiceSearchScreen-BulkInvoiceSearchDV-BulkInvoiceSearchOptionalInputSet-DateSearch-DateSearchChosenOption']", AI = false)
	private WebElement drpDateSearchChosenOption;

	@IFindBy(how = How.CSS, using = "input[name='BulkInvoiceSearch-BulkInvoiceSearchScreen-BulkInvoiceSearchDV-BulkInvoiceSearchOptionalInputSet-DateSearch-DateSearchStartDate']", AI = false)
	private WebElement inpFrom;

	@IFindBy(how = How.CSS, using = "input[name='BulkInvoiceSearch-BulkInvoiceSearchScreen-BulkInvoiceSearchDV-BulkInvoiceSearchRequiredInputSet-ClaimNumber']", AI = false)
	private WebElement inpClaim;

	@IFindBy(how = How.CSS, using = "input[name='BulkInvoiceSearch-BulkInvoiceSearchScreen-BulkInvoiceSearchDV-BulkInvoiceSearchRequiredInputSet-InvoiceNumber']", AI = false)
	private WebElement inpInvoice;
	
	@IFindBy(how = How.CSS, using = "#BulkInvoiceSearch-BulkInvoiceSearchScreen-BulkInvoiceSearchResultsLV-InvoiceNumberHeader_inner", AI = false)
	private WebElement lblInvoice;
	

	@IFindBy(how = How.CSS, using = "input[name='BulkInvoiceSearch-BulkInvoiceSearchScreen-BulkInvoiceSearchDV-BulkInvoiceSearchOptionalInputSet-FinancialExpressionTypeLabel']", AI = false)
	private WebElement inpInvoiceApprovedTotal_1;

	@IFindBy(how = How.CSS, using = "input[name='BulkInvoiceSearch-BulkInvoiceSearchScreen-BulkInvoiceSearchDV-BulkInvoiceSearchOptionalInputSet-FinancialAmountStartLabel']", AI = false)
	private WebElement inpInvoiceApprovedTotal_3;

	@IFindBy(how = How.CSS, using = "select[name='BulkInvoiceSearch-BulkInvoiceSearchScreen-BulkInvoiceSearchDV-BulkInvoiceSearchRequiredInputSet-GlobalPersonNameInputSet-Prefix']", AI = false)
	private WebElement drpPrefix;

	@IFindBy(how = How.CSS, using = "input[name='BulkInvoiceSearch-BulkInvoiceSearchScreen-BulkInvoiceSearchDV-BulkInvoiceSearchOptionalInputSet-FinancialAmountEndLabel']", AI = false)
	private WebElement inpInvoiceApprovedTotal_5;

	@IFindBy(how = How.CSS, using = "input[name='BulkInvoiceSearch-BulkInvoiceSearchScreen-BulkInvoiceSearchDV-BulkInvoiceSearchOptionalInputSet-FinancialAmountStart']", AI = false)
	private WebElement inpInvoiceApprovedTotal_4;

	@IFindBy(how = How.CSS, using = "input[name='BulkInvoiceSearch-BulkInvoiceSearchScreen-BulkInvoiceSearchDV-BulkInvoiceSearchOptionalInputSet-FinancialAmountEnd']", AI = false)
	private WebElement inpInvoiceApprovedTotal_6;

	@IFindBy(how = How.CSS, using = "input[name='BulkInvoiceSearch-BulkInvoiceSearchScreen-BulkInvoiceSearchDV-BulkInvoiceSearchRequiredInputSet-GlobalPersonNameInputSet-NameSummary']", AI = false)
	private WebElement inpName;

	@IFindBy(how = How.CSS, using = "input[name='BulkInvoiceSearch-BulkInvoiceSearchScreen-BulkInvoiceSearchDV-BulkInvoiceSearchOptionalInputSet-PayTo']", AI = false)
	private WebElement inpPayTo;

	@IFindBy(how = How.CSS, using = "select[name='BulkInvoiceSearch-BulkInvoiceSearchScreen-BulkInvoiceSearchDV-BulkInvoiceSearchOptionalInputSet-DateSearch-DateSearchRangeValue']", AI = false)
	private WebElement drpSince;

	@IFindBy(how = How.CSS, using = "input[name='BulkInvoiceSearch-BulkInvoiceSearchScreen-BulkInvoiceSearchDV-BulkInvoiceSearchRequiredInputSet-GlobalPersonNameInputSet-FirstName']", AI = false)
	private WebElement inpPayeeFirstName;

	@IFindBy(how = How.CSS, using = "#BulkInvoiceSearch-BulkInvoiceSearchScreen-BulkInvoiceSearchDV-BulkInvoiceSearchOptionalInputSet-DateSearch-DateSearchStartDate_dateIcon", AI = false)
	private WebElement btnFromDateIcon;

	@IFindBy(how = How.CSS, using = "select[name='BulkInvoiceSearch-BulkInvoiceSearchScreen-BulkInvoiceSearchDV-BulkInvoiceSearchRequiredInputSet-GlobalPersonNameInputSet-Suffix']", AI = false)
	private WebElement drpSuffix;

	@IFindBy(how = How.CSS, using = "input[name='BulkInvoiceSearch-BulkInvoiceSearchScreen-BulkInvoiceSearchDV-BulkInvoiceSearchRequiredInputSet-GlobalContactNameInputSet-Name']", AI = false)
	private WebElement inpPayeeOrganizationName;

	public SearchBulkInvoicesPage(){
	}

	public SearchBulkInvoicesPage(WebDriver driver){
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(finder, this);
		//		bulkinvoicesearchresultsTable = new BulkInvoiceSearchResults();
	}
	@Override
	protected void load() {
		isPageLoaded = true;
		WaitUtils.waitForPageLoad(driver);
	}@Override
	protected void isLoaded() {
		if (!isPageLoaded) {
			Assert.fail();
		}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, lblTtlBar))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);
	}public SearchBulkInvoicesPage enterPayeeTaxID(WebDriver driver,String PayeeTaxID) {
		BrowserActions.type(driver, inpPayeeTaxID,PayeeTaxID, "PayeeTaxID");
		return this;
	}
	public SearchBulkInvoicesPage enterInvoiceApprovedTotal(WebDriver driver,String InvoiceApprovedTotal) {
		BrowserActions.type(driver, inpInvoiceApprovedTotal,InvoiceApprovedTotal, "InvoiceApprovedTotal");
		return this;
	}
	public SearchBulkInvoicesPage enterParticle(WebDriver driver,String Particle) {
		BrowserActions.type(driver, inpParticle,Particle, "Particle");
		return this;
	}
	public SearchBulkInvoicesPage enterCheck(WebDriver driver,String Check) {
		BrowserActions.type(driver, inpCheck,Check, "Check");
		return this;
	}
	public SearchBulkInvoicesPage clickSearch(WebDriver driver)  {
		BrowserActions.click(driver, btnSearch,"Search");
		return this;
	}
	public SearchBulkInvoicesPage enterPayeeLastName(WebDriver driver,String PayeeLastName) {
		BrowserActions.type(driver, inpPayeeLastName,PayeeLastName, "PayeeLastName");
		return this;
	}
	public SearchBulkInvoicesPage selectInvoiceApprovedTotal(WebDriver driver,String InvoiceApprovedTotal)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpInvoiceApprovedTotal,InvoiceApprovedTotal,"InvoiceApprovedTotal");
		return this;
	}
	public SearchBulkInvoicesPage enterTo(WebDriver driver,String To) {
		BrowserActions.type(driver, inpTo,To, "To");
		return this;
	}
	public SearchBulkInvoicesPage clickReset(WebDriver driver)  {
		BrowserActions.click(driver, btnReset,"Reset");
		return this;
	}
	public SearchBulkInvoicesPage clickToDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnToDateIcon,"ToDateIcon");
		return this;
	}
	public SearchBulkInvoicesPage selectInvoiceApprovedTotal_2(WebDriver driver,String InvoiceApprovedTotal_2)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpInvoiceApprovedTotal_2,InvoiceApprovedTotal_2,"InvoiceApprovedTotal_2");
		return this;
	}
	public SearchBulkInvoicesPage enterMiddlename(WebDriver driver,String Middlename) {
		BrowserActions.type(driver, inpMiddlename,Middlename, "Middlename");
		return this;
	}
	public SearchBulkInvoicesPage selectDateSearchChosenOption(WebDriver driver,String DateSearchChosenOption)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpDateSearchChosenOption,DateSearchChosenOption,"DateSearchChosenOption");
		return this;
	}
	public SearchBulkInvoicesPage enterFrom(WebDriver driver,String From) {
		BrowserActions.type(driver, inpFrom,From, "From");
		return this;
	}
	public SearchBulkInvoicesPage enterClaim(WebDriver driver,String Claim) {
		BrowserActions.type(driver, inpClaim,Claim, "Claim");
		return this;
	}
	public SearchBulkInvoicesPage enterInvoice(WebDriver driver,String Invoice) {
		BrowserActions.type(driver, inpInvoice,Invoice, "Invoice");
		return this;
	}
	public SearchBulkInvoicesPage verifyInvoiceLabel(WebDriver driver) {
		BrowserActions.verifyElementDisplayed(driver, lblInvoice, "Invoice");
		Log.messageStep("Invoice Label is displayed",DriverManager.getDriver());		
		return this;
	}
	public SearchBulkInvoicesPage enterInvoiceApprovedTotal_1(WebDriver driver,String InvoiceApprovedTotal_1) {
		BrowserActions.type(driver, inpInvoiceApprovedTotal_1,InvoiceApprovedTotal_1, "InvoiceApprovedTotal_1");
		return this;
	}
	public SearchBulkInvoicesPage enterInvoiceApprovedTotal_3(WebDriver driver,String InvoiceApprovedTotal_3) {
		BrowserActions.type(driver, inpInvoiceApprovedTotal_3,InvoiceApprovedTotal_3, "InvoiceApprovedTotal_3");
		return this;
	}
	public SearchBulkInvoicesPage selectPrefix(WebDriver driver,String Prefix)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPrefix,Prefix,"Prefix");
		return this;
	}
	public SearchBulkInvoicesPage enterInvoiceApprovedTotal_5(WebDriver driver,String InvoiceApprovedTotal_5) {
		BrowserActions.type(driver, inpInvoiceApprovedTotal_5,InvoiceApprovedTotal_5, "InvoiceApprovedTotal_5");
		return this;
	}
	public SearchBulkInvoicesPage enterInvoiceApprovedTotal_4(WebDriver driver,String InvoiceApprovedTotal_4) {
		BrowserActions.type(driver, inpInvoiceApprovedTotal_4,InvoiceApprovedTotal_4, "InvoiceApprovedTotal_4");
		return this;
	}
	public SearchBulkInvoicesPage enterInvoiceApprovedTotal_6(WebDriver driver,String InvoiceApprovedTotal_6) {
		BrowserActions.type(driver, inpInvoiceApprovedTotal_6,InvoiceApprovedTotal_6, "InvoiceApprovedTotal_6");
		return this;
	}
	public SearchBulkInvoicesPage enterName(WebDriver driver,String Name) {
		BrowserActions.type(driver, inpName,Name, "Name");
		return this;
	}
	public SearchBulkInvoicesPage enterPayTo(WebDriver driver,String PayTo) {
		BrowserActions.type(driver, inpPayTo,PayTo, "PayTo");
		return this;
	}
	public SearchBulkInvoicesPage selectSince(WebDriver driver,String Since)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpSince,Since,"Since");
		return this;
	}
	public SearchBulkInvoicesPage enterPayeeFirstName(WebDriver driver,String PayeeFirstName) {
		BrowserActions.type(driver, inpPayeeFirstName,PayeeFirstName, "PayeeFirstName");
		return this;
	}
	public SearchBulkInvoicesPage clickFromDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnFromDateIcon,"FromDateIcon");
		return this;
	}
	public SearchBulkInvoicesPage selectSuffix(WebDriver driver,String Suffix)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpSuffix,Suffix,"Suffix");
		return this;
	}
	public SearchBulkInvoicesPage enterPayeeOrganizationName(WebDriver driver,String PayeeOrganizationName) {
		BrowserActions.type(driver, inpPayeeOrganizationName,PayeeOrganizationName, "PayeeOrganizationName");
		return this;
	}
	public SearchBulkInvoicesPage verifyTotalAmountValue(WebDriver driver) {
		BrowserActions.verifyElementDisplayed(driver, inpPayeeOrganizationName, "Total Amount");
		Log.messageStep("Total amount is displayed",DriverManager.getDriver());			
		return this;
	}
}
