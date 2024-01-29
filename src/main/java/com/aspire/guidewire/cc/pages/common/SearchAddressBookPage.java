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

//import com.aspire.guidewire.tables.*;
import com.aspire.guidewire.utils.BrowserActions;
import com.aspire.guidewire.utils.ElementLayer;
import com.aspire.guidewire.utils.Log;
import com.aspire.guidewire.utils.WaitUtils;

import ASPIREAI.customfactories.AjaxElementLocatorFactory;
import ASPIREAI.customfactories.IFindBy;
import ASPIREAI.customfactories.PageFactory;

public class SearchAddressBookPage extends LoadableComponent<SearchAddressBookPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
	//	public TopNavBar topnavbar;
	@IFindBy(how = How.CSS, using = "select[name='AddressBookPickerPopup-AddressBookSearchScreen-AddressBookSearchDV-SearchType']", AI = false)
	private WebElement drpSearchType;

	@IFindBy(how = How.CSS, using = "#AddressBookPickerPopup-AddressBookSearchScreen-AddressBookSearchDV-CCAddressBookSearchProximityAddressInputSet-globalAddressContainer-proximityAddress-GlobalAddressInputSet-PostalCode-AutoFillIcon", AI = false)
	private WebElement btnAutoFillIcon_13;

	@IFindBy(how = How.CSS, using = "input[name='AddressBookPickerPopup-AddressBookSearchScreen-AddressBookSearchDV-CCAddressBookSearchLocationInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-City']", AI = false)
	private WebElement inpCity;

	@IFindBy(how = How.CSS, using = "#AddressBookPickerPopup-AddressBookSearchScreen-AddressBookSearchDV-CCAddressBookSearchLocationInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-PostalCode-AutoFillIcon", AI = false)
	private WebElement btnAutoFillIcon_2;

	@IFindBy(how = How.CSS, using = "select[name='AddressBookPickerPopup-AddressBookSearchScreen-AddressBookSearchDV-CCAddressBookSearchLocationInputSet-CCAddressInputSet-globalAddressContainer-Claim_JurisdictionState']", AI = false)
	private WebElement drpJurisdiction;

	@IFindBy(how = How.CSS, using = "#AddressBookPickerPopup-AddressBookSearchScreen-AddressBookSearchDV-CCAddressBookSearchProximityAddressInputSet-globalAddressContainer-proximityAddress-GlobalAddressInputSet-City-AutoFillIcon", AI = false)
	private WebElement btnAutoFillIcon_9;

	@IFindBy(how = How.CSS, using = "input[name='AddressBookPickerPopup-AddressBookSearchScreen-AddressBookSearchDV-CCAddressBookSearchLocationInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-County']", AI = false)
	private WebElement inpCounty;

	@IFindBy(how = How.CSS, using = "input[name='AddressBookPickerPopup-AddressBookSearchScreen-AddressBookSearchDV-CCAddressBookSearchProximityAddressInputSet-globalAddressContainer-proximityAddress-GlobalAddressInputSet-AddressLine2']", AI = false)
	private WebElement inpAddress2_6;

	@IFindBy(how = How.CSS, using = "div[id$='SearchLinksInputSet-Search']", AI = false)
	private WebElement btnSearch;

	@IFindBy(how = How.CSS, using = "input[name='AddressBookPickerPopup-AddressBookSearchScreen-AddressBookSearchDV-CCAddressBookSearchLocationInputSet-CCAddressInputSet-globalAddressContainer-Claim_LocationCode']", AI = false)
	private WebElement inpLocationCode;

	@IFindBy(how = How.CSS, using = "select[name='AddressBookPickerPopup-AddressBookSearchScreen-AddressBookSearchDV-CCAddressBookSearchProximityAddressInputSet-globalAddressContainer-proximityAddress-GlobalAddressInputSet-Country']", AI = false)
	private WebElement drpCountry_5;

	@IFindBy(how = How.CSS, using = "input[name='AddressBookPickerPopup-AddressBookSearchScreen-AddressBookSearchDV-IncludePendingContacts']", AI = false)
	private WebElement chkIncludePendingContacts;

	@IFindBy(how = How.CSS, using = "input[name='AddressBookPickerPopup-AddressBookSearchScreen-AddressBookSearchDV-CCAddressBookSearchProximityAddressInputSet-globalAddressContainer-proximityAddress-GlobalAddressInputSet-AddressSummary']", AI = false)
	private WebElement inpLocation_4;

	@IFindBy(how = How.CSS, using = "input[name='AddressBookPickerPopup-AddressBookSearchScreen-AddressBookSearchDV-CCAddressBookSearchProximityAddressInputSet-globalAddressContainer-proximityAddress-GlobalAddressInputSet-PostalCode']", AI = false)
	private WebElement inpZIPCode_12;

	@IFindBy(how = How.CSS, using = "select[name='AddressBookPickerPopup-AddressBookSearchScreen-AddressBookSearchDV-MedicalSpecialty']", AI = false)
	private WebElement drpMedicalSpecialty_1;

	@IFindBy(how = How.CSS, using = "select[name='AddressBookPickerPopup-AddressBookSearchScreen-AddressBookSearchDV-ContactSubtype']", AI = false)
	private WebElement drpType;

	@IFindBy(how = How.CSS, using = "input[name='AddressBookPickerPopup-AddressBookSearchScreen-AddressBookSearchDV-CCAddressBookSearchLocationInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressSummary']", AI = false)
	private WebElement inpLocation;

	@IFindBy(how = How.CSS, using = "select[name='AddressBookPickerPopup-AddressBookSearchScreen-AddressBookSearchDV-CCAddressBookSearchProximityAddressInputSet-globalAddressContainer-proximityAddress-GlobalAddressInputSet-State']", AI = false)
	private WebElement drpState_11;

	@IFindBy(how = How.CSS, using = "#AddressBookPickerPopup-AddressBookSearchScreen-LaunchAB>div[role='button']", AI = false)
	private WebElement btnOpenContactManager;

	@IFindBy(how = How.CSS, using = "select[name='AddressBookPickerPopup-AddressBookSearchScreen-AddressBookSearchDV-LawFirmSpecialty']", AI = false)
	private WebElement drpLawFirmSpecialty;

	@IFindBy(how = How.CSS, using = "#AddressBookPickerPopup-AddressBookSearchScreen-AddressBookSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Reset", AI = false)
	private WebElement btnReset;

	@IFindBy(how = How.CSS, using = "input[name='AddressBookPickerPopup-AddressBookSearchScreen-AddressBookContactSearchPopupDV-SelectFromSearch']", AI = false)
	private WebElement inpSearchbylocation;

	@IFindBy(how = How.CSS, using = "#AddressBookPickerPopup-AddressBookSearchScreen-AddressBookSearchLV_tb-ClaimSearchScreen_PrintButton>div[role='button']", AI = false)
	private WebElement btnPrintExport;

	@IFindBy(how = How.CSS, using = "#AddressBookPickerPopup-__crumb__", AI = false)
	private WebElement btnReturntoContacts;

	@IFindBy(how = How.CSS, using = "#AddressBookPickerPopup-AddressBookSearchScreen-ttlBar", AI = false)
	private WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "select[name='AddressBookPickerPopup-AddressBookSearchScreen-AddressBookSearchDV-DoctorSpecialty']", AI = false)
	private WebElement drpMedicalSpecialty;

	@IFindBy(how = How.CSS, using = "input[name='AddressBookPickerPopup-AddressBookSearchScreen-AddressBookSearchDV-CCAddressBookSearchLocationInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressLine3']", AI = false)
	private WebElement inpAddress3;

	@IFindBy(how = How.CSS, using = "input[name='AddressBookPickerPopup-AddressBookSearchScreen-AddressBookSearchDV-CCAddressBookSearchLocationInputSet-CCAddressInputSet-globalAddressContainer-Address_Description']", AI = false)
	private WebElement inpLocationDescription;

	@IFindBy(how = How.CSS, using = "input[name='AddressBookPickerPopup-AddressBookSearchScreen-AddressBookSearchDV-IncludeSpecialistService']", AI = false)
	private WebElement chkIncludeSpecialistService;

	@IFindBy(how = How.CSS, using = "input[name='AddressBookPickerPopup-AddressBookSearchScreen-AddressBookSearchDV-CCAddressBookSearchLocationInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressLine1']", AI = false)
	private WebElement inpAddress1;

	@IFindBy(how = How.CSS, using = "select[name='AddressBookPickerPopup-AddressBookSearchScreen-AddressBookSearchDV-CCAddressBookSearchLocationInputSet-CCAddressInputSet-globalAddressContainer-Address_AddressType']", AI = false)
	private WebElement drpAddressType;

	@IFindBy(how = How.CSS, using = "input[name='AddressBookPickerPopup-AddressBookSearchScreen-AddressBookSearchDV-CCAddressBookSearchLocationInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressLine2']", AI = false)
	private WebElement inpAddress2;

	@IFindBy(how = How.CSS, using = "select[name='AddressBookPickerPopup-AddressBookSearchScreen-AddressBookSearchDV-CCAddressBookSearchLocationInputSet-CCAddressInputSet-globalAddressContainer-Address_Picker']", AI = false)
	private WebElement drpLocation;

	@IFindBy(how = How.CSS, using = "input[name='AddressBookPickerPopup-AddressBookSearchScreen-AddressBookSearchDV-CCAddressBookSearchProximityAddressInputSet-globalAddressContainer-proximityAddress-GlobalAddressInputSet-AddressLine1']", AI = false)
	private WebElement inpAddress;

	@IFindBy(how = How.CSS, using = "input[name='AddressBookPickerPopup-AddressBookSearchScreen-AddressBookSearchDV-CCAddressBookSearchLocationInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-PostalCode']", AI = false)
	private WebElement inpZIPCode;

	@IFindBy(how = How.CSS, using = "#AddressBookPickerPopup-AddressBookSearchScreen-AddressBookSearchDV-SpecialistServicesInputSet-SpecialistServicesLV_tb-RemoveSpecialService>div[role='button']", AI = false)
	private WebElement btnRemove;

	@IFindBy(how = How.CSS, using = "#AddressBookPickerPopup-AddressBookSearchScreen-AddressBookSearchDV-CCAddressBookSearchLocationInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-City-AutoFillIcon", AI = false)
	private WebElement btnAutoFillIcon;

	@IFindBy(how = How.CSS, using = "input[name='AddressBookPickerPopup-AddressBookSearchScreen-AddressBookSearchDV-CCAddressBookSearchLocationInputSet-CCAddressInputSet-globalAddressContainer-Address_ValidUntil']", AI = false)
	private WebElement inpValiduntil;

	@IFindBy(how = How.CSS, using = "input[name='AddressBookPickerPopup-AddressBookSearchScreen-AddressBookSearchDV-CCAddressBookSearchProximityAddressInputSet-globalAddressContainer-proximityAddress-GlobalAddressInputSet-County']", AI = false)
	private WebElement inpCounty_10;

	@IFindBy(how = How.CSS, using = "#AddressBookPickerPopup-AddressBookSearchScreen-AddressBookSearchLV_tb-RetrieveRequested>div[role='button']", AI = false)
	private WebElement btnRetrieveRequestedDirections;

	@IFindBy(how = How.CSS, using = "select[name='AddressBookPickerPopup-AddressBookSearchScreen-AddressBookSearchDV-AdjudicativeDomain']", AI = false)
	private WebElement drpAdjudicativeDomain;

	@IFindBy(how = How.CSS, using = "select[name$='AddressContainer-ProximitySearchType']", AI = false)
	private WebElement drpSearchRadius;

	@IFindBy(how = How.CSS, using = "input[name='AddressBookPickerPopup-AddressBookSearchScreen-AddressBookSearchDV-CCAddressBookSearchProximityAddressInputSet-globalAddressContainer-proximityAddress-GlobalAddressInputSet-AddressLine3']", AI = false)
	private WebElement inpAddress3_7;

	@IFindBy(how = How.CSS, using = "select[name='AddressBookPickerPopup-AddressBookSearchScreen-AddressBookSearchDV-MinimumScore']", AI = false)
	private WebElement drpMinimumScore;

	@IFindBy(how = How.CSS, using = "select[name='AddressBookPickerPopup-AddressBookSearchScreen-AddressBookSearchDV-AttorneySpecialty']", AI = false)
	private WebElement drpLegalSpecialty;

	@IFindBy(how = How.CSS, using = "select[name$='GlobalAddressInputSet-Country']", AI = false)
	private WebElement drpCountry;

	@IFindBy(how = How.CSS, using = "input[name='AddressBookPickerPopup-AddressBookSearchScreen-AddressBookSearchDV-PreferredVendors']", AI = false)
	private WebElement rdbPreferredVendorsOnly;

	@IFindBy(how = How.CSS, using = "input[name='AddressBookPickerPopup-AddressBookSearchScreen-AddressBookContactSearchPopupDV-SelectFromProximitySearch']", AI = false)
	private WebElement inpSearchbydistancefromalocation;

	@IFindBy(how = How.CSS, using = "#AddressBookPickerPopup-AddressBookSearchScreen-AddressBookSearchDV-CCAddressBookSearchLocationInputSet-CCAddressInputSet-globalAddressContainer-Address_ValidUntil_dateIcon", AI = false)
	private WebElement btnValiduntilDateIcon;

	@IFindBy(how = How.CSS, using = "select[name$='GlobalAddressInputSet-State']", AI = false)
	private WebElement drpState;

	@IFindBy(how = How.CSS, using = "input[name='AddressBookPickerPopup-AddressBookSearchScreen-AddressBookSearchDV-TaxID']", AI = false)
	private WebElement inpTaxID;

	@IFindBy(how = How.CSS, using = "input[name='AddressBookPickerPopup-AddressBookSearchScreen-AddressBookSearchDV-CCAddressBookSearchProximityAddressInputSet-globalAddressContainer-proximityAddress-GlobalAddressInputSet-City']", AI = false)
	private WebElement inpCity_8;

	@IFindBy(how = How.CSS, using = "#AddressBookPickerPopup-AddressBookSearchScreen-cancel>div[role='button']", AI = false)
	private WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "input[name='AddressBookPickerPopup-AddressBookSearchScreen-AddressBookSearchDV-NameInputSet-GlobalContactNameInputSet-Name']", AI = false)
	private WebElement inpNameLastName;

	@IFindBy(how = How.CSS, using = "#AddressBookPickerPopup-AddressBookSearchScreen-AddressBookSearchDV-SpecialistServicesInputSet-SpecialistServicesLV_tb-AddSpecialistService>div[role='button']", AI = false)
	private WebElement btnAdd;

	@IFindBy(how = How.CSS, using = "select[name='AddressBookPickerPopup-AddressBookSearchScreen-AddressBookSearchDV-CCAddressBookSearchProximityAddressInputSet-globalAddressContainer-Address_Name']", AI = false)
	private WebElement drpLocation_3;

	@IFindBy(how = How.CSS, using = "div[id$='FromProximitySearch_Choice']", AI = false)
	private WebElement rdbSearchByDistance;

	@IFindBy(how = How.CSS, using = "div[id$='_Select']", AI = false)
	private WebElement btnSelect;
	
	@IFindBy(how = How.CSS, using = "div[id$='AddressBookSearchScreen-ttlBar']", AI = false)
	private WebElement ttlSearchAddressBook;
	
	@IFindBy(how = How.CSS, using = "input[name$='-FirstName']", AI = false)
	private WebElement inpFirstName;
	
	@IFindBy(how = How.CSS, using = "input[name$='-LastName']", AI = false)
	private WebElement inpLastName;

	public SearchAddressBookPage(){
	}

	public SearchAddressBookPage(WebDriver driver){
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
		}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, ttlSearchAddressBook))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);
	}public SearchAddressBookPage selectSearchType(WebDriver driver,String SearchType)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpSearchType,SearchType,"SearchType");
		return this;
	}
	public SearchAddressBookPage clickAutoFillIcon_13(WebDriver driver)  {
		BrowserActions.click(driver, btnAutoFillIcon_13,"AutoFillIcon_13");
		return this;
	}
	public SearchAddressBookPage enterCity(WebDriver driver,String City) {
		BrowserActions.type(driver, inpCity,City, "City");
		return this;
	}
	public SearchAddressBookPage clickAutoFillIcon_2(WebDriver driver)  {
		BrowserActions.click(driver, btnAutoFillIcon_2,"AutoFillIcon_2");
		return this;
	}
	public SearchAddressBookPage selectJurisdiction(WebDriver driver,String Jurisdiction)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpJurisdiction,Jurisdiction,"Jurisdiction");
		return this;
	}
	public SearchAddressBookPage clickAutoFillIcon_9(WebDriver driver)  {
		BrowserActions.click(driver, btnAutoFillIcon_9,"AutoFillIcon_9");
		return this;
	}
	public SearchAddressBookPage enterCounty(WebDriver driver,String County) {
		BrowserActions.type(driver, inpCounty,County, "County");
		return this;
	}
	public SearchAddressBookPage enterAddress2_6(WebDriver driver,String Address2_6) {
		BrowserActions.type(driver, inpAddress2_6,Address2_6, "Address2_6");
		return this;
	}
	public SearchAddressBookPage clickSearch(WebDriver driver)  {
		BrowserActions.click(driver, btnSearch,"Search");
		return this;
	}
	public SearchAddressBookPage enterLocationCode(WebDriver driver,String LocationCode) {
		BrowserActions.type(driver, inpLocationCode,LocationCode,1, "LocationCode");
		return this;
	}
	public SearchAddressBookPage selectCountry_5(WebDriver driver,String Country_5)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCountry_5,Country_5,"Country_5");
		return this;
	}
	public SearchAddressBookPage clickIncludePendingContacts(WebDriver driver)  {
		BrowserActions.click(driver, chkIncludePendingContacts,"IncludePendingContacts");
		return this;
	}
	public SearchAddressBookPage enterLocation_4(WebDriver driver,String Location_4) {
		BrowserActions.type(driver, inpLocation_4,Location_4, "Location_4");
		return this;
	}
	public SearchAddressBookPage enterZIPCode_12(WebDriver driver,String ZIPCode_12) {
		BrowserActions.type(driver, inpZIPCode_12,ZIPCode_12, "ZIPCode_12");
		return this;
	}
	public SearchAddressBookPage selectMedicalSpecialty_1(WebDriver driver,String MedicalSpecialty_1)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpMedicalSpecialty_1,MedicalSpecialty_1,"MedicalSpecialty_1");
		return this;
	}
	public SearchAddressBookPage selectType(WebDriver driver,String Type)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpType,Type,"Type");
		return this;
	}
	public SearchAddressBookPage enterLocation(WebDriver driver,String Location) {
		BrowserActions.type(driver, inpLocation,Location, "Location");
		return this;
	}
	public SearchAddressBookPage selectState_11(WebDriver driver,String State_11)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpState_11,State_11,"State_11");
		return this;
	}
	public SearchAddressBookPage clickOpenContactManager(WebDriver driver)  {
		BrowserActions.click(driver, btnOpenContactManager,"OpenContactManager");
		return this;
	}
	public SearchAddressBookPage selectLawFirmSpecialty(WebDriver driver,String LawFirmSpecialty)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpLawFirmSpecialty,LawFirmSpecialty,"LawFirmSpecialty");
		return this;
	}
	public SearchAddressBookPage clickReset(WebDriver driver)  {
		BrowserActions.click(driver, btnReset,"Reset");
		return this;
	}
	public SearchAddressBookPage enterSearchbylocation(WebDriver driver,String Searchbylocation) {
		BrowserActions.type(driver, inpSearchbylocation,Searchbylocation, "Searchbylocation");
		return this;
	}
	public SearchAddressBookPage clickPrintExport(WebDriver driver)  {
		BrowserActions.click(driver, btnPrintExport,"PrintExport");
		return this;
	}
	public SearchAddressBookPage clickReturntoContacts(WebDriver driver)  {
		BrowserActions.click(driver, btnReturntoContacts,"ReturntoContacts");
		return this;
	}
	public SearchAddressBookPage selectMedicalSpecialty(WebDriver driver,String MedicalSpecialty)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpMedicalSpecialty,MedicalSpecialty,"MedicalSpecialty");
		return this;
	}
	public SearchAddressBookPage enterAddress3(WebDriver driver,String Address3) {
		BrowserActions.type(driver, inpAddress3,Address3, "Address3");
		return this;
	}
	public SearchAddressBookPage enterLocationDescription(WebDriver driver,String LocationDescription) {
		BrowserActions.type(driver, inpLocationDescription,LocationDescription, "LocationDescription");
		return this;
	}
	public SearchAddressBookPage clickIncludeSpecialistService(WebDriver driver)  {
		BrowserActions.click(driver, chkIncludeSpecialistService,"IncludeSpecialistService");
		return this;
	}
	public SearchAddressBookPage enterAddress1(WebDriver driver,String Address1) {
		BrowserActions.type(driver, inpAddress1,Address1, "Address1");
		return this;
	}
	public SearchAddressBookPage selectAddressType(WebDriver driver,String AddressType)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpAddressType,AddressType,"AddressType");
		return this;
	}
	public SearchAddressBookPage enterAddress2(WebDriver driver,String Address2) {
		BrowserActions.type(driver, inpAddress2,Address2, "Address2");
		return this;
	}
	public SearchAddressBookPage selectLocation(WebDriver driver,String Location)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpLocation,Location,"Location");
		return this;
	}
	public SearchAddressBookPage enterAddress(WebDriver driver,String Address) {
		BrowserActions.type(driver, inpAddress,Address, "Address");
		return this;
	}
	public SearchAddressBookPage enterZIPCode(WebDriver driver,String ZIPCode) {
		BrowserActions.type(driver, inpZIPCode,ZIPCode, "ZIPCode");
		return this;
	}
	public SearchAddressBookPage clickRemove(WebDriver driver)  {
		BrowserActions.click(driver, btnRemove,"Remove");
		return this;
	}
	public SearchAddressBookPage clickAutoFillIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnAutoFillIcon,"AutoFillIcon");
		return this;
	}
	public SearchAddressBookPage enterValiduntil(WebDriver driver,String Validuntil) {
		BrowserActions.type(driver, inpValiduntil,Validuntil, "Validuntil");
		return this;
	}
	public SearchAddressBookPage enterCounty_10(WebDriver driver,String County_10) {
		BrowserActions.type(driver, inpCounty_10,County_10, "County_10");
		return this;
	}
	public SearchAddressBookPage clickRetrieveRequestedDirections(WebDriver driver)  {
		BrowserActions.click(driver, btnRetrieveRequestedDirections,"RetrieveRequestedDirections");
		return this;
	}
	public SearchAddressBookPage selectAdjudicativeDomain(WebDriver driver,String AdjudicativeDomain)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpAdjudicativeDomain,AdjudicativeDomain,"AdjudicativeDomain");
		return this;
	}
	public SearchAddressBookPage selectSearchRadius(WebDriver driver,String SearchRadius)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpSearchRadius,SearchRadius,"SearchRadius");
		return this;
	}
	public SearchAddressBookPage enterAddress3_7(WebDriver driver,String Address3_7) {
		BrowserActions.type(driver, inpAddress3_7,Address3_7, "Address3_7");
		return this;
	}
	public SearchAddressBookPage selectMinimumScore(WebDriver driver,String MinimumScore)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpMinimumScore,MinimumScore,"MinimumScore");
		return this;
	}
	public SearchAddressBookPage selectLegalSpecialty(WebDriver driver,String LegalSpecialty)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpLegalSpecialty,LegalSpecialty,"LegalSpecialty");
		return this;
	}
	public SearchAddressBookPage selectCountry(WebDriver driver,String Country)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCountry,Country,"Country");
		return this;
	}
	public SearchAddressBookPage clickPreferredVendorsOnly(WebDriver driver)  {
		BrowserActions.click(driver, rdbPreferredVendorsOnly,"PreferredVendorsOnly");
		return this;
	}
	public SearchAddressBookPage enterSearchbydistancefromalocation(WebDriver driver,String Searchbydistancefromalocation) {
		BrowserActions.type(driver, inpSearchbydistancefromalocation,Searchbydistancefromalocation, "Searchbydistancefromalocation");
		return this;
	}
	public SearchAddressBookPage clickValiduntilDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnValiduntilDateIcon,"ValiduntilDateIcon");
		return this;
	}
	public SearchAddressBookPage selectState(WebDriver driver,String State)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpState,State,"State");
		return this;
	}
	public SearchAddressBookPage enterTaxID(WebDriver driver,String TaxID) {
		BrowserActions.type(driver, inpTaxID,TaxID, "TaxID");
		return this;
	}
	public SearchAddressBookPage enterCity_8(WebDriver driver,String City_8) {
		BrowserActions.type(driver, inpCity_8,City_8, "City_8");
		return this;
	}
	public SearchAddressBookPage clickCancel(WebDriver driver)  {
		BrowserActions.click(driver, btnCancel,"Cancel");
		return this;
	}
	public SearchAddressBookPage enterNameOrLastName(WebDriver driver,String NameLastName) {
		BrowserActions.type(driver, inpNameLastName,NameLastName, "NameLastName");
		return this;
	}
	public SearchAddressBookPage clickAdd(WebDriver driver)  {
		BrowserActions.click(driver, btnAdd,"Add");
		return this;
	}
	public SearchAddressBookPage selectLocation_3(WebDriver driver,String Location_3)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpLocation_3,Location_3,"Location_3");
		return this;
	}
	public SearchAddressBookPage clickSelect(WebDriver driver)  {
		BrowserActions.click(driver, btnSelect,1,"Select");
		return this;
	}
	public SearchAddressBookPage enterFirstName(WebDriver driver,String firstName) {
		BrowserActions.type(driver, inpFirstName,firstName, "first Name");
		return this;
	}
	public SearchAddressBookPage enterLastName(WebDriver driver,String lastName) {
		BrowserActions.type(driver, inpLastName,lastName, "Last Name");
		return this;
	}
}
