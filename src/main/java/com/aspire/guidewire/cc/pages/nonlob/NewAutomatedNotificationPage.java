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

import com.aspire.guidewire.utils.BrowserActions;
import com.aspire.guidewire.utils.ElementLayer;
import com.aspire.guidewire.utils.Log;
import com.aspire.guidewire.utils.WaitUtils;

import ASPIREAI.customfactories.AjaxElementLocatorFactory;
import ASPIREAI.customfactories.IFindBy;
import ASPIREAI.customfactories.PageFactory;

public class NewAutomatedNotificationPage extends LoadableComponent<NewAutomatedNotificationPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
	@IFindBy(how = How.CSS, using = "input[name='NewAutomatedNotificationHandlerPopup-NewAutomatedHandlerDV-AutomatedHandlerBaseInputSet-AutomatedHandlerType']", AI = false)
	public WebElement inpTypeofChange;

	@IFindBy(how = How.CSS, using = "#NewAutomatedNotificationHandlerPopup-Update>div[role='button']", AI = false)
	public WebElement btnOK;

	@IFindBy(how = How.CSS, using = "#NewAutomatedNotificationHandlerPopup-NewAutomatedHandlerDV-AutomatedHandlerActionInputSet-AutomatedHandlerEmailTemplate-SelectAutomatedHandlerEmailTemplate", AI = false)
	public WebElement btnSearch;

	@IFindBy(how = How.CSS, using = "select[name='NewAutomatedNotificationHandlerPopup-NewAutomatedHandlerDV-AutomatedHandlerActionInputSet-NotificationType']", AI = false)
	public WebElement drpNotificationType;

	@IFindBy(how = How.CSS, using = "select[name='NewAutomatedNotificationHandlerPopup-NewAutomatedHandlerDV-AutomatedHandlerActionInputSet-ContactRole']", AI = false)
	public WebElement drpContactRole;

	@IFindBy(how = How.CSS, using = "input[name='NewAutomatedNotificationHandlerPopup-NewAutomatedHandlerDV-AutomatedHandlerBaseInputSet-AutomatedHandlerPolicyTypeReadOnly']", AI = false)
	public WebElement inpPolicyType;

	@IFindBy(how = How.CSS, using = "#NewAutomatedNotificationHandlerPopup-ttlBar", AI = false)
	public WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "input[name='NewAutomatedNotificationHandlerPopup-NewAutomatedHandlerDV-AutomatedHandlerActionInputSet-AutomatedHandlerEmailAddress']", AI = false)
	public WebElement inpEmailAddress;

	@IFindBy(how = How.CSS, using = "select[name='NewAutomatedNotificationHandlerPopup-NewAutomatedHandlerDV-AutomatedHandlerTriggerInputSet-AutomatedHandlerFinancialThreshold']", AI = false)
	public WebElement drpThreshold;

	@IFindBy(how = How.CSS, using = "input[name='NewAutomatedNotificationHandlerPopup-NewAutomatedHandlerDV-AutomatedHandlerActionInputSet-AutomatedHandlerEmailTemplate']", AI = false)
	public WebElement inpEmailTemplate;

	@IFindBy(how = How.CSS, using = "#NewAutomatedNotificationHandlerPopup-NewAutomatedHandlerDV-AutomatedHandlerActionInputSet-Remove>div[role='button']", AI = false)
	public WebElement btnRemove;

	@IFindBy(how = How.CSS, using = "input[name='NewAutomatedNotificationHandlerPopup-NewAutomatedHandlerDV-AutomatedHandlerTriggerInputSet-Cause']", AI = false)
	public WebElement inpCriteria;

	@IFindBy(how = How.CSS, using = "select[name='NewAutomatedNotificationHandlerPopup-NewAutomatedHandlerDV-AutomatedHandlerBaseInputSet-AutomatedHandlerPolicyType']", AI = false)
	public WebElement drpPolicyType;

	@IFindBy(how = How.CSS, using = "select[name='NewAutomatedNotificationHandlerPopup-NewAutomatedHandlerDV-AutomatedHandlerTriggerInputSet-Currency']", AI = false)
	public WebElement drpClaimCurrency;

	@IFindBy(how = How.CSS, using = "#NewAutomatedNotificationHandlerPopup-Cancel>div[role='button']", AI = false)
	public WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "#NewAutomatedNotificationHandlerPopup-NewAutomatedHandlerDV-AutomatedHandlerActionInputSet-Add>div[role='button']", AI = false)
	public WebElement btnAdd;

	@IFindBy(how = How.CSS, using = "#NewAutomatedNotificationHandlerPopup-__crumb__", AI = false)
	public WebElement btnReturntoNewAccount;

	@IFindBy(how = How.CSS, using = "input[name$='Amount']", AI = false)
	public WebElement inpThresholdAmount;

	@IFindBy(how = How.CSS, using = "div[id$='SelectAutomatedHandlerEmailTemplate']", AI = false)
	public WebElement btnEmailTemplate;

	@IFindBy(how = How.CSS, using = "div[id$='SearchLinksInputSet-Search']", AI = false)
	public WebElement btnEmailTemplateSearch;

	@IFindBy(how = How.CSS, using = "div[id$='Select']", AI = false)
	public WebElement btnEmailTemplateSelect;


	public NewAutomatedNotificationPage(){
	}

	public NewAutomatedNotificationPage(WebDriver driver) throws Exception{
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
		}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, btnReturntoNewAccount))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);
	}public NewAutomatedNotificationPage enterTypeofChange(WebDriver driver,String TypeofChange) {
		BrowserActions.type(driver, inpTypeofChange,TypeofChange, "TypeofChange");
		return this;
	}
	public NewAutomatedNotificationPage clickOK(WebDriver driver)  {
		BrowserActions.click(driver, btnOK,"OK");
		return this;
	}
	public NewAutomatedNotificationPage clickSearch(WebDriver driver)  {
		BrowserActions.click(driver, btnSearch,"Search");
		return this;
	}
	public NewAutomatedNotificationPage selectNotificationType(WebDriver driver,String NotificationType)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpNotificationType,NotificationType,"NotificationType");
		return this;
	}
	public NewAutomatedNotificationPage selectContactRole(WebDriver driver,String ContactRole)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpContactRole,ContactRole,"ContactRole");
		return this;
	}
	public NewAutomatedNotificationPage enterPolicyType(WebDriver driver,String PolicyType) {
		BrowserActions.type(driver, inpPolicyType,PolicyType, "PolicyType");
		return this;
	}
	public NewAutomatedNotificationPage enterEmailAddress(WebDriver driver,String EmailAddress) {
		BrowserActions.type(driver, inpEmailAddress,EmailAddress, "EmailAddress");
		return this;
	}
	public NewAutomatedNotificationPage selectThreshold(WebDriver driver,String Threshold)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpThreshold,Threshold,"Threshold");
		return this;
	}
	public NewAutomatedNotificationPage enterEmailTemplate(WebDriver driver,String EmailTemplate) {
		BrowserActions.type(driver, inpEmailTemplate,EmailTemplate, "EmailTemplate");
		return this;
	}
	public NewAutomatedNotificationPage clickRemove(WebDriver driver)  {
		BrowserActions.click(driver, btnRemove,"Remove");
		return this;
	}
	public NewAutomatedNotificationPage enterCriteria(WebDriver driver,String Criteria) {
		BrowserActions.type(driver, inpCriteria,Criteria, "Criteria");
		return this;
	}
	public NewAutomatedNotificationPage selectPolicyType(WebDriver driver,String PolicyType)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPolicyType,PolicyType,"PolicyType");
		return this;
	}
	public NewAutomatedNotificationPage selectClaimCurrency(WebDriver driver,String ClaimCurrency)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpClaimCurrency,ClaimCurrency,"ClaimCurrency");
		return this;
	}
	public NewAutomatedNotificationPage clickCancel(WebDriver driver)  {
		BrowserActions.click(driver, btnCancel,"Cancel");
		return this;
	}
	public NewAutomatedNotificationPage clickAdd(WebDriver driver)  {
		BrowserActions.click(driver, btnAdd,"Add");
		return this;
	}
	public NewAutomatedNotificationPage clickReturntoNewAccount(WebDriver driver)  {
		BrowserActions.click(driver, btnReturntoNewAccount,"ReturntoNewAccount");
		return this;
	}

	public NewAutomatedNotificationPage enterThresholdAmount(WebDriver driver,String amount) {
		BrowserActions.type(driver, inpThresholdAmount,amount, "Threshold Amount");
		return this;
	}

	public void clickEmailTemplate(WebDriver driver)
	{
		BrowserActions.click(driver, btnEmailTemplate, "Email Template");
	}

	public void clickEmailTemplateSearch(WebDriver driver)
	{
		BrowserActions.click(driver, btnEmailTemplateSearch, "Email template search");
	}

	public void clickSelectEmailTemplateFromSearchResult(WebDriver driver)
	{
		BrowserActions.click(driver, btnEmailTemplateSelect, "Email template Select");
	}

}
