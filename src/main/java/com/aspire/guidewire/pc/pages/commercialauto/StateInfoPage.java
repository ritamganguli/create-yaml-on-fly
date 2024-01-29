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

public class StateInfoPage extends LoadableComponent<StateInfoPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Workplan>div[role='menuitem']", AI = false)
	public WebElement btnWorkplan;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BAStateInfoScreen-ExclusionsAndConditionsCardTab", AI = false)
	public WebElement btnExclusionsConditions_3;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-9-item>div[role='menuitem']", AI = false)
	public WebElement btnGetRiskInformationProducer;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BAStateInfoScreen-ModifierCardTab", AI = false)
	public WebElement btnStateRating_4;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_CopySubmission>div[role='menuitem']", AI = false)
	public WebElement btnCopySubmission;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-4-item>div[role='menuitem']", AI = false)
	public WebElement btnGeneralreminderdiary;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-8-item>div[role='menuitem']", AI = false)
	public WebElement btnGetReinsuranceQuote;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BAStateInfoScreen-BusinessAutoStateModifierPanelSet-RateModifiers-1-Expiration']", AI = false)
	public WebElement inpExpiration_15;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-13-item>div[role='menuitem']", AI = false)
	public WebElement btnReview45dayUWPeriod;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BAStateInfoScreen-AdditionalCoveragesCardTab", AI = false)
	public WebElement btnAdditionalCoverages_2;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BAStateInfoScreen-BusinessAutoStateModifierPanelSet-RateModifiers-0-Expiration_dateIcon", AI = false)
	public WebElement btnExpirationDateIcon;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BAStateInfoScreen-BusinessAutoStateModifierPanelSet-RateModifiers-0-Minimum']", AI = false)
	public WebElement inpMinimum;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-1-item>div[role='menuitem']", AI = false)
	public WebElement btnGetAuditInternalPersonnel;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BAStateInfoScreen-JobWizardToolbarButtonSet-BindOptions-BindOnly>div[role='menuitem']", AI = false)
	public WebElement btnBindOnly;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BAStateInfoScreen-CoveragesCardTab", AI = false)
	public WebElement btnCoverages_1;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BAStateInfoScreen-BusinessAutoStateModifierPanelSet-RateModifiers-0-Rate']", AI = false)
	public WebElement inpValue;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BAStateInfoScreen-BusinessAutoStateModifierPanelSet-RateModifiers-1-Minimum']", AI = false)
	public WebElement inpMinimum_8;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-0-NewActivityMenuItemSet_Category>div[role='menuitem']", AI = false)
	public WebElement btnInterview;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-MultiQuoteAcceleratedMenuActions-PolicyPeriodSelector-PolicyPeriodSelector_Arg']", AI = false)
	public WebElement drpPolicyPeriodSelector_Arg;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-6-item>div[role='menuitem']", AI = false)
	public WebElement btnPerformanceReview;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-DiagWorksheetItem-ShowDiagWorksheet>div[role='menuitem']", AI = false)
	public WebElement btnShowPartialWorksheet;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BAStateInfoScreen-BusinessAutoStateModifierPanelSet-RateModifiers-0-Category']", AI = false)
	public WebElement inpCategory;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-1-item>div[role='menuitem']", AI = false)
	public WebElement btn60daydiary;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BAStateInfoScreen-JobWizardToolbarButtonSet-Versions-NewVersion>div[role='menuitem']", AI = false)
	public WebElement btnStartMultiVersion;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Prev>div[role='button']", AI = false)
	public WebElement btnBack;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-15-item>div[role='menuitem']", AI = false)
	public WebElement btnReviewProducer;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-Locations>div[role='menuitem']", AI = false)
	public WebElement btnLocations;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BAStateInfoScreen-CoveragesCardTab", AI = false)
	public WebElement btnCoverages;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BAStateInfoScreen-BusinessAutoStateModifierPanelSet-RateModifiers-0-Maximum']", AI = false)
	public WebElement inpMaximum;

	@IFindBy(how = How.CSS, using = "div[id$='Next']", AI = false)
	public WebElement btnNext;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BAStateInfoScreen-BusinessAutoStateModifierPanelSet-RateModifiers-0-Justification']", AI = false)
	public WebElement inpJustification;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-10-item>div[role='menuitem']", AI = false)
	public WebElement btnQuoteRequired;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BAStateInfoScreen-ExclusionsAndConditionsCardTab", AI = false)
	public WebElement btnExclusionsConditions;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-8-item>div[role='menuitem']", AI = false)
	public WebElement btnPolicyReviewMidterm;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-baLineStep>div[role='menuitem']", AI = false)
	public WebElement btnCommercialAutoLine;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BAStateInfoScreen-AdditionalCoveragesCardTab", AI = false)
	public WebElement btnAdditionalCoverages;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BAStateInfoScreen-JobWizardToolbarButtonSet-Versions-ViewSideBySide>div[role='menuitem']", AI = false)
	public WebElement btnViewSideBySideVersions;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BAStateInfoScreen-BusinessAutoStateModifierPanelSet-RateModifiers-1-Expiration_dateIcon", AI = false)
	public WebElement btnExpirationDateIcon_16;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BAStateInfoScreen-JobWizardToolbarButtonSet-Draft>div[role='button']", AI = false)
	public WebElement btnSaveDraft;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-3-item>div[role='menuitem']", AI = false)
	public WebElement btnGetBureauData;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Reinsurance>div[role='menuitem']", AI = false)
	public WebElement btnReinsurance;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BAStateInfoScreen-BusinessAutoStateModifierPanelSet-RateModifiers-0-Effective_dateIcon", AI = false)
	public WebElement btnEffectiveDateIcon;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-BillingInfo>div[role='menuitem']", AI = false)
	public WebElement btnPayment;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Change-WizardMenuActions_ChangeEffDate>div[role='menuitem']", AI = false)
	public WebElement btnEffectiveDate;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BAStateInfoScreen-QuoteRequestedAlert .gw-AlertBar--label", AI = false)
	public WebElement lblQuoteRequestedAlert;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-RiskEvaluation>div[role='menuitem']", AI = false)
	public WebElement btnRiskAnalysis_20;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewDocument-NewJobDocumentMenuItemSet-PolicyPeriodNewDocumentMenuItemSet_Template>div[role='menuitem']", AI = false)
	public WebElement btnCreatefromatemplate;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BAStateInfoScreen-JobWizardToolbarButtonSet-Versions-SideBySide>div[role='menuitem']", AI = false)
	public WebElement btnStartSidebySide;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Archiving>div[role='menuitem']", AI = false)
	public WebElement btnArchiving;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BAStateInfoScreen-BusinessAutoStateModifierPanelSet-RateModifiers-1-Maximum']", AI = false)
	public WebElement inpMaximum_9;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BAStateInfoScreen-JobWizardToolbarButtonSet-CloseOptions-NotTakenJob>div[role='menuitem']", AI = false)
	public WebElement btnNotTaken;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Documents>div[role='menuitem']", AI = false)
	public WebElement btnDocuments;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-PolicyVersions>div[role='menuitem']", AI = false)
	public WebElement btnPolicyVersions_19;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BAStateInfoScreen-OOSEPanelSet-NextSliceLink", AI = false)
	public WebElement btnNextBlockedDate;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-1-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnCA0053514392;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-2-item>div[role='menuitem']", AI = false)
	public WebElement btn90daydiary;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BAStateInfoScreen-BusinessAutoStateModifierPanelSet-RateModifiers-1-Effective']", AI = false)
	public WebElement inpEffective_13;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BAStateInfoScreen-JobWizardToolbarButtonSet-QuoteTypeToolbarButtonSet-Quote>div[role='button']", AI = false)
	public WebElement btnQuote;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-BusinessVehicles>div[role='menuitem']", AI = false)
	public WebElement btnVehicles;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BAStateInfoScreen-JobWizardToolbarButtonSet-BindOptions>div[role='button']", AI = false)
	public WebElement btnBindOptions;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BAStateInfoScreen-jurisdictionLV-0-States']", AI = false)
	public WebElement drpState;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BAStateInfoScreen-JobWizardToolbarButtonSet-Unlock>div[role='button']", AI = false)
	public WebElement btnReleaseLock;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Archiving-WizardMenuActions_SuspendResumeArchiving>div[role='menuitem']", AI = false)
	public WebElement btnEnableDisable;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BAStateInfoScreen-JobWizardToolbarButtonSet-BindOptions-BindAndIssue>div[role='menuitem']", AI = false)
	public WebElement btnIssuePolicy;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BAStateInfoScreen-BAStateCoveragesPanelSet-BAPVehicleStateGrpIterator-1-CoverageInputSet-CovPatternInputGroup-0-CovTermInputSet-PackageTermInput']", AI = false)
	public WebElement drpPackageTermInput_5;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BAStateInfoScreen-BAStateCoveragesPanelSet-BAPVehicleStateGrpIterator-1-CoverageInputSet-CovPatternInputGroup-_checkbox']", AI = false)
	public WebElement chk_checkbox;

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

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BAStateInfoScreen-OOSEPanelSet-OOSEPeriodSelector-OOSEPeriodSelector_Arg']", AI = false)
	public WebElement drpEffectiveDate;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BAStateInfoScreen-BusinessAutoStateModifierPanelSet-RateModifiers-1-Justification']", AI = false)
	public WebElement inpJustification_12;

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

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BAStateInfoScreen-BusinessAutoStateModifierPanelSet-RateModifiers-0-ValueFinal']", AI = false)
	public WebElement rdbFinal;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-ProductDefinition>div[role='menuitem']", AI = false)
	public WebElement btnProductDefinition;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-6-item>div[role='menuitem']", AI = false)
	public WebElement btnGetInspectionOutsideService;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-4-NewActivityMenuItemSet_Category>div[role='menuitem']", AI = false)
	public WebElement btnUnderwriterReview;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BAStateInfoScreen-BusinessAutoStateModifierPanelSet-RateModifiers-1-Rate']", AI = false)
	public WebElement inpValue_10;

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

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BAStateInfoScreen-BAStateCoveragesPanelSet-BAPVehicleStateGrpIterator-0-CoverageInputSet-CovPatternInputGroup-_checkbox']", AI = false)
	public WebElement chkUninsuredMotoristBodilyInjury;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-StateInfo>div[role='menuitem']", AI = false)
	public WebElement btnStateInfo;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-CollectCreditCard>div[role='menuitem']", AI = false)
	public WebElement btnCollectCreditCard;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BAStateInfoScreen-BAStateCoveragesPanelSet-BAPVehicleStateGrpIterator-0-CoverageInputSet-CovPatternInputGroup-0-CovTermInputSet-PackageTermInput']", AI = false)
	public WebElement drpPackageTermInput;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-11-item>div[role='menuitem']", AI = false)
	public WebElement btnRatiooutofrange;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BAStateInfoScreen-JobWizardToolbarButtonSet-ConvertToFullApp>div[role='button']", AI = false)
	public WebElement btnFullApp;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-JobGroupItem>div[role='menuitem']", AI = false)
	public WebElement btnSG00525247791543403972;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-PolicyReview>div[role='menuitem']", AI = false)
	public WebElement btnPolicyReview;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BAStateInfoScreen-BusinessAutoStateModifierPanelSet-RateModifiers-1-Category']", AI = false)
	public WebElement inpCategory_6;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-DiagWorksheetItem>div[role='menuitem']", AI = false)
	public WebElement btnDiagnosticData;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BAStateInfoScreen-OOSEPanelSet-OOSEPeriodSelector", AI = false)
	public WebElement btnOOSEPeriodSelector;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-11-item>div[role='menuitem']", AI = false)
	public WebElement btnManuallyrateandquotepolicy;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-BADrivers>div[role='menuitem']", AI = false)
	public WebElement btnDrivers;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-History>div[role='menuitem']", AI = false)
	public WebElement btnHistory;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category>div[role='menuitem']", AI = false)
	public WebElement btnReminder;

	@IFindBy(how = How.CSS, using = "div[id$='BAStateInfoScreen-ttlBar']", AI = false)
	public WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Change>div[role='menuitem']", AI = false)
	public WebElement btnEdit;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BAStateInfoScreen-JobWizardToolbarButtonSet-CloseOptions-WithdrawJob>div[role='menuitem']", AI = false)
	public WebElement btnWithdrawTransaction;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-PolicyInfo>div[role='menuitem']", AI = false)
	public WebElement btnPolicyInfo;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BAStateInfoScreen-JobWizardToolbarButtonSet-Versions>div[role='button']", AI = false)
	public WebElement btnVersions;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-Modifiers>div[role='menuitem']", AI = false)
	public WebElement btnModifiers;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_ToAccountFile>div[role='menuitem']", AI = false)
	public WebElement btnAccountFile;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BAStateInfoScreen-BusinessAutoStateModifierPanelSet-RateModifiers-0-Effective']", AI = false)
	public WebElement inpEffective;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-1-NewActivityMenuItemSet_Category-0-item>div[role='menuitem']", AI = false)
	public WebElement btnReviewnewmail;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup>div[role='menuitem']", AI = false)
	public WebElement btnGroup;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-3-item>div[role='menuitem']", AI = false)
	public WebElement btnCancelasplitpolicy;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BAStateInfoScreen-ModifierCardTab", AI = false)
	public WebElement btnStateRating;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-2-item>div[role='menuitem']", AI = false)
	public WebElement btnGetAuditOutsideService;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Change-WizardMenuActions_CopyPolicyData>div[role='menuitem']", AI = false)
	public WebElement btnCopyData;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-5-item>div[role='menuitem']", AI = false)
	public WebElement btnNewAuditAssignment;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-16-item>div[role='menuitem']", AI = false)
	public WebElement btnRewritetoNewAccount;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BAStateInfoScreen-BusinessAutoStateModifierPanelSet-RateModifiers-1-ValueFinal']", AI = false)
	public WebElement rdbFinal_11;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BAStateInfoScreen-QuoteRequestedAlert-CloseBtn", AI = false)
	public WebElement btnClose;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-12-item>div[role='menuitem']", AI = false)
	public WebElement btnReview30dayUWPeriod;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-ManageBranches>div[role='menuitem']", AI = false)
	public WebElement btnPolicyVersions;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-14-item>div[role='menuitem']", AI = false)
	public WebElement btnReview60dayUWPeriod;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BAStateInfoScreen-JobWizardToolbarButtonSet-EditPolicy>div[role='button']", AI = false)
	public WebElement btnEditPolicyTransaction;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-ViewMultiLineQuote>div[role='menuitem']", AI = false)
	public WebElement btnQuote_18;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BAStateInfoScreen-BusinessAutoStateModifierPanelSet-RateModifiers-1-Eligibility']", AI = false)
	public WebElement rdbEligible_7;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-ViewQuote>div[role='menuitem']", AI = false)
	public WebElement btnQuote_17;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity>div[role='menuitem']", AI = false)
	public WebElement btnNewActivity;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Cancel>div[role='button']", AI = false)
	public WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BAStateInfoScreen-JobWizardToolbarButtonSet-CloseOptions>div[role='button']", AI = false)
	public WebElement btnCloseOptions;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BAStateInfoScreen-BusinessAutoStateModifierPanelSet-RateModifiers-0-Eligibility']", AI = false)
	public WebElement rdbEligible;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BAStateInfoScreen-BusinessAutoStateModifierPanelSet-RateModifiers-0-Expiration']", AI = false)
	public WebElement inpExpiration;

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

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BAStateInfoScreen-JobWizardToolbarButtonSet-CloseOptions-Decline>div[role='menuitem']", AI = false)
	public WebElement btnDecline;

	@IFindBy(how = How.CSS, using = "div[id=$'SubmissionWizard-WizardMenuActions']>div[role='button']", AI = false)
	public WebElement btnWizardMenuActions;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardActionsMenuItemSet-SubmissionInfo>div[role='menuitem']", AI = false)
	public WebElement btnSubManager;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BAStateInfoScreen-BusinessAutoStateModifierPanelSet-RateModifiers-1-Effective_dateIcon", AI = false)
	public WebElement btnEffectiveDateIcon_14;

	public StateInfoPage(){
	}

	public StateInfoPage(WebDriver driver){
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
	}
	public StateInfoPage clickWorkplan(WebDriver driver)  {
		BrowserActions.click(driver, btnWorkplan,"Workplan");
		return this;
	}
	public StateInfoPage clickExclusionsConditions_3(WebDriver driver)  {
		BrowserActions.click(driver, btnExclusionsConditions_3,"ExclusionsConditions_3");
		return this;
	}
	public StateInfoPage clickGetRiskInformationProducer(WebDriver driver)  {
		BrowserActions.click(driver, btnGetRiskInformationProducer,"GetRiskInformationProducer");
		return this;
	}
	public StateInfoPage clickStateRating_4(WebDriver driver)  {
		BrowserActions.click(driver, btnStateRating_4,"StateRating_4");
		return this;
	}
	public StateInfoPage clickCopySubmission(WebDriver driver)  {
		BrowserActions.click(driver, btnCopySubmission,"CopySubmission");
		return this;
	}
	public StateInfoPage clickGeneralreminderdiary(WebDriver driver)  {
		BrowserActions.click(driver, btnGeneralreminderdiary,"Generalreminderdiary");
		return this;
	}
	public StateInfoPage clickGetReinsuranceQuote(WebDriver driver)  {
		BrowserActions.click(driver, btnGetReinsuranceQuote,"GetReinsuranceQuote");
		return this;
	}
	public StateInfoPage enterExpiration_15(WebDriver driver,String Expiration_15) {
		BrowserActions.type(driver, inpExpiration_15,Expiration_15, "Expiration_15");
		return this;
	}
	public StateInfoPage clickReview45dayUWPeriod(WebDriver driver)  {
		BrowserActions.click(driver, btnReview45dayUWPeriod,"Review45dayUWPeriod");
		return this;
	}
	public StateInfoPage clickAdditionalCoverages_2(WebDriver driver)  {
		BrowserActions.click(driver, btnAdditionalCoverages_2,"AdditionalCoverages_2");
		return this;
	}
	public StateInfoPage clickExpirationDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnExpirationDateIcon,"ExpirationDateIcon");
		return this;
	}
	public StateInfoPage enterMinimum(WebDriver driver,String Minimum) {
		BrowserActions.type(driver, inpMinimum,Minimum, "Minimum");
		return this;
	}
	public StateInfoPage clickGetAuditInternalPersonnel(WebDriver driver)  {
		BrowserActions.click(driver, btnGetAuditInternalPersonnel,"GetAuditInternalPersonnel");
		return this;
	}
	public StateInfoPage clickBindOnly(WebDriver driver)  {
		BrowserActions.click(driver, btnBindOnly,"BindOnly");
		return this;
	}
	public StateInfoPage clickCoverages_1(WebDriver driver)  {
		BrowserActions.click(driver, btnCoverages_1,"Coverages_1");
		return this;
	}
	public StateInfoPage enterValue(WebDriver driver,String Value) {
		BrowserActions.type(driver, inpValue,Value, "Value");
		return this;
	}
	public StateInfoPage enterMinimum_8(WebDriver driver,String Minimum_8) {
		BrowserActions.type(driver, inpMinimum_8,Minimum_8, "Minimum_8");
		return this;
	}
	public StateInfoPage clickInterview(WebDriver driver)  {
		BrowserActions.click(driver, btnInterview,"Interview");
		return this;
	}
	public StateInfoPage selectPolicyPeriodSelector_Arg(WebDriver driver,String PolicyPeriodSelector_Arg)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPolicyPeriodSelector_Arg,PolicyPeriodSelector_Arg,"PolicyPeriodSelector_Arg");
		return this;
	}
	public StateInfoPage clickPerformanceReview(WebDriver driver)  {
		BrowserActions.click(driver, btnPerformanceReview,"PerformanceReview");
		return this;
	}
	public StateInfoPage clickShowPartialWorksheet(WebDriver driver)  {
		BrowserActions.click(driver, btnShowPartialWorksheet,"ShowPartialWorksheet");
		return this;
	}
	public StateInfoPage enterCategory(WebDriver driver,String Category) {
		BrowserActions.type(driver, inpCategory,Category, "Category");
		return this;
	}
	public StateInfoPage click60daydiary(WebDriver driver)  {
		BrowserActions.click(driver, btn60daydiary,"60daydiary");
		return this;
	}
	public StateInfoPage clickStartMultiVersion(WebDriver driver)  {
		BrowserActions.click(driver, btnStartMultiVersion,"StartMultiVersion");
		return this;
	}
	public StateInfoPage clickBack(WebDriver driver)  {
		BrowserActions.click(driver, btnBack,"Back");
		return this;
	}
	public StateInfoPage clickReviewProducer(WebDriver driver)  {
		BrowserActions.click(driver, btnReviewProducer,"ReviewProducer");
		return this;
	}
	public StateInfoPage clickLocations(WebDriver driver)  {
		BrowserActions.click(driver, btnLocations,"Locations");
		return this;
	}
	public StateInfoPage clickCoverages(WebDriver driver)  {
		BrowserActions.click(driver, btnCoverages,"Coverages");
		return this;
	}
	public StateInfoPage enterMaximum(WebDriver driver,String Maximum) {
		BrowserActions.type(driver, inpMaximum,Maximum, "Maximum");
		return this;
	}
	public StateInfoPage clickNext(WebDriver driver)  {
		BrowserActions.click(driver, btnNext,1,"Next");
		return this;
	}
	public StateInfoPage enterJustification(WebDriver driver,String Justification) {
		BrowserActions.type(driver, inpJustification,Justification, "Justification");
		return this;
	}
	public StateInfoPage clickQuoteRequired(WebDriver driver)  {
		BrowserActions.click(driver, btnQuoteRequired,"QuoteRequired");
		return this;
	}
	public StateInfoPage clickExclusionsConditions(WebDriver driver)  {
		BrowserActions.click(driver, btnExclusionsConditions,"ExclusionsConditions");
		return this;
	}
	public StateInfoPage clickPolicyReviewMidterm(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyReviewMidterm,"PolicyReviewMidterm");
		return this;
	}
	public StateInfoPage clickCommercialAutoLine(WebDriver driver)  {
		BrowserActions.click(driver, btnCommercialAutoLine,"CommercialAutoLine");
		return this;
	}
	public StateInfoPage clickAdditionalCoverages(WebDriver driver)  {
		BrowserActions.click(driver, btnAdditionalCoverages,"AdditionalCoverages");
		return this;
	}
	public StateInfoPage clickViewSideBySideVersions(WebDriver driver)  {
		BrowserActions.click(driver, btnViewSideBySideVersions,"ViewSideBySideVersions");
		return this;
	}
	public StateInfoPage clickExpirationDateIcon_16(WebDriver driver)  {
		BrowserActions.click(driver, btnExpirationDateIcon_16,"ExpirationDateIcon_16");
		return this;
	}
	public StateInfoPage clickSaveDraft(WebDriver driver)  {
		BrowserActions.click(driver, btnSaveDraft,"SaveDraft");
		return this;
	}
	public StateInfoPage clickGetBureauData(WebDriver driver)  {
		BrowserActions.click(driver, btnGetBureauData,"GetBureauData");
		return this;
	}
	public StateInfoPage clickReinsurance(WebDriver driver)  {
		BrowserActions.click(driver, btnReinsurance,"Reinsurance");
		return this;
	}
	public StateInfoPage clickEffectiveDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnEffectiveDateIcon,"EffectiveDateIcon");
		return this;
	}
	public StateInfoPage clickPayment(WebDriver driver)  {
		BrowserActions.click(driver, btnPayment,"Payment");
		return this;
	}
	public StateInfoPage clickEffectiveDate(WebDriver driver)  {
		BrowserActions.click(driver, btnEffectiveDate,"EffectiveDate");
		return this;
	}
	public StateInfoPage clickRiskAnalysis_20(WebDriver driver)  {
		BrowserActions.click(driver, btnRiskAnalysis_20,"RiskAnalysis_20");
		return this;
	}
	public StateInfoPage clickCreatefromatemplate(WebDriver driver)  {
		BrowserActions.click(driver, btnCreatefromatemplate,"Createfromatemplate");
		return this;
	}
	public StateInfoPage clickStartSidebySide(WebDriver driver)  {
		BrowserActions.click(driver, btnStartSidebySide,"StartSidebySide");
		return this;
	}
	public StateInfoPage clickArchiving(WebDriver driver)  {
		BrowserActions.click(driver, btnArchiving,"Archiving");
		return this;
	}
	public StateInfoPage enterMaximum_9(WebDriver driver,String Maximum_9) {
		BrowserActions.type(driver, inpMaximum_9,Maximum_9, "Maximum_9");
		return this;
	}
	public StateInfoPage clickNotTaken(WebDriver driver)  {
		BrowserActions.click(driver, btnNotTaken,"NotTaken");
		return this;
	}
	public StateInfoPage clickDocuments(WebDriver driver)  {
		BrowserActions.click(driver, btnDocuments,"Documents");
		return this;
	}
	public StateInfoPage clickPolicyVersions_19(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyVersions_19,"PolicyVersions_19");
		return this;
	}
	public StateInfoPage clickNextBlockedDate(WebDriver driver)  {
		BrowserActions.click(driver, btnNextBlockedDate,"NextBlockedDate");
		return this;
	}
	public StateInfoPage clickCA0053514392(WebDriver driver)  {
		BrowserActions.click(driver, btnCA0053514392,"CA0053514392");
		return this;
	}
	public StateInfoPage click90daydiary(WebDriver driver)  {
		BrowserActions.click(driver, btn90daydiary,"90daydiary");
		return this;
	}
	public StateInfoPage enterEffective_13(WebDriver driver,String Effective_13) {
		BrowserActions.type(driver, inpEffective_13,Effective_13, "Effective_13");
		return this;
	}
	public StateInfoPage clickQuote(WebDriver driver)  {
		BrowserActions.click(driver, btnQuote,"Quote");
		return this;
	}
	public StateInfoPage clickVehicles(WebDriver driver)  {
		BrowserActions.click(driver, btnVehicles,"Vehicles");
		return this;
	}
	public StateInfoPage clickBindOptions(WebDriver driver)  {
		BrowserActions.click(driver, btnBindOptions,"BindOptions");
		return this;
	}
	public StateInfoPage selectState(WebDriver driver,String State)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpState,State,"State");
		return this;
	}
	public StateInfoPage clickReleaseLock(WebDriver driver)  {
		BrowserActions.click(driver, btnReleaseLock,"ReleaseLock");
		return this;
	}
	public StateInfoPage clickEnableDisable(WebDriver driver)  {
		BrowserActions.click(driver, btnEnableDisable,"EnableDisable");
		return this;
	}
	public StateInfoPage clickIssuePolicy(WebDriver driver)  {
		BrowserActions.click(driver, btnIssuePolicy,"IssuePolicy");
		return this;
	}
	public StateInfoPage selectPackageTermInput_5(WebDriver driver,String PackageTermInput_5)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPackageTermInput_5,PackageTermInput_5,"PackageTermInput_5");
		return this;
	}
	public StateInfoPage click_checkbox(WebDriver driver)  {
		BrowserActions.click(driver, chk_checkbox,"_checkbox");
		return this;
	}
	public StateInfoPage clickCreateNewProducer(WebDriver driver)  {
		BrowserActions.click(driver, btnCreateNewProducer,"CreateNewProducer");
		return this;
	}
	public StateInfoPage clickForms(WebDriver driver)  {
		BrowserActions.click(driver, btnForms,"Forms");
		return this;
	}
	public StateInfoPage clickPolicyPeriodSelector(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyPeriodSelector,"PolicyPeriodSelector");
		return this;
	}
	public StateInfoPage clickNewmail(WebDriver driver)  {
		BrowserActions.click(driver, btnNewmail,"Newmail");
		return this;
	}
	public StateInfoPage clickGetMotorVehicleReports(WebDriver driver)  {
		BrowserActions.click(driver, btnGetMotorVehicleReports,"GetMotorVehicleReports");
		return this;
	}
	public StateInfoPage clickQualification(WebDriver driver)  {
		BrowserActions.click(driver, btnQualification,"Qualification");
		return this;
	}
	public StateInfoPage clickNotes(WebDriver driver)  {
		BrowserActions.click(driver, btnNotes,"Notes");
		return this;
	}
	public StateInfoPage clickHOP0052524779(WebDriver driver)  {
		BrowserActions.click(driver, btnHOP0052524779,"HOP0052524779");
		return this;
	}
	public StateInfoPage clickGetInspectionLossControl(WebDriver driver)  {
		BrowserActions.click(driver, btnGetInspectionLossControl,"GetInspectionLossControl");
		return this;
	}
	public StateInfoPage clickCoveredVehicles(WebDriver driver)  {
		BrowserActions.click(driver, btnCoveredVehicles,"CoveredVehicles");
		return this;
	}
	public StateInfoPage clickParticipants(WebDriver driver)  {
		BrowserActions.click(driver, btnParticipants,"Participants");
		return this;
	}
	public StateInfoPage clickCreate(WebDriver driver)  {
		BrowserActions.click(driver, btnCreate,"Create");
		return this;
	}
	public StateInfoPage clickReviewandapprove(WebDriver driver)  {
		BrowserActions.click(driver, btnReviewandapprove,"Reviewandapprove");
		return this;
	}
	public StateInfoPage selectEffectiveDate(WebDriver driver,String EffectiveDate)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpEffectiveDate,EffectiveDate,"EffectiveDate");
		return this;
	}
	public StateInfoPage enterJustification_12(WebDriver driver,String Justification_12) {
		BrowserActions.type(driver, inpJustification_12,Justification_12, "Justification_12");
		return this;
	}
	public StateInfoPage clickLegalreview(WebDriver driver)  {
		BrowserActions.click(driver, btnLegalreview,"Legalreview");
		return this;
	}
	public StateInfoPage clickNewDocument(WebDriver driver)  {
		BrowserActions.click(driver, btnNewDocument,"NewDocument");
		return this;
	}
	public StateInfoPage clickPolicynotification(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicynotification,"Policynotification");
		return this;
	}
	public StateInfoPage clickUploaddocuments(WebDriver driver)  {
		BrowserActions.click(driver, btnUploaddocuments,"Uploaddocuments");
		return this;
	}
	public StateInfoPage clickFinish(WebDriver driver)  {
		BrowserActions.click(driver, btnFinish,"Finish");
		return this;
	}
	public StateInfoPage clickGoto(WebDriver driver)  {
		BrowserActions.click(driver, btnGoto,"Goto");
		return this;
	}
	public StateInfoPage clickFinal(WebDriver driver)  {
		BrowserActions.click(driver, rdbFinal,"Final");
		return this;
	}
	public StateInfoPage clickProductDefinition(WebDriver driver)  {
		BrowserActions.click(driver, btnProductDefinition,"ProductDefinition");
		return this;
	}
	public StateInfoPage clickGetInspectionOutsideService(WebDriver driver)  {
		BrowserActions.click(driver, btnGetInspectionOutsideService,"GetInspectionOutsideService");
		return this;
	}
	public StateInfoPage clickUnderwriterReview(WebDriver driver)  {
		BrowserActions.click(driver, btnUnderwriterReview,"UnderwriterReview");
		return this;
	}
	public StateInfoPage enterValue_10(WebDriver driver,String Value_10) {
		BrowserActions.type(driver, inpValue_10,Value_10, "Value_10");
		return this;
	}
	public StateInfoPage clickMeetwithInsured(WebDriver driver)  {
		BrowserActions.click(driver, btnMeetwithInsured,"MeetwithInsured");
		return this;
	}
	public StateInfoPage click30daydiary(WebDriver driver)  {
		BrowserActions.click(driver, btn30daydiary,"30daydiary");
		return this;
	}
	public StateInfoPage clickOfferings(WebDriver driver)  {
		BrowserActions.click(driver, btnOfferings,"Offerings");
		return this;
	}
	public StateInfoPage clickPolicyReviewRenewal(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyReviewRenewal,"PolicyReviewRenewal");
		return this;
	}
	public StateInfoPage clickNewNote(WebDriver driver)  {
		BrowserActions.click(driver, btnNewNote,"NewNote");
		return this;
	}
	public StateInfoPage clickSidebySideQuoting(WebDriver driver)  {
		BrowserActions.click(driver, btnSidebySideQuoting,"SidebySideQuoting");
		return this;
	}
	public StateInfoPage clickRiskAnalysis(WebDriver driver)  {
		BrowserActions.click(driver, btnRiskAnalysis,"RiskAnalysis");
		return this;
	}
	public StateInfoPage clickMeetwithProducerAgency(WebDriver driver)  {
		BrowserActions.click(driver, btnMeetwithProducerAgency,"MeetwithProducerAgency");
		return this;
	}
	public StateInfoPage clickUninsuredMotoristBodilyInjury(WebDriver driver)  {
		BrowserActions.click(driver, chkUninsuredMotoristBodilyInjury,"UninsuredMotoristBodilyInjury");
		return this;
	}
	public StateInfoPage clickStateInfo(WebDriver driver)  {
		BrowserActions.click(driver, btnStateInfo,"StateInfo");
		return this;
	}
	public StateInfoPage clickCollectCreditCard(WebDriver driver)  {
		BrowserActions.click(driver, btnCollectCreditCard,"CollectCreditCard");
		return this;
	}
	public StateInfoPage selectPackageTermInput(WebDriver driver,String PackageTermInput)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPackageTermInput,PackageTermInput,"PackageTermInput");
		return this;
	}
	public StateInfoPage clickRatiooutofrange(WebDriver driver)  {
		BrowserActions.click(driver, btnRatiooutofrange,"Ratiooutofrange");
		return this;
	}
	public StateInfoPage clickFullApp(WebDriver driver)  {
		BrowserActions.click(driver, btnFullApp,"FullApp");
		return this;
	}
	public StateInfoPage clickSG00525247791543403972(WebDriver driver)  {
		BrowserActions.click(driver, btnSG00525247791543403972,"SG00525247791543403972");
		return this;
	}
	public StateInfoPage clickPolicyReview(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyReview,"PolicyReview");
		return this;
	}
	public StateInfoPage enterCategory_6(WebDriver driver,String Category_6) {
		BrowserActions.type(driver, inpCategory_6,Category_6, "Category_6");
		return this;
	}
	public StateInfoPage clickDiagnosticData(WebDriver driver)  {
		BrowserActions.click(driver, btnDiagnosticData,"DiagnosticData");
		return this;
	}
	public StateInfoPage clickOOSEPeriodSelector(WebDriver driver)  {
		BrowserActions.click(driver, btnOOSEPeriodSelector,"OOSEPeriodSelector");
		return this;
	}
	public StateInfoPage clickManuallyrateandquotepolicy(WebDriver driver)  {
		BrowserActions.click(driver, btnManuallyrateandquotepolicy,"Manuallyrateandquotepolicy");
		return this;
	}
	public StateInfoPage clickDrivers(WebDriver driver)  {
		BrowserActions.click(driver, btnDrivers,"Drivers");
		return this;
	}
	public StateInfoPage clickHistory(WebDriver driver)  {
		BrowserActions.click(driver, btnHistory,"History");
		return this;
	}
	public StateInfoPage clickReminder(WebDriver driver)  {
		BrowserActions.click(driver, btnReminder,"Reminder");
		return this;
	}
	public StateInfoPage clickEdit(WebDriver driver)  {
		BrowserActions.click(driver, btnEdit,"Edit");
		return this;
	}
	public StateInfoPage clickWithdrawTransaction(WebDriver driver)  {
		BrowserActions.click(driver, btnWithdrawTransaction,"WithdrawTransaction");
		return this;
	}
	public StateInfoPage clickPolicyInfo(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyInfo,"PolicyInfo");
		return this;
	}
	public StateInfoPage clickVersions(WebDriver driver)  {
		BrowserActions.click(driver, btnVersions,"Versions");
		return this;
	}
	public StateInfoPage clickModifiers(WebDriver driver)  {
		BrowserActions.click(driver, btnModifiers,"Modifiers");
		return this;
	}
	public StateInfoPage clickAccountFile(WebDriver driver)  {
		BrowserActions.click(driver, btnAccountFile,"AccountFile");
		return this;
	}
	public StateInfoPage enterEffective(WebDriver driver,String Effective) {
		BrowserActions.type(driver, inpEffective,Effective, "Effective");
		return this;
	}
	public StateInfoPage clickReviewnewmail(WebDriver driver)  {
		BrowserActions.click(driver, btnReviewnewmail,"Reviewnewmail");
		return this;
	}
	public StateInfoPage clickGroup(WebDriver driver)  {
		BrowserActions.click(driver, btnGroup,"Group");
		return this;
	}
	public StateInfoPage clickCancelasplitpolicy(WebDriver driver)  {
		BrowserActions.click(driver, btnCancelasplitpolicy,"Cancelasplitpolicy");
		return this;
	}
	public StateInfoPage clickStateRating(WebDriver driver)  {
		BrowserActions.click(driver, btnStateRating,"StateRating");
		return this;
	}
	public StateInfoPage clickGetAuditOutsideService(WebDriver driver)  {
		BrowserActions.click(driver, btnGetAuditOutsideService,"GetAuditOutsideService");
		return this;
	}
	public StateInfoPage clickCopyData(WebDriver driver)  {
		BrowserActions.click(driver, btnCopyData,"CopyData");
		return this;
	}
	public StateInfoPage clickNewAuditAssignment(WebDriver driver)  {
		BrowserActions.click(driver, btnNewAuditAssignment,"NewAuditAssignment");
		return this;
	}
	public StateInfoPage clickRewritetoNewAccount(WebDriver driver)  {
		BrowserActions.click(driver, btnRewritetoNewAccount,"RewritetoNewAccount");
		return this;
	}
	public StateInfoPage clickFinal_11(WebDriver driver)  {
		BrowserActions.click(driver, rdbFinal_11,"Final_11");
		return this;
	}
	public StateInfoPage clickClose(WebDriver driver)  {
		BrowserActions.click(driver, btnClose,"Close");
		return this;
	}
	public StateInfoPage clickReview30dayUWPeriod(WebDriver driver)  {
		BrowserActions.click(driver, btnReview30dayUWPeriod,"Review30dayUWPeriod");
		return this;
	}
	public StateInfoPage clickPolicyVersions(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyVersions,"PolicyVersions");
		return this;
	}
	public StateInfoPage clickReview60dayUWPeriod(WebDriver driver)  {
		BrowserActions.click(driver, btnReview60dayUWPeriod,"Review60dayUWPeriod");
		return this;
	}
	public StateInfoPage clickEditPolicyTransaction(WebDriver driver)  {
		BrowserActions.click(driver, btnEditPolicyTransaction,"EditPolicyTransaction");
		return this;
	}
	public StateInfoPage clickQuote_18(WebDriver driver)  {
		BrowserActions.click(driver, btnQuote_18,"Quote_18");
		return this;
	}
	public StateInfoPage clickEligible_7(WebDriver driver)  {
		BrowserActions.click(driver, rdbEligible_7,"Eligible_7");
		return this;
	}
	public StateInfoPage clickQuote_17(WebDriver driver)  {
		BrowserActions.click(driver, btnQuote_17,"Quote_17");
		return this;
	}
	public StateInfoPage clickNewActivity(WebDriver driver)  {
		BrowserActions.click(driver, btnNewActivity,"NewActivity");
		return this;
	}
	public StateInfoPage clickCancel(WebDriver driver)  {
		BrowserActions.click(driver, btnCancel,"Cancel");
		return this;
	}
	public StateInfoPage clickCloseOptions(WebDriver driver)  {
		BrowserActions.click(driver, btnCloseOptions,"CloseOptions");
		return this;
	}
	public StateInfoPage clickEligible(WebDriver driver)  {
		BrowserActions.click(driver, rdbEligible,"Eligible");
		return this;
	}
	public StateInfoPage enterExpiration(WebDriver driver,String Expiration) {
		BrowserActions.type(driver, inpExpiration,Expiration, "Expiration");
		return this;
	}
	public StateInfoPage clickPolicyContract(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyContract,"PolicyContract");
		return this;
	}
	public StateInfoPage clickPolicyFile(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyFile,"PolicyFile");
		return this;
	}
	public StateInfoPage clickVerifycoverage(WebDriver driver)  {
		BrowserActions.click(driver, btnVerifycoverage,"Verifycoverage");
		return this;
	}
	public StateInfoPage clickRequest(WebDriver driver)  {
		BrowserActions.click(driver, btnRequest,"Request");
		return this;
	}
	public StateInfoPage clickGetCreditReports(WebDriver driver)  {
		BrowserActions.click(driver, btnGetCreditReports,"GetCreditReports");
		return this;
	}
	public StateInfoPage clickDecline(WebDriver driver)  {
		BrowserActions.click(driver, btnDecline,"Decline");
		return this;
	}
	public StateInfoPage clickWizardMenuActions(WebDriver driver)  {
		BrowserActions.click(driver, btnWizardMenuActions,"WizardMenuActions");
		return this;
	}
	public StateInfoPage clickSubManager(WebDriver driver)  {
		BrowserActions.click(driver, btnSubManager,"SubManager");
		return this;
	}
	public StateInfoPage clickEffectiveDateIcon_14(WebDriver driver)  {
		BrowserActions.click(driver, btnEffectiveDateIcon_14,"EffectiveDateIcon_14");
		return this;
	}
}
