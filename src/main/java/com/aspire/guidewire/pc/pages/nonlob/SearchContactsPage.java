package com.aspire.guidewire.pc.pages.nonlob;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.How;

import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;
import org.openqa.selenium.support.ui.LoadableComponent;
import ASPIREAI.customfactories.AjaxElementLocatorFactory;
import ASPIREAI.customfactories.PageFactory;

import com.aspire.guidewire.utils.BrowserActions;
import com.aspire.guidewire.utils.ElementLayer;
import com.aspire.guidewire.utils.Log;
import com.aspire.guidewire.utils.WaitUtils;import org.testng.Assert;
import ASPIREAI.customfactories.IFindBy;

public class SearchContactsPage extends LoadableComponent<SearchContactsPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
 	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	@IFindBy(how = How.CSS, using = "#ContactSearch-ContactSearchScreen-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-PostalCode-AutoFillIcon", AI = false)
	public WebElement btnAutoFillIcon_1;

	@IFindBy(how = How.CSS, using = "input[name='ContactSearch-ContactSearchScreen-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-County']", AI = false)
	public WebElement inpCounty;

	@IFindBy(how = How.CSS, using = "select[name='ContactSearch-ContactSearchScreen-ContactType']", AI = false)
	public WebElement drpType;

	@IFindBy(how = How.CSS, using = "input[name='ContactSearch-ContactSearchScreen-BasicContactInfoInputSet-TaxID']", AI = false)
	public WebElement inpTaxIDEIN;

	@IFindBy(how = How.CSS, using = "input[name='ContactSearch-ContactSearchScreen-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine3']", AI = false)
	public WebElement inpAddress3;

	@IFindBy(how = How.CSS, using = "input[name='ContactSearch-ContactSearchScreen-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine1']", AI = false)
	public WebElement inpAddress1;

	@IFindBy(how = How.CSS, using = "input[name='ContactSearch-ContactSearchScreen-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine2']", AI = false)
	public WebElement inpAddress2;

	@IFindBy(how = How.CSS, using = "input[name='ContactSearch-ContactSearchScreen-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressSummary']", AI = false)
	public WebElement inpAddress;

	@IFindBy(how = How.CSS, using = "input[name='ContactSearch-ContactSearchScreen-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-PostalCode']", AI = false)
	public WebElement inpZIPCode;

	@IFindBy(how = How.CSS, using = "#ContactSearch-ContactSearchScreen-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-City-AutoFillIcon", AI = false)
	public WebElement btnAutoFillIcon;

	@IFindBy(how = How.CSS, using = "select[name='ContactSearch-ContactSearchScreen-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-Country']", AI = false)
	public WebElement drpCountry;

	@IFindBy(how = How.CSS, using = "select[name='ContactSearch-ContactSearchScreen-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-State']", AI = false)
	public WebElement drpState;

	@IFindBy(how = How.CSS, using = "input[name='ContactSearch-ContactSearchScreen-BasicContactInfoInputSet-CompanyNameExact']", AI = false)
	public WebElement chkCompanynameisanexactmatch;

	@IFindBy(how = How.CSS, using = "input[name='ContactSearch-ContactSearchScreen-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-City']", AI = false)
	public WebElement inpCity;

	@IFindBy(how = How.CSS, using = "#ContactSearch-ContactSearchScreen-SearchAndResetInputSet-SearchLinksInputSet-Search", AI = false)
	public WebElement btnSearch;

	@IFindBy(how = How.CSS, using = "input[name='ContactSearch-ContactSearchScreen-BasicContactInfoInputSet-GlobalContactNameInputSet-Name']", AI = false)
	public WebElement inpCompanyName;

	@IFindBy(how = How.CSS, using = "#ContactSearch-ContactSearchScreen-SearchAndResetInputSet-SearchLinksInputSet-Reset", AI = false)
	public WebElement btnReset;

	@IFindBy(how = How.CSS, using = "#ContactSearch-ContactSearchScreen-ContactSearchResultsLV_tb-PrintMe>div[role='button']", AI = false)
	public WebElement btnPrintExport;

	@IFindBy(how = How.CSS, using = "#ContactSearch-ContactSearchScreen-ttlBar", AI = false)
	public WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "input[name='ContactSearch-ContactSearchScreen-BasicContactInfoInputSet-PhoneNumber']", AI = false)
	public WebElement inpWorkPhone;
	
	@IFindBy(how = How.CSS, using = "input[name='ContactSearch-ContactSearchScreen-BasicContactInfoInputSet-GlobalPersonNameInputSet-Particle']", AI = false)
	private WebElement inpParticle;

	@IFindBy(how = How.CSS, using = "input[name='ContactSearch-ContactSearchScreen-BasicContactInfoInputSet-GlobalPersonNameInputSet-MiddleName']", AI = false)
	private WebElement inpMiddlename;

	@IFindBy(how = How.CSS, using = "input[name='ContactSearch-ContactSearchScreen-BasicContactInfoInputSet-GlobalPersonNameInputSet-LastName']", AI = false)
	private WebElement inpLastname;

	@IFindBy(how = How.CSS, using = "input[name='ContactSearch-ContactSearchScreen-BasicContactInfoInputSet-FirstNameExact']", AI = false)
	private WebElement chkFirstnameisanexactmatch;

	@IFindBy(how = How.CSS, using = "select[name='ContactSearch-ContactSearchScreen-BasicContactInfoInputSet-GlobalPersonNameInputSet-Prefix']", AI = false)
	private WebElement drpPrefix;

	@IFindBy(how = How.CSS, using = "input[name='ContactSearch-ContactSearchScreen-BasicContactInfoInputSet-LastNameExact']", AI = false)
	private WebElement chkLastnameisanexactmatch;

	@IFindBy(how = How.CSS, using = "input[name='ContactSearch-ContactSearchScreen-BasicContactInfoInputSet-GlobalPersonNameInputSet-NameSummary']", AI = false)
	private WebElement inpName;

	@IFindBy(how = How.CSS, using = "input[name='ContactSearch-ContactSearchScreen-BasicContactInfoInputSet-TaxID']", AI = false)
	private WebElement inpTaxIDSSN;
	
	@IFindBy(how = How.CSS, using = "select[name='ContactSearch-ContactSearchScreen-BasicContactInfoInputSet-GlobalPersonNameInputSet-Suffix']", AI = false)
	private WebElement drpSuffix;

	@IFindBy(how = How.CSS, using = "input[name='ContactSearch-ContactSearchScreen-BasicContactInfoInputSet-Phone']", AI = false)
	private WebElement inpPhone;

	@IFindBy(how = How.CSS, using = "input[name='ContactSearch-ContactSearchScreen-BasicContactInfoInputSet-GlobalPersonNameInputSet-FirstName']", AI = false)
	private WebElement inpFirstname;
	
	@IFindBy(how = How.CSS, using = "div[id$='LV-0-Name_button']", AI = false)
	public WebElement lnkUserName;

	public SearchContactsPage(){
	}

	public SearchContactsPage(WebDriver driver){
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
		}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, inpWorkPhone))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);
}
public SearchContactsPage clickAutoFillIcon_1(WebDriver driver)  {
					BrowserActions.click(driver, btnAutoFillIcon_1,"AutoFillIcon_1");
				    return this;
			}
public SearchContactsPage enterCounty(WebDriver driver,String County) {
		            BrowserActions.type(driver, inpCounty,County, "County");
			        return this;
           }
public SearchContactsPage selectType(WebDriver driver,String Type)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpType,Type,"Type");
				    return this;
			}
public SearchContactsPage enterTaxIDEIN(WebDriver driver,String TaxIDEIN) {
		            BrowserActions.type(driver, inpTaxIDEIN,TaxIDEIN, "TaxIDEIN");
			        return this;
           }
public SearchContactsPage enterAddress3(WebDriver driver,String Address3) {
		            BrowserActions.type(driver, inpAddress3,Address3, "Address3");
			        return this;
           }
public SearchContactsPage enterAddress1(WebDriver driver,String Address1) {
		            BrowserActions.type(driver, inpAddress1,Address1, "Address1");
			        return this;
           }
public SearchContactsPage enterAddress2(WebDriver driver,String Address2) {
		            BrowserActions.type(driver, inpAddress2,Address2, "Address2");
			        return this;
           }
public SearchContactsPage enterAddress(WebDriver driver,String Address) {
		            BrowserActions.type(driver, inpAddress,Address, "Address");
			        return this;
           }
public SearchContactsPage enterZIPCode(WebDriver driver,String ZIPCode) {
		            BrowserActions.type(driver, inpZIPCode,ZIPCode, "ZIPCode");
			        return this;
           }
public SearchContactsPage clickAutoFillIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnAutoFillIcon,"AutoFillIcon");
				    return this;
			}
public SearchContactsPage selectCountry(WebDriver driver,String Country)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpCountry,Country,"Country");
				    return this;
			}
public SearchContactsPage selectState(WebDriver driver,String State)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpState,State,"State");
				    return this;
			}
public SearchContactsPage clickCompanynameisanexactmatch(WebDriver driver)  {
					BrowserActions.click(driver, chkCompanynameisanexactmatch,"Companynameisanexactmatch");
				    return this;
			}
public SearchContactsPage enterCity(WebDriver driver,String City) {
		            BrowserActions.type(driver, inpCity,City, "City");
			        return this;
           }
public SearchContactsPage clickSearch(WebDriver driver)  {
					BrowserActions.click(driver, btnSearch,true,"Search");
				    return this;
			}
public SearchContactsPage enterCompanyName(WebDriver driver,String CompanyName) {
		            BrowserActions.type(driver, inpCompanyName,CompanyName, "CompanyName");
			        return this;
           }
public SearchContactsPage clickReset(WebDriver driver)  {
					BrowserActions.click(driver, btnReset,"Reset");
				    return this;
			}
public SearchContactsPage clickPrintExport(WebDriver driver)  {
					BrowserActions.click(driver, btnPrintExport,"PrintExport");
				    return this;
			}
public SearchContactsPage enterWorkPhone(WebDriver driver,String WorkPhone) {
		            BrowserActions.type(driver, inpWorkPhone,WorkPhone, "WorkPhone");
			        return this;
           }
public SearchContactsPage enterParticle(WebDriver driver,String Particle) {
    BrowserActions.type(driver, inpParticle,Particle, "Particle");
    return this;
}
public SearchContactsPage enterMiddlename(WebDriver driver,String Middlename) {
    BrowserActions.type(driver, inpMiddlename,Middlename, "Middlename");
    return this;
}
public SearchContactsPage enterLastname(WebDriver driver,String Lastname) {
    BrowserActions.type(driver, inpLastname,Lastname, "Lastname");
    return this;
}
public SearchContactsPage clickFirstnameisanexactmatch(WebDriver driver)  {
	BrowserActions.click(driver, chkFirstnameisanexactmatch,"Firstnameisanexactmatch");
    return this;
}
public SearchContactsPage selectPrefix(WebDriver driver,String Prefix)  {
	BrowserActions.selectDropDownByVisibleText(driver, drpPrefix,Prefix,"Prefix");
    return this;
}
public SearchContactsPage clickLastnameisanexactmatch(WebDriver driver)  {
	BrowserActions.click(driver, chkLastnameisanexactmatch,"Lastnameisanexactmatch");
    return this;
}
public SearchContactsPage enterName(WebDriver driver,String Name) {
    BrowserActions.type(driver, inpName,Name, "Name");
    return this;
}
public SearchContactsPage enterTaxIDSSN(WebDriver driver,String TaxIDSSN) {
    BrowserActions.type(driver, inpTaxIDSSN,TaxIDSSN, "TaxIDSSN");
    return this;
}
public SearchContactsPage selectSuffix(WebDriver driver,String Suffix)  {
	BrowserActions.selectDropDownByVisibleText(driver, drpSuffix,Suffix,"Suffix");
    return this;
}
public SearchContactsPage enterPhone(WebDriver driver,String Phone) {
    BrowserActions.type(driver, inpPhone,Phone, "Phone");
    return this;
}
public SearchContactsPage enterFirstname(WebDriver driver,String Firstname) {
    BrowserActions.type(driver, inpFirstname,Firstname, "Firstname");
    return this;
}
/**
 * @author charu.anbarasan
 * click select user button
 * @param driver
 * @return
 */
public void clickOnUser(WebDriver driver){
	BrowserActions.click(driver, lnkUserName ,1,"User Name");

}
}
