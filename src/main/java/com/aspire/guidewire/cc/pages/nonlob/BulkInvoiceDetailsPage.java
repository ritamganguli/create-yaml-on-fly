package com.aspire.guidewire.cc.pages.nonlob;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.testng.Assert;

import com.aspire.guidewire.cc.pages.common.SearchAddressBookPage;
import com.aspire.guidewire.utils.BrowserActions;
import com.aspire.guidewire.utils.ElementLayer;
import com.aspire.guidewire.utils.Log;
import com.aspire.guidewire.utils.WaitUtils;
import com.aspire.guidewire.webdriverManager.DriverManager;

import ASPIREAI.customfactories.AjaxElementLocatorFactory;
import ASPIREAI.customfactories.IFindBy;
import ASPIREAI.customfactories.PageFactory;

public class BulkInvoiceDetailsPage extends LoadableComponent<BulkInvoiceDetailsPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
 	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
//	public TopNavBar topnavbar;
//	public BulkInvoiceItems bulkinvoiceitemsTable;

	@IFindBy(how = How.CSS, using = "input[name='EditBulkInvoiceDetail-BulkInvoiceDetailScreen-BulkInvoiceDetailDV-SplitEqually']", AI = false)
	private WebElement rdbDistribution;

	@IFindBy(how = How.CSS, using = "#EditBulkInvoiceDetail-BulkInvoiceDetailScreen-RetryButton>div[role='button']", AI = false)
	private WebElement btnRetryProcessing;

	@IFindBy(how = How.CSS, using = "input[name='EditBulkInvoiceDetail-BulkInvoiceDetailScreen-BulkInvoiceDetailDV-RateSet_Date']", AI = false)
	private WebElement inpDateofExchangeRateEntry;

	@IFindBy(how = How.CSS, using = "#EditBulkInvoiceDetail-BulkInvoiceDetailScreen-BulkInvoiceItemsLV_tb-ClaimFilter-ClaimFilterRecentList-7-RecentClaimNumber>div[role='menuitem']", AI = false)
	private WebElement btn00000000892JadeWilliams;

	@IFindBy(how = How.CSS, using = "#EditBulkInvoiceDetail-BulkInvoiceDetailScreen-RefreshButton>div[role='button']", AI = false)
	private WebElement btnRefresh;

	@IFindBy(how = How.CSS, using = "select[name='EditBulkInvoiceDetail-BulkInvoiceDetailScreen-BulkInvoiceDetailDV-PaymentMethodInputSet-MailingAddressInput-CCAddressInputSet-globalAddressContainer-Address_Picker']", AI = false)
	private WebElement drpMailingAddress;

	@IFindBy(how = How.CSS, using = "#EditBulkInvoiceDetail-BulkInvoiceDetailScreen-BulkInvoiceDetailDV-PaymentMethodInputSet-MailingAddressInput-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-PostalCode-AutoFillIcon", AI = false)
	private WebElement btnAutoFillIcon_2;

	@IFindBy(how = How.CSS, using = "input[name='EditBulkInvoiceDetail-BulkInvoiceDetailScreen-BulkInvoiceDetailDV-ScheduledSendDate']", AI = false)
	private WebElement inpSendDate;

	@IFindBy(how = How.CSS, using = "select[name='EditBulkInvoiceDetail-BulkInvoiceDetailScreen-BulkInvoiceDetailDV-PaymentMethodInputSet-MailingAddressInput-CCAddressInputSet-globalAddressContainer-Claim_JurisdictionState']", AI = false)
	private WebElement drpJurisdiction;

	@IFindBy(how = How.CSS, using = "#EditBulkInvoiceDetail-BulkInvoiceDetailScreen-BulkInvoiceItemsLV_tb-ClaimFilter-ClaimFilterRecentList-0-RecentClaimNumber>div[role='menuitem']", AI = false)
	private WebElement btn00000015246OtiliaDickens;

	@IFindBy(how = How.CSS, using = "input[name='EditBulkInvoiceDetail-BulkInvoiceDetailScreen-BulkInvoiceDetailDV-PaymentMethodInputSet-MailingAddressInput-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-County']", AI = false)
	private WebElement inpCounty;

	@IFindBy(how = How.CSS, using = "input[name='EditBulkInvoiceDetail-BulkInvoiceDetailScreen-BulkInvoiceDetailDV-BulkInvoiceInvalidLabel']", AI = false)
	private WebElement inpBulkInvoiceInvalidLabel;

	@IFindBy(how = How.CSS, using = "#EditBulkInvoiceDetail-BulkInvoiceDetailScreen-BulkInvoiceItemsLV_tb-ClaimFilter-ClaimFilterRecentList-2-RecentClaimNumber>div[role='menuitem']", AI = false)
	private WebElement btn00000000122KannanSivakumar;

	@IFindBy(how = How.CSS, using = "input[name='EditBulkInvoiceDetail-BulkInvoiceDetailScreen-BulkInvoiceDetailDV-PaymentMethodInputSet-MailingAddressInput-CCAddressInputSet-globalAddressContainer-Claim_LocationCode']", AI = false)
	private WebElement inpLocationCode;

	@IFindBy(how = How.CSS, using = "input[name='EditBulkInvoiceDetail-BulkInvoiceDetailScreen-BulkInvoiceDetailDV-NoApprovalHistory']", AI = false)
	private WebElement inpNoApprovalHistory;

	@IFindBy(how = How.CSS, using = "#EditBulkInvoiceDetail-BulkInvoiceDetailScreen-BulkInvoiceItemsLV_tb-ClaimFilter-ClearClaimFilter>div[role='menuitem']", AI = false)
	private WebElement btnClearClaimFilter;

	@IFindBy(how = How.CSS, using = "select[name='EditBulkInvoiceDetail-BulkInvoiceDetailScreen-BulkInvoiceDetailDV-Reportability']", AI = false)
	private WebElement drpReportAs;

	@IFindBy(how = How.CSS, using = "input[name='EditBulkInvoiceDetail-BulkInvoiceDetailScreen-BulkInvoiceDetailDV-ApprovalDate']", AI = false)
	private WebElement inpDateApproved;

	@IFindBy(how = How.CSS, using = "input[name='EditBulkInvoiceDetail-BulkInvoiceDetailScreen-BulkInvoiceDetailDV-PaymentMethodInputSet-MailingAddressInput-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressSummary']", AI = false)
	private WebElement inpMailingAddress_1;

	@IFindBy(how = How.CSS, using = "input[name='EditBulkInvoiceDetail-BulkInvoiceDetailScreen-BulkInvoiceDetailDV-ExchangeRateOverride']", AI = false)
	private WebElement rdbExchangeRateMode;

	@IFindBy(how = How.CSS, using = "input[name='EditBulkInvoiceDetail-BulkInvoiceDetailScreen-BulkInvoiceDetailDV-PaymentMethodInputSet-MailingAddressInput-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressLine3']", AI = false)
	private WebElement inpAddress3;

	@IFindBy(how = How.CSS, using = "input[name='EditBulkInvoiceDetail-BulkInvoiceDetailScreen-BulkInvoiceDetailDV-PaymentMethodInputSet-MailingAddressInput-CCAddressInputSet-globalAddressContainer-Address_Description']", AI = false)
	private WebElement inpLocationDescription;

	@IFindBy(how = How.CSS, using = "input[name='EditBulkInvoiceDetail-BulkInvoiceDetailScreen-BulkInvoiceDetailDV-PaymentMethodInputSet-MailingAddressInput-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressLine1']", AI = false)
	private WebElement inpAddress1;

	@IFindBy(how = How.CSS, using = "select[name='EditBulkInvoiceDetail-BulkInvoiceDetailScreen-BulkInvoiceDetailDV-PaymentMethodInputSet-MailingAddressInput-CCAddressInputSet-globalAddressContainer-Address_AddressType']", AI = false)
	private WebElement drpAddressType;

	@IFindBy(how = How.CSS, using = "input[name='EditBulkInvoiceDetail-BulkInvoiceDetailScreen-BulkInvoiceDetailDV-PaymentMethodInputSet-MailingAddressInput-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressLine2']", AI = false)
	private WebElement inpAddress2;

	@IFindBy(how = How.CSS, using = "#EditBulkInvoiceDetail-BulkInvoiceDetailScreen-BulkInvoiceDetailDV-ScheduledSendDate_dateIcon", AI = false)
	private WebElement btnSendDateDateIcon;

	@IFindBy(how = How.CSS, using = "#EditBulkInvoiceDetail-BulkInvoiceDetailScreen-BulkInvoiceDetailDV-ApprovalDate_dateIcon", AI = false)
	private WebElement btnDateApprovedDateIcon;

	@IFindBy(how = How.CSS, using = "select[name='EditBulkInvoiceDetail-BulkInvoiceDetailScreen-BulkInvoiceItemsLV-BulkInvoiceItemsToolbarFilter']", AI = false)
	private WebElement drpBulkInvoiceItemsToolbarFilter;

	@IFindBy(how = How.CSS, using = "input[name='EditBulkInvoiceDetail-BulkInvoiceDetailScreen-BulkInvoiceDetailDV-PaymentMethodInputSet-MailingAddressInput-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-PostalCode']", AI = false)
	private WebElement inpZIPCode;

	@IFindBy(how = How.CSS, using = "#EditBulkInvoiceDetail-BulkInvoiceDetailScreen-BulkInvoiceDetailDV-PaymentMethodInputSet-MailingAddressInput-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-City-AutoFillIcon", AI = false)
	private WebElement btnAutoFillIcon;

	@IFindBy(how = How.CSS, using = "input[name='EditBulkInvoiceDetail-BulkInvoiceDetailScreen-BulkInvoiceDetailDV-ReceivedDate']", AI = false)
	private WebElement inpDateReceived;

	@IFindBy(how = How.CSS, using = "input[name='EditBulkInvoiceDetail-BulkInvoiceDetailScreen-BulkInvoiceDetailDV-PaymentMethodInputSet-MailingAddressInput-CCAddressInputSet-globalAddressContainer-Address_ValidUntil']", AI = false)
	private WebElement inpValiduntil;

	@IFindBy(how = How.CSS, using = "div[id$='Payee-PayeeMenuIcon']", AI = false)
	private WebElement btnPayeeMenuIcon;

	@IFindBy(how = How.CSS, using = "select[name='EditBulkInvoiceDetail-BulkInvoiceDetailScreen-BulkInvoiceDetailDV-DefaultCostCategory']", AI = false)
	private WebElement drpDefaultCostCategory;

	@IFindBy(how = How.CSS, using = "select[name='EditBulkInvoiceDetail-BulkInvoiceDetailScreen-BulkInvoiceDetailDV-PaymentMethodInputSet-MailingAddressInput-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-Country']", AI = false)
	private WebElement drpCountry;

	@IFindBy(how = How.CSS, using = "#EditBulkInvoiceDetail-BulkInvoiceDetailScreen-BulkInvoiceDetailDV-PaymentMethodInputSet-AccountName textarea", AI = false)
	private WebElement inpNameontheAccount;

	@IFindBy(how = How.CSS, using = "select[name='EditBulkInvoiceDetail-BulkInvoiceDetailScreen-BulkInvoiceDetailDV-PaymentMethodInputSet-MailingAddressInput-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-State']", AI = false)
	private WebElement drpState;

	@IFindBy(how = How.CSS, using = "#EditBulkInvoiceDetail-BulkInvoiceDetailScreen-BulkInvoiceItemsLV_tb-ClaimFilter-ClaimFilterRecentList-8-RecentClaimNumber>div[role='menuitem']", AI = false)
	private WebElement btn00000014457JadeWilliams;

	@IFindBy(how = How.CSS, using = "div[id$='BulkInvoiceItemsLV_tb-Add']", AI = false)
	private WebElement btnAdd;

	@IFindBy(how = How.CSS, using = "input[name='EditBulkInvoiceDetail-BulkInvoiceDetailScreen-BulkInvoiceDetailDV-BulkInvoiceNeedsValidationLabel']", AI = false)
	private WebElement inpBulkInvoiceNeedsValidationLabel;

	@IFindBy(how = How.CSS, using = "#EditBulkInvoiceDetail-BulkInvoiceDetailScreen-BulkInvoiceItemsLV_tb-ClaimFilter-ClaimFilterMenuIcon>div[role='button']", AI = false)
	private WebElement btnClaimFilterMenuIcon;

	@IFindBy(how = How.CSS, using = "#EditBulkInvoiceDetail-BulkInvoiceDetailScreen-BulkInvoiceItemsLV_tb-ClaimFilter-ClaimFilterRecentList-3-RecentClaimNumber>div[role='menuitem']", AI = false)
	private WebElement btn00000000895kannansivakumar;

	@IFindBy(how = How.CSS, using = "input[name='EditBulkInvoiceDetail-BulkInvoiceDetailScreen-BulkInvoiceDetailDV-PaymentMethodInputSet-MailingAddress']", AI = false)
	private WebElement inpMailingAddress;

	@IFindBy(how = How.CSS, using = "input[name='EditBulkInvoiceDetail-BulkInvoiceDetailScreen-BulkInvoiceDetailDV-PaymentMethodInputSet-CheckNumber']", AI = false)
	private WebElement inpCheck;

	@IFindBy(how = How.CSS, using = "select[name='EditBulkInvoiceDetail-BulkInvoiceDetailScreen-BulkInvoiceItemsLV-BulkInvoiceItemsToolbarFilter']", AI = false)
	private WebElement drpBulkInvoiceItemsToolbarFilter_4;

	@IFindBy(how = How.CSS, using = "input[name='EditBulkInvoiceDetail-BulkInvoiceDetailScreen-BulkInvoiceDetailDV-PaymentMethodInputSet-MailingAddressInput-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-City']", AI = false)
	private WebElement inpCity;

	@IFindBy(how = How.CSS, using = "input[name='EditBulkInvoiceDetail-BulkInvoiceDetailScreen-BulkInvoiceDetailDV-BulkInvoiceValidLabel']", AI = false)
	private WebElement inpBulkInvoiceValidLabel;

	@IFindBy(how = How.CSS, using = "#EditBulkInvoiceDetail-BulkInvoiceDetailScreen-BulkInvoiceItemsLV_tb-ClaimFilter-ClaimFilterRecentList-6-RecentClaimNumber>div[role='menuitem']", AI = false)
	private WebElement btn00000013807JadeWilliams;

	@IFindBy(how = How.CSS, using = "#EditBulkInvoiceDetail-BulkInvoiceDetailScreen-BulkInvoiceDetailDV-PaymentMethodInputSet-Payee-MenuItem_Search>div[role='menuitem']", AI = false)
	private WebElement btnSearch;

	@IFindBy(how = How.CSS, using = "#EditBulkInvoiceDetail-BulkInvoiceDetailScreen-BulkInvoiceItemsLV_tb-ClaimFilter-ClaimFilterRecentList-1-RecentClaimNumber>div[role='menuitem']", AI = false)
	private WebElement btn00000015243OtiliaDickens;

	@IFindBy(how = How.CSS, using = "input[name='EditBulkInvoiceDetail-BulkInvoiceDetailScreen-BulkInvoiceDetailDV-PaymentMethodInputSet-OldMailingAddress']", AI = false)
	private WebElement inpOldMailToAddress;

	@IFindBy(how = How.CSS, using = "input[name='EditBulkInvoiceDetail-BulkInvoiceDetailScreen-BulkInvoiceDetailDV-PaymentMethodInputSet-BankName']", AI = false)
	private WebElement inpBankName;

	@IFindBy(how = How.CSS, using = "input[name='EditBulkInvoiceDetail-BulkInvoiceDetailScreen-BulkInvoiceDetailDV-PaymentMethodInputSet-BankRoutingNumber']", AI = false)
	private WebElement inpRoutingNumber;

	@IFindBy(how = How.CSS, using = "#EditBulkInvoiceDetail-BulkInvoiceDetailScreen-BulkInvoiceDetailDV-IssueDate_dateIcon", AI = false)
	private WebElement btnIssueDateDateIcon;

	@IFindBy(how = How.CSS, using = "input[name='EditBulkInvoiceDetail-BulkInvoiceDetailScreen-BulkInvoiceDetailDV-ExchangeRate']", AI = false)
	private WebElement inpExchangeRate;

	@IFindBy(how = How.CSS, using = "#EditBulkInvoiceDetail-BulkInvoiceDetailScreen-BulkInvoiceItemsLV_tb-ClaimFilter-ClaimFilterRecentList-5-RecentClaimNumber>div[role='menuitem']", AI = false)
	private WebElement btn00000000443DaleRussel;

	@IFindBy(how = How.CSS, using = "#EditBulkInvoiceDetail-BulkInvoiceDetailScreen-BulkInvoiceItemsLV_tb-ClaimFilter-ClaimFilterRecentList>div[role='menuitem']", AI = false)
	private WebElement btnRecentClaims;

	@IFindBy(how = How.CSS, using = "input[name='EditBulkInvoiceDetail-BulkInvoiceDetailScreen-BulkInvoiceDetailDV-Memo']", AI = false)
	private WebElement inpMemo;

	@IFindBy(how = How.CSS, using = "#EditBulkInvoiceDetail-BulkInvoiceDetailScreen-BulkInvoiceDetailDV-RateSet_Date_dateIcon", AI = false)
	private WebElement btnDateofExchangeRateEntryDateIcon;

	@IFindBy(how = How.CSS, using = "#EditBulkInvoiceDetail-BulkInvoiceDetailScreen-errorDuringProcessingAlertBar .gw-AlertBar--label", AI = false)
	private WebElement lblErrorDuringProcessingAlertBar;

	@IFindBy(how = How.CSS, using = "select[name='EditBulkInvoiceDetail-BulkInvoiceDetailScreen-BulkInvoiceDetailDV-DefaultPaymentType']", AI = false)
	private WebElement drpDefaultPaymentType;

	@IFindBy(how = How.CSS, using = "input[name='EditBulkInvoiceDetail-BulkInvoiceDetailScreen-BulkInvoiceDetailDV-Comments']", AI = false)
	private WebElement inpComments;

	@IFindBy(how = How.CSS, using = "#EditBulkInvoiceDetail-BulkInvoiceDetailScreen-BulkInvoiceItemsLV_tb-ClaimFilter-ClaimFilterRecentList-4-RecentClaimNumber>div[role='menuitem']", AI = false)
	private WebElement btn00000014635JadeWilliams;

	@IFindBy(how = How.CSS, using = "div[id$='BulkInvoiceDetailScreen-ttlBar']", AI = false)
	private WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "#EditBulkInvoiceDetail-BulkInvoiceDetailScreen-Edit>div[role='button']", AI = false)
	private WebElement btnEdit;

	@IFindBy(how = How.CSS, using = "div[id$='BulkInvoiceDetailScreen-Update']", AI = false)
	private WebElement btnUpdate;

	@IFindBy(how = How.CSS, using = "select[name='EditBulkInvoiceDetail-BulkInvoiceDetailScreen-BulkInvoiceDetailDV-DefaultCostType']", AI = false)
	private WebElement drpDefaultCostType;

	@IFindBy(how = How.CSS, using = "input[name='EditBulkInvoiceDetail-BulkInvoiceDetailScreen-BulkInvoiceDetailDV-PaymentMethodInputSet-ToggleAddressEdit']", AI = false)
	private WebElement chkToggleAddressEdit;

	@IFindBy(how = How.CSS, using = "input[name='EditBulkInvoiceDetail-BulkInvoiceDetailScreen-BulkInvoiceDetailDV-IssueDate']", AI = false)
	private WebElement inpIssueDate;

	@IFindBy(how = How.CSS, using = "input[name='EditBulkInvoiceDetail-BulkInvoiceDetailScreen-BulkInvoiceDetailDV-RateSet_Description']", AI = false)
	private WebElement inpRateSetDescription;

	@IFindBy(how = How.CSS, using = "#EditBulkInvoiceDetail-BulkInvoiceDetailScreen-BulkInvoiceItemsLV_tb-ClaimFilter-ClaimFilterRecentList-9-RecentClaimNumber>div[role='menuitem']", AI = false)
	private WebElement btn00000014469JadeWilliams;

	@IFindBy(how = How.CSS, using = "input[name='EditBulkInvoiceDetail-BulkInvoiceDetailScreen-BulkInvoiceDetailDV-ArchivedClaimsWarning']", AI = false)
	private WebElement inpArchivedClaimsWarning;

	@IFindBy(how = How.CSS, using = "#EditBulkInvoiceDetail-BulkInvoiceDetailScreen-BulkInvoiceItemsLV_tb-ClaimFilter-ClaimFilterClaimSearchPicker>div[role='menuitem']", AI = false)
	private WebElement btnSearch_3;

	@IFindBy(how = How.CSS, using = "input[name='EditBulkInvoiceDetail-BulkInvoiceDetailScreen-BulkInvoiceDetailDV-PaymentMethodInputSet-BankAccountNumber']", AI = false)
	private WebElement inpAccountNumber;

	@IFindBy(how = How.CSS, using = "#EditBulkInvoiceDetail-BulkInvoiceDetailScreen-BulkInvoiceItemsLV_tb-Remove>div[role='button']", AI = false)
	private WebElement btnRemove;

	@IFindBy(how = How.CSS, using = "select[name='EditBulkInvoiceDetail-BulkInvoiceDetailScreen-BulkInvoiceDetailDV-Status']", AI = false)
	private WebElement drpStatus;

	@IFindBy(how = How.CSS, using = "input[name$='InvoiceNumber']", AI = false)
	private WebElement inpInvoice;

	@IFindBy(how = How.CSS, using = "textarea[name$='PaymentMethodInputSet-PayTo']", AI = false)
	private WebElement inpPayTotheOrderof;

	@IFindBy(how = How.CSS, using = "input[name='EditBulkInvoiceDetail-BulkInvoiceDetailScreen-BulkInvoiceItemsLV_tb-ClaimFilter']", AI = false)
	private WebElement inpFilterbyClaim;

	@IFindBy(how = How.CSS, using = "select[name='EditBulkInvoiceDetail-BulkInvoiceDetailScreen-BulkInvoiceDetailDV-PaymentMethodInputSet-ContactEFTData']", AI = false)
	private WebElement drpSelectEFTRecord;

	@IFindBy(how = How.CSS, using = "select[name='EditBulkInvoiceDetail-BulkInvoiceDetailScreen-BulkInvoiceDetailDV-CheckInstructions']", AI = false)
	private WebElement drpCheckInstructions;

	@IFindBy(how = How.CSS, using = "#EditBulkInvoiceDetail-BulkInvoiceDetailScreen-errorDuringProcessingAlertBar-CloseBtn", AI = false)
	private WebElement btnClose;

	@IFindBy(how = How.CSS, using = "#EditBulkInvoiceDetail-BulkInvoiceDetailScreen-BulkInvoiceDetailDV-PaymentMethodInputSet-Payee-MenuItem_NoneSelected>div[role='menuitem']", AI = false)
	private WebElement btnNoneselected;

	@IFindBy(how = How.CSS, using = "#EditBulkInvoiceDetail-BulkInvoiceDetailScreen-BulkInvoiceDetailDV-PaymentMethodInputSet-MailingAddressInput-CCAddressInputSet-globalAddressContainer-Address_ValidUntil_dateIcon", AI = false)
	private WebElement btnValiduntilDateIcon;

	@IFindBy(how = How.CSS, using = "#EditBulkInvoiceDetail-BulkInvoiceDetailScreen-Cancel>div[role='button']", AI = false)
	private WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "select[name='EditBulkInvoiceDetail-BulkInvoiceDetailScreen-BulkInvoiceDetailDV-Currency']", AI = false)
	private WebElement drpCurrency;

	@IFindBy(how = How.CSS, using = "select[name='EditBulkInvoiceDetail-BulkInvoiceDetailScreen-BulkInvoiceDetailDV-PaymentMethodInputSet-DeliveryMethod']", AI = false)
	private WebElement drpDeliveryMethod;

	@IFindBy(how = How.CSS, using = "#EditBulkInvoiceDetail-BulkInvoiceDetailScreen-BulkInvoiceDetailDV-ReceivedDate_dateIcon", AI = false)
	private WebElement btnDateReceivedDateIcon;

	@IFindBy(how = How.CSS, using = "input[name$='PaymentMethodInputSet-MailTo']", AI = false)
	private WebElement inpRecipient;

	@IFindBy(how = How.CSS, using = "#EditBulkInvoiceDetail-BulkInvoiceDetailScreen-SubmitButton>div[role='button']", AI = false)
	private WebElement btnSubmit;
	
	@IFindBy(how = How.CSS, using = "div[id$='BulkInvoiceDetailDV-1']", AI = false)
	private WebElement lblInvoice;
	
	@IFindBy(how = How.CSS, using = "div[id$='BulkInvoiceDetailDV-7']", AI = false)
	private WebElement lblCheckDetails;
	
	@IFindBy(how = How.CSS, using = "div[id$='BulkInvoiceDetailDV-3']", AI = false)
	private WebElement lblStatus;
	
	@IFindBy(how = How.CSS, using = "div[id$='BulkInvoiceDetailDV-5']", AI = false)
	private WebElement lblInvoiceItemDetail;
	
	@IFindBy(how = How.CSS, using = "div[id$='BulkInvoiceDetailDV-12']", AI = false)
	private WebElement lblPaymentInstruction;
	
	@IFindBy(how = How.CSS, using = "div[id$='BulkInvoiceDetailDV-19']", AI = false)
	private WebElement lblApprovalHistory;
	
	@IFindBy(how = How.CSS, using = "input[name$='BulkInvoiceItemsLV_ClaimNumber']", AI = false)
	private WebElement inpClaimNumber;
	
	@IFindBy(how = How.CSS, using = "select[name$='BulkInvoiceItemsLV_ReserveLine']", AI = false)
	private WebElement drpReserveLine;
	
	@IFindBy(how = How.CSS, using = "input[name$='Amount']", AI = false)
	private WebElement inpAmount;
	
	@IFindBy(how = How.CSS, using = "input[name$='Amount']", AI = false)
	private WebElement inpBulkAmount;
	
	@IFindBy(how = How.NAME, using = "div[id$='BulkInvoiceItemsLV_AmountHeader_inner']", AI = false)
	private WebElement lblBulkAmountHeader;
	
	@IFindBy(how = How.CSS, using = "div[id$='PayeeMenuIcon']", AI = false)
	private WebElement drpPayeeMenuIcon;
	
	@IFindBy(how = How.CSS, using = "div[id$='MenuItem_Search']", AI = false)
	private WebElement btnPayeeSearch;
	
	@IFindBy(how = How.CSS, using = "div[id$='ReserveLineHeader_inner']", AI = false)
	private WebElement lblReserveLine;

	@IFindBy(how = How.CSS, using = "select[name$='BulkInvoiceItemsLV_Exposure']", AI = false)
	private WebElement drpExposure;

	@IFindBy(how = How.CSS, using = "select[name$='BulkInvoiceItemsLV_PaymentType']", AI = false)
	private WebElement drpPaymentType;
	
	@IFindBy(how = How.CSS, using = "div[id$='Amount_prefix']", AI = false)
	private WebElement lblAmountPrefix;

	@IFindBy(how = How.CSS, using = "input[name$='BulkInvoiceItemsLV_Description']", AI = false)
	private WebElement inpDescription;

	public BulkInvoiceDetailsPage(){
	}

	public BulkInvoiceDetailsPage(WebDriver driver) {
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(finder, this);
		//bulkinvoiceitemsTable = new BulkInvoiceItems();
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
}public BulkInvoiceDetailsPage clickDistribution(WebDriver driver)  {
					BrowserActions.click(driver, rdbDistribution,"Distribution");
				    return this;
			}
public BulkInvoiceDetailsPage clickRetryProcessing(WebDriver driver)  {
					BrowserActions.click(driver, btnRetryProcessing,"RetryProcessing");
				    return this;
			}
public BulkInvoiceDetailsPage enterDateofExchangeRateEntry(WebDriver driver,String DateofExchangeRateEntry) {
		            BrowserActions.type(driver, inpDateofExchangeRateEntry,DateofExchangeRateEntry, "DateofExchangeRateEntry");
			        return this;
           }
public BulkInvoiceDetailsPage click00000000892JadeWilliams(WebDriver driver)  {
					BrowserActions.click(driver, btn00000000892JadeWilliams,"00000000892JadeWilliams");
				    return this;
			}
public BulkInvoiceDetailsPage clickRefresh(WebDriver driver)  {
					BrowserActions.click(driver, btnRefresh,"Refresh");
				    return this;
			}
public BulkInvoiceDetailsPage selectMailingAddress(WebDriver driver,String MailingAddress)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpMailingAddress,MailingAddress,"MailingAddress");
				    return this;
			}
public BulkInvoiceDetailsPage clickAutoFillIcon_2(WebDriver driver)  {
					BrowserActions.click(driver, btnAutoFillIcon_2,"AutoFillIcon_2");
				    return this;
			}
public BulkInvoiceDetailsPage enterSendDate(WebDriver driver,String SendDate) {
		            BrowserActions.type(driver, inpSendDate,SendDate, "SendDate");
			        return this;
           }
public BulkInvoiceDetailsPage selectJurisdiction(WebDriver driver,String Jurisdiction)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpJurisdiction,Jurisdiction,"Jurisdiction");
				    return this;
			}
public BulkInvoiceDetailsPage click00000015246OtiliaDickens(WebDriver driver)  {
					BrowserActions.click(driver, btn00000015246OtiliaDickens,"00000015246OtiliaDickens");
				    return this;
			}
public BulkInvoiceDetailsPage enterCounty(WebDriver driver,String County) {
		            BrowserActions.type(driver, inpCounty,County, "County");
			        return this;
           }
public BulkInvoiceDetailsPage enterBulkInvoiceInvalidLabel(WebDriver driver,String BulkInvoiceInvalidLabel) {
		            BrowserActions.type(driver, inpBulkInvoiceInvalidLabel,BulkInvoiceInvalidLabel, "BulkInvoiceInvalidLabel");
			        return this;
           }
public BulkInvoiceDetailsPage click00000000122KannanSivakumar(WebDriver driver)  {
					BrowserActions.click(driver, btn00000000122KannanSivakumar,"00000000122KannanSivakumar");
				    return this;
			}
public BulkInvoiceDetailsPage enterLocationCode(WebDriver driver,String LocationCode) {
		            BrowserActions.type(driver, inpLocationCode,LocationCode, "LocationCode");
			        return this;
           }
public BulkInvoiceDetailsPage enterNoApprovalHistory(WebDriver driver,String NoApprovalHistory) {
		            BrowserActions.type(driver, inpNoApprovalHistory,NoApprovalHistory, "NoApprovalHistory");
			        return this;
           }
public BulkInvoiceDetailsPage clickClearClaimFilter(WebDriver driver)  {
					BrowserActions.click(driver, btnClearClaimFilter,"ClearClaimFilter");
				    return this;
			}
public BulkInvoiceDetailsPage selectReportAs(WebDriver driver,String ReportAs)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpReportAs,ReportAs,"ReportAs");
				    return this;
			}
public BulkInvoiceDetailsPage enterDateApproved(WebDriver driver,String DateApproved) {
		            BrowserActions.type(driver, inpDateApproved,DateApproved, "DateApproved");
			        return this;
           }
public BulkInvoiceDetailsPage enterMailingAddress_1(WebDriver driver,String MailingAddress_1) {
		            BrowserActions.type(driver, inpMailingAddress_1,MailingAddress_1, "MailingAddress_1");
			        return this;
           }
public BulkInvoiceDetailsPage clickExchangeRateMode(WebDriver driver)  {
					BrowserActions.click(driver, rdbExchangeRateMode,"ExchangeRateMode");
				    return this;
			}
public BulkInvoiceDetailsPage enterAddress3(WebDriver driver,String Address3) {
		            BrowserActions.type(driver, inpAddress3,Address3, "Address3");
			        return this;
           }
public BulkInvoiceDetailsPage enterLocationDescription(WebDriver driver,String LocationDescription) {
		            BrowserActions.type(driver, inpLocationDescription,LocationDescription, "LocationDescription");
			        return this;
           }
public BulkInvoiceDetailsPage enterAddress1(WebDriver driver,String Address1) {
		            BrowserActions.type(driver, inpAddress1,Address1, "Address1");
			        return this;
           }
public BulkInvoiceDetailsPage selectAddressType(WebDriver driver,String AddressType)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpAddressType,AddressType,"AddressType");
				    return this;
			}
public BulkInvoiceDetailsPage enterAddress2(WebDriver driver,String Address2) {
		            BrowserActions.type(driver, inpAddress2,Address2, "Address2");
			        return this;
           }
public BulkInvoiceDetailsPage clickSendDateDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnSendDateDateIcon,"SendDateDateIcon");
				    return this;
			}
public BulkInvoiceDetailsPage clickDateApprovedDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnDateApprovedDateIcon,"DateApprovedDateIcon");
				    return this;
			}
public BulkInvoiceDetailsPage selectBulkInvoiceItemsToolbarFilter(WebDriver driver,String BulkInvoiceItemsToolbarFilter)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpBulkInvoiceItemsToolbarFilter,BulkInvoiceItemsToolbarFilter,"BulkInvoiceItemsToolbarFilter");
				    return this;
			}
public BulkInvoiceDetailsPage enterZIPCode(WebDriver driver,String ZIPCode) {
		            BrowserActions.type(driver, inpZIPCode,ZIPCode, "ZIPCode");
			        return this;
           }
public BulkInvoiceDetailsPage clickAutoFillIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnAutoFillIcon,"AutoFillIcon");
				    return this;
			}
public BulkInvoiceDetailsPage enterDateReceived(WebDriver driver,String DateReceived) {
		            BrowserActions.type(driver, inpDateReceived,DateReceived, "DateReceived");
			        return this;
           }
public BulkInvoiceDetailsPage enterValiduntil(WebDriver driver,String Validuntil) {
		            BrowserActions.type(driver, inpValiduntil,Validuntil, "Validuntil");
			        return this;
           }
public BulkInvoiceDetailsPage clickPayeeMenuIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnPayeeMenuIcon,"PayeeMenuIcon");
				    return this;
			}
public BulkInvoiceDetailsPage selectDefaultCostCategory(WebDriver driver,String DefaultCostCategory)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpDefaultCostCategory,DefaultCostCategory,"DefaultCostCategory");
				    return this;
			}
public BulkInvoiceDetailsPage selectCountry(WebDriver driver,String Country)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpCountry,Country,"Country");
				    return this;
			}
public BulkInvoiceDetailsPage enterNameontheAccount(WebDriver driver,String NameontheAccount) {
		            BrowserActions.type(driver, inpNameontheAccount,NameontheAccount, "NameontheAccount");
			        return this;
           }
public BulkInvoiceDetailsPage selectState(WebDriver driver,String State)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpState,State,"State");
				    return this;
			}
public BulkInvoiceDetailsPage click00000014457JadeWilliams(WebDriver driver)  {
					BrowserActions.click(driver, btn00000014457JadeWilliams,"00000014457JadeWilliams");
				    return this;
			}
public BulkInvoiceDetailsPage clickAdd(WebDriver driver)  {
					BrowserActions.click(driver, btnAdd,"Add");
				    return this;
			}
public BulkInvoiceDetailsPage enterBulkInvoiceNeedsValidationLabel(WebDriver driver,String BulkInvoiceNeedsValidationLabel) {
		            BrowserActions.type(driver, inpBulkInvoiceNeedsValidationLabel,BulkInvoiceNeedsValidationLabel, "BulkInvoiceNeedsValidationLabel");
			        return this;
           }
public BulkInvoiceDetailsPage clickClaimFilterMenuIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnClaimFilterMenuIcon,"ClaimFilterMenuIcon");
				    return this;
			}
public BulkInvoiceDetailsPage click00000000895kannansivakumar(WebDriver driver)  {
					BrowserActions.click(driver, btn00000000895kannansivakumar,"00000000895kannansivakumar");
				    return this;
			}
public BulkInvoiceDetailsPage enterMailingAddress(WebDriver driver,String MailingAddress) {
		            BrowserActions.type(driver, inpMailingAddress,MailingAddress, "MailingAddress");
			        return this;
           }
public BulkInvoiceDetailsPage enterCheck(WebDriver driver,String Check) {
		            BrowserActions.type(driver, inpCheck,Check, "Check");
			        return this;
           }
public BulkInvoiceDetailsPage selectBulkInvoiceItemsToolbarFilter_4(WebDriver driver,String BulkInvoiceItemsToolbarFilter_4)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpBulkInvoiceItemsToolbarFilter_4,BulkInvoiceItemsToolbarFilter_4,"BulkInvoiceItemsToolbarFilter_4");
				    return this;
			}
public BulkInvoiceDetailsPage enterCity(WebDriver driver,String City) {
		            BrowserActions.type(driver, inpCity,City, "City");
			        return this;
           }
public BulkInvoiceDetailsPage enterBulkInvoiceValidLabel(WebDriver driver,String BulkInvoiceValidLabel) {
		            BrowserActions.type(driver, inpBulkInvoiceValidLabel,BulkInvoiceValidLabel, "BulkInvoiceValidLabel");
			        return this;
           }
public BulkInvoiceDetailsPage click00000013807JadeWilliams(WebDriver driver)  {
					BrowserActions.click(driver, btn00000013807JadeWilliams,"00000013807JadeWilliams");
				    return this;
			}
public BulkInvoiceDetailsPage clickSearch(WebDriver driver)  {
					BrowserActions.click(driver, btnSearch,"Search");
				    return this;
			}
public BulkInvoiceDetailsPage click00000015243OtiliaDickens(WebDriver driver)  {
					BrowserActions.click(driver, btn00000015243OtiliaDickens,"00000015243OtiliaDickens");
				    return this;
			}
public BulkInvoiceDetailsPage enterOldMailToAddress(WebDriver driver,String OldMailToAddress) {
		            BrowserActions.type(driver, inpOldMailToAddress,OldMailToAddress, "OldMailToAddress");
			        return this;
           }
public BulkInvoiceDetailsPage enterBankName(WebDriver driver,String BankName) {
		            BrowserActions.type(driver, inpBankName,BankName, "BankName");
			        return this;
           }
public BulkInvoiceDetailsPage enterRoutingNumber(WebDriver driver,String RoutingNumber) {
		            BrowserActions.type(driver, inpRoutingNumber,RoutingNumber, "RoutingNumber");
			        return this;
           }
public BulkInvoiceDetailsPage clickIssueDateDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnIssueDateDateIcon,"IssueDateDateIcon");
				    return this;
			}
public BulkInvoiceDetailsPage enterExchangeRate(WebDriver driver,String ExchangeRate) {
		            BrowserActions.type(driver, inpExchangeRate,ExchangeRate, "ExchangeRate");
			        return this;
           }
public BulkInvoiceDetailsPage click00000000443DaleRussel(WebDriver driver)  {
					BrowserActions.click(driver, btn00000000443DaleRussel,"00000000443DaleRussel");
				    return this;
			}
public BulkInvoiceDetailsPage clickRecentClaims(WebDriver driver)  {
					BrowserActions.click(driver, btnRecentClaims,"RecentClaims");
				    return this;
			}
public BulkInvoiceDetailsPage enterMemo(WebDriver driver,String Memo) {
		            BrowserActions.type(driver, inpMemo,Memo, "Memo");
			        return this;
           }
public BulkInvoiceDetailsPage clickDateofExchangeRateEntryDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnDateofExchangeRateEntryDateIcon,"DateofExchangeRateEntryDateIcon");
				    return this;
			}
public BulkInvoiceDetailsPage selectDefaultPaymentType(WebDriver driver,String DefaultPaymentType)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpDefaultPaymentType,DefaultPaymentType,"DefaultPaymentType");
				    return this;
			}
public BulkInvoiceDetailsPage enterComments(WebDriver driver,String Comments) {
		            BrowserActions.type(driver, inpComments,Comments, "Comments");
			        return this;
           }
public BulkInvoiceDetailsPage click00000014635JadeWilliams(WebDriver driver)  {
					BrowserActions.click(driver, btn00000014635JadeWilliams,"00000014635JadeWilliams");
				    return this;
			}
public BulkInvoiceDetailsPage clickEdit(WebDriver driver)  {
					BrowserActions.click(driver, btnEdit,"Edit");
				    return this;
			}
public BulkInvoiceDetailsPage clickUpdate(WebDriver driver)  {
					BrowserActions.click(driver, btnUpdate,"Update");
				    return this;
			}
public BulkInvoiceDetailsPage selectDefaultCostType(WebDriver driver,String DefaultCostType)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpDefaultCostType,DefaultCostType,"DefaultCostType");
				    return this;
			}
public BulkInvoiceDetailsPage clickToggleAddressEdit(WebDriver driver)  {
					BrowserActions.click(driver, chkToggleAddressEdit,"ToggleAddressEdit");
				    return this;
			}
public BulkInvoiceDetailsPage enterIssueDate(WebDriver driver,String IssueDate) {
		            BrowserActions.type(driver, inpIssueDate,IssueDate, "IssueDate");
			        return this;
           }
public BulkInvoiceDetailsPage enterRateSetDescription(WebDriver driver,String RateSetDescription) {
		            BrowserActions.type(driver, inpRateSetDescription,RateSetDescription, "RateSetDescription");
			        return this;
           }
public BulkInvoiceDetailsPage click00000014469JadeWilliams(WebDriver driver)  {
					BrowserActions.click(driver, btn00000014469JadeWilliams,"00000014469JadeWilliams");
				    return this;
			}
public BulkInvoiceDetailsPage enterArchivedClaimsWarning(WebDriver driver,String ArchivedClaimsWarning) {
		            BrowserActions.type(driver, inpArchivedClaimsWarning,ArchivedClaimsWarning, "ArchivedClaimsWarning");
			        return this;
           }
public BulkInvoiceDetailsPage clickSearch_3(WebDriver driver)  {
					BrowserActions.click(driver, btnSearch_3,"Search_3");
				    return this;
			}
public BulkInvoiceDetailsPage enterAccountNumber(WebDriver driver,String AccountNumber) {
		            BrowserActions.type(driver, inpAccountNumber,AccountNumber, "AccountNumber");
			        return this;
           }
public BulkInvoiceDetailsPage clickRemove(WebDriver driver)  {
					BrowserActions.click(driver, btnRemove,"Remove");
				    return this;
			}
public BulkInvoiceDetailsPage selectStatus(WebDriver driver,String Status)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpStatus,Status,"Status");
				    return this;
			}
public BulkInvoiceDetailsPage enterInvoice(WebDriver driver,String Invoice) {
		            BrowserActions.type(driver, inpInvoice,Invoice, "Invoice");
			        return this;
           }
public BulkInvoiceDetailsPage enterPayTotheOrderof(WebDriver driver,String PayTotheOrderof) {
		            BrowserActions.type(driver, inpPayTotheOrderof,PayTotheOrderof, "PayTotheOrderof");
			        return this;
           }
public BulkInvoiceDetailsPage enterFilterbyClaim(WebDriver driver,String FilterbyClaim) {
		            BrowserActions.type(driver, inpFilterbyClaim,FilterbyClaim, "FilterbyClaim");
			        return this;
           }
public BulkInvoiceDetailsPage selectSelectEFTRecord(WebDriver driver,String SelectEFTRecord)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpSelectEFTRecord,SelectEFTRecord,"SelectEFTRecord");
				    return this;
			}
public BulkInvoiceDetailsPage selectCheckInstructions(WebDriver driver,String CheckInstructions)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpCheckInstructions,CheckInstructions,"CheckInstructions");
				    return this;
			}
public BulkInvoiceDetailsPage clickClose(WebDriver driver)  {
					BrowserActions.click(driver, btnClose,"Close");
				    return this;
			}
public BulkInvoiceDetailsPage clickNoneselected(WebDriver driver)  {
					BrowserActions.click(driver, btnNoneselected,"Noneselected");
				    return this;
			}
public BulkInvoiceDetailsPage clickValiduntilDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnValiduntilDateIcon,"ValiduntilDateIcon");
				    return this;
			}
public BulkInvoiceDetailsPage clickCancel(WebDriver driver)  {
					BrowserActions.click(driver, btnCancel,"Cancel");
				    return this;
			}
public BulkInvoiceDetailsPage selectCurrency(WebDriver driver,String Currency)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpCurrency,Currency,"Currency");
				    return this;
			}
public BulkInvoiceDetailsPage selectDeliveryMethod(WebDriver driver,String DeliveryMethod)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpDeliveryMethod,DeliveryMethod,"DeliveryMethod");
				    return this;
			}
public BulkInvoiceDetailsPage clickDateReceivedDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnDateReceivedDateIcon,"DateReceivedDateIcon");
				    return this;
			}
public BulkInvoiceDetailsPage enterRecipient(WebDriver driver,String Recipient) {
		            BrowserActions.type(driver, inpRecipient,Recipient, "Recipient");
			        return this;
           }
public BulkInvoiceDetailsPage clickSubmit(WebDriver driver)  {
					BrowserActions.click(driver, btnSubmit,"Submit");
				    return this;
			}

public BulkInvoiceDetailsPage verifyInvoice(WebDriver driver){
	BrowserActions.verifyElementDisplayed(driver,lblInvoice, "Invoice");
	return this;
}
public BulkInvoiceDetailsPage verifyCheckDetails(WebDriver driver){
	BrowserActions.verifyElementDisplayed(driver,lblCheckDetails, "check details");
	return this;
}
public BulkInvoiceDetailsPage verifyStatus(WebDriver driver){
	BrowserActions.verifyElementDisplayed(driver,lblStatus, "Status");
	return this;
}
public BulkInvoiceDetailsPage verifyInvoiceItemDetail(WebDriver driver){
	BrowserActions.verifyElementDisplayed(driver,lblInvoiceItemDetail, "Invoice Item Detail");
	return this;
}
public BulkInvoiceDetailsPage verifyPaymentInstruction(WebDriver driver){
	BrowserActions.verifyElementDisplayed(driver,lblPaymentInstruction, "Payment Instruction");
	return this;
}
public BulkInvoiceDetailsPage verifyApprovalHistory(WebDriver driver){
	BrowserActions.verifyElementDisplayed(driver,lblApprovalHistory, "Approval History");
	Log.messageStep("Details of Invoices Were displayed Successfullly",DriverManager.getDriver());
	return this;
}
public BulkInvoiceDetailsPage enterClaimNumber(WebDriver driver,String claimNo) {
    BrowserActions.type(driver, inpClaimNumber,claimNo, "Check");
    return this;
}
public BulkInvoiceDetailsPage selectReserveLine(WebDriver driver) {
    BrowserActions.selectDropDownByIndex(driver, drpReserveLine,1,true,2,"Reserve Line");
    return this;
}
public BulkInvoiceDetailsPage enterAmount(WebDriver driver,String amount){
    BrowserActions.type(driver, inpBulkAmount,amount,4,"Amount");
    return this;
}
public BulkInvoiceDetailsPage clickAmountHeader(WebDriver driver) {
    BrowserActions.click(driver, lblBulkAmountHeader,"Bulk Amount");
    return this;
}
public SearchAddressBookPage clickPayeeSearch(WebDriver driver) throws Exception {
    BrowserActions.click(driver, btnPayeeSearch,"Payee search");
    return new SearchAddressBookPage(driver).get();
}

public BulkInvoiceDetailsPage clickReserveLineHeader(WebDriver driver) throws Exception {
    BrowserActions.click(driver, lblReserveLine,"Reserve Line Header");
    return this;
}

public BulkInvoiceDetailsPage selectExposure(WebDriver driver) {
    BrowserActions.selectDropDownByIndex(driver, drpExposure,1,1,"Exposure");
    return this;
}

public BulkInvoiceDetailsPage selectPaymentType(WebDriver driver) {
    BrowserActions.selectDropDownByIndex(driver, drpPaymentType,1,1,"Payment Type");
    return this;
}

public BulkInvoiceDetailsPage clickAmountPrefix(WebDriver driver) {
    BrowserActions.click(driver, lblAmountPrefix,"Amout Prefix");
    return this;
}
public BulkInvoiceDetailsPage enterDescription(WebDriver driver,String description) {
    BrowserActions.type(driver, inpDescription,description,"Description");
    return this;
}


}
