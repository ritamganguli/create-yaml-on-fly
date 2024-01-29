package com.aspire.guidewire.pc.pages.commercialauto;
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

public class VehiclesPage extends LoadableComponent<VehiclesPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Workplan>div[role='menuitem']", AI = false)
	public WebElement btnWorkplan;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-9-item>div[role='menuitem']", AI = false)
	public WebElement btnGetRiskInformationProducer;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_CopySubmission>div[role='menuitem']", AI = false)
	public WebElement btnCopySubmission;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-4-item>div[role='menuitem']", AI = false)
	public WebElement btnGeneralreminderdiary;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-8-item>div[role='menuitem']", AI = false)
	public WebElement btnGetReinsuranceQuote;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-13-item>div[role='menuitem']", AI = false)
	public WebElement btnReview45dayUWPeriod;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-1-item>div[role='menuitem']", AI = false)
	public WebElement btnGetAuditInternalPersonnel;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BAVehiclesScreen-JobWizardToolbarButtonSet-BindOptions-BindOnly>div[role='menuitem']", AI = false)
	public WebElement btnBindOnly;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-0-NewActivityMenuItemSet_Category>div[role='menuitem']", AI = false)
	public WebElement btnInterview;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-MultiQuoteAcceleratedMenuActions-PolicyPeriodSelector-PolicyPeriodSelector_Arg']", AI = false)
	public WebElement drpPolicyPeriodSelector_Arg;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-6-item>div[role='menuitem']", AI = false)
	public WebElement btnPerformanceReview;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-DiagWorksheetItem-ShowDiagWorksheet>div[role='menuitem']", AI = false)
	public WebElement btnShowPartialWorksheet;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-1-item>div[role='menuitem']", AI = false)
	public WebElement btn60daydiary;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BAVehiclesScreen-JobWizardToolbarButtonSet-Versions-NewVersion>div[role='menuitem']", AI = false)
	public WebElement btnStartMultiVersion;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Prev>div[role='button']", AI = false)
	public WebElement btnBack;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-PolicyVersions>div[role='menuitem']", AI = false)
	public WebElement btnPolicyVersions_3;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-15-item>div[role='menuitem']", AI = false)
	public WebElement btnReviewProducer;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-Locations>div[role='menuitem']", AI = false)
	public WebElement btnLocations;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-RiskEvaluation>div[role='menuitem']", AI = false)
	public WebElement btnRiskAnalysis_4;

	@IFindBy(how = How.CSS, using = "div[id$='Next']", AI = false)
	public WebElement btnNext;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-10-item>div[role='menuitem']", AI = false)
	public WebElement btnQuoteRequired;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-8-item>div[role='menuitem']", AI = false)
	public WebElement btnPolicyReviewMidterm;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-baLineStep>div[role='menuitem']", AI = false)
	public WebElement btnCommercialAutoLine;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BAVehiclesScreen-JobWizardToolbarButtonSet-Versions-ViewSideBySide>div[role='menuitem']", AI = false)
	public WebElement btnViewSideBySideVersions;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BAVehiclesScreen-JobWizardToolbarButtonSet-Draft>div[role='button']", AI = false)
	public WebElement btnSaveDraft;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-3-item>div[role='menuitem']", AI = false)
	public WebElement btnGetBureauData;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Reinsurance>div[role='menuitem']", AI = false)
	public WebElement btnReinsurance;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-BillingInfo>div[role='menuitem']", AI = false)
	public WebElement btnPayment;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Change-WizardMenuActions_ChangeEffDate>div[role='menuitem']", AI = false)
	public WebElement btnEffectiveDate;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BAVehiclesScreen-QuoteRequestedAlert .gw-AlertBar--label", AI = false)
	public WebElement lblQuoteRequestedAlert;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewDocument-NewJobDocumentMenuItemSet-PolicyPeriodNewDocumentMenuItemSet_Template>div[role='menuitem']", AI = false)
	public WebElement btnCreatefromatemplate;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BAVehiclesScreen-JobWizardToolbarButtonSet-Versions-SideBySide>div[role='menuitem']", AI = false)
	public WebElement btnStartSidebySide;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Archiving>div[role='menuitem']", AI = false)
	public WebElement btnArchiving;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BAVehiclesScreen-JobWizardToolbarButtonSet-CloseOptions-NotTakenJob>div[role='menuitem']", AI = false)
	public WebElement btnNotTaken;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Documents>div[role='menuitem']", AI = false)
	public WebElement btnDocuments;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BAVehiclesScreen-OOSEPanelSet-NextSliceLink", AI = false)
	public WebElement btnNextBlockedDate;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-1-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnCA0053514392;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-2-item>div[role='menuitem']", AI = false)
	public WebElement btn90daydiary;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BAVehiclesScreen-JobWizardToolbarButtonSet-QuoteTypeToolbarButtonSet-Quote>div[role='button']", AI = false)
	public WebElement btnQuote;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-BusinessVehicles>div[role='menuitem']", AI = false)
	public WebElement btnVehicles;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BAVehiclesScreen-JobWizardToolbarButtonSet-BindOptions>div[role='button']", AI = false)
	public WebElement btnBindOptions;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BAVehiclesScreen-JobWizardToolbarButtonSet-Unlock>div[role='button']", AI = false)
	public WebElement btnReleaseLock;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Archiving-WizardMenuActions_SuspendResumeArchiving>div[role='menuitem']", AI = false)
	public WebElement btnEnableDisable;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BAVehiclesScreen-JobWizardToolbarButtonSet-BindOptions-BindAndIssue>div[role='menuitem']", AI = false)
	public WebElement btnIssuePolicy;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-0-item>div[role='menuitem']", AI = false)
	public WebElement btnCreateNewProducer;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BAVehiclesScreen-BAVehiclesLV_tb-VehiclesScreen_CloneVehicleButton>div[role='button']", AI = false)
	public WebElement btnCloneSelected;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Forms>div[role='menuitem']", AI = false)
	public WebElement btnForms;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-MultiQuoteAcceleratedMenuActions-PolicyPeriodSelector", AI = false)
	public WebElement btnPolicyPeriodSelector;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-1-NewActivityMenuItemSet_Category>div[role='menuitem']", AI = false)
	public WebElement btnNewmail;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-7-item>div[role='menuitem']", AI = false)
	public WebElement btnGetMotorVehicleReports;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-PreQualification>div[role='menuitem']", AI = false)
	public WebElement btnQualification;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Notes>div[role='menuitem']", AI = false)
	public WebElement btnNotes;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-ViewMultiLineQuote>div[role='menuitem']", AI = false)
	public WebElement btnQuote_2;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-ViewQuote>div[role='menuitem']", AI = false)
	public WebElement btnQuote_1;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-0-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnHOP0052524779;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-5-item>div[role='menuitem']", AI = false)
	public WebElement btnGetInspectionLossControl;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-CoveredAutoSymbols>div[role='menuitem']", AI = false)
	public WebElement btnCoveredVehicles;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Participants>div[role='menuitem']", AI = false)
	public WebElement btnParticipants;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create>div[role='menuitem']", AI = false)
	public WebElement btnCreate;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-4-NewActivityMenuItemSet_Category-0-item>div[role='menuitem']", AI = false)
	public WebElement btnReviewandapprove;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BAVehiclesScreen-OOSEPanelSet-OOSEPeriodSelector-OOSEPeriodSelector_Arg']", AI = false)
	public WebElement drpEffectiveDate;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-10-item>div[role='menuitem']", AI = false)
	public WebElement btnLegalreview;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewDocument>div[role='menuitem']", AI = false)
	public WebElement btnNewDocument;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-7-item>div[role='menuitem']", AI = false)
	public WebElement btnPolicynotification;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewDocument-NewJobDocumentMenuItemSet-PolicyPeriodNewDocumentMenuItemSet_Linked>div[role='menuitem']", AI = false)
	public WebElement btnUploaddocuments;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Finish>div[role='button']", AI = false)
	public WebElement btnFinish;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto>div[role='menuitem']", AI = false)
	public WebElement btnGoto;

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

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-SideBySide>div[role='menuitem']", AI = false)
	public WebElement btnSidebySideQuoting;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-RiskAnalysis>div[role='menuitem']", AI = false)
	public WebElement btnRiskAnalysis;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-0-NewActivityMenuItemSet_Category-1-item>div[role='menuitem']", AI = false)
	public WebElement btnMeetwithProducerAgency;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-StateInfo>div[role='menuitem']", AI = false)
	public WebElement btnStateInfo;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-CollectCreditCard>div[role='menuitem']", AI = false)
	public WebElement btnCollectCreditCard;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-11-item>div[role='menuitem']", AI = false)
	public WebElement btnRatiooutofrange;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BAVehiclesScreen-JobWizardToolbarButtonSet-ConvertToFullApp>div[role='button']", AI = false)
	public WebElement btnFullApp;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-JobGroupItem>div[role='menuitem']", AI = false)
	public WebElement btnSG00525247791543403972;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-PolicyReview>div[role='menuitem']", AI = false)
	public WebElement btnPolicyReview;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-DiagWorksheetItem>div[role='menuitem']", AI = false)
	public WebElement btnDiagnosticData;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BAVehiclesScreen-OOSEPanelSet-OOSEPeriodSelector", AI = false)
	public WebElement btnOOSEPeriodSelector;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-11-item>div[role='menuitem']", AI = false)
	public WebElement btnManuallyrateandquotepolicy;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-BADrivers>div[role='menuitem']", AI = false)
	public WebElement btnDrivers;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-History>div[role='menuitem']", AI = false)
	public WebElement btnHistory;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category>div[role='menuitem']", AI = false)
	public WebElement btnReminder;

	@IFindBy(how = How.CSS, using = "div[id='gw-center-title-toolbar']>div[id$='VehiclesScreen-ttlBar']", AI = false)
	public WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Change>div[role='menuitem']", AI = false)
	public WebElement btnEdit;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BAVehiclesScreen-JobWizardToolbarButtonSet-CloseOptions-WithdrawJob>div[role='menuitem']", AI = false)
	public WebElement btnWithdrawTransaction;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-PolicyInfo>div[role='menuitem']", AI = false)
	public WebElement btnPolicyInfo;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BAVehiclesScreen-JobWizardToolbarButtonSet-Versions>div[role='button']", AI = false)
	public WebElement btnVersions;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-Modifiers>div[role='menuitem']", AI = false)
	public WebElement btnModifiers;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_ToAccountFile>div[role='menuitem']", AI = false)
	public WebElement btnAccountFile;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BAVehiclesScreen-BAVehiclesLV_tb-Remove>div[role='button']", AI = false)
	public WebElement btnRemoveVehicle;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-1-NewActivityMenuItemSet_Category-0-item>div[role='menuitem']", AI = false)
	public WebElement btnReviewnewmail;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup>div[role='menuitem']", AI = false)
	public WebElement btnGroup;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-3-item>div[role='menuitem']", AI = false)
	public WebElement btnCancelasplitpolicy;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-2-item>div[role='menuitem']", AI = false)
	public WebElement btnGetAuditOutsideService;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Change-WizardMenuActions_CopyPolicyData>div[role='menuitem']", AI = false)
	public WebElement btnCopyData;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-5-item>div[role='menuitem']", AI = false)
	public WebElement btnNewAuditAssignment;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-16-item>div[role='menuitem']", AI = false)
	public WebElement btnRewritetoNewAccount;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BAVehiclesScreen-QuoteRequestedAlert-CloseBtn", AI = false)
	public WebElement btnClose;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-12-item>div[role='menuitem']", AI = false)
	public WebElement btnReview30dayUWPeriod;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-ManageBranches>div[role='menuitem']", AI = false)
	public WebElement btnPolicyVersions;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-14-item>div[role='menuitem']", AI = false)
	public WebElement btnReview60dayUWPeriod;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BAVehiclesScreen-JobWizardToolbarButtonSet-EditPolicy>div[role='button']", AI = false)
	public WebElement btnEditPolicyTransaction;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity>div[role='menuitem']", AI = false)
	public WebElement btnNewActivity;

	@IFindBy(how = How.CSS, using = "div[id$='VehiclesListDetailPanel_tb-Add'],div[id$='BAVehiclesLV_tb-Add']", AI = false)
	public WebElement btnCreateVehicle;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Cancel>div[role='button']", AI = false)
	public WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BAVehiclesScreen-JobWizardToolbarButtonSet-CloseOptions>div[role='button']", AI = false)
	public WebElement btnCloseOptions;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup>div[role='menuitem']", AI = false)
	public WebElement btnPolicyContract;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_ToPolicyFile>div[role='menuitem']", AI = false)
	public WebElement btnPolicyFile;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-17-item>div[role='menuitem']", AI = false)
	public WebElement btnVerifycoverage;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category>div[role='menuitem']", AI = false)
	public WebElement btnRequest;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-4-item>div[role='menuitem']", AI = false)
	public WebElement btnGetCreditReports;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BAVehiclesScreen-JobWizardToolbarButtonSet-CloseOptions-Decline>div[role='menuitem']", AI = false)
	public WebElement btnDecline;

	@IFindBy(how = How.CSS, using = "div[id=$'SubmissionWizard-WizardMenuActions']>div[role='button']", AI = false)
	public WebElement btnWizardMenuActions;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardActionsMenuItemSet-SubmissionInfo>div[role='menuitem']", AI = false)
	public WebElement btnSubManager;
	
	@IFindBy(how = How.CSS, using = "div[id$='BAVehiclesLV-_Checkbox']", AI = false)
	public WebElement chkVehicleDetails;

	public VehiclesPage(){
	}

	public VehiclesPage(WebDriver driver){
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
		
	}public VehiclesPage clickWorkplan(WebDriver driver)  {
		BrowserActions.click(driver, btnWorkplan,"Workplan");
		return this;
	}
	public VehiclesPage clickGetRiskInformationProducer(WebDriver driver)  {
		BrowserActions.click(driver, btnGetRiskInformationProducer,"GetRiskInformationProducer");
		return this;
	}
	public VehiclesPage clickCopySubmission(WebDriver driver)  {
		BrowserActions.click(driver, btnCopySubmission,"CopySubmission");
		return this;
	}
	public VehiclesPage clickGeneralreminderdiary(WebDriver driver)  {
		BrowserActions.click(driver, btnGeneralreminderdiary,"Generalreminderdiary");
		return this;
	}
	public VehiclesPage clickGetReinsuranceQuote(WebDriver driver)  {
		BrowserActions.click(driver, btnGetReinsuranceQuote,"GetReinsuranceQuote");
		return this;
	}
	public VehiclesPage clickReview45dayUWPeriod(WebDriver driver)  {
		BrowserActions.click(driver, btnReview45dayUWPeriod,"Review45dayUWPeriod");
		return this;
	}
	public VehiclesPage clickGetAuditInternalPersonnel(WebDriver driver)  {
		BrowserActions.click(driver, btnGetAuditInternalPersonnel,"GetAuditInternalPersonnel");
		return this;
	}
	public VehiclesPage clickBindOnly(WebDriver driver)  {
		BrowserActions.click(driver, btnBindOnly,"BindOnly");
		return this;
	}
	public VehiclesPage clickInterview(WebDriver driver)  {
		BrowserActions.click(driver, btnInterview,"Interview");
		return this;
	}
	public VehiclesPage selectPolicyPeriodSelector_Arg(WebDriver driver,String PolicyPeriodSelector_Arg)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPolicyPeriodSelector_Arg,PolicyPeriodSelector_Arg,"PolicyPeriodSelector_Arg");
		return this;
	}
	public VehiclesPage clickPerformanceReview(WebDriver driver)  {
		BrowserActions.click(driver, btnPerformanceReview,"PerformanceReview");
		return this;
	}
	public VehiclesPage clickShowPartialWorksheet(WebDriver driver)  {
		BrowserActions.click(driver, btnShowPartialWorksheet,"ShowPartialWorksheet");
		return this;
	}
	public VehiclesPage click60daydiary(WebDriver driver)  {
		BrowserActions.click(driver, btn60daydiary,"60daydiary");
		return this;
	}
	public VehiclesPage clickStartMultiVersion(WebDriver driver)  {
		BrowserActions.click(driver, btnStartMultiVersion,"StartMultiVersion");
		return this;
	}
	public VehiclesPage clickBack(WebDriver driver)  {
		BrowserActions.click(driver, btnBack,"Back");
		return this;
	}
	public VehiclesPage clickPolicyVersions_3(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyVersions_3,"PolicyVersions_3");
		return this;
	}
	public VehiclesPage clickReviewProducer(WebDriver driver)  {
		BrowserActions.click(driver, btnReviewProducer,"ReviewProducer");
		return this;
	}
	public VehiclesPage clickLocations(WebDriver driver)  {
		BrowserActions.click(driver, btnLocations,"Locations");
		return this;
	}
	public VehiclesPage clickRiskAnalysis_4(WebDriver driver)  {
		BrowserActions.click(driver, btnRiskAnalysis_4,"RiskAnalysis_4");
		return this;
	}
	public VehiclesPage clickNext(WebDriver driver)  {
		BrowserActions.click(driver, btnNext,true,"Next");
		return this;
	}
	public VehiclesPage clickQuoteRequired(WebDriver driver)  {
		BrowserActions.click(driver, btnQuoteRequired,"QuoteRequired");
		return this;
	}
	public VehiclesPage clickPolicyReviewMidterm(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyReviewMidterm,"PolicyReviewMidterm");
		return this;
	}
	public VehiclesPage clickCommercialAutoLine(WebDriver driver)  {
		BrowserActions.click(driver, btnCommercialAutoLine,"CommercialAutoLine");
		return this;
	}
	public VehiclesPage clickViewSideBySideVersions(WebDriver driver)  {
		BrowserActions.click(driver, btnViewSideBySideVersions,"ViewSideBySideVersions");
		return this;
	}
	public VehiclesPage clickSaveDraft(WebDriver driver)  {
		BrowserActions.click(driver, btnSaveDraft,"SaveDraft");
		return this;
	}
	public VehiclesPage clickGetBureauData(WebDriver driver)  {
		BrowserActions.click(driver, btnGetBureauData,"GetBureauData");
		return this;
	}
	public VehiclesPage clickReinsurance(WebDriver driver)  {
		BrowserActions.click(driver, btnReinsurance,"Reinsurance");
		return this;
	}
	public VehiclesPage clickPayment(WebDriver driver)  {
		BrowserActions.click(driver, btnPayment,"Payment");
		return this;
	}
	public VehiclesPage clickEffectiveDate(WebDriver driver)  {
		BrowserActions.click(driver, btnEffectiveDate,"EffectiveDate");
		return this;
	}
	public VehiclesPage clickCreatefromatemplate(WebDriver driver)  {
		BrowserActions.click(driver, btnCreatefromatemplate,"Createfromatemplate");
		return this;
	}
	public VehiclesPage clickStartSidebySide(WebDriver driver)  {
		BrowserActions.click(driver, btnStartSidebySide,"StartSidebySide");
		return this;
	}
	public VehiclesPage clickArchiving(WebDriver driver)  {
		BrowserActions.click(driver, btnArchiving,"Archiving");
		return this;
	}
	public VehiclesPage clickNotTaken(WebDriver driver)  {
		BrowserActions.click(driver, btnNotTaken,"NotTaken");
		return this;
	}
	public VehiclesPage clickDocuments(WebDriver driver)  {
		BrowserActions.click(driver, btnDocuments,"Documents");
		return this;
	}
	public VehiclesPage clickNextBlockedDate(WebDriver driver)  {
		BrowserActions.click(driver, btnNextBlockedDate,"NextBlockedDate");
		return this;
	}
	public VehiclesPage clickCA0053514392(WebDriver driver)  {
		BrowserActions.click(driver, btnCA0053514392,"CA0053514392");
		return this;
	}
	public VehiclesPage click90daydiary(WebDriver driver)  {
		BrowserActions.click(driver, btn90daydiary,"90daydiary");
		return this;
	}
	public VehiclesPage clickQuote(WebDriver driver)  {
		BrowserActions.click(driver, btnQuote,"Quote");
		return this;
	}
	public VehiclesPage clickVehicles(WebDriver driver)  {
		BrowserActions.click(driver, btnVehicles,"Vehicles");
		return this;
	}
	public VehiclesPage clickBindOptions(WebDriver driver)  {
		BrowserActions.click(driver, btnBindOptions,"BindOptions");
		return this;
	}
	public VehiclesPage clickReleaseLock(WebDriver driver)  {
		BrowserActions.click(driver, btnReleaseLock,"ReleaseLock");
		return this;
	}
	public VehiclesPage clickEnableDisable(WebDriver driver)  {
		BrowserActions.click(driver, btnEnableDisable,"EnableDisable");
		return this;
	}
	public VehiclesPage clickIssuePolicy(WebDriver driver)  {
		BrowserActions.click(driver, btnIssuePolicy,"IssuePolicy");
		return this;
	}
	public VehiclesPage clickCreateNewProducer(WebDriver driver)  {
		BrowserActions.click(driver, btnCreateNewProducer,"CreateNewProducer");
		return this;
	}
	public VehiclesPage clickCloneSelected(WebDriver driver)  {
		BrowserActions.click(driver, btnCloneSelected,"CloneSelected");
		return this;
	}
	public VehiclesPage clickForms(WebDriver driver)  {
		BrowserActions.click(driver, btnForms,"Forms");
		return this;
	}
	public VehiclesPage clickPolicyPeriodSelector(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyPeriodSelector,"PolicyPeriodSelector");
		return this;
	}
	public VehiclesPage clickNewmail(WebDriver driver)  {
		BrowserActions.click(driver, btnNewmail,"Newmail");
		return this;
	}
	public VehiclesPage clickGetMotorVehicleReports(WebDriver driver)  {
		BrowserActions.click(driver, btnGetMotorVehicleReports,"GetMotorVehicleReports");
		return this;
	}
	public VehiclesPage clickQualification(WebDriver driver)  {
		BrowserActions.click(driver, btnQualification,"Qualification");
		return this;
	}
	public VehiclesPage clickNotes(WebDriver driver)  {
		BrowserActions.click(driver, btnNotes,"Notes");
		return this;
	}
	public VehiclesPage clickQuote_2(WebDriver driver)  {
		BrowserActions.click(driver, btnQuote_2,"Quote_2");
		return this;
	}
	public VehiclesPage clickQuote_1(WebDriver driver)  {
		BrowserActions.click(driver, btnQuote_1,"Quote_1");
		return this;
	}
	public VehiclesPage clickHOP0052524779(WebDriver driver)  {
		BrowserActions.click(driver, btnHOP0052524779,"HOP0052524779");
		return this;
	}
	public VehiclesPage clickGetInspectionLossControl(WebDriver driver)  {
		BrowserActions.click(driver, btnGetInspectionLossControl,"GetInspectionLossControl");
		return this;
	}
	public VehiclesPage clickCoveredVehicles(WebDriver driver)  {
		BrowserActions.click(driver, btnCoveredVehicles,"CoveredVehicles");
		return this;
	}
	public VehiclesPage clickParticipants(WebDriver driver)  {
		BrowserActions.click(driver, btnParticipants,"Participants");
		return this;
	}
	public VehiclesPage clickCreate(WebDriver driver)  {
		BrowserActions.click(driver, btnCreate,"Create");
		return this;
	}
	public VehiclesPage clickReviewandapprove(WebDriver driver)  {
		BrowserActions.click(driver, btnReviewandapprove,"Reviewandapprove");
		return this;
	}
	public VehiclesPage selectEffectiveDate(WebDriver driver,String EffectiveDate)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpEffectiveDate,EffectiveDate,"EffectiveDate");
		return this;
	}
	public VehiclesPage clickLegalreview(WebDriver driver)  {
		BrowserActions.click(driver, btnLegalreview,"Legalreview");
		return this;
	}
	public VehiclesPage clickNewDocument(WebDriver driver)  {
		BrowserActions.click(driver, btnNewDocument,"NewDocument");
		return this;
	}
	public VehiclesPage clickPolicynotification(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicynotification,"Policynotification");
		return this;
	}
	public VehiclesPage clickUploaddocuments(WebDriver driver)  {
		BrowserActions.click(driver, btnUploaddocuments,"Uploaddocuments");
		return this;
	}
	public VehiclesPage clickFinish(WebDriver driver)  {
		BrowserActions.click(driver, btnFinish,"Finish");
		return this;
	}
	public VehiclesPage clickGoto(WebDriver driver)  {
		BrowserActions.click(driver, btnGoto,"Goto");
		return this;
	}
	public VehiclesPage clickProductDefinition(WebDriver driver)  {
		BrowserActions.click(driver, btnProductDefinition,"ProductDefinition");
		return this;
	}
	public VehiclesPage clickGetInspectionOutsideService(WebDriver driver)  {
		BrowserActions.click(driver, btnGetInspectionOutsideService,"GetInspectionOutsideService");
		return this;
	}
	public VehiclesPage clickUnderwriterReview(WebDriver driver)  {
		BrowserActions.click(driver, btnUnderwriterReview,"UnderwriterReview");
		return this;
	}
	public VehiclesPage clickMeetwithInsured(WebDriver driver)  {
		BrowserActions.click(driver, btnMeetwithInsured,"MeetwithInsured");
		return this;
	}
	public VehiclesPage click30daydiary(WebDriver driver)  {
		BrowserActions.click(driver, btn30daydiary,"30daydiary");
		return this;
	}
	public VehiclesPage clickOfferings(WebDriver driver)  {
		BrowserActions.click(driver, btnOfferings,"Offerings");
		return this;
	}
	public VehiclesPage clickPolicyReviewRenewal(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyReviewRenewal,"PolicyReviewRenewal");
		return this;
	}
	public VehiclesPage clickNewNote(WebDriver driver)  {
		BrowserActions.click(driver, btnNewNote,"NewNote");
		return this;
	}
	public VehiclesPage clickSidebySideQuoting(WebDriver driver)  {
		BrowserActions.click(driver, btnSidebySideQuoting,"SidebySideQuoting");
		return this;
	}
	public VehiclesPage clickRiskAnalysis(WebDriver driver)  {
		BrowserActions.click(driver, btnRiskAnalysis,"RiskAnalysis");
		return this;
	}
	public VehiclesPage clickMeetwithProducerAgency(WebDriver driver)  {
		BrowserActions.click(driver, btnMeetwithProducerAgency,"MeetwithProducerAgency");
		return this;
	}
	public VehiclesPage clickStateInfo(WebDriver driver)  {
		BrowserActions.click(driver, btnStateInfo,"StateInfo");
		return this;
	}
	public VehiclesPage clickCollectCreditCard(WebDriver driver)  {
		BrowserActions.click(driver, btnCollectCreditCard,"CollectCreditCard");
		return this;
	}
	public VehiclesPage clickRatiooutofrange(WebDriver driver)  {
		BrowserActions.click(driver, btnRatiooutofrange,"Ratiooutofrange");
		return this;
	}
	public VehiclesPage clickFullApp(WebDriver driver)  {
		BrowserActions.click(driver, btnFullApp,"FullApp");
		return this;
	}
	public VehiclesPage clickSG00525247791543403972(WebDriver driver)  {
		BrowserActions.click(driver, btnSG00525247791543403972,"SG00525247791543403972");
		return this;
	}
	public VehiclesPage clickPolicyReview(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyReview,"PolicyReview");
		return this;
	}
	public VehiclesPage clickDiagnosticData(WebDriver driver)  {
		BrowserActions.click(driver, btnDiagnosticData,"DiagnosticData");
		return this;
	}
	public VehiclesPage clickOOSEPeriodSelector(WebDriver driver)  {
		BrowserActions.click(driver, btnOOSEPeriodSelector,"OOSEPeriodSelector");
		return this;
	}
	public VehiclesPage clickManuallyrateandquotepolicy(WebDriver driver)  {
		BrowserActions.click(driver, btnManuallyrateandquotepolicy,"Manuallyrateandquotepolicy");
		return this;
	}
	public VehiclesPage clickDrivers(WebDriver driver)  {
		BrowserActions.click(driver, btnDrivers,"Drivers");
		return this;
	}
	public VehiclesPage clickHistory(WebDriver driver)  {
		BrowserActions.click(driver, btnHistory,"History");
		return this;
	}
	public VehiclesPage clickReminder(WebDriver driver)  {
		BrowserActions.click(driver, btnReminder,"Reminder");
		return this;
	}
	public VehiclesPage clickEdit(WebDriver driver)  {
		BrowserActions.click(driver, btnEdit,"Edit");
		return this;
	}
	public VehiclesPage clickWithdrawTransaction(WebDriver driver)  {
		BrowserActions.click(driver, btnWithdrawTransaction,"WithdrawTransaction");
		return this;
	}
	public VehiclesPage clickPolicyInfo(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyInfo,"PolicyInfo");
		return this;
	}
	public VehiclesPage clickVersions(WebDriver driver)  {
		BrowserActions.click(driver, btnVersions,"Versions");
		return this;
	}
	public VehiclesPage clickModifiers(WebDriver driver)  {
		BrowserActions.click(driver, btnModifiers,"Modifiers");
		return this;
	}
	public VehiclesPage clickAccountFile(WebDriver driver)  {
		BrowserActions.click(driver, btnAccountFile,"AccountFile");
		return this;
	}
	public VehiclesPage clickRemoveVehicle(WebDriver driver)  {
		BrowserActions.click(driver, btnRemoveVehicle,0.5,"RemoveVehicle");
		return this;
	}
	public VehiclesPage clickReviewnewmail(WebDriver driver)  {
		BrowserActions.click(driver, btnReviewnewmail,"Reviewnewmail");
		return this;
	}
	public VehiclesPage clickGroup(WebDriver driver)  {
		BrowserActions.click(driver, btnGroup,"Group");
		return this;
	}
	public VehiclesPage clickCancelasplitpolicy(WebDriver driver)  {
		BrowserActions.click(driver, btnCancelasplitpolicy,"Cancelasplitpolicy");
		return this;
	}
	public VehiclesPage clickGetAuditOutsideService(WebDriver driver)  {
		BrowserActions.click(driver, btnGetAuditOutsideService,"GetAuditOutsideService");
		return this;
	}
	public VehiclesPage clickCopyData(WebDriver driver)  {
		BrowserActions.click(driver, btnCopyData,"CopyData");
		return this;
	}
	public VehiclesPage clickNewAuditAssignment(WebDriver driver)  {
		BrowserActions.click(driver, btnNewAuditAssignment,"NewAuditAssignment");
		return this;
	}
	public VehiclesPage clickRewritetoNewAccount(WebDriver driver)  {
		BrowserActions.click(driver, btnRewritetoNewAccount,"RewritetoNewAccount");
		return this;
	}
	public VehiclesPage clickClose(WebDriver driver)  {
		BrowserActions.click(driver, btnClose,"Close");
		return this;
	}
	public VehiclesPage clickReview30dayUWPeriod(WebDriver driver)  {
		BrowserActions.click(driver, btnReview30dayUWPeriod,"Review30dayUWPeriod");
		return this;
	}
	public VehiclesPage clickPolicyVersions(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyVersions,"PolicyVersions");
		return this;
	}
	public VehiclesPage clickReview60dayUWPeriod(WebDriver driver)  {
		BrowserActions.click(driver, btnReview60dayUWPeriod,"Review60dayUWPeriod");
		return this;
	}
	public VehiclesPage clickEditPolicyTransaction(WebDriver driver)  {
		BrowserActions.click(driver, btnEditPolicyTransaction,"EditPolicyTransaction");
		return this;
	}
	public VehiclesPage clickNewActivity(WebDriver driver)  {
		BrowserActions.click(driver, btnNewActivity,"NewActivity");
		return this;
	}
	public VehiclesPage clickCreateVehicle(WebDriver driver)  {
		BrowserActions.click(driver, btnCreateVehicle,true,2,"CreateVehicle");
		return this;
	}
	public VehiclesPage clickCancel(WebDriver driver)  {
		BrowserActions.click(driver, btnCancel,"Cancel");
		return this;
	}
	public VehiclesPage clickCloseOptions(WebDriver driver)  {
		BrowserActions.click(driver, btnCloseOptions,"CloseOptions");
		return this;
	}
	public VehiclesPage clickPolicyContract(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyContract,"PolicyContract");
		return this;
	}
	public VehiclesPage clickPolicyFile(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyFile,"PolicyFile");
		return this;
	}
	public VehiclesPage clickVerifycoverage(WebDriver driver)  {
		BrowserActions.click(driver, btnVerifycoverage,"Verifycoverage");
		return this;
	}
	public VehiclesPage clickRequest(WebDriver driver)  {
		BrowserActions.click(driver, btnRequest,"Request");
		return this;
	}
	public VehiclesPage clickGetCreditReports(WebDriver driver)  {
		BrowserActions.click(driver, btnGetCreditReports,"GetCreditReports");
		return this;
	}
	public VehiclesPage clickDecline(WebDriver driver)  {
		BrowserActions.click(driver, btnDecline,"Decline");
		return this;
	}
	public VehiclesPage clickWizardMenuActions(WebDriver driver)  {
		BrowserActions.click(driver, btnWizardMenuActions,"WizardMenuActions");
		return this;
	}
	public VehiclesPage clickSubManager(WebDriver driver)  {
		BrowserActions.click(driver, btnSubManager,"SubManager");
		return this;
	}
	public VehiclesPage clickVehicleDetailsCheckbox(WebDriver driver)  {
		BrowserActions.click(driver, chkVehicleDetails,"Checkbox Vehicle Details");
		return this;
	}
	public class VehiclesInformationPage extends LoadableComponent<VehiclesInformationPage> {

		WebDriver driver;
		private boolean isPageLoaded;
		public ElementLayer elementLayer;
		String elementObject;
		HashMap<String, String> getPageObjects;
		public List<Object> pageFactoryKey = new ArrayList<Object>();
		public List<String> pageFactoryValue = new ArrayList<String>();

		@IFindBy(how = How.CSS, using = "input[name='BAVehiclePopup-VehicleScreen-BAVehicleCV-VehicleDV-ClassCode']", AI = false)
		public WebElement inpClass;

		@IFindBy(how = How.CSS, using = "input[name='BAVehiclePopup-VehicleScreen-BAVehicleCV-2-CoverageInputSet-CovPatternInputGroup-_checkbox']", AI = false)
		public WebElement chkSpecifiedCausesofLoss;

		@IFindBy(how = How.CSS, using = "#BAVehiclePopup-VehicleScreen-BAVehicleCV-AdditionalInterestDetailsDV-AdditionalInterestLV_tb-AddContactsButton-AddFromSearch>div[role='button']", AI = false)
		public WebElement btnFromAddressBook;

		@IFindBy(how = How.CSS, using = "input[name='BAVehiclePopup-VehicleScreen-BAVehicleCV-VehicleDV-Make']", AI = false)
		public WebElement inpMake;

		@IFindBy(how = How.CSS, using = "#BAVehiclePopup-VehicleScreen-BAVehicleCV-BAGarageLocationInputSet-BAGarageLocationInput-EditGarageLocation>div[role='menuitem']", AI = false)
		public WebElement btnEditLocation;

		@IFindBy(how = How.CSS, using = "select[name='BAVehiclePopup-VehicleScreen-BAVehicleCV-VehicleDV-DestinationZone']", AI = false)
		public WebElement drpDestinationZone;

		@IFindBy(how = How.CSS, using = "#BAVehiclePopup-VehicleScreen-BAVehicleCV-CoveragesCardTab", AI = false)
		public WebElement btnCoverages;

		@IFindBy(how = How.CSS, using = "input[name='BAVehiclePopup-VehicleScreen-BAVehicleCV-VehicleDV-Model']", AI = false)
		public WebElement inpModel;

		@IFindBy(how = How.CSS, using = "select[name='BAVehiclePopup-VehicleScreen-BAVehicleCV-VehicleDV-Type']", AI = false)
		public WebElement drpVehicleType;

		@IFindBy(how = How.CSS, using = "#BAVehiclePopup-VehicleScreen-BAVehicleCV-VehicleDetailCardTab", AI = false)
		public WebElement btnVehicleDetails;

		@IFindBy(how = How.CSS, using = "#BAVehiclePopup-VehicleScreen-BAVehicleCV-AdditionalCoveragesCardTab", AI = false)
		public WebElement btnAdditionalCoverages;

		@IFindBy(how = How.CSS, using = "input[name$='Cost']", AI = false)
		public WebElement inpCost;

		@IFindBy(how = How.CSS, using = "#BAVehiclePopup-VehicleScreen-BAVehicleCV-AdditionalInterestDetailsDV-AdditionalInterestLV_tb-AddContactsButton-1-ContactType>div[role='button']", AI = false)
		public WebElement btnNewPerson;

		@IFindBy(how = How.CSS, using = "input[name='BAVehiclePopup-VehicleScreen-BAVehicleCV-1-CoverageInputSet-CovPatternInputGroup-1-CovTermInputSet-BooleanTermInput']", AI = false)
		public WebElement rdbNoDeductibleforGlass;

		@IFindBy(how = How.CSS, using = "#BAVehiclePopup-__crumb__", AI = false)
		public WebElement btnReturntoVehicles;

		@IFindBy(how = How.CSS, using = "div[id$='BAGarageLocationInput'] select[name$='BAGarageLocationInput']", AI = false)
		public WebElement drpGaragedAt;

		@IFindBy(how = How.CSS, using = "#BAVehiclePopup-VehicleScreen-BAVehicleCV-BAGarageLocationInputSet-BAGarageLocationInput-NewGarageLocation>div[role='menuitem']", AI = false)
		public WebElement btnNewLocation;

		@IFindBy(how = How.CSS, using = "input[name='BAVehiclePopup-VehicleScreen-BAVehicleCV-VehicleDV-LicensePlate']", AI = false)
		public WebElement inpLicensePlate;

		@IFindBy(how = How.CSS, using = "input[name='BAVehiclePopup-VehicleScreen-BAVehicleCV-VehicleDV-YearPurchased']", AI = false)
		public WebElement inpYearPurchased;

		@IFindBy(how = How.CSS, using = "select[name='BAVehiclePopup-VehicleScreen-PreferredCoverageCurrencySelectorRef-PreferredCoverageCurrencyPanelSet-PreferredCoverageCurrencySelectorDropDown']", AI = false)
		public WebElement drpCoveragesin;

		@IFindBy(how = How.CSS, using = "input[name='BAVehiclePopup-VehicleScreen-BAVehicleCV-VehicleDV-Vin']", AI = false)
		public WebElement inpVIN;

		@IFindBy(how = How.CSS, using = "select[name='BAVehiclePopup-VehicleScreen-BAVehicleCV-VehicleDV-OriginationZone']", AI = false)
		public WebElement drpOriginationZone;

		@IFindBy(how = How.CSS, using = "#BAVehiclePopup-VehicleScreen-BAVehicleCV-AdditionalInterestDetailsDV-AdditionalInterestLV_tb-AddContactsButton-AddOtherContact>div[role='button']", AI = false)
		public WebElement btnOtherContacts;

		@IFindBy(how = How.CSS, using = "input[name='BAVehiclePopup-VehicleScreen-BAVehicleCV-VehicleDV-VehicleNumber']", AI = false)
		public WebElement inpVehicle;

		@IFindBy(how = How.CSS, using = "input[name='BAVehiclePopup-VehicleScreen-BAVehicleCV-0-CoverageInputSet-CovPatternInputGroup-_checkbox']", AI = false)
		public WebElement chkCollision;

		@IFindBy(how = How.CSS, using = "input[name='BAVehiclePopup-VehicleScreen-BAVehicleCV-VehicleDV-Color']", AI = false)
		public WebElement inpColor;

		@IFindBy(how = How.CSS, using = "select[name='BAVehiclePopup-VehicleScreen-BAVehicleCV-0-CoverageInputSet-CovPatternInputGroup-0-CovTermInputSet-OptionTermInput']", AI = false)
		public WebElement drpCollisionDeductible;

		@IFindBy(how = How.CSS, using = "#BAVehiclePopup-VehicleScreen-BAVehicleCV-AdditionalInterestDetailsDV-AdditionalInterestLV_tb-AddContactsButton>div[role='button']", AI = false)
		public WebElement btnAdd;

		@IFindBy(how = How.CSS, using = "#BAVehiclePopup-VehicleScreen-BAVehicleCV-AdditionalInterestDetailsDV-AdditionalInterestLV_tb-AddContactsButton-AddOtherContact-0-acctContact>div[role='button']", AI = false)
		public WebElement btnAdalbertoBarton;

		@IFindBy(how = How.CSS, using = "input[name='BAVehiclePopup-VehicleScreen-BAVehicleCV-VehicleDV-Year']", AI = false)
		public WebElement inpModelYear;

		@IFindBy(how = How.CSS, using = "select[name='BAVehiclePopup-VehicleScreen-BAVehicleCV-VehicleDV-LengthOfLease']", AI = false)
		public WebElement drpLengthofLeaseRentalmonths;

		@IFindBy(how = How.CSS, using = "#BAVehiclePopup-VehicleScreen-BAVehicleCV-AdditionalInterestDetailsDV-AdditionalInterestLV_tb-AddContactsButton-AddExistingContact-0-ExistingAdditionalInterest>div[role='button']", AI = false)
		public WebElement btnMaryaliceGreenholt;

		@IFindBy(how = How.CSS, using = "input[name='BAVehiclePopup-VehicleScreen-BAVehicleCV-VehicleDV-StatedValue']", AI = false)
		public WebElement inpStatedValue;

		@IFindBy(how = How.CSS, using = "select[name='BAVehiclePopup-VehicleScreen-BAVehicleCV-VehicleDV-LicenseState']", AI = false)
		public WebElement drpLicenseState;

		@IFindBy(how = How.CSS, using = "#BAVehiclePopup-VehicleScreen-Update>div[role='button']", AI = false)
		public WebElement btnOK;

		@IFindBy(how = How.CSS, using = "input[name='BAVehiclePopup-VehicleScreen-BAVehicleCV-VehicleDV-VehicleCond']", AI = false)
		public WebElement rdbVehicleConditionWhenPurchased;

		@IFindBy(how = How.CSS, using = "#BAVehiclePopup-VehicleScreen-BAVehicleCV-BAGarageLocationInputSet-BAGarageLocationInput-BAGarageLocationInputMenuIcon>div[role='button']", AI = false)
		public WebElement btnBAGarageLocationInputMenuIcon;

		@IFindBy(how = How.CSS, using = "div[id=gw-center-title-toolbar]>div[id$=VehicleScreen-ttlBar]", AI = false)
		public WebElement lblTtlBar;

		@IFindBy(how = How.CSS, using = "#BAVehiclePopup-VehicleScreen-Edit>div[role='button']", AI = false)
		public WebElement btnEdit;

		@IFindBy(how = How.CSS, using = "input[name='BAVehiclePopup-VehicleScreen-BAVehicleCV-1-CoverageInputSet-CovPatternInputGroup-_checkbox']", AI = false)
		public WebElement chkComprehensive;

		@IFindBy(how = How.CSS, using = "#BAVehiclePopup-VehicleScreen-BAVehicleCV-AdditionalInterestDetailsDV-AdditionalInterestLV_tb-Remove>div[role='button']", AI = false)
		public WebElement btnRemove;

		@IFindBy(how = How.CSS, using = "#BAVehiclePopup-VehicleScreen-BAVehicleCV-AdditionalInterestDetailsDV-AdditionalInterestLV_tb-AddContactsButton-0-ContactType>div[role='button']", AI = false)
		public WebElement btnNewCompany;

		@IFindBy(how = How.CSS, using = "select[name='BAVehiclePopup-VehicleScreen-BAVehicleCV-1-CoverageInputSet-CovPatternInputGroup-0-CovTermInputSet-OptionTermInput']", AI = false)
		public WebElement drpComprehensiveDeductible;

		@IFindBy(how = How.CSS, using = "select[name='BAVehiclePopup-VehicleScreen-BAVehicleCV-VehicleDV-BodyType']", AI = false)
		public WebElement drpBodyType;

		@IFindBy(how = How.CSS, using = "#BAVehiclePopup-VehicleScreen-Cancel>div[role='button']", AI = false)
		public WebElement btnCancel;

		@IFindBy(how = How.CSS, using = "input[name='BAVehiclePopup-VehicleScreen-BAVehicleCV-VehicleDV-LeaseOrRent']", AI = false)
		public WebElement rdbLeasedorRented;

		@IFindBy(how = How.CSS, using = "input[name='BAVehiclePopup-VehicleScreen-PreferredCoverageCurrencySelectorRef-PreferredCoverageCurrencyPanelSet-CoverageCurrencyDisplay']", AI = false)
		public WebElement inpCoveragesin;

		@IFindBy(how = How.CSS, using = "#BAVehiclePopup-VehicleScreen-BAVehicleCV-AdditionalInterestDetailsDV-AdditionalInterestLV_tb-AddContactsButton-AddExistingContact>div[role='button']", AI = false)
		public WebElement btnExistingAdditionalInterest;

		@IFindBy(how = How.CSS, using = "div[id$='SelectClassCode']", AI = false)
		public WebElement icnClassCode;

		@IFindBy(how = How.CSS, using = "div[id$='searchBtns'] div[id$='SearchLinksInputSet-Search']", AI = false)
		public WebElement btnSearch;

		@IFindBy(how = How.CSS, using = "div[id$='_Select']", AI = false)
		public WebElement btnSelect;
		
		@IFindBy(how = How.CSS, using = "div[id$='BAVehiclesLV-_Checkbox']", AI = false)
		public WebElement chkVehicleDetails;

		public VehiclesInformationPage(){
		}

		public VehiclesInformationPage(WebDriver driver){
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
		}public VehiclesInformationPage enterClass(WebDriver driver,String Class) {
			BrowserActions.type(driver, inpClass,Class, "Class");
			return this;
		}
		public VehiclesInformationPage clickSpecifiedCausesofLoss(WebDriver driver)  {
			BrowserActions.click(driver, chkSpecifiedCausesofLoss,"SpecifiedCausesofLoss");
			return this;
		}
		public VehiclesInformationPage clickFromAddressBook(WebDriver driver)  {
			BrowserActions.click(driver, btnFromAddressBook,"FromAddressBook");
			return this;
		}
		public VehiclesInformationPage enterMake(WebDriver driver,String Make) {
			BrowserActions.type(driver, inpMake,Make, "Make");
			return this;
		}
		public VehiclesInformationPage clickEditLocation(WebDriver driver)  {
			BrowserActions.click(driver, btnEditLocation,"EditLocation");
			return this;
		}
		public VehiclesInformationPage selectDestinationZone(WebDriver driver,String DestinationZone)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpDestinationZone,DestinationZone,"DestinationZone");
			return this;
		}
		public VehiclesInformationPage clickCoverages(WebDriver driver)  {
			BrowserActions.click(driver, btnCoverages,"Coverages");
			return this;
		}
		public VehiclesInformationPage enterModel(WebDriver driver,String Model) {
			BrowserActions.type(driver, inpModel,Model, "Model");
			return this;
		}
		public VehiclesInformationPage selectVehicleType(WebDriver driver,String VehicleType)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpVehicleType,VehicleType,true,"VehicleType");
			return this;
		}
		public VehiclesInformationPage clickVehicleDetails(WebDriver driver)  {
			BrowserActions.click(driver, btnVehicleDetails,"VehicleDetails");
			return this;
		}
		public VehiclesInformationPage clickAdditionalCoverages(WebDriver driver)  {
			BrowserActions.click(driver, btnAdditionalCoverages,"AdditionalCoverages");
			return this;
		}
		public VehiclesInformationPage enterCost(WebDriver driver,String Cost) {
			BrowserActions.type(driver, inpCost,Cost,true,2,"Cost");
			return this;
		}
		public VehiclesInformationPage clickNewPerson(WebDriver driver)  {
			BrowserActions.click(driver, btnNewPerson,"NewPerson");
			return this;
		}
		public VehiclesInformationPage clickNoDeductibleforGlass(WebDriver driver)  {
			BrowserActions.click(driver, rdbNoDeductibleforGlass,"NoDeductibleforGlass");
			return this;
		}
		public VehiclesInformationPage clickReturntoVehicles(WebDriver driver)  {
			BrowserActions.click(driver, btnReturntoVehicles,"ReturntoVehicles");
			return this;
		}
		public VehiclesInformationPage selectGaragedAt(WebDriver driver,String GaragedAt)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpGaragedAt,GaragedAt,"GaragedAt");
			return this;
		}
		public VehiclesInformationPage clickNewLocation(WebDriver driver)  {
			BrowserActions.click(driver, btnNewLocation,"NewLocation");
			return this;
		}
		public VehiclesInformationPage enterLicensePlate(WebDriver driver,String LicensePlate) {
			BrowserActions.type(driver, inpLicensePlate,LicensePlate, "LicensePlate");
			return this;
		}
		public VehiclesInformationPage enterYearPurchased(WebDriver driver,String YearPurchased) {
			BrowserActions.type(driver, inpYearPurchased,YearPurchased, "YearPurchased");
			return this;
		}
		public VehiclesInformationPage selectCoveragesin(WebDriver driver,String Coveragesin)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpCoveragesin,Coveragesin,"Coveragesin");
			return this;
		}
		public VehiclesInformationPage enterVIN(WebDriver driver,String VIN) {
			BrowserActions.type(driver, inpVIN,VIN,true,1,"VIN");
			return this;
		}
		public VehiclesInformationPage selectOriginationZone(WebDriver driver,String OriginationZone)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpOriginationZone,OriginationZone,"OriginationZone");
			return this;
		}
		public VehiclesInformationPage clickOtherContacts(WebDriver driver)  {
			BrowserActions.click(driver, btnOtherContacts,"OtherContacts");
			return this;
		}
		public VehiclesInformationPage enterVehicle(WebDriver driver,String Vehicle) {
			BrowserActions.type(driver, inpVehicle,Vehicle, "Vehicle");
			return this;
		}
		public VehiclesInformationPage clickCollision(WebDriver driver)  {
			BrowserActions.click(driver, chkCollision,"Collision");
			return this;
		}
		public VehiclesInformationPage enterColor(WebDriver driver,String Color) {
			BrowserActions.type(driver, inpColor,Color, "Color");
			return this;
		}
		public VehiclesInformationPage selectCollisionDeductible(WebDriver driver,String CollisionDeductible)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpCollisionDeductible,CollisionDeductible,"CollisionDeductible");
			return this;
		}
		public VehiclesInformationPage clickAdd(WebDriver driver)  {
			BrowserActions.click(driver, btnAdd,"Add");
			return this;
		}
		public VehiclesInformationPage clickAdalbertoBarton(WebDriver driver)  {
			BrowserActions.click(driver, btnAdalbertoBarton,"AdalbertoBarton");
			return this;
		}
		public VehiclesInformationPage enterModelYear(WebDriver driver,String ModelYear) {
			BrowserActions.type(driver, inpModelYear,ModelYear, "ModelYear");
			return this;
		}
		public VehiclesInformationPage selectLengthofLeaseRentalmonths(WebDriver driver,String LengthofLeaseRentalmonths)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpLengthofLeaseRentalmonths,LengthofLeaseRentalmonths,"LengthofLeaseRentalmonths");
			return this;
		}
		public VehiclesInformationPage clickMaryaliceGreenholt(WebDriver driver)  {
			BrowserActions.click(driver, btnMaryaliceGreenholt,"MaryaliceGreenholt");
			return this;
		}
		public VehiclesInformationPage enterStatedValue(WebDriver driver,String StatedValue) {
			BrowserActions.type(driver, inpStatedValue,StatedValue, "StatedValue");
			return this;
		}
		public VehiclesInformationPage selectLicenseState(WebDriver driver,String LicenseState)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpLicenseState,LicenseState,"LicenseState");
			return this;
		}
		public VehiclesInformationPage clickOK(WebDriver driver)  {
			BrowserActions.click(driver, btnOK,true,"OK");
			return this;
		}
		public VehiclesInformationPage clickVehicleConditionWhenPurchased(WebDriver driver)  {
			BrowserActions.click(driver, rdbVehicleConditionWhenPurchased,"VehicleConditionWhenPurchased");
			return this;
		}
		public VehiclesInformationPage clickBAGarageLocationInputMenuIcon(WebDriver driver)  {
			BrowserActions.click(driver, btnBAGarageLocationInputMenuIcon,"BAGarageLocationInputMenuIcon");
			return this;
		}
		public VehiclesInformationPage clickEdit(WebDriver driver)  {
			BrowserActions.click(driver, btnEdit,"Edit");
			return this;
		}
		public VehiclesInformationPage clickComprehensive(WebDriver driver)  {
			BrowserActions.click(driver, chkComprehensive,"Comprehensive");
			return this;
		}
		public VehiclesInformationPage clickRemove(WebDriver driver)  {
			BrowserActions.click(driver, btnRemove,"Remove");
			return this;
		}
		public VehiclesInformationPage clickNewCompany(WebDriver driver)  {
			BrowserActions.click(driver, btnNewCompany,"NewCompany");
			return this;
		}
		public VehiclesInformationPage selectComprehensiveDeductible(WebDriver driver,String ComprehensiveDeductible)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpComprehensiveDeductible,ComprehensiveDeductible,"ComprehensiveDeductible");
			return this;
		}
		public VehiclesInformationPage selectBodyType(WebDriver driver,String BodyType)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpBodyType,BodyType,"BodyType");
			return this;
		}
		public VehiclesInformationPage clickCancel(WebDriver driver)  {
			BrowserActions.click(driver, btnCancel,"Cancel");
			return this;
		}
		public VehiclesInformationPage clickLeasedorRented(WebDriver driver)  {
			BrowserActions.click(driver, rdbLeasedorRented,"LeasedorRented");
			return this;
		}
		public VehiclesInformationPage enterCoveragesin(WebDriver driver,String Coveragesin) {
			BrowserActions.type(driver, inpCoveragesin,Coveragesin, "Coveragesin");
			return this;
		}
		public VehiclesInformationPage clickExistingAdditionalInterest(WebDriver driver)  {
			BrowserActions.click(driver, btnExistingAdditionalInterest,"ExistingAdditionalInterest");
			return this;
		}
		public void selectGaragedat(WebDriver driver) {
			BrowserActions.selectDropDownByIndex(driver,drpGaragedAt,1,true,"Garaged at");
		}
		public void clickMagnifierClassCode(WebDriver driver)  {
			BrowserActions.click(driver, icnClassCode,2,"Magnfier class code");
		}
		public void clickSearch(WebDriver driver)  {
			BrowserActions.click(driver, btnSearch,2,"Search button");
		}
		public void clickSelect(WebDriver driver)  {
			BrowserActions.click(driver, btnSelect, "Select button");
		}
	}

}
