package com.aspire.guidewire.pc.pages.workerscompensation;
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

public class ClassCodeSearchPage extends LoadableComponent<ClassCodeSearchPage>{

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementIdentifier;
	String elementObject;
	HashMap<String, String> getPageObjects;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	@IFindBy(how = How.CSS, using = "#WCClassCodeSearchPopup-WCClassCodeSearchScreen-ttlBar", AI = false)
	public WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "#WCClassCodeSearchPopup-WCClassCodeSearchScreen-WCClassCodeSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Search", AI = false)
	public WebElement btnSearch;

	@IFindBy(how = How.CSS, using = "input[name='WCClassCodeSearchPopup-WCClassCodeSearchScreen-LocationLabel']", AI = false)
	public WebElement inpLocationLabel;

	@IFindBy(how = How.CSS, using = "input[name='WCClassCodeSearchPopup-WCClassCodeSearchScreen-WCClassCodeSearchDV-Code']", AI = false)
	public WebElement inpCode;

	@IFindBy(how = How.CSS, using = "#WCClassCodeSearchPopup-__crumb__", AI = false)
	public WebElement btnReturntoWCCoverages;

	@IFindBy(how = How.CSS, using = "input[name='WCClassCodeSearchPopup-WCClassCodeSearchScreen-WCClassCodeSearchDV-Classification']", AI = false)
	public WebElement inpClassification;

	@IFindBy(how = How.CSS, using = "#WCClassCodeSearchPopup-WCClassCodeSearchScreen-WCClassCodeSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Reset", AI = false)
	public WebElement btnReset;

	@IFindBy(how = How.CSS, using ="div[id$='_Select']", AI = false)  
	public WebElement btnSelect;

	public ClassCodeSearchPage(){
	}

	public ClassCodeSearchPage(WebDriver driver){
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(finder, this);
		elementLayer = new ElementLayer(driver);
	}

	@Override
	protected void load() {
		isPageLoaded = true;
		WaitUtils.waitForPageLoad(driver);
	}// load

	@Override
	protected void isLoaded() {
		if (!isPageLoaded) {
			Assert.fail();
		}

		if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, lblTtlBar))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}
		elementLayer = new ElementLayer(driver);
	}// isLoaded
	public ClassCodeSearchPage clickSearch(WebDriver driver)  {
		BrowserActions.click(driver, btnSearch,"Search");
		return this;
	}
	public ClassCodeSearchPage enterLocationLabel(WebDriver driver,String LocationLabel) {
		BrowserActions.type(driver, inpLocationLabel,LocationLabel, "LocationLabel");
		return this;
	}
	public ClassCodeSearchPage enterCode(WebDriver driver,String Code) {
		BrowserActions.type(driver, inpCode,Code, "Code");
		return this;
	}
	public ClassCodeSearchPage clickReturntoWCCoverages(WebDriver driver)  {
		BrowserActions.click(driver, btnReturntoWCCoverages,"ReturntoWCCoverages");
		return this;
	}
	public ClassCodeSearchPage enterClassification(WebDriver driver,String Classification) {
		BrowserActions.type(driver, inpClassification,Classification, "Classification");
		return this;
	}
	public ClassCodeSearchPage clickReset(WebDriver driver)  {
		BrowserActions.click(driver, btnReset,"Reset");
		return this;
	}
	public ClassCodeSearchPage clickSelect(WebDriver driver) {
		BrowserActions.click(driver, btnSelect,true, "Add button");
		return this;
	}
}

