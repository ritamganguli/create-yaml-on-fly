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

public class TransactionWizardPage extends LoadableComponent<TransactionWizardPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
//	public TopNavBar topnavbar;
	//	public NewTransactionAccountPoliciesScreen newtransactionaccountpoliciesscreenTable;

	@IFindBy(how = How.CSS, using = "#AccountNewTransactionWizard-NewTransactionAccountPoliciesScreen-AccountPolicySearchCV-PolicySearchResultsLV-0-PolicyPerExpirDate_dateIcon", AI = false)
	private WebElement btnExpirationDateDateIcon;

	@IFindBy(how = How.CSS, using = "#AccountNewTransactionWizard-NewTransactionAccountPoliciesScreen-ttlBar", AI = false)
	private WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "input[name='AccountNewTransactionWizard-NewTransactionAccountPoliciesScreen-AccountPolicySearchCV-PolicySearchResultsLV-0-PolicyPerEffDate']", AI = false)
	private WebElement inpEffectiveDate;

	@IFindBy(how = How.CSS, using = "#AccountNewTransactionWizard-NewTransactionAccountPoliciesScreen-AccountTAccountOwner>div[role='button']", AI = false)
	private WebElement btnSetAccountasTransactionOwner;

	@IFindBy(how = How.CSS, using = "input[name='AccountNewTransactionWizard-NewTransactionAccountPoliciesScreen-AccountPolicySearchCV-PolicySearchResultsLV-0-PolicyPerExpirDate']", AI = false)
	private WebElement inpExpirationDate;

	@IFindBy(how = How.CSS, using = "#AccountNewTransactionWizard-Step1>div[role='menuitem']", AI = false)
	private WebElement btnSelectTarget;

	@IFindBy(how = How.CSS, using = "#AccountNewTransactionWizard-NewTransactionAccountPoliciesScreen-AccountPolicySearchCV-PolicySearchResultsLV-0-PolicyPerEffDate_dateIcon", AI = false)
	private WebElement btnEffectiveDateDateIcon;

	@IFindBy(how = How.CSS, using = "#AccountNewTransactionWizard-Finish>div[role='button']", AI = false)
	private WebElement btnFinish;

	@IFindBy(how = How.CSS, using = "input[name='AccountNewTransactionWizard-NewTransactionAccountPoliciesScreen-NewChargeTargetDV-NewChargeTarget']", AI = false)
	private WebElement inpTransactionOwner;

	@IFindBy(how = How.CSS, using = "#AccountNewTransactionWizard-Prev>div[role='button']", AI = false)
	private WebElement btnBack;

	@IFindBy(how = How.CSS, using = "#AccountNewTransactionWizard-NewTransactionAccountPoliciesScreen-AccountPolicySearchCV-SearchPoliciesCardTab", AI = false)
	private WebElement btnPolicies;

	@IFindBy(how = How.CSS, using = "input[name='AccountNewTransactionWizard-NewTransactionAccountPoliciesScreen-AccountPolicySearchCV-PolicySearchResultsLV-0-Number']", AI = false)
	private WebElement inpPolicy;

	@IFindBy(how = How.CSS, using = "#AccountNewTransactionWizard-Step2>div[role='menuitem']", AI = false)
	private WebElement btnTransactionInfo;

	@IFindBy(how = How.CSS, using = "#AccountNewTransactionWizard-Next>div[role='button']", AI = false)
	private WebElement btnNext;

	@IFindBy(how = How.CSS, using = "#AccountNewTransactionWizard-__crumb__", AI = false)
	private WebElement btnReturntoAccountSummary;

	@IFindBy(how = How.CSS, using = "#AccountNewTransactionWizard-Cancel>div[role='button']", AI = false)
	private WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "#AccountNewTransactionWizard-NewTransactionAccountPoliciesScreen-AccountPolicySearchCV-PolicySearchResultsLV-0-Select", AI = false)
	private WebElement btnSelect;

	@IFindBy(how = How.CSS, using = "input[name='AccountNewTransactionWizard-ChargeDetailsScreen-Amount']", AI = false)
	private WebElement inpAmount;

	@IFindBy(how = How.CSS, using = "select[name='AccountNewTransactionWizard-ChargeDetailsScreen-Type']", AI = false)
	private WebElement drpCategory;

	@IFindBy(how = How.CSS, using = "input[name='AccountNewTransactionWizard-ChargeDetailsScreen-Target']", AI = false)
	private WebElement inpTarget;
	
	
	public TransactionWizardPage(){
	}

	public TransactionWizardPage(WebDriver driver) {
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(finder, this);
		//		newtransactionaccountpoliciesscreenTable = new NewTransactionAccountPoliciesScreen();
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
	}public TransactionWizardPage clickExpirationDateDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnExpirationDateDateIcon,"ExpirationDateDateIcon");
		return this;
	}
	public TransactionWizardPage enterEffectiveDate(WebDriver driver,String EffectiveDate) {
		BrowserActions.type(driver, inpEffectiveDate,EffectiveDate, "EffectiveDate");
		return this;
	}
	public TransactionWizardPage clickSetAccountasTransactionOwner(WebDriver driver)  {
		BrowserActions.click(driver, btnSetAccountasTransactionOwner,"SetAccountasTransactionOwner");
		return this;
	}
	public TransactionWizardPage enterExpirationDate(WebDriver driver,String ExpirationDate) {
		BrowserActions.type(driver, inpExpirationDate,ExpirationDate, "ExpirationDate");
		return this;
	}
	public TransactionWizardPage clickSelectTarget(WebDriver driver)  {
		BrowserActions.click(driver, btnSelectTarget,"SelectTarget");
		return this;
	}
	public TransactionWizardPage clickEffectiveDateDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnEffectiveDateDateIcon,"EffectiveDateDateIcon");
		return this;
	}
	public TransactionWizardPage clickFinish(WebDriver driver)  {
		BrowserActions.click(driver, btnFinish,"Finish");
		return this;
	}
	public TransactionWizardPage enterTransactionOwner(WebDriver driver,String TransactionOwner) {
		BrowserActions.type(driver, inpTransactionOwner,TransactionOwner, "TransactionOwner");
		return this;
	}
	public TransactionWizardPage clickBack(WebDriver driver)  {
		BrowserActions.click(driver, btnBack,"Back");
		return this;
	}
	public TransactionWizardPage clickPolicies(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicies,"Policies");
		return this;
	}
	public TransactionWizardPage enterPolicy(WebDriver driver,String Policy) {
		BrowserActions.type(driver, inpPolicy,Policy, "Policy");
		return this;
	}
	public TransactionWizardPage clickTransactionInfo(WebDriver driver)  {
		BrowserActions.click(driver, btnTransactionInfo,"TransactionInfo");
		return this;
	}
	public TransactionWizardPage clickNext(WebDriver driver)  {
		BrowserActions.click(driver, btnNext,"Next");
		return this;
	}
	public TransactionWizardPage clickReturntoAccountSummary(WebDriver driver)  {
		BrowserActions.click(driver, btnReturntoAccountSummary,"ReturntoAccountSummary");
		return this;
	}
	public TransactionWizardPage clickCancel(WebDriver driver)  {
		BrowserActions.click(driver, btnCancel,"Cancel");
		return this;
	}
	public TransactionWizardPage clickSelect(WebDriver driver)  {
		BrowserActions.click(driver, btnSelect,"Select");
		return this;
	}
	public TransactionWizardPage enterAmount(WebDriver driver,String Amount) {
		BrowserActions.type(driver, inpAmount,Amount, "Amount");
		return this;
	}
	public TransactionWizardPage enterTarget(WebDriver driver,String Target) {
		BrowserActions.type(driver, inpTarget,Target, "Target");
		return this;
	}
	public TransactionWizardPage selectCategory(WebDriver driver,String category) {
		BrowserActions.selectDropDownByVisibleText(driver, drpCategory,category, "Category");
		return this;
	}
	
}
