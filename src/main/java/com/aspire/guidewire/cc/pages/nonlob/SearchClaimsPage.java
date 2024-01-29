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

public class SearchClaimsPage extends LoadableComponent<SearchClaimsPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
 	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
	//public TopNavBar topnavbar;
	@IFindBy(how = How.CSS, using = "select[name='SimpleClaimSearch-SimpleClaimSearchScreen-SimpleClaimSearchDV-GlobalPersonNameInputSet-Prefix']", AI = false)
	private WebElement drpPrefix;

	@IFindBy(how = How.CSS, using = "input[name='SimpleClaimSearch-SimpleClaimSearchScreen-SimpleClaimSearchDV-PolicyNumber']", AI = false)
	private WebElement inpPolicy;

	@IFindBy(how = How.CSS, using = "#SimpleClaimSearch-SimpleClaimSearchScreen-ttlBar", AI = false)
	private WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "#SimpleClaimSearch-SimpleClaimSearchScreen-SimpleClaimSearchDV-ClaimSearchAndResetInputSet-Search", AI = false)
	private WebElement btnSearch;

	@IFindBy(how = How.CSS, using = "input[name='SimpleClaimSearch-SimpleClaimSearchScreen-SimpleClaimSearchDV-GlobalPersonNameInputSet-NameSummary']", AI = false)
	private WebElement inpName;

	@IFindBy(how = How.CSS, using = "input[name='SimpleClaimSearch-SimpleClaimSearchScreen-SimpleClaimSearchDV-GlobalContactNameInputSet-Name']", AI = false)
	private WebElement inpOrganizationName;

	@IFindBy(how = How.CSS, using = "select[name='SimpleClaimSearch-SimpleClaimSearchScreen-SimpleClaimSearchDV-GlobalPersonNameInputSet-Suffix']", AI = false)
	private WebElement drpSuffix;

	@IFindBy(how = How.CSS, using = "input[name='SimpleClaimSearch-SimpleClaimSearchScreen-SimpleClaimSearchDV-TaxID']", AI = false)
	private WebElement inpTaxID;

	@IFindBy(how = How.CSS, using = "input[name='SimpleClaimSearch-SimpleClaimSearchScreen-SimpleClaimSearchDV-GlobalPersonNameInputSet-Particle']", AI = false)
	private WebElement inpParticle;

	@IFindBy(how = How.CSS, using = "select[name='SimpleClaimSearch-SimpleClaimSearchScreen-SimpleClaimSearchDV-SearchFor']", AI = false)
	private WebElement drpSearchFor;

	@IFindBy(how = How.CSS, using = "#SimpleClaimSearch-SimpleClaimSearchScreen-SimpleClaimSearchResultsLV_tb-ClaimSearchScreen_AssignButton>div[role='button']", AI = false)
	private WebElement btnAssign;

	@IFindBy(how = How.CSS, using = "input[name='SimpleClaimSearch-SimpleClaimSearchScreen-SimpleClaimSearchDV-GlobalPersonNameInputSet-MiddleName']", AI = false)
	private WebElement inpMiddlename;

	@IFindBy(how = How.CSS, using = "input[name='SimpleClaimSearch-SimpleClaimSearchScreen-SimpleClaimSearchDV-GlobalPersonNameInputSet-LastName']", AI = false)
	private WebElement inpLastname;

	@IFindBy(how = How.CSS, using = "input[name='SimpleClaimSearch-SimpleClaimSearchScreen-SimpleClaimSearchResultsLV_tb-archiveSearchLink']", AI = false)
	private WebElement inpArchiveSearchLink;

	@IFindBy(how = How.CSS, using = "input[name='SimpleClaimSearch-SimpleClaimSearchScreen-SimpleClaimSearchDV-ClaimNumber']", AI = false)
	private WebElement inpClaim;

	@IFindBy(how = How.CSS, using = "#SimpleClaimSearch-SimpleClaimSearchScreen-SimpleClaimSearchDV-ClaimSearchAndResetInputSet-Reset", AI = false)
	private WebElement btnReset;

	@IFindBy(how = How.CSS, using = "input[name='SimpleClaimSearch-SimpleClaimSearchScreen-SimpleClaimSearchDV-GlobalPersonNameInputSet-FirstName']", AI = false)
	private WebElement inpFirstname;

	@IFindBy(how = How.CSS, using = "#SimpleClaimSearch-SimpleClaimSearchScreen-SimpleClaimSearchResultsLV_tb-SimpleClaimSearchScreen_PrintButton>div[role='button']", AI = false)
	private WebElement btnPrintExport;
	
	@IFindBy(how = How.CSS, using = "div[id$='LV-0-ClaimNumber_button']", AI = false)
	private WebElement lnkClaimNumber;
	
	@IFindBy(how = How.CSS, using = "div[id$='LV-0-Insured']", AI = false)
	private WebElement txtInsured;
	
	@IFindBy(how = How.CSS, using = "td[id$='LV-0-PolicyID_Cell']", AI = false)
	private WebElement txtPolicy;
	
	@IFindBy(how = How.CSS, using = "div[id$='ClaimantHeader']", AI = false)
	private WebElement txtClaimant;
	
	@IFindBy(how = How.CSS, using = "div[id$='LV-0-Status']", AI = false)
	private WebElement txtStatus;
	
	@IFindBy(how = How.CSS, using = "div[id$='LV-0-LossDate']", AI = false)
	private WebElement txtLossDate;


	public SearchClaimsPage(){
	}

	public SearchClaimsPage(WebDriver driver) {
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
		}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, btnPrintExport))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);
}public SearchClaimsPage selectPrefix(WebDriver driver,String Prefix)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPrefix,Prefix,"Prefix");
				    return this;
			}
public SearchClaimsPage enterPolicy(WebDriver driver,String Policy) {
		            BrowserActions.type(driver, inpPolicy,Policy, "Policy");
			        return this;
           }
public SearchClaimsPage clickSearch(WebDriver driver)  {
					BrowserActions.click(driver, btnSearch,"Search");
					Log.messageStep("Clicked on Search", DriverManager.getDriver());
				    return this;
			}
public SearchClaimsPage enterName(WebDriver driver,String Name) {
		            BrowserActions.type(driver, inpName,Name, "Name");
			        return this;
           }
public SearchClaimsPage enterOrganizationName(WebDriver driver,String OrganizationName) {
		            BrowserActions.type(driver, inpOrganizationName,OrganizationName, "OrganizationName");
			        return this;
           }
public SearchClaimsPage selectSuffix(WebDriver driver,String Suffix)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpSuffix,Suffix,"Suffix");
				    return this;
			}
public SearchClaimsPage enterTaxID(WebDriver driver,String TaxID) {
		            BrowserActions.type(driver, inpTaxID,TaxID, "TaxID");
			        return this;
           }
public SearchClaimsPage enterParticle(WebDriver driver,String Particle) {
		            BrowserActions.type(driver, inpParticle,Particle, "Particle");
			        return this;
           }
public SearchClaimsPage selectSearchFor(WebDriver driver,String SearchFor)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpSearchFor,SearchFor,"SearchFor");
					Log.messageStep("Select Search for :"+SearchFor, DriverManager.getDriver());
				    return this;
			}
public SearchClaimsPage clickAssign(WebDriver driver)  {
					BrowserActions.click(driver, btnAssign,"Assign");
				    return this;
			}
public SearchClaimsPage enterMiddlename(WebDriver driver,String Middlename) {
		            BrowserActions.type(driver, inpMiddlename,Middlename, "Middlename");
			        return this;
           }
public SearchClaimsPage enterLastname(WebDriver driver,String Lastname) {
		            BrowserActions.type(driver, inpLastname,Lastname, "Lastname");
			        return this;
           }
public SearchClaimsPage enterArchiveSearchLink(WebDriver driver,String ArchiveSearchLink) {
		            BrowserActions.type(driver, inpArchiveSearchLink,ArchiveSearchLink, "ArchiveSearchLink");
			        return this;
           }
public SearchClaimsPage enterClaim(WebDriver driver,String Claim) {
		            BrowserActions.type(driver, inpClaim,Claim,1, "Claim");
		    		Log.messageStep("Entered CLaim number : " +Claim, DriverManager.getDriver());
			        return this;
           }
public SearchClaimsPage clickReset(WebDriver driver)  {
					BrowserActions.click(driver, btnReset,"Reset");
				    return this;
			}
public SearchClaimsPage enterFirstname(WebDriver driver,String Firstname) {
		            BrowserActions.type(driver, inpFirstname,Firstname, "Firstname");
		    		Log.messageStep("Enter First Name :"+Firstname, DriverManager.getDriver());
			        return this;
           }
public SearchClaimsPage clickPrintExport(WebDriver driver)  {
					BrowserActions.click(driver, btnPrintExport,"PrintExport");
				    return this;
			}
public SearchClaimsPage verifyClaimantValue(WebDriver driver)  {
					BrowserActions.verifyElementDisplayed(driver, lnkClaimNumber,"Claim Number");
					return this;
}
public SearchClaimsPage verifyInsuredName(WebDriver driver)  {
	BrowserActions.verifyElementDisplayed(driver, lnkClaimNumber,"Claim Number");
	return this;
}
public SearchClaimsPage verifyPolicyValue(WebDriver driver)  {
	BrowserActions.verifyElementDisplayed(driver, txtPolicy,"Policy Number");
	return this;
}
public SearchClaimsPage verifyClaimantName(WebDriver driver)  {
	BrowserActions.verifyElementDisplayed(driver, txtClaimant,"Claimant Name");
	return this;
}
public SearchClaimsPage verifyLossDateValue(WebDriver driver)  {
	BrowserActions.verifyElementDisplayed(driver, txtLossDate,"Loss Date Value");
	return this;
}
public SearchClaimsPage verifyStatusValue(WebDriver driver)  {
	BrowserActions.verifyElementDisplayed(driver, txtStatus,"Status Value");
	Log.messageStep("Verfied all necessary Values in Search Result", DriverManager.getDriver());
	return this;
}
public void clickClaimLink(WebDriver driver)  {
	BrowserActions.click(driver, lnkClaimNumber,"Claim Link");
	Log.messageStep("Clicked on Claim Link", DriverManager.getDriver());

}

}

