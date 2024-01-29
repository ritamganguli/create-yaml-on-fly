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
import com.aspire.guidewire.utils.WaitUtils;

import ASPIREAI.customfactories.AjaxElementLocatorFactory;
import ASPIREAI.customfactories.IFindBy;
import ASPIREAI.customfactories.PageFactory;

public class CancellationPage extends LoadableComponent<CancellationPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	@IFindBy(how = How.CSS, using = "#StartCancellation-StartCancellationScreen-CancelPolicyDV-ReasonDescription", AI = false)
	public WebElement inpReasonDescription;

	@IFindBy(how = How.CSS, using = "input[name='StartCancellation-StartCancellationScreen-CancelPolicyDV-CancelDate']", AI = false)
	public WebElement inpCancellationEffectiveDate;

	@IFindBy(how = How.CSS, using = "#StartCancellation-StartCancellationScreen-ttlBar", AI = false)
	public WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "#StartCancellation-StartCancellationScreen-NewCancellation>div[role='button']", AI = false)
	public WebElement btnStartCancellation;

	@IFindBy(how = How.CSS, using = "#StartCancellation-StartCancellationScreen-NewAsyncCancellation>div[role='button']", AI = false)
	public WebElement btnStartCancellation_1;

	@IFindBy(how = How.CSS, using = "div[id$='Reason'] select[name$='Reason']", AI = false)
	public WebElement drpReason;

	@IFindBy(how = How.CSS, using = "select[name='StartCancellation-StartCancellationScreen-CancelPolicyDV-CalcMethod']", AI = false)
	public WebElement drpRefundMethod;

	@IFindBy(how = How.CSS, using = "div[id$='Source'] select[name$='Source']", AI = false)
	public WebElement drpSource;

	@IFindBy(how = How.CSS, using = "#StartCancellation-StartCancellationScreen-Cancel>div[role='button']", AI = false)
	public WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "div[id$='CalcMethod']", AI = false)
	public WebElement lblRefundMethod;

	public CancellationPage(){
	}

	public CancellationPage(WebDriver driver){
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
	public CancellationPage enterReasonDescription(WebDriver driver,String ReasonDescription) {
		BrowserActions.type(driver, inpReasonDescription,ReasonDescription, "ReasonDescription");
		return this;
	}
	public CancellationPage enterCancellationEffectiveDate(WebDriver driver,String CancellationEffectiveDate) {
		BrowserActions.type(driver, inpCancellationEffectiveDate,CancellationEffectiveDate, "CancellationEffectiveDate");
		return this;
	}
	public CancellationPage clickStartCancellation(WebDriver driver)  {
		BrowserActions.click(driver, btnStartCancellation,1,"StartCancellation");
		return this;
	}
	public CancellationPage clickStartCancellation_1(WebDriver driver)  {
		BrowserActions.click(driver, btnStartCancellation_1,"StartCancellation_1");
		return this;
	}
	public CancellationPage selectReason(WebDriver driver,String Reason)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpReason,Reason,true,"Reason");
		return this;
	}
	public CancellationPage selectRefundMethod(WebDriver driver,String RefundMethod)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpRefundMethod,RefundMethod,"RefundMethod");
		return this;
	}
	public CancellationPage selectSource(WebDriver driver,String Source)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpSource,Source,true,"Source");
		return this;
	}
	public CancellationPage clickCancel(WebDriver driver)  {
		BrowserActions.click(driver, btnCancel,"Cancel");
		return this;
	}
	public String getRefundMethod(WebDriver driver) {
		String text=BrowserActions.getText(driver, lblRefundMethod,"Refund Method");
		return text;
	}
}

