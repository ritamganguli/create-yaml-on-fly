package com.aspire.guidewire.pc.pages.common;

import java.util.ArrayList;
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

public class NewAdditionalInterestPage extends LoadableComponent<NewAdditionalInterestPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();
	
	@IFindBy(how = How.CSS, using = "#NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactRoleDetailCardTab", AI = false)
	public WebElement btnContactDetail;

	@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-HomePhone-GlobalPhoneInputSet-PhoneDisplay']", AI = false)
	public WebElement inpHomePhone_1;

	@IFindBy(how = How.CSS, using = "#NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-LinkedAddressInputSet-LinkAddressMenu-EditAddress>div[role='menuitem']", AI = false)
	public WebElement btnEditaddress;

	@IFindBy(how = How.CSS, using = "#NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-LinkedAddressInputSet-LinkAddressMenu-0-contactDetail>div[role='menuitem']", AI = false)
	public WebElement btnContactDetail_1;

	@IFindBy(how = How.CSS, using = "#NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-PostalCode-AutoFillIcon", AI = false)
	public WebElement btnAutoFillIcon_1;

	@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-GlobalPersonNameInputSet-LastName']", AI = false)
	public WebElement inpLastname;

	@IFindBy(how = How.CSS, using = "select[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-PrimaryPhone']", AI = false)
	public WebElement drpPrimaryPhone;

	@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressDescription']", AI = false)
	public WebElement inpAddressDescription;

	@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-County']", AI = false)
	public WebElement inpCounty;

	@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-FaxPhone-GlobalPhoneInputSet-NationalSubscriberNumber']", AI = false)
	public WebElement inpFaxPhone;

	@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressSummary']", AI = false)
	public WebElement inpAddress_1;

	@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-AdditionalInterestInfoDV-ContractNumber']", AI = false)
	public WebElement inpContractNumber;

	@IFindBy(how = How.CSS, using = "#NewAdditionalInterestPopup-__crumb__", AI = false)
	public WebElement btnReturntoVehicles;

	@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-HomePhone-GlobalPhoneInputSet-NationalSubscriberNumber']", AI = false)
	public WebElement inpHomePhone;

	@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-EmailAddress2']", AI = false)
	public WebElement inpSecondaryEmail;

	@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-GlobalPersonNameInputSet-FirstName']", AI = false)
	public WebElement inpFirstname;

	@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-CellPhone-GlobalPhoneInputSet-NationalSubscriberNumber']", AI = false)
	public WebElement inpMobilePhone;

	@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine3']", AI = false)
	public WebElement inpAddress3;

	@IFindBy(how = How.CSS, using = "select[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-HomePhone-GlobalPhoneInputSet-CountryCode']", AI = false)
	public WebElement drpHomePhoneRegionCode;

	@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine1']", AI = false)
	public WebElement inpAddress1;

	@IFindBy(how = How.CSS, using = "select[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressType']", AI = false)
	public WebElement drpAddressType;

	@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine2']", AI = false)
	public WebElement inpAddress2;

	@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-OfficialIDInputSet-OfficialIDDV_Input']", AI = false)
	public WebElement inpSSN;

	@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-LinkedAddressInputSet-LinkAddressMenu']", AI = false)
	public WebElement inpAddress;

	@IFindBy(how = How.CSS, using = "select[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-ContactCurrency-ContactCurrencyInputSet-PreferredSettlementCurrency']", AI = false)
	public WebElement drpPreferredCurrency;

	@IFindBy(how = How.CSS, using = "#NewAdditionalInterestPopup-ContactDetailScreen-CheckForDuplicates>div[role='button']", AI = false)
	public WebElement btnCheckforDuplicates;

	@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-PostalCode']", AI = false)
	public WebElement inpZIPCode;

	@IFindBy(how = How.CSS, using = "#NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-City-AutoFillIcon", AI = false)
	public WebElement btnAutoFillIcon;

	@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-WorkPhone-GlobalPhoneInputSet-Extension']", AI = false)
	public WebElement inpWorkPhoneExtension;

	@IFindBy(how = How.CSS, using = "select[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-FaxPhone-GlobalPhoneInputSet-CountryCode']", AI = false)
	public WebElement drpFaxPhoneRegionCode;

	@IFindBy(how = How.CSS, using = "select[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-CellPhone-GlobalPhoneInputSet-CountryCode']", AI = false)
	public WebElement drpMobilePhoneRegionCode;

	@IFindBy(how = How.CSS, using = "select[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-GlobalPersonNameInputSet-Prefix']", AI = false)
	public WebElement drpPrefix;

	@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-GlobalPersonNameInputSet-NameSummary']", AI = false)
	public WebElement inpName;

	@IFindBy(how = How.CSS, using = "#NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-LinkedAddressInputSet-LinkAddressMenu-0-contactDetail-PrimaryAddress>div[role='menuitem']", AI = false)
	public WebElement btnSt123DiGiorgioCA93203;

	@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-FaxPhone-GlobalPhoneInputSet-PhoneDisplay']", AI = false)
	public WebElement inpFaxPhone_1;

	@IFindBy(how = How.CSS, using = "select[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-Country']", AI = false)
	public WebElement drpCountry;

	@IFindBy(how = How.CSS, using = "select[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-GlobalPersonNameInputSet-Suffix']", AI = false)
	public WebElement drpSuffix;

	@IFindBy(how = How.CSS, using = "select[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-State']", AI = false)
	public WebElement drpState;

	@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-AdditionalInterestInfoDV-CertRequired']", AI = false)
	public WebElement rdbCertificateRequired;

	@IFindBy(how = How.CSS, using = "select[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-MaritalStatus']", AI = false)
	public WebElement drpMaritalStatus;

	@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-HomePhone-GlobalPhoneInputSet-Extension']", AI = false)
	public WebElement inpHomePhoneExtension;

	@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-GlobalPersonNameInputSet-Particle']", AI = false)
	public WebElement inpParticle;

	@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-CellPhone-GlobalPhoneInputSet-Extension']", AI = false)
	public WebElement inpMobilePhoneExtension;

	@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-City']", AI = false)
	public WebElement inpCity;

	@IFindBy(how = How.CSS, using = "select[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-LicenseInputSet-LicenseState']", AI = false)
	public WebElement drpLicenseState;

	@IFindBy(how = How.CSS, using = "select[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-WorkPhone-GlobalPhoneInputSet-CountryCode']", AI = false)
	public WebElement drpWorkPhoneRegionCode;

	@IFindBy(how = How.CSS, using = "#NewAdditionalInterestPopup-ContactDetailScreen-ForceDupCheckUpdate>div[role='button']", AI = false)
	public WebElement btnOK;

	@IFindBy(how = How.CSS, using = "select[name='NewAdditionalInterestPopup-ContactDetailScreen-AdditionalInterestInfoDV-Type']", AI = false)
	public WebElement drpInterestType;

	@IFindBy(how = How.CSS, using = "#NewAdditionalInterestPopup-ContactDetailScreen-Update>div[role='button']", AI = false)
	public WebElement btnOK_1;

	@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-WorkPhone-GlobalPhoneInputSet-PhoneDisplay']", AI = false)
	public WebElement inpWorkPhone_1;

	@IFindBy(how = How.CSS, using = "#NewAdditionalInterestPopup-ContactDetailScreen-ttlBar", AI = false)
	public WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "#NewAdditionalInterestPopup-ContactDetailScreen-Edit>div[role='button']", AI = false)
	public WebElement btnEdit;

	@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-EmailAddress1']", AI = false)
	public WebElement inpPrimaryEmail;

	@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-DateOfBirth']", AI = false)
	public WebElement inpDateofBirth;

	@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-GlobalPersonNameInputSet-MiddleName']", AI = false)
	public WebElement inpMiddlename;

	@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-CellPhone-GlobalPhoneInputSet-PhoneDisplay']", AI = false)
	public WebElement inpMobilePhone_1;

	@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-LicenseInputSet-LicenseNumber']", AI = false)
	public WebElement inpLicense;

	@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-WorkPhone-GlobalPhoneInputSet-NationalSubscriberNumber']", AI = false)
	public WebElement inpWorkPhone;

	@IFindBy(how = How.CSS, using = "#NewAdditionalInterestPopup-ContactDetailScreen-Cancel>div[role='button']", AI = false)
	public WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-FaxPhone-GlobalPhoneInputSet-Extension']", AI = false)
	public WebElement inpFaxPhoneExtension;

	public NewAdditionalInterestPage(){
	}

	public NewAdditionalInterestPage(WebDriver driver) {
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(finder, this);
}
	@Override
	protected void load() {
		isPageLoaded = true;
		WaitUtils.waitForPageLoad(driver);
	}// loadF
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
public NewAdditionalInterestPage clickContactDetail(WebDriver driver)  {
					BrowserActions.click(driver, btnContactDetail,"ContactDetail");
				    return this;
			}
public NewAdditionalInterestPage enterHomePhone_1(WebDriver driver,String HomePhone_1) {
		            BrowserActions.type(driver, inpHomePhone_1,HomePhone_1, "HomePhone_1");
			        return this;
           }
public NewAdditionalInterestPage clickEditaddress(WebDriver driver)  {
					BrowserActions.click(driver, btnEditaddress,"Editaddress");
				    return this;
			}
public NewAdditionalInterestPage clickContactDetail_1(WebDriver driver)  {
					BrowserActions.click(driver, btnContactDetail_1,"ContactDetail_1");
				    return this;
			}
public NewAdditionalInterestPage clickAutoFillIcon_1(WebDriver driver)  {
					BrowserActions.click(driver, btnAutoFillIcon_1,"AutoFillIcon_1");
				    return this;
			}
public NewAdditionalInterestPage enterLastname(WebDriver driver,String Lastname) {
		            BrowserActions.type(driver, inpLastname,Lastname, "Lastname");
			        return this;
           }
public NewAdditionalInterestPage selectPrimaryPhone(WebDriver driver,String PrimaryPhone)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPrimaryPhone,PrimaryPhone,"PrimaryPhone");
				    return this;
			}
public NewAdditionalInterestPage enterAddressDescription(WebDriver driver,String AddressDescription) {
		            BrowserActions.type(driver, inpAddressDescription,AddressDescription, "AddressDescription");
			        return this;
           }
public NewAdditionalInterestPage enterCounty(WebDriver driver,String County) {
		            BrowserActions.type(driver, inpCounty,County, "County");
			        return this;
           }
public NewAdditionalInterestPage enterFaxPhone(WebDriver driver,String FaxPhone) {
		            BrowserActions.type(driver, inpFaxPhone,FaxPhone, "FaxPhone");
			        return this;
           }
public NewAdditionalInterestPage enterAddress_1(WebDriver driver,String Address_1) {
		            BrowserActions.type(driver, inpAddress_1,Address_1, "Address_1");
			        return this;
           }
public NewAdditionalInterestPage enterContractNumber(WebDriver driver,String ContractNumber) {
		            BrowserActions.type(driver, inpContractNumber,ContractNumber, "ContractNumber");
			        return this;
           }
public NewAdditionalInterestPage clickReturntoVehicles(WebDriver driver)  {
					BrowserActions.click(driver, btnReturntoVehicles,"ReturntoVehicles");
				    return this;
			}
public NewAdditionalInterestPage enterHomePhone(WebDriver driver,String HomePhone) {
		            BrowserActions.type(driver, inpHomePhone,HomePhone, "HomePhone");
			        return this;
           }
public NewAdditionalInterestPage enterSecondaryEmail(WebDriver driver,String SecondaryEmail) {
		            BrowserActions.type(driver, inpSecondaryEmail,SecondaryEmail, "SecondaryEmail");
			        return this;
           }
public NewAdditionalInterestPage enterFirstname(WebDriver driver,String Firstname) {
		            BrowserActions.type(driver, inpFirstname,Firstname, "Firstname");
			        return this;
           }
public NewAdditionalInterestPage enterMobilePhone(WebDriver driver,String MobilePhone) {
		            BrowserActions.type(driver, inpMobilePhone,MobilePhone, "MobilePhone");
			        return this;
           }
public NewAdditionalInterestPage enterAddress3(WebDriver driver,String Address3) {
		            BrowserActions.type(driver, inpAddress3,Address3, "Address3");
			        return this;
           }
public NewAdditionalInterestPage selectHomePhoneRegionCode(WebDriver driver,String HomePhoneRegionCode)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpHomePhoneRegionCode,HomePhoneRegionCode,"HomePhoneRegionCode");
				    return this;
			}
public NewAdditionalInterestPage enterAddress1(WebDriver driver,String Address1) {
		            BrowserActions.type(driver, inpAddress1,Address1, "Address1");
			        return this;
           }
public NewAdditionalInterestPage selectAddressType(WebDriver driver,String AddressType)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpAddressType,AddressType,"AddressType");
				    return this;
			}
public NewAdditionalInterestPage enterAddress2(WebDriver driver,String Address2) {
		            BrowserActions.type(driver, inpAddress2,Address2, "Address2");
			        return this;
           }
public NewAdditionalInterestPage enterSSN(WebDriver driver,String SSN) {
		            BrowserActions.type(driver, inpSSN,SSN, "SSN");
			        return this;
           }
public NewAdditionalInterestPage enterAddress(WebDriver driver,String Address) {
		            BrowserActions.type(driver, inpAddress,Address, "Address");
			        return this;
           }
public NewAdditionalInterestPage selectPreferredCurrency(WebDriver driver,String PreferredCurrency)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPreferredCurrency,PreferredCurrency,"PreferredCurrency");
				    return this;
			}
public NewAdditionalInterestPage clickCheckforDuplicates(WebDriver driver)  {
					BrowserActions.click(driver, btnCheckforDuplicates,"CheckforDuplicates");
				    return this;
			}
public NewAdditionalInterestPage enterZIPCode(WebDriver driver,String ZIPCode) {
		            BrowserActions.type(driver, inpZIPCode,ZIPCode, "ZIPCode");
			        return this;
           }
public NewAdditionalInterestPage clickAutoFillIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnAutoFillIcon,"AutoFillIcon");
				    return this;
			}
public NewAdditionalInterestPage enterWorkPhoneExtension(WebDriver driver,String WorkPhoneExtension) {
		            BrowserActions.type(driver, inpWorkPhoneExtension,WorkPhoneExtension, "WorkPhoneExtension");
			        return this;
           }
public NewAdditionalInterestPage selectFaxPhoneRegionCode(WebDriver driver,String FaxPhoneRegionCode)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpFaxPhoneRegionCode,FaxPhoneRegionCode,"FaxPhoneRegionCode");
				    return this;
			}
public NewAdditionalInterestPage selectMobilePhoneRegionCode(WebDriver driver,String MobilePhoneRegionCode)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpMobilePhoneRegionCode,MobilePhoneRegionCode,"MobilePhoneRegionCode");
				    return this;
			}
public NewAdditionalInterestPage selectPrefix(WebDriver driver,String Prefix)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPrefix,Prefix,"Prefix");
				    return this;
			}
public NewAdditionalInterestPage enterName(WebDriver driver,String Name) {
		            BrowserActions.type(driver, inpName,Name, "Name");
			        return this;
           }
public NewAdditionalInterestPage clickSt123DiGiorgioCA93203(WebDriver driver)  {
					BrowserActions.click(driver, btnSt123DiGiorgioCA93203,"St123DiGiorgioCA93203");
				    return this;
			}
public NewAdditionalInterestPage enterFaxPhone_1(WebDriver driver,String FaxPhone_1) {
		            BrowserActions.type(driver, inpFaxPhone_1,FaxPhone_1, "FaxPhone_1");
			        return this;
           }
public NewAdditionalInterestPage selectCountry(WebDriver driver,String Country)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpCountry,Country,"Country");
				    return this;
			}
public NewAdditionalInterestPage selectSuffix(WebDriver driver,String Suffix)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpSuffix,Suffix,"Suffix");
				    return this;
			}
public NewAdditionalInterestPage selectState(WebDriver driver,String State)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpState,State,"State");
				    return this;
			}
public NewAdditionalInterestPage clickCertificateRequired(WebDriver driver)  {
					BrowserActions.click(driver, rdbCertificateRequired,"CertificateRequired");
				    return this;
			}
public NewAdditionalInterestPage selectMaritalStatus(WebDriver driver,String MaritalStatus)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpMaritalStatus,MaritalStatus,"MaritalStatus");
				    return this;
			}
public NewAdditionalInterestPage enterHomePhoneExtension(WebDriver driver,String HomePhoneExtension) {
		            BrowserActions.type(driver, inpHomePhoneExtension,HomePhoneExtension, "HomePhoneExtension");
			        return this;
           }
public NewAdditionalInterestPage enterParticle(WebDriver driver,String Particle) {
		            BrowserActions.type(driver, inpParticle,Particle, "Particle");
			        return this;
           }
public NewAdditionalInterestPage enterMobilePhoneExtension(WebDriver driver,String MobilePhoneExtension) {
		            BrowserActions.type(driver, inpMobilePhoneExtension,MobilePhoneExtension, "MobilePhoneExtension");
			        return this;
           }
public NewAdditionalInterestPage enterCity(WebDriver driver,String City) {
		            BrowserActions.type(driver, inpCity,City, "City");
			        return this;
           }
public NewAdditionalInterestPage selectLicenseState(WebDriver driver,String LicenseState)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpLicenseState,LicenseState,"LicenseState");
				    return this;
			}
public NewAdditionalInterestPage selectWorkPhoneRegionCode(WebDriver driver,String WorkPhoneRegionCode)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpWorkPhoneRegionCode,WorkPhoneRegionCode,"WorkPhoneRegionCode");
				    return this;
			}
public NewAdditionalInterestPage clickOK(WebDriver driver)  {
					BrowserActions.click(driver, btnOK,"OK");
				    return this;
			}
public NewAdditionalInterestPage selectInterestType(WebDriver driver,String InterestType)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpInterestType,InterestType,"InterestType");
				    return this;
			}
public NewAdditionalInterestPage clickOK_1(WebDriver driver)  {
					BrowserActions.click(driver, btnOK_1,"OK_1");
				    return this;
			}
public NewAdditionalInterestPage enterWorkPhone_1(WebDriver driver,String WorkPhone_1) {
		            BrowserActions.type(driver, inpWorkPhone_1,WorkPhone_1, "WorkPhone_1");
			        return this;
           }
public NewAdditionalInterestPage clickEdit(WebDriver driver)  {
					BrowserActions.click(driver, btnEdit,"Edit");
				    return this;
			}
public NewAdditionalInterestPage enterPrimaryEmail(WebDriver driver,String PrimaryEmail) {
		            BrowserActions.type(driver, inpPrimaryEmail,PrimaryEmail, "PrimaryEmail");
			        return this;
           }
public NewAdditionalInterestPage enterDateofBirth(WebDriver driver,String DateofBirth) {
		            BrowserActions.type(driver, inpDateofBirth,DateofBirth, "DateofBirth");
			        return this;
           }
public NewAdditionalInterestPage enterMiddlename(WebDriver driver,String Middlename) {
		            BrowserActions.type(driver, inpMiddlename,Middlename, "Middlename");
			        return this;
           }
public NewAdditionalInterestPage enterMobilePhone_1(WebDriver driver,String MobilePhone_1) {
		            BrowserActions.type(driver, inpMobilePhone_1,MobilePhone_1, "MobilePhone_1");
			        return this;
           }
public NewAdditionalInterestPage enterLicense(WebDriver driver,String License) {
		            BrowserActions.type(driver, inpLicense,License, "License");
			        return this;
           }
public NewAdditionalInterestPage enterWorkPhone(WebDriver driver,String WorkPhone) {
		            BrowserActions.type(driver, inpWorkPhone,WorkPhone, "WorkPhone");
			        return this;
           }
public NewAdditionalInterestPage clickCancel(WebDriver driver)  {
					BrowserActions.click(driver, btnCancel,"Cancel");
				    return this;
			}
public NewAdditionalInterestPage enterFaxPhoneExtension(WebDriver driver,String FaxPhoneExtension) {
		            BrowserActions.type(driver, inpFaxPhoneExtension,FaxPhoneExtension, "FaxPhoneExtension");
			        return this;
           }
}
	

