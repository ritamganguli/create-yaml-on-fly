package com.aspire.guidewire.bc.pages;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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

public class HeaderPage extends LoadableComponent<HeaderPage>{
	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();
	private static final SecureRandom random = new SecureRandom();

	
	@IFindBy(how = How.CSS, using = "div[id$='AccountsTab']", AI = false)
	public WebElement lnkAccount;
	
	@IFindBy(how = How.CSS, using = "div[id$='DesktopTab']", AI = false)
	public WebElement lnkDesktop;
	
	@IFindBy(how = How.CSS, using = "div[id$='MenuActions']", AI = false)
	public WebElement lnkActions;
	
	@IFindBy(how = How.CSS, using = "div[id$='NewAccount']", AI = false)
	public WebElement lnkNewAccount;
	
	@IFindBy(how = How.CSS, using = "input[name$='AccountName']", AI = false)
	public WebElement txtAccountName;
	
	@IFindBy(how = How.CSS, using = "select[name$='BillingPlan']", AI = false)
	public WebElement drpBillingPlan;
	
	@IFindBy(how = How.CSS, using = "select[name$='DelinquencyPlan']", AI = false)
	public WebElement drpDelinquencyPlan;
	
	@IFindBy(how = How.CSS, using = "select[name$='PaymentAllocationPlan']", AI = false)
	public WebElement drpPaymentAllocationPlan;
	
	@IFindBy(how = How.CSS, using = "div[id$='PoliciesTab'] div[class$='button']", AI = false)
	public WebElement btnPolicyMenuIcon;
	
	@IFindBy(how = How.CSS, using = "input[name$='PolicyNumberSearchItem']", AI = false)
	public WebElement txtPolicyNumber;
	
	@IFindBy(how = How.CSS, using = "div[id$='PolicyNumberSearchItem_Button']", AI = false)
	public WebElement btnPolicyNumberIcon;
	
	@IFindBy(how = How.CSS, using = "div[id$='AccountNumber'] div[class='gw-label gw-infoValue']", AI = false)
	public WebElement btnAccountNumber;
	
	@IFindBy(how = How.CSS, using = "div[id$='AccountDetailMenuActions_Payments']", AI = false)
	public WebElement lnkNewPayments;
	
	@IFindBy(how = How.CSS, using = "div[id$='NewDirectBillPayment']", AI = false)
	public WebElement lnkNewDirectBillPayment;
	
	@IFindBy(how = How.CSS, using = "div[id$='AccountDetailPayments'] div[class$='expand-button']", AI = false)
	public WebElement icnPayments;
	
	@IFindBy(how = How.CSS, using = "div[id$='AccountPayments']", AI = false)
	public WebElement lnkPayments;
	
	@IFindBy(how = How.CSS, using = "div[id$='GuidewireLogoWidget']", AI = false)
	public WebElement ttlBillinCenterLogo;
	
	@IFindBy(how = How.CSS, using = "div[id$='AccountGroup_AccountOverview']", AI = false)
	public WebElement btnOverView;

	@IFindBy(how = How.CSS, using = "div[id$='AccountGroup_AccountDetailContacts']", AI = false)
	public WebElement btnContacts;

	@IFindBy(how = How.CSS, using = "div[id$='AccountGroup_AccountDetailFundsTracking']", AI = false)
	public WebElement btnFundsTracking;

	@IFindBy(how = How.CSS, using = "div[id$='AccountGroup_AccountDetailPayments']", AI = false)
	public WebElement btnPayments;

	@IFindBy(how = How.CSS, using = "div[id$='AccountGroup_AccountDetailCharges']", AI = false)
	public WebElement btnCharges;

	@IFindBy(how = How.CSS, using = "div[id$='AccountGroup_AccountDetailDisbursements']", AI = false)
	public WebElement btnDisbursements;

	@IFindBy(how = How.CSS, using = "div[id$='AccountGroup_AccountDetailTransactions']", AI = false)
	public WebElement btnTransactions;

	@IFindBy(how = How.CSS, using = "div[id$='AccountGroup_AccountCollateral']", AI = false)
	public WebElement btnCollateral;

	@IFindBy(how = How.CSS, using = "div[id$='AccountGroup_AccountDetailPolicies']", AI = false)
	public WebElement btnPolicies;

	@IFindBy(how = How.CSS, using = "div[id$='AccountGroup_AccountDetailHistory']", AI = false)
	public WebElement btnHistory;

	@IFindBy(how = How.CSS, using = "div[id$='AccountGroup_AccountDetailEvaluation']", AI = false)
	public WebElement btnEvaluation;

	@IFindBy(how = How.XPATH, using = "//div[@id='TabBar-AdministrationTab']/div", AI = false)
	public WebElement btnAdministration;

	@IFindBy(how = How.CSS, using = "div[id$='Admin-MenuLinks-Admin_Monitoring']", AI = false)
	public WebElement btnMonitoring;

	@IFindBy(how = How.CSS, using = "div[id$='MenuLinks-Admin_Monitoring-Monitoring_MessagingDestinationControlList']", AI = false)
	public WebElement btnMessagesQueue;

	@IFindBy(how = How.CSS, using = "div[id$='DesktopGroup_DesktopDelinquencies']", AI = false)
	public WebElement btnMyDelinquencies;

	@IFindBy(how = How.CSS, using = "div[id$='DesktopGroup_DesktopDisbursements']", AI = false)
	public WebElement btnDesktopDisbursements;

	@IFindBy(how = How.CSS, using = "div[id$='DesktopTab'] div[class$='expand-button']", AI = false)
	public WebElement btnDesktopSubMenu;

	@IFindBy(how = How.CSS, using = "div[id$='SuspensePayments']", AI = false)
	public WebElement lnkSuspensePayments;

	@IFindBy(how = How.CSS, using = "div[id$='AccountDetailInvoices']", AI = false)
	public WebElement lnkInvoices;

	@IFindBy(how = How.XPATH, using = "//div[@id='TabBar-PoliciesTab']//following::div[@data-gw-click='toggleSubMenu']", AI = false)
	public WebElement togglePolicysubMenu;

	@IFindBy(how = How.CSS, using = "div[id$='ReturnToApp']", AI = false)
	public WebElement goBackToApp;

	@IFindBy(how = How.CSS, using = "div[id$='NewTransaction']", AI = false)
	public WebElement lnkNewTransaction;

	@IFindBy(how = How.CSS, using = "div[id$='PolicyDetailTransactions']", AI = false)
	public WebElement lnkTransactions;

	@IFindBy(how = How.CSS, using = "div[id$='AccountDetailMenuActions_WriteoffReversal']", AI = false)
	public WebElement lnkWriteOffReversal;

	@IFindBy(how = How.CSS, using = "div[id$='AdministrationTab'] div[class$='expand-button']", AI = false)
	public WebElement btnAdministrationSubMenu;

	@IFindBy(how = How.CSS, using = "div[id$='BusinessSettings']", AI = false)
	public WebElement lnkBusinessSettings;

	@IFindBy(how = How.CSS, using = "div[id$='AgencyBillPlans']", AI = false)
	public WebElement lnkAgencyBillPlans;

	@IFindBy(how = How.CSS, using = "div[id$='BillingPlans']", AI = false)
	public WebElement lnkBillingPlans;

	@IFindBy(how = How.XPATH, using = "//div[@id='TabBar-SearchTab']//following::div[@data-gw-click='toggleSubMenu']", AI = false)
	public WebElement toggleSearchsubMenu;
	
	@IFindBy(how = How.CSS, using = "div[id$='SearchTab']", AI = false)
	public WebElement lnkSearch;

	@IFindBy(how = How.CSS, using = "div[id='Admin-MenuLinks-Admin_BusinessSettings'] div[id='TabBar-AdministrationTab-Admin_BusinessSettings']", AI = false)
	public WebElement lnkBusinessSetting;

	@IFindBy(how = How.CSS, using = "div[id$='TabBar-SearchTab-SearchGroup_PaymentSearch']", AI = false)
	public WebElement lnkPaymentSearch;

	@IFindBy(how = How.ID, using = "ActivityPatterns-ActivityPatternsScreen-ttlBar", AI = false)
	public WebElement ttlActivityPattern;
	
	@IFindBy(how = How.CSS, using = "div[id$='Admin_BusinessSettings']", AI = false)
	public WebElement lnkAdminBusinessSetting;
	
	@IFindBy(how = How.CSS, using = "div[id$='MenuLinks-Admin_BusinessSettings-BusinessSettings_Holidays']", AI = false)
	public WebElement lnkHolidays;
	
	@IFindBy(how = How.CSS, using = "div[id$='BusinessSettings_PaymentAllocationPlans']", AI = false)
	public WebElement lnkPaymentAllocationPlans;
	
	@IFindBy(how = How.CSS, using = "div[id$='BusinessSettings_ReturnPremiumPlans']", AI = false)
	public WebElement lnkReturnPremiumPlans;
	
	@IFindBy(how = How.CSS, using = "div[id$='BusinessSettings_CommissionPlans']", AI = false)
	public WebElement lnkCommissionPlans;

	@IFindBy(how = How.CSS, using = "div[id$='Admin_Monitoring']", AI = false)
	public WebElement lnkMonitoring;
	
	@IFindBy(how = How.CSS, using = "div[id$='Monitoring_MessagingDestinationControlList']", AI = false)
	public WebElement lnkMessageQueues;
	
	@IFindBy(how = How.CSS, using = "div[id='TabBar-AdministrationTab-Admin_BusinessSettings']", AI = false)
	public WebElement drpBusinessSettings;
	
	@IFindBy(how = How.CSS, using = "div[id$='MenuLinks-Admin_BusinessSettings-BusinessSettings_PaymentPlans']", AI = false)
	public WebElement lnkPaymentPlans;
	
	@IFindBy(how = How.CSS, using = "div[id='TabBar-AdministrationTab-Admin_BusinessSettings-BusinessSettings_DelinquencyPlans']", AI = false)
	public WebElement drpDelinquencyPlans;

	@IFindBy(how = How.CSS, using = "div[id$='AccountsTab'] div[class$='button']", AI = false)
	public WebElement icnAccountSubMenu;
	
	@IFindBy(how = How.CSS, using = "input[name$='AccountNumberSearchItem']", AI = false)
	public WebElement txtAccountNo;
	
	@IFindBy(how = How.CSS, using = "div[id$='AccountNumberSearchItem_Button']", AI = false)
	public WebElement icnSearchAccount;
	
	@IFindBy(how = How.CSS, using = "div[id$='AccountDetailTransactions']", AI = false)
	public WebElement lnkAccountTransactions;
	
	@IFindBy(how = How.CSS, using = "input[name$='AccountNumberSearchItem']", AI = false)
	public WebElement txtAccountNumber;
	
	@IFindBy(how = How.CSS, using = "div[id$='AccountNumberSearchItem_Button']", AI = false)
	public WebElement icnAccSearch;
	
	@IFindBy(how = How.XPATH, using = "//div[@id='TabBar-AccountsTab']//following::div[@data-gw-click='toggleSubMenu']", AI = false)
	public WebElement toggleAccountsubMenu;
	
	@IFindBy(how = How.XPATH, using = "//div[contains(text(),'Written Off')]", AI = false)
	public WebElement lblWriteOff;
	
	@IFindBy(how = How.ID, using = "AccountSummary-AccountSummaryScreen-ttlBar", AI = false)
	public WebElement ttlAccountsummary;
	
	@IFindBy(how = How.CSS, using = "div[id$='SearchTab'] div[class$='button']", AI = false)
	public WebElement drpSearch;
	
	@IFindBy(how = How.CSS, using = "div[id$='SearchTab-SearchGroup_PolicySearch']", AI = false)
	public WebElement lblPolicies;
	
	@IFindBy(how = How.CSS, using = "div[id$='SearchTab-SearchGroup_ContactSearch']", AI = false)
	public WebElement lblContacts;
	
	@IFindBy(how = How.ID, using = "AccountDetailInvoices-AccountDetailInvoicesScreen-ttlBar", AI = false)
	public WebElement ttlInvoice;
	
	@IFindBy(how = How.CSS, using = "div[id$='ProducersTab']", AI = false)
	public WebElement lnkProducer;
	
	@IFindBy(how = How.CSS, using = "div[id$='0-ProducerSessionItemId']", AI = false)
	public WebElement lnkProducerAcia;
	
	@IFindBy(how = How.CSS, using = "div[id$='1-ProducerSessionItemId']", AI = false)
	public WebElement lnkProducerVerity;
	
	@IFindBy(how = How.CSS, using = "div[id$='2-ProducerSessionItemId']", AI = false)
	public WebElement lnkProducerEnigma;
	
	@IFindBy(how = How.CSS, using = "div[id$='ProducersTab'] div[class$='expand-button']", AI = false)
	public WebElement icnProducerSubMenu;
	
	@IFindBy(how = How.CSS, using = "div[id$='PolicyDetailTroubleTickets']", AI = false)
	public WebElement lnkTroubleTickets;
	
	@IFindBy(how = How.CSS, using = "div[id$='Credit']", AI = false)
	public WebElement lnkCredit;
	
	@IFindBy(how = How.CSS, using = "div[id$='CreditReversal']", AI = false)
	public WebElement lnkCreditReversal;
	
	@IFindBy(how = How.CSS, using = "div[id$='Writeoff']", AI = false)
	public WebElement lnkWriteOff;
	
	@IFindBy(how = How.CSS, using = "div[id$='General']", AI = false)
	public WebElement lnkGeneral;
	
	@IFindBy(how = How.CSS, using = "div[id$='DesktopActivities']", AI = false)
	public WebElement lnkMyActivities;
	
	@IFindBy(how = How.CSS, using = "div[id$='TabBar-PoliciesTab']", AI = false)
	public WebElement lnkPolicy;
	
	@IFindBy(how = How.CSS, using = "input[name$='PolicyNumberCriterion']", AI = false)
	public WebElement inpPolicyNo;
	
	@IFindBy(how = How.CSS, using = "div[id='Policies-PolicySearchScreen-PolicySearchDV-SearchAndResetInputSet-SearchLinksInputSet-Search']", AI = false)
	public WebElement btnPolicySearch;
	
	
	public HeaderPage() {}

	public HeaderPage(WebDriver driver){
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, Utils.maxElementWait);
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

		if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, ttlBillinCenterLogo))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}
		elementLayer = new ElementLayer(driver);
	}// isLoaded
	
	/**
	 * Clicks on Account
	 * @author somasundaram.muthu
	 * @param driver
	 */
	public void clickAccount(WebDriver driver) {
		BrowserActions.click(driver, lnkAccount,"Account link");	
	}
	
	/**
	 * Clicks on Desktop
	 * @author somasundaram.muthu
	 * @param driver
	 */
	public void clickDesktop(WebDriver driver) {
		BrowserActions.click(driver, lnkDesktop,"Desktop link");	
	}
	
	/**
	 * click Actions
	 * @author charu.anbarasan
	 * @param driver
	 */
	public void clickActions(WebDriver driver) {
		BrowserActions.click(driver, lnkActions, "Actions");
	}
	
	/**
	 * click policy icon
	 * @author charu.anbarasan
	 * @param driver
	 */
	public void clickPolicyIcon(WebDriver driver) {
		BrowserActions.click(driver, btnPolicyMenuIcon, "Policy icon");
	}
	
	/**
	 * enter Policy Number
	 * @author charu.anbarasan
	 * @param driver,policyNumber
	 */
	public void enterPolicyNumber(WebDriver driver, String policyNumber) {
		BrowserActions.type(driver,txtPolicyNumber,policyNumber,true,"Policy Number");
	}
	
	/**
	 * click Account number
	 * @author charu.anbarasan
	 * @param driver
	 */
	public AccountSummaryPage clickAccountNumber(WebDriver driver) {
		BrowserActions.click(driver, btnAccountNumber,"Account Number");
		return new AccountSummaryPage(driver).get();
	}
	/**
	 * click Account number
	 * @author charu.anbarasan
	 * @param driver
	 */
	public void clickSearch(WebDriver driver) {
		BrowserActions.click(driver, btnPolicyNumberIcon, true,"Search");
	}
	
	/**
	 * Move to New Payments
	 * @author charu.anbarasan
	 * @param driver
	 */
	public void moveToNewPayments(WebDriver driver) {
		BrowserActions.moveToElement(driver, lnkNewPayments,"Account Number");
	}
	
	/**
	 * click New Payments
	 * @author charu.anbarasan
	 * @param driver
	 * @return DirectBillPaymentPage
	 */
	public DirectBillPaymentPage clickNewDirectBillPayment(WebDriver driver) {
		BrowserActions.click(driver, lnkNewDirectBillPayment,"Account Number");
		return new DirectBillPaymentPage(driver).get();
	}
	
	/**
	 * click Payments icon
	 * @author charu.anbarasan
	 * @param driver
	 */
	public void clickPaymentsIcon(WebDriver driver) {
		BrowserActions.click(driver, icnPayments, "Payments icon");
	}
	
	/**
	 * click Administration Monitoring button
	 * @author manikandan.manohar
	 * @param driver
	 */
	public HeaderPage clickAdministrationMonitoring(WebDriver driver) {
		BrowserActions.click(driver, btnMonitoring, "Administration Monitoring button");
		return this;
	}

	/**
	 * 
	 * click Monitoring message queue button
	 * @author manikandan.manohar
	 * @param driver
	 */
	public HeaderPage clickMonitoringMessageQueues(WebDriver driver) {
		BrowserActions.click(driver, btnMessagesQueue, "Monitoring message queue button");
		return this;
	}

	/**
	 * click My Delinquencies button
	 * @author manikandan.manohar
	 * @param driver
	 */
	public void clickMyDelinquencies(WebDriver driver) {
		BrowserActions.click(driver, btnMyDelinquencies, "My Delinquencies button");
	}

	/**
	 * click Desktop Disbursements button
	 * @author manikandan.manohar
	 * @param driver
	 */
	public void clickDesktopDisbursements(WebDriver driver) {
		BrowserActions.click(driver, btnDesktopDisbursements, "Desktop Disbursements button");
	}
	
	/**
	 * Used to click on "DesktopSubMenu" Button
	 * @author anitha.raphel
	 * @param driver
	 */
	public void clickDesktopSubMenu(WebDriver driver) {
		BrowserActions.click(driver, btnDesktopSubMenu, "Desktop Sub Menu");
	}
	
	public MyActivitiesPage clickMyActivities(WebDriver driver) {
		BrowserActions.click(driver, lnkMyActivities, "My Activities");
		return new MyActivitiesPage(driver).get();
	}
	/**
	 * Clicks on policy
	 * @author dhivya.thiyagarajan
	 * @param driver
	 */
	public void clicktogglePolicy(WebDriver driver) {
		BrowserActions.click(driver, togglePolicysubMenu,"Policy SubMenu");	
	}

	/**
	 * Get Account Number
	 * @author dhivya.thiyagarajan
	 * @param driver
	 * @return accNo
	 */
	public String getAccountNo(WebDriver driver){
		String accNo=BrowserActions.getText(driver, btnAccountNumber, "Account number link");
		return accNo;
	}

	/**
	 * Go back to application
	 * @author charu.anbarasan
	 * @param driver
	 */
	public void clickGoBackToApp(WebDriver driver) {
		BrowserActions.click(driver, goBackToApp, "Go Back to application");
	}
	
	/**
	 * used to click Transactions
	 * @author charu.anbarasan
	 * @param driver
	 */
	public void clickTransactions(WebDriver driver) {
		BrowserActions.click(driver, lnkTransactions, "Transactions");
	}
	
	/**
	 * move to new transaction
	 * @author charu.anbarasan
	 * @param driver
	 */
	public void moveToNewTransaction(WebDriver driver) {
		BrowserActions.moveToElement(driver, lnkNewTransaction,"New Transaction");	
	}
	
	/**
	 * used to click Business settings
	 * @author dhivya.thiyagarajan
	 * @param driver
	 */
	public void clickBusinessSettings(WebDriver driver){
		BrowserActions.click(driver, lnkAdminBusinessSetting, "Business Settings");
	}
	
	/**
	 * Click Search Toggle Sub menu
	 * @author dhivya.thiyagarajan
	 * @param driver
	 */
	public void clickSearchToggleSubmenu(WebDriver driver) {
		BrowserActions.click(driver, toggleSearchsubMenu,"Search sub menu");	
	}
	
	/**
	 * Click Payment from Search submenu
	 * @author dhivya.thiyagarajan
	 * @param driver
	 */
	public void clickSearchPayment(WebDriver driver) {
		BrowserActions.click(driver, lnkPaymentSearch,"Click Payment");	
	}

	/**
	 * Used to click on "AdministrationSubMenu"
	 * @author anitha.raphel
	 * @param driver
	 */
	public HeaderPage clickAdministrationSubMenu(WebDriver driver) {
		BrowserActions.click(driver, btnAdministrationSubMenu, "Administration Sub Menu");
		return this;
	}

	/**
	 * Used to move on "BusinessSettings"
	 * @author anitha.raphel
	 * @param driver
	 */
	public void mouseOverBusinessSettings(WebDriver driver) {
		BrowserActions.click(driver, lnkBusinessSettings, "Business Settings");
	}
	
	/**
	 * Used to click on "Commission Plans"
	 * @author lavanya.bala
	 * @param driver
	 */
	public void clickCommissionPlans(WebDriver driver) {
		BrowserActions.click(driver, lnkCommissionPlans, "Commission Plans");
	}

	/**
	 * Used to click on "Business Setting drop down"
	 * @author lavanya.bala
	 * @param driver
	 */
	public void clickBusinessSettingDropDown(WebDriver driver) {
		this.clickAdministrationSubMenu(driver);
		BrowserActions.moveToElement(driver, drpBusinessSettings, "Business Setting ");
		this.clickCommissionPlans(driver);
	}
	
	/**
	 * Used to click on "Delinquency drop down"
	 * @author lavanya.bala
	 * @param driver
	 */
	public void clickDelinquencyDropDown(WebDriver driver) {
		this.clickAdministrationSubMenu(driver);
		BrowserActions.moveToElement(driver, drpBusinessSettings, "Business Setting ");
		BrowserActions.click(driver, drpDelinquencyPlans, "Delinquency Plans");
	}
	

	
	/**
	 * Used to click on account sub menu
	 * @author anitha.raphel
	 * @param driver
	 */
	public void clickAccountSubMenuIcon(WebDriver driver) {
		BrowserActions.click(driver, icnAccountSubMenu, "Account icon");
	}

	/**
	 * Used to enter Account Number
	 * @author anitha.raphel
	 * @param driver, accountNumber
	 */
	public void enterAccountNumber(WebDriver driver, String accountNumber) {
		BrowserActions.type(driver,txtAccountNo,accountNumber,"Account Number");
	}
	
	/**
	 * Used to click on Account Number search icon
	 * @author anitha.raphel
	 * @param driver
	 */
	public void clickSearchAccountNoIcon(WebDriver driver) {
		BrowserActions.click(driver, icnSearchAccount, "Search");
	}
	
	/**
	 * Used to generate random number and then enter random Account Number
	 * @author anitha.raphel
	 * @param driver,accountNumber
	 * @return randomAccountNo
	 */
	public String enterRandomAccountNumber(WebDriver driver) {
		int a=random.nextInt(1000000);
		String randomAccountNo=Integer.toString(a);
		BrowserActions.type(driver,txtAccountNo,randomAccountNo,"Account Number");
		return randomAccountNo;
	}
	
	/**
	 * Used to enter random Policy Number
	 * @author anitha.raphel
	 * @param driver
	 * @return randomPolicyNo
	 */
	public String enterRandomPolicyNumber(WebDriver driver) {
		int no=random.nextInt(1000000);
		String randomPolicyNo=Integer.toString(no);
		BrowserActions.type(driver,txtPolicyNumber,randomPolicyNo,"Policy Number");
		return randomPolicyNo;
	}
	
	/**
	 * used to click Account level Transactions
	 * @author dhivya.thiyagarajan
	 * @param driver
	 */
	public void clickAccountTransactions(WebDriver driver) {
		BrowserActions.click(driver, lnkAccountTransactions, "Transactions");
	}
	
	/**
	 * Clicks on Account
	 * @author dhivya.thiyagarajan
	 * @param driver
	 */
	public void clicktoggleAccount(WebDriver driver) {
		BrowserActions.click(driver, toggleAccountsubMenu,"Account SubMenu");	
	}
	
	/**
	 * Used to mouse over Monitoring
	 * @author dhivya.thiyagarajan
	 * @param driver
	 */
	public void moveToMonitoring(WebDriver driver)  {
		BrowserActions.moveToElement(driver, lnkMonitoring,"Monitoring");
	}
	/**
	 * Used to click Search in Header
	 * @author lavanya.bala
	 * @param driver
	 */
	public void clickSearchInHeader(WebDriver driver) {
		BrowserActions.click(driver, drpSearch, "Search");
	}
	
	/**
	 * click Policies in search
	 * @author lavanya.bala
	 * @param driver
	 */
	public void clickPolicies(WebDriver driver) {
		BrowserActions.click(driver, lblPolicies, "Policies");
	}
	
	/**
	 * click Contacts in search
	 * @author lavanya.bala
	 * @param driver
	 */
	public void clickContacts(WebDriver driver) {
		BrowserActions.click(driver, lblContacts, "Contacts");
	}

	public void clickProducerSubMenu(WebDriver driver) {
		BrowserActions.click(driver, icnProducerSubMenu, "Producer Sub toggle");
	}
	
	public TroubleTicketsPage clickTroubleTickets(WebDriver driver) {
	BrowserActions.click(driver, lnkTroubleTickets, "Trouble tickets");
	return new TroubleTicketsPage(driver).get();
	}
	public CreditWizardPage clickCredit(WebDriver driver) {
		BrowserActions.click(driver, lnkCredit, "Credit");
		return new CreditWizardPage(driver).get();
	}
	public CreditReversalWizardPage clickCreditReversal(WebDriver driver) {
		BrowserActions.click(driver, lnkCreditReversal, "Credit Reversal");
		return new CreditReversalWizardPage(driver).get();
	}
	public WriteOffWizardPage clickWriteOff(WebDriver driver) {
		BrowserActions.click(driver, lnkWriteOff, "Write Off");
		return new WriteOffWizardPage(driver).get();
	}
	public TransactionWizardPage clickGeneral(WebDriver driver) {
		BrowserActions.click(driver, lnkGeneral, "General");
		return new TransactionWizardPage(driver).get();
	}
	public WriteOffReversalWizardPage clickWriteOffReversal(WebDriver driver) {
		BrowserActions.click(driver, lnkWriteOffReversal, "Write off reversal");
		return new WriteOffReversalWizardPage(driver).get();
	}
	public HeaderPage clickPolicyTab(WebDriver driver) {
		BrowserActions.click(driver, lnkPolicy,"Policy link");
		return this;	
		
	}
	public HeaderPage enterPolicyNo(WebDriver driver, String policyNumber) {
		BrowserActions.type(driver,inpPolicyNo,policyNumber,true,"Policy Number");
		return this;
	}
	public HeaderPage clickSearchPolicy(WebDriver driver) {
		BrowserActions.click(driver, btnPolicySearch,true,"Policy Search");	
		return this;
	}
	public HeaderPage clickPolicy(WebDriver driver , String policyNo) {
		By policyBy = By.xpath("//div[contains(@id,'PolicyNumber')]//div[text()='"+policyNo+"-1']");
		BrowserActions.waitForElementToDisplay(driver, policyBy, "policy");
		WebElement policy = policyBy.findElement(driver);
		BrowserActions.click(driver, policy,1.5, "Policy number");
		return this;
	}
}