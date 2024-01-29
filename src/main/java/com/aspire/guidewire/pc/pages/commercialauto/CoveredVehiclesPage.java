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

public class CoveredVehiclesPage extends LoadableComponent<CoveredVehiclesPage> {

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

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-JobGroupItem>div[role='menuitem']", AI = false)
	public WebElement btnSG00598122331179705877;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-8-item>div[role='menuitem']", AI = false)
	public WebElement btnGetReinsuranceQuote;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-13-item>div[role='menuitem']", AI = false)
	public WebElement btnReview45dayUWPeriod;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-CoveredAutoSymbolsLV-2-Symbol1']", AI = false)
	public WebElement chkANY_12;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-CoveredAutoSymbolsLV-2-CoveredAutoSymbolGrpName']", AI = false)
	public WebElement inpCoverage_11;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-CoveredAutoSymbolsLV-3-Symbol4']", AI = false)
	public WebElement chkOCV_25;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-JobWizardToolbarButtonSet-BindOptions-BindOnly>div[role='menuitem']", AI = false)
	public WebElement btnBindOnly;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-CoveredAutoSymbolsLV-2-Symbol10']", AI = false)
	public WebElement chkCUS_20;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-SymbolsLV-3-Name']", AI = false)
	public WebElement inpVehicleGroup_75;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-SymbolsLV-2-Name']", AI = false)
	public WebElement inpVehicleGroup_73;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-0-NewActivityMenuItemSet_Category>div[role='menuitem']", AI = false)
	public WebElement btnInterview;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-SymbolsLV-1-Name']", AI = false)
	public WebElement inpVehicleGroup_71;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-6-item>div[role='menuitem']", AI = false)
	public WebElement btnPerformanceReview;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-JobWizardToolbarButtonSet-Versions-NewVersion>div[role='menuitem']", AI = false)
	public WebElement btnStartMultiVersion;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-15-item>div[role='menuitem']", AI = false)
	public WebElement btnReviewProducer;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-CoveredAutoSymbolsLV_tb-EditAutoSymbols>div[role='button']", AI = false)
	public WebElement btnEditCoveredVehicles;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-1-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnIM0059812233;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-8-item>div[role='menuitem']", AI = false)
	public WebElement btnPolicyReviewMidterm;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-CoveredAutoSymbolsLV-3-Symbol1']", AI = false)
	public WebElement chkANY_22;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-baLineStep>div[role='menuitem']", AI = false)
	public WebElement btnCommercialAutoLine;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-CoveredAutoSymbolsLV-3-Symbol10']", AI = false)
	public WebElement chkCUS_30;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-JobWizardToolbarButtonSet-Versions-ViewSideBySide>div[role='menuitem']", AI = false)
	public WebElement btnViewSideBySideVersions;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-CoveredAutoSymbolsLV-4-Symbol4']", AI = false)
	public WebElement chkOCV_35;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-CoveredAutoSymbolsLV-0-Symbol2']", AI = false)
	public WebElement chkOVO;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-BillingInfo>div[role='menuitem']", AI = false)
	public WebElement btnPayment;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-CoveredAutoSymbolsLV-0-Symbol8']", AI = false)
	public WebElement chkHVO;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Change-WizardMenuActions_ChangeEffDate>div[role='menuitem']", AI = false)
	public WebElement btnEffectiveDate;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-CoveredAutoSymbolsLV-0-Symbol4']", AI = false)
	public WebElement chkOCV;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-CoveredAutoSymbolsLV-1-CoveredAutoSymbolGrpName']", AI = false)
	public WebElement inpCoverage_1;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-CoveredAutoSymbolsLV-4-Symbol1']", AI = false)
	public WebElement chkANY_32;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-OOSEPanelSet-NextSliceLink", AI = false)
	public WebElement btnNextBlockedDate;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-2-item>div[role='menuitem']", AI = false)
	public WebElement btn90daydiary;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-JobWizardToolbarButtonSet-BindOptions>div[role='button']", AI = false)
	public WebElement btnBindOptions;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Archiving-WizardMenuActions_SuspendResumeArchiving>div[role='menuitem']", AI = false)
	public WebElement btnEnableDisable;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-JobWizardToolbarButtonSet-BindOptions-BindAndIssue>div[role='menuitem']", AI = false)
	public WebElement btnIssuePolicy;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-CoveredAutoSymbolsLV-1-Symbol1']", AI = false)
	public WebElement chkANY_2;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-CoveredAutoSymbolsLV-2-Symbol4']", AI = false)
	public WebElement chkOCV_15;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-CoveredAutoSymbolsLV-1-Symbol10']", AI = false)
	public WebElement chkCUS_10;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-PolicyVersions>div[role='menuitem']", AI = false)
	public WebElement btnPolicyVersions_89;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-MultiQuoteAcceleratedMenuActions-PolicyPeriodSelector", AI = false)
	public WebElement btnPolicyPeriodSelector;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-1-NewActivityMenuItemSet_Category>div[role='menuitem']", AI = false)
	public WebElement btnNewmail;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-CoveredAutoSymbolsLV-5-Symbol1']", AI = false)
	public WebElement chkANY_42;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-RiskEvaluation>div[role='menuitem']", AI = false)
	public WebElement btnRiskAnalysis_90;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-7-item>div[role='menuitem']", AI = false)
	public WebElement btnGetMotorVehicleReports;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-PreQualification>div[role='menuitem']", AI = false)
	public WebElement btnQualification;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-SymbolsLV-CustomAutoSymbol textarea", AI = false)
	public WebElement inpCustomAutoSymbol;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-CoveredAutoSymbolsLV-7-Symbol10']", AI = false)
	public WebElement chkCUS_70;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-0-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnCA0061595963;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Participants>div[role='menuitem']", AI = false)
	public WebElement btnParticipants;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-4-NewActivityMenuItemSet_Category-0-item>div[role='menuitem']", AI = false)
	public WebElement btnReviewandapprove;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-OOSEPanelSet-OOSEPeriodSelector-OOSEPeriodSelector_Arg']", AI = false)
	public WebElement drpEffectiveDate;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-CoveredAutoSymbolsLV-0-Symbol9']", AI = false)
	public WebElement chkNOV;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-CoveredAutoSymbolsLV-1-Symbol3']", AI = false)
	public WebElement chkOPV_4;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-CoveredAutoSymbolsLV-4-Symbol5']", AI = false)
	public WebElement chkSRC_36;

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

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-CoveredAutoSymbolsLV-1-Symbol2']", AI = false)
	public WebElement chkOVO_3;

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

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-CoveredAutoSymbolsLV-3-Symbol5']", AI = false)
	public WebElement chkSRC_26;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-PolicyReview>div[role='menuitem']", AI = false)
	public WebElement btnPolicyReview;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-OOSEPanelSet-OOSEPeriodSelector", AI = false)
	public WebElement btnOOSEPeriodSelector;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-11-item>div[role='menuitem']", AI = false)
	public WebElement btnManuallyrateandquotepolicy;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-CoveredAutoSymbolsLV-6-Symbol2']", AI = false)
	public WebElement chkOVO_53;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-BADrivers>div[role='menuitem']", AI = false)
	public WebElement btnDrivers;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-History>div[role='menuitem']", AI = false)
	public WebElement btnHistory;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Change>div[role='menuitem']", AI = false)
	public WebElement btnEdit;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-JobWizardToolbarButtonSet-CloseOptions-WithdrawJob>div[role='menuitem']", AI = false)
	public WebElement btnWithdrawTransaction;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-PolicyInfo>div[role='menuitem']", AI = false)
	public WebElement btnPolicyInfo;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-CoveredAutoSymbolsLV-5-Symbol10']", AI = false)
	public WebElement chkCUS_50;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-JobWizardToolbarButtonSet-Versions>div[role='button']", AI = false)
	public WebElement btnVersions;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-Modifiers>div[role='menuitem']", AI = false)
	public WebElement btnModifiers;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_ToAccountFile>div[role='menuitem']", AI = false)
	public WebElement btnAccountFile;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-CoveredAutoSymbolsLV-4-Symbol10']", AI = false)
	public WebElement chkCUS_40;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-CoveredAutoSymbolsLV-2-Symbol5']", AI = false)
	public WebElement chkSRC_16;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-CoveredAutoSymbolsLV-2-Symbol7']", AI = false)
	public WebElement chkDVO_17;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-CoveredAutoSymbolsLV-0-CoveredAutoSymbolGrpName']", AI = false)
	public WebElement inpCoverage;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Change-WizardMenuActions_CopyPolicyData>div[role='menuitem']", AI = false)
	public WebElement btnCopyData;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-CoveredAutoSymbolsLV-7-Symbol2']", AI = false)
	public WebElement chkOVO_63;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-QuoteRequestedAlert-CloseBtn", AI = false)
	public WebElement btnClose;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-SymbolsLV-5-Name']", AI = false)
	public WebElement inpVehicleGroup_79;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-14-item>div[role='menuitem']", AI = false)
	public WebElement btnReview60dayUWPeriod;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-SymbolsLV-4-Name']", AI = false)
	public WebElement inpVehicleGroup_77;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-JobWizardToolbarButtonSet-EditPolicy>div[role='button']", AI = false)
	public WebElement btnEditPolicyTransaction;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-CoveredAutoSymbolsLV-1-Symbol9']", AI = false)
	public WebElement chkNOV_9;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity>div[role='menuitem']", AI = false)
	public WebElement btnNewActivity;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-CoveredAutoSymbolsLV-6-Symbol10']", AI = false)
	public WebElement chkCUS_60;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Cancel>div[role='button']", AI = false)
	public WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup>div[role='menuitem']", AI = false)
	public WebElement btnPolicyContract;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-CoveredAutoSymbolsLV-0-Symbol3']", AI = false)
	public WebElement chkOPV;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-SymbolsLV-8-Name']", AI = false)
	public WebElement inpVehicleGroup_85;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-CoveredAutoSymbolsLV-3-Symbol7']", AI = false)
	public WebElement chkDVO_27;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-SymbolsLV-7-Name']", AI = false)
	public WebElement inpVehicleGroup_83;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category>div[role='menuitem']", AI = false)
	public WebElement btnRequest;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-SymbolsLV-6-Name']", AI = false)
	public WebElement inpVehicleGroup_81;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-9-item>div[role='menuitem']", AI = false)
	public WebElement btnGetRiskInformationProducer;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-CoveredAutoSymbolsLV-4-Symbol2']", AI = false)
	public WebElement chkOVO_33;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-CoveredAutoSymbolsLV-7-Symbol8']", AI = false)
	public WebElement chkHVO_68;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-1-item>div[role='menuitem']", AI = false)
	public WebElement btnGetAuditInternalPersonnel;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-CoveredAutoSymbolsLV-4-Symbol7']", AI = false)
	public WebElement chkDVO_37;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-CoveredAutoSymbolsLV-5-Symbol3']", AI = false)
	public WebElement chkOPV_44;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-MultiQuoteAcceleratedMenuActions-PolicyPeriodSelector-PolicyPeriodSelector_Arg']", AI = false)
	public WebElement drpPolicyPeriodSelector_Arg;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-DiagWorksheetItem-ShowDiagWorksheet>div[role='menuitem']", AI = false)
	public WebElement btnShowPartialWorksheet;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-1-item>div[role='menuitem']", AI = false)
	public WebElement btn60daydiary;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Prev>div[role='button']", AI = false)
	public WebElement btnBack;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-SymbolsLV-0-Name']", AI = false)
	public WebElement inpVehicleGroup;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-CoveredAutoSymbolsLV-6-Symbol3']", AI = false)
	public WebElement chkOPV_54;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-Locations>div[role='menuitem']", AI = false)
	public WebElement btnLocations;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-CoveredAutoSymbolsLV-5-Symbol2']", AI = false)
	public WebElement chkOVO_43;

	@IFindBy(how = How.CSS, using = "div[id$='Next']", AI = false)
	public WebElement btnNext;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-CoveredAutoSymbolsLV-6-Symbol8']", AI = false)
	public WebElement chkHVO_58;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-10-item>div[role='menuitem']", AI = false)
	public WebElement btnQuoteRequired;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-CoveredAutoSymbolsLV-7-Symbol5']", AI = false)
	public WebElement chkSRC_66;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-JobWizardToolbarButtonSet-Draft>div[role='button']", AI = false)
	public WebElement btnSaveDraft;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-3-item>div[role='menuitem']", AI = false)
	public WebElement btnGetBureauData;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Reinsurance>div[role='menuitem']", AI = false)
	public WebElement btnReinsurance;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-CoveredAutoSymbolsLV-5-Symbol7']", AI = false)
	public WebElement chkDVO_47;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-CoveredAutoSymbolsLV-5-Symbol8']", AI = false)
	public WebElement chkHVO_48;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-CoveredAutoSymbolsLV-2-Symbol2']", AI = false)
	public WebElement chkOVO_13;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-CoveredAutoSymbolsLV-7-Symbol3']", AI = false)
	public WebElement chkOPV_64;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-QuoteRequestedAlert .gw-AlertBar--label", AI = false)
	public WebElement lblQuoteRequestedAlert;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-CoveredAutoSymbolsLV-0-Symbol7']", AI = false)
	public WebElement chkDVO;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewDocument-NewJobDocumentMenuItemSet-PolicyPeriodNewDocumentMenuItemSet_Template>div[role='menuitem']", AI = false)
	public WebElement btnCreatefromatemplate;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-JobWizardToolbarButtonSet-Versions-SideBySide>div[role='menuitem']", AI = false)
	public WebElement btnStartSidebySide;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-CoveredAutoSymbolsLV-6-Symbol5']", AI = false)
	public WebElement chkSRC_56;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-CoveredAutoSymbolsLV-6-Symbol9']", AI = false)
	public WebElement chkNOV_59;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Archiving>div[role='menuitem']", AI = false)
	public WebElement btnArchiving;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-JobWizardToolbarButtonSet-CloseOptions-NotTakenJob>div[role='menuitem']", AI = false)
	public WebElement btnNotTaken;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-CoveredAutoSymbolsLV-6-Symbol7']", AI = false)
	public WebElement chkDVO_57;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Documents>div[role='menuitem']", AI = false)
	public WebElement btnDocuments;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-CoveredAutoSymbolsLV-0-Symbol10']", AI = false)
	public WebElement chkCUS;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-CoveredAutoSymbolsLV-4-Symbol8']", AI = false)
	public WebElement chkHVO_38;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-SymbolsLV-Name']", AI = false)
	public WebElement inpName;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-CoveredAutoSymbolsLV-3-Symbol2']", AI = false)
	public WebElement chkOVO_23;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-JobWizardToolbarButtonSet-QuoteTypeToolbarButtonSet-Quote>div[role='button']", AI = false)
	public WebElement btnQuote;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-BusinessVehicles>div[role='menuitem']", AI = false)
	public WebElement btnVehicles;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-JobWizardToolbarButtonSet-Unlock>div[role='button']", AI = false)
	public WebElement btnReleaseLock;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-CoveredAutoSymbolsLV-5-Symbol5']", AI = false)
	public WebElement chkSRC_46;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-CoveredAutoSymbolsLV-7-Symbol9']", AI = false)
	public WebElement chkNOV_69;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-0-item>div[role='menuitem']", AI = false)
	public WebElement btnCreateNewProducer;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Forms>div[role='menuitem']", AI = false)
	public WebElement btnForms;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-CoveredAutoSymbolsLV-1-Symbol5']", AI = false)
	public WebElement chkSRC_6;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-CoveredAutoSymbolsLV-7-CoveredAutoSymbolGrpName']", AI = false)
	public WebElement inpCoverage_61;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-CoveredAutoSymbolsLV-7-Symbol7']", AI = false)
	public WebElement chkDVO_67;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Notes>div[role='menuitem']", AI = false)
	public WebElement btnNotes;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-CoveredAutoSymbolsLV-3-Symbol8']", AI = false)
	public WebElement chkHVO_28;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-SymbolsLV-2-Description']", AI = false)
	public WebElement inpDescription_74;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-SymbolsLV-1-Description']", AI = false)
	public WebElement inpDescription_72;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-CoveredAutoSymbolsLV-0-Symbol5']", AI = false)
	public WebElement chkSRC;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-SymbolsLV-4-Description']", AI = false)
	public WebElement inpDescription_78;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-5-item>div[role='menuitem']", AI = false)
	public WebElement btnGetInspectionLossControl;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-SymbolsLV-3-Description']", AI = false)
	public WebElement inpDescription_76;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-CoveredAutoSymbols>div[role='menuitem']", AI = false)
	public WebElement btnCoveredVehicles;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create>div[role='menuitem']", AI = false)
	public WebElement btnCreate;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-SymbolsLV-0-Description']", AI = false)
	public WebElement inpDescription;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-CoveredAutoSymbolsLV-6-CoveredAutoSymbolGrpName']", AI = false)
	public WebElement inpCoverage_51;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-CoveredAutoSymbolsLV-4-Symbol9']", AI = false)
	public WebElement chkNOV_39;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-CoveredAutoSymbolsLV-7-Symbol4']", AI = false)
	public WebElement chkOCV_65;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-10-item>div[role='menuitem']", AI = false)
	public WebElement btnLegalreview;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-7-item>div[role='menuitem']", AI = false)
	public WebElement btnPolicynotification;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-CoveredAutoSymbolsLV-1-Symbol7']", AI = false)
	public WebElement chkDVO_7;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto>div[role='menuitem']", AI = false)
	public WebElement btnGoto;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-CoveredAutoSymbolsLV-6-Symbol1']", AI = false)
	public WebElement chkANY_52;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-4-NewActivityMenuItemSet_Category>div[role='menuitem']", AI = false)
	public WebElement btnUnderwriterReview;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-SymbolsLV-7-Description']", AI = false)
	public WebElement inpDescription_84;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-CoveredAutoSymbolsLV-2-Symbol8']", AI = false)
	public WebElement chkHVO_18;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-0-item>div[role='menuitem']", AI = false)
	public WebElement btn30daydiary;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-SymbolsLV-6-Description']", AI = false)
	public WebElement inpDescription_82;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-SideBySide>div[role='menuitem']", AI = false)
	public WebElement btnSidebySideQuoting;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-SymbolsLV-8-Description']", AI = false)
	public WebElement inpDescription_86;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-StateInfo>div[role='menuitem']", AI = false)
	public WebElement btnStateInfo;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-SymbolsLV-5-Description']", AI = false)
	public WebElement inpDescription_80;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-CollectCreditCard>div[role='menuitem']", AI = false)
	public WebElement btnCollectCreditCard;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-ViewMultiLineQuote>div[role='menuitem']", AI = false)
	public WebElement btnQuote_88;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-CoveredAutoSymbolsLV-5-CoveredAutoSymbolGrpName']", AI = false)
	public WebElement inpCoverage_41;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-ViewQuote>div[role='menuitem']", AI = false)
	public WebElement btnQuote_87;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-CoveredAutoSymbolsLV-5-Symbol9']", AI = false)
	public WebElement chkNOV_49;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-11-item>div[role='menuitem']", AI = false)
	public WebElement btnRatiooutofrange;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-JobWizardToolbarButtonSet-ConvertToFullApp>div[role='button']", AI = false)
	public WebElement btnFullApp;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-CoveredAutoSymbolsLV-2-Symbol3']", AI = false)
	public WebElement chkOPV_14;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-DiagWorksheetItem>div[role='menuitem']", AI = false)
	public WebElement btnDiagnosticData;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-CoveredAutoSymbolsLV-0-Symbol1']", AI = false)
	public WebElement chkANY;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-CoveredAutoSymbolsLV-7-Symbol1']", AI = false)
	public WebElement chkANY_62;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category>div[role='menuitem']", AI = false)
	public WebElement btnReminder;

	@IFindBy(how = How.CSS, using = "div[id$='CoveredAutoSymbolsScreen-ttlBar']", AI = false)
	public WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-CoveredAutoSymbolsLV-1-Symbol8']", AI = false)
	public WebElement chkHVO_8;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-CoveredAutoSymbolsLV-4-CoveredAutoSymbolGrpName']", AI = false)
	public WebElement inpCoverage_31;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-CoveredAutoSymbolsLV-5-Symbol4']", AI = false)
	public WebElement chkOCV_45;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-CoveredAutoSymbolsLV-3-Symbol3']", AI = false)
	public WebElement chkOPV_24;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-1-NewActivityMenuItemSet_Category-0-item>div[role='menuitem']", AI = false)
	public WebElement btnReviewnewmail;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup>div[role='menuitem']", AI = false)
	public WebElement btnGroup;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-3-item>div[role='menuitem']", AI = false)
	public WebElement btnCancelasplitpolicy;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-2-item>div[role='menuitem']", AI = false)
	public WebElement btnGetAuditOutsideService;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-CoveredAutoSymbolsLV-2-Symbol9']", AI = false)
	public WebElement chkNOV_19;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-5-item>div[role='menuitem']", AI = false)
	public WebElement btnNewAuditAssignment;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-16-item>div[role='menuitem']", AI = false)
	public WebElement btnRewritetoNewAccount;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-12-item>div[role='menuitem']", AI = false)
	public WebElement btnReview30dayUWPeriod;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-ManageBranches>div[role='menuitem']", AI = false)
	public WebElement btnPolicyVersions;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-CoveredAutoSymbolsLV-3-Symbol9']", AI = false)
	public WebElement chkNOV_29;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-CoveredAutoSymbolsLV-6-Symbol4']", AI = false)
	public WebElement chkOCV_55;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-JobWizardToolbarButtonSet-CloseOptions>div[role='button']", AI = false)
	public WebElement btnCloseOptions;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-CoveredAutoSymbolsLV-3-CoveredAutoSymbolGrpName']", AI = false)
	public WebElement inpCoverage_21;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-CoveredAutoSymbolsLV-1-Symbol4']", AI = false)
	public WebElement chkOCV_5;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_ToPolicyFile>div[role='menuitem']", AI = false)
	public WebElement btnPolicyFile;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-17-item>div[role='menuitem']", AI = false)
	public WebElement btnVerifycoverage;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-CoveredAutoSymbolsPanelSet-CoveredAutoSymbolsLV-4-Symbol3']", AI = false)
	public WebElement chkOPV_34;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-4-item>div[role='menuitem']", AI = false)
	public WebElement btnGetCreditReports;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-CoveredAutoSymbolsScreen-JobWizardToolbarButtonSet-CloseOptions-Decline>div[role='menuitem']", AI = false)
	public WebElement btnDecline;

	@IFindBy(how = How.CSS, using = "div[id=$'SubmissionWizard-WizardMenuActions']>div[role='button']", AI = false)
	public WebElement btnWizardMenuActions;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardActionsMenuItemSet-SubmissionInfo>div[role='menuitem']", AI = false)
	public WebElement btnSubManager;

	public CoveredVehiclesPage(){
	}

	public CoveredVehiclesPage(WebDriver driver) {
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
	public CoveredVehiclesPage clickWorkplan(WebDriver driver)  {
		BrowserActions.click(driver, btnWorkplan,"Workplan");
		return this;
	}
	public CoveredVehiclesPage clickCopySubmission(WebDriver driver)  {
		BrowserActions.click(driver, btnCopySubmission,"CopySubmission");
		return this;
	}
	public CoveredVehiclesPage clickGeneralreminderdiary(WebDriver driver)  {
		BrowserActions.click(driver, btnGeneralreminderdiary,"Generalreminderdiary");
		return this;
	}
	public CoveredVehiclesPage clickSG00598122331179705877(WebDriver driver)  {
		BrowserActions.click(driver, btnSG00598122331179705877,"SG00598122331179705877");
		return this;
	}
	public CoveredVehiclesPage clickGetReinsuranceQuote(WebDriver driver)  {
		BrowserActions.click(driver, btnGetReinsuranceQuote,"GetReinsuranceQuote");
		return this;
	}
	public CoveredVehiclesPage clickReview45dayUWPeriod(WebDriver driver)  {
		BrowserActions.click(driver, btnReview45dayUWPeriod,"Review45dayUWPeriod");
		return this;
	}
	public CoveredVehiclesPage clickANY_12(WebDriver driver)  {
		BrowserActions.click(driver, chkANY_12,"ANY_12");
		return this;
	}
	public CoveredVehiclesPage enterCoverage_11(WebDriver driver,String Coverage_11) {
		BrowserActions.type(driver, inpCoverage_11,Coverage_11, "Coverage_11");
		return this;
	}
	public CoveredVehiclesPage clickOCV_25(WebDriver driver)  {
		BrowserActions.click(driver, chkOCV_25,"OCV_25");
		return this;
	}
	public CoveredVehiclesPage clickBindOnly(WebDriver driver)  {
		BrowserActions.click(driver, btnBindOnly,"BindOnly");
		return this;
	}
	public CoveredVehiclesPage clickCUS_20(WebDriver driver)  {
		BrowserActions.click(driver, chkCUS_20,"CUS_20");
		return this;
	}
	public CoveredVehiclesPage enterVehicleGroup_75(WebDriver driver,String VehicleGroup_75) {
		BrowserActions.type(driver, inpVehicleGroup_75,VehicleGroup_75, "VehicleGroup_75");
		return this;
	}
	public CoveredVehiclesPage enterVehicleGroup_73(WebDriver driver,String VehicleGroup_73) {
		BrowserActions.type(driver, inpVehicleGroup_73,VehicleGroup_73, "VehicleGroup_73");
		return this;
	}
	public CoveredVehiclesPage clickInterview(WebDriver driver)  {
		BrowserActions.click(driver, btnInterview,"Interview");
		return this;
	}
	public CoveredVehiclesPage enterVehicleGroup_71(WebDriver driver,String VehicleGroup_71) {
		BrowserActions.type(driver, inpVehicleGroup_71,VehicleGroup_71, "VehicleGroup_71");
		return this;
	}
	public CoveredVehiclesPage clickPerformanceReview(WebDriver driver)  {
		BrowserActions.click(driver, btnPerformanceReview,"PerformanceReview");
		return this;
	}
	public CoveredVehiclesPage clickStartMultiVersion(WebDriver driver)  {
		BrowserActions.click(driver, btnStartMultiVersion,"StartMultiVersion");
		return this;
	}
	public CoveredVehiclesPage clickReviewProducer(WebDriver driver)  {
		BrowserActions.click(driver, btnReviewProducer,"ReviewProducer");
		return this;
	}
	public CoveredVehiclesPage clickEditCoveredVehicles(WebDriver driver)  {
		BrowserActions.click(driver, btnEditCoveredVehicles,"EditCoveredVehicles");
		return this;
	}
	public CoveredVehiclesPage clickIM0059812233(WebDriver driver)  {
		BrowserActions.click(driver, btnIM0059812233,"IM0059812233");
		return this;
	}
	public CoveredVehiclesPage clickPolicyReviewMidterm(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyReviewMidterm,"PolicyReviewMidterm");
		return this;
	}
	public CoveredVehiclesPage clickANY_22(WebDriver driver)  {
		BrowserActions.click(driver, chkANY_22,"ANY_22");
		return this;
	}
	public CoveredVehiclesPage clickCommercialAutoLine(WebDriver driver)  {
		BrowserActions.click(driver, btnCommercialAutoLine,"CommercialAutoLine");
		return this;
	}
	public CoveredVehiclesPage clickCUS_30(WebDriver driver)  {
		BrowserActions.click(driver, chkCUS_30,"CUS_30");
		return this;
	}
	public CoveredVehiclesPage clickViewSideBySideVersions(WebDriver driver)  {
		BrowserActions.click(driver, btnViewSideBySideVersions,"ViewSideBySideVersions");
		return this;
	}
	public CoveredVehiclesPage clickOCV_35(WebDriver driver)  {
		BrowserActions.click(driver, chkOCV_35,"OCV_35");
		return this;
	}
	public CoveredVehiclesPage clickOVO(WebDriver driver)  {
		BrowserActions.click(driver, chkOVO,"OVO");
		return this;
	}
	public CoveredVehiclesPage clickPayment(WebDriver driver)  {
		BrowserActions.click(driver, btnPayment,"Payment");
		return this;
	}
	public CoveredVehiclesPage clickHVO(WebDriver driver)  {
		BrowserActions.click(driver, chkHVO,"HVO");
		return this;
	}
	public CoveredVehiclesPage clickEffectiveDate(WebDriver driver)  {
		BrowserActions.click(driver, btnEffectiveDate,"EffectiveDate");
		return this;
	}
	public CoveredVehiclesPage clickOCV(WebDriver driver)  {
		BrowserActions.click(driver, chkOCV,"OCV");
		return this;
	}
	public CoveredVehiclesPage enterCoverage_1(WebDriver driver,String Coverage_1) {
		BrowserActions.type(driver, inpCoverage_1,Coverage_1, "Coverage_1");
		return this;
	}
	public CoveredVehiclesPage clickANY_32(WebDriver driver)  {
		BrowserActions.click(driver, chkANY_32,"ANY_32");
		return this;
	}
	public CoveredVehiclesPage clickNextBlockedDate(WebDriver driver)  {
		BrowserActions.click(driver, btnNextBlockedDate,"NextBlockedDate");
		return this;
	}
	public CoveredVehiclesPage click90daydiary(WebDriver driver)  {
		BrowserActions.click(driver, btn90daydiary,"90daydiary");
		return this;
	}
	public CoveredVehiclesPage clickBindOptions(WebDriver driver)  {
		BrowserActions.click(driver, btnBindOptions,"BindOptions");
		return this;
	}
	public CoveredVehiclesPage clickEnableDisable(WebDriver driver)  {
		BrowserActions.click(driver, btnEnableDisable,"EnableDisable");
		return this;
	}
	public CoveredVehiclesPage clickIssuePolicy(WebDriver driver)  {
		BrowserActions.click(driver, btnIssuePolicy,"IssuePolicy");
		return this;
	}
	public CoveredVehiclesPage clickANY_2(WebDriver driver)  {
		BrowserActions.click(driver, chkANY_2,"ANY_2");
		return this;
	}
	public CoveredVehiclesPage clickOCV_15(WebDriver driver)  {
		BrowserActions.click(driver, chkOCV_15,"OCV_15");
		return this;
	}
	public CoveredVehiclesPage clickCUS_10(WebDriver driver)  {
		BrowserActions.click(driver, chkCUS_10,"CUS_10");
		return this;
	}
	public CoveredVehiclesPage clickPolicyVersions_89(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyVersions_89,"PolicyVersions_89");
		return this;
	}
	public CoveredVehiclesPage clickPolicyPeriodSelector(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyPeriodSelector,"PolicyPeriodSelector");
		return this;
	}
	public CoveredVehiclesPage clickNewmail(WebDriver driver)  {
		BrowserActions.click(driver, btnNewmail,"Newmail");
		return this;
	}
	public CoveredVehiclesPage clickANY_42(WebDriver driver)  {
		BrowserActions.click(driver, chkANY_42,"ANY_42");
		return this;
	}
	public CoveredVehiclesPage clickRiskAnalysis_90(WebDriver driver)  {
		BrowserActions.click(driver, btnRiskAnalysis_90,"RiskAnalysis_90");
		return this;
	}
	public CoveredVehiclesPage clickGetMotorVehicleReports(WebDriver driver)  {
		BrowserActions.click(driver, btnGetMotorVehicleReports,"GetMotorVehicleReports");
		return this;
	}
	public CoveredVehiclesPage clickQualification(WebDriver driver)  {
		BrowserActions.click(driver, btnQualification,"Qualification");
		return this;
	}
	public CoveredVehiclesPage enterCustomAutoSymbol(WebDriver driver,String CustomAutoSymbol) {
		BrowserActions.type(driver, inpCustomAutoSymbol,CustomAutoSymbol, "CustomAutoSymbol");
		return this;
	}
	public CoveredVehiclesPage clickCUS_70(WebDriver driver)  {
		BrowserActions.click(driver, chkCUS_70,"CUS_70");
		return this;
	}
	public CoveredVehiclesPage clickCA0061595963(WebDriver driver)  {
		BrowserActions.click(driver, btnCA0061595963,"CA0061595963");
		return this;
	}
	public CoveredVehiclesPage clickParticipants(WebDriver driver)  {
		BrowserActions.click(driver, btnParticipants,"Participants");
		return this;
	}
	public CoveredVehiclesPage clickReviewandapprove(WebDriver driver)  {
		BrowserActions.click(driver, btnReviewandapprove,"Reviewandapprove");
		return this;
	}
	public CoveredVehiclesPage selectEffectiveDate(WebDriver driver,String EffectiveDate)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpEffectiveDate,EffectiveDate,"EffectiveDate");
		return this;
	}
	public CoveredVehiclesPage clickNOV(WebDriver driver)  {
		BrowserActions.click(driver, chkNOV,"NOV");
		return this;
	}
	public CoveredVehiclesPage clickOPV_4(WebDriver driver)  {
		BrowserActions.click(driver, chkOPV_4,"OPV_4");
		return this;
	}
	public CoveredVehiclesPage clickSRC_36(WebDriver driver)  {
		BrowserActions.click(driver, chkSRC_36,"SRC_36");
		return this;
	}
	public CoveredVehiclesPage clickNewDocument(WebDriver driver)  {
		BrowserActions.click(driver, btnNewDocument,"NewDocument");
		return this;
	}
	public CoveredVehiclesPage clickUploaddocuments(WebDriver driver)  {
		BrowserActions.click(driver, btnUploaddocuments,"Uploaddocuments");
		return this;
	}
	public CoveredVehiclesPage clickFinish(WebDriver driver)  {
		BrowserActions.click(driver, btnFinish,"Finish");
		return this;
	}
	public CoveredVehiclesPage clickProductDefinition(WebDriver driver)  {
		BrowserActions.click(driver, btnProductDefinition,"ProductDefinition");
		return this;
	}
	public CoveredVehiclesPage clickGetInspectionOutsideService(WebDriver driver)  {
		BrowserActions.click(driver, btnGetInspectionOutsideService,"GetInspectionOutsideService");
		return this;
	}
	public CoveredVehiclesPage clickMeetwithInsured(WebDriver driver)  {
		BrowserActions.click(driver, btnMeetwithInsured,"MeetwithInsured");
		return this;
	}
	public CoveredVehiclesPage clickOVO_3(WebDriver driver)  {
		BrowserActions.click(driver, chkOVO_3,"OVO_3");
		return this;
	}
	public CoveredVehiclesPage clickOfferings(WebDriver driver)  {
		BrowserActions.click(driver, btnOfferings,"Offerings");
		return this;
	}
	public CoveredVehiclesPage clickPolicyReviewRenewal(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyReviewRenewal,"PolicyReviewRenewal");
		return this;
	}
	public CoveredVehiclesPage clickNewNote(WebDriver driver)  {
		BrowserActions.click(driver, btnNewNote,"NewNote");
		return this;
	}
	public CoveredVehiclesPage clickRiskAnalysis(WebDriver driver)  {
		BrowserActions.click(driver, btnRiskAnalysis,"RiskAnalysis");
		return this;
	}
	public CoveredVehiclesPage clickMeetwithProducerAgency(WebDriver driver)  {
		BrowserActions.click(driver, btnMeetwithProducerAgency,"MeetwithProducerAgency");
		return this;
	}
	public CoveredVehiclesPage clickSRC_26(WebDriver driver)  {
		BrowserActions.click(driver, chkSRC_26,"SRC_26");
		return this;
	}
	public CoveredVehiclesPage clickPolicyReview(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyReview,"PolicyReview");
		return this;
	}
	public CoveredVehiclesPage clickOOSEPeriodSelector(WebDriver driver)  {
		BrowserActions.click(driver, btnOOSEPeriodSelector,"OOSEPeriodSelector");
		return this;
	}
	public CoveredVehiclesPage clickManuallyrateandquotepolicy(WebDriver driver)  {
		BrowserActions.click(driver, btnManuallyrateandquotepolicy,"Manuallyrateandquotepolicy");
		return this;
	}
	public CoveredVehiclesPage clickOVO_53(WebDriver driver)  {
		BrowserActions.click(driver, chkOVO_53,"OVO_53");
		return this;
	}
	public CoveredVehiclesPage clickDrivers(WebDriver driver)  {
		BrowserActions.click(driver, btnDrivers,"Drivers");
		return this;
	}
	public CoveredVehiclesPage clickHistory(WebDriver driver)  {
		BrowserActions.click(driver, btnHistory,"History");
		return this;
	}
	public CoveredVehiclesPage clickEdit(WebDriver driver)  {
		BrowserActions.click(driver, btnEdit,"Edit");
		return this;
	}
	public CoveredVehiclesPage clickWithdrawTransaction(WebDriver driver)  {
		BrowserActions.click(driver, btnWithdrawTransaction,"WithdrawTransaction");
		return this;
	}
	public CoveredVehiclesPage clickPolicyInfo(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyInfo,"PolicyInfo");
		return this;
	}
	public CoveredVehiclesPage clickCUS_50(WebDriver driver)  {
		BrowserActions.click(driver, chkCUS_50,"CUS_50");
		return this;
	}
	public CoveredVehiclesPage clickVersions(WebDriver driver)  {
		BrowserActions.click(driver, btnVersions,"Versions");
		return this;
	}
	public CoveredVehiclesPage clickModifiers(WebDriver driver)  {
		BrowserActions.click(driver, btnModifiers,"Modifiers");
		return this;
	}
	public CoveredVehiclesPage clickAccountFile(WebDriver driver)  {
		BrowserActions.click(driver, btnAccountFile,"AccountFile");
		return this;
	}
	public CoveredVehiclesPage clickCUS_40(WebDriver driver)  {
		BrowserActions.click(driver, chkCUS_40,"CUS_40");
		return this;
	}
	public CoveredVehiclesPage clickSRC_16(WebDriver driver)  {
		BrowserActions.click(driver, chkSRC_16,"SRC_16");
		return this;
	}
	public CoveredVehiclesPage clickDVO_17(WebDriver driver)  {
		BrowserActions.click(driver, chkDVO_17,"DVO_17");
		return this;
	}
	public CoveredVehiclesPage enterCoverage(WebDriver driver,String Coverage) {
		BrowserActions.type(driver, inpCoverage,Coverage, "Coverage");
		return this;
	}
	public CoveredVehiclesPage clickCopyData(WebDriver driver)  {
		BrowserActions.click(driver, btnCopyData,"CopyData");
		return this;
	}
	public CoveredVehiclesPage clickOVO_63(WebDriver driver)  {
		BrowserActions.click(driver, chkOVO_63,"OVO_63");
		return this;
	}
	public CoveredVehiclesPage clickClose(WebDriver driver)  {
		BrowserActions.click(driver, btnClose,"Close");
		return this;
	}
	public CoveredVehiclesPage enterVehicleGroup_79(WebDriver driver,String VehicleGroup_79) {
		BrowserActions.type(driver, inpVehicleGroup_79,VehicleGroup_79, "VehicleGroup_79");
		return this;
	}
	public CoveredVehiclesPage clickReview60dayUWPeriod(WebDriver driver)  {
		BrowserActions.click(driver, btnReview60dayUWPeriod,"Review60dayUWPeriod");
		return this;
	}
	public CoveredVehiclesPage enterVehicleGroup_77(WebDriver driver,String VehicleGroup_77) {
		BrowserActions.type(driver, inpVehicleGroup_77,VehicleGroup_77, "VehicleGroup_77");
		return this;
	}
	public CoveredVehiclesPage clickEditPolicyTransaction(WebDriver driver)  {
		BrowserActions.click(driver, btnEditPolicyTransaction,"EditPolicyTransaction");
		return this;
	}
	public CoveredVehiclesPage clickNOV_9(WebDriver driver)  {
		BrowserActions.click(driver, chkNOV_9,"NOV_9");
		return this;
	}
	public CoveredVehiclesPage clickNewActivity(WebDriver driver)  {
		BrowserActions.click(driver, btnNewActivity,"NewActivity");
		return this;
	}
	public CoveredVehiclesPage clickCUS_60(WebDriver driver)  {
		BrowserActions.click(driver, chkCUS_60,"CUS_60");
		return this;
	}
	public CoveredVehiclesPage clickCancel(WebDriver driver)  {
		BrowserActions.click(driver, btnCancel,"Cancel");
		return this;
	}
	public CoveredVehiclesPage clickPolicyContract(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyContract,"PolicyContract");
		return this;
	}
	public CoveredVehiclesPage clickOPV(WebDriver driver)  {
		BrowserActions.click(driver, chkOPV,"OPV");
		return this;
	}
	public CoveredVehiclesPage enterVehicleGroup_85(WebDriver driver,String VehicleGroup_85) {
		BrowserActions.type(driver, inpVehicleGroup_85,VehicleGroup_85, "VehicleGroup_85");
		return this;
	}
	public CoveredVehiclesPage clickDVO_27(WebDriver driver)  {
		BrowserActions.click(driver, chkDVO_27,"DVO_27");
		return this;
	}
	public CoveredVehiclesPage enterVehicleGroup_83(WebDriver driver,String VehicleGroup_83) {
		BrowserActions.type(driver, inpVehicleGroup_83,VehicleGroup_83, "VehicleGroup_83");
		return this;
	}
	public CoveredVehiclesPage clickRequest(WebDriver driver)  {
		BrowserActions.click(driver, btnRequest,"Request");
		return this;
	}
	public CoveredVehiclesPage enterVehicleGroup_81(WebDriver driver,String VehicleGroup_81) {
		BrowserActions.type(driver, inpVehicleGroup_81,VehicleGroup_81, "VehicleGroup_81");
		return this;
	}
	public CoveredVehiclesPage clickGetRiskInformationProducer(WebDriver driver)  {
		BrowserActions.click(driver, btnGetRiskInformationProducer,"GetRiskInformationProducer");
		return this;
	}
	public CoveredVehiclesPage clickOVO_33(WebDriver driver)  {
		BrowserActions.click(driver, chkOVO_33,"OVO_33");
		return this;
	}
	public CoveredVehiclesPage clickHVO_68(WebDriver driver)  {
		BrowserActions.click(driver, chkHVO_68,"HVO_68");
		return this;
	}
	public CoveredVehiclesPage clickGetAuditInternalPersonnel(WebDriver driver)  {
		BrowserActions.click(driver, btnGetAuditInternalPersonnel,"GetAuditInternalPersonnel");
		return this;
	}
	public CoveredVehiclesPage clickDVO_37(WebDriver driver)  {
		BrowserActions.click(driver, chkDVO_37,"DVO_37");
		return this;
	}
	public CoveredVehiclesPage clickOPV_44(WebDriver driver)  {
		BrowserActions.click(driver, chkOPV_44,"OPV_44");
		return this;
	}
	public CoveredVehiclesPage selectPolicyPeriodSelector_Arg(WebDriver driver,String PolicyPeriodSelector_Arg)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPolicyPeriodSelector_Arg,PolicyPeriodSelector_Arg,"PolicyPeriodSelector_Arg");
		return this;
	}
	public CoveredVehiclesPage clickShowPartialWorksheet(WebDriver driver)  {
		BrowserActions.click(driver, btnShowPartialWorksheet,"ShowPartialWorksheet");
		return this;
	}
	public CoveredVehiclesPage click60daydiary(WebDriver driver)  {
		BrowserActions.click(driver, btn60daydiary,"60daydiary");
		return this;
	}
	public CoveredVehiclesPage clickBack(WebDriver driver)  {
		BrowserActions.click(driver, btnBack,"Back");
		return this;
	}
	public CoveredVehiclesPage enterVehicleGroup(WebDriver driver,String VehicleGroup) {
		BrowserActions.type(driver, inpVehicleGroup,VehicleGroup, "VehicleGroup");
		return this;
	}
	public CoveredVehiclesPage clickOPV_54(WebDriver driver)  {
		BrowserActions.click(driver, chkOPV_54,"OPV_54");
		return this;
	}
	public CoveredVehiclesPage clickLocations(WebDriver driver)  {
		BrowserActions.click(driver, btnLocations,"Locations");
		return this;
	}
	public CoveredVehiclesPage clickOVO_43(WebDriver driver)  {
		BrowserActions.click(driver, chkOVO_43,"OVO_43");
		return this;
	}
	public CoveredVehiclesPage clickNext(WebDriver driver)  {
		BrowserActions.click(driver, btnNext,2,"Next");
		return this;
	}
	public CoveredVehiclesPage clickHVO_58(WebDriver driver)  {
		BrowserActions.click(driver, chkHVO_58,"HVO_58");
		return this;
	}
	public CoveredVehiclesPage clickQuoteRequired(WebDriver driver)  {
		BrowserActions.click(driver, btnQuoteRequired,"QuoteRequired");
		return this;
	}
	public CoveredVehiclesPage clickSRC_66(WebDriver driver)  {
		BrowserActions.click(driver, chkSRC_66,"SRC_66");
		return this;
	}
	public CoveredVehiclesPage clickSaveDraft(WebDriver driver)  {
		BrowserActions.click(driver, btnSaveDraft,"SaveDraft");
		return this;
	}
	public CoveredVehiclesPage clickGetBureauData(WebDriver driver)  {
		BrowserActions.click(driver, btnGetBureauData,"GetBureauData");
		return this;
	}
	public CoveredVehiclesPage clickReinsurance(WebDriver driver)  {
		BrowserActions.click(driver, btnReinsurance,"Reinsurance");
		return this;
	}
	public CoveredVehiclesPage clickDVO_47(WebDriver driver)  {
		BrowserActions.click(driver, chkDVO_47,"DVO_47");
		return this;
	}
	public CoveredVehiclesPage clickHVO_48(WebDriver driver)  {
		BrowserActions.click(driver, chkHVO_48,"HVO_48");
		return this;
	}
	public CoveredVehiclesPage clickOVO_13(WebDriver driver)  {
		BrowserActions.click(driver, chkOVO_13,"OVO_13");
		return this;
	}
	public CoveredVehiclesPage clickOPV_64(WebDriver driver)  {
		BrowserActions.click(driver, chkOPV_64,"OPV_64");
		return this;
	}
	public CoveredVehiclesPage clickDVO(WebDriver driver)  {
		BrowserActions.click(driver, chkDVO,"DVO");
		return this;
	}
	public CoveredVehiclesPage clickCreatefromatemplate(WebDriver driver)  {
		BrowserActions.click(driver, btnCreatefromatemplate,"Createfromatemplate");
		return this;
	}
	public CoveredVehiclesPage clickStartSidebySide(WebDriver driver)  {
		BrowserActions.click(driver, btnStartSidebySide,"StartSidebySide");
		return this;
	}
	public CoveredVehiclesPage clickSRC_56(WebDriver driver)  {
		BrowserActions.click(driver, chkSRC_56,"SRC_56");
		return this;
	}
	public CoveredVehiclesPage clickNOV_59(WebDriver driver)  {
		BrowserActions.click(driver, chkNOV_59,"NOV_59");
		return this;
	}
	public CoveredVehiclesPage clickArchiving(WebDriver driver)  {
		BrowserActions.click(driver, btnArchiving,"Archiving");
		return this;
	}
	public CoveredVehiclesPage clickNotTaken(WebDriver driver)  {
		BrowserActions.click(driver, btnNotTaken,"NotTaken");
		return this;
	}
	public CoveredVehiclesPage clickDVO_57(WebDriver driver)  {
		BrowserActions.click(driver, chkDVO_57,"DVO_57");
		return this;
	}
	public CoveredVehiclesPage clickDocuments(WebDriver driver)  {
		BrowserActions.click(driver, btnDocuments,"Documents");
		return this;
	}
	public CoveredVehiclesPage clickCUS(WebDriver driver)  {
		BrowserActions.click(driver, chkCUS,"CUS");
		return this;
	}
	public CoveredVehiclesPage clickHVO_38(WebDriver driver)  {
		BrowserActions.click(driver, chkHVO_38,"HVO_38");
		return this;
	}
	public CoveredVehiclesPage enterName(WebDriver driver,String Name) {
		BrowserActions.type(driver, inpName,Name, "Name");
		return this;
	}
	public CoveredVehiclesPage clickOVO_23(WebDriver driver)  {
		BrowserActions.click(driver, chkOVO_23,"OVO_23");
		return this;
	}
	public CoveredVehiclesPage clickQuote(WebDriver driver)  {
		BrowserActions.click(driver, btnQuote,"Quote");
		return this;
	}
	public CoveredVehiclesPage clickVehicles(WebDriver driver)  {
		BrowserActions.click(driver, btnVehicles,"Vehicles");
		return this;
	}
	public CoveredVehiclesPage clickReleaseLock(WebDriver driver)  {
		BrowserActions.click(driver, btnReleaseLock,"ReleaseLock");
		return this;
	}
	public CoveredVehiclesPage clickSRC_46(WebDriver driver)  {
		BrowserActions.click(driver, chkSRC_46,"SRC_46");
		return this;
	}
	public CoveredVehiclesPage clickNOV_69(WebDriver driver)  {
		BrowserActions.click(driver, chkNOV_69,"NOV_69");
		return this;
	}
	public CoveredVehiclesPage clickCreateNewProducer(WebDriver driver)  {
		BrowserActions.click(driver, btnCreateNewProducer,"CreateNewProducer");
		return this;
	}
	public CoveredVehiclesPage clickForms(WebDriver driver)  {
		BrowserActions.click(driver, btnForms,"Forms");
		return this;
	}
	public CoveredVehiclesPage clickSRC_6(WebDriver driver)  {
		BrowserActions.click(driver, chkSRC_6,"SRC_6");
		return this;
	}
	public CoveredVehiclesPage enterCoverage_61(WebDriver driver,String Coverage_61) {
		BrowserActions.type(driver, inpCoverage_61,Coverage_61, "Coverage_61");
		return this;
	}
	public CoveredVehiclesPage clickDVO_67(WebDriver driver)  {
		BrowserActions.click(driver, chkDVO_67,"DVO_67");
		return this;
	}
	public CoveredVehiclesPage clickNotes(WebDriver driver)  {
		BrowserActions.click(driver, btnNotes,"Notes");
		return this;
	}
	public CoveredVehiclesPage clickHVO_28(WebDriver driver)  {
		BrowserActions.click(driver, chkHVO_28,"HVO_28");
		return this;
	}
	public CoveredVehiclesPage enterDescription_74(WebDriver driver,String Description_74) {
		BrowserActions.type(driver, inpDescription_74,Description_74, "Description_74");
		return this;
	}
	public CoveredVehiclesPage enterDescription_72(WebDriver driver,String Description_72) {
		BrowserActions.type(driver, inpDescription_72,Description_72, "Description_72");
		return this;
	}
	public CoveredVehiclesPage clickSRC(WebDriver driver)  {
		BrowserActions.click(driver, chkSRC,"SRC");
		return this;
	}
	public CoveredVehiclesPage enterDescription_78(WebDriver driver,String Description_78) {
		BrowserActions.type(driver, inpDescription_78,Description_78, "Description_78");
		return this;
	}
	public CoveredVehiclesPage clickGetInspectionLossControl(WebDriver driver)  {
		BrowserActions.click(driver, btnGetInspectionLossControl,"GetInspectionLossControl");
		return this;
	}
	public CoveredVehiclesPage enterDescription_76(WebDriver driver,String Description_76) {
		BrowserActions.type(driver, inpDescription_76,Description_76, "Description_76");
		return this;
	}
	public CoveredVehiclesPage clickCoveredVehicles(WebDriver driver)  {
		BrowserActions.click(driver, btnCoveredVehicles,"CoveredVehicles");
		return this;
	}
	public CoveredVehiclesPage clickCreate(WebDriver driver)  {
		BrowserActions.click(driver, btnCreate,"Create");
		return this;
	}
	public CoveredVehiclesPage enterDescription(WebDriver driver,String Description) {
		BrowserActions.type(driver, inpDescription,Description, "Description");
		return this;
	}
	public CoveredVehiclesPage enterCoverage_51(WebDriver driver,String Coverage_51) {
		BrowserActions.type(driver, inpCoverage_51,Coverage_51, "Coverage_51");
		return this;
	}
	public CoveredVehiclesPage clickNOV_39(WebDriver driver)  {
		BrowserActions.click(driver, chkNOV_39,"NOV_39");
		return this;
	}
	public CoveredVehiclesPage clickOCV_65(WebDriver driver)  {
		BrowserActions.click(driver, chkOCV_65,"OCV_65");
		return this;
	}
	public CoveredVehiclesPage clickLegalreview(WebDriver driver)  {
		BrowserActions.click(driver, btnLegalreview,"Legalreview");
		return this;
	}
	public CoveredVehiclesPage clickPolicynotification(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicynotification,"Policynotification");
		return this;
	}
	public CoveredVehiclesPage clickDVO_7(WebDriver driver)  {
		BrowserActions.click(driver, chkDVO_7,"DVO_7");
		return this;
	}
	public CoveredVehiclesPage clickGoto(WebDriver driver)  {
		BrowserActions.click(driver, btnGoto,"Goto");
		return this;
	}
	public CoveredVehiclesPage clickANY_52(WebDriver driver)  {
		BrowserActions.click(driver, chkANY_52,"ANY_52");
		return this;
	}
	public CoveredVehiclesPage clickUnderwriterReview(WebDriver driver)  {
		BrowserActions.click(driver, btnUnderwriterReview,"UnderwriterReview");
		return this;
	}
	public CoveredVehiclesPage enterDescription_84(WebDriver driver,String Description_84) {
		BrowserActions.type(driver, inpDescription_84,Description_84, "Description_84");
		return this;
	}
	public CoveredVehiclesPage clickHVO_18(WebDriver driver)  {
		BrowserActions.click(driver, chkHVO_18,"HVO_18");
		return this;
	}
	public CoveredVehiclesPage click30daydiary(WebDriver driver)  {
		BrowserActions.click(driver, btn30daydiary,"30daydiary");
		return this;
	}
	public CoveredVehiclesPage enterDescription_82(WebDriver driver,String Description_82) {
		BrowserActions.type(driver, inpDescription_82,Description_82, "Description_82");
		return this;
	}
	public CoveredVehiclesPage clickSidebySideQuoting(WebDriver driver)  {
		BrowserActions.click(driver, btnSidebySideQuoting,"SidebySideQuoting");
		return this;
	}
	public CoveredVehiclesPage enterDescription_86(WebDriver driver,String Description_86) {
		BrowserActions.type(driver, inpDescription_86,Description_86, "Description_86");
		return this;
	}
	public CoveredVehiclesPage clickStateInfo(WebDriver driver)  {
		BrowserActions.click(driver, btnStateInfo,"StateInfo");
		return this;
	}
	public CoveredVehiclesPage enterDescription_80(WebDriver driver,String Description_80) {
		BrowserActions.type(driver, inpDescription_80,Description_80, "Description_80");
		return this;
	}
	public CoveredVehiclesPage clickCollectCreditCard(WebDriver driver)  {
		BrowserActions.click(driver, btnCollectCreditCard,"CollectCreditCard");
		return this;
	}
	public CoveredVehiclesPage clickQuote_88(WebDriver driver)  {
		BrowserActions.click(driver, btnQuote_88,"Quote_88");
		return this;
	}
	public CoveredVehiclesPage enterCoverage_41(WebDriver driver,String Coverage_41) {
		BrowserActions.type(driver, inpCoverage_41,Coverage_41, "Coverage_41");
		return this;
	}
	public CoveredVehiclesPage clickQuote_87(WebDriver driver)  {
		BrowserActions.click(driver, btnQuote_87,"Quote_87");
		return this;
	}
	public CoveredVehiclesPage clickNOV_49(WebDriver driver)  {
		BrowserActions.click(driver, chkNOV_49,"NOV_49");
		return this;
	}
	public CoveredVehiclesPage clickRatiooutofrange(WebDriver driver)  {
		BrowserActions.click(driver, btnRatiooutofrange,"Ratiooutofrange");
		return this;
	}
	public CoveredVehiclesPage clickFullApp(WebDriver driver)  {
		BrowserActions.click(driver, btnFullApp,"FullApp");
		return this;
	}
	public CoveredVehiclesPage clickOPV_14(WebDriver driver)  {
		BrowserActions.click(driver, chkOPV_14,"OPV_14");
		return this;
	}
	public CoveredVehiclesPage clickDiagnosticData(WebDriver driver)  {
		BrowserActions.click(driver, btnDiagnosticData,"DiagnosticData");
		return this;
	}
	public CoveredVehiclesPage clickANY(WebDriver driver)  {
		BrowserActions.click(driver, chkANY,"ANY");
		return this;
	}
	public CoveredVehiclesPage clickANY_62(WebDriver driver)  {
		BrowserActions.click(driver, chkANY_62,"ANY_62");
		return this;
	}
	public CoveredVehiclesPage clickReminder(WebDriver driver)  {
		BrowserActions.click(driver, btnReminder,"Reminder");
		return this;
	}
	public CoveredVehiclesPage clickHVO_8(WebDriver driver)  {
		BrowserActions.click(driver, chkHVO_8,"HVO_8");
		return this;
	}
	public CoveredVehiclesPage enterCoverage_31(WebDriver driver,String Coverage_31) {
		BrowserActions.type(driver, inpCoverage_31,Coverage_31, "Coverage_31");
		return this;
	}
	public CoveredVehiclesPage clickOCV_45(WebDriver driver)  {
		BrowserActions.click(driver, chkOCV_45,"OCV_45");
		return this;
	}
	public CoveredVehiclesPage clickOPV_24(WebDriver driver)  {
		BrowserActions.click(driver, chkOPV_24,"OPV_24");
		return this;
	}
	public CoveredVehiclesPage clickReviewnewmail(WebDriver driver)  {
		BrowserActions.click(driver, btnReviewnewmail,"Reviewnewmail");
		return this;
	}
	public CoveredVehiclesPage clickGroup(WebDriver driver)  {
		BrowserActions.click(driver, btnGroup,"Group");
		return this;
	}
	public CoveredVehiclesPage clickCancelasplitpolicy(WebDriver driver)  {
		BrowserActions.click(driver, btnCancelasplitpolicy,"Cancelasplitpolicy");
		return this;
	}
	public CoveredVehiclesPage clickGetAuditOutsideService(WebDriver driver)  {
		BrowserActions.click(driver, btnGetAuditOutsideService,"GetAuditOutsideService");
		return this;
	}
	public CoveredVehiclesPage clickNOV_19(WebDriver driver)  {
		BrowserActions.click(driver, chkNOV_19,"NOV_19");
		return this;
	}
	public CoveredVehiclesPage clickNewAuditAssignment(WebDriver driver)  {
		BrowserActions.click(driver, btnNewAuditAssignment,"NewAuditAssignment");
		return this;
	}
	public CoveredVehiclesPage clickRewritetoNewAccount(WebDriver driver)  {
		BrowserActions.click(driver, btnRewritetoNewAccount,"RewritetoNewAccount");
		return this;
	}
	public CoveredVehiclesPage clickReview30dayUWPeriod(WebDriver driver)  {
		BrowserActions.click(driver, btnReview30dayUWPeriod,"Review30dayUWPeriod");
		return this;
	}
	public CoveredVehiclesPage clickPolicyVersions(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyVersions,"PolicyVersions");
		return this;
	}
	public CoveredVehiclesPage clickNOV_29(WebDriver driver)  {
		BrowserActions.click(driver, chkNOV_29,"NOV_29");
		return this;
	}
	public CoveredVehiclesPage clickOCV_55(WebDriver driver)  {
		BrowserActions.click(driver, chkOCV_55,"OCV_55");
		return this;
	}
	public CoveredVehiclesPage clickCloseOptions(WebDriver driver)  {
		BrowserActions.click(driver, btnCloseOptions,"CloseOptions");
		return this;
	}
	public CoveredVehiclesPage enterCoverage_21(WebDriver driver,String Coverage_21) {
		BrowserActions.type(driver, inpCoverage_21,Coverage_21, "Coverage_21");
		return this;
	}
	public CoveredVehiclesPage clickOCV_5(WebDriver driver)  {
		BrowserActions.click(driver, chkOCV_5,"OCV_5");
		return this;
	}
	public CoveredVehiclesPage clickPolicyFile(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyFile,"PolicyFile");
		return this;
	}
	public CoveredVehiclesPage clickVerifycoverage(WebDriver driver)  {
		BrowserActions.click(driver, btnVerifycoverage,"Verifycoverage");
		return this;
	}
	public CoveredVehiclesPage clickOPV_34(WebDriver driver)  {
		BrowserActions.click(driver, chkOPV_34,"OPV_34");
		return this;
	}
	public CoveredVehiclesPage clickGetCreditReports(WebDriver driver)  {
		BrowserActions.click(driver, btnGetCreditReports,"GetCreditReports");
		return this;
	}
	public CoveredVehiclesPage clickDecline(WebDriver driver)  {
		BrowserActions.click(driver, btnDecline,"Decline");
		return this;
	}
	public CoveredVehiclesPage clickWizardMenuActions(WebDriver driver)  {
		BrowserActions.click(driver, btnWizardMenuActions,"WizardMenuActions");
		return this;
	}
	public CoveredVehiclesPage clickSubManager(WebDriver driver)  {
		BrowserActions.click(driver, btnSubManager,"SubManager");
		return this;
	}
}
