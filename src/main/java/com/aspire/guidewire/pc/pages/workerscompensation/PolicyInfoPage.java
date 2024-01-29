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

public class PolicyInfoPage  extends LoadableComponent<PolicyInfoPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementIdentifier;
	String elementObject;
	HashMap<String, String> getPageObjects;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
	//public TopNavBar topnavbar;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Workplan>div[role='menuitem']", AI = false)
	public WebElement btnWorkplan;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-41-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0078666227;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-PolicyInfoInputSet-DividedSourcePolicy']", AI = false)
	public WebElement inpSplitSourcePolicy;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-49-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnHOP0050339114;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_CopySubmission>div[role='menuitem']", AI = false)
	public WebElement btnCopySubmission;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-4-item>div[role='menuitem']", AI = false)
	public WebElement btnGeneralreminderdiary;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AccountInfoInputSet-ChangePrimaryNamedInsuredButton-PrimaryNamedInsuredABContactAdder>div[role='menuitem']", AI = false)
	public WebElement btnFromAddressBook;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-8-item>div[role='menuitem']", AI = false)
	public WebElement btnGetReinsuranceQuote;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-PolicyInfoProducerOfRecordInputSet-ProducerCode']", AI = false)
	public WebElement drpProducerCode;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-32-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0006100874;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-13-item>div[role='menuitem']", AI = false)
	public WebElement btnReview45dayUWPeriod;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-52-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnHOP0197361676;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AccountInfoInputSet-ChangePolicyAddressButton-ChangePolicyAddressButtonMenuIcon>div[role='button']", AI = false)
	public WebElement btnChangePolicyAddressButtonMenuIcon;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-SecondaryNamedInsuredInputSet-ChangeSecondaryNamedInsuredButton-ExistingNamedInsured>div[role='menuitem']", AI = false)
	public WebElement btnExistingContact_1;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-JobWizardToolbarButtonSet-BindOptions-BindOnly>div[role='menuitem']", AI = false)
	public WebElement btnBindOnly;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AdditionalNamedInsuredInputSet-NamedInsuredsLV_tb-AddContactsButton-AddExistingContact-4-ExistingAdditionalNamedInsured>div[role='button']", AI = false)
	public WebElement btnKjhkjhkjhhjhhnbnbmbmbnmb;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-0-NewActivityMenuItemSet_Category>div[role='menuitem']", AI = false)
	public WebElement btnInterview;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-6-item>div[role='menuitem']", AI = false)
	public WebElement btnPerformanceReview;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-JobWizardToolbarButtonSet-Versions-NewVersion>div[role='menuitem']", AI = false)
	public WebElement btnStartMultiVersion;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-15-item>div[role='menuitem']", AI = false)
	public WebElement btnReviewProducer;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AccountInfoInputSet-Phone-GlobalPhoneInputSet-Extension']", AI = false)
	public WebElement inpPhoneExtension;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-46-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0002720800;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-RiskEvaluation>div[role='menuitem']", AI = false)
	public WebElement btnRiskAnalysis_1;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-37-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnWC0236269354;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-8-item>div[role='menuitem']", AI = false)
	public WebElement btnPolicyReviewMidterm;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-JobWizardToolbarButtonSet-Versions-ViewSideBySide>div[role='menuitem']", AI = false)
	public WebElement btnViewSideBySideVersions;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AdditionalNamedInsuredInputSet-NamedInsuredsLV_tb-Remove>div[role='button']", AI = false)
	public WebElement btnRemove_1;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AdditionalNamedInsuredInputSet-NamedInsuredsLV_tb-AddContactsButton-AddExistingContact-5-ExistingAdditionalNamedInsured>div[role='button']", AI = false)
	public WebElement btnQqqqqqqqqqqaaaaaaaaaaaaaa;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-BillingInfo>div[role='menuitem']", AI = false)
	public WebElement btnPayment;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AccountInfoInputSet-ChangePolicyAddressButton-EditPolicyAddressMenuItem>div[role='menuitem']", AI = false)
	public WebElement btnEditCurrentAddress;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AdditionalNamedInsuredInputSet-NamedInsuredsLV_tb-AddContactsButton-AddExistingContact-3-ExistingAdditionalNamedInsured>div[role='button']", AI = false)
	public WebElement btnGodman;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Change-WizardMenuActions_ChangeEffDate>div[role='menuitem']", AI = false)
	public WebElement btnEffectiveDate;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-36-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnHOP0204404881;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-35-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0049303658;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AccountInfoInputSet-PolicyAddressDisplayInputSet-AddressType']", AI = false)
	public WebElement drpAddressType;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-13-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnHOP0197148664;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-8-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnHOP0212470370;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AccountInfoInputSet-PolicyAddressDisplayInputSet-globalAddressContainer-GlobalAddressInputSet-PostalCode']", AI = false)
	public WebElement inpZIPCode;

	@IFindBy(how = How.CSS, using = "select[name$='OrganizationType']", AI = false)
	public WebElement drpOrganizationType;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AccountInfoInputSet-ChangePolicyAddressButton-OtherExistingAddress>div[role='menuitem']", AI = false)
	public WebElement btnExistingAddress;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AccountInfoInputSet-ChangePolicyAddressButton']", AI = false)
	public WebElement inpPolicyAddress;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-1-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0001142472;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-63-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnHOP0033409290;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-47-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnWC0151392695;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-2-item>div[role='menuitem']", AI = false)
	public WebElement btn90daydiary;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-PolicyInfoInputSet-TermNumber']", AI = false)
	public WebElement inpTermNumber;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-JobGroupItem>div[role='menuitem']", AI = false)
	public WebElement btnSG00050847959093173949;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-JobWizardToolbarButtonSet-BindOptions>div[role='button']", AI = false)
	public WebElement btnBindOptions;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AccountInfoInputSet-PolicyAddressDisplayInputSet-globalAddressContainer-GlobalAddressInputSet-Country']", AI = false)
	public WebElement drpCountry;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AccountInfoInputSet-PolicyAddressDisplayInputSet-globalAddressContainer-GlobalAddressInputSet-State']", AI = false)
	public WebElement drpState;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-26-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0007833400;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-62-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0004676744;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Archiving-WizardMenuActions_SuspendResumeArchiving>div[role='menuitem']", AI = false)
	public WebElement btnEnableDisable;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-JobWizardToolbarButtonSet-BindOptions-BindAndIssue>div[role='menuitem']", AI = false)
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

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AdditionalNamedInsuredInputSet-NamedInsuredsLV_tb-AddContactsButton-AddExistingContact>div[role='button']", AI = false)
	public WebElement btnAddExistingContact;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-PreQualification>div[role='menuitem']", AI = false)
	public WebElement btnQualification;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-22-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0060945695;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-SecondaryNamedInsuredInputSet-ChangeSecondaryNamedInsuredButton']", AI = false)
	public WebElement inpSecondaryNamedInsured_1;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Participants>div[role='menuitem']", AI = false)
	public WebElement btnParticipants;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-24-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0002436160;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-4-NewActivityMenuItemSet_Category-0-item>div[role='menuitem']", AI = false)
	public WebElement btnReviewandapprove;

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

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AdditionalNamedInsuredInputSet-NamedInsuredsLV_tb-AddContactsButton-AddExistingContact-2-ExistingAdditionalNamedInsured>div[role='button']", AI = false)
	public WebElement btnDasklddsads;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-ProductDefinition>div[role='menuitem']", AI = false)
	public WebElement btnProductDefinition;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-6-item>div[role='menuitem']", AI = false)
	public WebElement btnGetInspectionOutsideService;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-53-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnCPP0049614273;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-0-NewActivityMenuItemSet_Category-0-item>div[role='menuitem']", AI = false)
	public WebElement btnMeetwithInsured;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AccountInfoInputSet-CommercialInputSet-AssignedRisk']", AI = false)
	public WebElement rdbAssignedRisk;

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

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AccountInfoInputSet-PrimaryNamedInsuredLabel']", AI = false)
	public WebElement inpPrimaryNamedInsured;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-17-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0032919629;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-67-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnHOP0236891855;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-PolicyReview>div[role='menuitem']", AI = false)
	public WebElement btnPolicyReview;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-61-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0021575179;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-11-item>div[role='menuitem']", AI = false)
	public WebElement btnManuallyrateandquotepolicy;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-History>div[role='menuitem']", AI = false)
	public WebElement btnHistory;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-5-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0037153281;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Change>div[role='menuitem']", AI = false)
	public WebElement btnEdit;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-JobWizardToolbarButtonSet-CloseOptions-WithdrawJob>div[role='menuitem']", AI = false)
	public WebElement btnWithdrawTransaction;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-PolicyInfo>div[role='menuitem']", AI = false)
	public WebElement btnPolicyInfo;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AccountInfoInputSet-ChangePrimaryNamedInsuredButton-OtherExistingContact>div[role='menuitem']", AI = false)
	public WebElement btnExistingContact;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AccountInfoInputSet-CommercialInputSet-YearBusinessStarted']", AI = false)
	public WebElement inpYearBusinessStarted;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-JobWizardToolbarButtonSet-Versions>div[role='button']", AI = false)
	public WebElement btnVersions;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_ToAccountFile>div[role='menuitem']", AI = false)
	public WebElement btnAccountFile;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-SecondaryNamedInsuredInputSet-ChangeSecondaryNamedInsuredButton-RemoveSecondaryNamedInsured>div[role='menuitem']", AI = false)
	public WebElement btnRemove;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-PolicyInfoInputSet-AffinityGroup-SelectAffinityGroup", AI = false)
	public WebElement btnSearch_1;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-29-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnGL0049706212;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AdditionalNamedInsuredInputSet-NamedInsuredsLV_tb-AddContactsButton-1-ContactType>div[role='button']", AI = false)
	public WebElement btnNewPerson_1;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Change-WizardMenuActions_CopyPolicyData>div[role='menuitem']", AI = false)
	public WebElement btnCopyData;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-14-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnHOP0049485577;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-QuoteRequestedAlert-CloseBtn", AI = false)
	public WebElement btnClose;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-DateQuoteNeeded']", AI = false)
	public WebElement inpDateQuoteNeeded;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-14-item>div[role='menuitem']", AI = false)
	public WebElement btnReview60dayUWPeriod;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-JobWizardToolbarButtonSet-EditPolicy>div[role='button']", AI = false)
	public WebElement btnEditPolicyTransaction;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AdditionalNamedInsuredInputSet-NamedInsuredsLV_tb-Add>div[role='button']", AI = false)
	public WebElement btnAdd_1;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-51-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnHOP0082153368;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity>div[role='menuitem']", AI = false)
	public WebElement btnNewActivity;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AccountInfoInputSet-ChangePrimaryNamedInsuredButton-ChangePrimaryNamedInsuredButtonMenuIcon>div[role='button']", AI = false)
	public WebElement btnChangePrimaryNamedInsuredButtonMenuIcon;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-PolicyInfoInputSet-TermType']", AI = false)
	public WebElement drpTermType;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-65-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnHOP0197252661;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-70-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnHOP0207512362;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AccountInfoInputSet-Phone-GlobalPhoneInputSet-PhoneDisplay']", AI = false)
	public WebElement inpPhone_1;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Cancel>div[role='button']", AI = false)
	public WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup>div[role='menuitem']", AI = false)
	public WebElement btnPolicyContract;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-21-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnHOP0198740350;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category>div[role='menuitem']", AI = false)
	public WebElement btnRequest;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AdditionalNamedInsuredInputSet-NamedInsuredsLV_tb-AddContactsButton-AddOtherContact-2-OtherContact>div[role='button']", AI = false)
	public WebElement btnKLSKNASKNDA;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-9-item>div[role='menuitem']", AI = false)
	public WebElement btnGetRiskInformationProducer;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-PolicyInfoInputSet-ExpirationDate']", AI = false)
	public WebElement inpExpirationDate;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AccountInfoInputSet-CommercialInputSet-BusOps textarea", AI = false)
	public WebElement inpBusOps;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-PolicyInfoProducerOfRecordInputSet-Producer']", AI = false)
	public WebElement inpOrganization;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-1-item>div[role='menuitem']", AI = false)
	public WebElement btnGetAuditInternalPersonnel;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-estimatedPremiumInput", AI = false)
	public WebElement lblEstimatedPremium;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AccountInfoInputSet-PolicyAddressDisplayInputSet-globalAddressContainer-GlobalAddressInputSet-PostalCode-AutoFillIcon", AI = false)
	public WebElement btnAutoFillIcon_1;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-SecondaryNamedInsuredInputSet-ChangeSecondaryNamedInsuredLabel']", AI = false)
	public WebElement inpSecondaryNamedInsured;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-PolicyInfoInputSet-RateAsOfDate']", AI = false)
	public WebElement inpRateasofDate;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-MultiQuoteAcceleratedMenuActions-PolicyPeriodSelector-PolicyPeriodSelector_Arg']", AI = false)
	public WebElement drpPolicyPeriodSelector_Arg;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AccountInfoInputSet-PolicyAddressDisplayInputSet-AddressDescription']", AI = false)
	public WebElement inpAddressDescription;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AdditionalNamedInsuredInputSet-NamedInsuredsLV_tb-AddContactsButton-AddOtherContact-0-OtherContact>div[role='button']", AI = false)
	public WebElement btnDhasjdhassaakld;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-DiagWorksheetItem-ShowDiagWorksheet>div[role='menuitem']", AI = false)
	public WebElement btnShowPartialWorksheet;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-1-item>div[role='menuitem']", AI = false)
	public WebElement btn60daydiary;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AccountInfoInputSet-PolicyAddressDisplayInputSet-globalAddressContainer-GlobalAddressInputSet-County']", AI = false)
	public WebElement inpCounty;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Prev>div[role='button']", AI = false)
	public WebElement btnBack;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-PolicyInfoInputSet-WrittenDate']", AI = false)
	public WebElement inpWrittenDate;

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

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AdditionalNamedInsuredInputSet-NamedInsuredsLV_tb-AddContactsButton-0-ContactType>div[role='button']", AI = false)
	public WebElement btnNewCompany_1;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-10-item>div[role='menuitem']", AI = false)
	public WebElement btnQuoteRequired;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AccountInfoInputSet-ChangePrimaryNamedInsuredButton-AdditionalNamedPersonAdder>div[role='menuitem']", AI = false)
	public WebElement btnNewPerson;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-JobWizardToolbarButtonSet-Draft>div[role='button']", AI = false)
	public WebElement btnSaveDraft;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-3-item>div[role='menuitem']", AI = false)
	public WebElement btnGetBureauData;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AccountInfoInputSet-IndustryCode']", AI = false)
	public WebElement inpIndustryCode;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Reinsurance>div[role='menuitem']", AI = false)
	public WebElement btnReinsurance;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-QuoteRequestedAlert .gw-AlertBar--label", AI = false)
	public WebElement lblQuoteRequestedAlert;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-WorkersCompCoverageConfig>div[role='menuitem']", AI = false)
	public WebElement btnWCCoverages;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AccountInfoInputSet-PolicyAddressDisplayInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine3']", AI = false)
	public WebElement inpAddress3;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AccountInfoInputSet-PolicyAddressDisplayInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine1']", AI = false)
	public WebElement inpAddress1;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AccountInfoInputSet-PolicyAddressDisplayInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine2']", AI = false)
	public WebElement inpAddress2;

	@IFindBy(how = How.CSS, using = "input[name$='OfficialIDDV_Input']", AI = false)
	public WebElement inpSSN;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-31-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnHOP0043979661;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-11-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnHOP0043219876;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewDocument-NewJobDocumentMenuItemSet-PolicyPeriodNewDocumentMenuItemSet_Template>div[role='menuitem']", AI = false)
	public WebElement btnCreatefromatemplate;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-27-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0057255712;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-JobWizardToolbarButtonSet-Versions-SideBySide>div[role='menuitem']", AI = false)
	public WebElement btnStartSidebySide;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-57-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnWC0074056230;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Archiving>div[role='menuitem']", AI = false)
	public WebElement btnArchiving;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AccountInfoInputSet-PolicyAddressDisplayInputSet-globalAddressContainer-GlobalAddressInputSet-City-AutoFillIcon", AI = false)
	public WebElement btnAutoFillIcon;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-JobWizardToolbarButtonSet-CloseOptions-NotTakenJob>div[role='menuitem']", AI = false)
	public WebElement btnNotTaken;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-PolicyInfoInputSet-BaseState']", AI = false)
	public WebElement drpBaseState;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Documents>div[role='menuitem']", AI = false)
	public WebElement btnDocuments;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-UWCompanyInputSet-AutoSelectUWCompany>div[role='button']", AI = false)
	public WebElement btnAutoSelectUWCompany;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-59-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0002297637;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AccountInfoInputSet-Name']", AI = false)
	public WebElement inpName;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-UWCompanyInputSet-UWCompany']", AI = false)
	public WebElement drpUWCompany;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AdditionalNamedInsuredInputSet-NamedInsuredsLV_tb-AddContactsButton-AddOtherContact>div[role='button']", AI = false)
	public WebElement btnOtherContacts;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-JobWizardToolbarButtonSet-QuoteTypeToolbarButtonSet-Quote>div[role='button']", AI = false)
	public WebElement btnQuote;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-2-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnHOP0237297240;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-JobWizardToolbarButtonSet-Unlock>div[role='button']", AI = false)
	public WebElement btnReleaseLock;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-45-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnHOP0065001603;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-PolicyInfoProducerOfRecordInputSet-Producer-SelectOrganization", AI = false)
	public WebElement btnSelectOrganization;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-0-item>div[role='menuitem']", AI = false)
	public WebElement btnCreateNewProducer;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AdditionalNamedInsuredInputSet-NamedInsuredsLV_tb-AddContactsButton>div[role='button']", AI = false)
	public WebElement btnAdd;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-PreferredCurrencyInputSet-PreferredCoverageCurrency']", AI = false)
	public WebElement drpCoverage;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AccountInfoInputSet-ChangePolicyAddressButton-AddAddressMenuItem>div[role='menuitem']", AI = false)
	public WebElement btnNewAddress;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-PolicyInfoInputSet-AffinityGroup']", AI = false)
	public WebElement inpName_1;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Forms>div[role='menuitem']", AI = false)
	public WebElement btnForms;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AdditionalNamedInsuredInputSet-NamedInsuredsLV_tb-AddContactsButton-AddExistingContact-AddAll>div[role='button']", AI = false)
	public WebElement btnAddAll;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Notes>div[role='menuitem']", AI = false)
	public WebElement btnNotes;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-SecondaryNamedInsuredInputSet-ChangeSecondaryNamedInsuredButton-ChangeSecondaryNamedInsuredButtonMenuIcon>div[role='button']", AI = false)
	public WebElement btnChangeSecondaryNamedInsuredButtonMenuIcon;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-30-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnHOP0031196546;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-ViewMultiLineQuote>div[role='menuitem']", AI = false)
	public WebElement btnQuote_1;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-PolicyInfoInputSet-EffectiveDate']", AI = false)
	public WebElement inpEffectiveDate;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-5-item>div[role='menuitem']", AI = false)
	public WebElement btnGetInspectionLossControl;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-10-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0007377725;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create>div[role='menuitem']", AI = false)
	public WebElement btnCreate;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AccountInfoInputSet-OrganizationTypeOtherDescription']", AI = false)
	public WebElement inpDescription;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-39-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0031508844;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-10-item>div[role='menuitem']", AI = false)
	public WebElement btnLegalreview;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-43-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0030766380;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-7-item>div[role='menuitem']", AI = false)
	public WebElement btnPolicynotification;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AccountInfoInputSet-PolicyAddressDisplayInputSet-globalAddressContainer-GlobalAddressInputSet-City']", AI = false)
	public WebElement inpCity;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto>div[role='menuitem']", AI = false)
	public WebElement btnGoto;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-PolicyInfoInputSet-PrimaryLanguage']", AI = false)
	public WebElement drpPreferredLanguage;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-PolicyInfoInputSet-RewrittenSourcePolicy']", AI = false)
	public WebElement inpSourcePolicy;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-4-NewActivityMenuItemSet_Category>div[role='menuitem']", AI = false)
	public WebElement btnUnderwriterReview;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-0-item>div[role='menuitem']", AI = false)
	public WebElement btn30daydiary;

	@IFindBy(how = How.CSS, using = "div[id$='SelectIndustryCode']", AI = false)
	public WebElement btnSearch;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-15-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnHOP0207460171;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-SideBySide>div[role='menuitem']", AI = false)
	public WebElement btnSidebySideQuoting;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-33-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0035777317;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-56-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0002939084;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AccountInfoInputSet-PolicyAddressDisplayInputSet-globalAddressContainer-GlobalAddressInputSet-AddressSummary']", AI = false)
	public WebElement inpAddressSummary;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-CollectCreditCard>div[role='menuitem']", AI = false)
	public WebElement btnCollectCreditCard;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-54-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnHOP0043873709;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AccountInfoInputSet-Phone-GlobalPhoneInputSet-CountryCode']", AI = false)
	public WebElement drpPhoneRegionCode;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-6-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnWC0241798473;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AdditionalNamedInsuredInputSet-NamedInsuredsLV_tb-AddContactsButton-AddOtherContact-1-OtherContact>div[role='button']", AI = false)
	public WebElement btnDjAHAaskldaskld;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AccountInfoInputSet-ChangePrimaryNamedInsuredButton']", AI = false)
	public WebElement inpPrimaryNamedInsured_1;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-28-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnGL0197461408;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-11-item>div[role='menuitem']", AI = false)
	public WebElement btnRatiooutofrange;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-JobWizardToolbarButtonSet-ConvertToFullApp>div[role='button']", AI = false)
	public WebElement btnFullApp;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-DiagWorksheetItem>div[role='menuitem']", AI = false)
	public WebElement btnDiagnosticData;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AccountInfoInputSet-Phone-GlobalPhoneInputSet-NationalSubscriberNumber']", AI = false)
	public WebElement inpPhone;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category>div[role='menuitem']", AI = false)
	public WebElement btnReminder;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-ttlBar", AI = false)
	public WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-23-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnWC0065111343;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-68-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0049509735;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-50-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnWC0245251130;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-0-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0005084795;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-64-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0118973213;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AdditionalNamedInsuredInputSet-NamedInsuredsLV_tb-AddContactsButton-AddExistingContact-1-ExistingAdditionalNamedInsured>div[role='button']", AI = false)
	public WebElement btnDaklsdjaskdaklsdj;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AdditionalNamedInsuredInputSet-NamedInsuredsLV_tb-AddContactsButton-AddOtherContact-3-OtherContact>div[role='button']", AI = false)
	public WebElement btnYyyyyyyyykkkkkkkkkkk;

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

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AccountInfoInputSet-ChangePrimaryNamedInsuredButton-AdditionalNamedCompanyAdder>div[role='menuitem']", AI = false)
	public WebElement btnNewCompany;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AdditionalNamedInsuredInputSet-NamedInsuredsLV_tb-AddContactsButton-AddFromSearch>div[role='button']", AI = false)
	public WebElement btnFromAddressBook_1;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-69-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0051075789;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-12-item>div[role='menuitem']", AI = false)
	public WebElement btnReview30dayUWPeriod;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-ManageBranches>div[role='menuitem']", AI = false)
	public WebElement btnPolicyVersions;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-48-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnHOP0082542218;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AdditionalNamedInsuredInputSet-NamedInsuredsLV_tb-AddContactsButton-AddExistingContact-0-ExistingAdditionalNamedInsured>div[role='button']", AI = false)
	public WebElement btnAaaaaaaaaasssssssssss;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-12-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnWC0280492161;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-20-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnGL0049846245;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-JobWizardToolbarButtonSet-CloseOptions>div[role='button']", AI = false)
	public WebElement btnCloseOptions;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_ToPolicyFile>div[role='menuitem']", AI = false)
	public WebElement btnPolicyFile;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-16-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0008939340;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-17-item>div[role='menuitem']", AI = false)
	public WebElement btnVerifycoverage;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-PreferredCurrencyInputSet-PreferredSettlementCurrency']", AI = false)
	public WebElement drpSettlement;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-4-item>div[role='menuitem']", AI = false)
	public WebElement btnGetCreditReports;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-JobWizardToolbarButtonSet-CloseOptions-Decline>div[role='menuitem']", AI = false)
	public WebElement btnDecline;

	@IFindBy(how = How.CSS, using = "div[id=$'SubmissionWizard-WizardMenuActions']>div[role='button']", AI = false)
	public WebElement btnWizardMenuActions;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardActionsMenuItemSet-SubmissionInfo>div[role='menuitem']", AI = false)
	public WebElement btnSubManager;

	@IFindBy(how = How.CSS, using = "div[id$='PolicyInfoScreen-ttlBar']", AI = false)
	public WebElement ttlPolicyInfo;


	public PolicyInfoPage(){
	}

	public PolicyInfoPage(WebDriver driver) {
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

		if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, ttlPolicyInfo))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}
		elementLayer = new ElementLayer(driver);
	}// isLoaded

	public PolicyInfoPage clickWorkplan(WebDriver driver)  {
		BrowserActions.click(driver, btnWorkplan,"Workplan");
		return this;
	}
	public PolicyInfoPage clickPA0078666227(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0078666227,"PA0078666227");
		return this;
	}
	public PolicyInfoPage enterSplitSourcePolicy(WebDriver driver,String SplitSourcePolicy) {
		BrowserActions.type(driver, inpSplitSourcePolicy,SplitSourcePolicy, "SplitSourcePolicy");
		return this;
	}
	public PolicyInfoPage clickHOP0050339114(WebDriver driver)  {
		BrowserActions.click(driver, btnHOP0050339114,"HOP0050339114");
		return this;
	}
	public PolicyInfoPage clickCopySubmission(WebDriver driver)  {
		BrowserActions.click(driver, btnCopySubmission,"CopySubmission");
		return this;
	}
	public PolicyInfoPage clickGeneralreminderdiary(WebDriver driver)  {
		BrowserActions.click(driver, btnGeneralreminderdiary,"Generalreminderdiary");
		return this;
	}
	public PolicyInfoPage clickFromAddressBook(WebDriver driver)  {
		BrowserActions.click(driver, btnFromAddressBook,"FromAddressBook");
		return this;
	}
	public PolicyInfoPage clickGetReinsuranceQuote(WebDriver driver)  {
		BrowserActions.click(driver, btnGetReinsuranceQuote,"GetReinsuranceQuote");
		return this;
	}
	public PolicyInfoPage selectProducerCode(WebDriver driver,String ProducerCode)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpProducerCode,ProducerCode,"ProducerCode");
		return this;
	}
	public PolicyInfoPage clickPA0006100874(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0006100874,"PA0006100874");
		return this;
	}
	public PolicyInfoPage clickReview45dayUWPeriod(WebDriver driver)  {
		BrowserActions.click(driver, btnReview45dayUWPeriod,"Review45dayUWPeriod");
		return this;
	}
	public PolicyInfoPage clickHOP0197361676(WebDriver driver)  {
		BrowserActions.click(driver, btnHOP0197361676,"HOP0197361676");
		return this;
	}
	public PolicyInfoPage clickChangePolicyAddressButtonMenuIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnChangePolicyAddressButtonMenuIcon,"ChangePolicyAddressButtonMenuIcon");
		return this;
	}
	public PolicyInfoPage clickExistingContact_1(WebDriver driver)  {
		BrowserActions.click(driver, btnExistingContact_1,"ExistingContact_1");
		return this;
	}
	public PolicyInfoPage clickBindOnly(WebDriver driver)  {
		BrowserActions.click(driver, btnBindOnly,"BindOnly");
		return this;
	}
	public PolicyInfoPage clickKjhkjhkjhhjhhnbnbmbmbnmb(WebDriver driver)  {
		BrowserActions.click(driver, btnKjhkjhkjhhjhhnbnbmbmbnmb,"Kjhkjhkjhhjhhnbnbmbmbnmb");
		return this;
	}
	public PolicyInfoPage clickInterview(WebDriver driver)  {
		BrowserActions.click(driver, btnInterview,"Interview");
		return this;
	}
	public PolicyInfoPage clickPerformanceReview(WebDriver driver)  {
		BrowserActions.click(driver, btnPerformanceReview,"PerformanceReview");
		return this;
	}
	public PolicyInfoPage clickStartMultiVersion(WebDriver driver)  {
		BrowserActions.click(driver, btnStartMultiVersion,"StartMultiVersion");
		return this;
	}
	public PolicyInfoPage clickReviewProducer(WebDriver driver)  {
		BrowserActions.click(driver, btnReviewProducer,"ReviewProducer");
		return this;
	}
	public PolicyInfoPage enterPhoneExtension(WebDriver driver,String PhoneExtension) {
		BrowserActions.type(driver, inpPhoneExtension,PhoneExtension, "PhoneExtension");
		return this;
	}
	public PolicyInfoPage clickPA0002720800(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0002720800,"PA0002720800");
		return this;
	}
	public PolicyInfoPage clickRiskAnalysis_1(WebDriver driver)  {
		BrowserActions.click(driver, btnRiskAnalysis_1,"RiskAnalysis_1");
		return this;
	}
	public PolicyInfoPage clickWC0236269354(WebDriver driver)  {
		BrowserActions.click(driver, btnWC0236269354,"WC0236269354");
		return this;
	}
	public PolicyInfoPage clickPolicyReviewMidterm(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyReviewMidterm,"PolicyReviewMidterm");
		return this;
	}
	public PolicyInfoPage clickViewSideBySideVersions(WebDriver driver)  {
		BrowserActions.click(driver, btnViewSideBySideVersions,"ViewSideBySideVersions");
		return this;
	}
	public PolicyInfoPage clickRemove_1(WebDriver driver)  {
		BrowserActions.click(driver, btnRemove_1,"Remove_1");
		return this;
	}
	public PolicyInfoPage clickQqqqqqqqqqqaaaaaaaaaaaaaa(WebDriver driver)  {
		BrowserActions.click(driver, btnQqqqqqqqqqqaaaaaaaaaaaaaa,"Qqqqqqqqqqqaaaaaaaaaaaaaa");
		return this;
	}
	public PolicyInfoPage clickPayment(WebDriver driver)  {
		BrowserActions.click(driver, btnPayment,"Payment");
		return this;
	}
	public PolicyInfoPage clickEditCurrentAddress(WebDriver driver)  {
		BrowserActions.click(driver, btnEditCurrentAddress,"EditCurrentAddress");
		return this;
	}
	public PolicyInfoPage clickGodman(WebDriver driver)  {
		BrowserActions.click(driver, btnGodman,"Godman");
		return this;
	}
	public PolicyInfoPage clickEffectiveDate(WebDriver driver)  {
		BrowserActions.click(driver, btnEffectiveDate,"EffectiveDate");
		return this;
	}
	public PolicyInfoPage clickHOP0204404881(WebDriver driver)  {
		BrowserActions.click(driver, btnHOP0204404881,"HOP0204404881");
		return this;
	}
	public PolicyInfoPage clickPA0049303658(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0049303658,"PA0049303658");
		return this;
	}
	public PolicyInfoPage selectAddressType(WebDriver driver,String AddressType)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpAddressType,AddressType,"AddressType");
		return this;
	}
	public PolicyInfoPage clickHOP0197148664(WebDriver driver)  {
		BrowserActions.click(driver, btnHOP0197148664,"HOP0197148664");
		return this;
	}
	public PolicyInfoPage clickHOP0212470370(WebDriver driver)  {
		BrowserActions.click(driver, btnHOP0212470370,"HOP0212470370");
		return this;
	}
	public PolicyInfoPage enterZIPCode(WebDriver driver,String ZIPCode) {
		BrowserActions.type(driver, inpZIPCode,ZIPCode, "ZIPCode");
		return this;
	}
	public PolicyInfoPage selectOrganizationType(WebDriver driver,String OrganizationType)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpOrganizationType,OrganizationType,"OrganizationType");
		return this;
	}
	public PolicyInfoPage clickExistingAddress(WebDriver driver)  {
		BrowserActions.click(driver, btnExistingAddress,"ExistingAddress");
		return this;
	}
	public PolicyInfoPage enterPolicyAddress(WebDriver driver,String PolicyAddress) {
		BrowserActions.type(driver, inpPolicyAddress,PolicyAddress, "PolicyAddress");
		return this;
	}
	public PolicyInfoPage clickPA0001142472(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0001142472,"PA0001142472");
		return this;
	}
	public PolicyInfoPage clickHOP0033409290(WebDriver driver)  {
		BrowserActions.click(driver, btnHOP0033409290,"HOP0033409290");
		return this;
	}
	public PolicyInfoPage clickWC0151392695(WebDriver driver)  {
		BrowserActions.click(driver, btnWC0151392695,"WC0151392695");
		return this;
	}
	public PolicyInfoPage click90daydiary(WebDriver driver)  {
		BrowserActions.click(driver, btn90daydiary,"90daydiary");
		return this;
	}
	public PolicyInfoPage enterTermNumber(WebDriver driver,String TermNumber) {
		BrowserActions.type(driver, inpTermNumber,TermNumber, "TermNumber");
		return this;
	}
	public PolicyInfoPage clickSG00050847959093173949(WebDriver driver)  {
		BrowserActions.click(driver, btnSG00050847959093173949,"SG00050847959093173949");
		return this;
	}
	public PolicyInfoPage clickBindOptions(WebDriver driver)  {
		BrowserActions.click(driver, btnBindOptions,"BindOptions");
		return this;
	}
	public PolicyInfoPage selectCountry(WebDriver driver,String Country)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCountry,Country,"Country");
		return this;
	}
	public PolicyInfoPage selectState(WebDriver driver,String State)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpState,State,"State");
		return this;
	}
	public PolicyInfoPage clickPA0007833400(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0007833400,"PA0007833400");
		return this;
	}
	public PolicyInfoPage clickPA0004676744(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0004676744,"PA0004676744");
		return this;
	}
	public PolicyInfoPage clickEnableDisable(WebDriver driver)  {
		BrowserActions.click(driver, btnEnableDisable,"EnableDisable");
		return this;
	}
	public PolicyInfoPage clickIssuePolicy(WebDriver driver)  {
		BrowserActions.click(driver, btnIssuePolicy,"IssuePolicy");
		return this;
	}
	public PolicyInfoPage clickPA0050170682(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0050170682,"PA0050170682");
		return this;
	}
	public PolicyInfoPage clickPA0092783565(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0092783565,"PA0092783565");
		return this;
	}
	public PolicyInfoPage clickPA0007967715(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0007967715,"PA0007967715");
		return this;
	}
	public PolicyInfoPage clickWCOptions(WebDriver driver)  {
		BrowserActions.click(driver, btnWCOptions,"WCOptions");
		return this;
	}
	public PolicyInfoPage clickPA0049954905(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0049954905,"PA0049954905");
		return this;
	}
	public PolicyInfoPage clickPA0010796895(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0010796895,"PA0010796895");
		return this;
	}
	public PolicyInfoPage clickPolicyPeriodSelector(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyPeriodSelector,"PolicyPeriodSelector");
		return this;
	}
	public PolicyInfoPage clickNewmail(WebDriver driver)  {
		BrowserActions.click(driver, btnNewmail,"Newmail");
		return this;
	}
	public PolicyInfoPage clickGetMotorVehicleReports(WebDriver driver)  {
		BrowserActions.click(driver, btnGetMotorVehicleReports,"GetMotorVehicleReports");
		return this;
	}
	public PolicyInfoPage clickAddExistingContact(WebDriver driver)  {
		BrowserActions.click(driver, btnAddExistingContact,"AddExistingContact");
		return this;
	}
	public PolicyInfoPage clickQualification(WebDriver driver)  {
		BrowserActions.click(driver, btnQualification,"Qualification");
		return this;
	}
	public PolicyInfoPage clickPA0060945695(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0060945695,"PA0060945695");
		return this;
	}
	public PolicyInfoPage enterSecondaryNamedInsured_1(WebDriver driver,String SecondaryNamedInsured_1) {
		BrowserActions.type(driver, inpSecondaryNamedInsured_1,SecondaryNamedInsured_1, "SecondaryNamedInsured_1");
		return this;
	}
	public PolicyInfoPage clickParticipants(WebDriver driver)  {
		BrowserActions.click(driver, btnParticipants,"Participants");
		return this;
	}
	public PolicyInfoPage clickPA0002436160(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0002436160,"PA0002436160");
		return this;
	}
	public PolicyInfoPage clickReviewandapprove(WebDriver driver)  {
		BrowserActions.click(driver, btnReviewandapprove,"Reviewandapprove");
		return this;
	}
	public PolicyInfoPage clickPA0007582893(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0007582893,"PA0007582893");
		return this;
	}
	public PolicyInfoPage clickHOP0199659518(WebDriver driver)  {
		BrowserActions.click(driver, btnHOP0199659518,"HOP0199659518");
		return this;
	}
	public PolicyInfoPage clickNewDocument(WebDriver driver)  {
		BrowserActions.click(driver, btnNewDocument,"NewDocument");
		return this;
	}
	public PolicyInfoPage clickPA0129900022(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0129900022,"PA0129900022");
		return this;
	}
	public PolicyInfoPage clickUploaddocuments(WebDriver driver)  {
		BrowserActions.click(driver, btnUploaddocuments,"Uploaddocuments");
		return this;
	}
	public PolicyInfoPage clickFinish(WebDriver driver)  {
		BrowserActions.click(driver, btnFinish,"Finish");
		return this;
	}
	public PolicyInfoPage clickDasklddsads(WebDriver driver)  {
		BrowserActions.click(driver, btnDasklddsads,"Dasklddsads");
		return this;
	}
	public PolicyInfoPage clickProductDefinition(WebDriver driver)  {
		BrowserActions.click(driver, btnProductDefinition,"ProductDefinition");
		return this;
	}
	public PolicyInfoPage clickGetInspectionOutsideService(WebDriver driver)  {
		BrowserActions.click(driver, btnGetInspectionOutsideService,"GetInspectionOutsideService");
		return this;
	}
	public PolicyInfoPage clickCPP0049614273(WebDriver driver)  {
		BrowserActions.click(driver, btnCPP0049614273,"CPP0049614273");
		return this;
	}
	public PolicyInfoPage clickMeetwithInsured(WebDriver driver)  {
		BrowserActions.click(driver, btnMeetwithInsured,"MeetwithInsured");
		return this;
	}
	public PolicyInfoPage clickAssignedRisk(WebDriver driver)  {
		BrowserActions.click(driver, rdbAssignedRisk,"AssignedRisk");
		return this;
	}
	public PolicyInfoPage clickOfferings(WebDriver driver)  {
		BrowserActions.click(driver, btnOfferings,"Offerings");
		return this;
	}
	public PolicyInfoPage clickPolicyReviewRenewal(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyReviewRenewal,"PolicyReviewRenewal");
		return this;
	}
	public PolicyInfoPage clickNewNote(WebDriver driver)  {
		BrowserActions.click(driver, btnNewNote,"NewNote");
		return this;
	}
	public PolicyInfoPage clickRiskAnalysis(WebDriver driver)  {
		BrowserActions.click(driver, btnRiskAnalysis,"RiskAnalysis");
		return this;
	}
	public PolicyInfoPage clickMeetwithProducerAgency(WebDriver driver)  {
		BrowserActions.click(driver, btnMeetwithProducerAgency,"MeetwithProducerAgency");
		return this;
	}
	public PolicyInfoPage clickPA0050022880(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0050022880,"PA0050022880");
		return this;
	}
	public PolicyInfoPage clickSupplemental(WebDriver driver)  {
		BrowserActions.click(driver, btnSupplemental,"Supplemental");
		return this;
	}
	public PolicyInfoPage enterPrimaryNamedInsured(WebDriver driver,String PrimaryNamedInsured) {
		BrowserActions.type(driver, inpPrimaryNamedInsured,PrimaryNamedInsured, "PrimaryNamedInsured");
		return this;
	}
	public PolicyInfoPage clickPA0032919629(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0032919629,"PA0032919629");
		return this;
	}
	public PolicyInfoPage clickHOP0236891855(WebDriver driver)  {
		BrowserActions.click(driver, btnHOP0236891855,"HOP0236891855");
		return this;
	}
	public PolicyInfoPage clickPolicyReview(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyReview,"PolicyReview");
		return this;
	}
	public PolicyInfoPage clickPA0021575179(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0021575179,"PA0021575179");
		return this;
	}
	public PolicyInfoPage clickManuallyrateandquotepolicy(WebDriver driver)  {
		BrowserActions.click(driver, btnManuallyrateandquotepolicy,"Manuallyrateandquotepolicy");
		return this;
	}
	public PolicyInfoPage clickHistory(WebDriver driver)  {
		BrowserActions.click(driver, btnHistory,"History");
		return this;
	}
	public PolicyInfoPage clickPA0037153281(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0037153281,"PA0037153281");
		return this;
	}
	public PolicyInfoPage clickEdit(WebDriver driver)  {
		BrowserActions.click(driver, btnEdit,"Edit");
		return this;
	}
	public PolicyInfoPage clickWithdrawTransaction(WebDriver driver)  {
		BrowserActions.click(driver, btnWithdrawTransaction,"WithdrawTransaction");
		return this;
	}
	public PolicyInfoPage clickPolicyInfo(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyInfo,"PolicyInfo");
		return this;
	}
	public PolicyInfoPage clickExistingContact(WebDriver driver)  {
		BrowserActions.click(driver, btnExistingContact,"ExistingContact");
		return this;
	}
	public PolicyInfoPage enterYearBusinessStarted(WebDriver driver,String YearBusinessStarted) {
		BrowserActions.type(driver, inpYearBusinessStarted,YearBusinessStarted, "YearBusinessStarted");
		return this;
	}
	public PolicyInfoPage clickVersions(WebDriver driver)  {
		BrowserActions.click(driver, btnVersions,"Versions");
		return this;
	}
	public PolicyInfoPage clickAccountFile(WebDriver driver)  {
		BrowserActions.click(driver, btnAccountFile,"AccountFile");
		return this;
	}
	public PolicyInfoPage clickRemove(WebDriver driver)  {
		BrowserActions.click(driver, btnRemove,"Remove");
		return this;
	}
	public PolicyInfoPage clickSearch_1(WebDriver driver)  {
		BrowserActions.click(driver, btnSearch_1,"Search_1");
		return this;
	}
	public PolicyInfoPage clickGL0049706212(WebDriver driver)  {
		BrowserActions.click(driver, btnGL0049706212,"GL0049706212");
		return this;
	}
	public PolicyInfoPage clickNewPerson_1(WebDriver driver)  {
		BrowserActions.click(driver, btnNewPerson_1,"NewPerson_1");
		return this;
	}
	public PolicyInfoPage clickCopyData(WebDriver driver)  {
		BrowserActions.click(driver, btnCopyData,"CopyData");
		return this;
	}
	public PolicyInfoPage clickHOP0049485577(WebDriver driver)  {
		BrowserActions.click(driver, btnHOP0049485577,"HOP0049485577");
		return this;
	}
	public PolicyInfoPage clickClose(WebDriver driver)  {
		BrowserActions.click(driver, btnClose,"Close");
		return this;
	}
	public PolicyInfoPage enterDateQuoteNeeded(WebDriver driver,String DateQuoteNeeded) {
		BrowserActions.type(driver, inpDateQuoteNeeded,DateQuoteNeeded, "DateQuoteNeeded");
		return this;
	}
	public PolicyInfoPage clickReview60dayUWPeriod(WebDriver driver)  {
		BrowserActions.click(driver, btnReview60dayUWPeriod,"Review60dayUWPeriod");
		return this;
	}
	public PolicyInfoPage clickEditPolicyTransaction(WebDriver driver)  {
		BrowserActions.click(driver, btnEditPolicyTransaction,"EditPolicyTransaction");
		return this;
	}
	public PolicyInfoPage clickAdd_1(WebDriver driver)  {
		BrowserActions.click(driver, btnAdd_1,"Add_1");
		return this;
	}
	public PolicyInfoPage clickHOP0082153368(WebDriver driver)  {
		BrowserActions.click(driver, btnHOP0082153368,"HOP0082153368");
		return this;
	}
	public PolicyInfoPage clickNewActivity(WebDriver driver)  {
		BrowserActions.click(driver, btnNewActivity,"NewActivity");
		return this;
	}
	public PolicyInfoPage clickChangePrimaryNamedInsuredButtonMenuIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnChangePrimaryNamedInsuredButtonMenuIcon,"ChangePrimaryNamedInsuredButtonMenuIcon");
		return this;
	}
	public PolicyInfoPage selectTermType(WebDriver driver,String TermType)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTermType,TermType,"TermType");
		return this;
	}
	public PolicyInfoPage clickHOP0197252661(WebDriver driver)  {
		BrowserActions.click(driver, btnHOP0197252661,"HOP0197252661");
		return this;
	}
	public PolicyInfoPage clickHOP0207512362(WebDriver driver)  {
		BrowserActions.click(driver, btnHOP0207512362,"HOP0207512362");
		return this;
	}
	public PolicyInfoPage enterPhone_1(WebDriver driver,String Phone_1) {
		BrowserActions.type(driver, inpPhone_1,Phone_1, "Phone_1");
		return this;
	}
	public PolicyInfoPage clickCancel(WebDriver driver)  {
		BrowserActions.click(driver, btnCancel,"Cancel");
		return this;
	}
	public PolicyInfoPage clickPolicyContract(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyContract,"PolicyContract");
		return this;
	}
	public PolicyInfoPage clickHOP0198740350(WebDriver driver)  {
		BrowserActions.click(driver, btnHOP0198740350,"HOP0198740350");
		return this;
	}
	public PolicyInfoPage clickRequest(WebDriver driver)  {
		BrowserActions.click(driver, btnRequest,"Request");
		return this;
	}
	public PolicyInfoPage clickKLSKNASKNDA(WebDriver driver)  {
		BrowserActions.click(driver, btnKLSKNASKNDA,"KLSKNASKNDA");
		return this;
	}
	public PolicyInfoPage clickGetRiskInformationProducer(WebDriver driver)  {
		BrowserActions.click(driver, btnGetRiskInformationProducer,"GetRiskInformationProducer");
		return this;
	}
	public PolicyInfoPage enterExpirationDate(WebDriver driver,String ExpirationDate) {
		BrowserActions.type(driver, inpExpirationDate,ExpirationDate, "ExpirationDate");
		return this;
	}
	public PolicyInfoPage enterBusOps(WebDriver driver,String BusOps) {
		BrowserActions.type(driver, inpBusOps,BusOps, "BusOps");
		return this;
	}
	public PolicyInfoPage enterOrganization(WebDriver driver,String Organization) {
		BrowserActions.type(driver, inpOrganization,Organization, "Organization");
		return this;
	}
	public PolicyInfoPage clickGetAuditInternalPersonnel(WebDriver driver)  {
		BrowserActions.click(driver, btnGetAuditInternalPersonnel,"GetAuditInternalPersonnel");
		return this;
	}
	public PolicyInfoPage clickAutoFillIcon_1(WebDriver driver)  {
		BrowserActions.click(driver, btnAutoFillIcon_1,"AutoFillIcon_1");
		return this;
	}
	public PolicyInfoPage enterSecondaryNamedInsured(WebDriver driver,String SecondaryNamedInsured) {
		BrowserActions.type(driver, inpSecondaryNamedInsured,SecondaryNamedInsured, "SecondaryNamedInsured");
		return this;
	}
	public PolicyInfoPage enterRateasofDate(WebDriver driver,String RateasofDate) {
		BrowserActions.type(driver, inpRateasofDate,RateasofDate, "RateasofDate");
		return this;
	}
	public PolicyInfoPage selectPolicyPeriodSelector_Arg(WebDriver driver,String PolicyPeriodSelector_Arg)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPolicyPeriodSelector_Arg,PolicyPeriodSelector_Arg,"PolicyPeriodSelector_Arg");
		return this;
	}
	public PolicyInfoPage enterAddressDescription(WebDriver driver,String AddressDescription) {
		BrowserActions.type(driver, inpAddressDescription,AddressDescription, "AddressDescription");
		return this;
	}
	public PolicyInfoPage clickDhasjdhassaakld(WebDriver driver)  {
		BrowserActions.click(driver, btnDhasjdhassaakld,"Dhasjdhassaakld");
		return this;
	}
	public PolicyInfoPage clickShowPartialWorksheet(WebDriver driver)  {
		BrowserActions.click(driver, btnShowPartialWorksheet,"ShowPartialWorksheet");
		return this;
	}
	public PolicyInfoPage click60daydiary(WebDriver driver)  {
		BrowserActions.click(driver, btn60daydiary,"60daydiary");
		return this;
	}
	public PolicyInfoPage enterCounty(WebDriver driver,String County) {
		BrowserActions.type(driver, inpCounty,County, "County");
		return this;
	}
	public PolicyInfoPage clickBack(WebDriver driver)  {
		BrowserActions.click(driver, btnBack,"Back");
		return this;
	}
	public PolicyInfoPage enterWrittenDate(WebDriver driver,String WrittenDate) {
		BrowserActions.type(driver, inpWrittenDate,WrittenDate, "WrittenDate");
		return this;
	}
	public PolicyInfoPage clickPolicyVersions_1(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyVersions_1,"PolicyVersions_1");
		return this;
	}
	public PolicyInfoPage clickLocations(WebDriver driver)  {
		BrowserActions.click(driver, btnLocations,"Locations");
		return this;
	}
	public PolicyInfoPage clickHOP0029478020(WebDriver driver)  {
		BrowserActions.click(driver, btnHOP0029478020,"HOP0029478020");
		return this;
	}
	public PolicyInfoPage clickNext(WebDriver driver)  {
		BrowserActions.click(driver, btnNext,"Next");
		return this;
	}
	public PolicyInfoPage clickPA0002347765(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0002347765,"PA0002347765");
		return this;
	}
	public PolicyInfoPage clickPA0060823586(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0060823586,"PA0060823586");
		return this;
	}
	public PolicyInfoPage clickNewCompany_1(WebDriver driver)  {
		BrowserActions.click(driver, btnNewCompany_1,"NewCompany_1");
		return this;
	}
	public PolicyInfoPage clickQuoteRequired(WebDriver driver)  {
		BrowserActions.click(driver, btnQuoteRequired,"QuoteRequired");
		return this;
	}
	public PolicyInfoPage clickNewPerson(WebDriver driver)  {
		BrowserActions.click(driver, btnNewPerson,"NewPerson");
		return this;
	}
	public PolicyInfoPage clickSaveDraft(WebDriver driver)  {
		BrowserActions.click(driver, btnSaveDraft,"SaveDraft");
		return this;
	}
	public PolicyInfoPage clickGetBureauData(WebDriver driver)  {
		BrowserActions.click(driver, btnGetBureauData,"GetBureauData");
		return this;
	}
	public PolicyInfoPage enterIndustryCode(WebDriver driver,String IndustryCode) {
		BrowserActions.type(driver, inpIndustryCode,IndustryCode, "IndustryCode");
		return this;
	}
	public PolicyInfoPage clickReinsurance(WebDriver driver)  {
		BrowserActions.click(driver, btnReinsurance,"Reinsurance");
		return this;
	}
	public PolicyInfoPage clickWCCoverages(WebDriver driver)  {
		BrowserActions.click(driver, btnWCCoverages,"WCCoverages");
		return this;
	}
	public PolicyInfoPage enterAddress3(WebDriver driver,String Address3) {
		BrowserActions.type(driver, inpAddress3,Address3, "Address3");
		return this;
	}
	public PolicyInfoPage enterAddress1(WebDriver driver,String Address1) {
		BrowserActions.type(driver, inpAddress1,Address1, "Address1");
		return this;
	}
	public PolicyInfoPage enterAddress2(WebDriver driver,String Address2) {
		BrowserActions.type(driver, inpAddress2,Address2, "Address2");
		return this;
	}
	public PolicyInfoPage enterSSN(WebDriver driver,String SSN) {
		BrowserActions.type(driver, inpSSN,SSN, "SSN");
		return this;
	}
	public PolicyInfoPage clickHOP0043979661(WebDriver driver)  {
		BrowserActions.click(driver, btnHOP0043979661,"HOP0043979661");
		return this;
	}
	public PolicyInfoPage clickHOP0043219876(WebDriver driver)  {
		BrowserActions.click(driver, btnHOP0043219876,"HOP0043219876");
		return this;
	}
	public PolicyInfoPage clickCreatefromatemplate(WebDriver driver)  {
		BrowserActions.click(driver, btnCreatefromatemplate,"Createfromatemplate");
		return this;
	}
	public PolicyInfoPage clickPA0057255712(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0057255712,"PA0057255712");
		return this;
	}
	public PolicyInfoPage clickStartSidebySide(WebDriver driver)  {
		BrowserActions.click(driver, btnStartSidebySide,"StartSidebySide");
		return this;
	}
	public PolicyInfoPage clickWC0074056230(WebDriver driver)  {
		BrowserActions.click(driver, btnWC0074056230,"WC0074056230");
		return this;
	}
	public PolicyInfoPage clickArchiving(WebDriver driver)  {
		BrowserActions.click(driver, btnArchiving,"Archiving");
		return this;
	}
	public PolicyInfoPage clickAutoFillIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnAutoFillIcon,"AutoFillIcon");
		return this;
	}
	public PolicyInfoPage clickNotTaken(WebDriver driver)  {
		BrowserActions.click(driver, btnNotTaken,"NotTaken");
		return this;
	}
	public PolicyInfoPage selectBaseState(WebDriver driver,String BaseState)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpBaseState,BaseState,"BaseState");
		return this;
	}
	public PolicyInfoPage clickDocuments(WebDriver driver)  {
		BrowserActions.click(driver, btnDocuments,"Documents");
		return this;
	}
	public PolicyInfoPage clickAutoSelectUWCompany(WebDriver driver)  {
		BrowserActions.click(driver, btnAutoSelectUWCompany,"AutoSelectUWCompany");
		return this;
	}
	public PolicyInfoPage clickPA0002297637(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0002297637,"PA0002297637");
		return this;
	}
	public PolicyInfoPage enterName(WebDriver driver,String Name) {
		BrowserActions.type(driver, inpName,Name, "Name");
		return this;
	}
	public PolicyInfoPage selectUWCompany(WebDriver driver,String UWCompany)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpUWCompany,UWCompany,"UWCompany");
		return this;
	}
	public PolicyInfoPage clickOtherContacts(WebDriver driver)  {
		BrowserActions.click(driver, btnOtherContacts,"OtherContacts");
		return this;
	}
	public PolicyInfoPage clickQuote(WebDriver driver)  {
		BrowserActions.click(driver, btnQuote,"Quote");
		return this;
	}
	public PolicyInfoPage clickHOP0237297240(WebDriver driver)  {
		BrowserActions.click(driver, btnHOP0237297240,"HOP0237297240");
		return this;
	}
	public PolicyInfoPage clickReleaseLock(WebDriver driver)  {
		BrowserActions.click(driver, btnReleaseLock,"ReleaseLock");
		return this;
	}
	public PolicyInfoPage clickHOP0065001603(WebDriver driver)  {
		BrowserActions.click(driver, btnHOP0065001603,"HOP0065001603");
		return this;
	}
	public PolicyInfoPage clickSelectOrganization(WebDriver driver)  {
		BrowserActions.click(driver, btnSelectOrganization,"SelectOrganization");
		return this;
	}
	public PolicyInfoPage clickCreateNewProducer(WebDriver driver)  {
		BrowserActions.click(driver, btnCreateNewProducer,"CreateNewProducer");
		return this;
	}
	public PolicyInfoPage clickAdd(WebDriver driver)  {
		BrowserActions.click(driver, btnAdd,"Add");
		return this;
	}
	public PolicyInfoPage selectCoverage(WebDriver driver,String Coverage)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCoverage,Coverage,"Coverage");
		return this;
	}
	public PolicyInfoPage clickNewAddress(WebDriver driver)  {
		BrowserActions.click(driver, btnNewAddress,"NewAddress");
		return this;
	}
	public PolicyInfoPage enterName_1(WebDriver driver,String Name_1) {
		BrowserActions.type(driver, inpName_1,Name_1, "Name_1");
		return this;
	}
	public PolicyInfoPage clickForms(WebDriver driver)  {
		BrowserActions.click(driver, btnForms,"Forms");
		return this;
	}
	public PolicyInfoPage clickAddAll(WebDriver driver)  {
		BrowserActions.click(driver, btnAddAll,"AddAll");
		return this;
	}
	public PolicyInfoPage clickNotes(WebDriver driver)  {
		BrowserActions.click(driver, btnNotes,"Notes");
		return this;
	}
	public PolicyInfoPage clickChangeSecondaryNamedInsuredButtonMenuIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnChangeSecondaryNamedInsuredButtonMenuIcon,"ChangeSecondaryNamedInsuredButtonMenuIcon");
		return this;
	}
	public PolicyInfoPage clickHOP0031196546(WebDriver driver)  {
		BrowserActions.click(driver, btnHOP0031196546,"HOP0031196546");
		return this;
	}
	public PolicyInfoPage clickQuote_1(WebDriver driver)  {
		BrowserActions.click(driver, btnQuote_1,"Quote_1");
		return this;
	}
	public PolicyInfoPage enterEffectiveDate(WebDriver driver,String EffectiveDate) {
		BrowserActions.type(driver, inpEffectiveDate,EffectiveDate, "EffectiveDate");
		return this;
	}
	public PolicyInfoPage clickGetInspectionLossControl(WebDriver driver)  {
		BrowserActions.click(driver, btnGetInspectionLossControl,"GetInspectionLossControl");
		return this;
	}
	public PolicyInfoPage clickPA0007377725(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0007377725,"PA0007377725");
		return this;
	}
	public PolicyInfoPage clickCreate(WebDriver driver)  {
		BrowserActions.click(driver, btnCreate,"Create");
		return this;
	}
	public PolicyInfoPage enterDescription(WebDriver driver,String Description) {
		BrowserActions.type(driver, inpDescription,Description, "Description");
		return this;
	}
	public PolicyInfoPage clickPA0031508844(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0031508844,"PA0031508844");
		return this;
	}
	public PolicyInfoPage clickLegalreview(WebDriver driver)  {
		BrowserActions.click(driver, btnLegalreview,"Legalreview");
		return this;
	}
	public PolicyInfoPage clickPA0030766380(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0030766380,"PA0030766380");
		return this;
	}
	public PolicyInfoPage clickPolicynotification(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicynotification,"Policynotification");
		return this;
	}
	public PolicyInfoPage enterCity(WebDriver driver,String City) {
		BrowserActions.type(driver, inpCity,City, "City");
		return this;
	}
	public PolicyInfoPage clickGoto(WebDriver driver)  {
		BrowserActions.click(driver, btnGoto,"Goto");
		return this;
	}
	public PolicyInfoPage selectPreferredLanguage(WebDriver driver,String PreferredLanguage)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPreferredLanguage,PreferredLanguage,"PreferredLanguage");
		return this;
	}
	public PolicyInfoPage enterSourcePolicy(WebDriver driver,String SourcePolicy) {
		BrowserActions.type(driver, inpSourcePolicy,SourcePolicy, "SourcePolicy");
		return this;
	}
	public PolicyInfoPage clickUnderwriterReview(WebDriver driver)  {
		BrowserActions.click(driver, btnUnderwriterReview,"UnderwriterReview");
		return this;
	}
	public PolicyInfoPage click30daydiary(WebDriver driver)  {
		BrowserActions.click(driver, btn30daydiary,"30daydiary");
		return this;
	}
	public PolicyInfoPage clickIndustrySearch(WebDriver driver)  {
		BrowserActions.click(driver, btnSearch,"Search");
		return this;
	}
	public PolicyInfoPage clickHOP0207460171(WebDriver driver)  {
		BrowserActions.click(driver, btnHOP0207460171,"HOP0207460171");
		return this;
	}
	public PolicyInfoPage clickSidebySideQuoting(WebDriver driver)  {
		BrowserActions.click(driver, btnSidebySideQuoting,"SidebySideQuoting");
		return this;
	}
	public PolicyInfoPage clickPA0035777317(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0035777317,"PA0035777317");
		return this;
	}
	public PolicyInfoPage clickPA0002939084(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0002939084,"PA0002939084");
		return this;
	}
	public PolicyInfoPage enterAddressSummary(WebDriver driver,String AddressSummary) {
		BrowserActions.type(driver, inpAddressSummary,AddressSummary, "AddressSummary");
		return this;
	}
	public PolicyInfoPage clickCollectCreditCard(WebDriver driver)  {
		BrowserActions.click(driver, btnCollectCreditCard,"CollectCreditCard");
		return this;
	}
	public PolicyInfoPage clickHOP0043873709(WebDriver driver)  {
		BrowserActions.click(driver, btnHOP0043873709,"HOP0043873709");
		return this;
	}
	public PolicyInfoPage selectPhoneRegionCode(WebDriver driver,String PhoneRegionCode)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPhoneRegionCode,PhoneRegionCode,"PhoneRegionCode");
		return this;
	}
	public PolicyInfoPage clickWC0241798473(WebDriver driver)  {
		BrowserActions.click(driver, btnWC0241798473,"WC0241798473");
		return this;
	}
	public PolicyInfoPage clickDjAHAaskldaskld(WebDriver driver)  {
		BrowserActions.click(driver, btnDjAHAaskldaskld,"DjAHAaskldaskld");
		return this;
	}
	public PolicyInfoPage enterPrimaryNamedInsured_1(WebDriver driver,String PrimaryNamedInsured_1) {
		BrowserActions.type(driver, inpPrimaryNamedInsured_1,PrimaryNamedInsured_1, "PrimaryNamedInsured_1");
		return this;
	}
	public PolicyInfoPage clickGL0197461408(WebDriver driver)  {
		BrowserActions.click(driver, btnGL0197461408,"GL0197461408");
		return this;
	}
	public PolicyInfoPage clickRatiooutofrange(WebDriver driver)  {
		BrowserActions.click(driver, btnRatiooutofrange,"Ratiooutofrange");
		return this;
	}
	public PolicyInfoPage clickFullApp(WebDriver driver)  {
		BrowserActions.click(driver, btnFullApp,"FullApp");
		return this;
	}
	public PolicyInfoPage clickDiagnosticData(WebDriver driver)  {
		BrowserActions.click(driver, btnDiagnosticData,"DiagnosticData");
		return this;
	}
	public PolicyInfoPage enterPhone(WebDriver driver,String Phone) {
		BrowserActions.type(driver, inpPhone,Phone, "Phone");
		return this;
	}
	public PolicyInfoPage clickReminder(WebDriver driver)  {
		BrowserActions.click(driver, btnReminder,"Reminder");
		return this;
	}
	public PolicyInfoPage clickWC0065111343(WebDriver driver)  {
		BrowserActions.click(driver, btnWC0065111343,"WC0065111343");
		return this;
	}
	public PolicyInfoPage clickPA0049509735(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0049509735,"PA0049509735");
		return this;
	}
	public PolicyInfoPage clickWC0245251130(WebDriver driver)  {
		BrowserActions.click(driver, btnWC0245251130,"WC0245251130");
		return this;
	}
	public PolicyInfoPage clickPA0005084795(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0005084795,"PA0005084795");
		return this;
	}
	public PolicyInfoPage clickPA0118973213(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0118973213,"PA0118973213");
		return this;
	}
	public PolicyInfoPage clickDaklsdjaskdaklsdj(WebDriver driver)  {
		BrowserActions.click(driver, btnDaklsdjaskdaklsdj,"Daklsdjaskdaklsdj");
		return this;
	}
	public PolicyInfoPage clickYyyyyyyyykkkkkkkkkkk(WebDriver driver)  {
		BrowserActions.click(driver, btnYyyyyyyyykkkkkkkkkkk,"Yyyyyyyyykkkkkkkkkkk");
		return this;
	}
	public PolicyInfoPage clickPA0130954491(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0130954491,"PA0130954491");
		return this;
	}
	public PolicyInfoPage clickWC0108480880(WebDriver driver)  {
		BrowserActions.click(driver, btnWC0108480880,"WC0108480880");
		return this;
	}
	public PolicyInfoPage clickReviewnewmail(WebDriver driver)  {
		BrowserActions.click(driver, btnReviewnewmail,"Reviewnewmail");
		return this;
	}
	public PolicyInfoPage clickGroup(WebDriver driver)  {
		BrowserActions.click(driver, btnGroup,"Group");
		return this;
	}
	public PolicyInfoPage clickPA0000129766(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0000129766,"PA0000129766");
		return this;
	}
	public PolicyInfoPage clickCancelasplitpolicy(WebDriver driver)  {
		BrowserActions.click(driver, btnCancelasplitpolicy,"Cancelasplitpolicy");
		return this;
	}
	public PolicyInfoPage clickPA0061151875(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0061151875,"PA0061151875");
		return this;
	}
	public PolicyInfoPage clickGetAuditOutsideService(WebDriver driver)  {
		BrowserActions.click(driver, btnGetAuditOutsideService,"GetAuditOutsideService");
		return this;
	}
	public PolicyInfoPage clickNewAuditAssignment(WebDriver driver)  {
		BrowserActions.click(driver, btnNewAuditAssignment,"NewAuditAssignment");
		return this;
	}
	public PolicyInfoPage clickRewritetoNewAccount(WebDriver driver)  {
		BrowserActions.click(driver, btnRewritetoNewAccount,"RewritetoNewAccount");
		return this;
	}
	public PolicyInfoPage clickNewCompany(WebDriver driver)  {
		BrowserActions.click(driver, btnNewCompany,"NewCompany");
		return this;
	}
	public PolicyInfoPage clickFromAddressBook_1(WebDriver driver)  {
		BrowserActions.click(driver, btnFromAddressBook_1,"FromAddressBook_1");
		return this;
	}
	public PolicyInfoPage clickPA0051075789(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0051075789,"PA0051075789");
		return this;
	}
	public PolicyInfoPage clickReview30dayUWPeriod(WebDriver driver)  {
		BrowserActions.click(driver, btnReview30dayUWPeriod,"Review30dayUWPeriod");
		return this;
	}
	public PolicyInfoPage clickPolicyVersions(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyVersions,"PolicyVersions");
		return this;
	}
	public PolicyInfoPage clickHOP0082542218(WebDriver driver)  {
		BrowserActions.click(driver, btnHOP0082542218,"HOP0082542218");
		return this;
	}
	public PolicyInfoPage clickAaaaaaaaaasssssssssss(WebDriver driver)  {
		BrowserActions.click(driver, btnAaaaaaaaaasssssssssss,"Aaaaaaaaaasssssssssss");
		return this;
	}
	public PolicyInfoPage clickWC0280492161(WebDriver driver)  {
		BrowserActions.click(driver, btnWC0280492161,"WC0280492161");
		return this;
	}
	public PolicyInfoPage clickGL0049846245(WebDriver driver)  {
		BrowserActions.click(driver, btnGL0049846245,"GL0049846245");
		return this;
	}
	public PolicyInfoPage clickCloseOptions(WebDriver driver)  {
		BrowserActions.click(driver, btnCloseOptions,"CloseOptions");
		return this;
	}
	public PolicyInfoPage clickPolicyFile(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyFile,"PolicyFile");
		return this;
	}
	public PolicyInfoPage clickPA0008939340(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0008939340,"PA0008939340");
		return this;
	}
	public PolicyInfoPage clickVerifycoverage(WebDriver driver)  {
		BrowserActions.click(driver, btnVerifycoverage,"Verifycoverage");
		return this;
	}
	public PolicyInfoPage selectSettlement(WebDriver driver,String Settlement)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpSettlement,Settlement,"Settlement");
		return this;
	}
	public PolicyInfoPage clickGetCreditReports(WebDriver driver)  {
		BrowserActions.click(driver, btnGetCreditReports,"GetCreditReports");
		return this;
	}
	public PolicyInfoPage clickDecline(WebDriver driver)  {
		BrowserActions.click(driver, btnDecline,"Decline");
		return this;
	}
	public PolicyInfoPage clickWizardMenuActions(WebDriver driver)  {
		BrowserActions.click(driver, btnWizardMenuActions,"WizardMenuActions");
		return this;
	}
	public PolicyInfoPage clickSubManager(WebDriver driver)  {
		BrowserActions.click(driver, btnSubManager,"SubManager");
		return this;
	}
}
