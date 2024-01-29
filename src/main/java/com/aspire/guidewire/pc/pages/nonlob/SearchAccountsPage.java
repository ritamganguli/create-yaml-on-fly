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

import com.aspire.guidewire.utils.BrowserActions;
import com.aspire.guidewire.utils.ElementLayer;
import com.aspire.guidewire.utils.Log;
import com.aspire.guidewire.utils.WaitUtils;

import ASPIREAI.customfactories.AjaxElementLocatorFactory;
import ASPIREAI.customfactories.IFindBy;
import ASPIREAI.customfactories.PageFactory;

public class SearchAccountsPage extends LoadableComponent<SearchAccountsPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	@IFindBy(how = How.CSS, using = "input[name='AccountSearch-AccountSearchScreen-AccountSearchDV-ProducerCode']", AI = false)
	public WebElement inpProducerCode;

	@IFindBy(how = How.CSS, using = "input[name='AccountSearch-AccountSearchScreen-AccountSearchDV-GlobalPersonNameInputSet-LastName']", AI = false)
	public WebElement inpLastname;

	@IFindBy(how = How.CSS, using = "#AccountSearch-AccountSearchScreen-AccountSearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-PostalCode-AutoFillIcon", AI = false)
	public WebElement btnAutoFillIcon_2;

	@IFindBy(how = How.CSS, using = "input[name='AccountSearch-AccountSearchScreen-AccountSearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-County']", AI = false)
	public WebElement inpCounty;

	@IFindBy(how = How.CSS, using = "input[name='AccountSearch-AccountSearchScreen-AccountSearchDV-IndustryCode']", AI = false)
	public WebElement inpIndustryCode;

	@IFindBy(how = How.CSS, using = "input[name='AccountSearch-AccountSearchScreen-AccountSearchDV-GlobalPersonNameInputSet-FirstName']", AI = false)
	public WebElement inpFirstname;

	@IFindBy(how = How.CSS, using = "input[name='AccountSearch-AccountSearchScreen-AccountSearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine3']", AI = false)
	public WebElement inpAddress3;

	@IFindBy(how = How.CSS, using = "input[name='AccountSearch-AccountSearchScreen-AccountSearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine1']", AI = false)
	public WebElement inpAddress1;

	@IFindBy(how = How.CSS, using = "input[name='AccountSearch-AccountSearchScreen-AccountSearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine2']", AI = false)
	public WebElement inpAddress2;

	@IFindBy(how = How.CSS, using = "input[name='AccountSearch-AccountSearchScreen-AccountSearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressSummary']", AI = false)
	public WebElement inpAddress;

	@IFindBy(how = How.CSS, using = "input[name='AccountSearch-AccountSearchScreen-AccountSearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-PostalCode']", AI = false)
	public WebElement inpZIPCode;

	@IFindBy(how = How.CSS, using = "#AccountSearch-AccountSearchScreen-AccountSearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-City-AutoFillIcon", AI = false)
	public WebElement btnAutoFillIcon;

	@IFindBy(how = How.CSS, using = "select[name='AccountSearch-AccountSearchScreen-AccountSearchDV-GlobalPersonNameInputSet-Prefix']", AI = false)
	public WebElement drpPrefix;

	@IFindBy(how = How.CSS, using = "input[name='AccountSearch-AccountSearchScreen-AccountSearchDV-GlobalPersonNameInputSet-NameSummary']", AI = false)
	public WebElement inpName;

	@IFindBy(how = How.CSS, using = "select[name='AccountSearch-AccountSearchScreen-AccountSearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-Country']", AI = false)
	public WebElement drpCountry;

	@IFindBy(how = How.CSS, using = "select[name='AccountSearch-AccountSearchScreen-AccountSearchDV-GlobalPersonNameInputSet-Suffix']", AI = false)
	public WebElement drpSuffix;

	@IFindBy(how = How.CSS, using = "select[name='AccountSearch-AccountSearchScreen-AccountSearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-State']", AI = false)
	public WebElement drpState;

	@IFindBy(how = How.CSS, using = "#AccountSearch-AccountSearchScreen-AccountSearchDV-ProducerOrganization-SelectOrganization", AI = false)
	public WebElement btnSelectOrganization;

	@IFindBy(how = How.CSS, using = "input[name='AccountSearch-AccountSearchScreen-AccountSearchDV-CompanyNameExact']", AI = false)
	public WebElement chkCompanynameisanexactmatch;

	@IFindBy(how = How.CSS, using = "input[name='AccountSearch-AccountSearchScreen-AccountSearchDV-GlobalPersonNameInputSet-Particle']", AI = false)
	public WebElement inpParticle;

	@IFindBy(how = How.CSS, using = "input[name='AccountSearch-AccountSearchScreen-AccountSearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-City']", AI = false)
	public WebElement inpCity;

	@IFindBy(how = How.CSS, using = "input[name='AccountSearch-AccountSearchScreen-AccountSearchDV-LastNameExact']", AI = false)
	public WebElement chkLastnameisanexactmatch;

	@IFindBy(how = How.CSS, using = "#AccountSearch-AccountSearchScreen-AccountSearchDV-IndustryCode-SelectIndustryCode", AI = false)
	public WebElement btnSearch;

	@IFindBy(how = How.CSS, using = "input[name='AccountSearch-AccountSearchScreen-AccountSearchDV-GlobalContactNameInputSet-Name']", AI = false)
	public WebElement inpCompanyName;

	@IFindBy(how = How.CSS, using = "input[name='AccountSearch-AccountSearchScreen-AccountSearchDV-Phone']", AI = false)
	public WebElement inpPhone;

	@IFindBy(how = How.CSS, using = "#AccountSearch-AccountSearchScreen-AccountSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Reset", AI = false)
	public WebElement btnReset;

	@IFindBy(how = How.CSS, using = "#AccountSearch-AccountSearchScreen-AccountSearchResultsLV_tb-PrintMe>div[role='button']", AI = false)
	public WebElement btnPrintExport;

	@IFindBy(how = How.CSS, using = "input[name='AccountSearch-AccountSearchScreen-AccountSearchDV-SearchRelatedAccountsOnly']", AI = false)
	public WebElement chkRelatedtonull;

	@IFindBy(how = How.CSS, using = "#AccountSearch-AccountSearchScreen-ttlBar", AI = false)
	public WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "input[name='AccountSearch-AccountSearchScreen-AccountSearchDV-ProducerOrganization']", AI = false)
	public WebElement inpProducer;

	@IFindBy(how = How.CSS, using = "#AccountSearch-AccountSearchScreen-AccountSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Search", AI = false)
	public WebElement btnSearch_3;

	@IFindBy(how = How.CSS, using = "input[name='AccountSearch-AccountSearchScreen-AccountSearchDV-AccountNumber']", AI = false)
	public WebElement inpAccountNumber;

	@IFindBy(how = How.CSS, using = "input[name='AccountSearch-AccountSearchScreen-AccountSearchDV-GlobalPersonNameInputSet-MiddleName']", AI = false)
	public WebElement inpMiddlename;

	@IFindBy(how = How.CSS, using = "input[name='AccountSearch-AccountSearchScreen-AccountSearchDV-FirstNameExact']", AI = false)
	public WebElement chkFirstnameisanexactmatch;

	@IFindBy(how = How.CSS, using = "#AccountSearch-AccountSearchScreen-AccountSearchDV-ProducerCode-SelectProducerCode", AI = false)
	public WebElement btnSearch_1;

	@IFindBy(how = How.CSS, using = "input[name='AccountSearch-AccountSearchScreen-AccountSearchDV-TaxID']", AI = false)
	public WebElement inpTaxID;
	
	@IFindBy(how = How.CSS, using = "div[id$='AccountSearchResultsLV-0-AccountNumber']", AI = false)
    public WebElement lstSearchResultAccountNumber;


	public SearchAccountsPage(){
	}

	public SearchAccountsPage(WebDriver driver) {
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
		}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, inpTaxID))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);
	}public SearchAccountsPage enterProducerCode(WebDriver driver,String ProducerCode) {
		BrowserActions.type(driver, inpProducerCode,ProducerCode, "ProducerCode");
		return this;
	}
	public SearchAccountsPage enterLastname(WebDriver driver,String Lastname) {
		BrowserActions.type(driver, inpLastname,Lastname, "Lastname");
		return this;
	}
	public SearchAccountsPage clickAutoFillIcon_2(WebDriver driver)  {
		BrowserActions.click(driver, btnAutoFillIcon_2,"AutoFillIcon_2");
		return this;
	}
	public SearchAccountsPage enterCounty(WebDriver driver,String County) {
		BrowserActions.type(driver, inpCounty,County, "County");
		return this;
	}
	public SearchAccountsPage enterIndustryCode(WebDriver driver,String IndustryCode) {
		BrowserActions.type(driver, inpIndustryCode,IndustryCode, "IndustryCode");
		return this;
	}
	public SearchAccountsPage enterFirstname(WebDriver driver,String Firstname) {
		BrowserActions.type(driver, inpFirstname,Firstname, "Firstname");
		return this;
	}
	public SearchAccountsPage enterAddress3(WebDriver driver,String Address3) {
		BrowserActions.type(driver, inpAddress3,Address3, "Address3");
		return this;
	}
	public SearchAccountsPage enterAddress1(WebDriver driver,String Address1) {
		BrowserActions.type(driver, inpAddress1,Address1, "Address1");
		return this;
	}
	public SearchAccountsPage enterAddress2(WebDriver driver,String Address2) {
		BrowserActions.type(driver, inpAddress2,Address2, "Address2");
		return this;
	}
	public SearchAccountsPage enterAddress(WebDriver driver,String Address) {
		BrowserActions.type(driver, inpAddress,Address, "Address");
		return this;
	}
	public SearchAccountsPage enterZIPCode(WebDriver driver,String ZIPCode) {
		BrowserActions.type(driver, inpZIPCode,ZIPCode, "ZIPCode");
		return this;
	}
	public SearchAccountsPage clickAutoFillIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnAutoFillIcon,"AutoFillIcon");
		return this;
	}
	public SearchAccountsPage selectPrefix(WebDriver driver,String Prefix)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPrefix,Prefix,"Prefix");
		return this;
	}
	public SearchAccountsPage enterName(WebDriver driver,String Name) {
		BrowserActions.type(driver, inpName,Name, "Name");
		return this;
	}
	public SearchAccountsPage selectCountry(WebDriver driver,String Country)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCountry,Country,"Country");
		return this;
	}
	public SearchAccountsPage selectSuffix(WebDriver driver,String Suffix)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpSuffix,Suffix,"Suffix");
		return this;
	}
	public SearchAccountsPage selectState(WebDriver driver,String State)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpState,State,"State");
		return this;
	}
	public SearchAccountsPage clickSelectOrganization(WebDriver driver)  {
		BrowserActions.click(driver, btnSelectOrganization,"SelectOrganization");
		return this;
	}
	public SearchAccountsPage clickCompanynameisanexactmatch(WebDriver driver)  {
		BrowserActions.click(driver, chkCompanynameisanexactmatch,"Companynameisanexactmatch");
		return this;
	}
	public SearchAccountsPage enterParticle(WebDriver driver,String Particle) {
		BrowserActions.type(driver, inpParticle,Particle, "Particle");
		return this;
	}
	public SearchAccountsPage enterCity(WebDriver driver,String City) {
		BrowserActions.type(driver, inpCity,City, "City");
		return this;
	}
	public SearchAccountsPage clickLastnameisanexactmatch(WebDriver driver)  {
		BrowserActions.click(driver, chkLastnameisanexactmatch,"Lastnameisanexactmatch");
		return this;
	}
	public SearchAccountsPage clickSearch(WebDriver driver)  {
		BrowserActions.click(driver, btnSearch,"Search");
		return this;
	}
	public SearchAccountsPage enterCompanyName(WebDriver driver,String CompanyName) {
		BrowserActions.type(driver, inpCompanyName,CompanyName, "CompanyName");
		return this;
	}
	public SearchAccountsPage enterPhone(WebDriver driver,String Phone) {
		BrowserActions.type(driver, inpPhone,Phone, "Phone");
		return this;
	}
	public SearchAccountsPage clickReset(WebDriver driver)  {
		BrowserActions.click(driver, btnReset,"Reset");
		return this;
	}
	public SearchAccountsPage clickPrintExport(WebDriver driver)  {
		BrowserActions.click(driver, btnPrintExport,"PrintExport");
		return this;
	}
	public SearchAccountsPage clickRelatedtonull(WebDriver driver)  {
		BrowserActions.click(driver, chkRelatedtonull,"Relatedtonull");
		return this;
	}
	public SearchAccountsPage enterProducer(WebDriver driver,String Producer) {
		BrowserActions.type(driver, inpProducer,Producer, "Producer");
		return this;
	}
	public SearchAccountsPage clickSearchAccount(WebDriver driver)  {
		BrowserActions.click(driver, btnSearch_3,2,"Search_3");
		return this;
	}
	public SearchAccountsPage enterAccountNumber(WebDriver driver,String AccountNumber) {
		BrowserActions.type(driver, inpAccountNumber,AccountNumber, "AccountNumber");
		return this;
	}
	public SearchAccountsPage enterMiddlename(WebDriver driver,String Middlename) {
		BrowserActions.type(driver, inpMiddlename,Middlename, "Middlename");
		return this;
	}
	public SearchAccountsPage clickFirstnameisanexactmatch(WebDriver driver)  {
		BrowserActions.click(driver, chkFirstnameisanexactmatch,"Firstnameisanexactmatch");
		return this;
	}
	public SearchAccountsPage clickSearch_1(WebDriver driver)  {
		BrowserActions.click(driver, btnSearch_1,"Search_1");
		return this;
	}
	public SearchAccountsPage enterTaxID(WebDriver driver,String TaxID) {
		BrowserActions.type(driver, inpTaxID,TaxID, "TaxID");
		return this;
	}
	public SearchAccountsPage clickSubmissionNoByAccountId(WebDriver driver){
		BrowserActions.click(driver, lstSearchResultAccountNumber,"Bounded Submission Id");
		return this;
	}
}
