package com.aspire.guidewire.cc.pages.common;
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

public class CheckDetailsPage extends LoadableComponent<CheckDetailsPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
 	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
//	public TopNavBar topnavbar;
//	public CheckPayees checkpayeesTable;
//
//	public CheckSummaryPayments checksummarypaymentsTable;
//
//	public PaymentDeductions paymentdeductionsTable;

	@IFindBy(how = How.CSS, using = "input[name='ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-Transfer_Check']", AI = false)
	private WebElement inpTransferredToClaim;

	@IFindBy(how = How.CSS, using = "input[name='ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-ServicePeriod']", AI = false)
	private WebElement inpServicePeriod;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-ClaimFinancialsChecksDetail_TransferButton>div[role='button']", AI = false)
	private WebElement btnTransfer;

	@IFindBy(how = How.CSS, using = "input[name='ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-InstantPaymentNumber']", AI = false)
	private WebElement inpInstantPaymentNumber;

	@IFindBy(how = How.CSS, using = "select[name='ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-TaxReporting']", AI = false)
	private WebElement drpTaxReporting;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-Claimant-MenuItem_ViewDetails>div[role='menuitem']", AI = false)
	private WebElement btnViewContactDetails;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-CheckPayeesLV-0-CheckPayee_Payee-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_CompanyVendor>div[role='menuitem']", AI = false)
	private WebElement btnVendorCompany_8;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-CheckExchangeRateInputSet-Transaction_RateSet_Date_dateIcon", AI = false)
	private WebElement btnExchangeRateEffectiveDateDateIcon;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-CreateUser-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_NewLegalVenue>div[role='menuitem']", AI = false)
	private WebElement btnLegalVenue_30;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-CheckSummaryPaymentsLV-0-PaymentAmountViewDetail", AI = false)
	private WebElement btnPaymentAmountViewDetail;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-InvoiceWasAutoPaid .gw-AlertBar--label", AI = false)
	private WebElement lblAutopaidinvoicefornull;

	@IFindBy(how = How.CSS, using = "select[name='ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-CheckSummaryPaymentsLV-0-ReservingCurrency']", AI = false)
	private WebElement drpReservingCurrency;

	@IFindBy(how = How.CSS, using = "input[name='ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-CheckExchangeRateInputSet-Transaction_RateSet_Date']", AI = false)
	private WebElement inpExchangeRateEffectiveDate;

	@IFindBy(how = How.CSS, using = "select[name='ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-CheckSummaryPaymentsLV-0-Status']", AI = false)
	private WebElement drpStatus_33;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-CreateUser-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewCompany>div[role='menuitem']", AI = false)
	private WebElement btnNewCompany_25;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-CheckPayeesLV-0-CheckPayee_Payee-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal>div[role='menuitem']", AI = false)
	private WebElement btnNewLegal_10;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-ClaimFinancialsChecksDetail_ChangeRecurrenceScheduleButton>div[role='button']", AI = false)
	private WebElement btnChangeRecurrenceSchedule;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-CreateUser-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_Doctor>div[role='menuitem']", AI = false)
	private WebElement btnDoctor_22;

	@IFindBy(how = How.CSS, using = "input[name='ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-Amount_Reportable']", AI = false)
	private WebElement inpReportableAmount;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-CreateUser-CreateUserMenuIcon>div[role='button']", AI = false)
	private WebElement btnCreateUserMenuIcon;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-CheckPayeesLV-0-CheckPayee_Payee-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoRepairShop>div[role='menuitem']", AI = false)
	private WebElement btnAutobodyRepairShop_4;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-Claimant-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Adjudicator>div[role='menuitem']", AI = false)
	private WebElement btnAdjudicator;

	@IFindBy(how = How.CSS, using = "input[name='ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-ScheduledSendDate']", AI = false)
	private WebElement inpWhenToPay;

	@IFindBy(how = How.CSS, using = "input[name='ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-InstantPmtVendorStatusDesc']", AI = false)
	private WebElement inpVendorStatusDescription;

	@IFindBy(how = How.CSS, using = "select[name='ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-CheckPayeesLV-0-CheckPayee_PayeeType']", AI = false)
	private WebElement drpType;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-Claimant-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewPerson>div[role='menuitem']", AI = false)
	private WebElement btnNewPerson;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-CheckPayeesLV-0-CheckPayee_Payee-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewCompany>div[role='menuitem']", AI = false)
	private WebElement btnNewCompany_9;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-CheckPayeesLV-0-CheckPayee_Payee-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor>div[role='menuitem']", AI = false)
	private WebElement btnNewVendor_3;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-CreateTime_dateIcon", AI = false)
	private WebElement btnCreatedOnDateIcon;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-CreateUser-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor>div[role='menuitem']", AI = false)
	private WebElement btnNewVendor_19;

	@IFindBy(how = How.CSS, using = "input[name='ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-CheckNumber']", AI = false)
	private WebElement inpCheckNumber;

	@IFindBy(how = How.CSS, using = "input[name='ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-CheckSummaryPaymentsLV-0-Check_ScheduledSendDate']", AI = false)
	private WebElement inpScheduledSendDate;

	@IFindBy(how = How.CSS, using = "select[name='ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-BankAccount']", AI = false)
	private WebElement drpBankAccount;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-CreateUser-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal>div[role='menuitem']", AI = false)
	private WebElement btnNewLegal_26;

	@IFindBy(how = How.CSS, using = "input[name='ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-InstantPmtDataInputSet-MailingAddressInstantPmt']", AI = false)
	private WebElement inpMailingAddress_1;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-CheckPayeesLV-0-CheckPayee_Payee-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Adjudicator>div[role='menuitem']", AI = false)
	private WebElement btnAdjudicator_11;

	@IFindBy(how = How.CSS, using = "input[name='ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-CheckExchangeRateInputSet-Transaction_ExchangeRateOverride']", AI = false)
	private WebElement rdbExchangeRateMode;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-Claimant-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoRepairShop>div[role='menuitem']", AI = false)
	private WebElement btnAutobodyRepairShop;

	@IFindBy(how = How.CSS, using = "select[name='ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-CheckBatching']", AI = false)
	private WebElement drpCheckBatching;

	@IFindBy(how = How.CSS, using = "input[name='ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-CheckSummaryPaymentsLV-0-Exposure']", AI = false)
	private WebElement inpExposure;

	@IFindBy(how = How.CSS, using = "input[name='ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-MailToContact']", AI = false)
	private WebElement inpRecipient_17;

	@IFindBy(how = How.CSS, using = "input[name='ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-Portion_Percentage']", AI = false)
	private WebElement inpPercentagePortionOfPayments;

	@IFindBy(how = How.CSS, using = "input[name='ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-BulkInvoice']", AI = false)
	private WebElement inpBulkInvoice;

	@IFindBy(how = How.CSS, using = "input[name='ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-CreateTime']", AI = false)
	private WebElement inpCreatedOn;

	@IFindBy(how = How.CSS, using = "select[name='ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-Claimant']", AI = false)
	private WebElement drpClaimant;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-Claimant-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor>div[role='menuitem']", AI = false)
	private WebElement btnNewVendor;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-Claimant-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_CompanyVendor>div[role='menuitem']", AI = false)
	private WebElement btnVendorCompany;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-Claimant-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_LawFirm>div[role='menuitem']", AI = false)
	private WebElement btnLawFirm;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-CreateUser-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Adjudicator>div[role='menuitem']", AI = false)
	private WebElement btnAdjudicator_27;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-EFTDataInputSet-PayTo textarea", AI = false)
	private WebElement inpNameontheAccount;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-Claimant-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal>div[role='menuitem']", AI = false)
	private WebElement btnNewLegal;

	@IFindBy(how = How.CSS, using = "input[name='ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-Portion_FixedAmount']", AI = false)
	private WebElement inpFixedPortionOfPayments;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-ScheduledSendDate_dateIcon", AI = false)
	private WebElement btnWhenToPayDateIcon;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-Claimant-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_NewLegalVenue>div[role='menuitem']", AI = false)
	private WebElement btnLegalVenue;

	@IFindBy(how = How.CSS, using = "select[name='ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-CheckSummaryPaymentsLV-0-CoverageType']", AI = false)
	private WebElement drpCoverage;

	@IFindBy(how = How.CSS, using = "input[name='ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-DateOfService']", AI = false)
	private WebElement inpDateofService;

	@IFindBy(how = How.CSS, using = "input[name='ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-InvoiceNumber']", AI = false)
	private WebElement inpInvoiceNumber;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-CheckSummaryPaymentsLV-0-Check_ScheduledSendDate_dateIcon", AI = false)
	private WebElement btnScheduledSendDateDateIcon;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-ClaimFinancialsChecksDetail_ReissueButton>div[role='button']", AI = false)
	private WebElement btnReissue;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-ClaimFinancialsChecksDetail_CloneButton>div[role='button']", AI = false)
	private WebElement btnClone;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-CreateUser-MenuItem_ViewDetails>div[role='menuitem']", AI = false)
	private WebElement btnViewContactDetails_32;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-CreateUser-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_MedicalCareOrg>div[role='menuitem']", AI = false)
	private WebElement btnMedicalCareOrganization_23;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-CheckPayeesLV-0-CheckPayee_Payee-MenuItem_ViewDetails>div[role='menuitem']", AI = false)
	private WebElement btnViewContactDetails_16;

	@IFindBy(how = How.CSS, using = "input[name='ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-CheckPayeesLV-0-TaxID']", AI = false)
	private WebElement inpPayeeTaxID;

	@IFindBy(how = How.CSS, using = "input[name='ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-InstantPmtDataInputSet-CellPhone']", AI = false)
	private WebElement inpCellPhone;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-CreateUser-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoTowingAgcy>div[role='menuitem']", AI = false)
	private WebElement btnAutoTowingAgency_21;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-ClaimFinancialsChecksDetail_ResubmitButton>div[role='button']", AI = false)
	private WebElement btnResubmit;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-CreateUser-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_LawFirm>div[role='menuitem']", AI = false)
	private WebElement btnLawFirm_29;

	@IFindBy(how = How.CSS, using = "input[name='ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-Recurrence_Description']", AI = false)
	private WebElement inpDescription;

	@IFindBy(how = How.CSS, using = "input[name='ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-MailingAddress']", AI = false)
	private WebElement inpMailingAddress;

	@IFindBy(how = How.CSS, using = "select[name='ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-PaymentMethod']", AI = false)
	private WebElement drpPaymentMethod;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-CheckPayeesLV-0-CheckPayee_Payee-CheckPayee_PayeeMenuIcon>div[role='button']", AI = false)
	private WebElement btnCheckPayee_PayeeMenuIcon;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-CreateUser-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewPerson>div[role='menuitem']", AI = false)
	private WebElement btnNewPerson_18;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-DateOfService_dateIcon", AI = false)
	private WebElement btnDateofServiceDateIcon;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-Claimant-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_MedicalCareOrg>div[role='menuitem']", AI = false)
	private WebElement btnMedicalCareOrganization;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-Claimant-MenuItem_Search>div[role='menuitem']", AI = false)
	private WebElement btnSearch;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-Claimant-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Attorney>div[role='menuitem']", AI = false)
	private WebElement btnAttorney;

	@IFindBy(how = How.CSS, using = "input[name='ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-EFTDataInputSet-BankName']", AI = false)
	private WebElement inpBankName;

	@IFindBy(how = How.CSS, using = "input[name='ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-EFTDataInputSet-BankRoutingNumber']", AI = false)
	private WebElement inpRoutingNumber;

	@IFindBy(how = How.CSS, using = "select[name='ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-CreateUser']", AI = false)
	private WebElement drpCreatedBy;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-IssueDate_dateIcon", AI = false)
	private WebElement btnIssueDateDateIcon;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-CreateUser-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_CompanyVendor>div[role='menuitem']", AI = false)
	private WebElement btnVendorCompany_24;

	@IFindBy(how = How.CSS, using = "input[name='ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-CheckExchangeRateInputSet-Transaction_ExchangeRate']", AI = false)
	private WebElement inpExchangeRate;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-Claimant-ClaimantMenuIcon>div[role='button']", AI = false)
	private WebElement btnClaimantMenuIcon;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-Claimant-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoTowingAgcy>div[role='menuitem']", AI = false)
	private WebElement btnAutoTowingAgency;

	@IFindBy(how = How.CSS, using = "input[name='ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-Memo']", AI = false)
	private WebElement inpMemo;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-ClaimFinancialsChecksDetail_VoidStopButton>div[role='button']", AI = false)
	private WebElement btnVoidStop;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-CheckPayeesLV-0-CheckPayee_Payee-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Attorney>div[role='menuitem']", AI = false)
	private WebElement btnAttorney_12;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-CheckPayeesLV-0-CheckPayee_Payee-MenuItem_Search>div[role='menuitem']", AI = false)
	private WebElement btnSearch_15;

	@IFindBy(how = How.CSS, using = "input[name='ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-Comments']", AI = false)
	private WebElement inpComments;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-CheckPayeesLV-0-CheckPayee_Payee-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_NewLegalVenue>div[role='menuitem']", AI = false)
	private WebElement btnLegalVenue_14;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-ttlBar", AI = false)
	private WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "select[name='ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-DeliveryMethod']", AI = false)
	private WebElement drpCheckDelivery;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-ClaimFinancialsChecksDetail_EditButton>div[role='button']", AI = false)
	private WebElement btnEdit;

	@IFindBy(how = How.CSS, using = "select[name='ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-CheckSummaryPaymentsLV-0-PaymentType']", AI = false)
	private WebElement drpPmtType;

	@IFindBy(how = How.CSS, using = "input[name='ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-IssueDate']", AI = false)
	private WebElement inpIssueDate;

	@IFindBy(how = How.CSS, using = "input[name='ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-InstantPmtVendorStatus']", AI = false)
	private WebElement inpVendorStatus;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-CreateUser-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_Attorney>div[role='menuitem']", AI = false)
	private WebElement btnAttorney_28;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-CheckPayeesLV-0-CheckPayee_Payee-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewLegal-NewContactPickerMenuItemSet_LawFirm>div[role='menuitem']", AI = false)
	private WebElement btnLawFirm_13;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-ClaimFinancialsChecksDetail_DeleteButton>div[role='button']", AI = false)
	private WebElement btnDelete;

	@IFindBy(how = How.CSS, using = "input[name='ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-EFTDataInputSet-BankAccountNumber']", AI = false)
	private WebElement inpAccountNumber;

	@IFindBy(how = How.CSS, using = "input[name='ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-InstantPmtDataInputSet-Email']", AI = false)
	private WebElement inpEmailAddress;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-CheckPayeesLV-0-CheckPayee_Payee-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoTowingAgcy>div[role='menuitem']", AI = false)
	private WebElement btnAutoTowingAgency_5;

	@IFindBy(how = How.CSS, using = "select[name='ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-Status']", AI = false)
	private WebElement drpStatus;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-CheckPayeesLV-0-CheckPayee_Payee-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewPerson>div[role='menuitem']", AI = false)
	private WebElement btnNewPerson_2;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-CreateUser-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_AutoRepairShop>div[role='menuitem']", AI = false)
	private WebElement btnAutobodyRepairShop_20;

	@IFindBy(how = How.CSS, using = "select[name='ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-EFTDataInputSet-EFTRecords']", AI = false)
	private WebElement drpSelectEFTRecord;

	@IFindBy(how = How.CSS, using = "select[name='ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-CheckInstructions']", AI = false)
	private WebElement drpCheckInstructions;

	@IFindBy(how = How.CSS, using = "input[name='ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-CheckExchangeRateInputSet-Transaction_RateSet_Description']", AI = false)
	private WebElement inpExchangeRateDescription;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-Claimant-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewCompany>div[role='menuitem']", AI = false)
	private WebElement btnNewCompany;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-CheckPayeesLV-0-CheckPayee_Payee-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_MedicalCareOrg>div[role='menuitem']", AI = false)
	private WebElement btnMedicalCareOrganization_7;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-InvoiceWasAutoPaid-CloseBtn", AI = false)
	private WebElement btnClose;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-Claimant-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_Doctor>div[role='menuitem']", AI = false)
	private WebElement btnDoctor;

	@IFindBy(how = How.CSS, using = "select[name='ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-CheckPayeesLV-0-CheckPayee_Payee']", AI = false)
	private WebElement drpPayee;

	@IFindBy(how = How.CSS, using = "select[name='ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-CheckSummaryPaymentsLV-0-CostType']", AI = false)
	private WebElement drpCostType;

	@IFindBy(how = How.CSS, using = "input[name='ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-PayTo']", AI = false)
	private WebElement inpPayToTheOrderOf;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-CheckPayeesLV-0-CheckPayee_Payee-ClaimNewContactPickerMenuItemSet-NewContactPickerMenuItemSet_NewVendor-NewContactPickerMenuItemSet_Doctor>div[role='menuitem']", AI = false)
	private WebElement btnDoctor_6;

	@IFindBy(how = How.CSS, using = "input[name='ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-InstantPmtDataInputSet-MailToContactInstantPmt']", AI = false)
	private WebElement inpRecipient;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-CreateUser-MenuItem_Search>div[role='menuitem']", AI = false)
	private WebElement btnSearch_31;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-ClaimFinancialsChecksDetail_EditAllButton>div[role='button']", AI = false)
	private WebElement btnEditRecurrence;

	@IFindBy(how = How.CSS, using = "select[name='ClaimFinancialsChecksDetail-ClaimFinancialsChecksDetailScreen-CheckDV-CheckSummaryPaymentsLV-0-CostCategory']", AI = false)
	private WebElement drpCostCategory;

	public CheckDetailsPage(){
	}

	public CheckDetailsPage(WebDriver driver){
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(finder, this);
//		checkpayeesTable = new CheckPayees();
//		checksummarypaymentsTable = new CheckSummaryPayments();
//		paymentdeductionsTable = new PaymentDeductions();
}
@Override
	protected void load() {
		isPageLoaded = true;
		WaitUtils.waitForPageLoad(driver);
	}@Override
	protected void isLoaded() {
		if (!isPageLoaded) {
			Assert.fail();
		}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, drpCostCategory))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);
}public CheckDetailsPage enterTransferredToClaim(WebDriver driver,String TransferredToClaim) {
		            BrowserActions.type(driver, inpTransferredToClaim,TransferredToClaim, "TransferredToClaim");
			        return this;
           }
public CheckDetailsPage enterServicePeriod(WebDriver driver,String ServicePeriod) {
		            BrowserActions.type(driver, inpServicePeriod,ServicePeriod, "ServicePeriod");
			        return this;
           }
public CheckDetailsPage clickTransfer(WebDriver driver)  {
					BrowserActions.click(driver, btnTransfer,"Transfer");
				    return this;
			}
public CheckDetailsPage enterInstantPaymentNumber(WebDriver driver,String InstantPaymentNumber) {
		            BrowserActions.type(driver, inpInstantPaymentNumber,InstantPaymentNumber, "InstantPaymentNumber");
			        return this;
           }
public CheckDetailsPage selectTaxReporting(WebDriver driver,String TaxReporting)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpTaxReporting,TaxReporting,"TaxReporting");
				    return this;
			}
public CheckDetailsPage clickViewContactDetails(WebDriver driver)  {
					BrowserActions.click(driver, btnViewContactDetails,"ViewContactDetails");
				    return this;
			}
public CheckDetailsPage clickVendorCompany_8(WebDriver driver)  {
					BrowserActions.click(driver, btnVendorCompany_8,"VendorCompany_8");
				    return this;
			}
public CheckDetailsPage clickExchangeRateEffectiveDateDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnExchangeRateEffectiveDateDateIcon,"ExchangeRateEffectiveDateDateIcon");
				    return this;
			}
public CheckDetailsPage clickLegalVenue_30(WebDriver driver)  {
					BrowserActions.click(driver, btnLegalVenue_30,"LegalVenue_30");
				    return this;
			}
public CheckDetailsPage clickPaymentAmountViewDetail(WebDriver driver)  {
					BrowserActions.click(driver, btnPaymentAmountViewDetail,"PaymentAmountViewDetail");
				    return this;
			}
public CheckDetailsPage selectReservingCurrency(WebDriver driver,String ReservingCurrency)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpReservingCurrency,ReservingCurrency,"ReservingCurrency");
				    return this;
			}
public CheckDetailsPage enterExchangeRateEffectiveDate(WebDriver driver,String ExchangeRateEffectiveDate) {
		            BrowserActions.type(driver, inpExchangeRateEffectiveDate,ExchangeRateEffectiveDate, "ExchangeRateEffectiveDate");
			        return this;
           }
public CheckDetailsPage selectStatus_33(WebDriver driver,String Status_33)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpStatus_33,Status_33,"Status_33");
				    return this;
			}
public CheckDetailsPage clickNewCompany_25(WebDriver driver)  {
					BrowserActions.click(driver, btnNewCompany_25,"NewCompany_25");
				    return this;
			}
public CheckDetailsPage clickNewLegal_10(WebDriver driver)  {
					BrowserActions.click(driver, btnNewLegal_10,"NewLegal_10");
				    return this;
			}
public CheckDetailsPage clickChangeRecurrenceSchedule(WebDriver driver)  {
					BrowserActions.click(driver, btnChangeRecurrenceSchedule,"ChangeRecurrenceSchedule");
				    return this;
			}
public CheckDetailsPage clickDoctor_22(WebDriver driver)  {
					BrowserActions.click(driver, btnDoctor_22,"Doctor_22");
				    return this;
			}
public CheckDetailsPage enterReportableAmount(WebDriver driver,String ReportableAmount) {
		            BrowserActions.type(driver, inpReportableAmount,ReportableAmount, "ReportableAmount");
			        return this;
           }
public CheckDetailsPage clickCreateUserMenuIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnCreateUserMenuIcon,"CreateUserMenuIcon");
				    return this;
			}
public CheckDetailsPage clickAutobodyRepairShop_4(WebDriver driver)  {
					BrowserActions.click(driver, btnAutobodyRepairShop_4,"AutobodyRepairShop_4");
				    return this;
			}
public CheckDetailsPage clickAdjudicator(WebDriver driver)  {
					BrowserActions.click(driver, btnAdjudicator,"Adjudicator");
				    return this;
			}
public CheckDetailsPage enterWhenToPay(WebDriver driver,String WhenToPay) {
		            BrowserActions.type(driver, inpWhenToPay,WhenToPay, "WhenToPay");
			        return this;
           }
public CheckDetailsPage enterVendorStatusDescription(WebDriver driver,String VendorStatusDescription) {
		            BrowserActions.type(driver, inpVendorStatusDescription,VendorStatusDescription, "VendorStatusDescription");
			        return this;
           }
public CheckDetailsPage selectType(WebDriver driver,String Type)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpType,Type,"Type");
				    return this;
			}
public CheckDetailsPage clickNewPerson(WebDriver driver)  {
					BrowserActions.click(driver, btnNewPerson,"NewPerson");
				    return this;
			}
public CheckDetailsPage clickNewCompany_9(WebDriver driver)  {
					BrowserActions.click(driver, btnNewCompany_9,"NewCompany_9");
				    return this;
			}
public CheckDetailsPage clickNewVendor_3(WebDriver driver)  {
					BrowserActions.click(driver, btnNewVendor_3,"NewVendor_3");
				    return this;
			}
public CheckDetailsPage clickCreatedOnDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnCreatedOnDateIcon,"CreatedOnDateIcon");
				    return this;
			}
public CheckDetailsPage clickNewVendor_19(WebDriver driver)  {
					BrowserActions.click(driver, btnNewVendor_19,"NewVendor_19");
				    return this;
			}
public CheckDetailsPage enterCheckNumber(WebDriver driver,String CheckNumber) {
		            BrowserActions.type(driver, inpCheckNumber,CheckNumber, "CheckNumber");
			        return this;
           }
public CheckDetailsPage enterScheduledSendDate(WebDriver driver,String ScheduledSendDate) {
		            BrowserActions.type(driver, inpScheduledSendDate,ScheduledSendDate, "ScheduledSendDate");
			        return this;
           }
public CheckDetailsPage selectBankAccount(WebDriver driver,String BankAccount)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpBankAccount,BankAccount,"BankAccount");
				    return this;
			}
public CheckDetailsPage clickNewLegal_26(WebDriver driver)  {
					BrowserActions.click(driver, btnNewLegal_26,"NewLegal_26");
				    return this;
			}
public CheckDetailsPage enterMailingAddress_1(WebDriver driver,String MailingAddress_1) {
		            BrowserActions.type(driver, inpMailingAddress_1,MailingAddress_1, "MailingAddress_1");
			        return this;
           }
public CheckDetailsPage clickAdjudicator_11(WebDriver driver)  {
					BrowserActions.click(driver, btnAdjudicator_11,"Adjudicator_11");
				    return this;
			}
public CheckDetailsPage clickExchangeRateMode(WebDriver driver)  {
					BrowserActions.click(driver, rdbExchangeRateMode,"ExchangeRateMode");
				    return this;
			}
public CheckDetailsPage clickAutobodyRepairShop(WebDriver driver)  {
					BrowserActions.click(driver, btnAutobodyRepairShop,"AutobodyRepairShop");
				    return this;
			}
public CheckDetailsPage selectCheckBatching(WebDriver driver,String CheckBatching)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpCheckBatching,CheckBatching,"CheckBatching");
				    return this;
			}
public CheckDetailsPage enterExposure(WebDriver driver,String Exposure) {
		            BrowserActions.type(driver, inpExposure,Exposure, "Exposure");
			        return this;
           }
public CheckDetailsPage enterRecipient_17(WebDriver driver,String Recipient_17) {
		            BrowserActions.type(driver, inpRecipient_17,Recipient_17, "Recipient_17");
			        return this;
           }
public CheckDetailsPage enterPercentagePortionOfPayments(WebDriver driver,String PercentagePortionOfPayments) {
		            BrowserActions.type(driver, inpPercentagePortionOfPayments,PercentagePortionOfPayments, "PercentagePortionOfPayments");
			        return this;
           }
public CheckDetailsPage enterBulkInvoice(WebDriver driver,String BulkInvoice) {
		            BrowserActions.type(driver, inpBulkInvoice,BulkInvoice, "BulkInvoice");
			        return this;
           }
public CheckDetailsPage enterCreatedOn(WebDriver driver,String CreatedOn) {
		            BrowserActions.type(driver, inpCreatedOn,CreatedOn, "CreatedOn");
			        return this;
           }
public CheckDetailsPage selectClaimant(WebDriver driver,String Claimant)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpClaimant,Claimant,"Claimant");
				    return this;
			}
public CheckDetailsPage clickNewVendor(WebDriver driver)  {
					BrowserActions.click(driver, btnNewVendor,"NewVendor");
				    return this;
			}
public CheckDetailsPage clickVendorCompany(WebDriver driver)  {
					BrowserActions.click(driver, btnVendorCompany,"VendorCompany");
				    return this;
			}
public CheckDetailsPage clickLawFirm(WebDriver driver)  {
					BrowserActions.click(driver, btnLawFirm,"LawFirm");
				    return this;
			}
public CheckDetailsPage clickAdjudicator_27(WebDriver driver)  {
					BrowserActions.click(driver, btnAdjudicator_27,"Adjudicator_27");
				    return this;
			}
public CheckDetailsPage enterNameontheAccount(WebDriver driver,String NameontheAccount) {
		            BrowserActions.type(driver, inpNameontheAccount,NameontheAccount, "NameontheAccount");
			        return this;
           }
public CheckDetailsPage clickNewLegal(WebDriver driver)  {
					BrowserActions.click(driver, btnNewLegal,"NewLegal");
				    return this;
			}
public CheckDetailsPage enterFixedPortionOfPayments(WebDriver driver,String FixedPortionOfPayments) {
		            BrowserActions.type(driver, inpFixedPortionOfPayments,FixedPortionOfPayments, "FixedPortionOfPayments");
			        return this;
           }
public CheckDetailsPage clickWhenToPayDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnWhenToPayDateIcon,"WhenToPayDateIcon");
				    return this;
			}
public CheckDetailsPage clickLegalVenue(WebDriver driver)  {
					BrowserActions.click(driver, btnLegalVenue,"LegalVenue");
				    return this;
			}
public CheckDetailsPage selectCoverage(WebDriver driver,String Coverage)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpCoverage,Coverage,"Coverage");
				    return this;
			}
public CheckDetailsPage enterDateofService(WebDriver driver,String DateofService) {
		            BrowserActions.type(driver, inpDateofService,DateofService, "DateofService");
			        return this;
           }
public CheckDetailsPage enterInvoiceNumber(WebDriver driver,String InvoiceNumber) {
		            BrowserActions.type(driver, inpInvoiceNumber,InvoiceNumber, "InvoiceNumber");
			        return this;
           }
public CheckDetailsPage clickScheduledSendDateDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnScheduledSendDateDateIcon,"ScheduledSendDateDateIcon");
				    return this;
			}
public CheckDetailsPage clickReissue(WebDriver driver)  {
					BrowserActions.click(driver, btnReissue,"Reissue");
				    return this;
			}
public CheckDetailsPage clickClone(WebDriver driver)  {
					BrowserActions.click(driver, btnClone,"Clone");
				    return this;
			}
public CheckDetailsPage clickViewContactDetails_32(WebDriver driver)  {
					BrowserActions.click(driver, btnViewContactDetails_32,"ViewContactDetails_32");
				    return this;
			}
public CheckDetailsPage clickMedicalCareOrganization_23(WebDriver driver)  {
					BrowserActions.click(driver, btnMedicalCareOrganization_23,"MedicalCareOrganization_23");
				    return this;
			}
public CheckDetailsPage clickViewContactDetails_16(WebDriver driver)  {
					BrowserActions.click(driver, btnViewContactDetails_16,"ViewContactDetails_16");
				    return this;
			}
public CheckDetailsPage enterPayeeTaxID(WebDriver driver,String PayeeTaxID) {
		            BrowserActions.type(driver, inpPayeeTaxID,PayeeTaxID, "PayeeTaxID");
			        return this;
           }
public CheckDetailsPage enterCellPhone(WebDriver driver,String CellPhone) {
		            BrowserActions.type(driver, inpCellPhone,CellPhone, "CellPhone");
			        return this;
           }
public CheckDetailsPage clickAutoTowingAgency_21(WebDriver driver)  {
					BrowserActions.click(driver, btnAutoTowingAgency_21,"AutoTowingAgency_21");
				    return this;
			}
public CheckDetailsPage clickResubmit(WebDriver driver)  {
					BrowserActions.click(driver, btnResubmit,"Resubmit");
				    return this;
			}
public CheckDetailsPage clickLawFirm_29(WebDriver driver)  {
					BrowserActions.click(driver, btnLawFirm_29,"LawFirm_29");
				    return this;
			}
public CheckDetailsPage enterDescription(WebDriver driver,String Description) {
		            BrowserActions.type(driver, inpDescription,Description, "Description");
			        return this;
           }
public CheckDetailsPage enterMailingAddress(WebDriver driver,String MailingAddress) {
		            BrowserActions.type(driver, inpMailingAddress,MailingAddress, "MailingAddress");
			        return this;
           }
public CheckDetailsPage selectPaymentMethod(WebDriver driver,String PaymentMethod)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPaymentMethod,PaymentMethod,"PaymentMethod");
				    return this;
			}
public CheckDetailsPage clickCheckPayee_PayeeMenuIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnCheckPayee_PayeeMenuIcon,"CheckPayee_PayeeMenuIcon");
				    return this;
			}
public CheckDetailsPage clickNewPerson_18(WebDriver driver)  {
					BrowserActions.click(driver, btnNewPerson_18,"NewPerson_18");
				    return this;
			}
public CheckDetailsPage clickDateofServiceDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnDateofServiceDateIcon,"DateofServiceDateIcon");
				    return this;
			}
public CheckDetailsPage clickMedicalCareOrganization(WebDriver driver)  {
					BrowserActions.click(driver, btnMedicalCareOrganization,"MedicalCareOrganization");
				    return this;
			}
public CheckDetailsPage clickSearch(WebDriver driver)  {
					BrowserActions.click(driver, btnSearch,"Search");
				    return this;
			}
public CheckDetailsPage clickAttorney(WebDriver driver)  {
					BrowserActions.click(driver, btnAttorney,"Attorney");
				    return this;
			}
public CheckDetailsPage enterBankName(WebDriver driver,String BankName) {
		            BrowserActions.type(driver, inpBankName,BankName, "BankName");
			        return this;
           }
public CheckDetailsPage enterRoutingNumber(WebDriver driver,String RoutingNumber) {
		            BrowserActions.type(driver, inpRoutingNumber,RoutingNumber, "RoutingNumber");
			        return this;
           }
public CheckDetailsPage selectCreatedBy(WebDriver driver,String CreatedBy)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpCreatedBy,CreatedBy,"CreatedBy");
				    return this;
			}
public CheckDetailsPage clickIssueDateDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnIssueDateDateIcon,"IssueDateDateIcon");
				    return this;
			}
public CheckDetailsPage clickVendorCompany_24(WebDriver driver)  {
					BrowserActions.click(driver, btnVendorCompany_24,"VendorCompany_24");
				    return this;
			}
public CheckDetailsPage enterExchangeRate(WebDriver driver,String ExchangeRate) {
		            BrowserActions.type(driver, inpExchangeRate,ExchangeRate, "ExchangeRate");
			        return this;
           }
public CheckDetailsPage clickClaimantMenuIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnClaimantMenuIcon,"ClaimantMenuIcon");
				    return this;
			}
public CheckDetailsPage clickAutoTowingAgency(WebDriver driver)  {
					BrowserActions.click(driver, btnAutoTowingAgency,"AutoTowingAgency");
				    return this;
			}
public CheckDetailsPage enterMemo(WebDriver driver,String Memo) {
		            BrowserActions.type(driver, inpMemo,Memo, "Memo");
			        return this;
           }
public CheckDetailsPage clickVoidStop(WebDriver driver)  {
					BrowserActions.click(driver, btnVoidStop,"VoidStop");
				    return this;
			}
public CheckDetailsPage clickAttorney_12(WebDriver driver)  {
					BrowserActions.click(driver, btnAttorney_12,"Attorney_12");
				    return this;
			}
public CheckDetailsPage clickSearch_15(WebDriver driver)  {
					BrowserActions.click(driver, btnSearch_15,"Search_15");
				    return this;
			}
public CheckDetailsPage enterComments(WebDriver driver,String Comments) {
		            BrowserActions.type(driver, inpComments,Comments, "Comments");
			        return this;
           }
public CheckDetailsPage clickLegalVenue_14(WebDriver driver)  {
					BrowserActions.click(driver, btnLegalVenue_14,"LegalVenue_14");
				    return this;
			}
public CheckDetailsPage selectCheckDelivery(WebDriver driver,String CheckDelivery)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpCheckDelivery,CheckDelivery,"CheckDelivery");
				    return this;
			}
public CheckDetailsPage clickEdit(WebDriver driver)  {
					BrowserActions.click(driver, btnEdit,"Edit");
				    return this;
			}
public CheckDetailsPage selectPmtType(WebDriver driver,String PmtType)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPmtType,PmtType,"PmtType");
				    return this;
			}
public CheckDetailsPage enterIssueDate(WebDriver driver,String IssueDate) {
		            BrowserActions.type(driver, inpIssueDate,IssueDate, "IssueDate");
			        return this;
           }
public CheckDetailsPage enterVendorStatus(WebDriver driver,String VendorStatus) {
		            BrowserActions.type(driver, inpVendorStatus,VendorStatus, "VendorStatus");
			        return this;
           }
public CheckDetailsPage clickAttorney_28(WebDriver driver)  {
					BrowserActions.click(driver, btnAttorney_28,"Attorney_28");
				    return this;
			}
public CheckDetailsPage clickLawFirm_13(WebDriver driver)  {
					BrowserActions.click(driver, btnLawFirm_13,"LawFirm_13");
				    return this;
			}
public CheckDetailsPage clickDelete(WebDriver driver)  {
					BrowserActions.click(driver, btnDelete,"Delete");
				    return this;
			}
public CheckDetailsPage enterAccountNumber(WebDriver driver,String AccountNumber) {
		            BrowserActions.type(driver, inpAccountNumber,AccountNumber, "AccountNumber");
			        return this;
           }
public CheckDetailsPage enterEmailAddress(WebDriver driver,String EmailAddress) {
		            BrowserActions.type(driver, inpEmailAddress,EmailAddress, "EmailAddress");
			        return this;
           }
public CheckDetailsPage clickAutoTowingAgency_5(WebDriver driver)  {
					BrowserActions.click(driver, btnAutoTowingAgency_5,"AutoTowingAgency_5");
				    return this;
			}
public CheckDetailsPage selectStatus(WebDriver driver,String Status)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpStatus,Status,"Status");
				    return this;
			}
public CheckDetailsPage clickNewPerson_2(WebDriver driver)  {
					BrowserActions.click(driver, btnNewPerson_2,"NewPerson_2");
				    return this;
			}
public CheckDetailsPage clickAutobodyRepairShop_20(WebDriver driver)  {
					BrowserActions.click(driver, btnAutobodyRepairShop_20,"AutobodyRepairShop_20");
				    return this;
			}
public CheckDetailsPage selectSelectEFTRecord(WebDriver driver,String SelectEFTRecord)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpSelectEFTRecord,SelectEFTRecord,"SelectEFTRecord");
				    return this;
			}
public CheckDetailsPage selectCheckInstructions(WebDriver driver,String CheckInstructions)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpCheckInstructions,CheckInstructions,"CheckInstructions");
				    return this;
			}
public CheckDetailsPage enterExchangeRateDescription(WebDriver driver,String ExchangeRateDescription) {
		            BrowserActions.type(driver, inpExchangeRateDescription,ExchangeRateDescription, "ExchangeRateDescription");
			        return this;
           }
public CheckDetailsPage clickNewCompany(WebDriver driver)  {
					BrowserActions.click(driver, btnNewCompany,"NewCompany");
				    return this;
			}
public CheckDetailsPage clickMedicalCareOrganization_7(WebDriver driver)  {
					BrowserActions.click(driver, btnMedicalCareOrganization_7,"MedicalCareOrganization_7");
				    return this;
			}
public CheckDetailsPage clickClose(WebDriver driver)  {
					BrowserActions.click(driver, btnClose,"Close");
				    return this;
			}
public CheckDetailsPage clickDoctor(WebDriver driver)  {
					BrowserActions.click(driver, btnDoctor,"Doctor");
				    return this;
			}
public CheckDetailsPage selectPayee(WebDriver driver,String Payee)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPayee,Payee,"Payee");
				    return this;
			}
public CheckDetailsPage selectCostType(WebDriver driver,String CostType)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpCostType,CostType,"CostType");
				    return this;
			}
public CheckDetailsPage enterPayToTheOrderOf(WebDriver driver,String PayToTheOrderOf) {
		            BrowserActions.type(driver, inpPayToTheOrderOf,PayToTheOrderOf, "PayToTheOrderOf");
			        return this;
           }
public CheckDetailsPage clickDoctor_6(WebDriver driver)  {
					BrowserActions.click(driver, btnDoctor_6,"Doctor_6");
				    return this;
			}
public CheckDetailsPage enterRecipient(WebDriver driver,String Recipient) {
		            BrowserActions.type(driver, inpRecipient,Recipient, "Recipient");
			        return this;
           }
public CheckDetailsPage clickSearch_31(WebDriver driver)  {
					BrowserActions.click(driver, btnSearch_31,"Search_31");
				    return this;
			}
public CheckDetailsPage clickEditRecurrence(WebDriver driver)  {
					BrowserActions.click(driver, btnEditRecurrence,"EditRecurrence");
				    return this;
			}
public CheckDetailsPage selectCostCategory(WebDriver driver,String CostCategory)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpCostCategory,CostCategory,"CostCategory");
				    return this;
			}
}
