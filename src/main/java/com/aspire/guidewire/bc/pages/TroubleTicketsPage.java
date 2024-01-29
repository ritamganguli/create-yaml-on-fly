package com.aspire.guidewire.bc.pages;
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

import ASPIREAI.customfactories.AjaxElementLocatorFactory;
import ASPIREAI.customfactories.IFindBy;
import ASPIREAI.customfactories.PageFactory;

public class TroubleTicketsPage extends LoadableComponent<TroubleTicketsPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
	//	public TopNavBar topnavbar;
	@IFindBy(how = How.CSS, using = "select[name='PolicyDetailTroubleTickets-PolicyDetailTroubleTicketsScreen-TroubleTicketsLV-Filter']", AI = false)
	private WebElement drpFilter;

	@IFindBy(how = How.CSS, using = "#PolicyDetailTroubleTickets-PolicyDetailTroubleTicketsScreen-ttlBar", AI = false)
	private WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "div[id*='NewTrouble']", AI = false)
	private WebElement btnNew;//div[id$='NewTroubleTicketButton'] //div[id$='NewTroubleTicket']

	@IFindBy(how = How.CSS, using = "#PolicyDetailTroubleTickets-PolicyDetailTroubleTicketsScreen-TroubleTicketsLV_tb-All>div[role='button']", AI = false)
	private WebElement btnAll;

	@IFindBy(how = How.CSS, using = "select[name='PolicyDetailTroubleTickets-PolicyDetailTroubleTicketsScreen-TroubleTicketsLV-Filter']", AI = false)
	private WebElement drpFilter_1;

	@IFindBy(how = How.CSS, using = "#PolicyDetailTroubleTickets-PolicyDetailTroubleTicketsScreen-TroubleTicketsLV_tb-RelatedToPeriodOnly>div[role='button']", AI = false)
	private WebElement btnRelatedToThisPeriodOnly;

	@IFindBy(how = How.CSS, using = "#PolicyDetailTroubleTickets-PolicyDetailTroubleTicketsScreen-TroubleTicketsLV_tb-RelatedToPolicyOnly>div[role='button']", AI = false)
	private WebElement btnRelatedToPolicyOnly;

	@IFindBy(how = How.CSS, using = "div[id$='0-Number_button']", AI = false)
	private WebElement lnkTicketNo;

	@IFindBy(how = How.CSS, using = "div[id$='_CloseButton']", AI = false)
	private WebElement btnClose;


	public String lblSubject="div[id$='Title']";

	public TroubleTicketsPage(){
	}

	public TroubleTicketsPage(WebDriver driver){
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
		}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, btnNew))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);
	}public TroubleTicketsPage selectFilter(WebDriver driver,String Filter)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpFilter,Filter,"Filter");
		return this;
	}
	public TroubleTicketWizardPage clickNew(WebDriver driver)  {
		BrowserActions.click(driver, btnNew,"New");
		return new TroubleTicketWizardPage(driver).get();
	}
	public TroubleTicketsPage clickAll(WebDriver driver)  {
		BrowserActions.click(driver, btnAll,"All");
		return this;
	}
	public TroubleTicketsPage selectFilter_1(WebDriver driver,String Filter_1)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpFilter_1,Filter_1,"Filter_1");
		return this;
	}
	public TroubleTicketsPage clickRelatedToThisPeriodOnly(WebDriver driver)  {
		BrowserActions.click(driver, btnRelatedToThisPeriodOnly,"RelatedToThisPeriodOnly");
		return this;
	}
	public TroubleTicketsPage clickRelatedToPolicyOnly(WebDriver driver)  {
		BrowserActions.click(driver, btnRelatedToPolicyOnly,"RelatedToPolicyOnly");
		return this;
	}
	public TroubleTicketsPage clickTicketNo(WebDriver driver)  {
		BrowserActions.click(driver, lnkTicketNo,"Ticket No");
		return this;
	}
	public TroubleTicketsPage clickClose(WebDriver driver)  {
		BrowserActions.click(driver, btnClose,"Ticket No");
		BrowserActions.confirmAlert(driver, "close button");
		return this;
	}
	public TroubleTicketsPage verifyTicketEntry(WebDriver driver, String subject)  {
		By subjectListBy = By.cssSelector(lblSubject);
		List<WebElement> subjectList = BrowserActions.getWebElements(driver, subjectListBy, "subject List", 0.5);
		for(WebElement element: subjectList) {
			String text = BrowserActions.getText(driver, element,"Ticket No");
			if(text.equals(subject)) {
				Log.message("Ticket got entried", driver);
				break;
			}
		}
		return this;
	}
}
