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

public class LocationsPage extends LoadableComponent<LocationsPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-QuestionSetsDV-0-QuestionSetLV-1-QuestionModalInput-StringFieldInput_NoPost']", AI = false)
	public WebElement inpStringFieldInput_NoPost_12;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Workplan>div[role='menuitem']", AI = false)
	public WebElement btnWorkplan;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-QuestionSetsDV-0-QuestionSetLV-2-QuestionModalInput-StringFieldInput_NoPost']", AI = false)
	public WebElement inpStringFieldInput_NoPost_14;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_CopySubmission>div[role='menuitem']", AI = false)
	public WebElement btnCopySubmission;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-4-item>div[role='menuitem']", AI = false)
	public WebElement btnGeneralreminderdiary;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-8-item>div[role='menuitem']", AI = false)
	public WebElement btnGetReinsuranceQuote;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-QuestionSetsDV-3-QuestionSetLV-2-questionText']", AI = false)
	public WebElement inpQuestionText_61;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-13-item>div[role='menuitem']", AI = false)
	public WebElement btnReview45dayUWPeriod;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-QuestionSetsDV-3-QuestionSetLV-3-questionText']", AI = false)
	public WebElement inpQuestionText_63;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-QuestionSetsDV-2-QuestionSetLV-8-questionText']", AI = false)
	public WebElement inpQuestionText_55;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-QuestionSetsDV-3-QuestionSetLV-0-questionText']", AI = false)
	public WebElement inpQuestionText_57;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-QuestionSetsDV-3-QuestionSetLV-1-questionText']", AI = false)
	public WebElement inpQuestionText_59;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-JobWizardToolbarButtonSet-BindOptions-BindOnly>div[role='menuitem']", AI = false)
	public WebElement btnBindOnly;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-0-NewActivityMenuItemSet_Category>div[role='menuitem']", AI = false)
	public WebElement btnInterview;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-QuestionSetsDV-0-QuestionSetLV-3-QuestionModalInput-StringFieldInput_NoPost']", AI = false)
	public WebElement inpStringFieldInput_NoPost_16;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-6-item>div[role='menuitem']", AI = false)
	public WebElement btnPerformanceReview;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-QuestionSetsDV-0-QuestionSetLV-4-QuestionModalInput-StringFieldInput_NoPost']", AI = false)
	public WebElement inpStringFieldInput_NoPost_18;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-JobWizardToolbarButtonSet-Versions-NewVersion>div[role='menuitem']", AI = false)
	public WebElement btnStartMultiVersion;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-15-item>div[role='menuitem']", AI = false)
	public WebElement btnReviewProducer;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-Phone-GlobalPhoneInputSet-Extension']", AI = false)
	public WebElement inpPhoneExtension;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-QuestionSetsDV-3-QuestionSetLV-7-questionText']", AI = false)
	public WebElement inpQuestionText_71;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-QuestionSetsDV-3-QuestionSetLV-8-questionText']", AI = false)
	public WebElement inpQuestionText_73;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-QuestionSetsDV-4-QuestionSetLV-0-questionText']", AI = false)
	public WebElement inpQuestionText_75;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-QuestionSetsDV-3-QuestionSetLV-4-questionText']", AI = false)
	public WebElement inpQuestionText_65;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-8-item>div[role='menuitem']", AI = false)
	public WebElement btnPolicyReviewMidterm;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-QuestionSetsDV-3-QuestionSetLV-5-questionText']", AI = false)
	public WebElement inpQuestionText_67;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-QuestionSetsDV-3-QuestionSetLV-6-questionText']", AI = false)
	public WebElement inpQuestionText_69;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-JobWizardToolbarButtonSet-Versions-ViewSideBySide>div[role='menuitem']", AI = false)
	public WebElement btnViewSideBySideVersions;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-LocationQuestionsCardTab", AI = false)
	public WebElement btnQuestions;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationsEdit_LV-0-Loc']", AI = false)
	public WebElement inpLoc;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-JobGroupItem>div[role='menuitem']", AI = false)
	public WebElement btnSG00123362603667786193;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-BillingInfo>div[role='menuitem']", AI = false)
	public WebElement btnPayment;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Change-WizardMenuActions_ChangeEffDate>div[role='menuitem']", AI = false)
	public WebElement btnEffectiveDate;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-QuestionSetsDV-2-QuestionSetLV-1-questionText']", AI = false)
	public WebElement inpQuestionText_41;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-QuestionSetsDV-1-QuestionSetLV-6-questionText']", AI = false)
	public WebElement inpQuestionText_32;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-ViewQuote>div[role='menuitem']", AI = false)
	public WebElement btnQuote_77;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-QuestionSetsDV-1-QuestionSetLV-7-questionText']", AI = false)
	public WebElement inpQuestionText_34;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-QuestionSetsDV-1-QuestionSetLV-8-questionText']", AI = false)
	public WebElement inpQuestionText_35;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-QuestionSetsDV-1-QuestionSetLV-9-questionText']", AI = false)
	public WebElement inpQuestionText_37;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-TargetedAddressInputSet-globalAddressContainer-GlobalAddressInputSet-PostalCode']", AI = false)
	public WebElement inpZIPCode;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-QuestionSetsDV-2-QuestionSetLV-0-questionText']", AI = false)
	public WebElement inpQuestionText_39;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-OOSEPanelSet-NextSliceLink", AI = false)
	public WebElement btnNextBlockedDate;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-2-item>div[role='menuitem']", AI = false)
	public WebElement btn90daydiary;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-JobWizardToolbarButtonSet-BindOptions>div[role='button']", AI = false)
	public WebElement btnBindOptions;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-BOPBuildings>div[role='menuitem']", AI = false)
	public WebElement btnBuildings;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-TargetedAddressInputSet-globalAddressContainer-GlobalAddressInputSet-Country']", AI = false)
	public WebElement drpCountry;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-TargetedAddressInputSet-globalAddressContainer-GlobalAddressInputSet-State']", AI = false)
	public WebElement drpState;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-QuestionSetsDV-2-QuestionSetLV-6-questionText']", AI = false)
	public WebElement inpQuestionText_51;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-QuestionSetsDV-2-QuestionSetLV-7-questionText']", AI = false)
	public WebElement inpQuestionText_53;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Archiving-WizardMenuActions_SuspendResumeArchiving>div[role='menuitem']", AI = false)
	public WebElement btnEnableDisable;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-JobWizardToolbarButtonSet-BindOptions-BindAndIssue>div[role='menuitem']", AI = false)
	public WebElement btnIssuePolicy;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-QuestionSetsDV-2-QuestionSetLV-2-questionText']", AI = false)
	public WebElement inpQuestionText_43;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-QuestionSetsDV-2-QuestionSetLV-3-questionText']", AI = false)
	public WebElement inpQuestionText_45;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-QuestionSetsDV-2-QuestionSetLV-4-questionText']", AI = false)
	public WebElement inpQuestionText_47;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-QuestionSetsDV-2-QuestionSetLV-5-questionText']", AI = false)
	public WebElement inpQuestionText_49;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-LocationDetailDV-LineLocationDetailInputSet-FireProtectionClass']", AI = false)
	public WebElement drpPublicProtection;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-MultiQuoteAcceleratedMenuActions-PolicyPeriodSelector", AI = false)
	public WebElement btnPolicyPeriodSelector;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-1-NewActivityMenuItemSet_Category>div[role='menuitem']", AI = false)
	public WebElement btnNewmail;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-7-item>div[role='menuitem']", AI = false)
	public WebElement btnGetMotorVehicleReports;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationsEdit_LV-0-NonSpecificLocation']", AI = false)
	public WebElement chkNonSpecific;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-PreQualification>div[role='menuitem']", AI = false)
	public WebElement btnQualification;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationsEdit_LV-0-LocationName']", AI = false)
	public WebElement inpLocationName;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-QuestionSetsDV-2-QuestionSetLV-7-QuestionModalInput-StringFieldInput_NoPost']", AI = false)
	public WebElement inpStringFieldInput_NoPost_54;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Participants>div[role='menuitem']", AI = false)
	public WebElement btnParticipants;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-0-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnBOP0012415250;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-4-NewActivityMenuItemSet_Category-0-item>div[role='menuitem']", AI = false)
	public WebElement btnReviewandapprove;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-OOSEPanelSet-OOSEPeriodSelector-OOSEPeriodSelector_Arg']", AI = false)
	public WebElement drpEffectiveDate;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-QuestionSetsDV-0-QuestionSetLV-1-questionText']", AI = false)
	public WebElement inpQuestionText_11;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-QuestionSetsDV-0-QuestionSetLV-2-questionText']", AI = false)
	public WebElement inpQuestionText_13;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-QuestionSetsDV-0-QuestionSetLV-3-questionText']", AI = false)
	public WebElement inpQuestionText_15;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewDocument>div[role='menuitem']", AI = false)
	public WebElement btnNewDocument;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-QuestionSetsDV-0-QuestionSetLV-4-questionText']", AI = false)
	public WebElement inpQuestionText_17;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-QuestionSetsDV-0-QuestionSetLV-0-questionText']", AI = false)
	public WebElement inpQuestionText;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewDocument-NewJobDocumentMenuItemSet-PolicyPeriodNewDocumentMenuItemSet_Linked>div[role='menuitem']", AI = false)
	public WebElement btnUploaddocuments;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-QuestionSetsDV-0-QuestionSetLV-5-questionText']", AI = false)
	public WebElement inpQuestionText_19;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-PolicyVersions>div[role='menuitem']", AI = false)
	public WebElement btnPolicyVersions_79;

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

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-QuestionSetsDV-1-QuestionSetLV-5-questionText']", AI = false)
	public WebElement inpQuestionText_30;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-QuestionSetsDV-1-QuestionSetLV-0-questionText']", AI = false)
	public WebElement inpQuestionText_21;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-QuestionSetsDV-1-QuestionSetLV-1-questionText']", AI = false)
	public WebElement inpQuestionText_22;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-BOPSupplemental>div[role='menuitem']", AI = false)
	public WebElement btnSupplemental;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-QuestionSetsDV-0-QuestionSetLV-0-QuestionModalInput-StringFieldInput_NoPost']", AI = false)
	public WebElement inpStringFieldInput_NoPost;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-QuestionSetsDV-1-QuestionSetLV-2-questionText']", AI = false)
	public WebElement inpQuestionText_24;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-QuestionSetsDV-1-QuestionSetLV-3-questionText']", AI = false)
	public WebElement inpQuestionText_26;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-QuestionSetsDV-1-QuestionSetLV-4-questionText']", AI = false)
	public WebElement inpQuestionText_28;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-LocationName']", AI = false)
	public WebElement inpLocationName_3;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-PolicyReview>div[role='menuitem']", AI = false)
	public WebElement btnPolicyReview;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-OOSEPanelSet-OOSEPeriodSelector", AI = false)
	public WebElement btnOOSEPeriodSelector;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-11-item>div[role='menuitem']", AI = false)
	public WebElement btnManuallyrateandquotepolicy;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-History>div[role='menuitem']", AI = false)
	public WebElement btnHistory;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-QuestionSetsDV-1-QuestionSetLV-8-QuestionModalInput-StringFieldInput_NoPost']", AI = false)
	public WebElement inpStringFieldInput_NoPost_36;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Change>div[role='menuitem']", AI = false)
	public WebElement btnEdit;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-JobWizardToolbarButtonSet-CloseOptions-WithdrawJob>div[role='menuitem']", AI = false)
	public WebElement btnWithdrawTransaction;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-QuestionSetsDV-1-QuestionSetLV-6-QuestionModalInput-StringFieldInput_NoPost']", AI = false)
	public WebElement inpStringFieldInput_NoPost_33;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-PolicyInfo>div[role='menuitem']", AI = false)
	public WebElement btnPolicyInfo;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-JobWizardToolbarButtonSet-Versions>div[role='button']", AI = false)
	public WebElement btnVersions;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-Modifiers>div[role='menuitem']", AI = false)
	public WebElement btnModifiers;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_ToAccountFile>div[role='menuitem']", AI = false)
	public WebElement btnAccountFile;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-UnsyncedAddressInputSet-unsyncedAddressString']", AI = false)
	public WebElement inpAddress_6;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP_tb-Remove>div[role='button']", AI = false)
	public WebElement btnRemove;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Change-WizardMenuActions_CopyPolicyData>div[role='menuitem']", AI = false)
	public WebElement btnCopyData;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-QuestionSetsDV-1-QuestionSetLV-1-QuestionModalInput-StringFieldInput_NoPost']", AI = false)
	public WebElement inpStringFieldInput_NoPost_23;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-QuoteRequestedAlert-CloseBtn", AI = false)
	public WebElement btnClose;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-14-item>div[role='menuitem']", AI = false)
	public WebElement btnReview60dayUWPeriod;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-QuestionSetsDV-0-QuestionSetLV-5-QuestionModalInput-StringFieldInput_NoPost']", AI = false)
	public WebElement inpStringFieldInput_NoPost_20;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-JobWizardToolbarButtonSet-EditPolicy>div[role='button']", AI = false)
	public WebElement btnEditPolicyTransaction;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity>div[role='menuitem']", AI = false)
	public WebElement btnNewActivity;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP_tb-addAllLocationsButton>div[role='button']", AI = false)
	public WebElement btnAddAllExisting;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Cancel>div[role='button']", AI = false)
	public WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup>div[role='menuitem']", AI = false)
	public WebElement btnPolicyContract;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-QuestionSetsDV-1-QuestionSetLV-7-QuestionModalInput-ChoiceSelectInput_NoPost']", AI = false)
	public WebElement drpChoiceSelectInput_NoPost;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-Phone-GlobalPhoneInputSet-PhoneDisplay']", AI = false)
	public WebElement inpPhone_9;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category>div[role='menuitem']", AI = false)
	public WebElement btnRequest;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-NonSpecificLocation']", AI = false)
	public WebElement rdbNonSpecificLocation;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-TerritoryCodeInputSet-0-TerritoryCode']", AI = false)
	public WebElement inpTerritoryCode;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-QuestionSetsDV-4-QuestionSetLV-0-QuestionModalInput-BooleanRadioInput_NoPost']", AI = false)
	public WebElement rdbBooleanRadioInput_NoPost_76;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-9-item>div[role='menuitem']", AI = false)
	public WebElement btnGetRiskInformationProducer;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-QuestionSetsDV-3-QuestionSetLV-7-QuestionModalInput-BooleanRadioInput_NoPost']", AI = false)
	public WebElement rdbBooleanRadioInput_NoPost_72;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-QuestionSetsDV-3-QuestionSetLV-8-QuestionModalInput-BooleanRadioInput_NoPost']", AI = false)
	public WebElement rdbBooleanRadioInput_NoPost_74;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP_tb-addLocationButton>div[role='button']", AI = false)
	public WebElement btnAddExistingLocation;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-1-item>div[role='menuitem']", AI = false)
	public WebElement btnGetAuditInternalPersonnel;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-MultiQuoteAcceleratedMenuActions-PolicyPeriodSelector-PolicyPeriodSelector_Arg']", AI = false)
	public WebElement drpPolicyPeriodSelector_Arg;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-TargetedAddressInputSet-globalAddressContainer-GlobalAddressInputSet-PostalCode-AutoFillIcon", AI = false)
	public WebElement btnAutoFillIcon_5;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-DiagWorksheetItem-ShowDiagWorksheet>div[role='menuitem']", AI = false)
	public WebElement btnShowPartialWorksheet;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationsEdit_LV-0-InSync']", AI = false)
	public WebElement rdbUpToDate;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-1-item>div[role='menuitem']", AI = false)
	public WebElement btn60daydiary;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-TargetedAddressInputSet-globalAddressContainer-GlobalAddressInputSet-County']", AI = false)
	public WebElement inpCounty;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Prev>div[role='button']", AI = false)
	public WebElement btnBack;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-UnsyncedAddressInputSet-UnsyncedCountry']", AI = false)
	public WebElement drpCountry_8;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationsEdit_LV-0-LocationCode']", AI = false)
	public WebElement inpLocationCode;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-Locations>div[role='menuitem']", AI = false)
	public WebElement btnLocations;

	@IFindBy(how = How.CSS, using = "div[id$='Next']", AI = false)
	public WebElement btnNext;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-TargetedAddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressSummary']", AI = false)
	public WebElement inpAddress_4;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-10-item>div[role='menuitem']", AI = false)
	public WebElement btnQuoteRequired;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-AdditionalCoveragesCardTab", AI = false)
	public WebElement btnAdditionalCoverages;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-JobWizardToolbarButtonSet-Draft>div[role='button']", AI = false)
	public WebElement btnSaveDraft;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-3-item>div[role='menuitem']", AI = false)
	public WebElement btnGetBureauData;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Reinsurance>div[role='menuitem']", AI = false)
	public WebElement btnReinsurance;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-QuestionSetsDV-2-QuestionSetLV-8-QuestionModalInput-BooleanRadioInput_NoPost']", AI = false)
	public WebElement rdbBooleanRadioInput_NoPost_56;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-QuoteRequestedAlert .gw-AlertBar--label", AI = false)
	public WebElement lblQuoteRequestedAlert;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP_tb-Add>div[role='button']", AI = false)
	public WebElement btnNewLocation;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-QuestionSetsDV-2-QuestionSetLV-5-QuestionModalInput-BooleanRadioInput_NoPost']", AI = false)
	public WebElement rdbBooleanRadioInput_NoPost_50;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-QuestionSetsDV-2-QuestionSetLV-6-QuestionModalInput-BooleanRadioInput_NoPost']", AI = false)
	public WebElement rdbBooleanRadioInput_NoPost_52;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP_tb-setToPrimary>div[role='button']", AI = false)
	public WebElement btnSetAsPrimary;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-TargetedAddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine3']", AI = false)
	public WebElement inpAddress3;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-TargetedAddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine1']", AI = false)
	public WebElement inpAddress1;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-QuestionSetsDV-1-QuestionSetLV-0-QuestionModalInput-BooleanRadioInput_NoPost']", AI = false)
	public WebElement rdbBooleanRadioInput_NoPost;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-TargetedAddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine2']", AI = false)
	public WebElement inpAddress2;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-QuestionSetsDV-3-QuestionSetLV-0-QuestionModalInput-BooleanRadioInput_NoPost']", AI = false)
	public WebElement rdbBooleanRadioInput_NoPost_58;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewDocument-NewJobDocumentMenuItemSet-PolicyPeriodNewDocumentMenuItemSet_Template>div[role='menuitem']", AI = false)
	public WebElement btnCreatefromatemplate;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-JobWizardToolbarButtonSet-Versions-SideBySide>div[role='menuitem']", AI = false)
	public WebElement btnStartSidebySide;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationsEdit_LV-0-Address']", AI = false)
	public WebElement inpAddress;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Archiving>div[role='menuitem']", AI = false)
	public WebElement btnArchiving;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-TargetedAddressInputSet-globalAddressContainer-GlobalAddressInputSet-City-AutoFillIcon", AI = false)
	public WebElement btnAutoFillIcon;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-JobWizardToolbarButtonSet-CloseOptions-NotTakenJob>div[role='menuitem']", AI = false)
	public WebElement btnNotTaken;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Documents>div[role='menuitem']", AI = false)
	public WebElement btnDocuments;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationsEdit_LV-0-PreferredCoverageCurrency']", AI = false)
	public WebElement drpCoveragesin;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-QuestionSetsDV-3-QuestionSetLV-3-QuestionModalInput-BooleanRadioInput_NoPost']", AI = false)
	public WebElement rdbBooleanRadioInput_NoPost_64;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-QuestionSetsDV-3-QuestionSetLV-4-QuestionModalInput-BooleanRadioInput_NoPost']", AI = false)
	public WebElement rdbBooleanRadioInput_NoPost_66;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-QuestionSetsDV-3-QuestionSetLV-1-QuestionModalInput-BooleanRadioInput_NoPost']", AI = false)
	public WebElement rdbBooleanRadioInput_NoPost_60;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-QuestionSetsDV-3-QuestionSetLV-2-QuestionModalInput-BooleanRadioInput_NoPost']", AI = false)
	public WebElement rdbBooleanRadioInput_NoPost_62;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-JobWizardToolbarButtonSet-QuoteTypeToolbarButtonSet-Quote>div[role='button']", AI = false)
	public WebElement btnQuote;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-QuestionSetsDV-3-QuestionSetLV-5-QuestionModalInput-BooleanRadioInput_NoPost']", AI = false)
	public WebElement rdbBooleanRadioInput_NoPost_68;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-JobWizardToolbarButtonSet-Unlock>div[role='button']", AI = false)
	public WebElement btnReleaseLock;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-TerritoryCodeInputSet-AutofillLink", AI = false)
	public WebElement btnAutofillTerritoryCodes;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-0-item>div[role='menuitem']", AI = false)
	public WebElement btnCreateNewProducer;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-UnsyncedAddressInputSet-UnsyncedCounty']", AI = false)
	public WebElement inpCounty_7;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Forms>div[role='menuitem']", AI = false)
	public WebElement btnForms;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-QuestionSetsDV-3-QuestionSetLV-6-QuestionModalInput-BooleanRadioInput_NoPost']", AI = false)
	public WebElement rdbBooleanRadioInput_NoPost_70;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Notes>div[role='menuitem']", AI = false)
	public WebElement btnNotes;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-QuestionSetsDV-1-QuestionSetLV-5-QuestionModalInput-BooleanRadioInput_NoPost']", AI = false)
	public WebElement rdbBooleanRadioInput_NoPost_31;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-RiskEvaluation>div[role='menuitem']", AI = false)
	public WebElement btnRiskAnalysis_80;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-5-item>div[role='menuitem']", AI = false)
	public WebElement btnGetInspectionLossControl;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create>div[role='menuitem']", AI = false)
	public WebElement btnCreate;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-TaxLocation']", AI = false)
	public WebElement inpTaxLocation;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-QuestionSetsDV-1-QuestionSetLV-9-QuestionModalInput-BooleanRadioInput_NoPost']", AI = false)
	public WebElement rdbBooleanRadioInput_NoPost_38;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-10-item>div[role='menuitem']", AI = false)
	public WebElement btnLegalreview;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-7-item>div[role='menuitem']", AI = false)
	public WebElement btnPolicynotification;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-PreferredCoverageCurrencySelectorRef-PreferredCoverageCurrencyPanelSet-PreferredCoverageCurrencySelectorDropDown']", AI = false)
	public WebElement drpCoveragesin_1;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-TargetedAddressInputSet-globalAddressContainer-GlobalAddressInputSet-City']", AI = false)
	public WebElement inpCity;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto>div[role='menuitem']", AI = false)
	public WebElement btnGoto;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-4-NewActivityMenuItemSet_Category>div[role='menuitem']", AI = false)
	public WebElement btnUnderwriterReview;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-QuestionSetsDV-2-QuestionSetLV-1-QuestionModalInput-BooleanRadioInput_NoPost']", AI = false)
	public WebElement rdbBooleanRadioInput_NoPost_42;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-0-item>div[role='menuitem']", AI = false)
	public WebElement btn30daydiary;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-LocationCode']", AI = false)
	public WebElement inpLocationCode_2;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-QuestionSetsDV-2-QuestionSetLV-2-QuestionModalInput-BooleanRadioInput_NoPost']", AI = false)
	public WebElement rdbBooleanRadioInput_NoPost_44;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-TaxLocation-SelectTaxLocation", AI = false)
	public WebElement btnSearch;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-SideBySide>div[role='menuitem']", AI = false)
	public WebElement btnSidebySideQuoting;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-QuestionSetsDV-2-QuestionSetLV-0-QuestionModalInput-BooleanRadioInput_NoPost']", AI = false)
	public WebElement rdbBooleanRadioInput_NoPost_40;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-QuestionSetsDV-2-QuestionSetLV-3-QuestionModalInput-BooleanRadioInput_NoPost']", AI = false)
	public WebElement rdbBooleanRadioInput_NoPost_46;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-CollectCreditCard>div[role='menuitem']", AI = false)
	public WebElement btnCollectCreditCard;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-QuestionSetsDV-2-QuestionSetLV-4-QuestionModalInput-BooleanRadioInput_NoPost']", AI = false)
	public WebElement rdbBooleanRadioInput_NoPost_48;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-Phone-GlobalPhoneInputSet-CountryCode']", AI = false)
	public WebElement drpPhoneRegionCode;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-ViewMultiLineQuote>div[role='menuitem']", AI = false)
	public WebElement btnQuote_78;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-GeneralInfoCardTab", AI = false)
	public WebElement btnDetails;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-11-item>div[role='menuitem']", AI = false)
	public WebElement btnRatiooutofrange;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-JobWizardToolbarButtonSet-ConvertToFullApp>div[role='button']", AI = false)
	public WebElement btnFullApp;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-1-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnGL0012336260;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-TerritoryCodeInputSet-0-TerritoryCode-SelectTerritoryCode", AI = false)
	public WebElement btnSearch_10;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-DiagWorksheetItem>div[role='menuitem']", AI = false)
	public WebElement btnDiagnosticData;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-Phone-GlobalPhoneInputSet-NationalSubscriberNumber']", AI = false)
	public WebElement inpPhone;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category>div[role='menuitem']", AI = false)
	public WebElement btnReminder;

	@IFindBy(how = How.CSS, using = "div[id$='LocationsScreen-ttlBar']", AI = false)
	public WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-AccountLocationUpToDateDV-SynchronizedLink", AI = false)
	public WebElement btnViewCurrentLocation;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-BOP>div[role='menuitem']", AI = false)
	public WebElement btnBusinessownersLine;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-1-NewActivityMenuItemSet_Category-0-item>div[role='menuitem']", AI = false)
	public WebElement btnReviewnewmail;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup>div[role='menuitem']", AI = false)
	public WebElement btnGroup;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-3-item>div[role='menuitem']", AI = false)
	public WebElement btnCancelasplitpolicy;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-2-item>div[role='menuitem']", AI = false)
	public WebElement btnGetAuditOutsideService;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-LocationDetailDV-LineLocationDetailInputSet-PrincipleOps textarea", AI = false)
	public WebElement inpPrincipalOperationsOccupancy;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-5-item>div[role='menuitem']", AI = false)
	public WebElement btnNewAuditAssignment;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-16-item>div[role='menuitem']", AI = false)
	public WebElement btnRewritetoNewAccount;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-12-item>div[role='menuitem']", AI = false)
	public WebElement btnReview30dayUWPeriod;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-ManageBranches>div[role='menuitem']", AI = false)
	public WebElement btnPolicyVersions;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-QuestionSetsDV-1-QuestionSetLV-4-QuestionModalInput-BooleanRadioInput_NoPost']", AI = false)
	public WebElement rdbBooleanRadioInput_NoPost_29;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP_tb-addLocationButton-0-UnassignedAccountLocation>div[role='menuitem']", AI = false)
	public WebElement btnUnassignedAccountLocation;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-QuestionSetsDV-1-QuestionSetLV-2-QuestionModalInput-BooleanRadioInput_NoPost']", AI = false)
	public WebElement rdbBooleanRadioInput_NoPost_25;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-LocationDetailCV-QuestionSetsDV-1-QuestionSetLV-3-QuestionModalInput-BooleanRadioInput_NoPost']", AI = false)
	public WebElement rdbBooleanRadioInput_NoPost_27;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-JobWizardToolbarButtonSet-CloseOptions>div[role='button']", AI = false)
	public WebElement btnCloseOptions;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_ToPolicyFile>div[role='menuitem']", AI = false)
	public WebElement btnPolicyFile;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-17-item>div[role='menuitem']", AI = false)
	public WebElement btnVerifycoverage;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-4-item>div[role='menuitem']", AI = false)
	public WebElement btnGetCreditReports;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-BOPLocationsPanelSet-LocationsEdit_DP-PreferredCoverageCurrencySelectorRef-PreferredCoverageCurrencyPanelSet-CoverageCurrencyDisplay']", AI = false)
	public WebElement inpCoveragesin;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPLocationsScreen-JobWizardToolbarButtonSet-CloseOptions-Decline>div[role='menuitem']", AI = false)
	public WebElement btnDecline;

	@IFindBy(how = How.CSS, using = "div[id=$'SubmissionWizard-WizardMenuActions']>div[role='button']", AI = false)
	public WebElement btnWizardMenuActions;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardActionsMenuItemSet-SubmissionInfo>div[role='menuitem']", AI = false)
	public WebElement btnSubManager;

	public LocationsPage(){
	}

	public LocationsPage(WebDriver driver) {
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
	}public LocationsPage enterStringFieldInput_NoPost_12(WebDriver driver,String StringFieldInput_NoPost_12) {
		BrowserActions.type(driver, inpStringFieldInput_NoPost_12,StringFieldInput_NoPost_12, "StringFieldInput_NoPost_12");
		return this;
	}
	public LocationsPage clickWorkplan(WebDriver driver)  {
		BrowserActions.click(driver, btnWorkplan,"Workplan");
		return this;
	}
	public LocationsPage enterStringFieldInput_NoPost_14(WebDriver driver,String StringFieldInput_NoPost_14) {
		BrowserActions.type(driver, inpStringFieldInput_NoPost_14,StringFieldInput_NoPost_14, "StringFieldInput_NoPost_14");
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
	public LocationsPage enterQuestionText_61(WebDriver driver,String QuestionText_61) {
		BrowserActions.type(driver, inpQuestionText_61,QuestionText_61, "QuestionText_61");
		return this;
	}
	public LocationsPage clickReview45dayUWPeriod(WebDriver driver)  {
		BrowserActions.click(driver, btnReview45dayUWPeriod,"Review45dayUWPeriod");
		return this;
	}
	public LocationsPage enterQuestionText_63(WebDriver driver,String QuestionText_63) {
		BrowserActions.type(driver, inpQuestionText_63,QuestionText_63, "QuestionText_63");
		return this;
	}
	public LocationsPage enterQuestionText_55(WebDriver driver,String QuestionText_55) {
		BrowserActions.type(driver, inpQuestionText_55,QuestionText_55, "QuestionText_55");
		return this;
	}
	public LocationsPage enterQuestionText_57(WebDriver driver,String QuestionText_57) {
		BrowserActions.type(driver, inpQuestionText_57,QuestionText_57, "QuestionText_57");
		return this;
	}
	public LocationsPage enterQuestionText_59(WebDriver driver,String QuestionText_59) {
		BrowserActions.type(driver, inpQuestionText_59,QuestionText_59, "QuestionText_59");
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
	public LocationsPage enterStringFieldInput_NoPost_16(WebDriver driver,String StringFieldInput_NoPost_16) {
		BrowserActions.type(driver, inpStringFieldInput_NoPost_16,StringFieldInput_NoPost_16, "StringFieldInput_NoPost_16");
		return this;
	}
	public LocationsPage clickPerformanceReview(WebDriver driver)  {
		BrowserActions.click(driver, btnPerformanceReview,"PerformanceReview");
		return this;
	}
	public LocationsPage enterStringFieldInput_NoPost_18(WebDriver driver,String StringFieldInput_NoPost_18) {
		BrowserActions.type(driver, inpStringFieldInput_NoPost_18,StringFieldInput_NoPost_18, "StringFieldInput_NoPost_18");
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
	public LocationsPage enterQuestionText_71(WebDriver driver,String QuestionText_71) {
		BrowserActions.type(driver, inpQuestionText_71,QuestionText_71, "QuestionText_71");
		return this;
	}
	public LocationsPage enterQuestionText_73(WebDriver driver,String QuestionText_73) {
		BrowserActions.type(driver, inpQuestionText_73,QuestionText_73, "QuestionText_73");
		return this;
	}
	public LocationsPage enterQuestionText_75(WebDriver driver,String QuestionText_75) {
		BrowserActions.type(driver, inpQuestionText_75,QuestionText_75, "QuestionText_75");
		return this;
	}
	public LocationsPage enterQuestionText_65(WebDriver driver,String QuestionText_65) {
		BrowserActions.type(driver, inpQuestionText_65,QuestionText_65, "QuestionText_65");
		return this;
	}
	public LocationsPage clickPolicyReviewMidterm(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyReviewMidterm,"PolicyReviewMidterm");
		return this;
	}
	public LocationsPage enterQuestionText_67(WebDriver driver,String QuestionText_67) {
		BrowserActions.type(driver, inpQuestionText_67,QuestionText_67, "QuestionText_67");
		return this;
	}
	public LocationsPage enterQuestionText_69(WebDriver driver,String QuestionText_69) {
		BrowserActions.type(driver, inpQuestionText_69,QuestionText_69, "QuestionText_69");
		return this;
	}
	public LocationsPage clickViewSideBySideVersions(WebDriver driver)  {
		BrowserActions.click(driver, btnViewSideBySideVersions,"ViewSideBySideVersions");
		return this;
	}
	public LocationsPage clickQuestions(WebDriver driver)  {
		BrowserActions.click(driver, btnQuestions,"Questions");
		return this;
	}
	public LocationsPage enterLoc(WebDriver driver,String Loc) {
		BrowserActions.type(driver, inpLoc,Loc, "Loc");
		return this;
	}
	public LocationsPage clickSG00123362603667786193(WebDriver driver)  {
		BrowserActions.click(driver, btnSG00123362603667786193,"SG00123362603667786193");
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
	public LocationsPage enterQuestionText_41(WebDriver driver,String QuestionText_41) {
		BrowserActions.type(driver, inpQuestionText_41,QuestionText_41, "QuestionText_41");
		return this;
	}
	public LocationsPage enterQuestionText_32(WebDriver driver,String QuestionText_32) {
		BrowserActions.type(driver, inpQuestionText_32,QuestionText_32, "QuestionText_32");
		return this;
	}
	public LocationsPage clickQuote_77(WebDriver driver)  {
		BrowserActions.click(driver, btnQuote_77,"Quote_77");
		return this;
	}
	public LocationsPage enterQuestionText_34(WebDriver driver,String QuestionText_34) {
		BrowserActions.type(driver, inpQuestionText_34,QuestionText_34, "QuestionText_34");
		return this;
	}
	public LocationsPage enterQuestionText_35(WebDriver driver,String QuestionText_35) {
		BrowserActions.type(driver, inpQuestionText_35,QuestionText_35, "QuestionText_35");
		return this;
	}
	public LocationsPage enterQuestionText_37(WebDriver driver,String QuestionText_37) {
		BrowserActions.type(driver, inpQuestionText_37,QuestionText_37, "QuestionText_37");
		return this;
	}
	public LocationsPage enterZIPCode(WebDriver driver,String ZIPCode) {
		BrowserActions.type(driver, inpZIPCode,ZIPCode, "ZIPCode");
		return this;
	}
	public LocationsPage enterQuestionText_39(WebDriver driver,String QuestionText_39) {
		BrowserActions.type(driver, inpQuestionText_39,QuestionText_39, "QuestionText_39");
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
	public LocationsPage clickBindOptions(WebDriver driver)  {
		BrowserActions.click(driver, btnBindOptions,"BindOptions");
		return this;
	}
	public LocationsPage clickBuildings(WebDriver driver)  {
		BrowserActions.click(driver, btnBuildings,"Buildings");
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
	public LocationsPage enterQuestionText_51(WebDriver driver,String QuestionText_51) {
		BrowserActions.type(driver, inpQuestionText_51,QuestionText_51, "QuestionText_51");
		return this;
	}
	public LocationsPage enterQuestionText_53(WebDriver driver,String QuestionText_53) {
		BrowserActions.type(driver, inpQuestionText_53,QuestionText_53, "QuestionText_53");
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
	public LocationsPage enterQuestionText_43(WebDriver driver,String QuestionText_43) {
		BrowserActions.type(driver, inpQuestionText_43,QuestionText_43, "QuestionText_43");
		return this;
	}
	public LocationsPage enterQuestionText_45(WebDriver driver,String QuestionText_45) {
		BrowserActions.type(driver, inpQuestionText_45,QuestionText_45, "QuestionText_45");
		return this;
	}
	public LocationsPage enterQuestionText_47(WebDriver driver,String QuestionText_47) {
		BrowserActions.type(driver, inpQuestionText_47,QuestionText_47, "QuestionText_47");
		return this;
	}
	public LocationsPage enterQuestionText_49(WebDriver driver,String QuestionText_49) {
		BrowserActions.type(driver, inpQuestionText_49,QuestionText_49, "QuestionText_49");
		return this;
	}
	public LocationsPage selectPublicProtection(WebDriver driver,String PublicProtection)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPublicProtection,PublicProtection,"PublicProtection");
		return this;
	}
	public LocationsPage clickPolicyPeriodSelector(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyPeriodSelector,"PolicyPeriodSelector");
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
	public LocationsPage clickNonSpecific(WebDriver driver)  {
		BrowserActions.click(driver, chkNonSpecific,"NonSpecific");
		return this;
	}
	public LocationsPage clickQualification(WebDriver driver)  {
		BrowserActions.click(driver, btnQualification,"Qualification");
		return this;
	}
	public LocationsPage enterLocationName(WebDriver driver,String LocationName) {
		BrowserActions.type(driver, inpLocationName,LocationName, "LocationName");
		return this;
	}
	public LocationsPage enterStringFieldInput_NoPost_54(WebDriver driver,String StringFieldInput_NoPost_54) {
		BrowserActions.type(driver, inpStringFieldInput_NoPost_54,StringFieldInput_NoPost_54, "StringFieldInput_NoPost_54");
		return this;
	}
	public LocationsPage clickParticipants(WebDriver driver)  {
		BrowserActions.click(driver, btnParticipants,"Participants");
		return this;
	}
	public LocationsPage clickBOP0012415250(WebDriver driver)  {
		BrowserActions.click(driver, btnBOP0012415250,"BOP0012415250");
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
	public LocationsPage enterQuestionText_11(WebDriver driver,String QuestionText_11) {
		BrowserActions.type(driver, inpQuestionText_11,QuestionText_11, "QuestionText_11");
		return this;
	}
	public LocationsPage enterQuestionText_13(WebDriver driver,String QuestionText_13) {
		BrowserActions.type(driver, inpQuestionText_13,QuestionText_13, "QuestionText_13");
		return this;
	}
	public LocationsPage enterQuestionText_15(WebDriver driver,String QuestionText_15) {
		BrowserActions.type(driver, inpQuestionText_15,QuestionText_15, "QuestionText_15");
		return this;
	}
	public LocationsPage clickNewDocument(WebDriver driver)  {
		BrowserActions.click(driver, btnNewDocument,"NewDocument");
		return this;
	}
	public LocationsPage enterQuestionText_17(WebDriver driver,String QuestionText_17) {
		BrowserActions.type(driver, inpQuestionText_17,QuestionText_17, "QuestionText_17");
		return this;
	}
	public LocationsPage enterQuestionText(WebDriver driver,String QuestionText) {
		BrowserActions.type(driver, inpQuestionText,QuestionText, "QuestionText");
		return this;
	}
	public LocationsPage clickUploaddocuments(WebDriver driver)  {
		BrowserActions.click(driver, btnUploaddocuments,"Uploaddocuments");
		return this;
	}
	public LocationsPage enterQuestionText_19(WebDriver driver,String QuestionText_19) {
		BrowserActions.type(driver, inpQuestionText_19,QuestionText_19, "QuestionText_19");
		return this;
	}
	public LocationsPage clickPolicyVersions_79(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyVersions_79,"PolicyVersions_79");
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
	public LocationsPage enterQuestionText_30(WebDriver driver,String QuestionText_30) {
		BrowserActions.type(driver, inpQuestionText_30,QuestionText_30, "QuestionText_30");
		return this;
	}
	public LocationsPage enterQuestionText_21(WebDriver driver,String QuestionText_21) {
		BrowserActions.type(driver, inpQuestionText_21,QuestionText_21, "QuestionText_21");
		return this;
	}
	public LocationsPage enterQuestionText_22(WebDriver driver,String QuestionText_22) {
		BrowserActions.type(driver, inpQuestionText_22,QuestionText_22, "QuestionText_22");
		return this;
	}
	public LocationsPage clickSupplemental(WebDriver driver)  {
		BrowserActions.click(driver, btnSupplemental,"Supplemental");
		return this;
	}
	public LocationsPage enterStringFieldInput_NoPost(WebDriver driver,String StringFieldInput_NoPost) {
		BrowserActions.type(driver, inpStringFieldInput_NoPost,StringFieldInput_NoPost, "StringFieldInput_NoPost");
		return this;
	}
	public LocationsPage enterQuestionText_24(WebDriver driver,String QuestionText_24) {
		BrowserActions.type(driver, inpQuestionText_24,QuestionText_24, "QuestionText_24");
		return this;
	}
	public LocationsPage enterQuestionText_26(WebDriver driver,String QuestionText_26) {
		BrowserActions.type(driver, inpQuestionText_26,QuestionText_26, "QuestionText_26");
		return this;
	}
	public LocationsPage enterQuestionText_28(WebDriver driver,String QuestionText_28) {
		BrowserActions.type(driver, inpQuestionText_28,QuestionText_28, "QuestionText_28");
		return this;
	}
	public LocationsPage enterLocationName_3(WebDriver driver,String LocationName_3) {
		BrowserActions.type(driver, inpLocationName_3,LocationName_3, "LocationName_3");
		return this;
	}
	public LocationsPage clickPolicyReview(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyReview,"PolicyReview");
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
	public LocationsPage enterStringFieldInput_NoPost_36(WebDriver driver,String StringFieldInput_NoPost_36) {
		BrowserActions.type(driver, inpStringFieldInput_NoPost_36,StringFieldInput_NoPost_36, "StringFieldInput_NoPost_36");
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
	public LocationsPage enterStringFieldInput_NoPost_33(WebDriver driver,String StringFieldInput_NoPost_33) {
		BrowserActions.type(driver, inpStringFieldInput_NoPost_33,StringFieldInput_NoPost_33, "StringFieldInput_NoPost_33");
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
	public LocationsPage clickModifiers(WebDriver driver)  {
		BrowserActions.click(driver, btnModifiers,"Modifiers");
		return this;
	}
	public LocationsPage clickAccountFile(WebDriver driver)  {
		BrowserActions.click(driver, btnAccountFile,"AccountFile");
		return this;
	}
	public LocationsPage enterAddress_6(WebDriver driver,String Address_6) {
		BrowserActions.type(driver, inpAddress_6,Address_6, "Address_6");
		return this;
	}
	public LocationsPage clickRemove(WebDriver driver)  {
		BrowserActions.click(driver, btnRemove,"Remove");
		return this;
	}
	public LocationsPage clickCopyData(WebDriver driver)  {
		BrowserActions.click(driver, btnCopyData,"CopyData");
		return this;
	}
	public LocationsPage enterStringFieldInput_NoPost_23(WebDriver driver,String StringFieldInput_NoPost_23) {
		BrowserActions.type(driver, inpStringFieldInput_NoPost_23,StringFieldInput_NoPost_23, "StringFieldInput_NoPost_23");
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
	public LocationsPage enterStringFieldInput_NoPost_20(WebDriver driver,String StringFieldInput_NoPost_20) {
		BrowserActions.type(driver, inpStringFieldInput_NoPost_20,StringFieldInput_NoPost_20, "StringFieldInput_NoPost_20");
		return this;
	}
	public LocationsPage clickEditPolicyTransaction(WebDriver driver)  {
		BrowserActions.click(driver, btnEditPolicyTransaction,"EditPolicyTransaction");
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
	public LocationsPage clickCancel(WebDriver driver)  {
		BrowserActions.click(driver, btnCancel,"Cancel");
		return this;
	}
	public LocationsPage clickPolicyContract(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyContract,"PolicyContract");
		return this;
	}
	public LocationsPage selectChoiceSelectInput_NoPost(WebDriver driver,String ChoiceSelectInput_NoPost)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpChoiceSelectInput_NoPost,ChoiceSelectInput_NoPost,"ChoiceSelectInput_NoPost");
		return this;
	}
	public LocationsPage enterPhone_9(WebDriver driver,String Phone_9) {
		BrowserActions.type(driver, inpPhone_9,Phone_9, "Phone_9");
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
	public LocationsPage enterTerritoryCode(WebDriver driver,String TerritoryCode) {
		BrowserActions.type(driver, inpTerritoryCode,TerritoryCode, "TerritoryCode");
		return this;
	}
	public LocationsPage clickBooleanRadioInput_NoPost_76(WebDriver driver)  {
		BrowserActions.click(driver, rdbBooleanRadioInput_NoPost_76,"BooleanRadioInput_NoPost_76");
		return this;
	}
	public LocationsPage clickGetRiskInformationProducer(WebDriver driver)  {
		BrowserActions.click(driver, btnGetRiskInformationProducer,"GetRiskInformationProducer");
		return this;
	}
	public LocationsPage clickBooleanRadioInput_NoPost_72(WebDriver driver)  {
		BrowserActions.click(driver, rdbBooleanRadioInput_NoPost_72,"BooleanRadioInput_NoPost_72");
		return this;
	}
	public LocationsPage clickBooleanRadioInput_NoPost_74(WebDriver driver)  {
		BrowserActions.click(driver, rdbBooleanRadioInput_NoPost_74,"BooleanRadioInput_NoPost_74");
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
	public LocationsPage selectPolicyPeriodSelector_Arg(WebDriver driver,String PolicyPeriodSelector_Arg)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPolicyPeriodSelector_Arg,PolicyPeriodSelector_Arg,"PolicyPeriodSelector_Arg");
		return this;
	}
	public LocationsPage clickAutoFillIcon_5(WebDriver driver)  {
		BrowserActions.click(driver, btnAutoFillIcon_5,"AutoFillIcon_5");
		return this;
	}
	public LocationsPage clickShowPartialWorksheet(WebDriver driver)  {
		BrowserActions.click(driver, btnShowPartialWorksheet,"ShowPartialWorksheet");
		return this;
	}
	public LocationsPage clickUpToDate(WebDriver driver)  {
		BrowserActions.click(driver, rdbUpToDate,"UpToDate");
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
	public LocationsPage selectCountry_8(WebDriver driver,String Country_8)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCountry_8,Country_8,"Country_8");
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
	public LocationsPage clickNext(WebDriver driver)  {
		BrowserActions.click(driver, btnNext,true,"Next");
		return this;
	}
	public LocationsPage enterAddress_4(WebDriver driver,String Address_4) {
		BrowserActions.type(driver, inpAddress_4,Address_4, "Address_4");
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
	public LocationsPage clickReinsurance(WebDriver driver)  {
		BrowserActions.click(driver, btnReinsurance,"Reinsurance");
		return this;
	}
	public LocationsPage clickBooleanRadioInput_NoPost_56(WebDriver driver)  {
		BrowserActions.click(driver, rdbBooleanRadioInput_NoPost_56,"BooleanRadioInput_NoPost_56");
		return this;
	}
	public LocationsPage clickNewLocation(WebDriver driver)  {
		BrowserActions.click(driver, btnNewLocation,"NewLocation");
		return this;
	}
	public LocationsPage clickBooleanRadioInput_NoPost_50(WebDriver driver)  {
		BrowserActions.click(driver, rdbBooleanRadioInput_NoPost_50,"BooleanRadioInput_NoPost_50");
		return this;
	}
	public LocationsPage clickBooleanRadioInput_NoPost_52(WebDriver driver)  {
		BrowserActions.click(driver, rdbBooleanRadioInput_NoPost_52,"BooleanRadioInput_NoPost_52");
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
	public LocationsPage clickBooleanRadioInput_NoPost(WebDriver driver)  {
		BrowserActions.click(driver, rdbBooleanRadioInput_NoPost,"BooleanRadioInput_NoPost");
		return this;
	}
	public LocationsPage enterAddress2(WebDriver driver,String Address2) {
		BrowserActions.type(driver, inpAddress2,Address2, "Address2");
		return this;
	}
	public LocationsPage clickBooleanRadioInput_NoPost_58(WebDriver driver)  {
		BrowserActions.click(driver, rdbBooleanRadioInput_NoPost_58,"BooleanRadioInput_NoPost_58");
		return this;
	}
	public LocationsPage clickCreatefromatemplate(WebDriver driver)  {
		BrowserActions.click(driver, btnCreatefromatemplate,"Createfromatemplate");
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
	public LocationsPage clickDocuments(WebDriver driver)  {
		BrowserActions.click(driver, btnDocuments,"Documents");
		return this;
	}
	public LocationsPage selectCoveragesin(WebDriver driver,String Coveragesin)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCoveragesin,Coveragesin,"Coveragesin");
		return this;
	}
	public LocationsPage clickBooleanRadioInput_NoPost_64(WebDriver driver)  {
		BrowserActions.click(driver, rdbBooleanRadioInput_NoPost_64,"BooleanRadioInput_NoPost_64");
		return this;
	}
	public LocationsPage clickBooleanRadioInput_NoPost_66(WebDriver driver)  {
		BrowserActions.click(driver, rdbBooleanRadioInput_NoPost_66,"BooleanRadioInput_NoPost_66");
		return this;
	}
	public LocationsPage clickBooleanRadioInput_NoPost_60(WebDriver driver)  {
		BrowserActions.click(driver, rdbBooleanRadioInput_NoPost_60,"BooleanRadioInput_NoPost_60");
		return this;
	}
	public LocationsPage clickBooleanRadioInput_NoPost_62(WebDriver driver)  {
		BrowserActions.click(driver, rdbBooleanRadioInput_NoPost_62,"BooleanRadioInput_NoPost_62");
		return this;
	}
	public LocationsPage clickQuote(WebDriver driver)  {
		BrowserActions.click(driver, btnQuote,"Quote");
		return this;
	}
	public LocationsPage clickBooleanRadioInput_NoPost_68(WebDriver driver)  {
		BrowserActions.click(driver, rdbBooleanRadioInput_NoPost_68,"BooleanRadioInput_NoPost_68");
		return this;
	}
	public LocationsPage clickReleaseLock(WebDriver driver)  {
		BrowserActions.click(driver, btnReleaseLock,"ReleaseLock");
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
	public LocationsPage enterCounty_7(WebDriver driver,String County_7) {
		BrowserActions.type(driver, inpCounty_7,County_7, "County_7");
		return this;
	}
	public LocationsPage clickForms(WebDriver driver)  {
		BrowserActions.click(driver, btnForms,"Forms");
		return this;
	}
	public LocationsPage clickBooleanRadioInput_NoPost_70(WebDriver driver)  {
		BrowserActions.click(driver, rdbBooleanRadioInput_NoPost_70,"BooleanRadioInput_NoPost_70");
		return this;
	}
	public LocationsPage clickNotes(WebDriver driver)  {
		BrowserActions.click(driver, btnNotes,"Notes");
		return this;
	}
	public LocationsPage clickBooleanRadioInput_NoPost_31(WebDriver driver)  {
		BrowserActions.click(driver, rdbBooleanRadioInput_NoPost_31,"BooleanRadioInput_NoPost_31");
		return this;
	}
	public LocationsPage clickRiskAnalysis_80(WebDriver driver)  {
		BrowserActions.click(driver, btnRiskAnalysis_80,"RiskAnalysis_80");
		return this;
	}
	public LocationsPage clickGetInspectionLossControl(WebDriver driver)  {
		BrowserActions.click(driver, btnGetInspectionLossControl,"GetInspectionLossControl");
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
	public LocationsPage clickBooleanRadioInput_NoPost_38(WebDriver driver)  {
		BrowserActions.click(driver, rdbBooleanRadioInput_NoPost_38,"BooleanRadioInput_NoPost_38");
		return this;
	}
	public LocationsPage clickLegalreview(WebDriver driver)  {
		BrowserActions.click(driver, btnLegalreview,"Legalreview");
		return this;
	}
	public LocationsPage clickPolicynotification(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicynotification,"Policynotification");
		return this;
	}
	public LocationsPage selectCoveragesin_1(WebDriver driver,String Coveragesin_1)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCoveragesin_1,Coveragesin_1,"Coveragesin_1");
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
	public LocationsPage clickBooleanRadioInput_NoPost_42(WebDriver driver)  {
		BrowserActions.click(driver, rdbBooleanRadioInput_NoPost_42,"BooleanRadioInput_NoPost_42");
		return this;
	}
	public LocationsPage click30daydiary(WebDriver driver)  {
		BrowserActions.click(driver, btn30daydiary,"30daydiary");
		return this;
	}
	public LocationsPage enterLocationCode_2(WebDriver driver,String LocationCode_2) {
		BrowserActions.type(driver, inpLocationCode_2,LocationCode_2, "LocationCode_2");
		return this;
	}
	public LocationsPage clickBooleanRadioInput_NoPost_44(WebDriver driver)  {
		BrowserActions.click(driver, rdbBooleanRadioInput_NoPost_44,"BooleanRadioInput_NoPost_44");
		return this;
	}
	public LocationsPage clickSearch(WebDriver driver)  {
		BrowserActions.click(driver, btnSearch,"Search");
		return this;
	}
	public LocationsPage clickSidebySideQuoting(WebDriver driver)  {
		BrowserActions.click(driver, btnSidebySideQuoting,"SidebySideQuoting");
		return this;
	}
	public LocationsPage clickBooleanRadioInput_NoPost_40(WebDriver driver)  {
		BrowserActions.click(driver, rdbBooleanRadioInput_NoPost_40,"BooleanRadioInput_NoPost_40");
		return this;
	}
	public LocationsPage clickBooleanRadioInput_NoPost_46(WebDriver driver)  {
		BrowserActions.click(driver, rdbBooleanRadioInput_NoPost_46,"BooleanRadioInput_NoPost_46");
		return this;
	}
	public LocationsPage clickCollectCreditCard(WebDriver driver)  {
		BrowserActions.click(driver, btnCollectCreditCard,"CollectCreditCard");
		return this;
	}
	public LocationsPage clickBooleanRadioInput_NoPost_48(WebDriver driver)  {
		BrowserActions.click(driver, rdbBooleanRadioInput_NoPost_48,"BooleanRadioInput_NoPost_48");
		return this;
	}
	public LocationsPage selectPhoneRegionCode(WebDriver driver,String PhoneRegionCode)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPhoneRegionCode,PhoneRegionCode,"PhoneRegionCode");
		return this;
	}
	public LocationsPage clickQuote_78(WebDriver driver)  {
		BrowserActions.click(driver, btnQuote_78,"Quote_78");
		return this;
	}
	public LocationsPage clickDetails(WebDriver driver)  {
		BrowserActions.click(driver, btnDetails,"Details");
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
	public LocationsPage clickGL0012336260(WebDriver driver)  {
		BrowserActions.click(driver, btnGL0012336260,"GL0012336260");
		return this;
	}
	public LocationsPage clickSearch_10(WebDriver driver)  {
		BrowserActions.click(driver, btnSearch_10,"Search_10");
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
	public LocationsPage clickViewCurrentLocation(WebDriver driver)  {
		BrowserActions.click(driver, btnViewCurrentLocation,"ViewCurrentLocation");
		return this;
	}
	public LocationsPage clickBusinessownersLine(WebDriver driver)  {
		BrowserActions.click(driver, btnBusinessownersLine,"BusinessownersLine");
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
	public LocationsPage clickCancelasplitpolicy(WebDriver driver)  {
		BrowserActions.click(driver, btnCancelasplitpolicy,"Cancelasplitpolicy");
		return this;
	}
	public LocationsPage clickGetAuditOutsideService(WebDriver driver)  {
		BrowserActions.click(driver, btnGetAuditOutsideService,"GetAuditOutsideService");
		return this;
	}
	public LocationsPage enterPrincipalOperationsOccupancy(WebDriver driver,String PrincipalOperationsOccupancy) {
		BrowserActions.type(driver, inpPrincipalOperationsOccupancy,PrincipalOperationsOccupancy, "PrincipalOperationsOccupancy");
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
	public LocationsPage clickReview30dayUWPeriod(WebDriver driver)  {
		BrowserActions.click(driver, btnReview30dayUWPeriod,"Review30dayUWPeriod");
		return this;
	}
	public LocationsPage clickPolicyVersions(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyVersions,"PolicyVersions");
		return this;
	}
	public LocationsPage clickBooleanRadioInput_NoPost_29(WebDriver driver)  {
		BrowserActions.click(driver, rdbBooleanRadioInput_NoPost_29,"BooleanRadioInput_NoPost_29");
		return this;
	}
	public LocationsPage clickUnassignedAccountLocation(WebDriver driver)  {
		BrowserActions.click(driver, btnUnassignedAccountLocation,"UnassignedAccountLocation");
		return this;
	}
	public LocationsPage clickBooleanRadioInput_NoPost_25(WebDriver driver)  {
		BrowserActions.click(driver, rdbBooleanRadioInput_NoPost_25,"BooleanRadioInput_NoPost_25");
		return this;
	}
	public LocationsPage clickBooleanRadioInput_NoPost_27(WebDriver driver)  {
		BrowserActions.click(driver, rdbBooleanRadioInput_NoPost_27,"BooleanRadioInput_NoPost_27");
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


	public class LocationInformationPage extends LoadableComponent<LocationInformationPage> {

		WebDriver driver;
		private boolean isPageLoaded;
		public ElementLayer elementLayer;
		String elementObject;
		HashMap<String, String> getPageObjects;
		public  List<Object> pageFactoryKey = new ArrayList<Object>();
		public  List<String> pageFactoryValue = new ArrayList<String>();

		@IFindBy(how = How.CSS, using = "#BOPLocationPopup-__crumb__", AI = false)
		public WebElement btnReturntoLocations;

		@IFindBy(how = How.CSS, using = "input[name='BOPLocationPopup-LocationScreen-LocationDetailPanelSet-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-Phone-GlobalPhoneInputSet-Extension']", AI = false)
		public WebElement inpPhoneExtension;

		@IFindBy(how = How.CSS, using = "#BOPLocationPopup-LocationScreen-LocationDetailPanelSet-LocationDetailCV-LocationQuestionsCardTab", AI = false)
		public WebElement btnQuestions;

		@IFindBy(how = How.CSS, using = "input[name='BOPLocationPopup-LocationScreen-LocationDetailPanelSet-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-TargetedAddressInputSet-globalAddressContainer-GlobalAddressInputSet-PostalCode']", AI = false)
		public WebElement inpZIPCode;

		@IFindBy(how = How.CSS, using = "select[name='BOPLocationPopup-LocationScreen-LocationDetailPanelSet-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-TargetedAddressInputSet-globalAddressContainer-GlobalAddressInputSet-Country']", AI = false)
		public WebElement drpCountry;

		@IFindBy(how = How.CSS, using = "select[name='BOPLocationPopup-LocationScreen-LocationDetailPanelSet-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-TargetedAddressInputSet-globalAddressContainer-GlobalAddressInputSet-State']", AI = false)
		public WebElement drpState;

		@IFindBy(how = How.CSS, using = "select[name='BOPLocationPopup-LocationScreen-LocationDetailPanelSet-LocationDetailCV-LocationDetailDV-LineLocationDetailInputSet-FireProtectionClass']", AI = false)
		public WebElement drpPublicProtection;

		@IFindBy(how = How.CSS, using = "input[name='BOPLocationPopup-LocationScreen-LocationDetailPanelSet-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-LocationName']", AI = false)
		public WebElement inpLocationName;

		@IFindBy(how = How.CSS, using = "#BOPLocationPopup-LocationScreen-Update>div[role='button']", AI = false)
		public WebElement btnOK;

		@IFindBy(how = How.CSS, using = "#BOPLocationPopup-LocationScreen-Edit>div[role='button']", AI = false)
		public WebElement btnEdit;

		@IFindBy(how = How.CSS, using = "#BOPLocationPopup-LocationScreen-LocationDetailPanelSet-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-TerritoryCodeInputSet-0-TerritoryCode-SelectTerritoryCode", AI = false)
		public WebElement btnSearch_6;

		@IFindBy(how = How.CSS, using = "#BOPLocationPopup-LocationScreen-Cancel>div[role='button']", AI = false)
		public WebElement btnCancel;

		@IFindBy(how = How.CSS, using = "input[name='BOPLocationPopup-LocationScreen-LocationDetailPanelSet-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-Phone-GlobalPhoneInputSet-PhoneDisplay']", AI = false)
		public WebElement inpPhone_5;

		@IFindBy(how = How.CSS, using = "input[name='BOPLocationPopup-LocationScreen-LocationDetailPanelSet-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-NonSpecificLocation']", AI = false)
		public WebElement rdbNonSpecificLocation;

		@IFindBy(how = How.CSS, using = "input[name='BOPLocationPopup-LocationScreen-LocationDetailPanelSet-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-TerritoryCodeInputSet-0-TerritoryCode']", AI = false)
		public WebElement inpTerritoryCode;

		@IFindBy(how = How.CSS, using = "#BOPLocationPopup-LocationScreen-LocationDetailPanelSet-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-TargetedAddressInputSet-globalAddressContainer-GlobalAddressInputSet-PostalCode-AutoFillIcon", AI = false)
		public WebElement btnAutoFillIcon_1;

		@IFindBy(how = How.CSS, using = "input[name='BOPLocationPopup-LocationScreen-LocationDetailPanelSet-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-TargetedAddressInputSet-globalAddressContainer-GlobalAddressInputSet-County']", AI = false)
		public WebElement inpCounty;

		@IFindBy(how = How.CSS, using = "input[name='BOPLocationPopup-LocationScreen-LocationDetailPanelSet-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-LocationCode']", AI = false)
		public WebElement inpLocationCode;

		@IFindBy(how = How.CSS, using = "select[name='BOPLocationPopup-LocationScreen-LocationDetailPanelSet-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-UnsyncedAddressInputSet-UnsyncedCountry']", AI = false)
		public WebElement drpCountry_4;

		@IFindBy(how = How.CSS, using = "input[name='BOPLocationPopup-LocationScreen-LocationDetailPanelSet-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-UnsyncedAddressInputSet-unsyncedAddressString']", AI = false)
		public WebElement inpAddress_2;

		@IFindBy(how = How.CSS, using = "#BOPLocationPopup-LocationScreen-LocationDetailPanelSet-LocationDetailCV-AdditionalCoveragesCardTab", AI = false)
		public WebElement btnAdditionalCoverages;

		@IFindBy(how = How.CSS, using = "input[name='BOPLocationPopup-LocationScreen-LocationDetailPanelSet-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-TargetedAddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine3']", AI = false)
		public WebElement inpAddress3;

		@IFindBy(how = How.CSS, using = "input[name='BOPLocationPopup-LocationScreen-LocationDetailPanelSet-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-TargetedAddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine1']", AI = false)
		public WebElement inpAddress1;

		@IFindBy(how = How.CSS, using = "input[name='BOPLocationPopup-LocationScreen-LocationDetailPanelSet-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-TargetedAddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine2']", AI = false)
		public WebElement inpAddress2;

		@IFindBy(how = How.CSS, using = "input[name='BOPLocationPopup-LocationScreen-LocationDetailPanelSet-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-TargetedAddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressSummary']", AI = false)
		public WebElement inpAddress;

		@IFindBy(how = How.CSS, using = "#BOPLocationPopup-LocationScreen-LocationDetailPanelSet-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-TargetedAddressInputSet-globalAddressContainer-GlobalAddressInputSet-City-AutoFillIcon", AI = false)
		public WebElement btnAutoFillIcon;

		@IFindBy(how = How.CSS, using = "select[name='BOPLocationPopup-LocationScreen-LocationDetailPanelSet-PreferredCoverageCurrencySelectorRef-PreferredCoverageCurrencyPanelSet-PreferredCoverageCurrencySelectorDropDown']", AI = false)
		public WebElement drpCoveragesin;

		@IFindBy(how = How.CSS, using = "input[name='BOPLocationPopup-LocationScreen-LocationDetailPanelSet-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-UnsyncedAddressInputSet-UnsyncedCounty']", AI = false)
		public WebElement inpCounty_3;

		@IFindBy(how = How.CSS, using = "#BOPLocationPopup-LocationScreen-LocationDetailPanelSet-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-TerritoryCodeInputSet-AutofillLink", AI = false)
		public WebElement btnAutofillTerritoryCodes;

		@IFindBy(how = How.CSS, using = "input[name='BOPLocationPopup-LocationScreen-LocationDetailPanelSet-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-TaxLocation']", AI = false)
		public WebElement inpTaxLocation;

		@IFindBy(how = How.CSS, using = "input[name='BOPLocationPopup-LocationScreen-LocationDetailPanelSet-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-TargetedAddressInputSet-globalAddressContainer-GlobalAddressInputSet-City']", AI = false)
		public WebElement inpCity;

		@IFindBy(how = How.CSS, using = "#BOPLocationPopup-LocationScreen-LocationDetailPanelSet-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-TaxLocation-SelectTaxLocation", AI = false)
		public WebElement btnSearch;

		@IFindBy(how = How.CSS, using = "select[name='BOPLocationPopup-LocationScreen-LocationDetailPanelSet-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-Phone-GlobalPhoneInputSet-CountryCode']", AI = false)
		public WebElement drpPhoneRegionCode;

		@IFindBy(how = How.CSS, using = "#BOPLocationPopup-LocationScreen-LocationDetailPanelSet-LocationDetailCV-GeneralInfoCardTab", AI = false)
		public WebElement btnDetails;

		@IFindBy(how = How.CSS, using = "input[name='BOPLocationPopup-LocationScreen-LocationDetailPanelSet-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-Phone-GlobalPhoneInputSet-NationalSubscriberNumber']", AI = false)
		public WebElement inpPhone;

		@IFindBy(how = How.XPATH, using = "//div[text()='Location Information']", AI = false)
		public WebElement lblTtlBar;

		@IFindBy(how = How.CSS, using = "#BOPLocationPopup-LocationScreen-LocationDetailPanelSet-LocationDetailCV-AccountLocationUpToDateDV-SynchronizedLink", AI = false)
		public WebElement btnViewCurrentLocation;

		@IFindBy(how = How.CSS, using = "#BOPLocationPopup-LocationScreen-LocationDetailPanelSet-LocationDetailCV-LocationDetailDV-LineLocationDetailInputSet-PrincipleOps textarea", AI = false)
		public WebElement inpPrincipalOperationsOccupancy;

		@IFindBy(how = How.CSS, using = "input[name='BOPLocationPopup-LocationScreen-LocationDetailPanelSet-PreferredCoverageCurrencySelectorRef-PreferredCoverageCurrencyPanelSet-CoverageCurrencyDisplay']", AI = false)
		public WebElement inpCoveragesin;

		public LocationInformationPage(){
		}

		public LocationInformationPage(WebDriver driver) {
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
		}public LocationInformationPage clickReturntoLocations(WebDriver driver)  {
			BrowserActions.click(driver, btnReturntoLocations,"ReturntoLocations");
			return this;
		}
		public LocationInformationPage enterPhoneExtension(WebDriver driver,String PhoneExtension) {
			BrowserActions.type(driver, inpPhoneExtension,PhoneExtension, "PhoneExtension");
			return this;
		}
		public LocationInformationPage clickQuestions(WebDriver driver)  {
			BrowserActions.click(driver, btnQuestions,"Questions");
			return this;
		}
		public LocationInformationPage enterZIPCode(WebDriver driver,String ZIPCode) {
			BrowserActions.type(driver, inpZIPCode,ZIPCode, "ZIPCode");
			return this;
		}
		public LocationInformationPage selectCountry(WebDriver driver,String Country)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpCountry,Country,"Country");
			return this;
		}
		public LocationInformationPage selectState(WebDriver driver,String State)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpState,State,"State");
			return this;
		}
		public LocationInformationPage selectPublicProtection(WebDriver driver,String PublicProtection)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpPublicProtection,PublicProtection,"PublicProtection");
			return this;
		}
		public LocationInformationPage enterLocationName(WebDriver driver,String LocationName) {
			BrowserActions.type(driver, inpLocationName,LocationName, "LocationName");
			return this;
		}
		public LocationInformationPage clickOK(WebDriver driver)  {
			BrowserActions.click(driver, btnOK,"OK");
			return this;
		}
		public LocationInformationPage clickEdit(WebDriver driver)  {
			BrowserActions.click(driver, btnEdit,"Edit");
			return this;
		}
		public LocationInformationPage clickSearch_6(WebDriver driver)  {
			BrowserActions.click(driver, btnSearch_6,"Search_6");
			return this;
		}
		public LocationInformationPage clickCancel(WebDriver driver)  {
			BrowserActions.click(driver, btnCancel,"Cancel");
			return this;
		}
		public LocationInformationPage enterPhone_5(WebDriver driver,String Phone_5) {
			BrowserActions.type(driver, inpPhone_5,Phone_5, "Phone_5");
			return this;
		}
		public LocationInformationPage clickNonSpecificLocation(WebDriver driver)  {
			BrowserActions.click(driver, rdbNonSpecificLocation,"NonSpecificLocation");
			return this;
		}
		public LocationInformationPage enterTerritoryCode(WebDriver driver,String TerritoryCode) {
			BrowserActions.type(driver, inpTerritoryCode,TerritoryCode, "TerritoryCode");
			return this;
		}
		public LocationInformationPage clickAutoFillIcon_1(WebDriver driver)  {
			BrowserActions.click(driver, btnAutoFillIcon_1,"AutoFillIcon_1");
			return this;
		}
		public LocationInformationPage enterCounty(WebDriver driver,String County) {
			BrowserActions.type(driver, inpCounty,County, "County");
			return this;
		}
		public LocationInformationPage enterLocationCode(WebDriver driver,String LocationCode) {
			BrowserActions.type(driver, inpLocationCode,LocationCode, "LocationCode");
			return this;
		}
		public LocationInformationPage selectCountry_4(WebDriver driver,String Country_4)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpCountry_4,Country_4,"Country_4");
			return this;
		}
		public LocationInformationPage enterAddress_2(WebDriver driver,String Address_2) {
			BrowserActions.type(driver, inpAddress_2,Address_2, "Address_2");
			return this;
		}
		public LocationInformationPage clickAdditionalCoverages(WebDriver driver)  {
			BrowserActions.click(driver, btnAdditionalCoverages,"AdditionalCoverages");
			return this;
		}
		public LocationInformationPage enterAddress3(WebDriver driver,String Address3) {
			BrowserActions.type(driver, inpAddress3,Address3, "Address3");
			return this;
		}
		public LocationInformationPage enterAddress1(WebDriver driver,String Address1) {
			BrowserActions.type(driver, inpAddress1,Address1, "Address1");
			return this;
		}
		public LocationInformationPage enterAddress2(WebDriver driver,String Address2) {
			BrowserActions.type(driver, inpAddress2,Address2, "Address2");
			return this;
		}
		public LocationInformationPage enterAddress(WebDriver driver,String Address) {
			BrowserActions.type(driver, inpAddress,Address, "Address");
			return this;
		}
		public LocationInformationPage clickAutoFillIcon(WebDriver driver)  {
			BrowserActions.click(driver, btnAutoFillIcon,"AutoFillIcon");
			return this;
		}
		public LocationInformationPage selectCoveragesin(WebDriver driver,String Coveragesin)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpCoveragesin,Coveragesin,"Coveragesin");
			return this;
		}
		public LocationInformationPage enterCounty_3(WebDriver driver,String County_3) {
			BrowserActions.type(driver, inpCounty_3,County_3, "County_3");
			return this;
		}
		public LocationInformationPage clickAutofillTerritoryCodes(WebDriver driver)  {
			BrowserActions.click(driver, btnAutofillTerritoryCodes,"AutofillTerritoryCodes");
			return this;
		}
		public LocationInformationPage enterTaxLocation(WebDriver driver,String TaxLocation) {
			BrowserActions.type(driver, inpTaxLocation,TaxLocation, "TaxLocation");
			return this;
		}
		public LocationInformationPage enterCity(WebDriver driver,String City) {
			BrowserActions.type(driver, inpCity,City, "City");
			return this;
		}
		public LocationInformationPage clickSearch(WebDriver driver)  {
			BrowserActions.click(driver, btnSearch,"Search");
			return this;
		}
		public LocationInformationPage selectPhoneRegionCode(WebDriver driver,String PhoneRegionCode)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpPhoneRegionCode,PhoneRegionCode,"PhoneRegionCode");
			return this;
		}
		public LocationInformationPage clickDetails(WebDriver driver)  {
			BrowserActions.click(driver, btnDetails,"Details");
			return this;
		}
		public LocationInformationPage enterPhone(WebDriver driver,String Phone) {
			BrowserActions.type(driver, inpPhone,Phone, "Phone");
			return this;
		}
		public LocationInformationPage clickViewCurrentLocation(WebDriver driver)  {
			BrowserActions.click(driver, btnViewCurrentLocation,"ViewCurrentLocation");
			return this;
		}
		public LocationInformationPage enterPrincipalOperationsOccupancy(WebDriver driver,String PrincipalOperationsOccupancy) {
			BrowserActions.type(driver, inpPrincipalOperationsOccupancy,PrincipalOperationsOccupancy, "PrincipalOperationsOccupancy");
			return this;
		}
		public LocationInformationPage enterCoveragesin(WebDriver driver,String Coveragesin) {
			BrowserActions.type(driver, inpCoveragesin,Coveragesin, "Coveragesin");
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

		public SearchCoveragesPage(){
		}

		public SearchCoveragesPage(WebDriver driver) throws Exception{
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
	}

}
