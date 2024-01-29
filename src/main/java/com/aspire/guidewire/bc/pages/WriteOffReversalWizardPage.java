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

public class WriteOffReversalWizardPage extends LoadableComponent<WriteOffReversalWizardPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
//	public TopNavBar topnavbar;
	@IFindBy(how = How.CSS, using = "select[name='AccountNewWriteoffReversalWizard-NewWriteoffReversalAccountWriteoffsScreen-WriteoffSearchDV-ChargePatternCriterion']", AI = false)
	private WebElement drpChargePattern;

	@IFindBy(how = How.CSS, using = "#AccountNewWriteoffReversalWizard-NewWriteoffReversalAccountWriteoffsScreen-ttlBar", AI = false)
	private WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "input[name='AccountNewWriteoffReversalWizard-NewWriteoffReversalAccountWriteoffsScreen-WriteoffSourceDV-Writeoff']", AI = false)
	private WebElement inpSelectedWriteOff;

	@IFindBy(how = How.CSS, using = "#AccountNewWriteoffReversalWizard-Step2>div[role='menuitem']", AI = false)
	private WebElement btnConfirmation;

	@IFindBy(how = How.CSS, using = "#AccountNewWriteoffReversalWizard-NewWriteoffReversalAccountWriteoffsScreen-WriteoffSearchDV-LatestDateCriterion_dateIcon", AI = false)
	private WebElement btnLatestDateDateIcon;

	@IFindBy(how = How.CSS, using = "input[name='AccountNewWriteoffReversalWizard-NewWriteoffReversalAccountWriteoffsScreen-WriteoffSearchDV-EarliestDateCriterion']", AI = false)
	private WebElement inpEarliestDate;

	@IFindBy(how = How.CSS, using = "input[name='AccountNewWriteoffReversalWizard-NewWriteoffReversalAccountWriteoffsScreen-WriteoffSearchDV-MaxAmountCriterion']", AI = false)
	private WebElement inpMaximumAmount;

	@IFindBy(how = How.CSS, using = "input[name='AccountNewWriteoffReversalWizard-NewWriteoffReversalAccountWriteoffsScreen-WriteoffSearchDV-AccountCriterion']", AI = false)
	private WebElement inpAccount;

	@IFindBy(how = How.CSS, using = "#AccountNewWriteoffReversalWizard-NewWriteoffReversalAccountWriteoffsScreen-WriteoffSearchDV-EarliestDateCriterion_dateIcon", AI = false)
	private WebElement btnEarliestDateDateIcon;

	@IFindBy(how = How.CSS, using = "#AccountNewWriteoffReversalWizard-Finish>div[role='button']", AI = false)
	private WebElement btnFinish;

	@IFindBy(how = How.CSS, using = "input[name='AccountNewWriteoffReversalWizard-NewWriteoffReversalAccountWriteoffsScreen-WriteoffSearchDV-MinAmountCriterion']", AI = false)
	private WebElement inpMinimumAmount;

	@IFindBy(how = How.CSS, using = "input[name='AccountNewWriteoffReversalWizard-NewWriteoffReversalAccountWriteoffsScreen-WriteoffSearchDV-LatestDateCriterion']", AI = false)
	private WebElement inpLatestDate;

	@IFindBy(how = How.CSS, using = "#AccountNewWriteoffReversalWizard-Step1>div[role='menuitem']", AI = false)
	private WebElement btnWriteOffSearch;

	@IFindBy(how = How.CSS, using = "#AccountNewWriteoffReversalWizard-Prev>div[role='button']", AI = false)
	private WebElement btnBack;

	@IFindBy(how = How.CSS, using = "input[name='AccountNewWriteoffReversalWizard-NewWriteoffReversalAccountWriteoffsScreen-WriteoffSearchDV-PolicyPeriodCriterion']", AI = false)
	private WebElement inpPolicy;

	@IFindBy(how = How.CSS, using = "select[name='AccountNewWriteoffReversalWizard-NewWriteoffReversalAccountWriteoffsScreen-WriteoffSearchDV-ReasonCriterion']", AI = false)
	private WebElement drpReason;
	
	@IFindBy(how = How.CSS, using = "select[name$='Reason']", AI = false)
	private WebElement drpReasonWriteOffReversal;

	@IFindBy(how = How.CSS, using = "#AccountNewWriteoffReversalWizard-NewWriteoffReversalAccountWriteoffsScreen-WriteoffSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Search", AI = false)
	private WebElement btnSearch;

	@IFindBy(how = How.CSS, using = "#AccountNewWriteoffReversalWizard-Next>div[role='button']", AI = false)
	private WebElement btnNext;

	@IFindBy(how = How.CSS, using = "#AccountNewWriteoffReversalWizard-NewWriteoffReversalAccountWriteoffsScreen-WriteoffTab", AI = false)
	private WebElement btnWriteOffs;

	@IFindBy(how = How.CSS, using = "#AccountNewWriteoffReversalWizard-__crumb__", AI = false)
	private WebElement btnReturntoAccountSummary;

	@IFindBy(how = How.CSS, using = "#AccountNewWriteoffReversalWizard-Cancel>div[role='button']", AI = false)
	private WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "select[name='AccountNewWriteoffReversalWizard-NewWriteoffReversalAccountWriteoffsScreen-WriteoffSearchDV-CurrencyCriterion']", AI = false)
	private WebElement drpCurrency;

	@IFindBy(how = How.CSS, using = "#AccountNewWriteoffReversalWizard-NewWriteoffReversalAccountWriteoffsScreen-WriteoffSearchDV-PolicyPeriodCriterion-PolicyPicker", AI = false)
	private WebElement btnPolicyPicker;

	@IFindBy(how = How.CSS, using = "#AccountNewWriteoffReversalWizard-NewWriteoffReversalAccountWriteoffsScreen-WriteoffSearchDV-AccountCriterion-AccountPicker", AI = false)
	private WebElement btnAccountPicker;

	@IFindBy(how = How.CSS, using = "#AccountNewWriteoffReversalWizard-NewWriteoffReversalAccountWriteoffsScreen-WriteoffSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Reset", AI = false)
	private WebElement btnReset;

	@IFindBy(how = How.CSS, using = "input[name='AccountNewWriteoffReversalWizard-NewWriteoffReversalConfirmationScreen-ApprovalActivityDV-TargetDate']", AI = false)
	private WebElement inpTargetDate;

	@IFindBy(how = How.CSS, using = "input[name='AccountNewWriteoffReversalWizard-NewWriteoffReversalConfirmationScreen-NewWriteoffReversalConfirmationDV-TransactionLineItemsLV-0-Date']", AI = false)
	private WebElement inpDate_1;

	@IFindBy(how = How.CSS, using = "input[name='AccountNewWriteoffReversalWizard-NewWriteoffReversalConfirmationScreen-NewWriteoffReversalConfirmationDV-TransactionLineItemsLV-0-Amount']", AI = false)
	private WebElement inpAmount;

	@IFindBy(how = How.CSS, using = "#AccountNewWriteoffReversalWizard-NewWriteoffReversalConfirmationScreen-ApprovalActivityAlertBar .gw-AlertBar--label", AI = false)
	private WebElement lblApprovalActivityAlertBar;

	@IFindBy(how = How.CSS, using = "#AccountNewWriteoffReversalWizard-NewWriteoffReversalConfirmationScreen-NewWriteoffReversalConfirmationDV-TransactionDate_dateIcon", AI = false)
	private WebElement btnDateDateIcon;

	@IFindBy(how = How.CSS, using = "input[name='AccountNewWriteoffReversalWizard-NewWriteoffReversalConfirmationScreen-NewWriteoffReversalConfirmationDV-Description']", AI = false)
	private WebElement inpWriteOff;

	@IFindBy(how = How.CSS, using = "#AccountNewWriteoffReversalWizard-NewWriteoffReversalConfirmationScreen-ApprovalActivityDV-Description textarea", AI = false)
	private WebElement inpDescription;

	@IFindBy(how = How.CSS, using = "input[name='AccountNewWriteoffReversalWizard-NewWriteoffReversalConfirmationScreen-NewWriteoffReversalConfirmationDV-NewWriteoff']", AI = false)
	private WebElement inpWriteOffReversal;

	@IFindBy(how = How.CSS, using = "input[name='AccountNewWriteoffReversalWizard-NewWriteoffReversalConfirmationScreen-NewWriteoffReversalConfirmationDV-TransactionDate']", AI = false)
	private WebElement inpDate;

	@IFindBy(how = How.CSS, using = "input[name='AccountNewWriteoffReversalWizard-NewWriteoffReversalConfirmationScreen-ApprovalActivityDV-EscalationDate']", AI = false)
	private WebElement inpEscalationDate;

	@IFindBy(how = How.CSS, using = "#AccountNewWriteoffReversalWizard-NewWriteoffReversalConfirmationScreen-ApprovalActivityAlertBar-CloseBtn", AI = false)
	private WebElement btnClose;

	@IFindBy(how = How.CSS, using = "input[name='AccountNewWriteoffReversalWizard-NewWriteoffReversalConfirmationScreen-NewWriteoffReversalConfirmationDV-TransactionLineItemsLV-0-Name']", AI = false)
	private WebElement inpName;

	@IFindBy(how = How.CSS, using = "#AccountNewWriteoffReversalWizard-NewWriteoffReversalConfirmationScreen-ApprovalActivityDV-EscalationDate_dateIcon", AI = false)
	private WebElement btnEscalationDateDateIcon;

	@IFindBy(how = How.CSS, using = "input[name='AccountNewWriteoffReversalWizard-NewWriteoffReversalConfirmationScreen-ApprovalActivityDV-Subject']", AI = false)
	private WebElement inpSubject;

	@IFindBy(how = How.CSS, using = "input[name='AccountNewWriteoffReversalWizard-NewWriteoffReversalConfirmationScreen-ApprovalActivityDV-AssignedTo']", AI = false)
	private WebElement inpAssignedTo;

	@IFindBy(how = How.CSS, using = "#AccountNewWriteoffReversalWizard-NewWriteoffReversalConfirmationScreen-NewWriteoffReversalConfirmationDV-TransactionLineItemsLV-0-Date_dateIcon", AI = false)
	private WebElement btnDateDateIcon_2;

	@IFindBy(how = How.CSS, using = "select[name='AccountNewWriteoffReversalWizard-NewWriteoffReversalConfirmationScreen-ApprovalActivityDV-Priority']", AI = false)
	private WebElement drpPriority;

	@IFindBy(how = How.CSS, using = "#AccountNewWriteoffReversalWizard-NewWriteoffReversalConfirmationScreen-ApprovalActivityDV-TargetDate_dateIcon", AI = false)
	private WebElement btnTargetDateDateIcon;
	
	@IFindBy(how = How.CSS, using = "div[id$='0-Select']", AI = false)
	private WebElement btnSelect;


	public WriteOffReversalWizardPage(){
	}

	public WriteOffReversalWizardPage(WebDriver driver) {
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
		}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, btnCancel))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);
	}public WriteOffReversalWizardPage selectChargePattern(WebDriver driver,String ChargePattern)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpChargePattern,ChargePattern,"ChargePattern");
		return this;
	}
	public WriteOffReversalWizardPage enterSelectedWriteOff(WebDriver driver,String SelectedWriteOff) {
		BrowserActions.type(driver, inpSelectedWriteOff,SelectedWriteOff, "SelectedWriteOff");
		return this;
	}
	public WriteOffReversalWizardPage clickConfirmation(WebDriver driver)  {
		BrowserActions.click(driver, btnConfirmation,"Confirmation");
		return this;
	}
	public WriteOffReversalWizardPage clickLatestDateDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnLatestDateDateIcon,"LatestDateDateIcon");
		return this;
	}
	public WriteOffReversalWizardPage enterEarliestDate(WebDriver driver,String EarliestDate) {
		BrowserActions.type(driver, inpEarliestDate,EarliestDate, "EarliestDate");
		return this;
	}
	public WriteOffReversalWizardPage enterMaximumAmount(WebDriver driver,String MaximumAmount) {
		BrowserActions.type(driver, inpMaximumAmount,MaximumAmount, "MaximumAmount");
		return this;
	}
	public WriteOffReversalWizardPage enterAccount(WebDriver driver,String Account) {
		BrowserActions.type(driver, inpAccount,Account, "Account");
		return this;
	}
	public WriteOffReversalWizardPage clickEarliestDateDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnEarliestDateDateIcon,"EarliestDateDateIcon");
		return this;
	}
	public AccountSummaryPage clickFinish(WebDriver driver)  {
		BrowserActions.click(driver, btnFinish,"Finish");
		return new AccountSummaryPage(driver).get();
	}
	public WriteOffReversalWizardPage enterMinimumAmount(WebDriver driver,String MinimumAmount) {
		BrowserActions.type(driver, inpMinimumAmount,MinimumAmount, "MinimumAmount");
		return this;
	}
	public WriteOffReversalWizardPage enterLatestDate(WebDriver driver,String LatestDate) {
		BrowserActions.type(driver, inpLatestDate,LatestDate, "LatestDate");
		return this;
	}
	public WriteOffReversalWizardPage clickWriteOffSearch(WebDriver driver)  {
		BrowserActions.click(driver, btnWriteOffSearch,"WriteOffSearch");
		return this;
	}
	public WriteOffReversalWizardPage clickBack(WebDriver driver)  {
		BrowserActions.click(driver, btnBack,"Back");
		return this;
	}
	public WriteOffReversalWizardPage enterPolicy(WebDriver driver,String Policy) {
		BrowserActions.type(driver, inpPolicy,Policy, "Policy");
		return this;
	}
	public WriteOffReversalWizardPage selectReason(WebDriver driver,String Reason)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpReason,Reason,"Reason");
		return this;
	}
	public WriteOffReversalWizardPage selectReasonWriteOffReversal(WebDriver driver,String Reason)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpReasonWriteOffReversal,Reason,"Reason");
		return this;
	}
	public WriteOffReversalWizardPage clickSearch(WebDriver driver)  {
		BrowserActions.click(driver, btnSearch,"Search");
		return this;
	}
	public WriteOffReversalWizardPage clickNext(WebDriver driver)  {
		BrowserActions.click(driver, btnNext,"Next");
		return this;
	}
	public WriteOffReversalWizardPage clickWriteOffs(WebDriver driver)  {
		BrowserActions.click(driver, btnWriteOffs,"WriteOffs");
		return this;
	}
	public WriteOffReversalWizardPage clickReturntoAccountSummary(WebDriver driver)  {
		BrowserActions.click(driver, btnReturntoAccountSummary,"ReturntoAccountSummary");
		return this;
	}
	public WriteOffReversalWizardPage clickCancel(WebDriver driver)  {
		BrowserActions.click(driver, btnCancel,"Cancel");
		return this;
	}
	public WriteOffReversalWizardPage selectCurrency(WebDriver driver,String Currency)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCurrency,Currency,"Currency");
		return this;
	}
	public WriteOffReversalWizardPage clickPolicyPicker(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyPicker,"PolicyPicker");
		return this;
	}
	public WriteOffReversalWizardPage clickAccountPicker(WebDriver driver)  {
		BrowserActions.click(driver, btnAccountPicker,"AccountPicker");
		return this;
	}
	public WriteOffReversalWizardPage clickReset(WebDriver driver)  {
		BrowserActions.click(driver, btnReset,"Reset");
		return this;
	}
	public WriteOffReversalWizardPage enterTargetDate(WebDriver driver,String TargetDate) {
		BrowserActions.type(driver, inpTargetDate,TargetDate, "TargetDate");
		return this;
	}
	public WriteOffReversalWizardPage enterDate_1(WebDriver driver,String Date_1) {
		BrowserActions.type(driver, inpDate_1,Date_1, "Date_1");
		return this;
	}
	public WriteOffReversalWizardPage enterAmount(WebDriver driver,String Amount) {
		BrowserActions.type(driver, inpAmount,Amount, "Amount");
		return this;
	}
	public WriteOffReversalWizardPage clickDateDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnDateDateIcon,"DateDateIcon");
		return this;
	}
	public WriteOffReversalWizardPage enterWriteOff(WebDriver driver,String WriteOff) {
		BrowserActions.type(driver, inpWriteOff,WriteOff, "WriteOff");
		return this;
	}
	public WriteOffReversalWizardPage enterDescription(WebDriver driver,String Description) {
		BrowserActions.type(driver, inpDescription,Description, "Description");
		return this;
	}
	public WriteOffReversalWizardPage enterWriteOffReversal(WebDriver driver,String WriteOffReversal) {
		BrowserActions.type(driver, inpWriteOffReversal,WriteOffReversal, "WriteOffReversal");
		return this;
	}
	public WriteOffReversalWizardPage enterDate(WebDriver driver,String Date) {
		BrowserActions.type(driver, inpDate,Date, "Date");
		return this;
	}

	public WriteOffReversalWizardPage enterEscalationDate(WebDriver driver,String EscalationDate) {
		BrowserActions.type(driver, inpEscalationDate,EscalationDate, "EscalationDate");
		return this;
	}

	public WriteOffReversalWizardPage clickClose(WebDriver driver)  {
		BrowserActions.click(driver, btnClose,"Close");
		return this;
	}

	public WriteOffReversalWizardPage enterName(WebDriver driver,String Name) {
		BrowserActions.type(driver, inpName,Name, "Name");
		return this;
	}
	public WriteOffReversalWizardPage clickEscalationDateDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnEscalationDateDateIcon,"EscalationDateDateIcon");
		return this;
	}

	public WriteOffReversalWizardPage enterSubject(WebDriver driver,String Subject) {
		BrowserActions.type(driver, inpSubject,Subject, "Subject");
		return this;
	}

	public WriteOffReversalWizardPage enterAssignedTo(WebDriver driver,String AssignedTo) {
		BrowserActions.type(driver, inpAssignedTo,AssignedTo, "AssignedTo");
		return this;
	}

	public WriteOffReversalWizardPage clickDateDateIcon_2(WebDriver driver)  {
		BrowserActions.click(driver, btnDateDateIcon_2,"DateDateIcon_2");
		return this;
	}
	public WriteOffReversalWizardPage selectPriority(WebDriver driver,String Priority)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPriority,Priority,"Priority");
		return this;
	}
	public WriteOffReversalWizardPage clickTargetDateDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnTargetDateDateIcon,"TargetDateDateIcon");
		return this;
	}
	public WriteOffReversalWizardPage clickSelect(WebDriver driver)  {
		BrowserActions.click(driver, btnSelect,"Select");
		return this;
	}
}
