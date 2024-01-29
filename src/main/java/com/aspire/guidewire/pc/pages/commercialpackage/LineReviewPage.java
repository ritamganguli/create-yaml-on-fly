package com.aspire.guidewire.pc.pages.commercialpackage;
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

public class LineReviewPage extends LoadableComponent<LineReviewPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Workplan>div[role='menuitem']", AI = false)
	public WebElement btnWorkplan;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_CopySubmission>div[role='menuitem']", AI = false)
	public WebElement btnCopySubmission;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-4-item>div[role='menuitem']", AI = false)
	public WebElement btnGeneralreminderdiary;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-8-item>div[role='menuitem']", AI = false)
	public WebElement btnGetReinsuranceQuote;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-13-item>div[role='menuitem']", AI = false)
	public WebElement btnReview45dayUWPeriod;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-CPPLineReviewSummaryDV-PolicyLine']", AI = false)
	public WebElement inpLine;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-ReviewSummaryCV-PolicyLineSummaryPanelSet-CPBuildingsAndLocationsLV-0-LastRiskAssessmentIsStaleIcon", AI = false)
	public WebElement btnLastRiskAssessmentIsStaleIcon;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-ReviewSummaryCV-PolicyLineSummaryPanelSet-CPBuildingsAndLocationsLV-0-0-BusPersPropLimit']", AI = false)
	public WebElement inpBusPersPropLimit;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-ReviewSummaryCV-PolicyLineSummaryPanelSet-CPBuildingsAndLocationsLV-0-LastRiskAssessmentEvaluation", AI = false)
	public WebElement btnLastRiskAssessmentEvaluation;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-JobWizardToolbarButtonSet-BindOptions-BindOnly>div[role='menuitem']", AI = false)
	public WebElement btnBindOnly;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-ReviewSummaryCV-PolicyLineSummaryPanelSet-CPBlanketPanelSet-CPBlanket-BlanketCovLV-1-Coverage']", AI = false)
	public WebElement inpCoverage_14;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-0-NewActivityMenuItemSet_Category>div[role='menuitem']", AI = false)
	public WebElement btnInterview;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-6-item>div[role='menuitem']", AI = false)
	public WebElement btnPerformanceReview;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-JobWizardToolbarButtonSet-Versions-NewVersion>div[role='menuitem']", AI = false)
	public WebElement btnStartMultiVersion;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-ReviewSummaryCV-PolicyLineSummaryPanelSet-CPBuildingsAndLocationsLV-0-Actions-RemoveLocation>div[role='menuitem']", AI = false)
	public WebElement btnRemoveLocation;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-15-item>div[role='menuitem']", AI = false)
	public WebElement btnReviewProducer;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-GLWizardStepGroup-GLLine>div[role='menuitem']", AI = false)
	public WebElement btnCoverages;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-ReviewSummaryCV-PolicyLineSummaryPanelSet-CPBlanketPanelSet-CPBlanket-CPBlanketCovCoinsurance']", AI = false)
	public WebElement drpCoinsurance;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-8-item>div[role='menuitem']", AI = false)
	public WebElement btnPolicyReviewMidterm;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-JobWizardToolbarButtonSet-Versions-ViewSideBySide>div[role='menuitem']", AI = false)
	public WebElement btnViewSideBySideVersions;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-0-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnCPP0090973652;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-BillingInfo>div[role='menuitem']", AI = false)
	public WebElement btnPayment;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-CPPLineReviewSummaryDV-ExpirationDate_dateIcon", AI = false)
	public WebElement btnExpirationDateDateIcon;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Change-WizardMenuActions_ChangeEffDate>div[role='menuitem']", AI = false)
	public WebElement btnEffectiveDate;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-CPPLineReviewSummaryDV-PolicyAddress-PolicyAddressDisplayInputSet-AddressType']", AI = false)
	public WebElement drpAddressType;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-ReviewSummaryCV-PolicyLineSummaryPanelSet-CPBlanketPanelSet-CPBlanket-BlanketCovLV-1-Building']", AI = false)
	public WebElement inpBuilding_13;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-CPPLineReviewSummaryDV-EffectiveDate_dateIcon", AI = false)
	public WebElement btnEffectiveDateDateIcon;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-ReviewSummaryCV-PolicyLineSummaryPanelSet-CPBlanketPanelSet-CPBlanket-BlanketCovLV-1-location']", AI = false)
	public WebElement inpLocation_12;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-CPPLineReviewSummaryDV-Product']", AI = false)
	public WebElement inpProduct;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-CPPLineReviewSummaryDV-PolicyAddress-PolicyAddressDisplayInputSet-globalAddressContainer-GlobalAddressInputSet-PostalCode']", AI = false)
	public WebElement inpZIPCode;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-ReviewSummaryCV-PolicyLineSummaryPanelSet-CPBlanketPanelSet-CPBlanket-CPBlanketLV-0-Number']", AI = false)
	public WebElement inpNumber;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-ReviewSummaryCV-PolicyLineSummaryPanelSet-CPBlanketPanelSet-CPBlanket-BlanketCovLV-0-Building']", AI = false)
	public WebElement inpBuilding;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-2-item>div[role='menuitem']", AI = false)
	public WebElement btn90daydiary;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-JobWizardToolbarButtonSet-BindOptions>div[role='button']", AI = false)
	public WebElement btnBindOptions;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-1-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnHOP0089846738;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-CPPLineReviewSummaryDV-PolicyAddress-PolicyAddressDisplayInputSet-globalAddressContainer-GlobalAddressInputSet-Country']", AI = false)
	public WebElement drpCountry;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-CPPLineReviewSummaryDV-PolicyAddress-PolicyAddressDisplayInputSet-globalAddressContainer-GlobalAddressInputSet-State']", AI = false)
	public WebElement drpState;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Archiving-WizardMenuActions_SuspendResumeArchiving>div[role='menuitem']", AI = false)
	public WebElement btnEnableDisable;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-JobWizardToolbarButtonSet-BindOptions-BindAndIssue>div[role='menuitem']", AI = false)
	public WebElement btnIssuePolicy;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-ReviewSummaryCV-PolicyLineSummaryPanelSet-CPBuildingsAndLocationsLV-0-0-BuildingCoverageCurrency']", AI = false)
	public WebElement drpBuildingCoverageCurrency;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-ReviewSummaryCV-PolicyLineSummaryPanelSet-CPBuildingsAndLocationsLV-BusIncomeHeader']", AI = false)
	public WebElement inpBusIncomeHeader;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-MultiQuoteAcceleratedMenuActions-PolicyPeriodSelector", AI = false)
	public WebElement btnPolicyPeriodSelector;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-1-NewActivityMenuItemSet_Category>div[role='menuitem']", AI = false)
	public WebElement btnNewmail;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-7-item>div[role='menuitem']", AI = false)
	public WebElement btnGetMotorVehicleReports;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-PreQualification>div[role='menuitem']", AI = false)
	public WebElement btnQualification;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-ReviewSummaryCV-PolicyLineSummaryPanelSet-CPBuildingsAndLocationsLV-0-LocationName']", AI = false)
	public WebElement inpLocationName;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Participants>div[role='menuitem']", AI = false)
	public WebElement btnParticipants;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-GLWizardStepGroup-GLLineEU>div[role='menuitem']", AI = false)
	public WebElement btnExposures;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-4-NewActivityMenuItemSet_Category-0-item>div[role='menuitem']", AI = false)
	public WebElement btnReviewandapprove;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-IMWizardStepGroup-0-impartstep>div[role='menuitem']", AI = false)
	public WebElement btnAccountsReceivable;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-IMWizardStepGroup-IMReview>div[role='menuitem']", AI = false)
	public WebElement btnLineReview_21;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-ReviewSummaryCV-PolicyLineSummaryPanelSet-CPBuildingsAndLocationsLV-0-Actions']", AI = false)
	public WebElement inpActions;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-CPWizardStepGroup>div[role='menuitem']", AI = false)
	public WebElement btnCommercialProperty;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-ReviewSummaryCV-PolicyLineSummaryPanelSet-CPBuildingsAndLocationsLV-0-0-BusIncome']", AI = false)
	public WebElement inpBusIncome;

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

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-ReviewSummaryCV-PolicyLineSummaryPanelSet-CPBlanketPanelSet-CPBlanket-BlanketCovLV-0-location']", AI = false)
	public WebElement inpLocation_8;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-ReviewSummaryCV-PolicyLineSummaryPanelSet-CPBlanketPanelSet-CPBlanket-BlanketCovLV-1-Limit']", AI = false)
	public WebElement inpLimit_15;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-0-NewActivityMenuItemSet_Category-0-item>div[role='menuitem']", AI = false)
	public WebElement btnMeetwithInsured;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-ReviewSummaryCV-PolicyLineSummaryPanelSet-CPBuildingsAndLocationsLV-LastRiskAssessmentEvaluationHeader']", AI = false)
	public WebElement inpLastRiskAssessmentEvaluationHeader;

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

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-GLWizardStepGroup>div[role='menuitem']", AI = false)
	public WebElement btnGeneralLiability;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-CPPLineReviewSummaryDV-PrimaryNamedInsured']", AI = false)
	public WebElement inpPrimaryNamedInsured;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-ReviewSummaryCV-PolicyLineSummaryPanelSet-CPBlanketPanelSet-CPBlanket-CPBlanketLV-0-Deductible']", AI = false)
	public WebElement inpDeductible;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-ReviewSummaryCV-PolicyLineSummaryPanelSet-CPBlanketPanelSet-CPBlanket-BlanketLocation']", AI = false)
	public WebElement inpLocation;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-CPWizardStepGroup-CPReview>div[role='menuitem']", AI = false)
	public WebElement btnLineReview_19;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-PolicyReview>div[role='menuitem']", AI = false)
	public WebElement btnPolicyReview;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-ReviewSummaryCV-PolicyLineSummaryPanelSet-CPBuildingsAndLocationsLV-0-Actions-SetPrimaryLocation>div[role='menuitem']", AI = false)
	public WebElement btnSetasPrimary;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-ReviewSummaryCV-PolicyLineSummaryPanelSet-CPBlanketPanelSet-CPBlanket-CPBlanketLV-0-GroupType']", AI = false)
	public WebElement drpGroupType;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-11-item>div[role='menuitem']", AI = false)
	public WebElement btnManuallyrateandquotepolicy;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-History>div[role='menuitem']", AI = false)
	public WebElement btnHistory;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Change>div[role='menuitem']", AI = false)
	public WebElement btnEdit;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-JobWizardToolbarButtonSet-CloseOptions-WithdrawJob>div[role='menuitem']", AI = false)
	public WebElement btnWithdrawTransaction;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-PolicyInfo>div[role='menuitem']", AI = false)
	public WebElement btnPolicyInfo;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-ViewMultiLineQuote>div[role='menuitem']", AI = false)
	public WebElement btnQuote_24;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-ViewQuote>div[role='menuitem']", AI = false)
	public WebElement btnQuote_23;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-JobWizardToolbarButtonSet-Versions>div[role='button']", AI = false)
	public WebElement btnVersions;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-GLWizardStepGroup-GLModifiers>div[role='menuitem']", AI = false)
	public WebElement btnModifiers;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_ToAccountFile>div[role='menuitem']", AI = false)
	public WebElement btnAccountFile;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-ReviewSummaryCV-PolicyLineSummaryPanelSet-CPBuildingsAndLocationsLV-0-Actions-AddBuilding>div[role='menuitem']", AI = false)
	public WebElement btnAddBuilding;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-ReviewSummaryCV-PolicyLineSummaryPanelSet-CPBlanketPanelSet-CPBlanket_tb-Remove>div[role='button']", AI = false)
	public WebElement btnRemove;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-ReviewSummaryCV-PolicyLineSummaryPanelSet-CPBlanketPanelSet-CPBlanket-BlanketCovLV-0-Coverage']", AI = false)
	public WebElement inpCoverage;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Change-WizardMenuActions_CopyPolicyData>div[role='menuitem']", AI = false)
	public WebElement btnCopyData;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-QuoteRequestedAlert-CloseBtn", AI = false)
	public WebElement btnClose;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-CPPLineReviewSummaryDV-DateQuoteNeeded']", AI = false)
	public WebElement inpDateQuoteNeeded;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-14-item>div[role='menuitem']", AI = false)
	public WebElement btnReview60dayUWPeriod;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-JobWizardToolbarButtonSet-EditPolicy>div[role='button']", AI = false)
	public WebElement btnEditPolicyTransaction;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity>div[role='menuitem']", AI = false)
	public WebElement btnNewActivity;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-ReviewSummaryCV-PolicyLineSummaryPanelSet-CPBuildingsAndLocationsLV-ActionsHeader']", AI = false)
	public WebElement inpActionsHeader;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Cancel>div[role='button']", AI = false)
	public WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup>div[role='menuitem']", AI = false)
	public WebElement btnPolicyContract;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category>div[role='menuitem']", AI = false)
	public WebElement btnRequest;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-ReviewSummaryCV-PolicyLineSummaryPanelSet-CPBuildingsAndLocationsLV-0-0-BuildingDescription']", AI = false)
	public WebElement inpBuildingDescription;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-9-item>div[role='menuitem']", AI = false)
	public WebElement btnGetRiskInformationProducer;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-CPPLineReviewSummaryDV-ExpirationDate']", AI = false)
	public WebElement inpExpirationDate;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-ReviewSummaryCV-PolicyLineSummaryPanelSet-CPBlanketPanelSet-CPBlanket-CPBlanketLV-0-Coinsurance']", AI = false)
	public WebElement inpCoinsurance;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-1-item>div[role='menuitem']", AI = false)
	public WebElement btnGetAuditInternalPersonnel;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-ReviewSummaryCV-PolicyLineSummaryPanelSet-CPBuildingsAndLocationsLV-ExtraExpenseHeader']", AI = false)
	public WebElement inpExtraExpenseHeader;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-CPPLineReviewSummaryDV-PolicyAddress-PolicyAddressDisplayInputSet-globalAddressContainer-GlobalAddressInputSet-PostalCode-AutoFillIcon", AI = false)
	public WebElement btnAutoFillIcon_1;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-ReviewSummaryCV-PolicyLineSummaryPanelSet-CPBuildingsAndLocationsLV-0-Actions-ActionsMenuIcon>div[role='button']", AI = false)
	public WebElement btnActionsMenuIcon;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-MultiQuoteAcceleratedMenuActions-PolicyPeriodSelector-PolicyPeriodSelector_Arg']", AI = false)
	public WebElement drpPolicyPeriodSelector_Arg;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-CPPLineReviewSummaryDV-PolicyAddress-PolicyAddressDisplayInputSet-AddressDescription']", AI = false)
	public WebElement inpAddressDescription;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-DiagWorksheetItem-ShowDiagWorksheet>div[role='menuitem']", AI = false)
	public WebElement btnShowPartialWorksheet;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-1-item>div[role='menuitem']", AI = false)
	public WebElement btn60daydiary;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-CPPLineReviewSummaryDV-PolicyAddress-PolicyAddressDisplayInputSet-globalAddressContainer-GlobalAddressInputSet-County']", AI = false)
	public WebElement inpCounty;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Prev>div[role='button']", AI = false)
	public WebElement btnBack;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-CPPLocations>div[role='menuitem']", AI = false)
	public WebElement btnLocations;

	@IFindBy(how = How.CSS, using = "div[id$='Next']", AI = false)
	public WebElement btnNext;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-10-item>div[role='menuitem']", AI = false)
	public WebElement btnQuoteRequired;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-ReviewSummaryCV-PolicyLineSummaryPanelSet-CPBlanketPanelSet-CPBlanket-Description']", AI = false)
	public WebElement inpDescription_6;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-JobWizardToolbarButtonSet-Draft>div[role='button']", AI = false)
	public WebElement btnSaveDraft;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-PolicyVersions>div[role='menuitem']", AI = false)
	public WebElement btnPolicyVersions_25;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-3-item>div[role='menuitem']", AI = false)
	public WebElement btnGetBureauData;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-ReviewSummaryCV-PolicyLineSummaryPanelSet-CPBuildingsAndLocationsLV-0-0-BldgLimit']", AI = false)
	public WebElement inpBldgLimit;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Reinsurance>div[role='menuitem']", AI = false)
	public WebElement btnReinsurance;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-ReviewSummaryCV-PolicyLineSummaryPanelSet-CPBuildingsAndLocationsLV-0-0-ExtraExpense']", AI = false)
	public WebElement inpExtraExpense;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-QuoteRequestedAlert .gw-AlertBar--label", AI = false)
	public WebElement lblQuoteRequestedAlert;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-CPPLineSelection>div[role='menuitem']", AI = false)
	public WebElement btnLineSelection;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-JobGroupItem>div[role='menuitem']", AI = false)
	public WebElement btnSG00898467384031233002;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-CPPLineReviewSummaryDV-PolicyAddress-PolicyAddressDisplayInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine3']", AI = false)
	public WebElement inpAddress3;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-CPPLineReviewSummaryDV-PolicyAddress-PolicyAddressDisplayInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine1']", AI = false)
	public WebElement inpAddress1;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-CPPLineReviewSummaryDV-PolicyAddress-PolicyAddressDisplayInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine2']", AI = false)
	public WebElement inpAddress2;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewDocument-NewJobDocumentMenuItemSet-PolicyPeriodNewDocumentMenuItemSet_Template>div[role='menuitem']", AI = false)
	public WebElement btnCreatefromatemplate;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-CPWizardStepGroup-CPBuildings>div[role='menuitem']", AI = false)
	public WebElement btnBuildingsandLocations;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-RiskEvaluation>div[role='menuitem']", AI = false)
	public WebElement btnRiskAnalysis_26;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-JobWizardToolbarButtonSet-Versions-SideBySide>div[role='menuitem']", AI = false)
	public WebElement btnStartSidebySide;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-CPPLineReviewSummaryDV-PolicyAddress-PolicyAddressDisplayInputSet-globalAddressContainer-GlobalAddressInputSet-AddressSummary']", AI = false)
	public WebElement inpAddress;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Archiving>div[role='menuitem']", AI = false)
	public WebElement btnArchiving;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-ReviewSummaryCV-PolicyLineSummaryPanelSet-CPBlanketPanelSet-CPBlanket-CPBlanketLV-0-Limit']", AI = false)
	public WebElement inpLimit;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-CPPLineReviewSummaryDV-PolicyAddress-PolicyAddressDisplayInputSet-globalAddressContainer-GlobalAddressInputSet-City-AutoFillIcon", AI = false)
	public WebElement btnAutoFillIcon;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-JobWizardToolbarButtonSet-CloseOptions-NotTakenJob>div[role='menuitem']", AI = false)
	public WebElement btnNotTaken;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-ReviewSummaryCV-PolicyLineSummaryPanelSet-CPBlanketPanelSet-CPBlanket-CPBlanketCovDeductible']", AI = false)
	public WebElement drpDeductible;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Documents>div[role='menuitem']", AI = false)
	public WebElement btnDocuments;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-ReviewSummaryCV-PolicyLineSummaryPanelSet-CPBlanketPanelSet-CPBlanket-CPBlanketLV-0-PreferredCoverageCurrency']", AI = false)
	public WebElement drpCoveragesin;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-CPWizardStepGroup-CPModifiers>div[role='menuitem']", AI = false)
	public WebElement btnModifiers_18;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-JobWizardToolbarButtonSet-QuoteTypeToolbarButtonSet-Quote>div[role='button']", AI = false)
	public WebElement btnQuote;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-JobWizardToolbarButtonSet-Unlock>div[role='button']", AI = false)
	public WebElement btnReleaseLock;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-ReviewSummaryCV-PolicyLineSummaryPanelSet-CPBlanketPanelSet-CPBlanket-BlanketDetailsTab", AI = false)
	public WebElement btnDetails_3;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-0-item>div[role='menuitem']", AI = false)
	public WebElement btnCreateNewProducer;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Forms>div[role='menuitem']", AI = false)
	public WebElement btnForms;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-CPWizardStepGroup-CPBlanket>div[role='menuitem']", AI = false)
	public WebElement btnBlankets;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-ReviewSummaryCV-PolicyLineSummaryPanelSet-CPBlanketPanelSet-CPBlanket-BlanketNum']", AI = false)
	public WebElement inpNumber_4;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-CPPModifiers>div[role='menuitem']", AI = false)
	public WebElement btnModifiers_22;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Notes>div[role='menuitem']", AI = false)
	public WebElement btnNotes;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-CPPLineReviewSummaryDV-EffectiveDate']", AI = false)
	public WebElement inpEffectiveDate;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-5-item>div[role='menuitem']", AI = false)
	public WebElement btnGetInspectionLossControl;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-ReviewSummaryCV-PolicyLineSummaryPanelSet-CPBlanketPanelSet-CPBlanket-BlanketCovLV-0-Limit']", AI = false)
	public WebElement inpLimit_9;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-ReviewSummaryCV-PolicyLineSummaryPanelSet-CPBlanketPanelSet-CPBlanket-CPBlanketCovLimit']", AI = false)
	public WebElement inpLimit_7;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create>div[role='menuitem']", AI = false)
	public WebElement btnCreate;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-ReviewSummaryCV-PolicyLineSummaryPanelSet-CPBlanketPanelSet-CPBlanket-CPBlanketLV-0-Description']", AI = false)
	public WebElement inpDescription;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-ReviewSummaryCV-PolicyLineSummaryPanelSet-CPBlanketPanelSet-CPBlanket-BlanketCovLV-1-Coinsurance']", AI = false)
	public WebElement inpCoinsurance_17;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-10-item>div[role='menuitem']", AI = false)
	public WebElement btnLegalreview;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-CPPLineReviewSummaryDV-DateQuoteNeeded_dateIcon", AI = false)
	public WebElement btnDateQuoteNeededDateIcon;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-7-item>div[role='menuitem']", AI = false)
	public WebElement btnPolicynotification;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-ReviewSummaryCV-PolicyLineSummaryPanelSet-CPBlanketPanelSet-CPBlanket-BlanketGroupType']", AI = false)
	public WebElement drpGroupType_5;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-CPPLineReviewSummaryDV-PolicyAddress-PolicyAddressDisplayInputSet-globalAddressContainer-GlobalAddressInputSet-City']", AI = false)
	public WebElement inpCity;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-ReviewSummaryCV-PolicyLineSummaryPanelSet-CPBlanketPanelSet-CPBlanket-PreferredCoverageCurrencySelectorRef-PreferredCoverageCurrencyPanelSet-PreferredCoverageCurrencySelectorDropDown']", AI = false)
	public WebElement drpCoveragesin_2;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto>div[role='menuitem']", AI = false)
	public WebElement btnGoto;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-ReviewSummaryCV-PolicyLineSummaryPanelSet-CPBuildingsAndLocationsLV-0-Actions-AddBuilding-AddExistingBuildings>div[role='menuitem']", AI = false)
	public WebElement btnExistingBuilding;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-4-NewActivityMenuItemSet_Category>div[role='menuitem']", AI = false)
	public WebElement btnUnderwriterReview;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-0-item>div[role='menuitem']", AI = false)
	public WebElement btn30daydiary;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-ReviewSummaryCV-PolicyLineSummaryPanelSet-CPBuildingsAndLocationsLV-0-Actions-AddBuilding-AddExistingBuildings-AddMoreBuildings>div[role='menuitem']", AI = false)
	public WebElement btnMoreBuildings;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-IMWizardStepGroup-2-impartstep>div[role='menuitem']", AI = false)
	public WebElement btnSigns;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-SideBySide>div[role='menuitem']", AI = false)
	public WebElement btnSidebySideQuoting;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-IMWizardStepGroup>div[role='menuitem']", AI = false)
	public WebElement btnInlandMarine;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-CollectCreditCard>div[role='menuitem']", AI = false)
	public WebElement btnCollectCreditCard;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-ReviewSummaryCV-PolicyLineSummaryPanelSet-CPBlanketPanelSet-CPBlanket-BlanketType']", AI = false)
	public WebElement drpBlanketType;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-ReviewSummaryCV-PolicyLineSummaryPanelSet-CPBlanketPanelSet-CPBlanket-BlanketCovLV-0-Coinsurance']", AI = false)
	public WebElement inpCoinsurance_11;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-ReviewSummaryCV-PolicyLineSummaryPanelSet-CPBuildingsAndLocationsLV-CoverageCurrency']", AI = false)
	public WebElement inpCoverageCurrency;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-ReviewSummaryCV-PolicyLineSummaryPanelSet-CPBlanketPanelSet-CPBlanket-BlanketDetailsTab", AI = false)
	public WebElement btnDetails;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-11-item>div[role='menuitem']", AI = false)
	public WebElement btnRatiooutofrange;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-JobWizardToolbarButtonSet-ConvertToFullApp>div[role='button']", AI = false)
	public WebElement btnFullApp;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-DiagWorksheetItem>div[role='menuitem']", AI = false)
	public WebElement btnDiagnosticData;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category>div[role='menuitem']", AI = false)
	public WebElement btnReminder;

	@IFindBy(how = How.CSS, using = "div[id$='LineReviewScreen-ttlBar']", AI = false)
	public WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-IMWizardStepGroup-IMPartSelection>div[role='menuitem']", AI = false)
	public WebElement btnCoveragePartSelection;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-ReviewSummaryCV-LineSummaryTab", AI = false)
	public WebElement btnSummary;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-ReviewSummaryCV-PolicyLineSummaryPanelSet-CPBuildingsAndLocationsLV-BuildingBPPHeader']", AI = false)
	public WebElement inpBuildingBPPHeader;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-IMWizardStepGroup-Buildings>div[role='menuitem']", AI = false)
	public WebElement btnBuildingsandLocations_20;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-1-NewActivityMenuItemSet_Category-0-item>div[role='menuitem']", AI = false)
	public WebElement btnReviewnewmail;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup>div[role='menuitem']", AI = false)
	public WebElement btnGroup;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-3-item>div[role='menuitem']", AI = false)
	public WebElement btnCancelasplitpolicy;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-ReviewSummaryCV-PolicyLineSummaryPanelSet-CPBlanketPanelSet-CPBlanket-BlanketCovLV-1-Deductible']", AI = false)
	public WebElement inpDeductible_16;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-2-item>div[role='menuitem']", AI = false)
	public WebElement btnGetAuditOutsideService;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-ReviewSummaryCV-PolicyLineSummaryPanelSet-CPBuildingsAndLocationsLV-0-Actions-AddBuilding-AddNewBuilding>div[role='menuitem']", AI = false)
	public WebElement btnNewBuilding;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-5-item>div[role='menuitem']", AI = false)
	public WebElement btnNewAuditAssignment;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-16-item>div[role='menuitem']", AI = false)
	public WebElement btnRewritetoNewAccount;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-12-item>div[role='menuitem']", AI = false)
	public WebElement btnReview30dayUWPeriod;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-ManageBranches>div[role='menuitem']", AI = false)
	public WebElement btnPolicyVersions;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-ReviewSummaryCV-PolicyLineSummaryPanelSet-CPBlanketPanelSet-CPBlanket-BlanketCovLV-0-Deductible']", AI = false)
	public WebElement inpDeductible_10;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-ReviewSummaryCV-PolicyLineSummaryPanelSet-CPBuildingsAndLocationsLV-BuildingDescHeader']", AI = false)
	public WebElement inpBuildingDescHeader;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-IMWizardStepGroup-1-impartstep>div[role='menuitem']", AI = false)
	public WebElement btnContractorsEquipment;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-ReviewSummaryCV-PolicyLineSummaryPanelSet-CPBlanketPanelSet-CPBlanket_tb-AddBlanket>div[role='button']", AI = false)
	public WebElement btnAddBlanket;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-JobWizardToolbarButtonSet-CloseOptions>div[role='button']", AI = false)
	public WebElement btnCloseOptions;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_ToPolicyFile>div[role='menuitem']", AI = false)
	public WebElement btnPolicyFile;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-ReviewSummaryCV-PolicyLineSummaryPanelSet-CPBuildingsAndLocationsLV-BuildingLimitHeader']", AI = false)
	public WebElement inpBuildingLimitHeader;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-17-item>div[role='menuitem']", AI = false)
	public WebElement btnVerifycoverage;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-4-item>div[role='menuitem']", AI = false)
	public WebElement btnGetCreditReports;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-ReviewSummaryCV-PolicyLineSummaryPanelSet-CPBlanketPanelSet-CPBlanket-PreferredCoverageCurrencySelectorRef-PreferredCoverageCurrencyPanelSet-CoverageCurrencyDisplay']", AI = false)
	public WebElement inpCoveragesin;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CPWizardStepGroup-CPPLineReviewScreen-JobWizardToolbarButtonSet-CloseOptions-Decline>div[role='menuitem']", AI = false)
	public WebElement btnDecline;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-GLWizardStepGroup-GLReview>div[role='menuitem']", AI = false)
	public WebElement btnLineReview;

	@IFindBy(how = How.CSS, using = "div[id=$'SubmissionWizard-WizardMenuActions']>div[role='button']", AI = false)
	public WebElement btnWizardMenuActions;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardActionsMenuItemSet-SubmissionInfo>div[role='menuitem']", AI = false)
	public WebElement btnSubManager;

	public LineReviewPage(){
	}

	public LineReviewPage(WebDriver driver){
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
	}public LineReviewPage clickWorkplan(WebDriver driver)  {
		BrowserActions.click(driver, btnWorkplan,"Workplan");
		return this;
	}
	public LineReviewPage clickCopySubmission(WebDriver driver)  {
		BrowserActions.click(driver, btnCopySubmission,"CopySubmission");
		return this;
	}
	public LineReviewPage clickGeneralreminderdiary(WebDriver driver)  {
		BrowserActions.click(driver, btnGeneralreminderdiary,"Generalreminderdiary");
		return this;
	}
	public LineReviewPage clickGetReinsuranceQuote(WebDriver driver)  {
		BrowserActions.click(driver, btnGetReinsuranceQuote,"GetReinsuranceQuote");
		return this;
	}
	public LineReviewPage clickReview45dayUWPeriod(WebDriver driver)  {
		BrowserActions.click(driver, btnReview45dayUWPeriod,"Review45dayUWPeriod");
		return this;
	}
	public LineReviewPage enterLine(WebDriver driver,String Line) {
		BrowserActions.type(driver, inpLine,Line, "Line");
		return this;
	}
	public LineReviewPage clickLastRiskAssessmentIsStaleIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnLastRiskAssessmentIsStaleIcon,"LastRiskAssessmentIsStaleIcon");
		return this;
	}
	public LineReviewPage enterBusPersPropLimit(WebDriver driver,String BusPersPropLimit) {
		BrowserActions.type(driver, inpBusPersPropLimit,BusPersPropLimit, "BusPersPropLimit");
		return this;
	}
	public LineReviewPage clickLastRiskAssessmentEvaluation(WebDriver driver)  {
		BrowserActions.click(driver, btnLastRiskAssessmentEvaluation,"LastRiskAssessmentEvaluation");
		return this;
	}
	public LineReviewPage clickBindOnly(WebDriver driver)  {
		BrowserActions.click(driver, btnBindOnly,"BindOnly");
		return this;
	}
	public LineReviewPage enterCoverage_14(WebDriver driver,String Coverage_14) {
		BrowserActions.type(driver, inpCoverage_14,Coverage_14, "Coverage_14");
		return this;
	}
	public LineReviewPage clickInterview(WebDriver driver)  {
		BrowserActions.click(driver, btnInterview,"Interview");
		return this;
	}
	public LineReviewPage clickPerformanceReview(WebDriver driver)  {
		BrowserActions.click(driver, btnPerformanceReview,"PerformanceReview");
		return this;
	}
	public LineReviewPage clickStartMultiVersion(WebDriver driver)  {
		BrowserActions.click(driver, btnStartMultiVersion,"StartMultiVersion");
		return this;
	}
	public LineReviewPage clickRemoveLocation(WebDriver driver)  {
		BrowserActions.click(driver, btnRemoveLocation,"RemoveLocation");
		return this;
	}
	public LineReviewPage clickReviewProducer(WebDriver driver)  {
		BrowserActions.click(driver, btnReviewProducer,"ReviewProducer");
		return this;
	}
	public LineReviewPage clickCoverages(WebDriver driver)  {
		BrowserActions.click(driver, btnCoverages,"Coverages");
		return this;
	}
	public LineReviewPage selectCoinsurance(WebDriver driver,String Coinsurance)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCoinsurance,Coinsurance,"Coinsurance");
		return this;
	}
	public LineReviewPage clickPolicyReviewMidterm(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyReviewMidterm,"PolicyReviewMidterm");
		return this;
	}
	public LineReviewPage clickViewSideBySideVersions(WebDriver driver)  {
		BrowserActions.click(driver, btnViewSideBySideVersions,"ViewSideBySideVersions");
		return this;
	}
	public LineReviewPage clickCPP0090973652(WebDriver driver)  {
		BrowserActions.click(driver, btnCPP0090973652,"CPP0090973652");
		return this;
	}
	public LineReviewPage clickPayment(WebDriver driver)  {
		BrowserActions.click(driver, btnPayment,"Payment");
		return this;
	}
	public LineReviewPage clickExpirationDateDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnExpirationDateDateIcon,"ExpirationDateDateIcon");
		return this;
	}
	public LineReviewPage clickEffectiveDate(WebDriver driver)  {
		BrowserActions.click(driver, btnEffectiveDate,"EffectiveDate");
		return this;
	}
	public LineReviewPage selectAddressType(WebDriver driver,String AddressType)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpAddressType,AddressType,"AddressType");
		return this;
	}
	public LineReviewPage enterBuilding_13(WebDriver driver,String Building_13) {
		BrowserActions.type(driver, inpBuilding_13,Building_13, "Building_13");
		return this;
	}
	public LineReviewPage clickEffectiveDateDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnEffectiveDateDateIcon,"EffectiveDateDateIcon");
		return this;
	}
	public LineReviewPage enterLocation_12(WebDriver driver,String Location_12) {
		BrowserActions.type(driver, inpLocation_12,Location_12, "Location_12");
		return this;
	}
	public LineReviewPage enterProduct(WebDriver driver,String Product) {
		BrowserActions.type(driver, inpProduct,Product, "Product");
		return this;
	}
	public LineReviewPage enterZIPCode(WebDriver driver,String ZIPCode) {
		BrowserActions.type(driver, inpZIPCode,ZIPCode, "ZIPCode");
		return this;
	}
	public LineReviewPage enterNumber(WebDriver driver,String Number) {
		BrowserActions.type(driver, inpNumber,Number, "Number");
		return this;
	}
	public LineReviewPage enterBuilding(WebDriver driver,String Building) {
		BrowserActions.type(driver, inpBuilding,Building, "Building");
		return this;
	}
	public LineReviewPage click90daydiary(WebDriver driver)  {
		BrowserActions.click(driver, btn90daydiary,"90daydiary");
		return this;
	}
	public LineReviewPage clickBindOptions(WebDriver driver)  {
		BrowserActions.click(driver, btnBindOptions,"BindOptions");
		return this;
	}
	public LineReviewPage clickHOP0089846738(WebDriver driver)  {
		BrowserActions.click(driver, btnHOP0089846738,"HOP0089846738");
		return this;
	}
	public LineReviewPage selectCountry(WebDriver driver,String Country)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCountry,Country,"Country");
		return this;
	}
	public LineReviewPage selectState(WebDriver driver,String State)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpState,State,"State");
		return this;
	}
	public LineReviewPage clickEnableDisable(WebDriver driver)  {
		BrowserActions.click(driver, btnEnableDisable,"EnableDisable");
		return this;
	}
	public LineReviewPage clickIssuePolicy(WebDriver driver)  {
		BrowserActions.click(driver, btnIssuePolicy,"IssuePolicy");
		return this;
	}
	public LineReviewPage selectBuildingCoverageCurrency(WebDriver driver,String BuildingCoverageCurrency)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpBuildingCoverageCurrency,BuildingCoverageCurrency,"BuildingCoverageCurrency");
		return this;
	}
	public LineReviewPage enterBusIncomeHeader(WebDriver driver,String BusIncomeHeader) {
		BrowserActions.type(driver, inpBusIncomeHeader,BusIncomeHeader, "BusIncomeHeader");
		return this;
	}
	public LineReviewPage clickPolicyPeriodSelector(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyPeriodSelector,"PolicyPeriodSelector");
		return this;
	}
	public LineReviewPage clickNewmail(WebDriver driver)  {
		BrowserActions.click(driver, btnNewmail,"Newmail");
		return this;
	}
	public LineReviewPage clickGetMotorVehicleReports(WebDriver driver)  {
		BrowserActions.click(driver, btnGetMotorVehicleReports,"GetMotorVehicleReports");
		return this;
	}
	public LineReviewPage clickQualification(WebDriver driver)  {
		BrowserActions.click(driver, btnQualification,"Qualification");
		return this;
	}
	public LineReviewPage enterLocationName(WebDriver driver,String LocationName) {
		BrowserActions.type(driver, inpLocationName,LocationName, "LocationName");
		return this;
	}
	public LineReviewPage clickParticipants(WebDriver driver)  {
		BrowserActions.click(driver, btnParticipants,"Participants");
		return this;
	}
	public LineReviewPage clickExposures(WebDriver driver)  {
		BrowserActions.click(driver, btnExposures,"Exposures");
		return this;
	}
	public LineReviewPage clickReviewandapprove(WebDriver driver)  {
		BrowserActions.click(driver, btnReviewandapprove,"Reviewandapprove");
		return this;
	}
	public LineReviewPage clickAccountsReceivable(WebDriver driver)  {
		BrowserActions.click(driver, btnAccountsReceivable,"AccountsReceivable");
		return this;
	}
	public LineReviewPage clickLineReview_21(WebDriver driver)  {
		BrowserActions.click(driver, btnLineReview_21,"LineReview_21");
		return this;
	}
	public LineReviewPage enterActions(WebDriver driver,String Actions) {
		BrowserActions.type(driver, inpActions,Actions, "Actions");
		return this;
	}
	public LineReviewPage clickCommercialProperty(WebDriver driver)  {
		BrowserActions.click(driver, btnCommercialProperty,"CommercialProperty");
		return this;
	}
	public LineReviewPage enterBusIncome(WebDriver driver,String BusIncome) {
		BrowserActions.type(driver, inpBusIncome,BusIncome, "BusIncome");
		return this;
	}
	public LineReviewPage clickNewDocument(WebDriver driver)  {
		BrowserActions.click(driver, btnNewDocument,"NewDocument");
		return this;
	}
	public LineReviewPage clickUploaddocuments(WebDriver driver)  {
		BrowserActions.click(driver, btnUploaddocuments,"Uploaddocuments");
		return this;
	}
	public LineReviewPage clickFinish(WebDriver driver)  {
		BrowserActions.click(driver, btnFinish,"Finish");
		return this;
	}
	public LineReviewPage clickProductDefinition(WebDriver driver)  {
		BrowserActions.click(driver, btnProductDefinition,"ProductDefinition");
		return this;
	}
	public LineReviewPage clickGetInspectionOutsideService(WebDriver driver)  {
		BrowserActions.click(driver, btnGetInspectionOutsideService,"GetInspectionOutsideService");
		return this;
	}
	public LineReviewPage enterLocation_8(WebDriver driver,String Location_8) {
		BrowserActions.type(driver, inpLocation_8,Location_8, "Location_8");
		return this;
	}
	public LineReviewPage enterLimit_15(WebDriver driver,String Limit_15) {
		BrowserActions.type(driver, inpLimit_15,Limit_15, "Limit_15");
		return this;
	}
	public LineReviewPage clickMeetwithInsured(WebDriver driver)  {
		BrowserActions.click(driver, btnMeetwithInsured,"MeetwithInsured");
		return this;
	}
	public LineReviewPage enterLastRiskAssessmentEvaluationHeader(WebDriver driver,String LastRiskAssessmentEvaluationHeader) {
		BrowserActions.type(driver, inpLastRiskAssessmentEvaluationHeader,LastRiskAssessmentEvaluationHeader, "LastRiskAssessmentEvaluationHeader");
		return this;
	}
	public LineReviewPage clickOfferings(WebDriver driver)  {
		BrowserActions.click(driver, btnOfferings,"Offerings");
		return this;
	}
	public LineReviewPage clickPolicyReviewRenewal(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyReviewRenewal,"PolicyReviewRenewal");
		return this;
	}
	public LineReviewPage clickNewNote(WebDriver driver)  {
		BrowserActions.click(driver, btnNewNote,"NewNote");
		return this;
	}
	public LineReviewPage clickRiskAnalysis(WebDriver driver)  {
		BrowserActions.click(driver, btnRiskAnalysis,"RiskAnalysis");
		return this;
	}
	public LineReviewPage clickMeetwithProducerAgency(WebDriver driver)  {
		BrowserActions.click(driver, btnMeetwithProducerAgency,"MeetwithProducerAgency");
		return this;
	}
	public LineReviewPage clickGeneralLiability(WebDriver driver)  {
		BrowserActions.click(driver, btnGeneralLiability,"GeneralLiability");
		return this;
	}
	public LineReviewPage enterPrimaryNamedInsured(WebDriver driver,String PrimaryNamedInsured) {
		BrowserActions.type(driver, inpPrimaryNamedInsured,PrimaryNamedInsured, "PrimaryNamedInsured");
		return this;
	}
	public LineReviewPage enterDeductible(WebDriver driver,String Deductible) {
		BrowserActions.type(driver, inpDeductible,Deductible, "Deductible");
		return this;
	}
	public LineReviewPage enterLocation(WebDriver driver,String Location) {
		BrowserActions.type(driver, inpLocation,Location, "Location");
		return this;
	}
	public LineReviewPage clickLineReview_19(WebDriver driver)  {
		BrowserActions.click(driver, btnLineReview_19,"LineReview_19");
		return this;
	}
	public LineReviewPage clickPolicyReview(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyReview,"PolicyReview");
		return this;
	}
	public LineReviewPage clickSetasPrimary(WebDriver driver)  {
		BrowserActions.click(driver, btnSetasPrimary,"SetasPrimary");
		return this;
	}
	public LineReviewPage selectGroupType(WebDriver driver,String GroupType)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpGroupType,GroupType,"GroupType");
		return this;
	}
	public LineReviewPage clickManuallyrateandquotepolicy(WebDriver driver)  {
		BrowserActions.click(driver, btnManuallyrateandquotepolicy,"Manuallyrateandquotepolicy");
		return this;
	}
	public LineReviewPage clickHistory(WebDriver driver)  {
		BrowserActions.click(driver, btnHistory,"History");
		return this;
	}
	public LineReviewPage clickEdit(WebDriver driver)  {
		BrowserActions.click(driver, btnEdit,"Edit");
		return this;
	}
	public LineReviewPage clickWithdrawTransaction(WebDriver driver)  {
		BrowserActions.click(driver, btnWithdrawTransaction,"WithdrawTransaction");
		return this;
	}
	public LineReviewPage clickPolicyInfo(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyInfo,"PolicyInfo");
		return this;
	}
	public LineReviewPage clickQuote_24(WebDriver driver)  {
		BrowserActions.click(driver, btnQuote_24,"Quote_24");
		return this;
	}
	public LineReviewPage clickQuote_23(WebDriver driver)  {
		BrowserActions.click(driver, btnQuote_23,"Quote_23");
		return this;
	}
	public LineReviewPage clickVersions(WebDriver driver)  {
		BrowserActions.click(driver, btnVersions,"Versions");
		return this;
	}
	public LineReviewPage clickModifiers(WebDriver driver)  {
		BrowserActions.click(driver, btnModifiers,"Modifiers");
		return this;
	}
	public LineReviewPage clickAccountFile(WebDriver driver)  {
		BrowserActions.click(driver, btnAccountFile,"AccountFile");
		return this;
	}
	public LineReviewPage clickAddBuilding(WebDriver driver)  {
		BrowserActions.click(driver, btnAddBuilding,"AddBuilding");
		return this;
	}
	public LineReviewPage clickRemove(WebDriver driver)  {
		BrowserActions.click(driver, btnRemove,"Remove");
		return this;
	}
	public LineReviewPage enterCoverage(WebDriver driver,String Coverage) {
		BrowserActions.type(driver, inpCoverage,Coverage, "Coverage");
		return this;
	}
	public LineReviewPage clickCopyData(WebDriver driver)  {
		BrowserActions.click(driver, btnCopyData,"CopyData");
		return this;
	}
	public LineReviewPage clickClose(WebDriver driver)  {
		BrowserActions.click(driver, btnClose,"Close");
		return this;
	}
	public LineReviewPage enterDateQuoteNeeded(WebDriver driver,String DateQuoteNeeded) {
		BrowserActions.type(driver, inpDateQuoteNeeded,DateQuoteNeeded, "DateQuoteNeeded");
		return this;
	}
	public LineReviewPage clickReview60dayUWPeriod(WebDriver driver)  {
		BrowserActions.click(driver, btnReview60dayUWPeriod,"Review60dayUWPeriod");
		return this;
	}
	public LineReviewPage clickEditPolicyTransaction(WebDriver driver)  {
		BrowserActions.click(driver, btnEditPolicyTransaction,"EditPolicyTransaction");
		return this;
	}
	public LineReviewPage clickNewActivity(WebDriver driver)  {
		BrowserActions.click(driver, btnNewActivity,"NewActivity");
		return this;
	}
	public LineReviewPage enterActionsHeader(WebDriver driver,String ActionsHeader) {
		BrowserActions.type(driver, inpActionsHeader,ActionsHeader, "ActionsHeader");
		return this;
	}
	public LineReviewPage clickCancel(WebDriver driver)  {
		BrowserActions.click(driver, btnCancel,"Cancel");
		return this;
	}
	public LineReviewPage clickPolicyContract(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyContract,"PolicyContract");
		return this;
	}
	public LineReviewPage clickRequest(WebDriver driver)  {
		BrowserActions.click(driver, btnRequest,"Request");
		return this;
	}
	public LineReviewPage enterBuildingDescription(WebDriver driver,String BuildingDescription) {
		BrowserActions.type(driver, inpBuildingDescription,BuildingDescription, "BuildingDescription");
		return this;
	}
	public LineReviewPage clickGetRiskInformationProducer(WebDriver driver)  {
		BrowserActions.click(driver, btnGetRiskInformationProducer,"GetRiskInformationProducer");
		return this;
	}
	public LineReviewPage enterExpirationDate(WebDriver driver,String ExpirationDate) {
		BrowserActions.type(driver, inpExpirationDate,ExpirationDate, "ExpirationDate");
		return this;
	}
	public LineReviewPage enterCoinsurance(WebDriver driver,String Coinsurance) {
		BrowserActions.type(driver, inpCoinsurance,Coinsurance, "Coinsurance");
		return this;
	}
	public LineReviewPage clickGetAuditInternalPersonnel(WebDriver driver)  {
		BrowserActions.click(driver, btnGetAuditInternalPersonnel,"GetAuditInternalPersonnel");
		return this;
	}
	public LineReviewPage enterExtraExpenseHeader(WebDriver driver,String ExtraExpenseHeader) {
		BrowserActions.type(driver, inpExtraExpenseHeader,ExtraExpenseHeader, "ExtraExpenseHeader");
		return this;
	}
	public LineReviewPage clickAutoFillIcon_1(WebDriver driver)  {
		BrowserActions.click(driver, btnAutoFillIcon_1,"AutoFillIcon_1");
		return this;
	}
	public LineReviewPage clickActionsMenuIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnActionsMenuIcon,"ActionsMenuIcon");
		return this;
	}
	public LineReviewPage selectPolicyPeriodSelector_Arg(WebDriver driver,String PolicyPeriodSelector_Arg)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPolicyPeriodSelector_Arg,PolicyPeriodSelector_Arg,"PolicyPeriodSelector_Arg");
		return this;
	}
	public LineReviewPage enterAddressDescription(WebDriver driver,String AddressDescription) {
		BrowserActions.type(driver, inpAddressDescription,AddressDescription, "AddressDescription");
		return this;
	}
	public LineReviewPage clickShowPartialWorksheet(WebDriver driver)  {
		BrowserActions.click(driver, btnShowPartialWorksheet,"ShowPartialWorksheet");
		return this;
	}
	public LineReviewPage click60daydiary(WebDriver driver)  {
		BrowserActions.click(driver, btn60daydiary,"60daydiary");
		return this;
	}
	public LineReviewPage enterCounty(WebDriver driver,String County) {
		BrowserActions.type(driver, inpCounty,County, "County");
		return this;
	}
	public LineReviewPage clickBack(WebDriver driver)  {
		BrowserActions.click(driver, btnBack,"Back");
		return this;
	}
	public LineReviewPage clickLocations(WebDriver driver)  {
		BrowserActions.click(driver, btnLocations,"Locations");
		return this;
	}
	public LineReviewPage clickNext(WebDriver driver)  {
		BrowserActions.click(driver, btnNext,"Next");
		return this;
	}
	public LineReviewPage clickQuoteRequired(WebDriver driver)  {
		BrowserActions.click(driver, btnQuoteRequired,"QuoteRequired");
		return this;
	}
	public LineReviewPage enterDescription_6(WebDriver driver,String Description_6) {
		BrowserActions.type(driver, inpDescription_6,Description_6, "Description_6");
		return this;
	}
	public LineReviewPage clickSaveDraft(WebDriver driver)  {
		BrowserActions.click(driver, btnSaveDraft,"SaveDraft");
		return this;
	}
	public LineReviewPage clickPolicyVersions_25(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyVersions_25,"PolicyVersions_25");
		return this;
	}
	public LineReviewPage clickGetBureauData(WebDriver driver)  {
		BrowserActions.click(driver, btnGetBureauData,"GetBureauData");
		return this;
	}
	public LineReviewPage enterBldgLimit(WebDriver driver,String BldgLimit) {
		BrowserActions.type(driver, inpBldgLimit,BldgLimit, "BldgLimit");
		return this;
	}
	public LineReviewPage clickReinsurance(WebDriver driver)  {
		BrowserActions.click(driver, btnReinsurance,"Reinsurance");
		return this;
	}
	public LineReviewPage enterExtraExpense(WebDriver driver,String ExtraExpense) {
		BrowserActions.type(driver, inpExtraExpense,ExtraExpense, "ExtraExpense");
		return this;
	}
	public LineReviewPage clickLineSelection(WebDriver driver)  {
		BrowserActions.click(driver, btnLineSelection,"LineSelection");
		return this;
	}
	public LineReviewPage clickSG00898467384031233002(WebDriver driver)  {
		BrowserActions.click(driver, btnSG00898467384031233002,"SG00898467384031233002");
		return this;
	}
	public LineReviewPage enterAddress3(WebDriver driver,String Address3) {
		BrowserActions.type(driver, inpAddress3,Address3, "Address3");
		return this;
	}
	public LineReviewPage enterAddress1(WebDriver driver,String Address1) {
		BrowserActions.type(driver, inpAddress1,Address1, "Address1");
		return this;
	}
	public LineReviewPage enterAddress2(WebDriver driver,String Address2) {
		BrowserActions.type(driver, inpAddress2,Address2, "Address2");
		return this;
	}
	public LineReviewPage clickCreatefromatemplate(WebDriver driver)  {
		BrowserActions.click(driver, btnCreatefromatemplate,"Createfromatemplate");
		return this;
	}
	public LineReviewPage clickBuildingsandLocations(WebDriver driver)  {
		BrowserActions.click(driver, btnBuildingsandLocations,"BuildingsandLocations");
		return this;
	}
	public LineReviewPage clickRiskAnalysis_26(WebDriver driver)  {
		BrowserActions.click(driver, btnRiskAnalysis_26,"RiskAnalysis_26");
		return this;
	}
	public LineReviewPage clickStartSidebySide(WebDriver driver)  {
		BrowserActions.click(driver, btnStartSidebySide,"StartSidebySide");
		return this;
	}
	public LineReviewPage enterAddress(WebDriver driver,String Address) {
		BrowserActions.type(driver, inpAddress,Address, "Address");
		return this;
	}
	public LineReviewPage clickArchiving(WebDriver driver)  {
		BrowserActions.click(driver, btnArchiving,"Archiving");
		return this;
	}
	public LineReviewPage enterLimit(WebDriver driver,String Limit) {
		BrowserActions.type(driver, inpLimit,Limit, "Limit");
		return this;
	}
	public LineReviewPage clickAutoFillIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnAutoFillIcon,"AutoFillIcon");
		return this;
	}
	public LineReviewPage clickNotTaken(WebDriver driver)  {
		BrowserActions.click(driver, btnNotTaken,"NotTaken");
		return this;
	}
	public LineReviewPage selectDeductible(WebDriver driver,String Deductible)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpDeductible,Deductible,"Deductible");
		return this;
	}
	public LineReviewPage clickDocuments(WebDriver driver)  {
		BrowserActions.click(driver, btnDocuments,"Documents");
		return this;
	}
	public LineReviewPage selectCoveragesin(WebDriver driver,String Coveragesin)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCoveragesin,Coveragesin,"Coveragesin");
		return this;
	}
	public LineReviewPage clickModifiers_18(WebDriver driver)  {
		BrowserActions.click(driver, btnModifiers_18,"Modifiers_18");
		return this;
	}
	public LineReviewPage clickQuote(WebDriver driver)  {
		BrowserActions.click(driver, btnQuote,"Quote");
		return this;
	}
	public LineReviewPage clickReleaseLock(WebDriver driver)  {
		BrowserActions.click(driver, btnReleaseLock,"ReleaseLock");
		return this;
	}
	public LineReviewPage clickDetails_3(WebDriver driver)  {
		BrowserActions.click(driver, btnDetails_3,"Details_3");
		return this;
	}
	public LineReviewPage clickCreateNewProducer(WebDriver driver)  {
		BrowserActions.click(driver, btnCreateNewProducer,"CreateNewProducer");
		return this;
	}
	public LineReviewPage clickForms(WebDriver driver)  {
		BrowserActions.click(driver, btnForms,"Forms");
		return this;
	}
	public LineReviewPage clickBlankets(WebDriver driver)  {
		BrowserActions.click(driver, btnBlankets,"Blankets");
		return this;
	}
	public LineReviewPage enterNumber_4(WebDriver driver,String Number_4) {
		BrowserActions.type(driver, inpNumber_4,Number_4, "Number_4");
		return this;
	}
	public LineReviewPage clickModifiers_22(WebDriver driver)  {
		BrowserActions.click(driver, btnModifiers_22,"Modifiers_22");
		return this;
	}
	public LineReviewPage clickNotes(WebDriver driver)  {
		BrowserActions.click(driver, btnNotes,"Notes");
		return this;
	}
	public LineReviewPage enterEffectiveDate(WebDriver driver,String EffectiveDate) {
		BrowserActions.type(driver, inpEffectiveDate,EffectiveDate, "EffectiveDate");
		return this;
	}
	public LineReviewPage clickGetInspectionLossControl(WebDriver driver)  {
		BrowserActions.click(driver, btnGetInspectionLossControl,"GetInspectionLossControl");
		return this;
	}
	public LineReviewPage enterLimit_9(WebDriver driver,String Limit_9) {
		BrowserActions.type(driver, inpLimit_9,Limit_9, "Limit_9");
		return this;
	}
	public LineReviewPage enterLimit_7(WebDriver driver,String Limit_7) {
		BrowserActions.type(driver, inpLimit_7,Limit_7, "Limit_7");
		return this;
	}
	public LineReviewPage clickCreate(WebDriver driver)  {
		BrowserActions.click(driver, btnCreate,"Create");
		return this;
	}
	public LineReviewPage enterDescription(WebDriver driver,String Description) {
		BrowserActions.type(driver, inpDescription,Description, "Description");
		return this;
	}
	public LineReviewPage enterCoinsurance_17(WebDriver driver,String Coinsurance_17) {
		BrowserActions.type(driver, inpCoinsurance_17,Coinsurance_17, "Coinsurance_17");
		return this;
	}
	public LineReviewPage clickLegalreview(WebDriver driver)  {
		BrowserActions.click(driver, btnLegalreview,"Legalreview");
		return this;
	}
	public LineReviewPage clickDateQuoteNeededDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnDateQuoteNeededDateIcon,"DateQuoteNeededDateIcon");
		return this;
	}
	public LineReviewPage clickPolicynotification(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicynotification,"Policynotification");
		return this;
	}
	public LineReviewPage selectGroupType_5(WebDriver driver,String GroupType_5)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpGroupType_5,GroupType_5,"GroupType_5");
		return this;
	}
	public LineReviewPage enterCity(WebDriver driver,String City) {
		BrowserActions.type(driver, inpCity,City, "City");
		return this;
	}
	public LineReviewPage selectCoveragesin_2(WebDriver driver,String Coveragesin_2)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCoveragesin_2,Coveragesin_2,"Coveragesin_2");
		return this;
	}
	public LineReviewPage clickGoto(WebDriver driver)  {
		BrowserActions.click(driver, btnGoto,"Goto");
		return this;
	}
	public LineReviewPage clickExistingBuilding(WebDriver driver)  {
		BrowserActions.click(driver, btnExistingBuilding,"ExistingBuilding");
		return this;
	}
	public LineReviewPage clickUnderwriterReview(WebDriver driver)  {
		BrowserActions.click(driver, btnUnderwriterReview,"UnderwriterReview");
		return this;
	}
	public LineReviewPage click30daydiary(WebDriver driver)  {
		BrowserActions.click(driver, btn30daydiary,"30daydiary");
		return this;
	}
	public LineReviewPage clickMoreBuildings(WebDriver driver)  {
		BrowserActions.click(driver, btnMoreBuildings,"MoreBuildings");
		return this;
	}
	public LineReviewPage clickSigns(WebDriver driver)  {
		BrowserActions.click(driver, btnSigns,"Signs");
		return this;
	}
	public LineReviewPage clickSidebySideQuoting(WebDriver driver)  {
		BrowserActions.click(driver, btnSidebySideQuoting,"SidebySideQuoting");
		return this;
	}
	public LineReviewPage clickInlandMarine(WebDriver driver)  {
		BrowserActions.click(driver, btnInlandMarine,"InlandMarine");
		return this;
	}
	public LineReviewPage clickCollectCreditCard(WebDriver driver)  {
		BrowserActions.click(driver, btnCollectCreditCard,"CollectCreditCard");
		return this;
	}
	public LineReviewPage selectBlanketType(WebDriver driver,String BlanketType)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpBlanketType,BlanketType,"BlanketType");
		return this;
	}
	public LineReviewPage enterCoinsurance_11(WebDriver driver,String Coinsurance_11) {
		BrowserActions.type(driver, inpCoinsurance_11,Coinsurance_11, "Coinsurance_11");
		return this;
	}
	public LineReviewPage enterCoverageCurrency(WebDriver driver,String CoverageCurrency) {
		BrowserActions.type(driver, inpCoverageCurrency,CoverageCurrency, "CoverageCurrency");
		return this;
	}
	public LineReviewPage clickDetails(WebDriver driver)  {
		BrowserActions.click(driver, btnDetails,"Details");
		return this;
	}
	public LineReviewPage clickRatiooutofrange(WebDriver driver)  {
		BrowserActions.click(driver, btnRatiooutofrange,"Ratiooutofrange");
		return this;
	}
	public LineReviewPage clickFullApp(WebDriver driver)  {
		BrowserActions.click(driver, btnFullApp,"FullApp");
		return this;
	}
	public LineReviewPage clickDiagnosticData(WebDriver driver)  {
		BrowserActions.click(driver, btnDiagnosticData,"DiagnosticData");
		return this;
	}
	public LineReviewPage clickReminder(WebDriver driver)  {
		BrowserActions.click(driver, btnReminder,"Reminder");
		return this;
	}
	public LineReviewPage clickCoveragePartSelection(WebDriver driver)  {
		BrowserActions.click(driver, btnCoveragePartSelection,"CoveragePartSelection");
		return this;
	}
	public LineReviewPage clickSummary(WebDriver driver)  {
		BrowserActions.click(driver, btnSummary,"Summary");
		return this;
	}
	public LineReviewPage enterBuildingBPPHeader(WebDriver driver,String BuildingBPPHeader) {
		BrowserActions.type(driver, inpBuildingBPPHeader,BuildingBPPHeader, "BuildingBPPHeader");
		return this;
	}
	public LineReviewPage clickBuildingsandLocations_20(WebDriver driver)  {
		BrowserActions.click(driver, btnBuildingsandLocations_20,"BuildingsandLocations_20");
		return this;
	}
	public LineReviewPage clickReviewnewmail(WebDriver driver)  {
		BrowserActions.click(driver, btnReviewnewmail,"Reviewnewmail");
		return this;
	}
	public LineReviewPage clickGroup(WebDriver driver)  {
		BrowserActions.click(driver, btnGroup,"Group");
		return this;
	}
	public LineReviewPage clickCancelasplitpolicy(WebDriver driver)  {
		BrowserActions.click(driver, btnCancelasplitpolicy,"Cancelasplitpolicy");
		return this;
	}
	public LineReviewPage enterDeductible_16(WebDriver driver,String Deductible_16) {
		BrowserActions.type(driver, inpDeductible_16,Deductible_16, "Deductible_16");
		return this;
	}
	public LineReviewPage clickGetAuditOutsideService(WebDriver driver)  {
		BrowserActions.click(driver, btnGetAuditOutsideService,"GetAuditOutsideService");
		return this;
	}
	public LineReviewPage clickNewBuilding(WebDriver driver)  {
		BrowserActions.click(driver, btnNewBuilding,"NewBuilding");
		return this;
	}
	public LineReviewPage clickNewAuditAssignment(WebDriver driver)  {
		BrowserActions.click(driver, btnNewAuditAssignment,"NewAuditAssignment");
		return this;
	}
	public LineReviewPage clickRewritetoNewAccount(WebDriver driver)  {
		BrowserActions.click(driver, btnRewritetoNewAccount,"RewritetoNewAccount");
		return this;
	}
	public LineReviewPage clickReview30dayUWPeriod(WebDriver driver)  {
		BrowserActions.click(driver, btnReview30dayUWPeriod,"Review30dayUWPeriod");
		return this;
	}
	public LineReviewPage clickPolicyVersions(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyVersions,"PolicyVersions");
		return this;
	}
	public LineReviewPage enterDeductible_10(WebDriver driver,String Deductible_10) {
		BrowserActions.type(driver, inpDeductible_10,Deductible_10, "Deductible_10");
		return this;
	}
	public LineReviewPage enterBuildingDescHeader(WebDriver driver,String BuildingDescHeader) {
		BrowserActions.type(driver, inpBuildingDescHeader,BuildingDescHeader, "BuildingDescHeader");
		return this;
	}
	public LineReviewPage clickContractorsEquipment(WebDriver driver)  {
		BrowserActions.click(driver, btnContractorsEquipment,"ContractorsEquipment");
		return this;
	}
	public LineReviewPage clickAddBlanket(WebDriver driver)  {
		BrowserActions.click(driver, btnAddBlanket,"AddBlanket");
		return this;
	}
	public LineReviewPage clickCloseOptions(WebDriver driver)  {
		BrowserActions.click(driver, btnCloseOptions,"CloseOptions");
		return this;
	}
	public LineReviewPage clickPolicyFile(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyFile,"PolicyFile");
		return this;
	}
	public LineReviewPage enterBuildingLimitHeader(WebDriver driver,String BuildingLimitHeader) {
		BrowserActions.type(driver, inpBuildingLimitHeader,BuildingLimitHeader, "BuildingLimitHeader");
		return this;
	}
	public LineReviewPage clickVerifycoverage(WebDriver driver)  {
		BrowserActions.click(driver, btnVerifycoverage,"Verifycoverage");
		return this;
	}
	public LineReviewPage clickGetCreditReports(WebDriver driver)  {
		BrowserActions.click(driver, btnGetCreditReports,"GetCreditReports");
		return this;
	}
	public LineReviewPage enterCoveragesin(WebDriver driver,String Coveragesin) {
		BrowserActions.type(driver, inpCoveragesin,Coveragesin, "Coveragesin");
		return this;
	}
	public LineReviewPage clickDecline(WebDriver driver)  {
		BrowserActions.click(driver, btnDecline,"Decline");
		return this;
	}
	public LineReviewPage clickLineReview(WebDriver driver)  {
		BrowserActions.click(driver, btnLineReview,"LineReview");
		return this;
	}
	public LineReviewPage clickWizardMenuActions(WebDriver driver)  {
		BrowserActions.click(driver, btnWizardMenuActions,"WizardMenuActions");
		return this;
	}
	public LineReviewPage clickSubManager(WebDriver driver)  {
		BrowserActions.click(driver, btnSubManager,"SubManager");
		return this;
	}
}