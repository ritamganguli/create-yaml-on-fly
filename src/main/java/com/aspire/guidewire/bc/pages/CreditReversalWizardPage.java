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

public class CreditReversalWizardPage extends LoadableComponent<CreditReversalWizardPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
//	public TopNavBar topnavbar;

	@IFindBy(how = How.CSS, using = "select[name='AccountNewCreditReversalWizard-CreditReversalCreditSearchScreen-CreditSearchDV-ReasonCriterion']", AI = false)
	private WebElement drpReason;

	@IFindBy(how = How.CSS, using = "#AccountNewCreditReversalWizard-CreditReversalCreditSearchScreen-CreditSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Search", AI = false)
	private WebElement btnSearch;

	@IFindBy(how = How.CSS, using = "#AccountNewCreditReversalWizard-CreditReversalCreditSearchScreen-CreditSearchDV-LatestDateCriterion_dateIcon", AI = false)
	private WebElement btnLatestDateDateIcon;

	@IFindBy(how = How.CSS, using = "#AccountNewCreditReversalWizard-CreditReversalCreditSearchScreen-CreditTab", AI = false)
	private WebElement btnCredit;

	@IFindBy(how = How.CSS, using = "input[name='AccountNewCreditReversalWizard-CreditReversalCreditSearchScreen-CreditSearchDV-EarliestDateCriterion']", AI = false)
	private WebElement inpEarliestDate;

	@IFindBy(how = How.CSS, using = "input[name='AccountNewCreditReversalWizard-CreditReversalCreditSearchScreen-CreditSourceDV-Credit']", AI = false)
	private WebElement inpSelectedCredit;

	@IFindBy(how = How.CSS, using = "input[name='AccountNewCreditReversalWizard-CreditReversalCreditSearchScreen-CreditSearchDV-MaxAmountCriterion']", AI = false)
	private WebElement inpMaximumAmount;

	@IFindBy(how = How.CSS, using = "#AccountNewCreditReversalWizard-Cancel>div[role='button']", AI = false)
	private WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "select[name='AccountNewCreditReversalWizard-CreditReversalCreditSearchScreen-CreditSearchDV-CurrencyCriterion']", AI = false)
	private WebElement drpCurrency;

	@IFindBy(how = How.CSS, using = "input[name='AccountNewCreditReversalWizard-CreditReversalCreditSearchScreen-CreditSearchDV-AccountCriterion']", AI = false)
	private WebElement inpAccount;

	@IFindBy(how = How.CSS, using = "#AccountNewCreditReversalWizard-CreditReversalCreditSearchScreen-CreditSearchDV-EarliestDateCriterion_dateIcon", AI = false)
	private WebElement btnEarliestDateDateIcon;

	@IFindBy(how = How.CSS, using = "#AccountNewCreditReversalWizard-Finish>div[role='button']", AI = false)
	private WebElement btnFinish;

	@IFindBy(how = How.CSS, using = "input[name='AccountNewCreditReversalWizard-CreditReversalCreditSearchScreen-CreditSearchDV-MinAmountCriterion']", AI = false)
	private WebElement inpMinimumAmount;

	@IFindBy(how = How.CSS, using = "input[name='AccountNewCreditReversalWizard-CreditReversalCreditSearchScreen-CreditSearchDV-LatestDateCriterion']", AI = false)
	private WebElement inpLatestDate;

	@IFindBy(how = How.CSS, using = "#AccountNewCreditReversalWizard-CreditReversalCreditSearchScreen-CreditSearchDV-AccountCriterion-AccountPicker", AI = false)
	private WebElement btnAccountPicker;

	@IFindBy(how = How.CSS, using = "#AccountNewCreditReversalWizard-CreditReversalCreditSearchScreen-CreditSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Reset", AI = false)
	private WebElement btnReset;

	@IFindBy(how = How.CSS, using = "#AccountNewCreditReversalWizard-Step1>div[role='menuitem']", AI = false)
	private WebElement btnCreditSearch;

	@IFindBy(how = How.CSS, using = "input[name='AccountNewCreditReversalWizard-CreditReversalConfirmationScreen-ApprovalActivityDV-EscalationDate']", AI = false)
	private WebElement inpEscalationDate;

	@IFindBy(how = How.CSS, using = "#AccountNewCreditReversalWizard-Prev>div[role='button']", AI = false)
	private WebElement btnBack;

	@IFindBy(how = How.CSS, using = "#AccountNewCreditReversalWizard-CreditReversalConfirmationScreen-ApprovalActivityAlertBar-CloseBtn", AI = false)
	private WebElement btnClose;

	@IFindBy(how = How.CSS, using = "#AccountNewCreditReversalWizard-CreditReversalConfirmationScreen-ttlBar", AI = false)
	private WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "#AccountNewCreditReversalWizard-Step2>div[role='menuitem']", AI = false)
	private WebElement btnConfirmation;

	@IFindBy(how = How.CSS, using = "input[name='AccountNewCreditReversalWizard-CreditReversalConfirmationScreen-ApprovalActivityDV-TargetDate']", AI = false)
	private WebElement inpTargetDate;

	@IFindBy(how = How.CSS, using = "#AccountNewCreditReversalWizard-CreditReversalConfirmationScreen-ApprovalActivityDV-EscalationDate_dateIcon", AI = false)
	private WebElement btnEscalationDateDateIcon;

	@IFindBy(how = How.CSS, using = "#AccountNewCreditReversalWizard-Next>div[role='button']", AI = false)
	private WebElement btnNext;

	@IFindBy(how = How.CSS, using = "#AccountNewCreditReversalWizard-CreditReversalConfirmationScreen-ApprovalActivityAlertBar .gw-AlertBar--label", AI = false)
	private WebElement lblApprovalActivityAlertBar;

	@IFindBy(how = How.CSS, using = "input[name='AccountNewCreditReversalWizard-CreditReversalConfirmationScreen-ApprovalActivityDV-Subject']", AI = false)
	private WebElement inpSubject;

	@IFindBy(how = How.CSS, using = "#AccountNewCreditReversalWizard-__crumb__", AI = false)
	private WebElement btnReturntoAccountSummary;

	@IFindBy(how = How.CSS, using = "#AccountNewCreditReversalWizard-CreditReversalConfirmationScreen-ApprovalActivityDV-Description textarea", AI = false)
	private WebElement inpDescription;

	@IFindBy(how = How.CSS, using = "input[name='AccountNewCreditReversalWizard-CreditReversalConfirmationScreen-ApprovalActivityDV-AssignedTo']", AI = false)
	private WebElement inpAssignedTo;

	@IFindBy(how = How.CSS, using = "select[name='AccountNewCreditReversalWizard-CreditReversalConfirmationScreen-ApprovalActivityDV-Priority']", AI = false)
	private WebElement drpPriority;

	@IFindBy(how = How.CSS, using = "#AccountNewCreditReversalWizard-CreditReversalConfirmationScreen-ApprovalActivityDV-TargetDate_dateIcon", AI = false)
	private WebElement btnTargetDateDateIcon;
	
	@IFindBy(how = How.XPATH, using = "(//div[text()='Select'])[last()]", AI = false)
	private WebElement btnSelect;

	public CreditReversalWizardPage(){
	}

	public CreditReversalWizardPage(WebDriver driver) {
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
		}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, btnCreditSearch))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);
	}public CreditReversalWizardPage clickBack(WebDriver driver)  {
		BrowserActions.click(driver, btnBack,"Back");
		return this;
	}
	public CreditReversalWizardPage selectReason(WebDriver driver,String Reason)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpReason,Reason,"Reason");
		return this;
	}
	public CreditReversalWizardPage clickSearch(WebDriver driver)  {
		BrowserActions.click(driver, btnSearch,"Search");
		return this;
	}
	public CreditReversalWizardPage clickConfirmation(WebDriver driver)  {
		BrowserActions.click(driver, btnConfirmation,"Confirmation");
		return this;
	}
	public CreditReversalWizardPage clickLatestDateDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnLatestDateDateIcon,"LatestDateDateIcon");
		return this;
	}
	public CreditReversalWizardPage clickCredit(WebDriver driver)  {
		BrowserActions.click(driver, btnCredit,"Credit");
		return this;
	}
	public CreditReversalWizardPage enterEarliestDate(WebDriver driver,String EarliestDate) {
		BrowserActions.type(driver, inpEarliestDate,EarliestDate, "EarliestDate");
		return this;
	}
	public CreditReversalWizardPage enterSelectedCredit(WebDriver driver,String SelectedCredit) {
		BrowserActions.type(driver, inpSelectedCredit,SelectedCredit, "SelectedCredit");
		return this;
	}
	public CreditReversalWizardPage clickNext(WebDriver driver)  {
		BrowserActions.click(driver, btnNext,"Next");
		return this;
	}
	public CreditReversalWizardPage clickReturntoAccountSummary(WebDriver driver)  {
		BrowserActions.click(driver, btnReturntoAccountSummary,"ReturntoAccountSummary");
		return this;
	}
	public CreditReversalWizardPage enterMaximumAmount(WebDriver driver,String MaximumAmount) {
		BrowserActions.type(driver, inpMaximumAmount,MaximumAmount, "MaximumAmount");
		return this;
	}
	public CreditReversalWizardPage clickCancel(WebDriver driver)  {
		BrowserActions.click(driver, btnCancel,"Cancel");
		return this;
	}
	public CreditReversalWizardPage selectCurrency(WebDriver driver,String Currency)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCurrency,Currency,"Currency");
		return this;
	}
	public CreditReversalWizardPage enterAccount(WebDriver driver,String Account) {
		BrowserActions.type(driver, inpAccount,Account, "Account");
		return this;
	}
	public CreditReversalWizardPage clickEarliestDateDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnEarliestDateDateIcon,"EarliestDateDateIcon");
		return this;
	}
	public AccountSummaryPage clickFinish(WebDriver driver)  {
		BrowserActions.click(driver, btnFinish,true,"Finish");
		return new AccountSummaryPage(driver).get();
	}
	public CreditReversalWizardPage enterMinimumAmount(WebDriver driver,String MinimumAmount) {
		BrowserActions.type(driver, inpMinimumAmount,MinimumAmount, "MinimumAmount");
		return this;
	}
	public CreditReversalWizardPage enterLatestDate(WebDriver driver,String LatestDate) {
		BrowserActions.type(driver, inpLatestDate,LatestDate, "LatestDate");
		return this;
	}
	public CreditReversalWizardPage clickAccountPicker(WebDriver driver)  {
		BrowserActions.click(driver, btnAccountPicker,"AccountPicker");
		return this;
	}
	public CreditReversalWizardPage clickReset(WebDriver driver)  {
		BrowserActions.click(driver, btnReset,"Reset");
		return this;
	}
	public CreditReversalWizardPage clickCreditSearch(WebDriver driver)  {
		BrowserActions.click(driver, btnCreditSearch,"CreditSearch");
		return this;
	}
	public CreditReversalWizardPage enterEscalationDate(WebDriver driver,String EscalationDate) {
		BrowserActions.type(driver, inpEscalationDate,EscalationDate, "EscalationDate");
		return this;
	}

	public CreditReversalWizardPage clickClose(WebDriver driver)  {
		BrowserActions.click(driver, btnClose,"Close");
		return this;
	}

	public CreditReversalWizardPage enterTargetDate(WebDriver driver,String TargetDate) {
		BrowserActions.type(driver, inpTargetDate,TargetDate, "TargetDate");
		return this;
	}
	public CreditReversalWizardPage clickEscalationDateDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnEscalationDateDateIcon,"EscalationDateDateIcon");
		return this;
	}

	public CreditReversalWizardPage enterSubject(WebDriver driver,String Subject) {
		BrowserActions.type(driver, inpSubject,Subject, "Subject");
		return this;
	}

	public CreditReversalWizardPage enterDescription(WebDriver driver,String Description) {
		BrowserActions.type(driver, inpDescription,Description, "Description");
		return this;
	}
	public CreditReversalWizardPage enterAssignedTo(WebDriver driver,String AssignedTo) {
		BrowserActions.type(driver, inpAssignedTo,AssignedTo, "AssignedTo");
		return this;
	}

	public CreditReversalWizardPage selectPriority(WebDriver driver,String Priority)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPriority,Priority,"Priority");
		return this;
	}
	public CreditReversalWizardPage clickTargetDateDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnTargetDateDateIcon,"TargetDateDateIcon");
		return this;
	}
	public CreditReversalWizardPage clickSelect(WebDriver driver)  {
		BrowserActions.click(driver, btnSelect,"Select");
		return this;
	}

}
