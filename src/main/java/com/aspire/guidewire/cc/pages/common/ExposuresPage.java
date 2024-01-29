package com.aspire.guidewire.cc.pages.common;
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

public class ExposuresPage extends LoadableComponent<ExposuresPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
	//	public TopNavBar topnavbar;
	//public Exposures exposuresTable;

	@IFindBy(how = How.CSS, using = "#ClaimExposures-ClaimExposuresScreen-ttlBar", AI = false)
	private WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "#ClaimExposures-ClaimExposuresScreen-ClaimExposures_Refresh>div[role='button']", AI = false)
	private WebElement btnRefresh;

	@IFindBy(how = How.CSS, using = "input[name='ClaimExposures-ClaimExposuresScreen-ExposuresLV-0-Order']", AI = false)
	private WebElement inpOrder;

	@IFindBy(how = How.CSS, using = "select[name='ClaimExposures-ClaimExposuresScreen-ExposuresLV-0-Status']", AI = false)
	private WebElement drpStatus;

	@IFindBy(how = How.CSS, using = "#ClaimExposures-ClaimExposuresScreen-ClaimExposures_CreateReserve>div[role='button']", AI = false)
	private WebElement btnCreateReserve;

	@IFindBy(how = How.CSS, using = "select[name='ClaimExposures-ClaimExposuresScreen-ExposuresLV-ExposuresFilter']", AI = false)
	private WebElement drpExposuresFilter_1;

	@IFindBy(how = How.CSS, using = "div[id*='CloseExposure'] div[role='button']", AI = false)
	private WebElement btnCloseExposure;

	@IFindBy(how = How.CSS, using = "#CloseExposurePopup-CloseExposureScreen-Update>div[role='button']", AI = false)
	private WebElement btnCloseExposure1;

	@IFindBy(how = How.CSS, using = "input[name='ClaimExposures-ClaimExposuresScreen-ExposuresLV-0-Claimant']", AI = false)
	private WebElement inpClaimant;

	@IFindBy(how = How.CSS, using = "select[name='ClaimExposures-ClaimExposuresScreen-ExposuresLV-0-Type']", AI = false)
	private WebElement drpType;

	@IFindBy(how = How.CSS, using = "#ClaimExposures-ClaimExposuresScreen-ClaimExposures_Assign>div[role='button']", AI = false)
	private WebElement btnAssign;

	@IFindBy(how = How.CSS, using = "select[name='ClaimExposures-ClaimExposuresScreen-ExposuresLV-0-Coverage']", AI = false)
	private WebElement drpCoverage;

	@IFindBy(how = How.CSS, using = "input[name='ClaimExposures-ClaimExposuresScreen-ExposuresLV-0-Assignee']", AI = false)
	private WebElement inpAdjuster;

	@IFindBy(how = How.CSS, using = "#ClaimExposures-ClaimExposuresScreen-ClaimExposures_Print>div[role='button']", AI = false)
	private WebElement btnPrintExport;

	@IFindBy(how = How.CSS, using = "select[name='ClaimExposures-ClaimExposuresScreen-ExposuresLV-ExposuresFilter']", AI = false)
	private WebElement drpExposuresFilter;

	@IFindBy(how = How.CSS, using = "input[name='ClaimExposures-ClaimExposuresScreen-ExposuresLV-_Checkbox']", AI = false)
	private WebElement chkboxExposure;
	
	@IFindBy(how = How.CSS, using = "textarea[name$='-Note']", AI = false)
	private WebElement inpNote;

	@IFindBy(how = How.CSS, using = "select[name='CloseExposurePopup-CloseExposureScreen-CloseExposureInfoDV-Outcome']", AI = false)
	private WebElement drpOutcome;

	@IFindBy(how = How.XPATH, using = "(//div[contains(@id,'-Status')]) [last()]", AI = false)
	private WebElement txtStatus;

	@IFindBy(how = How.XPATH, using = "(//div[contains(@id,'-Type')]) [last()]", AI = false)
	private WebElement txtType;

	@IFindBy(how = How.CSS, using = "div[id*='Reopen'] div[role='button']", AI = false)
	private WebElement btnReopenExposure;

	@IFindBy(how = How.CSS, using = "select[name='ReopenExposurePopup-ReopenExposureScreen-ReopenExposureInfoDV-Reason']", AI = false)
	private WebElement drpReason;

	@IFindBy(how = How.CSS, using = "div[id$='UpLink']", AI = false)
	private WebElement lnkUpToExposure;

	@IFindBy(how = How.CSS, using = "div[id$='-Coverage']", AI = false)
	private WebElement lblCoverage;

	@IFindBy(how = How.XPATH, using = "(//input[contains(@name,'Checkbox')]) [last()]", AI = false)
	private WebElement chkExposure;

	@IFindBy(how = How.CSS, using = "div[class='gw-ListView--empty-info-row']", AI = false)
	private WebElement lblNoDataToDisplay;

	@IFindBy(how = How.CSS, using = "div[id$='postLabel']", AI = false)
	public List<WebElement> lblLastPageNo;
	
	@IFindBy(how = How.CSS, using = "div[id$='ListPaging-next']", AI = false)
	public WebElement btnNextArrow;
	
	public ExposuresPage(){
	}

	public ExposuresPage(WebDriver driver){
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(finder, this);
		//	exposuresTable = new Exposures();
	}
	public ExposuresPage(WebDriver driver , int timeout){
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, timeout);
		PageFactory.initElements(finder, this);
		//	exposuresTable = new Exposures();
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
	}public ExposuresPage clickRefresh(WebDriver driver)  {
		BrowserActions.click(driver, btnRefresh,"Refresh");
		return this;
	}
	public ExposuresPage enterOrder(WebDriver driver,String Order) {
		BrowserActions.type(driver, inpOrder,Order, "Order");
		return this;
	}
	public ExposuresPage selectStatus(WebDriver driver,String Status)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpStatus,Status,"Status");
		return this;
	}
	public ExposuresPage clickCreateReserve(WebDriver driver)  {
		BrowserActions.click(driver, btnCreateReserve,"CreateReserve");
		return this;
	}
	public ExposuresPage selectExposuresFilter_1(WebDriver driver,String ExposuresFilter_1)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpExposuresFilter_1,ExposuresFilter_1,"ExposuresFilter_1");
		return this;
	}
	public ExposuresPage clickCloseExposure(WebDriver driver)  {
		BrowserActions.click(driver, btnCloseExposure,1,"CloseExposure");
		return this;
	}
	public ExposuresPage enterClaimant(WebDriver driver,String Claimant) {
		BrowserActions.type(driver, inpClaimant,Claimant, "Claimant");
		return this;
	}
	public ExposuresPage selectType(WebDriver driver,String Type)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpType,Type,"Type");
		return this;
	}
	public ExposuresPage clickAssign(WebDriver driver)  {
		BrowserActions.click(driver, btnAssign,"Assign");
		return this;
	}
	public ExposuresPage selectCoverage(WebDriver driver,String Coverage)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCoverage,Coverage,"Coverage");
		return this;
	}
	public ExposuresPage enterAdjuster(WebDriver driver,String Adjuster) {
		BrowserActions.type(driver, inpAdjuster,Adjuster, "Adjuster");
		return this;
	}
	public ExposuresPage clickPrintExport(WebDriver driver)  {
		BrowserActions.click(driver, btnPrintExport,"PrintExport");
		return this;
	}

	public ExposuresPage clickExposureCheckbox(WebDriver driver)  {
		if(lblLastPageNo.size()==0) {
			BrowserActions.click(driver, chkExposure,"PrintExport");
		}
			else{
				String pageNo=lblLastPageNo.get(0).getText();
				String num=pageNo.replaceAll("[^0-9]","");
				int no=Integer.parseInt(num);
				for(int i=1;i<no;i++) {
				    BrowserActions.click(driver, btnNextArrow,true,"Next Button");
					}
				BrowserActions.click(driver, chkExposure,"PrintExport");
				}
			
			return this;
	}
	public ExposuresPage selectExposuresFilter(WebDriver driver,String ExposuresFilter)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpExposuresFilter,ExposuresFilter,"ExposuresFilter");
		return this;
	}
	public ExposuresPage clickCheckBoxExposure(WebDriver driver)  {
		BrowserActions.click(driver, chkExposure,"Check Box");
		return this;
	}
	public ExposuresPage enterNote(WebDriver driver,String Note) {
		BrowserActions.type(driver, inpNote,Note, "Note");
		return this;
	}
	public ExposuresPage selectOutcome(WebDriver driver,String Outcome)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpOutcome,Outcome,"Outcome");
		return this;
	}
	public ExposuresPage verifyStatus(WebDriver driver,String Outcome)  {
		BrowserActions.verifyElementTextIsDisplayed(driver, txtStatus,Outcome, true, Outcome);
		return this;
	}

	public ExposuresPage clickType(WebDriver driver)  {
		BrowserActions.click(driver,txtType,"Check Box");
		return this;
	}

	public ExposuresPage clickReopenExposure(WebDriver driver)  {
		BrowserActions.click(driver, btnReopenExposure,"ReopenExposure");
		return this;
	}
	public ExposuresPage selectReason(WebDriver driver,String Reason)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpReason,Reason,"Reason");
		return this;
	}
	public ExposuresPage clickupToExposure(WebDriver driver)  {
		BrowserActions.click(driver, lnkUpToExposure,"UpToExposure");
		return this;
	}
	public ExposuresPage verifyExposureCreated(WebDriver driver,String expectedText) {
		String text = BrowserActions.getText(driver, lblCoverage,"Coverage");
		Log.assertThat(text.equals(expectedText), "Exposure is created", "Exposure is not created");
		return this;
	}
	public ExposuresPage verifyNoDataMessage(WebDriver driver,String text)  {
		BrowserActions.verifyElementTextIsDisplayed(driver, lblNoDataToDisplay,text,true, "No Data To Display");
		return this;
	}

}

