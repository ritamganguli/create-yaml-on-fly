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

public class ReopenExposurePage extends LoadableComponent<ReopenExposurePage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
 	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
	//public TopNavBar topnavbar;
	@IFindBy(how = How.CSS, using = "#ReopenExposurePopup-__crumb__", AI = false)
	private WebElement btn__crumb__;

	@IFindBy(how = How.CSS, using = "#ReopenExposurePopup-ReopenExposureScreen-Update>div[role='button']", AI = false)
	private WebElement btnReopenExposure;

	@IFindBy(how = How.CSS, using = "#ReopenExposurePopup-ReopenExposureScreen-ReopenExposureInfoDV-Note textarea", AI = false)
	private WebElement inpNote;

	@IFindBy(how = How.CSS, using = "#ReopenExposurePopup-ReopenExposureScreen-ttlBar", AI = false)
	private WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "#ReopenExposurePopup-ReopenExposureScreen-Edit>div[role='button']", AI = false)
	private WebElement btnEdit;

	@IFindBy(how = How.CSS, using = "select[name='ReopenExposurePopup-ReopenExposureScreen-ReopenExposureInfoDV-Reason']", AI = false)
	private WebElement drpReason;

	@IFindBy(how = How.CSS, using = "#ReopenExposurePopup-ReopenExposureScreen-Cancel>div[role='button']", AI = false)
	private WebElement btnCancel;

	public ReopenExposurePage(){
	}

	public ReopenExposurePage(WebDriver driver) throws Exception{
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
}public ReopenExposurePage click__crumb__(WebDriver driver)  {
					BrowserActions.click(driver, btn__crumb__,"__crumb__");
				    return this;
			}
public ReopenExposurePage clickReopenExposure(WebDriver driver)  {
					BrowserActions.click(driver, btnReopenExposure,"ReopenExposure");
				    return this;
			}
public ReopenExposurePage enterNote(WebDriver driver,String Note) {
		            BrowserActions.type(driver, inpNote,Note, "Note");
			        return this;
           }
public ReopenExposurePage clickEdit(WebDriver driver)  {
					BrowserActions.click(driver, btnEdit,"Edit");
				    return this;
			}
public ReopenExposurePage selectReason(WebDriver driver,String Reason)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpReason,Reason,"Reason");
				    return this;
			}
public ReopenExposurePage clickCancel(WebDriver driver)  {
					BrowserActions.click(driver, btnCancel,"Cancel");
				    return this;
			}
}
