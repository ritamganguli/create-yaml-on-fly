package com.aspire.guidewire.pc.pages.personalauto;
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

public class DriversPage extends LoadableComponent<DriversPage> {

	WebDriver driver;
	String elementIdentifier;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-AddressesPanelSet-AddressesLV_tb-Remove>div[role='button']", AI = false)
	public WebElement btnRemove_1;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-JobWizardToolbarButtonSet-Draft>div[role='button']", AI = false)
	public WebElement btnSaveDraft;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-0-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0183833208;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-3-item>div[role='menuitem']", AI = false)
	public WebElement btnGetBureauData;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-MotorVehicleRecordCard-PersonalMotorVehicleRecordsDV-RequestedDate']", AI = false)
	public WebElement inpRequestedDate;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Reinsurance>div[role='menuitem']", AI = false)
	public WebElement btnReinsurance;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-BillingInfo>div[role='menuitem']", AI = false)
	public WebElement btnPayment;
	
	@IFindBy(how = How.CSS, using = "div[id$='AddDriver-0-ContactType']", AI = false)
	public WebElement btnNewPerson;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-MotorVehicleRecordCard-PersonalMotorVehicleRecordsDV-LicenseCurrentIssuance']", AI = false)
	public WebElement inpLicenseCurrentIssuance;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Change-WizardMenuActions_ChangeEffDate>div[role='menuitem']", AI = false)
	public WebElement btnEffectiveDate;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-MotorVehicleRecordCard-PersonalMotorVehicleRecordsDV-ReportDate']", AI = false)
	public WebElement inpReportDate;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-QuoteRequestedAlert .gw-AlertBar--label", AI = false)
	public WebElement lblQuoteRequestedAlert;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine3']", AI = false)
	public WebElement inpAddress3;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine1']", AI = false)
	public WebElement inpAddress1;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-PolicyContactDetailsDV-AddressType']", AI = false)
	public WebElement drpAddressType;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine2']", AI = false)
	public WebElement inpAddress2;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewDocument-NewJobDocumentMenuItemSet-PolicyPeriodNewDocumentMenuItemSet_Template>div[role='menuitem']", AI = false)
	public WebElement btnCreatefromatemplate;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-JobWizardToolbarButtonSet-Versions-SideBySide>div[role='menuitem']", AI = false)
	public WebElement btnStartSidebySide;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-PolicyContactDetailsDV-LinkedAddressInputSet-LinkAddressMenu']", AI = false)
	public WebElement inpAddress;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-PolicyContactDetailsDV-ContactCurrency-ContactCurrencyInputSet-PreferredSettlementCurrency']", AI = false)
	public WebElement drpPreferredCurrency;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-PolicyContactDetailsDV-LinkedAddressInputSet-LinkAddressMenu-LinkAddressMenuMenuIcon']", AI = false)
	public WebElement drpLinkAddressMenuMenuIcon;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Archiving>div[role='menuitem']", AI = false)
	public WebElement btnArchiving;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-PostalCode']", AI = false)
	public WebElement inpZIPCode;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-MotorVehicleRecordCard-PersonalMotorVehicleRecordsDV-LicenseReinstatement']", AI = false)
	public WebElement inpLicenseReinstatement;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-City-AutoFillIcon", AI = false)
	public WebElement btnAutoFillIcon;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-JobWizardToolbarButtonSet-CloseOptions-NotTakenJob>div[role='menuitem']", AI = false)
	public WebElement btnNotTaken;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Documents>div[role='menuitem']", AI = false)
	public WebElement btnDocuments;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-OOSEPanelSet-NextSliceLink", AI = false)
	public WebElement btnNextBlockedDate;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-2-item>div[role='menuitem']", AI = false)
	public WebElement btn90daydiary;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-MotorVehicleRecordCard-PersonalMotorVehicleRecordsDV-Name']", AI = false)
	public WebElement inpName;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-JobWizardToolbarButtonSet-QuoteTypeToolbarButtonSet-Quote>div[role='button']", AI = false)
	public WebElement btnQuote;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-MotorVehicleRecordCard-PersonalMotorVehicleRecordsDV-LicenseExpiration']", AI = false)
	public WebElement inpLicenseExpiration;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-PersonalVehicles>div[role='menuitem']", AI = false)
	public WebElement btnVehicles;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-JobWizardToolbarButtonSet-BindOptions>div[role='button']", AI = false)
	public WebElement btnBindOptions;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-Country']", AI = false)
	public WebElement drpCountry;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-State']", AI = false)
	public WebElement drpState;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-JobWizardToolbarButtonSet-Unlock>div[role='button']", AI = false)
	public WebElement btnReleaseLock;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Archiving-WizardMenuActions_SuspendResumeArchiving>div[role='menuitem']", AI = false)
	public WebElement btnEnableDisable;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-JobWizardToolbarButtonSet-BindOptions-BindAndIssue>div[role='menuitem']", AI = false)
	public WebElement btnIssuePolicy;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-0-item>div[role='menuitem']", AI = false)
	public WebElement btnCreateNewProducer;

	@IFindBy(how = How.XPATH, using = "//div[text()='Add']", AI = false)
	public WebElement btnAdd;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Forms>div[role='menuitem']", AI = false)
	public WebElement btnForms;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-MultiQuoteAcceleratedMenuActions-PolicyPeriodSelector", AI = false)
	public WebElement btnPolicyPeriodSelector;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-1-NewActivityMenuItemSet_Category>div[role='menuitem']", AI = false)
	public WebElement btnNewmail;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-AddressesPanelSet-AddressDetailDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-County']", AI = false)
	public WebElement inpCounty_1;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-7-item>div[role='menuitem']", AI = false)
	public WebElement btnGetMotorVehicleReports;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-PreQualification>div[role='menuitem']", AI = false)
	public WebElement btnQualification;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriversLV_tb-AddDriver-AddExistingContact>div[role='button']", AI = false)
	public WebElement btnExistingDriver;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Notes>div[role='menuitem']", AI = false)
	public WebElement btnNotes;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-MotorVehicleRecordCard-PersonalMotorVehicleRecordsDV-LicenseStatus']", AI = false)
	public WebElement inpLicenseStatus;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-ViewMultiLineQuote>div[role='menuitem']", AI = false)
	public WebElement btnQuote_1;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriversLV_tb-RetrieveMVRButton>div[role='button']", AI = false)
	public WebElement btnRetrieveMVR;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-5-item>div[role='menuitem']", AI = false)
	public WebElement btnGetInspectionLossControl;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Participants>div[role='menuitem']", AI = false)
	public WebElement btnParticipants;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create>div[role='menuitem']", AI = false)
	public WebElement btnCreate;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-PALine>div[role='menuitem']", AI = false)
	public WebElement btnPACoverages;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-4-NewActivityMenuItemSet_Category-0-item>div[role='menuitem']", AI = false)
	public WebElement btnReviewandapprove;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-OOSEPanelSet-OOSEPeriodSelector-OOSEPeriodSelector_Arg']", AI = false)
	public WebElement drpEffectiveDate;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-10-item>div[role='menuitem']", AI = false)
	public WebElement btnLegalreview;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewDocument>div[role='menuitem']", AI = false)
	public WebElement btnNewDocument;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-7-item>div[role='menuitem']", AI = false)
	public WebElement btnPolicynotification;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailTitle", AI = false)
	public WebElement lblDriverDetailTitle;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewDocument-NewJobDocumentMenuItemSet-PolicyPeriodNewDocumentMenuItemSet_Linked>div[role='menuitem']", AI = false)
	public WebElement btnUploaddocuments;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Finish>div[role='button']", AI = false)
	public WebElement btnFinish;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-AddressesPanelSet-AddressDetailDV-LinkedAddressInputSet-LinkAddressMenu-EditAddress>div[role='menuitem']", AI = false)
	public WebElement btnEditaddress_1;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-AddressesPanelSet-AddressDetailDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine1']", AI = false)
	public WebElement inpAddress1_1;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-City']", AI = false)
	public WebElement inpCity;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto>div[role='menuitem']", AI = false)
	public WebElement btnGoto;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-PolicyContactDetailsDV-LicenseInputSet-LicenseState']", AI = false)
	public WebElement drpLicenseState;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-AddressesPanelSet-AddressDetailDV-LinkedAddressInputSet-LinkAddressMenu-LinkAddressMenuMenuIcon']", AI = false)
	public WebElement drpLinkAddressMenuMenuIcon_1;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-ProductDefinition>div[role='menuitem']", AI = false)
	public WebElement btnProductDefinition;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-6-item>div[role='menuitem']", AI = false)
	public WebElement btnGetInspectionOutsideService;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-4-NewActivityMenuItemSet_Category>div[role='menuitem']", AI = false)
	public WebElement btnUnderwriterReview;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-0-NewActivityMenuItemSet_Category-0-item>div[role='menuitem']", AI = false)
	public WebElement btnMeetwithInsured;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-0-item>div[role='menuitem']", AI = false)
	public WebElement btn30daydiary;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Offering>div[role='menuitem']", AI = false)
	public WebElement btnOfferings;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-9-item>div[role='menuitem']", AI = false)
	public WebElement btnPolicyReviewRenewal;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewNote>div[role='menuitem']", AI = false)
	public WebElement btnNewNote;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-MotorVehicleRecordCard-PersonalMotorVehicleRecordsDV-Gender']", AI = false)
	public WebElement drpGender;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-SideBySide>div[role='menuitem']", AI = false)
	public WebElement btnSidebySideQuoting;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-RiskAnalysis>div[role='menuitem']", AI = false)
	public WebElement btnRiskAnalysis;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-0-NewActivityMenuItemSet_Category-1-item>div[role='menuitem']", AI = false)
	public WebElement btnMeetwithProducerAgency;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-CollectCreditCard>div[role='menuitem']", AI = false)
	public WebElement btnCollectCreditCard;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-11-item>div[role='menuitem']", AI = false)
	public WebElement btnRatiooutofrange;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-JobWizardToolbarButtonSet-ConvertToFullApp>div[role='button']", AI = false)
	public WebElement btnFullApp;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-PolicyReview>div[role='menuitem']", AI = false)
	public WebElement btnPolicyReview;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-DiagWorksheetItem>div[role='menuitem']", AI = false)
	public WebElement btnDiagnosticData;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-OOSEPanelSet-OOSEPeriodSelector", AI = false)
	public WebElement btnOOSEPeriodSelector;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-MotorVehicleRecordCard-PersonalMotorVehicleRecordsDV-LicenseClass']", AI = false)
	public WebElement inpLicenseClass;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-11-item>div[role='menuitem']", AI = false)
	public WebElement btnManuallyrateandquotepolicy;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-PADrivers>div[role='menuitem']", AI = false)
	public WebElement btnDrivers;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-History>div[role='menuitem']", AI = false)
	public WebElement btnHistory;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category>div[role='menuitem']", AI = false)
	public WebElement btnReminder;

	@IFindBy(how = How.CSS, using = "div[id*='DriversScreen-ttlBar']", AI = false)
	public WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Change>div[role='menuitem']", AI = false)
	public WebElement btnEdit;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-JobWizardToolbarButtonSet-CloseOptions-WithdrawJob>div[role='menuitem']", AI = false)
	public WebElement btnWithdrawTransaction;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-PolicyInfo>div[role='menuitem']", AI = false)
	public WebElement btnPolicyInfo;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-MotorVehicleRecordCard-PersonalMotorVehicleRecordsDV-LicenseNumber']", AI = false)
	public WebElement inpLicenseNumber;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-AddressesPanelSet-AddressDetailDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-State']", AI = false)
	public WebElement drpState_1;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-MotorVehicleRecordCard-PersonalMotorVehicleRecordsDV-DOB1']", AI = false)
	public WebElement inpDateofBirth;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-JobWizardToolbarButtonSet-Versions>div[role='button']", AI = false)
	public WebElement btnVersions;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_ToAccountFile>div[role='menuitem']", AI = false)
	public WebElement btnAccountFile;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-MotorVehicleRecordCard-PersonalMotorVehicleRecordsDV-MVRReportButton>div[role='button']", AI = false)
	public WebElement btnMVRReportButton;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriversLV_tb-Remove>div[role='button']", AI = false)
	public WebElement btnRemove;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-1-NewActivityMenuItemSet_Category-0-item>div[role='menuitem']", AI = false)
	public WebElement btnReviewnewmail;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-AddressesPanelSet-AddressDetailDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine2']", AI = false)
	public WebElement inpAddress2_1;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup>div[role='menuitem']", AI = false)
	public WebElement btnGroup;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-3-item>div[role='menuitem']", AI = false)
	public WebElement btnCancelasplitpolicy;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-MotorVehicleRecordCard-PersonalMotorVehicleRecordsDV-LicenseState']", AI = false)
	public WebElement drpLicenseState_1;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-2-item>div[role='menuitem']", AI = false)
	public WebElement btnGetAuditOutsideService;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Change-WizardMenuActions_CopyPolicyData>div[role='menuitem']", AI = false)
	public WebElement btnCopyData;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-5-item>div[role='menuitem']", AI = false)
	public WebElement btnNewAuditAssignment;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-16-item>div[role='menuitem']", AI = false)
	public WebElement btnRewritetoNewAccount;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-QuoteRequestedAlert-CloseBtn", AI = false)
	public WebElement btnClose;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-12-item>div[role='menuitem']", AI = false)
	public WebElement btnReview30dayUWPeriod;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-ManageBranches>div[role='menuitem']", AI = false)
	public WebElement btnPolicyVersions;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-14-item>div[role='menuitem']", AI = false)
	public WebElement btnReview60dayUWPeriod;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-PolicyContactDetailsDV-LicenseInputSet-LicenseNumber']", AI = false)
	public WebElement inpLicense;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-MotorVehicleRecordCard-PersonalMotorVehicleRecordsDV-LicenseOriginalIssuance']", AI = false)
	public WebElement inpLicenseOriginalIssuance;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-JobWizardToolbarButtonSet-EditPolicy>div[role='button']", AI = false)
	public WebElement btnEditPolicyTransaction;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-AddressesPanelSet-AddressesLV_tb-Add>div[role='button']", AI = false)
	public WebElement btnAdd_1;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity>div[role='menuitem']", AI = false)
	public WebElement btnNewActivity;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Cancel>div[role='button']", AI = false)
	public WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-JobWizardToolbarButtonSet-CloseOptions>div[role='button']", AI = false)
	public WebElement btnCloseOptions;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup>div[role='menuitem']", AI = false)
	public WebElement btnPolicyContract;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-AddressesPanelSet-AddressDetailDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-City']", AI = false)
	public WebElement inpCity_1;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_ToPolicyFile>div[role='menuitem']", AI = false)
	public WebElement btnPolicyFile;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-17-item>div[role='menuitem']", AI = false)
	public WebElement btnVerifycoverage;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category>div[role='menuitem']", AI = false)
	public WebElement btnRequest;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-4-item>div[role='menuitem']", AI = false)
	public WebElement btnGetCreditReports;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-JobWizardToolbarButtonSet-CloseOptions-Decline>div[role='menuitem']", AI = false)
	public WebElement btnDecline;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardActionsMenuItemSet-SubmissionInfo>div[role='menuitem']", AI = false)
	public WebElement btnSubManager;

	@IFindBy(how = How.CSS, using = "div[id$='Next']", AI = false)
	public WebElement btnNext;

	@IFindBy(how = How.CSS, using = "div[id$='RolesCardTab']", AI = false)
	public WebElement tabRoles;

	@IFindBy(how = How.CSS, using = "input[name$='DriversListDetailPanel-DriversLV-0-_Checkbox']", AI = false)
	public WebElement diverChkbox;

	@IFindBy(how = How.CSS, using = "div[id$='DriversListDetailPanel-DriversLV_tb-Remove']", AI = false)
	public WebElement driverremovebtn;

	@IFindBy(how = How.CSS, using = "select[name$='PolicyContactRolePanelSet-DriverNumberOfAccidents']", AI = false)
	public WebElement drpNumberOfAccidentsAccountLevel;

	@IFindBy(how = How.CSS, using = "input[id$='Excluded_0']", AI = false)
	public WebElement rdbYesExcluded;

	@IFindBy(how = How.CSS, using = "input[id$='Excluded_1']", AI = false)
	public WebElement rdbNoExcluded;

	@IFindBy(how = How.CSS, using = "input[id$='ApplicableGoodDriverDiscount_0']", AI = false)
	public WebElement rdbYesApplyDiscount;

	@IFindBy(how = How.CSS, using = "input[id$='ApplicableGoodDriverDiscount_1']", AI = false)
	public WebElement rdbNoApplyDiscount;

	@IFindBy(how = How.CSS, using = "select[name$='PolicyDriverNumberOfAccidents']", AI = false)
	public WebElement drpNumberOfAccidentsPolicyLevel;

	@IFindBy(how = How.CSS, using = "select[name$='PolicyDriverNumberOfViolations']", AI = false)
	public WebElement drpNumberOfViolationsPolicyLevel;

	@IFindBy(how = How.CSS, using = "select[name$='PolicyContactRolePanelSet-DriverNumberOfViolations']", AI = false)
	public WebElement drpNumberOfViolationsAccountLevel;

	@IFindBy(how = How.CSS, using = "input[name$='DriversLV-0-_Checkbox']", AI = false)
	public WebElement chkDriversDetail;

	@IFindBy(how = How.CSS, using = "div[id$='RetrieveMVRButton']", AI = false)
	public WebElement btnRetrieve;

	@IFindBy(how = How.CSS, using = "div[id$='PolicyContactDetailCardTab']", AI = false)
	public WebElement tabContactDetail;


	public DriversPage(){
	}

	public DriversPage(WebDriver driver) {
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, Utils.maxElementWait);
		PageFactory.initElements(finder, this);
		elementLayer = new ElementLayer(driver);
	}
	
	public DriversPage(WebDriver driver,int timeout){
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

	public NewDriverPage clickNewPerson(WebDriver driver)  {
		BrowserActions.click(driver, btnNewPerson,"NewPerson");
		return new NewDriverPage(driver).get();
	}
	public DriversPage clickRemove_1(WebDriver driver)  {
		BrowserActions.click(driver, btnRemove_1,"Remove_1");
		return this;
	}
	public DriversPage clickSaveDraft(WebDriver driver)  {
		BrowserActions.click(driver, btnSaveDraft,"SaveDraft");
		return this;
	}
	public DriversPage clickPA0183833208(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0183833208,"PA0183833208");
		return this;
	}
	public DriversPage clickGetBureauData(WebDriver driver)  {
		BrowserActions.click(driver, btnGetBureauData,"GetBureauData");
		return this;
	}
	public DriversPage enterRequestedDate(WebDriver driver,String RequestedDate) {
		BrowserActions.type(driver, inpRequestedDate,RequestedDate, "RequestedDate");
		return this;
	}
	public DriversPage clickReinsurance(WebDriver driver)  {
		BrowserActions.click(driver, btnReinsurance,"Reinsurance");
		return this;
	}
	public DriversPage clickPayment(WebDriver driver)  {
		BrowserActions.click(driver, btnPayment,"Payment");
		return this;
	}
	public DriversPage enterLicenseCurrentIssuance(WebDriver driver,String LicenseCurrentIssuance) {
		BrowserActions.type(driver, inpLicenseCurrentIssuance,LicenseCurrentIssuance, "LicenseCurrentIssuance");
		return this;
	}
	public DriversPage clickEffectiveDate(WebDriver driver)  {
		BrowserActions.click(driver, btnEffectiveDate,"EffectiveDate");
		return this;
	}
	public DriversPage enterReportDate(WebDriver driver,String ReportDate) {
		BrowserActions.type(driver, inpReportDate,ReportDate, "ReportDate");
		return this;
	}
	public DriversPage enterAddress3(WebDriver driver,String Address3) {
		BrowserActions.type(driver, inpAddress3,Address3, "Address3");
		return this;
	}
	public DriversPage enterAddress1(WebDriver driver,String Address1) {
		BrowserActions.type(driver, inpAddress1,Address1, "Address1");
		return this;
	}
	public DriversPage selectAddressType(WebDriver driver,String AddressType)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpAddressType,AddressType,"AddressType");
		return this;
	}
	public DriversPage enterAddress2(WebDriver driver,String Address2) {
		BrowserActions.type(driver, inpAddress2,Address2, "Address2");
		return this;
	}
	public DriversPage clickCreatefromatemplate(WebDriver driver)  {
		BrowserActions.click(driver, btnCreatefromatemplate,"Createfromatemplate");
		return this;
	}
	public DriversPage clickStartSidebySide(WebDriver driver)  {
		BrowserActions.click(driver, btnStartSidebySide,"StartSidebySide");
		return this;
	}
	public DriversPage enterAddress(WebDriver driver,String Address) {
		BrowserActions.type(driver, inpAddress,Address, "Address");
		return this;
	}
	public DriversPage selectPreferredCurrency(WebDriver driver,String PreferredCurrency)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPreferredCurrency,PreferredCurrency,"PreferredCurrency");
		return this;
	}
	public DriversPage selectLinkAddressMenuMenuIcon(WebDriver driver,String LinkAddressMenuMenuIcon)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpLinkAddressMenuMenuIcon,LinkAddressMenuMenuIcon,"LinkAddressMenuMenuIcon");
		return this;
	}
	public DriversPage clickArchiving(WebDriver driver)  {
		BrowserActions.click(driver, btnArchiving,"Archiving");
		return this;
	}
	public DriversPage enterZIPCode(WebDriver driver,String ZIPCode) {
		BrowserActions.type(driver, inpZIPCode,ZIPCode, "ZIPCode");
		return this;
	}
	public DriversPage enterLicenseReinstatement(WebDriver driver,String LicenseReinstatement) {
		BrowserActions.type(driver, inpLicenseReinstatement,LicenseReinstatement, "LicenseReinstatement");
		return this;
	}
	public DriversPage clickAutoFillIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnAutoFillIcon,"AutoFillIcon");
		return this;
	}
	public DriversPage clickNotTaken(WebDriver driver)  {
		BrowserActions.click(driver, btnNotTaken,"NotTaken");
		return this;
	}
	public DriversPage clickDocuments(WebDriver driver)  {
		BrowserActions.click(driver, btnDocuments,"Documents");
		return this;
	}
	public DriversPage clickNextBlockedDate(WebDriver driver)  {
		BrowserActions.click(driver, btnNextBlockedDate,"NextBlockedDate");
		return this;
	}
	public DriversPage click90daydiary(WebDriver driver)  {
		BrowserActions.click(driver, btn90daydiary,"90daydiary");
		return this;
	}
	public DriversPage enterName(WebDriver driver,String Name) {
		BrowserActions.type(driver, inpName,Name, "Name");
		return this;
	}
	public DriversPage clickQuote(WebDriver driver)  {
		BrowserActions.click(driver, btnQuote,"Quote");
		return this;
	}
	public DriversPage enterLicenseExpiration(WebDriver driver,String LicenseExpiration) {
		BrowserActions.type(driver, inpLicenseExpiration,LicenseExpiration, "LicenseExpiration");
		return this;
	}
	public DriversPage clickVehicles(WebDriver driver)  {
		BrowserActions.click(driver, btnVehicles,"Vehicles");
		return this;
	}
	public DriversPage clickBindOptions(WebDriver driver)  {
		BrowserActions.click(driver, btnBindOptions,"BindOptions");
		return this;
	}
	public DriversPage selectCountry(WebDriver driver,String Country)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCountry,Country,"Country");
		return this;
	}
	public DriversPage selectState(WebDriver driver,String State)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpState,State,"State");
		return this;
	}
	public DriversPage clickReleaseLock(WebDriver driver)  {
		BrowserActions.click(driver, btnReleaseLock,"ReleaseLock");
		return this;
	}
	public DriversPage clickEnableDisable(WebDriver driver)  {
		BrowserActions.click(driver, btnEnableDisable,"EnableDisable");
		return this;
	}
	public DriversPage clickIssuePolicy(WebDriver driver)  {
		BrowserActions.click(driver, btnIssuePolicy,"IssuePolicy");
		return this;
	}
	public DriversPage clickCreateNewProducer(WebDriver driver)  {
		BrowserActions.click(driver, btnCreateNewProducer,"CreateNewProducer");
		return this;
	}
	public DriversPage clickAdd(WebDriver driver)  {
		BrowserActions.click(driver, btnAdd,"Add");
		return this;
	}
	public DriversPage clickForms(WebDriver driver)  {
		BrowserActions.click(driver, btnForms,"Forms");
		return this;
	}
	public DriversPage clickPolicyPeriodSelector(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyPeriodSelector,"PolicyPeriodSelector");
		return this;
	}
	public DriversPage clickNewmail(WebDriver driver)  {
		BrowserActions.click(driver, btnNewmail,"Newmail");
		return this;
	}
	public DriversPage enterCounty_1(WebDriver driver,String County_1) {
		BrowserActions.type(driver, inpCounty_1,County_1, "County_1");
		return this;
	}
	public DriversPage clickGetMotorVehicleReports(WebDriver driver)  {
		BrowserActions.click(driver, btnGetMotorVehicleReports,"GetMotorVehicleReports");
		return this;
	}
	public DriversPage clickQualification(WebDriver driver)  {
		BrowserActions.click(driver, btnQualification,"Qualification");
		return this;
	}
	public DriversPage clickExistingDriver(WebDriver driver)  {
		BrowserActions.click(driver, btnExistingDriver,"ExistingDriver");
		return this;
	}
	public DriversPage clickNotes(WebDriver driver)  {
		BrowserActions.click(driver, btnNotes,"Notes");
		return this;
	}
	public DriversPage enterLicenseStatus(WebDriver driver,String LicenseStatus) {
		BrowserActions.type(driver, inpLicenseStatus,LicenseStatus, "LicenseStatus");
		return this;
	}
	public DriversPage clickQuote_1(WebDriver driver)  {
		BrowserActions.click(driver, btnQuote_1,"Quote_1");
		return this;
	}
	public DriversPage clickRetrieveMVR(WebDriver driver)  {
		BrowserActions.click(driver, btnRetrieveMVR,"RetrieveMVR");
		return this;
	}
	public DriversPage clickGetInspectionLossControl(WebDriver driver)  {
		BrowserActions.click(driver, btnGetInspectionLossControl,"GetInspectionLossControl");
		return this;
	}
	public DriversPage clickParticipants(WebDriver driver)  {
		BrowserActions.click(driver, btnParticipants,"Participants");
		return this;
	}
	public DriversPage clickCreate(WebDriver driver)  {
		BrowserActions.click(driver, btnCreate,"Create");
		return this;
	}
	public DriversPage clickPACoverages(WebDriver driver)  {
		BrowserActions.click(driver, btnPACoverages,"PACoverages");
		return this;
	}
	public DriversPage clickReviewandapprove(WebDriver driver)  {
		BrowserActions.click(driver, btnReviewandapprove,"Reviewandapprove");
		return this;
	}
	public DriversPage selectEffectiveDate(WebDriver driver,String EffectiveDate)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpEffectiveDate,EffectiveDate,"EffectiveDate");
		return this;
	}
	public DriversPage clickLegalreview(WebDriver driver)  {
		BrowserActions.click(driver, btnLegalreview,"Legalreview");
		return this;
	}
	public DriversPage clickNewDocument(WebDriver driver)  {
		BrowserActions.click(driver, btnNewDocument,"NewDocument");
		return this;
	}
	public DriversPage clickPolicynotification(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicynotification,"Policynotification");
		return this;
	}
	public DriversPage clickUploaddocuments(WebDriver driver)  {
		BrowserActions.click(driver, btnUploaddocuments,"Uploaddocuments");
		return this;
	}
	public DriversPage clickFinish(WebDriver driver)  {
		BrowserActions.click(driver, btnFinish,"Finish");
		return this;
	}
	public DriversPage clickEditaddress_1(WebDriver driver)  {
		BrowserActions.click(driver, btnEditaddress_1,"Editaddress_1");
		return this;
	}
	public DriversPage enterAddress1_1(WebDriver driver,String Address1_1) {
		BrowserActions.type(driver, inpAddress1_1,Address1_1, "Address1_1");
		return this;
	}
	public DriversPage enterCity(WebDriver driver,String City) {
		BrowserActions.type(driver, inpCity,City, "City");
		return this;
	}
	public DriversPage clickGoto(WebDriver driver)  {
		BrowserActions.click(driver, btnGoto,"Goto");
		return this;
	}
	public DriversPage selectLicenseState(WebDriver driver,String LicenseState)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpLicenseState,LicenseState,"LicenseState");
		return this;
	}
	public DriversPage selectLinkAddressMenuMenuIcon_1(WebDriver driver,String LinkAddressMenuMenuIcon_1)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpLinkAddressMenuMenuIcon_1,LinkAddressMenuMenuIcon_1,"LinkAddressMenuMenuIcon_1");
		return this;
	}
	public DriversPage clickProductDefinition(WebDriver driver)  {
		BrowserActions.click(driver, btnProductDefinition,"ProductDefinition");
		return this;
	}
	public DriversPage clickGetInspectionOutsideService(WebDriver driver)  {
		BrowserActions.click(driver, btnGetInspectionOutsideService,"GetInspectionOutsideService");
		return this;
	}
	public DriversPage clickUnderwriterReview(WebDriver driver)  {
		BrowserActions.click(driver, btnUnderwriterReview,"UnderwriterReview");
		return this;
	}
	public DriversPage clickMeetwithInsured(WebDriver driver)  {
		BrowserActions.click(driver, btnMeetwithInsured,"MeetwithInsured");
		return this;
	}
	public DriversPage click30daydiary(WebDriver driver)  {
		BrowserActions.click(driver, btn30daydiary,"30daydiary");
		return this;
	}
	public DriversPage clickOfferings(WebDriver driver)  {
		BrowserActions.click(driver, btnOfferings,"Offerings");
		return this;
	}
	public DriversPage clickPolicyReviewRenewal(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyReviewRenewal,"PolicyReviewRenewal");
		return this;
	}
	public DriversPage clickNewNote(WebDriver driver)  {
		BrowserActions.click(driver, btnNewNote,"NewNote");
		return this;
	}
	public DriversPage selectGender(WebDriver driver,String Gender)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpGender,Gender,"Gender");
		return this;
	}
	public DriversPage clickSidebySideQuoting(WebDriver driver)  {
		BrowserActions.click(driver, btnSidebySideQuoting,"SidebySideQuoting");
		return this;
	}
	public DriversPage clickRiskAnalysis(WebDriver driver)  {
		BrowserActions.click(driver, btnRiskAnalysis,"RiskAnalysis");
		return this;
	}
	public DriversPage clickMeetwithProducerAgency(WebDriver driver)  {
		BrowserActions.click(driver, btnMeetwithProducerAgency,"MeetwithProducerAgency");
		return this;
	}
	public DriversPage clickCollectCreditCard(WebDriver driver)  {
		BrowserActions.click(driver, btnCollectCreditCard,"CollectCreditCard");
		return this;
	}
	public DriversPage clickRatiooutofrange(WebDriver driver)  {
		BrowserActions.click(driver, btnRatiooutofrange,"Ratiooutofrange");
		return this;
	}
	public DriversPage clickFullApp(WebDriver driver)  {
		BrowserActions.click(driver, btnFullApp,"FullApp");
		return this;
	}
	public DriversPage clickPolicyReview(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyReview,"PolicyReview");
		return this;
	}
	public DriversPage clickDiagnosticData(WebDriver driver)  {
		BrowserActions.click(driver, btnDiagnosticData,"DiagnosticData");
		return this;
	}
	public DriversPage clickOOSEPeriodSelector(WebDriver driver)  {
		BrowserActions.click(driver, btnOOSEPeriodSelector,"OOSEPeriodSelector");
		return this;
	}
	public DriversPage enterLicenseClass(WebDriver driver,String LicenseClass) {
		BrowserActions.type(driver, inpLicenseClass,LicenseClass, "LicenseClass");
		return this;
	}
	public DriversPage clickManuallyrateandquotepolicy(WebDriver driver)  {
		BrowserActions.click(driver, btnManuallyrateandquotepolicy,"Manuallyrateandquotepolicy");
		return this;
	}
	public DriversPage clickDrivers(WebDriver driver)  {
		BrowserActions.click(driver, btnDrivers,"Drivers");
		return this;
	}
	public DriversPage clickHistory(WebDriver driver)  {
		BrowserActions.click(driver, btnHistory,"History");
		return this;
	}
	public DriversPage clickReminder(WebDriver driver)  {
		BrowserActions.click(driver, btnReminder,"Reminder");
		return this;
	}
	public DriversPage clickEdit(WebDriver driver)  {
		BrowserActions.click(driver, btnEdit,"Edit");
		return this;
	}
	public DriversPage clickWithdrawTransaction(WebDriver driver)  {
		BrowserActions.click(driver, btnWithdrawTransaction,"WithdrawTransaction");
		return this;
	}
	public DriversPage clickPolicyInfo(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyInfo,"PolicyInfo");
		return this;
	}
	public DriversPage enterLicenseNumber(WebDriver driver,String LicenseNumber) {
		BrowserActions.type(driver, inpLicenseNumber,LicenseNumber, "LicenseNumber");
		return this;
	}
	public DriversPage selectState_1(WebDriver driver,String State_1)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpState_1,State_1,"State_1");
		return this;
	}
	public DriversPage enterDateofBirth(WebDriver driver,String DateofBirth) {
		BrowserActions.type(driver, inpDateofBirth,DateofBirth, "DateofBirth");
		return this;
	}
	public DriversPage clickVersions(WebDriver driver)  {
		BrowserActions.click(driver, btnVersions,"Versions");
		return this;
	}
	public DriversPage clickAccountFile(WebDriver driver)  {
		BrowserActions.click(driver, btnAccountFile,"AccountFile");
		return this;
	}
	public DriversPage clickMVRReportButton(WebDriver driver)  {
		BrowserActions.click(driver, btnMVRReportButton,"MVRReportButton");
		return this;
	}
	public DriversPage clickRemove(WebDriver driver)  {
		BrowserActions.click(driver, btnRemove,"Remove");
		return this;
	}
	public DriversPage clickReviewnewmail(WebDriver driver)  {
		BrowserActions.click(driver, btnReviewnewmail,"Reviewnewmail");
		return this;
	}
	public DriversPage enterAddress2_1(WebDriver driver,String Address2_1) {
		BrowserActions.type(driver, inpAddress2_1,Address2_1, "Address2_1");
		return this;
	}
	public DriversPage clickGroup(WebDriver driver)  {
		BrowserActions.click(driver, btnGroup,"Group");
		return this;
	}
	public DriversPage clickCancelasplitpolicy(WebDriver driver)  {
		BrowserActions.click(driver, btnCancelasplitpolicy,"Cancelasplitpolicy");
		return this;
	}
	public DriversPage selectLicenseState_1(WebDriver driver,String LicenseState_1)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpLicenseState_1,LicenseState_1,"LicenseState_1");
		return this;
	}
	public DriversPage clickGetAuditOutsideService(WebDriver driver)  {
		BrowserActions.click(driver, btnGetAuditOutsideService,"GetAuditOutsideService");
		return this;
	}
	public DriversPage clickCopyData(WebDriver driver)  {
		BrowserActions.click(driver, btnCopyData,"CopyData");
		return this;
	}
	public DriversPage clickNewAuditAssignment(WebDriver driver)  {
		BrowserActions.click(driver, btnNewAuditAssignment,"NewAuditAssignment");
		return this;
	}
	public DriversPage clickRewritetoNewAccount(WebDriver driver)  {
		BrowserActions.click(driver, btnRewritetoNewAccount,"RewritetoNewAccount");
		return this;
	}
	public DriversPage clickClose(WebDriver driver)  {
		BrowserActions.click(driver, btnClose,"Close");
		return this;
	}
	public DriversPage clickReview30dayUWPeriod(WebDriver driver)  {
		BrowserActions.click(driver, btnReview30dayUWPeriod,"Review30dayUWPeriod");
		return this;
	}
	public DriversPage clickPolicyVersions(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyVersions,"PolicyVersions");
		return this;
	}
	public DriversPage clickReview60dayUWPeriod(WebDriver driver)  {
		BrowserActions.click(driver, btnReview60dayUWPeriod,"Review60dayUWPeriod");
		return this;
	}
	public DriversPage clickNext(WebDriver driver)  {
		BrowserActions.click(driver, btnNext,0.5,"Next");
		return this;
	}
	public DriversPage enterLicense(WebDriver driver,String License) {
		BrowserActions.type(driver, inpLicense,License, "License");
		return this;
	}
	public DriversPage enterLicenseOriginalIssuance(WebDriver driver,String LicenseOriginalIssuance) {
		BrowserActions.type(driver, inpLicenseOriginalIssuance,LicenseOriginalIssuance, "LicenseOriginalIssuance");
		return this;
	}
	public DriversPage clickEditPolicyTransaction(WebDriver driver)  {
		BrowserActions.click(driver, btnEditPolicyTransaction,"EditPolicyTransaction");
		return this;
	}
	public DriversPage clickAdd_1(WebDriver driver)  {
		BrowserActions.click(driver, btnAdd_1,"Add_1");
		return this;
	}
	public DriversPage clickNewActivity(WebDriver driver)  {
		BrowserActions.click(driver, btnNewActivity,"NewActivity");
		return this;
	}
	public DriversPage clickCancel(WebDriver driver)  {
		BrowserActions.click(driver, btnCancel,"Cancel");
		return this;
	}
	public DriversPage clickCloseOptions(WebDriver driver)  {
		BrowserActions.click(driver, btnCloseOptions,"CloseOptions");
		return this;
	}
	public DriversPage clickPolicyContract(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyContract,"PolicyContract");
		return this;
	}
	public DriversPage enterCity_1(WebDriver driver,String City_1) {
		BrowserActions.type(driver, inpCity_1,City_1, "City_1");
		return this;
	}
	public DriversPage clickPolicyFile(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyFile,"PolicyFile");
		return this;
	}
	public DriversPage clickVerifycoverage(WebDriver driver)  {
		BrowserActions.click(driver, btnVerifycoverage,"Verifycoverage");
		return this;
	}
	public DriversPage clickRequest(WebDriver driver)  {
		BrowserActions.click(driver, btnRequest,"Request");
		return this;
	}
	public DriversPage clickGetCreditReports(WebDriver driver)  {
		BrowserActions.click(driver, btnGetCreditReports,"GetCreditReports");
		return this;
	}
	public DriversPage clickDecline(WebDriver driver)  {
		BrowserActions.click(driver, btnDecline,"Decline");
		return this;
	}
	public DriversPage clickSubManager(WebDriver driver)  {
		BrowserActions.click(driver, btnSubManager,"SubManager");
		return this;
	}
	public DriversPage clickRoles(WebDriver driver) {
		BrowserActions.click(driver, tabRoles, "Roles tab");
		return this;
	}
	public DriversPage clickDriverChkBox(WebDriver driver) {
		BrowserActions.click(driver, diverChkbox, "Diver check box");
		return this;
	}
	public DriversPage clickDriverRemoveButton(WebDriver driver) {
		BrowserActions.click(driver, driverremovebtn, "driver remove button");
		return this;
	}
	public DriversPage selectNumberOfAccidentsAccountLevel(WebDriver driver,String count) {
		BrowserActions.selectDropDownByVisibleText(driver,drpNumberOfAccidentsAccountLevel ,count,"Number of accidents account level");
		return this;
	}
	public DriversPage selectNumberOfAccidentsPolicyLevel(WebDriver driver,String count) {
		BrowserActions.selectDropDownByVisibleText(driver, drpNumberOfAccidentsPolicyLevel,count,"Number of accidents policy level");
		return this;
	}
	public DriversPage selectNumberOfViolationsPolicyLevel(WebDriver driver,String count) {
		BrowserActions.selectDropDownByVisibleText(driver,drpNumberOfViolationsPolicyLevel ,count,"Number of violations policy level");
		return this;
	}
	public DriversPage selectNumberOfViolationsAccountLevel(WebDriver driver,String count) {
		BrowserActions.selectDropDownByVisibleText(driver,drpNumberOfViolationsAccountLevel ,count,"Number of violations account level");
		return this;
	}
	public DriversPage clickDriverDetail(WebDriver driver) {
		BrowserActions.click(driver, chkDriversDetail, "Driver Details");
		return this;
	}
	public DriversPage clickRetreive(WebDriver driver) {
		BrowserActions.click(driver, btnRetrieve, "Retrieve button");
		return this;
	}
	public DriversPage clickContactDetails(WebDriver driver) {
		BrowserActions.click(driver, tabContactDetail, "Contact Detail tab");
		return this;
	}

	public class NewDriverPage extends LoadableComponent<NewDriverPage> {

		WebDriver driver;
		String elementIdentifier;
		String elementObject;
		private boolean isPageLoaded;
		public ElementLayer elementLayer;
		HashMap<String, String> getPageObjects;
		public  List<Object> pageFactoryKey = new ArrayList<Object>();
		public  List<String> pageFactoryValue = new ArrayList<String>();

		//TopNavBar object
		//public TopNavBar topnavbar;
		@IFindBy(how = How.CSS, using = "#NewPolicyDriverPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactRoleDetailCardTab", AI = false)
		public WebElement btnContactDetail;

		@IFindBy(how = How.CSS, using = "select[name='NewPolicyDriverPopup-ContactDetailScreen-PolicyDriverInfoDV-trainingclasstype']", AI = false)
		public WebElement drpTrainingClassType;

		@IFindBy(how = How.CSS, using = "input[name='NewPolicyDriverPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-HomePhone-GlobalPhoneInputSet-PhoneDisplay']", AI = false)
		public WebElement inpHomePhone_1;

		@IFindBy(how = How.CSS, using = "#NewPolicyDriverPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-LinkedAddressInputSet-LinkAddressMenu-EditAddress>div[role='menuitem']", AI = false)
		public WebElement btnEditaddress;

		@IFindBy(how = How.CSS, using = "select[name='NewPolicyDriverPopup-ContactDetailScreen-PolicyDriverInfoDV-numberofviolations']", AI = false)
		public WebElement drpNumberofViolations;

		@IFindBy(how = How.CSS, using = "#NewPolicyDriverPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-PostalCode-AutoFillIcon", AI = false)
		public WebElement btnAutoFillIcon_1;

		@IFindBy(how = How.CSS, using = "input[name$='LastName']", AI = false)
		public WebElement inpLastname;

		@IFindBy(how = How.CSS, using = "select[name='NewPolicyDriverPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-PrimaryPhone']", AI = false)
		public WebElement drpPrimaryPhone;

		@IFindBy(how = How.CSS, using = "input[name='NewPolicyDriverPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressDescription']", AI = false)
		public WebElement inpAddressDescription;

		@IFindBy(how = How.CSS, using = "input[name='NewPolicyDriverPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-County']", AI = false)
		public WebElement inpCounty;

		@IFindBy(how = How.CSS, using = "input[name='NewPolicyDriverPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-FaxPhone-GlobalPhoneInputSet-NationalSubscriberNumber']", AI = false)
		public WebElement inpFaxPhone;

		@IFindBy(how = How.CSS, using = "input[name='NewPolicyDriverPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressSummary']", AI = false)
		public WebElement inpAddress_1;

		@IFindBy(how = How.CSS, using = "input[name='NewPolicyDriverPopup-ContactDetailScreen-PolicyDriverInfoDV-Excluded']", AI = false)
		public WebElement rdbExcluded;

		@IFindBy(how = How.CSS, using = "input[name='NewPolicyDriverPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-HomePhone-GlobalPhoneInputSet-NationalSubscriberNumber']", AI = false)
		public WebElement inpHomePhone;

		@IFindBy(how = How.CSS, using = "input[name='NewPolicyDriverPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-EmailAddress2']", AI = false)
		public WebElement inpSecondaryEmail;

		@IFindBy(how = How.CSS, using = "input[name='NewPolicyDriverPopup-ContactDetailScreen-PolicyDriverInfoDV-student']", AI = false)
		public WebElement rdbGoodStudent;

		@IFindBy(how = How.CSS, using = "input[name$='FirstName']", AI = false)
		public WebElement inpFirstname;

		@IFindBy(how = How.CSS, using = "input[name='NewPolicyDriverPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-CellPhone-GlobalPhoneInputSet-NationalSubscriberNumber']", AI = false)
		public WebElement inpMobilePhone;

		@IFindBy(how = How.CSS, using = "input[name$='yearlicensed']", AI = false)
		public WebElement inpYearFirstLicensed;

		@IFindBy(how = How.CSS, using = "input[name='NewPolicyDriverPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine3']", AI = false)
		public WebElement inpAddress3;

		@IFindBy(how = How.CSS, using = "select[name='NewPolicyDriverPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-HomePhone-GlobalPhoneInputSet-CountryCode']", AI = false)
		public WebElement drpHomePhoneRegionCode;

		@IFindBy(how = How.CSS, using = "input[name='NewPolicyDriverPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine1']", AI = false)
		public WebElement inpAddress1;

		@IFindBy(how = How.CSS, using = "select[name='NewPolicyDriverPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressType']", AI = false)
		public WebElement drpAddressType;

		@IFindBy(how = How.CSS, using = "input[name='NewPolicyDriverPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine2']", AI = false)
		public WebElement inpAddress2;

		@IFindBy(how = How.CSS, using = "input[name='NewPolicyDriverPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-OfficialIDInputSet-OfficialIDDV_Input']", AI = false)
		public WebElement inpSSN;

		@IFindBy(how = How.CSS, using = "input[name='NewPolicyDriverPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-LinkedAddressInputSet-LinkAddressMenu']", AI = false)
		public WebElement inpAddress;

		@IFindBy(how = How.CSS, using = "select[name='NewPolicyDriverPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-ContactCurrency-ContactCurrencyInputSet-PreferredSettlementCurrency']", AI = false)
		public WebElement drpPreferredCurrency;

		@IFindBy(how = How.CSS, using = "#NewPolicyDriverPopup-ContactDetailScreen-CheckForDuplicates>div[role='button']", AI = false)
		public WebElement btnCheckforDuplicates;

		@IFindBy(how = How.CSS, using = "select[name='NewPolicyDriverPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-LinkedAddressInputSet-LinkAddressMenu-LinkAddressMenuMenuIcon']", AI = false)
		public WebElement drpLinkAddressMenuMenuIcon;

		@IFindBy(how = How.CSS, using = "input[name$='PostalCode']", AI = false)
		public WebElement inpZIPCode;

		@IFindBy(how = How.CSS, using = "#NewPolicyDriverPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-City-AutoFillIcon", AI = false)
		public WebElement btnAutoFillIcon;

		@IFindBy(how = How.CSS, using = "input[name='NewPolicyDriverPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-WorkPhone-GlobalPhoneInputSet-Extension']", AI = false)
		public WebElement inpWorkPhoneExtension;

		@IFindBy(how = How.CSS, using = "select[name='NewPolicyDriverPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-FaxPhone-GlobalPhoneInputSet-CountryCode']", AI = false)
		public WebElement drpFaxPhoneRegionCode;

		@IFindBy(how = How.CSS, using = "select[name='NewPolicyDriverPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-CellPhone-GlobalPhoneInputSet-CountryCode']", AI = false)
		public WebElement drpMobilePhoneRegionCode;

		@IFindBy(how = How.CSS, using = "select[name='NewPolicyDriverPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-GlobalPersonNameInputSet-Prefix']", AI = false)
		public WebElement drpPrefix;

		@IFindBy(how = How.CSS, using = "input[name='NewPolicyDriverPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-GlobalPersonNameInputSet-NameSummary']", AI = false)
		public WebElement inpName;

		@IFindBy(how = How.CSS, using = "input[name='NewPolicyDriverPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-FaxPhone-GlobalPhoneInputSet-PhoneDisplay']", AI = false)
		public WebElement inpFaxPhone_1;

		@IFindBy(how = How.CSS, using = "input[name='NewPolicyDriverPopup-ContactDetailScreen-PolicyDriverInfoDV-ApplicableGoodDriverDiscount']", AI = false)
		public WebElement rdbApplyGoodDriverDiscount;

		@IFindBy(how = How.CSS, using = "input[name='NewPolicyDriverPopup-ContactDetailScreen-PolicyDriverInfoDV-gooddriverdiscount']", AI = false)
		public WebElement rdbGooddriverdiscount;

		@IFindBy(how = How.CSS, using = "select[name='NewPolicyDriverPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-Country']", AI = false)
		public WebElement drpCountry;

		@IFindBy(how = How.CSS, using = "select[name='NewPolicyDriverPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-GlobalPersonNameInputSet-Suffix']", AI = false)
		public WebElement drpSuffix;

		@IFindBy(how = How.CSS, using = "select[name='NewPolicyDriverPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-State']", AI = false)
		public WebElement drpState;

		@IFindBy(how = How.CSS, using = "select[name='NewPolicyDriverPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-MaritalStatus']", AI = false)
		public WebElement drpMaritalStatus;

		@IFindBy(how = How.CSS, using = "input[name='NewPolicyDriverPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-HomePhone-GlobalPhoneInputSet-Extension']", AI = false)
		public WebElement inpHomePhoneExtension;

		@IFindBy(how = How.CSS, using = "input[name='NewPolicyDriverPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-GlobalPersonNameInputSet-Particle']", AI = false)
		public WebElement inpParticle;

		@IFindBy(how = How.CSS, using = "input[name='NewPolicyDriverPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-CellPhone-GlobalPhoneInputSet-Extension']", AI = false)
		public WebElement inpMobilePhoneExtension;

		@IFindBy(how = How.CSS, using = "input[name='NewPolicyDriverPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-City']", AI = false)
		public WebElement inpCity;

		@IFindBy(how = How.CSS, using = "select[name='NewPolicyDriverPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-LicenseInputSet-LicenseState']", AI = false)
		public WebElement drpLicenseState;

		@IFindBy(how = How.CSS, using = "select[name='NewPolicyDriverPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-WorkPhone-GlobalPhoneInputSet-CountryCode']", AI = false)
		public WebElement drpWorkPhoneRegionCode;

		@IFindBy(how = How.CSS, using = "#NewPolicyDriverPopup-ContactDetailScreen-ForceDupCheckUpdate>div[role='button']", AI = false)
		public WebElement btnOK;

		@IFindBy(how = How.CSS, using = "#NewPolicyDriverPopup-ContactDetailScreen-Update>div[role='button']", AI = false)
		public WebElement btnOK_1;

		@IFindBy(how = How.CSS, using = "#NewPolicyDriverPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-LinkedAddressInputSet-LinkAddressMenu-0-contactDetail>div[role='menuitem']", AI = false)
		public WebElement btnAaabbbbPrimaryNamedInsured;

		@IFindBy(how = How.CSS, using = "#NewPolicyDriverPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-LinkedAddressInputSet-LinkAddressMenu-0-contactDetail-PrimaryAddress>div[role='menuitem']", AI = false)
		public WebElement btn19FloridaCityFL11111;

		@IFindBy(how = How.CSS, using = "#NewPolicyDriverPopup-__crumb__", AI = false)
		public WebElement btnReturntoDrivers;

		@IFindBy(how = How.CSS, using = "input[name='NewPolicyDriverPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-WorkPhone-GlobalPhoneInputSet-PhoneDisplay']", AI = false)
		public WebElement inpWorkPhone_1;

		@IFindBy(how = How.CSS, using = "#NewPolicyDriverPopup-ContactDetailScreen-ttlBar", AI = false)
		public WebElement lblTtlBar;

		@IFindBy(how = How.CSS, using = "#NewPolicyDriverPopup-ContactDetailScreen-Edit>div[role='button']", AI = false)
		public WebElement btnEdit;

		@IFindBy(how = How.CSS, using = "input[name='NewPolicyDriverPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-EmailAddress1']", AI = false)
		public WebElement inpPrimaryEmail;

		@IFindBy(how = How.CSS, using = "input[name='NewPolicyDriverPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-DateOfBirth']", AI = false)
		public WebElement inpDateofBirth;

		@IFindBy(how = How.CSS, using = "input[name='NewPolicyDriverPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-GlobalPersonNameInputSet-MiddleName']", AI = false)
		public WebElement inpMiddlename;

		@IFindBy(how = How.CSS, using = "input[name='NewPolicyDriverPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-CellPhone-GlobalPhoneInputSet-PhoneDisplay']", AI = false)
		public WebElement inpMobilePhone_1;

		@IFindBy(how = How.CSS, using = "input[name$='LicenseNumber']", AI = false)
		public WebElement inpLicense;

		@IFindBy(how = How.CSS, using = "input[name='NewPolicyDriverPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-WorkPhone-GlobalPhoneInputSet-NationalSubscriberNumber']", AI = false)
		public WebElement inpWorkPhone;

		@IFindBy(how = How.CSS, using = "#NewPolicyDriverPopup-ContactDetailScreen-Cancel>div[role='button']", AI = false)
		public WebElement btnCancel;

		@IFindBy(how = How.CSS, using = "input[name='NewPolicyDriverPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-FaxPhone-GlobalPhoneInputSet-Extension']", AI = false)
		public WebElement inpFaxPhoneExtension;

		@IFindBy(how = How.CSS, using = "select[name='NewPolicyDriverPopup-ContactDetailScreen-PolicyDriverInfoDV-numberofaccidents']", AI = false)
		public WebElement drpNumberofAccidents;

		@IFindBy(how = How.CSS, using = "input[name='NewPolicyDriverPopup-ContactDetailScreen-PolicyDriverInfoDV-datecompletedtrainingclass']", AI = false)
		public WebElement inpDateCompletedTrainingClass;

		@IFindBy(how = How.CSS, using = "input[id$='student_0']", AI = false)
		public WebElement rdbYesGoodStudent;

		@IFindBy(how = How.CSS, using = "input[id$='student_1']", AI = false)
		public WebElement rdbNoGoodStudent;

		@IFindBy(how = How.CSS, using = "input[id$='gooddriverdiscount_0']", AI = false)
		public WebElement rdbYesQualifiesForAGoodDriverDiscount;

		@IFindBy(how = How.CSS, using = "input[id$='gooddriverdiscount_1']", AI = false)
		public WebElement rdbNoQualifiesForAGoodDriverDiscount;


		public NewDriverPage(){
		}

		public NewDriverPage(WebDriver driver){
			this.driver = driver;
			ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, Utils.maxElementWait);
			PageFactory.initElements(finder, this);
			elementLayer = new ElementLayer(driver);
		}
		
		public NewDriverPage(WebDriver driver,int timeout){
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
		public NewDriverPage clickContactDetail(WebDriver driver)  {
			BrowserActions.click(driver, btnContactDetail,"ContactDetail");
			return this;
		}
		public NewDriverPage selectTrainingClassType(WebDriver driver,String TrainingClassType)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpTrainingClassType,TrainingClassType,"TrainingClassType");
			return this;
		}
		public NewDriverPage enterHomePhone_1(WebDriver driver,String HomePhone_1) {
			BrowserActions.type(driver, inpHomePhone_1,HomePhone_1, "HomePhone_1");
			return this;
		}
		public NewDriverPage clickEditaddress(WebDriver driver)  {
			BrowserActions.click(driver, btnEditaddress,"Editaddress");
			return this;
		}
		public NewDriverPage selectNumberofViolations(WebDriver driver,String NumberofViolations)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpNumberofViolations,NumberofViolations,"NumberofViolations");
			return this;
		}
		public NewDriverPage clickAutoFillIcon_1(WebDriver driver)  {
			BrowserActions.click(driver, btnAutoFillIcon_1,"AutoFillIcon_1");
			return this;
		}
		public NewDriverPage enterLastname(WebDriver driver,String Lastname) {
			BrowserActions.type(driver, inpLastname,Lastname, "Lastname");
			return this;
		}
		public NewDriverPage selectPrimaryPhone(WebDriver driver,String PrimaryPhone)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpPrimaryPhone,PrimaryPhone,"PrimaryPhone");
			return this;
		}
		public NewDriverPage enterAddressDescription(WebDriver driver,String AddressDescription) {
			BrowserActions.type(driver, inpAddressDescription,AddressDescription, "AddressDescription");
			return this;
		}
		public NewDriverPage enterCounty(WebDriver driver,String County) {
			BrowserActions.type(driver, inpCounty,County, "County");
			return this;
		}
		public NewDriverPage enterFaxPhone(WebDriver driver,String FaxPhone) {
			BrowserActions.type(driver, inpFaxPhone,FaxPhone, "FaxPhone");
			return this;
		}
		public NewDriverPage enterAddress_1(WebDriver driver,String Address_1) {
			BrowserActions.type(driver, inpAddress_1,Address_1, "Address_1");
			return this;
		}
		public NewDriverPage clickExcluded(WebDriver driver)  {
			BrowserActions.click(driver, rdbExcluded,"Excluded");
			return this;
		}
		public NewDriverPage enterHomePhone(WebDriver driver,String HomePhone) {
			BrowserActions.type(driver, inpHomePhone,HomePhone, "HomePhone");
			return this;
		}
		public NewDriverPage enterSecondaryEmail(WebDriver driver,String SecondaryEmail) {
			BrowserActions.type(driver, inpSecondaryEmail,SecondaryEmail, "SecondaryEmail");
			return this;
		}
		public NewDriverPage clickGoodStudent(WebDriver driver)  {
			BrowserActions.click(driver, rdbGoodStudent,"GoodStudent");
			return this;
		}
		public NewDriverPage enterFirstname(WebDriver driver,String Firstname) {
			BrowserActions.type(driver, inpFirstname,Firstname, "Firstname");
			return this;
		}
		public NewDriverPage enterMobilePhone(WebDriver driver,String MobilePhone) {
			BrowserActions.type(driver, inpMobilePhone,MobilePhone, "MobilePhone");
			return this;
		}
		public NewDriverPage enterYearFirstLicensed(WebDriver driver,String YearFirstLicensed) {
			BrowserActions.type(driver, inpYearFirstLicensed,YearFirstLicensed, "YearFirstLicensed");
			return this;
		}
		public NewDriverPage enterAddress3(WebDriver driver,String Address3) {
			BrowserActions.type(driver, inpAddress3,Address3, "Address3");
			return this;
		}
		public NewDriverPage selectHomePhoneRegionCode(WebDriver driver,String HomePhoneRegionCode)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpHomePhoneRegionCode,HomePhoneRegionCode,"HomePhoneRegionCode");
			return this;
		}
		public NewDriverPage enterAddress1(WebDriver driver,String Address1) {
			BrowserActions.type(driver, inpAddress1,Address1, "Address1");
			return this;
		}
		public NewDriverPage selectAddressType(WebDriver driver,String AddressType)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpAddressType,AddressType,true,"AddressType");
			return this;
		}
		public NewDriverPage enterAddress2(WebDriver driver,String Address2) {
			BrowserActions.type(driver, inpAddress2,Address2, "Address2");
			return this;
		}
		public NewDriverPage enterSSN(WebDriver driver,String SSN) {
			BrowserActions.type(driver, inpSSN,SSN, "SSN");
			return this;
		}
		public NewDriverPage enterAddress(WebDriver driver,String Address) {
			BrowserActions.type(driver, inpAddress,Address, "Address");
			return this;
		}
		public NewDriverPage selectPreferredCurrency(WebDriver driver,String PreferredCurrency)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpPreferredCurrency,PreferredCurrency,"PreferredCurrency");
			return this;
		}
		public NewDriverPage clickCheckforDuplicates(WebDriver driver)  {
			BrowserActions.click(driver, btnCheckforDuplicates,"CheckforDuplicates");
			return this;
		}
		public NewDriverPage selectLinkAddressMenuMenuIcon(WebDriver driver,String LinkAddressMenuMenuIcon)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpLinkAddressMenuMenuIcon,LinkAddressMenuMenuIcon,"LinkAddressMenuMenuIcon");
			return this;
		}
		public NewDriverPage enterZIPCode(WebDriver driver,String ZIPCode) {
			BrowserActions.type(driver, inpZIPCode,ZIPCode,true,"ZIPCode");
			return this;
		}
		public NewDriverPage clickAutoFillIcon(WebDriver driver)  {
			BrowserActions.click(driver, btnAutoFillIcon,"AutoFillIcon");
			return this;
		}
		public NewDriverPage enterWorkPhoneExtension(WebDriver driver,String WorkPhoneExtension) {
			BrowserActions.type(driver, inpWorkPhoneExtension,WorkPhoneExtension, "WorkPhoneExtension");
			return this;
		}
		public NewDriverPage selectFaxPhoneRegionCode(WebDriver driver,String FaxPhoneRegionCode)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpFaxPhoneRegionCode,FaxPhoneRegionCode,"FaxPhoneRegionCode");
			return this;
		}
		public NewDriverPage selectMobilePhoneRegionCode(WebDriver driver,String MobilePhoneRegionCode)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpMobilePhoneRegionCode,MobilePhoneRegionCode,"MobilePhoneRegionCode");
			return this;
		}
		public NewDriverPage selectPrefix(WebDriver driver,String Prefix)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpPrefix,Prefix,"Prefix");
			return this;
		}
		public NewDriverPage enterName(WebDriver driver,String Name) {
			BrowserActions.type(driver, inpName,Name, "Name");
			return this;
		}
		public NewDriverPage enterFaxPhone_1(WebDriver driver,String FaxPhone_1) {
			BrowserActions.type(driver, inpFaxPhone_1,FaxPhone_1, "FaxPhone_1");
			return this;
		}
		public NewDriverPage clickApplyGoodDriverDiscount(WebDriver driver)  {
			BrowserActions.click(driver, rdbApplyGoodDriverDiscount,"ApplyGoodDriverDiscount");
			return this;
		}
		public NewDriverPage clickGooddriverdiscount(WebDriver driver)  {
			BrowserActions.click(driver, rdbGooddriverdiscount,"Gooddriverdiscount");
			return this;
		}
		public NewDriverPage selectCountry(WebDriver driver,String Country)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpCountry,Country,"Country");
			return this;
		}
		public NewDriverPage selectSuffix(WebDriver driver,String Suffix)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpSuffix,Suffix,"Suffix");
			return this;
		}
		public NewDriverPage selectState(WebDriver driver,String State)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpState,State,true,"State");
			return this;
		}
		public NewDriverPage selectMaritalStatus(WebDriver driver,String MaritalStatus)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpMaritalStatus,MaritalStatus,"MaritalStatus");
			return this;
		}
		public NewDriverPage enterHomePhoneExtension(WebDriver driver,String HomePhoneExtension) {
			BrowserActions.type(driver, inpHomePhoneExtension,HomePhoneExtension, "HomePhoneExtension");
			return this;
		}
		public NewDriverPage enterParticle(WebDriver driver,String Particle) {
			BrowserActions.type(driver, inpParticle,Particle, "Particle");
			return this;
		}
		public NewDriverPage enterMobilePhoneExtension(WebDriver driver,String MobilePhoneExtension) {
			BrowserActions.type(driver, inpMobilePhoneExtension,MobilePhoneExtension, "MobilePhoneExtension");
			return this;
		}
		public NewDriverPage enterCity(WebDriver driver,String City) {
			BrowserActions.type(driver, inpCity,City,true,"City");
			return this;
		}
		public NewDriverPage selectLicenseState(WebDriver driver,String LicenseState)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpLicenseState,LicenseState,0.5,"LicenseState");
			return this;
		}
		public NewDriverPage selectWorkPhoneRegionCode(WebDriver driver,String WorkPhoneRegionCode)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpWorkPhoneRegionCode,WorkPhoneRegionCode,"WorkPhoneRegionCode");
			return this;
		}
		public NewDriverPage clickOK(WebDriver driver)  {
			BrowserActions.click(driver, btnOK,"OK");
			return this;
		}
		public NewDriverPage clickOK_1(WebDriver driver)  {
			BrowserActions.click(driver, btnOK_1,"OK_1");
			return this;
		}
		public NewDriverPage clickAaabbbbPrimaryNamedInsured(WebDriver driver)  {
			BrowserActions.click(driver, btnAaabbbbPrimaryNamedInsured,"AaabbbbPrimaryNamedInsured");
			return this;
		}
		public NewDriverPage click19FloridaCityFL11111(WebDriver driver)  {
			BrowserActions.click(driver, btn19FloridaCityFL11111,"19FloridaCityFL11111");
			return this;
		}
		public NewDriverPage clickReturntoDrivers(WebDriver driver)  {
			BrowserActions.click(driver, btnReturntoDrivers,"ReturntoDrivers");
			return this;
		}
		public NewDriverPage enterWorkPhone_1(WebDriver driver,String WorkPhone_1) {
			BrowserActions.type(driver, inpWorkPhone_1,WorkPhone_1, "WorkPhone_1");
			return this;
		}
		public NewDriverPage clickEdit(WebDriver driver)  {
			BrowserActions.click(driver, btnEdit,"Edit");
			return this;
		}
		public NewDriverPage enterPrimaryEmail(WebDriver driver,String PrimaryEmail) {
			BrowserActions.type(driver, inpPrimaryEmail,PrimaryEmail, "PrimaryEmail");
			return this;
		}
		public NewDriverPage enterDateofBirth(WebDriver driver,String DateofBirth) {
			BrowserActions.type(driver, inpDateofBirth,DateofBirth, "DateofBirth");
			return this;
		}
		public NewDriverPage enterMiddlename(WebDriver driver,String Middlename) {
			BrowserActions.type(driver, inpMiddlename,Middlename, "Middlename");
			return this;
		}
		public NewDriverPage enterMobilePhone_1(WebDriver driver,String MobilePhone_1) {
			BrowserActions.type(driver, inpMobilePhone_1,MobilePhone_1, "MobilePhone_1");
			return this;
		}
		public NewDriverPage enterLicense(WebDriver driver,String License) {
			BrowserActions.type(driver, inpLicense,License, "License");
			return this;
		}
		public NewDriverPage enterWorkPhone(WebDriver driver,String WorkPhone) {
			BrowserActions.type(driver, inpWorkPhone,WorkPhone, "WorkPhone");
			return this;
		}
		public NewDriverPage clickCancel(WebDriver driver)  {
			BrowserActions.click(driver, btnCancel,"Cancel");
			return this;
		}
		public NewDriverPage enterFaxPhoneExtension(WebDriver driver,String FaxPhoneExtension) {
			BrowserActions.type(driver, inpFaxPhoneExtension,FaxPhoneExtension, "FaxPhoneExtension");
			return this;
		}
		public NewDriverPage selectNumberofAccidents(WebDriver driver,String NumberofAccidents)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpNumberofAccidents,NumberofAccidents,"NumberofAccidents");
			return this;
		}
		public NewDriverPage enterDateCompletedTrainingClass(WebDriver driver,String DateCompletedTrainingClass) {
			BrowserActions.type(driver, inpDateCompletedTrainingClass,DateCompletedTrainingClass, "DateCompletedTrainingClass");
			return this;
		}
		public NewDriverPage excludedRadioButton(WebDriver driver,String excluded) {
			if (excluded.trim().toUpperCase().contains("YES")) {
				BrowserActions.click(driver, rdbYesExcluded,"Driver Excluded Yes Radio Button");
			}			else if (excluded.trim().toUpperCase().contains("NO")) {
				BrowserActions.click(driver, rdbNoExcluded,"Driver Excluded No Radio Button");
			}			return this;
		}
		public NewDriverPage QualifiesForGoodDriverDiscountCheckBox(WebDriver driver,String radioButton) {
			if (radioButton.trim().toUpperCase().contains("YES")) {
				BrowserActions.click(driver, rdbYesQualifiesForAGoodDriverDiscount,"Driver Excluded Yes Radio Button");
			}
			else if (radioButton.trim().toUpperCase().contains("NO")) {
				BrowserActions.click(driver, rdbNoQualifiesForAGoodDriverDiscount,"Driver Excluded No Radio Button");
			}			
			return this;
		}
		public NewDriverPage ApplyGoodDriverDiscountRadioButton(WebDriver driver,String radioButton) {
			if (radioButton.trim().toUpperCase().contains("YES")) {
				BrowserActions.click(driver, rdbYesApplyDiscount,"Apply Good Driver Discount Radio Button");
			}			else if (radioButton.trim().toUpperCase().contains("NO")) {
				BrowserActions.click(driver, rdbNoApplyDiscount,"Apply Good Driver Discount Radio Button");
			}
			return this;
		}
		public NewDriverPage GoodStudentRadioButton(WebDriver driver,String radioButton) {
			if (radioButton.trim().toUpperCase().contains("YES")) {
				BrowserActions.click(driver, rdbYesGoodStudent,"Good Student Yes Radio Button");
			}
			else if (radioButton.trim().toUpperCase().contains("NO")) {
				BrowserActions.click(driver, rdbNoGoodStudent,"Good Student No Radio Button");
			}
			return this;
		}

	}
}


