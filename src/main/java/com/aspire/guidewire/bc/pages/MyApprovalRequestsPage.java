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

public class MyApprovalRequestsPage extends LoadableComponent<MyApprovalRequestsPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
 	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
//	public TopNavBar topnavbar;
	@IFindBy(how = How.CSS, using = "select[name='DesktopApprovals-DesktopApprovalsScreen-DesktopApprovalsLV-Filter']", AI = false)
	private WebElement drpFilter;

	@IFindBy(how = How.CSS, using = "select[name='DesktopApprovals-DesktopApprovalsScreen-DesktopApprovalsLV-Filter']", AI = false)
	private WebElement drpFilter_1;

	public MyApprovalRequestsPage(){
	}

	public MyApprovalRequestsPage(WebDriver driver) throws Exception{
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
		}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, drpFilter_1))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);
}public MyApprovalRequestsPage selectFilter(WebDriver driver,String Filter)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpFilter,Filter,"Filter");
				    return this;
			}
public MyApprovalRequestsPage selectFilter_1(WebDriver driver,String Filter_1)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpFilter_1,Filter_1,"Filter_1");
				    return this;
			}
}
