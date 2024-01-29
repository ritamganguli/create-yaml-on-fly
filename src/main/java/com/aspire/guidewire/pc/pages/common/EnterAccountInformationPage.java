package com.aspire.guidewire.pc.pages.common;

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
import com.aspire.guidewire.utils.Utils;
import com.aspire.guidewire.utils.WaitUtils;

import ASPIREAI.customfactories.AjaxElementLocatorFactory;
import ASPIREAI.customfactories.IFindBy;
import ASPIREAI.customfactories.PageFactory;

public class EnterAccountInformationPage extends LoadableComponent<EnterAccountInformationPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementIdentifier;
	String elementObject;
	HashMap<String, String> getPageObjects;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	@IFindBy(how = How.CSS, using = "input[name='NewAccount-NewAccountScreen-NewAccountSearchDV-CompanyNameExact']", AI = false)
	public WebElement chkCompanynameisanexactmatch;

	@IFindBy(how = How.CSS, using = "#NewAccount-NewAccountScreen-NewAccountButton-NewAccount_FromAB>div[role='menuitem']", AI = false)
	public WebElement btnFromAddressBook;

	@IFindBy(how = How.CSS, using = "input[name='NewAccount-NewAccountScreen-NewAccountSearchDV-GlobalPersonNameInputSet-Particle']", AI = false)
	public WebElement inpParticle;

	@IFindBy(how = How.CSS, using = "#NewAccount-NewAccountScreen-NewAccountSearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-PostalCode-AutoFillIcon", AI = false)
	public WebElement btnAutoFillIcon_1;

	@IFindBy(how = How.CSS, using = "input[name$='LastName']", AI = false)
	public WebElement inpLastname;

	@IFindBy(how = How.CSS, using = "input[name$='City']", AI = false)
	public WebElement inpCity;

	@IFindBy(how = How.CSS, using = "input[name='NewAccount-NewAccountScreen-NewAccountSearchDV-LastNameExact']", AI = false)
	public WebElement chkLastnameisanexactmatch;

	@IFindBy(how = How.CSS, using = "input[name$='County']", AI = false)
	public WebElement inpCounty;

	@IFindBy(how = How.CSS, using = "div[id$='NewAccountButton'] div[id$='NewAccount_Person']", AI = false)
	public WebElement btnPerson;

	@IFindBy(how = How.CSS, using = "#NewAccount-NewAccountScreen-NewAccountSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Search", AI = false)
	public WebElement btnSearch;

	@IFindBy(how = How.CSS, using = "input[name$='-Name']", AI = false)
	public WebElement inpCompanyName;

	@IFindBy(how = How.CSS, using = "div[id=NewAccount-NewAccountScreen-NewAccountButton] div[role='button']", AI = false)
	public WebElement btnCreateNewAccount;

	@IFindBy(how = How.CSS, using = "#NewAccount-NewAccountScreen-NewAccountSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Reset", AI = false)
	public WebElement btnReset;

	@IFindBy(how = How.CSS, using = "input[name$='FirstName']", AI = false)
	public WebElement inpFirstname;

	@IFindBy(how = How.CSS, using = "#NewAccount-NewAccountScreen-NewAccountButton-NewAccount_Company>div[role='menuitem']", AI = false)
	public WebElement btnCompany;

	@IFindBy(how = How.XPATH, using = "//div[@id='NewAccount-NewAccountScreen-ttlBar']//child::div[@role='heading']", AI = false)
	public WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "input[name='NewAccount-NewAccountScreen-NewAccountSearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine3']", AI = false)
	public WebElement inpAddress3;

	@IFindBy(how = How.CSS, using = "input[name$='AddressLine1']", AI = false)
	public WebElement inpAddress1;

	@IFindBy(how = How.CSS, using = "input[name='NewAccount-NewAccountScreen-NewAccountSearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine2']", AI = false)
	public WebElement inpAddress2;

	@IFindBy(how = How.CSS, using = "input[name='NewAccount-NewAccountScreen-NewAccountSearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressSummary']", AI = false)
	public WebElement inpAddress;

	@IFindBy(how = How.CSS, using = "input[name='NewAccount-NewAccountScreen-NewAccountSearchDV-GlobalPersonNameInputSet-MiddleName']", AI = false)
	public WebElement inpMiddlename;

	@IFindBy(how = How.CSS, using = "input[name$='PostalCode']", AI = false)
	public WebElement inpZIPCode;

	@IFindBy(how = How.CSS, using = "#NewAccount-NewAccountScreen-NewAccountSearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-City-AutoFillIcon", AI = false)
	public WebElement btnAutoFillIcon;

	@IFindBy(how = How.CSS, using = "input[name='NewAccount-NewAccountScreen-NewAccountSearchDV-FirstNameExact']", AI = false)
	public WebElement chkFirstnameisanexactmatch;

	@IFindBy(how = How.CSS, using = "select[name='NewAccount-NewAccountScreen-NewAccountSearchDV-GlobalPersonNameInputSet-Prefix']", AI = false)
	public WebElement drpPrefix;

	@IFindBy(how = How.CSS, using = "input[name='NewAccount-NewAccountScreen-NewAccountSearchDV-GlobalPersonNameInputSet-NameSummary']", AI = false)
	public WebElement inpName;

	@IFindBy(how = How.CSS, using = "select[name$='Country']", AI = false)
	public WebElement drpCountry;

	@IFindBy(how = How.CSS, using = "select[name='NewAccount-NewAccountScreen-NewAccountSearchDV-GlobalPersonNameInputSet-Suffix']", AI = false)
	public WebElement drpSuffix;

	@IFindBy(how = How.CSS, using = "select[name$='-State']", AI = false)
	public WebElement drpState;


	public EnterAccountInformationPage(){
	}

	public EnterAccountInformationPage(WebDriver driver){
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver,Utils.maxElementWait);
		PageFactory.initElements(finder, this);
	}
	public EnterAccountInformationPage(WebDriver driver, int timeout){
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, timeout);
		PageFactory.initElements(finder, this);
		elementLayer = new ElementLayer(driver);
	}

	@Override
	protected void load() {
		isPageLoaded = true;
		WaitUtils.waitForPageLoad(driver);
	}
	@Override
	protected void isLoaded() {
		if (!isPageLoaded) {
			Assert.fail();
		}

		if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, lblTtlBar))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}
		elementLayer = new ElementLayer(driver);
	}

	public EnterAccountInformationPage clickCompanynameisanexactmatch(WebDriver driver)  {
		BrowserActions.click(driver, chkCompanynameisanexactmatch,"Companynameisanexactmatch");
		return this;
	}
	public EnterAccountInformationPage clickFromAddressBook(WebDriver driver)  {
		BrowserActions.click(driver, btnFromAddressBook,"FromAddressBook");
		return this;
	}
	public EnterAccountInformationPage enterParticle(WebDriver driver,String Particle) {
		BrowserActions.type(driver, inpParticle,Particle, "Particle");
		return this;
	}
	public EnterAccountInformationPage clickAutoFillIcon_1(WebDriver driver)  {
		BrowserActions.click(driver, btnAutoFillIcon_1,"AutoFillIcon_1");
		return this;
	}
	public EnterAccountInformationPage enterLastname(WebDriver driver,String Lastname) {
		BrowserActions.type(driver, inpLastname,Lastname, "Lastname");
		return this;
	}
	public EnterAccountInformationPage enterCity(WebDriver driver,String City) {
		BrowserActions.type(driver, inpCity,City, "City");
		return this;
	}
	public EnterAccountInformationPage clickLastnameisanexactmatch(WebDriver driver)  {
		BrowserActions.click(driver, chkLastnameisanexactmatch,"Lastnameisanexactmatch");
		return this;
	}
	public EnterAccountInformationPage enterCounty(WebDriver driver,String County) {
		BrowserActions.type(driver, inpCounty,County, "County");
		return this;
	}
	public EnterAccountInformationPage clickPerson(WebDriver driver)  {
		BrowserActions.click(driver, btnPerson,0.5,"Person");
		return this;
	}
	public EnterAccountInformationPage clickSearch(WebDriver driver)  {
		BrowserActions.click(driver, btnSearch,0.5,"Search");
		return this;
	}
	public EnterAccountInformationPage enterCompanyName(WebDriver driver,String CompanyName) {
		BrowserActions.type(driver, inpCompanyName,CompanyName, "CompanyName");
		return this;
	}
	public EnterAccountInformationPage clickCreateNewAccount(WebDriver driver)  {
		BrowserActions.click(driver, btnCreateNewAccount,1,"CreateNewAccount");
		return this;
	}
	public EnterAccountInformationPage clickReset(WebDriver driver)  {
		BrowserActions.click(driver, btnReset,"Reset");
		return this;
	}
	public EnterAccountInformationPage enterFirstname(WebDriver driver,String Firstname) {
		BrowserActions.type(driver, inpFirstname,Firstname, "Firstname");
		return this;
	}
	public EnterAccountInformationPage clickCompany(WebDriver driver)  {
		BrowserActions.click(driver, btnCompany,"Company");
		return this;
	}
	public EnterAccountInformationPage enterAddress3(WebDriver driver,String Address3) {
		BrowserActions.type(driver, inpAddress3,Address3, "Address3");
		return this;
	}
	public EnterAccountInformationPage enterAddress1(WebDriver driver,String Address1) {
		BrowserActions.type(driver, inpAddress1,Address1, "Address1");
		return this;
	}
	public EnterAccountInformationPage enterAddress2(WebDriver driver,String Address2) {
		BrowserActions.type(driver, inpAddress2,Address2, "Address2");
		return this;
	}
	public EnterAccountInformationPage enterAddress(WebDriver driver,String Address) {
		BrowserActions.type(driver, inpAddress,Address, "Address");
		return this;
	}
	public EnterAccountInformationPage enterMiddlename(WebDriver driver,String Middlename) {
		BrowserActions.type(driver, inpMiddlename,Middlename, "Middlename");
		return this;
	}
	public EnterAccountInformationPage enterZIPCode(WebDriver driver,String ZIPCode) {
		BrowserActions.type(driver, inpZIPCode,ZIPCode, "ZIPCode");
		return this;
	}
	public EnterAccountInformationPage clickAutoFillIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnAutoFillIcon,"AutoFillIcon");
		return this;
	}
	public EnterAccountInformationPage clickFirstnameisanexactmatch(WebDriver driver)  {
		BrowserActions.click(driver, chkFirstnameisanexactmatch,"Firstnameisanexactmatch");
		return this;
	}
	public EnterAccountInformationPage selectPrefix(WebDriver driver,String Prefix)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPrefix,Prefix,"Prefix");
		return this;
	}
	public EnterAccountInformationPage enterName(WebDriver driver,String Name) {
		BrowserActions.type(driver, inpName,Name, "Name");
		return this;
	}
	public EnterAccountInformationPage selectCountry(WebDriver driver,String Country)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCountry,Country,"Country");
		return this;
	}
	public EnterAccountInformationPage selectSuffix(WebDriver driver,String Suffix)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpSuffix,Suffix,"Suffix");
		return this;
	}
	public EnterAccountInformationPage selectState(WebDriver driver,String State)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpState,State,"State");
		return this;
	}
}
