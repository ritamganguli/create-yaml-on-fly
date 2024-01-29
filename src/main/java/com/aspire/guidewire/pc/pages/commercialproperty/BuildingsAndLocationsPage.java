package com.aspire.guidewire.pc.pages.commercialproperty;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.How;
import org.openqa.selenium.By;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;
import org.openqa.selenium.support.ui.LoadableComponent;
import ASPIREAI.customfactories.AjaxElementLocatorFactory;
import ASPIREAI.customfactories.PageFactory;
import com.aspire.guidewire.utils.BrowserActions;
import com.aspire.guidewire.utils.ElementLayer;
import com.aspire.guidewire.utils.Log;
import com.aspire.guidewire.utils.WaitUtils;import org.testng.Assert;
import ASPIREAI.customfactories.IFindBy;

public class BuildingsAndLocationsPage extends LoadableComponent<BuildingsAndLocationsPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
	//	public TopNavBar topnavbar;
	//	public CPBuildingsAndLocations cpbuildingsandlocationsTable;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Workplan>div[role='menuitem']", AI = false)
	public WebElement btnWorkplan;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPBuildingsScreen-CPBuildingsAndLocationsLV_tb-addLocationsTB-addExistingLocations>div[role='menuitem']", AI = false)
	public WebElement btnExistingLocation;

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

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPBuildingsScreen-RiskEvaluationInProgressAlert-CloseBtn", AI = false)
	public WebElement btnClose_1;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPBuildingsScreen-CPBuildingsAndLocationsLV-0-LastRiskAssessmentIsStaleIcon", AI = false)
	public WebElement btnLastRiskAssessmentIsStaleIcon;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPBuildingsScreen-JobWizardToolbarButtonSet-QuoteTypeToolbarButtonSet-Rate>div[role='button']", AI = false)
	public WebElement btnRate;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPBuildingsScreen-CPBuildingsAndLocationsLV-0-LastRiskAssessmentEvaluation", AI = false)
	public WebElement btnLastRiskAssessmentEvaluation;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-1-item>div[role='menuitem']", AI = false)
	public WebElement btnGetAuditInternalPersonnel;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPBuildingsScreen-JobWizardToolbarButtonSet-BindOptions-BindOnly>div[role='menuitem']", AI = false)
	public WebElement btnBindOnly;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPBuildingsScreen-CPBuildingsAndLocationsLV-ExtraExpenseHeader']", AI = false)
	public WebElement inpExtraExpenseHeader;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPBuildingsScreen-CPBuildingsAndLocationsLV-0-Actions-ActionsMenuIcon>div[role='button']", AI = false)
	public WebElement btnActionsMenuIcon;

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

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPBuildingsScreen-JobWizardToolbarButtonSet-Versions-NewVersion>div[role='menuitem']", AI = false)
	public WebElement btnStartMultiVersion;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPBuildingsScreen-CPBuildingsAndLocationsLV-0-Actions-RemoveLocation>div[role='menuitem']", AI = false)
	public WebElement btnRemoveLocation;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Prev>div[role='button']", AI = false)
	public WebElement btnBack;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-1-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnCA0076102635;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-PolicyVersions>div[role='menuitem']", AI = false)
	public WebElement btnPolicyVersions_3;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-15-item>div[role='menuitem']", AI = false)
	public WebElement btnReviewProducer;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-RiskEvaluation>div[role='menuitem']", AI = false)
	public WebElement btnRiskAnalysis_4;

	@IFindBy(how = How.CSS, using = "div[id$='Next']", AI = false)
	public WebElement btnNext;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-10-item>div[role='menuitem']", AI = false)
	public WebElement btnQuoteRequired;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-8-item>div[role='menuitem']", AI = false)
	public WebElement btnPolicyReviewMidterm;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-0-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnCP0076747808;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPBuildingsScreen-JobWizardToolbarButtonSet-Versions-ViewSideBySide>div[role='menuitem']", AI = false)
	public WebElement btnViewSideBySideVersions;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPBuildingsScreen-JobWizardToolbarButtonSet-Draft>div[role='button']", AI = false)
	public WebElement btnSaveDraft;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPBuildingsScreen-CPBuildingsAndLocationsLV_tb-addLocationsTB>div[role='button']", AI = false)
	public WebElement btnAddLocation;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-3-item>div[role='menuitem']", AI = false)
	public WebElement btnGetBureauData;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Reinsurance>div[role='menuitem']", AI = false)
	public WebElement btnReinsurance;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-JobGroupItem>div[role='menuitem']", AI = false)
	public WebElement btnSG00761026358605252857;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-BillingInfo>div[role='menuitem']", AI = false)
	public WebElement btnPayment;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Change-WizardMenuActions_ChangeEffDate>div[role='menuitem']", AI = false)
	public WebElement btnEffectiveDate;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPBuildingsScreen-QuoteRequestedAlert .gw-AlertBar--label", AI = false)
	public WebElement lblQuoteRequestedAlert;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPBuildingsScreen-CPBuildingsAndLocationsLV_tb-addLocationsTB-AddNewLocation>div[role='button']", AI = false)
	public WebElement btnNewLocation;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPBuildingsScreen-CPBuildingsAndLocationsLV_tb-Spreadsheet>div[role='button']", AI = false)
	public WebElement btnSpreadsheet;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewDocument-NewJobDocumentMenuItemSet-PolicyPeriodNewDocumentMenuItemSet_Template>div[role='menuitem']", AI = false)
	public WebElement btnCreatefromatemplate;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-CPBuildings>div[role='menuitem']", AI = false)
	public WebElement btnBuildingsandLocations;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPBuildingsScreen-JobWizardToolbarButtonSet-Versions-SideBySide>div[role='menuitem']", AI = false)
	public WebElement btnStartSidebySide;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Archiving>div[role='menuitem']", AI = false)
	public WebElement btnArchiving;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPBuildingsScreen-JobWizardToolbarButtonSet-CloseOptions-NotTakenJob>div[role='menuitem']", AI = false)
	public WebElement btnNotTaken;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Documents>div[role='menuitem']", AI = false)
	public WebElement btnDocuments;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPBuildingsScreen-OOSEPanelSet-NextSliceLink", AI = false)
	public WebElement btnNextBlockedDate;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-2-item>div[role='menuitem']", AI = false)
	public WebElement btn90daydiary;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-ViewQuote>div[role='menuitem']", AI = false)
	public WebElement btnQuote;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPBuildingsScreen-JobWizardToolbarButtonSet-BindOptions>div[role='button']", AI = false)
	public WebElement btnBindOptions;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPBuildingsScreen-CPBuildingsAndLocationsLV_tb-addLocationsTB-addExistingLocations-AddMoreLocations>div[role='menuitem']", AI = false)
	public WebElement btnMoreLocations;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPBuildingsScreen-CPBuildingsAndLocationsLV_tb-Remove>div[role='button']", AI = false)
	public WebElement btnRemoveBuildings;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPBuildingsScreen-JobWizardToolbarButtonSet-Unlock>div[role='button']", AI = false)
	public WebElement btnReleaseLock;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Archiving-WizardMenuActions_SuspendResumeArchiving>div[role='menuitem']", AI = false)
	public WebElement btnEnableDisable;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPBuildingsScreen-JobWizardToolbarButtonSet-BindOptions-BindAndIssue>div[role='menuitem']", AI = false)
	public WebElement btnIssuePolicy;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-0-item>div[role='menuitem']", AI = false)
	public WebElement btnCreateNewProducer;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPBuildingsScreen-CPBuildingsAndLocationsLV-BusIncomeHeader']", AI = false)
	public WebElement inpBusIncomeHeader;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Forms>div[role='menuitem']", AI = false)
	public WebElement btnForms;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-MultiQuoteAcceleratedMenuActions-PolicyPeriodSelector", AI = false)
	public WebElement btnPolicyPeriodSelector;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-1-NewActivityMenuItemSet_Category>div[role='menuitem']", AI = false)
	public WebElement btnNewmail;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-CPBlanket>div[role='menuitem']", AI = false)
	public WebElement btnBlankets;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-7-item>div[role='menuitem']", AI = false)
	public WebElement btnGetMotorVehicleReports;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-PreQualification>div[role='menuitem']", AI = false)
	public WebElement btnQualification;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Notes>div[role='menuitem']", AI = false)
	public WebElement btnNotes;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-ViewMultiLineQuote>div[role='menuitem']", AI = false)
	public WebElement btnQuote_2;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPBuildingsScreen-CPBuildingsAndLocationsLV_tb-CopyBuildingCoveragesButton>div[role='button']", AI = false)
	public WebElement btnCopyCoverages;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-5-item>div[role='menuitem']", AI = false)
	public WebElement btnGetInspectionLossControl;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPBuildingsScreen-CPBuildingsAndLocationsLV_tb-Spreadsheet-Export>div[role='menuitem']", AI = false)
	public WebElement btnExport;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPBuildingsScreen-CPBuildingsAndLocationsLV-0-LocationName']", AI = false)
	public WebElement inpLocationName;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Participants>div[role='menuitem']", AI = false)
	public WebElement btnParticipants;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create>div[role='menuitem']", AI = false)
	public WebElement btnCreate;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-4-NewActivityMenuItemSet_Category-0-item>div[role='menuitem']", AI = false)
	public WebElement btnReviewandapprove;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPBuildingsScreen-OOSEPanelSet-OOSEPeriodSelector-OOSEPeriodSelector_Arg']", AI = false)
	public WebElement drpEffectiveDate;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPBuildingsScreen-CPBuildingsAndLocationsLV-0-Actions']", AI = false)
	public WebElement inpActions;

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

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPBuildingsScreen-CPBuildingsAndLocationsLV-0-Actions-AddBuilding-AddExistingBuildings>div[role='menuitem']", AI = false)
	public WebElement btnExistingBuilding;

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

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPBuildingsScreen-CPBuildingsAndLocationsLV-LastRiskAssessmentEvaluationHeader']", AI = false)
	public WebElement inpLastRiskAssessmentEvaluationHeader;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Offering>div[role='menuitem']", AI = false)
	public WebElement btnOfferings;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-9-item>div[role='menuitem']", AI = false)
	public WebElement btnPolicyReviewRenewal;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPBuildingsScreen-CPBuildingsAndLocationsLV-0-Actions-AddBuilding-AddExistingBuildings-AddMoreBuildings>div[role='menuitem']", AI = false)
	public WebElement btnMoreBuildings;

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

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPBuildingsScreen-CPBuildingsAndLocationsLV-CoverageCurrency']", AI = false)
	public WebElement inpCoverageCurrency;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-11-item>div[role='menuitem']", AI = false)
	public WebElement btnRatiooutofrange;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPBuildingsScreen-JobWizardToolbarButtonSet-ConvertToFullApp>div[role='button']", AI = false)
	public WebElement btnFullApp;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-PolicyReview>div[role='menuitem']", AI = false)
	public WebElement btnPolicyReview;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPBuildingsScreen-CPBuildingsAndLocationsLV-0-Actions-SetPrimaryLocation>div[role='menuitem']", AI = false)
	public WebElement btnSetasPrimary;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-DiagWorksheetItem>div[role='menuitem']", AI = false)
	public WebElement btnDiagnosticData;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPBuildingsScreen-OOSEPanelSet-OOSEPeriodSelector", AI = false)
	public WebElement btnOOSEPeriodSelector;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-11-item>div[role='menuitem']", AI = false)
	public WebElement btnManuallyrateandquotepolicy;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-History>div[role='menuitem']", AI = false)
	public WebElement btnHistory;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category>div[role='menuitem']", AI = false)
	public WebElement btnReminder;

	@IFindBy(how = How.CSS, using = "div[id$='BuildingsScreen-ttlBar']", AI = false)
	public WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Change>div[role='menuitem']", AI = false)
	public WebElement btnEdit;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPBuildingsScreen-JobWizardToolbarButtonSet-CloseOptions-WithdrawJob>div[role='menuitem']", AI = false)
	public WebElement btnWithdrawTransaction;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-PolicyInfo>div[role='menuitem']", AI = false)
	public WebElement btnPolicyInfo;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPBuildingsScreen-CPBuildingsAndLocationsLV-BuildingBPPHeader']", AI = false)
	public WebElement inpBuildingBPPHeader;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPBuildingsScreen-CPBuildingsAndLocationsLV_tb-Spreadsheet-Import>div[role='menuitem']", AI = false)
	public WebElement btnImport;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPBuildingsScreen-JobWizardToolbarButtonSet-Versions>div[role='button']", AI = false)
	public WebElement btnVersions;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-Modifiers>div[role='menuitem']", AI = false)
	public WebElement btnModifiers;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_ToAccountFile>div[role='menuitem']", AI = false)
	public WebElement btnAccountFile;

	//	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPBuildingsScreen-CPBuildingsAndLocationsLV-0-Actions-AddBuilding>div[role='menuitem']", AI = false)
	//	public WebElement btnAddBuilding;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPBuildingsScreen-RiskEvaluationInProgressAlert .gw-AlertBar--label", AI = false)
	public WebElement lblRiskEvaluationInProgressAlert;

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

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPBuildingsScreen-CPBuildingsAndLocationsLV-0-Actions-AddBuilding-AddNewBuilding>div[role='menuitem']", AI = false)
	public WebElement btnNewBuilding;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-5-item>div[role='menuitem']", AI = false)
	public WebElement btnNewAuditAssignment;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-16-item>div[role='menuitem']", AI = false)
	public WebElement btnRewritetoNewAccount;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPBuildingsScreen-QuoteRequestedAlert-CloseBtn", AI = false)
	public WebElement btnClose;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-12-item>div[role='menuitem']", AI = false)
	public WebElement btnReview30dayUWPeriod;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-ManageBranches>div[role='menuitem']", AI = false)
	public WebElement btnPolicyVersions;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-14-item>div[role='menuitem']", AI = false)
	public WebElement btnReview60dayUWPeriod;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPBuildingsScreen-JobWizardToolbarButtonSet-EditPolicy>div[role='button']", AI = false)
	public WebElement btnEditPolicyTransaction;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPBuildingsScreen-CPBuildingsAndLocationsLV-BuildingDescHeader']", AI = false)
	public WebElement inpBuildingDescHeader;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity>div[role='menuitem']", AI = false)
	public WebElement btnNewActivity;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPBuildingsScreen-CPBuildingsAndLocationsLV-ActionsHeader']", AI = false)
	public WebElement inpActionsHeader;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Cancel>div[role='button']", AI = false)
	public WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPBuildingsScreen-JobWizardToolbarButtonSet-CloseOptions>div[role='button']", AI = false)
	public WebElement btnCloseOptions;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup>div[role='menuitem']", AI = false)
	public WebElement btnPolicyContract;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_ToPolicyFile>div[role='menuitem']", AI = false)
	public WebElement btnPolicyFile;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPBuildingsScreen-CPBuildingsAndLocationsLV-BuildingLimitHeader']", AI = false)
	public WebElement inpBuildingLimitHeader;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-17-item>div[role='menuitem']", AI = false)
	public WebElement btnVerifycoverage;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category>div[role='menuitem']", AI = false)
	public WebElement btnRequest;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-4-item>div[role='menuitem']", AI = false)
	public WebElement btnGetCreditReports;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPBuildingsScreen-JobWizardToolbarButtonSet-CloseOptions-Decline>div[role='menuitem']", AI = false)
	public WebElement btnDecline;

	@IFindBy(how = How.CSS, using = "div[id=$'SubmissionWizard-WizardMenuActions']>div[role='button']", AI = false)
	public WebElement btnWizardMenuActions;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardActionsMenuItemSet-SubmissionInfo>div[role='menuitem']", AI = false)
	public WebElement btnSubManager;

	@IFindBy(how = How.CSS, using = "div[id$='0-Actions-ActionsMenuIcon']", AI = false)
	public WebElement btnBuildingDropdown;

	@IFindBy(how = How.CSS, using = "div[id$='AddBuilding']", AI = false)
	public WebElement lnkAddBuilding;

	@IFindBy(how = How.CSS, using = "div[id$='AddNewBuilding']", AI = false)
	public WebElement lnkAddNewBuilding;

	@IFindBy(how = How.CSS, using = "input[name='CPBuildingPopup-CPBldgSuggestedCovDV-IncomeAndExpenseIterator-0-CoverageInputSet-CovPatternInputGroup-0-CovTermInputSet-CovTermDirectInputSet-DirectTermInput']", AI = false)
	public WebElement inpIncomeLimitNotMfgorRental;

	@IFindBy(how = How.CSS, using = "div[id$='Update']", AI = false)
	public WebElement btnOk;

	public String btnBuildingsDropdown = "div[id$='{INDEX}-Actions-AddBuilding']";
	//String btnAddBuilding="(//div[text()='Add Building'])";
	//String btnNewBuilding="(//div[text()='New Building'])";
	String btnBuildingsMenu = "(//div[contains(@id,'{INDEX}-Actions-ActionsMenuIcon')])";
	String btnAddBuilding = "(//div[contains(@id,'{INDEX}-Actions-AddBuilding')])";
	String btnAddNewBuilding = "(//div[contains(@id,'{INDEX}-Actions-AddBuilding-AddNewBuilding')])";


	public BuildingsAndLocationsPage(){
	}

	public BuildingsAndLocationsPage(WebDriver driver) {
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(finder, this);
	}
	
	public BuildingsAndLocationsPage(WebDriver driver,int timeout) {
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver,timeout);
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
	}public BuildingsAndLocationsPage clickWorkplan(WebDriver driver)  {
		BrowserActions.click(driver, btnWorkplan,"Workplan");
		return this;
	}
	public BuildingsAndLocationsPage clickExistingLocation(WebDriver driver)  {
		BrowserActions.click(driver, btnExistingLocation,"ExistingLocation");
		return this;
	}
	public BuildingsAndLocationsPage clickGetRiskInformationProducer(WebDriver driver)  {
		BrowserActions.click(driver, btnGetRiskInformationProducer,"GetRiskInformationProducer");
		return this;
	}
	public BuildingsAndLocationsPage clickCopySubmission(WebDriver driver)  {
		BrowserActions.click(driver, btnCopySubmission,"CopySubmission");
		return this;
	}
	public BuildingsAndLocationsPage clickGeneralreminderdiary(WebDriver driver)  {
		BrowserActions.click(driver, btnGeneralreminderdiary,"Generalreminderdiary");
		return this;
	}
	public BuildingsAndLocationsPage clickGetReinsuranceQuote(WebDriver driver)  {
		BrowserActions.click(driver, btnGetReinsuranceQuote,"GetReinsuranceQuote");
		return this;
	}
	public BuildingsAndLocationsPage clickReview45dayUWPeriod(WebDriver driver)  {
		BrowserActions.click(driver, btnReview45dayUWPeriod,"Review45dayUWPeriod");
		return this;
	}
	public BuildingsAndLocationsPage clickClose_1(WebDriver driver)  {
		BrowserActions.click(driver, btnClose_1,"Close_1");
		return this;
	}
	public BuildingsAndLocationsPage clickLastRiskAssessmentIsStaleIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnLastRiskAssessmentIsStaleIcon,"LastRiskAssessmentIsStaleIcon");
		return this;
	}
	public BuildingsAndLocationsPage clickRate(WebDriver driver)  {
		BrowserActions.click(driver, btnRate,"Rate");
		return this;
	}
	public BuildingsAndLocationsPage clickLastRiskAssessmentEvaluation(WebDriver driver)  {
		BrowserActions.click(driver, btnLastRiskAssessmentEvaluation,"LastRiskAssessmentEvaluation");
		return this;
	}
	public BuildingsAndLocationsPage clickGetAuditInternalPersonnel(WebDriver driver)  {
		BrowserActions.click(driver, btnGetAuditInternalPersonnel,"GetAuditInternalPersonnel");
		return this;
	}
	public BuildingsAndLocationsPage clickBindOnly(WebDriver driver)  {
		BrowserActions.click(driver, btnBindOnly,"BindOnly");
		return this;
	}
	public BuildingsAndLocationsPage enterExtraExpenseHeader(WebDriver driver,String ExtraExpenseHeader) {
		BrowserActions.type(driver, inpExtraExpenseHeader,ExtraExpenseHeader, "ExtraExpenseHeader");
		return this;
	}
	public BuildingsAndLocationsPage clickActionsMenuIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnActionsMenuIcon,"ActionsMenuIcon");
		return this;
	}
	public BuildingsAndLocationsPage clickInterview(WebDriver driver)  {
		BrowserActions.click(driver, btnInterview,"Interview");
		return this;
	}
	public BuildingsAndLocationsPage selectPolicyPeriodSelector_Arg(WebDriver driver,String PolicyPeriodSelector_Arg)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPolicyPeriodSelector_Arg,PolicyPeriodSelector_Arg,"PolicyPeriodSelector_Arg");
		return this;
	}
	public BuildingsAndLocationsPage clickPerformanceReview(WebDriver driver)  {
		BrowserActions.click(driver, btnPerformanceReview,"PerformanceReview");
		return this;
	}
	public BuildingsAndLocationsPage clickShowPartialWorksheet(WebDriver driver)  {
		BrowserActions.click(driver, btnShowPartialWorksheet,"ShowPartialWorksheet");
		return this;
	}
	public BuildingsAndLocationsPage click60daydiary(WebDriver driver)  {
		BrowserActions.click(driver, btn60daydiary,"60daydiary");
		return this;
	}
	public BuildingsAndLocationsPage clickStartMultiVersion(WebDriver driver)  {
		BrowserActions.click(driver, btnStartMultiVersion,"StartMultiVersion");
		return this;
	}
	public BuildingsAndLocationsPage clickRemoveLocation(WebDriver driver)  {
		BrowserActions.click(driver, btnRemoveLocation,"RemoveLocation");
		return this;
	}
	public BuildingsAndLocationsPage clickBack(WebDriver driver)  {
		BrowserActions.click(driver, btnBack,"Back");
		return this;
	}
	public BuildingsAndLocationsPage clickCA0076102635(WebDriver driver)  {
		BrowserActions.click(driver, btnCA0076102635,"CA0076102635");
		return this;
	}
	public BuildingsAndLocationsPage clickPolicyVersions_3(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyVersions_3,"PolicyVersions_3");
		return this;
	}
	public BuildingsAndLocationsPage clickReviewProducer(WebDriver driver)  {
		BrowserActions.click(driver, btnReviewProducer,"ReviewProducer");
		return this;
	}
	public BuildingsAndLocationsPage clickRiskAnalysis_4(WebDriver driver)  {
		BrowserActions.click(driver, btnRiskAnalysis_4,"RiskAnalysis_4");
		return this;
	}
	public BuildingsAndLocationsPage clickNext(WebDriver driver)  {
		BrowserActions.click(driver, btnNext,"Next");
		return this;
	}
	public BuildingsAndLocationsPage clickQuoteRequired(WebDriver driver)  {
		BrowserActions.click(driver, btnQuoteRequired,"QuoteRequired");
		return this;
	}
	public BuildingsAndLocationsPage clickPolicyReviewMidterm(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyReviewMidterm,"PolicyReviewMidterm");
		return this;
	}
	public BuildingsAndLocationsPage clickCP0076747808(WebDriver driver)  {
		BrowserActions.click(driver, btnCP0076747808,"CP0076747808");
		return this;
	}
	public BuildingsAndLocationsPage clickViewSideBySideVersions(WebDriver driver)  {
		BrowserActions.click(driver, btnViewSideBySideVersions,"ViewSideBySideVersions");
		return this;
	}
	public BuildingsAndLocationsPage clickSaveDraft(WebDriver driver)  {
		BrowserActions.click(driver, btnSaveDraft,"SaveDraft");
		return this;
	}
	public BuildingsAndLocationsPage clickAddLocation(WebDriver driver)  {
		BrowserActions.click(driver, btnAddLocation,"AddLocation");
		return this;
	}
	public BuildingsAndLocationsPage clickGetBureauData(WebDriver driver)  {
		BrowserActions.click(driver, btnGetBureauData,"GetBureauData");
		return this;
	}
	public BuildingsAndLocationsPage clickReinsurance(WebDriver driver)  {
		BrowserActions.click(driver, btnReinsurance,"Reinsurance");
		return this;
	}
	public BuildingsAndLocationsPage clickSG00761026358605252857(WebDriver driver)  {
		BrowserActions.click(driver, btnSG00761026358605252857,"SG00761026358605252857");
		return this;
	}
	public BuildingsAndLocationsPage clickPayment(WebDriver driver)  {
		BrowserActions.click(driver, btnPayment,"Payment");
		return this;
	}
	public BuildingsAndLocationsPage clickEffectiveDate(WebDriver driver)  {
		BrowserActions.click(driver, btnEffectiveDate,"EffectiveDate");
		return this;
	}
	public BuildingsAndLocationsPage clickNewLocation(WebDriver driver)  {
		BrowserActions.click(driver, btnNewLocation,"NewLocation");
		return this;
	}
	public BuildingsAndLocationsPage clickSpreadsheet(WebDriver driver)  {
		BrowserActions.click(driver, btnSpreadsheet,"Spreadsheet");
		return this;
	}
	public BuildingsAndLocationsPage clickCreatefromatemplate(WebDriver driver)  {
		BrowserActions.click(driver, btnCreatefromatemplate,"Createfromatemplate");
		return this;
	}
	public BuildingsAndLocationsPage clickBuildingsandLocations(WebDriver driver)  {
		BrowserActions.click(driver, btnBuildingsandLocations,"BuildingsandLocations");
		return this;
	}
	public BuildingsAndLocationsPage clickStartSidebySide(WebDriver driver)  {
		BrowserActions.click(driver, btnStartSidebySide,"StartSidebySide");
		return this;
	}
	public BuildingsAndLocationsPage clickArchiving(WebDriver driver)  {
		BrowserActions.click(driver, btnArchiving,"Archiving");
		return this;
	}
	public BuildingsAndLocationsPage clickNotTaken(WebDriver driver)  {
		BrowserActions.click(driver, btnNotTaken,"NotTaken");
		return this;
	}
	public BuildingsAndLocationsPage clickDocuments(WebDriver driver)  {
		BrowserActions.click(driver, btnDocuments,"Documents");
		return this;
	}
	public BuildingsAndLocationsPage clickNextBlockedDate(WebDriver driver)  {
		BrowserActions.click(driver, btnNextBlockedDate,"NextBlockedDate");
		return this;
	}
	public BuildingsAndLocationsPage click90daydiary(WebDriver driver)  {
		BrowserActions.click(driver, btn90daydiary,"90daydiary");
		return this;
	}
	public BuildingsAndLocationsPage clickQuote(WebDriver driver)  {
		BrowserActions.click(driver, btnQuote,"Quote");
		return this;
	}
	public BuildingsAndLocationsPage clickBindOptions(WebDriver driver)  {
		BrowserActions.click(driver, btnBindOptions,"BindOptions");
		return this;
	}
	public BuildingsAndLocationsPage clickMoreLocations(WebDriver driver)  {
		BrowserActions.click(driver, btnMoreLocations,"MoreLocations");
		return this;
	}
	public BuildingsAndLocationsPage clickRemoveBuildings(WebDriver driver)  {
		BrowserActions.click(driver, btnRemoveBuildings,"RemoveBuildings");
		return this;
	}
	public BuildingsAndLocationsPage clickReleaseLock(WebDriver driver)  {
		BrowserActions.click(driver, btnReleaseLock,"ReleaseLock");
		return this;
	}
	public BuildingsAndLocationsPage clickEnableDisable(WebDriver driver)  {
		BrowserActions.click(driver, btnEnableDisable,"EnableDisable");
		return this;
	}
	public BuildingsAndLocationsPage clickIssuePolicy(WebDriver driver)  {
		BrowserActions.click(driver, btnIssuePolicy,"IssuePolicy");
		return this;
	}
	public BuildingsAndLocationsPage clickCreateNewProducer(WebDriver driver)  {
		BrowserActions.click(driver, btnCreateNewProducer,"CreateNewProducer");
		return this;
	}
	public BuildingsAndLocationsPage enterBusIncomeHeader(WebDriver driver,String BusIncomeHeader) {
		BrowserActions.type(driver, inpBusIncomeHeader,BusIncomeHeader, "BusIncomeHeader");
		return this;
	}
	public BuildingsAndLocationsPage clickForms(WebDriver driver)  {
		BrowserActions.click(driver, btnForms,"Forms");
		return this;
	}
	public BuildingsAndLocationsPage clickPolicyPeriodSelector(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyPeriodSelector,"PolicyPeriodSelector");
		return this;
	}
	public BuildingsAndLocationsPage clickNewmail(WebDriver driver)  {
		BrowserActions.click(driver, btnNewmail,"Newmail");
		return this;
	}
	public BuildingsAndLocationsPage clickBlankets(WebDriver driver)  {
		BrowserActions.click(driver, btnBlankets,"Blankets");
		return this;
	}
	public BuildingsAndLocationsPage clickGetMotorVehicleReports(WebDriver driver)  {
		BrowserActions.click(driver, btnGetMotorVehicleReports,"GetMotorVehicleReports");
		return this;
	}
	public BuildingsAndLocationsPage clickQualification(WebDriver driver)  {
		BrowserActions.click(driver, btnQualification,"Qualification");
		return this;
	}
	public BuildingsAndLocationsPage clickNotes(WebDriver driver)  {
		BrowserActions.click(driver, btnNotes,"Notes");
		return this;
	}
	public BuildingsAndLocationsPage clickQuote_2(WebDriver driver)  {
		BrowserActions.click(driver, btnQuote_2,"Quote_2");
		return this;
	}
	public BuildingsAndLocationsPage clickCopyCoverages(WebDriver driver)  {
		BrowserActions.click(driver, btnCopyCoverages,"CopyCoverages");
		return this;
	}
	public BuildingsAndLocationsPage clickGetInspectionLossControl(WebDriver driver)  {
		BrowserActions.click(driver, btnGetInspectionLossControl,"GetInspectionLossControl");
		return this;
	}
	public BuildingsAndLocationsPage clickExport(WebDriver driver)  {
		BrowserActions.click(driver, btnExport,"Export");
		return this;
	}
	public BuildingsAndLocationsPage enterLocationName(WebDriver driver,String LocationName) {
		BrowserActions.type(driver, inpLocationName,LocationName, "LocationName");
		return this;
	}
	public BuildingsAndLocationsPage clickParticipants(WebDriver driver)  {
		BrowserActions.click(driver, btnParticipants,"Participants");
		return this;
	}
	public BuildingsAndLocationsPage clickCreate(WebDriver driver)  {
		BrowserActions.click(driver, btnCreate,"Create");
		return this;
	}
	public BuildingsAndLocationsPage clickReviewandapprove(WebDriver driver)  {
		BrowserActions.click(driver, btnReviewandapprove,"Reviewandapprove");
		return this;
	}
	public BuildingsAndLocationsPage selectEffectiveDate(WebDriver driver,String EffectiveDate)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpEffectiveDate,EffectiveDate,"EffectiveDate");
		return this;
	}
	public BuildingsAndLocationsPage enterActions(WebDriver driver,String Actions) {
		BrowserActions.type(driver, inpActions,Actions, "Actions");
		return this;
	}
	public BuildingsAndLocationsPage clickLegalreview(WebDriver driver)  {
		BrowserActions.click(driver, btnLegalreview,"Legalreview");
		return this;
	}
	public BuildingsAndLocationsPage clickNewDocument(WebDriver driver)  {
		BrowserActions.click(driver, btnNewDocument,"NewDocument");
		return this;
	}
	public BuildingsAndLocationsPage clickPolicynotification(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicynotification,"Policynotification");
		return this;
	}
	public BuildingsAndLocationsPage clickUploaddocuments(WebDriver driver)  {
		BrowserActions.click(driver, btnUploaddocuments,"Uploaddocuments");
		return this;
	}
	public BuildingsAndLocationsPage clickFinish(WebDriver driver)  {
		BrowserActions.click(driver, btnFinish,"Finish");
		return this;
	}
	public BuildingsAndLocationsPage clickGoto(WebDriver driver)  {
		BrowserActions.click(driver, btnGoto,"Goto");
		return this;
	}
	public BuildingsAndLocationsPage clickExistingBuilding(WebDriver driver)  {
		BrowserActions.click(driver, btnExistingBuilding,"ExistingBuilding");
		return this;
	}
	public BuildingsAndLocationsPage clickProductDefinition(WebDriver driver)  {
		BrowserActions.click(driver, btnProductDefinition,"ProductDefinition");
		return this;
	}
	public BuildingsAndLocationsPage clickGetInspectionOutsideService(WebDriver driver)  {
		BrowserActions.click(driver, btnGetInspectionOutsideService,"GetInspectionOutsideService");
		return this;
	}
	public BuildingsAndLocationsPage clickUnderwriterReview(WebDriver driver)  {
		BrowserActions.click(driver, btnUnderwriterReview,"UnderwriterReview");
		return this;
	}
	public BuildingsAndLocationsPage clickMeetwithInsured(WebDriver driver)  {
		BrowserActions.click(driver, btnMeetwithInsured,"MeetwithInsured");
		return this;
	}
	public BuildingsAndLocationsPage click30daydiary(WebDriver driver)  {
		BrowserActions.click(driver, btn30daydiary,"30daydiary");
		return this;
	}
	public BuildingsAndLocationsPage enterLastRiskAssessmentEvaluationHeader(WebDriver driver,String LastRiskAssessmentEvaluationHeader) {
		BrowserActions.type(driver, inpLastRiskAssessmentEvaluationHeader,LastRiskAssessmentEvaluationHeader, "LastRiskAssessmentEvaluationHeader");
		return this;
	}
	public BuildingsAndLocationsPage clickOfferings(WebDriver driver)  {
		BrowserActions.click(driver, btnOfferings,"Offerings");
		return this;
	}
	public BuildingsAndLocationsPage clickPolicyReviewRenewal(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyReviewRenewal,"PolicyReviewRenewal");
		return this;
	}
	public BuildingsAndLocationsPage clickMoreBuildings(WebDriver driver)  {
		BrowserActions.click(driver, btnMoreBuildings,"MoreBuildings");
		return this;
	}
	public BuildingsAndLocationsPage clickNewNote(WebDriver driver)  {
		BrowserActions.click(driver, btnNewNote,"NewNote");
		return this;
	}
	public BuildingsAndLocationsPage clickSidebySideQuoting(WebDriver driver)  {
		BrowserActions.click(driver, btnSidebySideQuoting,"SidebySideQuoting");
		return this;
	}
	public BuildingsAndLocationsPage clickRiskAnalysis(WebDriver driver)  {
		BrowserActions.click(driver, btnRiskAnalysis,"RiskAnalysis");
		return this;
	}
	public BuildingsAndLocationsPage clickMeetwithProducerAgency(WebDriver driver)  {
		BrowserActions.click(driver, btnMeetwithProducerAgency,"MeetwithProducerAgency");
		return this;
	}
	public BuildingsAndLocationsPage clickCollectCreditCard(WebDriver driver)  {
		BrowserActions.click(driver, btnCollectCreditCard,"CollectCreditCard");
		return this;
	}
	public BuildingsAndLocationsPage enterCoverageCurrency(WebDriver driver,String CoverageCurrency) {
		BrowserActions.type(driver, inpCoverageCurrency,CoverageCurrency, "CoverageCurrency");
		return this;
	}
	public BuildingsAndLocationsPage clickRatiooutofrange(WebDriver driver)  {
		BrowserActions.click(driver, btnRatiooutofrange,"Ratiooutofrange");
		return this;
	}
	public BuildingsAndLocationsPage clickFullApp(WebDriver driver)  {
		BrowserActions.click(driver, btnFullApp,"FullApp");
		return this;
	}
	public BuildingsAndLocationsPage clickPolicyReview(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyReview,"PolicyReview");
		return this;
	}
	public BuildingsAndLocationsPage clickSetasPrimary(WebDriver driver)  {
		BrowserActions.click(driver, btnSetasPrimary,"SetasPrimary");
		return this;
	}
	public BuildingsAndLocationsPage clickDiagnosticData(WebDriver driver)  {
		BrowserActions.click(driver, btnDiagnosticData,"DiagnosticData");
		return this;
	}
	public BuildingsAndLocationsPage clickOOSEPeriodSelector(WebDriver driver)  {
		BrowserActions.click(driver, btnOOSEPeriodSelector,"OOSEPeriodSelector");
		return this;
	}
	public BuildingsAndLocationsPage clickManuallyrateandquotepolicy(WebDriver driver)  {
		BrowserActions.click(driver, btnManuallyrateandquotepolicy,"Manuallyrateandquotepolicy");
		return this;
	}
	public BuildingsAndLocationsPage clickHistory(WebDriver driver)  {
		BrowserActions.click(driver, btnHistory,"History");
		return this;
	}
	public BuildingsAndLocationsPage clickReminder(WebDriver driver)  {
		BrowserActions.click(driver, btnReminder,"Reminder");
		return this;
	}
	public BuildingsAndLocationsPage clickEdit(WebDriver driver)  {
		BrowserActions.click(driver, btnEdit,"Edit");
		return this;
	}
	public BuildingsAndLocationsPage clickWithdrawTransaction(WebDriver driver)  {
		BrowserActions.click(driver, btnWithdrawTransaction,"WithdrawTransaction");
		return this;
	}
	public BuildingsAndLocationsPage clickPolicyInfo(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyInfo,"PolicyInfo");
		return this;
	}
	public BuildingsAndLocationsPage enterBuildingBPPHeader(WebDriver driver,String BuildingBPPHeader) {
		BrowserActions.type(driver, inpBuildingBPPHeader,BuildingBPPHeader, "BuildingBPPHeader");
		return this;
	}
	public BuildingsAndLocationsPage clickImport(WebDriver driver)  {
		BrowserActions.click(driver, btnImport,"Import");
		return this;
	}
	public BuildingsAndLocationsPage clickVersions(WebDriver driver)  {
		BrowserActions.click(driver, btnVersions,"Versions");
		return this;
	}
	public BuildingsAndLocationsPage clickModifiers(WebDriver driver)  {
		BrowserActions.click(driver, btnModifiers,"Modifiers");
		return this;
	}
	public BuildingsAndLocationsPage clickAccountFile(WebDriver driver)  {
		BrowserActions.click(driver, btnAccountFile,"AccountFile");
		return this;
	}
	public BuildingsAndLocationsPage clickReviewnewmail(WebDriver driver)  {
		BrowserActions.click(driver, btnReviewnewmail,"Reviewnewmail");
		return this;
	}
	public BuildingsAndLocationsPage clickGroup(WebDriver driver)  {
		BrowserActions.click(driver, btnGroup,"Group");
		return this;
	}
	public BuildingsAndLocationsPage clickCancelasplitpolicy(WebDriver driver)  {
		BrowserActions.click(driver, btnCancelasplitpolicy,"Cancelasplitpolicy");
		return this;
	}
	public BuildingsAndLocationsPage clickGetAuditOutsideService(WebDriver driver)  {
		BrowserActions.click(driver, btnGetAuditOutsideService,"GetAuditOutsideService");
		return this;
	}
	public BuildingsAndLocationsPage clickCopyData(WebDriver driver)  {
		BrowserActions.click(driver, btnCopyData,"CopyData");
		return this;
	}
	public BuildingsAndLocationsPage clickNewBuilding(WebDriver driver)  {
		BrowserActions.click(driver, btnNewBuilding,"NewBuilding");
		return this;
	}
	public BuildingsAndLocationsPage clickNewAuditAssignment(WebDriver driver)  {
		BrowserActions.click(driver, btnNewAuditAssignment,"NewAuditAssignment");
		return this;
	}
	public BuildingsAndLocationsPage clickRewritetoNewAccount(WebDriver driver)  {
		BrowserActions.click(driver, btnRewritetoNewAccount,"RewritetoNewAccount");
		return this;
	}
	public BuildingsAndLocationsPage clickClose(WebDriver driver)  {
		BrowserActions.click(driver, btnClose,"Close");
		return this;
	}
	public BuildingsAndLocationsPage clickReview30dayUWPeriod(WebDriver driver)  {
		BrowserActions.click(driver, btnReview30dayUWPeriod,"Review30dayUWPeriod");
		return this;
	}
	public BuildingsAndLocationsPage clickPolicyVersions(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyVersions,"PolicyVersions");
		return this;
	}
	public BuildingsAndLocationsPage clickReview60dayUWPeriod(WebDriver driver)  {
		BrowserActions.click(driver, btnReview60dayUWPeriod,"Review60dayUWPeriod");
		return this;
	}
	public BuildingsAndLocationsPage clickEditPolicyTransaction(WebDriver driver)  {
		BrowserActions.click(driver, btnEditPolicyTransaction,"EditPolicyTransaction");
		return this;
	}
	public BuildingsAndLocationsPage enterBuildingDescHeader(WebDriver driver,String BuildingDescHeader) {
		BrowserActions.type(driver, inpBuildingDescHeader,BuildingDescHeader, "BuildingDescHeader");
		return this;
	}
	public BuildingsAndLocationsPage clickNewActivity(WebDriver driver)  {
		BrowserActions.click(driver, btnNewActivity,"NewActivity");
		return this;
	}
	public BuildingsAndLocationsPage enterActionsHeader(WebDriver driver,String ActionsHeader) {
		BrowserActions.type(driver, inpActionsHeader,ActionsHeader, "ActionsHeader");
		return this;
	}
	public BuildingsAndLocationsPage clickCancel(WebDriver driver)  {
		BrowserActions.click(driver, btnCancel,"Cancel");
		return this;
	}
	public BuildingsAndLocationsPage clickCloseOptions(WebDriver driver)  {
		BrowserActions.click(driver, btnCloseOptions,"CloseOptions");
		return this;
	}
	public BuildingsAndLocationsPage clickPolicyContract(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyContract,"PolicyContract");
		return this;
	}
	public BuildingsAndLocationsPage clickPolicyFile(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyFile,"PolicyFile");
		return this;
	}
	public BuildingsAndLocationsPage enterBuildingLimitHeader(WebDriver driver,String BuildingLimitHeader) {
		BrowserActions.type(driver, inpBuildingLimitHeader,BuildingLimitHeader, "BuildingLimitHeader");
		return this;
	}
	public BuildingsAndLocationsPage clickVerifycoverage(WebDriver driver)  {
		BrowserActions.click(driver, btnVerifycoverage,"Verifycoverage");
		return this;
	}
	public BuildingsAndLocationsPage clickRequest(WebDriver driver)  {
		BrowserActions.click(driver, btnRequest,"Request");
		return this;
	}
	public BuildingsAndLocationsPage clickGetCreditReports(WebDriver driver)  {
		BrowserActions.click(driver, btnGetCreditReports,"GetCreditReports");
		return this;
	}
	public BuildingsAndLocationsPage clickDecline(WebDriver driver)  {
		BrowserActions.click(driver, btnDecline,"Decline");
		return this;
	}
	public BuildingsAndLocationsPage clickWizardMenuActions(WebDriver driver)  {
		BrowserActions.click(driver, btnWizardMenuActions,"WizardMenuActions");
		return this;
	}
	public BuildingsAndLocationsPage clickSubManager(WebDriver driver)  {
		BrowserActions.click(driver, btnSubManager,"SubManager");
		return this;
	}





	/**
	 * Clicks on Add Building
	 * @author vignesh.ravi
	 * @param driver,elementPosition
	 * @return 
	 */
	public BuildingsAndLocationsPage clickAddBuilding(WebDriver driver,String elementPosition)  {
		By addBuildingBy=By.xpath(btnAddBuilding+"["+elementPosition+"]");
		BrowserActions.waitForElementToDisplay(driver, addBuildingBy, "Add Building");
		WebElement element = addBuildingBy.findElement(driver);
		BrowserActions.click(driver,element, "Add building button");//moveToElement
		return this;
	}

	/**
	 * Clicks on  drop down
	 * @author vignesh.ravi
	 * @param driver
	 * @return BuildingsAndLocationsPage
	 */
	public BuildingsAndLocationsPage clickAddBuildingDropdown(WebDriver driver,int noOfBuilding)  {	
		BrowserActions.waitForElementToDisplay(driver, btnBuildingDropdown);
		String buildingsCount = btnBuildingsMenu.replaceAll("\\{INDEX\\}",""+(noOfBuilding-1));	
		By buildingsCountby= By.xpath(buildingsCount);
		BrowserActions.waitForElementToDisplay(driver, buildingsCountby, "Buildings Count");
		WebElement buildingCount = buildingsCountby.findElement(driver);
		BrowserActions.click(driver, buildingCount,true,"Add Building dropdown");
		return new BuildingsAndLocationsPage(driver).get();
	}

	/**
	 * Clicks on Add Building
	 * @author vignesh.ravi
	 * @param driver,elementPosition
	 * @return BuildingsAndLocationsPage 
	 */
	public BuildingsAndLocationsPage mouseOverAddBuilding(WebDriver driver,int noOfBuilding)  {
		String addBuilding = btnAddBuilding.replaceAll("\\{INDEX\\}",""+(noOfBuilding-1));
		By addBuildingby= By.xpath(addBuilding);
		BrowserActions.waitForElementToDisplay(driver, addBuildingby, "Add Building");
		WebElement addBuildinglink = addBuildingby.findElement(driver);
		BrowserActions.moveToElement(driver, addBuildinglink,"Add Building");
		return new BuildingsAndLocationsPage(driver).get();
	}

	/**
	 * Add new Building
	 * @author vignesh.ravi
	 * @param driver
	 * @return BuildingsAndLocationsPage
	 */
		public BuildingsAndLocationsPage clickNewBuildings(WebDriver driver,int noOfBuilding)  {
			String newbuilding = btnAddNewBuilding.replaceAll("\\{INDEX\\}",""+(noOfBuilding-1));
			By newBuildingBy = By.xpath(newbuilding);
			BrowserActions.waitForElementToDisplay(driver, newBuildingBy, "New Building");
			WebElement lnkAddNewBuilding= newBuildingBy.findElement(driver);
			BrowserActions.click(driver, lnkAddNewBuilding,true,"Add New Building");
			return this;
			
		}
		

	public BuildingsAndLocationsPage enterIncomeLimitNotMfgorRental(WebDriver driver,String IncomeLimitNotMfgorRental) {
		BrowserActions.type(driver, inpIncomeLimitNotMfgorRental,IncomeLimitNotMfgorRental, "IncomeLimitNotMfgorRental");
		return this;
	}
	/**
	 * Used to Click on Ok button
	 * @author vignesh.ravi
	 * @param driver
	 * @return
	 * @
	 */
	public void clickOK(WebDriver driver)  {
		BrowserActions.click(driver, btnOk,"Ok button");
	}


	public class LocationInformationPage extends LoadableComponent<LocationInformationPage> {

		WebDriver driver;
		private boolean isPageLoaded;
		public ElementLayer elementLayer;
		String elementObject;
		HashMap<String, String> getPageObjects;
		public List<Object> pageFactoryKey = new ArrayList<Object>();
		public List<String> pageFactoryValue = new ArrayList<String>();

		//  TopNavBar objectf
		//	public TopNavBar topnavbar;
		@IFindBy(how = How.CSS, using = "#CPLocationPopup-RiskAssessmentPanelSet-LocationSpotlightDV-LastRiskAssessmentIsStaleIcon", AI = false)
		public WebElement btnLastRiskAssessmentIsStaleIcon;

		@IFindBy(how = How.CSS, using = "#CPLocationPopup-RiskAssessmentPanelSet-LocationSpotlightDV-LastRiskAssessmentEvaluation", AI = false)
		public WebElement btnLastRiskAssessmentEvaluation;

		@IFindBy(how = How.CSS, using = "#CPLocationPopup-LocationDetailDV-LocationDetailInputSet-TargetedAddressInputSet-globalAddressContainer-GlobalAddressInputSet-PostalCode-AutoFillIcon", AI = false)
		public WebElement btnAutoFillIcon_1;

		@IFindBy(how = How.CSS, using = "input[name='CPLocationPopup-LocationDetailDV-LocationDetailInputSet-TargetedAddressInputSet-globalAddressContainer-GlobalAddressInputSet-County']", AI = false)
		public WebElement inpCounty;

		@IFindBy(how = How.CSS, using = "input[name='CPLocationPopup-LocationDetailDV-LocationDetailInputSet-LocationCode']", AI = false)
		public WebElement inpLocationCode;

		@IFindBy(how = How.CSS, using = "input[name='CPLocationPopup-RiskAssessmentPanelSet-LocationSpotlightDV-Latitude']", AI = false)
		public WebElement inpLatitude;

		@IFindBy(how = How.CSS, using = "select[name='CPLocationPopup-LocationDetailDV-LocationDetailInputSet-UnsyncedAddressInputSet-UnsyncedCountry']", AI = false)
		public WebElement drpCountry_4;

		@IFindBy(how = How.CSS, using = "input[name='CPLocationPopup-LocationDetailDV-LocationDetailInputSet-UnsyncedAddressInputSet-unsyncedAddressString']", AI = false)
		public WebElement inpAddress_2;

		@IFindBy(how = How.CSS, using = "input[name='CPLocationPopup-LocationDetailDV-LocationDetailInputSet-Phone-GlobalPhoneInputSet-Extension']", AI = false)
		public WebElement inpPhoneExtension;

		@IFindBy(how = How.CSS, using = "#CPLocationPopup-RiskAssessmentPanelSet-RiskAssessmentDetailsPanelSet-RiskAssessmentDetail_DV-showHideRiskAssessmentDetailsButton", AI = false)
		public WebElement btnShow;

		@IFindBy(how = How.CSS, using = "input[name='CPLocationPopup-LocationDetailDV-LocationDetailInputSet-TargetedAddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine3']", AI = false)
		public WebElement inpAddress3;

		@IFindBy(how = How.CSS, using = "input[name='CPLocationPopup-LocationDetailDV-LocationDetailInputSet-TargetedAddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine1']", AI = false)
		public WebElement inpAddress1;

		@IFindBy(how = How.CSS, using = "input[name='CPLocationPopup-LocationDetailDV-LocationDetailInputSet-TargetedAddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine2']", AI = false)
		public WebElement inpAddress2;

		@IFindBy(how = How.CSS, using = "input[name='CPLocationPopup-LocationDetailDV-LocationDetailInputSet-TargetedAddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressSummary']", AI = false)
		public WebElement inpAddress;

		@IFindBy(how = How.CSS, using = "input[name='CPLocationPopup-LocationDetailDV-LocationDetailInputSet-TargetedAddressInputSet-globalAddressContainer-GlobalAddressInputSet-PostalCode']", AI = false)
		public WebElement inpZIPCode;

		@IFindBy(how = How.CSS, using = "#CPLocationPopup-RiskAssessmentPanelSet-LocationSpotlightDV-EvaluationDateSpacer", AI = false)
		public WebElement btnEvaluationDateSpacer;

		@IFindBy(how = How.CSS, using = "#CPLocationPopup-LocationDetailDV-LocationDetailInputSet-TargetedAddressInputSet-globalAddressContainer-GlobalAddressInputSet-City-AutoFillIcon", AI = false)
		public WebElement btnAutoFillIcon;

		@IFindBy(how = How.CSS, using = "select[name='CPLocationPopup-PreferredCoverageCurrencySelectorRef-PreferredCoverageCurrencyPanelSet-PreferredCoverageCurrencySelectorDropDown']", AI = false)
		public WebElement drpCoveragesin;

		@IFindBy(how = How.CSS, using = "select[name='CPLocationPopup-LocationDetailDV-LocationDetailInputSet-TargetedAddressInputSet-globalAddressContainer-GlobalAddressInputSet-Country']", AI = false)
		public WebElement drpCountry;

		@IFindBy(how = How.CSS, using = "select[name='CPLocationPopup-LocationDetailDV-LocationDetailInputSet-TargetedAddressInputSet-globalAddressContainer-GlobalAddressInputSet-State']", AI = false)
		public WebElement drpState;

		@IFindBy(how = How.CSS, using = "input[name='CPLocationPopup-LocationDetailDV-LocationDetailInputSet-UnsyncedAddressInputSet-UnsyncedCounty']", AI = false)
		public WebElement inpCounty_3;

		@IFindBy(how = How.CSS, using = "#CPLocationPopup-LocationDetailDV-LocationDetailInputSet-TerritoryCodeInputSet-AutofillLink", AI = false)
		public WebElement btnAutofillTerritoryCodes;

		@IFindBy(how = How.CSS, using = "input[name='CPLocationPopup-LocationDetailDV-LocationDetailInputSet-LocationName']", AI = false)
		public WebElement inpLocationName;

		@IFindBy(how = How.CSS, using = "input[name='CPLocationPopup-LocationDetailDV-LocationDetailInputSet-TaxLocation']", AI = false)
		public WebElement inpTaxLocation;

		@IFindBy(how = How.CSS, using = "select[name='CPLocationPopup-LocationDetailDV-FireProtectionClass']", AI = false)
		public WebElement drpFireProtection;

		@IFindBy(how = How.CSS, using = "input[name='CPLocationPopup-LocationDetailDV-LocationDetailInputSet-TargetedAddressInputSet-globalAddressContainer-GlobalAddressInputSet-City']", AI = false)
		public WebElement inpCity;

		@IFindBy(how = How.CSS, using = "input[name='CPLocationPopup-RiskAssessmentPanelSet-LocationSpotlightDV-SpotlightFloodRisk']", AI = false)
		public WebElement inpFloodRisk;

		@IFindBy(how = How.CSS, using = "#CPLocationPopup-RiskAssessmentPanelSet-LocationSpotlightDV-ViewInSpotlightLink", AI = false)
		public WebElement btnEvaluateinSpotlight;

		@IFindBy(how = How.CSS, using = "#CPLocationPopup-Update>div[role='button']", AI = false)
		public WebElement btnOK;

		@IFindBy(how = How.CSS, using = "#CPLocationPopup-LocationDetailDV-LocationDetailInputSet-TaxLocation-SelectTaxLocation", AI = false)
		public WebElement btnSearch;

		@IFindBy(how = How.CSS, using = "#CPLocationPopup-LocationDetailDV-RefreshThumbnailMapLink", AI = false)
		public WebElement btnUpdateMap;

		@IFindBy(how = How.CSS, using = "input[name='CPLocationPopup-RiskAssessmentPanelSet-LocationSpotlightDV-SpotlightFloodScore']", AI = false)
		public WebElement inpDistancetoFloodZone;

		@IFindBy(how = How.CSS, using = "select[name='CPLocationPopup-LocationDetailDV-LocationDetailInputSet-Phone-GlobalPhoneInputSet-CountryCode']", AI = false)
		public WebElement drpPhoneRegionCode;

		@IFindBy(how = How.CSS, using = "input[name='CPLocationPopup-LocationDetailDV-LocationDetailInputSet-Phone-GlobalPhoneInputSet-NationalSubscriberNumber']", AI = false)
		public WebElement inpPhone;

		@IFindBy(how = How.CSS, using = "#CPLocationPopup-__crumb__", AI = false)
		public WebElement btnReturntoBuildingsandLocations;

		@IFindBy(how = How.CSS, using = "#CPLocationPopup-ttlBar", AI = false)
		public WebElement lblTtlBar;

		@IFindBy(how = How.CSS, using = "#CPLocationPopup-Edit>div[role='button']", AI = false)
		public WebElement btnEdit;

		@IFindBy(how = How.CSS, using = "#CPLocationPopup-AccountLocationUpToDateDV-SynchronizedLink", AI = false)
		public WebElement btnViewCurrentLocation;

		@IFindBy(how = How.CSS, using = "#CPLocationPopup-LocationDetailDV-LocationDetailInputSet-TerritoryCodeInputSet-0-TerritoryCode-SelectTerritoryCode", AI = false)
		public WebElement btnSearch_6;

		@IFindBy(how = How.CSS, using = "#CPLocationPopup-LocationDetailDV-PrincipleOps textarea", AI = false)
		public WebElement inpPrincipalOperationsOccupancy;

		@IFindBy(how = How.CSS, using = "input[name='CPLocationPopup-RiskAssessmentPanelSet-LocationSpotlightDV-Longitude']", AI = false)
		public WebElement inpLongitude;

		@IFindBy(how = How.CSS, using = "input[name='CPLocationPopup-RiskAssessmentPanelSet-AcceptRejectCheckbox']", AI = false)
		public WebElement chkSpotlightreturnednewdata;

		@IFindBy(how = How.CSS, using = "#CPLocationPopup-Cancel>div[role='button']", AI = false)
		public WebElement btnCancel;

		@IFindBy(how = How.CSS, using = "input[name='CPLocationPopup-PreferredCoverageCurrencySelectorRef-PreferredCoverageCurrencyPanelSet-CoverageCurrencyDisplay']", AI = false)
		public WebElement inpCoveragesin;

		@IFindBy(how = How.CSS, using = "input[name='CPLocationPopup-LocationDetailDV-LocationDetailInputSet-Phone-GlobalPhoneInputSet-PhoneDisplay']", AI = false)
		public WebElement inpPhone_5;

		@IFindBy(how = How.CSS, using = "input[name='CPLocationPopup-LocationDetailDV-LocationDetailInputSet-NonSpecificLocation']", AI = false)
		public WebElement rdbNonSpecificLocation;

		@IFindBy(how = How.CSS, using = "input[name='CPLocationPopup-LocationDetailDV-LocationDetailInputSet-TerritoryCodeInputSet-0-TerritoryCode']", AI = false)
		public WebElement inpTerritoryCode;

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
		}public LocationInformationPage clickLastRiskAssessmentIsStaleIcon(WebDriver driver)  {
			BrowserActions.click(driver, btnLastRiskAssessmentIsStaleIcon,"LastRiskAssessmentIsStaleIcon");
			return this;
		}
		public LocationInformationPage clickLastRiskAssessmentEvaluation(WebDriver driver)  {
			BrowserActions.click(driver, btnLastRiskAssessmentEvaluation,"LastRiskAssessmentEvaluation");
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
		public LocationInformationPage enterLatitude(WebDriver driver,String Latitude) {
			BrowserActions.type(driver, inpLatitude,Latitude, "Latitude");
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
		public LocationInformationPage enterPhoneExtension(WebDriver driver,String PhoneExtension) {
			BrowserActions.type(driver, inpPhoneExtension,PhoneExtension, "PhoneExtension");
			return this;
		}
		public LocationInformationPage clickShow(WebDriver driver)  {
			BrowserActions.click(driver, btnShow,"Show");
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
		public LocationInformationPage enterZIPCode(WebDriver driver,String ZIPCode) {
			BrowserActions.type(driver, inpZIPCode,ZIPCode, "ZIPCode");
			return this;
		}
		public LocationInformationPage clickEvaluationDateSpacer(WebDriver driver)  {
			BrowserActions.click(driver, btnEvaluationDateSpacer,"EvaluationDateSpacer");
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
		public LocationInformationPage selectCountry(WebDriver driver,String Country)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpCountry,Country,"Country");
			return this;
		}
		public LocationInformationPage selectState(WebDriver driver,String State)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpState,State,true,"State");
			return this;
		}
		public LocationInformationPage enterCounty_3(WebDriver driver,String County_3) {
			BrowserActions.type(driver, inpCounty_3,County_3, "County_3");
			return this;
		}
		public LocationInformationPage clickAutofillTerritoryCodes(WebDriver driver)  {
			BrowserActions.click(driver, btnAutofillTerritoryCodes,true,"AutofillTerritoryCodes");
			return this;
		}
		public LocationInformationPage enterLocationName(WebDriver driver,String LocationName) {
			BrowserActions.type(driver, inpLocationName,LocationName, "LocationName");
			return this;
		}
		public LocationInformationPage enterTaxLocation(WebDriver driver,String TaxLocation) {
			BrowserActions.type(driver, inpTaxLocation,TaxLocation, "TaxLocation");
			return this;
		}
		public LocationInformationPage selectFireProtection(WebDriver driver,String FireProtection)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpFireProtection,FireProtection,"FireProtection");
			return this;
		}
		public LocationInformationPage enterCity(WebDriver driver,String City) {
			BrowserActions.type(driver, inpCity,City,true,"City");
			return this;
		}
		public LocationInformationPage enterFloodRisk(WebDriver driver,String FloodRisk) {
			BrowserActions.type(driver, inpFloodRisk,FloodRisk, "FloodRisk");
			return this;
		}
		public LocationInformationPage clickEvaluateinSpotlight(WebDriver driver)  {
			BrowserActions.click(driver, btnEvaluateinSpotlight,"EvaluateinSpotlight");
			return this;
		}
		public LocationInformationPage clickOK(WebDriver driver)  {
			BrowserActions.click(driver, btnOK,"OK");
			return this;
		}
		public LocationInformationPage clickSearch(WebDriver driver)  {
			BrowserActions.click(driver, btnSearch,"Search");
			return this;
		}
		public LocationInformationPage clickUpdateMap(WebDriver driver)  {
			BrowserActions.click(driver, btnUpdateMap,"UpdateMap");
			return this;
		}
		public LocationInformationPage enterDistancetoFloodZone(WebDriver driver,String DistancetoFloodZone) {
			BrowserActions.type(driver, inpDistancetoFloodZone,DistancetoFloodZone, "DistancetoFloodZone");
			return this;
		}
		public LocationInformationPage selectPhoneRegionCode(WebDriver driver,String PhoneRegionCode)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpPhoneRegionCode,PhoneRegionCode,"PhoneRegionCode");
			return this;
		}
		public LocationInformationPage enterPhone(WebDriver driver,String Phone) {
			BrowserActions.type(driver, inpPhone,Phone, "Phone");
			return this;
		}
		public LocationInformationPage clickReturntoBuildingsandLocations(WebDriver driver)  {
			BrowserActions.click(driver, btnReturntoBuildingsandLocations,"ReturntoBuildingsandLocations");
			return this;
		}
		public LocationInformationPage clickEdit(WebDriver driver)  {
			BrowserActions.click(driver, btnEdit,"Edit");
			return this;
		}
		public LocationInformationPage clickViewCurrentLocation(WebDriver driver)  {
			BrowserActions.click(driver, btnViewCurrentLocation,"ViewCurrentLocation");
			return this;
		}
		public LocationInformationPage clickSearch_6(WebDriver driver)  {
			BrowserActions.click(driver, btnSearch_6,"Search_6");
			return this;
		}
		public LocationInformationPage enterPrincipalOperationsOccupancy(WebDriver driver,String PrincipalOperationsOccupancy) {
			BrowserActions.type(driver, inpPrincipalOperationsOccupancy,PrincipalOperationsOccupancy, "PrincipalOperationsOccupancy");
			return this;
		}
		public LocationInformationPage enterLongitude(WebDriver driver,String Longitude) {
			BrowserActions.type(driver, inpLongitude,Longitude, "Longitude");
			return this;
		}
		public LocationInformationPage clickSpotlightreturnednewdata(WebDriver driver)  {
			BrowserActions.click(driver, chkSpotlightreturnednewdata,"Spotlightreturnednewdata");
			return this;
		}
		public LocationInformationPage clickCancel(WebDriver driver)  {
			BrowserActions.click(driver, btnCancel,"Cancel");
			return this;
		}
		public LocationInformationPage enterCoveragesin(WebDriver driver,String Coveragesin) {
			BrowserActions.type(driver, inpCoveragesin,Coveragesin, "Coveragesin");
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


		public class NewBuildingPage extends LoadableComponent<NewBuildingPage> {

			WebDriver driver;
			private boolean isPageLoaded;
			public ElementLayer elementLayer;
			String elementObject;
			HashMap<String, String> getPageObjects;
			public List<Object> pageFactoryKey = new ArrayList<Object>();
			public List<String> pageFactoryValue = new ArrayList<String>();

			//TopNavBar object
			//	public TopNavBar topnavbar;
			@IFindBy(how = How.CSS, using = "select[name='CPBuildingPopup-DetailsDV-AlarmInfoInputGroup-AlarmType']", AI = false)
			public WebElement drpAlarmType;

			@IFindBy(how = How.CSS, using = "input[name='CPBuildingPopup-CPBldgSuggestedCovDV-IncomeAndExpenseIterator-0-CoverageInputSet-CovPatternInputGroup-0-CovTermInputSet-CovTermDirectInputSet-DirectTermInput']", AI = false)
			public WebElement inpIncomeLimitNotMfgorRental;

			@IFindBy(how = How.CSS, using = "input[name='CPBuildingPopup-DetailsDV-LastUpdatePlumbing']", AI = false)
			public WebElement inpYearofLastUpdatePlumbing;

			@IFindBy(how = How.CSS, using = "#CPBuildingPopup-AdditionalInterestDetailsDV-AdditionalInterestLV_tb-AddContactsButton-AddOtherContact-0-acctContact>div[role='button']", AI = false)
			public WebElement btnLennySchuppe;

			@IFindBy(how = How.CSS, using = "#CPBuildingPopup-AdditionalInterestDetailsDV-AdditionalInterestLV_tb-AddContactsButton-AddFromSearch>div[role='button']", AI = false)
			public WebElement btnFromAddressBook;

			@IFindBy(how = How.CSS, using = "#CPBuildingPopup-DetailsDV-ClassDescription textarea", AI = false)
			public WebElement inpPropertyClassDescription;

			@IFindBy(how = How.CSS, using = "input[name='CPBuildingPopup-CPBldgSuggestedCovDV-IncomeAndExpenseIterator-0-CoverageInputSet-CovPatternInputGroup-1-CovTermInputSet-CovTermDirectInputSet-DirectTermInput']", AI = false)
			public WebElement inpIncomeLimitMfgOnly;

			@IFindBy(how = How.CSS, using = "select[name='CPBuildingPopup-DetailsDV-PercentVacant']", AI = false)
			public WebElement drpVacant;

			@IFindBy(how = How.CSS, using = "input[name='CPBuildingPopup-DetailsDV-YearBuilt']", AI = false)
			public WebElement inpYearBuilt;

			@IFindBy(how = How.CSS, using = "select[name='CPBuildingPopup-CPBldgSuggestedCovDV-IncomeAndExpenseIterator-1-CoverageInputSet-CovPatternInputGroup-1-CovTermInputSet-PackageTermInput']", AI = false)
			public WebElement drpMonthlyLimit;

			@IFindBy(how = How.CSS, using = "input[name='CPBuildingPopup-DetailsDV-NumBasements']", AI = false)
			public WebElement inpOfBasements;

			@IFindBy(how = How.CSS, using = "input[name='CPBuildingPopup-DetailsDV-ClassCode']", AI = false)
			public WebElement inpPropertyClassCode;

			@IFindBy(how = How.CSS, using = "select[name='CPBuildingPopup-CPBldgSuggestedCovDV-bldgAndPropIterator-0-CoverageInputSet-CovPatternInputGroup-CPBldgCovValuationMethod']", AI = false)
			public WebElement drpValuationMethod;

			@IFindBy(how = How.CSS, using = "#CPBuildingPopup-BuildingCoveragesTab", AI = false)
			public WebElement btnCoverages;

			@IFindBy(how = How.CSS, using = "select[name='CPBuildingPopup-CPBldgSuggestedCovDV-bldgAndPropIterator-0-CoverageInputSet-CovPatternInputGroup-CPBldgCovCoinsurance']", AI = false)
			public WebElement drpCoinsurance;

			@IFindBy(how = How.CSS, using = "input[name='CPBuildingPopup-DetailsDV-LastUpdateWiring']", AI = false)
			public WebElement inpYearofLastUpdateWiring;

			@IFindBy(how = How.CSS, using = "select[name='CPBuildingPopup-CPBldgSuggestedCovDV-bldgAndPropIterator-1-CoverageInputSet-CovPatternInputGroup-CPBPPValuationMethod']", AI = false)
			public WebElement drpValuationMethod_7;

			@IFindBy(how = How.CSS, using = "#CPBuildingPopup-AdditionalInterestDetailsDV-AdditionalInterestLV_tb-AddContactsButton-1-ContactType>div[role='button']", AI = false)
			public WebElement btnNewPerson;

			@IFindBy(how = How.CSS, using = "select[name='CPBuildingPopup-CPBldgSuggestedCovDV-bldgAndPropIterator-0-CoverageInputSet-CovPatternInputGroup-CPBldgCovAutoIncrease']", AI = false)
			public WebElement drpAutoIncrease;

			@IFindBy(how = How.CSS, using = "select[name='CPBuildingPopup-CPBldgSuggestedCovDV-IncomeAndExpenseIterator-0-CoverageInputSet-CovPatternInputGroup-4-CovTermInputSet-OptionTermInput']", AI = false)
			public WebElement drpCoinsurance_10;

			@IFindBy(how = How.CSS, using = "select[name='CPBuildingPopup-DetailsDV-BurglarySafeguard']", AI = false)
			public WebElement drpBurglarySafeguard;

			@IFindBy(how = How.CSS, using = "input[name='CPBuildingPopup-CPBldgSuggestedCovDV-bldgAndPropIterator-0-CoverageInputSet-CovPatternInputGroup-CPBldgCovExcludeVandalism']", AI = false)
			public WebElement rdbExcludeVandalism;

			@IFindBy(how = How.CSS, using = "input[name='CPBuildingPopup-DetailsDV-BuildingNumber']", AI = false)
			public WebElement inpBuildingNumber;

			@IFindBy(how = How.CSS, using = "input[name='CPBuildingPopup-DetailsDV-RearExposure']", AI = false)
			public WebElement inpRearExposure;

			@IFindBy(how = How.CSS, using = "input[name='CPBuildingPopup-DetailsDV-LeftExposure']", AI = false)
			public WebElement inpLeftExposure;

			@IFindBy(how = How.CSS, using = "select[name='CPBuildingPopup-DetailsDV-BuildingLocation']", AI = false)
			public WebElement drpLocation;

			@IFindBy(how = How.CSS, using = "input[name='CPBuildingPopup-DetailsDV-LastUpdateHeating']", AI = false)
			public WebElement inpYearofLastUpdateHeating;

			@IFindBy(how = How.CSS, using = "input[name='CPBuildingPopup-CPBldgSuggestedCovDV-bldgAndPropIterator-0-CoverageInputSet-CovPatternInputGroup-CPBldgCovLimit-CovTermDirectInputSet-DirectTermInput']", AI = false)
			public WebElement inpLimit;

			@IFindBy(how = How.CSS, using = "select[name='CPBuildingPopup-CPBldgSuggestedCovDV-bldgAndPropIterator-0-CoverageInputSet-CovPatternInputGroup-CPBldgCovCauseOfLoss']", AI = false)
			public WebElement drpCauseOfLoss;

			@IFindBy(how = How.CSS, using = "select[name='CPBuildingPopup-CPBldgSuggestedCovDV-bldgAndPropIterator-0-CoverageInputSet-CovPatternInputGroup-CPBldgCovDeductible']", AI = false)
			public WebElement drpDeductible;

			@IFindBy(how = How.CSS, using = "select[name='CPBuildingPopup-PreferredCoverageCurrencySelectorRef-PreferredCoverageCurrencyPanelSet-PreferredCoverageCurrencySelectorDropDown']", AI = false)
			public WebElement drpCoveragesin;

			@IFindBy(how = How.CSS, using = "#CPBuildingPopup-BuildingAddlInterestTab", AI = false)
			public WebElement btnAdditionalInterest;

			@IFindBy(how = How.CSS, using = "#CPBuildingPopup-AdditionalInterestDetailsDV-AdditionalInterestLV_tb-AddContactsButton-AddOtherContact>div[role='button']", AI = false)
			public WebElement btnOtherContacts;

			@IFindBy(how = How.CSS, using = "input[name='CPBuildingPopup-CPBldgSuggestedCovDV-bldgAndPropIterator-1-CoverageInputSet-CovPatternInputGroup-CPBPPCovExcludeVandalism']", AI = false)
			public WebElement rdbExcludeVandalism_3;

			@IFindBy(how = How.CSS, using = "input[name='CPBuildingPopup-CPBldgSuggestedCovDV-IncomeAndExpenseIterator-1-CoverageInputSet-CovPatternInputGroup-_checkbox']", AI = false)
			public WebElement chkExtraExpenseCoverage;

			@IFindBy(how = How.CSS, using = "select[name='CPBuildingPopup-DetailsDV-PercentSprinklered']", AI = false)
			public WebElement drpSprinklered;

			@IFindBy(how = How.CSS, using = "select[name='CPBuildingPopup-DetailsDV-AlarmInfoInputGroup-AlarmClass']", AI = false)
			public WebElement drpAlarmClass;

			@IFindBy(how = How.CSS, using = "input[name='CPBuildingPopup-CPBldgSuggestedCovDV-bldgAndPropIterator-1-CoverageInputSet-CovPatternInputGroup-CPBPPCovExcludeTheft']", AI = false)
			public WebElement rdbCPBPPCovExcludeTheft;

			@IFindBy(how = How.CSS, using = "input[name='CPBuildingPopup-CPBldgSuggestedCovDV-bldgAndPropIterator-1-CoverageInputSet-CovPatternInputGroup-_checkbox']", AI = false)
			public WebElement chk_checkbox;

			@IFindBy(how = How.CSS, using = "select[name='CPBuildingPopup-DetailsDV-RentedOthers']", AI = false)
			public WebElement drpRentedToOthers;

			@IFindBy(how = How.CSS, using = "#CPBuildingPopup-AdditionalInterestDetailsDV-AdditionalInterestLV_tb-AddContactsButton>div[role='button']", AI = false)
			public WebElement btnAdd;

			@IFindBy(how = How.CSS, using = "input[name='CPBuildingPopup-CPBldgSuggestedCovDV-bldgAndPropIterator-0-CoverageInputSet-CovPatternInputGroup-CPBldgCovExcludeSprinkler']", AI = false)
			public WebElement rdbExcludeSprinkler;

			@IFindBy(how = How.CSS, using = "input[name='CPBuildingPopup-CPBldgSuggestedCovDV-bldgAndPropIterator-0-CoverageInputSet-CovPatternInputGroup-CPBldgCovExcludeTheft']", AI = false)
			public WebElement rdbCPBldgCovExcludeTheft;

			@IFindBy(how = How.CSS, using = "input[name='CPBuildingPopup-CPBldgSuggestedCovDV-bldgAndPropIterator-1-CoverageInputSet-CovPatternInputGroup-CPBPPCovLimit-CovTermDirectInputSet-DirectTermInput']", AI = false)
			public WebElement inpLimit_1;

			@IFindBy(how = How.CSS, using = "input[name='CPBuildingPopup-DetailsDV-AlarmInfoInputGroup-AlarmExpiration']", AI = false)
			public WebElement inpAlarmExpiration;

			@IFindBy(how = How.CSS, using = "input[name='CPBuildingPopup-DetailsDV-TotalArea']", AI = false)
			public WebElement inpTotalAreaexclbasement;

			@IFindBy(how = How.CSS, using = "input[name='CPBuildingPopup-CPBldgSuggestedCovDV-IncomeAndExpenseIterator-0-CoverageInputSet-CovPatternInputGroup-_checkbox']", AI = false)
			public WebElement chkBusinessIncomeCoverage;

			@IFindBy(how = How.CSS, using = "input[name='CPBuildingPopup-DetailsDV-Description']", AI = false)
			public WebElement inpDescription;

			@IFindBy(how = How.CSS, using = "select[name='CPBuildingPopup-DetailsDV-WindRating']", AI = false)
			public WebElement drpWindRating;

			@IFindBy(how = How.CSS, using = "select[name='CPBuildingPopup-CPBldgSuggestedCovDV-IncomeAndExpenseIterator-0-CoverageInputSet-CovPatternInputGroup-6-CovTermInputSet-OptionTermInput']", AI = false)
			public WebElement drpPeriodofCoverageindays;

			@IFindBy(how = How.CSS, using = "select[name='CPBuildingPopup-CPBldgSuggestedCovDV-bldgAndPropIterator-1-CoverageInputSet-CovPatternInputGroup-CPBPPCovReportingForm']", AI = false)
			public WebElement drpReportingForm;

			@IFindBy(how = How.CSS, using = "select[name='CPBuildingPopup-CPBldgSuggestedCovDV-bldgAndPropIterator-1-CoverageInputSet-CovPatternInputGroup-CPBPPCovDeductible']", AI = false)
			public WebElement drpDeductible_5;

			@IFindBy(how = How.CSS, using = "select[name='CPBuildingPopup-CPBldgSuggestedCovDV-bldgAndPropIterator-1-CoverageInputSet-CovPatternInputGroup-CPBPPCovWindDeductible']", AI = false)
			public WebElement drpWindDeductible_6;

			@IFindBy(how = How.CSS, using = "input[name='CPBuildingPopup-DetailsDV-BasementArea']", AI = false)
			public WebElement inpBasementArea;

			@IFindBy(how = How.CSS, using = "select[name='CPBuildingPopup-DetailsDV-AlarmInfoInputGroup-AlarmGrade']", AI = false)
			public WebElement drpAlarmGrade;

			@IFindBy(how = How.CSS, using = "select[name='CPBuildingPopup-CPBldgSuggestedCovDV-IncomeAndExpenseIterator-0-CoverageInputSet-CovPatternInputGroup-5-CovTermInputSet-OptionTermInput']", AI = false)
			public WebElement drpWaitingPeriodinhours;

			@IFindBy(how = How.CSS, using = "#CPBuildingPopup-Update>div[role='button']", AI = false)
			public WebElement btnOK;

			@IFindBy(how = How.CSS, using = "#CPBuildingPopup-DetailsDV-ClassCode-SelectClassCode", AI = false)
			public WebElement btnSearch;

			@IFindBy(how = How.CSS, using = "select[name='CPBuildingPopup-DetailsDV-InterestType']", AI = false)
			public WebElement drpInterestType;

			@IFindBy(how = How.CSS, using = "input[name='CPBuildingPopup-DetailsDV-HeatingBoilerElsewhere']", AI = false)
			public WebElement rdbBoilerInsuredElsewhere;

			@IFindBy(how = How.CSS, using = "select[name='CPBuildingPopup-DetailsDV-ConstructionType']", AI = false)
			public WebElement drpConstructionType;

			@IFindBy(how = How.CSS, using = "input[name='CPBuildingPopup-CPBldgSuggestedCovDV-bldgAndPropIterator-1-CoverageInputSet-CovPatternInputGroup-CPBPPCovExcludeSprinkler']", AI = false)
			public WebElement rdbExcludeSprinkler_4;

			@IFindBy(how = How.CSS, using = "#CPBuildingPopup-BuildingDetailsTab", AI = false)
			public WebElement btnDetails;

			@IFindBy(how = How.CSS, using = "select[name='CPBuildingPopup-CPBldgSuggestedCovDV-bldgAndPropIterator-0-CoverageInputSet-CovPatternInputGroup-CPBldgCovWindDeductible']", AI = false)
			public WebElement drpWindDeductible;

			@IFindBy(how = How.CSS, using = "input[name='CPBuildingPopup-CPBldgSuggestedCovDV-IncomeAndExpenseIterator-1-CoverageInputSet-CovPatternInputGroup-0-CovTermInputSet-CovTermDirectInputSet-DirectTermInput']", AI = false)
			public WebElement inpLimit_11;

			@IFindBy(how = How.CSS, using = "#CPBuildingPopup-__crumb__", AI = false)
			public WebElement btnReturntoBuildingsandLocations;

			@IFindBy(how = How.CSS, using = "input[name='CPBuildingPopup-DetailsDV-LastUpdateRoofing']", AI = false)
			public WebElement inpYearofLastUpdateRoofing;

			@IFindBy(how = How.CSS, using = "#CPBuildingPopup-ttlBar", AI = false)
			public WebElement lblTtlBar;

			@IFindBy(how = How.CSS, using = "select[name='CPBuildingPopup-CPBldgSuggestedCovDV-bldgAndPropIterator-1-CoverageInputSet-CovPatternInputGroup-CPBPPCovCauseOfLoss']", AI = false)
			public WebElement drpCauseOfLoss_2;

			@IFindBy(how = How.CSS, using = "select[name='CPBuildingPopup-DetailsDV-CoverageForm']", AI = false)
			public WebElement drpCoverageForm;

			@IFindBy(how = How.CSS, using = "input[name='CPBuildingPopup-CPBldgSuggestedCovDV-IncomeAndExpenseIterator-0-CoverageInputSet-CovPatternInputGroup-2-CovTermInputSet-CovTermDirectInputSet-DirectTermInput']", AI = false)
			public WebElement inpIncomeLimitRentalOnly;

			@IFindBy(how = How.CSS, using = "select[name='CPBuildingPopup-CPBldgSuggestedCovDV-IncomeAndExpenseIterator-0-CoverageInputSet-CovPatternInputGroup-3-CovTermInputSet-TypekeyTermInput']", AI = false)
			public WebElement drpCauseOfLoss_9;

			@IFindBy(how = How.CSS, using = "input[name='CPBuildingPopup-DetailsDV-HeatingBoilerOnPremises']", AI = false)
			public WebElement rdbBoileronPremises;

			@IFindBy(how = How.CSS, using = "input[name='CPBuildingPopup-DetailsDV-NumStories']", AI = false)
			public WebElement inpOfStories;

			@IFindBy(how = How.CSS, using = "#CPBuildingPopup-AdditionalInterestDetailsDV-AdditionalInterestLV_tb-Remove>div[role='button']", AI = false)
			public WebElement btnRemove;

			@IFindBy(how = How.CSS, using = "input[name='CPBuildingPopup-DetailsDV-AlarmInfoInputGroup-AlarmCertificate']", AI = false)
			public WebElement inpAlarmCertificate;

			@IFindBy(how = How.CSS, using = "#CPBuildingPopup-AdditionalInterestDetailsDV-AdditionalInterestLV_tb-AddContactsButton-0-ContactType>div[role='button']", AI = false)
			public WebElement btnNewCompany;

			@IFindBy(how = How.CSS, using = "#CPBuildingPopup-EditPolicyButton>div[role='button']", AI = false)
			public WebElement btnEditPolicyTransaction;

			@IFindBy(how = How.CSS, using = "input[name='CPBuildingPopup-DetailsDV-AlarmInfoInputGroup-_checkbox']", AI = false)
			public WebElement chkHasAlarm;

			@IFindBy(how = How.CSS, using = "select[name='CPBuildingPopup-DetailsDV-RoofType']", AI = false)
			public WebElement drpRoofType;

			@IFindBy(how = How.CSS, using = "select[name='CPBuildingPopup-CPBldgSuggestedCovDV-bldgAndPropIterator-1-CoverageInputSet-CovPatternInputGroup-CPBPPCovCoinsurance']", AI = false)
			public WebElement drpCoinsurance_8;

			@IFindBy(how = How.CSS, using = "#CPBuildingPopup-Cancel>div[role='button']", AI = false)
			public WebElement btnCancel;

			@IFindBy(how = How.CSS, using = "input[name='CPBuildingPopup-CPBldgSuggestedCovDV-bldgAndPropIterator-0-CoverageInputSet-CovPatternInputGroup-_checkbox']", AI = false)
			public WebElement chkBuildingCoverage;

			@IFindBy(how = How.CSS, using = "#CPBuildingPopup-DetailsDV-AlarmInfoInputGroup-AlarmExpiration_dateIcon", AI = false)
			public WebElement btnAlarmExpirationDateIcon;

			@IFindBy(how = How.CSS, using = "input[name='CPBuildingPopup-DetailsDV-RightExposure']", AI = false)
			public WebElement inpRightExposure;

			@IFindBy(how = How.CSS, using = "input[name='CPBuildingPopup-PreferredCoverageCurrencySelectorRef-PreferredCoverageCurrencyPanelSet-CoverageCurrencyDisplay']", AI = false)
			public WebElement inpCoveragesin;

			@IFindBy(how = How.CSS, using = "select[name='CPBuildingPopup-DetailsDV-RateType']", AI = false)
			public WebElement drpRateType;

			@IFindBy(how = How.CSS, using = "#CPBuildingPopup-AdditionalInterestDetailsDV-AdditionalInterestLV_tb-AddContactsButton-AddExistingContact>div[role='button']", AI = false)
			public WebElement btnExistingAdditionalInterest;

			@IFindBy(how = How.CSS, using = "input[name='CPBuildingPopup-DetailsDV-FrontExposure']", AI = false)
			public WebElement inpFrontExposure;

			public NewBuildingPage(){
			}

			public NewBuildingPage(WebDriver driver){
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
			public NewBuildingPage selectAlarmType(WebDriver driver,String AlarmType)  {
				BrowserActions.selectDropDownByVisibleText(driver, drpAlarmType,AlarmType,"AlarmType");
				return this;
			}
			public NewBuildingPage enterIncomeLimitNotMfgorRental(WebDriver driver,String IncomeLimitNotMfgorRental) {
				BrowserActions.type(driver, inpIncomeLimitNotMfgorRental,IncomeLimitNotMfgorRental, "IncomeLimitNotMfgorRental");
				return this;
			}
			public NewBuildingPage enterYearofLastUpdatePlumbing(WebDriver driver,String YearofLastUpdatePlumbing) {
				BrowserActions.type(driver, inpYearofLastUpdatePlumbing,YearofLastUpdatePlumbing, "YearofLastUpdatePlumbing");
				return this;
			}
			public NewBuildingPage clickLennySchuppe(WebDriver driver)  {
				BrowserActions.click(driver, btnLennySchuppe,"LennySchuppe");
				return this;
			}
			public NewBuildingPage clickFromAddressBook(WebDriver driver)  {
				BrowserActions.click(driver, btnFromAddressBook,"FromAddressBook");
				return this;
			}
			public NewBuildingPage enterPropertyClassDescription(WebDriver driver,String PropertyClassDescription) {
				BrowserActions.type(driver, inpPropertyClassDescription,PropertyClassDescription, "PropertyClassDescription");
				return this;
			}
			public NewBuildingPage enterIncomeLimitMfgOnly(WebDriver driver,String IncomeLimitMfgOnly) {
				BrowserActions.type(driver, inpIncomeLimitMfgOnly,IncomeLimitMfgOnly, "IncomeLimitMfgOnly");
				return this;
			}
			public NewBuildingPage selectVacant(WebDriver driver,String Vacant)  {
				BrowserActions.selectDropDownByVisibleText(driver, drpVacant,Vacant,"Vacant");
				return this;
			}
			public NewBuildingPage enterYearBuilt(WebDriver driver,String YearBuilt) {
				BrowserActions.type(driver, inpYearBuilt,YearBuilt, "YearBuilt");
				return this;
			}
			public NewBuildingPage selectMonthlyLimit(WebDriver driver,String MonthlyLimit)  {
				BrowserActions.selectDropDownByVisibleText(driver, drpMonthlyLimit,MonthlyLimit,"MonthlyLimit");
				return this;
			}
			public NewBuildingPage enterOfBasements(WebDriver driver,String OfBasements) {
				BrowserActions.type(driver, inpOfBasements,OfBasements, "OfBasements");
				return this;
			}
			public NewBuildingPage enterPropertyClassCode(WebDriver driver,String PropertyClassCode) {
				BrowserActions.type(driver, inpPropertyClassCode,PropertyClassCode,true, "PropertyClassCode");
				return this;
			}
			public NewBuildingPage selectValuationMethod(WebDriver driver,String ValuationMethod)  {
				BrowserActions.selectDropDownByVisibleText(driver, drpValuationMethod,ValuationMethod,"ValuationMethod");
				return this;
			}
			public NewBuildingPage clickCoverages(WebDriver driver)  {
				BrowserActions.click(driver, btnCoverages,"Coverages");
				return this;
			}
			public NewBuildingPage selectCoinsurance(WebDriver driver,String Coinsurance)  {
				BrowserActions.selectDropDownByVisibleText(driver, drpCoinsurance,Coinsurance,"Coinsurance");
				return this;
			}
			public NewBuildingPage enterYearofLastUpdateWiring(WebDriver driver,String YearofLastUpdateWiring) {
				BrowserActions.type(driver, inpYearofLastUpdateWiring,YearofLastUpdateWiring, "YearofLastUpdateWiring");
				return this;
			}
			public NewBuildingPage selectValuationMethod_7(WebDriver driver,String ValuationMethod_7)  {
				BrowserActions.selectDropDownByVisibleText(driver, drpValuationMethod_7,ValuationMethod_7,"ValuationMethod_7");
				return this;
			}
			public NewBuildingPage clickNewPerson(WebDriver driver)  {
				BrowserActions.click(driver, btnNewPerson,"NewPerson");
				return this;
			}
			public NewBuildingPage selectAutoIncrease(WebDriver driver,String AutoIncrease)  {
				BrowserActions.selectDropDownByVisibleText(driver, drpAutoIncrease,AutoIncrease,"AutoIncrease");
				return this;
			}
			public NewBuildingPage selectCoinsurance_10(WebDriver driver,String Coinsurance_10)  {
				BrowserActions.selectDropDownByVisibleText(driver, drpCoinsurance_10,Coinsurance_10,"Coinsurance_10");
				return this;
			}
			public NewBuildingPage selectBurglarySafeguard(WebDriver driver,String BurglarySafeguard)  {
				BrowserActions.selectDropDownByVisibleText(driver, drpBurglarySafeguard,BurglarySafeguard,"BurglarySafeguard");
				return this;
			}
			public NewBuildingPage clickExcludeVandalism(WebDriver driver)  {
				BrowserActions.click(driver, rdbExcludeVandalism,"ExcludeVandalism");
				return this;
			}
			public NewBuildingPage enterBuildingNumber(WebDriver driver,String BuildingNumber) {
				BrowserActions.type(driver, inpBuildingNumber,BuildingNumber, "BuildingNumber");
				return this;
			}
			public NewBuildingPage enterRearExposure(WebDriver driver,String RearExposure) {
				BrowserActions.type(driver, inpRearExposure,RearExposure, "RearExposure");
				return this;
			}
			public NewBuildingPage enterLeftExposure(WebDriver driver,String LeftExposure) {
				BrowserActions.type(driver, inpLeftExposure,LeftExposure, "LeftExposure");
				return this;
			}
			public NewBuildingPage selectLocation(WebDriver driver,String Location)  {
				BrowserActions.selectDropDownByVisibleText(driver, drpLocation,Location,"Location");
				return this;
			}
			public NewBuildingPage enterYearofLastUpdateHeating(WebDriver driver,String YearofLastUpdateHeating) {
				BrowserActions.type(driver, inpYearofLastUpdateHeating,YearofLastUpdateHeating, "YearofLastUpdateHeating");
				return this;
			}
			public NewBuildingPage enterLimit(WebDriver driver,String Limit) {
				BrowserActions.type(driver, inpLimit,Limit, "Limit");
				return this;
			}
			public NewBuildingPage selectCauseOfLoss(WebDriver driver,String CauseOfLoss)  {
				BrowserActions.selectDropDownByVisibleText(driver, drpCauseOfLoss,CauseOfLoss,"CauseOfLoss");
				return this;
			}
			public NewBuildingPage selectDeductible(WebDriver driver,String Deductible)  {
				BrowserActions.selectDropDownByVisibleText(driver, drpDeductible,Deductible,"Deductible");
				return this;
			}
			public NewBuildingPage selectCoveragesin(WebDriver driver,String Coveragesin)  {
				BrowserActions.selectDropDownByVisibleText(driver, drpCoveragesin,Coveragesin,"Coveragesin");
				return this;
			}
			public NewBuildingPage clickAdditionalInterest(WebDriver driver)  {
				BrowserActions.click(driver, btnAdditionalInterest,"AdditionalInterest");
				return this;
			}
			public NewBuildingPage clickOtherContacts(WebDriver driver)  {
				BrowserActions.click(driver, btnOtherContacts,"OtherContacts");
				return this;
			}
			public NewBuildingPage clickExcludeVandalism_3(WebDriver driver)  {
				BrowserActions.click(driver, rdbExcludeVandalism_3,"ExcludeVandalism_3");
				return this;
			}
			public NewBuildingPage clickExtraExpenseCoverage(WebDriver driver)  {
				BrowserActions.click(driver, chkExtraExpenseCoverage,"ExtraExpenseCoverage");
				return this;
			}
			public NewBuildingPage selectSprinklered(WebDriver driver,String Sprinklered)  {
				BrowserActions.selectDropDownByVisibleText(driver, drpSprinklered,Sprinklered,"Sprinklered");
				return this;
			}
			public NewBuildingPage selectAlarmClass(WebDriver driver,String AlarmClass)  {
				BrowserActions.selectDropDownByVisibleText(driver, drpAlarmClass,AlarmClass,"AlarmClass");
				return this;
			}
			public NewBuildingPage clickCPBPPCovExcludeTheft(WebDriver driver)  {
				BrowserActions.click(driver, rdbCPBPPCovExcludeTheft,"CPBPPCovExcludeTheft");
				return this;
			}
			public NewBuildingPage click_checkbox(WebDriver driver)  {
				BrowserActions.click(driver, chk_checkbox,"_checkbox");
				return this;
			}
			public NewBuildingPage selectRentedToOthers(WebDriver driver,String RentedToOthers)  {
				BrowserActions.selectDropDownByVisibleText(driver, drpRentedToOthers,RentedToOthers,"RentedToOthers");
				return this;
			}
			public NewBuildingPage clickAdd(WebDriver driver)  {
				BrowserActions.click(driver, btnAdd,"Add");
				return this;
			}
			public NewBuildingPage clickExcludeSprinkler(WebDriver driver)  {
				BrowserActions.click(driver, rdbExcludeSprinkler,"ExcludeSprinkler");
				return this;
			}
			public NewBuildingPage clickCPBldgCovExcludeTheft(WebDriver driver)  {
				BrowserActions.click(driver, rdbCPBldgCovExcludeTheft,"CPBldgCovExcludeTheft");
				return this;
			}
			public NewBuildingPage enterLimit_1(WebDriver driver,String Limit_1) {
				BrowserActions.type(driver, inpLimit_1,Limit_1, "Limit_1");
				return this;
			}
			public NewBuildingPage enterAlarmExpiration(WebDriver driver,String AlarmExpiration) {
				BrowserActions.type(driver, inpAlarmExpiration,AlarmExpiration, "AlarmExpiration");
				return this;
			}
			public NewBuildingPage enterTotalAreaexclbasement(WebDriver driver,String TotalAreaexclbasement) {
				BrowserActions.type(driver, inpTotalAreaexclbasement,TotalAreaexclbasement, "TotalAreaexclbasement");
				return this;
			}
			public NewBuildingPage clickBusinessIncomeCoverage(WebDriver driver)  {
				BrowserActions.click(driver, chkBusinessIncomeCoverage,"BusinessIncomeCoverage");
				return this;
			}
			public NewBuildingPage enterDescription(WebDriver driver,String Description) {
				BrowserActions.type(driver, inpDescription,Description, "Description");
				return this;
			}
			public NewBuildingPage selectWindRating(WebDriver driver,String WindRating)  {
				BrowserActions.selectDropDownByVisibleText(driver, drpWindRating,WindRating,"WindRating");
				return this;
			}
			public NewBuildingPage selectPeriodofCoverageindays(WebDriver driver,String PeriodofCoverageindays)  {
				BrowserActions.selectDropDownByVisibleText(driver, drpPeriodofCoverageindays,PeriodofCoverageindays,"PeriodofCoverageindays");
				return this;
			}
			public NewBuildingPage selectReportingForm(WebDriver driver,String ReportingForm)  {
				BrowserActions.selectDropDownByVisibleText(driver, drpReportingForm,ReportingForm,"ReportingForm");
				return this;
			}
			public NewBuildingPage selectDeductible_5(WebDriver driver,String Deductible_5)  {
				BrowserActions.selectDropDownByVisibleText(driver, drpDeductible_5,Deductible_5,"Deductible_5");
				return this;
			}
			public NewBuildingPage selectWindDeductible_6(WebDriver driver,String WindDeductible_6)  {
				BrowserActions.selectDropDownByVisibleText(driver, drpWindDeductible_6,WindDeductible_6,"WindDeductible_6");
				return this;
			}
			public NewBuildingPage enterBasementArea(WebDriver driver,String BasementArea) {
				BrowserActions.type(driver, inpBasementArea,BasementArea, "BasementArea");
				return this;
			}
			public NewBuildingPage selectAlarmGrade(WebDriver driver,String AlarmGrade)  {
				BrowserActions.selectDropDownByVisibleText(driver, drpAlarmGrade,AlarmGrade,"AlarmGrade");
				return this;
			}
			public NewBuildingPage selectWaitingPeriodinhours(WebDriver driver,String WaitingPeriodinhours)  {
				BrowserActions.selectDropDownByVisibleText(driver, drpWaitingPeriodinhours,WaitingPeriodinhours,"WaitingPeriodinhours");
				return this;
			}
			public NewBuildingPage clickOK(WebDriver driver)  {
				BrowserActions.click(driver, btnOK,"OK");
				return this;
			}
			public NewBuildingPage clickSearch(WebDriver driver)  {
				BrowserActions.click(driver, btnSearch,"Search");
				return this;
			}
			public NewBuildingPage selectInterestType(WebDriver driver,String InterestType)  {
				BrowserActions.selectDropDownByVisibleText(driver, drpInterestType,InterestType,"InterestType");
				return this;
			}
			public NewBuildingPage clickBoilerInsuredElsewhere(WebDriver driver)  {
				BrowserActions.click(driver, rdbBoilerInsuredElsewhere,"BoilerInsuredElsewhere");
				return this;
			}
			public NewBuildingPage selectConstructionType(WebDriver driver,String ConstructionType)  {
				BrowserActions.selectDropDownByVisibleText(driver, drpConstructionType,ConstructionType,"ConstructionType");
				return this;
			}
			public NewBuildingPage clickExcludeSprinkler_4(WebDriver driver)  {
				BrowserActions.click(driver, rdbExcludeSprinkler_4,"ExcludeSprinkler_4");
				return this;
			}
			public NewBuildingPage clickDetails(WebDriver driver)  {
				BrowserActions.click(driver, btnDetails,"Details");
				return this;
			}
			public NewBuildingPage selectWindDeductible(WebDriver driver,String WindDeductible)  {
				BrowserActions.selectDropDownByVisibleText(driver, drpWindDeductible,WindDeductible,"WindDeductible");
				return this;
			}
			public NewBuildingPage enterLimit_11(WebDriver driver,String Limit_11) {
				BrowserActions.type(driver, inpLimit_11,Limit_11, "Limit_11");
				return this;
			}
			public NewBuildingPage clickReturntoBuildingsandLocations(WebDriver driver)  {
				BrowserActions.click(driver, btnReturntoBuildingsandLocations,"ReturntoBuildingsandLocations");
				return this;
			}
			public NewBuildingPage enterYearofLastUpdateRoofing(WebDriver driver,String YearofLastUpdateRoofing) {
				BrowserActions.type(driver, inpYearofLastUpdateRoofing,YearofLastUpdateRoofing, "YearofLastUpdateRoofing");
				return this;
			}
			public NewBuildingPage selectCauseOfLoss_2(WebDriver driver,String CauseOfLoss_2)  {
				BrowserActions.selectDropDownByVisibleText(driver, drpCauseOfLoss_2,CauseOfLoss_2,"CauseOfLoss_2");
				return this;
			}
			public NewBuildingPage selectCoverageForm(WebDriver driver,String CoverageForm)  {
				BrowserActions.selectDropDownByVisibleText(driver, drpCoverageForm,CoverageForm,true,"CoverageForm");
				return this;
			}
			public NewBuildingPage enterIncomeLimitRentalOnly(WebDriver driver,String IncomeLimitRentalOnly) {
				BrowserActions.type(driver, inpIncomeLimitRentalOnly,IncomeLimitRentalOnly, "IncomeLimitRentalOnly");
				return this;
			}
			public NewBuildingPage selectCauseOfLoss_9(WebDriver driver,String CauseOfLoss_9)  {
				BrowserActions.selectDropDownByVisibleText(driver, drpCauseOfLoss_9,CauseOfLoss_9,"CauseOfLoss_9");
				return this;
			}
			public NewBuildingPage clickBoileronPremises(WebDriver driver)  {
				BrowserActions.click(driver, rdbBoileronPremises,"BoileronPremises");
				return this;
			}
			public NewBuildingPage enterOfStories(WebDriver driver,String OfStories) {
				BrowserActions.type(driver, inpOfStories,OfStories, "OfStories");
				return this;
			}
			public NewBuildingPage clickRemove(WebDriver driver)  {
				BrowserActions.click(driver, btnRemove,"Remove");
				return this;
			}
			public NewBuildingPage enterAlarmCertificate(WebDriver driver,String AlarmCertificate) {
				BrowserActions.type(driver, inpAlarmCertificate,AlarmCertificate, "AlarmCertificate");
				return this;
			}
			public NewBuildingPage clickNewCompany(WebDriver driver)  {
				BrowserActions.click(driver, btnNewCompany,"NewCompany");
				return this;
			}
			public NewBuildingPage clickEditPolicyTransaction(WebDriver driver)  {
				BrowserActions.click(driver, btnEditPolicyTransaction,"EditPolicyTransaction");
				return this;
			}
			public NewBuildingPage clickHasAlarm(WebDriver driver)  {
				BrowserActions.click(driver, chkHasAlarm,"HasAlarm");
				return this;
			}
			public NewBuildingPage selectRoofType(WebDriver driver,String RoofType)  {
				BrowserActions.selectDropDownByVisibleText(driver, drpRoofType,RoofType,"RoofType");
				return this;
			}
			public NewBuildingPage selectCoinsurance_8(WebDriver driver,String Coinsurance_8)  {
				BrowserActions.selectDropDownByVisibleText(driver, drpCoinsurance_8,Coinsurance_8,"Coinsurance_8");
				return this;
			}
			public NewBuildingPage clickCancel(WebDriver driver)  {
				BrowserActions.click(driver, btnCancel,"Cancel");
				return this;
			}
			public NewBuildingPage clickBuildingCoverage(WebDriver driver)  {
				BrowserActions.click(driver, chkBuildingCoverage,"BuildingCoverage");
				return this;
			}
			public NewBuildingPage clickAlarmExpirationDateIcon(WebDriver driver)  {
				BrowserActions.click(driver, btnAlarmExpirationDateIcon,"AlarmExpirationDateIcon");
				return this;
			}
			public NewBuildingPage enterRightExposure(WebDriver driver,String RightExposure) {
				BrowserActions.type(driver, inpRightExposure,RightExposure, "RightExposure");
				return this;
			}
			public NewBuildingPage enterCoveragesin(WebDriver driver,String Coveragesin) {
				BrowserActions.type(driver, inpCoveragesin,Coveragesin, "Coveragesin");
				return this;
			}
			public NewBuildingPage selectRateType(WebDriver driver,String RateType)  {
				BrowserActions.selectDropDownByVisibleText(driver, drpRateType,RateType,"RateType");
				return this;
			}
			public NewBuildingPage clickExistingAdditionalInterest(WebDriver driver)  {
				BrowserActions.click(driver, btnExistingAdditionalInterest,"ExistingAdditionalInterest");
				return this;
			}
			public NewBuildingPage enterFrontExposure(WebDriver driver,String FrontExposure) {
				BrowserActions.type(driver, inpFrontExposure,FrontExposure, "FrontExposure");
				return this;
			}


		}

	}

	public class NewAdditionalInterestPage extends LoadableComponent<NewAdditionalInterestPage> {

		WebDriver driver;
		private boolean isPageLoaded;
		public ElementLayer elementLayer;
		String elementObject;
		HashMap<String, String> getPageObjects;
		public List<Object> pageFactoryKey = new ArrayList<Object>();
		public List<String> pageFactoryValue = new ArrayList<String>();

		//TopNavBar object
		//	public TopNavBar topnavbar;
		@IFindBy(how = How.CSS, using = "#NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactRoleDetailCardTab", AI = false)
		public WebElement btnContactDetail;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-HomePhone-GlobalPhoneInputSet-PhoneDisplay']", AI = false)
		public WebElement inpHomePhone_2;

		@IFindBy(how = How.CSS, using = "#NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-LinkedAddressInputSet-LinkAddressMenu-EditAddress>div[role='menuitem']", AI = false)
		public WebElement btnEditaddress;

		@IFindBy(how = How.CSS, using = "#NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-LinkedAddressInputSet-LinkAddressMenu-LinkAddressMenuMenuIcon>div[role='button']", AI = false)
		public WebElement btnLinkAddressMenuMenuIcon;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-GlobalPersonNameInputSet-LastName']", AI = false)
		public WebElement inpLastname;

		@IFindBy(how = How.CSS, using = "select[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-PrimaryPhone']", AI = false)
		public WebElement drpPrimaryPhone;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressDescription']", AI = false)
		public WebElement inpAddressDescription;

		@IFindBy(how = How.CSS, using = "#NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-LinkedAddressInputSet-LinkAddressMenu-0-contactDetail>div[role='menuitem']", AI = false)
		public WebElement btnContactDetail_6;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-County']", AI = false)
		public WebElement inpCounty;

		@IFindBy(how = How.CSS, using = "#NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-PostalCode-AutoFillIcon", AI = false)
		public WebElement btnAutoFillIcon_8;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-FaxPhone-GlobalPhoneInputSet-NationalSubscriberNumber']", AI = false)
		public WebElement inpFaxPhone;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-AdditionalInterestInfoDV-ContractNumber']", AI = false)
		public WebElement inpContractNumber;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-HomePhone-GlobalPhoneInputSet-NationalSubscriberNumber']", AI = false)
		public WebElement inpHomePhone;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-EmailAddress2']", AI = false)
		public WebElement inpSecondaryEmail;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-GlobalPersonNameInputSet-FirstName']", AI = false)
		public WebElement inpFirstname;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-CellPhone-GlobalPhoneInputSet-NationalSubscriberNumber']", AI = false)
		public WebElement inpMobilePhone;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine3']", AI = false)
		public WebElement inpAddress3;

		@IFindBy(how = How.CSS, using = "select[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-HomePhone-GlobalPhoneInputSet-CountryCode']", AI = false)
		public WebElement drpHomePhoneRegionCode;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine1']", AI = false)
		public WebElement inpAddress1;

		@IFindBy(how = How.CSS, using = "select[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressType']", AI = false)
		public WebElement drpAddressType;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine2']", AI = false)
		public WebElement inpAddress2;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-OfficialIDInputSet-OfficialIDDV_Input']", AI = false)
		public WebElement inpSSN;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-LinkedAddressInputSet-LinkAddressMenu']", AI = false)
		public WebElement inpAddress;

		@IFindBy(how = How.CSS, using = "select[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-ContactCurrency-ContactCurrencyInputSet-PreferredSettlementCurrency']", AI = false)
		public WebElement drpPreferredCurrency;

		@IFindBy(how = How.CSS, using = "#NewAdditionalInterestPopup-ContactDetailScreen-CheckForDuplicates>div[role='button']", AI = false)
		public WebElement btnCheckforDuplicates;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-PostalCode']", AI = false)
		public WebElement inpZIPCode;

		@IFindBy(how = How.CSS, using = "#NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-City-AutoFillIcon", AI = false)
		public WebElement btnAutoFillIcon;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-WorkPhone-GlobalPhoneInputSet-Extension']", AI = false)
		public WebElement inpWorkPhoneExtension;

		@IFindBy(how = How.CSS, using = "select[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-FaxPhone-GlobalPhoneInputSet-CountryCode']", AI = false)
		public WebElement drpFaxPhoneRegionCode;

		@IFindBy(how = How.CSS, using = "select[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-CellPhone-GlobalPhoneInputSet-CountryCode']", AI = false)
		public WebElement drpMobilePhoneRegionCode;

		@IFindBy(how = How.CSS, using = "select[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-GlobalPersonNameInputSet-Prefix']", AI = false)
		public WebElement drpPrefix;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-GlobalPersonNameInputSet-NameSummary']", AI = false)
		public WebElement inpName;

		@IFindBy(how = How.CSS, using = "select[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-Country']", AI = false)
		public WebElement drpCountry;

		@IFindBy(how = How.CSS, using = "select[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-GlobalPersonNameInputSet-Suffix']", AI = false)
		public WebElement drpSuffix;

		@IFindBy(how = How.CSS, using = "select[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-State']", AI = false)
		public WebElement drpState;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-FaxPhone-GlobalPhoneInputSet-PhoneDisplay']", AI = false)
		public WebElement inpFaxPhone_5;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-AdditionalInterestInfoDV-CertRequired']", AI = false)
		public WebElement rdbCertificateRequired;

		@IFindBy(how = How.CSS, using = "select[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-MaritalStatus']", AI = false)
		public WebElement drpMaritalStatus;

		@IFindBy(how = How.CSS, using = "#NewAdditionalInterestPopup-__crumb__", AI = false)
		public WebElement btnReturntoNewBuilding;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-HomePhone-GlobalPhoneInputSet-Extension']", AI = false)
		public WebElement inpHomePhoneExtension;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-GlobalPersonNameInputSet-Particle']", AI = false)
		public WebElement inpParticle;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-CellPhone-GlobalPhoneInputSet-Extension']", AI = false)
		public WebElement inpMobilePhoneExtension;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-City']", AI = false)
		public WebElement inpCity;

		@IFindBy(how = How.CSS, using = "select[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-LicenseInputSet-LicenseState']", AI = false)
		public WebElement drpLicenseState;

		@IFindBy(how = How.CSS, using = "select[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-WorkPhone-GlobalPhoneInputSet-CountryCode']", AI = false)
		public WebElement drpWorkPhoneRegionCode;

		@IFindBy(how = How.CSS, using = "#NewAdditionalInterestPopup-ContactDetailScreen-ForceDupCheckUpdate>div[role='button']", AI = false)
		public WebElement btnOK;

		@IFindBy(how = How.CSS, using = "select[name='NewAdditionalInterestPopup-ContactDetailScreen-AdditionalInterestInfoDV-Type']", AI = false)
		public WebElement drpInterestType;

		@IFindBy(how = How.CSS, using = "#NewAdditionalInterestPopup-ContactDetailScreen-Update>div[role='button']", AI = false)
		public WebElement btnOK_1;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-WorkPhone-GlobalPhoneInputSet-PhoneDisplay']", AI = false)
		public WebElement inpWorkPhone_3;

		@IFindBy(how = How.CSS, using = "#NewAdditionalInterestPopup-ContactDetailScreen-ttlBar", AI = false)
		public WebElement lblTtlBar;

		@IFindBy(how = How.CSS, using = "#NewAdditionalInterestPopup-ContactDetailScreen-Edit>div[role='button']", AI = false)
		public WebElement btnEdit;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-EmailAddress1']", AI = false)
		public WebElement inpPrimaryEmail;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-DateOfBirth']", AI = false)
		public WebElement inpDateofBirth;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressSummary']", AI = false)
		public WebElement inpAddress_7;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-GlobalPersonNameInputSet-MiddleName']", AI = false)
		public WebElement inpMiddlename;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-CellPhone-GlobalPhoneInputSet-PhoneDisplay']", AI = false)
		public WebElement inpMobilePhone_4;

		@IFindBy(how = How.CSS, using = "#NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-LinkedAddressInputSet-LinkAddressMenu-0-contactDetail-PrimaryAddress>div[role='menuitem']", AI = false)
		public WebElement btnPrimaryAddress;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-LicenseInputSet-LicenseNumber']", AI = false)
		public WebElement inpLicense;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-WorkPhone-GlobalPhoneInputSet-NationalSubscriberNumber']", AI = false)
		public WebElement inpWorkPhone;

		@IFindBy(how = How.CSS, using = "#NewAdditionalInterestPopup-ContactDetailScreen-Cancel>div[role='button']", AI = false)
		public WebElement btnCancel;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-FaxPhone-GlobalPhoneInputSet-Extension']", AI = false)
		public WebElement inpFaxPhoneExtension;

		@IFindBy(how = How.CSS, using = "#NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-DateOfBirth_dateIcon", AI = false)
		public WebElement btnDateofBirthDateIcon;

		public NewAdditionalInterestPage(){
		}

		public NewAdditionalInterestPage(WebDriver driver) throws Exception{
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
		}public NewAdditionalInterestPage clickContactDetail(WebDriver driver)  {
			BrowserActions.click(driver, btnContactDetail,"ContactDetail");
			return this;
		}
		public NewAdditionalInterestPage enterHomePhone_2(WebDriver driver,String HomePhone_2) {
			BrowserActions.type(driver, inpHomePhone_2,HomePhone_2, "HomePhone_2");
			return this;
		}
		public NewAdditionalInterestPage clickEditaddress(WebDriver driver)  {
			BrowserActions.click(driver, btnEditaddress,"Editaddress");
			return this;
		}
		public NewAdditionalInterestPage clickLinkAddressMenuMenuIcon(WebDriver driver)  {
			BrowserActions.click(driver, btnLinkAddressMenuMenuIcon,"LinkAddressMenuMenuIcon");
			return this;
		}
		public NewAdditionalInterestPage enterLastname(WebDriver driver,String Lastname) {
			BrowserActions.type(driver, inpLastname,Lastname, "Lastname");
			return this;
		}
		public NewAdditionalInterestPage selectPrimaryPhone(WebDriver driver,String PrimaryPhone)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpPrimaryPhone,PrimaryPhone,"PrimaryPhone");
			return this;
		}
		public NewAdditionalInterestPage enterAddressDescription(WebDriver driver,String AddressDescription) {
			BrowserActions.type(driver, inpAddressDescription,AddressDescription, "AddressDescription");
			return this;
		}
		public NewAdditionalInterestPage clickContactDetail_6(WebDriver driver)  {
			BrowserActions.click(driver, btnContactDetail_6,"ContactDetail_6");
			return this;
		}
		public NewAdditionalInterestPage enterCounty(WebDriver driver,String County) {
			BrowserActions.type(driver, inpCounty,County, "County");
			return this;
		}
		public NewAdditionalInterestPage clickAutoFillIcon_8(WebDriver driver)  {
			BrowserActions.click(driver, btnAutoFillIcon_8,"AutoFillIcon_8");
			return this;
		}
		public NewAdditionalInterestPage enterFaxPhone(WebDriver driver,String FaxPhone) {
			BrowserActions.type(driver, inpFaxPhone,FaxPhone, "FaxPhone");
			return this;
		}
		public NewAdditionalInterestPage enterContractNumber(WebDriver driver,String ContractNumber) {
			BrowserActions.type(driver, inpContractNumber,ContractNumber, "ContractNumber");
			return this;
		}
		public NewAdditionalInterestPage enterHomePhone(WebDriver driver,String HomePhone) {
			BrowserActions.type(driver, inpHomePhone,HomePhone, "HomePhone");
			return this;
		}
		public NewAdditionalInterestPage enterSecondaryEmail(WebDriver driver,String SecondaryEmail) {
			BrowserActions.type(driver, inpSecondaryEmail,SecondaryEmail, "SecondaryEmail");
			return this;
		}
		public NewAdditionalInterestPage enterFirstname(WebDriver driver,String Firstname) {
			BrowserActions.type(driver, inpFirstname,Firstname, "Firstname");
			return this;
		}
		public NewAdditionalInterestPage enterMobilePhone(WebDriver driver,String MobilePhone) {
			BrowserActions.type(driver, inpMobilePhone,MobilePhone, "MobilePhone");
			return this;
		}
		public NewAdditionalInterestPage enterAddress3(WebDriver driver,String Address3) {
			BrowserActions.type(driver, inpAddress3,Address3, "Address3");
			return this;
		}
		public NewAdditionalInterestPage selectHomePhoneRegionCode(WebDriver driver,String HomePhoneRegionCode)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpHomePhoneRegionCode,HomePhoneRegionCode,"HomePhoneRegionCode");
			return this;
		}
		public NewAdditionalInterestPage enterAddress1(WebDriver driver,String Address1) {
			BrowserActions.type(driver, inpAddress1,Address1, "Address1");
			return this;
		}
		public NewAdditionalInterestPage selectAddressType(WebDriver driver,String AddressType)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpAddressType,AddressType,"AddressType");
			return this;
		}
		public NewAdditionalInterestPage enterAddress2(WebDriver driver,String Address2) {
			BrowserActions.type(driver, inpAddress2,Address2, "Address2");
			return this;
		}
		public NewAdditionalInterestPage enterSSN(WebDriver driver,String SSN) {
			BrowserActions.type(driver, inpSSN,SSN, "SSN");
			return this;
		}
		public NewAdditionalInterestPage enterAddress(WebDriver driver,String Address) {
			BrowserActions.type(driver, inpAddress,Address, "Address");
			return this;
		}
		public NewAdditionalInterestPage selectPreferredCurrency(WebDriver driver,String PreferredCurrency)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpPreferredCurrency,PreferredCurrency,"PreferredCurrency");
			return this;
		}
		public NewAdditionalInterestPage clickCheckforDuplicates(WebDriver driver)  {
			BrowserActions.click(driver, btnCheckforDuplicates,"CheckforDuplicates");
			return this;
		}
		public NewAdditionalInterestPage enterZIPCode(WebDriver driver,String ZIPCode) {
			BrowserActions.type(driver, inpZIPCode,ZIPCode, "ZIPCode");
			return this;
		}
		public NewAdditionalInterestPage clickAutoFillIcon(WebDriver driver)  {
			BrowserActions.click(driver, btnAutoFillIcon,"AutoFillIcon");
			return this;
		}
		public NewAdditionalInterestPage enterWorkPhoneExtension(WebDriver driver,String WorkPhoneExtension) {
			BrowserActions.type(driver, inpWorkPhoneExtension,WorkPhoneExtension, "WorkPhoneExtension");
			return this;
		}
		public NewAdditionalInterestPage selectFaxPhoneRegionCode(WebDriver driver,String FaxPhoneRegionCode)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpFaxPhoneRegionCode,FaxPhoneRegionCode,"FaxPhoneRegionCode");
			return this;
		}
		public NewAdditionalInterestPage selectMobilePhoneRegionCode(WebDriver driver,String MobilePhoneRegionCode)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpMobilePhoneRegionCode,MobilePhoneRegionCode,"MobilePhoneRegionCode");
			return this;
		}
		public NewAdditionalInterestPage selectPrefix(WebDriver driver,String Prefix)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpPrefix,Prefix,"Prefix");
			return this;
		}
		public NewAdditionalInterestPage enterName(WebDriver driver,String Name) {
			BrowserActions.type(driver, inpName,Name, "Name");
			return this;
		}
		public NewAdditionalInterestPage selectCountry(WebDriver driver,String Country)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpCountry,Country,"Country");
			return this;
		}
		public NewAdditionalInterestPage selectSuffix(WebDriver driver,String Suffix)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpSuffix,Suffix,"Suffix");
			return this;
		}
		public NewAdditionalInterestPage selectState(WebDriver driver,String State)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpState,State,true,"State");
			return this;
		}
		public NewAdditionalInterestPage enterFaxPhone_5(WebDriver driver,String FaxPhone_5) {
			BrowserActions.type(driver, inpFaxPhone_5,FaxPhone_5, "FaxPhone_5");
			return this;
		}
		public NewAdditionalInterestPage clickCertificateRequired(WebDriver driver)  {
			BrowserActions.click(driver, rdbCertificateRequired,"CertificateRequired");
			return this;
		}
		public NewAdditionalInterestPage selectMaritalStatus(WebDriver driver,String MaritalStatus)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpMaritalStatus,MaritalStatus,"MaritalStatus");
			return this;
		}
		public NewAdditionalInterestPage clickReturntoNewBuilding(WebDriver driver)  {
			BrowserActions.click(driver, btnReturntoNewBuilding,"ReturntoNewBuilding");
			return this;
		}
		public NewAdditionalInterestPage enterHomePhoneExtension(WebDriver driver,String HomePhoneExtension) {
			BrowserActions.type(driver, inpHomePhoneExtension,HomePhoneExtension, "HomePhoneExtension");
			return this;
		}
		public NewAdditionalInterestPage enterParticle(WebDriver driver,String Particle) {
			BrowserActions.type(driver, inpParticle,Particle, "Particle");
			return this;
		}
		public NewAdditionalInterestPage enterMobilePhoneExtension(WebDriver driver,String MobilePhoneExtension) {
			BrowserActions.type(driver, inpMobilePhoneExtension,MobilePhoneExtension, "MobilePhoneExtension");
			return this;
		}
		public NewAdditionalInterestPage enterCity(WebDriver driver,String City) {
			BrowserActions.type(driver, inpCity,City, "City");
			return this;
		}
		public NewAdditionalInterestPage selectLicenseState(WebDriver driver,String LicenseState)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpLicenseState,LicenseState,"LicenseState");
			return this;
		}
		public NewAdditionalInterestPage selectWorkPhoneRegionCode(WebDriver driver,String WorkPhoneRegionCode)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpWorkPhoneRegionCode,WorkPhoneRegionCode,"WorkPhoneRegionCode");
			return this;
		}
		public NewAdditionalInterestPage clickOK(WebDriver driver)  {
			BrowserActions.click(driver, btnOK,"OK");
			return this;
		}
		public NewAdditionalInterestPage selectInterestType(WebDriver driver,String InterestType)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpInterestType,InterestType,"InterestType");
			return this;
		}
		public NewAdditionalInterestPage clickOK_1(WebDriver driver)  {
			BrowserActions.click(driver, btnOK_1,"OK_1");
			return this;
		}
		public NewAdditionalInterestPage enterWorkPhone_3(WebDriver driver,String WorkPhone_3) {
			BrowserActions.type(driver, inpWorkPhone_3,WorkPhone_3, "WorkPhone_3");
			return this;
		}
		public NewAdditionalInterestPage clickEdit(WebDriver driver)  {
			BrowserActions.click(driver, btnEdit,"Edit");
			return this;
		}
		public NewAdditionalInterestPage enterPrimaryEmail(WebDriver driver,String PrimaryEmail) {
			BrowserActions.type(driver, inpPrimaryEmail,PrimaryEmail, "PrimaryEmail");
			return this;
		}
		public NewAdditionalInterestPage enterDateofBirth(WebDriver driver,String DateofBirth) {
			BrowserActions.type(driver, inpDateofBirth,DateofBirth, "DateofBirth");
			return this;
		}
		public NewAdditionalInterestPage enterAddress_7(WebDriver driver,String Address_7) {
			BrowserActions.type(driver, inpAddress_7,Address_7, "Address_7");
			return this;
		}
		public NewAdditionalInterestPage enterMiddlename(WebDriver driver,String Middlename) {
			BrowserActions.type(driver, inpMiddlename,Middlename, "Middlename");
			return this;
		}
		public NewAdditionalInterestPage enterMobilePhone_4(WebDriver driver,String MobilePhone_4) {
			BrowserActions.type(driver, inpMobilePhone_4,MobilePhone_4, "MobilePhone_4");
			return this;
		}
		public NewAdditionalInterestPage clickPrimaryAddress(WebDriver driver)  {
			BrowserActions.click(driver, btnPrimaryAddress,"PrimaryAddress");
			return this;
		}
		public NewAdditionalInterestPage enterLicense(WebDriver driver,String License) {
			BrowserActions.type(driver, inpLicense,License, "License");
			return this;
		}
		public NewAdditionalInterestPage enterWorkPhone(WebDriver driver,String WorkPhone) {
			BrowserActions.type(driver, inpWorkPhone,WorkPhone, "WorkPhone");
			return this;
		}
		public NewAdditionalInterestPage clickCancel(WebDriver driver)  {
			BrowserActions.click(driver, btnCancel,"Cancel");
			return this;
		}
		public NewAdditionalInterestPage enterFaxPhoneExtension(WebDriver driver,String FaxPhoneExtension) {
			BrowserActions.type(driver, inpFaxPhoneExtension,FaxPhoneExtension, "FaxPhoneExtension");
			return this;
		}
		public NewAdditionalInterestPage clickDateofBirthDateIcon(WebDriver driver)  {
			BrowserActions.click(driver, btnDateofBirthDateIcon,"DateofBirthDateIcon");
			return this;
		}
	}

}


