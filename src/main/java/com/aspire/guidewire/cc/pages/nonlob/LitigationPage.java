package com.aspire.guidewire.cc.pages.nonlob;
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
import com.aspire.guidewire.webdriverManager.DriverManager;

import ASPIREAI.customfactories.AjaxElementLocatorFactory;
import ASPIREAI.customfactories.IFindBy;
import ASPIREAI.customfactories.PageFactory;

public class LitigationPage extends LoadableComponent<LitigationPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
 	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
//	public TopNavBar topnavbar;
//	public Matters mattersTable;

	@IFindBy(how = How.CSS, using = "input[name='ClaimMatters-ClaimMatterScreen-MattersLV-0-Name']", AI = false)
	private WebElement inpName;

	@IFindBy(how = How.CSS, using = "input[name='ClaimMatters-ClaimMatterScreen-MattersLV-0-CaseNumber']", AI = false)
	private WebElement inpCaseNumber;

	@IFindBy(how = How.CSS, using = "#ClaimMatters-ClaimMatterScreen-MattersLV-0-TrialDate_dateIcon", AI = false)
	private WebElement btnTrialDateDateIcon;

	@IFindBy(how = How.CSS, using = "input[name='ClaimMatters-ClaimMatterScreen-MattersLV-0-AssignedUser']", AI = false)
	private WebElement inpAssignedTo;

	@IFindBy(how = How.CSS, using = "#ClaimMatters-ClaimMatterScreen-ClaimMatters_CloseMatterButton>div[role='button']", AI = false)
	private WebElement btnCloseMatter;

	@IFindBy(how = How.CSS, using = "#ClaimMatters-ClaimMatterScreen-ClaimMatters_RefreshButton>div[role='button']", AI = false)
	private WebElement btnRefresh;

	@IFindBy(how = How.CSS, using = "#ClaimMatters-ClaimMatterScreen-ClaimMatters_CalendarButton>div[role='button']", AI = false)
	private WebElement btnMyCalendar;

	@IFindBy(how = How.CSS, using = "#ClaimMatters-ClaimMatterScreen-ClaimMatters_SupervisorCalendarButton>div[role='button']", AI = false)
	private WebElement btnSupervisorCalendar;

	@IFindBy(how = How.CSS, using = "#ClaimMatters-ClaimMatterScreen-ClaimMatters_AssignButton>div[role='button']", AI = false)
	private WebElement btnAssign;

	@IFindBy(how = How.CSS, using = "#ClaimMatters-ClaimMatterScreen-ClaimMatters_NewMatterButton>div[role='button']", AI = false)
	private WebElement btnNewMatter;

	@IFindBy(how = How.CSS, using = "input[name='ClaimMatters-ClaimMatterScreen-MattersLV-0-TrialDate']", AI = false)
	private WebElement inpTrialDate;
	
	@IFindBy(how = How.CSS, using = "input[name='ClaimMatters-ClaimMatterScreen-MattersLV-0-_Checkbox']", AI = false)
	private WebElement inpName_1;

	public LitigationPage(){
	}

	public LitigationPage(WebDriver driver) {
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(finder, this);
		//mattersTable = new Matters();
}
@Override
	protected void load() {
		isPageLoaded = true;
		WaitUtils.waitForPageLoad(driver);
	}@Override
	protected void isLoaded() {
		if (!isPageLoaded) {
			Assert.fail();
		}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, btnNewMatter))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);
}public LitigationPage enterName(WebDriver driver,String Name) {
		            BrowserActions.type(driver, inpName,Name, "Name");
			        return this;
           }
public LitigationPage enterCaseNumber(WebDriver driver,String CaseNumber) {
		            BrowserActions.type(driver, inpCaseNumber,CaseNumber, "CaseNumber");
			        return this;
           }
public LitigationPage clickTrialDateDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnTrialDateDateIcon,"TrialDateDateIcon");
				    return this;
			}
public LitigationPage enterAssignedTo(WebDriver driver,String AssignedTo) {
		            BrowserActions.type(driver, inpAssignedTo,AssignedTo, "AssignedTo");
			        return this;
           }
public LitigationPage clickCloseMatter(WebDriver driver)  {
					BrowserActions.click(driver, btnCloseMatter,"CloseMatter");
				    return this;
			}
public LitigationPage clickRefresh(WebDriver driver)  {
					BrowserActions.click(driver, btnRefresh,"Refresh");
				    return this;
			}
public LitigationPage clickMyCalendar(WebDriver driver)  {
					BrowserActions.click(driver, btnMyCalendar,"MyCalendar");
				    return this;
			}
public LitigationPage clickSupervisorCalendar(WebDriver driver)  {
					BrowserActions.click(driver, btnSupervisorCalendar,"SupervisorCalendar");
				    return this;
			}
public LitigationPage clickAssign(WebDriver driver)  {
					BrowserActions.click(driver, btnAssign,"Assign");
				    return this;
			}
public NewMatterPage clickNewMatter(WebDriver driver)  {
					BrowserActions.click(driver, btnNewMatter,"NewMatter");
					Log.messageStep("New Matter Button is Clicked",DriverManager.getDriver());
				    return new NewMatterPage(driver).get();
			}
public LitigationPage enterTrialDate(WebDriver driver,String TrialDate) {
		            BrowserActions.type(driver, inpTrialDate,TrialDate, "TrialDate");
			        return this;
           }
public LitigationPage selectName(WebDriver driver) {
	BrowserActions.click(driver, inpName_1,"name");
	return this;
}
public LitigationPage verifyAssign(WebDriver driver)  {
	BrowserActions.verifyElementDisplayed(driver, btnAssign,"Assign");
	return this;
}
public LitigationPage verifyRefresh(WebDriver driver)  {
	BrowserActions.verifyElementDisplayed(driver, btnRefresh,"Refresh");
	return this;
}
public LitigationPage verifyCloseMatter(WebDriver driver)  {
	BrowserActions.verifyElementDisplayed(driver, btnCloseMatter,"Close Matter");
	return this;
}
public LitigationPage verifyNewMatter(WebDriver driver)  {
	BrowserActions.verifyElementDisplayed(driver, btnNewMatter,"New Matter");
	return this;
}
public LitigationPage verifyMyCalendar(WebDriver driver)  {
	BrowserActions.verifyElementDisplayed(driver, btnMyCalendar,"MyCalendar");
	return this;
}
public LitigationPage verifySupervisorCalendar(WebDriver driver)  {
	BrowserActions.verifyElementDisplayed(driver, btnSupervisorCalendar,"Supervisor calendar");
	Log.messageStep("Assign, Refresh, CloseMatter, New Matter, My Calender Buttons were Displayed Successfully  ",DriverManager.getDriver());
	return this;
}


}
