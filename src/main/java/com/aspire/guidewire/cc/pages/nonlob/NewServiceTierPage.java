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

public class NewServiceTierPage extends LoadableComponent<NewServiceTierPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	@IFindBy(how = How.CSS, using = "#NewCustomerServiceTier-CustomerServiceTierDetailScreen-CustomerServiceTiersTabsCV-SpecialHandlingAutomatedActivitiesLV_tb-AutomatedActivitiesAdd-0-AutomatedActivitiesAddClaimIndicatorHandler>div[role='menuitem']", AI = false)
	public WebElement btnAutomatedActivitiesAddClaimIndicatorHandler;

	@IFindBy(how = How.CSS, using = "#NewCustomerServiceTier-CustomerServiceTierDetailScreen-CustomerServiceTiersTabsCV-AutomatedActivitiesTitle", AI = false)
	public WebElement lblAutomatedActivitiesTitle;

	@IFindBy(how = How.CSS, using = "div[id$='CustomerServiceTierScreen-ttlBar']", AI = false)
	public WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "#NewCustomerServiceTier-CustomerServiceTierDetailScreen-CustomerServiceTiersTabsCV-Edit>div[role='button']", AI = false)
	public WebElement btnEdit;

	@IFindBy(how = How.CSS, using = "#NewCustomerServiceTier-CustomerServiceTierDetailScreen-CustomerServiceTiersTabsCV-OtherInstructionsPanelSet_tb-ToolbarButtonaddOtherInstruction>div[role='button']", AI = false)
	public WebElement btnAdd_5;

	@IFindBy(how = How.CSS, using = "#NewCustomerServiceTier-CustomerServiceTierDetailScreen-CustomerServiceTiersTabsCV-SpecialHandlingAutomatedActivitiesLV_tb-AutomatedActivitiesAdd>div[role='button']", AI = false)
	public WebElement btnAdd_3;

	@IFindBy(how = How.CSS, using = "#NewCustomerServiceTier-CustomerServiceTierDetailScreen-CustomerServiceTiersTabsCV-Update>div[role='button']", AI = false)
	public WebElement btnUpdate;

	@IFindBy(how = How.CSS, using = "#NewCustomerServiceTier-CustomerServiceTierDetailScreen-CustomerServiceTiersTabsCV-CustomerServiceTierSpecialHandlingCardTab", AI = false)
	public WebElement btnSpecialHandling;

	@IFindBy(how = How.CSS, using = "select[name='NewCustomerServiceTier-CustomerServiceTierDetailScreen-CustomerServiceTiersTabsCV-Code']", AI = false)
	public WebElement drpName;

	@IFindBy(how = How.CSS, using = "#NewCustomerServiceTier-CustomerServiceTierDetailScreen-CustomerServiceTiersTabsCV-SpecialHandlingAutomatedActivitiesLV_tb-AutomatedActivitiesDelete>div[role='button']", AI = false)
	public WebElement btnDelete_2;

	@IFindBy(how = How.CSS, using = "input[name='NewCustomerServiceTier-CustomerServiceTierDetailScreen-CustomerServiceTiersTabsCV-Description']", AI = false)
	public WebElement inpDescription;

	@IFindBy(how = How.CSS, using = "#NewCustomerServiceTier-CustomerServiceTierDetailScreen-CustomerServiceTiersTabsCV-Cancel>div[role='button']", AI = false)
	public WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "div[id$='DeleteServiceTierButton']", AI = false)
	public WebElement btnDelete;

	@IFindBy(how = How.CSS, using = "#NewCustomerServiceTier-CustomerServiceTierDetailScreen-CustomerServiceTiersTabsCV-CustomerServiceTierAutomatedNotificationsLVPanelRef-SpecialHandlingAutomatedNotificationsLV_tb-AutomatedNotificationsAdd>div[role='button']", AI = false)
	public WebElement btnAdd;

	@IFindBy(how = How.CSS, using = "#NewCustomerServiceTier-CustomerServiceTierDetailScreen-CustomerServiceTiersTabsCV-SpecialHandlingAutomatedActivitiesLV_tb-AutomatedActivitiesAdd-1-AutomatedActivitiesAddClaimIndicatorHandler>div[role='menuitem']", AI = false)
	public WebElement btnAutomatedActivitiesAddClaimIndicatorHandler_4;

	@IFindBy(how = How.CSS, using = "#NewCustomerServiceTier-CustomerServiceTierDetailScreen-CustomerServiceTiersTabsCV-CustomerServiceTierAutomatedNotificationsLVPanelRef-SpecialHandlingAutomatedNotificationsLV_tb-AutomatedNotificationsAdd-1-AutomatedNotificationsAddClaimIndicatorHandler>div[role='menuitem']", AI = false)
	public WebElement btnAutomatedNotificationsAddClaimIndicatorHandler_1;

	@IFindBy(how = How.CSS, using = "#NewCustomerServiceTier-CustomerServiceTierDetailScreen-CustomerServiceTiersTabsCV-CustomerServiceTierDetailCardTab", AI = false)
	public WebElement btnDetail;

	@IFindBy(how = How.CSS, using = "#NewCustomerServiceTier-CustomerServiceTierDetailScreen-CustomerServiceTiersTabsCV-CustomerServiceTierAutomatedNotificationsLVPanelRef-SpecialHandlingAutomatedNotificationsLV_tb-AutomatedNotificationsAdd-0-AutomatedNotificationsAddClaimIndicatorHandler>div[role='menuitem']", AI = false)
	public WebElement btnAutomatedNotificationsAddClaimIndicatorHandler;

	@IFindBy(how = How.CSS, using = "#NewCustomerServiceTier-CustomerServiceTierDetailScreen-CustomerServiceTiersTabsCV-OtherInstructionsTitle", AI = false)
	public WebElement lblOtherInstructionsTitle;

	@IFindBy(how = How.CSS, using = "#NewCustomerServiceTier-CustomerServiceTierDetailScreen-CustomerServiceTiersTabsCV-CustomerServiceTierAutomatedNotificationsLVPanelRef-AutomatedNotificationsTitle", AI = false)
	public WebElement lblAutomatedNotificationsTitle;

	@IFindBy(how = How.CSS, using = "div[id$='AddServiceTierButton']", AI = false)
	public WebElement btnAddServiceTiers;

	@IFindBy(how = How.CSS, using = "div[id$='CustomerServiceTierDetailCardTab']", AI = false)
	public WebElement btnDetailsTab;

	@IFindBy(how = How.CSS, using = "div[id$='Update']", AI = false)
	public WebElement btnOk;

	public NewServiceTierPage(){
	}

	public NewServiceTierPage(WebDriver driver) throws Exception{
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
		}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, lblAutomatedNotificationsTitle))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);
	}public NewServiceTierPage clickAutomatedActivitiesAddClaimIndicatorHandler(WebDriver driver)  {
		BrowserActions.click(driver, btnAutomatedActivitiesAddClaimIndicatorHandler,"AutomatedActivitiesAddClaimIndicatorHandler");
		return this;
	}
	public NewServiceTierPage clickEdit(WebDriver driver)  {
		BrowserActions.click(driver, btnEdit,"Edit");
		return this;
	}
	public NewServiceTierPage clickAdd_5(WebDriver driver)  {
		BrowserActions.click(driver, btnAdd_5,"Add_5");
		return this;
	}
	public NewServiceTierPage clickAdd_3(WebDriver driver)  {
		BrowserActions.click(driver, btnAdd_3,"Add_3");
		return this;
	}
	public NewServiceTierPage clickUpdate(WebDriver driver)  {
		BrowserActions.click(driver, btnUpdate,"Update");
		return this;
	}
	public NewServiceTierPage clickSpecialHandling(WebDriver driver)  {
		BrowserActions.click(driver, btnSpecialHandling,"SpecialHandling");
		return this;
	}
	public NewServiceTierPage selectName(WebDriver driver,String Name)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpName,Name,"Name");
		return this;
	}
	public NewServiceTierPage clickDelete_2(WebDriver driver)  {
		BrowserActions.click(driver, btnDelete_2,"Delete_2");
		return this;
	}
	public NewServiceTierPage enterDescription(WebDriver driver,String Description) {
		BrowserActions.type(driver, inpDescription,Description, "Description");
		return this;
	}
	public NewServiceTierPage clickCancel(WebDriver driver)  {
		BrowserActions.click(driver, btnCancel,"Cancel");
		return this;
	}
	public NewServiceTierPage clickDelete(WebDriver driver)  {
		BrowserActions.click(driver, btnDelete,"Delete");
		BrowserActions.confirmAlert(driver, "Are you sure you would like to delete the selected service tiers? ");
		return this;
	}
	public NewServiceTierPage clickAdd(WebDriver driver)  {
		BrowserActions.click(driver, btnAdd,"Add");
		return this;
	}
	public NewServiceTierPage clickAutomatedActivitiesAddClaimIndicatorHandler_4(WebDriver driver)  {
		BrowserActions.click(driver, btnAutomatedActivitiesAddClaimIndicatorHandler_4,"AutomatedActivitiesAddClaimIndicatorHandler_4");
		return this;
	}
	public NewServiceTierPage clickAutomatedNotificationsAddClaimIndicatorHandler_1(WebDriver driver)  {
		BrowserActions.click(driver, btnAutomatedNotificationsAddClaimIndicatorHandler_1,"AutomatedNotificationsAddClaimIndicatorHandler_1");
		return this;
	}
	public NewServiceTierPage clickDetail(WebDriver driver)  {
		BrowserActions.click(driver, btnDetail,"Detail");
		return this;
	}
	public NewServiceTierPage clickAutomatedNotificationsAddClaimIndicatorHandler(WebDriver driver)  {
		BrowserActions.click(driver, btnAutomatedNotificationsAddClaimIndicatorHandler,"AutomatedNotificationsAddClaimIndicatorHandler");
		return this;
	}

	public NewServiceTierPage clickAddServiceTiers(WebDriver driver) {
		BrowserActions.click(driver, btnAddServiceTiers, "Add Service Tiers"); 
		return this;
	}
	public void clickDetailsTab(WebDriver driver)
	{
		BrowserActions.click(driver, btnDetailsTab, "Details Tab");
	}

	public NewServiceTierPage clickOk(WebDriver driver) {
		BrowserActions.click(driver, btnOk, "Ok Button");
		return this;
	}

	public NewServiceTierPage clickNameCheckBox(WebDriver driver,String name) {
		BrowserActions.waitForElementToDisplay(driver,lblTtlBar);
		By nameCheckBoxBy = By.xpath("//div[text()='"+name+"']//ancestor::td//preceding-sibling::td//descendant::div[contains(@id,'_Checkbox')]");
		BrowserActions.waitForElementToDisplay(driver, nameCheckBoxBy, "name check");
		WebElement nameCheckBox = nameCheckBoxBy.findElement(driver);
		BrowserActions.click(driver, nameCheckBox,"Name check box");
		return this;
	}

	public void verifyclickAddedUserNameIsNotDisplayed(WebDriver driver,String username)  {
		boolean flag = false;
		BrowserActions.waitForNetworkIdleState(driver);
		By userName = By.xpath("//div[text()='"+username+"']");
		int size = BrowserActions.getWebElementSize(driver, userName, username, 0.5);
		if(size == 0) {
			flag = true;
		}
		Log.softAssertThat(flag, "Account("+username+") is not deleted", "User("+username+") present in list is deleted");
	}

	
}
