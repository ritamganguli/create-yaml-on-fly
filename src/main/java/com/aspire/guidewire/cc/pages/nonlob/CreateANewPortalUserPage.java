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

public class CreateANewPortalUserPage extends LoadableComponent<CreateANewPortalUserPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
	@IFindBy(how = How.ID, using = "PortalAuthorizationAdminPage-PortalAuthAdminScreen-0", AI = false)
	public WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "#PortalAuthUserCreatePopup-PortalAuthUserDV_tb-Update>div[role='button']", AI = false)
	public WebElement btnOK;

	@IFindBy(how = How.CSS, using = "#PortalAuthUserCreatePopup-PortalAuthUserDV_tb-Edit>div[role='button']", AI = false)
	public WebElement btnEdit;

	@IFindBy(how = How.CSS, using = "#PortalAuthUserCreatePopup-PortalAuthUserGrantedAuthoritiesLV_tb-AddAuthorityButton>div[role='button']", AI = false)
	public WebElement btnAddAGrantedAuthority;

	@IFindBy(how = How.CSS, using = "#PortalAuthUserCreatePopup-__crumb__", AI = false)
	public WebElement btn__crumb__;

	@IFindBy(how = How.CSS, using = "#PortalAuthUserCreatePopup-PortalAuthUserGrantedAuthoritiesLV_tb-AddAuthorityButton-PortalAuthUserGrantedAuthoritiesMenuItemSet-AddNewAuthorityPolicyholderOption>div[role='menuitem']", AI = false)
	public WebElement btnPolicyholder;

	@IFindBy(how = How.CSS, using = "#PortalAuthUserCreatePopup-PortalAuthUserGrantedAuthoritiesLV_tb-AddAuthorityButton-PortalAuthUserGrantedAuthoritiesMenuItemSet-AddNewAuthorityAccountHolderOption>div[role='menuitem']", AI = false)
	public WebElement btnAccountHolder;

	@IFindBy(how = How.CSS, using = "input[name='PortalAuthUserCreatePopup-PortalAuthUserDV-UserSurname']", AI = false)
	public WebElement inpLastName;

	@IFindBy(how = How.CSS, using = "#PortalAuthUserCreatePopup-PortalAuthUserGrantedAuthoritiesLV_tb-AddAuthorityButton-PortalAuthUserGrantedAuthoritiesMenuItemSet-AddNewAuthorityProducerOption>div[role='menuitem']", AI = false)
	public WebElement btnProducer;

	@IFindBy(how = How.CSS, using = "#PortalAuthUserCreatePopup-PortalAuthUserGrantedAuthoritiesLV_tb-AddAuthorityButton-PortalAuthUserGrantedAuthoritiesMenuItemSet-AddNewAuthorityVendorOption>div[role='menuitem']", AI = false)
	public WebElement btnVendor;

	@IFindBy(how = How.CSS, using = "input[name='PortalAuthUserCreatePopup-PortalAuthUserDV-UserFirstName']", AI = false)
	public WebElement inpFirstName;

	@IFindBy(how = How.CSS, using = "#PortalAuthUserCreatePopup-PortalAuthUserDV_tb-Cancel>div[role='button']", AI = false)
	public WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "div[id$='UserDeleteButton']", AI = false)
	public WebElement btnDelete;

	@IFindBy(how = How.CSS, using = "input[name='PortalAuthUserCreatePopup-PortalAuthUserDV-UserPassword']", AI = false)
	public WebElement inpPassword;

	@IFindBy(how = How.CSS, using = "input[name='PortalAuthUserCreatePopup-PortalAuthUserDV-UserEmail']", AI = false)
	public WebElement inpEmailAddress;

	@IFindBy(how = How.CSS, using = "#PortalAuthorizationAdminPage-PortalAuthAdminScreen-PortalAuthUsersLV_tb-ToolbarButtonCreate>div[role='button']", AI = false)
	public WebElement btnCreateANewUser;

	@IFindBy(how = How.CSS, using = "#PortalAuthorizationAdminPage-PortalAuthAdminScreen-PortalAuthUsersLV_tb-ToolbarButton>div[role='button']", AI = false)
	public WebElement btnSearchUsers;

	@IFindBy(how = How.CSS, using = "input[name$='SearchUsersFirstNameInput']", AI = false)
	public WebElement inpSearchFirstName;
	
	@IFindBy(how = How.CSS, using = "input[name$='SearchUsersSurameInput']", AI = false)
	public WebElement inpSearchLastName;
	
	@IFindBy(how = How.CSS, using = "td[id$='PortalAuthUsersLV-0-FirstNameCell_Cell']", AI = false)
	public WebElement lblFirstName;
	
	@IFindBy(how = How.CSS, using = "td[id$='PortalAuthUsersLV-0-LastNameCell_Cell']", AI = false)
	public WebElement lblLastName;

	@IFindBy(how = How.CSS, using = "input[name$='authorityTarget']", AI = false)
	public WebElement inpAuthorityAccountNumber;
	
	@IFindBy(how = How.CSS, using = "div[id$='Update']", AI = false)
	public WebElement btnupdate;
	
	@IFindBy(how = How.ID, using = "PortalAuthUserDetailPopup-__crumb__", AI = false)
	public WebElement btnReturnToPortalAuthorization;

	public CreateANewPortalUserPage(){
	}

	public CreateANewPortalUserPage(WebDriver driver) throws Exception{
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
		}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, inpEmailAddress))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);
	}
	public CreateANewPortalUserPage clickOK(WebDriver driver)  {
		BrowserActions.click(driver, btnOK,"OK");
		return this;
	}
	public CreateANewPortalUserPage clickEdit(WebDriver driver)  {
		BrowserActions.click(driver, btnEdit,"Edit");
		return this;
	}
	public CreateANewPortalUserPage clickAddAGrantedAuthority(WebDriver driver)  {
		BrowserActions.click(driver, btnAddAGrantedAuthority,"AddAGrantedAuthority");
		return this;
	}
	public CreateANewPortalUserPage click__crumb__(WebDriver driver)  {
		BrowserActions.click(driver, btn__crumb__,"__crumb__");
		return this;
	}
	public CreateANewPortalUserPage clickPolicyholder(WebDriver driver)  {
		BrowserActions.click(driver, btnPolicyholder,"Policyholder");
		return this;
	}
	public CreateANewPortalUserPage clickAccountHolder(WebDriver driver)  {
		BrowserActions.click(driver, btnAccountHolder,"AccountHolder");
		return this;
	}
	public CreateANewPortalUserPage enterLastName(WebDriver driver,String LastName) {
		BrowserActions.type(driver, inpLastName,LastName, "LastName");
		return this;
	}
	public CreateANewPortalUserPage clickProducer(WebDriver driver)  {
		BrowserActions.click(driver, btnProducer,"Producer");
		return this;
	}
	public CreateANewPortalUserPage clickVendor(WebDriver driver)  {
		BrowserActions.click(driver, btnVendor,"Vendor");
		return this;
	}
	public CreateANewPortalUserPage enterFirstName(WebDriver driver,String FirstName) {
		BrowserActions.type(driver, inpFirstName,FirstName, "FirstName");
		return this;
	}
	public CreateANewPortalUserPage clickCancel(WebDriver driver)  {
		BrowserActions.click(driver, btnCancel,"Cancel");
		return this;
	}
	public CreateANewPortalUserPage clickDelete(WebDriver driver)  {
		BrowserActions.click(driver, btnDelete,1,"Delete");
		BrowserActions.confirmAlert(driver, "Are you sure you wish to delete the selected users?");
		return this;
	}
	public CreateANewPortalUserPage enterPassword(WebDriver driver,String Password) {
		BrowserActions.type(driver, inpPassword,Password, "Password");
		return this;
	}
	public CreateANewPortalUserPage enterEmailAddress(WebDriver driver,String EmailAddress) {
		BrowserActions.type(driver, inpEmailAddress,EmailAddress, "EmailAddress");
		return this;
	}
	public CreateANewPortalUserPage clickCreateANewUser(WebDriver driver)  {
		BrowserActions.click(driver, btnCreateANewUser,"CreateANewUser");
		return this;
	}
	public CreateANewPortalUserPage clickSearchUsers(WebDriver driver)  {
		BrowserActions.click(driver, btnSearchUsers,1,"SearchUsers");
		return this;
	}
	public CreateANewPortalUserPage enterSearchFirstName(WebDriver driver,String FirstName) {
		BrowserActions.type(driver, inpSearchFirstName,FirstName, "FirstName");
		return this;
	}
	public CreateANewPortalUserPage enterSearchLastName(WebDriver driver,String LastName) {
		BrowserActions.type(driver, inpSearchLastName,LastName, "LastName");
		return this;
	}

	public CreateANewPortalUserPage verifyFirstName(WebDriver driver,String expectedFirstName) {
		BrowserActions.waitForElementToDisplay(driver,lblFirstName,1);
		String firstNameLabel = BrowserActions.getText(driver, lblFirstName, "First name label");
		Log.softAssertThat(firstNameLabel.equals(expectedFirstName), "Given First name is matching with search result", "Given First name is not matching with search result");
		return this;
	}

	public CreateANewPortalUserPage verifyLastName(WebDriver driver,String expectedLastName) {
		BrowserActions.waitForElementToDisplay(driver,lblLastName,1);
		String lastNameLabel = BrowserActions.getText(driver, lblLastName, "Last name label");
		Log.softAssertThat(lastNameLabel.equals(expectedLastName), "Given Last name is matching with search result", "Given Last name is not matching with search result");
		return this;
	}
	public CreateANewPortalUserPage enterAccountNumber(WebDriver driver,String accnumber) {
		BrowserActions.type(driver, inpAuthorityAccountNumber,accnumber, "Authority Account Number");
		return this;
	}
	public CreateANewPortalUserPage clickUpdate(WebDriver driver)  {
		BrowserActions.click(driver, btnupdate,"Update Button");
		return this;
	}

	public CreateANewPortalUserPage clickAddedUserNameCheckBox(WebDriver driver,String username)  {
		By userNameCheckBoxBy = By.xpath("//div[text()='"+username+"']//ancestor::td//preceding-sibling::td//descendant::div[contains(@id,'_Checkbox')]");
		BrowserActions.waitForElementToDisplay(driver, userNameCheckBoxBy, "userName CheckBox");
		WebElement userNameCheckBox = userNameCheckBoxBy.findElement(driver);
		BrowserActions.click(driver, userNameCheckBox,1,"Username check box");
		return this;
	}
	
	public void verifyclickAddedUserNameIsNotDisplayed(WebDriver driver,String username)  {
	boolean flag = false;
	BrowserActions.waitForNetworkIdleState(driver,1);
	By userNameBy = By.xpath("//div[text()='"+username+"']");
	int size = BrowserActions.getWebElementSize(driver, userNameBy, "username", 0.5);
	if(size == 0) {
		flag = true;
	}
	Log.softAssertThat(flag, "User("+username+") is not present as expected", "User("+username+") present in list");
}
	
	public CreateANewPortalUserPage clickAddedUserName(WebDriver driver,String username)  {
		BrowserActions.waitForElementToDisplay(driver,lblFirstName);
		By userNameLinkBy = By.xpath("//div[text()='"+username+"']");
		BrowserActions.waitForElementToDisplay(driver, userNameLinkBy, "username");
		WebElement userNameLink = userNameLinkBy.findElement(driver);
		BrowserActions.click(driver, userNameLink,"Username Link");
		return this;
	}
	
	public CreateANewPortalUserPage clickReturnToPortalAuthorization(WebDriver driver)  {
		BrowserActions.click(driver, btnReturnToPortalAuthorization,"Return To Portal Authorization");
		return this;
	}

	public void verifyTitleofauthorizedPortal(WebDriver driver) {
		BrowserActions.verifyElementDisplayed(driver, lblTtlBar, "Title of authorizedPortal");
	}


}