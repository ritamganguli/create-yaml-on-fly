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

public class SearchProducerCodes extends LoadableComponent<SearchProducerCodes> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	@IFindBy(how = How.CSS, using = "input[name='ProducerCodeSearch-ProducerCodeSearchScreen-ProducerCodeSearchDV-Organization']", AI = false)
	public WebElement inpOrganization;

	@IFindBy(how = How.CSS, using = "input[name='ProducerCodeSearch-ProducerCodeSearchScreen-ProducerCodeSearchDV-Code']", AI = false)
	public WebElement inpProducerCode;

	@IFindBy(how = How.CSS, using = "#ProducerCodeSearch-ProducerCodeSearchScreen-ProducerCodeSearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-PostalCode-AutoFillIcon", AI = false)
	public WebElement btnAutoFillIcon_2;

	@IFindBy(how = How.CSS, using = "input[name='ProducerCodeSearch-ProducerCodeSearchScreen-ProducerCodeSearchDV-User']", AI = false)
	public WebElement inpAvailabletoUser;

	@IFindBy(how = How.CSS, using = "input[name='ProducerCodeSearch-ProducerCodeSearchScreen-ProducerCodeSearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-County']", AI = false)
	public WebElement inpCounty;

	@IFindBy(how = How.CSS, using = "input[name='ProducerCodeSearch-ProducerCodeSearchScreen-ProducerCodeSearchDV-ParentCode']", AI = false)
	public WebElement inpParentProducerCode;

	@IFindBy(how = How.CSS, using = "input[name='ProducerCodeSearch-ProducerCodeSearchScreen-ProducerCodeSearchDV-PrefUW']", AI = false)
	public WebElement inpPreferredUnderwriter;

	@IFindBy(how = How.CSS, using = "select[name='ProducerCodeSearch-ProducerCodeSearchScreen-ProducerCodeSearchDV-BranchCode']", AI = false)
	public WebElement drpBranchCode;

	@IFindBy(how = How.CSS, using = "input[name='ProducerCodeSearch-ProducerCodeSearchScreen-ProducerCodeSearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine3']", AI = false)
	public WebElement inpAddress3;

	@IFindBy(how = How.CSS, using = "input[name='ProducerCodeSearch-ProducerCodeSearchScreen-ProducerCodeSearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine1']", AI = false)
	public WebElement inpAddress1;

	@IFindBy(how = How.CSS, using = "input[name='ProducerCodeSearch-ProducerCodeSearchScreen-ProducerCodeSearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine2']", AI = false)
	public WebElement inpAddress2;

	@IFindBy(how = How.CSS, using = "input[name='ProducerCodeSearch-ProducerCodeSearchScreen-ProducerCodeSearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressSummary']", AI = false)
	public WebElement inpAddress;

	@IFindBy(how = How.CSS, using = "input[name='ProducerCodeSearch-ProducerCodeSearchScreen-ProducerCodeSearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-PostalCode']", AI = false)
	public WebElement inpZIPCode;

	@IFindBy(how = How.CSS, using = "#ProducerCodeSearch-ProducerCodeSearchScreen-ProducerCodeSearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-City-AutoFillIcon", AI = false)
	public WebElement btnAutoFillIcon;

	@IFindBy(how = How.CSS, using = "#ProducerCodeSearch-ProducerCodeSearchScreen-ProducerCodeSearchDV-User-UserBrowseMenuItem", AI = false)
	public WebElement btnSelectUser;

	@IFindBy(how = How.CSS, using = "select[name='ProducerCodeSearch-ProducerCodeSearchScreen-ProducerCodeSearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-Country']", AI = false)
	public WebElement drpCountry;

	@IFindBy(how = How.CSS, using = "select[name='ProducerCodeSearch-ProducerCodeSearchScreen-ProducerCodeSearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-State']", AI = false)
	public WebElement drpState;

	@IFindBy(how = How.CSS, using = "#ProducerCodeSearch-ProducerCodeSearchScreen-ProducerCodeSearchDV-Organization-SelectOrganization", AI = false)
	public WebElement btnSelectOrganization;

	@IFindBy(how = How.CSS, using = "input[name='ProducerCodeSearch-ProducerCodeSearchScreen-ProducerCodeSearchDV-Description']", AI = false)
	public WebElement inpDescription;

	@IFindBy(how = How.CSS, using = "input[name='ProducerCodeSearch-ProducerCodeSearchScreen-ProducerCodeSearchDV-AddressOwnerAddressInputSet-globalAddressContainer-GlobalAddressInputSet-City']", AI = false)
	public WebElement inpCity;

	@IFindBy(how = How.CSS, using = "#ProducerCodeSearch-ProducerCodeSearchScreen-ProducerCodeSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Search", AI = false)
	public WebElement btnSearch;

	@IFindBy(how = How.CSS, using = "input[name='ProducerCodeSearch-ProducerCodeSearchScreen-ProducerCodeSearchDV-MissingPrefUW']", AI = false)
	public WebElement chkMissingPrefUW;

	@IFindBy(how = How.CSS, using = "#ProducerCodeSearch-ProducerCodeSearchScreen-ProducerCodeSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Reset", AI = false)
	public WebElement btnReset;

	@IFindBy(how = How.CSS, using = "#ProducerCodeSearch-ProducerCodeSearchScreen-ProducerCodeSearchLV_tb-PrintMe>div[role='button']", AI = false)
	public WebElement btnPrintExport;

	@IFindBy(how = How.CSS, using = "#ProducerCodeSearch-ProducerCodeSearchScreen-ttlBar", AI = false)
	public WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "#ProducerCodeSearch-ProducerCodeSearchScreen-ProducerCodeSearchDV-PrefUW-UserBrowseMenuItem", AI = false)
	public WebElement btnSelectUser_UnderWriter;

	@IFindBy(how = How.CSS, using = "select[name='ProducerCodeSearch-ProducerCodeSearchScreen-ProducerCodeSearchDV-Status']", AI = false)
	public WebElement drpStatus;

	@IFindBy(how = How.CSS, using = "select[name='ProducerCodeSearch-ProducerCodeSearchScreen-ProducerCodeSearchDV-Currency']", AI = false)
	public WebElement drpCurrency;

	@IFindBy(how = How.CSS, using = "div[id$='ProducerCodeSearchLV-0-Code_button']", AI = false)
	public WebElement lnkProducerCode;

	public SearchProducerCodes(){
	}

	public SearchProducerCodes(WebDriver driver){
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
		}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, inpOrganization))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);
	}public SearchProducerCodes enterOrganization(WebDriver driver,String Organization) {
		BrowserActions.type(driver, inpOrganization,Organization, "Organization");
		return this;
	}
	public SearchProducerCodes enterProducerCode(WebDriver driver,String ProducerCode) {
		BrowserActions.type(driver, inpProducerCode,ProducerCode, "ProducerCode");
		return this;
	}
	public SearchProducerCodes clickAutoFillIcon_2(WebDriver driver)  {
		BrowserActions.click(driver, btnAutoFillIcon_2,"AutoFillIcon_2");
		return this;
	}
	public SearchProducerCodes enterAvailabletoUser(WebDriver driver,String AvailabletoUser) {
		BrowserActions.type(driver, inpAvailabletoUser,AvailabletoUser, "AvailabletoUser");
		return this;
	}
	public SearchProducerCodes enterCounty(WebDriver driver,String County) {
		BrowserActions.type(driver, inpCounty,County, "County");
		return this;
	}
	public SearchProducerCodes enterParentProducerCode(WebDriver driver,String ParentProducerCode) {
		BrowserActions.type(driver, inpParentProducerCode,ParentProducerCode, "ParentProducerCode");
		return this;
	}
	public SearchProducerCodes enterPreferredUnderwriter(WebDriver driver,String PreferredUnderwriter) {
		BrowserActions.type(driver, inpPreferredUnderwriter,PreferredUnderwriter, "PreferredUnderwriter");
		return this;
	}
	public SearchProducerCodes selectBranchCode(WebDriver driver,String BranchCode)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpBranchCode,BranchCode,"BranchCode");
		return this;
	}
	public SearchProducerCodes enterAddress3(WebDriver driver,String Address3) {
		BrowserActions.type(driver, inpAddress3,Address3, "Address3");
		return this;
	}
	public SearchProducerCodes enterAddress1(WebDriver driver,String Address1) {
		BrowserActions.type(driver, inpAddress1,Address1, "Address1");
		return this;
	}
	public SearchProducerCodes enterAddress2(WebDriver driver,String Address2) {
		BrowserActions.type(driver, inpAddress2,Address2, "Address2");
		return this;
	}
	public SearchProducerCodes enterAddress(WebDriver driver,String Address) {
		BrowserActions.type(driver, inpAddress,Address, "Address");
		return this;
	}
	public SearchProducerCodes enterZIPCode(WebDriver driver,String ZIPCode) {
		BrowserActions.type(driver, inpZIPCode,ZIPCode, "ZIPCode");
		return this;
	}
	public SearchProducerCodes clickAutoFillIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnAutoFillIcon,"AutoFillIcon");
		return this;
	}
	public SearchProducerCodes clickSelectUser(WebDriver driver)  {
		BrowserActions.click(driver, btnSelectUser,"SelectUser");
		return this;
	}
	public SearchProducerCodes selectCountry(WebDriver driver,String Country)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCountry,Country,"Country");
		return this;
	}
	public SearchProducerCodes selectState(WebDriver driver,String State)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpState,State,"State");
		return this;
	}
	public SearchProducerCodes clickSelectOrganization(WebDriver driver)  {
		BrowserActions.click(driver, btnSelectOrganization,"SelectOrganization");
		return this;
	}
	public SearchProducerCodes enterDescription(WebDriver driver,String Description) {
		BrowserActions.type(driver, inpDescription,Description, "Description");
		return this;
	}
	public SearchProducerCodes enterCity(WebDriver driver,String City) {
		BrowserActions.type(driver, inpCity,City, "City");
		return this;
	}
	public SearchProducerCodes clickSearch(WebDriver driver)  {
		BrowserActions.click(driver, btnSearch,"Search");
		return this;
	}
	public SearchProducerCodes clickMissingPrefUW(WebDriver driver)  {
		BrowserActions.click(driver, chkMissingPrefUW,"MissingPrefUW");
		return this;
	}
	public SearchProducerCodes clickReset(WebDriver driver)  {
		BrowserActions.click(driver, btnReset,"Reset");
		return this;
	}
	public SearchProducerCodes clickPrintExport(WebDriver driver)  {
		BrowserActions.click(driver, btnPrintExport,"PrintExport");
		return this;
	}
	public SearchProducerCodes clickSelectUser_UnderWriter(WebDriver driver)  {
		BrowserActions.click(driver, btnSelectUser_UnderWriter,"Select underwriter");
		return this;
	}
	public SearchProducerCodes selectStatus(WebDriver driver,String Status)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpStatus,Status,"Status");
		return this;
	}
	public SearchProducerCodes selectCurrency(WebDriver driver,String Currency)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpCurrency,Currency,"Currency");
		return this;
	}
	public SearchProducerCodes clickProducerCodeFromSearchResults(WebDriver driver)  {
		BrowserActions.click(driver, lnkProducerCode,"Producer Code");
		return this;
	}
	public class SearchUserPage extends LoadableComponent<SearchUserPage> {

		WebDriver driver;
		private boolean isPageLoaded;
		public ElementLayer elementLayer;
		String elementObject;
		HashMap<String, String> getPageObjects;
		public List<Object> pageFactoryKey = new ArrayList<Object>();
		public List<String> pageFactoryValue = new ArrayList<String>();

		@IFindBy(how = How.CSS, using = "div[id$='UserSearchPopup-UserSearchPopupScreen-ttlBar']", AI = false)
		public WebElement ttlSearchUsers;

		@IFindBy(how = How.CSS, using = "input[name$='Username']", AI = false)
		public WebElement txtUserName;
		
		@IFindBy(how = How.CSS, using = "div[id$='LV-0-_Select']", AI = false)
		public WebElement btnSelect;

		@IFindBy(how = How.CSS, using = "div[id$='SearchLinksInputSet-Search']", AI = false)
		public WebElement btnSearch;

		public SearchUserPage(){
		}

		public SearchUserPage(WebDriver driver) {
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
			}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, ttlSearchUsers))) {
				Log.fail("Page did not open up. Site might be down.", driver);
			}elementLayer = new ElementLayer(driver);
		}
	
	/**
	 * @author siva.panjanathan
	 * Enter UserName
	 * @param driver , userName
	 * @return
	 */
	public SearchUserPage enterSelectUserName(WebDriver driver,String userName){
		BrowserActions.type(driver, txtUserName, userName,"UserName is entered");
		return this;
	}
	
	/**
	 * @author charu.anbarasan
	 * click search button
	 * @param driver
	 * @return
	 */
	public SearchUserPage clickSearch(WebDriver driver){
		BrowserActions.click(driver, btnSearch, "Search");
		return this;
	}
	
	/**
	 * @author charu.anbarasan
	 * click select user button
	 * @param driver
	 * @return
	 */
	public SearchProducerCodes clickSelectUser(WebDriver driver){
		BrowserActions.click(driver, btnSelect ,"Select button");
		return new SearchProducerCodes(driver).get();
	}
	
	}
}
