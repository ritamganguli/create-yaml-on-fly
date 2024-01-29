package com.aspire.guidewire.pc.pages.common;
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

public class PolicyInfoPage extends LoadableComponent<PolicyInfoPage>{

	WebDriver driver;
	String elementIdentifier;
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

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-PolicyInfoInputSet-DividedSourcePolicy']", AI = false)
	public WebElement inpSplitSourcePolicy;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-9-item>div[role='menuitem']", AI = false)
	public WebElement btnGetRiskInformationProducer;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_CopySubmission>div[role='menuitem']", AI = false)
	public WebElement btnCopySubmission;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-4-item>div[role='menuitem']", AI = false)
	public WebElement btnGeneralreminderdiary;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AccountInfoInputSet-ChangePrimaryNamedInsuredButton-PrimaryNamedInsuredABContactAdder>div[role='menuitem']", AI = false)
	public WebElement btnFromAddressBook;

	@IFindBy(how = How.CSS, using = "input[name$='ExpirationDate']", AI = false)
	public WebElement inpExpirationDate;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-8-item>div[role='menuitem']", AI = false)
	public WebElement btnGetReinsuranceQuote;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AccountInfoInputSet-ChangePrimaryNamedInsuredButton-ChangePrimaryNamedInsuredButtonMenuIcon']", AI = false)
	public WebElement drpChangePrimaryNamedInsuredButtonMenuIcon;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-PolicyInfoProducerOfRecordInputSet-ProducerCode']", AI = false)
	public WebElement drpProducerCode;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-13-item>div[role='menuitem']", AI = false)
	public WebElement btnReview45dayUWPeriod;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AccountInfoInputSet-CommercialInputSet-BusOps textarea", AI = false)
	public WebElement inpBusOps;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-PolicyInfoProducerOfRecordInputSet-Producer']", AI = false)
	public WebElement inpOrganization;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-SecondaryNamedInsuredInputSet-ChangeSecondaryNamedInsuredButton-ExistingNamedInsured>div[role='menuitem']", AI = false)
	public WebElement btnExistingContact_1;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-1-item>div[role='menuitem']", AI = false)
	public WebElement btnGetAuditInternalPersonnel;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-JobWizardToolbarButtonSet-BindOptions-BindOnly>div[role='menuitem']", AI = false)
	public WebElement btnBindOnly;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-estimatedPremiumInput", AI = false)
	public WebElement lblEstimatedPremium;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AccountInfoInputSet-PolicyAddressDisplayInputSet-globalAddressContainer-GlobalAddressInputSet-PostalCode-AutoFillIcon", AI = false)
	public WebElement btnAutoFillIcon_1;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-SecondaryNamedInsuredInputSet-ChangeSecondaryNamedInsuredLabel']", AI = false)
	public WebElement inpSecondaryNamedInsured;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-PolicyInfoInputSet-RateAsOfDate']", AI = false)
	public WebElement inpRateasofDate;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-JobGroupItem>div[role='menuitem']", AI = false)
	public WebElement btnSG01838332082908930690;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-0-NewActivityMenuItemSet_Category>div[role='menuitem']", AI = false)
	public WebElement btnInterview;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-MultiQuoteAcceleratedMenuActions-PolicyPeriodSelector-PolicyPeriodSelector_Arg']", AI = false)
	public WebElement drpPolicyPeriodSelector_Arg;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AccountInfoInputSet-PolicyAddressDisplayInputSet-AddressDescription']", AI = false)
	public WebElement inpAddressDescription;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-6-item>div[role='menuitem']", AI = false)
	public WebElement btnPerformanceReview;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-DiagWorksheetItem-ShowDiagWorksheet>div[role='menuitem']", AI = false)
	public WebElement btnShowPartialWorksheet;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-1-item>div[role='menuitem']", AI = false)
	public WebElement btn60daydiary;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-JobWizardToolbarButtonSet-Versions-NewVersion>div[role='menuitem']", AI = false)
	public WebElement btnStartMultiVersion;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AccountInfoInputSet-PolicyAddressDisplayInputSet-globalAddressContainer-GlobalAddressInputSet-County']", AI = false)
	public WebElement inpCounty;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Prev>div[role='button']", AI = false)
	public WebElement btnBack;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-PolicyInfoInputSet-WrittenDate']", AI = false)
	public WebElement inpWrittenDate;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-PolicyVersions>div[role='menuitem']", AI = false)
	public WebElement btnPolicyVersions_1;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-15-item>div[role='menuitem']", AI = false)
	public WebElement btnReviewProducer;

	@IFindBy(how = How.CSS, using = "div[id$='Next']", AI = false)
	public WebElement btnNext;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AccountInfoInputSet-Phone-GlobalPhoneInputSet-Extension']", AI = false)
	public WebElement inpPhoneExtension;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-RiskEvaluation>div[role='menuitem']", AI = false)
	public WebElement btnRiskAnalysis_1;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-10-item>div[role='menuitem']", AI = false)
	public WebElement btnQuoteRequired;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-8-item>div[role='menuitem']", AI = false)
	public WebElement btnPolicyReviewMidterm;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-JobWizardToolbarButtonSet-Versions-ViewSideBySide>div[role='menuitem']", AI = false)
	public WebElement btnViewSideBySideVersions;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AccountInfoInputSet-ChangePrimaryNamedInsuredButton-AdditionalNamedPersonAdder>div[role='menuitem']", AI = false)
	public WebElement btnNewPerson;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AdditionalNamedInsuredInputSet-NamedInsuredsLV_tb-Remove>div[role='button']", AI = false)
	public WebElement btnRemove_1;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-JobWizardToolbarButtonSet-Draft>div[role='button']", AI = false)
	public WebElement btnSaveDraft;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-0-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0183833208;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-3-item>div[role='menuitem']", AI = false)
	public WebElement btnGetBureauData;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AccountInfoInputSet-IndustryCode']", AI = false)
	public WebElement inpIndustryCode;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Reinsurance>div[role='menuitem']", AI = false)
	public WebElement btnReinsurance;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-BillingInfo>div[role='menuitem']", AI = false)
	public WebElement btnPayment;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AccountInfoInputSet-ChangePolicyAddressButton-EditPolicyAddressMenuItem>div[role='menuitem']", AI = false)
	public WebElement btnEditCurrentAddress;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Change-WizardMenuActions_ChangeEffDate>div[role='menuitem']", AI = false)
	public WebElement btnEffectiveDate;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-QuoteRequestedAlert .gw-AlertBar--label", AI = false)
	public WebElement lblQuoteRequestedAlert;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AccountInfoInputSet-PolicyAddressDisplayInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine3']", AI = false)
	public WebElement inpAddress3;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AccountInfoInputSet-PolicyAddressDisplayInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine1']", AI = false)
	public WebElement inpAddress1;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AccountInfoInputSet-PolicyAddressDisplayInputSet-AddressType']", AI = false)
	public WebElement drpAddressType;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AccountInfoInputSet-PolicyAddressDisplayInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine2']", AI = false)
	public WebElement inpAddress2;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AccountInfoInputSet-PolicyOfficialIDInputSet-OfficialIDDV_Input']", AI = false)
	public WebElement inpSSN;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewDocument-NewJobDocumentMenuItemSet-PolicyPeriodNewDocumentMenuItemSet_Template>div[role='menuitem']", AI = false)
	public WebElement btnCreatefromatemplate;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-JobWizardToolbarButtonSet-Versions-SideBySide>div[role='menuitem']", AI = false)
	public WebElement btnStartSidebySide;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Archiving>div[role='menuitem']", AI = false)
	public WebElement btnArchiving;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AccountInfoInputSet-PolicyAddressDisplayInputSet-globalAddressContainer-GlobalAddressInputSet-PostalCode']", AI = false)
	public WebElement inpZIPCode;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AccountInfoInputSet-PolicyAddressDisplayInputSet-globalAddressContainer-GlobalAddressInputSet-City-AutoFillIcon", AI = false)
	public WebElement btnAutoFillIcon;

	@IFindBy(how = How.CSS, using = "select[name$='OrganizationType']", AI = false)
	public WebElement drpOrganizationType;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AccountInfoInputSet-ChangePolicyAddressButton-OtherExistingAddress>div[role='menuitem']", AI = false)
	public WebElement btnExistingAddress;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-JobWizardToolbarButtonSet-CloseOptions-NotTakenJob>div[role='menuitem']", AI = false)
	public WebElement btnNotTaken;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AccountInfoInputSet-ChangePolicyAddressButton']", AI = false)
	public WebElement inpPolicyAddress;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-PolicyInfoInputSet-BaseState']", AI = false)
	public WebElement drpBaseState;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Documents>div[role='menuitem']", AI = false)
	public WebElement btnDocuments;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-UWCompanyInputSet-AutoSelectUWCompany>div[role='button']", AI = false)
	public WebElement btnAutoSelectUWCompany;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-2-item>div[role='menuitem']", AI = false)
	public WebElement btn90daydiary;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AccountInfoInputSet-Name']", AI = false)
	public WebElement inpName;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AccountInfoInputSet-ChangePolicyAddressButton-ChangePolicyAddressButtonMenuIcon']", AI = false)
	public WebElement drpChangePolicyAddressButtonMenuIcon;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-PolicyInfoInputSet-TermNumber']", AI = false)
	public WebElement inpTermNumber;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-UWCompanyInputSet-UWCompany']", AI = false)
	public WebElement drpUWCompany;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-JobWizardToolbarButtonSet-QuoteTypeToolbarButtonSet-Quote>div[role='button']", AI = false)
	public WebElement btnQuote;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-PersonalVehicles>div[role='menuitem']", AI = false)
	public WebElement btnVehicles;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-JobWizardToolbarButtonSet-BindOptions>div[role='button']", AI = false)
	public WebElement btnBindOptions;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AccountInfoInputSet-PolicyAddressDisplayInputSet-globalAddressContainer-GlobalAddressInputSet-Country']", AI = false)
	public WebElement drpCountry;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AccountInfoInputSet-PolicyAddressDisplayInputSet-globalAddressContainer-GlobalAddressInputSet-State']", AI = false)
	public WebElement drpState;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-JobWizardToolbarButtonSet-Unlock>div[role='button']", AI = false)
	public WebElement btnReleaseLock;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Archiving-WizardMenuActions_SuspendResumeArchiving>div[role='menuitem']", AI = false)
	public WebElement btnEnableDisable;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-JobWizardToolbarButtonSet-BindOptions-BindAndIssue>div[role='menuitem']", AI = false)
	public WebElement btnIssuePolicy;

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

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-MultiQuoteAcceleratedMenuActions-PolicyPeriodSelector", AI = false)
	public WebElement btnPolicyPeriodSelector;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-1-NewActivityMenuItemSet_Category>div[role='menuitem']", AI = false)
	public WebElement btnNewmail;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-7-item>div[role='menuitem']", AI = false)
	public WebElement btnGetMotorVehicleReports;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-PreQualification>div[role='menuitem']", AI = false)
	public WebElement btnQualification;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Notes>div[role='menuitem']", AI = false)
	public WebElement btnNotes;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-ViewMultiLineQuote>div[role='menuitem']", AI = false)
	public WebElement btnQuote_1;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-PolicyInfoInputSet-EffectiveDate']", AI = false)
	public WebElement inpEffectiveDate;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-5-item>div[role='menuitem']", AI = false)
	public WebElement btnGetInspectionLossControl;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-SecondaryNamedInsuredInputSet-ChangeSecondaryNamedInsuredButton']", AI = false)
	public WebElement inpSecondaryNamedInsured_1;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Participants>div[role='menuitem']", AI = false)
	public WebElement btnParticipants;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create>div[role='menuitem']", AI = false)
	public WebElement btnCreate;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AccountInfoInputSet-OrganizationTypeOtherDescription']", AI = false)
	public WebElement inpDescription;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-PALine>div[role='menuitem']", AI = false)
	public WebElement btnPACoverages;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-4-NewActivityMenuItemSet_Category-0-item>div[role='menuitem']", AI = false)
	public WebElement btnReviewandapprove;

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

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AccountInfoInputSet-PolicyAddressDisplayInputSet-globalAddressContainer-GlobalAddressInputSet-City']", AI = false)
	public WebElement inpCity;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto>div[role='menuitem']", AI = false)
	public WebElement btnGoto;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-PolicyInfoInputSet-PrimaryLanguage']", AI = false)
	public WebElement drpPreferredLanguage;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-PolicyInfoInputSet-RewrittenSourcePolicy']", AI = false)
	public WebElement inpSourcePolicy;

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

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AccountInfoInputSet-CommercialInputSet-AssignedRisk']", AI = false)
	public WebElement rdbAssignedRisk;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Offering>div[role='menuitem']", AI = false)
	public WebElement btnOfferings;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-9-item>div[role='menuitem']", AI = false)
	public WebElement btnPolicyReviewRenewal;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AccountInfoInputSet-IndustryCode-SelectIndustryCode", AI = false)
	public WebElement btnSearch;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewNote>div[role='menuitem']", AI = false)
	public WebElement btnNewNote;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-SideBySide>div[role='menuitem']", AI = false)
	public WebElement btnSidebySideQuoting;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-RiskAnalysis>div[role='menuitem']", AI = false)
	public WebElement btnRiskAnalysis;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-0-NewActivityMenuItemSet_Category-1-item>div[role='menuitem']", AI = false)
	public WebElement btnMeetwithProducerAgency;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AccountInfoInputSet-PolicyAddressDisplayInputSet-globalAddressContainer-GlobalAddressInputSet-AddressSummary']", AI = false)
	public WebElement inpAddressSummary;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-CollectCreditCard>div[role='menuitem']", AI = false)
	public WebElement btnCollectCreditCard;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AccountInfoInputSet-Phone-GlobalPhoneInputSet-CountryCode']", AI = false)
	public WebElement drpPhoneRegionCode;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AccountInfoInputSet-PrimaryNamedInsuredLabel']", AI = false)
	public WebElement inpPrimaryNamedInsured;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AccountInfoInputSet-ChangePrimaryNamedInsuredButton']", AI = false)
	public WebElement inpPrimaryNamedInsured_1;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-11-item>div[role='menuitem']", AI = false)
	public WebElement btnRatiooutofrange;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-JobWizardToolbarButtonSet-ConvertToFullApp>div[role='button']", AI = false)
	public WebElement btnFullApp;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-PolicyReview>div[role='menuitem']", AI = false)
	public WebElement btnPolicyReview;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-DiagWorksheetItem>div[role='menuitem']", AI = false)
	public WebElement btnDiagnosticData;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AccountInfoInputSet-Phone-GlobalPhoneInputSet-NationalSubscriberNumber']", AI = false)
	public WebElement inpPhone;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-11-item>div[role='menuitem']", AI = false)
	public WebElement btnManuallyrateandquotepolicy;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-PADrivers>div[role='menuitem']", AI = false)
	public WebElement btnDrivers;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-History>div[role='menuitem']", AI = false)
	public WebElement btnHistory;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category>div[role='menuitem']", AI = false)
	public WebElement btnReminder;

	@IFindBy(how = How.CSS, using = "div[id$='PolicyInfoScreen-ttlBar']", AI = false)
	public WebElement lblTtlBar;

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

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-1-NewActivityMenuItemSet_Category-0-item>div[role='menuitem']", AI = false)
	public WebElement btnReviewnewmail;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup>div[role='menuitem']", AI = false)
	public WebElement btnGroup;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-3-item>div[role='menuitem']", AI = false)
	public WebElement btnCancelasplitpolicy;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-PolicyInfoInputSet-AffinityGroup-SelectAffinityGroup", AI = false)
	public WebElement btnSearch_1;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-SecondaryNamedInsuredInputSet-ChangeSecondaryNamedInsuredButton-AdditionalNamedPersonAdder>div[role='menuitem']", AI = false)
	public WebElement btnNewPerson_1;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-2-item>div[role='menuitem']", AI = false)
	public WebElement btnGetAuditOutsideService;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Change-WizardMenuActions_CopyPolicyData>div[role='menuitem']", AI = false)
	public WebElement btnCopyData;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-SecondaryNamedInsuredInputSet-ChangeSecondaryNamedInsuredButton-ChangeSecondaryNamedInsuredButtonMenuIcon']", AI = false)
	public WebElement drpChangeSecondaryNamedInsuredButtonMenuIcon;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-5-item>div[role='menuitem']", AI = false)
	public WebElement btnNewAuditAssignment;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-16-item>div[role='menuitem']", AI = false)
	public WebElement btnRewritetoNewAccount;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AccountInfoInputSet-ChangePrimaryNamedInsuredButton-AdditionalNamedCompanyAdder>div[role='menuitem']", AI = false)
	public WebElement btnNewCompany;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-SecondaryNamedInsuredInputSet-ChangeSecondaryNamedInsuredButton-SecondaryNamedInsuredABContactAdder>div[role='menuitem']", AI = false)
	public WebElement btnFromAddressBook_1;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-QuoteRequestedAlert-CloseBtn", AI = false)
	public WebElement btnClose;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-DateQuoteNeeded']", AI = false)
	public WebElement inpDateQuoteNeeded;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-12-item>div[role='menuitem']", AI = false)
	public WebElement btnReview30dayUWPeriod;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-ManageBranches>div[role='menuitem']", AI = false)
	public WebElement btnPolicyVersions;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-14-item>div[role='menuitem']", AI = false)
	public WebElement btnReview60dayUWPeriod;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-JobWizardToolbarButtonSet-EditPolicy>div[role='button']", AI = false)
	public WebElement btnEditPolicyTransaction;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AdditionalNamedInsuredInputSet-NamedInsuredsLV_tb-Add>div[role='button']", AI = false)
	public WebElement btnAdd_1;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity>div[role='menuitem']", AI = false)
	public WebElement btnNewActivity;

	@IFindBy(how = How.CSS, using = "select[name$='TermType']", AI = false)
	public WebElement drpTermType;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-AccountInfoInputSet-Phone-GlobalPhoneInputSet-PhoneDisplay']", AI = false)
	public WebElement inpPhone_1;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Cancel>div[role='button']", AI = false)
	public WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-JobWizardToolbarButtonSet-CloseOptions>div[role='button']", AI = false)
	public WebElement btnCloseOptions;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup>div[role='menuitem']", AI = false)
	public WebElement btnPolicyContract;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_ToPolicyFile>div[role='menuitem']", AI = false)
	public WebElement btnPolicyFile;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-17-item>div[role='menuitem']", AI = false)
	public WebElement btnVerifycoverage;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-PreferredCurrencyInputSet-PreferredSettlementCurrency']", AI = false)
	public WebElement drpSettlement;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category>div[role='menuitem']", AI = false)
	public WebElement btnRequest;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-4-item>div[role='menuitem']", AI = false)
	public WebElement btnGetCreditReports;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-JobWizardToolbarButtonSet-CloseOptions-Decline>div[role='menuitem']", AI = false)
	public WebElement btnDecline;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardActionsMenuItemSet-SubmissionInfo>div[role='menuitem']", AI = false)
	public WebElement btnSubManager;
	
	@IFindBy(how = How.CSS, using = "div[id$='ChangeSecondaryNamedInsuredButton-AdditionalNamedPersonAdder']", AI = false)
	public WebElement lnksecondaryInsuredPerson;
	
	@IFindBy(how = How.CSS, using ="div[id$='AdditionalNamedInsuredInputSet-NamedInsuredsLV_tb-AddContactsButton-1-ContactType'],div[id$='AdditionalInsuredLV_tb-AddContactsButton-1-ContactType']", AI = false)
	public WebElement lnkAdditionalInsuredPerson;
	
	@IFindBy(how = How.CSS, using = "div[id$='AdditionalNamedInsuredInputSet-NamedInsuredsLV_tb-AddContactsButton']", AI = false)
	 public WebElement btnAddAdditionalInsured;
	
	@IFindBy(how = How.CSS, using = "#RewriteWizard-Next", AI = false)
	public WebElement btnNext_1;
	
	@IFindBy(how = How.CSS, using = "div[id$='ChangeSecondaryNamedInsuredButtonMenuIcon']", AI = false)
	public WebElement drpAddNewsecPerson;

	public PolicyInfoPage(){
	}

	public PolicyInfoPage(WebDriver driver){
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, Utils.maxElementWait);
		PageFactory.initElements(finder, this);
		elementLayer = new ElementLayer(driver);
}
	
	public PolicyInfoPage(WebDriver driver,int timeout){
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, timeout);
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
public PolicyInfoPage clickWorkplan(WebDriver driver)  {
					BrowserActions.click(driver, btnWorkplan,"Workplan");
				    return this;
			}
public PolicyInfoPage enterSplitSourcePolicy(WebDriver driver,String SplitSourcePolicy) {
		            BrowserActions.type(driver, inpSplitSourcePolicy,SplitSourcePolicy, "SplitSourcePolicy");
			        return this;
           }
public PolicyInfoPage clickGetRiskInformationProducer(WebDriver driver)  {
					BrowserActions.click(driver, btnGetRiskInformationProducer,"GetRiskInformationProducer");
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
public PolicyInfoPage enterExpirationDate(WebDriver driver,String ExpirationDate) {
		            BrowserActions.type(driver, inpExpirationDate,ExpirationDate,true,3,"ExpirationDate");
			        return this;
           }
public PolicyInfoPage clickGetReinsuranceQuote(WebDriver driver)  {
					BrowserActions.click(driver, btnGetReinsuranceQuote,"GetReinsuranceQuote");
				    return this;
			}
public PolicyInfoPage selectChangePrimaryNamedInsuredButtonMenuIcon(WebDriver driver,String ChangePrimaryNamedInsuredButtonMenuIcon)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpChangePrimaryNamedInsuredButtonMenuIcon,ChangePrimaryNamedInsuredButtonMenuIcon,"ChangePrimaryNamedInsuredButtonMenuIcon");
				    return this;
			}
public PolicyInfoPage selectProducerCode(WebDriver driver,String ProducerCode)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpProducerCode,ProducerCode,"ProducerCode");
				    return this;
			}
public PolicyInfoPage clickReview45dayUWPeriod(WebDriver driver)  {
					BrowserActions.click(driver, btnReview45dayUWPeriod,"Review45dayUWPeriod");
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
public PolicyInfoPage clickExistingContact_1(WebDriver driver)  {
					BrowserActions.click(driver, btnExistingContact_1,"ExistingContact_1");
				    return this;
			}
public PolicyInfoPage clickGetAuditInternalPersonnel(WebDriver driver)  {
					BrowserActions.click(driver, btnGetAuditInternalPersonnel,"GetAuditInternalPersonnel");
				    return this;
			}
public PolicyInfoPage clickBindOnly(WebDriver driver)  {
					BrowserActions.click(driver, btnBindOnly,"BindOnly");
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
public PolicyInfoPage clickSG01838332082908930690(WebDriver driver)  {
					BrowserActions.click(driver, btnSG01838332082908930690,"SG01838332082908930690");
				    return this;
			}
public PolicyInfoPage clickInterview(WebDriver driver)  {
					BrowserActions.click(driver, btnInterview,"Interview");
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
public PolicyInfoPage clickPerformanceReview(WebDriver driver)  {
					BrowserActions.click(driver, btnPerformanceReview,"PerformanceReview");
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
public PolicyInfoPage clickStartMultiVersion(WebDriver driver)  {
					BrowserActions.click(driver, btnStartMultiVersion,"StartMultiVersion");
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
public PolicyInfoPage clickReviewProducer(WebDriver driver)  {
					BrowserActions.click(driver, btnReviewProducer,"ReviewProducer");
				    return this;
			}
public PolicyInfoPage clickNext(WebDriver driver)  {
					BrowserActions.click(driver, btnNext,"Next");
				    return this;
			}
public PolicyInfoPage enterPhoneExtension(WebDriver driver,String PhoneExtension) {
		            BrowserActions.type(driver, inpPhoneExtension,PhoneExtension, "PhoneExtension");
			        return this;
           }
public PolicyInfoPage clickRiskAnalysis_1(WebDriver driver)  {
					BrowserActions.click(driver, btnRiskAnalysis_1,"RiskAnalysis_1");
				    return this;
			}
public PolicyInfoPage clickQuoteRequired(WebDriver driver)  {
					BrowserActions.click(driver, btnQuoteRequired,"QuoteRequired");
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
public PolicyInfoPage clickNewPerson(WebDriver driver)  {
					BrowserActions.click(driver, btnNewPerson,"NewPerson");
				    return this;
			}
public PolicyInfoPage clickRemove_1(WebDriver driver)  {
					BrowserActions.click(driver, btnRemove_1,"Remove_1");
				    return this;
			}
public PolicyInfoPage clickSaveDraft(WebDriver driver)  {
					BrowserActions.click(driver, btnSaveDraft,"SaveDraft");
				    return this;
			}
public PolicyInfoPage clickPA0183833208(WebDriver driver)  {
					BrowserActions.click(driver, btnPA0183833208,"PA0183833208");
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
public PolicyInfoPage clickPayment(WebDriver driver)  {
					BrowserActions.click(driver, btnPayment,"Payment");
				    return this;
			}
public PolicyInfoPage clickEditCurrentAddress(WebDriver driver)  {
					BrowserActions.click(driver, btnEditCurrentAddress,"EditCurrentAddress");
				    return this;
			}
public PolicyInfoPage clickEffectiveDate(WebDriver driver)  {
					BrowserActions.click(driver, btnEffectiveDate,"EffectiveDate");
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
public PolicyInfoPage selectAddressType(WebDriver driver,String AddressType)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpAddressType,AddressType,"AddressType");
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
public PolicyInfoPage clickCreatefromatemplate(WebDriver driver)  {
					BrowserActions.click(driver, btnCreatefromatemplate,"Createfromatemplate");
				    return this;
			}
public PolicyInfoPage clickStartSidebySide(WebDriver driver)  {
					BrowserActions.click(driver, btnStartSidebySide,"StartSidebySide");
				    return this;
			}
public PolicyInfoPage clickArchiving(WebDriver driver)  {
					BrowserActions.click(driver, btnArchiving,"Archiving");
				    return this;
			}
public PolicyInfoPage enterZIPCode(WebDriver driver,String ZIPCode) {
		            BrowserActions.type(driver, inpZIPCode,ZIPCode, "ZIPCode");
			        return this;
           }
public PolicyInfoPage clickAutoFillIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnAutoFillIcon,"AutoFillIcon");
				    return this;
			}
public PolicyInfoPage selectOrganizationType(WebDriver driver,String OrganizationType)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpOrganizationType,OrganizationType,0.5,"OrganizationType");
				    return this;
			}
public PolicyInfoPage clickExistingAddress(WebDriver driver)  {
					BrowserActions.click(driver, btnExistingAddress,"ExistingAddress");
				    return this;
			}
public PolicyInfoPage clickNotTaken(WebDriver driver)  {
					BrowserActions.click(driver, btnNotTaken,"NotTaken");
				    return this;
			}
public PolicyInfoPage enterPolicyAddress(WebDriver driver,String PolicyAddress) {
		            BrowserActions.type(driver, inpPolicyAddress,PolicyAddress, "PolicyAddress");
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
public PolicyInfoPage click90daydiary(WebDriver driver)  {
					BrowserActions.click(driver, btn90daydiary,"90daydiary");
				    return this;
			}
public PolicyInfoPage enterName(WebDriver driver,String Name) {
		            BrowserActions.type(driver, inpName,Name, "Name");
			        return this;
           }
public PolicyInfoPage selectChangePolicyAddressButtonMenuIcon(WebDriver driver,String ChangePolicyAddressButtonMenuIcon)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpChangePolicyAddressButtonMenuIcon,ChangePolicyAddressButtonMenuIcon,"ChangePolicyAddressButtonMenuIcon");
				    return this;
			}
public PolicyInfoPage enterTermNumber(WebDriver driver,String TermNumber) {
		            BrowserActions.type(driver, inpTermNumber,TermNumber, "TermNumber");
			        return this;
           }
public PolicyInfoPage selectUWCompany(WebDriver driver,String UWCompany)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpUWCompany,UWCompany,"UWCompany");
				    return this;
			}
public PolicyInfoPage clickQuote(WebDriver driver)  {
					BrowserActions.click(driver, btnQuote,"Quote");
				    return this;
			}
public PolicyInfoPage clickVehicles(WebDriver driver)  {
					BrowserActions.click(driver, btnVehicles,"Vehicles");
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
public PolicyInfoPage clickReleaseLock(WebDriver driver)  {
					BrowserActions.click(driver, btnReleaseLock,"ReleaseLock");
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
public PolicyInfoPage clickSelectOrganization(WebDriver driver)  {
					BrowserActions.click(driver, btnSelectOrganization,"SelectOrganization");
				    return this;
			}
public PolicyInfoPage clickCreateNewProducer(WebDriver driver)  {
					BrowserActions.click(driver, btnCreateNewProducer,"CreateNewProducer");
				    return this;
			}
public PolicyInfoPage clickAdd(WebDriver driver)  {
					BrowserActions.click(driver, btnAdd,1.5,"Add");
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
public PolicyInfoPage clickQualification(WebDriver driver)  {
					BrowserActions.click(driver, btnQualification,"Qualification");
				    return this;
			}
public PolicyInfoPage clickNotes(WebDriver driver)  {
					BrowserActions.click(driver, btnNotes,"Notes");
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
public PolicyInfoPage enterSecondaryNamedInsured_1(WebDriver driver,String SecondaryNamedInsured_1) {
		            BrowserActions.type(driver, inpSecondaryNamedInsured_1,SecondaryNamedInsured_1, "SecondaryNamedInsured_1");
			        return this;
           }
public PolicyInfoPage clickParticipants(WebDriver driver)  {
					BrowserActions.click(driver, btnParticipants,"Participants");
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
public PolicyInfoPage clickPACoverages(WebDriver driver)  {
					BrowserActions.click(driver, btnPACoverages,"PACoverages");
				    return this;
			}
public PolicyInfoPage clickReviewandapprove(WebDriver driver)  {
					BrowserActions.click(driver, btnReviewandapprove,"Reviewandapprove");
				    return this;
			}
public PolicyInfoPage clickLegalreview(WebDriver driver)  {
					BrowserActions.click(driver, btnLegalreview,"Legalreview");
				    return this;
			}
public PolicyInfoPage clickNewDocument(WebDriver driver)  {
					BrowserActions.click(driver, btnNewDocument,"NewDocument");
				    return this;
			}
public PolicyInfoPage clickPolicynotification(WebDriver driver)  {
					BrowserActions.click(driver, btnPolicynotification,"Policynotification");
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
public PolicyInfoPage clickProductDefinition(WebDriver driver)  {
					BrowserActions.click(driver, btnProductDefinition,"ProductDefinition");
				    return this;
			}
public PolicyInfoPage clickGetInspectionOutsideService(WebDriver driver)  {
					BrowserActions.click(driver, btnGetInspectionOutsideService,"GetInspectionOutsideService");
				    return this;
			}
public PolicyInfoPage clickUnderwriterReview(WebDriver driver)  {
					BrowserActions.click(driver, btnUnderwriterReview,"UnderwriterReview");
				    return this;
			}
public PolicyInfoPage clickMeetwithInsured(WebDriver driver)  {
					BrowserActions.click(driver, btnMeetwithInsured,"MeetwithInsured");
				    return this;
			}
public PolicyInfoPage click30daydiary(WebDriver driver)  {
					BrowserActions.click(driver, btn30daydiary,"30daydiary");
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
public PolicyInfoPage clickSearch(WebDriver driver)  {
					BrowserActions.click(driver, btnSearch,"Search");
				    return this;
			}
public PolicyInfoPage clickNewNote(WebDriver driver)  {
					BrowserActions.click(driver, btnNewNote,"NewNote");
				    return this;
			}
public PolicyInfoPage clickSidebySideQuoting(WebDriver driver)  {
					BrowserActions.click(driver, btnSidebySideQuoting,"SidebySideQuoting");
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
public PolicyInfoPage enterAddressSummary(WebDriver driver,String AddressSummary) {
		            BrowserActions.type(driver, inpAddressSummary,AddressSummary, "AddressSummary");
			        return this;
           }
public PolicyInfoPage clickCollectCreditCard(WebDriver driver)  {
					BrowserActions.click(driver, btnCollectCreditCard,"CollectCreditCard");
				    return this;
			}
public PolicyInfoPage selectPhoneRegionCode(WebDriver driver,String PhoneRegionCode)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPhoneRegionCode,PhoneRegionCode,"PhoneRegionCode");
				    return this;
			}
public PolicyInfoPage enterPrimaryNamedInsured(WebDriver driver,String PrimaryNamedInsured) {
		            BrowserActions.type(driver, inpPrimaryNamedInsured,PrimaryNamedInsured, "PrimaryNamedInsured");
			        return this;
           }
public PolicyInfoPage enterPrimaryNamedInsured_1(WebDriver driver,String PrimaryNamedInsured_1) {
		            BrowserActions.type(driver, inpPrimaryNamedInsured_1,PrimaryNamedInsured_1, "PrimaryNamedInsured_1");
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
public PolicyInfoPage clickPolicyReview(WebDriver driver)  {
					BrowserActions.click(driver, btnPolicyReview,"PolicyReview");
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
public PolicyInfoPage clickManuallyrateandquotepolicy(WebDriver driver)  {
					BrowserActions.click(driver, btnManuallyrateandquotepolicy,"Manuallyrateandquotepolicy");
				    return this;
			}
public PolicyInfoPage clickDrivers(WebDriver driver)  {
					BrowserActions.click(driver, btnDrivers,"Drivers");
				    return this;
			}
public PolicyInfoPage clickHistory(WebDriver driver)  {
					BrowserActions.click(driver, btnHistory,"History");
				    return this;
			}
public PolicyInfoPage clickReminder(WebDriver driver)  {
					BrowserActions.click(driver, btnReminder,"Reminder");
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
public PolicyInfoPage clickReviewnewmail(WebDriver driver)  {
					BrowserActions.click(driver, btnReviewnewmail,"Reviewnewmail");
				    return this;
			}
public PolicyInfoPage clickGroup(WebDriver driver)  {
					BrowserActions.click(driver, btnGroup,"Group");
				    return this;
			}
public PolicyInfoPage clickCancelasplitpolicy(WebDriver driver)  {
					BrowserActions.click(driver, btnCancelasplitpolicy,"Cancelasplitpolicy");
				    return this;
			}
public PolicyInfoPage clickSearch_1(WebDriver driver)  {
					BrowserActions.click(driver, btnSearch_1,"Search_1");
				    return this;
			}
public PolicyInfoPage clickNewPerson_1(WebDriver driver)  {
					BrowserActions.click(driver, btnNewPerson_1,"NewPerson_1");
				    return this;
			}
public PolicyInfoPage clickGetAuditOutsideService(WebDriver driver)  {
					BrowserActions.click(driver, btnGetAuditOutsideService,"GetAuditOutsideService");
				    return this;
			}
public PolicyInfoPage clickCopyData(WebDriver driver)  {
					BrowserActions.click(driver, btnCopyData,"CopyData");
				    return this;
			}
public PolicyInfoPage selectChangeSecondaryNamedInsuredButtonMenuIcon(WebDriver driver,String ChangeSecondaryNamedInsuredButtonMenuIcon)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpChangeSecondaryNamedInsuredButtonMenuIcon,ChangeSecondaryNamedInsuredButtonMenuIcon,"ChangeSecondaryNamedInsuredButtonMenuIcon");
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
public PolicyInfoPage clickClose(WebDriver driver)  {
					BrowserActions.click(driver, btnClose,"Close");
				    return this;
			}
public PolicyInfoPage enterDateQuoteNeeded(WebDriver driver,String DateQuoteNeeded) {
		            BrowserActions.type(driver, inpDateQuoteNeeded,DateQuoteNeeded, "DateQuoteNeeded");
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
public PolicyInfoPage clickNewActivity(WebDriver driver)  {
					BrowserActions.click(driver, btnNewActivity,"NewActivity");
				    return this;
			}
public PolicyInfoPage selectTermType(WebDriver driver,String TermType)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpTermType,TermType,1,"TermType");
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
public PolicyInfoPage clickCloseOptions(WebDriver driver)  {
					BrowserActions.click(driver, btnCloseOptions,"CloseOptions");
				    return this;
			}
public PolicyInfoPage clickPolicyContract(WebDriver driver)  {
					BrowserActions.click(driver, btnPolicyContract,"PolicyContract");
				    return this;
			}
public PolicyInfoPage clickPolicyFile(WebDriver driver)  {
					BrowserActions.click(driver, btnPolicyFile,"PolicyFile");
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
public PolicyInfoPage clickRequest(WebDriver driver)  {
					BrowserActions.click(driver, btnRequest,"Request");
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
public PolicyInfoPage clickSubManager(WebDriver driver)  {
					BrowserActions.click(driver, btnSubManager,"SubManager");
				    return this;
			}
public PolicyInfoPage clickSecondaryInsuredForPerson(WebDriver driver) {
BrowserActions.click(driver, lnksecondaryInsuredPerson,"secondary insured person");
return this;
}
public PolicyInfoPage clickAdditionalInsuredForPerson(WebDriver driver) {
BrowserActions.click(driver, lnkAdditionalInsuredPerson,"Additional insured Person");
return this;
}

public PolicyInfoPage clickAddAdditionalInsured(WebDriver driver) {
BrowserActions.click(driver, btnAddAdditionalInsured,"Add button Additional insured");
return this;
}
public PolicyInfoPage clickNext_1(WebDriver driver)  {
	BrowserActions.click(driver, btnNext_1,"Next");
    return this;
}
public void clickAddNewSecondaryInsurer(WebDriver driver )  {
	BrowserActions.click(driver, drpAddNewsecPerson,"New Secondary Person");
}
}
