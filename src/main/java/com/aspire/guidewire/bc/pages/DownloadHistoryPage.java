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
import com.aspire.guidewire.webdriverManager.DriverManager;

import ASPIREAI.customfactories.AjaxElementLocatorFactory;
import ASPIREAI.customfactories.IFindBy;
import ASPIREAI.customfactories.PageFactory;

public class DownloadHistoryPage extends LoadableComponent<DownloadHistoryPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
 	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
//	public TopNavBar topnavbar;
	@IFindBy(how = How.CSS, using = "#BatchProcessDownloadConfigure-BatchProcessDownloadConfigureScreen-ttlBar", AI = false)
	private WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessDownloadConfigure-BatchProcessDownloadConfigureScreen-StopDate']", AI = false)
	private WebElement inpEnddate;

	@IFindBy(how = How.CSS, using = "input[name='BatchProcessDownloadConfigure-BatchProcessDownloadConfigureScreen-StartDate']", AI = false)
	private WebElement inpStartdate;

	@IFindBy(how = How.CSS, using = "#BatchProcessDownloadConfigure-BatchProcessDownloadConfigureScreen-download>div[role='button']", AI = false)
	private WebElement btnDownload;

	@IFindBy(how = How.CSS, using = "#BatchProcessDownloadConfigure-BatchProcessDownloadConfigureScreen-StopDate_dateIcon", AI = false)
	private WebElement btnEnddateDateIcon;

	@IFindBy(how = How.CSS, using = "#BatchProcessDownloadConfigure-BatchProcessDownloadConfigureScreen-StartDate_dateIcon", AI = false)
	private WebElement btnStartdateDateIcon;

	@IFindBy(how = How.CSS, using = "#BatchProcessDownloadConfigure-BatchProcessDownloadConfigureScreen-BackButton>div[role='button']", AI = false)
	private WebElement btnBackButton;

	public DownloadHistoryPage(){
	}

	public DownloadHistoryPage(WebDriver driver) {
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
		
}public DownloadHistoryPage enterEnddate(WebDriver driver,String Enddate) {
		            BrowserActions.type(driver, inpEnddate,Enddate, "Enddate");
		            Log.messageStep("Entered End Date : "+Enddate,DriverManager.getDriver());
			        return this;
           }
public DownloadHistoryPage enterStartdate(WebDriver driver,String Startdate) {
		            BrowserActions.type(driver, inpStartdate,Startdate, "Startdate");
		            Log.messageStep("Entered Start Date : "+Startdate,DriverManager.getDriver());
			        return this;
           }
public DownloadHistoryPage clickDownload(WebDriver driver)  {
					BrowserActions.click(driver, btnDownload,"Download");
				    return this;
			}
public DownloadHistoryPage clickEnddateDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnEnddateDateIcon,"EnddateDateIcon");				
				    return this;
			}
public DownloadHistoryPage clickStartdateDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnStartdateDateIcon,"StartdateDateIcon");
				    return this;
			}
public BatchProcessInfoPage clickReturntoBatchButton(WebDriver driver)  {
					BrowserActions.click(driver, btnBackButton,1,"BackButton");
					Log.messageStep("Return Batch button is clicked and Navigate back to BatchProcessInfoPage",DriverManager.getDriver());
				    return new BatchProcessInfoPage(driver).get();
			}
}
