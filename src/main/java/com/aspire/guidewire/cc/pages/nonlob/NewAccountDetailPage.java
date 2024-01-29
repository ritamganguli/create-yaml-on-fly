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

public class NewAccountDetailPage extends LoadableComponent<NewAccountDetailPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	@IFindBy(how = How.CSS, using = "#NewAccount-AccountDetailScreen-AccountTabsCV-AccountAutomatedActivitiesLVPanelRef-SpecialHandlingAutomatedActivitiesLV_tb-AutomatedActivitiesAdd-0-AutomatedActivitiesAddClaimIndicatorHandler>div[role='menuitem']", AI = false)
	public WebElement btnAutomatedActivitiesAddClaimIndicatorHandler;

	@IFindBy(how = How.CSS, using = "#NewAccount-AccountDetailScreen-AccountTabsCV-AccountAutomatedActivitiesLVPanelRef-AutomatedActivitiesTitle", AI = false)
	public WebElement lblAutomatedActivitiesTitle;

	@IFindBy(how = How.ID, using = "AccountAdmin-ttlBar", AI = false)
	public WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "#NewAccount-AccountDetailScreen-AccountTabsCV-AccountDV-AccountHolder-MenuItem_Search>div[role='menuitem']", AI = false)
	public WebElement btnSearch;

	@IFindBy(how = How.CSS, using = "#NewAccount-AccountDetailScreen-AccountTabsCV-AccountDV_tb-Edit>div[role='button']", AI = false)
	public WebElement btnEdit;

	@IFindBy(how = How.CSS, using = "#NewAccount-AccountDetailScreen-AccountTabsCV-OtherInstructionsPanelSet_tb-ToolbarButtonaddOtherInstruction>div[role='button']", AI = false)
	public WebElement btnAdd_5;

	@IFindBy(how = How.CSS, using = "#NewAccount-AccountDetailScreen-AccountTabsCV-AccountDV-AccountHolder-MenuItem_NoneSelected>div[role='menuitem']", AI = false)
	public WebElement btnNoneselected;

	@IFindBy(how = How.CSS, using = "#NewAccount-AccountDetailScreen-AccountTabsCV-AccountAutomatedActivitiesLVPanelRef-SpecialHandlingAutomatedActivitiesLV_tb-AutomatedActivitiesAdd>div[role='button']", AI = false)
	public WebElement btnAdd_3;

	@IFindBy(how = How.CSS, using = "#NewAccount-AccountDetailScreen-AccountTabsCV-AccountDV_tb-Update>div[role='button']", AI = false)
	public WebElement btnUpdate;

	@IFindBy(how = How.CSS, using = "#NewAccount-AccountDetailScreen-AccountTabsCV-AccountHandlingTabTab", AI = false)
	public WebElement btnSpecialHandling;

	@IFindBy(how = How.CSS, using = "#NewAccount-AccountDetailScreen-AccountTabsCV-AccountAutomatedActivitiesLVPanelRef-SpecialHandlingAutomatedActivitiesLV_tb-AutomatedActivitiesDelete>div[role='button']", AI = false)
	public WebElement btnDelete_2;

	@IFindBy(how = How.CSS, using = "#NewAccount-AccountDetailScreen-AccountTabsCV-AccountDV-AccountHolder-AccountHolderMenuIcon>div[role='button']", AI = false)
	public WebElement btnAccountHolderMenuIcon;

	@IFindBy(how = How.CSS, using = "#NewAccount-AccountDetailScreen-AccountTabsCV-AccountDV_tb-Cancel>div[role='button']", AI = false)
	public WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "div[id$='DeleteAccountsButton']", AI = false)
	public WebElement btnDelete;

	@IFindBy(how = How.CSS, using = "#NewAccount-AccountDetailScreen-AccountTabsCV-AccountAutomatedNotificationsLVPanelRef-SpecialHandlingAutomatedNotificationsLV_tb-AutomatedNotificationsAdd>div[role='button']", AI = false)
	public WebElement btnAdd;

	@IFindBy(how = How.CSS, using = "#NewAccount-AccountDetailScreen-AccountTabsCV-AccountAutomatedActivitiesLVPanelRef-SpecialHandlingAutomatedActivitiesLV_tb-AutomatedActivitiesAdd-1-AutomatedActivitiesAddClaimIndicatorHandler>div[role='menuitem']", AI = false)
	public WebElement btnAutomatedActivitiesAddClaimIndicatorHandler_4;

	@IFindBy(how = How.CSS, using = "input[name='NewAccount-AccountDetailScreen-AccountTabsCV-AccountDV-AccountNumber']", AI = false)
	public WebElement inpAccountNumber;

	@IFindBy(how = How.CSS, using = "#NewAccount-AccountDetailScreen-AccountTabsCV-AccountAutomatedNotificationsLVPanelRef-SpecialHandlingAutomatedNotificationsLV_tb-AutomatedNotificationsAdd-1-AutomatedNotificationsAddClaimIndicatorHandler>div[role='menuitem']", AI = false)
	public WebElement btnAutomatedNotificationsAddClaimIndicatorHandler_1;

	@IFindBy(how = How.CSS, using = "#NewAccount-AccountDetailScreen-AccountTabsCV-AccountDetailTabTab", AI = false)
	public WebElement btnDetail;

	@IFindBy(how = How.CSS, using = "#NewAccount-AccountDetailScreen-AccountTabsCV-AccountAutomatedNotificationsLVPanelRef-SpecialHandlingAutomatedNotificationsLV_tb-AutomatedNotificationsAdd-0-AutomatedNotificationsAddClaimIndicatorHandler>div[role='menuitem']", AI = false)
	public WebElement btnAutomatedNotificationsAddClaimIndicatorHandler;

	@IFindBy(how = How.CSS, using = "#NewAccount-AccountDetailScreen-AccountTabsCV-OtherInstructionsTitle", AI = false)
	public WebElement lblOtherInstructionsTitle;

	@IFindBy(how = How.CSS, using = "#NewAccount-AccountDetailScreen-AccountTabsCV-AccountAutomatedNotificationsLVPanelRef-AutomatedNotificationsTitle", AI = false)
	public WebElement lblAutomatedNotificationsTitle;

	@IFindBy(how = How.CSS, using = "div[id$='AccountHolder-MenuItem_Search']", AI = false)
	public WebElement btnSearchAccountHolderMenuIcon;

	@IFindBy(how = How.CSS, using = "div[id$='AccountDetailTabTab']", AI = false)
	public WebElement btnDetailsTab;

	@IFindBy(how = How.CSS, using = "div[id$='Update']", AI = false)
	public WebElement btnOk;

	@IFindBy(how = How.CSS, using = "div[id$='Accounts_AddAccountButton']", AI = false)
	public WebElement btnAddAccount;

	@IFindBy(how = How.CSS, using = "div[id$='AccountsLV-0-_Checkbox']", AI = false)
	public WebElement chkAccount;



	public NewAccountDetailPage(){
	}

	public NewAccountDetailPage(WebDriver driver) throws Exception{
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
		}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, lblAutomatedNotificationsTitle))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);
	}public NewAccountDetailPage clickAutomatedActivitiesAddClaimIndicatorHandler(WebDriver driver)  {
		BrowserActions.click(driver, btnAutomatedActivitiesAddClaimIndicatorHandler,"AutomatedActivitiesAddClaimIndicatorHandler");
		return this;
	}
	public NewAccountDetailPage clickSearch(WebDriver driver)  {
		BrowserActions.click(driver, btnSearch,"Search");
		return this;
	}
	public NewAccountDetailPage clickEdit(WebDriver driver)  {
		BrowserActions.click(driver, btnEdit,"Edit");
		return this;
	}
	public NewAccountDetailPage clickAdd_5(WebDriver driver)  {
		BrowserActions.click(driver, btnAdd_5,"Add_5");
		return this;
	}
	public NewAccountDetailPage clickNoneselected(WebDriver driver)  {
		BrowserActions.click(driver, btnNoneselected,"Noneselected");
		return this;
	}
	public NewAccountDetailPage clickAdd_3(WebDriver driver)  {
		BrowserActions.click(driver, btnAdd_3,"Add_3");
		return this;
	}
	public NewAccountDetailPage clickUpdate(WebDriver driver)  {
		BrowserActions.click(driver, btnUpdate,"Update");
		return this;
	}
	public NewAccountDetailPage clickSpecialHandling(WebDriver driver)  {
		BrowserActions.click(driver, btnSpecialHandling,"SpecialHandling");
		return this;
	}
	public NewAccountDetailPage clickDelete_2(WebDriver driver)  {
		BrowserActions.click(driver, btnDelete_2,"Delete_2");
		return this;
	}
	public NewAccountDetailPage clickAccountHolderMenuIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnAccountHolderMenuIcon,"AccountHolderMenuIcon");
		return this;
	}
	public NewAccountDetailPage clickCancel(WebDriver driver)  {
		BrowserActions.click(driver, btnCancel,"Cancel");
		return this;
	}
	public NewAccountDetailPage clickDelete(WebDriver driver)  {
		BrowserActions.click(driver, btnDelete,"Delete");
		BrowserActions.confirmAlert(driver, "Are you sure you would like to delete the selected accounts?");
		return this;
	}
	public NewAccountDetailPage clickAdd(WebDriver driver)  {
		BrowserActions.click(driver, btnAdd,"Add");
		return this;
	}
	public NewAccountDetailPage clickAutomatedActivitiesAddClaimIndicatorHandler_4(WebDriver driver)  {
		BrowserActions.click(driver, btnAutomatedActivitiesAddClaimIndicatorHandler_4,"AutomatedActivitiesAddClaimIndicatorHandler_4");
		return this;
	}
	public NewAccountDetailPage enterAccountNumber(WebDriver driver,String AccountNumber) {
		BrowserActions.type(driver, inpAccountNumber,AccountNumber, "AccountNumber");
		return this;
	}
	public NewAccountDetailPage clickAutomatedNotificationsAddClaimIndicatorHandler_1(WebDriver driver)  {
		BrowserActions.click(driver, btnAutomatedNotificationsAddClaimIndicatorHandler_1,"AutomatedNotificationsAddClaimIndicatorHandler_1");
		return this;
	}
	public NewAccountDetailPage clickDetail(WebDriver driver)  {
		BrowserActions.click(driver, btnDetail,"Detail");
		return this;
	}
	public NewAccountDetailPage clickAutomatedNotificationsAddClaimIndicatorHandler(WebDriver driver)  {
		BrowserActions.click(driver, btnAutomatedNotificationsAddClaimIndicatorHandler,"AutomatedNotificationsAddClaimIndicatorHandler");
		return this;
	}

	public NewAccountDetailPage clickSearchAccountHolderMenuIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnSearchAccountHolderMenuIcon,"Search Account Holder Menu Icon");
		return this;
	}

	public NewAccountDetailPage clickAddAccount(WebDriver driver) {
		BrowserActions.click(driver, btnAddAccount, "Add Account Button");
		return this;
	}


	public NewAccountDetailPage clickOk(WebDriver driver) {
		BrowserActions.click(driver, btnOk, "Ok Button");
		return this;
	}

	public void clickDetailsTab(WebDriver driver)
	{
		BrowserActions.click(driver, btnDetailsTab, "Details Tab");
	}

	public NewAccountDetailPage clickAccountCheckBox(WebDriver driver) {
		BrowserActions.click(driver, chkAccount, "Account Check box");
		return this;
	}

	public void verifyclickAddedUserNameIsNotDisplayed(WebDriver driver,String username)  {
		boolean flag = false;
		BrowserActions.waitForNetworkIdleState(driver);
		By userName = By.xpath("//div[text()='"+username+"']");
		int size = BrowserActions.getWebElementSize(driver, userName, "username", 0.5);
		if(size == 0) {
			flag = true;
		}
		Log.softAssertThat(flag, "Account("+username+") is deleted", "User("+username+") present in list not deleted");
	}

	public class SearchAddressBookPage extends LoadableComponent<SearchAddressBookPage> {

		WebDriver driver;
		private boolean isPageLoaded;
		public ElementLayer elementLayer;
		String elementObject;
		HashMap<String, String> getPageObjects;
		public  List<Object> pageFactoryKey = new ArrayList<Object>();
		public  List<String> pageFactoryValue = new ArrayList<String>();

		//TopNavBar object
		@IFindBy(how = How.CSS, using = "select[name='AddressBookPickerPopup-AddressBookSearchScreen-AddressBookSearchDV-SearchType']", AI = false)
		public WebElement drpSearchType;

		@IFindBy(how = How.CSS, using = "#AddressBookPickerPopup-AddressBookSearchScreen-AddressBookSearchDV-CCAddressBookSearchProximityAddressInputSet-globalAddressContainer-proximityAddress-GlobalAddressInputSet-PostalCode-AutoFillIcon", AI = false)
		public WebElement btnAutoFillIcon_13;

		@IFindBy(how = How.CSS, using = "input[name='AddressBookPickerPopup-AddressBookSearchScreen-AddressBookSearchDV-CCAddressBookSearchLocationInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-City']", AI = false)
		public WebElement inpCity;

		@IFindBy(how = How.CSS, using = "#AddressBookPickerPopup-AddressBookSearchScreen-AddressBookSearchDV-CCAddressBookSearchLocationInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-PostalCode-AutoFillIcon", AI = false)
		public WebElement btnAutoFillIcon_2;

		@IFindBy(how = How.CSS, using = "select[name='AddressBookPickerPopup-AddressBookSearchScreen-AddressBookSearchDV-CCAddressBookSearchLocationInputSet-CCAddressInputSet-globalAddressContainer-Claim_JurisdictionState']", AI = false)
		public WebElement drpJurisdiction;

		@IFindBy(how = How.CSS, using = "#AddressBookPickerPopup-AddressBookSearchScreen-AddressBookSearchDV-CCAddressBookSearchProximityAddressInputSet-globalAddressContainer-proximityAddress-GlobalAddressInputSet-City-AutoFillIcon", AI = false)
		public WebElement btnAutoFillIcon_9;

		@IFindBy(how = How.CSS, using = "input[name$='County']", AI = false)
		public WebElement inpCounty;

		@IFindBy(how = How.CSS, using = "input[name='AddressBookPickerPopup-AddressBookSearchScreen-AddressBookSearchDV-CCAddressBookSearchProximityAddressInputSet-globalAddressContainer-proximityAddress-GlobalAddressInputSet-AddressLine2']", AI = false)
		public WebElement inpAddress2_6;

		@IFindBy(how = How.CSS, using = "#AddressBookPickerPopup-AddressBookSearchScreen-AddressBookSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Search", AI = false)
		public WebElement btnSearch;

		@IFindBy(how = How.CSS, using = "input[name='AddressBookPickerPopup-AddressBookSearchScreen-AddressBookSearchDV-CCAddressBookSearchLocationInputSet-CCAddressInputSet-globalAddressContainer-Claim_LocationCode']", AI = false)
		public WebElement inpLocationCode;

		@IFindBy(how = How.CSS, using = "select[name='AddressBookPickerPopup-AddressBookSearchScreen-AddressBookSearchDV-CCAddressBookSearchProximityAddressInputSet-globalAddressContainer-proximityAddress-GlobalAddressInputSet-Country']", AI = false)
		public WebElement drpCountry_5;

		@IFindBy(how = How.CSS, using = "input[name='AddressBookPickerPopup-AddressBookSearchScreen-AddressBookSearchDV-IncludePendingContacts']", AI = false)
		public WebElement chkIncludePendingContacts;

		@IFindBy(how = How.CSS, using = "input[name='AddressBookPickerPopup-AddressBookSearchScreen-AddressBookSearchDV-CCAddressBookSearchProximityAddressInputSet-globalAddressContainer-proximityAddress-GlobalAddressInputSet-AddressSummary']", AI = false)
		public WebElement inpLocation_4;

		@IFindBy(how = How.CSS, using = "input[name='AddressBookPickerPopup-AddressBookSearchScreen-AddressBookSearchDV-CCAddressBookSearchProximityAddressInputSet-globalAddressContainer-proximityAddress-GlobalAddressInputSet-PostalCode']", AI = false)
		public WebElement inpZIPCode_12;

		@IFindBy(how = How.CSS, using = "select[name='AddressBookPickerPopup-AddressBookSearchScreen-AddressBookSearchDV-MedicalSpecialty']", AI = false)
		public WebElement drpMedicalSpecialty_1;

		@IFindBy(how = How.CSS, using = "select[name='AddressBookPickerPopup-AddressBookSearchScreen-AddressBookSearchDV-ContactSubtype']", AI = false)
		public WebElement drpType;

		@IFindBy(how = How.CSS, using = "input[name='AddressBookPickerPopup-AddressBookSearchScreen-AddressBookSearchDV-CCAddressBookSearchLocationInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressSummary']", AI = false)
		public WebElement inpLocation;

		@IFindBy(how = How.CSS, using = "select[name='AddressBookPickerPopup-AddressBookSearchScreen-AddressBookSearchDV-CCAddressBookSearchProximityAddressInputSet-globalAddressContainer-proximityAddress-GlobalAddressInputSet-State']", AI = false)
		public WebElement drpState_11;

		@IFindBy(how = How.CSS, using = "#AddressBookPickerPopup-AddressBookSearchScreen-LaunchAB>div[role='button']", AI = false)
		public WebElement btnOpenContactManager;

		@IFindBy(how = How.CSS, using = "select[name='AddressBookPickerPopup-AddressBookSearchScreen-AddressBookSearchDV-LawFirmSpecialty']", AI = false)
		public WebElement drpLawFirmSpecialty;

		@IFindBy(how = How.CSS, using = "#AddressBookPickerPopup-AddressBookSearchScreen-AddressBookSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Reset", AI = false)
		public WebElement btnReset;

		@IFindBy(how = How.CSS, using = "input[name='AddressBookPickerPopup-AddressBookSearchScreen-AddressBookContactSearchPopupDV-SelectFromSearch']", AI = false)
		public WebElement inpSearchbylocation;

		@IFindBy(how = How.CSS, using = "#AddressBookPickerPopup-AddressBookSearchScreen-AddressBookSearchLV_tb-ClaimSearchScreen_PrintButton>div[role='button']", AI = false)
		public WebElement btnPrintExport;

		@IFindBy(how = How.CSS, using = "#AddressBookPickerPopup-AddressBookSearchScreen-ttlBar", AI = false)
		public WebElement lblTtlBar;

		@IFindBy(how = How.CSS, using = "select[name='AddressBookPickerPopup-AddressBookSearchScreen-AddressBookSearchDV-DoctorSpecialty']", AI = false)
		public WebElement drpMedicalSpecialty;

		@IFindBy(how = How.CSS, using = "input[name='AddressBookPickerPopup-AddressBookSearchScreen-AddressBookSearchDV-CCAddressBookSearchLocationInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressLine3']", AI = false)
		public WebElement inpAddress3;

		@IFindBy(how = How.CSS, using = "input[name='AddressBookPickerPopup-AddressBookSearchScreen-AddressBookSearchDV-CCAddressBookSearchLocationInputSet-CCAddressInputSet-globalAddressContainer-Address_Description']", AI = false)
		public WebElement inpLocationDescription;

		@IFindBy(how = How.CSS, using = "input[name='AddressBookPickerPopup-AddressBookSearchScreen-AddressBookSearchDV-IncludeSpecialistService']", AI = false)
		public WebElement chkIncludeSpecialistService;

		@IFindBy(how = How.CSS, using = "input[name='AddressBookPickerPopup-AddressBookSearchScreen-AddressBookSearchDV-CCAddressBookSearchLocationInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressLine1']", AI = false)
		public WebElement inpAddress1;

		@IFindBy(how = How.CSS, using = "select[name='AddressBookPickerPopup-AddressBookSearchScreen-AddressBookSearchDV-CCAddressBookSearchLocationInputSet-CCAddressInputSet-globalAddressContainer-Address_AddressType']", AI = false)
		public WebElement drpAddressType;

		@IFindBy(how = How.CSS, using = "input[name='AddressBookPickerPopup-AddressBookSearchScreen-AddressBookSearchDV-CCAddressBookSearchLocationInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-AddressLine2']", AI = false)
		public WebElement inpAddress2;

		@IFindBy(how = How.CSS, using = "select[name='AddressBookPickerPopup-AddressBookSearchScreen-AddressBookSearchDV-CCAddressBookSearchLocationInputSet-CCAddressInputSet-globalAddressContainer-Address_Picker']", AI = false)
		public WebElement drpLocation;

		@IFindBy(how = How.CSS, using = "input[name='AddressBookPickerPopup-AddressBookSearchScreen-AddressBookSearchDV-CCAddressBookSearchProximityAddressInputSet-globalAddressContainer-proximityAddress-GlobalAddressInputSet-AddressLine1']", AI = false)
		public WebElement inpAddress;

		@IFindBy(how = How.CSS, using = "input[name='AddressBookPickerPopup-AddressBookSearchScreen-AddressBookSearchDV-CCAddressBookSearchLocationInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-PostalCode']", AI = false)
		public WebElement inpZIPCode;

		@IFindBy(how = How.CSS, using = "#AddressBookPickerPopup-AddressBookSearchScreen-AddressBookSearchDV-SpecialistServicesInputSet-SpecialistServicesLV_tb-RemoveSpecialService>div[role='button']", AI = false)
		public WebElement btnRemove;

		@IFindBy(how = How.CSS, using = "#AddressBookPickerPopup-AddressBookSearchScreen-AddressBookSearchDV-CCAddressBookSearchLocationInputSet-CCAddressInputSet-globalAddressContainer-globalAddress-GlobalAddressInputSet-City-AutoFillIcon", AI = false)
		public WebElement btnAutoFillIcon;

		@IFindBy(how = How.CSS, using = "input[name='AddressBookPickerPopup-AddressBookSearchScreen-AddressBookSearchDV-CCAddressBookSearchLocationInputSet-CCAddressInputSet-globalAddressContainer-Address_ValidUntil']", AI = false)
		public WebElement inpValiduntil;

		@IFindBy(how = How.CSS, using = "input[name='AddressBookPickerPopup-AddressBookSearchScreen-AddressBookSearchDV-CCAddressBookSearchProximityAddressInputSet-globalAddressContainer-proximityAddress-GlobalAddressInputSet-County']", AI = false)
		public WebElement inpCounty_10;

		@IFindBy(how = How.CSS, using = "#AddressBookPickerPopup-AddressBookSearchScreen-AddressBookSearchLV_tb-RetrieveRequested>div[role='button']", AI = false)
		public WebElement btnRetrieveRequestedDirections;

		@IFindBy(how = How.CSS, using = "select[name='AddressBookPickerPopup-AddressBookSearchScreen-AddressBookSearchDV-AdjudicativeDomain']", AI = false)
		public WebElement drpAdjudicativeDomain;

		@IFindBy(how = How.CSS, using = "select[name='AddressBookPickerPopup-AddressBookSearchScreen-AddressBookSearchDV-CCAddressBookSearchProximityAddressInputSet-globalAddressContainer-ProximitySearchType']", AI = false)
		public WebElement drpSearchRadius;

		@IFindBy(how = How.CSS, using = "input[name='AddressBookPickerPopup-AddressBookSearchScreen-AddressBookSearchDV-CCAddressBookSearchProximityAddressInputSet-globalAddressContainer-proximityAddress-GlobalAddressInputSet-AddressLine3']", AI = false)
		public WebElement inpAddress3_7;

		@IFindBy(how = How.CSS, using = "select[name='AddressBookPickerPopup-AddressBookSearchScreen-AddressBookSearchDV-MinimumScore']", AI = false)
		public WebElement drpMinimumScore;

		@IFindBy(how = How.CSS, using = "select[name='AddressBookPickerPopup-AddressBookSearchScreen-AddressBookSearchDV-AttorneySpecialty']", AI = false)
		public WebElement drpLegalSpecialty;

		@IFindBy(how = How.CSS, using = "select[name$='InputSet-Country']", AI = false)
		public WebElement drpCountry;

		@IFindBy(how = How.CSS, using = "input[name='AddressBookPickerPopup-AddressBookSearchScreen-AddressBookSearchDV-PreferredVendors']", AI = false)
		public WebElement rdbPreferredVendorsOnly;

		@IFindBy(how = How.CSS, using = "input[name='AddressBookPickerPopup-AddressBookSearchScreen-AddressBookContactSearchPopupDV-SelectFromProximitySearch']", AI = false)
		public WebElement inpSearchbydistancefromalocation;

		@IFindBy(how = How.CSS, using = "#AddressBookPickerPopup-AddressBookSearchScreen-AddressBookSearchDV-CCAddressBookSearchLocationInputSet-CCAddressInputSet-globalAddressContainer-Address_ValidUntil_dateIcon", AI = false)
		public WebElement btnValiduntilDateIcon;

		@IFindBy(how = How.CSS, using = "select[name$='GlobalAddressInputSet-State']", AI = false)
		public WebElement drpState;

		@IFindBy(how = How.CSS, using = "input[name='AddressBookPickerPopup-AddressBookSearchScreen-AddressBookSearchDV-TaxID']", AI = false)
		public WebElement inpTaxID;

		@IFindBy(how = How.CSS, using = "input[name='AddressBookPickerPopup-AddressBookSearchScreen-AddressBookSearchDV-CCAddressBookSearchProximityAddressInputSet-globalAddressContainer-proximityAddress-GlobalAddressInputSet-City']", AI = false)
		public WebElement inpCity_8;

		@IFindBy(how = How.CSS, using = "#AddressBookPickerPopup-AddressBookSearchScreen-cancel>div[role='button']", AI = false)
		public WebElement btnCancel;

		@IFindBy(how = How.CSS, using = "input[name='AddressBookPickerPopup-AddressBookSearchScreen-AddressBookSearchDV-NameInputSet-GlobalContactNameInputSet-Name']", AI = false)
		public WebElement inpNameLastName;

		@IFindBy(how = How.CSS, using = "#AddressBookPickerPopup-AddressBookSearchScreen-AddressBookSearchDV-SpecialistServicesInputSet-SpecialistServicesLV_tb-AddSpecialistService>div[role='button']", AI = false)
		public WebElement btnAdd;

		@IFindBy(how = How.CSS, using = "select[name='AddressBookPickerPopup-AddressBookSearchScreen-AddressBookSearchDV-CCAddressBookSearchProximityAddressInputSet-globalAddressContainer-Address_Name']", AI = false)
		public WebElement drpLocation_3;

		@IFindBy(how = How.CSS, using = "#AddressBookPickerPopup-__crumb__", AI = false)
		public WebElement btnReturntoNewAccount;

		@IFindBy(how = How.CSS, using = "div[id$='Select']", AI = false)
		public WebElement btnSelect;

		@IFindBy(how = How.CSS, using = "input[name$='FirstName']", AI = false)
		public WebElement inpFirstName;

		@IFindBy(how = How.CSS, using = "input[name$='LastName']", AI = false)
		public WebElement inpLastName;
		
		@IFindBy(how = How.CSS, using = "div[id$='FromProximitySearch_Choice']", AI = false)
		private WebElement rdbSearchByDistance;

		@IFindBy(how = How.CSS, using = "div[id$='AddressBookSearchLV-0-_Select']", AI = false)
		private WebElement btnFirstSelect;
		
		public SearchAddressBookPage(){}

		public SearchAddressBookPage(WebDriver driver) throws Exception{
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
			}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, btnReturntoNewAccount))) {
				Log.fail("Page did not open up. Site might be down.", driver);
			}elementLayer = new ElementLayer(driver);
		}
		public SearchAddressBookPage selectSearchType(WebDriver driver,String SearchType)  {
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
			BrowserActions.type(driver, inpCounty,County,1,"County");
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
			BrowserActions.type(driver, inpLocationCode,LocationCode, "LocationCode");
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
			BrowserActions.selectDropDownByVisibleText(driver, drpCountry,Country,1,"Country");
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
		public SearchAddressBookPage enterNameLastName(WebDriver driver,String NameLastName) {
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
		public SearchAddressBookPage clickReturntoNewAccount(WebDriver driver)  {
			BrowserActions.click(driver, btnReturntoNewAccount,"ReturntoNewAccount");
			return this;
		}
		public SearchAddressBookPage clickSelectFromSearchResult(WebDriver driver)  {
			BrowserActions.click(driver, btnSelect,"Select From Search Result");
			return this;
		}
		public void enterFirstName(WebDriver driver,String firstname)
		{
			BrowserActions.type(driver, inpFirstName, firstname, "First Name");
		}

		public void enterLastName(WebDriver driver,String lastname)
		{
			BrowserActions.type(driver, inpLastName, lastname, "last Name");
		}
		public SearchAddressBookPage selectState(WebDriver driver,String State)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpState,State,true,"State");
			return this;
		}
		public SearchAddressBookPage clickSearchByDistance(WebDriver driver)  {
			BrowserActions.click(driver, rdbSearchByDistance,"Search By Distance");
			return this;
		}
		public SearchAddressBookPage clickSelect(WebDriver driver)  {
			BrowserActions.click(driver, btnFirstSelect,"First Select");
			return this;
		}

	}
}