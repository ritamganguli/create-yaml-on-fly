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

public class ActionsPage extends LoadableComponent<ActionsPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
 	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
//	public TopNavBar topnavbar;
	
	@IFindBy(how = How.CSS, using = "div[id$='MenuActions'] div", AI = false)
	private WebElement btnAction;
	
	@IFindBy(how = How.CSS, using = "div[id$='_Payments']", AI = false)
	private WebElement btnNewPayments;
	
	@IFindBy(how = How.CSS, using = "div[id$='_NewTransaction']", AI = false)
	private WebElement btnNewTansaction;
	
	@IFindBy(how = How.CSS, using = "div[id$='_Disbursement']", AI = false)
	private WebElement btnDisbursement;
	
	@IFindBy(how = How.CSS, using = "div[id$='_NewDirectBillPayment']", AI = false)
	private WebElement btnNewDirectBillPayment;
	
	@IFindBy(how = How.CSS, using = "div[id$='AccountGroup_AccountDetailTroubleTickets']", AI = false)
	private WebElement btnTroubleTicket;

	@IFindBy(how = How.CSS, using = "div[id$='AccountDetailMenuActions_Writeoff']", AI = false)
	private WebElement btnWriteOff;

	@IFindBy(how = How.CSS, using = "div[id$='AccountDetailMenuActions_NegativeWriteoff']", AI = false)
	private WebElement btnNegativeWriteOff;

	@IFindBy(how = How.CSS, using = "div[id$='PaymentRequest']", AI = false)
	private WebElement btnPaymentRequest;
	
	@IFindBy(how = How.CSS, using = "div[id$='AccountDetailMenuActions_WriteoffReversal']", AI = false)
	private WebElement btnWriteOffReversal;
			
	public ActionsPage(){
	}

	public ActionsPage(WebDriver driver){
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
		}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, btnAction))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);
}
	public ActionsPage clickAction(WebDriver driver) {
		BrowserActions.click(driver, btnAction, "Actions");
		return this;
	}
	public ActionsPage moveToNewPayments(WebDriver driver) {
		BrowserActions.moveToElement(driver, btnNewPayments, "New Payments");
		return this;
	}
	public ActionsPage moveToNewTransaction(WebDriver driver) {
		BrowserActions.moveToElement(driver, btnNewTansaction, "New Payments");
		return this;
	}
	public AccountDisbursementWizardPage clickDisbursements(WebDriver driver) {
		BrowserActions.click(driver, btnDisbursement, "Disbursements");
		return new AccountDisbursementWizardPage(driver).get();
	}
	public DirectBillPaymentPage clickNewDirectBillPayment(WebDriver driver) {
		BrowserActions.click(driver, btnNewDirectBillPayment,"New Direct Bill Payment");
		return new DirectBillPaymentPage(driver).get();
	}
	
	public PaymentRequestWizardPage clickPaymentRequest(WebDriver driver) {
		BrowserActions.click(driver, btnPaymentRequest, "Payment Request");
		return new PaymentRequestWizardPage(driver).get();
	}

	public ActionsPage clickTroubleTicket(WebDriver driver) {
		BrowserActions.click(driver, btnTroubleTicket, "Trouble Ticket");
		return this;
	}

	public void clickWriteOff(WebDriver driver) {
		BrowserActions.click(driver, btnWriteOff, "Write off");
	}

	public void clickNegativeWriteOff(WebDriver driver) {
		BrowserActions.click(driver, btnNegativeWriteOff, "Negative Write off");
	}
	
	public void clickWriteOffReversal(WebDriver driver) {
		BrowserActions.click(driver, btnWriteOffReversal, "Write off reversal");
	}
	
	

}
