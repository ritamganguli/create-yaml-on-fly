package com.aspire.guidewire.pc.pages.nonlob;
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

public class ProducerCodesPage extends LoadableComponent<ProducerCodesPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
 	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	@IFindBy(how = How.CSS, using = "#AdminProducerCodeSearch-AdminProducerCodeSearchScreen-ttlBar", AI = false)
	private WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "#AdminProducerCodeSearch-AdminProducerCodeSearchScreen-ProducerCodeSearchDV-PrefUW-UserBrowseMenuItem", AI = false)
	private WebElement btnSelectUser_1;

	@IFindBy(how = How.CSS, using = "input[name='AdminProducerCodeSearch-AdminProducerCodeSearchScreen-ProducerCodeSearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine3']", AI = false)
	private WebElement inpAddress3;

	@IFindBy(how = How.CSS, using = "input[name='AdminProducerCodeSearch-AdminProducerCodeSearchScreen-ProducerCodeSearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine1']", AI = false)
	private WebElement inpAddress1;

	@IFindBy(how = How.CSS, using = "input[name='AdminProducerCodeSearch-AdminProducerCodeSearchScreen-ProducerCodeSearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine2']", AI = false)
	private WebElement inpAddress2;

	@IFindBy(how = How.CSS, using = "input[name='AdminProducerCodeSearch-AdminProducerCodeSearchScreen-ProducerCodeSearchDV-Description']", AI = false)
	private WebElement inpDescription;

	@IFindBy(how = How.CSS, using = "input[name='AdminProducerCodeSearch-AdminProducerCodeSearchScreen-ProducerCodeSearchDV-Organization']", AI = false)
	private WebElement inpOrganization;

	@IFindBy(how = How.CSS, using = "input[name='AdminProducerCodeSearch-AdminProducerCodeSearchScreen-ProducerCodeSearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressSummary']", AI = false)
	private WebElement inpAddress;

	@IFindBy(how = How.CSS, using = "input[name='AdminProducerCodeSearch-AdminProducerCodeSearchScreen-ProducerCodeSearchDV-Code']", AI = false)
	private WebElement inpProducerCode;

	@IFindBy(how = How.CSS, using = "input[name='AdminProducerCodeSearch-AdminProducerCodeSearchScreen-ProducerCodeSearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-PostalCode']", AI = false)
	private WebElement inpZIPCode;

	@IFindBy(how = How.CSS, using = "#AdminProducerCodeSearch-AdminProducerCodeSearchScreen-ProducerCodeSearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-City-AutoFillIcon", AI = false)
	private WebElement btnAutoFillIcon;

	@IFindBy(how = How.CSS, using = "select[name='AdminProducerCodeSearch-AdminProducerCodeSearchScreen-ProducerCodeSearchDV-Status']", AI = false)
	private WebElement drpStatus;

	@IFindBy(how = How.CSS, using = "input[name='AdminProducerCodeSearch-AdminProducerCodeSearchScreen-ProducerCodeSearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-City']", AI = false)
	private WebElement inpCity;

	@IFindBy(how = How.CSS, using = "#AdminProducerCodeSearch-AdminProducerCodeSearchScreen-ProducerCodeSearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-PostalCode-AutoFillIcon", AI = false)
	private WebElement btnAutoFillIcon_2;

	@IFindBy(how = How.CSS, using = "input[name='AdminProducerCodeSearch-AdminProducerCodeSearchScreen-ProducerCodeSearchDV-User']", AI = false)
	private WebElement inpAvailabletoUser;

	@IFindBy(how = How.CSS, using = "input[name='AdminProducerCodeSearch-AdminProducerCodeSearchScreen-ProducerCodeSearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-County']", AI = false)
	private WebElement inpCounty;

	@IFindBy(how = How.CSS, using = "input[name='AdminProducerCodeSearch-AdminProducerCodeSearchScreen-ProducerCodeSearchDV-ParentCode']", AI = false)
	private WebElement inpParentProducerCode;

	@IFindBy(how = How.CSS, using = "#AdminProducerCodeSearch-AdminProducerCodeSearchScreen-ProducerCodeSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Search", AI = false)
	private WebElement btnSearch;

	@IFindBy(how = How.CSS, using = "input[name='AdminProducerCodeSearch-AdminProducerCodeSearchScreen-ProducerCodeSearchDV-MissingPrefUW']", AI = false)
	private WebElement chkMissingPrefUW;

	@IFindBy(how = How.CSS, using = "#AdminProducerCodeSearch-AdminProducerCodeSearchScreen-ProducerCodeSearchDV-User-UserBrowseMenuItem", AI = false)
	private WebElement btnSelectUser;

	@IFindBy(how = How.CSS, using = "select[name='AdminProducerCodeSearch-AdminProducerCodeSearchScreen-ProducerCodeSearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-Country']", AI = false)
	private WebElement drpCountry;

	@IFindBy(how = How.CSS, using = "select[name='AdminProducerCodeSearch-AdminProducerCodeSearchScreen-ProducerCodeSearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-State']", AI = false)
	private WebElement drpState;

	@IFindBy(how = How.CSS, using = "select[name='AdminProducerCodeSearch-AdminProducerCodeSearchScreen-ProducerCodeSearchDV-Currency']", AI = false)
	private WebElement drpCurrency;

	@IFindBy(how = How.CSS, using = "#AdminProducerCodeSearch-AdminProducerCodeSearchScreen-ProducerCodeSearchDV-Organization-SelectOrganization", AI = false)
	private WebElement btnSelectOrganization;

	@IFindBy(how = How.CSS, using = "input[name='AdminProducerCodeSearch-AdminProducerCodeSearchScreen-ProducerCodeSearchDV-PrefUW']", AI = false)
	private WebElement inpPreferredUnderwriter;

	@IFindBy(how = How.CSS, using = "select[name='AdminProducerCodeSearch-AdminProducerCodeSearchScreen-ProducerCodeSearchDV-BranchCode']", AI = false)
	private WebElement drpBranchCode;

	@IFindBy(how = How.CSS, using = "#AdminProducerCodeSearch-AdminProducerCodeSearchScreen-ProducerCodeSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Reset", AI = false)
	private WebElement btnReset;
	
	@IFindBy(how = How.CSS, using = "input[name$='Organization']", AI = false)
	public WebElement txtOrganization;
	
	@IFindBy(how = How.CSS, using = "div[id$='Code_button']", AI = false)
	public WebElement lnkSearchResultProfucerCode;

	public ProducerCodesPage(){
	}

	public ProducerCodesPage(WebDriver driver){
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
}public ProducerCodesPage clickSelectUser_1(WebDriver driver)  {
					BrowserActions.click(driver, btnSelectUser_1,"SelectUser_1");
				    return this;
			}
public ProducerCodesPage enterAddress3(WebDriver driver,String Address3) {
		            BrowserActions.type(driver, inpAddress3,Address3, "Address3");
			        return this;
           }
public ProducerCodesPage enterAddress1(WebDriver driver,String Address1) {
		            BrowserActions.type(driver, inpAddress1,Address1, "Address1");
			        return this;
           }
public ProducerCodesPage enterAddress2(WebDriver driver,String Address2) {
		            BrowserActions.type(driver, inpAddress2,Address2, "Address2");
			        return this;
           }
public ProducerCodesPage enterDescription(WebDriver driver,String Description) {
		            BrowserActions.type(driver, inpDescription,Description, "Description");
			        return this;
           }
public ProducerCodesPage enterOrganization(WebDriver driver,String Organization) {
		            BrowserActions.type(driver, inpOrganization,Organization, "Organization");
			        return this;
           }
public ProducerCodesPage enterAddress(WebDriver driver,String Address) {
		            BrowserActions.type(driver, inpAddress,Address, "Address");
			        return this;
           }
public ProducerCodesPage enterProducerCode(WebDriver driver,String ProducerCode) {
		            BrowserActions.type(driver, inpProducerCode,ProducerCode, "ProducerCode");
			        return this;
           }
public ProducerCodesPage enterZIPCode(WebDriver driver,String ZIPCode) {
		            BrowserActions.type(driver, inpZIPCode,ZIPCode, "ZIPCode");
			        return this;
           }
public ProducerCodesPage clickAutoFillIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnAutoFillIcon,"AutoFillIcon");
				    return this;
			}
public ProducerCodesPage selectStatus(WebDriver driver,String Status)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpStatus,Status,"Status");
				    return this;
			}
public ProducerCodesPage enterCity(WebDriver driver,String City) {
		            BrowserActions.type(driver, inpCity,City, "City");
			        return this;
           }
public ProducerCodesPage clickAutoFillIcon_2(WebDriver driver)  {
					BrowserActions.click(driver, btnAutoFillIcon_2,"AutoFillIcon_2");
				    return this;
			}
public ProducerCodesPage enterAvailabletoUser(WebDriver driver,String AvailabletoUser) {
		            BrowserActions.type(driver, inpAvailabletoUser,AvailabletoUser, "AvailabletoUser");
			        return this;
           }
public ProducerCodesPage enterCounty(WebDriver driver,String County) {
		            BrowserActions.type(driver, inpCounty,County, "County");
			        return this;
           }
public ProducerCodesPage enterParentProducerCode(WebDriver driver,String ParentProducerCode) {
		            BrowserActions.type(driver, inpParentProducerCode,ParentProducerCode, "ParentProducerCode");
			        return this;
           }
public ProducerCodesPage clickSearch(WebDriver driver)  {
					BrowserActions.click(driver, btnSearch,"Search");
				    return this;
			}
public ProducerCodesPage clickMissingPrefUW(WebDriver driver)  {
					BrowserActions.click(driver, chkMissingPrefUW,"MissingPrefUW");
				    return this;
			}
public ProducerCodesPage clickSelectUser(WebDriver driver)  {
					BrowserActions.click(driver, btnSelectUser,"SelectUser");
				    return this;
			}
public ProducerCodesPage selectCountry(WebDriver driver,String Country)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpCountry,Country,"Country");
				    return this;
			}
public ProducerCodesPage selectState(WebDriver driver,String State)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpState,State,"State");
				    return this;
			}
public ProducerCodesPage selectCurrency(WebDriver driver,String Currency)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpCurrency,Currency,"Currency");
				    return this;
			}
public ProducerCodesPage clickSelectOrganization(WebDriver driver)  {
					BrowserActions.click(driver, btnSelectOrganization,"SelectOrganization");
				    return this;
			}
public ProducerCodesPage enterPreferredUnderwriter(WebDriver driver,String PreferredUnderwriter) {
		            BrowserActions.type(driver, inpPreferredUnderwriter,PreferredUnderwriter, "PreferredUnderwriter");
			        return this;
           }
public ProducerCodesPage selectBranchCode(WebDriver driver,String BranchCode)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpBranchCode,BranchCode,"BranchCode");
				    return this;
			}
public ProducerCodesPage clickReset(WebDriver driver)  {
					BrowserActions.click(driver, btnReset,"Reset");
				    return this;
			}

/**
 * click Search button
 * @param driver 
 * @return
 */

public ProducerCodesPage clickSearchBtn(WebDriver driver)  {
	BrowserActions.click(driver,btnSearch, "Search");
	return this;
}

/**
 * click Search Producer code
 * @param driver 
 * @return
 */
public ProducerCodeRolesPage clickSearchResultProducerCode(WebDriver driver) {
	BrowserActions.click(driver,lnkSearchResultProfucerCode, "Search Result Producer Code");
	return new ProducerCodeRolesPage(driver).get();
}

/**
 * Clear the Organization field
 * @param driver 
 * @return
 */
public ProducerCodesPage clearOrganization(WebDriver driver) {
	BrowserActions.clear(driver,txtOrganization, "Organization");
	return this;
}

public class ProducerCodeRolesPage extends LoadableComponent<ProducerCodeRolesPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
 	public  List<Object> pageFactoryKey = new ArrayList<Object>();
	public  List<String> pageFactoryValue = new ArrayList<String>();

	@IFindBy(how = How.CSS, using = "input[name='AdminProducerCodeDetail-ProducerCodeDetailScreen-ProducerCodeDetail_BasicDV-AppointmentDate']", AI = false)
	private WebElement inpAppointmentDate;

	@IFindBy(how = How.CSS, using = "input[name='AdminProducerCodeDetail-ProducerCodeDetailScreen-groupPanel-ProducerCodeDetail_GroupsLV-0-Organization']", AI = false)
	private WebElement inpOrganization_11;

	@IFindBy(how = How.CSS, using = "select[name='AdminProducerCodeDetail-ProducerCodeDetailScreen-ProducerCodeDetail_RolesLV-0-RoleName']", AI = false)
	private WebElement drpName;

	@IFindBy(how = How.CSS, using = "#AdminProducerCodeDetail-ProducerCodeDetailScreen-ProducerCodeDetail_BasicDV-Description textarea", AI = false)
	private WebElement inpDescription;

	@IFindBy(how = How.CSS, using = "input[name='AdminProducerCodeDetail-ProducerCodeDetailScreen-NeedOrganizationMessage']", AI = false)
	private WebElement inpNeedOrganizationMessage;

	@IFindBy(how = How.CSS, using = "input[name='AdminProducerCodeDetail-ProducerCodeDetailScreen-ProducerCodeDetail_BasicDV-Organization']", AI = false)
	private WebElement inpOrganization;

	@IFindBy(how = How.CSS, using = "input[name='AdminProducerCodeDetail-ProducerCodeDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LocalizedFields-0-0-column']", AI = false)
	private WebElement inpColumn;

	@IFindBy(how = How.CSS, using = "#AdminProducerCodeDetail-ProducerCodeDetailScreen-ProducerCodeDetail_UsersCardTab", AI = false)
	private WebElement btnUsers;

	@IFindBy(how = How.CSS, using = "input[name='AdminProducerCodeDetail-ProducerCodeDetailScreen-ProducerCodeDetail_BasicDV-Code']", AI = false)
	private WebElement inpCode;

	@IFindBy(how = How.CSS, using = "#AdminProducerCodeDetail-ProducerCodeDetailScreen-ProducerCodeDetail_BasicDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-PostalCode-AutoFillIcon", AI = false)
	private WebElement btnAutoFillIcon_1;

	@IFindBy(how = How.CSS, using = "input[name='AdminProducerCodeDetail-ProducerCodeDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LocalizedFields-0-Language']", AI = false)
	private WebElement inpLanguage;

	@IFindBy(how = How.CSS, using = "#AdminProducerCodeDetail-ProducerCodeDetailScreen-ProducerCodeDetail_GroupsCardTab", AI = false)
	private WebElement btnGroups;

	@IFindBy(how = How.CSS, using = "input[name='AdminProducerCodeDetail-ProducerCodeDetailScreen-ProducerCodeDetail_BasicDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-City']", AI = false)
	private WebElement inpCity;

	@IFindBy(how = How.CSS, using = "#AdminProducerCodeDetail-ProducerCodeDetailScreen-groupPanel-ProducerCodeDetail_GroupsLV-0-Group-GroupMenuIcon>div[role='button']", AI = false)
	private WebElement btnGroupMenuIcon;

	@IFindBy(how = How.CSS, using = "input[name='AdminProducerCodeDetail-ProducerCodeDetailScreen-ProducerCodeDetail_BasicDV-TerminationDate']", AI = false)
	private WebElement inpTerminationDate;

	@IFindBy(how = How.CSS, using = "input[name='AdminProducerCodeDetail-ProducerCodeDetailScreen-ProducerCodeDetail_BasicDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-County']", AI = false)
	private WebElement inpCounty;

	@IFindBy(how = How.CSS, using = "#AdminProducerCodeDetail-ProducerCodeDetailScreen-ProducerCodeDetail_BasicDV-ParentCode-SelectProducerCode", AI = false)
	private WebElement btnSearch;

	@IFindBy(how = How.CSS, using = "#AdminProducerCodeDetail-ProducerCodeDetailScreen-ProducerCodeDetail_BasicDV-TerminationDate_dateIcon", AI = false)
	private WebElement btnTerminationDateDateIcon;

	@IFindBy(how = How.CSS, using = "input[name='AdminProducerCodeDetail-ProducerCodeDetailScreen-ProducerCodeDetail_RolesLV-0-RoleDescription']", AI = false)
	private WebElement inpDescription_9;

	@IFindBy(how = How.CSS, using = "#AdminProducerCodeDetail-ProducerCodeDetailScreen-CommissionPlanToolbar-RemoveCommissionPlanButton>div[role='button']", AI = false)
	private WebElement btnRemove_10;

	@IFindBy(how = How.CSS, using = "#AdminProducerCodeDetail-ProducerCodeDetailScreen-ProducerCodeDetail_RolesCardTab", AI = false)
	private WebElement btnRoles;

	@IFindBy(how = How.CSS, using = "input[name='AdminProducerCodeDetail-ProducerCodeDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LocalizedFields-2-Language']", AI = false)
	private WebElement inpLanguage_5;

	@IFindBy(how = How.CSS, using = "input[name='AdminProducerCodeDetail-ProducerCodeDetailScreen-ProducerCodeDetail_BasicDV-PreferredUnderwriter']", AI = false)
	private WebElement inpPreferredUnderwriter;

	@IFindBy(how = How.CSS, using = "input[name='AdminProducerCodeDetail-ProducerCodeDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LocalizedFields-1-Language']", AI = false)
	private WebElement inpLanguage_3;

	@IFindBy(how = How.CSS, using = "#AdminProducerCodeDetail-ProducerCodeDetailScreen-ProducerCodeDetail_RolesLV_tb-RemoveRoleButton>div[role='button']", AI = false)
	private WebElement btnRemove_8;

	@IFindBy(how = How.CSS, using = "#AdminProducerCodeDetail-ProducerCodeDetailScreen-ttlBar", AI = false)
	private WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "#AdminProducerCodeDetail-ProducerCodeDetailScreen-Edit>div[role='button']", AI = false)
	private WebElement btnEdit;

	@IFindBy(how = How.CSS, using = "div[id='AdminProducerCodeDetail-ProducerCodeDetailScreen-Update']", AI = false)
	private WebElement btnUpdate;

	@IFindBy(how = How.CSS, using = "input[name='AdminProducerCodeDetail-ProducerCodeDetailScreen-ProducerCodeDetail_BasicDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine3']", AI = false)
	private WebElement inpAddress3;

	@IFindBy(how = How.CSS, using = "#AdminProducerCodeDetail-ProducerCodeDetailScreen-ProducerCodeDetail_CommissionPlansCardTab", AI = false)
	private WebElement btnCommissionPlans;

	@IFindBy(how = How.CSS, using = "input[name='AdminProducerCodeDetail-ProducerCodeDetailScreen-ProducerCodeDetail_BasicDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine1']", AI = false)
	private WebElement inpAddress1;

	@IFindBy(how = How.CSS, using = "select[name='AdminProducerCodeDetail-ProducerCodeDetailScreen-ProducerCodeDetail_BasicDV-CommissionPlan']", AI = false)
	private WebElement drpCommissionPlan;

	@IFindBy(how = How.CSS, using = "input[name='AdminProducerCodeDetail-ProducerCodeDetailScreen-ProducerCodeDetail_BasicDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine2']", AI = false)
	private WebElement inpAddress2;

	@IFindBy(how = How.CSS, using = "input[name='AdminProducerCodeDetail-ProducerCodeDetailScreen-ProducerCodeDetail_BasicDV-Branch']", AI = false)
	private WebElement inpBranch;

	@IFindBy(how = How.CSS, using = "input[name='AdminProducerCodeDetail-ProducerCodeDetailScreen-ProducerCodeDetail_BasicDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressSummary']", AI = false)
	private WebElement inpAddress;

	@IFindBy(how = How.CSS, using = "#AdminProducerCodeDetail-ProducerCodeDetailScreen-DeleteButton>div[role='button']", AI = false)
	private WebElement btnDelete;

	@IFindBy(how = How.CSS, using = "#AdminProducerCodeDetail-ProducerCodeDetailScreen-groupPanel-ProducerCodeDetail_GroupsLV-0-Group-GroupSearchMenuIcon>div[role='menuitem']", AI = false)
	private WebElement btnSearchforGroup;

	@IFindBy(how = How.CSS, using = "#AdminProducerCodeDetail-ProducerCodeDetailScreen-ProducerCodeDetail_BasicCardTab", AI = false)
	private WebElement btnBasics;

	@IFindBy(how = How.CSS, using = "input[name='AdminProducerCodeDetail-ProducerCodeDetailScreen-ProducerCodeDetail_BasicDV-ParentCode']", AI = false)
	private WebElement inpParentCode;

	@IFindBy(how = How.CSS, using = "input[name='AdminProducerCodeDetail-ProducerCodeDetailScreen-ProducerCodeDetail_BasicDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-PostalCode']", AI = false)
	private WebElement inpZIPCode;

	@IFindBy(how = How.CSS, using = "#AdminProducerCodeDetail-ProducerCodeDetailScreen-ProducerCodeDetail_BasicDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-City-AutoFillIcon", AI = false)
	private WebElement btnAutoFillIcon;

	@IFindBy(how = How.CSS, using = "div[id$='RemoveRoleButton']", AI = false)
	private WebElement btnRemove;

	@IFindBy(how = How.CSS, using = "select[name='AdminProducerCodeDetail-ProducerCodeDetailScreen-ProducerCodeDetail_BasicDV-Status']", AI = false)
	private WebElement drpStatus;

	@IFindBy(how = How.CSS, using = "#AdminProducerCodeDetail-ProducerCodeDetailScreen-ProducerCodeDetail_BasicDV-Branch-SelectBranch", AI = false)
	private WebElement btnSearch_2;

	@IFindBy(how = How.CSS, using = "input[name='AdminProducerCodeDetail-ProducerCodeDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-0-FieldHeading']", AI = false)
	private WebElement inpFieldHeading;

	@IFindBy(how = How.CSS, using = "#AdminProducerCodeDetail-ProducerCodeDetailScreen-ProducerCodeDetail_RolesLV_tb-AddRoleButton>div[role='button']", AI = false)
	private WebElement btnAdd_7;

	@IFindBy(how = How.CSS, using = "input[name='AdminProducerCodeDetail-ProducerCodeDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LocalizedFields-2-0-column']", AI = false)
	private WebElement inpColumn_6;

	@IFindBy(how = How.CSS, using = "input[name='AdminProducerCodeDetail-ProducerCodeDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LocalizedFields-1-0-column']", AI = false)
	private WebElement inpColumn_4;

	@IFindBy(how = How.CSS, using = "select[name='AdminProducerCodeDetail-ProducerCodeDetailScreen-ProducerCodeDetail_BasicDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-Country']", AI = false)
	private WebElement drpCountry;

	@IFindBy(how = How.CSS, using = "#AdminProducerCodeDetail-ProducerCodeDetailScreen-ProducerCodeDetail_BasicDV-PreferredUnderwriter-UserBrowseMenuItem", AI = false)
	private WebElement btnSelectUser;

	@IFindBy(how = How.CSS, using = "select[name='AdminProducerCodeDetail-ProducerCodeDetailScreen-ProducerCodeDetail_BasicDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-State']", AI = false)
	private WebElement drpState;

	@IFindBy(how = How.CSS, using = "#AdminProducerCodeDetail-ProducerCodeDetailScreen-groupPanel-ProducerCodeDetail_GroupsLV-0-Group-GroupPickerMenuIcon>div[role='menuitem']", AI = false)
	private WebElement btnSelectGroup;

	@IFindBy(how = How.CSS, using = "input[name='AdminProducerCodeDetail-ProducerCodeDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LanguageHeading']", AI = false)
	private WebElement inpLanguageHeading;

	@IFindBy(how = How.CSS, using = "#AdminProducerCodeDetail-ProducerCodeDetailScreen-Cancel>div[role='button']", AI = false)
	private WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "select[name='AdminProducerCodeDetail-ProducerCodeDetailScreen-ProducerCodeDetail_BasicDV-Currency']", AI = false)
	private WebElement drpCurrency;

	@IFindBy(how = How.CSS, using = "#AdminProducerCodeDetail-ProducerCodeDetailScreen-ProducerCodeDetail_BasicDV-Organization-SelectOrganization", AI = false)
	private WebElement btnSelectOrganization;

	@IFindBy(how = How.CSS, using = "#AdminProducerCodeDetail-ProducerCodeDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV_tb-Add>div[role='button']", AI = false)
	private WebElement btnAdd;

	@IFindBy(how = How.CSS, using = "#AdminProducerCodeDetail-ProducerCodeDetailScreen-ProducerCodeDetail_BasicDV-AppointmentDate_dateIcon", AI = false)
	private WebElement btnAppointmentDateDateIcon;
	
	@IFindBy(how = How.CSS, using = "div[id$='AddRoleButton']", AI = false)
	public WebElement btnAddRoleButton;
	
	@IFindBy(how = How.XPATH, using = "(//div[contains(@id,'_Checkbox')])[last()]", AI = false)
	public WebElement chkProducerCodeDetail;
	
	@IFindBy(how = How.CSS, using = "div[id$='RoleName']", AI = false)
	public WebElement lblRoleName;
	
	 @IFindBy(how = How.XPATH, using = "//div[text()='No data to display']", AI = false)
	public WebElement lblNoDataDisplay;
	
	String roleNameCell="(//select[contains(@name,'RoleName')])[last()]";

	public ProducerCodeRolesPage(){
	}

	public ProducerCodeRolesPage(WebDriver driver){
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
		
}public ProducerCodeRolesPage enterAppointmentDate(WebDriver driver,String AppointmentDate) {
		            BrowserActions.type(driver, inpAppointmentDate,AppointmentDate, "AppointmentDate");
			        return this;
           }
public ProducerCodeRolesPage enterOrganization_11(WebDriver driver,String Organization_11) {
		            BrowserActions.type(driver, inpOrganization_11,Organization_11, "Organization_11");
			        return this;
           }
public ProducerCodeRolesPage selectName(WebDriver driver,String Name)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpName,Name,"Name");
				    return this;
			}
public ProducerCodeRolesPage enterDescription(WebDriver driver,String Description) {
		            BrowserActions.type(driver, inpDescription,Description, "Description");
			        return this;
           }
public ProducerCodeRolesPage enterNeedOrganizationMessage(WebDriver driver,String NeedOrganizationMessage) {
		            BrowserActions.type(driver, inpNeedOrganizationMessage,NeedOrganizationMessage, "NeedOrganizationMessage");
			        return this;
           }
public ProducerCodeRolesPage enterOrganization(WebDriver driver,String Organization) {
		            BrowserActions.type(driver, inpOrganization,Organization, "Organization");
			        return this;
           }
public ProducerCodeRolesPage enterColumn(WebDriver driver,String Column) {
		            BrowserActions.type(driver, inpColumn,Column, "Column");
			        return this;
           }
public ProducerCodeRolesPage clickUsers(WebDriver driver)  {
					BrowserActions.click(driver, btnUsers,"Users");
				    return this;
			}
public ProducerCodeRolesPage enterCode(WebDriver driver,String Code) {
		            BrowserActions.type(driver, inpCode,Code, "Code");
			        return this;
           }
public ProducerCodeRolesPage clickAutoFillIcon_1(WebDriver driver)  {
					BrowserActions.click(driver, btnAutoFillIcon_1,"AutoFillIcon_1");
				    return this;
			}
public ProducerCodeRolesPage enterLanguage(WebDriver driver,String Language) {
		            BrowserActions.type(driver, inpLanguage,Language, "Language");
			        return this;
           }
public ProducerCodeRolesPage clickGroups(WebDriver driver)  {
					BrowserActions.click(driver, btnGroups,"Groups");
				    return this;
			}
public ProducerCodeRolesPage enterCity(WebDriver driver,String City) {
		            BrowserActions.type(driver, inpCity,City, "City");
			        return this;
           }
public ProducerCodeRolesPage clickGroupMenuIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnGroupMenuIcon,"GroupMenuIcon");
				    return this;
			}
public ProducerCodeRolesPage enterTerminationDate(WebDriver driver,String TerminationDate) {
		            BrowserActions.type(driver, inpTerminationDate,TerminationDate, "TerminationDate");
			        return this;
           }
public ProducerCodeRolesPage enterCounty(WebDriver driver,String County) {
		            BrowserActions.type(driver, inpCounty,County, "County");
			        return this;
           }
public ProducerCodeRolesPage clickSearch(WebDriver driver)  {
					BrowserActions.click(driver, btnSearch,"Search");
				    return this;
			}
public ProducerCodeRolesPage clickTerminationDateDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnTerminationDateDateIcon,"TerminationDateDateIcon");
				    return this;
			}
public ProducerCodeRolesPage enterDescription_9(WebDriver driver,String Description_9) {
		            BrowserActions.type(driver, inpDescription_9,Description_9, "Description_9");
			        return this;
           }
public ProducerCodeRolesPage clickRemove_10(WebDriver driver)  {
					BrowserActions.click(driver, btnRemove_10,"Remove_10");
				    return this;
			}
public ProducerCodeRolesPage clickRoles(WebDriver driver)  {
					BrowserActions.click(driver, btnRoles,"Roles");
				    return this;
			}
public ProducerCodeRolesPage enterLanguage_5(WebDriver driver,String Language_5) {
		            BrowserActions.type(driver, inpLanguage_5,Language_5, "Language_5");
			        return this;
           }
public ProducerCodeRolesPage enterPreferredUnderwriter(WebDriver driver,String PreferredUnderwriter) {
		            BrowserActions.type(driver, inpPreferredUnderwriter,PreferredUnderwriter, "PreferredUnderwriter");
			        return this;
           }
public ProducerCodeRolesPage enterLanguage_3(WebDriver driver,String Language_3) {
		            BrowserActions.type(driver, inpLanguage_3,Language_3, "Language_3");
			        return this;
           }
public ProducerCodeRolesPage clickRemove_8(WebDriver driver)  {
					BrowserActions.click(driver, btnRemove_8,"Remove_8");
				    return this;
			}
public ProducerCodeRolesPage clickEdit(WebDriver driver)  {
					BrowserActions.click(driver, btnEdit,1,"Edit");
				    return this;
			}
public ProducerCodeRolesPage clickUpdate(WebDriver driver)  {
					BrowserActions.click(driver, btnUpdate,true,"Update");
				    return this;
			}
public ProducerCodeRolesPage enterAddress3(WebDriver driver,String Address3) {
		            BrowserActions.type(driver, inpAddress3,Address3, "Address3");
			        return this;
           }
public ProducerCodeRolesPage clickCommissionPlans(WebDriver driver)  {
					BrowserActions.click(driver, btnCommissionPlans,"CommissionPlans");
				    return this;
			}
public ProducerCodeRolesPage enterAddress1(WebDriver driver,String Address1) {
		            BrowserActions.type(driver, inpAddress1,Address1, "Address1");
			        return this;
           }
public ProducerCodeRolesPage selectCommissionPlan(WebDriver driver,String CommissionPlan)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpCommissionPlan,CommissionPlan,"CommissionPlan");
				    return this;
			}
public ProducerCodeRolesPage enterAddress2(WebDriver driver,String Address2) {
		            BrowserActions.type(driver, inpAddress2,Address2, "Address2");
			        return this;
           }
public ProducerCodeRolesPage enterBranch(WebDriver driver,String Branch) {
		            BrowserActions.type(driver, inpBranch,Branch, "Branch");
			        return this;
           }
public ProducerCodeRolesPage enterAddress(WebDriver driver,String Address) {
		            BrowserActions.type(driver, inpAddress,Address, "Address");
			        return this;
           }
public ProducerCodeRolesPage clickDelete(WebDriver driver)  {
					BrowserActions.click(driver, btnDelete,"Delete");
				    return this;
			}
public ProducerCodeRolesPage clickSearchforGroup(WebDriver driver)  {
					BrowserActions.click(driver, btnSearchforGroup,"SearchforGroup");
				    return this;
			}
public ProducerCodeRolesPage clickBasics(WebDriver driver)  {
					BrowserActions.click(driver, btnBasics,"Basics");
				    return this;
			}
public ProducerCodeRolesPage enterParentCode(WebDriver driver,String ParentCode) {
		            BrowserActions.type(driver, inpParentCode,ParentCode, "ParentCode");
			        return this;
           }
public ProducerCodeRolesPage enterZIPCode(WebDriver driver,String ZIPCode) {
		            BrowserActions.type(driver, inpZIPCode,ZIPCode, "ZIPCode");
			        return this;
           }
public ProducerCodeRolesPage clickAutoFillIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnAutoFillIcon,"AutoFillIcon");
				    return this;
			}
public ProducerCodeRolesPage clickRemove(WebDriver driver)  {
					BrowserActions.click(driver, btnRemove,"Remove");
				    return this;
			}
public ProducerCodeRolesPage selectStatus(WebDriver driver,String Status)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpStatus,Status,"Status");
				    return this;
			}
public ProducerCodeRolesPage clickSearch_2(WebDriver driver)  {
					BrowserActions.click(driver, btnSearch_2,"Search_2");
				    return this;
			}
public ProducerCodeRolesPage enterFieldHeading(WebDriver driver,String FieldHeading) {
		            BrowserActions.type(driver, inpFieldHeading,FieldHeading, "FieldHeading");
			        return this;
           }
public ProducerCodeRolesPage clickAdd_7(WebDriver driver)  {
					BrowserActions.click(driver, btnAdd_7,"Add_7");
				    return this;
			}
public ProducerCodeRolesPage enterColumn_6(WebDriver driver,String Column_6) {
		            BrowserActions.type(driver, inpColumn_6,Column_6, "Column_6");
			        return this;
           }
public ProducerCodeRolesPage enterColumn_4(WebDriver driver,String Column_4) {
		            BrowserActions.type(driver, inpColumn_4,Column_4, "Column_4");
			        return this;
           }
public ProducerCodeRolesPage selectCountry(WebDriver driver,String Country)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpCountry,Country,"Country");
				    return this;
			}
public ProducerCodeRolesPage clickSelectUser(WebDriver driver)  {
					BrowserActions.click(driver, btnSelectUser,"SelectUser");
				    return this;
			}
public ProducerCodeRolesPage selectState(WebDriver driver,String State)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpState,State,"State");
				    return this;
			}
public ProducerCodeRolesPage clickSelectGroup(WebDriver driver)  {
					BrowserActions.click(driver, btnSelectGroup,"SelectGroup");
				    return this;
			}
public ProducerCodeRolesPage enterLanguageHeading(WebDriver driver,String LanguageHeading) {
		            BrowserActions.type(driver, inpLanguageHeading,LanguageHeading, "LanguageHeading");
			        return this;
           }
public ProducerCodeRolesPage clickCancel(WebDriver driver)  {
					BrowserActions.click(driver, btnCancel,"Cancel");
				    return this;
			}
public ProducerCodeRolesPage selectCurrency(WebDriver driver,String Currency)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpCurrency,Currency,"Currency");
				    return this;
			}
public ProducerCodeRolesPage clickSelectOrganization(WebDriver driver)  {
					BrowserActions.click(driver, btnSelectOrganization,"SelectOrganization");
				    return this;
			}
public ProducerCodeRolesPage clickAdd(WebDriver driver)  {
					BrowserActions.click(driver, btnAdd,"Add");
				    return this;
			}
public ProducerCodeRolesPage clickAppointmentDateDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnAppointmentDateDateIcon,"AppointmentDateDateIcon");
				    return this;
			}
public ProducerCodeRolesPage clickAddRoleButton(WebDriver driver) {
	BrowserActions.click(driver,btnAddRoleButton, true,"AddRoleButton");
	return this;
}

/**
 * select the Role Name
 * @param driver , role name
 * @return
 */
public ProducerCodeRolesPage selectRolesName(WebDriver driver,String rolesName) {
	By rolesNameElementBy=By.xpath(this.roleNameCell);
	BrowserActions.waitForElementToDisplay(driver, rolesNameElementBy, "rolesNameElement");
	WebElement rolesNameElement = rolesNameElementBy.findElement(driver);
	BrowserActions.selectDropDownByVisibleText(driver,rolesNameElement,rolesName,6,"Roles Name");
	return this;
}

/**
 * click Producer code check box
 * @param driver 
 * @return
 */

public ProducerCodeRolesPage clickProducerCodeDetailCheckBox(WebDriver driver) {
	BrowserActions.click(driver,chkProducerCodeDetail, "ProducerCodeDetail1 checkbox");
	return this;
}

/**
 * Verify addeded name is display
 * @param driver 
 * @return
 */
public ProducerCodeRolesPage verifyNameAdded(WebDriver driver) {
	BrowserActions.verifyElementDisplayed(driver,lblRoleName, "Name");
	return this;
}
/**
 * Verify Messege is display
 * @param driver 
 * @return
 */
public ProducerCodeRolesPage verifyMessege(WebDriver driver, String rollName){
	BrowserActions.verifyElementDisplayed(driver, lblNoDataDisplay, "No data to Display");
	return this;
}
}
}
