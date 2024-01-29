package com.aspire.guidewire.pc.pages.common;

import java.util.ArrayList;

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

public class ModifiersPage extends LoadableComponent<ModifiersPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	@IFindBy(how = How.CSS, using = "div[id='gw-center-title-toolbar']>div[id$='ModifiersScreen-ttlBar']", AI = false)
	public WebElement ttlModifiers;
	
	@IFindBy(how = How.CSS, using = "div[id$='Next']", AI = false)
	public WebElement btnNext;
	
	@IFindBy(how = How.CSS, using = "div[id*='ratingInput']", AI = false)
	public WebElement txtRating;
	
	public ModifiersPage() {}

	public ModifiersPage(WebDriver driver){
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, Utils.maxElementWait);
		PageFactory.initElements(finder, this);
		elementLayer = new ElementLayer(driver);
	}

	public ModifiersPage(WebDriver driver,int timeout){
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, timeout);
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

		if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, ttlModifiers))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}
		elementLayer = new ElementLayer(driver);
	}// isLoaded


	/**
	 * click next button to navigate to next page
	 * @author charu.anbarasan
	 * @param driver
	 */
	public void clickNext(WebDriver driver)  {
		BrowserActions.click(driver, btnNext,0.5,"next button");
	}
}