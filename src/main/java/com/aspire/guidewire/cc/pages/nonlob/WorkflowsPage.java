package com.aspire.guidewire.cc.pages.nonlob;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.aspire.guidewire.utils.BrowserActions;
import com.aspire.guidewire.utils.ElementLayer;
import com.aspire.guidewire.utils.Log;
import com.aspire.guidewire.utils.WaitUtils;

import ASPIREAI.customfactories.AjaxElementLocatorFactory;
import ASPIREAI.customfactories.IFindBy;
import ASPIREAI.customfactories.PageFactory;

public class WorkflowsPage extends LoadableComponent<WorkflowsPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
 	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
//	public TopNavBar topnavbar;
	@IFindBy(how = How.CSS, using = "select[name='WorkflowSearch-WorkflowSearchScreen-WorkflowsDV-Type']", AI = false)
	public WebElement drpWorkflowType;

	@IFindBy(how = How.CSS, using = "#WorkflowSearch-WorkflowSearchScreen-ttlBar", AI = false)
	public WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "#WorkflowSearch-WorkflowSearchScreen-WorkflowsDV-SearchAndResetInputSet-SearchLinksInputSet-Search", AI = false)
	public WebElement btnSearch;

	@IFindBy(how = How.CSS, using = "input[name='WorkflowSearch-WorkflowSearchScreen-WorkflowsDV-StartDateFrom']", AI = false)
	public WebElement inpStartDateRangeFrom;

	@IFindBy(how = How.CSS, using = "#WorkflowSearch-WorkflowSearchScreen-WorkflowsDV-UpdateDateFrom_dateIcon", AI = false)
	public WebElement btnUpdateDateRangeFromDateIcon;

	@IFindBy(how = How.CSS, using = "#WorkflowSearch-WorkflowSearchScreen-WorkflowsLV_tb-Workflows_ManageButton>div[role='button']", AI = false)
	public WebElement btnManageselectedworkflows;

	@IFindBy(how = How.CSS, using = "#WorkflowSearch-WorkflowSearchScreen-WorkflowsDV-UpdateDateTo_dateIcon", AI = false)
	public WebElement btnUpdateDateRangeToDateIcon;

	@IFindBy(how = How.CSS, using = "#WorkflowSearch-WorkflowSearchScreen-WorkflowsDV-StartDateFrom_dateIcon", AI = false)
	public WebElement btnStartDateRangeFromDateIcon;

	@IFindBy(how = How.CSS, using = "select[name='WorkflowSearch-WorkflowSearchScreen-WorkflowsDV-Version']", AI = false)
	public WebElement drpVersion;

	@IFindBy(how = How.CSS, using = "input[name='WorkflowSearch-WorkflowSearchScreen-WorkflowsDV-UpdateDateFrom']", AI = false)
	public WebElement inpUpdateDateRangeFrom;

	@IFindBy(how = How.CSS, using = "#WorkflowSearch-WorkflowSearchScreen-WorkflowsLV_tb-Workflows_ManageAllButton>div[role='button']", AI = false)
	public WebElement btnManageallworkflows;

	@IFindBy(how = How.CSS, using = "select[name='WorkflowSearch-WorkflowSearchScreen-WorkflowsDV-CurrentStep']", AI = false)
	public WebElement drpCurrentStep;

	@IFindBy(how = How.CSS, using = "input[name='WorkflowSearch-WorkflowSearchScreen-WorkflowsDV-UpdateDateTo']", AI = false)
	public WebElement inpUpdateDateRangeTo;

	@IFindBy(how = How.CSS, using = "input[name='WorkflowSearch-WorkflowSearchScreen-WorkflowsDV-StartDateTo']", AI = false)
	public WebElement inpStartDateRangeTo;

	@IFindBy(how = How.CSS, using = "select[name='WorkflowSearch-WorkflowSearchScreen-WorkflowsDV-Handler']", AI = false)
	public WebElement drpHandler;

	@IFindBy(how = How.CSS, using = "#WorkflowSearch-WorkflowSearchScreen-WorkflowsDV-StartDateTo_dateIcon", AI = false)
	public WebElement btnStartDateRangeToDateIcon;

	@IFindBy(how = How.CSS, using = "select[name='WorkflowSearch-WorkflowSearchScreen-WorkflowsDV-State']", AI = false)
	public WebElement drpStatus;

	@IFindBy(how = How.CSS, using = "#WorkflowSearch-WorkflowSearchScreen-WorkflowsDV-SearchAndResetInputSet-SearchLinksInputSet-Reset", AI = false)
	public WebElement btnReset;

	@IFindBy(how = How.CSS, using = "div[id$='_msgs-0']", AI = false)
	public WebElement lblZeroResultsMsg;

	public WorkflowsPage(){
	}

	public WorkflowsPage(WebDriver driver) {
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
		}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, btnReset))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);
}public WorkflowsPage selectWorkflowType(WebDriver driver,String WorkflowType)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpWorkflowType,WorkflowType,"WorkflowType");
				    return this;
			}
public WorkflowsPage clickSearch(WebDriver driver)  {
					BrowserActions.click(driver, btnSearch,"Search");
				    return this;
			}
public WorkflowsPage enterStartDateRangeFrom(WebDriver driver,String StartDateRangeFrom) {
		            BrowserActions.type(driver, inpStartDateRangeFrom,StartDateRangeFrom, "StartDateRangeFrom");
			        return this;
           }
public WorkflowsPage clickUpdateDateRangeFromDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnUpdateDateRangeFromDateIcon,"UpdateDateRangeFromDateIcon");
				    return this;
			}
public WorkflowsPage clickManageselectedworkflows(WebDriver driver)  {
					BrowserActions.click(driver, btnManageselectedworkflows,"Manageselectedworkflows");
				    return this;
			}
public WorkflowsPage clickUpdateDateRangeToDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnUpdateDateRangeToDateIcon,"UpdateDateRangeToDateIcon");
				    return this;
			}
public WorkflowsPage clickStartDateRangeFromDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnStartDateRangeFromDateIcon,"StartDateRangeFromDateIcon");
				    return this;
			}
public WorkflowsPage selectVersion(WebDriver driver,String Version)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpVersion,Version,"Version");
				    return this;
			}
public WorkflowsPage enterUpdateDateRangeFrom(WebDriver driver,String UpdateDateRangeFrom) {
		            BrowserActions.type(driver, inpUpdateDateRangeFrom,UpdateDateRangeFrom, "UpdateDateRangeFrom");
			        return this;
           }
public WorkflowsPage clickManageallworkflows(WebDriver driver)  {
					BrowserActions.click(driver, btnManageallworkflows,"Manageallworkflows");
				    return this;
			}
public WorkflowsPage selectCurrentStep(WebDriver driver,String CurrentStep)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpCurrentStep,CurrentStep,"CurrentStep");
				    return this;
			}
public WorkflowsPage enterUpdateDateRangeTo(WebDriver driver,String UpdateDateRangeTo) {
		            BrowserActions.type(driver, inpUpdateDateRangeTo,UpdateDateRangeTo, "UpdateDateRangeTo");
			        return this;
           }
public WorkflowsPage enterStartDateRangeTo(WebDriver driver,String StartDateRangeTo) {
		            BrowserActions.type(driver, inpStartDateRangeTo,StartDateRangeTo, "StartDateRangeTo");
			        return this;
           }
public WorkflowsPage selectHandler(WebDriver driver,String Handler)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpHandler,Handler,"Handler");
				    return this;
			}
public WorkflowsPage clickStartDateRangeToDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnStartDateRangeToDateIcon,"StartDateRangeToDateIcon");
				    return this;
			}
public WorkflowsPage selectStatus(WebDriver driver,String Status)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpStatus,Status,"Status");
				    return this;
			}
public WorkflowsPage clickReset(WebDriver driver)  {
					BrowserActions.click(driver, btnReset,true,1,"Reset");
				    return this;
			}
public WorkflowsPage verifyZeroResultError(WebDriver driver)  {
	BrowserActions.verifyElementDisplayed(driver, lblZeroResultsMsg,"Zero result error");
	return this;
}

public void verifyDateFieldsAreResetted(WebDriver driver) {
Boolean DateFromBoolean = isAttribtuePresent(inpStartDateRangeFrom, "data-gw-prev");
Boolean DateToBoolean = isAttribtuePresent(inpStartDateRangeTo, "data-gw-prev");
Log.assertThat(DateFromBoolean && DateToBoolean , "Date Fields got resetted", "Date fields not got resetted");
}

/**
 * @author charu.anbarasan
 * verify isAttribtuePresent
 * @param element
 * @param attribute
 * @return
 */
public boolean isAttribtuePresent(WebElement element, String attribute) {
    Boolean result = true;
    try {
        String value = element.getAttribute(attribute);
        if (value != null){
            result = false;
        }
    } catch (Exception e) {}

    return result;
}

public WorkflowsPage verifyDefaultSelectedValueWorkflowType(WebDriver driver,String textExpected){
	BrowserActions.waitForNetworkIdleState(driver, 2);
	Select select=new Select(drpWorkflowType);
	String selectedOption = select.getFirstSelectedOption().getText();
	Log.softAssertThat(selectedOption.equals(textExpected), "Workflow Type Default is "+textExpected+" is Matching", "Workflow Type Default is"+textExpected+"is not Matching");
	return this;
}

public WorkflowsPage verifyDefaultSelectedValueHandler(WebDriver driver,String textExpected){
	BrowserActions.waitForNetworkIdleState(driver, 2);
	Select select=new Select(drpHandler);
	String selectedOption = select.getFirstSelectedOption().getText();
	Log.softAssertThat(selectedOption.equals(textExpected), "Handler Default is "+textExpected+" is Matching", "Handler Default is"+textExpected+"is not Matching");
	return this;
}

public WorkflowsPage verifyDefaultSelectedValueStatus(WebDriver driver,String textExpected){
	BrowserActions.waitForNetworkIdleState(driver, 2);
	Select select=new Select(drpStatus);
	String selectedOption = select.getFirstSelectedOption().getText();
	Log.softAssertThat(selectedOption.equals(textExpected), "Status default is "+textExpected+" is Matching", "Status Default is"+textExpected+"is not Matching");
	return this;
}

}
