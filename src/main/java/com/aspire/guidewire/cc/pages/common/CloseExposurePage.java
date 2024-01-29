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

public class CloseExposurePage extends LoadableComponent<CloseExposurePage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
 	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
	//public TopNavBar topnavbar;
	@IFindBy(how = How.CSS, using = "#CloseExposurePopup-__crumb__", AI = false)
	private WebElement btnReturntoExposures;

	@IFindBy(how = How.CSS, using = "#CloseExposurePopup-CloseExposureScreen-CloseExposureInfoDV-Note textarea", AI = false)
	private WebElement inpNote;

	@IFindBy(how = How.CSS, using = "select[name='CloseExposurePopup-CloseExposureScreen-CloseExposureInfoDV-Outcome']", AI = false)
	private WebElement drpOutcome;

	@IFindBy(how = How.CSS, using = "#CloseExposurePopup-CloseExposureScreen-Update>div[role='button']", AI = false)
	private WebElement btnCloseExposure;

	@IFindBy(how = How.CSS, using = "#CloseExposurePopup-CloseExposureScreen-ttlBar", AI = false)
	private WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "#CloseExposurePopup-CloseExposureScreen-Edit>div[role='button']", AI = false)
	private WebElement btnEdit;

	@IFindBy(how = How.CSS, using = "#CloseExposurePopup-CloseExposureScreen-Cancel>div[role='button']", AI = false)
	private WebElement btnCancel;

	public CloseExposurePage(){
	}

	public CloseExposurePage(WebDriver driver){
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(finder, this);
}
@Override
	protected void load() {
		isPageLoaded = true;
		WaitUtils.waitForPageLoad(driver);
	}
@Override
	protected void isLoaded() {
		if (!isPageLoaded) {
			Assert.fail();
		}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, lblTtlBar))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);
}public CloseExposurePage clickReturntoExposures(WebDriver driver)  {
					BrowserActions.click(driver, btnReturntoExposures,"ReturntoExposures");
				    return this;
			}
public CloseExposurePage enterNote(WebDriver driver,String Note) {
		            BrowserActions.type(driver, inpNote,Note, "Note");
			        return this;
           }
public CloseExposurePage selectOutcome(WebDriver driver,String Outcome)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpOutcome,Outcome,"Outcome");
				    return this;
			}
public CloseExposurePage clickCloseExposure(WebDriver driver)  {
					BrowserActions.click(driver, btnCloseExposure,"CloseExposure");
				    return this;
			}
public CloseExposurePage clickEdit(WebDriver driver)  {
					BrowserActions.click(driver, btnEdit,"Edit");
				    return this;
			}
public CloseExposurePage clickCancel(WebDriver driver)  {
					BrowserActions.click(driver, btnCancel,"Cancel");
				    return this;
			}
}
