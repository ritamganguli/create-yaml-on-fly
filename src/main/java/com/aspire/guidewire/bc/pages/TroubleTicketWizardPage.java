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

public class TroubleTicketWizardPage extends LoadableComponent<TroubleTicketWizardPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
	//	public TopNavBar topnavbar;
	@IFindBy(how = How.CSS, using = "input[name='CreateTroubleTicketWizard-CreateTroubleTicketInfoScreen-NewTroubleTicketInfoDV-EscalationDate']", AI = false)
	private WebElement inpEscalationDate;

	@IFindBy(how = How.CSS, using = "#CreateTroubleTicketWizard-Step2>div[role='menuitem']", AI = false)
	private WebElement btnSelectRelatedEntities;

	@IFindBy(how = How.CSS, using = "#CreateTroubleTicketWizard-Prev>div[role='button']", AI = false)
	private WebElement btnBack;

	@IFindBy(how = How.CSS, using = "#CreateTroubleTicketWizard-CreateTroubleTicketInfoScreen-ttlBar", AI = false)
	private WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "#CreateTroubleTicketWizard-Step5>div[role='menuitem']", AI = false)
	private WebElement btnConfirmation;

	@IFindBy(how = How.CSS, using = "#CreateTroubleTicketWizard-Step1>div[role='menuitem']", AI = false)
	private WebElement btnEnterInformation;

	@IFindBy(how = How.CSS, using = "#CreateTroubleTicketWizard-__crumb__", AI = false)
	private WebElement btnReturntoTroubleTickets;

	@IFindBy(how = How.CSS, using = "#CreateTroubleTicketWizard-CreateTroubleTicketInfoScreen-NewTroubleTicketInfoDV-EscalationDate_dateIcon", AI = false)
	private WebElement btnEscalationDateDateIcon;

	@IFindBy(how = How.CSS, using = "div[id='CreateTroubleTicketWizard-Next']", AI = false)
	private WebElement btnNext;//#CreateTroubleTicketWizard-Next>div[role='button']

	@IFindBy(how = How.CSS, using = "#CreateTroubleTicketWizard-CreateTroubleTicketInfoScreen-NewTroubleTicketInfoDV-DueDate_dateIcon", AI = false)
	private WebElement btnDueDateDateIcon;

	@IFindBy(how = How.CSS, using = "#CreateTroubleTicketWizard-CreateTroubleTicketInfoScreen-NewTroubleTicketInfoDV-DetailedDescription textarea", AI = false)
	private WebElement inpDetails;

	@IFindBy(how = How.CSS, using = "input[name='CreateTroubleTicketWizard-CreateTroubleTicketInfoScreen-NewTroubleTicketInfoDV-Subject']", AI = false)
	private WebElement inpSubject;

	@IFindBy(how = How.CSS, using = "#CreateTroubleTicketWizard-Cancel>div[role='button']", AI = false)
	private WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "select[name='CreateTroubleTicketWizard-CreateTroubleTicketInfoScreen-NewTroubleTicketInfoDV-TicketType']", AI = false)
	private WebElement drpType;

	@IFindBy(how = How.CSS, using = "#CreateTroubleTicketWizard-Finish>div[role='button']", AI = false)
	private WebElement btnFinish;

	@IFindBy(how = How.CSS, using = "select[name='CreateTroubleTicketWizard-CreateTroubleTicketInfoScreen-NewTroubleTicketInfoDV-Priority']", AI = false)
	private WebElement drpPriority;

	@IFindBy(how = How.CSS, using = "#CreateTroubleTicketWizard-Step3>div[role='menuitem']", AI = false)
	private WebElement btnHolds;

	@IFindBy(how = How.CSS, using = "input[name='CreateTroubleTicketWizard-CreateTroubleTicketInfoScreen-NewTroubleTicketInfoDV-DueDate']", AI = false)
	private WebElement inpDueDate;

	@IFindBy(how = How.CSS, using = "#CreateTroubleTicketWizard-CreateTroubleTicketConfirmationScreen-CreateTroubleTicketConfirmationScreen_HoldsButNoTargetAlertBar-CloseBtn", AI = false)
	private WebElement btnClose;

	@IFindBy(how = How.CSS, using = "input[name='CreateTroubleTicketWizard-CreateTroubleTicketConfirmationScreen-CreateTroubleTicketConfirmationScreenDV-whitespace01']", AI = false)
	private WebElement inpWhitespace01;

	@IFindBy(how = How.CSS, using = "#CreateTroubleTicketWizard-CreateTroubleTicketConfirmationScreen-CreateTroubleTicketConfirmationScreen_HoldsButNoTargetAlertBar .gw-AlertBar--label", AI = false)
	private WebElement lblCreateTroubleTicketConfirmationScreen_HoldsButNoTargetAlertBar;

	@IFindBy(how = How.CSS, using = "#CreateTroubleTicketWizard-CreateTroubleTicketConfirmationScreen-CreateTroubleTicketConfirmationScreenDV-AssignTicketOwner-AssignTicketOwner_PickerButton", AI = false)
	private WebElement btnAssignTicketOwner_PickerButton;

	@IFindBy(how = How.CSS, using = "select[name='CreateTroubleTicketWizard-CreateTroubleTicketConfirmationScreen-CreateTroubleTicketConfirmationScreenDV-AssignTicketOwner']", AI = false)
	private WebElement drpAssignedTo;

	@IFindBy(how = How.CSS, using = "#CreateTroubleTicketWizard-Step4>div[role='menuitem']", AI = false)
	private WebElement btnTransactions;
	
	@IFindBy(how = How.CSS, using = "input[name$='TroubleTicketRelatedEntitiesLV-0-_Checkbox']", AI = false)
	private WebElement chkAccount;
	
	@IFindBy(how = How.CSS, using = "input[name$='HoldDV-0-HoldType']", AI = false)
	private WebElement chkDeliquency;
	
	@IFindBy(how = How.CSS, using = "input[name$='HoldDV-1-HoldType']", AI = false)
	private WebElement chkInvoice;
	
	@IFindBy(how = How.CSS, using = "input[name$='HoldDV-2-HoldType']", AI = false)
	private WebElement chkEarnings;
	
	@IFindBy(how = How.CSS, using = "input[name$='HoldDV-3-HoldType']", AI = false)
	private WebElement chkPayments;
	
	@IFindBy(how = How.CSS, using = "input[name$='HoldDV-4-HoldType']", AI = false)
	private WebElement chkDistribution;
	
	@IFindBy(how = How.CSS, using = "input[name$='HoldDV-5-HoldType']", AI = false)
	private WebElement chkDisbursements;
	
	@IFindBy(how = How.CSS, using = "input[name$='HoldDV-0-ReleaseDate']", AI = false)
	private WebElement inpDeliquencyDate;
	
	@IFindBy(how = How.CSS, using = "input[name$='HoldDV-1-ReleaseDate']", AI = false)
	private WebElement inpInvoiceDate;
	
	@IFindBy(how = How.CSS, using = "input[name$='HoldDV-2-ReleaseDate']", AI = false)
	private WebElement inpEarningsDate;
	
	@IFindBy(how = How.CSS, using = "input[name$='HoldDV-3-ReleaseDate']", AI = false)
	private WebElement inpPaymentsDate;
	
	@IFindBy(how = How.CSS, using = "input[name$='HoldDV-4-ReleaseDate']", AI = false)
	private WebElement inpDistributionDate;
	
	@IFindBy(how = How.CSS, using = "input[name$='HoldDV-5-ReleaseDate']", AI = false)
	private WebElement inpDisbursementsDate;
	
	@IFindBy(how = How.CSS, using = "div[id$='TroubleTicketRelatedTransactionsDV_AddButton']", AI = false)
	private WebElement btnAddTransaction;
	
	@IFindBy(how = How.CSS, using = "input[name$='TroubleTicketTransactionsLV-0-_Checkbox']", AI = false)
	private WebElement chkTransaction;
	
	@IFindBy(how = How.CSS, using = "div[id$='TransactionsPopup_SelectButton']", AI = false)
	private WebElement btnSelectTransaction;
	
	
	
	public TroubleTicketWizardPage(){
	}

	public TroubleTicketWizardPage(WebDriver driver) {
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
		}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, btnReturntoTroubleTickets))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);
	}public TroubleTicketWizardPage enterEscalationDate(WebDriver driver,String EscalationDate) {
		BrowserActions.type(driver, inpEscalationDate,EscalationDate, "EscalationDate");
		return this;
	}
	public TroubleTicketWizardPage clickSelectRelatedEntities(WebDriver driver)  {
		BrowserActions.click(driver, btnSelectRelatedEntities,"SelectRelatedEntities");
		return this;
	}
	public TroubleTicketWizardPage clickBack(WebDriver driver)  {
		BrowserActions.click(driver, btnBack,"Back");
		return this;
	}
	public TroubleTicketWizardPage clickConfirmation(WebDriver driver)  {
		BrowserActions.click(driver, btnConfirmation,"Confirmation");
		return this;
	}
	public TroubleTicketWizardPage clickEnterInformation(WebDriver driver)  {
		BrowserActions.click(driver, btnEnterInformation,"EnterInformation");
		return this;
	}
	public TroubleTicketsPage clickReturntoTroubleTickets(WebDriver driver)  {
		BrowserActions.click(driver, btnReturntoTroubleTickets,"ReturntoTroubleTickets");
		return new TroubleTicketsPage(driver).get();
	}
	public TroubleTicketWizardPage clickEscalationDateDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnEscalationDateDateIcon,"EscalationDateDateIcon");
		return this;
	}
	public TroubleTicketWizardPage clickNext(WebDriver driver)  {
		BrowserActions.click(driver, btnNext,"Next");
		return this;
	}
	public TroubleTicketWizardPage clickDueDateDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnDueDateDateIcon,"DueDateDateIcon");
		return this;
	}
	public TroubleTicketWizardPage enterDetails(WebDriver driver,String Details) {
		BrowserActions.type(driver, inpDetails,Details, "Details");
		return this;
	}
	public TroubleTicketWizardPage enterSubject(WebDriver driver,String Subject) {
		BrowserActions.type(driver, inpSubject,Subject, "Subject");
		return this;
	}
	public TroubleTicketWizardPage clickCancel(WebDriver driver)  {
		BrowserActions.click(driver, btnCancel,"Cancel");
		return this;
	}
	public TroubleTicketWizardPage selectType(WebDriver driver,String Type)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpType,Type,"Type");
		return this;
	}
	public TroubleTicketsPage clickFinish(WebDriver driver)  {
		BrowserActions.click(driver, btnFinish,"Finish");
		return new TroubleTicketsPage(driver).get();
	}
	public TroubleTicketWizardPage selectPriority(WebDriver driver,String Priority)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPriority,Priority,"Priority");
		return this;
	}
	public TroubleTicketWizardPage clickHolds(WebDriver driver)  {
		BrowserActions.click(driver, btnHolds,"Holds");
		return this;
	}
	public TroubleTicketWizardPage enterDueDate(WebDriver driver,String DueDate) {
		BrowserActions.type(driver, inpDueDate,DueDate, "DueDate");
		return this;
	}
	public TroubleTicketWizardPage clickTransactions(WebDriver driver)  {
		BrowserActions.click(driver, btnTransactions,"Transactions");
		return this;
	}
	public TroubleTicketWizardPage selectAssignedTo(WebDriver driver,String AssignedTo)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpAssignedTo,AssignedTo,"AssignedTo");
		return this;
	}
	public TroubleTicketWizardPage clickDeliquency(WebDriver driver)  {
		BrowserActions.click(driver, chkDeliquency,true,"Deliquency");
		return this;
	}
	public TroubleTicketWizardPage clickInvoice(WebDriver driver)  {
		BrowserActions.click(driver, chkInvoice,true,"Invoice");
		return this;
	}
	public TroubleTicketWizardPage clickEarnings(WebDriver driver)  {
		BrowserActions.click(driver, chkEarnings,true,"Earnings");
		return this;
	}
	public TroubleTicketWizardPage clickPayments(WebDriver driver)  {
		BrowserActions.click(driver, chkPayments,true,"Payments");
		return this;
	}
	public TroubleTicketWizardPage clickDistribution(WebDriver driver)  {
		BrowserActions.click(driver, chkDistribution,true,"Distribution");
		return this;
	}
	public TroubleTicketWizardPage clickDisbursements(WebDriver driver)  {
		BrowserActions.click(driver, chkDisbursements,true,"Disbursements");
		return this;
	}
	
	public TroubleTicketWizardPage enterDeliquencyDate(WebDriver driver,String DueDate) {
		BrowserActions.type(driver, inpDeliquencyDate,DueDate, "DueDate");
		return this;
	}
	
	public TroubleTicketWizardPage enterInvoiceDate(WebDriver driver,String DueDate) {
		BrowserActions.type(driver, inpInvoiceDate,DueDate, "DueDate");
		return this;
	}
	
	public TroubleTicketWizardPage enterEarningsDate(WebDriver driver,String DueDate) {
		BrowserActions.type(driver, inpEarningsDate,DueDate, "DueDate");
		return this;
	}
	
	public TroubleTicketWizardPage enterPaymentsDate(WebDriver driver,String DueDate) {
		BrowserActions.type(driver, inpPaymentsDate,DueDate, "DueDate");
		return this;
	}
	
	public TroubleTicketWizardPage enterDistributionDate(WebDriver driver,String DueDate) {
		BrowserActions.type(driver, inpDistributionDate,DueDate, "DueDate");
		return this;
	}
	
	public TroubleTicketWizardPage enterDisbursementsDate(WebDriver driver,String DueDate) {
		BrowserActions.type(driver, inpDisbursementsDate,DueDate, "DueDate");
		return this;
	}
	
	public TroubleTicketWizardPage clickAddTransaction(WebDriver driver)  {
		BrowserActions.click(driver, btnAddTransaction,true,"Add Transaction");
		return this;
	}
	
	public TroubleTicketWizardPage selectchkTransaction(WebDriver driver)  {
		BrowserActions.click(driver, chkTransaction,"Check Select Transaction");
		return this;
	}
	
	public TroubleTicketWizardPage selectTransaction(WebDriver driver)  {
		BrowserActions.click(driver, btnSelectTransaction, "Select Transaction");
		return this;
	}
	
	public TroubleTicketWizardPage selectAccount(WebDriver driver)  {
		BrowserActions.click(driver, chkAccount,"Select Account");
		return this;
	}
	
	
}
