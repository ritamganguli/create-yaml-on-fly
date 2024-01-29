package com.aspire.guidewire.cc.pages.nonlob;
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
import com.aspire.guidewire.utils.Utils;
import com.aspire.guidewire.utils.WaitUtils;

import ASPIREAI.customfactories.AjaxElementLocatorFactory;
import ASPIREAI.customfactories.IFindBy;
import ASPIREAI.customfactories.PageFactory;

public class NewAutomatedActivityPage extends LoadableComponent<NewAutomatedActivityPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
	@IFindBy(how = How.CSS, using = "#NewAccount-AccountDetailScreen-AccountTabsCV-AccountAutomatedActivitiesLVPanelRef-SpecialHandlingAutomatedActivitiesLV_tb-AutomatedActivitiesAdd-0-AutomatedActivitiesAddClaimIndicatorHandler>div[role='menuitem']", AI = false)
	public WebElement btnAutomatedActivitiesAddClaimIndicatorHandler;

	@IFindBy(how = How.CSS, using = "#NewAccount-AccountDetailScreen-AccountTabsCV-AccountAutomatedActivitiesLVPanelRef-AutomatedActivitiesTitle", AI = false)
	public WebElement lblAutomatedActivitiesTitle;

	@IFindBy(how = How.CSS, using = "#NewAccount-AccountDetailScreen-AccountTabsCV-AccountDV-AccountHolder-MenuItem_Search>div[role='menuitem']", AI = false)
	public WebElement btnSearch;

	@IFindBy(how = How.CSS, using = "#NewAccount-AccountDetailScreen-AccountTabsCV-AccountDetailTabTab", AI = false)
	public WebElement btnDetail;

	@IFindBy(how = How.CSS, using = "#NewAccount-AccountDetailScreen-AccountTabsCV-AccountAutomatedNotificationsLVPanelRef-AutomatedNotificationsTitle", AI = false)
	public WebElement lblAutomatedNotificationsTitle;

	@IFindBy(how = How.CSS, using = "#NewAccount-AccountDetailScreen-ttlBar", AI = false)
	public WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "#NewAccount-AccountDetailScreen-AccountTabsCV-AccountDV_tb-Edit>div[role='button']", AI = false)
	public WebElement btnEdit;

	@IFindBy(how = How.CSS, using = "#NewAccount-AccountDetailScreen-AccountTabsCV-AccountDV_tb-Update>div[role='button']", AI = false)
	public WebElement btnUpdate;

	@IFindBy(how = How.CSS, using = "#NewAccount-AccountDetailScreen-AccountTabsCV-AccountHandlingTabTab", AI = false)
	public WebElement btnSpecialHandling;

	@IFindBy(how = How.CSS, using = "#NewAccount-AccountDetailScreen-AccountTabsCV-AccountDV-AccountHolder-AccountHolderMenuIcon>div[role='button']", AI = false)
	public WebElement btnAccountHolderMenuIcon;

	@IFindBy(how = How.CSS, using = "#NewAccount-AccountDetailScreen-AccountTabsCV-AccountAutomatedNotificationsLVPanelRef-SpecialHandlingAutomatedNotificationsLV_tb-AutomatedNotificationsDelete>div[role='button']", AI = false)
	public WebElement btnDelete;

	@IFindBy(how = How.CSS, using = "input[name='NewAccount-AccountDetailScreen-AccountTabsCV-AccountDV-AccountNumber']", AI = false)
	public WebElement inpAccountNumber;

	@IFindBy(how = How.CSS, using = "#NewAccount-AccountDetailScreen-AccountTabsCV-AccountAutomatedNotificationsLVPanelRef-SpecialHandlingAutomatedNotificationsLV_tb-AutomatedNotificationsAdd-1-AutomatedNotificationsAddClaimIndicatorHandler>div[role='menuitem']", AI = false)
	public WebElement btnAutomatedNotificationsAddClaimIndicatorHandler_1;

	@IFindBy(how = How.CSS, using = "#NewAccount-AccountDetailScreen-AccountTabsCV-OtherInstructionsTitle", AI = false)
	public WebElement lblOtherInstructionsTitle;

	@IFindBy(how = How.CSS, using = "#NewAccount-AccountDetailScreen-AccountTabsCV-OtherInstructionsPanelSet_tb-ToolbarButtonaddOtherInstruction>div[role='button']", AI = false)
	public WebElement btnAdd_5;

	@IFindBy(how = How.CSS, using = "#NewAccount-AccountDetailScreen-AccountTabsCV-AccountDV-AccountHolder-MenuItem_NoneSelected>div[role='menuitem']", AI = false)
	public WebElement btnNoneselected;

	@IFindBy(how = How.CSS, using = "#NewAccount-AccountDetailScreen-AccountTabsCV-AccountAutomatedActivitiesLVPanelRef-SpecialHandlingAutomatedActivitiesLV_tb-AutomatedActivitiesAdd>div[role='button']", AI = false)
	public WebElement btnAdd_3;

	@IFindBy(how = How.CSS, using = "#NewAccount-AccountDetailScreen-AccountTabsCV-AccountAutomatedActivitiesLVPanelRef-SpecialHandlingAutomatedActivitiesLV_tb-AutomatedActivitiesDelete>div[role='button']", AI = false)
	public WebElement btnDelete_2;

	@IFindBy(how = How.CSS, using = "#NewAccount-AccountDetailScreen-AccountTabsCV-AccountDV_tb-Cancel>div[role='button']", AI = false)
	public WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "#NewAccount-AccountDetailScreen-AccountTabsCV-AccountAutomatedNotificationsLVPanelRef-SpecialHandlingAutomatedNotificationsLV_tb-AutomatedNotificationsAdd>div[role='button']", AI = false)
	public WebElement btnAdd;

	@IFindBy(how = How.CSS, using = "#NewAccount-AccountDetailScreen-AccountTabsCV-AccountAutomatedActivitiesLVPanelRef-SpecialHandlingAutomatedActivitiesLV_tb-AutomatedActivitiesAdd-1-AutomatedActivitiesAddClaimIndicatorHandler>div[role='menuitem']", AI = false)
	public WebElement btnAutomatedActivitiesAddClaimIndicatorHandler_4;

	@IFindBy(how = How.CSS, using = "#NewAccount-AccountDetailScreen-AccountTabsCV-AccountAutomatedNotificationsLVPanelRef-SpecialHandlingAutomatedNotificationsLV_tb-AutomatedNotificationsAdd-0-AutomatedNotificationsAddClaimIndicatorHandler>div[role='menuitem']", AI = false)
	public WebElement btnAutomatedNotificationsAddClaimIndicatorHandler;

	@IFindBy(how = How.CSS, using = "input[name$='Amount']", AI = false)
	public WebElement inpThresholdAmount;

	@IFindBy(how = How.CSS, using = "select[name$='AutomatedHandlerActivityPattern']", AI = false)
	public WebElement drpActivityPattern;

	@IFindBy(how = How.CSS, using = "div[id$='Update']", AI = false)
	public WebElement btnOk;


	public NewAutomatedActivityPage(){
	}

	public NewAutomatedActivityPage(WebDriver driver) throws Exception{
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
		}if (isPageLoaded && !(Utils.waitForElement(driver, btnAutomatedNotificationsAddClaimIndicatorHandler))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);
	}public NewAutomatedActivityPage clickAutomatedActivitiesAddClaimIndicatorHandler(WebDriver driver)  {
		BrowserActions.click(driver, btnAutomatedActivitiesAddClaimIndicatorHandler,"AutomatedActivitiesAddClaimIndicatorHandler");
		return this;
	}
	public NewAutomatedActivityPage clickSearch(WebDriver driver)  {
		BrowserActions.click(driver, btnSearch,"Search");
		return this;
	}
	public NewAutomatedActivityPage clickDetail(WebDriver driver)  {
		BrowserActions.click(driver, btnDetail,"Detail");
		return this;
	}
	public NewAutomatedActivityPage clickEdit(WebDriver driver)  {
		BrowserActions.click(driver, btnEdit,"Edit");
		return this;
	}
	public NewAutomatedActivityPage clickUpdate(WebDriver driver)  {
		BrowserActions.click(driver, btnUpdate,"Update");
		return this;
	}
	public NewAutomatedActivityPage clickSpecialHandling(WebDriver driver)  {
		BrowserActions.click(driver, btnSpecialHandling,"SpecialHandling");
		return this;
	}
	public NewAutomatedActivityPage clickAccountHolderMenuIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnAccountHolderMenuIcon,"AccountHolderMenuIcon");
		return this;
	}
	public NewAutomatedActivityPage clickDelete(WebDriver driver)  {
		BrowserActions.click(driver, btnDelete,"Delete");
		return this;
	}
	public NewAutomatedActivityPage enterAccountNumber(WebDriver driver,String AccountNumber) {
		BrowserActions.type(driver, inpAccountNumber,AccountNumber, "AccountNumber");
		return this;
	}
	public NewAutomatedActivityPage clickAutomatedNotificationsAddClaimIndicatorHandler_1(WebDriver driver)  {
		BrowserActions.click(driver, btnAutomatedNotificationsAddClaimIndicatorHandler_1,"AutomatedNotificationsAddClaimIndicatorHandler_1");
		return this;
	}
	public NewAutomatedActivityPage clickAdd_5(WebDriver driver)  {
		BrowserActions.click(driver, btnAdd_5,"Add_5");
		return this;
	}
	public NewAutomatedActivityPage clickNoneselected(WebDriver driver)  {
		BrowserActions.click(driver, btnNoneselected,"Noneselected");
		return this;
	}
	public NewAutomatedActivityPage clickAdd_3(WebDriver driver)  {
		BrowserActions.click(driver, btnAdd_3,"Add_3");
		return this;
	}
	public NewAutomatedActivityPage clickDelete_2(WebDriver driver)  {
		BrowserActions.click(driver, btnDelete_2,"Delete_2");
		return this;
	}
	public NewAutomatedActivityPage clickCancel(WebDriver driver)  {
		BrowserActions.click(driver, btnCancel,"Cancel");
		return this;
	}
	public NewAutomatedActivityPage clickAdd(WebDriver driver)  {
		BrowserActions.click(driver, btnAdd,"Add");
		return this;
	}
	public NewAutomatedActivityPage clickAutomatedActivitiesAddClaimIndicatorHandler_4(WebDriver driver)  {
		BrowserActions.click(driver, btnAutomatedActivitiesAddClaimIndicatorHandler_4,"AutomatedActivitiesAddClaimIndicatorHandler_4");
		return this;
	}
	public NewAutomatedActivityPage clickAutomatedNotificationsAddClaimIndicatorHandler(WebDriver driver)  {
		BrowserActions.click(driver, btnAutomatedNotificationsAddClaimIndicatorHandler,"AutomatedNotificationsAddClaimIndicatorHandler");
		return this;
	}

	public NewAutomatedActivityPage enterThresholdAmount(WebDriver driver,String amount) {
		BrowserActions.type(driver, inpThresholdAmount,amount, "Threshold Amount");
		return this;
	}
	public NewAutomatedActivityPage selectActivityPattern(WebDriver driver,String activity) {
		BrowserActions.selectDropDownByVisibleText(driver, drpActivityPattern,activity, "Activity Pattern");
		return this;
	}
	public NewAutomatedActivityPage clickOk(WebDriver driver) {
		BrowserActions.click(driver, btnOk, "Ok Button");
		return this;
	}

}
