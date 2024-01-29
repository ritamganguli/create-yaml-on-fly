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

public class AccountsReceivablePage extends LoadableComponent<AccountsReceivablePage> {

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

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-IMWizardStepGroup-IMPartScreen-JobWizardToolbarButtonSet-BindOptions-BindOnly>div[role='menuitem']", AI = false)
	public WebElement btnBindOnly;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-0-NewActivityMenuItemSet_Category>div[role='menuitem']", AI = false)
	public WebElement btnInterview;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-6-item>div[role='menuitem']", AI = false)
	public WebElement btnPerformanceReview;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-IMWizardStepGroup-IMPartScreen-JobWizardToolbarButtonSet-Versions-NewVersion>div[role='menuitem']", AI = false)
	public WebElement btnStartMultiVersion;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-15-item>div[role='menuitem']", AI = false)
	public WebElement btnReviewProducer;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-GLWizardStepGroup-GLLine>div[role='menuitem']", AI = false)
	public WebElement btnCoverages;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-8-item>div[role='menuitem']", AI = false)
	public WebElement btnPolicyReviewMidterm;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-IMWizardStepGroup-IMPartScreen-JobWizardToolbarButtonSet-Versions-ViewSideBySide>div[role='menuitem']", AI = false)
	public WebElement btnViewSideBySideVersions;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-IMWizardStepGroup-IMPartScreen-IMARPanelSet-IMARExcludedAccountsDV-Remove>div[role='button']", AI = false)
	public WebElement btnRemove_2;

	@IFindBy(how = How.CSS, using = "select[name$='coinsurance']", AI = false)
	public WebElement drpCoinsurancePct;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-0-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnCPP0090973652;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-BillingInfo>div[role='menuitem']", AI = false)
	public WebElement btnPayment;

	@IFindBy(how = How.CSS, using = "select[name$='businessClass']", AI = false)
	public WebElement drpBusinessClass;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Change-WizardMenuActions_ChangeEffDate>div[role='menuitem']", AI = false)
	public WebElement btnEffectiveDate;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-IMWizardStepGroup-IMPartScreen-OOSEPanelSet-NextSliceLink", AI = false)
	public WebElement btnNextBlockedDate;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-2-item>div[role='menuitem']", AI = false)
	public WebElement btn90daydiary;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-IMWizardStepGroup-IMPartScreen-JobWizardToolbarButtonSet-BindOptions>div[role='button']", AI = false)
	public WebElement btnBindOptions;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-1-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnHOP0089846738;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Archiving-WizardMenuActions_SuspendResumeArchiving>div[role='menuitem']", AI = false)
	public WebElement btnEnableDisable;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-IMWizardStepGroup-IMPartScreen-JobWizardToolbarButtonSet-BindOptions-BindAndIssue>div[role='menuitem']", AI = false)
	public WebElement btnIssuePolicy;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-MultiQuoteAcceleratedMenuActions-PolicyPeriodSelector", AI = false)
	public WebElement btnPolicyPeriodSelector;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-1-NewActivityMenuItemSet_Category>div[role='menuitem']", AI = false)
	public WebElement btnNewmail;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-7-item>div[role='menuitem']", AI = false)
	public WebElement btnGetMotorVehicleReports;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-PreQualification>div[role='menuitem']", AI = false)
	public WebElement btnQualification;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Participants>div[role='menuitem']", AI = false)
	public WebElement btnParticipants;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-GLWizardStepGroup-GLLineEU>div[role='menuitem']", AI = false)
	public WebElement btnExposures;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-4-NewActivityMenuItemSet_Category-0-item>div[role='menuitem']", AI = false)
	public WebElement btnReviewandapprove;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-IMWizardStepGroup-0-impartstep>div[role='menuitem']", AI = false)
	public WebElement btnAccountsReceivable;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-IMWizardStepGroup-IMPartScreen-OOSEPanelSet-OOSEPeriodSelector-OOSEPeriodSelector_Arg']", AI = false)
	public WebElement drpEffectiveDate;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-CPWizardStepGroup>div[role='menuitem']", AI = false)
	public WebElement btnCommercialProperty;

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

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-GLWizardStepGroup>div[role='menuitem']", AI = false)
	public WebElement btnGeneralLiability;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-PolicyReview>div[role='menuitem']", AI = false)
	public WebElement btnPolicyReview;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-IMWizardStepGroup-IMPartScreen-OOSEPanelSet-OOSEPeriodSelector", AI = false)
	public WebElement btnOOSEPeriodSelector;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-11-item>div[role='menuitem']", AI = false)
	public WebElement btnManuallyrateandquotepolicy;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-History>div[role='menuitem']", AI = false)
	public WebElement btnHistory;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Change>div[role='menuitem']", AI = false)
	public WebElement btnEdit;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-IMWizardStepGroup-IMPartScreen-JobWizardToolbarButtonSet-CloseOptions-WithdrawJob>div[role='menuitem']", AI = false)
	public WebElement btnWithdrawTransaction;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-PolicyInfo>div[role='menuitem']", AI = false)
	public WebElement btnPolicyInfo;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-IMWizardStepGroup-IMPartScreen-JobWizardToolbarButtonSet-Versions>div[role='button']", AI = false)
	public WebElement btnVersions;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-GLWizardStepGroup-GLModifiers>div[role='menuitem']", AI = false)
	public WebElement btnModifiers;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_ToAccountFile>div[role='menuitem']", AI = false)
	public WebElement btnAccountFile;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-IMWizardStepGroup-IMPartScreen-IMARPanelSet-IMARItemDV-Remove>div[role='button']", AI = false)
	public WebElement btnRemove;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Change-WizardMenuActions_CopyPolicyData>div[role='menuitem']", AI = false)
	public WebElement btnCopyData;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-IMWizardStepGroup-IMPartScreen-QuoteRequestedAlert-CloseBtn", AI = false)
	public WebElement btnClose;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-14-item>div[role='menuitem']", AI = false)
	public WebElement btnReview60dayUWPeriod;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-IMWizardStepGroup-IMPartScreen-JobWizardToolbarButtonSet-EditPolicy>div[role='button']", AI = false)
	public WebElement btnEditPolicyTransaction;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-IMWizardStepGroup-IMPartScreen-IMARPanelSet-IMARExcludedAccountsDV-Add>div[role='button']", AI = false)
	public WebElement btnAdd_1;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity>div[role='menuitem']", AI = false)
	public WebElement btnNewActivity;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Cancel>div[role='button']", AI = false)
	public WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup>div[role='menuitem']", AI = false)
	public WebElement btnPolicyContract;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category>div[role='menuitem']", AI = false)
	public WebElement btnRequest;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-9-item>div[role='menuitem']", AI = false)
	public WebElement btnGetRiskInformationProducer;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-1-item>div[role='menuitem']", AI = false)
	public WebElement btnGetAuditInternalPersonnel;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-MultiQuoteAcceleratedMenuActions-PolicyPeriodSelector-PolicyPeriodSelector_Arg']", AI = false)
	public WebElement drpPolicyPeriodSelector_Arg;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-IMWizardStepGroup-Buildings>div[role='menuitem']", AI = false)
	public WebElement btnBuildingsandLocations_5;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-DiagWorksheetItem-ShowDiagWorksheet>div[role='menuitem']", AI = false)
	public WebElement btnShowPartialWorksheet;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-1-item>div[role='menuitem']", AI = false)
	public WebElement btn60daydiary;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Prev>div[role='button']", AI = false)
	public WebElement btnBack;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-CPPLocations>div[role='menuitem']", AI = false)
	public WebElement btnLocations;

	@IFindBy(how = How.CSS, using = "div[id$='Next']", AI = false)
	public WebElement btnNext;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-10-item>div[role='menuitem']", AI = false)
	public WebElement btnQuoteRequired;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-CPWizardStepGroup-CPModifiers>div[role='menuitem']", AI = false)
	public WebElement btnModifiers_3;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-IMWizardStepGroup-IMPartScreen-JobWizardToolbarButtonSet-Draft>div[role='button']", AI = false)
	public WebElement btnSaveDraft;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-3-item>div[role='menuitem']", AI = false)
	public WebElement btnGetBureauData;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-CPPModifiers>div[role='menuitem']", AI = false)
	public WebElement btnModifiers_7;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Reinsurance>div[role='menuitem']", AI = false)
	public WebElement btnReinsurance;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-IMWizardStepGroup-IMPartScreen-QuoteRequestedAlert .gw-AlertBar--label", AI = false)
	public WebElement lblQuoteRequestedAlert;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-CPPLineSelection>div[role='menuitem']", AI = false)
	public WebElement btnLineSelection;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-JobGroupItem>div[role='menuitem']", AI = false)
	public WebElement btnSG00898467384031233002;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewDocument-NewJobDocumentMenuItemSet-PolicyPeriodNewDocumentMenuItemSet_Template>div[role='menuitem']", AI = false)
	public WebElement btnCreatefromatemplate;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-CPWizardStepGroup-CPBuildings>div[role='menuitem']", AI = false)
	public WebElement btnBuildingsandLocations;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-IMWizardStepGroup-IMPartScreen-JobWizardToolbarButtonSet-Versions-SideBySide>div[role='menuitem']", AI = false)
	public WebElement btnStartSidebySide;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-PolicyVersions>div[role='menuitem']", AI = false)
	public WebElement btnPolicyVersions_10;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Archiving>div[role='menuitem']", AI = false)
	public WebElement btnArchiving;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-IMWizardStepGroup-IMPartScreen-JobWizardToolbarButtonSet-CloseOptions-NotTakenJob>div[role='menuitem']", AI = false)
	public WebElement btnNotTaken;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Documents>div[role='menuitem']", AI = false)
	public WebElement btnDocuments;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-IMWizardStepGroup-IMPartScreen-IMARPanelSet-PreferredCoverageCurrencySelectorRef-PreferredCoverageCurrencyPanelSet-PreferredCoverageCurrencySelectorDropDown']", AI = false)
	public WebElement drpCoveragesin;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-IMWizardStepGroup-IMPartScreen-JobWizardToolbarButtonSet-QuoteTypeToolbarButtonSet-Quote>div[role='button']", AI = false)
	public WebElement btnQuote;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-RiskEvaluation>div[role='menuitem']", AI = false)
	public WebElement btnRiskAnalysis_11;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-IMWizardStepGroup-IMPartScreen-JobWizardToolbarButtonSet-Unlock>div[role='button']", AI = false)
	public WebElement btnReleaseLock;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-IMWizardStepGroup-IMPartScreen-IMARPanelSet-IMARPartLevelInformationDV-reporting']", AI = false)
	public WebElement rdbReporting;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-IMWizardStepGroup-IMPartScreen-IMARPanelSet-IMARPartLevelInformationDV-0-CoverageInputSet-CovPatternInputGroup-_checkbox']", AI = false)
	public WebElement chk_checkbox;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-0-item>div[role='menuitem']", AI = false)
	public WebElement btnCreateNewProducer;

	@IFindBy(how = How.CSS, using = "div[id$='Add']", AI = false)
	public WebElement btnAdd;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Forms>div[role='menuitem']", AI = false)
	public WebElement btnForms;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-CPWizardStepGroup-CPBlanket>div[role='menuitem']", AI = false)
	public WebElement btnBlankets;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Notes>div[role='menuitem']", AI = false)
	public WebElement btnNotes;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-5-item>div[role='menuitem']", AI = false)
	public WebElement btnGetInspectionLossControl;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-ViewMultiLineQuote>div[role='menuitem']", AI = false)
	public WebElement btnQuote_9;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-ViewQuote>div[role='menuitem']", AI = false)
	public WebElement btnQuote_8;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create>div[role='menuitem']", AI = false)
	public WebElement btnCreate;

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

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-IMWizardStepGroup-2-impartstep>div[role='menuitem']", AI = false)
	public WebElement btnSigns;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-SideBySide>div[role='menuitem']", AI = false)
	public WebElement btnSidebySideQuoting;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-IMWizardStepGroup-IMPartScreen-IMARPanelSet-title1", AI = false)
	public WebElement lblTitle1;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-IMWizardStepGroup>div[role='menuitem']", AI = false)
	public WebElement btnInlandMarine;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-CollectCreditCard>div[role='menuitem']", AI = false)
	public WebElement btnCollectCreditCard;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-CPWizardStepGroup-CPReview>div[role='menuitem']", AI = false)
	public WebElement btnLineReview_4;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-IMWizardStepGroup-IMReview>div[role='menuitem']", AI = false)
	public WebElement btnLineReview_6;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-11-item>div[role='menuitem']", AI = false)
	public WebElement btnRatiooutofrange;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-IMWizardStepGroup-IMPartScreen-JobWizardToolbarButtonSet-ConvertToFullApp>div[role='button']", AI = false)
	public WebElement btnFullApp;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-IMWizardStepGroup-IMPartScreen-IMARPanelSet-title2", AI = false)
	public WebElement lblTitle2;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-IMWizardStepGroup-IMPartScreen-IMARPanelSet-title3", AI = false)
	public WebElement lblTitle3;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-DiagWorksheetItem>div[role='menuitem']", AI = false)
	public WebElement btnDiagnosticData;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category>div[role='menuitem']", AI = false)
	public WebElement btnReminder;

	@IFindBy(how = How.XPATH, using = "(//div[text()='Accounts Receivable'])[2]", AI = false)
	public WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-IMWizardStepGroup-IMPartSelection>div[role='menuitem']", AI = false)
	public WebElement btnCoveragePartSelection;

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

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-IMWizardStepGroup-1-impartstep>div[role='menuitem']", AI = false)
	public WebElement btnContractorsEquipment;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-IMWizardStepGroup-IMPartScreen-JobWizardToolbarButtonSet-CloseOptions>div[role='button']", AI = false)
	public WebElement btnCloseOptions;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_ToPolicyFile>div[role='menuitem']", AI = false)
	public WebElement btnPolicyFile;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-17-item>div[role='menuitem']", AI = false)
	public WebElement btnVerifycoverage;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-4-item>div[role='menuitem']", AI = false)
	public WebElement btnGetCreditReports;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-IMWizardStepGroup-IMPartScreen-IMARPanelSet-PreferredCoverageCurrencySelectorRef-PreferredCoverageCurrencyPanelSet-CoverageCurrencyDisplay']", AI = false)
	public WebElement inpCoveragesin;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-IMWizardStepGroup-IMPartScreen-JobWizardToolbarButtonSet-CloseOptions-Decline>div[role='menuitem']", AI = false)
	public WebElement btnDecline;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-GLWizardStepGroup-GLReview>div[role='menuitem']", AI = false)
	public WebElement btnLineReview;

	@IFindBy(how = How.CSS, using = "div[id=$'SubmissionWizard-WizardMenuActions']>div[role='button']", AI = false)
	public WebElement btnWizardMenuActions;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardActionsMenuItemSet-SubmissionInfo>div[role='menuitem']", AI = false)
	public WebElement btnSubManager;

	@IFindBy(how = How.CSS, using = "select[name$='buildingcell']", AI = false)
	public WebElement drpLocationBuilding;

	@IFindBy(how = How.CSS, using = "select[name$='containercell']", AI = false)
	public WebElement drpReceptacleType;

	@IFindBy(how = How.CSS, using = "select[name$='duplicatedCell']", AI = false)
	public WebElement drpPercentDuplicated;

	@IFindBy(how = How.CSS, using = "input[name$='ARLlimitCell']", AI = false)
	public WebElement inpLimit;

	public AccountsReceivablePage(){
	}

	public AccountsReceivablePage(WebDriver driver){
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
	}public AccountsReceivablePage clickWorkplan(WebDriver driver)  {
		BrowserActions.click(driver, btnWorkplan,"Workplan");
		return this;
	}
	public AccountsReceivablePage clickCopySubmission(WebDriver driver)  {
		BrowserActions.click(driver, btnCopySubmission,"CopySubmission");
		return this;
	}
	public AccountsReceivablePage clickGeneralreminderdiary(WebDriver driver)  {
		BrowserActions.click(driver, btnGeneralreminderdiary,"Generalreminderdiary");
		return this;
	}
	public AccountsReceivablePage clickGetReinsuranceQuote(WebDriver driver)  {
		BrowserActions.click(driver, btnGetReinsuranceQuote,"GetReinsuranceQuote");
		return this;
	}
	public AccountsReceivablePage clickReview45dayUWPeriod(WebDriver driver)  {
		BrowserActions.click(driver, btnReview45dayUWPeriod,"Review45dayUWPeriod");
		return this;
	}
	public AccountsReceivablePage clickBindOnly(WebDriver driver)  {
		BrowserActions.click(driver, btnBindOnly,"BindOnly");
		return this;
	}
	public AccountsReceivablePage clickInterview(WebDriver driver)  {
		BrowserActions.click(driver, btnInterview,"Interview");
		return this;
	}
	public AccountsReceivablePage clickPerformanceReview(WebDriver driver)  {
		BrowserActions.click(driver, btnPerformanceReview,"PerformanceReview");
		return this;
	}
	public AccountsReceivablePage clickStartMultiVersion(WebDriver driver)  {
		BrowserActions.click(driver, btnStartMultiVersion,"StartMultiVersion");
		return this;
	}
	public AccountsReceivablePage clickReviewProducer(WebDriver driver)  {
		BrowserActions.click(driver, btnReviewProducer,"ReviewProducer");
		return this;
	}
	public AccountsReceivablePage clickCoverages(WebDriver driver)  {
		BrowserActions.click(driver, btnCoverages,"Coverages");
		return this;
	}
	public AccountsReceivablePage clickPolicyReviewMidterm(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyReviewMidterm,"PolicyReviewMidterm");
		return this;
	}
	public AccountsReceivablePage clickViewSideBySideVersions(WebDriver driver)  {
		BrowserActions.click(driver, btnViewSideBySideVersions,"ViewSideBySideVersions");
		return this;
	}
	public AccountsReceivablePage clickRemove_2(WebDriver driver)  {
		BrowserActions.click(driver, btnRemove_2,"Remove_2");
		return this;
	}
	public AccountsReceivablePage selectCoinsurancePct(WebDriver driver,String CoinsurancePct)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCoinsurancePct,CoinsurancePct,"CoinsurancePct");
		return this;
	}
	public AccountsReceivablePage clickCPP0090973652(WebDriver driver)  {
		BrowserActions.click(driver, btnCPP0090973652,"CPP0090973652");
		return this;
	}
	public AccountsReceivablePage clickPayment(WebDriver driver)  {
		BrowserActions.click(driver, btnPayment,"Payment");
		return this;
	}
	public AccountsReceivablePage selectBusinessClass(WebDriver driver,String BusinessClass)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpBusinessClass,BusinessClass,"BusinessClass");
		return this;
	}
	public AccountsReceivablePage clickEffectiveDate(WebDriver driver)  {
		BrowserActions.click(driver, btnEffectiveDate,"EffectiveDate");
		return this;
	}
	public AccountsReceivablePage clickNextBlockedDate(WebDriver driver)  {
		BrowserActions.click(driver, btnNextBlockedDate,"NextBlockedDate");
		return this;
	}
	public AccountsReceivablePage click90daydiary(WebDriver driver)  {
		BrowserActions.click(driver, btn90daydiary,"90daydiary");
		return this;
	}
	public AccountsReceivablePage clickBindOptions(WebDriver driver)  {
		BrowserActions.click(driver, btnBindOptions,"BindOptions");
		return this;
	}
	public AccountsReceivablePage clickHOP0089846738(WebDriver driver)  {
		BrowserActions.click(driver, btnHOP0089846738,"HOP0089846738");
		return this;
	}
	public AccountsReceivablePage clickEnableDisable(WebDriver driver)  {
		BrowserActions.click(driver, btnEnableDisable,"EnableDisable");
		return this;
	}
	public AccountsReceivablePage clickIssuePolicy(WebDriver driver)  {
		BrowserActions.click(driver, btnIssuePolicy,"IssuePolicy");
		return this;
	}
	public AccountsReceivablePage clickPolicyPeriodSelector(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyPeriodSelector,"PolicyPeriodSelector");
		return this;
	}
	public AccountsReceivablePage clickNewmail(WebDriver driver)  {
		BrowserActions.click(driver, btnNewmail,"Newmail");
		return this;
	}
	public AccountsReceivablePage clickGetMotorVehicleReports(WebDriver driver)  {
		BrowserActions.click(driver, btnGetMotorVehicleReports,"GetMotorVehicleReports");
		return this;
	}
	public AccountsReceivablePage clickQualification(WebDriver driver)  {
		BrowserActions.click(driver, btnQualification,"Qualification");
		return this;
	}
	public AccountsReceivablePage clickParticipants(WebDriver driver)  {
		BrowserActions.click(driver, btnParticipants,"Participants");
		return this;
	}
	public AccountsReceivablePage clickExposures(WebDriver driver)  {
		BrowserActions.click(driver, btnExposures,"Exposures");
		return this;
	}
	public AccountsReceivablePage clickReviewandapprove(WebDriver driver)  {
		BrowserActions.click(driver, btnReviewandapprove,"Reviewandapprove");
		return this;
	}
	public AccountsReceivablePage clickAccountsReceivable(WebDriver driver)  {
		BrowserActions.click(driver, btnAccountsReceivable,"AccountsReceivable");
		return this;
	}
	public AccountsReceivablePage selectEffectiveDate(WebDriver driver,String EffectiveDate)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpEffectiveDate,EffectiveDate,"EffectiveDate");
		return this;
	}
	public AccountsReceivablePage clickCommercialProperty(WebDriver driver)  {
		BrowserActions.click(driver, btnCommercialProperty,"CommercialProperty");
		return this;
	}
	public AccountsReceivablePage clickNewDocument(WebDriver driver)  {
		BrowserActions.click(driver, btnNewDocument,"NewDocument");
		return this;
	}
	public AccountsReceivablePage clickUploaddocuments(WebDriver driver)  {
		BrowserActions.click(driver, btnUploaddocuments,"Uploaddocuments");
		return this;
	}
	public AccountsReceivablePage clickFinish(WebDriver driver)  {
		BrowserActions.click(driver, btnFinish,"Finish");
		return this;
	}
	public AccountsReceivablePage clickProductDefinition(WebDriver driver)  {
		BrowserActions.click(driver, btnProductDefinition,"ProductDefinition");
		return this;
	}
	public AccountsReceivablePage clickGetInspectionOutsideService(WebDriver driver)  {
		BrowserActions.click(driver, btnGetInspectionOutsideService,"GetInspectionOutsideService");
		return this;
	}
	public AccountsReceivablePage clickMeetwithInsured(WebDriver driver)  {
		BrowserActions.click(driver, btnMeetwithInsured,"MeetwithInsured");
		return this;
	}
	public AccountsReceivablePage clickOfferings(WebDriver driver)  {
		BrowserActions.click(driver, btnOfferings,"Offerings");
		return this;
	}
	public AccountsReceivablePage clickPolicyReviewRenewal(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyReviewRenewal,"PolicyReviewRenewal");
		return this;
	}
	public AccountsReceivablePage clickNewNote(WebDriver driver)  {
		BrowserActions.click(driver, btnNewNote,"NewNote");
		return this;
	}
	public AccountsReceivablePage clickRiskAnalysis(WebDriver driver)  {
		BrowserActions.click(driver, btnRiskAnalysis,"RiskAnalysis");
		return this;
	}
	public AccountsReceivablePage clickMeetwithProducerAgency(WebDriver driver)  {
		BrowserActions.click(driver, btnMeetwithProducerAgency,"MeetwithProducerAgency");
		return this;
	}
	public AccountsReceivablePage clickGeneralLiability(WebDriver driver)  {
		BrowserActions.click(driver, btnGeneralLiability,"GeneralLiability");
		return this;
	}
	public AccountsReceivablePage clickPolicyReview(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyReview,"PolicyReview");
		return this;
	}
	public AccountsReceivablePage clickOOSEPeriodSelector(WebDriver driver)  {
		BrowserActions.click(driver, btnOOSEPeriodSelector,"OOSEPeriodSelector");
		return this;
	}
	public AccountsReceivablePage clickManuallyrateandquotepolicy(WebDriver driver)  {
		BrowserActions.click(driver, btnManuallyrateandquotepolicy,"Manuallyrateandquotepolicy");
		return this;
	}
	public AccountsReceivablePage clickHistory(WebDriver driver)  {
		BrowserActions.click(driver, btnHistory,"History");
		return this;
	}
	public AccountsReceivablePage clickEdit(WebDriver driver)  {
		BrowserActions.click(driver, btnEdit,"Edit");
		return this;
	}
	public AccountsReceivablePage clickWithdrawTransaction(WebDriver driver)  {
		BrowserActions.click(driver, btnWithdrawTransaction,"WithdrawTransaction");
		return this;
	}
	public AccountsReceivablePage clickPolicyInfo(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyInfo,"PolicyInfo");
		return this;
	}
	public AccountsReceivablePage clickVersions(WebDriver driver)  {
		BrowserActions.click(driver, btnVersions,"Versions");
		return this;
	}
	public AccountsReceivablePage clickModifiers(WebDriver driver)  {
		BrowserActions.click(driver, btnModifiers,"Modifiers");
		return this;
	}
	public AccountsReceivablePage clickAccountFile(WebDriver driver)  {
		BrowserActions.click(driver, btnAccountFile,"AccountFile");
		return this;
	}
	public AccountsReceivablePage clickRemove(WebDriver driver)  {
		BrowserActions.click(driver, btnRemove,"Remove");
		return this;
	}
	public AccountsReceivablePage clickCopyData(WebDriver driver)  {
		BrowserActions.click(driver, btnCopyData,"CopyData");
		return this;
	}
	public AccountsReceivablePage clickClose(WebDriver driver)  {
		BrowserActions.click(driver, btnClose,"Close");
		return this;
	}
	public AccountsReceivablePage clickReview60dayUWPeriod(WebDriver driver)  {
		BrowserActions.click(driver, btnReview60dayUWPeriod,"Review60dayUWPeriod");
		return this;
	}
	public AccountsReceivablePage clickEditPolicyTransaction(WebDriver driver)  {
		BrowserActions.click(driver, btnEditPolicyTransaction,"EditPolicyTransaction");
		return this;
	}
	public AccountsReceivablePage clickAdd_1(WebDriver driver)  {
		BrowserActions.click(driver, btnAdd_1,"Add_1");
		return this;
	}
	public AccountsReceivablePage clickNewActivity(WebDriver driver)  {
		BrowserActions.click(driver, btnNewActivity,"NewActivity");
		return this;
	}
	public AccountsReceivablePage clickCancel(WebDriver driver)  {
		BrowserActions.click(driver, btnCancel,"Cancel");
		return this;
	}
	public AccountsReceivablePage clickPolicyContract(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyContract,"PolicyContract");
		return this;
	}
	public AccountsReceivablePage clickRequest(WebDriver driver)  {
		BrowserActions.click(driver, btnRequest,"Request");
		return this;
	}
	public AccountsReceivablePage clickGetRiskInformationProducer(WebDriver driver)  {
		BrowserActions.click(driver, btnGetRiskInformationProducer,"GetRiskInformationProducer");
		return this;
	}
	public AccountsReceivablePage clickGetAuditInternalPersonnel(WebDriver driver)  {
		BrowserActions.click(driver, btnGetAuditInternalPersonnel,"GetAuditInternalPersonnel");
		return this;
	}
	public AccountsReceivablePage selectPolicyPeriodSelector_Arg(WebDriver driver,String PolicyPeriodSelector_Arg)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPolicyPeriodSelector_Arg,PolicyPeriodSelector_Arg,"PolicyPeriodSelector_Arg");
		return this;
	}
	public AccountsReceivablePage clickBuildingsandLocations_5(WebDriver driver)  {
		BrowserActions.click(driver, btnBuildingsandLocations_5,"BuildingsandLocations_5");
		return this;
	}
	public AccountsReceivablePage clickShowPartialWorksheet(WebDriver driver)  {
		BrowserActions.click(driver, btnShowPartialWorksheet,"ShowPartialWorksheet");
		return this;
	}
	public AccountsReceivablePage click60daydiary(WebDriver driver)  {
		BrowserActions.click(driver, btn60daydiary,"60daydiary");
		return this;
	}
	public AccountsReceivablePage clickBack(WebDriver driver)  {
		BrowserActions.click(driver, btnBack,"Back");
		return this;
	}
	public AccountsReceivablePage clickLocations(WebDriver driver)  {
		BrowserActions.click(driver, btnLocations,"Locations");
		return this;
	}
	public AccountsReceivablePage clickNext(WebDriver driver)  {
		BrowserActions.click(driver, btnNext,"Next");
		return this;
	}
	public AccountsReceivablePage clickQuoteRequired(WebDriver driver)  {
		BrowserActions.click(driver, btnQuoteRequired,"QuoteRequired");
		return this;
	}
	public AccountsReceivablePage clickModifiers_3(WebDriver driver)  {
		BrowserActions.click(driver, btnModifiers_3,"Modifiers_3");
		return this;
	}
	public AccountsReceivablePage clickSaveDraft(WebDriver driver)  {
		BrowserActions.click(driver, btnSaveDraft,"SaveDraft");
		return this;
	}
	public AccountsReceivablePage clickGetBureauData(WebDriver driver)  {
		BrowserActions.click(driver, btnGetBureauData,"GetBureauData");
		return this;
	}
	public AccountsReceivablePage clickModifiers_7(WebDriver driver)  {
		BrowserActions.click(driver, btnModifiers_7,"Modifiers_7");
		return this;
	}
	public AccountsReceivablePage clickReinsurance(WebDriver driver)  {
		BrowserActions.click(driver, btnReinsurance,"Reinsurance");
		return this;
	}
	public AccountsReceivablePage clickLineSelection(WebDriver driver)  {
		BrowserActions.click(driver, btnLineSelection,"LineSelection");
		return this;
	}
	public AccountsReceivablePage clickSG00898467384031233002(WebDriver driver)  {
		BrowserActions.click(driver, btnSG00898467384031233002,"SG00898467384031233002");
		return this;
	}
	public AccountsReceivablePage clickCreatefromatemplate(WebDriver driver)  {
		BrowserActions.click(driver, btnCreatefromatemplate,"Createfromatemplate");
		return this;
	}
	public AccountsReceivablePage clickBuildingsandLocations(WebDriver driver)  {
		BrowserActions.click(driver, btnBuildingsandLocations,"BuildingsandLocations");
		return this;
	}
	public AccountsReceivablePage clickStartSidebySide(WebDriver driver)  {
		BrowserActions.click(driver, btnStartSidebySide,"StartSidebySide");
		return this;
	}
	public AccountsReceivablePage clickPolicyVersions_10(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyVersions_10,"PolicyVersions_10");
		return this;
	}
	public AccountsReceivablePage clickArchiving(WebDriver driver)  {
		BrowserActions.click(driver, btnArchiving,"Archiving");
		return this;
	}
	public AccountsReceivablePage clickNotTaken(WebDriver driver)  {
		BrowserActions.click(driver, btnNotTaken,"NotTaken");
		return this;
	}
	public AccountsReceivablePage clickDocuments(WebDriver driver)  {
		BrowserActions.click(driver, btnDocuments,"Documents");
		return this;
	}
	public AccountsReceivablePage selectCoveragesin(WebDriver driver,String Coveragesin)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCoveragesin,Coveragesin,"Coveragesin");
		return this;
	}
	public AccountsReceivablePage clickQuote(WebDriver driver)  {
		BrowserActions.click(driver, btnQuote,"Quote");
		return this;
	}
	public AccountsReceivablePage clickRiskAnalysis_11(WebDriver driver)  {
		BrowserActions.click(driver, btnRiskAnalysis_11,"RiskAnalysis_11");
		return this;
	}
	public AccountsReceivablePage clickReleaseLock(WebDriver driver)  {
		BrowserActions.click(driver, btnReleaseLock,"ReleaseLock");
		return this;
	}
	public AccountsReceivablePage clickReporting(WebDriver driver)  {
		BrowserActions.click(driver, rdbReporting,"Reporting");
		return this;
	}
	public AccountsReceivablePage click_checkbox(WebDriver driver)  {
		BrowserActions.click(driver, chk_checkbox,"_checkbox");
		return this;
	}
	public AccountsReceivablePage clickCreateNewProducer(WebDriver driver)  {
		BrowserActions.click(driver, btnCreateNewProducer,"CreateNewProducer");
		return this;
	}
	public AccountsReceivablePage clickAdd(WebDriver driver)  {
		BrowserActions.click(driver, btnAdd,"Add");
		return this;
	}
	public AccountsReceivablePage clickForms(WebDriver driver)  {
		BrowserActions.click(driver, btnForms,"Forms");
		return this;
	}
	public AccountsReceivablePage clickBlankets(WebDriver driver)  {
		BrowserActions.click(driver, btnBlankets,"Blankets");
		return this;
	}
	public AccountsReceivablePage clickNotes(WebDriver driver)  {
		BrowserActions.click(driver, btnNotes,"Notes");
		return this;
	}
	public AccountsReceivablePage clickGetInspectionLossControl(WebDriver driver)  {
		BrowserActions.click(driver, btnGetInspectionLossControl,"GetInspectionLossControl");
		return this;
	}
	public AccountsReceivablePage clickQuote_9(WebDriver driver)  {
		BrowserActions.click(driver, btnQuote_9,"Quote_9");
		return this;
	}
	public AccountsReceivablePage clickQuote_8(WebDriver driver)  {
		BrowserActions.click(driver, btnQuote_8,"Quote_8");
		return this;
	}
	public AccountsReceivablePage clickCreate(WebDriver driver)  {
		BrowserActions.click(driver, btnCreate,"Create");
		return this;
	}
	public AccountsReceivablePage clickLegalreview(WebDriver driver)  {
		BrowserActions.click(driver, btnLegalreview,"Legalreview");
		return this;
	}
	public AccountsReceivablePage clickPolicynotification(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicynotification,"Policynotification");
		return this;
	}
	public AccountsReceivablePage clickGoto(WebDriver driver)  {
		BrowserActions.click(driver, btnGoto,"Goto");
		return this;
	}
	public AccountsReceivablePage clickUnderwriterReview(WebDriver driver)  {
		BrowserActions.click(driver, btnUnderwriterReview,"UnderwriterReview");
		return this;
	}
	public AccountsReceivablePage click30daydiary(WebDriver driver)  {
		BrowserActions.click(driver, btn30daydiary,"30daydiary");
		return this;
	}
	public AccountsReceivablePage clickSigns(WebDriver driver)  {
		BrowserActions.click(driver, btnSigns,"Signs");
		return this;
	}
	public AccountsReceivablePage clickSidebySideQuoting(WebDriver driver)  {
		BrowserActions.click(driver, btnSidebySideQuoting,"SidebySideQuoting");
		return this;
	}
	public AccountsReceivablePage clickInlandMarine(WebDriver driver)  {
		BrowserActions.click(driver, btnInlandMarine,"InlandMarine");
		return this;
	}
	public AccountsReceivablePage clickCollectCreditCard(WebDriver driver)  {
		BrowserActions.click(driver, btnCollectCreditCard,"CollectCreditCard");
		return this;
	}
	public AccountsReceivablePage clickLineReview_4(WebDriver driver)  {
		BrowserActions.click(driver, btnLineReview_4,"LineReview_4");
		return this;
	}
	public AccountsReceivablePage clickLineReview_6(WebDriver driver)  {
		BrowserActions.click(driver, btnLineReview_6,"LineReview_6");
		return this;
	}
	public AccountsReceivablePage clickRatiooutofrange(WebDriver driver)  {
		BrowserActions.click(driver, btnRatiooutofrange,"Ratiooutofrange");
		return this;
	}
	public AccountsReceivablePage clickFullApp(WebDriver driver)  {
		BrowserActions.click(driver, btnFullApp,"FullApp");
		return this;
	}
	public AccountsReceivablePage clickDiagnosticData(WebDriver driver)  {
		BrowserActions.click(driver, btnDiagnosticData,"DiagnosticData");
		return this;
	}
	public AccountsReceivablePage clickReminder(WebDriver driver)  {
		BrowserActions.click(driver, btnReminder,"Reminder");
		return this;
	}
	public AccountsReceivablePage clickCoveragePartSelection(WebDriver driver)  {
		BrowserActions.click(driver, btnCoveragePartSelection,"CoveragePartSelection");
		return this;
	}
	public AccountsReceivablePage clickReviewnewmail(WebDriver driver)  {
		BrowserActions.click(driver, btnReviewnewmail,"Reviewnewmail");
		return this;
	}
	public AccountsReceivablePage clickGroup(WebDriver driver)  {
		BrowserActions.click(driver, btnGroup,"Group");
		return this;
	}
	public AccountsReceivablePage clickCancelasplitpolicy(WebDriver driver)  {
		BrowserActions.click(driver, btnCancelasplitpolicy,"Cancelasplitpolicy");
		return this;
	}
	public AccountsReceivablePage clickGetAuditOutsideService(WebDriver driver)  {
		BrowserActions.click(driver, btnGetAuditOutsideService,"GetAuditOutsideService");
		return this;
	}
	public AccountsReceivablePage clickNewAuditAssignment(WebDriver driver)  {
		BrowserActions.click(driver, btnNewAuditAssignment,"NewAuditAssignment");
		return this;
	}
	public AccountsReceivablePage clickRewritetoNewAccount(WebDriver driver)  {
		BrowserActions.click(driver, btnRewritetoNewAccount,"RewritetoNewAccount");
		return this;
	}
	public AccountsReceivablePage clickReview30dayUWPeriod(WebDriver driver)  {
		BrowserActions.click(driver, btnReview30dayUWPeriod,"Review30dayUWPeriod");
		return this;
	}
	public AccountsReceivablePage clickPolicyVersions(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyVersions,"PolicyVersions");
		return this;
	}
	public AccountsReceivablePage clickContractorsEquipment(WebDriver driver)  {
		BrowserActions.click(driver, btnContractorsEquipment,"ContractorsEquipment");
		return this;
	}
	public AccountsReceivablePage clickCloseOptions(WebDriver driver)  {
		BrowserActions.click(driver, btnCloseOptions,"CloseOptions");
		return this;
	}
	public AccountsReceivablePage clickPolicyFile(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyFile,"PolicyFile");
		return this;
	}
	public AccountsReceivablePage clickVerifycoverage(WebDriver driver)  {
		BrowserActions.click(driver, btnVerifycoverage,"Verifycoverage");
		return this;
	}
	public AccountsReceivablePage clickGetCreditReports(WebDriver driver)  {
		BrowserActions.click(driver, btnGetCreditReports,"GetCreditReports");
		return this;
	}
	public AccountsReceivablePage enterCoveragesin(WebDriver driver,String Coveragesin) {
		BrowserActions.type(driver, inpCoveragesin,Coveragesin, "Coveragesin");
		return this;
	}
	public AccountsReceivablePage clickDecline(WebDriver driver)  {
		BrowserActions.click(driver, btnDecline,"Decline");
		return this;
	}
	public AccountsReceivablePage clickLineReview(WebDriver driver)  {
		BrowserActions.click(driver, btnLineReview,"LineReview");
		return this;
	}
	public AccountsReceivablePage clickWizardMenuActions(WebDriver driver)  {
		BrowserActions.click(driver, btnWizardMenuActions,"WizardMenuActions");
		return this;
	}
	public AccountsReceivablePage clickSubManager(WebDriver driver)  {
		BrowserActions.click(driver, btnSubManager,"SubManager");
		return this;
	}
	public AccountsReceivablePage selectLocationBuilding(WebDriver driver){
		BrowserActions.selectDropDownByIndex(driver, drpLocationBuilding,1,"LocationBuilding");
		return this;
	}
	public AccountsReceivablePage selectReceptacleType(WebDriver driver,String receptacleType) {
		BrowserActions.selectDropDownByVisibleText(driver, drpReceptacleType, receptacleType,"ReceptacleType");
		return this;
	}
	public AccountsReceivablePage selectPercentDuplicated(WebDriver driver,String percentDuplicated) {
		BrowserActions.selectDropDownByVisibleText(driver, drpPercentDuplicated, percentDuplicated,"PercentDuplicated");
		return this;
	}
	public AccountsReceivablePage enterLimit(WebDriver driver,String limit) {
		BrowserActions.type(driver, inpLimit, limit,"Limit");
		return this;
	}
}
