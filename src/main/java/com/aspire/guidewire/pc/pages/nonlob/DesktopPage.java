package com.aspire.guidewire.pc.pages.nonlob;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
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

public class DesktopPage  extends LoadableComponent<DesktopPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	public List<Object> pageFactoryKey = new ArrayList<Object>();
	public List<String> pageFactoryValue = new ArrayList<String>();
	
	@IFindBy(how = How.CSS, using = "div[id$='SummaryScreen-ttlBar']", AI = false)
	public WebElement ttlSummary;

    @IFindBy(how = How.CSS, using = "div[id$='DesktopTab-Desktop_Underwriter_MySummary']", AI = false)
    public WebElement lnkMySummary;

    @IFindBy(how = How.CSS, using = "div[id$='DesktopTab-Desktop_DesktopActivities']", AI = false)
    public WebElement lnkMyActivities;

    @IFindBy(how = How.CSS, using = "div[id$='DesktopTab-Desktop_DesktopAccounts']", AI = false)
    public WebElement lnkMyAccounts;

    @IFindBy(how = How.CSS, using = "div[id$='DesktopTab-Desktop_DesktopSubmissions']", AI = false)
    public WebElement lnkMySubmissions;
    
    @IFindBy(how = How.CSS, using = "div[id$='DesktopTab-Desktop_DesktopRenewals']", AI = false)
    public WebElement lnkMyRenewals;
    
    @IFindBy(how = How.CSS, using = "div[id$='DesktopTab-Desktop_DesktopOtherWorkOrders']", AI = false)
    public WebElement lnkOtherPolicyTransactions;
    
    @IFindBy(how = How.CSS, using = "div[id$='TabBar-DesktopTab'] div[class$='expand-button']", AI = false)
    public WebElement btnDesktopToggle;
    
    @IFindBy(how = How.CSS, using = "div[id='TabBar-DesktopTab-Desktop_DesktopActivities']", AI = false)
    public WebElement btnMyActivities;

	public	String activitiesList ="tr[id^='DesktopActivities-DesktopActivitiesScreen-DesktopActivities']";

    
	public DesktopPage() {}

	public DesktopPage(WebDriver driver){
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

		if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, ttlSummary))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}
		elementLayer = new ElementLayer(driver);
	}// isLoaded

	
	public void verifyMySummarySubMenu(WebDriver driver) {
		BrowserActions.verifyElementDisplayed(driver, lnkMySummary, "Tab My Summary");
	}
	
	public void verifyMyActivitiesSubMenu(WebDriver driver) {
		BrowserActions.verifyElementDisplayed(driver, lnkMyActivities, "Tab My Activities");
	}
	
	public void verifyMyRenewalsSubMenu(WebDriver driver) {
		BrowserActions.verifyElementDisplayed(driver, lnkMyRenewals, "Tab My Renewals");
	}
	
	public void verifyMySubmissionsSubMenu(WebDriver driver) {
		BrowserActions.verifyElementDisplayed(driver, lnkMySubmissions, "Tab My Submissions");
	}
	
	public void verifyOtherPolicyTransactionsSubMenu(WebDriver driver) {
		BrowserActions.verifyElementDisplayed(driver, lnkOtherPolicyTransactions, "Tab Other Policy Transactions");
	}
	
	public void clickDesktopToggle(WebDriver driver) {
		BrowserActions.click(driver, btnDesktopToggle, "Desktop Toggle Button");
	}
	public void clickMyActivities(WebDriver driver) {
		BrowserActions.click(driver, btnMyActivities,true, "My activities");
	}
	
	/**
	 * verify all the Activity were Listed
	 * @author Vignesh
	 * @param driver
	 */
	public void verifyActivitiesListed(WebDriver driver) {
		BrowserActions.waitForElementToDisplay(driver, btnDesktopToggle);
		List<WebElement> activities = driver.findElements(By.cssSelector(activitiesList));
		int activitiesCount = activities.size();
		Log.softAssertThat(activitiesCount >1, "Activities are Listed", "Activities are not Listed");
	}
}


