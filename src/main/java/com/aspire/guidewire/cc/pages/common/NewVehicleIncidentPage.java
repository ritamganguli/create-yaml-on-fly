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

public class NewVehicleIncidentPage extends LoadableComponent<NewVehicleIncidentPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
 	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
//	public TopNavBar topnavbar;
	@IFindBy(how = How.CSS, using = "select[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-Driver_LicenseState']", AI = false)
	private WebElement drpDriversLicenseState;

	@IFindBy(how = How.CSS, using = "select[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-Assessor_Picker']", AI = false)
	private WebElement drpInitialAssessor;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-Theft_AffdvCmplBy-Theft_AffdvCmplByMenuIcon>div[role='button']", AI = false)
	private WebElement btnTheft_AffdvCmplByMenuIcon;

	@IFindBy(how = How.CSS, using = "input[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-RentalServiceInputSet-RentalServiceInputSet-RentalInputGroup-_checkbox']", AI = false)
	private WebElement chkRentalNoCoverage;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-RentalServiceInputSet-RentalServiceInputSet-RentalInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-CustomerContact-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewCompany>div[role='menuitem']", AI = false)
	private WebElement btnNewCompany_38;

	@IFindBy(how = How.CSS, using = "input[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-Vehicle_Make']", AI = false)
	private WebElement inpMake;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-Driver_Picker-MenuItem_ViewDetails>div[role='menuitem']", AI = false)
	private WebElement btnViewContactDetails;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-RentalServiceInputSet-RentalServiceInputSet-RentalInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-CustomerContact-CustomerContactMenuIcon>div[role='button']", AI = false)
	private WebElement btnCustomerContactMenuIcon_30;

	@IFindBy(how = How.CSS, using = "input[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-RentalServiceInputSet-RentalServiceInputSet-RentalInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressLine3']", AI = false)
	private WebElement inpAddress3_52;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-RecovAgcy_Picker-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor>div[role='menuitem']", AI = false)
	private WebElement btnNewVendor_83;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-RecoveryAddress-CCAddressInputSet-globalAddressContainer-Address_ValidUntil_dateIcon", AI = false)
	private WebElement btnValiduntilDateIcon_110;

	@IFindBy(how = How.CSS, using = "input[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-RentalServiceInputSet-RentalServiceInputSet-RentalInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-Claim_LocationCode']", AI = false)
	private WebElement inpLocationCode_63;

	@IFindBy(how = How.CSS, using = "input[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehIncidentAssessDV-General_Description']", AI = false)
	private WebElement inpDescription_113;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-RentalServiceInputSet-RentalServiceInputSet-RentalInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-CustomerContact-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Attorney>div[role='menuitem']", AI = false)
	private WebElement btnAttorney_41;

	@IFindBy(how = How.CSS, using = "select[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-Owner_Picker']", AI = false)
	private WebElement drpOwner;

	@IFindBy(how = How.CSS, using = "input[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-RentalServiceInputSet-RentalServiceInputSet-RentalInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressSummary']", AI = false)
	private WebElement inpAddressSummary_48;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-RecovAgcy_Picker-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoRepairShop>div[role='menuitem']", AI = false)
	private WebElement btnAutobodyRepairShop_84;

	@IFindBy(how = How.CSS, using = "input[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehIncidentAssessDV-General_Comment']", AI = false)
	private WebElement inpComment;

	@IFindBy(how = How.CSS, using = "select[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-RecoveryAddress-CCAddressInputSet-globalAddressContainer-Address_AddressType']", AI = false)
	private WebElement drpAddressType_107;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-RentalServiceInputSet-RentalServiceInputSet-RentalInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-CustomerContact-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Adjudicator>div[role='menuitem']", AI = false)
	private WebElement btnAdjudicator_40;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-Driver_Picker-Driver_PickerMenuIcon>div[role='button']", AI = false)
	private WebElement btnDriver_PickerMenuIcon;

	@IFindBy(how = How.CSS, using = "input[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-RentalServiceInputSet-RentalServiceInputSet-RentalInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-Address_Description']", AI = false)
	private WebElement inpLocationDescription_60;

	@IFindBy(how = How.CSS, using = "input[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-Vehicle_Model']", AI = false)
	private WebElement inpModel;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehIncidentAssessDV-InternalUser_Name-InternalUser_NameUserSearchMenuItem>div[role='menuitem']", AI = false)
	private WebElement btnSearchforaUser;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-Incident_AssessmentTab", AI = false)
	private WebElement btnAssessment;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-RecovAgcy_Picker-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal>div[role='menuitem']", AI = false)
	private WebElement btnNewLegal_90;

	@IFindBy(how = How.CSS, using = "input[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-RecoveryAddress-CCAddressInputSet-globalAddressContainer-Address_Description']", AI = false)
	private WebElement inpLocationDescription_108;

	@IFindBy(how = How.CSS, using = "select[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-RentalServiceInputSet-RentalServiceInputSet-RentalInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-Address_AddressType']", AI = false)
	private WebElement drpAddressType_59;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-CustomerContact-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor>div[role='menuitem']", AI = false)
	private WebElement btnNewVendor_9;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-Contacts-EditableIncidentContactsLV_tb-Remove>div[role='button']", AI = false)
	private WebElement btnRemove_5;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-Owner_Picker-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Adjudicator>div[role='menuitem']", AI = false)
	private WebElement btnAdjudicator;

	@IFindBy(how = How.CSS, using = "input[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-RentalServiceInputSet-RentalServiceInputSet-RentalInputGroup-RentalEndDate']", AI = false)
	private WebElement inpRentalEndDate;

	@IFindBy(how = How.CSS, using = "select[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-RelationToInsured']", AI = false)
	private WebElement drpRelationtoOwner;

	@IFindBy(how = How.CSS, using = "input[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-Collision_Indicator']", AI = false)
	private WebElement rdbWasthereacollision;

	@IFindBy(how = How.CSS, using = "select[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehIncidentAssessDV-InternalUser_Name']", AI = false)
	private WebElement drpInternalUser;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-Theft_AffdvCmplBy-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoRepairShop>div[role='menuitem']", AI = false)
	private WebElement btnAutobodyRepairShop_69;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-RecovAgcy_Picker-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_MedicalCareOrg>div[role='menuitem']", AI = false)
	private WebElement btnMedicalCareOrganization_87;

	@IFindBy(how = How.CSS, using = "input[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-ServiceRequestSubmitMessage']", AI = false)
	private WebElement inpServiceRequestSubmitMessage;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-Theft_AffdvCmplBy-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_CompanyVendor>div[role='menuitem']", AI = false)
	private WebElement btnVendorCompany_73;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-RecovAgcy_Picker-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoTowingAgcy>div[role='menuitem']", AI = false)
	private WebElement btnAutoTowingAgency_85;

	@IFindBy(how = How.CSS, using = "input[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-Theft_OdomRead']", AI = false)
	private WebElement inpOdometerReading;

	@IFindBy(how = How.CSS, using = "input[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-RequestedServiceCompletionDate']", AI = false)
	private WebElement inpRequestedServiceCompletionDate;

	@IFindBy(how = How.CSS, using = "select[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-Address_AddressType']", AI = false)
	private WebElement drpAddressType;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-CustomerContact-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Adjudicator>div[role='menuitem']", AI = false)
	private WebElement btnAdjudicator_17;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-OtherServicesLVInputGroupInputSet-OtherServicesInputGroup-OtherServicesLVInputSet-OtherServicesLV_tb-Remove>div[role='button']", AI = false)
	private WebElement btnRemove_66;

	@IFindBy(how = How.CSS, using = "input[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-Vehicle_LicensePlate']", AI = false)
	private WebElement inpLicensePlate;

	@IFindBy(how = How.CSS, using = "select[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-Address_Picker']", AI = false)
	private WebElement drpLocation;

	@IFindBy(how = How.CSS, using = "input[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-PostalCode']", AI = false)
	private WebElement inpZIPCode;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-RentalServiceInputSet-RentalServiceInputSet-RentalInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-CustomerContact-MenuItem_ViewDetails>div[role='menuitem']", AI = false)
	private WebElement btnViewContactDetails_45;

	@IFindBy(how = How.CSS, using = "input[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-RecoveryAddress-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-City']", AI = false)
	private WebElement inpCity_101;

	@IFindBy(how = How.CSS, using = "select[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-CustomerContact']", AI = false)
	private WebElement drpCustomerContact;

	@IFindBy(how = How.CSS, using = "input[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-Address_ValidUntil']", AI = false)
	private WebElement inpValiduntil;

	@IFindBy(how = How.CSS, using = "input[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-RentalServiceInputSet-RentalServiceInputSet-RentalInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-County']", AI = false)
	private WebElement inpCounty_55;

	@IFindBy(how = How.CSS, using = "select[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-CollisionPoint']", AI = false)
	private WebElement drpPointofFirstImpact;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-RecovAgcy_Picker-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_CompanyVendor>div[role='menuitem']", AI = false)
	private WebElement btnVendorCompany_88;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-Theft_AffdvCmplBy-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoTowingAgcy>div[role='menuitem']", AI = false)
	private WebElement btnAutoTowingAgency_70;

	@IFindBy(how = How.CSS, using = "input[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-TotalLoss']", AI = false)
	private WebElement rdbTotalLoss;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-RentalServiceInputSet-RentalServiceInputSet-RentalInputGroup-RentalAgency-MenuItem_ViewDetails>div[role='menuitem']", AI = false)
	private WebElement btnViewContactDetails_27;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehIncidentAssessDV-VehAssessItemLV_tb-Remove>div[role='button']", AI = false)
	private WebElement btnRemove_117;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-Theft_AffdvCmplBy-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_MedicalCareOrg>div[role='menuitem']", AI = false)
	private WebElement btnMedicalCareOrganization_72;

	@IFindBy(how = How.CSS, using = "select[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-Country']", AI = false)
	private WebElement drpCountry;

	@IFindBy(how = How.CSS, using = "input[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-RecoveryAddress-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressLine2']", AI = false)
	private WebElement inpAddress2_99;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehIncidentAssessDV-VehAssessSourceLV_tb-Remove>div[role='button']", AI = false)
	private WebElement btnRemove_115;

	@IFindBy(how = How.CSS, using = "select[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-State']", AI = false)
	private WebElement drpState;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-Owner_Picker-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal>div[role='menuitem']", AI = false)
	private WebElement btnNewLegal;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-RecovAgcy_Picker-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_Doctor>div[role='menuitem']", AI = false)
	private WebElement btnDoctor_86;

	@IFindBy(how = How.CSS, using = "input[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-LoanInformationInputSet-LoanInformation_Loan']", AI = false)
	private WebElement rdbLoanonVehicle;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-RecoveryDate_dateIcon", AI = false)
	private WebElement btnRecoveryDateDateIcon;

	@IFindBy(how = How.CSS, using = "input[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-RecoveryAddress-CCAddressInputSet-globalAddressContainer-Address_ValidUntil']", AI = false)
	private WebElement inpValiduntil_109;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-Theft_AffdvCmplBy-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Attorney>div[role='menuitem']", AI = false)
	private WebElement btnAttorney_77;

	@IFindBy(how = How.CSS, using = "select[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressPicker']", AI = false)
	private WebElement drpAppraisalLocation;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-Theft_AffdvCmplBy-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Adjudicator>div[role='menuitem']", AI = false)
	private WebElement btnAdjudicator_76;

	@IFindBy(how = How.CSS, using = "select[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-Theft_AffdvCmplBy']", AI = false)
	private WebElement drpByWhom;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehIncidentAssessDV-VehAssessItemLV_tb-Approve>div[role='button']", AI = false)
	private WebElement btnApprove;

	@IFindBy(how = How.CSS, using = "select[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-Driver_Picker']", AI = false)
	private WebElement drpDriverName;

	@IFindBy(how = How.CSS, using = "select[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-RecoveryAddress-CCAddressInputSet-globalAddressContainer-Claim_JurisdictionState']", AI = false)
	private WebElement drpJurisdiction_112;

	@IFindBy(how = How.CSS, using = "select[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-RecoveryCondition']", AI = false)
	private WebElement drpRecoveryCondition;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-CustomerContact-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_CompanyVendor>div[role='menuitem']", AI = false)
	private WebElement btnVendorCompany_14;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-Theft_AffdvCmplBy-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewCompany>div[role='menuitem']", AI = false)
	private WebElement btnNewCompany_74;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-RecoveryAddress-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-PostalCode-AutoFillIcon", AI = false)
	private WebElement btnAutoFillIcon_106;

	@IFindBy(how = How.CSS, using = "select[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-LossParty']", AI = false)
	private WebElement drpLossParty;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-RentalServiceInputSet-RentalServiceInputSet-RentalInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-City-AutoFillIcon", AI = false)
	private WebElement btnAutoFillIcon_54;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-RecoveryAddress-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-City-AutoFillIcon", AI = false)
	private WebElement btnAutoFillIcon_102;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-Assessor_Picker-MenuItem_ViewDetails>div[role='menuitem']", AI = false)
	private WebElement btnViewContactDetails_7;

	@IFindBy(how = How.CSS, using = "select[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-Driver_IsKidInPolicy']", AI = false)
	private WebElement drpIsthedriverlistedinpolicy;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-CustomerContact-MenuItem_ViewDetails>div[role='menuitem']", AI = false)
	private WebElement btnViewContactDetails_22;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-RentalServiceInputSet-RentalServiceInputSet-RentalInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-PostalCode-AutoFillIcon", AI = false)
	private WebElement btnAutoFillIcon_58;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-Owner_Picker-MenuItem_ViewDetails>div[role='menuitem']", AI = false)
	private WebElement btnViewContactDetails_3;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-Assessor_Picker-ClaimNewVendorOnlyPickerMenuItemSet-NewContactPickerMenuItemSet_CompanyVendor>div[role='menuitem']", AI = false)
	private WebElement btnNewVendorCompany;

	@IFindBy(how = How.CSS, using = "input[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-RentalServiceInputSet-RentalServiceInputSet-RentalInputGroup-RentalBeginDate']", AI = false)
	private WebElement inpRentalBeginDate;

	@IFindBy(how = How.CSS, using = "select[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-Vehicle_State']", AI = false)
	private WebElement drpLicenseState;

	@IFindBy(how = How.CSS, using = "input[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-RequestedQuoteCompletionDate']", AI = false)
	private WebElement inpRequestedQuoteCompletionDate;

	@IFindBy(how = How.CSS, using = "select[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-LossOccured']", AI = false)
	private WebElement drpLossOccurred;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-Update>div[role='button']", AI = false)
	private WebElement btnOK;

	@IFindBy(how = How.CSS, using = "input[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-PhantomVehicle']", AI = false)
	private WebElement rdbIsthehitandrundriverunknown;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehIncidentAssessDV-InternalUser_Name-InternalUser_NameMenuIcon>div[role='button']", AI = false)
	private WebElement btnInternalUser_NameMenuIcon;

	@IFindBy(how = How.CSS, using = "input[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-RecoveryDate']", AI = false)
	private WebElement inpRecoveryDate;

	@IFindBy(how = How.CSS, using = "input[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressLine1']", AI = false)
	private WebElement inpAddressLine1;

	@IFindBy(how = How.CSS, using = "input[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-Exposure_EquipmentFailure']", AI = false)
	private WebElement rdbEquipmentFailure;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-RentalServiceInputSet-RentalServiceInputSet-RentalInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-Address_ValidUntil_dateIcon", AI = false)
	private WebElement btnValiduntilDateIcon_62;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-Owner_Picker-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoTowingAgcy>div[role='menuitem']", AI = false)
	private WebElement btnAutoTowingAgency;

	@IFindBy(how = How.CSS, using = "input[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehIncidentAssessDV-Display_Name']", AI = false)
	private WebElement inpInvolving;

	@IFindBy(how = How.CSS, using = "select[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-RentalServiceInputSet-RentalServiceInputSet-RentalInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-State']", AI = false)
	private WebElement drpState_56;

	@IFindBy(how = How.CSS, using = "input[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-RecoveryAddress-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressSummary']", AI = false)
	private WebElement inpLocation;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-CustomerContact-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Attorney>div[role='menuitem']", AI = false)
	private WebElement btnAttorney_18;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-RecovAgcy_Picker-MenuItem_Search>div[role='menuitem']", AI = false)
	private WebElement btnSearch_95;

	@IFindBy(how = How.CSS, using = "select[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-RentalServiceInputSet-RentalServiceInputSet-RentalInputGroup-RentalAgency']", AI = false)
	private WebElement drpRentalAgency;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-InstructionText textarea", AI = false)
	private WebElement inpAdditionalInstructions;

	@IFindBy(how = How.CSS, using = "input[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-Vehicle_Year']", AI = false)
	private WebElement inpYear;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-Edit>div[role='button']", AI = false)
	private WebElement btnEdit;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-CustomerContact-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewPerson>div[role='menuitem']", AI = false)
	private WebElement btnNewPerson_8;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehIncidentAssessDV-VehAssessItemLV_tb-Deny>div[role='button']", AI = false)
	private WebElement btnDeny;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-RentalServiceInputSet-RentalServiceInputSet-RentalInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-CustomerContact-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_CompanyVendor>div[role='menuitem']", AI = false)
	private WebElement btnVendorCompany_37;

	@IFindBy(how = How.CSS, using = "select[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-Exposure_TrafficViolation']", AI = false)
	private WebElement drpTrafficViolation;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-RecovAgcy_Picker-RecovAgcy_PickerMenuIcon>div[role='button']", AI = false)
	private WebElement btnRecovAgcy_PickerMenuIcon;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-Assessor_Picker-MenuItem_Search>div[role='menuitem']", AI = false)
	private WebElement btnSearch_6;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-Driver_Citations-DriverCitationsLV_tb-Remove>div[role='button']", AI = false)
	private WebElement btnRemove;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-Owner_Picker-MenuItem_Search>div[role='menuitem']", AI = false)
	private WebElement btnSearch_2;

	@IFindBy(how = How.CSS, using = "input[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-RentalServiceInputSet-RentalServiceInputSet-RentalInputGroup-ReservationNumber']", AI = false)
	private WebElement inpReservation;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-RecovAgcy_Picker-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_LawFirm>div[role='menuitem']", AI = false)
	private WebElement btnLawFirm_93;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-Owner_Picker-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewPerson>div[role='menuitem']", AI = false)
	private WebElement btnNewPerson_1;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-RentalServiceInputSet-RentalServiceInputSet-RentalInputGroup-RentalBeginDate_dateIcon", AI = false)
	private WebElement btnRentalBeginDateDateIcon;

	@IFindBy(how = How.CSS, using = "select[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-RentalServiceInputSet-RentalServiceInputSet-RentalInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressPicker']", AI = false)
	private WebElement drpPickupLocation;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-Contacts-EditableIncidentContactsLV_tb-Add>div[role='button']", AI = false)
	private WebElement btnAdd_4;

	@IFindBy(how = How.CSS, using = "input[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-RentalServiceInputSet-RentalServiceInputSet-RentalInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressLine1']", AI = false)
	private WebElement inpAddressLine1_50;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-RecovAgcy_Picker-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewCompany>div[role='menuitem']", AI = false)
	private WebElement btnNewCompany_89;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-Address_ValidUntil_dateIcon", AI = false)
	private WebElement btnValiduntilDateIcon;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-RequestedQuoteCompletionDate_dateIcon", AI = false)
	private WebElement btnRequestedQuoteCompletionDateDateIcon;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-Cancel>div[role='button']", AI = false)
	private WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "input[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-RecoveryAddress-CCAddressInputSet-globalAddressContainer-Claim_LocationCode']", AI = false)
	private WebElement inpLocationCode_111;

	@IFindBy(how = How.CSS, using = "select[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-Vehicle_OffRoadStyle']", AI = false)
	private WebElement drpOffRoadType;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-CustomerContact-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_NewLegalVenue>div[role='menuitem']", AI = false)
	private WebElement btnLegalVenue_20;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-PostalCode-AutoFillIcon", AI = false)
	private WebElement btnAutoFillIcon_23;

	@IFindBy(how = How.CSS, using = "input[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-Driver_License']", AI = false)
	private WebElement inpDriversLicenseNumber;

	@IFindBy(how = How.CSS, using = "input[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-Exposure_AirbagsDeployed']", AI = false)
	private WebElement rdbAirbagsDeployed;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-CustomerContact-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_Doctor>div[role='menuitem']", AI = false)
	private WebElement btnDoctor_12;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-RequestedServiceCompletionDate_dateIcon", AI = false)
	private WebElement btnRequestedServiceCompletionDateDateIcon;

	@IFindBy(how = How.CSS, using = "input[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-OtherServicesLVInputGroupInputSet-OtherServicesInputGroup-_checkbox']", AI = false)
	private WebElement chkOtherServices;

	@IFindBy(how = How.CSS, using = "input[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-LoanInformationInputSet-MonthsRemaining']", AI = false)
	private WebElement inpMonthsRemaining;

	@IFindBy(how = How.CSS, using = "input[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-RentalServiceInputSet-RentalServiceInputSet-RentalInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressName']", AI = false)
	private WebElement inpServiceAddressName_46;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-Theft_AffdvCmplBy-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_LawFirm>div[role='menuitem']", AI = false)
	private WebElement btnLawFirm_78;

	@IFindBy(how = How.CSS, using = "select[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-RecoveryState']", AI = false)
	private WebElement drpStateofRecovery;

	@IFindBy(how = How.CSS, using = "select[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-Claim_JurisdictionState']", AI = false)
	private WebElement drpJurisdiction;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-CustomerContact-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal>div[role='menuitem']", AI = false)
	private WebElement btnNewLegal_16;

	@IFindBy(how = How.CSS, using = "input[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-County']", AI = false)
	private WebElement inpCounty;

	@IFindBy(how = How.CSS, using = "input[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-_checkbox']", AI = false)
	private WebElement chkAppraisal;

	@IFindBy(how = How.CSS, using = "input[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-RecoveryAddress-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-PostalCode']", AI = false)
	private WebElement inpZIPCode_105;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehIncidentAssessDV-TargetCloseDate_dateIcon", AI = false)
	private WebElement btnTargetCloseDateDateIcon;

	@IFindBy(how = How.CSS, using = "input[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-Claim_LocationCode']", AI = false)
	private WebElement inpLocationCode;

	@IFindBy(how = How.CSS, using = "input[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-HitAndRun']", AI = false)
	private WebElement rdbHitandrun;

	@IFindBy(how = How.CSS, using = "input[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-OwnersPermission']", AI = false)
	private WebElement rdbOwnersPermission;

	@IFindBy(how = How.CSS, using = "input[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-RentalServiceInputSet-RentalServiceInputSet-RentalInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-PostalCode']", AI = false)
	private WebElement inpZIPCode_57;

	@IFindBy(how = How.CSS, using = "select[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-RecoveryAddress-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-Country']", AI = false)
	private WebElement drpCountry_98;

	@IFindBy(how = How.CSS, using = "select[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-Vehicle_VehicleType']", AI = false)
	private WebElement drpVehicleType;

	@IFindBy(how = How.CSS, using = "input[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-Speed']", AI = false)
	private WebElement inpSpeed;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-Theft_AffdvCmplBy-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewPerson>div[role='menuitem']", AI = false)
	private WebElement btnNewPerson_67;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-Driver_Picker-ClaimNewPersonOnlyPickerMenuItemSet-ClaimNewPersonOnlyPickerMenuItemSet_NewPersonMenuItem>div[role='menuitem']", AI = false)
	private WebElement btnNewPerson;

	@IFindBy(how = How.CSS, using = "input[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-RentalServiceInputSet-RentalServiceInputSet-RentalInputGroup-OtherServiceRequestInfo-RentalAgencyAddress']", AI = false)
	private WebElement inpRentalAgencyLocation;

	@IFindBy(how = How.CSS, using = "input[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-Theft_VehLockInd']", AI = false)
	private WebElement rdbVehicleLocked;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-CustomerContact-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoRepairShop>div[role='menuitem']", AI = false)
	private WebElement btnAutobodyRepairShop_10;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-RentalServiceInputSet-RentalServiceInputSet-RentalInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-CustomerContact-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_NewLegalVenue>div[role='menuitem']", AI = false)
	private WebElement btnLegalVenue_43;

	@IFindBy(how = How.CSS, using = "select[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-RentalServiceInputSet-RentalServiceInputSet-RentalInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-Address_Picker']", AI = false)
	private WebElement drpLocation_47;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-Owner_Picker-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoRepairShop>div[role='menuitem']", AI = false)
	private WebElement btnAutobodyRepairShop;

	@IFindBy(how = How.CSS, using = "input[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressLine3']", AI = false)
	private WebElement inpAddress3;

	@IFindBy(how = How.CSS, using = "input[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-Address_Description']", AI = false)
	private WebElement inpLocationDescription;

	@IFindBy(how = How.CSS, using = "input[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-RecoveryAddress-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressLine1']", AI = false)
	private WebElement inpAddress1;

	@IFindBy(how = How.CSS, using = "input[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressLine2']", AI = false)
	private WebElement inpAddress2;

	@IFindBy(how = How.CSS, using = "select[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-Vehicle_Style']", AI = false)
	private WebElement drpStyle;

	@IFindBy(how = How.CSS, using = "input[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-VehicleParked']", AI = false)
	private WebElement rdbWasthevehicleparked;

	@IFindBy(how = How.CSS, using = "input[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-RecoveryAddress-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressLine3']", AI = false)
	private WebElement inpAddress3_100;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-Theft_AffdvCmplBy-MenuItem_Search>div[role='menuitem']", AI = false)
	private WebElement btnSearch_80;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-City-AutoFillIcon", AI = false)
	private WebElement btnAutoFillIcon;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-OtherServicesLVInputGroupInputSet-OtherServicesInputGroup-OtherServicesLVInputSet-OtherServicesLV_tb-AddServiceRequest>div[role='button']", AI = false)
	private WebElement btnAdd_65;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-RecovAgcy_Picker-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Adjudicator>div[role='menuitem']", AI = false)
	private WebElement btnAdjudicator_91;

	@IFindBy(how = How.CSS, using = "input[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-Vehicle_VIN']", AI = false)
	private WebElement inpVIN;

	@IFindBy(how = How.CSS, using = "input[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehIncidentAssessDV-TargetCloseDate']", AI = false)
	private WebElement inpTargetCloseDate;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-Owner_Picker-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor>div[role='menuitem']", AI = false)
	private WebElement btnNewVendor;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-Owner_Picker-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_CompanyVendor>div[role='menuitem']", AI = false)
	private WebElement btnVendorCompany;

	@IFindBy(how = How.CSS, using = "input[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-RentalServiceInputSet-RentalServiceInputSet-RentalInputGroup-RentalCoverage']", AI = false)
	private WebElement inpRentalCoverage;

	@IFindBy(how = How.CSS, using = "input[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-RecoveryAddress-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-County']", AI = false)
	private WebElement inpCounty_103;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehIncidentAssessDV-InternalUser_Name-InternalUser_NameUserSelectMenuItem>div[role='menuitem']", AI = false)
	private WebElement btnSelectUser;

	@IFindBy(how = How.CSS, using = "select[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-ReasonForUse']", AI = false)
	private WebElement drpReasonforUse;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-Owner_Picker-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_LawFirm>div[role='menuitem']", AI = false)
	private WebElement btnLawFirm;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-RentalServiceInputSet-RentalServiceInputSet-RentalInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-InstructionText textarea", AI = false)
	private WebElement inpAdditionalInstructions_28;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-RentalServiceInputSet-RentalServiceInputSet-RentalInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-CustomerContact-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor>div[role='menuitem']", AI = false)
	private WebElement btnNewVendor_32;

	@IFindBy(how = How.CSS, using = "input[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-Vehicle_Color']", AI = false)
	private WebElement inpColor;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-Driver_Citations-DriverCitationsLV_tb-Add>div[role='button']", AI = false)
	private WebElement btnAdd;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-RecovAgcy_Picker-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewPerson>div[role='menuitem']", AI = false)
	private WebElement btnNewPerson_82;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-Owner_Picker-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_NewLegalVenue>div[role='menuitem']", AI = false)
	private WebElement btnLegalVenue;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-RentalServiceInputSet-RentalServiceInputSet-RentalInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-CustomerContact-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_LawFirm>div[role='menuitem']", AI = false)
	private WebElement btnLawFirm_42;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-__crumb__", AI = false)
	private WebElement btnReturntoNewExposureVehicle;

	@IFindBy(how = How.CSS, using = "input[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-ServiceRequestSubmitMessageFNOL']", AI = false)
	private WebElement inpServiceRequestSubmitMessageFNOL;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-RentalServiceInputSet-RentalServiceInputSet-RentalInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-CustomerContact-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal>div[role='menuitem']", AI = false)
	private WebElement btnNewLegal_39;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-RecovAgcy_Picker-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Attorney>div[role='menuitem']", AI = false)
	private WebElement btnAttorney_92;

	@IFindBy(how = How.CSS, using = "input[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-Operable']", AI = false)
	private WebElement rdbOperable;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-RentalServiceInputSet-RentalServiceInputSet-RentalInputGroup-RentalAgency-RentalAgencyMenuIcon>div[role='button']", AI = false)
	private WebElement btnRentalAgencyMenuIcon;

	@IFindBy(how = How.CSS, using = "input[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-LossDesc']", AI = false)
	private WebElement inpDescription;

	@IFindBy(how = How.CSS, using = "select[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-Vehicle_Picker']", AI = false)
	private WebElement drpSelectvehicle;

	@IFindBy(how = How.CSS, using = "input[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-Vehicle_SerialNumber']", AI = false)
	private WebElement inpSerialNumber;

	@IFindBy(how = How.CSS, using = "input[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-RentalServiceInputSet-RentalServiceInputSet-RentalInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-City']", AI = false)
	private WebElement inpCity_53;

	@IFindBy(how = How.CSS, using = "select[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-RentalServiceInputSet-RentalServiceInputSet-RentalInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-Country']", AI = false)
	private WebElement drpCountry_49;

	@IFindBy(how = How.CSS, using = "input[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehIncidentAssessDV-CloseDate']", AI = false)
	private WebElement inpActualCloseDate;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-CustomerContact-MenuItem_Search>div[role='menuitem']", AI = false)
	private WebElement btnSearch_21;

	@IFindBy(how = How.CSS, using = "input[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-City']", AI = false)
	private WebElement inpCity;

	@IFindBy(how = How.CSS, using = "input[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-RentalServiceInputSet-RentalServiceInputSet-RentalInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-Address_ValidUntil']", AI = false)
	private WebElement inpValiduntil_61;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-Theft_AffdvCmplBy-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_NewLegalVenue>div[role='menuitem']", AI = false)
	private WebElement btnLegalVenue_79;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-RentalServiceInputSet-RentalServiceInputSet-RentalInputGroup-RentalAgency-MenuItem_Search>div[role='menuitem']", AI = false)
	private WebElement btnSearch_26;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-Owner_Picker-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_MedicalCareOrg>div[role='menuitem']", AI = false)
	private WebElement btnMedicalCareOrganization;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-Driver_Picker-MenuItem_Search>div[role='menuitem']", AI = false)
	private WebElement btnSearch;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-Owner_Picker-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Attorney>div[role='menuitem']", AI = false)
	private WebElement btnAttorney;

	@IFindBy(how = How.CSS, using = "select[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-RecovAgcy_Picker']", AI = false)
	private WebElement drpRecoveringAgency;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-CustomerContact-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoTowingAgcy>div[role='menuitem']", AI = false)
	private WebElement btnAutoTowingAgency_11;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-CustomerContact-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_LawFirm>div[role='menuitem']", AI = false)
	private WebElement btnLawFirm_19;

	@IFindBy(how = How.CSS, using = "input[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressSummary']", AI = false)
	private WebElement inpAddressSummary;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-CustomerContact-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_MedicalCareOrg>div[role='menuitem']", AI = false)
	private WebElement btnMedicalCareOrganization_13;

	@IFindBy(how = How.CSS, using = "select[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-RentalServiceInputSet-RentalServiceInputSet-RentalInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-CustomerContact']", AI = false)
	private WebElement drpCustomerContact_29;

	@IFindBy(how = How.CSS, using = "select[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-Vehicle_BoatType']", AI = false)
	private WebElement drpBoatType;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-RentalServiceInputSet-RentalServiceInputSet-RentalInputGroup-RentalAgency-ClaimNewVendorOnlyPickerMenuItemSet-NewContactPickerMenuItemSet_PersonVendor>div[role='menuitem']", AI = false)
	private WebElement btnNewVendorPerson_25;

	@IFindBy(how = How.CSS, using = "select[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-Theft_AffdvCmplInd']", AI = false)
	private WebElement drpTheftAffidavitCompleted;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-Theft_AffdvCmplBy-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_Doctor>div[role='menuitem']", AI = false)
	private WebElement btnDoctor_71;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-Vehicle_DetailsCardTab", AI = false)
	private WebElement btnDetails;

	@IFindBy(how = How.CSS, using = "input[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressName']", AI = false)
	private WebElement inpServiceAddressName;

	@IFindBy(how = How.CSS, using = "select[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-VehicleDirection']", AI = false)
	private WebElement drpDirectionofTravel;

	@IFindBy(how = How.CSS, using = "select[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-RecoveryAddress-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-State']", AI = false)
	private WebElement drpState_104;

	@IFindBy(how = How.CSS, using = "input[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-Theft_AntiThftInd']", AI = false)
	private WebElement rdbAntitheftDevice;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-RecovAgcy_Picker-MenuItem_ViewDetails>div[role='menuitem']", AI = false)
	private WebElement btnViewContactDetails_96;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-Driver_Address textarea", AI = false)
	private WebElement inpDriversAddress;

	@IFindBy(how = How.CSS, using = "input[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-RentalServiceInputSet-RentalServiceInputSet-RentalInputGroup-OtherServiceRequestInfo-RentalAgencyPhone']", AI = false)
	private WebElement inpRentalAgencyPhone;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-CustomerContact-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewCompany>div[role='menuitem']", AI = false)
	private WebElement btnNewCompany_15;

	@IFindBy(how = How.CSS, using = "input[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-Theft_Indicator']", AI = false)
	private WebElement rdbWasthevehiclestolen;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-RentalServiceInputSet-RentalServiceInputSet-RentalInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-CustomerContact-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_Doctor>div[role='menuitem']", AI = false)
	private WebElement btnDoctor_35;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-Theft_AffdvCmplBy-MenuItem_ViewDetails>div[role='menuitem']", AI = false)
	private WebElement btnViewContactDetails_81;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-RentalServiceInputSet-RentalServiceInputSet-RentalInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-CustomerContact-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewPerson>div[role='menuitem']", AI = false)
	private WebElement btnNewPerson_31;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-Description textarea", AI = false)
	private WebElement inpDamageDescription;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-RentalServiceInputSet-RentalServiceInputSet-RentalInputGroup-RentalEndDate_dateIcon", AI = false)
	private WebElement btnRentalEndDateDateIcon;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-Theft_AffdvCmplBy-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor>div[role='menuitem']", AI = false)
	private WebElement btnNewVendor_68;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-CustomerContact-CustomerContactMenuIcon>div[role='button']", AI = false)
	private WebElement btnCustomerContactMenuIcon;

	@IFindBy(how = How.CSS, using = "select[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-Driver_IsKidInPolicy_Percentagedriven']", AI = false)
	private WebElement drpOftimevehicleusedbytheminor;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-RecovAgcy_Picker-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_NewLegalVenue>div[role='menuitem']", AI = false)
	private WebElement btnLegalVenue_94;

	@IFindBy(how = How.CSS, using = "select[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehIncidentAssessDV-Status']", AI = false)
	private WebElement drpStatus;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-RentalServiceInputSet-RentalServiceInputSet-RentalInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-CustomerContact-MenuItem_Search>div[role='menuitem']", AI = false)
	private WebElement btnSearch_44;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehIncidentAssessDV-VehAssessItemLV_tb-Add>div[role='button']", AI = false)
	private WebElement btnAdd_116;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehIncidentAssessDV-VehAssessSourceLV_tb-Add>div[role='button']", AI = false)
	private WebElement btnAdd_114;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-RentalServiceInputSet-RentalServiceInputSet-RentalInputGroup-RentalAgency-ClaimNewVendorOnlyPickerMenuItemSet-NewContactPickerMenuItemSet_CompanyVendor>div[role='menuitem']", AI = false)
	private WebElement btnNewVendorCompany_24;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-Owner_Picker-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewCompany>div[role='menuitem']", AI = false)
	private WebElement btnNewCompany;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-Owner_Picker-Owner_PickerMenuIcon>div[role='button']", AI = false)
	private WebElement btnOwner_PickerMenuIcon;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-Assessor_Picker-ClaimNewVendorOnlyPickerMenuItemSet-NewContactPickerMenuItemSet_PersonVendor>div[role='menuitem']", AI = false)
	private WebElement btnNewVendorPerson;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-Theft_AffdvCmplBy-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal>div[role='menuitem']", AI = false)
	private WebElement btnNewLegal_75;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-Owner_Picker-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_Doctor>div[role='menuitem']", AI = false)
	private WebElement btnDoctor;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehIncidentAssessDV-VehAssessItemLV_tb-Associate>div[role='button']", AI = false)
	private WebElement btnAssociateWith;

	@IFindBy(how = How.CSS, using = "select[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-RentalServiceInputSet-RentalServiceInputSet-RentalInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-Claim_JurisdictionState']", AI = false)
	private WebElement drpJurisdiction_64;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-RentalServiceInputSet-RentalServiceInputSet-RentalInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-CustomerContact-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoTowingAgcy>div[role='menuitem']", AI = false)
	private WebElement btnAutoTowingAgency_34;

	@IFindBy(how = How.CSS, using = "input[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-Driver_Phone']", AI = false)
	private WebElement inpDriversPhone;

	@IFindBy(how = How.CSS, using = "input[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-RentalServiceInputSet-RentalServiceInputSet-RentalInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressLine2']", AI = false)
	private WebElement inpAddress2_51;

	@IFindBy(how = How.CSS, using = "select[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehIncidentAssessDV-VehAssessItemLV_tb-SourceRange']", AI = false)
	private WebElement drpSource;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-RentalServiceInputSet-RentalServiceInputSet-RentalInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-CustomerContact-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_MedicalCareOrg>div[role='menuitem']", AI = false)
	private WebElement btnMedicalCareOrganization_36;

	@IFindBy(how = How.CSS, using = "select[name='NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-RecoveryAddress-CCAddressInputSet-globalAddressContainer-Address_Picker']", AI = false)
	private WebElement drpLocation_97;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehIncidentAssessDV-CloseDate_dateIcon", AI = false)
	private WebElement btnActualCloseDateDateIcon;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-Assessor_Picker-Assessor_PickerMenuIcon>div[role='button']", AI = false)
	private WebElement btnAssessor_PickerMenuIcon;

	@IFindBy(how = How.CSS, using = "#NewVehicleIncidentPopup-NewVehicleIncidentScreen-VehIncidentDetailDV-VehicleIncidentDV-RentalServiceInputSet-RentalServiceInputSet-RentalInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-CustomerContact-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoRepairShop>div[role='menuitem']", AI = false)
	private WebElement btnAutobodyRepairShop_33;
	
	@IFindBy(how = How.CSS, using = "input[name$='Vehicle_VIN']", AI = false)
	private WebElement inpVin;
	
	@IFindBy(how = How.XPATH, using = "//div[text()='New Vehicle Incident']//parent::div[contains(@class,'TitleBar')]", AI = false)
	private WebElement ttlNewVehicleIncident;

	public NewVehicleIncidentPage(){
	}

	public NewVehicleIncidentPage(WebDriver driver){
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
		}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, ttlNewVehicleIncident))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);
}public NewVehicleIncidentPage selectDriversLicenseState(WebDriver driver,String DriversLicenseState)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpDriversLicenseState,DriversLicenseState,"DriversLicenseState");
				    return this;
			}
public NewVehicleIncidentPage selectInitialAssessor(WebDriver driver,String InitialAssessor)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpInitialAssessor,InitialAssessor,"InitialAssessor");
				    return this;
			}
public NewVehicleIncidentPage clickTheft_AffdvCmplByMenuIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnTheft_AffdvCmplByMenuIcon,"Theft_AffdvCmplByMenuIcon");
				    return this;
			}
public NewVehicleIncidentPage clickRentalNoCoverage(WebDriver driver)  {
					BrowserActions.click(driver, chkRentalNoCoverage,"RentalNoCoverage");
				    return this;
			}
public NewVehicleIncidentPage clickNewCompany_38(WebDriver driver)  {
					BrowserActions.click(driver, btnNewCompany_38,"NewCompany_38");
				    return this;
			}
public NewVehicleIncidentPage enterMake(WebDriver driver,String Make) {
		            BrowserActions.type(driver, inpMake,Make, "Make");
			        return this;
           }
public NewVehicleIncidentPage clickViewContactDetails(WebDriver driver)  {
					BrowserActions.click(driver, btnViewContactDetails,"ViewContactDetails");
				    return this;
			}
public NewVehicleIncidentPage clickCustomerContactMenuIcon_30(WebDriver driver)  {
					BrowserActions.click(driver, btnCustomerContactMenuIcon_30,"CustomerContactMenuIcon_30");
				    return this;
			}
public NewVehicleIncidentPage enterAddress3_52(WebDriver driver,String Address3_52) {
		            BrowserActions.type(driver, inpAddress3_52,Address3_52, "Address3_52");
			        return this;
           }
public NewVehicleIncidentPage clickNewVendor_83(WebDriver driver)  {
					BrowserActions.click(driver, btnNewVendor_83,"NewVendor_83");
				    return this;
			}
public NewVehicleIncidentPage clickValiduntilDateIcon_110(WebDriver driver)  {
					BrowserActions.click(driver, btnValiduntilDateIcon_110,"ValiduntilDateIcon_110");
				    return this;
			}
public NewVehicleIncidentPage enterLocationCode_63(WebDriver driver,String LocationCode_63) {
		            BrowserActions.type(driver, inpLocationCode_63,LocationCode_63, "LocationCode_63");
			        return this;
           }
public NewVehicleIncidentPage enterDescription_113(WebDriver driver,String Description_113) {
		            BrowserActions.type(driver, inpDescription_113,Description_113, "Description_113");
			        return this;
           }
public NewVehicleIncidentPage clickAttorney_41(WebDriver driver)  {
					BrowserActions.click(driver, btnAttorney_41,"Attorney_41");
				    return this;
			}
public NewVehicleIncidentPage selectOwner(WebDriver driver,String Owner)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpOwner,Owner,"Owner");
				    return this;
			}
public NewVehicleIncidentPage enterAddressSummary_48(WebDriver driver,String AddressSummary_48) {
		            BrowserActions.type(driver, inpAddressSummary_48,AddressSummary_48, "AddressSummary_48");
			        return this;
           }
public NewVehicleIncidentPage clickAutobodyRepairShop_84(WebDriver driver)  {
					BrowserActions.click(driver, btnAutobodyRepairShop_84,"AutobodyRepairShop_84");
				    return this;
			}
public NewVehicleIncidentPage enterComment(WebDriver driver,String Comment) {
		            BrowserActions.type(driver, inpComment,Comment, "Comment");
			        return this;
           }
public NewVehicleIncidentPage selectAddressType_107(WebDriver driver,String AddressType_107)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpAddressType_107,AddressType_107,"AddressType_107");
				    return this;
			}
public NewVehicleIncidentPage clickAdjudicator_40(WebDriver driver)  {
					BrowserActions.click(driver, btnAdjudicator_40,"Adjudicator_40");
				    return this;
			}
public NewVehicleIncidentPage clickDriver_PickerMenuIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnDriver_PickerMenuIcon,"Driver_PickerMenuIcon");
				    return this;
			}
public NewVehicleIncidentPage enterLocationDescription_60(WebDriver driver,String LocationDescription_60) {
		            BrowserActions.type(driver, inpLocationDescription_60,LocationDescription_60, "LocationDescription_60");
			        return this;
           }
public NewVehicleIncidentPage enterModel(WebDriver driver,String Model) {
		            BrowserActions.type(driver, inpModel,Model, "Model");
			        return this;
           }
public NewVehicleIncidentPage clickSearchforaUser(WebDriver driver)  {
					BrowserActions.click(driver, btnSearchforaUser,"SearchforaUser");
				    return this;
			}
public NewVehicleIncidentPage clickAssessment(WebDriver driver)  {
					BrowserActions.click(driver, btnAssessment,"Assessment");
				    return this;
			}
public NewVehicleIncidentPage clickNewLegal_90(WebDriver driver)  {
					BrowserActions.click(driver, btnNewLegal_90,"NewLegal_90");
				    return this;
			}
public NewVehicleIncidentPage enterLocationDescription_108(WebDriver driver,String LocationDescription_108) {
		            BrowserActions.type(driver, inpLocationDescription_108,LocationDescription_108, "LocationDescription_108");
			        return this;
           }
public NewVehicleIncidentPage selectAddressType_59(WebDriver driver,String AddressType_59)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpAddressType_59,AddressType_59,"AddressType_59");
				    return this;
			}
public NewVehicleIncidentPage clickNewVendor_9(WebDriver driver)  {
					BrowserActions.click(driver, btnNewVendor_9,"NewVendor_9");
				    return this;
			}
public NewVehicleIncidentPage clickRemove_5(WebDriver driver)  {
					BrowserActions.click(driver, btnRemove_5,"Remove_5");
				    return this;
			}
public NewVehicleIncidentPage clickAdjudicator(WebDriver driver)  {
					BrowserActions.click(driver, btnAdjudicator,"Adjudicator");
				    return this;
			}
public NewVehicleIncidentPage enterRentalEndDate(WebDriver driver,String RentalEndDate) {
		            BrowserActions.type(driver, inpRentalEndDate,RentalEndDate, "RentalEndDate");
			        return this;
           }
public NewVehicleIncidentPage selectRelationtoOwner(WebDriver driver,String RelationtoOwner)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpRelationtoOwner,RelationtoOwner,"RelationtoOwner");
				    return this;
			}
public NewVehicleIncidentPage clickWasthereacollision(WebDriver driver)  {
					BrowserActions.click(driver, rdbWasthereacollision,"Wasthereacollision");
				    return this;
			}
public NewVehicleIncidentPage selectInternalUser(WebDriver driver,String InternalUser)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpInternalUser,InternalUser,"InternalUser");
				    return this;
			}
public NewVehicleIncidentPage clickAutobodyRepairShop_69(WebDriver driver)  {
					BrowserActions.click(driver, btnAutobodyRepairShop_69,"AutobodyRepairShop_69");
				    return this;
			}
public NewVehicleIncidentPage clickMedicalCareOrganization_87(WebDriver driver)  {
					BrowserActions.click(driver, btnMedicalCareOrganization_87,"MedicalCareOrganization_87");
				    return this;
			}
public NewVehicleIncidentPage enterServiceRequestSubmitMessage(WebDriver driver,String ServiceRequestSubmitMessage) {
		            BrowserActions.type(driver, inpServiceRequestSubmitMessage,ServiceRequestSubmitMessage, "ServiceRequestSubmitMessage");
			        return this;
           }
public NewVehicleIncidentPage clickVendorCompany_73(WebDriver driver)  {
					BrowserActions.click(driver, btnVendorCompany_73,"VendorCompany_73");
				    return this;
			}
public NewVehicleIncidentPage clickAutoTowingAgency_85(WebDriver driver)  {
					BrowserActions.click(driver, btnAutoTowingAgency_85,"AutoTowingAgency_85");
				    return this;
			}
public NewVehicleIncidentPage enterOdometerReading(WebDriver driver,String OdometerReading) {
		            BrowserActions.type(driver, inpOdometerReading,OdometerReading, "OdometerReading");
			        return this;
           }
public NewVehicleIncidentPage enterRequestedServiceCompletionDate(WebDriver driver,String RequestedServiceCompletionDate) {
		            BrowserActions.type(driver, inpRequestedServiceCompletionDate,RequestedServiceCompletionDate, "RequestedServiceCompletionDate");
			        return this;
           }
public NewVehicleIncidentPage selectAddressType(WebDriver driver,String AddressType)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpAddressType,AddressType,"AddressType");
				    return this;
			}
public NewVehicleIncidentPage clickAdjudicator_17(WebDriver driver)  {
					BrowserActions.click(driver, btnAdjudicator_17,"Adjudicator_17");
				    return this;
			}
public NewVehicleIncidentPage clickRemove_66(WebDriver driver)  {
					BrowserActions.click(driver, btnRemove_66,"Remove_66");
				    return this;
			}
public NewVehicleIncidentPage enterLicensePlate(WebDriver driver,String LicensePlate) {
		            BrowserActions.type(driver, inpLicensePlate,LicensePlate, "LicensePlate");
			        return this;
           }
public NewVehicleIncidentPage selectLocation(WebDriver driver,String Location)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpLocation,Location,"Location");
				    return this;
			}
public NewVehicleIncidentPage enterZIPCode(WebDriver driver,String ZIPCode) {
		            BrowserActions.type(driver, inpZIPCode,ZIPCode, "ZIPCode");
			        return this;
           }
public NewVehicleIncidentPage clickViewContactDetails_45(WebDriver driver)  {
					BrowserActions.click(driver, btnViewContactDetails_45,"ViewContactDetails_45");
				    return this;
			}
public NewVehicleIncidentPage enterCity_101(WebDriver driver,String City_101) {
		            BrowserActions.type(driver, inpCity_101,City_101, "City_101");
			        return this;
           }
public NewVehicleIncidentPage selectCustomerContact(WebDriver driver,String CustomerContact)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpCustomerContact,CustomerContact,"CustomerContact");
				    return this;
			}
public NewVehicleIncidentPage enterValiduntil(WebDriver driver,String Validuntil) {
		            BrowserActions.type(driver, inpValiduntil,Validuntil, "Validuntil");
			        return this;
           }
public NewVehicleIncidentPage enterCounty_55(WebDriver driver,String County_55) {
		            BrowserActions.type(driver, inpCounty_55,County_55, "County_55");
			        return this;
           }
public NewVehicleIncidentPage selectPointofFirstImpact(WebDriver driver,String PointofFirstImpact)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPointofFirstImpact,PointofFirstImpact,"PointofFirstImpact");
				    return this;
			}
public NewVehicleIncidentPage clickVendorCompany_88(WebDriver driver)  {
					BrowserActions.click(driver, btnVendorCompany_88,"VendorCompany_88");
				    return this;
			}
public NewVehicleIncidentPage clickAutoTowingAgency_70(WebDriver driver)  {
					BrowserActions.click(driver, btnAutoTowingAgency_70,"AutoTowingAgency_70");
				    return this;
			}
public NewVehicleIncidentPage clickTotalLoss(WebDriver driver)  {
					BrowserActions.click(driver, rdbTotalLoss,"TotalLoss");
				    return this;
			}
public NewVehicleIncidentPage clickViewContactDetails_27(WebDriver driver)  {
					BrowserActions.click(driver, btnViewContactDetails_27,"ViewContactDetails_27");
				    return this;
			}
public NewVehicleIncidentPage clickRemove_117(WebDriver driver)  {
					BrowserActions.click(driver, btnRemove_117,"Remove_117");
				    return this;
			}
public NewVehicleIncidentPage clickMedicalCareOrganization_72(WebDriver driver)  {
					BrowserActions.click(driver, btnMedicalCareOrganization_72,"MedicalCareOrganization_72");
				    return this;
			}
public NewVehicleIncidentPage selectCountry(WebDriver driver,String Country)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpCountry,Country,"Country");
				    return this;
			}
public NewVehicleIncidentPage enterAddress2_99(WebDriver driver,String Address2_99) {
		            BrowserActions.type(driver, inpAddress2_99,Address2_99, "Address2_99");
			        return this;
           }
public NewVehicleIncidentPage clickRemove_115(WebDriver driver)  {
					BrowserActions.click(driver, btnRemove_115,"Remove_115");
				    return this;
			}
public NewVehicleIncidentPage selectState(WebDriver driver,String State)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpState,State,"State");
				    return this;
			}
public NewVehicleIncidentPage clickNewLegal(WebDriver driver)  {
					BrowserActions.click(driver, btnNewLegal,"NewLegal");
				    return this;
			}
public NewVehicleIncidentPage clickDoctor_86(WebDriver driver)  {
					BrowserActions.click(driver, btnDoctor_86,"Doctor_86");
				    return this;
			}
public NewVehicleIncidentPage clickLoanonVehicle(WebDriver driver)  {
					BrowserActions.click(driver, rdbLoanonVehicle,"LoanonVehicle");
				    return this;
			}
public NewVehicleIncidentPage clickRecoveryDateDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnRecoveryDateDateIcon,"RecoveryDateDateIcon");
				    return this;
			}
public NewVehicleIncidentPage enterValiduntil_109(WebDriver driver,String Validuntil_109) {
		            BrowserActions.type(driver, inpValiduntil_109,Validuntil_109, "Validuntil_109");
			        return this;
           }
public NewVehicleIncidentPage clickAttorney_77(WebDriver driver)  {
					BrowserActions.click(driver, btnAttorney_77,"Attorney_77");
				    return this;
			}
public NewVehicleIncidentPage selectAppraisalLocation(WebDriver driver,String AppraisalLocation)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpAppraisalLocation,AppraisalLocation,"AppraisalLocation");
				    return this;
			}
public NewVehicleIncidentPage clickAdjudicator_76(WebDriver driver)  {
					BrowserActions.click(driver, btnAdjudicator_76,"Adjudicator_76");
				    return this;
			}
public NewVehicleIncidentPage selectByWhom(WebDriver driver,String ByWhom)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpByWhom,ByWhom,"ByWhom");
				    return this;
			}
public NewVehicleIncidentPage clickApprove(WebDriver driver)  {
					BrowserActions.click(driver, btnApprove,"Approve");
				    return this;
			}
public NewVehicleIncidentPage selectDriverName(WebDriver driver,String DriverName)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpDriverName,DriverName,1,"DriverName");
				    return this;
			}
public NewVehicleIncidentPage selectJurisdiction_112(WebDriver driver,String Jurisdiction_112)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpJurisdiction_112,Jurisdiction_112,"Jurisdiction_112");
				    return this;
			}
public NewVehicleIncidentPage selectRecoveryCondition(WebDriver driver,String RecoveryCondition)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpRecoveryCondition,RecoveryCondition,"RecoveryCondition");
				    return this;
			}
public NewVehicleIncidentPage clickVendorCompany_14(WebDriver driver)  {
					BrowserActions.click(driver, btnVendorCompany_14,"VendorCompany_14");
				    return this;
			}
public NewVehicleIncidentPage clickNewCompany_74(WebDriver driver)  {
					BrowserActions.click(driver, btnNewCompany_74,"NewCompany_74");
				    return this;
			}
public NewVehicleIncidentPage clickAutoFillIcon_106(WebDriver driver)  {
					BrowserActions.click(driver, btnAutoFillIcon_106,"AutoFillIcon_106");
				    return this;
			}
public NewVehicleIncidentPage selectLossParty(WebDriver driver,String LossParty)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpLossParty,LossParty,"LossParty");
				    return this;
			}
public NewVehicleIncidentPage clickAutoFillIcon_54(WebDriver driver)  {
					BrowserActions.click(driver, btnAutoFillIcon_54,"AutoFillIcon_54");
				    return this;
			}
public NewVehicleIncidentPage clickAutoFillIcon_102(WebDriver driver)  {
					BrowserActions.click(driver, btnAutoFillIcon_102,"AutoFillIcon_102");
				    return this;
			}
public NewVehicleIncidentPage clickViewContactDetails_7(WebDriver driver)  {
					BrowserActions.click(driver, btnViewContactDetails_7,"ViewContactDetails_7");
				    return this;
			}
public NewVehicleIncidentPage selectIsthedriverlistedinpolicy(WebDriver driver,String Isthedriverlistedinpolicy)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpIsthedriverlistedinpolicy,Isthedriverlistedinpolicy,"Isthedriverlistedinpolicy");
				    return this;
			}
public NewVehicleIncidentPage clickViewContactDetails_22(WebDriver driver)  {
					BrowserActions.click(driver, btnViewContactDetails_22,"ViewContactDetails_22");
				    return this;
			}
public NewVehicleIncidentPage clickAutoFillIcon_58(WebDriver driver)  {
					BrowserActions.click(driver, btnAutoFillIcon_58,"AutoFillIcon_58");
				    return this;
			}
public NewVehicleIncidentPage clickViewContactDetails_3(WebDriver driver)  {
					BrowserActions.click(driver, btnViewContactDetails_3,"ViewContactDetails_3");
				    return this;
			}
public NewVehicleIncidentPage clickNewVendorCompany(WebDriver driver)  {
					BrowserActions.click(driver, btnNewVendorCompany,"NewVendorCompany");
				    return this;
			}
public NewVehicleIncidentPage enterRentalBeginDate(WebDriver driver,String RentalBeginDate) {
		            BrowserActions.type(driver, inpRentalBeginDate,RentalBeginDate, "RentalBeginDate");
			        return this;
           }
public NewVehicleIncidentPage selectLicenseState(WebDriver driver,String LicenseState)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpLicenseState,LicenseState,"LicenseState");
				    return this;
			}
public NewVehicleIncidentPage enterRequestedQuoteCompletionDate(WebDriver driver,String RequestedQuoteCompletionDate) {
		            BrowserActions.type(driver, inpRequestedQuoteCompletionDate,RequestedQuoteCompletionDate, "RequestedQuoteCompletionDate");
			        return this;
           }
public NewVehicleIncidentPage selectLossOccurred(WebDriver driver,String LossOccurred)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpLossOccurred,LossOccurred,"LossOccurred");
				    return this;
			}
public NewVehicleIncidentPage clickOK(WebDriver driver)  {
					BrowserActions.click(driver, btnOK,"OK");
				    return this;
			}
public NewVehicleIncidentPage clickIsthehitandrundriverunknown(WebDriver driver)  {
					BrowserActions.click(driver, rdbIsthehitandrundriverunknown,"Isthehitandrundriverunknown");
				    return this;
			}
public NewVehicleIncidentPage clickInternalUser_NameMenuIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnInternalUser_NameMenuIcon,"InternalUser_NameMenuIcon");
				    return this;
			}
public NewVehicleIncidentPage enterRecoveryDate(WebDriver driver,String RecoveryDate) {
		            BrowserActions.type(driver, inpRecoveryDate,RecoveryDate, "RecoveryDate");
			        return this;
           }
public NewVehicleIncidentPage enterAddressLine1(WebDriver driver,String AddressLine1) {
		            BrowserActions.type(driver, inpAddressLine1,AddressLine1, "AddressLine1");
			        return this;
           }
public NewVehicleIncidentPage clickEquipmentFailure(WebDriver driver)  {
					BrowserActions.click(driver, rdbEquipmentFailure,"EquipmentFailure");
				    return this;
			}
public NewVehicleIncidentPage clickValiduntilDateIcon_62(WebDriver driver)  {
					BrowserActions.click(driver, btnValiduntilDateIcon_62,"ValiduntilDateIcon_62");
				    return this;
			}
public NewVehicleIncidentPage clickAutoTowingAgency(WebDriver driver)  {
					BrowserActions.click(driver, btnAutoTowingAgency,"AutoTowingAgency");
				    return this;
			}
public NewVehicleIncidentPage enterInvolving(WebDriver driver,String Involving) {
		            BrowserActions.type(driver, inpInvolving,Involving, "Involving");
			        return this;
           }
public NewVehicleIncidentPage selectState_56(WebDriver driver,String State_56)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpState_56,State_56,"State_56");
				    return this;
			}
public NewVehicleIncidentPage enterLocation(WebDriver driver,String Location) {
		            BrowserActions.type(driver, inpLocation,Location, "Location");
			        return this;
           }
public NewVehicleIncidentPage clickAttorney_18(WebDriver driver)  {
					BrowserActions.click(driver, btnAttorney_18,"Attorney_18");
				    return this;
			}
public NewVehicleIncidentPage clickSearch_95(WebDriver driver)  {
					BrowserActions.click(driver, btnSearch_95,"Search_95");
				    return this;
			}
public NewVehicleIncidentPage selectRentalAgency(WebDriver driver,String RentalAgency)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpRentalAgency,RentalAgency,"RentalAgency");
				    return this;
			}
public NewVehicleIncidentPage enterAdditionalInstructions(WebDriver driver,String AdditionalInstructions) {
		            BrowserActions.type(driver, inpAdditionalInstructions,AdditionalInstructions, "AdditionalInstructions");
			        return this;
           }
public NewVehicleIncidentPage enterYear(WebDriver driver,String Year) {
		            BrowserActions.type(driver, inpYear,Year, "Year");
			        return this;
           }
public NewVehicleIncidentPage clickEdit(WebDriver driver)  {
					BrowserActions.click(driver, btnEdit,"Edit");
				    return this;
			}
public NewVehicleIncidentPage clickNewPerson_8(WebDriver driver)  {
					BrowserActions.click(driver, btnNewPerson_8,"NewPerson_8");
				    return this;
			}
public NewVehicleIncidentPage clickDeny(WebDriver driver)  {
					BrowserActions.click(driver, btnDeny,"Deny");
				    return this;
			}
public NewVehicleIncidentPage clickVendorCompany_37(WebDriver driver)  {
					BrowserActions.click(driver, btnVendorCompany_37,"VendorCompany_37");
				    return this;
			}
public NewVehicleIncidentPage selectTrafficViolation(WebDriver driver,String TrafficViolation)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpTrafficViolation,TrafficViolation,"TrafficViolation");
				    return this;
			}
public NewVehicleIncidentPage clickRecovAgcy_PickerMenuIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnRecovAgcy_PickerMenuIcon,"RecovAgcy_PickerMenuIcon");
				    return this;
			}
public NewVehicleIncidentPage clickSearch_6(WebDriver driver)  {
					BrowserActions.click(driver, btnSearch_6,"Search_6");
				    return this;
			}
public NewVehicleIncidentPage clickRemove(WebDriver driver)  {
					BrowserActions.click(driver, btnRemove,"Remove");
				    return this;
			}
public NewVehicleIncidentPage clickSearch_2(WebDriver driver)  {
					BrowserActions.click(driver, btnSearch_2,"Search_2");
				    return this;
			}
public NewVehicleIncidentPage enterReservation(WebDriver driver,String Reservation) {
		            BrowserActions.type(driver, inpReservation,Reservation, "Reservation");
			        return this;
           }
public NewVehicleIncidentPage clickLawFirm_93(WebDriver driver)  {
					BrowserActions.click(driver, btnLawFirm_93,"LawFirm_93");
				    return this;
			}
public NewVehicleIncidentPage clickNewPerson_1(WebDriver driver)  {
					BrowserActions.click(driver, btnNewPerson_1,"NewPerson_1");
				    return this;
			}
public NewVehicleIncidentPage clickRentalBeginDateDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnRentalBeginDateDateIcon,"RentalBeginDateDateIcon");
				    return this;
			}
public NewVehicleIncidentPage selectPickupLocation(WebDriver driver,String PickupLocation)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPickupLocation,PickupLocation,"PickupLocation");
				    return this;
			}
public NewVehicleIncidentPage clickAdd_4(WebDriver driver)  {
					BrowserActions.click(driver, btnAdd_4,"Add_4");
				    return this;
			}
public NewVehicleIncidentPage enterAddressLine1_50(WebDriver driver,String AddressLine1_50) {
		            BrowserActions.type(driver, inpAddressLine1_50,AddressLine1_50, "AddressLine1_50");
			        return this;
           }
public NewVehicleIncidentPage clickNewCompany_89(WebDriver driver)  {
					BrowserActions.click(driver, btnNewCompany_89,"NewCompany_89");
				    return this;
			}
public NewVehicleIncidentPage clickValiduntilDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnValiduntilDateIcon,"ValiduntilDateIcon");
				    return this;
			}
public NewVehicleIncidentPage clickRequestedQuoteCompletionDateDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnRequestedQuoteCompletionDateDateIcon,"RequestedQuoteCompletionDateDateIcon");
				    return this;
			}
public NewVehicleIncidentPage clickCancel(WebDriver driver)  {
					BrowserActions.click(driver, btnCancel,"Cancel");
				    return this;
			}
public NewVehicleIncidentPage enterLocationCode_111(WebDriver driver,String LocationCode_111) {
		            BrowserActions.type(driver, inpLocationCode_111,LocationCode_111, "LocationCode_111");
			        return this;
           }
public NewVehicleIncidentPage selectOffRoadType(WebDriver driver,String OffRoadType)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpOffRoadType,OffRoadType,"OffRoadType");
				    return this;
			}
public NewVehicleIncidentPage clickLegalVenue_20(WebDriver driver)  {
					BrowserActions.click(driver, btnLegalVenue_20,"LegalVenue_20");
				    return this;
			}
public NewVehicleIncidentPage clickAutoFillIcon_23(WebDriver driver)  {
					BrowserActions.click(driver, btnAutoFillIcon_23,"AutoFillIcon_23");
				    return this;
			}
public NewVehicleIncidentPage enterDriversLicenseNumber(WebDriver driver,String DriversLicenseNumber) {
		            BrowserActions.type(driver, inpDriversLicenseNumber,DriversLicenseNumber, "DriversLicenseNumber");
			        return this;
           }
public NewVehicleIncidentPage clickAirbagsDeployed(WebDriver driver)  {
					BrowserActions.click(driver, rdbAirbagsDeployed,"AirbagsDeployed");
				    return this;
			}
public NewVehicleIncidentPage clickDoctor_12(WebDriver driver)  {
					BrowserActions.click(driver, btnDoctor_12,"Doctor_12");
				    return this;
			}
public NewVehicleIncidentPage clickRequestedServiceCompletionDateDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnRequestedServiceCompletionDateDateIcon,"RequestedServiceCompletionDateDateIcon");
				    return this;
			}
public NewVehicleIncidentPage clickOtherServices(WebDriver driver)  {
					BrowserActions.click(driver, chkOtherServices,"OtherServices");
				    return this;
			}
public NewVehicleIncidentPage enterMonthsRemaining(WebDriver driver,String MonthsRemaining) {
		            BrowserActions.type(driver, inpMonthsRemaining,MonthsRemaining, "MonthsRemaining");
			        return this;
           }
public NewVehicleIncidentPage enterServiceAddressName_46(WebDriver driver,String ServiceAddressName_46) {
		            BrowserActions.type(driver, inpServiceAddressName_46,ServiceAddressName_46, "ServiceAddressName_46");
			        return this;
           }
public NewVehicleIncidentPage clickLawFirm_78(WebDriver driver)  {
					BrowserActions.click(driver, btnLawFirm_78,"LawFirm_78");
				    return this;
			}
public NewVehicleIncidentPage selectStateofRecovery(WebDriver driver,String StateofRecovery)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpStateofRecovery,StateofRecovery,"StateofRecovery");
				    return this;
			}
public NewVehicleIncidentPage selectJurisdiction(WebDriver driver,String Jurisdiction)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpJurisdiction,Jurisdiction,"Jurisdiction");
				    return this;
			}
public NewVehicleIncidentPage clickNewLegal_16(WebDriver driver)  {
					BrowserActions.click(driver, btnNewLegal_16,"NewLegal_16");
				    return this;
			}
public NewVehicleIncidentPage enterCounty(WebDriver driver,String County) {
		            BrowserActions.type(driver, inpCounty,County, "County");
			        return this;
           }
public NewVehicleIncidentPage clickAppraisal(WebDriver driver)  {
					BrowserActions.click(driver, chkAppraisal,"Appraisal");
				    return this;
			}
public NewVehicleIncidentPage enterZIPCode_105(WebDriver driver,String ZIPCode_105) {
		            BrowserActions.type(driver, inpZIPCode_105,ZIPCode_105, "ZIPCode_105");
			        return this;
           }
public NewVehicleIncidentPage clickTargetCloseDateDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnTargetCloseDateDateIcon,"TargetCloseDateDateIcon");
				    return this;
			}
public NewVehicleIncidentPage enterLocationCode(WebDriver driver,String LocationCode) {
		            BrowserActions.type(driver, inpLocationCode,LocationCode, "LocationCode");
			        return this;
           }
public NewVehicleIncidentPage clickHitandrun(WebDriver driver)  {
					BrowserActions.click(driver, rdbHitandrun,"Hitandrun");
				    return this;
			}
public NewVehicleIncidentPage clickOwnersPermission(WebDriver driver)  {
					BrowserActions.click(driver, rdbOwnersPermission,"OwnersPermission");
				    return this;
			}
public NewVehicleIncidentPage enterZIPCode_57(WebDriver driver,String ZIPCode_57) {
		            BrowserActions.type(driver, inpZIPCode_57,ZIPCode_57, "ZIPCode_57");
			        return this;
           }
public NewVehicleIncidentPage selectCountry_98(WebDriver driver,String Country_98)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpCountry_98,Country_98,"Country_98");
				    return this;
			}
public NewVehicleIncidentPage selectVehicleType(WebDriver driver,String VehicleType)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpVehicleType,VehicleType,"VehicleType");
				    return this;
			}
public NewVehicleIncidentPage enterSpeed(WebDriver driver,String Speed) {
		            BrowserActions.type(driver, inpSpeed,Speed, "Speed");
			        return this;
           }
public NewVehicleIncidentPage clickNewPerson_67(WebDriver driver)  {
					BrowserActions.click(driver, btnNewPerson_67,"NewPerson_67");
				    return this;
			}
public NewVehicleIncidentPage clickNewPerson(WebDriver driver)  {
					BrowserActions.click(driver, btnNewPerson,"NewPerson");
				    return this;
			}
public NewVehicleIncidentPage enterRentalAgencyLocation(WebDriver driver,String RentalAgencyLocation) {
		            BrowserActions.type(driver, inpRentalAgencyLocation,RentalAgencyLocation, "RentalAgencyLocation");
			        return this;
           }
public NewVehicleIncidentPage clickVehicleLocked(WebDriver driver)  {
					BrowserActions.click(driver, rdbVehicleLocked,"VehicleLocked");
				    return this;
			}
public NewVehicleIncidentPage clickAutobodyRepairShop_10(WebDriver driver)  {
					BrowserActions.click(driver, btnAutobodyRepairShop_10,"AutobodyRepairShop_10");
				    return this;
			}
public NewVehicleIncidentPage clickLegalVenue_43(WebDriver driver)  {
					BrowserActions.click(driver, btnLegalVenue_43,"LegalVenue_43");
				    return this;
			}
public NewVehicleIncidentPage selectLocation_47(WebDriver driver,String Location_47)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpLocation_47,Location_47,"Location_47");
				    return this;
			}
public NewVehicleIncidentPage clickAutobodyRepairShop(WebDriver driver)  {
					BrowserActions.click(driver, btnAutobodyRepairShop,"AutobodyRepairShop");
				    return this;
			}
public NewVehicleIncidentPage enterAddress3(WebDriver driver,String Address3) {
		            BrowserActions.type(driver, inpAddress3,Address3, "Address3");
			        return this;
           }
public NewVehicleIncidentPage enterLocationDescription(WebDriver driver,String LocationDescription) {
		            BrowserActions.type(driver, inpLocationDescription,LocationDescription, "LocationDescription");
			        return this;
           }
public NewVehicleIncidentPage enterAddress1(WebDriver driver,String Address1) {
		            BrowserActions.type(driver, inpAddress1,Address1, "Address1");
			        return this;
           }
public NewVehicleIncidentPage enterAddress2(WebDriver driver,String Address2) {
		            BrowserActions.type(driver, inpAddress2,Address2, "Address2");
			        return this;
           }
public NewVehicleIncidentPage selectStyle(WebDriver driver,String Style)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpStyle,Style,"Style");
				    return this;
			}
public NewVehicleIncidentPage clickWasthevehicleparked(WebDriver driver)  {
					BrowserActions.click(driver, rdbWasthevehicleparked,"Wasthevehicleparked");
				    return this;
			}
public NewVehicleIncidentPage enterAddress3_100(WebDriver driver,String Address3_100) {
		            BrowserActions.type(driver, inpAddress3_100,Address3_100, "Address3_100");
			        return this;
           }
public NewVehicleIncidentPage clickSearch_80(WebDriver driver)  {
					BrowserActions.click(driver, btnSearch_80,"Search_80");
				    return this;
			}
public NewVehicleIncidentPage clickAutoFillIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnAutoFillIcon,"AutoFillIcon");
				    return this;
			}
public NewVehicleIncidentPage clickAdd_65(WebDriver driver)  {
					BrowserActions.click(driver, btnAdd_65,"Add_65");
				    return this;
			}
public NewVehicleIncidentPage clickAdjudicator_91(WebDriver driver)  {
					BrowserActions.click(driver, btnAdjudicator_91,"Adjudicator_91");
				    return this;
			}

public NewVehicleIncidentPage enterTargetCloseDate(WebDriver driver,String TargetCloseDate) {
		            BrowserActions.type(driver, inpTargetCloseDate,TargetCloseDate, "TargetCloseDate");
			        return this;
           }
public NewVehicleIncidentPage clickNewVendor(WebDriver driver)  {
					BrowserActions.click(driver, btnNewVendor,"NewVendor");
				    return this;
			}
public NewVehicleIncidentPage clickVendorCompany(WebDriver driver)  {
					BrowserActions.click(driver, btnVendorCompany,"VendorCompany");
				    return this;
			}
public NewVehicleIncidentPage enterRentalCoverage(WebDriver driver,String RentalCoverage) {
		            BrowserActions.type(driver, inpRentalCoverage,RentalCoverage, "RentalCoverage");
			        return this;
           }
public NewVehicleIncidentPage enterCounty_103(WebDriver driver,String County_103) {
		            BrowserActions.type(driver, inpCounty_103,County_103, "County_103");
			        return this;
           }
public NewVehicleIncidentPage clickSelectUser(WebDriver driver)  {
					BrowserActions.click(driver, btnSelectUser,"SelectUser");
				    return this;
			}
public NewVehicleIncidentPage selectReasonforUse(WebDriver driver,String ReasonforUse)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpReasonforUse,ReasonforUse,"ReasonforUse");
				    return this;
			}
public NewVehicleIncidentPage clickLawFirm(WebDriver driver)  {
					BrowserActions.click(driver, btnLawFirm,"LawFirm");
				    return this;
			}
public NewVehicleIncidentPage enterAdditionalInstructions_28(WebDriver driver,String AdditionalInstructions_28) {
		            BrowserActions.type(driver, inpAdditionalInstructions_28,AdditionalInstructions_28, "AdditionalInstructions_28");
			        return this;
           }
public NewVehicleIncidentPage clickNewVendor_32(WebDriver driver)  {
					BrowserActions.click(driver, btnNewVendor_32,"NewVendor_32");
				    return this;
			}
public NewVehicleIncidentPage enterColor(WebDriver driver,String Color) {
		            BrowserActions.type(driver, inpColor,Color, "Color");
			        return this;
           }
public NewVehicleIncidentPage clickAdd(WebDriver driver)  {
					BrowserActions.click(driver, btnAdd,"Add");
				    return this;
			}
public NewVehicleIncidentPage clickNewPerson_82(WebDriver driver)  {
					BrowserActions.click(driver, btnNewPerson_82,"NewPerson_82");
				    return this;
			}
public NewVehicleIncidentPage clickLegalVenue(WebDriver driver)  {
					BrowserActions.click(driver, btnLegalVenue,"LegalVenue");
				    return this;
			}
public NewVehicleIncidentPage clickLawFirm_42(WebDriver driver)  {
					BrowserActions.click(driver, btnLawFirm_42,"LawFirm_42");
				    return this;
			}
public NewVehicleIncidentPage clickReturntoNewExposureVehicle(WebDriver driver)  {
					BrowserActions.click(driver, btnReturntoNewExposureVehicle,"ReturntoNewExposureVehicle");
				    return this;
			}
public NewVehicleIncidentPage enterServiceRequestSubmitMessageFNOL(WebDriver driver,String ServiceRequestSubmitMessageFNOL) {
		            BrowserActions.type(driver, inpServiceRequestSubmitMessageFNOL,ServiceRequestSubmitMessageFNOL, "ServiceRequestSubmitMessageFNOL");
			        return this;
           }
public NewVehicleIncidentPage clickNewLegal_39(WebDriver driver)  {
					BrowserActions.click(driver, btnNewLegal_39,"NewLegal_39");
				    return this;
			}
public NewVehicleIncidentPage clickAttorney_92(WebDriver driver)  {
					BrowserActions.click(driver, btnAttorney_92,"Attorney_92");
				    return this;
			}
public NewVehicleIncidentPage clickOperable(WebDriver driver)  {
					BrowserActions.click(driver, rdbOperable,"Operable");
				    return this;
			}
public NewVehicleIncidentPage clickRentalAgencyMenuIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnRentalAgencyMenuIcon,"RentalAgencyMenuIcon");
				    return this;
			}
public NewVehicleIncidentPage enterDescription(WebDriver driver,String Description) {
		            BrowserActions.type(driver, inpDescription,Description, "Description");
			        return this;
           }
public NewVehicleIncidentPage selectSelectvehicle(WebDriver driver,String vehicleName)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpSelectvehicle,vehicleName,"Selectvehicle");
				    return this;
			}
public NewVehicleIncidentPage enterSerialNumber(WebDriver driver,String SerialNumber) {
		            BrowserActions.type(driver, inpSerialNumber,SerialNumber, "SerialNumber");
			        return this;
           }
public NewVehicleIncidentPage enterCity_53(WebDriver driver,String City_53) {
		            BrowserActions.type(driver, inpCity_53,City_53, "City_53");
			        return this;
           }
public NewVehicleIncidentPage selectCountry_49(WebDriver driver,String Country_49)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpCountry_49,Country_49,"Country_49");
				    return this;
			}
public NewVehicleIncidentPage enterActualCloseDate(WebDriver driver,String ActualCloseDate) {
		            BrowserActions.type(driver, inpActualCloseDate,ActualCloseDate, "ActualCloseDate");
			        return this;
           }
public NewVehicleIncidentPage clickSearch_21(WebDriver driver)  {
					BrowserActions.click(driver, btnSearch_21,"Search_21");
				    return this;
			}
public NewVehicleIncidentPage enterCity(WebDriver driver,String City) {
		            BrowserActions.type(driver, inpCity,City, "City");
			        return this;
           }
public NewVehicleIncidentPage enterValiduntil_61(WebDriver driver,String Validuntil_61) {
		            BrowserActions.type(driver, inpValiduntil_61,Validuntil_61, "Validuntil_61");
			        return this;
           }
public NewVehicleIncidentPage clickLegalVenue_79(WebDriver driver)  {
					BrowserActions.click(driver, btnLegalVenue_79,"LegalVenue_79");
				    return this;
			}
public NewVehicleIncidentPage clickSearch_26(WebDriver driver)  {
					BrowserActions.click(driver, btnSearch_26,"Search_26");
				    return this;
			}
public NewVehicleIncidentPage clickMedicalCareOrganization(WebDriver driver)  {
					BrowserActions.click(driver, btnMedicalCareOrganization,"MedicalCareOrganization");
				    return this;
			}
public NewVehicleIncidentPage clickSearch(WebDriver driver)  {
					BrowserActions.click(driver, btnSearch,"Search");
				    return this;
			}
public NewVehicleIncidentPage clickAttorney(WebDriver driver)  {
					BrowserActions.click(driver, btnAttorney,"Attorney");
				    return this;
			}
public NewVehicleIncidentPage selectRecoveringAgency(WebDriver driver,String RecoveringAgency)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpRecoveringAgency,RecoveringAgency,"RecoveringAgency");
				    return this;
			}
public NewVehicleIncidentPage clickAutoTowingAgency_11(WebDriver driver)  {
					BrowserActions.click(driver, btnAutoTowingAgency_11,"AutoTowingAgency_11");
				    return this;
			}
public NewVehicleIncidentPage clickLawFirm_19(WebDriver driver)  {
					BrowserActions.click(driver, btnLawFirm_19,"LawFirm_19");
				    return this;
			}
public NewVehicleIncidentPage enterAddressSummary(WebDriver driver,String AddressSummary) {
		            BrowserActions.type(driver, inpAddressSummary,AddressSummary, "AddressSummary");
			        return this;
           }
public NewVehicleIncidentPage clickMedicalCareOrganization_13(WebDriver driver)  {
					BrowserActions.click(driver, btnMedicalCareOrganization_13,"MedicalCareOrganization_13");
				    return this;
			}
public NewVehicleIncidentPage selectCustomerContact_29(WebDriver driver,String CustomerContact_29)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpCustomerContact_29,CustomerContact_29,"CustomerContact_29");
				    return this;
			}
public NewVehicleIncidentPage selectBoatType(WebDriver driver,String BoatType)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpBoatType,BoatType,"BoatType");
				    return this;
			}
public NewVehicleIncidentPage clickNewVendorPerson_25(WebDriver driver)  {
					BrowserActions.click(driver, btnNewVendorPerson_25,"NewVendorPerson_25");
				    return this;
			}
public NewVehicleIncidentPage selectTheftAffidavitCompleted(WebDriver driver,String TheftAffidavitCompleted)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpTheftAffidavitCompleted,TheftAffidavitCompleted,"TheftAffidavitCompleted");
				    return this;
			}
public NewVehicleIncidentPage clickDoctor_71(WebDriver driver)  {
					BrowserActions.click(driver, btnDoctor_71,"Doctor_71");
				    return this;
			}
public NewVehicleIncidentPage clickDetails(WebDriver driver)  {
					BrowserActions.click(driver, btnDetails,"Details");
				    return this;
			}
public NewVehicleIncidentPage enterServiceAddressName(WebDriver driver,String ServiceAddressName) {
		            BrowserActions.type(driver, inpServiceAddressName,ServiceAddressName, "ServiceAddressName");
			        return this;
           }
public NewVehicleIncidentPage selectDirectionofTravel(WebDriver driver,String DirectionofTravel)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpDirectionofTravel,DirectionofTravel,"DirectionofTravel");
				    return this;
			}
public NewVehicleIncidentPage selectState_104(WebDriver driver,String State_104)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpState_104,State_104,"State_104");
				    return this;
			}
public NewVehicleIncidentPage clickAntitheftDevice(WebDriver driver)  {
					BrowserActions.click(driver, rdbAntitheftDevice,"AntitheftDevice");
				    return this;
			}
public NewVehicleIncidentPage clickViewContactDetails_96(WebDriver driver)  {
					BrowserActions.click(driver, btnViewContactDetails_96,"ViewContactDetails_96");
				    return this;
			}
public NewVehicleIncidentPage enterDriversAddress(WebDriver driver,String DriversAddress) {
		            BrowserActions.type(driver, inpDriversAddress,DriversAddress, "DriversAddress");
			        return this;
           }
public NewVehicleIncidentPage enterRentalAgencyPhone(WebDriver driver,String RentalAgencyPhone) {
		            BrowserActions.type(driver, inpRentalAgencyPhone,RentalAgencyPhone, "RentalAgencyPhone");
			        return this;
           }
public NewVehicleIncidentPage clickNewCompany_15(WebDriver driver)  {
					BrowserActions.click(driver, btnNewCompany_15,"NewCompany_15");
				    return this;
			}
public NewVehicleIncidentPage clickWasthevehiclestolen(WebDriver driver)  {
					BrowserActions.click(driver, rdbWasthevehiclestolen,"Wasthevehiclestolen");
				    return this;
			}
public NewVehicleIncidentPage clickDoctor_35(WebDriver driver)  {
					BrowserActions.click(driver, btnDoctor_35,"Doctor_35");
				    return this;
			}
public NewVehicleIncidentPage clickViewContactDetails_81(WebDriver driver)  {
					BrowserActions.click(driver, btnViewContactDetails_81,"ViewContactDetails_81");
				    return this;
			}
public NewVehicleIncidentPage clickNewPerson_31(WebDriver driver)  {
					BrowserActions.click(driver, btnNewPerson_31,"NewPerson_31");
				    return this;
			}
public NewVehicleIncidentPage enterDamageDescription(WebDriver driver,String DamageDescription) {
		            BrowserActions.type(driver, inpDamageDescription,DamageDescription, "DamageDescription");
			        return this;
           }
public NewVehicleIncidentPage clickRentalEndDateDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnRentalEndDateDateIcon,"RentalEndDateDateIcon");
				    return this;
			}
public NewVehicleIncidentPage clickNewVendor_68(WebDriver driver)  {
					BrowserActions.click(driver, btnNewVendor_68,"NewVendor_68");
				    return this;
			}
public NewVehicleIncidentPage clickCustomerContactMenuIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnCustomerContactMenuIcon,"CustomerContactMenuIcon");
				    return this;
			}
public NewVehicleIncidentPage selectOftimevehicleusedbytheminor(WebDriver driver,String Oftimevehicleusedbytheminor)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpOftimevehicleusedbytheminor,Oftimevehicleusedbytheminor,"Oftimevehicleusedbytheminor");
				    return this;
			}
public NewVehicleIncidentPage clickLegalVenue_94(WebDriver driver)  {
					BrowserActions.click(driver, btnLegalVenue_94,"LegalVenue_94");
				    return this;
			}
public NewVehicleIncidentPage selectStatus(WebDriver driver,String Status)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpStatus,Status,"Status");
				    return this;
			}
public NewVehicleIncidentPage clickSearch_44(WebDriver driver)  {
					BrowserActions.click(driver, btnSearch_44,"Search_44");
				    return this;
			}
public NewVehicleIncidentPage clickAdd_116(WebDriver driver)  {
					BrowserActions.click(driver, btnAdd_116,"Add_116");
				    return this;
			}
public NewVehicleIncidentPage clickAdd_114(WebDriver driver)  {
					BrowserActions.click(driver, btnAdd_114,"Add_114");
				    return this;
			}
public NewVehicleIncidentPage clickNewVendorCompany_24(WebDriver driver)  {
					BrowserActions.click(driver, btnNewVendorCompany_24,"NewVendorCompany_24");
				    return this;
			}
public NewVehicleIncidentPage clickNewCompany(WebDriver driver)  {
					BrowserActions.click(driver, btnNewCompany,"NewCompany");
				    return this;
			}
public NewVehicleIncidentPage clickOwner_PickerMenuIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnOwner_PickerMenuIcon,"Owner_PickerMenuIcon");
				    return this;
			}
public NewVehicleIncidentPage clickNewVendorPerson(WebDriver driver)  {
					BrowserActions.click(driver, btnNewVendorPerson,"NewVendorPerson");
				    return this;
			}
public NewVehicleIncidentPage clickNewLegal_75(WebDriver driver)  {
					BrowserActions.click(driver, btnNewLegal_75,"NewLegal_75");
				    return this;
			}
public NewVehicleIncidentPage clickDoctor(WebDriver driver)  {
					BrowserActions.click(driver, btnDoctor,"Doctor");
				    return this;
			}
public NewVehicleIncidentPage clickAssociateWith(WebDriver driver)  {
					BrowserActions.click(driver, btnAssociateWith,"AssociateWith");
				    return this;
			}
public NewVehicleIncidentPage selectJurisdiction_64(WebDriver driver,String Jurisdiction_64)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpJurisdiction_64,Jurisdiction_64,"Jurisdiction_64");
				    return this;
			}
public NewVehicleIncidentPage clickAutoTowingAgency_34(WebDriver driver)  {
					BrowserActions.click(driver, btnAutoTowingAgency_34,"AutoTowingAgency_34");
				    return this;
			}
public NewVehicleIncidentPage enterDriversPhone(WebDriver driver,String DriversPhone) {
		            BrowserActions.type(driver, inpDriversPhone,DriversPhone, "DriversPhone");
			        return this;
           }
public NewVehicleIncidentPage enterAddress2_51(WebDriver driver,String Address2_51) {
		            BrowserActions.type(driver, inpAddress2_51,Address2_51, "Address2_51");
			        return this;
           }
public NewVehicleIncidentPage selectSource(WebDriver driver,String Source)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpSource,Source,"Source");
				    return this;
			}
public NewVehicleIncidentPage clickMedicalCareOrganization_36(WebDriver driver)  {
					BrowserActions.click(driver, btnMedicalCareOrganization_36,"MedicalCareOrganization_36");
				    return this;
			}
public NewVehicleIncidentPage selectLocation_97(WebDriver driver,String Location_97)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpLocation_97,Location_97,"Location_97");
				    return this;
			}
public NewVehicleIncidentPage clickActualCloseDateDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnActualCloseDateDateIcon,"ActualCloseDateDateIcon");
				    return this;
			}
public NewVehicleIncidentPage clickAssessor_PickerMenuIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnAssessor_PickerMenuIcon,"Assessor_PickerMenuIcon");
				    return this;
			}
public NewVehicleIncidentPage clickAutobodyRepairShop_33(WebDriver driver)  {
					BrowserActions.click(driver, btnAutobodyRepairShop_33,"AutobodyRepairShop_33");
				    return this;
			}

public NewVehicleIncidentPage enterVIN(WebDriver driver,String Vin) {
    BrowserActions.type(driver, inpVin,Vin,1,"Vin");
    return this;
}

}
