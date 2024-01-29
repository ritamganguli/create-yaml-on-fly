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
import com.aspire.guidewire.utils.WaitUtils;

import ASPIREAI.customfactories.AjaxElementLocatorFactory;
import ASPIREAI.customfactories.IFindBy;
import ASPIREAI.customfactories.PageFactory;

public class NewPropertyPage extends LoadableComponent<NewPropertyPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	@IFindBy(how = How.CSS, using = "textarea[name$='PropertyDVDescription']", AI = false)
	private WebElement inpDescription;

	@IFindBy(how = How.CSS, using = "input[name$='PropertyDVValue']", AI = false)
	private WebElement inpValue;

	@IFindBy(how = How.CSS, using = "#NewProperty-PropertyDetailScreen-ttlBar", AI = false)
	private WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "div[id$='Edit']", AI = false)
	private WebElement btnEdit;

	@IFindBy(how = How.CSS, using = "select[name$='PropertyDVGroup']", AI = false)
	private WebElement drpGroup;

	@IFindBy(how = How.CSS, using = "div[id$='Update']", AI = false)
	private WebElement btnUpdate;

	@IFindBy(how = How.CSS, using = "div[id$='Delete']", AI = false)
	private WebElement btnDelete;

	@IFindBy(how = How.CSS, using = "input[name$='PropertyDVName']", AI = false)
	private WebElement inpName;

	@IFindBy(how = How.CSS, using = "div[id$='Cancel']", AI = false)
	private WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "div[id$='PropertyDetail_UpLink']", AI = false)
	private WebElement btnUptoRunProperties;


	public NewPropertyPage(){
	}

	public NewPropertyPage(WebDriver driver) throws Exception{
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
		}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, btnCancel))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);
	}public NewPropertyPage enterDescription(WebDriver driver,String Description) {
		BrowserActions.type(driver, inpDescription,Description, "Description");
		return this;
	}
	public NewPropertyPage enterValue(WebDriver driver,String Value) {
		BrowserActions.type(driver, inpValue,Value, "Value");
		return this;
	}
	public NewPropertyPage clickEdit(WebDriver driver)  {
		BrowserActions.click(driver, btnEdit,"Edit");
		return this;
	}
	public NewPropertyPage selectGroup(WebDriver driver,String Group)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpGroup,Group,"Group");
		return this;
	}
	public NewPropertyPage clickUpdate(WebDriver driver)  {
		BrowserActions.click(driver, btnUpdate,"Update");
		return this;
	}
	public NewPropertyPage clickDelete(WebDriver driver)  {
		BrowserActions.click(driver, btnDelete,"Delete");
		return this;
	}
	public NewPropertyPage enterName(WebDriver driver,String Name) {
		BrowserActions.type(driver, inpName,Name, "Name");
		return this;
	}
	public NewPropertyPage clickCancel(WebDriver driver)  {
		BrowserActions.click(driver, btnCancel,"Cancel");
		return this;
	}

	public NewPropertyPage clickReturnUptoRunTimeProperties(WebDriver driver)  {
		BrowserActions.click(driver, btnUptoRunProperties,"Upto Run Properties");
		return this;
	}

}
