package com.aspire.guidewire.pc.pages.nonlob;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.testng.Assert;

import com.aspire.guidewire.pc.teststeps.nonlob.DataFakers;
import com.aspire.guidewire.utils.BrowserActions;
import com.aspire.guidewire.utils.ElementLayer;
import com.aspire.guidewire.utils.Log;
import com.aspire.guidewire.utils.WaitUtils;

import ASPIREAI.customfactories.AjaxElementLocatorFactory;
import ASPIREAI.customfactories.IFindBy;
import ASPIREAI.customfactories.PageFactory;

public class TestingSystemClockPage extends LoadableComponent<TestingSystemClockPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	@IFindBy(how = How.CSS, using = "#SystemClock-SystemClockScreen-Date_dateIcon", AI = false)
	public WebElement btnDateDateIcon;

	@IFindBy(how = How.CSS, using = "#SystemClock-SystemClockScreen-AddHour>div[role='button']", AI = false)
	public WebElement btnAddHour;

	@IFindBy(how = How.CSS, using = "#SystemClock-SystemClockScreen-InClusterAlert-CloseBtn", AI = false)
	public WebElement btnClose_1;

	@IFindBy(how = How.CSS, using = "#SystemClock-SystemClockScreen-AddYear>div[role='button']", AI = false)
	public WebElement btnAddYear;

	@IFindBy(how = How.CSS, using = "input[name='SystemClock-SystemClockScreen-Date']", AI = false)
	public WebElement inpDate;

	@IFindBy(how = How.CSS, using = "#SystemClock-SystemClockScreen-ChangeDate>div[role='button']", AI = false)
	public WebElement btnChangeDate;

	@IFindBy(how = How.CSS, using = "#SystemClock-SystemClockScreen-AddWeek>div[role='button']", AI = false)
	public WebElement btnAddWeek;

	@IFindBy(how = How.CSS, using = "#SystemClock-SystemClockScreen-AddMinute>div[role='button']", AI = false)
	public WebElement btnAddMinute;

	@IFindBy(how = How.CSS, using = "#SystemClock-SystemClockScreen-AddDay>div[role='button']", AI = false)
	public WebElement btnAddDay;

	@IFindBy(how = How.CSS, using = "#SystemClock-SystemClockScreen-AddMonth>div[role='button']", AI = false)
	public WebElement btnAddMonth;

	@IFindBy(how = How.CSS, using = "#SystemClock-SystemClockScreen-NotEnabledAlert-CloseBtn", AI = false)
	public WebElement btnClose;

	@IFindBy(how = How.CSS, using = "#SystemClock-SystemClockScreen-InClusterAlert .gw-AlertBar--label", AI = false)
	public WebElement lblInClusterAlert;

	@IFindBy(how = How.CSS, using = "#SystemClock-SystemClockScreen-NotEnabledAlert .gw-AlertBar--label", AI = false)
	public WebElement lblNotEnabledAlert;

	@IFindBy(how = How.CSS, using = "#SystemClock-SystemClockScreen-ttlBar", AI = false)
	public WebElement lblTtlBar;

	public TestingSystemClockPage(){
	}

	public TestingSystemClockPage(WebDriver driver) throws Exception{
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
	}public TestingSystemClockPage clickDateDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnDateDateIcon,"DateDateIcon");
		return this;
	}
	public TestingSystemClockPage clickAddHour(WebDriver driver)  {
		BrowserActions.click(driver, btnAddHour,"AddHour");
		return this;
	}
	public TestingSystemClockPage clickClose_1(WebDriver driver)  {
		BrowserActions.click(driver, btnClose_1,"Close_1");
		return this;
	}
	public TestingSystemClockPage clickAddYear(WebDriver driver)  {
		BrowserActions.click(driver, btnAddYear,"AddYear");
		return this;
	}
	public TestingSystemClockPage enterDate(WebDriver driver,String Date) {
		BrowserActions.type(driver, inpDate,Date, "Date");
		return this;
	}
	public TestingSystemClockPage clickChangeDate(WebDriver driver)  {
		BrowserActions.click(driver, btnChangeDate,"ChangeDate");
		return this;
	}
	public TestingSystemClockPage clickAddWeek(WebDriver driver)  {
		BrowserActions.click(driver, btnAddWeek,"AddWeek");
		return this;
	}
	public TestingSystemClockPage clickAddMinute(WebDriver driver)  {
		BrowserActions.click(driver, btnAddMinute,"AddMinute");
		return this;
	}
	public TestingSystemClockPage clickAddDay(WebDriver driver)  {
		BrowserActions.click(driver, btnAddDay,"AddDay");
		return this;
	}
	public TestingSystemClockPage clickAddMonth(WebDriver driver)  {
		BrowserActions.click(driver, btnAddMonth,"AddMonth");
		return this;
	}
	public TestingSystemClockPage clickClose(WebDriver driver)  {
		BrowserActions.click(driver, btnClose,"Close");
		return this;
	}
	
	/**
	 * verify current date
	 * @param driver
	 * @return
	 */
	public void verifyCurrentDate(WebDriver driver) {
		String date = inpDate.getAttribute("value");
		Log.assertThat(date.equals(DataFakers.currentDate()), "Current Date is Displayed",  "Current Date is not Displayed");
	}

}
