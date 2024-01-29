package com.aspire.guidewire.cc.pages.nonlob;

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

	@IFindBy(how = How.CSS, using = "#AdminUserSearchPage-UserSearchScreen-ttlBar", AI = false)
	public WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "input[name='AdminUserSearchPage-UserSearchScreen-UserSearchDV-CCAddressBookSearchLocationInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressLine3']", AI = false)
	public WebElement inpAddress3;

	@IFindBy(how = How.CSS, using = "input[name='AdminUserSearchPage-UserSearchScreen-UserSearchDV-CCAddressBookSearchLocationInputSet-CCAddressInputSet-globalAddressContainer-Address_Description']", AI = false)
	public WebElement inpLocationDescription;

	@IFindBy(how = How.CSS, using = "input[name='AdminUserSearchPage-UserSearchScreen-UserSearchDV-CCAddressBookSearchLocationInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressLine1']", AI = false)
	public WebElement inpAddress1;

	@IFindBy(how = How.CSS, using = "select[name='AdminUserSearchPage-UserSearchScreen-UserSearchDV-CCAddressBookSearchLocationInputSet-CCAddressInputSet-globalAddressContainer-Address_AddressType']", AI = false)
	public WebElement drpAddressType;

	@IFindBy(how = How.CSS, using = "input[name='AdminUserSearchPage-UserSearchScreen-UserSearchDV-CCAddressBookSearchLocationInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressLine2']", AI = false)
	public WebElement inpAddress2;

	@IFindBy(how = How.CSS, using = "input[name='AdminUserSearchPage-UserSearchScreen-UserSearchDV-GlobalPersonNameInputSet-Particle']", AI = false)
	public WebElement inpParticle;

	@IFindBy(how = How.CSS, using = "select[name='AdminUserSearchPage-UserSearchScreen-UserSearchDV-CCAddressBookSearchLocationInputSet-CCAddressInputSet-globalAddressContainer-Address_Picker']", AI = false)
	public WebElement drpLocation;

	@IFindBy(how = How.CSS, using = "input[name='AdminUserSearchPage-UserSearchScreen-UserSearchDV-CCAddressBookSearchProximityAddressInputSet-globalAddressContainer-proximityAddress-GlobalAddressInputSet-AddressLine1']", AI = false)
	public WebElement inpAddress;

	@IFindBy(how = How.CSS, using = "input[name='AdminUserSearchPage-UserSearchScreen-UserSearchDV-GlobalPersonNameInputSet-MiddleName']", AI = false)
	public WebElement inpMiddlename;

	@IFindBy(how = How.CSS, using = "input[name='AdminUserSearchPage-UserSearchScreen-UserSearchDV-CCAddressBookSearchLocationInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-PostalCode']", AI = false)
	public WebElement inpZIPCode;

	@IFindBy(how = How.CSS, using = "#AdminUserSearchPage-UserSearchScreen-UserSearchDV-CCAddressBookSearchLocationInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-City-AutoFillIcon", AI = false)
	public WebElement btnAutoFillIcon;

	@IFindBy(how = How.CSS, using = "#AdminUserSearchPage-UserSearchScreen-UserSearchDV-CCAddressBookSearchLocationInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-PostalCode-AutoFillIcon", AI = false)
	public WebElement btnAutoFillIcon_1;

	@IFindBy(how = How.CSS, using = "input[name='AdminUserSearchPage-UserSearchScreen-UserSearchDV-GlobalPersonNameInputSet-LastName']", AI = false)
	public WebElement inpLastname;

	@IFindBy(how = How.CSS, using = "#AdminUserSearchPage-UserSearchScreen-UserSearchDV-CCAddressBookSearchProximityAddressInputSet-globalAddressContainer-proximityAddress-GlobalAddressInputSet-PostalCode-AutoFillIcon", AI = false)
	public WebElement btnAutoFillIcon_12;

	@IFindBy(how = How.CSS, using = "input[name='AdminUserSearchPage-UserSearchScreen-UserSearchDV-CCAddressBookSearchLocationInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-City']", AI = false)
	public WebElement inpCity;

	@IFindBy(how = How.CSS, using = "input[name='AdminUserSearchPage-UserSearchScreen-UserSearchDV-CCAddressBookSearchLocationInputSet-CCAddressInputSet-globalAddressContainer-Address_ValidUntil']", AI = false)
	public WebElement inpValiduntil;

	@IFindBy(how = How.CSS, using = "select[name='AdminUserSearchPage-UserSearchScreen-UserSearchDV-CCAddressBookSearchLocationInputSet-CCAddressInputSet-globalAddressContainer-Claim_JurisdictionState']", AI = false)
	public WebElement drpJurisdiction;

	@IFindBy(how = How.CSS, using = "input[name='AdminUserSearchPage-UserSearchScreen-UserSearchDV-CCAddressBookSearchProximityAddressInputSet-globalAddressContainer-proximityAddress-GlobalAddressInputSet-AddressLine2']", AI = false)
	public WebElement inpAddress2_5;

	@IFindBy(how = How.CSS, using = "#AdminUserSearchPage-UserSearchScreen-AdminUserSearchResultsLV_tb-RetrieveRequested>div[role='button']", AI = false)
	public WebElement btnRetrieveRequestedDirections;

	@IFindBy(how = How.CSS, using = "select[name='AdminUserSearchPage-UserSearchScreen-UserSearchDV-GlobalPersonNameInputSet-Prefix']", AI = false)
	public WebElement drpPrefix;

	@IFindBy(how = How.CSS, using = "select[name='AdminUserSearchPage-UserSearchScreen-UserSearchDV-CCAddressBookSearchProximityAddressInputSet-globalAddressContainer-ProximitySearchType']", AI = false)
	public WebElement drpSearchRadius;

	@IFindBy(how = How.CSS, using = "input[name='AdminUserSearchPage-UserSearchScreen-UserSearchDV-CCAddressBookSearchProximityAddressInputSet-globalAddressContainer-proximityAddress-GlobalAddressInputSet-AddressLine3']", AI = false)
	public WebElement inpAddress3_6;

	@IFindBy(how = How.CSS, using = "input[name='AdminUserSearchPage-UserSearchScreen-UserSearchDV-CCAddressBookSearchLocationInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-County']", AI = false)
	public WebElement inpCounty;

	@IFindBy(how = How.CSS, using = "#AdminUserSearchPage-UserSearchScreen-UserSearchDV-CCAddressBookSearchProximityAddressInputSet-globalAddressContainer-proximityAddress-GlobalAddressInputSet-City-AutoFillIcon", AI = false)
	public WebElement btnAutoFillIcon_8;

	@IFindBy(how = How.CSS, using = "#AdminUserSearchPage-UserSearchScreen-UserSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Search", AI = false)
	public WebElement btnSearch;

	@IFindBy(how = How.CSS, using = "input[name='AdminUserSearchPage-UserSearchScreen-UserSearchDV-GlobalPersonNameInputSet-NameSummary']", AI = false)
	public WebElement inpName;

	@IFindBy(how = How.CSS, using = "input[name='AdminUserSearchPage-UserSearchScreen-UserSearchDV-CCAddressBookSearchLocationInputSet-CCAddressInputSet-globalAddressContainer-Claim_LocationCode']", AI = false)
	public WebElement inpLocationCode;

	@IFindBy(how = How.CSS, using = "select[name='AdminUserSearchPage-UserSearchScreen-UserSearchDV-CCAddressBookSearchProximityAddressInputSet-globalAddressContainer-proximityAddress-GlobalAddressInputSet-Country']", AI = false)
	public WebElement drpCountry_4;

	@IFindBy(how = How.CSS, using = "select[name='AdminUserSearchPage-UserSearchScreen-UserSearchDV-CCAddressBookSearchProximityAddressInputSet-globalAddressContainer-proximityAddress-GlobalAddressInputSet-State']", AI = false)
	public WebElement drpState_10;

	@IFindBy(how = How.CSS, using = "select[name='AdminUserSearchPage-UserSearchScreen-UserSearchDV-CCAddressBookSearchLocationInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-Country']", AI = false)
	public WebElement drpCountry;

	@IFindBy(how = How.CSS, using = "#AdminUserSearchPage-UserSearchScreen-UserSearchDV-CCAddressBookSearchLocationInputSet-CCAddressInputSet-globalAddressContainer-Address_ValidUntil_dateIcon", AI = false)
	public WebElement btnValiduntilDateIcon;

	@IFindBy(how = How.CSS, using = "input[name='AdminUserSearchPage-UserSearchScreen-UserSearchDV-CCAddressBookSearchProximityAddressInputSet-globalAddressContainer-proximityAddress-GlobalAddressInputSet-PostalCode']", AI = false)
	public WebElement inpZIPCode_11;

	@IFindBy(how = How.CSS, using = "select[name='AdminUserSearchPage-UserSearchScreen-UserSearchDV-GlobalPersonNameInputSet-Suffix']", AI = false)
	public WebElement drpSuffix;

	@IFindBy(how = How.CSS, using = "select[name='AdminUserSearchPage-UserSearchScreen-UserSearchDV-CCAddressBookSearchLocationInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-State']", AI = false)
	public WebElement drpState;

	@IFindBy(how = How.CSS, using = "input[name='AdminUserSearchPage-UserSearchScreen-UserSearchDV-CCAddressBookSearchProximityAddressInputSet-globalAddressContainer-proximityAddress-GlobalAddressInputSet-AddressSummary']", AI = false)
	public WebElement inpLocation_3;

	@IFindBy(how = How.CSS, using = "select[name='AdminUserSearchPage-UserSearchScreen-UserSearchDV-Role']", AI = false)
	public WebElement drpRole;

	@IFindBy(how = How.CSS, using = "input[name='AdminUserSearchPage-UserSearchScreen-UserSearchDV-Username']", AI = false)
	public WebElement inpUsername;

	@IFindBy(how = How.CSS, using = "input[name='AdminUserSearchPage-UserSearchScreen-UserSearchDV-CCAddressBookSearchProximityAddressInputSet-globalAddressContainer-proximityAddress-GlobalAddressInputSet-City']", AI = false)
	public WebElement inpCity_7;

	@IFindBy(how = How.CSS, using = "input[name='AdminUserSearchPage-UserSearchScreen-UserSearchDV-CCAddressBookSearchProximityAddressInputSet-globalAddressContainer-proximityAddress-GlobalAddressInputSet-County']", AI = false)
	public WebElement inpCounty_9;

	@IFindBy(how = How.CSS, using = "input[name='AdminUserSearchPage-UserSearchScreen-UserSearchDV-CCAddressBookSearchLocationInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressSummary']", AI = false)
	public WebElement inpLocation;

	@IFindBy(how = How.CSS, using = "select[name='AdminUserSearchPage-UserSearchScreen-UserSearchDV-CCAddressBookSearchProximityAddressInputSet-globalAddressContainer-Address_Name']", AI = false)
	public WebElement drpLocation_2;

	@IFindBy(how = How.CSS, using = "#AdminUserSearchPage-UserSearchScreen-UserSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Reset", AI = false)
	public WebElement btnReset;

	@IFindBy(how = How.CSS, using = "input[name='AdminUserSearchPage-UserSearchScreen-UserSearchDV-GlobalPersonNameInputSet-FirstName']", AI = false)
	public WebElement inpFirstname;
	
	@IFindBy(how = How.CSS, using = "input[name='AdminUserSearchPage-UserSearchScreen-UserSearchDV-GlobalPersonNameInputSet-FirstName']", AI = false)
	public WebElement lnkName;
	
	@IFindBy(how = How.CSS, using = "div[aria-controls$='BasicsCard']", AI = false)
	public WebElement btnBasic;

	@IFindBy(how = How.CSS, using = "div[aria-controls$='ProfileCard']", AI = false)
	public WebElement btnProfile;

	@IFindBy(how = How.CSS, using = "div[aria-controls$='RegionsCard']", AI = false)
	public WebElement btnRegion;

	@IFindBy(how = How.CSS, using = "div[aria-controls$='AuthorityLimitsCard']", AI = false)
	public WebElement btnAuthorityLimits;

	@IFindBy(how = How.CSS, using = "div[aria-controls$='AttributesCard']", AI = false)
	public WebElement btnAttribute;

	@IFindBy(how = How.CSS, using = "td[id$='DesktopClaimsLV-0-claimID_Cell']", AI = false)
	public WebElement lblDetailsClaimId;
	
	@IFindBy(how = How.CSS, using = "td[id$='DesktopClaimsLV-0-PolicyID_Cell']", AI = false)
	public WebElement lblDetailsPolicyId;

	@IFindBy(how = How.CSS, using = "td[id$='DesktopClaimsLV-0-Insured_Cell']", AI = false)
	public WebElement lblDetailsInsured;

	@IFindBy(how = How.CSS, using = "div[aria-controls$='DetailsCard']", AI = false)
	public WebElement btnDetails;

	@IFindBy(how = How.CSS, using = "td[id$='DesktopClaimsLV-0-LossDate_Cell']", AI = false)
	public WebElement lblLossDate;

	@IFindBy(how = How.CSS, using = "td[id$='UserRolesLV-0-Description_Cell']", AI = false)
	public WebElement lblRolesDescription;

	@IFindBy(how = How.CSS, using = "div[id$=UserRolesLV--label]", AI = false)
	public WebElement lblRoles;
	
	@IFindBy(how = How.CSS, using = "td[id$='UserGroupsLV-0-Group_Cell']", AI = false)
	public WebElement lblGroupName;

	@IFindBy(how = How.CSS, using = "td[id$='EditableAuthorityLimitsLV-0-LimitType_Cell']", AI = false)
	public WebElement lblAuthorityLimits;
	
	@IFindBy(how = How.CSS, using = "div[id$='Edit']", AI = false)
	public WebElement btnEdit;

	@IFindBy(how = How.CSS, using = "div[id$='DisplayName_button']", AI = false)
	public WebElement btnSearchNameButton;
	
	@IFindBy(how = How.CSS, using = "div[id$='UserRegionLV_tb-Add']", AI = false)
	public WebElement btnAddRegion;

	@IFindBy(how = How.CSS, using = "input[name$='RegionSearchDV-Name']", AI = false)
	public WebElement inpRegionName;

	@IFindBy(how = How.CSS, using = "div[id$='SearchLinksInputSet-Search']", AI = false)
	public WebElement btnRegionSearch;

	@IFindBy(how = How.CSS, using = "div[id$='RegionSearchResultsLV-0-_Checkbox']", AI = false)
	public WebElement chkRegionSearchResult;

	@IFindBy(how = How.CSS, using = "div[id$='UserRegionPopup_SelectButton']", AI = false)
	public WebElement btnRegionSelect;

	@IFindBy(how = How.CSS, using = "div[id$='Update']", AI = false)
	public WebElement btnUpdate;
	
	@IFindBy(how = How.CSS, using = "input[name$='UserRegionLV-_Checkbox']", AI = false)
	public WebElement chkUserDetailsRegionName;

	@IFindBy(how = How.CSS, using = "div[id$='Remove']", AI = false)
	public WebElement btnRemove;

	String lnkSearchResultName = "//div[text()='{name}']//ancestor::td//preceding-sibling::td[contains(@id,'DisplayName')]";

	public UsersPage(){
	}

	public UsersPage(WebDriver driver) throws Exception{
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
	}

	public UsersPage enterAddress3(WebDriver driver,String Address3) {
		BrowserActions.type(driver, inpAddress3,Address3, "Address3");
		return this;
	}
	public UsersPage enterLocationDescription(WebDriver driver,String LocationDescription) {
		BrowserActions.type(driver, inpLocationDescription,LocationDescription, "LocationDescription");
		return this;
	}
	public UsersPage enterAddress1(WebDriver driver,String Address1) {
		BrowserActions.type(driver, inpAddress1,Address1, "Address1");
		return this;
	}
	public UsersPage selectAddressType(WebDriver driver,String AddressType)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpAddressType,AddressType,"AddressType");
		return this;
	}
	public UsersPage enterAddress2(WebDriver driver,String Address2) {
		BrowserActions.type(driver, inpAddress2,Address2, "Address2");
		return this;
	}
	public UsersPage enterParticle(WebDriver driver,String Particle) {
		BrowserActions.type(driver, inpParticle,Particle, "Particle");
		return this;
	}
	public UsersPage selectLocation(WebDriver driver,String Location)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpLocation,Location,"Location");
		return this;
	}
	public UsersPage enterAddress(WebDriver driver,String Address) {
		BrowserActions.type(driver, inpAddress,Address, "Address");
		return this;
	}
	public UsersPage enterMiddlename(WebDriver driver,String Middlename) {
		BrowserActions.type(driver, inpMiddlename,Middlename, "Middlename");
		return this;
	}
	public UsersPage enterZIPCode(WebDriver driver,String ZIPCode) {
		BrowserActions.type(driver, inpZIPCode,ZIPCode, "ZIPCode");
		return this;
	}
	public UsersPage clickAutoFillIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnAutoFillIcon,"AutoFillIcon");
		return this;
	}
	public UsersPage clickAutoFillIcon_1(WebDriver driver)  {
		BrowserActions.click(driver, btnAutoFillIcon_1,"AutoFillIcon_1");
		return this;
	}
	public UsersPage enterLastname(WebDriver driver,String Lastname) {
		BrowserActions.type(driver, inpLastname,Lastname, "Lastname");
		return this;
	}
	public UsersPage clickAutoFillIcon_12(WebDriver driver)  {
		BrowserActions.click(driver, btnAutoFillIcon_12,"AutoFillIcon_12");
		return this;
	}
	public UsersPage enterCity(WebDriver driver,String City) {
		BrowserActions.type(driver, inpCity,City, "City");
		return this;
	}
	public UsersPage enterValiduntil(WebDriver driver,String Validuntil) {
		BrowserActions.type(driver, inpValiduntil,Validuntil, "Validuntil");
		return this;
	}
	public UsersPage selectJurisdiction(WebDriver driver,String Jurisdiction)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpJurisdiction,Jurisdiction,"Jurisdiction");
		return this;
	}
	public UsersPage enterAddress2_5(WebDriver driver,String Address2_5) {
		BrowserActions.type(driver, inpAddress2_5,Address2_5, "Address2_5");
		return this;
	}
	public UsersPage clickRetrieveRequestedDirections(WebDriver driver)  {
		BrowserActions.click(driver, btnRetrieveRequestedDirections,"RetrieveRequestedDirections");
		return this;
	}
	public UsersPage selectPrefix(WebDriver driver,String Prefix)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPrefix,Prefix,"Prefix");
		return this;
	}
	public UsersPage selectSearchRadius(WebDriver driver,String SearchRadius)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpSearchRadius,SearchRadius,"SearchRadius");
		return this;
	}
	public UsersPage enterAddress3_6(WebDriver driver,String Address3_6) {
		BrowserActions.type(driver, inpAddress3_6,Address3_6, "Address3_6");
		return this;
	}
	public UsersPage enterCounty(WebDriver driver,String County) {
		BrowserActions.type(driver, inpCounty,County, "County");
		return this;
	}
	public UsersPage clickAutoFillIcon_8(WebDriver driver)  {
		BrowserActions.click(driver, btnAutoFillIcon_8,"AutoFillIcon_8");
		return this;
	}
	public UsersPage clickSearch(WebDriver driver)  {
		BrowserActions.click(driver, btnSearch,"Search");
		Log.messageStep("Clicked on search", driver);
		return this;
	}
	public UsersPage enterName(WebDriver driver,String Name) {
		BrowserActions.type(driver, inpName,Name, "Name");
		return this;
	}
	public UsersPage enterLocationCode(WebDriver driver,String LocationCode) {
		BrowserActions.type(driver, inpLocationCode,LocationCode, "LocationCode");
		return this;
	}
	public UsersPage selectCountry_4(WebDriver driver,String Country_4)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCountry_4,Country_4,"Country_4");
		return this;
	}
	public UsersPage selectState_10(WebDriver driver,String State_10)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpState_10,State_10,"State_10");
		return this;
	}
	public UsersPage selectCountry(WebDriver driver,String Country)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCountry,Country,"Country");
		return this;
	}
	public UsersPage clickValiduntilDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnValiduntilDateIcon,"ValiduntilDateIcon");
		return this;
	}
	public UsersPage enterZIPCode_11(WebDriver driver,String ZIPCode_11) {
		BrowserActions.type(driver, inpZIPCode_11,ZIPCode_11, "ZIPCode_11");
		return this;
	}
	public UsersPage selectSuffix(WebDriver driver,String Suffix)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpSuffix,Suffix,"Suffix");
		return this;
	}
	public UsersPage selectState(WebDriver driver,String State)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpState,State,"State");
		return this;
	}
	public UsersPage enterLocation_3(WebDriver driver,String Location_3) {
		BrowserActions.type(driver, inpLocation_3,Location_3, "Location_3");
		return this;
	}
	public UsersPage selectRole(WebDriver driver,String Role)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpRole,Role,"Role");
		return this;
	}
	public UsersPage enterUsername(WebDriver driver,String Username) {
		BrowserActions.type(driver, inpUsername,Username, "Username");
		Log.messageStep("Username enetered on username field",driver);
		return this;
	}
	public UsersPage enterCity_7(WebDriver driver,String City_7) {
		BrowserActions.type(driver, inpCity_7,City_7, "City_7");
		return this;
	}
	public UsersPage enterCounty_9(WebDriver driver,String County_9) {
		BrowserActions.type(driver, inpCounty_9,County_9, "County_9");
		return this;
	}
	public UsersPage enterLocation(WebDriver driver,String Location) {
		BrowserActions.type(driver, inpLocation,Location, "Location");
		return this;
	}
	public UsersPage selectLocation_2(WebDriver driver,String Location_2)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpLocation_2,Location_2,"Location_2");
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

	public UsersPage clickSearchResultname(WebDriver driver,String name) {
		BrowserActions.waitForElementToDisplay(driver, btnSearchNameButton);
		String userName = lnkSearchResultName.replaceAll("\\{name\\}",""+name);
		By userNameLinkBy = By.xpath(userName);
		BrowserActions.waitForElementToDisplay(driver, userNameLinkBy, "name check box");
		WebElement userNameLink = userNameLinkBy.findElement(driver);
		BrowserActions.click(driver, userNameLink, "name");
		Log.messageStep("Clicked on "+name+" from search result", driver);
		return this;
	}

	public void verifyEditBtnIsDisplay(WebDriver driver) {
		BrowserActions.verifyElementDisplayed(driver, btnEdit, "Edit Button");
	}
	
	public void verifyBasicsDetailsIsDisplay(WebDriver driver) {
		BrowserActions.verifyElementDisplayed(driver, btnBasic, "Basic tab");
	}
	public void verifyRolesLabel(WebDriver driver) {
		BrowserActions.verifyElementDisplayed(driver, lblRoles, "Roles label");
	}
	public void verifyRolesDescription(WebDriver driver) {
		BrowserActions.verifyElementDisplayed(driver, lblRolesDescription, "List of Roles Description");
	}
	
	public void verifyGroupsName(WebDriver driver) {
		BrowserActions.verifyElementDisplayed(driver, lblGroupName, "List of Groups");
	}

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

	public void verifyAttributeTabIsDisplay(WebDriver driver) {
		BrowserActions.verifyElementDisplayed(driver, btnProfile, "Profile Tab");
	}

	public void clickEdit(WebDriver driver) {
		BrowserActions.click(driver, btnEdit, "Edit");
	}

	public void clickDetailsTab(WebDriver driver) {
		BrowserActions.click(driver, btnDetails, true,"Details Tab");
	}
	public void verifyDetailsTab(WebDriver driver) {
		BrowserActions.verifyElementDisplayed(driver, btnDetails,"Details Tab");
	}

	public void verifyDetailsTabClaimID(WebDriver driver) {
		BrowserActions.verifyElementDisplayed(driver, lblDetailsClaimId, "Details Tab claim id");
	}
	
	public void verifyDetailsPolicyId(WebDriver driver) {
		BrowserActions.verifyElementDisplayed(driver, lblDetailsPolicyId, "Details PolicyId Label");
	}

	public void verifyDetailsInsured(WebDriver driver) {
		BrowserActions.verifyElementDisplayed(driver, lblDetailsInsured, "Details Insured Label");
	}
	
	public void verifyAuthorityLimits(WebDriver driver) {
		BrowserActions.verifyElementDisplayed(driver, lblAuthorityLimits, "Authority Limits Label");
	}

	public void clickAuthorityLimitsTab(WebDriver driver) {
		BrowserActions.click(driver, btnAuthorityLimits, "Authority Limits Button");
	}

	public void clickRegionTab(WebDriver driver) {
		BrowserActions.click(driver, btnRegion, "Region Tab");
	}

	public void clickAddRegion(WebDriver driver) {
		BrowserActions.click(driver, btnAddRegion, "Region Tab");
	}
	
	public void clickRegionSearch(WebDriver driver) {
		BrowserActions.click(driver, btnRegionSearch, "Region Search");
	}


	public void clickRegionFromSearchResult(WebDriver driver) {
		BrowserActions.click(driver, chkRegionSearchResult, "Region Search Result");
	}

	public void clickRegionSelect(WebDriver driver) {
		BrowserActions.click(driver, btnRegionSelect, "Region Search Select");
	}

	public UsersPage enterRegionsName(WebDriver driver,String name) {
		BrowserActions.type(driver, inpRegionName,name, "Region Name");
		return this;
	}

	public void clickUpdate(WebDriver driver) {
		BrowserActions.click(driver, btnUpdate, "Update");
	}

	public void clickRemove(WebDriver driver) {
		BrowserActions.click(driver, btnRemove, "Remove");
	}

	public void clickUsersDetailsRegionList(WebDriver driver) {
		BrowserActions.click(driver, chkUserDetailsRegionName, "User Details region checkbox");
	}

}
