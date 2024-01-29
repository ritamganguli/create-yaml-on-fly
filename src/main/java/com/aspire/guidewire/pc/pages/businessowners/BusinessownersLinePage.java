package com.aspire.guidewire.pc.pages.businessowners;
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

public class BusinessownersLinePage extends LoadableComponent<BusinessownersLinePage> {

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

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPScreen-BOPLinePanelSet-BOPLiabilityDV-BOPLiabilityCatIterator-1-CoverageInputSet-CovPatternInputGroup-0-CovTermInputSet-OptionTermInput']", AI = false)
	public WebElement drpTenantsFireLiabilityLimit;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_CopySubmission>div[role='menuitem']", AI = false)
	public WebElement btnCopySubmission;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPScreen-BOPLinePanelSet-BOPLiabilityDV-BOPLiabilityCatIterator-2-CoverageInputSet-CovPatternInputGroup-2-CovTermInputSet-TypekeyTermInput']", AI = false)
	public WebElement drpPDDeductibleType;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-4-item>div[role='menuitem']", AI = false)
	public WebElement btnGeneralreminderdiary;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPScreen-BOPLinePanelSet-BOPLiabilityDV-BOPLiabilityCatIterator-2-CoverageInputSet-CovPatternInputGroup-1-CovTermInputSet-OptionTermInput']", AI = false)
	public WebElement drpPDDeductible;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-8-item>div[role='menuitem']", AI = false)
	public WebElement btnGetReinsuranceQuote;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-13-item>div[role='menuitem']", AI = false)
	public WebElement btnReview45dayUWPeriod;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-1-item>div[role='menuitem']", AI = false)
	public WebElement btnGetAuditInternalPersonnel;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPScreen-JobWizardToolbarButtonSet-BindOptions-BindOnly>div[role='menuitem']", AI = false)
	public WebElement btnBindOnly;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-0-NewActivityMenuItemSet_Category>div[role='menuitem']", AI = false)
	public WebElement btnInterview;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-MultiQuoteAcceleratedMenuActions-PolicyPeriodSelector-PolicyPeriodSelector_Arg']", AI = false)
	public WebElement drpPolicyPeriodSelector_Arg;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-6-item>div[role='menuitem']", AI = false)
	public WebElement btnPerformanceReview;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPScreen-BOPLinePanelSet-BOPLiabilityDV-BOPLiabilityCatIterator-4-CoverageInputSet-CovPatternInputGroup-_checkbox']", AI = false)
	public WebElement chkPersonalandAdvertisingInjury;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-DiagWorksheetItem-ShowDiagWorksheet>div[role='menuitem']", AI = false)
	public WebElement btnShowPartialWorksheet;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-1-item>div[role='menuitem']", AI = false)
	public WebElement btn60daydiary;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPScreen-JobWizardToolbarButtonSet-Versions-NewVersion>div[role='menuitem']", AI = false)
	public WebElement btnStartMultiVersion;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Prev>div[role='button']", AI = false)
	public WebElement btnBack;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPScreen-BOPLinePanelSet-BOPLinePropertyDV-0-CoverageInputSet-CovPatternInputGroup-3-CovTermInputSet-OptionTermInput']", AI = false)
	public WebElement drpPropertyOptionalDeductible;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-PolicyVersions>div[role='menuitem']", AI = false)
	public WebElement btnPolicyVersions_3;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-15-item>div[role='menuitem']", AI = false)
	public WebElement btnReviewProducer;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPScreen-BOPLinePanelSet-BOPLiabilityDV-BOPLiabilityCatIterator-0-CoverageInputSet-CovPatternInputGroup-0-CovTermInputSet-TypekeyTermInput']", AI = false)
	public WebElement drpSpecialCoveragesPackages;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-Locations>div[role='menuitem']", AI = false)
	public WebElement btnLocations;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-RiskEvaluation>div[role='menuitem']", AI = false)
	public WebElement btnRiskAnalysis_4;

	@IFindBy(how = How.CSS, using = "div[id$='Next']", AI = false)
	public WebElement btnNext;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-10-item>div[role='menuitem']", AI = false)
	public WebElement btnQuoteRequired;

	@IFindBy(how = How.CSS, using = "div[id$='ExclusionsAndConditionsCardTab']", AI = false)
	public WebElement btnExclusionsConditions;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-8-item>div[role='menuitem']", AI = false)
	public WebElement btnPolicyReviewMidterm;

	@IFindBy(how = How.CSS, using = "div[id$='AdditionalCardTab']", AI = false)
	public WebElement btnAdditionalCoverages;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPScreen-JobWizardToolbarButtonSet-Versions-ViewSideBySide>div[role='menuitem']", AI = false)
	public WebElement btnViewSideBySideVersions;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPScreen-JobWizardToolbarButtonSet-Draft>div[role='button']", AI = false)
	public WebElement btnSaveDraft;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-3-item>div[role='menuitem']", AI = false)
	public WebElement btnGetBureauData;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPScreen-BOP_IncludedCardTab", AI = false)
	public WebElement btnIncludedCoverages;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Reinsurance>div[role='menuitem']", AI = false)
	public WebElement btnReinsurance;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-JobGroupItem>div[role='menuitem']", AI = false)
	public WebElement btnSG00123362603667786193;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-BillingInfo>div[role='menuitem']", AI = false)
	public WebElement btnPayment;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Change-WizardMenuActions_ChangeEffDate>div[role='menuitem']", AI = false)
	public WebElement btnEffectiveDate;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPScreen-QuoteRequestedAlert .gw-AlertBar--label", AI = false)
	public WebElement lblQuoteRequestedAlert;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPScreen-BOPLinePanelSet-BOPLinePropertyDV-0-CoverageInputSet-CovPatternInputGroup-0-CovTermInputSet-OptionTermInput']", AI = false)
	public WebElement drpPropertyBaseDeductible;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewDocument-NewJobDocumentMenuItemSet-PolicyPeriodNewDocumentMenuItemSet_Template>div[role='menuitem']", AI = false)
	public WebElement btnCreatefromatemplate;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPScreen-JobWizardToolbarButtonSet-Versions-SideBySide>div[role='menuitem']", AI = false)
	public WebElement btnStartSidebySide;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Archiving>div[role='menuitem']", AI = false)
	public WebElement btnArchiving;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPScreen-BOPLinePanelSet-BOPLinePropertyDV-0-CoverageInputSet-CovPatternInputGroup-4-CovTermInputSet-TypekeyTermInput']", AI = false)
	public WebElement drpCauseOfLoss;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPScreen-JobWizardToolbarButtonSet-CloseOptions-NotTakenJob>div[role='menuitem']", AI = false)
	public WebElement btnNotTaken;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPScreen-BOPLinePanelSet-BOPLiabilityDV-BOPLiabilityCatIterator-3-CoverageInputSet-CovPatternInputGroup-_checkbox']", AI = false)
	public WebElement chkPremisesMedicalExpense;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Documents>div[role='menuitem']", AI = false)
	public WebElement btnDocuments;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPScreen-PreferredCoverageCurrencySelectorRef-PreferredCoverageCurrencyPanelSet-PreferredCoverageCurrencySelectorDropDown']", AI = false)
	public WebElement drpCoveragesin;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPScreen-OOSEPanelSet-NextSliceLink", AI = false)
	public WebElement btnNextBlockedDate;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPScreen-BOPLinePanelSet-BOPLiabilityDV-BOPLiabilityCatIterator-2-CoverageInputSet-CovPatternInputGroup-0-CovTermInputSet-PackageTermInput']", AI = false)
	public WebElement drpLimitsOccurrenceProdAggGenAgg;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-2-item>div[role='menuitem']", AI = false)
	public WebElement btn90daydiary;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPScreen-JobWizardToolbarButtonSet-QuoteTypeToolbarButtonSet-Quote>div[role='button']", AI = false)
	public WebElement btnQuote;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPScreen-JobWizardToolbarButtonSet-BindOptions>div[role='button']", AI = false)
	public WebElement btnBindOptions;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-BOPBuildings>div[role='menuitem']", AI = false)
	public WebElement btnBuildings;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPScreen-BOPLinePanelSet-BOPLiabilityDV-BOPLiabilityCatIterator-2-CoverageInputSet-CovPatternInputGroup-_checkbox']", AI = false)
	public WebElement chkLiability;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPScreen-JobWizardToolbarButtonSet-Unlock>div[role='button']", AI = false)
	public WebElement btnReleaseLock;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPScreen-BOPLinePanelSet-BOPLinePropertyDV-0-CoverageInputSet-CovPatternInputGroup-2-CovTermInputSet-OptionTermInput']", AI = false)
	public WebElement drpGlassDeductible;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Archiving-WizardMenuActions_SuspendResumeArchiving>div[role='menuitem']", AI = false)
	public WebElement btnEnableDisable;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPScreen-JobWizardToolbarButtonSet-BindOptions-BindAndIssue>div[role='menuitem']", AI = false)
	public WebElement btnIssuePolicy;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-0-item>div[role='menuitem']", AI = false)
	public WebElement btnCreateNewProducer;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPScreen-AdditionalInsuredsDV-AdditionalInsuredLV_tb-AddContactsButton>div[role='button']", AI = false)
	public WebElement btnAdd;

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

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPScreen-BOPLinePanelSet-BOPLinePropertyDV-0-CoverageInputSet-CovPatternInputGroup-1-CovTermInputSet-OptionTermInput']", AI = false)
	public WebElement drpOptionalCoveragesDeductible;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-5-item>div[role='menuitem']", AI = false)
	public WebElement btnGetInspectionLossControl;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Participants>div[role='menuitem']", AI = false)
	public WebElement btnParticipants;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create>div[role='menuitem']", AI = false)
	public WebElement btnCreate;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-1-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnBOP0012415250;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-4-NewActivityMenuItemSet_Category-0-item>div[role='menuitem']", AI = false)
	public WebElement btnReviewandapprove;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPScreen-OOSEPanelSet-OOSEPeriodSelector-OOSEPeriodSelector_Arg']", AI = false)
	public WebElement drpEffectiveDate;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-10-item>div[role='menuitem']", AI = false)
	public WebElement btnLegalreview;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewDocument>div[role='menuitem']", AI = false)
	public WebElement btnNewDocument;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-7-item>div[role='menuitem']", AI = false)
	public WebElement btnPolicynotification;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPScreen-BOPLinePanelSet-BOPLiabilityDV-BOPLiabilityCatIterator-0-CoverageInputSet-CovPatternInputGroup-_checkbox']", AI = false)
	public WebElement chkSpecialCoveragePackages;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewDocument-NewJobDocumentMenuItemSet-PolicyPeriodNewDocumentMenuItemSet_Linked>div[role='menuitem']", AI = false)
	public WebElement btnUploaddocuments;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Finish>div[role='button']", AI = false)
	public WebElement btnFinish;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPScreen-BOPLinePanelSet-BOPLiabilityDV-BOPLiabilityCatIterator-3-CoverageInputSet-CovPatternInputGroup-0-CovTermInputSet-OptionTermInput']", AI = false)
	public WebElement drpPremisesMedicalExpenseLimit;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto>div[role='menuitem']", AI = false)
	public WebElement btnGoto;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPScreen-BOPLinePanelSet-BOPLiabilityDV-BOPLiabilityCatIterator-1-CoverageInputSet-CovPatternInputGroup-_checkbox']", AI = false)
	public WebElement chkTenantsFireLiability;

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

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-BOPSupplemental>div[role='menuitem']", AI = false)
	public WebElement btnSupplemental;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-11-item>div[role='menuitem']", AI = false)
	public WebElement btnRatiooutofrange;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPScreen-JobWizardToolbarButtonSet-ConvertToFullApp>div[role='button']", AI = false)
	public WebElement btnFullApp;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-0-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnGL0012336260;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPScreen-BOPLinePanelSet-BOPLineOtherIncludedDV-0-CoverageInputSet-CovPatternInputGroup-_checkbox']", AI = false)
	public WebElement chkEmployeeDishonesty;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-PolicyReview>div[role='menuitem']", AI = false)
	public WebElement btnPolicyReview;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-DiagWorksheetItem>div[role='menuitem']", AI = false)
	public WebElement btnDiagnosticData;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPScreen-OOSEPanelSet-OOSEPeriodSelector", AI = false)
	public WebElement btnOOSEPeriodSelector;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-11-item>div[role='menuitem']", AI = false)
	public WebElement btnManuallyrateandquotepolicy;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-History>div[role='menuitem']", AI = false)
	public WebElement btnHistory;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category>div[role='menuitem']", AI = false)
	public WebElement btnReminder;

	@IFindBy(how = How.CSS, using = "div[id$='BOPScreen-ttlBar']", AI = false)
	public WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Change>div[role='menuitem']", AI = false)
	public WebElement btnEdit;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPScreen-BOPLinePanelSet-BOPLineOtherIncludedDV-2-CoverageInputSet-CovPatternInputGroup-_checkbox']", AI = false)
	public WebElement chkNonownedAutoLiability;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPScreen-JobWizardToolbarButtonSet-CloseOptions-WithdrawJob>div[role='menuitem']", AI = false)
	public WebElement btnWithdrawTransaction;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-PolicyInfo>div[role='menuitem']", AI = false)
	public WebElement btnPolicyInfo;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPScreen-BOPLinePanelSet-BOPLineOtherIncludedDV-1-CoverageInputSet-CovPatternInputGroup-_checkbox']", AI = false)
	public WebElement chkHiredAuto;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPScreen-JobWizardToolbarButtonSet-Versions>div[role='button']", AI = false)
	public WebElement btnVersions;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-Modifiers>div[role='menuitem']", AI = false)
	public WebElement btnModifiers;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_ToAccountFile>div[role='menuitem']", AI = false)
	public WebElement btnAccountFile;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-BOP>div[role='menuitem']", AI = false)
	public WebElement btnBusinessownersLine;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPScreen-AdditionalInsuredsDV-AdditionalInsuredLV_tb-Remove>div[role='button']", AI = false)
	public WebElement btnRemove;

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

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPScreen-BOPLinePanelSet-BOPLinePropertyDV-BlanketType']", AI = false)
	public WebElement drpBlanket;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-5-item>div[role='menuitem']", AI = false)
	public WebElement btnNewAuditAssignment;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-16-item>div[role='menuitem']", AI = false)
	public WebElement btnRewritetoNewAccount;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPScreen-QuoteRequestedAlert-CloseBtn", AI = false)
	public WebElement btnClose;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-12-item>div[role='menuitem']", AI = false)
	public WebElement btnReview30dayUWPeriod;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-ManageBranches>div[role='menuitem']", AI = false)
	public WebElement btnPolicyVersions;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-14-item>div[role='menuitem']", AI = false)
	public WebElement btnReview60dayUWPeriod;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPScreen-JobWizardToolbarButtonSet-EditPolicy>div[role='button']", AI = false)
	public WebElement btnEditPolicyTransaction;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity>div[role='menuitem']", AI = false)
	public WebElement btnNewActivity;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Cancel>div[role='button']", AI = false)
	public WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPScreen-JobWizardToolbarButtonSet-CloseOptions>div[role='button']", AI = false)
	public WebElement btnCloseOptions;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPScreen-BOPLinePanelSet-BOPLinePropertyDV-0-CoverageInputSet-CovPatternInputGroup-_checkbox']", AI = false)
	public WebElement chkPolicywidePropertyDeductible;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup>div[role='menuitem']", AI = false)
	public WebElement btnPolicyContract;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_ToPolicyFile>div[role='menuitem']", AI = false)
	public WebElement btnPolicyFile;

	@IFindBy(how = How.CSS, using = "select[name$='SmallBusinessType']", AI = false)
	public WebElement drpSmallBusinessType;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-17-item>div[role='menuitem']", AI = false)
	public WebElement btnVerifycoverage;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category>div[role='menuitem']", AI = false)
	public WebElement btnRequest;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-4-item>div[role='menuitem']", AI = false)
	public WebElement btnGetCreditReports;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPScreen-PreferredCoverageCurrencySelectorRef-PreferredCoverageCurrencyPanelSet-CoverageCurrencyDisplay']", AI = false)
	public WebElement inpCoveragesin;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPScreen-JobWizardToolbarButtonSet-CloseOptions-Decline>div[role='menuitem']", AI = false)
	public WebElement btnDecline;

	@IFindBy(how = How.CSS, using = "div[id=$'SubmissionWizard-WizardMenuActions']>div[role='button']", AI = false)
	public WebElement btnWizardMenuActions;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardActionsMenuItemSet-SubmissionInfo>div[role='menuitem']", AI = false)
	public WebElement btnSubManager;

	@IFindBy(how = How.CSS, using = "div[id$='AdditionalCoveragesDV_tb-Add']", AI = false)
	public WebElement btnAddCoverages;

	@IFindBy(how = How.CSS, using = "div[id$='ClearButton']", AI = false)
	public WebElement btnClear;

	@IFindBy(how = How.CSS, using = "div[id$='AddExclusionsOrCondition']", AI = false)
	public WebElement btnAddExclusionsAndCondition;

	public BusinessownersLinePage(){
	}

	public BusinessownersLinePage(WebDriver driver) {
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
	}public BusinessownersLinePage clickWorkplan(WebDriver driver)  {
		BrowserActions.click(driver, btnWorkplan,"Workplan");
		return this;
	}
	public BusinessownersLinePage clickGetRiskInformationProducer(WebDriver driver)  {
		BrowserActions.click(driver, btnGetRiskInformationProducer,"GetRiskInformationProducer");
		return this;
	}
	public BusinessownersLinePage selectTenantsFireLiabilityLimit(WebDriver driver,String TenantsFireLiabilityLimit)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTenantsFireLiabilityLimit,TenantsFireLiabilityLimit,"TenantsFireLiabilityLimit");
		return this;
	}
	public BusinessownersLinePage clickCopySubmission(WebDriver driver)  {
		BrowserActions.click(driver, btnCopySubmission,"CopySubmission");
		return this;
	}
	public BusinessownersLinePage selectPDDeductibleType(WebDriver driver,String PDDeductibleType)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPDDeductibleType,PDDeductibleType,"PDDeductibleType");
		return this;
	}
	public BusinessownersLinePage clickGeneralreminderdiary(WebDriver driver)  {
		BrowserActions.click(driver, btnGeneralreminderdiary,"Generalreminderdiary");
		return this;
	}
	public BusinessownersLinePage selectPDDeductible(WebDriver driver,String PDDeductible)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPDDeductible,PDDeductible,"PDDeductible");
		return this;
	}
	public BusinessownersLinePage clickGetReinsuranceQuote(WebDriver driver)  {
		BrowserActions.click(driver, btnGetReinsuranceQuote,"GetReinsuranceQuote");
		return this;
	}
	public BusinessownersLinePage clickReview45dayUWPeriod(WebDriver driver)  {
		BrowserActions.click(driver, btnReview45dayUWPeriod,"Review45dayUWPeriod");
		return this;
	}
	public BusinessownersLinePage clickGetAuditInternalPersonnel(WebDriver driver)  {
		BrowserActions.click(driver, btnGetAuditInternalPersonnel,"GetAuditInternalPersonnel");
		return this;
	}
	public BusinessownersLinePage clickBindOnly(WebDriver driver)  {
		BrowserActions.click(driver, btnBindOnly,"BindOnly");
		return this;
	}
	public BusinessownersLinePage clickInterview(WebDriver driver)  {
		BrowserActions.click(driver, btnInterview,"Interview");
		return this;
	}
	public BusinessownersLinePage selectPolicyPeriodSelector_Arg(WebDriver driver,String PolicyPeriodSelector_Arg)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPolicyPeriodSelector_Arg,PolicyPeriodSelector_Arg,"PolicyPeriodSelector_Arg");
		return this;
	}
	public BusinessownersLinePage clickPerformanceReview(WebDriver driver)  {
		BrowserActions.click(driver, btnPerformanceReview,"PerformanceReview");
		return this;
	}
	public BusinessownersLinePage clickPersonalandAdvertisingInjury(WebDriver driver)  {
		BrowserActions.click(driver, chkPersonalandAdvertisingInjury,"PersonalandAdvertisingInjury");
		return this;
	}
	public BusinessownersLinePage clickShowPartialWorksheet(WebDriver driver)  {
		BrowserActions.click(driver, btnShowPartialWorksheet,"ShowPartialWorksheet");
		return this;
	}
	public BusinessownersLinePage click60daydiary(WebDriver driver)  {
		BrowserActions.click(driver, btn60daydiary,"60daydiary");
		return this;
	}
	public BusinessownersLinePage clickStartMultiVersion(WebDriver driver)  {
		BrowserActions.click(driver, btnStartMultiVersion,"StartMultiVersion");
		return this;
	}
	public BusinessownersLinePage clickBack(WebDriver driver)  {
		BrowserActions.click(driver, btnBack,"Back");
		return this;
	}
	public BusinessownersLinePage selectPropertyOptionalDeductible(WebDriver driver,String PropertyOptionalDeductible)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPropertyOptionalDeductible,PropertyOptionalDeductible,"PropertyOptionalDeductible");
		return this;
	}
	public BusinessownersLinePage clickPolicyVersions_3(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyVersions_3,"PolicyVersions_3");
		return this;
	}
	public BusinessownersLinePage clickReviewProducer(WebDriver driver)  {
		BrowserActions.click(driver, btnReviewProducer,"ReviewProducer");
		return this;
	}
	public BusinessownersLinePage selectSpecialCoveragesPackages(WebDriver driver,String SpecialCoveragesPackages)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpSpecialCoveragesPackages,SpecialCoveragesPackages,"SpecialCoveragesPackages");
		return this;
	}
	public BusinessownersLinePage clickLocations(WebDriver driver)  {
		BrowserActions.click(driver, btnLocations,"Locations");
		return this;
	}
	public BusinessownersLinePage clickRiskAnalysis_4(WebDriver driver)  {
		BrowserActions.click(driver, btnRiskAnalysis_4,"RiskAnalysis_4");
		return this;
	}
	public BusinessownersLinePage clickNext(WebDriver driver)  {
		BrowserActions.click(driver, btnNext,1,"Next");
		return this;
	}
	public BusinessownersLinePage clickQuoteRequired(WebDriver driver)  {
		BrowserActions.click(driver, btnQuoteRequired,"QuoteRequired");
		return this;
	}
	public BusinessownersLinePage clickExclusionsConditions(WebDriver driver)  {
		BrowserActions.click(driver, btnExclusionsConditions,"ExclusionsConditions");
		return this;
	}
	public BusinessownersLinePage clickPolicyReviewMidterm(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyReviewMidterm,"PolicyReviewMidterm");
		return this;
	}
	public BusinessownersLinePage clickAdditionalCoverages(WebDriver driver)  {
		BrowserActions.click(driver, btnAdditionalCoverages,"AdditionalCoverages");
		return this;
	}
	public BusinessownersLinePage clickViewSideBySideVersions(WebDriver driver)  {
		BrowserActions.click(driver, btnViewSideBySideVersions,"ViewSideBySideVersions");
		return this;
	}
	public BusinessownersLinePage clickSaveDraft(WebDriver driver)  {
		BrowserActions.click(driver, btnSaveDraft,"SaveDraft");
		return this;
	}
	public BusinessownersLinePage clickGetBureauData(WebDriver driver)  {
		BrowserActions.click(driver, btnGetBureauData,"GetBureauData");
		return this;
	}
	public BusinessownersLinePage clickIncludedCoverages(WebDriver driver)  {
		BrowserActions.click(driver, btnIncludedCoverages,"IncludedCoverages");
		return this;
	}
	public BusinessownersLinePage clickReinsurance(WebDriver driver)  {
		BrowserActions.click(driver, btnReinsurance,"Reinsurance");
		return this;
	}
	public BusinessownersLinePage clickSG00123362603667786193(WebDriver driver)  {
		BrowserActions.click(driver, btnSG00123362603667786193,"SG00123362603667786193");
		return this;
	}
	public BusinessownersLinePage clickPayment(WebDriver driver)  {
		BrowserActions.click(driver, btnPayment,"Payment");
		return this;
	}
	public BusinessownersLinePage clickEffectiveDate(WebDriver driver)  {
		BrowserActions.click(driver, btnEffectiveDate,"EffectiveDate");
		return this;
	}
	public BusinessownersLinePage selectPropertyBaseDeductible(WebDriver driver,String PropertyBaseDeductible)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPropertyBaseDeductible,PropertyBaseDeductible,"PropertyBaseDeductible");
		return this;
	}
	public BusinessownersLinePage clickCreatefromatemplate(WebDriver driver)  {
		BrowserActions.click(driver, btnCreatefromatemplate,"Createfromatemplate");
		return this;
	}
	public BusinessownersLinePage clickStartSidebySide(WebDriver driver)  {
		BrowserActions.click(driver, btnStartSidebySide,"StartSidebySide");
		return this;
	}
	public BusinessownersLinePage clickArchiving(WebDriver driver)  {
		BrowserActions.click(driver, btnArchiving,"Archiving");
		return this;
	}
	public BusinessownersLinePage selectCauseOfLoss(WebDriver driver,String CauseOfLoss)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCauseOfLoss,CauseOfLoss,"CauseOfLoss");
		return this;
	}
	public BusinessownersLinePage clickNotTaken(WebDriver driver)  {
		BrowserActions.click(driver, btnNotTaken,"NotTaken");
		return this;
	}
	public BusinessownersLinePage clickPremisesMedicalExpense(WebDriver driver)  {
		BrowserActions.click(driver, chkPremisesMedicalExpense,"PremisesMedicalExpense");
		return this;
	}
	public BusinessownersLinePage clickDocuments(WebDriver driver)  {
		BrowserActions.click(driver, btnDocuments,"Documents");
		return this;
	}
	public BusinessownersLinePage selectCoveragesin(WebDriver driver,String Coveragesin)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCoveragesin,Coveragesin,"Coveragesin");
		return this;
	}
	public BusinessownersLinePage clickNextBlockedDate(WebDriver driver)  {
		BrowserActions.click(driver, btnNextBlockedDate,"NextBlockedDate");
		return this;
	}
	public BusinessownersLinePage selectLimitsOccurrenceProdAggGenAgg(WebDriver driver,String LimitsOccurrenceProdAggGenAgg)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpLimitsOccurrenceProdAggGenAgg,LimitsOccurrenceProdAggGenAgg,"LimitsOccurrenceProdAggGenAgg");
		return this;
	}
	public BusinessownersLinePage click90daydiary(WebDriver driver)  {
		BrowserActions.click(driver, btn90daydiary,"90daydiary");
		return this;
	}
	public BusinessownersLinePage clickQuote(WebDriver driver)  {
		BrowserActions.click(driver, btnQuote,"Quote");
		return this;
	}
	public BusinessownersLinePage clickBindOptions(WebDriver driver)  {
		BrowserActions.click(driver, btnBindOptions,"BindOptions");
		return this;
	}
	public BusinessownersLinePage clickBuildings(WebDriver driver)  {
		BrowserActions.click(driver, btnBuildings,"Buildings");
		return this;
	}
	public BusinessownersLinePage clickLiability(WebDriver driver)  {
		BrowserActions.click(driver, chkLiability,"Liability");
		return this;
	}
	public BusinessownersLinePage clickReleaseLock(WebDriver driver)  {
		BrowserActions.click(driver, btnReleaseLock,"ReleaseLock");
		return this;
	}
	public BusinessownersLinePage selectGlassDeductible(WebDriver driver,String GlassDeductible)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpGlassDeductible,GlassDeductible,"GlassDeductible");
		return this;
	}
	public BusinessownersLinePage clickEnableDisable(WebDriver driver)  {
		BrowserActions.click(driver, btnEnableDisable,"EnableDisable");
		return this;
	}
	public BusinessownersLinePage clickIssuePolicy(WebDriver driver)  {
		BrowserActions.click(driver, btnIssuePolicy,"IssuePolicy");
		return this;
	}
	public BusinessownersLinePage clickCreateNewProducer(WebDriver driver)  {
		BrowserActions.click(driver, btnCreateNewProducer,"CreateNewProducer");
		return this;
	}
	public BusinessownersLinePage clickAdd(WebDriver driver)  {
		BrowserActions.click(driver, btnAdd,"Add");
		return this;
	}
	public BusinessownersLinePage clickForms(WebDriver driver)  {
		BrowserActions.click(driver, btnForms,"Forms");
		return this;
	}
	public BusinessownersLinePage clickPolicyPeriodSelector(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyPeriodSelector,"PolicyPeriodSelector");
		return this;
	}
	public BusinessownersLinePage clickNewmail(WebDriver driver)  {
		BrowserActions.click(driver, btnNewmail,"Newmail");
		return this;
	}
	public BusinessownersLinePage clickGetMotorVehicleReports(WebDriver driver)  {
		BrowserActions.click(driver, btnGetMotorVehicleReports,"GetMotorVehicleReports");
		return this;
	}
	public BusinessownersLinePage clickQualification(WebDriver driver)  {
		BrowserActions.click(driver, btnQualification,"Qualification");
		return this;
	}
	public BusinessownersLinePage clickNotes(WebDriver driver)  {
		BrowserActions.click(driver, btnNotes,"Notes");
		return this;
	}
	public BusinessownersLinePage clickQuote_2(WebDriver driver)  {
		BrowserActions.click(driver, btnQuote_2,"Quote_2");
		return this;
	}
	public BusinessownersLinePage clickQuote_1(WebDriver driver)  {
		BrowserActions.click(driver, btnQuote_1,"Quote_1");
		return this;
	}
	public BusinessownersLinePage selectOptionalCoveragesDeductible(WebDriver driver,String OptionalCoveragesDeductible)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpOptionalCoveragesDeductible,OptionalCoveragesDeductible,"OptionalCoveragesDeductible");
		return this;
	}
	public BusinessownersLinePage clickGetInspectionLossControl(WebDriver driver)  {
		BrowserActions.click(driver, btnGetInspectionLossControl,"GetInspectionLossControl");
		return this;
	}
	public BusinessownersLinePage clickParticipants(WebDriver driver)  {
		BrowserActions.click(driver, btnParticipants,"Participants");
		return this;
	}
	public BusinessownersLinePage clickCreate(WebDriver driver)  {
		BrowserActions.click(driver, btnCreate,"Create");
		return this;
	}
	public BusinessownersLinePage clickBOP0012415250(WebDriver driver)  {
		BrowserActions.click(driver, btnBOP0012415250,"BOP0012415250");
		return this;
	}
	public BusinessownersLinePage clickReviewandapprove(WebDriver driver)  {
		BrowserActions.click(driver, btnReviewandapprove,"Reviewandapprove");
		return this;
	}
	public BusinessownersLinePage selectEffectiveDate(WebDriver driver,String EffectiveDate)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpEffectiveDate,EffectiveDate,"EffectiveDate");
		return this;
	}
	public BusinessownersLinePage clickLegalreview(WebDriver driver)  {
		BrowserActions.click(driver, btnLegalreview,"Legalreview");
		return this;
	}
	public BusinessownersLinePage clickNewDocument(WebDriver driver)  {
		BrowserActions.click(driver, btnNewDocument,"NewDocument");
		return this;
	}
	public BusinessownersLinePage clickPolicynotification(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicynotification,"Policynotification");
		return this;
	}
	public BusinessownersLinePage clickSpecialCoveragePackages(WebDriver driver)  {
		BrowserActions.click(driver, chkSpecialCoveragePackages,"SpecialCoveragePackages");
		return this;
	}
	public BusinessownersLinePage clickUploaddocuments(WebDriver driver)  {
		BrowserActions.click(driver, btnUploaddocuments,"Uploaddocuments");
		return this;
	}
	public BusinessownersLinePage clickFinish(WebDriver driver)  {
		BrowserActions.click(driver, btnFinish,"Finish");
		return this;
	}
	public BusinessownersLinePage selectPremisesMedicalExpenseLimit(WebDriver driver,String PremisesMedicalExpenseLimit)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPremisesMedicalExpenseLimit,PremisesMedicalExpenseLimit,"PremisesMedicalExpenseLimit");
		return this;
	}
	public BusinessownersLinePage clickGoto(WebDriver driver)  {
		BrowserActions.click(driver, btnGoto,"Goto");
		return this;
	}
	public BusinessownersLinePage clickTenantsFireLiability(WebDriver driver)  {
		BrowserActions.click(driver, chkTenantsFireLiability,"TenantsFireLiability");
		return this;
	}
	public BusinessownersLinePage clickProductDefinition(WebDriver driver)  {
		BrowserActions.click(driver, btnProductDefinition,"ProductDefinition");
		return this;
	}
	public BusinessownersLinePage clickGetInspectionOutsideService(WebDriver driver)  {
		BrowserActions.click(driver, btnGetInspectionOutsideService,"GetInspectionOutsideService");
		return this;
	}
	public BusinessownersLinePage clickUnderwriterReview(WebDriver driver)  {
		BrowserActions.click(driver, btnUnderwriterReview,"UnderwriterReview");
		return this;
	}
	public BusinessownersLinePage clickMeetwithInsured(WebDriver driver)  {
		BrowserActions.click(driver, btnMeetwithInsured,"MeetwithInsured");
		return this;
	}
	public BusinessownersLinePage click30daydiary(WebDriver driver)  {
		BrowserActions.click(driver, btn30daydiary,"30daydiary");
		return this;
	}
	public BusinessownersLinePage clickOfferings(WebDriver driver)  {
		BrowserActions.click(driver, btnOfferings,"Offerings");
		return this;
	}
	public BusinessownersLinePage clickPolicyReviewRenewal(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyReviewRenewal,"PolicyReviewRenewal");
		return this;
	}
	public BusinessownersLinePage clickNewNote(WebDriver driver)  {
		BrowserActions.click(driver, btnNewNote,"NewNote");
		return this;
	}
	public BusinessownersLinePage clickSidebySideQuoting(WebDriver driver)  {
		BrowserActions.click(driver, btnSidebySideQuoting,"SidebySideQuoting");
		return this;
	}
	public BusinessownersLinePage clickRiskAnalysis(WebDriver driver)  {
		BrowserActions.click(driver, btnRiskAnalysis,"RiskAnalysis");
		return this;
	}
	public BusinessownersLinePage clickMeetwithProducerAgency(WebDriver driver)  {
		BrowserActions.click(driver, btnMeetwithProducerAgency,"MeetwithProducerAgency");
		return this;
	}
	public BusinessownersLinePage clickCollectCreditCard(WebDriver driver)  {
		BrowserActions.click(driver, btnCollectCreditCard,"CollectCreditCard");
		return this;
	}
	public BusinessownersLinePage clickSupplemental(WebDriver driver)  {
		BrowserActions.click(driver, btnSupplemental,"Supplemental");
		return this;
	}
	public BusinessownersLinePage clickRatiooutofrange(WebDriver driver)  {
		BrowserActions.click(driver, btnRatiooutofrange,"Ratiooutofrange");
		return this;
	}
	public BusinessownersLinePage clickFullApp(WebDriver driver)  {
		BrowserActions.click(driver, btnFullApp,"FullApp");
		return this;
	}
	public BusinessownersLinePage clickGL0012336260(WebDriver driver)  {
		BrowserActions.click(driver, btnGL0012336260,"GL0012336260");
		return this;
	}
	public BusinessownersLinePage clickEmployeeDishonesty(WebDriver driver)  {
		BrowserActions.click(driver, chkEmployeeDishonesty,"EmployeeDishonesty");
		return this;
	}
	public BusinessownersLinePage clickPolicyReview(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyReview,"PolicyReview");
		return this;
	}
	public BusinessownersLinePage clickDiagnosticData(WebDriver driver)  {
		BrowserActions.click(driver, btnDiagnosticData,"DiagnosticData");
		return this;
	}
	public BusinessownersLinePage clickOOSEPeriodSelector(WebDriver driver)  {
		BrowserActions.click(driver, btnOOSEPeriodSelector,"OOSEPeriodSelector");
		return this;
	}
	public BusinessownersLinePage clickManuallyrateandquotepolicy(WebDriver driver)  {
		BrowserActions.click(driver, btnManuallyrateandquotepolicy,"Manuallyrateandquotepolicy");
		return this;
	}
	public BusinessownersLinePage clickHistory(WebDriver driver)  {
		BrowserActions.click(driver, btnHistory,"History");
		return this;
	}
	public BusinessownersLinePage clickReminder(WebDriver driver)  {
		BrowserActions.click(driver, btnReminder,"Reminder");
		return this;
	}
	public BusinessownersLinePage clickEdit(WebDriver driver)  {
		BrowserActions.click(driver, btnEdit,"Edit");
		return this;
	}
	public BusinessownersLinePage clickNonownedAutoLiability(WebDriver driver)  {
		BrowserActions.click(driver, chkNonownedAutoLiability,"NonownedAutoLiability");
		return this;
	}
	public BusinessownersLinePage clickWithdrawTransaction(WebDriver driver)  {
		BrowserActions.click(driver, btnWithdrawTransaction,"WithdrawTransaction");
		return this;
	}
	public BusinessownersLinePage clickPolicyInfo(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyInfo,"PolicyInfo");
		return this;
	}
	public BusinessownersLinePage clickHiredAuto(WebDriver driver)  {
		BrowserActions.click(driver, chkHiredAuto,"HiredAuto");
		return this;
	}
	public BusinessownersLinePage clickVersions(WebDriver driver)  {
		BrowserActions.click(driver, btnVersions,"Versions");
		return this;
	}
	public BusinessownersLinePage clickModifiers(WebDriver driver)  {
		BrowserActions.click(driver, btnModifiers,"Modifiers");
		return this;
	}
	public BusinessownersLinePage clickAccountFile(WebDriver driver)  {
		BrowserActions.click(driver, btnAccountFile,"AccountFile");
		return this;
	}
	public BusinessownersLinePage clickBusinessownersLine(WebDriver driver)  {
		BrowserActions.click(driver, btnBusinessownersLine,"BusinessownersLine");
		return this;
	}
	public BusinessownersLinePage clickRemove(WebDriver driver)  {
		BrowserActions.click(driver, btnRemove,"Remove");
		return this;
	}
	public BusinessownersLinePage clickReviewnewmail(WebDriver driver)  {
		BrowserActions.click(driver, btnReviewnewmail,"Reviewnewmail");
		return this;
	}
	public BusinessownersLinePage clickGroup(WebDriver driver)  {
		BrowserActions.click(driver, btnGroup,"Group");
		return this;
	}
	public BusinessownersLinePage clickCancelasplitpolicy(WebDriver driver)  {
		BrowserActions.click(driver, btnCancelasplitpolicy,"Cancelasplitpolicy");
		return this;
	}
	public BusinessownersLinePage clickGetAuditOutsideService(WebDriver driver)  {
		BrowserActions.click(driver, btnGetAuditOutsideService,"GetAuditOutsideService");
		return this;
	}
	public BusinessownersLinePage clickCopyData(WebDriver driver)  {
		BrowserActions.click(driver, btnCopyData,"CopyData");
		return this;
	}
	public BusinessownersLinePage selectBlanket(WebDriver driver,String Blanket)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpBlanket,Blanket,"Blanket");
		return this;
	}
	public BusinessownersLinePage clickNewAuditAssignment(WebDriver driver)  {
		BrowserActions.click(driver, btnNewAuditAssignment,"NewAuditAssignment");
		return this;
	}
	public BusinessownersLinePage clickRewritetoNewAccount(WebDriver driver)  {
		BrowserActions.click(driver, btnRewritetoNewAccount,"RewritetoNewAccount");
		return this;
	}
	public BusinessownersLinePage clickClose(WebDriver driver)  {
		BrowserActions.click(driver, btnClose,"Close");
		return this;
	}
	public BusinessownersLinePage clickReview30dayUWPeriod(WebDriver driver)  {
		BrowserActions.click(driver, btnReview30dayUWPeriod,"Review30dayUWPeriod");
		return this;
	}
	public BusinessownersLinePage clickPolicyVersions(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyVersions,"PolicyVersions");
		return this;
	}
	public BusinessownersLinePage clickReview60dayUWPeriod(WebDriver driver)  {
		BrowserActions.click(driver, btnReview60dayUWPeriod,"Review60dayUWPeriod");
		return this;
	}
	public BusinessownersLinePage clickEditPolicyTransaction(WebDriver driver)  {
		BrowserActions.click(driver, btnEditPolicyTransaction,"EditPolicyTransaction");
		return this;
	}
	public BusinessownersLinePage clickNewActivity(WebDriver driver)  {
		BrowserActions.click(driver, btnNewActivity,"NewActivity");
		return this;
	}
	public BusinessownersLinePage clickCancel(WebDriver driver)  {
		BrowserActions.click(driver, btnCancel,"Cancel");
		return this;
	}
	public BusinessownersLinePage clickCloseOptions(WebDriver driver)  {
		BrowserActions.click(driver, btnCloseOptions,"CloseOptions");
		return this;
	}
	public BusinessownersLinePage clickPolicywidePropertyDeductible(WebDriver driver)  {
		BrowserActions.click(driver, chkPolicywidePropertyDeductible,"PolicywidePropertyDeductible");
		return this;
	}
	public BusinessownersLinePage clickPolicyContract(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyContract,"PolicyContract");
		return this;
	}
	public BusinessownersLinePage clickPolicyFile(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyFile,"PolicyFile");
		return this;
	}
	public BusinessownersLinePage selectSmallBusinessType(WebDriver driver,String SmallBusinessType)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpSmallBusinessType,SmallBusinessType,true,"SmallBusinessType");
		return this;
	}
	public BusinessownersLinePage clickVerifycoverage(WebDriver driver)  {
		BrowserActions.click(driver, btnVerifycoverage,"Verifycoverage");
		return this;
	}
	public BusinessownersLinePage clickRequest(WebDriver driver)  {
		BrowserActions.click(driver, btnRequest,"Request");
		return this;
	}
	public BusinessownersLinePage clickGetCreditReports(WebDriver driver)  {
		BrowserActions.click(driver, btnGetCreditReports,"GetCreditReports");
		return this;
	}
	public BusinessownersLinePage enterCoveragesin(WebDriver driver,String Coveragesin) {
		BrowserActions.type(driver, inpCoveragesin,Coveragesin, "Coveragesin");
		return this;
	}
	public BusinessownersLinePage clickDecline(WebDriver driver)  {
		BrowserActions.click(driver, btnDecline,"Decline");
		return this;
	}
	public BusinessownersLinePage clickWizardMenuActions(WebDriver driver)  {
		BrowserActions.click(driver, btnWizardMenuActions,"WizardMenuActions");
		return this;
	}
	public BusinessownersLinePage clickSubManager(WebDriver driver)  {
		BrowserActions.click(driver, btnSubManager,"SubManager");
		return this;
	}

	public BusinessownersLinePage clickAddCoverage(WebDriver driver) {
		BrowserActions.click(driver, btnAddCoverages, "Add Coverage Button");
		return this;
	}

	public BusinessownersLinePage clickClearButton(WebDriver driver) {
		BrowserActions.click(driver, btnClear, "Clear Button");
		return this;
	}

	public BusinessownersLinePage clickAddExclusionsAndCondition(WebDriver driver) {
		BrowserActions.click(driver, btnAddExclusionsAndCondition, "Add Coverage Button");
		return this;
	}

	public class NewAdditionalInsuredPage extends LoadableComponent<NewAdditionalInsuredPage> {

		WebDriver driver;
		private boolean isPageLoaded;
		public ElementLayer elementLayer;
		String elementObject;
		HashMap<String, String> getPageObjects;
		public List<Object> pageFactoryKey = new ArrayList<Object>();
		public  List<String> pageFactoryValue = new ArrayList<String>();

		@IFindBy(how = How.CSS, using = "#NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactRoleDetailCardTab", AI = false)
		public WebElement btnContactDetail;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-HomePhone-GlobalPhoneInputSet-PhoneDisplay']", AI = false)
		public WebElement inpHomePhone_2;

		@IFindBy(how = How.CSS, using = "#NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-LinkedAddressInputSet-LinkAddressMenu-EditAddress>div[role='menuitem']", AI = false)
		public WebElement btnEditaddress;

		@IFindBy(how = How.CSS, using = "#NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-LinkedAddressInputSet-LinkAddressMenu-LinkAddressMenuMenuIcon>div[role='button']", AI = false)
		public WebElement btnLinkAddressMenuMenuIcon;

		@IFindBy(how = How.CSS, using = "#NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-LinkedAddressInputSet-LinkAddressMenu-0-contactDetail>div[role='menuitem']", AI = false)
		public WebElement btnFaeDickensPrimaryNamedInsured;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-GlobalPersonNameInputSet-LastName']", AI = false)
		public WebElement inpLastname;

		@IFindBy(how = How.CSS, using = "select[name='NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-PrimaryPhone']", AI = false)
		public WebElement drpPrimaryPhone;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressDescription']", AI = false)
		public WebElement inpAddressDescription;

		@IFindBy(how = How.CSS, using = "#NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-PostalCode-AutoFillIcon", AI = false)
		public WebElement btnAutoFillIcon_7;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-County']", AI = false)
		public WebElement inpCounty;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-FaxPhone-GlobalPhoneInputSet-NationalSubscriberNumber']", AI = false)
		public WebElement inpFaxPhone;

		@IFindBy(how = How.CSS, using = "select[name='NewAdditionalInsuredPopup-ContactDetailScreen-AdditionalInsuredInfoDV-Type']", AI = false)
		public WebElement drpType;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-HomePhone-GlobalPhoneInputSet-NationalSubscriberNumber']", AI = false)
		public WebElement inpHomePhone;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-EmailAddress2']", AI = false)
		public WebElement inpSecondaryEmail;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-GlobalPersonNameInputSet-FirstName']", AI = false)
		public WebElement inpFirstname;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-CellPhone-GlobalPhoneInputSet-NationalSubscriberNumber']", AI = false)
		public WebElement inpMobilePhone;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine3']", AI = false)
		public WebElement inpAddress3;

		@IFindBy(how = How.CSS, using = "select[name='NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-HomePhone-GlobalPhoneInputSet-CountryCode']", AI = false)
		public WebElement drpHomePhoneRegionCode;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine1']", AI = false)
		public WebElement inpAddress1;

		@IFindBy(how = How.CSS, using = "select[name='NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressType']", AI = false)
		public WebElement drpAddressType;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine2']", AI = false)
		public WebElement inpAddress2;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-OfficialIDInputSet-OfficialIDDV_Input']", AI = false)
		public WebElement inpSSN;

		@IFindBy(how = How.CSS, using = "#NewAdditionalInsuredPopup-__crumb__", AI = false)
		public WebElement btnReturntoBusinessownersLine;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-LinkedAddressInputSet-LinkAddressMenu']", AI = false)
		public WebElement inpAddress;

		@IFindBy(how = How.CSS, using = "select[name='NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-ContactCurrency-ContactCurrencyInputSet-PreferredSettlementCurrency']", AI = false)
		public WebElement drpPreferredCurrency;

		@IFindBy(how = How.CSS, using = "#NewAdditionalInsuredPopup-ContactDetailScreen-CheckForDuplicates>div[role='button']", AI = false)
		public WebElement btnCheckforDuplicates;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-PostalCode']", AI = false)
		public WebElement inpZIPCode;

		@IFindBy(how = How.CSS, using = "#NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-City-AutoFillIcon", AI = false)
		public WebElement btnAutoFillIcon;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-WorkPhone-GlobalPhoneInputSet-Extension']", AI = false)
		public WebElement inpWorkPhoneExtension;

		@IFindBy(how = How.CSS, using = "select[name='NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-FaxPhone-GlobalPhoneInputSet-CountryCode']", AI = false)
		public WebElement drpFaxPhoneRegionCode;

		@IFindBy(how = How.CSS, using = "select[name='NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-CellPhone-GlobalPhoneInputSet-CountryCode']", AI = false)
		public WebElement drpMobilePhoneRegionCode;

		@IFindBy(how = How.CSS, using = "select[name='NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-GlobalPersonNameInputSet-Prefix']", AI = false)
		public WebElement drpPrefix;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-GlobalPersonNameInputSet-NameSummary']", AI = false)
		public WebElement inpName;

		@IFindBy(how = How.CSS, using = "select[name='NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-Country']", AI = false)
		public WebElement drpCountry;

		@IFindBy(how = How.CSS, using = "select[name='NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-GlobalPersonNameInputSet-Suffix']", AI = false)
		public WebElement drpSuffix;

		@IFindBy(how = How.CSS, using = "select[name='NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-State']", AI = false)
		public WebElement drpState;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-FaxPhone-GlobalPhoneInputSet-PhoneDisplay']", AI = false)
		public WebElement inpFaxPhone_5;

		@IFindBy(how = How.CSS, using = "select[name='NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-MaritalStatus']", AI = false)
		public WebElement drpMaritalStatus;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-HomePhone-GlobalPhoneInputSet-Extension']", AI = false)
		public WebElement inpHomePhoneExtension;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-GlobalPersonNameInputSet-Particle']", AI = false)
		public WebElement inpParticle;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-CellPhone-GlobalPhoneInputSet-Extension']", AI = false)
		public WebElement inpMobilePhoneExtension;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-City']", AI = false)
		public WebElement inpCity;

		@IFindBy(how = How.CSS, using = "select[name='NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-LicenseInputSet-LicenseState']", AI = false)
		public WebElement drpLicenseState;

		@IFindBy(how = How.CSS, using = "select[name='NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-WorkPhone-GlobalPhoneInputSet-CountryCode']", AI = false)
		public WebElement drpWorkPhoneRegionCode;

		@IFindBy(how = How.CSS, using = "#NewAdditionalInsuredPopup-ContactDetailScreen-ForceDupCheckUpdate>div[role='button']", AI = false)
		public WebElement btnOK;

		@IFindBy(how = How.CSS, using = "#NewAdditionalInsuredPopup-ContactDetailScreen-Update>div[role='button']", AI = false)
		public WebElement btnOK_1;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-WorkPhone-GlobalPhoneInputSet-PhoneDisplay']", AI = false)
		public WebElement inpWorkPhone_3;

		@IFindBy(how = How.CSS, using = "div[id$='ContactDetailScreen-ttlBar']", AI = false)
		public WebElement lblTtlBar;

		@IFindBy(how = How.CSS, using = "#NewAdditionalInsuredPopup-ContactDetailScreen-Edit>div[role='button']", AI = false)
		public WebElement btnEdit;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-EmailAddress1']", AI = false)
		public WebElement inpPrimaryEmail;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-DateOfBirth']", AI = false)
		public WebElement inpDateofBirth;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressSummary']", AI = false)
		public WebElement inpAddress_6;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-GlobalPersonNameInputSet-MiddleName']", AI = false)
		public WebElement inpMiddlename;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-CellPhone-GlobalPhoneInputSet-PhoneDisplay']", AI = false)
		public WebElement inpMobilePhone_4;

		@IFindBy(how = How.CSS, using = "#NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-LinkedAddressInputSet-LinkAddressMenu-0-contactDetail-PrimaryAddress>div[role='menuitem']", AI = false)
		public WebElement btnPrimaryAddress;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-LicenseInputSet-LicenseNumber']", AI = false)
		public WebElement inpLicense;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-WorkPhone-GlobalPhoneInputSet-NationalSubscriberNumber']", AI = false)
		public WebElement inpWorkPhone;

		@IFindBy(how = How.CSS, using = "#NewAdditionalInsuredPopup-ContactDetailScreen-Cancel>div[role='button']", AI = false)
		public WebElement btnCancel;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-FaxPhone-GlobalPhoneInputSet-Extension']", AI = false)
		public WebElement inpFaxPhoneExtension;

		@IFindBy(how = How.CSS, using = "#NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-DateOfBirth_dateIcon", AI = false)
		public WebElement btnDateofBirthDateIcon;

		public NewAdditionalInsuredPage(){
		}

		public NewAdditionalInsuredPage(WebDriver driver) throws Exception{
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
		}public NewAdditionalInsuredPage clickContactDetail(WebDriver driver)  {
			BrowserActions.click(driver, btnContactDetail,"ContactDetail");
			return this;
		}
		public NewAdditionalInsuredPage enterHomePhone_2(WebDriver driver,String HomePhone_2) {
			BrowserActions.type(driver, inpHomePhone_2,HomePhone_2, "HomePhone_2");
			return this;
		}
		public NewAdditionalInsuredPage clickEditaddress(WebDriver driver)  {
			BrowserActions.click(driver, btnEditaddress,"Editaddress");
			return this;
		}
		public NewAdditionalInsuredPage clickLinkAddressMenuMenuIcon(WebDriver driver)  {
			BrowserActions.click(driver, btnLinkAddressMenuMenuIcon,"LinkAddressMenuMenuIcon");
			return this;
		}
		public NewAdditionalInsuredPage clickFaeDickensPrimaryNamedInsured(WebDriver driver)  {
			BrowserActions.click(driver, btnFaeDickensPrimaryNamedInsured,"FaeDickensPrimaryNamedInsured");
			return this;
		}
		public NewAdditionalInsuredPage enterLastname(WebDriver driver,String Lastname) {
			BrowserActions.type(driver, inpLastname,Lastname, "Lastname");
			return this;
		}
		public NewAdditionalInsuredPage selectPrimaryPhone(WebDriver driver,String PrimaryPhone)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpPrimaryPhone,PrimaryPhone,"PrimaryPhone");
			return this;
		}
		public NewAdditionalInsuredPage enterAddressDescription(WebDriver driver,String AddressDescription) {
			BrowserActions.type(driver, inpAddressDescription,AddressDescription, "AddressDescription");
			return this;
		}
		public NewAdditionalInsuredPage clickAutoFillIcon_7(WebDriver driver)  {
			BrowserActions.click(driver, btnAutoFillIcon_7,"AutoFillIcon_7");
			return this;
		}
		public NewAdditionalInsuredPage enterCounty(WebDriver driver,String County) {
			BrowserActions.type(driver, inpCounty,County, "County");
			return this;
		}
		public NewAdditionalInsuredPage enterFaxPhone(WebDriver driver,String FaxPhone) {
			BrowserActions.type(driver, inpFaxPhone,FaxPhone, "FaxPhone");
			return this;
		}
		public NewAdditionalInsuredPage selectType(WebDriver driver,String Type)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpType,Type,"Type");
			return this;
		}
		public NewAdditionalInsuredPage enterHomePhone(WebDriver driver,String HomePhone) {
			BrowserActions.type(driver, inpHomePhone,HomePhone, "HomePhone");
			return this;
		}
		public NewAdditionalInsuredPage enterSecondaryEmail(WebDriver driver,String SecondaryEmail) {
			BrowserActions.type(driver, inpSecondaryEmail,SecondaryEmail, "SecondaryEmail");
			return this;
		}
		public NewAdditionalInsuredPage enterFirstname(WebDriver driver,String Firstname) {
			BrowserActions.type(driver, inpFirstname,Firstname, "Firstname");
			return this;
		}
		public NewAdditionalInsuredPage enterMobilePhone(WebDriver driver,String MobilePhone) {
			BrowserActions.type(driver, inpMobilePhone,MobilePhone, "MobilePhone");
			return this;
		}
		public NewAdditionalInsuredPage enterAddress3(WebDriver driver,String Address3) {
			BrowserActions.type(driver, inpAddress3,Address3, "Address3");
			return this;
		}
		public NewAdditionalInsuredPage selectHomePhoneRegionCode(WebDriver driver,String HomePhoneRegionCode)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpHomePhoneRegionCode,HomePhoneRegionCode,"HomePhoneRegionCode");
			return this;
		}
		public NewAdditionalInsuredPage enterAddress1(WebDriver driver,String Address1) {
			BrowserActions.type(driver, inpAddress1,Address1, "Address1");
			return this;
		}
		public NewAdditionalInsuredPage selectAddressType(WebDriver driver,String AddressType)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpAddressType,AddressType,"AddressType");
			return this;
		}
		public NewAdditionalInsuredPage enterAddress2(WebDriver driver,String Address2) {
			BrowserActions.type(driver, inpAddress2,Address2, "Address2");
			return this;
		}
		public NewAdditionalInsuredPage enterSSN(WebDriver driver,String SSN) {
			BrowserActions.type(driver, inpSSN,SSN, "SSN");
			return this;
		}
		public NewAdditionalInsuredPage clickReturntoBusinessownersLine(WebDriver driver)  {
			BrowserActions.click(driver, btnReturntoBusinessownersLine,"ReturntoBusinessownersLine");
			return this;
		}
		public NewAdditionalInsuredPage enterAddress(WebDriver driver,String Address) {
			BrowserActions.type(driver, inpAddress,Address, "Address");
			return this;
		}
		public NewAdditionalInsuredPage selectPreferredCurrency(WebDriver driver,String PreferredCurrency)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpPreferredCurrency,PreferredCurrency,"PreferredCurrency");
			return this;
		}
		public NewAdditionalInsuredPage clickCheckforDuplicates(WebDriver driver)  {
			BrowserActions.click(driver, btnCheckforDuplicates,"CheckforDuplicates");
			return this;
		}
		public NewAdditionalInsuredPage enterZIPCode(WebDriver driver,String ZIPCode) {
			BrowserActions.type(driver, inpZIPCode,ZIPCode, "ZIPCode");
			return this;
		}
		public NewAdditionalInsuredPage clickAutoFillIcon(WebDriver driver)  {
			BrowserActions.click(driver, btnAutoFillIcon,"AutoFillIcon");
			return this;
		}
		public NewAdditionalInsuredPage enterWorkPhoneExtension(WebDriver driver,String WorkPhoneExtension) {
			BrowserActions.type(driver, inpWorkPhoneExtension,WorkPhoneExtension, "WorkPhoneExtension");
			return this;
		}
		public NewAdditionalInsuredPage selectFaxPhoneRegionCode(WebDriver driver,String FaxPhoneRegionCode)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpFaxPhoneRegionCode,FaxPhoneRegionCode,"FaxPhoneRegionCode");
			return this;
		}
		public NewAdditionalInsuredPage selectMobilePhoneRegionCode(WebDriver driver,String MobilePhoneRegionCode)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpMobilePhoneRegionCode,MobilePhoneRegionCode,"MobilePhoneRegionCode");
			return this;
		}
		public NewAdditionalInsuredPage selectPrefix(WebDriver driver,String Prefix)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpPrefix,Prefix,"Prefix");
			return this;
		}
		public NewAdditionalInsuredPage enterName(WebDriver driver,String Name) {
			BrowserActions.type(driver, inpName,Name, "Name");
			return this;
		}
		public NewAdditionalInsuredPage selectCountry(WebDriver driver,String Country)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpCountry,Country,"Country");
			return this;
		}
		public NewAdditionalInsuredPage selectSuffix(WebDriver driver,String Suffix)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpSuffix,Suffix,"Suffix");
			return this;
		}
		public NewAdditionalInsuredPage selectState(WebDriver driver,String State)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpState,State,"State");
			return this;
		}
		public NewAdditionalInsuredPage enterFaxPhone_5(WebDriver driver,String FaxPhone_5) {
			BrowserActions.type(driver, inpFaxPhone_5,FaxPhone_5, "FaxPhone_5");
			return this;
		}
		public NewAdditionalInsuredPage selectMaritalStatus(WebDriver driver,String MaritalStatus)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpMaritalStatus,MaritalStatus,"MaritalStatus");
			return this;
		}
		public NewAdditionalInsuredPage enterHomePhoneExtension(WebDriver driver,String HomePhoneExtension) {
			BrowserActions.type(driver, inpHomePhoneExtension,HomePhoneExtension, "HomePhoneExtension");
			return this;
		}
		public NewAdditionalInsuredPage enterParticle(WebDriver driver,String Particle) {
			BrowserActions.type(driver, inpParticle,Particle, "Particle");
			return this;
		}
		public NewAdditionalInsuredPage enterMobilePhoneExtension(WebDriver driver,String MobilePhoneExtension) {
			BrowserActions.type(driver, inpMobilePhoneExtension,MobilePhoneExtension, "MobilePhoneExtension");
			return this;
		}
		public NewAdditionalInsuredPage enterCity(WebDriver driver,String City) {
			BrowserActions.type(driver, inpCity,City, "City");
			return this;
		}
		public NewAdditionalInsuredPage selectLicenseState(WebDriver driver,String LicenseState)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpLicenseState,LicenseState,"LicenseState");
			return this;
		}
		public NewAdditionalInsuredPage selectWorkPhoneRegionCode(WebDriver driver,String WorkPhoneRegionCode)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpWorkPhoneRegionCode,WorkPhoneRegionCode,"WorkPhoneRegionCode");
			return this;
		}
		public NewAdditionalInsuredPage clickOK(WebDriver driver)  {
			BrowserActions.click(driver, btnOK,"OK");
			return this;
		}
		public NewAdditionalInsuredPage clickOK_1(WebDriver driver)  {
			BrowserActions.click(driver, btnOK_1,"OK_1");
			return this;
		}
		public NewAdditionalInsuredPage enterWorkPhone_3(WebDriver driver,String WorkPhone_3) {
			BrowserActions.type(driver, inpWorkPhone_3,WorkPhone_3, "WorkPhone_3");
			return this;
		}
		public NewAdditionalInsuredPage clickEdit(WebDriver driver)  {
			BrowserActions.click(driver, btnEdit,"Edit");
			return this;
		}
		public NewAdditionalInsuredPage enterPrimaryEmail(WebDriver driver,String PrimaryEmail) {
			BrowserActions.type(driver, inpPrimaryEmail,PrimaryEmail, "PrimaryEmail");
			return this;
		}
		public NewAdditionalInsuredPage enterDateofBirth(WebDriver driver,String DateofBirth) {
			BrowserActions.type(driver, inpDateofBirth,DateofBirth, "DateofBirth");
			return this;
		}
		public NewAdditionalInsuredPage enterAddress_6(WebDriver driver,String Address_6) {
			BrowserActions.type(driver, inpAddress_6,Address_6, "Address_6");
			return this;
		}
		public NewAdditionalInsuredPage enterMiddlename(WebDriver driver,String Middlename) {
			BrowserActions.type(driver, inpMiddlename,Middlename, "Middlename");
			return this;
		}
		public NewAdditionalInsuredPage enterMobilePhone_4(WebDriver driver,String MobilePhone_4) {
			BrowserActions.type(driver, inpMobilePhone_4,MobilePhone_4, "MobilePhone_4");
			return this;
		}
		public NewAdditionalInsuredPage clickPrimaryAddress(WebDriver driver)  {
			BrowserActions.click(driver, btnPrimaryAddress,"PrimaryAddress");
			return this;
		}
		public NewAdditionalInsuredPage enterLicense(WebDriver driver,String License) {
			BrowserActions.type(driver, inpLicense,License, "License");
			return this;
		}
		public NewAdditionalInsuredPage enterWorkPhone(WebDriver driver,String WorkPhone) {
			BrowserActions.type(driver, inpWorkPhone,WorkPhone, "WorkPhone");
			return this;
		}
		public NewAdditionalInsuredPage clickCancel(WebDriver driver)  {
			BrowserActions.click(driver, btnCancel,"Cancel");
			return this;
		}
		public NewAdditionalInsuredPage enterFaxPhoneExtension(WebDriver driver,String FaxPhoneExtension) {
			BrowserActions.type(driver, inpFaxPhoneExtension,FaxPhoneExtension, "FaxPhoneExtension");
			return this;
		}
		public NewAdditionalInsuredPage clickDateofBirthDateIcon(WebDriver driver)  {
			BrowserActions.click(driver, btnDateofBirthDateIcon,"DateofBirthDateIcon");
			return this;
		}
	}

	public class SearchCoveragesPage extends LoadableComponent<SearchCoveragesPage> {

		WebDriver driver;
		private boolean isPageLoaded;
		public ElementLayer elementLayer;
		String elementObject;
		HashMap<String, String> getPageObjects;
		public  List<Object> pageFactoryKey = new ArrayList<Object>();
		public  List<String> pageFactoryValue = new ArrayList<String>();

		@IFindBy(how = How.CSS, using = "input[name='CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchResultsLV-6-Coverage']", AI = false)
		public WebElement inpCoverage_16;

		@IFindBy(how = How.CSS, using = "input[name='CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchResultsLV-7-Coverage']", AI = false)
		public WebElement inpCoverage_19;

		@IFindBy(how = How.CSS, using = "input[name='CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchResultsLV-4-Coverage']", AI = false)
		public WebElement inpCoverage_10;

		@IFindBy(how = How.CSS, using = "input[name='CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchResultsLV-6-Category']", AI = false)
		public WebElement inpCategory_17;

		@IFindBy(how = How.CSS, using = "input[name='CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchResultsLV-5-Coverage']", AI = false)
		public WebElement inpCoverage_13;

		@IFindBy(how = How.CSS, using = "input[name='CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchResultsLV-5-Category']", AI = false)
		public WebElement inpCategory_14;

		@IFindBy(how = How.CSS, using = "select[name='CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchDV-CoverageCategory']", AI = false)
		public WebElement drpCategory;

		@IFindBy(how = How.CSS, using = "input[name='CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchResultsLV-4-Category']", AI = false)
		public WebElement inpCategory_11;

		@IFindBy(how = How.CSS, using = "input[name='CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchResultsLV-0-Category']", AI = false)
		public WebElement inpCategory;

		@IFindBy(how = How.CSS, using = "#CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchResultsLV_tb-AddCoverageButton>div[role='button']", AI = false)
		public WebElement btnAddSelectedCoverages;

		@IFindBy(how = How.CSS, using = "input[name='CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchResultsLV-10-Category']", AI = false)
		public WebElement inpCategory_29;

		@IFindBy(how = How.CSS, using = "input[name='CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchResultsLV-9-Category']", AI = false)
		public WebElement inpCategory_26;

		@IFindBy(how = How.CSS, using = "input[name='CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchResultsLV-8-Category']", AI = false)
		public WebElement inpCategory_23;

		@IFindBy(how = How.CSS, using = "input[name='CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchResultsLV-7-Category']", AI = false)
		public WebElement inpCategory_20;

		@IFindBy(how = How.CSS, using = "input[name='CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchResultsLV-2-Category']", AI = false)
		public WebElement inpCategory_5;

		@IFindBy(how = How.CSS, using = "input[name='CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchResultsLV-1-Category']", AI = false)
		public WebElement inpCategory_2;

		@IFindBy(how = How.CSS, using = "input[name='CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchResultsLV-13-ClauseType']", AI = false)
		public WebElement inpType_39;

		@IFindBy(how = How.CSS, using = "#CoveragePatternSearchPopup-__crumb__", AI = false)
		public WebElement btnReturntoBusinessownersLine;

		@IFindBy(how = How.CSS, using = "input[name='CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchResultsLV-1-Coverage']", AI = false)
		public WebElement inpCoverage_1;

		@IFindBy(how = How.CSS, using = "input[name='CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchResultsLV-14-ClauseType']", AI = false)
		public WebElement inpType_42;

		@IFindBy(how = How.CSS, using = "input[name='CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchResultsLV-13-Category']", AI = false)
		public WebElement inpCategory_38;

		@IFindBy(how = How.CSS, using = "input[name='CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchResultsLV-12-Category']", AI = false)
		public WebElement inpCategory_35;

		@IFindBy(how = How.CSS, using = "input[name='CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchResultsLV-11-Category']", AI = false)
		public WebElement inpCategory_32;

		@IFindBy(how = How.CSS, using = "input[name='CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchResultsLV-2-Coverage']", AI = false)
		public WebElement inpCoverage_4;

		@IFindBy(how = How.CSS, using = "input[name='CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchResultsLV-3-Coverage']", AI = false)
		public WebElement inpCoverage_7;

		@IFindBy(how = How.CSS, using = "input[name='CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchResultsLV-11-ClauseType']", AI = false)
		public WebElement inpType_33;

		@IFindBy(how = How.CSS, using = "input[name='CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchResultsLV-12-ClauseType']", AI = false)
		public WebElement inpType_36;

		@IFindBy(how = How.CSS, using = "input[name='CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchResultsLV-14-Category']", AI = false)
		public WebElement inpCategory_41;

		@IFindBy(how = How.CSS, using = "input[name='CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchResultsLV-10-ClauseType']", AI = false)
		public WebElement inpType_30;

		@IFindBy(how = How.CSS, using = "input[name='CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchResultsLV-6-ClauseType']", AI = false)
		public WebElement inpType_18;

		@IFindBy(how = How.CSS, using = "input[name='CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchResultsLV-7-ClauseType']", AI = false)
		public WebElement inpType_21;

		@IFindBy(how = How.CSS, using = "input[name='CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchResultsLV-9-ClauseType']", AI = false)
		public WebElement inpType_27;

		@IFindBy(how = How.CSS, using = "input[name='CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchResultsLV-8-ClauseType']", AI = false)
		public WebElement inpType_24;

		@IFindBy(how = How.CSS, using = "#CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Search", AI = false)
		public WebElement btnSearch;

		@IFindBy(how = How.CSS, using = "input[name='CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchResultsLV-0-ClauseType']", AI = false)
		public WebElement inpType;

		@IFindBy(how = How.CSS, using = "input[name='CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchResultsLV-14-Coverage']", AI = false)
		public WebElement inpCoverage_40;

		@IFindBy(how = How.CSS, using = "input[name='CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchResultsLV-4-ClauseType']", AI = false)
		public WebElement inpType_12;

		@IFindBy(how = How.CSS, using = "input[name='CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchResultsLV-5-ClauseType']", AI = false)
		public WebElement inpType_15;

		@IFindBy(how = How.CSS, using = "input[name='CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchResultsLV-3-Category']", AI = false)
		public WebElement inpCategory_8;

		@IFindBy(how = How.CSS, using = "#CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Reset", AI = false)
		public WebElement btnReset;

		@IFindBy(how = How.XPATH, using = "//div[contains(text(),'Search Coverages')]", AI = false)
		public WebElement lblTtlBar;

		@IFindBy(how = How.CSS, using = "input[name='CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchDV-Keyword']", AI = false)
		public WebElement inpKeyword;

		@IFindBy(how = How.CSS, using = "input[name='CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchResultsLV-13-Coverage']", AI = false)
		public WebElement inpCoverage_37;

		@IFindBy(how = How.CSS, using = "input[name='CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchResultsLV-11-Coverage']", AI = false)
		public WebElement inpCoverage_31;

		@IFindBy(how = How.CSS, using = "input[name='CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchResultsLV-12-Coverage']", AI = false)
		public WebElement inpCoverage_34;

		@IFindBy(how = How.CSS, using = "input[name='CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchResultsLV-0-Coverage']", AI = false)
		public WebElement inpCoverage;

		@IFindBy(how = How.CSS, using = "input[name='CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchResultsLV-10-Coverage']", AI = false)
		public WebElement inpCoverage_28;

		@IFindBy(how = How.CSS, using = "input[name='CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchResultsLV-8-Coverage']", AI = false)
		public WebElement inpCoverage_22;

		@IFindBy(how = How.CSS, using = "input[name='CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchResultsLV-9-Coverage']", AI = false)
		public WebElement inpCoverage_25;

		@IFindBy(how = How.CSS, using = "input[name='CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchResultsLV-1-ClauseType']", AI = false)
		public WebElement inpType_3;

		@IFindBy(how = How.CSS, using = "input[name='CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchResultsLV-2-ClauseType']", AI = false)
		public WebElement inpType_6;

		@IFindBy(how = How.CSS, using = "input[name='CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchResultsLV-3-ClauseType']", AI = false)
		public WebElement inpType_9;

		@IFindBy(how = How.CSS, using = "input[name$='SearchResultsLV-0-_Checkbox']", AI = false)
		public WebElement chkcoverage;

		public SearchCoveragesPage(){
		}

		public SearchCoveragesPage(WebDriver driver){
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
		}public SearchCoveragesPage enterCoverage_16(WebDriver driver,String Coverage_16) {
			BrowserActions.type(driver, inpCoverage_16,Coverage_16, "Coverage_16");
			return this;
		}
		public SearchCoveragesPage enterCoverage_19(WebDriver driver,String Coverage_19) {
			BrowserActions.type(driver, inpCoverage_19,Coverage_19, "Coverage_19");
			return this;
		}
		public SearchCoveragesPage enterCoverage_10(WebDriver driver,String Coverage_10) {
			BrowserActions.type(driver, inpCoverage_10,Coverage_10, "Coverage_10");
			return this;
		}
		public SearchCoveragesPage enterCategory_17(WebDriver driver,String Category_17) {
			BrowserActions.type(driver, inpCategory_17,Category_17, "Category_17");
			return this;
		}
		public SearchCoveragesPage enterCoverage_13(WebDriver driver,String Coverage_13) {
			BrowserActions.type(driver, inpCoverage_13,Coverage_13, "Coverage_13");
			return this;
		}
		public SearchCoveragesPage enterCategory_14(WebDriver driver,String Category_14) {
			BrowserActions.type(driver, inpCategory_14,Category_14, "Category_14");
			return this;
		}
		public SearchCoveragesPage selectCategory(WebDriver driver,String Category)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpCategory,Category,"Category");
			return this;
		}
		public SearchCoveragesPage enterCategory_11(WebDriver driver,String Category_11) {
			BrowserActions.type(driver, inpCategory_11,Category_11, "Category_11");
			return this;
		}
		public SearchCoveragesPage enterCategory(WebDriver driver,String Category) {
			BrowserActions.type(driver, inpCategory,Category, "Category");
			return this;
		}
		public SearchCoveragesPage clickAddSelectedCoverages(WebDriver driver)  {
			BrowserActions.click(driver, btnAddSelectedCoverages,"AddSelectedCoverages");
			return this;
		}
		public SearchCoveragesPage enterCategory_29(WebDriver driver,String Category_29) {
			BrowserActions.type(driver, inpCategory_29,Category_29, "Category_29");
			return this;
		}
		public SearchCoveragesPage enterCategory_26(WebDriver driver,String Category_26) {
			BrowserActions.type(driver, inpCategory_26,Category_26, "Category_26");
			return this;
		}
		public SearchCoveragesPage enterCategory_23(WebDriver driver,String Category_23) {
			BrowserActions.type(driver, inpCategory_23,Category_23, "Category_23");
			return this;
		}
		public SearchCoveragesPage enterCategory_20(WebDriver driver,String Category_20) {
			BrowserActions.type(driver, inpCategory_20,Category_20, "Category_20");
			return this;
		}
		public SearchCoveragesPage enterCategory_5(WebDriver driver,String Category_5) {
			BrowserActions.type(driver, inpCategory_5,Category_5, "Category_5");
			return this;
		}
		public SearchCoveragesPage enterCategory_2(WebDriver driver,String Category_2) {
			BrowserActions.type(driver, inpCategory_2,Category_2, "Category_2");
			return this;
		}
		public SearchCoveragesPage enterType_39(WebDriver driver,String Type_39) {
			BrowserActions.type(driver, inpType_39,Type_39, "Type_39");
			return this;
		}
		public SearchCoveragesPage clickReturntoBusinessownersLine(WebDriver driver)  {
			BrowserActions.click(driver, btnReturntoBusinessownersLine,"ReturntoBusinessownersLine");
			return this;
		}
		public SearchCoveragesPage enterCoverage_1(WebDriver driver,String Coverage_1) {
			BrowserActions.type(driver, inpCoverage_1,Coverage_1, "Coverage_1");
			return this;
		}
		public SearchCoveragesPage enterType_42(WebDriver driver,String Type_42) {
			BrowserActions.type(driver, inpType_42,Type_42, "Type_42");
			return this;
		}
		public SearchCoveragesPage enterCategory_38(WebDriver driver,String Category_38) {
			BrowserActions.type(driver, inpCategory_38,Category_38, "Category_38");
			return this;
		}
		public SearchCoveragesPage enterCategory_35(WebDriver driver,String Category_35) {
			BrowserActions.type(driver, inpCategory_35,Category_35, "Category_35");
			return this;
		}
		public SearchCoveragesPage enterCategory_32(WebDriver driver,String Category_32) {
			BrowserActions.type(driver, inpCategory_32,Category_32, "Category_32");
			return this;
		}
		public SearchCoveragesPage enterCoverage_4(WebDriver driver,String Coverage_4) {
			BrowserActions.type(driver, inpCoverage_4,Coverage_4, "Coverage_4");
			return this;
		}
		public SearchCoveragesPage enterCoverage_7(WebDriver driver,String Coverage_7) {
			BrowserActions.type(driver, inpCoverage_7,Coverage_7, "Coverage_7");
			return this;
		}
		public SearchCoveragesPage enterType_33(WebDriver driver,String Type_33) {
			BrowserActions.type(driver, inpType_33,Type_33, "Type_33");
			return this;
		}
		public SearchCoveragesPage enterType_36(WebDriver driver,String Type_36) {
			BrowserActions.type(driver, inpType_36,Type_36, "Type_36");
			return this;
		}
		public SearchCoveragesPage enterCategory_41(WebDriver driver,String Category_41) {
			BrowserActions.type(driver, inpCategory_41,Category_41, "Category_41");
			return this;
		}
		public SearchCoveragesPage enterType_30(WebDriver driver,String Type_30) {
			BrowserActions.type(driver, inpType_30,Type_30, "Type_30");
			return this;
		}
		public SearchCoveragesPage enterType_18(WebDriver driver,String Type_18) {
			BrowserActions.type(driver, inpType_18,Type_18, "Type_18");
			return this;
		}
		public SearchCoveragesPage enterType_21(WebDriver driver,String Type_21) {
			BrowserActions.type(driver, inpType_21,Type_21, "Type_21");
			return this;
		}
		public SearchCoveragesPage enterType_27(WebDriver driver,String Type_27) {
			BrowserActions.type(driver, inpType_27,Type_27, "Type_27");
			return this;
		}
		public SearchCoveragesPage enterType_24(WebDriver driver,String Type_24) {
			BrowserActions.type(driver, inpType_24,Type_24, "Type_24");
			return this;
		}
		public SearchCoveragesPage clickSearch(WebDriver driver)  {
			BrowserActions.click(driver, btnSearch,"Search");
			return this;
		}
		public SearchCoveragesPage enterType(WebDriver driver,String Type) {
			BrowserActions.type(driver, inpType,Type, "Type");
			return this;
		}
		public SearchCoveragesPage enterCoverage_40(WebDriver driver,String Coverage_40) {
			BrowserActions.type(driver, inpCoverage_40,Coverage_40, "Coverage_40");
			return this;
		}
		public SearchCoveragesPage enterType_12(WebDriver driver,String Type_12) {
			BrowserActions.type(driver, inpType_12,Type_12, "Type_12");
			return this;
		}
		public SearchCoveragesPage enterType_15(WebDriver driver,String Type_15) {
			BrowserActions.type(driver, inpType_15,Type_15, "Type_15");
			return this;
		}
		public SearchCoveragesPage enterCategory_8(WebDriver driver,String Category_8) {
			BrowserActions.type(driver, inpCategory_8,Category_8, "Category_8");
			return this;
		}
		public SearchCoveragesPage clickReset(WebDriver driver)  {
			BrowserActions.click(driver, btnReset,"Reset");
			return this;
		}
		public SearchCoveragesPage enterKeyword(WebDriver driver,String Keyword) {
			BrowserActions.type(driver, inpKeyword,Keyword, "Keyword");
			return this;
		}
		public SearchCoveragesPage enterCoverage_37(WebDriver driver,String Coverage_37) {
			BrowserActions.type(driver, inpCoverage_37,Coverage_37, "Coverage_37");
			return this;
		}
		public SearchCoveragesPage enterCoverage_31(WebDriver driver,String Coverage_31) {
			BrowserActions.type(driver, inpCoverage_31,Coverage_31, "Coverage_31");
			return this;
		}
		public SearchCoveragesPage enterCoverage_34(WebDriver driver,String Coverage_34) {
			BrowserActions.type(driver, inpCoverage_34,Coverage_34, "Coverage_34");
			return this;
		}
		public SearchCoveragesPage enterCoverage(WebDriver driver,String Coverage) {
			BrowserActions.type(driver, inpCoverage,Coverage, "Coverage");
			return this;
		}
		public SearchCoveragesPage enterCoverage_28(WebDriver driver,String Coverage_28) {
			BrowserActions.type(driver, inpCoverage_28,Coverage_28, "Coverage_28");
			return this;
		}
		public SearchCoveragesPage enterCoverage_22(WebDriver driver,String Coverage_22) {
			BrowserActions.type(driver, inpCoverage_22,Coverage_22, "Coverage_22");
			return this;
		}
		public SearchCoveragesPage enterCoverage_25(WebDriver driver,String Coverage_25) {
			BrowserActions.type(driver, inpCoverage_25,Coverage_25, "Coverage_25");
			return this;
		}
		public SearchCoveragesPage enterType_3(WebDriver driver,String Type_3) {
			BrowserActions.type(driver, inpType_3,Type_3, "Type_3");
			return this;
		}
		public SearchCoveragesPage enterType_6(WebDriver driver,String Type_6) {
			BrowserActions.type(driver, inpType_6,Type_6, "Type_6");
			return this;
		}
		public SearchCoveragesPage enterType_9(WebDriver driver,String Type_9) {
			BrowserActions.type(driver, inpType_9,Type_9, "Type_9");
			return this;
		}

		public SearchCoveragesPage clickCoveragechkbox(WebDriver driver) {
			BrowserActions.click(driver, chkcoverage, "coverage check box");
			return this;
		}
	}

	public class SearchExclusionsAndConditionsPage extends LoadableComponent<SearchExclusionsAndConditionsPage> {

		WebDriver driver;
		private boolean isPageLoaded;
		public ElementLayer elementLayer;
		String elementObject;
		HashMap<String, String> getPageObjects;
		public  List<Object> pageFactoryKey = new ArrayList<Object>();
		public  List<String> pageFactoryValue = new ArrayList<String>();

		@IFindBy(how = How.CSS, using = "input[name='CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchResultsLV-6-Coverage']", AI = false)
		public WebElement inpCoverage_16;

		@IFindBy(how = How.CSS, using = "input[name='CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchResultsLV-4-Coverage']", AI = false)
		public WebElement inpCoverage_10;

		@IFindBy(how = How.CSS, using = "input[name='CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchResultsLV-6-Category']", AI = false)
		public WebElement inpCategory_17;

		@IFindBy(how = How.CSS, using = "input[name='CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchResultsLV-5-Coverage']", AI = false)
		public WebElement inpCoverage_13;

		@IFindBy(how = How.CSS, using = "input[name='CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchResultsLV-5-Category']", AI = false)
		public WebElement inpCategory_14;

		@IFindBy(how = How.CSS, using = "select[name='CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchDV-CoverageCategory']", AI = false)
		public WebElement drpCategory;

		@IFindBy(how = How.CSS, using = "input[name='CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchResultsLV-4-Category']", AI = false)
		public WebElement inpCategory_11;

		@IFindBy(how = How.CSS, using = "input[name='CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchResultsLV-0-Category']", AI = false)
		public WebElement inpCategory;

		@IFindBy(how = How.CSS, using = "input[name='CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchResultsLV-2-Category']", AI = false)
		public WebElement inpCategory_5;

		@IFindBy(how = How.CSS, using = "input[name='CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchResultsLV-1-Category']", AI = false)
		public WebElement inpCategory_2;

		@IFindBy(how = How.CSS, using = "#CoveragePatternSearchPopup-__crumb__", AI = false)
		public WebElement btnReturntoBusinessownersLine;

		@IFindBy(how = How.CSS, using = "input[name='CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchResultsLV-1-Coverage']", AI = false)
		public WebElement inpCoverage_1;

		@IFindBy(how = How.CSS, using = "input[name='CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchResultsLV-2-Coverage']", AI = false)
		public WebElement inpCoverage_4;

		@IFindBy(how = How.CSS, using = "input[name='CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchResultsLV-3-Coverage']", AI = false)
		public WebElement inpCoverage_7;

		@IFindBy(how = How.CSS, using = "input[name='CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchResultsLV-6-ClauseType']", AI = false)
		public WebElement inpType_18;

		@IFindBy(how = How.CSS, using = "#CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Search", AI = false)
		public WebElement btnSearch;

		@IFindBy(how = How.CSS, using = "input[name='CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchResultsLV-0-ClauseType']", AI = false)
		public WebElement inpType;

		@IFindBy(how = How.CSS, using = "input[name='CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchResultsLV-4-ClauseType']", AI = false)
		public WebElement inpType_12;

		@IFindBy(how = How.CSS, using = "input[name='CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchResultsLV-5-ClauseType']", AI = false)
		public WebElement inpType_15;

		@IFindBy(how = How.CSS, using = "input[name='CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchResultsLV-3-Category']", AI = false)
		public WebElement inpCategory_8;

		@IFindBy(how = How.CSS, using = "#CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Reset", AI = false)
		public WebElement btnReset;

		@IFindBy(how = How.XPATH, using = "//div[contains(text(),'Search Exclusions And Conditions')]", AI = false)
		public WebElement lblTtlBar;

		@IFindBy(how = How.CSS, using = "input[name='CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchDV-Keyword']", AI = false)
		public WebElement inpKeyword;

		@IFindBy(how = How.CSS, using = "#CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchResultsLV_tb-AddCoverageButton>div[role='button']", AI = false)
		public WebElement btnAddCoverageButton;

		@IFindBy(how = How.CSS, using = "input[name='CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchResultsLV-0-Coverage']", AI = false)
		public WebElement inpCoverage;

		@IFindBy(how = How.CSS, using = "input[name='CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchResultsLV-1-ClauseType']", AI = false)
		public WebElement inpType_3;

		@IFindBy(how = How.CSS, using = "input[name='CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchResultsLV-2-ClauseType']", AI = false)
		public WebElement inpType_6;

		@IFindBy(how = How.CSS, using = "input[name='CoveragePatternSearchPopup-CoveragePatternSearchScreen-CoveragePatternSearchResultsLV-3-ClauseType']", AI = false)
		public WebElement inpType_9;

		@IFindBy(how = How.CSS, using = "input[name$='SearchResultsLV-0-_Checkbox']", AI = false)
		public WebElement chkExclusionCondition;

		@IFindBy(how = How.CSS, using = "div[id$='AddCoverageButton']", AI = false)
		public WebElement btnAddExclusionAndCondition;

		public SearchExclusionsAndConditionsPage(){
		}

		public SearchExclusionsAndConditionsPage(WebDriver driver) {
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
		}public SearchExclusionsAndConditionsPage enterCoverage_16(WebDriver driver,String Coverage_16) {
			BrowserActions.type(driver, inpCoverage_16,Coverage_16, "Coverage_16");
			return this;
		}
		public SearchExclusionsAndConditionsPage enterCoverage_10(WebDriver driver,String Coverage_10) {
			BrowserActions.type(driver, inpCoverage_10,Coverage_10, "Coverage_10");
			return this;
		}
		public SearchExclusionsAndConditionsPage enterCategory_17(WebDriver driver,String Category_17) {
			BrowserActions.type(driver, inpCategory_17,Category_17, "Category_17");
			return this;
		}
		public SearchExclusionsAndConditionsPage enterCoverage_13(WebDriver driver,String Coverage_13) {
			BrowserActions.type(driver, inpCoverage_13,Coverage_13, "Coverage_13");
			return this;
		}
		public SearchExclusionsAndConditionsPage enterCategory_14(WebDriver driver,String Category_14) {
			BrowserActions.type(driver, inpCategory_14,Category_14, "Category_14");
			return this;
		}
		public SearchExclusionsAndConditionsPage selectCategory(WebDriver driver,String Category)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpCategory,Category,"Category");
			return this;
		}
		public SearchExclusionsAndConditionsPage enterCategory_11(WebDriver driver,String Category_11) {
			BrowserActions.type(driver, inpCategory_11,Category_11, "Category_11");
			return this;
		}
		public SearchExclusionsAndConditionsPage enterCategory(WebDriver driver,String Category) {
			BrowserActions.type(driver, inpCategory,Category, "Category");
			return this;
		}
		public SearchExclusionsAndConditionsPage enterCategory_5(WebDriver driver,String Category_5) {
			BrowserActions.type(driver, inpCategory_5,Category_5, "Category_5");
			return this;
		}
		public SearchExclusionsAndConditionsPage enterCategory_2(WebDriver driver,String Category_2) {
			BrowserActions.type(driver, inpCategory_2,Category_2, "Category_2");
			return this;
		}
		public SearchExclusionsAndConditionsPage clickReturntoBusinessownersLine(WebDriver driver)  {
			BrowserActions.click(driver, btnReturntoBusinessownersLine,"ReturntoBusinessownersLine");
			return this;
		}
		public SearchExclusionsAndConditionsPage enterCoverage_1(WebDriver driver,String Coverage_1) {
			BrowserActions.type(driver, inpCoverage_1,Coverage_1, "Coverage_1");
			return this;
		}
		public SearchExclusionsAndConditionsPage enterCoverage_4(WebDriver driver,String Coverage_4) {
			BrowserActions.type(driver, inpCoverage_4,Coverage_4, "Coverage_4");
			return this;
		}
		public SearchExclusionsAndConditionsPage enterCoverage_7(WebDriver driver,String Coverage_7) {
			BrowserActions.type(driver, inpCoverage_7,Coverage_7, "Coverage_7");
			return this;
		}
		public SearchExclusionsAndConditionsPage enterType_18(WebDriver driver,String Type_18) {
			BrowserActions.type(driver, inpType_18,Type_18, "Type_18");
			return this;
		}
		public SearchExclusionsAndConditionsPage clickSearch(WebDriver driver)  {
			BrowserActions.click(driver, btnSearch,"Search");
			return this;
		}
		public SearchExclusionsAndConditionsPage enterType(WebDriver driver,String Type) {
			BrowserActions.type(driver, inpType,Type, "Type");
			return this;
		}
		public SearchExclusionsAndConditionsPage enterType_12(WebDriver driver,String Type_12) {
			BrowserActions.type(driver, inpType_12,Type_12, "Type_12");
			return this;
		}
		public SearchExclusionsAndConditionsPage enterType_15(WebDriver driver,String Type_15) {
			BrowserActions.type(driver, inpType_15,Type_15, "Type_15");
			return this;
		}
		public SearchExclusionsAndConditionsPage enterCategory_8(WebDriver driver,String Category_8) {
			BrowserActions.type(driver, inpCategory_8,Category_8, "Category_8");
			return this;
		}
		public SearchExclusionsAndConditionsPage clickReset(WebDriver driver)  {
			BrowserActions.click(driver, btnReset,"Reset");
			return this;
		}
		public SearchExclusionsAndConditionsPage enterKeyword(WebDriver driver,String Keyword) {
			BrowserActions.type(driver, inpKeyword,Keyword, "Keyword");
			return this;
		}
		public SearchExclusionsAndConditionsPage clickAddCoverageButton(WebDriver driver)  {
			BrowserActions.click(driver, btnAddCoverageButton,"AddCoverageButton");
			return this;
		}
		public SearchExclusionsAndConditionsPage enterCoverage(WebDriver driver,String Coverage) {
			BrowserActions.type(driver, inpCoverage,Coverage, "Coverage");
			return this;
		}
		public SearchExclusionsAndConditionsPage enterType_3(WebDriver driver,String Type_3) {
			BrowserActions.type(driver, inpType_3,Type_3, "Type_3");
			return this;
		}
		public SearchExclusionsAndConditionsPage enterType_6(WebDriver driver,String Type_6) {
			BrowserActions.type(driver, inpType_6,Type_6, "Type_6");
			return this;
		}
		public SearchExclusionsAndConditionsPage enterType_9(WebDriver driver,String Type_9) {
			BrowserActions.type(driver, inpType_9,Type_9, "Type_9");
			return this;
		}
		public SearchExclusionsAndConditionsPage clickExclusionConditionChkbox(WebDriver driver) {
			BrowserActions.click(driver, chkExclusionCondition, "Exclusion Condition check box");
			return this;
		}

		public SearchExclusionsAndConditionsPage clickAddSelectedExclusionCondition(WebDriver driver) {
			BrowserActions.click(driver, btnAddExclusionAndCondition, "Selected Coverage ");
			return this;
		}

	}


}
