package com.aspire.guidewire.cc.pages.common;
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

public class AssignPage extends LoadableComponent<AssignPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
 	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
//	public TopNavBar topnavbar;
//	public AssignmentUser assignmentuserTable;

	@IFindBy(how = How.CSS, using = "#AssignClaimsPopup-AssignmentPopupScreen-AssignmentPopupDV-AssignmentPopupScreen_ButtonButton>div[role='button']", AI = false)
	private WebElement btnAssignmentPopupScreen_ButtonButton;

	@IFindBy(how = How.CSS, using = "input[name='AssignClaimsPopup-AssignmentPopupScreen-AssignmentSearchDV-GlobalPersonNameInputSet-Particle']", AI = false)
	private WebElement inpParticle;

	@IFindBy(how = How.CSS, using = "select[name='AssignClaimsPopup-AssignmentPopupScreen-AssignmentSearchDV-AttributeState']", AI = false)
	private WebElement drpAttributeState;

	@IFindBy(how = How.CSS, using = "input[name='AssignClaimsPopup-AssignmentPopupScreen-AssignmentSearchDV-QueueName']", AI = false)
	private WebElement inpQueueName;

	@IFindBy(how = How.CSS, using = "input[name='AssignClaimsPopup-AssignmentPopupScreen-AssignmentSearchDV-GlobalPersonNameInputSet-LastName']", AI = false)
	private WebElement inpLastname;

	@IFindBy(how = How.CSS, using = "input[name='AssignClaimsPopup-AssignmentPopupScreen-AssignmentSearchDV-CCAddressBookSearchLocationInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-City']", AI = false)
	private WebElement inpCity;

	@IFindBy(how = How.CSS, using = "#AssignClaimsPopup-AssignmentPopupScreen-AssignmentSearchDV-CCAddressBookSearchProximityAddressInputSet-globalAddressContainer-proximityAddress-GlobalAddressInputSet-City-AutoFillIcon", AI = false)
	private WebElement btnAutoFillIcon_11;

	@IFindBy(how = How.CSS, using = "input[name='AssignClaimsPopup-AssignmentPopupScreen-AssignmentSearchDV-CCAddressBookSearchProximityAddressInputSet-globalAddressContainer-proximityAddress-GlobalAddressInputSet-City']", AI = false)
	private WebElement inpCity_10;

	@IFindBy(how = How.CSS, using = "#AssignClaimsPopup-AssignmentPopupScreen-AssignmentSearchDV-CCAddressBookSearchLocationInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-PostalCode-AutoFillIcon", AI = false)
	private WebElement btnAutoFillIcon_4;

	@IFindBy(how = How.CSS, using = "select[name='AssignClaimsPopup-AssignmentPopupScreen-AssignmentSearchDV-CCAddressBookSearchLocationInputSet-CCAddressInputSet-globalAddressContainer-Claim_JurisdictionState']", AI = false)
	private WebElement drpJurisdiction;

	@IFindBy(how = How.CSS, using = "#AssignClaimsPopup-AssignmentPopupScreen-AssignmentSearchDV-Group-GroupMenuIcon>div[role='button']", AI = false)
	private WebElement btnGroupMenuIcon;

	@IFindBy(how = How.CSS, using = "#AssignClaimsPopup-AssignmentPopupScreen-AssignmentSearchDV-CCAddressBookSearchProximityAddressInputSet-globalAddressContainer-proximityAddress-GlobalAddressInputSet-PostalCode-AutoFillIcon", AI = false)
	private WebElement btnAutoFillIcon_15;

	@IFindBy(how = How.CSS, using = "#AssignClaimsPopup-__crumb__", AI = false)
	private WebElement btnReturntoSummary;

	@IFindBy(how = How.CSS, using = "input[name='AssignClaimsPopup-AssignmentPopupScreen-AssignmentSearchDV-CCAddressBookSearchLocationInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-County']", AI = false)
	private WebElement inpCounty;

	@IFindBy(how = How.CSS, using = "select[name='AssignClaimsPopup-AssignmentPopupScreen-AssignmentSearchDV-CCAddressBookSearchProximityAddressInputSet-globalAddressContainer-proximityAddress-GlobalAddressInputSet-Country']", AI = false)
	private WebElement drpCountry_7;

	@IFindBy(how = How.CSS, using = "input[name='AssignClaimsPopup-AssignmentPopupScreen-AssignmentSearchDV-CCAddressBookSearchProximityAddressInputSet-globalAddressContainer-proximityAddress-GlobalAddressInputSet-AddressLine2']", AI = false)
	private WebElement inpAddress2_8;

	@IFindBy(how = How.CSS, using = "#AssignClaimsPopup-AssignmentPopupScreen-AssignmentSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Search", AI = false)
	private WebElement btnSearch;

	@IFindBy(how = How.CSS, using = "input[name='AssignClaimsPopup-AssignmentPopupScreen-AssignmentSearchDV-CCAddressBookSearchLocationInputSet-CCAddressInputSet-globalAddressContainer-Claim_LocationCode']", AI = false)
	private WebElement inpLocationCode;

	@IFindBy(how = How.CSS, using = "input[name='AssignClaimsPopup-AssignmentPopupScreen-AssignmentSearchDV-AttributeValue']", AI = false)
	private WebElement inpAttributeValue;

	@IFindBy(how = How.CSS, using = "input[name='AssignClaimsPopup-AssignmentPopupScreen-AssignmentSearchDV-CCAddressBookSearchProximityAddressInputSet-globalAddressContainer-proximityAddress-GlobalAddressInputSet-AddressSummary']", AI = false)
	private WebElement inpLocation_6;

	@IFindBy(how = How.CSS, using = "input[name='AssignClaimsPopup-AssignmentPopupScreen-AssignmentSearchDV-CCAddressBookSearchProximityAddressInputSet-globalAddressContainer-proximityAddress-GlobalAddressInputSet-PostalCode']", AI = false)
	private WebElement inpZIPCode_14;

	@IFindBy(how = How.CSS, using = "select[name='AssignClaimsPopup-AssignmentPopupScreen-AssignmentSearchDV-AttributeName']", AI = false)
	private WebElement drpAttributeName;

	@IFindBy(how = How.CSS, using = "input[name='AssignClaimsPopup-AssignmentPopupScreen-AssignmentSearchDV-Username']", AI = false)
	private WebElement inpUsername;

	@IFindBy(how = How.CSS, using = "input[name='AssignClaimsPopup-AssignmentPopupScreen-AssignmentSearchDV-GroupCriteriaName']", AI = false)
	private WebElement inpGroupName;

	@IFindBy(how = How.CSS, using = "select[name='AssignClaimsPopup-AssignmentPopupScreen-AssignmentSearchDV-SearchFor']", AI = false)
	private WebElement drpSearchFor;

	@IFindBy(how = How.CSS, using = "select[name='AssignClaimsPopup-AssignmentPopupScreen-AssignmentSearchDV-CCAddressBookSearchProximityAddressInputSet-globalAddressContainer-proximityAddress-GlobalAddressInputSet-State']", AI = false)
	private WebElement drpState_13;

	@IFindBy(how = How.CSS, using = "input[name='AssignClaimsPopup-AssignmentPopupScreen-AssignmentSearchDV-CCAddressBookSearchLocationInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressSummary']", AI = false)
	private WebElement inpLocation;

	@IFindBy(how = How.CSS, using = "#AssignClaimsPopup-AssignmentPopupScreen-AssignmentSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Reset", AI = false)
	private WebElement btnReset;

	@IFindBy(how = How.CSS, using = "input[name='AssignClaimsPopup-AssignmentPopupScreen-AssignmentPopupDV-SelectFromSearch']", AI = false)
	private WebElement inpSearchbylocation;

	@IFindBy(how = How.CSS, using = "input[name='AssignClaimsPopup-AssignmentPopupScreen-AssignmentSearchDV-GlobalPersonNameInputSet-FirstName']", AI = false)
	private WebElement inpFirstname;

	@IFindBy(how = How.CSS, using = "select[name='AssignClaimsPopup-AssignmentPopupScreen-AssignmentSearchDV-Group']", AI = false)
	private WebElement drpGroupName;

	@IFindBy(how = How.CSS, using = "div[id$='AssignmentPopupScreen-ttlBar']", AI = false)
	private WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "input[name='AssignClaimsPopup-AssignmentPopupScreen-AssignmentSearchDV-CCAddressBookSearchLocationInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressLine3']", AI = false)
	private WebElement inpAddress3;

	@IFindBy(how = How.CSS, using = "input[name='AssignClaimsPopup-AssignmentPopupScreen-AssignmentSearchDV-CCAddressBookSearchLocationInputSet-CCAddressInputSet-globalAddressContainer-Address_Description']", AI = false)
	private WebElement inpLocationDescription;

	@IFindBy(how = How.CSS, using = "input[name='AssignClaimsPopup-AssignmentPopupScreen-AssignmentSearchDV-CCAddressBookSearchLocationInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressLine1']", AI = false)
	private WebElement inpAddress1;

	@IFindBy(how = How.CSS, using = "select[name='AssignClaimsPopup-AssignmentPopupScreen-AssignmentSearchDV-CCAddressBookSearchLocationInputSet-CCAddressInputSet-globalAddressContainer-Address_AddressType']", AI = false)
	private WebElement drpAddressType;

	@IFindBy(how = How.CSS, using = "input[name='AssignClaimsPopup-AssignmentPopupScreen-AssignmentSearchDV-CCAddressBookSearchLocationInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressLine2']", AI = false)
	private WebElement inpAddress2;

	@IFindBy(how = How.CSS, using = "select[name='AssignClaimsPopup-AssignmentPopupScreen-AssignmentSearchDV-CCAddressBookSearchLocationInputSet-CCAddressInputSet-globalAddressContainer-Address_Picker']", AI = false)
	private WebElement drpLocation;

	@IFindBy(how = How.CSS, using = "input[name='AssignClaimsPopup-AssignmentPopupScreen-AssignmentSearchDV-CCAddressBookSearchProximityAddressInputSet-globalAddressContainer-proximityAddress-GlobalAddressInputSet-AddressLine1']", AI = false)
	private WebElement inpAddress;

	@IFindBy(how = How.CSS, using = "#AssignClaimsPopup-AssignmentPopupScreen-AssignmentSearchDV-Group-GroupSearchMenuIcon>div[role='menuitem']", AI = false)
	private WebElement btnSearchforGroup;

	@IFindBy(how = How.CSS, using = "input[name='AssignClaimsPopup-AssignmentPopupScreen-AssignmentSearchDV-GlobalPersonNameInputSet-MiddleName']", AI = false)
	private WebElement inpMiddlename;

	@IFindBy(how = How.CSS, using = "input[name='AssignClaimsPopup-AssignmentPopupScreen-AssignmentSearchDV-CCAddressBookSearchLocationInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-PostalCode']", AI = false)
	private WebElement inpZIPCode;

	@IFindBy(how = How.CSS, using = "#AssignClaimsPopup-AssignmentPopupScreen-AssignmentSearchDV-CCAddressBookSearchLocationInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-City-AutoFillIcon", AI = false)
	private WebElement btnAutoFillIcon;

	@IFindBy(how = How.CSS, using = "input[name='AssignClaimsPopup-AssignmentPopupScreen-AssignmentSearchDV-CCAddressBookSearchLocationInputSet-CCAddressInputSet-globalAddressContainer-Address_ValidUntil']", AI = false)
	private WebElement inpValiduntil;

	@IFindBy(how = How.CSS, using = "input[name='AssignClaimsPopup-AssignmentPopupScreen-AssignmentSearchDV-CCAddressBookSearchProximityAddressInputSet-globalAddressContainer-proximityAddress-GlobalAddressInputSet-County']", AI = false)
	private WebElement inpCounty_12;

	@IFindBy(how = How.CSS, using = "select[name='AssignClaimsPopup-AssignmentPopupScreen-AssignmentPopupDV-SelectFromList']", AI = false)
	private WebElement drpSelectfromlist;

	@IFindBy(how = How.CSS, using = "#AssignClaimsPopup-AssignmentPopupScreen-AssignmentUserLV_tb-RetrieveRequested>div[role='button']", AI = false)
	private WebElement btnRetrieveRequestedDirections;

	@IFindBy(how = How.CSS, using = "select[name='AssignClaimsPopup-AssignmentPopupScreen-AssignmentSearchDV-GlobalPersonNameInputSet-Prefix']", AI = false)
	private WebElement drpPrefix;

	@IFindBy(how = How.CSS, using = "input[name='AssignClaimsPopup-AssignmentPopupScreen-AssignmentSearchDV-GroupName']", AI = false)
	private WebElement inpGroupName_2;

	@IFindBy(how = How.CSS, using = "select[name='AssignClaimsPopup-AssignmentPopupScreen-AssignmentSearchDV-CCAddressBookSearchProximityAddressInputSet-globalAddressContainer-ProximitySearchType']", AI = false)
	private WebElement drpSearchRadius;

	@IFindBy(how = How.CSS, using = "input[name='AssignClaimsPopup-AssignmentPopupScreen-AssignmentSearchDV-GroupNameKanji']", AI = false)
	private WebElement inpGroupName_3;

	@IFindBy(how = How.CSS, using = "input[name='AssignClaimsPopup-AssignmentPopupScreen-AssignmentSearchDV-GroupCriteriaNameKanji']", AI = false)
	private WebElement inpGroupName_1;

	@IFindBy(how = How.CSS, using = "input[name='AssignClaimsPopup-AssignmentPopupScreen-AssignmentSearchDV-GlobalPersonNameInputSet-NameSummary']", AI = false)
	private WebElement inpName;

	@IFindBy(how = How.CSS, using = "input[name='AssignClaimsPopup-AssignmentPopupScreen-AssignmentSearchDV-CCAddressBookSearchProximityAddressInputSet-globalAddressContainer-proximityAddress-GlobalAddressInputSet-AddressLine3']", AI = false)
	private WebElement inpAddress3_9;

	@IFindBy(how = How.CSS, using = "select[name='AssignClaimsPopup-AssignmentPopupScreen-AssignmentSearchDV-CCAddressBookSearchLocationInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-Country']", AI = false)
	private WebElement drpCountry;

	@IFindBy(how = How.CSS, using = "input[name='AssignClaimsPopup-AssignmentPopupScreen-AssignmentPopupDV-SelectFromProximitySearch']", AI = false)
	private WebElement inpSearchbydistancefromalocation;

	@IFindBy(how = How.CSS, using = "#AssignClaimsPopup-AssignmentPopupScreen-AssignmentSearchDV-CCAddressBookSearchLocationInputSet-CCAddressInputSet-globalAddressContainer-Address_ValidUntil_dateIcon", AI = false)
	private WebElement btnValiduntilDateIcon;

	@IFindBy(how = How.CSS, using = "select[name='AssignClaimsPopup-AssignmentPopupScreen-AssignmentSearchDV-GlobalPersonNameInputSet-Suffix']", AI = false)
	private WebElement drpSuffix;

	@IFindBy(how = How.CSS, using = "select[name='AssignClaimsPopup-AssignmentPopupScreen-AssignmentSearchDV-CCAddressBookSearchLocationInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-State']", AI = false)
	private WebElement drpState;

	@IFindBy(how = How.CSS, using = "#AssignClaimsPopup-AssignmentPopupScreen-AssignmentSearchDV-Group-GroupPickerMenuIcon>div[role='menuitem']", AI = false)
	private WebElement btnSelectGroup;

	@IFindBy(how = How.CSS, using = "select[name='AssignClaimsPopup-AssignmentPopupScreen-AssignmentSearchDV-UserRole']", AI = false)
	private WebElement drpRole;

	@IFindBy(how = How.CSS, using = "input[name='AssignClaimsPopup-AssignmentPopupScreen-AssignmentUserLV-Group3']", AI = false)
	private WebElement inpGroup3;

	@IFindBy(how = How.CSS, using = "#AssignClaimsPopup-AssignmentPopupScreen-AssignmentPopupScreen_CancelButton>div[role='button']", AI = false)
	private WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "select[name='AssignClaimsPopup-AssignmentPopupScreen-AssignmentSearchDV-CCAddressBookSearchProximityAddressInputSet-globalAddressContainer-Address_Name']", AI = false)
	private WebElement drpLocation_5;
	
	@IFindBy(how = How.CSS, using = "div[id$='FromList_Choice_radio']", AI = false)
	private WebElement rdbSelectFromList;
	
	@IFindBy(how = How.CSS, using = "div[id$='FromSearch_Choice_radio']", AI = false)
	private WebElement rdbSearchByLocation;
	
	@IFindBy(how = How.CSS, using = "div[id$='AssignmentPopupScreen_ButtonButton']", AI = false)
	private WebElement btnAssign;
	
	@IFindBy(how = How.CSS, using = "div[id$='FromProximitySearch_Choice_radio']", AI = false)
	public WebElement rdbSearchByDistanceFromLocation;
	
	@IFindBy(how = How.CSS, using = "div[id$='_Select']", AI = false)
	public WebElement btnSelect;
	
	@IFindBy(how = How.CSS, using = "div[id$='AssignmentGroupLV-0-_Select']", AI = false)
	public WebElement btnAssignForLocation	;
	
	

	public AssignPage(){
	}

	public AssignPage(WebDriver driver){
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(finder, this);
//		assignmentuserTable = new AssignmentUser();
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
}public AssignPage clickAssignmentPopupScreen_ButtonButton(WebDriver driver)  {
					BrowserActions.click(driver, btnAssignmentPopupScreen_ButtonButton,"AssignmentPopupScreen_ButtonButton");
				    return this;
			}
public AssignPage enterParticle(WebDriver driver,String Particle) {
		            BrowserActions.type(driver, inpParticle,Particle, "Particle");
			        return this;
           }
public AssignPage selectAttributeState(WebDriver driver,String AttributeState)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpAttributeState,AttributeState,"AttributeState");
				    return this;
			}
public AssignPage enterQueueName(WebDriver driver,String QueueName) {
		            BrowserActions.type(driver, inpQueueName,QueueName, "QueueName");
			        return this;
           }
public AssignPage enterLastname(WebDriver driver,String Lastname) {
		            BrowserActions.type(driver, inpLastname,Lastname, "Lastname");
			        return this;
           }
public AssignPage enterCity(WebDriver driver,String City) {
		            BrowserActions.type(driver, inpCity,City, "City");
			        return this;
           }
public AssignPage clickAutoFillIcon_11(WebDriver driver)  {
					BrowserActions.click(driver, btnAutoFillIcon_11,"AutoFillIcon_11");
				    return this;
			}
public AssignPage enterCity_10(WebDriver driver,String City_10) {
		            BrowserActions.type(driver, inpCity_10,City_10, "City_10");
			        return this;
           }
public AssignPage clickAutoFillIcon_4(WebDriver driver)  {
					BrowserActions.click(driver, btnAutoFillIcon_4,"AutoFillIcon_4");
				    return this;
			}
public AssignPage selectJurisdiction(WebDriver driver,String Jurisdiction)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpJurisdiction,Jurisdiction,"Jurisdiction");
				    return this;
			}
public AssignPage clickGroupMenuIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnGroupMenuIcon,"GroupMenuIcon");
				    return this;
			}
public AssignPage clickAutoFillIcon_15(WebDriver driver)  {
					BrowserActions.click(driver, btnAutoFillIcon_15,"AutoFillIcon_15");
				    return this;
			}
public AssignPage clickReturntoSummary(WebDriver driver)  {
					BrowserActions.click(driver, btnReturntoSummary,"ReturntoSummary");
				    return this;
			}
public AssignPage enterCounty(WebDriver driver,String County) {
		            BrowserActions.type(driver, inpCounty,County, "County");
			        return this;
           }
public AssignPage selectCountry_7(WebDriver driver,String Country_7)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpCountry_7,Country_7,"Country_7");
				    return this;
			}
public AssignPage enterAddress2_8(WebDriver driver,String Address2_8) {
		            BrowserActions.type(driver, inpAddress2_8,Address2_8, "Address2_8");
			        return this;
           }
public AssignPage clickSearch(WebDriver driver)  {
					BrowserActions.click(driver, btnSearch,"Search");
				    return this;
			}
public AssignPage enterLocationCode(WebDriver driver,String LocationCode) {
		            BrowserActions.type(driver, inpLocationCode,LocationCode, "LocationCode");
			        return this;
           }
public AssignPage enterAttributeValue(WebDriver driver,String AttributeValue) {
		            BrowserActions.type(driver, inpAttributeValue,AttributeValue, "AttributeValue");
			        return this;
           }
public AssignPage enterLocation_6(WebDriver driver,String Location_6) {
		            BrowserActions.type(driver, inpLocation_6,Location_6, "Location_6");
			        return this;
           }
public AssignPage enterZIPCode_14(WebDriver driver,String ZIPCode_14) {
		            BrowserActions.type(driver, inpZIPCode_14,ZIPCode_14, "ZIPCode_14");
			        return this;
           }
public AssignPage selectAttributeName(WebDriver driver,String AttributeName)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpAttributeName,AttributeName,"AttributeName");
				    return this;
			}
public AssignPage enterUsername(WebDriver driver,String Username) {
		            BrowserActions.type(driver, inpUsername,Username, "Username");
			        return this;
           }
public AssignPage enterGroupName(WebDriver driver,String GroupName) {
		            BrowserActions.type(driver, inpGroupName,GroupName, "GroupName");
			        return this;
           }
public AssignPage selectSearchFor(WebDriver driver,String SearchFor)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpSearchFor,SearchFor,"SearchFor");
				    return this;
			}
public AssignPage selectState_13(WebDriver driver,String State_13)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpState_13,State_13,"State_13");
				    return this;
			}
public AssignPage enterLocation(WebDriver driver,String Location) {
		            BrowserActions.type(driver, inpLocation,Location, "Location");
			        return this;
           }
public AssignPage clickReset(WebDriver driver)  {
					BrowserActions.click(driver, btnReset,"Reset");
				    return this;
			}
public AssignPage enterSearchbylocation(WebDriver driver,String Searchbylocation) {
		            BrowserActions.type(driver, inpSearchbylocation,Searchbylocation, "Searchbylocation");
			        return this;
           }
public AssignPage enterFirstname(WebDriver driver,String Firstname) {
		            BrowserActions.type(driver, inpFirstname,Firstname, "Firstname");
			        return this;
           }
public AssignPage selectGroupName(WebDriver driver,String GroupName)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpGroupName,GroupName,"GroupName");
				    return this;
			}
public AssignPage enterAddress3(WebDriver driver,String Address3) {
		            BrowserActions.type(driver, inpAddress3,Address3, "Address3");
			        return this;
           }
public AssignPage enterLocationDescription(WebDriver driver,String LocationDescription) {
		            BrowserActions.type(driver, inpLocationDescription,LocationDescription, "LocationDescription");
			        return this;
           }
public AssignPage enterAddress1(WebDriver driver,String Address1) {
		            BrowserActions.type(driver, inpAddress1,Address1, "Address1");
			        return this;
           }
public AssignPage selectAddressType(WebDriver driver,String AddressType)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpAddressType,AddressType,"AddressType");
				    return this;
			}
public AssignPage enterAddress2(WebDriver driver,String Address2) {
		            BrowserActions.type(driver, inpAddress2,Address2, "Address2");
			        return this;
           }
public AssignPage selectLocation(WebDriver driver,String Location)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpLocation,Location,"Location");
				    return this;
			}
public AssignPage enterAddress(WebDriver driver,String Address) {
		            BrowserActions.type(driver, inpAddress,Address, "Address");
			        return this;
           }
public AssignPage clickSearchforGroup(WebDriver driver)  {
					BrowserActions.click(driver, btnSearchforGroup,"SearchforGroup");
				    return this;
			}
public AssignPage enterMiddlename(WebDriver driver,String Middlename) {
		            BrowserActions.type(driver, inpMiddlename,Middlename, "Middlename");
			        return this;
           }
public AssignPage enterZIPCode(WebDriver driver,String ZIPCode) {
		            BrowserActions.type(driver, inpZIPCode,ZIPCode, "ZIPCode");
			        return this;
           }
public AssignPage clickAutoFillIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnAutoFillIcon,"AutoFillIcon");
				    return this;
			}
public AssignPage enterValiduntil(WebDriver driver,String Validuntil) {
		            BrowserActions.type(driver, inpValiduntil,Validuntil, "Validuntil");
			        return this;
           }
public AssignPage enterCounty_12(WebDriver driver,String County_12) {
		            BrowserActions.type(driver, inpCounty_12,County_12, "County_12");
			        return this;
           }
public AssignPage selectSelectfromlist(WebDriver driver,String Selectfromlist)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpSelectfromlist,Selectfromlist,"Selectfromlist");
				    return this;
			}
public AssignPage clickRetrieveRequestedDirections(WebDriver driver)  {
					BrowserActions.click(driver, btnRetrieveRequestedDirections,"RetrieveRequestedDirections");
				    return this;
			}
public AssignPage selectPrefix(WebDriver driver,String Prefix)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPrefix,Prefix,"Prefix");
				    return this;
			}
public AssignPage enterGroupName_2(WebDriver driver,String GroupName_2) {
		            BrowserActions.type(driver, inpGroupName_2,GroupName_2, "GroupName_2");
			        return this;
           }
public AssignPage selectSearchRadius(WebDriver driver,String SearchRadius)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpSearchRadius,SearchRadius,"SearchRadius");
				    return this;
			}
public AssignPage enterGroupName_3(WebDriver driver,String GroupName_3) {
		            BrowserActions.type(driver, inpGroupName_3,GroupName_3, "GroupName_3");
			        return this;
           }
public AssignPage enterGroupName_1(WebDriver driver,String GroupName_1) {
		            BrowserActions.type(driver, inpGroupName_1,GroupName_1, "GroupName_1");
			        return this;
           }
public AssignPage enterName(WebDriver driver,String Name) {
		            BrowserActions.type(driver, inpName,Name, "Name");
			        return this;
           }
public AssignPage enterAddress3_9(WebDriver driver,String Address3_9) {
		            BrowserActions.type(driver, inpAddress3_9,Address3_9, "Address3_9");
			        return this;
           }
public AssignPage selectCountry(WebDriver driver,String Country)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpCountry,Country,"Country");
				    return this;
			}
public AssignPage enterSearchbydistancefromalocation(WebDriver driver,String Searchbydistancefromalocation) {
		            BrowserActions.type(driver, inpSearchbydistancefromalocation,Searchbydistancefromalocation, "Searchbydistancefromalocation");
			        return this;
           }
public AssignPage clickValiduntilDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnValiduntilDateIcon,"ValiduntilDateIcon");
				    return this;
			}
public AssignPage selectSuffix(WebDriver driver,String Suffix)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpSuffix,Suffix,"Suffix");
				    return this;
			}
public AssignPage selectState(WebDriver driver,String State)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpState,State,"State");
				    return this;
			}
public AssignPage clickSelectGroup(WebDriver driver)  {
					BrowserActions.click(driver, btnSelectGroup,"SelectGroup");
				    return this;
			}
public AssignPage selectRole(WebDriver driver,String Role)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpRole,Role,"Role");
				    return this;
			}
public AssignPage enterGroup3(WebDriver driver,String Group3) {
		            BrowserActions.type(driver, inpGroup3,Group3, "Group3");
			        return this;
           }
public AssignPage clickCancel(WebDriver driver)  {
					BrowserActions.click(driver, btnCancel,"Cancel");
				    return this;
			}
public AssignPage selectLocation_5(WebDriver driver,String Location_5)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpLocation_5,Location_5,"Location_5");
				    return this;
			}
public AssignPage clickSelectFromList(WebDriver driver)  {
	BrowserActions.click(driver, rdbSelectFromList,"Select from list");
	return this;
}
public AssignPage clickSearchbyDistanceFromLocation(WebDriver driver)  {
	BrowserActions.click(driver, rdbSearchByDistanceFromLocation,2,"Search by distance from location");
	return this;
}
public AssignPage clickSearchbyLocation(WebDriver driver)  {
	BrowserActions.click(driver, rdbSearchByLocation,1,"Search by location");
	return this;
}
public AssignPage clickAssign(WebDriver driver)  {
	BrowserActions.click(driver, btnAssign,"Assign");
	Log.messageStep("Assign button is clicked and Assign the Exposures",DriverManager.getDriver());
	return this;
}
public AssignPage clickSelect(WebDriver driver)  {
	BrowserActions.click(driver, btnSelect,"Select");
	return this;
}
public AssignPage clickAssignForSearchByDistanceFromLocation(WebDriver driver)  {
	BrowserActions.click(driver, btnAssignForLocation,"Assign");
	return this;
}


}
