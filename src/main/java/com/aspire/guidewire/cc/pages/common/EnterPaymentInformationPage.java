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

public class EnterPaymentInformationPage extends LoadableComponent<EnterPaymentInformationPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
	//	public TopNavBar topnavbar;
	//	public EditablePaymentLineItems editablepaymentlineitemsTable;
	//
	//	public NewCheckPayments newcheckpaymentsTable;

	@IFindBy(how = How.CSS, using = "select[name$='PaymentType']", AI = false)
	public WebElement drpPaymentType;

	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-ManualCheckWizard_CheckPaymentsScreen-NewCheckPaymentPanelSet-NewPaymentDetailDV-CheckExchangeRateInputSet-Transaction_RateSet_Date_dateIcon", AI = false)
	public WebElement btnExchangeRateEffectiveDateDateIcon;

	@IFindBy(how = How.CSS, using = "select[name$='CostCategory']", AI = false)
	public WebElement drpCategory;

	@IFindBy(how = How.CSS, using = "select[name='ManualCreateCheckWizard-ManualCheckWizard_CheckPaymentsScreen-NewCheckPaymentPanelSet-NewCheckPaymentsLV-0-ReservingCurrency']", AI = false)
	public WebElement drpReservingCurrency;

	@IFindBy(how = How.CSS, using = "input[name='ManualCreateCheckWizard-ManualCheckWizard_CheckPaymentsScreen-NewCheckPaymentPanelSet-NewPaymentDetailDV-CheckExchangeRateInputSet-Transaction_RateSet_Date']", AI = false)
	public WebElement inpExchangeRateEffectiveDate;

	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-Prev>div[role='button']", AI = false)
	public WebElement btnBack;

	@IFindBy(how = How.CSS, using = "div[id$='-Next']", AI = false)
	public WebElement btnNext;

	@IFindBy(how = How.CSS, using = "select[name='ManualCreateCheckWizard-ManualCheckWizard_CheckPaymentsScreen-NewCheckPaymentPanelSet-NewPaymentDetailDV-ReserveLineInputSet-Coverage']", AI = false)
	public WebElement drpCoverage_1;

	@IFindBy(how = How.CSS, using = "select[name='ManualCreateCheckWizard-ManualCheckWizard_CheckPaymentsScreen-NewCheckPaymentPanelSet-NewPaymentDetailDV-Payment_PaymentType']", AI = false)
	public WebElement drpPaymentType_5;

	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-ManualCheckWizard_CheckPaymentsScreen-Add>div[role='button']", AI = false)
	public WebElement btnAddPayment;

	@IFindBy(how = How.CSS, using = "select[name='ManualCreateCheckWizard-ManualCheckWizard_CheckPaymentsScreen-NewCheckPaymentPanelSet-NewPaymentDetailDV-ReserveLineInputSet-CostType']", AI = false)
	public WebElement drpCostType_2;

	@IFindBy(how = How.CSS, using = "input[name='ManualCreateCheckWizard-ManualCheckWizard_CheckPaymentsScreen-NewCheckPaymentPanelSet-NewPaymentDetailDV-CheckExchangeRateInputSet-Transaction_ExchangeRateOverride']", AI = false)
	public WebElement rdbExchangeRateMode;

	@IFindBy(how = How.CSS, using = "input[name='ManualCreateCheckWizard-ManualCheckWizard_CheckPaymentsScreen-NewCheckPaymentPanelSet-NewCheckPaymentsLV-0-Exposure']", AI = false)
	public WebElement inpExposure;

	@IFindBy(how = How.CSS, using = "input[name='ManualCreateCheckWizard-ManualCheckWizard_CheckPaymentsScreen-NewCheckPaymentPanelSet-NewPaymentDetailDV-Payment_Eroding']", AI = false)
	public WebElement rdbEroding;

	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-ManualCheckWizard_CheckPaymentsScreen-Remove>div[role='button']", AI = false)
	public WebElement btnRemovePayment;

	@IFindBy(how = How.CSS, using = "select[name='ManualCreateCheckWizard-ManualCheckWizard_CheckPaymentsScreen-NewCheckPaymentPanelSet-NewCheckPaymentsLV-0-Coverage']", AI = false)
	public WebElement drpCoverage;

	@IFindBy(how = How.CSS, using = "input[name='ManualCreateCheckWizard-ManualCheckWizard_CheckPaymentsScreen-NewCheckPaymentPanelSet-NewPaymentDetailDV-Transaction_Comments']", AI = false)
	public WebElement inpComments_6;

	@IFindBy(how = How.CSS, using = "select[name='ManualCreateCheckWizard-ManualCheckWizard_CheckPaymentsScreen-NewCheckPaymentPanelSet-NewPaymentDetailDV-ReserveLineInputSet-CostCategory']", AI = false)
	public WebElement drpCostCategory_3;

	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-Finish>div[role='button']", AI = false)
	public WebElement btnFinish;

	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-NewCheckInstructions>div[role='menuitem']", AI = false)
	public WebElement btnInstructions;

	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-NewCheckPayees>div[role='menuitem']", AI = false)
	public WebElement btnPayees;

	@IFindBy(how = How.CSS, using = "select[name='ManualCreateCheckWizard-ManualCheckWizard_CheckPaymentsScreen-NewCheckPaymentPanelSet-NewPaymentDetailDV-ReserveLineInputSet-Matter']", AI = false)
	public WebElement drpMatter;

	@IFindBy(how = How.CSS, using = "input[name='ManualCreateCheckWizard-ManualCheckWizard_CheckPaymentsScreen-NewCheckPaymentPanelSet-NewPaymentDetailDV-CheckExchangeRateInputSet-Transaction_ExchangeRate']", AI = false)
	public WebElement inpExchangeRate;

	@IFindBy(how = How.CSS, using = "input[name='ManualCreateCheckWizard-ManualCheckWizard_CheckPaymentsScreen-NewCheckPaymentPanelSet-NewCheckPaymentsLV-0-Comments']", AI = false)
	public WebElement inpComments;

	@IFindBy(how = How.CSS, using = "select[name='ManualCreateCheckWizard-ManualCheckWizard_CheckPaymentsScreen-NewCheckPaymentPanelSet-NewPaymentDetailDV-ReserveLineInputSet-Exposure']", AI = false)
	public WebElement drpExposure;

	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-ManualCheckWizard_CheckPaymentsScreen-ttlBar", AI = false)
	public WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-ManualCheckWizard_CheckPaymentsScreen-NewCheckPaymentPanelSet-NewPaymentDetailDV-EditablePaymentLineItemsLV_tb-Add>div[role='button']", AI = false)
	public WebElement btnAddItem;

	@IFindBy(how = How.CSS, using = "select[name='ManualCreateCheckWizard-ManualCheckWizard_CheckPaymentsScreen-NewCheckPaymentPanelSet-NewPaymentDetailDV-ReserveLineInputSet-ReservingCurrency']", AI = false)
	public WebElement drpReservingCurrency_4;

	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-NewCheckPayments>div[role='menuitem']", AI = false)
	public WebElement btnPayments;

	@IFindBy(how = How.CSS, using = "select[name$='NewPaymentDetailDV-ReserveLineInputSet-ReserveLine']", AI = false)
	public WebElement drpReserveLine;

	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-ManualCheckWizard_CheckPaymentsScreen-NewCheckPaymentPanelSet-NewPaymentDetailDV-EditablePaymentLineItemsLV_tb-Remove>div[role='button']", AI = false)
	public WebElement btnRemove;

	@IFindBy(how = How.CSS, using = "input[name='ManualCreateCheckWizard-ManualCheckWizard_CheckPaymentsScreen-NewCheckPaymentPanelSet-NewPaymentDetailDV-CheckExchangeRateInputSet-Transaction_RateSet_Description']", AI = false)
	public WebElement inpExchangeRateDescription;

	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-ManualCheckWizard_CheckPaymentsScreen-NewCheckPaymentPanelSet-NewPaymentDetailDV-EditablePaymentLineItemsLV_tb-ApplyDeductibleButton>div[role='button']", AI = false)
	public WebElement btnDependentonRender;

	@IFindBy(how = How.CSS, using = "select[name$='CostType']", AI = false)
	public WebElement drpCostType;

	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-Cancel>div[role='button']", AI = false)
	public WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "select[name='ManualCreateCheckWizard-ManualCheckWizard_CheckPaymentsScreen-NewCheckPaymentPanelSet-NewPaymentDetailDV-Payment_Currency']", AI = false)
	public WebElement drpCurrency;

	@IFindBy(how = How.CSS, using = "#ManualCreateCheckWizard-ManualCheckWizard_CheckPaymentsScreen-NewCheckPaymentPanelSet-PaymentDetailsCardTab", AI = false)
	public WebElement btnPaymentDetails;

	@IFindBy(how = How.CSS, using = "select[name='ManualCreateCheckWizard-ManualCheckWizard_CheckPaymentsScreen-NewCheckPaymentPanelSet-NewCheckPaymentsLV-0-CostCategory']", AI = false)
	public WebElement drpCostCategory;

	@IFindBy(how = How.CSS, using = "input[name$='Amount']", AI = false)
	public WebElement inpAmount;

	@IFindBy(how = How.CSS, using = "div[id$='CheckPaymentsScreen-ttlBar']", AI = false)
	public WebElement lblTtlBarPayment;
	
	public EnterPaymentInformationPage(){
	}

	public EnterPaymentInformationPage(WebDriver driver) {
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(finder, this);
		//		editablepaymentlineitemsTable = new EditablePaymentLineItems();
		//		newcheckpaymentsTable = new NewCheckPayments();
	}
	@Override
	protected void load() {
		isPageLoaded = true;
		WaitUtils.waitForPageLoad(driver);
	}@Override
	protected void isLoaded() {
		if (!isPageLoaded) {
			Assert.fail();
		}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, lblTtlBarPayment))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);
	}public EnterPaymentInformationPage selectPaymentType(WebDriver driver,String PaymentType)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPaymentType,PaymentType,2,"PaymentType");
		return this;
	}
	public EnterPaymentInformationPage clickExchangeRateEffectiveDateDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnExchangeRateEffectiveDateDateIcon,"ExchangeRateEffectiveDateDateIcon");
		return this;
	}
	public EnterPaymentInformationPage selectCategory(WebDriver driver,String Category)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCategory,Category,2,"Category");
		return this;
	}
	public EnterPaymentInformationPage selectReservingCurrency(WebDriver driver,String ReservingCurrency)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpReservingCurrency,ReservingCurrency,"ReservingCurrency");
		return this;
	}
	public EnterPaymentInformationPage enterExchangeRateEffectiveDate(WebDriver driver,String ExchangeRateEffectiveDate) {
		BrowserActions.type(driver, inpExchangeRateEffectiveDate,ExchangeRateEffectiveDate, "ExchangeRateEffectiveDate");
		return this;
	}
	public EnterPaymentInformationPage clickBack(WebDriver driver)  {
		BrowserActions.click(driver, btnBack,"Back");
		return this;
	}
	public EnterPaymentInformationPage clickNext(WebDriver driver)  {
		BrowserActions.click(driver, btnNext,"Next");
		return this;
	}
	public EnterPaymentInformationPage selectCoverage_1(WebDriver driver,String Coverage_1)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCoverage_1,Coverage_1,"Coverage_1");
		return this;
	}
	public EnterPaymentInformationPage selectPaymentType_5(WebDriver driver,String PaymentType_5)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPaymentType_5,PaymentType_5,"PaymentType_5");
		return this;
	}
	public EnterPaymentInformationPage clickAddPayment(WebDriver driver)  {
		BrowserActions.click(driver, btnAddPayment,"AddPayment");
		return this;
	}
	public EnterPaymentInformationPage selectCostType_2(WebDriver driver,String CostType_2)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCostType_2,CostType_2,"CostType_2");
		return this;
	}
	public EnterPaymentInformationPage clickExchangeRateMode(WebDriver driver)  {
		BrowserActions.click(driver, rdbExchangeRateMode,"ExchangeRateMode");
		return this;
	}
	public EnterPaymentInformationPage enterExposure(WebDriver driver,String Exposure) {
		BrowserActions.type(driver, inpExposure,Exposure, "Exposure");
		return this;
	}
	public EnterPaymentInformationPage clickEroding(WebDriver driver)  {
		BrowserActions.click(driver, rdbEroding,"Eroding");
		return this;
	}
	public EnterPaymentInformationPage clickRemovePayment(WebDriver driver)  {
		BrowserActions.click(driver, btnRemovePayment,"RemovePayment");
		return this;
	}
	public EnterPaymentInformationPage selectCoverage(WebDriver driver,String Coverage)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCoverage,Coverage,"Coverage");
		return this;
	}
	public EnterPaymentInformationPage enterComments_6(WebDriver driver,String Comments_6) {
		BrowserActions.type(driver, inpComments_6,Comments_6, "Comments_6");
		return this;
	}
	public EnterPaymentInformationPage selectCostCategory_3(WebDriver driver,String CostCategory_3)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCostCategory_3,CostCategory_3,"CostCategory_3");
		return this;
	}
	public EnterPaymentInformationPage clickFinish(WebDriver driver)  {
		BrowserActions.click(driver, btnFinish,"Finish");
		return this;
	}
	public EnterPaymentInformationPage clickInstructions(WebDriver driver)  {
		BrowserActions.click(driver, btnInstructions,"Instructions");
		return this;
	}
	public EnterPaymentInformationPage clickPayees(WebDriver driver)  {
		BrowserActions.click(driver, btnPayees,"Payees");
		return this;
	}
	public EnterPaymentInformationPage selectMatter(WebDriver driver,String Matter)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpMatter,Matter,"Matter");
		return this;
	}
	public EnterPaymentInformationPage enterExchangeRate(WebDriver driver,String ExchangeRate) {
		BrowserActions.type(driver, inpExchangeRate,ExchangeRate, "ExchangeRate");
		return this;
	}
	public EnterPaymentInformationPage enterComments(WebDriver driver,String Comments) {
		BrowserActions.type(driver, inpComments,Comments, "Comments");
		return this;
	}
	public EnterPaymentInformationPage selectExposure(WebDriver driver,String Exposure)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpExposure,Exposure,"Exposure");
		return this;
	}
	public EnterPaymentInformationPage clickAddItem(WebDriver driver)  {
		BrowserActions.click(driver, btnAddItem,"AddItem");
		return this;
	}
	public EnterPaymentInformationPage selectReservingCurrency_4(WebDriver driver,String ReservingCurrency_4)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpReservingCurrency_4,ReservingCurrency_4,"ReservingCurrency_4");
		return this;
	}
	public EnterPaymentInformationPage clickPayments(WebDriver driver)  {
		BrowserActions.click(driver, btnPayments,"Payments");
		return this;
	}
	public EnterPaymentInformationPage selectReserveLine(WebDriver driver,String ReserveLine)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpReserveLine,ReserveLine,1,"ReserveLine");
		return this;
	}
	public EnterPaymentInformationPage clickRemove(WebDriver driver)  {
		BrowserActions.click(driver, btnRemove,"Remove");
		return this;
	}
	public EnterPaymentInformationPage enterExchangeRateDescription(WebDriver driver,String ExchangeRateDescription) {
		BrowserActions.type(driver, inpExchangeRateDescription,ExchangeRateDescription, "ExchangeRateDescription");
		return this;
	}
	public EnterPaymentInformationPage clickDependentonRender(WebDriver driver)  {
		BrowserActions.click(driver, btnDependentonRender,"DependentonRender");
		return this;
	}
	public EnterPaymentInformationPage selectCostType(WebDriver driver,String CostType)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCostType,CostType,1,"CostType");
		return this;
	}
	public EnterPaymentInformationPage clickCancel(WebDriver driver)  {
		BrowserActions.click(driver, btnCancel,"Cancel");
		return this;
	}
	public EnterPaymentInformationPage selectCurrency(WebDriver driver,String Currency)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCurrency,Currency,"Currency");
		return this;
	}
	public EnterPaymentInformationPage clickPaymentDetails(WebDriver driver)  {
		BrowserActions.click(driver, btnPaymentDetails,"PaymentDetails");
		return this;
	}
	public EnterPaymentInformationPage selectCostCategory(WebDriver driver,String CostCategory)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCostCategory,CostCategory,"CostCategory");
		return this;
	}

	public EnterPaymentInformationPage enterAmount(WebDriver driver,String amount)  {
		BrowserActions.type(driver, inpAmount,amount, "Amount");
		return this;
	}

	public EnterPaymentInformationPage selectReserveLine(WebDriver driver)  {
		BrowserActions.selectDropDownByIndex(driver, drpReserveLine,1,"ReserveLine");
		return this;
	}
}
