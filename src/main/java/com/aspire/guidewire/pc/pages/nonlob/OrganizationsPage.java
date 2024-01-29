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

public class OrganizationsPage extends LoadableComponent<OrganizationsPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
	public  List<Object> pageFactoryKey = new ArrayList<Object>();
	public  List<String> pageFactoryValue = new ArrayList<String>();

	@IFindBy(how = How.CSS, using = "div[id*='Screen-ttlBar']", AI = false)
	private WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "#OrganizationSearchPopup-__crumb__", AI = false)
	private WebElement btn__crumb__;

	@IFindBy(how = How.CSS, using = "input[name='OrganizationSearchPopup-OrganizationSearchPopupScreen-OrganizationSearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine3']", AI = false)
	private WebElement inpAddress3;

	@IFindBy(how = How.CSS, using = "input[name$='-Name']", AI = false)
	private WebElement inpOrganizationName;

	@IFindBy(how = How.CSS, using = "input[name='OrganizationSearchPopup-OrganizationSearchPopupScreen-OrganizationSearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine1']", AI = false)
	private WebElement inpAddress1;

	@IFindBy(how = How.CSS, using = "input[name='OrganizationSearchPopup-OrganizationSearchPopupScreen-OrganizationSearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine2']", AI = false)
	private WebElement inpAddress2;

	@IFindBy(how = How.CSS, using = "select[name$='-ProducerStatus']", AI = false)
	private WebElement drpProducerStatus;

	@IFindBy(how = How.CSS, using = "input[name='OrganizationSearchPopup-OrganizationSearchPopupScreen-OrganizationSearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressSummary']", AI = false)
	private WebElement inpAddress;

	@IFindBy(how = How.CSS, using = "input[name='OrganizationSearchPopup-OrganizationSearchPopupScreen-OrganizationSearchDV-AccountNumber']", AI = false)
	private WebElement inpAccount;

	@IFindBy(how = How.CSS, using = "input[name='OrganizationSearchPopup-OrganizationSearchPopupScreen-OrganizationSearchDV-ProducerCode']", AI = false)
	private WebElement inpProducerCode;

	@IFindBy(how = How.CSS, using = "input[name='OrganizationSearchPopup-OrganizationSearchPopupScreen-OrganizationSearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-PostalCode']", AI = false)
	private WebElement inpZIPCode;

	@IFindBy(how = How.CSS, using = "select[name$='-Type']", AI = false)
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

	@IFindBy(how = How.CSS, using = "div[id$='-SearchLinksInputSet-Search']", AI = false)
	private WebElement btnSearch;

	@IFindBy(how = How.CSS, using = "input[name='OrganizationSearchPopup-OrganizationSearchPopupScreen-OrganizationSearchDV-BranchCode']", AI = false)
	private WebElement inpBranchCode;

	@IFindBy(how = How.CSS, using = "select[name='OrganizationSearchPopup-OrganizationSearchPopupScreen-OrganizationSearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-Country']", AI = false)
	private WebElement drpCountry;

	@IFindBy(how = How.CSS, using = "select[name='OrganizationSearchPopup-OrganizationSearchPopupScreen-OrganizationSearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-State']", AI = false)
	private WebElement drpState;

	@IFindBy(how = How.CSS, using = "#OrganizationSearchPopup-OrganizationSearchPopupScreen-OrganizationSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Reset", AI = false)
	private WebElement btnReset;

	@IFindBy(how = How.CSS, using = "div[id$='Select']", AI = false)
	public WebElement btnSelect;

	@IFindBy(how = How.CSS, using = "div[id$='OrganizationSearchPopupScreen-ttlBar']", AI = false)
	public WebElement ttlOrganizationsPage;

	@IFindBy(how = How.CSS, using = "input[name$='Name']", AI = false)
	public WebElement txtOrganisantionName;

	@IFindBy(how = How.CSS, using = "div[id$='OrganizationSearchResultsLV-0-_Select']", AI = false)
	public WebElement btnOrganizationSelect;
	
	@IFindBy(how = How.CSS, using = "div[id$='Name_button']", AI = false)
	public WebElement lblOrganizationName;

	public OrganizationsPage(){
	}

	public OrganizationsPage(WebDriver driver){
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
		BrowserActions.selectDropDownByVisibleText(driver, drpProducerStatus,ProducerStatus,2,"ProducerStatus");
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
		BrowserActions.selectDropDownByVisibleText(driver, drpOrganizationType,OrganizationType,3,"OrganizationType");
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
		BrowserActions.click(driver, btnSearch,true,"Search");
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
	public void clickSelect(WebDriver driver)  {
		BrowserActions.click(driver, btnSelect,2,"Select");
	}
	
	/**
	 * Enter the Organisation  Name
	 * @param driver , organisantionName
	 * @return
	 */
	
	public OrganizationsPage enterOrganisantionName(WebDriver driver, String organisantionName){
		BrowserActions.type(driver, txtOrganisantionName, organisantionName,1, "Organisantion Name");
		return this;
	}
	
	/**
	 * Verify  Organisation  Name
	 * @param driver , organisantionName
	 * @return
	 */
	public OrganizationsPage veriyOrganizationName(WebDriver driver, String organizationName)  {
		String text = BrowserActions.getText(driver, lblOrganizationName,"Organizations name");
		Log.assertThat(text.equals(organizationName), "Based on the search particular record should be displayed", "There is no Record");
		return this;
	}
	
	/**
	 * Click Organization  Name
	 * @param driver , organizantion Name
	 * @return OrganizationNamePage
	 */
	public OrganizationNamePage clickOrganizationName(WebDriver driver)  {
		BrowserActions.click(driver, lblOrganizationName,"Organization Name");
	    return new OrganizationNamePage(driver).get();
	}
	public class OrganizationNamePage extends LoadableComponent<OrganizationNamePage> {

		WebDriver driver;
		private boolean isPageLoaded;
		public ElementLayer elementLayer;
		String elementObject;
		HashMap<String, String> getPageObjects;
		public  List<Object> pageFactoryKey = new ArrayList<Object>();
		public  List<String> pageFactoryValue = new ArrayList<String>();

		@IFindBy(how = How.CSS, using = "#OrganizationDetail-OrganizationDetailScreen-OrganizationDetail_AgencyBillPlansCardTab", AI = false)
		private WebElement btnAgencyBillPlans;

		@IFindBy(how = How.CSS, using = "select[name='OrganizationDetail-OrganizationDetailScreen-OrganizationDetail_BasicDV-GroupDetailInputSet-SecurityZone']", AI = false)
		private WebElement drpSecurityZone;

		@IFindBy(how = How.CSS, using = "input[name='OrganizationDetail-OrganizationDetailScreen-OrganizationDetail_BasicDV-AddressDescription']", AI = false)
		private WebElement inpDescription;

		@IFindBy(how = How.CSS, using = "#OrganizationDetail-OrganizationDetailScreen-OrganizationDetail_UserCardTab", AI = false)
		private WebElement btnUsers;

		@IFindBy(how = How.CSS, using = "input[name='OrganizationDetail-OrganizationDetailScreen-OrganizationDetail_ProducerCodesLV-0-Code']", AI = false)
		private WebElement inpCode;

		@IFindBy(how = How.CSS, using = "#OrganizationDetail-OrganizationDetailScreen-OrganizationDetail_BasicDV-ChangePrimaryContactButton-OtherExistingContact-MoreUser>div[role='menuitem']", AI = false)
		private WebElement btnMore;

		@IFindBy(how = How.CSS, using = "#OrganizationDetail-OrganizationDetailScreen-OrganizationDetail_BasicDV-ChangePrimaryContactButton-NewUser>div[role='menuitem']", AI = false)
		private WebElement btnNewUser;

		@IFindBy(how = How.CSS, using = "#OrganizationDetail-OrganizationDetailScreen-OrganizationDetail_BasicDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-PostalCode-AutoFillIcon", AI = false)
		private WebElement btnAutoFillIcon_3;

		@IFindBy(how = How.CSS, using = "input[name='OrganizationDetail-OrganizationDetailScreen-OrganizationDetail_BasicDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-City']", AI = false)
		private WebElement inpCity;

		@IFindBy(how = How.CSS, using = "input[name='OrganizationDetail-OrganizationDetailScreen-OrganizationUsersLV-0-User']", AI = false)
		private WebElement inpUser;

		@IFindBy(how = How.CSS, using = "input[name='OrganizationDetail-OrganizationDetailScreen-OrganizationDetail_BasicDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-County']", AI = false)
		private WebElement inpCounty;

		@IFindBy(how = How.CSS, using = "#OrganizationDetail-OrganizationDetailScreen-OrganizationDetail_BasicDV-GroupDetailInputSet-Description textarea", AI = false)
		private WebElement inpDescription_4;

		@IFindBy(how = How.CSS, using = "#OrganizationDetail-OrganizationDetailScreen-OrganizationDetail_BasicDV-GroupDetailInputSet-Supervisor-SelectUsers>div[role='menuitem']", AI = false)
		private WebElement btnExistingUsers;

		@IFindBy(how = How.CSS, using = "input[name='OrganizationDetail-OrganizationDetailScreen-OrganizationDetail_BasicDV-WorkPhone-GlobalPhoneInputSet-Extension']", AI = false)
		private WebElement inpPhoneExtension;

		@IFindBy(how = How.CSS, using = "#OrganizationDetail-OrganizationDetailScreen-OrganizationDetail_BasicDV-GroupDetailInputSet-Supervisor-SupervisorMenuIcon>div[role='button']", AI = false)
		private WebElement btnSupervisorMenuIcon;

		@IFindBy(how = How.CSS, using = "#OrganizationDetail-OrganizationDetailScreen-OrganizationDetail_ProducerCodesCardTab", AI = false)
		private WebElement btnProducerCodes;

		@IFindBy(how = How.CSS, using = "#OrganizationDetail-OrganizationDetailScreen-GroupRegionLV_tb-Remove>div[role='button']", AI = false)
		private WebElement btnRemove_10;

		@IFindBy(how = How.CSS, using = "select[name='OrganizationDetail-OrganizationDetailScreen-OrganizationDetail_BasicDV-WorkPhone-GlobalPhoneInputSet-CountryCode']", AI = false)
		private WebElement drpPhoneRegionCode;

		@IFindBy(how = How.CSS, using = "input[name='OrganizationDetail-OrganizationDetailScreen-OrganizationDetail_ProducerCodesLV-0-Desc']", AI = false)
		private WebElement inpDescription_6;

		@IFindBy(how = How.CSS, using = "select[name='OrganizationDetail-OrganizationDetailScreen-OrganizationDetail_BasicDV-Type']", AI = false)
		private WebElement drpType;

		@IFindBy(how = How.CSS, using = "#OrganizationDetail-OrganizationDetailScreen-OrganizationDetail_BasicDV-ChangePrimaryContactButton-NewPerson>div[role='menuitem']", AI = false)
		private WebElement btnNewPerson;

		@IFindBy(how = How.CSS, using = "input[name='OrganizationDetail-OrganizationDetailScreen-OrganizationDetail_ProducerCodesLV-0-PreferredUnderwriter']", AI = false)
		private WebElement inpPreferredUnderwriter;

		@IFindBy(how = How.CSS, using = "#OrganizationDetail-OrganizationDetailScreen-OrganizationDetail_ProducerCodesLV-0-Branch-BranchMenuIcon>div[role='button']", AI = false)
		private WebElement btnBranchMenuIcon;

		@IFindBy(how = How.CSS, using = "input[name='OrganizationDetail-OrganizationDetailScreen-OrganizationDetail_BasicDV-WorkPhone-GlobalPhoneInputSet-NationalSubscriberNumber']", AI = false)
		private WebElement inpPhone;

		@IFindBy(how = How.CSS, using = "#OrganizationDetail-OrganizationDetailScreen-OrganizationDetail_BasicDV-ChangePrimaryContactButton-ChangePrimaryContactButtonMenuIcon>div[role='button']", AI = false)
		private WebElement btnChangePrimaryContactButtonMenuIcon;

		@IFindBy(how = How.CSS, using = "#OrganizationDetail-OrganizationDetailScreen-GroupQueuesLV_tb-Remove>div[role='button']", AI = false)
		private WebElement btnRemove_8;

		@IFindBy(how = How.CSS, using = "#OrganizationDetail-OrganizationDetailScreen-ttlBar", AI = false)
		private WebElement lblTtlBar;

		@IFindBy(how = How.CSS, using = "#OrganizationDetail-OrganizationDetailScreen-Edit>div[role='button']", AI = false)
		private WebElement btnEdit;

		@IFindBy(how = How.CSS, using = "input[name='OrganizationDetail-OrganizationDetailScreen-OrganizationDetail_BasicDV-ChangePrimaryContactButton']", AI = false)
		private WebElement inpPrimaryContact_1;

		@IFindBy(how = How.CSS, using = "#OrganizationDetail-OrganizationDetailScreen-Update>div[role='button']", AI = false)
		private WebElement btnUpdate;

		@IFindBy(how = How.CSS, using = "input[name='OrganizationDetail-OrganizationDetailScreen-OrganizationDetail_BasicDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine3']", AI = false)
		private WebElement inpAddress3;

		@IFindBy(how = How.CSS, using = "input[name='OrganizationDetail-OrganizationDetailScreen-OrganizationDetail_BasicDV-GlobalContactNameInputSet-Name']", AI = false)
		private WebElement inpOrganizationName;

		@IFindBy(how = How.CSS, using = "#OrganizationDetail-OrganizationDetailScreen-OrganizationUsersLV-0-User-UserBrowseMenuItem", AI = false)
		private WebElement btnSelectUser_5;

		@IFindBy(how = How.CSS, using = "input[name='OrganizationDetail-OrganizationDetailScreen-OrganizationDetail_BasicDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine1']", AI = false)
		private WebElement inpAddress1;

		@IFindBy(how = How.CSS, using = "select[name='OrganizationDetail-OrganizationDetailScreen-OrganizationDetail_BasicDV-AddressType']", AI = false)
		private WebElement drpAddressType;

		@IFindBy(how = How.CSS, using = "input[name='OrganizationDetail-OrganizationDetailScreen-OrganizationDetail_BasicDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine2']", AI = false)
		private WebElement inpAddress2;

		@IFindBy(how = How.CSS, using = "#OrganizationDetail-OrganizationDetailScreen-OrganizationDetail_ProducerCodesLV-0-PreferredUnderwriter-UserBrowseMenuItem", AI = false)
		private WebElement btnSelectUser_7;

		@IFindBy(how = How.CSS, using = "#OrganizationDetail-OrganizationDetailScreen-OrganizationDetail_BasicDV-ChangePrimaryContactButton-OtherExistingContact>div[role='menuitem']", AI = false)
		private WebElement btnExistingContact;

		@IFindBy(how = How.CSS, using = "input[name='OrganizationDetail-OrganizationDetailScreen-OrganizationDetail_BasicDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressSummary']", AI = false)
		private WebElement inpAddress;

		@IFindBy(how = How.CSS, using = "#OrganizationDetail-OrganizationDetailScreen-OrganizationDetailScreen_BasicCard_DeleteButton>div[role='button']", AI = false)
		private WebElement btnDelete;

		@IFindBy(how = How.CSS, using = "#OrganizationDetail-OrganizationDetailScreen-OrganizationDetail_ProducerCodesLV-0-Branch-GroupSearchMenuIcon>div[role='menuitem']", AI = false)
		private WebElement btnSearchforGroup;

		@IFindBy(how = How.CSS, using = "#OrganizationDetail-OrganizationDetailScreen-OrganizationDetail_BasicCardTab", AI = false)
		private WebElement btnBasics;

		@IFindBy(how = How.CSS, using = "#OrganizationDetail-OrganizationDetailScreen-OrganizationDetail_RegionsCardTab", AI = false)
		private WebElement btnRegions;

		@IFindBy(how = How.CSS, using = "input[name='OrganizationDetail-OrganizationDetailScreen-OrganizationDetail_BasicDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-PostalCode']", AI = false)
		private WebElement inpZIPCode;

		@IFindBy(how = How.CSS, using = "#OrganizationDetail-OrganizationDetailScreen-OrganizationDetail_BasicDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-City-AutoFillIcon", AI = false)
		private WebElement btnAutoFillIcon;

		@IFindBy(how = How.CSS, using = "#OrganizationDetail-OrganizationDetailScreen-AgencyBillPlanToolbar-RemoveAgencyBillPlanButton>div[role='button']", AI = false)
		private WebElement btnRemove;

		@IFindBy(how = How.CSS, using = "select[name='OrganizationDetail-OrganizationDetailScreen-OrganizationDetail_ProducerCodesLV-0-Status']", AI = false)
		private WebElement drpStatus;

		@IFindBy(how = How.CSS, using = "#OrganizationDetail-OrganizationDetailScreen-OrganizationDetail_BasicDV-ChangePrimaryContactButton-NewCompany>div[role='menuitem']", AI = false)
		private WebElement btnNewCompany;

		@IFindBy(how = How.CSS, using = "#OrganizationDetail-OrganizationDetailScreen-GroupRegionLV_tb-Add>div[role='button']", AI = false)
		private WebElement btnAdd_9;

		@IFindBy(how = How.CSS, using = "input[name='OrganizationDetail-OrganizationDetailScreen-OrganizationDetail_BasicDV-ContactName']", AI = false)
		private WebElement inpName;

		@IFindBy(how = How.CSS, using = "input[name='OrganizationDetail-OrganizationDetailScreen-OrganizationDetail_BasicDV-GroupDetailInputSet-BranchCode']", AI = false)
		private WebElement inpBranchCode;

		@IFindBy(how = How.CSS, using = "select[name='OrganizationDetail-OrganizationDetailScreen-OrganizationDetail_BasicDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-Country']", AI = false)
		private WebElement drpCountry;

		@IFindBy(how = How.CSS, using = "#OrganizationDetail-OrganizationDetailScreen-OrganizationDetail_BasicDV-GroupDetailInputSet-Supervisor-UserBrowseMenuItem>div[role='menuitem']", AI = false)
		private WebElement btnSelectUser;

		@IFindBy(how = How.CSS, using = "select[name='OrganizationDetail-OrganizationDetailScreen-OrganizationDetail_BasicDV-Tier']", AI = false)
		private WebElement drpTier;

		@IFindBy(how = How.CSS, using = "select[name='OrganizationDetail-OrganizationDetailScreen-OrganizationDetail_BasicDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-State']", AI = false)
		private WebElement drpState;

		@IFindBy(how = How.CSS, using = "input[name='OrganizationDetail-OrganizationDetailScreen-OrganizationDetail_BasicDV-PrimaryContactLabel']", AI = false)
		private WebElement inpPrimaryContact;

		@IFindBy(how = How.CSS, using = "#OrganizationDetail-OrganizationDetailScreen-OrganizationDetail_ProducerCodesLV-0-Branch-GroupPickerMenuIcon>div[role='menuitem']", AI = false)
		private WebElement btnSelectGroup;

		@IFindBy(how = How.CSS, using = "#OrganizationDetail-OrganizationDetailScreen-Cancel>div[role='button']", AI = false)
		private WebElement btnCancel;

		@IFindBy(how = How.CSS, using = "input[name='OrganizationDetail-OrganizationDetailScreen-OrganizationDetail_BasicDV-WorkPhone-GlobalPhoneInputSet-PhoneDisplay']", AI = false)
		private WebElement inpPhone_2;

		@IFindBy(how = How.CSS, using = "input[name='OrganizationDetail-OrganizationDetailScreen-OrganizationDetail_BasicDV-GroupDetailInputSet-LoadFactor']", AI = false)
		private WebElement inpLoadFactor;

		@IFindBy(how = How.CSS, using = "#OrganizationDetail-OrganizationDetailScreen-GroupQueuesLV_tb-Add>div[role='button']", AI = false)
		private WebElement btnAdd;

		@IFindBy(how = How.CSS, using = "select[name='OrganizationDetail-OrganizationDetailScreen-OrganizationDetail_BasicDV-AgencyBillPlan']", AI = false)
		private WebElement drpAgencyBillPlan;

		@IFindBy(how = How.CSS, using = "input[name='OrganizationDetail-OrganizationDetailScreen-OrganizationDetail_BasicDV-GroupDetailInputSet-Supervisor']", AI = false)
		private WebElement inpSupervisor;

		@IFindBy(how = How.CSS, using = "select[name='OrganizationDetail-OrganizationDetailScreen-OrganizationDetail_BasicDV-ProducerStatus']", AI = false)
		private WebElement drpAgencyStatus;

		@IFindBy(how = How.CSS, using = "#OrganizationDetail-OrganizationDetailScreen-OrganizationDetail_QueuesCardTab", AI = false)
		private WebElement btnQueues;
		
		@IFindBy(how = How.CSS, using = "div[id$='-Name']", AI = false)
		private WebElement lblOragnizationName;
		
		@IFindBy(how = How.CSS, using = "div[id$='-Type']", AI = false)
		private WebElement lblType;
		
		@IFindBy(how = How.CSS, using = "div[id$='-ProducerStatus']", AI = false)
		private WebElement lblProducerStatus;
		
		@IFindBy(how = How.CSS, using = "div[id$='-PrimaryContactLabel_Input']", AI = false)
		private WebElement lblPrimaryContact;
		
		@IFindBy(how = How.XPATH, using = "//div[text()='Assignment Rules']", AI = false)
		private WebElement lblAssignmentRules;
		
		@IFindBy(how = How.XPATH, using = "//div[text()='Group']", AI = false)
		private WebElement lblGroup;
		
		@IFindBy(how = How.CSS, using = "div[id$='UserHeader_inner']", AI = false)
		private WebElement lblUsers;
		
		@IFindBy(how = How.CSS, using = "div[id$='CodeHeader_inner']", AI = false)
		private WebElement lblCode;
		
		@IFindBy(how = How.CSS, using = "div[id$='DescHeader_inner']", AI = false)
		private WebElement lblDescription;
		
		@IFindBy(how = How.CSS, using = "div[id$='StatusHeader_inner']", AI = false)
		private WebElement lblStatus;
		
		@IFindBy(how = How.CSS, using = "div[id$='BranchHeader_inner']", AI = false)
		private WebElement lblBranch;
		
		@IFindBy(how = How.CSS, using = "div[id$='PreferredUnderwriterHeader_inner']", AI = false)
		private WebElement lblPreferredUnderwriter;
		
		@IFindBy(how = How.CSS, using = "div[id$='NameHeader_inner']", AI = false)
		private WebElement lblName;
		
		@IFindBy(how = How.CSS, using = "div[id$='SubGroupVisibleHeader_inner']", AI = false)
		private WebElement lblVisibleInSubGroups;
		
		@IFindBy(how = How.CSS, using = "div[id$='ZonesHeader_inner']", AI = false)
		private WebElement lblAreasCovered;
		
		@IFindBy(how = How.CSS, using = "div[id$='ProducerStatus']", AI = false)
		private WebElement lblAgencyStatus;

		public OrganizationNamePage(){
		}

		public OrganizationNamePage(WebDriver driver){
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
		}public OrganizationNamePage clickAgencyBillPlans(WebDriver driver)  {
			BrowserActions.click(driver, btnAgencyBillPlans,"AgencyBillPlans");
			return this;
		}
		public OrganizationNamePage selectSecurityZone(WebDriver driver,String SecurityZone)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpSecurityZone,SecurityZone,"SecurityZone");
			return this;
		}
		public OrganizationNamePage enterDescription(WebDriver driver,String Description) {
			BrowserActions.type(driver, inpDescription,Description, "Description");
			return this;
		}
		public OrganizationNamePage clickUsers(WebDriver driver)  {
			BrowserActions.click(driver, btnUsers,"Users");
			return this;
		}
		public OrganizationNamePage enterCode(WebDriver driver,String Code) {
			BrowserActions.type(driver, inpCode,Code, "Code");
			return this;
		}
		public OrganizationNamePage clickMore(WebDriver driver)  {
			BrowserActions.click(driver, btnMore,"More");
			return this;
		}
		public OrganizationNamePage clickNewUser(WebDriver driver)  {
			BrowserActions.click(driver, btnNewUser,"NewUser");
			return this;
		}
		public OrganizationNamePage clickAutoFillIcon_3(WebDriver driver)  {
			BrowserActions.click(driver, btnAutoFillIcon_3,"AutoFillIcon_3");
			return this;
		}
		public OrganizationNamePage enterCity(WebDriver driver,String City) {
			BrowserActions.type(driver, inpCity,City, "City");
			return this;
		}
		public OrganizationNamePage enterUser(WebDriver driver,String User) {
			BrowserActions.type(driver, inpUser,User, "User");
			return this;
		}
		public OrganizationNamePage enterCounty(WebDriver driver,String County) {
			BrowserActions.type(driver, inpCounty,County, "County");
			return this;
		}
		public OrganizationNamePage enterDescription_4(WebDriver driver,String Description_4) {
			BrowserActions.type(driver, inpDescription_4,Description_4, "Description_4");
			return this;
		}
		public OrganizationNamePage clickExistingUsers(WebDriver driver)  {
			BrowserActions.click(driver, btnExistingUsers,"ExistingUsers");
			return this;
		}
		public OrganizationNamePage enterPhoneExtension(WebDriver driver,String PhoneExtension) {
			BrowserActions.type(driver, inpPhoneExtension,PhoneExtension, "PhoneExtension");
			return this;
		}
		public OrganizationNamePage clickSupervisorMenuIcon(WebDriver driver)  {
			BrowserActions.click(driver, btnSupervisorMenuIcon,"SupervisorMenuIcon");
			return this;
		}
		public OrganizationNamePage clickProducerCodes(WebDriver driver)  {
			BrowserActions.click(driver, btnProducerCodes,"ProducerCodes");
			return this;
		}
		public OrganizationNamePage clickRemove_10(WebDriver driver)  {
			BrowserActions.click(driver, btnRemove_10,"Remove_10");
			return this;
		}
		public OrganizationNamePage selectPhoneRegionCode(WebDriver driver,String PhoneRegionCode)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpPhoneRegionCode,PhoneRegionCode,"PhoneRegionCode");
			return this;
		}
		public OrganizationNamePage enterDescription_6(WebDriver driver,String Description_6) {
			BrowserActions.type(driver, inpDescription_6,Description_6, "Description_6");
			return this;
		}
		public OrganizationNamePage selectType(WebDriver driver,String Type)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpType,Type,"Type");
			return this;
		}
		public OrganizationNamePage clickNewPerson(WebDriver driver)  {
			BrowserActions.click(driver, btnNewPerson,"NewPerson");
			return this;
		}
		public OrganizationNamePage enterPreferredUnderwriter(WebDriver driver,String PreferredUnderwriter) {
			BrowserActions.type(driver, inpPreferredUnderwriter,PreferredUnderwriter, "PreferredUnderwriter");
			return this;
		}
		public OrganizationNamePage clickBranchMenuIcon(WebDriver driver)  {
			BrowserActions.click(driver, btnBranchMenuIcon,"BranchMenuIcon");
			return this;
		}
		public OrganizationNamePage enterPhone(WebDriver driver,String Phone) {
			BrowserActions.type(driver, inpPhone,Phone, "Phone");
			return this;
		}
		public OrganizationNamePage clickChangePrimaryContactButtonMenuIcon(WebDriver driver)  {
			BrowserActions.click(driver, btnChangePrimaryContactButtonMenuIcon,"ChangePrimaryContactButtonMenuIcon");
			return this;
		}
		public OrganizationNamePage clickRemove_8(WebDriver driver)  {
			BrowserActions.click(driver, btnRemove_8,"Remove_8");
			return this;
		}
		public OrganizationNamePage clickEdit(WebDriver driver)  {
			BrowserActions.click(driver, btnEdit,"Edit");
			return this;
		}
		public OrganizationNamePage enterPrimaryContact_1(WebDriver driver,String PrimaryContact_1) {
			BrowserActions.type(driver, inpPrimaryContact_1,PrimaryContact_1, "PrimaryContact_1");
			return this;
		}
		public OrganizationNamePage clickUpdate(WebDriver driver)  {
			BrowserActions.click(driver, btnUpdate,"Update");
			return this;
		}
		public OrganizationNamePage enterAddress3(WebDriver driver,String Address3) {
			BrowserActions.type(driver, inpAddress3,Address3, "Address3");
			return this;
		}
		public OrganizationNamePage enterOrganizationName(WebDriver driver,String OrganizationName) {
			BrowserActions.type(driver, inpOrganizationName,OrganizationName, "OrganizationName");
			return this;
		}
		public OrganizationNamePage clickSelectUser_5(WebDriver driver)  {
			BrowserActions.click(driver, btnSelectUser_5,"SelectUser_5");
			return this;
		}
		public OrganizationNamePage enterAddress1(WebDriver driver,String Address1) {
			BrowserActions.type(driver, inpAddress1,Address1, "Address1");
			return this;
		}
		public OrganizationNamePage selectAddressType(WebDriver driver,String AddressType)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpAddressType,AddressType,"AddressType");
			return this;
		}
		public OrganizationNamePage enterAddress2(WebDriver driver,String Address2) {
			BrowserActions.type(driver, inpAddress2,Address2, "Address2");
			return this;
		}
		public OrganizationNamePage clickSelectUser_7(WebDriver driver)  {
			BrowserActions.click(driver, btnSelectUser_7,"SelectUser_7");
			return this;
		}
		public OrganizationNamePage clickExistingContact(WebDriver driver)  {
			BrowserActions.click(driver, btnExistingContact,"ExistingContact");
			return this;
		}
		public OrganizationNamePage enterAddress(WebDriver driver,String Address) {
			BrowserActions.type(driver, inpAddress,Address, "Address");
			return this;
		}
		public OrganizationNamePage clickDelete(WebDriver driver)  {
			BrowserActions.click(driver, btnDelete,"Delete");
			return this;
		}
		public OrganizationNamePage clickSearchforGroup(WebDriver driver)  {
			BrowserActions.click(driver, btnSearchforGroup,"SearchforGroup");
			return this;
		}
		public OrganizationNamePage clickBasics(WebDriver driver)  {
			BrowserActions.click(driver, btnBasics,"Basics");
			return this;
		}
		public OrganizationNamePage clickRegions(WebDriver driver)  {
			BrowserActions.click(driver, btnRegions,"Regions");
			return this;
		}
		public OrganizationNamePage enterZIPCode(WebDriver driver,String ZIPCode) {
			BrowserActions.type(driver, inpZIPCode,ZIPCode, "ZIPCode");
			return this;
		}
		public OrganizationNamePage clickAutoFillIcon(WebDriver driver)  {
			BrowserActions.click(driver, btnAutoFillIcon,"AutoFillIcon");
			return this;
		}
		public OrganizationNamePage clickRemove(WebDriver driver)  {
			BrowserActions.click(driver, btnRemove,"Remove");
			return this;
		}
		public OrganizationNamePage selectStatus(WebDriver driver,String Status)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpStatus,Status,"Status");
			return this;
		}
		public OrganizationNamePage clickNewCompany(WebDriver driver)  {
			BrowserActions.click(driver, btnNewCompany,"NewCompany");
			return this;
		}
		public OrganizationNamePage clickAdd_9(WebDriver driver)  {
			BrowserActions.click(driver, btnAdd_9,"Add_9");
			return this;
		}
		public OrganizationNamePage enterName(WebDriver driver,String Name) {
			BrowserActions.type(driver, inpName,Name, "Name");
			return this;
		}
		public OrganizationNamePage enterBranchCode(WebDriver driver,String BranchCode) {
			BrowserActions.type(driver, inpBranchCode,BranchCode, "BranchCode");
			return this;
		}
		public OrganizationNamePage selectCountry(WebDriver driver,String Country)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpCountry,Country,"Country");
			return this;
		}
		public OrganizationNamePage clickSelectUser(WebDriver driver)  {
			BrowserActions.click(driver, btnSelectUser,"SelectUser");
			return this;
		}
		public OrganizationNamePage selectTier(WebDriver driver,String Tier)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpTier,Tier,"Tier");
			return this;
		}
		public OrganizationNamePage selectState(WebDriver driver,String State)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpState,State,"State");
			return this;
		}
		public OrganizationNamePage enterPrimaryContact(WebDriver driver,String PrimaryContact) {
			BrowserActions.type(driver, inpPrimaryContact,PrimaryContact, "PrimaryContact");
			return this;
		}
		public OrganizationNamePage clickSelectGroup(WebDriver driver)  {
			BrowserActions.click(driver, btnSelectGroup,"SelectGroup");
			return this;
		}
		public OrganizationNamePage clickCancel(WebDriver driver)  {
			BrowserActions.click(driver, btnCancel,"Cancel");
			return this;
		}
		public OrganizationNamePage enterPhone_2(WebDriver driver,String Phone_2) {
			BrowserActions.type(driver, inpPhone_2,Phone_2, "Phone_2");
			return this;
		}
		public OrganizationNamePage enterLoadFactor(WebDriver driver,String LoadFactor) {
			BrowserActions.type(driver, inpLoadFactor,LoadFactor, "LoadFactor");
			return this;
		}
		public OrganizationNamePage clickAdd(WebDriver driver)  {
			BrowserActions.click(driver, btnAdd,"Add");
			return this;
		}
		public OrganizationNamePage selectAgencyBillPlan(WebDriver driver,String AgencyBillPlan)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpAgencyBillPlan,AgencyBillPlan,"AgencyBillPlan");
			return this;
		}
		public OrganizationNamePage enterSupervisor(WebDriver driver,String Supervisor) {
			BrowserActions.type(driver, inpSupervisor,Supervisor, "Supervisor");
			return this;
		}
		public OrganizationNamePage selectAgencyStatus(WebDriver driver,String AgencyStatus)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpAgencyStatus,AgencyStatus,"AgencyStatus");
			return this;
		}
		public OrganizationNamePage clickQueues(WebDriver driver)  {
			BrowserActions.click(driver, btnQueues,"Queues");
			return this;
		}
		public OrganizationNamePage verifyBasicsIsDisplayed(WebDriver driver)  {
			BrowserActions.verifyElementDisplayed(driver, btnBasics,"Basics Tab");
			return this;
		}
		public OrganizationNamePage verifyUsersIsDisplayed(WebDriver driver)  {
			BrowserActions.verifyElementDisplayed(driver, btnUsers,"Users Tab");
			return this;
		}
		public OrganizationNamePage verifyProducerCodeIsDisplayed(WebDriver driver)  {
			BrowserActions.verifyElementDisplayed(driver, btnProducerCodes,"Producer Tab");
			return this;
		}
		public OrganizationNamePage verifyQueuesIsDisplayed(WebDriver driver)  {
			BrowserActions.verifyElementDisplayed(driver, btnQueues,"Queues Tab");
			return this;
		}
		public OrganizationNamePage verifyRegionsIsDisplayed(WebDriver driver)  {
			BrowserActions.verifyElementDisplayed(driver, btnRegions,"Regions Tab");
			return this;
		}
		public OrganizationNamePage verifyOrganizationNameIsDisplayed(WebDriver driver)  {
			BrowserActions.verifyElementDisplayed(driver, lblOragnizationName,"Organization Name");
			return this;
		}
		public OrganizationNamePage verifyTypeIsDisplayed(WebDriver driver)  {
			BrowserActions.verifyElementDisplayed(driver, lblType,"Type");
			return this;
		}
		public OrganizationNamePage verifyAgencyStatusIsDisplayed(WebDriver driver)  {
			BrowserActions.verifyElementDisplayed(driver, lblAgencyStatus,"Agency Status");
			return this;
		}
		public OrganizationNamePage verifyGroupIsDisplayed(WebDriver driver)  {
			BrowserActions.verifyElementDisplayed(driver, lblGroup,"Group");
			return this;
		}
		public OrganizationNamePage verifyAssignmentRuleIsDisplayed(WebDriver driver)  {
			BrowserActions.verifyElementDisplayed(driver, lblAssignmentRules,"Assignment Rules");
			return this;
		}
		public OrganizationNamePage verifyCodeIsDisplayed(WebDriver driver)  {
			BrowserActions.verifyElementDisplayed(driver, lblCode,"Code");
			return this;
		}
		public OrganizationNamePage verifyDescriptionIsDisplayed(WebDriver driver)  {
			BrowserActions.verifyElementDisplayed(driver, lblDescription,"Description");
			return this;
		}
		public OrganizationNamePage verifyStatusIsDisplayed(WebDriver driver)  {
			BrowserActions.verifyElementDisplayed(driver, lblStatus,"Status");
			return this;
		}
		public OrganizationNamePage verifyPreferredUnderwriterIsDisplayed(WebDriver driver)  {
			BrowserActions.verifyElementDisplayed(driver, lblPreferredUnderwriter,"PreferredUnderwriter");
			return this;
		}
		public OrganizationNamePage verifyBranchIsDisplayed(WebDriver driver)  {
			BrowserActions.verifyElementDisplayed(driver, lblBranch,"Branch");
			return this;
		}
		public OrganizationNamePage verifyUserIsDisplayed(WebDriver driver)  {
			BrowserActions.verifyElementDisplayed(driver, lblUsers,"Users");
			return this;
		}
		public OrganizationNamePage verifyNameIsDisplayed(WebDriver driver)  {
			BrowserActions.verifyElementDisplayed(driver, lblName,"Name");
			return this;
		}
		public OrganizationNamePage verifyVisibleInSubGroupIsDisplayed(WebDriver driver)  {
			BrowserActions.verifyElementDisplayed(driver, lblVisibleInSubGroups,"Visible in sub group");
			return this;
		}
		public OrganizationNamePage verifyAreasCoveredIsDisplayed(WebDriver driver)  {
			BrowserActions.verifyElementDisplayed(driver, lblAreasCovered,"Areas Covered");
			return this;
		}
		public OrganizationNamePage verifyEditButtonIsDisplayed(WebDriver driver)  {
			BrowserActions.verifyElementDisplayed(driver, btnEdit,"Edit Button");
			return this;
		}
	}
}

