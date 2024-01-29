package com.aspire.guidewire.pc.pages.homeowners;
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

public class CoveragePage extends LoadableComponent<CoveragePage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
	//public TopNavBar topnavbar;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Workplan>div[role='menuitem']", AI = false)
	public WebElement btnWorkplan;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPAdditionalCoveragesPanelSet-dwellingCoveragePatternIterator-1-CoverageInputSet-CovPatternInputGroup-_checkbox']", AI = false)
	public WebElement chkDebrisRemoval;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_CopySubmission>div[role='menuitem']", AI = false)
	public WebElement btnCopySubmission;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-4-item>div[role='menuitem']", AI = false)
	public WebElement btnGeneralreminderdiary;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPAdditionalCoveragesPanelSet-dwellingCoveragePatternIterator-19-CoverageInputSet-CovPatternInputGroup-0-CovTermInputSet-OptionTermInput']", AI = false)
	public WebElement drpPermitsLimit;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-8-item>div[role='menuitem']", AI = false)
	public WebElement btnGetReinsuranceQuote;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-13-item>div[role='menuitem']", AI = false)
	public WebElement btnReview45dayUWPeriod;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPAdditionalCoveragesPanelSet-dwellingCoveragePatternIterator-5-CoverageInputSet-CovPatternInputGroup-_checkbox']", AI = false)
	public WebElement chkInflationProtection;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-JobWizardToolbarButtonSet-BindOptions-BindOnly>div[role='menuitem']", AI = false)
	public WebElement btnBindOnly;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPOptionalCoveragesPanelSet-dwellingCoveragePatternIterator-14-CoverageInputSet-CovPatternInputGroup-_checkbox']", AI = false)
	public WebElement chkScheduledLandlordsFurnishings;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-14-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnBOP0011059781;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-0-NewActivityMenuItemSet_Category>div[role='menuitem']", AI = false)
	public WebElement btnInterview;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-6-item>div[role='menuitem']", AI = false)
	public WebElement btnPerformanceReview;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-JobWizardToolbarButtonSet-Versions-NewVersion>div[role='menuitem']", AI = false)
	public WebElement btnStartMultiVersion;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-15-item>div[role='menuitem']", AI = false)
	public WebElement btnReviewProducer;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPMainCoveragesTab", AI = false)
	public WebElement btnCoverages;

	@IFindBy(how = How.CSS, using = "select[name$='HOPCovACoinsurance']", AI = false)
	public WebElement drpCoinsurance;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-16-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnBOP0042998142;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-8-item>div[role='menuitem']", AI = false)
	public WebElement btnPolicyReviewMidterm;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPAdditionalCoveragesPanelSet-dwellingCoveragePatternIterator-21-CoverageInputSet-CovPatternInputGroup-_checkbox']", AI = false)
	public WebElement chkGraveMarkers;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPConditionsAndExclusionsPanelSet-lineConditionPatternIterator-0-CoverageInputSet-CovPatternInputGroup-4-CovTermInputSet-PackageTermInput']", AI = false)
	public WebElement drpFursJewelryPreciousStones;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPAdditionalCoveragesPanelSet-dwellingCoveragePatternIterator-7-CoverageInputSet-CovPatternInputGroup-0-CovTermInputSet-OptionTermInput']", AI = false)
	public WebElement drpPropertyRemovalLimit;

	@IFindBy(how = How.CSS, using = "input[name$='HOPCovCDirectLimit']", AI = false)
	public WebElement inpCovCLimit;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-JobWizardToolbarButtonSet-Versions-ViewSideBySide>div[role='menuitem']", AI = false)
	public WebElement btnViewSideBySideVersions;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPAdditionalCoveragesPanelSet-dwellingCoveragePatternIterator-20-CoverageInputSet-CovPatternInputGroup-_checkbox']", AI = false)
	public WebElement chkGlass;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPMainCoveragesPanelSet-dwellingCoveragePatternIterator-2-CoverageInputSet-CovPatternInputGroup-HOPCovCValuationMethod']", AI = false)
	public WebElement drpValuationMethod_2;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-BillingInfo>div[role='menuitem']", AI = false)
	public WebElement btnPayment;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPMainCoveragesPanelSet-liabilityCoveragePatternIterator-1-CoverageInputSet-CovPatternInputGroup-0-CovTermInputSet-OptionTermInput']", AI = false)
	public WebElement drpCovFLimit;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPAdditionalCoveragesPanelSet-dwellingCoveragePatternIterator-11-CoverageInputSet-CovPatternInputGroup-1-CovTermInputSet-BooleanTermInput']", AI = false)
	public WebElement rdbPersonalOnly;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Change-WizardMenuActions_ChangeEffDate>div[role='menuitem']", AI = false)
	public WebElement btnEffectiveDate;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPOptionalCoveragesPanelSet-dwellingCoveragePatternIterator-1-CoverageInputSet-CovPatternInputGroup-1-CovTermInputSet-OptionTermInput']", AI = false)
	public WebElement drpDeductible_13;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPAdditionalCoveragesPanelSet-dwellingCoveragePatternIterator-13-CoverageInputSet-CovPatternInputGroup-0-CovTermInputSet-OptionTermInput']", AI = false)
	public WebElement drpRechargeLimit;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPConditionsAndExclusionsPanelSet-lineConditionPatternIterator-4-CoverageInputSet-CovPatternInputGroup-_checkbox']", AI = false)
	public WebElement chkTrust;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-OOSEPanelSet-NextSliceLink", AI = false)
	public WebElement btnNextBlockedDate;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPMainCoveragesPanelSet-dwellingCoveragePatternIterator-0-CoverageInputSet-CovPatternInputGroup-HOPCovALimit']", AI = false)
	public WebElement inpCovALimit;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPConditionsAndExclusionsPanelSet-dwellingConditionPatternIterator-0-CoverageInputSet-CovPatternInputGroup-_checkbox']", AI = false)
	public WebElement chkUnitownersRentaltoOthers;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-HOPDwelling>div[role='menuitem']", AI = false)
	public WebElement btnDwelling;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-2-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0127025333;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-2-item>div[role='menuitem']", AI = false)
	public WebElement btn90daydiary;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPAdditionalCoveragesPanelSet-liabilityCoveragePatternIterator-2-CoverageInputSet-CovPatternInputGroup-0-CovTermInputSet-OptionTermInput']", AI = false)
	public WebElement drpLossAssessmentLimit;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-JobWizardToolbarButtonSet-BindOptions>div[role='button']", AI = false)
	public WebElement btnBindOptions;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPOptionalCoveragesPanelSet-dwellingCoveragePatternIterator-7-CoverageInputSet-CovPatternInputGroup-_checkbox']", AI = false)
	public WebElement chkEscapedLiquidFuel;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Archiving-WizardMenuActions_SuspendResumeArchiving>div[role='menuitem']", AI = false)
	public WebElement btnEnableDisable;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-JobWizardToolbarButtonSet-BindOptions-BindAndIssue>div[role='menuitem']", AI = false)
	public WebElement btnIssuePolicy;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPAdditionalCoveragesPanelSet-liabilityCoveragePatternIterator-2-CoverageInputSet-CovPatternInputGroup-_checkbox']", AI = false)
	public WebElement chkLossAssessment;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPMainCoveragesPanelSet-dwellingCoveragePatternIterator-1-CoverageInputSet-CovPatternInputGroup-_checkbox']", AI = false)
	public WebElement chkCoverageBOtherStructures;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPAdditionalCoveragesPanelSet-dwellingCoveragePatternIterator-10-CoverageInputSet-CovPatternInputGroup-0-CovTermInputSet-OptionTermInput']", AI = false)
	public WebElement drpPowerFailureExpenseLimit;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPAdditionalCoveragesPanelSet-dwellingCoveragePatternIterator-14-CoverageInputSet-CovPatternInputGroup-0-CovTermInputSet-OptionTermInput']", AI = false)
	public WebElement drpEQFloodOffPremisesLimit;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-MultiQuoteAcceleratedMenuActions-PolicyPeriodSelector", AI = false)
	public WebElement btnPolicyPeriodSelector;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-1-NewActivityMenuItemSet_Category>div[role='menuitem']", AI = false)
	public WebElement btnNewmail;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPMainCoveragesPanelSet-dwellingCoveragePatternIterator-2-CoverageInputSet-CovPatternInputGroup-HOPCovCLimit']", AI = false)
	public WebElement drpCovCLimitPct;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-7-item>div[role='menuitem']", AI = false)
	public WebElement btnGetMotorVehicleReports;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPConditionsAndExclusionsPanelSet-lineConditionPatternIterator-1-CoverageInputSet-CovPatternInputGroup-_checkbox']", AI = false)
	public WebElement chkFireDepartmentSubscription;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-PreQualification>div[role='menuitem']", AI = false)
	public WebElement btnQualification;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPMainCoveragesPanelSet-dwellingCoveragePatternIterator-2-CoverageInputSet-CovPatternInputGroup-HOPCovCCauseOfLoss']", AI = false)
	public WebElement drpCauseofLoss_1;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPAdditionalCoveragesPanelSet-dwellingCoveragePatternIterator-21-CoverageInputSet-CovPatternInputGroup-0-CovTermInputSet-OptionTermInput']", AI = false)
	public WebElement drpMonumentLimit;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPConditionsAndExclusionsPanelSet-lineConditionPatternIterator-0-CoverageInputSet-CovPatternInputGroup-3-CovTermInputSet-OptionTermInput']", AI = false)
	public WebElement drpTrailers;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPAdditionalCoveragesPanelSet-dwellingCoveragePatternIterator-16-CoverageInputSet-CovPatternInputGroup-_checkbox']", AI = false)
	public WebElement chkMortgageClosingCostExpense;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Participants>div[role='menuitem']", AI = false)
	public WebElement btnParticipants;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-4-NewActivityMenuItemSet_Category-0-item>div[role='menuitem']", AI = false)
	public WebElement btnReviewandapprove;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPAdditionalCoveragesPanelSet-dwellingCoveragePatternIterator-10-CoverageInputSet-CovPatternInputGroup-_checkbox']", AI = false)
	public WebElement chk_checkbox_4;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-OOSEPanelSet-OOSEPeriodSelector-OOSEPeriodSelector_Arg']", AI = false)
	public WebElement drpEffectiveDate;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPAdditionalCoveragesPanelSet-dwellingCoveragePatternIterator-14-CoverageInputSet-CovPatternInputGroup-_checkbox']", AI = false)
	public WebElement chk_checkbox_6;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPAdditionalCoveragesPanelSet-dwellingCoveragePatternIterator-19-CoverageInputSet-CovPatternInputGroup-_checkbox']", AI = false)
	public WebElement chk_checkbox_8;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPAdditionalCoveragesPanelSet-dwellingCoveragePatternIterator-15-CoverageInputSet-CovPatternInputGroup-_checkbox']", AI = false)
	public WebElement chk_checkbox_7;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPAdditionalCoveragesPanelSet-liabilityCoveragePatternIterator-3-CoverageInputSet-CovPatternInputGroup-_checkbox']", AI = false)
	public WebElement chkReward;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewDocument>div[role='menuitem']", AI = false)
	public WebElement btnNewDocument;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPOptionalCoveragesPanelSet-dwellingCoveragePatternIterator-6-CoverageInputSet-CovPatternInputGroup-_checkbox']", AI = false)
	public WebElement chkSpecialComputerCoverage;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewDocument-NewJobDocumentMenuItemSet-PolicyPeriodNewDocumentMenuItemSet_Linked>div[role='menuitem']", AI = false)
	public WebElement btnUploaddocuments;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPOptionalCoveragesPanelSet-dwellingCoveragePatternIterator-5-CoverageInputSet-CovPatternInputGroup-_checkbox']", AI = false)
	public WebElement chkSinkholeCollapse;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Finish>div[role='button']", AI = false)
	public WebElement btnFinish;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPMainCoveragesPanelSet-liabilityCoveragePatternIterator-0-CoverageInputSet-CovPatternInputGroup-1-CovTermInputSet-BooleanTermInput']", AI = false)
	public WebElement rdbPersonalInjury;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPAdditionalCoveragesPanelSet-dwellingCoveragePatternIterator-6-CoverageInputSet-CovPatternInputGroup-0-CovTermInputSet-OptionTermInput']", AI = false)
	public WebElement drpFungiRemediationLimit;

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

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-HOPCoverages>div[role='menuitem']", AI = false)
	public WebElement btnCoverages_26;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewNote>div[role='menuitem']", AI = false)
	public WebElement btnNewNote;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-RiskAnalysis>div[role='menuitem']", AI = false)
	public WebElement btnRiskAnalysis;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-4-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0108046463;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-0-NewActivityMenuItemSet_Category-1-item>div[role='menuitem']", AI = false)
	public WebElement btnMeetwithProducerAgency;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-1-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0128045417;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-7-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnCA0005618226;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPConditionsAndExclusionsPanelSet-lineConditionPatternIterator-0-CoverageInputSet-CovPatternInputGroup-9-CovTermInputSet-OptionTermInput']", AI = false)
	public WebElement drpPortableElectronicEquipment;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPAdditionalCoveragesPanelSet-liabilityCoveragePatternIterator-5-CoverageInputSet-CovPatternInputGroup-0-CovTermInputSet-OptionTermInput']", AI = false)
	public WebElement drpPropertyofOthersLimit;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPOptionalCoveragesPanelSet-dwellingCoveragePatternIterator-3-CoverageInputSet-CovPatternInputGroup-_checkbox']", AI = false)
	public WebElement chkEarthquake;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPOptionalCoveragesTab", AI = false)
	public WebElement btnOptionalCoverages;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-PolicyReview>div[role='menuitem']", AI = false)
	public WebElement btnPolicyReview;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-OOSEPanelSet-OOSEPeriodSelector", AI = false)
	public WebElement btnOOSEPeriodSelector;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-11-item>div[role='menuitem']", AI = false)
	public WebElement btnManuallyrateandquotepolicy;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPMainCoveragesPanelSet-liabilityCoveragePatternIterator-0-CoverageInputSet-CovPatternInputGroup-_checkbox']", AI = false)
	public WebElement chkCoverageEPersonalLiability;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPOptionalCoveragesPanelSet-dwellingCoveragePatternIterator-12-CoverageInputSet-CovPatternInputGroup-_checkbox']", AI = false)
	public WebElement chk_checkbox_17;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPOptionalCoveragesPanelSet-dwellingCoveragePatternIterator-10-CoverageInputSet-CovPatternInputGroup-_checkbox']", AI = false)
	public WebElement chk_checkbox_16;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-History>div[role='menuitem']", AI = false)
	public WebElement btnHistory;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPAdditionalCoveragesPanelSet-dwellingCoveragePatternIterator-0-CoverageInputSet-CovPatternInputGroup-0-CovTermInputSet-OptionTermInput']", AI = false)
	public WebElement drpLimit;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPConditionsAndExclusionsPanelSet-dwellingConditionPatternIterator-1-CoverageInputSet-CovPatternInputGroup-_checkbox']", AI = false)
	public WebElement chk_checkbox_19;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPOptionalCoveragesPanelSet-dwellingCoveragePatternIterator-13-CoverageInputSet-CovPatternInputGroup-_checkbox']", AI = false)
	public WebElement chk_checkbox_18;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-10-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnBOP0052212503;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Change>div[role='menuitem']", AI = false)
	public WebElement btnEdit;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPAdditionalCoveragesPanelSet-liabilityCoveragePatternIterator-4-CoverageInputSet-CovPatternInputGroup-_checkbox']", AI = false)
	public WebElement chkFirstAid;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPConditionsAndExclusionsPanelSet-lineConditionPatternIterator-0-CoverageInputSet-CovPatternInputGroup-_checkbox']", AI = false)
	public WebElement chkSpecialLimitations;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-5-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0127285387;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-JobWizardToolbarButtonSet-CloseOptions-WithdrawJob>div[role='menuitem']", AI = false)
	public WebElement btnWithdrawTransaction;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-3-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnBOP0015824087;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-PolicyInfo>div[role='menuitem']", AI = false)
	public WebElement btnPolicyInfo;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPOptionalCoveragesPanelSet-dwellingCoveragePatternIterator-0-CoverageInputSet-CovPatternInputGroup-_checkbox']", AI = false)
	public WebElement chk_checkbox_11;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-ViewMultiLineQuote>div[role='menuitem']", AI = false)
	public WebElement btnQuote_28;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPAdditionalCoveragesPanelSet-liabilityCoveragePatternIterator-1-CoverageInputSet-CovPatternInputGroup-_checkbox']", AI = false)
	public WebElement chk_checkbox_10;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-ViewQuote>div[role='menuitem']", AI = false)
	public WebElement btnQuote_27;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-18-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnCA0084956520;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-20-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnBOP0016789240;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPOptionalCoveragesPanelSet-dwellingCoveragePatternIterator-9-CoverageInputSet-CovPatternInputGroup-_checkbox']", AI = false)
	public WebElement chk_checkbox_15;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPOptionalCoveragesPanelSet-dwellingCoveragePatternIterator-2-CoverageInputSet-CovPatternInputGroup-_checkbox']", AI = false)
	public WebElement chk_checkbox_14;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPConditionsAndExclusionsPanelSet-lineConditionPatternIterator-0-CoverageInputSet-CovPatternInputGroup-5-CovTermInputSet-OptionTermInput']", AI = false)
	public WebElement drpFirearms;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-JobWizardToolbarButtonSet-Versions>div[role='button']", AI = false)
	public WebElement btnVersions;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPMainCoveragesPanelSet-dwellingCoveragePatternIterator-2-CoverageInputSet-CovPatternInputGroup-HOPCovCSelfStorageUnits']", AI = false)
	public WebElement drpSelfStorageUnits;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-Modifiers>div[role='menuitem']", AI = false)
	public WebElement btnModifiers;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_ToAccountFile>div[role='menuitem']", AI = false)
	public WebElement btnAccountFile;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPAdditionalCoveragesPanelSet-dwellingCoveragePatternIterator-9-CoverageInputSet-CovPatternInputGroup-_checkbox']", AI = false)
	public WebElement chkLockReplacement;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPMainCoveragesPanelSet-liabilityCoveragePatternIterator-0-CoverageInputSet-CovPatternInputGroup-0-CovTermInputSet-OptionTermInput']", AI = false)
	public WebElement drpCovELimit;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Change-WizardMenuActions_CopyPolicyData>div[role='menuitem']", AI = false)
	public WebElement btnCopyData;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPConditionsAndExclusionsPanelSet-lineConditionPatternIterator-0-CoverageInputSet-CovPatternInputGroup-2-CovTermInputSet-OptionTermInput']", AI = false)
	public WebElement drpWatercraft;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-QuoteRequestedAlert-CloseBtn", AI = false)
	public WebElement btnClose;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPAdditionalCoveragesPanelSet-liabilityCoveragePatternIterator-5-CoverageInputSet-CovPatternInputGroup-_checkbox']", AI = false)
	public WebElement chkDamagetoPropertyofOthers;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-14-item>div[role='menuitem']", AI = false)
	public WebElement btnReview60dayUWPeriod;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-JobWizardToolbarButtonSet-EditPolicy>div[role='button']", AI = false)
	public WebElement btnEditPolicyTransaction;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPConditionsAndExclusionsPanelSet-lineConditionPatternIterator-0-CoverageInputSet-CovPatternInputGroup-7-CovTermInputSet-OptionTermInput']", AI = false)
	public WebElement drpOptionTermInput;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPConditionsAndExclusionsPanelSet-dwellingExclusionPatternIterator-0-CoverageInputSet-CovPatternInputGroup-_checkbox']", AI = false)
	public WebElement chk_checkbox_22;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity>div[role='menuitem']", AI = false)
	public WebElement btnNewActivity;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPConditionsAndExclusionsPanelSet-lineConditionPatternIterator-3-CoverageInputSet-CovPatternInputGroup-_checkbox']", AI = false)
	public WebElement chk_checkbox_21;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPConditionsAndExclusionsPanelSet-dwellingExclusionPatternIterator-2-CoverageInputSet-CovPatternInputGroup-_checkbox']", AI = false)
	public WebElement chk_checkbox_24;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPConditionsAndExclusionsPanelSet-dwellingExclusionPatternIterator-1-CoverageInputSet-CovPatternInputGroup-_checkbox']", AI = false)
	public WebElement chk_checkbox_23;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPConditionsAndExclusionsPanelSet-lineExclusionPatternIterator-0-CoverageInputSet-CovPatternInputGroup-_checkbox']", AI = false)
	public WebElement chk_checkbox_25;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Cancel>div[role='button']", AI = false)
	public WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup>div[role='menuitem']", AI = false)
	public WebElement btnPolicyContract;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPOptionalCoveragesPanelSet-dwellingCoveragePatternIterator-1-CoverageInputSet-CovPatternInputGroup-_checkbox']", AI = false)
	public WebElement chkRefrigeratedContents;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPAdditionalCoveragesPanelSet-dwellingCoveragePatternIterator-4-CoverageInputSet-CovPatternInputGroup-0-CovTermInputSet-OptionTermInput']", AI = false)
	public WebElement drpFDServiceLimit;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category>div[role='menuitem']", AI = false)
	public WebElement btnRequest;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPAdditionalCoveragesPanelSet-dwellingCoveragePatternIterator-7-CoverageInputSet-CovPatternInputGroup-_checkbox']", AI = false)
	public WebElement chkEmergencyRemovalofProperty;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-9-item>div[role='menuitem']", AI = false)
	public WebElement btnGetRiskInformationProducer;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-1-item>div[role='menuitem']", AI = false)
	public WebElement btnGetAuditInternalPersonnel;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPMainCoveragesPanelSet-dwellingCoveragePatternIterator-1-CoverageInputSet-CovPatternInputGroup-HOPCovBDirectLimit']", AI = false)
	public WebElement inpCovBLimit;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPOptionalCoveragesPanelSet-liabilityCoveragePatternIterator-0-CoverageInputSet-CovPatternInputGroup-_checkbox']", AI = false)
	public WebElement chkValuablePersonalProperty;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-MultiQuoteAcceleratedMenuActions-PolicyPeriodSelector-PolicyPeriodSelector_Arg']", AI = false)
	public WebElement drpPolicyPeriodSelector_Arg;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-DiagWorksheetItem-ShowDiagWorksheet>div[role='menuitem']", AI = false)
	public WebElement btnShowPartialWorksheet;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-1-item>div[role='menuitem']", AI = false)
	public WebElement btn60daydiary;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Prev>div[role='button']", AI = false)
	public WebElement btnBack;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPAdditionalCoveragesPanelSet-dwellingCoveragePatternIterator-0-CoverageInputSet-CovPatternInputGroup-_checkbox']", AI = false)
	public WebElement chkOrdinanceOrLaw;

	@IFindBy(how = How.CSS, using = "select[name$='HOPCovCValuationMethod']", AI = false)
	public WebElement drpValuationMethod;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-9-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0127642470;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-RiskEvaluation>div[role='menuitem']", AI = false)
	public WebElement btnRiskAnalysis_30;

	@IFindBy(how = How.CSS, using = "div[id$='Next']", AI = false)
	public WebElement btnNext;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-19-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnCA0085070507;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-10-item>div[role='menuitem']", AI = false)
	public WebElement btnQuoteRequired;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPConditionsAndExclusionsPanelSet-lineConditionPatternIterator-0-CoverageInputSet-CovPatternInputGroup-8-CovTermInputSet-OptionTermInput']", AI = false)
	public WebElement drpOptionTermInput_20;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPAdditionalCoveragesTab", AI = false)
	public WebElement btnAdditionalCoverages;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPAdditionalCoveragesPanelSet-dwellingCoveragePatternIterator-8-CoverageInputSet-CovPatternInputGroup-_checkbox']", AI = false)
	public WebElement chkTreesShrubsPlantsLawns;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPAdditionalCoveragesPanelSet-liabilityCoveragePatternIterator-0-CoverageInputSet-CovPatternInputGroup-_checkbox']", AI = false)
	public WebElement chkIdentityTheftProtection;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-JobWizardToolbarButtonSet-Draft>div[role='button']", AI = false)
	public WebElement btnSaveDraft;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPMainCoveragesPanelSet-dwellingCoveragePatternIterator-1-CoverageInputSet-CovPatternInputGroup-HOPCovBLimit']", AI = false)
	public WebElement drpCovBLimitPct;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPMainCoveragesPanelSet-dwellingCoveragePatternIterator-3-CoverageInputSet-CovPatternInputGroup-HOPCovDLossOfRent']", AI = false)
	public WebElement rdbLossofRentalIncome;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-3-item>div[role='menuitem']", AI = false)
	public WebElement btnGetBureauData;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPAdditionalCoveragesPanelSet-dwellingCoveragePatternIterator-12-CoverageInputSet-CovPatternInputGroup-_checkbox']", AI = false)
	public WebElement chkLandlordsFurnishings;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Reinsurance>div[role='menuitem']", AI = false)
	public WebElement btnReinsurance;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPAdditionalCoveragesPanelSet-dwellingCoveragePatternIterator-2-CoverageInputSet-CovPatternInputGroup-_checkbox']", AI = false)
	public WebElement chkDebrisRemovalofTrees;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-PolicyVersions>div[role='menuitem']", AI = false)
	public WebElement btnPolicyVersions_29;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-15-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnBOP0085427452;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-QuoteRequestedAlert .gw-AlertBar--label", AI = false)
	public WebElement lblQuoteRequestedAlert;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPOptionalCoveragesPanelSet-dwellingCoveragePatternIterator-11-CoverageInputSet-CovPatternInputGroup-_checkbox']", AI = false)
	public WebElement chkIncreasedLimitOtherStructures;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewDocument-NewJobDocumentMenuItemSet-PolicyPeriodNewDocumentMenuItemSet_Template>div[role='menuitem']", AI = false)
	public WebElement btnCreatefromatemplate;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPOptionalCoveragesPanelSet-liabilityCoveragePatternIterator-1-CoverageInputSet-CovPatternInputGroup-_checkbox']", AI = false)
	public WebElement chkScheduledPersonalProperty;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-JobWizardToolbarButtonSet-Versions-SideBySide>div[role='menuitem']", AI = false)
	public WebElement btnStartSidebySide;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPMainCoveragesPanelSet-dwellingCoveragePatternIterator-2-CoverageInputSet-CovPatternInputGroup-HOPCovCOtherResidence']", AI = false)
	public WebElement drpPropertyatOtherResidence;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Archiving>div[role='menuitem']", AI = false)
	public WebElement btnArchiving;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPAdditionalCoveragesPanelSet-liabilityCoveragePatternIterator-3-CoverageInputSet-CovPatternInputGroup-1-CovTermInputSet-PackageTermInput']", AI = false)
	public WebElement drpLimitforTheftConviction;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-12-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0247907153;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPOptionalCoveragesPanelSet-dwellingCoveragePatternIterator-8-CoverageInputSet-CovPatternInputGroup-_checkbox']", AI = false)
	public WebElement chkGolfCart;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-JobWizardToolbarButtonSet-CloseOptions-NotTakenJob>div[role='menuitem']", AI = false)
	public WebElement btnNotTaken;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPAdditionalCoveragesPanelSet-liabilityCoveragePatternIterator-0-CoverageInputSet-CovPatternInputGroup-1-CovTermInputSet-OptionTermInput']", AI = false)
	public WebElement drpDeductible;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Documents>div[role='menuitem']", AI = false)
	public WebElement btnDocuments;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPMainCoveragesPanelSet-dwellingCoveragePatternIterator-2-CoverageInputSet-CovPatternInputGroup-_checkbox']", AI = false)
	public WebElement chkCoverageCPersonalProperty;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPAdditionalCoveragesPanelSet-dwellingCoveragePatternIterator-13-CoverageInputSet-CovPatternInputGroup-_checkbox']", AI = false)
	public WebElement chkFireExtinguisherRecharge;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPMainCoveragesPanelSet-dwellingCoveragePatternIterator-3-CoverageInputSet-CovPatternInputGroup-HOPCovDDirectLimit']", AI = false)
	public WebElement inpCovDLimit;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-JobGroupItem>div[role='menuitem']", AI = false)
	public WebElement btnSG00031824754074602384;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-JobWizardToolbarButtonSet-QuoteTypeToolbarButtonSet-Quote>div[role='button']", AI = false)
	public WebElement btnQuote;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPConditionsAndExclusionsPanelSet-lineConditionPatternIterator-0-CoverageInputSet-CovPatternInputGroup-10-CovTermInputSet-OptionTermInput']", AI = false)
	public WebElement drpAntennasandElectronicMedia;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-JobWizardToolbarButtonSet-Unlock>div[role='button']", AI = false)
	public WebElement btnReleaseLock;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPMainCoveragesPanelSet-liabilityCoveragePatternIterator-1-CoverageInputSet-CovPatternInputGroup-_checkbox']", AI = false)
	public WebElement chk_checkbox;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-0-item>div[role='menuitem']", AI = false)
	public WebElement btnCreateNewProducer;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPConditionsAndExclusionsPanelSet-lineConditionPatternIterator-2-CoverageInputSet-CovPatternInputGroup-_checkbox']", AI = false)
	public WebElement chkOtherMembersOfYourHousehold;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Forms>div[role='menuitem']", AI = false)
	public WebElement btnForms;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPAdditionalCoveragesPanelSet-dwellingCoveragePatternIterator-17-CoverageInputSet-CovPatternInputGroup-_checkbox']", AI = false)
	public WebElement chkCollapse;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPMainCoveragesPanelSet-dwellingCoveragePatternIterator-3-CoverageInputSet-CovPatternInputGroup-_checkbox']", AI = false)
	public WebElement chkCoverageDLossofUse;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Notes>div[role='menuitem']", AI = false)
	public WebElement btnNotes;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPAdditionalCoveragesPanelSet-dwellingCoveragePatternIterator-5-CoverageInputSet-CovPatternInputGroup-0-CovTermInputSet-OptionTermInput']", AI = false)
	public WebElement drpAnnualIncrease;

	@IFindBy(how = How.CSS, using = "select[name$='HOPCovDProhibitedUse']", AI = false)
	public WebElement drpProhibitedUseCivilAuthority;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-5-item>div[role='menuitem']", AI = false)
	public WebElement btnGetInspectionLossControl;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPOptionalCoveragesPanelSet-liabilityCoveragePatternIterator-2-CoverageInputSet-CovPatternInputGroup-_checkbox']", AI = false)
	public WebElement chkAssistedLivingCare;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create>div[role='menuitem']", AI = false)
	public WebElement btnCreate;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPMainCoveragesPanelSet-dwellingCoveragePatternIterator-0-CoverageInputSet-CovPatternInputGroup-HOPCovACauseOfLoss']", AI = false)
	public WebElement drpCauseofLoss;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-10-item>div[role='menuitem']", AI = false)
	public WebElement btnLegalreview;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPAdditionalCoveragesPanelSet-dwellingCoveragePatternIterator-3-CoverageInputSet-CovPatternInputGroup-_checkbox']", AI = false)
	public WebElement chkReasonableRepairs;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPAdditionalCoveragesPanelSet-dwellingCoveragePatternIterator-11-CoverageInputSet-CovPatternInputGroup-_checkbox']", AI = false)
	public WebElement chkDataandRecords;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-7-item>div[role='menuitem']", AI = false)
	public WebElement btnPolicynotification;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPMainCoveragesPanelSet-dwellingCoveragePatternIterator-0-CoverageInputSet-CovPatternInputGroup-_checkbox']", AI = false)
	public WebElement chkCoverageADwelling;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto>div[role='menuitem']", AI = false)
	public WebElement btnGoto;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-4-NewActivityMenuItemSet_Category>div[role='menuitem']", AI = false)
	public WebElement btnUnderwriterReview;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-0-item>div[role='menuitem']", AI = false)
	public WebElement btn30daydiary;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-0-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnHOP0011359660;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-SideBySide>div[role='menuitem']", AI = false)
	public WebElement btnSidebySideQuoting;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPOptionalCoveragesPanelSet-dwellingCoveragePatternIterator-1-CoverageInputSet-CovPatternInputGroup-0-CovTermInputSet-OptionTermInput']", AI = false)
	public WebElement drpLimit_12;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-13-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0126226969;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-CollectCreditCard>div[role='menuitem']", AI = false)
	public WebElement btnCollectCreditCard;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPAdditionalCoveragesPanelSet-dwellingCoveragePatternIterator-8-CoverageInputSet-CovPatternInputGroup-0-CovTermInputSet-PackageTermInput']", AI = false)
	public WebElement drpLandscapeLimit;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPAdditionalCoveragesPanelSet-dwellingCoveragePatternIterator-4-CoverageInputSet-CovPatternInputGroup-_checkbox']", AI = false)
	public WebElement chkFireDepartmentServiceCharge;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPAdditionalCoveragesPanelSet-liabilityCoveragePatternIterator-3-CoverageInputSet-CovPatternInputGroup-0-CovTermInputSet-PackageTermInput']", AI = false)
	public WebElement drpPackageTermInput;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-11-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnCA0085131592;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-11-item>div[role='menuitem']", AI = false)
	public WebElement btnRatiooutofrange;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-JobWizardToolbarButtonSet-ConvertToFullApp>div[role='button']", AI = false)
	public WebElement btnFullApp;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-DiagWorksheetItem>div[role='menuitem']", AI = false)
	public WebElement btnDiagnosticData;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPAdditionalCoveragesPanelSet-dwellingCoveragePatternIterator-11-CoverageInputSet-CovPatternInputGroup-0-CovTermInputSet-OptionTermInput']", AI = false)
	public WebElement drpDataRecordsLimit;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-17-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnBOP0042873185;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPAdditionalCoveragesPanelSet-dwellingCoveragePatternIterator-18-CoverageInputSet-CovPatternInputGroup-_checkbox']", AI = false)
	public WebElement chkVolcanicAction;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category>div[role='menuitem']", AI = false)
	public WebElement btnReminder;

	@IFindBy(how = How.CSS, using = "div[id$='HOPCoveragesScreen-ttlBar']", AI = false)
	public WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPMainCoveragesPanelSet-dwellingCoveragePatternIterator-3-CoverageInputSet-CovPatternInputGroup-HOPCovDLimit']", AI = false)
	public WebElement drpCovDLimitPct;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPAdditionalCoveragesPanelSet-dwellingCoveragePatternIterator-2-CoverageInputSet-CovPatternInputGroup-0-CovTermInputSet-OptionTermInput']", AI = false)
	public WebElement drpLimit_3;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPAdditionalCoveragesPanelSet-dwellingCoveragePatternIterator-12-CoverageInputSet-CovPatternInputGroup-0-CovTermInputSet-OptionTermInput']", AI = false)
	public WebElement drpLimit_5;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-HOPDwellingConstruction>div[role='menuitem']", AI = false)
	public WebElement btnDwellingConstruction;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPConditionsAndExclusionsPanelSet-lineConditionPatternIterator-0-CoverageInputSet-CovPatternInputGroup-0-CovTermInputSet-OptionTermInput']", AI = false)
	public WebElement drpMoneyPreciousMetals;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPMainCoveragesPanelSet-dwellingCoveragePatternIterator-4-CoverageInputSet-CovPatternInputGroup-0-CovTermInputSet-OptionTermInput']", AI = false)
	public WebElement drpAllPerils;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPMainCoveragesPanelSet-dwellingCoveragePatternIterator-4-CoverageInputSet-CovPatternInputGroup-_checkbox']", AI = false)
	public WebElement chkSectionIDeductibles;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPAdditionalCoveragesPanelSet-liabilityCoveragePatternIterator-1-CoverageInputSet-CovPatternInputGroup-0-CovTermInputSet-OptionTermInput']", AI = false)
	public WebElement drpLimit_9;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPAdditionalCoveragesPanelSet-dwellingCoveragePatternIterator-16-CoverageInputSet-CovPatternInputGroup-0-CovTermInputSet-OptionTermInput']", AI = false)
	public WebElement drpMortgageExpLimit;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-1-NewActivityMenuItemSet_Category-0-item>div[role='menuitem']", AI = false)
	public WebElement btnReviewnewmail;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup>div[role='menuitem']", AI = false)
	public WebElement btnGroup;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-3-item>div[role='menuitem']", AI = false)
	public WebElement btnCancelasplitpolicy;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPConditionsAndExclusionsPanelSet-lineConditionPatternIterator-0-CoverageInputSet-CovPatternInputGroup-1-CovTermInputSet-OptionTermInput']", AI = false)
	public WebElement drpSecurities;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPConditionsAndExclusionsPanelSet-lineConditionPatternIterator-0-CoverageInputSet-CovPatternInputGroup-6-CovTermInputSet-OptionTermInput']", AI = false)
	public WebElement drpSilverwareMetalFlatware;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-2-item>div[role='menuitem']", AI = false)
	public WebElement btnGetAuditOutsideService;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-5-item>div[role='menuitem']", AI = false)
	public WebElement btnNewAuditAssignment;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-16-item>div[role='menuitem']", AI = false)
	public WebElement btnRewritetoNewAccount;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-12-item>div[role='menuitem']", AI = false)
	public WebElement btnReview30dayUWPeriod;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPConditionsAndExclusionsTab", AI = false)
	public WebElement btnConditionsandExclusions;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-ManageBranches>div[role='menuitem']", AI = false)
	public WebElement btnPolicyVersions;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPOptionalCoveragesPanelSet-dwellingCoveragePatternIterator-4-CoverageInputSet-CovPatternInputGroup-_checkbox']", AI = false)
	public WebElement chkExtendedResidenceTheft;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-6-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0108221556;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPAdditionalCoveragesPanelSet-liabilityCoveragePatternIterator-0-CoverageInputSet-CovPatternInputGroup-0-CovTermInputSet-OptionTermInput']", AI = false)
	public WebElement drpIDTheftLimit;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-HOPAdditionalCoveragesPanelSet-dwellingCoveragePatternIterator-6-CoverageInputSet-CovPatternInputGroup-_checkbox']", AI = false)
	public WebElement chkFungusMoldRemediation;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-8-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0108520862;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-JobWizardToolbarButtonSet-CloseOptions>div[role='button']", AI = false)
	public WebElement btnCloseOptions;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_ToPolicyFile>div[role='menuitem']", AI = false)
	public WebElement btnPolicyFile;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-17-item>div[role='menuitem']", AI = false)
	public WebElement btnVerifycoverage;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-4-item>div[role='menuitem']", AI = false)
	public WebElement btnGetCreditReports;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPCoveragesScreen-JobWizardToolbarButtonSet-CloseOptions-Decline>div[role='menuitem']", AI = false)
	public WebElement btnDecline;

	@IFindBy(how = How.CSS, using = "div[id=$'SubmissionWizard-WizardMenuActions']>div[role='button']", AI = false)
	public WebElement btnWizardMenuActions;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardActionsMenuItemSet-SubmissionInfo>div[role='menuitem']", AI = false)
	public WebElement btnSubManager;

	@IFindBy(how = How.CSS, using = "input[id*='CovDLossOfRent'][aria-label='Yes']", AI = false)
	public WebElement rdbLossOfUseYes;

	@IFindBy(how = How.CSS, using = "input[id*='CovDLossOfRent'][aria-label='No']", AI = false)
	public WebElement rdbLossOfUseNo;

	public CoveragePage(){
	}

	public CoveragePage(WebDriver driver){
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, Utils.maxElementWait);
		PageFactory.initElements(finder, this);
		elementLayer = new ElementLayer(driver);
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
	}public CoveragePage clickWorkplan(WebDriver driver)  {
		BrowserActions.click(driver, btnWorkplan,"Workplan");
		return this;
	}
	public CoveragePage clickDebrisRemoval(WebDriver driver)  {
		BrowserActions.click(driver, chkDebrisRemoval,"DebrisRemoval");
		return this;
	}
	public CoveragePage clickCopySubmission(WebDriver driver)  {
		BrowserActions.click(driver, btnCopySubmission,"CopySubmission");
		return this;
	}
	public CoveragePage clickGeneralreminderdiary(WebDriver driver)  {
		BrowserActions.click(driver, btnGeneralreminderdiary,"Generalreminderdiary");
		return this;
	}
	public CoveragePage selectPermitsLimit(WebDriver driver,String PermitsLimit)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPermitsLimit,PermitsLimit,"PermitsLimit");
		return this;
	}
	public CoveragePage clickGetReinsuranceQuote(WebDriver driver)  {
		BrowserActions.click(driver, btnGetReinsuranceQuote,"GetReinsuranceQuote");
		return this;
	}
	public CoveragePage clickReview45dayUWPeriod(WebDriver driver)  {
		BrowserActions.click(driver, btnReview45dayUWPeriod,"Review45dayUWPeriod");
		return this;
	}
	public CoveragePage clickInflationProtection(WebDriver driver)  {
		BrowserActions.click(driver, chkInflationProtection,"InflationProtection");
		return this;
	}
	public CoveragePage clickBindOnly(WebDriver driver)  {
		BrowserActions.click(driver, btnBindOnly,"BindOnly");
		return this;
	}
	public CoveragePage clickScheduledLandlordsFurnishings(WebDriver driver)  {
		BrowserActions.click(driver, chkScheduledLandlordsFurnishings,"ScheduledLandlordsFurnishings");
		return this;
	}
	public CoveragePage clickBOP0011059781(WebDriver driver)  {
		BrowserActions.click(driver, btnBOP0011059781,"BOP0011059781");
		return this;
	}
	public CoveragePage clickInterview(WebDriver driver)  {
		BrowserActions.click(driver, btnInterview,"Interview");
		return this;
	}
	public CoveragePage clickPerformanceReview(WebDriver driver)  {
		BrowserActions.click(driver, btnPerformanceReview,"PerformanceReview");
		return this;
	}
	public CoveragePage clickStartMultiVersion(WebDriver driver)  {
		BrowserActions.click(driver, btnStartMultiVersion,"StartMultiVersion");
		return this;
	}
	public CoveragePage clickReviewProducer(WebDriver driver)  {
		BrowserActions.click(driver, btnReviewProducer,"ReviewProducer");
		return this;
	}
	public CoveragePage clickCoverages(WebDriver driver)  {
		BrowserActions.click(driver, btnCoverages,"Coverages");
		return this;
	}
	public CoveragePage selectCoinsurance(WebDriver driver,String Coinsurance)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCoinsurance,Coinsurance,1,"Coinsurance");
		return this;
	}
	public CoveragePage clickBOP0042998142(WebDriver driver)  {
		BrowserActions.click(driver, btnBOP0042998142,"BOP0042998142");
		return this;
	}
	public CoveragePage clickPolicyReviewMidterm(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyReviewMidterm,"PolicyReviewMidterm");
		return this;
	}
	public CoveragePage clickGraveMarkers(WebDriver driver)  {
		BrowserActions.click(driver, chkGraveMarkers,"GraveMarkers");
		return this;
	}
	public CoveragePage selectFursJewelryPreciousStones(WebDriver driver,String FursJewelryPreciousStones)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpFursJewelryPreciousStones,FursJewelryPreciousStones,"FursJewelryPreciousStones");
		return this;
	}
	public CoveragePage selectPropertyRemovalLimit(WebDriver driver,String PropertyRemovalLimit)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPropertyRemovalLimit,PropertyRemovalLimit,"PropertyRemovalLimit");
		return this;
	}
	public CoveragePage enterCovCLimit(WebDriver driver,String CovCLimit) {
		BrowserActions.type(driver, inpCovCLimit,CovCLimit,true,"CovCLimit");
		return this;
	}
	public CoveragePage clickViewSideBySideVersions(WebDriver driver)  {
		BrowserActions.click(driver, btnViewSideBySideVersions,"ViewSideBySideVersions");
		return this;
	}
	public CoveragePage clickGlass(WebDriver driver)  {
		BrowserActions.click(driver, chkGlass,"Glass");
		return this;
	}
	public CoveragePage selectValuationMethod_2(WebDriver driver,String ValuationMethod_2)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpValuationMethod_2,ValuationMethod_2,true,"ValuationMethod_2");
		return this;
	}
	public CoveragePage clickPayment(WebDriver driver)  {
		BrowserActions.click(driver, btnPayment,"Payment");
		return this;
	}
	public CoveragePage selectCovFLimit(WebDriver driver,String CovFLimit)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCovFLimit,CovFLimit,"CovFLimit");
		return this;
	}
	public CoveragePage clickPersonalOnly(WebDriver driver)  {
		BrowserActions.click(driver, rdbPersonalOnly,"PersonalOnly");
		return this;
	}
	public CoveragePage clickEffectiveDate(WebDriver driver)  {
		BrowserActions.click(driver, btnEffectiveDate,"EffectiveDate");
		return this;
	}
	public CoveragePage selectDeductible_13(WebDriver driver,String Deductible_13)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpDeductible_13,Deductible_13,"Deductible_13");
		return this;
	}
	public CoveragePage selectRechargeLimit(WebDriver driver,String RechargeLimit)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpRechargeLimit,RechargeLimit,"RechargeLimit");
		return this;
	}
	public CoveragePage clickTrust(WebDriver driver)  {
		BrowserActions.click(driver, chkTrust,"Trust");
		return this;
	}
	public CoveragePage clickNextBlockedDate(WebDriver driver)  {
		BrowserActions.click(driver, btnNextBlockedDate,"NextBlockedDate");
		return this;
	}
	public CoveragePage enterCovALimit(WebDriver driver,String CovALimit) {
		BrowserActions.type(driver, inpCovALimit,CovALimit, "CovALimit");
		return this;
	}
	public CoveragePage clickUnitownersRentaltoOthers(WebDriver driver)  {
		BrowserActions.click(driver, chkUnitownersRentaltoOthers,"UnitownersRentaltoOthers");
		return this;
	}
	public CoveragePage clickDwelling(WebDriver driver)  {
		BrowserActions.click(driver, btnDwelling,"Dwelling");
		return this;
	}
	public CoveragePage clickPA0127025333(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0127025333,"PA0127025333");
		return this;
	}
	public CoveragePage click90daydiary(WebDriver driver)  {
		BrowserActions.click(driver, btn90daydiary,"90daydiary");
		return this;
	}
	public CoveragePage selectLossAssessmentLimit(WebDriver driver,String LossAssessmentLimit)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpLossAssessmentLimit,LossAssessmentLimit,"LossAssessmentLimit");
		return this;
	}
	public CoveragePage clickBindOptions(WebDriver driver)  {
		BrowserActions.click(driver, btnBindOptions,"BindOptions");
		return this;
	}
	public CoveragePage clickEscapedLiquidFuel(WebDriver driver)  {
		BrowserActions.click(driver, chkEscapedLiquidFuel,"EscapedLiquidFuel");
		return this;
	}
	public CoveragePage clickEnableDisable(WebDriver driver)  {
		BrowserActions.click(driver, btnEnableDisable,"EnableDisable");
		return this;
	}
	public CoveragePage clickIssuePolicy(WebDriver driver)  {
		BrowserActions.click(driver, btnIssuePolicy,"IssuePolicy");
		return this;
	}
	public CoveragePage clickLossAssessment(WebDriver driver)  {
		BrowserActions.click(driver, chkLossAssessment,"LossAssessment");
		return this;
	}
	public CoveragePage clickCoverageBOtherStructures(WebDriver driver)  {
		BrowserActions.click(driver, chkCoverageBOtherStructures,"CoverageBOtherStructures");
		return this;
	}
	public CoveragePage selectPowerFailureExpenseLimit(WebDriver driver,String PowerFailureExpenseLimit)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPowerFailureExpenseLimit,PowerFailureExpenseLimit,"PowerFailureExpenseLimit");
		return this;
	}
	public CoveragePage selectEQFloodOffPremisesLimit(WebDriver driver,String EQFloodOffPremisesLimit)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpEQFloodOffPremisesLimit,EQFloodOffPremisesLimit,"EQFloodOffPremisesLimit");
		return this;
	}
	public CoveragePage clickPolicyPeriodSelector(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyPeriodSelector,"PolicyPeriodSelector");
		return this;
	}
	public CoveragePage clickNewmail(WebDriver driver)  {
		BrowserActions.click(driver, btnNewmail,"Newmail");
		return this;
	}
	public CoveragePage selectCovCLimitPct(WebDriver driver,String CovCLimitPct)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCovCLimitPct,CovCLimitPct,"CovCLimitPct");
		return this;
	}
	public CoveragePage clickGetMotorVehicleReports(WebDriver driver)  {
		BrowserActions.click(driver, btnGetMotorVehicleReports,"GetMotorVehicleReports");
		return this;
	}
	public CoveragePage clickFireDepartmentSubscription(WebDriver driver)  {
		BrowserActions.click(driver, chkFireDepartmentSubscription,"FireDepartmentSubscription");
		return this;
	}
	public CoveragePage clickQualification(WebDriver driver)  {
		BrowserActions.click(driver, btnQualification,"Qualification");
		return this;
	}
	public CoveragePage selectCauseofLoss_1(WebDriver driver,String CauseofLoss_1)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCauseofLoss_1,CauseofLoss_1,"CauseofLoss_1");
		return this;
	}
	public CoveragePage selectMonumentLimit(WebDriver driver,String MonumentLimit)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpMonumentLimit,MonumentLimit,"MonumentLimit");
		return this;
	}
	public CoveragePage selectTrailers(WebDriver driver,String Trailers)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTrailers,Trailers,"Trailers");
		return this;
	}
	public CoveragePage clickMortgageClosingCostExpense(WebDriver driver)  {
		BrowserActions.click(driver, chkMortgageClosingCostExpense,"MortgageClosingCostExpense");
		return this;
	}
	public CoveragePage clickParticipants(WebDriver driver)  {
		BrowserActions.click(driver, btnParticipants,"Participants");
		return this;
	}
	public CoveragePage clickReviewandapprove(WebDriver driver)  {
		BrowserActions.click(driver, btnReviewandapprove,"Reviewandapprove");
		return this;
	}
	public CoveragePage click_checkbox_4(WebDriver driver)  {
		BrowserActions.click(driver, chk_checkbox_4,"_checkbox_4");
		return this;
	}
	public CoveragePage selectEffectiveDate(WebDriver driver,String EffectiveDate)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpEffectiveDate,EffectiveDate,"EffectiveDate");
		return this;
	}
	public CoveragePage click_checkbox_6(WebDriver driver)  {
		BrowserActions.click(driver, chk_checkbox_6,"_checkbox_6");
		return this;
	}
	public CoveragePage click_checkbox_8(WebDriver driver)  {
		BrowserActions.click(driver, chk_checkbox_8,"_checkbox_8");
		return this;
	}
	public CoveragePage click_checkbox_7(WebDriver driver)  {
		BrowserActions.click(driver, chk_checkbox_7,"_checkbox_7");
		return this;
	}
	public CoveragePage clickReward(WebDriver driver)  {
		BrowserActions.click(driver, chkReward,"Reward");
		return this;
	}
	public CoveragePage clickNewDocument(WebDriver driver)  {
		BrowserActions.click(driver, btnNewDocument,"NewDocument");
		return this;
	}
	public CoveragePage clickSpecialComputerCoverage(WebDriver driver)  {
		BrowserActions.click(driver, chkSpecialComputerCoverage,"SpecialComputerCoverage");
		return this;
	}
	public CoveragePage clickUploaddocuments(WebDriver driver)  {
		BrowserActions.click(driver, btnUploaddocuments,"Uploaddocuments");
		return this;
	}
	public CoveragePage clickSinkholeCollapse(WebDriver driver)  {
		BrowserActions.click(driver, chkSinkholeCollapse,"SinkholeCollapse");
		return this;
	}
	public CoveragePage clickFinish(WebDriver driver)  {
		BrowserActions.click(driver, btnFinish,"Finish");
		return this;
	}
	public CoveragePage clickPersonalInjury(WebDriver driver)  {
		BrowserActions.click(driver, rdbPersonalInjury,"PersonalInjury");
		return this;
	}
	public CoveragePage selectFungiRemediationLimit(WebDriver driver,String FungiRemediationLimit)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpFungiRemediationLimit,FungiRemediationLimit,"FungiRemediationLimit");
		return this;
	}
	public CoveragePage clickProductDefinition(WebDriver driver)  {
		BrowserActions.click(driver, btnProductDefinition,"ProductDefinition");
		return this;
	}
	public CoveragePage clickGetInspectionOutsideService(WebDriver driver)  {
		BrowserActions.click(driver, btnGetInspectionOutsideService,"GetInspectionOutsideService");
		return this;
	}
	public CoveragePage clickMeetwithInsured(WebDriver driver)  {
		BrowserActions.click(driver, btnMeetwithInsured,"MeetwithInsured");
		return this;
	}
	public CoveragePage clickOfferings(WebDriver driver)  {
		BrowserActions.click(driver, btnOfferings,"Offerings");
		return this;
	}
	public CoveragePage clickPolicyReviewRenewal(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyReviewRenewal,"PolicyReviewRenewal");
		return this;
	}
	public CoveragePage clickCoverages_26(WebDriver driver)  {
		BrowserActions.click(driver, btnCoverages_26,"Coverages_26");
		return this;
	}
	public CoveragePage clickNewNote(WebDriver driver)  {
		BrowserActions.click(driver, btnNewNote,"NewNote");
		return this;
	}
	public CoveragePage clickRiskAnalysis(WebDriver driver)  {
		BrowserActions.click(driver, btnRiskAnalysis,"RiskAnalysis");
		return this;
	}
	public CoveragePage clickPA0108046463(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0108046463,"PA0108046463");
		return this;
	}
	public CoveragePage clickMeetwithProducerAgency(WebDriver driver)  {
		BrowserActions.click(driver, btnMeetwithProducerAgency,"MeetwithProducerAgency");
		return this;
	}
	public CoveragePage clickPA0128045417(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0128045417,"PA0128045417");
		return this;
	}
	public CoveragePage clickCA0005618226(WebDriver driver)  {
		BrowserActions.click(driver, btnCA0005618226,"CA0005618226");
		return this;
	}
	public CoveragePage selectPortableElectronicEquipment(WebDriver driver,String PortableElectronicEquipment)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPortableElectronicEquipment,PortableElectronicEquipment,"PortableElectronicEquipment");
		return this;
	}
	public CoveragePage selectPropertyofOthersLimit(WebDriver driver,String PropertyofOthersLimit)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPropertyofOthersLimit,PropertyofOthersLimit,"PropertyofOthersLimit");
		return this;
	}
	public CoveragePage clickEarthquake(WebDriver driver)  {
		BrowserActions.click(driver, chkEarthquake,"Earthquake");
		return this;
	}
	public CoveragePage clickOptionalCoverages(WebDriver driver)  {
		BrowserActions.click(driver, btnOptionalCoverages,"OptionalCoverages");
		return this;
	}
	public CoveragePage clickPolicyReview(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyReview,"PolicyReview");
		return this;
	}
	public CoveragePage clickOOSEPeriodSelector(WebDriver driver)  {
		BrowserActions.click(driver, btnOOSEPeriodSelector,"OOSEPeriodSelector");
		return this;
	}
	public CoveragePage clickManuallyrateandquotepolicy(WebDriver driver)  {
		BrowserActions.click(driver, btnManuallyrateandquotepolicy,"Manuallyrateandquotepolicy");
		return this;
	}
	public CoveragePage clickCoverageEPersonalLiability(WebDriver driver)  {
		BrowserActions.click(driver, chkCoverageEPersonalLiability,"CoverageEPersonalLiability");
		return this;
	}
	public CoveragePage click_checkbox_17(WebDriver driver)  {
		BrowserActions.click(driver, chk_checkbox_17,"_checkbox_17");
		return this;
	}
	public CoveragePage click_checkbox_16(WebDriver driver)  {
		BrowserActions.click(driver, chk_checkbox_16,"_checkbox_16");
		return this;
	}
	public CoveragePage clickHistory(WebDriver driver)  {
		BrowserActions.click(driver, btnHistory,"History");
		return this;
	}
	public CoveragePage selectLimit(WebDriver driver,String Limit)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpLimit,Limit,"Limit");
		return this;
	}
	public CoveragePage click_checkbox_19(WebDriver driver)  {
		BrowserActions.click(driver, chk_checkbox_19,"_checkbox_19");
		return this;
	}
	public CoveragePage click_checkbox_18(WebDriver driver)  {
		BrowserActions.click(driver, chk_checkbox_18,"_checkbox_18");
		return this;
	}
	public CoveragePage clickBOP0052212503(WebDriver driver)  {
		BrowserActions.click(driver, btnBOP0052212503,"BOP0052212503");
		return this;
	}
	public CoveragePage clickEdit(WebDriver driver)  {
		BrowserActions.click(driver, btnEdit,"Edit");
		return this;
	}
	public CoveragePage clickFirstAid(WebDriver driver)  {
		BrowserActions.click(driver, chkFirstAid,"FirstAid");
		return this;
	}
	public CoveragePage clickSpecialLimitations(WebDriver driver)  {
		BrowserActions.click(driver, chkSpecialLimitations,"SpecialLimitations");
		return this;
	}
	public CoveragePage clickPA0127285387(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0127285387,"PA0127285387");
		return this;
	}
	public CoveragePage clickWithdrawTransaction(WebDriver driver)  {
		BrowserActions.click(driver, btnWithdrawTransaction,"WithdrawTransaction");
		return this;
	}
	public CoveragePage clickBOP0015824087(WebDriver driver)  {
		BrowserActions.click(driver, btnBOP0015824087,"BOP0015824087");
		return this;
	}
	public CoveragePage clickPolicyInfo(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyInfo,"PolicyInfo");
		return this;
	}
	public CoveragePage click_checkbox_11(WebDriver driver)  {
		BrowserActions.click(driver, chk_checkbox_11,"_checkbox_11");
		return this;
	}
	public CoveragePage clickQuote_28(WebDriver driver)  {
		BrowserActions.click(driver, btnQuote_28,"Quote_28");
		return this;
	}
	public CoveragePage click_checkbox_10(WebDriver driver)  {
		BrowserActions.click(driver, chk_checkbox_10,"_checkbox_10");
		return this;
	}
	public CoveragePage clickQuote_27(WebDriver driver)  {
		BrowserActions.click(driver, btnQuote_27,"Quote_27");
		return this;
	}
	public CoveragePage clickCA0084956520(WebDriver driver)  {
		BrowserActions.click(driver, btnCA0084956520,"CA0084956520");
		return this;
	}
	public CoveragePage clickBOP0016789240(WebDriver driver)  {
		BrowserActions.click(driver, btnBOP0016789240,"BOP0016789240");
		return this;
	}
	public CoveragePage click_checkbox_15(WebDriver driver)  {
		BrowserActions.click(driver, chk_checkbox_15,"_checkbox_15");
		return this;
	}
	public CoveragePage click_checkbox_14(WebDriver driver)  {
		BrowserActions.click(driver, chk_checkbox_14,"_checkbox_14");
		return this;
	}
	public CoveragePage selectFirearms(WebDriver driver,String Firearms)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpFirearms,Firearms,"Firearms");
		return this;
	}
	public CoveragePage clickVersions(WebDriver driver)  {
		BrowserActions.click(driver, btnVersions,"Versions");
		return this;
	}
	public CoveragePage selectSelfStorageUnits(WebDriver driver,String SelfStorageUnits)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpSelfStorageUnits,SelfStorageUnits,"SelfStorageUnits");
		return this;
	}
	public CoveragePage clickModifiers(WebDriver driver)  {
		BrowserActions.click(driver, btnModifiers,"Modifiers");
		return this;
	}
	public CoveragePage clickAccountFile(WebDriver driver)  {
		BrowserActions.click(driver, btnAccountFile,"AccountFile");
		return this;
	}
	public CoveragePage clickLockReplacement(WebDriver driver)  {
		BrowserActions.click(driver, chkLockReplacement,"LockReplacement");
		return this;
	}
	public CoveragePage selectCovELimit(WebDriver driver,String CovELimit)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCovELimit,CovELimit,"CovELimit");
		return this;
	}
	public CoveragePage clickCopyData(WebDriver driver)  {
		BrowserActions.click(driver, btnCopyData,"CopyData");
		return this;
	}
	public CoveragePage selectWatercraft(WebDriver driver,String Watercraft)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpWatercraft,Watercraft,"Watercraft");
		return this;
	}
	public CoveragePage clickClose(WebDriver driver)  {
		BrowserActions.click(driver, btnClose,"Close");
		return this;
	}
	public CoveragePage clickDamagetoPropertyofOthers(WebDriver driver)  {
		BrowserActions.click(driver, chkDamagetoPropertyofOthers,"DamagetoPropertyofOthers");
		return this;
	}
	public CoveragePage clickReview60dayUWPeriod(WebDriver driver)  {
		BrowserActions.click(driver, btnReview60dayUWPeriod,"Review60dayUWPeriod");
		return this;
	}
	public CoveragePage clickEditPolicyTransaction(WebDriver driver)  {
		BrowserActions.click(driver, btnEditPolicyTransaction,"EditPolicyTransaction");
		return this;
	}
	public CoveragePage selectOptionTermInput(WebDriver driver,String OptionTermInput)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpOptionTermInput,OptionTermInput,"OptionTermInput");
		return this;
	}
	public CoveragePage click_checkbox_22(WebDriver driver)  {
		BrowserActions.click(driver, chk_checkbox_22,"_checkbox_22");
		return this;
	}
	public CoveragePage clickNewActivity(WebDriver driver)  {
		BrowserActions.click(driver, btnNewActivity,"NewActivity");
		return this;
	}
	public CoveragePage click_checkbox_21(WebDriver driver)  {
		BrowserActions.click(driver, chk_checkbox_21,"_checkbox_21");
		return this;
	}
	public CoveragePage click_checkbox_24(WebDriver driver)  {
		BrowserActions.click(driver, chk_checkbox_24,"_checkbox_24");
		return this;
	}
	public CoveragePage click_checkbox_23(WebDriver driver)  {
		BrowserActions.click(driver, chk_checkbox_23,"_checkbox_23");
		return this;
	}
	public CoveragePage click_checkbox_25(WebDriver driver)  {
		BrowserActions.click(driver, chk_checkbox_25,"_checkbox_25");
		return this;
	}
	public CoveragePage clickCancel(WebDriver driver)  {
		BrowserActions.click(driver, btnCancel,"Cancel");
		return this;
	}
	public CoveragePage clickPolicyContract(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyContract,"PolicyContract");
		return this;
	}
	public CoveragePage clickRefrigeratedContents(WebDriver driver)  {
		BrowserActions.click(driver, chkRefrigeratedContents,"RefrigeratedContents");
		return this;
	}
	public CoveragePage selectFDServiceLimit(WebDriver driver,String FDServiceLimit)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpFDServiceLimit,FDServiceLimit,"FDServiceLimit");
		return this;
	}
	public CoveragePage clickRequest(WebDriver driver)  {
		BrowserActions.click(driver, btnRequest,"Request");
		return this;
	}
	public CoveragePage clickEmergencyRemovalofProperty(WebDriver driver)  {
		BrowserActions.click(driver, chkEmergencyRemovalofProperty,"EmergencyRemovalofProperty");
		return this;
	}
	public CoveragePage clickGetRiskInformationProducer(WebDriver driver)  {
		BrowserActions.click(driver, btnGetRiskInformationProducer,"GetRiskInformationProducer");
		return this;
	}
	public CoveragePage clickGetAuditInternalPersonnel(WebDriver driver)  {
		BrowserActions.click(driver, btnGetAuditInternalPersonnel,"GetAuditInternalPersonnel");
		return this;
	}
	public CoveragePage enterCovBLimit(WebDriver driver,String CovBLimit) {
		BrowserActions.type(driver, inpCovBLimit,CovBLimit, "CovBLimit");
		return this;
	}
	public CoveragePage clickValuablePersonalProperty(WebDriver driver)  {
		BrowserActions.click(driver, chkValuablePersonalProperty,"ValuablePersonalProperty");
		return this;
	}
	public CoveragePage selectPolicyPeriodSelector_Arg(WebDriver driver,String PolicyPeriodSelector_Arg)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPolicyPeriodSelector_Arg,PolicyPeriodSelector_Arg,"PolicyPeriodSelector_Arg");
		return this;
	}
	public CoveragePage clickShowPartialWorksheet(WebDriver driver)  {
		BrowserActions.click(driver, btnShowPartialWorksheet,"ShowPartialWorksheet");
		return this;
	}
	public CoveragePage click60daydiary(WebDriver driver)  {
		BrowserActions.click(driver, btn60daydiary,"60daydiary");
		return this;
	}
	public CoveragePage clickBack(WebDriver driver)  {
		BrowserActions.click(driver, btnBack,"Back");
		return this;
	}
	public CoveragePage clickOrdinanceOrLaw(WebDriver driver)  {
		BrowserActions.click(driver, chkOrdinanceOrLaw,"OrdinanceOrLaw");
		return this;
	}
	public CoveragePage selectValuationMethod(WebDriver driver,String ValuationMethod)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpValuationMethod,ValuationMethod,true,"ValuationMethod");
		return this;
	}
	public CoveragePage clickPA0127642470(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0127642470,"PA0127642470");
		return this;
	}
	public CoveragePage clickRiskAnalysis_30(WebDriver driver)  {
		BrowserActions.click(driver, btnRiskAnalysis_30,"RiskAnalysis_30");
		return this;
	}
	public CoveragePage clickNext(WebDriver driver)  {
		BrowserActions.click(driver, btnNext,0.5,"Next");
		return this;
	}
	public CoveragePage clickCA0085070507(WebDriver driver)  {
		BrowserActions.click(driver, btnCA0085070507,"CA0085070507");
		return this;
	}
	public CoveragePage clickQuoteRequired(WebDriver driver)  {
		BrowserActions.click(driver, btnQuoteRequired,"QuoteRequired");
		return this;
	}
	public CoveragePage selectOptionTermInput_20(WebDriver driver,String OptionTermInput_20)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpOptionTermInput_20,OptionTermInput_20,"OptionTermInput_20");
		return this;
	}
	public CoveragePage clickAdditionalCoverages(WebDriver driver)  {
		BrowserActions.click(driver, btnAdditionalCoverages,"AdditionalCoverages");
		return this;
	}
	public CoveragePage clickTreesShrubsPlantsLawns(WebDriver driver)  {
		BrowserActions.click(driver, chkTreesShrubsPlantsLawns,"TreesShrubsPlantsLawns");
		return this;
	}
	public CoveragePage clickIdentityTheftProtection(WebDriver driver)  {
		BrowserActions.click(driver, chkIdentityTheftProtection,"IdentityTheftProtection");
		return this;
	}
	public CoveragePage clickSaveDraft(WebDriver driver)  {
		BrowserActions.click(driver, btnSaveDraft,"SaveDraft");
		return this;
	}
	public CoveragePage selectCovBLimitPct(WebDriver driver,String CovBLimitPct)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCovBLimitPct,CovBLimitPct,"CovBLimitPct");
		return this;
	}
	public CoveragePage clickLossofRentalIncome(WebDriver driver)  {
		BrowserActions.click(driver, rdbLossofRentalIncome,"LossofRentalIncome");
		return this;
	}
	public CoveragePage clickGetBureauData(WebDriver driver)  {
		BrowserActions.click(driver, btnGetBureauData,"GetBureauData");
		return this;
	}
	public CoveragePage clickLandlordsFurnishings(WebDriver driver)  {
		BrowserActions.click(driver, chkLandlordsFurnishings,"LandlordsFurnishings");
		return this;
	}
	public CoveragePage clickReinsurance(WebDriver driver)  {
		BrowserActions.click(driver, btnReinsurance,"Reinsurance");
		return this;
	}
	public CoveragePage clickDebrisRemovalofTrees(WebDriver driver)  {
		BrowserActions.click(driver, chkDebrisRemovalofTrees,"DebrisRemovalofTrees");
		return this;
	}
	public CoveragePage clickPolicyVersions_29(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyVersions_29,"PolicyVersions_29");
		return this;
	}
	public CoveragePage clickBOP0085427452(WebDriver driver)  {
		BrowserActions.click(driver, btnBOP0085427452,"BOP0085427452");
		return this;
	}
	public CoveragePage clickIncreasedLimitOtherStructures(WebDriver driver)  {
		BrowserActions.click(driver, chkIncreasedLimitOtherStructures,"IncreasedLimitOtherStructures");
		return this;
	}
	public CoveragePage clickCreatefromatemplate(WebDriver driver)  {
		BrowserActions.click(driver, btnCreatefromatemplate,"Createfromatemplate");
		return this;
	}
	public CoveragePage clickScheduledPersonalProperty(WebDriver driver)  {
		BrowserActions.click(driver, chkScheduledPersonalProperty,"ScheduledPersonalProperty");
		return this;
	}
	public CoveragePage clickStartSidebySide(WebDriver driver)  {
		BrowserActions.click(driver, btnStartSidebySide,"StartSidebySide");
		return this;
	}
	public CoveragePage selectPropertyatOtherResidence(WebDriver driver,String PropertyatOtherResidence)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPropertyatOtherResidence,PropertyatOtherResidence,"PropertyatOtherResidence");
		return this;
	}
	public CoveragePage clickArchiving(WebDriver driver)  {
		BrowserActions.click(driver, btnArchiving,"Archiving");
		return this;
	}
	public CoveragePage selectLimitforTheftConviction(WebDriver driver,String LimitforTheftConviction)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpLimitforTheftConviction,LimitforTheftConviction,"LimitforTheftConviction");
		return this;
	}
	public CoveragePage clickPA0247907153(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0247907153,"PA0247907153");
		return this;
	}
	public CoveragePage clickGolfCart(WebDriver driver)  {
		BrowserActions.click(driver, chkGolfCart,"GolfCart");
		return this;
	}
	public CoveragePage clickNotTaken(WebDriver driver)  {
		BrowserActions.click(driver, btnNotTaken,"NotTaken");
		return this;
	}
	public CoveragePage selectDeductible(WebDriver driver,String Deductible)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpDeductible,Deductible,"Deductible");
		return this;
	}
	public CoveragePage clickDocuments(WebDriver driver)  {
		BrowserActions.click(driver, btnDocuments,"Documents");
		return this;
	}
	public CoveragePage clickCoverageCPersonalProperty(WebDriver driver)  {
		BrowserActions.click(driver, chkCoverageCPersonalProperty,"CoverageCPersonalProperty");
		return this;
	}
	public CoveragePage clickFireExtinguisherRecharge(WebDriver driver)  {
		BrowserActions.click(driver, chkFireExtinguisherRecharge,"FireExtinguisherRecharge");
		return this;
	}
	public CoveragePage enterCovDLimit(WebDriver driver,String CovDLimit) {
		BrowserActions.type(driver, inpCovDLimit,CovDLimit, "CovDLimit");
		return this;
	}
	public CoveragePage clickSG00031824754074602384(WebDriver driver)  {
		BrowserActions.click(driver, btnSG00031824754074602384,"SG00031824754074602384");
		return this;
	}
	public CoveragePage clickQuote(WebDriver driver)  {
		BrowserActions.click(driver, btnQuote,"Quote");
		return this;
	}
	public CoveragePage selectAntennasandElectronicMedia(WebDriver driver,String AntennasandElectronicMedia)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpAntennasandElectronicMedia,AntennasandElectronicMedia,"AntennasandElectronicMedia");
		return this;
	}
	public CoveragePage clickReleaseLock(WebDriver driver)  {
		BrowserActions.click(driver, btnReleaseLock,"ReleaseLock");
		return this;
	}
	public CoveragePage click_checkbox(WebDriver driver)  {
		BrowserActions.click(driver, chk_checkbox,"_checkbox");
		return this;
	}
	public CoveragePage clickCreateNewProducer(WebDriver driver)  {
		BrowserActions.click(driver, btnCreateNewProducer,"CreateNewProducer");
		return this;
	}
	public CoveragePage clickOtherMembersOfYourHousehold(WebDriver driver)  {
		BrowserActions.click(driver, chkOtherMembersOfYourHousehold,"OtherMembersOfYourHousehold");
		return this;
	}
	public CoveragePage clickForms(WebDriver driver)  {
		BrowserActions.click(driver, btnForms,"Forms");
		return this;
	}
	public CoveragePage clickCollapse(WebDriver driver)  {
		BrowserActions.click(driver, chkCollapse,"Collapse");
		return this;
	}
	public CoveragePage clickCoverageDLossofUse(WebDriver driver)  {
		BrowserActions.click(driver, chkCoverageDLossofUse,"CoverageDLossofUse");
		return this;
	}
	public CoveragePage clickNotes(WebDriver driver)  {
		BrowserActions.click(driver, btnNotes,"Notes");
		return this;
	}
	public CoveragePage selectAnnualIncrease(WebDriver driver,String AnnualIncrease)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpAnnualIncrease,AnnualIncrease,"AnnualIncrease");
		return this;
	}
	public CoveragePage selectProhibitedUseCivilAuthority(WebDriver driver,String ProhibitedUseCivilAuthority)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpProhibitedUseCivilAuthority,ProhibitedUseCivilAuthority,true,"ProhibitedUseCivilAuthority");
		return this;
	}
	public CoveragePage clickGetInspectionLossControl(WebDriver driver)  {
		BrowserActions.click(driver, btnGetInspectionLossControl,"GetInspectionLossControl");
		return this;
	}
	public CoveragePage clickAssistedLivingCare(WebDriver driver)  {
		BrowserActions.click(driver, chkAssistedLivingCare,"AssistedLivingCare");
		return this;
	}
	public CoveragePage clickCreate(WebDriver driver)  {
		BrowserActions.click(driver, btnCreate,"Create");
		return this;
	}
	public CoveragePage selectCauseofLoss(WebDriver driver,String CauseofLoss)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCauseofLoss,CauseofLoss,"CauseofLoss");
		return this;
	}
	public CoveragePage clickLegalreview(WebDriver driver)  {
		BrowserActions.click(driver, btnLegalreview,"Legalreview");
		return this;
	}
	public CoveragePage clickReasonableRepairs(WebDriver driver)  {
		BrowserActions.click(driver, chkReasonableRepairs,"ReasonableRepairs");
		return this;
	}
	public CoveragePage clickDataandRecords(WebDriver driver)  {
		BrowserActions.click(driver, chkDataandRecords,"DataandRecords");
		return this;
	}
	public CoveragePage clickPolicynotification(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicynotification,"Policynotification");
		return this;
	}
	public CoveragePage clickCoverageADwelling(WebDriver driver)  {
		BrowserActions.click(driver, chkCoverageADwelling,"CoverageADwelling");
		return this;
	}
	public CoveragePage clickGoto(WebDriver driver)  {
		BrowserActions.click(driver, btnGoto,"Goto");
		return this;
	}
	public CoveragePage clickUnderwriterReview(WebDriver driver)  {
		BrowserActions.click(driver, btnUnderwriterReview,"UnderwriterReview");
		return this;
	}
	public CoveragePage click30daydiary(WebDriver driver)  {
		BrowserActions.click(driver, btn30daydiary,"30daydiary");
		return this;
	}
	public CoveragePage clickHOP0011359660(WebDriver driver)  {
		BrowserActions.click(driver, btnHOP0011359660,"HOP0011359660");
		return this;
	}
	public CoveragePage clickSidebySideQuoting(WebDriver driver)  {
		BrowserActions.click(driver, btnSidebySideQuoting,"SidebySideQuoting");
		return this;
	}
	public CoveragePage selectLimit_12(WebDriver driver,String Limit_12)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpLimit_12,Limit_12,"Limit_12");
		return this;
	}
	public CoveragePage clickPA0126226969(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0126226969,"PA0126226969");
		return this;
	}
	public CoveragePage clickCollectCreditCard(WebDriver driver)  {
		BrowserActions.click(driver, btnCollectCreditCard,"CollectCreditCard");
		return this;
	}
	public CoveragePage selectLandscapeLimit(WebDriver driver,String LandscapeLimit)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpLandscapeLimit,LandscapeLimit,"LandscapeLimit");
		return this;
	}
	public CoveragePage clickFireDepartmentServiceCharge(WebDriver driver)  {
		BrowserActions.click(driver, chkFireDepartmentServiceCharge,"FireDepartmentServiceCharge");
		return this;
	}
	public CoveragePage selectPackageTermInput(WebDriver driver,String PackageTermInput)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPackageTermInput,PackageTermInput,"PackageTermInput");
		return this;
	}
	public CoveragePage clickCA0085131592(WebDriver driver)  {
		BrowserActions.click(driver, btnCA0085131592,"CA0085131592");
		return this;
	}
	public CoveragePage clickRatiooutofrange(WebDriver driver)  {
		BrowserActions.click(driver, btnRatiooutofrange,"Ratiooutofrange");
		return this;
	}
	public CoveragePage clickFullApp(WebDriver driver)  {
		BrowserActions.click(driver, btnFullApp,"FullApp");
		return this;
	}
	public CoveragePage clickDiagnosticData(WebDriver driver)  {
		BrowserActions.click(driver, btnDiagnosticData,"DiagnosticData");
		return this;
	}
	public CoveragePage selectDataRecordsLimit(WebDriver driver,String DataRecordsLimit)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpDataRecordsLimit,DataRecordsLimit,"DataRecordsLimit");
		return this;
	}
	public CoveragePage clickBOP0042873185(WebDriver driver)  {
		BrowserActions.click(driver, btnBOP0042873185,"BOP0042873185");
		return this;
	}
	public CoveragePage clickVolcanicAction(WebDriver driver)  {
		BrowserActions.click(driver, chkVolcanicAction,"VolcanicAction");
		return this;
	}
	public CoveragePage clickReminder(WebDriver driver)  {
		BrowserActions.click(driver, btnReminder,"Reminder");
		return this;
	}
	public CoveragePage selectCovDLimitPct(WebDriver driver,String CovDLimitPct)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCovDLimitPct,CovDLimitPct,"CovDLimitPct");
		return this;
	}
	public CoveragePage selectLimit_3(WebDriver driver,String Limit_3)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpLimit_3,Limit_3,"Limit_3");
		return this;
	}
	public CoveragePage selectLimit_5(WebDriver driver,String Limit_5)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpLimit_5,Limit_5,"Limit_5");
		return this;
	}
	public CoveragePage clickDwellingConstruction(WebDriver driver)  {
		BrowserActions.click(driver, btnDwellingConstruction,"DwellingConstruction");
		return this;
	}
	public CoveragePage selectMoneyPreciousMetals(WebDriver driver,String MoneyPreciousMetals)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpMoneyPreciousMetals,MoneyPreciousMetals,"MoneyPreciousMetals");
		return this;
	}
	public CoveragePage selectAllPerils(WebDriver driver,String AllPerils)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpAllPerils,AllPerils,"AllPerils");
		return this;
	}
	public CoveragePage clickSectionIDeductibles(WebDriver driver)  {
		BrowserActions.click(driver, chkSectionIDeductibles,"SectionIDeductibles");
		return this;
	}
	public CoveragePage selectLimit_9(WebDriver driver,String Limit_9)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpLimit_9,Limit_9,"Limit_9");
		return this;
	}
	public CoveragePage selectMortgageExpLimit(WebDriver driver,String MortgageExpLimit)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpMortgageExpLimit,MortgageExpLimit,"MortgageExpLimit");
		return this;
	}
	public CoveragePage clickReviewnewmail(WebDriver driver)  {
		BrowserActions.click(driver, btnReviewnewmail,"Reviewnewmail");
		return this;
	}
	public CoveragePage clickGroup(WebDriver driver)  {
		BrowserActions.click(driver, btnGroup,"Group");
		return this;
	}
	public CoveragePage clickCancelasplitpolicy(WebDriver driver)  {
		BrowserActions.click(driver, btnCancelasplitpolicy,"Cancelasplitpolicy");
		return this;
	}
	public CoveragePage selectSecurities(WebDriver driver,String Securities)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpSecurities,Securities,"Securities");
		return this;
	}
	public CoveragePage selectSilverwareMetalFlatware(WebDriver driver,String SilverwareMetalFlatware)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpSilverwareMetalFlatware,SilverwareMetalFlatware,"SilverwareMetalFlatware");
		return this;
	}
	public CoveragePage clickGetAuditOutsideService(WebDriver driver)  {
		BrowserActions.click(driver, btnGetAuditOutsideService,"GetAuditOutsideService");
		return this;
	}
	public CoveragePage clickNewAuditAssignment(WebDriver driver)  {
		BrowserActions.click(driver, btnNewAuditAssignment,"NewAuditAssignment");
		return this;
	}
	public CoveragePage clickRewritetoNewAccount(WebDriver driver)  {
		BrowserActions.click(driver, btnRewritetoNewAccount,"RewritetoNewAccount");
		return this;
	}
	public CoveragePage clickReview30dayUWPeriod(WebDriver driver)  {
		BrowserActions.click(driver, btnReview30dayUWPeriod,"Review30dayUWPeriod");
		return this;
	}
	public CoveragePage clickConditionsandExclusions(WebDriver driver)  {
		BrowserActions.click(driver, btnConditionsandExclusions,"ConditionsandExclusions");
		return this;
	}
	public CoveragePage clickPolicyVersions(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyVersions,"PolicyVersions");
		return this;
	}
	public CoveragePage clickExtendedResidenceTheft(WebDriver driver)  {
		BrowserActions.click(driver, chkExtendedResidenceTheft,"ExtendedResidenceTheft");
		return this;
	}
	public CoveragePage clickPA0108221556(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0108221556,"PA0108221556");
		return this;
	}
	public CoveragePage selectIDTheftLimit(WebDriver driver,String IDTheftLimit)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpIDTheftLimit,IDTheftLimit,"IDTheftLimit");
		return this;
	}
	public CoveragePage clickFungusMoldRemediation(WebDriver driver)  {
		BrowserActions.click(driver, chkFungusMoldRemediation,"FungusMoldRemediation");
		return this;
	}
	public CoveragePage clickPA0108520862(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0108520862,"PA0108520862");
		return this;
	}
	public CoveragePage clickCloseOptions(WebDriver driver)  {
		BrowserActions.click(driver, btnCloseOptions,"CloseOptions");
		return this;
	}
	public CoveragePage clickPolicyFile(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyFile,"PolicyFile");
		return this;
	}
	public CoveragePage clickVerifycoverage(WebDriver driver)  {
		BrowserActions.click(driver, btnVerifycoverage,"Verifycoverage");
		return this;
	}
	public CoveragePage clickGetCreditReports(WebDriver driver)  {
		BrowserActions.click(driver, btnGetCreditReports,"GetCreditReports");
		return this;
	}
	public CoveragePage clickDecline(WebDriver driver)  {
		BrowserActions.click(driver, btnDecline,"Decline");
		return this;
	}
	public CoveragePage clickWizardMenuActions(WebDriver driver)  {
		BrowserActions.click(driver, btnWizardMenuActions,"WizardMenuActions");
		return this;
	}
	public CoveragePage clickSubManager(WebDriver driver)  {
		BrowserActions.click(driver, btnSubManager,"SubManager");
		return this;
	}
	public CoveragePage lossOfRentalIncome(WebDriver driver,String lossOfRental) {
		switch (lossOfRental.trim().toUpperCase()) {
		case "YES":
			BrowserActions.click(driver, rdbLossOfUseYes,true,"loss Of Rental Income Yes Radio Button");
			break;
		case "NO":
			BrowserActions.click(driver, rdbLossOfUseNo,true,"loss Of Rental Income No Radio Button");
			break;
		}
		Log.message("Choose 'YES' or 'NO' from"+lossOfRental);
		return this;
	}
}