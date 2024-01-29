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

public class RenewalDataEntryPage extends LoadableComponent<RenewalDataEntryPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	@IFindBy(how = How.CSS, using = "select[name='RenewalWizard_RenewalPopup-RenewalWizard_RenewalScreen-RenewalCode']", AI = false)
	public WebElement drpRenewalCode;

	@IFindBy(how = How.CSS, using = "#RenewalWizard_RenewalPopup-RenewalWizard_RenewalScreen-Update>div[role='button']", AI = false)
	public WebElement btnOK;

	@IFindBy(how = How.CSS, using = "#RenewalWizard_RenewalPopup-RenewalWizard_RenewalScreen-ttlBar", AI = false)
	public WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "#RenewalWizard_RenewalPopup-RenewalWizard_RenewalScreen-Edit>div[role='button']", AI = false)
	public WebElement btnEdit;

	@IFindBy(how = How.CSS, using = "#RenewalWizard_RenewalPopup-__crumb__", AI = false)
	public WebElement btnReturntoViewQuote;

	@IFindBy(how = How.CSS, using = "#RenewalWizard_RenewalPopup-RenewalWizard_RenewalScreen-Cancel>div[role='button']", AI = false)
	public WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "div[id$='Update']", AI = false)
	public WebElement btnOk;

	public RenewalDataEntryPage(){
	}

	public RenewalDataEntryPage(WebDriver driver){
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
	public RenewalDataEntryPage selectRenewalCode(WebDriver driver,String RenewalCode)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpRenewalCode,RenewalCode,"RenewalCode");
		return this;
	}
	public RenewalDataEntryPage clickOk(WebDriver driver){
		BrowserActions.click(driver, btnOk,"Ok Button");
		BrowserActions.confirmAlert(driver, "Confirm Alert" );
		return this;
	}

	public RenewalDataEntryPage clickOK(WebDriver driver)  {
		BrowserActions.click(driver, btnOK,"OK");
		return this;
	}
	public RenewalDataEntryPage clickEdit(WebDriver driver)  {
		BrowserActions.click(driver, btnEdit,"Edit");
		return this;
	}
	public RenewalDataEntryPage clickReturntoViewQuote(WebDriver driver)  {
		BrowserActions.click(driver, btnReturntoViewQuote,"ReturntoViewQuote");
		return this;
	}
	public RenewalDataEntryPage clickCancel(WebDriver driver)  {
		BrowserActions.click(driver, btnCancel,"Cancel");
		return this;
	}
}


