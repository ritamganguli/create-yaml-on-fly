package com.aspire.guidewire.cc.pages.homeowners;
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

public class PropertyLiabilityPage extends LoadableComponent<PropertyLiabilityPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
 	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
	
	@IFindBy(how = How.CSS, using = "select[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-Assessor_Picker']", AI = false)
	private WebElement drpInitialAssessor;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-Owner-MenuItem_ViewDetails>div[role='menuitem']", AI = false)
	private WebElement btnViewContactDetails;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixPropIncidentAssessDV-FixPropContentItemLV_tb-Remove>div[role='button']", AI = false)
	private WebElement btnRemove_41;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-RequestedServiceCompletionDate_dateIcon", AI = false)
	private WebElement btnRequestedServiceCompletionDateDateIcon;

	@IFindBy(how = How.CSS, using = "select[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-Claim_JurisdictionState']", AI = false)
	private WebElement drpJurisdiction_33;

	@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-OtherServicesLVInputGroupInputSet-OtherServicesInputGroup-_checkbox']", AI = false)
	private WebElement chkOtherServices;

	@IFindBy(how = How.CSS, using = "select[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-PropertyAttributeInputSet-PropertyAttribute_SprinklerType']", AI = false)
	private WebElement drpSprinklerType;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixPropIncidentAssessDV-FixPropAssessSourceLV_tb-Remove>div[role='button']", AI = false)
	private WebElement btnRemove_37;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixPropIncidentAssessDV_tb-Remove>div[role='button']", AI = false)
	private WebElement btnRemove_35;

	@IFindBy(how = How.CSS, using = "select[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-State']", AI = false)
	private WebElement drpState_25;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixPropIncidentAssessDV-FixPropAssessItemLV_tb-Remove>div[role='button']", AI = false)
	private WebElement btnRemove_39;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-PostalCode-AutoFillIcon", AI = false)
	private WebElement btnAutoFillIcon_1;

	@IFindBy(how = How.CSS, using = "select[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-Owner']", AI = false)
	private WebElement drpOwner;

	@IFindBy(how = How.CSS, using = "select[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-CCAddressInputSet-globalAddressContainer-Claim_JurisdictionState']", AI = false)
	private WebElement drpJurisdiction;

	@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixPropIncidentAssessDV-General_Comment']", AI = false)
	private WebElement inpComment;

	@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-County']", AI = false)
	private WebElement inpCounty;

	@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-_checkbox']", AI = false)
	private WebElement chkAppraisal;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixPropIncidentAssessDV-TargetCloseDate_dateIcon", AI = false)
	private WebElement btnTargetCloseDateDateIcon;

	@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-CCAddressInputSet-globalAddressContainer-Claim_LocationCode']", AI = false)
	private WebElement inpLocationCode;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-CustomerContact-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal>div[role='menuitem']", AI = false)
	private WebElement btnNewLegal_12;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixPropIncidentAssessDV-InternalUser_Name-InternalUser_NameUserSearchMenuItem>div[role='menuitem']", AI = false)
	private WebElement btnSearchforaUser;

	@IFindBy(how = How.CSS, using = "select[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-PropertyAttributeInputSet-LossLocation_Mold']", AI = false)
	private WebElement drpMoldInvolved;

	@IFindBy(how = How.CSS, using = "select[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-PropertyAttributeInputSet-LossLocation_Hazard']", AI = false)
	private WebElement drpHazardousWasteInvolved;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-Incident_AssessmentTab", AI = false)
	private WebElement btnAssessment;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-Owner-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Adjudicator>div[role='menuitem']", AI = false)
	private WebElement btnAdjudicator;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-CustomerContact-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoRepairShop>div[role='menuitem']", AI = false)
	private WebElement btnAutobodyRepairShop_6;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-CustomerContact-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor>div[role='menuitem']", AI = false)
	private WebElement btnNewVendor_5;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-Owner-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewPerson>div[role='menuitem']", AI = false)
	private WebElement btnNewPerson;

	@IFindBy(how = How.CSS, using = "select[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-Country']", AI = false)
	private WebElement drpCountry_19;

	@IFindBy(how = How.CSS, using = "select[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixPropIncidentAssessDV-FixPropContentItemLV_tb-ContentSourceRange']", AI = false)
	private WebElement drpSource_44;

	@IFindBy(how = How.CSS, using = "select[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixPropIncidentAssessDV-InternalUser_Name']", AI = false)
	private WebElement drpInternalUser;

	@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-City']", AI = false)
	private WebElement inpCity_22;

	@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-Address_ValidUntil']", AI = false)
	private WebElement inpValiduntil_30;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixPropIncidentAssessDV-FixPropContentItemLV_tb-Deny>div[role='button']", AI = false)
	private WebElement btnDeny_43;

	@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-ServiceRequestSubmitMessage']", AI = false)
	private WebElement inpServiceRequestSubmitMessage;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-Owner-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoRepairShop>div[role='menuitem']", AI = false)
	private WebElement btnAutobodyRepairShop;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-CustomerContact-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Adjudicator>div[role='menuitem']", AI = false)
	private WebElement btnAdjudicator_13;

	@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressLine3']", AI = false)
	private WebElement inpAddress3;

	@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-CCAddressInputSet-globalAddressContainer-Address_Description']", AI = false)
	private WebElement inpLocationDescription;

	@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-RequestedServiceCompletionDate']", AI = false)
	private WebElement inpRequestedServiceCompletionDate;

	@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressLine1']", AI = false)
	private WebElement inpAddress1;

	@IFindBy(how = How.CSS, using = "select[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-CCAddressInputSet-globalAddressContainer-Address_AddressType']", AI = false)
	private WebElement drpAddressType;

	@IFindBy(how = How.CSS, using = "select[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-PropertyAttributeInputSet-PropertyAttribute_LossArea']", AI = false)
	private WebElement drpLossArea;

	@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressLine2']", AI = false)
	private WebElement inpAddress2;

	@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressLine2']", AI = false)
	private WebElement inpAddress2_20;

	@IFindBy(how = How.CSS, using = "select[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-Address_Picker']", AI = false)
	private WebElement drpLocation;

	@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-PropertyAttributeInputSet-PropertyAttribute_NumSprinkler']", AI = false)
	private WebElement inpTotalofSprinklers;

	@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressSummary']", AI = false)
	private WebElement inpPropertyName;

	@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-PostalCode']", AI = false)
	private WebElement inpZIPCode;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-City-AutoFillIcon", AI = false)
	private WebElement btnAutoFillIcon;

	@IFindBy(how = How.CSS, using = "select[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-CustomerContact']", AI = false)
	private WebElement drpCustomerContact;

	@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-CCAddressInputSet-globalAddressContainer-Address_ValidUntil']", AI = false)
	private WebElement inpValiduntil;

	@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixPropIncidentAssessDV-IncludeContentsLineItems']", AI = false)
	private WebElement rdbToContents;

	@IFindBy(how = How.CSS, using = "select[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-Address_AddressType']", AI = false)
	private WebElement drpAddressType_28;

	@IFindBy(how = How.CSS, using = "select[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-PropertyAttributeInputSet-PropertyAttribute_RoofMaterial']", AI = false)
	private WebElement drpRoofCoveringMaterials;

	@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixPropIncidentAssessDV-TargetCloseDate']", AI = false)
	private WebElement inpTargetCloseDate;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-Owner-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor>div[role='menuitem']", AI = false)
	private WebElement btnNewVendor;

	@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-Claim_LocationCode']", AI = false)
	private WebElement inpLocationCode_32;

	@IFindBy(how = How.CSS, using = "select[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-EstDamageAmt']", AI = false)
	private WebElement drpEstimateofDamage;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-Owner-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_CompanyVendor>div[role='menuitem']", AI = false)
	private WebElement btnVendorCompany;

	@IFindBy(how = How.CSS, using = "select[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-Country']", AI = false)
	private WebElement drpCountry;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixPropIncidentAssessDV-InternalUser_Name-InternalUser_NameUserSelectMenuItem>div[role='menuitem']", AI = false)
	private WebElement btnSelectUser;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-Owner-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_LawFirm>div[role='menuitem']", AI = false)
	private WebElement btnLawFirm;

	@IFindBy(how = How.CSS, using = "select[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-PropertyAttributeInputSet-PropertyAttribute_ClassType']", AI = false)
	private WebElement drpClassType;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-Owner-OwnerMenuIcon>div[role='button']", AI = false)
	private WebElement btnOwnerMenuIcon;

	@IFindBy(how = How.CSS, using = "select[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-State']", AI = false)
	private WebElement drpState;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-Owner-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal>div[role='menuitem']", AI = false)
	private WebElement btnNewLegal;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-OtherServicesLVInputGroupInputSet-OtherServicesInputGroup-OtherServicesLVInputSet-OtherServicesLV_tb-AddServiceRequest>div[role='button']", AI = false)
	private WebElement btnAdd;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-Owner-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_NewLegalVenue>div[role='menuitem']", AI = false)
	private WebElement btnLegalVenue;

	@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-ServiceRequestSubmitMessageFNOL']", AI = false)
	private WebElement inpServiceRequestSubmitMessageFNOL;

	@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixPropIncidentAssessDV-IncludeLineItems']", AI = false)
	private WebElement rdbToBuilding;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-CustomerContact-MenuItem_Search>div[role='menuitem']", AI = false)
	private WebElement btnSearch_17;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-__crumb__", AI = false)
	private WebElement btnReturntoNewExposureProperty;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-CustomerContact-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_CompanyVendor>div[role='menuitem']", AI = false)
	private WebElement btnVendorCompany_10;

	@IFindBy(how = How.CSS, using = "select[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressPicker']", AI = false)
	private WebElement drpAppraisalLocation;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixPropIncidentAssessDV-FixPropAssessItemLV_tb-Approve>div[role='button']", AI = false)
	private WebElement btnApprove;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-CustomerContact-MenuItem_ViewDetails>div[role='menuitem']", AI = false)
	private WebElement btnViewContactDetails_18;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixPropIncidentAssessDV-FixPropContentItemLV_tb-ApproveContent>div[role='button']", AI = false)
	private WebElement btnApprove_42;

	@IFindBy(how = How.CSS, using = "select[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-PropertyAttributeInputSet-PropertyAttribute_SprinkRetServ']", AI = false)
	private WebElement drpSprinklersReturnedtoService;

	@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixPropIncidentAssessDV-General_Description']", AI = false)
	private WebElement inpDescription;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixPropIncidentAssessDV-FixPropContentItemLV_tb-AssociateContent>div[role='button']", AI = false)
	private WebElement btnAssociateWith_45;

	@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-PropertyAttributeInputSet-PropertyAttribute_NumSprinkOper']", AI = false)
	private WebElement inpOfSprinklersthatOperated;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixPropIncidentAssessDV-FixPropContentItemLV_tb-Add>div[role='button']", AI = false)
	private WebElement btnAdd_40;

	@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixPropIncidentAssessDV-CloseDate']", AI = false)
	private WebElement inpActualCloseDate;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-Assessor_Picker-MenuItem_ViewDetails>div[role='menuitem']", AI = false)
	private WebElement btnViewContactDetails_3;

	@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-City']", AI = false)
	private WebElement inpCity;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-Assessor_Picker-ClaimNewVendorOnlyPickerMenuItemSet-NewContactPickerMenuItemSet_CompanyVendor>div[role='menuitem']", AI = false)
	private WebElement btnNewVendorCompany;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-ExtDamagetxt textarea", AI = false)
	private WebElement inpExtentofDamagetoProperty;

	@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-RequestedQuoteCompletionDate']", AI = false)
	private WebElement inpRequestedQuoteCompletionDate;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-Owner-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_MedicalCareOrg>div[role='menuitem']", AI = false)
	private WebElement btnMedicalCareOrganization;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-Update>div[role='button']", AI = false)
	private WebElement btnOK;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-Owner-MenuItem_Search>div[role='menuitem']", AI = false)
	private WebElement btnSearch;

	@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-PropertyDescription']", AI = false)
	private WebElement inpPropertyDescription;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-Owner-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Attorney>div[role='menuitem']", AI = false)
	private WebElement btnAttorney;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixPropIncidentAssessDV-InternalUser_Name-InternalUser_NameMenuIcon>div[role='button']", AI = false)
	private WebElement btnInternalUser_NameMenuIcon;

	@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressSummary']", AI = false)
	private WebElement inpAddressSummary;

	@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressLine1']", AI = false)
	private WebElement inpAddressLine1;

	@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-EstimateTime']", AI = false)
	private WebElement inpEstimatedRepairTime;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-CustomerContact-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Attorney>div[role='menuitem']", AI = false)
	private WebElement btnAttorney_14;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-Vehicle_DetailsCardTab", AI = false)
	private WebElement btnDetails;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-Owner-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoTowingAgcy>div[role='menuitem']", AI = false)
	private WebElement btnAutoTowingAgency;

	@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixPropIncidentAssessDV-Display_Name']", AI = false)
	private WebElement inpInvolving;

	@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressName']", AI = false)
	private WebElement inpServiceAddressName;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-InstructionText textarea", AI = false)
	private WebElement inpAdditionalInstructions;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-CustomerContact-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_NewLegalVenue>div[role='menuitem']", AI = false)
	private WebElement btnLegalVenue_16;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-Edit>div[role='button']", AI = false)
	private WebElement btnEdit;

	@IFindBy(how = How.CSS, using = "select[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-EstimatedReceived']", AI = false)
	private WebElement drpEstimateReceived;

	@IFindBy(how = How.CSS, using = "select[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-PropertyAttributeInputSet-PropertyAttribute_ExtWallMat']", AI = false)
	private WebElement drpExteriorWallMaterial;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-CustomerContact-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewCompany>div[role='menuitem']", AI = false)
	private WebElement btnNewCompany_11;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixPropIncidentAssessDV-FixPropAssessItemLV_tb-Deny>div[role='button']", AI = false)
	private WebElement btnDeny;

	@IFindBy(how = How.CSS, using = "select[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-CCAddressInputSet-globalAddressContainer-Address_Picker']", AI = false)
	private WebElement drpPropertyName;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-CustomerContact-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_LawFirm>div[role='menuitem']", AI = false)
	private WebElement btnLawFirm_15;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-Description textarea", AI = false)
	private WebElement inpDamageDescription;

	@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-Address_Description']", AI = false)
	private WebElement inpLocationDescription_29;

	@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-PropertyAttributeInputSet-PropertyAttribute_NumStories']", AI = false)
	private WebElement inpOfStories;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-CustomerContact-CustomerContactMenuIcon>div[role='button']", AI = false)
	private WebElement btnCustomerContactMenuIcon;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-OtherServicesLVInputGroupInputSet-OtherServicesInputGroup-OtherServicesLVInputSet-OtherServicesLV_tb-Remove>div[role='button']", AI = false)
	private WebElement btnRemove;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-CustomerContact-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewPerson>div[role='menuitem']", AI = false)
	private WebElement btnNewPerson_4;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-Assessor_Picker-MenuItem_Search>div[role='menuitem']", AI = false)
	private WebElement btnSearch_2;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-CustomerContact-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoTowingAgcy>div[role='menuitem']", AI = false)
	private WebElement btnAutoTowingAgency_7;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-Address_ValidUntil_dateIcon", AI = false)
	private WebElement btnValiduntilDateIcon_31;

	@IFindBy(how = How.CSS, using = "select[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixPropIncidentAssessDV-Status']", AI = false)
	private WebElement drpStatus;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-Owner-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewCompany>div[role='menuitem']", AI = false)
	private WebElement btnNewCompany;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-CustomerContact-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_MedicalCareOrg>div[role='menuitem']", AI = false)
	private WebElement btnMedicalCareOrganization_9;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-Assessor_Picker-ClaimNewVendorOnlyPickerMenuItemSet-NewContactPickerMenuItemSet_PersonVendor>div[role='menuitem']", AI = false)
	private WebElement btnNewVendorPerson;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-Owner-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_Doctor>div[role='menuitem']", AI = false)
	private WebElement btnDoctor;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixPropIncidentAssessDV-FixPropAssessItemLV_tb-Associate>div[role='button']", AI = false)
	private WebElement btnAssociateWith;

	@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressLine3']", AI = false)
	private WebElement inpAddress3_21;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-CCAddressInputSet-globalAddressContainer-Address_ValidUntil_dateIcon", AI = false)
	private WebElement btnValiduntilDateIcon;

	@IFindBy(how = How.CSS, using = "select[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixPropIncidentAssessDV-FixPropAssessItemLV_tb-SourceRange']", AI = false)
	private WebElement drpSource;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-RequestedQuoteCompletionDate_dateIcon", AI = false)
	private WebElement btnRequestedQuoteCompletionDateDateIcon;

	@IFindBy(how = How.CSS, using = "select[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-PropertyAttributeInputSet-OccupancyType']", AI = false)
	private WebElement drpTypeofOccupancy;

	@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-PostalCode']", AI = false)
	private WebElement inpZIPCode_26;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixPropIncidentAssessDV-CloseDate_dateIcon", AI = false)
	private WebElement btnActualCloseDateDateIcon;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-Cancel>div[role='button']", AI = false)
	private WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-CustomerContact-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_Doctor>div[role='menuitem']", AI = false)
	private WebElement btnDoctor_8;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-Assessor_Picker-Assessor_PickerMenuIcon>div[role='button']", AI = false)
	private WebElement btnAssessor_PickerMenuIcon;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixPropIncidentAssessDV_tb-Add>div[role='button']", AI = false)
	private WebElement btnAdd_34;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-City-AutoFillIcon", AI = false)
	private WebElement btnAutoFillIcon_23;

	@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-County']", AI = false)
	private WebElement inpCounty_24;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixPropIncidentAssessDV-FixPropAssessItemLV_tb-Add>div[role='button']", AI = false)
	private WebElement btnAdd_38;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-PostalCode-AutoFillIcon", AI = false)
	private WebElement btnAutoFillIcon_27;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixPropIncidentAssessDV-FixPropAssessSourceLV_tb-Add>div[role='button']", AI = false)
	private WebElement btnAdd_36;

	@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AlreadyRepaired']", AI = false)
	private WebElement rdbAlreadyRepaired;

	public PropertyLiabilityPage(){
	}

	public PropertyLiabilityPage(WebDriver driver) throws Exception{
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
		}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, rdbAlreadyRepaired))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);
}public PropertyLiabilityPage selectInitialAssessor(WebDriver driver,String InitialAssessor)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpInitialAssessor,InitialAssessor,"InitialAssessor");
				    return this;
			}
public PropertyLiabilityPage clickViewContactDetails(WebDriver driver)  {
					BrowserActions.click(driver, btnViewContactDetails,"ViewContactDetails");
				    return this;
			}
public PropertyLiabilityPage clickRemove_41(WebDriver driver)  {
					BrowserActions.click(driver, btnRemove_41,"Remove_41");
				    return this;
			}
public PropertyLiabilityPage clickRequestedServiceCompletionDateDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnRequestedServiceCompletionDateDateIcon,"RequestedServiceCompletionDateDateIcon");
				    return this;
			}
public PropertyLiabilityPage selectJurisdiction_33(WebDriver driver,String Jurisdiction_33)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpJurisdiction_33,Jurisdiction_33,"Jurisdiction_33");
				    return this;
			}
public PropertyLiabilityPage clickOtherServices(WebDriver driver)  {
					BrowserActions.click(driver, chkOtherServices,"OtherServices");
				    return this;
			}
public PropertyLiabilityPage selectSprinklerType(WebDriver driver,String SprinklerType)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpSprinklerType,SprinklerType,"SprinklerType");
				    return this;
			}
public PropertyLiabilityPage clickRemove_37(WebDriver driver)  {
					BrowserActions.click(driver, btnRemove_37,"Remove_37");
				    return this;
			}
public PropertyLiabilityPage clickRemove_35(WebDriver driver)  {
					BrowserActions.click(driver, btnRemove_35,"Remove_35");
				    return this;
			}
public PropertyLiabilityPage selectState_25(WebDriver driver,String State_25)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpState_25,State_25,"State_25");
				    return this;
			}
public PropertyLiabilityPage clickRemove_39(WebDriver driver)  {
					BrowserActions.click(driver, btnRemove_39,"Remove_39");
				    return this;
			}
public PropertyLiabilityPage clickAutoFillIcon_1(WebDriver driver)  {
					BrowserActions.click(driver, btnAutoFillIcon_1,"AutoFillIcon_1");
				    return this;
			}
public PropertyLiabilityPage selectOwner(WebDriver driver,String Owner)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpOwner,Owner,"Owner");
				    return this;
			}
public PropertyLiabilityPage selectJurisdiction(WebDriver driver,String Jurisdiction)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpJurisdiction,Jurisdiction,"Jurisdiction");
				    return this;
			}
public PropertyLiabilityPage enterComment(WebDriver driver,String Comment) {
		            BrowserActions.type(driver, inpComment,Comment, "Comment");
			        return this;
           }
public PropertyLiabilityPage enterCounty(WebDriver driver,String County) {
		            BrowserActions.type(driver, inpCounty,County, "County");
			        return this;
           }
public PropertyLiabilityPage clickAppraisal(WebDriver driver)  {
					BrowserActions.click(driver, chkAppraisal,"Appraisal");
				    return this;
			}
public PropertyLiabilityPage clickTargetCloseDateDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnTargetCloseDateDateIcon,"TargetCloseDateDateIcon");
				    return this;
			}
public PropertyLiabilityPage enterLocationCode(WebDriver driver,String LocationCode) {
		            BrowserActions.type(driver, inpLocationCode,LocationCode, "LocationCode");
			        return this;
           }
public PropertyLiabilityPage clickNewLegal_12(WebDriver driver)  {
					BrowserActions.click(driver, btnNewLegal_12,"NewLegal_12");
				    return this;
			}
public PropertyLiabilityPage clickSearchforaUser(WebDriver driver)  {
					BrowserActions.click(driver, btnSearchforaUser,"SearchforaUser");
				    return this;
			}
public PropertyLiabilityPage selectMoldInvolved(WebDriver driver,String MoldInvolved)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpMoldInvolved,MoldInvolved,"MoldInvolved");
				    return this;
			}
public PropertyLiabilityPage selectHazardousWasteInvolved(WebDriver driver,String HazardousWasteInvolved)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpHazardousWasteInvolved,HazardousWasteInvolved,"HazardousWasteInvolved");
				    return this;
			}
public PropertyLiabilityPage clickAssessment(WebDriver driver)  {
					BrowserActions.click(driver, btnAssessment,"Assessment");
				    return this;
			}
public PropertyLiabilityPage clickAdjudicator(WebDriver driver)  {
					BrowserActions.click(driver, btnAdjudicator,"Adjudicator");
				    return this;
			}
public PropertyLiabilityPage clickAutobodyRepairShop_6(WebDriver driver)  {
					BrowserActions.click(driver, btnAutobodyRepairShop_6,"AutobodyRepairShop_6");
				    return this;
			}
public PropertyLiabilityPage clickNewVendor_5(WebDriver driver)  {
					BrowserActions.click(driver, btnNewVendor_5,"NewVendor_5");
				    return this;
			}
public PropertyLiabilityPage clickNewPerson(WebDriver driver)  {
					BrowserActions.click(driver, btnNewPerson,"NewPerson");
				    return this;
			}
public PropertyLiabilityPage selectCountry_19(WebDriver driver,String Country_19)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpCountry_19,Country_19,"Country_19");
				    return this;
			}
public PropertyLiabilityPage selectSource_44(WebDriver driver,String Source_44)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpSource_44,Source_44,"Source_44");
				    return this;
			}
public PropertyLiabilityPage selectInternalUser(WebDriver driver,String InternalUser)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpInternalUser,InternalUser,"InternalUser");
				    return this;
			}
public PropertyLiabilityPage enterCity_22(WebDriver driver,String City_22) {
		            BrowserActions.type(driver, inpCity_22,City_22, "City_22");
			        return this;
           }
public PropertyLiabilityPage enterValiduntil_30(WebDriver driver,String Validuntil_30) {
		            BrowserActions.type(driver, inpValiduntil_30,Validuntil_30, "Validuntil_30");
			        return this;
           }
public PropertyLiabilityPage clickDeny_43(WebDriver driver)  {
					BrowserActions.click(driver, btnDeny_43,"Deny_43");
				    return this;
			}
public PropertyLiabilityPage enterServiceRequestSubmitMessage(WebDriver driver,String ServiceRequestSubmitMessage) {
		            BrowserActions.type(driver, inpServiceRequestSubmitMessage,ServiceRequestSubmitMessage, "ServiceRequestSubmitMessage");
			        return this;
           }
public PropertyLiabilityPage clickAutobodyRepairShop(WebDriver driver)  {
					BrowserActions.click(driver, btnAutobodyRepairShop,"AutobodyRepairShop");
				    return this;
			}
public PropertyLiabilityPage clickAdjudicator_13(WebDriver driver)  {
					BrowserActions.click(driver, btnAdjudicator_13,"Adjudicator_13");
				    return this;
			}
public PropertyLiabilityPage enterAddress3(WebDriver driver,String Address3) {
		            BrowserActions.type(driver, inpAddress3,Address3, "Address3");
			        return this;
           }
public PropertyLiabilityPage enterLocationDescription(WebDriver driver,String LocationDescription) {
		            BrowserActions.type(driver, inpLocationDescription,LocationDescription, "LocationDescription");
			        return this;
           }
public PropertyLiabilityPage enterRequestedServiceCompletionDate(WebDriver driver,String RequestedServiceCompletionDate) {
		            BrowserActions.type(driver, inpRequestedServiceCompletionDate,RequestedServiceCompletionDate, "RequestedServiceCompletionDate");
			        return this;
           }
public PropertyLiabilityPage enterAddress1(WebDriver driver,String Address1) {
		            BrowserActions.type(driver, inpAddress1,Address1, "Address1");
			        return this;
           }
public PropertyLiabilityPage selectAddressType(WebDriver driver,String AddressType)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpAddressType,AddressType,"AddressType");
				    return this;
			}
public PropertyLiabilityPage selectLossArea(WebDriver driver,String LossArea)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpLossArea,LossArea,"LossArea");
				    return this;
			}
public PropertyLiabilityPage enterAddress2(WebDriver driver,String Address2) {
		            BrowserActions.type(driver, inpAddress2,Address2, "Address2");
			        return this;
           }
public PropertyLiabilityPage enterAddress2_20(WebDriver driver,String Address2_20) {
		            BrowserActions.type(driver, inpAddress2_20,Address2_20, "Address2_20");
			        return this;
           }
public PropertyLiabilityPage selectLocation(WebDriver driver,String Location)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpLocation,Location,"Location");
				    return this;
			}
public PropertyLiabilityPage enterTotalofSprinklers(WebDriver driver,String TotalofSprinklers) {
		            BrowserActions.type(driver, inpTotalofSprinklers,TotalofSprinklers, "TotalofSprinklers");
			        return this;
           }
public PropertyLiabilityPage enterPropertyName(WebDriver driver,String PropertyName) {
		            BrowserActions.type(driver, inpPropertyName,PropertyName, "PropertyName");
			        return this;
           }
public PropertyLiabilityPage enterZIPCode(WebDriver driver,String ZIPCode) {
		            BrowserActions.type(driver, inpZIPCode,ZIPCode, "ZIPCode");
			        return this;
           }
public PropertyLiabilityPage clickAutoFillIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnAutoFillIcon,"AutoFillIcon");
				    return this;
			}
public PropertyLiabilityPage selectCustomerContact(WebDriver driver,String CustomerContact)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpCustomerContact,CustomerContact,"CustomerContact");
				    return this;
			}
public PropertyLiabilityPage enterValiduntil(WebDriver driver,String Validuntil) {
		            BrowserActions.type(driver, inpValiduntil,Validuntil, "Validuntil");
			        return this;
           }
public PropertyLiabilityPage clickToContents(WebDriver driver)  {
					BrowserActions.click(driver, rdbToContents,"ToContents");
				    return this;
			}
public PropertyLiabilityPage selectAddressType_28(WebDriver driver,String AddressType_28)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpAddressType_28,AddressType_28,"AddressType_28");
				    return this;
			}
public PropertyLiabilityPage selectRoofCoveringMaterials(WebDriver driver,String RoofCoveringMaterials)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpRoofCoveringMaterials,RoofCoveringMaterials,"RoofCoveringMaterials");
				    return this;
			}
public PropertyLiabilityPage enterTargetCloseDate(WebDriver driver,String TargetCloseDate) {
		            BrowserActions.type(driver, inpTargetCloseDate,TargetCloseDate, "TargetCloseDate");
			        return this;
           }
public PropertyLiabilityPage clickNewVendor(WebDriver driver)  {
					BrowserActions.click(driver, btnNewVendor,"NewVendor");
				    return this;
			}
public PropertyLiabilityPage enterLocationCode_32(WebDriver driver,String LocationCode_32) {
		            BrowserActions.type(driver, inpLocationCode_32,LocationCode_32, "LocationCode_32");
			        return this;
           }
public PropertyLiabilityPage selectEstimateofDamage(WebDriver driver,String EstimateofDamage)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpEstimateofDamage,EstimateofDamage,"EstimateofDamage");
				    return this;
			}
public PropertyLiabilityPage clickVendorCompany(WebDriver driver)  {
					BrowserActions.click(driver, btnVendorCompany,"VendorCompany");
				    return this;
			}
public PropertyLiabilityPage selectCountry(WebDriver driver,String Country)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpCountry,Country,"Country");
				    return this;
			}
public PropertyLiabilityPage clickSelectUser(WebDriver driver)  {
					BrowserActions.click(driver, btnSelectUser,"SelectUser");
				    return this;
			}
public PropertyLiabilityPage clickLawFirm(WebDriver driver)  {
					BrowserActions.click(driver, btnLawFirm,"LawFirm");
				    return this;
			}
public PropertyLiabilityPage selectClassType(WebDriver driver,String ClassType)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpClassType,ClassType,"ClassType");
				    return this;
			}
public PropertyLiabilityPage clickOwnerMenuIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnOwnerMenuIcon,"OwnerMenuIcon");
				    return this;
			}
public PropertyLiabilityPage selectState(WebDriver driver,String State)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpState,State,"State");
				    return this;
			}
public PropertyLiabilityPage clickNewLegal(WebDriver driver)  {
					BrowserActions.click(driver, btnNewLegal,"NewLegal");
				    return this;
			}
public PropertyLiabilityPage clickAdd(WebDriver driver)  {
					BrowserActions.click(driver, btnAdd,"Add");
				    return this;
			}
public PropertyLiabilityPage clickLegalVenue(WebDriver driver)  {
					BrowserActions.click(driver, btnLegalVenue,"LegalVenue");
				    return this;
			}
public PropertyLiabilityPage enterServiceRequestSubmitMessageFNOL(WebDriver driver,String ServiceRequestSubmitMessageFNOL) {
		            BrowserActions.type(driver, inpServiceRequestSubmitMessageFNOL,ServiceRequestSubmitMessageFNOL, "ServiceRequestSubmitMessageFNOL");
			        return this;
           }
public PropertyLiabilityPage clickToBuilding(WebDriver driver)  {
					BrowserActions.click(driver, rdbToBuilding,"ToBuilding");
				    return this;
			}
public PropertyLiabilityPage clickSearch_17(WebDriver driver)  {
					BrowserActions.click(driver, btnSearch_17,"Search_17");
				    return this;
			}
public PropertyLiabilityPage clickReturntoNewExposureProperty(WebDriver driver)  {
					BrowserActions.click(driver, btnReturntoNewExposureProperty,"ReturntoNewExposureProperty");
				    return this;
			}
public PropertyLiabilityPage clickVendorCompany_10(WebDriver driver)  {
					BrowserActions.click(driver, btnVendorCompany_10,"VendorCompany_10");
				    return this;
			}
public PropertyLiabilityPage selectAppraisalLocation(WebDriver driver,String AppraisalLocation)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpAppraisalLocation,AppraisalLocation,"AppraisalLocation");
				    return this;
			}
public PropertyLiabilityPage clickApprove(WebDriver driver)  {
					BrowserActions.click(driver, btnApprove,"Approve");
				    return this;
			}
public PropertyLiabilityPage clickViewContactDetails_18(WebDriver driver)  {
					BrowserActions.click(driver, btnViewContactDetails_18,"ViewContactDetails_18");
				    return this;
			}
public PropertyLiabilityPage clickApprove_42(WebDriver driver)  {
					BrowserActions.click(driver, btnApprove_42,"Approve_42");
				    return this;
			}
public PropertyLiabilityPage selectSprinklersReturnedtoService(WebDriver driver,String SprinklersReturnedtoService)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpSprinklersReturnedtoService,SprinklersReturnedtoService,"SprinklersReturnedtoService");
				    return this;
			}
public PropertyLiabilityPage enterDescription(WebDriver driver,String Description) {
		            BrowserActions.type(driver, inpDescription,Description, "Description");
			        return this;
           }
public PropertyLiabilityPage clickAssociateWith_45(WebDriver driver)  {
					BrowserActions.click(driver, btnAssociateWith_45,"AssociateWith_45");
				    return this;
			}
public PropertyLiabilityPage enterOfSprinklersthatOperated(WebDriver driver,String OfSprinklersthatOperated) {
		            BrowserActions.type(driver, inpOfSprinklersthatOperated,OfSprinklersthatOperated, "OfSprinklersthatOperated");
			        return this;
           }
public PropertyLiabilityPage clickAdd_40(WebDriver driver)  {
					BrowserActions.click(driver, btnAdd_40,"Add_40");
				    return this;
			}
public PropertyLiabilityPage enterActualCloseDate(WebDriver driver,String ActualCloseDate) {
		            BrowserActions.type(driver, inpActualCloseDate,ActualCloseDate, "ActualCloseDate");
			        return this;
           }
public PropertyLiabilityPage clickViewContactDetails_3(WebDriver driver)  {
					BrowserActions.click(driver, btnViewContactDetails_3,"ViewContactDetails_3");
				    return this;
			}
public PropertyLiabilityPage enterCity(WebDriver driver,String City) {
		            BrowserActions.type(driver, inpCity,City, "City");
			        return this;
           }
public PropertyLiabilityPage clickNewVendorCompany(WebDriver driver)  {
					BrowserActions.click(driver, btnNewVendorCompany,"NewVendorCompany");
				    return this;
			}
public PropertyLiabilityPage enterExtentofDamagetoProperty(WebDriver driver,String ExtentofDamagetoProperty) {
		            BrowserActions.type(driver, inpExtentofDamagetoProperty,ExtentofDamagetoProperty, "ExtentofDamagetoProperty");
			        return this;
           }
public PropertyLiabilityPage enterRequestedQuoteCompletionDate(WebDriver driver,String RequestedQuoteCompletionDate) {
		            BrowserActions.type(driver, inpRequestedQuoteCompletionDate,RequestedQuoteCompletionDate, "RequestedQuoteCompletionDate");
			        return this;
           }
public PropertyLiabilityPage clickMedicalCareOrganization(WebDriver driver)  {
					BrowserActions.click(driver, btnMedicalCareOrganization,"MedicalCareOrganization");
				    return this;
			}
public PropertyLiabilityPage clickOK(WebDriver driver)  {
					BrowserActions.click(driver, btnOK,"OK");
				    return this;
			}
public PropertyLiabilityPage clickSearch(WebDriver driver)  {
					BrowserActions.click(driver, btnSearch,"Search");
				    return this;
			}
public PropertyLiabilityPage enterPropertyDescription(WebDriver driver,String PropertyDescription) {
		            BrowserActions.type(driver, inpPropertyDescription,PropertyDescription, "PropertyDescription");
			        return this;
           }
public PropertyLiabilityPage clickAttorney(WebDriver driver)  {
					BrowserActions.click(driver, btnAttorney,"Attorney");
				    return this;
			}
public PropertyLiabilityPage clickInternalUser_NameMenuIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnInternalUser_NameMenuIcon,"InternalUser_NameMenuIcon");
				    return this;
			}
public PropertyLiabilityPage enterAddressSummary(WebDriver driver,String AddressSummary) {
		            BrowserActions.type(driver, inpAddressSummary,AddressSummary, "AddressSummary");
			        return this;
           }
public PropertyLiabilityPage enterAddressLine1(WebDriver driver,String AddressLine1) {
		            BrowserActions.type(driver, inpAddressLine1,AddressLine1, "AddressLine1");
			        return this;
           }
public PropertyLiabilityPage enterEstimatedRepairTime(WebDriver driver,String EstimatedRepairTime) {
		            BrowserActions.type(driver, inpEstimatedRepairTime,EstimatedRepairTime, "EstimatedRepairTime");
			        return this;
           }
public PropertyLiabilityPage clickAttorney_14(WebDriver driver)  {
					BrowserActions.click(driver, btnAttorney_14,"Attorney_14");
				    return this;
			}
public PropertyLiabilityPage clickDetails(WebDriver driver)  {
					BrowserActions.click(driver, btnDetails,"Details");
				    return this;
			}
public PropertyLiabilityPage clickAutoTowingAgency(WebDriver driver)  {
					BrowserActions.click(driver, btnAutoTowingAgency,"AutoTowingAgency");
				    return this;
			}
public PropertyLiabilityPage enterInvolving(WebDriver driver,String Involving) {
		            BrowserActions.type(driver, inpInvolving,Involving, "Involving");
			        return this;
           }
public PropertyLiabilityPage enterServiceAddressName(WebDriver driver,String ServiceAddressName) {
		            BrowserActions.type(driver, inpServiceAddressName,ServiceAddressName, "ServiceAddressName");
			        return this;
           }
public PropertyLiabilityPage enterAdditionalInstructions(WebDriver driver,String AdditionalInstructions) {
		            BrowserActions.type(driver, inpAdditionalInstructions,AdditionalInstructions, "AdditionalInstructions");
			        return this;
           }
public PropertyLiabilityPage clickLegalVenue_16(WebDriver driver)  {
					BrowserActions.click(driver, btnLegalVenue_16,"LegalVenue_16");
				    return this;
			}
public PropertyLiabilityPage clickEdit(WebDriver driver)  {
					BrowserActions.click(driver, btnEdit,"Edit");
				    return this;
			}
public PropertyLiabilityPage selectEstimateReceived(WebDriver driver,String EstimateReceived)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpEstimateReceived,EstimateReceived,"EstimateReceived");
				    return this;
			}
public PropertyLiabilityPage selectExteriorWallMaterial(WebDriver driver,String ExteriorWallMaterial)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpExteriorWallMaterial,ExteriorWallMaterial,"ExteriorWallMaterial");
				    return this;
			}
public PropertyLiabilityPage clickNewCompany_11(WebDriver driver)  {
					BrowserActions.click(driver, btnNewCompany_11,"NewCompany_11");
				    return this;
			}
public PropertyLiabilityPage clickDeny(WebDriver driver)  {
					BrowserActions.click(driver, btnDeny,"Deny");
				    return this;
			}
public PropertyLiabilityPage selectPropertyName(WebDriver driver,String PropertyName)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPropertyName,PropertyName,"PropertyName");
				    return this;
			}
public PropertyLiabilityPage clickLawFirm_15(WebDriver driver)  {
					BrowserActions.click(driver, btnLawFirm_15,"LawFirm_15");
				    return this;
			}
public PropertyLiabilityPage enterDamageDescription(WebDriver driver,String DamageDescription) {
		            BrowserActions.type(driver, inpDamageDescription,DamageDescription, "DamageDescription");
			        return this;
           }
public PropertyLiabilityPage enterLocationDescription_29(WebDriver driver,String LocationDescription_29) {
		            BrowserActions.type(driver, inpLocationDescription_29,LocationDescription_29, "LocationDescription_29");
			        return this;
           }
public PropertyLiabilityPage enterOfStories(WebDriver driver,String OfStories) {
		            BrowserActions.type(driver, inpOfStories,OfStories, "OfStories");
			        return this;
           }
public PropertyLiabilityPage clickCustomerContactMenuIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnCustomerContactMenuIcon,"CustomerContactMenuIcon");
				    return this;
			}
public PropertyLiabilityPage clickRemove(WebDriver driver)  {
					BrowserActions.click(driver, btnRemove,"Remove");
				    return this;
			}
public PropertyLiabilityPage clickNewPerson_4(WebDriver driver)  {
					BrowserActions.click(driver, btnNewPerson_4,"NewPerson_4");
				    return this;
			}
public PropertyLiabilityPage clickSearch_2(WebDriver driver)  {
					BrowserActions.click(driver, btnSearch_2,"Search_2");
				    return this;
			}
public PropertyLiabilityPage clickAutoTowingAgency_7(WebDriver driver)  {
					BrowserActions.click(driver, btnAutoTowingAgency_7,"AutoTowingAgency_7");
				    return this;
			}
public PropertyLiabilityPage clickValiduntilDateIcon_31(WebDriver driver)  {
					BrowserActions.click(driver, btnValiduntilDateIcon_31,"ValiduntilDateIcon_31");
				    return this;
			}
public PropertyLiabilityPage selectStatus(WebDriver driver,String Status)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpStatus,Status,"Status");
				    return this;
			}
public PropertyLiabilityPage clickNewCompany(WebDriver driver)  {
					BrowserActions.click(driver, btnNewCompany,"NewCompany");
				    return this;
			}
public PropertyLiabilityPage clickMedicalCareOrganization_9(WebDriver driver)  {
					BrowserActions.click(driver, btnMedicalCareOrganization_9,"MedicalCareOrganization_9");
				    return this;
			}
public PropertyLiabilityPage clickNewVendorPerson(WebDriver driver)  {
					BrowserActions.click(driver, btnNewVendorPerson,"NewVendorPerson");
				    return this;
			}
public PropertyLiabilityPage clickDoctor(WebDriver driver)  {
					BrowserActions.click(driver, btnDoctor,"Doctor");
				    return this;
			}
public PropertyLiabilityPage clickAssociateWith(WebDriver driver)  {
					BrowserActions.click(driver, btnAssociateWith,"AssociateWith");
				    return this;
			}
public PropertyLiabilityPage enterAddress3_21(WebDriver driver,String Address3_21) {
		            BrowserActions.type(driver, inpAddress3_21,Address3_21, "Address3_21");
			        return this;
           }
public PropertyLiabilityPage clickValiduntilDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnValiduntilDateIcon,"ValiduntilDateIcon");
				    return this;
			}
public PropertyLiabilityPage selectSource(WebDriver driver,String Source)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpSource,Source,"Source");
				    return this;
			}
public PropertyLiabilityPage clickRequestedQuoteCompletionDateDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnRequestedQuoteCompletionDateDateIcon,"RequestedQuoteCompletionDateDateIcon");
				    return this;
			}
public PropertyLiabilityPage selectTypeofOccupancy(WebDriver driver,String TypeofOccupancy)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpTypeofOccupancy,TypeofOccupancy,"TypeofOccupancy");
				    return this;
			}
public PropertyLiabilityPage enterZIPCode_26(WebDriver driver,String ZIPCode_26) {
		            BrowserActions.type(driver, inpZIPCode_26,ZIPCode_26, "ZIPCode_26");
			        return this;
           }
public PropertyLiabilityPage clickActualCloseDateDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnActualCloseDateDateIcon,"ActualCloseDateDateIcon");
				    return this;
			}
public PropertyLiabilityPage clickCancel(WebDriver driver)  {
					BrowserActions.click(driver, btnCancel,"Cancel");
				    return this;
			}
public PropertyLiabilityPage clickDoctor_8(WebDriver driver)  {
					BrowserActions.click(driver, btnDoctor_8,"Doctor_8");
				    return this;
			}
public PropertyLiabilityPage clickAssessor_PickerMenuIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnAssessor_PickerMenuIcon,"Assessor_PickerMenuIcon");
				    return this;
			}
public PropertyLiabilityPage clickAdd_34(WebDriver driver)  {
					BrowserActions.click(driver, btnAdd_34,"Add_34");
				    return this;
			}
public PropertyLiabilityPage clickAutoFillIcon_23(WebDriver driver)  {
					BrowserActions.click(driver, btnAutoFillIcon_23,"AutoFillIcon_23");
				    return this;
			}
public PropertyLiabilityPage enterCounty_24(WebDriver driver,String County_24) {
		            BrowserActions.type(driver, inpCounty_24,County_24, "County_24");
			        return this;
           }
public PropertyLiabilityPage clickAdd_38(WebDriver driver)  {
					BrowserActions.click(driver, btnAdd_38,"Add_38");
				    return this;
			}
public PropertyLiabilityPage clickAutoFillIcon_27(WebDriver driver)  {
					BrowserActions.click(driver, btnAutoFillIcon_27,"AutoFillIcon_27");
				    return this;
			}
public PropertyLiabilityPage clickAdd_36(WebDriver driver)  {
					BrowserActions.click(driver, btnAdd_36,"Add_36");
				    return this;
			}
public PropertyLiabilityPage clickAlreadyRepaired(WebDriver driver)  {
					BrowserActions.click(driver, rdbAlreadyRepaired,"AlreadyRepaired");
				    return this;
			}
}
