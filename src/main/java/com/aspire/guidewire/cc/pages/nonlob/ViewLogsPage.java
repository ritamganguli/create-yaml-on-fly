package com.aspire.guidewire.cc.pages.nonlob;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
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
import com.aspire.guidewire.utils.WaitUtils;
import com.aspire.guidewire.webdriverManager.DriverManager;

import ASPIREAI.customfactories.AjaxElementLocatorFactory;
import ASPIREAI.customfactories.IFindBy;
import ASPIREAI.customfactories.PageFactory;

public class ViewLogsPage extends LoadableComponent<ViewLogsPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
 	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
	//public TopNavBar topnavbar;
	@IFindBy(how = How.CSS, using = "input[name='ViewLogs-ViewLogsScreen-LogFilter']", AI = false)
	private WebElement inpFiltergrep;

	@IFindBy(how = How.CSS, using = "#ViewLogs-ViewLogsScreen-ttlBar", AI = false)
	private WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "select[name='ViewLogs-ViewLogsScreen-LogFile']", AI = false)
	private WebElement drpLogFile;

	@IFindBy(how = How.CSS, using = "#ViewLogs-ViewLogsScreen-StreamLogs>div[role='button']", AI = false)
	private WebElement btnStreamLogs;

	@IFindBy(how = How.CSS, using = "#ViewLogs-ViewLogsScreen-LogDisplay textarea", AI = false)
	private WebElement inpLogDisplay;

	@IFindBy(how = How.CSS, using = "#ViewLogs-ViewLogsScreen-ViewLogs>div[role='button']", AI = false)
	private WebElement btnViewLogs;

	@IFindBy(how = How.CSS, using = "input[name='ViewLogs-ViewLogsScreen-MaxLines']", AI = false)
	private WebElement inpMaxLinesToDisplaytail;
	
	@IFindBy(how = How.CSS, using = "div[id$='ViewLogsScreen-LogDisplay']", AI = false)
	private WebElement lblLog;
	
	@IFindBy(how = How.XPATH, using = "//body[contains(@onload,'requestLogLines')]//pre", AI = false)
	public WebElement infoLogs;
	
	@IFindBy(how = How.CSS, using = "div[id$='ViewLogsScreen-LogDisplay']", AI = false)
	private WebElement lblLogs;


	public ViewLogsPage(){
	}

	public ViewLogsPage(WebDriver driver){
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
}public ViewLogsPage enterFiltergrep(WebDriver driver,String Filtergrep) {
		            BrowserActions.type(driver, inpFiltergrep,Filtergrep, "Filtergrep");
		            Log.messageStep("Calender Button is Clicked to view Details of Calenders",DriverManager.getDriver());
			        return this;
           }
public ViewLogsPage selectLogFile(WebDriver driver,String LogFile)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpLogFile,LogFile,1,"LogFile");
					Log.messageStep("Log File field is selected as "+LogFile,DriverManager.getDriver());
				    return this;
			}
public ViewLogsPage clickStreamLogs(WebDriver driver)  {
					BrowserActions.click(driver, btnStreamLogs,"StreamLogs");
				    return this;
			}
public ViewLogsPage enterLogDisplay(WebDriver driver,String LogDisplay) {
		            BrowserActions.type(driver, inpLogDisplay,LogDisplay, "LogDisplay");
			        return this;
           }
public ViewLogsPage clickViewLogs(WebDriver driver)  {
					BrowserActions.click(driver, btnViewLogs,"ViewLogs");
				    return this;
			}
public ViewLogsPage enterMaxLinesToDisplaytail(WebDriver driver,String MaxLinesToDisplaytail) {
		            BrowserActions.type(driver, inpMaxLinesToDisplaytail,MaxLinesToDisplaytail,1, "MaxLinesToDisplaytail");
			        return this;
           }

public ViewLogsPage verifyLogDetails(WebDriver driver) {
	BrowserActions.verifyElementDisplayed(driver, lblLog, "Log Details");
	Log.messageStep("Details of Log were Displayed Successfully",DriverManager.getDriver());
	return this;
}
public ViewLogsPage verifyStreamLogsInChildWindow(WebDriver driver) {
	BrowserActions.windowHandles(driver, "Test");
	return this;
}

public ViewLogsPage verifyLogDetailsWithDate(WebDriver driver,String date) throws ParseException {
	if (date.matches("^cclog\\.log\\.\\d{4}-\\d{2}-\\d{2}$")) {
	    String[] parts = date.split("\\.");
	    String dateInFilename = parts[1];

	    By viewLogBy = By.xpath("//div[@class='gw-value-readonly-wrapper']");
	    BrowserActions.waitForElementToDisplay(driver, viewLogBy, "name check box");
	    WebElement viewLog = viewLogBy.findElement(driver);
	    String filename = viewLog.getText();
	   BrowserActions.waitForElementToDisplay(driver, viewLog);
	    if(filename.contains(dateInFilename))
{
	        System.out.println("Dates match");
	    } else {
	        System.out.println("Dates do not match");
	    }
	} else {
	    System.out.println("Invalid date format: " + date);
	}


	return this;
}

}
