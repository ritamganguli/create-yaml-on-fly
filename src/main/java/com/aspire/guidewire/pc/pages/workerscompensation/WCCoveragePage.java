package com.aspire.guidewire.pc.pages.workerscompensation;
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

public class WCCoveragePage extends LoadableComponent<WCCoveragePage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementIdentifier;
	String elementObject;
	HashMap<String, String> getPageObjects;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Workplan>div[role='menuitem']", AI = false)
	public WebElement btnWorkplan;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-41-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0078666227;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-49-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnHOP0050339114;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_CopySubmission>div[role='menuitem']", AI = false)
	public WebElement btnCopySubmission;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-4-item>div[role='menuitem']", AI = false)
	public WebElement btnGeneralreminderdiary;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-8-item>div[role='menuitem']", AI = false)
	public WebElement btnGetReinsuranceQuote;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-32-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0006100874;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-13-item>div[role='menuitem']", AI = false)
	public WebElement btnReview45dayUWPeriod;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-52-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnHOP0197361676;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-WorkersCompCoverageConfigScreen-JobWizardToolbarButtonSet-BindOptions-BindOnly>div[role='menuitem']", AI = false)
	public WebElement btnBindOnly;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-0-NewActivityMenuItemSet_Category>div[role='menuitem']", AI = false)
	public WebElement btnInterview;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-6-item>div[role='menuitem']", AI = false)
	public WebElement btnPerformanceReview;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-WorkersCompCoverageConfigScreen-JobWizardToolbarButtonSet-Versions-NewVersion>div[role='menuitem']", AI = false)
	public WebElement btnStartMultiVersion;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-15-item>div[role='menuitem']", AI = false)
	public WebElement btnReviewProducer;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-46-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0002720800;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-RiskEvaluation>div[role='menuitem']", AI = false)
	public WebElement btnRiskAnalysis_1;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-37-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnWC0236269354;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-8-item>div[role='menuitem']", AI = false)
	public WebElement btnPolicyReviewMidterm;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-WorkersCompCoverageConfigScreen-JobWizardToolbarButtonSet-Versions-ViewSideBySide>div[role='menuitem']", AI = false)
	public WebElement btnViewSideBySideVersions;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-WorkersCompCoverageConfigScreen-WorkersCompCoverageCV-WorkersCompClassesInputSet-WCCovEmpLV_tb-Remove>div[role='button']", AI = false)
	public WebElement btnRemove_1;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-BillingInfo>div[role='menuitem']", AI = false)
	public WebElement btnPayment;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Change-WizardMenuActions_ChangeEffDate>div[role='menuitem']", AI = false)
	public WebElement btnEffectiveDate;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-WorkersCompCoverageConfigScreen-WorkersCompCoverageCV-AddCoveredJurisdiction>div[role='button']", AI = false)
	public WebElement btnAddCoveredJurisdiction;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-36-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnHOP0204404881;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-35-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0049303658;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-13-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnHOP0197148664;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-8-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnHOP0212470370;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-1-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0001142472;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-63-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnHOP0033409290;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-47-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnWC0151392695;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-WorkersCompCoverageConfigScreen-OOSEPanelSet-NextSliceLink", AI = false)
	public WebElement btnNextBlockedDate;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-2-item>div[role='menuitem']", AI = false)
	public WebElement btn90daydiary;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-JobGroupItem>div[role='menuitem']", AI = false)
	public WebElement btnSG00050847959093173949;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-WorkersCompCoverageConfigScreen-JobWizardToolbarButtonSet-BindOptions>div[role='button']", AI = false)
	public WebElement btnBindOptions;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-26-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0007833400;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-62-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0004676744;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Archiving-WizardMenuActions_SuspendResumeArchiving>div[role='menuitem']", AI = false)
	public WebElement btnEnableDisable;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-WorkersCompCoverageConfigScreen-JobWizardToolbarButtonSet-BindOptions-BindAndIssue>div[role='menuitem']", AI = false)
	public WebElement btnIssuePolicy;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-40-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0050170682;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-25-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0092783565;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-9-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0007967715;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-WorkersCompOptions>div[role='menuitem']", AI = false)
	public WebElement btnWCOptions;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-3-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0049954905;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-55-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0010796895;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-MultiQuoteAcceleratedMenuActions-PolicyPeriodSelector", AI = false)
	public WebElement btnPolicyPeriodSelector;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-1-NewActivityMenuItemSet_Category>div[role='menuitem']", AI = false)
	public WebElement btnNewmail;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-7-item>div[role='menuitem']", AI = false)
	public WebElement btnGetMotorVehicleReports;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-PreQualification>div[role='menuitem']", AI = false)
	public WebElement btnQualification;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-22-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0060945695;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Participants>div[role='menuitem']", AI = false)
	public WebElement btnParticipants;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-WorkersCompCoverageConfigScreen-WorkersCompCoverageCV-PolicyLinePerStateConfigDV-officialIDs-1-ANI_OfficialIDEntry']", AI = false)
	public WebElement inpANI_OfficialIDEntry_1;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-24-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0002436160;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-4-NewActivityMenuItemSet_Category-0-item>div[role='menuitem']", AI = false)
	public WebElement btnReviewandapprove;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-WorkersCompCoverageConfigScreen-OOSEPanelSet-OOSEPeriodSelector-OOSEPeriodSelector_Arg']", AI = false)
	public WebElement drpEffectiveDate;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-4-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0007582893;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-7-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnHOP0199659518;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewDocument>div[role='menuitem']", AI = false)
	public WebElement btnNewDocument;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-19-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0129900022;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewDocument-NewJobDocumentMenuItemSet-PolicyPeriodNewDocumentMenuItemSet_Linked>div[role='menuitem']", AI = false)
	public WebElement btnUploaddocuments;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Finish>div[role='button']", AI = false)
	public WebElement btnFinish;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-ProductDefinition>div[role='menuitem']", AI = false)
	public WebElement btnProductDefinition;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-6-item>div[role='menuitem']", AI = false)
	public WebElement btnGetInspectionOutsideService;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-53-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnCPP0049614273;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-0-NewActivityMenuItemSet_Category-0-item>div[role='menuitem']", AI = false)
	public WebElement btnMeetwithInsured;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-WorkersCompCoverageConfigScreen-WorkersCompCoverageCV-PolicyCoveragesTab", AI = false)
	public WebElement btnPolicyCoveragesandExclusions;

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

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-58-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0050022880;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-WorkersCompCoverageConfigScreen-WorkersCompCoverageCV-PolicyLinePerStateConfigDV-UnsplitModifiers-WCModifiersInputSet-ModIterator-0-ModifierInput_Date']", AI = false)
	public WebElement inpWCScheduleCredits_1;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-WorkersCompCoverageConfigScreen-WorkersCompCoverageCV-PolicyLinePerStateConfigDV-UnsplitModifiers-WCModifiersInputSet-ModIteratorEligible-0-EligibilityInputGroup-_checkbox']", AI = false)
	public WebElement chkExperienceModxxxEligible;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-WorkersCompSupplemental>div[role='menuitem']", AI = false)
	public WebElement btnSupplemental;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-17-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0032919629;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-67-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnHOP0236891855;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-PolicyReview>div[role='menuitem']", AI = false)
	public WebElement btnPolicyReview;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-61-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0021575179;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-WorkersCompCoverageConfigScreen-OOSEPanelSet-OOSEPeriodSelector", AI = false)
	public WebElement btnOOSEPeriodSelector;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-11-item>div[role='menuitem']", AI = false)
	public WebElement btnManuallyrateandquotepolicy;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-History>div[role='menuitem']", AI = false)
	public WebElement btnHistory;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-5-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0037153281;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Change>div[role='menuitem']", AI = false)
	public WebElement btnEdit;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-WorkersCompCoverageConfigScreen-JobWizardToolbarButtonSet-CloseOptions-WithdrawJob>div[role='menuitem']", AI = false)
	public WebElement btnWithdrawTransaction;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-WorkersCompCoverageConfigScreen-WorkersCompCoverageCV-SplitPeriod>div[role='button']", AI = false)
	public WebElement btnSplitPeriod;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-PolicyInfo>div[role='menuitem']", AI = false)
	public WebElement btnPolicyInfo;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-WorkersCompCoverageConfigScreen-WorkersCompCoverageCV-PolicyLinePerStateConfigDV-UnsplitModifiers-WCModifiersInputSet-ModIteratorEligible-0-EligibilityInputGroup-ValueFinal']", AI = false)
	public WebElement rdbExperienceModFinal;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-WorkersCompCoverageConfigScreen-JobWizardToolbarButtonSet-Versions>div[role='button']", AI = false)
	public WebElement btnVersions;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_ToAccountFile>div[role='menuitem']", AI = false)
	public WebElement btnAccountFile;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-WorkersCompCoverageConfigScreen-WorkersCompCoverageCV-Remove>div[role='button']", AI = false)
	public WebElement btnRemove;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-29-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnGL0049706212;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Change-WizardMenuActions_CopyPolicyData>div[role='menuitem']", AI = false)
	public WebElement btnCopyData;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-WorkersCompCoverageConfigScreen-WorkersCompCoverageCV-PolicyLinePerStateConfigDV-UnsplitModifiers-WCModifiersInputSet-ModIteratorEligible-0-EligibilityInputGroup-ModifierInput']", AI = false)
	public WebElement inpExperienceModxxx;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-14-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnHOP0049485577;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-WorkersCompCoverageConfigScreen-QuoteRequestedAlert-CloseBtn", AI = false)
	public WebElement btnClose;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-14-item>div[role='menuitem']", AI = false)
	public WebElement btnReview60dayUWPeriod;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-WorkersCompCoverageConfigScreen-JobWizardToolbarButtonSet-EditPolicy>div[role='button']", AI = false)
	public WebElement btnEditPolicyTransaction;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-51-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnHOP0082153368;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity>div[role='menuitem']", AI = false)
	public WebElement btnNewActivity;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-65-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnHOP0197252661;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-70-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnHOP0207512362;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Cancel>div[role='button']", AI = false)
	public WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup>div[role='menuitem']", AI = false)
	public WebElement btnPolicyContract;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-21-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnHOP0198740350;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category>div[role='menuitem']", AI = false)
	public WebElement btnRequest;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-9-item>div[role='menuitem']", AI = false)
	public WebElement btnGetRiskInformationProducer;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-WorkersCompCoverageConfigScreen-WorkersCompCoverageCV-WCPolicyCoveragesDV-WCCoverageGroupIterator-2-CoverageInputSet-CovPatternInputGroup-EmpLiabPack']", AI = false)
	public WebElement drpEmployersLiabilityLimit;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-WorkersCompCoverageConfigScreen-WorkersCompCoverageCV-WorkersCompClassesInputSet-WCCovEmpLV_tb-Add>div[role='button']", AI = false)
	public WebElement btnAddClass;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-WorkersCompCoverageConfigScreen-WorkersCompCoverageCV-WCPolicyCoveragesDV-WCCoverageGroupIterator-1-CoverageInputSet-CovPatternInputGroup-_checkbox']", AI = false)
	public WebElement chkOtherStatesInsurance;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-1-item>div[role='menuitem']", AI = false)
	public WebElement btnGetAuditInternalPersonnel;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-WorkersCompCoverageConfigScreen-WorkersCompCoverageCV-PolicyLinePerStateConfigDV-UnsplitModifiers-WCModifiersInputSet-ModIterator-0-ModifierInput_TypeKey']", AI = false)
	public WebElement drpWCScheduleCredits;

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

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-Locations>div[role='menuitem']", AI = false)
	public WebElement btnLocations;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-18-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnHOP0029478020;

	@IFindBy(how = How.CSS, using = "div[id$='Next']", AI = false)
	public WebElement btnNext;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-42-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0002347765;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-44-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0060823586;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-10-item>div[role='menuitem']", AI = false)
	public WebElement btnQuoteRequired;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-WorkersCompCoverageConfigScreen-JobWizardToolbarButtonSet-Draft>div[role='button']", AI = false)
	public WebElement btnSaveDraft;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-3-item>div[role='menuitem']", AI = false)
	public WebElement btnGetBureauData;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Reinsurance>div[role='menuitem']", AI = false)
	public WebElement btnReinsurance;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-WorkersCompCoverageConfigScreen-QuoteRequestedAlert .gw-AlertBar--label", AI = false)
	public WebElement lblQuoteRequestedAlert;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-WorkersCompCoverageConfigScreen-WorkersCompCoverageCV-WCPolicyCoveragesDV-CoveredStates']", AI = false)
	public WebElement inpCoveredStates;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-WorkersCompCoverageConfigScreen-WorkersCompCoverageCV-WCPolicyCoveragesDV-WCCoverageGroupIterator-2-CoverageInputSet-CovPatternInputGroup-_checkbox']", AI = false)
	public WebElement chkWorkersCompEmployersLiability;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-WorkersCompCoverageConfig>div[role='menuitem']", AI = false)
	public WebElement btnWCCoverages;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-31-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnHOP0043979661;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-11-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnHOP0043219876;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewDocument-NewJobDocumentMenuItemSet-PolicyPeriodNewDocumentMenuItemSet_Template>div[role='menuitem']", AI = false)
	public WebElement btnCreatefromatemplate;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-27-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0057255712;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-WorkersCompCoverageConfigScreen-JobWizardToolbarButtonSet-Versions-SideBySide>div[role='menuitem']", AI = false)
	public WebElement btnStartSidebySide;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-57-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnWC0074056230;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Archiving>div[role='menuitem']", AI = false)
	public WebElement btnArchiving;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-WorkersCompCoverageConfigScreen-JobWizardToolbarButtonSet-CloseOptions-NotTakenJob>div[role='menuitem']", AI = false)
	public WebElement btnNotTaken;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-WorkersCompCoverageConfigScreen-WorkersCompCoverageCV-PolicyLinePerStateConfigDV-WCDeductiblesInputSet-0-StateSpecificDeductible']", AI = false)
	public WebElement drpDeductible;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Documents>div[role='menuitem']", AI = false)
	public WebElement btnDocuments;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-59-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0002297637;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-WorkersCompCoverageConfigScreen-JobWizardToolbarButtonSet-QuoteTypeToolbarButtonSet-Quote>div[role='button']", AI = false)
	public WebElement btnQuote;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-WorkersCompCoverageConfigScreen-WorkersCompCoverageCV-StateCoveragesTab", AI = false)
	public WebElement btnStateCoverages;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-WorkersCompCoverageConfigScreen-WorkersCompCoverageCV-WCPolicyCoveragesDV-WCCoverageGroupIterator-1-CoverageInputSet-CovPatternInputGroup-OtherStatesTermInput']", AI = false)
	public WebElement drpCoveredStates;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-2-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnHOP0237297240;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-WorkersCompCoverageConfigScreen-JobWizardToolbarButtonSet-Unlock>div[role='button']", AI = false)
	public WebElement btnReleaseLock;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-45-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnHOP0065001603;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-WorkersCompCoverageConfigScreen-WorkersCompCoverageCV-WCPolicyCoveragesDV-WCExclusionGroupIterator-0-CoverageInputSet-CovPatternInputGroup-_checkbox']", AI = false)
	public WebElement chk_checkbox;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-0-item>div[role='menuitem']", AI = false)
	public WebElement btnCreateNewProducer;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Forms>div[role='menuitem']", AI = false)
	public WebElement btnForms;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Notes>div[role='menuitem']", AI = false)
	public WebElement btnNotes;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-30-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnHOP0031196546;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-ViewMultiLineQuote>div[role='menuitem']", AI = false)
	public WebElement btnQuote_1;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-5-item>div[role='menuitem']", AI = false)
	public WebElement btnGetInspectionLossControl;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-10-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0007377725;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create>div[role='menuitem']", AI = false)
	public WebElement btnCreate;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-WorkersCompCoverageConfigScreen-WorkersCompCoverageCV-PolicyLinePerStateConfigDV-AnniversaryDate']", AI = false)
	public WebElement inpAnniversaryDate;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-39-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0031508844;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-10-item>div[role='menuitem']", AI = false)
	public WebElement btnLegalreview;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-43-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0030766380;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-7-item>div[role='menuitem']", AI = false)
	public WebElement btnPolicynotification;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-WorkersCompCoverageConfigScreen-WorkersCompCoverageCV-SplitBases>div[role='button']", AI = false)
	public WebElement btnUpdateAllBasis;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-WorkersCompCoverageConfigScreen-WorkersCompCoverageCV-PolicyLinePerStateConfigDV-UnsplitModifiers-WCModifiersInputSet-ModIterator-0-ModifierInput_Boolean']", AI = false)
	public WebElement rdbWCScheduleCredits;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto>div[role='menuitem']", AI = false)
	public WebElement btnGoto;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-4-NewActivityMenuItemSet_Category>div[role='menuitem']", AI = false)
	public WebElement btnUnderwriterReview;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-0-item>div[role='menuitem']", AI = false)
	public WebElement btn30daydiary;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-WorkersCompCoverageConfigScreen-WorkersCompCoverageCV-PolicyLinePerStateConfigDV-UnsplitModifiers-WCModifiersInputSet-ModIterator-0-ModifierInput_Rate']", AI = false)
	public WebElement inpWCScheduleCredits;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-15-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnHOP0207460171;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-WorkersCompCoverageConfigScreen-WorkersCompCoverageCV-PolicyLinePerStateConfigDV-officialIDs-0-ANI_OfficialIDEntry']", AI = false)
	public WebElement inpANI_OfficialIDEntry;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-SideBySide>div[role='menuitem']", AI = false)
	public WebElement btnSidebySideQuoting;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-33-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0035777317;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-56-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0002939084;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-CollectCreditCard>div[role='menuitem']", AI = false)
	public WebElement btnCollectCreditCard;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-54-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnHOP0043873709;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-6-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnWC0241798473;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-28-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnGL0197461408;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-11-item>div[role='menuitem']", AI = false)
	public WebElement btnRatiooutofrange;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-WorkersCompCoverageConfigScreen-JobWizardToolbarButtonSet-ConvertToFullApp>div[role='button']", AI = false)
	public WebElement btnFullApp;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-WorkersCompCoverageConfigScreen-WorkersCompCoverageCV-WCPolicyCoveragesDV-WCCoverageGroupIterator-2-CoverageInputSet-CovPatternInputGroup-WCIncludedMonopolisticStatesTermInput']", AI = false)
	public WebElement inpIncludedMonopolisticStates;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-DiagWorksheetItem>div[role='menuitem']", AI = false)
	public WebElement btnDiagnosticData;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category>div[role='menuitem']", AI = false)
	public WebElement btnReminder;

	@IFindBy(how = How.XPATH, using = "//div[@class='gw-TitleBar--titles--container']//child::div[contains(text(),'Coverages')]", AI = false)
	public WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-23-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnWC0065111343;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-68-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0049509735;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-50-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnWC0245251130;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-WorkersCompCoverageConfigScreen-WorkersCompCoverageCV-WCPolicyCoveragesDV-WCCoverageGroupIterator-1-CoverageInputSet-CovPatternInputGroup-WCExcludedStatesTermInput']", AI = false)
	public WebElement inpExcludedStates;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-0-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0005084795;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-64-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0118973213;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-60-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0130954491;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-34-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnWC0108480880;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-1-NewActivityMenuItemSet_Category-0-item>div[role='menuitem']", AI = false)
	public WebElement btnReviewnewmail;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup>div[role='menuitem']", AI = false)
	public WebElement btnGroup;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-38-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0000129766;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-3-item>div[role='menuitem']", AI = false)
	public WebElement btnCancelasplitpolicy;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-66-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0061151875;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-2-item>div[role='menuitem']", AI = false)
	public WebElement btnGetAuditOutsideService;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-5-item>div[role='menuitem']", AI = false)
	public WebElement btnNewAuditAssignment;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-16-item>div[role='menuitem']", AI = false)
	public WebElement btnRewritetoNewAccount;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-69-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0051075789;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-12-item>div[role='menuitem']", AI = false)
	public WebElement btnReview30dayUWPeriod;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-ManageBranches>div[role='menuitem']", AI = false)
	public WebElement btnPolicyVersions;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-WorkersCompCoverageConfigScreen-WorkersCompCoverageCV-WCPolicyCoveragesDV-WCCoverageGroupIterator-2-CoverageInputSet-CovPatternInputGroup-StopGapTermInput']", AI = false)
	public WebElement drpStopGap;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-48-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnHOP0082542218;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-12-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnWC0280492161;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-20-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnGL0049846245;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-WorkersCompCoverageConfigScreen-WorkersCompCoverageCV-WCPolicyCoveragesDV-WCCoverageGroupIterator-0-CoverageInputSet-CovPatternInputGroup-_checkbox']", AI = false)
	public WebElement chkStatutoryWorkersComp;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-WorkersCompCoverageConfigScreen-JobWizardToolbarButtonSet-CloseOptions>div[role='button']", AI = false)
	public WebElement btnCloseOptions;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_ToPolicyFile>div[role='menuitem']", AI = false)
	public WebElement btnPolicyFile;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-16-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0008939340;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-17-item>div[role='menuitem']", AI = false)
	public WebElement btnVerifycoverage;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-4-item>div[role='menuitem']", AI = false)
	public WebElement btnGetCreditReports;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-WorkersCompCoverageConfigScreen-JobWizardToolbarButtonSet-CloseOptions-Decline>div[role='menuitem']", AI = false)
	public WebElement btnDecline;

	@IFindBy(how = How.CSS, using = "div[id=$'SubmissionWizard-WizardMenuActions']>div[role='button']", AI = false)
	public WebElement btnWizardMenuActions;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardActionsMenuItemSet-SubmissionInfo>div[role='menuitem']", AI = false)
	public WebElement btnSubManager;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-WorkersCompCoverageConfigScreen-WorkersCompCoverageCV-WCPolicyCoveragesDV-WCCoverageGroupIterator-1-CoverageInputSet-CovPatternInputGroup-WCIncludedStatesTermInput']", AI = false)
	public WebElement inpIncludedStates;

	@IFindBy(how = How.CSS, using = "select[name$='SpecialCoverage']", AI = false)
	public WebElement drpGoverningLaw;

	@IFindBy(how = How.CSS, using = "select[name$='Loc']", AI = false)
	public WebElement drpLocation;

	@IFindBy(how = How.CSS, using ="div[id$='SelectClassCode']", AI = false)  
	public WebElement btnSearchClassCode;

	@IFindBy(how = How.CSS, using = "input[name$='AnnualRenum']", AI = false)
	public WebElement txtAnnualBasis;

	@IFindBy(how = How.CSS, using = "input[name$='ClassCode']", AI = false)
	public WebElement txtClassCode;


	public WCCoveragePage(){
	}

	public WCCoveragePage(WebDriver driver) {
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, 10);
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

	public WCCoveragePage clickWorkplan(WebDriver driver)  {
		BrowserActions.click(driver, btnWorkplan,"Workplan");
		return this;
	}
	public WCCoveragePage clickPA0078666227(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0078666227,"PA0078666227");
		return this;
	}
	public WCCoveragePage clickHOP0050339114(WebDriver driver)  {
		BrowserActions.click(driver, btnHOP0050339114,"HOP0050339114");
		return this;
	}
	public WCCoveragePage clickCopySubmission(WebDriver driver)  {
		BrowserActions.click(driver, btnCopySubmission,"CopySubmission");
		return this;
	}
	public WCCoveragePage clickGeneralreminderdiary(WebDriver driver)  {
		BrowserActions.click(driver, btnGeneralreminderdiary,"Generalreminderdiary");
		return this;
	}
	public WCCoveragePage clickGetReinsuranceQuote(WebDriver driver)  {
		BrowserActions.click(driver, btnGetReinsuranceQuote,"GetReinsuranceQuote");
		return this;
	}
	public WCCoveragePage clickPA0006100874(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0006100874,"PA0006100874");
		return this;
	}
	public WCCoveragePage clickReview45dayUWPeriod(WebDriver driver)  {
		BrowserActions.click(driver, btnReview45dayUWPeriod,"Review45dayUWPeriod");
		return this;
	}
	public WCCoveragePage clickHOP0197361676(WebDriver driver)  {
		BrowserActions.click(driver, btnHOP0197361676,"HOP0197361676");
		return this;
	}
	public WCCoveragePage clickBindOnly(WebDriver driver)  {
		BrowserActions.click(driver, btnBindOnly,"BindOnly");
		return this;
	}
	public WCCoveragePage clickInterview(WebDriver driver)  {
		BrowserActions.click(driver, btnInterview,"Interview");
		return this;
	}
	public WCCoveragePage clickPerformanceReview(WebDriver driver)  {
		BrowserActions.click(driver, btnPerformanceReview,"PerformanceReview");
		return this;
	}
	public WCCoveragePage clickStartMultiVersion(WebDriver driver)  {
		BrowserActions.click(driver, btnStartMultiVersion,"StartMultiVersion");
		return this;
	}
	public WCCoveragePage clickReviewProducer(WebDriver driver)  {
		BrowserActions.click(driver, btnReviewProducer,"ReviewProducer");
		return this;
	}
	public WCCoveragePage clickPA0002720800(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0002720800,"PA0002720800");
		return this;
	}
	public WCCoveragePage clickRiskAnalysis_1(WebDriver driver)  {
		BrowserActions.click(driver, btnRiskAnalysis_1,"RiskAnalysis_1");
		return this;
	}
	public WCCoveragePage clickWC0236269354(WebDriver driver)  {
		BrowserActions.click(driver, btnWC0236269354,"WC0236269354");
		return this;
	}
	public WCCoveragePage clickPolicyReviewMidterm(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyReviewMidterm,"PolicyReviewMidterm");
		return this;
	}
	public WCCoveragePage clickViewSideBySideVersions(WebDriver driver)  {
		BrowserActions.click(driver, btnViewSideBySideVersions,"ViewSideBySideVersions");
		return this;
	}
	public WCCoveragePage clickRemove_1(WebDriver driver)  {
		BrowserActions.click(driver, btnRemove_1,"Remove_1");
		return this;
	}
	public WCCoveragePage clickPayment(WebDriver driver)  {
		BrowserActions.click(driver, btnPayment,"Payment");
		return this;
	}
	public WCCoveragePage clickEffectiveDate(WebDriver driver)  {
		BrowserActions.click(driver, btnEffectiveDate,"EffectiveDate");
		return this;
	}
	public WCCoveragePage clickAddCoveredJurisdiction(WebDriver driver)  {
		BrowserActions.click(driver, btnAddCoveredJurisdiction,"AddCoveredJurisdiction");
		return this;
	}
	public WCCoveragePage clickHOP0204404881(WebDriver driver)  {
		BrowserActions.click(driver, btnHOP0204404881,"HOP0204404881");
		return this;
	}
	public WCCoveragePage clickPA0049303658(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0049303658,"PA0049303658");
		return this;
	}
	public WCCoveragePage clickHOP0197148664(WebDriver driver)  {
		BrowserActions.click(driver, btnHOP0197148664,"HOP0197148664");
		return this;
	}
	public WCCoveragePage clickHOP0212470370(WebDriver driver)  {
		BrowserActions.click(driver, btnHOP0212470370,"HOP0212470370");
		return this;
	}
	public WCCoveragePage clickPA0001142472(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0001142472,"PA0001142472");
		return this;
	}
	public WCCoveragePage clickHOP0033409290(WebDriver driver)  {
		BrowserActions.click(driver, btnHOP0033409290,"HOP0033409290");
		return this;
	}
	public WCCoveragePage clickWC0151392695(WebDriver driver)  {
		BrowserActions.click(driver, btnWC0151392695,"WC0151392695");
		return this;
	}
	public WCCoveragePage clickNextBlockedDate(WebDriver driver)  {
		BrowserActions.click(driver, btnNextBlockedDate,"NextBlockedDate");
		return this;
	}
	public WCCoveragePage click90daydiary(WebDriver driver)  {
		BrowserActions.click(driver, btn90daydiary,"90daydiary");
		return this;
	}
	public WCCoveragePage clickSG00050847959093173949(WebDriver driver)  {
		BrowserActions.click(driver, btnSG00050847959093173949,"SG00050847959093173949");
		return this;
	}
	public WCCoveragePage clickBindOptions(WebDriver driver)  {
		BrowserActions.click(driver, btnBindOptions,"BindOptions");
		return this;
	}
	public WCCoveragePage clickPA0007833400(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0007833400,"PA0007833400");
		return this;
	}
	public WCCoveragePage clickPA0004676744(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0004676744,"PA0004676744");
		return this;
	}
	public WCCoveragePage clickEnableDisable(WebDriver driver)  {
		BrowserActions.click(driver, btnEnableDisable,"EnableDisable");
		return this;
	}
	public WCCoveragePage clickIssuePolicy(WebDriver driver)  {
		BrowserActions.click(driver, btnIssuePolicy,"IssuePolicy");
		return this;
	}
	public WCCoveragePage clickPA0050170682(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0050170682,"PA0050170682");
		return this;
	}
	public WCCoveragePage clickPA0092783565(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0092783565,"PA0092783565");
		return this;
	}
	public WCCoveragePage clickPA0007967715(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0007967715,"PA0007967715");
		return this;
	}
	public WCCoveragePage clickWCOptions(WebDriver driver)  {
		BrowserActions.click(driver, btnWCOptions,"WCOptions");
		return this;
	}
	public WCCoveragePage clickPA0049954905(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0049954905,"PA0049954905");
		return this;
	}
	public WCCoveragePage clickPA0010796895(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0010796895,"PA0010796895");
		return this;
	}
	public WCCoveragePage clickPolicyPeriodSelector(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyPeriodSelector,"PolicyPeriodSelector");
		return this;
	}
	public WCCoveragePage clickNewmail(WebDriver driver)  {
		BrowserActions.click(driver, btnNewmail,"Newmail");
		return this;
	}
	public WCCoveragePage clickGetMotorVehicleReports(WebDriver driver)  {
		BrowserActions.click(driver, btnGetMotorVehicleReports,"GetMotorVehicleReports");
		return this;
	}
	public WCCoveragePage clickQualification(WebDriver driver)  {
		BrowserActions.click(driver, btnQualification,"Qualification");
		return this;
	}
	public WCCoveragePage clickPA0060945695(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0060945695,"PA0060945695");
		return this;
	}
	public WCCoveragePage clickParticipants(WebDriver driver)  {
		BrowserActions.click(driver, btnParticipants,"Participants");
		return this;
	}
	public WCCoveragePage enterANI_OfficialIDEntry_1(WebDriver driver,String ANI_OfficialIDEntry_1) {
		BrowserActions.type(driver, inpANI_OfficialIDEntry_1,ANI_OfficialIDEntry_1, "ANI_OfficialIDEntry_1");
		return this;
	}
	public WCCoveragePage clickPA0002436160(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0002436160,"PA0002436160");
		return this;
	}
	public WCCoveragePage clickReviewandapprove(WebDriver driver)  {
		BrowserActions.click(driver, btnReviewandapprove,"Reviewandapprove");
		return this;
	}
	public WCCoveragePage selectEffectiveDate(WebDriver driver,String EffectiveDate)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpEffectiveDate,EffectiveDate,"EffectiveDate");
		return this;
	}
	public WCCoveragePage clickPA0007582893(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0007582893,"PA0007582893");
		return this;
	}
	public WCCoveragePage clickHOP0199659518(WebDriver driver)  {
		BrowserActions.click(driver, btnHOP0199659518,"HOP0199659518");
		return this;
	}
	public WCCoveragePage clickNewDocument(WebDriver driver)  {
		BrowserActions.click(driver, btnNewDocument,"NewDocument");
		return this;
	}
	public WCCoveragePage clickPA0129900022(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0129900022,"PA0129900022");
		return this;
	}
	public WCCoveragePage clickUploaddocuments(WebDriver driver)  {
		BrowserActions.click(driver, btnUploaddocuments,"Uploaddocuments");
		return this;
	}
	public WCCoveragePage clickFinish(WebDriver driver)  {
		BrowserActions.click(driver, btnFinish,"Finish");
		return this;
	}
	public WCCoveragePage clickProductDefinition(WebDriver driver)  {
		BrowserActions.click(driver, btnProductDefinition,"ProductDefinition");
		return this;
	}
	public WCCoveragePage clickGetInspectionOutsideService(WebDriver driver)  {
		BrowserActions.click(driver, btnGetInspectionOutsideService,"GetInspectionOutsideService");
		return this;
	}
	public WCCoveragePage clickCPP0049614273(WebDriver driver)  {
		BrowserActions.click(driver, btnCPP0049614273,"CPP0049614273");
		return this;
	}
	public WCCoveragePage clickMeetwithInsured(WebDriver driver)  {
		BrowserActions.click(driver, btnMeetwithInsured,"MeetwithInsured");
		return this;
	}
	public WCCoveragePage clickPolicyCoveragesandExclusions(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyCoveragesandExclusions,"PolicyCoveragesandExclusions");
		return this;
	}
	public WCCoveragePage clickOfferings(WebDriver driver)  {
		BrowserActions.click(driver, btnOfferings,"Offerings");
		return this;
	}
	public WCCoveragePage clickPolicyReviewRenewal(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyReviewRenewal,"PolicyReviewRenewal");
		return this;
	}
	public WCCoveragePage clickNewNote(WebDriver driver)  {
		BrowserActions.click(driver, btnNewNote,"NewNote");
		return this;
	}
	public WCCoveragePage clickRiskAnalysis(WebDriver driver)  {
		BrowserActions.click(driver, btnRiskAnalysis,"RiskAnalysis");
		return this;
	}
	public WCCoveragePage clickMeetwithProducerAgency(WebDriver driver)  {
		BrowserActions.click(driver, btnMeetwithProducerAgency,"MeetwithProducerAgency");
		return this;
	}
	public WCCoveragePage clickPA0050022880(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0050022880,"PA0050022880");
		return this;
	}
	public WCCoveragePage enterWCScheduleCredits_1(WebDriver driver,String WCScheduleCredits_1) {
		BrowserActions.type(driver, inpWCScheduleCredits_1,WCScheduleCredits_1, "WCScheduleCredits_1");
		return this;
	}
	public WCCoveragePage clickExperienceModxxxEligible(WebDriver driver)  {
		BrowserActions.click(driver, chkExperienceModxxxEligible,"ExperienceModxxxEligible");
		return this;
	}
	public WCCoveragePage clickSupplemental(WebDriver driver)  {
		BrowserActions.click(driver, btnSupplemental,"Supplemental");
		return this;
	}
	public WCCoveragePage clickPA0032919629(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0032919629,"PA0032919629");
		return this;
	}
	public WCCoveragePage clickHOP0236891855(WebDriver driver)  {
		BrowserActions.click(driver, btnHOP0236891855,"HOP0236891855");
		return this;
	}
	public WCCoveragePage clickPolicyReview(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyReview,"PolicyReview");
		return this;
	}
	public WCCoveragePage clickPA0021575179(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0021575179,"PA0021575179");
		return this;
	}
	public WCCoveragePage clickOOSEPeriodSelector(WebDriver driver)  {
		BrowserActions.click(driver, btnOOSEPeriodSelector,"OOSEPeriodSelector");
		return this;
	}
	public WCCoveragePage clickManuallyrateandquotepolicy(WebDriver driver)  {
		BrowserActions.click(driver, btnManuallyrateandquotepolicy,"Manuallyrateandquotepolicy");
		return this;
	}
	public WCCoveragePage clickHistory(WebDriver driver)  {
		BrowserActions.click(driver, btnHistory,"History");
		return this;
	}
	public WCCoveragePage clickPA0037153281(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0037153281,"PA0037153281");
		return this;
	}
	public WCCoveragePage clickEdit(WebDriver driver)  {
		BrowserActions.click(driver, btnEdit,"Edit");
		return this;
	}
	public WCCoveragePage clickWithdrawTransaction(WebDriver driver)  {
		BrowserActions.click(driver, btnWithdrawTransaction,"WithdrawTransaction");
		return this;
	}
	public WCCoveragePage clickSplitPeriod(WebDriver driver)  {
		BrowserActions.click(driver, btnSplitPeriod,"SplitPeriod");
		return this;
	}
	public WCCoveragePage clickPolicyInfo(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyInfo,"PolicyInfo");
		return this;
	}
	public WCCoveragePage clickExperienceModFinal(WebDriver driver)  {
		BrowserActions.click(driver, rdbExperienceModFinal,"ExperienceModFinal");
		return this;
	}
	public WCCoveragePage clickVersions(WebDriver driver)  {
		BrowserActions.click(driver, btnVersions,"Versions");
		return this;
	}
	public WCCoveragePage clickAccountFile(WebDriver driver)  {
		BrowserActions.click(driver, btnAccountFile,"AccountFile");
		return this;
	}
	public WCCoveragePage clickRemove(WebDriver driver)  {
		BrowserActions.click(driver, btnRemove,"Remove");
		return this;
	}
	public WCCoveragePage clickGL0049706212(WebDriver driver)  {
		BrowserActions.click(driver, btnGL0049706212,"GL0049706212");
		return this;
	}
	public WCCoveragePage clickCopyData(WebDriver driver)  {
		BrowserActions.click(driver, btnCopyData,"CopyData");
		return this;
	}
	public WCCoveragePage enterExperienceModxxx(WebDriver driver,String ExperienceModxxx) {
		BrowserActions.type(driver, inpExperienceModxxx,ExperienceModxxx, "ExperienceModxxx");
		return this;
	}
	public WCCoveragePage clickHOP0049485577(WebDriver driver)  {
		BrowserActions.click(driver, btnHOP0049485577,"HOP0049485577");
		return this;
	}
	public WCCoveragePage clickClose(WebDriver driver)  {
		BrowserActions.click(driver, btnClose,"Close");
		return this;
	}
	public WCCoveragePage clickReview60dayUWPeriod(WebDriver driver)  {
		BrowserActions.click(driver, btnReview60dayUWPeriod,"Review60dayUWPeriod");
		return this;
	}
	public WCCoveragePage clickEditPolicyTransaction(WebDriver driver)  {
		BrowserActions.click(driver, btnEditPolicyTransaction,"EditPolicyTransaction");
		return this;
	}
	public WCCoveragePage clickHOP0082153368(WebDriver driver)  {
		BrowserActions.click(driver, btnHOP0082153368,"HOP0082153368");
		return this;
	}
	public WCCoveragePage clickNewActivity(WebDriver driver)  {
		BrowserActions.click(driver, btnNewActivity,"NewActivity");
		return this;
	}
	public WCCoveragePage clickHOP0197252661(WebDriver driver)  {
		BrowserActions.click(driver, btnHOP0197252661,"HOP0197252661");
		return this;
	}
	public WCCoveragePage clickHOP0207512362(WebDriver driver)  {
		BrowserActions.click(driver, btnHOP0207512362,"HOP0207512362");
		return this;
	}
	public WCCoveragePage clickCancel(WebDriver driver)  {
		BrowserActions.click(driver, btnCancel,"Cancel");
		return this;
	}
	public WCCoveragePage clickPolicyContract(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyContract,"PolicyContract");
		return this;
	}
	public WCCoveragePage clickHOP0198740350(WebDriver driver)  {
		BrowserActions.click(driver, btnHOP0198740350,"HOP0198740350");
		return this;
	}
	public WCCoveragePage clickRequest(WebDriver driver)  {
		BrowserActions.click(driver, btnRequest,"Request");
		return this;
	}
	public WCCoveragePage clickGetRiskInformationProducer(WebDriver driver)  {
		BrowserActions.click(driver, btnGetRiskInformationProducer,"GetRiskInformationProducer");
		return this;
	}
	public WCCoveragePage selectEmployersLiabilityLimit(WebDriver driver,String EmployersLiabilityLimit)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpEmployersLiabilityLimit,EmployersLiabilityLimit,"EmployersLiabilityLimit");
		return this;
	}
	public WCCoveragePage clickAddClass(WebDriver driver)  {
		BrowserActions.click(driver, btnAddClass,"AddClass");
		return this;
	}
	public WCCoveragePage clickOtherStatesInsurance(WebDriver driver)  {
		BrowserActions.click(driver, chkOtherStatesInsurance,"OtherStatesInsurance");
		return this;
	}
	public WCCoveragePage clickGetAuditInternalPersonnel(WebDriver driver)  {
		BrowserActions.click(driver, btnGetAuditInternalPersonnel,"GetAuditInternalPersonnel");
		return this;
	}
	public WCCoveragePage selectWCScheduleCredits(WebDriver driver,String WCScheduleCredits)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpWCScheduleCredits,WCScheduleCredits,"WCScheduleCredits");
		return this;
	}
	public WCCoveragePage selectPolicyPeriodSelector_Arg(WebDriver driver,String PolicyPeriodSelector_Arg)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPolicyPeriodSelector_Arg,PolicyPeriodSelector_Arg,"PolicyPeriodSelector_Arg");
		return this;
	}
	public WCCoveragePage clickShowPartialWorksheet(WebDriver driver)  {
		BrowserActions.click(driver, btnShowPartialWorksheet,"ShowPartialWorksheet");
		return this;
	}
	public WCCoveragePage click60daydiary(WebDriver driver)  {
		BrowserActions.click(driver, btn60daydiary,"60daydiary");
		return this;
	}
	public WCCoveragePage clickBack(WebDriver driver)  {
		BrowserActions.click(driver, btnBack,"Back");
		return this;
	}
	public WCCoveragePage clickPolicyVersions_1(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyVersions_1,"PolicyVersions_1");
		return this;
	}
	public WCCoveragePage clickLocations(WebDriver driver)  {
		BrowserActions.click(driver, btnLocations,"Locations");
		return this;
	}
	public WCCoveragePage clickHOP0029478020(WebDriver driver)  {
		BrowserActions.click(driver, btnHOP0029478020,"HOP0029478020");
		return this;
	}
	public WCCoveragePage clickNext(WebDriver driver)  {
		BrowserActions.click(driver, btnNext,"Next");
		return this;
	}
	public WCCoveragePage clickPA0002347765(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0002347765,"PA0002347765");
		return this;
	}
	public WCCoveragePage clickPA0060823586(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0060823586,"PA0060823586");
		return this;
	}
	public WCCoveragePage clickQuoteRequired(WebDriver driver)  {
		BrowserActions.click(driver, btnQuoteRequired,"QuoteRequired");
		return this;
	}
	public WCCoveragePage clickSaveDraft(WebDriver driver)  {
		BrowserActions.click(driver, btnSaveDraft,"SaveDraft");
		return this;
	}
	public WCCoveragePage clickGetBureauData(WebDriver driver)  {
		BrowserActions.click(driver, btnGetBureauData,"GetBureauData");
		return this;
	}
	public WCCoveragePage clickReinsurance(WebDriver driver)  {
		BrowserActions.click(driver, btnReinsurance,"Reinsurance");
		return this;
	}
	public WCCoveragePage enterCoveredStates(WebDriver driver,String CoveredStates) {
		BrowserActions.type(driver, inpCoveredStates,CoveredStates, "CoveredStates");
		return this;
	}
	public WCCoveragePage clickWorkersCompEmployersLiability(WebDriver driver)  {
		BrowserActions.click(driver, chkWorkersCompEmployersLiability,"WorkersCompEmployersLiability");
		return this;
	}
	public WCCoveragePage clickWCCoverages(WebDriver driver)  {
		BrowserActions.click(driver, btnWCCoverages,"WCCoverages");
		return this;
	}
	public WCCoveragePage clickHOP0043979661(WebDriver driver)  {
		BrowserActions.click(driver, btnHOP0043979661,"HOP0043979661");
		return this;
	}
	public WCCoveragePage clickHOP0043219876(WebDriver driver)  {
		BrowserActions.click(driver, btnHOP0043219876,"HOP0043219876");
		return this;
	}
	public WCCoveragePage clickCreatefromatemplate(WebDriver driver)  {
		BrowserActions.click(driver, btnCreatefromatemplate,"Createfromatemplate");
		return this;
	}
	public WCCoveragePage clickPA0057255712(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0057255712,"PA0057255712");
		return this;
	}
	public WCCoveragePage clickStartSidebySide(WebDriver driver)  {
		BrowserActions.click(driver, btnStartSidebySide,"StartSidebySide");
		return this;
	}
	public WCCoveragePage clickWC0074056230(WebDriver driver)  {
		BrowserActions.click(driver, btnWC0074056230,"WC0074056230");
		return this;
	}
	public WCCoveragePage clickArchiving(WebDriver driver)  {
		BrowserActions.click(driver, btnArchiving,"Archiving");
		return this;
	}
	public WCCoveragePage clickNotTaken(WebDriver driver)  {
		BrowserActions.click(driver, btnNotTaken,"NotTaken");
		return this;
	}
	public WCCoveragePage selectDeductible(WebDriver driver,String Deductible)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpDeductible,Deductible,"Deductible");
		return this;
	}
	public WCCoveragePage clickDocuments(WebDriver driver)  {
		BrowserActions.click(driver, btnDocuments,"Documents");
		return this;
	}
	public WCCoveragePage clickPA0002297637(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0002297637,"PA0002297637");
		return this;
	}
	public WCCoveragePage clickQuote(WebDriver driver)  {
		BrowserActions.click(driver, btnQuote,"Quote");
		return this;
	}
	public WCCoveragePage clickStateCoverages(WebDriver driver)  {
		BrowserActions.click(driver, btnStateCoverages,"StateCoverages");
		return this;
	}
	public WCCoveragePage selectCoveredStates(WebDriver driver,String CoveredStates)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCoveredStates,CoveredStates,"CoveredStates");
		return this;
	}
	public WCCoveragePage clickHOP0237297240(WebDriver driver)  {
		BrowserActions.click(driver, btnHOP0237297240,"HOP0237297240");
		return this;
	}
	public WCCoveragePage clickReleaseLock(WebDriver driver)  {
		BrowserActions.click(driver, btnReleaseLock,"ReleaseLock");
		return this;
	}
	public WCCoveragePage clickHOP0065001603(WebDriver driver)  {
		BrowserActions.click(driver, btnHOP0065001603,"HOP0065001603");
		return this;
	}
	public WCCoveragePage click_checkbox(WebDriver driver)  {
		BrowserActions.click(driver, chk_checkbox,"_checkbox");
		return this;
	}
	public WCCoveragePage clickCreateNewProducer(WebDriver driver)  {
		BrowserActions.click(driver, btnCreateNewProducer,"CreateNewProducer");
		return this;
	}
	public WCCoveragePage clickForms(WebDriver driver)  {
		BrowserActions.click(driver, btnForms,"Forms");
		return this;
	}
	public WCCoveragePage clickNotes(WebDriver driver)  {
		BrowserActions.click(driver, btnNotes,"Notes");
		return this;
	}
	public WCCoveragePage clickHOP0031196546(WebDriver driver)  {
		BrowserActions.click(driver, btnHOP0031196546,"HOP0031196546");
		return this;
	}
	public WCCoveragePage clickQuote_1(WebDriver driver)  {
		BrowserActions.click(driver, btnQuote_1,"Quote_1");
		return this;
	}
	public WCCoveragePage clickGetInspectionLossControl(WebDriver driver)  {
		BrowserActions.click(driver, btnGetInspectionLossControl,"GetInspectionLossControl");
		return this;
	}
	public WCCoveragePage clickPA0007377725(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0007377725,"PA0007377725");
		return this;
	}
	public WCCoveragePage clickCreate(WebDriver driver)  {
		BrowserActions.click(driver, btnCreate,"Create");
		return this;
	}
	public WCCoveragePage enterAnniversaryDate(WebDriver driver,String AnniversaryDate) {
		BrowserActions.type(driver, inpAnniversaryDate,AnniversaryDate, "AnniversaryDate");
		return this;
	}
	public WCCoveragePage clickPA0031508844(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0031508844,"PA0031508844");
		return this;
	}
	public WCCoveragePage clickLegalreview(WebDriver driver)  {
		BrowserActions.click(driver, btnLegalreview,"Legalreview");
		return this;
	}
	public WCCoveragePage clickPA0030766380(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0030766380,"PA0030766380");
		return this;
	}
	public WCCoveragePage clickPolicynotification(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicynotification,"Policynotification");
		return this;
	}
	public WCCoveragePage clickUpdateAllBasis(WebDriver driver)  {
		BrowserActions.click(driver, btnUpdateAllBasis,"UpdateAllBasis");
		return this;
	}
	public WCCoveragePage clickWCScheduleCredits(WebDriver driver)  {
		BrowserActions.click(driver, rdbWCScheduleCredits,"WCScheduleCredits");
		return this;
	}
	public WCCoveragePage clickGoto(WebDriver driver)  {
		BrowserActions.click(driver, btnGoto,"Goto");
		return this;
	}
	public WCCoveragePage clickUnderwriterReview(WebDriver driver)  {
		BrowserActions.click(driver, btnUnderwriterReview,"UnderwriterReview");
		return this;
	}
	public WCCoveragePage click30daydiary(WebDriver driver)  {
		BrowserActions.click(driver, btn30daydiary,"30daydiary");
		return this;
	}
	public WCCoveragePage enterWCScheduleCredits(WebDriver driver,String WCScheduleCredits) {
		BrowserActions.type(driver, inpWCScheduleCredits,WCScheduleCredits, "WCScheduleCredits");
		return this;
	}
	public WCCoveragePage clickHOP0207460171(WebDriver driver)  {
		BrowserActions.click(driver, btnHOP0207460171,"HOP0207460171");
		return this;
	}
	public WCCoveragePage enterANI_OfficialIDEntry(WebDriver driver,String ANI_OfficialIDEntry) {
		BrowserActions.type(driver, inpANI_OfficialIDEntry,ANI_OfficialIDEntry, "ANI_OfficialIDEntry");
		return this;
	}
	public WCCoveragePage clickSidebySideQuoting(WebDriver driver)  {
		BrowserActions.click(driver, btnSidebySideQuoting,"SidebySideQuoting");
		return this;
	}
	public WCCoveragePage clickPA0035777317(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0035777317,"PA0035777317");
		return this;
	}
	public WCCoveragePage clickPA0002939084(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0002939084,"PA0002939084");
		return this;
	}
	public WCCoveragePage clickCollectCreditCard(WebDriver driver)  {
		BrowserActions.click(driver, btnCollectCreditCard,"CollectCreditCard");
		return this;
	}
	public WCCoveragePage clickHOP0043873709(WebDriver driver)  {
		BrowserActions.click(driver, btnHOP0043873709,"HOP0043873709");
		return this;
	}
	public WCCoveragePage clickWC0241798473(WebDriver driver)  {
		BrowserActions.click(driver, btnWC0241798473,"WC0241798473");
		return this;
	}
	public WCCoveragePage clickGL0197461408(WebDriver driver)  {
		BrowserActions.click(driver, btnGL0197461408,"GL0197461408");
		return this;
	}
	public WCCoveragePage clickRatiooutofrange(WebDriver driver)  {
		BrowserActions.click(driver, btnRatiooutofrange,"Ratiooutofrange");
		return this;
	}
	public WCCoveragePage clickFullApp(WebDriver driver)  {
		BrowserActions.click(driver, btnFullApp,"FullApp");
		return this;
	}
	public WCCoveragePage enterIncludedMonopolisticStates(WebDriver driver,String IncludedMonopolisticStates) {
		BrowserActions.type(driver, inpIncludedMonopolisticStates,IncludedMonopolisticStates, "IncludedMonopolisticStates");
		return this;
	}
	public WCCoveragePage clickDiagnosticData(WebDriver driver)  {
		BrowserActions.click(driver, btnDiagnosticData,"DiagnosticData");
		return this;
	}
	public WCCoveragePage clickReminder(WebDriver driver)  {
		BrowserActions.click(driver, btnReminder,"Reminder");
		return this;
	}
	public WCCoveragePage clickWC0065111343(WebDriver driver)  {
		BrowserActions.click(driver, btnWC0065111343,"WC0065111343");
		return this;
	}
	public WCCoveragePage clickPA0049509735(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0049509735,"PA0049509735");
		return this;
	}
	public WCCoveragePage clickWC0245251130(WebDriver driver)  {
		BrowserActions.click(driver, btnWC0245251130,"WC0245251130");
		return this;
	}
	public WCCoveragePage enterExcludedStates(WebDriver driver,String ExcludedStates) {
		BrowserActions.type(driver, inpExcludedStates,ExcludedStates, "ExcludedStates");
		return this;
	}
	public WCCoveragePage clickPA0005084795(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0005084795,"PA0005084795");
		return this;
	}
	public WCCoveragePage clickPA0118973213(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0118973213,"PA0118973213");
		return this;
	}
	public WCCoveragePage clickPA0130954491(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0130954491,"PA0130954491");
		return this;
	}
	public WCCoveragePage clickWC0108480880(WebDriver driver)  {
		BrowserActions.click(driver, btnWC0108480880,"WC0108480880");
		return this;
	}
	public WCCoveragePage clickReviewnewmail(WebDriver driver)  {
		BrowserActions.click(driver, btnReviewnewmail,"Reviewnewmail");
		return this;
	}
	public WCCoveragePage clickGroup(WebDriver driver)  {
		BrowserActions.click(driver, btnGroup,"Group");
		return this;
	}
	public WCCoveragePage clickPA0000129766(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0000129766,"PA0000129766");
		return this;
	}
	public WCCoveragePage clickCancelasplitpolicy(WebDriver driver)  {
		BrowserActions.click(driver, btnCancelasplitpolicy,"Cancelasplitpolicy");
		return this;
	}
	public WCCoveragePage clickPA0061151875(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0061151875,"PA0061151875");
		return this;
	}
	public WCCoveragePage clickGetAuditOutsideService(WebDriver driver)  {
		BrowserActions.click(driver, btnGetAuditOutsideService,"GetAuditOutsideService");
		return this;
	}
	public WCCoveragePage clickNewAuditAssignment(WebDriver driver)  {
		BrowserActions.click(driver, btnNewAuditAssignment,"NewAuditAssignment");
		return this;
	}
	public WCCoveragePage clickRewritetoNewAccount(WebDriver driver)  {
		BrowserActions.click(driver, btnRewritetoNewAccount,"RewritetoNewAccount");
		return this;
	}
	public WCCoveragePage clickPA0051075789(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0051075789,"PA0051075789");
		return this;
	}
	public WCCoveragePage clickReview30dayUWPeriod(WebDriver driver)  {
		BrowserActions.click(driver, btnReview30dayUWPeriod,"Review30dayUWPeriod");
		return this;
	}
	public WCCoveragePage clickPolicyVersions(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyVersions,"PolicyVersions");
		return this;
	}
	public WCCoveragePage selectStopGap(WebDriver driver,String StopGap)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpStopGap,StopGap,"StopGap");
		return this;
	}
	public WCCoveragePage clickHOP0082542218(WebDriver driver)  {
		BrowserActions.click(driver, btnHOP0082542218,"HOP0082542218");
		return this;
	}
	public WCCoveragePage clickWC0280492161(WebDriver driver)  {
		BrowserActions.click(driver, btnWC0280492161,"WC0280492161");
		return this;
	}
	public WCCoveragePage clickGL0049846245(WebDriver driver)  {
		BrowserActions.click(driver, btnGL0049846245,"GL0049846245");
		return this;
	}
	public WCCoveragePage clickStatutoryWorkersComp(WebDriver driver)  {
		BrowserActions.click(driver, chkStatutoryWorkersComp,"StatutoryWorkersComp");
		return this;
	}
	public WCCoveragePage clickCloseOptions(WebDriver driver)  {
		BrowserActions.click(driver, btnCloseOptions,"CloseOptions");
		return this;
	}
	public WCCoveragePage clickPolicyFile(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyFile,"PolicyFile");
		return this;
	}
	public WCCoveragePage clickPA0008939340(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0008939340,"PA0008939340");
		return this;
	}
	public WCCoveragePage clickVerifycoverage(WebDriver driver)  {
		BrowserActions.click(driver, btnVerifycoverage,"Verifycoverage");
		return this;
	}
	public WCCoveragePage clickGetCreditReports(WebDriver driver)  {
		BrowserActions.click(driver, btnGetCreditReports,"GetCreditReports");
		return this;
	}
	public WCCoveragePage clickDecline(WebDriver driver)  {
		BrowserActions.click(driver, btnDecline,"Decline");
		return this;
	}
	public WCCoveragePage clickWizardMenuActions(WebDriver driver)  {
		BrowserActions.click(driver, btnWizardMenuActions,"WizardMenuActions");
		return this;
	}
	public WCCoveragePage clickSubManager(WebDriver driver)  {
		BrowserActions.click(driver, btnSubManager,"SubManager");
		return this;
	}
	public WCCoveragePage enterIncludedStates(WebDriver driver,String IncludedStates) {
		BrowserActions.type(driver, inpIncludedStates,IncludedStates, "IncludedStates");
		return this;
	}
	public WCCoveragePage selectGoverningLaw(WebDriver driver, String law) {
		BrowserActions.selectDropDownByVisibleText(driver,drpGoverningLaw, law, "govering Law");
		return this;
	}
	public WCCoveragePage selectLocation(WebDriver driver) {
		BrowserActions.selectDropDownByIndex(driver, drpLocation, 1, true, "Location");
		return this;
	}
	public WCCoveragePage clickSearchClassCode(WebDriver driver){
		BrowserActions.click(driver, btnSearchClassCode,"Class code search icon");
		return this;
	}

	public WCCoveragePage enterBasis(WebDriver driver, String basis) {
		BrowserActions.type(driver,txtAnnualBasis,basis,"Annual Bais");
		return this;
	}

	/**
	 * Used to Enter on Class code Search
	 * @author vignesh.ravi
	 * @param driver
	 */
	public WCCoveragePage enterClassCodeSearch(WebDriver driver,String code) {
		BrowserActions.type(driver, txtClassCode,code,true,"Class code Search");
		return this;
	}

}
