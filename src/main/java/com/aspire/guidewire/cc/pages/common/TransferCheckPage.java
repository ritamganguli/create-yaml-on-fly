package com.aspire.guidewire.cc.pages.common;
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

public class TransferCheckPage extends LoadableComponent<TransferCheckPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
 	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
//	public TopNavBar topnavbar;
//	public CheckTransferPayments checktransferpaymentsTable;

	@IFindBy(how = How.CSS, using = "#CheckTransfer-CheckTransferScreen-CheckTransfer_TransferButton>div[role='button']", AI = false)
	private WebElement btnTransfer;

	@IFindBy(how = How.CSS, using = "#CheckTransfer-CheckTransferScreen-CheckTransferDV-CheckExchangeRateInputSet-Transaction_RateSet_Date_dateIcon", AI = false)
	private WebElement btnExchangeRateEffectiveDateDateIcon;

	@IFindBy(how = How.CSS, using = "select[name='CheckTransfer-CheckTransferScreen-CheckTransferDV-TargetReservingCurrency']", AI = false)
	private WebElement drpReservingCurrency;

	@IFindBy(how = How.CSS, using = "input[name='CheckTransfer-CheckTransferScreen-CheckTransferDV-CheckExchangeRateInputSet-Transaction_RateSet_Date']", AI = false)
	private WebElement inpExchangeRateEffectiveDate;

	@IFindBy(how = How.CSS, using = "input[name='CheckTransfer-CheckTransferScreen-CheckTransferDV-CheckNumber']", AI = false)
	private WebElement inpCheckNumber;

	@IFindBy(how = How.CSS, using = "input[name='CheckTransfer-CheckTransferScreen-CheckTransferDV-CheckExchangeRateInputSet-Transaction_ExchangeRateOverride']", AI = false)
	private WebElement rdbExchangeRateMode;

	@IFindBy(how = How.CSS, using = "input[name='CheckTransfer-CheckTransferScreen-CheckTransferDV-CheckTransferPaymentsLV-0-PaymentExposure']", AI = false)
	private WebElement inpExposure;

	@IFindBy(how = How.CSS, using = "input[name='CheckTransfer-CheckTransferScreen-CheckTransferDV-LinkedServiceRequestInvoicesMessage']", AI = false)
	private WebElement inpLinkedServiceRequestInvoicesMessage;

	@IFindBy(how = How.CSS, using = "input[name='CheckTransfer-CheckTransferScreen-CheckTransferDV-Claim']", AI = false)
	private WebElement inpClaim;

	@IFindBy(how = How.CSS, using = "select[name='CheckTransfer-CheckTransferScreen-CheckTransferDV-CheckTransferPaymentsLV-0-Coverage']", AI = false)
	private WebElement drpCoverage;

	@IFindBy(how = How.CSS, using = "input[name='CheckTransfer-CheckTransferScreen-CheckTransferDV-CheckTransferPaymentsLV-0-Comments']", AI = false)
	private WebElement inpComments_2;

	@IFindBy(how = How.CSS, using = "#CheckTransfer-CheckTransferScreen-CheckTransferDV-CheckTransferPaymentsLV-0-TransferPaymentViewDetail", AI = false)
	private WebElement btnTransferPaymentViewDetail;

	@IFindBy(how = How.CSS, using = "#CheckTransfer-CheckTransferScreen-CheckTransferDV-Claim-SelectClaim", AI = false)
	private WebElement btnSearch;

	@IFindBy(how = How.CSS, using = "input[name='CheckTransfer-CheckTransferScreen-CheckTransferDV-CheckExchangeRateInputSet-Transaction_ExchangeRate']", AI = false)
	private WebElement inpExchangeRate;

	@IFindBy(how = How.CSS, using = "input[name='CheckTransfer-CheckTransferScreen-CheckTransferDV-TransferPaymentsInstructions']", AI = false)
	private WebElement inpTransferPaymentsInstructions;

	@IFindBy(how = How.CSS, using = "input[name='CheckTransfer-CheckTransferScreen-CheckTransferDV-Comments']", AI = false)
	private WebElement inpComments;

	@IFindBy(how = How.CSS, using = "#CheckTransfer-CheckTransferScreen-ttlBar", AI = false)
	private WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "select[name='CheckTransfer-CheckTransferScreen-CheckTransferDV-CheckTransferPaymentsLV-0-ReservingCurrency']", AI = false)
	private WebElement drpReservingCurrency_1;

	@IFindBy(how = How.CSS, using = "input[name='CheckTransfer-CheckTransferScreen-CheckTransferDV-CheckExchangeRateInputSet-Transaction_RateSet_Description']", AI = false)
	private WebElement inpExchangeRateDescription;

	@IFindBy(how = How.CSS, using = "select[name='CheckTransfer-CheckTransferScreen-CheckTransferDV-CheckTransferPaymentsLV-0-CostType']", AI = false)
	private WebElement drpCostType;

	@IFindBy(how = How.CSS, using = "#CheckTransfer-CheckTransferScreen-Cancel>div[role='button']", AI = false)
	private WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "select[name='CheckTransfer-CheckTransferScreen-CheckTransferDV-CheckTransferPaymentsLV-0-CostCategory']", AI = false)
	private WebElement drpCostCategory;

	public TransferCheckPage(){
	}

	public TransferCheckPage(WebDriver driver){
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(finder, this);
//		checktransferpaymentsTable = new CheckTransferPayments();
}
@Override
	protected void load() {
		isPageLoaded = true;
		WaitUtils.waitForPageLoad(driver);
	}@Override
	protected void isLoaded() {
		if (!isPageLoaded) {
			Assert.fail();
		}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, drpCostCategory))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);
}public TransferCheckPage clickTransfer(WebDriver driver)  {
					BrowserActions.click(driver, btnTransfer,"Transfer");
				    return this;
			}
public TransferCheckPage clickExchangeRateEffectiveDateDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnExchangeRateEffectiveDateDateIcon,"ExchangeRateEffectiveDateDateIcon");
				    return this;
			}
public TransferCheckPage selectReservingCurrency(WebDriver driver,String ReservingCurrency)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpReservingCurrency,ReservingCurrency,"ReservingCurrency");
				    return this;
			}
public TransferCheckPage enterExchangeRateEffectiveDate(WebDriver driver,String ExchangeRateEffectiveDate) {
		            BrowserActions.type(driver, inpExchangeRateEffectiveDate,ExchangeRateEffectiveDate, "ExchangeRateEffectiveDate");
			        return this;
           }
public TransferCheckPage enterCheckNumber(WebDriver driver,String CheckNumber) {
		            BrowserActions.type(driver, inpCheckNumber,CheckNumber, "CheckNumber");
			        return this;
           }
public TransferCheckPage clickExchangeRateMode(WebDriver driver)  {
					BrowserActions.click(driver, rdbExchangeRateMode,"ExchangeRateMode");
				    return this;
			}
public TransferCheckPage enterExposure(WebDriver driver,String Exposure) {
		            BrowserActions.type(driver, inpExposure,Exposure, "Exposure");
			        return this;
           }
public TransferCheckPage enterLinkedServiceRequestInvoicesMessage(WebDriver driver,String LinkedServiceRequestInvoicesMessage) {
		            BrowserActions.type(driver, inpLinkedServiceRequestInvoicesMessage,LinkedServiceRequestInvoicesMessage, "LinkedServiceRequestInvoicesMessage");
			        return this;
           }
public TransferCheckPage enterClaim(WebDriver driver,String Claim) {
		            BrowserActions.type(driver, inpClaim,Claim, "Claim");
			        return this;
           }
public TransferCheckPage selectCoverage(WebDriver driver,String Coverage)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpCoverage,Coverage,"Coverage");
				    return this;
			}
public TransferCheckPage enterComments_2(WebDriver driver,String Comments_2) {
		            BrowserActions.type(driver, inpComments_2,Comments_2, "Comments_2");
			        return this;
           }
public TransferCheckPage clickTransferPaymentViewDetail(WebDriver driver)  {
					BrowserActions.click(driver, btnTransferPaymentViewDetail,"TransferPaymentViewDetail");
				    return this;
			}
public TransferCheckPage clickSearch(WebDriver driver)  {
					BrowserActions.click(driver, btnSearch,"Search");
				    return this;
			}
public TransferCheckPage enterExchangeRate(WebDriver driver,String ExchangeRate) {
		            BrowserActions.type(driver, inpExchangeRate,ExchangeRate, "ExchangeRate");
			        return this;
           }
public TransferCheckPage enterTransferPaymentsInstructions(WebDriver driver,String TransferPaymentsInstructions) {
		            BrowserActions.type(driver, inpTransferPaymentsInstructions,TransferPaymentsInstructions, "TransferPaymentsInstructions");
			        return this;
           }
public TransferCheckPage enterComments(WebDriver driver,String Comments) {
		            BrowserActions.type(driver, inpComments,Comments, "Comments");
			        return this;
           }
public TransferCheckPage selectReservingCurrency_1(WebDriver driver,String ReservingCurrency_1)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpReservingCurrency_1,ReservingCurrency_1,"ReservingCurrency_1");
				    return this;
			}
public TransferCheckPage enterExchangeRateDescription(WebDriver driver,String ExchangeRateDescription) {
		            BrowserActions.type(driver, inpExchangeRateDescription,ExchangeRateDescription, "ExchangeRateDescription");
			        return this;
           }
public TransferCheckPage selectCostType(WebDriver driver,String CostType)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpCostType,CostType,"CostType");
				    return this;
			}
public TransferCheckPage clickCancel(WebDriver driver)  {
					BrowserActions.click(driver, btnCancel,"Cancel");
				    return this;
			}
public TransferCheckPage selectCostCategory(WebDriver driver,String CostCategory)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpCostCategory,CostCategory,"CostCategory");
				    return this;
			}
}
