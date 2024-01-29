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
import com.aspire.guidewire.utils.Utils;
import com.aspire.guidewire.utils.WaitUtils;

import ASPIREAI.customfactories.AjaxElementLocatorFactory;
import ASPIREAI.customfactories.IFindBy;
import ASPIREAI.customfactories.PageFactory;

public class BuildingsPage extends LoadableComponent<BuildingsPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPBuildingsScreen-BOPBuildingsCV-BOPLocationBuildingsPanelSet-BOPBuilding_DetailsDV-BuildingAlarmType']", AI = false)
	public WebElement drpAlarmType;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Workplan>div[role='menuitem']", AI = false)
	public WebElement btnWorkplan;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_CopySubmission>div[role='menuitem']", AI = false)
	public WebElement btnCopySubmission;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-4-item>div[role='menuitem']", AI = false)
	public WebElement btnGeneralreminderdiary;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPBuildingsScreen-BOPBuildingsCV-BOPLocationBuildingsPanelSet-AdditionalInterestDetailsDV-AdditionalInterestLV_tb-AddContactsButton-AddFromSearch>div[role='button']", AI = false)
	public WebElement btnFromAddressBook;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-8-item>div[role='menuitem']", AI = false)
	public WebElement btnGetReinsuranceQuote;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-13-item>div[role='menuitem']", AI = false)
	public WebElement btnReview45dayUWPeriod;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPBuildingsScreen-JobWizardToolbarButtonSet-BindOptions-BindOnly>div[role='menuitem']", AI = false)
	public WebElement btnBindOnly;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-0-NewActivityMenuItemSet_Category>div[role='menuitem']", AI = false)
	public WebElement btnInterview;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPBuildingsScreen-BOPBuildingsCV-BOPLocationBuildingsPanelSet-BOPBuilding_DetailsDV-NumBasements']", AI = false)
	public WebElement inpOfBasements;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-6-item>div[role='menuitem']", AI = false)
	public WebElement btnPerformanceReview;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPBuildingsScreen-JobWizardToolbarButtonSet-Versions-NewVersion>div[role='menuitem']", AI = false)
	public WebElement btnStartMultiVersion;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-15-item>div[role='menuitem']", AI = false)
	public WebElement btnReviewProducer;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPBuildingsScreen-BOPBuildingsCV-BOPLocationBuildingsPanelSet-BOPBuilding_DetailsDV-BasisType']", AI = false)
	public WebElement inpPremiumBasisType;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-8-item>div[role='menuitem']", AI = false)
	public WebElement btnPolicyReviewMidterm;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPBuildingsScreen-BOPBuildingsCV-BOPLocationBuildingsPanelSet-AdditionalInterestDetailsDV-AdditionalInterestLV_tb-Remove>div[role='button']", AI = false)
	public WebElement btnRemove_5;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPBuildingsScreen-JobWizardToolbarButtonSet-Versions-ViewSideBySide>div[role='menuitem']", AI = false)
	public WebElement btnViewSideBySideVersions;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPBuildingsScreen-BOPBuildingsCV-BOPLocationBuildingsPanelSet-BOPLocationsLV-0-LocNum']", AI = false)
	public WebElement inpLoc;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-JobGroupItem>div[role='menuitem']", AI = false)
	public WebElement btnSG00123362603667786193;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-BillingInfo>div[role='menuitem']", AI = false)
	public WebElement btnPayment;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Change-WizardMenuActions_ChangeEffDate>div[role='menuitem']", AI = false)
	public WebElement btnEffectiveDate;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPBuildingsScreen-BOPBuildingsCV-BOPLocationBuildingsPanelSet-BOPBuilding_DetailsDV-Number']", AI = false)
	public WebElement inpBuildingNumber;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPBuildingsScreen-BOPBuildingsCV-BOPLocationBuildingsPanelSet-BOPBuilding_DetailsDV-RearExposure']", AI = false)
	public WebElement inpRearExposure;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPBuildingsScreen-BOPBuildingsCV-BOPLocationBuildingsPanelSet-BOPBuilding_DetailsDV-LeftExposure']", AI = false)
	public WebElement inpLeftExposure;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPBuildingsScreen-BOPBuildingsCV-BOPLocationBuildingsPanelSet-PreferredCoverageCurrencySelectorRef-PreferredCoverageCurrencyPanelSet-CoverageCurrencyDisplay']", AI = false)
	public WebElement inpCoveragesin_1;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPBuildingsScreen-BOPBuildingsCV-BOPLocationBuildingsPanelSet-BOPBuilding_DetailsDV-LastUpdateHeating']", AI = false)
	public WebElement inpYearofLastUpdateHeating;

	@IFindBy(how = How.CSS, using = "input[name$='BasisAmount']", AI = false)
	public WebElement inpPremiumBasisAmount;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPBuildingsScreen-OOSEPanelSet-NextSliceLink", AI = false)
	public WebElement btnNextBlockedDate;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-2-item>div[role='menuitem']", AI = false)
	public WebElement btn90daydiary;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPBuildingsScreen-JobWizardToolbarButtonSet-BindOptions>div[role='button']", AI = false)
	public WebElement btnBindOptions;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPBuildingsScreen-BOPBuildingsCV-BOPLocationBuildingsPanelSet-BuildingCardTab", AI = false)
	public WebElement btnBuildings;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Archiving-WizardMenuActions_SuspendResumeArchiving>div[role='menuitem']", AI = false)
	public WebElement btnEnableDisable;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPBuildingsScreen-JobWizardToolbarButtonSet-BindOptions-BindAndIssue>div[role='menuitem']", AI = false)
	public WebElement btnIssuePolicy;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPBuildingsScreen-BOPBuildingsCV-BOPLocationBuildingsPanelSet-BOPBuilding_DetailsDV-PercentSprinklered']", AI = false)
	public WebElement drpSprinklered;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-MultiQuoteAcceleratedMenuActions-PolicyPeriodSelector", AI = false)
	public WebElement btnPolicyPeriodSelector;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-1-NewActivityMenuItemSet_Category>div[role='menuitem']", AI = false)
	public WebElement btnNewmail;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-7-item>div[role='menuitem']", AI = false)
	public WebElement btnGetMotorVehicleReports;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-PreQualification>div[role='menuitem']", AI = false)
	public WebElement btnQualification;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPBuildingsScreen-BOPBuildingsCV-BOPLocationBuildingsPanelSet-BOPLocationsLV-0-LocationName']", AI = false)
	public WebElement inpLocationName;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPBuildingsScreen-BOPBuildingsCV-BOPLocationBuildingsPanelSet-BOPBuilding_DetailsDV-AlarmCertification']", AI = false)
	public WebElement drpAlarmCertification;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Participants>div[role='menuitem']", AI = false)
	public WebElement btnParticipants;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-0-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnBOP0012415250;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-4-NewActivityMenuItemSet_Category-0-item>div[role='menuitem']", AI = false)
	public WebElement btnReviewandapprove;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPBuildingsScreen-OOSEPanelSet-OOSEPeriodSelector-OOSEPeriodSelector_Arg']", AI = false)
	public WebElement drpEffectiveDate;

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

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPBuildingsScreen-BOPBuildingsCV-BOPLocationBuildingsPanelSet-BOPBuilding_DetailsDV-BasementInputSet-AreaFinished']", AI = false)
	public WebElement inpBasementFinishedSqFt;

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

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPBuildingsScreen-BOPBuildingsCV-BOPLocationBuildingsPanelSet-BOPBuilding_DetailsDV-ConstructionType']", AI = false)
	public WebElement drpConstructionType;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-BOPSupplemental>div[role='menuitem']", AI = false)
	public WebElement btnSupplemental;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPBuildingsScreen-BOPBuildingsCV-BOPLocationBuildingsPanelSet-BOPBuilding_DetailsDV-LocationInfo']", AI = false)
	public WebElement inpLocation;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-PolicyReview>div[role='menuitem']", AI = false)
	public WebElement btnPolicyReview;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPBuildingsScreen-OOSEPanelSet-OOSEPeriodSelector", AI = false)
	public WebElement btnOOSEPeriodSelector;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-11-item>div[role='menuitem']", AI = false)
	public WebElement btnManuallyrateandquotepolicy;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-History>div[role='menuitem']", AI = false)
	public WebElement btnHistory;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Change>div[role='menuitem']", AI = false)
	public WebElement btnEdit;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPBuildingsScreen-JobWizardToolbarButtonSet-CloseOptions-WithdrawJob>div[role='menuitem']", AI = false)
	public WebElement btnWithdrawTransaction;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-PolicyInfo>div[role='menuitem']", AI = false)
	public WebElement btnPolicyInfo;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPBuildingsScreen-JobWizardToolbarButtonSet-Versions>div[role='button']", AI = false)
	public WebElement btnVersions;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPBuildingsScreen-BOPBuildingsCV-BOPLocationBuildingsPanelSet-BOPBuilding_DetailsDV-NumStories']", AI = false)
	public WebElement inpOfStories;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-Modifiers>div[role='menuitem']", AI = false)
	public WebElement btnModifiers;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_ToAccountFile>div[role='menuitem']", AI = false)
	public WebElement btnAccountFile;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPBuildingsScreen-BOPBuildingsCV-BOPLocationBuildingsPanelSet-BOPLocationBuildingsLV_tb-Remove>div[role='button']", AI = false)
	public WebElement btnRemove;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPBuildingsScreen-BOPBuildingsCV-BOPLocationBuildingsPanelSet-BOPBuilding_DetailsDV-AlarmCertificate']", AI = false)
	public WebElement inpAlarmCertificate;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Change-WizardMenuActions_CopyPolicyData>div[role='menuitem']", AI = false)
	public WebElement btnCopyData;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPBuildingsScreen-QuoteRequestedAlert-CloseBtn", AI = false)
	public WebElement btnClose;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPBuildingsScreen-BOPBuildingsCV-BOPLocationBuildingsPanelSet-AdditionalInterestDetailsDV-AdditionalInterestLV_tb-AddContactsButton>div[role='button']", AI = false)
	public WebElement btnAdd_4;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-14-item>div[role='menuitem']", AI = false)
	public WebElement btnReview60dayUWPeriod;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPBuildingsScreen-JobWizardToolbarButtonSet-EditPolicy>div[role='button']", AI = false)
	public WebElement btnEditPolicyTransaction;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity>div[role='menuitem']", AI = false)
	public WebElement btnNewActivity;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Cancel>div[role='button']", AI = false)
	public WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup>div[role='menuitem']", AI = false)
	public WebElement btnPolicyContract;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPBuildingsScreen-BOPBuildingsCV-BOPLocationBuildingsPanelSet-BOPBuilding_DetailsDV-RightExposure']", AI = false)
	public WebElement inpRightExposure;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category>div[role='menuitem']", AI = false)
	public WebElement btnRequest;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPBuildingsScreen-BOPBuildingsCV-BOPLocationBuildingsPanelSet-AdditionalInterestDetailsDV-AdditionalInterestLV_tb-AddContactsButton-AddExistingContact>div[role='button']", AI = false)
	public WebElement btnExistingAdditionalInterest;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPBuildingsScreen-BOPBuildingsCV-BOPLocationBuildingsPanelSet-BOPBuilding_DetailsDV-TotalArea']", AI = false)
	public WebElement inpTotalArea;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-9-item>div[role='menuitem']", AI = false)
	public WebElement btnGetRiskInformationProducer;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPBuildingsScreen-BOPBuildingsCV-BOPLocationBuildingsPanelSet-BOPBuilding_DetailsDV-LastUpdatePlumbing']", AI = false)
	public WebElement inpYearofLastUpdatePlumbing;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPBuildingsScreen-BOPBuildingsCV-BOPLocationBuildingsPanelSet-BOPBuilding_DetailsDV-BOPBuildingClassCodeRange']", AI = false)
	public WebElement drpBuildingClassCode;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPBuildingsScreen-BOPBuildingsCV-BOPLocationBuildingsPanelSet-BOPBuilding_DetailsDV-YearBuilt']", AI = false)
	public WebElement inpYearBuilt;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-1-item>div[role='menuitem']", AI = false)
	public WebElement btnGetAuditInternalPersonnel;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPBuildingsScreen-BOPBuildingsCV-BOPLocationBuildingsPanelSet-BOPBuilding_AdditionalCoveragesCardTab", AI = false)
	public WebElement btnAdditionalCoverages_3;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-MultiQuoteAcceleratedMenuActions-PolicyPeriodSelector-PolicyPeriodSelector_Arg']", AI = false)
	public WebElement drpPolicyPeriodSelector_Arg;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-PolicyVersions>div[role='menuitem']", AI = false)
	public WebElement btnPolicyVersions_9;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-DiagWorksheetItem-ShowDiagWorksheet>div[role='menuitem']", AI = false)
	public WebElement btnShowPartialWorksheet;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-1-item>div[role='menuitem']", AI = false)
	public WebElement btn60daydiary;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Prev>div[role='button']", AI = false)
	public WebElement btnBack;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-Locations>div[role='menuitem']", AI = false)
	public WebElement btnLocations;

	@IFindBy(how = How.CSS, using = "div[id$='Next']", AI = false)
	public WebElement btnNext;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-10-item>div[role='menuitem']", AI = false)
	public WebElement btnQuoteRequired;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPBuildingsScreen-BOPBuildingsCV-BOPLocationBuildingsPanelSet-BOPBuilding_DetailsDV-LastUpdateWiring']", AI = false)
	public WebElement inpYearofLastUpdateWiring;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPBuildingsScreen-BOPBuildingsCV-BOPLocationBuildingsPanelSet-BOPBuilding_AdditionalCoveragesCardTab", AI = false)
	public WebElement btnAdditionalCoverages;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPBuildingsScreen-JobWizardToolbarButtonSet-Draft>div[role='button']", AI = false)
	public WebElement btnSaveDraft;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPBuildingsScreen-BOPBuildingsCV-BOPLocationBuildingsPanelSet-BOPBuilding_DetailsDV-InterestType']", AI = false)
	public WebElement drpInterest;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-3-item>div[role='menuitem']", AI = false)
	public WebElement btnGetBureauData;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPBuildingsScreen-BOPBuildingsCV-IncludedCoveragesCardTab", AI = false)
	public WebElement btnIncludedCoverages;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Reinsurance>div[role='menuitem']", AI = false)
	public WebElement btnReinsurance;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPBuildingsScreen-QuoteRequestedAlert .gw-AlertBar--label", AI = false)
	public WebElement lblQuoteRequestedAlert;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPBuildingsScreen-BOPBuildingsCV-BOPLocationBuildingsPanelSet-BOPBuilding_DetailsDV-BasementInputSet-AreaUnfinished']", AI = false)
	public WebElement inpBasementUnfinishedSqFt;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewDocument-NewJobDocumentMenuItemSet-PolicyPeriodNewDocumentMenuItemSet_Template>div[role='menuitem']", AI = false)
	public WebElement btnCreatefromatemplate;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPBuildingsScreen-JobWizardToolbarButtonSet-Versions-SideBySide>div[role='menuitem']", AI = false)
	public WebElement btnStartSidebySide;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPBuildingsScreen-BOPBuildingsCV-BOPLocationBuildingsPanelSet-BOPLocationsLV-0-Address']", AI = false)
	public WebElement inpAddress;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Archiving>div[role='menuitem']", AI = false)
	public WebElement btnArchiving;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPBuildingsScreen-JobWizardToolbarButtonSet-CloseOptions-NotTakenJob>div[role='menuitem']", AI = false)
	public WebElement btnNotTaken;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Documents>div[role='menuitem']", AI = false)
	public WebElement btnDocuments;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPBuildingsScreen-BOPBuildingsCV-BOPLocationBuildingsPanelSet-PreferredCoverageCurrencySelectorRef-PreferredCoverageCurrencyPanelSet-PreferredCoverageCurrencySelectorDropDown']", AI = false)
	public WebElement drpCoveragesin;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-RiskEvaluation>div[role='menuitem']", AI = false)
	public WebElement btnRiskAnalysis_10;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPBuildingsScreen-BOPBuildingsCV-BOPLocationBuildingsPanelSet-AdditionalInterestDetailsDV-AdditionalInterestLV_tb-AddContactsButton-AddOtherContact>div[role='button']", AI = false)
	public WebElement btnOtherContacts;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPBuildingsScreen-JobWizardToolbarButtonSet-QuoteTypeToolbarButtonSet-Quote>div[role='button']", AI = false)
	public WebElement btnQuote;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPBuildingsScreen-JobWizardToolbarButtonSet-Unlock>div[role='button']", AI = false)
	public WebElement btnReleaseLock;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPBuildingsScreen-BOPBuildingsCV-BOPLocationBuildingsPanelSet-BOPBuilding_DetailsCardTab", AI = false)
	public WebElement btnDetails_2;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-0-item>div[role='menuitem']", AI = false)
	public WebElement btnCreateNewProducer;

	@IFindBy(how = How.CSS, using = "div[id$='BOPLocationBuildingsLV_tb-Add']", AI = false)
	public WebElement btnAdd;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPBuildingsScreen-BOPBuildingsCV-BOPLocationBuildingsPanelSet-BOPBuilding_DetailsDV-PercentOccupied']", AI = false)
	public WebElement drpPercentOccupied;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Forms>div[role='menuitem']", AI = false)
	public WebElement btnForms;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Notes>div[role='menuitem']", AI = false)
	public WebElement btnNotes;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-5-item>div[role='menuitem']", AI = false)
	public WebElement btnGetInspectionLossControl;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPBuildingsScreen-BOPBuildingsCV-BOPLocationBuildingsPanelSet-BOPBuilding_DetailsDV-AlarmExpiration']", AI = false)
	public WebElement inpAlarmExpiration;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-ViewMultiLineQuote>div[role='menuitem']", AI = false)
	public WebElement btnQuote_8;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create>div[role='menuitem']", AI = false)
	public WebElement btnCreate;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-ViewQuote>div[role='menuitem']", AI = false)
	public WebElement btnQuote_7;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPBuildingsScreen-BOPBuildingsCV-BOPLocationBuildingsPanelSet-BOPBuilding_DetailsDV-Description']", AI = false)
	public WebElement inpDescription;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-10-item>div[role='menuitem']", AI = false)
	public WebElement btnLegalreview;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-7-item>div[role='menuitem']", AI = false)
	public WebElement btnPolicynotification;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPBuildingsScreen-BOPBuildingsCV-BOPLocationBuildingsPanelSet-BOPBuilding_DetailsDV-AlarmGrade']", AI = false)
	public WebElement drpAlarmGrade;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto>div[role='menuitem']", AI = false)
	public WebElement btnGoto;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-4-NewActivityMenuItemSet_Category>div[role='menuitem']", AI = false)
	public WebElement btnUnderwriterReview;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-0-item>div[role='menuitem']", AI = false)
	public WebElement btn30daydiary;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-SideBySide>div[role='menuitem']", AI = false)
	public WebElement btnSidebySideQuoting;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-CollectCreditCard>div[role='menuitem']", AI = false)
	public WebElement btnCollectCreditCard;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPBuildingsScreen-BOPBuildingsCV-BOPLocationBuildingsPanelSet-BOPBuilding_DetailsCardTab", AI = false)
	public WebElement btnDetails;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-11-item>div[role='menuitem']", AI = false)
	public WebElement btnRatiooutofrange;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPBuildingsScreen-JobWizardToolbarButtonSet-ConvertToFullApp>div[role='button']", AI = false)
	public WebElement btnFullApp;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-BOPBuildings>div[role='menuitem']", AI = false)
	public WebElement btnBuildings_6;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-1-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnGL0012336260;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-DiagWorksheetItem>div[role='menuitem']", AI = false)
	public WebElement btnDiagnosticData;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPBuildingsScreen-BOPBuildingsCV-BOPLocationBuildingsPanelSet-BOPBuilding_DetailsDV-LastUpdateRoofing']", AI = false)
	public WebElement inpYearofLastUpdateRoofing;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category>div[role='menuitem']", AI = false)
	public WebElement btnReminder;

	@IFindBy(how = How.CSS, using = "div[id='gw-center-title-toolbar']>div[id$='BOPBuildingsScreen-ttlBar']", AI = false)
	public WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPBuildingsScreen-BOPBuildingsCV-BOPLocationBuildingsPanelSet-BOPBuilding_DetailsDV-AnyAreaLeased']", AI = false)
	public WebElement drpAnyAreaLeased;

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

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-5-item>div[role='menuitem']", AI = false)
	public WebElement btnNewAuditAssignment;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-16-item>div[role='menuitem']", AI = false)
	public WebElement btnRewritetoNewAccount;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-12-item>div[role='menuitem']", AI = false)
	public WebElement btnReview30dayUWPeriod;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-ManageBranches>div[role='menuitem']", AI = false)
	public WebElement btnPolicyVersions;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPBuildingsScreen-JobWizardToolbarButtonSet-CloseOptions>div[role='button']", AI = false)
	public WebElement btnCloseOptions;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPBuildingsScreen-BOPBuildingsCV-BOPLocationBuildingsPanelSet-BOPBuilding_DetailsDV-AlarmExpiration_dateIcon", AI = false)
	public WebElement btnAlarmExpirationDateIcon;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_ToPolicyFile>div[role='menuitem']", AI = false)
	public WebElement btnPolicyFile;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-17-item>div[role='menuitem']", AI = false)
	public WebElement btnVerifycoverage;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-4-item>div[role='menuitem']", AI = false)
	public WebElement btnGetCreditReports;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPBuildingsScreen-BOPBuildingsCV-BOPLocationBuildingsPanelSet-BOPLocationsLV-0-LocationPreferredCoverageCurrency']", AI = false)
	public WebElement inpCoveragesin;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPBuildingsScreen-JobWizardToolbarButtonSet-CloseOptions-Decline>div[role='menuitem']", AI = false)
	public WebElement btnDecline;

	@IFindBy(how = How.CSS, using = "div[id=$'SubmissionWizard-WizardMenuActions']>div[role='button']", AI = false)
	public WebElement btnWizardMenuActions;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-BOPBuildingsScreen-BOPBuildingsCV-BOPLocationBuildingsPanelSet-BOPBuilding_DetailsDV-FrontExposure']", AI = false)
	public WebElement inpFrontExposure;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardActionsMenuItemSet-SubmissionInfo>div[role='menuitem']", AI = false)
	public WebElement btnSubManager;

	@IFindBy(how = How.CSS, using = "div[id$='BOPBuildingClassCodePicker']", AI = false)
	public WebElement btnBuildingClassCodeSearch;

	@IFindBy(how = How.CSS, using = "input[name='BOPBuildingPopup-BOPSingleBuildingDetailScreen-BOPBuilding_DetailsDV-0-CoverageInputSet-CovPatternInputGroup-BOPBldgCovLimit-CovTermDirectInputSet-DirectTermInput']", AI = false)
	public WebElement inpBuildingLimit;

	@IFindBy(how = How.CSS, using = "input[name='BOPBuildingPopup-BOPSingleBuildingDetailScreen-BOPBuilding_DetailsDV-1-CoverageInputSet-CovPatternInputGroup-BOPPersonalPropCovLimit-CovTermDirectInputSet-DirectTermInput']", AI = false)
	public WebElement inpBusinessPersonalPropertyLimit;

	@IFindBy(how = How.CSS, using = "#BOPBuildingPopup-BOPSingleBuildingDetailScreen-Update>div[role='button']", AI = false)
	public WebElement btnUpdateBuilding;

	public BuildingsPage(){
	}

	public BuildingsPage(WebDriver driver) {
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
		
	}public BuildingsPage selectAlarmType(WebDriver driver,String AlarmType)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpAlarmType,AlarmType,"AlarmType");
		return this;
	}
	public BuildingsPage clickWorkplan(WebDriver driver)  {
		BrowserActions.click(driver, btnWorkplan,"Workplan");
		return this;
	}
	public BuildingsPage clickCopySubmission(WebDriver driver)  {
		BrowserActions.click(driver, btnCopySubmission,"CopySubmission");
		return this;
	}
	public BuildingsPage clickGeneralreminderdiary(WebDriver driver)  {
		BrowserActions.click(driver, btnGeneralreminderdiary,"Generalreminderdiary");
		return this;
	}
	public BuildingsPage clickFromAddressBook(WebDriver driver)  {
		BrowserActions.click(driver, btnFromAddressBook,"FromAddressBook");
		return this;
	}
	public BuildingsPage clickGetReinsuranceQuote(WebDriver driver)  {
		BrowserActions.click(driver, btnGetReinsuranceQuote,"GetReinsuranceQuote");
		return this;
	}
	public BuildingsPage clickReview45dayUWPeriod(WebDriver driver)  {
		BrowserActions.click(driver, btnReview45dayUWPeriod,"Review45dayUWPeriod");
		return this;
	}
	public BuildingsPage clickBindOnly(WebDriver driver)  {
		BrowserActions.click(driver, btnBindOnly,"BindOnly");
		return this;
	}
	public BuildingsPage clickInterview(WebDriver driver)  {
		BrowserActions.click(driver, btnInterview,"Interview");
		return this;
	}
	public BuildingsPage enterOfBasements(WebDriver driver,String OfBasements) {
		BrowserActions.type(driver, inpOfBasements,OfBasements, "OfBasements");
		return this;
	}
	public BuildingsPage clickPerformanceReview(WebDriver driver)  {
		BrowserActions.click(driver, btnPerformanceReview,"PerformanceReview");
		return this;
	}
	public BuildingsPage clickStartMultiVersion(WebDriver driver)  {
		BrowserActions.click(driver, btnStartMultiVersion,"StartMultiVersion");
		return this;
	}
	public BuildingsPage clickReviewProducer(WebDriver driver)  {
		BrowserActions.click(driver, btnReviewProducer,"ReviewProducer");
		return this;
	}
	public BuildingsPage enterPremiumBasisType(WebDriver driver,String PremiumBasisType) {
		BrowserActions.type(driver, inpPremiumBasisType,PremiumBasisType, "PremiumBasisType");
		return this;
	}
	public BuildingsPage clickPolicyReviewMidterm(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyReviewMidterm,"PolicyReviewMidterm");
		return this;
	}
	public BuildingsPage clickRemove_5(WebDriver driver)  {
		BrowserActions.click(driver, btnRemove_5,"Remove_5");
		return this;
	}
	public BuildingsPage clickViewSideBySideVersions(WebDriver driver)  {
		BrowserActions.click(driver, btnViewSideBySideVersions,"ViewSideBySideVersions");
		return this;
	}
	public BuildingsPage enterLoc(WebDriver driver,String Loc) {
		BrowserActions.type(driver, inpLoc,Loc, "Loc");
		return this;
	}
	public BuildingsPage clickSG00123362603667786193(WebDriver driver)  {
		BrowserActions.click(driver, btnSG00123362603667786193,"SG00123362603667786193");
		return this;
	}
	public BuildingsPage clickPayment(WebDriver driver)  {
		BrowserActions.click(driver, btnPayment,"Payment");
		return this;
	}
	public BuildingsPage clickEffectiveDate(WebDriver driver)  {
		BrowserActions.click(driver, btnEffectiveDate,"EffectiveDate");
		return this;
	}
	public BuildingsPage enterBuildingNumber(WebDriver driver,String BuildingNumber) {
		BrowserActions.type(driver, inpBuildingNumber,BuildingNumber, "BuildingNumber");
		return this;
	}
	public BuildingsPage enterRearExposure(WebDriver driver,String RearExposure) {
		BrowserActions.type(driver, inpRearExposure,RearExposure, "RearExposure");
		return this;
	}
	public BuildingsPage enterLeftExposure(WebDriver driver,String LeftExposure) {
		BrowserActions.type(driver, inpLeftExposure,LeftExposure, "LeftExposure");
		return this;
	}
	public BuildingsPage enterCoveragesin_1(WebDriver driver,String Coveragesin_1) {
		BrowserActions.type(driver, inpCoveragesin_1,Coveragesin_1, "Coveragesin_1");
		return this;
	}
	public BuildingsPage enterYearofLastUpdateHeating(WebDriver driver,String YearofLastUpdateHeating) {
		BrowserActions.type(driver, inpYearofLastUpdateHeating,YearofLastUpdateHeating, "YearofLastUpdateHeating");
		return this;
	}
	public BuildingsPage enterPremiumBasisAmount(WebDriver driver,String PremiumBasisAmount) {
		BrowserActions.type(driver, inpPremiumBasisAmount,PremiumBasisAmount, "PremiumBasisAmount");
		return this;
	}
	public BuildingsPage clickNextBlockedDate(WebDriver driver)  {
		BrowserActions.click(driver, btnNextBlockedDate,"NextBlockedDate");
		return this;
	}
	public BuildingsPage click90daydiary(WebDriver driver)  {
		BrowserActions.click(driver, btn90daydiary,"90daydiary");
		return this;
	}
	public BuildingsPage clickBindOptions(WebDriver driver)  {
		BrowserActions.click(driver, btnBindOptions,"BindOptions");
		return this;
	}
	public BuildingsPage clickBuildings(WebDriver driver)  {
		BrowserActions.click(driver, btnBuildings,"Buildings");
		return this;
	}
	public BuildingsPage clickEnableDisable(WebDriver driver)  {
		BrowserActions.click(driver, btnEnableDisable,"EnableDisable");
		return this;
	}
	public BuildingsPage clickIssuePolicy(WebDriver driver)  {
		BrowserActions.click(driver, btnIssuePolicy,"IssuePolicy");
		return this;
	}
	public BuildingsPage selectSprinklered(WebDriver driver,String Sprinklered)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpSprinklered,Sprinklered,"Sprinklered");
		return this;
	}
	public BuildingsPage clickPolicyPeriodSelector(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyPeriodSelector,"PolicyPeriodSelector");
		return this;
	}
	public BuildingsPage clickNewmail(WebDriver driver)  {
		BrowserActions.click(driver, btnNewmail,"Newmail");
		return this;
	}
	public BuildingsPage clickGetMotorVehicleReports(WebDriver driver)  {
		BrowserActions.click(driver, btnGetMotorVehicleReports,"GetMotorVehicleReports");
		return this;
	}
	public BuildingsPage clickQualification(WebDriver driver)  {
		BrowserActions.click(driver, btnQualification,"Qualification");
		return this;
	}
	public BuildingsPage enterLocationName(WebDriver driver,String LocationName) {
		BrowserActions.type(driver, inpLocationName,LocationName, "LocationName");
		return this;
	}
	public BuildingsPage selectAlarmCertification(WebDriver driver,String AlarmCertification)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpAlarmCertification,AlarmCertification,"AlarmCertification");
		return this;
	}
	public BuildingsPage clickParticipants(WebDriver driver)  {
		BrowserActions.click(driver, btnParticipants,"Participants");
		return this;
	}
	public BuildingsPage clickBOP0012415250(WebDriver driver)  {
		BrowserActions.click(driver, btnBOP0012415250,"BOP0012415250");
		return this;
	}
	public BuildingsPage clickReviewandapprove(WebDriver driver)  {
		BrowserActions.click(driver, btnReviewandapprove,"Reviewandapprove");
		return this;
	}
	public BuildingsPage selectEffectiveDate(WebDriver driver,String EffectiveDate)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpEffectiveDate,EffectiveDate,"EffectiveDate");
		return this;
	}
	public BuildingsPage clickNewDocument(WebDriver driver)  {
		BrowserActions.click(driver, btnNewDocument,"NewDocument");
		return this;
	}
	public BuildingsPage clickUploaddocuments(WebDriver driver)  {
		BrowserActions.click(driver, btnUploaddocuments,"Uploaddocuments");
		return this;
	}
	public BuildingsPage clickFinish(WebDriver driver)  {
		BrowserActions.click(driver, btnFinish,"Finish");
		return this;
	}
	public BuildingsPage clickProductDefinition(WebDriver driver)  {
		BrowserActions.click(driver, btnProductDefinition,"ProductDefinition");
		return this;
	}
	public BuildingsPage clickGetInspectionOutsideService(WebDriver driver)  {
		BrowserActions.click(driver, btnGetInspectionOutsideService,"GetInspectionOutsideService");
		return this;
	}
	public BuildingsPage enterBasementFinishedSqFt(WebDriver driver,String BasementFinishedSqFt) {
		BrowserActions.type(driver, inpBasementFinishedSqFt,BasementFinishedSqFt, "BasementFinishedSqFt");
		return this;
	}
	public BuildingsPage clickMeetwithInsured(WebDriver driver)  {
		BrowserActions.click(driver, btnMeetwithInsured,"MeetwithInsured");
		return this;
	}
	public BuildingsPage clickOfferings(WebDriver driver)  {
		BrowserActions.click(driver, btnOfferings,"Offerings");
		return this;
	}
	public BuildingsPage clickPolicyReviewRenewal(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyReviewRenewal,"PolicyReviewRenewal");
		return this;
	}
	public BuildingsPage clickNewNote(WebDriver driver)  {
		BrowserActions.click(driver, btnNewNote,"NewNote");
		return this;
	}
	public BuildingsPage clickRiskAnalysis(WebDriver driver)  {
		BrowserActions.click(driver, btnRiskAnalysis,"RiskAnalysis");
		return this;
	}
	public BuildingsPage clickMeetwithProducerAgency(WebDriver driver)  {
		BrowserActions.click(driver, btnMeetwithProducerAgency,"MeetwithProducerAgency");
		return this;
	}
	public BuildingsPage selectConstructionType(WebDriver driver,String ConstructionType)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpConstructionType,ConstructionType,"ConstructionType");
		return this;
	}
	public BuildingsPage clickSupplemental(WebDriver driver)  {
		BrowserActions.click(driver, btnSupplemental,"Supplemental");
		return this;
	}
	public BuildingsPage enterLocation(WebDriver driver,String Location) {
		BrowserActions.type(driver, inpLocation,Location, "Location");
		return this;
	}
	public BuildingsPage clickPolicyReview(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyReview,"PolicyReview");
		return this;
	}
	public BuildingsPage clickOOSEPeriodSelector(WebDriver driver)  {
		BrowserActions.click(driver, btnOOSEPeriodSelector,"OOSEPeriodSelector");
		return this;
	}
	public BuildingsPage clickManuallyrateandquotepolicy(WebDriver driver)  {
		BrowserActions.click(driver, btnManuallyrateandquotepolicy,"Manuallyrateandquotepolicy");
		return this;
	}
	public BuildingsPage clickHistory(WebDriver driver)  {
		BrowserActions.click(driver, btnHistory,"History");
		return this;
	}
	public BuildingsPage clickEdit(WebDriver driver)  {
		BrowserActions.click(driver, btnEdit,"Edit");
		return this;
	}
	public BuildingsPage clickWithdrawTransaction(WebDriver driver)  {
		BrowserActions.click(driver, btnWithdrawTransaction,"WithdrawTransaction");
		return this;
	}
	public BuildingsPage clickPolicyInfo(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyInfo,"PolicyInfo");
		return this;
	}
	public BuildingsPage clickVersions(WebDriver driver)  {
		BrowserActions.click(driver, btnVersions,"Versions");
		return this;
	}
	public BuildingsPage enterOfStories(WebDriver driver,String OfStories) {
		BrowserActions.type(driver, inpOfStories,OfStories, "OfStories");
		return this;
	}
	public BuildingsPage clickModifiers(WebDriver driver)  {
		BrowserActions.click(driver, btnModifiers,"Modifiers");
		return this;
	}
	public BuildingsPage clickAccountFile(WebDriver driver)  {
		BrowserActions.click(driver, btnAccountFile,"AccountFile");
		return this;
	}
	public BuildingsPage clickRemove(WebDriver driver)  {
		BrowserActions.click(driver, btnRemove,"Remove");
		return this;
	}
	public BuildingsPage enterAlarmCertificate(WebDriver driver,String AlarmCertificate) {
		BrowserActions.type(driver, inpAlarmCertificate,AlarmCertificate, "AlarmCertificate");
		return this;
	}
	public BuildingsPage clickCopyData(WebDriver driver)  {
		BrowserActions.click(driver, btnCopyData,"CopyData");
		return this;
	}
	public BuildingsPage clickClose(WebDriver driver)  {
		BrowserActions.click(driver, btnClose,"Close");
		return this;
	}
	public BuildingsPage clickAdd_4(WebDriver driver)  {
		BrowserActions.click(driver, btnAdd_4,"Add_4");
		return this;
	}
	public BuildingsPage clickReview60dayUWPeriod(WebDriver driver)  {
		BrowserActions.click(driver, btnReview60dayUWPeriod,"Review60dayUWPeriod");
		return this;
	}
	public BuildingsPage clickEditPolicyTransaction(WebDriver driver)  {
		BrowserActions.click(driver, btnEditPolicyTransaction,"EditPolicyTransaction");
		return this;
	}
	public BuildingsPage clickNewActivity(WebDriver driver)  {
		BrowserActions.click(driver, btnNewActivity,"NewActivity");
		return this;
	}
	public BuildingsPage clickCancel(WebDriver driver)  {
		BrowserActions.click(driver, btnCancel,"Cancel");
		return this;
	}
	public BuildingsPage clickPolicyContract(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyContract,"PolicyContract");
		return this;
	}
	public BuildingsPage enterRightExposure(WebDriver driver,String RightExposure) {
		BrowserActions.type(driver, inpRightExposure,RightExposure, "RightExposure");
		return this;
	}
	public BuildingsPage clickRequest(WebDriver driver)  {
		BrowserActions.click(driver, btnRequest,"Request");
		return this;
	}
	public BuildingsPage clickExistingAdditionalInterest(WebDriver driver)  {
		BrowserActions.click(driver, btnExistingAdditionalInterest,"ExistingAdditionalInterest");
		return this;
	}
	public BuildingsPage enterTotalArea(WebDriver driver,String TotalArea) {
		BrowserActions.type(driver, inpTotalArea,TotalArea, "TotalArea");
		return this;
	}
	public BuildingsPage clickGetRiskInformationProducer(WebDriver driver)  {
		BrowserActions.click(driver, btnGetRiskInformationProducer,"GetRiskInformationProducer");
		return this;
	}
	public BuildingsPage enterYearofLastUpdatePlumbing(WebDriver driver,String YearofLastUpdatePlumbing) {
		BrowserActions.type(driver, inpYearofLastUpdatePlumbing,YearofLastUpdatePlumbing, "YearofLastUpdatePlumbing");
		return this;
	}
	public BuildingsPage selectBuildingClassCode(WebDriver driver,String BuildingClassCode)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpBuildingClassCode,BuildingClassCode,"BuildingClassCode");
		return this;
	}
	public BuildingsPage enterYearBuilt(WebDriver driver,String YearBuilt) {
		BrowserActions.type(driver, inpYearBuilt,YearBuilt, "YearBuilt");
		return this;
	}
	public BuildingsPage clickGetAuditInternalPersonnel(WebDriver driver)  {
		BrowserActions.click(driver, btnGetAuditInternalPersonnel,"GetAuditInternalPersonnel");
		return this;
	}
	public BuildingsPage clickAdditionalCoverages_3(WebDriver driver)  {
		BrowserActions.click(driver, btnAdditionalCoverages_3,"AdditionalCoverages_3");
		return this;
	}
	public BuildingsPage selectPolicyPeriodSelector_Arg(WebDriver driver,String PolicyPeriodSelector_Arg)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPolicyPeriodSelector_Arg,PolicyPeriodSelector_Arg,"PolicyPeriodSelector_Arg");
		return this;
	}
	public BuildingsPage clickPolicyVersions_9(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyVersions_9,"PolicyVersions_9");
		return this;
	}
	public BuildingsPage clickShowPartialWorksheet(WebDriver driver)  {
		BrowserActions.click(driver, btnShowPartialWorksheet,"ShowPartialWorksheet");
		return this;
	}
	public BuildingsPage click60daydiary(WebDriver driver)  {
		BrowserActions.click(driver, btn60daydiary,"60daydiary");
		return this;
	}
	public BuildingsPage clickBack(WebDriver driver)  {
		BrowserActions.click(driver, btnBack,"Back");
		return this;
	}
	public BuildingsPage clickLocations(WebDriver driver)  {
		BrowserActions.click(driver, btnLocations,"Locations");
		return this;
	}
	public BuildingsPage clickNext(WebDriver driver)  {
		BrowserActions.click(driver, btnNext,0.5,"Next");
		return this;
	}
	public BuildingsPage clickQuoteRequired(WebDriver driver)  {
		BrowserActions.click(driver, btnQuoteRequired,"QuoteRequired");
		return this;
	}
	public BuildingsPage enterYearofLastUpdateWiring(WebDriver driver,String YearofLastUpdateWiring) {
		BrowserActions.type(driver, inpYearofLastUpdateWiring,YearofLastUpdateWiring, "YearofLastUpdateWiring");
		return this;
	}
	public BuildingsPage clickAdditionalCoverages(WebDriver driver)  {
		BrowserActions.click(driver, btnAdditionalCoverages,"AdditionalCoverages");
		return this;
	}
	public BuildingsPage clickSaveDraft(WebDriver driver)  {
		BrowserActions.click(driver, btnSaveDraft,"SaveDraft");
		return this;
	}
	public BuildingsPage selectInterest(WebDriver driver,String Interest)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpInterest,Interest,"Interest");
		return this;
	}
	public BuildingsPage clickGetBureauData(WebDriver driver)  {
		BrowserActions.click(driver, btnGetBureauData,"GetBureauData");
		return this;
	}
	public BuildingsPage clickIncludedCoverages(WebDriver driver)  {
		BrowserActions.click(driver, btnIncludedCoverages,"IncludedCoverages");
		return this;
	}
	public BuildingsPage clickReinsurance(WebDriver driver)  {
		BrowserActions.click(driver, btnReinsurance,"Reinsurance");
		return this;
	}
	public BuildingsPage enterBasementUnfinishedSqFt(WebDriver driver,String BasementUnfinishedSqFt) {
		BrowserActions.type(driver, inpBasementUnfinishedSqFt,BasementUnfinishedSqFt, "BasementUnfinishedSqFt");
		return this;
	}
	public BuildingsPage clickCreatefromatemplate(WebDriver driver)  {
		BrowserActions.click(driver, btnCreatefromatemplate,"Createfromatemplate");
		return this;
	}
	public BuildingsPage clickStartSidebySide(WebDriver driver)  {
		BrowserActions.click(driver, btnStartSidebySide,"StartSidebySide");
		return this;
	}
	public BuildingsPage enterAddress(WebDriver driver,String Address) {
		BrowserActions.type(driver, inpAddress,Address, "Address");
		return this;
	}
	public BuildingsPage clickArchiving(WebDriver driver)  {
		BrowserActions.click(driver, btnArchiving,"Archiving");
		return this;
	}
	public BuildingsPage clickNotTaken(WebDriver driver)  {
		BrowserActions.click(driver, btnNotTaken,"NotTaken");
		return this;
	}
	public BuildingsPage clickDocuments(WebDriver driver)  {
		BrowserActions.click(driver, btnDocuments,"Documents");
		return this;
	}
	public BuildingsPage selectCoveragesin(WebDriver driver,String Coveragesin)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCoveragesin,Coveragesin,"Coveragesin");
		return this;
	}
	public BuildingsPage clickRiskAnalysis_10(WebDriver driver)  {
		BrowserActions.click(driver, btnRiskAnalysis_10,"RiskAnalysis_10");
		return this;
	}
	public BuildingsPage clickOtherContacts(WebDriver driver)  {
		BrowserActions.click(driver, btnOtherContacts,"OtherContacts");
		return this;
	}
	public BuildingsPage clickQuote(WebDriver driver)  {
		BrowserActions.click(driver, btnQuote,"Quote");
		return this;
	}
	public BuildingsPage clickReleaseLock(WebDriver driver)  {
		BrowserActions.click(driver, btnReleaseLock,"ReleaseLock");
		return this;
	}
	public BuildingsPage clickDetails_2(WebDriver driver)  {
		BrowserActions.click(driver, btnDetails_2,"Details_2");
		return this;
	}
	public BuildingsPage clickCreateNewProducer(WebDriver driver)  {
		BrowserActions.click(driver, btnCreateNewProducer,"CreateNewProducer");
		return this;
	}
	public BuildingsPage clickAdd(WebDriver driver)  {
		BrowserActions.click(driver, btnAdd,2.5,"Add");
		return this;
	}
	public BuildingsPage selectPercentOccupied(WebDriver driver,String PercentOccupied)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPercentOccupied,PercentOccupied,"PercentOccupied");
		return this;
	}
	public BuildingsPage clickForms(WebDriver driver)  {
		BrowserActions.click(driver, btnForms,"Forms");
		return this;
	}
	public BuildingsPage clickNotes(WebDriver driver)  {
		BrowserActions.click(driver, btnNotes,"Notes");
		return this;
	}
	public BuildingsPage clickGetInspectionLossControl(WebDriver driver)  {
		BrowserActions.click(driver, btnGetInspectionLossControl,"GetInspectionLossControl");
		return this;
	}
	public BuildingsPage enterAlarmExpiration(WebDriver driver,String AlarmExpiration) {
		BrowserActions.type(driver, inpAlarmExpiration,AlarmExpiration, "AlarmExpiration");
		return this;
	}
	public BuildingsPage clickQuote_8(WebDriver driver)  {
		BrowserActions.click(driver, btnQuote_8,"Quote_8");
		return this;
	}
	public BuildingsPage clickCreate(WebDriver driver)  {
		BrowserActions.click(driver, btnCreate,"Create");
		return this;
	}
	public BuildingsPage clickQuote_7(WebDriver driver)  {
		BrowserActions.click(driver, btnQuote_7,"Quote_7");
		return this;
	}
	public BuildingsPage enterDescription(WebDriver driver,String Description) {
		BrowserActions.type(driver, inpDescription,Description, "Description");
		return this;
	}
	public BuildingsPage clickLegalreview(WebDriver driver)  {
		BrowserActions.click(driver, btnLegalreview,"Legalreview");
		return this;
	}
	public BuildingsPage clickPolicynotification(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicynotification,"Policynotification");
		return this;
	}
	public BuildingsPage selectAlarmGrade(WebDriver driver,String AlarmGrade)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpAlarmGrade,AlarmGrade,"AlarmGrade");
		return this;
	}
	public BuildingsPage clickGoto(WebDriver driver)  {
		BrowserActions.click(driver, btnGoto,"Goto");
		return this;
	}
	public BuildingsPage clickUnderwriterReview(WebDriver driver)  {
		BrowserActions.click(driver, btnUnderwriterReview,"UnderwriterReview");
		return this;
	}
	public BuildingsPage click30daydiary(WebDriver driver)  {
		BrowserActions.click(driver, btn30daydiary,"30daydiary");
		return this;
	}
	public BuildingsPage clickSidebySideQuoting(WebDriver driver)  {
		BrowserActions.click(driver, btnSidebySideQuoting,"SidebySideQuoting");
		return this;
	}
	public BuildingsPage clickCollectCreditCard(WebDriver driver)  {
		BrowserActions.click(driver, btnCollectCreditCard,"CollectCreditCard");
		return this;
	}
	public BuildingsPage clickDetails(WebDriver driver)  {
		BrowserActions.click(driver, btnDetails,"Details");
		return this;
	}
	public BuildingsPage clickRatiooutofrange(WebDriver driver)  {
		BrowserActions.click(driver, btnRatiooutofrange,"Ratiooutofrange");
		return this;
	}
	public BuildingsPage clickFullApp(WebDriver driver)  {
		BrowserActions.click(driver, btnFullApp,"FullApp");
		return this;
	}
	public BuildingsPage clickBuildings_6(WebDriver driver)  {
		BrowserActions.click(driver, btnBuildings_6,"Buildings_6");
		return this;
	}
	public BuildingsPage clickGL0012336260(WebDriver driver)  {
		BrowserActions.click(driver, btnGL0012336260,"GL0012336260");
		return this;
	}
	public BuildingsPage clickDiagnosticData(WebDriver driver)  {
		BrowserActions.click(driver, btnDiagnosticData,"DiagnosticData");
		return this;
	}
	public BuildingsPage enterYearofLastUpdateRoofing(WebDriver driver,String YearofLastUpdateRoofing) {
		BrowserActions.type(driver, inpYearofLastUpdateRoofing,YearofLastUpdateRoofing, "YearofLastUpdateRoofing");
		return this;
	}
	public BuildingsPage clickReminder(WebDriver driver)  {
		BrowserActions.click(driver, btnReminder,"Reminder");
		return this;
	}
	public BuildingsPage selectAnyAreaLeased(WebDriver driver,String AnyAreaLeased)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpAnyAreaLeased,AnyAreaLeased,"AnyAreaLeased");
		return this;
	}
	public BuildingsPage clickBusinessownersLine(WebDriver driver)  {
		BrowserActions.click(driver, btnBusinessownersLine,"BusinessownersLine");
		return this;
	}
	public BuildingsPage clickReviewnewmail(WebDriver driver)  {
		BrowserActions.click(driver, btnReviewnewmail,"Reviewnewmail");
		return this;
	}
	public BuildingsPage clickGroup(WebDriver driver)  {
		BrowserActions.click(driver, btnGroup,"Group");
		return this;
	}
	public BuildingsPage clickCancelasplitpolicy(WebDriver driver)  {
		BrowserActions.click(driver, btnCancelasplitpolicy,"Cancelasplitpolicy");
		return this;
	}
	public BuildingsPage clickGetAuditOutsideService(WebDriver driver)  {
		BrowserActions.click(driver, btnGetAuditOutsideService,"GetAuditOutsideService");
		return this;
	}
	public BuildingsPage clickNewAuditAssignment(WebDriver driver)  {
		BrowserActions.click(driver, btnNewAuditAssignment,"NewAuditAssignment");
		return this;
	}
	public BuildingsPage clickRewritetoNewAccount(WebDriver driver)  {
		BrowserActions.click(driver, btnRewritetoNewAccount,"RewritetoNewAccount");
		return this;
	}
	public BuildingsPage clickReview30dayUWPeriod(WebDriver driver)  {
		BrowserActions.click(driver, btnReview30dayUWPeriod,"Review30dayUWPeriod");
		return this;
	}
	public BuildingsPage clickPolicyVersions(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyVersions,"PolicyVersions");
		return this;
	}
	public BuildingsPage clickCloseOptions(WebDriver driver)  {
		BrowserActions.click(driver, btnCloseOptions,"CloseOptions");
		return this;
	}
	public BuildingsPage clickAlarmExpirationDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnAlarmExpirationDateIcon,"AlarmExpirationDateIcon");
		return this;
	}
	public BuildingsPage clickPolicyFile(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyFile,"PolicyFile");
		return this;
	}
	public BuildingsPage clickVerifycoverage(WebDriver driver)  {
		BrowserActions.click(driver, btnVerifycoverage,"Verifycoverage");
		return this;
	}
	public BuildingsPage clickGetCreditReports(WebDriver driver)  {
		BrowserActions.click(driver, btnGetCreditReports,"GetCreditReports");
		return this;
	}
	public BuildingsPage enterCoveragesin(WebDriver driver,String Coveragesin) {
		BrowserActions.type(driver, inpCoveragesin,Coveragesin, "Coveragesin");
		return this;
	}
	public BuildingsPage clickDecline(WebDriver driver)  {
		BrowserActions.click(driver, btnDecline,"Decline");
		return this;
	}
	public BuildingsPage clickWizardMenuActions(WebDriver driver)  {
		BrowserActions.click(driver, btnWizardMenuActions,"WizardMenuActions");
		return this;
	}
	public BuildingsPage enterFrontExposure(WebDriver driver,String FrontExposure) {
		BrowserActions.type(driver, inpFrontExposure,FrontExposure, "FrontExposure");
		return this;
	}
	public BuildingsPage clickSubManager(WebDriver driver)  {
		BrowserActions.click(driver, btnSubManager,"SubManager");
		return this;
	}

	public BuildingsPage clickBuildingClassCodeSearch(WebDriver driver){
		BrowserActions.click(driver, btnBuildingClassCodeSearch,"Building Class Code Search Button");
		return this;
	}

	public BuildingsPage enterBuildingLimit(WebDriver driver,String BuildingLimit) {
		BrowserActions.type(driver, inpBuildingLimit,BuildingLimit, "BuildingLimit");
		return this;
	}

	public BuildingsPage enterBusinessPersonalPropertyLimit(WebDriver driver,String BusinessPersonalPropertyLimit) {
		BrowserActions.type(driver, inpBusinessPersonalPropertyLimit,BusinessPersonalPropertyLimit, "BusinessPersonalPropertyLimit");
		return this;
	}

	public BuildingsPage clickUpdateBuilding(WebDriver driver)  {
		BrowserActions.click(driver, btnUpdateBuilding,"UpdateBuilding");
		return this;
	}

	public class ClassCodeSearchPage extends LoadableComponent<ClassCodeSearchPage> {

		WebDriver driver;
		private boolean isPageLoaded;
		public ElementLayer elementLayer;
		String elementObject;
		HashMap<String, String> getPageObjects;
		public List<Object> pageFactoryKey = new ArrayList<Object>();
		public List<String> pageFactoryValue = new ArrayList<String>();

		@IFindBy(how = How.CSS, using = "input[name='BOPClassCodeSearchPopup-BOPClassCodeSearchScreen-ClassCodeSearchResultsLV-1-Code']", AI = false)
		public WebElement inpCode_3;

		@IFindBy(how = How.CSS, using = "input[name='BOPClassCodeSearchPopup-BOPClassCodeSearchScreen-ClassCodeSearchResultsLV-10-Code']", AI = false)
		public WebElement inpCode_21;

		@IFindBy(how = How.CSS, using = "input[name='BOPClassCodeSearchPopup-BOPClassCodeSearchScreen-ClassCodeSearchResultsLV-2-Code']", AI = false)
		public WebElement inpCode_5;

		@IFindBy(how = How.CSS, using = "input[name='BOPClassCodeSearchPopup-BOPClassCodeSearchScreen-ClassCodeSearchResultsLV-0-Code']", AI = false)
		public WebElement inpCode_1;

		@IFindBy(how = How.CSS, using = "input[name='BOPClassCodeSearchPopup-BOPClassCodeSearchScreen-ClassCodeSearchResultsLV-14-Code']", AI = false)
		public WebElement inpCode_29;

		@IFindBy(how = How.CSS, using = "input[name='BOPClassCodeSearchPopup-BOPClassCodeSearchScreen-ClassCodeSearchResultsLV-13-Code']", AI = false)
		public WebElement inpCode_27;

		@IFindBy(how = How.CSS, using = "input[name='BOPClassCodeSearchPopup-BOPClassCodeSearchScreen-ClassCodeSearchResultsLV-12-Code']", AI = false)
		public WebElement inpCode_25;

		@IFindBy(how = How.CSS, using = "input[name='BOPClassCodeSearchPopup-BOPClassCodeSearchScreen-ClassCodeSearchResultsLV-11-Code']", AI = false)
		public WebElement inpCode_23;

		@IFindBy(how = How.CSS, using = "input[name='BOPClassCodeSearchPopup-BOPClassCodeSearchScreen-BOPClassCodeSearchDV-Code']", AI = false)
		public WebElement inpCode;

		@IFindBy(how = How.CSS, using = "input[name='BOPClassCodeSearchPopup-BOPClassCodeSearchScreen-ClassCodeSearchResultsLV-3-Code']", AI = false)
		public WebElement inpCode_7;

		@IFindBy(how = How.CSS, using = "input[name='BOPClassCodeSearchPopup-BOPClassCodeSearchScreen-ClassCodeSearchResultsLV-4-Code']", AI = false)
		public WebElement inpCode_9;

		@IFindBy(how = How.CSS, using = "input[name='BOPClassCodeSearchPopup-BOPClassCodeSearchScreen-ClassCodeSearchResultsLV-5-Code']", AI = false)
		public WebElement inpCode_11;

		@IFindBy(how = How.CSS, using = "input[name='BOPClassCodeSearchPopup-BOPClassCodeSearchScreen-ClassCodeSearchResultsLV-9-Code']", AI = false)
		public WebElement inpCode_19;

		@IFindBy(how = How.CSS, using = "input[name='BOPClassCodeSearchPopup-BOPClassCodeSearchScreen-ClassCodeSearchResultsLV-8-Code']", AI = false)
		public WebElement inpCode_17;

		@IFindBy(how = How.CSS, using = "input[name='BOPClassCodeSearchPopup-BOPClassCodeSearchScreen-ClassCodeSearchResultsLV-7-Code']", AI = false)
		public WebElement inpCode_15;

		@IFindBy(how = How.CSS, using = "input[name='BOPClassCodeSearchPopup-BOPClassCodeSearchScreen-ClassCodeSearchResultsLV-6-Code']", AI = false)
		public WebElement inpCode_13;

		@IFindBy(how = How.CSS, using = "input[name='BOPClassCodeSearchPopup-BOPClassCodeSearchScreen-ClassCodeSearchResultsLV-1-Classification']", AI = false)
		public WebElement inpClassification_4;

		@IFindBy(how = How.CSS, using = "input[name='BOPClassCodeSearchPopup-BOPClassCodeSearchScreen-ClassCodeSearchResultsLV-0-Classification']", AI = false)
		public WebElement inpClassification_2;

		@IFindBy(how = How.CSS, using = "input[name='BOPClassCodeSearchPopup-BOPClassCodeSearchScreen-ClassCodeSearchResultsLV-3-Classification']", AI = false)
		public WebElement inpClassification_8;

		@IFindBy(how = How.CSS, using = "input[name='BOPClassCodeSearchPopup-BOPClassCodeSearchScreen-ClassCodeSearchResultsLV-2-Classification']", AI = false)
		public WebElement inpClassification_6;

		@IFindBy(how = How.CSS, using = "#BOPClassCodeSearchPopup-BOPClassCodeSearchScreen-BOPClassCodeSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Reset", AI = false)
		public WebElement btnReset;

		@IFindBy(how = How.CSS, using = "#BOPClassCodeSearchPopup-__crumb__", AI = false)
		public WebElement btnReturntoDetails;

		@IFindBy(how = How.CSS, using = "input[name='BOPClassCodeSearchPopup-BOPClassCodeSearchScreen-ClassCodeSearchResultsLV-14-Classification']", AI = false)
		public WebElement inpClassification_30;

		@IFindBy(how = How.CSS, using = "input[name='BOPClassCodeSearchPopup-BOPClassCodeSearchScreen-ClassCodeSearchResultsLV-13-Classification']", AI = false)
		public WebElement inpClassification_28;

		@IFindBy(how = How.CSS, using = "input[name='BOPClassCodeSearchPopup-BOPClassCodeSearchScreen-ClassCodeSearchResultsLV-11-Classification']", AI = false)
		public WebElement inpClassification_24;

		@IFindBy(how = How.CSS, using = "input[name='BOPClassCodeSearchPopup-BOPClassCodeSearchScreen-ClassCodeSearchResultsLV-12-Classification']", AI = false)
		public WebElement inpClassification_26;

		@IFindBy(how = How.CSS, using = "input[name='BOPClassCodeSearchPopup-BOPClassCodeSearchScreen-ClassCodeSearchResultsLV-9-Classification']", AI = false)
		public WebElement inpClassification_20;

		@IFindBy(how = How.CSS, using = "input[name='BOPClassCodeSearchPopup-BOPClassCodeSearchScreen-ClassCodeSearchResultsLV-10-Classification']", AI = false)
		public WebElement inpClassification_22;

		@IFindBy(how = How.CSS, using = "#BOPClassCodeSearchPopup-BOPClassCodeSearchScreen-BOPClassCodeSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Search", AI = false)
		public WebElement btnSearch;

		@IFindBy(how = How.CSS, using = "div[id*='ClassCodeSearchScreen-ttlBar']", AI = false)
		public WebElement lblTtlBar;

		@IFindBy(how = How.CSS, using = "input[name='BOPClassCodeSearchPopup-BOPClassCodeSearchScreen-ClassCodeSearchResultsLV-8-Classification']", AI = false)
		public WebElement inpClassification_18;

		@IFindBy(how = How.CSS, using = "input[name='BOPClassCodeSearchPopup-BOPClassCodeSearchScreen-ClassCodeSearchResultsLV-6-Classification']", AI = false)
		public WebElement inpClassification_14;

		@IFindBy(how = How.CSS, using = "input[name='BOPClassCodeSearchPopup-BOPClassCodeSearchScreen-ClassCodeSearchResultsLV-7-Classification']", AI = false)
		public WebElement inpClassification_16;

		@IFindBy(how = How.CSS, using = "input[name='BOPClassCodeSearchPopup-BOPClassCodeSearchScreen-ClassCodeSearchResultsLV-4-Classification']", AI = false)
		public WebElement inpClassification_10;

		@IFindBy(how = How.CSS, using = "input[name='BOPClassCodeSearchPopup-BOPClassCodeSearchScreen-ClassCodeSearchResultsLV-5-Classification']", AI = false)
		public WebElement inpClassification_12;

		@IFindBy(how = How.CSS, using = "input[name='BOPClassCodeSearchPopup-BOPClassCodeSearchScreen-BOPClassCodeSearchDV-Classification']", AI = false)
		public WebElement inpClassification;

		@IFindBy(how = How.CSS, using = "div[id^='BOPClassCodeSearchPopup-BOPClassCodeSearchScreen-ClassCodeSearchResultsLV-'][id$='_Select']", AI = false)
		public WebElement btn_Select;

		public ClassCodeSearchPage(){
		}

		public ClassCodeSearchPage(WebDriver driver) {
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
		}public ClassCodeSearchPage enterCode_3(WebDriver driver,String Code_3) {
			BrowserActions.type(driver, inpCode_3,Code_3, "Code_3");
			return this;
		}
		public ClassCodeSearchPage enterCode_21(WebDriver driver,String Code_21) {
			BrowserActions.type(driver, inpCode_21,Code_21, "Code_21");
			return this;
		}
		public ClassCodeSearchPage enterCode_5(WebDriver driver,String Code_5) {
			BrowserActions.type(driver, inpCode_5,Code_5, "Code_5");
			return this;
		}
		public ClassCodeSearchPage enterCode_1(WebDriver driver,String Code_1) {
			BrowserActions.type(driver, inpCode_1,Code_1, "Code_1");
			return this;
		}
		public ClassCodeSearchPage enterCode_29(WebDriver driver,String Code_29) {
			BrowserActions.type(driver, inpCode_29,Code_29, "Code_29");
			return this;
		}
		public ClassCodeSearchPage enterCode_27(WebDriver driver,String Code_27) {
			BrowserActions.type(driver, inpCode_27,Code_27, "Code_27");
			return this;
		}
		public ClassCodeSearchPage enterCode_25(WebDriver driver,String Code_25) {
			BrowserActions.type(driver, inpCode_25,Code_25, "Code_25");
			return this;
		}
		public ClassCodeSearchPage enterCode_23(WebDriver driver,String Code_23) {
			BrowserActions.type(driver, inpCode_23,Code_23, "Code_23");
			return this;
		}
		public ClassCodeSearchPage enterCode(WebDriver driver,String Code) {
			BrowserActions.type(driver, inpCode,Code, "Code");
			return this;
		}
		public ClassCodeSearchPage enterCode_7(WebDriver driver,String Code_7) {
			BrowserActions.type(driver, inpCode_7,Code_7, "Code_7");
			return this;
		}
		public ClassCodeSearchPage enterCode_9(WebDriver driver,String Code_9) {
			BrowserActions.type(driver, inpCode_9,Code_9, "Code_9");
			return this;
		}
		public ClassCodeSearchPage enterCode_11(WebDriver driver,String Code_11) {
			BrowserActions.type(driver, inpCode_11,Code_11, "Code_11");
			return this;
		}
		public ClassCodeSearchPage enterCode_19(WebDriver driver,String Code_19) {
			BrowserActions.type(driver, inpCode_19,Code_19, "Code_19");
			return this;
		}
		public ClassCodeSearchPage enterCode_17(WebDriver driver,String Code_17) {
			BrowserActions.type(driver, inpCode_17,Code_17, "Code_17");
			return this;
		}
		public ClassCodeSearchPage enterCode_15(WebDriver driver,String Code_15) {
			BrowserActions.type(driver, inpCode_15,Code_15, "Code_15");
			return this;
		}
		public ClassCodeSearchPage enterCode_13(WebDriver driver,String Code_13) {
			BrowserActions.type(driver, inpCode_13,Code_13, "Code_13");
			return this;
		}
		public ClassCodeSearchPage enterClassification_4(WebDriver driver,String Classification_4) {
			BrowserActions.type(driver, inpClassification_4,Classification_4, "Classification_4");
			return this;
		}
		public ClassCodeSearchPage enterClassification_2(WebDriver driver,String Classification_2) {
			BrowserActions.type(driver, inpClassification_2,Classification_2, "Classification_2");
			return this;
		}
		public ClassCodeSearchPage enterClassification_8(WebDriver driver,String Classification_8) {
			BrowserActions.type(driver, inpClassification_8,Classification_8, "Classification_8");
			return this;
		}
		public ClassCodeSearchPage enterClassification_6(WebDriver driver,String Classification_6) {
			BrowserActions.type(driver, inpClassification_6,Classification_6, "Classification_6");
			return this;
		}
		public ClassCodeSearchPage clickReset(WebDriver driver)  {
			BrowserActions.click(driver, btnReset,"Reset");
			return this;
		}
		public ClassCodeSearchPage clickReturntoDetails(WebDriver driver)  {
			BrowserActions.click(driver, btnReturntoDetails,"ReturntoDetails");
			return this;
		}
		public ClassCodeSearchPage enterClassification_30(WebDriver driver,String Classification_30) {
			BrowserActions.type(driver, inpClassification_30,Classification_30, "Classification_30");
			return this;
		}
		public ClassCodeSearchPage enterClassification_28(WebDriver driver,String Classification_28) {
			BrowserActions.type(driver, inpClassification_28,Classification_28, "Classification_28");
			return this;
		}
		public ClassCodeSearchPage enterClassification_24(WebDriver driver,String Classification_24) {
			BrowserActions.type(driver, inpClassification_24,Classification_24, "Classification_24");
			return this;
		}
		public ClassCodeSearchPage enterClassification_26(WebDriver driver,String Classification_26) {
			BrowserActions.type(driver, inpClassification_26,Classification_26, "Classification_26");
			return this;
		}
		public ClassCodeSearchPage enterClassification_20(WebDriver driver,String Classification_20) {
			BrowserActions.type(driver, inpClassification_20,Classification_20, "Classification_20");
			return this;
		}
		public ClassCodeSearchPage enterClassification_22(WebDriver driver,String Classification_22) {
			BrowserActions.type(driver, inpClassification_22,Classification_22, "Classification_22");
			return this;
		}
		public ClassCodeSearchPage clickSearch(WebDriver driver)  {
			BrowserActions.click(driver, btnSearch,"Search");
			return this;
		}
		public ClassCodeSearchPage enterClassification_18(WebDriver driver,String Classification_18) {
			BrowserActions.type(driver, inpClassification_18,Classification_18, "Classification_18");
			return this;
		}
		public ClassCodeSearchPage enterClassification_14(WebDriver driver,String Classification_14) {
			BrowserActions.type(driver, inpClassification_14,Classification_14, "Classification_14");
			return this;
		}
		public ClassCodeSearchPage enterClassification_16(WebDriver driver,String Classification_16) {
			BrowserActions.type(driver, inpClassification_16,Classification_16, "Classification_16");
			return this;
		}
		public ClassCodeSearchPage enterClassification_10(WebDriver driver,String Classification_10) {
			BrowserActions.type(driver, inpClassification_10,Classification_10, "Classification_10");
			return this;
		}
		public ClassCodeSearchPage enterClassification_12(WebDriver driver,String Classification_12) {
			BrowserActions.type(driver, inpClassification_12,Classification_12, "Classification_12");
			return this;
		}
		public ClassCodeSearchPage enterClassification(WebDriver driver,String Classification) {
			BrowserActions.type(driver, inpClassification,Classification, "Classification");
			return this;
		}

		public ClassCodeSearchPage clickSelect(WebDriver driver)  {
			BrowserActions.click(driver, btn_Select,"select");
			return this;
		}
	}

	public class NewAdditionalInterestPage extends LoadableComponent<NewAdditionalInterestPage> {

		WebDriver driver;
		private boolean isPageLoaded;
		public ElementLayer elementLayer;
		String elementObject;
		HashMap<String, String> getPageObjects;
		public  List<Object> pageFactoryKey = new ArrayList<Object>();
		public  List<String> pageFactoryValue = new ArrayList<String>();

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-HomePhone-GlobalPhoneInputSet-PhoneDisplay']", AI = false)
		public WebElement inpHomePhone_2;

		@IFindBy(how = How.CSS, using = "#NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-LinkedAddressInputSet-LinkAddressMenu-EditAddress>div[role='menuitem']", AI = false)
		public WebElement btnEditaddress;

		@IFindBy(how = How.CSS, using = "#NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-LinkedAddressInputSet-LinkAddressMenu-LinkAddressMenuMenuIcon>div[role='button']", AI = false)
		public WebElement btnLinkAddressMenuMenuIcon;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-FaxPhone-GlobalPhoneInputSet-NationalSubscriberNumber']", AI = false)
		public WebElement inpFaxPhone;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-EmailAddress2']", AI = false)
		public WebElement inpSecondaryEmail;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-GlobalPersonNameInputSet-FirstName']", AI = false)
		public WebElement inpFirstname;

		@IFindBy(how = How.CSS, using = "select[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-HomePhone-GlobalPhoneInputSet-CountryCode']", AI = false)
		public WebElement drpHomePhoneRegionCode;

		@IFindBy(how = How.CSS, using = "select[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressType']", AI = false)
		public WebElement drpAddressType;

		@IFindBy(how = How.CSS, using = "#NewAdditionalInterestPopup-ContactDetailScreen-CheckForDuplicates>div[role='button']", AI = false)
		public WebElement btnCheckforDuplicates;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-PostalCode']", AI = false)
		public WebElement inpZIPCode;

		@IFindBy(how = How.CSS, using = "select[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-FaxPhone-GlobalPhoneInputSet-CountryCode']", AI = false)
		public WebElement drpFaxPhoneRegionCode;

		@IFindBy(how = How.CSS, using = "select[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-CellPhone-GlobalPhoneInputSet-CountryCode']", AI = false)
		public WebElement drpMobilePhoneRegionCode;

		@IFindBy(how = How.CSS, using = "select[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-GlobalPersonNameInputSet-Prefix']", AI = false)
		public WebElement drpPrefix;

		@IFindBy(how = How.CSS, using = "select[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-Country']", AI = false)
		public WebElement drpCountry;

		@IFindBy(how = How.CSS, using = "select[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-GlobalPersonNameInputSet-Suffix']", AI = false)
		public WebElement drpSuffix;

		@IFindBy(how = How.CSS, using = "select[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-State']", AI = false)
		public WebElement drpState;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-HomePhone-GlobalPhoneInputSet-Extension']", AI = false)
		public WebElement inpHomePhoneExtension;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-CellPhone-GlobalPhoneInputSet-Extension']", AI = false)
		public WebElement inpMobilePhoneExtension;

		@IFindBy(how = How.CSS, using = "select[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-LicenseInputSet-LicenseState']", AI = false)
		public WebElement drpLicenseState;

		@IFindBy(how = How.CSS, using = "#NewAdditionalInterestPopup-ContactDetailScreen-ForceDupCheckUpdate>div[role='button']", AI = false)
		public WebElement btnOK;

		@IFindBy(how = How.CSS, using = "#NewAdditionalInterestPopup-ContactDetailScreen-Update>div[role='button']", AI = false)
		public WebElement btnOK_1;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-WorkPhone-GlobalPhoneInputSet-PhoneDisplay']", AI = false)
		public WebElement inpWorkPhone_3;

		@IFindBy(how = How.CSS, using = "#NewAdditionalInterestPopup-ContactDetailScreen-Edit>div[role='button']", AI = false)
		public WebElement btnEdit;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressSummary']", AI = false)
		public WebElement inpAddress_6;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-LicenseInputSet-LicenseNumber']", AI = false)
		public WebElement inpLicense;

		@IFindBy(how = How.CSS, using = "#NewAdditionalInterestPopup-__crumb__", AI = false)
		public WebElement btnReturntoDetails;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-WorkPhone-GlobalPhoneInputSet-NationalSubscriberNumber']", AI = false)
		public WebElement inpWorkPhone;

		@IFindBy(how = How.CSS, using = "#NewAdditionalInterestPopup-ContactDetailScreen-Cancel>div[role='button']", AI = false)
		public WebElement btnCancel;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-FaxPhone-GlobalPhoneInputSet-Extension']", AI = false)
		public WebElement inpFaxPhoneExtension;

		@IFindBy(how = How.CSS, using = "#NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-DateOfBirth_dateIcon", AI = false)
		public WebElement btnDateofBirthDateIcon;

		@IFindBy(how = How.CSS, using = "#NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactRoleDetailCardTab", AI = false)
		public WebElement btnContactDetail;

		@IFindBy(how = How.CSS, using = "#NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-LinkedAddressInputSet-LinkAddressMenu-0-contactDetail>div[role='menuitem']", AI = false)
		public WebElement btnFaeDickensPrimaryNamedInsured;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-GlobalPersonNameInputSet-LastName']", AI = false)
		public WebElement inpLastname;

		@IFindBy(how = How.CSS, using = "select[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-PrimaryPhone']", AI = false)
		public WebElement drpPrimaryPhone;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressDescription']", AI = false)
		public WebElement inpAddressDescription;

		@IFindBy(how = How.CSS, using = "#NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-PostalCode-AutoFillIcon", AI = false)
		public WebElement btnAutoFillIcon_7;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-County']", AI = false)
		public WebElement inpCounty;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-AdditionalInterestInfoDV-ContractNumber']", AI = false)
		public WebElement inpContractNumber;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-HomePhone-GlobalPhoneInputSet-NationalSubscriberNumber']", AI = false)
		public WebElement inpHomePhone;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-CellPhone-GlobalPhoneInputSet-NationalSubscriberNumber']", AI = false)
		public WebElement inpMobilePhone;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine3']", AI = false)
		public WebElement inpAddress3;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine1']", AI = false)
		public WebElement inpAddress1;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine2']", AI = false)
		public WebElement inpAddress2;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-OfficialIDInputSet-OfficialIDDV_Input']", AI = false)
		public WebElement inpSSN;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-LinkedAddressInputSet-LinkAddressMenu']", AI = false)
		public WebElement inpAddress;

		@IFindBy(how = How.CSS, using = "select[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-ContactCurrency-ContactCurrencyInputSet-PreferredSettlementCurrency']", AI = false)
		public WebElement drpPreferredCurrency;

		@IFindBy(how = How.CSS, using = "#NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-City-AutoFillIcon", AI = false)
		public WebElement btnAutoFillIcon;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-WorkPhone-GlobalPhoneInputSet-Extension']", AI = false)
		public WebElement inpWorkPhoneExtension;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-GlobalPersonNameInputSet-NameSummary']", AI = false)
		public WebElement inpName;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-FaxPhone-GlobalPhoneInputSet-PhoneDisplay']", AI = false)
		public WebElement inpFaxPhone_5;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-AdditionalInterestInfoDV-CertRequired']", AI = false)
		public WebElement rdbCertificateRequired;

		@IFindBy(how = How.CSS, using = "select[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-MaritalStatus']", AI = false)
		public WebElement drpMaritalStatus;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-GlobalPersonNameInputSet-Particle']", AI = false)
		public WebElement inpParticle;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-City']", AI = false)
		public WebElement inpCity;

		@IFindBy(how = How.CSS, using = "select[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-WorkPhone-GlobalPhoneInputSet-CountryCode']", AI = false)
		public WebElement drpWorkPhoneRegionCode;

		@IFindBy(how = How.CSS, using = "select[name='NewAdditionalInterestPopup-ContactDetailScreen-AdditionalInterestInfoDV-Type']", AI = false)
		public WebElement drpInterestType;

		@IFindBy(how = How.XPATH, using = "//div[contains(text(),'New Additional Interest')]", AI = false)
		public WebElement lblTtlBar;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-EmailAddress1']", AI = false)
		public WebElement inpPrimaryEmail;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-DateOfBirth']", AI = false)
		public WebElement inpDateofBirth;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-GlobalPersonNameInputSet-MiddleName']", AI = false)
		public WebElement inpMiddlename;

		@IFindBy(how = How.CSS, using = "input[name='NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-CellPhone-GlobalPhoneInputSet-PhoneDisplay']", AI = false)
		public WebElement inpMobilePhone_4;

		@IFindBy(how = How.CSS, using = "#NewAdditionalInterestPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-LinkedAddressInputSet-LinkAddressMenu-0-contactDetail-PrimaryAddress>div[role='menuitem']", AI = false)
		public WebElement btnPrimaryAddress;

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
		}public NewAdditionalInterestPage enterHomePhone_2(WebDriver driver,String HomePhone_2) {
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
		public NewAdditionalInterestPage enterFaxPhone(WebDriver driver,String FaxPhone) {
			BrowserActions.type(driver, inpFaxPhone,FaxPhone, "FaxPhone");
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
		public NewAdditionalInterestPage selectHomePhoneRegionCode(WebDriver driver,String HomePhoneRegionCode)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpHomePhoneRegionCode,HomePhoneRegionCode,"HomePhoneRegionCode");
			return this;
		}
		public NewAdditionalInterestPage selectAddressType(WebDriver driver,String AddressType)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpAddressType,AddressType,"AddressType");
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
		public NewAdditionalInterestPage enterHomePhoneExtension(WebDriver driver,String HomePhoneExtension) {
			BrowserActions.type(driver, inpHomePhoneExtension,HomePhoneExtension, "HomePhoneExtension");
			return this;
		}
		public NewAdditionalInterestPage enterMobilePhoneExtension(WebDriver driver,String MobilePhoneExtension) {
			BrowserActions.type(driver, inpMobilePhoneExtension,MobilePhoneExtension, "MobilePhoneExtension");
			return this;
		}
		public NewAdditionalInterestPage selectLicenseState(WebDriver driver,String LicenseState)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpLicenseState,LicenseState,"LicenseState");
			return this;
		}
		public NewAdditionalInterestPage clickOK(WebDriver driver)  {
			BrowserActions.click(driver, btnOK,"OK");
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
		public NewAdditionalInterestPage enterAddress_6(WebDriver driver,String Address_6) {
			BrowserActions.type(driver, inpAddress_6,Address_6, "Address_6");
			return this;
		}
		public NewAdditionalInterestPage enterLicense(WebDriver driver,String License) {
			BrowserActions.type(driver, inpLicense,License, "License");
			return this;
		}
		public NewAdditionalInterestPage clickReturntoDetails(WebDriver driver)  {
			BrowserActions.click(driver, btnReturntoDetails,"ReturntoDetails");
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
		public NewAdditionalInterestPage clickContactDetail(WebDriver driver)  {
			BrowserActions.click(driver, btnContactDetail,"ContactDetail");
			return this;
		}
		public NewAdditionalInterestPage clickFaeDickensPrimaryNamedInsured(WebDriver driver)  {
			BrowserActions.click(driver, btnFaeDickensPrimaryNamedInsured,"FaeDickensPrimaryNamedInsured");
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
		public NewAdditionalInterestPage clickAutoFillIcon_7(WebDriver driver)  {
			BrowserActions.click(driver, btnAutoFillIcon_7,"AutoFillIcon_7");
			return this;
		}
		public NewAdditionalInterestPage enterCounty(WebDriver driver,String County) {
			BrowserActions.type(driver, inpCounty,County, "County");
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
		public NewAdditionalInterestPage enterMobilePhone(WebDriver driver,String MobilePhone) {
			BrowserActions.type(driver, inpMobilePhone,MobilePhone, "MobilePhone");
			return this;
		}
		public NewAdditionalInterestPage enterAddress3(WebDriver driver,String Address3) {
			BrowserActions.type(driver, inpAddress3,Address3, "Address3");
			return this;
		}
		public NewAdditionalInterestPage enterAddress1(WebDriver driver,String Address1) {
			BrowserActions.type(driver, inpAddress1,Address1, "Address1");
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
		public NewAdditionalInterestPage clickAutoFillIcon(WebDriver driver)  {
			BrowserActions.click(driver, btnAutoFillIcon,"AutoFillIcon");
			return this;
		}
		public NewAdditionalInterestPage enterWorkPhoneExtension(WebDriver driver,String WorkPhoneExtension) {
			BrowserActions.type(driver, inpWorkPhoneExtension,WorkPhoneExtension, "WorkPhoneExtension");
			return this;
		}
		public NewAdditionalInterestPage enterName(WebDriver driver,String Name) {
			BrowserActions.type(driver, inpName,Name, "Name");
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
		public NewAdditionalInterestPage enterParticle(WebDriver driver,String Particle) {
			BrowserActions.type(driver, inpParticle,Particle, "Particle");
			return this;
		}
		public NewAdditionalInterestPage enterCity(WebDriver driver,String City) {
			BrowserActions.type(driver, inpCity,City, "City");
			return this;
		}
		public NewAdditionalInterestPage selectWorkPhoneRegionCode(WebDriver driver,String WorkPhoneRegionCode)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpWorkPhoneRegionCode,WorkPhoneRegionCode,"WorkPhoneRegionCode");
			return this;
		}
		public NewAdditionalInterestPage selectInterestType(WebDriver driver,String InterestType)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpInterestType,InterestType,"InterestType");
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
	}


}
