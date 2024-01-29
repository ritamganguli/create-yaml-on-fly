package com.aspire.guidewire.bc.pages;
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

public class UserSearchPage extends LoadableComponent<UserSearchPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
 	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
//	public TopNavBar topnavbar;
	@IFindBy(how = How.CSS, using = "input[name='UserSearch-UserSearchScreen-UserSearchDV-UsernameCriterion']", AI = false)
	private WebElement inpUserName;

	@IFindBy(how = How.CSS, using = "select[name='UserSearch-UserSearchScreen-UserSearchDV-GlobalPersonNameInputSet-Prefix']", AI = false)
	private WebElement drpPrefix;

	@IFindBy(how = How.CSS, using = "input[name='UserSearch-UserSearchScreen-UserSearchDV-NotInAnyGroupCriterion']", AI = false)
	private WebElement rdbSearchUnassignedUsers;

	@IFindBy(how = How.CSS, using = "#UserSearch-UserSearchScreen-ttlBar", AI = false)
	private WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "input[name='UserSearch-UserSearchScreen-UserSearchDV-GroupNameCriterionKanji']", AI = false)
	private WebElement inpGroupName_1;

	@IFindBy(how = How.CSS, using = "#UserSearch-UserSearchScreen-UserSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Search", AI = false)
	private WebElement btnSearch;

	@IFindBy(how = How.CSS, using = "input[name='UserSearch-UserSearchScreen-UserSearchDV-GlobalPersonNameInputSet-NameSummary']", AI = false)
	private WebElement inpName;

	@IFindBy(how = How.CSS, using = "select[name='UserSearch-UserSearchScreen-UserSearchDV-GlobalPersonNameInputSet-Suffix']", AI = false)
	private WebElement drpSuffix;

	@IFindBy(how = How.CSS, using = "select[name='UserSearch-UserSearchScreen-UserSearchDV-Role']", AI = false)
	private WebElement drpRole;

	@IFindBy(how = How.CSS, using = "input[name='UserSearch-UserSearchScreen-UserSearchDV-GlobalPersonNameInputSet-Particle']", AI = false)
	private WebElement inpParticle;

	@IFindBy(how = How.CSS, using = "input[name='UserSearch-UserSearchScreen-UserSearchDV-GroupNameCriterion']", AI = false)
	private WebElement inpGroupName;

	@IFindBy(how = How.CSS, using = "input[name='UserSearch-UserSearchScreen-UserSearchDV-GlobalPersonNameInputSet-MiddleName']", AI = false)
	private WebElement inpMiddlename;

	@IFindBy(how = How.CSS, using = "input[name='UserSearch-UserSearchScreen-UserSearchDV-GlobalPersonNameInputSet-LastName']", AI = false)
	private WebElement inpLastname;

	@IFindBy(how = How.CSS, using = "#UserSearch-UserSearchScreen-UserSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Reset", AI = false)
	private WebElement btnReset;

	@IFindBy(how = How.CSS, using = "input[name='UserSearch-UserSearchScreen-UserSearchDV-GlobalPersonNameInputSet-FirstName']", AI = false)
	private WebElement inpFirstname;

	public UserSearchPage(){
	}

	public UserSearchPage(WebDriver driver){
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
		}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, inpFirstname))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);
}public UserSearchPage enterUserName(WebDriver driver,String UserName) {
		            BrowserActions.type(driver, inpUserName,UserName, "UserName");
			        return this;
           }
public UserSearchPage selectPrefix(WebDriver driver,String Prefix)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPrefix,Prefix,"Prefix");
				    return this;
			}
public UserSearchPage clickSearchUnassignedUsers(WebDriver driver)  {
					BrowserActions.click(driver, rdbSearchUnassignedUsers,"SearchUnassignedUsers");
				    return this;
			}
public UserSearchPage enterGroupName_1(WebDriver driver,String GroupName_1) {
		            BrowserActions.type(driver, inpGroupName_1,GroupName_1, "GroupName_1");
			        return this;
           }
public UserSearchPage clickSearch(WebDriver driver)  {
					BrowserActions.click(driver, btnSearch,"Search");
				    return this;
			}
public UserSearchPage enterName(WebDriver driver,String Name) {
		            BrowserActions.type(driver, inpName,Name, "Name");
			        return this;
           }
public UserSearchPage selectSuffix(WebDriver driver,String Suffix)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpSuffix,Suffix,"Suffix");
				    return this;
			}
public UserSearchPage selectRole(WebDriver driver,String Role)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpRole,Role,"Role");
				    return this;
			}
public UserSearchPage enterParticle(WebDriver driver,String Particle) {
		            BrowserActions.type(driver, inpParticle,Particle, "Particle");
			        return this;
           }
public UserSearchPage enterGroupName(WebDriver driver,String GroupName) {
		            BrowserActions.type(driver, inpGroupName,GroupName, "GroupName");
			        return this;
           }
public UserSearchPage enterMiddlename(WebDriver driver,String Middlename) {
		            BrowserActions.type(driver, inpMiddlename,Middlename, "Middlename");
			        return this;
           }
public UserSearchPage enterLastname(WebDriver driver,String Lastname) {
		            BrowserActions.type(driver, inpLastname,Lastname, "Lastname");
			        return this;
           }
public UserSearchPage clickReset(WebDriver driver)  {
					BrowserActions.click(driver, btnReset,"Reset");
				    return this;
			}
public UserSearchPage enterFirstname(WebDriver driver,String Firstname) {
		            BrowserActions.type(driver, inpFirstname,Firstname, "Firstname");
			        return this;
           }
}
