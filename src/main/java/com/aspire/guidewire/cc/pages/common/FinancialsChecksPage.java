package com.aspire.guidewire.cc.pages.common;
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

public class FinancialsChecksPage extends LoadableComponent<FinancialsChecksPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
 	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
//	public TopNavBar topnavbar;
	@IFindBy(how = How.CSS, using = "#ClaimFinancialsChecks-ClaimFinancialsChecksScreen-ttlBar", AI = false)
	private WebElement lblTtlBar;
	
	@IFindBy(how = How.XPATH, using = "(//td[contains(@id,'Status_Cell')]) [last()]", AI = false)
	private WebElement lblStatus;
	
	@IFindBy(how = How.CSS, using = "div[data-gw-click$='0-GrossAmount']", AI = false)
	private WebElement lblAmount;

	public FinancialsChecksPage(){
	}

	public FinancialsChecksPage(WebDriver driver){
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
		}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, lblTtlBar))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);
	}
	
	public FinancialsChecksPage verifyStatus(WebDriver driver,String expectedText) {
		BrowserActions.waitForNetworkIdleState(driver);
		String text = BrowserActions.getText(driver, lblStatus, "Status");
		Log.assertThat(text.equals(expectedText), "expected status is updated", "expected status is not updated");
		return this;
	}
	public FinancialsChecksPage clickAmount(WebDriver driver) {
		BrowserActions.click(driver, lblAmount, "Amount");
		return this;
	}
}
