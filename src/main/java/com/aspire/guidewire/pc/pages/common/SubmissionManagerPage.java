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

public class SubmissionManagerPage extends LoadableComponent<SubmissionManagerPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	@IFindBy(how = How.CSS, using = "div[id^='SubmissionManager']", AI = false)
	public WebElement ttlSubmissionManager;
	
	@IFindBy(how = How.CSS, using = "div[id$='SubmissionNumber']", AI = false)
	public WebElement lblSubmissionNumber;
	
	@IFindBy(how = How.CSS, using = "div[id$='QuoteType']", AI = false)
	public WebElement lblQuoteType;
	
	@IFindBy(how = How.CSS, using = "div[id$='EffectiveDate']", AI = false)
	public WebElement lblEffectiveDate;
	
	@IFindBy(how = How.CSS, using = "div[id*='SubmissionManagerLV-0-Status']", AI = false)
	public WebElement lblstatus;
	
	@IFindBy(how = How.CSS, using = "div[id$='ConfirmLetter']", AI = false)
	public WebElement btnCreateConfirmation;
	
	@IFindBy(how = How.CSS, using = "div[id$='Update']", AI = false)
	public WebElement btnGenerateConfirmation;
	
	@IFindBy(how = How.CSS, using = "span[aria-label='document_confirm']", AI = false)
	public WebElement icnTickMark;
	
	@IFindBy(how = How.XPATH, using = "//div[text()='Return to Submission Manager']", AI = false)
	public WebElement returnToSubmissionManager;
	
					 
	public SubmissionManagerPage() {}

	public SubmissionManagerPage(WebDriver driver){
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

		if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, ttlSubmissionManager))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}
		elementLayer = new ElementLayer(driver);
	}// isLoaded
	
	/**
	 * @author charu.anbarasan
	 * click create confirmation button
	 * @param driver
	 */
	public void clickCreateConfirmation(WebDriver driver) {
		BrowserActions.click(driver, btnCreateConfirmation,"create confirmation button");
	}
	
	/**
	 * @author charu.anbarasan
	 * click Return to submission manager page
	 * @param driver
	 */
	public void clickReturnToSubmissionManager(WebDriver driver) {
		BrowserActions.click(driver, returnToSubmissionManager,"Return to Submission manager");
	}
	
	/**
	 * @author charu.anbarasan
	 * click tick mark icon 
	 * @param driver
	 */
	public void clickTickMark(WebDriver driver) {
		BrowserActions.click(driver, icnTickMark,"tick mark icon");
	}
	
	public class ConfirmationLetter extends LoadableComponent<ConfirmationLetter> {

		WebDriver driver;
		private boolean isPageLoaded;
		public ElementLayer elementLayer;
		public List<Object> pageFactoryKey = new ArrayList<Object>();
		public List<String> pageFactoryValue = new ArrayList<String>();
		
		@IFindBy(how = How.CSS, using = "div[id$='Update']", AI = false)
		public WebElement btnGenerateConfirmation;
						 
		@IFindBy(how = How.CSS, using = "input[name$='0-_Checkbox']", AI = false)
		public WebElement chkPolicy;
		
		public ConfirmationLetter() {}

		public ConfirmationLetter(WebDriver driver){
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

			if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, ttlSubmissionManager))) {
				Log.fail("Page did not open up. Site might be down.", driver);
			}
			elementLayer = new ElementLayer(driver);
		}// isLoaded
		
		
		/**
		 * @author charu.anbarasan
		 * click Generate confirmation button
		 * @param driver
		 */
		public void clickGenerateConfirmation(WebDriver driver) {
			BrowserActions.click(driver, btnGenerateConfirmation,"Generate confirmation button");
		}
		/**
		 * @author charu.anbarasan
		 * click policy checkbox
		 * @param driver
		 */
		public ConfirmationLetter clickPolicyCheckbox(WebDriver driver) {
			BrowserActions.click(driver, chkPolicy,"Policy checkbox");
			return this;
		}
		
		/**
		 * @author charu.anbarasan
		 * click Return to submission manager page
		 * @param driver
		 */
		public void clickReturnToSubmissionManager(WebDriver driver) {
			BrowserActions.click(driver, returnToSubmissionManager,"Return to Submission manager");
		}
		
		/**
		 * @author charu.anbarasan
		 * click tick mark icon 
		 * @param driver
		 */
		public void clickTickMark(WebDriver driver) {
			BrowserActions.click(driver, icnTickMark,"tick mark icon");
		}
	
	}
}
