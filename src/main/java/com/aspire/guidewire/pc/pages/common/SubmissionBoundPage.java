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

public class SubmissionBoundPage  extends LoadableComponent<SubmissionBoundPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	@IFindBy(how = How.CSS, using = "div[id$='JobCompleteScreen']", AI = false)
	public WebElement ttlPolicyBoundPage;

	@IFindBy(how = How.CSS, using = "div[id$='ViewJob']", AI = false)
	public WebElement lnkViewSubmission;

	@IFindBy(how = How.CSS, using = "div[id$='ReviewChanges']", AI = false)
	public WebElement lnkReviweChanges;

	@IFindBy(how = How.CSS, using = "div[id$='ReturnToDesktop']", AI = false)
	public WebElement lnkGotoYourDesktop;
	
	@IFindBy(how = How.CSS, using = "div[id$='JobCompleteScreen-Message']", AI = false)
	public WebElement lnkSubmissionWithdrawn;
	
	public SubmissionBoundPage() {}

	public SubmissionBoundPage(WebDriver driver){
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

		if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, ttlPolicyBoundPage))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}
		elementLayer = new ElementLayer(driver);
	}// isLoaded

	/**####################################################################################################
	#################### FW UPDATE ##########################################################################*/
	
	/**
	 * click View Policy
	 * @author charu.anbarasan
	 * @param driver
	 * @return
	 */
	public PolicySummaryPage clickViewSubmission(WebDriver driver) {
		BrowserActions.click(driver, lnkViewSubmission, "submission policy");
		return new PolicySummaryPage(driver).get();
	}
	
	/**####################################################################################################
	#################### FW UPDATE ##########################################################################*/
	
}
