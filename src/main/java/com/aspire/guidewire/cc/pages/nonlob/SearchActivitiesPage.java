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

public class SearchActivitiesPage extends LoadableComponent<SearchActivitiesPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
 	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
//	public TopNavBar topnavbar;
	@IFindBy(how = How.CSS, using = "#ActivitySearch-ActivitySearchScreen-ttlBar", AI = false)
	private WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "#ActivitySearch-ActivitySearchScreen-ActivitySearchDV-ActivitySearchRequiredInputSet-CreatedBy-CreatedByUserSelectMenuItem>div[role='menuitem']", AI = false)
	private WebElement btnSelectUser_2;

	@IFindBy(how = How.CSS, using = "select[name='ActivitySearch-ActivitySearchScreen-ActivitySearchDV-ActivitySearchRequiredInputSet-AssignedToGroup']", AI = false)
	private WebElement drpAssignedToGroup;

	@IFindBy(how = How.CSS, using = "input[name='ActivitySearch-ActivitySearchScreen-ActivitySearchDV-ActivitySearchRequiredInputSet-IncludeSubGroups']", AI = false)
	private WebElement rdbIncludeChildGroups;

	@IFindBy(how = How.CSS, using = "#ActivitySearch-ActivitySearchScreen-ActivitySearchDV-ActivitySearchOptionalInputSet-Description textarea", AI = false)
	private WebElement inpDescription;

	@IFindBy(how = How.CSS, using = "#ActivitySearch-ActivitySearchScreen-ActivitySearchDV-ActivitySearchRequiredInputSet-AssignedToGroup-GroupSearchMenuIcon>div[role='menuitem']", AI = false)
	private WebElement btnSearchforGroup;

	@IFindBy(how = How.CSS, using = "#ActivitySearch-ActivitySearchScreen-ActivitySearchDV-ActivitySearchRequiredInputSet-CreatedBy-CreatedByUserSearchMenuItem>div[role='menuitem']", AI = false)
	private WebElement btnSearchforaUser_1;

	@IFindBy(how = How.CSS, using = "#ActivitySearch-ActivitySearchScreen-ActivitySearchDV-SearchAndResetInputSet-SearchLinksInputSet-Search", AI = false)
	private WebElement btnSearch_3;

	@IFindBy(how = How.CSS, using = "input[name='ActivitySearch-ActivitySearchScreen-ActivitySearchDV-ActivitySearchOptionalInputSet-SubjectSubjectWidget']", AI = false)
	private WebElement inpSubjectSubjectWidget;

	@IFindBy(how = How.CSS, using = "select[name='ActivitySearch-ActivitySearchScreen-ActivitySearchDV-ActivitySearchOptionalInputSet-DateSearch-DateSearchChosenOption']", AI = false)
	private WebElement drpDateSearchChosenOption;

	@IFindBy(how = How.CSS, using = "select[name='ActivitySearch-ActivitySearchScreen-ActivitySearchDV-ActivitySearchOptionalInputSet-Status']", AI = false)
	private WebElement drpStatus;

	@IFindBy(how = How.CSS, using = "input[name='ActivitySearch-ActivitySearchScreen-ActivitySearchDV-ActivitySearchOptionalInputSet-DateSearch-DateSearchStartDate']", AI = false)
	private WebElement inpFrom;

	@IFindBy(how = How.CSS, using = "input[name='ActivitySearch-ActivitySearchScreen-ActivitySearchDV-ActivitySearchRequiredInputSet-Claims_ClaimNumber']", AI = false)
	private WebElement inpClaim;

	@IFindBy(how = How.CSS, using = "#ActivitySearch-ActivitySearchScreen-ActivitySearchDV-SearchAndResetInputSet-SearchLinksInputSet-Search", AI = false)
	private WebElement btnSearch;

	@IFindBy(how = How.CSS, using = "select[name='ActivitySearch-ActivitySearchScreen-ActivitySearchDV-ActivitySearchOptionalInputSet-SubjectPatternValueWidget']", AI = false)
	private WebElement drpSubjectPatternValueWidget;

	@IFindBy(how = How.CSS, using = "#ActivitySearch-ActivitySearchScreen-ActivitySearchDV-ActivitySearchRequiredInputSet-AssignedToUser-AssignedToUserMenuIcon>div[role='button']", AI = false)
	private WebElement btnAssignedToUserMenuIcon;

	@IFindBy(how = How.CSS, using = "select[name='ActivitySearch-ActivitySearchScreen-ActivitySearchDV-ActivitySearchOptionalInputSet-DateSearch-DateSearchRangeValue']", AI = false)
	private WebElement drpSince;

	@IFindBy(how = How.CSS, using = "#ActivitySearch-ActivitySearchScreen-ActivitySearchDV-ActivitySearchRequiredInputSet-ExternalOwner-MenuItem_NoneSelected>div[role='menuitem']", AI = false)
	private WebElement btnNoneselected;

	@IFindBy(how = How.CSS, using = "select[name='ActivitySearch-ActivitySearchScreen-ActivitySearchDV-ActivitySearchRequiredInputSet-CreatedBy']", AI = false)
	private WebElement drpCreatedBy;

	@IFindBy(how = How.CSS, using = "#ActivitySearch-ActivitySearchScreen-ActivitySearchDV-ActivitySearchRequiredInputSet-AssignedToUser-AssignedToUserUserSearchMenuItem>div[role='menuitem']", AI = false)
	private WebElement btnSearchforaUser;

	@IFindBy(how = How.CSS, using = "#ActivitySearch-ActivitySearchScreen-ActivitySearchDV-ActivitySearchRequiredInputSet-AssignedToUser-AssignedToUserUserSelectMenuItem>div[role='menuitem']", AI = false)
	private WebElement btnSelectUser;

	@IFindBy(how = How.CSS, using = "#ActivitySearch-ActivitySearchScreen-ActivitySearchDV-ActivitySearchOptionalInputSet-DateSearch-DateSearchStartDate_dateIcon", AI = false)
	private WebElement btnFromDateIcon;

	@IFindBy(how = How.CSS, using = "#ActivitySearch-ActivitySearchScreen-ActivitySearchDV-ActivitySearchRequiredInputSet-AssignedToGroup-AssignedToGroupMenuIcon>div[role='button']", AI = false)
	private WebElement btnAssignedToGroupMenuIcon;

	@IFindBy(how = How.CSS, using = "#ActivitySearch-ActivitySearchScreen-ActivitySearchDV-ActivitySearchRequiredInputSet-AssignedToGroup-GroupPickerMenuIcon>div[role='menuitem']", AI = false)
	private WebElement btnSelectGroup;

	@IFindBy(how = How.CSS, using = "#ActivitySearch-ActivitySearchScreen-ActivitySearchResultsLV_tb-ActivitySearch_AssignButton>div[role='button']", AI = false)
	private WebElement btnAssign;

	@IFindBy(how = How.CSS, using = "select[name='ActivitySearch-ActivitySearchScreen-ActivitySearchDV-ActivitySearchOptionalInputSet-Priority']", AI = false)
	private WebElement drpPriority;

	@IFindBy(how = How.CSS, using = "select[name='ActivitySearch-ActivitySearchScreen-ActivitySearchDV-ActivitySearchRequiredInputSet-AssignedToUser']", AI = false)
	private WebElement drpAssignedToUser;

	@IFindBy(how = How.CSS, using = "#ActivitySearch-ActivitySearchScreen-ActivitySearchDV-ActivitySearchRequiredInputSet-CreatedBy-CreatedByMenuIcon>div[role='button']", AI = false)
	private WebElement btnCreatedByMenuIcon;

	@IFindBy(how = How.CSS, using = "input[name='ActivitySearch-ActivitySearchScreen-ActivitySearchDV-ActivitySearchOptionalInputSet-DateSearch-DateSearchEndDate']", AI = false)
	private WebElement inpTo;

	@IFindBy(how = How.CSS, using = "#ActivitySearch-ActivitySearchScreen-ActivitySearchDV-SearchAndResetInputSet-SearchLinksInputSet-Reset", AI = false)
	private WebElement btnReset;

	@IFindBy(how = How.CSS, using = "#ActivitySearch-ActivitySearchScreen-ActivitySearchResultsLV_tb-ActivitySearch_PrintButton>div[role='button']", AI = false)
	private WebElement btnPrintExport;

	@IFindBy(how = How.CSS, using = "#ActivitySearch-ActivitySearchScreen-ActivitySearchDV-ActivitySearchRequiredInputSet-ExternalOwner-ExternalOwnerMenuIcon>div[role='button']", AI = false)
	private WebElement btnExternalOwnerMenuIcon;

	@IFindBy(how = How.CSS, using = "#ActivitySearch-ActivitySearchScreen-ActivitySearchDV-ActivitySearchOptionalInputSet-DateSearch-DateSearchEndDate_dateIcon", AI = false)
	private WebElement btnToDateIcon;
	
	@IFindBy(how = How.CSS, using = "div[id$='LV-0-ClaimNumber_button']", AI = false)
	private WebElement lnkClaimNumber;
	
	@IFindBy(how = How.CSS, using = "div[id$='LV-0-Insured']", AI = false)
	private WebElement txtInsured;
	
	@IFindBy(how = How.CSS, using = "td[id$='LV-0-PolicyID_Cell']", AI = false)
	private WebElement txtPolicy;
	
	@IFindBy(how = How.CSS, using = "div[id$='LV-0-Claimant']", AI = false)
	private WebElement txtClaimant;
	
	@IFindBy(how = How.CSS, using = "div[id$='-0-Status']", AI = false)
	private WebElement txtStatus;
	
	@IFindBy(how = How.CSS, using = "div[id$='LV-0-LossDate']", AI = false)
	private WebElement txtLossDate;
	
	@IFindBy(how = How.CSS, using = "div[id$='LV-0-Subject']", AI = false)
	private WebElement txtSubject;



	public SearchActivitiesPage(){
	}

	public SearchActivitiesPage(WebDriver driver){
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
		}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, btnToDateIcon))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);
}public SearchActivitiesPage clickSelectUser_2(WebDriver driver)  {
					BrowserActions.click(driver, btnSelectUser_2,"SelectUser_2");
				    return this;
			}
public SearchActivitiesPage selectAssignedToGroup(WebDriver driver,String AssignedToGroup)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpAssignedToGroup,AssignedToGroup,"AssignedToGroup");
				    return this;
			}
public SearchActivitiesPage clickIncludeChildGroups(WebDriver driver)  {
					BrowserActions.click(driver, rdbIncludeChildGroups,"IncludeChildGroups");
				    return this;
			}
public SearchActivitiesPage enterDescription(WebDriver driver,String Description) {
		            BrowserActions.type(driver, inpDescription,Description, "Description");
			        return this;
           }
public SearchActivitiesPage clickSearchforGroup(WebDriver driver)  {
					BrowserActions.click(driver, btnSearchforGroup,"SearchforGroup");
				    return this;
			}
public SearchActivitiesPage clickSearchforaUser_1(WebDriver driver)  {
					BrowserActions.click(driver, btnSearchforaUser_1,"SearchforaUser_1");
				    return this;
			}
public SearchActivitiesPage clickSearch_3(WebDriver driver)  {
					BrowserActions.click(driver, btnSearch_3,"Search_3");
				    return this;
			}
public SearchActivitiesPage enterSubjectSubjectWidget(WebDriver driver,String SubjectSubjectWidget) {
		            BrowserActions.type(driver, inpSubjectSubjectWidget,SubjectSubjectWidget, "SubjectSubjectWidget");
			        return this;
           }
public SearchActivitiesPage selectDateSearchChosenOption(WebDriver driver,String DateSearchChosenOption)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpDateSearchChosenOption,DateSearchChosenOption,"DateSearchChosenOption");
				    return this;
			}
public SearchActivitiesPage selectStatus(WebDriver driver,String Status)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpStatus,Status,"Status");
				    return this;
			}
public SearchActivitiesPage enterFrom(WebDriver driver,String From) {
		            BrowserActions.type(driver, inpFrom,From, "From");
			        return this;
           }
public SearchActivitiesPage enterClaim(WebDriver driver,String Claim) {
		            BrowserActions.type(driver, inpClaim,Claim, "Claim");
			        return this;
           }
public SearchActivitiesPage clickSearch(WebDriver driver)  {
					BrowserActions.click(driver, btnSearch,"Search");
				    return this;
			}
public SearchActivitiesPage selectSubjectPatternValueWidget(WebDriver driver,String SubjectPatternValueWidget)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpSubjectPatternValueWidget,SubjectPatternValueWidget,"SubjectPatternValueWidget");
				    return this;
			}
public SearchActivitiesPage clickAssignedToUserMenuIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnAssignedToUserMenuIcon,"AssignedToUserMenuIcon");
				    return this;
			}
public SearchActivitiesPage selectSince(WebDriver driver,String Since)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpSince,Since,"Since");
				    return this;
			}
public SearchActivitiesPage clickNoneselected(WebDriver driver)  {
					BrowserActions.click(driver, btnNoneselected,"Noneselected");
				    return this;
			}
public SearchActivitiesPage selectCreatedBy(WebDriver driver,String CreatedBy)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpCreatedBy,CreatedBy,"CreatedBy");
				    return this;
			}
public SearchActivitiesPage clickSearchforaUser(WebDriver driver)  {
					BrowserActions.click(driver, btnSearchforaUser,"SearchforaUser");
				    return this;
			}
public SearchActivitiesPage clickSelectUser(WebDriver driver)  {
					BrowserActions.click(driver, btnSelectUser,"SelectUser");
				    return this;
			}
public SearchActivitiesPage clickFromDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnFromDateIcon,"FromDateIcon");
				    return this;
			}
public SearchActivitiesPage clickAssignedToGroupMenuIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnAssignedToGroupMenuIcon,"AssignedToGroupMenuIcon");
				    return this;
			}
public SearchActivitiesPage clickSelectGroup(WebDriver driver)  {
					BrowserActions.click(driver, btnSelectGroup,"SelectGroup");
				    return this;
			}
public SearchActivitiesPage clickAssign(WebDriver driver)  {
					BrowserActions.click(driver, btnAssign,"Assign");
				    return this;
			}
public SearchActivitiesPage selectPriority(WebDriver driver,String Priority)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPriority,Priority,"Priority");
				    return this;
			}
public SearchActivitiesPage selectAssignedToUser(WebDriver driver,String AssignedToUser)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpAssignedToUser,AssignedToUser,"AssignedToUser");
				    return this;
			}
public SearchActivitiesPage clickCreatedByMenuIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnCreatedByMenuIcon,"CreatedByMenuIcon");
				    return this;
			}
public SearchActivitiesPage enterTo(WebDriver driver,String To) {
		            BrowserActions.type(driver, inpTo,To, "To");
			        return this;
           }
public SearchActivitiesPage clickReset(WebDriver driver)  {
					BrowserActions.click(driver, btnReset,"Reset");
				    return this;
			}
public SearchActivitiesPage clickPrintExport(WebDriver driver)  {
					BrowserActions.click(driver, btnPrintExport,"PrintExport");
				    return this;
			}
public SearchActivitiesPage clickExternalOwnerMenuIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnExternalOwnerMenuIcon,"ExternalOwnerMenuIcon");
				    return this;
			}
public SearchActivitiesPage clickToDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnToDateIcon,"ToDateIcon");
				    return this;
			}
public SearchActivitiesPage verifyClaimantValue(WebDriver driver)  {
	BrowserActions.verifyElementDisplayed(driver, lnkClaimNumber,"Claim Number");
	return this;
}
public SearchActivitiesPage verifyInsuredName(WebDriver driver)  {
BrowserActions.verifyElementDisplayed(driver, txtInsured,"Claim Number");
Log.messageStep("Insured Name is displayed",DriverManager.getDriver());		
return this;
}
public SearchActivitiesPage verifyPolicyValue(WebDriver driver)  {
BrowserActions.verifyElementDisplayed(driver, txtPolicy,"Policy Number");
return this;
}
public SearchActivitiesPage verifyClaimantName(WebDriver driver)  {
BrowserActions.verifyElementDisplayed(driver, txtClaimant,"Claimant Name");
return this;
}
public SearchActivitiesPage verifyLossDateValue(WebDriver driver)  {
BrowserActions.verifyElementDisplayed(driver, txtLossDate,"Loss Date Value");
return this;
}
public SearchActivitiesPage verifyStatusValue(WebDriver driver)  {
BrowserActions.verifyElementDisplayed(driver, txtStatus,"Status Value");
Log.messageStep("Status value is displayed",DriverManager.getDriver());		
return this;
}
public void clickClaimLink(WebDriver driver)  {
BrowserActions.click(driver, lnkClaimNumber,"Claim Link");
}
public SearchActivitiesPage verifySubjectValue(WebDriver driver)  {
BrowserActions.verifyElementDisplayed(driver, txtSubject,"Subject Value");
Log.messageStep("Subject Value is displayed",DriverManager.getDriver());		
return this;
}
}
