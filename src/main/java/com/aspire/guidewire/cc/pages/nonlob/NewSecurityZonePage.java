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

public class NewSecurityZonePage extends LoadableComponent<NewSecurityZonePage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();


	@IFindBy(how = How.CSS, using = "div[id$='SecurityZonesScreen-0']", AI = false)
	public WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "div[id$='Edit']", AI = false)
	public WebElement btnEdit;

	@IFindBy(how = How.CSS, using = "div[id$='Update']", AI = false)
	public WebElement btnUpdate;

	@IFindBy(how = How.CSS, using = "#NewSecurityZone-SecurityZoneDetailScreen-SecurityZoneDetailDV-Description textarea", AI = false)
	public WebElement inpDescription;

	@IFindBy(how = How.CSS, using = "div[id$='Delete']", AI = false)
	public WebElement btnDelete;

	@IFindBy(how = How.CSS, using = "#NewSecurityZone-SecurityZoneDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV_tb-Remove>div[role='button']", AI = false)
	public WebElement btnRemove;

	@IFindBy(how = How.CSS, using = "input[name='NewSecurityZone-SecurityZoneDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-0-Language']", AI = false)
	public WebElement inpLanguage;

	@IFindBy(how = How.CSS, using = "input[name='NewSecurityZone-SecurityZoneDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-1-column2']", AI = false)
	public WebElement inpDependentonRender_6;

	@IFindBy(how = How.CSS, using = "input[name='NewSecurityZone-SecurityZoneDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-1-column1']", AI = false)
	public WebElement inpDescription_5;

	@IFindBy(how = How.CSS, using = "input[name='NewSecurityZone-SecurityZoneDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-0-column1']", AI = false)
	public WebElement inpDescription_2;

	@IFindBy(how = How.CSS, using = "input[name$='Name']", AI = false)
	public WebElement inpName;

	@IFindBy(how = How.CSS, using = "input[name='NewSecurityZone-SecurityZoneDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-2-column1']", AI = false)
	public WebElement inpDescription_9;

	@IFindBy(how = How.CSS, using = "#NewSecurityZone-SecurityZoneDetailScreen-Cancel>div[role='button']", AI = false)
	public WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "input[name='NewSecurityZone-SecurityZoneDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-2-column2']", AI = false)
	public WebElement inpDependentonRender_10;

	@IFindBy(how = How.CSS, using = "#NewSecurityZone-SecurityZoneDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV_tb-Add>div[role='button']", AI = false)
	public WebElement btnAdd;

	@IFindBy(how = How.CSS, using = "input[name='NewSecurityZone-SecurityZoneDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-2-Language']", AI = false)
	public WebElement inpLanguage_7;

	@IFindBy(how = How.CSS, using = "input[name='NewSecurityZone-SecurityZoneDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-0-column0']", AI = false)
	public WebElement inpName_1;

	@IFindBy(how = How.CSS, using = "input[name='NewSecurityZone-SecurityZoneDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-0-column2']", AI = false)
	public WebElement inpDependentonRender;

	@IFindBy(how = How.CSS, using = "input[name='NewSecurityZone-SecurityZoneDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-1-Language']", AI = false)
	public WebElement inpLanguage_3;

	@IFindBy(how = How.CSS, using = "input[name='NewSecurityZone-SecurityZoneDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-1-column0']", AI = false)
	public WebElement inpName_4;

	@IFindBy(how = How.CSS, using = "input[name='NewSecurityZone-SecurityZoneDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-2-column0']", AI = false)
	public WebElement inpName_8;
	
	@IFindBy(how = How.CSS, using = "div[id$='SecurityZones_AddSecurityZoneButton']", AI = false)
	public WebElement btnAddSecurityZone;
	
	@IFindBy(how = How.CSS, using = "input[name$='LocalizedValuesLV-LocalizedValuesLV-0-column1']", AI = false)
	public WebElement inpDescriptionEdgePolicyholderEnglish;

	@IFindBy(how = How.CSS, using = "input[name$='LocalizedValuesLV-LocalizedValuesLV-2-column1']", AI = false)
	public WebElement inpDescriptionEdgeEnglish;

	@IFindBy(how = How.CSS, using = "input[name$='LV-0-column0']", AI = false)
	public WebElement inpNameEdgePolicyholderEnglish;

	@IFindBy(how = How.CSS, using = "input[name$='LV-2-column0']", AI = false)
	public WebElement inpNameEdgeEnglish;

	public NewSecurityZonePage(){
	}

	public NewSecurityZonePage(WebDriver driver) throws Exception{
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
		}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, inpName_8))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);
	}public NewSecurityZonePage clickEdit(WebDriver driver)  {
		BrowserActions.click(driver, btnEdit,"Edit");
		return this;
	}
	public NewSecurityZonePage clickUpdate(WebDriver driver)  {
		BrowserActions.click(driver, btnUpdate,"Update");
		return this;
	}
	public NewSecurityZonePage enterDescription(WebDriver driver,String Description) {
		BrowserActions.type(driver, inpDescription,Description, "Description");
		return this;
	}
	public NewSecurityZonePage clickDelete(WebDriver driver)  {
		BrowserActions.click(driver, btnDelete,"Delete");
		return this;
	}
	public NewSecurityZonePage clickRemove(WebDriver driver)  {
		BrowserActions.click(driver, btnRemove,"Remove");
		return this;
	}
	public NewSecurityZonePage enterLanguage(WebDriver driver,String Language) {
		BrowserActions.type(driver, inpLanguage,Language, "Language");
		return this;
	}
	public NewSecurityZonePage enterDependentonRender_6(WebDriver driver,String DependentonRender_6) {
		BrowserActions.type(driver, inpDependentonRender_6,DependentonRender_6, "DependentonRender_6");
		return this;
	}
	public NewSecurityZonePage enterDescription_5(WebDriver driver,String Description_5) {
		BrowserActions.type(driver, inpDescription_5,Description_5, "Description_5");
		return this;
	}
	public NewSecurityZonePage enterDescription_2(WebDriver driver,String Description_2) {
		BrowserActions.type(driver, inpDescription_2,Description_2, "Description_2");
		return this;
	}
	public NewSecurityZonePage enterName(WebDriver driver,String Name) {
		BrowserActions.type(driver, inpName,Name, "Name");
		return this;
	}
	public NewSecurityZonePage enterDescription_9(WebDriver driver,String Description_9) {
		BrowserActions.type(driver, inpDescription_9,Description_9, "Description_9");
		return this;
	}
	public NewSecurityZonePage clickCancel(WebDriver driver)  {
		BrowserActions.click(driver, btnCancel,"Cancel");
		return this;
	}
	public NewSecurityZonePage enterDependentonRender_10(WebDriver driver,String DependentonRender_10) {
		BrowserActions.type(driver, inpDependentonRender_10,DependentonRender_10, "DependentonRender_10");
		return this;
	}
	public NewSecurityZonePage clickAdd(WebDriver driver)  {
		BrowserActions.click(driver, btnAdd,"Add");
		return this;
	}
	public NewSecurityZonePage enterLanguage_7(WebDriver driver,String Language_7) {
		BrowserActions.type(driver, inpLanguage_7,Language_7, "Language_7");
		return this;
	}
	public NewSecurityZonePage enterName_1(WebDriver driver,String Name_1) {
		BrowserActions.type(driver, inpName_1,Name_1, "Name_1");
		return this;
	}
	public NewSecurityZonePage enterDependentonRender(WebDriver driver,String DependentonRender) {
		BrowserActions.type(driver, inpDependentonRender,DependentonRender, "DependentonRender");
		return this;
	}
	public NewSecurityZonePage enterLanguage_3(WebDriver driver,String Language_3) {
		BrowserActions.type(driver, inpLanguage_3,Language_3, "Language_3");
		return this;
	}
	public NewSecurityZonePage enterName_4(WebDriver driver,String Name_4) {
		BrowserActions.type(driver, inpName_4,Name_4, "Name_4");
		return this;
	}
	public NewSecurityZonePage enterName_8(WebDriver driver,String Name_8) {
		BrowserActions.type(driver, inpName_8,Name_8, "Name_8");
		return this;
	}
	public NewSecurityZonePage clickAddSecurityZone(WebDriver driver)  {
		BrowserActions.click(driver, btnAddSecurityZone,"Add Security Zone");
		return this;
	}
	
	public NewSecurityZonePage enterDescriptionEdgePolicyholderEnglish(WebDriver driver,String localization) {
		BrowserActions.type(driver, inpDescriptionEdgePolicyholderEnglish,localization, "Edge Policyholder English");
		return this;
	}
	public NewSecurityZonePage enterDescriptionEdgeEnglish(WebDriver driver,String localization) {
		BrowserActions.type(driver, inpDescriptionEdgeEnglish,localization, "Edge English");
		return this;
	}
	public NewSecurityZonePage enterNameEdgePolicyholderEnglish(WebDriver driver,String localization) {
		BrowserActions.type(driver, inpNameEdgePolicyholderEnglish,localization,1, "Name Edge Policyholder English");
		return this;
	}
	public NewSecurityZonePage enterNameEdgeEnglish(WebDriver driver,String localization) {
		BrowserActions.type(driver, inpNameEdgeEnglish,localization, 1,"Name Edge English");
		return this;
	}
	public void  verifySecurityZoneIsDisplay(WebDriver driver,String zone) {
		BrowserActions.waitForElementToDisplay(driver, lblTtlBar);
		By securityZoneBy = By.xpath("//div[text()='"+zone+"']");
		BrowserActions.waitForElementToDisplay(driver, securityZoneBy, "Added security zone");
	}
	
	public NewSecurityZonePage clickAddedNameCheckBox(WebDriver driver,String username)  {
		By nameCheckBoxBy = By.xpath("//div[text()='"+username+"']");
		BrowserActions.waitForElementToDisplay(driver, nameCheckBoxBy,"name check box");
		WebElement nameCheckBox = nameCheckBoxBy.findElement(driver);
		BrowserActions.click(driver, nameCheckBox,"Name check box");
		return this;
	}

	public void verifyclickAddedUserNameIsNotDisplayed(WebDriver driver,String username)  {
	boolean flag = false;
	BrowserActions.waitForElementToDisplay(driver,lblTtlBar);
	By userName = By.xpath("//div[text()='"+username+"']");
	int size = BrowserActions.getWebElementSize(driver, userName, "username", 0.5);
	if(size == 0) {
		flag = true;
	}
	Log.softAssertThat(flag, "User("+username+") is not present as expected", "User("+username+") present in list");
}

}
