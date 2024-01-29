package com.aspire.guidewire.pc.pages.inlandmarine;
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

public class ContractorsEquipmentPage  extends LoadableComponent<ContractorsEquipmentPage> {

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
	//public QuestionSet questionsetTable;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Workplan>div[role='menuitem']", AI = false)
	public WebElement btnWorkplan;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_CopySubmission>div[role='menuitem']", AI = false)
	public WebElement btnCopySubmission;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-4-item>div[role='menuitem']", AI = false)
	public WebElement btnGeneralreminderdiary;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-IMPartScreen-ContractorsEquipmentPartPanelSet-ScheduledEquipmentPanelSet-AdditionalInterestDetailsDV-AdditionalInterestLV_tb-AddContactsButton-AddFromSearch>div[role='button']", AI = false)
	public WebElement btnFromAddressBook;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-8-item>div[role='menuitem']", AI = false)
	public WebElement btnGetReinsuranceQuote;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-13-item>div[role='menuitem']", AI = false)
	public WebElement btnReview45dayUWPeriod;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-5-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnGL0243572615;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-IMPartScreen-ContractorsEquipmentPartPanelSet-perOccurrenceLimit']", AI = false)
	public WebElement inpPerOccurrenceLimit;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-IMPartScreen-JobWizardToolbarButtonSet-BindOptions-BindOnly>div[role='menuitem']", AI = false)
	public WebElement btnBindOnly;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-0-NewActivityMenuItemSet_Category>div[role='menuitem']", AI = false)
	public WebElement btnInterview;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-6-item>div[role='menuitem']", AI = false)
	public WebElement btnPerformanceReview;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-IMPartScreen-JobWizardToolbarButtonSet-Versions-NewVersion>div[role='menuitem']", AI = false)
	public WebElement btnStartMultiVersion;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-15-item>div[role='menuitem']", AI = false)
	public WebElement btnReviewProducer;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-IMPartScreen-ContractorsEquipmentPartPanelSet-coveragesTab", AI = false)
	public WebElement btnCoverages;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-10-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnCP0237964175;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-IMPartScreen-ContractorsEquipmentPartPanelSet-coinsurance']", AI = false)
	public WebElement drpCoinsurance;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-RiskEvaluation>div[role='menuitem']", AI = false)
	public WebElement btnRiskAnalysis_1;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-11-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnWC0239550996;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-8-item>div[role='menuitem']", AI = false)
	public WebElement btnPolicyReviewMidterm;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-IMPartScreen-JobWizardToolbarButtonSet-Versions-ViewSideBySide>div[role='menuitem']", AI = false)
	public WebElement btnViewSideBySideVersions;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-IMPartScreen-ContractorsEquipmentPartPanelSet-ScheduledEquipmentPanelSet-AdditionalInterestDetailsDV-AdditionalInterestLV_tb-Remove>div[role='button']", AI = false)
	public WebElement btnRemove_1;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-BillingInfo>div[role='menuitem']", AI = false)
	public WebElement btnPayment;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Change-WizardMenuActions_ChangeEffDate>div[role='menuitem']", AI = false)
	public WebElement btnEffectiveDate;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-JobGroupItem>div[role='menuitem']", AI = false)
	public WebElement btnSG01242563230866258063;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-1-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnBOP0136728316;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-2-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnCP0243839256;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-IMPartScreen-ContractorsEquipmentPartPanelSet-ScheduledEquipmentPanelSet-PreferredCoverageCurrencySelectorRef-PreferredCoverageCurrencyPanelSet-CoverageCurrencyDisplay']", AI = false)
	public WebElement inpCoveragesin_1;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-IMPartScreen-ContractorsEquipmentPartPanelSet-policywideUnscheduledCovs-0-CoverageInputSet-CovPatternInputGroup-2-CovTermInputSet-CovTermDirectInputSet-DirectTermInput']", AI = false)
	public WebElement inpMaxIndividualItemValue;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-IMPartScreen-OOSEPanelSet-NextSliceLink", AI = false)
	public WebElement btnNextBlockedDate;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-2-item>div[role='menuitem']", AI = false)
	public WebElement btn90daydiary;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-IMPartScreen-JobWizardToolbarButtonSet-BindOptions>div[role='button']", AI = false)
	public WebElement btnBindOptions;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Archiving-WizardMenuActions_SuspendResumeArchiving>div[role='menuitem']", AI = false)
	public WebElement btnEnableDisable;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-IMPartScreen-JobWizardToolbarButtonSet-BindOptions-BindAndIssue>div[role='menuitem']", AI = false)
	public WebElement btnIssuePolicy;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-IMPartScreen-ContractorsEquipmentPartPanelSet-QuestionSetsDV-0-QuestionSetLV-6-QuestionModalInput-BooleanRadioInput_NoPost']", AI = false)
	public WebElement rdbBooleanRadioInput_NoPost_1;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-MultiQuoteAcceleratedMenuActions-PolicyPeriodSelector", AI = false)
	public WebElement btnPolicyPeriodSelector;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-1-NewActivityMenuItemSet_Category>div[role='menuitem']", AI = false)
	public WebElement btnNewmail;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-IMPartScreen-ContractorsEquipmentPartPanelSet-title", AI = false)
	public WebElement lblTitle;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-7-item>div[role='menuitem']", AI = false)
	public WebElement btnGetMotorVehicleReports;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-IMPartScreen-ContractorsEquipmentPartPanelSet-policywideUnscheduledCovs-0-CoverageInputSet-CovPatternInputGroup-_checkbox']", AI = false)
	public WebElement chkContractorsEquipmentMiscItems;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-PreQualification>div[role='menuitem']", AI = false)
	public WebElement btnQualification;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Participants>div[role='menuitem']", AI = false)
	public WebElement btnParticipants;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-IMPartScreen-ContractorsEquipmentPartPanelSet-partLevelCovs-5-CoverageInputSet-CovPatternInputGroup-_checkbox']", AI = false)
	public WebElement chk_checkbox_1;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-4-NewActivityMenuItemSet_Category-0-item>div[role='menuitem']", AI = false)
	public WebElement btnReviewandapprove;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-0-impartstep>div[role='menuitem']", AI = false)
	public WebElement btnAccountsReceivable;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-IMPartScreen-OOSEPanelSet-OOSEPeriodSelector-OOSEPeriodSelector_Arg']", AI = false)
	public WebElement drpEffectiveDate;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewDocument>div[role='menuitem']", AI = false)
	public WebElement btnNewDocument;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewDocument-NewJobDocumentMenuItemSet-PolicyPeriodNewDocumentMenuItemSet_Linked>div[role='menuitem']", AI = false)
	public WebElement btnUploaddocuments;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Finish>div[role='button']", AI = false)
	public WebElement btnFinish;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-ProductDefinition>div[role='menuitem']", AI = false)
	public WebElement btnProductDefinition;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-6-item>div[role='menuitem']", AI = false)
	public WebElement btnGetInspectionOutsideService;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-0-NewActivityMenuItemSet_Category-0-item>div[role='menuitem']", AI = false)
	public WebElement btnMeetwithInsured;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Offering>div[role='menuitem']", AI = false)
	public WebElement btnOfferings;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-9-item>div[role='menuitem']", AI = false)
	public WebElement btnPolicyReviewRenewal;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewNote>div[role='menuitem']", AI = false)
	public WebElement btnNewNote;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-RiskAnalysis>div[role='menuitem']", AI = false)
	public WebElement btnRiskAnalysis;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-0-NewActivityMenuItemSet_Category-1-item>div[role='menuitem']", AI = false)
	public WebElement btnMeetwithProducerAgency;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-PolicyReview>div[role='menuitem']", AI = false)
	public WebElement btnPolicyReview;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-IMPartScreen-OOSEPanelSet-OOSEPeriodSelector", AI = false)
	public WebElement btnOOSEPeriodSelector;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-0-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnIM0281533022;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-11-item>div[role='menuitem']", AI = false)
	public WebElement btnManuallyrateandquotepolicy;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-History>div[role='menuitem']", AI = false)
	public WebElement btnHistory;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-IMPartScreen-ContractorsEquipmentPartPanelSet-partLevelInformation", AI = false)
	public WebElement lblPartLevelInformation;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Change>div[role='menuitem']", AI = false)
	public WebElement btnEdit;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-IMPartScreen-JobWizardToolbarButtonSet-CloseOptions-WithdrawJob>div[role='menuitem']", AI = false)
	public WebElement btnWithdrawTransaction;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-PolicyInfo>div[role='menuitem']", AI = false)
	public WebElement btnPolicyInfo;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-IMPartScreen-ContractorsEquipmentPartPanelSet-partLevelExclusions-1-CoverageInputSet-CovPatternInputGroup-_checkbox']", AI = false)
	public WebElement chkVandalism;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-6-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnBOP0048803904;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-8-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0137330990;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-IMPartScreen-JobWizardToolbarButtonSet-Versions>div[role='button']", AI = false)
	public WebElement btnVersions;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_ToAccountFile>div[role='menuitem']", AI = false)
	public WebElement btnAccountFile;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-IMPartScreen-ContractorsEquipmentPartPanelSet-uwInfoTab", AI = false)
	public WebElement btnUnderwritingInformation;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-IMPartScreen-ContractorsEquipmentPartPanelSet-ScheduledEquipmentPanelSet-Remove>div[role='button']", AI = false)
	public WebElement btnRemove;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Change-WizardMenuActions_CopyPolicyData>div[role='menuitem']", AI = false)
	public WebElement btnCopyData;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-IMPartScreen-QuoteRequestedAlert-CloseBtn", AI = false)
	public WebElement btnClose;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-14-item>div[role='menuitem']", AI = false)
	public WebElement btnReview60dayUWPeriod;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-IMPartScreen-ContractorsEquipmentPartPanelSet-partLevelCovs-0-CoverageInputSet-CovPatternInputGroup-_checkbox']", AI = false)
	public WebElement chkContractorsRentedEquipment;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-IMPartScreen-JobWizardToolbarButtonSet-EditPolicy>div[role='button']", AI = false)
	public WebElement btnEditPolicyTransaction;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-IMPartScreen-ContractorsEquipmentPartPanelSet-ScheduledEquipmentPanelSet-AdditionalInterestDetailsDV-AdditionalInterestLV_tb-AddContactsButton>div[role='button']", AI = false)
	public WebElement btnAdd_1;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity>div[role='menuitem']", AI = false)
	public WebElement btnNewActivity;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Cancel>div[role='button']", AI = false)
	public WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup>div[role='menuitem']", AI = false)
	public WebElement btnPolicyContract;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-9-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnHOP0124256323;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-4-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnCP0243476335;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-IMPartScreen-ContractorsEquipmentPartPanelSet-partLevelExclusions-0-CoverageInputSet-CovPatternInputGroup-_checkbox']", AI = false)
	public WebElement chkTheft;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category>div[role='menuitem']", AI = false)
	public WebElement btnRequest;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-IMPartScreen-ContractorsEquipmentPartPanelSet-ScheduledEquipmentPanelSet-AdditionalInterestDetailsDV-AdditionalInterestLV_tb-AddContactsButton-AddExistingContact>div[role='button']", AI = false)
	public WebElement btnExistingAdditionalInterest;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-9-item>div[role='menuitem']", AI = false)
	public WebElement btnGetRiskInformationProducer;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-1-item>div[role='menuitem']", AI = false)
	public WebElement btnGetAuditInternalPersonnel;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-3-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnCA0049146740;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-MultiQuoteAcceleratedMenuActions-PolicyPeriodSelector-PolicyPeriodSelector_Arg']", AI = false)
	public WebElement drpPolicyPeriodSelector_Arg;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-DiagWorksheetItem-ShowDiagWorksheet>div[role='menuitem']", AI = false)
	public WebElement btnShowPartialWorksheet;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-1-item>div[role='menuitem']", AI = false)
	public WebElement btn60daydiary;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Prev>div[role='button']", AI = false)
	public WebElement btnBack;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-PolicyVersions>div[role='menuitem']", AI = false)
	public WebElement btnPolicyVersions_1;

	@IFindBy(how = How.CSS, using = "div[id$='Next']", AI = false)
	public WebElement btnNext;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-10-item>div[role='menuitem']", AI = false)
	public WebElement btnQuoteRequired;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-IMPartScreen-JobWizardToolbarButtonSet-Draft>div[role='button']", AI = false)
	public WebElement btnSaveDraft;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-3-item>div[role='menuitem']", AI = false)
	public WebElement btnGetBureauData;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Reinsurance>div[role='menuitem']", AI = false)
	public WebElement btnReinsurance;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-IMPartScreen-QuoteRequestedAlert .gw-AlertBar--label", AI = false)
	public WebElement lblQuoteRequestedAlert;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-IMPartScreen-ContractorsEquipmentPartPanelSet-QuestionSetsDV-0-QuestionSetLV-0-QuestionModalInput-BooleanRadioInput_NoPost']", AI = false)
	public WebElement rdbBooleanRadioInput_NoPost;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewDocument-NewJobDocumentMenuItemSet-PolicyPeriodNewDocumentMenuItemSet_Template>div[role='menuitem']", AI = false)
	public WebElement btnCreatefromatemplate;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-Buildings>div[role='menuitem']", AI = false)
	public WebElement btnBuildingsandLocations;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-IMPartScreen-JobWizardToolbarButtonSet-Versions-SideBySide>div[role='menuitem']", AI = false)
	public WebElement btnStartSidebySide;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Archiving>div[role='menuitem']", AI = false)
	public WebElement btnArchiving;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-IMPartScreen-ContractorsEquipmentPartPanelSet-policywideUnscheduledCovs-0-CoverageInputSet-CovPatternInputGroup-0-CovTermInputSet-CovTermDirectInputSet-DirectTermInput']", AI = false)
	public WebElement inpLimit;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-IMPartScreen-ContractorsEquipmentPartPanelSet-partLevelCovs-0-CoverageInputSet-CovPatternInputGroup-0-CovTermInputSet-CovTermDirectInputSet-DirectTermInput']", AI = false)
	public WebElement inpLimitRental;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-IMPartScreen-JobWizardToolbarButtonSet-CloseOptions-NotTakenJob>div[role='menuitem']", AI = false)
	public WebElement btnNotTaken;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-IMPartScreen-ContractorsEquipmentPartPanelSet-policywideUnscheduledCovs-0-CoverageInputSet-CovPatternInputGroup-1-CovTermInputSet-OptionTermInput']", AI = false)
	public WebElement drpDeductible;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-IMPartScreen-ContractorsEquipmentPartPanelSet-partLevelCovs-0-CoverageInputSet-CovPatternInputGroup-1-CovTermInputSet-OptionTermInput']", AI = false)
	public WebElement drpDeductibleRental;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Documents>div[role='menuitem']", AI = false)
	public WebElement btnDocuments;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-IMPartScreen-ContractorsEquipmentPartPanelSet-PreferredCoverageCurrencySelectorRef-PreferredCoverageCurrencyPanelSet-PreferredCoverageCurrencySelectorDropDown']", AI = false)
	public WebElement drpCoveragesin;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-IMPartScreen-ContractorsEquipmentPartPanelSet-ScheduledEquipmentPanelSet-AdditionalInterestDetailsDV-AdditionalInterestLV_tb-AddContactsButton-AddOtherContact>div[role='button']", AI = false)
	public WebElement btnOtherContacts;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-IMPartScreen-JobWizardToolbarButtonSet-QuoteTypeToolbarButtonSet-Quote>div[role='button']", AI = false)
	public WebElement btnQuote;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-7-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnCPP0243314007;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-IMPartScreen-JobWizardToolbarButtonSet-Unlock>div[role='button']", AI = false)
	public WebElement btnReleaseLock;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-IMPartScreen-ContractorsEquipmentPartPanelSet-reporting']", AI = false)
	public WebElement rdbReporting;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-IMPartScreen-ContractorsEquipmentPartPanelSet-policywideUnscheduledCovs-1-CoverageInputSet-CovPatternInputGroup-_checkbox']", AI = false)
	public WebElement chk_checkbox;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-0-item>div[role='menuitem']", AI = false)
	public WebElement btnCreateNewProducer;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-IMPartScreen-ContractorsEquipmentPartPanelSet-ScheduledEquipmentPanelSet-Add>div[role='button']", AI = false)
	public WebElement btnAdd;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Forms>div[role='menuitem']", AI = false)
	public WebElement btnForms;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Notes>div[role='menuitem']", AI = false)
	public WebElement btnNotes;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-ViewMultiLineQuote>div[role='menuitem']", AI = false)
	public WebElement btnQuote_1;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-5-item>div[role='menuitem']", AI = false)
	public WebElement btnGetInspectionLossControl;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create>div[role='menuitem']", AI = false)
	public WebElement btnCreate;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-IMPartScreen-ContractorsEquipmentPartPanelSet-contrEqContractorType']", AI = false)
	public WebElement drpContractorType;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-10-item>div[role='menuitem']", AI = false)
	public WebElement btnLegalreview;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-7-item>div[role='menuitem']", AI = false)
	public WebElement btnPolicynotification;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-IMPartScreen-ContractorsEquipmentPartPanelSet-ScheduledEquipmentPanelSet-PreferredCoverageCurrencySelectorRef-PreferredCoverageCurrencyPanelSet-PreferredCoverageCurrencySelectorDropDown']", AI = false)
	public WebElement drpCoveragesin_1;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto>div[role='menuitem']", AI = false)
	public WebElement btnGoto;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-4-NewActivityMenuItemSet_Category>div[role='menuitem']", AI = false)
	public WebElement btnUnderwriterReview;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-0-item>div[role='menuitem']", AI = false)
	public WebElement btn30daydiary;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-2-impartstep>div[role='menuitem']", AI = false)
	public WebElement btnSigns;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-SideBySide>div[role='menuitem']", AI = false)
	public WebElement btnSidebySideQuoting;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-CollectCreditCard>div[role='menuitem']", AI = false)
	public WebElement btnCollectCreditCard;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-IMPartScreen-ContractorsEquipmentPartPanelSet-QuestionSetsDV-0-QuestionSetLV-7-QuestionModalInput-BooleanRadioInput']", AI = false)
	public WebElement rdbBooleanRadioInput;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-11-item>div[role='menuitem']", AI = false)
	public WebElement btnRatiooutofrange;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-IMPartScreen-JobWizardToolbarButtonSet-ConvertToFullApp>div[role='button']", AI = false)
	public WebElement btnFullApp;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-IMPartScreen-ContractorsEquipmentPartPanelSet-title2", AI = false)
	public WebElement lblTitle2;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-IMPartScreen-ContractorsEquipmentPartPanelSet-title3", AI = false)
	public WebElement lblTitle3;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-DiagWorksheetItem>div[role='menuitem']", AI = false)
	public WebElement btnDiagnosticData;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category>div[role='menuitem']", AI = false)
	public WebElement btnReminder;

	@IFindBy(how = How.CSS, using = "div[id$='IMPartScreen-ttlBar']", AI = false)
	public WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-IMPartSelection>div[role='menuitem']", AI = false)
	public WebElement btnCoveragePartSelection;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-1-NewActivityMenuItemSet_Category-0-item>div[role='menuitem']", AI = false)
	public WebElement btnReviewnewmail;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup>div[role='menuitem']", AI = false)
	public WebElement btnGroup;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-3-item>div[role='menuitem']", AI = false)
	public WebElement btnCancelasplitpolicy;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-2-item>div[role='menuitem']", AI = false)
	public WebElement btnGetAuditOutsideService;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-5-item>div[role='menuitem']", AI = false)
	public WebElement btnNewAuditAssignment;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-16-item>div[role='menuitem']", AI = false)
	public WebElement btnRewritetoNewAccount;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-12-item>div[role='menuitem']", AI = false)
	public WebElement btnReview30dayUWPeriod;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-ManageBranches>div[role='menuitem']", AI = false)
	public WebElement btnPolicyVersions;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-1-impartstep>div[role='menuitem']", AI = false)
	public WebElement btnContractorsEquipment;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-IMPartScreen-JobWizardToolbarButtonSet-CloseOptions>div[role='button']", AI = false)
	public WebElement btnCloseOptions;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_ToPolicyFile>div[role='menuitem']", AI = false)
	public WebElement btnPolicyFile;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-17-item>div[role='menuitem']", AI = false)
	public WebElement btnVerifycoverage;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-4-item>div[role='menuitem']", AI = false)
	public WebElement btnGetCreditReports;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-IMPartScreen-ContractorsEquipmentPartPanelSet-PreferredCoverageCurrencySelectorRef-PreferredCoverageCurrencyPanelSet-CoverageCurrencyDisplay']", AI = false)
	public WebElement inpCoveragesin;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-IMPartScreen-JobWizardToolbarButtonSet-CloseOptions-Decline>div[role='menuitem']", AI = false)
	public WebElement btnDecline;

	@IFindBy(how = How.CSS, using = "div[id=$'SubmissionWizard-WizardMenuActions']>div[role='button']", AI = false)
	public WebElement btnWizardMenuActions;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardActionsMenuItemSet-SubmissionInfo>div[role='menuitem']", AI = false)
	public WebElement btnSubManager;

	public ContractorsEquipmentPage(){
	}

	@Override
	protected void load() {
		isPageLoaded = true;
		WaitUtils.waitForPageLoad(driver);
	}// load���

	@Override
	protected void isLoaded() {
		if (!isPageLoaded) {
			Assert.fail();
		} if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, lblTtlBar))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}
		elementLayer = new ElementLayer(driver);
	}// isLoaded

	public ContractorsEquipmentPage(WebDriver driver) {
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(finder, this);
		//questionsetTable = new QuestionSet();
	}
	public ContractorsEquipmentPage clickWorkplan(WebDriver driver)  {
		BrowserActions.click(driver, btnWorkplan,"Workplan");
		return this;
	}
	public ContractorsEquipmentPage clickCopySubmission(WebDriver driver)  {
		BrowserActions.click(driver, btnCopySubmission,"CopySubmission");
		return this;
	}
	public ContractorsEquipmentPage clickGeneralreminderdiary(WebDriver driver)  {
		BrowserActions.click(driver, btnGeneralreminderdiary,"Generalreminderdiary");
		return this;
	}
	public ContractorsEquipmentPage clickFromAddressBook(WebDriver driver)  {
		BrowserActions.click(driver, btnFromAddressBook,"FromAddressBook");
		return this;
	}
	public ContractorsEquipmentPage clickGetReinsuranceQuote(WebDriver driver)  {
		BrowserActions.click(driver, btnGetReinsuranceQuote,"GetReinsuranceQuote");
		return this;
	}
	public ContractorsEquipmentPage clickReview45dayUWPeriod(WebDriver driver)  {
		BrowserActions.click(driver, btnReview45dayUWPeriod,"Review45dayUWPeriod");
		return this;
	}
	public ContractorsEquipmentPage clickGL0243572615(WebDriver driver)  {
		BrowserActions.click(driver, btnGL0243572615,"GL0243572615");
		return this;
	}
	public ContractorsEquipmentPage enterPerOccurrenceLimit(WebDriver driver,String PerOccurrenceLimit) {
		BrowserActions.type(driver, inpPerOccurrenceLimit,PerOccurrenceLimit, "PerOccurrenceLimit");
		return this;
	}
	public ContractorsEquipmentPage clickBindOnly(WebDriver driver)  {
		BrowserActions.click(driver, btnBindOnly,"BindOnly");
		return this;
	}
	public ContractorsEquipmentPage clickInterview(WebDriver driver)  {
		BrowserActions.click(driver, btnInterview,"Interview");
		return this;
	}
	public ContractorsEquipmentPage clickPerformanceReview(WebDriver driver)  {
		BrowserActions.click(driver, btnPerformanceReview,"PerformanceReview");
		return this;
	}
	public ContractorsEquipmentPage clickStartMultiVersion(WebDriver driver)  {
		BrowserActions.click(driver, btnStartMultiVersion,"StartMultiVersion");
		return this;
	}
	public ContractorsEquipmentPage clickReviewProducer(WebDriver driver)  {
		BrowserActions.click(driver, btnReviewProducer,"ReviewProducer");
		return this;
	}
	public ContractorsEquipmentPage clickCoverages(WebDriver driver)  {
		BrowserActions.click(driver, btnCoverages,"Coverages");
		return this;
	}
	public ContractorsEquipmentPage clickCP0237964175(WebDriver driver)  {
		BrowserActions.click(driver, btnCP0237964175,"CP0237964175");
		return this;
	}
	public ContractorsEquipmentPage selectCoinsurance(WebDriver driver,String Coinsurance)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCoinsurance,Coinsurance,"Coinsurance");
		return this;
	}
	public ContractorsEquipmentPage clickRiskAnalysis_1(WebDriver driver)  {
		BrowserActions.click(driver, btnRiskAnalysis_1,"RiskAnalysis_1");
		return this;
	}
	public ContractorsEquipmentPage clickWC0239550996(WebDriver driver)  {
		BrowserActions.click(driver, btnWC0239550996,"WC0239550996");
		return this;
	}
	public ContractorsEquipmentPage clickPolicyReviewMidterm(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyReviewMidterm,"PolicyReviewMidterm");
		return this;
	}
	public ContractorsEquipmentPage clickViewSideBySideVersions(WebDriver driver)  {
		BrowserActions.click(driver, btnViewSideBySideVersions,"ViewSideBySideVersions");
		return this;
	}
	public ContractorsEquipmentPage clickRemove_1(WebDriver driver)  {
		BrowserActions.click(driver, btnRemove_1,"Remove_1");
		return this;
	}
	public ContractorsEquipmentPage clickPayment(WebDriver driver)  {
		BrowserActions.click(driver, btnPayment,"Payment");
		return this;
	}
	public ContractorsEquipmentPage clickEffectiveDate(WebDriver driver)  {
		BrowserActions.click(driver, btnEffectiveDate,"EffectiveDate");
		return this;
	}
	public ContractorsEquipmentPage clickSG01242563230866258063(WebDriver driver)  {
		BrowserActions.click(driver, btnSG01242563230866258063,"SG01242563230866258063");
		return this;
	}
	public ContractorsEquipmentPage clickBOP0136728316(WebDriver driver)  {
		BrowserActions.click(driver, btnBOP0136728316,"BOP0136728316");
		return this;
	}
	public ContractorsEquipmentPage clickCP0243839256(WebDriver driver)  {
		BrowserActions.click(driver, btnCP0243839256,"CP0243839256");
		return this;
	}
	public ContractorsEquipmentPage enterCoveragesin_1(WebDriver driver,String Coveragesin_1) {
		BrowserActions.type(driver, inpCoveragesin_1,Coveragesin_1, "Coveragesin_1");
		return this;
	}
	public ContractorsEquipmentPage enterMaxIndividualItemValue(WebDriver driver,String MaxIndividualItemValue) {
		BrowserActions.type(driver, inpMaxIndividualItemValue,MaxIndividualItemValue, "MaxIndividualItemValue");
		return this;
	}
	public ContractorsEquipmentPage clickNextBlockedDate(WebDriver driver)  {
		BrowserActions.click(driver, btnNextBlockedDate,"NextBlockedDate");
		return this;
	}
	public ContractorsEquipmentPage click90daydiary(WebDriver driver)  {
		BrowserActions.click(driver, btn90daydiary,"90daydiary");
		return this;
	}
	public ContractorsEquipmentPage clickBindOptions(WebDriver driver)  {
		BrowserActions.click(driver, btnBindOptions,"BindOptions");
		return this;
	}
	public ContractorsEquipmentPage clickEnableDisable(WebDriver driver)  {
		BrowserActions.click(driver, btnEnableDisable,"EnableDisable");
		return this;
	}
	public ContractorsEquipmentPage clickIssuePolicy(WebDriver driver)  {
		BrowserActions.click(driver, btnIssuePolicy,"IssuePolicy");
		return this;
	}
	public ContractorsEquipmentPage clickBooleanRadioInput_NoPost_1(WebDriver driver)  {
		BrowserActions.click(driver, rdbBooleanRadioInput_NoPost_1,"BooleanRadioInput_NoPost_1");
		return this;
	}
	public ContractorsEquipmentPage clickPolicyPeriodSelector(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyPeriodSelector,"PolicyPeriodSelector");
		return this;
	}
	public ContractorsEquipmentPage clickNewmail(WebDriver driver)  {
		BrowserActions.click(driver, btnNewmail,"Newmail");
		return this;
	}
	public ContractorsEquipmentPage clickGetMotorVehicleReports(WebDriver driver)  {
		BrowserActions.click(driver, btnGetMotorVehicleReports,"GetMotorVehicleReports");
		return this;
	}
	public ContractorsEquipmentPage clickContractorsEquipmentMiscItems(WebDriver driver)  {
		BrowserActions.click(driver, chkContractorsEquipmentMiscItems,true,"ContractorsEquipmentMiscItems");
		return this;
	}
	public ContractorsEquipmentPage clickQualification(WebDriver driver)  {
		BrowserActions.click(driver, btnQualification,"Qualification");
		return this;
	}
	public ContractorsEquipmentPage clickParticipants(WebDriver driver)  {
		BrowserActions.click(driver, btnParticipants,"Participants");
		return this;
	}
	public ContractorsEquipmentPage click_checkbox_1(WebDriver driver)  {
		BrowserActions.click(driver, chk_checkbox_1,"_checkbox_1");
		return this;
	}
	public ContractorsEquipmentPage clickReviewandapprove(WebDriver driver)  {
		BrowserActions.click(driver, btnReviewandapprove,"Reviewandapprove");
		return this;
	}
	public ContractorsEquipmentPage clickAccountsReceivable(WebDriver driver)  {
		BrowserActions.click(driver, btnAccountsReceivable,"AccountsReceivable");
		return this;
	}
	public ContractorsEquipmentPage selectEffectiveDate(WebDriver driver,String EffectiveDate)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpEffectiveDate,EffectiveDate,"EffectiveDate");
		return this;
	}
	public ContractorsEquipmentPage clickNewDocument(WebDriver driver)  {
		BrowserActions.click(driver, btnNewDocument,"NewDocument");
		return this;
	}
	public ContractorsEquipmentPage clickUploaddocuments(WebDriver driver)  {
		BrowserActions.click(driver, btnUploaddocuments,"Uploaddocuments");
		return this;
	}
	public ContractorsEquipmentPage clickFinish(WebDriver driver)  {
		BrowserActions.click(driver, btnFinish,"Finish");
		return this;
	}
	public ContractorsEquipmentPage clickProductDefinition(WebDriver driver)  {
		BrowserActions.click(driver, btnProductDefinition,"ProductDefinition");
		return this;
	}
	public ContractorsEquipmentPage clickGetInspectionOutsideService(WebDriver driver)  {
		BrowserActions.click(driver, btnGetInspectionOutsideService,"GetInspectionOutsideService");
		return this;
	}
	public ContractorsEquipmentPage clickMeetwithInsured(WebDriver driver)  {
		BrowserActions.click(driver, btnMeetwithInsured,"MeetwithInsured");
		return this;
	}
	public ContractorsEquipmentPage clickOfferings(WebDriver driver)  {
		BrowserActions.click(driver, btnOfferings,"Offerings");
		return this;
	}
	public ContractorsEquipmentPage clickPolicyReviewRenewal(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyReviewRenewal,"PolicyReviewRenewal");
		return this;
	}
	public ContractorsEquipmentPage clickNewNote(WebDriver driver)  {
		BrowserActions.click(driver, btnNewNote,"NewNote");
		return this;
	}
	public ContractorsEquipmentPage clickRiskAnalysis(WebDriver driver)  {
		BrowserActions.click(driver, btnRiskAnalysis,"RiskAnalysis");
		return this;
	}
	public ContractorsEquipmentPage clickMeetwithProducerAgency(WebDriver driver)  {
		BrowserActions.click(driver, btnMeetwithProducerAgency,"MeetwithProducerAgency");
		return this;
	}
	public ContractorsEquipmentPage clickPolicyReview(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyReview,"PolicyReview");
		return this;
	}
	public ContractorsEquipmentPage clickOOSEPeriodSelector(WebDriver driver)  {
		BrowserActions.click(driver, btnOOSEPeriodSelector,"OOSEPeriodSelector");
		return this;
	}
	public ContractorsEquipmentPage clickIM0281533022(WebDriver driver)  {
		BrowserActions.click(driver, btnIM0281533022,"IM0281533022");
		return this;
	}
	public ContractorsEquipmentPage clickManuallyrateandquotepolicy(WebDriver driver)  {
		BrowserActions.click(driver, btnManuallyrateandquotepolicy,"Manuallyrateandquotepolicy");
		return this;
	}
	public ContractorsEquipmentPage clickHistory(WebDriver driver)  {
		BrowserActions.click(driver, btnHistory,"History");
		return this;
	}
	public ContractorsEquipmentPage clickEdit(WebDriver driver)  {
		BrowserActions.click(driver, btnEdit,"Edit");
		return this;
	}
	public ContractorsEquipmentPage clickWithdrawTransaction(WebDriver driver)  {
		BrowserActions.click(driver, btnWithdrawTransaction,"WithdrawTransaction");
		return this;
	}
	public ContractorsEquipmentPage clickPolicyInfo(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyInfo,"PolicyInfo");
		return this;
	}
	public ContractorsEquipmentPage clickVandalism(WebDriver driver)  {
		BrowserActions.click(driver, chkVandalism,"Vandalism");
		return this;
	}
	public ContractorsEquipmentPage clickBOP0048803904(WebDriver driver)  {
		BrowserActions.click(driver, btnBOP0048803904,"BOP0048803904");
		return this;
	}
	public ContractorsEquipmentPage clickPA0137330990(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0137330990,"PA0137330990");
		return this;
	}
	public ContractorsEquipmentPage clickVersions(WebDriver driver)  {
		BrowserActions.click(driver, btnVersions,"Versions");
		return this;
	}
	public ContractorsEquipmentPage clickAccountFile(WebDriver driver)  {
		BrowserActions.click(driver, btnAccountFile,"AccountFile");
		return this;
	}
	public ContractorsEquipmentPage clickUnderwritingInformation(WebDriver driver)  {
		BrowserActions.click(driver, btnUnderwritingInformation,"UnderwritingInformation");
		return this;
	}
	public ContractorsEquipmentPage clickRemove(WebDriver driver)  {
		BrowserActions.click(driver, btnRemove,"Remove");
		return this;
	}
	public ContractorsEquipmentPage clickCopyData(WebDriver driver)  {
		BrowserActions.click(driver, btnCopyData,"CopyData");
		return this;
	}
	public ContractorsEquipmentPage clickClose(WebDriver driver)  {
		BrowserActions.click(driver, btnClose,"Close");
		return this;
	}
	public ContractorsEquipmentPage clickReview60dayUWPeriod(WebDriver driver)  {
		BrowserActions.click(driver, btnReview60dayUWPeriod,"Review60dayUWPeriod");
		return this;
	}
	public ContractorsEquipmentPage clickContractorsRentedEquipment(WebDriver driver)  {
		BrowserActions.click(driver, chkContractorsRentedEquipment,true,"ContractorsRentedEquipment");
		return this;
	}
	public ContractorsEquipmentPage clickEditPolicyTransaction(WebDriver driver)  {
		BrowserActions.click(driver, btnEditPolicyTransaction,"EditPolicyTransaction");
		return this;
	}
	public ContractorsEquipmentPage clickAdd_1(WebDriver driver)  {
		BrowserActions.click(driver, btnAdd_1,"Add_1");
		return this;
	}
	public ContractorsEquipmentPage clickNewActivity(WebDriver driver)  {
		BrowserActions.click(driver, btnNewActivity,"NewActivity");
		return this;
	}
	public ContractorsEquipmentPage clickCancel(WebDriver driver)  {
		BrowserActions.click(driver, btnCancel,"Cancel");
		return this;
	}
	public ContractorsEquipmentPage clickPolicyContract(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyContract,"PolicyContract");
		return this;
	}
	public ContractorsEquipmentPage clickHOP0124256323(WebDriver driver)  {
		BrowserActions.click(driver, btnHOP0124256323,"HOP0124256323");
		return this;
	}
	public ContractorsEquipmentPage clickCP0243476335(WebDriver driver)  {
		BrowserActions.click(driver, btnCP0243476335,"CP0243476335");
		return this;
	}
	public ContractorsEquipmentPage clickTheft(WebDriver driver)  {
		BrowserActions.click(driver, chkTheft,"Theft");
		return this;
	}
	public ContractorsEquipmentPage clickRequest(WebDriver driver)  {
		BrowserActions.click(driver, btnRequest,"Request");
		return this;
	}
	public ContractorsEquipmentPage clickExistingAdditionalInterest(WebDriver driver)  {
		BrowserActions.click(driver, btnExistingAdditionalInterest,"ExistingAdditionalInterest");
		return this;
	}
	public ContractorsEquipmentPage clickGetRiskInformationProducer(WebDriver driver)  {
		BrowserActions.click(driver, btnGetRiskInformationProducer,"GetRiskInformationProducer");
		return this;
	}
	public ContractorsEquipmentPage clickGetAuditInternalPersonnel(WebDriver driver)  {
		BrowserActions.click(driver, btnGetAuditInternalPersonnel,"GetAuditInternalPersonnel");
		return this;
	}
	public ContractorsEquipmentPage clickCA0049146740(WebDriver driver)  {
		BrowserActions.click(driver, btnCA0049146740,"CA0049146740");
		return this;
	}
	public ContractorsEquipmentPage selectPolicyPeriodSelector_Arg(WebDriver driver,String PolicyPeriodSelector_Arg)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPolicyPeriodSelector_Arg,PolicyPeriodSelector_Arg,"PolicyPeriodSelector_Arg");
		return this;
	}
	public ContractorsEquipmentPage clickShowPartialWorksheet(WebDriver driver)  {
		BrowserActions.click(driver, btnShowPartialWorksheet,"ShowPartialWorksheet");
		return this;
	}
	public ContractorsEquipmentPage click60daydiary(WebDriver driver)  {
		BrowserActions.click(driver, btn60daydiary,"60daydiary");
		return this;
	}
	public ContractorsEquipmentPage clickBack(WebDriver driver)  {
		BrowserActions.click(driver, btnBack,"Back");
		return this;
	}
	public ContractorsEquipmentPage clickPolicyVersions_1(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyVersions_1,"PolicyVersions_1");
		return this;
	}
	public ContractorsEquipmentPage clickNext(WebDriver driver)  {
		BrowserActions.click(driver, btnNext,"Next");
		return this;
	}
	public ContractorsEquipmentPage clickQuoteRequired(WebDriver driver)  {
		BrowserActions.click(driver, btnQuoteRequired,"QuoteRequired");
		return this;
	}
	public ContractorsEquipmentPage clickSaveDraft(WebDriver driver)  {
		BrowserActions.click(driver, btnSaveDraft,"SaveDraft");
		return this;
	}
	public ContractorsEquipmentPage clickGetBureauData(WebDriver driver)  {
		BrowserActions.click(driver, btnGetBureauData,"GetBureauData");
		return this;
	}
	public ContractorsEquipmentPage clickReinsurance(WebDriver driver)  {
		BrowserActions.click(driver, btnReinsurance,"Reinsurance");
		return this;
	}
	public ContractorsEquipmentPage clickBooleanRadioInput_NoPost(WebDriver driver)  {
		BrowserActions.click(driver, rdbBooleanRadioInput_NoPost,"BooleanRadioInput_NoPost");
		return this;
	}
	public ContractorsEquipmentPage clickCreatefromatemplate(WebDriver driver)  {
		BrowserActions.click(driver, btnCreatefromatemplate,"Createfromatemplate");
		return this;
	}
	public ContractorsEquipmentPage clickBuildingsandLocations(WebDriver driver)  {
		BrowserActions.click(driver, btnBuildingsandLocations,"BuildingsandLocations");
		return this;
	}
	public ContractorsEquipmentPage clickStartSidebySide(WebDriver driver)  {
		BrowserActions.click(driver, btnStartSidebySide,"StartSidebySide");
		return this;
	}
	public ContractorsEquipmentPage clickArchiving(WebDriver driver)  {
		BrowserActions.click(driver, btnArchiving,"Archiving");
		return this;
	}
	public ContractorsEquipmentPage enterLimit(WebDriver driver,String Limit) {
		BrowserActions.type(driver, inpLimit,Limit, "Limit");
		return this;
	}
	public ContractorsEquipmentPage enterLimitRental(WebDriver driver,String Limit) {
		BrowserActions.type(driver, inpLimitRental,Limit,0.5,"Limit");
		return this;
	}
	public ContractorsEquipmentPage clickNotTaken(WebDriver driver)  {
		BrowserActions.click(driver, btnNotTaken,"NotTaken");
		return this;
	}
	public ContractorsEquipmentPage selectDeductible(WebDriver driver,String Deductible)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpDeductible,Deductible,"Deductible");
		return this;
	}
	public ContractorsEquipmentPage selectDeductibleRental(WebDriver driver,String Deductible)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpDeductibleRental,Deductible,0.5,"Deductible");
		return this;
	}
	public ContractorsEquipmentPage clickDocuments(WebDriver driver)  {
		BrowserActions.click(driver, btnDocuments,"Documents");
		return this;
	}
	public ContractorsEquipmentPage selectCoveragesin(WebDriver driver,String Coveragesin)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCoveragesin,Coveragesin,"Coveragesin");
		return this;
	}
	public ContractorsEquipmentPage clickOtherContacts(WebDriver driver)  {
		BrowserActions.click(driver, btnOtherContacts,"OtherContacts");
		return this;
	}
	public ContractorsEquipmentPage clickQuote(WebDriver driver)  {
		BrowserActions.click(driver, btnQuote,"Quote");
		return this;
	}
	public ContractorsEquipmentPage clickCPP0243314007(WebDriver driver)  {
		BrowserActions.click(driver, btnCPP0243314007,"CPP0243314007");
		return this;
	}
	public ContractorsEquipmentPage clickReleaseLock(WebDriver driver)  {
		BrowserActions.click(driver, btnReleaseLock,"ReleaseLock");
		return this;
	}
	public ContractorsEquipmentPage clickReporting(WebDriver driver)  {
		BrowserActions.click(driver, rdbReporting,"Reporting");
		return this;
	}
	public ContractorsEquipmentPage click_checkbox(WebDriver driver)  {
		BrowserActions.click(driver, chk_checkbox,"_checkbox");
		return this;
	}
	public ContractorsEquipmentPage clickCreateNewProducer(WebDriver driver)  {
		BrowserActions.click(driver, btnCreateNewProducer,"CreateNewProducer");
		return this;
	}
	public ContractorsEquipmentPage clickAdd(WebDriver driver)  {
		BrowserActions.click(driver, btnAdd,"Add");
		return this;
	}
	public ContractorsEquipmentPage clickForms(WebDriver driver)  {
		BrowserActions.click(driver, btnForms,"Forms");
		return this;
	}
	public ContractorsEquipmentPage clickNotes(WebDriver driver)  {
		BrowserActions.click(driver, btnNotes,"Notes");
		return this;
	}
	public ContractorsEquipmentPage clickQuote_1(WebDriver driver)  {
		BrowserActions.click(driver, btnQuote_1,"Quote_1");
		return this;
	}
	public ContractorsEquipmentPage clickGetInspectionLossControl(WebDriver driver)  {
		BrowserActions.click(driver, btnGetInspectionLossControl,"GetInspectionLossControl");
		return this;
	}
	public ContractorsEquipmentPage clickCreate(WebDriver driver)  {
		BrowserActions.click(driver, btnCreate,"Create");
		return this;
	}
	public ContractorsEquipmentPage selectContractorType(WebDriver driver,String ContractorType)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpContractorType,ContractorType,"ContractorType");
		return this;
	}
	public ContractorsEquipmentPage clickLegalreview(WebDriver driver)  {
		BrowserActions.click(driver, btnLegalreview,"Legalreview");
		return this;
	}
	public ContractorsEquipmentPage clickPolicynotification(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicynotification,"Policynotification");
		return this;
	}
	public ContractorsEquipmentPage selectCoveragesin_1(WebDriver driver,String Coveragesin_1)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCoveragesin_1,Coveragesin_1,"Coveragesin_1");
		return this;
	}
	public ContractorsEquipmentPage clickGoto(WebDriver driver)  {
		BrowserActions.click(driver, btnGoto,"Goto");
		return this;
	}
	public ContractorsEquipmentPage clickUnderwriterReview(WebDriver driver)  {
		BrowserActions.click(driver, btnUnderwriterReview,"UnderwriterReview");
		return this;
	}
	public ContractorsEquipmentPage click30daydiary(WebDriver driver)  {
		BrowserActions.click(driver, btn30daydiary,"30daydiary");
		return this;
	}
	public ContractorsEquipmentPage clickSigns(WebDriver driver)  {
		BrowserActions.click(driver, btnSigns,"Signs");
		return this;
	}
	public ContractorsEquipmentPage clickSidebySideQuoting(WebDriver driver)  {
		BrowserActions.click(driver, btnSidebySideQuoting,"SidebySideQuoting");
		return this;
	}
	public ContractorsEquipmentPage clickCollectCreditCard(WebDriver driver)  {
		BrowserActions.click(driver, btnCollectCreditCard,"CollectCreditCard");
		return this;
	}
	public ContractorsEquipmentPage clickBooleanRadioInput(WebDriver driver)  {
		BrowserActions.click(driver, rdbBooleanRadioInput,"BooleanRadioInput");
		return this;
	}
	public ContractorsEquipmentPage clickRatiooutofrange(WebDriver driver)  {
		BrowserActions.click(driver, btnRatiooutofrange,"Ratiooutofrange");
		return this;
	}
	public ContractorsEquipmentPage clickFullApp(WebDriver driver)  {
		BrowserActions.click(driver, btnFullApp,"FullApp");
		return this;
	}
	public ContractorsEquipmentPage clickDiagnosticData(WebDriver driver)  {
		BrowserActions.click(driver, btnDiagnosticData,"DiagnosticData");
		return this;
	}
	public ContractorsEquipmentPage clickReminder(WebDriver driver)  {
		BrowserActions.click(driver, btnReminder,"Reminder");
		return this;
	}
	public ContractorsEquipmentPage clickCoveragePartSelection(WebDriver driver)  {
		BrowserActions.click(driver, btnCoveragePartSelection,"CoveragePartSelection");
		return this;
	}
	public ContractorsEquipmentPage clickReviewnewmail(WebDriver driver)  {
		BrowserActions.click(driver, btnReviewnewmail,"Reviewnewmail");
		return this;
	}
	public ContractorsEquipmentPage clickGroup(WebDriver driver)  {
		BrowserActions.click(driver, btnGroup,"Group");
		return this;
	}
	public ContractorsEquipmentPage clickCancelasplitpolicy(WebDriver driver)  {
		BrowserActions.click(driver, btnCancelasplitpolicy,"Cancelasplitpolicy");
		return this;
	}
	public ContractorsEquipmentPage clickGetAuditOutsideService(WebDriver driver)  {
		BrowserActions.click(driver, btnGetAuditOutsideService,"GetAuditOutsideService");
		return this;
	}
	public ContractorsEquipmentPage clickNewAuditAssignment(WebDriver driver)  {
		BrowserActions.click(driver, btnNewAuditAssignment,"NewAuditAssignment");
		return this;
	}
	public ContractorsEquipmentPage clickRewritetoNewAccount(WebDriver driver)  {
		BrowserActions.click(driver, btnRewritetoNewAccount,"RewritetoNewAccount");
		return this;
	}
	public ContractorsEquipmentPage clickReview30dayUWPeriod(WebDriver driver)  {
		BrowserActions.click(driver, btnReview30dayUWPeriod,"Review30dayUWPeriod");
		return this;
	}
	public ContractorsEquipmentPage clickPolicyVersions(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyVersions,"PolicyVersions");
		return this;
	}
	public ContractorsEquipmentPage clickContractorsEquipment(WebDriver driver)  {
		BrowserActions.click(driver, btnContractorsEquipment,"ContractorsEquipment");
		return this;
	}
	public ContractorsEquipmentPage clickCloseOptions(WebDriver driver)  {
		BrowserActions.click(driver, btnCloseOptions,"CloseOptions");
		return this;
	}
	public ContractorsEquipmentPage clickPolicyFile(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyFile,"PolicyFile");
		return this;
	}
	public ContractorsEquipmentPage clickVerifycoverage(WebDriver driver)  {
		BrowserActions.click(driver, btnVerifycoverage,"Verifycoverage");
		return this;
	}
	public ContractorsEquipmentPage clickGetCreditReports(WebDriver driver)  {
		BrowserActions.click(driver, btnGetCreditReports,"GetCreditReports");
		return this;
	}
	public ContractorsEquipmentPage enterCoveragesin(WebDriver driver,String Coveragesin) {
		BrowserActions.type(driver, inpCoveragesin,Coveragesin, "Coveragesin");
		return this;
	}
	public ContractorsEquipmentPage clickDecline(WebDriver driver)  {
		BrowserActions.click(driver, btnDecline,"Decline");
		return this;
	}
	public ContractorsEquipmentPage clickWizardMenuActions(WebDriver driver)  {
		BrowserActions.click(driver, btnWizardMenuActions,"WizardMenuActions");
		return this;
	}
	public ContractorsEquipmentPage clickSubManager(WebDriver driver)  {
		BrowserActions.click(driver, btnSubManager,"SubManager");
		return this;
	}
}
