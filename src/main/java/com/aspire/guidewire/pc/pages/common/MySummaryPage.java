package com.aspire.guidewire.pc.pages.common;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.testng.Assert;

import com.aspire.guidewire.pc.pages.nonlob.SearchPoliciesPage;
import com.aspire.guidewire.utils.BrowserActions;
import com.aspire.guidewire.utils.ElementLayer;
import com.aspire.guidewire.utils.Log;
import com.aspire.guidewire.utils.Utils;
import com.aspire.guidewire.utils.WaitUtils;

import ASPIREAI.customfactories.AjaxElementLocatorFactory;
import ASPIREAI.customfactories.IFindBy;
import ASPIREAI.customfactories.PageFactory;

public class MySummaryPage extends LoadableComponent<MySummaryPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	@IFindBy(how = How.CSS, using = "div[data-gw-click$='Activities']", AI = false)
	public WebElement lnkActivities;
	
	@IFindBy(how = How.CSS, using = "div[id='gw-center-title-toolbar']>div[id$='Summary-ttlBar']", AI = false)
	public WebElement lblTtlBarMySummary;
	
	@IFindBy(how = How.CSS, using = "div[data-gw-click$='Submissions']", AI = false)
	public WebElement lnkSubmissions;

	@IFindBy(how = How.CSS, using = "div[data-gw-click$='ChangeRequests']", AI = false)
	public WebElement lnkChangeRequests;

	@IFindBy(how = How.CSS, using = "div[data-gw-click$='Renewals']", AI = false)
	public WebElement lnkRenewals;

	@IFindBy(how = How.CSS, using = "div[data-gw-click$='Cancellations']", AI = false)
	public WebElement lnkCancellations;

	@IFindBy(how = How.CSS, using = "select[name$='ActivitiesListViewTile_LV-activitiesFilter']", AI = false)
	public WebElement drpMyActivities;

	@IFindBy(how = How.CSS, using = "select[name$='submissionsFilter']", AI = false)
	public WebElement drpMySubmissions;

	@IFindBy(how = How.CSS, using = "select[name$='renewalsFilter']", AI = false)
	public WebElement drpRenewals;

	@IFindBy(how = How.CSS, using = "select[name$='workOrdersFilter']", AI = false)
	public WebElement drpOtherPolicyTransactions;

	@IFindBy(how = How.CSS, using = "div[class^='gw-ViewMore']", AI = false)
	public WebElement lnkViewMore;

	@IFindBy(how = How.CSS, using = "div[id$='MenuActions'] div", AI = false)
	public WebElement btnActions;
	
	@IFindBy(how = How.CSS, using = "div[id='TabBar-AdminTab']", AI = false)
	public WebElement tabAdministration;
	
	@IFindBy(how = How.CSS, using = "div[id=TabBar-SearchTab]", AI = false)
	public WebElement btnSearch;
	
	public MySummaryPage() {}

	public MySummaryPage(WebDriver driver){
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, Utils.maxElementWait);
		PageFactory.initElements(finder, this);
		elementLayer = new ElementLayer(driver);
	}

	public MySummaryPage(WebDriver driver,int timeout){
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, timeout);
		PageFactory.initElements(finder, this);
		elementLayer = new ElementLayer(driver);
	}

	@Override
	protected void load() {
		isPageLoaded = true;
		WaitUtils.waitForPageLoad(driver);
	}// load`

	@Override
	protected void isLoaded() {
		if (!isPageLoaded) {
			Assert.fail();
		}

		if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, lblTtlBarMySummary))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}
		elementLayer = new ElementLayer(driver);
	}// isLoaded
	
	/**
	 * Clicks on  Actions
	 * @author vignesh.ravi
	 * @param driver
	 * @return 
	 * @throws InterruptedException 
	 * @
	 */
	public ActionsPage clickActions(WebDriver driver)  {
		BrowserActions.click(driver, btnActions,0.5,"Actions button");
		return new ActionsPage(driver).get();
	}
	public SearchPoliciesPage clickSearch(WebDriver driver)  {
		BrowserActions.click(driver, btnSearch,0.5,"Search");
		return new SearchPoliciesPage(driver).get();
	}
	
}
	

