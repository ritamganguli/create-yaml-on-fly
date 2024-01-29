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

public class EnterPayeeInformationPage extends LoadableComponent<EnterPayeeInformationPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
 	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
//	public TopNavBar topnavbar;
//	public NewCheckPayees newcheckpayeesTable;

	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckPayeeDV-AddJointPayees>div[role='button']", AI = false)
	public WebElement btnAddJointPayees;

	@IFindBy(how = How.CSS, using = "input[name='ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckAdditionalPayeeDV-MailingAddressInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressLine1']", AI = false)
	public WebElement inpAddress1_33;

	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckPayeeDV-PrimaryPayee_Name-MenuItem_ViewDetails>div[role='menuitem']", AI = false)
	public WebElement btnViewContactDetails;

	@IFindBy(how = How.CSS, using = "select[name='ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckAdditionalPayeeDV-MailingAddressInputSet-CCAddressInputSet-globalAddressContainer-Address_AddressType']", AI = false)
	public WebElement drpAddressType_42;

	@IFindBy(how = How.CSS, using = "select[name='ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckPayeeDV-MailingAddressInputSet-CCAddressInputSet-globalAddressContainer-Address_Picker']", AI = false)
	public WebElement drpMailingAddress;

	@IFindBy(how = How.CSS, using = "input[name='ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckAdditionalPayeeDV-MailingAddressInputSet-CCAddressInputSet-globalAddressContainer-Address_Description']", AI = false)
	public WebElement inpLocationDescription_43;

	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckPayeeDV-MailingAddressInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-PostalCode-AutoFillIcon", AI = false)
	public WebElement btnAutoFillIcon_2;

	@IFindBy(how = How.CSS, using = "select[name='ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckPayeeDV-MailingAddressInputSet-CCAddressInputSet-globalAddressContainer-Claim_JurisdictionState']", AI = false)
	public WebElement drpJurisdiction;

	@IFindBy(how = How.CSS, using = "input[name='ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckPayeeDV-MailingAddressInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-County']", AI = false)
	public WebElement inpCounty;

	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-Prev>div[role='button']", AI = false)
	public WebElement btnBack;

	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckAdditionalPayeeDV-PrimaryPayee_Name-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal>div[role='menuitem']", AI = false)
	public WebElement btnNewLegal_13;

	@IFindBy(how = How.CSS, using = "input[name='ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckAdditionalPayeeDV-MailingAddressInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressSummary']", AI = false)
	public WebElement inpMailingAddress_31;

	@IFindBy(how = How.CSS, using = "input[name='ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckPayeeDV-MailingAddressInputSet-CCAddressInputSet-globalAddressContainer-Claim_LocationCode']", AI = false)
	public WebElement inpLocationCode;

	@IFindBy(how = How.CSS, using = "input[name='ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewCheckPayeesLV-0-Check_Portion']", AI = false)
	public WebElement inpCheckPortion;

	@IFindBy(how = How.CSS, using = "div[id$='-Next']", AI = false)
	public WebElement btnNext;

	@IFindBy(how = How.CSS, using = "select[name='ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckPayeeDV-Check_Reportability']", AI = false)
	public WebElement drpReportAs;

	@IFindBy(how = How.CSS, using = "select[name='ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckAdditionalPayeeDV-MailingAddressInputSet-CCAddressInputSet-globalAddressContainer-Claim_JurisdictionState']", AI = false)
	public WebElement drpJurisdiction_47;

	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-Add>div[role='button']", AI = false)
	public WebElement btnAddPayee;

	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckPayeeDV-PrimaryPayee_Name-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Adjudicator>div[role='menuitem']", AI = false)
	public WebElement btnAdjudicator;

	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckAdditionalPayeeDV-PrimaryPayee_Name-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor>div[role='menuitem']", AI = false)
	public WebElement btnNewVendor_6;

	@IFindBy(how = How.CSS, using = "select[name='ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckPayeeDV-PrimaryPayee_Type']", AI = false)
	public WebElement drpType;

	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckPayeeDV-PrimaryPayee_Name-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewPerson>div[role='menuitem']", AI = false)
	public WebElement btnNewPerson;

	@IFindBy(how = How.CSS, using = "input[name='ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckPayeeDV-Check_CheckNumber']", AI = false)
	public WebElement inpCheckNumber;

	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckAdditionalPayeeDV-PrimaryPayee_Name-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoRepairShop>div[role='menuitem']", AI = false)
	public WebElement btnAutobodyRepairShop_7;

	@IFindBy(how = How.CSS, using = "select[name='ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckPayeeDV-Check_BankAccount']", AI = false)
	public WebElement drpBankAccount;

	@IFindBy(how = How.CSS, using = "input[name='ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckPayeeDV-MailingAddressInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressSummary']", AI = false)
	public WebElement inpMailingAddress_1;

	@IFindBy(how = How.CSS, using = "input[name='ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckAdditionalPayeeDV-MailingAddressInputSet-CCAddressInputSet-globalAddressContainer-Address_ValidUntil']", AI = false)
	public WebElement inpValiduntil_44;

	@IFindBy(how = How.CSS, using = "input[name='ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckAdditionalPayeeDV-MailingAddressInputSet-CCAddressInputSet-globalAddressContainer-Claim_LocationCode']", AI = false)
	public WebElement inpLocationCode_46;

	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckPayeeDV-PrimaryPayee_Name-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoRepairShop>div[role='menuitem']", AI = false)
	public WebElement btnAutobodyRepairShop;

	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-DetailsCardTab", AI = false)
	public WebElement btnCheckDetails;

	@IFindBy(how = How.CSS, using = "input[name='ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckPayeeDV-MailingAddressInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressLine3']", AI = false)
	public WebElement inpAddress3;

	@IFindBy(how = How.CSS, using = "input[name='ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckPayeeDV-MailingAddressInputSet-CCAddressInputSet-globalAddressContainer-Address_Description']", AI = false)
	public WebElement inpLocationDescription;

	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckAdditionalPayeeDV-PrimaryPayee_Name-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Adjudicator>div[role='menuitem']", AI = false)
	public WebElement btnAdjudicator_14;

	@IFindBy(how = How.CSS, using = "input[name='ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckPayeeDV-MailingAddressInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressLine1']", AI = false)
	public WebElement inpAddress1;

	@IFindBy(how = How.CSS, using = "select[name='ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckPayeeDV-MailingAddressInputSet-CCAddressInputSet-globalAddressContainer-Address_AddressType']", AI = false)
	public WebElement drpAddressType;

	@IFindBy(how = How.CSS, using = "input[name='ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckPayeeDV-MailingAddressInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressLine2']", AI = false)
	public WebElement inpAddress2;

	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckAdditionalPayeeDV-Check_PayTo textarea", AI = false)
	public WebElement inpPayToTheOrderOf_24;

	@IFindBy(how = How.CSS, using = "input[name='ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckAdditionalPayeeDV-Check_CheckNumber']", AI = false)
	public WebElement inpCheckNumber_51;

	@IFindBy(how = How.CSS, using = "input[name='ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckPayeeDV-MailingAddressInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-PostalCode']", AI = false)
	public WebElement inpZIPCode;

	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckPayeeDV-MailingAddressInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-City-AutoFillIcon", AI = false)
	public WebElement btnAutoFillIcon;

	@IFindBy(how = How.CSS, using = "input[name='ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckAdditionalPayeeDV-MailingAddressInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-City']", AI = false)
	public WebElement inpCity_36;

	@IFindBy(how = How.CSS, using = "input[name='ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckPayeeDV-MailingAddressInputSet-CCAddressInputSet-globalAddressContainer-Address_ValidUntil']", AI = false)
	public WebElement inpValiduntil;

	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckPayeeDV-PrimaryPayee_Name-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor>div[role='menuitem']", AI = false)
	public WebElement btnNewVendor;

	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckPayeeDV-PrimaryPayee_Name-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_CompanyVendor>div[role='menuitem']", AI = false)
	public WebElement btnVendorCompany;

	@IFindBy(how = How.CSS, using = "select[name='ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckPayeeDV-MailingAddressInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-Country']", AI = false)
	public WebElement drpCountry;

	@IFindBy(how = How.CSS, using = "input[name='ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewCheckPayeesLV-0-Check_Primary']", AI = false)
	public WebElement rdbPrimary;

	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckPayeeDV-PrimaryPayee_Name-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_LawFirm>div[role='menuitem']", AI = false)
	public WebElement btnLawFirm;

	@IFindBy(how = How.CSS, using = "select[name='ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckPayeeDV-MailingAddressInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-State']", AI = false)
	public WebElement drpState;

	@IFindBy(how = How.CSS, using = "select[name='ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckAdditionalPayeeDV-PrimaryPayee_Type']", AI = false)
	public WebElement drpType_20;

	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckPayeeDV-PrimaryPayee_Name-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal>div[role='menuitem']", AI = false)
	public WebElement btnNewLegal;

	@IFindBy(how = How.CSS, using = "select[name='ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckAdditionalPayeeDV-MailingAddressInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-Country']", AI = false)
	public WebElement drpCountry_32;

	@IFindBy(how = How.CSS, using = "select[name='ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckAdditionalPayeeDV-Check_BankAccount']", AI = false)
	public WebElement drpBankAccount_52;

	@IFindBy(how = How.CSS, using = "input[name='ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckAdditionalPayeeDV-Check_MailToContact']", AI = false)
	public WebElement inpRecipient_26;

	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckPayeeDV-NewCheckPayeeDVPayeesLV_tb-Add>div[role='button']", AI = false)
	public WebElement btnAdd;

	@IFindBy(how = How.CSS, using = "select[name='ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckAdditionalPayeeDV-Check_DeliveryMethod']", AI = false)
	public WebElement drpCheckDelivery_25;

	@IFindBy(how = How.CSS, using = "input[name='ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckAdditionalPayeeDV-Check_IssueDate']", AI = false)
	public WebElement inpIssueDate_49;

	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckPayeeDV-PrimaryPayee_Name-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_NewLegalVenue>div[role='menuitem']", AI = false)
	public WebElement btnLegalVenue;

	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckAdditionalPayeeDV-PrimaryPayee_Name-MenuItem_ViewDetails>div[role='menuitem']", AI = false)
	public WebElement btnViewContactDetails_19;

	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-Remove>div[role='button']", AI = false)
	public WebElement btnRemovePayee;

	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckAdditionalPayeeDV-PrimaryPayee_Name-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_CompanyVendor>div[role='menuitem']", AI = false)
	public WebElement btnVendorCompany_11;

	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckAdditionalPayeeDV-PrimaryPayee_Name-MenuItem_Search>div[role='menuitem']", AI = false)
	public WebElement btnSearch_18;

	@IFindBy(how = How.CSS, using = "select[name$='CheckPayeeDV-PrimaryPayee_Name']", AI = false)
	public WebElement drpName;

	@IFindBy(how = How.CSS, using = "input[name='ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckPayeeDV-Check_MailingAddress']", AI = false)
	public WebElement inpMailingAddress;

	@IFindBy(how = How.CSS, using = "input[name='ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckAdditionalPayeeDV-ToggleAddressEdit']", AI = false)
	public WebElement chkToggleAddressEdit_29;

	@IFindBy(how = How.CSS, using = "input[name='ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckAdditionalPayeeDV-MailingAddressInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-County']", AI = false)
	public WebElement inpCounty_38;

	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-Finish>div[role='button']", AI = false)
	public WebElement btnFinish;

	@IFindBy(how = How.CSS, using = "input[name='ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckPayeeDV-MailingAddressInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-City']", AI = false)
	public WebElement inpCity;

	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-NewCheckInstructions>div[role='menuitem']", AI = false)
	public WebElement btnInstructions;

	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-NewCheckPayees>div[role='menuitem']", AI = false)
	public WebElement btnPayees;

	@IFindBy(how = How.CSS, using = "select[name='ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckAdditionalPayeeDV-PrimaryPayee_Name']", AI = false)
	public WebElement drpName_3;

	@IFindBy(how = How.CSS, using = "select[name='ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckAdditionalPayeeDV-MailingAddressInputSet-CCAddressInputSet-globalAddressContainer-Address_Picker']", AI = false)
	public WebElement drpMailingAddress_30;

	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckPayeeDV-PrimaryPayee_Name-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_MedicalCareOrg>div[role='menuitem']", AI = false)
	public WebElement btnMedicalCareOrganization;

	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckAdditionalPayeeDV-PrimaryPayee_Name-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_MedicalCareOrg>div[role='menuitem']", AI = false)
	public WebElement btnMedicalCareOrganization_10;

	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckPayeeDV-PrimaryPayee_Name-MenuItem_Search>div[role='menuitem']", AI = false)
	public WebElement btnSearch;

	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckPayeeDV-PrimaryPayee_Name-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Attorney>div[role='menuitem']", AI = false)
	public WebElement btnAttorney;

	@IFindBy(how = How.CSS, using = "input[name='ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckPayeeDV-OldMailingAddress']", AI = false)
	public WebElement inpOldMailToAddress;

	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckAdditionalPayeeDV-Check_IssueDate_dateIcon", AI = false)
	public WebElement btnIssueDateDateIcon_50;

	@IFindBy(how = How.CSS, using = "input[name='ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckAdditionalPayeeDV-MailingAddressInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressLine2']", AI = false)
	public WebElement inpAddress2_34;

	@IFindBy(how = How.CSS, using = "select[name='ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckAdditionalPayeeDV-Check_DeductionType']", AI = false)
	public WebElement drpDeductionType_48;

	@IFindBy(how = How.CSS, using = "select[name='ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewCheckPayeesLV-0-Check_DeductionType']", AI = false)
	public WebElement drpDeductionType;

	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckAdditionalPayeeDV-PrimaryPayee_Name-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_LawFirm>div[role='menuitem']", AI = false)
	public WebElement btnLawFirm_16;

	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckPayeeDV-Check_IssueDate_dateIcon", AI = false)
	public WebElement btnIssueDateDateIcon;

	@IFindBy(how = How.CSS, using = "input[name='ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckAdditionalPayeeDV-OldMailingAddress']", AI = false)
	public WebElement inpOldMailToAddress_27;

	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckAdditionalPayeeDV-PrimaryPayee_Name-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Attorney>div[role='menuitem']", AI = false)
	public WebElement btnAttorney_15;

	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckPayeeDV-PrimaryPayee_Name-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoTowingAgcy>div[role='menuitem']", AI = false)
	public WebElement btnAutoTowingAgency;

	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckAdditionalPayeeDV-MailingAddressInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-PostalCode-AutoFillIcon", AI = false)
	public WebElement btnAutoFillIcon_41;

	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckPayeeDV-PrimaryPayee_Name-PrimaryPayee_NameMenuIcon>div[role='button']", AI = false)
	public WebElement btnPrimaryPayee_NameMenuIcon;

	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckAdditionalPayeeDV-PrimaryPayee_Name-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_NewLegalVenue>div[role='menuitem']", AI = false)
	public WebElement btnLegalVenue_17;

	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-ttlBar", AI = false)
	public WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "select[name='ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckPayeeDV-Check_DeliveryMethod']", AI = false)
	public WebElement drpCheckDelivery;

	@IFindBy(how = How.CSS, using = "input[name='ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckAdditionalPayeeDV-MailingAddressInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressLine3']", AI = false)
	public WebElement inpAddress3_35;

	@IFindBy(how = How.CSS, using = "input[name='ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckAdditionalPayeeDV-MailingAddressInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-PostalCode']", AI = false)
	public WebElement inpZIPCode_40;

	@IFindBy(how = How.CSS, using = "input[name='ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckPayeeDV-ToggleAddressEdit']", AI = false)
	public WebElement chkToggleAddressEdit;

	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckAdditionalPayeeDV-PrimaryPayee_Name-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewCompany>div[role='menuitem']", AI = false)
	public WebElement btnNewCompany_12;

	@IFindBy(how = How.CSS, using = "input[name='ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckPayeeDV-Check_IssueDate']", AI = false)
	public WebElement inpIssueDate;

	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckAdditionalPayeeDV-AddJointPayees>div[role='button']", AI = false)
	public WebElement btnAddJointPayees_21;

	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-NewCheckPayments>div[role='menuitem']", AI = false)
	public WebElement btnPayments;

	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckPayeeDV-NewCheckPayeeDVPayeesLV_tb-Remove>div[role='button']", AI = false)
	public WebElement btnRemove;

	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckAdditionalPayeeDV-PrimaryPayee_Name-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewPerson>div[role='menuitem']", AI = false)
	public WebElement btnNewPerson_5;

	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckAdditionalPayeeDV-NewCheckPayeeDVPayeesLV_tb-Add>div[role='button']", AI = false)
	public WebElement btnAdd_22;

	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckAdditionalPayeeDV-PrimaryPayee_Name-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoTowingAgcy>div[role='menuitem']", AI = false)
	public WebElement btnAutoTowingAgency_8;

	@IFindBy(how = How.CSS, using = "input[name='ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckAdditionalPayeeDV-Check_MailingAddress']", AI = false)
	public WebElement inpMailingAddress_28;

	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckAdditionalPayeeDV-MailingAddressInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-City-AutoFillIcon", AI = false)
	public WebElement btnAutoFillIcon_37;

	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckPayeeDV-PrimaryPayee_Name-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewCompany>div[role='menuitem']", AI = false)
	public WebElement btnNewCompany;

	@IFindBy(how = How.CSS, using = "input[name='ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewCheckPayeesLV-0-Check_PayTo']", AI = false)
	public WebElement inpPayTo;

	@IFindBy(how = How.CSS, using = "input[name='ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckAdditionalPayeeDV-Check_CheckPortion-PortionPercentage']", AI = false)
	public WebElement inpPercentage;

	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckPayeeDV-PrimaryPayee_Name-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_Doctor>div[role='menuitem']", AI = false)
	public WebElement btnDoctor;

	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckPayeeDV-MailingAddressInputSet-CCAddressInputSet-globalAddressContainer-Address_ValidUntil_dateIcon", AI = false)
	public WebElement btnValiduntilDateIcon;

	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckPayeeDV-Check_PayTo textarea", AI = false)
	public WebElement inpPayToTheOrderOf;

	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckAdditionalPayeeDV-PrimaryPayee_Name-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_Doctor>div[role='menuitem']", AI = false)
	public WebElement btnDoctor_9;

	@IFindBy(how = How.CSS, using = "select[name='ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckAdditionalPayeeDV-MailingAddressInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-State']", AI = false)
	public WebElement drpState_39;

	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-Cancel>div[role='button']", AI = false)
	public WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckAdditionalPayeeDV-NewCheckPayeeDVPayeesLV_tb-Remove>div[role='button']", AI = false)
	public WebElement btnRemove_23;

	@IFindBy(how = How.CSS, using = "select[name='ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewCheckPayeesLV-0-Check_DeliverMethod']", AI = false)
	public WebElement drpDeliveryMethod;

	@IFindBy(how = How.CSS, using = "input[name='ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckPayeeDV-Check_MailToContact']", AI = false)
	public WebElement inpRecipient;

	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckAdditionalPayeeDV-PrimaryPayee_Name-PrimaryPayee_NameMenuIcon>div[role='button']", AI = false)
	public WebElement btnPrimaryPayee_NameMenuIcon_4;

	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-ManualCheckWizard_CheckPayeesScreen-NewManualCheckAdditionalPayeeDV-MailingAddressInputSet-CCAddressInputSet-globalAddressContainer-Address_ValidUntil_dateIcon", AI = false)
	public WebElement btnValiduntilDateIcon_45;

	public EnterPayeeInformationPage(){
	}

	public EnterPayeeInformationPage(WebDriver driver) {
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(finder, this);
//		newcheckpayeesTable = new NewCheckPayees();
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
}public EnterPayeeInformationPage clickAddJointPayees(WebDriver driver)  {
					BrowserActions.click(driver, btnAddJointPayees,"AddJointPayees");
				    return this;
			}
public EnterPayeeInformationPage enterAddress1_33(WebDriver driver,String Address1_33) {
		            BrowserActions.type(driver, inpAddress1_33,Address1_33, "Address1_33");
			        return this;
           }
public EnterPayeeInformationPage clickViewContactDetails(WebDriver driver)  {
					BrowserActions.click(driver, btnViewContactDetails,"ViewContactDetails");
				    return this;
			}
public EnterPayeeInformationPage selectAddressType_42(WebDriver driver,String AddressType_42)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpAddressType_42,AddressType_42,"AddressType_42");
				    return this;
			}
public EnterPayeeInformationPage selectMailingAddress(WebDriver driver,String MailingAddress)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpMailingAddress,MailingAddress,"MailingAddress");
				    return this;
			}
public EnterPayeeInformationPage enterLocationDescription_43(WebDriver driver,String LocationDescription_43) {
		            BrowserActions.type(driver, inpLocationDescription_43,LocationDescription_43, "LocationDescription_43");
			        return this;
           }
public EnterPayeeInformationPage clickAutoFillIcon_2(WebDriver driver)  {
					BrowserActions.click(driver, btnAutoFillIcon_2,"AutoFillIcon_2");
				    return this;
			}
public EnterPayeeInformationPage selectJurisdiction(WebDriver driver,String Jurisdiction)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpJurisdiction,Jurisdiction,"Jurisdiction");
				    return this;
			}
public EnterPayeeInformationPage enterCounty(WebDriver driver,String County) {
		            BrowserActions.type(driver, inpCounty,County, "County");
			        return this;
           }
public EnterPayeeInformationPage clickBack(WebDriver driver)  {
					BrowserActions.click(driver, btnBack,"Back");
				    return this;
			}
public EnterPayeeInformationPage clickNewLegal_13(WebDriver driver)  {
					BrowserActions.click(driver, btnNewLegal_13,"NewLegal_13");
				    return this;
			}
public EnterPayeeInformationPage enterMailingAddress_31(WebDriver driver,String MailingAddress_31) {
		            BrowserActions.type(driver, inpMailingAddress_31,MailingAddress_31, "MailingAddress_31");
			        return this;
           }
public EnterPayeeInformationPage enterLocationCode(WebDriver driver,String LocationCode) {
		            BrowserActions.type(driver, inpLocationCode,LocationCode, "LocationCode");
			        return this;
           }
public EnterPayeeInformationPage enterCheckPortion(WebDriver driver,String CheckPortion) {
		            BrowserActions.type(driver, inpCheckPortion,CheckPortion, "CheckPortion");
			        return this;
           }
public EnterPayeeInformationPage clickNext(WebDriver driver)  {
					BrowserActions.click(driver, btnNext,true,"Next");
				    return this;
			}
public EnterPayeeInformationPage selectReportAs(WebDriver driver,String ReportAs)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpReportAs,ReportAs,"ReportAs");
				    return this;
			}
public EnterPayeeInformationPage selectJurisdiction_47(WebDriver driver,String Jurisdiction_47)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpJurisdiction_47,Jurisdiction_47,"Jurisdiction_47");
				    return this;
			}
public EnterPayeeInformationPage clickAddPayee(WebDriver driver)  {
					BrowserActions.click(driver, btnAddPayee,"AddPayee");
				    return this;
			}
public EnterPayeeInformationPage clickAdjudicator(WebDriver driver)  {
					BrowserActions.click(driver, btnAdjudicator,"Adjudicator");
				    return this;
			}
public EnterPayeeInformationPage clickNewVendor_6(WebDriver driver)  {
					BrowserActions.click(driver, btnNewVendor_6,"NewVendor_6");
				    return this;
			}
public EnterPayeeInformationPage selectType(WebDriver driver,String Type)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpType,Type,"Type");
				    return this;
			}
public EnterPayeeInformationPage clickNewPerson(WebDriver driver)  {
					BrowserActions.click(driver, btnNewPerson,"NewPerson");
				    return this;
			}
public EnterPayeeInformationPage enterCheckNumber(WebDriver driver,String CheckNumber) {
		            BrowserActions.type(driver, inpCheckNumber,CheckNumber, "CheckNumber");
			        return this;
           }
public EnterPayeeInformationPage clickAutobodyRepairShop_7(WebDriver driver)  {
					BrowserActions.click(driver, btnAutobodyRepairShop_7,"AutobodyRepairShop_7");
				    return this;
			}
public EnterPayeeInformationPage selectBankAccount(WebDriver driver,String BankAccount)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpBankAccount,BankAccount,"BankAccount");
				    return this;
			}
public EnterPayeeInformationPage enterMailingAddress_1(WebDriver driver,String MailingAddress_1) {
		            BrowserActions.type(driver, inpMailingAddress_1,MailingAddress_1, "MailingAddress_1");
			        return this;
           }
public EnterPayeeInformationPage enterValiduntil_44(WebDriver driver,String Validuntil_44) {
		            BrowserActions.type(driver, inpValiduntil_44,Validuntil_44, "Validuntil_44");
			        return this;
           }
public EnterPayeeInformationPage enterLocationCode_46(WebDriver driver,String LocationCode_46) {
		            BrowserActions.type(driver, inpLocationCode_46,LocationCode_46, "LocationCode_46");
			        return this;
           }
public EnterPayeeInformationPage clickAutobodyRepairShop(WebDriver driver)  {
					BrowserActions.click(driver, btnAutobodyRepairShop,"AutobodyRepairShop");
				    return this;
			}
public EnterPayeeInformationPage clickCheckDetails(WebDriver driver)  {
					BrowserActions.click(driver, btnCheckDetails,"CheckDetails");
				    return this;
			}
public EnterPayeeInformationPage enterAddress3(WebDriver driver,String Address3) {
		            BrowserActions.type(driver, inpAddress3,Address3, "Address3");
			        return this;
           }
public EnterPayeeInformationPage enterLocationDescription(WebDriver driver,String LocationDescription) {
		            BrowserActions.type(driver, inpLocationDescription,LocationDescription, "LocationDescription");
			        return this;
           }
public EnterPayeeInformationPage clickAdjudicator_14(WebDriver driver)  {
					BrowserActions.click(driver, btnAdjudicator_14,"Adjudicator_14");
				    return this;
			}
public EnterPayeeInformationPage enterAddress1(WebDriver driver,String Address1) {
		            BrowserActions.type(driver, inpAddress1,Address1, "Address1");
			        return this;
           }
public EnterPayeeInformationPage selectAddressType(WebDriver driver,String AddressType)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpAddressType,AddressType,"AddressType");
				    return this;
			}
public EnterPayeeInformationPage enterAddress2(WebDriver driver,String Address2) {
		            BrowserActions.type(driver, inpAddress2,Address2, "Address2");
			        return this;
           }
public EnterPayeeInformationPage enterPayToTheOrderOf_24(WebDriver driver,String PayToTheOrderOf_24) {
		            BrowserActions.type(driver, inpPayToTheOrderOf_24,PayToTheOrderOf_24, "PayToTheOrderOf_24");
			        return this;
           }
public EnterPayeeInformationPage enterCheckNumber_51(WebDriver driver,String CheckNumber_51) {
		            BrowserActions.type(driver, inpCheckNumber_51,CheckNumber_51, "CheckNumber_51");
			        return this;
           }
public EnterPayeeInformationPage enterZIPCode(WebDriver driver,String ZIPCode) {
		            BrowserActions.type(driver, inpZIPCode,ZIPCode, "ZIPCode");
			        return this;
           }
public EnterPayeeInformationPage clickAutoFillIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnAutoFillIcon,"AutoFillIcon");
				    return this;
			}
public EnterPayeeInformationPage enterCity_36(WebDriver driver,String City_36) {
		            BrowserActions.type(driver, inpCity_36,City_36, "City_36");
			        return this;
           }
public EnterPayeeInformationPage enterValiduntil(WebDriver driver,String Validuntil) {
		            BrowserActions.type(driver, inpValiduntil,Validuntil, "Validuntil");
			        return this;
           }
public EnterPayeeInformationPage clickNewVendor(WebDriver driver)  {
					BrowserActions.click(driver, btnNewVendor,"NewVendor");
				    return this;
			}
public EnterPayeeInformationPage clickVendorCompany(WebDriver driver)  {
					BrowserActions.click(driver, btnVendorCompany,"VendorCompany");
				    return this;
			}
public EnterPayeeInformationPage selectCountry(WebDriver driver,String Country)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpCountry,Country,"Country");
				    return this;
			}
public EnterPayeeInformationPage clickPrimary(WebDriver driver)  {
					BrowserActions.click(driver, rdbPrimary,"Primary");
				    return this;
			}
public EnterPayeeInformationPage clickLawFirm(WebDriver driver)  {
					BrowserActions.click(driver, btnLawFirm,"LawFirm");
				    return this;
			}
public EnterPayeeInformationPage selectState(WebDriver driver,String State)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpState,State,"State");
				    return this;
			}
public EnterPayeeInformationPage selectType_20(WebDriver driver,String Type_20)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpType_20,Type_20,"Type_20");
				    return this;
			}
public EnterPayeeInformationPage clickNewLegal(WebDriver driver)  {
					BrowserActions.click(driver, btnNewLegal,"NewLegal");
				    return this;
			}
public EnterPayeeInformationPage selectCountry_32(WebDriver driver,String Country_32)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpCountry_32,Country_32,"Country_32");
				    return this;
			}
public EnterPayeeInformationPage selectBankAccount_52(WebDriver driver,String BankAccount_52)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpBankAccount_52,BankAccount_52,"BankAccount_52");
				    return this;
			}
public EnterPayeeInformationPage enterRecipient_26(WebDriver driver,String Recipient_26) {
		            BrowserActions.type(driver, inpRecipient_26,Recipient_26, "Recipient_26");
			        return this;
           }
public EnterPayeeInformationPage clickAdd(WebDriver driver)  {
					BrowserActions.click(driver, btnAdd,"Add");
				    return this;
			}
public EnterPayeeInformationPage selectCheckDelivery_25(WebDriver driver,String CheckDelivery_25)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpCheckDelivery_25,CheckDelivery_25,"CheckDelivery_25");
				    return this;
			}
public EnterPayeeInformationPage enterIssueDate_49(WebDriver driver,String IssueDate_49) {
		            BrowserActions.type(driver, inpIssueDate_49,IssueDate_49, "IssueDate_49");
			        return this;
           }
public EnterPayeeInformationPage clickLegalVenue(WebDriver driver)  {
					BrowserActions.click(driver, btnLegalVenue,"LegalVenue");
				    return this;
			}
public EnterPayeeInformationPage clickViewContactDetails_19(WebDriver driver)  {
					BrowserActions.click(driver, btnViewContactDetails_19,"ViewContactDetails_19");
				    return this;
			}
public EnterPayeeInformationPage clickRemovePayee(WebDriver driver)  {
					BrowserActions.click(driver, btnRemovePayee,"RemovePayee");
				    return this;
			}
public EnterPayeeInformationPage clickVendorCompany_11(WebDriver driver)  {
					BrowserActions.click(driver, btnVendorCompany_11,"VendorCompany_11");
				    return this;
			}
public EnterPayeeInformationPage clickSearch_18(WebDriver driver)  {
					BrowserActions.click(driver, btnSearch_18,"Search_18");
				    return this;
			}
public EnterPayeeInformationPage selectName(WebDriver driver)  {
					BrowserActions.selectDropDownByIndex(driver, drpName,1,1,"Name");
				    return this;
			}
public EnterPayeeInformationPage enterMailingAddress(WebDriver driver,String MailingAddress) {
		            BrowserActions.type(driver, inpMailingAddress,MailingAddress, "MailingAddress");
			        return this;
           }
public EnterPayeeInformationPage clickToggleAddressEdit_29(WebDriver driver)  {
					BrowserActions.click(driver, chkToggleAddressEdit_29,"ToggleAddressEdit_29");
				    return this;
			}
public EnterPayeeInformationPage enterCounty_38(WebDriver driver,String County_38) {
		            BrowserActions.type(driver, inpCounty_38,County_38, "County_38");
			        return this;
           }
public EnterPayeeInformationPage clickFinish(WebDriver driver)  {
					BrowserActions.click(driver, btnFinish,"Finish");
				    return this;
			}
public EnterPayeeInformationPage enterCity(WebDriver driver,String City) {
		            BrowserActions.type(driver, inpCity,City, "City");
			        return this;
           }
public EnterPayeeInformationPage clickInstructions(WebDriver driver)  {
					BrowserActions.click(driver, btnInstructions,"Instructions");
				    return this;
			}
public EnterPayeeInformationPage clickPayees(WebDriver driver)  {
					BrowserActions.click(driver, btnPayees,"Payees");
				    return this;
			}
public EnterPayeeInformationPage selectName_3(WebDriver driver,String Name_3)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpName_3,Name_3,"Name_3");
				    return this;
			}
public EnterPayeeInformationPage selectMailingAddress_30(WebDriver driver,String MailingAddress_30)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpMailingAddress_30,MailingAddress_30,"MailingAddress_30");
				    return this;
			}
public EnterPayeeInformationPage clickMedicalCareOrganization(WebDriver driver)  {
					BrowserActions.click(driver, btnMedicalCareOrganization,"MedicalCareOrganization");
				    return this;
			}
public EnterPayeeInformationPage clickMedicalCareOrganization_10(WebDriver driver)  {
					BrowserActions.click(driver, btnMedicalCareOrganization_10,"MedicalCareOrganization_10");
				    return this;
			}
public EnterPayeeInformationPage clickSearch(WebDriver driver)  {
					BrowserActions.click(driver, btnSearch,"Search");
				    return this;
			}
public EnterPayeeInformationPage clickAttorney(WebDriver driver)  {
					BrowserActions.click(driver, btnAttorney,"Attorney");
				    return this;
			}
public EnterPayeeInformationPage enterOldMailToAddress(WebDriver driver,String OldMailToAddress) {
		            BrowserActions.type(driver, inpOldMailToAddress,OldMailToAddress, "OldMailToAddress");
			        return this;
           }
public EnterPayeeInformationPage clickIssueDateDateIcon_50(WebDriver driver)  {
					BrowserActions.click(driver, btnIssueDateDateIcon_50,"IssueDateDateIcon_50");
				    return this;
			}
public EnterPayeeInformationPage enterAddress2_34(WebDriver driver,String Address2_34) {
		            BrowserActions.type(driver, inpAddress2_34,Address2_34, "Address2_34");
			        return this;
           }
public EnterPayeeInformationPage selectDeductionType_48(WebDriver driver,String DeductionType_48)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpDeductionType_48,DeductionType_48,"DeductionType_48");
				    return this;
			}
public EnterPayeeInformationPage selectDeductionType(WebDriver driver,String DeductionType)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpDeductionType,DeductionType,"DeductionType");
				    return this;
			}
public EnterPayeeInformationPage clickLawFirm_16(WebDriver driver)  {
					BrowserActions.click(driver, btnLawFirm_16,"LawFirm_16");
				    return this;
			}
public EnterPayeeInformationPage clickIssueDateDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnIssueDateDateIcon,"IssueDateDateIcon");
				    return this;
			}
public EnterPayeeInformationPage enterOldMailToAddress_27(WebDriver driver,String OldMailToAddress_27) {
		            BrowserActions.type(driver, inpOldMailToAddress_27,OldMailToAddress_27, "OldMailToAddress_27");
			        return this;
           }
public EnterPayeeInformationPage clickAttorney_15(WebDriver driver)  {
					BrowserActions.click(driver, btnAttorney_15,"Attorney_15");
				    return this;
			}
public EnterPayeeInformationPage clickAutoTowingAgency(WebDriver driver)  {
					BrowserActions.click(driver, btnAutoTowingAgency,"AutoTowingAgency");
				    return this;
			}
public EnterPayeeInformationPage clickAutoFillIcon_41(WebDriver driver)  {
					BrowserActions.click(driver, btnAutoFillIcon_41,"AutoFillIcon_41");
				    return this;
			}
public EnterPayeeInformationPage clickPrimaryPayee_NameMenuIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnPrimaryPayee_NameMenuIcon,"PrimaryPayee_NameMenuIcon");
				    return this;
			}
public EnterPayeeInformationPage clickLegalVenue_17(WebDriver driver)  {
					BrowserActions.click(driver, btnLegalVenue_17,"LegalVenue_17");
				    return this;
			}
public EnterPayeeInformationPage selectCheckDelivery(WebDriver driver,String CheckDelivery)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpCheckDelivery,CheckDelivery,"CheckDelivery");
				    return this;
			}
public EnterPayeeInformationPage enterAddress3_35(WebDriver driver,String Address3_35) {
		            BrowserActions.type(driver, inpAddress3_35,Address3_35, "Address3_35");
			        return this;
           }
public EnterPayeeInformationPage enterZIPCode_40(WebDriver driver,String ZIPCode_40) {
		            BrowserActions.type(driver, inpZIPCode_40,ZIPCode_40, "ZIPCode_40");
			        return this;
           }
public EnterPayeeInformationPage clickToggleAddressEdit(WebDriver driver)  {
					BrowserActions.click(driver, chkToggleAddressEdit,"ToggleAddressEdit");
				    return this;
			}
public EnterPayeeInformationPage clickNewCompany_12(WebDriver driver)  {
					BrowserActions.click(driver, btnNewCompany_12,"NewCompany_12");
				    return this;
			}
public EnterPayeeInformationPage enterIssueDate(WebDriver driver,String IssueDate) {
		            BrowserActions.type(driver, inpIssueDate,IssueDate, "IssueDate");
			        return this;
           }
public EnterPayeeInformationPage clickAddJointPayees_21(WebDriver driver)  {
					BrowserActions.click(driver, btnAddJointPayees_21,"AddJointPayees_21");
				    return this;
			}
public EnterPayeeInformationPage clickPayments(WebDriver driver)  {
					BrowserActions.click(driver, btnPayments,"Payments");
				    return this;
			}
public EnterPayeeInformationPage clickRemove(WebDriver driver)  {
					BrowserActions.click(driver, btnRemove,"Remove");
				    return this;
			}
public EnterPayeeInformationPage clickNewPerson_5(WebDriver driver)  {
					BrowserActions.click(driver, btnNewPerson_5,"NewPerson_5");
				    return this;
			}
public EnterPayeeInformationPage clickAdd_22(WebDriver driver)  {
					BrowserActions.click(driver, btnAdd_22,"Add_22");
				    return this;
			}
public EnterPayeeInformationPage clickAutoTowingAgency_8(WebDriver driver)  {
					BrowserActions.click(driver, btnAutoTowingAgency_8,"AutoTowingAgency_8");
				    return this;
			}
public EnterPayeeInformationPage enterMailingAddress_28(WebDriver driver,String MailingAddress_28) {
		            BrowserActions.type(driver, inpMailingAddress_28,MailingAddress_28, "MailingAddress_28");
			        return this;
           }
public EnterPayeeInformationPage clickAutoFillIcon_37(WebDriver driver)  {
					BrowserActions.click(driver, btnAutoFillIcon_37,"AutoFillIcon_37");
				    return this;
			}
public EnterPayeeInformationPage clickNewCompany(WebDriver driver)  {
					BrowserActions.click(driver, btnNewCompany,"NewCompany");
				    return this;
			}
public EnterPayeeInformationPage enterPayTo(WebDriver driver,String PayTo) {
		            BrowserActions.type(driver, inpPayTo,PayTo, "PayTo");
			        return this;
           }
public EnterPayeeInformationPage enterPercentage(WebDriver driver,String Percentage) {
		            BrowserActions.type(driver, inpPercentage,Percentage, "Percentage");
			        return this;
           }
public EnterPayeeInformationPage clickDoctor(WebDriver driver)  {
					BrowserActions.click(driver, btnDoctor,"Doctor");
				    return this;
			}
public EnterPayeeInformationPage clickValiduntilDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnValiduntilDateIcon,"ValiduntilDateIcon");
				    return this;
			}
public EnterPayeeInformationPage enterPayToTheOrderOf(WebDriver driver,String PayToTheOrderOf) {
		            BrowserActions.type(driver, inpPayToTheOrderOf,PayToTheOrderOf, "PayToTheOrderOf");
			        return this;
           }
public EnterPayeeInformationPage clickDoctor_9(WebDriver driver)  {
					BrowserActions.click(driver, btnDoctor_9,"Doctor_9");
				    return this;
			}
public EnterPayeeInformationPage selectState_39(WebDriver driver,String State_39)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpState_39,State_39,"State_39");
				    return this;
			}
public EnterPayeeInformationPage clickCancel(WebDriver driver)  {
					BrowserActions.click(driver, btnCancel,"Cancel");
				    return this;
			}
public EnterPayeeInformationPage clickRemove_23(WebDriver driver)  {
					BrowserActions.click(driver, btnRemove_23,"Remove_23");
				    return this;
			}
public EnterPayeeInformationPage selectDeliveryMethod(WebDriver driver,String DeliveryMethod)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpDeliveryMethod,DeliveryMethod,"DeliveryMethod");
				    return this;
			}
public EnterPayeeInformationPage enterRecipient(WebDriver driver,String Recipient) {
		            BrowserActions.type(driver, inpRecipient,Recipient, "Recipient");
			        return this;
           }
public EnterPayeeInformationPage clickPrimaryPayee_NameMenuIcon_4(WebDriver driver)  {
					BrowserActions.click(driver, btnPrimaryPayee_NameMenuIcon_4,"PrimaryPayee_NameMenuIcon_4");
				    return this;
			}
public EnterPayeeInformationPage clickValiduntilDateIcon_45(WebDriver driver)  {
					BrowserActions.click(driver, btnValiduntilDateIcon_45,"ValiduntilDateIcon_45");
				    return this;
			}
}
