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

public class CreatePersonAndCompanyPage extends LoadableComponent<CreatePersonAndCompanyPage> {

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

	public CreatePersonAndCompanyPage() {}

	public CreatePersonAndCompanyPage(WebDriver driver){
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

		if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, txtFirstName))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}
		elementLayer = new ElementLayer(driver);
	}// isLoaded

	/**
	 * Enters the first name in first name field for the Account Search
	 * @author siva.panjanathan
	 * @param driver
	 * @param firstName - first name to be entered
	 * @return CreatePersonAndCompanyPage
	 */
	public CreatePersonAndCompanyPage enterFirstName(WebDriver driver, String firstName) {
		BrowserActions.type(driver, txtFirstName, firstName, "first name");
		return this;
	}

	/**
	 * Enters the last name in last name field for the Account Search
	 * @author siva.panjanathan
	 * @param driver
	 * @param lastName - last name to be entered
	 * @return CreatePersonAndCompanyPage
	 */
	public CreatePersonAndCompanyPage enterLastName(WebDriver driver, String lastName){
		BrowserActions.type(driver, txtLastName, lastName, "last name");
		return this;
	}

	/**
	 * Enters the Address Line One in Address Line One field for the Create Account
	 * @author siva.panjanathan 
	 * @param driver,addressLineOne - Address Line One to be entered
	 * @return NewDriverPage
	 */
	public CreatePersonAndCompanyPage enterAddressLineOne(WebDriver driver, String addressLineOne) {
		BrowserActions.type(driver, txtAddress1, addressLineOne,true, "Address Line One");
		return this;
	}

	/**
	 * Select the State from the state dropdown
	 * @author siva.panjanathan
	 * @param driver,state - state to be selected from the dropdown
	 * @return NewDriverPage
	 */
	public CreatePersonAndCompanyPage selectState(WebDriver driver, String state){
		BrowserActions.selectDropDownByVisibleText(driver, drpState,state,true,"State");
		return this;
	}

	/**
	 * @author siva.panjanathan
	 * Enters the city in city field for the Account Search
	 * @param driver,city - city to be entered
	 * @return NewDriverPage
	 */
	public CreatePersonAndCompanyPage enterCity(WebDriver driver, String city){
		BrowserActions.type(driver, txtCity, city,true, "city");
		return this;
	}

	/**
	 * Enters the zipcode in zipcode field for the Account Search
	 * @author siva.panjanathan
	 * @param driver,zipcode - zipcode to be entered
	 * @return NewDriverPage
	 */
	public CreatePersonAndCompanyPage enterZipCode(WebDriver driver, String zipCode){
		BrowserActions.type(driver, txtZipCode,zipCode,true,"zipcode");
		return this;
	}

	/**
	 * Select the Address Type from the Address Type dropdown
	 * @author siva.panjanathan
	 * @param driver,addressType - Address Type to be selected from the dropdown
	 * @return NewDriverPage
	 */
	public CreatePersonAndCompanyPage selectAddressType(WebDriver driver, String addressType){
		BrowserActions.selectDropDownByVisibleText(driver, drpAddressType,addressType,true,"Address Type");
		return this;
	}

	public class CompanyPage extends LoadableComponent<CompanyPage>{
		WebDriver driver;
		private boolean isPageLoaded;
		public ElementLayer elementLayer;
		public List<Object> pageFactoryKey = new ArrayList<Object>();
		public List<String> pageFactoryValue = new ArrayList<String>();

		@IFindBy(how = How.CSS, using = "input[name$='-Name']", AI = false)
		public WebElement txtCompanyName;

		public CompanyPage() {}

		public CompanyPage(WebDriver driver){
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

			if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, txtCompanyName))) {
				Log.fail("Page did not open up. Site might be down.", driver);
			}
			elementLayer = new ElementLayer(driver);
		}// isLoaded

		/**
		 * Enters the Company Name in CompanyName field for the Account Search
		 * @author siva.panjanathan
		 * @param driver
		 * @param CompanyName - CompanyName to be entered
		 * @return CreatePersonAndCompanyPage
		 */
		public CompanyPage enterCompanyName(WebDriver driver, String firstName) {
			BrowserActions.type(driver, txtCompanyName, firstName, "first name");
			return this;
		}
	}

}
