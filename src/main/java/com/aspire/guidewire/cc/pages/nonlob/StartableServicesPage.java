package com.aspire.guidewire.cc.pages.nonlob;
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

public class StartableServicesPage extends LoadableComponent<StartableServicesPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
 	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
//	public TopNavBar topnavbar;
//	public StartablePlugin startablepluginTable;

	@IFindBy(how = How.CSS, using = "input[name='StartablePlugin-0-Status']", AI = false)
	private WebElement inpStatus;

	@IFindBy(how = How.CSS, using = "#StartablePlugin-3-Start", AI = false)
	private WebElement btnStart_14;

	@IFindBy(how = How.CSS, using = "#StartablePlugin-NotAvailable .gw-AlertBar--label", AI = false)
	private WebElement lblNotAvailable;

	@IFindBy(how = How.CSS, using = "input[name='StartablePlugin-3-Name']", AI = false)
	private WebElement inpName_11;

	@IFindBy(how = How.CSS, using = "#StartablePlugin-0-Stop", AI = false)
	private WebElement btnStop;

	@IFindBy(how = How.CSS, using = "input[name='StartablePlugin-0-Host']", AI = false)
	private WebElement inpHost;

	@IFindBy(how = How.CSS, using = "#StartablePlugin-2-Stop", AI = false)
	private WebElement btnStop_10;

	@IFindBy(how = How.CSS, using = "#StartablePlugin-3-Stop", AI = false)
	private WebElement btnStop_15;

	@IFindBy(how = How.CSS, using = "input[name='StartablePlugin-0-Name']", AI = false)
	private WebElement inpName;

	@IFindBy(how = How.CSS, using = "#StartablePlugin-0-Start", AI = false)
	private WebElement btnStart;

	@IFindBy(how = How.CSS, using = "input[name='StartablePlugin-3-Host']", AI = false)
	private WebElement inpHost_13;

	@IFindBy(how = How.CSS, using = "input[name='StartablePlugin-1-Name']", AI = false)
	private WebElement inpName_1;

	@IFindBy(how = How.CSS, using = "input[name='StartablePlugin-2-Name']", AI = false)
	private WebElement inpName_6;

	@IFindBy(how = How.CSS, using = "input[name='StartablePlugin-2-Host']", AI = false)
	private WebElement inpHost_8;

	@IFindBy(how = How.CSS, using = "input[name='StartablePlugin-1-Host']", AI = false)
	private WebElement inpHost_3;

	@IFindBy(how = How.CSS, using = "#StartablePlugin-1-Start", AI = false)
	private WebElement btnStart_4;

	@IFindBy(how = How.CSS, using = "#StartablePlugin-2-Start", AI = false)
	private WebElement btnStart_9;

	@IFindBy(how = How.CSS, using = "input[name='StartablePlugin-3-Status']", AI = false)
	private WebElement inpStatus_12;

	@IFindBy(how = How.CSS, using = "#StartablePlugin-ttlBar", AI = false)
	private WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "#StartablePlugin-1-Stop", AI = false)
	private WebElement btnStop_5;

	@IFindBy(how = How.CSS, using = "#StartablePlugin-NotAvailable-CloseBtn", AI = false)
	private WebElement btnClose;

	@IFindBy(how = How.CSS, using = "input[name='StartablePlugin-1-Status']", AI = false)
	private WebElement inpStatus_2;

	@IFindBy(how = How.CSS, using = "input[name='StartablePlugin-2-Status']", AI = false)
	private WebElement inpStatus_7;
	
	@IFindBy(how = How.CSS, using = "div[id='StartablePlugin-NameHeader']", AI = false)
	private WebElement lblName;
	
	@IFindBy(how = How.CSS, using = "div[id='StartablePlugin-StatusHeader']", AI = false)
	private WebElement lblStatus;
	
	@IFindBy(how = How.CSS, using = "div[id='StartablePlugin-StatusHeader']", AI = false)
	private WebElement lblHost;
	
	@IFindBy(how = How.CSS, using = "div[id='StartablePlugin-StatusHeader']", AI = false)
	private WebElement lblAction;
	
	@IFindBy(how = How.CSS, using = "div[id='StartablePlugin-0-Status']", AI = false)
	private WebElement lblServiceStatus;

	public StartableServicesPage(){
	}

	public StartableServicesPage(WebDriver driver) {
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(finder, this);
		//startablepluginTable = new StartablePlugin();
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
}public StartableServicesPage enterStatus(WebDriver driver,String Status) {
		            BrowserActions.type(driver, inpStatus,Status, "Status");
			        return this;
           }
public StartableServicesPage clickStart_14(WebDriver driver)  {
					BrowserActions.click(driver, btnStart_14,"Start_14");
				    return this;
			}
public StartableServicesPage enterName_11(WebDriver driver,String Name_11) {
		            BrowserActions.type(driver, inpName_11,Name_11, "Name_11");
			        return this;
           }
public StartableServicesPage clickStop(WebDriver driver)  {
					BrowserActions.click(driver, btnStop,true,"Stop");
				    return this;
			}
public StartableServicesPage enterHost(WebDriver driver,String Host) {
		            BrowserActions.type(driver, inpHost,Host, "Host");
			        return this;
           }
public StartableServicesPage clickStop_10(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_10,"Stop_10");
				    return this;
			}
public StartableServicesPage clickStop_15(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_15,"Stop_15");
				    return this;
			}
public StartableServicesPage enterName(WebDriver driver,String Name) {
		            BrowserActions.type(driver, inpName,Name, "Name");
			        return this;
           }
public StartableServicesPage clickStart(WebDriver driver)  {
					BrowserActions.click(driver, btnStart,true,"Start");
				    return this;
			}
public StartableServicesPage enterHost_13(WebDriver driver,String Host_13) {
		            BrowserActions.type(driver, inpHost_13,Host_13, "Host_13");
			        return this;
           }
public StartableServicesPage enterName_1(WebDriver driver,String Name_1) {
		            BrowserActions.type(driver, inpName_1,Name_1, "Name_1");
			        return this;
           }
public StartableServicesPage enterName_6(WebDriver driver,String Name_6) {
		            BrowserActions.type(driver, inpName_6,Name_6, "Name_6");
			        return this;
           }
public StartableServicesPage enterHost_8(WebDriver driver,String Host_8) {
		            BrowserActions.type(driver, inpHost_8,Host_8, "Host_8");
			        return this;
           }
public StartableServicesPage enterHost_3(WebDriver driver,String Host_3) {
		            BrowserActions.type(driver, inpHost_3,Host_3, "Host_3");
			        return this;
           }
public StartableServicesPage clickStart_4(WebDriver driver)  {
					BrowserActions.click(driver, btnStart_4,"Start_4");
				    return this;
			}
public StartableServicesPage clickStart_9(WebDriver driver)  {
					BrowserActions.click(driver, btnStart_9,"Start_9");
				    return this;
			}
public StartableServicesPage enterStatus_12(WebDriver driver,String Status_12) {
		            BrowserActions.type(driver, inpStatus_12,Status_12, "Status_12");
			        return this;
           }
public StartableServicesPage clickStop_5(WebDriver driver)  {
					BrowserActions.click(driver, btnStop_5,"Stop_5");
				    return this;
			}
public StartableServicesPage clickClose(WebDriver driver)  {
					BrowserActions.click(driver, btnClose,"Close");
				    return this;
			}
public StartableServicesPage enterStatus_2(WebDriver driver,String Status_2) {
		            BrowserActions.type(driver, inpStatus_2,Status_2, "Status_2");
			        return this;
           }
public StartableServicesPage enterStatus_7(WebDriver driver,String Status_7) {
		            BrowserActions.type(driver, inpStatus_7,Status_7, "Status_7");
			        return this;
           }
public StartableServicesPage verifyName(WebDriver driver)  {
	BrowserActions.verifyElementDisplayed(driver, lblName,"Name");
	return this;
}
public StartableServicesPage verifyStatus(WebDriver driver)  {
	BrowserActions.verifyElementDisplayed(driver, lblStatus,"Status");
	Log.messageStep("Details of Startable Services Were Displayed",DriverManager.getDriver());
	return this;
}
public StartableServicesPage verifyHost(WebDriver driver)  {
	BrowserActions.verifyElementDisplayed(driver, lblHost,"Host");
	return this;
}
public StartableServicesPage verifyAction(WebDriver driver)  {
	BrowserActions.verifyElementDisplayed(driver, lblAction,"Action");
	return this;
}
public StartableServicesPage verifyServiceStatus(WebDriver driver, String status){
	BrowserActions.verifyElementTextIsDisplayed(driver, lblServiceStatus, status, true, "Status is");
	Log.messageStep("Service Status : "+status+" Displayed",DriverManager.getDriver());
	return this;	
}
}
