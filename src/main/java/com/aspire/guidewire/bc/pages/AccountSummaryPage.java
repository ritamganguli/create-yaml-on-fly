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

public class AccountSummaryPage extends LoadableComponent<AccountSummaryPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
	//	public TopNavBar topnavbar;
	//	public AccountSummaryScreen accountsummaryscreenTable;

	@IFindBy(how = How.CSS, using = "#AccountSummary-AccountSummaryScreen-NotesNoneIcon", AI = false)
	private WebElement btnNotesNoneIcon;

	@IFindBy(how = How.CSS, using = "input[name='AccountSummary-AccountSummaryScreen-AccountPolicyPeriodsLV-1-IsActive']", AI = false)
	private WebElement rdbIsActive_6;

	@IFindBy(how = How.CSS, using = "input[name='AccountSummary-AccountSummaryScreen-AccountPolicyPeriodsLV-0-PolicyPerExpirDate']", AI = false)
	private WebElement inpExpirationDate;

	@IFindBy(how = How.CSS, using = "#AccountSummary-AccountSummaryScreen-AccountDetailSummary_PreDueAlertBar .gw-AlertBar--label", AI = false)
	private WebElement lblAccountDetailSummary_PreDueAlertBar;

	@IFindBy(how = How.CSS, using = "#AccountSummary-AccountSummaryScreen-NoteDate_dateIcon", AI = false)
	private WebElement btnDateDateIcon;

	@IFindBy(how = How.CSS, using = "#AccountSummary-AccountSummaryScreen-AccountDetailSummary_PreDueAlertBar-CloseBtn", AI = false)
	private WebElement btnClose_2;

	@IFindBy(how = How.CSS, using = "#AccountSummary-AccountSummaryScreen-AccountDetailSummary_DelinquencyAlertAlertBar-CloseBtn", AI = false)
	private WebElement btnClose_1;

	@IFindBy(how = How.CSS, using = "#AccountSummary-AccountSummaryScreen-StartDelinquencyButton>div[role='button']", AI = false)
	private WebElement btnStartDelinquency;

	@IFindBy(how = How.CSS, using = "input[name='AccountSummary-AccountSummaryScreen-AccountPolicyPeriodsLV-1-Product']", AI = false)
	private WebElement rdbProduct_4;

	@IFindBy(how = How.CSS, using = "input[name='AccountSummary-AccountSummaryScreen-AccountPolicyPeriodsLV-1-ReinstatementDate']", AI = false)
	private WebElement inpReinstatementDate_15;

	@IFindBy(how = How.CSS, using = "#AccountSummary-AccountSummaryScreen-AccountPolicyPeriodsLV-0-CancellationDate_dateIcon", AI = false)
	private WebElement btnCancellationDateDateIcon;

	@IFindBy(how = How.CSS, using = "input[name='AccountSummary-AccountSummaryScreen-NoteSubject']", AI = false)
	private WebElement inpSubject;

	@IFindBy(how = How.CSS, using = "input[name='AccountSummary-AccountSummaryScreen-AccountPolicyPeriodsLV-1-IsPastDue']", AI = false)
	private WebElement rdbIsPastDue_5;

	@IFindBy(how = How.CSS, using = "input[name='AccountSummary-AccountSummaryScreen-AccountPolicyPeriodsLV-1-CancellationDate']", AI = false)
	private WebElement inpCancellationDate_13;

	@IFindBy(how = How.CSS, using = "#AccountSummary-AccountSummaryScreen-PastDueIcon", AI = false)
	private WebElement btnPastDueIcon;

	@IFindBy(how = How.CSS, using = "input[name='AccountSummary-AccountSummaryScreen-SendInvoicesBy']", AI = false)
	private WebElement inpSendInvoicesBy;

	@IFindBy(how = How.CSS, using = "input[name='AccountSummary-AccountSummaryScreen-PayoffAmount']", AI = false)
	private WebElement inpPayoffAmount;

	@IFindBy(how = How.CSS, using = "#AccountSummary-AccountSummaryScreen-AccountDetailSummary_DelinquencyAlertAlertBar .gw-AlertBar--label", AI = false)
	private WebElement lblAccountDetailSummary_DelinquencyAlertAlertBar;

	@IFindBy(how = How.CSS, using = "input[name='AccountSummary-AccountSummaryScreen-AccountPolicyPeriodsLV-0-Product']", AI = false)
	private WebElement rdbProduct;

	@IFindBy(how = How.CSS, using = "input[name='AccountSummary-AccountSummaryScreen-NoteTopic']", AI = false)
	private WebElement inpTopic;

	@IFindBy(how = How.CSS, using = "#AccountSummary-AccountSummaryScreen-LateFees-ReverseLateFeeAction>div[role='menuitem']", AI = false)
	private WebElement btnReverse;

	@IFindBy(how = How.CSS, using = "#AccountSummary-AccountSummaryScreen-BillingMethodText", AI = false)
	private WebElement btnEachpolicyisbilledseparately;

	@IFindBy(how = How.CSS, using = "#AccountSummary-AccountSummaryScreen-AccountPolicyPeriodsLV-0-PolicyPerExpirDate_dateIcon", AI = false)
	private WebElement btnExpirationDateDateIcon;

	@IFindBy(how = How.CSS, using = "#AccountSummary-AccountSummaryScreen-AccountPolicyPeriodsLV-0-PolicyPerEffDate_dateIcon", AI = false)
	private WebElement btnEffectiveDateDateIcon;

	@IFindBy(how = How.CSS, using = "input[name='AccountSummary-AccountSummaryScreen-Address']", AI = false)
	private WebElement inpAddress;

	@IFindBy(how = How.CSS, using = "input[name='AccountSummary-AccountSummaryScreen-AccountPolicyPeriodsLV-0-IsPastDue']", AI = false)
	private WebElement rdbIsPastDue;

	@IFindBy(how = How.CSS, using = "input[name='AccountSummary-AccountSummaryScreen-NoteDate']", AI = false)
	private WebElement inpDate;

	@IFindBy(how = How.CSS, using = "input[name='AccountSummary-AccountSummaryScreen-AccountPolicyPeriodsLV-1-InsuredName']", AI = false)
	private WebElement inpNamedInsured_8;

	@IFindBy(how = How.CSS, using = "#AccountSummary-AccountSummaryScreen-AccountPolicyPeriodsLV-1-CancellationDate_dateIcon", AI = false)
	private WebElement btnCancellationDateDateIcon_14;

	@IFindBy(how = How.CSS, using = "#AccountSummary-AccountSummaryScreen-DelinquencyFlag", AI = false)
	private WebElement btnDelinquencyFlag;

	@IFindBy(how = How.CSS, using = "select[name='AccountSummary-AccountSummaryScreen-AccountPolicyPeriodsLV-PolicyPeriodFilter']", AI = false)
	private WebElement drpPolicyPeriodFilter_3;

	@IFindBy(how = How.CSS, using = "input[name='AccountSummary-AccountSummaryScreen-Name']", AI = false)
	private WebElement inpName;

	@IFindBy(how = How.CSS, using = "#AccountSummary-AccountSummaryScreen-InfoIcon", AI = false)
	private WebElement btnInfoIcon;

	@IFindBy(how = How.CSS, using = "input[name='AccountSummary-AccountSummaryScreen-AccountPolicyPeriodsLV-1-PolicyPerExpirDate']", AI = false)
	private WebElement inpExpirationDate_11;

	@IFindBy(how = How.CSS, using = "#AccountSummary-AccountSummaryScreen-AccountSinceValue", AI = false)
	private WebElement btnThisMonthApr12023;

	@IFindBy(how = How.CSS, using = "input[name='AccountSummary-AccountSummaryScreen-PaymentMethod']", AI = false)
	private WebElement inpPaymentInstrument;

	@IFindBy(how = How.CSS, using = "#AccountSummary-AccountSummaryScreen-LateFees-WriteoffLateFeeAction>div[role='menuitem']", AI = false)
	private WebElement btnWriteoffLateFeeAction;

	@IFindBy(how = How.CSS, using = "input[name='AccountSummary-AccountSummaryScreen-PrimaryContact']", AI = false)
	private WebElement inpPrimaryContact;

	@IFindBy(how = How.CSS, using = "input[name='AccountSummary-AccountSummaryScreen-AccountPolicyPeriodsLV-0-InsuredName']", AI = false)
	private WebElement inpNamedInsured;

	@IFindBy(how = How.CSS, using = "select[name='AccountSummary-AccountSummaryScreen-AccountPolicyPeriodsLV-PolicyPeriodFilter']", AI = false)
	private WebElement drpPolicyPeriodFilter;

	@IFindBy(how = How.CSS, using = "#AccountSummary-AccountSummaryScreen-NotesAddIcon", AI = false)
	private WebElement btnNotesAddIcon;

	@IFindBy(how = How.CSS, using = "input[name='AccountSummary-AccountSummaryScreen-AccountPolicyPeriodsLV-1-PolicyPerEffDate']", AI = false)
	private WebElement inpEffectiveDate_9;

	@IFindBy(how = How.CSS, using = "input[name='AccountSummary-AccountSummaryScreen-NoteLink']", AI = false)
	private WebElement inpNoteLink;

	@IFindBy(how = How.CSS, using = "#AccountSummary-AccountSummaryScreen-AccountPolicyPeriodsLV-0-ReinstatementDate_dateIcon", AI = false)
	private WebElement btnReinstatementDateDateIcon;

	@IFindBy(how = How.CSS, using = "input[name='AccountSummary-AccountSummaryScreen-LateFees']", AI = false)
	private WebElement inpLateFees;

	@IFindBy(how = How.CSS, using = "#AccountSummary-AccountSummaryScreen-AccountInfoText", AI = false)
	private WebElement btnAccountInfoText;

	@IFindBy(how = How.CSS, using = "#AccountSummary-AccountSummaryScreen-NotesTitle", AI = false)
	private WebElement btnNotes;

	@IFindBy(how = How.CSS, using = "input[name='AccountSummary-AccountSummaryScreen-AccountPolicyPeriodsLV-0-PolicyPerEffDate']", AI = false)
	private WebElement inpEffectiveDate;

	@IFindBy(how = How.CSS, using = "input[name='AccountSummary-AccountSummaryScreen-AccountPolicyPeriodsLV-0-TotalValue']", AI = false)
	private WebElement inpTotalValue;

	@IFindBy(how = How.CSS, using = "input[name='AccountSummary-AccountSummaryScreen-AccountPolicyPeriodsLV-0-IsActive']", AI = false)
	private WebElement rdbIsActive;

	@IFindBy(how = How.CSS, using = "input[name='AccountSummary-AccountSummaryScreen-BlankSpacer2']", AI = false)
	private WebElement inpBlankSpacer2;

	@IFindBy(how = How.CSS, using = "input[name='AccountSummary-AccountSummaryScreen-AccountPolicyPeriodsLV-0-ReinstatementDate']", AI = false)
	private WebElement inpReinstatementDate;

	@IFindBy(how = How.CSS, using = "#AccountSummary-AccountSummaryScreen-PastDueAmount", AI = false)
	private WebElement btnPastDueAmount;

	@IFindBy(how = How.CSS, using = "input[name='AccountSummary-AccountSummaryScreen-AccountPolicyPeriodsLV-0-PolicyNumber']", AI = false)
	private WebElement inpPolicy;

	@IFindBy(how = How.CSS, using = "input[name='AccountSummary-AccountSummaryScreen-AccountPolicyPeriodsLV-1-TotalValue']", AI = false)
	private WebElement inpTotalValue_17;

	@IFindBy(how = How.CSS, using = "#AccountSummary-AccountSummaryScreen-NotesEditIcon", AI = false)
	private WebElement btnNotesEditIcon;

	@IFindBy(how = How.CSS, using = "#AccountSummary-AccountSummaryScreen-NotesNoneDesc", AI = false)
	private WebElement btnTherearenonotesonthisaccount;

	@IFindBy(how = How.CSS, using = "#AccountSummary-AccountSummaryScreen-CloseAccountButton>div[role='button']", AI = false)
	private WebElement btnCloseAccount;

	@IFindBy(how = How.CSS, using = "input[name='AccountSummary-AccountSummaryScreen-ActivePolicies']", AI = false)
	private WebElement inpActivePolicies;

	@IFindBy(how = How.CSS, using = "input[name='AccountSummary-AccountSummaryScreen-AccountPolicyPeriodsLV-1-PolicyNumber']", AI = false)
	private WebElement inpPolicy_7;

	@IFindBy(how = How.CSS, using = "#AccountSummary-AccountSummaryScreen-AccountPolicyPeriodsLV-1-PolicyPerExpirDate_dateIcon", AI = false)
	private WebElement btnExpirationDateDateIcon_12;

	@IFindBy(how = How.CSS, using = "input[name='AccountSummary-AccountSummaryScreen-Suspense']", AI = false)
	private WebElement inpSuspenseItemAmount;

	@IFindBy(how = How.CSS, using = "#AccountSummary-AccountSummaryScreen-BillingMethodIcon", AI = false)
	private WebElement btnBillingMethodIcon;

	@IFindBy(how = How.CSS, using = "#AccountSummary-AccountSummaryScreen-ttlBar", AI = false)
	private WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "#AccountSummary-AccountSummaryScreen-description", AI = false)
	private WebElement btn1in12months;

	@IFindBy(how = How.CSS, using = "#AccountSummary-AccountSummaryScreen-AccountDetailSummary_TroubleTicketAlertAlertBar .gw-AlertBar--label", AI = false)
	private WebElement lblDependentonRender;

	@IFindBy(how = How.CSS, using = "#AccountSummary-AccountSummaryScreen-NoteText textarea", AI = false)
	private WebElement inpText;

	@IFindBy(how = How.CSS, using = "input[name='AccountSummary-AccountSummaryScreen-Phone']", AI = false)
	private WebElement inpPhoneEmail;

	@IFindBy(how = How.CSS, using = "input[name='AccountSummary-AccountSummaryScreen-AccountUnappliedAmount']", AI = false)
	private WebElement inpDefaultUnapplied;

	@IFindBy(how = How.CSS, using = "#AccountSummary-AccountSummaryScreen-LateFees-LateFeesMenuIcon>div[role='button']", AI = false)
	private WebElement btnLateFeesMenuIcon;

	@IFindBy(how = How.CSS, using = "input[name='AccountSummary-AccountSummaryScreen-NumPlannedInvoices']", AI = false)
	private WebElement inpPlannedInvoices;

	@IFindBy(how = How.CSS, using = "#AccountSummary-AccountSummaryScreen-AccountDetailSummary_TroubleTicketAlertAlertBar-CloseBtn", AI = false)
	private WebElement btnClose;

	@IFindBy(how = How.CSS, using = "input[name='AccountSummary-AccountSummaryScreen-LastPaymentReceived']", AI = false)
	private WebElement inpLastPaymentReceived;

	@IFindBy(how = How.CSS, using = "input[name='AccountSummary-AccountSummaryScreen-TotalUnappliedAmount']", AI = false)
	private WebElement inpTotalUnapplied;

	@IFindBy(how = How.CSS, using = "input[name='AccountSummary-AccountSummaryScreen-AccountPolicyPeriodsLV-0-CancellationDate']", AI = false)
	private WebElement inpCancellationDate;

	@IFindBy(how = How.CSS, using = "input[name='AccountSummary-AccountSummaryScreen-ExpectedPayment']", AI = false)
	private WebElement inpCurrentPaymentExpected;

	@IFindBy(how = How.CSS, using = "input[name='AccountSummary-AccountSummaryScreen-NextInvoiceDue']", AI = false)
	private WebElement inpNextInvoiceDue;

	@IFindBy(how = How.CSS, using = "#AccountSummary-AccountSummaryScreen-ServiceTierIcon", AI = false)
	private WebElement btnServiceTierIcon;

	@IFindBy(how = How.CSS, using = "select[name='AccountSummary-AccountSummaryScreen-Currency']", AI = false)
	private WebElement drpCurrency;

	@IFindBy(how = How.CSS, using = "#AccountSummary-AccountSummaryScreen-AccountPolicyPeriodsLV-1-ReinstatementDate_dateIcon", AI = false)
	private WebElement btnReinstatementDateDateIcon_16;

	@IFindBy(how = How.CSS, using = "#AccountSummary-AccountSummaryScreen-AccountPolicyPeriodsLV-1-PolicyPerEffDate_dateIcon", AI = false)
	private WebElement btnEffectiveDateDateIcon_10;

	@IFindBy(how = How.CSS, using = "div[id$='LastPaymentReceived']", AI = false)
	private WebElement lblAmount;

	@IFindBy(how = How.CSS, using = "div[id='gw-center-title-toolbar'] div[id$='AccountSummaryScreen-ttlBar']", AI = false)
	private WebElement ttlAccountSummary;//div[id$='AccountSummaryScreen-ttlBar']

	@IFindBy(how = How.CSS, using = "div[id*='TotalUnappliedAmount']", AI = false)
	private WebElement lblTotalUnappliedAmount;//div[id$='TotalUnappliedAmount_button']
	
	@IFindBy(how = How.CSS, using = "div[data-gw-chart-series*='Written']", AI = false)
	private WebElement lblWriitenOff;
	
	@IFindBy(how = How.CSS, using = "div[id$='AccountDetailSummary_DelinquencyAlertAlertBar-label']", AI = false)
	private WebElement lblDeliquency;
	
	public AccountSummaryPage(){
	}

	public AccountSummaryPage(WebDriver driver){
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(finder, this);
		//		accountsummaryscreenTable = new AccountSummaryScreen();
	}
	@Override
	protected void load() {
		isPageLoaded = true;
		WaitUtils.waitForPageLoad(driver);
	}@Override
	protected void isLoaded() {
		if (!isPageLoaded) {
			Assert.fail();
		}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, ttlAccountSummary))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);
	}public AccountSummaryPage clickNotesNoneIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnNotesNoneIcon,"NotesNoneIcon");
		return this;
	}
	public AccountSummaryPage clickIsActive_6(WebDriver driver)  {
		BrowserActions.click(driver, rdbIsActive_6,"IsActive_6");
		return this;
	}
	public AccountSummaryPage enterExpirationDate(WebDriver driver,String ExpirationDate) {
		BrowserActions.type(driver, inpExpirationDate,ExpirationDate, "ExpirationDate");
		return this;
	}
	public AccountSummaryPage clickDateDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnDateDateIcon,"DateDateIcon");
		return this;
	}
	public AccountSummaryPage clickClose_2(WebDriver driver)  {
		BrowserActions.click(driver, btnClose_2,"Close_2");
		return this;
	}
	public AccountSummaryPage clickClose_1(WebDriver driver)  {
		BrowserActions.click(driver, btnClose_1,"Close_1");
		return this;
	}
	public AccountSummaryPage clickStartDelinquency(WebDriver driver)  {
		BrowserActions.click(driver, btnStartDelinquency,"StartDelinquency");
		return this;
	}
	public AccountSummaryPage clickProduct_4(WebDriver driver)  {
		BrowserActions.click(driver, rdbProduct_4,"Product_4");
		return this;
	}
	public AccountSummaryPage enterReinstatementDate_15(WebDriver driver,String ReinstatementDate_15) {
		BrowserActions.type(driver, inpReinstatementDate_15,ReinstatementDate_15, "ReinstatementDate_15");
		return this;
	}
	public AccountSummaryPage clickCancellationDateDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnCancellationDateDateIcon,"CancellationDateDateIcon");
		return this;
	}
	public AccountSummaryPage enterSubject(WebDriver driver,String Subject) {
		BrowserActions.type(driver, inpSubject,Subject, "Subject");
		return this;
	}
	public AccountSummaryPage clickIsPastDue_5(WebDriver driver)  {
		BrowserActions.click(driver, rdbIsPastDue_5,"IsPastDue_5");
		return this;
	}
	public AccountSummaryPage enterCancellationDate_13(WebDriver driver,String CancellationDate_13) {
		BrowserActions.type(driver, inpCancellationDate_13,CancellationDate_13, "CancellationDate_13");
		return this;
	}
	public AccountSummaryPage clickPastDueIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnPastDueIcon,"PastDueIcon");
		return this;
	}
	public AccountSummaryPage enterSendInvoicesBy(WebDriver driver,String SendInvoicesBy) {
		BrowserActions.type(driver, inpSendInvoicesBy,SendInvoicesBy, "SendInvoicesBy");
		return this;
	}
	public AccountSummaryPage enterPayoffAmount(WebDriver driver,String PayoffAmount) {
		BrowserActions.type(driver, inpPayoffAmount,PayoffAmount, "PayoffAmount");
		return this;
	}
	public AccountSummaryPage clickProduct(WebDriver driver)  {
		BrowserActions.click(driver, rdbProduct,"Product");
		return this;
	}
	public AccountSummaryPage enterTopic(WebDriver driver,String Topic) {
		BrowserActions.type(driver, inpTopic,Topic, "Topic");
		return this;
	}
	public AccountSummaryPage clickReverse(WebDriver driver)  {
		BrowserActions.click(driver, btnReverse,"Reverse");
		return this;
	}
	public AccountSummaryPage clickEachpolicyisbilledseparately(WebDriver driver)  {
		BrowserActions.click(driver, btnEachpolicyisbilledseparately,"Eachpolicyisbilledseparately");
		return this;
	}
	public AccountSummaryPage clickExpirationDateDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnExpirationDateDateIcon,"ExpirationDateDateIcon");
		return this;
	}
	public AccountSummaryPage clickEffectiveDateDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnEffectiveDateDateIcon,"EffectiveDateDateIcon");
		return this;
	}
	public AccountSummaryPage enterAddress(WebDriver driver,String Address) {
		BrowserActions.type(driver, inpAddress,Address, "Address");
		return this;
	}
	public AccountSummaryPage clickIsPastDue(WebDriver driver)  {
		BrowserActions.click(driver, rdbIsPastDue,"IsPastDue");
		return this;
	}
	public AccountSummaryPage enterDate(WebDriver driver,String Date) {
		BrowserActions.type(driver, inpDate,Date, "Date");
		return this;
	}
	public AccountSummaryPage enterNamedInsured_8(WebDriver driver,String NamedInsured_8) {
		BrowserActions.type(driver, inpNamedInsured_8,NamedInsured_8, "NamedInsured_8");
		return this;
	}
	public AccountSummaryPage clickCancellationDateDateIcon_14(WebDriver driver)  {
		BrowserActions.click(driver, btnCancellationDateDateIcon_14,"CancellationDateDateIcon_14");
		return this;
	}
	public AccountSummaryPage clickDelinquencyFlag(WebDriver driver)  {
		BrowserActions.click(driver, btnDelinquencyFlag,"DelinquencyFlag");
		return this;
	}
	public AccountSummaryPage selectPolicyPeriodFilter_3(WebDriver driver,String PolicyPeriodFilter_3)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPolicyPeriodFilter_3,PolicyPeriodFilter_3,"PolicyPeriodFilter_3");
		return this;
	}
	public AccountSummaryPage enterName(WebDriver driver,String Name) {
		BrowserActions.type(driver, inpName,Name, "Name");
		return this;
	}
	public AccountSummaryPage clickInfoIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnInfoIcon,"InfoIcon");
		return this;
	}
	public AccountSummaryPage enterExpirationDate_11(WebDriver driver,String ExpirationDate_11) {
		BrowserActions.type(driver, inpExpirationDate_11,ExpirationDate_11, "ExpirationDate_11");
		return this;
	}
	public AccountSummaryPage clickThisMonthApr12023(WebDriver driver)  {
		BrowserActions.click(driver, btnThisMonthApr12023,"ThisMonthApr12023");
		return this;
	}
	public AccountSummaryPage enterPaymentInstrument(WebDriver driver,String PaymentInstrument) {
		BrowserActions.type(driver, inpPaymentInstrument,PaymentInstrument, "PaymentInstrument");
		return this;
	}
	public AccountSummaryPage clickWriteoffLateFeeAction(WebDriver driver)  {
		BrowserActions.click(driver, btnWriteoffLateFeeAction,"WriteoffLateFeeAction");
		return this;
	}
	public AccountSummaryPage enterPrimaryContact(WebDriver driver,String PrimaryContact) {
		BrowserActions.type(driver, inpPrimaryContact,PrimaryContact, "PrimaryContact");
		return this;
	}
	public AccountSummaryPage enterNamedInsured(WebDriver driver,String NamedInsured) {
		BrowserActions.type(driver, inpNamedInsured,NamedInsured, "NamedInsured");
		return this;
	}
	public AccountSummaryPage selectPolicyPeriodFilter(WebDriver driver,String PolicyPeriodFilter)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPolicyPeriodFilter,PolicyPeriodFilter,"PolicyPeriodFilter");
		return this;
	}
	public AccountSummaryPage clickNotesAddIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnNotesAddIcon,"NotesAddIcon");
		return this;
	}
	public AccountSummaryPage enterEffectiveDate_9(WebDriver driver,String EffectiveDate_9) {
		BrowserActions.type(driver, inpEffectiveDate_9,EffectiveDate_9, "EffectiveDate_9");
		return this;
	}
	public AccountSummaryPage enterNoteLink(WebDriver driver,String NoteLink) {
		BrowserActions.type(driver, inpNoteLink,NoteLink, "NoteLink");
		return this;
	}
	public AccountSummaryPage clickReinstatementDateDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnReinstatementDateDateIcon,"ReinstatementDateDateIcon");
		return this;
	}
	public AccountSummaryPage enterLateFees(WebDriver driver,String LateFees) {
		BrowserActions.type(driver, inpLateFees,LateFees, "LateFees");
		return this;
	}
	public AccountSummaryPage clickAccountInfoText(WebDriver driver)  {
		BrowserActions.click(driver, btnAccountInfoText,"AccountInfoText");
		return this;
	}
	public AccountSummaryPage clickNotes(WebDriver driver)  {
		BrowserActions.click(driver, btnNotes,"Notes");
		return this;
	}
	public AccountSummaryPage enterEffectiveDate(WebDriver driver,String EffectiveDate) {
		BrowserActions.type(driver, inpEffectiveDate,EffectiveDate, "EffectiveDate");
		return this;
	}
	public AccountSummaryPage enterTotalValue(WebDriver driver,String TotalValue) {
		BrowserActions.type(driver, inpTotalValue,TotalValue, "TotalValue");
		return this;
	}
	public AccountSummaryPage clickIsActive(WebDriver driver)  {
		BrowserActions.click(driver, rdbIsActive,"IsActive");
		return this;
	}
	public AccountSummaryPage enterBlankSpacer2(WebDriver driver,String BlankSpacer2) {
		BrowserActions.type(driver, inpBlankSpacer2,BlankSpacer2, "BlankSpacer2");
		return this;
	}
	public AccountSummaryPage enterReinstatementDate(WebDriver driver,String ReinstatementDate) {
		BrowserActions.type(driver, inpReinstatementDate,ReinstatementDate, "ReinstatementDate");
		return this;
	}
	public AccountSummaryPage clickPastDueAmount(WebDriver driver)  {
		BrowserActions.click(driver, btnPastDueAmount,"PastDueAmount");
		return this;
	}
	public AccountSummaryPage enterPolicy(WebDriver driver,String Policy) {
		BrowserActions.type(driver, inpPolicy,Policy, "Policy");
		return this;
	}
	public AccountSummaryPage enterTotalValue_17(WebDriver driver,String TotalValue_17) {
		BrowserActions.type(driver, inpTotalValue_17,TotalValue_17, "TotalValue_17");
		return this;
	}
	public AccountSummaryPage clickNotesEditIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnNotesEditIcon,"NotesEditIcon");
		return this;
	}
	public AccountSummaryPage clickTherearenonotesonthisaccount(WebDriver driver)  {
		BrowserActions.click(driver, btnTherearenonotesonthisaccount,"Therearenonotesonthisaccount");
		return this;
	}
	public AccountSummaryPage clickCloseAccount(WebDriver driver)  {
		BrowserActions.click(driver, btnCloseAccount,"CloseAccount");
		return this;
	}
	public AccountSummaryPage enterActivePolicies(WebDriver driver,String ActivePolicies) {
		BrowserActions.type(driver, inpActivePolicies,ActivePolicies, "ActivePolicies");
		return this;
	}
	public AccountSummaryPage enterPolicy_7(WebDriver driver,String Policy_7) {
		BrowserActions.type(driver, inpPolicy_7,Policy_7, "Policy_7");
		return this;
	}
	public AccountSummaryPage clickExpirationDateDateIcon_12(WebDriver driver)  {
		BrowserActions.click(driver, btnExpirationDateDateIcon_12,"ExpirationDateDateIcon_12");
		return this;
	}
	public AccountSummaryPage enterSuspenseItemAmount(WebDriver driver,String SuspenseItemAmount) {
		BrowserActions.type(driver, inpSuspenseItemAmount,SuspenseItemAmount, "SuspenseItemAmount");
		return this;
	}
	public AccountSummaryPage clickBillingMethodIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnBillingMethodIcon,"BillingMethodIcon");
		return this;
	}
	public AccountSummaryPage click1in12months(WebDriver driver)  {
		BrowserActions.click(driver, btn1in12months,"1in12months");
		return this;
	}
	public AccountSummaryPage enterText(WebDriver driver,String Text) {
		BrowserActions.type(driver, inpText,Text, "Text");
		return this;
	}
	public AccountSummaryPage enterPhoneEmail(WebDriver driver,String PhoneEmail) {
		BrowserActions.type(driver, inpPhoneEmail,PhoneEmail, "PhoneEmail");
		return this;
	}
	public AccountSummaryPage enterDefaultUnapplied(WebDriver driver,String DefaultUnapplied) {
		BrowserActions.type(driver, inpDefaultUnapplied,DefaultUnapplied, "DefaultUnapplied");
		return this;
	}
	public AccountSummaryPage clickLateFeesMenuIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnLateFeesMenuIcon,"LateFeesMenuIcon");
		return this;
	}
	public AccountSummaryPage enterPlannedInvoices(WebDriver driver,String PlannedInvoices) {
		BrowserActions.type(driver, inpPlannedInvoices,PlannedInvoices, "PlannedInvoices");
		return this;
	}
	public AccountSummaryPage clickClose(WebDriver driver)  {
		BrowserActions.click(driver, btnClose,"Close");
		return this;
	}
	public AccountSummaryPage enterLastPaymentReceived(WebDriver driver,String LastPaymentReceived) {
		BrowserActions.type(driver, inpLastPaymentReceived,LastPaymentReceived, "LastPaymentReceived");
		return this;
	}
	public AccountSummaryPage enterTotalUnapplied(WebDriver driver,String TotalUnapplied) {
		BrowserActions.type(driver, inpTotalUnapplied,TotalUnapplied, "TotalUnapplied");
		return this;
	}
	public AccountSummaryPage enterCancellationDate(WebDriver driver,String CancellationDate) {
		BrowserActions.type(driver, inpCancellationDate,CancellationDate, "CancellationDate");
		return this;
	}
	public AccountSummaryPage enterCurrentPaymentExpected(WebDriver driver,String CurrentPaymentExpected) {
		BrowserActions.type(driver, inpCurrentPaymentExpected,CurrentPaymentExpected, "CurrentPaymentExpected");
		return this;
	}
	public AccountSummaryPage enterNextInvoiceDue(WebDriver driver,String NextInvoiceDue) {
		BrowserActions.type(driver, inpNextInvoiceDue,NextInvoiceDue, "NextInvoiceDue");
		return this;
	}
	public AccountSummaryPage clickServiceTierIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnServiceTierIcon,"ServiceTierIcon");
		return this;
	}
	public AccountSummaryPage selectCurrency(WebDriver driver,String Currency)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCurrency,Currency,"Currency");
		return this;
	}
	public AccountSummaryPage clickReinstatementDateDateIcon_16(WebDriver driver)  {
		BrowserActions.click(driver, btnReinstatementDateDateIcon_16,"ReinstatementDateDateIcon_16");
		return this;
	}
	public AccountSummaryPage clickEffectiveDateDateIcon_10(WebDriver driver)  {
		BrowserActions.click(driver, btnEffectiveDateDateIcon_10,"EffectiveDateDateIcon_10");
		return this;
	}
	public AccountSummaryPage verifyAmountIsPresent(WebDriver driver,String amount)  {
		//BrowserActions.waitForElementToDisplay(driver, lblAmount, 2);
		String text = BrowserActions.getText(driver, lblAmount,"Amount");
		String amountString  = text.replaceAll("\\$|\\.00|,", "");
		Log.assertThat(amount.equals(amountString), "Entered Amount is verified", "Entered Amount is not verified, Actual: "+amountString+" Expected: "+amount, driver);
		return this;
	}
	public int getunappliedAmount(WebDriver driver) {
		String text = BrowserActions.getText(driver, lblTotalUnappliedAmount,"Unapplied amount");
		int amountInt = getAmountInNumerics(driver, text);
		return amountInt;
	}
	public void verifyTotalUnapliedFundForCredit(WebDriver driver,int initialAmount,String finalAmount)  {
		String text = BrowserActions.getText(driver, lblTotalUnappliedAmount,"Unapplied amount");
		int amountTotal = getAmountInNumerics(driver, text);
		int amountFinal = Integer.parseInt(finalAmount);
		Log.assertThat(amountTotal==initialAmount+amountFinal, "Total unapplied fund is verified", "Total unapplied fund is not verified",driver);
	}
	public void verifyTotalUnapliedFundForCreditReversal(WebDriver driver,int initialAmount,String finalAmount)  {
		String text = BrowserActions.getText(driver, lblTotalUnappliedAmount,"Unapplied amount");
		int amountTotal = getAmountInNumerics(driver, text);
		int amountFinal = Integer.parseInt(finalAmount);
		Log.assertThat(amountTotal==initialAmount-amountFinal, "Total unapplied fund is verified", "Total unapplied fund is not verified", driver);
	}
	public int getWrittenOffAmount(WebDriver driver)  {
		String text = BrowserActions.getText(driver, lblWriitenOff,"Unapplied amount");
		int amount = getAmountInNumerics(driver, text);
		return amount;
	}
	public void verifyWrittenOffAmount(WebDriver driver,int initialAmount,String amount)  {
		String text = BrowserActions.getText(driver, lblWriitenOff,"Unapplied amount");
		int totalAmount = getAmountInNumerics(driver, text);
		double amountDouble = Double.parseDouble(amount);
		int amountFinal= (int)amountDouble;
		Log.assertThat(totalAmount==initialAmount+amountFinal, "Wriiten off amount is verified", "TWritten off amount is not verified",driver);
	}
	public void verifyWrittenOffReversalAmount(WebDriver driver,int initialAmount,String amount)  {
		String text = BrowserActions.getText(driver, lblWriitenOff,"Unapplied amount");
		int totalAmount = getAmountInNumerics(driver, text);
		double amountDouble = Double.parseDouble(amount);
		int amountFinal= (int)amountDouble;
		Log.assertThat(totalAmount==initialAmount-amountFinal, "Written off Reversal amount is verified", "Written off Reversal amount is not verified",driver);
	}
	
	public int getAmountInNumerics(WebDriver driver, String text) {
		String amountText = text.replaceAll("[^0-9]", "");
		StringBuffer sb= new StringBuffer(amountText);  
		StringBuffer deleteCharAt2 = sb.deleteCharAt(sb.length()-1);  
		String string = deleteCharAt2.toString();
		int amount = Integer.parseInt(string);
		return amount;
	}
	
	public AccountSummaryPage clickDeliquency(WebDriver driver)  {
		BrowserActions.click(driver, lblDeliquency,"Deliquncy lable");
		return this;
	}
	public void verifyTotalUnapliedFundForCreditIsAdded(WebDriver driver,String amount)  {
		new AccountSummaryPage(driver).get();
	//	BrowserActions.waitForElementToDisplay(driver, lblTotalUnappliedAmount, 2);
		String text = BrowserActions.getText(driver, lblTotalUnappliedAmount,"Unapplied amount");
		String amountString  = text.replaceAll("\\$|\\.00", "");
		Log.assertThat(amount.equals(amountString), "Entered Amount is verified", "Entered Amount is not verified",driver);
	}
	public int getActualWriteOff(WebDriver driver)  {
		String text = BrowserActions.getText(driver, lblWriitenOff,"Unapplied amount");
		String amountText = text.replaceAll("[^0-9]", "");
		  if (!amountText.isEmpty()) {
	            amountText = amountText.substring(0, amountText.length() - 2);
	        }
	        int amount = Integer.parseInt(amountText);

			return amount;
	}
	public int verifyWrittenOffAmountVal(WebDriver driver)  {
		//BrowserActions.waitForElementToDisplay(driver, lblWriitenOff, 2);
		String text = BrowserActions.getText(driver, lblWriitenOff,"Unapplied amount");
		String amountText = text.replaceAll("[^0-9]", "");
		  if (!amountText.isEmpty()) {
	            amountText = amountText.substring(0, amountText.length() - 2);
	        }
	        int amount = Integer.parseInt(amountText);

			return amount;
	}
	
	public void verifyAmountValue(WebDriver driver, int val , int initialAmount, String amount ) {
		double amountDouble = Double.parseDouble(amount);
		int amountFinal= (int)amountDouble;
		Log.assertThat(val==initialAmount+amountFinal, "Wriiten off amount is Added successfully", "Written off amount is not Added",driver);
	}
	public int getUnappliedAmt(WebDriver driver)  {
		//BrowserActions.waitForElementToDisplay(driver, lblTotalUnappliedAmount, 2);
		String text = BrowserActions.getText(driver, lblTotalUnappliedAmount,"Unapplied amount");
		String amountText = text.replaceAll("[^0-9]", "");
		if (!amountText.isEmpty()) {
			amountText = amountText.substring(0, amountText.length() - 2);
		}
		int unappliedAmt = Integer.parseInt(amountText);
		
		return unappliedAmt;
	}
	public void verifyReversalAmount(WebDriver driver, int val , int initialAmount, String amount ) {
		double amountDouble = Double.parseDouble(amount);
		int amountFinal= (int)amountDouble;
		Log.assertThat(val==initialAmount-amountFinal, "Wriiten off amount is Reversed successfully", "Written off amount is not Reversed",driver);
	}
	
}
