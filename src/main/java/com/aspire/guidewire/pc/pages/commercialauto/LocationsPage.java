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

public class LocationsPage extends LoadableComponent<LocationsPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
	//	public TopNavBar topnavbar;
	//	public LocationsPanelSet locationspanelsetTable;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Workplan>div[role='menuitem']", AI = false)
	public WebElement btnWorkplan;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-0-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnCPP0032764706;

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

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-LocationsPanelSet-LocationsEdit_DP_tb-addLocationButton>div[role='button']", AI = false)
	public WebElement btnAddExistingLocation;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-1-item>div[role='menuitem']", AI = false)
	public WebElement btnGetAuditInternalPersonnel;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-JobWizardToolbarButtonSet-BindOptions-BindOnly>div[role='menuitem']", AI = false)
	public WebElement btnBindOnly;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-0-NewActivityMenuItemSet_Category>div[role='menuitem']", AI = false)
	public WebElement btnInterview;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-MultiQuoteAcceleratedMenuActions-PolicyPeriodSelector-PolicyPeriodSelector_Arg']", AI = false)
	public WebElement drpPolicyPeriodSelector_Arg;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-LocationsPanelSet-LocationsEdit_DP-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-TargetedAddressInputSet-globalAddressContainer-GlobalAddressInputSet-PostalCode-AutoFillIcon", AI = false)
	public WebElement btnAutoFillIcon_4;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-6-item>div[role='menuitem']", AI = false)
	public WebElement btnPerformanceReview;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-DiagWorksheetItem-ShowDiagWorksheet>div[role='menuitem']", AI = false)
	public WebElement btnShowPartialWorksheet;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-LocationsPanelSet-LocationsEdit_DP-LocationsEdit_LV-0-InSync']", AI = false)
	public WebElement rdbUpToDate;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-1-item>div[role='menuitem']", AI = false)
	public WebElement btn60daydiary;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-JobWizardToolbarButtonSet-Versions-NewVersion>div[role='menuitem']", AI = false)
	public WebElement btnStartMultiVersion;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-LocationsPanelSet-LocationsEdit_DP-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-TargetedAddressInputSet-globalAddressContainer-GlobalAddressInputSet-County']", AI = false)
	public WebElement inpCounty;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Prev>div[role='button']", AI = false)
	public WebElement btnBack;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-LocationsPanelSet-LocationsEdit_DP-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-UnsyncedAddressInputSet-UnsyncedCountry']", AI = false)
	public WebElement drpCountry_7;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-IMWizardStepGroup-Buildings>div[role='menuitem']", AI = false)
	public WebElement btnBuildingsandLocations_14;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-15-item>div[role='menuitem']", AI = false)
	public WebElement btnReviewProducer;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-LocationsPanelSet-LocationsEdit_DP-LocationsEdit_LV-0-LocationCode']", AI = false)
	public WebElement inpLocationCode;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-CPPLocations>div[role='menuitem']", AI = false)
	public WebElement btnLocations;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-GLWizardStepGroup-GLLine>div[role='menuitem']", AI = false)
	public WebElement btnCoverages;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-LocationsPanelSet-LocationsEdit_DP-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-TargetedAddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressSummary']", AI = false)
	public WebElement inpAddress_3;

	@IFindBy(how = How.CSS, using = "div[id$='Next']", AI = false)
	public WebElement btnNext;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-LocationsPanelSet-LocationsEdit_DP-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-Phone-GlobalPhoneInputSet-Extension']", AI = false)
	public WebElement inpPhoneExtension;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-LocationsPanelSet-LocationsEdit_DP-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-UnsyncedAddressInputSet-unsyncedAddressString']", AI = false)
	public WebElement inpAddress_5;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-10-item>div[role='menuitem']", AI = false)
	public WebElement btnQuoteRequired;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-8-item>div[role='menuitem']", AI = false)
	public WebElement btnPolicyReviewMidterm;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-LocationsPanelSet-LocationsEdit_DP-LocationDetailCV-AdditionalCoveragesCardTab", AI = false)
	public WebElement btnAdditionalCoverages;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-JobWizardToolbarButtonSet-Versions-ViewSideBySide>div[role='menuitem']", AI = false)
	public WebElement btnViewSideBySideVersions;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-JobWizardToolbarButtonSet-Draft>div[role='button']", AI = false)
	public WebElement btnSaveDraft;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-3-item>div[role='menuitem']", AI = false)
	public WebElement btnGetBureauData;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-LocationsPanelSet-LocationsEdit_DP-LocationDetailCV-LocationQuestionsCardTab", AI = false)
	public WebElement btnQuestions;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-LocationsPanelSet-LocationsEdit_DP-LocationsEdit_LV-0-Loc']", AI = false)
	public WebElement inpLoc;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Reinsurance>div[role='menuitem']", AI = false)
	public WebElement btnReinsurance;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-BillingInfo>div[role='menuitem']", AI = false)
	public WebElement btnPayment;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Change-WizardMenuActions_ChangeEffDate>div[role='menuitem']", AI = false)
	public WebElement btnEffectiveDate;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-LocationsPanelSet-LocationsEdit_DP-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-TerritoryCodeInputSet-1-TerritoryCode']", AI = false)
	public WebElement inpTerritoryCode_10;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-QuoteRequestedAlert .gw-AlertBar--label", AI = false)
	public WebElement lblQuoteRequestedAlert;

	@IFindBy(how = How.CSS, using = "div[id$='LocationsEdit_DP_tb-Add']", AI = false)
	public WebElement btnNewLocation;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-RiskEvaluation>div[role='menuitem']", AI = false)
	public WebElement btnRiskAnalysis_20;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-CPPLineSelection>div[role='menuitem']", AI = false)
	public WebElement btnLineSelection;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-LocationsPanelSet-LocationsEdit_DP_tb-setToPrimary>div[role='button']", AI = false)
	public WebElement btnSetAsPrimary;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-LocationsPanelSet-LocationsEdit_DP-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-TargetedAddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine3']", AI = false)
	public WebElement inpAddress3;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-LocationsPanelSet-LocationsEdit_DP-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-TargetedAddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine1']", AI = false)
	public WebElement inpAddress1;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-LocationsPanelSet-LocationsEdit_DP-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-TargetedAddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine2']", AI = false)
	public WebElement inpAddress2;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewDocument-NewJobDocumentMenuItemSet-PolicyPeriodNewDocumentMenuItemSet_Template>div[role='menuitem']", AI = false)
	public WebElement btnCreatefromatemplate;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-CPWizardStepGroup-CPBuildings>div[role='menuitem']", AI = false)
	public WebElement btnBuildingsandLocations;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-JobWizardToolbarButtonSet-Versions-SideBySide>div[role='menuitem']", AI = false)
	public WebElement btnStartSidebySide;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-LocationsPanelSet-LocationsEdit_DP-LocationsEdit_LV-0-Address']", AI = false)
	public WebElement inpAddress;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Archiving>div[role='menuitem']", AI = false)
	public WebElement btnArchiving;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-LocationsPanelSet-LocationsEdit_DP-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-TargetedAddressInputSet-globalAddressContainer-GlobalAddressInputSet-PostalCode']", AI = false)
	public WebElement inpZIPCode;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-LocationsPanelSet-LocationsEdit_DP-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-TargetedAddressInputSet-globalAddressContainer-GlobalAddressInputSet-City-AutoFillIcon", AI = false)
	public WebElement btnAutoFillIcon;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-JobWizardToolbarButtonSet-CloseOptions-NotTakenJob>div[role='menuitem']", AI = false)
	public WebElement btnNotTaken;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-1-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnBOP0030480823;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Documents>div[role='menuitem']", AI = false)
	public WebElement btnDocuments;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-LocationsPanelSet-LocationsEdit_DP-PreferredCoverageCurrencySelectorRef-PreferredCoverageCurrencyPanelSet-PreferredCoverageCurrencySelectorDropDown']", AI = false)
	public WebElement drpCoveragesin;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-PolicyVersions>div[role='menuitem']", AI = false)
	public WebElement btnPolicyVersions_19;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-OOSEPanelSet-NextSliceLink", AI = false)
	public WebElement btnNextBlockedDate;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-CPWizardStepGroup-CPModifiers>div[role='menuitem']", AI = false)
	public WebElement btnModifiers_12;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-2-item>div[role='menuitem']", AI = false)
	public WebElement btn90daydiary;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-CPPModifiers>div[role='menuitem']", AI = false)
	public WebElement btnModifiers_16;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-JobWizardToolbarButtonSet-QuoteTypeToolbarButtonSet-Quote>div[role='button']", AI = false)
	public WebElement btnQuote;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-JobWizardToolbarButtonSet-BindOptions>div[role='button']", AI = false)
	public WebElement btnBindOptions;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-LocationsPanelSet-LocationsEdit_DP-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-TargetedAddressInputSet-globalAddressContainer-GlobalAddressInputSet-Country']", AI = false)
	public WebElement drpCountry;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-LocationsPanelSet-LocationsEdit_DP-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-TargetedAddressInputSet-globalAddressContainer-GlobalAddressInputSet-State']", AI = false)
	public WebElement drpState;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-JobWizardToolbarButtonSet-Unlock>div[role='button']", AI = false)
	public WebElement btnReleaseLock;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Archiving-WizardMenuActions_SuspendResumeArchiving>div[role='menuitem']", AI = false)
	public WebElement btnEnableDisable;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-JobWizardToolbarButtonSet-BindOptions-BindAndIssue>div[role='menuitem']", AI = false)
	public WebElement btnIssuePolicy;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-LocationsPanelSet-LocationsEdit_DP-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-TerritoryCodeInputSet-AutofillLink", AI = false)
	public WebElement btnAutofillTerritoryCodes;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-0-item>div[role='menuitem']", AI = false)
	public WebElement btnCreateNewProducer;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-LocationsPanelSet-LocationsEdit_DP-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-UnsyncedAddressInputSet-UnsyncedCounty']", AI = false)
	public WebElement inpCounty_6;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Forms>div[role='menuitem']", AI = false)
	public WebElement btnForms;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-MultiQuoteAcceleratedMenuActions-PolicyPeriodSelector", AI = false)
	public WebElement btnPolicyPeriodSelector;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-1-NewActivityMenuItemSet_Category>div[role='menuitem']", AI = false)
	public WebElement btnNewmail;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-CPWizardStepGroup-CPBlanket>div[role='menuitem']", AI = false)
	public WebElement btnBlankets;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-7-item>div[role='menuitem']", AI = false)
	public WebElement btnGetMotorVehicleReports;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-LocationsPanelSet-LocationsEdit_DP-LocationsEdit_LV-0-NonSpecificLocation']", AI = false)
	public WebElement chkNonSpecific;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-PreQualification>div[role='menuitem']", AI = false)
	public WebElement btnQualification;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Notes>div[role='menuitem']", AI = false)
	public WebElement btnNotes;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-5-item>div[role='menuitem']", AI = false)
	public WebElement btnGetInspectionLossControl;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-LocationsPanelSet-LocationsEdit_DP-LocationsEdit_LV-0-LocationName']", AI = false)
	public WebElement inpLocationName;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Participants>div[role='menuitem']", AI = false)
	public WebElement btnParticipants;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create>div[role='menuitem']", AI = false)
	public WebElement btnCreate;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-LocationsPanelSet-LocationsEdit_DP-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-TaxLocation']", AI = false)
	public WebElement inpTaxLocation;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-GLWizardStepGroup-GLLineEU>div[role='menuitem']", AI = false)
	public WebElement btnExposures;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-4-NewActivityMenuItemSet_Category-0-item>div[role='menuitem']", AI = false)
	public WebElement btnReviewandapprove;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-IMWizardStepGroup-0-impartstep>div[role='menuitem']", AI = false)
	public WebElement btnAccountsReceivable;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-OOSEPanelSet-OOSEPeriodSelector-OOSEPeriodSelector_Arg']", AI = false)
	public WebElement drpEffectiveDate;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-CPWizardStepGroup>div[role='menuitem']", AI = false)
	public WebElement btnCommercialProperty;

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

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-LocationsPanelSet-LocationsEdit_DP-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-TargetedAddressInputSet-globalAddressContainer-GlobalAddressInputSet-City']", AI = false)
	public WebElement inpCity;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto>div[role='menuitem']", AI = false)
	public WebElement btnGoto;

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

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-LocationsPanelSet-LocationsEdit_DP-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-TaxLocation-SelectTaxLocation", AI = false)
	public WebElement btnSearch;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-IMWizardStepGroup-2-impartstep>div[role='menuitem']", AI = false)
	public WebElement btnSigns;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewNote>div[role='menuitem']", AI = false)
	public WebElement btnNewNote;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-SideBySide>div[role='menuitem']", AI = false)
	public WebElement btnSidebySideQuoting;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-RiskAnalysis>div[role='menuitem']", AI = false)
	public WebElement btnRiskAnalysis;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-0-NewActivityMenuItemSet_Category-1-item>div[role='menuitem']", AI = false)
	public WebElement btnMeetwithProducerAgency;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-IMWizardStepGroup>div[role='menuitem']", AI = false)
	public WebElement btnInlandMarine;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-CollectCreditCard>div[role='menuitem']", AI = false)
	public WebElement btnCollectCreditCard;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-LocationsPanelSet-LocationsEdit_DP-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-Phone-GlobalPhoneInputSet-CountryCode']", AI = false)
	public WebElement drpPhoneRegionCode;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-GLWizardStepGroup>div[role='menuitem']", AI = false)
	public WebElement btnGeneralLiability;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-LocationsPanelSet-LocationsEdit_DP-LocationDetailCV-GeneralInfoCardTab", AI = false)
	public WebElement btnDetails;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-11-item>div[role='menuitem']", AI = false)
	public WebElement btnRatiooutofrange;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-JobWizardToolbarButtonSet-ConvertToFullApp>div[role='button']", AI = false)
	public WebElement btnFullApp;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-LocationsPanelSet-LocationsEdit_DP-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-LocationName']", AI = false)
	public WebElement inpLocationName_2;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-PolicyReview>div[role='menuitem']", AI = false)
	public WebElement btnPolicyReview;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-DiagWorksheetItem>div[role='menuitem']", AI = false)
	public WebElement btnDiagnosticData;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-OOSEPanelSet-OOSEPeriodSelector", AI = false)
	public WebElement btnOOSEPeriodSelector;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-LocationsPanelSet-LocationsEdit_DP-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-TerritoryCodeInputSet-1-TerritoryCode-SelectTerritoryCode", AI = false)
	public WebElement btnSearch_11;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-LocationsPanelSet-LocationsEdit_DP-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-Phone-GlobalPhoneInputSet-NationalSubscriberNumber']", AI = false)
	public WebElement inpPhone;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-IMWizardStepGroup-IMReview>div[role='menuitem']", AI = false)
	public WebElement btnLineReview_15;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-11-item>div[role='menuitem']", AI = false)
	public WebElement btnManuallyrateandquotepolicy;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-CPWizardStepGroup-CPReview>div[role='menuitem']", AI = false)
	public WebElement btnLineReview_13;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-History>div[role='menuitem']", AI = false)
	public WebElement btnHistory;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category>div[role='menuitem']", AI = false)
	public WebElement btnReminder;

	@IFindBy(how = How.CSS, using = "div[id$='LocationsScreen-ttlBar']", AI = false)
	public WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-IMWizardStepGroup-IMPartSelection>div[role='menuitem']", AI = false)
	public WebElement btnCoveragePartSelection;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Change>div[role='menuitem']", AI = false)
	public WebElement btnEdit;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-JobWizardToolbarButtonSet-CloseOptions-WithdrawJob>div[role='menuitem']", AI = false)
	public WebElement btnWithdrawTransaction;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-PolicyInfo>div[role='menuitem']", AI = false)
	public WebElement btnPolicyInfo;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-LocationsPanelSet-LocationsEdit_DP-LocationDetailCV-AccountLocationUpToDateDV-SynchronizedLink", AI = false)
	public WebElement btnViewCurrentLocation;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-JobWizardToolbarButtonSet-Versions>div[role='button']", AI = false)
	public WebElement btnVersions;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-LocationsPanelSet-LocationsEdit_DP-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-TerritoryCodeInputSet-0-TerritoryCode-SelectTerritoryCode", AI = false)
	public WebElement btnSearch_9;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-GLWizardStepGroup-GLModifiers>div[role='menuitem']", AI = false)
	public WebElement btnModifiers;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_ToAccountFile>div[role='menuitem']", AI = false)
	public WebElement btnAccountFile;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-LocationsPanelSet-LocationsEdit_DP_tb-Remove>div[role='button']", AI = false)
	public WebElement btnRemove;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-1-NewActivityMenuItemSet_Category-0-item>div[role='menuitem']", AI = false)
	public WebElement btnReviewnewmail;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup>div[role='menuitem']", AI = false)
	public WebElement btnGroup;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-3-item>div[role='menuitem']", AI = false)
	public WebElement btnCancelasplitpolicy;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-2-item>div[role='menuitem']", AI = false)
	public WebElement btnGetAuditOutsideService;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-LocationsPanelSet-LocationsEdit_DP-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-LocationCode']", AI = false)
	public WebElement inpLocationCode_1;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Change-WizardMenuActions_CopyPolicyData>div[role='menuitem']", AI = false)
	public WebElement btnCopyData;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-JobGroupItem>div[role='menuitem']", AI = false)
	public WebElement btnSG00304808234562925823;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-5-item>div[role='menuitem']", AI = false)
	public WebElement btnNewAuditAssignment;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-16-item>div[role='menuitem']", AI = false)
	public WebElement btnRewritetoNewAccount;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-QuoteRequestedAlert-CloseBtn", AI = false)
	public WebElement btnClose;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-12-item>div[role='menuitem']", AI = false)
	public WebElement btnReview30dayUWPeriod;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-ManageBranches>div[role='menuitem']", AI = false)
	public WebElement btnPolicyVersions;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-14-item>div[role='menuitem']", AI = false)
	public WebElement btnReview60dayUWPeriod;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-JobWizardToolbarButtonSet-EditPolicy>div[role='button']", AI = false)
	public WebElement btnEditPolicyTransaction;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-IMWizardStepGroup-1-impartstep>div[role='menuitem']", AI = false)
	public WebElement btnContractorsEquipment;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-ViewMultiLineQuote>div[role='menuitem']", AI = false)
	public WebElement btnQuote_18;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-ViewQuote>div[role='menuitem']", AI = false)
	public WebElement btnQuote_17;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity>div[role='menuitem']", AI = false)
	public WebElement btnNewActivity;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-LocationsPanelSet-LocationsEdit_DP_tb-addAllLocationsButton>div[role='button']", AI = false)
	public WebElement btnAddAllExisting;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Cancel>div[role='button']", AI = false)
	public WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-JobWizardToolbarButtonSet-CloseOptions>div[role='button']", AI = false)
	public WebElement btnCloseOptions;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup>div[role='menuitem']", AI = false)
	public WebElement btnPolicyContract;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-LocationsPanelSet-LocationsEdit_DP-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-Phone-GlobalPhoneInputSet-PhoneDisplay']", AI = false)
	public WebElement inpPhone_8;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_ToPolicyFile>div[role='menuitem']", AI = false)
	public WebElement btnPolicyFile;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-17-item>div[role='menuitem']", AI = false)
	public WebElement btnVerifycoverage;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category>div[role='menuitem']", AI = false)
	public WebElement btnRequest;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-4-item>div[role='menuitem']", AI = false)
	public WebElement btnGetCreditReports;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-LocationsPanelSet-LocationsEdit_DP-PreferredCoverageCurrencySelectorRef-PreferredCoverageCurrencyPanelSet-CoverageCurrencyDisplay']", AI = false)
	public WebElement inpCoveragesin;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-JobWizardToolbarButtonSet-CloseOptions-Decline>div[role='menuitem']", AI = false)
	public WebElement btnDecline;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-GLWizardStepGroup-GLReview>div[role='menuitem']", AI = false)
	public WebElement btnLineReview;

	@IFindBy(how = How.CSS, using = "div[id=$'SubmissionWizard-WizardMenuActions']>div[role='button']", AI = false)
	public WebElement btnWizardMenuActions;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardActionsMenuItemSet-SubmissionInfo>div[role='menuitem']", AI = false)
	public WebElement btnSubManager;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-LocationsPanelSet-LocationsEdit_DP-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-NonSpecificLocation']", AI = false)
	public WebElement rdbNonSpecificLocation;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-LocationsScreen-LocationsPanelSet-LocationsEdit_DP-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-TerritoryCodeInputSet-0-TerritoryCode']", AI = false)
	public WebElement inpTerritoryCode;

	@IFindBy(how = How.CSS, using = "div[id$='Address']", AI = false)
	public WebElement lnkAddress;

	public LocationsPage(){
	}

	public LocationsPage(WebDriver driver){
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(finder, this);
		//		locationspanelsetTable = new LocationsPanelSet();
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
	}public LocationsPage clickWorkplan(WebDriver driver)  {
		BrowserActions.click(driver, btnWorkplan,"Workplan");
		return this;
	}
	public LocationsPage clickCPP0032764706(WebDriver driver)  {
		BrowserActions.click(driver, btnCPP0032764706,"CPP0032764706");
		return this;
	}
	public LocationsPage clickGetRiskInformationProducer(WebDriver driver)  {
		BrowserActions.click(driver, btnGetRiskInformationProducer,"GetRiskInformationProducer");
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
	public LocationsPage clickReview45dayUWPeriod(WebDriver driver)  {
		BrowserActions.click(driver, btnReview45dayUWPeriod,"Review45dayUWPeriod");
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
	public LocationsPage clickBindOnly(WebDriver driver)  {
		BrowserActions.click(driver, btnBindOnly,"BindOnly");
		return this;
	}
	public LocationsPage clickInterview(WebDriver driver)  {
		BrowserActions.click(driver, btnInterview,"Interview");
		return this;
	}
	public LocationsPage selectPolicyPeriodSelector_Arg(WebDriver driver,String PolicyPeriodSelector_Arg)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPolicyPeriodSelector_Arg,PolicyPeriodSelector_Arg,"PolicyPeriodSelector_Arg");
		return this;
	}
	public LocationsPage clickAutoFillIcon_4(WebDriver driver)  {
		BrowserActions.click(driver, btnAutoFillIcon_4,"AutoFillIcon_4");
		return this;
	}
	public LocationsPage clickPerformanceReview(WebDriver driver)  {
		BrowserActions.click(driver, btnPerformanceReview,"PerformanceReview");
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
	public LocationsPage clickStartMultiVersion(WebDriver driver)  {
		BrowserActions.click(driver, btnStartMultiVersion,"StartMultiVersion");
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
	public LocationsPage selectCountry_7(WebDriver driver,String Country_7)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCountry_7,Country_7,"Country_7");
		return this;
	}
	public LocationsPage clickBuildingsandLocations_14(WebDriver driver)  {
		BrowserActions.click(driver, btnBuildingsandLocations_14,"BuildingsandLocations_14");
		return this;
	}
	public LocationsPage clickReviewProducer(WebDriver driver)  {
		BrowserActions.click(driver, btnReviewProducer,"ReviewProducer");
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
	public LocationsPage clickCoverages(WebDriver driver)  {
		BrowserActions.click(driver, btnCoverages,"Coverages");
		return this;
	}
	public LocationsPage enterAddress_3(WebDriver driver,String Address_3) {
		BrowserActions.type(driver, inpAddress_3,Address_3, "Address_3");
		return this;
	}
	public LocationsPage clickNext(WebDriver driver)  {
		BrowserActions.click(driver, btnNext,"Next");
		return this;
	}
	public LocationsPage enterPhoneExtension(WebDriver driver,String PhoneExtension) {
		BrowserActions.type(driver, inpPhoneExtension,PhoneExtension, "PhoneExtension");
		return this;
	}
	public LocationsPage enterAddress_5(WebDriver driver,String Address_5) {
		BrowserActions.type(driver, inpAddress_5,Address_5, "Address_5");
		return this;
	}
	public LocationsPage clickQuoteRequired(WebDriver driver)  {
		BrowserActions.click(driver, btnQuoteRequired,"QuoteRequired");
		return this;
	}
	public LocationsPage clickPolicyReviewMidterm(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyReviewMidterm,"PolicyReviewMidterm");
		return this;
	}
	public LocationsPage clickAdditionalCoverages(WebDriver driver)  {
		BrowserActions.click(driver, btnAdditionalCoverages,"AdditionalCoverages");
		return this;
	}
	public LocationsPage clickViewSideBySideVersions(WebDriver driver)  {
		BrowserActions.click(driver, btnViewSideBySideVersions,"ViewSideBySideVersions");
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
	public LocationsPage clickQuestions(WebDriver driver)  {
		BrowserActions.click(driver, btnQuestions,"Questions");
		return this;
	}
	public LocationsPage enterLoc(WebDriver driver,String Loc) {
		BrowserActions.type(driver, inpLoc,Loc, "Loc");
		return this;
	}
	public LocationsPage clickReinsurance(WebDriver driver)  {
		BrowserActions.click(driver, btnReinsurance,"Reinsurance");
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
	public LocationsPage enterTerritoryCode_10(WebDriver driver,String TerritoryCode_10) {
		BrowserActions.type(driver, inpTerritoryCode_10,TerritoryCode_10, "TerritoryCode_10");
		return this;
	}
	public LocationsPage clickNewLocation(WebDriver driver)  {
		BrowserActions.click(driver, btnNewLocation,"NewLocation");
		return this;
	}
	public LocationsPage clickRiskAnalysis_20(WebDriver driver)  {
		BrowserActions.click(driver, btnRiskAnalysis_20,"RiskAnalysis_20");
		return this;
	}
	public LocationsPage clickLineSelection(WebDriver driver)  {
		BrowserActions.click(driver, btnLineSelection,"LineSelection");
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
	public LocationsPage clickCreatefromatemplate(WebDriver driver)  {
		BrowserActions.click(driver, btnCreatefromatemplate,"Createfromatemplate");
		return this;
	}
	public LocationsPage clickBuildingsandLocations(WebDriver driver)  {
		BrowserActions.click(driver, btnBuildingsandLocations,"BuildingsandLocations");
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
	public LocationsPage enterZIPCode(WebDriver driver,String ZIPCode) {
		BrowserActions.type(driver, inpZIPCode,ZIPCode, "ZIPCode");
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
	public LocationsPage clickBOP0030480823(WebDriver driver)  {
		BrowserActions.click(driver, btnBOP0030480823,"BOP0030480823");
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
	public LocationsPage clickPolicyVersions_19(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyVersions_19,"PolicyVersions_19");
		return this;
	}
	public LocationsPage clickNextBlockedDate(WebDriver driver)  {
		BrowserActions.click(driver, btnNextBlockedDate,"NextBlockedDate");
		return this;
	}
	public LocationsPage clickModifiers_12(WebDriver driver)  {
		BrowserActions.click(driver, btnModifiers_12,"Modifiers_12");
		return this;
	}
	public LocationsPage click90daydiary(WebDriver driver)  {
		BrowserActions.click(driver, btn90daydiary,"90daydiary");
		return this;
	}
	public LocationsPage clickModifiers_16(WebDriver driver)  {
		BrowserActions.click(driver, btnModifiers_16,"Modifiers_16");
		return this;
	}
	public LocationsPage clickQuote(WebDriver driver)  {
		BrowserActions.click(driver, btnQuote,"Quote");
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
	public LocationsPage clickReleaseLock(WebDriver driver)  {
		BrowserActions.click(driver, btnReleaseLock,"ReleaseLock");
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
	public LocationsPage clickAutofillTerritoryCodes(WebDriver driver)  {
		BrowserActions.click(driver, btnAutofillTerritoryCodes,"AutofillTerritoryCodes");
		return this;
	}
	public LocationsPage clickCreateNewProducer(WebDriver driver)  {
		BrowserActions.click(driver, btnCreateNewProducer,"CreateNewProducer");
		return this;
	}
	public LocationsPage enterCounty_6(WebDriver driver,String County_6) {
		BrowserActions.type(driver, inpCounty_6,County_6, "County_6");
		return this;
	}
	public LocationsPage clickForms(WebDriver driver)  {
		BrowserActions.click(driver, btnForms,"Forms");
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
	public LocationsPage clickBlankets(WebDriver driver)  {
		BrowserActions.click(driver, btnBlankets,"Blankets");
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
	public LocationsPage clickNotes(WebDriver driver)  {
		BrowserActions.click(driver, btnNotes,"Notes");
		return this;
	}
	public LocationsPage clickGetInspectionLossControl(WebDriver driver)  {
		BrowserActions.click(driver, btnGetInspectionLossControl,"GetInspectionLossControl");
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
	public LocationsPage clickCreate(WebDriver driver)  {
		BrowserActions.click(driver, btnCreate,"Create");
		return this;
	}
	public LocationsPage enterTaxLocation(WebDriver driver,String TaxLocation) {
		BrowserActions.type(driver, inpTaxLocation,TaxLocation, "TaxLocation");
		return this;
	}
	public LocationsPage clickExposures(WebDriver driver)  {
		BrowserActions.click(driver, btnExposures,"Exposures");
		return this;
	}
	public LocationsPage clickReviewandapprove(WebDriver driver)  {
		BrowserActions.click(driver, btnReviewandapprove,"Reviewandapprove");
		return this;
	}
	public LocationsPage clickAccountsReceivable(WebDriver driver)  {
		BrowserActions.click(driver, btnAccountsReceivable,"AccountsReceivable");
		return this;
	}
	public LocationsPage selectEffectiveDate(WebDriver driver,String EffectiveDate)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpEffectiveDate,EffectiveDate,"EffectiveDate");
		return this;
	}
	public LocationsPage clickCommercialProperty(WebDriver driver)  {
		BrowserActions.click(driver, btnCommercialProperty,"CommercialProperty");
		return this;
	}
	public LocationsPage clickLegalreview(WebDriver driver)  {
		BrowserActions.click(driver, btnLegalreview,"Legalreview");
		return this;
	}
	public LocationsPage clickNewDocument(WebDriver driver)  {
		BrowserActions.click(driver, btnNewDocument,"NewDocument");
		return this;
	}
	public LocationsPage clickPolicynotification(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicynotification,"Policynotification");
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
	public LocationsPage enterCity(WebDriver driver,String City) {
		BrowserActions.type(driver, inpCity,City, "City");
		return this;
	}
	public LocationsPage clickGoto(WebDriver driver)  {
		BrowserActions.click(driver, btnGoto,"Goto");
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
	public LocationsPage clickUnderwriterReview(WebDriver driver)  {
		BrowserActions.click(driver, btnUnderwriterReview,"UnderwriterReview");
		return this;
	}
	public LocationsPage clickMeetwithInsured(WebDriver driver)  {
		BrowserActions.click(driver, btnMeetwithInsured,"MeetwithInsured");
		return this;
	}
	public LocationsPage click30daydiary(WebDriver driver)  {
		BrowserActions.click(driver, btn30daydiary,"30daydiary");
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
	public LocationsPage clickSearch(WebDriver driver)  {
		BrowserActions.click(driver, btnSearch,"Search");
		return this;
	}
	public LocationsPage clickSigns(WebDriver driver)  {
		BrowserActions.click(driver, btnSigns,"Signs");
		return this;
	}
	public LocationsPage clickNewNote(WebDriver driver)  {
		BrowserActions.click(driver, btnNewNote,"NewNote");
		return this;
	}
	public LocationsPage clickSidebySideQuoting(WebDriver driver)  {
		BrowserActions.click(driver, btnSidebySideQuoting,"SidebySideQuoting");
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
	public LocationsPage clickInlandMarine(WebDriver driver)  {
		BrowserActions.click(driver, btnInlandMarine,"InlandMarine");
		return this;
	}
	public LocationsPage clickCollectCreditCard(WebDriver driver)  {
		BrowserActions.click(driver, btnCollectCreditCard,"CollectCreditCard");
		return this;
	}
	public LocationsPage selectPhoneRegionCode(WebDriver driver,String PhoneRegionCode)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPhoneRegionCode,PhoneRegionCode,"PhoneRegionCode");
		return this;
	}
	public LocationsPage clickGeneralLiability(WebDriver driver)  {
		BrowserActions.click(driver, btnGeneralLiability,"GeneralLiability");
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
	public LocationsPage enterLocationName_2(WebDriver driver,String LocationName_2) {
		BrowserActions.type(driver, inpLocationName_2,LocationName_2, "LocationName_2");
		return this;
	}
	public LocationsPage clickPolicyReview(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyReview,"PolicyReview");
		return this;
	}
	public LocationsPage clickDiagnosticData(WebDriver driver)  {
		BrowserActions.click(driver, btnDiagnosticData,"DiagnosticData");
		return this;
	}
	public LocationsPage clickOOSEPeriodSelector(WebDriver driver)  {
		BrowserActions.click(driver, btnOOSEPeriodSelector,"OOSEPeriodSelector");
		return this;
	}
	public LocationsPage clickSearch_11(WebDriver driver)  {
		BrowserActions.click(driver, btnSearch_11,"Search_11");
		return this;
	}
	public LocationsPage enterPhone(WebDriver driver,String Phone) {
		BrowserActions.type(driver, inpPhone,Phone, "Phone");
		return this;
	}
	public LocationsPage clickLineReview_15(WebDriver driver)  {
		BrowserActions.click(driver, btnLineReview_15,"LineReview_15");
		return this;
	}
	public LocationsPage clickManuallyrateandquotepolicy(WebDriver driver)  {
		BrowserActions.click(driver, btnManuallyrateandquotepolicy,"Manuallyrateandquotepolicy");
		return this;
	}
	public LocationsPage clickLineReview_13(WebDriver driver)  {
		BrowserActions.click(driver, btnLineReview_13,"LineReview_13");
		return this;
	}
	public LocationsPage clickHistory(WebDriver driver)  {
		BrowserActions.click(driver, btnHistory,"History");
		return this;
	}
	public LocationsPage clickReminder(WebDriver driver)  {
		BrowserActions.click(driver, btnReminder,"Reminder");
		return this;
	}
	public LocationsPage clickCoveragePartSelection(WebDriver driver)  {
		BrowserActions.click(driver, btnCoveragePartSelection,"CoveragePartSelection");
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
	public LocationsPage clickViewCurrentLocation(WebDriver driver)  {
		BrowserActions.click(driver, btnViewCurrentLocation,"ViewCurrentLocation");
		return this;
	}
	public LocationsPage clickVersions(WebDriver driver)  {
		BrowserActions.click(driver, btnVersions,"Versions");
		return this;
	}
	public LocationsPage clickSearch_9(WebDriver driver)  {
		BrowserActions.click(driver, btnSearch_9,"Search_9");
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
	public LocationsPage clickRemove(WebDriver driver)  {
		BrowserActions.click(driver, btnRemove,"Remove");
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
	public LocationsPage enterLocationCode_1(WebDriver driver,String LocationCode_1) {
		BrowserActions.type(driver, inpLocationCode_1,LocationCode_1, "LocationCode_1");
		return this;
	}
	public LocationsPage clickCopyData(WebDriver driver)  {
		BrowserActions.click(driver, btnCopyData,"CopyData");
		return this;
	}
	public LocationsPage clickSG00304808234562925823(WebDriver driver)  {
		BrowserActions.click(driver, btnSG00304808234562925823,"SG00304808234562925823");
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
	public LocationsPage clickClose(WebDriver driver)  {
		BrowserActions.click(driver, btnClose,"Close");
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
	public LocationsPage clickReview60dayUWPeriod(WebDriver driver)  {
		BrowserActions.click(driver, btnReview60dayUWPeriod,"Review60dayUWPeriod");
		return this;
	}
	public LocationsPage clickEditPolicyTransaction(WebDriver driver)  {
		BrowserActions.click(driver, btnEditPolicyTransaction,"EditPolicyTransaction");
		return this;
	}
	public LocationsPage clickContractorsEquipment(WebDriver driver)  {
		BrowserActions.click(driver, btnContractorsEquipment,"ContractorsEquipment");
		return this;
	}
	public LocationsPage clickQuote_18(WebDriver driver)  {
		BrowserActions.click(driver, btnQuote_18,"Quote_18");
		return this;
	}
	public LocationsPage clickQuote_17(WebDriver driver)  {
		BrowserActions.click(driver, btnQuote_17,"Quote_17");
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
	public LocationsPage clickCloseOptions(WebDriver driver)  {
		BrowserActions.click(driver, btnCloseOptions,"CloseOptions");
		return this;
	}
	public LocationsPage clickPolicyContract(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyContract,"PolicyContract");
		return this;
	}
	public LocationsPage enterPhone_8(WebDriver driver,String Phone_8) {
		BrowserActions.type(driver, inpPhone_8,Phone_8, "Phone_8");
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
	public LocationsPage clickRequest(WebDriver driver)  {
		BrowserActions.click(driver, btnRequest,"Request");
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
	public LocationsPage clickLineReview(WebDriver driver)  {
		BrowserActions.click(driver, btnLineReview,"LineReview");
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
	public LocationsPage clickNonSpecificLocation(WebDriver driver)  {
		BrowserActions.click(driver, rdbNonSpecificLocation,"NonSpecificLocation");
		return this;
	}
	public LocationsPage enterTerritoryCode(WebDriver driver,String TerritoryCode) {
		BrowserActions.type(driver, inpTerritoryCode,TerritoryCode, "TerritoryCode");
		return this;
	}
	public LocationsPage clickAddress(WebDriver driver)  {
		BrowserActions.click(driver, lnkAddress, "Address link");
		return this;
	}


	public class LocationInformationPage extends LoadableComponent<LocationInformationPage> {

		WebDriver driver;
		private boolean isPageLoaded;
		public ElementLayer elementLayer;
		String elementObject;
		HashMap<String, String> getPageObjects;
		public List<Object> pageFactoryKey = new ArrayList<Object>();
		public List<String> pageFactoryValue = new ArrayList<String>();

		//TopNavBar object
		//public TopNavBar topnavbar;
		@IFindBy(how = How.CSS, using = "#CPLocationPopup-RiskAssessmentPanelSet-LocationSpotlightDV-LastRiskAssessmentIsStaleIcon", AI = false)
		private WebElement btnLastRiskAssessmentIsStaleIcon;

		@IFindBy(how = How.CSS, using = "#CPLocationPopup-RiskAssessmentPanelSet-LocationSpotlightDV-LastRiskAssessmentEvaluation", AI = false)
		private WebElement btnLastRiskAssessmentEvaluation;

		@IFindBy(how = How.CSS, using = "#CPLocationPopup-LocationDetailDV-LocationDetailInputSet-TargetedAddressInputSet-globalAddressContainer-GlobalAddressInputSet-PostalCode-AutoFillIcon", AI = false)
		private WebElement btnAutoFillIcon_1;

		@IFindBy(how = How.CSS, using = "input[name='CPLocationPopup-LocationDetailDV-LocationDetailInputSet-TargetedAddressInputSet-globalAddressContainer-GlobalAddressInputSet-County']", AI = false)
		private WebElement inpCounty;

		@IFindBy(how = How.CSS, using = "input[name='CPLocationPopup-LocationDetailDV-LocationDetailInputSet-LocationCode']", AI = false)
		private WebElement inpLocationCode;

		@IFindBy(how = How.CSS, using = "input[name='CPLocationPopup-RiskAssessmentPanelSet-LocationSpotlightDV-Latitude']", AI = false)
		private WebElement inpLatitude;

		@IFindBy(how = How.CSS, using = "select[name='CPLocationPopup-LocationDetailDV-LocationDetailInputSet-UnsyncedAddressInputSet-UnsyncedCountry']", AI = false)
		private WebElement drpCountry_4;

		@IFindBy(how = How.CSS, using = "input[name='CPLocationPopup-LocationDetailDV-LocationDetailInputSet-UnsyncedAddressInputSet-unsyncedAddressString']", AI = false)
		private WebElement inpAddress_2;

		@IFindBy(how = How.CSS, using = "input[name='CPLocationPopup-LocationDetailDV-LocationDetailInputSet-Phone-GlobalPhoneInputSet-Extension']", AI = false)
		private WebElement inpPhoneExtension;

		@IFindBy(how = How.CSS, using = "#CPLocationPopup-RiskAssessmentPanelSet-RiskAssessmentDetailsPanelSet-RiskAssessmentDetail_DV-showHideRiskAssessmentDetailsButton", AI = false)
		private WebElement btnShow;

		@IFindBy(how = How.CSS, using = "input[name='CPLocationPopup-LocationDetailDV-LocationDetailInputSet-TargetedAddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine3']", AI = false)
		private WebElement inpAddress3;

		@IFindBy(how = How.CSS, using = "input[name$='AddressLine1']", AI = false)
		private WebElement inpAddress1;

		@IFindBy(how = How.CSS, using = "input[name='CPLocationPopup-LocationDetailDV-LocationDetailInputSet-TargetedAddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine2']", AI = false)
		private WebElement inpAddress2;

		@IFindBy(how = How.CSS, using = "input[name='CPLocationPopup-LocationDetailDV-LocationDetailInputSet-TargetedAddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressSummary']", AI = false)
		private WebElement inpAddress;

		@IFindBy(how = How.CSS, using = "input[name$='PostalCode']", AI = false)
		private WebElement inpZIPCode;

		@IFindBy(how = How.CSS, using = "#CPLocationPopup-RiskAssessmentPanelSet-LocationSpotlightDV-EvaluationDateSpacer", AI = false)
		private WebElement btnEvaluationDateSpacer;

		@IFindBy(how = How.CSS, using = "#CPLocationPopup-LocationDetailDV-LocationDetailInputSet-TargetedAddressInputSet-globalAddressContainer-GlobalAddressInputSet-City-AutoFillIcon", AI = false)
		private WebElement btnAutoFillIcon;

		@IFindBy(how = How.CSS, using = "select[name='CPLocationPopup-PreferredCoverageCurrencySelectorRef-PreferredCoverageCurrencyPanelSet-PreferredCoverageCurrencySelectorDropDown']", AI = false)
		private WebElement drpCoveragesin;

		@IFindBy(how = How.CSS, using = "select[name='CPLocationPopup-LocationDetailDV-LocationDetailInputSet-TargetedAddressInputSet-globalAddressContainer-GlobalAddressInputSet-Country']", AI = false)
		private WebElement drpCountry;

		@IFindBy(how = How.CSS, using = "select[name$='State']", AI = false)
		private WebElement drpState;

		@IFindBy(how = How.CSS, using = "input[name='CPLocationPopup-LocationDetailDV-LocationDetailInputSet-UnsyncedAddressInputSet-UnsyncedCounty']", AI = false)
		private WebElement inpCounty_3;

		@IFindBy(how = How.CSS, using = "div[id$='AutofillLink']", AI = false)
		private WebElement btnAutofillTerritoryCodes;

		@IFindBy(how = How.CSS, using = "input[name='CPLocationPopup-LocationDetailDV-LocationDetailInputSet-LocationName']", AI = false)
		private WebElement inpLocationName;

		@IFindBy(how = How.CSS, using = "input[name='CPLocationPopup-LocationDetailDV-LocationDetailInputSet-TaxLocation']", AI = false)
		private WebElement inpTaxLocation;

		@IFindBy(how = How.CSS, using = "select[name='CPLocationPopup-LocationDetailDV-FireProtectionClass']", AI = false)
		private WebElement drpFireProtection;

		@IFindBy(how = How.CSS, using = "input[name$='City']", AI = false)
		private WebElement inpCity;

		@IFindBy(how = How.CSS, using = "input[name='CPLocationPopup-RiskAssessmentPanelSet-LocationSpotlightDV-SpotlightFloodRisk']", AI = false)
		private WebElement inpFloodRisk;

		@IFindBy(how = How.CSS, using = "#CPLocationPopup-RiskAssessmentPanelSet-LocationSpotlightDV-ViewInSpotlightLink", AI = false)
		private WebElement btnEvaluateinSpotlight;

		@IFindBy(how = How.CSS, using = "div[id$='Update']", AI = false)
		private WebElement btnOK;

		@IFindBy(how = How.CSS, using = "#CPLocationPopup-LocationDetailDV-LocationDetailInputSet-TaxLocation-SelectTaxLocation", AI = false)
		private WebElement btnSearch;

		@IFindBy(how = How.CSS, using = "#CPLocationPopup-LocationDetailDV-RefreshThumbnailMapLink", AI = false)
		private WebElement btnUpdateMap;

		@IFindBy(how = How.CSS, using = "input[name='CPLocationPopup-RiskAssessmentPanelSet-LocationSpotlightDV-SpotlightFloodScore']", AI = false)
		private WebElement inpDistancetoFloodZone;

		@IFindBy(how = How.CSS, using = "select[name='CPLocationPopup-LocationDetailDV-LocationDetailInputSet-Phone-GlobalPhoneInputSet-CountryCode']", AI = false)
		private WebElement drpPhoneRegionCode;

		@IFindBy(how = How.CSS, using = "input[name='CPLocationPopup-LocationDetailDV-LocationDetailInputSet-Phone-GlobalPhoneInputSet-NationalSubscriberNumber']", AI = false)
		private WebElement inpPhone;

		@IFindBy(how = How.CSS, using = "#CPLocationPopup-__crumb__", AI = false)
		private WebElement btnReturntoBuildingsandLocations;

		@IFindBy(how = How.CSS, using = "#CPLocationPopup-ttlBar", AI = false)
		private WebElement lblTtlBar;

		@IFindBy(how = How.CSS, using = "#CPLocationPopup-Edit>div[role='button']", AI = false)
		private WebElement btnEdit;

		@IFindBy(how = How.CSS, using = "#CPLocationPopup-AccountLocationUpToDateDV-SynchronizedLink", AI = false)
		private WebElement btnViewCurrentLocation;

		@IFindBy(how = How.CSS, using = "#CPLocationPopup-LocationDetailDV-LocationDetailInputSet-TerritoryCodeInputSet-0-TerritoryCode-SelectTerritoryCode", AI = false)
		private WebElement btnSearch_6;

		@IFindBy(how = How.CSS, using = "#CPLocationPopup-LocationDetailDV-PrincipleOps textarea", AI = false)
		private WebElement inpPrincipalOperationsOccupancy;

		@IFindBy(how = How.CSS, using = "input[name='CPLocationPopup-RiskAssessmentPanelSet-LocationSpotlightDV-Longitude']", AI = false)
		private WebElement inpLongitude;

		@IFindBy(how = How.CSS, using = "input[name='CPLocationPopup-RiskAssessmentPanelSet-AcceptRejectCheckbox']", AI = false)
		private WebElement chkSpotlightreturnednewdata;

		@IFindBy(how = How.CSS, using = "#CPLocationPopup-Cancel>div[role='button']", AI = false)
		private WebElement btnCancel;

		@IFindBy(how = How.CSS, using = "input[name='CPLocationPopup-PreferredCoverageCurrencySelectorRef-PreferredCoverageCurrencyPanelSet-CoverageCurrencyDisplay']", AI = false)
		private WebElement inpCoveragesin;

		@IFindBy(how = How.CSS, using = "input[name='CPLocationPopup-LocationDetailDV-LocationDetailInputSet-Phone-GlobalPhoneInputSet-PhoneDisplay']", AI = false)
		private WebElement inpPhone_5;

		@IFindBy(how = How.CSS, using = "input[name='CPLocationPopup-LocationDetailDV-LocationDetailInputSet-NonSpecificLocation']", AI = false)
		private WebElement rdbNonSpecificLocation;

		@IFindBy(how = How.CSS, using = "input[name='CPLocationPopup-LocationDetailDV-LocationDetailInputSet-TerritoryCodeInputSet-0-TerritoryCode']", AI = false)
		private WebElement inpTerritoryCode;

		public LocationInformationPage(){
		}

		public LocationInformationPage(WebDriver driver){
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
			}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, inpTerritoryCode))) {
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
			BrowserActions.selectDropDownByVisibleText(driver, drpState,State,"State");
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
			BrowserActions.type(driver, inpCity,City, "City");
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
	}

}