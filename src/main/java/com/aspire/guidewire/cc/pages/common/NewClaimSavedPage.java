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

public class NewClaimSavedPage extends LoadableComponent<NewClaimSavedPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
	//	public TopNavBar topnavbar;
	@IFindBy(how = How.CSS, using = "input[name='NewClaimSaved-NewClaimSavedScreen-NewClaimSavedDV-PendingAssignment']", AI = false)
	private WebElement inpPendingAssignment;

	@IFindBy(how = How.CSS, using = "input[name='NewClaimSaved-NewClaimSavedScreen-NewClaimSavedDV-AssignedUser']", AI = false)
	private WebElement inpAssignedUser;

	@IFindBy(how = How.CSS, using = "#NewClaimSaved-NewClaimSavedScreen-NewClaimSavedDV-CreatePayment", AI = false)
	private WebElement lnkCreatePayment;

	@IFindBy(how = How.CSS, using = "#NewClaimSaved-NewClaimSavedScreen-NewClaimSavedDV-GoToClaim", AI = false)
	private WebElement lnkGoToClaim;

	@IFindBy(how = How.CSS, using = "#NewClaimSaved-NewClaimSavedScreen-NewClaimSavedDV-CreateReserve", AI = false)
	private WebElement lnkCreateReserve;

	@IFindBy(how = How.CSS, using = "#NewClaimSaved-NewClaimSavedScreen-ttlBar", AI = false)
	private WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "input[name='NewClaimSaved-NewClaimSavedScreen-NewClaimSavedDV-AssignedGroup']", AI = false)
	private WebElement inpAssignedGroup;

	@IFindBy(how = How.CSS, using = "#NewClaimSaved-NewClaimSavedScreen-NewClaimSavedDV-CreateNewClaim", AI = false)
	private WebElement lnkCreateNewClaim;
	
	@IFindBy(how = How.CSS, using = "div[id$='NewClaimSavedDV-Header']", AI = false)
	private WebElement lblClaimNumber;

	public NewClaimSavedPage(){
	}

	public NewClaimSavedPage(WebDriver driver){
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
		}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, lnkCreateNewClaim))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);
	}public NewClaimSavedPage enterPendingAssignment(WebDriver driver,String PendingAssignment) {
		BrowserActions.type(driver, inpPendingAssignment,PendingAssignment, "PendingAssignment");
		return this;
	}
	public NewClaimSavedPage enterAssignedUser(WebDriver driver,String AssignedUser) {
		BrowserActions.type(driver, inpAssignedUser,AssignedUser, "AssignedUser");
		return this;
	}
	// Adding ActionMethods for 'label' element 
	public NewClaimSavedPage clickCreatePayment(WebDriver driver) {
		BrowserActions.click(driver, lnkCreatePayment, "lnkCreatePayment");
		return this;
	}

	// Adding ActionMethods for 'label' element 
	public NewClaimSavedPage clickGoToClaim(WebDriver driver) {
		BrowserActions.click(driver, lnkGoToClaim, "lnkGoToClaim");
		return this;
	}

	// Adding ActionMethods for 'label' element 
	public String getLabelOfCreateReserve(WebDriver driver) {
		return BrowserActions.getText(driver, lnkCreateReserve, "lnkCreateReserve");
	}

	public NewClaimSavedPage enterAssignedGroup(WebDriver driver,String AssignedGroup) {
		BrowserActions.type(driver, inpAssignedGroup,AssignedGroup, "AssignedGroup");
		return this;
	}
	// Adding ActionMethods for 'label' element 
	public String getLabelOfCreateNewClaim() {
		return BrowserActions.getText(driver, lnkCreateNewClaim, "lnkCreateNewClaim");
	}
	
	public String getClaimNumber(WebDriver driver) {
		String text = BrowserActions.getText(driver, lblClaimNumber,"Claim Number");
		String claimNumber = text.replaceAll("[^0-9]", "");
		return claimNumber;
	}

}
