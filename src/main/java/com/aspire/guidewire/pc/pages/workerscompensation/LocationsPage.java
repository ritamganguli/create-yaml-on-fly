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

public class LocationsPage extends LoadableComponent<LocationsPage> {

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

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-JobWizardToolbarButtonSet-BindOptions-BindOnly>div[role='menuitem']", AI = false)
	public WebElement btnBindOnly;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-0-NewActivityMenuItemSet_Category>div[role='menuitem']", AI = false)
	public WebElement btnInterview;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-6-item>div[role='menuitem']", AI = false)
	public WebElement btnPerformanceReview;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-JobWizardToolbarButtonSet-Versions-NewVersion>div[role='menuitem']", AI = false)
	public WebElement btnStartMultiVersion;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-15-item>div[role='menuitem']", AI = false)
	public WebElement btnReviewProducer;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-LocationsPanelSet-LocationsEdit_DP-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-Phone-GlobalPhoneInputSet-Extension']", AI = false)
	public WebElement inpPhoneExtension;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-46-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0002720800;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-RiskEvaluation>div[role='menuitem']", AI = false)
	public WebElement btnRiskAnalysis_1;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-37-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnWC0236269354;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-8-item>div[role='menuitem']", AI = false)
	public WebElement btnPolicyReviewMidterm;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-LocationsPanelSet-LocationsEdit_DP_tb-addLocationButton-0-UnassignedAccountLocation>div[role='menuitem']", AI = false)
	public WebElement btn212345SanBernardinoCA;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-JobWizardToolbarButtonSet-Versions-ViewSideBySide>div[role='menuitem']", AI = false)
	public WebElement btnViewSideBySideVersions;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-LocationsPanelSet-LocationsEdit_DP-LocationDetailCV-LocationDetailDV-LineLocationDetailInputSet-ChangeLocationNamedInsuredButton-Remove>div[role='menuitem']", AI = false)
	public WebElement btnRemove_1;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-LocationsPanelSet-LocationsEdit_DP-LocationDetailCV-LocationQuestionsCardTab", AI = false)
	public WebElement btnQuestions;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-BillingInfo>div[role='menuitem']", AI = false)
	public WebElement btnPayment;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Change-WizardMenuActions_ChangeEffDate>div[role='menuitem']", AI = false)
	public WebElement btnEffectiveDate;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-36-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnHOP0204404881;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-35-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0049303658;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-13-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnHOP0197148664;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-9-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnHOP0212470370;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-LocationsPanelSet-LocationsEdit_DP-LocationDetailCV-LocationDetailDV-LineLocationDetailInputSet-ChangeLocationNamedInsuredButton-ChangeLocationNamedInsuredButtonMenuIcon>div[role='button']", AI = false)
	public WebElement btnChangeLocationNamedInsuredButtonMenuIcon;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-LocationsPanelSet-LocationsEdit_DP-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-TargetedAddressInputSet-globalAddressContainer-GlobalAddressInputSet-PostalCode']", AI = false)
	public WebElement inpZIPCode;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-2-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0001142472;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-63-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnHOP0033409290;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-47-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnWC0151392695;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-OOSEPanelSet-NextSliceLink", AI = false)
	public WebElement btnNextBlockedDate;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-2-item>div[role='menuitem']", AI = false)
	public WebElement btn90daydiary;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-JobGroupItem>div[role='menuitem']", AI = false)
	public WebElement btnSG00050847959093173949;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-JobWizardToolbarButtonSet-BindOptions>div[role='button']", AI = false)
	public WebElement btnBindOptions;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-LocationsPanelSet-LocationsEdit_DP-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-TargetedAddressInputSet-globalAddressContainer-GlobalAddressInputSet-Country']", AI = false)
	public WebElement drpCountry;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-LocationsPanelSet-LocationsEdit_DP-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-TargetedAddressInputSet-globalAddressContainer-GlobalAddressInputSet-State']", AI = false)
	public WebElement drpState;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-26-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0007833400;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-62-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0004676744;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Archiving-WizardMenuActions_SuspendResumeArchiving>div[role='menuitem']", AI = false)
	public WebElement btnEnableDisable;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-JobWizardToolbarButtonSet-BindOptions-BindAndIssue>div[role='menuitem']", AI = false)
	public WebElement btnIssuePolicy;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-40-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0050170682;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-25-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0092783565;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-10-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0007967715;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-WorkersCompOptions>div[role='menuitem']", AI = false)
	public WebElement btnWCOptions;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-4-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0049954905;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-55-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0010796895;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-MultiQuoteAcceleratedMenuActions-PolicyPeriodSelector", AI = false)
	public WebElement btnPolicyPeriodSelector;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-LocationsPanelSet-LocationsEdit_DP-LocationDetailCV-LocationDetailDV-LineLocationDetailInputSet-ChangeLocationNamedInsuredLabel']", AI = false)
	public WebElement inpChangeLocationNamedInsuredLabel;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-1-NewActivityMenuItemSet_Category>div[role='menuitem']", AI = false)
	public WebElement btnNewmail;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-7-item>div[role='menuitem']", AI = false)
	public WebElement btnGetMotorVehicleReports;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-PreQualification>div[role='menuitem']", AI = false)
	public WebElement btnQualification;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-22-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0060945695;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-LocationsPanelSet-LocationsEdit_DP-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-LocationName']", AI = false)
	public WebElement inpLocationName;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Participants>div[role='menuitem']", AI = false)
	public WebElement btnParticipants;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-24-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0002436160;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-4-NewActivityMenuItemSet_Category-0-item>div[role='menuitem']", AI = false)
	public WebElement btnReviewandapprove;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-OOSEPanelSet-OOSEPeriodSelector-OOSEPeriodSelector_Arg']", AI = false)
	public WebElement drpEffectiveDate;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-5-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0007582893;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-8-JobItem>div[role='menuitem']", AI = false)
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

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-OOSEPanelSet-OOSEPeriodSelector", AI = false)
	public WebElement btnOOSEPeriodSelector;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-11-item>div[role='menuitem']", AI = false)
	public WebElement btnManuallyrateandquotepolicy;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-History>div[role='menuitem']", AI = false)
	public WebElement btnHistory;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-6-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0037153281;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Change>div[role='menuitem']", AI = false)
	public WebElement btnEdit;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-JobWizardToolbarButtonSet-CloseOptions-WithdrawJob>div[role='menuitem']", AI = false)
	public WebElement btnWithdrawTransaction;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-PolicyInfo>div[role='menuitem']", AI = false)
	public WebElement btnPolicyInfo;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-JobWizardToolbarButtonSet-Versions>div[role='button']", AI = false)
	public WebElement btnVersions;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_ToAccountFile>div[role='menuitem']", AI = false)
	public WebElement btnAccountFile;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-LocationsPanelSet-LocationsEdit_DP_tb-Remove>div[role='button']", AI = false)
	public WebElement btnRemove;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-LocationsPanelSet-LocationsEdit_DP-LocationDetailCV-LocationDetailDV-LineLocationDetailInputSet-IndustryCode-SelectIndustryCode", AI = false)
	public WebElement btnSearch_1;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-29-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnGL0049706212;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Change-WizardMenuActions_CopyPolicyData>div[role='menuitem']", AI = false)
	public WebElement btnCopyData;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-14-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnHOP0049485577;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-QuoteRequestedAlert-CloseBtn", AI = false)
	public WebElement btnClose;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-14-item>div[role='menuitem']", AI = false)
	public WebElement btnReview60dayUWPeriod;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-JobWizardToolbarButtonSet-EditPolicy>div[role='button']", AI = false)
	public WebElement btnEditPolicyTransaction;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-51-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnHOP0082153368;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity>div[role='menuitem']", AI = false)
	public WebElement btnNewActivity;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-LocationsPanelSet-LocationsEdit_DP_tb-addAllLocationsButton>div[role='button']", AI = false)
	public WebElement btnAddAllExisting;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-65-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnHOP0197252661;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-70-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnHOP0207512362;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-LocationsPanelSet-LocationsEdit_DP-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-Phone-GlobalPhoneInputSet-PhoneDisplay']", AI = false)
	public WebElement inpPhone_1;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Cancel>div[role='button']", AI = false)
	public WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup>div[role='menuitem']", AI = false)
	public WebElement btnPolicyContract;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-21-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnHOP0198740350;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category>div[role='menuitem']", AI = false)
	public WebElement btnRequest;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-LocationsPanelSet-LocationsEdit_DP-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-NonSpecificLocation']", AI = false)
	public WebElement rdbNonSpecificLocation;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-9-item>div[role='menuitem']", AI = false)
	public WebElement btnGetRiskInformationProducer;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-LocationsPanelSet-LocationsEdit_DP_tb-addLocationButton>div[role='button']", AI = false)
	public WebElement btnAddExistingLocation;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-1-item>div[role='menuitem']", AI = false)
	public WebElement btnGetAuditInternalPersonnel;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-LocationsPanelSet-LocationsEdit_DP-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-TargetedAddressInputSet-globalAddressContainer-GlobalAddressInputSet-PostalCode-AutoFillIcon", AI = false)
	public WebElement btnAutoFillIcon_1;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-MultiQuoteAcceleratedMenuActions-PolicyPeriodSelector-PolicyPeriodSelector_Arg']", AI = false)
	public WebElement drpPolicyPeriodSelector_Arg;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-DiagWorksheetItem-ShowDiagWorksheet>div[role='menuitem']", AI = false)
	public WebElement btnShowPartialWorksheet;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-1-item>div[role='menuitem']", AI = false)
	public WebElement btn60daydiary;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-LocationsPanelSet-LocationsEdit_DP-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-TargetedAddressInputSet-globalAddressContainer-GlobalAddressInputSet-County']", AI = false)
	public WebElement inpCounty;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Prev>div[role='button']", AI = false)
	public WebElement btnBack;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-PolicyVersions>div[role='menuitem']", AI = false)
	public WebElement btnPolicyVersions_1;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-LocationsPanelSet-LocationsEdit_DP-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-LocationCode']", AI = false)
	public WebElement inpLocationCode;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-Locations>div[role='menuitem']", AI = false)
	public WebElement btnLocations;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-18-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnHOP0029478020;

	@IFindBy(how = How.CSS, using = "div[id$='Next']", AI = false)
	public WebElement btnNext;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-42-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0002347765;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-LocationsPanelSet-LocationsEdit_DP-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-UnsyncedAddressInputSet-UnsyncedCountry']", AI = false)
	public WebElement drpCountry_1;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-44-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0060823586;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-LocationsPanelSet-LocationsEdit_DP-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-UnsyncedAddressInputSet-unsyncedAddressString']", AI = false)
	public WebElement inpAddress_1;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-10-item>div[role='menuitem']", AI = false)
	public WebElement btnQuoteRequired;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-LocationsPanelSet-LocationsEdit_DP-LocationDetailCV-AdditionalCoveragesCardTab", AI = false)
	public WebElement btnAdditionalCoverages;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-JobWizardToolbarButtonSet-Draft>div[role='button']", AI = false)
	public WebElement btnSaveDraft;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-3-item>div[role='menuitem']", AI = false)
	public WebElement btnGetBureauData;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-LocationsPanelSet-LocationsEdit_DP-LocationDetailCV-LocationDetailDV-LineLocationDetailInputSet-IndustryCode']", AI = false)
	public WebElement inpIndustryCode;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Reinsurance>div[role='menuitem']", AI = false)
	public WebElement btnReinsurance;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-QuoteRequestedAlert .gw-AlertBar--label", AI = false)
	public WebElement lblQuoteRequestedAlert;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-LocationsPanelSet-LocationsEdit_DP_tb-Add>div[role='button']", AI = false)
	public WebElement btnNewLocation;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-WorkersCompCoverageConfig>div[role='menuitem']", AI = false)
	public WebElement btnWCCoverages;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-LocationsPanelSet-LocationsEdit_DP_tb-setToPrimary>div[role='button']", AI = false)
	public WebElement btnSetAsPrimary;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-LocationsPanelSet-LocationsEdit_DP-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-TargetedAddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine3']", AI = false)
	public WebElement inpAddress3;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-LocationsPanelSet-LocationsEdit_DP-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-TargetedAddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine1']", AI = false)
	public WebElement inpAddress1;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-LocationsPanelSet-LocationsEdit_DP-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-TargetedAddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine2']", AI = false)
	public WebElement inpAddress2;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-31-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnHOP0043979661;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-12-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnHOP0043219876;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewDocument-NewJobDocumentMenuItemSet-PolicyPeriodNewDocumentMenuItemSet_Template>div[role='menuitem']", AI = false)
	public WebElement btnCreatefromatemplate;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-27-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0057255712;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-JobWizardToolbarButtonSet-Versions-SideBySide>div[role='menuitem']", AI = false)
	public WebElement btnStartSidebySide;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-LocationsPanelSet-LocationsEdit_DP-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-TargetedAddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressSummary']", AI = false)
	public WebElement inpAddress;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-57-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnWC0074056230;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Archiving>div[role='menuitem']", AI = false)
	public WebElement btnArchiving;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-LocationsPanelSet-LocationsEdit_DP-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-TargetedAddressInputSet-globalAddressContainer-GlobalAddressInputSet-City-AutoFillIcon", AI = false)
	public WebElement btnAutoFillIcon;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-JobWizardToolbarButtonSet-CloseOptions-NotTakenJob>div[role='menuitem']", AI = false)
	public WebElement btnNotTaken;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-LocationsPanelSet-LocationsEdit_DP-LocationDetailCV-LocationDetailDV-LineLocationDetailInputSet-ChangeLocationNamedInsuredButton']", AI = false)
	public WebElement inpChangeLocationNamedInsuredButton;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Documents>div[role='menuitem']", AI = false)
	public WebElement btnDocuments;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-LocationsPanelSet-LocationsEdit_DP-PreferredCoverageCurrencySelectorRef-PreferredCoverageCurrencyPanelSet-PreferredCoverageCurrencySelectorDropDown']", AI = false)
	public WebElement drpCoveragesin;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-59-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0002297637;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-JobWizardToolbarButtonSet-QuoteTypeToolbarButtonSet-Quote>div[role='button']", AI = false)
	public WebElement btnQuote;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-3-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnHOP0237297240;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-JobWizardToolbarButtonSet-Unlock>div[role='button']", AI = false)
	public WebElement btnReleaseLock;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-45-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnHOP0065001603;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-LocationsPanelSet-LocationsEdit_DP-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-TerritoryCodeInputSet-AutofillLink", AI = false)
	public WebElement btnAutofillTerritoryCodes;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-0-item>div[role='menuitem']", AI = false)
	public WebElement btnCreateNewProducer;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Forms>div[role='menuitem']", AI = false)
	public WebElement btnForms;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-LocationsPanelSet-LocationsEdit_DP-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-UnsyncedAddressInputSet-UnsyncedCounty']", AI = false)
	public WebElement inpCounty_1;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Notes>div[role='menuitem']", AI = false)
	public WebElement btnNotes;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-30-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnHOP0031196546;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-ViewMultiLineQuote>div[role='menuitem']", AI = false)
	public WebElement btnQuote_1;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-5-item>div[role='menuitem']", AI = false)
	public WebElement btnGetInspectionLossControl;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-11-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0007377725;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create>div[role='menuitem']", AI = false)
	public WebElement btnCreate;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-LocationsPanelSet-LocationsEdit_DP-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-TaxLocation']", AI = false)
	public WebElement inpTaxLocation;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-39-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0031508844;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-10-item>div[role='menuitem']", AI = false)
	public WebElement btnLegalreview;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-43-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0030766380;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-7-item>div[role='menuitem']", AI = false)
	public WebElement btnPolicynotification;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-LocationsPanelSet-LocationsEdit_DP-LocationDetailCV-LocationDetailDV-LineLocationDetailInputSet-EmployeeCount']", AI = false)
	public WebElement inpEmployeeCount;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-LocationsPanelSet-LocationsEdit_DP-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-TargetedAddressInputSet-globalAddressContainer-GlobalAddressInputSet-City']", AI = false)
	public WebElement inpCity;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto>div[role='menuitem']", AI = false)
	public WebElement btnGoto;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-4-NewActivityMenuItemSet_Category>div[role='menuitem']", AI = false)
	public WebElement btnUnderwriterReview;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-0-item>div[role='menuitem']", AI = false)
	public WebElement btn30daydiary;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-LocationsPanelSet-LocationsEdit_DP-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-TaxLocation-SelectTaxLocation", AI = false)
	public WebElement btnSearch;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-15-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnHOP0207460171;

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

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-LocationsPanelSet-LocationsEdit_DP-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-Phone-GlobalPhoneInputSet-CountryCode']", AI = false)
	public WebElement drpPhoneRegionCode;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-7-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnWC0241798473;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-LocationsPanelSet-LocationsEdit_DP-LocationDetailCV-GeneralInfoCardTab", AI = false)
	public WebElement btnDetails;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-28-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnGL0197461408;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-11-item>div[role='menuitem']", AI = false)
	public WebElement btnRatiooutofrange;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-JobWizardToolbarButtonSet-ConvertToFullApp>div[role='button']", AI = false)
	public WebElement btnFullApp;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-DiagWorksheetItem>div[role='menuitem']", AI = false)
	public WebElement btnDiagnosticData;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-LocationsPanelSet-LocationsEdit_DP-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-Phone-GlobalPhoneInputSet-NationalSubscriberNumber']", AI = false)
	public WebElement inpPhone;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category>div[role='menuitem']", AI = false)
	public WebElement btnReminder;

	@IFindBy(how = How.CSS, using = "div[id$='LocationsScreen-ttlBar']", AI = false)
	public WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-23-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnWC0065111343;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-68-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0049509735;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-50-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnWC0245251130;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-LocationsPanelSet-LocationsEdit_DP-LocationDetailCV-AccountLocationUpToDateDV-SynchronizedLink", AI = false)
	public WebElement btnViewCurrentLocation;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-1-JobItem>div[role='menuitem']", AI = false)
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

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-48-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnHOP0082542218;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-0-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnWC0280492161;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-20-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnGL0049846245;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-JobWizardToolbarButtonSet-CloseOptions>div[role='button']", AI = false)
	public WebElement btnCloseOptions;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_ToPolicyFile>div[role='menuitem']", AI = false)
	public WebElement btnPolicyFile;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-16-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0008939340;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-17-item>div[role='menuitem']", AI = false)
	public WebElement btnVerifycoverage;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-4-item>div[role='menuitem']", AI = false)
	public WebElement btnGetCreditReports;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-LocationsPanelSet-LocationsEdit_DP-PreferredCoverageCurrencySelectorRef-PreferredCoverageCurrencyPanelSet-CoverageCurrencyDisplay']", AI = false)
	public WebElement inpCoveragesin;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-JobWizardToolbarButtonSet-CloseOptions-Decline>div[role='menuitem']", AI = false)
	public WebElement btnDecline;

	@IFindBy(how = How.CSS, using = "div[id=$'SubmissionWizard-WizardMenuActions']>div[role='button']", AI = false)
	public WebElement btnWizardMenuActions;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardActionsMenuItemSet-SubmissionInfo>div[role='menuitem']", AI = false)
	public WebElement btnSubManager;

	public LocationsPage(){
	}

	public LocationsPage(WebDriver driver){
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
	public LocationsPage clickWorkplan(WebDriver driver)  {
		BrowserActions.click(driver, btnWorkplan,"Workplan");
		return this;
	}
	public LocationsPage clickPA0078666227(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0078666227,"PA0078666227");
		return this;
	}
	public LocationsPage clickHOP0050339114(WebDriver driver)  {
		BrowserActions.click(driver, btnHOP0050339114,"HOP0050339114");
		return this;
	}
	public LocationsPage clickCopySubmission(WebDriver driver)  {
		BrowserActions.click(driver, btnCopySubmission,"CopySubmission");
		return this;
	}
	public LocationsPage clickGeneralreminderdiary(WebDriver driver)  {
		BrowserActions.click(driver, btnGeneralreminderdiary,"Generalreminderdiary");
		return this;
	}
	public LocationsPage clickGetReinsuranceQuote(WebDriver driver)  {
		BrowserActions.click(driver, btnGetReinsuranceQuote,"GetReinsuranceQuote");
		return this;
	}
	public LocationsPage clickPA0006100874(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0006100874,"PA0006100874");
		return this;
	}
	public LocationsPage clickReview45dayUWPeriod(WebDriver driver)  {
		BrowserActions.click(driver, btnReview45dayUWPeriod,"Review45dayUWPeriod");
		return this;
	}
	public LocationsPage clickHOP0197361676(WebDriver driver)  {
		BrowserActions.click(driver, btnHOP0197361676,"HOP0197361676");
		return this;
	}
	public LocationsPage clickBindOnly(WebDriver driver)  {
		BrowserActions.click(driver, btnBindOnly,"BindOnly");
		return this;
	}
	public LocationsPage clickInterview(WebDriver driver)  {
		BrowserActions.click(driver, btnInterview,"Interview");
		return this;
	}
	public LocationsPage clickPerformanceReview(WebDriver driver)  {
		BrowserActions.click(driver, btnPerformanceReview,"PerformanceReview");
		return this;
	}
	public LocationsPage clickStartMultiVersion(WebDriver driver)  {
		BrowserActions.click(driver, btnStartMultiVersion,"StartMultiVersion");
		return this;
	}
	public LocationsPage clickReviewProducer(WebDriver driver)  {
		BrowserActions.click(driver, btnReviewProducer,"ReviewProducer");
		return this;
	}
	public LocationsPage enterPhoneExtension(WebDriver driver,String PhoneExtension) {
		BrowserActions.type(driver, inpPhoneExtension,PhoneExtension, "PhoneExtension");
		return this;
	}
	public LocationsPage clickPA0002720800(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0002720800,"PA0002720800");
		return this;
	}
	public LocationsPage clickRiskAnalysis_1(WebDriver driver)  {
		BrowserActions.click(driver, btnRiskAnalysis_1,"RiskAnalysis_1");
		return this;
	}
	public LocationsPage clickWC0236269354(WebDriver driver)  {
		BrowserActions.click(driver, btnWC0236269354,"WC0236269354");
		return this;
	}
	public LocationsPage clickPolicyReviewMidterm(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyReviewMidterm,"PolicyReviewMidterm");
		return this;
	}
	public LocationsPage click212345SanBernardinoCA(WebDriver driver)  {
		BrowserActions.click(driver, btn212345SanBernardinoCA,"212345SanBernardinoCA");
		return this;
	}
	public LocationsPage clickViewSideBySideVersions(WebDriver driver)  {
		BrowserActions.click(driver, btnViewSideBySideVersions,"ViewSideBySideVersions");
		return this;
	}
	public LocationsPage clickRemove_1(WebDriver driver)  {
		BrowserActions.click(driver, btnRemove_1,"Remove_1");
		return this;
	}
	public LocationsPage clickQuestions(WebDriver driver)  {
		BrowserActions.click(driver, btnQuestions,"Questions");
		return this;
	}
	public LocationsPage clickPayment(WebDriver driver)  {
		BrowserActions.click(driver, btnPayment,"Payment");
		return this;
	}
	public LocationsPage clickEffectiveDate(WebDriver driver)  {
		BrowserActions.click(driver, btnEffectiveDate,"EffectiveDate");
		return this;
	}
	public LocationsPage clickHOP0204404881(WebDriver driver)  {
		BrowserActions.click(driver, btnHOP0204404881,"HOP0204404881");
		return this;
	}
	public LocationsPage clickPA0049303658(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0049303658,"PA0049303658");
		return this;
	}
	public LocationsPage clickHOP0197148664(WebDriver driver)  {
		BrowserActions.click(driver, btnHOP0197148664,"HOP0197148664");
		return this;
	}
	public LocationsPage clickHOP0212470370(WebDriver driver)  {
		BrowserActions.click(driver, btnHOP0212470370,"HOP0212470370");
		return this;
	}
	public LocationsPage clickChangeLocationNamedInsuredButtonMenuIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnChangeLocationNamedInsuredButtonMenuIcon,"ChangeLocationNamedInsuredButtonMenuIcon");
		return this;
	}
	public LocationsPage enterZIPCode(WebDriver driver,String ZIPCode) {
		BrowserActions.type(driver, inpZIPCode,ZIPCode, "ZIPCode");
		return this;
	}
	public LocationsPage clickPA0001142472(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0001142472,"PA0001142472");
		return this;
	}
	public LocationsPage clickHOP0033409290(WebDriver driver)  {
		BrowserActions.click(driver, btnHOP0033409290,"HOP0033409290");
		return this;
	}
	public LocationsPage clickWC0151392695(WebDriver driver)  {
		BrowserActions.click(driver, btnWC0151392695,"WC0151392695");
		return this;
	}
	public LocationsPage clickNextBlockedDate(WebDriver driver)  {
		BrowserActions.click(driver, btnNextBlockedDate,"NextBlockedDate");
		return this;
	}
	public LocationsPage click90daydiary(WebDriver driver)  {
		BrowserActions.click(driver, btn90daydiary,"90daydiary");
		return this;
	}
	public LocationsPage clickSG00050847959093173949(WebDriver driver)  {
		BrowserActions.click(driver, btnSG00050847959093173949,"SG00050847959093173949");
		return this;
	}
	public LocationsPage clickBindOptions(WebDriver driver)  {
		BrowserActions.click(driver, btnBindOptions,"BindOptions");
		return this;
	}
	public LocationsPage selectCountry(WebDriver driver,String Country)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCountry,Country,"Country");
		return this;
	}
	public LocationsPage selectState(WebDriver driver,String State)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpState,State,"State");
		return this;
	}
	public LocationsPage clickPA0007833400(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0007833400,"PA0007833400");
		return this;
	}
	public LocationsPage clickPA0004676744(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0004676744,"PA0004676744");
		return this;
	}
	public LocationsPage clickEnableDisable(WebDriver driver)  {
		BrowserActions.click(driver, btnEnableDisable,"EnableDisable");
		return this;
	}
	public LocationsPage clickIssuePolicy(WebDriver driver)  {
		BrowserActions.click(driver, btnIssuePolicy,"IssuePolicy");
		return this;
	}
	public LocationsPage clickPA0050170682(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0050170682,"PA0050170682");
		return this;
	}
	public LocationsPage clickPA0092783565(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0092783565,"PA0092783565");
		return this;
	}
	public LocationsPage clickPA0007967715(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0007967715,"PA0007967715");
		return this;
	}
	public LocationsPage clickWCOptions(WebDriver driver)  {
		BrowserActions.click(driver, btnWCOptions,"WCOptions");
		return this;
	}
	public LocationsPage clickPA0049954905(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0049954905,"PA0049954905");
		return this;
	}
	public LocationsPage clickPA0010796895(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0010796895,"PA0010796895");
		return this;
	}
	public LocationsPage clickPolicyPeriodSelector(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyPeriodSelector,"PolicyPeriodSelector");
		return this;
	}
	public LocationsPage enterChangeLocationNamedInsuredLabel(WebDriver driver,String ChangeLocationNamedInsuredLabel) {
		BrowserActions.type(driver, inpChangeLocationNamedInsuredLabel,ChangeLocationNamedInsuredLabel, "ChangeLocationNamedInsuredLabel");
		return this;
	}
	public LocationsPage clickNewmail(WebDriver driver)  {
		BrowserActions.click(driver, btnNewmail,"Newmail");
		return this;
	}
	public LocationsPage clickGetMotorVehicleReports(WebDriver driver)  {
		BrowserActions.click(driver, btnGetMotorVehicleReports,"GetMotorVehicleReports");
		return this;
	}
	public LocationsPage clickQualification(WebDriver driver)  {
		BrowserActions.click(driver, btnQualification,"Qualification");
		return this;
	}
	public LocationsPage clickPA0060945695(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0060945695,"PA0060945695");
		return this;
	}
	public LocationsPage enterLocationName(WebDriver driver,String LocationName) {
		BrowserActions.type(driver, inpLocationName,LocationName, "LocationName");
		return this;
	}
	public LocationsPage clickParticipants(WebDriver driver)  {
		BrowserActions.click(driver, btnParticipants,"Participants");
		return this;
	}
	public LocationsPage clickPA0002436160(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0002436160,"PA0002436160");
		return this;
	}
	public LocationsPage clickReviewandapprove(WebDriver driver)  {
		BrowserActions.click(driver, btnReviewandapprove,"Reviewandapprove");
		return this;
	}
	public LocationsPage selectEffectiveDate(WebDriver driver,String EffectiveDate)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpEffectiveDate,EffectiveDate,"EffectiveDate");
		return this;
	}
	public LocationsPage clickPA0007582893(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0007582893,"PA0007582893");
		return this;
	}
	public LocationsPage clickHOP0199659518(WebDriver driver)  {
		BrowserActions.click(driver, btnHOP0199659518,"HOP0199659518");
		return this;
	}
	public LocationsPage clickNewDocument(WebDriver driver)  {
		BrowserActions.click(driver, btnNewDocument,"NewDocument");
		return this;
	}
	public LocationsPage clickPA0129900022(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0129900022,"PA0129900022");
		return this;
	}
	public LocationsPage clickUploaddocuments(WebDriver driver)  {
		BrowserActions.click(driver, btnUploaddocuments,"Uploaddocuments");
		return this;
	}
	public LocationsPage clickFinish(WebDriver driver)  {
		BrowserActions.click(driver, btnFinish,"Finish");
		return this;
	}
	public LocationsPage clickProductDefinition(WebDriver driver)  {
		BrowserActions.click(driver, btnProductDefinition,"ProductDefinition");
		return this;
	}
	public LocationsPage clickGetInspectionOutsideService(WebDriver driver)  {
		BrowserActions.click(driver, btnGetInspectionOutsideService,"GetInspectionOutsideService");
		return this;
	}
	public LocationsPage clickCPP0049614273(WebDriver driver)  {
		BrowserActions.click(driver, btnCPP0049614273,"CPP0049614273");
		return this;
	}
	public LocationsPage clickMeetwithInsured(WebDriver driver)  {
		BrowserActions.click(driver, btnMeetwithInsured,"MeetwithInsured");
		return this;
	}
	public LocationsPage clickOfferings(WebDriver driver)  {
		BrowserActions.click(driver, btnOfferings,"Offerings");
		return this;
	}
	public LocationsPage clickPolicyReviewRenewal(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyReviewRenewal,"PolicyReviewRenewal");
		return this;
	}
	public LocationsPage clickNewNote(WebDriver driver)  {
		BrowserActions.click(driver, btnNewNote,"NewNote");
		return this;
	}
	public LocationsPage clickRiskAnalysis(WebDriver driver)  {
		BrowserActions.click(driver, btnRiskAnalysis,"RiskAnalysis");
		return this;
	}
	public LocationsPage clickMeetwithProducerAgency(WebDriver driver)  {
		BrowserActions.click(driver, btnMeetwithProducerAgency,"MeetwithProducerAgency");
		return this;
	}
	public LocationsPage clickPA0050022880(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0050022880,"PA0050022880");
		return this;
	}
	public LocationsPage clickSupplemental(WebDriver driver)  {
		BrowserActions.click(driver, btnSupplemental,"Supplemental");
		return this;
	}
	public LocationsPage clickPA0032919629(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0032919629,"PA0032919629");
		return this;
	}
	public LocationsPage clickHOP0236891855(WebDriver driver)  {
		BrowserActions.click(driver, btnHOP0236891855,"HOP0236891855");
		return this;
	}
	public LocationsPage clickPolicyReview(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyReview,"PolicyReview");
		return this;
	}
	public LocationsPage clickPA0021575179(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0021575179,"PA0021575179");
		return this;
	}
	public LocationsPage clickOOSEPeriodSelector(WebDriver driver)  {
		BrowserActions.click(driver, btnOOSEPeriodSelector,"OOSEPeriodSelector");
		return this;
	}
	public LocationsPage clickManuallyrateandquotepolicy(WebDriver driver)  {
		BrowserActions.click(driver, btnManuallyrateandquotepolicy,"Manuallyrateandquotepolicy");
		return this;
	}
	public LocationsPage clickHistory(WebDriver driver)  {
		BrowserActions.click(driver, btnHistory,"History");
		return this;
	}
	public LocationsPage clickPA0037153281(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0037153281,"PA0037153281");
		return this;
	}
	public LocationsPage clickEdit(WebDriver driver)  {
		BrowserActions.click(driver, btnEdit,"Edit");
		return this;
	}
	public LocationsPage clickWithdrawTransaction(WebDriver driver)  {
		BrowserActions.click(driver, btnWithdrawTransaction,"WithdrawTransaction");
		return this;
	}
	public LocationsPage clickPolicyInfo(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyInfo,"PolicyInfo");
		return this;
	}
	public LocationsPage clickVersions(WebDriver driver)  {
		BrowserActions.click(driver, btnVersions,"Versions");
		return this;
	}
	public LocationsPage clickAccountFile(WebDriver driver)  {
		BrowserActions.click(driver, btnAccountFile,"AccountFile");
		return this;
	}
	public LocationsPage clickRemove(WebDriver driver)  {
		BrowserActions.click(driver, btnRemove,"Remove");
		return this;
	}
	public LocationsPage clickSearch_1(WebDriver driver)  {
		BrowserActions.click(driver, btnSearch_1,"Search_1");
		return this;
	}
	public LocationsPage clickGL0049706212(WebDriver driver)  {
		BrowserActions.click(driver, btnGL0049706212,"GL0049706212");
		return this;
	}
	public LocationsPage clickCopyData(WebDriver driver)  {
		BrowserActions.click(driver, btnCopyData,"CopyData");
		return this;
	}
	public LocationsPage clickHOP0049485577(WebDriver driver)  {
		BrowserActions.click(driver, btnHOP0049485577,"HOP0049485577");
		return this;
	}
	public LocationsPage clickClose(WebDriver driver)  {
		BrowserActions.click(driver, btnClose,"Close");
		return this;
	}
	public LocationsPage clickReview60dayUWPeriod(WebDriver driver)  {
		BrowserActions.click(driver, btnReview60dayUWPeriod,"Review60dayUWPeriod");
		return this;
	}
	public LocationsPage clickEditPolicyTransaction(WebDriver driver)  {
		BrowserActions.click(driver, btnEditPolicyTransaction,"EditPolicyTransaction");
		return this;
	}
	public LocationsPage clickHOP0082153368(WebDriver driver)  {
		BrowserActions.click(driver, btnHOP0082153368,"HOP0082153368");
		return this;
	}
	public LocationsPage clickNewActivity(WebDriver driver)  {
		BrowserActions.click(driver, btnNewActivity,"NewActivity");
		return this;
	}
	public LocationsPage clickAddAllExisting(WebDriver driver)  {
		BrowserActions.click(driver, btnAddAllExisting,"AddAllExisting");
		return this;
	}
	public LocationsPage clickHOP0197252661(WebDriver driver)  {
		BrowserActions.click(driver, btnHOP0197252661,"HOP0197252661");
		return this;
	}
	public LocationsPage clickHOP0207512362(WebDriver driver)  {
		BrowserActions.click(driver, btnHOP0207512362,"HOP0207512362");
		return this;
	}
	public LocationsPage enterPhone_1(WebDriver driver,String Phone_1) {
		BrowserActions.type(driver, inpPhone_1,Phone_1, "Phone_1");
		return this;
	}
	public LocationsPage clickCancel(WebDriver driver)  {
		BrowserActions.click(driver, btnCancel,"Cancel");
		return this;
	}
	public LocationsPage clickPolicyContract(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyContract,"PolicyContract");
		return this;
	}
	public LocationsPage clickHOP0198740350(WebDriver driver)  {
		BrowserActions.click(driver, btnHOP0198740350,"HOP0198740350");
		return this;
	}
	public LocationsPage clickRequest(WebDriver driver)  {
		BrowserActions.click(driver, btnRequest,"Request");
		return this;
	}
	public LocationsPage clickNonSpecificLocation(WebDriver driver)  {
		BrowserActions.click(driver, rdbNonSpecificLocation,"NonSpecificLocation");
		return this;
	}
	public LocationsPage clickGetRiskInformationProducer(WebDriver driver)  {
		BrowserActions.click(driver, btnGetRiskInformationProducer,"GetRiskInformationProducer");
		return this;
	}
	public LocationsPage clickAddExistingLocation(WebDriver driver)  {
		BrowserActions.click(driver, btnAddExistingLocation,"AddExistingLocation");
		return this;
	}
	public LocationsPage clickGetAuditInternalPersonnel(WebDriver driver)  {
		BrowserActions.click(driver, btnGetAuditInternalPersonnel,"GetAuditInternalPersonnel");
		return this;
	}
	public LocationsPage clickAutoFillIcon_1(WebDriver driver)  {
		BrowserActions.click(driver, btnAutoFillIcon_1,"AutoFillIcon_1");
		return this;
	}
	public LocationsPage selectPolicyPeriodSelector_Arg(WebDriver driver,String PolicyPeriodSelector_Arg)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPolicyPeriodSelector_Arg,PolicyPeriodSelector_Arg,"PolicyPeriodSelector_Arg");
		return this;
	}
	public LocationsPage clickShowPartialWorksheet(WebDriver driver)  {
		BrowserActions.click(driver, btnShowPartialWorksheet,"ShowPartialWorksheet");
		return this;
	}
	public LocationsPage click60daydiary(WebDriver driver)  {
		BrowserActions.click(driver, btn60daydiary,"60daydiary");
		return this;
	}
	public LocationsPage enterCounty(WebDriver driver,String County) {
		BrowserActions.type(driver, inpCounty,County, "County");
		return this;
	}
	public LocationsPage clickBack(WebDriver driver)  {
		BrowserActions.click(driver, btnBack,"Back");
		return this;
	}
	public LocationsPage clickPolicyVersions_1(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyVersions_1,"PolicyVersions_1");
		return this;
	}
	public LocationsPage enterLocationCode(WebDriver driver,String LocationCode) {
		BrowserActions.type(driver, inpLocationCode,LocationCode, "LocationCode");
		return this;
	}
	public LocationsPage clickLocations(WebDriver driver)  {
		BrowserActions.click(driver, btnLocations,"Locations");
		return this;
	}
	public LocationsPage clickHOP0029478020(WebDriver driver)  {
		BrowserActions.click(driver, btnHOP0029478020,"HOP0029478020");
		return this;
	}
	public LocationsPage clickNext(WebDriver driver)  {
		BrowserActions.click(driver, btnNext,"Next");
		return this;
	}
	public LocationsPage clickPA0002347765(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0002347765,"PA0002347765");
		return this;
	}
	public LocationsPage selectCountry_1(WebDriver driver,String Country_1)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCountry_1,Country_1,"Country_1");
		return this;
	}
	public LocationsPage clickPA0060823586(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0060823586,"PA0060823586");
		return this;
	}
	public LocationsPage enterAddress_1(WebDriver driver,String Address_1) {
		BrowserActions.type(driver, inpAddress_1,Address_1, "Address_1");
		return this;
	}
	public LocationsPage clickQuoteRequired(WebDriver driver)  {
		BrowserActions.click(driver, btnQuoteRequired,"QuoteRequired");
		return this;
	}
	public LocationsPage clickAdditionalCoverages(WebDriver driver)  {
		BrowserActions.click(driver, btnAdditionalCoverages,"AdditionalCoverages");
		return this;
	}
	public LocationsPage clickSaveDraft(WebDriver driver)  {
		BrowserActions.click(driver, btnSaveDraft,"SaveDraft");
		return this;
	}
	public LocationsPage clickGetBureauData(WebDriver driver)  {
		BrowserActions.click(driver, btnGetBureauData,"GetBureauData");
		return this;
	}
	public LocationsPage enterIndustryCode(WebDriver driver,String IndustryCode) {
		BrowserActions.type(driver, inpIndustryCode,IndustryCode, "IndustryCode");
		return this;
	}
	public LocationsPage clickReinsurance(WebDriver driver)  {
		BrowserActions.click(driver, btnReinsurance,"Reinsurance");
		return this;
	}
	public LocationsPage clickNewLocation(WebDriver driver)  {
		BrowserActions.click(driver, btnNewLocation,"NewLocation");
		return this;
	}
	public LocationsPage clickWCCoverages(WebDriver driver)  {
		BrowserActions.click(driver, btnWCCoverages,"WCCoverages");
		return this;
	}
	public LocationsPage clickSetAsPrimary(WebDriver driver)  {
		BrowserActions.click(driver, btnSetAsPrimary,"SetAsPrimary");
		return this;
	}
	public LocationsPage enterAddress3(WebDriver driver,String Address3) {
		BrowserActions.type(driver, inpAddress3,Address3, "Address3");
		return this;
	}
	public LocationsPage enterAddress1(WebDriver driver,String Address1) {
		BrowserActions.type(driver, inpAddress1,Address1, "Address1");
		return this;
	}
	public LocationsPage enterAddress2(WebDriver driver,String Address2) {
		BrowserActions.type(driver, inpAddress2,Address2, "Address2");
		return this;
	}
	public LocationsPage clickHOP0043979661(WebDriver driver)  {
		BrowserActions.click(driver, btnHOP0043979661,"HOP0043979661");
		return this;
	}
	public LocationsPage clickHOP0043219876(WebDriver driver)  {
		BrowserActions.click(driver, btnHOP0043219876,"HOP0043219876");
		return this;
	}
	public LocationsPage clickCreatefromatemplate(WebDriver driver)  {
		BrowserActions.click(driver, btnCreatefromatemplate,"Createfromatemplate");
		return this;
	}
	public LocationsPage clickPA0057255712(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0057255712,"PA0057255712");
		return this;
	}
	public LocationsPage clickStartSidebySide(WebDriver driver)  {
		BrowserActions.click(driver, btnStartSidebySide,"StartSidebySide");
		return this;
	}
	public LocationsPage enterAddress(WebDriver driver,String Address) {
		BrowserActions.type(driver, inpAddress,Address, "Address");
		return this;
	}
	public LocationsPage clickWC0074056230(WebDriver driver)  {
		BrowserActions.click(driver, btnWC0074056230,"WC0074056230");
		return this;
	}
	public LocationsPage clickArchiving(WebDriver driver)  {
		BrowserActions.click(driver, btnArchiving,"Archiving");
		return this;
	}
	public LocationsPage clickAutoFillIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnAutoFillIcon,"AutoFillIcon");
		return this;
	}
	public LocationsPage clickNotTaken(WebDriver driver)  {
		BrowserActions.click(driver, btnNotTaken,"NotTaken");
		return this;
	}
	public LocationsPage enterChangeLocationNamedInsuredButton(WebDriver driver,String ChangeLocationNamedInsuredButton) {
		BrowserActions.type(driver, inpChangeLocationNamedInsuredButton,ChangeLocationNamedInsuredButton, "ChangeLocationNamedInsuredButton");
		return this;
	}
	public LocationsPage clickDocuments(WebDriver driver)  {
		BrowserActions.click(driver, btnDocuments,"Documents");
		return this;
	}
	public LocationsPage selectCoveragesin(WebDriver driver,String Coveragesin)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCoveragesin,Coveragesin,"Coveragesin");
		return this;
	}
	public LocationsPage clickPA0002297637(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0002297637,"PA0002297637");
		return this;
	}
	public LocationsPage clickQuote(WebDriver driver)  {
		BrowserActions.click(driver, btnQuote,"Quote");
		return this;
	}
	public LocationsPage clickHOP0237297240(WebDriver driver)  {
		BrowserActions.click(driver, btnHOP0237297240,"HOP0237297240");
		return this;
	}
	public LocationsPage clickReleaseLock(WebDriver driver)  {
		BrowserActions.click(driver, btnReleaseLock,"ReleaseLock");
		return this;
	}
	public LocationsPage clickHOP0065001603(WebDriver driver)  {
		BrowserActions.click(driver, btnHOP0065001603,"HOP0065001603");
		return this;
	}
	public LocationsPage clickAutofillTerritoryCodes(WebDriver driver)  {
		BrowserActions.click(driver, btnAutofillTerritoryCodes,"AutofillTerritoryCodes");
		return this;
	}
	public LocationsPage clickCreateNewProducer(WebDriver driver)  {
		BrowserActions.click(driver, btnCreateNewProducer,"CreateNewProducer");
		return this;
	}
	public LocationsPage clickForms(WebDriver driver)  {
		BrowserActions.click(driver, btnForms,"Forms");
		return this;
	}
	public LocationsPage enterCounty_1(WebDriver driver,String County_1) {
		BrowserActions.type(driver, inpCounty_1,County_1, "County_1");
		return this;
	}
	public LocationsPage clickNotes(WebDriver driver)  {
		BrowserActions.click(driver, btnNotes,"Notes");
		return this;
	}
	public LocationsPage clickHOP0031196546(WebDriver driver)  {
		BrowserActions.click(driver, btnHOP0031196546,"HOP0031196546");
		return this;
	}
	public LocationsPage clickQuote_1(WebDriver driver)  {
		BrowserActions.click(driver, btnQuote_1,"Quote_1");
		return this;
	}
	public LocationsPage clickGetInspectionLossControl(WebDriver driver)  {
		BrowserActions.click(driver, btnGetInspectionLossControl,"GetInspectionLossControl");
		return this;
	}
	public LocationsPage clickPA0007377725(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0007377725,"PA0007377725");
		return this;
	}
	public LocationsPage clickCreate(WebDriver driver)  {
		BrowserActions.click(driver, btnCreate,"Create");
		return this;
	}
	public LocationsPage enterTaxLocation(WebDriver driver,String TaxLocation) {
		BrowserActions.type(driver, inpTaxLocation,TaxLocation, "TaxLocation");
		return this;
	}
	public LocationsPage clickPA0031508844(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0031508844,"PA0031508844");
		return this;
	}
	public LocationsPage clickLegalreview(WebDriver driver)  {
		BrowserActions.click(driver, btnLegalreview,"Legalreview");
		return this;
	}
	public LocationsPage clickPA0030766380(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0030766380,"PA0030766380");
		return this;
	}
	public LocationsPage clickPolicynotification(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicynotification,"Policynotification");
		return this;
	}
	public LocationsPage enterEmployeeCount(WebDriver driver,String EmployeeCount) {
		BrowserActions.type(driver, inpEmployeeCount,EmployeeCount, "EmployeeCount");
		return this;
	}
	public LocationsPage enterCity(WebDriver driver,String City) {
		BrowserActions.type(driver, inpCity,City, "City");
		return this;
	}
	public LocationsPage clickGoto(WebDriver driver)  {
		BrowserActions.click(driver, btnGoto,"Goto");
		return this;
	}
	public LocationsPage clickUnderwriterReview(WebDriver driver)  {
		BrowserActions.click(driver, btnUnderwriterReview,"UnderwriterReview");
		return this;
	}
	public LocationsPage click30daydiary(WebDriver driver)  {
		BrowserActions.click(driver, btn30daydiary,"30daydiary");
		return this;
	}
	public LocationsPage clickSearch(WebDriver driver)  {
		BrowserActions.click(driver, btnSearch,"Search");
		return this;
	}
	public LocationsPage clickHOP0207460171(WebDriver driver)  {
		BrowserActions.click(driver, btnHOP0207460171,"HOP0207460171");
		return this;
	}
	public LocationsPage clickSidebySideQuoting(WebDriver driver)  {
		BrowserActions.click(driver, btnSidebySideQuoting,"SidebySideQuoting");
		return this;
	}
	public LocationsPage clickPA0035777317(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0035777317,"PA0035777317");
		return this;
	}
	public LocationsPage clickPA0002939084(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0002939084,"PA0002939084");
		return this;
	}
	public LocationsPage clickCollectCreditCard(WebDriver driver)  {
		BrowserActions.click(driver, btnCollectCreditCard,"CollectCreditCard");
		return this;
	}
	public LocationsPage clickHOP0043873709(WebDriver driver)  {
		BrowserActions.click(driver, btnHOP0043873709,"HOP0043873709");
		return this;
	}
	public LocationsPage selectPhoneRegionCode(WebDriver driver,String PhoneRegionCode)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPhoneRegionCode,PhoneRegionCode,"PhoneRegionCode");
		return this;
	}
	public LocationsPage clickWC0241798473(WebDriver driver)  {
		BrowserActions.click(driver, btnWC0241798473,"WC0241798473");
		return this;
	}
	public LocationsPage clickDetails(WebDriver driver)  {
		BrowserActions.click(driver, btnDetails,"Details");
		return this;
	}
	public LocationsPage clickGL0197461408(WebDriver driver)  {
		BrowserActions.click(driver, btnGL0197461408,"GL0197461408");
		return this;
	}
	public LocationsPage clickRatiooutofrange(WebDriver driver)  {
		BrowserActions.click(driver, btnRatiooutofrange,"Ratiooutofrange");
		return this;
	}
	public LocationsPage clickFullApp(WebDriver driver)  {
		BrowserActions.click(driver, btnFullApp,"FullApp");
		return this;
	}
	public LocationsPage clickDiagnosticData(WebDriver driver)  {
		BrowserActions.click(driver, btnDiagnosticData,"DiagnosticData");
		return this;
	}
	public LocationsPage enterPhone(WebDriver driver,String Phone) {
		BrowserActions.type(driver, inpPhone,Phone, "Phone");
		return this;
	}
	public LocationsPage clickReminder(WebDriver driver)  {
		BrowserActions.click(driver, btnReminder,"Reminder");
		return this;
	}
	public LocationsPage clickWC0065111343(WebDriver driver)  {
		BrowserActions.click(driver, btnWC0065111343,"WC0065111343");
		return this;
	}
	public LocationsPage clickPA0049509735(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0049509735,"PA0049509735");
		return this;
	}
	public LocationsPage clickWC0245251130(WebDriver driver)  {
		BrowserActions.click(driver, btnWC0245251130,"WC0245251130");
		return this;
	}
	public LocationsPage clickViewCurrentLocation(WebDriver driver)  {
		BrowserActions.click(driver, btnViewCurrentLocation,"ViewCurrentLocation");
		return this;
	}
	public LocationsPage clickPA0005084795(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0005084795,"PA0005084795");
		return this;
	}
	public LocationsPage clickPA0118973213(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0118973213,"PA0118973213");
		return this;
	}
	public LocationsPage clickPA0130954491(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0130954491,"PA0130954491");
		return this;
	}
	public LocationsPage clickWC0108480880(WebDriver driver)  {
		BrowserActions.click(driver, btnWC0108480880,"WC0108480880");
		return this;
	}
	public LocationsPage clickReviewnewmail(WebDriver driver)  {
		BrowserActions.click(driver, btnReviewnewmail,"Reviewnewmail");
		return this;
	}
	public LocationsPage clickGroup(WebDriver driver)  {
		BrowserActions.click(driver, btnGroup,"Group");
		return this;
	}
	public LocationsPage clickPA0000129766(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0000129766,"PA0000129766");
		return this;
	}
	public LocationsPage clickCancelasplitpolicy(WebDriver driver)  {
		BrowserActions.click(driver, btnCancelasplitpolicy,"Cancelasplitpolicy");
		return this;
	}
	public LocationsPage clickPA0061151875(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0061151875,"PA0061151875");
		return this;
	}
	public LocationsPage clickGetAuditOutsideService(WebDriver driver)  {
		BrowserActions.click(driver, btnGetAuditOutsideService,"GetAuditOutsideService");
		return this;
	}
	public LocationsPage clickNewAuditAssignment(WebDriver driver)  {
		BrowserActions.click(driver, btnNewAuditAssignment,"NewAuditAssignment");
		return this;
	}
	public LocationsPage clickRewritetoNewAccount(WebDriver driver)  {
		BrowserActions.click(driver, btnRewritetoNewAccount,"RewritetoNewAccount");
		return this;
	}
	public LocationsPage clickPA0051075789(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0051075789,"PA0051075789");
		return this;
	}
	public LocationsPage clickReview30dayUWPeriod(WebDriver driver)  {
		BrowserActions.click(driver, btnReview30dayUWPeriod,"Review30dayUWPeriod");
		return this;
	}
	public LocationsPage clickPolicyVersions(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyVersions,"PolicyVersions");
		return this;
	}
	public LocationsPage clickHOP0082542218(WebDriver driver)  {
		BrowserActions.click(driver, btnHOP0082542218,"HOP0082542218");
		return this;
	}
	public LocationsPage clickWC0280492161(WebDriver driver)  {
		BrowserActions.click(driver, btnWC0280492161,"WC0280492161");
		return this;
	}
	public LocationsPage clickGL0049846245(WebDriver driver)  {
		BrowserActions.click(driver, btnGL0049846245,"GL0049846245");
		return this;
	}
	public LocationsPage clickCloseOptions(WebDriver driver)  {
		BrowserActions.click(driver, btnCloseOptions,"CloseOptions");
		return this;
	}
	public LocationsPage clickPolicyFile(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyFile,"PolicyFile");
		return this;
	}
	public LocationsPage clickPA0008939340(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0008939340,"PA0008939340");
		return this;
	}
	public LocationsPage clickVerifycoverage(WebDriver driver)  {
		BrowserActions.click(driver, btnVerifycoverage,"Verifycoverage");
		return this;
	}
	public LocationsPage clickGetCreditReports(WebDriver driver)  {
		BrowserActions.click(driver, btnGetCreditReports,"GetCreditReports");
		return this;
	}
	public LocationsPage enterCoveragesin(WebDriver driver,String Coveragesin) {
		BrowserActions.type(driver, inpCoveragesin,Coveragesin, "Coveragesin");
		return this;
	}
	public LocationsPage clickDecline(WebDriver driver)  {
		BrowserActions.click(driver, btnDecline,"Decline");
		return this;
	}
	public LocationsPage clickWizardMenuActions(WebDriver driver)  {
		BrowserActions.click(driver, btnWizardMenuActions,"WizardMenuActions");
		return this;
	}
	public LocationsPage clickSubManager(WebDriver driver)  {
		BrowserActions.click(driver, btnSubManager,"SubManager");
		return this;
	}
}
