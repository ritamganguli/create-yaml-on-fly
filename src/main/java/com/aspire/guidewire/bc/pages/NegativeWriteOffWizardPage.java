package com.aspire.guidewire.bc.pages;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;

import com.aspire.guidewire.utils.BrowserActions;

import ASPIREAI.customfactories.AjaxElementLocatorFactory;
import ASPIREAI.customfactories.IFindBy;
import ASPIREAI.customfactories.PageFactory;

public class NegativeWriteOffWizardPage {

	WebDriver driver;
	String elementIdentifier;
	String elementObject;
	HashMap<String, String> getPageObjects;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	@IFindBy(how = How.CSS, using = "#AccountNewNegativeWriteoffWizard-NewNegativeWriteoffWizardDetailsStepScreen-MinimalTAccountOwnerDetailsDV-UnappliedAmount", AI = true)
	public WebElement lblUnapplied;

	@IFindBy(how = How.CSS, using = "#AccountNewNegativeWriteoffWizard-NewNegativeWriteoffWizardDetailsStepScreen-ttlBar", AI = true)
	public WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "input[name='AccountNewNegativeWriteoffWizard-NewNegativeWriteoffWizardDetailsStepScreen-MinimalTAccountOwnerDetailsDV-Insured']", AI = true)
	public WebElement inpName;

	@IFindBy(how = How.CSS, using = "#AccountNewNegativeWriteoffWizard-NewNegativeWriteoffWizardDetailsStepScreen-MinimalTAccountOwnerDetailsDV-OutstandingAmount", AI = true)
	public WebElement lblOutstanding;

	@IFindBy(how = How.CSS, using = "#AccountNewNegativeWriteoffWizard-NewNegativeWriteoffWizardDetailsStepScreen-MinimalTAccountOwnerDetailsDV-UnbilledAmount", AI = true)
	public WebElement lblUnbilled;

	@IFindBy(how = How.CSS, using = "#AccountNewNegativeWriteoffWizard-__crumb__", AI = true)
	public WebElement btnReturntoAccountSummary;

	@IFindBy(how = How.CSS, using = "#AccountNewNegativeWriteoffWizard-NewNegativeWriteoffWizardDetailsStepScreen-MinimalTAccountOwnerDetailsDV-BilledAmount", AI = true)
	public WebElement lblCurrent;

	@IFindBy(how = How.CSS, using = "input[name='AccountNewNegativeWriteoffWizard-NewNegativeWriteoffWizardDetailsStepScreen-MinimalTAccountOwnerDetailsDV-Account']", AI = true)
	public WebElement inpAccount;

	@IFindBy(how = How.CSS, using = "select[name='AccountNewNegativeWriteoffWizard-NewNegativeWriteoffWizardDetailsStepScreen-AccountDesignatedUnappliedInputs-UnappliedFund']", AI = true)
	public WebElement drpUnappliedFund;

	@IFindBy(how = How.CSS, using = "#AccountNewNegativeWriteoffWizard-NewNegativeWriteoffWizardDetailsStepScreen-MinimalTAccountOwnerDetailsDV-UnpaidAmount", AI = true)
	public WebElement lblUnpaid;

	@IFindBy(how = How.CSS, using = "input[name='AccountNewNegativeWriteoffWizard-NewNegativeWriteoffWizardDetailsStepScreen-NewNegativeWriteoffDetailsDV-UseFullAmount']", AI = true)
	public WebElement chkFullAmount000;

	@IFindBy(how = How.CSS, using = "#AccountNewNegativeWriteoffWizard-NewNegativeWriteoffWizardDetailsStepScreen-MinimalTAccountOwnerDetailsDV-PastDueAmount", AI = true)
	public WebElement lblPastDue;

	@IFindBy(how = How.CSS, using = "#AccountNewNegativeWriteoffWizard-NewNegativeWriteoffWizardDetailsStepScreen-NewNegativeWriteoffDetailsDV-Amount", AI = true)
	public WebElement lblAmount;

	@IFindBy(how = How.CSS, using = "div[id$='Next']", AI = true)
	public WebElement btnNext;

	@IFindBy(how = How.CSS, using = "div[id$='Finish']", AI = true)
	public WebElement btnFinish;

	@IFindBy(how = How.CSS, using = "input[name$='Amount']", AI = true)
	public WebElement txtAmount;

	public NegativeWriteOffWizardPage(){
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(finder, this);
	}

	public NegativeWriteOffWizardPage(WebDriver driver) {
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(finder, this);
	}

	public NegativeWriteOffWizardPage enterName(String Name) {
		BrowserActions.type(driver, inpName,Name, "Name");
		return this;
	}
	public NegativeWriteOffWizardPage clickReturntoAccountSummary(WebDriver driver)  {
		BrowserActions.click(driver, btnReturntoAccountSummary,"ReturntoAccountSummary");
		return this;
	}
	public NegativeWriteOffWizardPage enterAccount(WebDriver driver,String Account) {
		BrowserActions.type(driver, inpAccount,Account, "Account");
		return this;
	}
	public NegativeWriteOffWizardPage selectUnappliedFund(WebDriver driver,String UnappliedFund)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpUnappliedFund,UnappliedFund,"UnappliedFund");
		return this;
	}
	public NegativeWriteOffWizardPage clickFullAmount000(WebDriver driver)  {
		BrowserActions.click(driver, chkFullAmount000,"FullAmount000");
		return this;
	}
	public NegativeWriteOffWizardPage clickNext(WebDriver driver)  {
		BrowserActions.click(driver, btnNext,"Next");
		return this;
	}
	public NegativeWriteOffWizardPage clickFinish(WebDriver driver)  {
		BrowserActions.click(driver, btnFinish,"Finish");
		return this;
	}
	public NegativeWriteOffWizardPage enterAmount(WebDriver driver,String amount) {
		BrowserActions.type(driver, inpAccount,amount, "Amount");
		return this;
	}

}
