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

public class NewPropertyIncidentPage extends LoadableComponent<NewPropertyIncidentPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
 	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
	@IFindBy(how = How.CSS, using = "select[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-Assessor_Picker']", AI = false)
	public WebElement drpInitialAssessor;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-Owner-MenuItem_ViewDetails>div[role='menuitem']", AI = false)
	public WebElement btnViewContactDetails;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixPropIncidentAssessDV-FixPropContentItemLV_tb-Remove>div[role='button']", AI = false)
	public WebElement btnRemove_41;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-RequestedServiceCompletionDate_dateIcon", AI = false)
	public WebElement btnRequestedServiceCompletionDateDateIcon;

	@IFindBy(how = How.CSS, using = "select[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-Claim_JurisdictionState']", AI = false)
	public WebElement drpJurisdiction_33;

	@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-OtherServicesLVInputGroupInputSet-OtherServicesInputGroup-_checkbox']", AI = false)
	public WebElement chkOtherServices;

	@IFindBy(how = How.CSS, using = "select[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-PropertyAttributeInputSet-PropertyAttribute_SprinklerType']", AI = false)
	public WebElement drpSprinklerType;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixPropIncidentAssessDV-FixPropAssessSourceLV_tb-Remove>div[role='button']", AI = false)
	public WebElement btnRemove_37;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixPropIncidentAssessDV_tb-Remove>div[role='button']", AI = false)
	public WebElement btnRemove_35;

	@IFindBy(how = How.CSS, using = "select[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-State']", AI = false)
	public WebElement drpState_25;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixPropIncidentAssessDV-FixPropAssessItemLV_tb-Remove>div[role='button']", AI = false)
	public WebElement btnRemove_39;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-PostalCode-AutoFillIcon", AI = false)
	public WebElement btnAutoFillIcon_1;

	@IFindBy(how = How.CSS, using = "select[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-Owner']", AI = false)
	public WebElement drpOwner;

	@IFindBy(how = How.CSS, using = "select[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-CCAddressInputSet-globalAddressContainer-Claim_JurisdictionState']", AI = false)
	public WebElement drpJurisdiction;

	@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixPropIncidentAssessDV-General_Comment']", AI = false)
	public WebElement inpComment;

	@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-County']", AI = false)
	public WebElement inpCounty;

	@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-_checkbox']", AI = false)
	public WebElement chkAppraisal;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixPropIncidentAssessDV-TargetCloseDate_dateIcon", AI = false)
	public WebElement btnTargetCloseDateDateIcon;

	@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-CCAddressInputSet-globalAddressContainer-Claim_LocationCode']", AI = false)
	public WebElement inpLocationCode;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-CustomerContact-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal>div[role='menuitem']", AI = false)
	public WebElement btnNewLegal_12;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixPropIncidentAssessDV-InternalUser_Name-InternalUser_NameUserSearchMenuItem>div[role='menuitem']", AI = false)
	public WebElement btnSearchforaUser;

	@IFindBy(how = How.CSS, using = "select[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-PropertyAttributeInputSet-LossLocation_Mold']", AI = false)
	public WebElement drpMoldInvolved;

	@IFindBy(how = How.CSS, using = "select[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-PropertyAttributeInputSet-LossLocation_Hazard']", AI = false)
	public WebElement drpHazardousWasteInvolved;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-Incident_AssessmentTab", AI = false)
	public WebElement btnAssessment;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-Owner-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Adjudicator>div[role='menuitem']", AI = false)
	public WebElement btnAdjudicator;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-CustomerContact-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoRepairShop>div[role='menuitem']", AI = false)
	public WebElement btnAutobodyRepairShop_6;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-CustomerContact-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor>div[role='menuitem']", AI = false)
	public WebElement btnNewVendor_5;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-Owner-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewPerson>div[role='menuitem']", AI = false)
	public WebElement btnNewPerson;

	@IFindBy(how = How.CSS, using = "select[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-Country']", AI = false)
	public WebElement drpCountry_19;

	@IFindBy(how = How.CSS, using = "select[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixPropIncidentAssessDV-FixPropContentItemLV_tb-ContentSourceRange']", AI = false)
	public WebElement drpSource_44;

	@IFindBy(how = How.CSS, using = "select[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixPropIncidentAssessDV-InternalUser_Name']", AI = false)
	public WebElement drpInternalUser;

	@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-City']", AI = false)
	public WebElement inpCity_22;

	@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-Address_ValidUntil']", AI = false)
	public WebElement inpValiduntil_30;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixPropIncidentAssessDV-FixPropContentItemLV_tb-Deny>div[role='button']", AI = false)
	public WebElement btnDeny_43;

	@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-ServiceRequestSubmitMessage']", AI = false)
	public WebElement inpServiceRequestSubmitMessage;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-Owner-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoRepairShop>div[role='menuitem']", AI = false)
	public WebElement btnAutobodyRepairShop;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-CustomerContact-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Adjudicator>div[role='menuitem']", AI = false)
	public WebElement btnAdjudicator_13;

	@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressLine3']", AI = false)
	public WebElement inpAddress3;

	@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-CCAddressInputSet-globalAddressContainer-Address_Description']", AI = false)
	public WebElement inpLocationDescription;

	@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-RequestedServiceCompletionDate']", AI = false)
	public WebElement inpRequestedServiceCompletionDate;

	@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressLine1']", AI = false)
	public WebElement inpAddress1;

	@IFindBy(how = How.CSS, using = "select[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-CCAddressInputSet-globalAddressContainer-Address_AddressType']", AI = false)
	public WebElement drpAddressType;

	@IFindBy(how = How.CSS, using = "select[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-PropertyAttributeInputSet-PropertyAttribute_LossArea']", AI = false)
	public WebElement drpLossArea;

	@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressLine2']", AI = false)
	public WebElement inpAddress2;

	@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressLine2']", AI = false)
	public WebElement inpAddress2_20;

	@IFindBy(how = How.CSS, using = "select[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-Address_Picker']", AI = false)
	public WebElement drpLocation;

	@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-PropertyAttributeInputSet-PropertyAttribute_NumSprinkler']", AI = false)
	public WebElement inpTotalofSprinklers;

	@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressSummary']", AI = false)
	public WebElement inpPropertyName;

	@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-PostalCode']", AI = false)
	public WebElement inpZIPCode;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-City-AutoFillIcon", AI = false)
	public WebElement btnAutoFillIcon;

	@IFindBy(how = How.CSS, using = "select[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-CustomerContact']", AI = false)
	public WebElement drpCustomerContact;

	@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-CCAddressInputSet-globalAddressContainer-Address_ValidUntil']", AI = false)
	public WebElement inpValiduntil;

	@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixPropIncidentAssessDV-IncludeContentsLineItems']", AI = false)
	public WebElement rdbToContents;

	@IFindBy(how = How.CSS, using = "select[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-Address_AddressType']", AI = false)
	public WebElement drpAddressType_28;

	@IFindBy(how = How.CSS, using = "select[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-PropertyAttributeInputSet-PropertyAttribute_RoofMaterial']", AI = false)
	public WebElement drpRoofCoveringMaterials;

	@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixPropIncidentAssessDV-TargetCloseDate']", AI = false)
	public WebElement inpTargetCloseDate;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-Owner-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor>div[role='menuitem']", AI = false)
	public WebElement btnNewVendor;

	@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-Claim_LocationCode']", AI = false)
	public WebElement inpLocationCode_32;

	@IFindBy(how = How.CSS, using = "select[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-EstDamageAmt']", AI = false)
	public WebElement drpEstimateofDamage;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-Owner-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_CompanyVendor>div[role='menuitem']", AI = false)
	public WebElement btnVendorCompany;

	@IFindBy(how = How.CSS, using = "select[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-Country']", AI = false)
	public WebElement drpCountry;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixPropIncidentAssessDV-InternalUser_Name-InternalUser_NameUserSelectMenuItem>div[role='menuitem']", AI = false)
	public WebElement btnSelectUser;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-Owner-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_LawFirm>div[role='menuitem']", AI = false)
	public WebElement btnLawFirm;

	@IFindBy(how = How.CSS, using = "select[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-PropertyAttributeInputSet-PropertyAttribute_ClassType']", AI = false)
	public WebElement drpClassType;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-Owner-OwnerMenuIcon>div[role='button']", AI = false)
	public WebElement btnOwnerMenuIcon;

	@IFindBy(how = How.CSS, using = "select[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-State']", AI = false)
	public WebElement drpState;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-Owner-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal>div[role='menuitem']", AI = false)
	public WebElement btnNewLegal;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-OtherServicesLVInputGroupInputSet-OtherServicesInputGroup-OtherServicesLVInputSet-OtherServicesLV_tb-AddServiceRequest>div[role='button']", AI = false)
	public WebElement btnAdd;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-Owner-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_NewLegalVenue>div[role='menuitem']", AI = false)
	public WebElement btnLegalVenue;

	@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-ServiceRequestSubmitMessageFNOL']", AI = false)
	public WebElement inpServiceRequestSubmitMessageFNOL;

	@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixPropIncidentAssessDV-IncludeLineItems']", AI = false)
	public WebElement rdbToBuilding;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-CustomerContact-MenuItem_Search>div[role='menuitem']", AI = false)
	public WebElement btnSearch_17;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-__crumb__", AI = false)
	public WebElement btnReturntoNewExposureProperty;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-CustomerContact-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_CompanyVendor>div[role='menuitem']", AI = false)
	public WebElement btnVendorCompany_10;

	@IFindBy(how = How.CSS, using = "select[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressPicker']", AI = false)
	public WebElement drpAppraisalLocation;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixPropIncidentAssessDV-FixPropAssessItemLV_tb-Approve>div[role='button']", AI = false)
	public WebElement btnApprove;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-CustomerContact-MenuItem_ViewDetails>div[role='menuitem']", AI = false)
	public WebElement btnViewContactDetails_18;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixPropIncidentAssessDV-FixPropContentItemLV_tb-ApproveContent>div[role='button']", AI = false)
	public WebElement btnApprove_42;

	@IFindBy(how = How.CSS, using = "select[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-PropertyAttributeInputSet-PropertyAttribute_SprinkRetServ']", AI = false)
	public WebElement drpSprinklersReturnedtoService;

	@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixPropIncidentAssessDV-General_Description']", AI = false)
	public WebElement inpDescription;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixPropIncidentAssessDV-FixPropContentItemLV_tb-AssociateContent>div[role='button']", AI = false)
	public WebElement btnAssociateWith_45;

	@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-PropertyAttributeInputSet-PropertyAttribute_NumSprinkOper']", AI = false)
	public WebElement inpOfSprinklersthatOperated;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixPropIncidentAssessDV-FixPropContentItemLV_tb-Add>div[role='button']", AI = false)
	public WebElement btnAdd_40;

	@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixPropIncidentAssessDV-CloseDate']", AI = false)
	public WebElement inpActualCloseDate;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-Assessor_Picker-MenuItem_ViewDetails>div[role='menuitem']", AI = false)
	public WebElement btnViewContactDetails_3;

	@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-City']", AI = false)
	public WebElement inpCity;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-Assessor_Picker-ClaimNewVendorOnlyPickerMenuItemSet-NewContactPickerMenuItemSet_CompanyVendor>div[role='menuitem']", AI = false)
	public WebElement btnNewVendorCompany;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-ExtDamagetxt textarea", AI = false)
	public WebElement inpExtentofDamagetoProperty;

	@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-RequestedQuoteCompletionDate']", AI = false)
	public WebElement inpRequestedQuoteCompletionDate;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-Owner-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_MedicalCareOrg>div[role='menuitem']", AI = false)
	public WebElement btnMedicalCareOrganization;

	@IFindBy(how = How.CSS, using = "div[id$='Update']", AI = false)
	public WebElement btnOK;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-Owner-MenuItem_Search>div[role='menuitem']", AI = false)
	public WebElement btnSearch;

	@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-PropertyDescription']", AI = false)
	public WebElement inpPropertyDescription;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-Owner-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Attorney>div[role='menuitem']", AI = false)
	public WebElement btnAttorney;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixPropIncidentAssessDV-InternalUser_Name-InternalUser_NameMenuIcon>div[role='button']", AI = false)
	public WebElement btnInternalUser_NameMenuIcon;

	@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressSummary']", AI = false)
	public WebElement inpAddressSummary;

	@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressLine1']", AI = false)
	public WebElement inpAddressLine1;

	@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-EstimateTime']", AI = false)
	public WebElement inpEstimatedRepairTime;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-CustomerContact-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Attorney>div[role='menuitem']", AI = false)
	public WebElement btnAttorney_14;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-Vehicle_DetailsCardTab", AI = false)
	public WebElement btnDetails;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-Owner-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoTowingAgcy>div[role='menuitem']", AI = false)
	public WebElement btnAutoTowingAgency;

	@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixPropIncidentAssessDV-Display_Name']", AI = false)
	public WebElement inpInvolving;

	@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressName']", AI = false)
	public WebElement inpServiceAddressName;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-InstructionText textarea", AI = false)
	public WebElement inpAdditionalInstructions;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-CustomerContact-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_NewLegalVenue>div[role='menuitem']", AI = false)
	public WebElement btnLegalVenue_16;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-Edit>div[role='button']", AI = false)
	public WebElement btnEdit;

	@IFindBy(how = How.CSS, using = "select[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-EstimatedReceived']", AI = false)
	public WebElement drpEstimateReceived;

	@IFindBy(how = How.CSS, using = "select[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-PropertyAttributeInputSet-PropertyAttribute_ExtWallMat']", AI = false)
	public WebElement drpExteriorWallMaterial;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-CustomerContact-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewCompany>div[role='menuitem']", AI = false)
	public WebElement btnNewCompany_11;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixPropIncidentAssessDV-FixPropAssessItemLV_tb-Deny>div[role='button']", AI = false)
	public WebElement btnDeny;

	@IFindBy(how = How.CSS, using = "select[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-CCAddressInputSet-globalAddressContainer-Address_Picker']", AI = false)
	public WebElement drpPropertyName;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-CustomerContact-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_LawFirm>div[role='menuitem']", AI = false)
	public WebElement btnLawFirm_15;

	@IFindBy(how = How.CSS, using = "textarea[name$='Description']", AI = false)
	public WebElement inpDamageDescription;

	@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-Address_Description']", AI = false)
	public WebElement inpLocationDescription_29;

	@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-PropertyAttributeInputSet-PropertyAttribute_NumStories']", AI = false)
	public WebElement inpOfStories;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-CustomerContact-CustomerContactMenuIcon>div[role='button']", AI = false)
	public WebElement btnCustomerContactMenuIcon;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-OtherServicesLVInputGroupInputSet-OtherServicesInputGroup-OtherServicesLVInputSet-OtherServicesLV_tb-Remove>div[role='button']", AI = false)
	public WebElement btnRemove;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-CustomerContact-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewPerson>div[role='menuitem']", AI = false)
	public WebElement btnNewPerson_4;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-Assessor_Picker-MenuItem_Search>div[role='menuitem']", AI = false)
	public WebElement btnSearch_2;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-CustomerContact-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoTowingAgcy>div[role='menuitem']", AI = false)
	public WebElement btnAutoTowingAgency_7;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-Address_ValidUntil_dateIcon", AI = false)
	public WebElement btnValiduntilDateIcon_31;

	@IFindBy(how = How.CSS, using = "select[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixPropIncidentAssessDV-Status']", AI = false)
	public WebElement drpStatus;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-Owner-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewCompany>div[role='menuitem']", AI = false)
	public WebElement btnNewCompany;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-CustomerContact-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_MedicalCareOrg>div[role='menuitem']", AI = false)
	public WebElement btnMedicalCareOrganization_9;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-Assessor_Picker-ClaimNewVendorOnlyPickerMenuItemSet-NewContactPickerMenuItemSet_PersonVendor>div[role='menuitem']", AI = false)
	public WebElement btnNewVendorPerson;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-Owner-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_Doctor>div[role='menuitem']", AI = false)
	public WebElement btnDoctor;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixPropIncidentAssessDV-FixPropAssessItemLV_tb-Associate>div[role='button']", AI = false)
	public WebElement btnAssociateWith;

	@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressLine3']", AI = false)
	public WebElement inpAddress3_21;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-CCAddressInputSet-globalAddressContainer-Address_ValidUntil_dateIcon", AI = false)
	public WebElement btnValiduntilDateIcon;

	@IFindBy(how = How.CSS, using = "select[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixPropIncidentAssessDV-FixPropAssessItemLV_tb-SourceRange']", AI = false)
	public WebElement drpSource;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-RequestedQuoteCompletionDate_dateIcon", AI = false)
	public WebElement btnRequestedQuoteCompletionDateDateIcon;

	@IFindBy(how = How.CSS, using = "select[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-PropertyAttributeInputSet-OccupancyType']", AI = false)
	public WebElement drpTypeofOccupancy;

	@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-PostalCode']", AI = false)
	public WebElement inpZIPCode_26;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixPropIncidentAssessDV-CloseDate_dateIcon", AI = false)
	public WebElement btnActualCloseDateDateIcon;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-Cancel>div[role='button']", AI = false)
	public WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-CustomerContact-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_Doctor>div[role='menuitem']", AI = false)
	public WebElement btnDoctor_8;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-Assessor_Picker-Assessor_PickerMenuIcon>div[role='button']", AI = false)
	public WebElement btnAssessor_PickerMenuIcon;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixPropIncidentAssessDV_tb-Add>div[role='button']", AI = false)
	public WebElement btnAdd_34;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-City-AutoFillIcon", AI = false)
	public WebElement btnAutoFillIcon_23;

	@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-County']", AI = false)
	public WebElement inpCounty_24;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixPropIncidentAssessDV-FixPropAssessItemLV_tb-Add>div[role='button']", AI = false)
	public WebElement btnAdd_38;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AppraisalServiceInputSet-AppraisalServiceInputSet-AppraisalServiceInputGroup-OtherServiceRequestInfo-NewServiceRequestInstructionInputSet-ServiceAddressFields-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-PostalCode-AutoFillIcon", AI = false)
	public WebElement btnAutoFillIcon_27;

	@IFindBy(how = How.CSS, using = "#NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixPropIncidentAssessDV-FixPropAssessSourceLV_tb-Add>div[role='button']", AI = false)
	public WebElement btnAdd_36;

	@IFindBy(how = How.CSS, using = "input[name='NewFixedPropertyIncidentPopup-NewFixedPropertyIncidentScreen-FixPropIncidentDetailDV-FixedPropertyIncidentDV-AlreadyRepaired']", AI = false)
	public WebElement rdbAlreadyRepaired;

	public NewPropertyIncidentPage(){
	}

	public NewPropertyIncidentPage(WebDriver driver) {
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
}public NewPropertyIncidentPage selectInitialAssessor(WebDriver driver,String InitialAssessor)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpInitialAssessor,InitialAssessor,"InitialAssessor");
				    return this;
			}
public NewPropertyIncidentPage clickViewContactDetails(WebDriver driver)  {
					BrowserActions.click(driver, btnViewContactDetails,"ViewContactDetails");
				    return this;
			}
public NewPropertyIncidentPage clickRemove_41(WebDriver driver)  {
					BrowserActions.click(driver, btnRemove_41,"Remove_41");
				    return this;
			}
public NewPropertyIncidentPage clickRequestedServiceCompletionDateDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnRequestedServiceCompletionDateDateIcon,"RequestedServiceCompletionDateDateIcon");
				    return this;
			}
public NewPropertyIncidentPage selectJurisdiction_33(WebDriver driver,String Jurisdiction_33)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpJurisdiction_33,Jurisdiction_33,"Jurisdiction_33");
				    return this;
			}
public NewPropertyIncidentPage clickOtherServices(WebDriver driver)  {
					BrowserActions.click(driver, chkOtherServices,"OtherServices");
				    return this;
			}
public NewPropertyIncidentPage selectSprinklerType(WebDriver driver,String SprinklerType)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpSprinklerType,SprinklerType,"SprinklerType");
				    return this;
			}
public NewPropertyIncidentPage clickRemove_37(WebDriver driver)  {
					BrowserActions.click(driver, btnRemove_37,"Remove_37");
				    return this;
			}
public NewPropertyIncidentPage clickRemove_35(WebDriver driver)  {
					BrowserActions.click(driver, btnRemove_35,"Remove_35");
				    return this;
			}
public NewPropertyIncidentPage selectState_25(WebDriver driver,String State_25)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpState_25,State_25,"State_25");
				    return this;
			}
public NewPropertyIncidentPage clickRemove_39(WebDriver driver)  {
					BrowserActions.click(driver, btnRemove_39,"Remove_39");
				    return this;
			}
public NewPropertyIncidentPage clickAutoFillIcon_1(WebDriver driver)  {
					BrowserActions.click(driver, btnAutoFillIcon_1,"AutoFillIcon_1");
				    return this;
			}
public NewPropertyIncidentPage selectOwner(WebDriver driver,String Owner)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpOwner,Owner,"Owner");
				    return this;
			}
public NewPropertyIncidentPage selectJurisdiction(WebDriver driver,String Jurisdiction)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpJurisdiction,Jurisdiction,"Jurisdiction");
				    return this;
			}
public NewPropertyIncidentPage enterComment(WebDriver driver,String Comment) {
		            BrowserActions.type(driver, inpComment,Comment, "Comment");
			        return this;
           }
public NewPropertyIncidentPage enterCounty(WebDriver driver,String County) {
		            BrowserActions.type(driver, inpCounty,County, "County");
			        return this;
           }
public NewPropertyIncidentPage clickAppraisal(WebDriver driver)  {
					BrowserActions.click(driver, chkAppraisal,"Appraisal");
				    return this;
			}
public NewPropertyIncidentPage clickTargetCloseDateDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnTargetCloseDateDateIcon,"TargetCloseDateDateIcon");
				    return this;
			}
public NewPropertyIncidentPage enterLocationCode(WebDriver driver,String LocationCode) {
		            BrowserActions.type(driver, inpLocationCode,LocationCode, "LocationCode");
			        return this;
           }
public NewPropertyIncidentPage clickNewLegal_12(WebDriver driver)  {
					BrowserActions.click(driver, btnNewLegal_12,"NewLegal_12");
				    return this;
			}
public NewPropertyIncidentPage clickSearchforaUser(WebDriver driver)  {
					BrowserActions.click(driver, btnSearchforaUser,"SearchforaUser");
				    return this;
			}
public NewPropertyIncidentPage selectMoldInvolved(WebDriver driver,String MoldInvolved)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpMoldInvolved,MoldInvolved,"MoldInvolved");
				    return this;
			}
public NewPropertyIncidentPage selectHazardousWasteInvolved(WebDriver driver,String HazardousWasteInvolved)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpHazardousWasteInvolved,HazardousWasteInvolved,"HazardousWasteInvolved");
				    return this;
			}
public NewPropertyIncidentPage clickAssessment(WebDriver driver)  {
					BrowserActions.click(driver, btnAssessment,"Assessment");
				    return this;
			}
public NewPropertyIncidentPage clickAdjudicator(WebDriver driver)  {
					BrowserActions.click(driver, btnAdjudicator,"Adjudicator");
				    return this;
			}
public NewPropertyIncidentPage clickAutobodyRepairShop_6(WebDriver driver)  {
					BrowserActions.click(driver, btnAutobodyRepairShop_6,"AutobodyRepairShop_6");
				    return this;
			}
public NewPropertyIncidentPage clickNewVendor_5(WebDriver driver)  {
					BrowserActions.click(driver, btnNewVendor_5,"NewVendor_5");
				    return this;
			}
public NewPropertyIncidentPage clickNewPerson(WebDriver driver)  {
					BrowserActions.click(driver, btnNewPerson,"NewPerson");
				    return this;
			}
public NewPropertyIncidentPage selectCountry_19(WebDriver driver,String Country_19)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpCountry_19,Country_19,"Country_19");
				    return this;
			}
public NewPropertyIncidentPage selectSource_44(WebDriver driver,String Source_44)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpSource_44,Source_44,"Source_44");
				    return this;
			}
public NewPropertyIncidentPage selectInternalUser(WebDriver driver,String InternalUser)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpInternalUser,InternalUser,"InternalUser");
				    return this;
			}
public NewPropertyIncidentPage enterCity_22(WebDriver driver,String City_22) {
		            BrowserActions.type(driver, inpCity_22,City_22, "City_22");
			        return this;
           }
public NewPropertyIncidentPage enterValiduntil_30(WebDriver driver,String Validuntil_30) {
		            BrowserActions.type(driver, inpValiduntil_30,Validuntil_30, "Validuntil_30");
			        return this;
           }
public NewPropertyIncidentPage clickDeny_43(WebDriver driver)  {
					BrowserActions.click(driver, btnDeny_43,"Deny_43");
				    return this;
			}
public NewPropertyIncidentPage enterServiceRequestSubmitMessage(WebDriver driver,String ServiceRequestSubmitMessage) {
		            BrowserActions.type(driver, inpServiceRequestSubmitMessage,ServiceRequestSubmitMessage, "ServiceRequestSubmitMessage");
			        return this;
           }
public NewPropertyIncidentPage clickAutobodyRepairShop(WebDriver driver)  {
					BrowserActions.click(driver, btnAutobodyRepairShop,"AutobodyRepairShop");
				    return this;
			}
public NewPropertyIncidentPage clickAdjudicator_13(WebDriver driver)  {
					BrowserActions.click(driver, btnAdjudicator_13,"Adjudicator_13");
				    return this;
			}
public NewPropertyIncidentPage enterAddress3(WebDriver driver,String Address3) {
		            BrowserActions.type(driver, inpAddress3,Address3, "Address3");
			        return this;
           }
public NewPropertyIncidentPage enterLocationDescription(WebDriver driver,String LocationDescription) {
		            BrowserActions.type(driver, inpLocationDescription,LocationDescription, "LocationDescription");
			        return this;
           }
public NewPropertyIncidentPage enterRequestedServiceCompletionDate(WebDriver driver,String RequestedServiceCompletionDate) {
		            BrowserActions.type(driver, inpRequestedServiceCompletionDate,RequestedServiceCompletionDate, "RequestedServiceCompletionDate");
			        return this;
           }
public NewPropertyIncidentPage enterAddress1(WebDriver driver,String Address1) {
		            BrowserActions.type(driver, inpAddress1,Address1, "Address1");
			        return this;
           }
public NewPropertyIncidentPage selectAddressType(WebDriver driver,String AddressType)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpAddressType,AddressType,"AddressType");
				    return this;
			}
public NewPropertyIncidentPage selectLossArea(WebDriver driver,String LossArea)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpLossArea,LossArea,"LossArea");
				    return this;
			}
public NewPropertyIncidentPage enterAddress2(WebDriver driver,String Address2) {
		            BrowserActions.type(driver, inpAddress2,Address2, "Address2");
			        return this;
           }
public NewPropertyIncidentPage enterAddress2_20(WebDriver driver,String Address2_20) {
		            BrowserActions.type(driver, inpAddress2_20,Address2_20, "Address2_20");
			        return this;
           }
public NewPropertyIncidentPage selectLocation(WebDriver driver,String Location)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpLocation,Location,"Location");
				    return this;
			}
public NewPropertyIncidentPage enterTotalofSprinklers(WebDriver driver,String TotalofSprinklers) {
		            BrowserActions.type(driver, inpTotalofSprinklers,TotalofSprinklers, "TotalofSprinklers");
			        return this;
           }
public NewPropertyIncidentPage enterPropertyName(WebDriver driver,String PropertyName) {
		            BrowserActions.type(driver, inpPropertyName,PropertyName, "PropertyName");
			        return this;
           }
public NewPropertyIncidentPage enterZIPCode(WebDriver driver,String ZIPCode) {
		            BrowserActions.type(driver, inpZIPCode,ZIPCode, "ZIPCode");
			        return this;
           }
public NewPropertyIncidentPage clickAutoFillIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnAutoFillIcon,"AutoFillIcon");
				    return this;
			}
public NewPropertyIncidentPage selectCustomerContact(WebDriver driver,String CustomerContact)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpCustomerContact,CustomerContact,"CustomerContact");
				    return this;
			}
public NewPropertyIncidentPage enterValiduntil(WebDriver driver,String Validuntil) {
		            BrowserActions.type(driver, inpValiduntil,Validuntil, "Validuntil");
			        return this;
           }
public NewPropertyIncidentPage clickToContents(WebDriver driver)  {
					BrowserActions.click(driver, rdbToContents,"ToContents");
				    return this;
			}
public NewPropertyIncidentPage selectAddressType_28(WebDriver driver,String AddressType_28)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpAddressType_28,AddressType_28,"AddressType_28");
				    return this;
			}
public NewPropertyIncidentPage selectRoofCoveringMaterials(WebDriver driver,String RoofCoveringMaterials)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpRoofCoveringMaterials,RoofCoveringMaterials,"RoofCoveringMaterials");
				    return this;
			}
public NewPropertyIncidentPage enterTargetCloseDate(WebDriver driver,String TargetCloseDate) {
		            BrowserActions.type(driver, inpTargetCloseDate,TargetCloseDate, "TargetCloseDate");
			        return this;
           }
public NewPropertyIncidentPage clickNewVendor(WebDriver driver)  {
					BrowserActions.click(driver, btnNewVendor,"NewVendor");
				    return this;
			}
public NewPropertyIncidentPage enterLocationCode_32(WebDriver driver,String LocationCode_32) {
		            BrowserActions.type(driver, inpLocationCode_32,LocationCode_32, "LocationCode_32");
			        return this;
           }
public NewPropertyIncidentPage selectEstimateofDamage(WebDriver driver,String EstimateofDamage)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpEstimateofDamage,EstimateofDamage,"EstimateofDamage");
				    return this;
			}
public NewPropertyIncidentPage clickVendorCompany(WebDriver driver)  {
					BrowserActions.click(driver, btnVendorCompany,"VendorCompany");
				    return this;
			}
public NewPropertyIncidentPage selectCountry(WebDriver driver,String Country)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpCountry,Country,"Country");
				    return this;
			}
public NewPropertyIncidentPage clickSelectUser(WebDriver driver)  {
					BrowserActions.click(driver, btnSelectUser,"SelectUser");
				    return this;
			}
public NewPropertyIncidentPage clickLawFirm(WebDriver driver)  {
					BrowserActions.click(driver, btnLawFirm,"LawFirm");
				    return this;
			}
public NewPropertyIncidentPage selectClassType(WebDriver driver,String ClassType)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpClassType,ClassType,"ClassType");
				    return this;
			}
public NewPropertyIncidentPage clickOwnerMenuIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnOwnerMenuIcon,"OwnerMenuIcon");
				    return this;
			}
public NewPropertyIncidentPage selectState(WebDriver driver,String State)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpState,State,"State");
				    return this;
			}
public NewPropertyIncidentPage clickNewLegal(WebDriver driver)  {
					BrowserActions.click(driver, btnNewLegal,"NewLegal");
				    return this;
			}
public NewPropertyIncidentPage clickAdd(WebDriver driver)  {
					BrowserActions.click(driver, btnAdd,"Add");
				    return this;
			}
public NewPropertyIncidentPage clickLegalVenue(WebDriver driver)  {
					BrowserActions.click(driver, btnLegalVenue,"LegalVenue");
				    return this;
			}
public NewPropertyIncidentPage enterServiceRequestSubmitMessageFNOL(WebDriver driver,String ServiceRequestSubmitMessageFNOL) {
		            BrowserActions.type(driver, inpServiceRequestSubmitMessageFNOL,ServiceRequestSubmitMessageFNOL, "ServiceRequestSubmitMessageFNOL");
			        return this;
           }
public NewPropertyIncidentPage clickToBuilding(WebDriver driver)  {
					BrowserActions.click(driver, rdbToBuilding,"ToBuilding");
				    return this;
			}
public NewPropertyIncidentPage clickSearch_17(WebDriver driver)  {
					BrowserActions.click(driver, btnSearch_17,"Search_17");
				    return this;
			}
public NewPropertyIncidentPage clickReturntoNewExposureProperty(WebDriver driver)  {
					BrowserActions.click(driver, btnReturntoNewExposureProperty,"ReturntoNewExposureProperty");
				    return this;
			}
public NewPropertyIncidentPage clickVendorCompany_10(WebDriver driver)  {
					BrowserActions.click(driver, btnVendorCompany_10,"VendorCompany_10");
				    return this;
			}
public NewPropertyIncidentPage selectAppraisalLocation(WebDriver driver,String AppraisalLocation)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpAppraisalLocation,AppraisalLocation,"AppraisalLocation");
				    return this;
			}
public NewPropertyIncidentPage clickApprove(WebDriver driver)  {
					BrowserActions.click(driver, btnApprove,"Approve");
				    return this;
			}
public NewPropertyIncidentPage clickViewContactDetails_18(WebDriver driver)  {
					BrowserActions.click(driver, btnViewContactDetails_18,"ViewContactDetails_18");
				    return this;
			}
public NewPropertyIncidentPage clickApprove_42(WebDriver driver)  {
					BrowserActions.click(driver, btnApprove_42,"Approve_42");
				    return this;
			}
public NewPropertyIncidentPage selectSprinklersReturnedtoService(WebDriver driver,String SprinklersReturnedtoService)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpSprinklersReturnedtoService,SprinklersReturnedtoService,"SprinklersReturnedtoService");
				    return this;
			}
public NewPropertyIncidentPage enterDescription(WebDriver driver,String Description) {
		            BrowserActions.type(driver, inpDescription,Description, "Description");
			        return this;
           }
public NewPropertyIncidentPage clickAssociateWith_45(WebDriver driver)  {
					BrowserActions.click(driver, btnAssociateWith_45,"AssociateWith_45");
				    return this;
			}
public NewPropertyIncidentPage enterOfSprinklersthatOperated(WebDriver driver,String OfSprinklersthatOperated) {
		            BrowserActions.type(driver, inpOfSprinklersthatOperated,OfSprinklersthatOperated, "OfSprinklersthatOperated");
			        return this;
           }
public NewPropertyIncidentPage clickAdd_40(WebDriver driver)  {
					BrowserActions.click(driver, btnAdd_40,"Add_40");
				    return this;
			}
public NewPropertyIncidentPage enterActualCloseDate(WebDriver driver,String ActualCloseDate) {
		            BrowserActions.type(driver, inpActualCloseDate,ActualCloseDate, "ActualCloseDate");
			        return this;
           }
public NewPropertyIncidentPage clickViewContactDetails_3(WebDriver driver)  {
					BrowserActions.click(driver, btnViewContactDetails_3,"ViewContactDetails_3");
				    return this;
			}
public NewPropertyIncidentPage enterCity(WebDriver driver,String City) {
		            BrowserActions.type(driver, inpCity,City, "City");
			        return this;
           }
public NewPropertyIncidentPage clickNewVendorCompany(WebDriver driver)  {
					BrowserActions.click(driver, btnNewVendorCompany,"NewVendorCompany");
				    return this;
			}
public NewPropertyIncidentPage enterExtentofDamagetoProperty(WebDriver driver,String ExtentofDamagetoProperty) {
		            BrowserActions.type(driver, inpExtentofDamagetoProperty,ExtentofDamagetoProperty, "ExtentofDamagetoProperty");
			        return this;
           }
public NewPropertyIncidentPage enterRequestedQuoteCompletionDate(WebDriver driver,String RequestedQuoteCompletionDate) {
		            BrowserActions.type(driver, inpRequestedQuoteCompletionDate,RequestedQuoteCompletionDate, "RequestedQuoteCompletionDate");
			        return this;
           }
public NewPropertyIncidentPage clickMedicalCareOrganization(WebDriver driver)  {
					BrowserActions.click(driver, btnMedicalCareOrganization,"MedicalCareOrganization");
				    return this;
			}
public NewPropertyIncidentPage clickOK(WebDriver driver)  {
					BrowserActions.click(driver, btnOK,"OK");
				    return this;
			}
public NewPropertyIncidentPage clickSearch(WebDriver driver)  {
					BrowserActions.click(driver, btnSearch,"Search");
				    return this;
			}
public NewPropertyIncidentPage enterPropertyDescription(WebDriver driver,String PropertyDescription) {
		            BrowserActions.type(driver, inpPropertyDescription,PropertyDescription, "PropertyDescription");
			        return this;
           }
public NewPropertyIncidentPage clickAttorney(WebDriver driver)  {
					BrowserActions.click(driver, btnAttorney,"Attorney");
				    return this;
			}
public NewPropertyIncidentPage clickInternalUser_NameMenuIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnInternalUser_NameMenuIcon,"InternalUser_NameMenuIcon");
				    return this;
			}
public NewPropertyIncidentPage enterAddressSummary(WebDriver driver,String AddressSummary) {
		            BrowserActions.type(driver, inpAddressSummary,AddressSummary, "AddressSummary");
			        return this;
           }
public NewPropertyIncidentPage enterAddressLine1(WebDriver driver,String AddressLine1) {
		            BrowserActions.type(driver, inpAddressLine1,AddressLine1, "AddressLine1");
			        return this;
           }
public NewPropertyIncidentPage enterEstimatedRepairTime(WebDriver driver,String EstimatedRepairTime) {
		            BrowserActions.type(driver, inpEstimatedRepairTime,EstimatedRepairTime, "EstimatedRepairTime");
			        return this;
           }
public NewPropertyIncidentPage clickAttorney_14(WebDriver driver)  {
					BrowserActions.click(driver, btnAttorney_14,"Attorney_14");
				    return this;
			}
public NewPropertyIncidentPage clickDetails(WebDriver driver)  {
					BrowserActions.click(driver, btnDetails,"Details");
				    return this;
			}
public NewPropertyIncidentPage clickAutoTowingAgency(WebDriver driver)  {
					BrowserActions.click(driver, btnAutoTowingAgency,"AutoTowingAgency");
				    return this;
			}
public NewPropertyIncidentPage enterInvolving(WebDriver driver,String Involving) {
		            BrowserActions.type(driver, inpInvolving,Involving, "Involving");
			        return this;
           }
public NewPropertyIncidentPage enterServiceAddressName(WebDriver driver,String ServiceAddressName) {
		            BrowserActions.type(driver, inpServiceAddressName,ServiceAddressName, "ServiceAddressName");
			        return this;
           }
public NewPropertyIncidentPage enterAdditionalInstructions(WebDriver driver,String AdditionalInstructions) {
		            BrowserActions.type(driver, inpAdditionalInstructions,AdditionalInstructions, "AdditionalInstructions");
			        return this;
           }
public NewPropertyIncidentPage clickLegalVenue_16(WebDriver driver)  {
					BrowserActions.click(driver, btnLegalVenue_16,"LegalVenue_16");
				    return this;
			}
public NewPropertyIncidentPage clickEdit(WebDriver driver)  {
					BrowserActions.click(driver, btnEdit,"Edit");
				    return this;
			}
public NewPropertyIncidentPage selectEstimateReceived(WebDriver driver,String EstimateReceived)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpEstimateReceived,EstimateReceived,"EstimateReceived");
				    return this;
			}
public NewPropertyIncidentPage selectExteriorWallMaterial(WebDriver driver,String ExteriorWallMaterial)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpExteriorWallMaterial,ExteriorWallMaterial,"ExteriorWallMaterial");
				    return this;
			}
public NewPropertyIncidentPage clickNewCompany_11(WebDriver driver)  {
					BrowserActions.click(driver, btnNewCompany_11,"NewCompany_11");
				    return this;
			}
public NewPropertyIncidentPage clickDeny(WebDriver driver)  {
					BrowserActions.click(driver, btnDeny,"Deny");
				    return this;
			}
public NewPropertyIncidentPage selectPropertyName(WebDriver driver)  {
					BrowserActions.selectDropDownByIndex(driver, drpPropertyName,1,"PropertyName");
				    return this;
			}
public NewPropertyIncidentPage clickLawFirm_15(WebDriver driver)  {
					BrowserActions.click(driver, btnLawFirm_15,"LawFirm_15");
				    return this;
			}
public NewPropertyIncidentPage enterDamageDescription(WebDriver driver,String DamageDescription) {
		            BrowserActions.type(driver, inpDamageDescription,DamageDescription, "DamageDescription");
			        return this;
           }
public NewPropertyIncidentPage enterLocationDescription_29(WebDriver driver,String LocationDescription_29) {
		            BrowserActions.type(driver, inpLocationDescription_29,LocationDescription_29, "LocationDescription_29");
			        return this;
           }
public NewPropertyIncidentPage enterOfStories(WebDriver driver,String OfStories) {
		            BrowserActions.type(driver, inpOfStories,OfStories, "OfStories");
			        return this;
           }
public NewPropertyIncidentPage clickCustomerContactMenuIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnCustomerContactMenuIcon,"CustomerContactMenuIcon");
				    return this;
			}
public NewPropertyIncidentPage clickRemove(WebDriver driver)  {
					BrowserActions.click(driver, btnRemove,"Remove");
				    return this;
			}
public NewPropertyIncidentPage clickNewPerson_4(WebDriver driver)  {
					BrowserActions.click(driver, btnNewPerson_4,"NewPerson_4");
				    return this;
			}
public NewPropertyIncidentPage clickSearch_2(WebDriver driver)  {
					BrowserActions.click(driver, btnSearch_2,"Search_2");
				    return this;
			}
public NewPropertyIncidentPage clickAutoTowingAgency_7(WebDriver driver)  {
					BrowserActions.click(driver, btnAutoTowingAgency_7,"AutoTowingAgency_7");
				    return this;
			}
public NewPropertyIncidentPage clickValiduntilDateIcon_31(WebDriver driver)  {
					BrowserActions.click(driver, btnValiduntilDateIcon_31,"ValiduntilDateIcon_31");
				    return this;
			}
public NewPropertyIncidentPage selectStatus(WebDriver driver,String Status)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpStatus,Status,"Status");
				    return this;
			}
public NewPropertyIncidentPage clickNewCompany(WebDriver driver)  {
					BrowserActions.click(driver, btnNewCompany,"NewCompany");
				    return this;
			}
public NewPropertyIncidentPage clickMedicalCareOrganization_9(WebDriver driver)  {
					BrowserActions.click(driver, btnMedicalCareOrganization_9,"MedicalCareOrganization_9");
				    return this;
			}
public NewPropertyIncidentPage clickNewVendorPerson(WebDriver driver)  {
					BrowserActions.click(driver, btnNewVendorPerson,"NewVendorPerson");
				    return this;
			}
public NewPropertyIncidentPage clickDoctor(WebDriver driver)  {
					BrowserActions.click(driver, btnDoctor,"Doctor");
				    return this;
			}
public NewPropertyIncidentPage clickAssociateWith(WebDriver driver)  {
					BrowserActions.click(driver, btnAssociateWith,"AssociateWith");
				    return this;
			}
public NewPropertyIncidentPage enterAddress3_21(WebDriver driver,String Address3_21) {
		            BrowserActions.type(driver, inpAddress3_21,Address3_21, "Address3_21");
			        return this;
           }
public NewPropertyIncidentPage clickValiduntilDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnValiduntilDateIcon,"ValiduntilDateIcon");
				    return this;
			}
public NewPropertyIncidentPage selectSource(WebDriver driver,String Source)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpSource,Source,"Source");
				    return this;
			}
public NewPropertyIncidentPage clickRequestedQuoteCompletionDateDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnRequestedQuoteCompletionDateDateIcon,"RequestedQuoteCompletionDateDateIcon");
				    return this;
			}
public NewPropertyIncidentPage selectTypeofOccupancy(WebDriver driver,String TypeofOccupancy)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpTypeofOccupancy,TypeofOccupancy,"TypeofOccupancy");
				    return this;
			}
public NewPropertyIncidentPage enterZIPCode_26(WebDriver driver,String ZIPCode_26) {
		            BrowserActions.type(driver, inpZIPCode_26,ZIPCode_26, "ZIPCode_26");
			        return this;
           }
public NewPropertyIncidentPage clickActualCloseDateDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnActualCloseDateDateIcon,"ActualCloseDateDateIcon");
				    return this;
			}
public NewPropertyIncidentPage clickCancel(WebDriver driver)  {
					BrowserActions.click(driver, btnCancel,"Cancel");
				    return this;
			}
public NewPropertyIncidentPage clickDoctor_8(WebDriver driver)  {
					BrowserActions.click(driver, btnDoctor_8,"Doctor_8");
				    return this;
			}
public NewPropertyIncidentPage clickAssessor_PickerMenuIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnAssessor_PickerMenuIcon,"Assessor_PickerMenuIcon");
				    return this;
			}
public NewPropertyIncidentPage clickAdd_34(WebDriver driver)  {
					BrowserActions.click(driver, btnAdd_34,"Add_34");
				    return this;
			}
public NewPropertyIncidentPage clickAutoFillIcon_23(WebDriver driver)  {
					BrowserActions.click(driver, btnAutoFillIcon_23,"AutoFillIcon_23");
				    return this;
			}
public NewPropertyIncidentPage enterCounty_24(WebDriver driver,String County_24) {
		            BrowserActions.type(driver, inpCounty_24,County_24, "County_24");
			        return this;
           }
public NewPropertyIncidentPage clickAdd_38(WebDriver driver)  {
					BrowserActions.click(driver, btnAdd_38,"Add_38");
				    return this;
			}
public NewPropertyIncidentPage clickAutoFillIcon_27(WebDriver driver)  {
					BrowserActions.click(driver, btnAutoFillIcon_27,"AutoFillIcon_27");
				    return this;
			}
public NewPropertyIncidentPage clickAdd_36(WebDriver driver)  {
					BrowserActions.click(driver, btnAdd_36,"Add_36");
				    return this;
			}
public NewPropertyIncidentPage clickAlreadyRepaired(WebDriver driver)  {
					BrowserActions.click(driver, rdbAlreadyRepaired,"AlreadyRepaired");
				    return this;
			}
}
