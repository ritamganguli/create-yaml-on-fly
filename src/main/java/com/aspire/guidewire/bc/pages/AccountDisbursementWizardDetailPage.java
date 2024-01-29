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

public class AccountDisbursementWizardDetailPage extends LoadableComponent<AccountDisbursementWizardDetailPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
 	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
//	public TopNavBar topnavbar;
	@IFindBy(how = How.CSS, using = "input[name='AccountCreateDisbursementWizard-CreateDisbursementConfirmScreen-CreateDisbursementWizardApprovalActivityDV-EscalationDate']", AI = false)
	private WebElement inpEscalationDate;

	@IFindBy(how = How.CSS, using = "#AccountCreateDisbursementWizard-Prev>div[role='button']", AI = false)
	private WebElement btnBack;

	@IFindBy(how = How.CSS, using = "#AccountCreateDisbursementWizard-CreateDisbursementConfirmScreen-ApprovalActivityAlertBar-CloseBtn", AI = false)
	private WebElement btnClose;

	@IFindBy(how = How.CSS, using = "#AccountCreateDisbursementWizard-CreateDisbursementConfirmScreen-ttlBar", AI = false)
	private WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "input[name='AccountCreateDisbursementWizard-CreateDisbursementConfirmScreen-DisbursementConfirmPanelSet-AccountDisbursementConfirmDV-UnappliedFund']", AI = false)
	private WebElement inpUnappliedFund;

	@IFindBy(how = How.CSS, using = "#AccountCreateDisbursementWizard-Step1>div[role='menuitem']", AI = false)
	private WebElement btnDisbursementDetails;

	@IFindBy(how = How.CSS, using = "#AccountCreateDisbursementWizard-Step2>div[role='menuitem']", AI = false)
	private WebElement btnConfirmation;

	@IFindBy(how = How.CSS, using = "input[name='AccountCreateDisbursementWizard-CreateDisbursementConfirmScreen-CreateDisbursementWizardApprovalActivityDV-TargetDate']", AI = false)
	private WebElement inpTargetDate;

	@IFindBy(how = How.CSS, using = "#AccountCreateDisbursementWizard-CreateDisbursementConfirmScreen-CreateDisbursementWizardApprovalActivityDV-EscalationDate_dateIcon", AI = false)
	private WebElement btnEscalationDateDateIcon;

	@IFindBy(how = How.CSS, using = "#AccountCreateDisbursementWizard-Next>div[role='button']", AI = false)
	private WebElement btnNext;

	@IFindBy(how = How.CSS, using = "#AccountCreateDisbursementWizard-CreateDisbursementConfirmScreen-DisbursementConfirmPanelSet-AccountDisbursementConfirmDV-DueDate_dateIcon", AI = false)
	private WebElement btnDueDateDateIcon;

	@IFindBy(how = How.CSS, using = "#AccountCreateDisbursementWizard-CreateDisbursementConfirmScreen-ApprovalActivityAlertBar .gw-AlertBar--label", AI = false)
	private WebElement lblApprovalActivityAlertBar;

	@IFindBy(how = How.CSS, using = "input[name='AccountCreateDisbursementWizard-CreateDisbursementConfirmScreen-CreateDisbursementWizardApprovalActivityDV-Subject']", AI = false)
	private WebElement inpSubject;

	@IFindBy(how = How.CSS, using = "#AccountCreateDisbursementWizard-__crumb__", AI = false)
	private WebElement btnReturntoAccountSummary;

	@IFindBy(how = How.CSS, using = "#AccountCreateDisbursementWizard-CreateDisbursementConfirmScreen-CreateDisbursementWizardApprovalActivityDV-Description textarea", AI = false)
	private WebElement inpDescription;

	@IFindBy(how = How.CSS, using = "input[name='AccountCreateDisbursementWizard-CreateDisbursementConfirmScreen-CreateDisbursementWizardApprovalActivityDV-AssignedTo']", AI = false)
	private WebElement inpAssignedTo;

	@IFindBy(how = How.CSS, using = "#AccountCreateDisbursementWizard-Cancel>div[role='button']", AI = false)
	private WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "input[name='AccountCreateDisbursementWizard-CreateDisbursementConfirmScreen-DisbursementConfirmPanelSet-AccountDisbursementConfirmDV-Account']", AI = false)
	private WebElement inpAccount;

	@IFindBy(how = How.CSS, using = "#AccountCreateDisbursementWizard-Finish>div[role='button']", AI = false)
	private WebElement btnFinish;

	@IFindBy(how = How.CSS, using = "input[name='AccountCreateDisbursementWizard-CreateDisbursementConfirmScreen-DisbursementConfirmPanelSet-AccountDisbursementConfirmDV-AccountNumber']", AI = false)
	private WebElement inpAccount_1;

	@IFindBy(how = How.CSS, using = "select[name='AccountCreateDisbursementWizard-CreateDisbursementConfirmScreen-CreateDisbursementWizardApprovalActivityDV-Priority']", AI = false)
	private WebElement drpPriority;

	@IFindBy(how = How.CSS, using = "input[name='AccountCreateDisbursementWizard-CreateDisbursementConfirmScreen-DisbursementConfirmPanelSet-AccountDisbursementConfirmDV-DisbursementAmount']", AI = false)
	private WebElement inpDisbursementAmount;

	@IFindBy(how = How.CSS, using = "#AccountCreateDisbursementWizard-CreateDisbursementConfirmScreen-CreateDisbursementWizardApprovalActivityDV-TargetDate_dateIcon", AI = false)
	private WebElement btnTargetDateDateIcon;

	@IFindBy(how = How.CSS, using = "input[name='AccountCreateDisbursementWizard-CreateDisbursementConfirmScreen-DisbursementConfirmPanelSet-AccountDisbursementConfirmDV-DueDate']", AI = false)
	private WebElement inpDueDate;

	public AccountDisbursementWizardDetailPage(){
	}

	public AccountDisbursementWizardDetailPage(WebDriver driver){
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
		}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, btnFinish))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);
}public AccountDisbursementWizardDetailPage enterEscalationDate(WebDriver driver,String EscalationDate) {
		            BrowserActions.type(driver, inpEscalationDate,EscalationDate, "EscalationDate");
			        return this;
           }
public AccountDisbursementWizardDetailPage clickBack(WebDriver driver)  {
					BrowserActions.click(driver, btnBack,"Back");
				    return this;
			}
public AccountDisbursementWizardDetailPage clickClose(WebDriver driver)  {
					BrowserActions.click(driver, btnClose,"Close");
				    return this;
			}
public AccountDisbursementWizardDetailPage enterUnappliedFund(WebDriver driver,String UnappliedFund) {
		            BrowserActions.type(driver, inpUnappliedFund,UnappliedFund, "UnappliedFund");
			        return this;
           }
public AccountDisbursementWizardDetailPage clickDisbursementDetails(WebDriver driver)  {
					BrowserActions.click(driver, btnDisbursementDetails,"DisbursementDetails");
				    return this;
			}
public AccountDisbursementWizardDetailPage clickConfirmation(WebDriver driver)  {
					BrowserActions.click(driver, btnConfirmation,"Confirmation");
				    return this;
			}
public AccountDisbursementWizardDetailPage enterTargetDate(WebDriver driver,String TargetDate) {
		            BrowserActions.type(driver, inpTargetDate,TargetDate, "TargetDate");
			        return this;
           }
public AccountDisbursementWizardDetailPage clickEscalationDateDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnEscalationDateDateIcon,"EscalationDateDateIcon");
				    return this;
			}
public AccountDisbursementWizardDetailPage clickNext(WebDriver driver)  {
					BrowserActions.click(driver, btnNext,"Next");
				    return this;
			}
public AccountDisbursementWizardDetailPage clickDueDateDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnDueDateDateIcon,"DueDateDateIcon");
				    return this;
			}
public AccountDisbursementWizardDetailPage enterSubject(WebDriver driver,String Subject) {
		            BrowserActions.type(driver, inpSubject,Subject, "Subject");
			        return this;
           }
public AccountDisbursementWizardDetailPage clickReturntoAccountSummary(WebDriver driver)  {
					BrowserActions.click(driver, btnReturntoAccountSummary,"ReturntoAccountSummary");
				    return this;
			}
public AccountDisbursementWizardDetailPage enterDescription(WebDriver driver,String Description) {
		            BrowserActions.type(driver, inpDescription,Description, "Description");
			        return this;
           }
public AccountDisbursementWizardDetailPage enterAssignedTo(WebDriver driver,String AssignedTo) {
		            BrowserActions.type(driver, inpAssignedTo,AssignedTo, "AssignedTo");
			        return this;
           }
public AccountDisbursementWizardDetailPage clickCancel(WebDriver driver)  {
					BrowserActions.click(driver, btnCancel,"Cancel");
				    return this;
			}
public AccountDisbursementWizardDetailPage enterAccount(WebDriver driver,String Account) {
		            BrowserActions.type(driver, inpAccount,Account, "Account");
			        return this;
           }
public AccountDisbursementWizardDetailPage clickFinish(WebDriver driver)  {
					BrowserActions.click(driver, btnFinish,"Finish");
				    return this;
			}
public AccountDisbursementWizardDetailPage enterAccount_1(WebDriver driver,String Account_1) {
		            BrowserActions.type(driver, inpAccount_1,Account_1, "Account_1");
			        return this;
           }
public AccountDisbursementWizardDetailPage selectPriority(WebDriver driver,String Priority)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPriority,Priority,"Priority");
				    return this;
			}
public AccountDisbursementWizardDetailPage enterDisbursementAmount(WebDriver driver,String DisbursementAmount) {
		            BrowserActions.type(driver, inpDisbursementAmount,DisbursementAmount, "DisbursementAmount");
			        return this;
           }
public AccountDisbursementWizardDetailPage clickTargetDateDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnTargetDateDateIcon,"TargetDateDateIcon");
				    return this;
			}
public AccountDisbursementWizardDetailPage enterDueDate(WebDriver driver,String DueDate) {
		            BrowserActions.type(driver, inpDueDate,DueDate, "DueDate");
			        return this;
           }
}
