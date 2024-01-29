package com.aspire.guidewire.pc.pages.common;

import java.util.ArrayList;
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

public class StartReinstatementPage extends LoadableComponent<StartReinstatementPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	@IFindBy(how = How.CSS, using = "#ReinstatementWizard-ReinstatementWizard_ReinstatePolicyScreen-JobWizardToolbarButtonSet-HandlePreemptions>div[role='button']", AI = false)
	public WebElement btnHandlePreemption;

	@IFindBy(how = How.CSS, using = "input[name='ReinstatementWizard-ReinstatementWizard_ReinstatePolicyScreen-ReinstatePolicyDV-PolicyInfoInputSet-DividedSourcePolicy']", AI = false)
	public WebElement inpSplitSourcePolicy;

	@IFindBy(how = How.CSS, using = "#ReinstatementWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-9-item>div[role='menuitem']", AI = false)
	public WebElement btnGetRiskInformationProducer;

	@IFindBy(how = How.CSS, using = "#ReinstatementWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-JobGroupItem>div[role='menuitem']", AI = false)
	public WebElement btnJobGroupItem;

	@IFindBy(how = How.CSS, using = "#ReinstatementWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_CopySubmission>div[role='menuitem']", AI = false)
	public WebElement btnCopySubmission;

	@IFindBy(how = How.CSS, using = "#ReinstatementWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-4-item>div[role='menuitem']", AI = false)
	public WebElement btnGeneralreminderdiary;

	@IFindBy(how = How.CSS, using = "input[name='ReinstatementWizard-ReinstatementWizard_ReinstatePolicyScreen-ReinstatePolicyDV-PolicyInfoInputSet-ExpirationDate']", AI = false)
	public WebElement inpExpirationDate;

	@IFindBy(how = How.CSS, using = "#ReinstatementWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-8-item>div[role='menuitem']", AI = false)
	public WebElement btnGetReinsuranceQuote;

	@IFindBy(how = How.CSS, using = "#ReinstatementWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-13-item>div[role='menuitem']", AI = false)
	public WebElement btnReview45dayUWPeriod;

	@IFindBy(how = How.CSS, using = "#ReinstatementWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-1-item>div[role='menuitem']", AI = false)
	public WebElement btnGetAuditInternalPersonnel;

	@IFindBy(how = How.CSS, using = "input[name='ReinstatementWizard-ReinstatementWizard_ReinstatePolicyScreen-ReinstatePolicyDV-PolicyInfoInputSet-RateAsOfDate']", AI = false)
	public WebElement inpRateasofDate;

	@IFindBy(how = How.CSS, using = "#ReinstatementWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-0-NewActivityMenuItemSet_Category>div[role='menuitem']", AI = false)
	public WebElement btnInterview;

	@IFindBy(how = How.CSS, using = "#ReinstatementWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-6-item>div[role='menuitem']", AI = false)
	public WebElement btnPerformanceReview;

	@IFindBy(how = How.CSS, using = "#ReinstatementWizard-WizardMenuActions-DiagWorksheetItem-ShowDiagWorksheet>div[role='menuitem']", AI = false)
	public WebElement btnShowPartialWorksheet;

	@IFindBy(how = How.CSS, using = "#ReinstatementWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-1-item>div[role='menuitem']", AI = false)
	public WebElement btn60daydiary;

	@IFindBy(how = How.CSS, using = "#ReinstatementWizard-Prev>div[role='button']", AI = false)
	public WebElement btnBack;

	@IFindBy(how = How.CSS, using = "input[name='ReinstatementWizard-ReinstatementWizard_ReinstatePolicyScreen-ReinstatePolicyDV-PolicyInfoInputSet-WrittenDate']", AI = false)
	public WebElement inpWrittenDate;

	@IFindBy(how = How.CSS, using = "#ReinstatementWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-15-item>div[role='menuitem']", AI = false)
	public WebElement btnReviewProducer;

	@IFindBy(how = How.CSS, using = "#ReinstatementWizard-Next>div[role='button']", AI = false)
	public WebElement btnNext;

	@IFindBy(how = How.CSS, using = "#ReinstatementWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-10-item>div[role='menuitem']", AI = false)
	public WebElement btnQuoteRequired;

	@IFindBy(how = How.CSS, using = "#ReinstatementWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-8-item>div[role='menuitem']", AI = false)
	public WebElement btnPolicyReviewMidterm;

	@IFindBy(how = How.CSS, using = "#ReinstatementWizard-ReinstatementWizard_ReinstatePolicyScreen-JobWizardToolbarButtonSet-Draft>div[role='button']", AI = false)
	public WebElement btnSaveDraft;

	@IFindBy(how = How.CSS, using = "#ReinstatementWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-3-item>div[role='menuitem']", AI = false)
	public WebElement btnGetBureauData;

	@IFindBy(how = How.CSS, using = "#ReinstatementWizard-WizardMenuActions-WizardMenuActions_Change-WizardMenuActions_ChangeEffDate>div[role='menuitem']", AI = false)
	public WebElement btnEffectiveDate;

	@IFindBy(how = How.CSS, using = "#ReinstatementWizard-ReinstatementWizard_ReinstatePolicyScreen-QuoteRequestedAlert .gw-AlertBar--label", AI = false)
	public WebElement lblQuoteRequestedAlert;

	@IFindBy(how = How.CSS, using = "#ReinstatementWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewDocument-NewJobDocumentMenuItemSet-PolicyPeriodNewDocumentMenuItemSet_Template>div[role='menuitem']", AI = false)
	public WebElement btnCreatefromatemplate;

	@IFindBy(how = How.CSS, using = "#ReinstatementWizard-WizardMenuActions-WizardMenuActions_Archiving>div[role='menuitem']", AI = false)
	public WebElement btnArchiving;

	@IFindBy(how = How.CSS, using = "#ReinstatementWizard-ReinstatementWizard_ReinstatePolicyScreen-JobWizardToolbarButtonSet-Reinstate>div[role='button']", AI = false)
	public WebElement btnReinstate;

	@IFindBy(how = How.CSS, using = "select[name='ReinstatementWizard-ReinstatementWizard_ReinstatePolicyScreen-ReinstatePolicyDV-PolicyInfoInputSet-BaseState']", AI = false)
	public WebElement drpBaseState;

	@IFindBy(how = How.CSS, using = "#ReinstatementWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-2-item>div[role='menuitem']", AI = false)
	public WebElement btn90daydiary;

	@IFindBy(how = How.CSS, using = "input[name='ReinstatementWizard-ReinstatementWizard_ReinstatePolicyScreen-ReinstatePolicyDV-PolicyInfoInputSet-TermNumber']", AI = false)
	public WebElement inpTermNumber;

	@IFindBy(how = How.CSS, using = "input[name='ReinstatementWizard-ReinstatementWizard_ReinstatePolicyScreen-ReinstatePolicyDV-PolicyInfoInputSet-AffinityGroup']", AI = false)
	public WebElement inpName;

	@IFindBy(how = How.CSS, using = "#ReinstatementWizard-ReinstatementWizard_ReinstatePolicyScreen-JobWizardToolbarButtonSet-QuoteTypeToolbarButtonSet-Quote>div[role='button']", AI = false)
	public WebElement btnQuote;

	@IFindBy(how = How.CSS, using = "#ReinstatementWizard-ReinstatementWizard_ReinstatePolicyScreen-JobWizardToolbarButtonSet-ResolveWithFutureUnboundPeriods>div[role='button']", AI = false)
	public WebElement btnApplyChangeToRenewal_1;

	@IFindBy(how = How.CSS, using = "#ReinstatementWizard-ReinstatementWizard_ReinstatePolicyScreen-JobWizardToolbarButtonSet-Unlock>div[role='button']", AI = false)
	public WebElement btnReleaseLock;

	@IFindBy(how = How.CSS, using = "#ReinstatementWizard-WizardMenuActions-WizardMenuActions_Archiving-WizardMenuActions_SuspendResumeArchiving>div[role='menuitem']", AI = false)
	public WebElement btnEnableDisable;

	@IFindBy(how = How.CSS, using = "#ReinstatementWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-0-item>div[role='menuitem']", AI = false)
	public WebElement btnCreateNewProducer;

	@IFindBy(how = How.CSS, using = "#ReinstatementWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-1-NewActivityMenuItemSet_Category>div[role='menuitem']", AI = false)
	public WebElement btnNewmail;

	@IFindBy(how = How.CSS, using = "#ReinstatementWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-7-item>div[role='menuitem']", AI = false)
	public WebElement btnGetMotorVehicleReports;

	@IFindBy(how = How.CSS, using = "input[name='ReinstatementWizard-ReinstatementWizard_ReinstatePolicyScreen-ReinstatePolicyDV-PolicyInfoInputSet-EffectiveDate']", AI = false)
	public WebElement inpEffectiveDate;

	@IFindBy(how = How.CSS, using = "#ReinstatementWizard-ReinstatementWizard_ReinstatePolicyScreen-ReinstatePolicyDV-ReasonDescription", AI = false)
	public WebElement inpReasonDescription;

	@IFindBy(how = How.CSS, using = "#ReinstatementWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-5-item>div[role='menuitem']", AI = false)
	public WebElement btnGetInspectionLossControl;

	@IFindBy(how = How.CSS, using = "#ReinstatementWizard-WizardMenuActions-WizardMenuActions_Create>div[role='menuitem']", AI = false)
	public WebElement btnCreate;

	@IFindBy(how = How.CSS, using = "#ReinstatementWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-4-NewActivityMenuItemSet_Category-0-item>div[role='menuitem']", AI = false)
	public WebElement btnReviewandapprove;

	@IFindBy(how = How.CSS, using = "#ReinstatementWizard-ReinstatementWizard_ReinstatePolicyScreen-JobWizardToolbarButtonSet-ResolveWithFutureBoundPeriods>div[role='button']", AI = false)
	public WebElement btnApplyChangeToRenewal;

	@IFindBy(how = How.CSS, using = "#ReinstatementWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-10-item>div[role='menuitem']", AI = false)
	public WebElement btnLegalreview;

	@IFindBy(how = How.CSS, using = "#ReinstatementWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewDocument>div[role='menuitem']", AI = false)
	public WebElement btnNewDocument;

	@IFindBy(how = How.CSS, using = "#ReinstatementWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-7-item>div[role='menuitem']", AI = false)
	public WebElement btnPolicynotification;

	@IFindBy(how = How.CSS, using = "#ReinstatementWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewDocument-NewJobDocumentMenuItemSet-PolicyPeriodNewDocumentMenuItemSet_Linked>div[role='menuitem']", AI = false)
	public WebElement btnUploaddocuments;

	@IFindBy(how = How.CSS, using = "#ReinstatementWizard-Finish>div[role='button']", AI = false)
	public WebElement btnFinish;

	@IFindBy(how = How.CSS, using = "#ReinstatementWizard-WizardMenuActions-WizardMenuActions_Goto>div[role='menuitem']", AI = false)
	public WebElement btnGoto;

	@IFindBy(how = How.CSS, using = "select[name='ReinstatementWizard-ReinstatementWizard_ReinstatePolicyScreen-ReinstatePolicyDV-PolicyInfoInputSet-PrimaryLanguage']", AI = false)
	public WebElement drpPreferredLanguage;

	@IFindBy(how = How.CSS, using = "input[name='ReinstatementWizard-ReinstatementWizard_ReinstatePolicyScreen-ReinstatePolicyDV-PolicyInfoInputSet-RewrittenSourcePolicy']", AI = false)
	public WebElement inpSourcePolicy;

	@IFindBy(how = How.CSS, using = "#ReinstatementWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-6-item>div[role='menuitem']", AI = false)
	public WebElement btnGetInspectionOutsideService;

	@IFindBy(how = How.CSS, using = "#ReinstatementWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-4-NewActivityMenuItemSet_Category>div[role='menuitem']", AI = false)
	public WebElement btnUnderwriterReview;

	@IFindBy(how = How.CSS, using = "#ReinstatementWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-0-NewActivityMenuItemSet_Category-0-item>div[role='menuitem']", AI = false)
	public WebElement btnMeetwithInsured;

	@IFindBy(how = How.CSS, using = "#ReinstatementWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-0-item>div[role='menuitem']", AI = false)
	public WebElement btn30daydiary;

	@IFindBy(how = How.CSS, using = "#ReinstatementWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-9-item>div[role='menuitem']", AI = false)
	public WebElement btnPolicyReviewRenewal;

	@IFindBy(how = How.CSS, using = "#ReinstatementWizard-ReinstatementWizard_ReinstatePolicyScreen-ReinstatePolicyDV-PolicyInfoInputSet-AffinityGroup-SelectAffinityGroup", AI = false)
	public WebElement btnSearch;

	@IFindBy(how = How.CSS, using = "#ReinstatementWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewNote>div[role='menuitem']", AI = false)
	public WebElement btnNewNote;

	@IFindBy(how = How.CSS, using = "#ReinstatementWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-0-NewActivityMenuItemSet_Category-1-item>div[role='menuitem']", AI = false)
	public WebElement btnMeetwithProducerAgency;

	@IFindBy(how = How.CSS, using = "#ReinstatementWizard-WizardMenuActions-CollectCreditCard>div[role='menuitem']", AI = false)
	public WebElement btnCollectCreditCard;

	@IFindBy(how = How.CSS, using = "#ReinstatementWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-11-item>div[role='menuitem']", AI = false)
	public WebElement btnRatiooutofrange;

	@IFindBy(how = How.CSS, using = "#ReinstatementWizard-WizardMenuActions-DiagWorksheetItem>div[role='menuitem']", AI = false)
	public WebElement btnDiagnosticData;

	@IFindBy(how = How.CSS, using = "#ReinstatementWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-11-item>div[role='menuitem']", AI = false)
	public WebElement btnManuallyrateandquotepolicy;

	@IFindBy(how = How.CSS, using = "#ReinstatementWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category>div[role='menuitem']", AI = false)
	public WebElement btnReminder;

	@IFindBy(how = How.CSS, using = "#ReinstatementWizard-ReinstatementWizard_ReinstatePolicyScreen-ttlBar", AI = false)
	public WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "#ReinstatementWizard-WizardMenuActions-WizardMenuActions_Change>div[role='menuitem']", AI = false)
	public WebElement btnEdit;

	@IFindBy(how = How.CSS, using = "#ReinstatementWizard-ReinstatementWizard_ReinstatePolicyScreen-JobWizardToolbarButtonSet-WithdrawJob>div[role='button']", AI = false)
	public WebElement btnWithdrawTransaction;

	@IFindBy(how = How.CSS, using = "#ReinstatementWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_ToAccountFile>div[role='menuitem']", AI = false)
	public WebElement btnAccountFile;

	@IFindBy(how = How.CSS, using = "input[name='ReinstatementWizard-ReinstatementWizard_ReinstatePolicyScreen-ReinstatePolicyDV-ReinstatementDate']", AI = false)
	public WebElement inpEffectiveDateofReinstatement;

	@IFindBy(how = How.CSS, using = "#ReinstatementWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-1-NewActivityMenuItemSet_Category-0-item>div[role='menuitem']", AI = false)
	public WebElement btnReviewnewmail;

	@IFindBy(how = How.CSS, using = "#ReinstatementWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup>div[role='menuitem']", AI = false)
	public WebElement btnGroup;

	@IFindBy(how = How.CSS, using = "#ReinstatementWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-3-item>div[role='menuitem']", AI = false)
	public WebElement btnCancelasplitpolicy;

	@IFindBy(how = How.CSS, using = "#ReinstatementWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-2-item>div[role='menuitem']", AI = false)
	public WebElement btnGetAuditOutsideService;

	@IFindBy(how = How.CSS, using = "#ReinstatementWizard-WizardMenuActions-WizardMenuActions_Change-WizardMenuActions_CopyPolicyData>div[role='menuitem']", AI = false)
	public WebElement btnCopyData;

	@IFindBy(how = How.CSS, using = "#ReinstatementWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-5-item>div[role='menuitem']", AI = false)
	public WebElement btnNewAuditAssignment;

	@IFindBy(how = How.CSS, using = "#ReinstatementWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-16-item>div[role='menuitem']", AI = false)
	public WebElement btnRewritetoNewAccount;

	@IFindBy(how = How.CSS, using = "#ReinstatementWizard-ReinstatementWizard_ReinstatePolicyScreen-QuoteRequestedAlert-CloseBtn", AI = false)
	public WebElement btnClose;

	@IFindBy(how = How.CSS, using = "#ReinstatementWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-12-item>div[role='menuitem']", AI = false)
	public WebElement btnReview30dayUWPeriod;

	@IFindBy(how = How.CSS, using = "select[name='ReinstatementWizard-ReinstatementWizard_ReinstatePolicyScreen-ReinstatePolicyDV-ReasonCode']", AI = false)
	public WebElement drpReason;

	@IFindBy(how = How.CSS, using = "#ReinstatementWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-14-item>div[role='menuitem']", AI = false)
	public WebElement btnReview60dayUWPeriod;

	@IFindBy(how = How.CSS, using = "#ReinstatementWizard-ReinstatementWizard_ReinstatePolicyScreen-JobWizardToolbarButtonSet-EditPolicy>div[role='button']", AI = false)
	public WebElement btnEditPolicyTransaction;

	@IFindBy(how = How.CSS, using = "#ReinstatementWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity>div[role='menuitem']", AI = false)
	public WebElement btnNewActivity;

	@IFindBy(how = How.CSS, using = "select[name='ReinstatementWizard-ReinstatementWizard_ReinstatePolicyScreen-ReinstatePolicyDV-PolicyInfoInputSet-TermType']", AI = false)
	public WebElement drpTermType;

	@IFindBy(how = How.CSS, using = "#ReinstatementWizard-Cancel>div[role='button']", AI = false)
	public WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "#ReinstatementWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_ToPolicyFile>div[role='menuitem']", AI = false)
	public WebElement btnPolicyFile;

	@IFindBy(how = How.CSS, using = "#ReinstatementWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-17-item>div[role='menuitem']", AI = false)
	public WebElement btnVerifycoverage;

	@IFindBy(how = How.CSS, using = "#ReinstatementWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category>div[role='menuitem']", AI = false)
	public WebElement btnRequest;

	@IFindBy(how = How.CSS, using = "#ReinstatementWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-4-item>div[role='menuitem']", AI = false)
	public WebElement btnGetCreditReports;

	public StartReinstatementPage(){
	}

	public StartReinstatementPage(WebDriver driver){
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(finder, this);
}
	@Override
	protected void load() {
		isPageLoaded = true;
		WaitUtils.waitForPageLoad(driver);
	}// loadF
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
public StartReinstatementPage clickHandlePreemption(WebDriver driver)  {
					BrowserActions.click(driver, btnHandlePreemption,"HandlePreemption");
				    return this;
			}
public StartReinstatementPage enterSplitSourcePolicy(WebDriver driver,String SplitSourcePolicy) {
		            BrowserActions.type(driver, inpSplitSourcePolicy,SplitSourcePolicy, "SplitSourcePolicy");
			        return this;
           }
public StartReinstatementPage clickGetRiskInformationProducer(WebDriver driver)  {
					BrowserActions.click(driver, btnGetRiskInformationProducer,"GetRiskInformationProducer");
				    return this;
			}
public StartReinstatementPage clickJobGroupItem(WebDriver driver)  {
					BrowserActions.click(driver, btnJobGroupItem,"JobGroupItem");
				    return this;
			}
public StartReinstatementPage clickCopySubmission(WebDriver driver)  {
					BrowserActions.click(driver, btnCopySubmission,"CopySubmission");
				    return this;
			}
public StartReinstatementPage clickGeneralreminderdiary(WebDriver driver)  {
					BrowserActions.click(driver, btnGeneralreminderdiary,"Generalreminderdiary");
				    return this;
			}
public StartReinstatementPage enterExpirationDate(WebDriver driver,String ExpirationDate) {
		            BrowserActions.type(driver, inpExpirationDate,ExpirationDate, "ExpirationDate");
			        return this;
           }
public StartReinstatementPage clickGetReinsuranceQuote(WebDriver driver)  {
					BrowserActions.click(driver, btnGetReinsuranceQuote,"GetReinsuranceQuote");
				    return this;
			}
public StartReinstatementPage clickReview45dayUWPeriod(WebDriver driver)  {
					BrowserActions.click(driver, btnReview45dayUWPeriod,"Review45dayUWPeriod");
				    return this;
			}
public StartReinstatementPage clickGetAuditInternalPersonnel(WebDriver driver)  {
					BrowserActions.click(driver, btnGetAuditInternalPersonnel,"GetAuditInternalPersonnel");
				    return this;
			}
public StartReinstatementPage enterRateasofDate(WebDriver driver,String RateasofDate) {
		            BrowserActions.type(driver, inpRateasofDate,RateasofDate, "RateasofDate");
			        return this;
           }
public StartReinstatementPage clickInterview(WebDriver driver)  {
					BrowserActions.click(driver, btnInterview,"Interview");
				    return this;
			}
public StartReinstatementPage clickPerformanceReview(WebDriver driver)  {
					BrowserActions.click(driver, btnPerformanceReview,"PerformanceReview");
				    return this;
			}
public StartReinstatementPage clickShowPartialWorksheet(WebDriver driver)  {
					BrowserActions.click(driver, btnShowPartialWorksheet,"ShowPartialWorksheet");
				    return this;
			}
public StartReinstatementPage click60daydiary(WebDriver driver)  {
					BrowserActions.click(driver, btn60daydiary,"60daydiary");
				    return this;
			}
public StartReinstatementPage clickBack(WebDriver driver)  {
					BrowserActions.click(driver, btnBack,"Back");
				    return this;
			}
public StartReinstatementPage enterWrittenDate(WebDriver driver,String WrittenDate) {
		            BrowserActions.type(driver, inpWrittenDate,WrittenDate, "WrittenDate");
			        return this;
           }
public StartReinstatementPage clickReviewProducer(WebDriver driver)  {
					BrowserActions.click(driver, btnReviewProducer,"ReviewProducer");
				    return this;
			}
public StartReinstatementPage clickNext(WebDriver driver)  {
					BrowserActions.click(driver, btnNext,"Next");
				    return this;
			}
public StartReinstatementPage clickQuoteRequired(WebDriver driver)  {
					BrowserActions.click(driver, btnQuoteRequired,"QuoteRequired");
				    return this;
			}
public StartReinstatementPage clickPolicyReviewMidterm(WebDriver driver)  {
					BrowserActions.click(driver, btnPolicyReviewMidterm,"PolicyReviewMidterm");
				    return this;
			}
public StartReinstatementPage clickSaveDraft(WebDriver driver)  {
					BrowserActions.click(driver, btnSaveDraft,"SaveDraft");
				    return this;
			}
public StartReinstatementPage clickGetBureauData(WebDriver driver)  {
					BrowserActions.click(driver, btnGetBureauData,"GetBureauData");
				    return this;
			}
public StartReinstatementPage clickEffectiveDate(WebDriver driver)  {
					BrowserActions.click(driver, btnEffectiveDate,"EffectiveDate");
				    return this;
			}
public StartReinstatementPage clickCreatefromatemplate(WebDriver driver)  {
					BrowserActions.click(driver, btnCreatefromatemplate,"Createfromatemplate");
				    return this;
			}
public StartReinstatementPage clickArchiving(WebDriver driver)  {
					BrowserActions.click(driver, btnArchiving,"Archiving");
				    return this;
			}
public StartReinstatementPage clickReinstate(WebDriver driver)  {
					BrowserActions.click(driver, btnReinstate,"Reinstate");
				    return this;
			}
public StartReinstatementPage selectBaseState(WebDriver driver,String BaseState)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpBaseState,BaseState,"BaseState");
				    return this;
			}
public StartReinstatementPage click90daydiary(WebDriver driver)  {
					BrowserActions.click(driver, btn90daydiary,"90daydiary");
				    return this;
			}
public StartReinstatementPage enterTermNumber(WebDriver driver,String TermNumber) {
		            BrowserActions.type(driver, inpTermNumber,TermNumber, "TermNumber");
			        return this;
           }
public StartReinstatementPage enterName(WebDriver driver,String Name) {
		            BrowserActions.type(driver, inpName,Name, "Name");
			        return this;
           }
public StartReinstatementPage clickQuote(WebDriver driver)  {
					BrowserActions.click(driver, btnQuote,"Quote");
				    return this;
			}
public StartReinstatementPage clickApplyChangeToRenewal_1(WebDriver driver)  {
					BrowserActions.click(driver, btnApplyChangeToRenewal_1,"ApplyChangeToRenewal_1");
				    return this;
			}
public StartReinstatementPage clickReleaseLock(WebDriver driver)  {
					BrowserActions.click(driver, btnReleaseLock,"ReleaseLock");
				    return this;
			}
public StartReinstatementPage clickEnableDisable(WebDriver driver)  {
					BrowserActions.click(driver, btnEnableDisable,"EnableDisable");
				    return this;
			}
public StartReinstatementPage clickCreateNewProducer(WebDriver driver)  {
					BrowserActions.click(driver, btnCreateNewProducer,"CreateNewProducer");
				    return this;
			}
public StartReinstatementPage clickNewmail(WebDriver driver)  {
					BrowserActions.click(driver, btnNewmail,"Newmail");
				    return this;
			}
public StartReinstatementPage clickGetMotorVehicleReports(WebDriver driver)  {
					BrowserActions.click(driver, btnGetMotorVehicleReports,"GetMotorVehicleReports");
				    return this;
			}
public StartReinstatementPage enterEffectiveDate(WebDriver driver,String EffectiveDate) {
		            BrowserActions.type(driver, inpEffectiveDate,EffectiveDate, "EffectiveDate");
			        return this;
           }
public StartReinstatementPage enterReasonDescription(WebDriver driver,String ReasonDescription) {
		            BrowserActions.type(driver, inpReasonDescription,ReasonDescription, "ReasonDescription");
			        return this;
           }
public StartReinstatementPage clickGetInspectionLossControl(WebDriver driver)  {
					BrowserActions.click(driver, btnGetInspectionLossControl,"GetInspectionLossControl");
				    return this;
			}
public StartReinstatementPage clickCreate(WebDriver driver)  {
					BrowserActions.click(driver, btnCreate,"Create");
				    return this;
			}
public StartReinstatementPage clickReviewandapprove(WebDriver driver)  {
					BrowserActions.click(driver, btnReviewandapprove,"Reviewandapprove");
				    return this;
			}
public StartReinstatementPage clickApplyChangeToRenewal(WebDriver driver)  {
					BrowserActions.click(driver, btnApplyChangeToRenewal,"ApplyChangeToRenewal");
				    return this;
			}
public StartReinstatementPage clickLegalreview(WebDriver driver)  {
					BrowserActions.click(driver, btnLegalreview,"Legalreview");
				    return this;
			}
public StartReinstatementPage clickNewDocument(WebDriver driver)  {
					BrowserActions.click(driver, btnNewDocument,"NewDocument");
				    return this;
			}
public StartReinstatementPage clickPolicynotification(WebDriver driver)  {
					BrowserActions.click(driver, btnPolicynotification,"Policynotification");
				    return this;
			}
public StartReinstatementPage clickUploaddocuments(WebDriver driver)  {
					BrowserActions.click(driver, btnUploaddocuments,"Uploaddocuments");
				    return this;
			}
public StartReinstatementPage clickFinish(WebDriver driver)  {
					BrowserActions.click(driver, btnFinish,"Finish");
				    return this;
			}
public StartReinstatementPage clickGoto(WebDriver driver)  {
					BrowserActions.click(driver, btnGoto,"Goto");
				    return this;
			}
public StartReinstatementPage selectPreferredLanguage(WebDriver driver,String PreferredLanguage)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPreferredLanguage,PreferredLanguage,"PreferredLanguage");
				    return this;
			}
public StartReinstatementPage enterSourcePolicy(WebDriver driver,String SourcePolicy) {
		            BrowserActions.type(driver, inpSourcePolicy,SourcePolicy, "SourcePolicy");
			        return this;
           }
public StartReinstatementPage clickGetInspectionOutsideService(WebDriver driver)  {
					BrowserActions.click(driver, btnGetInspectionOutsideService,"GetInspectionOutsideService");
				    return this;
			}
public StartReinstatementPage clickUnderwriterReview(WebDriver driver)  {
					BrowserActions.click(driver, btnUnderwriterReview,"UnderwriterReview");
				    return this;
			}
public StartReinstatementPage clickMeetwithInsured(WebDriver driver)  {
					BrowserActions.click(driver, btnMeetwithInsured,"MeetwithInsured");
				    return this;
			}
public StartReinstatementPage click30daydiary(WebDriver driver)  {
					BrowserActions.click(driver, btn30daydiary,"30daydiary");
				    return this;
			}
public StartReinstatementPage clickPolicyReviewRenewal(WebDriver driver)  {
					BrowserActions.click(driver, btnPolicyReviewRenewal,"PolicyReviewRenewal");
				    return this;
			}
public StartReinstatementPage clickSearch(WebDriver driver)  {
					BrowserActions.click(driver, btnSearch,"Search");
				    return this;
			}
public StartReinstatementPage clickNewNote(WebDriver driver)  {
					BrowserActions.click(driver, btnNewNote,"NewNote");
				    return this;
			}
public StartReinstatementPage clickMeetwithProducerAgency(WebDriver driver)  {
					BrowserActions.click(driver, btnMeetwithProducerAgency,"MeetwithProducerAgency");
				    return this;
			}
public StartReinstatementPage clickCollectCreditCard(WebDriver driver)  {
					BrowserActions.click(driver, btnCollectCreditCard,"CollectCreditCard");
				    return this;
			}
public StartReinstatementPage clickRatiooutofrange(WebDriver driver)  {
					BrowserActions.click(driver, btnRatiooutofrange,"Ratiooutofrange");
				    return this;
			}
public StartReinstatementPage clickDiagnosticData(WebDriver driver)  {
					BrowserActions.click(driver, btnDiagnosticData,"DiagnosticData");
				    return this;
			}
public StartReinstatementPage clickManuallyrateandquotepolicy(WebDriver driver)  {
					BrowserActions.click(driver, btnManuallyrateandquotepolicy,"Manuallyrateandquotepolicy");
				    return this;
			}
public StartReinstatementPage clickReminder(WebDriver driver)  {
					BrowserActions.click(driver, btnReminder,"Reminder");
				    return this;
			}
public StartReinstatementPage clickEdit(WebDriver driver)  {
					BrowserActions.click(driver, btnEdit,"Edit");
				    return this;
			}
public StartReinstatementPage clickWithdrawTransaction(WebDriver driver)  {
					BrowserActions.click(driver, btnWithdrawTransaction,"WithdrawTransaction");
				    return this;
			}
public StartReinstatementPage clickAccountFile(WebDriver driver)  {
					BrowserActions.click(driver, btnAccountFile,"AccountFile");
				    return this;
			}
public StartReinstatementPage enterEffectiveDateofReinstatement(WebDriver driver,String EffectiveDateofReinstatement) {
		            BrowserActions.type(driver, inpEffectiveDateofReinstatement,EffectiveDateofReinstatement, "EffectiveDateofReinstatement");
			        return this;
           }
public StartReinstatementPage clickReviewnewmail(WebDriver driver)  {
					BrowserActions.click(driver, btnReviewnewmail,"Reviewnewmail");
				    return this;
			}
public StartReinstatementPage clickGroup(WebDriver driver)  {
					BrowserActions.click(driver, btnGroup,"Group");
				    return this;
			}
public StartReinstatementPage clickCancelasplitpolicy(WebDriver driver)  {
					BrowserActions.click(driver, btnCancelasplitpolicy,"Cancelasplitpolicy");
				    return this;
			}
public StartReinstatementPage clickGetAuditOutsideService(WebDriver driver)  {
					BrowserActions.click(driver, btnGetAuditOutsideService,"GetAuditOutsideService");
				    return this;
			}
public StartReinstatementPage clickCopyData(WebDriver driver)  {
					BrowserActions.click(driver, btnCopyData,"CopyData");
				    return this;
			}
public StartReinstatementPage clickNewAuditAssignment(WebDriver driver)  {
					BrowserActions.click(driver, btnNewAuditAssignment,"NewAuditAssignment");
				    return this;
			}
public StartReinstatementPage clickRewritetoNewAccount(WebDriver driver)  {
					BrowserActions.click(driver, btnRewritetoNewAccount,"RewritetoNewAccount");
				    return this;
			}
public StartReinstatementPage clickClose(WebDriver driver)  {
					BrowserActions.click(driver, btnClose,"Close");
				    return this;
			}
public StartReinstatementPage clickReview30dayUWPeriod(WebDriver driver)  {
					BrowserActions.click(driver, btnReview30dayUWPeriod,"Review30dayUWPeriod");
				    return this;
			}
public StartReinstatementPage selectReason(WebDriver driver,String Reason)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpReason,Reason,1,"Reason");
				    return this;
			}
public StartReinstatementPage clickReview60dayUWPeriod(WebDriver driver)  {
					BrowserActions.click(driver, btnReview60dayUWPeriod,"Review60dayUWPeriod");
				    return this;
			}
public StartReinstatementPage clickEditPolicyTransaction(WebDriver driver)  {
					BrowserActions.click(driver, btnEditPolicyTransaction,"EditPolicyTransaction");
				    return this;
			}
public StartReinstatementPage clickNewActivity(WebDriver driver)  {
					BrowserActions.click(driver, btnNewActivity,"NewActivity");
				    return this;
			}
public StartReinstatementPage selectTermType(WebDriver driver,String TermType)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpTermType,TermType,"TermType");
				    return this;
			}
public StartReinstatementPage clickCancel(WebDriver driver)  {
					BrowserActions.click(driver, btnCancel,"Cancel");
				    return this;
			}
public StartReinstatementPage clickPolicyFile(WebDriver driver)  {
					BrowserActions.click(driver, btnPolicyFile,"PolicyFile");
				    return this;
			}
public StartReinstatementPage clickVerifycoverage(WebDriver driver)  {
					BrowserActions.click(driver, btnVerifycoverage,"Verifycoverage");
				    return this;
			}
public StartReinstatementPage clickRequest(WebDriver driver)  {
					BrowserActions.click(driver, btnRequest,"Request");
				    return this;
			}
public StartReinstatementPage clickGetCreditReports(WebDriver driver)  {
					BrowserActions.click(driver, btnGetCreditReports,"GetCreditReports");
				    return this;
			}
}