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

public class CreditWizardPage extends LoadableComponent<CreditWizardPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
	//	public TopNavBar topnavbar;
	@IFindBy(how = How.CSS, using = "#AccountNewCreditWizard-Cancel>div[role='button']", AI = false)
	private WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "#AccountNewCreditWizard-Prev>div[role='button']", AI = false)
	private WebElement btnBack;

	@IFindBy(how = How.CSS, using = "select[name='AccountNewCreditWizard-CreditDetailsScreen-creditType']", AI = false)
	private WebElement drpCreditType;

	@IFindBy(how = How.CSS, using = "#AccountNewCreditWizard-CreditDetailsScreen-ttlBar", AI = false)
	private WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "input[name='AccountNewCreditWizard-CreditDetailsScreen-Account']", AI = false)
	private WebElement inpAccount;

	@IFindBy(how = How.CSS, using = "#AccountNewCreditWizard-Step2>div[role='menuitem']", AI = false)
	private WebElement btnConfirmation;

	@IFindBy(how = How.CSS, using = "select[name='AccountNewCreditWizard-CreditDetailsScreen-DesignatedUnapplieds']", AI = false)
	private WebElement drpUnappliedFund;

	@IFindBy(how = How.CSS, using = "input[name='AccountNewCreditWizard-CreditDetailsScreen-Amount']", AI = false)
	private WebElement inpAmount;

	@IFindBy(how = How.CSS, using = "#AccountNewCreditWizard-Next>div[role='button']", AI = false)
	private WebElement btnNext;

	@IFindBy(how = How.CSS, using = "#AccountNewCreditWizard-Step1>div[role='menuitem']", AI = false)
	private WebElement btnCredittransactionInfo;

	@IFindBy(how = How.CSS, using = "#AccountNewCreditWizard-Finish>div[role='button']", AI = false)
	private WebElement btnFinish;

	@IFindBy(how = How.CSS, using = "#AccountNewCreditWizard-__crumb__", AI = false)
	private WebElement btnReturntoAccountSummary;

	@IFindBy(how = How.CSS, using = "input[name='AccountNewCreditWizard-CreditDetailsConfirmationScreen-ApprovalActivityDV-EscalationDate']", AI = false)
	private WebElement inpEscalationDate;

	@IFindBy(how = How.CSS, using = "#AccountNewCreditWizard-CreditDetailsConfirmationScreen-ApprovalActivityAlertBar-CloseBtn", AI = false)
	private WebElement btnClose;

	@IFindBy(how = How.CSS, using = "input[name='AccountNewCreditWizard-CreditDetailsConfirmationScreen-ApprovalActivityDV-TargetDate']", AI = false)
	private WebElement inpTargetDate;

	@IFindBy(how = How.CSS, using = "#AccountNewCreditWizard-CreditDetailsConfirmationScreen-ApprovalActivityDV-EscalationDate_dateIcon", AI = false)
	private WebElement btnEscalationDateDateIcon;

	@IFindBy(how = How.CSS, using = "#AccountNewCreditWizard-CreditDetailsConfirmationScreen-ApprovalActivityAlertBar .gw-AlertBar--label", AI = false)
	private WebElement lblApprovalActivityAlertBar;

	@IFindBy(how = How.CSS, using = "input[name='AccountNewCreditWizard-CreditDetailsConfirmationScreen-ApprovalActivityDV-Subject']", AI = false)
	private WebElement inpSubject;

	@IFindBy(how = How.CSS, using = "#AccountNewCreditWizard-CreditDetailsConfirmationScreen-ApprovalActivityDV-Description textarea", AI = false)
	private WebElement inpDescription;

	@IFindBy(how = How.CSS, using = "input[name='AccountNewCreditWizard-CreditDetailsConfirmationScreen-ApprovalActivityDV-AssignedTo']", AI = false)
	private WebElement inpAssignedTo;

	@IFindBy(how = How.CSS, using = "select[name='AccountNewCreditWizard-CreditDetailsConfirmationScreen-ApprovalActivityDV-Priority']", AI = false)
	private WebElement drpPriority;

	@IFindBy(how = How.CSS, using = "#AccountNewCreditWizard-CreditDetailsConfirmationScreen-ApprovalActivityDV-TargetDate_dateIcon", AI = false)
	private WebElement btnTargetDateDateIcon;

	public CreditWizardPage(){
	}

	public CreditWizardPage(WebDriver driver) {
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
		}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, btnReturntoAccountSummary))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);
	}public CreditWizardPage clickCancel(WebDriver driver)  {
		BrowserActions.click(driver, btnCancel,"Cancel");
		return this;
	}
	public CreditWizardPage clickBack(WebDriver driver)  {
		BrowserActions.click(driver, btnBack,"Back");
		return this;
	}
	public CreditWizardPage selectCreditType(WebDriver driver,String CreditType)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCreditType,CreditType,true,"CreditType");
		return this;
	}
	public CreditWizardPage enterAccount(WebDriver driver,String Account) {
		BrowserActions.type(driver, inpAccount,Account, "Account");
		return this;
	}
	public CreditWizardPage clickConfirmation(WebDriver driver)  {
		BrowserActions.click(driver, btnConfirmation,"Confirmation");
		return this;
	}
	public CreditWizardPage selectUnappliedFund(WebDriver driver,String UnappliedFund)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpUnappliedFund,UnappliedFund,"UnappliedFund");
		return this;
	}
	public CreditWizardPage enterAmount(WebDriver driver,String Amount) {
		BrowserActions.type(driver, inpAmount,Amount,true, "Amount");
		return this;
	}
	public CreditWizardPage clickNext(WebDriver driver)  {
		BrowserActions.click(driver, btnNext,"Next");
		return this;
	}
	public CreditWizardPage clickCredittransactionInfo(WebDriver driver)  {
		BrowserActions.click(driver, btnCredittransactionInfo,"CredittransactionInfo");
		return this;
	}
	public CreditWizardPage clickFinish(WebDriver driver)  {
		BrowserActions.click(driver, btnFinish,true,"Finish");
		return this;
	}
	public CreditWizardPage clickReturntoAccountSummary(WebDriver driver)  {
		BrowserActions.click(driver, btnReturntoAccountSummary,"ReturntoAccountSummary");
		return this;
	}
	public CreditWizardPage enterEscalationDate(WebDriver driver,String EscalationDate) {
		BrowserActions.type(driver, inpEscalationDate,EscalationDate, "EscalationDate");
		return this;
	}

	public CreditWizardPage clickClose(WebDriver driver)  {
		BrowserActions.click(driver, btnClose,"Close");
		return this;
	}

	public CreditWizardPage enterTargetDate(WebDriver driver,String TargetDate) {
		BrowserActions.type(driver, inpTargetDate,TargetDate, "TargetDate");
		return this;
	}
	public CreditWizardPage clickEscalationDateDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnEscalationDateDateIcon,"EscalationDateDateIcon");
		return this;
	}

	public CreditWizardPage selectPriority(WebDriver driver,String Priority)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPriority,Priority,"Priority");
		return this;
	}
	public CreditWizardPage clickTargetDateDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnTargetDateDateIcon,"TargetDateDateIcon");
		return this;
	}
	
}
