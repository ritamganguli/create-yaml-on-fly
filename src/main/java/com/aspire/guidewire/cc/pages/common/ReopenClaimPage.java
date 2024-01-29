package com.aspire.guidewire.cc.pages.common;
import java.util.ArrayList;
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

public class ReopenClaimPage extends LoadableComponent<ReopenClaimPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();
	
//		public Producers producersTable;
//		public MySubmissions mysubmissionsTable;
//		public MyRenewal myrenewalTable;
//		public Locations locationsTable;
//		public AccountContact accountcontactTable;
//		public CurrentActivitiesAccount currentactivitiesaccountTable;
//		public MyActivities myactivitiesTable;
	@IFindBy(how = How.CSS, using = "textarea[name$='-Note']", AI = false)
	private WebElement inpNote;

	@IFindBy(how = How.CSS, using = "#ReopenClaimPopup-__crumb__", AI = false)
	private WebElement btnReturntoStatus;

	@IFindBy(how = How.CSS, using = "#ReopenClaimPopup-ReopenClaimScreen-Update>div[role='button']", AI = false)
	private WebElement btnReopenClaim;

	@IFindBy(how = How.CSS, using = "#ReopenClaimPopup-ReopenClaimScreen-ttlBar", AI = false)
	private WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "#ReopenClaimPopup-ReopenClaimScreen-Edit>div[role='button']", AI = false)
	private WebElement btnEdit;

	@IFindBy(how = How.CSS, using = "div[id$='ReopenClaimInfoDV-Reason'] select[name='ReopenClaimPopup-ReopenClaimScreen-ReopenClaimInfoDV-Reason']", AI = false)
	private WebElement drpReason;//select[name='ReopenClaimPopup-ReopenClaimScreen-ReopenClaimInfoDV-Reason']

	@IFindBy(how = How.CSS, using = "#ReopenClaimPopup-ReopenClaimScreen-Cancel>div[role='button']", AI = false)
	private WebElement btnCancel;
	
	@IFindBy(how = How.CSS, using = "div[id$='ClaimSummaryGroup']", AI = false)
	private WebElement btnSummary;

	@IFindBy(how = How.CSS, using = "div[id$='ClaimSummaryGroup_ClaimStatus']", AI = false)
	private WebElement btnStatus;
	
	@IFindBy(how = How.CSS, using = "div[id$='-ClaimStatus']", AI = false)
	private WebElement txtStatusValue;


	public ReopenClaimPage(){
	}

	public ReopenClaimPage(WebDriver driver) {
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(finder, this);
		}
		
		
		@Override
		protected void load() {
			isPageLoaded = true;
			WaitUtils.waitForPageLoad(driver);
		}// load

		@Override
		protected void isLoaded() {
			if (!isPageLoaded) {
				Assert.fail();
			}

			if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, lblTtlBar))){
				Log.fail("Page did not open up. Site might be down.", driver);
			}
			//elementLayer = new ElementLayer(driver);

//		producersTable = new Producers();
//		mysubmissionsTable = new MySubmissions();
//		myrenewalTable = new MyRenewal();
//		locationsTable = new Locations();
//		accountcontactTable = new AccountContact();
//		currentactivitiesaccountTable = new CurrentActivitiesAccount();
//		myactivitiesTable = new MyActivities();
}
public ReopenClaimPage enterNote(WebDriver driver,String Note) {
		            BrowserActions.type(driver, inpNote,Note, "Note");
			        return this;
           }
public ReopenClaimPage clickReturntoStatus(WebDriver driver)  {
					BrowserActions.click(driver, btnReturntoStatus,"ReturntoStatus");
				    return this;
			}
public ReopenClaimPage clickReopenClaim(WebDriver driver)  {
					BrowserActions.click(driver, btnReopenClaim,"ReopenClaim");
				    return this;
			}
public ReopenClaimPage clickEdit(WebDriver driver)  {
					BrowserActions.click(driver, btnEdit,"Edit");
				    return this;
			}
public ReopenClaimPage selectReason(WebDriver driver,String Reason)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpReason,Reason,"Reason");
				    return this;
			}
public ReopenClaimPage clickCancel(WebDriver driver)  {
					BrowserActions.click(driver, btnCancel,"Cancel");
				    return this;
			}
public ReopenClaimPage clickSummary(WebDriver driver)  {
	BrowserActions.click(driver, btnSummary,"ReturntoSummary");
    return this;
}
public ReopenClaimPage clickStatus(WebDriver driver)  {
	BrowserActions.click(driver, btnStatus,"ReturntoSummary");
    return this;
}
public ReopenClaimPage VerifyStatus(WebDriver driver,String Text)  {
	BrowserActions.verifyElementTextIsDisplayed(driver, txtStatusValue,Text, true, "Closed");
    return this;
}
}
