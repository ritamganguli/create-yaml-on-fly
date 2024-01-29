package com.aspire.guidewire.cc.pages.common;
import java.util.List;
import java.util.ArrayList;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.testng.Assert;

import ASPIREAI.customfactories.AjaxElementLocatorFactory;
import ASPIREAI.customfactories.PageFactory;
import com.aspire.guidewire.utils.BrowserActions;
import com.aspire.guidewire.utils.ElementLayer;
import com.aspire.guidewire.utils.Log;
import com.aspire.guidewire.utils.WaitUtils;

import ASPIREAI.customfactories.IFindBy;

public class CloseClaimPage extends LoadableComponent<CloseClaimPage> {

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
	@IFindBy(how = How.CSS, using = "#CloseClaimPopup-CloseClaimScreen-Cancel>div[role='button']", AI = false)
	private WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "select[name='CloseClaimPopup-CloseClaimScreen-CloseClaimInfoDV-Outcome']", AI = false)
	private WebElement drpOutcome;

	@IFindBy(how = How.CSS, using = "#CloseClaimPopup-CloseClaimScreen-ttlBar", AI = false)
	private WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "#CloseClaimPopup-CloseClaimScreen-Edit>div[role='button']", AI = false)
	private WebElement btnEdit;

	@IFindBy(how = How.CSS, using = "#CloseClaimPopup-CloseClaimScreen-Update>div[role='button']", AI = false)
	private WebElement btnCloseClaim;

	@IFindBy(how = How.CSS, using = "textarea[name$='-Note']", AI = false)
	private WebElement inpNote;

	@IFindBy(how = How.CSS, using = "#CloseClaimPopup-__crumb__", AI = false)
	private WebElement btnReturntoSummary;
	
	@IFindBy(how = How.CSS, using = "div[id$='ClaimSummaryGroup']", AI = false)
	private WebElement btnSummary;

	@IFindBy(how = How.CSS, using = "div[id$='ClaimSummaryGroup_ClaimStatus']", AI = false)
	private WebElement btnStatus;
	
	@IFindBy(how = How.CSS, using = "div[id$='-ClaimStatus']", AI = false)
	private WebElement txtStatusValue;
	
	public CloseClaimPage(){
	}

	public CloseClaimPage(WebDriver driver) {
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
		elementLayer = new ElementLayer(driver);
	}// isLoaded
public CloseClaimPage clickCancel(WebDriver driver)  {
					BrowserActions.click(driver, btnCancel,"Cancel");
				    return this;
			}
public CloseClaimPage selectOutcome(WebDriver driver,String Outcome)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpOutcome,Outcome,"Outcome");
				    return this;
			}
public CloseClaimPage clickEdit(WebDriver driver)  {
					BrowserActions.click(driver, btnEdit,"Edit");
				    return this;
			}
public CloseClaimPage clickCloseClaim(WebDriver driver)  {
					BrowserActions.click(driver, btnCloseClaim,"CloseClaim");
				    return this;
			}
public CloseClaimPage enterNote(WebDriver driver,String Note) {
		            BrowserActions.type(driver, inpNote,Note, "Note");
			        return this;
           }
public CloseClaimPage clickReturntoSummary(WebDriver driver)  {
					BrowserActions.click(driver, btnReturntoSummary,"ReturntoSummary");
				    return this;
			}
public CloseClaimPage clickSummary(WebDriver driver)  {
	BrowserActions.click(driver, btnSummary,"Summary");
    return this;
}
public CloseClaimPage clickStatus(WebDriver driver)  {
	BrowserActions.click(driver, btnStatus,1.5,"Status");
    return this;
}
public CloseClaimPage VerifyStatus(WebDriver driver,String Text)  {
	BrowserActions.verifyElementTextIsDisplayed(driver, txtStatusValue,Text,false, "Status");
    return this;
}

}
