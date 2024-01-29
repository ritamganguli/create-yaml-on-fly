package com.aspire.guidewire.cc.pages.common;
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

public class FinancialsTransactionsPage extends LoadableComponent<FinancialsTransactionsPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
 	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
//	public TopNavBar topnavbar;
//	public TransactionsLVreserve transactionslvreserveTable;

	@IFindBy(how = How.CSS, using = "select[name='ClaimFinancialsTransactions-ClaimFinancialsTransactionsScreen-TransactionsLV-1-Status']", AI = false)
	private WebElement drpStatus_9;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsTransactions-ClaimFinancialsTransactionsScreen-ttlBar", AI = false)
	private WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "input[name='ClaimFinancialsTransactions-ClaimFinancialsTransactionsScreen-TransactionsLV-0-Exposure']", AI = false)
	private WebElement inpExposure;

	@IFindBy(how = How.CSS, using = "select[name='ClaimFinancialsTransactions-ClaimFinancialsTransactionsScreen-TransactionsLV-1-CostType']", AI = false)
	private WebElement drpCostType_6;

	@IFindBy(how = How.CSS, using = "select[name='ClaimFinancialsTransactions-ClaimFinancialsTransactionsScreen-TransactionsLV-1-CoverageType']", AI = false)
	private WebElement drpCoverage_5;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsTransactions-ClaimFinancialsTransactionsScreen-TransactionsLV-1-CreateDate_dateIcon", AI = false)
	private WebElement btnCreateDateDateIcon_2;

	@IFindBy(how = How.CSS, using = "input[name='ClaimFinancialsTransactions-ClaimFinancialsTransactionsScreen-TransactionsLV-0-CreateDate']", AI = false)
	private WebElement inpCreateDate;

	@IFindBy(how = How.CSS, using = "select[name='ClaimFinancialsTransactions-ClaimFinancialsTransactionsScreen-TransactionsLV-1-CostCategory']", AI = false)
	private WebElement drpCostCategory_7;

	@IFindBy(how = How.CSS, using = "input[name='ClaimFinancialsTransactions-ClaimFinancialsTransactionsScreen-TransactionsLV-1-User']", AI = false)
	private WebElement inpUser_10;

	@IFindBy(how = How.CSS, using = "input[name='ClaimFinancialsTransactions-ClaimFinancialsTransactionsScreen-TransactionsLV-1-CreateDate']", AI = false)
	private WebElement inpCreateDate_1;

	@IFindBy(how = How.CSS, using = "select[name='ClaimFinancialsTransactions-ClaimFinancialsTransactionsScreen-TransactionsLV-0-Status']", AI = false)
	private WebElement drpStatus;

	@IFindBy(how = How.CSS, using = "select[name='ClaimFinancialsTransactions-ClaimFinancialsTransactionsScreen-TransactionsLVRangeInput']", AI = false)
	private WebElement drpTransactionsLVRangeInput;

	@IFindBy(how = How.CSS, using = "select[name='ClaimFinancialsTransactions-ClaimFinancialsTransactionsScreen-TransactionsLV-0-ReservingCurrency']", AI = false)
	private WebElement drpReservingCurrency;

	@IFindBy(how = How.CSS, using = "input[name='ClaimFinancialsTransactions-ClaimFinancialsTransactionsScreen-TransactionsLV-0-User']", AI = false)
	private WebElement inpUser;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsTransactions-ClaimFinancialsTransactionsScreen-TransactionsLV-1-TransactionAmountViewDetail", AI = false)
	private WebElement btnTransactionAmountViewDetail_3;

	@IFindBy(how = How.CSS, using = "select[name='ClaimFinancialsTransactions-ClaimFinancialsTransactionsScreen-TransactionsLV-0-CostType']", AI = false)
	private WebElement drpCostType;

	@IFindBy(how = How.CSS, using = "select[name='ClaimFinancialsTransactions-ClaimFinancialsTransactionsScreen-TransactionsLV-1-ReservingCurrency']", AI = false)
	private WebElement drpReservingCurrency_8;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsTransactions-ClaimFinancialsTransactionsScreen-TransactionsLV-0-CreateDate_dateIcon", AI = false)
	private WebElement btnCreateDateDateIcon;

	@IFindBy(how = How.CSS, using = "select[name='ClaimFinancialsTransactions-ClaimFinancialsTransactionsScreen-TransactionsLV-0-CoverageType']", AI = false)
	private WebElement drpCoverage;

	@IFindBy(how = How.CSS, using = "#ClaimFinancialsTransactions-ClaimFinancialsTransactionsScreen-TransactionsLV-0-TransactionAmountViewDetail", AI = false)
	private WebElement btnTransactionAmountViewDetail;

	@IFindBy(how = How.CSS, using = "select[name='ClaimFinancialsTransactions-ClaimFinancialsTransactionsScreen-TransactionsLV-0-CostCategory']", AI = false)
	private WebElement drpCostCategory;

	@IFindBy(how = How.CSS, using = "input[name='ClaimFinancialsTransactions-ClaimFinancialsTransactionsScreen-TransactionsLV-1-Exposure']", AI = false)
	private WebElement inpExposure_4;
	
	@IFindBy(how = How.XPATH, using = "(//div[contains(@id,'-CoverageType')])[last()]", AI = false)
	private WebElement lblCoverageType_CA;
	
	@IFindBy(how = How.CSS, using = "div[id$='-CoverageType']", AI = false)
	private WebElement lblCoverageType;
	
	@IFindBy(how = How.XPATH, using = "//div[text()='Financials: Transactions']", AI = false)
	private WebElement ttlFinancialsTransactions;
	
	public FinancialsTransactionsPage(){
	}

	public FinancialsTransactionsPage(WebDriver driver){
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(finder, this);
//		transactionslvreserveTable = new TransactionsLVreserve();
}
@Override
	protected void load() {
		isPageLoaded = true;
		WaitUtils.waitForPageLoad(driver);
	}@Override
	protected void isLoaded() {
		if (!isPageLoaded) {
			Assert.fail();
		}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, ttlFinancialsTransactions))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);
}
public FinancialsTransactionsPage selectStatus_9(WebDriver driver,String Status_9)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpStatus_9,Status_9,"Status_9");
				    return this;
			}
public FinancialsTransactionsPage enterExposure(WebDriver driver,String Exposure) {
		            BrowserActions.type(driver, inpExposure,Exposure, "Exposure");
			        return this;
           }
public FinancialsTransactionsPage selectCostType_6(WebDriver driver,String CostType_6)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpCostType_6,CostType_6,"CostType_6");
				    return this;
			}
public FinancialsTransactionsPage selectCoverage_5(WebDriver driver,String Coverage_5)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpCoverage_5,Coverage_5,"Coverage_5");
				    return this;
			}
public FinancialsTransactionsPage clickCreateDateDateIcon_2(WebDriver driver)  {
					BrowserActions.click(driver, btnCreateDateDateIcon_2,"CreateDateDateIcon_2");
				    return this;
			}
public FinancialsTransactionsPage enterCreateDate(WebDriver driver,String CreateDate) {
		            BrowserActions.type(driver, inpCreateDate,CreateDate, "CreateDate");
			        return this;
           }
public FinancialsTransactionsPage selectCostCategory_7(WebDriver driver,String CostCategory_7)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpCostCategory_7,CostCategory_7,"CostCategory_7");
				    return this;
			}
public FinancialsTransactionsPage enterUser_10(WebDriver driver,String User_10) {
		            BrowserActions.type(driver, inpUser_10,User_10, "User_10");
			        return this;
           }
public FinancialsTransactionsPage enterCreateDate_1(WebDriver driver,String CreateDate_1) {
		            BrowserActions.type(driver, inpCreateDate_1,CreateDate_1, "CreateDate_1");
			        return this;
           }
public FinancialsTransactionsPage selectStatus(WebDriver driver,String Status)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpStatus,Status,"Status");
				    return this;
			}
public FinancialsTransactionsPage selectTransactionsLVRangeInput(WebDriver driver,String TransactionsLVRangeInput)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpTransactionsLVRangeInput,TransactionsLVRangeInput,"TransactionsLVRangeInput");
				    return this;
			}
public FinancialsTransactionsPage selectReservingCurrency(WebDriver driver,String ReservingCurrency)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpReservingCurrency,ReservingCurrency,"ReservingCurrency");
				    return this;
			}
public FinancialsTransactionsPage enterUser(WebDriver driver,String User) {
		            BrowserActions.type(driver, inpUser,User, "User");
			        return this;
           }
public FinancialsTransactionsPage clickTransactionAmountViewDetail_3(WebDriver driver)  {
					BrowserActions.click(driver, btnTransactionAmountViewDetail_3,"TransactionAmountViewDetail_3");
				    return this;
			}
public FinancialsTransactionsPage selectCostType(WebDriver driver,String CostType)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpCostType,CostType,"CostType");
				    return this;
			}
public FinancialsTransactionsPage selectReservingCurrency_8(WebDriver driver,String ReservingCurrency_8)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpReservingCurrency_8,ReservingCurrency_8,"ReservingCurrency_8");
				    return this;
			}
public FinancialsTransactionsPage clickCreateDateDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnCreateDateDateIcon,"CreateDateDateIcon");
				    return this;
			}
public FinancialsTransactionsPage selectCoverage(WebDriver driver,String Coverage)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpCoverage,Coverage,"Coverage");
				    return this;
			}
public FinancialsTransactionsPage clickTransactionAmountViewDetail(WebDriver driver)  {
					BrowserActions.click(driver, btnTransactionAmountViewDetail,"TransactionAmountViewDetail");
				    return this;
			}
public FinancialsTransactionsPage selectCostCategory(WebDriver driver,String CostCategory)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpCostCategory,CostCategory,"CostCategory");
				    return this;
			}
public FinancialsTransactionsPage enterExposure_4(WebDriver driver,String Exposure_4) {
		            BrowserActions.type(driver, inpExposure_4,Exposure_4, "Exposure_4");
			        return this;
           }
public FinancialsTransactionsPage verifyReserveCreated_CA(WebDriver driver,String expectedText) {
	String text = BrowserActions.getText(driver, lblCoverageType_CA,"Exposure_4");
	Log.assertThat(text.equals(expectedText), "Reserve is created", "Reserve is not created");
	return this;
}
public FinancialsTransactionsPage verifyReserveCreated(WebDriver driver,String expectedText) {
	String text = BrowserActions.getText(driver, lblCoverageType,"CoverageType").trim();
	Log.assertThat(text.equals(expectedText), "Reserve is created", "Reserve is not created");
	return this;
}
public FinancialsTransactionsPage verifyReserveIsCreated(WebDriver driver,String recoveryCategory) {
	By reserve = By.xpath("//div[text()='"+recoveryCategory+"']//ancestor::tr");
	BrowserActions.waitForElementToDisplay(driver, reserve, "Recovery is created and ");
	return this;
}
}
