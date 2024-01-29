package com.aspire.guidewire.pc.pages.common;

import java.util.ArrayList;
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
import com.aspire.guidewire.utils.Utils;
import com.aspire.guidewire.utils.WaitUtils;

import ASPIREAI.customfactories.AjaxElementLocatorFactory;
import ASPIREAI.customfactories.IFindBy;
import ASPIREAI.customfactories.PageFactory;

public class SearchAddressBookPage extends LoadableComponent<SearchAddressBookPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	@IFindBy(how = How.CSS, using = "input[name$='FirstName']", AI = false)
	public WebElement txtFirstName;

	@IFindBy(how = How.CSS, using = "input[name$='LastName']", AI = false)
	public WebElement txtLastName;

	@IFindBy(how = How.CSS, using = "input[name$='City']", AI = false)
	public WebElement txtCity;

	@IFindBy(how = How.CSS, using = "input[name$='County']", AI = false)
	public WebElement txtCounty;

	@IFindBy(how = How.CSS, using = "input[name$='AddressLine1']", AI = false)
	public WebElement txtAddress1;

	@IFindBy(how = How.CSS, using = "input[name$='AddressLine2']", AI = false)
	public WebElement txtAddress2;

	@IFindBy(how = How.CSS, using = "input[name$='AddressLine3']", AI = false)
	public WebElement txtAddress3;

	@IFindBy(how = How.CSS, using = "select[name$='State']", AI = false)
	public WebElement drpState;

	@IFindBy(how = How.CSS, using = "input[name$='PostalCode']", AI = false)
	public WebElement txtZipCode;

	@IFindBy(how = How.CSS, using = "select[name$='AddressType']", AI = false)
	public WebElement drpAddressType;

	@IFindBy(how = How.CSS, using = "div[id$='Next']", AI = false)
	public WebElement btnNext;

	@IFindBy(how = How.CSS, using = "input[name$='-Name']", AI = false)
	public WebElement txtCompanyName;

	@IFindBy(how = How.CSS, using = "select[name$='Country']", AI = false)
	public WebElement drpCountry;

	@IFindBy(how = How.CSS, using = "div[id*='ContactSearchScreen']", AI = false)
	public WebElement ttlSearchAddressBook;

	@IFindBy(how = How.CSS, using = "div[id$='City-AutoFillIcon']", AI = false)
	public WebElement icnAddressAutoFillByCity;

	@IFindBy(how = How.CSS, using = "div[id$='PostalCode-AutoFillIcon']", AI = false)
	public WebElement icnAddressAutoFillByZipCode;

	@IFindBy(how = How.CSS, using = "input[name$='-Phone-']", AI = false)
	public WebElement txtWorkPhone;

	@IFindBy(how = How.CSS, using = "input[name$='TaxID']", AI = false)
	public WebElement txtTaxId;

	@IFindBy(how = How.CSS, using = "div[id$='SearchLinksInputSet-Search']", AI = false)
	public WebElement btnSearch;

	@IFindBy(how = How.CSS, using = "div[id$='Reset']", AI = false)
	public WebElement btnReset;

	@IFindBy(how = How.CSS, using = "div[id$='PrintMe']", AI = false)
	public WebElement btnPrintExport;

	@IFindBy(how = How.CSS, using = "select[name$='Type']", AI = false)
	public WebElement drpType;

	@IFindBy(how = How.CSS, using = "div[id$='ContactSearchResultsLV']", AI = false)
	public WebElement tableSearchResults;
	
	@IFindBy(how = How.CSS, using = "div[id$='LV-0-_Select']", AI = false)
	public WebElement btnSelect;

	public SearchAddressBookPage() {}

	public SearchAddressBookPage(WebDriver driver){
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, Utils.maxElementWait);
		PageFactory.initElements(finder, this);
		elementLayer = new ElementLayer(driver);
	}

	@Override
	protected void load() {
		isPageLoaded = true;
		WaitUtils.waitForPageLoad(driver);
	}// load

	@Override
	protected void isLoaded() {
		if (!isPageLoaded) {
			Assert.fail();
		}

		if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, ttlSearchAddressBook))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}
		elementLayer = new ElementLayer(driver);
	}// isLoaded

	/**
	 * Enters the first name in first name field for the Account Search
	 * @author siva.panjanathan
	 * @param driver
	 * @param firstName - first name to be entered
	 * @return SearchAddressBookPage
	 */
	public SearchAddressBookPage enterFirstName(WebDriver driver, String firstName) {
		BrowserActions.type(driver, txtFirstName, firstName, "first name");
		return this;
	}

	/**
	 * Enters the last name in last name field for the Account Search
	 * @author siva.panjanathan
	 * @param driver
	 * @param lastName - last name to be entered
	 * @return SearchAddressBookPage
	 */
	public SearchAddressBookPage enterLastName(WebDriver driver, String lastName){
		BrowserActions.type(driver, txtLastName, lastName, "last name");
		return this;
	}

	/**
	 * Enters the Address Line One in Address Line One field for the Create Account
	 * @author siva.panjanathan 
	 * @param driver,addressLineOne - Address Line One to be entered
	 * @return SearchAddressBookPage
	 */
	public SearchAddressBookPage enterAddressLineOne(WebDriver driver, String addressLineOne) {
		BrowserActions.type(driver, txtAddress1, addressLineOne,true, "Address Line One");
		return this;
	}

	/**
	 * Select the State from the state dropdown
	 * @author siva.panjanathan
	 * @param driver,state - state to be selected from the dropdown
	 * @return SearchAddressBookPage
	 */
	public SearchAddressBookPage selectState(WebDriver driver, String state){
		BrowserActions.selectDropDownByVisibleText(driver, drpState,state,true,"State");
		return this;
	}

	/**
	 * @author siva.panjanathan
	 * Enters the city in city field for the Account Search
	 * @param driver,city - city to be entered
	 * @return SearchAddressBookPage
	 */
	public SearchAddressBookPage enterCity(WebDriver driver, String city){
		BrowserActions.type(driver, txtCity, city,true, "city");
		return this;
	}

	/**
	 * Enters the company name in company name field for the create Account 
	 * @author siva.panjanathan
	 * @param driver,companyName
	 * @return SearchAddressBookPage 
	 */
	public SearchAddressBookPage enterCompanyName(WebDriver driver, String companyName) {
		BrowserActions.type(driver, txtCompanyName, companyName, "company name");
		return this;
	}

	/**
	 * Click on the Search button for the Create Account
	 * @author siva.panjanathan
	 * @param driver
	 * @return SearchAddressBookPage 
	 */
	public SearchAddressBookPage clickSearchButton(WebDriver driver) {
		BrowserActions.click(driver, btnSearch,"Search Button");
		return this;
	}

	/**
	 * Click on the Reset button
	 * @author siva.panjanathan
	 * @param driver
	 * @return SearchAddressBookPage 
	 */
	public SearchAddressBookPage clickResetButton(WebDriver driver) {
		BrowserActions.click(driver, btnReset,"Reset Button");
		return this;
	}

	/**
	 * Select the Country from the country dropdown 
	 * @author siva.panjanathan
	 * @param driver,country
	 * @return SearchAddressBookPage 
	 */
	public SearchAddressBookPage selectCountry(WebDriver driver, String country) {
		BrowserActions.selectDropDownByVisibleText(driver, drpCountry,country,"Country");
		return this;
	}

	/**
	 * Enters the Work Phone in Work Phone field for the create Account 
	 * @author siva.panjanathan
	 * @param driver , workPhone
	 * @return SearchAddressBookPage 
	 */
	public SearchAddressBookPage enterWorkPhone(WebDriver driver, String workPhone) {
		BrowserActions.type(driver, txtWorkPhone, workPhone, "Work Phone");
		return this;
	}

	/**
	 * Enters the TaxId in TaxId field for the Create Account
	 * @author siva.panjanathan
	 * @param driver , taxId
	 * @return SearchAddressBookPage 
	 */
	public SearchAddressBookPage enterTaxId(WebDriver driver, String taxId) {
		BrowserActions.type(driver, txtTaxId, taxId, "TaxId");
		return this;
	}

	/**
	 * Click on the Print Export button
	 * @author siva.panjanathan
	 * @param driver
	 * @return SearchAddressBookPage 
	 */
	public SearchAddressBookPage clickPrintExporttButton(WebDriver driver) {
		BrowserActions.click(driver, btnPrintExport,"Print Export Button");
		return this;
	}

	/**
	 * Select the Type from the Type dropdown 
	 * @author siva.panjanathan
	 * @param driver , type
	 * @return SearchAddressBookPage 
	 */
	public SearchAddressBookPage selectType(WebDriver driver, String type) {
		BrowserActions.selectDropDownByVisibleText(driver, drpType,type,"Type");
		return this;
	}
	
	/**
	 * click select button based on input
	 * @author charu.anbarasan
	 * @param driver, name
	 * @return SearchAddressBookPage 
	 */
	public CreateAccountPage clickSelect(WebDriver driver){
		BrowserActions.click(driver, btnSelect, "Select button");
		return new CreateAccountPage(driver).get();
	}

}
