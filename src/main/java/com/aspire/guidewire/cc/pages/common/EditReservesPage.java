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

public class EditReservesPage extends LoadableComponent<EditReservesPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//  TopNavBar object
	//	public TopNavBar topnavbar;
	//	public EditableReserves editablereservesTable;

	@IFindBy(how = How.CSS, using = "select[name='NewReserveSet-NewReserveSetScreen-ReservesSummaryDV-EditableReservesLV-0-Exposure']", AI = false)
	public WebElement drpExposure;

	@IFindBy(how = How.CSS, using = "input[name='NewReserveSet-NewReserveSetScreen-ReservesSummaryDV-EditableReservesLV-0-Comments']", AI = false)
	public WebElement inpComments;

	@IFindBy(how = How.CSS, using = "#NewReserveSet-NewReserveSetScreen-ttlBar", AI = false)
	public WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "#NewReserveSet-NewReserveSetScreen-IDCSDisabledAlert .gw-AlertBar--label", AI = false)
	public WebElement lblIDCSDisabledAlert;

	@IFindBy(how = How.CSS, using = "input[name='NewReserveSet-NewReserveSetScreen-ReservesSummaryDV-EditableReservesLV-0-Exposure_Readonly']", AI = false)
	public WebElement inpExposure;

	@IFindBy(how = How.CSS, using = "#NewReserveSet-NewReserveSetScreen-IDMSUnavailableAlert-CloseBtn", AI = false)
	public WebElement btnClose_2;

	@IFindBy(how = How.CSS, using = "#NewReserveSet-NewReserveSetScreen-IDCSUnavailableAlert-CloseBtn", AI = false)
	public WebElement btnClose_1;

	@IFindBy(how = How.CSS, using = "#NewReserveSet-NewReserveSetScreen-Remove>div[role='button']", AI = false)
	public WebElement btnRemove;

	@IFindBy(how = How.CSS, using = "#NewReserveSet-NewReserveSetScreen-NewReserveSet_ShowGroupedReservesButton>div[role='button']", AI = false)
	public WebElement btnShowGroup;

	@IFindBy(how = How.CSS, using = "select[name='NewReserveSet-NewReserveSetScreen-ReservesSummaryDV-EditableReservesLV-0-ReservingCurrency']", AI = false)
	public WebElement drpReservingCurrency;

	@IFindBy(how = How.CSS, using = "#NewReserveSet-NewReserveSetScreen-IDCSDisabledAlert-CloseBtn", AI = false)
	public WebElement btnClose;

	@IFindBy(how = How.CSS, using = "#NewReserveSet-NewReserveSetScreen-IDMSUnavailableAlert .gw-AlertBar--label", AI = false)
	public WebElement lblIDMSUnavailableAlert;

	@IFindBy(how = How.CSS, using = "#NewReserveSet-NewReserveSetScreen-IDCSUnavailableAlert .gw-AlertBar--label", AI = false)
	public WebElement lblIDCSUnavailableAlert;

	@IFindBy(how = How.CSS, using = "input[name='NewReserveSet-NewReserveSetScreen-ReservesSummaryDV-EditableReservesLV-0-MultiCurrencyPopup_link']", AI = false)
	public WebElement rdbMultiCurrencyPopup_link;

	@IFindBy(how = How.CSS, using = "select[name$='-CostType']", AI = false)
	public WebElement drpCostType;

	@IFindBy(how = How.CSS, using = "input[name='NewReserveSet-NewReserveSetScreen-ReservesSummaryDV-EditableReservesLV_tb-filterText']", AI = false)
	public WebElement inpFilterText;

	@IFindBy(how = How.CSS, using = "#NewReserveSet-NewReserveSetScreen-Cancel>div[role='button']", AI = false)
	public WebElement btnCancel;

	@IFindBy(how = How.XPATH, using = "//div[@id='NewReserveSet-NewReserveSetScreen-Update']/child::div[@role='button']", AI = false)
	public WebElement btnSave;//#NewReserveSet-NewReserveSetScreen-Update>div[role='button']

	@IFindBy(how = How.CSS, using = "#NewReserveSet-NewReserveSetScreen-Add>div[role='button']", AI = false)
	public WebElement btnAdd;

	@IFindBy(how = How.CSS, using = "select[name='NewReserveSet-NewReserveSetScreen-ReservesSummaryDV-EditableReservesLV-0-Coverage']", AI = false)
	public WebElement drpCoverage;

	@IFindBy(how = How.CSS, using = "#NewReserveSet-NewReserveSetScreen-NewReserveSet_ShowAllReservesButton>div[role='button']", AI = false)
	public WebElement btnShowAll;

	@IFindBy(how = How.CSS, using = "input[name='NewReserveSet-NewReserveSetScreen-ReservesSummaryDV-ReserveLabel']", AI = false)
	public WebElement inpReserveLabel;

	@IFindBy(how = How.CSS, using = "select[name$='-CostCategory']", AI = false)
	public WebElement drpCostCategory;

	@IFindBy(how = How.CSS, using = "input[name$='NewAmount']", AI = false)
	public WebElement inpNewAmount;
	
	@IFindBy(how = How.XPATH, using = "(//input[contains(@name,'_Checkbox')] ) [last()]", AI = false)
	public WebElement chkExposure;
	
	public String reserveTableSize = "//tr[contains(@id,'EditableReservesLV')]";
	public String reserveCheckbox="/td[1]";
	public String reserveCostType="/td[4]//select";
	public String reserveCostCategory="/td[5]//select";
	public String reserveAmount="/td[8]//input";

	public EditReservesPage(){
	}

	public EditReservesPage(WebDriver driver){
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(finder, this);
		//		editablereservesTable = new EditableReserves();
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
	}public EditReservesPage selectExposure(WebDriver driver,String Exposure)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpExposure,Exposure,"Exposure");
		return this;
	}
	public EditReservesPage enterComments(WebDriver driver,String Comments) {
		BrowserActions.type(driver, inpComments,Comments, "Comments");
		return this;
	}
	public EditReservesPage enterExposure(WebDriver driver,String Exposure) {
		BrowserActions.type(driver, inpExposure,Exposure, "Exposure");
		return this;
	}
	public EditReservesPage clickClose_2(WebDriver driver)  {
		BrowserActions.click(driver, btnClose_2,"Close_2");
		return this;
	}
	public EditReservesPage clickClose_1(WebDriver driver)  {
		BrowserActions.click(driver, btnClose_1,"Close_1");
		return this;
	}
	public EditReservesPage clickRemove(WebDriver driver)  {
		BrowserActions.click(driver, btnRemove,"Remove");
		return this;
	}
	public EditReservesPage clickShowGroup(WebDriver driver)  {
		BrowserActions.click(driver, btnShowGroup,"ShowGroup");
		return this;
	}
	public EditReservesPage selectReservingCurrency(WebDriver driver,String ReservingCurrency)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpReservingCurrency,ReservingCurrency,"ReservingCurrency");
		return this;
	}
	public EditReservesPage clickClose(WebDriver driver)  {
		BrowserActions.click(driver, btnClose,"Close");
		return this;
	}
	public EditReservesPage clickMultiCurrencyPopup_link(WebDriver driver)  {
		BrowserActions.click(driver, rdbMultiCurrencyPopup_link,"MultiCurrencyPopup_link");
		return this;
	}
	public EditReservesPage selectCostType(WebDriver driver,String CostType)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCostType,CostType,true,"CostType");
		return this;
	}
	public EditReservesPage enterFilterText(WebDriver driver,String FilterText) {
		BrowserActions.type(driver, inpFilterText,FilterText, "FilterText");
		return this;
	}
	public EditReservesPage clickCancel(WebDriver driver)  {
		BrowserActions.click(driver, btnCancel,"Cancel");
		return this;
	}
	public EditReservesPage clickSave(WebDriver driver)  {
		BrowserActions.click(driver, btnSave,true,"Save");
		return this;
	}
	public EditReservesPage clickAdd(WebDriver driver)  {
		BrowserActions.click(driver, btnAdd,"Add");
		return this;
	}
	public EditReservesPage selectCoverage(WebDriver driver,String Coverage)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCoverage,Coverage,"Coverage");
		return this;
	}
	public EditReservesPage clickShowAll(WebDriver driver)  {
		BrowserActions.click(driver, btnShowAll,"ShowAll");
		return this;
	}
	public EditReservesPage enterReserveLabel(WebDriver driver,String ReserveLabel) {
		BrowserActions.type(driver, inpReserveLabel,ReserveLabel, "ReserveLabel");
		return this;
	}
	public EditReservesPage selectCostCategory(WebDriver driver,String CostCategory)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCostCategory,CostCategory,1,"CostCategory");
		return this;
	}
	public EditReservesPage enterNewAvailableReserves(WebDriver driver,String newAvailableReserves)  {
		BrowserActions.type(driver, inpNewAmount,newAvailableReserves,"New Available Reserves");
		return this;
	}

	public EditReservesPage selectExposure(WebDriver driver) {
		BrowserActions.click(driver, chkExposure,true, "checkbox");
		return this;

	}
	public EditReservesPage selectReserveCostType(WebDriver driver,String cost) {
		By reserveTable = By.xpath(reserveTableSize);
		int size = BrowserActions.getWebElementSize(driver, reserveTable, "reserveTable",0.5)-1;
		By costTypeBy = By.xpath("//table[@class='gw-ListViewWidget--table gw-table']/tbody/tr["+size+"]"+reserveCostType);
		BrowserActions.waitForElementToDisplay(driver, costTypeBy,"cost type");
		WebElement costType = costTypeBy.findElement(driver);
		BrowserActions.selectDropDownByVisibleText(driver, costType, cost,true,"Cost type");
		return this;	
	}
	public EditReservesPage selectReserveCostCategory(WebDriver driver,String cost) {
		By reserveTable = By.xpath(reserveTableSize);
		int size = BrowserActions.getWebElementSize(driver, reserveTable, "reserve Table",0.5)-1;
		By costCategoryBy = By.xpath("//table[@class='gw-ListViewWidget--table gw-table']/tbody/tr["+size+"]"+reserveCostCategory);
		BrowserActions.waitForElementToDisplay(driver, costCategoryBy,"cost category");
		WebElement costCategory = costCategoryBy.findElement(driver);
		BrowserActions.selectDropDownByVisibleText(driver, costCategory, cost,true,"Cost Category");
		return this;	
	}
	public EditReservesPage enterReserveAmount(WebDriver driver,String cost) {
		By reserveTable = By.xpath(reserveTableSize);
		int size = BrowserActions.getWebElementSize(driver, reserveTable, "reserveTable",0.5)-1;
		By amountBy = By.xpath("//table[@class='gw-ListViewWidget--table gw-table']/tbody/tr["+size+"]"+reserveAmount);
		BrowserActions.waitForElementToDisplay(driver, amountBy,"amount");
		WebElement amount = amountBy.findElement(driver);
		BrowserActions.type(driver, amount, cost,true,"Amount");
		return this;	
	}
}
