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

public class ConfirmationPage extends LoadableComponent<ConfirmationPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	@IFindBy(how = How.CSS, using = "div[id='gw-center-title-toolbar']>div[id$='QuoteScreen-ttlBar']", AI = false)
	public WebElement ttlConfirmation;
	
	@IFindBy(how = How.CSS, using = "div[id$='BindOptions']", AI = false)
	public WebElement btnBindOptions;
	
	@IFindBy(how = How.CSS, using = "div[id$='BindOptions-CancelNow']", AI = false)
	public WebElement btnCancelNow;
	
	public ConfirmationPage() {}

	public ConfirmationPage(WebDriver driver){
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, Utils.maxElementWait);
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

		if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, ttlConfirmation))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}
		elementLayer = new ElementLayer(driver);
	}// isLoaded

	/**
	 * @author vignesh.ravi
	 * click on Bind options
	 * @param driver
	 */
	public ConfirmationPage clickbindOptions(WebDriver driver)  {
		BrowserActions.click(driver, btnBindOptions,1,"Bind options");
		return this;
	}
	
	/**
	 * @author vignesh.ravi
	 * click on cancel now
	 * @param driver
	 * @throws InterruptedException 
	 */
	public PolicyBoundPage clickCancelNow(WebDriver driver) {
		BrowserActions.click(driver, btnCancelNow,0.5,"Cancel now");
	    BrowserActions.confirmAlert(driver, "Are you sure you want to cancel this policy?");
		return new PolicyBoundPage(driver).get();
	}
	

}
