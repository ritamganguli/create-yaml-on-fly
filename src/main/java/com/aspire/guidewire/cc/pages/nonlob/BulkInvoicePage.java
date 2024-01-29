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

public class BulkInvoicePage extends LoadableComponent<BulkInvoicePage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
 	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
	//public TopNavBar topnavbar;
	@IFindBy(how = How.CSS, using = "#BulkPay-BulkPayScreen-RefreshButton>div[role='button']", AI = false)
	private WebElement btnRefresh;

	@IFindBy(how = How.CSS, using = "select[name='BulkPay-BulkPayScreen-BulkPayFilter']", AI = false)
	private WebElement drpBulkPayFilter;

	@IFindBy(how = How.CSS, using = "#BulkPay-BulkPayScreen-StopButton>div[role='button']", AI = false)
	private WebElement btnStop;

	@IFindBy(how = How.CSS, using = "div[id$='CreateNewButton']", AI = false)
	private WebElement btnCreateNew;

	@IFindBy(how = How.CSS, using = "#BulkPay-BulkPayScreen-VoidButton>div[role='button']", AI = false)
	private WebElement btnVoid;

	@IFindBy(how = How.CSS, using = "#BulkPay-BulkPayScreen-ttlBar", AI = false)
	private WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "#BulkPay-BulkPayScreen-DeleteButton>div[role='button']", AI = false)
	private WebElement btnDelete;

	@IFindBy(how = How.CSS, using = "#BulkPay-BulkPayScreen-SubmitButton>div[role='button']", AI = false)
	private WebElement btnSubmit;
	
	@IFindBy(how = How.XPATH, using = "//div[contains(@id,'0-InvoiceNumber_button')]", AI = false)
	private WebElement lnkInvoice;

	public BulkInvoicePage(){
	}

	public BulkInvoicePage(WebDriver driver) throws Exception{
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
		}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, btnSubmit))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);
}public BulkInvoicePage clickRefresh(WebDriver driver)  {
					BrowserActions.click(driver, btnRefresh,"Refresh");
				    return this;
			}
public BulkInvoicePage selectBulkPayFilter(WebDriver driver,String BulkPayFilter)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpBulkPayFilter,BulkPayFilter,"BulkPayFilter");
				    return this;
			}
public BulkInvoicePage clickStop(WebDriver driver)  {
					BrowserActions.click(driver, btnStop,"Stop");
				    return this;
			}
public BulkInvoicePage clickCreateNew(WebDriver driver)  {
					BrowserActions.click(driver, btnCreateNew,"CreateNew");
				    return this;
			}
public BulkInvoicePage clickVoid(WebDriver driver)  {
					BrowserActions.click(driver, btnVoid,"Void");
				    return this;
			}
public BulkInvoicePage clickDelete(WebDriver driver)  {
					BrowserActions.click(driver, btnDelete,"Delete");
				    return this;
			}
public BulkInvoicePage clickSubmit(WebDriver driver)  {
					BrowserActions.click(driver, btnSubmit,"Submit");
				    return this;
			}

public BulkInvoicePage verifyBulkPayFilter(WebDriver driver){
	BrowserActions.verifyElementDisplayed(driver, drpBulkPayFilter, "BulkPay filter");
	return this;
}
public BulkInvoicePage verifyCreateNew(WebDriver driver){
	BrowserActions.verifyElementDisplayed(driver, btnCreateNew, "Create New");
	return this;
}
public BulkInvoicePage verifyDelete(WebDriver driver){
	BrowserActions.verifyElementDisplayed(driver, btnDelete, "Delete");
	return this;
}
public BulkInvoicePage verifySubmit(WebDriver driver){
	BrowserActions.verifyElementDisplayed(driver, btnSubmit, "Submit");
	return this;
}
public BulkInvoicePage verifyStop(WebDriver driver){
	BrowserActions.verifyElementDisplayed(driver, btnStop, "Stop");
	return this;
}
public BulkInvoicePage verifyVoid(WebDriver driver){
	BrowserActions.verifyElementDisplayed(driver, btnVoid, "Void");
	Log.messageStep("Details of Bulk Invoice were Displayed Successfully",DriverManager.getDriver());
	return this;
}
public BulkInvoicePage verifyRefresh(WebDriver driver){
	BrowserActions.verifyElementDisplayed(driver, btnRefresh, "Refresh");
	return this;
}
public BulkInvoiceDetailsPage clickInvoice(WebDriver driver)  {
	BrowserActions.click(driver, lnkInvoice,"Invoice");
	Log.messageStep("Invoice Button is Clicked to Show the Details of Invoices",DriverManager.getDriver());
    return new BulkInvoiceDetailsPage(driver).get();
}
}
