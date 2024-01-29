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

public class UsersPage extends LoadableComponent<UsersPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
 	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	@IFindBy(how = How.CSS, using = "select[name='AdminUserSearchPage-UserSearchScreen-UserSearchDV-ContactInputSet-GlobalPersonNameInputSet-Prefix']", AI = false)
	private WebElement drpPrefix;

	@IFindBy(how = How.CSS, using = "#AdminUserSearchPage-UserSearchScreen-ttlBar", AI = false)
	private WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "#AdminUserSearchPage-UserSearchScreen-UserSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Search", AI = false)
	private WebElement btnSearch;

	@IFindBy(how = How.CSS, using = "input[name='AdminUserSearchPage-UserSearchScreen-UserSearchDV-ContactInputSet-GlobalPersonNameInputSet-NameSummary']", AI = false)
	private WebElement inpName;

	@IFindBy(how = How.CSS, using = "input[name='AdminUserSearchPage-UserSearchScreen-UserSearchDV-ProducerCode']", AI = false)
	private WebElement inpAvailableProducerCode;

	@IFindBy(how = How.CSS, using = "select[name='AdminUserSearchPage-UserSearchScreen-UserSearchDV-ContactInputSet-GlobalPersonNameInputSet-Suffix']", AI = false)
	private WebElement drpSuffix;

	@IFindBy(how = How.CSS, using = "select[name='AdminUserSearchPage-UserSearchScreen-UserSearchDV-Role']", AI = false)
	private WebElement drpRole;

	@IFindBy(how = How.CSS, using = "input[name='AdminUserSearchPage-UserSearchScreen-UserSearchDV-Organization']", AI = false)
	private WebElement inpOrganization;

	@IFindBy(how = How.CSS, using = "input[name='AdminUserSearchPage-UserSearchScreen-UserSearchDV-Username']", AI = false)
	private WebElement inpUsername;

	@IFindBy(how = How.CSS, using = "input[name='AdminUserSearchPage-UserSearchScreen-UserSearchDV-ContactInputSet-GlobalPersonNameInputSet-Particle']", AI = false)
	private WebElement inpParticle;

	@IFindBy(how = How.CSS, using = "input[name='AdminUserSearchPage-UserSearchScreen-UserSearchDV-GroupNameInputSet-GlobalContactNameInputSet-Name']", AI = false)
	private WebElement inpGroupName;

	@IFindBy(how = How.CSS, using = "#AdminUserSearchPage-UserSearchScreen-UserSearchDV-Organization-SelectOrganization", AI = false)
	private WebElement btnSelectOrganization;

	@IFindBy(how = How.CSS, using = "input[name='AdminUserSearchPage-UserSearchScreen-UserSearchDV-ContactInputSet-GlobalPersonNameInputSet-MiddleName']", AI = false)
	private WebElement inpMiddlename;

	@IFindBy(how = How.CSS, using = "input[name='AdminUserSearchPage-UserSearchScreen-UserSearchDV-ContactInputSet-GlobalPersonNameInputSet-LastName']", AI = false)
	private WebElement inpLastname;

	@IFindBy(how = How.CSS, using = "select[name='AdminUserSearchPage-UserSearchScreen-UserSearchDV-UserType']", AI = false)
	private WebElement drpUsertypes;

	@IFindBy(how = How.CSS, using = "input[name='AdminUserSearchPage-UserSearchScreen-UserSearchDV-NotInAnyGroup']", AI = false)
	private WebElement chkSearchOnlyUnassignedUsers;

	@IFindBy(how = How.CSS, using = "#AdminUserSearchPage-UserSearchScreen-UserSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Reset", AI = false)
	private WebElement btnReset;

	@IFindBy(how = How.CSS, using = "input[name='AdminUserSearchPage-UserSearchScreen-UserSearchDV-ContactInputSet-GlobalPersonNameInputSet-FirstName']", AI = false)
	private WebElement inpFirstname;
	
	@IFindBy(how = How.CSS, using = "div[id$='RateTableDefinitionDV']", AI = false)
	public WebElement lblBasicsAllDetails;

	@IFindBy(how = How.CSS, using = "div[aria-controls$='BasicCard']", AI = false)
	public WebElement btnBasic;

	@IFindBy(how = How.CSS, using = "div[aria-controls$='RolesCard']", AI = false)
	public WebElement btnRoles;

	@IFindBy(how = How.CSS, using = "div[aria-controls$='RegionCard']", AI = false)
	public WebElement btnRegion;

	@IFindBy(how = How.CSS, using = "div[id$='UserDetail_AccessCardTab']", AI = false)
	public WebElement btnAccess;

	@IFindBy(how = How.CSS, using = "div[id$='UserDetail_ProfileCardTab']", AI = false)
	public WebElement btnProfile;

	@IFindBy(how = How.CSS, using = "div[id$='UserDetail_AttributesCardTab']", AI = false)
	public WebElement btnAttribute;

	@IFindBy(how = How.CSS, using = "div[id$='UserDetail_AuthorityCardTab']", AI = false)
	public WebElement btnAuthority;
	
	@IFindBy(how = How.CSS, using = "div[id$='Edit']", AI = false)
	public WebElement btnEdit;
	
	@IFindBy(how = How.CSS, using = "div[id$='UserRolesLV_tb-Add']", AI = false)
	public WebElement btnAddRoles;

	@IFindBy(how = How.CSS, using = "select[name$='RoleName']", AI = false)
	public WebElement drpRolesName;

	@IFindBy(how = How.CSS, using = "div[id$='Update']", AI = false)
	public WebElement btnUpdate;

	@IFindBy(how = How.CSS, using = "div[id$='SelectOrganization']", AI = false)
	private WebElement btnOrganizationMagnifierIcon;
	
	@IFindBy(how = How.CSS, using = "#UserDetailPage-UserDetailScreen-UserDetail_BasicCardTab", AI = false)
	private WebElement btnBasics;
	
	public UsersPage(){
	}

	public UsersPage(WebDriver driver){
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
}public UsersPage selectPrefix(WebDriver driver,String Prefix)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPrefix,Prefix,"Prefix");
				    return this;
			}
public UsersPage clickSearch(WebDriver driver)  {
					BrowserActions.click(driver, btnSearch,true,"Search");
				    return this;
			}
public UsersPage enterName(WebDriver driver,String Name) {
		            BrowserActions.type(driver, inpName,Name, "Name");
			        return this;
           }
public UsersPage enterAvailableProducerCode(WebDriver driver,String AvailableProducerCode) {
		            BrowserActions.type(driver, inpAvailableProducerCode,AvailableProducerCode, "AvailableProducerCode");
			        return this;
           }
public UsersPage selectSuffix(WebDriver driver,String Suffix)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpSuffix,Suffix,"Suffix");
				    return this;
			}
public UsersPage selectRole(WebDriver driver,String Role)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpRole,Role,"Role");
				    return this;
			}
public UsersPage enterOrganization(WebDriver driver,String Organization) {
		            BrowserActions.type(driver, inpOrganization,Organization, "Organization");
			        return this;
           }
public UsersPage enterUsername(WebDriver driver,String Username) {
		            BrowserActions.type(driver, inpUsername,Username, "Username");
			        return this;
           }
public UsersPage enterParticle(WebDriver driver,String Particle) {
		            BrowserActions.type(driver, inpParticle,Particle, "Particle");
			        return this;
           }
public UsersPage enterGroupName(WebDriver driver,String GroupName) {
		            BrowserActions.type(driver, inpGroupName,GroupName, "GroupName");
			        return this;
           }
public UsersPage clickSelectOrganization(WebDriver driver)  {
					BrowserActions.click(driver, btnSelectOrganization,"SelectOrganization");
				    return this;
			}
public UsersPage enterMiddlename(WebDriver driver,String Middlename) {
		            BrowserActions.type(driver, inpMiddlename,Middlename, "Middlename");
			        return this;
           }
public UsersPage enterLastname(WebDriver driver,String Lastname) {
		            BrowserActions.type(driver, inpLastname,Lastname, "Lastname");
			        return this;
           }
public UsersPage selectUsertypes(WebDriver driver,String Usertypes)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpUsertypes,Usertypes,"Usertypes");
				    return this;
			}
public UsersPage clickSearchOnlyUnassignedUsers(WebDriver driver)  {
					BrowserActions.click(driver, chkSearchOnlyUnassignedUsers,"SearchOnlyUnassignedUsers");
				    return this;
			}
public UsersPage clickReset(WebDriver driver)  {
					BrowserActions.click(driver, btnReset,"Reset");
				    return this;
			}
public UsersPage enterFirstname(WebDriver driver,String Firstname) {
		            BrowserActions.type(driver, inpFirstname,Firstname, "Firstname");
			        return this;
           }

/**
 * Click User name
 * @param driver , userName
 * @return
 */
public UserSuperUserPage clickUserName(WebDriver driver,String userName) {
	By lnkUserNameBy = By.xpath("//div[text()='"+userName+"']//ancestor::td//preceding-sibling::td//descendant::div[contains(@id,'DisplayName_button')]");
	BrowserActions.waitForElementToDisplay(driver, lnkUserNameBy, "lnkUserName");
	WebElement lnkUserName = lnkUserNameBy.findElement(driver);
	BrowserActions.click(driver, lnkUserName, "User name");
	return new UserSuperUserPage(driver).get();
}

/**
 * Verify details displayed below Basics Tab
 * @author vignesh.ravi
 * @param driver
 */
public void verifyBasicsDetailsIsDisplay(WebDriver driver) {
	BrowserActions.verifyElementDisplayed(driver, lblBasicsAllDetails, "Basic Below Details");
}

/**
 * Verify Basic Tab is displayed
 * @author vignesh.ravi
 * @param driver
 */
public void verifyBasicsTabIsDisplay(WebDriver driver) {
	BrowserActions.verifyElementDisplayed(driver, btnBasic, "Basic Tab");
}

/**
 * Verify Access Tab is displayed
 * @author vignesh.ravi
 * @param driver
 */
public void verifyAccessTabIsDisplay(WebDriver driver) {
	BrowserActions.verifyElementDisplayed(driver, btnAccess, "Access Tab");
}

/**
 * Verify Roles Tab is displayed
 * @author vignesh.ravi
 * @param driver
 */
public void verifyRolesTabIsDisplay(WebDriver driver) {
	BrowserActions.verifyElementDisplayed(driver, btnRoles, "Roles Tab");
}

/**
 * Verify Region Tab is displayed
 * @author vignesh.ravi
 * @param driver
 */
public void verifyRegionTabIsDisplay(WebDriver driver) {
	BrowserActions.verifyElementDisplayed(driver, btnRegion, "Region Tab");
}

/**
 * Verify Profile Tab is displayed
 * @author vignesh.ravi
 * @param driver
 */
public void verifyProfileTabIsDisplay(WebDriver driver) {
	BrowserActions.verifyElementDisplayed(driver, btnProfile, "Profile Tab");
}

/**
 * Verify Profile Tab is displayed
 * @author vignesh.ravi
 * @param driver
 */
public void verifyAttributeTabIsDisplay(WebDriver driver) {
	BrowserActions.verifyElementDisplayed(driver, btnProfile, "Profile Tab");
}

/**
 * Verify Profile Tab is displayed
 * @author vignesh.ravi
 * @param driver
 */
public void verifyAuthorityTabIsDisplay(WebDriver driver) {
	BrowserActions.verifyElementDisplayed(driver, btnAuthority, "Authority Tab");
}

public void clickEdit(WebDriver driver) {
	BrowserActions.click(driver, btnEdit, "Edit");
}

public void clickRolesTab(WebDriver driver) {
	BrowserActions.click(driver, btnRoles, true,"Roles Tab");
}

public void clickAddRoles(WebDriver driver) {
	BrowserActions.click(driver, btnAddRoles, "Add Roles Button");
}

public void selectRolesName(WebDriver driver) {
	BrowserActions.selectDropDownByIndex(driver, drpRolesName, 2, "Roles name");
}

public void clickUpdate(WebDriver driver) {
	BrowserActions.click(driver, btnUpdate, "Update Button");
}

public UsersPage clickOrganization(WebDriver driver) {
	BrowserActions.click(driver, btnOrganizationMagnifierIcon, "Organization");
	return this;
}

/**
 * Click Role
 * @param driver , roleName
 * @return
 */
public UsersPage clickRoles(WebDriver driver, String roleName) {
	By elementBy = By.xpath("//div[text()='"+roleName+"']");
	BrowserActions.waitForElementToDisplay(driver, elementBy, "Element");
	WebElement element = elementBy.findElement(driver);
	BrowserActions.click(driver, element,true, "Roles Name");
	return this;
}

/**
 * Click Name
 * @param driver , name
 * @return
 */

public UsersPage clickName(WebDriver driver ,String name) {
	By userNameBy = By.xpath("//div[text()='"+name+"']//ancestor::td//preceding-sibling::td[contains(@id,'DisplayName_Cell')]");
	BrowserActions.waitForElementToDisplay(driver, userNameBy, "userName");
	WebElement userName = userNameBy.findElement(driver);
	BrowserActions.click(driver, userName, "User Name");
	return this;
}

/**
 * Click  Basics button
 * @param driver , roleName
 * @return
 */
public UsersPage clickBasics(WebDriver driver)  {
	BrowserActions.click(driver, btnBasics,"Basics");
    return this;
}

/**
 * Verify Edit button is display or not
 * @param driver , textExpected
 * @return
 */
public void verifyEditBtnIsDisplay(WebDriver driver) {
	BrowserActions.verifyElementDisplayed(driver, btnEdit, "Edit Button");
}

public class UserSuperUserPage extends LoadableComponent<UserSuperUserPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
 	public  List<Object> pageFactoryKey = new ArrayList<Object>();
	public  List<String> pageFactoryValue = new ArrayList<String>();

	@IFindBy(how = How.CSS, using = "input[name='UserDetailPage-UserDetailScreen-UserDetail_AccessDV-UseProducerCodeSecurity']", AI = false)
	private WebElement rdbUseProducerCodesecurity;

	@IFindBy(how = How.CSS, using = "#UserDetailPage-UserDetailScreen-UserDetail_AuthorityCardTab", AI = false)
	private WebElement btnUWAuthority;

	@IFindBy(how = How.CSS, using = "#UserDetailPage-UserDetailScreen-UserDetail_ProfileCardTab", AI = false)
	private WebElement btnProfile;

	@IFindBy(how = How.CSS, using = "input[name='UserDetailPage-UserDetailScreen-UserDetailDV-Fax-GlobalPhoneInputSet-PhoneDisplay']", AI = false)
	private WebElement inpFax_5;

	@IFindBy(how = How.CSS, using = "input[name='UserDetailPage-UserDetailScreen-UserDetailDV-HomePhone-GlobalPhoneInputSet-PhoneDisplay']", AI = false)
	private WebElement inpHomePhone_2;

	@IFindBy(how = How.CSS, using = "select[name='UserDetailPage-UserDetailScreen-UserDetail_AccessDV-UserGroupsLV-1-LoadFactorType']", AI = false)
	private WebElement drpLoadFactorPermissions_15;

	@IFindBy(how = How.CSS, using = "input[name='UserDetailPage-UserDetailScreen-UserDetailDV-Organization']", AI = false)
	private WebElement inpOrganization;

	@IFindBy(how = How.CSS, using = "input[name='UserDetailPage-UserDetailScreen-UserDetailDV-UserDetailCommons-UserDetailInputSet-AccountLocked']", AI = false)
	private WebElement rdbLocked;

	@IFindBy(how = How.CSS, using = "#UserDetailPage-UserDetailScreen-UserDetailDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-PostalCode-AutoFillIcon", AI = false)
	private WebElement btnAutoFillIcon_1;

	@IFindBy(how = How.CSS, using = "input[name='UserDetailPage-UserDetailScreen-UserDetailDV-Fax-GlobalPhoneInputSet-Extension']", AI = false)
	private WebElement inpFaxExtension;

	@IFindBy(how = How.CSS, using = "input[name='UserDetailPage-UserDetailScreen-UserDetailDV-UserDetailCommons-UserDetailInputSet-Name-GlobalPersonNameInputSet-LastName']", AI = false)
	private WebElement inpLastname;

	@IFindBy(how = How.CSS, using = "input[name='UserDetailPage-UserDetailScreen-UserDetail_AccessDV-UserGroupsLV-1-LoadFactor']", AI = false)
	private WebElement inpLoadFactor_16;

	@IFindBy(how = How.CSS, using = "select[name='UserDetailPage-UserDetailScreen-UserDetailDV-PrimaryPhone']", AI = false)
	private WebElement drpPrimaryPhone;

	@IFindBy(how = How.CSS, using = "input[name='UserDetailPage-UserDetailScreen-UserDetailDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-County']", AI = false)
	private WebElement inpCounty;

	@IFindBy(how = How.CSS, using = "input[name='UserDetailPage-UserDetailScreen-UserDetail_AccessDV-UserGroupsLV-1-Member']", AI = false)
	private WebElement chkMember_13;

	@IFindBy(how = How.CSS, using = "select[name='UserDetailPage-UserDetailScreen-UserProfileDV-CellPhone-GlobalPhoneInputSet-CountryCode']", AI = false)
	private WebElement drpMobilePhoneRegionCode_44;

	@IFindBy(how = How.CSS, using = "input[name='UserDetailPage-UserDetailScreen-UserProfileDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-City']", AI = false)
	private WebElement inpCity_29;

	@IFindBy(how = How.CSS, using = "input[name='UserDetailPage-UserDetailScreen-UserProfileDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine1']", AI = false)
	private WebElement inpAddress1_26;

	@IFindBy(how = How.CSS, using = "input[name='UserDetailPage-UserDetailScreen-UserProfileDV-WorkPhone-GlobalPhoneInputSet-Extension']", AI = false)
	private WebElement inpWorkPhoneExtension_42;

	@IFindBy(how = How.CSS, using = "input[name='UserDetailPage-UserDetailScreen-UserProfileDV-FaxPhone-GlobalPhoneInputSet-NationalSubscriberNumber']", AI = false)
	private WebElement inpFaxPhone;

	@IFindBy(how = How.CSS, using = "#UserDetailPage-UserDetailScreen-UserRegionLV_tb-Remove>div[role='button']", AI = false)
	private WebElement btnRemove_50;

	@IFindBy(how = How.CSS, using = "#UserDetailPage-UserDetailScreen-UserAuthorityLV_tb-Remove>div[role='button']", AI = false)
	private WebElement btnRemove_52;

	@IFindBy(how = How.CSS, using = "#UserDetailPage-UserDetailScreen-UserDetail_RolesCardTab", AI = false)
	private WebElement btnRoles;

	@IFindBy(how = How.CSS, using = "select[name='UserDetailPage-UserDetailScreen-UserProfileDV-WorkPhone-GlobalPhoneInputSet-CountryCode']", AI = false)
	private WebElement drpWorkPhoneRegionCode_40;

	@IFindBy(how = How.CSS, using = "#UserDetailPage-UserDetailScreen-UserDetail_AttributesCardTab", AI = false)
	private WebElement btnAttributes;

	@IFindBy(how = How.CSS, using = "input[name='UserDetailPage-UserDetailScreen-UserDetailDV-HomePhone-GlobalPhoneInputSet-NationalSubscriberNumber']", AI = false)
	private WebElement inpHomePhone;

	@IFindBy(how = How.CSS, using = "#UserDetailPage-UserDetailScreen-UserDetail_AccessDV-UserGroupsLV_tb-Remove>div[role='button']", AI = false)
	private WebElement btnRemove_7;

	@IFindBy(how = How.CSS, using = "input[name='UserDetailPage-UserDetailScreen-UserDetailDV-UserDetailCommons-UserDetailInputSet-Name-GlobalPersonNameInputSet-FirstName']", AI = false)
	private WebElement inpFirstname;

	@IFindBy(how = How.CSS, using = "input[name='UserDetailPage-UserDetailScreen-UserDetailDV-CellPhone-GlobalPhoneInputSet-NationalSubscriberNumber']", AI = false)
	private WebElement inpMobilePhone;

	@IFindBy(how = How.CSS, using = "#UserDetailPage-UserDetailScreen-UserDetail_AccessDV-UserGroupsLV_tb-Remove>div[role='button']", AI = false)
	private WebElement btnRemove_9;

	@IFindBy(how = How.CSS, using = "input[name='UserDetailPage-UserDetailScreen-UserProfileDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine2']", AI = false)
	private WebElement inpAddress2_27;

	@IFindBy(how = How.CSS, using = "input[name='UserDetailPage-UserDetailScreen-UserDetailDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine3']", AI = false)
	private WebElement inpAddress3;

	@IFindBy(how = How.CSS, using = "select[name='UserDetailPage-UserDetailScreen-UserDetailDV-Fax-GlobalPhoneInputSet-CountryCode']", AI = false)
	private WebElement drpFaxRegionCode;

	@IFindBy(how = How.CSS, using = "input[name='UserDetailPage-UserDetailScreen-UserDetailDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine1']", AI = false)
	private WebElement inpAddress1;

	@IFindBy(how = How.CSS, using = "select[name='UserDetailPage-UserDetailScreen-UserDetailDV-AddressType']", AI = false)
	private WebElement drpAddressType;

	@IFindBy(how = How.CSS, using = "select[name='UserDetailPage-UserDetailScreen-UserDetailDV-HomePhone-GlobalPhoneInputSet-CountryCode']", AI = false)
	private WebElement drpHomePhoneRegionCode;

	@IFindBy(how = How.CSS, using = "input[name='UserDetailPage-UserDetailScreen-UserDetailDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine2']", AI = false)
	private WebElement inpAddress2;

	@IFindBy(how = How.CSS, using = "select[name='UserDetailPage-UserDetailScreen-UserProfileDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-Country']", AI = false)
	private WebElement drpCountry_25;

	@IFindBy(how = How.CSS, using = "input[name='UserDetailPage-UserDetailScreen-UserProfileDV-CellPhone-GlobalPhoneInputSet-NationalSubscriberNumber']", AI = false)
	private WebElement inpMobilePhone_45;

	@IFindBy(how = How.CSS, using = "input[name='UserDetailPage-UserDetailScreen-UserProfileDV-UseOrganizationAddress']", AI = false)
	private WebElement rdbUseOrganizationAddress_23;

	@IFindBy(how = How.CSS, using = "input[name='UserDetailPage-UserDetailScreen-UserDetailDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressSummary']", AI = false)
	private WebElement inpAddress;

	@IFindBy(how = How.CSS, using = "#UserDetailPage-UserDetailScreen-UserDetail_AccessCardTab", AI = false)
	private WebElement btnAccess;

	@IFindBy(how = How.CSS, using = "input[name='UserDetailPage-UserDetailScreen-UserDetailDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-PostalCode']", AI = false)
	private WebElement inpZIPCode;

	@IFindBy(how = How.CSS, using = "#UserDetailPage-UserDetailScreen-UserDetailDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-City-AutoFillIcon", AI = false)
	private WebElement btnAutoFillIcon;

	@IFindBy(how = How.CSS, using = "input[name='UserDetailPage-UserDetailScreen-UserDetailDV-WorkPhone-GlobalPhoneInputSet-Extension']", AI = false)
	private WebElement inpWorkPhoneExtension;

	@IFindBy(how = How.CSS, using = "input[name='UserDetailPage-UserDetailScreen-UserProfileDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressSummary']", AI = false)
	private WebElement inpAddress_24;

	@IFindBy(how = How.CSS, using = "select[name='UserDetailPage-UserDetailScreen-UserProfileDV-FaxPhone-GlobalPhoneInputSet-CountryCode']", AI = false)
	private WebElement drpFaxPhoneRegionCode;

	@IFindBy(how = How.CSS, using = "input[name='UserDetailPage-UserDetailScreen-UserProfileDV-EmployeeNumber']", AI = false)
	private WebElement inpEmployeeID_22;

	@IFindBy(how = How.CSS, using = "input[name='UserDetailPage-UserDetailScreen-UserDetailDV-Fax-GlobalPhoneInputSet-NationalSubscriberNumber']", AI = false)
	private WebElement inpFax;

	@IFindBy(how = How.CSS, using = "select[name='UserDetailPage-UserDetailScreen-UserDetailDV-CellPhone-GlobalPhoneInputSet-CountryCode']", AI = false)
	private WebElement drpMobilePhoneRegionCode;

	@IFindBy(how = How.CSS, using = "select[name='UserDetailPage-UserDetailScreen-UserDetailDV-UserDetailCommons-UserDetailInputSet-Name-GlobalPersonNameInputSet-Prefix']", AI = false)
	private WebElement drpPrefix;

	@IFindBy(how = How.CSS, using = "input[name='UserDetailPage-UserDetailScreen-UserDetailDV-EmployeeNumber']", AI = false)
	private WebElement inpEmployeeID;

	@IFindBy(how = How.CSS, using = "input[name='UserDetailPage-UserDetailScreen-UserDetailDV-UserDetailCommons-UserDetailInputSet-Name-GlobalPersonNameInputSet-NameSummary']", AI = false)
	private WebElement inpName;

	@IFindBy(how = How.CSS, using = "input[name='UserDetailPage-UserDetailScreen-UserRolesLV-0-Description']", AI = false)
	private WebElement inpDescription_21;

	@IFindBy(how = How.CSS, using = "select[name='UserDetailPage-UserDetailScreen-UserDetailDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-Country']", AI = false)
	private WebElement drpCountry;

	@IFindBy(how = How.CSS, using = "select[name='UserDetailPage-UserDetailScreen-UserDetailDV-UserDetailCommons-UserDetailInputSet-Name-GlobalPersonNameInputSet-Suffix']", AI = false)
	private WebElement drpSuffix;

	@IFindBy(how = How.CSS, using = "select[name='UserDetailPage-UserDetailScreen-UserDetailDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-State']", AI = false)
	private WebElement drpState;

	@IFindBy(how = How.CSS, using = "#UserDetailPage-UserDetailScreen-UserDetail_AccessDV-UserGroupsLV-0-Group-GroupPickerMenuIcon>div[role='menuitem']", AI = false)
	private WebElement btnSelectGroup;

	@IFindBy(how = How.CSS, using = "#UserDetailPage-UserDetailScreen-UserDetailDV-Organization-SelectOrganization", AI = false)
	private WebElement btnSelectOrganization;

	@IFindBy(how = How.CSS, using = "input[name='UserDetailPage-UserDetailScreen-UserDetail_AccessDV-UserGroupsLV-0-Manager']", AI = false)
	private WebElement chkManager;

	@IFindBy(how = How.CSS, using = "input[name='UserDetailPage-UserDetailScreen-UserProfileDV-CellPhone-GlobalPhoneInputSet-Extension']", AI = false)
	private WebElement inpMobilePhoneExtension_46;

	@IFindBy(how = How.CSS, using = "#UserDetailPage-UserDetailScreen-UserAttributesLV_tb-Add>div[role='button']", AI = false)
	private WebElement btnAdd;

	@IFindBy(how = How.CSS, using = "input[name='UserDetailPage-UserDetailScreen-UserDetailDV-ExternalUser']", AI = false)
	private WebElement rdbExternalUser;

	@IFindBy(how = How.CSS, using = "select[name='UserDetailPage-UserDetailScreen-UserProfileDV-GlobalizationPreferences-UserPreferencesInputSet-DefaultCountry']", AI = false)
	private WebElement drpDefaultCountry;

	@IFindBy(how = How.CSS, using = "select[name='UserDetailPage-UserDetailScreen-UserAuthorityLV-0-Name']", AI = false)
	private WebElement drpAuthorityProfileName;

	@IFindBy(how = How.CSS, using = "#UserDetailPage-UserDetailScreen-UserDetailToolbarButtonSet-UserDetailToolbarButtons_DeleteUserButton>div[role='button']", AI = false)
	private WebElement btnDeleteUser;

	@IFindBy(how = How.CSS, using = "select[name='UserDetailPage-UserDetailScreen-UserProfileDV-GlobalizationPreferences-UserPreferencesInputSet-DefaultPhoneCountry']", AI = false)
	private WebElement drpDefaultPhoneRegion;

	@IFindBy(how = How.CSS, using = "#UserDetailPage-UserDetailScreen-UserDetail_AccessDV-UserGroupsLV-1-Group-GroupSearchMenuIcon>div[role='menuitem']", AI = false)
	private WebElement btnSearchforGroup_12;

	@IFindBy(how = How.CSS, using = "select[name='UserDetailPage-UserDetailScreen-UserRolesLV-0-RoleName']", AI = false)
	private WebElement drpName;

	@IFindBy(how = How.CSS, using = "input[name='UserDetailPage-UserDetailScreen-UserDetailDV-AddressDescription']", AI = false)
	private WebElement inpDescription;

	@IFindBy(how = How.CSS, using = "select[name='UserDetailPage-UserDetailScreen-UserAuthorityLV-4-Name']", AI = false)
	private WebElement drpAuthorityProfileName_60;

	@IFindBy(how = How.CSS, using = "#UserDetailPage-UserDetailScreen-UserDetail_AccessDV-UserGroupsLV_tb-AddGroupButton-SearchAndAddGroup>div[role='button']", AI = false)
	private WebElement btnSearchandselectagroup;

	@IFindBy(how = How.CSS, using = "input[name='UserDetailPage-UserDetailScreen-UserDetailDV-HomePhone-GlobalPhoneInputSet-Extension']", AI = false)
	private WebElement inpHomePhoneExtension;

	@IFindBy(how = How.CSS, using = "input[name='UserDetailPage-UserDetailScreen-UserDetailDV-UserDetailCommons-UserDetailInputSet-Name-GlobalPersonNameInputSet-Particle']", AI = false)
	private WebElement inpParticle;

	@IFindBy(how = How.CSS, using = "select[name='UserDetailPage-UserDetailScreen-UserDetailDV-UserType']", AI = false)
	private WebElement drpUserType;

	@IFindBy(how = How.CSS, using = "input[name='UserDetailPage-UserDetailScreen-UserProfileDV-HomePhone-GlobalPhoneInputSet-Extension']", AI = false)
	private WebElement inpHomePhoneExtension_38;

	@IFindBy(how = How.CSS, using = "select[name='UserDetailPage-UserDetailScreen-UserProfileDV-PrimaryPhone']", AI = false)
	private WebElement drpPrimaryPhone_35;

	@IFindBy(how = How.CSS, using = "input[name='UserDetailPage-UserDetailScreen-UserDetailDV-CellPhone-GlobalPhoneInputSet-Extension']", AI = false)
	private WebElement inpMobilePhoneExtension;

	@IFindBy(how = How.CSS, using = "input[name='UserDetailPage-UserDetailScreen-UserDetailDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-City']", AI = false)
	private WebElement inpCity;

	@IFindBy(how = How.CSS, using = "#UserDetailPage-UserDetailScreen-UserRegionLV_tb-Add>div[role='button']", AI = false)
	private WebElement btnAdd_49;

	@IFindBy(how = How.CSS, using = "#UserDetailPage-UserDetailScreen-UserDetail_AccessDV-UserGroupsLV-0-Group-GroupMenuIcon>div[role='button']", AI = false)
	private WebElement btnGroupMenuIcon;

	@IFindBy(how = How.CSS, using = "input[name='UserDetailPage-UserDetailScreen-UserProfileDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-County']", AI = false)
	private WebElement inpCounty_31;

	@IFindBy(how = How.CSS, using = "select[name='UserDetailPage-UserDetailScreen-UserDetailDV-WorkPhone-GlobalPhoneInputSet-CountryCode']", AI = false)
	private WebElement drpWorkPhoneRegionCode;

	@IFindBy(how = How.CSS, using = "select[name='UserDetailPage-UserDetailScreen-UserDetail_AccessDV-UserGroupsLV-0-LoadFactorType']", AI = false)
	private WebElement drpLoadFactorPermissions;

	@IFindBy(how = How.CSS, using = "select[name='UserDetailPage-UserDetailScreen-UserProfileDV-GlobalizationPreferences-UserPreferencesInputSet-Language']", AI = false)
	private WebElement drpUserLanguage;

	@IFindBy(how = How.CSS, using = "select[name='UserDetailPage-UserDetailScreen-UserAuthorityLV-1-Name']", AI = false)
	private WebElement drpAuthorityProfileName_54;

	@IFindBy(how = How.CSS, using = "#UserDetailPage-UserDetailScreen-UserDetail_RegionCardTab", AI = false)
	private WebElement btnRegion;

	@IFindBy(how = How.CSS, using = "select[name='UserDetailPage-UserDetailScreen-UserAuthorityLV-2-Name']", AI = false)
	private WebElement drpAuthorityProfileName_56;

	@IFindBy(how = How.CSS, using = "select[name='UserDetailPage-UserDetailScreen-UserAuthorityLV-3-Name']", AI = false)
	private WebElement drpAuthorityProfileName_58;

	@IFindBy(how = How.CSS, using = "input[name='UserDetailPage-UserDetailScreen-UserProfileDV-WorkPhone-GlobalPhoneInputSet-NationalSubscriberNumber']", AI = false)
	private WebElement inpWorkPhone_41;

	@IFindBy(how = How.CSS, using = "input[name='UserDetailPage-UserDetailScreen-UserProfileDV-WorkPhone-GlobalPhoneInputSet-PhoneDisplay']", AI = false)
	private WebElement inpWorkPhone_43;

	@IFindBy(how = How.CSS, using = "input[name='UserDetailPage-UserDetailScreen-UserDetailDV-UserDetailCommons-UserDetailInputSet-Active']", AI = false)
	private WebElement rdbActive;

	@IFindBy(how = How.CSS, using = "input[name='UserDetailPage-UserDetailScreen-UserDetailDV-UserDetailCommons-UserDetailInputSet-Username']", AI = false)
	private WebElement inpUsername;

	@IFindBy(how = How.CSS, using = "input[name='UserDetailPage-UserDetailScreen-UserDetail_AccessDV-UserGroupsLV-0-Member']", AI = false)
	private WebElement chkMember;

	@IFindBy(how = How.CSS, using = "input[name='UserDetailPage-UserDetailScreen-UserProfileDV-CellPhone-GlobalPhoneInputSet-PhoneDisplay']", AI = false)
	private WebElement inpMobilePhone_47;

	@IFindBy(how = How.CSS, using = "#UserDetailPage-UserDetailScreen-UserAuthorityLV_tb-Add>div[role='button']", AI = false)
	private WebElement btnAdd_51;

	@IFindBy(how = How.CSS, using = "input[name='UserDetailPage-UserDetailScreen-UserDetailDV-WorkPhone-GlobalPhoneInputSet-PhoneDisplay']", AI = false)
	private WebElement inpWorkPhone_3;

	@IFindBy(how = How.CSS, using = "input[name='UserDetailPage-UserDetailScreen-UserProfileDV-FaxPhone-GlobalPhoneInputSet-PhoneDisplay']", AI = false)
	private WebElement inpFaxPhone_48;

	@IFindBy(how = How.CSS, using = "#UserDetailPage-UserDetailScreen-UserRolesLV_tb-Add>div[role='button']", AI = false)
	private WebElement btnAdd_19;

	@IFindBy(how = How.CSS, using = "#UserDetailPage-UserDetailScreen-ttlBar", AI = false)
	private WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "#UserDetailPage-UserDetailScreen-UserDetail_AccessDV-AdditionalProducerCodesLV_tb-Add>div[role='button']", AI = false)
	private WebElement btnAdd_17;

	@IFindBy(how = How.CSS, using = "input[name='UserDetailPage-UserDetailScreen-UserAuthorityLV-1-Description']", AI = false)
	private WebElement inpDescription_55;

	@IFindBy(how = How.CSS, using = "#UserDetailPage-UserDetailScreen-UserDetailToolbarButtonSet-Edit>div[role='button']", AI = false)
	private WebElement btnEdit;

	@IFindBy(how = How.CSS, using = "input[name='UserDetailPage-UserDetailScreen-UserAuthorityLV-0-Description']", AI = false)
	private WebElement inpDescription_53;

	@IFindBy(how = How.CSS, using = "input[name='UserDetailPage-UserDetailScreen-UserProfileDV-EmailAddress1']", AI = false)
	private WebElement inpPrimaryEmailAddress;

	@IFindBy(how = How.CSS, using = "#UserDetailPage-UserDetailScreen-UserDetailToolbarButtonSet-Update>div[role='button']", AI = false)
	private WebElement btnUpdate;

	@IFindBy(how = How.CSS, using = "input[name='UserDetailPage-UserDetailScreen-UserDetail_AccessDV-UserGroupsLV-1-Manager']", AI = false)
	private WebElement chkManager_14;

	@IFindBy(how = How.CSS, using = "#UserDetailPage-UserDetailScreen-UserRolesLV_tb-Remove>div[role='button']", AI = false)
	private WebElement btnRemove_20;

	@IFindBy(how = How.CSS, using = "input[name='UserDetailPage-UserDetailScreen-UserProfileDV-HomePhone-GlobalPhoneInputSet-NationalSubscriberNumber']", AI = false)
	private WebElement inpHomePhone_37;

	@IFindBy(how = How.CSS, using = "#UserDetailPage-UserDetailScreen-UserDetail_AccessDV-UserGroupsLV-0-Group-GroupSearchMenuIcon>div[role='menuitem']", AI = false)
	private WebElement btnSearchforGroup;

	@IFindBy(how = How.CSS, using = "#UserDetailPage-UserDetailScreen-UserDetail_AccessDV-AdditionalProducerCodesLV_tb-Remove>div[role='button']", AI = false)
	private WebElement btnRemove_18;

	@IFindBy(how = How.CSS, using = "#UserDetailPage-UserDetailScreen-UserDetail_BasicCardTab", AI = false)
	private WebElement btnBasics;

	@IFindBy(how = How.CSS, using = "#UserDetailPage-UserDetailScreen-UserProfileDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-City-AutoFillIcon", AI = false)
	private WebElement btnAutoFillIcon_30;

	@IFindBy(how = How.CSS, using = "input[name='UserDetailPage-UserDetailScreen-UserDetailDV-UserDetailCommons-UserDetailInputSet-Name-GlobalPersonNameInputSet-MiddleName']", AI = false)
	private WebElement inpMiddlename;

	@IFindBy(how = How.CSS, using = "input[name='UserDetailPage-UserDetailScreen-UserDetailDV-Email']", AI = false)
	private WebElement inpEmailAddress;

	@IFindBy(how = How.CSS, using = "input[name='UserDetailPage-UserDetailScreen-UserProfileDV-EmailAddress2']", AI = false)
	private WebElement inpAlternateEmailAddress;

	@IFindBy(how = How.CSS, using = "#UserDetailPage-UserDetailScreen-UserAttributesLV_tb-Remove>div[role='button']", AI = false)
	private WebElement btnRemove;

	@IFindBy(how = How.CSS, using = "input[name='UserDetailPage-UserDetailScreen-UserAuthorityLV-3-Description']", AI = false)
	private WebElement inpDescription_59;

	@IFindBy(how = How.CSS, using = "input[name='UserDetailPage-UserDetailScreen-UserDetailDV-CellPhone-GlobalPhoneInputSet-PhoneDisplay']", AI = false)
	private WebElement inpMobilePhone_4;

	@IFindBy(how = How.CSS, using = "#UserDetailPage-UserDetailScreen-UserProfileDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-PostalCode-AutoFillIcon", AI = false)
	private WebElement btnAutoFillIcon_34;

	@IFindBy(how = How.CSS, using = "input[name='UserDetailPage-UserDetailScreen-UserAuthorityLV-2-Description']", AI = false)
	private WebElement inpDescription_57;

	@IFindBy(how = How.CSS, using = "#UserDetailPage-UserDetailScreen-UserDetail_AccessDV-UserGroupsLV_tb-AddGroupButton>div[role='button']", AI = false)
	private WebElement btnAdd_8;

	@IFindBy(how = How.CSS, using = "#UserDetailPage-UserDetailScreen-UserDetail_AccessDV-UserGroupsLV_tb-Add>div[role='button']", AI = false)
	private WebElement btnAdd_6;

	@IFindBy(how = How.CSS, using = "input[name='UserDetailPage-UserDetailScreen-UserAuthorityLV-4-Description']", AI = false)
	private WebElement inpDescription_61;

	@IFindBy(how = How.CSS, using = "input[name='UserDetailPage-UserDetailScreen-UserProfileDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine3']", AI = false)
	private WebElement inpAddress3_28;

	@IFindBy(how = How.CSS, using = "#UserDetailPage-UserDetailScreen-UserDetail_AccessDV-UserGroupsLV-1-Group-GroupPickerMenuIcon>div[role='menuitem']", AI = false)
	private WebElement btnSelectGroup_11;

	@IFindBy(how = How.CSS, using = "select[name='UserDetailPage-UserDetailScreen-UserProfileDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-State']", AI = false)
	private WebElement drpState_32;

	@IFindBy(how = How.CSS, using = "input[name='UserDetailPage-UserDetailScreen-UserProfileDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-PostalCode']", AI = false)
	private WebElement inpZIPCode_33;

	@IFindBy(how = How.CSS, using = "input[name='UserDetailPage-UserDetailScreen-UserDetailDV-WorkPhone-GlobalPhoneInputSet-NationalSubscriberNumber']", AI = false)
	private WebElement inpWorkPhone;

	@IFindBy(how = How.CSS, using = "select[name='UserDetailPage-UserDetailScreen-UserProfileDV-GlobalizationPreferences-UserPreferencesInputSet-RegionalFormats']", AI = false)
	private WebElement drpRegionalFormat;

	@IFindBy(how = How.CSS, using = "#UserDetailPage-UserDetailScreen-UserDetailToolbarButtonSet-Cancel>div[role='button']", AI = false)
	private WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "input[name='UserDetailPage-UserDetailScreen-UserProfileDV-HomePhone-GlobalPhoneInputSet-PhoneDisplay']", AI = false)
	private WebElement inpHomePhone_39;

	@IFindBy(how = How.CSS, using = "input[name='UserDetailPage-UserDetailScreen-UserDetail_AccessDV-UserGroupsLV-0-LoadFactor']", AI = false)
	private WebElement inpLoadFactor;

	@IFindBy(how = How.CSS, using = "#UserDetailPage-UserDetailScreen-UserDetail_AccessDV-UserGroupsLV_tb-AddGroupButton-AddUserGroup>div[role='button']", AI = false)
	private WebElement btnSelectusergroup;

	@IFindBy(how = How.CSS, using = "#UserDetailPage-UserDetailScreen-UserDetail_AccessDV-UserGroupsLV-1-Group-GroupMenuIcon>div[role='button']", AI = false)
	private WebElement btnGroupMenuIcon_10;

	@IFindBy(how = How.CSS, using = "select[name='UserDetailPage-UserDetailScreen-UserProfileDV-HomePhone-GlobalPhoneInputSet-CountryCode']", AI = false)
	private WebElement drpHomePhoneRegionCode_36;

	@IFindBy(how = How.CSS, using = "input[name='UserDetailPage-UserDetailScreen-UserProfileDV-FaxPhone-GlobalPhoneInputSet-Extension']", AI = false)
	private WebElement inpFaxPhoneExtension;

	@IFindBy(how = How.CSS, using = "input[name='UserDetailPage-UserDetailScreen-UserDetailDV-UseOrganizationAddress']", AI = false)
	private WebElement rdbUseOrganizationAddress;
	
	@IFindBy(how = How.CSS, using = "div[id$='FirstName']", AI = false)
	private WebElement lblFirstName;

	public UserSuperUserPage(){
	}

	public UserSuperUserPage(WebDriver driver){
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
}public UserSuperUserPage clickUseProducerCodesecurity(WebDriver driver)  {
					BrowserActions.click(driver, rdbUseProducerCodesecurity,"UseProducerCodesecurity");
				    return this;
			}
public UserSuperUserPage clickUWAuthority(WebDriver driver)  {
					BrowserActions.click(driver, btnUWAuthority,"UWAuthority");
				    return this;
			}
public UserSuperUserPage clickProfile(WebDriver driver)  {
					BrowserActions.click(driver, btnProfile,"Profile");
				    return this;
			}
public UserSuperUserPage enterFax_5(WebDriver driver,String Fax_5) {
		            BrowserActions.type(driver, inpFax_5,Fax_5, "Fax_5");
			        return this;
           }
public UserSuperUserPage enterHomePhone_2(WebDriver driver,String HomePhone_2) {
		            BrowserActions.type(driver, inpHomePhone_2,HomePhone_2, "HomePhone_2");
			        return this;
           }
public UserSuperUserPage selectLoadFactorPermissions_15(WebDriver driver,String LoadFactorPermissions_15)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpLoadFactorPermissions_15,LoadFactorPermissions_15,"LoadFactorPermissions_15");
				    return this;
			}
public UserSuperUserPage enterOrganization(WebDriver driver,String Organization) {
		            BrowserActions.type(driver, inpOrganization,Organization, "Organization");
			        return this;
           }
public UserSuperUserPage clickLocked(WebDriver driver)  {
					BrowserActions.click(driver, rdbLocked,"Locked");
				    return this;
			}
public UserSuperUserPage clickAutoFillIcon_1(WebDriver driver)  {
					BrowserActions.click(driver, btnAutoFillIcon_1,"AutoFillIcon_1");
				    return this;
			}
public UserSuperUserPage enterFaxExtension(WebDriver driver,String FaxExtension) {
		            BrowserActions.type(driver, inpFaxExtension,FaxExtension, "FaxExtension");
			        return this;
           }
public UserSuperUserPage enterLastname(WebDriver driver,String Lastname) {
		            BrowserActions.type(driver, inpLastname,Lastname, "Lastname");
			        return this;
           }
public UserSuperUserPage enterLoadFactor_16(WebDriver driver,String LoadFactor_16) {
		            BrowserActions.type(driver, inpLoadFactor_16,LoadFactor_16, "LoadFactor_16");
			        return this;
           }
public UserSuperUserPage selectPrimaryPhone(WebDriver driver,String PrimaryPhone)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPrimaryPhone,PrimaryPhone,"PrimaryPhone");
				    return this;
			}
public UserSuperUserPage enterCounty(WebDriver driver,String County) {
		            BrowserActions.type(driver, inpCounty,County, "County");
			        return this;
           }
public UserSuperUserPage clickMember_13(WebDriver driver)  {
					BrowserActions.click(driver, chkMember_13,"Member_13");
				    return this;
			}
public UserSuperUserPage selectMobilePhoneRegionCode_44(WebDriver driver,String MobilePhoneRegionCode_44)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpMobilePhoneRegionCode_44,MobilePhoneRegionCode_44,"MobilePhoneRegionCode_44");
				    return this;
			}
public UserSuperUserPage enterCity_29(WebDriver driver,String City_29) {
		            BrowserActions.type(driver, inpCity_29,City_29, "City_29");
			        return this;
           }
public UserSuperUserPage enterAddress1_26(WebDriver driver,String Address1_26) {
		            BrowserActions.type(driver, inpAddress1_26,Address1_26, "Address1_26");
			        return this;
           }
public UserSuperUserPage enterWorkPhoneExtension_42(WebDriver driver,String WorkPhoneExtension_42) {
		            BrowserActions.type(driver, inpWorkPhoneExtension_42,WorkPhoneExtension_42, "WorkPhoneExtension_42");
			        return this;
           }
public UserSuperUserPage enterFaxPhone(WebDriver driver,String FaxPhone) {
		            BrowserActions.type(driver, inpFaxPhone,FaxPhone, "FaxPhone");
			        return this;
           }
public UserSuperUserPage clickRemove_50(WebDriver driver)  {
					BrowserActions.click(driver, btnRemove_50,"Remove_50");
				    return this;
			}
public UserSuperUserPage clickRemove_52(WebDriver driver)  {
					BrowserActions.click(driver, btnRemove_52,"Remove_52");
				    return this;
			}
public UserSuperUserPage clickRoles(WebDriver driver)  {
					BrowserActions.click(driver, btnRoles,"Roles");
				    return this;
			}
public UserSuperUserPage selectWorkPhoneRegionCode_40(WebDriver driver,String WorkPhoneRegionCode_40)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpWorkPhoneRegionCode_40,WorkPhoneRegionCode_40,"WorkPhoneRegionCode_40");
				    return this;
			}
public UserSuperUserPage clickAttributes(WebDriver driver)  {
					BrowserActions.click(driver, btnAttributes,"Attributes");
				    return this;
			}
public UserSuperUserPage enterHomePhone(WebDriver driver,String HomePhone) {
		            BrowserActions.type(driver, inpHomePhone,HomePhone, "HomePhone");
			        return this;
           }
public UserSuperUserPage clickRemove_7(WebDriver driver)  {
					BrowserActions.click(driver, btnRemove_7,"Remove_7");
				    return this;
			}
public UserSuperUserPage enterFirstname(WebDriver driver,String Firstname) {
		            BrowserActions.type(driver, inpFirstname,Firstname, "Firstname");
			        return this;
           }
public UserSuperUserPage enterMobilePhone(WebDriver driver,String MobilePhone) {
		            BrowserActions.type(driver, inpMobilePhone,MobilePhone, "MobilePhone");
			        return this;
           }
public UserSuperUserPage clickRemove_9(WebDriver driver)  {
					BrowserActions.click(driver, btnRemove_9,"Remove_9");
				    return this;
			}
public UserSuperUserPage enterAddress2_27(WebDriver driver,String Address2_27) {
		            BrowserActions.type(driver, inpAddress2_27,Address2_27, "Address2_27");
			        return this;
           }
public UserSuperUserPage enterAddress3(WebDriver driver,String Address3) {
		            BrowserActions.type(driver, inpAddress3,Address3, "Address3");
			        return this;
           }
public UserSuperUserPage selectFaxRegionCode(WebDriver driver,String FaxRegionCode)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpFaxRegionCode,FaxRegionCode,"FaxRegionCode");
				    return this;
			}
public UserSuperUserPage enterAddress1(WebDriver driver,String Address1) {
		            BrowserActions.type(driver, inpAddress1,Address1, "Address1");
			        return this;
           }
public UserSuperUserPage selectAddressType(WebDriver driver,String AddressType)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpAddressType,AddressType,"AddressType");
				    return this;
			}
public UserSuperUserPage selectHomePhoneRegionCode(WebDriver driver,String HomePhoneRegionCode)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpHomePhoneRegionCode,HomePhoneRegionCode,"HomePhoneRegionCode");
				    return this;
			}
public UserSuperUserPage enterAddress2(WebDriver driver,String Address2) {
		            BrowserActions.type(driver, inpAddress2,Address2, "Address2");
			        return this;
           }
public UserSuperUserPage selectCountry_25(WebDriver driver,String Country_25)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpCountry_25,Country_25,"Country_25");
				    return this;
			}
public UserSuperUserPage enterMobilePhone_45(WebDriver driver,String MobilePhone_45) {
		            BrowserActions.type(driver, inpMobilePhone_45,MobilePhone_45, "MobilePhone_45");
			        return this;
           }
public UserSuperUserPage clickUseOrganizationAddress_23(WebDriver driver)  {
					BrowserActions.click(driver, rdbUseOrganizationAddress_23,"UseOrganizationAddress_23");
				    return this;
			}
public UserSuperUserPage enterAddress(WebDriver driver,String Address) {
		            BrowserActions.type(driver, inpAddress,Address, "Address");
			        return this;
           }
public UserSuperUserPage clickAccess(WebDriver driver)  {
					BrowserActions.click(driver, btnAccess,"Access");
				    return this;
			}
public UserSuperUserPage enterZIPCode(WebDriver driver,String ZIPCode) {
		            BrowserActions.type(driver, inpZIPCode,ZIPCode, "ZIPCode");
			        return this;
           }
public UserSuperUserPage clickAutoFillIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnAutoFillIcon,"AutoFillIcon");
				    return this;
			}
public UserSuperUserPage enterWorkPhoneExtension(WebDriver driver,String WorkPhoneExtension) {
		            BrowserActions.type(driver, inpWorkPhoneExtension,WorkPhoneExtension, "WorkPhoneExtension");
			        return this;
           }
public UserSuperUserPage enterAddress_24(WebDriver driver,String Address_24) {
		            BrowserActions.type(driver, inpAddress_24,Address_24, "Address_24");
			        return this;
           }
public UserSuperUserPage selectFaxPhoneRegionCode(WebDriver driver,String FaxPhoneRegionCode)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpFaxPhoneRegionCode,FaxPhoneRegionCode,"FaxPhoneRegionCode");
				    return this;
			}
public UserSuperUserPage enterEmployeeID_22(WebDriver driver,String EmployeeID_22) {
		            BrowserActions.type(driver, inpEmployeeID_22,EmployeeID_22, "EmployeeID_22");
			        return this;
           }
public UserSuperUserPage enterFax(WebDriver driver,String Fax) {
		            BrowserActions.type(driver, inpFax,Fax, "Fax");
			        return this;
           }
public UserSuperUserPage selectMobilePhoneRegionCode(WebDriver driver,String MobilePhoneRegionCode)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpMobilePhoneRegionCode,MobilePhoneRegionCode,"MobilePhoneRegionCode");
				    return this;
			}
public UserSuperUserPage selectPrefix(WebDriver driver,String Prefix)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPrefix,Prefix,"Prefix");
				    return this;
			}
public UserSuperUserPage enterEmployeeID(WebDriver driver,String EmployeeID) {
		            BrowserActions.type(driver, inpEmployeeID,EmployeeID, "EmployeeID");
			        return this;
           }
public UserSuperUserPage enterName(WebDriver driver,String Name) {
		            BrowserActions.type(driver, inpName,Name, "Name");
			        return this;
           }
public UserSuperUserPage enterDescription_21(WebDriver driver,String Description_21) {
		            BrowserActions.type(driver, inpDescription_21,Description_21, "Description_21");
			        return this;
           }
public UserSuperUserPage selectCountry(WebDriver driver,String Country)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpCountry,Country,"Country");
				    return this;
			}
public UserSuperUserPage selectSuffix(WebDriver driver,String Suffix)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpSuffix,Suffix,"Suffix");
				    return this;
			}
public UserSuperUserPage selectState(WebDriver driver,String State)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpState,State,"State");
				    return this;
			}
public UserSuperUserPage clickSelectGroup(WebDriver driver)  {
					BrowserActions.click(driver, btnSelectGroup,"SelectGroup");
				    return this;
			}
public UserSuperUserPage clickSelectOrganization(WebDriver driver)  {
					BrowserActions.click(driver, btnSelectOrganization,"SelectOrganization");
				    return this;
			}
public UserSuperUserPage clickManager(WebDriver driver)  {
					BrowserActions.click(driver, chkManager,"Manager");
				    return this;
			}
public UserSuperUserPage enterMobilePhoneExtension_46(WebDriver driver,String MobilePhoneExtension_46) {
		            BrowserActions.type(driver, inpMobilePhoneExtension_46,MobilePhoneExtension_46, "MobilePhoneExtension_46");
			        return this;
           }
public UserSuperUserPage clickAdd(WebDriver driver)  {
					BrowserActions.click(driver, btnAdd,"Add");
				    return this;
			}
public UserSuperUserPage clickExternalUser(WebDriver driver)  {
					BrowserActions.click(driver, rdbExternalUser,"ExternalUser");
				    return this;
			}
public UserSuperUserPage selectDefaultCountry(WebDriver driver,String DefaultCountry)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpDefaultCountry,DefaultCountry,"DefaultCountry");
				    return this;
			}
public UserSuperUserPage selectAuthorityProfileName(WebDriver driver,String AuthorityProfileName)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpAuthorityProfileName,AuthorityProfileName,"AuthorityProfileName");
				    return this;
			}
public UserSuperUserPage clickDeleteUser(WebDriver driver)  {
					BrowserActions.click(driver, btnDeleteUser,"DeleteUser");
				    return this;
			}
public UserSuperUserPage selectDefaultPhoneRegion(WebDriver driver,String DefaultPhoneRegion)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpDefaultPhoneRegion,DefaultPhoneRegion,"DefaultPhoneRegion");
				    return this;
			}
public UserSuperUserPage clickSearchforGroup_12(WebDriver driver)  {
					BrowserActions.click(driver, btnSearchforGroup_12,"SearchforGroup_12");
				    return this;
			}
public UserSuperUserPage selectName(WebDriver driver,String Name)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpName,Name,"Name");
				    return this;
			}
public UserSuperUserPage enterDescription(WebDriver driver,String Description) {
		            BrowserActions.type(driver, inpDescription,Description, "Description");
			        return this;
           }
public UserSuperUserPage selectAuthorityProfileName_60(WebDriver driver,String AuthorityProfileName_60)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpAuthorityProfileName_60,AuthorityProfileName_60,"AuthorityProfileName_60");
				    return this;
			}
public UserSuperUserPage clickSearchandselectagroup(WebDriver driver)  {
					BrowserActions.click(driver, btnSearchandselectagroup,"Searchandselectagroup");
				    return this;
			}
public UserSuperUserPage enterHomePhoneExtension(WebDriver driver,String HomePhoneExtension) {
		            BrowserActions.type(driver, inpHomePhoneExtension,HomePhoneExtension, "HomePhoneExtension");
			        return this;
           }
public UserSuperUserPage enterParticle(WebDriver driver,String Particle) {
		            BrowserActions.type(driver, inpParticle,Particle, "Particle");
			        return this;
           }
public UserSuperUserPage selectUserType(WebDriver driver,String UserType)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpUserType,UserType,"UserType");
				    return this;
			}
public UserSuperUserPage enterHomePhoneExtension_38(WebDriver driver,String HomePhoneExtension_38) {
		            BrowserActions.type(driver, inpHomePhoneExtension_38,HomePhoneExtension_38, "HomePhoneExtension_38");
			        return this;
           }
public UserSuperUserPage selectPrimaryPhone_35(WebDriver driver,String PrimaryPhone_35)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPrimaryPhone_35,PrimaryPhone_35,"PrimaryPhone_35");
				    return this;
			}
public UserSuperUserPage enterMobilePhoneExtension(WebDriver driver,String MobilePhoneExtension) {
		            BrowserActions.type(driver, inpMobilePhoneExtension,MobilePhoneExtension, "MobilePhoneExtension");
			        return this;
           }
public UserSuperUserPage enterCity(WebDriver driver,String City) {
		            BrowserActions.type(driver, inpCity,City, "City");
			        return this;
           }
public UserSuperUserPage clickAdd_49(WebDriver driver)  {
					BrowserActions.click(driver, btnAdd_49,"Add_49");
				    return this;
			}
public UserSuperUserPage clickGroupMenuIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnGroupMenuIcon,"GroupMenuIcon");
				    return this;
			}
public UserSuperUserPage enterCounty_31(WebDriver driver,String County_31) {
		            BrowserActions.type(driver, inpCounty_31,County_31, "County_31");
			        return this;
           }
public UserSuperUserPage selectWorkPhoneRegionCode(WebDriver driver,String WorkPhoneRegionCode)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpWorkPhoneRegionCode,WorkPhoneRegionCode,"WorkPhoneRegionCode");
				    return this;
			}
public UserSuperUserPage selectLoadFactorPermissions(WebDriver driver,String LoadFactorPermissions)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpLoadFactorPermissions,LoadFactorPermissions,"LoadFactorPermissions");
				    return this;
			}
public UserSuperUserPage selectUserLanguage(WebDriver driver,String UserLanguage)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpUserLanguage,UserLanguage,"UserLanguage");
				    return this;
			}
public UserSuperUserPage selectAuthorityProfileName_54(WebDriver driver,String AuthorityProfileName_54)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpAuthorityProfileName_54,AuthorityProfileName_54,"AuthorityProfileName_54");
				    return this;
			}
public UserSuperUserPage clickRegion(WebDriver driver)  {
					BrowserActions.click(driver, btnRegion,"Region");
				    return this;
			}
public UserSuperUserPage selectAuthorityProfileName_56(WebDriver driver,String AuthorityProfileName_56)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpAuthorityProfileName_56,AuthorityProfileName_56,"AuthorityProfileName_56");
				    return this;
			}
public UserSuperUserPage selectAuthorityProfileName_58(WebDriver driver,String AuthorityProfileName_58)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpAuthorityProfileName_58,AuthorityProfileName_58,"AuthorityProfileName_58");
				    return this;
			}
public UserSuperUserPage enterWorkPhone_41(WebDriver driver,String WorkPhone_41) {
		            BrowserActions.type(driver, inpWorkPhone_41,WorkPhone_41, "WorkPhone_41");
			        return this;
           }
public UserSuperUserPage enterWorkPhone_43(WebDriver driver,String WorkPhone_43) {
		            BrowserActions.type(driver, inpWorkPhone_43,WorkPhone_43, "WorkPhone_43");
			        return this;
           }
public UserSuperUserPage clickActive(WebDriver driver)  {
					BrowserActions.click(driver, rdbActive,"Active");
				    return this;
			}
public UserSuperUserPage enterUsername(WebDriver driver,String Username) {
		            BrowserActions.type(driver, inpUsername,Username, "Username");
			        return this;
           }
public UserSuperUserPage clickMember(WebDriver driver)  {
					BrowserActions.click(driver, chkMember,"Member");
				    return this;
			}
public UserSuperUserPage enterMobilePhone_47(WebDriver driver,String MobilePhone_47) {
		            BrowserActions.type(driver, inpMobilePhone_47,MobilePhone_47, "MobilePhone_47");
			        return this;
           }
public UserSuperUserPage clickAdd_51(WebDriver driver)  {
					BrowserActions.click(driver, btnAdd_51,"Add_51");
				    return this;
			}
public UserSuperUserPage enterWorkPhone_3(WebDriver driver,String WorkPhone_3) {
		            BrowserActions.type(driver, inpWorkPhone_3,WorkPhone_3, "WorkPhone_3");
			        return this;
           }
public UserSuperUserPage enterFaxPhone_48(WebDriver driver,String FaxPhone_48) {
		            BrowserActions.type(driver, inpFaxPhone_48,FaxPhone_48, "FaxPhone_48");
			        return this;
           }
public UserSuperUserPage clickAdd_19(WebDriver driver)  {
					BrowserActions.click(driver, btnAdd_19,"Add_19");
				    return this;
			}
public UserSuperUserPage clickAdd_17(WebDriver driver)  {
					BrowserActions.click(driver, btnAdd_17,"Add_17");
				    return this;
			}
public UserSuperUserPage enterDescription_55(WebDriver driver,String Description_55) {
		            BrowserActions.type(driver, inpDescription_55,Description_55, "Description_55");
			        return this;
           }
public UserSuperUserPage clickEdit(WebDriver driver)  {
					BrowserActions.click(driver, btnEdit,"Edit");
				    return this;
			}
public UserSuperUserPage enterDescription_53(WebDriver driver,String Description_53) {
		            BrowserActions.type(driver, inpDescription_53,Description_53, "Description_53");
			        return this;
           }
public UserSuperUserPage enterPrimaryEmailAddress(WebDriver driver,String PrimaryEmailAddress) {
		            BrowserActions.type(driver, inpPrimaryEmailAddress,PrimaryEmailAddress, "PrimaryEmailAddress");
			        return this;
           }
public UserSuperUserPage clickUpdate(WebDriver driver)  {
					BrowserActions.click(driver, btnUpdate,"Update");
				    return this;
			}
public UserSuperUserPage clickManager_14(WebDriver driver)  {
					BrowserActions.click(driver, chkManager_14,"Manager_14");
				    return this;
			}
public UserSuperUserPage clickRemove_20(WebDriver driver)  {
					BrowserActions.click(driver, btnRemove_20,"Remove_20");
				    return this;
			}
public UserSuperUserPage enterHomePhone_37(WebDriver driver,String HomePhone_37) {
		            BrowserActions.type(driver, inpHomePhone_37,HomePhone_37, "HomePhone_37");
			        return this;
           }
public UserSuperUserPage clickSearchforGroup(WebDriver driver)  {
					BrowserActions.click(driver, btnSearchforGroup,"SearchforGroup");
				    return this;
			}
public UserSuperUserPage clickRemove_18(WebDriver driver)  {
					BrowserActions.click(driver, btnRemove_18,"Remove_18");
				    return this;
			}
public UserSuperUserPage clickBasics(WebDriver driver)  {
					BrowserActions.click(driver, btnBasics,"Basics");
				    return this;
			}
public UserSuperUserPage clickAutoFillIcon_30(WebDriver driver)  {
					BrowserActions.click(driver, btnAutoFillIcon_30,"AutoFillIcon_30");
				    return this;
			}
public UserSuperUserPage enterMiddlename(WebDriver driver,String Middlename) {
		            BrowserActions.type(driver, inpMiddlename,Middlename, "Middlename");
			        return this;
           }
public UserSuperUserPage enterEmailAddress(WebDriver driver,String EmailAddress) {
		            BrowserActions.type(driver, inpEmailAddress,EmailAddress, "EmailAddress");
			        return this;
           }
public UserSuperUserPage enterAlternateEmailAddress(WebDriver driver,String AlternateEmailAddress) {
		            BrowserActions.type(driver, inpAlternateEmailAddress,AlternateEmailAddress, "AlternateEmailAddress");
			        return this;
           }
public UserSuperUserPage clickRemove(WebDriver driver)  {
					BrowserActions.click(driver, btnRemove,"Remove");
				    return this;
			}
public UserSuperUserPage enterDescription_59(WebDriver driver,String Description_59) {
		            BrowserActions.type(driver, inpDescription_59,Description_59, "Description_59");
			        return this;
           }
public UserSuperUserPage enterMobilePhone_4(WebDriver driver,String MobilePhone_4) {
		            BrowserActions.type(driver, inpMobilePhone_4,MobilePhone_4, "MobilePhone_4");
			        return this;
           }
public UserSuperUserPage clickAutoFillIcon_34(WebDriver driver)  {
					BrowserActions.click(driver, btnAutoFillIcon_34,"AutoFillIcon_34");
				    return this;
			}
public UserSuperUserPage enterDescription_57(WebDriver driver,String Description_57) {
		            BrowserActions.type(driver, inpDescription_57,Description_57, "Description_57");
			        return this;
           }
public UserSuperUserPage clickAdd_8(WebDriver driver)  {
					BrowserActions.click(driver, btnAdd_8,"Add_8");
				    return this;
			}
public UserSuperUserPage clickAdd_6(WebDriver driver)  {
					BrowserActions.click(driver, btnAdd_6,"Add_6");
				    return this;
			}
public UserSuperUserPage enterDescription_61(WebDriver driver,String Description_61) {
		            BrowserActions.type(driver, inpDescription_61,Description_61, "Description_61");
			        return this;
           }
public UserSuperUserPage enterAddress3_28(WebDriver driver,String Address3_28) {
		            BrowserActions.type(driver, inpAddress3_28,Address3_28, "Address3_28");
			        return this;
           }
public UserSuperUserPage clickSelectGroup_11(WebDriver driver)  {
					BrowserActions.click(driver, btnSelectGroup_11,"SelectGroup_11");
				    return this;
			}
public UserSuperUserPage selectState_32(WebDriver driver,String State_32)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpState_32,State_32,"State_32");
				    return this;
			}
public UserSuperUserPage enterZIPCode_33(WebDriver driver,String ZIPCode_33) {
		            BrowserActions.type(driver, inpZIPCode_33,ZIPCode_33, "ZIPCode_33");
			        return this;
           }
public UserSuperUserPage enterWorkPhone(WebDriver driver,String WorkPhone) {
		            BrowserActions.type(driver, inpWorkPhone,WorkPhone, "WorkPhone");
			        return this;
           }
public UserSuperUserPage selectRegionalFormat(WebDriver driver,String RegionalFormat)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpRegionalFormat,RegionalFormat,"RegionalFormat");
				    return this;
			}
public UserSuperUserPage clickCancel(WebDriver driver)  {
					BrowserActions.click(driver, btnCancel,"Cancel");
				    return this;
			}
public UserSuperUserPage enterHomePhone_39(WebDriver driver,String HomePhone_39) {
		            BrowserActions.type(driver, inpHomePhone_39,HomePhone_39, "HomePhone_39");
			        return this;
           }
public UserSuperUserPage enterLoadFactor(WebDriver driver,String LoadFactor) {
		            BrowserActions.type(driver, inpLoadFactor,LoadFactor, "LoadFactor");
			        return this;
           }
public UserSuperUserPage clickSelectusergroup(WebDriver driver)  {
					BrowserActions.click(driver, btnSelectusergroup,"Selectusergroup");
				    return this;
			}
public UserSuperUserPage clickGroupMenuIcon_10(WebDriver driver)  {
					BrowserActions.click(driver, btnGroupMenuIcon_10,"GroupMenuIcon_10");
				    return this;
			}
public UserSuperUserPage selectHomePhoneRegionCode_36(WebDriver driver,String HomePhoneRegionCode_36)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpHomePhoneRegionCode_36,HomePhoneRegionCode_36,"HomePhoneRegionCode_36");
				    return this;
			}
public UserSuperUserPage enterFaxPhoneExtension(WebDriver driver,String FaxPhoneExtension) {
		            BrowserActions.type(driver, inpFaxPhoneExtension,FaxPhoneExtension, "FaxPhoneExtension");
			        return this;
           }
public UserSuperUserPage clickUseOrganizationAddress(WebDriver driver)  {
					BrowserActions.click(driver, rdbUseOrganizationAddress,"UseOrganizationAddress");
				    return this;
			}

/**
 * Verify first name 
 * @param driver , name
 * @return
 */
public UserSuperUserPage verifyFirstName(WebDriver driver, String name)  {
	String text = BrowserActions.getText(driver, lblFirstName,"First Name");
	Log.assertThat(text.equals(name), name+ "Present in the first name", name+" is not Present in the first name");
	return this;
}
}

}
