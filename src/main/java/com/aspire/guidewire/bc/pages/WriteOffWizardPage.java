package com.aspire.guidewire.bc.pages;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
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

public class WriteOffWizardPage extends LoadableComponent<WriteOffWizardPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
 	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
//	public TopNavBar topnavbar;
//	public AccountNewWriteoffWizardTargetStepScreen accountnewwriteoffwizardtargetstepscreenTable;

	@IFindBy(how = How.CSS, using = "#AccountNewWriteoffWizard-AccountNewWriteoffWizardTargetStepScreen-TransferSourceDV-AccountPolicyPeriodsLV-0-PolicyPerExpirDate_dateIcon", AI = false)
	private WebElement btnExpirationDateDateIcon;

	@IFindBy(how = How.CSS, using = "#AccountNewWriteoffWizard-AccountNewWriteoffWizardTargetStepScreen-ttlBar", AI = false)
	private WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "input[name='AccountNewWriteoffWizard-AccountNewWriteoffWizardTargetStepScreen-TransferSourceDV-AccountPolicyPeriodsLV-0-PolicyPerEffDate']", AI = false)
	private WebElement inpEffectiveDate;

	@IFindBy(how = How.CSS, using = "#AccountNewWriteoffWizard-ConfirmationStep>div[role='menuitem']", AI = false)
	private WebElement btnConfirmation;

	@IFindBy(how = How.CSS, using = "#AccountNewWriteoffWizard-TargetStep>div[role='menuitem']", AI = false)
	private WebElement btnTarget;

	@IFindBy(how = How.CSS, using = "input[name='AccountNewWriteoffWizard-AccountNewWriteoffWizardTargetStepScreen-TransferSourceDV-AccountPolicyPeriodsLV-0-PolicyPerExpirDate']", AI = false)
	private WebElement inpExpirationDate;

	@IFindBy(how = How.CSS, using = "input[name='AccountNewWriteoffWizard-AccountNewWriteoffWizardTargetStepScreen-TransferSourceDV-AccountPolicyPeriodsLV-1-PolicyPerEffDate']", AI = false)
	private WebElement inpEffectiveDate_3;

	@IFindBy(how = How.CSS, using = "#AccountNewWriteoffWizard-AccountNewWriteoffWizardTargetStepScreen-TransferSourceDV-AccountPolicyPeriodsLV-0-PolicyPerEffDate_dateIcon", AI = false)
	private WebElement btnEffectiveDateDateIcon;

	@IFindBy(how = How.CSS, using = "#AccountNewWriteoffWizard-Finish>div[role='button']", AI = false)
	private WebElement btnFinish;

	@IFindBy(how = How.CSS, using = "#AccountNewWriteoffWizard-Prev>div[role='button']", AI = false)
	private WebElement btnBack;

	@IFindBy(how = How.CSS, using = "input[name='AccountNewWriteoffWizard-AccountNewWriteoffWizardTargetStepScreen-TransferSourceDV-AccountPolicyPeriodsLV-0-Number']", AI = false)
	private WebElement inpPolicy;

	@IFindBy(how = How.CSS, using = "input[name='AccountNewWriteoffWizard-AccountNewWriteoffWizardTargetStepScreen-TransferSourceDV-SourcePolicy']", AI = false)
	private WebElement inpSelectedPolicy;

	@IFindBy(how = How.CSS, using = "input[name='AccountNewWriteoffWizard-AccountNewWriteoffWizardTargetStepScreen-TransferSourceDV-AccountPolicyPeriodsLV-2-PolicyPerExpirDate']", AI = false)
	private WebElement inpExpirationDate_11;

	@IFindBy(how = How.CSS, using = "#AccountNewWriteoffWizard-Next>div[role='button']", AI = false)
	private WebElement btnNext;

	@IFindBy(how = How.CSS, using = "input[name='AccountNewWriteoffWizard-AccountNewWriteoffWizardTargetStepScreen-TransferSourceDV-AccountPolicyPeriodsLV-1-PolicyPerExpirDate']", AI = false)
	private WebElement inpExpirationDate_5;

	@IFindBy(how = How.CSS, using = "#AccountNewWriteoffWizard-AccountNewWriteoffWizardTargetStepScreen-TransferSourceDV-AccountPolicyPeriodsLV-2-Select", AI = false)
	private WebElement btnSelect_7;

	@IFindBy(how = How.CSS, using = "#AccountNewWriteoffWizard-__crumb__", AI = false)
	private WebElement btnReturntoAccountSummary;

	@IFindBy(how = How.CSS, using = "#AccountNewWriteoffWizard-AccountNewWriteoffWizardTargetStepScreen-TransferSourceDV-AccountPolicyPeriodsLV-1-PolicyPerEffDate_dateIcon", AI = false)
	private WebElement btnEffectiveDateDateIcon_4;

	@IFindBy(how = How.CSS, using = "input[name='AccountNewWriteoffWizard-AccountNewWriteoffWizardTargetStepScreen-TransferSourceDV-AccountPolicyPeriodsLV-1-Number']", AI = false)
	private WebElement inpPolicy_2;

	@IFindBy(how = How.CSS, using = "#AccountNewWriteoffWizard-AccountNewWriteoffWizardTargetStepScreen-TransferSourceDV-AccountPolicyPeriodsLV-1-Select", AI = false)
	private WebElement btnSelect_1;

	@IFindBy(how = How.CSS, using = "#AccountNewWriteoffWizard-Cancel>div[role='button']", AI = false)
	private WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "#AccountNewWriteoffWizard-DetailsStep>div[role='menuitem']", AI = false)
	private WebElement btnDetails;

	@IFindBy(how = How.CSS, using = "input[name='AccountNewWriteoffWizard-AccountNewWriteoffWizardTargetStepScreen-TransferSourceDV-AccountPolicyPeriodsLV-2-PolicyPerEffDate']", AI = false)
	private WebElement inpEffectiveDate_9;

	@IFindBy(how = How.CSS, using = "input[name='AccountNewWriteoffWizard-AccountNewWriteoffWizardTargetStepScreen-TransferSourceDV-AccountPolicyPeriodsLV-2-Number']", AI = false)
	private WebElement inpPolicy_8;

	@IFindBy(how = How.CSS, using = "#AccountNewWriteoffWizard-AccountNewWriteoffWizardTargetStepScreen-TransferSourceDV-AccountPolicyPeriodsLV-2-PolicyPerExpirDate_dateIcon", AI = false)
	private WebElement btnExpirationDateDateIcon_12;

	@IFindBy(how = How.CSS, using = "input[name='AccountNewWriteoffWizard-AccountNewWriteoffWizardTargetStepScreen-TransferSourceDV-SourceAccount']", AI = false)
	private WebElement inpSelectedAccount;

	@IFindBy(how = How.CSS, using = "#AccountNewWriteoffWizard-AccountNewWriteoffWizardTargetStepScreen-TransferSourceDV-AccountPolicyPeriodsLV_tb-AccountTAccountOwner>div[role='button']", AI = false)
	private WebElement btnSetAccountAsTargetofWriteOff;

	@IFindBy(how = How.CSS, using = "#AccountNewWriteoffWizard-AccountNewWriteoffWizardTargetStepScreen-TransferSourceDV-AccountPolicyPeriodsLV-2-PolicyPerEffDate_dateIcon", AI = false)
	private WebElement btnEffectiveDateDateIcon_10;

	@IFindBy(how = How.CSS, using = "#AccountNewWriteoffWizard-AccountNewWriteoffWizardTargetStepScreen-TransferSourceDV-AccountPolicyPeriodsLV-1-PolicyPerExpirDate_dateIcon", AI = false)
	private WebElement btnExpirationDateDateIcon_6;
	
	@IFindBy(how = How.CSS, using = "select[name='AccountNewWriteoffWizard-NewWriteoffWizardDetailsStepScreen-WriteoffDetailsDV-ChargePattern']", AI = false)
	private WebElement drpChargePattern;

	@IFindBy(how = How.CSS, using = "input[name='AccountNewWriteoffWizard-NewWriteoffWizardDetailsStepScreen-WriteoffDetailsDV-Amount']", AI = false)
	private WebElement inpAmount;

	@IFindBy(how = How.CSS, using = "input[name='AccountNewWriteoffWizard-NewWriteoffWizardDetailsStepScreen-MinimalTAccountOwnerDetailsDV-OutstandingAmount']", AI = false)
	private WebElement inpOutstanding;

	@IFindBy(how = How.CSS, using = "input[name='AccountNewWriteoffWizard-NewWriteoffWizardDetailsStepScreen-MinimalTAccountOwnerDetailsDV-Account']", AI = false)
	private WebElement inpAccount;

	@IFindBy(how = How.CSS, using = "input[name='AccountNewWriteoffWizard-NewWriteoffWizardDetailsStepScreen-MinimalTAccountOwnerDetailsDV-PastDueAmount']", AI = false)
	private WebElement inpPastDue;

	@IFindBy(how = How.CSS, using = "input[name='AccountNewWriteoffWizard-NewWriteoffWizardDetailsStepScreen-MinimalTAccountOwnerDetailsDV-BilledAmount']", AI = false)
	private WebElement inpCurrent;

	@IFindBy(how = How.CSS, using = "select[name='AccountNewWriteoffWizard-NewWriteoffWizardDetailsStepScreen-WriteoffDetailsDV-Reason']", AI = false)
	private WebElement drpReason;

	@IFindBy(how = How.CSS, using = "input[name='AccountNewWriteoffWizard-NewWriteoffWizardDetailsStepScreen-MinimalTAccountOwnerDetailsDV-Insured']", AI = false)
	private WebElement inpName;

	@IFindBy(how = How.CSS, using = "input[name='AccountNewWriteoffWizard-NewWriteoffWizardDetailsStepScreen-MinimalTAccountOwnerDetailsDV-UnpaidAmount']", AI = false)
	private WebElement inpUnpaid;

	@IFindBy(how = How.CSS, using = "input[name='AccountNewWriteoffWizard-NewWriteoffWizardDetailsStepScreen-MinimalTAccountOwnerDetailsDV-UnappliedAmount']", AI = false)
	private WebElement inpUnapplied;

	@IFindBy(how = How.CSS, using = "input[name='AccountNewWriteoffWizard-NewWriteoffWizardDetailsStepScreen-WriteoffDetailsDV-UseFullAmount']", AI = false)
	private WebElement chkAll;

	@IFindBy(how = How.CSS, using = "input[name='AccountNewWriteoffWizard-NewWriteoffWizardDetailsStepScreen-MinimalTAccountOwnerDetailsDV-UnbilledAmount']", AI = false)
	private WebElement inpUnbilled;
	
	@IFindBy(how = How.CSS, using = "input[name='AccountNewWriteoffWizard-NewWriteoffWizardConfirmationStepScreen-ApprovalActivityDV-TargetDate']", AI = false)
	private WebElement inpTargetDate;

	@IFindBy(how = How.CSS, using = "#AccountNewWriteoffWizard-NewWriteoffWizardConfirmationStepScreen-ApprovalActivityAlertBar .gw-AlertBar--label", AI = false)
	private WebElement lblApprovalActivityAlertBar;

	@IFindBy(how = How.CSS, using = "#AccountNewWriteoffWizard-NewWriteoffWizardConfirmationStepScreen-ApprovalActivityDV-Description textarea", AI = false)
	private WebElement inpDescription;

	@IFindBy(how = How.CSS, using = "#AccountNewWriteoffWizard-NewWriteoffWizardConfirmationStepScreen-ApprovalActivityAlertBar-CloseBtn", AI = false)
	private WebElement btnClose_1;

	@IFindBy(how = How.CSS, using = "input[name='AccountNewWriteoffWizard-NewWriteoffWizardConfirmationStepScreen-ApprovalActivityDV-EscalationDate']", AI = false)
	private WebElement inpEscalationDate;

	@IFindBy(how = How.CSS, using = "#AccountNewWriteoffWizard-NewWriteoffWizardConfirmationStepScreen-NullAmountAlertBar-CloseBtn", AI = false)
	private WebElement btnClose;

	@IFindBy(how = How.CSS, using = "#AccountNewWriteoffWizard-NewWriteoffWizardConfirmationStepScreen-ApprovalActivityDV-EscalationDate_dateIcon", AI = false)
	private WebElement btnEscalationDateDateIcon;

	@IFindBy(how = How.CSS, using = "#AccountNewWriteoffWizard-NewWriteoffWizardConfirmationStepScreen-NullAmountAlertBar .gw-AlertBar--label", AI = false)
	private WebElement lblNullAmountAlertBar;

	@IFindBy(how = How.CSS, using = "input[name='AccountNewWriteoffWizard-NewWriteoffWizardConfirmationStepScreen-ApprovalActivityDV-Subject']", AI = false)
	private WebElement inpSubject;

	@IFindBy(how = How.CSS, using = "input[name='AccountNewWriteoffWizard-NewWriteoffWizardConfirmationStepScreen-ApprovalActivityDV-AssignedTo']", AI = false)
	private WebElement inpAssignedTo;

	@IFindBy(how = How.CSS, using = "select[name='AccountNewWriteoffWizard-NewWriteoffWizardConfirmationStepScreen-ApprovalActivityDV-Priority']", AI = false)
	private WebElement drpPriority;

	@IFindBy(how = How.CSS, using = "#AccountNewWriteoffWizard-NewWriteoffWizardConfirmationStepScreen-ApprovalActivityDV-TargetDate_dateIcon", AI = false)
	private WebElement btnTargetDateDateIcon;

	@IFindBy(how = How.CSS, using = "div[id$='AccountPolicyPeriodsLV-0-Select']", AI = false)
	private WebElement btnSelect;
	
	@IFindBy(how = How.CSS, using = "div[id$='postLabel']", AI = false)
	public WebElement lblLastPageNo;
	
	@IFindBy(how = How.CSS, using = "div[id$='ListPaging-next']", AI = false)
	public WebElement btnNextArrow;


	public WriteOffWizardPage(){
	}

	public WriteOffWizardPage(WebDriver driver) {
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(finder, this);
//		accountnewwriteoffwizardtargetstepscreenTable = new AccountNewWriteoffWizardTargetStepScreen();
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
}public WriteOffWizardPage clickExpirationDateDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnExpirationDateDateIcon,"ExpirationDateDateIcon");
				    return this;
			}
public WriteOffWizardPage enterEffectiveDate(WebDriver driver,String EffectiveDate) {
		            BrowserActions.type(driver, inpEffectiveDate,EffectiveDate, "EffectiveDate");
			        return this;
           }
public WriteOffWizardPage clickConfirmation(WebDriver driver)  {
					BrowserActions.click(driver, btnConfirmation,"Confirmation");
				    return this;
			}
public WriteOffWizardPage clickTarget(WebDriver driver)  {
					BrowserActions.click(driver, btnTarget,"Target");
				    return this;
			}
public WriteOffWizardPage enterExpirationDate(WebDriver driver,String ExpirationDate) {
		            BrowserActions.type(driver, inpExpirationDate,ExpirationDate, "ExpirationDate");
			        return this;
           }
public WriteOffWizardPage enterEffectiveDate_3(WebDriver driver,String EffectiveDate_3) {
		            BrowserActions.type(driver, inpEffectiveDate_3,EffectiveDate_3, "EffectiveDate_3");
			        return this;
           }
public WriteOffWizardPage clickEffectiveDateDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnEffectiveDateDateIcon,"EffectiveDateDateIcon");
				    return this;
			}
public AccountSummaryPage clickFinish(WebDriver driver)  {
	BrowserActions.click(driver, btnFinish,true,"Finish");
    return 	new AccountSummaryPage(driver).get();
			}
public WriteOffWizardPage clickBack(WebDriver driver)  {
					BrowserActions.click(driver, btnBack,"Back");
				    return this;
			}
public WriteOffWizardPage enterPolicy(WebDriver driver,String Policy) {
		            BrowserActions.type(driver, inpPolicy,Policy, "Policy");
			        return this;
           }
public WriteOffWizardPage enterSelectedPolicy(WebDriver driver,String SelectedPolicy) {
		            BrowserActions.type(driver, inpSelectedPolicy,SelectedPolicy, "SelectedPolicy");
			        return this;
           }
public WriteOffWizardPage enterExpirationDate_11(WebDriver driver,String ExpirationDate_11) {
		            BrowserActions.type(driver, inpExpirationDate_11,ExpirationDate_11, "ExpirationDate_11");
			        return this;
           }
public WriteOffWizardPage clickNext(WebDriver driver)  {
					BrowserActions.click(driver, btnNext,true,"Next");
				    return this;
			}
public WriteOffWizardPage enterExpirationDate_5(WebDriver driver,String ExpirationDate_5) {
		            BrowserActions.type(driver, inpExpirationDate_5,ExpirationDate_5, "ExpirationDate_5");
			        return this;
           }
public WriteOffWizardPage clickSelect_7(WebDriver driver)  {
					BrowserActions.click(driver, btnSelect_7,"Select_7");
				    return this;
			}
public WriteOffWizardPage clickReturntoAccountSummary(WebDriver driver)  {
					BrowserActions.click(driver, btnReturntoAccountSummary,"ReturntoAccountSummary");
				    return this;
			}
public WriteOffWizardPage clickEffectiveDateDateIcon_4(WebDriver driver)  {
					BrowserActions.click(driver, btnEffectiveDateDateIcon_4,"EffectiveDateDateIcon_4");
				    return this;
			}
public WriteOffWizardPage enterPolicy_2(WebDriver driver,String Policy_2) {
		            BrowserActions.type(driver, inpPolicy_2,Policy_2, "Policy_2");
			        return this;
           }
public WriteOffWizardPage clickSelect_1(WebDriver driver)  {
					BrowserActions.click(driver, btnSelect_1,"Select_1");
				    return this;
			}
public WriteOffWizardPage clickCancel(WebDriver driver)  {
					BrowserActions.click(driver, btnCancel,"Cancel");
				    return this;
			}
public WriteOffWizardPage clickSelect(WebDriver driver)  {
					BrowserActions.click(driver, btnSelect,"Select");
				    return this;
			}
public WriteOffWizardPage clickDetails(WebDriver driver)  {
					BrowserActions.click(driver, btnDetails,"Details");
				    return this;
			}
public WriteOffWizardPage enterEffectiveDate_9(WebDriver driver,String EffectiveDate_9) {
		            BrowserActions.type(driver, inpEffectiveDate_9,EffectiveDate_9, "EffectiveDate_9");
			        return this;
           }
public WriteOffWizardPage enterPolicy_8(WebDriver driver,String Policy_8) {
		            BrowserActions.type(driver, inpPolicy_8,Policy_8, "Policy_8");
			        return this;
           }
public WriteOffWizardPage clickExpirationDateDateIcon_12(WebDriver driver)  {
					BrowserActions.click(driver, btnExpirationDateDateIcon_12,"ExpirationDateDateIcon_12");
				    return this;
			}
public WriteOffWizardPage enterSelectedAccount(WebDriver driver,String SelectedAccount) {
		            BrowserActions.type(driver, inpSelectedAccount,SelectedAccount, "SelectedAccount");
			        return this;
           }
public WriteOffWizardPage clickSetAccountAsTargetofWriteOff(WebDriver driver)  {
					BrowserActions.click(driver, btnSetAccountAsTargetofWriteOff,"SetAccountAsTargetofWriteOff");
				    return this;
			}
public WriteOffWizardPage clickEffectiveDateDateIcon_10(WebDriver driver)  {
					BrowserActions.click(driver, btnEffectiveDateDateIcon_10,"EffectiveDateDateIcon_10");
				    return this;
			}
public WriteOffWizardPage clickExpirationDateDateIcon_6(WebDriver driver)  {
					BrowserActions.click(driver, btnExpirationDateDateIcon_6,"ExpirationDateDateIcon_6");
				    return this;
			}
public WriteOffWizardPage selectChargePattern(WebDriver driver,String ChargePattern)  {
	BrowserActions.selectDropDownByVisibleText(driver, drpChargePattern,ChargePattern,true,"ChargePattern");
    return this;
}

public WriteOffWizardPage enterAmount(WebDriver driver,String Amount) {
    BrowserActions.type(driver, inpAmount,Amount,true, "Amount");
    return this;
}
public WriteOffWizardPage enterOutstanding(WebDriver driver,String Outstanding) {
    BrowserActions.type(driver, inpOutstanding,Outstanding, "Outstanding");
    return this;
}
public WriteOffWizardPage enterAccount(WebDriver driver,String Account) {
    BrowserActions.type(driver, inpAccount,Account, "Account");
    return this;
}

public WriteOffWizardPage enterPastDue(WebDriver driver,String PastDue) {
    BrowserActions.type(driver, inpPastDue,PastDue, "PastDue");
    return this;
}
public WriteOffWizardPage enterCurrent(WebDriver driver,String Current) {
    BrowserActions.type(driver, inpCurrent,Current, "Current");
    return this;
}

public WriteOffWizardPage selectReason(WebDriver driver,String Reason)  {
	BrowserActions.selectDropDownByVisibleText(driver, drpReason,Reason,true,"Reason");
    return this;
}
public WriteOffWizardPage enterName(WebDriver driver,String Name) {
    BrowserActions.type(driver, inpName,Name, "Name");
    return this;
}

public WriteOffWizardPage enterUnpaid(WebDriver driver,String Unpaid) {
    BrowserActions.type(driver, inpUnpaid,Unpaid, "Unpaid");
    return this;
}
public WriteOffWizardPage enterUnapplied(WebDriver driver,String Unapplied) {
    BrowserActions.type(driver, inpUnapplied,Unapplied, "Unapplied");
    return this;
}

public WriteOffWizardPage clickAllCheckbox(WebDriver driver)  {
	BrowserActions.click(driver, chkAll,true,"All Check box");
    return this;
}
public WriteOffWizardPage enterUnbilled(WebDriver driver,String Unbilled) {
    BrowserActions.type(driver, inpUnbilled,Unbilled, "Unbilled");
    return this;
}

public WriteOffWizardPage enterTargetDate(WebDriver driver,String TargetDate) {
    BrowserActions.type(driver, inpTargetDate,TargetDate, "TargetDate");
    return this;
}

public WriteOffWizardPage enterDescription(WebDriver driver,String Description) {
    BrowserActions.type(driver, inpDescription,Description, "Description");
    return this;
}
public WriteOffWizardPage clickClose_1(WebDriver driver)  {
	BrowserActions.click(driver, btnClose_1,"Close_1");
    return this;
}

public WriteOffWizardPage enterEscalationDate(WebDriver driver,String EscalationDate) {
    BrowserActions.type(driver, inpEscalationDate,EscalationDate, "EscalationDate");
    return this;
}

public WriteOffWizardPage clickClose(WebDriver driver)  {
	BrowserActions.click(driver, btnClose,"Close");
    return this;
}
public WriteOffWizardPage clickEscalationDateDateIcon(WebDriver driver)  {
	BrowserActions.click(driver, btnEscalationDateDateIcon,"EscalationDateDateIcon");
    return this;
}

public WriteOffWizardPage enterSubject(WebDriver driver,String Subject) {
    BrowserActions.type(driver, inpSubject,Subject, "Subject");
    return this;
}

public WriteOffWizardPage enterAssignedTo(WebDriver driver,String AssignedTo) {
    BrowserActions.type(driver, inpAssignedTo,AssignedTo, "AssignedTo");
    return this;
}

public WriteOffWizardPage selectPriority(WebDriver driver,String Priority)  {
	BrowserActions.selectDropDownByVisibleText(driver, drpPriority,Priority,"Priority");
    return this;
}
public WriteOffWizardPage clickTargetDateDateIcon(WebDriver driver)  {
	BrowserActions.click(driver, btnTargetDateDateIcon,"TargetDateDateIcon");
    return this;
}

public WriteOffWizardPage clickSelectPolicyNo(WebDriver driver, String policyNo)  {
	By selectBtnBy = By.xpath("//div[text()='"+policyNo+"-1']//ancestor::td[contains(@id,'Number_Cell')]//preceding-sibling::td//descendant::div[contains(@id,'Select')]");
	BrowserActions.waitForElementToDisplay(driver, selectBtnBy, "name check box");
	WebElement selectBtn = selectBtnBy.findElement(driver);
	BrowserActions.click(driver, selectBtn,"Policy is selected");
    return this;
}
}
