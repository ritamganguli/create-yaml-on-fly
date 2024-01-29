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

public class LoginPage extends LoadableComponent<LoginPage> {
	
	WebDriver driver;
	private String appURL;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();
	
	@IFindBy(how = How.CSS, using = "div[id$='username'] input[name$='username']", AI = false)
	public WebElement txtUsername;
	
	@IFindBy(how = How.CSS, using = "div[id$='password_Input'] div[id$='password'] input[name$='password']", AI = false)
	public WebElement txtPassword;
	
	@IFindBy(how = How.CSS, using = "div[id$='submit_Input'] div[id$='submit'] > div[role='button']", AI = false)
	public WebElement btnLogIn;
	
	public LoginPage() {}
	
	public LoginPage(WebDriver driver){
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, Utils.maxElementWait);
		PageFactory.initElements(finder, this);
		elementLayer = new ElementLayer(driver);
	}
	
	public LoginPage(WebDriver driver, String url) {
        appURL = url;
        this.driver = driver;
        ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, Utils.maxPageLoadWait);
        PageFactory.initElements(finder, this);
        driver.get(appURL);
    }

	public LoginPage(WebDriver driver, int timeout){
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, timeout);
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

		if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, btnLogIn))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}
		elementLayer = new ElementLayer(driver);
	}// isLoaded
	
	/**
	 * Login to application with valid credentials
	 * @author Manikandan.Manohar
	 * @param driver
	 * @param username
	 * @param password
	 * @return my activity page
	 */
	public MySummaryPage login(WebDriver driver, String username,String password) {
		enterUsername(driver, username);
		enterPassword(driver, password);
		clickLogin(driver);
		Log.event("Logged-in successfully");
		return new MySummaryPage(driver).get();
	}
	
	/**
	 * Enters the username in username field
	 * @author Manikandan.Manohar
	 * @param driver
	 * @param username - username to be entered
	 * @return LoginPage
	 */
	public LoginPage enterUsername(WebDriver driver, String username)  {
		BrowserActions.type(driver, txtUsername, username,"username");
		return this;
	}
	
	/**
	 * Enters the password in password field
	 * @author Manikandan.Manohar
	 * @param driver
	 * @param password - Password to be entered
	 */
	public LoginPage enterPassword(WebDriver driver, String password)  {
		BrowserActions.type(driver, txtPassword, password,"password");
		return this;
	}
	
	/**
	 * Clicks on the sign in button
	 * @author Manikandan.Manohar
	 * @param driver
	 * @return 
	 */
	public LoginPage clickLogin(WebDriver driver)  {
		BrowserActions.click(driver, btnLogIn,"signin");
		return this;
	}
	
}
