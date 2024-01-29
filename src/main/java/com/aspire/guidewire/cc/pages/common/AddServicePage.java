package com.aspire.guidewire.cc.pages.common;
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

public class AddServicePage extends LoadableComponent<AddServicePage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
 	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
//	public TopNavBar topnavbar;
	@IFindBy(how = How.CSS, using = "select[name='NewServiceRequest-NewServiceRequestScreen-NewServiceRequestDV-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-Address_Picker']", AI = false)
	private WebElement drpServiceAddress_13;

	@IFindBy(how = How.CSS, using = "select[name='NewServiceRequest-NewServiceRequestScreen-NewServiceRequestDV-Specialist']", AI = false)
	private WebElement drpName;

	@IFindBy(how = How.CSS, using = "#NewServiceRequest-NewServiceRequestScreen-NewServiceRequestDV-Specialist-MenuItem_ViewDetails>div[role='menuitem']", AI = false)
	private WebElement btnViewContactDetails;

	@IFindBy(how = How.CSS, using = "#NewServiceRequest-NewServiceRequestScreen-NewServiceRequestDV-NewServiceRequestInstructionInputSet-RequestedServiceCompletionDate_dateIcon", AI = false)
	private WebElement btnRequestedServiceCompletionDateDateIcon;

	@IFindBy(how = How.CSS, using = "#NewServiceRequest-NewServiceRequestScreen-NewServiceRequestDV-NewServiceRequestInstructionInputSet-CustomerContact-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_CompanyVendor>div[role='menuitem']", AI = false)
	private WebElement btnVendorCompany_6;

	@IFindBy(how = How.CSS, using = "#NewServiceRequest-NewServiceRequestScreen-NewServiceRequestDV-Specialist-SpecialistMenuIcon>div[role='button']", AI = false)
	private WebElement btnSpecialistMenuIcon;

	@IFindBy(how = How.CSS, using = "#NewServiceRequest-NewServiceRequestScreen-NewServiceRequestDV-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-PostalCode-AutoFillIcon", AI = false)
	private WebElement btnAutoFillIcon_14;

	@IFindBy(how = How.CSS, using = "#NewServiceRequest-NewServiceRequestScreen-NewServiceRequestDV-NewServiceRequestInstructionInputSet-CustomerContact-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Adjudicator>div[role='menuitem']", AI = false)
	private WebElement btnAdjudicator_8;

	@IFindBy(how = How.CSS, using = "input[name='NewServiceRequest-NewServiceRequestScreen-NewServiceRequestDV-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-City']", AI = false)
	private WebElement inpCity;

	@IFindBy(how = How.CSS, using = "select[name='NewServiceRequest-NewServiceRequestScreen-NewServiceRequestDV-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-Claim_JurisdictionState']", AI = false)
	private WebElement drpJurisdiction;

	@IFindBy(how = How.CSS, using = "input[name='NewServiceRequest-NewServiceRequestScreen-NewServiceRequestDV-NewServiceRequestInstructionInputSet-RequestedQuoteCompletionDate']", AI = false)
	private WebElement inpRequestedQuoteCompletionDate;

	@IFindBy(how = How.CSS, using = "#NewServiceRequest-NewServiceRequestScreen-NewServiceRequestDV-Specialist-ClaimNewServiceRequestSpecialistPickerMenuItemSet-NewVendor-NewMedicalCareOrg>div[role='menuitem']", AI = false)
	private WebElement btnMedicalCareOrganization;

	@IFindBy(how = How.CSS, using = "input[name='NewServiceRequest-NewServiceRequestScreen-NewServiceRequestDV-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-County']", AI = false)
	private WebElement inpCounty;

	@IFindBy(how = How.CSS, using = "#NewServiceRequest-NewServiceRequestScreen-NewServiceRequestDV-NewServiceRequestInstructionInputSet-CustomerContact-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Attorney>div[role='menuitem']", AI = false)
	private WebElement btnAttorney_9;

	@IFindBy(how = How.CSS, using = "#NewServiceRequest-NewServiceRequestScreen-NewServiceRequestDV-IncompatibleServicesAlertText", AI = false)
	private WebElement btnIncompatibleServicesAlertText;

	@IFindBy(how = How.CSS, using = "#NewServiceRequest-NewServiceRequestScreen-NewServiceRequestDV-Specialist-MenuItem_Search>div[role='menuitem']", AI = false)
	private WebElement btnSearch;

	@IFindBy(how = How.CSS, using = "#NewServiceRequest-NewServiceRequestScreen-NewServiceRequestDV-Specialist-ClaimNewServiceRequestSpecialistPickerMenuItemSet-NewLegal-NewAttorney>div[role='menuitem']", AI = false)
	private WebElement btnAttorney;

	@IFindBy(how = How.CSS, using = "input[name='NewServiceRequest-NewServiceRequestScreen-NewServiceRequestDV-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-Claim_LocationCode']", AI = false)
	private WebElement inpLocationCode;

	@IFindBy(how = How.CSS, using = "#NewServiceRequest-Update>div[role='button']", AI = false)
	private WebElement btnSave;

	@IFindBy(how = How.CSS, using = "#NewServiceRequest-NewServiceRequestScreen-NewServiceRequestDV-Specialist-ClaimNewServiceRequestSpecialistPickerMenuItemSet-NewLegal-NewAdjudicator>div[role='menuitem']", AI = false)
	private WebElement btnAdjudicator;

	@IFindBy(how = How.CSS, using = "#NewServiceRequest-NewServiceRequestScreen-NewServiceRequestDV-Specialist-ClaimNewServiceRequestSpecialistPickerMenuItemSet-NewVendor-NewAutoTowingAgency>div[role='menuitem']", AI = false)
	private WebElement btnAutoTowingAgency;

	@IFindBy(how = How.CSS, using = "input[name='NewServiceRequest-NewServiceRequestScreen-NewServiceRequestDV-SpecialistAddress']", AI = false)
	private WebElement inpLocation;

	@IFindBy(how = How.CSS, using = "#NewServiceRequest-NewServiceRequestScreen-NewServiceRequestDV-NewServiceRequestInstructionInputSet-CustomerContact-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewPerson>div[role='menuitem']", AI = false)
	private WebElement btnNewPerson;

	@IFindBy(how = How.CSS, using = "#NewServiceRequest-NewServiceRequestScreen-NewServiceRequestDV-NewServiceRequestInstructionInputSet-CustomerContact-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoRepairShop>div[role='menuitem']", AI = false)
	private WebElement btnAutobodyRepairShop_2;

	@IFindBy(how = How.CSS, using = "input[name='NewServiceRequest-NewServiceRequestScreen-NewServiceRequestDV-NewServiceRequestInstructionInputSet-ServiceAddressName']", AI = false)
	private WebElement inpServiceAddressName;

	@IFindBy(how = How.CSS, using = "#NewServiceRequest-NewServiceRequestScreen-NewServiceRequestDV-NewServiceRequestInstructionInputSet-CustomerContact-MenuItem_ViewDetails>div[role='menuitem']", AI = false)
	private WebElement btnViewContactDetails_12;

	@IFindBy(how = How.CSS, using = "#NewServiceRequest-NewServiceRequestScreen-NewServiceRequestDV-NewServiceRequestInstructionInputSet-CustomerContact-MenuItem_Search>div[role='menuitem']", AI = false)
	private WebElement btnSearch_11;

	@IFindBy(how = How.CSS, using = "input[name='NewServiceRequest-NewServiceRequestScreen-NewServiceRequestDV-SpecialistPhone']", AI = false)
	private WebElement inpPhone;

	@IFindBy(how = How.CSS, using = "#NewServiceRequest-NewServiceRequestScreen-NewServiceRequestDV-NewServiceRequestInstructionInputSet-InstructionText textarea", AI = false)
	private WebElement inpAdditionalInstructions;

	@IFindBy(how = How.CSS, using = "#NewServiceRequest-ttlBar", AI = false)
	private WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "#NewServiceRequest-Edit>div[role='button']", AI = false)
	private WebElement btnEdit;

	@IFindBy(how = How.CSS, using = "#NewServiceRequest-NewServiceRequestScreen-NewServiceRequestDV-IncompatibleServicesAlert", AI = false)
	private WebElement btnIncompatibleServicesAlert;

	@IFindBy(how = How.CSS, using = "#NewServiceRequest-NewServiceRequestScreen-NewServiceRequestDV-Specialist-ClaimNewServiceRequestSpecialistPickerMenuItemSet-NewVendor-NewAutoRepairShop>div[role='menuitem']", AI = false)
	private WebElement btnAutobodyRepairShop;

	@IFindBy(how = How.CSS, using = "input[name='NewServiceRequest-NewServiceRequestScreen-NewServiceRequestDV-NewServiceRequestInstructionInputSet-RequestedServiceCompletionDate']", AI = false)
	private WebElement inpRequestedServiceCompletionDate;

	@IFindBy(how = How.CSS, using = "input[name='NewServiceRequest-NewServiceRequestScreen-NewServiceRequestDV-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressLine3']", AI = false)
	private WebElement inpAddress3;

	@IFindBy(how = How.CSS, using = "input[name='NewServiceRequest-NewServiceRequestScreen-NewServiceRequestDV-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-Address_Description']", AI = false)
	private WebElement inpLocationDescription;

	@IFindBy(how = How.CSS, using = "#NewServiceRequest-NewServiceRequestScreen-NewServiceRequestDV-NewServiceRequestInstructionInputSet-CustomerContact-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor>div[role='menuitem']", AI = false)
	private WebElement btnNewVendor_1;

	@IFindBy(how = How.CSS, using = "input[name='NewServiceRequest-NewServiceRequestScreen-NewServiceRequestDV-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressLine1']", AI = false)
	private WebElement inpAddress1;

	@IFindBy(how = How.CSS, using = "select[name='NewServiceRequest-NewServiceRequestScreen-NewServiceRequestDV-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-Address_AddressType']", AI = false)
	private WebElement drpAddressType;

	@IFindBy(how = How.CSS, using = "input[name='NewServiceRequest-NewServiceRequestScreen-NewServiceRequestDV-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressLine2']", AI = false)
	private WebElement inpAddress2;

	@IFindBy(how = How.CSS, using = "select[name='NewServiceRequest-NewServiceRequestScreen-NewServiceRequestDV-Kind']", AI = false)
	private WebElement drpRequestType;

	@IFindBy(how = How.CSS, using = "#NewServiceRequest-NewServiceRequestScreen-NewServiceRequestDV-NewServiceRequestInstructionInputSet-CustomerContact-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_LawFirm>div[role='menuitem']", AI = false)
	private WebElement btnLawFirm_10;

	@IFindBy(how = How.CSS, using = "#NewServiceRequest-NewServiceRequestScreen-NewServiceRequestDV-NewServiceRequestInstructionInputSet-CustomerContact-CustomerContactMenuIcon>div[role='button']", AI = false)
	private WebElement btnCustomerContactMenuIcon;

	@IFindBy(how = How.CSS, using = "#NewServiceRequest-NewServiceRequestScreen-NewServiceRequestDV-Specialist-ClaimNewServiceRequestSpecialistPickerMenuItemSet-NewVendor-NewPersonVendor>div[role='menuitem']", AI = false)
	private WebElement btnVendorPerson;

	@IFindBy(how = How.CSS, using = "input[name='NewServiceRequest-NewServiceRequestScreen-NewServiceRequestDV-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-PostalCode']", AI = false)
	private WebElement inpZIPCode;

	@IFindBy(how = How.CSS, using = "#NewServiceRequest-NewServiceRequestScreen-NewServiceRequestDV-InstructionServicesLV_tb-Remove>div[role='button']", AI = false)
	private WebElement btnRemove;

	@IFindBy(how = How.CSS, using = "#NewServiceRequest-NewServiceRequestScreen-NewServiceRequestDV-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-City-AutoFillIcon", AI = false)
	private WebElement btnAutoFillIcon;

	@IFindBy(how = How.CSS, using = "select[name='NewServiceRequest-NewServiceRequestScreen-NewServiceRequestDV-NewServiceRequestInstructionInputSet-CustomerContact']", AI = false)
	private WebElement drpCustomerContact;

	@IFindBy(how = How.CSS, using = "input[name='NewServiceRequest-NewServiceRequestScreen-NewServiceRequestDV-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-Address_ValidUntil']", AI = false)
	private WebElement inpValiduntil;

	@IFindBy(how = How.CSS, using = "select[name='NewServiceRequest-NewServiceRequestScreen-NewServiceRequestDV-RelatedTo']", AI = false)
	private WebElement drpRelatedTo;

	@IFindBy(how = How.CSS, using = "#NewServiceRequest-NewServiceRequestScreen-NewServiceRequestDV-NewServiceRequestInstructionInputSet-CustomerContact-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoTowingAgcy>div[role='menuitem']", AI = false)
	private WebElement btnAutoTowingAgency_3;

	@IFindBy(how = How.CSS, using = "#NewServiceRequest-NewServiceRequestScreen-NewServiceRequestDV-NewServiceRequestInstructionInputSet-CustomerContact-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewCompany>div[role='menuitem']", AI = false)
	private WebElement btnNewCompany;

	@IFindBy(how = How.CSS, using = "input[name='NewServiceRequest-NewServiceRequestScreen-NewServiceRequestDV-SpecialistName']", AI = false)
	private WebElement inpName;

	@IFindBy(how = How.CSS, using = "input[name='NewServiceRequest-NewServiceRequestScreen-NewServiceRequestDV-RelatedToName']", AI = false)
	private WebElement inpRelatedTo;

	@IFindBy(how = How.CSS, using = "#NewServiceRequest-NewServiceRequestScreen-NewServiceRequestDV-Specialist-ClaimNewServiceRequestSpecialistPickerMenuItemSet-NewVendor>div[role='menuitem']", AI = false)
	private WebElement btnNewVendor;

	@IFindBy(how = How.CSS, using = "#NewServiceRequest-NewServiceRequestScreen-NewServiceRequestDV-Specialist-ClaimNewServiceRequestSpecialistPickerMenuItemSet-NewVendor-NewDoctor>div[role='menuitem']", AI = false)
	private WebElement btnDoctor;

	@IFindBy(how = How.CSS, using = "#NewServiceRequest-NewServiceRequestScreen-NewServiceRequestDV-Specialist-ClaimNewServiceRequestSpecialistPickerMenuItemSet-NewVendor-NewCompanyVendor>div[role='menuitem']", AI = false)
	private WebElement btnVendorCompany;

	@IFindBy(how = How.CSS, using = "#NewServiceRequest-NewServiceRequestScreen-NewServiceRequestDV-NewServiceRequestInstructionInputSet-CustomerContact-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal>div[role='menuitem']", AI = false)
	private WebElement btnNewLegal_7;

	@IFindBy(how = How.CSS, using = "select[name='NewServiceRequest-NewServiceRequestScreen-NewServiceRequestDV-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-Country']", AI = false)
	private WebElement drpCountry;

	@IFindBy(how = How.CSS, using = "#NewServiceRequest-NewServiceRequestScreen-NewServiceRequestDV-Specialist-ClaimNewServiceRequestSpecialistPickerMenuItemSet-NewLegal-NewLawFirm>div[role='menuitem']", AI = false)
	private WebElement btnLawFirm;

	@IFindBy(how = How.CSS, using = "select[name='NewServiceRequest-NewServiceRequestScreen-NewServiceRequestDV-NewServiceRequestInstructionInputSet-ServiceAddressPicker']", AI = false)
	private WebElement drpServiceAddress;

	@IFindBy(how = How.CSS, using = "#NewServiceRequest-NewServiceRequestScreen-NewServiceRequestDV-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-Address_ValidUntil_dateIcon", AI = false)
	private WebElement btnValiduntilDateIcon;

	@IFindBy(how = How.CSS, using = "select[name='NewServiceRequest-NewServiceRequestScreen-NewServiceRequestDV-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-State']", AI = false)
	private WebElement drpState;

	@IFindBy(how = How.CSS, using = "#NewServiceRequest-NewServiceRequestScreen-NewServiceRequestDV-Specialist-ClaimNewServiceRequestSpecialistPickerMenuItemSet-NewLegal>div[role='menuitem']", AI = false)
	private WebElement btnNewLegal;

	@IFindBy(how = How.CSS, using = "#NewServiceRequest-NewServiceRequestScreen-NewServiceRequestDV-NewServiceRequestInstructionInputSet-RequestedQuoteCompletionDate_dateIcon", AI = false)
	private WebElement btnRequestedQuoteCompletionDateDateIcon;

	@IFindBy(how = How.CSS, using = "#NewServiceRequest-Cancel>div[role='button']", AI = false)
	private WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "#NewServiceRequest-NewServiceRequestScreen-NewServiceRequestDV-InstructionServicesLV_tb-AddMultipleServices>div[role='button']", AI = false)
	private WebElement btnAdd;

	@IFindBy(how = How.CSS, using = "#NewServiceRequest-NewServiceRequestScreen-NewServiceRequestDV-NewServiceRequestInstructionInputSet-CustomerContact-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_Doctor>div[role='menuitem']", AI = false)
	private WebElement btnDoctor_4;

	@IFindBy(how = How.CSS, using = "#NewServiceRequest-NewServiceRequestScreen-NewServiceRequestDV-NewServiceRequestInstructionInputSet-CustomerContact-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_NewLegalVenue>div[role='menuitem']", AI = false)
	private WebElement btnLegalVenue;

	@IFindBy(how = How.CSS, using = "select[name='NewServiceRequest-NewServiceRequestScreen-NewServiceRequestDV-SpecialistCommMethod']", AI = false)
	private WebElement drpCommunicationMethod;

	@IFindBy(how = How.CSS, using = "#NewServiceRequest-SubmitButton>div[role='button']", AI = false)
	private WebElement btnSubmit;

	@IFindBy(how = How.CSS, using = "#NewServiceRequest-NewServiceRequestScreen-NewServiceRequestDV-NewServiceRequestInstructionInputSet-CustomerContact-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_MedicalCareOrg>div[role='menuitem']", AI = false)
	private WebElement btnMedicalCareOrganization_5;

	@IFindBy(how = How.CSS, using = "input[name='NewServiceRequest-NewServiceRequestScreen-NewServiceRequestDV-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressSummary']", AI = false)
	private WebElement inpServiceAddress;

	public AddServicePage(){
	}

	public AddServicePage(WebDriver driver){
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
		}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, lblTtlBar))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);
}public AddServicePage selectServiceAddress_13(WebDriver driver,String ServiceAddress_13)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpServiceAddress_13,ServiceAddress_13,"ServiceAddress_13");
				    return this;
			}
public AddServicePage selectName(WebDriver driver,String Name)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpName,Name,"Name");
				    return this;
			}
public AddServicePage clickViewContactDetails(WebDriver driver)  {
					BrowserActions.click(driver, btnViewContactDetails,"ViewContactDetails");
				    return this;
			}
public AddServicePage clickRequestedServiceCompletionDateDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnRequestedServiceCompletionDateDateIcon,"RequestedServiceCompletionDateDateIcon");
				    return this;
			}
public AddServicePage clickVendorCompany_6(WebDriver driver)  {
					BrowserActions.click(driver, btnVendorCompany_6,"VendorCompany_6");
				    return this;
			}
public AddServicePage clickSpecialistMenuIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnSpecialistMenuIcon,"SpecialistMenuIcon");
				    return this;
			}
public AddServicePage clickAutoFillIcon_14(WebDriver driver)  {
					BrowserActions.click(driver, btnAutoFillIcon_14,"AutoFillIcon_14");
				    return this;
			}
public AddServicePage clickAdjudicator_8(WebDriver driver)  {
					BrowserActions.click(driver, btnAdjudicator_8,"Adjudicator_8");
				    return this;
			}
public AddServicePage enterCity(WebDriver driver,String City) {
		            BrowserActions.type(driver, inpCity,City, "City");
			        return this;
           }
public AddServicePage selectJurisdiction(WebDriver driver,String Jurisdiction)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpJurisdiction,Jurisdiction,"Jurisdiction");
				    return this;
			}
public AddServicePage enterRequestedQuoteCompletionDate(WebDriver driver,String RequestedQuoteCompletionDate) {
		            BrowserActions.type(driver, inpRequestedQuoteCompletionDate,RequestedQuoteCompletionDate, "RequestedQuoteCompletionDate");
			        return this;
           }
public AddServicePage clickMedicalCareOrganization(WebDriver driver)  {
					BrowserActions.click(driver, btnMedicalCareOrganization,"MedicalCareOrganization");
				    return this;
			}
public AddServicePage enterCounty(WebDriver driver,String County) {
		            BrowserActions.type(driver, inpCounty,County, "County");
			        return this;
           }
public AddServicePage clickAttorney_9(WebDriver driver)  {
					BrowserActions.click(driver, btnAttorney_9,"Attorney_9");
				    return this;
			}
public AddServicePage clickIncompatibleServicesAlertText(WebDriver driver)  {
					BrowserActions.click(driver, btnIncompatibleServicesAlertText,"IncompatibleServicesAlertText");
				    return this;
			}
public AddServicePage clickSearch(WebDriver driver)  {
					BrowserActions.click(driver, btnSearch,"Search");
				    return this;
			}
public AddServicePage clickAttorney(WebDriver driver)  {
					BrowserActions.click(driver, btnAttorney,"Attorney");
				    return this;
			}
public AddServicePage enterLocationCode(WebDriver driver,String LocationCode) {
		            BrowserActions.type(driver, inpLocationCode,LocationCode, "LocationCode");
			        return this;
           }
public AddServicePage clickSave(WebDriver driver)  {
					BrowserActions.click(driver, btnSave,"Save");
				    return this;
			}
public AddServicePage clickAdjudicator(WebDriver driver)  {
					BrowserActions.click(driver, btnAdjudicator,"Adjudicator");
				    return this;
			}
public AddServicePage clickAutoTowingAgency(WebDriver driver)  {
					BrowserActions.click(driver, btnAutoTowingAgency,"AutoTowingAgency");
				    return this;
			}
public AddServicePage enterLocation(WebDriver driver,String Location) {
		            BrowserActions.type(driver, inpLocation,Location, "Location");
			        return this;
           }
public AddServicePage clickNewPerson(WebDriver driver)  {
					BrowserActions.click(driver, btnNewPerson,"NewPerson");
				    return this;
			}
public AddServicePage clickAutobodyRepairShop_2(WebDriver driver)  {
					BrowserActions.click(driver, btnAutobodyRepairShop_2,"AutobodyRepairShop_2");
				    return this;
			}
public AddServicePage enterServiceAddressName(WebDriver driver,String ServiceAddressName) {
		            BrowserActions.type(driver, inpServiceAddressName,ServiceAddressName, "ServiceAddressName");
			        return this;
           }
public AddServicePage clickViewContactDetails_12(WebDriver driver)  {
					BrowserActions.click(driver, btnViewContactDetails_12,"ViewContactDetails_12");
				    return this;
			}
public AddServicePage clickSearch_11(WebDriver driver)  {
					BrowserActions.click(driver, btnSearch_11,"Search_11");
				    return this;
			}
public AddServicePage enterPhone(WebDriver driver,String Phone) {
		            BrowserActions.type(driver, inpPhone,Phone, "Phone");
			        return this;
           }
public AddServicePage enterAdditionalInstructions(WebDriver driver,String AdditionalInstructions) {
		            BrowserActions.type(driver, inpAdditionalInstructions,AdditionalInstructions, "AdditionalInstructions");
			        return this;
           }
public AddServicePage clickEdit(WebDriver driver)  {
					BrowserActions.click(driver, btnEdit,"Edit");
				    return this;
			}
public AddServicePage clickIncompatibleServicesAlert(WebDriver driver)  {
					BrowserActions.click(driver, btnIncompatibleServicesAlert,"IncompatibleServicesAlert");
				    return this;
			}
public AddServicePage clickAutobodyRepairShop(WebDriver driver)  {
					BrowserActions.click(driver, btnAutobodyRepairShop,"AutobodyRepairShop");
				    return this;
			}
public AddServicePage enterRequestedServiceCompletionDate(WebDriver driver,String RequestedServiceCompletionDate) {
		            BrowserActions.type(driver, inpRequestedServiceCompletionDate,RequestedServiceCompletionDate, "RequestedServiceCompletionDate");
			        return this;
           }
public AddServicePage enterAddress3(WebDriver driver,String Address3) {
		            BrowserActions.type(driver, inpAddress3,Address3, "Address3");
			        return this;
           }
public AddServicePage enterLocationDescription(WebDriver driver,String LocationDescription) {
		            BrowserActions.type(driver, inpLocationDescription,LocationDescription, "LocationDescription");
			        return this;
           }
public AddServicePage clickNewVendor_1(WebDriver driver)  {
					BrowserActions.click(driver, btnNewVendor_1,"NewVendor_1");
				    return this;
			}
public AddServicePage enterAddress1(WebDriver driver,String Address1) {
		            BrowserActions.type(driver, inpAddress1,Address1, "Address1");
			        return this;
           }
public AddServicePage selectAddressType(WebDriver driver,String AddressType)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpAddressType,AddressType,"AddressType");
				    return this;
			}
public AddServicePage enterAddress2(WebDriver driver,String Address2) {
		            BrowserActions.type(driver, inpAddress2,Address2, "Address2");
			        return this;
           }
public AddServicePage selectRequestType(WebDriver driver,String RequestType)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpRequestType,RequestType,2,"RequestType");
				    return this;
			}
public AddServicePage clickLawFirm_10(WebDriver driver)  {
					BrowserActions.click(driver, btnLawFirm_10,"LawFirm_10");
				    return this;
			}
public AddServicePage clickCustomerContactMenuIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnCustomerContactMenuIcon,"CustomerContactMenuIcon");
				    return this;
			}
public AddServicePage clickVendorPerson(WebDriver driver)  {
					BrowserActions.click(driver, btnVendorPerson,"VendorPerson");
				    return this;
			}
public AddServicePage enterZIPCode(WebDriver driver,String ZIPCode) {
		            BrowserActions.type(driver, inpZIPCode,ZIPCode, "ZIPCode");
			        return this;
           }
public AddServicePage clickRemove(WebDriver driver)  {
					BrowserActions.click(driver, btnRemove,"Remove");
				    return this;
			}
public AddServicePage clickAutoFillIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnAutoFillIcon,"AutoFillIcon");
				    return this;
			}
public AddServicePage selectCustomerContact(WebDriver driver,String CustomerContact)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpCustomerContact,CustomerContact,"CustomerContact");
				    return this;
			}
public AddServicePage enterValiduntil(WebDriver driver,String Validuntil) {
		            BrowserActions.type(driver, inpValiduntil,Validuntil, "Validuntil");
			        return this;
           }
public AddServicePage selectRelatedTo(WebDriver driver,String RelatedTo)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpRelatedTo,RelatedTo,"RelatedTo");
				    return this;
			}
public AddServicePage clickAutoTowingAgency_3(WebDriver driver)  {
					BrowserActions.click(driver, btnAutoTowingAgency_3,"AutoTowingAgency_3");
				    return this;
			}
public AddServicePage clickNewCompany(WebDriver driver)  {
					BrowserActions.click(driver, btnNewCompany,"NewCompany");
				    return this;
			}
public AddServicePage enterName(WebDriver driver,String Name) {
		            BrowserActions.type(driver, inpName,Name, "Name");
			        return this;
           }
public AddServicePage enterRelatedTo(WebDriver driver,String RelatedTo) {
		            BrowserActions.type(driver, inpRelatedTo,RelatedTo, "RelatedTo");
			        return this;
           }
public AddServicePage moveToNewVendor(WebDriver driver)  {
					BrowserActions.moveToElement(driver, btnNewVendor,"NewVendor");
				    return this;
			}
public AddServicePage clickDoctor(WebDriver driver)  {
					BrowserActions.click(driver, btnDoctor,"Doctor");
				    return this;
			}
public AddServicePage clickVendorCompany(WebDriver driver)  {
					BrowserActions.click(driver, btnVendorCompany,"VendorCompany");
				    return this;
			}
public AddServicePage clickNewLegal_7(WebDriver driver)  {
					BrowserActions.click(driver, btnNewLegal_7,"NewLegal_7");
				    return this;
			}
public AddServicePage selectCountry(WebDriver driver,String Country)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpCountry,Country,"Country");
				    return this;
			}
public AddServicePage clickLawFirm(WebDriver driver)  {
					BrowserActions.click(driver, btnLawFirm,"LawFirm");
				    return this;
			}
public AddServicePage selectServiceAddress(WebDriver driver)  {
					BrowserActions.selectDropDownByIndex(driver, drpServiceAddress,1,1,"ServiceAddress");
				    return this;
			}
public AddServicePage clickValiduntilDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnValiduntilDateIcon,"ValiduntilDateIcon");
				    return this;
			}
public AddServicePage selectState(WebDriver driver,String State)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpState,State,"State");
				    return this;
			}
public AddServicePage clickNewLegal(WebDriver driver)  {
					BrowserActions.click(driver, btnNewLegal,"NewLegal");
				    return this;
			}
public AddServicePage clickRequestedQuoteCompletionDateDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnRequestedQuoteCompletionDateDateIcon,"RequestedQuoteCompletionDateDateIcon");
				    return this;
			}
public AddServicePage clickCancel(WebDriver driver)  {
					BrowserActions.click(driver, btnCancel,"Cancel");
				    return this;
			}
public AddServicePage clickAdd(WebDriver driver)  {
					BrowserActions.click(driver, btnAdd,0.5,"Add");
				    return this;
			}
public AddServicePage clickDoctor_4(WebDriver driver)  {
					BrowserActions.click(driver, btnDoctor_4,"Doctor_4");
				    return this;
			}
public AddServicePage clickLegalVenue(WebDriver driver)  {
					BrowserActions.click(driver, btnLegalVenue,"LegalVenue");
				    return this;
			}
public AddServicePage selectCommunicationMethod(WebDriver driver,String CommunicationMethod)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpCommunicationMethod,CommunicationMethod,"CommunicationMethod");
				    return this;
			}
public AddServicePage clickSubmit(WebDriver driver)  {
					BrowserActions.click(driver, btnSubmit,"Submit");
				    return this;
			}
public AddServicePage clickMedicalCareOrganization_5(WebDriver driver)  {
					BrowserActions.click(driver, btnMedicalCareOrganization_5,"MedicalCareOrganization_5");
				    return this;
			}
public AddServicePage enterServiceAddress(WebDriver driver,String ServiceAddress) {
		            BrowserActions.type(driver, inpServiceAddress,ServiceAddress, "ServiceAddress");
			        return this;
           }
}
