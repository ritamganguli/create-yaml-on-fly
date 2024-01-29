package com.aspire.guidewire.cc.pages.nonlob;
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

public class BusinessWeekPage extends LoadableComponent<BusinessWeekPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();


	@IFindBy(how = How.CSS, using = "input[name='NewBusinessWeek-BusinessWeekDetailScreen-BusinessWeekDayDetailDV-WednesdayBusinessStart']", AI = false)
	public WebElement inpBusinessdaystart_12;

	@IFindBy(how = How.CSS, using = "select[name='NewBusinessWeek-BusinessWeekDetailScreen-BusinessWeekDetailDV-ZoneInput']", AI = false)
	public WebElement drpZones;

	@IFindBy(how = How.CSS, using = "#NewBusinessWeek-BusinessWeekDetailScreen-Zones textarea", AI = false)
	public WebElement inpZones;

	@IFindBy(how = How.CSS, using = "#NewBusinessWeek-BusinessWeekDetailScreen-BusinessWeekDayDetailDV-MondayBusinessEnd_dateIcon", AI = false)
	public WebElement btnBusinessdayendDateIcon_5;

	@IFindBy(how = How.CSS, using = "input[name='NewBusinessWeek-BusinessWeekDetailScreen-BusinessWeekDayDetailDV-MondayBusinessStart']", AI = false)
	public WebElement inpBusinessdaystart_2;

	@IFindBy(how = How.CSS, using = "input[name='NewBusinessWeek-BusinessWeekDetailScreen-BusinessWeekDayDetailDV-SundayBusinessEnd']", AI = false)
	public WebElement inpBusinessdayend;

	@IFindBy(how = How.CSS, using = "input[name='NewBusinessWeek-BusinessWeekDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-2-Language']", AI = false)
	public WebElement inpLanguage_39;

	@IFindBy(how = How.CSS, using = "input[name='NewBusinessWeek-BusinessWeekDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-2-column2']", AI = false)
	public WebElement inpDependentonRender_42;

	@IFindBy(how = How.CSS, using = "input[name='NewBusinessWeek-BusinessWeekDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-2-column1']", AI = false)
	public WebElement inpDependentonRender_41;

	@IFindBy(how = How.CSS, using = "input[name='NewBusinessWeek-BusinessWeekDetailScreen-BusinessWeekDayDetailDV-ThursdayBusinessStart']", AI = false)
	public WebElement inpBusinessdaystart_17;

	@IFindBy(how = How.CSS, using = "input[name='NewBusinessWeek-BusinessWeekDetailScreen-BusinessWeekDayDetailDV-SundayBusinessDay']", AI = false)
	public WebElement rdbIsabusinessday;

	@IFindBy(how = How.CSS, using = "input[name='NewBusinessWeek-BusinessWeekDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-0-Language']", AI = false)
	public WebElement inpLanguage;

	@IFindBy(how = How.CSS, using = "input[name='NewBusinessWeek-BusinessWeekDetailScreen-BusinessWeekDayDetailDV-TuesdayBusinessStart']", AI = false)
	public WebElement inpBusinessdaystart_7;

	@IFindBy(how = How.CSS, using = "input[name='NewBusinessWeek-BusinessWeekDetailScreen-BusinessWeekDayDetailDV-MondayBusinessEnd']", AI = false)
	public WebElement inpBusinessdayend_4;

	@IFindBy(how = How.CSS, using = "input[name='NewBusinessWeek-BusinessWeekDetailScreen-BusinessWeekDayDetailDV-FridayBusinessStart']", AI = false)
	public WebElement inpBusinessdaystart_22;

	@IFindBy(how = How.CSS, using = "input[name='NewBusinessWeek-BusinessWeekDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-2-column0']", AI = false)
	public WebElement inpName_40;

	@IFindBy(how = How.CSS, using = "input[name='NewBusinessWeek-BusinessWeekDetailScreen-BusinessWeekDayDetailDV-SaturdayBusinessEnd']", AI = false)
	public WebElement inpBusinessdayend_29;

	@IFindBy(how = How.CSS, using = "#NewBusinessWeek-BusinessWeekDetailScreen-BusinessWeekDayDetailDV-FridayBusinessEnd_dateIcon", AI = false)
	public WebElement btnBusinessdayendDateIcon_25;

	@IFindBy(how = How.CSS, using = "input[name='NewBusinessWeek-BusinessWeekDetailScreen-BusinessWeekDayDetailDV-FridayBusinessEnd']", AI = false)
	public WebElement inpBusinessdayend_24;

	@IFindBy(how = How.CSS, using = "#NewBusinessWeek-BusinessWeekDetailScreen-BusinessWeekDayDetailDV-SaturdayBusinessStart_dateIcon", AI = false)
	public WebElement btnBusinessdaystartDateIcon_28;

	@IFindBy(how = How.CSS, using = "#NewBusinessWeek-BusinessWeekDetailScreen-BusinessWeekDayDetailDV-SaturdayBusinessEnd_dateIcon", AI = false)
	public WebElement btnBusinessdayendDateIcon_30;

	@IFindBy(how = How.CSS, using = "input[name='NewBusinessWeek-BusinessWeekDetailScreen-BusinessWeekDayDetailDV-SundayBusinessStart']", AI = false)
	public WebElement inpBusinessdaystart;

	@IFindBy(how = How.CSS, using = "#NewBusinessWeek-BusinessWeekDetailScreen-BusinessWeekDayDetailDV-FridayBusinessStart_dateIcon", AI = false)
	public WebElement btnBusinessdaystartDateIcon_23;

	@IFindBy(how = How.CSS, using = "#NewBusinessWeek-BusinessWeekDetailScreen-BusinessWeekDayDetailDV-BusinessDayDemarcation_dateIcon", AI = false)
	public WebElement btnBusinessDayDemarcationDateIcon;

	@IFindBy(how = How.CSS, using = "input[name='NewBusinessWeek-BusinessWeekDetailScreen-BusinessWeekDayDetailDV-SaturdayBusinessStart']", AI = false)
	public WebElement inpBusinessdaystart_27;

	@IFindBy(how = How.CSS, using = "input[name='NewBusinessWeek-BusinessWeekDetailScreen-BusinessWeekDayDetailDV-WednesdayBusinessEnd']", AI = false)
	public WebElement inpBusinessdayend_14;

	@IFindBy(how = How.ID, using = "BusinessWeekPage-BusinessWeekScreen-0", AI = false)
	public WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "input[name='NewBusinessWeek-BusinessWeekDetailScreen-BusinessWeekDayDetailDV-ThursdayBusinessDay']", AI = false)
	public WebElement rdbIsabusinessday_16;

	@IFindBy(how = How.CSS, using = "select[name='NewBusinessWeek-BusinessWeekDetailScreen-BusinessWeekDetailDV-zoneType']", AI = false)
	public WebElement drpBusinessWeekZoneType;

	@IFindBy(how = How.CSS, using = "div[id$='Edit']", AI = false)
	public WebElement btnEdit;

	@IFindBy(how = How.CSS, using = "#NewBusinessWeek-BusinessWeekDetailScreen-BusinessWeekDayDetailDV-MondayBusinessStart_dateIcon", AI = false)
	public WebElement btnBusinessdaystartDateIcon_3;

	@IFindBy(how = How.CSS, using = "input[name='NewBusinessWeek-BusinessWeekDetailScreen-BusinessWeekDayDetailDV-WednesdayBusinessDay']", AI = false)
	public WebElement rdbIsabusinessday_11;

	@IFindBy(how = How.CSS, using = "input[name='NewBusinessWeek-BusinessWeekDetailScreen-BusinessWeekDayDetailDV-ThursdayBusinessEnd']", AI = false)
	public WebElement inpBusinessdayend_19;

	@IFindBy(how = How.CSS, using = "div[id$='Update']", AI = false)
	public WebElement btnUpdate;

	@IFindBy(how = How.CSS, using = "input[name='NewBusinessWeek-BusinessWeekDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-1-column0']", AI = false)
	public WebElement inpName_36;

	@IFindBy(how = How.CSS, using = "select[name='NewBusinessWeek-BusinessWeekDetailScreen-BusinessWeekDayDetailDV-BusinessWeekEndInput']", AI = false)
	public WebElement drpEndofBusinessWeek;

	@IFindBy(how = How.CSS, using = "input[id$='AppliesToAllZones_1']", AI = false)
	public WebElement rdbAppliesToAllZones;

	@IFindBy(how = How.CSS, using = "#NewBusinessWeek-BusinessWeekDetailScreen-BusinessWeekDayDetailDV-WednesdayBusinessEnd_dateIcon", AI = false)
	public WebElement btnBusinessdayendDateIcon_15;

	@IFindBy(how = How.CSS, using = "input[name='NewBusinessWeek-BusinessWeekDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-0-column0']", AI = false)
	public WebElement inpName_33;

	@IFindBy(how = How.CSS, using = "#NewBusinessWeek-BusinessWeekDetailScreen-BusinessWeekDayDetailDV-ThursdayBusinessStart_dateIcon", AI = false)
	public WebElement btnBusinessdaystartDateIcon_18;

	@IFindBy(how = How.CSS, using = "#NewBusinessWeek-BusinessWeekDetailScreen-BusinessWeekDayDetailDV-WednesdayBusinessStart_dateIcon", AI = false)
	public WebElement btnBusinessdaystartDateIcon_13;

	@IFindBy(how = How.CSS, using = "#NewBusinessWeek-BusinessWeekDetailScreen-BusinessWeekDayDetailDV-ThursdayBusinessEnd_dateIcon", AI = false)
	public WebElement btnBusinessdayendDateIcon_20;

	@IFindBy(how = How.CSS, using = "#NewBusinessWeek-BusinessWeekDetailScreen-BusinessWeekDetailDV-BusinessWeekZonesLV_tb-Remove>div[role='button']", AI = false)
	public WebElement btnRemove;

	@IFindBy(how = How.CSS, using = "input[name='NewBusinessWeek-BusinessWeekDetailScreen-BusinessWeekDayDetailDV-TuesdayBusinessEnd']", AI = false)
	public WebElement inpBusinessdayend_9;

	@IFindBy(how = How.CSS, using = "#NewBusinessWeek-BusinessWeekDetailScreen-BusinessWeekDayDetailDV-SundayBusinessEnd_dateIcon", AI = false)
	public WebElement btnBusinessdayendDateIcon;

	@IFindBy(how = How.CSS, using = "input[name='NewBusinessWeek-BusinessWeekDetailScreen-BusinessWeekDayDetailDV-SaturdayBusinessDay']", AI = false)
	public WebElement rdbIsabusinessday_26;

	@IFindBy(how = How.CSS, using = "input[name$='Name']", AI = false)
	public WebElement inpName;

	@IFindBy(how = How.CSS, using = "input[name='NewBusinessWeek-BusinessWeekDetailScreen-BusinessWeekDayDetailDV-FridayBusinessDay']", AI = false)
	public WebElement rdbIsabusinessday_21;

	@IFindBy(how = How.CSS, using = "input[name='NewBusinessWeek-BusinessWeekDetailScreen-BusinessWeekDayDetailDV-MondayBusinessDay']", AI = false)
	public WebElement rdbIsabusinessday_1;

	@IFindBy(how = How.CSS, using = "select[name='NewBusinessWeek-BusinessWeekDetailScreen-Country']", AI = false)
	public WebElement drpCountry;

	@IFindBy(how = How.CSS, using = "#NewBusinessWeek-BusinessWeekDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV_tb-Remove>div[role='button']", AI = false)
	public WebElement btnRemove_32;

	@IFindBy(how = How.CSS, using = "select[name='NewBusinessWeek-BusinessWeekDetailScreen-BusinessWeekDetailDV-state']", AI = false)
	public WebElement drpState;

	@IFindBy(how = How.CSS, using = "input[name='NewBusinessWeek-BusinessWeekDetailScreen-BusinessWeekDayDetailDV-TuesdayBusinessDay']", AI = false)
	public WebElement rdbIsabusinessday_6;

	@IFindBy(how = How.CSS, using = "input[name='NewBusinessWeek-BusinessWeekDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-1-Language']", AI = false)
	public WebElement inpLanguage_35;

	@IFindBy(how = How.CSS, using = "#NewBusinessWeek-BusinessWeekDetailScreen-BusinessWeekDayDetailDV-TuesdayBusinessEnd_dateIcon", AI = false)
	public WebElement btnBusinessdayendDateIcon_10;

	@IFindBy(how = How.CSS, using = "div[id$='Cancel']", AI = false)
	public WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "input[name='NewBusinessWeek-BusinessWeekDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-0-column2']", AI = false)
	public WebElement inpDependentonRender_34;

	@IFindBy(how = How.CSS, using = "#NewBusinessWeek-BusinessWeekDetailScreen-BusinessWeekDayDetailDV-SundayBusinessStart_dateIcon", AI = false)
	public WebElement btnBusinessdaystartDateIcon;

	@IFindBy(how = How.CSS, using = "#NewBusinessWeek-BusinessWeekDetailScreen-BusinessWeekDetailDV-BusinessWeekZonesLV_tb-Add>div[role='button']", AI = false)
	public WebElement btnAdd;

	@IFindBy(how = How.CSS, using = "input[name='NewBusinessWeek-BusinessWeekDetailScreen-BusinessWeekDayDetailDV-BusinessDayDemarcation']", AI = false)
	public WebElement inpBusinessDayDemarcation;

	@IFindBy(how = How.CSS, using = "input[name='NewBusinessWeek-BusinessWeekDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-0-column1']", AI = false)
	public WebElement inpDependentonRender;

	@IFindBy(how = How.CSS, using = "#NewBusinessWeek-BusinessWeekDetailScreen-BusinessWeekDayDetailDV-TuesdayBusinessStart_dateIcon", AI = false)
	public WebElement btnBusinessdaystartDateIcon_8;

	@IFindBy(how = How.CSS, using = "#NewBusinessWeek-BusinessWeekDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV_tb-Add>div[role='button']", AI = false)
	public WebElement btnAdd_31;

	@IFindBy(how = How.CSS, using = "input[name='NewBusinessWeek-BusinessWeekDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-1-column1']", AI = false)
	public WebElement inpDependentonRender_37;

	@IFindBy(how = How.CSS, using = "input[name='NewBusinessWeek-BusinessWeekDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-1-column2']", AI = false)
	public WebElement inpDependentonRender_38;

	@IFindBy(how = How.CSS, using = "div[id$='BusinessWeek_AddBusinessWeek']", AI = false)
	public WebElement btnBusinessWeek;

	@IFindBy(how = How.CSS, using = "input[name$='LocalizedValuesLV-LocalizedValuesLV-0-column0']", AI = false)
	public WebElement inpEdgePolicyholderEnglish;

	@IFindBy(how = How.CSS, using = "input[name$='LocalizedValuesLV-LocalizedValuesLV-2-column0']", AI = false)
	public WebElement inpEdgeEnglish;
	
	@IFindBy(how = How.CSS, using = "div[id$='BusinessWeeksLV-0-Name']", AI = false)
	public WebElement btnName;

	@IFindBy(how = How.CSS, using = "div[id$='BusinessWeekDetail_UpLink']", AI = false)
	public WebElement btnUpToBusinessWeek;
	
	@IFindBy(how = How.CSS, using = "div[id$='DeleteButton']", AI = false)
	public WebElement btnDelete;

	public BusinessWeekPage(){
	}

	public BusinessWeekPage(WebDriver driver) throws Exception{
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
		}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, inpDependentonRender_38))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);
	}public BusinessWeekPage enterBusinessdaystart_12(WebDriver driver,String Businessdaystart_12) {
		BrowserActions.type(driver, inpBusinessdaystart_12,Businessdaystart_12, "Businessdaystart_12");
		return this;
	}
	public BusinessWeekPage selectZones(WebDriver driver,String Zones)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpZones,Zones,"Zones");
		return this;
	}
	public BusinessWeekPage enterZones(WebDriver driver,String Zones) {
		BrowserActions.type(driver, inpZones,Zones, "Zones");
		return this;
	}
	public BusinessWeekPage clickBusinessdayendDateIcon_5(WebDriver driver)  {
		BrowserActions.click(driver, btnBusinessdayendDateIcon_5,"BusinessdayendDateIcon_5");
		return this;
	}
	public BusinessWeekPage enterBusinessdaystart_2(WebDriver driver,String Businessdaystart_2) {
		BrowserActions.type(driver, inpBusinessdaystart_2,Businessdaystart_2, "Businessdaystart_2");
		return this;
	}
	public BusinessWeekPage enterBusinessdayend(WebDriver driver,String Businessdayend) {
		BrowserActions.type(driver, inpBusinessdayend,Businessdayend, "Businessdayend");
		return this;
	}
	public BusinessWeekPage enterLanguage_39(WebDriver driver,String Language_39) {
		BrowserActions.type(driver, inpLanguage_39,Language_39, "Language_39");
		return this;
	}
	public BusinessWeekPage enterDependentonRender_42(WebDriver driver,String DependentonRender_42) {
		BrowserActions.type(driver, inpDependentonRender_42,DependentonRender_42, "DependentonRender_42");
		return this;
	}
	public BusinessWeekPage enterDependentonRender_41(WebDriver driver,String DependentonRender_41) {
		BrowserActions.type(driver, inpDependentonRender_41,DependentonRender_41, "DependentonRender_41");
		return this;
	}
	public BusinessWeekPage enterBusinessdaystart_17(WebDriver driver,String Businessdaystart_17) {
		BrowserActions.type(driver, inpBusinessdaystart_17,Businessdaystart_17, "Businessdaystart_17");
		return this;
	}
	public BusinessWeekPage clickIsabusinessday(WebDriver driver)  {
		BrowserActions.click(driver, rdbIsabusinessday,"Isabusinessday");
		return this;
	}
	public BusinessWeekPage enterLanguage(WebDriver driver,String Language) {
		BrowserActions.type(driver, inpLanguage,Language, "Language");
		return this;
	}
	public BusinessWeekPage enterBusinessdaystart_7(WebDriver driver,String Businessdaystart_7) {
		BrowserActions.type(driver, inpBusinessdaystart_7,Businessdaystart_7, "Businessdaystart_7");
		return this;
	}
	public BusinessWeekPage enterBusinessdayend_4(WebDriver driver,String Businessdayend_4) {
		BrowserActions.type(driver, inpBusinessdayend_4,Businessdayend_4, "Businessdayend_4");
		return this;
	}
	public BusinessWeekPage enterBusinessdaystart_22(WebDriver driver,String Businessdaystart_22) {
		BrowserActions.type(driver, inpBusinessdaystart_22,Businessdaystart_22, "Businessdaystart_22");
		return this;
	}
	public BusinessWeekPage enterName_40(WebDriver driver,String Name_40) {
		BrowserActions.type(driver, inpName_40,Name_40, "Name_40");
		return this;
	}
	public BusinessWeekPage enterBusinessdayend_29(WebDriver driver,String Businessdayend_29) {
		BrowserActions.type(driver, inpBusinessdayend_29,Businessdayend_29, "Businessdayend_29");
		return this;
	}
	public BusinessWeekPage clickBusinessdayendDateIcon_25(WebDriver driver)  {
		BrowserActions.click(driver, btnBusinessdayendDateIcon_25,"BusinessdayendDateIcon_25");
		return this;
	}
	public BusinessWeekPage enterBusinessdayend_24(WebDriver driver,String Businessdayend_24) {
		BrowserActions.type(driver, inpBusinessdayend_24,Businessdayend_24, "Businessdayend_24");
		return this;
	}
	public BusinessWeekPage clickBusinessdaystartDateIcon_28(WebDriver driver)  {
		BrowserActions.click(driver, btnBusinessdaystartDateIcon_28,"BusinessdaystartDateIcon_28");
		return this;
	}
	public BusinessWeekPage clickBusinessdayendDateIcon_30(WebDriver driver)  {
		BrowserActions.click(driver, btnBusinessdayendDateIcon_30,"BusinessdayendDateIcon_30");
		return this;
	}
	public BusinessWeekPage enterBusinessdaystart(WebDriver driver,String Businessdaystart) {
		BrowserActions.type(driver, inpBusinessdaystart,Businessdaystart, "Businessdaystart");
		return this;
	}
	public BusinessWeekPage clickBusinessdaystartDateIcon_23(WebDriver driver)  {
		BrowserActions.click(driver, btnBusinessdaystartDateIcon_23,"BusinessdaystartDateIcon_23");
		return this;
	}
	public BusinessWeekPage clickBusinessDayDemarcationDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnBusinessDayDemarcationDateIcon,"BusinessDayDemarcationDateIcon");
		return this;
	}
	public BusinessWeekPage enterBusinessdaystart_27(WebDriver driver,String Businessdaystart_27) {
		BrowserActions.type(driver, inpBusinessdaystart_27,Businessdaystart_27, "Businessdaystart_27");
		return this;
	}
	public BusinessWeekPage enterBusinessdayend_14(WebDriver driver,String Businessdayend_14) {
		BrowserActions.type(driver, inpBusinessdayend_14,Businessdayend_14, "Businessdayend_14");
		return this;
	}
	public BusinessWeekPage clickIsabusinessday_16(WebDriver driver)  {
		BrowserActions.click(driver, rdbIsabusinessday_16,"Isabusinessday_16");
		return this;
	}
	public BusinessWeekPage selectBusinessWeekZoneType(WebDriver driver,String BusinessWeekZoneType)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpBusinessWeekZoneType,BusinessWeekZoneType,"BusinessWeekZoneType");
		return this;
	}
	public BusinessWeekPage clickEdit(WebDriver driver)  {
		BrowserActions.click(driver, btnEdit,"Edit");
		return this;
	}
	public BusinessWeekPage clickBusinessdaystartDateIcon_3(WebDriver driver)  {
		BrowserActions.click(driver, btnBusinessdaystartDateIcon_3,"BusinessdaystartDateIcon_3");
		return this;
	}
	public BusinessWeekPage clickIsabusinessday_11(WebDriver driver)  {
		BrowserActions.click(driver, rdbIsabusinessday_11,"Isabusinessday_11");
		return this;
	}
	public BusinessWeekPage enterBusinessdayend_19(WebDriver driver,String Businessdayend_19) {
		BrowserActions.type(driver, inpBusinessdayend_19,Businessdayend_19, "Businessdayend_19");
		return this;
	}
	public BusinessWeekPage clickUpdate(WebDriver driver)  {
		BrowserActions.click(driver, btnUpdate,1.5,"Update");
		return this;
	}
	public BusinessWeekPage enterName_36(WebDriver driver,String Name_36) {
		BrowserActions.type(driver, inpName_36,Name_36, "Name_36");
		return this;
	}
	public BusinessWeekPage selectEndofBusinessWeek(WebDriver driver,String EndofBusinessWeek)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpEndofBusinessWeek,EndofBusinessWeek,"EndofBusinessWeek");
		return this;
	}
	public BusinessWeekPage clickAppliesToAllZones(WebDriver driver)  {
		BrowserActions.click(driver, rdbAppliesToAllZones,"AppliesToAllZones");
		return this;
	}
	public BusinessWeekPage clickBusinessdayendDateIcon_15(WebDriver driver)  {
		BrowserActions.click(driver, btnBusinessdayendDateIcon_15,"BusinessdayendDateIcon_15");
		return this;
	}
	public BusinessWeekPage enterName_33(WebDriver driver,String Name_33) {
		BrowserActions.type(driver, inpName_33,Name_33, "Name_33");
		return this;
	}
	public BusinessWeekPage clickBusinessdaystartDateIcon_18(WebDriver driver)  {
		BrowserActions.click(driver, btnBusinessdaystartDateIcon_18,"BusinessdaystartDateIcon_18");
		return this;
	}
	public BusinessWeekPage clickBusinessdaystartDateIcon_13(WebDriver driver)  {
		BrowserActions.click(driver, btnBusinessdaystartDateIcon_13,"BusinessdaystartDateIcon_13");
		return this;
	}
	public BusinessWeekPage clickBusinessdayendDateIcon_20(WebDriver driver)  {
		BrowserActions.click(driver, btnBusinessdayendDateIcon_20,"BusinessdayendDateIcon_20");
		return this;
	}
	public BusinessWeekPage clickRemove(WebDriver driver)  {
		BrowserActions.click(driver, btnRemove,"Remove");
		return this;
	}
	public BusinessWeekPage enterBusinessdayend_9(WebDriver driver,String Businessdayend_9) {
		BrowserActions.type(driver, inpBusinessdayend_9,Businessdayend_9, "Businessdayend_9");
		return this;
	}
	public BusinessWeekPage clickBusinessdayendDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnBusinessdayendDateIcon,"BusinessdayendDateIcon");
		return this;
	}
	public BusinessWeekPage clickIsabusinessday_26(WebDriver driver)  {
		BrowserActions.click(driver, rdbIsabusinessday_26,"Isabusinessday_26");
		return this;
	}
	public BusinessWeekPage enterName(WebDriver driver,String Name) {
		BrowserActions.type(driver, inpName,Name, "Name");
		return this;
	}
	public BusinessWeekPage clickIsabusinessday_21(WebDriver driver)  {
		BrowserActions.click(driver, rdbIsabusinessday_21,"Isabusinessday_21");
		return this;
	}
	public BusinessWeekPage clickIsabusinessday_1(WebDriver driver)  {
		BrowserActions.click(driver, rdbIsabusinessday_1,"Isabusinessday_1");
		return this;
	}
	public BusinessWeekPage selectCountry(WebDriver driver,String Country)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCountry,Country,"Country");
		return this;
	}
	public BusinessWeekPage clickRemove_32(WebDriver driver)  {
		BrowserActions.click(driver, btnRemove_32,"Remove_32");
		return this;
	}
	public BusinessWeekPage selectState(WebDriver driver,String State)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpState,State,"State");
		return this;
	}
	public BusinessWeekPage clickIsabusinessday_6(WebDriver driver)  {
		BrowserActions.click(driver, rdbIsabusinessday_6,"Isabusinessday_6");
		return this;
	}
	public BusinessWeekPage enterLanguage_35(WebDriver driver,String Language_35) {
		BrowserActions.type(driver, inpLanguage_35,Language_35, "Language_35");
		return this;
	}
	public BusinessWeekPage clickBusinessdayendDateIcon_10(WebDriver driver)  {
		BrowserActions.click(driver, btnBusinessdayendDateIcon_10,"BusinessdayendDateIcon_10");
		return this;
	}
	public BusinessWeekPage clickCancel(WebDriver driver)  {
		BrowserActions.click(driver, btnCancel,"Cancel");
		return this;
	}
	public BusinessWeekPage enterDependentonRender_34(WebDriver driver,String DependentonRender_34) {
		BrowserActions.type(driver, inpDependentonRender_34,DependentonRender_34, "DependentonRender_34");
		return this;
	}
	public BusinessWeekPage clickBusinessdaystartDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnBusinessdaystartDateIcon,"BusinessdaystartDateIcon");
		return this;
	}
	public BusinessWeekPage clickAdd(WebDriver driver)  {
		BrowserActions.click(driver, btnAdd,"Add");
		return this;
	}
	public BusinessWeekPage enterBusinessDayDemarcation(WebDriver driver,String BusinessDayDemarcation) {
		BrowserActions.type(driver, inpBusinessDayDemarcation,BusinessDayDemarcation, "BusinessDayDemarcation");
		return this;
	}
	public BusinessWeekPage enterDependentonRender(WebDriver driver,String DependentonRender) {
		BrowserActions.type(driver, inpDependentonRender,DependentonRender, "DependentonRender");
		return this;
	}
	public BusinessWeekPage clickBusinessdaystartDateIcon_8(WebDriver driver)  {
		BrowserActions.click(driver, btnBusinessdaystartDateIcon_8,"BusinessdaystartDateIcon_8");
		return this;
	}
	public BusinessWeekPage clickAdd_31(WebDriver driver)  {
		BrowserActions.click(driver, btnAdd_31,"Add_31");
		return this;
	}
	public BusinessWeekPage enterDependentonRender_37(WebDriver driver,String DependentonRender_37) {
		BrowserActions.type(driver, inpDependentonRender_37,DependentonRender_37, "DependentonRender_37");
		return this;
	}
	public BusinessWeekPage enterDependentonRender_38(WebDriver driver,String DependentonRender_38) {
		BrowserActions.type(driver, inpDependentonRender_38,DependentonRender_38, "DependentonRender_38");
		return this;
	}
	public BusinessWeekPage clickAddBusinessWeek(WebDriver driver)  {
		BrowserActions.click(driver, btnBusinessWeek,"Business Week");
		return this;
	}
	public BusinessWeekPage enterEdgePolicyholderEnglish(WebDriver driver,String localization) {
		BrowserActions.type(driver, inpEdgePolicyholderEnglish,localization,2, "Edge Policyholder English");
		return this;
	}
	public BusinessWeekPage enterEdgeEnglish(WebDriver driver,String localization) {
		BrowserActions.type(driver, inpEdgeEnglish,localization,2,"Edge English");
		return this;
	}
	
	public BusinessWeekPage clickName(WebDriver driver,String name)  {
		BrowserActions.waitForElementToDisplay(driver,lblTtlBar,2);
		By businessWeeknameBy = By.xpath("//div[text()='"+name+"']");
		BrowserActions.waitForElementToDisplay(driver, businessWeeknameBy, "Business wee name");
		WebElement businessWeekname = businessWeeknameBy.findElement(driver);
		BrowserActions.click(driver, businessWeekname,1.5,"Business Week Name Link");
		return this;
	}


	public void verifyBusinessWeekNameIsUpdated(WebDriver driver,String oldName) {
		BrowserActions.waitForElementToDisplay(driver, inpName);
		String updatedName = inpName.getAttribute("value");
		if (!updatedName.equals(oldName)) {
			Log.message("Business Week Name is updated");
		}
		else{
			Log.message("Business Week Name not updated");
		}
	}
	public BusinessWeekPage clickUpToBusinessWeek(WebDriver driver)  {
		BrowserActions.click(driver, btnUpToBusinessWeek,"UpTo BusinessWeek");
		return this;
	}

	public BusinessWeekPage clickNameCheckBox(WebDriver driver,String name) {
		BrowserActions.waitForElementToDisplay(driver,lblTtlBar);
		By nameCheckBoxBy = By.xpath("//div[text()='"+name+"']//ancestor::td//preceding-sibling::td//descendant::div[contains(@id,'_Checkbox')]");
		BrowserActions.waitForElementToDisplay(driver, nameCheckBoxBy, "name check box");
		WebElement nameCheckBox = nameCheckBoxBy.findElement(driver);
		BrowserActions.click(driver, nameCheckBox,"Name check box");
		return this;
	}

	public BusinessWeekPage verifyBusinessWeekMainPage(WebDriver driver)  {
		BrowserActions.verifyElementDisplayed(driver, lblTtlBar,"Business Week main page title");
		return this;
	}

	public BusinessWeekPage clickDelete(WebDriver driver)  {
		BrowserActions.click(driver, btnDelete,"Delete");
		return this;
	}

	public void verifyclickAddedBusinessWeekIsNotDisplayed(WebDriver driver,String name)  {
		boolean flag = false;
		BrowserActions.waitForNetworkIdleState(driver);
		By nameBy = By.xpath("//div[text()='"+name+"']");
		int size = BrowserActions.getWebElementSize(driver, nameBy, "name", 0.5);
		if(size == 0) {
			flag = true;
		}
		Log.softAssertThat(flag, "BusinessWeek("+name+") is deleted", "BusinessWeek("+name+") present in list is not deleted");
	}

}
