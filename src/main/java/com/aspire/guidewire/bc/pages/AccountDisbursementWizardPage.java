package com.aspire.guidewire.bc.pages;
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

public class AccountDisbursementWizardPage extends LoadableComponent<AccountDisbursementWizardPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
	//	public TopNavBar topnavbar;
	@IFindBy(how = How.CSS, using = "#AccountCreateDisbursementWizard-Prev>div[role='button']", AI = false)
	private WebElement btnBack;

	@IFindBy(how = How.CSS, using = "#AccountCreateDisbursementWizard-CreateDisbursementDetailScreen-ttlBar", AI = false)
	private WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "select[name='AccountCreateDisbursementWizard-CreateDisbursementDetailScreen-CreateDisbursementDetailDV-reason']", AI = false)
	private WebElement drpReason;

	@IFindBy(how = How.CSS, using = "input[name='AccountCreateDisbursementWizard-CreateDisbursementDetailScreen-CreateDisbursementDetailDV-payTo']", AI = false)
	private WebElement inpPayTo;

	@IFindBy(how = How.CSS, using = "#AccountCreateDisbursementWizard-Step1>div[role='menuitem']", AI = false)
	private WebElement btnDisbursementDetails;

	@IFindBy(how = How.CSS, using = "#AccountCreateDisbursementWizard-Step2>div[role='menuitem']", AI = false)
	private WebElement btnConfirmation;

	@IFindBy(how = How.CSS, using = "input[name='AccountCreateDisbursementWizard-CreateDisbursementDetailScreen-CreateDisbursementDetailDV-effectiveDate']", AI = false)
	private WebElement inpPaymentDate;

	@IFindBy(how = How.CSS, using = "input[name='AccountCreateDisbursementWizard-CreateDisbursementDetailScreen-CreateDisbursementDetailDV-mailTo']", AI = false)
	private WebElement inpMailTo;

	@IFindBy(how = How.CSS, using = "input[name='AccountCreateDisbursementWizard-CreateDisbursementDetailScreen-CreateDisbursementDetailDV-amount']", AI = false)
	private WebElement inpAmount;

	@IFindBy(how = How.CSS, using = "#AccountCreateDisbursementWizard-Next>div[role='button']", AI = false)
	private WebElement btnNext;

	@IFindBy(how = How.CSS, using = "input[name='AccountCreateDisbursementWizard-CreateDisbursementDetailScreen-DisbursementPage2DV-insured']", AI = false)
	private WebElement inpAccountName;

	@IFindBy(how = How.CSS, using = "input[name='AccountCreateDisbursementWizard-CreateDisbursementDetailScreen-DisbursementPendingDV-pending']", AI = false)
	private WebElement inpDisbursementsPending;

	@IFindBy(how = How.CSS, using = "#AccountCreateDisbursementWizard-__crumb__", AI = false)
	private WebElement btnReturntoAccountSummary;

	@IFindBy(how = How.CSS, using = "#AccountCreateDisbursementWizard-Cancel>div[role='button']", AI = false)
	private WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "input[name='AccountCreateDisbursementWizard-CreateDisbursementDetailScreen-DisbursementPage2DV-account']", AI = false)
	private WebElement inpAccount;

	@IFindBy(how = How.CSS, using = "select[name='AccountCreateDisbursementWizard-CreateDisbursementDetailScreen-DisbursementUnappliedSelectionDV-UnappliedFunds']", AI = false)
	private WebElement drpUnappliedFund;

	@IFindBy(how = How.CSS, using = "input[name='AccountCreateDisbursementWizard-CreateDisbursementDetailScreen-CreateDisbursementDetailDV-memo']", AI = false)
	private WebElement inpMemo;

	@IFindBy(how = How.CSS, using = "input[name='AccountCreateDisbursementWizard-CreateDisbursementDetailScreen-DisbursementPendingDV-UnappliedAmount']", AI = false)
	private WebElement inpUnappliedAmount;

	@IFindBy(how = How.CSS, using = "#AccountCreateDisbursementWizard-Finish>div[role='button']", AI = false)
	private WebElement btnFinish;

	@IFindBy(how = How.CSS, using = "#AccountCreateDisbursementWizard-CreateDisbursementDetailScreen-CreateDisbursementDetailDV-mailToAddress textarea", AI = false)
	private WebElement inpMailToAddress;

	@IFindBy(how = How.CSS, using = "#AccountCreateDisbursementWizard-CreateDisbursementDetailScreen-CreateDisbursementDetailDV-effectiveDate_dateIcon", AI = false)
	private WebElement btnPaymentDateDateIcon;

	@IFindBy(how = How.CSS, using = "input[name='AccountCreateDisbursementWizard-CreateDisbursementDetailScreen-CreateDisbursementDetailDV-internalComment']", AI = false)
	private WebElement inpInternalComment;
	
	public AccountDisbursementWizardPage(){
	}

	public AccountDisbursementWizardPage(WebDriver driver){
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
		}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, inpMailToAddress))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);
	}public AccountDisbursementWizardPage clickBack(WebDriver driver)  {
		BrowserActions.click(driver, btnBack,"Back");
		return this;
	}
	public AccountDisbursementWizardPage selectReason(WebDriver driver,String Reason)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpReason,Reason,"Reason");
		return this;
	}
	public AccountDisbursementWizardPage enterPayTo(WebDriver driver,String PayTo) {
		BrowserActions.type(driver, inpPayTo,PayTo, "PayTo");
		return this;
	}
	public AccountDisbursementWizardPage clickDisbursementDetails(WebDriver driver)  {
		BrowserActions.click(driver, btnDisbursementDetails,"DisbursementDetails");
		return this;
	}
	public AccountDisbursementWizardPage clickConfirmation(WebDriver driver)  {
		BrowserActions.click(driver, btnConfirmation,"Confirmation");
		return this;
	}
	public AccountDisbursementWizardPage enterPaymentDate(WebDriver driver,String PaymentDate) {
		BrowserActions.type(driver, inpPaymentDate,PaymentDate, "PaymentDate");
		return this;
	}
	public AccountDisbursementWizardPage enterMailTo(WebDriver driver,String MailTo) {
		BrowserActions.type(driver, inpMailTo,MailTo, "MailTo");
		return this;
	}
	public AccountDisbursementWizardPage enterAmount(WebDriver driver,String Amount) {
		BrowserActions.type(driver, inpAmount,Amount, "Amount");
		return this;
	}
	public AccountDisbursementWizardPage clickNext(WebDriver driver)  {
		BrowserActions.click(driver, btnNext,"Next");
		return this;
	}
	public AccountDisbursementWizardPage enterAccountName(WebDriver driver,String AccountName) {
		BrowserActions.type(driver, inpAccountName,AccountName, "AccountName");
		return this;
	}
	public AccountDisbursementWizardPage enterDisbursementsPending(WebDriver driver,String DisbursementsPending) {
		BrowserActions.type(driver, inpDisbursementsPending,DisbursementsPending, "DisbursementsPending");
		return this;
	}
	public AccountSummaryPage clickReturntoAccountSummary(WebDriver driver)  {
		BrowserActions.click(driver, btnReturntoAccountSummary,"ReturntoAccountSummary");
		return new AccountSummaryPage(driver).get();
	}
	public AccountSummaryPage clickCancel(WebDriver driver)  {
		BrowserActions.click(driver, btnCancel,"Cancel");
		BrowserActions.confirmAlert(driver, "cancel");
		return new AccountSummaryPage(driver).get();
	}
	public AccountDisbursementWizardPage enterAccount(WebDriver driver,String Account) {
		BrowserActions.type(driver, inpAccount,Account, "Account");
		return this;
	}
	public AccountDisbursementWizardPage selectUnappliedFund(WebDriver driver,String UnappliedFund)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpUnappliedFund,UnappliedFund,"UnappliedFund");
		return this;
	}
	public AccountDisbursementWizardPage enterMemo(WebDriver driver,String Memo) {
		BrowserActions.type(driver, inpMemo,Memo, "Memo");
		return this;
	}
	public AccountDisbursementWizardPage enterUnappliedAmount(WebDriver driver,String UnappliedAmount) {
		BrowserActions.type(driver, inpUnappliedAmount,UnappliedAmount, "UnappliedAmount");
		return this;
	}
	public AccountDisbursementWizardPage clickFinish(WebDriver driver)  {
		BrowserActions.click(driver, btnFinish,"Finish");
		return this;
	}
	public AccountDisbursementWizardPage enterMailToAddress(WebDriver driver,String MailToAddress) {
		BrowserActions.type(driver, inpMailToAddress,MailToAddress, "MailToAddress");
		return this;
	}
	public AccountDisbursementWizardPage clickPaymentDateDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnPaymentDateDateIcon,"PaymentDateDateIcon");
		return this;
	}
	public AccountDisbursementWizardPage enterInternalComment(WebDriver driver,String InternalComment) {
		BrowserActions.type(driver, inpInternalComment,InternalComment, "InternalComment");
		return this;
	}

}
