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

public class MyTroubleTicketsPage extends LoadableComponent<MyTroubleTicketsPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
 	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
//	public TopNavBar topnavbar;
	@IFindBy(how = How.CSS, using = "select[name='DesktopTroubleTickets-DesktopTroubleTicketsScreen-DesktopTroubleTicketsLV-Filter']", AI = false)
	private WebElement drpFilter;

	@IFindBy(how = How.CSS, using = "#DesktopTroubleTickets-DesktopTroubleTicketsScreen-DesktopTroubleTicketsLV_tb-DesktopTroubleTickets_CloseButton>div[role='button']", AI = false)
	private WebElement btnClose;

	@IFindBy(how = How.CSS, using = "#DesktopTroubleTickets-DesktopTroubleTicketsScreen-DesktopTroubleTicketsLV_tb-NewTroubleTicket>div[role='button']", AI = false)
	private WebElement btnNew;

	@IFindBy(how = How.CSS, using = "select[name='DesktopTroubleTickets-DesktopTroubleTicketsScreen-DesktopTroubleTicketsLV-Filter']", AI = false)
	private WebElement drpFilter_1;

	@IFindBy(how = How.CSS, using = "#DesktopTroubleTickets-DesktopTroubleTicketsScreen-DesktopTroubleTicketsLV_tb-DesktopTroubleTickets_AssignButton>div[role='button']", AI = false)
	private WebElement btnAssign;

	public MyTroubleTicketsPage(){
	}

	public MyTroubleTicketsPage(WebDriver driver) throws Exception{
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
		}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, btnAssign))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);
}public MyTroubleTicketsPage selectFilter(WebDriver driver,String Filter)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpFilter,Filter,"Filter");
				    return this;
			}
public MyTroubleTicketsPage clickClose(WebDriver driver)  {
					BrowserActions.click(driver, btnClose,"Close");
				    return this;
			}
public MyTroubleTicketsPage clickNew(WebDriver driver)  {
					BrowserActions.click(driver, btnNew,"New");
				    return this;
			}
public MyTroubleTicketsPage selectFilter_1(WebDriver driver,String Filter_1)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpFilter_1,Filter_1,"Filter_1");
				    return this;
			}
public MyTroubleTicketsPage clickAssign(WebDriver driver)  {
					BrowserActions.click(driver, btnAssign,"Assign");
				    return this;
			}
}
