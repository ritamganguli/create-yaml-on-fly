package com.aspire.guidewire.bc.pages;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.aspire.guidewire.utils.BrowserActions;
import com.aspire.guidewire.utils.ElementLayer;
import com.aspire.guidewire.utils.Log;
import com.aspire.guidewire.utils.WaitUtils;

import ASPIREAI.customfactories.AjaxElementLocatorFactory;
import ASPIREAI.customfactories.IFindBy;
import ASPIREAI.customfactories.PageFactory;

public class MyActivitiesPage extends LoadableComponent<MyActivitiesPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
	//	public TopNavBar topnavbar;
	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-DesktopActivitiesFilter']", AI = false)
	private WebElement drpDesktopActivitiesFilter;

	@IFindBy(how = How.CSS, using = "#DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV_tb-DesktopActivities_AssignButton>div[role='button']", AI = false)
	private WebElement btnAssign;

	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-DesktopActivitiesFilter']", AI = false)
	private WebElement drpDesktopActivitiesFilter_1;

	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-ActivityPattern']", AI = false)
	private WebElement drpActivityPattern;

	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-DesktopOwnerFilter']", AI = false)
	private WebElement drpDesktopOwnerFilter;

	@IFindBy(how = How.CSS, using = "select[name='DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV-ActivityPattern']", AI = false)
	private WebElement drpActivityPattern_3;

	@IFindBy(how = How.CSS, using = "#DesktopActivities-DesktopActivitiesScreen-DesktopActivitiesLV_tb-DesktopActivities_CompleteButton>div[role='button']", AI = false)
	private WebElement btnComplete;
	
	@IFindBy(how = How.CSS, using = "div[id$='CreateDateHeader']", AI = false)
	private WebElement lblOpened;
	
	@IFindBy(how = How.CSS, using = "div[id$='DueDateHeader']", AI = false)
	private WebElement lblDue;
	
	@IFindBy(how = How.CSS, using = "div[id$='PriorityHeader_inner']", AI = false)
	private WebElement lblPriority;
	
	@IFindBy(how = How.CSS, using = "div[id$='StatusHeader_inner']", AI = false)
	private WebElement lblStatus;
	
	@IFindBy(how = How.CSS, using = "div[id$='SubjectHeader_inner']", AI = false)
	private WebElement lblSubject;
	
	@IFindBy(how = How.CSS, using = "div[id$='TroubleTicketNumberHeader_inner']", AI = false)
	private WebElement lblTroubleTicket;
	
	@IFindBy(how = How.CSS, using = "div[id$='DesktopActivitiesLV_columnsMenu']", AI = false)
	private WebElement drpColumnMenu;

	public MyActivitiesPage(){
	}

	public MyActivitiesPage(WebDriver driver) {
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(finder, this);
	}
	@Override
	protected void load() {
		isPageLoaded = true;
		WaitUtils.waitForPageLoad(driver);
	}@Override
	protected void isLoaded() {
		if (!isPageLoaded) {
			Assert.fail();
		}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, btnComplete))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);
	}public MyActivitiesPage selectDesktopActivitiesFilter(WebDriver driver,String DesktopActivitiesFilter)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpDesktopActivitiesFilter,DesktopActivitiesFilter,"DesktopActivitiesFilter");
		return this;
	}
	public MyActivitiesPage clickAssign(WebDriver driver)  {
		BrowserActions.click(driver, btnAssign,"Assign");
		return this;
	}
	public MyActivitiesPage selectDesktopActivitiesFilter_1(WebDriver driver,String DesktopActivitiesFilter_1)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpDesktopActivitiesFilter_1,DesktopActivitiesFilter_1,"DesktopActivitiesFilter_1");
		return this;
	}
	
	public MyActivitiesPage selectActivityPattern(WebDriver driver,String ActivityPattern)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpActivityPattern,ActivityPattern,"ActivityPattern");
		return this;
	}
	public MyActivitiesPage selectDesktopOwnerFilter(WebDriver driver,String DesktopOwnerFilter)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpDesktopOwnerFilter,DesktopOwnerFilter,"DesktopOwnerFilter");
		return this;
	}
	public MyActivitiesPage selectActivityPattern_3(WebDriver driver,String ActivityPattern_3)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpActivityPattern_3,ActivityPattern_3,"ActivityPattern_3");
		return this;
	}
	public MyActivitiesPage clickComplete(WebDriver driver)  {
		BrowserActions.click(driver, btnComplete,"Complete");
		return this;
	}
	public MyActivitiesPage verifyAssignButton(WebDriver driver)  {
		BrowserActions.waitForElementToDisplay(driver, btnAssign);
		return this;
	}
	public MyActivitiesPage verifyCompleteButton(WebDriver driver)  {
		BrowserActions.waitForElementToDisplay(driver, btnComplete);
		return this;
	}
	public MyActivitiesPage verifyOpenedTitle(WebDriver driver)  {
		BrowserActions.waitForElementToDisplay(driver, lblOpened);
		return this;
	}
	public MyActivitiesPage verifyDueTitle(WebDriver driver)  {
		BrowserActions.waitForElementToDisplay(driver, lblDue);
		return this;
	}
	public MyActivitiesPage verifyStatusTitle(WebDriver driver)  {
		BrowserActions.waitForElementToDisplay(driver, lblStatus);
		return this;
	}
	public MyActivitiesPage verifySubjectTitle(WebDriver driver)  {
		BrowserActions.waitForElementToDisplay(driver, lblSubject);
		return this;
	}
	public MyActivitiesPage verifyTroubleTicketTitle(WebDriver driver)  {
		BrowserActions.waitForElementToDisplay(driver, lblTroubleTicket);
		return this;
	}
	public MyActivitiesPage verifyPriorityTitle(WebDriver driver)  {
		BrowserActions.waitForElementToDisplay(driver, lblPriority);
		return this;
	}
	public MyActivitiesPage verifyColumnuMenu(WebDriver driver)  {
		BrowserActions.waitForElementToDisplay(driver, drpColumnMenu);
		return this;
	}
	public void verifyOptionsInDesktopFilter(WebDriver driver) {
		Select select = new Select(drpDesktopActivitiesFilter);
		List<WebElement> options = select.getOptions();
		List<String> optionsList= new ArrayList<String>();
		for (WebElement element : options) {
			String value = element.getText();
			optionsList.add(value);	
		}
		List<String> list= new ArrayList<String>();
		list.add("All open");
		list.add("Newly opened (this week)");
		list.add("Closed in last 30 days");
		list.add("Open urgent");
		list.add("Escalated");
		Log.assertThat(list.containsAll(optionsList), "all options are available in desktop filter","all options are  not available in desktop filter");
	}
	
	public void verifyOptionsInDesktopOwnerFilter(WebDriver driver) {
		Select select = new Select(drpDesktopOwnerFilter);
		List<WebElement> options = select.getOptions();
		List<String> optionsList= new ArrayList<String>();
		for (WebElement element : options) {
			String value = element.getText();
			optionsList.add(value);	
		}
		List<String> list= new ArrayList<String>();
		list.add("All");
		list.add("Owned");
		list.add("Shared");
		Log.assertThat(list.containsAll(optionsList), "all options are available in desktop owner filter","all options are  not available in desktop owner filter");
	}
	
	public void verifyOptionsInActivityPatternFilter(WebDriver driver) {
		Select select = new Select(drpActivityPattern);
		List<WebElement> options = select.getOptions();
		List<String> optionsList= new ArrayList<String>();
		for (WebElement element : options) {
			String value = element.getText();
			optionsList.add(value);	
		}
		List<String> list= new ArrayList<String>();
		list.add("All");
		list.add("Notification");
		list.add("Approval");
		list.add("Attempted Write-off");
		list.add("Retrieve from Archive Complete");
		list.add("Retrieve from Archive Failed");
		list.add("Personal Data Destruction Error");
		Log.assertThat(list.containsAll(optionsList), "all options are available in Activity filter","all options are  not available in Activity filter");
	}
}
