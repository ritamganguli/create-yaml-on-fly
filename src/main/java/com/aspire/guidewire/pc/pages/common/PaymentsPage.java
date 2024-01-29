package com.aspire.guidewire.pc.pages.common;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
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

public class PaymentsPage extends LoadableComponent<PaymentsPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	public CreatePersonAndCompanyPage createPersonAndCompanyPage;
	public SearchAddressBookPage searchAddressBookPage;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Workplan>div[role='menuitem']", AI = false)
	public WebElement btnWorkplan;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_CopySubmission>div[role='menuitem']", AI = false)
	public WebElement btnCopySubmission;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-SubmissionWizard_PaymentScreen-UpFrontPaymentDV-SynchronizeTransactionsToolbar-SynchronizeTransactionsButton>div[role='button']", AI = false)
	public WebElement btnSynchronize;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-4-item>div[role='menuitem']", AI = false)
	public WebElement btnGeneralreminderdiary;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-SubmissionWizard_PaymentScreen-BillingAdjustmentsPanelSet-BillingPanel-AccountContactBillingInputSet-ChangeBillingContactButton-BillingABContactAdder>div[role='menuitem']", AI = false)
	public WebElement btnFromAddressBook;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-8-item>div[role='menuitem']", AI = false)
	public WebElement btnGetReinsuranceQuote;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-13-item>div[role='menuitem']", AI = false)
	public WebElement btnReview45dayUWPeriod;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-SubmissionWizard_PaymentScreen-AltAccountAlert .gw-AlertBar--label", AI = false)
	public WebElement lblAltAccountAlert;

	@IFindBy(how = How.CSS, using = "div[id$='BindOptions-BindOnly']", AI = false)
	public WebElement btnBindOnly;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-JobGroupItem>div[role='menuitem']", AI = false)
	public WebElement btnSG01838332082908930690;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-0-NewActivityMenuItemSet_Category>div[role='menuitem']", AI = false)
	public WebElement btnInterview;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-SubmissionWizard_PaymentScreen-BillingAdjustmentsPanelSet-OverridesAndPaymentsPanel-InvoicingInputSet-BillingInvoiceStreamInputSet-DayOfWeek']", AI = false)
	public WebElement drpDayOfWeek_1;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-6-item>div[role='menuitem']", AI = false)
	public WebElement btnPerformanceReview;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-SubmissionWizard_PaymentScreen-JobWizardBillingToolbarButtonSet-Versions-NewVersion>div[role='menuitem']", AI = false)
	public WebElement btnStartMultiVersion;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-SubmissionWizard_PaymentScreen-BindSummaryDV-PaymentsSummaryInputSet-DownPayment", AI = false)
	public WebElement btn5596;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-15-item>div[role='menuitem']", AI = false)
	public WebElement btnReviewProducer;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-SubmissionWizard_PaymentScreen-BillingAdjustmentsPanelSet-BillingPanel-BillingLevel']", AI = false)
	public WebElement inpBillingLevel;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-RiskEvaluation>div[role='menuitem']", AI = false)
	public WebElement btnRiskAnalysis_1;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-SubmissionWizard_PaymentScreen-BillingAdjustmentsPanelSet-BillingPanel-AccountContactBillingInputSet-ChangeBillingContactButton']", AI = false)
	public WebElement inpBillingContact;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-8-item>div[role='menuitem']", AI = false)
	public WebElement btnPolicyReviewMidterm;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-SubmissionWizard_PaymentScreen-BillingAdjustmentsPanelSet-OverridesAndPaymentsPanel-Custom']", AI = false)
	public WebElement chkCustomBillingOptions;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-SubmissionWizard_PaymentScreen-JobWizardBillingToolbarButtonSet-Versions-ViewSideBySide>div[role='menuitem']", AI = false)
	public WebElement btnViewSideBySideVersions;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-SubmissionWizard_PaymentScreen-BillingAdjustmentsPanelSet-BillingPanel-AccountContactBillingInputSet-ChangeBillingContactButton-Remove>div[role='menuitem']", AI = false)
	public WebElement btnRemove_1;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_JobGroup-0-JobItem>div[role='menuitem']", AI = false)
	public WebElement btnPA0183833208;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-SubmissionWizard_PaymentScreen-BindSummaryDV-PaymentsSummaryInputSet-Frequency']", AI = false)
	public WebElement inpFrequency;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-SubmissionWizard_PaymentScreen-BillingAdjustmentsPanelSet-BillingPanel-AccountContactBillingInputSet-AltBillingAccount']", AI = false)
	public WebElement inpAlternateBillingAccount;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-BillingInfo>div[role='menuitem']", AI = false)
	public WebElement btnPayment;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Change-WizardMenuActions_ChangeEffDate>div[role='menuitem']", AI = false)
	public WebElement btnEffectiveDate;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-SubmissionWizard_PaymentScreen-BindSummaryDV-InvoiceStreamInputSet-FixInvoicesBy']", AI = false)
	public WebElement inpFixInvoicesby;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-SubmissionWizard_PaymentScreen-BillingAdjustmentsPanelSet-OverridesAndPaymentsPanel-InvoicingInputSet-NewInvoicing']", AI = false)
	public WebElement rdbInvoicing;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-SubmissionWizard_PaymentScreen-BillingAdjustmentsPanelSet-OverridesAndPaymentsPanel-OverriddenInvoiceStreamInput-BillingInvoiceStreamInputSet-Invoice']", AI = false)
	public WebElement drpFixInvoicesby;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-SubmissionWizard_PaymentScreen-BindSummaryDV-PremiumSummaryInputSet-TotalCost", AI = false)
	public WebElement lblTotalCost;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-SubmissionWizard_PaymentScreen-UnprocessedTransactionAlertBar .gw-AlertBar--label", AI = false)
	public WebElement lblUnprocessedTransactionAlertBar;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-2-item>div[role='menuitem']", AI = false)
	public WebElement btn90daydiary;

	@IFindBy(how = How.CSS, using = "div[id$='BindOptions']", AI = false)
	public WebElement btnBindOptions;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-SubmissionWizard_PaymentScreen-BillingAdjustmentsPanelSet-BillingPanel-AccountContactBillingInputSet-AltBillingAccount-AltBillingAccountMenuIcon']", AI = false)
	public WebElement drpAltBillingAccountMenuIcon;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-SubmissionWizard_PaymentScreen-BillingAdjustmentsPanelSet-OverridesAndPaymentsPanel-InvoicingInputSet-BillingInvoiceStreamInputSet-Invoice']", AI = false)
	public WebElement drpFixInvoicesby_1;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Archiving-WizardMenuActions_SuspendResumeArchiving>div[role='menuitem']", AI = false)
	public WebElement btnEnableDisable;

	@IFindBy(how = How.XPATH, using = "//div[contains(text(),'ssue Policy')]", AI = false)
	public WebElement btnIssuePolicy;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-MultiQuoteAcceleratedMenuActions-PolicyPeriodSelector", AI = false)
	public WebElement btnPolicyPeriodSelector;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-SubmissionWizard_PaymentScreen-BillingAdjustmentsPanelSet-OverridesAndPaymentsPanel-OverriddenInvoiceStreamInput-BillingInvoiceStreamInputSet-FirstPaymentDate']", AI = false)
	public WebElement inpFirstPaymentDate;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-1-NewActivityMenuItemSet_Category>div[role='menuitem']", AI = false)
	public WebElement btnNewmail;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-7-item>div[role='menuitem']", AI = false)
	public WebElement btnGetMotorVehicleReports;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-PreQualification>div[role='menuitem']", AI = false)
	public WebElement btnQualification;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-SubmissionWizard_PaymentScreen-BillingAdjustmentsPanelSet-OverridesAndPaymentsPanel-OverriddenInvoiceStreamInput-BillingInvoiceStreamInputSet-Automatic']", AI = false)
	public WebElement rdbPayment;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-SubmissionWizard_PaymentScreen-BindSummaryDV-PaymentsSummaryInputSet-Installments", AI = false)
	public WebElement btn6498;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-SubmissionWizard_PaymentScreen-BillingAdjustmentsPanelSet-OverridesAndPaymentsPanel-OverriddenInvoiceStreamInput-BillingInvoiceStreamInputSet-FirstDayOfMonth']", AI = false)
	public WebElement drpDayofMonth;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Participants>div[role='menuitem']", AI = false)
	public WebElement btnParticipants;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-PALine>div[role='menuitem']", AI = false)
	public WebElement btnPACoverages;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-4-NewActivityMenuItemSet_Category-0-item>div[role='menuitem']", AI = false)
	public WebElement btnReviewandapprove;

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

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-PolicyReview>div[role='menuitem']", AI = false)
	public WebElement btnPolicyReview;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-11-item>div[role='menuitem']", AI = false)
	public WebElement btnManuallyrateandquotepolicy;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-PADrivers>div[role='menuitem']", AI = false)
	public WebElement btnDrivers;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-History>div[role='menuitem']", AI = false)
	public WebElement btnHistory;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Change>div[role='menuitem']", AI = false)
	public WebElement btnEdit;

	@IFindBy(how = How.CSS, using = "div[id$='WithdrawJob']", AI = false)
	public WebElement btnWithdrawTransaction;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-PolicyInfo>div[role='menuitem']", AI = false)
	public WebElement btnPolicyInfo;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-SubmissionWizard_PaymentScreen-JobWizardBillingToolbarButtonSet-Versions>div[role='button']", AI = false)
	public WebElement btnVersions;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_ToAccountFile>div[role='menuitem']", AI = false)
	public WebElement btnAccountFile;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-SubmissionWizard_PaymentScreen-BillingAdjustmentsPanelSet-BillingPanel-AccountContactBillingInputSet-AltBillingAccount-Remove>div[role='menuitem']", AI = false)
	public WebElement btnRemove;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-SubmissionWizard_PaymentScreen-BindSummaryDV-InvoiceStreamInputSet-DayOfMonth']", AI = false)
	public WebElement inpInvoicingDays;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-SubmissionWizard_PaymentScreen-BillingAdjustmentsPanelSet-BillingPanel-AccountContactBillingInputSet-AltBillingAccount-SearchBillingAccount>div[role='menuitem']", AI = false)
	public WebElement btnSearch_1;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Change-WizardMenuActions_CopyPolicyData>div[role='menuitem']", AI = false)
	public WebElement btnCopyData;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-SubmissionWizard_PaymentScreen-BillingAdjustmentsPanelSet-BillingPanel-AccountContactBillingInputSet-ChangeBillingContactButton-ChangeBillingContactButtonMenuIcon']", AI = false)
	public WebElement drpChangeBillingContactButtonMenuIcon;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-SubmissionWizard_PaymentScreen-BillingAdjustmentsPanelSet-OverridesAndPaymentsPanel-OverriddenInvoiceStreamInput-BillingInvoiceStreamInputSet-DayOfWeek']", AI = false)
	public WebElement drpDayOfWeek;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-SubmissionWizard_PaymentScreen-AltAccountAlert-CloseBtn", AI = false)
	public WebElement btnClose;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-14-item>div[role='menuitem']", AI = false)
	public WebElement btnReview60dayUWPeriod;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-SubmissionWizard_PaymentScreen-JobWizardBillingToolbarButtonSet-EditPolicy>div[role='button']", AI = false)
	public WebElement btnEditPolicyTransaction;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-SubmissionWizard_PaymentScreen-BillingAdjustmentsPanelSet-OverridesAndPaymentsPanel-InvoicingInputSet-BillingInvoiceStreamInputSet-PaymentInstrument-PaymentInstrumentsLV_tb-AddPaymentInstrument>div[role='button']", AI = false)
	public WebElement btnAdd_1;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity>div[role='menuitem']", AI = false)
	public WebElement btnNewActivity;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-SubmissionWizard_PaymentScreen-BindSummaryDV-PremiumSummaryInputSet-InstallmentFees", AI = false)
	public WebElement lblFees;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-SubmissionWizard_PaymentScreen-BillingAdjustmentsPanelSet-PaymentSchedulePanel-PlanInputSet-PaymentMethod']", AI = false)
	public WebElement drpPlanType;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Cancel>div[role='button']", AI = false)
	public WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup>div[role='menuitem']", AI = false)
	public WebElement btnPolicyContract;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category>div[role='menuitem']", AI = false)
	public WebElement btnRequest;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-SubmissionWizard_PaymentScreen-BillingAdjustmentsPanelSet-OverridesAndPaymentsPanel-OverriddenInvoiceStreamInput-BillingInvoiceStreamInputSet-SecondDayOfMonth']", AI = false)
	public WebElement drpSecondDayofMonth;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-9-item>div[role='menuitem']", AI = false)
	public WebElement btnGetRiskInformationProducer;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-SubmissionWizard_PaymentScreen-UnprocessedTransactionAlertBar-CloseBtn", AI = false)
	public WebElement btnClose_1;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-1-item>div[role='menuitem']", AI = false)
	public WebElement btnGetAuditInternalPersonnel;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-MultiQuoteAcceleratedMenuActions-PolicyPeriodSelector-PolicyPeriodSelector_Arg']", AI = false)
	public WebElement drpPolicyPeriodSelector_Arg;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-DiagWorksheetItem-ShowDiagWorksheet>div[role='menuitem']", AI = false)
	public WebElement btnShowPartialWorksheet;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-1-item>div[role='menuitem']", AI = false)
	public WebElement btn60daydiary;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Prev>div[role='button']", AI = false)
	public WebElement btnBack;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-SubmissionWizard_PaymentScreen-BillingAdjustmentsPanelSet-OverridesAndPaymentsPanel-InvoicingInputSet-UnappliedFundInput']", AI = false)
	public WebElement inpDescription_1;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-PolicyVersions>div[role='menuitem']", AI = false)
	public WebElement btnPolicyVersions_1;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Next>div[role='button']", AI = false)
	public WebElement btnNext;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-10-item>div[role='menuitem']", AI = false)
	public WebElement btnQuoteRequired;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-SubmissionWizard_PaymentScreen-BindSummaryDV-PremiumSummaryInputSet-ChangeInCost", AI = false)
	public WebElement lblChangeinCost;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-SubmissionWizard_PaymentScreen-BillingAdjustmentsPanelSet-BillingPanel-AccountContactBillingInputSet-ChangeBillingContactButton-1-contactType>div[role='menuitem']", AI = false)
	public WebElement btnNewPerson;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-SubmissionWizard_PaymentScreen-JobWizardBillingToolbarButtonSet-Draft>div[role='button']", AI = false)
	public WebElement btnSaveDraft;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-3-item>div[role='menuitem']", AI = false)
	public WebElement btnGetBureauData;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Reinsurance>div[role='menuitem']", AI = false)
	public WebElement btnReinsurance;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-SubmissionWizard_PaymentScreen-BindSummaryDV-PaymentsSummaryInputSet-InstallmentPreviewIcon", AI = false)
	public WebElement btnInstallmentPreviewIcon;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-SubmissionWizard_PaymentScreen-BillingAdjustmentsPanelSet-BillingPanel-AccountContactBillingInputSet-ChangeBillingContactButton-ExistingBillingContact>div[role='menuitem']", AI = false)
	public WebElement btnExistingBillingContacts;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-SubmissionWizard_PaymentScreen-BindSummaryDV-InvoiceStreamInputSet-InvoiceFrequency']", AI = false)
	public WebElement inpFrequency_1;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewDocument-NewJobDocumentMenuItemSet-PolicyPeriodNewDocumentMenuItemSet_Template>div[role='menuitem']", AI = false)
	public WebElement btnCreatefromatemplate;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-SubmissionWizard_PaymentScreen-AuditAdjustmentsDV-FinalAudit']", AI = false)
	public WebElement drpRequiresFinalaudit;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-SubmissionWizard_PaymentScreen-JobWizardBillingToolbarButtonSet-Versions-SideBySide>div[role='menuitem']", AI = false)
	public WebElement btnStartSidebySide;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Archiving>div[role='menuitem']", AI = false)
	public WebElement btnArchiving;

	@IFindBy(how = How.CSS, using = "div[id$='NotTakenJob']", AI = false)
	public WebElement btnNotTaken;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Documents>div[role='menuitem']", AI = false)
	public WebElement btnDocuments;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-SubmissionWizard_PaymentScreen-BillingAdjustmentsPanelSet-BillingPanel-AccountContactBillingInputSet-ChangeBillingContactButton-OtherExistingContact>div[role='menuitem']", AI = false)
	public WebElement btnOtherContacts;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-SubmissionWizard_PaymentScreen-JobWizardBillingToolbarButtonSet-QuoteOrReview>div[role='button']", AI = false)
	public WebElement btnQuote;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-SubmissionWizard_PaymentScreen-BindSummaryDV-PremiumSummaryInputSet-TotalTaxesSurcharges", AI = false)
	public WebElement lblTaxesandSurcharges;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-LOBWizardStepGroup-PersonalVehicles>div[role='menuitem']", AI = false)
	public WebElement btnVehicles;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-SubmissionWizard_PaymentScreen-JobWizardBillingToolbarButtonSet-Unlock>div[role='button']", AI = false)
	public WebElement btnReleaseLock;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-SubmissionWizard_PaymentScreen-BillingAdjustmentsPanelSet-OverridesAndPaymentsPanel-InvoicingInputSet-BillingInvoiceStreamInputSet-Automatic']", AI = false)
	public WebElement rdbPayment_1;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-0-item>div[role='menuitem']", AI = false)
	public WebElement btnCreateNewProducer;

	@IFindBy(how = How.CSS, using = "div[id*='AddButtonLink']", AI = false)
	public WebElement btnAdd;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Forms>div[role='menuitem']", AI = false)
	public WebElement btnForms;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-Notes>div[role='menuitem']", AI = false)
	public WebElement btnNotes;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-SubmissionWizard_PaymentScreen-BillingAdjustmentsPanelSet-OverridesAndPaymentsPanel-InvoicingInputSet-BillingInvoiceStreamInputSet-SecondDayOfMonth']", AI = false)
	public WebElement drpSecondDayofMonth_1;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-ViewMultiLineQuote>div[role='menuitem']", AI = false)
	public WebElement btnQuote_1;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-SubmissionWizard_PaymentScreen-BindSummaryDV-InvoiceStreamInputSet-PayUsing']", AI = false)
	public WebElement inpPayUsing;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-SubmissionWizard_PaymentScreen-BillingAdjustmentsPanelSet-OverridesAndPaymentsPanel-Overridden']", AI = false)
	public WebElement chkOverridden;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-5-item>div[role='menuitem']", AI = false)
	public WebElement btnGetInspectionLossControl;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create>div[role='menuitem']", AI = false)
	public WebElement btnCreate;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-SubmissionWizard_PaymentScreen-BillingAdjustmentsPanelSet-OverridesAndPaymentsPanel-OverriddenInvoiceStreamInput-BillingInvoiceStreamInputSet-InvoiceStreamDescription']", AI = false)
	public WebElement inpDescription;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-10-item>div[role='menuitem']", AI = false)
	public WebElement btnLegalreview;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-SubmissionWizard_PaymentScreen-BillingAdjustmentsPanelSet-OverridesAndPaymentsPanel-InvoicingInputSet-UnappliedFund']", AI = false)
	public WebElement rdbUnappliedFund;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-7-item>div[role='menuitem']", AI = false)
	public WebElement btnPolicynotification;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto>div[role='menuitem']", AI = false)
	public WebElement btnGoto;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-4-NewActivityMenuItemSet_Category>div[role='menuitem']", AI = false)
	public WebElement btnUnderwriterReview;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-0-item>div[role='menuitem']", AI = false)
	public WebElement btn30daydiary;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-SubmissionWizard_PaymentScreen-BillingAdjustmentsPanelSet-BillingPanel-AccountContactBillingInputSet-AltBillingAccount-Search>div[role='menuitem']", AI = false)
	public WebElement btnSearch;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-SideBySide>div[role='menuitem']", AI = false)
	public WebElement btnSidebySideQuoting;

	@IFindBy(how = How.CSS, using = "select[name='SubmissionWizard-SubmissionWizard_PaymentScreen-BillingAdjustmentsPanelSet-OverridesAndPaymentsPanel-InvoicingInputSet-BillingInvoiceStreamInputSet-FirstDayOfMonth']", AI = false)
	public WebElement drpDayofMonth_1;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-CollectCreditCard>div[role='menuitem']", AI = false)
	public WebElement btnCollectCreditCard;

	@IFindBy(how = How.CSS, using = "input[name='SubmissionWizard-SubmissionWizard_PaymentScreen-BillingAdjustmentsPanelSet-OverridesAndPaymentsPanel-InvoicingInputSet-BillingInvoiceStreamInputSet-FirstPaymentDate']", AI = false)
	public WebElement inpFirstPaymentDate_1;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-11-item>div[role='menuitem']", AI = false)
	public WebElement btnRatiooutofrange;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-SubmissionWizard_PaymentScreen-JobWizardBillingToolbarButtonSet-ConvertToFullApp>div[role='button']", AI = false)
	public WebElement btnFullApp;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-DiagWorksheetItem>div[role='menuitem']", AI = false)
	public WebElement btnDiagnosticData;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category>div[role='menuitem']", AI = false)
	public WebElement btnReminder;

	@IFindBy(how = How.CSS, using = "div[id$='PaymentScreen-ttlBar']", AI = false)
	public WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "select[name$='BillingMethod']", AI = false)
	public WebElement drpBillingMethod;

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

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-SubmissionWizard_PaymentScreen-BillingAdjustmentsPanelSet-BillingPanel-AccountContactBillingInputSet-ChangeBillingContactButton-0-contactType>div[role='menuitem']", AI = false)
	public WebElement btnNewCompany;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-12-item>div[role='menuitem']", AI = false)
	public WebElement btnReview30dayUWPeriod;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-ManageBranches>div[role='menuitem']", AI = false)
	public WebElement btnPolicyVersions;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-SubmissionWizard_PaymentScreen-BillingAdjustmentsPanelSet-BillingPanel-AccountContactBillingInputSet-AltBillingAccount-SubAccounts>div[role='menuitem']", AI = false)
	public WebElement btnBillingSubaccounts;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-SubmissionWizard_PaymentScreen-BindSummaryDV-PremiumSummaryInputSet-TotalPremium", AI = false)
	public WebElement lblTotalPremium;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-SubmissionWizard_PaymentScreen-BindSummaryDV-PaymentsSummaryInputSet-DownPaymentPreviewIcon", AI = false)
	public WebElement btnDownPaymentPreviewIcon;

	@IFindBy(how = How.CSS, using = "div[id$='CloseOptions']", AI = false)
	public WebElement btnCloseOptions;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardMenuActions_ToPolicyFile>div[role='menuitem']", AI = false)
	public WebElement btnPolicyFile;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-2-NewActivityMenuItemSet_Category-17-item>div[role='menuitem']", AI = false)
	public WebElement btnVerifycoverage;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Create-WizardMenuActions_NewActivity-NewActivityMenuItemSet-3-NewActivityMenuItemSet_Category-4-item>div[role='menuitem']", AI = false)
	public WebElement btnGetCreditReports;

	@IFindBy(how = How.CSS, using = "div[id$='Decline']", AI = false)
	public WebElement btnDecline;

	@IFindBy(how = How.CSS, using = "#SubmissionWizard-WizardMenuActions-WizardMenuActions_Goto-WizardActionsMenuItemSet-SubmissionInfo>div[role='menuitem']", AI = false)
	public WebElement btnSubManager;

	@IFindBy(how = How.CSS, using = "div[id$='SendToRenewal']", AI = false)
	public WebElement btnRenew;

	@IFindBy(how = How.CSS, using = "div[id$='DetailsButton']", AI = false)
	public WebElement btnDetails;
	
	@IFindBy(how = How.CSS, using = "div[id^='UWBlockProgressIssuesPopup-IssuesScreen-ApproveDV']", AI = false)
	public WebElement lblUWIssueMsg;
	
	public PaymentsPage(){
	}

	public PaymentsPage(WebDriver driver) {
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, Utils.maxElementWait);
		PageFactory.initElements(finder, this);
		elementLayer = new ElementLayer(driver);
	}

	public PaymentsPage(WebDriver driver, int timeout) {
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, timeout);
		PageFactory.initElements(finder, this);
		elementLayer = new ElementLayer(driver);
	}

	@Override
	protected void load() {
		isPageLoaded = true;
		WaitUtils.waitForPageLoad(driver);
	}
	
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
	public PaymentsPage clickWorkplan(WebDriver driver)  {
		BrowserActions.click(driver, btnWorkplan,"Workplan");
		return this;
	}
	public PaymentsPage clickCopySubmission(WebDriver driver)  {
		BrowserActions.click(driver, btnCopySubmission,"CopySubmission");
		return this;
	}
	public PaymentsPage clickSynchronize(WebDriver driver)  {
		BrowserActions.click(driver, btnSynchronize,"Synchronize");
		return this;
	}
	public PaymentsPage clickGeneralreminderdiary(WebDriver driver)  {
		BrowserActions.click(driver, btnGeneralreminderdiary,"Generalreminderdiary");
		return this;
	}
	public PaymentsPage clickFromAddressBook(WebDriver driver)  {
		BrowserActions.click(driver, btnFromAddressBook,"FromAddressBook");
		return this;
	}
	public PaymentsPage clickGetReinsuranceQuote(WebDriver driver)  {
		BrowserActions.click(driver, btnGetReinsuranceQuote,"GetReinsuranceQuote");
		return this;
	}
	public PaymentsPage clickReview45dayUWPeriod(WebDriver driver)  {
		BrowserActions.click(driver, btnReview45dayUWPeriod,"Review45dayUWPeriod");
		return this;
	}
	public PaymentsPage clickBindOnly(WebDriver driver)  {
		BrowserActions.click(driver, btnBindOnly,"BindOnly");
		BrowserActions.confirmAlert(driver, "Confirm Alert");
		return this;
	}
	public PaymentsPage clickSG01838332082908930690(WebDriver driver)  {
		BrowserActions.click(driver, btnSG01838332082908930690,"SG01838332082908930690");
		return this;
	}
	public PaymentsPage clickInterview(WebDriver driver)  {
		BrowserActions.click(driver, btnInterview,"Interview");
		return this;
	}
	public PaymentsPage selectDayOfWeek_1(WebDriver driver,String DayOfWeek_1)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpDayOfWeek_1,DayOfWeek_1,"DayOfWeek_1");
		return this;
	}
	public PaymentsPage clickPerformanceReview(WebDriver driver)  {
		BrowserActions.click(driver, btnPerformanceReview,"PerformanceReview");
		return this;
	}
	public PaymentsPage clickStartMultiVersion(WebDriver driver)  {
		BrowserActions.click(driver, btnStartMultiVersion,"StartMultiVersion");
		return this;
	}
	public PaymentsPage click5596(WebDriver driver)  {
		BrowserActions.click(driver, btn5596,"5596");
		return this;
	}
	public PaymentsPage clickReviewProducer(WebDriver driver)  {
		BrowserActions.click(driver, btnReviewProducer,"ReviewProducer");
		return this;
	}
	public PaymentsPage enterBillingLevel(WebDriver driver,String BillingLevel) {
		BrowserActions.type(driver, inpBillingLevel,BillingLevel, "BillingLevel");
		return this;
	}
	public PaymentsPage clickRiskAnalysis_1(WebDriver driver)  {
		BrowserActions.click(driver, btnRiskAnalysis_1,"RiskAnalysis_1");
		return this;
	}
	public PaymentsPage enterBillingContact(WebDriver driver,String BillingContact) {
		BrowserActions.type(driver, inpBillingContact,BillingContact, "BillingContact");
		return this;
	}
	public PaymentsPage clickPolicyReviewMidterm(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyReviewMidterm,"PolicyReviewMidterm");
		return this;
	}
	public PaymentsPage clickCustomBillingOptions(WebDriver driver)  {
		BrowserActions.click(driver, chkCustomBillingOptions,"CustomBillingOptions");
		return this;
	}
	public PaymentsPage clickViewSideBySideVersions(WebDriver driver)  {
		BrowserActions.click(driver, btnViewSideBySideVersions,"ViewSideBySideVersions");
		return this;
	}
	public PaymentsPage clickRemove_1(WebDriver driver)  {
		BrowserActions.click(driver, btnRemove_1,"Remove_1");
		return this;
	}
	public PaymentsPage clickPA0183833208(WebDriver driver)  {
		BrowserActions.click(driver, btnPA0183833208,"PA0183833208");
		return this;
	}
	public PaymentsPage enterFrequency(WebDriver driver,String Frequency) {
		BrowserActions.type(driver, inpFrequency,Frequency, "Frequency");
		return this;
	}
	public PaymentsPage enterAlternateBillingAccount(WebDriver driver,String AlternateBillingAccount) {
		BrowserActions.type(driver, inpAlternateBillingAccount,AlternateBillingAccount, "AlternateBillingAccount");
		return this;
	}
	public PaymentsPage clickPayment(WebDriver driver)  {
		BrowserActions.click(driver, btnPayment,"Payment");
		return this;
	}
	public PaymentsPage clickEffectiveDate(WebDriver driver)  {
		BrowserActions.click(driver, btnEffectiveDate,"EffectiveDate");
		return this;
	}
	public PaymentsPage enterFixInvoicesby(WebDriver driver,String FixInvoicesby) {
		BrowserActions.type(driver, inpFixInvoicesby,FixInvoicesby, "FixInvoicesby");
		return this;
	}
	public PaymentsPage clickInvoicing(WebDriver driver)  {
		BrowserActions.click(driver, rdbInvoicing,"Invoicing");
		return this;
	}
	public PaymentsPage selectFixInvoicesby(WebDriver driver,String FixInvoicesby)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpFixInvoicesby,FixInvoicesby,"FixInvoicesby");
		return this;
	}
	public PaymentsPage click90daydiary(WebDriver driver)  {
		BrowserActions.click(driver, btn90daydiary,"90daydiary");
		return this;
	}
	public PaymentsPage clickBindOptions(WebDriver driver)  {
		BrowserActions.click(driver, btnBindOptions,0.5,"BindOptions");
		return this;
	}
	public PaymentsPage selectAltBillingAccountMenuIcon(WebDriver driver,String AltBillingAccountMenuIcon)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpAltBillingAccountMenuIcon,AltBillingAccountMenuIcon,"AltBillingAccountMenuIcon");
		return this;
	}
	public PaymentsPage selectFixInvoicesby_1(WebDriver driver,String FixInvoicesby_1)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpFixInvoicesby_1,FixInvoicesby_1,"FixInvoicesby_1");
		return this;
	}
	public PaymentsPage clickEnableDisable(WebDriver driver)  {
		BrowserActions.click(driver, btnEnableDisable,"EnableDisable");
		return this;
	}
	public PaymentsPage clickIssuePolicy(WebDriver driver)  {
		BrowserActions.click(driver, btnIssuePolicy,0.5,"IssuePolicy");
		BrowserActions.confirmAlert(driver, "Confirm Alert");
		return this;
	}
	public PaymentsPage clickPolicyPeriodSelector(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyPeriodSelector,"PolicyPeriodSelector");
		return this;
	}
	public PaymentsPage enterFirstPaymentDate(WebDriver driver,String FirstPaymentDate) {
		BrowserActions.type(driver, inpFirstPaymentDate,FirstPaymentDate, "FirstPaymentDate");
		return this;
	}
	public PaymentsPage clickNewmail(WebDriver driver)  {
		BrowserActions.click(driver, btnNewmail,"Newmail");
		return this;
	}
	public PaymentsPage clickGetMotorVehicleReports(WebDriver driver)  {
		BrowserActions.click(driver, btnGetMotorVehicleReports,"GetMotorVehicleReports");
		return this;
	}
	public PaymentsPage clickQualification(WebDriver driver)  {
		BrowserActions.click(driver, btnQualification,"Qualification");
		return this;
	}
	public PaymentsPage click6498(WebDriver driver)  {
		BrowserActions.click(driver, btn6498,"6498");
		return this;
	}
	public PaymentsPage selectDayofMonth(WebDriver driver,String DayofMonth)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpDayofMonth,DayofMonth,"DayofMonth");
		return this;
	}
	public PaymentsPage clickParticipants(WebDriver driver)  {
		BrowserActions.click(driver, btnParticipants,"Participants");
		return this;
	}
	public PaymentsPage clickPACoverages(WebDriver driver)  {
		BrowserActions.click(driver, btnPACoverages,"PACoverages");
		return this;
	}
	public PaymentsPage clickReviewandapprove(WebDriver driver)  {
		BrowserActions.click(driver, btnReviewandapprove,"Reviewandapprove");
		return this;
	}
	public PaymentsPage clickNewDocument(WebDriver driver)  {
		BrowserActions.click(driver, btnNewDocument,"NewDocument");
		return this;
	}
	public PaymentsPage clickUploaddocuments(WebDriver driver)  {
		BrowserActions.click(driver, btnUploaddocuments,"Uploaddocuments");
		return this;
	}
	public PaymentsPage clickFinish(WebDriver driver)  {
		BrowserActions.click(driver, btnFinish,"Finish");
		return this;
	}
	public PaymentsPage clickProductDefinition(WebDriver driver)  {
		BrowserActions.click(driver, btnProductDefinition,"ProductDefinition");
		return this;
	}
	public PaymentsPage clickGetInspectionOutsideService(WebDriver driver)  {
		BrowserActions.click(driver, btnGetInspectionOutsideService,"GetInspectionOutsideService");
		return this;
	}
	public PaymentsPage clickMeetwithInsured(WebDriver driver)  {
		BrowserActions.click(driver, btnMeetwithInsured,"MeetwithInsured");
		return this;
	}
	public PaymentsPage clickOfferings(WebDriver driver)  {
		BrowserActions.click(driver, btnOfferings,"Offerings");
		return this;
	}
	public PaymentsPage clickPolicyReviewRenewal(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyReviewRenewal,"PolicyReviewRenewal");
		return this;
	}
	public PaymentsPage clickNewNote(WebDriver driver)  {
		BrowserActions.click(driver, btnNewNote,"NewNote");
		return this;
	}
	public PaymentsPage clickRiskAnalysis(WebDriver driver)  {
		BrowserActions.click(driver, btnRiskAnalysis,"RiskAnalysis");
		return this;
	}
	public PaymentsPage clickMeetwithProducerAgency(WebDriver driver)  {
		BrowserActions.click(driver, btnMeetwithProducerAgency,"MeetwithProducerAgency");
		return this;
	}
	public PaymentsPage clickPolicyReview(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyReview,"PolicyReview");
		return this;
	}
	public PaymentsPage clickManuallyrateandquotepolicy(WebDriver driver)  {
		BrowserActions.click(driver, btnManuallyrateandquotepolicy,"Manuallyrateandquotepolicy");
		return this;
	}
	public PaymentsPage clickDrivers(WebDriver driver)  {
		BrowserActions.click(driver, btnDrivers,"Drivers");
		return this;
	}
	public PaymentsPage clickHistory(WebDriver driver)  {
		BrowserActions.click(driver, btnHistory,"History");
		return this;
	}
	public PaymentsPage clickEdit(WebDriver driver)  {
		BrowserActions.click(driver, btnEdit,"Edit");
		return this;
	}
	public PaymentsPage clickWithdrawTransaction(WebDriver driver)  {
		BrowserActions.click(driver, btnWithdrawTransaction,"WithdrawTransaction");
		BrowserActions.confirmAlert(driver,"Alert");
		return this;
	}
	public PaymentsPage clickPolicyInfo(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyInfo,"PolicyInfo");
		return this;
	}
	public PaymentsPage clickVersions(WebDriver driver)  {
		BrowserActions.click(driver, btnVersions,"Versions");
		return this;
	}
	public PaymentsPage clickAccountFile(WebDriver driver)  {
		BrowserActions.click(driver, btnAccountFile,"AccountFile");
		return this;
	}
	public PaymentsPage clickRemove(WebDriver driver)  {
		BrowserActions.click(driver, btnRemove,"Remove");
		return this;
	}
	public PaymentsPage enterInvoicingDays(WebDriver driver,String InvoicingDays) {
		BrowserActions.type(driver, inpInvoicingDays,InvoicingDays, "InvoicingDays");
		return this;
	}
	public PaymentsPage clickSearch_1(WebDriver driver)  {
		BrowserActions.click(driver, btnSearch_1,"Search_1");
		return this;
	}
	public PaymentsPage clickCopyData(WebDriver driver)  {
		BrowserActions.click(driver, btnCopyData,"CopyData");
		return this;
	}
	public PaymentsPage selectChangeBillingContactButtonMenuIcon(WebDriver driver,String ChangeBillingContactButtonMenuIcon)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpChangeBillingContactButtonMenuIcon,ChangeBillingContactButtonMenuIcon,"ChangeBillingContactButtonMenuIcon");
		return this;
	}
	public PaymentsPage selectDayOfWeek(WebDriver driver,String DayOfWeek)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpDayOfWeek,DayOfWeek,"DayOfWeek");
		return this;
	}
	public PaymentsPage clickClose(WebDriver driver)  {
		BrowserActions.click(driver, btnClose,"Close");
		return this;
	}
	public PaymentsPage clickReview60dayUWPeriod(WebDriver driver)  {
		BrowserActions.click(driver, btnReview60dayUWPeriod,"Review60dayUWPeriod");
		return this;
	}
	public PaymentsPage clickEditPolicyTransaction(WebDriver driver)  {
		BrowserActions.click(driver, btnEditPolicyTransaction,"EditPolicyTransaction");
		return this;
	}
	public PaymentsPage clickAdd_1(WebDriver driver)  {
		BrowserActions.click(driver, btnAdd_1,"Add_1");
		return this;
	}
	public PaymentsPage clickNewActivity(WebDriver driver)  {
		BrowserActions.click(driver, btnNewActivity,"NewActivity");
		return this;
	}
	public PaymentsPage selectPlanType(WebDriver driver,String PlanType)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPlanType,PlanType,"PlanType");
		return this;
	}
	public PaymentsPage clickCancel(WebDriver driver)  {
		BrowserActions.click(driver, btnCancel,"Cancel");
		return this;
	}
	public PaymentsPage clickPolicyContract(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyContract,"PolicyContract");
		return this;
	}
	public PaymentsPage clickRequest(WebDriver driver)  {
		BrowserActions.click(driver, btnRequest,"Request");
		return this;
	}
	public PaymentsPage selectSecondDayofMonth(WebDriver driver,String SecondDayofMonth)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpSecondDayofMonth,SecondDayofMonth,"SecondDayofMonth");
		return this;
	}
	public PaymentsPage clickGetRiskInformationProducer(WebDriver driver)  {
		BrowserActions.click(driver, btnGetRiskInformationProducer,"GetRiskInformationProducer");
		return this;
	}
	public PaymentsPage clickClose_1(WebDriver driver)  {
		BrowserActions.click(driver, btnClose_1,"Close_1");
		return this;
	}
	public PaymentsPage clickGetAuditInternalPersonnel(WebDriver driver)  {
		BrowserActions.click(driver, btnGetAuditInternalPersonnel,"GetAuditInternalPersonnel");
		return this;
	}
	public PaymentsPage selectPolicyPeriodSelector_Arg(WebDriver driver,String PolicyPeriodSelector_Arg)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPolicyPeriodSelector_Arg,PolicyPeriodSelector_Arg,"PolicyPeriodSelector_Arg");
		return this;
	}
	public PaymentsPage clickShowPartialWorksheet(WebDriver driver)  {
		BrowserActions.click(driver, btnShowPartialWorksheet,"ShowPartialWorksheet");
		return this;
	}
	public PaymentsPage click60daydiary(WebDriver driver)  {
		BrowserActions.click(driver, btn60daydiary,"60daydiary");
		return this;
	}
	public PaymentsPage clickBack(WebDriver driver)  {
		BrowserActions.click(driver, btnBack,"Back");
		return this;
	}
	public PaymentsPage enterDescription_1(WebDriver driver,String Description_1) {
		BrowserActions.type(driver, inpDescription_1,Description_1, "Description_1");
		return this;
	}
	public PaymentsPage clickPolicyVersions_1(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyVersions_1,"PolicyVersions_1");
		return this;
	}
	public PaymentsPage clickNext(WebDriver driver)  {
		BrowserActions.click(driver, btnNext,"Next");
		return this;
	}
	public PaymentsPage clickQuoteRequired(WebDriver driver)  {
		BrowserActions.click(driver, btnQuoteRequired,"QuoteRequired");
		return this;
	}
	public PaymentsPage clickNewPerson(WebDriver driver)  {
		BrowserActions.click(driver, btnNewPerson,"NewPerson");
		return this;
	}
	public PaymentsPage clickSaveDraft(WebDriver driver)  {
		BrowserActions.click(driver, btnSaveDraft,"SaveDraft");
		return this;
	}
	public PaymentsPage clickGetBureauData(WebDriver driver)  {
		BrowserActions.click(driver, btnGetBureauData,"GetBureauData");
		return this;
	}
	public PaymentsPage clickReinsurance(WebDriver driver)  {
		BrowserActions.click(driver, btnReinsurance,"Reinsurance");
		return this;
	}
	public PaymentsPage clickInstallmentPreviewIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnInstallmentPreviewIcon,"InstallmentPreviewIcon");
		return this;
	}
	public PaymentsPage clickExistingBillingContacts(WebDriver driver)  {
		BrowserActions.click(driver, btnExistingBillingContacts,"ExistingBillingContacts");
		return this;
	}
	public PaymentsPage enterFrequency_1(WebDriver driver,String Frequency_1) {
		BrowserActions.type(driver, inpFrequency_1,Frequency_1, "Frequency_1");
		return this;
	}
	public PaymentsPage clickCreatefromatemplate(WebDriver driver)  {
		BrowserActions.click(driver, btnCreatefromatemplate,"Createfromatemplate");
		return this;
	}
	public PaymentsPage selectRequiresFinalaudit(WebDriver driver,String RequiresFinalaudit)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpRequiresFinalaudit,RequiresFinalaudit,"RequiresFinalaudit");
		return this;
	}
	public PaymentsPage clickStartSidebySide(WebDriver driver)  {
		BrowserActions.click(driver, btnStartSidebySide,"StartSidebySide");
		return this;
	}
	public PaymentsPage clickArchiving(WebDriver driver)  {
		BrowserActions.click(driver, btnArchiving,"Archiving");
		return this;
	}
	public PaymentsPage clickNotTaken(WebDriver driver)  {
		BrowserActions.click(driver, btnNotTaken,"NotTaken");
		return this;
	}
	public PaymentsPage clickDocuments(WebDriver driver)  {
		BrowserActions.click(driver, btnDocuments,"Documents");
		return this;
	}
	public PaymentsPage clickOtherContacts(WebDriver driver)  {
		BrowserActions.click(driver, btnOtherContacts,"OtherContacts");
		return this;
	}
	public PaymentsPage clickQuote(WebDriver driver)  {
		BrowserActions.click(driver, btnQuote,"Quote");
		return this;
	}
	public PaymentsPage clickVehicles(WebDriver driver)  {
		BrowserActions.click(driver, btnVehicles,"Vehicles");
		return this;
	}
	public PaymentsPage clickReleaseLock(WebDriver driver)  {
		BrowserActions.click(driver, btnReleaseLock,"ReleaseLock");
		return this;
	}
	public PaymentsPage clickPayment_1(WebDriver driver)  {
		BrowserActions.click(driver, rdbPayment_1,"Payment_1");
		return this;
	}
	public PaymentsPage clickCreateNewProducer(WebDriver driver)  {
		BrowserActions.click(driver, btnCreateNewProducer,"CreateNewProducer");
		return this;
	}
	public PaymentsPage clickAdd(WebDriver driver)  {
		BrowserActions.click(driver, btnAdd,"Add");
		return this;
	}
	public PaymentsPage clickForms(WebDriver driver)  {
		BrowserActions.click(driver, btnForms,"Forms");
		return this;
	}
	public PaymentsPage clickNotes(WebDriver driver)  {
		BrowserActions.click(driver, btnNotes,"Notes");
		return this;
	}
	public PaymentsPage selectSecondDayofMonth_1(WebDriver driver,String SecondDayofMonth_1)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpSecondDayofMonth_1,SecondDayofMonth_1,"SecondDayofMonth_1");
		return this;
	}
	public PaymentsPage clickQuote_1(WebDriver driver)  {
		BrowserActions.click(driver, btnQuote_1,"Quote_1");
		return this;
	}
	public PaymentsPage enterPayUsing(WebDriver driver,String PayUsing) {
		BrowserActions.type(driver, inpPayUsing,PayUsing, "PayUsing");
		return this;
	}
	public PaymentsPage clickOverridden(WebDriver driver)  {
		BrowserActions.click(driver, chkOverridden,"Overridden");
		return this;
	}
	public PaymentsPage clickGetInspectionLossControl(WebDriver driver)  {
		BrowserActions.click(driver, btnGetInspectionLossControl,"GetInspectionLossControl");
		return this;
	}
	public PaymentsPage clickCreate(WebDriver driver)  {
		BrowserActions.click(driver, btnCreate,"Create");
		return this;
	}
	public PaymentsPage enterDescription(WebDriver driver,String Description) {
		BrowserActions.type(driver, inpDescription,Description, "Description");
		return this;
	}
	public PaymentsPage clickLegalreview(WebDriver driver)  {
		BrowserActions.click(driver, btnLegalreview,"Legalreview");
		return this;
	}
	public PaymentsPage clickUnappliedFund(WebDriver driver)  {
		BrowserActions.click(driver, rdbUnappliedFund,"UnappliedFund");
		return this;
	}
	public PaymentsPage clickPolicynotification(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicynotification,"Policynotification");
		return this;
	}
	public PaymentsPage clickGoto(WebDriver driver)  {
		BrowserActions.click(driver, btnGoto,"Goto");
		return this;
	}
	public PaymentsPage clickUnderwriterReview(WebDriver driver)  {
		BrowserActions.click(driver, btnUnderwriterReview,"UnderwriterReview");
		return this;
	}
	public PaymentsPage click30daydiary(WebDriver driver)  {
		BrowserActions.click(driver, btn30daydiary,"30daydiary");
		return this;
	}
	public PaymentsPage clickSearch(WebDriver driver)  {
		BrowserActions.click(driver, btnSearch,"Search");
		return this;
	}
	public PaymentsPage clickSidebySideQuoting(WebDriver driver)  {
		BrowserActions.click(driver, btnSidebySideQuoting,"SidebySideQuoting");
		return this;
	}
	public PaymentsPage selectDayofMonth_1(WebDriver driver,String DayofMonth_1)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpDayofMonth_1,DayofMonth_1,"DayofMonth_1");
		return this;
	}
	public PaymentsPage clickCollectCreditCard(WebDriver driver)  {
		BrowserActions.click(driver, btnCollectCreditCard,"CollectCreditCard");
		return this;
	}
	public PaymentsPage enterFirstPaymentDate_1(WebDriver driver,String FirstPaymentDate_1) {
		BrowserActions.type(driver, inpFirstPaymentDate_1,FirstPaymentDate_1, "FirstPaymentDate_1");
		return this;
	}
	public PaymentsPage clickRatiooutofrange(WebDriver driver)  {
		BrowserActions.click(driver, btnRatiooutofrange,"Ratiooutofrange");
		return this;
	}
	public PaymentsPage clickFullApp(WebDriver driver)  {
		BrowserActions.click(driver, btnFullApp,"FullApp");
		return this;
	}
	public PaymentsPage clickDiagnosticData(WebDriver driver)  {
		BrowserActions.click(driver, btnDiagnosticData,"DiagnosticData");
		return this;
	}
	public PaymentsPage clickReminder(WebDriver driver)  {
		BrowserActions.click(driver, btnReminder,"Reminder");
		return this;
	}
	public PaymentsPage selectBillingMethod(WebDriver driver,String BillingMethod)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpBillingMethod,BillingMethod,true,"BillingMethod");
		return this;
	}
	public PaymentsPage clickReviewnewmail(WebDriver driver)  {
		BrowserActions.click(driver, btnReviewnewmail,"Reviewnewmail");
		return this;
	}
	public PaymentsPage clickGroup(WebDriver driver)  {
		BrowserActions.click(driver, btnGroup,"Group");
		return this;
	}
	public PaymentsPage clickCancelasplitpolicy(WebDriver driver)  {
		BrowserActions.click(driver, btnCancelasplitpolicy,"Cancelasplitpolicy");
		return this;
	}
	public PaymentsPage clickGetAuditOutsideService(WebDriver driver)  {
		BrowserActions.click(driver, btnGetAuditOutsideService,"GetAuditOutsideService");
		return this;
	}
	public PaymentsPage clickNewAuditAssignment(WebDriver driver)  {
		BrowserActions.click(driver, btnNewAuditAssignment,"NewAuditAssignment");
		return this;
	}
	public PaymentsPage clickRewritetoNewAccount(WebDriver driver)  {
		BrowserActions.click(driver, btnRewritetoNewAccount,"RewritetoNewAccount");
		return this;
	}
	public PaymentsPage clickNewCompany(WebDriver driver)  {
		BrowserActions.click(driver, btnNewCompany,"NewCompany");
		return this;
	}
	public PaymentsPage clickReview30dayUWPeriod(WebDriver driver)  {
		BrowserActions.click(driver, btnReview30dayUWPeriod,"Review30dayUWPeriod");
		return this;
	}
	public PaymentsPage clickPolicyVersions(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyVersions,"PolicyVersions");
		return this;
	}
	public PaymentsPage clickBillingSubaccounts(WebDriver driver)  {
		BrowserActions.click(driver, btnBillingSubaccounts,"BillingSubaccounts");
		return this;
	}
	public PaymentsPage clickDownPaymentPreviewIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnDownPaymentPreviewIcon,"DownPaymentPreviewIcon");
		return this;
	}
	public PaymentsPage clickCloseOptions(WebDriver driver)  {
		BrowserActions.click(driver, btnCloseOptions,"CloseOptions");
		return this;
	}
	public PaymentsPage clickPolicyFile(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyFile,"PolicyFile");
		return this;
	}
	public PaymentsPage clickVerifycoverage(WebDriver driver)  {
		BrowserActions.click(driver, btnVerifycoverage,"Verifycoverage");
		return this;
	}
	public PaymentsPage clickGetCreditReports(WebDriver driver)  {
		BrowserActions.click(driver, btnGetCreditReports,"GetCreditReports");
		return this;
	}
	public PaymentsPage clickDecline(WebDriver driver)  {
		BrowserActions.click(driver, btnDecline,"Decline");
		return this;
	}
	public PaymentsPage clickSubManager(WebDriver driver)  {
		BrowserActions.click(driver, btnSubManager,"SubManager");
		return this;
	}
	public PaymentsPage clickRenew(WebDriver driver)  {
		BrowserActions.click(driver, btnRenew,"Renew");
		return this;
	}
	public PaymentsPage choosePaymentSchedule(WebDriver driver, String PaymentSchedule){
		 By paymentScheduleBy = By.xpath("(//div[text()='" + PaymentSchedule + "']/preceding::td[1])[1]");
		 BrowserActions.waitForElementToDisplay(driver, paymentScheduleBy, "Payment Schedule");
		 WebElement chkPaymentSchedule = paymentScheduleBy.findElement(driver);
		 BrowserActions.click(driver, chkPaymentSchedule ,"Payment Schedule");
		return this;
	}
	public PaymentsPage chooseUpFrontPayment(WebDriver driver,String Upfrontpayment) {
		By upfrontpaymentBy =By.xpath("//div[text()='" + Upfrontpayment + "']/preceding::div[1]");
		BrowserActions.waitForElementToDisplay(driver, upfrontpaymentBy, "Upfront Payment");
		WebElement upFrontPayment = upfrontpaymentBy.findElement(driver);
		BrowserActions.click(driver,upFrontPayment,"upFrontPayment");
		return this;
	}

	public PaymentsPage clickDetails(WebDriver driver) {
		BrowserActions.click(driver, btnDetails, "Details button");
		return this;
	}
}
