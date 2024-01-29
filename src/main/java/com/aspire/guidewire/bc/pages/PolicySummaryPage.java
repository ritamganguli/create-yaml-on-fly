package com.aspire.guidewire.bc.pages;
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

public class PolicySummaryPage extends LoadableComponent<PolicySummaryPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
	//	public TopNavBar topnavbar;
	//	public AccountSummaryScreen accountsummaryscreenTable;

	@IFindBy(how = How.CSS, using = "div[id='PolicySummary-PolicySummaryScreen-ttlBar']", AI = false)
	private WebElement ttlPolicySummary;
	
	@IFindBy(how = How.CSS, using = "div[id='PolicySummary-PolicySummaryScreen-StartDelinquencyButton']", AI = false)
	private WebElement btnStartDelinquency;
	
	@IFindBy(how = How.CSS, using = "div[id='PolicySummary-PolicySummaryScreen-PolicyDetailSummary_DelinquencyAlertAlertBar-label']", AI = false)
	private WebElement lblDeliquency;
	
	public PolicySummaryPage(){
	}

	public PolicySummaryPage(WebDriver driver){
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(finder, this);
		//		accountsummaryscreenTable = new AccountSummaryScreen();
	}
	@Override
	protected void load() {
		isPageLoaded = true;
		WaitUtils.waitForPageLoad(driver);
	}@Override
	protected void isLoaded() {
		if (!isPageLoaded) {
			Assert.fail();
		}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, ttlPolicySummary))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);
		
	}
	public PolicySummaryPage clickStartDelinquency(WebDriver driver)  {
		BrowserActions.click(driver, btnStartDelinquency,"StartDelinquency");
		return this;
	}
	public PolicySummaryPage clickDeliquency(WebDriver driver)  {
		BrowserActions.click(driver, lblDeliquency,"Deliquncy lable");
		return this;
	}
	
}
