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

public class AccountsPage extends LoadableComponent<AccountsPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
 	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	@IFindBy(how = How.CSS, using = "#Accounts-AccountSearchScreen-ttlBar", AI = false)
	public WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "input[name='Accounts-AccountSearchScreen-AccountSearchDV-ContactCriteriaInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine3']", AI = false)
	public WebElement inpAddress3;

	@IFindBy(how = How.CSS, using = "input[name='Accounts-AccountSearchScreen-AccountSearchDV-HasChargeHoldsCriterion']", AI = false)
	public WebElement chkHasChargeHolds;

	@IFindBy(how = How.CSS, using = "input[name='Accounts-AccountSearchScreen-AccountSearchDV-ContactCriteriaInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine1']", AI = false)
	public WebElement inpAddress1;

	@IFindBy(how = How.CSS, using = "input[name='Accounts-AccountSearchScreen-AccountSearchDV-ContactCriteriaInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine2']", AI = false)
	public WebElement inpAddress2;

	@IFindBy(how = How.CSS, using = "select[name='Accounts-AccountSearchScreen-AccountSearchDV-AccountSegmentCriterion']", AI = false)
	public WebElement drpAccountSegment;

	@IFindBy(how = How.CSS, using = "input[name='Accounts-AccountSearchScreen-AccountSearchDV-ContactCriteriaInputSet-GlobalPersonNameInputSet-Particle']", AI = false)
	public WebElement inpParticle;

	@IFindBy(how = How.CSS, using = "input[name='Accounts-AccountSearchScreen-AccountSearchDV-ContactCriteriaInputSet-globalAddressContainer-GlobalAddressInputSet-AddressSummary']", AI = false)
	public WebElement inpAddress;

	@IFindBy(how = How.CSS, using = "input[name='Accounts-AccountSearchScreen-AccountSearchDV-AccountNumberCriterion']", AI = false)
	public WebElement inpAccount;

	@IFindBy(how = How.CSS, using = "input[name='Accounts-AccountSearchScreen-AccountSearchDV-ContactCriteriaInputSet-GlobalPersonNameInputSet-MiddleName']", AI = false)
	public WebElement inpMiddlename;

	@IFindBy(how = How.CSS, using = "input[name='Accounts-AccountSearchScreen-AccountSearchDV-ContactCriteriaInputSet-globalAddressContainer-GlobalAddressInputSet-PostalCode']", AI = false)
	public WebElement inpZIPCode;

	@IFindBy(how = How.CSS, using = "#Accounts-AccountSearchScreen-AccountSearchDV-ContactCriteriaInputSet-globalAddressContainer-GlobalAddressInputSet-City-AutoFillIcon", AI = false)
	public WebElement btnAutoFillIcon;

	@IFindBy(how = How.CSS, using = "#Accounts-AccountSearchScreen-AccountSearchDV-ContactCriteriaInputSet-globalAddressContainer-GlobalAddressInputSet-PostalCode-AutoFillIcon", AI = false)
	public WebElement btnAutoFillIcon_1;

	@IFindBy(how = How.CSS, using = "input[name='Accounts-AccountSearchScreen-AccountSearchDV-ContactCriteriaInputSet-GlobalPersonNameInputSet-LastName']", AI = false)
	public WebElement inpLastname;

	@IFindBy(how = How.CSS, using = "select[name='Accounts-AccountSearchScreen-AccountSearchDV-DelinquencyStatusCriterion']", AI = false)
	public WebElement drpStatus;

	@IFindBy(how = How.CSS, using = "input[name='Accounts-AccountSearchScreen-AccountSearchDV-ContactCriteriaInputSet-globalAddressContainer-GlobalAddressInputSet-City']", AI = false)
	public WebElement inpCity;

	@IFindBy(how = How.CSS, using = "#Accounts-AccountSearchScreen-AccountSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Search", AI = false)
	public WebElement btnSearch_1;

	@IFindBy(how = How.CSS, using = "select[name='Accounts-AccountSearchScreen-AccountSearchDV-ContactCriteriaInputSet-GlobalPersonNameInputSet-Prefix']", AI = false)
	public WebElement drpPrefix;

	@IFindBy(how = How.CSS, using = "input[name='Accounts-AccountSearchScreen-AccountSearchDV-FEINCriterion']", AI = false)
	public WebElement inpFEIN;

	@IFindBy(how = How.CSS, using = "input[name='Accounts-AccountSearchScreen-AccountSearchDV-ContactCriteriaInputSet-globalAddressContainer-GlobalAddressInputSet-County']", AI = false)
	public WebElement inpCounty;

	@IFindBy(how = How.CSS, using = "input[name='Accounts-AccountSearchScreen-AccountSearchDV-PolicyNumberCriterion']", AI = false)
	public WebElement inpPolicy;

	@IFindBy(how = How.CSS, using = "#Accounts-AccountSearchScreen-AccountSearchDV-PolicyNumberCriterion-SelectPolicyNumberCriterion", AI = false)
	public WebElement btnSearch;

	@IFindBy(how = How.CSS, using = "input[name='Accounts-AccountSearchScreen-AccountSearchDV-ContactCriteriaInputSet-GlobalPersonNameInputSet-NameSummary']", AI = false)
	public WebElement inpName;

	@IFindBy(how = How.CSS, using = "input[name='Accounts-AccountSearchScreen-AccountSearchDV-AccountNameCriterion']", AI = false)
	public WebElement inpAccountName;

	@IFindBy(how = How.CSS, using = "select[name='Accounts-AccountSearchScreen-AccountSearchDV-ContactCriteriaInputSet-globalAddressContainer-GlobalAddressInputSet-Country']", AI = false)
	public WebElement drpCountry;

	@IFindBy(how = How.CSS, using = "input[name='Accounts-AccountSearchScreen-AccountSearchDV-ContactCriteriaInputSet-GlobalContactNameInputSet-Name']", AI = false)
	public WebElement inpCompanyName;

	@IFindBy(how = How.CSS, using = "select[name='Accounts-AccountSearchScreen-AccountSearchDV-ContactCriteriaInputSet-GlobalPersonNameInputSet-Suffix']", AI = false)
	public WebElement drpSuffix;

	@IFindBy(how = How.CSS, using = "select[name='Accounts-AccountSearchScreen-AccountSearchDV-ContactCriteriaInputSet-globalAddressContainer-GlobalAddressInputSet-State']", AI = false)
	public WebElement drpState;

	@IFindBy(how = How.CSS, using = "select[name='Accounts-AccountSearchScreen-AccountSearchDV-CurrencyCriterion']", AI = false)
	public WebElement drpCurrency;

	@IFindBy(how = How.CSS, using = "select[name='Accounts-AccountSearchScreen-AccountSearchDV-AccountTypeCriterion']", AI = false)
	public WebElement drpType;

	@IFindBy(how = How.CSS, using = "input[name='Accounts-AccountSearchScreen-AccountSearchDV-OrganizationTypeCriterion']", AI = false)
	public WebElement inpOrganizationType;

	@IFindBy(how = How.CSS, using = "input[name='Accounts-AccountSearchScreen-AccountSearchDV-AccountNameKanjiCriterion']", AI = false)
	public WebElement inpAccountName_1;

	@IFindBy(how = How.CSS, using = "#Accounts-AccountSearchScreen-AccountSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Reset", AI = false)
	public WebElement btnReset;

	@IFindBy(how = How.CSS, using = "input[name='Accounts-AccountSearchScreen-AccountSearchDV-ContactCriteriaInputSet-GlobalPersonNameInputSet-FirstName']", AI = false)
	public WebElement inpFirstname;
	
	@IFindBy(how = How.CSS, using = "#Accounts-AccountSearchScreen-AccountSearchResultsLV-0-AccountNumber_button", AI = false)
    public WebElement lnkAccountNumber;

	public AccountsPage(){
	}

	public AccountsPage(WebDriver driver) {
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
}

public AccountsPage enterAddress3(String Address3) {
		            BrowserActions.type(driver, inpAddress3,Address3, "Address3");
			        return this;
           }
public AccountsPage clickHasChargeHolds(WebDriver driver)  {
					BrowserActions.click(driver, chkHasChargeHolds,"HasChargeHolds");
				    return this;
			}
public AccountsPage enterAddress1(String Address1) {
		            BrowserActions.type(driver, inpAddress1,Address1, "Address1");
			        return this;
           }
public AccountsPage enterAddress2(String Address2) {
		            BrowserActions.type(driver, inpAddress2,Address2, "Address2");
			        return this;
           }
public AccountsPage selectAccountSegment(String AccountSegment)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpAccountSegment,AccountSegment,"AccountSegment");
				    return this;
			}
public AccountsPage enterParticle(String Particle) {
		            BrowserActions.type(driver, inpParticle,Particle, "Particle");
			        return this;
           }
public AccountsPage enterAddress(String Address) {
		            BrowserActions.type(driver, inpAddress,Address, "Address");
			        return this;
           }
public AccountsPage enterAccount(WebDriver driver,String Account) {
		            BrowserActions.type(driver, inpAccount,Account, "Account");
			        return this;
           }
public AccountsPage enterMiddlename(String Middlename) {
		            BrowserActions.type(driver, inpMiddlename,Middlename, "Middlename");
			        return this;
           }
public AccountsPage enterZIPCode(String ZIPCode) {
		            BrowserActions.type(driver, inpZIPCode,ZIPCode, "ZIPCode");
			        return this;
           }
public AccountsPage clickAutoFillIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnAutoFillIcon,"AutoFillIcon");
				    return this;
			}
public AccountsPage clickAutoFillIcon_1(WebDriver driver)  {
					BrowserActions.click(driver, btnAutoFillIcon_1,"AutoFillIcon_1");
				    return this;
			}
public AccountsPage enterLastname(String Lastname) {
		            BrowserActions.type(driver, inpLastname,Lastname, "Lastname");
			        return this;
           }
public AccountsPage selectStatus(String Status)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpStatus,Status,"Status");
				    return this;
			}
public AccountsPage enterCity(String City) {
		            BrowserActions.type(driver, inpCity,City, "City");
			        return this;
           }
public AccountsPage clickSearch_1(WebDriver driver)  {
					BrowserActions.click(driver, btnSearch_1,true,"Search_1");
				    return this;
			}
public AccountsPage selectPrefix(String Prefix)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPrefix,Prefix,"Prefix");
				    return this;
			}
public AccountsPage enterFEIN(String FEIN) {
		            BrowserActions.type(driver, inpFEIN,FEIN, "FEIN");
			        return this;
           }
public AccountsPage enterCounty(String County) {
		            BrowserActions.type(driver, inpCounty,County, "County");
			        return this;
           }
public AccountsPage enterPolicy(String Policy) {
		            BrowserActions.type(driver, inpPolicy,Policy, "Policy");
			        return this;
           }
public AccountsPage clickSearch(WebDriver driver)  {
					BrowserActions.click(driver, btnSearch,true,"Search");
				    return this;
			}
public AccountsPage enterName(String Name) {
		            BrowserActions.type(driver, inpName,Name, "Name");
			        return this;
           }
public AccountsPage enterAccountName(String AccountName) {
		            BrowserActions.type(driver, inpAccountName,AccountName, "AccountName");
			        return this;
           }
public AccountsPage selectCountry(String Country)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpCountry,Country,"Country");
				    return this;
			}
public AccountsPage enterCompanyName(String CompanyName) {
		            BrowserActions.type(driver, inpCompanyName,CompanyName, "CompanyName");
			        return this;
           }
public AccountsPage selectSuffix(String Suffix)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpSuffix,Suffix,"Suffix");
				    return this;
			}
public AccountsPage selectState(String State)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpState,State,"State");
				    return this;
			}
public AccountsPage selectCurrency(String Currency)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpCurrency,Currency,"Currency");
				    return this;
			}
public AccountsPage selectType(String Type)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpType,Type,"Type");
				    return this;
			}
public AccountsPage enterOrganizationType(String OrganizationType) {
		            BrowserActions.type(driver, inpOrganizationType,OrganizationType, "OrganizationType");
			        return this;
           }
public AccountsPage enterAccountName_1(String AccountName_1) {
		            BrowserActions.type(driver, inpAccountName_1,AccountName_1, "AccountName_1");
			        return this;
           }
public AccountsPage clickReset(WebDriver driver)  {
					BrowserActions.click(driver, btnReset,"Reset");
				    return this;
			}
public AccountsPage enterFirstname(String Firstname) {
		            BrowserActions.type(driver, inpFirstname,Firstname, "Firstname");
			        return this;
           }
public AccountsPage clickAccount(WebDriver driver)  {
    BrowserActions.click(driver, lnkAccountNumber,true,"Account");
    return this;
}
}
