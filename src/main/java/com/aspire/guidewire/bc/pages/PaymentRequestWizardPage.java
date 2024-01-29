package com.aspire.guidewire.bc.pages;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.testng.Assert;

import ASPIREAI.customfactories.AjaxElementLocatorFactory;
import ASPIREAI.customfactories.PageFactory;
import com.aspire.guidewire.utils.BrowserActions;
import com.aspire.guidewire.utils.ElementLayer;
import com.aspire.guidewire.utils.Log;
import com.aspire.guidewire.utils.WaitUtils;

import ASPIREAI.customfactories.IFindBy;

public class PaymentRequestWizardPage extends LoadableComponent<PaymentRequestWizardPage> {
	
	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	@IFindBy(how = How.CSS, using = "input[name='AccountDetailNewPaymentRequestWizard-NewPaymentRequestScreen-PaymentRequestDV-paymentDate']", AI = false)
	public WebElement inpDraftDate;

	@IFindBy(how = How.CSS, using = "#AccountDetailNewPaymentRequestWizard-NewPaymentRequestScreen-PaymentRequestDV-totalUnderContract", AI = false)
	public WebElement lblTotalUnderContract;

	@IFindBy(how = How.CSS, using = "#AccountDetailNewPaymentRequestWizard-NewPaymentRequestScreen-ttlBar", AI = false)
	public WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "select[name='AccountDetailNewPaymentRequestWizard-NewPaymentRequestScreen-PaymentRequestDV-PaymentInstrument']", AI = false)
	public WebElement drpPaymentInstrument;

	@IFindBy(how = How.CSS, using = "#AccountDetailNewPaymentRequestWizard-NewPaymentRequestScreen-PaymentRequestDV-totalCurrentBilled", AI = false)
	public WebElement lblTotalCurrentlyBilled;

	@IFindBy(how = How.CSS, using = "input[name='AccountDetailNewPaymentRequestWizard-NewPaymentRequestScreen-PaymentRequestDV-accountName']", AI = false)
	public WebElement inpAccountName;

	@IFindBy(how = How.CSS, using = "#AccountDetailNewPaymentRequestWizard-__crumb__", AI = false)
	public WebElement btnReturntoAccountSummary;

	@IFindBy(how = How.CSS, using = "input[name='AccountDetailNewPaymentRequestWizard-NewPaymentRequestScreen-PaymentRequestDV-paymentDueDate']", AI = false)
	public WebElement inpCloseDate;

	@IFindBy(how = How.CSS, using = "#AccountDetailNewPaymentRequestWizard-NewPaymentRequestScreen-PaymentRequestDV-totalOutstanding", AI = false)
	public WebElement lblTotalOutstanding;

	@IFindBy(how = How.CSS, using = "input[name='AccountDetailNewPaymentRequestWizard-NewPaymentRequestScreen-PaymentRequestDV-accountNumber']", AI = false)
	public WebElement inpAccount;

	@IFindBy(how = How.CSS, using = "#AccountDetailNewPaymentRequestWizard-NewPaymentRequestScreen-PaymentRequestDV-PaymentInstrument-CreateNewPaymentInstrument", AI = false)
	public WebElement btnNew;

	@IFindBy(how = How.CSS, using = "#AccountDetailNewPaymentRequestWizard-NewPaymentRequestScreen-PaymentRequestDV-accountUnbilled", AI = false)
	public WebElement lblTotalUnbilled;

	@IFindBy(how = How.CSS, using = "input[name='AccountDetailNewPaymentRequestWizard-NewPaymentRequestScreen-PaymentRequestDV-amount']", AI = false)
	public WebElement inpAmount;

	@IFindBy(how = How.CSS, using = "#AccountDetailNewPaymentRequestWizard-NewPaymentRequestScreen-PaymentRequestDV-totalPastDue", AI = false)
	public WebElement lblTotalPastDue;
	
	@IFindBy(how = How.CSS, using = "#AccountDetailNewPaymentRequestWizard-Next", AI = false)
	public WebElement btnNext;
	
	@IFindBy(how = How.CSS, using = "#AccountDetailNewPaymentRequestWizard-Finish", AI = false)
	private WebElement btnFinish;
	
	public PaymentRequestWizardPage(){
	}
		
	public PaymentRequestWizardPage(WebDriver driver) {
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
			}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, drpPaymentInstrument))) {
				Log.fail("Page did not open up. Site might be down.", driver);
			}elementLayer = new ElementLayer(driver);
}
public PaymentRequestWizardPage enterDraftDate(WebDriver driver, String DraftDate) {
		            BrowserActions.type(driver, inpDraftDate,DraftDate, "DraftDate");
			        return this;
           }
public PaymentRequestWizardPage selectPaymentInstrument(WebDriver driver,String PaymentInstrument)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPaymentInstrument,PaymentInstrument,"PaymentInstrument");
				    return this;
			}
public PaymentRequestWizardPage enterAccountName(String AccountName) {
		            BrowserActions.type(driver, inpAccountName,AccountName, "AccountName");
			        return this;
           }
public PaymentRequestWizardPage clickReturntoAccountSummary(WebDriver driver)  {
					BrowserActions.click(driver, btnReturntoAccountSummary,"ReturntoAccountSummary");
				    return this;
			}
public PaymentRequestWizardPage enterCloseDate(String CloseDate) {
		            BrowserActions.type(driver, inpCloseDate,CloseDate, "CloseDate");
			        return this;
           }
public PaymentRequestWizardPage enterAccount(String Account) {
		            BrowserActions.type(driver, inpAccount,Account, "Account");
			        return this;
           }
public PaymentRequestWizardPage clickNew(WebDriver driver)  {
					BrowserActions.click(driver, btnNew,"New");
				    return this;
			}
public PaymentRequestWizardPage enterAmount(WebDriver driver, String Amount) {
    BrowserActions.type(driver, inpAmount, Amount, "Amount");
    return this;
}
public PaymentRequestWizardPage clickNext(WebDriver driver)  {
	BrowserActions.click(driver, btnNext,true,"Next");
    return this;
}
public PaymentRequestWizardPage clickFinish(WebDriver driver)  {
	BrowserActions.click(driver, btnFinish,"Finish");
    return this;
}

}
