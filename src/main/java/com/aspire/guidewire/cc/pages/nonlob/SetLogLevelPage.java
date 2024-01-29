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
import com.aspire.guidewire.webdriverManager.DriverManager;

import ASPIREAI.customfactories.AjaxElementLocatorFactory;
import ASPIREAI.customfactories.IFindBy;
import ASPIREAI.customfactories.PageFactory;

public class SetLogLevelPage extends LoadableComponent<SetLogLevelPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
 	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
	//public TopNavBar topnavbar;
	@IFindBy(how = How.CSS, using = "input[name='SetLogLevel-SetLogLevelScreen-CurActualLevel']", AI = false)
	private WebElement inpCurrentActualLevel;

	@IFindBy(how = How.CSS, using = "select[name='SetLogLevel-SetLogLevelScreen-NewLevel']", AI = false)
	private WebElement drpNewConfiguredLevel;

	@IFindBy(how = How.CSS, using = "select[name='SetLogLevel-SetLogLevelScreen-Logger']", AI = false)
	private WebElement drpLogger;

	@IFindBy(how = How.CSS, using = "#SetLogLevel-SetLogLevelScreen-ttlBar", AI = false)
	private WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "#SetLogLevel-SetLogLevelScreen-SetLevel>div[role='button']", AI = false)
	private WebElement btnSetLevel;

	@IFindBy(how = How.CSS, using = "input[name='SetLogLevel-SetLogLevelScreen-CurConfigLevel']", AI = false)
	private WebElement inpCurrentConfiguredLevel;
	
	@IFindBy(how = How.CSS, using = "div[id$='CurConfigLevel']", AI = false)
	private WebElement lblCurrentConfiguredLevel;
	
	@IFindBy(how = How.CSS, using = "div[id$='CurActualLevel']", AI = false)
	private WebElement lblCurrentActualLevel;

	public SetLogLevelPage(){
	}

	public SetLogLevelPage(WebDriver driver){
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
}public SetLogLevelPage enterCurrentActualLevel(WebDriver driver,String CurrentActualLevel) {
		            BrowserActions.type(driver, inpCurrentActualLevel,CurrentActualLevel, "CurrentActualLevel");
			        return this;
           }
public SetLogLevelPage selectNewConfiguredLevel(WebDriver driver,String NewConfiguredLevel)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpNewConfiguredLevel,NewConfiguredLevel,"NewConfiguredLevel");
					Log.messageStep("New Cofigured Level field is Selected with options as "+NewConfiguredLevel,DriverManager.getDriver());
				    return this;
			}
public SetLogLevelPage selectLogger(WebDriver driver,String Logger)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpLogger,Logger,"Logger");
				    return this;
			}
public SetLogLevelPage clickSetLevel(WebDriver driver)  {
					BrowserActions.click(driver, btnSetLevel,"SetLevel");
				    return this;
			}
public SetLogLevelPage enterCurrentConfiguredLevel(WebDriver driver,String CurrentConfiguredLevel) {
		            BrowserActions.type(driver, inpCurrentConfiguredLevel,CurrentConfiguredLevel, "CurrentConfiguredLevel");
		            Log.messageStep("Current Configured Level field is entered as "+CurrentConfiguredLevel,DriverManager.getDriver());
			        return this;
           }

public SetLogLevelPage verifyCurrentConfiguredLevel(WebDriver driver)  {
	BrowserActions.verifyElementDisplayed(driver, lblCurrentConfiguredLevel,"Current Configured Level ");
	return this;
}

public SetLogLevelPage verifyCurrentActualLevel(WebDriver driver)  {
	BrowserActions.verifyElementDisplayed(driver, lblCurrentActualLevel,"Current Actual Level ");
	Log.messageStep("Current Configured and Current Actual Level were Displayed Successfully",DriverManager.getDriver());
	return this;
}

}
