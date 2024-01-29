package com.aspire.guidewire.pc.pages.nonlob;

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

public class RewritePoliciesToThisAccountPage extends LoadableComponent<RewritePoliciesToThisAccountPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
 	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	@IFindBy(how = How.CSS, using = "#AccountFile_AccountSearch-OtherAccountSearchScreen-ttlBar", AI = false)
	private WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "input[name='AccountFile_AccountSearch-OtherAccountSearchScreen-AccountSearchDV-CompanyNameExact']", AI = false)
	private WebElement chkCompanynameisanexactmatch;

	@IFindBy(how = How.CSS, using = "input[name='AccountFile_AccountSearch-OtherAccountSearchScreen-AccountSearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine3']", AI = false)
	private WebElement inpAddress3;

	@IFindBy(how = How.CSS, using = "input[name='AccountFile_AccountSearch-OtherAccountSearchScreen-AccountSearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine1']", AI = false)
	private WebElement inpAddress1;

	@IFindBy(how = How.CSS, using = "input[name='AccountFile_AccountSearch-OtherAccountSearchScreen-AccountSearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine2']", AI = false)
	private WebElement inpAddress2;

	@IFindBy(how = How.CSS, using = "input[name='AccountFile_AccountSearch-OtherAccountSearchScreen-AccountSearchDV-ProducerOrganization']", AI = false)
	private WebElement inpProducer;

	@IFindBy(how = How.CSS, using = "input[name='AccountFile_AccountSearch-OtherAccountSearchScreen-AccountSearchDV-GlobalPersonNameInputSet-Particle']", AI = false)
	private WebElement inpParticle;

	@IFindBy(how = How.CSS, using = "input[name='AccountFile_AccountSearch-OtherAccountSearchScreen-AccountSearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressSummary']", AI = false)
	private WebElement inpAddress;

	@IFindBy(how = How.CSS, using = "input[name='AccountFile_AccountSearch-OtherAccountSearchScreen-AccountSearchDV-ProducerCode']", AI = false)
	private WebElement inpProducerCode;

	@IFindBy(how = How.CSS, using = "#AccountFile_AccountSearch-OtherAccountSearchScreen-AccountSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Search", AI = false)
	private WebElement btnSearch_3;

	@IFindBy(how = How.CSS, using = "input[name='AccountFile_AccountSearch-OtherAccountSearchScreen-AccountSearchDV-AccountNumber']", AI = false)
	private WebElement inpAccountNumber;

	@IFindBy(how = How.CSS, using = "input[name='AccountFile_AccountSearch-OtherAccountSearchScreen-AccountSearchDV-GlobalPersonNameInputSet-MiddleName']", AI = false)
	private WebElement inpMiddlename;

	@IFindBy(how = How.CSS, using = "input[name='AccountFile_AccountSearch-OtherAccountSearchScreen-AccountSearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-PostalCode']", AI = false)
	private WebElement inpZIPCode;

	@IFindBy(how = How.CSS, using = "#AccountFile_AccountSearch-OtherAccountSearchScreen-AccountSearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-City-AutoFillIcon", AI = false)
	private WebElement btnAutoFillIcon;

	@IFindBy(how = How.CSS, using = "input[name='AccountFile_AccountSearch-OtherAccountSearchScreen-AccountSearchDV-GlobalPersonNameInputSet-LastName']", AI = false)
	private WebElement inpLastname;

	@IFindBy(how = How.CSS, using = "input[name='AccountFile_AccountSearch-OtherAccountSearchScreen-AccountSearchDV-FirstNameExact']", AI = false)
	private WebElement chkFirstnameisanexactmatch;

	@IFindBy(how = How.CSS, using = "#AccountFile_AccountSearch-OtherAccountSearchScreen-AccountSearchDV-ProducerCode-SelectProducerCode", AI = false)
	private WebElement btnSearch_1;

	@IFindBy(how = How.CSS, using = "input[name='AccountFile_AccountSearch-OtherAccountSearchScreen-AccountSearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-City']", AI = false)
	private WebElement inpCity;

	@IFindBy(how = How.CSS, using = "#AccountFile_AccountSearch-OtherAccountSearchScreen-AccountSearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-PostalCode-AutoFillIcon", AI = false)
	private WebElement btnAutoFillIcon_2;

	@IFindBy(how = How.CSS, using = "select[name='AccountFile_AccountSearch-OtherAccountSearchScreen-AccountSearchDV-GlobalPersonNameInputSet-Prefix']", AI = false)
	private WebElement drpPrefix;

	@IFindBy(how = How.CSS, using = "input[name='AccountFile_AccountSearch-OtherAccountSearchScreen-AccountSearchDV-LastNameExact']", AI = false)
	private WebElement chkLastnameisanexactmatch;

	@IFindBy(how = How.CSS, using = "input[name='AccountFile_AccountSearch-OtherAccountSearchScreen-AccountSearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-County']", AI = false)
	private WebElement inpCounty;

	@IFindBy(how = How.CSS, using = "#AccountFile_AccountSearch-OtherAccountSearchScreen-AccountSearchDV-IndustryCode-SelectIndustryCode", AI = false)
	private WebElement btnSearch;

	@IFindBy(how = How.CSS, using = "input[name='AccountFile_AccountSearch-OtherAccountSearchScreen-AccountSearchDV-GlobalPersonNameInputSet-NameSummary']", AI = false)
	private WebElement inpName;

	@IFindBy(how = How.CSS, using = "select[name='AccountFile_AccountSearch-OtherAccountSearchScreen-AccountSearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-Country']", AI = false)
	private WebElement drpCountry;

	@IFindBy(how = How.CSS, using = "input[name='AccountFile_AccountSearch-OtherAccountSearchScreen-AccountSearchDV-GlobalContactNameInputSet-Name']", AI = false)
	private WebElement inpCompanyName;

	@IFindBy(how = How.CSS, using = "select[name='AccountFile_AccountSearch-OtherAccountSearchScreen-AccountSearchDV-GlobalPersonNameInputSet-Suffix']", AI = false)
	private WebElement drpSuffix;

	@IFindBy(how = How.CSS, using = "select[name='AccountFile_AccountSearch-OtherAccountSearchScreen-AccountSearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-State']", AI = false)
	private WebElement drpState;

	@IFindBy(how = How.CSS, using = "input[name='AccountFile_AccountSearch-OtherAccountSearchScreen-AccountSearchDV-TaxID']", AI = false)
	private WebElement inpTaxID;

	@IFindBy(how = How.CSS, using = "#AccountFile_AccountSearch-OtherAccountSearchScreen-AccountSearchDV-ProducerOrganization-SelectOrganization", AI = false)
	private WebElement btnSelectOrganization;

	@IFindBy(how = How.CSS, using = "input[name='AccountFile_AccountSearch-OtherAccountSearchScreen-AccountSearchDV-IndustryCode']", AI = false)
	private WebElement inpIndustryCode;

	@IFindBy(how = How.CSS, using = "input[name='AccountFile_AccountSearch-OtherAccountSearchScreen-AccountSearchDV-Phone']", AI = false)
	private WebElement inpPhone;

	@IFindBy(how = How.CSS, using = "input[name='AccountFile_AccountSearch-OtherAccountSearchScreen-AccountSearchDV-SearchRelatedAccountsOnly']", AI = false)
	private WebElement chkRelatedto9317777706;

	@IFindBy(how = How.CSS, using = "#AccountFile_AccountSearch-OtherAccountSearchScreen-AccountSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Reset", AI = false)
	private WebElement btnReset;

	@IFindBy(how = How.CSS, using = "input[name='AccountFile_AccountSearch-OtherAccountSearchScreen-AccountSearchDV-GlobalPersonNameInputSet-FirstName']", AI = false)
	private WebElement inpFirstname;
	
	@IFindBy(how = How.CSS, using = "div[id$='Select']", AI = false)
	public WebElement btnSelect;
	
	@IFindBy(how = How.CSS, using = "input[name$='AccountFile_PolicySelectionLV-0-_Checkbox']", AI = false)
	public WebElement chkpoliciesCheckBox;
	
	@IFindBy(how = How.CSS, using = "input[name$='AccountFile_PolicySelectionLV-1-_Checkbox']", AI = false)
	public WebElement chkpoliciesCheckBox_1;
	
	@IFindBy(how = How.CSS, using = "div[id='AccountFile_RewritePoliciesSelection-0']", AI = false)
	public WebElement btnRewritePoliciesToThisAccount;

	public RewritePoliciesToThisAccountPage(){
	}

	public RewritePoliciesToThisAccountPage(WebDriver driver) throws Exception{
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
		}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, inpFirstname))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);
}public RewritePoliciesToThisAccountPage clickCompanynameisanexactmatch(WebDriver driver)  {
					BrowserActions.click(driver, chkCompanynameisanexactmatch,"Companynameisanexactmatch");
				    return this;
			}
public RewritePoliciesToThisAccountPage enterAddress3(WebDriver driver,String Address3) {
		            BrowserActions.type(driver, inpAddress3,Address3, "Address3");
			        return this;
           }
public RewritePoliciesToThisAccountPage enterAddress1(WebDriver driver,String Address1) {
		            BrowserActions.type(driver, inpAddress1,Address1, "Address1");
			        return this;
           }
public RewritePoliciesToThisAccountPage enterAddress2(WebDriver driver,String Address2) {
		            BrowserActions.type(driver, inpAddress2,Address2, "Address2");
			        return this;
           }
public RewritePoliciesToThisAccountPage enterProducer(WebDriver driver,String Producer) {
		            BrowserActions.type(driver, inpProducer,Producer, "Producer");
			        return this;
           }
public RewritePoliciesToThisAccountPage enterParticle(WebDriver driver,String Particle) {
		            BrowserActions.type(driver, inpParticle,Particle, "Particle");
			        return this;
           }
public RewritePoliciesToThisAccountPage enterAddress(WebDriver driver,String Address) {
		            BrowserActions.type(driver, inpAddress,Address, "Address");
			        return this;
           }
public RewritePoliciesToThisAccountPage enterProducerCode(WebDriver driver,String ProducerCode) {
		            BrowserActions.type(driver, inpProducerCode,ProducerCode, "ProducerCode");
			        return this;
           }
public RewritePoliciesToThisAccountPage clickSearch_3(WebDriver driver)  {
					BrowserActions.click(driver, btnSearch_3,"Search_3");
				    return this;
			}
public RewritePoliciesToThisAccountPage enterAccountNumber(WebDriver driver,String AccountNumber) {
		            BrowserActions.type(driver, inpAccountNumber,AccountNumber, "AccountNumber");
			        return this;
           }
public RewritePoliciesToThisAccountPage enterMiddlename(WebDriver driver,String Middlename) {
		            BrowserActions.type(driver, inpMiddlename,Middlename, "Middlename");
			        return this;
           }
public RewritePoliciesToThisAccountPage enterZIPCode(WebDriver driver,String ZIPCode) {
		            BrowserActions.type(driver, inpZIPCode,ZIPCode, "ZIPCode");
			        return this;
           }
public RewritePoliciesToThisAccountPage clickAutoFillIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnAutoFillIcon,"AutoFillIcon");
				    return this;
			}
public RewritePoliciesToThisAccountPage enterLastname(WebDriver driver,String Lastname) {
		            BrowserActions.type(driver, inpLastname,Lastname, "Lastname");
			        return this;
           }
public RewritePoliciesToThisAccountPage clickFirstnameisanexactmatch(WebDriver driver)  {
					BrowserActions.click(driver, chkFirstnameisanexactmatch,"Firstnameisanexactmatch");
				    return this;
			}
public RewritePoliciesToThisAccountPage clickSearch_1(WebDriver driver)  {
					BrowserActions.click(driver, btnSearch_1,"Search_1");
				    return this;
			}
public RewritePoliciesToThisAccountPage enterCity(WebDriver driver,String City) {
		            BrowserActions.type(driver, inpCity,City, "City");
			        return this;
           }
public RewritePoliciesToThisAccountPage clickAutoFillIcon_2(WebDriver driver)  {
					BrowserActions.click(driver, btnAutoFillIcon_2,"AutoFillIcon_2");
				    return this;
			}
public RewritePoliciesToThisAccountPage selectPrefix(WebDriver driver,String Prefix)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPrefix,Prefix,"Prefix");
				    return this;
			}
public RewritePoliciesToThisAccountPage clickLastnameisanexactmatch(WebDriver driver)  {
					BrowserActions.click(driver, chkLastnameisanexactmatch,"Lastnameisanexactmatch");
				    return this;
			}
public RewritePoliciesToThisAccountPage enterCounty(WebDriver driver,String County) {
		            BrowserActions.type(driver, inpCounty,County, "County");
			        return this;
           }
public RewritePoliciesToThisAccountPage clickSearch(WebDriver driver)  {
					BrowserActions.click(driver, btnSearch,"Search");
				    return this;
			}
public RewritePoliciesToThisAccountPage enterName(WebDriver driver,String Name) {
		            BrowserActions.type(driver, inpName,Name, "Name");
			        return this;
           }
public RewritePoliciesToThisAccountPage selectCountry(WebDriver driver,String Country)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpCountry,Country,"Country");
				    return this;
			}
public RewritePoliciesToThisAccountPage enterCompanyName(WebDriver driver,String CompanyName) {
		            BrowserActions.type(driver, inpCompanyName,CompanyName, "CompanyName");
			        return this;
           }
public RewritePoliciesToThisAccountPage selectSuffix(WebDriver driver,String Suffix)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpSuffix,Suffix,"Suffix");
				    return this;
			}
public RewritePoliciesToThisAccountPage selectState(WebDriver driver,String State)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpState,State,"State");
				    return this;
			}
public RewritePoliciesToThisAccountPage enterTaxID(WebDriver driver,String TaxID) {
		            BrowserActions.type(driver, inpTaxID,TaxID, "TaxID");
			        return this;
           }
public RewritePoliciesToThisAccountPage clickSelectOrganization(WebDriver driver)  {
					BrowserActions.click(driver, btnSelectOrganization,"SelectOrganization");
				    return this;
			}
public RewritePoliciesToThisAccountPage enterIndustryCode(WebDriver driver,String IndustryCode) {
		            BrowserActions.type(driver, inpIndustryCode,IndustryCode, "IndustryCode");
			        return this;
           }
public RewritePoliciesToThisAccountPage enterPhone(WebDriver driver,String Phone) {
		            BrowserActions.type(driver, inpPhone,Phone, "Phone");
			        return this;
           }
public RewritePoliciesToThisAccountPage clickRelatedto9317777706(WebDriver driver)  {
					BrowserActions.click(driver, chkRelatedto9317777706,"Relatedto9317777706");
				    return this;
			}
public RewritePoliciesToThisAccountPage clickReset(WebDriver driver)  {
					BrowserActions.click(driver, btnReset,"Reset");
				    return this;
			}
public RewritePoliciesToThisAccountPage enterFirstname(WebDriver driver,String Firstname) {
		            BrowserActions.type(driver, inpFirstname,Firstname, "Firstname");
			        return this;
           }
public RewritePoliciesToThisAccountPage clickSelect(WebDriver driver)  {
	BrowserActions.click(driver, btnSelect,"Account Select");
	return this;
}

public RewritePoliciesToThisAccountPage clicKPoliciesCheckBox(WebDriver driver)  {
	BrowserActions.click(driver, chkpoliciesCheckBox,"Policies Check Box");
	return this;
}
public RewritePoliciesToThisAccountPage clicKPoliciesCheckBox_1(WebDriver driver)  {
	BrowserActions.click(driver, chkpoliciesCheckBox_1,"Policies Check Box");
	return this;
}
public RewritePoliciesToThisAccountPage clickRewritePoliciesToThisAccount(WebDriver driver)  {
	BrowserActions.click(driver, btnRewritePoliciesToThisAccount,"Rewrite Policies To This Account");
	return this;
}

public class OrganizationsPage extends LoadableComponent<OrganizationsPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
 	public List<Object> pageFactoryKey = new ArrayList<Object>();
	public List<String> pageFactoryValue = new ArrayList<String>();

	@IFindBy(how = How.CSS, using = "#OrganizationSearchPopup-OrganizationSearchPopupScreen-ttlBar", AI = false)
	private WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "#OrganizationSearchPopup-__crumb__", AI = false)
	private WebElement btn__crumb__;

	@IFindBy(how = How.CSS, using = "input[name='OrganizationSearchPopup-OrganizationSearchPopupScreen-OrganizationSearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine3']", AI = false)
	private WebElement inpAddress3;

	@IFindBy(how = How.CSS, using = "input[name='OrganizationSearchPopup-OrganizationSearchPopupScreen-OrganizationSearchDV-GlobalContactNameInputSet-Name']", AI = false)
	private WebElement inpOrganizationName;

	@IFindBy(how = How.CSS, using = "input[name='OrganizationSearchPopup-OrganizationSearchPopupScreen-OrganizationSearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine1']", AI = false)
	private WebElement inpAddress1;

	@IFindBy(how = How.CSS, using = "input[name='OrganizationSearchPopup-OrganizationSearchPopupScreen-OrganizationSearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine2']", AI = false)
	private WebElement inpAddress2;

	@IFindBy(how = How.CSS, using = "select[name='OrganizationSearchPopup-OrganizationSearchPopupScreen-OrganizationSearchDV-ProducerStatus']", AI = false)
	private WebElement drpProducerStatus;

	@IFindBy(how = How.CSS, using = "input[name='OrganizationSearchPopup-OrganizationSearchPopupScreen-OrganizationSearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressSummary']", AI = false)
	private WebElement inpAddress;

	@IFindBy(how = How.CSS, using = "input[name='OrganizationSearchPopup-OrganizationSearchPopupScreen-OrganizationSearchDV-AccountNumber']", AI = false)
	private WebElement inpAccount;

	@IFindBy(how = How.CSS, using = "input[name='OrganizationSearchPopup-OrganizationSearchPopupScreen-OrganizationSearchDV-ProducerCode']", AI = false)
	private WebElement inpProducerCode;

	@IFindBy(how = How.CSS, using = "input[name='OrganizationSearchPopup-OrganizationSearchPopupScreen-OrganizationSearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-PostalCode']", AI = false)
	private WebElement inpZIPCode;

	@IFindBy(how = How.CSS, using = "select[name='OrganizationSearchPopup-OrganizationSearchPopupScreen-OrganizationSearchDV-Type']", AI = false)
	private WebElement drpOrganizationType;

	@IFindBy(how = How.CSS, using = "#OrganizationSearchPopup-OrganizationSearchPopupScreen-OrganizationSearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-City-AutoFillIcon", AI = false)
	private WebElement btnAutoFillIcon;

	@IFindBy(how = How.CSS, using = "#OrganizationSearchPopup-OrganizationSearchPopupScreen-OrganizationSearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-PostalCode-AutoFillIcon", AI = false)
	private WebElement btnAutoFillIcon_1;

	@IFindBy(how = How.CSS, using = "input[name='OrganizationSearchPopup-OrganizationSearchPopupScreen-OrganizationSearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-City']", AI = false)
	private WebElement inpCity;

	@IFindBy(how = How.CSS, using = "input[name='OrganizationSearchPopup-OrganizationSearchPopupScreen-OrganizationSearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-County']", AI = false)
	private WebElement inpCounty;

	@IFindBy(how = How.CSS, using = "select[name='OrganizationSearchPopup-OrganizationSearchPopupScreen-OrganizationSearchDV-Tier']", AI = false)
	private WebElement drpProducerTier;

	@IFindBy(how = How.CSS, using = "input[name='OrganizationSearchPopup-OrganizationSearchPopupScreen-OrganizationSearchDV-PolicyNumber']", AI = false)
	private WebElement inpPolicy;

	@IFindBy(how = How.CSS, using = "#OrganizationSearchPopup-OrganizationSearchPopupScreen-OrganizationSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Search", AI = false)
	private WebElement btnSearch;

	@IFindBy(how = How.CSS, using = "input[name='OrganizationSearchPopup-OrganizationSearchPopupScreen-OrganizationSearchDV-BranchCode']", AI = false)
	private WebElement inpBranchCode;

	@IFindBy(how = How.CSS, using = "select[name='OrganizationSearchPopup-OrganizationSearchPopupScreen-OrganizationSearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-Country']", AI = false)
	private WebElement drpCountry;

	@IFindBy(how = How.CSS, using = "select[name='OrganizationSearchPopup-OrganizationSearchPopupScreen-OrganizationSearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-State']", AI = false)
	private WebElement drpState;

	@IFindBy(how = How.CSS, using = "#OrganizationSearchPopup-OrganizationSearchPopupScreen-OrganizationSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Reset", AI = false)
	private WebElement btnReset;

	public OrganizationsPage(){
	}

	public OrganizationsPage(WebDriver driver) throws Exception{
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
		}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, btnReset))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);
}public OrganizationsPage click__crumb__(WebDriver driver)  {
					BrowserActions.click(driver, btn__crumb__,"__crumb__");
				    return this;
			}
public OrganizationsPage enterAddress3(WebDriver driver,String Address3) {
		            BrowserActions.type(driver, inpAddress3,Address3, "Address3");
			        return this;
           }
public OrganizationsPage enterOrganizationName(WebDriver driver,String OrganizationName) {
		            BrowserActions.type(driver, inpOrganizationName,OrganizationName, "OrganizationName");
			        return this;
           }
public OrganizationsPage enterAddress1(WebDriver driver,String Address1) {
		            BrowserActions.type(driver, inpAddress1,Address1, "Address1");
			        return this;
           }
public OrganizationsPage enterAddress2(WebDriver driver,String Address2) {
		            BrowserActions.type(driver, inpAddress2,Address2, "Address2");
			        return this;
           }
public OrganizationsPage selectProducerStatus(WebDriver driver,String ProducerStatus)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpProducerStatus,ProducerStatus,"ProducerStatus");
				    return this;
			}
public OrganizationsPage enterAddress(WebDriver driver,String Address) {
		            BrowserActions.type(driver, inpAddress,Address, "Address");
			        return this;
           }
public OrganizationsPage enterAccount(WebDriver driver,String Account) {
		            BrowserActions.type(driver, inpAccount,Account, "Account");
			        return this;
           }
public OrganizationsPage enterProducerCode(WebDriver driver,String ProducerCode) {
		            BrowserActions.type(driver, inpProducerCode,ProducerCode, "ProducerCode");
			        return this;
           }
public OrganizationsPage enterZIPCode(WebDriver driver,String ZIPCode) {
		            BrowserActions.type(driver, inpZIPCode,ZIPCode, "ZIPCode");
			        return this;
           }
public OrganizationsPage selectOrganizationType(WebDriver driver,String OrganizationType)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpOrganizationType,OrganizationType,"OrganizationType");
				    return this;
			}
public OrganizationsPage clickAutoFillIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnAutoFillIcon,"AutoFillIcon");
				    return this;
			}
public OrganizationsPage clickAutoFillIcon_1(WebDriver driver)  {
					BrowserActions.click(driver, btnAutoFillIcon_1,"AutoFillIcon_1");
				    return this;
			}
public OrganizationsPage enterCity(WebDriver driver,String City) {
		            BrowserActions.type(driver, inpCity,City, "City");
			        return this;
           }
public OrganizationsPage enterCounty(WebDriver driver,String County) {
		            BrowserActions.type(driver, inpCounty,County, "County");
			        return this;
           }
public OrganizationsPage selectProducerTier(WebDriver driver,String ProducerTier)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpProducerTier,ProducerTier,"ProducerTier");
				    return this;
			}
public OrganizationsPage enterPolicy(WebDriver driver,String Policy) {
		            BrowserActions.type(driver, inpPolicy,Policy, "Policy");
			        return this;
           }
public OrganizationsPage clickSearch(WebDriver driver)  {
					BrowserActions.click(driver, btnSearch,"Search");
				    return this;
			}
public OrganizationsPage enterBranchCode(WebDriver driver,String BranchCode) {
		            BrowserActions.type(driver, inpBranchCode,BranchCode, "BranchCode");
			        return this;
           }
public OrganizationsPage selectCountry(WebDriver driver,String Country)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpCountry,Country,"Country");
				    return this;
			}
public OrganizationsPage selectState(WebDriver driver,String State)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpState,State,"State");
				    return this;
			}
public OrganizationsPage clickReset(WebDriver driver)  {
					BrowserActions.click(driver, btnReset,"Reset");
				    return this;
			}
}
public class ProducerCodePage extends LoadableComponent<ProducerCodePage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
 	public List<Object> pageFactoryKey = new ArrayList<Object>();
	public List<String> pageFactoryValue = new ArrayList<String>();

	@IFindBy(how = How.CSS, using = "#ProducerCodeSearchPopup-ProducerCodeSearchScreen-ttlBar", AI = false)
	private WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "#ProducerCodeSearchPopup-ProducerCodeSearchScreen-ProducerCodeSearchDV-PrefUW-UserBrowseMenuItem", AI = false)
	private WebElement btnSelectUser_1;

	@IFindBy(how = How.CSS, using = "#ProducerCodeSearchPopup-__crumb__", AI = false)
	private WebElement btn__crumb__;

	@IFindBy(how = How.CSS, using = "input[name='ProducerCodeSearchPopup-ProducerCodeSearchScreen-ProducerCodeSearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine3']", AI = false)
	private WebElement inpAddress3;

	@IFindBy(how = How.CSS, using = "input[name='ProducerCodeSearchPopup-ProducerCodeSearchScreen-ProducerCodeSearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine1']", AI = false)
	private WebElement inpAddress1;

	@IFindBy(how = How.CSS, using = "input[name='ProducerCodeSearchPopup-ProducerCodeSearchScreen-ProducerCodeSearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine2']", AI = false)
	private WebElement inpAddress2;

	@IFindBy(how = How.CSS, using = "input[name='ProducerCodeSearchPopup-ProducerCodeSearchScreen-ProducerCodeSearchDV-Description']", AI = false)
	private WebElement inpDescription;

	@IFindBy(how = How.CSS, using = "input[name='ProducerCodeSearchPopup-ProducerCodeSearchScreen-ProducerCodeSearchDV-Organization']", AI = false)
	private WebElement inpOrganization;

	@IFindBy(how = How.CSS, using = "input[name='ProducerCodeSearchPopup-ProducerCodeSearchScreen-ProducerCodeSearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressSummary']", AI = false)
	private WebElement inpAddress;

	@IFindBy(how = How.CSS, using = "input[name='ProducerCodeSearchPopup-ProducerCodeSearchScreen-ProducerCodeSearchDV-Code']", AI = false)
	private WebElement inpProducerCode;

	@IFindBy(how = How.CSS, using = "input[name='ProducerCodeSearchPopup-ProducerCodeSearchScreen-ProducerCodeSearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-PostalCode']", AI = false)
	private WebElement inpZIPCode;

	@IFindBy(how = How.CSS, using = "#ProducerCodeSearchPopup-ProducerCodeSearchScreen-ProducerCodeSearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-City-AutoFillIcon", AI = false)
	private WebElement btnAutoFillIcon;

	@IFindBy(how = How.CSS, using = "select[name='ProducerCodeSearchPopup-ProducerCodeSearchScreen-ProducerCodeSearchDV-Status']", AI = false)
	private WebElement drpStatus;

	@IFindBy(how = How.CSS, using = "input[name='ProducerCodeSearchPopup-ProducerCodeSearchScreen-ProducerCodeSearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-City']", AI = false)
	private WebElement inpCity;

	@IFindBy(how = How.CSS, using = "#ProducerCodeSearchPopup-ProducerCodeSearchScreen-ProducerCodeSearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-PostalCode-AutoFillIcon", AI = false)
	private WebElement btnAutoFillIcon_2;

	@IFindBy(how = How.CSS, using = "input[name='ProducerCodeSearchPopup-ProducerCodeSearchScreen-ProducerCodeSearchDV-User']", AI = false)
	private WebElement inpAvailabletoUser;

	@IFindBy(how = How.CSS, using = "input[name='ProducerCodeSearchPopup-ProducerCodeSearchScreen-ProducerCodeSearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-County']", AI = false)
	private WebElement inpCounty;

	@IFindBy(how = How.CSS, using = "input[name='ProducerCodeSearchPopup-ProducerCodeSearchScreen-ProducerCodeSearchDV-ParentCode']", AI = false)
	private WebElement inpParentProducerCode;

	@IFindBy(how = How.CSS, using = "#ProducerCodeSearchPopup-ProducerCodeSearchScreen-ProducerCodeSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Search", AI = false)
	private WebElement btnSearch;

	@IFindBy(how = How.CSS, using = "input[name='ProducerCodeSearchPopup-ProducerCodeSearchScreen-ProducerCodeSearchDV-MissingPrefUW']", AI = false)
	private WebElement chkMissingPrefUW;

	@IFindBy(how = How.CSS, using = "#ProducerCodeSearchPopup-ProducerCodeSearchScreen-ProducerCodeSearchDV-User-UserBrowseMenuItem", AI = false)
	private WebElement btnSelectUser;

	@IFindBy(how = How.CSS, using = "select[name='ProducerCodeSearchPopup-ProducerCodeSearchScreen-ProducerCodeSearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-Country']", AI = false)
	private WebElement drpCountry;

	@IFindBy(how = How.CSS, using = "select[name='ProducerCodeSearchPopup-ProducerCodeSearchScreen-ProducerCodeSearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-State']", AI = false)
	private WebElement drpState;

	@IFindBy(how = How.CSS, using = "select[name='ProducerCodeSearchPopup-ProducerCodeSearchScreen-ProducerCodeSearchDV-Currency']", AI = false)
	private WebElement drpCurrency;

	@IFindBy(how = How.CSS, using = "#ProducerCodeSearchPopup-ProducerCodeSearchScreen-ProducerCodeSearchDV-Organization-SelectOrganization", AI = false)
	private WebElement btnSelectOrganization;

	@IFindBy(how = How.CSS, using = "input[name='ProducerCodeSearchPopup-ProducerCodeSearchScreen-ProducerCodeSearchDV-PrefUW']", AI = false)
	private WebElement inpPreferredUnderwriter;

	@IFindBy(how = How.CSS, using = "select[name='ProducerCodeSearchPopup-ProducerCodeSearchScreen-ProducerCodeSearchDV-BranchCode']", AI = false)
	private WebElement drpBranchCode;

	@IFindBy(how = How.CSS, using = "#ProducerCodeSearchPopup-ProducerCodeSearchScreen-ProducerCodeSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Reset", AI = false)
	private WebElement btnReset;

	@IFindBy(how = How.CSS, using = "#ProducerCodeSearchPopup-ProducerCodeSearchScreen-ProducerCodeSearchLV_tb-PrintMe>div[role='button']", AI = false)
	private WebElement btnPrintExport;

	public ProducerCodePage(){
	}

	public ProducerCodePage(WebDriver driver) throws Exception{
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
}public ProducerCodePage clickSelectUser_1(WebDriver driver)  {
					BrowserActions.click(driver, btnSelectUser_1,"SelectUser_1");
				    return this;
			}
public ProducerCodePage click__crumb__(WebDriver driver)  {
					BrowserActions.click(driver, btn__crumb__,"__crumb__");
				    return this;
			}
public ProducerCodePage enterAddress3(WebDriver driver,String Address3) {
		            BrowserActions.type(driver, inpAddress3,Address3, "Address3");
			        return this;
           }
public ProducerCodePage enterAddress1(WebDriver driver,String Address1) {
		            BrowserActions.type(driver, inpAddress1,Address1, "Address1");
			        return this;
           }
public ProducerCodePage enterAddress2(WebDriver driver,String Address2) {
		            BrowserActions.type(driver, inpAddress2,Address2, "Address2");
			        return this;
           }
public ProducerCodePage enterDescription(WebDriver driver,String Description) {
		            BrowserActions.type(driver, inpDescription,Description, "Description");
			        return this;
           }
public ProducerCodePage enterOrganization(WebDriver driver,String Organization) {
		            BrowserActions.type(driver, inpOrganization,Organization, "Organization");
			        return this;
           }
public ProducerCodePage enterAddress(WebDriver driver,String Address) {
		            BrowserActions.type(driver, inpAddress,Address, "Address");
			        return this;
           }
public ProducerCodePage enterProducerCode(WebDriver driver,String ProducerCode) {
		            BrowserActions.type(driver, inpProducerCode,ProducerCode, "ProducerCode");
			        return this;
           }
public ProducerCodePage enterZIPCode(WebDriver driver,String ZIPCode) {
		            BrowserActions.type(driver, inpZIPCode,ZIPCode, "ZIPCode");
			        return this;
           }
public ProducerCodePage clickAutoFillIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnAutoFillIcon,"AutoFillIcon");
				    return this;
			}
public ProducerCodePage selectStatus(WebDriver driver,String Status)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpStatus,Status,"Status");
				    return this;
			}
public ProducerCodePage enterCity(WebDriver driver,String City) {
		            BrowserActions.type(driver, inpCity,City, "City");
			        return this;
           }
public ProducerCodePage clickAutoFillIcon_2(WebDriver driver)  {
					BrowserActions.click(driver, btnAutoFillIcon_2,"AutoFillIcon_2");
				    return this;
			}
public ProducerCodePage enterAvailabletoUser(WebDriver driver,String AvailabletoUser) {
		            BrowserActions.type(driver, inpAvailabletoUser,AvailabletoUser, "AvailabletoUser");
			        return this;
           }
public ProducerCodePage enterCounty(WebDriver driver,String County) {
		            BrowserActions.type(driver, inpCounty,County, "County");
			        return this;
           }
public ProducerCodePage enterParentProducerCode(WebDriver driver,String ParentProducerCode) {
		            BrowserActions.type(driver, inpParentProducerCode,ParentProducerCode, "ParentProducerCode");
			        return this;
           }
public ProducerCodePage clickSearch(WebDriver driver)  {
					BrowserActions.click(driver, btnSearch,"Search");
				    return this;
			}
public ProducerCodePage clickMissingPrefUW(WebDriver driver)  {
					BrowserActions.click(driver, chkMissingPrefUW,"MissingPrefUW");
				    return this;
			}
public ProducerCodePage clickSelectUser(WebDriver driver)  {
					BrowserActions.click(driver, btnSelectUser,"SelectUser");
				    return this;
			}
public ProducerCodePage selectCountry(WebDriver driver,String Country)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpCountry,Country,"Country");
				    return this;
			}
public ProducerCodePage selectState(WebDriver driver,String State)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpState,State,"State");
				    return this;
			}
public ProducerCodePage selectCurrency(WebDriver driver,String Currency)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpCurrency,Currency,"Currency");
				    return this;
			}
public ProducerCodePage clickSelectOrganization(WebDriver driver)  {
					BrowserActions.click(driver, btnSelectOrganization,"SelectOrganization");
				    return this;
			}
public ProducerCodePage enterPreferredUnderwriter(WebDriver driver,String PreferredUnderwriter) {
		            BrowserActions.type(driver, inpPreferredUnderwriter,PreferredUnderwriter, "PreferredUnderwriter");
			        return this;
           }
public ProducerCodePage selectBranchCode(WebDriver driver,String BranchCode)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpBranchCode,BranchCode,"BranchCode");
				    return this;
			}
public ProducerCodePage clickReset(WebDriver driver)  {
					BrowserActions.click(driver, btnReset,"Reset");
				    return this;
			}
public ProducerCodePage clickPrintExport(WebDriver driver)  {
					BrowserActions.click(driver, btnPrintExport,"PrintExport");
				    return this;
			}
}
public class IndustryCodeSearchPage extends LoadableComponent<IndustryCodeSearchPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
 	public List<Object> pageFactoryKey = new ArrayList<Object>();
	public List<String> pageFactoryValue = new ArrayList<String>();

	@IFindBy(how = How.CSS, using = "input[name='IndustryCodeSearchPopup-IndustryCodeSearchScreen-IndustryCodeSearchResultsLV-1-Code']", AI = false)
	private WebElement inpCode_3;

	@IFindBy(how = How.CSS, using = "input[name='IndustryCodeSearchPopup-IndustryCodeSearchScreen-IndustryCodeSearchResultsLV-10-Code']", AI = false)
	private WebElement inpCode_21;

	@IFindBy(how = How.CSS, using = "input[name='IndustryCodeSearchPopup-IndustryCodeSearchScreen-IndustryCodeSearchResultsLV-2-Code']", AI = false)
	private WebElement inpCode_5;

	@IFindBy(how = How.CSS, using = "#IndustryCodeSearchPopup-IndustryCodeSearchScreen-ttlBar", AI = false)
	private WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "#IndustryCodeSearchPopup-__crumb__", AI = false)
	private WebElement btn__crumb__;

	@IFindBy(how = How.CSS, using = "input[name='IndustryCodeSearchPopup-IndustryCodeSearchScreen-IndustryCodeSearchResultsLV-0-Code']", AI = false)
	private WebElement inpCode_1;

	@IFindBy(how = How.CSS, using = "input[name='IndustryCodeSearchPopup-IndustryCodeSearchScreen-IndustryCodeSearchResultsLV-8-Classification']", AI = false)
	private WebElement inpClassification_18;

	@IFindBy(how = How.CSS, using = "input[name='IndustryCodeSearchPopup-IndustryCodeSearchScreen-IndustryCodeSearchResultsLV-14-Code']", AI = false)
	private WebElement inpCode_29;

	@IFindBy(how = How.CSS, using = "input[name='IndustryCodeSearchPopup-IndustryCodeSearchScreen-IndustryCodeSearchResultsLV-13-Code']", AI = false)
	private WebElement inpCode_27;

	@IFindBy(how = How.CSS, using = "input[name='IndustryCodeSearchPopup-IndustryCodeSearchScreen-IndustryCodeSearchResultsLV-6-Classification']", AI = false)
	private WebElement inpClassification_14;

	@IFindBy(how = How.CSS, using = "input[name='IndustryCodeSearchPopup-IndustryCodeSearchScreen-IndustryCodeSearchResultsLV-12-Code']", AI = false)
	private WebElement inpCode_25;

	@IFindBy(how = How.CSS, using = "input[name='IndustryCodeSearchPopup-IndustryCodeSearchScreen-IndustryCodeSearchResultsLV-7-Classification']", AI = false)
	private WebElement inpClassification_16;

	@IFindBy(how = How.CSS, using = "input[name='IndustryCodeSearchPopup-IndustryCodeSearchScreen-IndustryCodeSearchResultsLV-11-Code']", AI = false)
	private WebElement inpCode_23;

	@IFindBy(how = How.CSS, using = "input[name='IndustryCodeSearchPopup-IndustryCodeSearchScreen-IndustryCodeSearchResultsLV-4-Classification']", AI = false)
	private WebElement inpClassification_10;

	@IFindBy(how = How.CSS, using = "input[name='IndustryCodeSearchPopup-IndustryCodeSearchScreen-IndustryCodeSearchResultsLV-5-Classification']", AI = false)
	private WebElement inpClassification_12;

	@IFindBy(how = How.CSS, using = "input[name='IndustryCodeSearchPopup-IndustryCodeSearchScreen-IndustryCodeSearchDV-Code']", AI = false)
	private WebElement inpCode;

	@IFindBy(how = How.CSS, using = "input[name='IndustryCodeSearchPopup-IndustryCodeSearchScreen-IndustryCodeSearchResultsLV-1-Classification']", AI = false)
	private WebElement inpClassification_4;

	@IFindBy(how = How.CSS, using = "input[name='IndustryCodeSearchPopup-IndustryCodeSearchScreen-IndustryCodeSearchResultsLV-14-Classification']", AI = false)
	private WebElement inpClassification_30;

	@IFindBy(how = How.CSS, using = "input[name='IndustryCodeSearchPopup-IndustryCodeSearchScreen-IndustryCodeSearchResultsLV-0-Classification']", AI = false)
	private WebElement inpClassification_2;

	@IFindBy(how = How.CSS, using = "input[name='IndustryCodeSearchPopup-IndustryCodeSearchScreen-IndustryCodeSearchDV-Classification']", AI = false)
	private WebElement inpClassification;

	@IFindBy(how = How.CSS, using = "input[name='IndustryCodeSearchPopup-IndustryCodeSearchScreen-IndustryCodeSearchResultsLV-3-Classification']", AI = false)
	private WebElement inpClassification_8;

	@IFindBy(how = How.CSS, using = "input[name='IndustryCodeSearchPopup-IndustryCodeSearchScreen-IndustryCodeSearchResultsLV-2-Classification']", AI = false)
	private WebElement inpClassification_6;

	@IFindBy(how = How.CSS, using = "input[name='IndustryCodeSearchPopup-IndustryCodeSearchScreen-IndustryCodeSearchResultsLV-3-Code']", AI = false)
	private WebElement inpCode_7;

	@IFindBy(how = How.CSS, using = "input[name='IndustryCodeSearchPopup-IndustryCodeSearchScreen-IndustryCodeSearchResultsLV-4-Code']", AI = false)
	private WebElement inpCode_9;

	@IFindBy(how = How.CSS, using = "input[name='IndustryCodeSearchPopup-IndustryCodeSearchScreen-IndustryCodeSearchResultsLV-5-Code']", AI = false)
	private WebElement inpCode_11;

	@IFindBy(how = How.CSS, using = "#IndustryCodeSearchPopup-IndustryCodeSearchScreen-IndustryCodeSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Search", AI = false)
	private WebElement btnSearch;

	@IFindBy(how = How.CSS, using = "input[name='IndustryCodeSearchPopup-IndustryCodeSearchScreen-IndustryCodeSearchResultsLV-9-Code']", AI = false)
	private WebElement inpCode_19;

	@IFindBy(how = How.CSS, using = "input[name='IndustryCodeSearchPopup-IndustryCodeSearchScreen-IndustryCodeSearchResultsLV-13-Classification']", AI = false)
	private WebElement inpClassification_28;

	@IFindBy(how = How.CSS, using = "input[name='IndustryCodeSearchPopup-IndustryCodeSearchScreen-IndustryCodeSearchResultsLV-8-Code']", AI = false)
	private WebElement inpCode_17;

	@IFindBy(how = How.CSS, using = "input[name='IndustryCodeSearchPopup-IndustryCodeSearchScreen-IndustryCodeSearchResultsLV-7-Code']", AI = false)
	private WebElement inpCode_15;

	@IFindBy(how = How.CSS, using = "input[name='IndustryCodeSearchPopup-IndustryCodeSearchScreen-IndustryCodeSearchResultsLV-11-Classification']", AI = false)
	private WebElement inpClassification_24;

	@IFindBy(how = How.CSS, using = "input[name='IndustryCodeSearchPopup-IndustryCodeSearchScreen-IndustryCodeSearchResultsLV-6-Code']", AI = false)
	private WebElement inpCode_13;

	@IFindBy(how = How.CSS, using = "input[name='IndustryCodeSearchPopup-IndustryCodeSearchScreen-IndustryCodeSearchResultsLV-12-Classification']", AI = false)
	private WebElement inpClassification_26;

	@IFindBy(how = How.CSS, using = "#IndustryCodeSearchPopup-IndustryCodeSearchScreen-Cancel>div[role='button']", AI = false)
	private WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "input[name='IndustryCodeSearchPopup-IndustryCodeSearchScreen-IndustryCodeSearchResultsLV-9-Classification']", AI = false)
	private WebElement inpClassification_20;

	@IFindBy(how = How.CSS, using = "input[name='IndustryCodeSearchPopup-IndustryCodeSearchScreen-IndustryCodeSearchResultsLV-10-Classification']", AI = false)
	private WebElement inpClassification_22;

	@IFindBy(how = How.CSS, using = "#IndustryCodeSearchPopup-IndustryCodeSearchScreen-IndustryCodeSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Reset", AI = false)
	private WebElement btnReset;

	public IndustryCodeSearchPage(){
	}

	public IndustryCodeSearchPage(WebDriver driver) throws Exception{
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
		}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, btnReset))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);
}public IndustryCodeSearchPage enterCode_3(WebDriver driver,String Code_3) {
		            BrowserActions.type(driver, inpCode_3,Code_3, "Code_3");
			        return this;
           }
public IndustryCodeSearchPage enterCode_21(WebDriver driver,String Code_21) {
		            BrowserActions.type(driver, inpCode_21,Code_21, "Code_21");
			        return this;
           }
public IndustryCodeSearchPage enterCode_5(WebDriver driver,String Code_5) {
		            BrowserActions.type(driver, inpCode_5,Code_5, "Code_5");
			        return this;
           }
public IndustryCodeSearchPage click__crumb__(WebDriver driver)  {
					BrowserActions.click(driver, btn__crumb__,"__crumb__");
				    return this;
			}
public IndustryCodeSearchPage enterCode_1(WebDriver driver,String Code_1) {
		            BrowserActions.type(driver, inpCode_1,Code_1, "Code_1");
			        return this;
           }
public IndustryCodeSearchPage enterClassification_18(WebDriver driver,String Classification_18) {
		            BrowserActions.type(driver, inpClassification_18,Classification_18, "Classification_18");
			        return this;
           }
public IndustryCodeSearchPage enterCode_29(WebDriver driver,String Code_29) {
		            BrowserActions.type(driver, inpCode_29,Code_29, "Code_29");
			        return this;
           }
public IndustryCodeSearchPage enterCode_27(WebDriver driver,String Code_27) {
		            BrowserActions.type(driver, inpCode_27,Code_27, "Code_27");
			        return this;
           }
public IndustryCodeSearchPage enterClassification_14(WebDriver driver,String Classification_14) {
		            BrowserActions.type(driver, inpClassification_14,Classification_14, "Classification_14");
			        return this;
           }
public IndustryCodeSearchPage enterCode_25(WebDriver driver,String Code_25) {
		            BrowserActions.type(driver, inpCode_25,Code_25, "Code_25");
			        return this;
           }
public IndustryCodeSearchPage enterClassification_16(WebDriver driver,String Classification_16) {
		            BrowserActions.type(driver, inpClassification_16,Classification_16, "Classification_16");
			        return this;
           }
public IndustryCodeSearchPage enterCode_23(WebDriver driver,String Code_23) {
		            BrowserActions.type(driver, inpCode_23,Code_23, "Code_23");
			        return this;
           }
public IndustryCodeSearchPage enterClassification_10(WebDriver driver,String Classification_10) {
		            BrowserActions.type(driver, inpClassification_10,Classification_10, "Classification_10");
			        return this;
           }
public IndustryCodeSearchPage enterClassification_12(WebDriver driver,String Classification_12) {
		            BrowserActions.type(driver, inpClassification_12,Classification_12, "Classification_12");
			        return this;
           }
public IndustryCodeSearchPage enterCode(WebDriver driver,String Code) {
		            BrowserActions.type(driver, inpCode,Code, "Code");
			        return this;
           }
public IndustryCodeSearchPage enterClassification_4(WebDriver driver,String Classification_4) {
		            BrowserActions.type(driver, inpClassification_4,Classification_4, "Classification_4");
			        return this;
           }
public IndustryCodeSearchPage enterClassification_30(WebDriver driver,String Classification_30) {
		            BrowserActions.type(driver, inpClassification_30,Classification_30, "Classification_30");
			        return this;
           }
public IndustryCodeSearchPage enterClassification_2(WebDriver driver,String Classification_2) {
		            BrowserActions.type(driver, inpClassification_2,Classification_2, "Classification_2");
			        return this;
           }
public IndustryCodeSearchPage enterClassification(WebDriver driver,String Classification) {
		            BrowserActions.type(driver, inpClassification,Classification, "Classification");
			        return this;
           }
public IndustryCodeSearchPage enterClassification_8(WebDriver driver,String Classification_8) {
		            BrowserActions.type(driver, inpClassification_8,Classification_8, "Classification_8");
			        return this;
           }
public IndustryCodeSearchPage enterClassification_6(WebDriver driver,String Classification_6) {
		            BrowserActions.type(driver, inpClassification_6,Classification_6, "Classification_6");
			        return this;
           }
public IndustryCodeSearchPage enterCode_7(WebDriver driver,String Code_7) {
		            BrowserActions.type(driver, inpCode_7,Code_7, "Code_7");
			        return this;
           }
public IndustryCodeSearchPage enterCode_9(WebDriver driver,String Code_9) {
		            BrowserActions.type(driver, inpCode_9,Code_9, "Code_9");
			        return this;
           }
public IndustryCodeSearchPage enterCode_11(WebDriver driver,String Code_11) {
		            BrowserActions.type(driver, inpCode_11,Code_11, "Code_11");
			        return this;
           }
public IndustryCodeSearchPage clickSearch(WebDriver driver)  {
					BrowserActions.click(driver, btnSearch,"Search");
				    return this;
			}
public IndustryCodeSearchPage enterCode_19(WebDriver driver,String Code_19) {
		            BrowserActions.type(driver, inpCode_19,Code_19, "Code_19");
			        return this;
           }
public IndustryCodeSearchPage enterClassification_28(WebDriver driver,String Classification_28) {
		            BrowserActions.type(driver, inpClassification_28,Classification_28, "Classification_28");
			        return this;
           }
public IndustryCodeSearchPage enterCode_17(WebDriver driver,String Code_17) {
		            BrowserActions.type(driver, inpCode_17,Code_17, "Code_17");
			        return this;
           }
public IndustryCodeSearchPage enterCode_15(WebDriver driver,String Code_15) {
		            BrowserActions.type(driver, inpCode_15,Code_15, "Code_15");
			        return this;
           }
public IndustryCodeSearchPage enterClassification_24(WebDriver driver,String Classification_24) {
		            BrowserActions.type(driver, inpClassification_24,Classification_24, "Classification_24");
			        return this;
           }
public IndustryCodeSearchPage enterCode_13(WebDriver driver,String Code_13) {
		            BrowserActions.type(driver, inpCode_13,Code_13, "Code_13");
			        return this;
           }
public IndustryCodeSearchPage enterClassification_26(WebDriver driver,String Classification_26) {
		            BrowserActions.type(driver, inpClassification_26,Classification_26, "Classification_26");
			        return this;
           }
public IndustryCodeSearchPage clickCancel(WebDriver driver)  {
					BrowserActions.click(driver, btnCancel,"Cancel");
				    return this;
			}
public IndustryCodeSearchPage enterClassification_20(WebDriver driver,String Classification_20) {
		            BrowserActions.type(driver, inpClassification_20,Classification_20, "Classification_20");
			        return this;
           }
public IndustryCodeSearchPage enterClassification_22(WebDriver driver,String Classification_22) {
		            BrowserActions.type(driver, inpClassification_22,Classification_22, "Classification_22");
			        return this;
           }
public IndustryCodeSearchPage clickReset(WebDriver driver)  {
					BrowserActions.click(driver, btnReset,"Reset");
				    return this;
			}
}

}
