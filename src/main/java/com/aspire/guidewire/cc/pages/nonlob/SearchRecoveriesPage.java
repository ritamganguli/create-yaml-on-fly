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

public class SearchRecoveriesPage extends LoadableComponent<SearchRecoveriesPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
	//	public TopNavBar topnavbar;
	//	public RecoverySearchResults recoverysearchresultsTable;

	@IFindBy(how = How.CSS, using = "input[name='RecoverySearch-RecoverySearchScreen-RecoverySearchDV-RecoverySearchOptionalInputSet-FinancialCurrencyLabel']", AI = false)
	private WebElement inpAmount;

	@IFindBy(how = How.CSS, using = "input[name='RecoverySearch-RecoverySearchScreen-RecoverySearchDV-RecoverySearchRequiredInputSet-GlobalPersonNameInputSet-Particle']", AI = false)
	private WebElement inpParticle;

	@IFindBy(how = How.CSS, using = "input[name='RecoverySearch-RecoverySearchScreen-RecoverySearchDV-RecoverySearchOptionalInputSet-FinancialAmountEnd']", AI = false)
	private WebElement inpAmount_6;

	@IFindBy(how = How.CSS, using = "input[name='RecoverySearch-RecoverySearchScreen-RecoverySearchDV-RecoverySearchOptionalInputSet-FinancialAmountStart']", AI = false)
	private WebElement inpAmount_4;

	@IFindBy(how = How.CSS, using = "input[name='RecoverySearch-RecoverySearchScreen-RecoverySearchDV-RecoverySearchOptionalInputSet-FinancialAmountEndLabel']", AI = false)
	private WebElement inpAmount_5;

	@IFindBy(how = How.CSS, using = "input[name='RecoverySearch-RecoverySearchScreen-RecoverySearchDV-RecoverySearchOptionalInputSet-FinancialAmountStartLabel']", AI = false)
	private WebElement inpAmount_3;

	@IFindBy(how = How.CSS, using = "input[name='RecoverySearch-RecoverySearchScreen-RecoverySearchDV-RecoverySearchOptionalInputSet-FinancialExpressionTypeLabel']", AI = false)
	private WebElement inpAmount_1;

	@IFindBy(how = How.CSS, using = "#RecoverySearch-RecoverySearchScreen-RecoverySearchDV-SearchAndResetInputSet-SearchLinksInputSet-Search", AI = false)
	private WebElement btnSearch;

	@IFindBy(how = How.CSS, using = "input[name='RecoverySearch-RecoverySearchScreen-RecoverySearchDV-RecoverySearchRequiredInputSet-GlobalContactNameInputSet-Name']", AI = false)
	private WebElement inpPayerOrganizationName;

	@IFindBy(how = How.CSS, using = "select[name='RecoverySearch-RecoverySearchScreen-RecoverySearchDV-RecoverySearchRequiredInputSet-CreatedBy']", AI = false)
	private WebElement drpCreatedBy;

	@IFindBy(how = How.CSS, using = "#RecoverySearch-RecoverySearchScreen-RecoverySearchDV-RecoverySearchRequiredInputSet-CreatedBy-CreatedByUserSearchMenuItem>div[role='menuitem']", AI = false)
	private WebElement btnSearchforaUser;

	@IFindBy(how = How.CSS, using = "#RecoverySearch-RecoverySearchScreen-RecoverySearchDV-RecoverySearchRequiredInputSet-CreatedBy-CreatedByMenuIcon>div[role='button']", AI = false)
	private WebElement btnCreatedByMenuIcon;

	@IFindBy(how = How.CSS, using = "input[name='RecoverySearch-RecoverySearchScreen-RecoverySearchDV-RecoverySearchOptionalInputSet-DateSearch-DateSearchEndDate']", AI = false)
	private WebElement inpTo;

	@IFindBy(how = How.CSS, using = "#RecoverySearch-RecoverySearchScreen-RecoverySearchDV-SearchAndResetInputSet-SearchLinksInputSet-Reset", AI = false)
	private WebElement btnReset;

	@IFindBy(how = How.CSS, using = "#RecoverySearch-RecoverySearchScreen-RecoverySearchResultsLV_tb-PrintButton>div[role='button']", AI = false)
	private WebElement btnPrintExport;

	@IFindBy(how = How.CSS, using = "#RecoverySearch-RecoverySearchScreen-RecoverySearchDV-RecoverySearchOptionalInputSet-DateSearch-DateSearchEndDate_dateIcon", AI = false)
	private WebElement btnToDateIcon;

	@IFindBy(how = How.CSS, using = "input[name='RecoverySearch-RecoverySearchScreen-RecoverySearchDV-RecoverySearchRequiredInputSet-GlobalPersonNameInputSet-LastName']", AI = false)
	private WebElement inpPayerLastName;

	@IFindBy(how = How.CSS, using = "select[name='RecoverySearch-RecoverySearchScreen-RecoverySearchDV-RecoverySearchOptionalInputSet-FinancialCurrency']", AI = false)
	private WebElement drpAmount;

	@IFindBy(how = How.CSS, using = "#RecoverySearch-RecoverySearchScreen-ttlBar", AI = false)
	private WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "select[name='RecoverySearch-RecoverySearchScreen-RecoverySearchDV-RecoverySearchOptionalInputSet-RecoveryCategory']", AI = false)
	private WebElement drpRecoveryCategory;

	@IFindBy(how = How.CSS, using = "input[name='RecoverySearch-RecoverySearchScreen-RecoverySearchDV-RecoverySearchRequiredInputSet-GlobalPersonNameInputSet-MiddleName']", AI = false)
	private WebElement inpMiddlename;

	@IFindBy(how = How.CSS, using = "select[name='RecoverySearch-RecoverySearchScreen-RecoverySearchDV-RecoverySearchOptionalInputSet-DateSearch-DateSearchChosenOption']", AI = false)
	private WebElement drpDateSearchChosenOption;

	@IFindBy(how = How.CSS, using = "select[name='RecoverySearch-RecoverySearchScreen-RecoverySearchDV-RecoverySearchOptionalInputSet-Status']", AI = false)
	private WebElement drpStatus;

	@IFindBy(how = How.CSS, using = "input[name='RecoverySearch-RecoverySearchScreen-RecoverySearchDV-RecoverySearchOptionalInputSet-DateSearch-DateSearchStartDate']", AI = false)
	private WebElement inpFrom;

	@IFindBy(how = How.CSS, using = "input[name='RecoverySearch-RecoverySearchScreen-RecoverySearchDV-RecoverySearchRequiredInputSet-ClaimNumber']", AI = false)
	private WebElement inpClaimNumber;

	@IFindBy(how = How.CSS, using = "input[name='RecoverySearch-RecoverySearchScreen-RecoverySearchDV-RecoverySearchRequiredInputSet-GlobalPersonNameInputSet-FirstName']", AI = false)
	private WebElement inpPayerFirstName;

	@IFindBy(how = How.CSS, using = "select[name='RecoverySearch-RecoverySearchScreen-RecoverySearchDV-RecoverySearchRequiredInputSet-GlobalPersonNameInputSet-Prefix']", AI = false)
	private WebElement drpPrefix;

	@IFindBy(how = How.CSS, using = "input[name='RecoverySearch-RecoverySearchScreen-RecoverySearchDV-RecoverySearchRequiredInputSet-GlobalPersonNameInputSet-NameSummary']", AI = false)
	private WebElement inpName;

	@IFindBy(how = How.CSS, using = "select[name='RecoverySearch-RecoverySearchScreen-RecoverySearchDV-RecoverySearchOptionalInputSet-DateSearch-DateSearchRangeValue']", AI = false)
	private WebElement drpSince;

	@IFindBy(how = How.CSS, using = "input[name='RecoverySearch-RecoverySearchScreen-RecoverySearchDV-RecoverySearchRequiredInputSet-TaxID']", AI = false)
	private WebElement inpPayerTaxID;

	@IFindBy(how = How.CSS, using = "#RecoverySearch-RecoverySearchScreen-RecoverySearchDV-RecoverySearchRequiredInputSet-CreatedBy-CreatedByUserSelectMenuItem>div[role='menuitem']", AI = false)
	private WebElement btnSelectUser;

	@IFindBy(how = How.CSS, using = "select[name='RecoverySearch-RecoverySearchScreen-RecoverySearchDV-RecoverySearchOptionalInputSet-CostType']", AI = false)
	private WebElement drpCostType;

	@IFindBy(how = How.CSS, using = "#RecoverySearch-RecoverySearchScreen-RecoverySearchDV-RecoverySearchOptionalInputSet-DateSearch-DateSearchStartDate_dateIcon", AI = false)
	private WebElement btnFromDateIcon;

	@IFindBy(how = How.CSS, using = "select[name='RecoverySearch-RecoverySearchScreen-RecoverySearchDV-RecoverySearchRequiredInputSet-GlobalPersonNameInputSet-Suffix']", AI = false)
	private WebElement drpSuffix;

	@IFindBy(how = How.CSS, using = "select[name='RecoverySearch-RecoverySearchScreen-RecoverySearchDV-RecoverySearchOptionalInputSet-FinancialChosenOption']", AI = false)
	private WebElement drpAmount_2;

	@IFindBy(how = How.CSS, using = "div[id$='-0-Status']", AI = false)
	private WebElement txtStatus;

	@IFindBy(how = How.CSS, using = "div[id$='LV-0-LossDate']", AI = false)
	private WebElement txtLossDate;

	@IFindBy(how = How.CSS, using = "div[id$='LV-0-RecoveryCategory']", AI = false)
	private WebElement txtRecoveryCategory;

	@IFindBy(how = How.CSS, using = "div[id$='LV-0-PayTo']", AI = false)
	private WebElement txtPayTo;

	@IFindBy(how = How.CSS, using = "div[id$='LV-0-Amount']", AI = false)
	private WebElement txtAmount;

	public SearchRecoveriesPage(){
	}

	public SearchRecoveriesPage(WebDriver driver){
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(finder, this);
		//	recoverysearchresultsTable = new RecoverySearchResults();
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
	}public SearchRecoveriesPage enterAmount(WebDriver driver,String Amount) {
		BrowserActions.type(driver, inpAmount,Amount, "Amount");
		return this;
	}
	public SearchRecoveriesPage enterParticle(WebDriver driver,String Particle) {
		BrowserActions.type(driver, inpParticle,Particle, "Particle");
		return this;
	}
	public SearchRecoveriesPage enterAmount_6(WebDriver driver,String Amount_6) {
		BrowserActions.type(driver, inpAmount_6,Amount_6, "Amount_6");
		return this;
	}
	public SearchRecoveriesPage enterAmount_4(WebDriver driver,String Amount_4) {
		BrowserActions.type(driver, inpAmount_4,Amount_4, "Amount_4");
		return this;
	}
	public SearchRecoveriesPage enterAmount_5(WebDriver driver,String Amount_5) {
		BrowserActions.type(driver, inpAmount_5,Amount_5, "Amount_5");
		return this;
	}
	public SearchRecoveriesPage enterAmount_3(WebDriver driver,String Amount_3) {
		BrowserActions.type(driver, inpAmount_3,Amount_3, "Amount_3");
		return this;
	}
	public SearchRecoveriesPage enterAmount_1(WebDriver driver,String Amount_1) {
		BrowserActions.type(driver, inpAmount_1,Amount_1, "Amount_1");
		return this;
	}
	public SearchRecoveriesPage clickSearch(WebDriver driver)  {
		BrowserActions.click(driver, btnSearch,"Search");
		return this;
	}
	public SearchRecoveriesPage enterPayerOrganizationName(WebDriver driver,String PayerOrganizationName) {
		BrowserActions.type(driver, inpPayerOrganizationName,PayerOrganizationName, "PayerOrganizationName");
		return this;
	}
	public SearchRecoveriesPage selectCreatedBy(WebDriver driver,String CreatedBy)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCreatedBy,CreatedBy,"CreatedBy");
		return this;
	}
	public SearchRecoveriesPage clickSearchforaUser(WebDriver driver)  {
		BrowserActions.click(driver, btnSearchforaUser,"SearchforaUser");
		return this;
	}
	public SearchRecoveriesPage clickCreatedByMenuIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnCreatedByMenuIcon,"CreatedByMenuIcon");
		return this;
	}
	public SearchRecoveriesPage enterTo(WebDriver driver,String To) {
		BrowserActions.type(driver, inpTo,To, "To");
		return this;
	}
	public SearchRecoveriesPage clickReset(WebDriver driver)  {
		BrowserActions.click(driver, btnReset,"Reset");
		return this;
	}
	public SearchRecoveriesPage clickPrintExport(WebDriver driver)  {
		BrowserActions.click(driver, btnPrintExport,"PrintExport");
		return this;
	}
	public SearchRecoveriesPage clickToDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnToDateIcon,"ToDateIcon");
		return this;
	}
	public SearchRecoveriesPage enterPayerLastName(WebDriver driver,String PayerLastName) {
		BrowserActions.type(driver, inpPayerLastName,PayerLastName, "PayerLastName");
		return this;
	}
	public SearchRecoveriesPage selectAmount(WebDriver driver,String Amount)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpAmount,Amount,"Amount");
		return this;
	}
	public SearchRecoveriesPage selectRecoveryCategory(WebDriver driver,String RecoveryCategory)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpRecoveryCategory,RecoveryCategory,"RecoveryCategory");
		return this;
	}
	public SearchRecoveriesPage enterMiddlename(WebDriver driver,String Middlename) {
		BrowserActions.type(driver, inpMiddlename,Middlename, "Middlename");
		return this;
	}
	public SearchRecoveriesPage selectDateSearchChosenOption(WebDriver driver,String DateSearchChosenOption)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpDateSearchChosenOption,DateSearchChosenOption,"DateSearchChosenOption");
		return this;
	}
	public SearchRecoveriesPage selectStatus(WebDriver driver,String Status)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpStatus,Status,"Status");
		return this;
	}
	public SearchRecoveriesPage enterFrom(WebDriver driver,String From) {
		BrowserActions.type(driver, inpFrom,From, "From");
		return this;
	}
	public SearchRecoveriesPage enterClaimNumber(WebDriver driver,String ClaimNumber) {
		BrowserActions.type(driver, inpClaimNumber,ClaimNumber, "ClaimNumber");
		return this;
	}
	public SearchRecoveriesPage enterPayerFirstName(WebDriver driver,String PayerFirstName) {
		BrowserActions.type(driver, inpPayerFirstName,PayerFirstName, "PayerFirstName");
		return this;
	}
	public SearchRecoveriesPage selectPrefix(WebDriver driver,String Prefix)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPrefix,Prefix,"Prefix");
		return this;
	}
	public SearchRecoveriesPage enterName(WebDriver driver,String Name) {
		BrowserActions.type(driver, inpName,Name, "Name");
		return this;
	}
	public SearchRecoveriesPage selectSince(WebDriver driver,String Since)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpSince,Since,"Since");
		return this;
	}
	public SearchRecoveriesPage enterPayerTaxID(WebDriver driver,String PayerTaxID) {
		BrowserActions.type(driver, inpPayerTaxID,PayerTaxID, "PayerTaxID");
		return this;
	}
	public SearchRecoveriesPage clickSelectUser(WebDriver driver)  {
		BrowserActions.click(driver, btnSelectUser,"SelectUser");
		return this;
	}
	public SearchRecoveriesPage selectCostType(WebDriver driver,String CostType)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCostType,CostType,"CostType");
		return this;
	}
	public SearchRecoveriesPage clickFromDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnFromDateIcon,"FromDateIcon");
		return this;
	}
	public SearchRecoveriesPage selectSuffix(WebDriver driver,String Suffix)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpSuffix,Suffix,"Suffix");
		return this;
	}
	public SearchRecoveriesPage selectAmount_2(WebDriver driver,String Amount_2)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpAmount_2,Amount_2,"Amount_2");
		return this;
	}
	public SearchRecoveriesPage verifyStatusValue(WebDriver driver)  {
		BrowserActions.verifyElementDisplayed(driver, txtStatus,"Status Value");
		Log.messageStep("Status value is displayed",DriverManager.getDriver());		
		return this;
	}
	public SearchRecoveriesPage verifyAmountvalue(WebDriver driver)  {
		BrowserActions.verifyElementDisplayed(driver, txtAmount,"Amount Value");
		Log.messageStep("Amount is displayed",DriverManager.getDriver());		
		return this;
	}
	public SearchRecoveriesPage verifyRecoveryCategoryvalue(WebDriver driver)  {
		BrowserActions.verifyElementDisplayed(driver, txtRecoveryCategory,"Recovery Category");
		Log.messageStep("Recovery Category value is displayed",DriverManager.getDriver());		
		return this;
	}
}
