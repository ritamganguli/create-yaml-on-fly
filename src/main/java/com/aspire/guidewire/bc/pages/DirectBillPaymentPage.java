package com.aspire.guidewire.bc.pages;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.aspire.guidewire.utils.BrowserActions;
import com.aspire.guidewire.utils.ElementLayer;
import com.aspire.guidewire.utils.Log;
import com.aspire.guidewire.utils.WaitUtils;

import ASPIREAI.customfactories.AjaxElementLocatorFactory;
import ASPIREAI.customfactories.IFindBy;
import ASPIREAI.customfactories.PageFactory;

public class DirectBillPaymentPage extends LoadableComponent<DirectBillPaymentPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
 	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
//	public TopNavBar topnavbar;
//	public EditDBPaymentScreen editdbpaymentscreenTable;

	@IFindBy(how = How.CSS, using = "select[name='NewDirectBillPayment-EditDBPaymentScreen-PaymentDetailsDV-PaymentInstrument']", AI = false)
	private WebElement drpPaymentInstrument;

	@IFindBy(how = How.CSS, using = "input[name='NewDirectBillPayment-EditDBPaymentScreen-DistributionAmountsLV-invoiceDueDateHeader']", AI = false)
	private WebElement inpInvoiceDueDateHeader;

	@IFindBy(how = How.CSS, using = "#NewDirectBillPayment-EditDBPaymentScreen-Update>div[role='button']", AI = false)
	private WebElement btnExecute;

	@IFindBy(how = How.CSS, using = "input[name='NewDirectBillPayment-EditDBPaymentScreen-PaymentDetailsDV-AccountName']", AI = false)
	private WebElement inpSelectedAccountName;

	@IFindBy(how = How.CSS, using = "select[name='NewDirectBillPayment-EditDBPaymentScreen-DistributionAmountsLV_tb-TAccountOwnerSortBy']", AI = false)
	private WebElement drpSortBy_2;

	@IFindBy(how = How.CSS, using = "#NewDirectBillPayment-EditDBPaymentScreen-SuspenseItemsLV_tb-Remove>div[role='button']", AI = false)
	private WebElement btnRelease;

	@IFindBy(how = How.CSS, using = "#NewDirectBillPayment-EditDBPaymentScreen-CollateralItemCardTab", AI = false)
	private WebElement btnCollateralItem;

	@IFindBy(how = How.CSS, using = "input[name='NewDirectBillPayment-EditDBPaymentScreen-PaymentDetailsDV-PaymentDate']", AI = false)
	private WebElement inpReceivedDate;

	@IFindBy(how = How.CSS, using = "input[name='NewDirectBillPayment-EditDBPaymentScreen-PaymentDetailsDV-Description']", AI = false)
	private WebElement inpDescription_1;

	@IFindBy(how = How.CSS, using = "input[name='NewDirectBillPayment-EditDBPaymentScreen-DistributionAmountsLV-ownerHeader']", AI = false)
	private WebElement inpOwnerHeader;

	@IFindBy(how = How.CSS, using = "input[name='NewDirectBillPayment-EditDBPaymentScreen-PaymentDetailsDV-OriginatingUnappliedFunds']", AI = false)
	private WebElement inpOriginatingUnappliedFund;

	@IFindBy(how = How.CSS, using = "#NewDirectBillPayment-EditDBPaymentScreen-AddItems>div[role='button']", AI = false)
	private WebElement btnAddItems;

	@IFindBy(how = How.CSS, using = "input[name='NewDirectBillPayment-EditDBPaymentScreen-PaymentDetailsDV-OriginatingAccountName']", AI = false)
	private WebElement inpOriginatingAccount;

	@IFindBy(how = How.CSS, using = "input[name='NewDirectBillPayment-EditDBPaymentScreen-DistributionAmountsLV-typeHeader']", AI = false)
	private WebElement inpTypeHeader;

	@IFindBy(how = How.CSS, using = "#NewDirectBillPayment-EditDBPaymentScreen-OverrideModeButton>div[role='button']", AI = false)
	private WebElement btnOverrideDistribution;

	@IFindBy(how = How.CSS, using = "input[name='NewDirectBillPayment-EditDBPaymentScreen-PaymentDetailsDV-SuspenseAmount']", AI = false)
	private WebElement inpInSuspense;

	@IFindBy(how = How.CSS, using = "input[name='NewDirectBillPayment-EditDBPaymentScreen-PaymentDetailsDV-DistributedAmount']", AI = false)
	private WebElement inpDistributed;

	@IFindBy(how = How.CSS, using = "#NewDirectBillPayment-EditDBPaymentScreen-DistributionAmountsLV_tb-ClearButton>div[role='button']", AI = false)
	private WebElement btnClear;

	@IFindBy(how = How.CSS, using = "#NewDirectBillPayment-EditDBPaymentScreen-PaymentDetailsDV-PaymentDate_dateIcon", AI = false)
	private WebElement btnReceivedDateDateIcon;

	@IFindBy(how = How.CSS, using = "select[name='NewDirectBillPayment-EditDBPaymentScreen-DistributionAmountsLV_tb-GroupBy']", AI = false)
	private WebElement drpGroupBy;

	@IFindBy(how = How.CSS, using = "input[name='NewDirectBillPayment-EditDBPaymentScreen-DistributionAmountsLV-invoiceDateHeader']", AI = false)
	private WebElement inpInvoiceDateHeader;

	@IFindBy(how = How.CSS, using = "#NewDirectBillPayment-EditDBPaymentScreen-distributionCardTab", AI = false)
	private WebElement btnDistribution;

	@IFindBy(how = How.CSS, using = "input[name='NewDirectBillPayment-EditDBPaymentScreen-DistributionAmountsLV_tb-GoTo']", AI = false)
	private WebElement inpGoTo;

	@IFindBy(how = How.CSS, using = "div[id='NewDirectBillPayment-EditDBPaymentScreen-PaymentDetailsDV-PaymentInstrument'] div[id$='CreateNewPaymentInstrument']", AI = false)
	private WebElement btnNew;//div[id='NewDirectBillPayment-EditDBPaymentScreen-PaymentDetailsDV-PaymentInstrument-CreateNewPaymentInstrument']

	@IFindBy(how = How.CSS, using = "input[name='NewDirectBillPayment-EditDBPaymentScreen-DistributionAmountsLV-unpaidAmountHeader']", AI = false)
	private WebElement inpUnpaidAmountHeader;

	@IFindBy(how = How.CSS, using = "input[name='NewDirectBillPayment-EditDBPaymentScreen-DistributionAmountsLV-amountHeader']", AI = false)
	private WebElement inpAmountHeader;

	@IFindBy(how = How.CSS, using = "#NewDirectBillPayment-EditDBPaymentScreen-SuspenseItemsLV_tb-Add>div[role='button']", AI = false)
	private WebElement btnAdd;

	@IFindBy(how = How.CSS, using = "select[name='NewDirectBillPayment-EditDBPaymentScreen-DistributionAmountsLV_tb-InvoiceSortBy']", AI = false)
	private WebElement drpSortBy;

	@IFindBy(how = How.CSS, using = "select[name='NewDirectBillPayment-EditDBPaymentScreen-DistributionAmountsLV_tb-Aggregate']", AI = false)
	private WebElement drpAggregate;

	@IFindBy(how = How.CSS, using = "input[name='NewDirectBillPayment-EditDBPaymentScreen-PaymentDetailsDV-Amount']", AI = false)
	private WebElement inpAmount;//input[name$='Amount']

	@IFindBy(how = How.CSS, using = "input[name='NewDirectBillPayment-EditDBPaymentScreen-DistributionAmountsLV-overrideAmountHeader']", AI = false)
	private WebElement inpOverrideAmountHeader;

	@IFindBy(how = How.CSS, using = "input[name$='Description']", AI = false)
	private WebElement inpDescription;

	@IFindBy(how = How.CSS, using = "select[name='NewDirectBillPayment-EditDBPaymentScreen-PaymentDetailsDV-UnappliedFunds']", AI = false)
	private WebElement drpUnappliedFund;

	@IFindBy(how = How.CSS, using = "input[name='NewDirectBillPayment-EditDBPaymentScreen-DistributionAmountsLV-invoiceNumberHeader']", AI = false)
	private WebElement inpInvoiceNumberHeader;

	@IFindBy(how = How.CSS, using = "#NewDirectBillPayment-EditDBPaymentScreen-FrozenInvoiceItemAlert .gw-AlertBar--label", AI = false)
	private WebElement lblFrozenInvoiceItemAlert;

	@IFindBy(how = How.CSS, using = "#NewDirectBillPayment-__crumb__", AI = false)
	private WebElement btnReturntoAccountSummary;

	@IFindBy(how = How.CSS, using = "input[name='NewDirectBillPayment-EditDBPaymentScreen-DistributionAmountsLV-invoiceItemPolicyNumberHeader']", AI = false)
	private WebElement inpInvoiceItemPolicyNumberHeader;

	@IFindBy(how = How.CSS, using = "#NewDirectBillPayment-EditDBPaymentScreen-SuspenseItemCardTab", AI = false)
	private WebElement btnSuspenseItems;

	@IFindBy(how = How.CSS, using = "#NewDirectBillPayment-EditDBPaymentScreen-PaymentDetailsDV-AccountNumber-AccountPicker", AI = false)
	private WebElement btnAccountPicker;

	@IFindBy(how = How.CSS, using = "input[name='NewDirectBillPayment-EditDBPaymentScreen-PaymentDetailsDV-CollateralAmount']", AI = false)
	private WebElement inpCollateral;

	@IFindBy(how = How.CSS, using = "input[name='NewDirectBillPayment-EditDBPaymentScreen-DistributionAmountsLV-payerHeader']", AI = false)
	private WebElement inpPayerHeader;

	@IFindBy(how = How.CSS, using = "#NewDirectBillPayment-EditDBPaymentScreen-ttlBar", AI = false)
	private WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "#NewDirectBillPayment-EditDBPaymentScreen-Edit>div[role='button']", AI = false)
	private WebElement btnEdit;

	@IFindBy(how = How.CSS, using = "input[name='NewDirectBillPayment-EditDBPaymentScreen-PaymentDetailsDV-RemainingAmount']", AI = false)
	private WebElement inpRemaining;

	@IFindBy(how = How.CSS, using = "input[name='NewDirectBillPayment-EditDBPaymentScreen-DistributionAmountsLV-amountToApplyHeader']", AI = false)
	private WebElement inpAmountToApplyHeader;

	@IFindBy(how = How.CSS, using = "#NewDirectBillPayment-EditDBPaymentScreen-CollateralItemLV_tb-Remove>div[role='button']", AI = false)
	private WebElement btnRemove;

	@IFindBy(how = How.CSS, using = "select[name='NewDirectBillPayment-EditDBPaymentScreen-selectItemsIs']", AI = false)
	private WebElement drpIs;

	@IFindBy(how = How.CSS, using = "#NewDirectBillPayment-EditDBPaymentScreen-FrozenInvoiceItemAlert-CloseBtn", AI = false)
	private WebElement btnClose;

	@IFindBy(how = How.CSS, using = "#NewDirectBillPayment-EditDBPaymentScreen-ExecuteWithoutDistribution>div[role='button']", AI = false)
	private WebElement btnExecuteWithoutDistribution;

	@IFindBy(how = How.CSS, using = "#NewDirectBillPayment-EditDBPaymentScreen-CollateralItemLV_tb-Add>div[role='button']", AI = false)
	private WebElement btnAdd_3;

	@IFindBy(how = How.CSS, using = "input[name='NewDirectBillPayment-EditDBPaymentScreen-PaymentDetailsDV-AmountAvailableToDistribute']", AI = false)
	private WebElement inpAvailable;

	@IFindBy(how = How.CSS, using = "select[name='NewDirectBillPayment-EditDBPaymentScreen-selectItemsWhere']", AI = false)
	private WebElement drpSelectItemswherethe;

	@IFindBy(how = How.CSS, using = "#NewDirectBillPayment-EditDBPaymentScreen-Cancel>div[role='button']", AI = false)
	private WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "input[name='NewDirectBillPayment-EditDBPaymentScreen-PaymentDetailsDV-UseUnappliedFunds']", AI = false)
	private WebElement chkUseUnappliedFundAmount000;

	@IFindBy(how = How.CSS, using = "select[name='NewDirectBillPayment-EditDBPaymentScreen-includeOnly']", AI = false)
	private WebElement drpIncludeOnly;

	@IFindBy(how = How.CSS, using = "input[name='NewDirectBillPayment-EditDBPaymentScreen-PaymentDetailsDV-AccountNumber']", AI = false)
	private WebElement inpSelectedAccount;

	@IFindBy(how = How.CSS, using = "#NewDirectBillPayment-EditDBPaymentScreen-DistributionAmountsLV_tb-GoButton>div[role='button']", AI = false)
	private WebElement btnGo;
	
	@IFindBy(how = How.CSS, using = "div[id$='PaymentDetailsDV-AccountNumber']", AI = false)
	public WebElement lblAccountNumber;
	
	@IFindBy(how = How.CSS, using = "div[id$='PaymentDate_Input']", AI = false)
	public WebElement lblReceivedDate;
	
	@IFindBy(how = How.CSS, using = "div[id$='-UnappliedFunds_Input']", AI = false)
	public WebElement lblUnappliedFunds;
	
	@IFindBy(how = How.CSS, using = "div[id$='Amount_Input']", AI = false)
	public WebElement lblAmount;
	
	@IFindBy(how = How.CSS, using = "div[id$='PaymentDetailsDV-7']", AI = false)
	public WebElement lblThisPayment;
	
	@IFindBy(how = How.CSS, using = "div[id$='PaymentDetailsDV-4']", AI = false)
	public WebElement lblPaymentDetails;
	
	@IFindBy(how = How.CSS, using = "div[id$='PaymentInstrument_Input']", AI = false)
	public WebElement lblPaymentInstrument;
	
	@IFindBy(how = How.CSS, using = "div[id$='-EditDBPaymentScreen-2']", AI = false)
	public WebElement lblPreviewDistribution;
	
	@IFindBy(how = How.CSS, using = "div[id$='GroupBy_Input']", AI = false)
	public WebElement lblGroupBy;
	
	@IFindBy(how = How.CSS, using = "div[id$='Aggregate_Input']", AI = false)
	public WebElement lblAggregate;
	
	@IFindBy(how = How.CSS, using = "div[id$='SortBy_Input']", AI = false)
	public WebElement lblSortBy;
	
	@IFindBy(how = How.CSS, using = "div[id$='GoTo_Input']", AI = false)
	public WebElement lblGoTo;
	
	@IFindBy(how = How.CSS, using = "div[id$='typeHeader']", AI = false)
	public WebElement lblItem;
	
	@IFindBy(how = How.CSS, using = "div[id$='PolicyNumberHeader']", AI = false)
	public WebElement lblPolicyPeriod;
	
	@IFindBy(how = How.CSS, using = "div[id$='InvoiceNumberHeader']", AI = false)
	public WebElement lblInvoice;
	
	@IFindBy(how = How.CSS, using = "div[id$='invoiceDateHeader']", AI = false)
	public WebElement lblInvoiceBillDate;
	
	@IFindBy(how = How.CSS, using = "div[id$='invoiceDueDateHeader']", AI = false)
	public WebElement lblInvoiceDueDate;
	
	@IFindBy(how = How.CSS, using = "div[id$='ownerHeader']", AI = false)
	public WebElement lblOwner;
	
	@IFindBy(how = How.CSS, using = "div[id$='payerHeader']", AI = false)
	public WebElement lblPayer;
	
	@IFindBy(how = How.CSS, using = "div[id$='amountHeader']", AI = false)
	public WebElement lblAmountInDistribution;
	
	@IFindBy(how = How.CSS, using = "div[id$='unpaidAmountHeader']", AI = false)
	public WebElement lblUnpaidAmount;
	
	@IFindBy(how = How.CSS, using = "div[id$='amountToApplyHeader']", AI = false)
	public WebElement lblAmountToApply;
	
	public DirectBillPaymentPage(){
	}

	public DirectBillPaymentPage(WebDriver driver){
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(finder, this);
//		editdbpaymentscreenTable = new EditDBPaymentScreen();
}
@Override
	protected void load() {
		isPageLoaded = true;
		WaitUtils.waitForPageLoad(driver);
	}@Override
	protected void isLoaded() {
		if (!isPageLoaded) {
			Assert.fail();
		}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, btnGo))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);
		
}public DirectBillPaymentPage selectPaymentInstrument(WebDriver driver,String PaymentInstrument)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPaymentInstrument,PaymentInstrument,true,"PaymentInstrument");
				    return this;
			}
public DirectBillPaymentPage enterInvoiceDueDateHeader(WebDriver driver,String InvoiceDueDateHeader) {
		            BrowserActions.type(driver, inpInvoiceDueDateHeader,InvoiceDueDateHeader, "InvoiceDueDateHeader");
			        return this;
           }
public DirectBillPaymentPage clickExecute(WebDriver driver)  {
					BrowserActions.click(driver, btnExecute,"Execute");
				    return this;
			}
public DirectBillPaymentPage enterSelectedAccountName(WebDriver driver,String SelectedAccountName) {
		            BrowserActions.type(driver, inpSelectedAccountName,SelectedAccountName, "SelectedAccountName");
			        return this;
           }
public DirectBillPaymentPage selectSortBy_2(WebDriver driver,String SortBy_2)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpSortBy_2,SortBy_2,"SortBy_2");
				    return this;
			}
public DirectBillPaymentPage clickRelease(WebDriver driver)  {
					BrowserActions.click(driver, btnRelease,"Release");
				    return this;
			}
public DirectBillPaymentPage clickCollateralItem(WebDriver driver)  {
					BrowserActions.click(driver, btnCollateralItem,"CollateralItem");
				    return this;
			}
public DirectBillPaymentPage enterReceivedDate(WebDriver driver,String ReceivedDate) {
		            BrowserActions.type(driver, inpReceivedDate,ReceivedDate, "ReceivedDate");
			        return this;
           }
public DirectBillPaymentPage enterDescription_1(WebDriver driver,String Description_1) {
		            BrowserActions.type(driver, inpDescription_1,Description_1, "Description_1");
			        return this;
           }
public DirectBillPaymentPage enterOwnerHeader(WebDriver driver,String OwnerHeader) {
		            BrowserActions.type(driver, inpOwnerHeader,OwnerHeader, "OwnerHeader");
			        return this;
           }
public DirectBillPaymentPage enterOriginatingUnappliedFund(WebDriver driver,String OriginatingUnappliedFund) {
		            BrowserActions.type(driver, inpOriginatingUnappliedFund,OriginatingUnappliedFund, "OriginatingUnappliedFund");
			        return this;
           }
public DirectBillPaymentPage clickAddItems(WebDriver driver)  {
					BrowserActions.click(driver, btnAddItems,"AddItems");
				    return this;
			}
public DirectBillPaymentPage enterOriginatingAccount(WebDriver driver,String OriginatingAccount) {
		            BrowserActions.type(driver, inpOriginatingAccount,OriginatingAccount, "OriginatingAccount");
			        return this;
           }
public DirectBillPaymentPage enterTypeHeader(WebDriver driver,String TypeHeader) {
		            BrowserActions.type(driver, inpTypeHeader,TypeHeader, "TypeHeader");
			        return this;
           }
public DirectBillPaymentPage clickOverrideDistribution(WebDriver driver)  {
					BrowserActions.click(driver, btnOverrideDistribution,"OverrideDistribution");
				    return this;
			}
public DirectBillPaymentPage enterInSuspense(WebDriver driver,String InSuspense) {
		            BrowserActions.type(driver, inpInSuspense,InSuspense, "InSuspense");
			        return this;
           }
public DirectBillPaymentPage enterDistributed(WebDriver driver,String Distributed) {
		            BrowserActions.type(driver, inpDistributed,Distributed, "Distributed");
			        return this;
           }
public DirectBillPaymentPage clickClear(WebDriver driver)  {
					BrowserActions.click(driver, btnClear,"Clear");
				    return this;
			}
public DirectBillPaymentPage clickReceivedDateDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnReceivedDateDateIcon,"ReceivedDateDateIcon");
				    return this;
			}
public DirectBillPaymentPage selectGroupBy(WebDriver driver,String GroupBy)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpGroupBy,GroupBy,"GroupBy");
				    return this;
			}
public DirectBillPaymentPage enterInvoiceDateHeader(WebDriver driver,String InvoiceDateHeader) {
		            BrowserActions.type(driver, inpInvoiceDateHeader,InvoiceDateHeader, "InvoiceDateHeader");
			        return this;
           }
public DirectBillPaymentPage clickDistribution(WebDriver driver)  {
					BrowserActions.click(driver, btnDistribution,"Distribution");
				    return this;
			}
public DirectBillPaymentPage enterGoTo(WebDriver driver,String GoTo) {
		            BrowserActions.type(driver, inpGoTo,GoTo, "GoTo");
			        return this;
           }
public DirectBillPaymentPage clickNew(WebDriver driver)  {
					BrowserActions.click(driver, btnNew,"New");
				    return this;
			}
public DirectBillPaymentPage enterUnpaidAmountHeader(WebDriver driver,String UnpaidAmountHeader) {
		            BrowserActions.type(driver, inpUnpaidAmountHeader,UnpaidAmountHeader, "UnpaidAmountHeader");
			        return this;
           }
public DirectBillPaymentPage enterAmountHeader(WebDriver driver,String AmountHeader) {
		            BrowserActions.type(driver, inpAmountHeader,AmountHeader, "AmountHeader");
			        return this;
           }
public DirectBillPaymentPage clickAdd(WebDriver driver)  {
					BrowserActions.click(driver, btnAdd,"Add");
				    return this;
			}
public DirectBillPaymentPage selectSortBy(WebDriver driver,String SortBy)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpSortBy,SortBy,"SortBy");
				    return this;
			}
public DirectBillPaymentPage selectAggregate(WebDriver driver,String Aggregate)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpAggregate,Aggregate,"Aggregate");
				    return this;
			}
public DirectBillPaymentPage enterAmount(WebDriver driver,String Amount) {
		            BrowserActions.type(driver, inpAmount,Amount,2,"Amount");
			        return this;
           }
public DirectBillPaymentPage enterOverrideAmountHeader(WebDriver driver,String OverrideAmountHeader) {
		            BrowserActions.type(driver, inpOverrideAmountHeader,OverrideAmountHeader, "OverrideAmountHeader");
			        return this;
           }
public DirectBillPaymentPage enterDescription(WebDriver driver,String Description) {
		            BrowserActions.type(driver, inpDescription,Description, "Description");
			        return this;
           }
public DirectBillPaymentPage selectUnappliedFund(WebDriver driver,String UnappliedFund)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpUnappliedFund,UnappliedFund,true,"UnappliedFund");
				    return this;
			}
public DirectBillPaymentPage enterInvoiceNumberHeader(WebDriver driver,String InvoiceNumberHeader) {
		            BrowserActions.type(driver, inpInvoiceNumberHeader,InvoiceNumberHeader, "InvoiceNumberHeader");
			        return this;
           }
public DirectBillPaymentPage clickReturntoAccountSummary(WebDriver driver)  {
					BrowserActions.click(driver, btnReturntoAccountSummary,"ReturntoAccountSummary");
					BrowserActions.confirmAlert(driver, "Return to account summary page");
				    return this;
			}
public DirectBillPaymentPage enterInvoiceItemPolicyNumberHeader(WebDriver driver,String InvoiceItemPolicyNumberHeader) {
		            BrowserActions.type(driver, inpInvoiceItemPolicyNumberHeader,InvoiceItemPolicyNumberHeader, "InvoiceItemPolicyNumberHeader");
			        return this;
           }
public DirectBillPaymentPage clickSuspenseItems(WebDriver driver)  {
					BrowserActions.click(driver, btnSuspenseItems,"SuspenseItems");
				    return this;
			}
public DirectBillPaymentPage clickAccountPicker(WebDriver driver)  {
					BrowserActions.click(driver, btnAccountPicker,"AccountPicker");
				    return this;
			}
public DirectBillPaymentPage enterCollateral(WebDriver driver,String Collateral) {
		            BrowserActions.type(driver, inpCollateral,Collateral, "Collateral");
			        return this;
           }
public DirectBillPaymentPage enterPayerHeader(WebDriver driver,String PayerHeader) {
		            BrowserActions.type(driver, inpPayerHeader,PayerHeader, "PayerHeader");
			        return this;
           }
public DirectBillPaymentPage clickEdit(WebDriver driver)  {
					BrowserActions.click(driver, btnEdit,"Edit");
				    return this;
			}
public DirectBillPaymentPage enterRemaining(WebDriver driver,String Remaining) {
		            BrowserActions.type(driver, inpRemaining,Remaining, "Remaining");
			        return this;
           }
public DirectBillPaymentPage enterAmountToApplyHeader(WebDriver driver,String AmountToApplyHeader) {
		            BrowserActions.type(driver, inpAmountToApplyHeader,AmountToApplyHeader, "AmountToApplyHeader");
			        return this;
           }
public DirectBillPaymentPage clickRemove(WebDriver driver)  {
					BrowserActions.click(driver, btnRemove,"Remove");
				    return this;
			}
public DirectBillPaymentPage selectIs(WebDriver driver,String Is)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpIs,Is,"Is");
				    return this;
			}
public DirectBillPaymentPage clickClose(WebDriver driver)  {
					BrowserActions.click(driver, btnClose,"Close");
				    return this;
			}
public AccountSummaryPage clickExecuteWithoutDistribution(WebDriver driver)  {
	               //BrowserActions.waitForNetworkIdleState(driver, 2);
					BrowserActions.click(driver, btnExecuteWithoutDistribution,true,"ExecuteWithoutDistribution");
				    return new AccountSummaryPage(driver).get();
			}
public DirectBillPaymentPage clickAdd_3(WebDriver driver)  {
					BrowserActions.click(driver, btnAdd_3,"Add_3");
				    return this;
			}
public DirectBillPaymentPage enterAvailable(WebDriver driver,String Available) {
		            BrowserActions.type(driver, inpAvailable,Available, "Available");
			        return this;
           }
public DirectBillPaymentPage selectSelectItemswherethe(WebDriver driver,String SelectItemswherethe)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpSelectItemswherethe,SelectItemswherethe,"SelectItemswherethe");
				    return this;
			}
public AccountSummaryPage clickCancel(WebDriver driver)  {
					BrowserActions.click(driver, btnCancel,"Cancel");
				    return new AccountSummaryPage(driver).get();
			}
public DirectBillPaymentPage clickUseUnappliedFundAmount000(WebDriver driver)  {
					BrowserActions.click(driver, chkUseUnappliedFundAmount000,"UseUnappliedFundAmount000");
				    return this;
			}
public DirectBillPaymentPage selectIncludeOnly(WebDriver driver,String IncludeOnly)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpIncludeOnly,IncludeOnly,"IncludeOnly");
				    return this;
			}
public DirectBillPaymentPage enterSelectedAccount(WebDriver driver,String SelectedAccount) {
		            BrowserActions.type(driver, inpSelectedAccount,SelectedAccount, "SelectedAccount");
			        return this;
           }
public DirectBillPaymentPage clickGo(WebDriver driver)  {
					BrowserActions.click(driver, btnGo,"Go");
				    return this;
			}


public void verifyAccountNo(WebDriver driver, String accNo){
	String text = BrowserActions.getText(driver, lblAccountNumber, "Account number");	
	Log.assertThat(text.equals(accNo), "Account number verified", "Account number not verified");	
}

public void verifyCancelbutton(WebDriver driver) {
	BrowserActions.verifyElementDisplayed(driver,btnCancel,"Cancel button");
}

public void verifyExecuteWithoutDistributionButton(WebDriver driver) {
	BrowserActions.verifyElementDisplayed(driver,btnExecuteWithoutDistribution,"Execute without distribution button");
}

public void verifyReturnToAccountSummaryButton(WebDriver driver) {
	BrowserActions.verifyElementDisplayed(driver,btnReturntoAccountSummary,"Return to account summary button");
}

public void verifyReceievedDate(WebDriver driver) {
	BrowserActions.verifyElementDisplayed(driver,lblReceivedDate,"Received date button");
}

public void verifyUnappliedFunds(WebDriver driver) {
	BrowserActions.verifyElementDisplayed(driver,lblUnappliedFunds,"Unapplied funds button");
}

public void verifyAmount(WebDriver driver) {
	BrowserActions.verifyElementDisplayed(driver,lblAmount,"Amount");
}

public void verifyThisPayment(WebDriver driver) {
	BrowserActions.verifyElementDisplayed(driver,lblThisPayment,"This Payment");
}

public void verifyPaymentDetails(WebDriver driver) {
	BrowserActions.verifyElementDisplayed(driver,lblPaymentDetails,"Payment Details");
}

public void verifyPaymentInstrument(WebDriver driver) {
	BrowserActions.verifyElementDisplayed(driver,lblPaymentInstrument,"Payment Instrument");
}

public void verifyPreviewDistribution(WebDriver driver) {
	BrowserActions.verifyElementDisplayed(driver,lblPreviewDistribution,"Preview Distribution");
}
public void verifyDescription(WebDriver driver) {
	BrowserActions.verifyElementDisplayed(driver,inpDescription,"Description");
}
public void verifyOverrideDistribution(WebDriver driver) {
	BrowserActions.verifyElementDisplayed(driver,btnOverrideDistribution,"Override Distribution");
}
public void verifyGoButton(WebDriver driver) {
	BrowserActions.verifyElementDisplayed(driver,btnGo,"Go button");
}
public void verifyClearButton(WebDriver driver) {
	BrowserActions.verifyElementDisplayed(driver,btnClear,"Clear button");
}
public void verifyGroupBy(WebDriver driver) {
	BrowserActions.verifyElementDisplayed(driver,lblGroupBy,"GroupBy");
}
public void verifyAggregate(WebDriver driver) {
	BrowserActions.verifyElementDisplayed(driver,lblAggregate,"Aggregate");
}
public void verifySortBy(WebDriver driver) {
	BrowserActions.verifyElementDisplayed(driver,lblSortBy,"SortBy");
}
public void verifyGoTo(WebDriver driver) {
	BrowserActions.verifyElementDisplayed(driver,lblGoTo,"GoTo");
}
public void verifyItem(WebDriver driver) {
	BrowserActions.verifyElementDisplayed(driver,lblItem,"Item");
}
public void verifyPolicyPeriod(WebDriver driver) {
	BrowserActions.verifyElementDisplayed(driver,lblPolicyPeriod,"Policy period");
}
public void verifyInvoiceBillDate(WebDriver driver) {
	BrowserActions.verifyElementDisplayed(driver,lblInvoiceBillDate,"Invoice bill date");
}
public void verifyInvoiceDueDate(WebDriver driver) {
	BrowserActions.verifyElementDisplayed(driver,lblInvoiceDueDate,"Invoice due date");
}
public void verifyOwner(WebDriver driver) {
	BrowserActions.verifyElementDisplayed(driver,lblOwner,"owner");
}
public void verifyPayer(WebDriver driver) {
	BrowserActions.verifyElementDisplayed(driver,lblPayer,"payer");
}
public void verifyAmountInDistribution(WebDriver driver) {
	BrowserActions.verifyElementDisplayed(driver,lblAmountInDistribution,"Amount in distribution");
}
public void verifyAmountToApply(WebDriver driver) {
	BrowserActions.verifyElementDisplayed(driver,lblAmountToApply,"Amount in distribution");
}
public void verifyUnpaidAmount(WebDriver driver) {
	BrowserActions.verifyElementDisplayed(driver,lblUnpaidAmount,"unpaid Amount");
}
public DirectBillPaymentPage verifyAmountFieldAcceptSplCharandAlphabet(WebDriver driver){
	String splcharAplha="Al$@#";
	int size;
		BrowserActions.type(driver, inpAmount, splcharAplha,true, "Amount");
		BrowserActions.click(driver, lblAccountNumber, "click");
		String enteredValue=inpAmount.getAttribute("value");
		size=enteredValue.length();
		Log.assertThat(size==0, splcharAplha +" not allowed", "Error!!!: Amount Field accepting Splchar and alphabets",driver);
		return new DirectBillPaymentPage(driver).get();
}
public void verifyUnappliedFundOptions(WebDriver driver) {
	Select select = new Select(drpUnappliedFund);
	List<WebElement> options = select.getOptions();
	List<Object> l = new ArrayList<Object>();
	for (WebElement webElement : options) {
		l.add(webElement.getText());
	}
	Log.assertThat(l.size()>1, "All Unapplied Funds Are available", "All Unapplied Funds Are not available");
}

public class NewPaymentInstrumentPage extends LoadableComponent<NewPaymentInstrumentPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
 	public List<Object> pageFactoryKey = new ArrayList<Object>();
	public List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
//	public TopNavBar topnavbar;
	@IFindBy(how = How.CSS, using = "input[name='NewPaymentInstrumentPopup-Detail']", AI = false)
	private WebElement inpDetail;

	@IFindBy(how = How.CSS, using = "#NewPaymentInstrumentPopup-__crumb__", AI = false)
	private WebElement btnReturntoDirectBillPayment;

	@IFindBy(how = How.CSS, using = "select[name='NewPaymentInstrumentPopup-PaymentMethod']", AI = false)
	private WebElement drpPaymentMethod;

	@IFindBy(how = How.CSS, using = "#NewPaymentInstrumentPopup-Update>div[role='button']", AI = false)
	private WebElement btnOK;

	@IFindBy(how = How.CSS, using = "#NewPaymentInstrumentPopup-CreditCardLink", AI = false)
	private WebElement btnCollectCreditCard;

	@IFindBy(how = How.CSS, using = "input[name='NewPaymentInstrumentPopup-OneTime']", AI = false)
	private WebElement chkOnetimeuse;

	@IFindBy(how = How.CSS, using = "#NewPaymentInstrumentPopup-ttlBar", AI = false)
	private WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "#NewPaymentInstrumentPopup-Cancel>div[role='button']", AI = false)
	private WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "input[name='NewPaymentInstrumentPopup-Token']", AI = false)
	private WebElement inpToken;

	public NewPaymentInstrumentPage(){
	}

	public NewPaymentInstrumentPage(WebDriver driver) throws Exception{
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
		}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, inpToken))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);
}public NewPaymentInstrumentPage enterDetail(WebDriver driver,String Detail) {
		            BrowserActions.type(driver, inpDetail,Detail, "Detail");
			        return this;
           }
public NewPaymentInstrumentPage clickReturntoDirectBillPayment(WebDriver driver)  {
					BrowserActions.click(driver, btnReturntoDirectBillPayment,"ReturntoDirectBillPayment");
				    return this;
			}
public NewPaymentInstrumentPage selectPaymentMethod(WebDriver driver,String PaymentMethod)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPaymentMethod,PaymentMethod,true,"PaymentMethod");
				    return this;
			}
public NewPaymentInstrumentPage clickOK(WebDriver driver)  {
					BrowserActions.click(driver, btnOK,true,"OK");
				    return this;
			}
public NewPaymentInstrumentPage clickCollectCreditCard(WebDriver driver)  {
					BrowserActions.click(driver, btnCollectCreditCard,"CollectCreditCard");
				    return this;
			}
public NewPaymentInstrumentPage clickOnetimeuse(WebDriver driver)  {
					BrowserActions.click(driver, chkOnetimeuse,"Onetimeuse");
				    return this;
			}
public NewPaymentInstrumentPage clickCancel(WebDriver driver)  {
					BrowserActions.click(driver, btnCancel,"Cancel");
				    return this;
			}
public NewPaymentInstrumentPage enterToken(WebDriver driver,String Token) {
		            BrowserActions.type(driver, inpToken,Token, "Token");
			        return this;
           }
}
}
