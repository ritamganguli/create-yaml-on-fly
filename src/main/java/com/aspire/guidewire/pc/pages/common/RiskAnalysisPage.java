package com.aspire.guidewire.pc.pages.common;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.testng.Assert;

import com.aspire.guidewire.utils.BrowserActions;
import com.aspire.guidewire.utils.ElementLayer;
import com.aspire.guidewire.utils.EnvironmentPropertiesReader;
import com.aspire.guidewire.utils.Log;
import com.aspire.guidewire.utils.Utils;
import com.aspire.guidewire.utils.WaitUtils;

import ASPIREAI.customfactories.AjaxElementLocatorFactory;
import ASPIREAI.customfactories.IFindBy;
import ASPIREAI.customfactories.PageFactory;

public class RiskAnalysisPage extends LoadableComponent<RiskAnalysisPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	@IFindBy(how = How.CSS, using = "div[id$='RiskAnalysisScreen-0']", AI = false)
	public WebElement lblTtlBar;

	@IFindBy(how = How.XPATH, using = "//div[text()='Return to Risk Analysis']", AI = false)
	public WebElement lnkReturnPage;

	@IFindBy(how = How.CSS, using = "div[id$='Update']>div[role='button']", AI = false)
	public WebElement btnOk;

	@IFindBy(how = How.CSS, using = "input[name$='OccurrenceDate']", AI = false)
	public WebElement tabOccurenceDate;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Workplan>div[role='menuitem']", AI = false)
	public WebElement btnWorkplan;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Job_RiskAnalysisScreen-RiskAnalysisCV_tb-AddNewContingencyButton>div[role='button']", AI = false)
	public WebElement btnAddContingency;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-Job_RiskAnalysisScreen-RiskAnalysisCV-ClaimDetailsCV-ClaimDetailsDV-Status']", AI = false)
	public WebElement inpStatus;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_CopySubmission>div[role='menuitem']", AI = false)
	public WebElement btnCopySubmission;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-4-item>div[role='menuitem']", AI = false)
	public WebElement btnGeneralreminderdiary;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-8-item>div[role='menuitem']", AI = false)
	public WebElement btnGetReinsuranceQuote;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-13-item>div[role='menuitem']", AI = false)
	public WebElement btnReview45dayUWPeriod;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Job_RiskAnalysisScreen-RiskAnalysisCV-PriorPolicyCardTab", AI = false)
	public WebElement btnPriorPolicies;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Job_RiskAnalysisScreen-JobWizardToolbarButtonSet-BindOptions-BindOnly>div[role='menuitem']", AI = false)
	public WebElement btnBindOnly;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-JobGroupItem>div[role='menuitem']", AI = false)
	public WebElement btnSG01838332082908930690;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-0-NewActivityMenuItemSet_Category>div[role='menuitem']", AI = false)
	public WebElement btnInterview;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Job_RiskAnalysisScreen-RiskAnalysisCV-ClaimDetailsCV-ClaimDetailsDV-TotalPaidLoss", AI = false)
	public WebElement lblRecoveries;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-6-item>div[role='menuitem']", AI = false)
	public WebElement btnPerformanceReview;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Job_RiskAnalysisScreen-JobWizardToolbarButtonSet-Versions-NewVersion>div[role='menuitem']", AI = false)
	public WebElement btnStartMultiVersion;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-15-item>div[role='menuitem']", AI = false)
	public WebElement btnReviewProducer;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-RiskEvaluation>div[role='menuitem']", AI = false)
	public WebElement btnRiskAnalysis_1;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-8-item>div[role='menuitem']", AI = false)
	public WebElement btnPolicyReviewMidterm;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Job_RiskAnalysisScreen-JobWizardToolbarButtonSet-Versions-ViewSideBySide>div[role='menuitem']", AI = false)
	public WebElement btnViewSideBySideVersions;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-0-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0183833208;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-Job_RiskAnalysisScreen-RiskAnalysisCV-DateRangeForClaimSearch-DateRangeForClaimSearchEndDate']", AI = false)
	public WebElement inpTo;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-BillingInfo>div[role='menuitem']", AI = false)
	public WebElement btnPayment;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-Job_RiskAnalysisScreen-RiskAnalysisCV-ClaimDetailsCV-ClaimDetailsDV-Litigation']", AI = false)
	public WebElement rdbLitigation;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Change-WizardMenuActions_ChangeEffDate>div[role='menuitem']", AI = false)
	public WebElement btnEffectiveDate;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Job_RiskAnalysisScreen-RiskAnalysisCV-ContingenciesCardTab", AI = false)
	public WebElement btnContingencies;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-Job_RiskAnalysisScreen-RiskAnalysisCV-ClaimDetailsCV-ClaimDetailsDV-PolicyType']", AI = false)
	public WebElement inpProduct;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-Job_RiskAnalysisScreen-RiskAnalysisCV-ClaimDetailsCV-ClaimDetailsDV-ClaimSecurityType']", AI = false)
	public WebElement inpClaimType;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-Job_RiskAnalysisScreen-RiskAnalysisCV-DateRangeForClaimSearch-DateRangeForClaimSearchStartDate']", AI = false)
	public WebElement inpFrom;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-Job_RiskAnalysisScreen-RiskAnalysisCV-ClaimDetailsCV-ClaimDetailsDV-ClaimNumber']", AI = false)
	public WebElement inpClaimNumber;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Job_RiskAnalysisScreen-OOSEPanelSet-NextSliceLink", AI = false)
	public WebElement btnNextBlockedDate;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-2-item>div[role='menuitem']", AI = false)
	public WebElement btn90daydiary;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Job_RiskAnalysisScreen-JobWizardToolbarButtonSet-BindOptions>div[role='button']", AI = false)
	public WebElement btnBindOptions;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Archiving-WizardMenuActions_SuspendResumeArchiving>div[role='menuitem']", AI = false)
	public WebElement btnEnableDisable;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Job_RiskAnalysisScreen-JobWizardToolbarButtonSet-BindOptions-BindAndIssue>div[role='menuitem']", AI = false)
	public WebElement btnIssuePolicy;

	@IFindBy(how = How.CSS, using = "div[id$='AddManualIssue']", AI = false)
	public WebElement btnAddUWIssue;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-MultiQuoteAcceleratedMenuActions-PolicyPeriodSelector", AI = false)
	public WebElement btnPolicyPeriodSelector;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Job_RiskAnalysisScreen-RiskAnalysisCV-LossHistoryCardTab", AI = false)
	public WebElement btnPriorLosses;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-1-NewActivityMenuItemSet_Category>div[role='menuitem']", AI = false)
	public WebElement btnNewmail;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-7-item>div[role='menuitem']", AI = false)
	public WebElement btnGetMotorVehicleReports;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-PreQualification>div[role='menuitem']", AI = false)
	public WebElement btnQualification;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-Job_RiskAnalysisScreen-RiskAnalysisCV-ClaimDetailsCV-ClaimDetailsDV-Injury']", AI = false)
	public WebElement rdbInjuries;

	@IFindBy(how = How.CSS, using = "div[id$='UWIssueRowSet-Approve']", AI = false)
	public WebElement btnApprove;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Participants>div[role='menuitem']", AI = false)
	public WebElement btnParticipants;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-PALine>div[role='menuitem']", AI = false)
	public WebElement btnPACoverages;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-4-NewActivityMenuItemSet_Category-0-item>div[role='menuitem']", AI = false)
	public WebElement btnReviewandapprove;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-Job_RiskAnalysisScreen-OOSEPanelSet-OOSEPeriodSelector-OOSEPeriodSelector_Arg']", AI = false)
	public WebElement drpEffectiveDate;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-Job_RiskAnalysisScreen-RiskAnalysisCV-ClaimDetailsCV-ClaimDetailsDV-PolicyPeriodStart']", AI = false)
	public WebElement inpPolicyPeriodStart;

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

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-Job_RiskAnalysisScreen-RiskAnalysisCV-RiskEvaluationPanelSet-UserViewFilter']", AI = false)
	public WebElement drpViewIssuesBlocking;

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

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Job_RiskAnalysisScreen-RiskAnalysisCV-ClaimsCardTab", AI = false)
	public WebElement btnClaims;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-PolicyReview>div[role='menuitem']", AI = false)
	public WebElement btnPolicyReview;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Job_RiskAnalysisScreen-OOSEPanelSet-OOSEPeriodSelector", AI = false)
	public WebElement btnOOSEPeriodSelector;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Job_RiskAnalysisScreen-RiskAnalysisCV-SearchAndResetInputSet-SearchLinksInputSet-Reset", AI = false)
	public WebElement btnReset;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-11-item>div[role='menuitem']", AI = false)
	public WebElement btnManuallyrateandquotepolicy;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-PADrivers>div[role='menuitem']", AI = false)
	public WebElement btnDrivers;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Job_RiskAnalysisScreen-RiskAnalysisCV-RiskEvaluationPanelSet-History>div[role='button']", AI = false)
	public WebElement btnHistory;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Change>div[role='menuitem']", AI = false)
	public WebElement btnEdit;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Job_RiskAnalysisScreen-JobWizardToolbarButtonSet-CloseOptions-WithdrawJob>div[role='menuitem']", AI = false)
	public WebElement btnWithdrawTransaction;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-PolicyInfo>div[role='menuitem']", AI = false)
	public WebElement btnPolicyInfo;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Job_RiskAnalysisScreen-RiskAnalysisCV-MotorVehicleRecordTab", AI = false)
	public WebElement btnMotorVehicleRecords;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Job_RiskAnalysisScreen-JobWizardToolbarButtonSet-Versions>div[role='button']", AI = false)
	public WebElement btnVersions;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_ToAccountFile>div[role='menuitem']", AI = false)
	public WebElement btnAccountFile;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-Job_RiskAnalysisScreen-RiskAnalysisCV-ClaimDetailsCV-ClaimDetailsDV-LossDate']", AI = false)
	public WebElement inpLossDate;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Job_RiskAnalysisScreen-RiskAnalysisCV-PriorHistoryDV-PriorPolicyLV_tb-Remove>div[role='button']", AI = false)
	public WebElement btnRemove;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Job_RiskAnalysisScreen-RiskAnalysisCV-SearchAndResetInputSet-SearchLinksInputSet-Search", AI = false)
	public WebElement btnSearch_1;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Change-WizardMenuActions_CopyPolicyData>div[role='menuitem']", AI = false)
	public WebElement btnCopyData;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-Job_RiskAnalysisScreen-RiskAnalysisCV-ClaimsLV-policyPeriodFilter']", AI = false)
	public WebElement drpPolicyPeriod;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Job_RiskAnalysisScreen-QuoteRequestedAlert-CloseBtn", AI = false)
	public WebElement btnClose;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-14-item>div[role='menuitem']", AI = false)
	public WebElement btnReview60dayUWPeriod;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-Job_RiskAnalysisScreen-RiskAnalysisCV-DateRangeForClaimSearch-DateRangeForClaimSearchRangeValue']", AI = false)
	public WebElement drpSince;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Job_RiskAnalysisScreen-JobWizardToolbarButtonSet-EditPolicy>div[role='button']", AI = false)
	public WebElement btnEditPolicyTransaction;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity>div[role='menuitem']", AI = false)
	public WebElement btnNewActivity;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Job_RiskAnalysisScreen-RiskAnalysisCV_tb-MultiLocationRiskEval>div[role='button']", AI = false)
	public WebElement btnUpdateRiskEvaluations;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Job_RiskAnalysisScreen-RiskAnalysisCV_tb-RequestApproval>div[role='button']", AI = false)
	public WebElement btnRequestApproval;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Cancel>div[role='button']", AI = false)
	public WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup>div[role='menuitem']", AI = false)
	public WebElement btnPolicyContract;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Job_RiskAnalysisScreen-RiskAnalysisCV-ClaimDetailsCV-ClaimDetailsDV-PaidToDate", AI = false)
	public WebElement lblPaidtoDate;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category>div[role='menuitem']", AI = false)
	public WebElement btnRequest;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Job_RiskAnalysisScreen-RiskAnalysisCV-EvaluationIssuesCardTab", AI = false)
	public WebElement btnUWIssues;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-9-item>div[role='menuitem']", AI = false)
	public WebElement btnGetRiskInformationProducer;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Job_RiskAnalysisScreen-RiskEvaluationInProgressAlert-CloseBtn", AI = false)
	public WebElement btnClose_1;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Job_RiskAnalysisScreen-RiskAnalysisCV-ClaimDetailsCV-ClaimDetailsDV_tb-viewInCC>div[role='button']", AI = false)
	public WebElement btnViewClaiminClaimSystem;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-1-item>div[role='menuitem']", AI = false)
	public WebElement btnGetAuditInternalPersonnel;

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

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Job_RiskAnalysisScreen-RiskAnalysisCV-ClaimDetailsCV-ClaimDetailsDV-TotalIncurred", AI = false)
	public WebElement lblTotalIncurred;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-History>div[role='menuitem']", AI = false)
	public WebElement btnHistory_1;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Job_RiskAnalysisScreen-JobWizardToolbarButtonSet-Draft>div[role='button']", AI = false)
	public WebElement btnSaveDraft;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-3-item>div[role='menuitem']", AI = false)
	public WebElement btnGetBureauData;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Reinsurance>div[role='menuitem']", AI = false)
	public WebElement btnReinsurance;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-Job_RiskAnalysisScreen-RiskAnalysisCV-ClaimDetailsCV-ClaimDetailsDV-PolicyPeriodEnd']", AI = false)
	public WebElement inpPolicyPeriodEnd;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Job_RiskAnalysisScreen-QuoteRequestedAlert .gw-AlertBar--label", AI = false)
	public WebElement lblQuoteRequestedAlert;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewDocument-NewJobDocumentMenuItemSet-PolicyPeriodNewDocumentMenuItemSet_Template>div[role='menuitem']", AI = false)
	public WebElement btnCreatefromatemplate;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Job_RiskAnalysisScreen-JobWizardToolbarButtonSet-Versions-SideBySide>div[role='menuitem']", AI = false)
	public WebElement btnStartSidebySide;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Job_RiskAnalysisScreen-RiskAnalysisCV-ClaimDetailsCV-ClaimDetailsDV-Reserves", AI = false)
	public WebElement lblRemainingReserves;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Archiving>div[role='menuitem']", AI = false)
	public WebElement btnArchiving;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Job_RiskAnalysisScreen-JobWizardToolbarButtonSet-CloseOptions-NotTakenJob>div[role='menuitem']", AI = false)
	public WebElement btnNotTaken;

	@IFindBy(how = How.CSS, using = "input[name$='PolicyNumber']", AI = false)
	public WebElement inpPolicyNumber;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Documents>div[role='menuitem']", AI = false)
	public WebElement btnDocuments;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Job_RiskAnalysisScreen-JobWizardToolbarButtonSet-QuoteTypeToolbarButtonSet-Quote>div[role='button']", AI = false)
	public WebElement btnQuote;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-PersonalVehicles>div[role='menuitem']", AI = false)
	public WebElement btnVehicles;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Job_RiskAnalysisScreen-JobWizardToolbarButtonSet-Unlock>div[role='button']", AI = false)
	public WebElement btnReleaseLock;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-0-item>div[role='menuitem']", AI = false)
	public WebElement btnCreateNewProducer;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Job_RiskAnalysisScreen-RiskAnalysisCV-PriorHistoryDV-PriorPolicyLV_tb-Add>div[role='button']", AI = false)
	public WebElement btnAdd;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Job_RiskAnalysisScreen-RiskAnalysisCV-ClaimDetailsCV-DetailsTitleCardTab", AI = false)
	public WebElement btnClaimDetails;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Job_RiskAnalysisScreen-RiskAnalysisCV_tb-LockForReview>div[role='button']", AI = false)
	public WebElement btnLockforReview;

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

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-Job_RiskAnalysisScreen-RiskAnalysisCV-ClaimDetailsCV-ClaimDetailsDV-Description']", AI = false)
	public WebElement inpDescription;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-Job_RiskAnalysisScreen-RiskAnalysisCV-PolicyNumberPicker']", AI = false)
	public WebElement inpSearchByRelatedPolicy;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-10-item>div[role='menuitem']", AI = false)
	public WebElement btnLegalreview;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-7-item>div[role='menuitem']", AI = false)
	public WebElement btnPolicynotification;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto>div[role='menuitem']", AI = false)
	public WebElement btnGoto;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-4-NewActivityMenuItemSet_Category>div[role='menuitem']", AI = false)
	public WebElement btnUnderwriterReview;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-0-item>div[role='menuitem']", AI = false)
	public WebElement btn30daydiary;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Job_RiskAnalysisScreen-RiskAnalysisCV-PolicyNumberPicker-SelectPolicyNumberPicker", AI = false)
	public WebElement btnSearch;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-SideBySide>div[role='menuitem']", AI = false)
	public WebElement btnSidebySideQuoting;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-CollectCreditCard>div[role='menuitem']", AI = false)
	public WebElement btnCollectCreditCard;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-11-item>div[role='menuitem']", AI = false)
	public WebElement btnRatiooutofrange;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Job_RiskAnalysisScreen-JobWizardToolbarButtonSet-ConvertToFullApp>div[role='button']", AI = false)
	public WebElement btnFullApp;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-Job_RiskAnalysisScreen-RiskAnalysisCV-LossHistoryTypeSelectDV-LossHistoryType']", AI = false)
	public WebElement drpLosshistorytype;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-DiagWorksheetItem>div[role='menuitem']", AI = false)
	public WebElement btnDiagnosticData;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category>div[role='menuitem']", AI = false)
	public WebElement btnReminder;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Job_RiskAnalysisScreen-RiskAnalysisCV-RiskEvaluationPanelSet-Reject>div[role='button']", AI = false)
	public WebElement btnReject;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Job_RiskAnalysisScreen-RiskEvaluationInProgressAlert .gw-AlertBar--label", AI = false)
	public WebElement lblRiskEvaluationInProgressAlert;

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

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-Job_RiskAnalysisScreen-RiskAnalysisCV-ClaimDetailsCV-ClaimDetailsDV-LossCause']", AI = false)
	public WebElement inpLossCause;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Job_RiskAnalysisScreen-JobWizardToolbarButtonSet-CloseOptions>div[role='button']", AI = false)
	public WebElement btnCloseOptions;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_ToPolicyFile>div[role='menuitem']", AI = false)
	public WebElement btnPolicyFile;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-17-item>div[role='menuitem']", AI = false)
	public WebElement btnVerifycoverage;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-4-item>div[role='menuitem']", AI = false)
	public WebElement btnGetCreditReports;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Job_RiskAnalysisScreen-JobWizardToolbarButtonSet-CloseOptions-Decline>div[role='menuitem']", AI = false)
	public WebElement btnDecline;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardActionsMenuItemSet-SubmissionInfo>div[role='menuitem']", AI = false)
	public WebElement btnSubManager;

	@IFindBy(how = How.CSS, using = "div[id$='MotorVehicleRecordTab'] div[data-gw-click$='MotorVehicleRecordTab']", AI = false)
	public WebElement tabMotorVehicleRecord;

	@IFindBy(how = How.CSS, using = "div[id$='MVRReportButton_Input'] div[id$='MVRReportButton']", AI = false)
	public WebElement btnMVRReportDetails;

	@IFindBy(how = How.CSS, using = "div[id$='DetailsButton']", AI = false)
	public WebElement btnDetails;

	@IFindBy(how = How.CSS, using = "div[id$='UWIssueRowSet-Reopen']", AI = false)
	public WebElement btnReopen;

	@IFindBy(how = How.CSS, using = "div[id$='ContingencyTitle_button']", AI = false)
	public WebElement lnkContingencyTitle;

	@IFindBy(how = How.CSS, using ="div[id*='QuoteTypeToolbarButtonSet']", AI = false)
	public WebElement btnRate;

	@IFindBy(how = How.CSS, using ="input[name$='Carrier']", AI = false)
	public WebElement inpCarrier;

	@IFindBy(how = How.CSS, using ="input[name$='PolicyNumber']", AI = false)
	public WebElement inpPriorPolicyNumber;

	@IFindBy(how = How.CSS, using ="input[name$='EffectiveDate']", AI = false)
	public WebElement inpEffectiveDate;

	@IFindBy(how = How.CSS, using ="input[name$='ExpirationDate']", AI = false)
	public WebElement inpExpirationDate;

	@IFindBy(how = How.CSS, using ="input[name$='AnnualPremium']", AI = false)
	public WebElement inpAnnualPremium;

	@IFindBy(how = How.CSS, using ="input[name$='NumLosses']", AI = false)
	public WebElement inpLosses;

	@IFindBy(how = How.CSS, using ="input[name$='TotalLosses']", AI = false)
	public WebElement inpTotalLosses;

	@IFindBy(how = How.CSS, using ="div[id$='Add']", AI = false)
	public WebElement btnAddPriorPolicies;

	@IFindBy(how = How.CSS, using = "div[id='ContingencyPopup-BaseContingencyInfoDV-Resolve']", AI = false)
	public WebElement btnResolve;

	@IFindBy(how = How.XPATH, using = "//div[text()='UW Issues']", AI = false)
	public WebElement lnkUWIssues;

	public RiskAnalysisPage() {}

	public RiskAnalysisPage(WebDriver driver){
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, Utils.maxElementWait);
		PageFactory.initElements(finder, this);
		elementLayer = new ElementLayer(driver);
	}
	
	public RiskAnalysisPage(WebDriver driver, int timeout){
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

	public RiskAnalysisPage clickRate(WebDriver driver)  {
		BrowserActions.click(driver, btnRate,1.5,"Rate");
		return this;
	}

	public RiskAnalysisPage enterCarrier(WebDriver driver,String carrier) {
		BrowserActions.type(driver, inpCarrier,carrier, "Carrier");
		return this;
	}
	public RiskAnalysisPage enterPriorPolicyNumber(WebDriver driver,String priorPolicyNumber) {
		BrowserActions.type(driver, inpPriorPolicyNumber,priorPolicyNumber, "PriorPolicyNumber");
		return this;
	}
	public RiskAnalysisPage clickWorkplan(WebDriver driver)  {
		BrowserActions.click(driver, btnWorkplan,"Workplan");
		return this;
	}
	public RiskAnalysisPage clickAddContingency(WebDriver driver)  {
		BrowserActions.click(driver, btnAddContingency,"AddContingency");
		return this;
	}
	public RiskAnalysisPage enterStatus(WebDriver driver,String Status) {
		BrowserActions.type(driver, inpStatus,Status, "Status");
		return this;
	}
	public RiskAnalysisPage clickCopySubmission(WebDriver driver)  {
		BrowserActions.click(driver, btnCopySubmission,"CopySubmission");
		return this;
	}
	public RiskAnalysisPage clickGeneralreminderdiary(WebDriver driver)  {
		BrowserActions.click(driver, btnGeneralreminderdiary,"Generalreminderdiary");
		return this;
	}
	public RiskAnalysisPage clickGetReinsuranceQuote(WebDriver driver)  {
		BrowserActions.click(driver, btnGetReinsuranceQuote,"GetReinsuranceQuote");
		return this;
	}
	public RiskAnalysisPage clickReview45dayUWPeriod(WebDriver driver)  {
		BrowserActions.click(driver, btnReview45dayUWPeriod,"Review45dayUWPeriod");
		return this;
	}
	public RiskAnalysisPage clickPriorPolicies(WebDriver driver)  {
		BrowserActions.click(driver, btnPriorPolicies,"PriorPolicies");
		return this;
	}
	public RiskAnalysisPage clickBindOnly(WebDriver driver)  {
		BrowserActions.click(driver, btnBindOnly,"BindOnly");
		return this;
	}
	public RiskAnalysisPage clickSG01838332082908930690(WebDriver driver)  {
		BrowserActions.click(driver, btnSG01838332082908930690,"SG01838332082908930690");
		return this;
	}
	public RiskAnalysisPage clickInterview(WebDriver driver)  {
		BrowserActions.click(driver, btnInterview,"Interview");
		return this;
	}
	public RiskAnalysisPage clickPerformanceReview(WebDriver driver)  {
		BrowserActions.click(driver, btnPerformanceReview,"PerformanceReview");
		return this;
	}
	public RiskAnalysisPage clickStartMultiVersion(WebDriver driver)  {
		BrowserActions.click(driver, btnStartMultiVersion,"StartMultiVersion");
		return this;
	}
	public RiskAnalysisPage clickReviewProducer(WebDriver driver)  {
		BrowserActions.click(driver, btnReviewProducer,"ReviewProducer");
		return this;
	}
	public RiskAnalysisPage clickRiskAnalysis_1(WebDriver driver)  {
		BrowserActions.click(driver, btnRiskAnalysis_1,"RiskAnalysis_1");
		return this;
	}
	public RiskAnalysisPage clickPolicyReviewMidterm(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyReviewMidterm,"PolicyReviewMidterm");
		return this;
	}
	public RiskAnalysisPage clickViewSideBySideVersions(WebDriver driver)  {
		BrowserActions.click(driver, btnViewSideBySideVersions,"ViewSideBySideVersions");
		return this;
	}
	public RiskAnalysisPage clickPA0183833208(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0183833208,"PA0183833208");
		return this;
	}
	public RiskAnalysisPage enterTo(WebDriver driver,String To) {
		BrowserActions.type(driver, inpTo,To, "To");
		return this;
	}
	public RiskAnalysisPage clickPayment(WebDriver driver)  {
		BrowserActions.click(driver, btnPayment,"Payment");
		return this;
	}
	public RiskAnalysisPage clickLitigation(WebDriver driver)  {
		BrowserActions.click(driver, rdbLitigation,"Litigation");
		return this;
	}
	public RiskAnalysisPage clickEffectiveDate(WebDriver driver)  {
		BrowserActions.click(driver, btnEffectiveDate,"EffectiveDate");
		return this;
	}
	public RiskAnalysisPage clickContingencies(WebDriver driver)  {
		BrowserActions.click(driver, btnContingencies,true,"Contingencies");
		return this;
	}
	public RiskAnalysisPage clickResolve(WebDriver driver)  {
		BrowserActions.click(driver, btnResolve,"Resolve");
		return this;
	}
	public RiskAnalysisPage enterProduct(WebDriver driver,String Product) {
		BrowserActions.type(driver, inpProduct,Product, "Product");
		return this;
	}
	public RiskAnalysisPage enterClaimType(WebDriver driver,String ClaimType) {
		BrowserActions.type(driver, inpClaimType,ClaimType, "ClaimType");
		return this;
	}
	public RiskAnalysisPage enterFrom(WebDriver driver,String From) {
		BrowserActions.type(driver, inpFrom,From, "From");
		return this;
	}
	public RiskAnalysisPage enterClaimNumber(WebDriver driver,String ClaimNumber) {
		BrowserActions.type(driver, inpClaimNumber,ClaimNumber, "ClaimNumber");
		return this;
	}
	public RiskAnalysisPage clickNextBlockedDate(WebDriver driver)  {
		BrowserActions.click(driver, btnNextBlockedDate,"NextBlockedDate");
		return this;
	}
	public RiskAnalysisPage click90daydiary(WebDriver driver)  {
		BrowserActions.click(driver, btn90daydiary,"90daydiary");
		return this;
	}
	public RiskAnalysisPage clickBindOptions(WebDriver driver)  {
		BrowserActions.click(driver, btnBindOptions,"BindOptions");
		return this;
	}
	public RiskAnalysisPage clickEnableDisable(WebDriver driver)  {
		BrowserActions.click(driver, btnEnableDisable,"EnableDisable");
		return this;
	}
	public RiskAnalysisPage clickIssuePolicy(WebDriver driver)  {
		BrowserActions.click(driver, btnIssuePolicy,"IssuePolicy");
		return this;
	}
	public RiskAnalysisPage clickAddUWIssue(WebDriver driver)  {
		BrowserActions.click(driver, btnAddUWIssue,"AddUWIssue");
		return this;
	}
	public RiskAnalysisPage clickPolicyPeriodSelector(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyPeriodSelector,"PolicyPeriodSelector");
		return this;
	}
	public RiskAnalysisPage clickPriorLosses(WebDriver driver)  {
		BrowserActions.click(driver, btnPriorLosses,"PriorLosses");
		return this;
	}
	public RiskAnalysisPage clickNewmail(WebDriver driver)  {
		BrowserActions.click(driver, btnNewmail,"Newmail");
		return this;
	}
	public RiskAnalysisPage clickGetMotorVehicleReports(WebDriver driver)  {
		BrowserActions.click(driver, btnGetMotorVehicleReports,"GetMotorVehicleReports");
		return this;
	}
	public RiskAnalysisPage clickQualification(WebDriver driver)  {
		BrowserActions.click(driver, btnQualification,"Qualification");
		return this;
	}
	public RiskAnalysisPage clickInjuries(WebDriver driver)  {
		BrowserActions.click(driver, rdbInjuries,"Injuries");
		return this;
	}
	public RiskAnalysisPage clickApprove(WebDriver driver)  {
		BrowserActions.click(driver, btnApprove,"Approve");
		return this;
	}
	public RiskAnalysisPage clickParticipants(WebDriver driver)  {
		BrowserActions.click(driver, btnParticipants,"Participants");
		return this;
	}
	public RiskAnalysisPage clickPACoverages(WebDriver driver)  {
		BrowserActions.click(driver, btnPACoverages,"PACoverages");
		return this;
	}
	public RiskAnalysisPage clickReviewandapprove(WebDriver driver)  {
		BrowserActions.click(driver, btnReviewandapprove,"Reviewandapprove");
		return this;
	}
	public RiskAnalysisPage selectEffectiveDate(WebDriver driver,String EffectiveDate)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpEffectiveDate,EffectiveDate,"EffectiveDate");
		return this;
	}
	public RiskAnalysisPage enterPolicyPeriodStart(WebDriver driver,String PolicyPeriodStart) {
		BrowserActions.type(driver, inpPolicyPeriodStart,PolicyPeriodStart, "PolicyPeriodStart");
		return this;
	}
	public RiskAnalysisPage clickNewDocument(WebDriver driver)  {
		BrowserActions.click(driver, btnNewDocument,"NewDocument");
		return this;
	}
	public RiskAnalysisPage clickUploaddocuments(WebDriver driver)  {
		BrowserActions.click(driver, btnUploaddocuments,"Uploaddocuments");
		return this;
	}
	public RiskAnalysisPage clickFinish(WebDriver driver)  {
		BrowserActions.click(driver, btnFinish,"Finish");
		return this;
	}
	public RiskAnalysisPage clickProductDefinition(WebDriver driver)  {
		BrowserActions.click(driver, btnProductDefinition,"ProductDefinition");
		return this;
	}
	public RiskAnalysisPage clickGetInspectionOutsideService(WebDriver driver)  {
		BrowserActions.click(driver, btnGetInspectionOutsideService,"GetInspectionOutsideService");
		return this;
	}
	public RiskAnalysisPage clickReopen(WebDriver driver)  {
		BrowserActions.click(driver, btnReopen,2,"Reopen");
		return this;
	}
	public RiskAnalysisPage selectViewIssuesBlocking(WebDriver driver,String ViewIssuesBlocking)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpViewIssuesBlocking,ViewIssuesBlocking,"ViewIssuesBlocking");
		return this;
	}
	public RiskAnalysisPage clickMeetwithInsured(WebDriver driver)  {
		BrowserActions.click(driver, btnMeetwithInsured,"MeetwithInsured");
		return this;
	}
	public RiskAnalysisPage clickOfferings(WebDriver driver)  {
		BrowserActions.click(driver, btnOfferings,"Offerings");
		return this;
	}
	public RiskAnalysisPage clickPolicyReviewRenewal(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyReviewRenewal,"PolicyReviewRenewal");
		return this;
	}
	public RiskAnalysisPage clickNewNote(WebDriver driver)  {
		BrowserActions.click(driver, btnNewNote,"NewNote");
		return this;
	}
	public RiskAnalysisPage clickRiskAnalysis(WebDriver driver)  {
		BrowserActions.click(driver, btnRiskAnalysis,"RiskAnalysis");
		return this;
	}
	public RiskAnalysisPage clickMeetwithProducerAgency(WebDriver driver)  {
		BrowserActions.click(driver, btnMeetwithProducerAgency,"MeetwithProducerAgency");
		return this;
	}
	public RiskAnalysisPage clickClaims(WebDriver driver)  {
		BrowserActions.click(driver, btnClaims,"Claims");
		return this;
	}
	public RiskAnalysisPage clickPolicyReview(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyReview,"PolicyReview");
		return this;
	}
	public RiskAnalysisPage clickOOSEPeriodSelector(WebDriver driver)  {
		BrowserActions.click(driver, btnOOSEPeriodSelector,"OOSEPeriodSelector");
		return this;
	}
	public RiskAnalysisPage clickReset(WebDriver driver)  {
		BrowserActions.click(driver, btnReset,"Reset");
		return this;
	}
	public RiskAnalysisPage clickManuallyrateandquotepolicy(WebDriver driver)  {
		BrowserActions.click(driver, btnManuallyrateandquotepolicy,"Manuallyrateandquotepolicy");
		return this;
	}
	public RiskAnalysisPage clickDrivers(WebDriver driver)  {
		BrowserActions.click(driver, btnDrivers,"Drivers");
		return this;
	}
	public RiskAnalysisPage clickHistory(WebDriver driver)  {
		BrowserActions.click(driver, btnHistory,"History");
		return this;
	}
	public RiskAnalysisPage clickEdit(WebDriver driver)  {
		BrowserActions.click(driver, btnEdit,"Edit");
		return this;
	}
	public RiskAnalysisPage clickWithdrawTransaction(WebDriver driver)  {
		BrowserActions.click(driver, btnWithdrawTransaction,"WithdrawTransaction");
		return this;
	}
	public RiskAnalysisPage clickPolicyInfo(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyInfo,"PolicyInfo");
		return this;
	}
	public RiskAnalysisPage clickMotorVehicleRecords(WebDriver driver)  {
		BrowserActions.click(driver, btnMotorVehicleRecords,"MotorVehicleRecords");
		return this;
	}
	public RiskAnalysisPage clickVersions(WebDriver driver)  {
		BrowserActions.click(driver, btnVersions,"Versions");
		return this;
	}
	public RiskAnalysisPage clickAccountFile(WebDriver driver)  {
		BrowserActions.click(driver, btnAccountFile,"AccountFile");
		return this;
	}
	public RiskAnalysisPage enterLossDate(WebDriver driver,String LossDate) {
		BrowserActions.type(driver, inpLossDate,LossDate, "LossDate");
		return this;
	}
	public RiskAnalysisPage clickRemove(WebDriver driver)  {
		BrowserActions.click(driver, btnRemove,"Remove");
		return this;
	}
	public RiskAnalysisPage clickSearch_1(WebDriver driver)  {
		BrowserActions.click(driver, btnSearch_1,"Search_1");
		return this;
	}
	public RiskAnalysisPage clickCopyData(WebDriver driver)  {
		BrowserActions.click(driver, btnCopyData,"CopyData");
		return this;
	}
	public RiskAnalysisPage selectPolicyPeriod(WebDriver driver,String PolicyPeriod)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPolicyPeriod,PolicyPeriod,"PolicyPeriod");
		return this;
	}
	public RiskAnalysisPage clickClose(WebDriver driver)  {
		BrowserActions.click(driver, btnClose,"Close");
		return this;
	}
	public RiskAnalysisPage clickReview60dayUWPeriod(WebDriver driver)  {
		BrowserActions.click(driver, btnReview60dayUWPeriod,"Review60dayUWPeriod");
		return this;
	}
	public RiskAnalysisPage selectSince(WebDriver driver,String Since)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpSince,Since,"Since");
		return this;
	}
	public RiskAnalysisPage clickEditPolicyTransaction(WebDriver driver)  {
		BrowserActions.click(driver, btnEditPolicyTransaction,"EditPolicyTransaction");
		return this;
	}
	public RiskAnalysisPage clickNewActivity(WebDriver driver)  {
		BrowserActions.click(driver, btnNewActivity,"NewActivity");
		return this;
	}
	public RiskAnalysisPage clickUpdateRiskEvaluations(WebDriver driver)  {
		BrowserActions.click(driver, btnUpdateRiskEvaluations,"UpdateRiskEvaluations");
		return this;
	}
	public RiskAnalysisPage clickRequestApproval(WebDriver driver)  {
		BrowserActions.click(driver, btnRequestApproval,"RequestApproval");
		return this;
	}
	public RiskAnalysisPage clickCancel(WebDriver driver)  {
		BrowserActions.click(driver, btnCancel,"Cancel");
		return this;
	}
	public RiskAnalysisPage clickPolicyContract(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyContract,"PolicyContract");
		return this;
	}
	public RiskAnalysisPage clickRequest(WebDriver driver)  {
		BrowserActions.click(driver, btnRequest,"Request");
		return this;
	}
	public RiskAnalysisPage clickUWIssues(WebDriver driver)  {
		BrowserActions.click(driver, btnUWIssues,"UWIssues");
		return this;
	}
	public RiskAnalysisPage clickGetRiskInformationProducer(WebDriver driver)  {
		BrowserActions.click(driver, btnGetRiskInformationProducer,"GetRiskInformationProducer");
		return this;
	}
	public RiskAnalysisPage clickClose_1(WebDriver driver)  {
		BrowserActions.click(driver, btnClose_1,"Close_1");
		return this;
	}
	public RiskAnalysisPage clickViewClaiminClaimSystem(WebDriver driver)  {
		BrowserActions.click(driver, btnViewClaiminClaimSystem,"ViewClaiminClaimSystem");
		return this;
	}
	public RiskAnalysisPage clickGetAuditInternalPersonnel(WebDriver driver)  {
		BrowserActions.click(driver, btnGetAuditInternalPersonnel,"GetAuditInternalPersonnel");
		return this;
	}
	public RiskAnalysisPage selectPolicyPeriodSelector_Arg(WebDriver driver,String PolicyPeriodSelector_Arg)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPolicyPeriodSelector_Arg,PolicyPeriodSelector_Arg,"PolicyPeriodSelector_Arg");
		return this;
	}
	public RiskAnalysisPage clickShowPartialWorksheet(WebDriver driver)  {
		BrowserActions.click(driver, btnShowPartialWorksheet,"ShowPartialWorksheet");
		return this;
	}
	public RiskAnalysisPage click60daydiary(WebDriver driver)  {
		BrowserActions.click(driver, btn60daydiary,"60daydiary");
		return this;
	}
	public RiskAnalysisPage clickBack(WebDriver driver)  {
		BrowserActions.click(driver, btnBack,"Back");
		return this;
	}
	public RiskAnalysisPage clickPolicyVersions_1(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyVersions_1,"PolicyVersions_1");
		return this;
	}
	public RiskAnalysisPage clickNext(WebDriver driver)  {
		BrowserActions.click(driver, btnNext,"Next");
		return this;
	}
	public RiskAnalysisPage clickQuoteRequired(WebDriver driver)  {
		BrowserActions.click(driver, btnQuoteRequired,"QuoteRequired");
		return this;
	}
	public RiskAnalysisPage clickHistory_1(WebDriver driver)  {
		BrowserActions.click(driver, btnHistory_1,"History_1");
		return this;
	}
	public RiskAnalysisPage clickSaveDraft(WebDriver driver)  {
		BrowserActions.click(driver, btnSaveDraft,"SaveDraft");
		return this;
	}
	public RiskAnalysisPage clickGetBureauData(WebDriver driver)  {
		BrowserActions.click(driver, btnGetBureauData,"GetBureauData");
		return this;
	}
	public RiskAnalysisPage clickReinsurance(WebDriver driver)  {
		BrowserActions.click(driver, btnReinsurance,"Reinsurance");
		return this;
	}
	public RiskAnalysisPage enterPolicyPeriodEnd(WebDriver driver,String PolicyPeriodEnd) {
		BrowserActions.type(driver, inpPolicyPeriodEnd,PolicyPeriodEnd, "PolicyPeriodEnd");
		return this;
	}
	public RiskAnalysisPage clickCreatefromatemplate(WebDriver driver)  {
		BrowserActions.click(driver, btnCreatefromatemplate,"Createfromatemplate");
		return this;
	}
	public RiskAnalysisPage clickStartSidebySide(WebDriver driver)  {
		BrowserActions.click(driver, btnStartSidebySide,"StartSidebySide");
		return this;
	}
	public RiskAnalysisPage clickArchiving(WebDriver driver)  {
		BrowserActions.click(driver, btnArchiving,"Archiving");
		return this;
	}
	public RiskAnalysisPage clickNotTaken(WebDriver driver)  {
		BrowserActions.click(driver, btnNotTaken,"NotTaken");
		return this;
	}
	public RiskAnalysisPage enterPolicyNumber(WebDriver driver,String PolicyNumber) {
		BrowserActions.type(driver, inpPolicyNumber,PolicyNumber,"PolicyNumber");
		return this;
	}
	public RiskAnalysisPage clickDocuments(WebDriver driver)  {
		BrowserActions.click(driver, btnDocuments,"Documents");
		return this;
	}
	public RiskAnalysisPage clickQuote(WebDriver driver)  {
		BrowserActions.click(driver, btnQuote,"Quote");
		return this;
	}
	public RiskAnalysisPage clickVehicles(WebDriver driver)  {
		BrowserActions.click(driver, btnVehicles,"Vehicles");
		return this;
	}
	public RiskAnalysisPage clickReleaseLock(WebDriver driver)  {
		BrowserActions.click(driver, btnReleaseLock,"ReleaseLock");
		return this;
	}
	public RiskAnalysisPage clickCreateNewProducer(WebDriver driver)  {
		BrowserActions.click(driver, btnCreateNewProducer,"CreateNewProducer");
		return this;
	}
	public RiskAnalysisPage clickAdd(WebDriver driver)  {
		BrowserActions.click(driver, btnAdd,"Add");
		return this;
	}
	public RiskAnalysisPage clickClaimDetails(WebDriver driver)  {
		BrowserActions.click(driver, btnClaimDetails,"ClaimDetails");
		return this;
	}
	public RiskAnalysisPage clickLockforReview(WebDriver driver)  {
		BrowserActions.click(driver, btnLockforReview,"LockforReview");
		return this;
	}
	public RiskAnalysisPage clickForms(WebDriver driver)  {
		BrowserActions.click(driver, btnForms,"Forms");
		return this;
	}
	public RiskAnalysisPage clickNotes(WebDriver driver)  {
		BrowserActions.click(driver, btnNotes,"Notes");
		return this;
	}
	public RiskAnalysisPage clickQuote_1(WebDriver driver)  {
		BrowserActions.click(driver, btnQuote_1,"Quote_1");
		return this;
	}
	public RiskAnalysisPage clickGetInspectionLossControl(WebDriver driver)  {
		BrowserActions.click(driver, btnGetInspectionLossControl,"GetInspectionLossControl");
		return this;
	}
	public RiskAnalysisPage clickCreate(WebDriver driver)  {
		BrowserActions.click(driver, btnCreate,"Create");
		return this;
	}
	public RiskAnalysisPage enterDescription(WebDriver driver,String Description) {
		BrowserActions.type(driver, inpDescription,Description, "Description");
		return this;
	}
	public RiskAnalysisPage enterSearchByRelatedPolicy(WebDriver driver,String SearchByRelatedPolicy) {
		BrowserActions.type(driver, inpSearchByRelatedPolicy,SearchByRelatedPolicy, "SearchByRelatedPolicy");
		return this;
	}
	public RiskAnalysisPage clickLegalreview(WebDriver driver)  {
		BrowserActions.click(driver, btnLegalreview,"Legalreview");
		return this;
	}
	public RiskAnalysisPage clickPolicynotification(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicynotification,"Policynotification");
		return this;
	}
	public RiskAnalysisPage clickGoto(WebDriver driver)  {
		BrowserActions.click(driver, btnGoto,"Goto");
		return this;
	}
	public RiskAnalysisPage clickUnderwriterReview(WebDriver driver)  {
		BrowserActions.click(driver, btnUnderwriterReview,"UnderwriterReview");
		return this;
	}
	public RiskAnalysisPage click30daydiary(WebDriver driver)  {
		BrowserActions.click(driver, btn30daydiary,"30daydiary");
		return this;
	}
	public RiskAnalysisPage clickSearch(WebDriver driver)  {
		BrowserActions.click(driver, btnSearch,"Search");
		return this;
	}
	public RiskAnalysisPage clickSidebySideQuoting(WebDriver driver)  {
		BrowserActions.click(driver, btnSidebySideQuoting,"SidebySideQuoting");
		return this;
	}
	public RiskAnalysisPage clickCollectCreditCard(WebDriver driver)  {
		BrowserActions.click(driver, btnCollectCreditCard,"CollectCreditCard");
		return this;
	}
	public RiskAnalysisPage clickRatiooutofrange(WebDriver driver)  {
		BrowserActions.click(driver, btnRatiooutofrange,"Ratiooutofrange");
		return this;
	}
	public RiskAnalysisPage clickFullApp(WebDriver driver)  {
		BrowserActions.click(driver, btnFullApp,"FullApp");
		return this;
	}
	public RiskAnalysisPage selectLosshistorytype(WebDriver driver,String Losshistorytype)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpLosshistorytype,Losshistorytype,"Losshistorytype");
		return this;
	}
	public RiskAnalysisPage clickDiagnosticData(WebDriver driver)  {
		BrowserActions.click(driver, btnDiagnosticData,"DiagnosticData");
		return this;
	}
	public RiskAnalysisPage clickReminder(WebDriver driver)  {
		BrowserActions.click(driver, btnReminder,"Reminder");
		return this;
	}
	public RiskAnalysisPage clickReject(WebDriver driver)  {
		BrowserActions.click(driver, btnReject,"Reject");
		return this;
	}
	public RiskAnalysisPage clickReviewnewmail(WebDriver driver)  {
		BrowserActions.click(driver, btnReviewnewmail,"Reviewnewmail");
		return this;
	}
	public RiskAnalysisPage clickGroup(WebDriver driver)  {
		BrowserActions.click(driver, btnGroup,"Group");
		return this;
	}
	public RiskAnalysisPage clickCancelasplitpolicy(WebDriver driver)  {
		BrowserActions.click(driver, btnCancelasplitpolicy,"Cancelasplitpolicy");
		return this;
	}
	public RiskAnalysisPage clickGetAuditOutsideService(WebDriver driver)  {
		BrowserActions.click(driver, btnGetAuditOutsideService,"GetAuditOutsideService");
		return this;
	}
	public RiskAnalysisPage clickNewAuditAssignment(WebDriver driver)  {
		BrowserActions.click(driver, btnNewAuditAssignment,"NewAuditAssignment");
		return this;
	}
	public RiskAnalysisPage clickRewritetoNewAccount(WebDriver driver)  {
		BrowserActions.click(driver, btnRewritetoNewAccount,"RewritetoNewAccount");
		return this;
	}
	public RiskAnalysisPage clickReview30dayUWPeriod(WebDriver driver)  {
		BrowserActions.click(driver, btnReview30dayUWPeriod,"Review30dayUWPeriod");
		return this;
	}
	public RiskAnalysisPage clickPolicyVersions(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyVersions,"PolicyVersions");
		return this;
	}
	public RiskAnalysisPage enterLossCause(WebDriver driver,String LossCause) {
		BrowserActions.type(driver, inpLossCause,LossCause, "LossCause");
		return this;
	}
	public RiskAnalysisPage clickCloseOptions(WebDriver driver)  {
		BrowserActions.click(driver, btnCloseOptions,"CloseOptions");
		return this;
	}
	public RiskAnalysisPage clickPolicyFile(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyFile,"PolicyFile");
		return this;
	}
	public RiskAnalysisPage clickVerifycoverage(WebDriver driver)  {
		BrowserActions.click(driver, btnVerifycoverage,"Verifycoverage");
		return this;
	}
	public RiskAnalysisPage clickGetCreditReports(WebDriver driver)  {
		BrowserActions.click(driver, btnGetCreditReports,"GetCreditReports");
		return this;
	}
	public RiskAnalysisPage clickDecline(WebDriver driver)  {
		BrowserActions.click(driver, btnDecline,"Decline");
		return this;
	}
	public RiskAnalysisPage clickSubManager(WebDriver driver)  {
		BrowserActions.click(driver, btnSubManager,"SubManager");
		return this;
	}
	public RiskAnalysisPage clickMotorVehileRecord(WebDriver driver){
		BrowserActions.click(driver, tabMotorVehicleRecord,true,"MVR Tab");
		return this;
	}
	public RiskAnalysisPage clickDetails(WebDriver driver) {
		BrowserActions.click(driver, btnDetails, "Details button");
		return this;
	}

	public RiskAnalysisPage enterEffectiveDate(WebDriver driver,String effectiveDate) {
		BrowserActions.type(driver, inpEffectiveDate,effectiveDate, "EffectiveDate");
		return this;
	}

	public RiskAnalysisPage enterExpirationDate(WebDriver driver,String expirationDate) {
		BrowserActions.type(driver, inpExpirationDate,expirationDate, "ExpirationDate");
		return this;
	}

	public RiskAnalysisPage enterAnnualPremium(WebDriver driver,String annualPremium) {
		BrowserActions.type(driver, inpAnnualPremium,annualPremium, "AnnualPremium");
		return this;
	}

	public RiskAnalysisPage enterLosses(WebDriver driver,String losses) {
		BrowserActions.type(driver, inpLosses,losses, "Losses");
		return this;
	}

	public RiskAnalysisPage enterTotalLosses(WebDriver driver,String totalLosses) {
		BrowserActions.type(driver, inpTotalLosses,totalLosses, "Total Losses");
		return this;
	}

	public RiskAnalysisPage clickAddInPriorityPolicies(WebDriver driver) {
		BrowserActions.click(driver, btnAddPriorPolicies, "Add Prior Policies");
		return this;
	}

	public RiskAnalysisPage clickReportDetails(WebDriver driver){
		BrowserActions.click(driver, btnMVRReportDetails,"MVR Report Button");
		return this;
	}
	public RiskAnalysisPage clickOK(WebDriver driver) {
		BrowserActions.click(driver, btnOk,0.5, "OK button");
		return this;
	}
	
	public RiskAnalysisPage clickHandleuWIssueAlert(WebDriver driver) {
		BrowserActions.confirmAlert(driver, "Alert OK button");
		return this;
	}

	public RiskAnalysisPage clickReturnPage(WebDriver driver){
		BrowserActions.click(driver, lnkReturnPage,"Return Page link");
		return this;
	}
	public RiskAnalysisPage clickContingencyTitle(WebDriver driver) {
		BrowserActions.click(driver, lnkContingencyTitle,true, "Contingency Title");
		return this;
	}
	public RiskAnalysisPage verifyApproveButtonIsDisplay(WebDriver driver) {
		BrowserActions.verifyElementDisplayed(driver, btnApprove, "Approve Button");
		return this;
	}
	public RiskAnalysisPage verifyRejectButtonIsDisplay(WebDriver driver) {
		BrowserActions.verifyElementDisplayed(driver, btnReject, "Reject Button");
		return this;
	}
	public int getNextButtonSize(WebDriver driver){
		By nextButtonBy = By.cssSelector("div[id$='Next']");
		int size =BrowserActions.getWebElementSize(driver, nextButtonBy, "Next Button", 0.5);
		return size;
	}

	public class RiskApprovalDetailsPage extends LoadableComponent<CreateNewUWIssuePage>{

		WebDriver driver;
		private boolean isPageLoaded;
		public ElementLayer elementLayer;
		public List<Object> pageFactoryKey = new ArrayList<Object>();
		public List<String> pageFactoryValue = new ArrayList<String>();

		@IFindBy(how = How.CSS, using = "div[id$='DetailsPopup-ttlBar']", AI = false)
		public WebElement ttlRiskAnalysisDetailScreen;

		@IFindBy(how = How.CSS, using = "div[id$='Update']", AI = false)
		public WebElement btnOk;

		public RiskApprovalDetailsPage() {}

		public RiskApprovalDetailsPage(WebDriver driver){
			this.driver = driver;
			ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, Utils.minElementWait);
			PageFactory.initElements(finder, this);
			elementLayer = new ElementLayer(driver);
		}

		public RiskApprovalDetailsPage(WebDriver driver, int timeout){
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

			if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, ttlRiskAnalysisDetailScreen))) {
				Log.fail("Page did not open up. Site might be down.", driver);
			}
			elementLayer = new ElementLayer(driver);
		}// isLoaded


		/**
		 * click ok button after verifying the fields
		 * @author charu.anbarasan
		 * @param driver
		 */
		public RiskApprovalDetailsPage clickOK(WebDriver driver) {
			BrowserActions.click(driver, btnOk,1, "OK button");
			BrowserActions.confirmAlert(driver, "Confirm Alert");
			return this;
		}

	}

	public class CreateNewUWIssuePage extends LoadableComponent<CreateNewUWIssuePage>{

		WebDriver driver;
		private boolean isPageLoaded;
		public ElementLayer elementLayer;
		public List<Object> pageFactoryKey = new ArrayList<Object>();
		public List<String> pageFactoryValue = new ArrayList<String>();

		@IFindBy(how = How.CSS, using = "div[class$='gw-TitleBar--title']", AI = false)
		public WebElement ttlCreateNewUIIssue;

		@IFindBy(how = How.CSS, using = "select[name$='IssueType']", AI = false)
		public WebElement drpIssueType;

		@IFindBy(how = How.CSS, using = "input[name$='ShortDescription']", AI = false)
		public WebElement txtShortDescription;

		@IFindBy(how = How.CSS, using = "textarea[name$='LongDescription']", AI = false)
		public WebElement txtLongDescription;

		public CreateNewUWIssuePage() {}

		public CreateNewUWIssuePage(WebDriver driver){
			this.driver = driver;
			ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, Utils.maxElementWait);
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

			if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, ttlCreateNewUIIssue))) {
				Log.fail("Page did not open up. Site might be down.", driver);
			}
			elementLayer = new ElementLayer(driver);
		}// isLoaded

		/**
		 * select the Issue Type
		 * @author manikandan.manohar
		 * @param driver, issueType
		 * @return CreateNewUIIssuePage
		 */
		public CreateNewUWIssuePage selectIssueType(WebDriver driver,String issueType) {
			BrowserActions.selectDropDownByVisibleText(driver, drpIssueType, issueType,true, "Issue Type");
			return this;
		}

		/**
		 * Enter the Short Description
		 * @author manikandan.manohar
		 * @param driver,shortDescription
		 * @return CreateNewUIIssuePage
		 */
		public CreateNewUWIssuePage enterShortDescription(WebDriver driver,String shortDescription) {
			BrowserActions.type(driver, txtShortDescription, shortDescription, "Short Description");
			return this;
		}

		/**
		 * Enter the Long Description
		 * @author manikandan.manohar
		 * @param driver,longDescription
		 * @return CreateNewUIIssuePage
		 */
		public CreateNewUWIssuePage enterLongDescription(WebDriver driver,String longDescription) {
			BrowserActions.type(driver, txtLongDescription,longDescription,0.5, "Long Description");
			return this;
		}

		/**
		 * @author charu.anbarasan
		 * click ok button after verifying the fields
		 * @param driver
		 */
		public CreateNewUWIssuePage clickOK(WebDriver driver) {
			BrowserActions.click(driver, btnOk,1.5, "OK button");
			return this;
		}
	}

	public class NewContingencyPage extends LoadableComponent<NewContingencyPage>{

		WebDriver driver;
		private boolean isPageLoaded;
		public ElementLayer elementLayer;
		public List<Object> pageFactoryKey = new ArrayList<Object>();
		public List<String> pageFactoryValue = new ArrayList<String>();

		@IFindBy(how = How.CSS, using = "div[class$='gw-TitleBar--title']", AI = false)
		public WebElement ttlNewContingency;

		@IFindBy(how = How.CSS, using = "input[name$='ContingencyTitle']", AI = false)
		public WebElement txtContingencyTitle;

		@IFindBy(how = How.CSS, using = "textarea[name$='ContingencyDescription']", AI = false)
		public WebElement txtContingencyDescription;

		@IFindBy(how = How.CSS, using = "select[name$='ContingencyAction']", AI = false)
		public WebElement drpContingencyAction;

		@IFindBy(how = How.CSS, using = "input[name$='ContingencyDueDate']", AI = false)
		public WebElement txtContingencyDueDate;

		@IFindBy(how = How.CSS, using = "div[id*='AddNewContingency']", AI = false)
		public WebElement btnAddNewContigency;

		@IFindBy(how = How.CSS, using = "div[id$='Resolve']", AI = false)
		public WebElement btnContingencyResolve;

		@IFindBy(how = How.CSS, using = "div[id$='Waive']", AI = false)
		public WebElement btnContingencyWaive;

		@IFindBy(how = How.CSS, using = "div[id$='NewDocumentButton'] div", AI = false)
		public WebElement btnNewDocument;
		
		@IFindBy(how = How.CSS, using = "div[id$='ContigencyPopup_NewDocumentButton'] div[class='gw-action--expand-button gw-no-pointer']", AI = false)
		public WebElement btnNewDocumentExpand;

		@IFindBy(how = How.CSS, using = "div[id$='ContingencyNewDocumentMenuItemSet_Linked']", AI = false)
		public WebElement lnkUploadDocument;

		@IFindBy(how = How.CSS, using = "div[id$='UploadDocumentScreen-CustomUpdate']", AI = false)
		public WebElement btnUploadDocument;

		@IFindBy(how = How.CSS, using = "select[name$='DocumentMetadataEditLV-0-Status']", AI = false)
		public WebElement drpUploadDocumentStatus;

		@IFindBy(how = How.CSS, using = "select[name$='DocumentMetadataEditLV-0-Type']", AI = false)
		public WebElement drpContingencyDocumentType;

		@IFindBy(how = How.CSS, using = "input[id='NewDocumentsLinkedWorksheet-UploadDocumentScreen-FileInput--file']", AI = false)
		public WebElement addFileAfterPolicyCreationButton;

		@IFindBy(how = How.CSS, using = "div[id$='LossHistoryDocumentsLV_tb-NewDocument']", AI = false)
		public WebElement btnAttachDocument;

		@IFindBy(how = How.CSS, using = "input[id='NewLossHistoryDocumentsWorksheet-UploadDocumentScreen-FileInput--file']", AI = false)
		public WebElement addFileBeforePolicyCreationButton;

		@IFindBy(how = How.CSS, using = "input[name$='LossHistoryInputSet-NumberOfLosses']", AI = false)
		public WebElement txtLossesInPastFiveYears;

		@IFindBy(how = How.CSS, using = "input[name$='LossHistoryInputSet-TotalIncurred']", AI = false)
		public WebElement txtPriorLossTotalIncurred;

		public String documentLocation = "./src/main/resources/assessmentMedia/orrange.png";

		public NewContingencyPage() {}

		public NewContingencyPage(WebDriver driver){
			this.driver = driver;
			ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, Utils.maxElementWait);
			PageFactory.initElements(finder, this);
			elementLayer = new ElementLayer(driver);
		}

		public NewContingencyPage(WebDriver driver, int timeout){
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

			if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, ttlNewContingency))) {
				Log.fail("Page did not open up. Site might be down.", driver);
			}
			elementLayer = new ElementLayer(driver);
		}// isLoaded

		/**
		 * Used to enter Description in Contingency Description Field
		 * @author manikandan.manohar
		 * @param driver, contingency description
		 * @return NewContingencyPage
		 */
		public NewContingencyPage enterContingencyDescription(WebDriver driver , String contingencydescription){
			BrowserActions.type(driver, txtContingencyDescription,contingencydescription,"Contingency description");
			return this;
		}

		/**
		 * Used to enter Title in Contingency Title Field
		 * @author manikandan.manohar
		 * @param driver, contingency title
		 * @return NewContingencyPage
		 */
		public NewContingencyPage enterContingencyTitle(WebDriver driver , String contingencytitle){
			BrowserActions.type(driver, txtContingencyTitle,contingencytitle,true,"Contingency Title");
			return this;
		}

		/**
		 * Select the Action in Contingency Action DropDown
		 * @author manikandan.manohar
		 * @param driver, action
		 * @return NewContingencyPage
		 */
		public NewContingencyPage selectContingencyAction(WebDriver driver,String action){
			BrowserActions.selectDropDownByVisibleText(driver, drpContingencyAction, action,1.5,"Contingency Action");
			return this;
		}

		/**
		 * Enters the Due Date date 
		 * @author manikandan.manohar
		 * @param driver, noOfMonths
		 * @return NewContingencyPage
		 */
		public NewContingencyPage enterDateDueField(WebDriver driver,String noOfMonths){
			BrowserActions.type(driver, txtContingencyDueDate,noOfMonths,2, "Contingency Due Date");
			return this;
		}	

		/**
		 * @author surendar.baskaran
		 * click Return page 
		 * @param driver
		 * @return
		 */
		public NewContingencyPage clickReturnPage(WebDriver driver){
			BrowserActions.click(driver, lnkReturnPage,"Return Page link");
			return this;
		}

		/**
		 * @author charu.anbarasan
		 * click add new contigency
		 * @param driver
		 * @return RiskAnalysisPage
		 */
		public NewContingencyPage clickAddNewContigency(WebDriver driver) {
			BrowserActions.click(driver, btnAddNewContigency, "Add New Contigency button");
			return this;	
		}

		/**
		 * @author charu.anbarasan
		 * click ok button after verifying the fields
		 * @param driver
		 */
		public void clickOK(WebDriver driver) {
			BrowserActions.click(driver, btnOk, "OK button");
		}

		/**
		 * @author manikandan.manohar
		 * click Contingency Resolve Button
		 * @param driver
		 * @return 
		 */
		public NewContingencyPage clickContingencyResolveButton(WebDriver driver) {
			BrowserActions.click(driver, btnContingencyResolve, "Contingency Resolve");
			return this;
		}

		/**
		 * @author manikandan.manohar
		 * click Contingency Waive Button
		 * @param driver
		 * @return 
		 */
		public NewContingencyPage clickContingencyWaiveButton(WebDriver driver) {
			BrowserActions.click(driver, btnContingencyWaive,1, "Contingency Waive");
			return this;
		}

		/**
		 * @author manikandan.manohar
		 * click Contingency New Document Button
		 * @param driver
		 * @return 
		 */
		public NewContingencyPage clickNewDocumentButton(WebDriver driver) {
			BrowserActions.click(driver, btnNewDocument, "Contingency New Document");
			return this;
		}

		/**
		 * @author manikandan.manohar
		 * click Contingency Upload Document Link
		 * @param driver
		 * @return 
		 */
		public NewContingencyPage clickUploadDocumentLink(WebDriver driver) {
			BrowserActions.click(driver, lnkUploadDocument,true, "Upload Document Link");
			return this;
		}

		/**
		 * @author manikandan.manohar
		 * click Contingency Upload Document Button
		 * @param driver
		 * @return 
		 */
		public NewContingencyPage clickUploadDocumentButton(WebDriver driver) {
			BrowserActions.click(driver, btnUploadDocument, "Contingency Upload Document");
			return this;
		}

		/**
		 * Select the Action in Contingency Document Status DropDown
		 * @author manikandan.manohar
		 * @param driver, documentStatus
		 * @return NewContingencyPage
		 */
		public NewContingencyPage selectUploadDocumentStatus(WebDriver driver,String documentStatus){
			BrowserActions.selectDropDownByVisibleText(driver, drpUploadDocumentStatus, documentStatus,1, "Contingency Document Status");
			return this;
		}

		/**
		 * Select the Action in Contingency Document Type DropDown
		 * @author manikandan.manohar
		 * @param driver, documentType
		 * @return NewContingencyPage
		 */
		public NewContingencyPage selectUploadDocumentType(WebDriver driver,String documentType){
			BrowserActions.selectDropDownByVisibleText(driver, drpContingencyDocumentType, documentType, "Contingency Document Type");
			return this;
		}

		/**
		 * @author manikandan.manohar
		 * click Contingency Attach Document Button
		 * @param driver
		 * @return 
		 */
		public NewContingencyPage clickAttachDocumentButton(WebDriver driver) {
			BrowserActions.click(driver, btnAttachDocument,true, "Contingency Attach Document");
			return this;
		}

		/**
		 * Enters the Prior Loss Total Incurred
		 * @author manikandan.manohar
		 * @param driver, percent
		 * @return NewContingencyPage
		 */
		public NewContingencyPage enterPriorLossTotalIncurred(WebDriver driver,String percent){
			BrowserActions.type(driver, txtPriorLossTotalIncurred,percent, "Contingency Prior Loss Total Incurred");
			return this;
		}	

		/**
		 * Enters the Due loss Amount 
		 * @author manikandan.manohar
		 * @param driver, lossAmount
		 * @return NewContingencyPage
		 */
		public NewContingencyPage enterLossesInPastFiveYears(WebDriver driver,String lossAmount){
			BrowserActions.type(driver, txtLossesInPastFiveYears,lossAmount, "Contingency loss Amount");
			return this;
		}	

		/**
		 * Upload document after creation 
		 * @author somasundaram.muthu
		 * @param driver
		 * @return NewContingencyPage
		 */
		public NewContingencyPage documentAttachAfterCreation(WebDriver driver, String documentName) {

			EnvironmentPropertiesReader configProperty = EnvironmentPropertiesReader.getInstance();

			String env = configProperty.getProperty("runDesktop");

			String path = configProperty.getProperty("LT_RESOURCES_UPLOAD_PATH");

			if (env.equals("false")) {

				WebElement addFile = driver.findElement(By.cssSelector("input[id$='UploadDocumentScreen-FileInput--file']"));
				addFile.sendKeys(path);
			}

			//For local Upload
			else {

				String absolutePath = new File("./src/main/resources/assessmentMedia/"+documentName).getAbsolutePath();
				addFileBeforePolicyCreationButton.sendKeys(absolutePath);
			}

			return this;
		}	

		/**
		 * Enters the Due Date date 
		 * @author manikandan.manohar
		 * @param driver
		 * @return NewContingencyPage
		 */
		public NewContingencyPage documentAttachBeforeCreation(WebDriver driver, String documentName){

			EnvironmentPropertiesReader configProperty = EnvironmentPropertiesReader.getInstance();

			String env = configProperty.getProperty("runDesktop");

			String path = configProperty.getProperty("LT_RESOURCES_UPLOAD_PATH");

			if (env.equals("false")) {

				WebElement addFile = driver.findElement(By.cssSelector("input[id$='UploadDocumentScreen-FileInput--file']"));
				addFile.sendKeys(path);
			}

			//For local Upload
			else {

				String absolutePath = new File("./src/main/resources/assessmentMedia/"+documentName).getAbsolutePath();
				addFileBeforePolicyCreationButton.sendKeys(absolutePath);
			}

			return this;
		}	


		//			String absolutePath = new File("./src/main/resources/assessmentMedia/"+documentName).getAbsolutePath();
		//			//BrowserActions.type(driver, addFileBeforePolicyCreationButton,absolutePath, 1, "Contingency Document Attachment");
		//			addFileBeforePolicyCreationButton.sendKeys(absolutePath);
		//			return this;
	}

	//		/**
	//		 * Enters the Due Date date 
	//		 * @author manikandan.manohar
	//		 * @param driver
	//		 * @return NewContingencyPage
	//		 */
	//		public NewContingencyPage documentAttachAfterCreation(WebDriver driver){
	//			String absolutePath = new File(documentLocation).getAbsolutePath();
	//			//BrowserActions.type(driver, addFileAfterPolicyCreationButton,absolutePath, 2, "Contingency Document Attachment");
	//			addFileAfterPolicyCreationButton.sendKeys(absolutePath);
	//			return this;
	//		}

	//		/**
	//		 * Enters the Due Date date 
	//		 * @author manikandan.manohar
	//		 * @param driver
	//		 * @return NewContingencyPage
	//		 */
	//		public NewContingencyPage documentAttachBeforeCreation(WebDriver driver){
	//			String absolutePath = new File(documentLocation).getAbsolutePath();
	//			//BrowserActions.type(driver, addFileBeforePolicyCreationButton,absolutePath, 1, "Contingency Document Attachment");
	//			addFileBeforePolicyCreationButton.sendKeys(absolutePath);
	//			return this;
	//		}	
	//	}

	public class UWActivityPage extends LoadableComponent<UWActivityPage>{

		WebDriver driver;
		private boolean isPageLoaded;
		public ElementLayer elementLayer;
		public List<Object> pageFactoryKey = new ArrayList<Object>();
		public List<String> pageFactoryValue = new ArrayList<String>();

		@IFindBy(how = How.CSS, using = "div[class$='gw-TitleBar--title']", AI = false)
		public WebElement ttlUWActivity;

		@IFindBy(how = How.CSS, using = "input[name$='NewActivityDV-Subject']", AI = false)
		public WebElement txtSubjectNewActivity;

		@IFindBy(how = How.CSS, using = "input[name$='DocumentTemplate']", AI = false)
		public WebElement txtDocumentTemplate;

		@IFindBy(how = How.CSS, using = "select[name$='SelectFromList']", AI = false)
		public WebElement drpAssignTo;

		@IFindBy(how = How.CSS, using = "select[name$='Topic']", AI = false)
		public WebElement drpTopic;

		@IFindBy(how = How.CSS, using = "input[name$='NoteSubject']", AI = false)
		public WebElement txtNoteSubject;

		@IFindBy(how = How.CSS, using = "select[name$='SecurityLevel']", AI = false)
		public WebElement drpSecurityLevel;

		@IFindBy(how = How.CSS, using = "textarea[name$='Text']", AI = false)
		public WebElement txtTextField;

		@IFindBy(how = How.CSS, using = "div[id$='SelectDocumentTemplate']", AI = false)
		public WebElement icnDocumentTemplateSearch;

		@IFindBy(how = How.CSS, using = "div[id$='SelectEmailTemplate']", AI = false)
		public WebElement icnEmailTemplateSearch;

		@IFindBy(how = How.CSS, using = "div[id$='Update']", AI = false)
		public WebElement btnSendRequest;

		public UWActivityPage() {}

		public UWActivityPage(WebDriver driver){
			this.driver = driver;
			ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, Utils.maxElementWait);
			PageFactory.initElements(finder, this);
			elementLayer = new ElementLayer(driver);
		}
		
		public UWActivityPage(WebDriver driver,int timeout){
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

			if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, ttlUWActivity))) {
				Log.fail("Page did not open up. Site might be down.", driver);
			}
			elementLayer = new ElementLayer(driver);
		}// isLoaded

		/**
		 * Used to enter Document template in template Field
		 * @author vignesh.ravi
		 * @param driver, template
		 * @return UWActivityPage
		 */
		public UWActivityPage enterDocumentTemplate(WebDriver driver , String template){
			BrowserActions.type(driver, txtDocumentTemplate,template,"Document template");
			return this;
		}

		/**
		 * Select the Topic
		 * @author vignesh.ravi
		 * @param driver, Topic
		 * @return UWActivityPage
		 */
		public UWActivityPage selectTopicType(WebDriver driver,String Topic) {
			BrowserActions.selectDropDownByVisibleText(driver, drpTopic, Topic, "Topic");
			return this;
		}

		/**
		 * Used to enter Subject in template Field
		 * @author vignesh.ravi
		 * @param driver, Subject
		 * @return UWActivityPage
		 */
		public UWActivityPage enterSubject(WebDriver driver , String Subject){
			BrowserActions.type(driver, txtNoteSubject,Subject,"Subject");
			return this;
		}

		/**
		 * Used to enter Subject in template Field
		 * @author vignesh.ravi
		 * @param driver, text
		 * @return UWActivityPage
		 */
		public UWActivityPage enterText(WebDriver driver , String text){
			BrowserActions.type(driver, txtTextField,text,"Subject");
			return this;
		}

		/**
		 * click Document search
		 * @author vignesh.ravi
		 * @param driver
		 * @return UWActivityPage
		 */
		public UWActivityPage clickDocumentTempleteSearchIcon(WebDriver driver) {
			BrowserActions.click(driver, icnDocumentTemplateSearch, "Document search");
			return this;
		}

		/**
		 * click Email search
		 * @author vignesh.ravi
		 * @param driver
		 * @return UWActivityPage
		 */
		public UWActivityPage clickEmailTempleteSearchIcon(WebDriver driver){
			BrowserActions.click(driver, icnEmailTemplateSearch, "Email search");
			return this;
		}
		/**
		 * click Send Request button
		 * @author vignesh.ravi
		 * @param driver
		 * @return UWActivityPage
		 */
		public UWActivityPage clickSendRequest(WebDriver driver){
			BrowserActions.click(driver, btnSendRequest, "Send Request");
			return this;
		}
	}

	public class PriorLossesPage extends LoadableComponent<PriorLossesPage>{

		WebDriver driver;
		private boolean isPageLoaded;
		public ElementLayer elementLayer;
		public List<Object> pageFactoryKey = new ArrayList<Object>();
		public List<String> pageFactoryValue = new ArrayList<String>();

		@IFindBy(how = How.CSS, using = "div[class$='gw-TitleBar--title']", AI = false)
		public WebElement ttlPriorLosses;

		@IFindBy(how = How.CSS, using = "div[id$='LossHistoryCardTab']", AI = false)
		public WebElement tabPriorLosses;

		@IFindBy(how = How.CSS, using = "input[name$='ManualLossHistoryLV-0-OccurrenceDate']", AI = false)
		public WebElement txtOccurrenceDate1;

		@IFindBy(how = How.CSS, using = "input[name$='ManualLossHistoryLV-1-OccurrenceDate']", AI = false)
		public WebElement txtOccurrenceDate2;

		@IFindBy(how = How.CSS, using = "select[name$='LossHistoryType']", AI = false)
		public WebElement drpLossHistoryType;

		@IFindBy(how = How.CSS, using = "select[name$='ManualLossHistoryLV-0-Status']", AI = false)
		public WebElement drpStatus;

		@IFindBy(how = How.CSS, using = "div[id$='ManualLossHistoryLV_tb-Add']", AI = false)
		public WebElement btnAddLossHistory;

		@IFindBy(how = How.CSS, using = "select[name$='PolicyLine']", AI = false)
		public WebElement drpPolicyLine;

		public String occurenceDate ="input[name$='ManualLossHistoryLV-{INDEX}-OccurrenceDate']";
		public String lossHistoryDescription ="input[name$='ManualLossHistoryLV-{INDEX}-Description']";
		public String totalIncurred="input[name$='ManualLossHistoryLV-{INDEX}-TotalIncurred']";
		public String amountpaid="input[name$='ManualLossHistoryLV-{INDEX}-AmountPaid']";
		public String amountreserved="input[name$='ManualLossHistoryLV-{INDEX}-AmountReserved']";
		public String lossStatus ="select[name$='ManualLossHistoryLV-{INDEX}-Status']";

		public PriorLossesPage() {}

		public PriorLossesPage(WebDriver driver){
			this.driver = driver;
			ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, Utils.maxElementWait);
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

			if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, ttlPriorLosses))) {
				Log.fail("Page did not open up. Site might be down.", driver);
			}
			elementLayer = new ElementLayer(driver);
		}// isLoaded

		/**
		 * @author charu.anbarasan
		 * click prior losses tab
		 * @param driver
		 * @return RiskAnalysisPage
		 */
		public PriorLossesPage clickPriorLosses(WebDriver driver) {
			BrowserActions.click(driver, tabPriorLosses, "prior lossess tab");
			return this;
		}

		/**
		 * @author manikandan.manohar
		 * Enter the Loss History Type
		 * @param driver
		 * @return 
		 */
		public PriorLossesPage selectLossHistoryType(WebDriver driver,String lossHistoryType) {
			BrowserActions.selectDropDownByVisibleText(driver, drpLossHistoryType, lossHistoryType,0.5, "Loss History Type");
			return this;
		}

		/**
		 * Enters the Occurence date 
		 * @author vignesh.ravi
		 * @param driver, date
		 */
		public PriorLossesPage enterOccurenceDateField(WebDriver driver , String date, int noOfLoss){
			BrowserActions.waitForElementToDisplay(driver, txtOccurrenceDate1);
			if(noOfLoss>1) 
				BrowserActions.waitForElementToDisplay(driver, txtOccurrenceDate2);	
			String LossCount = occurenceDate.replaceAll("\\{INDEX\\}",""+(noOfLoss-1));
			driver.findElement(By.cssSelector(LossCount)).sendKeys(date);
			return this;
		}

		/**
		 * @author manikandan.manohar
		 * Used to enter Description LossHistoryDescription Field
		 * @param driver, date
		 */
		public PriorLossesPage enterPriorLossDescription(WebDriver driver , String description, int noOfLoss){
			BrowserActions.waitForElementToDisplay(driver, txtOccurrenceDate1);
			String LossCount = lossHistoryDescription.replaceAll("\\{INDEX\\}",""+(noOfLoss-1));
			driver.findElement(By.cssSelector(LossCount)).sendKeys(description);
			return this;
		}

		/**
		 * @author manikandan.manohar
		 * Used to enter Total Incurred in total incurred Field
		 * @param totalincurred 
		 * @param driver, date
		 */
		public PriorLossesPage enterTotalIncurred(WebDriver driver, String totalincurred, int noOfLoss){
			BrowserActions.waitForElementToDisplay(driver, txtOccurrenceDate1);
			String LossCount = totalIncurred.replaceAll("\\{INDEX\\}",""+(noOfLoss-1));
			driver.findElement(By.cssSelector(LossCount)).sendKeys(totalincurred);
			return this;
		}

		/**
		 * @author manikandan.manohar
		 * Used to enter AmountPaid in total Amount Paid Field
		 * @param amountPaid 
		 * @param driver, date
		 */
		public PriorLossesPage enterAmountPaid(WebDriver driver, String amountPaid, int noOfLoss){
			BrowserActions.waitForElementToDisplay(driver, txtOccurrenceDate1);
			String LossCount = amountpaid.replaceAll("\\{INDEX\\}",""+(noOfLoss-1));
			driver.findElement(By.cssSelector(LossCount)).sendKeys(amountPaid);
			return this;
		}

		/**
		 * @author manikandan.manohar
		 * Used to enter Amount Reserved in total Open Reserve Field
		 * @param amountReserved 
		 * @param driver, date
		 */
		public PriorLossesPage enterOpenReserve(WebDriver driver, String amountReserved , int noOfLoss){
			BrowserActions.waitForElementToDisplay(driver, txtOccurrenceDate1);
			String LossCount = amountreserved.replaceAll("\\{INDEX\\}",""+(noOfLoss-1));
			driver.findElement(By.cssSelector(LossCount)).sendKeys(amountReserved);
			return this;
		}

		/**
		 * @author manikandan.manohar
		 * Enter the Loss History Type
		 * @param driver
		 * @return 
		 */
		public PriorLossesPage selectLossHistoryStatus(WebDriver driver,String status, int noOfLoss) {
			BrowserActions.waitForElementToDisplay(driver, txtOccurrenceDate1);
			String LossCount = lossStatus.replaceAll("\\{INDEX\\}",""+(noOfLoss-1));
			driver.findElement(By.cssSelector(LossCount)).sendKeys(status);
			return this;
		}
		/**
		 * used to click add button in loss history
		 * @author charu.anbarasan
		 * @param driver
		 */
		public void clickAddLossHistory(WebDriver driver) {
			BrowserActions.click(driver, btnAddLossHistory,"Add Loss history");
		}

		/**
		 * @author manikandan.manohar
		 * Enter the Loss History Type
		 * @param driver
		 * @return 
		 */
		public PriorLossesPage selectPolicyLine(WebDriver driver,String policyLine) {
			BrowserActions.selectDropDownByVisibleText(driver, drpPolicyLine, policyLine,0.5, "Policy Line");
			return this;
		}

	}

	public class PreQuoteIssuesPage extends LoadableComponent<PreQuoteIssuesPage>{

		WebDriver driver;
		private boolean isPageLoaded;
		public ElementLayer elementLayer;
		public List<Object> pageFactoryKey = new ArrayList<Object>();
		public List<String> pageFactoryValue = new ArrayList<String>();

		@IFindBy(how = How.CSS, using = "div[id$='PreQuoteIssueTitle']", AI = false)
		public WebElement ttlPreQuoteIssue;

		@IFindBy(how = How.CSS, using = "div[id$='DetailsButton']", AI = false)
		public WebElement btnDetails;

		public PreQuoteIssuesPage() {}

		public PreQuoteIssuesPage(WebDriver driver){
			this.driver = driver;
			ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, Utils.maxElementWait);
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

			if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, ttlPreQuoteIssue))) {
				Log.fail("Page did not open up. Site might be down.", driver);
			}
			elementLayer = new ElementLayer(driver);
		}// isLoaded


		/**
		 * Used to click on Details
		 * @author charu.anbarasan
		 * @param driver
		 * @return RiskAnalysisPage
		 */
		public void clickDetails(WebDriver driver) {
			BrowserActions.click(driver, btnDetails, "Details button");
		}

	}

}
