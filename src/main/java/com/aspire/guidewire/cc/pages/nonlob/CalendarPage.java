package com.aspire.guidewire.cc.pages.nonlob;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
import com.aspire.guidewire.webdriverManager.DriverManager;

import ASPIREAI.customfactories.AjaxElementLocatorFactory;
import ASPIREAI.customfactories.IFindBy;
import ASPIREAI.customfactories.PageFactory;

public class CalendarPage extends LoadableComponent<CalendarPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
 	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
	//public TopNavBar topnavbar;
	@IFindBy(how = How.CSS, using = "div[id$='CalendarScreen-ttlBar']", AI = false)
	private WebElement lblTtlBar;
	
	@IFindBy(how = How.CSS, using = "div[class$='gw-CalendarMonth--header--title']", AI = false)
	public WebElement lblcurrentMonth;
	
	@IFindBy(how = How.CSS, using = "div[class$='gw-CalendarTopNavigation--JumpTo gw-ValueWidget']", AI = false)
	public WebElement lblJumpTo;
	
	@IFindBy(how = How.CSS, using = "select[id$='1_matterFilter']", AI = false)
	public WebElement lblShowfilter;
	
	@IFindBy(how = How.CSS, using = "select[id$='1_activityFilter']", AI = false)
	public WebElement lblActivityfilter;
	
	@IFindBy(how = How.CSS, using = "select[id$='1_priorityFilter']", AI = false)
	public WebElement lblPriorityfilter;
	
	@IFindBy(how = How.CSS, using = "select[id$='1_groupFilter']", AI = false)
	public WebElement lblGroupfilter;

	public CalendarPage(){
	}

	public CalendarPage(WebDriver driver) {
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
		}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, lblTtlBar))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);
}
	
	public CalendarPage verifyCurrentMonthYear(WebDriver driver){
		LocalDate currentDate = LocalDate.now(); 
		int year = currentDate.getYear();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM");
		String month = currentDate.format(formatter);
		String currentMonthYear=month+" "+year;
		BrowserActions.verifyElementTextIsDisplayed(driver, lblcurrentMonth, currentMonthYear,true ,"Calendar- year and month");
		return this;
	}
	
	public CalendarPage verifyJumpTo(WebDriver driver){
		BrowserActions.verifyElementDisplayed(driver, lblJumpTo, "Jump To filter");
		return this;
	}
	
	public CalendarPage verifyShowFilter(WebDriver driver){
		BrowserActions.verifyElementDisplayed(driver, lblShowfilter, "Show filter");
		return this;
	}
	
	public CalendarPage verifyActivityFilter(WebDriver driver){
		BrowserActions.verifyElementDisplayed(driver, lblActivityfilter, "Activity filter");
		Log.messageStep("Details of Calender page were Displayed Successfully",DriverManager.getDriver());
		return this;
	}
	
	public CalendarPage verifyPriorityFilter(WebDriver driver){
		BrowserActions.verifyElementDisplayed(driver, lblPriorityfilter, "Priority filter");
		return this;
	}
	
	public CalendarPage verifyGroupFilter(WebDriver driver){
		BrowserActions.verifyElementDisplayed(driver, lblGroupfilter, "Group filter");
		return this;
	}



}
