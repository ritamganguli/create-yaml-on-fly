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

import ASPIREAI.customfactories.AjaxElementLocatorFactory;
import ASPIREAI.customfactories.IFindBy;
import ASPIREAI.customfactories.PageFactory;

public class SearchUsersPage extends LoadableComponent<SearchUsersPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
 	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
//	public TopNavBar topnavbar;
//	public UserSearchResults usersearchresultsTable;

	@IFindBy(how = How.CSS, using = "input[name='UserSearchPopup-UserSearchPopupScreen-UserSearchResultsLV-0-DrivingTime']", AI = false)
	private WebElement inpDrivingTime;

	@IFindBy(how = How.CSS, using = "input[name='UserSearchPopup-UserSearchPopupScreen-UserSearchResultsLV-1-DisplayName']", AI = false)
	private WebElement inpName_15;

	@IFindBy(how = How.CSS, using = "input[name='UserSearchPopup-UserSearchPopupScreen-UserSearchResultsLV-0-DisplayName']", AI = false)
	private WebElement inpName_13;

	@IFindBy(how = How.CSS, using = "input[name='UserSearchPopup-UserSearchPopupScreen-UserSearchResultsLV-1-Username']", AI = false)
	private WebElement inpUsername_16;

	@IFindBy(how = How.CSS, using = "#UserSearchPopup-__crumb__", AI = false)
	private WebElement btnReturntoSearchClaims;

	@IFindBy(how = How.CSS, using = "input[name='UserSearchPopup-UserSearchPopupScreen-UserSearchDV-GlobalPersonNameInputSet-Particle']", AI = false)
	private WebElement inpParticle;

	@IFindBy(how = How.CSS, using = "input[name='UserSearchPopup-UserSearchPopupScreen-UserSearchResultsLV-1-DrivingDistance']", AI = false)
	private WebElement inpDrivingDistance_19;

	@IFindBy(how = How.CSS, using = "input[name='UserSearchPopup-UserSearchPopupScreen-UserSearchResultsLV-0-Username']", AI = false)
	private WebElement inpUsername_14;

	@IFindBy(how = How.CSS, using = "#UserSearchPopup-UserSearchPopupScreen-UserSearchDV-CCAddressBookSearchLocationInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-PostalCode-AutoFillIcon", AI = false)
	private WebElement btnAutoFillIcon_1;

	@IFindBy(how = How.CSS, using = "input[name='UserSearchPopup-UserSearchPopupScreen-UserSearchDV-GlobalPersonNameInputSet-LastName']", AI = false)
	private WebElement inpLastname;

	@IFindBy(how = How.CSS, using = "#UserSearchPopup-UserSearchPopupScreen-UserSearchDV-CCAddressBookSearchProximityAddressInputSet-globalAddressContainer-proximityAddress-GlobalAddressInputSet-PostalCode-AutoFillIcon", AI = false)
	private WebElement btnAutoFillIcon_12;

	@IFindBy(how = How.CSS, using = "input[name='UserSearchPopup-UserSearchPopupScreen-UserSearchDV-CCAddressBookSearchLocationInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-City']", AI = false)
	private WebElement inpCity;

	@IFindBy(how = How.CSS, using = "select[name='UserSearchPopup-UserSearchPopupScreen-UserSearchDV-CCAddressBookSearchLocationInputSet-CCAddressInputSet-globalAddressContainer-Claim_JurisdictionState']", AI = false)
	private WebElement drpJurisdiction;

	@IFindBy(how = How.CSS, using = "input[name='UserSearchPopup-UserSearchPopupScreen-UserSearchResultsLV-1-DrivingTime']", AI = false)
	private WebElement inpDrivingTime_20;

	@IFindBy(how = How.CSS, using = "input[name='UserSearchPopup-UserSearchPopupScreen-UserSearchDV-CCAddressBookSearchLocationInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-County']", AI = false)
	private WebElement inpCounty;

	@IFindBy(how = How.CSS, using = "#UserSearchPopup-UserSearchPopupScreen-UserSearchDV-CCAddressBookSearchProximityAddressInputSet-globalAddressContainer-proximityAddress-GlobalAddressInputSet-City-AutoFillIcon", AI = false)
	private WebElement btnAutoFillIcon_8;

	@IFindBy(how = How.CSS, using = "#UserSearchPopup-UserSearchPopupScreen-UserSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Search", AI = false)
	private WebElement btnSearch;

	@IFindBy(how = How.CSS, using = "input[name='UserSearchPopup-UserSearchPopupScreen-UserSearchResultsLV-0-GCDistance']", AI = false)
	private WebElement inpProximateDistance;

	@IFindBy(how = How.CSS, using = "input[name='UserSearchPopup-UserSearchPopupScreen-UserSearchDV-CCAddressBookSearchLocationInputSet-CCAddressInputSet-globalAddressContainer-Claim_LocationCode']", AI = false)
	private WebElement inpLocationCode;

	@IFindBy(how = How.CSS, using = "select[name='UserSearchPopup-UserSearchPopupScreen-UserSearchDV-CCAddressBookSearchProximityAddressInputSet-globalAddressContainer-proximityAddress-GlobalAddressInputSet-Country']", AI = false)
	private WebElement drpCountry_4;

	@IFindBy(how = How.CSS, using = "select[name='UserSearchPopup-UserSearchPopupScreen-UserSearchDV-CCAddressBookSearchProximityAddressInputSet-globalAddressContainer-proximityAddress-GlobalAddressInputSet-State']", AI = false)
	private WebElement drpState_10;

	@IFindBy(how = How.CSS, using = "input[name='UserSearchPopup-UserSearchPopupScreen-UserSearchDV-CCAddressBookSearchProximityAddressInputSet-globalAddressContainer-proximityAddress-GlobalAddressInputSet-PostalCode']", AI = false)
	private WebElement inpZIPCode_11;

	@IFindBy(how = How.CSS, using = "input[name='UserSearchPopup-UserSearchPopupScreen-UserSearchDV-CCAddressBookSearchProximityAddressInputSet-globalAddressContainer-proximityAddress-GlobalAddressInputSet-AddressSummary']", AI = false)
	private WebElement inpLocation_3;

	@IFindBy(how = How.CSS, using = "input[name='UserSearchPopup-UserSearchPopupScreen-UserSearchDV-Username']", AI = false)
	private WebElement inpUsername;

	@IFindBy(how = How.CSS, using = "input[name='UserSearchPopup-UserSearchPopupScreen-UserSearchResultsLV-0-DrivingDistance']", AI = false)
	private WebElement inpDrivingDistance;

	@IFindBy(how = How.CSS, using = "input[name='UserSearchPopup-UserSearchPopupScreen-UserSearchResultsLV-0-GroupName']", AI = false)
	private WebElement inpGroupName;

	@IFindBy(how = How.CSS, using = "input[name='UserSearchPopup-UserSearchPopupScreen-UserSearchDV-CCAddressBookSearchLocationInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressSummary']", AI = false)
	private WebElement inpLocation;

	@IFindBy(how = How.CSS, using = "#UserSearchPopup-UserSearchPopupScreen-UserSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Reset", AI = false)
	private WebElement btnReset;

	@IFindBy(how = How.CSS, using = "input[name='UserSearchPopup-UserSearchPopupScreen-UserSearchDV-GlobalPersonNameInputSet-FirstName']", AI = false)
	private WebElement inpFirstname;

	@IFindBy(how = How.CSS, using = "#UserSearchPopup-UserSearchPopupScreen-ttlBar", AI = false)
	private WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "input[name='UserSearchPopup-UserSearchPopupScreen-UserSearchDV-CCAddressBookSearchLocationInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressLine3']", AI = false)
	private WebElement inpAddress3;

	@IFindBy(how = How.CSS, using = "input[name='UserSearchPopup-UserSearchPopupScreen-UserSearchDV-CCAddressBookSearchLocationInputSet-CCAddressInputSet-globalAddressContainer-Address_Description']", AI = false)
	private WebElement inpLocationDescription;

	@IFindBy(how = How.CSS, using = "input[name='UserSearchPopup-UserSearchPopupScreen-UserSearchDV-CCAddressBookSearchLocationInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressLine1']", AI = false)
	private WebElement inpAddress1;

	@IFindBy(how = How.CSS, using = "select[name='UserSearchPopup-UserSearchPopupScreen-UserSearchDV-CCAddressBookSearchLocationInputSet-CCAddressInputSet-globalAddressContainer-Address_AddressType']", AI = false)
	private WebElement drpAddressType;

	@IFindBy(how = How.CSS, using = "input[name='UserSearchPopup-UserSearchPopupScreen-UserSearchDV-CCAddressBookSearchLocationInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressLine2']", AI = false)
	private WebElement inpAddress2;

	@IFindBy(how = How.CSS, using = "input[name='UserSearchPopup-UserSearchPopupScreen-UserSearchResultsLV-0-Directions']", AI = false)
	private WebElement inpDirections;

	@IFindBy(how = How.CSS, using = "select[name='UserSearchPopup-UserSearchPopupScreen-UserSearchDV-CCAddressBookSearchLocationInputSet-CCAddressInputSet-globalAddressContainer-Address_Picker']", AI = false)
	private WebElement drpLocation;

	@IFindBy(how = How.CSS, using = "input[name='UserSearchPopup-UserSearchPopupScreen-UserSearchDV-CCAddressBookSearchProximityAddressInputSet-globalAddressContainer-proximityAddress-GlobalAddressInputSet-AddressLine1']", AI = false)
	private WebElement inpAddress;

	@IFindBy(how = How.CSS, using = "input[name='UserSearchPopup-UserSearchPopupScreen-UserSearchDV-GlobalPersonNameInputSet-MiddleName']", AI = false)
	private WebElement inpMiddlename;

	@IFindBy(how = How.CSS, using = "input[name='UserSearchPopup-UserSearchPopupScreen-UserSearchDV-CCAddressBookSearchLocationInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-PostalCode']", AI = false)
	private WebElement inpZIPCode;

	@IFindBy(how = How.CSS, using = "#UserSearchPopup-UserSearchPopupScreen-UserSearchDV-CCAddressBookSearchLocationInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-City-AutoFillIcon", AI = false)
	private WebElement btnAutoFillIcon;

	@IFindBy(how = How.CSS, using = "input[name='UserSearchPopup-UserSearchPopupScreen-UserSearchDV-CCAddressBookSearchLocationInputSet-CCAddressInputSet-globalAddressContainer-Address_ValidUntil']", AI = false)
	private WebElement inpValiduntil;

	@IFindBy(how = How.CSS, using = "input[name='UserSearchPopup-UserSearchPopupScreen-UserSearchResultsLV-1-GCDistance']", AI = false)
	private WebElement inpProximateDistance_18;

	@IFindBy(how = How.CSS, using = "input[name='UserSearchPopup-UserSearchPopupScreen-UserSearchDV-CCAddressBookSearchProximityAddressInputSet-globalAddressContainer-proximityAddress-GlobalAddressInputSet-AddressLine2']", AI = false)
	private WebElement inpAddress2_5;

	@IFindBy(how = How.CSS, using = "#UserSearchPopup-UserSearchPopupScreen-UserSearchResultsLV_tb-RetrieveRequested>div[role='button']", AI = false)
	private WebElement btnRetrieveRequestedDirections;

	@IFindBy(how = How.CSS, using = "input[name='UserSearchPopup-UserSearchPopupScreen-UserSearchResultsLV-1-GroupName']", AI = false)
	private WebElement inpGroupName_17;

	@IFindBy(how = How.CSS, using = "select[name='UserSearchPopup-UserSearchPopupScreen-UserSearchDV-GlobalPersonNameInputSet-Prefix']", AI = false)
	private WebElement drpPrefix;

	@IFindBy(how = How.CSS, using = "select[name='UserSearchPopup-UserSearchPopupScreen-UserSearchDV-CCAddressBookSearchProximityAddressInputSet-globalAddressContainer-ProximitySearchType']", AI = false)
	private WebElement drpSearchRadius;

	@IFindBy(how = How.CSS, using = "input[name='UserSearchPopup-UserSearchPopupScreen-UserSearchDV-CCAddressBookSearchProximityAddressInputSet-globalAddressContainer-proximityAddress-GlobalAddressInputSet-AddressLine3']", AI = false)
	private WebElement inpAddress3_6;

	@IFindBy(how = How.CSS, using = "input[name='UserSearchPopup-UserSearchPopupScreen-UserSearchDV-GlobalPersonNameInputSet-NameSummary']", AI = false)
	private WebElement inpName;

	@IFindBy(how = How.CSS, using = "input[name='UserSearchPopup-UserSearchPopupScreen-UserSearchResultsLV-1-Directions']", AI = false)
	private WebElement inpDirections_21;

	@IFindBy(how = How.CSS, using = "select[name='UserSearchPopup-UserSearchPopupScreen-UserSearchDV-CCAddressBookSearchLocationInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-Country']", AI = false)
	private WebElement drpCountry;

	@IFindBy(how = How.CSS, using = "#UserSearchPopup-UserSearchPopupScreen-UserSearchDV-CCAddressBookSearchLocationInputSet-CCAddressInputSet-globalAddressContainer-Address_ValidUntil_dateIcon", AI = false)
	private WebElement btnValiduntilDateIcon;

	@IFindBy(how = How.CSS, using = "select[name='UserSearchPopup-UserSearchPopupScreen-UserSearchDV-GlobalPersonNameInputSet-Suffix']", AI = false)
	private WebElement drpSuffix;

	@IFindBy(how = How.CSS, using = "select[name='UserSearchPopup-UserSearchPopupScreen-UserSearchDV-CCAddressBookSearchLocationInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-State']", AI = false)
	private WebElement drpState;

	@IFindBy(how = How.CSS, using = "select[name='UserSearchPopup-UserSearchPopupScreen-UserSearchDV-Role']", AI = false)
	private WebElement drpRole;

	@IFindBy(how = How.CSS, using = "input[name='UserSearchPopup-UserSearchPopupScreen-UserSearchDV-CCAddressBookSearchProximityAddressInputSet-globalAddressContainer-proximityAddress-GlobalAddressInputSet-City']", AI = false)
	private WebElement inpCity_7;

	@IFindBy(how = How.CSS, using = "input[name='UserSearchPopup-UserSearchPopupScreen-UserSearchDV-CCAddressBookSearchProximityAddressInputSet-globalAddressContainer-proximityAddress-GlobalAddressInputSet-County']", AI = false)
	private WebElement inpCounty_9;

	@IFindBy(how = How.CSS, using = "select[name='UserSearchPopup-UserSearchPopupScreen-UserSearchDV-CCAddressBookSearchProximityAddressInputSet-globalAddressContainer-Address_Name']", AI = false)
	private WebElement drpLocation_2;
	
	@IFindBy(how = How.CSS, using = "div[id$='LV-0-_Select']", AI = false)
	private WebElement btnSelect;

	public SearchUsersPage(){
	}

	public SearchUsersPage(WebDriver driver){
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(finder, this);
//		usersearchresultsTable = new UserSearchResults();
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
}public SearchUsersPage enterDrivingTime(WebDriver driver,String DrivingTime) {
		            BrowserActions.type(driver, inpDrivingTime,DrivingTime, "DrivingTime");
			        return this;
           }
public SearchUsersPage enterName_15(WebDriver driver,String Name_15) {
		            BrowserActions.type(driver, inpName_15,Name_15, "Name_15");
			        return this;
           }
public SearchUsersPage enterName_13(WebDriver driver,String Name_13) {
		            BrowserActions.type(driver, inpName_13,Name_13, "Name_13");
			        return this;
           }
public SearchUsersPage enterUsername_16(WebDriver driver,String Username_16) {
		            BrowserActions.type(driver, inpUsername_16,Username_16, "Username_16");
			        return this;
           }
public AdvanceSearchClaimsPage clickReturntoSearchClaims(WebDriver driver)  {
					BrowserActions.click(driver, btnReturntoSearchClaims,"ReturntoSearchClaims");
				    return new AdvanceSearchClaimsPage(driver).get();
}
public SearchUsersPage enterParticle(WebDriver driver,String Particle) {
		            BrowserActions.type(driver, inpParticle,Particle, "Particle");
			        return this;
           }
public SearchUsersPage enterDrivingDistance_19(WebDriver driver,String DrivingDistance_19) {
		            BrowserActions.type(driver, inpDrivingDistance_19,DrivingDistance_19, "DrivingDistance_19");
			        return this;
           }
public SearchUsersPage enterUsername_14(WebDriver driver,String Username_14) {
		            BrowserActions.type(driver, inpUsername_14,Username_14, "Username_14");
			        return this;
           }
public SearchUsersPage clickAutoFillIcon_1(WebDriver driver)  {
					BrowserActions.click(driver, btnAutoFillIcon_1,"AutoFillIcon_1");
				    return this;
			}
public SearchUsersPage enterLastname(WebDriver driver,String Lastname) {
		            BrowserActions.type(driver, inpLastname,Lastname, "Lastname");
			        return this;
           }
public SearchUsersPage clickAutoFillIcon_12(WebDriver driver)  {
					BrowserActions.click(driver, btnAutoFillIcon_12,"AutoFillIcon_12");
				    return this;
			}
public SearchUsersPage enterCity(WebDriver driver,String City) {
		            BrowserActions.type(driver, inpCity,City, "City");
			        return this;
           }
public SearchUsersPage selectJurisdiction(WebDriver driver,String Jurisdiction)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpJurisdiction,Jurisdiction,"Jurisdiction");
				    return this;
			}
public SearchUsersPage enterDrivingTime_20(WebDriver driver,String DrivingTime_20) {
		            BrowserActions.type(driver, inpDrivingTime_20,DrivingTime_20, "DrivingTime_20");
			        return this;
           }
public SearchUsersPage enterCounty(WebDriver driver,String County) {
		            BrowserActions.type(driver, inpCounty,County, "County");
			        return this;
           }
public SearchUsersPage clickAutoFillIcon_8(WebDriver driver)  {
					BrowserActions.click(driver, btnAutoFillIcon_8,"AutoFillIcon_8");
				    return this;
			}
public SearchUsersPage clickSearch(WebDriver driver)  {
					BrowserActions.click(driver, btnSearch,"Search");
				    return this;
			}
public SearchUsersPage enterProximateDistance(WebDriver driver,String ProximateDistance) {
		            BrowserActions.type(driver, inpProximateDistance,ProximateDistance, "ProximateDistance");
			        return this;
           }
public SearchUsersPage enterLocationCode(WebDriver driver,String LocationCode) {
		            BrowserActions.type(driver, inpLocationCode,LocationCode, "LocationCode");
			        return this;
           }
public SearchUsersPage selectCountry_4(WebDriver driver,String Country_4)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpCountry_4,Country_4,"Country_4");
				    return this;
			}
public SearchUsersPage selectState_10(WebDriver driver,String State_10)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpState_10,State_10,"State_10");
				    return this;
			}
public SearchUsersPage enterZIPCode_11(WebDriver driver,String ZIPCode_11) {
		            BrowserActions.type(driver, inpZIPCode_11,ZIPCode_11, "ZIPCode_11");
			        return this;
           }
public SearchUsersPage enterLocation_3(WebDriver driver,String Location_3) {
		            BrowserActions.type(driver, inpLocation_3,Location_3, "Location_3");
			        return this;
           }
public SearchUsersPage enterUsername(WebDriver driver,String Username) {
		            BrowserActions.type(driver, inpUsername,Username, "Username");
			        return this;
           }
public SearchUsersPage enterDrivingDistance(WebDriver driver,String DrivingDistance) {
		            BrowserActions.type(driver, inpDrivingDistance,DrivingDistance, "DrivingDistance");
			        return this;
           }
public SearchUsersPage enterGroupName(WebDriver driver,String GroupName) {
		            BrowserActions.type(driver, inpGroupName,GroupName, "GroupName");
			        return this;
           }
public SearchUsersPage enterLocation(WebDriver driver,String Location) {
		            BrowserActions.type(driver, inpLocation,Location, "Location");
			        return this;
           }
public SearchUsersPage clickReset(WebDriver driver)  {
					BrowserActions.click(driver, btnReset,"Reset");
				    return this;
			}
public SearchUsersPage enterFirstname(WebDriver driver,String Firstname) {
		            BrowserActions.type(driver, inpFirstname,Firstname, "Firstname");
			        return this;
           }
public SearchUsersPage enterAddress3(WebDriver driver,String Address3) {
		            BrowserActions.type(driver, inpAddress3,Address3, "Address3");
			        return this;
           }
public SearchUsersPage enterLocationDescription(WebDriver driver,String LocationDescription) {
		            BrowserActions.type(driver, inpLocationDescription,LocationDescription, "LocationDescription");
			        return this;
           }
public SearchUsersPage enterAddress1(WebDriver driver,String Address1) {
		            BrowserActions.type(driver, inpAddress1,Address1, "Address1");
			        return this;
           }
public SearchUsersPage selectAddressType(WebDriver driver,String AddressType)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpAddressType,AddressType,"AddressType");
				    return this;
			}
public SearchUsersPage enterAddress2(WebDriver driver,String Address2) {
		            BrowserActions.type(driver, inpAddress2,Address2, "Address2");
			        return this;
           }
public SearchUsersPage enterDirections(WebDriver driver,String Directions) {
		            BrowserActions.type(driver, inpDirections,Directions, "Directions");
			        return this;
           }
public SearchUsersPage selectLocation(WebDriver driver,String Location)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpLocation,Location,"Location");
				    return this;
			}
public SearchUsersPage enterAddress(WebDriver driver,String Address) {
		            BrowserActions.type(driver, inpAddress,Address, "Address");
			        return this;
           }
public SearchUsersPage enterMiddlename(WebDriver driver,String Middlename) {
		            BrowserActions.type(driver, inpMiddlename,Middlename, "Middlename");
			        return this;
           }
public SearchUsersPage enterZIPCode(WebDriver driver,String ZIPCode) {
		            BrowserActions.type(driver, inpZIPCode,ZIPCode, "ZIPCode");
			        return this;
           }
public SearchUsersPage clickAutoFillIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnAutoFillIcon,"AutoFillIcon");
				    return this;
			}
public SearchUsersPage enterValiduntil(WebDriver driver,String Validuntil) {
		            BrowserActions.type(driver, inpValiduntil,Validuntil, "Validuntil");
			        return this;
           }
public SearchUsersPage enterProximateDistance_18(WebDriver driver,String ProximateDistance_18) {
		            BrowserActions.type(driver, inpProximateDistance_18,ProximateDistance_18, "ProximateDistance_18");
			        return this;
           }
public SearchUsersPage enterAddress2_5(WebDriver driver,String Address2_5) {
		            BrowserActions.type(driver, inpAddress2_5,Address2_5, "Address2_5");
			        return this;
           }
public SearchUsersPage clickRetrieveRequestedDirections(WebDriver driver)  {
					BrowserActions.click(driver, btnRetrieveRequestedDirections,"RetrieveRequestedDirections");
				    return this;
			}
public SearchUsersPage enterGroupName_17(WebDriver driver,String GroupName_17) {
		            BrowserActions.type(driver, inpGroupName_17,GroupName_17, "GroupName_17");
			        return this;
           }
public SearchUsersPage selectPrefix(WebDriver driver,String Prefix)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPrefix,Prefix,"Prefix");
				    return this;
			}
public SearchUsersPage selectSearchRadius(WebDriver driver,String SearchRadius)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpSearchRadius,SearchRadius,"SearchRadius");
				    return this;
			}
public SearchUsersPage enterAddress3_6(WebDriver driver,String Address3_6) {
		            BrowserActions.type(driver, inpAddress3_6,Address3_6, "Address3_6");
			        return this;
           }
public SearchUsersPage enterName(WebDriver driver,String Name) {
		            BrowserActions.type(driver, inpName,Name, "Name");
			        return this;
           }
public SearchUsersPage enterDirections_21(WebDriver driver,String Directions_21) {
		            BrowserActions.type(driver, inpDirections_21,Directions_21, "Directions_21");
			        return this;
           }
public SearchUsersPage selectCountry(WebDriver driver,String Country)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpCountry,Country,"Country");
				    return this;
			}
public SearchUsersPage clickValiduntilDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnValiduntilDateIcon,"ValiduntilDateIcon");
				    return this;
			}
public SearchUsersPage selectSuffix(WebDriver driver,String Suffix)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpSuffix,Suffix,"Suffix");
				    return this;
			}
public SearchUsersPage selectState(WebDriver driver,String State)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpState,State,"State");
				    return this;
			}
public SearchUsersPage selectRole(WebDriver driver,String Role)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpRole,Role,"Role");
				    return this;
			}
public SearchUsersPage enterCity_7(WebDriver driver,String City_7) {
		            BrowserActions.type(driver, inpCity_7,City_7, "City_7");
			        return this;
           }
public SearchUsersPage enterCounty_9(WebDriver driver,String County_9) {
		            BrowserActions.type(driver, inpCounty_9,County_9, "County_9");
			        return this;
           }
public SearchUsersPage selectLocation_2(WebDriver driver,String Location_2)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpLocation_2,Location_2,"Location_2");
				    return this;
			}
public SearchUsersPage clickSelect(WebDriver driver)  {
	BrowserActions.click(driver, btnSelect,"Select");
    return this;
}
}
