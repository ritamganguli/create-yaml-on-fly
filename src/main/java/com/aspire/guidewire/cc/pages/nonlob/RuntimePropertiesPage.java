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

public class RuntimePropertiesPage extends LoadableComponent<RuntimePropertiesPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	@IFindBy(how = How.CSS, using = "#Properties-PropertiesScreen-PropertiesExportButton>div[role='button']", AI = false)
	private WebElement btnExport;

	@IFindBy(how = How.CSS, using = "#Properties-PropertiesScreen-PropertiesNewButton>div[role='button']", AI = false)
	private WebElement btnNewProperty;

	@IFindBy(how = How.CSS, using = "select[name='Properties-PropertiesScreen-PropertiesLV-PropertyGroupFilter']", AI = false)
	private WebElement drpPropertyGroup_1;

	@IFindBy(how = How.CSS, using = "#Properties-PropertiesScreen-PropertiesImportButton>div[role='button']", AI = false)
	private WebElement btnImport;

	@IFindBy(how = How.CSS, using = "div[id$='PropertiesDeleteButton']", AI = false)
	private WebElement btnDelete;

	@IFindBy(how = How.CSS, using = "select[name='Properties-PropertiesScreen-PropertiesLV-PropertyGroupFilter']", AI = false)
	private WebElement drpPropertyGroup;

	@IFindBy(how = How.CSS, using = "div[id$='PropertiesLVName_button']", AI = false)
	private WebElement btnPropertyNameList;

	@IFindBy(how = How.CSS, using = "div[id$='PropertiesScreen-0']", AI = false)
	private WebElement lblttl;

	public RuntimePropertiesPage(){
	}

	public RuntimePropertiesPage(WebDriver driver) throws Exception{
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
		}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, drpPropertyGroup))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);
	}public RuntimePropertiesPage clickExport(WebDriver driver)  {
		BrowserActions.click(driver, btnExport,"Export");
		return this;
	}
	public RuntimePropertiesPage clickNewProperty(WebDriver driver)  {
		BrowserActions.click(driver, btnNewProperty,"NewProperty");
		return this;
	}
	public RuntimePropertiesPage selectPropertyGroup_1(WebDriver driver,String PropertyGroup_1)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPropertyGroup_1,PropertyGroup_1,"PropertyGroup_1");
		return this;
	}
	public RuntimePropertiesPage clickImport(WebDriver driver)  {
		BrowserActions.click(driver, btnImport,"Import");
		return this;
	}
	public RuntimePropertiesPage clickDelete(WebDriver driver)  {
		BrowserActions.click(driver, btnDelete,"Delete");
		BrowserActions.confirmAlert(driver, "Are you sure you want to delete the selected properties?");
		return this;
	}
	public RuntimePropertiesPage selectPropertyGroup(WebDriver driver,String PropertyGroup)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPropertyGroup,PropertyGroup,"PropertyGroup");
		return this;
	}

	public RuntimePropertiesPage clickPropertyNameLink(WebDriver driver,String name) {
		BrowserActions.waitForElementToDisplay(driver, btnPropertyNameList);
		By PropertylinkBy = By.xpath("//div[text()='"+name+"']");
		BrowserActions.waitForElementToDisplay(driver, PropertylinkBy,"Property link");
		WebElement Propertylink = PropertylinkBy.findElement(driver);
		BrowserActions.click(driver, Propertylink, "Property link");
		return this;
	}
	public RuntimePropertiesPage clickPropertyNameCheckbox(WebDriver driver,String name) {
		BrowserActions.waitForElementToDisplay(driver, btnPropertyNameList);
		By userPropertiesBy = By.xpath("//div[text()='"+name+"']//ancestor::td//preceding-sibling::td//descendant::div[contains(@id,'_Checkbox')]");
		BrowserActions.waitForElementToDisplay(driver, userPropertiesBy, "user properties");
		WebElement userProperties = userPropertiesBy.findElement(driver);
		BrowserActions.click(driver, userProperties, "Property check box");
		return this;
	}

	public void verifyRunTimePropertyMainPage(WebDriver driver)  {
		BrowserActions.verifyElementDisplayed(driver, lblttl,"RunTime Property Page Title");
	}

	public boolean verifyPropertyNameIsDisplayed(WebDriver driver,String name)  {
		boolean isPropertyNameFound = false;
		By elementsBy = By.cssSelector("div[id$='PropertiesLVName_button']");
		List<WebElement> elements = BrowserActions.getWebElements(driver, elementsBy, "elements", 0.5);
		for (WebElement element : elements) {
			if (element.getText().equals(name)) {
				isPropertyNameFound = true;
				break;
			}
		}
		Log.message(name +" Property name found");
		return isPropertyNameFound;
	}

	public void verifyPropertyNameIsNotDisplayed(WebDriver driver,String name)  {
		boolean isPropertyNameFound = false;
		BrowserActions.waitForNetworkIdleState(driver, 1);
		By nameBy = By.xpath("//div[text()='"+name+"']");
		int size = BrowserActions.getWebElementSize(driver, nameBy, "name", 0.5);
		if(size == 0) {
			isPropertyNameFound = true;
		}
		Log.softAssertThat(isPropertyNameFound, "Property("+name+") is not found", "User("+name+") Property present in list");
	}


}
