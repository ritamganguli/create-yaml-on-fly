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

public class PolicyBoundPage extends LoadableComponent<PolicyBoundPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();


	//public TopNavBar topnavbar;
	@IFindBy(how = How.CSS, using = "#JobComplete-JobCompleteScreen-JobCompleteDV-ResolveWithFutureBoundPeriods", AI = false)
	public WebElement lnkResolveWithFutureBoundPeriods;

	@IFindBy(how = How.CSS, using = "#JobComplete-JobCompleteScreen-JobCompleteDV-ResolveWithFutureUnboundPeriods", AI = false)
	public WebElement lnkResolveWithFutureUnboundPeriods;

	@IFindBy(how = How.CSS, using = "#JobComplete-JobCompleteScreen-CreateBinder>div[role='button']", AI = false)
	public WebElement btnPrintBinder;

	@IFindBy(how = How.CSS, using = "#JobComplete-JobCompleteScreen-JobCompleteDV-ReturnToDesktop", AI = false)
	public WebElement lnkReturnToDesktop;

	@IFindBy(how = How.CSS, using = "#JobComplete-JobCompleteScreen-JobCompleteDV-ViewJob", AI = false)
	public WebElement lnkViewJob;

	@IFindBy(how = How.CSS, using = "#JobComplete-JobCompleteScreen-JobCompleteDV-SubmitAnother", AI = false)
	public WebElement lnkSubmitAnother;

	@IFindBy(how = How.CSS, using = "#JobComplete-JobCompleteScreen-JobCompleteDV-ReviewChanges", AI = false)
	public WebElement lnkReviewChanges;

	@IFindBy(how = How.CSS, using = "#JobComplete-JobCompleteScreen-ttlBar", AI = false)
	public WebElement lblTtlBar;
			
	@IFindBy(how = How.XPATH, using = "//div[@id='JobComplete-JobCompleteScreen-JobCompleteDV-ViewPolicy_Input']//ancestor::div[@id='JobComplete-JobCompleteScreen-JobCompleteDV-ViewPolicy']", AI = false)
	public WebElement lnkViewPolicy;//div[id$='ViewPolicy']

	@IFindBy(how = How.CSS, using = "#JobComplete-JobCompleteScreen-JobCompleteDV-SubmissionManager", AI = false)
	public WebElement lnkSubmissionManager;

	public PolicyBoundPage(){
	}

	public PolicyBoundPage(WebDriver driver){
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, Utils.maxElementWait);
		PageFactory.initElements(finder, this);
		elementLayer = new ElementLayer(driver);
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


	public PolicyBoundPage clickResolveWithFutureBoundPeriods(WebDriver driver)  {
		BrowserActions.click(driver, lnkResolveWithFutureBoundPeriods,"ResolveWithFutureBoundPeriods");
		return this;
	}
	public PolicyBoundPage clickResolveWithFutureUnboundPeriods(WebDriver driver)  {
		BrowserActions.click(driver, lnkResolveWithFutureUnboundPeriods,"ResolveWithFutureUnboundPeriods");
		return this;
	}
	public PolicyBoundPage clickPrintBinder(WebDriver driver)  {
		BrowserActions.click(driver, btnPrintBinder,"PrintBinder");
		return this;
	}
	public PolicyBoundPage clickReturnToDesktop(WebDriver driver)  {
		BrowserActions.click(driver, lnkReturnToDesktop,"ReturnToDesktop");
		return this;
	}
	public PolicyBoundPage clickViewJob(WebDriver driver)  {
		BrowserActions.click(driver, lnkViewJob,"ViewJob");
		return this;
	}
	public PolicyBoundPage clickSubmitAnother(WebDriver driver)  {
		BrowserActions.click(driver, lnkSubmitAnother,"SubmitAnother");
		return this;
	}
	public PolicyBoundPage clickReviewChanges(WebDriver driver)  {
		BrowserActions.click(driver, lnkReviewChanges,"ReviewChanges");
		return this;
	}
	public PolicyBoundPage clickViewPolicy(WebDriver driver)  {
		BrowserActions.click(driver, lnkViewPolicy,true,0.5,"ViewPolicy");
		return this;
	}
	public SubmissionManagerPage clickSubmissionManager(WebDriver driver)  {
		BrowserActions.click(driver, lnkSubmissionManager,"SubmissionManager");
		return new SubmissionManagerPage(driver).get();
	}


}


