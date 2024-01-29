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
import com.aspire.guidewire.utils.WaitUtils;

import ASPIREAI.customfactories.AjaxElementLocatorFactory;
import ASPIREAI.customfactories.IFindBy;
import ASPIREAI.customfactories.PageFactory;

public class DwellingPage extends LoadableComponent<DwellingPage> {

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

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPDwellingScreen-HOPDwellingPanelSet-HOPDwellingCV-HOPDwellingDetailsDV-HOPDwellingInputSet-Location-AddExistingLocations>div[role='menuitem']", AI = false)
	public WebElement btnExistingLocation;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPDwellingScreen-HOPDwellingPanelSet-HOPDwellingCV-HOPDwellingDetailsDV-HOPSwimmingPoolInputSet-SwimmingPool']", AI = false)
	public WebElement chkIsthereaswimmingpool;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-9-item>div[role='menuitem']", AI = false)
	public WebElement btnGetRiskInformationProducer;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_CopySubmission>div[role='menuitem']", AI = false)
	public WebElement btnCopySubmission;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-4-item>div[role='menuitem']", AI = false)
	public WebElement btnGeneralreminderdiary;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPDwellingScreen-HOPDwellingPanelSet-HOPDwellingCV-HOPDwellingAdditionalInterestDetailsDV-AdditionalInterestLV_tb-AddContactsButton-AddFromSearch>div[role='button']", AI = false)
	public WebElement btnFromAddressBook;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-8-item>div[role='menuitem']", AI = false)
	public WebElement btnGetReinsuranceQuote;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-13-item>div[role='menuitem']", AI = false)
	public WebElement btnReview45dayUWPeriod;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPDwellingScreen-HOPDwellingPanelSet-HOPDwellingCV-HOPDwellingDetailsDV-HOPDwellingProtectionInputSet-AutoFillProtClass>div[role='button']", AI = false)
	public WebElement btnAutoFillProtClass;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPDwellingScreen-HOPDwellingPanelSet-HOPDwellingCV-HOPDwellingDetailsDV-HOPSwimmingPoolInputSet-Slide']", AI = false)
	public WebElement rdbSlide;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-1-item>div[role='menuitem']", AI = false)
	public WebElement btnGetAuditInternalPersonnel;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPDwellingScreen-JobWizardToolbarButtonSet-BindOptions-BindOnly>div[role='menuitem']", AI = false)
	public WebElement btnBindOnly;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPDwellingScreen-HOPDwellingPanelSet-HOPDwellingCV-HOPDwellingDetailsDV-HOPDwellingInputSet-Location-EditDwellingLocation>div[role='menuitem']", AI = false)
	public WebElement btnEditLocation;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-14-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnBOP0011059781;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPDwellingScreen-HOPDwellingPanelSet-HOPDwellingCV-HOPDwellingDetailsDV-HOPSwimmingPoolInputSet-DivingBoard']", AI = false)
	public WebElement rdbDivingBoard;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-0-NewActivityMenuItemSet_Category>div[role='menuitem']", AI = false)
	public WebElement btnInterview;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-MultiQuoteAcceleratedMenuActions-PolicyPeriodSelector-PolicyPeriodSelector_Arg']", AI = false)
	public WebElement drpPolicyPeriodSelector_Arg;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-PolicyVersions>div[role='menuitem']", AI = false)
	public WebElement btnPolicyVersions_9;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-6-item>div[role='menuitem']", AI = false)
	public WebElement btnPerformanceReview;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-DiagWorksheetItem-ShowDiagWorksheet>div[role='menuitem']", AI = false)
	public WebElement btnShowPartialWorksheet;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPDwellingScreen-HOPDwellingPanelSet-HOPDwellingCV-HOPDwellingDetailsDV-HOPSwimmingPoolInputSet-AdditionalInformation']", AI = false)
	public WebElement inpAdditionalInformation;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-1-item>div[role='menuitem']", AI = false)
	public WebElement btn60daydiary;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPDwellingScreen-JobWizardToolbarButtonSet-Versions-NewVersion>div[role='menuitem']", AI = false)
	public WebElement btnStartMultiVersion;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Prev>div[role='button']", AI = false)
	public WebElement btnBack;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-15-item>div[role='menuitem']", AI = false)
	public WebElement btnReviewProducer;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-9-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0127642470;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-HOPCoverages>div[role='menuitem']", AI = false)
	public WebElement btnCoverages;

	@IFindBy(how = How.CSS, using = "div[id$='Next']", AI = false)
	public WebElement btnNext;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPDwellingScreen-HOPDwellingPanelSet-HOPDwellingCV-HOPDwellingAdditionalInterestDetailsDV-AdditionalInterestLV_tb-AddContactsButton-AddOtherContact-0-acctContact>div[role='button']", AI = false)
	public WebElement btnRahulBijoy;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPDwellingScreen-HOPDwellingPanelSet-HOPDwellingCV-HOPDwellingDetailsDV-HOPDwellingProtectionInputSet-FireAlarm']", AI = false)
	public WebElement drpFireAlarm;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-19-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnCA0085070507;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-16-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnBOP0042998142;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-10-item>div[role='menuitem']", AI = false)
	public WebElement btnQuoteRequired;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPDwellingScreen-HOPDwellingPanelSet-HOPDwellingCV-AdditionalInterestCardTab", AI = false)
	public WebElement btnAdditionalInterestCardTab;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-8-item>div[role='menuitem']", AI = false)
	public WebElement btnPolicyReviewMidterm;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPDwellingScreen-HOPDwellingPanelSet-HOPDwellingCV-HOPDwellingAdditionalInterestDetailsDV-AdditionalInterestLV_tb-Remove>div[role='button']", AI = false)
	public WebElement btnRemove_4;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPDwellingScreen-HOPDwellingPanelSet-HOPDwellingCV-AdditionalInsuredsDV-AdditionalInsuredLV_tb-Remove>div[role='button']", AI = false)
	public WebElement btnRemove_6;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPDwellingScreen-HOPDwellingPanelSet-HOPDwellingCV-HOPDwellingDetailsDV-HOPDwellingProtectionInputSet-DoorsHaveDeadbolts']", AI = false)
	public WebElement rdbAllDoorsHaveDeadbolts;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPDwellingScreen-HOPDwellingPanelSet-HOPDwellingCV-HOPDwellingDetailsDV-HOPSwimmingPoolInputSet-Type']", AI = false)
	public WebElement drpType;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPDwellingScreen-JobWizardToolbarButtonSet-Versions-ViewSideBySide>div[role='menuitem']", AI = false)
	public WebElement btnViewSideBySideVersions;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPDwellingScreen-HOPDwellingPanelSet-HOPDwellingCV-HOPDwellingAdditionalInterestDetailsDV-AdditionalInterestLV_tb-AddContactsButton-1-ContactType>div[role='button']", AI = false)
	public WebElement btnNewPerson;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPDwellingScreen-JobWizardToolbarButtonSet-Draft>div[role='button']", AI = false)
	public WebElement btnSaveDraft;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPDwellingScreen-HOPDwellingPanelSet-HOPDwellingCV-HOPDwellingDetailsDV-HOPDwellingAnimalsInputSet-Remove>div[role='button']", AI = false)
	public WebElement btnRemove_2;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-3-item>div[role='menuitem']", AI = false)
	public WebElement btnGetBureauData;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Reinsurance>div[role='menuitem']", AI = false)
	public WebElement btnReinsurance;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPDwellingScreen-HOPDwellingPanelSet-HOPDwellingCV-HOPDwellingDetailsDV-HOPDwellingProtectionInputSet-SprinklerSystemType']", AI = false)
	public WebElement drpSprinklerSystem;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-BillingInfo>div[role='menuitem']", AI = false)
	public WebElement btnPayment;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-15-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnBOP0085427452;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Change-WizardMenuActions_ChangeEffDate>div[role='menuitem']", AI = false)
	public WebElement btnEffectiveDate;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPDwellingScreen-QuoteRequestedAlert .gw-AlertBar--label", AI = false)
	public WebElement lblQuoteRequestedAlert;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPDwellingScreen-HOPDwellingPanelSet-HOPDwellingCV-HOPDwellingDetailsDV-HOPDwellingInputSet-Location-NewDwellingLocation>div[role='menuitem']", AI = false)
	public WebElement btnNewLocation;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPDwellingScreen-HOPDwellingPanelSet-HOPDwellingCV-HOPDwellingDetailsDV-HOPDwellingProtectionInputSet-SmokeAlarms']", AI = false)
	public WebElement drpSmokeAlarms;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPDwellingScreen-HOPDwellingPanelSet-HOPDwellingCV-HOPDwellingDetailsDV-HOPDwellingInputSet-ReplacementCost']", AI = false)
	public WebElement inpEstimatedReplacementCost;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPDwellingScreen-HOPDwellingPanelSet-HOPDwellingCV-HOPDwellingDetailsDV-HOPDwellingProtectionInputSet-DistanceToFireHydrant']", AI = false)
	public WebElement inpDistancetoFireHydrantft;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewDocument-NewJobDocumentMenuItemSet-PolicyPeriodNewDocumentMenuItemSet_Template>div[role='menuitem']", AI = false)
	public WebElement btnCreatefromatemplate;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPDwellingScreen-HOPDwellingPanelSet-HOPDwellingCV-HOPDwellingDetailsDV-HOPDwellingInputSet-LocationType']", AI = false)
	public WebElement drpLocationType;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPDwellingScreen-HOPDwellingPanelSet-HOPDwellingCV-HOPDwellingDetailsDV-HOPDwellingInputSet-NumberOfInsuredUnits']", AI = false)
	public WebElement inpNumberofInsuredUnits;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPDwellingScreen-JobWizardToolbarButtonSet-Versions-SideBySide>div[role='menuitem']", AI = false)
	public WebElement btnStartSidebySide;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPDwellingScreen-HOPDwellingPanelSet-HOPDwellingCV-HOPDwellingDetailsDV-HOPDwellingInputSet-Location']", AI = false)
	public WebElement drpLocation;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPDwellingScreen-HOPDwellingPanelSet-HOPDwellingCV-HOPDwellingDetailsDV-HOPDwellingOccupancyInputSet-DwellingOccupancyType']", AI = false)
	public WebElement drpOccupancy;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Archiving>div[role='menuitem']", AI = false)
	public WebElement btnArchiving;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPDwellingScreen-HOPDwellingPanelSet-HOPDwellingCV-HOPDwellingDetailsDV-HOPDwellingInputSet-Location-LocationMenuIcon>div[role='button']", AI = false)
	public WebElement btnLocationMenuIcon;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-12-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0247907153;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPDwellingScreen-JobWizardToolbarButtonSet-CloseOptions-NotTakenJob>div[role='menuitem']", AI = false)
	public WebElement btnNotTaken;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Documents>div[role='menuitem']", AI = false)
	public WebElement btnDocuments;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPDwellingScreen-OOSEPanelSet-NextSliceLink", AI = false)
	public WebElement btnNextBlockedDate;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPDwellingScreen-HOPDwellingPanelSet-HOPDwellingCV-HOPDwellingDetailsDV-HOPDwellingOccupancyInputSet-DwellingUsageType']", AI = false)
	public WebElement drpUsage;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPDwellingScreen-HOPDwellingPanelSet-HOPDwellingCV-HOPDwellingDetailsDV-HOPSwimmingPoolInputSet-ApprovedFence']", AI = false)
	public WebElement rdbApprovedFence;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-HOPDwelling>div[role='menuitem']", AI = false)
	public WebElement btnDwelling;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-JobGroupItem>div[role='menuitem']", AI = false)
	public WebElement btnSG00031824754074602384;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-2-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0127025333;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-2-item>div[role='menuitem']", AI = false)
	public WebElement btn90daydiary;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPDwellingScreen-HOPDwellingPanelSet-HOPDwellingCV-HOPDwellingDetailsDV-HOPDwellingProtectionInputSet-VisibleToNeighbors']", AI = false)
	public WebElement rdbResidenceVisibletoNeighbors;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-RiskEvaluation>div[role='menuitem']", AI = false)
	public WebElement btnRiskAnalysis_10;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPDwellingScreen-HOPDwellingPanelSet-HOPDwellingCV-HOPDwellingDetailsDV-HOPDwellingOccupancyInputSet-NumberOfRoomers']", AI = false)
	public WebElement inpNumberofRoomersBoarders;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPDwellingScreen-HOPDwellingPanelSet-HOPDwellingCV-HOPDwellingAdditionalInterestDetailsDV-AdditionalInterestLV_tb-AddContactsButton-AddOtherContact>div[role='button']", AI = false)
	public WebElement btnOtherContacts;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPDwellingScreen-JobWizardToolbarButtonSet-QuoteTypeToolbarButtonSet-Quote>div[role='button']", AI = false)
	public WebElement btnQuote;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPDwellingScreen-JobWizardToolbarButtonSet-BindOptions>div[role='button']", AI = false)
	public WebElement btnBindOptions;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPDwellingScreen-JobWizardToolbarButtonSet-Unlock>div[role='button']", AI = false)
	public WebElement btnReleaseLock;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Archiving-WizardMenuActions_SuspendResumeArchiving>div[role='menuitem']", AI = false)
	public WebElement btnEnableDisable;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPDwellingScreen-JobWizardToolbarButtonSet-BindOptions-BindAndIssue>div[role='menuitem']", AI = false)
	public WebElement btnIssuePolicy;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPDwellingScreen-HOPDwellingPanelSet-HOPDwellingCV-HOPDwellingDetailsDV-HOPDwellingInputSet-TerritoryCodeInputSet-AutofillLink", AI = false)
	public WebElement btnAutofillTerritoryCodes;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-0-item>div[role='menuitem']", AI = false)
	public WebElement btnCreateNewProducer;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPDwellingScreen-HOPDwellingPanelSet-HOPDwellingCV-HOPDwellingDetailsDV-HOPDwellingHazardsInputSet-Add>div[role='button']", AI = false)
	public WebElement btnAdd;

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

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPDwellingScreen-HOPDwellingPanelSet-HOPDwellingCV-HOPDwellingDetailsDV-HOPDwellingInputSet-NumberOfUnitsBetweenFirewall']", AI = false)
	public WebElement inpNumberofUnitsBetweenFirewall;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Notes>div[role='menuitem']", AI = false)
	public WebElement btnNotes;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-5-item>div[role='menuitem']", AI = false)
	public WebElement btnGetInspectionLossControl;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-ViewMultiLineQuote>div[role='menuitem']", AI = false)
	public WebElement btnQuote_8;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Participants>div[role='menuitem']", AI = false)
	public WebElement btnParticipants;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create>div[role='menuitem']", AI = false)
	public WebElement btnCreate;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-ViewQuote>div[role='menuitem']", AI = false)
	public WebElement btnQuote_7;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-4-NewActivityMenuItemSet_Category-0-item>div[role='menuitem']", AI = false)
	public WebElement btnReviewandapprove;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPDwellingScreen-OOSEPanelSet-OOSEPeriodSelector-OOSEPeriodSelector_Arg']", AI = false)
	public WebElement drpEffectiveDate;

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

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPDwellingScreen-HOPDwellingPanelSet-HOPDwellingCV-HOPDwellingDetailsDV-HOPDwellingInputSet-TerritoryCodeInputSet-0-TerritoryCode-SelectTerritoryCode", AI = false)
	public WebElement btnSearch;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-0-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnHOP0011359660;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewNote>div[role='menuitem']", AI = false)
	public WebElement btnNewNote;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-SideBySide>div[role='menuitem']", AI = false)
	public WebElement btnSidebySideQuoting;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-RiskAnalysis>div[role='menuitem']", AI = false)
	public WebElement btnRiskAnalysis;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-4-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0108046463;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-0-NewActivityMenuItemSet_Category-1-item>div[role='menuitem']", AI = false)
	public WebElement btnMeetwithProducerAgency;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-1-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0128045417;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-13-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0126226969;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-CollectCreditCard>div[role='menuitem']", AI = false)
	public WebElement btnCollectCreditCard;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-7-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnCA0005618226;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPDwellingScreen-HOPDwellingPanelSet-HOPDwellingCV-DetailCardTab", AI = false)
	public WebElement btnDetails;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-11-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnCA0085131592;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-11-item>div[role='menuitem']", AI = false)
	public WebElement btnRatiooutofrange;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPDwellingScreen-JobWizardToolbarButtonSet-ConvertToFullApp>div[role='button']", AI = false)
	public WebElement btnFullApp;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-PolicyReview>div[role='menuitem']", AI = false)
	public WebElement btnPolicyReview;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-DiagWorksheetItem>div[role='menuitem']", AI = false)
	public WebElement btnDiagnosticData;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPDwellingScreen-OOSEPanelSet-OOSEPeriodSelector", AI = false)
	public WebElement btnOOSEPeriodSelector;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-11-item>div[role='menuitem']", AI = false)
	public WebElement btnManuallyrateandquotepolicy;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-History>div[role='menuitem']", AI = false)
	public WebElement btnHistory;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-17-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnBOP0042873185;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category>div[role='menuitem']", AI = false)
	public WebElement btnReminder;

	@IFindBy(how = How.CSS, using = "div[id='gw-center-title-toolbar']>div[id$='DwellingScreen-ttlBar']", AI = false)
	public WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-10-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnBOP0052212503;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Change>div[role='menuitem']", AI = false)
	public WebElement btnEdit;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-5-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0127285387;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPDwellingScreen-JobWizardToolbarButtonSet-CloseOptions-WithdrawJob>div[role='menuitem']", AI = false)
	public WebElement btnWithdrawTransaction;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-3-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnBOP0015824087;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-PolicyInfo>div[role='menuitem']", AI = false)
	public WebElement btnPolicyInfo;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-HOPDwellingConstruction>div[role='menuitem']", AI = false)
	public WebElement btnDwellingConstruction;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-18-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnCA0084956520;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-20-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnBOP0016789240;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPDwellingScreen-JobWizardToolbarButtonSet-Versions>div[role='button']", AI = false)
	public WebElement btnVersions;

	@IFindBy(how = How.CSS, using = "select[name$='HOPDwellingProtectionInputSet-ProtectionClass']", AI = false)
	public WebElement drpFireProtectionClass;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-Modifiers>div[role='menuitem']", AI = false)
	public WebElement btnModifiers;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_ToAccountFile>div[role='menuitem']", AI = false)
	public WebElement btnAccountFile;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPDwellingScreen-HOPDwellingPanelSet-HOPDwellingCV-HOPDwellingDetailsDV-HOPDwellingProtectionInputSet-NumberOfFireExtinguishers']", AI = false)
	public WebElement inpNumberofFireExtinguishers;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPDwellingScreen-HOPDwellingPanelSet-HOPDwellingCV-HOPDwellingDetailsDV-HOPDwellingHazardsInputSet-Remove>div[role='button']", AI = false)
	public WebElement btnRemove;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-1-NewActivityMenuItemSet_Category-0-item>div[role='menuitem']", AI = false)
	public WebElement btnReviewnewmail;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup>div[role='menuitem']", AI = false)
	public WebElement btnGroup;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-3-item>div[role='menuitem']", AI = false)
	public WebElement btnCancelasplitpolicy;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPDwellingScreen-HOPDwellingPanelSet-HOPDwellingCV-HOPDwellingDetailsDV-HOPDwellingProtectionInputSet-BurglarAlarmType']", AI = false)
	public WebElement drpBurglarAlarm;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-2-item>div[role='menuitem']", AI = false)
	public WebElement btnGetAuditOutsideService;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Change-WizardMenuActions_CopyPolicyData>div[role='menuitem']", AI = false)
	public WebElement btnCopyData;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-5-item>div[role='menuitem']", AI = false)
	public WebElement btnNewAuditAssignment;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-16-item>div[role='menuitem']", AI = false)
	public WebElement btnRewritetoNewAccount;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPDwellingScreen-HOPDwellingPanelSet-HOPDwellingCV-HOPDwellingAdditionalInterestDetailsDV-AdditionalInterestLV_tb-AddContactsButton-0-ContactType>div[role='button']", AI = false)
	public WebElement btnNewCompany;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPDwellingScreen-QuoteRequestedAlert-CloseBtn", AI = false)
	public WebElement btnClose;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-12-item>div[role='menuitem']", AI = false)
	public WebElement btnReview30dayUWPeriod;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPDwellingScreen-HOPDwellingPanelSet-HOPDwellingCV-HOPDwellingDetailsDV-HOPDwellingProtectionInputSet-DistanceToFireStation']", AI = false)
	public WebElement inpDistancetoFireStationmi;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-ManageBranches>div[role='menuitem']", AI = false)
	public WebElement btnPolicyVersions;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-14-item>div[role='menuitem']", AI = false)
	public WebElement btnReview60dayUWPeriod;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPDwellingScreen-HOPDwellingPanelSet-HOPDwellingCV-AdditionalInsuredsDV-AdditionalInsuredLV_tb-AddContactsButton>div[role='button']", AI = false)
	public WebElement btnAdd_5;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-6-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0108221556;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPDwellingScreen-JobWizardToolbarButtonSet-EditPolicy>div[role='button']", AI = false)
	public WebElement btnEditPolicyTransaction;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPDwellingScreen-HOPDwellingPanelSet-HOPDwellingCV-HOPDwellingAdditionalInterestDetailsDV-AdditionalInterestLV_tb-AddContactsButton>div[role='button']", AI = false)
	public WebElement btnAdd_3;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPDwellingScreen-HOPDwellingPanelSet-HOPDwellingCV-HOPDwellingDetailsDV-HOPDwellingAnimalsInputSet-Add>div[role='button']", AI = false)
	public WebElement btnAdd_1;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity>div[role='menuitem']", AI = false)
	public WebElement btnNewActivity;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-8-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0108520862;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPDwellingScreen-HOPDwellingPanelSet-HOPDwellingCV-HOPDwellingDetailsDV-HOPDwellingInputSet-ResidenceType']", AI = false)
	public WebElement drpResidence;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Cancel>div[role='button']", AI = false)
	public WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPDwellingScreen-JobWizardToolbarButtonSet-CloseOptions>div[role='button']", AI = false)
	public WebElement btnCloseOptions;

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

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPDwellingScreen-JobWizardToolbarButtonSet-CloseOptions-Decline>div[role='menuitem']", AI = false)
	public WebElement btnDecline;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPDwellingScreen-HOPDwellingPanelSet-HOPDwellingCV-HOPDwellingAdditionalInterestDetailsDV-AdditionalInterestLV_tb-AddContactsButton-AddExistingContact>div[role='button']", AI = false)
	public WebElement btnExistingAdditionalInterest;

	@IFindBy(how = How.CSS, using = "div[id=$'SubmissionWizard-WizardMenuActions']>div[role='button']", AI = false)
	public WebElement btnWizardMenuActions;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardActionsMenuItemSet-SubmissionInfo>div[role='menuitem']", AI = false)
	public WebElement btnSubManager;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-HOPDwellingScreen-HOPDwellingPanelSet-HOPDwellingCV-HOPDwellingDetailsDV-HOPDwellingInputSet-TerritoryCodeInputSet-0-TerritoryCode']", AI = false)
	public WebElement inpTerritoryCode;

	@IFindBy(how = How.CSS, using = "div[id$='Dwelling']", AI = false)
	public WebElement btnDwellingScreen;

	@IFindBy(how = How.CSS, using = "input[name$='AdditionalInsuredLV-2-AdditionalInformation']", AI = false)
	public WebElement inpSchoolName;

	public DwellingPage(){
	}

	public DwellingPage(WebDriver driver){
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

	}public DwellingPage clickWorkplan(WebDriver driver)  {
		BrowserActions.click(driver, btnWorkplan,"Workplan");
		return this;
	}
	public DwellingPage clickExistingLocation(WebDriver driver)  {
		BrowserActions.click(driver, btnExistingLocation,"ExistingLocation");
		return this;
	}
	public DwellingPage clickIsthereaswimmingpool(WebDriver driver)  {
		BrowserActions.click(driver, chkIsthereaswimmingpool,"Isthereaswimmingpool");
		return this;
	}
	public DwellingPage clickGetRiskInformationProducer(WebDriver driver)  {
		BrowserActions.click(driver, btnGetRiskInformationProducer,"GetRiskInformationProducer");
		return this;
	}
	public DwellingPage clickCopySubmission(WebDriver driver)  {
		BrowserActions.click(driver, btnCopySubmission,"CopySubmission");
		return this;
	}
	public DwellingPage clickGeneralreminderdiary(WebDriver driver)  {
		BrowserActions.click(driver, btnGeneralreminderdiary,"Generalreminderdiary");
		return this;
	}
	public DwellingPage clickFromAddressBook(WebDriver driver)  {
		BrowserActions.click(driver, btnFromAddressBook,"FromAddressBook");
		return this;
	}
	public DwellingPage clickGetReinsuranceQuote(WebDriver driver)  {
		BrowserActions.click(driver, btnGetReinsuranceQuote,"GetReinsuranceQuote");
		return this;
	}
	public DwellingPage clickReview45dayUWPeriod(WebDriver driver)  {
		BrowserActions.click(driver, btnReview45dayUWPeriod,"Review45dayUWPeriod");
		return this;
	}
	public DwellingPage clickAutoFillProtClass(WebDriver driver)  {
		BrowserActions.click(driver, btnAutoFillProtClass,"AutoFillProtClass");
		return this;
	}
	public DwellingPage clickSlide(WebDriver driver)  {
		BrowserActions.click(driver, rdbSlide,"Slide");
		return this;
	}
	public DwellingPage clickGetAuditInternalPersonnel(WebDriver driver)  {
		BrowserActions.click(driver, btnGetAuditInternalPersonnel,"GetAuditInternalPersonnel");
		return this;
	}
	public DwellingPage clickBindOnly(WebDriver driver)  {
		BrowserActions.click(driver, btnBindOnly,"BindOnly");
		return this;
	}
	public DwellingPage clickEditLocation(WebDriver driver)  {
		BrowserActions.click(driver, btnEditLocation,"EditLocation");
		return this;
	}
	public DwellingPage clickBOP0011059781(WebDriver driver)  {
		BrowserActions.click(driver, btnBOP0011059781,"BOP0011059781");
		return this;
	}
	public DwellingPage clickDivingBoard(WebDriver driver)  {
		BrowserActions.click(driver, rdbDivingBoard,"DivingBoard");
		return this;
	}
	public DwellingPage clickInterview(WebDriver driver)  {
		BrowserActions.click(driver, btnInterview,"Interview");
		return this;
	}
	public DwellingPage selectPolicyPeriodSelector_Arg(WebDriver driver,String PolicyPeriodSelector_Arg)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPolicyPeriodSelector_Arg,PolicyPeriodSelector_Arg,"PolicyPeriodSelector_Arg");
		return this;
	}
	public DwellingPage clickPolicyVersions_9(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyVersions_9,"PolicyVersions_9");
		return this;
	}
	public DwellingPage clickPerformanceReview(WebDriver driver)  {
		BrowserActions.click(driver, btnPerformanceReview,"PerformanceReview");
		return this;
	}
	public DwellingPage clickShowPartialWorksheet(WebDriver driver)  {
		BrowserActions.click(driver, btnShowPartialWorksheet,"ShowPartialWorksheet");
		return this;
	}
	public DwellingPage enterAdditionalInformation(WebDriver driver,String AdditionalInformation) {
		BrowserActions.type(driver, inpAdditionalInformation,AdditionalInformation, "AdditionalInformation");
		return this;
	}
	public DwellingPage click60daydiary(WebDriver driver)  {
		BrowserActions.click(driver, btn60daydiary,"60daydiary");
		return this;
	}
	public DwellingPage clickStartMultiVersion(WebDriver driver)  {
		BrowserActions.click(driver, btnStartMultiVersion,"StartMultiVersion");
		return this;
	}
	public DwellingPage clickBack(WebDriver driver)  {
		BrowserActions.click(driver, btnBack,"Back");
		return this;
	}
	public DwellingPage clickReviewProducer(WebDriver driver)  {
		BrowserActions.click(driver, btnReviewProducer,"ReviewProducer");
		return this;
	}
	public DwellingPage clickPA0127642470(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0127642470,"PA0127642470");
		return this;
	}
	public DwellingPage clickCoverages(WebDriver driver)  {
		BrowserActions.click(driver, btnCoverages,"Coverages");
		return this;
	}
	public DwellingPage clickNext(WebDriver driver)  {
		BrowserActions.click(driver, btnNext,"Next");
		return this;
	}
	public DwellingPage clickRahulBijoy(WebDriver driver)  {
		BrowserActions.click(driver, btnRahulBijoy,"RahulBijoy");
		return this;
	}
	public DwellingPage selectFireAlarm(WebDriver driver,String FireAlarm)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpFireAlarm,FireAlarm,"FireAlarm");
		return this;
	}
	public DwellingPage clickCA0085070507(WebDriver driver)  {
		BrowserActions.click(driver, btnCA0085070507,"CA0085070507");
		return this;
	}
	public DwellingPage clickBOP0042998142(WebDriver driver)  {
		BrowserActions.click(driver, btnBOP0042998142,"BOP0042998142");
		return this;
	}
	public DwellingPage clickQuoteRequired(WebDriver driver)  {
		BrowserActions.click(driver, btnQuoteRequired,"QuoteRequired");
		return this;
	}
	public DwellingPage clickAdditionalInterestCardTab(WebDriver driver)  {
		BrowserActions.click(driver, btnAdditionalInterestCardTab,0.5,"AdditionalInterestCardTab");
		return this;
	}
	public DwellingPage clickPolicyReviewMidterm(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyReviewMidterm,"PolicyReviewMidterm");
		return this;
	}
	public DwellingPage clickRemove_4(WebDriver driver)  {
		BrowserActions.click(driver, btnRemove_4,"Remove_4");
		return this;
	}
	public DwellingPage clickRemove_6(WebDriver driver)  {
		BrowserActions.click(driver, btnRemove_6,"Remove_6");
		return this;
	}
	public DwellingPage clickAllDoorsHaveDeadbolts(WebDriver driver)  {
		BrowserActions.click(driver, rdbAllDoorsHaveDeadbolts,"AllDoorsHaveDeadbolts");
		return this;
	}
	public DwellingPage selectType(WebDriver driver,String Type)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpType,Type,"Type");
		return this;
	}
	public DwellingPage clickViewSideBySideVersions(WebDriver driver)  {
		BrowserActions.click(driver, btnViewSideBySideVersions,"ViewSideBySideVersions");
		return this;
	}
	public DwellingPage clickNewPerson(WebDriver driver)  {
		BrowserActions.click(driver, btnNewPerson,"NewPerson");
		return this;
	}
	public DwellingPage clickSaveDraft(WebDriver driver)  {
		BrowserActions.click(driver, btnSaveDraft,"SaveDraft");
		return this;
	}
	public DwellingPage clickRemove_2(WebDriver driver)  {
		BrowserActions.click(driver, btnRemove_2,"Remove_2");
		return this;
	}
	public DwellingPage clickGetBureauData(WebDriver driver)  {
		BrowserActions.click(driver, btnGetBureauData,"GetBureauData");
		return this;
	}
	public DwellingPage clickReinsurance(WebDriver driver)  {
		BrowserActions.click(driver, btnReinsurance,"Reinsurance");
		return this;
	}
	public DwellingPage selectSprinklerSystem(WebDriver driver,String SprinklerSystem)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpSprinklerSystem,SprinklerSystem,"SprinklerSystem");
		return this;
	}
	public DwellingPage clickPayment(WebDriver driver)  {
		BrowserActions.click(driver, btnPayment,"Payment");
		return this;
	}
	public DwellingPage clickBOP0085427452(WebDriver driver)  {
		BrowserActions.click(driver, btnBOP0085427452,"BOP0085427452");
		return this;
	}
	public DwellingPage clickEffectiveDate(WebDriver driver)  {
		BrowserActions.click(driver, btnEffectiveDate,"EffectiveDate");
		return this;
	}
	public DwellingPage clickNewLocation(WebDriver driver)  {
		BrowserActions.click(driver, btnNewLocation,"NewLocation");
		return this;
	}
	public DwellingPage selectSmokeAlarms(WebDriver driver,String SmokeAlarms)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpSmokeAlarms,SmokeAlarms,"SmokeAlarms");
		return this;
	}
	public DwellingPage enterEstimatedReplacementCost(WebDriver driver,String EstimatedReplacementCost) {
		BrowserActions.type(driver, inpEstimatedReplacementCost,EstimatedReplacementCost, "EstimatedReplacementCost");
		return this;
	}
	public DwellingPage enterDistancetoFireHydrantft(WebDriver driver,String DistancetoFireHydrantft) {
		BrowserActions.type(driver, inpDistancetoFireHydrantft,DistancetoFireHydrantft, "DistancetoFireHydrantft");
		return this;
	}
	public DwellingPage clickCreatefromatemplate(WebDriver driver)  {
		BrowserActions.click(driver, btnCreatefromatemplate,"Createfromatemplate");
		return this;
	}
	public DwellingPage selectLocationType(WebDriver driver,String LocationType)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpLocationType,LocationType,"LocationType");
		return this;
	}
	public DwellingPage enterNumberofInsuredUnits(WebDriver driver,String NumberofInsuredUnits) {
		BrowserActions.type(driver, inpNumberofInsuredUnits,NumberofInsuredUnits, "NumberofInsuredUnits");
		return this;
	}
	public DwellingPage clickStartSidebySide(WebDriver driver)  {
		BrowserActions.click(driver, btnStartSidebySide,"StartSidebySide");
		return this;
	}
	public DwellingPage selectLocation(WebDriver driver,String Location)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpLocation,Location,"Location");
		return this;
	}
	public DwellingPage selectOccupancy(WebDriver driver,String Occupancy)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpOccupancy,Occupancy,"Occupancy");
		return this;
	}
	public DwellingPage clickArchiving(WebDriver driver)  {
		BrowserActions.click(driver, btnArchiving,"Archiving");
		return this;
	}
	public DwellingPage clickLocationMenuIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnLocationMenuIcon,"LocationMenuIcon");
		return this;
	}
	public DwellingPage clickPA0247907153(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0247907153,"PA0247907153");
		return this;
	}
	public DwellingPage clickNotTaken(WebDriver driver)  {
		BrowserActions.click(driver, btnNotTaken,"NotTaken");
		return this;
	}
	public DwellingPage clickDocuments(WebDriver driver)  {
		BrowserActions.click(driver, btnDocuments,"Documents");
		return this;
	}
	public DwellingPage clickNextBlockedDate(WebDriver driver)  {
		BrowserActions.click(driver, btnNextBlockedDate,"NextBlockedDate");
		return this;
	}
	public DwellingPage selectUsage(WebDriver driver,String Usage)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpUsage,Usage,"Usage");
		return this;
	}
	public DwellingPage clickApprovedFence(WebDriver driver)  {
		BrowserActions.click(driver, rdbApprovedFence,"ApprovedFence");
		return this;
	}
	public DwellingPage clickDwelling(WebDriver driver)  {
		BrowserActions.click(driver, btnDwelling,"Dwelling");
		return this;
	}
	public DwellingPage clickSG00031824754074602384(WebDriver driver)  {
		BrowserActions.click(driver, btnSG00031824754074602384,"SG00031824754074602384");
		return this;
	}
	public DwellingPage clickPA0127025333(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0127025333,"PA0127025333");
		return this;
	}
	public DwellingPage click90daydiary(WebDriver driver)  {
		BrowserActions.click(driver, btn90daydiary,"90daydiary");
		return this;
	}
	public DwellingPage clickResidenceVisibletoNeighbors(WebDriver driver)  {
		BrowserActions.click(driver, rdbResidenceVisibletoNeighbors,"ResidenceVisibletoNeighbors");
		return this;
	}
	public DwellingPage clickRiskAnalysis_10(WebDriver driver)  {
		BrowserActions.click(driver, btnRiskAnalysis_10,"RiskAnalysis_10");
		return this;
	}
	public DwellingPage enterNumberofRoomersBoarders(WebDriver driver,String NumberofRoomersBoarders) {
		BrowserActions.type(driver, inpNumberofRoomersBoarders,NumberofRoomersBoarders, "NumberofRoomersBoarders");
		return this;
	}
	public DwellingPage clickOtherContacts(WebDriver driver)  {
		BrowserActions.click(driver, btnOtherContacts,"OtherContacts");
		return this;
	}
	public DwellingPage clickQuote(WebDriver driver)  {
		BrowserActions.click(driver, btnQuote,"Quote");
		return this;
	}
	public DwellingPage clickBindOptions(WebDriver driver)  {
		BrowserActions.click(driver, btnBindOptions,"BindOptions");
		return this;
	}
	public DwellingPage clickReleaseLock(WebDriver driver)  {
		BrowserActions.click(driver, btnReleaseLock,"ReleaseLock");
		return this;
	}
	public DwellingPage clickEnableDisable(WebDriver driver)  {
		BrowserActions.click(driver, btnEnableDisable,"EnableDisable");
		return this;
	}
	public DwellingPage clickIssuePolicy(WebDriver driver)  {
		BrowserActions.click(driver, btnIssuePolicy,"IssuePolicy");
		return this;
	}
	public DwellingPage clickAutofillTerritoryCodes(WebDriver driver)  {
		BrowserActions.click(driver, btnAutofillTerritoryCodes,"AutofillTerritoryCodes");
		return this;
	}
	public DwellingPage clickCreateNewProducer(WebDriver driver)  {
		BrowserActions.click(driver, btnCreateNewProducer,"CreateNewProducer");
		return this;
	}
	public DwellingPage clickAdd(WebDriver driver)  {
		BrowserActions.click(driver, btnAdd,"Add");
		return this;
	}
	public DwellingPage clickForms(WebDriver driver)  {
		BrowserActions.click(driver, btnForms,"Forms");
		return this;
	}
	public DwellingPage clickPolicyPeriodSelector(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyPeriodSelector,"PolicyPeriodSelector");
		return this;
	}
	public DwellingPage clickNewmail(WebDriver driver)  {
		BrowserActions.click(driver, btnNewmail,"Newmail");
		return this;
	}
	public DwellingPage clickGetMotorVehicleReports(WebDriver driver)  {
		BrowserActions.click(driver, btnGetMotorVehicleReports,"GetMotorVehicleReports");
		return this;
	}
	public DwellingPage clickQualification(WebDriver driver)  {
		BrowserActions.click(driver, btnQualification,"Qualification");
		return this;
	}
	public DwellingPage enterNumberofUnitsBetweenFirewall(WebDriver driver,String NumberofUnitsBetweenFirewall) {
		BrowserActions.type(driver, inpNumberofUnitsBetweenFirewall,NumberofUnitsBetweenFirewall, "NumberofUnitsBetweenFirewall");
		return this;
	}
	public DwellingPage clickNotes(WebDriver driver)  {
		BrowserActions.click(driver, btnNotes,"Notes");
		return this;
	}
	public DwellingPage clickGetInspectionLossControl(WebDriver driver)  {
		BrowserActions.click(driver, btnGetInspectionLossControl,"GetInspectionLossControl");
		return this;
	}
	public DwellingPage clickQuote_8(WebDriver driver)  {
		BrowserActions.click(driver, btnQuote_8,"Quote_8");
		return this;
	}
	public DwellingPage clickParticipants(WebDriver driver)  {
		BrowserActions.click(driver, btnParticipants,"Participants");
		return this;
	}
	public DwellingPage clickCreate(WebDriver driver)  {
		BrowserActions.click(driver, btnCreate,"Create");
		return this;
	}
	public DwellingPage clickQuote_7(WebDriver driver)  {
		BrowserActions.click(driver, btnQuote_7,"Quote_7");
		return this;
	}
	public DwellingPage clickReviewandapprove(WebDriver driver)  {
		BrowserActions.click(driver, btnReviewandapprove,"Reviewandapprove");
		return this;
	}
	public DwellingPage selectEffectiveDate(WebDriver driver,String EffectiveDate)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpEffectiveDate,EffectiveDate,"EffectiveDate");
		return this;
	}
	public DwellingPage clickLegalreview(WebDriver driver)  {
		BrowserActions.click(driver, btnLegalreview,"Legalreview");
		return this;
	}
	public DwellingPage clickNewDocument(WebDriver driver)  {
		BrowserActions.click(driver, btnNewDocument,"NewDocument");
		return this;
	}
	public DwellingPage clickPolicynotification(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicynotification,"Policynotification");
		return this;
	}
	public DwellingPage clickUploaddocuments(WebDriver driver)  {
		BrowserActions.click(driver, btnUploaddocuments,"Uploaddocuments");
		return this;
	}
	public DwellingPage clickFinish(WebDriver driver)  {
		BrowserActions.click(driver, btnFinish,"Finish");
		return this;
	}
	public DwellingPage clickGoto(WebDriver driver)  {
		BrowserActions.click(driver, btnGoto,"Goto");
		return this;
	}
	public DwellingPage clickProductDefinition(WebDriver driver)  {
		BrowserActions.click(driver, btnProductDefinition,"ProductDefinition");
		return this;
	}
	public DwellingPage clickGetInspectionOutsideService(WebDriver driver)  {
		BrowserActions.click(driver, btnGetInspectionOutsideService,"GetInspectionOutsideService");
		return this;
	}
	public DwellingPage clickUnderwriterReview(WebDriver driver)  {
		BrowserActions.click(driver, btnUnderwriterReview,"UnderwriterReview");
		return this;
	}
	public DwellingPage clickMeetwithInsured(WebDriver driver)  {
		BrowserActions.click(driver, btnMeetwithInsured,"MeetwithInsured");
		return this;
	}
	public DwellingPage click30daydiary(WebDriver driver)  {
		BrowserActions.click(driver, btn30daydiary,"30daydiary");
		return this;
	}
	public DwellingPage clickOfferings(WebDriver driver)  {
		BrowserActions.click(driver, btnOfferings,"Offerings");
		return this;
	}
	public DwellingPage clickPolicyReviewRenewal(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyReviewRenewal,"PolicyReviewRenewal");
		return this;
	}
	public DwellingPage clickSearch(WebDriver driver)  {
		BrowserActions.click(driver, btnSearch,"Search");
		return this;
	}
	public DwellingPage clickHOP0011359660(WebDriver driver)  {
		BrowserActions.click(driver, btnHOP0011359660,"HOP0011359660");
		return this;
	}
	public DwellingPage clickNewNote(WebDriver driver)  {
		BrowserActions.click(driver, btnNewNote,"NewNote");
		return this;
	}
	public DwellingPage clickSidebySideQuoting(WebDriver driver)  {
		BrowserActions.click(driver, btnSidebySideQuoting,"SidebySideQuoting");
		return this;
	}
	public DwellingPage clickRiskAnalysis(WebDriver driver)  {
		BrowserActions.click(driver, btnRiskAnalysis,"RiskAnalysis");
		return this;
	}
	public DwellingPage clickPA0108046463(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0108046463,"PA0108046463");
		return this;
	}
	public DwellingPage clickMeetwithProducerAgency(WebDriver driver)  {
		BrowserActions.click(driver, btnMeetwithProducerAgency,"MeetwithProducerAgency");
		return this;
	}
	public DwellingPage clickPA0128045417(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0128045417,"PA0128045417");
		return this;
	}
	public DwellingPage clickPA0126226969(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0126226969,"PA0126226969");
		return this;
	}
	public DwellingPage clickCollectCreditCard(WebDriver driver)  {
		BrowserActions.click(driver, btnCollectCreditCard,"CollectCreditCard");
		return this;
	}
	public DwellingPage clickCA0005618226(WebDriver driver)  {
		BrowserActions.click(driver, btnCA0005618226,"CA0005618226");
		return this;
	}
	public DwellingPage clickDetails(WebDriver driver)  {
		BrowserActions.click(driver, btnDetails,"Details");
		return this;
	}
	public DwellingPage clickCA0085131592(WebDriver driver)  {
		BrowserActions.click(driver, btnCA0085131592,"CA0085131592");
		return this;
	}
	public DwellingPage clickRatiooutofrange(WebDriver driver)  {
		BrowserActions.click(driver, btnRatiooutofrange,"Ratiooutofrange");
		return this;
	}
	public DwellingPage clickFullApp(WebDriver driver)  {
		BrowserActions.click(driver, btnFullApp,"FullApp");
		return this;
	}
	public DwellingPage clickPolicyReview(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyReview,"PolicyReview");
		return this;
	}
	public DwellingPage clickDiagnosticData(WebDriver driver)  {
		BrowserActions.click(driver, btnDiagnosticData,"DiagnosticData");
		return this;
	}
	public DwellingPage clickOOSEPeriodSelector(WebDriver driver)  {
		BrowserActions.click(driver, btnOOSEPeriodSelector,"OOSEPeriodSelector");
		return this;
	}
	public DwellingPage clickManuallyrateandquotepolicy(WebDriver driver)  {
		BrowserActions.click(driver, btnManuallyrateandquotepolicy,"Manuallyrateandquotepolicy");
		return this;
	}
	public DwellingPage clickHistory(WebDriver driver)  {
		BrowserActions.click(driver, btnHistory,"History");
		return this;
	}
	public DwellingPage clickBOP0042873185(WebDriver driver)  {
		BrowserActions.click(driver, btnBOP0042873185,"BOP0042873185");
		return this;
	}
	public DwellingPage clickReminder(WebDriver driver)  {
		BrowserActions.click(driver, btnReminder,"Reminder");
		return this;
	}
	public DwellingPage clickBOP0052212503(WebDriver driver)  {
		BrowserActions.click(driver, btnBOP0052212503,"BOP0052212503");
		return this;
	}
	public DwellingPage clickEdit(WebDriver driver)  {
		BrowserActions.click(driver, btnEdit,"Edit");
		return this;
	}
	public DwellingPage clickPA0127285387(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0127285387,"PA0127285387");
		return this;
	}
	public DwellingPage clickWithdrawTransaction(WebDriver driver)  {
		BrowserActions.click(driver, btnWithdrawTransaction,"WithdrawTransaction");
		return this;
	}
	public DwellingPage clickBOP0015824087(WebDriver driver)  {
		BrowserActions.click(driver, btnBOP0015824087,"BOP0015824087");
		return this;
	}
	public DwellingPage clickPolicyInfo(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyInfo,"PolicyInfo");
		return this;
	}
	public DwellingPage clickDwellingConstruction(WebDriver driver)  {
		BrowserActions.click(driver, btnDwellingConstruction,"DwellingConstruction");
		return this;
	}
	public DwellingPage clickCA0084956520(WebDriver driver)  {
		BrowserActions.click(driver, btnCA0084956520,"CA0084956520");
		return this;
	}
	public DwellingPage clickBOP0016789240(WebDriver driver)  {
		BrowserActions.click(driver, btnBOP0016789240,"BOP0016789240");
		return this;
	}
	public DwellingPage clickVersions(WebDriver driver)  {
		BrowserActions.click(driver, btnVersions,"Versions");
		return this;
	}
	public DwellingPage selectFireProtectionClass(WebDriver driver,String FireProtectionClass)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpFireProtectionClass,FireProtectionClass,2,"FireProtectionClass");
		return this;
	}
	public DwellingPage clickModifiers(WebDriver driver)  {
		BrowserActions.click(driver, btnModifiers,"Modifiers");
		return this;
	}
	public DwellingPage clickAccountFile(WebDriver driver)  {
		BrowserActions.click(driver, btnAccountFile,"AccountFile");
		return this;
	}
	public DwellingPage enterNumberofFireExtinguishers(WebDriver driver,String NumberofFireExtinguishers) {
		BrowserActions.type(driver, inpNumberofFireExtinguishers,NumberofFireExtinguishers, "NumberofFireExtinguishers");
		return this;
	}
	public DwellingPage clickRemove(WebDriver driver)  {
		BrowserActions.click(driver, btnRemove,"Remove");
		return this;
	}
	public DwellingPage clickReviewnewmail(WebDriver driver)  {
		BrowserActions.click(driver, btnReviewnewmail,"Reviewnewmail");
		return this;
	}
	public DwellingPage clickGroup(WebDriver driver)  {
		BrowserActions.click(driver, btnGroup,"Group");
		return this;
	}
	public DwellingPage clickCancelasplitpolicy(WebDriver driver)  {
		BrowserActions.click(driver, btnCancelasplitpolicy,"Cancelasplitpolicy");
		return this;
	}
	public DwellingPage selectBurglarAlarm(WebDriver driver,String BurglarAlarm)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpBurglarAlarm,BurglarAlarm,"BurglarAlarm");
		return this;
	}
	public DwellingPage clickGetAuditOutsideService(WebDriver driver)  {
		BrowserActions.click(driver, btnGetAuditOutsideService,"GetAuditOutsideService");
		return this;
	}
	public DwellingPage clickCopyData(WebDriver driver)  {
		BrowserActions.click(driver, btnCopyData,"CopyData");
		return this;
	}
	public DwellingPage clickNewAuditAssignment(WebDriver driver)  {
		BrowserActions.click(driver, btnNewAuditAssignment,"NewAuditAssignment");
		return this;
	}
	public DwellingPage clickRewritetoNewAccount(WebDriver driver)  {
		BrowserActions.click(driver, btnRewritetoNewAccount,"RewritetoNewAccount");
		return this;
	}
	public DwellingPage clickNewCompany(WebDriver driver)  {
		BrowserActions.click(driver, btnNewCompany,"NewCompany");
		return this;
	}
	public DwellingPage clickClose(WebDriver driver)  {
		BrowserActions.click(driver, btnClose,"Close");
		return this;
	}
	public DwellingPage clickReview30dayUWPeriod(WebDriver driver)  {
		BrowserActions.click(driver, btnReview30dayUWPeriod,"Review30dayUWPeriod");
		return this;
	}
	public DwellingPage enterDistancetoFireStationmi(WebDriver driver,String DistancetoFireStationmi) {
		BrowserActions.type(driver, inpDistancetoFireStationmi,DistancetoFireStationmi, "DistancetoFireStationmi");
		return this;
	}
	public DwellingPage clickPolicyVersions(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyVersions,"PolicyVersions");
		return this;
	}
	public DwellingPage clickReview60dayUWPeriod(WebDriver driver)  {
		BrowserActions.click(driver, btnReview60dayUWPeriod,"Review60dayUWPeriod");
		return this;
	}
	public DwellingPage clickAdd_5(WebDriver driver)  {
		BrowserActions.click(driver, btnAdd_5,"Add_5");
		return this;
	}
	public DwellingPage clickPA0108221556(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0108221556,"PA0108221556");
		return this;
	}
	public DwellingPage clickEditPolicyTransaction(WebDriver driver)  {
		BrowserActions.click(driver, btnEditPolicyTransaction,"EditPolicyTransaction");
		return this;
	}
	public DwellingPage clickAdd_3(WebDriver driver)  {
		BrowserActions.click(driver, btnAdd_3,"Add_3");
		return this;
	}
	public DwellingPage clickAdd_1(WebDriver driver)  {
		BrowserActions.click(driver, btnAdd_1,"Add_1");
		return this;
	}
	public DwellingPage clickNewActivity(WebDriver driver)  {
		BrowserActions.click(driver, btnNewActivity,"NewActivity");
		return this;
	}
	public DwellingPage clickPA0108520862(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0108520862,"PA0108520862");
		return this;
	}
	public DwellingPage selectResidence(WebDriver driver,String Residence)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpResidence,Residence,"Residence");
		return this;
	}
	public DwellingPage clickCancel(WebDriver driver)  {
		BrowserActions.click(driver, btnCancel,"Cancel");
		return this;
	}
	public DwellingPage clickCloseOptions(WebDriver driver)  {
		BrowserActions.click(driver, btnCloseOptions,"CloseOptions");
		return this;
	}
	public DwellingPage clickPolicyContract(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyContract,"PolicyContract");
		return this;
	}
	public DwellingPage clickPolicyFile(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyFile,"PolicyFile");
		return this;
	}
	public DwellingPage clickVerifycoverage(WebDriver driver)  {
		BrowserActions.click(driver, btnVerifycoverage,"Verifycoverage");
		return this;
	}
	public DwellingPage clickRequest(WebDriver driver)  {
		BrowserActions.click(driver, btnRequest,"Request");
		return this;
	}
	public DwellingPage clickGetCreditReports(WebDriver driver)  {
		BrowserActions.click(driver, btnGetCreditReports,"GetCreditReports");
		return this;
	}
	public DwellingPage clickDecline(WebDriver driver)  {
		BrowserActions.click(driver, btnDecline,"Decline");
		return this;
	}
	public DwellingPage clickExistingAdditionalInterest(WebDriver driver)  {
		BrowserActions.click(driver, btnExistingAdditionalInterest,"ExistingAdditionalInterest");
		return this;
	}
	public DwellingPage clickWizardMenuActions(WebDriver driver)  {
		BrowserActions.click(driver, btnWizardMenuActions,"WizardMenuActions");
		return this;
	}
	public DwellingPage clickSubManager(WebDriver driver)  {
		BrowserActions.click(driver, btnSubManager,"SubManager");
		return this;
	}
	public DwellingPage enterTerritoryCode(WebDriver driver,String TerritoryCode) {
		BrowserActions.type(driver, inpTerritoryCode,TerritoryCode, "TerritoryCode");
		return this;
	}
	public DwellingPage clickDwellingScreen(WebDriver driver)  {
		BrowserActions.click(driver, btnDwellingScreen,1,"Dwelling Screen");
		return this;
	}
	public DwellingPage enterSchoolName(WebDriver driver, String name)  {
		BrowserActions.type(driver, inpSchoolName, name,0.5, "School Name");
		return this;
	}


	public class TerritoryCodeSearchPage extends LoadableComponent<TerritoryCodeSearchPage> {

		WebDriver driver;
		private boolean isPageLoaded;
		public ElementLayer elementLayer;
		String elementObject;
		HashMap<String, String> getPageObjects;
		public List<Object> pageFactoryKey = new ArrayList<Object>();
		public List<String> pageFactoryValue = new ArrayList<String>();

		//TopNavBar object

		@IFindBy(how = How.CSS, using = "input[name='TerritoryCodeSearchPopup-TerritoryCodeSearchScreen-TerritoryCodeSearchResultsLV-0-Code']", AI = false)
		public WebElement inpCode_2;

		@IFindBy(how = How.CSS, using = "#TerritoryCodeSearchPopup-__crumb__", AI = false)
		public WebElement btnReturntoDwelling;

		@IFindBy(how = How.CSS, using = "input[name='TerritoryCodeSearchPopup-TerritoryCodeSearchScreen-TerritoryCodeSearchDV-Code']", AI = false)
		public WebElement inpCode;

		@IFindBy(how = How.CSS, using = "#TerritoryCodeSearchPopup-TerritoryCodeSearchScreen-TerritoryCodeSearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-PostalCode-AutoFillIcon", AI = false)
		public WebElement btnAutoFillIcon_1;

		@IFindBy(how = How.CSS, using = "input[name='TerritoryCodeSearchPopup-TerritoryCodeSearchScreen-TerritoryCodeSearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-County']", AI = false)
		public WebElement inpCounty;

		@IFindBy(how = How.CSS, using = "input[name='TerritoryCodeSearchPopup-TerritoryCodeSearchScreen-TerritoryCodeSearchResultsLV-0-Description']", AI = false)
		public WebElement inpDescription_6;

		@IFindBy(how = How.CSS, using = "input[name='TerritoryCodeSearchPopup-TerritoryCodeSearchScreen-TerritoryCodeSearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine3']", AI = false)
		public WebElement inpAddress3;

		@IFindBy(how = How.CSS, using = "input[name='TerritoryCodeSearchPopup-TerritoryCodeSearchScreen-TerritoryCodeSearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine1']", AI = false)
		public WebElement inpAddress1;

		@IFindBy(how = How.CSS, using = "input[name='TerritoryCodeSearchPopup-TerritoryCodeSearchScreen-TerritoryCodeSearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine2']", AI = false)
		public WebElement inpAddress2;

		@IFindBy(how = How.CSS, using = "input[name='TerritoryCodeSearchPopup-TerritoryCodeSearchScreen-TerritoryCodeSearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressSummary']", AI = false)
		public WebElement inpAddress;

		@IFindBy(how = How.CSS, using = "input[name='TerritoryCodeSearchPopup-TerritoryCodeSearchScreen-TerritoryCodeSearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-PostalCode']", AI = false)
		public WebElement inpZIPCode;

		@IFindBy(how = How.CSS, using = "#TerritoryCodeSearchPopup-TerritoryCodeSearchScreen-TerritoryCodeSearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-City-AutoFillIcon", AI = false)
		public WebElement btnAutoFillIcon;

		@IFindBy(how = How.CSS, using = "select[name='TerritoryCodeSearchPopup-TerritoryCodeSearchScreen-TerritoryCodeSearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-Country']", AI = false)
		public WebElement drpCountry;

		@IFindBy(how = How.CSS, using = "select[name='TerritoryCodeSearchPopup-TerritoryCodeSearchScreen-TerritoryCodeSearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-State']", AI = false)
		public WebElement drpState;

		@IFindBy(how = How.CSS, using = "input[name='TerritoryCodeSearchPopup-TerritoryCodeSearchScreen-TerritoryCodeSearchResultsLV-0-County']", AI = false)
		public WebElement inpCounty_5;

		@IFindBy(how = How.CSS, using = "input[name='TerritoryCodeSearchPopup-TerritoryCodeSearchScreen-TerritoryCodeSearchResultsLV-0-PostalCode']", AI = false)
		public WebElement inpPostalCode;

		@IFindBy(how = How.CSS, using = "input[name='TerritoryCodeSearchPopup-TerritoryCodeSearchScreen-TerritoryCodeSearchDV-Description']", AI = false)
		public WebElement inpDescription;

		@IFindBy(how = How.CSS, using = "input[name='TerritoryCodeSearchPopup-TerritoryCodeSearchScreen-TerritoryCodeSearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-City']", AI = false)
		public WebElement inpCity;

		@IFindBy(how = How.CSS, using = "#TerritoryCodeSearchPopup-TerritoryCodeSearchScreen-TerritoryCodeSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Search", AI = false)
		public WebElement btnSearch;

		@IFindBy(how = How.CSS, using = "#TerritoryCodeSearchPopup-TerritoryCodeSearchScreen-TerritoryCodeSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Reset", AI = false)
		public WebElement btnReset;

		@IFindBy(how = How.CSS, using = "div[id$='TerritoryCodeSearchScreen-ttlBar']", AI = false)
		public WebElement lblTtlBar;

		@IFindBy(how = How.CSS, using = "select[name='TerritoryCodeSearchPopup-TerritoryCodeSearchScreen-TerritoryCodeSearchResultsLV-0-State']", AI = false)
		public WebElement drpState_3;

		@IFindBy(how = How.CSS, using = "input[name='TerritoryCodeSearchPopup-TerritoryCodeSearchScreen-TerritoryCodeSearchResultsLV-0-City']", AI = false)
		public WebElement inpCity_4;

		public TerritoryCodeSearchPage(){
		}

		public TerritoryCodeSearchPage(WebDriver driver) throws Exception{
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
		}public TerritoryCodeSearchPage enterCode_2(WebDriver driver,String Code_2) {
			BrowserActions.type(driver, inpCode_2,Code_2, "Code_2");
			return this;
		}
		public TerritoryCodeSearchPage clickReturntoDwelling(WebDriver driver)  {
			BrowserActions.click(driver, btnReturntoDwelling,"ReturntoDwelling");
			return this;
		}
		public TerritoryCodeSearchPage enterCode(WebDriver driver,String Code) {
			BrowserActions.type(driver, inpCode,Code, "Code");
			return this;
		}
		public TerritoryCodeSearchPage clickAutoFillIcon_1(WebDriver driver)  {
			BrowserActions.click(driver, btnAutoFillIcon_1,"AutoFillIcon_1");
			return this;
		}
		public TerritoryCodeSearchPage enterCounty(WebDriver driver,String County) {
			BrowserActions.type(driver, inpCounty,County, "County");
			return this;
		}
		public TerritoryCodeSearchPage enterDescription_6(WebDriver driver,String Description_6) {
			BrowserActions.type(driver, inpDescription_6,Description_6, "Description_6");
			return this;
		}
		public TerritoryCodeSearchPage enterAddress3(WebDriver driver,String Address3) {
			BrowserActions.type(driver, inpAddress3,Address3, "Address3");
			return this;
		}
		public TerritoryCodeSearchPage enterAddress1(WebDriver driver,String Address1) {
			BrowserActions.type(driver, inpAddress1,Address1, "Address1");
			return this;
		}
		public TerritoryCodeSearchPage enterAddress2(WebDriver driver,String Address2) {
			BrowserActions.type(driver, inpAddress2,Address2, "Address2");
			return this;
		}
		public TerritoryCodeSearchPage enterAddress(WebDriver driver,String Address) {
			BrowserActions.type(driver, inpAddress,Address, "Address");
			return this;
		}
		public TerritoryCodeSearchPage enterZIPCode(WebDriver driver,String ZIPCode) {
			BrowserActions.type(driver, inpZIPCode,ZIPCode, "ZIPCode");
			return this;
		}
		public TerritoryCodeSearchPage clickAutoFillIcon(WebDriver driver)  {
			BrowserActions.click(driver, btnAutoFillIcon, true,"AutoFillIcon");
			return this;
		}
		public TerritoryCodeSearchPage selectCountry(WebDriver driver,String Country)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpCountry,Country,"Country");
			return this;
		}
		public TerritoryCodeSearchPage selectState(WebDriver driver,String State)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpState,State,"State");
			return this;
		}
		public TerritoryCodeSearchPage enterCounty_5(WebDriver driver,String County_5) {
			BrowserActions.type(driver, inpCounty_5,County_5, "County_5");
			return this;
		}
		public TerritoryCodeSearchPage enterPostalCode(WebDriver driver,String PostalCode) {
			BrowserActions.type(driver, inpPostalCode,PostalCode, "PostalCode");
			return this;
		}
		public TerritoryCodeSearchPage enterDescription(WebDriver driver,String Description) {
			BrowserActions.type(driver, inpDescription,Description, "Description");
			return this;
		}
		public TerritoryCodeSearchPage enterCity(WebDriver driver,String City) {
			BrowserActions.type(driver, inpCity,City, "City");
			return this;
		}
		public TerritoryCodeSearchPage clickSearch(WebDriver driver)  {
			BrowserActions.click(driver, btnSearch,"Search");
			return this;
		}
		public TerritoryCodeSearchPage clickReset(WebDriver driver)  {
			BrowserActions.click(driver, btnReset,"Reset");
			return this;
		}
		public TerritoryCodeSearchPage selectState_3(WebDriver driver,String State_3)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpState_3,State_3,"State_3");
			return this;
		}
		public TerritoryCodeSearchPage enterCity_4(WebDriver driver,String City_4) {
			BrowserActions.type(driver, inpCity_4,City_4, "City_4");
			return this;
		}
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
		@IFindBy(how = How.CSS, using = "#LocationPopup-__crumb__", AI = false)
		public WebElement btnReturntoDwelling;

		@IFindBy(how = How.CSS, using = "#LocationPopup-LocationScreen-LocationDetailPanelSet-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-TargetedAddressInputSet-globalAddressContainer-GlobalAddressInputSet-PostalCode-AutoFillIcon", AI = false)
		public WebElement btnAutoFillIcon_1;

		@IFindBy(how = How.CSS, using = "input[name='LocationPopup-LocationScreen-LocationDetailPanelSet-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-TargetedAddressInputSet-globalAddressContainer-GlobalAddressInputSet-County']", AI = false)
		public WebElement inpCounty;

		@IFindBy(how = How.CSS, using = "input[name='LocationPopup-LocationScreen-LocationDetailPanelSet-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-LocationCode']", AI = false)
		public WebElement inpLocationCode;

		@IFindBy(how = How.CSS, using = "select[name='LocationPopup-LocationScreen-LocationDetailPanelSet-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-UnsyncedAddressInputSet-UnsyncedCountry']", AI = false)
		public WebElement drpCountry_4;

		@IFindBy(how = How.CSS, using = "input[name='LocationPopup-LocationScreen-LocationDetailPanelSet-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-UnsyncedAddressInputSet-unsyncedAddressString']", AI = false)
		public WebElement inpAddress_2;

		@IFindBy(how = How.CSS, using = "input[name='LocationPopup-LocationScreen-LocationDetailPanelSet-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-Phone-GlobalPhoneInputSet-Extension']", AI = false)
		public WebElement inpPhoneExtension;

		@IFindBy(how = How.CSS, using = "#LocationPopup-LocationScreen-LocationDetailPanelSet-LocationDetailCV-AdditionalCoveragesCardTab", AI = false)
		public WebElement btnAdditionalCoverages;

		@IFindBy(how = How.CSS, using = "#LocationPopup-LocationScreen-LocationDetailPanelSet-LocationDetailCV-LocationQuestionsCardTab", AI = false)
		public WebElement btnQuestions;

		@IFindBy(how = How.CSS, using = "input[name='LocationPopup-LocationScreen-LocationDetailPanelSet-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-TargetedAddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine3']", AI = false)
		public WebElement inpAddress3;

		@IFindBy(how = How.CSS, using = "input[name='LocationPopup-LocationScreen-LocationDetailPanelSet-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-TargetedAddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine1']", AI = false)
		public WebElement inpAddress1;

		@IFindBy(how = How.CSS, using = "input[name='LocationPopup-LocationScreen-LocationDetailPanelSet-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-TargetedAddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine2']", AI = false)
		public WebElement inpAddress2;

		@IFindBy(how = How.CSS, using = "input[name='LocationPopup-LocationScreen-LocationDetailPanelSet-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-TargetedAddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressSummary']", AI = false)
		public WebElement inpAddress;

		@IFindBy(how = How.CSS, using = "input[name='LocationPopup-LocationScreen-LocationDetailPanelSet-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-TargetedAddressInputSet-globalAddressContainer-GlobalAddressInputSet-PostalCode']", AI = false)
		public WebElement inpZIPCode;

		@IFindBy(how = How.CSS, using = "#LocationPopup-LocationScreen-LocationDetailPanelSet-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-TargetedAddressInputSet-globalAddressContainer-GlobalAddressInputSet-City-AutoFillIcon", AI = false)
		public WebElement btnAutoFillIcon;

		@IFindBy(how = How.CSS, using = "select[name='LocationPopup-LocationScreen-LocationDetailPanelSet-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-TargetedAddressInputSet-globalAddressContainer-GlobalAddressInputSet-Country']", AI = false)
		public WebElement drpCountry;

		@IFindBy(how = How.CSS, using = "select[name='LocationPopup-LocationScreen-LocationDetailPanelSet-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-TargetedAddressInputSet-globalAddressContainer-GlobalAddressInputSet-State']", AI = false)
		public WebElement drpState;

		@IFindBy(how = How.CSS, using = "input[name='LocationPopup-LocationScreen-LocationDetailPanelSet-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-UnsyncedAddressInputSet-UnsyncedCounty']", AI = false)
		public WebElement inpCounty_3;

		@IFindBy(how = How.CSS, using = "#LocationPopup-LocationScreen-LocationDetailPanelSet-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-TerritoryCodeInputSet-AutofillLink", AI = false)
		public WebElement btnAutofillTerritoryCodes;

		@IFindBy(how = How.CSS, using = "input[name='LocationPopup-LocationScreen-LocationDetailPanelSet-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-LocationName']", AI = false)
		public WebElement inpLocationName;

		@IFindBy(how = How.CSS, using = "input[name='LocationPopup-LocationScreen-LocationDetailPanelSet-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-TaxLocation']", AI = false)
		public WebElement inpTaxLocation;

		@IFindBy(how = How.CSS, using = "input[name='LocationPopup-LocationScreen-LocationDetailPanelSet-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-TargetedAddressInputSet-globalAddressContainer-GlobalAddressInputSet-City']", AI = false)
		public WebElement inpCity;

		@IFindBy(how = How.CSS, using = "#LocationPopup-LocationScreen-Update>div[role='button']", AI = false)
		public WebElement btnOK;

		@IFindBy(how = How.CSS, using = "#LocationPopup-LocationScreen-LocationDetailPanelSet-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-TaxLocation-SelectTaxLocation", AI = false)
		public WebElement btnSearch;

		@IFindBy(how = How.CSS, using = "select[name='LocationPopup-LocationScreen-LocationDetailPanelSet-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-Phone-GlobalPhoneInputSet-CountryCode']", AI = false)
		public WebElement drpPhoneRegionCode;

		@IFindBy(how = How.CSS, using = "#LocationPopup-LocationScreen-LocationDetailPanelSet-LocationDetailCV-GeneralInfoCardTab", AI = false)
		public WebElement btnDetails;

		@IFindBy(how = How.CSS, using = "input[name='LocationPopup-LocationScreen-LocationDetailPanelSet-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-Phone-GlobalPhoneInputSet-NationalSubscriberNumber']", AI = false)
		public WebElement inpPhone;

		@IFindBy(how = How.XPATH, using = "//div[text()='Location Information']", AI = false)
		public WebElement lblTtlBar;

		@IFindBy(how = How.CSS, using = "#LocationPopup-LocationScreen-Edit>div[role='button']", AI = false)
		public WebElement btnEdit;

		@IFindBy(how = How.CSS, using = "#LocationPopup-LocationScreen-LocationDetailPanelSet-LocationDetailCV-AccountLocationUpToDateDV-SynchronizedLink", AI = false)
		public WebElement btnViewCurrentLocation;

		@IFindBy(how = How.CSS, using = "#LocationPopup-LocationScreen-LocationDetailPanelSet-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-TerritoryCodeInputSet-0-TerritoryCode-SelectTerritoryCode", AI = false)
		public WebElement btnSearch_6;

		@IFindBy(how = How.CSS, using = "#LocationPopup-LocationScreen-Cancel>div[role='button']", AI = false)
		public WebElement btnCancel;

		@IFindBy(how = How.CSS, using = "input[name='LocationPopup-LocationScreen-LocationDetailPanelSet-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-Phone-GlobalPhoneInputSet-PhoneDisplay']", AI = false)
		public WebElement inpPhone_5;

		@IFindBy(how = How.CSS, using = "input[name='LocationPopup-LocationScreen-LocationDetailPanelSet-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-NonSpecificLocation']", AI = false)
		public WebElement rdbNonSpecificLocation;

		@IFindBy(how = How.CSS, using = "input[name='LocationPopup-LocationScreen-LocationDetailPanelSet-LocationDetailCV-LocationDetailDV-LocationDetailInputSet-TerritoryCodeInputSet-0-TerritoryCode']", AI = false)
		public WebElement inpTerritoryCode;

		public LocationInformationPage(){
		}

		public LocationInformationPage(WebDriver driver) throws Exception{
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
		}public LocationInformationPage clickReturntoDwelling(WebDriver driver)  {
			BrowserActions.click(driver, btnReturntoDwelling,"ReturntoDwelling");
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
		public LocationInformationPage enterPhoneExtension(WebDriver driver,String PhoneExtension) {
			BrowserActions.type(driver, inpPhoneExtension,PhoneExtension, "PhoneExtension");
			return this;
		}
		public LocationInformationPage clickAdditionalCoverages(WebDriver driver)  {
			BrowserActions.click(driver, btnAdditionalCoverages,"AdditionalCoverages");
			return this;
		}
		public LocationInformationPage clickQuestions(WebDriver driver)  {
			BrowserActions.click(driver, btnQuestions,"Questions");
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
		public LocationInformationPage clickAutoFillIcon(WebDriver driver)  {
			BrowserActions.click(driver, btnAutoFillIcon,"AutoFillIcon");
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
		public LocationInformationPage enterCity(WebDriver driver,String City) {
			BrowserActions.type(driver, inpCity,City, "City");
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
		@IFindBy(how = How.CSS, using = "#NewAdditionalInterestPagePopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactRoleDetailCardTab", AI = false)
		public WebElement btnContactDetail;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPagePopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-HomePhone-GlobalPhoneInputSet-PhoneDisplay']", AI = false)
		public WebElement inpHomePhone_2;

		@IFindBy(how = How.CSS, using = "#NewAdditionalInterestPagePopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-LinkedAddressInputSet-LinkAddressMenu-EditAddress>div[role='menuitem']", AI = false)
		public WebElement btnEditaddress;

		@IFindBy(how = How.CSS, using = "#NewAdditionalInterestPagePopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-LinkedAddressInputSet-LinkAddressMenu-LinkAddressMenuMenuIcon>div[role='button']", AI = false)
		public WebElement btnLinkAddressMenuMenuIcon;

		@IFindBy(how = How.CSS, using = "#NewAdditionalInterestPagePopup-__crumb__", AI = false)
		public WebElement btnReturntoDwelling;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPagePopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-GlobalPersonNameInputSet-LastName']", AI = false)
		public WebElement inpLastname;

		@IFindBy(how = How.CSS, using = "select[name='NewAdditionalInterestPagePopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-PrimaryPhone']", AI = false)
		public WebElement drpPrimaryPhone;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPagePopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressDescription']", AI = false)
		public WebElement inpAddressDescription;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPagePopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-County']", AI = false)
		public WebElement inpCounty;

		@IFindBy(how = How.CSS, using = "#NewAdditionalInterestPagePopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-PostalCode-AutoFillIcon", AI = false)
		public WebElement btnAutoFillIcon_8;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPagePopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-FaxPhone-GlobalPhoneInputSet-NationalSubscriberNumber']", AI = false)
		public WebElement inpFaxPhone;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPagePopup-ContactDetailScreen-AdditionalInterestInfoDV-ContractNumber']", AI = false)
		public WebElement inpContractNumber;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPagePopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-HomePhone-GlobalPhoneInputSet-NationalSubscriberNumber']", AI = false)
		public WebElement inpHomePhone;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPagePopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-EmailAddress2']", AI = false)
		public WebElement inpSecondaryEmail;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPagePopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-GlobalPersonNameInputSet-FirstName']", AI = false)
		public WebElement inpFirstname;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPagePopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-CellPhone-GlobalPhoneInputSet-NationalSubscriberNumber']", AI = false)
		public WebElement inpMobilePhone;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPagePopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine3']", AI = false)
		public WebElement inpAddress3;

		@IFindBy(how = How.CSS, using = "select[name='NewAdditionalInterestPagePopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-HomePhone-GlobalPhoneInputSet-CountryCode']", AI = false)
		public WebElement drpHomePhoneRegionCode;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPagePopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine1']", AI = false)
		public WebElement inpAddress1;

		@IFindBy(how = How.CSS, using = "select[name='NewAdditionalInterestPagePopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressType']", AI = false)
		public WebElement drpAddressType;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPagePopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine2']", AI = false)
		public WebElement inpAddress2;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPagePopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-OfficialIDInputSet-OfficialIDDV_Input']", AI = false)
		public WebElement inpSSN;

		@IFindBy(how = How.CSS, using = "#NewAdditionalInterestPagePopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-LinkedAddressInputSet-LinkAddressMenu-0-contactDetail>div[role='menuitem']", AI = false)
		public WebElement btnWenonaHaagPrimaryNamedInsured;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPagePopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-LinkedAddressInputSet-LinkAddressMenu']", AI = false)
		public WebElement inpAddress;

		@IFindBy(how = How.CSS, using = "select[name='NewAdditionalInterestPagePopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-ContactCurrency-ContactCurrencyInputSet-PreferredSettlementCurrency']", AI = false)
		public WebElement drpPreferredCurrency;

		@IFindBy(how = How.CSS, using = "#NewAdditionalInterestPagePopup-ContactDetailScreen-CheckForDuplicates>div[role='button']", AI = false)
		public WebElement btnCheckforDuplicates;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPagePopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-PostalCode']", AI = false)
		public WebElement inpZIPCode;

		@IFindBy(how = How.CSS, using = "#NewAdditionalInterestPagePopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-City-AutoFillIcon", AI = false)
		public WebElement btnAutoFillIcon;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPagePopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-WorkPhone-GlobalPhoneInputSet-Extension']", AI = false)
		public WebElement inpWorkPhoneExtension;

		@IFindBy(how = How.CSS, using = "select[name='NewAdditionalInterestPagePopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-FaxPhone-GlobalPhoneInputSet-CountryCode']", AI = false)
		public WebElement drpFaxPhoneRegionCode;

		@IFindBy(how = How.CSS, using = "select[name='NewAdditionalInterestPagePopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-CellPhone-GlobalPhoneInputSet-CountryCode']", AI = false)
		public WebElement drpMobilePhoneRegionCode;

		@IFindBy(how = How.CSS, using = "select[name='NewAdditionalInterestPagePopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-GlobalPersonNameInputSet-Prefix']", AI = false)
		public WebElement drpPrefix;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPagePopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-GlobalPersonNameInputSet-NameSummary']", AI = false)
		public WebElement inpName;

		@IFindBy(how = How.CSS, using = "select[name='NewAdditionalInterestPagePopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-Country']", AI = false)
		public WebElement drpCountry;

		@IFindBy(how = How.CSS, using = "select[name='NewAdditionalInterestPagePopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-GlobalPersonNameInputSet-Suffix']", AI = false)
		public WebElement drpSuffix;

		@IFindBy(how = How.CSS, using = "select[name='NewAdditionalInterestPagePopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-State']", AI = false)
		public WebElement drpState;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPagePopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-FaxPhone-GlobalPhoneInputSet-PhoneDisplay']", AI = false)
		public WebElement inpFaxPhone_5;

		@IFindBy(how = How.CSS, using = "#NewAdditionalInterestPagePopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-LinkedAddressInputSet-LinkAddressMenu-1-contactDetail-PrimaryAddress>div[role='menuitem']", AI = false)
		public WebElement btnPrimaryAddress_6;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPagePopup-ContactDetailScreen-AdditionalInterestInfoDV-CertRequired']", AI = false)
		public WebElement rdbCertificateRequired;

		@IFindBy(how = How.CSS, using = "select[name='NewAdditionalInterestPagePopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-MaritalStatus']", AI = false)
		public WebElement drpMaritalStatus;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPagePopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-HomePhone-GlobalPhoneInputSet-Extension']", AI = false)
		public WebElement inpHomePhoneExtension;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPagePopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-GlobalPersonNameInputSet-Particle']", AI = false)
		public WebElement inpParticle;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPagePopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-CellPhone-GlobalPhoneInputSet-Extension']", AI = false)
		public WebElement inpMobilePhoneExtension;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPagePopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-City']", AI = false)
		public WebElement inpCity;

		@IFindBy(how = How.CSS, using = "select[name='NewAdditionalInterestPagePopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-LicenseInputSet-LicenseState']", AI = false)
		public WebElement drpLicenseState;

		@IFindBy(how = How.CSS, using = "select[name='NewAdditionalInterestPagePopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-WorkPhone-GlobalPhoneInputSet-CountryCode']", AI = false)
		public WebElement drpWorkPhoneRegionCode;

		@IFindBy(how = How.CSS, using = "#NewAdditionalInterestPagePopup-ContactDetailScreen-ForceDupCheckUpdate>div[role='button']", AI = false)
		public WebElement btnOK;

		@IFindBy(how = How.CSS, using = "select[name$='AdditionalInterestInfoDV-Type']", AI = false)
		public WebElement drpInterestType;

		@IFindBy(how = How.CSS, using = "#NewAdditionalInterestPagePopup-ContactDetailScreen-Update>div[role='button']", AI = false)
		public WebElement btnOK_1;

		@IFindBy(how = How.CSS, using = "#NewAdditionalInterestPagePopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-LinkedAddressInputSet-LinkAddressMenu-1-contactDetail>div[role='menuitem']", AI = false)
		public WebElement btnNigelShieldsNamedInsured;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPagePopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-WorkPhone-GlobalPhoneInputSet-PhoneDisplay']", AI = false)
		public WebElement inpWorkPhone_3;

		@IFindBy(how = How.XPATH, using = "//div[contains(text(),'New Additional Interest')]", AI = false)
		public WebElement lblTtlBar;

		@IFindBy(how = How.CSS, using = "#NewAdditionalInterestPagePopup-ContactDetailScreen-Edit>div[role='button']", AI = false)
		public WebElement btnEdit;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPagePopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-EmailAddress1']", AI = false)
		public WebElement inpPrimaryEmail;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPagePopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-DateOfBirth']", AI = false)
		public WebElement inpDateofBirth;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPagePopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressSummary']", AI = false)
		public WebElement inpAddress_7;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPagePopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-GlobalPersonNameInputSet-MiddleName']", AI = false)
		public WebElement inpMiddlename;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPagePopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-CellPhone-GlobalPhoneInputSet-PhoneDisplay']", AI = false)
		public WebElement inpMobilePhone_4;

		@IFindBy(how = How.CSS, using = "#NewAdditionalInterestPagePopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-LinkedAddressInputSet-LinkAddressMenu-0-contactDetail-PrimaryAddress>div[role='menuitem']", AI = false)
		public WebElement btnPrimaryAddress;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPagePopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-LicenseInputSet-LicenseNumber']", AI = false)
		public WebElement inpLicense;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPagePopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-WorkPhone-GlobalPhoneInputSet-NationalSubscriberNumber']", AI = false)
		public WebElement inpWorkPhone;

		@IFindBy(how = How.CSS, using = "#NewAdditionalInterestPagePopup-ContactDetailScreen-Cancel>div[role='button']", AI = false)
		public WebElement btnCancel;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPagePopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-FaxPhone-GlobalPhoneInputSet-Extension']", AI = false)
		public WebElement inpFaxPhoneExtension;

		@IFindBy(how = How.CSS, using = "#NewAdditionalInterestPagePopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-DateOfBirth_dateIcon", AI = false)
		public WebElement btnDateofBirthDateIcon;

		public NewAdditionalInterestPage(){
		}

		public NewAdditionalInterestPage(WebDriver driver){
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
		public NewAdditionalInterestPage clickReturntoDwelling(WebDriver driver)  {
			BrowserActions.click(driver, btnReturntoDwelling,"ReturntoDwelling");
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
		public NewAdditionalInterestPage clickWenonaHaagPrimaryNamedInsured(WebDriver driver)  {
			BrowserActions.click(driver, btnWenonaHaagPrimaryNamedInsured,"WenonaHaagPrimaryNamedInsured");
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
			BrowserActions.selectDropDownByVisibleText(driver, drpState,State,"State");
			return this;
		}
		public NewAdditionalInterestPage enterFaxPhone_5(WebDriver driver,String FaxPhone_5) {
			BrowserActions.type(driver, inpFaxPhone_5,FaxPhone_5, "FaxPhone_5");
			return this;
		}
		public NewAdditionalInterestPage clickPrimaryAddress_6(WebDriver driver)  {
			BrowserActions.click(driver, btnPrimaryAddress_6,"PrimaryAddress_6");
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
		public NewAdditionalInterestPage clickNigelShieldsNamedInsured(WebDriver driver)  {
			BrowserActions.click(driver, btnNigelShieldsNamedInsured,"NigelShieldsNamedInsured");
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

	public class NewAdditionalInsuredPage extends LoadableComponent<NewAdditionalInsuredPage> {

		WebDriver driver;
		private boolean isPageLoaded;
		public ElementLayer elementLayer;
		String elementObject;
		HashMap<String, String> getPageObjects;
		public List<Object> pageFactoryKey = new ArrayList<Object>();
		public List<String> pageFactoryValue = new ArrayList<String>();

		//TopNavBar object
		@IFindBy(how = How.CSS, using = "#NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactRoleDetailCardTab", AI = false)
		public WebElement btnContactDetail;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-HomePhone-GlobalPhoneInputSet-PhoneDisplay']", AI = false)
		public WebElement inpHomePhone_2;

		@IFindBy(how = How.CSS, using = "#NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-LinkedAddressInputSet-LinkAddressMenu-EditAddress>div[role='menuitem']", AI = false)
		public WebElement btnEditaddress;

		@IFindBy(how = How.CSS, using = "#NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-LinkedAddressInputSet-LinkAddressMenu-LinkAddressMenuMenuIcon>div[role='button']", AI = false)
		public WebElement btnLinkAddressMenuMenuIcon;

		@IFindBy(how = How.CSS, using = "#NewAdditionalInsuredPopup-__crumb__", AI = false)
		public WebElement btnReturntoDwelling;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-GlobalPersonNameInputSet-LastName']", AI = false)
		public WebElement inpLastname;

		@IFindBy(how = How.CSS, using = "select[name='NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-PrimaryPhone']", AI = false)
		public WebElement drpPrimaryPhone;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressDescription']", AI = false)
		public WebElement inpAddressDescription;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-County']", AI = false)
		public WebElement inpCounty;

		@IFindBy(how = How.CSS, using = "#NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-PostalCode-AutoFillIcon", AI = false)
		public WebElement btnAutoFillIcon_8;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-FaxPhone-GlobalPhoneInputSet-NationalSubscriberNumber']", AI = false)
		public WebElement inpFaxPhone;

		@IFindBy(how = How.CSS, using = "select[name='NewAdditionalInsuredPopup-ContactDetailScreen-AdditionalInsuredInfoDV-Type']", AI = false)
		public WebElement drpType;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-HomePhone-GlobalPhoneInputSet-NationalSubscriberNumber']", AI = false)
		public WebElement inpHomePhone;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-EmailAddress2']", AI = false)
		public WebElement inpSecondaryEmail;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-GlobalPersonNameInputSet-FirstName']", AI = false)
		public WebElement inpFirstname;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-CellPhone-GlobalPhoneInputSet-NationalSubscriberNumber']", AI = false)
		public WebElement inpMobilePhone;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine3']", AI = false)
		public WebElement inpAddress3;

		@IFindBy(how = How.CSS, using = "select[name='NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-HomePhone-GlobalPhoneInputSet-CountryCode']", AI = false)
		public WebElement drpHomePhoneRegionCode;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine1']", AI = false)
		public WebElement inpAddress1;

		@IFindBy(how = How.CSS, using = "select[name='NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressType']", AI = false)
		public WebElement drpAddressType;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine2']", AI = false)
		public WebElement inpAddress2;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-OfficialIDInputSet-OfficialIDDV_Input']", AI = false)
		public WebElement inpSSN;

		@IFindBy(how = How.CSS, using = "#NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-LinkedAddressInputSet-LinkAddressMenu-0-contactDetail>div[role='menuitem']", AI = false)
		public WebElement btnWenonaHaagPrimaryNamedInsured;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-LinkedAddressInputSet-LinkAddressMenu']", AI = false)
		public WebElement inpAddress;

		@IFindBy(how = How.CSS, using = "select[name='NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-ContactCurrency-ContactCurrencyInputSet-PreferredSettlementCurrency']", AI = false)
		public WebElement drpPreferredCurrency;

		@IFindBy(how = How.CSS, using = "#NewAdditionalInsuredPopup-ContactDetailScreen-CheckForDuplicates>div[role='button']", AI = false)
		public WebElement btnCheckforDuplicates;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-PostalCode']", AI = false)
		public WebElement inpZIPCode;

		@IFindBy(how = How.CSS, using = "#NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-City-AutoFillIcon", AI = false)
		public WebElement btnAutoFillIcon;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-WorkPhone-GlobalPhoneInputSet-Extension']", AI = false)
		public WebElement inpWorkPhoneExtension;

		@IFindBy(how = How.CSS, using = "select[name='NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-FaxPhone-GlobalPhoneInputSet-CountryCode']", AI = false)
		public WebElement drpFaxPhoneRegionCode;

		@IFindBy(how = How.CSS, using = "select[name='NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-CellPhone-GlobalPhoneInputSet-CountryCode']", AI = false)
		public WebElement drpMobilePhoneRegionCode;

		@IFindBy(how = How.CSS, using = "select[name='NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-GlobalPersonNameInputSet-Prefix']", AI = false)
		public WebElement drpPrefix;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-GlobalPersonNameInputSet-NameSummary']", AI = false)
		public WebElement inpName;

		@IFindBy(how = How.CSS, using = "select[name='NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-Country']", AI = false)
		public WebElement drpCountry;

		@IFindBy(how = How.CSS, using = "select[name='NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-GlobalPersonNameInputSet-Suffix']", AI = false)
		public WebElement drpSuffix;

		@IFindBy(how = How.CSS, using = "select[name='NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-State']", AI = false)
		public WebElement drpState;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-FaxPhone-GlobalPhoneInputSet-PhoneDisplay']", AI = false)
		public WebElement inpFaxPhone_5;

		@IFindBy(how = How.CSS, using = "#NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-LinkedAddressInputSet-LinkAddressMenu-1-contactDetail-PrimaryAddress>div[role='menuitem']", AI = false)
		public WebElement btnPrimaryAddress_6;

		@IFindBy(how = How.CSS, using = "select[name='NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-MaritalStatus']", AI = false)
		public WebElement drpMaritalStatus;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-HomePhone-GlobalPhoneInputSet-Extension']", AI = false)
		public WebElement inpHomePhoneExtension;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-GlobalPersonNameInputSet-Particle']", AI = false)
		public WebElement inpParticle;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-CellPhone-GlobalPhoneInputSet-Extension']", AI = false)
		public WebElement inpMobilePhoneExtension;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-City']", AI = false)
		public WebElement inpCity;

		@IFindBy(how = How.CSS, using = "select[name='NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-LicenseInputSet-LicenseState']", AI = false)
		public WebElement drpLicenseState;

		@IFindBy(how = How.CSS, using = "select[name='NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-WorkPhone-GlobalPhoneInputSet-CountryCode']", AI = false)
		public WebElement drpWorkPhoneRegionCode;

		@IFindBy(how = How.CSS, using = "#NewAdditionalInsuredPopup-ContactDetailScreen-ForceDupCheckUpdate>div[role='button']", AI = false)
		public WebElement btnOK;

		@IFindBy(how = How.CSS, using = "#NewAdditionalInsuredPopup-ContactDetailScreen-Update>div[role='button']", AI = false)
		public WebElement btnOK_1;

		@IFindBy(how = How.CSS, using = "#NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-LinkedAddressInputSet-LinkAddressMenu-1-contactDetail>div[role='menuitem']", AI = false)
		public WebElement btnNigelShieldsNamedInsured;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-WorkPhone-GlobalPhoneInputSet-PhoneDisplay']", AI = false)
		public WebElement inpWorkPhone_3;

		@IFindBy(how = How.ID, using = "NewAdditionalInsuredPopup-ContactDetailScreen-ttlBar", AI = false)
		public WebElement lblTtlBar;

		@IFindBy(how = How.CSS, using = "#NewAdditionalInsuredPopup-ContactDetailScreen-Edit>div[role='button']", AI = false)
		public WebElement btnEdit;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-EmailAddress1']", AI = false)
		public WebElement inpPrimaryEmail;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-DateOfBirth']", AI = false)
		public WebElement inpDateofBirth;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressSummary']", AI = false)
		public WebElement inpAddress_7;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-GlobalPersonNameInputSet-MiddleName']", AI = false)
		public WebElement inpMiddlename;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-CellPhone-GlobalPhoneInputSet-PhoneDisplay']", AI = false)
		public WebElement inpMobilePhone_4;

		@IFindBy(how = How.CSS, using = "#NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-LinkedAddressInputSet-LinkAddressMenu-0-contactDetail-PrimaryAddress>div[role='menuitem']", AI = false)
		public WebElement btnPrimaryAddress;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-LicenseInputSet-LicenseNumber']", AI = false)
		public WebElement inpLicense;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-WorkPhone-GlobalPhoneInputSet-NationalSubscriberNumber']", AI = false)
		public WebElement inpWorkPhone;

		@IFindBy(how = How.CSS, using = "#NewAdditionalInsuredPopup-ContactDetailScreen-Cancel>div[role='button']", AI = false)
		public WebElement btnCancel;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-FaxPhone-GlobalPhoneInputSet-Extension']", AI = false)
		public WebElement inpFaxPhoneExtension;

		@IFindBy(how = How.CSS, using = "#NewAdditionalInsuredPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-DateOfBirth_dateIcon", AI = false)
		public WebElement btnDateofBirthDateIcon;

		public NewAdditionalInsuredPage(){
		}

		public NewAdditionalInsuredPage(WebDriver driver){
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
		}public NewAdditionalInsuredPage clickContactDetail(WebDriver driver)  {
			BrowserActions.click(driver, btnContactDetail,"ContactDetail");
			return this;
		}
		public NewAdditionalInsuredPage enterHomePhone_2(WebDriver driver,String HomePhone_2) {
			BrowserActions.type(driver, inpHomePhone_2,HomePhone_2, "HomePhone_2");
			return this;
		}
		public NewAdditionalInsuredPage clickEditaddress(WebDriver driver)  {
			BrowserActions.click(driver, btnEditaddress,"Editaddress");
			return this;
		}
		public NewAdditionalInsuredPage clickLinkAddressMenuMenuIcon(WebDriver driver)  {
			BrowserActions.click(driver, btnLinkAddressMenuMenuIcon,"LinkAddressMenuMenuIcon");
			return this;
		}
		public NewAdditionalInsuredPage clickReturntoDwelling(WebDriver driver)  {
			BrowserActions.click(driver, btnReturntoDwelling,"ReturntoDwelling");
			return this;
		}
		public NewAdditionalInsuredPage enterLastname(WebDriver driver,String Lastname) {
			BrowserActions.type(driver, inpLastname,Lastname, "Lastname");
			return this;
		}
		public NewAdditionalInsuredPage selectPrimaryPhone(WebDriver driver,String PrimaryPhone)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpPrimaryPhone,PrimaryPhone,"PrimaryPhone");
			return this;
		}
		public NewAdditionalInsuredPage enterAddressDescription(WebDriver driver,String AddressDescription) {
			BrowserActions.type(driver, inpAddressDescription,AddressDescription, "AddressDescription");
			return this;
		}
		public NewAdditionalInsuredPage enterCounty(WebDriver driver,String County) {
			BrowserActions.type(driver, inpCounty,County, "County");
			return this;
		}
		public NewAdditionalInsuredPage clickAutoFillIcon_8(WebDriver driver)  {
			BrowserActions.click(driver, btnAutoFillIcon_8,"AutoFillIcon_8");
			return this;
		}
		public NewAdditionalInsuredPage enterFaxPhone(WebDriver driver,String FaxPhone) {
			BrowserActions.type(driver, inpFaxPhone,FaxPhone, "FaxPhone");
			return this;
		}
		public NewAdditionalInsuredPage selectType(WebDriver driver,String Type)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpType,Type,"Type");
			return this;
		}
		public NewAdditionalInsuredPage enterHomePhone(WebDriver driver,String HomePhone) {
			BrowserActions.type(driver, inpHomePhone,HomePhone, "HomePhone");
			return this;
		}
		public NewAdditionalInsuredPage enterSecondaryEmail(WebDriver driver,String SecondaryEmail) {
			BrowserActions.type(driver, inpSecondaryEmail,SecondaryEmail, "SecondaryEmail");
			return this;
		}
		public NewAdditionalInsuredPage enterFirstname(WebDriver driver,String Firstname) {
			BrowserActions.type(driver, inpFirstname,Firstname, "Firstname");
			return this;
		}
		public NewAdditionalInsuredPage enterMobilePhone(WebDriver driver,String MobilePhone) {
			BrowserActions.type(driver, inpMobilePhone,MobilePhone, "MobilePhone");
			return this;
		}
		public NewAdditionalInsuredPage enterAddress3(WebDriver driver,String Address3) {
			BrowserActions.type(driver, inpAddress3,Address3, "Address3");
			return this;
		}
		public NewAdditionalInsuredPage selectHomePhoneRegionCode(WebDriver driver,String HomePhoneRegionCode)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpHomePhoneRegionCode,HomePhoneRegionCode,"HomePhoneRegionCode");
			return this;
		}
		public NewAdditionalInsuredPage enterAddress1(WebDriver driver,String Address1) {
			BrowserActions.type(driver, inpAddress1,Address1, "Address1");
			return this;
		}
		public NewAdditionalInsuredPage selectAddressType(WebDriver driver,String AddressType)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpAddressType,AddressType,"AddressType");
			return this;
		}
		public NewAdditionalInsuredPage enterAddress2(WebDriver driver,String Address2) {
			BrowserActions.type(driver, inpAddress2,Address2, "Address2");
			return this;
		}
		public NewAdditionalInsuredPage enterSSN(WebDriver driver,String SSN) {
			BrowserActions.type(driver, inpSSN,SSN, "SSN");
			return this;
		}
		public NewAdditionalInsuredPage clickWenonaHaagPrimaryNamedInsured(WebDriver driver)  {
			BrowserActions.click(driver, btnWenonaHaagPrimaryNamedInsured,"WenonaHaagPrimaryNamedInsured");
			return this;
		}
		public NewAdditionalInsuredPage enterAddress(WebDriver driver,String Address) {
			BrowserActions.type(driver, inpAddress,Address, "Address");
			return this;
		}
		public NewAdditionalInsuredPage selectPreferredCurrency(WebDriver driver,String PreferredCurrency)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpPreferredCurrency,PreferredCurrency,"PreferredCurrency");
			return this;
		}
		public NewAdditionalInsuredPage clickCheckforDuplicates(WebDriver driver)  {
			BrowserActions.click(driver, btnCheckforDuplicates,"CheckforDuplicates");
			return this;
		}
		public NewAdditionalInsuredPage enterZIPCode(WebDriver driver,String ZIPCode) {
			BrowserActions.type(driver, inpZIPCode,ZIPCode, "ZIPCode");
			return this;
		}
		public NewAdditionalInsuredPage clickAutoFillIcon(WebDriver driver)  {
			BrowserActions.click(driver, btnAutoFillIcon,"AutoFillIcon");
			return this;
		}
		public NewAdditionalInsuredPage enterWorkPhoneExtension(WebDriver driver,String WorkPhoneExtension) {
			BrowserActions.type(driver, inpWorkPhoneExtension,WorkPhoneExtension, "WorkPhoneExtension");
			return this;
		}
		public NewAdditionalInsuredPage selectFaxPhoneRegionCode(WebDriver driver,String FaxPhoneRegionCode)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpFaxPhoneRegionCode,FaxPhoneRegionCode,"FaxPhoneRegionCode");
			return this;
		}
		public NewAdditionalInsuredPage selectMobilePhoneRegionCode(WebDriver driver,String MobilePhoneRegionCode)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpMobilePhoneRegionCode,MobilePhoneRegionCode,"MobilePhoneRegionCode");
			return this;
		}
		public NewAdditionalInsuredPage selectPrefix(WebDriver driver,String Prefix)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpPrefix,Prefix,"Prefix");
			return this;
		}
		public NewAdditionalInsuredPage enterName(WebDriver driver,String Name) {
			BrowserActions.type(driver, inpName,Name, "Name");
			return this;
		}
		public NewAdditionalInsuredPage selectCountry(WebDriver driver,String Country)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpCountry,Country,"Country");
			return this;
		}
		public NewAdditionalInsuredPage selectSuffix(WebDriver driver,String Suffix)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpSuffix,Suffix,"Suffix");
			return this;
		}
		public NewAdditionalInsuredPage selectState(WebDriver driver,String State)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpState,State,"State");
			return this;
		}
		public NewAdditionalInsuredPage enterFaxPhone_5(WebDriver driver,String FaxPhone_5) {
			BrowserActions.type(driver, inpFaxPhone_5,FaxPhone_5, "FaxPhone_5");
			return this;
		}
		public NewAdditionalInsuredPage clickPrimaryAddress_6(WebDriver driver)  {
			BrowserActions.click(driver, btnPrimaryAddress_6,"PrimaryAddress_6");
			return this;
		}
		public NewAdditionalInsuredPage selectMaritalStatus(WebDriver driver,String MaritalStatus)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpMaritalStatus,MaritalStatus,"MaritalStatus");
			return this;
		}
		public NewAdditionalInsuredPage enterHomePhoneExtension(WebDriver driver,String HomePhoneExtension) {
			BrowserActions.type(driver, inpHomePhoneExtension,HomePhoneExtension, "HomePhoneExtension");
			return this;
		}
		public NewAdditionalInsuredPage enterParticle(WebDriver driver,String Particle) {
			BrowserActions.type(driver, inpParticle,Particle, "Particle");
			return this;
		}
		public NewAdditionalInsuredPage enterMobilePhoneExtension(WebDriver driver,String MobilePhoneExtension) {
			BrowserActions.type(driver, inpMobilePhoneExtension,MobilePhoneExtension, "MobilePhoneExtension");
			return this;
		}
		public NewAdditionalInsuredPage enterCity(WebDriver driver,String City) {
			BrowserActions.type(driver, inpCity,City, "City");
			return this;
		}
		public NewAdditionalInsuredPage selectLicenseState(WebDriver driver,String LicenseState)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpLicenseState,LicenseState,"LicenseState");
			return this;
		}
		public NewAdditionalInsuredPage selectWorkPhoneRegionCode(WebDriver driver,String WorkPhoneRegionCode)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpWorkPhoneRegionCode,WorkPhoneRegionCode,"WorkPhoneRegionCode");
			return this;
		}
		public NewAdditionalInsuredPage clickOK(WebDriver driver)  {
			BrowserActions.click(driver, btnOK,"OK");
			return this;
		}
		public NewAdditionalInsuredPage clickOK_1(WebDriver driver)  {
			BrowserActions.click(driver, btnOK_1,"OK_1");
			return this;
		}
		public NewAdditionalInsuredPage clickNigelShieldsNamedInsured(WebDriver driver)  {
			BrowserActions.click(driver, btnNigelShieldsNamedInsured,"NigelShieldsNamedInsured");
			return this;
		}
		public NewAdditionalInsuredPage enterWorkPhone_3(WebDriver driver,String WorkPhone_3) {
			BrowserActions.type(driver, inpWorkPhone_3,WorkPhone_3, "WorkPhone_3");
			return this;
		}
		public NewAdditionalInsuredPage clickEdit(WebDriver driver)  {
			BrowserActions.click(driver, btnEdit,"Edit");
			return this;
		}
		public NewAdditionalInsuredPage enterPrimaryEmail(WebDriver driver,String PrimaryEmail) {
			BrowserActions.type(driver, inpPrimaryEmail,PrimaryEmail, "PrimaryEmail");
			return this;
		}
		public NewAdditionalInsuredPage enterDateofBirth(WebDriver driver,String DateofBirth) {
			BrowserActions.type(driver, inpDateofBirth,DateofBirth, "DateofBirth");
			return this;
		}
		public NewAdditionalInsuredPage enterAddress_7(WebDriver driver,String Address_7) {
			BrowserActions.type(driver, inpAddress_7,Address_7, "Address_7");
			return this;
		}
		public NewAdditionalInsuredPage enterMiddlename(WebDriver driver,String Middlename) {
			BrowserActions.type(driver, inpMiddlename,Middlename, "Middlename");
			return this;
		}
		public NewAdditionalInsuredPage enterMobilePhone_4(WebDriver driver,String MobilePhone_4) {
			BrowserActions.type(driver, inpMobilePhone_4,MobilePhone_4, "MobilePhone_4");
			return this;
		}
		public NewAdditionalInsuredPage clickPrimaryAddress(WebDriver driver)  {
			BrowserActions.click(driver, btnPrimaryAddress,"PrimaryAddress");
			return this;
		}
		public NewAdditionalInsuredPage enterLicense(WebDriver driver,String License) {
			BrowserActions.type(driver, inpLicense,License, "License");
			return this;
		}
		public NewAdditionalInsuredPage enterWorkPhone(WebDriver driver,String WorkPhone) {
			BrowserActions.type(driver, inpWorkPhone,WorkPhone, "WorkPhone");
			return this;
		}
		public NewAdditionalInsuredPage clickCancel(WebDriver driver)  {
			BrowserActions.click(driver, btnCancel,"Cancel");
			return this;
		}
		public NewAdditionalInsuredPage enterFaxPhoneExtension(WebDriver driver,String FaxPhoneExtension) {
			BrowserActions.type(driver, inpFaxPhoneExtension,FaxPhoneExtension, "FaxPhoneExtension");
			return this;
		}
		public NewAdditionalInsuredPage clickDateofBirthDateIcon(WebDriver driver)  {
			BrowserActions.click(driver, btnDateofBirthDateIcon,"DateofBirthDateIcon");
			return this;
		}

	}

}