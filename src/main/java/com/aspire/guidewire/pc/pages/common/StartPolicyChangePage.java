package com.aspire.guidewire.pc.pages.common;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
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

public class StartPolicyChangePage extends LoadableComponent<StartPolicyChangePage> {
	

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();
	//public TopNavBar topnavbar;
	@IFindBy(how = How.CSS, using = "input[name$='EffectiveDate']", AI = false)
	public WebElement inpEffectiveDate;

	@IFindBy(how = How.CSS, using = "input[name$='Description']", AI = false)
	public WebElement inpDescription;

	@IFindBy(how = How.CSS, using = "div[id$='NewPolicyChange']", AI = false)
	public WebElement btnNextPolicyChange;

	@IFindBy(how = How.CSS, using = "#StartPolicyChange-StartPolicyChangeScreen-ttlBar", AI = false)
	public WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "#StartPolicyChange-StartPolicyChangeScreen-Cancel>div[role='button']", AI = false)
	public WebElement btnCancel;

	public StartPolicyChangePage(){
	}

	public StartPolicyChangePage(WebDriver driver){
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(finder, this);
}
	@Override
	protected void load() {
		isPageLoaded = true;
		WaitUtils.waitForPageLoad(driver);
	}// loadF
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
public StartPolicyChangePage enterEffectiveDate(WebDriver driver,String EffectiveDate) {
		        //    BrowserActions.type(driver, inpEffectiveDate,EffectiveDate, "EffectiveDate");
	JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	jsExecutor.executeScript("arguments[0].value='"+EffectiveDate+"';", inpEffectiveDate);
			        return this;
           }
public StartPolicyChangePage enterDescription(WebDriver driver,String Description) {
		            BrowserActions.type(driver, inpDescription,Description, "Description");
			        return this;
           }
public StartPolicyChangePage clickNext(WebDriver driver)  {
					BrowserActions.click(driver, btnNextPolicyChange,"Next");
				    return this;
			}
public StartPolicyChangePage clickCancel(WebDriver driver)  {
					BrowserActions.click(driver, btnCancel,"Cancel");
				    return this;
			}
}
