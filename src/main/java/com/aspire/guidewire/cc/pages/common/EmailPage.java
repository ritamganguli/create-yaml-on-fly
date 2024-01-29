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

import ASPIREAI.customfactories.AjaxElementLocatorFactory;
import ASPIREAI.customfactories.IFindBy;
import ASPIREAI.customfactories.PageFactory;

public class EmailPage extends LoadableComponent<EmailPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
 	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();
	
	@IFindBy(how = How.CSS, using = "div[id='EmailWorksheet-CreateEmailScreen-ToolbarButton0']", AI = false)
	public WebElement lnkSendEmail;
	
	@IFindBy(how = How.CSS, using = "input[name='EmailWorksheet-CreateEmailScreen-ToRecipientLV-0-ToEmail']", AI = false)
	public WebElement inpEmail;

	@IFindBy(how = How.CSS, using = "input[name='EmailWorksheet-CreateEmailScreen-TextInput0']", AI = false)
	public WebElement inpSubject;
	
	@IFindBy(how = How.CSS, using = "textarea[name='EmailWorksheet-CreateEmailScreen-TextAreaInput0']", AI = false)
	public WebElement inpBody;

	

	
	public EmailPage(){
	}

	public EmailPage(WebDriver driver){
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(finder, this);
//		peopleinvolveddetailedTable = new PeopleInvolvedDetailed();
//		editableclaimcontactrolesTable = new EditableClaimContactRoles();
//		addressesTable = new Addresses();
}
	
@Override
	protected void load() {
		isPageLoaded = true;
		WaitUtils.waitForPageLoad(driver);
	}@Override
	protected void isLoaded() {
		if (!isPageLoaded) {
			Assert.fail();
		}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, lnkSendEmail))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);	
	}
	
	/**
	 * Used to click Send Email
	 * @author surendar.baskaran
	 * @param driver
	 */
	public EmailPage clickSendEmail(WebDriver driver){
		BrowserActions.click(driver, lnkSendEmail, "New Note");
		return this;
	}
	
	/**
	 * enter the Email Address
	 * @author surendar.baskaran
	 * @param driver,text
	 */
	public EmailPage enterEmailAddress(WebDriver driver, String text) {
		BrowserActions.type(driver, inpEmail, text, "Email Address");
		return this;
	}
	
	/**
	 * enter the Subject 
	 * @author surendar.baskaran
	 * @param driver,text
	 */
	public EmailPage enterSubject(WebDriver driver, String text) {
		BrowserActions.type(driver, inpSubject, text, "Email Address");
		return this;
	}
	
	/**
	 * enter the body
	 * @author surendar.baskaran
	 * @param driver,text
	 */
	public EmailPage enterBody(WebDriver driver, String text) {
		BrowserActions.type(driver, inpBody, text, "Email Address");
		return this;
	}
	
	
}