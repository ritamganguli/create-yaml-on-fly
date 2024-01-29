package com.aspire.guidewire.pc.pages.common;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
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

public class CreateAccountPage extends LoadableComponent<CreateAccountPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementIdentifier;
	String elementObject;
	HashMap<String, String> getPageObjects;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
	//public TopNavBar topnavbar;
	@IFindBy(how = How.CSS, using = "select[name$='CreateAccountScreen-CreateAccountDV-ProducerSelectionInputSet-ProducerCode']", AI = false)
	public WebElement drpProducerCode;

	@IFindBy(how = How.CSS, using = "input[name='CreateAccount-CreateAccountScreen-CreateAccountDV-CreateAccountContactInputSet-HomePhone-GlobalPhoneInputSet-PhoneDisplay']", AI = false)
	public WebElement inpHomePhone_1;

	@IFindBy(how = How.CSS, using = "input[name='CreateAccount-CreateAccountScreen-CreateAccountDV-AddressDescription']", AI = false)
	public WebElement inpDescription;

	@IFindBy(how = How.CSS, using = "#CreateAccount-CreateAccountScreen-CreateAccountDV-LinkedAddressInputSet-LinkAddressMenu-EditAddress>div[role='menuitem']", AI = false)
	public WebElement btnEditaddress;

	@IFindBy(how = How.CSS, using = "input[name$='Producer']", AI = false)
	public WebElement inpOrganization;

	@IFindBy(how = How.CSS, using = "input[name='CreateAccount-CreateAccountScreen-CreateAccountDV-CreateAccountContactInputSet-HomePhone-GlobalPhoneInputSet-Extension']", AI = false)
	public WebElement inpHomePhoneExtension;

	@IFindBy(how = How.CSS, using = "input[name='CreateAccount-CreateAccountScreen-CreateAccountDV-CreateAccountContactInputSet-GlobalPersonNameInputSet-Particle']", AI = false)
	public WebElement inpParticle;

	@IFindBy(how = How.CSS, using = "#CreateAccount-CreateAccountScreen-CreateAccountDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-PostalCode-AutoFillIcon", AI = false)
	public WebElement btnAutoFillIcon_1;

	@IFindBy(how = How.CSS, using = "div[id$='LastName'] input[name$='LastName']", AI = false)
	public WebElement inpLastname;

	@IFindBy(how = How.CSS, using = "input[name='CreateAccount-CreateAccountScreen-CreateAccountDV-CreateAccountContactInputSet-CellPhone-GlobalPhoneInputSet-Extension']", AI = false)
	public WebElement inpMobilePhoneExtension;

	@IFindBy(how = How.CSS, using = "select[name='CreateAccount-CreateAccountScreen-CreateAccountDV-CreateAccountContactInputSet-PrimaryPhone']", AI = false)
	public WebElement drpPrimaryPhone;

	@IFindBy(how = How.CSS, using = "input[name$='City']", AI = false)
	public WebElement inpCity;

	@IFindBy(how = How.CSS, using = "select[name='CreateAccount-CreateAccountScreen-CreateAccountDV-PrimaryLanguage']", AI = false)
	public WebElement drpPreferredLanguage;

	@IFindBy(how = How.CSS, using = "select[name='CreateAccount-CreateAccountScreen-CreateAccountDV-CreateAccountContactInputSet-Phone-GlobalPhoneInputSet-CountryCode']", AI = false)
	public WebElement drpWorkPhoneRegionCode;

	@IFindBy(how = How.CSS, using = "input[name='CreateAccount-CreateAccountScreen-CreateAccountDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-County']", AI = false)
	public WebElement inpCounty;

	@IFindBy(how = How.CSS, using = "#CreateAccount-CreateAccountScreen-CreateAccountDV-IndustryCode-SelectIndustryCode", AI = false)
	public WebElement btnSearch;

	@IFindBy(how = How.CSS, using = "input[name='CreateAccount-CreateAccountScreen-CreateAccountDV-CreateAccountContactInputSet-FaxPhone-GlobalPhoneInputSet-NationalSubscriberNumber']", AI = false)
	public WebElement inpFaxPhone;

	@IFindBy(how = How.CSS, using = "input[name='CreateAccount-CreateAccountScreen-CreateAccountDV-Nickname']", AI = false)
	public WebElement inpAccountNickname;

	@IFindBy(how = How.CSS, using = "input[name='CreateAccount-CreateAccountScreen-CreateAccountDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressSummary']", AI = false)
	public WebElement inpAddress_1;

	@IFindBy(how = How.CSS, using = "input[name='CreateAccount-CreateAccountScreen-CreateAccountDV-CreateAccountContactInputSet-HomePhone-GlobalPhoneInputSet-NationalSubscriberNumber']", AI = false)
	public WebElement inpHomePhone;

	@IFindBy(how = How.CSS, using = "input[name='CreateAccount-CreateAccountScreen-CreateAccountDV-CreateAccountContactInputSet-EmailAddress2']", AI = false)
	public WebElement inpSecondaryEmail;

	@IFindBy(how = How.CSS, using = "input[name='CreateAccount-CreateAccountScreen-CreateAccountDV-CreateAccountContactInputSet-Phone-GlobalPhoneInputSet-PhoneDisplay']", AI = false)
	public WebElement inpWorkPhone_1;

	@IFindBy(how = How.CSS, using = "input[name='CreateAccount-CreateAccountScreen-CreateAccountDV-IndustryCode']", AI = false)
	public WebElement inpIndustryCode;

	@IFindBy(how = How.CSS, using = "div[id$='FirstName'] input[name$='FirstName']", AI = false)
	public WebElement inpFirstname;

	@IFindBy(how = How.CSS, using = "input[name='CreateAccount-CreateAccountScreen-CreateAccountDV-CreateAccountContactInputSet-CellPhone-GlobalPhoneInputSet-NationalSubscriberNumber']", AI = false)
	public WebElement inpMobilePhone;

	@IFindBy(how = How.CSS, using = "div[id$='CreateAccountScreen-ttlBar']", AI = false)
	public WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "#CreateAccount-CreateAccountScreen-Edit>div[role='button']", AI = false)
	public WebElement btnEdit;

	@IFindBy(how = How.CSS, using = "div[id$='Update']", AI = false)
	public WebElement btnUpdate;

	@IFindBy(how = How.CSS, using = "input[name='CreateAccount-CreateAccountScreen-CreateAccountDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine3']", AI = false)
	public WebElement inpAddress3;

	@IFindBy(how = How.CSS, using = "select[name='CreateAccount-CreateAccountScreen-CreateAccountDV-CreateAccountContactInputSet-HomePhone-GlobalPhoneInputSet-CountryCode']", AI = false)
	public WebElement drpHomePhoneRegionCode;

	@IFindBy(how = How.CSS, using = "input[name$='AddressLine1']", AI = false)
	public WebElement inpAddress1;

	@IFindBy(how = How.CSS, using = "select[name$='AddressType']", AI = false)
	public WebElement drpAddressType;

	@IFindBy(how = How.CSS, using = "input[name='CreateAccount-CreateAccountScreen-CreateAccountDV-CreateAccountContactInputSet-EmailAddress1']", AI = false)
	public WebElement inpPrimaryEmail;

	@IFindBy(how = How.CSS, using = "input[name='CreateAccount-CreateAccountScreen-CreateAccountDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine2']", AI = false)
	public WebElement inpAddress2;

	@IFindBy(how = How.CSS, using = "input[name='CreateAccount-CreateAccountScreen-CreateAccountDV-OfficialIDInputSet-OfficialIDDV_Input']", AI = false)
	public WebElement inpSSN;

	@IFindBy(how = How.CSS, using = "input[name='CreateAccount-CreateAccountScreen-CreateAccountDV-LinkedAddressInputSet-LinkAddressMenu']", AI = false)
	public WebElement inpAddress;

	@IFindBy(how = How.CSS, using = "#CreateAccount-CreateAccountScreen-CheckForDuplicates>div[role='button']", AI = false)
	public WebElement btnCheckforDuplicates;

	@IFindBy(how = How.CSS, using = "select[name='CreateAccount-CreateAccountScreen-CreateAccountDV-LinkedAddressInputSet-LinkAddressMenu-LinkAddressMenuMenuIcon']", AI = false)
	public WebElement drpLinkAddressMenuMenuIcon;

	@IFindBy(how = How.CSS, using = "input[name='CreateAccount-CreateAccountScreen-CreateAccountDV-CreateAccountContactInputSet-GlobalPersonNameInputSet-MiddleName']", AI = false)
	public WebElement inpMiddlename;

	@IFindBy(how = How.CSS, using = "input[name$='PostalCode']", AI = false)
	public WebElement inpZIPCode;

	@IFindBy(how = How.CSS, using = "#CreateAccount-CreateAccountScreen-CreateAccountDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-City-AutoFillIcon", AI = false)
	public WebElement btnAutoFillIcon;

	@IFindBy(how = How.CSS, using = "select[name='CreateAccount-CreateAccountScreen-CreateAccountDV-OrgType']", AI = false)
	public WebElement drpOrganizationType;

	@IFindBy(how = How.CSS, using = "input[name='CreateAccount-CreateAccountScreen-CreateAccountDV-CreateAccountContactInputSet-Phone-GlobalPhoneInputSet-Extension']", AI = false)
	public WebElement inpWorkPhoneExtension;

	@IFindBy(how = How.CSS, using = "select[name='CreateAccount-CreateAccountScreen-CreateAccountDV-CreateAccountContactInputSet-FaxPhone-GlobalPhoneInputSet-CountryCode']", AI = false)
	public WebElement drpFaxPhoneRegionCode;

	@IFindBy(how = How.CSS, using = "input[name='CreateAccount-CreateAccountScreen-CreateAccountDV-CreateAccountContactInputSet-CellPhone-GlobalPhoneInputSet-PhoneDisplay']", AI = false)
	public WebElement inpMobilePhone_1;

	@IFindBy(how = How.CSS, using = "#CreateAccount-CreateAccountScreen-Update>div[role='button']", AI = false)
	public WebElement btnUpdate_1;

	@IFindBy(how = How.CSS, using = "select[name='CreateAccount-CreateAccountScreen-CreateAccountDV-CreateAccountContactInputSet-CellPhone-GlobalPhoneInputSet-CountryCode']", AI = false)
	public WebElement drpMobilePhoneRegionCode;

	@IFindBy(how = How.CSS, using = "select[name='CreateAccount-CreateAccountScreen-CreateAccountDV-CreateAccountContactInputSet-GlobalPersonNameInputSet-Prefix']", AI = false)
	public WebElement drpPrefix;

	@IFindBy(how = How.CSS, using = "input[name='CreateAccount-CreateAccountScreen-CreateAccountDV-CreateAccountContactInputSet-GlobalPersonNameInputSet-NameSummary']", AI = false)
	public WebElement inpName;

	@IFindBy(how = How.CSS, using = "input[name='CreateAccount-CreateAccountScreen-CreateAccountDV-CreateAccountContactInputSet-FaxPhone-GlobalPhoneInputSet-PhoneDisplay']", AI = false)
	public WebElement inpFaxPhone_1;

	@IFindBy(how = How.CSS, using = "select[name='CreateAccount-CreateAccountScreen-CreateAccountDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-Country']", AI = false)
	public WebElement drpCountry;

	@IFindBy(how = How.CSS, using = "select[name='CreateAccount-CreateAccountScreen-CreateAccountDV-CreateAccountContactInputSet-GlobalPersonNameInputSet-Suffix']", AI = false)
	public WebElement drpSuffix;

	@IFindBy(how = How.CSS, using = "div[id$='State'] select[name$='State']", AI = false)
	public WebElement drpState;

	@IFindBy(how = How.CSS, using = "input[name='CreateAccount-CreateAccountScreen-CreateAccountDV-CreateAccountContactInputSet-Phone-GlobalPhoneInputSet-NationalSubscriberNumber']", AI = false)
	public WebElement inpWorkPhone;

	@IFindBy(how = How.CSS, using = "#CreateAccount-CreateAccountScreen-Cancel>div[role='button']", AI = false)
	public WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "#CreateAccount-CreateAccountScreen-CreateAccountDV-ProducerSelectionInputSet-Producer-SelectOrganization", AI = false)
	public WebElement btnSelectOrganization;

	@IFindBy(how = How.CSS, using = "select[name='CreateAccount-CreateAccountScreen-CreateAccountDV-AccountCurrency-AccountCurrencyInputSet-PreferredCoverageCurrency']", AI = false)
	public WebElement drpCoverage;

	@IFindBy(how = How.CSS, using = "input[name='CreateAccount-CreateAccountScreen-CreateAccountDV-DescriptionOfBusiness']", AI = false)
	public WebElement inpDescriptionofBusiness;

	@IFindBy(how = How.CSS, using = "input[name='CreateAccount-CreateAccountScreen-CreateAccountDV-CreateAccountContactInputSet-FaxPhone-GlobalPhoneInputSet-Extension']", AI = false)
	public WebElement inpFaxPhoneExtension;

	@IFindBy(how = How.CSS, using = "select[name='CreateAccount-CreateAccountScreen-CreateAccountDV-AccountCurrency-AccountCurrencyInputSet-PreferredSettlementCurrency']", AI = false)
	public WebElement drpSettlement;

	public CreateAccountPage(){
	}

	public CreateAccountPage(WebDriver driver){
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, Utils.minElementWait);
		PageFactory.initElements(finder, this);
		elementLayer = new ElementLayer(driver);
	}
	
	public CreateAccountPage(WebDriver driver, int timeout){
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, timeout);
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

		if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, lblTtlBar))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}
		elementLayer = new ElementLayer(driver);
	}// isLoaded
	
	public CreateAccountPage selectProducerCode(WebDriver driver,String ProducerCode)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpProducerCode,ProducerCode,"ProducerCode");
		return this;
	}
	public CreateAccountPage enterHomePhone_1(WebDriver driver,String HomePhone_1) {
		BrowserActions.type(driver, inpHomePhone_1,HomePhone_1, "HomePhone_1");
		return this;
	}
	public CreateAccountPage enterDescription(WebDriver driver,String Description) {
		BrowserActions.type(driver, inpDescription,Description, "Description");
		return this;
	}
	public CreateAccountPage clickEditaddress(WebDriver driver)  {
		BrowserActions.click(driver, btnEditaddress,"Editaddress");
		return this;
	}
	public CreateAccountPage enterOrganization(WebDriver driver,String Organization) {
		BrowserActions.type(driver, inpOrganization,Organization,"Organization");
		return this;
	}
	public CreateAccountPage enterHomePhoneExtension(WebDriver driver,String HomePhoneExtension) {
		BrowserActions.type(driver, inpHomePhoneExtension,HomePhoneExtension, "HomePhoneExtension");
		return this;
	}
	public CreateAccountPage enterParticle(WebDriver driver,String Particle) {
		BrowserActions.type(driver, inpParticle,Particle, "Particle");
		return this;
	}
	public CreateAccountPage clickAutoFillIcon_1(WebDriver driver)  {
		BrowserActions.click(driver, btnAutoFillIcon_1,"AutoFillIcon_1");
		return this;
	}
	public CreateAccountPage enterLastname(WebDriver driver,String Lastname) {
		BrowserActions.type(driver, inpLastname,Lastname, "Lastname");
		return this;
	}
	public CreateAccountPage enterMobilePhoneExtension(WebDriver driver,String MobilePhoneExtension) {
		BrowserActions.type(driver, inpMobilePhoneExtension,MobilePhoneExtension, "MobilePhoneExtension");
		return this;
	}
	public CreateAccountPage selectPrimaryPhone(WebDriver driver,String PrimaryPhone)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPrimaryPhone,PrimaryPhone,"PrimaryPhone");
		return this;
	}
	public CreateAccountPage enterCity(WebDriver driver,String City) {
		BrowserActions.type(driver, inpCity,City,true, "City");
		return this;
	}
	public CreateAccountPage selectPreferredLanguage(WebDriver driver,String PreferredLanguage)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPreferredLanguage,PreferredLanguage,"PreferredLanguage");
		return this;
	}
	public CreateAccountPage selectWorkPhoneRegionCode(WebDriver driver,String WorkPhoneRegionCode)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpWorkPhoneRegionCode,WorkPhoneRegionCode,"WorkPhoneRegionCode");
		return this;
	}
	public CreateAccountPage enterCounty(WebDriver driver,String County) {
		BrowserActions.type(driver, inpCounty,County, "County");
		return this;
	}
	public CreateAccountPage clickSearch(WebDriver driver)  {
		BrowserActions.click(driver, btnSearch,"Search");
		return this;
	}
	public CreateAccountPage enterFaxPhone(WebDriver driver,String FaxPhone) {
		BrowserActions.type(driver, inpFaxPhone,FaxPhone, "FaxPhone");
		return this;
	}
	public CreateAccountPage enterAccountNickname(WebDriver driver,String AccountNickname) {
		BrowserActions.type(driver, inpAccountNickname,AccountNickname, "AccountNickname");
		return this;
	}
	public CreateAccountPage enterAddress_1(WebDriver driver,String Address_1) {
		BrowserActions.type(driver, inpAddress_1,Address_1, "Address_1");
		return this;
	}
	public CreateAccountPage enterHomePhone(WebDriver driver,String HomePhone) {
		BrowserActions.type(driver, inpHomePhone,HomePhone, "HomePhone");
		return this;
	}
	public CreateAccountPage enterSecondaryEmail(WebDriver driver,String SecondaryEmail) {
		BrowserActions.type(driver, inpSecondaryEmail,SecondaryEmail, "SecondaryEmail");
		return this;
	}
	public CreateAccountPage enterWorkPhone_1(WebDriver driver,String WorkPhone_1) {
		BrowserActions.type(driver, inpWorkPhone_1,WorkPhone_1, "WorkPhone_1");
		return this;
	}
	public CreateAccountPage enterIndustryCode(WebDriver driver,String IndustryCode) {
		BrowserActions.type(driver, inpIndustryCode,IndustryCode, "IndustryCode");
		return this;
	}
	public CreateAccountPage enterFirstname(WebDriver driver,String Firstname) {
		BrowserActions.type(driver, inpFirstname,Firstname, "Firstname");
		return this;
	}
	public CreateAccountPage enterMobilePhone(WebDriver driver,String MobilePhone) {
		BrowserActions.type(driver, inpMobilePhone,MobilePhone, "MobilePhone");
		return this;
	}
	public CreateAccountPage clickEdit(WebDriver driver)  {
		BrowserActions.click(driver, btnEdit,"Edit");
		return this;
	}
	public CreateAccountPage clickUpdate(WebDriver driver)  {
		BrowserActions.click(driver, btnUpdate,1,"Update");
		//below line will be removed once failure is analyzed
		JavascriptExecutor js = (JavascriptExecutor) driver;         
		js.executeScript("window.scrollTo(0, 0);");  
		return this;
	}
	public CreateAccountPage enterAddress3(WebDriver driver,String Address3) {
		BrowserActions.type(driver, inpAddress3,Address3, "Address3");
		return this;
	}
	public CreateAccountPage selectHomePhoneRegionCode(WebDriver driver,String HomePhoneRegionCode)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpHomePhoneRegionCode,HomePhoneRegionCode,"HomePhoneRegionCode");
		return this;
	}
	public CreateAccountPage enterAddress1(WebDriver driver,String Address1) {
		BrowserActions.type(driver, inpAddress1,Address1,"Address1");
		return this;
	}
	public CreateAccountPage selectAddressType(WebDriver driver,String AddressType)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpAddressType,AddressType,true,"AddressType");
		return this;
	}
	public CreateAccountPage enterPrimaryEmail(WebDriver driver,String PrimaryEmail) {
		BrowserActions.type(driver, inpPrimaryEmail,PrimaryEmail, "PrimaryEmail");
		return this;
	}
	public CreateAccountPage enterAddress2(WebDriver driver,String Address2) {
		BrowserActions.type(driver, inpAddress2,Address2, "Address2");
		return this;
	}
	public CreateAccountPage enterSSN(WebDriver driver,String SSN) {
		BrowserActions.type(driver, inpSSN,SSN, "SSN");
		return this;
	}
	public CreateAccountPage enterAddress(WebDriver driver,String Address) {
		BrowserActions.type(driver, inpAddress,Address, "Address");
		return this;
	}
	public CreateAccountPage clickCheckforDuplicates(WebDriver driver)  {
		BrowserActions.click(driver, btnCheckforDuplicates,"CheckforDuplicates");
		return this;
	}
	public CreateAccountPage selectLinkAddressMenuMenuIcon(WebDriver driver,String LinkAddressMenuMenuIcon)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpLinkAddressMenuMenuIcon,LinkAddressMenuMenuIcon,"LinkAddressMenuMenuIcon");
		return this;
	}
	public CreateAccountPage enterMiddlename(WebDriver driver,String Middlename) {
		BrowserActions.type(driver, inpMiddlename,Middlename, "Middlename");
		return this;
	}
	public CreateAccountPage enterZIPCode(WebDriver driver,String ZIPCode) {
		BrowserActions.type(driver, inpZIPCode,ZIPCode,true,"ZIPCode");
		return this;
	}
	public CreateAccountPage clickAutoFillIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnAutoFillIcon,"AutoFillIcon");
		return this;
	}
	public CreateAccountPage selectOrganizationType(WebDriver driver,String OrganizationType)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpOrganizationType,OrganizationType,"OrganizationType");
		return this;
	}
	public CreateAccountPage enterWorkPhoneExtension(WebDriver driver,String WorkPhoneExtension) {
		BrowserActions.type(driver, inpWorkPhoneExtension,WorkPhoneExtension, "WorkPhoneExtension");
		return this;
	}
	public CreateAccountPage selectFaxPhoneRegionCode(WebDriver driver,String FaxPhoneRegionCode)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpFaxPhoneRegionCode,FaxPhoneRegionCode,"FaxPhoneRegionCode");
		return this;
	}
	public CreateAccountPage enterMobilePhone_1(WebDriver driver,String MobilePhone_1) {
		BrowserActions.type(driver, inpMobilePhone_1,MobilePhone_1, "MobilePhone_1");
		return this;
	}
	public CreateAccountPage clickUpdate_1(WebDriver driver)  {
		BrowserActions.click(driver, btnUpdate_1,"Update_1");
		return this;
	}
	public CreateAccountPage selectMobilePhoneRegionCode(WebDriver driver,String MobilePhoneRegionCode)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpMobilePhoneRegionCode,MobilePhoneRegionCode,"MobilePhoneRegionCode");
		return this;
	}
	public CreateAccountPage selectPrefix(WebDriver driver,String Prefix)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPrefix,Prefix,"Prefix");
		return this;
	}
	public CreateAccountPage enterName(WebDriver driver,String Name) {
		BrowserActions.type(driver, inpName,Name, "Name");
		return this;
	}
	public CreateAccountPage enterFaxPhone_1(WebDriver driver,String FaxPhone_1) {
		BrowserActions.type(driver, inpFaxPhone_1,FaxPhone_1, "FaxPhone_1");
		return this;
	}
	public CreateAccountPage selectCountry(WebDriver driver,String Country)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCountry,Country,"Country");
		return this;
	}
	public CreateAccountPage selectSuffix(WebDriver driver,String Suffix)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpSuffix,Suffix,"Suffix");
		return this;
	}
	public CreateAccountPage selectState(WebDriver driver,String State)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpState,State,true,"State");
		return this;
	}
	public CreateAccountPage enterWorkPhone(WebDriver driver,String WorkPhone) {
		BrowserActions.type(driver, inpWorkPhone,WorkPhone, "WorkPhone");
		return this;
	}
	public CreateAccountPage clickCancel(WebDriver driver)  {
		BrowserActions.click(driver, btnCancel,"Cancel");
		return this;
	}
	public CreateAccountPage clickSelectOrganization(WebDriver driver)  {
		BrowserActions.click(driver, btnSelectOrganization,"SelectOrganization");
		return this;
	}
	public CreateAccountPage selectCoverage(WebDriver driver,String Coverage)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCoverage,Coverage,"Coverage");
		return this;
	}
	public CreateAccountPage enterDescriptionofBusiness(WebDriver driver,String DescriptionofBusiness) {
		BrowserActions.type(driver, inpDescriptionofBusiness,DescriptionofBusiness, "DescriptionofBusiness");
		return this;
	}
	public CreateAccountPage enterFaxPhoneExtension(WebDriver driver,String FaxPhoneExtension) {
		BrowserActions.type(driver, inpFaxPhoneExtension,FaxPhoneExtension, "FaxPhoneExtension");
		return this;
	}
	public CreateAccountPage selectSettlement(WebDriver driver,String Settlement)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpSettlement,Settlement,"Settlement");
		return this;
	}
	
}
