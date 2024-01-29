package com.aspire.guidewire.pc.pages.nonlob;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.testng.Assert;

import com.aspire.guidewire.pc.pages.common.QuotePage;
import com.aspire.guidewire.utils.BrowserActions;
import com.aspire.guidewire.utils.ElementLayer;
import com.aspire.guidewire.utils.Log;
import com.aspire.guidewire.utils.WaitUtils;

import ASPIREAI.customfactories.AjaxElementLocatorFactory;
import ASPIREAI.customfactories.IFindBy;
import ASPIREAI.customfactories.PageFactory;

public class SearchPoliciesPage extends LoadableComponent<SearchPoliciesPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	@IFindBy(how = How.CSS, using = "input[name='PolicySearch-PolicySearchScreen-SolrPolicySearchPanelSet-searchProducer']", AI = false)
	public WebElement inpProducerofRecord;

	@IFindBy(how = How.CSS, using = "input[name='PolicySearch-PolicySearchScreen-SolrPolicySearchPanelSet-searchStreet']", AI = false)
	public WebElement inpStreet;

	@IFindBy(how = How.CSS, using = "input[name='PolicySearch-PolicySearchScreen-DatabasePolicySearchPanelSet-PolicySearchDV-TaxID']", AI = false)
	public WebElement inpOfficialID_7;

	@IFindBy(how = How.CSS, using = "input[name='PolicySearch-PolicySearchScreen-SolrPolicySearchPanelSet-searchProducerCode']", AI = false)
	public WebElement inpProducerCode;

	@IFindBy(how = How.CSS, using = "input[name='PolicySearch-PolicySearchScreen-DatabasePolicySearchPanelSet-PolicySearchDV-GlobalPersonNameInputSet-LastName']", AI = false)
	public WebElement inpLastname;

	@IFindBy(how = How.CSS, using = "#PolicySearch-PolicySearchScreen-DatabasePolicySearchPanelSet-PolicySearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-PostalCode-AutoFillIcon", AI = false)
	public WebElement btnAutoFillIcon_5;

	@IFindBy(how = How.CSS, using = "select[name='PolicySearch-PolicySearchScreen-SolrPolicySearchPanelSet-searchJurisdiction']", AI = false)
	public WebElement drpJurisdiction;

	@IFindBy(how = How.CSS, using = "input[name='PolicySearch-PolicySearchScreen-DatabasePolicySearchPanelSet-PolicySearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-County']", AI = false)
	public WebElement inpCounty;

	@IFindBy(how = How.CSS, using = "select[name='PolicySearch-PolicySearchScreen-DatabasePolicySearchPanelSet-PolicySearchDV-UWCompany']", AI = false)
	public WebElement drpUnderwritingCompany;

	@IFindBy(how = How.CSS, using = "select[name='PolicySearch-PolicySearchScreen-DatabasePolicySearchPanelSet-PolicySearchDV-RejectReason']", AI = false)
	public WebElement drpDeclinationReason;

	@IFindBy(how = How.CSS, using = "#PolicySearch-PolicySearchScreen-solrSearchTab", AI = false)
	public WebElement btnBasic;

	@IFindBy(how = How.CSS, using = "input[name='PolicySearch-PolicySearchScreen-DatabasePolicySearchPanelSet-PolicySearchDV-DateRangeForJobSearch-DateRangeForJobSearchEndDate']", AI = false)
	public WebElement inpTo;

	@IFindBy(how = How.CSS, using = "input[name='PolicySearch-PolicySearchScreen-DatabasePolicySearchPanelSet-PolicySearchDV-GlobalPersonNameInputSet-FirstName']", AI = false)
	public WebElement inpFirstname;

	@IFindBy(how = How.CSS, using = "#PolicySearch-PolicySearchScreen-DatabasePolicySearchPanelSet-PolicySearchDV-DateRangeForJobSearch-DateRangeForJobSearchEndDate_dateIcon", AI = false)
	public WebElement btnToDateIcon;

	@IFindBy(how = How.CSS, using = "input[name='PolicySearch-PolicySearchScreen-DatabasePolicySearchPanelSet-PolicySearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine3']", AI = false)
	public WebElement inpAddress3;

	@IFindBy(how = How.CSS, using = "select[name='PolicySearch-PolicySearchScreen-DatabasePolicySearchPanelSet-PolicySearchDV-State']", AI = false)
	public WebElement drpJurisdiction_10;

	@IFindBy(how = How.CSS, using = "input[name='PolicySearch-PolicySearchScreen-DatabasePolicySearchPanelSet-PolicySearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine1']", AI = false)
	public WebElement inpAddress1;

	@IFindBy(how = How.CSS, using = "input[name='PolicySearch-PolicySearchScreen-DatabasePolicySearchPanelSet-PolicySearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine2']", AI = false)
	public WebElement inpAddress2;

	@IFindBy(how = How.CSS, using = "input[name='PolicySearch-PolicySearchScreen-DatabasePolicySearchPanelSet-PolicySearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressSummary']", AI = false)
	public WebElement inpAddress;

	@IFindBy(how = How.CSS, using = "input[name='PolicySearch-PolicySearchScreen-DatabasePolicySearchPanelSet-PolicySearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-PostalCode']", AI = false)
	public WebElement inpZIPCode;

	@IFindBy(how = How.CSS, using = "#PolicySearch-PolicySearchScreen-DatabasePolicySearchPanelSet-PolicySearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-City-AutoFillIcon", AI = false)
	public WebElement btnAutoFillIcon;

	@IFindBy(how = How.CSS, using = "input[name$='PolicyNumberCriterion']", AI = false)
	public WebElement inpPolicyNumber;

	@IFindBy(how = How.CSS, using = "input[name='PolicySearch-PolicySearchScreen-DatabasePolicySearchPanelSet-PolicySearchDV-DateRangeForJobSearch-DateRangeForJobSearchStartDate']", AI = false)
	public WebElement inpFrom;

	@IFindBy(how = How.CSS, using = "select[name='PolicySearch-PolicySearchScreen-DatabasePolicySearchPanelSet-PolicySearchDV-GlobalPersonNameInputSet-Prefix']", AI = false)
	public WebElement drpPrefix;

	@IFindBy(how = How.CSS, using = "input[name='PolicySearch-PolicySearchScreen-SolrPolicySearchPanelSet-searchName']", AI = false)
	public WebElement inpName;

	@IFindBy(how = How.CSS, using = "select[name='PolicySearch-PolicySearchScreen-DatabasePolicySearchPanelSet-PolicySearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-Country']", AI = false)
	public WebElement drpCountry;

	@IFindBy(how = How.CSS, using = "#PolicySearch-PolicySearchScreen-DatabasePolicySearchPanelSet-PolicySearchDV-DateRangeForJobSearch-DateRangeForJobSearchStartDate_dateIcon", AI = false)
	public WebElement btnFromDateIcon;

	@IFindBy(how = How.CSS, using = "select[name$='State']", AI = false)
	public WebElement drpState;

	@IFindBy(how = How.CSS, using = "select[name='PolicySearch-PolicySearchScreen-DatabasePolicySearchPanelSet-PolicySearchDV-GlobalPersonNameInputSet-Suffix']", AI = false)
	public WebElement drpSuffix;

	@IFindBy(how = How.CSS, using = "select[name='PolicySearch-PolicySearchScreen-DatabasePolicySearchPanelSet-PolicySearchDV-AuditMethod']", AI = false)
	public WebElement drpAuditMethod;

	@IFindBy(how = How.CSS, using = "input[name='PolicySearch-PolicySearchScreen-SolrPolicySearchPanelSet-searchPostalCode']", AI = false)
	public WebElement inpPostalCode;

	@IFindBy(how = How.CSS, using = "#PolicySearch-PolicySearchScreen-SolrPolicySearchPanelSet-searchProducer-SelectOrganization", AI = false)
	public WebElement btnSelectOrganization;

	@IFindBy(how = How.CSS, using = "select[name='PolicySearch-PolicySearchScreen-DatabasePolicySearchPanelSet-PolicySearchDV-DateFieldToSearchType']", AI = false)
	public WebElement drpDateFieldtoSearch;

	@IFindBy(how = How.CSS, using = "input[name='PolicySearch-PolicySearchScreen-DatabasePolicySearchPanelSet-PolicySearchDV-GlobalPersonNameInputSet-NameSummary']", AI = false)
	public WebElement inpName_2;

	@IFindBy(how = How.CSS, using = "select[name='PolicySearch-PolicySearchScreen-DatabasePolicySearchPanelSet-PolicySearchDV-ProductName']", AI = false)
	public WebElement drpProduct_9;

	@IFindBy(how = How.CSS, using = "input[name='PolicySearch-PolicySearchScreen-DatabasePolicySearchPanelSet-PolicySearchDV-PolicyNumberCriterion']", AI = false)
	public WebElement inpPolicyNumber_8;

	@IFindBy(how = How.CSS, using = "input[name='PolicySearch-PolicySearchScreen-DatabasePolicySearchPanelSet-PolicySearchDV-CompanyNameExact']", AI = false)
	public WebElement chkCompanynameisanexactmatch;

	@IFindBy(how = How.CSS, using = "input[name='PolicySearch-PolicySearchScreen-SolrPolicySearchPanelSet-searchOfficialId']", AI = false)
	public WebElement inpOfficialID;

	@IFindBy(how = How.CSS, using = "input[name='PolicySearch-PolicySearchScreen-DatabasePolicySearchPanelSet-PolicySearchDV-GlobalPersonNameInputSet-Particle']", AI = false)
	public WebElement inpParticle;

	@IFindBy(how = How.CSS, using = "#PolicySearch-PolicySearchScreen-SolrPolicySearchPanelSet-InForceOnDate_dateIcon", AI = false)
	public WebElement btnInForceOnDateIcon;

	@IFindBy(how = How.CSS, using = "input[name$='City']", AI = false)
	public WebElement inpCity;

	@IFindBy(how = How.CSS, using = "input[name='PolicySearch-PolicySearchScreen-DatabasePolicySearchPanelSet-PolicySearchDV-LastNameExact']", AI = false)
	public WebElement chkLastnameisanexactmatch;

	@IFindBy(how = How.CSS, using = "input[name='PolicySearch-PolicySearchScreen-DatabasePolicySearchPanelSet-PolicySearchDV-AssignedRisk']", AI = false)
	public WebElement rdbAssignedRisk;

	@IFindBy(how = How.CSS, using = "#PolicySearch-PolicySearchScreen-dbSearchTab", AI = false)
	public WebElement btnAdvanced;

	@IFindBy(how = How.CSS, using = "#PolicySearch-PolicySearchScreen-SolrPolicySearchPanelSet-searchProducerCode-SelectProducerCode", AI = false)
	public WebElement btnSearch;

	@IFindBy(how = How.CSS, using = "#PolicySearch-PolicySearchScreen-DatabasePolicySearchPanelSet-PolicySearchDV-AsOfDate_dateIcon", AI = false)
	public WebElement btnAsofDateDateIcon;

	@IFindBy(how = How.CSS, using = "#PolicySearch-PolicySearchScreen-DatabasePolicySearchPanelSet-PolicySearchDV-SearchAndResetInputSet-SearchLinksInputSet-Reset", AI = false)
	public WebElement btnReset_15;

	@IFindBy(how = How.CSS, using = "select[name='PolicySearch-PolicySearchScreen-DatabasePolicySearchPanelSet-PolicySearchDV-NonRenewalCode']", AI = false)
	public WebElement drpNonRenewalCode;

	@IFindBy(how = How.CSS, using = "input[name='PolicySearch-PolicySearchScreen-DatabasePolicySearchPanelSet-PolicySearchDV-GlobalContactNameInputSet-Name']", AI = false)
	public WebElement inpCompanyName;

	@IFindBy(how = How.CSS, using = "select[name='PolicySearch-PolicySearchScreen-DatabasePolicySearchPanelSet-PolicySearchDV-SearchFor']", AI = false)
	public WebElement drpSearchFor;

	@IFindBy(how = How.CSS, using = "input[name='PolicySearch-PolicySearchScreen-SolrPolicySearchPanelSet-searchPhone']", AI = false)
	public WebElement inpPhone;

	@IFindBy(how = How.CSS, using = "#PolicySearch-PolicySearchScreen-SolrPolicySearchPanelSet-SearchAndResetInputSet-SearchLinksInputSet-Reset", AI = false)
	public WebElement btnReset;

	@IFindBy(how = How.CSS, using = "#PolicySearch-PolicySearchScreen-DatabasePolicySearchPanelSet-PolicySearchDV-ProducerCode-SelectProducerCode", AI = false)
	public WebElement btnSearch_13;

	@IFindBy(how = How.CSS, using = "#PolicySearch-PolicySearchScreen-DatabasePolicySearchPanelSet-PolicySearchDV-SearchAndResetInputSet-SearchLinksInputSet-Search", AI = false)
	public WebElement btnSearch_14;

	@IFindBy(how = How.CSS, using = "#PolicySearch-PolicySearchScreen-DatabasePolicySearchPanelSet-SearchResultsToolbar-PrintMe>div[role='button']", AI = false)
	public WebElement btnPrintExport;

	@IFindBy(how = How.CSS, using = "input[name='PolicySearch-PolicySearchScreen-SolrPolicySearchPanelSet-InForceOnDate']", AI = false)
	public WebElement inpInForceOn;

	@IFindBy(how = How.CSS, using = "#PolicySearch-PolicySearchScreen-DatabasePolicySearchPanelSet-PolicySearchDV-Producer-SelectOrganization", AI = false)
	public WebElement btnSelectOrganization_11;

	@IFindBy(how = How.CSS, using = "#PolicySearch-PolicySearchScreen-ttlBar", AI = false)
	public WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "input[name='PolicySearch-PolicySearchScreen-DatabasePolicySearchPanelSet-PolicySearchDV-Producer']", AI = false)
	public WebElement inpProducer;

	@IFindBy(how = How.CSS, using = "select[name='PolicySearch-PolicySearchScreen-DatabasePolicySearchPanelSet-PolicySearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-State']", AI = false)
	public WebElement drpState_4;

	@IFindBy(how = How.CSS, using = "input[name='PolicySearch-PolicySearchScreen-DatabasePolicySearchPanelSet-PolicySearchDV-AccountNumber']", AI = false)
	public WebElement inpAccountNumber;

	@IFindBy(how = How.CSS, using = "input[name='PolicySearch-PolicySearchScreen-DatabasePolicySearchPanelSet-PolicySearchDV-GlobalPersonNameInputSet-MiddleName']", AI = false)
	public WebElement inpMiddlename;

	@IFindBy(how = How.CSS, using = "input[name='PolicySearch-PolicySearchScreen-DatabasePolicySearchPanelSet-PolicySearchDV-FirstNameExact']", AI = false)
	public WebElement chkFirstnameisanexactmatch;

	@IFindBy(how = How.CSS, using = "#PolicySearch-PolicySearchScreen-SolrPolicySearchPanelSet-SearchAndResetInputSet-SearchLinksInputSet-Search", AI = false)
	public WebElement btnSearch_1;

	@IFindBy(how = How.CSS, using = "input[name='PolicySearch-PolicySearchScreen-DatabasePolicySearchPanelSet-PolicySearchDV-SubmissionNumber']", AI = false)
	public WebElement inpSubmissionNumber;

	@IFindBy(how = How.CSS, using = "select[name='PolicySearch-PolicySearchScreen-DatabasePolicySearchPanelSet-PolicySearchDV-DateRangeForJobSearch-DateRangeForJobSearchRangeValue']", AI = false)
	public WebElement drpSince;

	@IFindBy(how = How.CSS, using = "select[name='PolicySearch-PolicySearchScreen-DatabasePolicySearchPanelSet-PolicySearchDV-IncludeArchived']", AI = false)
	public WebElement drpSource;

	@IFindBy(how = How.CSS, using = "input[name='PolicySearch-PolicySearchScreen-DatabasePolicySearchPanelSet-PolicySearchDV-ProducerCode']", AI = false)
	public WebElement inpProducerCode_12;

	@IFindBy(how = How.CSS, using = "input[name='PolicySearch-PolicySearchScreen-DatabasePolicySearchPanelSet-PolicySearchDV-AsOfDate']", AI = false)
	public WebElement inpAsofDate;

	@IFindBy(how = How.CSS, using = "input[name='PolicySearch-PolicySearchScreen-DatabasePolicySearchPanelSet-PolicySearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-City']", AI = false)
	public WebElement inpCity_3;

	@IFindBy(how = How.CSS, using = "#PolicySearch-PolicySearchScreen-DatabasePolicySearchPanelSet-SearchResultsToolbar-ReassignmentButton>div[role='button']", AI = false)
	public WebElement btnAssign;

	@IFindBy(how = How.CSS, using = "input[name='PolicySearch-PolicySearchScreen-DatabasePolicySearchPanelSet-PolicySearchDV-Phone']", AI = false)
	public WebElement inpPhone_6;
	
	@IFindBy(how = How.CSS, using = "div[id$='SearchLinksInputSet-Search']", AI = false)
	public WebElement btnSearchPolicies;
	
	@IFindBy(how = How.CSS, using = "div[id*='PolicySearch_ResultsLV-0-SubmissionNumber_button']", AI = false)
    public WebElement btnSearchResultSubmissionNumber;

	@IFindBy(how = How.CSS, using = "div[id$='QuoteScreen-ttlBar']", AI = false)
    public WebElement ttlQuote;
	
	@IFindBy(how = How.CSS, using = "div[id*='PolicySearch_ResultsLV-0-PolicyNumber']", AI = false)
    public WebElement btnSearchResultPolicyNumber;

	@IFindBy(how = How.ID, using = "PolicyFile_Summary-ttlBar", AI = false)
	public WebElement ttlPolicySummary;
	
	@IFindBy(how = How.CSS, using = "select[name$='ProductName']", AI = false)
	public WebElement drpProduct;
	
	@IFindBy(how = How.CSS, using = "div[id$='SelectOrganization']", AI = false)
	public WebElement btnProducerSearchIcon;
	
	@IFindBy(how = How.CSS, using = "div[id$='SubmissionNumber_button']", AI = false)
	public WebElement lnkSubmissionNo;


	public SearchPoliciesPage(){
	}

	public SearchPoliciesPage(WebDriver driver){
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
		}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, inpPhone_6))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);
	}public SearchPoliciesPage enterProducerofRecord(WebDriver driver,String ProducerofRecord) {
		BrowserActions.type(driver, inpProducerofRecord,ProducerofRecord, "ProducerofRecord");
		return this;
	}
	public SearchPoliciesPage enterStreet(WebDriver driver,String Street) {
		BrowserActions.type(driver, inpStreet,Street, "Street");
		return this;
	}
	public SearchPoliciesPage enterOfficialID_7(WebDriver driver,String OfficialID_7) {
		BrowserActions.type(driver, inpOfficialID_7,OfficialID_7, "OfficialID_7");
		return this;
	}
	public SearchPoliciesPage enterProducerCode(WebDriver driver,String ProducerCode) {
		BrowserActions.type(driver, inpProducerCode,ProducerCode, "ProducerCode");
		return this;
	}
	public SearchPoliciesPage enterLastname(WebDriver driver,String Lastname) {
		BrowserActions.type(driver, inpLastname,Lastname,1, "Lastname");
		return this;
	}
	public SearchPoliciesPage clickAutoFillIcon_5(WebDriver driver)  {
		BrowserActions.click(driver, btnAutoFillIcon_5,"AutoFillIcon_5");
		return this;
	}
	public SearchPoliciesPage selectJurisdiction(WebDriver driver,String Jurisdiction)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpJurisdiction,Jurisdiction,"Jurisdiction");
		return this;
	}
	public SearchPoliciesPage enterCounty(WebDriver driver,String County) {
		BrowserActions.type(driver, inpCounty,County, "County");
		return this;
	}
	public SearchPoliciesPage selectUnderwritingCompany(WebDriver driver,String UnderwritingCompany)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpUnderwritingCompany,UnderwritingCompany,"UnderwritingCompany");
		return this;
	}
	public SearchPoliciesPage selectDeclinationReason(WebDriver driver,String DeclinationReason)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpDeclinationReason,DeclinationReason,"DeclinationReason");
		return this;
	}
	public SearchPoliciesPage clickBasic(WebDriver driver)  {
		BrowserActions.click(driver, btnBasic,"Basic");
		return this;
	}
	public SearchPoliciesPage enterTo(WebDriver driver,String To) {
		BrowserActions.type(driver, inpTo,To, "To");
		return this;
	}
	public SearchPoliciesPage enterFirstname(WebDriver driver,String Firstname) {
		BrowserActions.type(driver, inpFirstname,Firstname, 1,"Firstname");
		return this;
	}
	public SearchPoliciesPage clickToDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnToDateIcon,"ToDateIcon");
		return this;
	}
	public SearchPoliciesPage enterAddress3(WebDriver driver,String Address3) {
		BrowserActions.type(driver, inpAddress3,Address3, "Address3");
		return this;
	}
	public SearchPoliciesPage selectJurisdiction_10(WebDriver driver,String Jurisdiction_10)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpJurisdiction_10,Jurisdiction_10,"Jurisdiction_10");
		return this;
	}
	public SearchPoliciesPage enterAddress1(WebDriver driver,String Address1) {
		BrowserActions.type(driver, inpAddress1,Address1, "Address1");
		return this;
	}
	public SearchPoliciesPage enterAddress2(WebDriver driver,String Address2) {
		BrowserActions.type(driver, inpAddress2,Address2, "Address2");
		return this;
	}
	public SearchPoliciesPage enterAddress(WebDriver driver,String Address) {
		BrowserActions.type(driver, inpAddress,Address, "Address");
		return this;
	}
	public SearchPoliciesPage enterZIPCode(WebDriver driver,String ZIPCode) {
		BrowserActions.type(driver, inpZIPCode,ZIPCode, "ZIPCode");
		return this;
	}
	public SearchPoliciesPage clickAutoFillIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnAutoFillIcon,"AutoFillIcon");
		return this;
	}
	public SearchPoliciesPage enterPolicyNumber(WebDriver driver,String PolicyNumber) {
		BrowserActions.type(driver, inpPolicyNumber,PolicyNumber, "PolicyNumber");
		return this;
	}
	public SearchPoliciesPage enterFrom(WebDriver driver,String From) {
		BrowserActions.type(driver, inpFrom,From, "From");
		return this;
	}
	public SearchPoliciesPage selectPrefix(WebDriver driver,String Prefix)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPrefix,Prefix,"Prefix");
		return this;
	}
	public SearchPoliciesPage enterName(WebDriver driver,String Name) {
		BrowserActions.type(driver, inpName,Name, "Name");
		return this;
	}
	public SearchPoliciesPage selectCountry(WebDriver driver,String Country)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCountry,Country,"Country");
		return this;
	}
	public SearchPoliciesPage clickFromDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnFromDateIcon,"FromDateIcon");
		return this;
	}
	public SearchPoliciesPage selectState(WebDriver driver,String State)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpState,State,"State");
		return this;
	}
	public SearchPoliciesPage selectSuffix(WebDriver driver,String Suffix)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpSuffix,Suffix,"Suffix");
		return this;
	}
	public SearchPoliciesPage selectAuditMethod(WebDriver driver,String AuditMethod)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpAuditMethod,AuditMethod,"AuditMethod");
		return this;
	}
	public SearchPoliciesPage enterPostalCode(WebDriver driver,String PostalCode) {
		BrowserActions.type(driver, inpPostalCode,PostalCode, "PostalCode");
		return this;
	}
	public SearchPoliciesPage clickSelectOrganization(WebDriver driver)  {
		BrowserActions.click(driver, btnSelectOrganization,"SelectOrganization");
		return this;
	}
	public SearchPoliciesPage selectDateFieldtoSearch(WebDriver driver,String DateFieldtoSearch)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpDateFieldtoSearch,DateFieldtoSearch,"DateFieldtoSearch");
		return this;
	}
	public SearchPoliciesPage enterName_2(WebDriver driver,String Name_2) {
		BrowserActions.type(driver, inpName_2,Name_2, "Name_2");
		return this;
	}
	public SearchPoliciesPage selectProduct_9(WebDriver driver,String Product_9)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpProduct_9,Product_9,"Product_9");
		return this;
	}
	public SearchPoliciesPage enterPolicyNumber_8(WebDriver driver,String PolicyNumber_8) {
		BrowserActions.type(driver, inpPolicyNumber_8,PolicyNumber_8, "PolicyNumber_8");
		return this;
	}
	public SearchPoliciesPage clickCompanynameisanexactmatch(WebDriver driver)  {
		BrowserActions.click(driver, chkCompanynameisanexactmatch,"Companynameisanexactmatch");
		return this;
	}
	public SearchPoliciesPage enterOfficialID(WebDriver driver,String OfficialID) {
		BrowserActions.type(driver, inpOfficialID,OfficialID, "OfficialID");
		return this;
	}
	public SearchPoliciesPage enterParticle(WebDriver driver,String Particle) {
		BrowserActions.type(driver, inpParticle,Particle, "Particle");
		return this;
	}
	public SearchPoliciesPage clickInForceOnDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnInForceOnDateIcon,"InForceOnDateIcon");
		return this;
	}
	public SearchPoliciesPage enterCity(WebDriver driver,String City) {
		BrowserActions.type(driver, inpCity,City, "City");
		return this;
	}
	public SearchPoliciesPage selectProduct(WebDriver driver,String Product)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpProduct,Product,"Product");
		return this;
	}
	public SearchPoliciesPage clickLastnameisanexactmatch(WebDriver driver)  {
		BrowserActions.click(driver, chkLastnameisanexactmatch,"Lastnameisanexactmatch");
		return this;
	}
	public SearchPoliciesPage clickAssignedRisk(WebDriver driver)  {
		BrowserActions.click(driver, rdbAssignedRisk,"AssignedRisk");
		return this;
	}
	public SearchPoliciesPage clickAdvanced(WebDriver driver)  {
		BrowserActions.click(driver, btnAdvanced,"Advanced");
		return this;
	}
	public SearchPoliciesPage clickSearch(WebDriver driver)  {
		BrowserActions.click(driver, btnSearchPolicies,true,"Search");
		return this;
	}
	public SearchPoliciesPage clickAsofDateDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnAsofDateDateIcon,"AsofDateDateIcon");
		return this;
	}
	public SearchPoliciesPage clickReset_15(WebDriver driver)  {
		BrowserActions.click(driver, btnReset_15,"Reset_15");
		return this;
	}
	public SearchPoliciesPage selectNonRenewalCode(WebDriver driver,String NonRenewalCode)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpNonRenewalCode,NonRenewalCode,"NonRenewalCode");
		return this;
	}
	public SearchPoliciesPage enterCompanyName(WebDriver driver,String CompanyName) {
		BrowserActions.type(driver, inpCompanyName,CompanyName, "CompanyName");
		return this;
	}
	public SearchPoliciesPage selectSearchFor(WebDriver driver,String SearchFor)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpSearchFor,SearchFor,"SearchFor");
		return this;
	}
	public SearchPoliciesPage enterPhone(WebDriver driver,String Phone) {
		BrowserActions.type(driver, inpPhone,Phone, "Phone");
		return this;
	}
	public SearchPoliciesPage clickReset(WebDriver driver)  {
		BrowserActions.click(driver, btnReset,"Reset");
		return this;
	}
	public SearchPoliciesPage clickSearch_13(WebDriver driver)  {
		BrowserActions.click(driver, btnSearch_13,"Search_13");
		return this;
	}
	public SearchPoliciesPage clickSearch_14(WebDriver driver)  {
		BrowserActions.click(driver, btnSearch_14,1,"Search_14");
		return this;
	}
	public SearchPoliciesPage clickPrintExport(WebDriver driver)  {
		BrowserActions.click(driver, btnPrintExport,"PrintExport");
		return this;
	}
	public SearchPoliciesPage enterInForceOn(WebDriver driver,String InForceOn) {
		BrowserActions.type(driver, inpInForceOn,InForceOn, "InForceOn");
		return this;
	}
	public SearchPoliciesPage clickSelectOrganization_11(WebDriver driver)  {
		BrowserActions.click(driver, btnSelectOrganization_11,"SelectOrganization_11");
		return this;
	}
	public SearchPoliciesPage enterProducer(WebDriver driver,String Producer) {
		BrowserActions.type(driver, inpProducer,Producer, "Producer");
		return this;
	}
	public SearchPoliciesPage selectState_4(WebDriver driver,String State_4)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpState_4,State_4,"State_4");
		return this;
	}
	public SearchPoliciesPage enterAccountNumber(WebDriver driver,String AccountNumber) {
		BrowserActions.type(driver, inpAccountNumber,AccountNumber, "AccountNumber");
		return this;
	}
	public SearchPoliciesPage enterMiddlename(WebDriver driver,String Middlename) {
		BrowserActions.type(driver, inpMiddlename,Middlename, "Middlename");
		return this;
	}
	public SearchPoliciesPage clickFirstnameisanexactmatch(WebDriver driver)  {
		BrowserActions.click(driver, chkFirstnameisanexactmatch,"Firstnameisanexactmatch");
		return this;
	}
	public SearchPoliciesPage clickSearch_1(WebDriver driver)  {
		BrowserActions.click(driver, btnSearch_1,"Search_1");
		return this;
	}
	public SearchPoliciesPage enterSubmissionNumber(WebDriver driver,String SubmissionNumber) {
		BrowserActions.type(driver, inpSubmissionNumber,SubmissionNumber, "SubmissionNumber");
		return this;
	}
	public SearchPoliciesPage selectSince(WebDriver driver,String Since)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpSince,Since,"Since");
		return this;
	}
	public SearchPoliciesPage selectSource(WebDriver driver,String Source)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpSource,Source,"Source");
		return this;
	}
	public SearchPoliciesPage enterProducerCode_12(WebDriver driver,String ProducerCode_12) {
		BrowserActions.type(driver, inpProducerCode_12,ProducerCode_12, "ProducerCode_12");
		return this;
	}
	public SearchPoliciesPage enterAsofDate(WebDriver driver,String AsofDate) {
		BrowserActions.type(driver, inpAsofDate,AsofDate, "AsofDate");
		return this;
	}
	public SearchPoliciesPage enterCity_3(WebDriver driver,String City_3) {
		BrowserActions.type(driver, inpCity_3,City_3, "City_3");
		return this;
	}
	public SearchPoliciesPage clickAssign(WebDriver driver)  {
		BrowserActions.click(driver, btnAssign,"Assign");
		return this;
	}
	public SearchPoliciesPage enterPhone_6(WebDriver driver,String Phone_6) {
		BrowserActions.type(driver, inpPhone_6,Phone_6, "Phone_6");
		return this;
	}
	
	/**
	 * @author siva.panjanathan
	 * Click on the Search button for the Search
	 * @param driver
	 * @return 
	 */
	public SearchPoliciesPage clickSearchButton(WebDriver driver){
		BrowserActions.click(driver, btnSearchPolicies,"Search Button");
		return this;
	}
	
	 /**
     * @author Manikandan.Manohar
     * click On Bound Submission Status In SubmissionNo
     * @param driver
     */
    public void clickSubmissionNoStatusSubmissionNo(WebDriver driver){
        BrowserActions.click(driver, btnSearchResultSubmissionNumber,true,"Bounded Submission Id");
    }
    
    /**
     * @author anitha.raphel
     * Used to verify Quote title
     * @param driver
     */
    public void verifyQuotePageIsDisplayed(WebDriver driver){
        BrowserActions.verifyElementDisplayed(driver, ttlQuote, "Quote title");
    }
    
	/**
     * @author Manikandan.Manohar
     * click On Bound Submission Status In SubmissionNo
     * @param driver
     */
    public void clickOnBoundSubmissionStatusSubmissionNo(WebDriver driver){
        BrowserActions.click(driver, btnSearchResultPolicyNumber,true,"Bounded Submission Id");
    }
    
    /**
     * @author Manikandan.Manohar
     * click On Bound Submission Status In SubmissionNo
     * @param driver
     */
    public QuotePage clickOnInForceSubmissionStatusSubmissionNo(WebDriver driver){
        BrowserActions.click(driver, btnSearchResultPolicyNumber,true,"Bounded Submission Id");
        return new QuotePage(driver).get();
    }

    /**
	 * @author Manikandan.Manohar
	 * @param driver
	 * @return PolicySummaryPage
	 */
	public void verifyPolicySummaryPageIsDisplayed(WebDriver driver)  {
		Log.assertThat(ttlPolicySummary.isDisplayed(), "Policy Summary Page is displayed", "Policy Summary Page is not displayed");
	}

	/**
     * @author Manikandan.Manohar
     * click On Producer Search Icon
     * @param driver
     */
    public void clickProducerCodeIcon(WebDriver driver){
        BrowserActions.click(driver,btnProducerSearchIcon ,true,"Producer Search Icon");
    }
    
	/**
	 * Click Submission no
	 * @param driver
	 * @return
	 */
    public QuotePage clickSubmissionNo(WebDriver driver){
    	BrowserActions.click(driver,lnkSubmissionNo ,"Submission Number");
		return new QuotePage(driver).get();
    }
}
