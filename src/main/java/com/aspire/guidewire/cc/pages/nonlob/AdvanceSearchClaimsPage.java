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

public class AdvanceSearchClaimsPage extends LoadableComponent<AdvanceSearchClaimsPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
	//public TopNavBar topnavbar;
	@IFindBy(how = How.CSS, using = "input[name='ClaimSearch-ClaimSearchScreen-ClaimSearchDV-ClaimSearchOptionalInputSet-ArchiveDateSearch-ArchiveDateSearchEndDate']", AI = false)
	private WebElement inpTo_6;

	@IFindBy(how = How.CSS, using = "select[name='ClaimSearch-ClaimSearchScreen-ClaimSearchDV-ClaimSearchRequiredInputSet-AssignedToGroup']", AI = false)
	private WebElement drpAssignedToGroup;

	@IFindBy(how = How.CSS, using = "input[name='ClaimSearch-ClaimSearchScreen-ClaimSearchDV-ClaimSearchRequiredInputSet-GlobalPersonNameInputSet-Particle']", AI = false)
	private WebElement inpParticle;

	@IFindBy(how = How.CSS, using = "#ClaimSearch-ClaimSearchScreen-ClaimSearchDV-ClaimSearchRequiredInputSet-CreatedBy-CreatedByUserSearchMenuItem>div[role='menuitem']", AI = false)
	private WebElement btnSearchforaUser_1;

	@IFindBy(how = How.CSS, using = "#ClaimSearch-ClaimSearchScreen-ClaimSearchResultsLV_tb-ClaimSearchScreen_RetrieveButton>div[role='button']", AI = false)
	private WebElement btnRetrievefromArchive;

	@IFindBy(how = How.CSS, using = "select[name='ClaimSearch-ClaimSearchScreen-ClaimSearchDV-ClaimSearchOptionalInputSet-ArchiveDateSearch-ArchiveDateSearchChosenOption']", AI = false)
	private WebElement drpArchiveDateSearchChosenOption;

	@IFindBy(how = How.CSS, using = "input[name='ClaimSearch-ClaimSearchScreen-ClaimSearchDV-ClaimSearchRequiredInputSet-GlobalPersonNameInputSet-LastName']", AI = false)
	private WebElement inpLastname;

	@IFindBy(how = How.CSS, using = "select[name='ClaimSearch-ClaimSearchScreen-ClaimSearchDV-ClaimSearchOptionalInputSet-State']", AI = false)
	private WebElement drpJurisdiction;

	@IFindBy(how = How.CSS, using = "input[name='ClaimSearch-ClaimSearchScreen-ClaimSearchDV-ClaimSearchRequiredInputSet-PolicyNumber']", AI = false)
	private WebElement inpPolicy;

	@IFindBy(how = How.CSS, using = "input[name='ClaimSearch-ClaimSearchScreen-ClaimSearchDV-ClaimSearchOptionalInputSet-FinancialExpressionTypeLabel']", AI = false)
	private WebElement inpFinancialValue_8;

	@IFindBy(how = How.CSS, using = "#ClaimSearch-ClaimSearchScreen-ClaimSearchDV-ClaimSearchAndResetInputSet-Search", AI = false)
	private WebElement btnSearch;

	@IFindBy(how = How.CSS, using = "#ClaimSearch-ClaimSearchScreen-ClaimSearchDV-ClaimSearchRequiredInputSet-AssignedToUser-AssignedToUserMenuIcon>div[role='button']", AI = false)
	private WebElement btnAssignedToUserMenuIcon;

	@IFindBy(how = How.CSS, using = "select[name='ClaimSearch-ClaimSearchScreen-ClaimSearchDV-ClaimSearchRequiredInputSet-CreatedBy']", AI = false)
	private WebElement drpCreatedBy;

	@IFindBy(how = How.CSS, using = "#ClaimSearch-ClaimSearchScreen-ClaimSearchDV-ClaimSearchRequiredInputSet-CreatedBy-CreatedByUserSearchMenuItem", AI = false)
	private WebElement btnSearchforaUser;

	@IFindBy(how = How.CSS, using = "select[name='ClaimSearch-ClaimSearchScreen-ClaimSearchDV-ClaimSearchOptionalInputSet-FinancialCurrency']", AI = false)
	private WebElement drpFinancialValue;

	@IFindBy(how = How.CSS, using = "select[name='ClaimSearch-ClaimSearchScreen-ClaimSearchDV-ClaimSearchRequiredInputSet-SearchFor']", AI = false)
	private WebElement drpSearchFor;

	@IFindBy(how = How.CSS, using = "input[name='ClaimSearch-ClaimSearchScreen-ClaimSearchDV-ClaimSearchOptionalInputSet-FinancialCurrencyLabel']", AI = false)
	private WebElement inpFinancialValue;

	@IFindBy(how = How.CSS, using = "#ClaimSearch-ClaimSearchScreen-ClaimSearchDV-ClaimSearchRequiredInputSet-CreatedBy-CreatedByMenuIcon>div[role='button']", AI = false)
	private WebElement btnCreatedByMenuIcon;

	@IFindBy(how = How.CSS, using = "input[name='ClaimSearch-ClaimSearchScreen-ClaimSearchDV-ClaimSearchOptionalInputSet-DateSearch-DateSearchEndDate']", AI = false)
	private WebElement inpTo;

	@IFindBy(how = How.CSS, using = "#ClaimSearch-ClaimSearchScreen-ClaimSearchDV-ClaimSearchAndResetInputSet-Reset", AI = false)
	private WebElement btnReset;

	@IFindBy(how = How.CSS, using = "input[name='ClaimSearch-ClaimSearchScreen-ClaimSearchDV-ClaimSearchRequiredInputSet-GlobalPersonNameInputSet-FirstName']", AI = false)
	private WebElement inpFirstname;

	@IFindBy(how = How.CSS, using = "select[name='ClaimSearch-ClaimSearchScreen-ClaimSearchDV-ClaimSearchOptionalInputSet-IndicatorSearch']", AI = false)
	private WebElement drpHighRiskIndicators;

	@IFindBy(how = How.CSS, using = "#ClaimSearch-ClaimSearchScreen-ClaimSearchResultsLV_tb-ClaimSearchScreen_PrintButton>div[role='button']", AI = false)
	private WebElement btnPrintExport;

	@IFindBy(how = How.CSS, using = "#ClaimSearch-ClaimSearchScreen-ClaimSearchDV-ClaimSearchOptionalInputSet-DateSearch-DateSearchEndDate_dateIcon", AI = false)
	private WebElement btnToDateIcon;

	@IFindBy(how = How.CSS, using = "select[name='ClaimSearch-ClaimSearchScreen-ClaimSearchDV-ClaimSearchOptionalInputSet-ClaimStatus']", AI = false)
	private WebElement drpClaimStatus;

	@IFindBy(how = How.CSS, using = "#ClaimSearch-ClaimSearchScreen-ttlBar", AI = false)
	private WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "#ClaimSearch-ClaimSearchScreen-ClaimSearchDV-ClaimSearchRequiredInputSet-CreatedBy-CreatedByUserSelectMenuItem>div[role='menuitem']", AI = false)
	private WebElement btnSelectUser_2;

	@IFindBy(how = How.CSS, using = "input[name='ClaimSearch-ClaimSearchScreen-ClaimSearchDV-ClaimSearchRequiredInputSet-GlobalContactNameInputSet-Name']", AI = false)
	private WebElement inpOrganizationName;

	@IFindBy(how = How.CSS, using = "select[name='ClaimSearch-ClaimSearchScreen-ClaimSearchDV-ClaimSearchRequiredInputSet-CatNumber']", AI = false)
	private WebElement drpCat;

	@IFindBy(how = How.CSS, using = "input[id='ClaimSearch-ClaimSearchScreen-ClaimSearchDV-ClaimSearchRequiredInputSet-IncludeSubGroups_1']", AI = false)
	private WebElement rdbIncludeChildGroups;

	@IFindBy(how = How.CSS, using = "input[name='ClaimSearch-ClaimSearchScreen-ClaimSearchDV-ClaimSearchRequiredInputSet-LicensePlate']", AI = false)
	private WebElement inpLicensePlate;

	@IFindBy(how = How.CSS, using = "input[name='ClaimSearch-ClaimSearchScreen-ClaimSearchDV-ClaimSearchOptionalInputSet-ArchiveDateSearch-ArchiveDateSearchStartDate']", AI = false)
	private WebElement inpFrom_4;

	@IFindBy(how = How.CSS, using = "#ClaimSearch-ClaimSearchScreen-ClaimSearchDV-ClaimSearchOptionalInputSet-ArchiveDateSearch-ArchiveDateSearchStartDate_dateIcon", AI = false)
	private WebElement btnFromDateIcon_5;

	@IFindBy(how = How.CSS, using = "#ClaimSearch-ClaimSearchScreen-ClaimSearchDV-ClaimSearchOptionalInputSet-ArchiveDateSearch-ArchiveDateSearchEndDate_dateIcon", AI = false)
	private WebElement btnToDateIcon_7;

	@IFindBy(how = How.CSS, using = "#ClaimSearch-ClaimSearchScreen-ClaimSearchDV-ClaimSearchRequiredInputSet-AssignedToGroup-GroupSearchMenuIcon>div[role='menuitem']", AI = false)
	private WebElement btnSearchforGroup;

	@IFindBy(how = How.CSS, using = "select[name='ClaimSearch-ClaimSearchScreen-ClaimSearchDV-ClaimSearchOptionalInputSet-FlaggedType']", AI = false)
	private WebElement drpFlaggedType;
	
	@IFindBy(how = How.CSS, using = "select[name='ClaimSearch-ClaimSearchScreen-ClaimSearchDV-ClaimSearchOptionalInputSet-CoverageInQuestion']", AI = false)
	private WebElement drpCoverageInQuestion;

	@IFindBy(how = How.CSS, using = "input[name='ClaimSearch-ClaimSearchScreen-ClaimSearchDV-ClaimSearchRequiredInputSet-GlobalPersonNameInputSet-MiddleName']", AI = false)
	private WebElement inpMiddlename;

	@IFindBy(how = How.CSS, using = "select[name='ClaimSearch-ClaimSearchScreen-ClaimSearchDV-ClaimSearchOptionalInputSet-ArchiveDateSearch-ArchiveDateSearchRangeValue']", AI = false)
	private WebElement drpSince_3;

	@IFindBy(how = How.CSS, using = "select[name='ClaimSearch-ClaimSearchScreen-ClaimSearchDV-ClaimSearchOptionalInputSet-DateSearch-DateSearchChosenOption']", AI = false)
	private WebElement drpDateSearchChosenOption;

	@IFindBy(how = How.CSS, using = "input[name='ClaimSearch-ClaimSearchScreen-ClaimSearchDV-ClaimSearchOptionalInputSet-DateSearch-DateSearchStartDate']", AI = false)
	private WebElement inpFrom;

	@IFindBy(how = How.CSS, using = "input[name='ClaimSearch-ClaimSearchScreen-ClaimSearchDV-ClaimSearchRequiredInputSet-ClaimNumber']", AI = false)
	private WebElement inpClaim;

	@IFindBy(how = How.CSS, using = "select[name='ClaimSearch-ClaimSearchScreen-ClaimSearchDV-ClaimSearchOptionalInputSet-LossType']", AI = false)
	private WebElement drpLossType;

	@IFindBy(how = How.CSS, using = "input[name='ClaimSearch-ClaimSearchScreen-ClaimSearchDV-ClaimSearchRequiredInputSet-VinNumber']", AI = false)
	private WebElement inpVIN;

	@IFindBy(how = How.CSS, using = "select[name='ClaimSearch-ClaimSearchScreen-ClaimSearchDV-ClaimSearchRequiredInputSet-GlobalPersonNameInputSet-Prefix']", AI = false)
	private WebElement drpPrefix;

	@IFindBy(how = How.CSS, using = "input[name='ClaimSearch-ClaimSearchScreen-ClaimSearchDV-ClaimSearchOptionalInputSet-FinancialAmountEnd']", AI = false)
	private WebElement inpFinancialValue_13;

	@IFindBy(how = How.CSS, using = "input[name='ClaimSearch-ClaimSearchScreen-ClaimSearchDV-ClaimSearchOptionalInputSet-FinancialAmountStart']", AI = false)
	private WebElement inpFinancialValue_11;

	@IFindBy(how = How.CSS, using = "select[name='ClaimSearch-ClaimSearchScreen-ClaimSearchDV-ClaimSearchOptionalInputSet-LOB']", AI = false)
	private WebElement drpLineofBusiness;

	@IFindBy(how = How.CSS, using = "input[name='ClaimSearch-ClaimSearchScreen-ClaimSearchDV-ClaimSearchOptionalInputSet-FinancialAmountEndLabel']", AI = false)
	private WebElement inpFinancialValue_12;

	@IFindBy(how = How.CSS, using = "input[name='ClaimSearch-ClaimSearchScreen-ClaimSearchDV-ClaimSearchRequiredInputSet-GlobalPersonNameInputSet-NameSummary']", AI = false)
	private WebElement inpName;

	@IFindBy(how = How.CSS, using = "select[name='ClaimSearch-ClaimSearchScreen-ClaimSearchDV-ClaimSearchOptionalInputSet-DateSearch-DateSearchRangeValue']", AI = false)
	private WebElement drpSince;

	@IFindBy(how = How.CSS, using = "input[name='ClaimSearch-ClaimSearchScreen-ClaimSearchDV-ClaimSearchOptionalInputSet-FinancialAmountStartLabel']", AI = false)
	private WebElement inpFinancialValue_10;

	@IFindBy(how = How.CSS, using = "select[name='ClaimSearch-ClaimSearchScreen-ClaimSearchDV-ClaimSearchOptionalInputSet-FinancialChosenOption']", AI = false)
	private WebElement drpFinancialValue_9;

	@IFindBy(how = How.CSS, using = "select[name='ClaimSearch-ClaimSearchScreen-ClaimSearchDV-ClaimSearchOptionalInputSet-LitigationStatus']", AI = false)
	private WebElement drpLitigationStatus;

	@IFindBy(how = How.CSS, using = "#ClaimSearch-ClaimSearchScreen-ClaimSearchDV-ClaimSearchRequiredInputSet-AssignedToUser-AssignedToUserUserSelectMenuItem>div[role='menuitem']", AI = false)
	private WebElement btnSelectUser;

	@IFindBy(how = How.CSS, using = "#ClaimSearch-ClaimSearchScreen-ClaimSearchDV-ClaimSearchOptionalInputSet-DateSearch-DateSearchStartDate_dateIcon", AI = false)
	private WebElement btnFromDateIcon;

	@IFindBy(how = How.CSS, using = "select[name='ClaimSearch-ClaimSearchScreen-ClaimSearchDV-ClaimSearchType']", AI = false)
	private WebElement drpSource;

	@IFindBy(how = How.CSS, using = "select[name='ClaimSearch-ClaimSearchScreen-ClaimSearchDV-ClaimSearchRequiredInputSet-GlobalPersonNameInputSet-Suffix']", AI = false)
	private WebElement drpSuffix;

	@IFindBy(how = How.CSS, using = "input[name='ClaimSearch-ClaimSearchScreen-ClaimSearchDV-ClaimSearchRequiredInputSet-TaxID']", AI = false)
	private WebElement inpTaxID;

	@IFindBy(how = How.CSS, using = "#ClaimSearch-ClaimSearchScreen-ClaimSearchDV-ClaimSearchRequiredInputSet-AssignedToGroup-AssignedToGroupMenuIcon>div[role='button']", AI = false)
	private WebElement btnAssignedToGroupMenuIcon;

	@IFindBy(how = How.CSS, using = "#ClaimSearch-ClaimSearchScreen-ClaimSearchDV-ClaimSearchRequiredInputSet-AssignedToGroup-GroupPickerMenuIcon>div[role='menuitem']", AI = false)
	private WebElement btnSelectGroup;

	@IFindBy(how = How.CSS, using = "#ClaimSearch-ClaimSearchScreen-ClaimSearchResultsLV_tb-ClaimSearchScreen_AssignButton>div[role='button']", AI = false)
	private WebElement btnAssign;

	@IFindBy(how = How.CSS, using = "select[name='ClaimSearch-ClaimSearchScreen-ClaimSearchDV-ClaimSearchRequiredInputSet-AssignedToUser']", AI = false)
	private WebElement drpAssignedToUser;

	@IFindBy(how = How.CSS, using = "div[id$='LV-0-ClaimNumber_button']", AI = false)
	private WebElement lnkClaimNumber;

	@IFindBy(how = How.CSS, using = "div[id$='LV-0-Insured']", AI = false)
	private WebElement txtInsured;

	@IFindBy(how = How.CSS, using = "td[id$='LV-0-PolicyID_Cell']", AI = false)
	private WebElement txtPolicy;

	@IFindBy(how = How.CSS, using = "div[id$='ClaimantHeader']", AI = false)
	private WebElement txtClaimant;

	@IFindBy(how = How.CSS, using = "div[id$='LV-0-Status']", AI = false)
	private WebElement txtStatus;

	@IFindBy(how = How.CSS, using = "div[id$='LV-0-LossDate']", AI = false)
	private WebElement txtLossDate;

	@IFindBy(how = How.CSS, using = "select[name$='PendingAssignment']", AI = false)
	private WebElement drpPendingAssignment;


	public AdvanceSearchClaimsPage(){
	}

	public AdvanceSearchClaimsPage(WebDriver driver){
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(finder, this);
	}
	@Override
	protected void load() {
		isPageLoaded = true;
		WaitUtils.waitForPageLoad(driver);
	}@Override
	protected void isLoaded() {
		if (!isPageLoaded) {
			Assert.fail();
		}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, drpAssignedToUser))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);
	}public AdvanceSearchClaimsPage enterTo_6(WebDriver driver,String To_6) {
		BrowserActions.type(driver, inpTo_6,To_6, "To_6");
		return this;
	}
	public AdvanceSearchClaimsPage selectAssignedToGroup(WebDriver driver,String AssignedToGroup)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpAssignedToGroup,AssignedToGroup,"AssignedToGroup");
		return this;
	}
	public AdvanceSearchClaimsPage enterParticle(WebDriver driver,String Particle) {
		BrowserActions.type(driver, inpParticle,Particle, "Particle");
		return this;
	}
	public AdvanceSearchClaimsPage clickSearchforaUser_1(WebDriver driver)  {
		BrowserActions.click(driver, btnSearchforaUser_1,"SearchforaUser_1");
		return this;
	}
	public AdvanceSearchClaimsPage clickRetrievefromArchive(WebDriver driver)  {
		BrowserActions.click(driver, btnRetrievefromArchive,"RetrievefromArchive");
		return this;
	}
	public AdvanceSearchClaimsPage selectArchiveDateSearchChosenOption(WebDriver driver,String ArchiveDateSearchChosenOption)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpArchiveDateSearchChosenOption,ArchiveDateSearchChosenOption,"ArchiveDateSearchChosenOption");
		return this;
	}
	public AdvanceSearchClaimsPage enterLastname(WebDriver driver,String Lastname) {
		BrowserActions.type(driver, inpLastname,Lastname, "Lastname");
		Log.messageStep("Enter Last Name :" +Lastname, DriverManager.getDriver());
		return this;
	}
	public AdvanceSearchClaimsPage selectJurisdiction(WebDriver driver,String Jurisdiction)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpJurisdiction,Jurisdiction,"Jurisdiction");
		return this;
	}
	public AdvanceSearchClaimsPage enterPolicy(WebDriver driver,String Policy) {
		BrowserActions.type(driver, inpPolicy,Policy, "Policy");
		return this;
	}
	public AdvanceSearchClaimsPage enterFinancialValue_8(WebDriver driver,String FinancialValue_8) {
		BrowserActions.type(driver, inpFinancialValue_8,FinancialValue_8, "FinancialValue_8");
		return this;
	}
	public AdvanceSearchClaimsPage clickSearch(WebDriver driver)  {
		BrowserActions.click(driver, btnSearch,true,"Search");
		Log.messageStep("Clicked on Search ", DriverManager.getDriver());
		return this;
	}
	public AdvanceSearchClaimsPage clickAssignedToUserMenuIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnAssignedToUserMenuIcon,"AssignedToUserMenuIcon");
		return this;
	}
	public AdvanceSearchClaimsPage selectCreatedBy(WebDriver driver,String CreatedBy)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCreatedBy,CreatedBy,"CreatedBy");
		return this;
	}
	public SearchUsersPage clickSearchforaUser(WebDriver driver)  {
		BrowserActions.click(driver, btnSearchforaUser,"SearchforaUser");
		return new SearchUsersPage(driver).get();
	}
	public AdvanceSearchClaimsPage selectFinancialValue(WebDriver driver,String FinancialValue)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpFinancialValue,FinancialValue,"FinancialValue");
		return this;
	}
	public AdvanceSearchClaimsPage selectSearchFor(WebDriver driver,String SearchFor)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpSearchFor,SearchFor,1,"SearchFor");
		Log.messageStep("Select Search for :"+SearchFor, DriverManager.getDriver());
		return this;
	}
	public AdvanceSearchClaimsPage enterFinancialValue(WebDriver driver,String FinancialValue) {
		BrowserActions.type(driver, inpFinancialValue,FinancialValue, "FinancialValue");
		return this;
	}
	public AdvanceSearchClaimsPage clickCreatedByMenuIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnCreatedByMenuIcon,1,"CreatedByMenuIcon");
		return this;
	}
	public AdvanceSearchClaimsPage enterTo(WebDriver driver,String To) {
		BrowserActions.type(driver, inpTo,To, "To");
		return this;
	}
	public AdvanceSearchClaimsPage clickReset(WebDriver driver)  {
		BrowserActions.click(driver, btnReset,"Reset");
		return this;
	}
	public AdvanceSearchClaimsPage enterFirstname(WebDriver driver,String Firstname) {
		BrowserActions.type(driver, inpFirstname,Firstname, "Firstname");
		return this;
	}
	public AdvanceSearchClaimsPage selectHighRiskIndicators(WebDriver driver,String HighRiskIndicators)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpHighRiskIndicators,HighRiskIndicators,"HighRiskIndicators");
		return this;
	}
	public AdvanceSearchClaimsPage clickPrintExport(WebDriver driver)  {
		BrowserActions.click(driver, btnPrintExport,"PrintExport");
		return this;
	}
	public AdvanceSearchClaimsPage clickToDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnToDateIcon,"ToDateIcon");
		return this;
	}
	public AdvanceSearchClaimsPage selectClaimStatus(WebDriver driver,String ClaimStatus)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpClaimStatus,ClaimStatus,"ClaimStatus");
		return this;
	}
	public AdvanceSearchClaimsPage clickSelectUser_2(WebDriver driver)  {
		BrowserActions.click(driver, btnSelectUser_2,"SelectUser_2");
		return this;
	}
	public AdvanceSearchClaimsPage enterOrganizationName(WebDriver driver,String OrganizationName) {
		BrowserActions.type(driver, inpOrganizationName,OrganizationName, "OrganizationName");
		return this;
	}
	public AdvanceSearchClaimsPage selectCat(WebDriver driver,String Cat)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCat,Cat,"Cat");
		return this;
	}
	public AdvanceSearchClaimsPage clickIncludeChildGroupsNo(WebDriver driver)  {
		BrowserActions.click(driver, rdbIncludeChildGroups,0.5,"IncludeChildGroups");

		return this;
	}
	public AdvanceSearchClaimsPage enterLicensePlate(WebDriver driver,String LicensePlate) {
		BrowserActions.type(driver, inpLicensePlate,LicensePlate, "LicensePlate");
		return this;
	}
	public AdvanceSearchClaimsPage enterFrom_4(WebDriver driver,String From_4) {
		BrowserActions.type(driver, inpFrom_4,From_4, "From_4");
		return this;
	}
	public AdvanceSearchClaimsPage clickFromDateIcon_5(WebDriver driver)  {
		BrowserActions.click(driver, btnFromDateIcon_5,"FromDateIcon_5");
		return this;
	}
	public AdvanceSearchClaimsPage clickToDateIcon_7(WebDriver driver)  {
		BrowserActions.click(driver, btnToDateIcon_7,"ToDateIcon_7");
		return this;
	}
	public AdvanceSearchClaimsPage clickSearchforGroup(WebDriver driver)  {
		BrowserActions.click(driver, btnSearchforGroup,"SearchforGroup");
		return this;
	}
	public AdvanceSearchClaimsPage selectFlaggedType(WebDriver driver,String FlaggedType)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpFlaggedType,FlaggedType,"FlaggedType");
		return this;
	}
	public AdvanceSearchClaimsPage selectCoverageInQuestion(WebDriver driver,String Coverageinquestion)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCoverageInQuestion,Coverageinquestion,"Coverage in question");
		return this;
	}
	public AdvanceSearchClaimsPage enterMiddlename(WebDriver driver,String Middlename) {
		BrowserActions.type(driver, inpMiddlename,Middlename, "Middlename");
		return this;
	}
	public AdvanceSearchClaimsPage selectSince_3(WebDriver driver,String Since_3)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpSince_3,Since_3,"Since_3");
		return this;
	}
	public AdvanceSearchClaimsPage selectDateSearchChosenOption(WebDriver driver,String DateSearchChosenOption)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpDateSearchChosenOption,DateSearchChosenOption,"DateSearchChosenOption");
		return this;
	}
	public AdvanceSearchClaimsPage enterFrom(WebDriver driver,String From) {
		BrowserActions.type(driver, inpFrom,From, "From");
		return this;
	}
	public AdvanceSearchClaimsPage enterClaim(WebDriver driver,String Claim) {
		BrowserActions.type(driver, inpClaim,Claim, "Claim");
		Log.messageStep("Entered CLaim number : " +Claim, DriverManager.getDriver());
		return this;
	}
	public AdvanceSearchClaimsPage selectLossType(WebDriver driver,String LossType)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpLossType,LossType,"LossType");
		return this;
	}
	public AdvanceSearchClaimsPage enterVIN(WebDriver driver,String VIN) {
		BrowserActions.type(driver, inpVIN,VIN, "VIN");
		return this;
	}
	public AdvanceSearchClaimsPage selectPrefix(WebDriver driver,String Prefix)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPrefix,Prefix,"Prefix");
		return this;
	}
	public AdvanceSearchClaimsPage enterFinancialValue_13(WebDriver driver,String FinancialValue_13) {
		BrowserActions.type(driver, inpFinancialValue_13,FinancialValue_13, "FinancialValue_13");
		return this;
	}
	public AdvanceSearchClaimsPage enterFinancialValue_11(WebDriver driver,String FinancialValue_11) {
		BrowserActions.type(driver, inpFinancialValue_11,FinancialValue_11, "FinancialValue_11");
		return this;
	}
	public AdvanceSearchClaimsPage selectLineofBusiness(WebDriver driver,String LineofBusiness)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpLineofBusiness,LineofBusiness,1,"LineofBusiness");
		Log.messageStep("Select line of Business :" +LineofBusiness, DriverManager.getDriver());
		return this;
	}
	public AdvanceSearchClaimsPage enterFinancialValue_12(WebDriver driver,String FinancialValue_12) {
		BrowserActions.type(driver, inpFinancialValue_12,FinancialValue_12, "FinancialValue_12");
		return this;
	}
	public AdvanceSearchClaimsPage enterName(WebDriver driver,String Name) {
		BrowserActions.type(driver, inpName,Name, "Name");
		return this;
	}
	public AdvanceSearchClaimsPage selectSince(WebDriver driver,String Since)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpSince,Since,"Since");
		return this;
	}
	public AdvanceSearchClaimsPage enterFinancialValue_10(WebDriver driver,String FinancialValue_10) {
		BrowserActions.type(driver, inpFinancialValue_10,FinancialValue_10, "FinancialValue_10");
		return this;
	}
	public AdvanceSearchClaimsPage selectFinancialValue_9(WebDriver driver,String FinancialValue_9)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpFinancialValue_9,FinancialValue_9,"FinancialValue_9");
		return this;
	}
	public AdvanceSearchClaimsPage selectLitigationStatus(WebDriver driver,String LitigationStatus)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpLitigationStatus,LitigationStatus,"LitigationStatus");
		return this;
	}
	public AdvanceSearchClaimsPage clickSelectUser(WebDriver driver)  {
		BrowserActions.click(driver, btnSelectUser,"SelectUser");
		return this;
	}
	public AdvanceSearchClaimsPage clickFromDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnFromDateIcon,"FromDateIcon");
		return this;
	}
	public AdvanceSearchClaimsPage selectSource(WebDriver driver,String Source)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpSource,Source,"Source");
		return this;
	}
	public AdvanceSearchClaimsPage selectSuffix(WebDriver driver,String Suffix)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpSuffix,Suffix,"Suffix");
		return this;
	}
	public AdvanceSearchClaimsPage enterTaxID(WebDriver driver,String TaxID) {
		BrowserActions.type(driver, inpTaxID,TaxID, "TaxID");
		Log.messageStep("Enter Tax Id :" +TaxID, DriverManager.getDriver());
		return this;
	}
	public AdvanceSearchClaimsPage clickAssignedToGroupMenuIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnAssignedToGroupMenuIcon,1,"AssignedToGroupMenuIcon");
		return this;
	}
	public BrowseGroupPage clickSelectGroup(WebDriver driver)  {
		BrowserActions.click(driver, btnSelectGroup,1,"SelectGroup");
		return new BrowseGroupPage(driver).get();
	}
	public AdvanceSearchClaimsPage clickAssign(WebDriver driver)  {
		BrowserActions.click(driver, btnAssign,"Assign");
		return this;
	}
	public AdvanceSearchClaimsPage selectAssignedToUser(WebDriver driver,String AssignedToUser)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpAssignedToUser,AssignedToUser,"AssignedToUser");
		return this;
	}
	public AdvanceSearchClaimsPage verifyClaimantValue(WebDriver driver)  {
		BrowserActions.verifyElementDisplayed(driver, lnkClaimNumber,"Claim Number");
		return this;
	}
	public AdvanceSearchClaimsPage verifyInsuredName(WebDriver driver)  {
		BrowserActions.verifyElementDisplayed(driver, lnkClaimNumber,"Claim Number");
		return this;
	}
	public AdvanceSearchClaimsPage verifyPolicyValue(WebDriver driver)  {
		BrowserActions.verifyElementDisplayed(driver, txtPolicy,"Policy Number");
		return this;
	}
	public AdvanceSearchClaimsPage verifyClaimantName(WebDriver driver)  {
		BrowserActions.verifyElementDisplayed(driver, txtClaimant,"Claimant Name");
		return this;
	}
	public AdvanceSearchClaimsPage verifyLossDateValue(WebDriver driver)  {
		BrowserActions.verifyElementDisplayed(driver, txtLossDate,"Loss Date Value");
		return this;
	}
	public AdvanceSearchClaimsPage verifyStatusValue(WebDriver driver)  {
		BrowserActions.verifyElementDisplayed(driver, txtStatus,"Status Value");
		Log.messageStep("Verfied all necessary Values in Search Result", DriverManager.getDriver());
		return this;
	}
	public void clickClaimLink(WebDriver driver)  {
		BrowserActions.click(driver, lnkClaimNumber,"Claim Link");
		Log.messageStep("Clicked on Claim Link", DriverManager.getDriver());

	}
	public AdvanceSearchClaimsPage selectPendingAssignment(WebDriver driver,String pendingAssignment)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPendingAssignment,pendingAssignment,"pending Assignment");
		return this;
	}

}
