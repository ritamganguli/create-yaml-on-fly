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
import com.aspire.guidewire.utils.Utils;
import com.aspire.guidewire.utils.WaitUtils;

import ASPIREAI.customfactories.AjaxElementLocatorFactory;
import ASPIREAI.customfactories.IFindBy;
import ASPIREAI.customfactories.PageFactory;

public class CatastrophesPage extends LoadableComponent<CatastrophesPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();


	@IFindBy(how = How.CSS, using = "input[name='Catastrophes-CatastrophesScreen-CatastropheAdminLV-0-Status']", AI = false)
	public WebElement inpStatus;

	@IFindBy(how = How.CSS, using = "input[name='Catastrophes-CatastrophesScreen-CatastropheAdminLV-1-CatastropheValidTo']", AI = false)
	public WebElement inpEndDate_6;

	@IFindBy(how = How.CSS, using = "input[name='Catastrophes-CatastrophesScreen-CatastropheAdminLV-2-Name']", AI = false)
	public WebElement inpName_14;

	@IFindBy(how = How.CSS, using = "input[name='Catastrophes-CatastrophesScreen-CatastropheAdminLV-4-CatastropheValidFrom']", AI = false)
	public WebElement inpBeginDate_40;

	@IFindBy(how = How.CSS, using = "#Catastrophes-CatastrophesScreen-Catastrophes_ActivateButton>div[role='button']", AI = false)
	public WebElement btnActivate;

	@IFindBy(how = How.CSS, using = "select[name='Catastrophes-CatastrophesScreen-CatastropheAdminLV-3-Type']", AI = false)
	public WebElement drpType_32;

	@IFindBy(how = How.CSS, using = "input[name='Catastrophes-CatastrophesScreen-CatastropheAdminLV-4-Description']", AI = false)
	public WebElement inpComments_45;

	@IFindBy(how = How.CSS, using = "#Catastrophes-CatastrophesScreen-CatastropheAdminLV-3-CatastropheValidTo_dateIcon", AI = false)
	public WebElement btnEndDateDateIcon_31;

	@IFindBy(how = How.CSS, using = "input[name='Catastrophes-CatastrophesScreen-CatastropheAdminLV-2-CreateTime']", AI = false)
	public WebElement inpLastEdited_22;

	@IFindBy(how = How.CSS, using = "input[name='Catastrophes-CatastrophesScreen-CatastropheAdminLV-4-CatastropheValidTo']", AI = false)
	public WebElement inpEndDate_42;

	@IFindBy(how = How.CSS, using = "#Catastrophes-CatastrophesScreen-Catastrophes_AddCatastropheButton>div[role='button']", AI = false)
	public WebElement btnAddCatastrophe;

	@IFindBy(how = How.CSS, using = "input[name='Catastrophes-CatastrophesScreen-CatastropheAdminLV-3-CreateUser']", AI = false)
	public WebElement inpLastUser_36;

	@IFindBy(how = How.CSS, using = "#Catastrophes-CatastrophesScreen-CatastropheAdminLV-1-CatastropheValidTo_dateIcon", AI = false)
	public WebElement btnEndDateDateIcon_7;

	@IFindBy(how = How.CSS, using = "#Catastrophes-CatastrophesScreen-CatastropheAdminLV-4-CatastropheValidFrom_dateIcon", AI = false)
	public WebElement btnBeginDateDateIcon_41;

	@IFindBy(how = How.CSS, using = "#Catastrophes-CatastrophesScreen-CatastropheAdminLV-3-CatastropheValidFrom_dateIcon", AI = false)
	public WebElement btnBeginDateDateIcon_29;

	@IFindBy(how = How.CSS, using = "input[name='Catastrophes-CatastrophesScreen-CatastropheAdminLV-0-CreateUser']", AI = false)
	public WebElement inpLastUser;

	@IFindBy(how = How.CSS, using = "input[name='Catastrophes-CatastrophesScreen-CatastropheAdminLV-2-Description']", AI = false)
	public WebElement inpComments_21;

	@IFindBy(how = How.CSS, using = "#Catastrophes-CatastrophesScreen-CatastropheAdminLV-1-CreateTime_dateIcon", AI = false)
	public WebElement btnLastEditedDateIcon_11;

	@IFindBy(how = How.CSS, using = "select[name='Catastrophes-CatastrophesScreen-CatastropheAdminLV-4-Type']", AI = false)
	public WebElement drpType_44;

	@IFindBy(how = How.CSS, using = "input[name='Catastrophes-CatastrophesScreen-CatastropheAdminLV-2-CatastropheNumber']", AI = false)
	public WebElement inpCATNo_15;

	@IFindBy(how = How.CSS, using = "#Catastrophes-CatastrophesScreen-CatastropheAdminLV-4-CreateTime_dateIcon", AI = false)
	public WebElement btnLastEditedDateIcon_47;

	@IFindBy(how = How.CSS, using = "input[name='Catastrophes-CatastrophesScreen-CatastropheAdminLV-2-Status']", AI = false)
	public WebElement inpStatus_13;

	@IFindBy(how = How.CSS, using = "select[name='Catastrophes-CatastrophesScreen-CatastropheAdminLV-0-Type']", AI = false)
	public WebElement drpType;

	@IFindBy(how = How.CSS, using = "input[name='Catastrophes-CatastrophesScreen-CatastropheAdminLV-1-CreateTime']", AI = false)
	public WebElement inpLastEdited_10;

	@IFindBy(how = How.CSS, using = "input[name='Catastrophes-CatastrophesScreen-CatastropheAdminLV-0-CatastropheNumber']", AI = false)
	public WebElement inpCATNo;

	@IFindBy(how = How.CSS, using = "input[name='Catastrophes-CatastrophesScreen-CatastropheAdminLV-2-CreateUser']", AI = false)
	public WebElement inpLastUser_24;

	@IFindBy(how = How.CSS, using = "input[name='Catastrophes-CatastrophesScreen-CatastropheAdminLV-1-CatastropheNumber']", AI = false)
	public WebElement inpCATNo_3;

	@IFindBy(how = How.CSS, using = "input[name='Catastrophes-CatastrophesScreen-CatastropheAdminLV-2-CatastropheValidFrom']", AI = false)
	public WebElement inpBeginDate_16;

	@IFindBy(how = How.CSS, using = "input[name='Catastrophes-CatastrophesScreen-CatastropheAdminLV-0-Description']", AI = false)
	public WebElement inpComments;

	@IFindBy(how = How.CSS, using = "input[name='Catastrophes-CatastrophesScreen-CatastropheAdminLV-2-CatastropheValidTo']", AI = false)
	public WebElement inpEndDate_18;

	@IFindBy(how = How.CSS, using = "#Catastrophes-CatastrophesScreen-ttlBar", AI = false)
	public WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "#Catastrophes-CatastrophesScreen-CatastropheAdminLV-2-CatastropheValidFrom_dateIcon", AI = false)
	public WebElement btnBeginDateDateIcon_17;

	@IFindBy(how = How.CSS, using = "input[name='Catastrophes-CatastrophesScreen-CatastropheAdminLV-4-Name']", AI = false)
	public WebElement inpName_38;

	@IFindBy(how = How.CSS, using = "#Catastrophes-CatastrophesScreen-Catastrophes_DeactivateButton>div[role='button']", AI = false)
	public WebElement btnDeactivate;

	@IFindBy(how = How.CSS, using = "#Catastrophes-CatastrophesScreen-CatastropheAdminLV-2-CreateTime_dateIcon", AI = false)
	public WebElement btnLastEditedDateIcon_23;

	@IFindBy(how = How.CSS, using = "#Catastrophes-CatastrophesScreen-CatastropheAdminLV-2-CatastropheValidTo_dateIcon", AI = false)
	public WebElement btnEndDateDateIcon_19;

	@IFindBy(how = How.CSS, using = "input[name='Catastrophes-CatastrophesScreen-CatastropheAdminLV-0-CatastropheValidTo']", AI = false)
	public WebElement inpEndDate;

	@IFindBy(how = How.CSS, using = "#Catastrophes-CatastrophesScreen-CatastropheAdminLV-1-CatastropheValidFrom_dateIcon", AI = false)
	public WebElement btnBeginDateDateIcon_5;

	@IFindBy(how = How.CSS, using = "#Catastrophes-CatastrophesScreen-CatastropheAdminLV-0-CreateTime_dateIcon", AI = false)
	public WebElement btnLastEditedDateIcon;

	@IFindBy(how = How.CSS, using = "input[name='Catastrophes-CatastrophesScreen-CatastropheAdminLV-4-CreateTime']", AI = false)
	public WebElement inpLastEdited_46;

	@IFindBy(how = How.CSS, using = "input[name='Catastrophes-CatastrophesScreen-CatastropheAdminLV-1-CatastropheValidFrom']", AI = false)
	public WebElement inpBeginDate_4;

	@IFindBy(how = How.CSS, using = "input[name='Catastrophes-CatastrophesScreen-CatastropheAdminLV-3-Status']", AI = false)
	public WebElement inpStatus_25;

	@IFindBy(how = How.CSS, using = "select[name='Catastrophes-CatastrophesScreen-CatastropheAdminLV-1-Type']", AI = false)
	public WebElement drpType_8;

	@IFindBy(how = How.CSS, using = "input[name='Catastrophes-CatastrophesScreen-CatastropheAdminLV-1-CreateUser']", AI = false)
	public WebElement inpLastUser_12;

	@IFindBy(how = How.CSS, using = "input[name='Catastrophes-CatastrophesScreen-CatastropheAdminLV-3-CatastropheValidFrom']", AI = false)
	public WebElement inpBeginDate_28;

	@IFindBy(how = How.CSS, using = "input[name='Catastrophes-CatastrophesScreen-CatastropheAdminLV-3-CatastropheNumber']", AI = false)
	public WebElement inpCATNo_27;

	@IFindBy(how = How.CSS, using = "input[name='Catastrophes-CatastrophesScreen-CatastropheAdminLV-0-Name']", AI = false)
	public WebElement inpName;

	@IFindBy(how = How.CSS, using = "#Catastrophes-CatastrophesScreen-CatastropheAdminLV-0-CatastropheValidFrom_dateIcon", AI = false)
	public WebElement btnBeginDateDateIcon;

	@IFindBy(how = How.CSS, using = "input[name='Catastrophes-CatastrophesScreen-CatastropheAdminLV-3-Name']", AI = false)
	public WebElement inpName_26;

	@IFindBy(how = How.CSS, using = "input[name='Catastrophes-CatastrophesScreen-CatastropheAdminLV-0-CreateTime']", AI = false)
	public WebElement inpLastEdited;

	@IFindBy(how = How.CSS, using = "select[name='Catastrophes-CatastrophesScreen-CatastropheAdminLV-2-Type']", AI = false)
	public WebElement drpType_20;

	@IFindBy(how = How.CSS, using = "#Catastrophes-CatastrophesScreen-CatastropheAdminLV-3-CreateTime_dateIcon", AI = false)
	public WebElement btnLastEditedDateIcon_35;

	@IFindBy(how = How.CSS, using = "input[name='Catastrophes-CatastrophesScreen-CatastropheAdminLV-1-Status']", AI = false)
	public WebElement inpStatus_1;

	@IFindBy(how = How.CSS, using = "input[name='Catastrophes-CatastrophesScreen-CatastropheAdminLV-1-Description']", AI = false)
	public WebElement inpComments_9;

	@IFindBy(how = How.CSS, using = "input[name='Catastrophes-CatastrophesScreen-CatastropheAdminLV-3-Description']", AI = false)
	public WebElement inpComments_33;

	@IFindBy(how = How.CSS, using = "input[name='Catastrophes-CatastrophesScreen-CatastropheAdminLV-3-CreateTime']", AI = false)
	public WebElement inpLastEdited_34;

	@IFindBy(how = How.CSS, using = "input[name='Catastrophes-CatastrophesScreen-CatastropheAdminLV-4-Status']", AI = false)
	public WebElement inpStatus_37;

	@IFindBy(how = How.CSS, using = "#Catastrophes-CatastrophesScreen-CatastropheAdminLV-4-CatastropheValidTo_dateIcon", AI = false)
	public WebElement btnEndDateDateIcon_43;

	@IFindBy(how = How.CSS, using = "input[name='Catastrophes-CatastrophesScreen-CatastropheAdminLV-0-CatastropheValidFrom']", AI = false)
	public WebElement inpBeginDate;

	@IFindBy(how = How.CSS, using = "input[name='Catastrophes-CatastrophesScreen-CatastropheAdminLV-3-CatastropheValidTo']", AI = false)
	public WebElement inpEndDate_30;

	@IFindBy(how = How.CSS, using = "#Catastrophes-CatastrophesScreen-CatastropheAdminLV-0-CatastropheValidTo_dateIcon", AI = false)
	public WebElement btnEndDateDateIcon;

	@IFindBy(how = How.CSS, using = "input[name='Catastrophes-CatastrophesScreen-CatastropheAdminLV-4-CreateUser']", AI = false)
	public WebElement inpLastUser_48;

	@IFindBy(how = How.CSS, using = "input[name='Catastrophes-CatastrophesScreen-CatastropheAdminLV-1-Name']", AI = false)
	public WebElement inpName_2;

	@IFindBy(how = How.CSS, using = "input[name='Catastrophes-CatastrophesScreen-CatastropheAdminLV-4-CatastropheNumber']", AI = false)
	public WebElement inpCATNo_39;

	@IFindBy(how = How.CSS, using = "div[id$='Name_button']", AI = false)
	public WebElement btnCatastrophesName;

	@IFindBy(how = How.CSS, using = "div[id$='Edit']", AI = false)
	public WebElement btnEdit;

	@IFindBy(how = How.CSS, using = "div[id$='CatastropheDetailPage_UpLink']", AI = false)
	public WebElement btnUptoCatastrophe;

	@IFindBy(how = How.CSS, using = "div[id$='postLabel']", AI = false)
	public List<WebElement> lblLastPageNo;

	@IFindBy(how = How.CSS, using = "div[id$='ListPaging-next']", AI = false)
	public WebElement btnNextArrow;

	@IFindBy(how = How.CSS, using = "div[id$='ListPaging-first']", AI = false)
	public WebElement btnFirstPageNo;



	public String catastrophes= "div[id$='Name_button']";

	public CatastrophesPage(){
	}

	public CatastrophesPage(WebDriver driver) throws Exception{
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
		}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, inpCATNo_39))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);
	}public CatastrophesPage enterStatus(WebDriver driver,String Status) {
		BrowserActions.type(driver, inpStatus,Status, "Status");
		return this;
	}
	public CatastrophesPage enterEndDate_6(WebDriver driver,String EndDate_6) {
		BrowserActions.type(driver, inpEndDate_6,EndDate_6, "EndDate_6");
		return this;
	}
	public CatastrophesPage enterName_14(WebDriver driver,String Name_14) {
		BrowserActions.type(driver, inpName_14,Name_14, "Name_14");
		return this;
	}
	public CatastrophesPage enterBeginDate_40(WebDriver driver,String BeginDate_40) {
		BrowserActions.type(driver, inpBeginDate_40,BeginDate_40, "BeginDate_40");
		return this;
	}
	public CatastrophesPage clickActivate(WebDriver driver)  {
		BrowserActions.click(driver, btnActivate,true,"Activate");
		return this;
	}
	public CatastrophesPage selectType_32(WebDriver driver,String Type_32)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpType_32,Type_32,"Type_32");
		return this;
	}
	public CatastrophesPage enterComments_45(WebDriver driver,String Comments_45) {
		BrowserActions.type(driver, inpComments_45,Comments_45, "Comments_45");
		return this;
	}
	public CatastrophesPage clickEndDateDateIcon_31(WebDriver driver)  {
		BrowserActions.click(driver, btnEndDateDateIcon_31,"EndDateDateIcon_31");
		return this;
	}
	public CatastrophesPage enterLastEdited_22(WebDriver driver,String LastEdited_22) {
		BrowserActions.type(driver, inpLastEdited_22,LastEdited_22, "LastEdited_22");
		return this;
	}
	public CatastrophesPage enterEndDate_42(WebDriver driver,String EndDate_42) {
		BrowserActions.type(driver, inpEndDate_42,EndDate_42, "EndDate_42");
		return this;
	}
	public CatastrophesPage clickAddCatastrophe(WebDriver driver)  {
		BrowserActions.click(driver, btnAddCatastrophe,"AddCatastrophe");
		return this;
	}
	public CatastrophesPage enterLastUser_36(WebDriver driver,String LastUser_36) {
		BrowserActions.type(driver, inpLastUser_36,LastUser_36, "LastUser_36");
		return this;
	}
	public CatastrophesPage clickEndDateDateIcon_7(WebDriver driver)  {
		BrowserActions.click(driver, btnEndDateDateIcon_7,"EndDateDateIcon_7");
		return this;
	}
	public CatastrophesPage clickBeginDateDateIcon_41(WebDriver driver)  {
		BrowserActions.click(driver, btnBeginDateDateIcon_41,"BeginDateDateIcon_41");
		return this;
	}
	public CatastrophesPage clickBeginDateDateIcon_29(WebDriver driver)  {
		BrowserActions.click(driver, btnBeginDateDateIcon_29,"BeginDateDateIcon_29");
		return this;
	}
	public CatastrophesPage enterLastUser(WebDriver driver,String LastUser) {
		BrowserActions.type(driver, inpLastUser,LastUser, "LastUser");
		return this;
	}
	public CatastrophesPage enterComments_21(WebDriver driver,String Comments_21) {
		BrowserActions.type(driver, inpComments_21,Comments_21, "Comments_21");
		return this;
	}
	public CatastrophesPage clickLastEditedDateIcon_11(WebDriver driver)  {
		BrowserActions.click(driver, btnLastEditedDateIcon_11,"LastEditedDateIcon_11");
		return this;
	}
	public CatastrophesPage selectType_44(WebDriver driver,String Type_44)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpType_44,Type_44,"Type_44");
		return this;
	}
	public CatastrophesPage enterCATNo_15(WebDriver driver,String CATNo_15) {
		BrowserActions.type(driver, inpCATNo_15,CATNo_15, "CATNo_15");
		return this;
	}
	public CatastrophesPage clickLastEditedDateIcon_47(WebDriver driver)  {
		BrowserActions.click(driver, btnLastEditedDateIcon_47,"LastEditedDateIcon_47");
		return this;
	}
	public CatastrophesPage enterStatus_13(WebDriver driver,String Status_13) {
		BrowserActions.type(driver, inpStatus_13,Status_13, "Status_13");
		return this;
	}
	public CatastrophesPage selectType(WebDriver driver,String Type)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpType,Type,"Type");
		return this;
	}
	public CatastrophesPage enterLastEdited_10(WebDriver driver,String LastEdited_10) {
		BrowserActions.type(driver, inpLastEdited_10,LastEdited_10, "LastEdited_10");
		return this;
	}
	public CatastrophesPage enterCATNo(WebDriver driver,String CATNo) {
		BrowserActions.type(driver, inpCATNo,CATNo, "CATNo");
		return this;
	}
	public CatastrophesPage enterLastUser_24(WebDriver driver,String LastUser_24) {
		BrowserActions.type(driver, inpLastUser_24,LastUser_24, "LastUser_24");
		return this;
	}
	public CatastrophesPage enterCATNo_3(WebDriver driver,String CATNo_3) {
		BrowserActions.type(driver, inpCATNo_3,CATNo_3, "CATNo_3");
		return this;
	}
	public CatastrophesPage enterBeginDate_16(WebDriver driver,String BeginDate_16) {
		BrowserActions.type(driver, inpBeginDate_16,BeginDate_16, "BeginDate_16");
		return this;
	}
	public CatastrophesPage enterComments(WebDriver driver,String Comments) {
		BrowserActions.type(driver, inpComments,Comments, "Comments");
		return this;
	}
	public CatastrophesPage enterEndDate_18(WebDriver driver,String EndDate_18) {
		BrowserActions.type(driver, inpEndDate_18,EndDate_18, "EndDate_18");
		return this;
	}
	public CatastrophesPage clickBeginDateDateIcon_17(WebDriver driver)  {
		BrowserActions.click(driver, btnBeginDateDateIcon_17,"BeginDateDateIcon_17");
		return this;
	}
	public CatastrophesPage enterName_38(WebDriver driver,String Name_38) {
		BrowserActions.type(driver, inpName_38,Name_38, "Name_38");
		return this;
	}
	public CatastrophesPage clickDeactivate(WebDriver driver)  {
		BrowserActions.click(driver, btnDeactivate,1,"Deactivate");
		return this;
	}
	public CatastrophesPage clickLastEditedDateIcon_23(WebDriver driver)  {
		BrowserActions.click(driver, btnLastEditedDateIcon_23,"LastEditedDateIcon_23");
		return this;
	}
	public CatastrophesPage clickEndDateDateIcon_19(WebDriver driver)  {
		BrowserActions.click(driver, btnEndDateDateIcon_19,"EndDateDateIcon_19");
		return this;
	}
	public CatastrophesPage enterEndDate(WebDriver driver,String EndDate) {
		BrowserActions.type(driver, inpEndDate,EndDate, "EndDate");
		return this;
	}
	public CatastrophesPage clickBeginDateDateIcon_5(WebDriver driver)  {
		BrowserActions.click(driver, btnBeginDateDateIcon_5,"BeginDateDateIcon_5");
		return this;
	}
	public CatastrophesPage clickLastEditedDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnLastEditedDateIcon,"LastEditedDateIcon");
		return this;
	}
	public CatastrophesPage enterLastEdited_46(WebDriver driver,String LastEdited_46) {
		BrowserActions.type(driver, inpLastEdited_46,LastEdited_46, "LastEdited_46");
		return this;
	}
	public CatastrophesPage enterBeginDate_4(WebDriver driver,String BeginDate_4) {
		BrowserActions.type(driver, inpBeginDate_4,BeginDate_4, "BeginDate_4");
		return this;
	}
	public CatastrophesPage enterStatus_25(WebDriver driver,String Status_25) {
		BrowserActions.type(driver, inpStatus_25,Status_25, "Status_25");
		return this;
	}
	public CatastrophesPage selectType_8(WebDriver driver,String Type_8)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpType_8,Type_8,"Type_8");
		return this;
	}
	public CatastrophesPage enterLastUser_12(WebDriver driver,String LastUser_12) {
		BrowserActions.type(driver, inpLastUser_12,LastUser_12, "LastUser_12");
		return this;
	}
	public CatastrophesPage enterBeginDate_28(WebDriver driver,String BeginDate_28) {
		BrowserActions.type(driver, inpBeginDate_28,BeginDate_28, "BeginDate_28");
		return this;
	}
	public CatastrophesPage enterCATNo_27(WebDriver driver,String CATNo_27) {
		BrowserActions.type(driver, inpCATNo_27,CATNo_27, "CATNo_27");
		return this;
	}
	public CatastrophesPage enterName(WebDriver driver,String Name) {
		BrowserActions.type(driver, inpName,Name, "Name");
		return this;
	}
	public CatastrophesPage clickBeginDateDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnBeginDateDateIcon,"BeginDateDateIcon");
		return this;
	}
	public CatastrophesPage enterName_26(WebDriver driver,String Name_26) {
		BrowserActions.type(driver, inpName_26,Name_26, "Name_26");
		return this;
	}
	public CatastrophesPage enterLastEdited(WebDriver driver,String LastEdited) {
		BrowserActions.type(driver, inpLastEdited,LastEdited, "LastEdited");
		return this;
	}
	public CatastrophesPage selectType_20(WebDriver driver,String Type_20)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpType_20,Type_20,"Type_20");
		return this;
	}
	public CatastrophesPage clickLastEditedDateIcon_35(WebDriver driver)  {
		BrowserActions.click(driver, btnLastEditedDateIcon_35,"LastEditedDateIcon_35");
		return this;
	}
	public CatastrophesPage enterStatus_1(WebDriver driver,String Status_1) {
		BrowserActions.type(driver, inpStatus_1,Status_1, "Status_1");
		return this;
	}
	public CatastrophesPage enterComments_9(WebDriver driver,String Comments_9) {
		BrowserActions.type(driver, inpComments_9,Comments_9, "Comments_9");
		return this;
	}
	public CatastrophesPage enterComments_33(WebDriver driver,String Comments_33) {
		BrowserActions.type(driver, inpComments_33,Comments_33, "Comments_33");
		return this;
	}
	public CatastrophesPage enterLastEdited_34(WebDriver driver,String LastEdited_34) {
		BrowserActions.type(driver, inpLastEdited_34,LastEdited_34, "LastEdited_34");
		return this;
	}
	public CatastrophesPage enterStatus_37(WebDriver driver,String Status_37) {
		BrowserActions.type(driver, inpStatus_37,Status_37, "Status_37");
		return this;
	}
	public CatastrophesPage clickEndDateDateIcon_43(WebDriver driver)  {
		BrowserActions.click(driver, btnEndDateDateIcon_43,"EndDateDateIcon_43");
		return this;
	}
	public CatastrophesPage enterBeginDate(WebDriver driver,String BeginDate) {
		BrowserActions.type(driver, inpBeginDate,BeginDate, "BeginDate");
		return this;
	}
	public CatastrophesPage enterEndDate_30(WebDriver driver,String EndDate_30) {
		BrowserActions.type(driver, inpEndDate_30,EndDate_30, "EndDate_30");
		return this;
	}
	public CatastrophesPage clickEndDateDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnEndDateDateIcon,"EndDateDateIcon");
		return this;
	}
	public CatastrophesPage enterLastUser_48(WebDriver driver,String LastUser_48) {
		BrowserActions.type(driver, inpLastUser_48,LastUser_48, "LastUser_48");
		return this;
	}
	public CatastrophesPage enterName_2(WebDriver driver,String Name_2) {
		BrowserActions.type(driver, inpName_2,Name_2, "Name_2");
		return this;
	}
	public CatastrophesPage enterCATNo_39(WebDriver driver,String CATNo_39) {
		BrowserActions.type(driver, inpCATNo_39,CATNo_39, "CATNo_39");
		return this;
	}

	public CatastrophesPage clickEdit(WebDriver driver)  {
		BrowserActions.click(driver, btnEdit,1,"Edit");
		return this;
	}

	public void clickCatastrophesNameLink(WebDriver driver,String name) {
		if(lblLastPageNo.size()>0) {
		boolean flag =false;
		String pageNo=lblLastPageNo.get(0).getText();
		String num=pageNo.replaceAll("[^0-9]","");
		int no=Integer.parseInt(num);
		for(int i=1;i<=no;i++) {
			BrowserActions.waitForNetworkIdleState(driver,2);
			By catostropheBy = By.cssSelector(catastrophes);
			List<WebElement> nameList = BrowserActions.getWebElements(driver, catostropheBy, "catostrophe", 0.5);
			for (WebElement listOfrules : nameList) {
				BrowserActions.waitForElementToDisplay(driver,btnCatastrophesName,2);
				if (listOfrules.getText().equals(name)) {
					By catastrophesNameBy = By.xpath("//div[text()='"+name+"']");
					BrowserActions.waitForElementToDisplay(driver, catastrophesNameBy,"catastrophes Name");
					WebElement catastrophesName = catastrophesNameBy.findElement(driver);
					BrowserActions.click(driver, catastrophesName,true,"Catastrophes Name Name Link");
					flag=true;
					break;
				}
			}
			if(!flag)
				BrowserActions.click(driver, btnNextArrow,"Next Button");
			if(flag)
				break;
		}}
		else
		{
			By catastrophesNameBy = By.xpath("//div[text()='"+name+"']");
			BrowserActions.waitForElementToDisplay(driver, catastrophesNameBy, "name check box");
			WebElement catastrophesName = catastrophesNameBy.findElement(driver);
			BrowserActions.click(driver, catastrophesName,true,"Catastrophes Name Name Link");
		}
		Log.message("Recently added name link selected");
	}

	public void clickNamesCheckBox(WebDriver driver,String name) {
		if(lblLastPageNo.size()>0) {
		boolean flag =false;
		String pageNo=lblLastPageNo.get(0).getText();
		String num=pageNo.replaceAll("[^0-9]","");
		int no=Integer.parseInt(num);
		for(int i=1;i<=no;i++) {
			BrowserActions.waitForNetworkIdleState(driver, 2);
			By catastropheBy = By.cssSelector(catastrophes);
			List<WebElement> nameList = BrowserActions.getWebElements(driver, catastropheBy, "catastrophe", 0.5);
			for (WebElement listOfrules : nameList) {
				BrowserActions.waitForNetworkIdleState(driver, 2);
				if (listOfrules.getText().equals(name)) {
					By nameCheckBoxBy = By.xpath("//div[text()='"+name+"']//ancestor::td//preceding-sibling::td//descendant::div[contains(@id,'_Checkbox')]");
					BrowserActions.waitForElementToDisplay(driver, nameCheckBoxBy, "name check box");
					WebElement nameCheckBox = nameCheckBoxBy.findElement(driver);
					BrowserActions.click(driver, nameCheckBox,1,"Name check box");
					flag=true;
					break;
				}

			}
			if(!flag)
				BrowserActions.click(driver, btnNextArrow,"Next Button");
			if(flag)
				break;
		}
		Log.message("Recently added name check box selected");
		}
		else
		{
			By nameCheckBoxBy = By.xpath("//div[text()='"+name+"']//ancestor::td//preceding-sibling::td//descendant::div[contains(@id,'_Checkbox')]");
			BrowserActions.waitForElementToDisplay(driver, nameCheckBoxBy, "name check box");
			WebElement nameCheckBox = nameCheckBoxBy.findElement(driver);
			BrowserActions.click(driver, nameCheckBox,1,"Name check box");
		}
	}

	public CatastrophesPage clickNameCheckBox(WebDriver driver,String name) {
		BrowserActions.waitForNetworkIdleState(driver, 1);
		By nameCheckBoxBy = By.xpath("//div[text()='"+name+"']//ancestor::td//preceding-sibling::td//descendant::div[contains(@id,'_Checkbox')]");
		BrowserActions.waitForElementToDisplay(driver, nameCheckBoxBy, "name check box");
		WebElement nameCheckBox = nameCheckBoxBy.findElement(driver);
		BrowserActions.click(driver, nameCheckBox,1,"Name check box");
		return this;
	}
	
	public CatastrophesPage clickUptoCatastrophes(WebDriver driver)  {
		BrowserActions.click(driver, btnUptoCatastrophe,"Upto Catastrophe");
		return this;
	}

	public CatastrophesPage verifyCatastrophesMainPage(WebDriver driver)  {
		BrowserActions.verifyElementDisplayed(driver, lblTtlBar,"Main Page Title");
		return this;
	}

	public void verifyCatastrophesNameIsUpdated(WebDriver driver,String oldName) {
		BrowserActions.waitForElementToDisplay(driver, inpName);
		String updatedName = inpName.getAttribute("value");
		if (!updatedName.equals(oldName)) {
			Log.message("Catastrophes name is updated");
		}
		else{
			Log.message("Catastrophes name name not updated");
		}
	}

	public void verifyCatastrophesStatusIsInActive(WebDriver driver,String name) {
		
		if(lblLastPageNo.size()>0) {
			boolean flag =false;
			String pageNo=lblLastPageNo.get(0).getText();
			String num=pageNo.replaceAll("[^0-9]","");
			int no=Integer.parseInt(num);
			for(int i=1;i<=no;i++) {
				BrowserActions.waitForNetworkIdleState(driver, 2);
				By nameListBy = By.cssSelector(catastrophes);
				List<WebElement> nameList = BrowserActions.getWebElements(driver, nameListBy, "name list", 0.5);
				for (WebElement listOfrules : nameList) {
					BrowserActions.waitForNetworkIdleState(driver, 2);
					if (listOfrules.getText().equals(name)) {
						By catastrophesStatusBy = By.xpath("//div[text()='"+name+"']//ancestor::td//preceding-sibling::td//descendant::div[contains(@id,'Status')]");
						BrowserActions.waitForElementToDisplay(driver, catastrophesStatusBy, "catastrophes status");
						WebElement catastrophesStatus = catastrophesStatusBy.findElement(driver);
						String activeStatus = BrowserActions.getText(driver, catastrophesStatus, "Status");
						if (activeStatus.equals("Inactive")) {
							Log.message("Status is "+activeStatus+" Catastrophe is deactivated");
						}
						else{
							Log.message("Status is "+activeStatus+" Catastrophe is Active");
						}
						flag=true;
						break;
					}
					
				}
					if(!flag)
						BrowserActions.click(driver, btnNextArrow,"Next Button");
					if(flag)
						break;
				}
				Log.message("Recently added name check box selected");
			}
		else
			{
				By catastrophesStatusBy = By.xpath("//div[text()='"+name+"']//ancestor::td//preceding-sibling::td//descendant::div[contains(@id,'Status')]");
				BrowserActions.waitForElementToDisplay(driver, catastrophesStatusBy,"catatrophes Status");
				WebElement catastrophesStatus = catastrophesStatusBy.findElement(driver);
				String activeStatus = BrowserActions.getText(driver, catastrophesStatus, "Status");
				if (activeStatus.equals("Inactive")) {
					Log.message("Status is "+activeStatus+" Catastrophe is deactivated");
				}
				else{
					Log.message("Status is "+activeStatus+" Catastrophe is Active");
				}
			}
		
	}

	public class NewCatastrophePage extends LoadableComponent<NewCatastrophePage> {

		WebDriver driver;
		private boolean isPageLoaded;
		public ElementLayer elementLayer;
		String elementObject;
		HashMap<String, String> getPageObjects;
		public List<Object> pageFactoryKey = new ArrayList<Object>();
		public List<String> pageFactoryValue = new ArrayList<String>();

		@IFindBy(how = How.CSS, using = "input[name='NewCatastrophe-CatastropheDetailScreen-AdminCatastrophePolicyPanelSet-Status']", AI = false)
		public WebElement inpStatus;

		@IFindBy(how = How.CSS, using = "select[name='NewCatastrophe-CatastropheDetailScreen-AdminCatastrophePolicyPanelSet-CatastropheHeatMapFilterPanelSet-AssignedToGroup']", AI = false)
		public WebElement drpAssignedToGroup;

		@IFindBy(how = How.CSS, using = "input[name='NewCatastrophe-CatastropheDetailScreen-AdminCatastropheDV-LocalizedValuesLV-2-column0']", AI = false)
		public WebElement inpName_12;

		@IFindBy(how = How.CSS, using = "input[name$='Description']", AI = false)
		public WebElement inpDescription;

		@IFindBy(how = How.CSS, using = "#NewCatastrophe-CatastropheDetailScreen-AdminCatastrophePolicyPanelSet-PolicyEffectiveDate_dateIcon", AI = false)
		public WebElement btnPolicyEffectiveDateDateIcon;

		@IFindBy(how = How.CSS, using = "#NewCatastrophe-CatastropheDetailScreen-AdminCatastrophePolicyPanelSet-SetCatastropheZone>div[role='button']", AI = false)
		public WebElement btnSetCatastropheZone;

		@IFindBy(how = How.CSS, using = "input[name='NewCatastrophe-CatastropheDetailScreen-AdminCatastropheDV-LocalizedValuesLV-0-Language']", AI = false)
		public WebElement inpLanguage;

		@IFindBy(how = How.CSS, using = "input[name='NewCatastrophe-CatastropheDetailScreen-AdminCatastrophePolicyPanelSet-PolicyRetrievalCompletionTimeNever']", AI = false)
		public WebElement inpLastRetrievalCompletedat_17;

		@IFindBy(how = How.CSS, using = "select[name='NewCatastrophe-CatastropheDetailScreen-AdminCatastropheDV-CatastropheZonesInputSet-ZoneType']", AI = false)
		public WebElement drpZoneType;

		@IFindBy(how = How.CSS, using = "input[name='NewCatastrophe-CatastropheDetailScreen-AdminCatastropheDV-LocalizedValuesLV-1-column1']", AI = false)
		public WebElement inpDescription_9;

		@IFindBy(how = How.CSS, using = "input[name='NewCatastrophe-CatastropheDetailScreen-AdminCatastropheDV-LocalizedValuesLV-2-Language']", AI = false)
		public WebElement inpLanguage_11;

		@IFindBy(how = How.CSS, using = "select[name='NewCatastrophe-CatastropheDetailScreen-AdminCatastrophePolicyPanelSet-CatastropheHeatMapFilterPanelSet-ReportedDate']", AI = false)
		public WebElement drpReportedDate;

		@IFindBy(how = How.CSS, using = "input[name='NewCatastrophe-CatastropheDetailScreen-AdminCatastropheDV-LocalizedValuesLV-0-column1']", AI = false)
		public WebElement inpDescription_6;

		@IFindBy(how = How.CSS, using = "#NewCatastrophe-CatastropheDetailScreen-AdminCatastropheDV-LocalizedValuesLV_tb-Remove>div[role='button']", AI = false)
		public WebElement btnRemove_4;

		@IFindBy(how = How.CSS, using = "select[name='NewCatastrophe-CatastropheDetailScreen-AdminCatastrophePolicyPanelSet-CatastropheHeatMapFilterPanelSet-catastrophe']", AI = false)
		public WebElement drpCatastrophe;

		@IFindBy(how = How.CSS, using = "#NewCatastrophe-CatastropheDetailScreen-AdminCatastropheDV_tb-FindUnmatchedClaimsButton>div[role='button']", AI = false)
		public WebElement btnFindUnmatchedClaims;

		@IFindBy(how = How.CSS, using = "input[name='NewCatastrophe-CatastropheDetailScreen-AdminCatastropheDV-LocalizedValuesLV-1-column2']", AI = false)
		public WebElement inpDependentonRender_10;

		@IFindBy(how = How.CSS, using = "#NewCatastrophe-CatastropheDetailScreen-DetailsTab", AI = false)
		public WebElement btnDetails;

		@IFindBy(how = How.CSS, using = "select[name='NewCatastrophe-CatastropheDetailScreen-AdminCatastropheDV-CatastropheAdmin_Type']", AI = false)
		public WebElement drpType;

		@IFindBy(how = How.CSS, using = "input[name='NewCatastrophe-CatastropheDetailScreen-AdminCatastropheDV-LocalizedValuesLV-1-Language']", AI = false)
		public WebElement inpLanguage_7;

		@IFindBy(how = How.CSS, using = "#NewCatastrophe-CatastropheDetailScreen-AdminCatastropheDV-CatastrophePerilsLV_tb-Remove>div[role='button']", AI = false)
		public WebElement btnRemove_2;

		@IFindBy(how = How.CSS, using = "input[name='NewCatastrophe-CatastropheDetailScreen-AdminCatastropheDV-CatastropheAdmin_ID']", AI = false)
		public WebElement inpCATNo;

		@IFindBy(how = How.CSS, using = "#NewCatastrophe-CatastropheDetailScreen-AdminCatastropheDV-CatastropheClaimsHistoryLV_tb-Add>div[role='button']", AI = false)
		public WebElement btnAdd_15;

		@IFindBy(how = How.CSS, using = "#NewCatastrophe-CatastropheDetailScreen-AdminCatastrophePolicyPanelSet-PolicyRetrievalCompletionTime_dateIcon", AI = false)
		public WebElement btnLastRetrievalCompletedatDateIcon;

		@IFindBy(how = How.CSS, using = "input[name='NewCatastrophe-CatastropheDetailScreen-AdminCatastropheDV-LocalizedValuesLV-2-column2']", AI = false)
		public WebElement inpDependentonRender_14;

		@IFindBy(how = How.CSS, using = "select[name='NewCatastrophe-CatastropheDetailScreen-AdminCatastrophePolicyPanelSet-CatastropheHeatMapFilterPanelSet-ClaimStatus']", AI = false)
		public WebElement drpClaimStatus;

		@IFindBy(how = How.CSS, using = "#NewCatastrophe-CatastropheDetailScreen-AdminCatastropheDV-Zones textarea", AI = false)
		public WebElement inpAreasCovered;

		@IFindBy(how = How.CSS, using = "#NewCatastrophe-CatastropheDetailScreen-ttlBar", AI = false)
		public WebElement lblTtlBar;

		@IFindBy(how = How.CSS, using = "#NewCatastrophe-CatastropheDetailScreen-Edit>div[role='button']", AI = false)
		public WebElement btnEdit;

		@IFindBy(how = How.CSS, using = "select[name='NewCatastrophe-CatastropheDetailScreen-AdminCatastrophePolicyPanelSet-CatastropheHeatMapFilterPanelSet-PolicyLocationFilter']", AI = false)
		public WebElement drpPolicyLocations;

		@IFindBy(how = How.CSS, using = "div[id$='Update']", AI = false)
		public WebElement btnUpdate;

		@IFindBy(how = How.CSS, using = "#NewCatastrophe-CatastropheDetailScreen-PolicyTab", AI = false)
		public WebElement btnPolicyLocations;

		@IFindBy(how = How.CSS, using = "input[name='NewCatastrophe-CatastropheDetailScreen-AdminCatastrophePolicyPanelSet-howToSelect']", AI = false)
		public WebElement inpHowToSelect;

		@IFindBy(how = How.CSS, using = "input[name='NewCatastrophe-CatastropheDetailScreen-AdminCatastrophePolicyPanelSet-PolicyEffectiveDate']", AI = false)
		public WebElement inpPolicyEffectiveDate;

		@IFindBy(how = How.CSS, using = "input[name$='CatastropheValidTo']", AI = false)
		public WebElement inpEndDate;

		@IFindBy(how = How.CSS, using = "#NewCatastrophe-CatastropheDetailScreen-AdminCatastrophePolicyPanelSet-CatastropheHeatMapFilterPanelSet-AssignedToGroup-GroupSearchMenuIcon>div[role='menuitem']", AI = false)
		public WebElement btnSearchforGroup;

		@IFindBy(how = How.CSS, using = "#NewCatastrophe-CatastropheDetailScreen-AdminCatastropheDV-CatastropheClaimsHistoryLV_tb-Remove>div[role='button']", AI = false)
		public WebElement btnRemove_16;

		@IFindBy(how = How.CSS, using = "input[name='NewCatastrophe-CatastropheDetailScreen-AdminCatastropheDV-CatastrophePCSNo']", AI = false)
		public WebElement inpPCSSerialNo;

		@IFindBy(how = How.CSS, using = "#NewCatastrophe-CatastropheDetailScreen-AdminCatastropheDV-CatastropheZonesInputSet-CatastropheZonesLV_tb-Remove>div[role='button']", AI = false)
		public WebElement btnRemove;

		@IFindBy(how = How.CSS, using = "select[name='NewCatastrophe-CatastropheDetailScreen-AdminCatastrophePolicyPanelSet-CatastropheHeatMapFilterPanelSet-ImageToDisplay']", AI = false)
		public WebElement drpMapView;

		@IFindBy(how = How.CSS, using = "input[name='NewCatastrophe-CatastropheDetailScreen-AdminCatastropheDV-LocalizedValuesLV-2-column1']", AI = false)
		public WebElement inpDescription_13;

		@IFindBy(how = How.CSS, using = "select[name='NewCatastrophe-CatastropheDetailScreen-AdminCatastropheDV-CatastropheZonesInputSet-ZoneInput']", AI = false)
		public WebElement drpCatastropheZones;

		@IFindBy(how = How.CSS, using = "input[name$='Name']", AI = false)
		public WebElement inpName;

		@IFindBy(how = How.CSS, using = "#NewCatastrophe-CatastropheDetailScreen-AdminCatastropheDV-LocalizedValuesLV_tb-Add>div[role='button']", AI = false)
		public WebElement btnAdd_3;

		@IFindBy(how = How.CSS, using = "#NewCatastrophe-CatastropheDetailScreen-AdminCatastropheDV-CatastropheValidFrom_dateIcon", AI = false)
		public WebElement btnBeginDateDateIcon;

		@IFindBy(how = How.CSS, using = "select[name='NewCatastrophe-CatastropheDetailScreen-AdminCatastropheDV-Country']", AI = false)
		public WebElement drpCountry;

		@IFindBy(how = How.CSS, using = "#NewCatastrophe-CatastropheDetailScreen-AdminCatastropheDV-CatastrophePerilsLV_tb-Add>div[role='button']", AI = false)
		public WebElement btnAdd_1;

		@IFindBy(how = How.CSS, using = "select[name='NewCatastrophe-CatastropheDetailScreen-AdminCatastropheDV-CatastropheZonesInputSet-state']", AI = false)
		public WebElement drpState;

		@IFindBy(how = How.CSS, using = "#NewCatastrophe-CatastropheDetailScreen-AdminCatastrophePolicyPanelSet-CatastropheHeatMapFilterPanelSet-AssignedToGroup-AssignedToGroupMenuIcon>div[role='button']", AI = false)
		public WebElement btnAssignedToGroupMenuIcon;

		@IFindBy(how = How.CSS, using = "#NewCatastrophe-CatastropheDetailScreen-AdminCatastrophePolicyPanelSet-CatastropheHeatMapFilterPanelSet-AssignedToGroup-GroupPickerMenuIcon>div[role='menuitem']", AI = false)
		public WebElement btnSelectGroup;

		@IFindBy(how = How.CSS, using = "div[id$='Cancel']", AI = false)
		public WebElement btnCancel;

		@IFindBy(how = How.CSS, using = "#NewCatastrophe-CatastropheDetailScreen-AdminCatastropheDV_tb-ShowCatMapButton>div[role='button']", AI = false)
		public WebElement btnShowMap;

		@IFindBy(how = How.CSS, using = "#NewCatastrophe-CatastropheDetailScreen-AdminCatastropheDV-CatastropheZonesInputSet-CatastropheZonesLV_tb-Add>div[role='button']", AI = false)
		public WebElement btnAdd;

		@IFindBy(how = How.CSS, using = "input[name='NewCatastrophe-CatastropheDetailScreen-AdminCatastropheDV-CatastropheValidFrom']", AI = false)
		public WebElement inpBeginDate;

		@IFindBy(how = How.CSS, using = "#NewCatastrophe-CatastropheDetailScreen-AdminCatastropheDV-CatastropheValidTo_dateIcon", AI = false)
		public WebElement btnEndDateDateIcon;

		@IFindBy(how = How.CSS, using = "input[name='NewCatastrophe-CatastropheDetailScreen-AdminCatastropheDV-LocalizedValuesLV-0-column2']", AI = false)
		public WebElement inpDependentonRender;

		@IFindBy(how = How.CSS, using = "input[name='NewCatastrophe-CatastropheDetailScreen-AdminCatastrophePolicyPanelSet-PolicyRetrievalCompletionTime']", AI = false)
		public WebElement inpLastRetrievalCompletedat;

		@IFindBy(how = How.CSS, using = "input[name='NewCatastrophe-CatastropheDetailScreen-AdminCatastropheDV-LocalizedValuesLV-0-column0']", AI = false)
		public WebElement inpName_5;

		@IFindBy(how = How.CSS, using = "input[name='NewCatastrophe-CatastropheDetailScreen-AdminCatastropheDV-LocalizedValuesLV-1-column0']", AI = false)
		public WebElement inpName_8;

		@IFindBy(how = How.CSS, using = "input[name$='LocalizedValuesLV-0-column1']", AI = false)
		public WebElement inpDescriptionEdgePolicyholderEnglish;

		@IFindBy(how = How.CSS, using = "input[name$='LocalizedValuesLV-2-column1']", AI = false)
		public WebElement inpDescriptionEdgeEnglish;

		@IFindBy(how = How.CSS, using = "input[name$='LV-0-column0']", AI = false)
		public WebElement inpNameEdgePolicyholderEnglish;

		@IFindBy(how = How.CSS, using = "input[name$='LV-2-column0']", AI = false)
		public WebElement inpNameEdgeEnglish;


		public NewCatastrophePage(){
		}

		public NewCatastrophePage(WebDriver driver) throws Exception{
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
			}if (isPageLoaded && !(Utils.waitForElement(driver, inpName_8))) {
				Log.fail("Page did not open up. Site might be down.", driver);
			}elementLayer = new ElementLayer(driver);
		}public NewCatastrophePage enterStatus(WebDriver driver,String Status) {
			BrowserActions.type(driver, inpStatus,Status, "Status");
			return this;
		}
		public NewCatastrophePage selectAssignedToGroup(WebDriver driver,String AssignedToGroup)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpAssignedToGroup,AssignedToGroup,"AssignedToGroup");
			return this;
		}
		public NewCatastrophePage enterName_12(WebDriver driver,String Name_12) {
			BrowserActions.type(driver, inpName_12,Name_12, "Name_12");
			return this;
		}
		public NewCatastrophePage enterDescription(WebDriver driver,String Description) {
			BrowserActions.type(driver, inpDescription,Description,true, "Description");
			return this;
		}
		public NewCatastrophePage clickPolicyEffectiveDateDateIcon(WebDriver driver)  {
			BrowserActions.click(driver, btnPolicyEffectiveDateDateIcon,"PolicyEffectiveDateDateIcon");
			return this;
		}
		public NewCatastrophePage clickSetCatastropheZone(WebDriver driver)  {
			BrowserActions.click(driver, btnSetCatastropheZone,"SetCatastropheZone");
			return this;
		}
		public NewCatastrophePage enterLanguage(WebDriver driver,String Language) {
			BrowserActions.type(driver, inpLanguage,Language, "Language");
			return this;
		}
		public NewCatastrophePage enterLastRetrievalCompletedat_17(WebDriver driver,String LastRetrievalCompletedat_17) {
			BrowserActions.type(driver, inpLastRetrievalCompletedat_17,LastRetrievalCompletedat_17, "LastRetrievalCompletedat_17");
			return this;
		}
		public NewCatastrophePage selectZoneType(WebDriver driver,String ZoneType)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpZoneType,ZoneType,"ZoneType");
			return this;
		}
		public NewCatastrophePage enterDescription_9(WebDriver driver,String Description_9) {
			BrowserActions.type(driver, inpDescription_9,Description_9, "Description_9");
			return this;
		}
		public NewCatastrophePage enterLanguage_11(WebDriver driver,String Language_11) {
			BrowserActions.type(driver, inpLanguage_11,Language_11, "Language_11");
			return this;
		}
		public NewCatastrophePage selectReportedDate(WebDriver driver,String ReportedDate)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpReportedDate,ReportedDate,"ReportedDate");
			return this;
		}
		public NewCatastrophePage enterDescription_6(WebDriver driver,String Description_6) {
			BrowserActions.type(driver, inpDescription_6,Description_6, "Description_6");
			return this;
		}
		public NewCatastrophePage clickRemove_4(WebDriver driver)  {
			BrowserActions.click(driver, btnRemove_4,"Remove_4");
			return this;
		}
		public NewCatastrophePage selectCatastrophe(WebDriver driver,String Catastrophe)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpCatastrophe,Catastrophe,"Catastrophe");
			return this;
		}
		public NewCatastrophePage clickFindUnmatchedClaims(WebDriver driver)  {
			BrowserActions.click(driver, btnFindUnmatchedClaims,"FindUnmatchedClaims");
			return this;
		}
		public NewCatastrophePage enterDependentonRender_10(WebDriver driver,String DependentonRender_10) {
			BrowserActions.type(driver, inpDependentonRender_10,DependentonRender_10, "DependentonRender_10");
			return this;
		}
		public NewCatastrophePage clickDetails(WebDriver driver)  {
			BrowserActions.click(driver, btnDetails,"Details");
			return this;
		}
		public NewCatastrophePage selectType(WebDriver driver,String Type)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpType,Type,"Type");
			return this;
		}
		public NewCatastrophePage enterLanguage_7(WebDriver driver,String Language_7) {
			BrowserActions.type(driver, inpLanguage_7,Language_7, "Language_7");
			return this;
		}
		public NewCatastrophePage clickRemove_2(WebDriver driver)  {
			BrowserActions.click(driver, btnRemove_2,"Remove_2");
			return this;
		}
		public NewCatastrophePage enterCATNo(WebDriver driver,String CATNo) {
			BrowserActions.type(driver, inpCATNo,CATNo,true,"CATNo");
			return this;
		}
		public NewCatastrophePage clickAdd_15(WebDriver driver)  {
			BrowserActions.click(driver, btnAdd_15,"Add_15");
			return this;
		}
		public NewCatastrophePage clickLastRetrievalCompletedatDateIcon(WebDriver driver)  {
			BrowserActions.click(driver, btnLastRetrievalCompletedatDateIcon,"LastRetrievalCompletedatDateIcon");
			return this;
		}
		public NewCatastrophePage enterDependentonRender_14(WebDriver driver,String DependentonRender_14) {
			BrowserActions.type(driver, inpDependentonRender_14,DependentonRender_14, "DependentonRender_14");
			return this;
		}
		public NewCatastrophePage selectClaimStatus(WebDriver driver,String ClaimStatus)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpClaimStatus,ClaimStatus,"ClaimStatus");
			return this;
		}
		public NewCatastrophePage enterAreasCovered(WebDriver driver,String AreasCovered) {
			BrowserActions.type(driver, inpAreasCovered,AreasCovered, "AreasCovered");
			return this;
		}
		public NewCatastrophePage clickEdit(WebDriver driver)  {
			BrowserActions.click(driver, btnEdit,"Edit");
			return this;
		}
		public NewCatastrophePage selectPolicyLocations(WebDriver driver,String PolicyLocations)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpPolicyLocations,PolicyLocations,"PolicyLocations");
			return this;
		}
		public NewCatastrophePage clickUpdate(WebDriver driver)  {
			BrowserActions.click(driver, btnUpdate,"Update");
			return this;
		}
		public NewCatastrophePage clickPolicyLocations(WebDriver driver)  {
			BrowserActions.click(driver, btnPolicyLocations,"PolicyLocations");
			return this;
		}
		public NewCatastrophePage enterHowToSelect(WebDriver driver,String HowToSelect) {
			BrowserActions.type(driver, inpHowToSelect,HowToSelect, "HowToSelect");
			return this;
		}
		public NewCatastrophePage enterPolicyEffectiveDate(WebDriver driver,String PolicyEffectiveDate) {
			BrowserActions.type(driver, inpPolicyEffectiveDate,PolicyEffectiveDate, "PolicyEffectiveDate");
			return this;
		}
		public NewCatastrophePage enterEndDate(WebDriver driver,String EndDate) {
			BrowserActions.type(driver, inpEndDate,EndDate,2, "EndDate");
			return this;
		}
		public NewCatastrophePage clickSearchforGroup(WebDriver driver)  {
			BrowserActions.click(driver, btnSearchforGroup,"SearchforGroup");
			return this;
		}
		public NewCatastrophePage clickRemove_16(WebDriver driver)  {
			BrowserActions.click(driver, btnRemove_16,"Remove_16");
			return this;
		}
		public NewCatastrophePage enterPCSSerialNo(WebDriver driver,String PCSSerialNo) {
			BrowserActions.type(driver, inpPCSSerialNo,PCSSerialNo, "PCSSerialNo");
			return this;
		}
		public NewCatastrophePage clickRemove(WebDriver driver)  {
			BrowserActions.click(driver, btnRemove,"Remove");
			return this;
		}
		public NewCatastrophePage selectMapView(WebDriver driver,String MapView)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpMapView,MapView,"MapView");
			return this;
		}
		public NewCatastrophePage enterDescription_13(WebDriver driver,String Description_13) {
			BrowserActions.type(driver, inpDescription_13,Description_13, "Description_13");
			return this;
		}
		public NewCatastrophePage selectCatastropheZones(WebDriver driver,String CatastropheZones)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpCatastropheZones,CatastropheZones,"CatastropheZones");
			return this;
		}
		public NewCatastrophePage enterName(WebDriver driver,String Name) {
			BrowserActions.type(driver, inpName,Name, 1,"Name");
			return this;
		}
		public NewCatastrophePage clickAdd_3(WebDriver driver)  {
			BrowserActions.click(driver, btnAdd_3,"Add_3");
			return this;
		}
		public NewCatastrophePage clickBeginDateDateIcon(WebDriver driver)  {
			BrowserActions.click(driver, btnBeginDateDateIcon,"BeginDateDateIcon");
			return this;
		}
		public NewCatastrophePage selectCountry(WebDriver driver,String Country)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpCountry,Country,"Country");
			return this;
		}
		public NewCatastrophePage clickAdd_1(WebDriver driver)  {
			BrowserActions.click(driver, btnAdd_1,"Add_1");
			return this;
		}
		public NewCatastrophePage selectState(WebDriver driver,String State)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpState,State,"State");
			return this;
		}
		public NewCatastrophePage clickAssignedToGroupMenuIcon(WebDriver driver)  {
			BrowserActions.click(driver, btnAssignedToGroupMenuIcon,"AssignedToGroupMenuIcon");
			return this;
		}
		public NewCatastrophePage clickSelectGroup(WebDriver driver)  {
			BrowserActions.click(driver, btnSelectGroup,"SelectGroup");
			return this;
		}
		public NewCatastrophePage clickCancel(WebDriver driver)  {
			BrowserActions.click(driver, btnCancel,"Cancel");
			return this;
		}
		public NewCatastrophePage clickShowMap(WebDriver driver)  {
			BrowserActions.click(driver, btnShowMap,"ShowMap");
			return this;
		}
		public NewCatastrophePage clickAdd(WebDriver driver)  {
			BrowserActions.click(driver, btnAdd,"Add");
			return this;
		}
		public NewCatastrophePage enterBeginDate(WebDriver driver,String BeginDate) {
			BrowserActions.type(driver, inpBeginDate,BeginDate, 2,"BeginDate");
			return this;
		}
		public NewCatastrophePage clickEndDateDateIcon(WebDriver driver)  {
			BrowserActions.click(driver, btnEndDateDateIcon,"EndDateDateIcon");
			return this;
		}
		public NewCatastrophePage enterDependentonRender(WebDriver driver,String DependentonRender) {
			BrowserActions.type(driver, inpDependentonRender,DependentonRender, "DependentonRender");
			return this;
		}
		public NewCatastrophePage enterLastRetrievalCompletedat(WebDriver driver,String LastRetrievalCompletedat) {
			BrowserActions.type(driver, inpLastRetrievalCompletedat,LastRetrievalCompletedat, "LastRetrievalCompletedat");
			return this;
		}
		public NewCatastrophePage enterName_5(WebDriver driver,String Name_5) {
			BrowserActions.type(driver, inpName_5,Name_5, "Name_5");
			return this;
		}
		public NewCatastrophePage enterName_8(WebDriver driver,String Name_8) {
			BrowserActions.type(driver, inpName_8,Name_8, "Name_8");
			return this;
		}

		public NewCatastrophePage enterDescriptionEdgePolicyholderEnglish(WebDriver driver,String localization) {
			BrowserActions.type(driver, inpDescriptionEdgePolicyholderEnglish,localization, "Edge Policyholder English");
			return this;
		}
		public NewCatastrophePage enterDescriptionEdgeEnglish(WebDriver driver,String localization) {
			BrowserActions.type(driver, inpDescriptionEdgeEnglish,localization, "Edge English");
			return this;
		}
		public NewCatastrophePage enterNameEdgePolicyholderEnglish(WebDriver driver,String localization) {
			BrowserActions.type(driver, inpNameEdgePolicyholderEnglish,localization,1, "Name Edge Policyholder English");
			return this;
		}
		public NewCatastrophePage enterNameEdgeEnglish(WebDriver driver,String localization) {
			BrowserActions.type(driver, inpNameEdgeEnglish,localization, 1,"Name Edge English");
			return this;
		}

		public void verifyCatastrophesNameIsUpdated(WebDriver driver,String oldName) {
			BrowserActions.waitForElementToDisplay(driver, inpName);
			String updatedName = inpName.getAttribute("value");
			if (!updatedName.equals(oldName)) {
				Log.message("Catastrophes name is updated");
			}
			else{
				Log.message("Catastrophes name not updated");
			}
		}

	}

}
