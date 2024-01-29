package com.aspire.guidewire.pc.pages.common;
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

public class OfferingsPage extends LoadableComponent<OfferingsPage> {

	WebDriver driver;
	String elementIdentifier;
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

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-OfferingScreen-JobWizardToolbarButtonSet-BindOptions-BindOnly>div[role='menuitem']", AI = false)
	public WebElement btnBindOnly;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-JobGroupItem>div[role='menuitem']", AI = false)
	public WebElement btnSG01838332082908930690;

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

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-OfferingScreen-JobWizardToolbarButtonSet-Versions-NewVersion>div[role='menuitem']", AI = false)
	public WebElement btnStartMultiVersion;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Prev>div[role='button']", AI = false)
	public WebElement btnBack;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-PolicyVersions>div[role='menuitem']", AI = false)
	public WebElement btnPolicyVersions_1;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-15-item>div[role='menuitem']", AI = false)
	public WebElement btnReviewProducer;

	@IFindBy(how = How.CSS, using = "div[id$='Next']", AI = false)
	public WebElement btnNext;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-RiskEvaluation>div[role='menuitem']", AI = false)
	public WebElement btnRiskAnalysis_1;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-10-item>div[role='menuitem']", AI = false)
	public WebElement btnQuoteRequired;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-8-item>div[role='menuitem']", AI = false)
	public WebElement btnPolicyReviewMidterm;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-OfferingScreen-JobWizardToolbarButtonSet-Versions-ViewSideBySide>div[role='menuitem']", AI = false)
	public WebElement btnViewSideBySideVersions;

	@IFindBy(how = How.CSS, using = "select[name$='-OfferingSelection']", AI = false)
	public WebElement drpOfferingSelection;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-OfferingScreen-JobWizardToolbarButtonSet-Draft>div[role='button']", AI = false)
	public WebElement btnSaveDraft;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-0-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0183833208;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-3-item>div[role='menuitem']", AI = false)
	public WebElement btnGetBureauData;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Reinsurance>div[role='menuitem']", AI = false)
	public WebElement btnReinsurance;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-BillingInfo>div[role='menuitem']", AI = false)
	public WebElement btnPayment;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Change-WizardMenuActions_ChangeEffDate>div[role='menuitem']", AI = false)
	public WebElement btnEffectiveDate;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-OfferingScreen-QuoteRequestedAlert .gw-AlertBar--label", AI = false)
	public WebElement lblQuoteRequestedAlert;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewDocument-NewJobDocumentMenuItemSet-PolicyPeriodNewDocumentMenuItemSet_Template>div[role='menuitem']", AI = false)
	public WebElement btnCreatefromatemplate;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-OfferingScreen-JobWizardToolbarButtonSet-Versions-SideBySide>div[role='menuitem']", AI = false)
	public WebElement btnStartSidebySide;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Archiving>div[role='menuitem']", AI = false)
	public WebElement btnArchiving;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-OfferingScreen-JobWizardToolbarButtonSet-CloseOptions-NotTakenJob>div[role='menuitem']", AI = false)
	public WebElement btnNotTaken;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Documents>div[role='menuitem']", AI = false)
	public WebElement btnDocuments;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-OfferingScreen-OOSEPanelSet-NextSliceLink", AI = false)
	public WebElement btnNextBlockedDate;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-2-item>div[role='menuitem']", AI = false)
	public WebElement btn90daydiary;

	@IFindBy(how = How.CSS, using = "div[id$='QuoteTypeToolbarButtonSet-Quote']", AI = false)
	public WebElement btnQuote;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-PersonalVehicles>div[role='menuitem']", AI = false)
	public WebElement btnVehicles;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-OfferingScreen-JobWizardToolbarButtonSet-BindOptions>div[role='button']", AI = false)
	public WebElement btnBindOptions;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-OfferingScreen-JobWizardToolbarButtonSet-Unlock>div[role='button']", AI = false)
	public WebElement btnReleaseLock;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Archiving-WizardMenuActions_SuspendResumeArchiving>div[role='menuitem']", AI = false)
	public WebElement btnEnableDisable;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-OfferingScreen-JobWizardToolbarButtonSet-BindOptions-BindAndIssue>div[role='menuitem']", AI = false)
	public WebElement btnIssuePolicy;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-0-item>div[role='menuitem']", AI = false)
	public WebElement btnCreateNewProducer;

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
	public WebElement btnQuote_1;

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

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-OfferingScreen-OOSEPanelSet-OOSEPeriodSelector-OOSEPeriodSelector_Arg']", AI = false)
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

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-CollectCreditCard>div[role='menuitem']", AI = false)
	public WebElement btnCollectCreditCard;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-11-item>div[role='menuitem']", AI = false)
	public WebElement btnRatiooutofrange;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-OfferingScreen-JobWizardToolbarButtonSet-ConvertToFullApp>div[role='button']", AI = false)
	public WebElement btnFullApp;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-PolicyReview>div[role='menuitem']", AI = false)
	public WebElement btnPolicyReview;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-DiagWorksheetItem>div[role='menuitem']", AI = false)
	public WebElement btnDiagnosticData;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-OfferingScreen-OOSEPanelSet-OOSEPeriodSelector", AI = false)
	public WebElement btnOOSEPeriodSelector;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-11-item>div[role='menuitem']", AI = false)
	public WebElement btnManuallyrateandquotepolicy;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-PADrivers>div[role='menuitem']", AI = false)
	public WebElement btnDrivers;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-History>div[role='menuitem']", AI = false)
	public WebElement btnHistory;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category>div[role='menuitem']", AI = false)
	public WebElement btnReminder;

	@IFindBy(how = How.CSS, using = "div[id*='-OfferingScreen-ttlBar']", AI = false)
	public WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Change>div[role='menuitem']", AI = false)
	public WebElement btnEdit;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-OfferingScreen-JobWizardToolbarButtonSet-CloseOptions-WithdrawJob>div[role='menuitem']", AI = false)
	public WebElement btnWithdrawTransaction;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-PolicyInfo>div[role='menuitem']", AI = false)
	public WebElement btnPolicyInfo;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-OfferingScreen-JobWizardToolbarButtonSet-Versions>div[role='button']", AI = false)
	public WebElement btnVersions;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_ToAccountFile>div[role='menuitem']", AI = false)
	public WebElement btnAccountFile;

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

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-OfferingScreen-QuoteRequestedAlert-CloseBtn", AI = false)
	public WebElement btnClose;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-12-item>div[role='menuitem']", AI = false)
	public WebElement btnReview30dayUWPeriod;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-ManageBranches>div[role='menuitem']", AI = false)
	public WebElement btnPolicyVersions;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-14-item>div[role='menuitem']", AI = false)
	public WebElement btnReview60dayUWPeriod;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-OfferingScreen-JobWizardToolbarButtonSet-EditPolicy>div[role='button']", AI = false)
	public WebElement btnEditPolicyTransaction;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity>div[role='menuitem']", AI = false)
	public WebElement btnNewActivity;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Cancel>div[role='button']", AI = false)
	public WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-OfferingScreen-JobWizardToolbarButtonSet-CloseOptions>div[role='button']", AI = false)
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

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-OfferingScreen-JobWizardToolbarButtonSet-CloseOptions-Decline>div[role='menuitem']", AI = false)
	public WebElement btnDecline;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardActionsMenuItemSet-SubmissionInfo>div[role='menuitem']", AI = false)
	public WebElement btnSubManager;

	public OfferingsPage(){
	}

	public OfferingsPage(WebDriver driver){
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, Utils.maxElementWait);
		PageFactory.initElements(finder, this);
		elementLayer = new ElementLayer(driver);
}
	
	public OfferingsPage(WebDriver driver,int timeout){
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
public OfferingsPage clickWorkplan(WebDriver driver)  {
					BrowserActions.click(driver, btnWorkplan,"Workplan");
				    return this;
			}
public OfferingsPage clickGetRiskInformationProducer(WebDriver driver)  {
					BrowserActions.click(driver, btnGetRiskInformationProducer,"GetRiskInformationProducer");
				    return this;
			}
public OfferingsPage clickCopySubmission(WebDriver driver)  {
					BrowserActions.click(driver, btnCopySubmission,"CopySubmission");
				    return this;
			}
public OfferingsPage clickGeneralreminderdiary(WebDriver driver)  {
					BrowserActions.click(driver, btnGeneralreminderdiary,"Generalreminderdiary");
				    return this;
			}
public OfferingsPage clickGetReinsuranceQuote(WebDriver driver)  {
					BrowserActions.click(driver, btnGetReinsuranceQuote,"GetReinsuranceQuote");
				    return this;
			}
public OfferingsPage clickReview45dayUWPeriod(WebDriver driver)  {
					BrowserActions.click(driver, btnReview45dayUWPeriod,"Review45dayUWPeriod");
				    return this;
			}
public OfferingsPage clickGetAuditInternalPersonnel(WebDriver driver)  {
					BrowserActions.click(driver, btnGetAuditInternalPersonnel,"GetAuditInternalPersonnel");
				    return this;
			}
public OfferingsPage clickBindOnly(WebDriver driver)  {
					BrowserActions.click(driver, btnBindOnly,"BindOnly");
				    return this;
			}
public OfferingsPage clickSG01838332082908930690(WebDriver driver)  {
					BrowserActions.click(driver, btnSG01838332082908930690,"SG01838332082908930690");
				    return this;
			}
public OfferingsPage clickInterview(WebDriver driver)  {
					BrowserActions.click(driver, btnInterview,"Interview");
				    return this;
			}
public OfferingsPage selectPolicyPeriodSelector_Arg(WebDriver driver,String PolicyPeriodSelector_Arg)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPolicyPeriodSelector_Arg,PolicyPeriodSelector_Arg,"PolicyPeriodSelector_Arg");
				    return this;
			}
public OfferingsPage clickPerformanceReview(WebDriver driver)  {
					BrowserActions.click(driver, btnPerformanceReview,"PerformanceReview");
				    return this;
			}
public OfferingsPage clickShowPartialWorksheet(WebDriver driver)  {
					BrowserActions.click(driver, btnShowPartialWorksheet,"ShowPartialWorksheet");
				    return this;
			}
public OfferingsPage click60daydiary(WebDriver driver)  {
					BrowserActions.click(driver, btn60daydiary,"60daydiary");
				    return this;
			}
public OfferingsPage clickStartMultiVersion(WebDriver driver)  {
					BrowserActions.click(driver, btnStartMultiVersion,"StartMultiVersion");
				    return this;
			}
public OfferingsPage clickBack(WebDriver driver)  {
					BrowserActions.click(driver, btnBack,"Back");
				    return this;
			}
public OfferingsPage clickPolicyVersions_1(WebDriver driver)  {
					BrowserActions.click(driver, btnPolicyVersions_1,"PolicyVersions_1");
				    return this;
			}
public OfferingsPage clickReviewProducer(WebDriver driver)  {
					BrowserActions.click(driver, btnReviewProducer,"ReviewProducer");
				    return this;
			}
public OfferingsPage clickNext(WebDriver driver)  {
					BrowserActions.click(driver, btnNext,"Next");
				    return this;
			}
public OfferingsPage clickRiskAnalysis_1(WebDriver driver)  {
					BrowserActions.click(driver, btnRiskAnalysis_1,"RiskAnalysis_1");
				    return this;
			}
public OfferingsPage clickQuoteRequired(WebDriver driver)  {
					BrowserActions.click(driver, btnQuoteRequired,"QuoteRequired");
				    return this;
			}
public OfferingsPage clickPolicyReviewMidterm(WebDriver driver)  {
					BrowserActions.click(driver, btnPolicyReviewMidterm,"PolicyReviewMidterm");
				    return this;
			}
public OfferingsPage clickViewSideBySideVersions(WebDriver driver)  {
					BrowserActions.click(driver, btnViewSideBySideVersions,"ViewSideBySideVersions");
				    return this;
			}
public OfferingsPage selectOfferingSelection(WebDriver driver,String OfferingSelection)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpOfferingSelection,OfferingSelection,"OfferingSelection");
				    return this;
			}
public OfferingsPage clickSaveDraft(WebDriver driver)  {
					BrowserActions.click(driver, btnSaveDraft,"SaveDraft");
				    return this;
			}
public OfferingsPage clickPA0183833208(WebDriver driver)  {
					BrowserActions.click(driver, btnPA0183833208,"PA0183833208");
				    return this;
			}
public OfferingsPage clickGetBureauData(WebDriver driver)  {
					BrowserActions.click(driver, btnGetBureauData,"GetBureauData");
				    return this;
			}
public OfferingsPage clickReinsurance(WebDriver driver)  {
					BrowserActions.click(driver, btnReinsurance,"Reinsurance");
				    return this;
			}
public OfferingsPage clickPayment(WebDriver driver)  {
					BrowserActions.click(driver, btnPayment,"Payment");
				    return this;
			}
public OfferingsPage clickEffectiveDate(WebDriver driver)  {
					BrowserActions.click(driver, btnEffectiveDate,"EffectiveDate");
				    return this;
			}
public OfferingsPage clickCreatefromatemplate(WebDriver driver)  {
					BrowserActions.click(driver, btnCreatefromatemplate,"Createfromatemplate");
				    return this;
			}
public OfferingsPage clickStartSidebySide(WebDriver driver)  {
					BrowserActions.click(driver, btnStartSidebySide,"StartSidebySide");
				    return this;
			}
public OfferingsPage clickArchiving(WebDriver driver)  {
					BrowserActions.click(driver, btnArchiving,"Archiving");
				    return this;
			}
public OfferingsPage clickNotTaken(WebDriver driver)  {
					BrowserActions.click(driver, btnNotTaken,"NotTaken");
				    return this;
			}
public OfferingsPage clickDocuments(WebDriver driver)  {
					BrowserActions.click(driver, btnDocuments,"Documents");
				    return this;
			}
public OfferingsPage clickNextBlockedDate(WebDriver driver)  {
					BrowserActions.click(driver, btnNextBlockedDate,"NextBlockedDate");
				    return this;
			}
public OfferingsPage click90daydiary(WebDriver driver)  {
					BrowserActions.click(driver, btn90daydiary,"90daydiary");
				    return this;
			}
public OfferingsPage clickQuote(WebDriver driver)  {
					BrowserActions.click(driver, btnQuote,"Quote");
				    return this;
			}
public OfferingsPage clickVehicles(WebDriver driver)  {
					BrowserActions.click(driver, btnVehicles,"Vehicles");
				    return this;
			}
public OfferingsPage clickBindOptions(WebDriver driver)  {
					BrowserActions.click(driver, btnBindOptions,"BindOptions");
				    return this;
			}
public OfferingsPage clickReleaseLock(WebDriver driver)  {
					BrowserActions.click(driver, btnReleaseLock,"ReleaseLock");
				    return this;
			}
public OfferingsPage clickEnableDisable(WebDriver driver)  {
					BrowserActions.click(driver, btnEnableDisable,"EnableDisable");
				    return this;
			}
public OfferingsPage clickIssuePolicy(WebDriver driver)  {
					BrowserActions.click(driver, btnIssuePolicy,"IssuePolicy");
				    return this;
			}
public OfferingsPage clickCreateNewProducer(WebDriver driver)  {
					BrowserActions.click(driver, btnCreateNewProducer,"CreateNewProducer");
				    return this;
			}
public OfferingsPage clickForms(WebDriver driver)  {
					BrowserActions.click(driver, btnForms,"Forms");
				    return this;
			}
public OfferingsPage clickPolicyPeriodSelector(WebDriver driver)  {
					BrowserActions.click(driver, btnPolicyPeriodSelector,"PolicyPeriodSelector");
				    return this;
			}
public OfferingsPage clickNewmail(WebDriver driver)  {
					BrowserActions.click(driver, btnNewmail,"Newmail");
				    return this;
			}
public OfferingsPage clickGetMotorVehicleReports(WebDriver driver)  {
					BrowserActions.click(driver, btnGetMotorVehicleReports,"GetMotorVehicleReports");
				    return this;
			}
public OfferingsPage clickQualification(WebDriver driver)  {
					BrowserActions.click(driver, btnQualification,"Qualification");
				    return this;
			}
public OfferingsPage clickNotes(WebDriver driver)  {
					BrowserActions.click(driver, btnNotes,"Notes");
				    return this;
			}
public OfferingsPage clickQuote_1(WebDriver driver)  {
					BrowserActions.click(driver, btnQuote_1,"Quote_1");
				    return this;
			}
public OfferingsPage clickGetInspectionLossControl(WebDriver driver)  {
					BrowserActions.click(driver, btnGetInspectionLossControl,"GetInspectionLossControl");
				    return this;
			}
public OfferingsPage clickParticipants(WebDriver driver)  {
					BrowserActions.click(driver, btnParticipants,"Participants");
				    return this;
			}
public OfferingsPage clickCreate(WebDriver driver)  {
					BrowserActions.click(driver, btnCreate,"Create");
				    return this;
			}
public OfferingsPage clickPACoverages(WebDriver driver)  {
					BrowserActions.click(driver, btnPACoverages,"PACoverages");
				    return this;
			}
public OfferingsPage clickReviewandapprove(WebDriver driver)  {
					BrowserActions.click(driver, btnReviewandapprove,"Reviewandapprove");
				    return this;
			}
public OfferingsPage selectEffectiveDate(WebDriver driver,String EffectiveDate)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpEffectiveDate,EffectiveDate,"EffectiveDate");
				    return this;
			}
public OfferingsPage clickLegalreview(WebDriver driver)  {
					BrowserActions.click(driver, btnLegalreview,"Legalreview");
				    return this;
			}
public OfferingsPage clickNewDocument(WebDriver driver)  {
					BrowserActions.click(driver, btnNewDocument,"NewDocument");
				    return this;
			}
public OfferingsPage clickPolicynotification(WebDriver driver)  {
					BrowserActions.click(driver, btnPolicynotification,"Policynotification");
				    return this;
			}
public OfferingsPage clickUploaddocuments(WebDriver driver)  {
					BrowserActions.click(driver, btnUploaddocuments,"Uploaddocuments");
				    return this;
			}
public OfferingsPage clickFinish(WebDriver driver)  {
					BrowserActions.click(driver, btnFinish,"Finish");
				    return this;
			}
public OfferingsPage clickGoto(WebDriver driver)  {
					BrowserActions.click(driver, btnGoto,"Goto");
				    return this;
			}
public OfferingsPage clickProductDefinition(WebDriver driver)  {
					BrowserActions.click(driver, btnProductDefinition,"ProductDefinition");
				    return this;
			}
public OfferingsPage clickGetInspectionOutsideService(WebDriver driver)  {
					BrowserActions.click(driver, btnGetInspectionOutsideService,"GetInspectionOutsideService");
				    return this;
			}
public OfferingsPage clickUnderwriterReview(WebDriver driver)  {
					BrowserActions.click(driver, btnUnderwriterReview,"UnderwriterReview");
				    return this;
			}
public OfferingsPage clickMeetwithInsured(WebDriver driver)  {
					BrowserActions.click(driver, btnMeetwithInsured,"MeetwithInsured");
				    return this;
			}
public OfferingsPage click30daydiary(WebDriver driver)  {
					BrowserActions.click(driver, btn30daydiary,"30daydiary");
				    return this;
			}
public OfferingsPage clickOfferings(WebDriver driver)  {
					BrowserActions.click(driver, btnOfferings,"Offerings");
				    return this;
			}
public OfferingsPage clickPolicyReviewRenewal(WebDriver driver)  {
					BrowserActions.click(driver, btnPolicyReviewRenewal,"PolicyReviewRenewal");
				    return this;
			}
public OfferingsPage clickNewNote(WebDriver driver)  {
					BrowserActions.click(driver, btnNewNote,"NewNote");
				    return this;
			}
public OfferingsPage clickSidebySideQuoting(WebDriver driver)  {
					BrowserActions.click(driver, btnSidebySideQuoting,"SidebySideQuoting");
				    return this;
			}
public OfferingsPage clickRiskAnalysis(WebDriver driver)  {
					BrowserActions.click(driver, btnRiskAnalysis,"RiskAnalysis");
				    return this;
			}
public OfferingsPage clickMeetwithProducerAgency(WebDriver driver)  {
					BrowserActions.click(driver, btnMeetwithProducerAgency,"MeetwithProducerAgency");
				    return this;
			}
public OfferingsPage clickCollectCreditCard(WebDriver driver)  {
					BrowserActions.click(driver, btnCollectCreditCard,"CollectCreditCard");
				    return this;
			}
public OfferingsPage clickRatiooutofrange(WebDriver driver)  {
					BrowserActions.click(driver, btnRatiooutofrange,"Ratiooutofrange");
				    return this;
			}
public OfferingsPage clickFullApp(WebDriver driver)  {
					BrowserActions.click(driver, btnFullApp,"FullApp");
				    return this;
			}
public OfferingsPage clickPolicyReview(WebDriver driver)  {
					BrowserActions.click(driver, btnPolicyReview,"PolicyReview");
				    return this;
			}
public OfferingsPage clickDiagnosticData(WebDriver driver)  {
					BrowserActions.click(driver, btnDiagnosticData,"DiagnosticData");
				    return this;
			}
public OfferingsPage clickOOSEPeriodSelector(WebDriver driver)  {
					BrowserActions.click(driver, btnOOSEPeriodSelector,"OOSEPeriodSelector");
				    return this;
			}
public OfferingsPage clickManuallyrateandquotepolicy(WebDriver driver)  {
					BrowserActions.click(driver, btnManuallyrateandquotepolicy,"Manuallyrateandquotepolicy");
				    return this;
			}
public OfferingsPage clickDrivers(WebDriver driver)  {
					BrowserActions.click(driver, btnDrivers,"Drivers");
				    return this;
			}
public OfferingsPage clickHistory(WebDriver driver)  {
					BrowserActions.click(driver, btnHistory,"History");
				    return this;
			}
public OfferingsPage clickReminder(WebDriver driver)  {
					BrowserActions.click(driver, btnReminder,"Reminder");
				    return this;
			}
public OfferingsPage clickEdit(WebDriver driver)  {
					BrowserActions.click(driver, btnEdit,"Edit");
				    return this;
			}
public OfferingsPage clickWithdrawTransaction(WebDriver driver)  {
					BrowserActions.click(driver, btnWithdrawTransaction,"WithdrawTransaction");
				    return this;
			}
public OfferingsPage clickPolicyInfo(WebDriver driver)  {
					BrowserActions.click(driver, btnPolicyInfo,"PolicyInfo");
				    return this;
			}
public OfferingsPage clickVersions(WebDriver driver)  {
					BrowserActions.click(driver, btnVersions,"Versions");
				    return this;
			}
public OfferingsPage clickAccountFile(WebDriver driver)  {
					BrowserActions.click(driver, btnAccountFile,"AccountFile");
				    return this;
			}
public OfferingsPage clickReviewnewmail(WebDriver driver)  {
					BrowserActions.click(driver, btnReviewnewmail,"Reviewnewmail");
				    return this;
			}
public OfferingsPage clickGroup(WebDriver driver)  {
					BrowserActions.click(driver, btnGroup,"Group");
				    return this;
			}
public OfferingsPage clickCancelasplitpolicy(WebDriver driver)  {
					BrowserActions.click(driver, btnCancelasplitpolicy,"Cancelasplitpolicy");
				    return this;
			}
public OfferingsPage clickGetAuditOutsideService(WebDriver driver)  {
					BrowserActions.click(driver, btnGetAuditOutsideService,"GetAuditOutsideService");
				    return this;
			}
public OfferingsPage clickCopyData(WebDriver driver)  {
					BrowserActions.click(driver, btnCopyData,"CopyData");
				    return this;
			}
public OfferingsPage clickNewAuditAssignment(WebDriver driver)  {
					BrowserActions.click(driver, btnNewAuditAssignment,"NewAuditAssignment");
				    return this;
			}
public OfferingsPage clickRewritetoNewAccount(WebDriver driver)  {
					BrowserActions.click(driver, btnRewritetoNewAccount,"RewritetoNewAccount");
				    return this;
			}
public OfferingsPage clickClose(WebDriver driver)  {
					BrowserActions.click(driver, btnClose,"Close");
				    return this;
			}
public OfferingsPage clickReview30dayUWPeriod(WebDriver driver)  {
					BrowserActions.click(driver, btnReview30dayUWPeriod,"Review30dayUWPeriod");
				    return this;
			}
public OfferingsPage clickPolicyVersions(WebDriver driver)  {
					BrowserActions.click(driver, btnPolicyVersions,"PolicyVersions");
				    return this;
			}
public OfferingsPage clickReview60dayUWPeriod(WebDriver driver)  {
					BrowserActions.click(driver, btnReview60dayUWPeriod,"Review60dayUWPeriod");
				    return this;
			}
public OfferingsPage clickEditPolicyTransaction(WebDriver driver)  {
					BrowserActions.click(driver, btnEditPolicyTransaction,"EditPolicyTransaction");
				    return this;
			}
public OfferingsPage clickNewActivity(WebDriver driver)  {
					BrowserActions.click(driver, btnNewActivity,"NewActivity");
				    return this;
			}
public OfferingsPage clickCancel(WebDriver driver)  {
					BrowserActions.click(driver, btnCancel,"Cancel");
				    return this;
			}
public OfferingsPage clickCloseOptions(WebDriver driver)  {
					BrowserActions.click(driver, btnCloseOptions,"CloseOptions");
				    return this;
			}
public OfferingsPage clickPolicyContract(WebDriver driver)  {
					BrowserActions.click(driver, btnPolicyContract,"PolicyContract");
				    return this;
			}
public OfferingsPage clickPolicyFile(WebDriver driver)  {
					BrowserActions.click(driver, btnPolicyFile,"PolicyFile");
				    return this;
			}
public OfferingsPage clickVerifycoverage(WebDriver driver)  {
					BrowserActions.click(driver, btnVerifycoverage,"Verifycoverage");
				    return this;
			}
public OfferingsPage clickRequest(WebDriver driver)  {
					BrowserActions.click(driver, btnRequest,"Request");
				    return this;
			}
public OfferingsPage clickGetCreditReports(WebDriver driver)  {
					BrowserActions.click(driver, btnGetCreditReports,"GetCreditReports");
				    return this;
			}
public OfferingsPage clickDecline(WebDriver driver)  {
					BrowserActions.click(driver, btnDecline,"Decline");
				    return this;
			}
public OfferingsPage clickSubManager(WebDriver driver)  {
					BrowserActions.click(driver, btnSubManager,"SubManager");
				    return this;
			}
}
