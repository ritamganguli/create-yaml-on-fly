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

public class RewriteRemainderTermPage extends LoadableComponent<RewriteRemainderTermPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	@IFindBy(how = How.CSS, using = "div[id$='RewriteWizard-RewriteWizard_DifferencesScreen-ttlBar']", AI = false)
	public WebElement ttlPolicyReview;
	
	@IFindBy(how = How.XPATH, using = "//div[text()='Rewrite Remainder of Term Bound']", AI = false)
	public WebElement ttlRewriteRemainderofTermBoundReview;

	@IFindBy(how = How.CSS, using = "div[id$='ViewPolicy']", AI = false)
	public WebElement lnkViewPolicy;
	
	public RewriteRemainderTermPage() {}

	public RewriteRemainderTermPage(WebDriver driver){
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

		if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, ttlPolicyReview))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}
		elementLayer = new ElementLayer(driver);
	}// isLoaded
	
	/**
	 * @author manikandan.manohar
	 * Verify that the submission has been Submission Rewrite Remainder of Term 
	 * @param driver,expectedMessage
	 * @throws InterruptedException 
	 */
	public void verifySubmissionRewriteRemainderofTerm(WebDriver driver)  {
		String submissionstatus = ttlRewriteRemainderofTermBoundReview.getText();
		Log.assertThat(submissionstatus.equals("Rewrite Remainder of Term Bound"), "Submission Rewrite Remainder of Term BOund", "Submission not Rewrite Remainder of Term");
	}

	/**
	 * @author manikandan.manohar
	 * Used to click on ViewPolicy
	 * @param driver
	 */
	public void clickViewPolicy(WebDriver driver) {
		BrowserActions.click(driver, lnkViewPolicy, "view policy");
	}

	
}
