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

public class IndustryCodeSearchPage extends LoadableComponent<IndustryCodeSearchPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementIdentifier;
	String elementObject;
	HashMap<String, String> getPageObjects;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	@IFindBy(how = How.CSS, using = "#IndustryCodeSearchPopup-IndustryCodeSearchScreen-ttlBar", AI = false)
	public WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "#IndustryCodeSearchPopup-IndustryCodeSearchScreen-IndustryCodeSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Search", AI = false)
	public WebElement btnSearch;

	@IFindBy(how = How.CSS, using = "#IndustryCodeSearchPopup-IndustryCodeSearchScreen-Cancel>div[role='button']", AI = false)
	public WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "input[name='IndustryCodeSearchPopup-IndustryCodeSearchScreen-IndustryCodeSearchDV-Code']", AI = false)
	public WebElement inpCode;

	@IFindBy(how = How.CSS, using = "input[name='IndustryCodeSearchPopup-IndustryCodeSearchScreen-IndustryCodeSearchDV-Classification']", AI = false)
	public WebElement inpClassification;

	@IFindBy(how = How.CSS, using = "#IndustryCodeSearchPopup-IndustryCodeSearchScreen-IndustryCodeSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Reset", AI = false)
	public WebElement btnReset;

	@IFindBy(how = How.CSS, using = "#IndustryCodeSearchPopup-__crumb__", AI = false)
	public WebElement btnReturntoPolicyInfo;

	@IFindBy(how = How.CSS, using = "div[id$='_Select']", AI = false)
	public WebElement btnSelect;


	public IndustryCodeSearchPage(){
	}

	public IndustryCodeSearchPage(WebDriver driver){
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(finder, this);
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
	public IndustryCodeSearchPage clickSearch(WebDriver driver)  {
		BrowserActions.click(driver, btnSearch,"Search");
		return this;
	}
	public IndustryCodeSearchPage clickCancel(WebDriver driver)  {
		BrowserActions.click(driver, btnCancel,"Cancel");
		return this;
	}
	public IndustryCodeSearchPage enterCode(WebDriver driver,String Code) {
		BrowserActions.type(driver, inpCode,Code, "Code");
		return this;
	}
	public IndustryCodeSearchPage enterClassification(WebDriver driver,String Classification) {
		BrowserActions.type(driver, inpClassification,Classification, "Classification");
		return this;
	}
	public IndustryCodeSearchPage clickReset(WebDriver driver)  {
		BrowserActions.click(driver, btnReset,"Reset");
		return this;
	}
	public IndustryCodeSearchPage clickReturntoPolicyInfo(WebDriver driver)  {
		BrowserActions.click(driver, btnReturntoPolicyInfo,"ReturntoPolicyInfo");
		return this;
	}
	public IndustryCodeSearchPage clickSelectBtn(WebDriver driver)  {
		BrowserActions.click(driver, btnSelect,true,"Select Button");
		return this;
	}


}
