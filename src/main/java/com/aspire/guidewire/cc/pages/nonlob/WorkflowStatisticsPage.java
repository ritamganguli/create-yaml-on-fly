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
import com.aspire.guidewire.utils.Utils;
import com.aspire.guidewire.utils.WaitUtils;

import ASPIREAI.customfactories.AjaxElementLocatorFactory;
import ASPIREAI.customfactories.IFindBy;
import ASPIREAI.customfactories.PageFactory;

public class WorkflowStatisticsPage extends LoadableComponent<WorkflowStatisticsPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
 	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
//	public TopNavBar topnavbar;
	@IFindBy(how = How.CSS, using = "select[name='WorkflowStats-WorkflowStatsScreen-WorkflowStatsDV-Type']", AI = false)
	public WebElement drpWorkflowType;

	@IFindBy(how = How.CSS, using = "#WorkflowStats-WorkflowStatsScreen-ttlBar", AI = false)
	public WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "#WorkflowStats-WorkflowStatsScreen-WorkflowStatsDV-SearchAndResetInputSet-SearchLinksInputSet-Search", AI = false)
	public WebElement btnSearch;

	@IFindBy(how = How.CSS, using = "#WorkflowStats-WorkflowStatsScreen-WorkflowStatsDV-DateFrom_dateIcon", AI = false)
	public WebElement btnFromDateIcon;

	@IFindBy(how = How.CSS, using = "input[name='WorkflowStats-WorkflowStatsScreen-WorkflowStatsDV-DateFrom']", AI = false)
	public WebElement inpFrom;

	@IFindBy(how = How.CSS, using = "input[name='WorkflowStats-WorkflowStatsScreen-WorkflowStatsDV-DateTo']", AI = false)
	public WebElement inpTo;

	@IFindBy(how = How.CSS, using = "#WorkflowStats-WorkflowStatsScreen-WorkflowStatsDV-SearchAndResetInputSet-SearchLinksInputSet-Reset", AI = false)
	public WebElement btnReset;

	@IFindBy(how = How.CSS, using = "#WorkflowStats-WorkflowStatsScreen-WorkflowStatsDV-DateTo_dateIcon", AI = false)
	public WebElement btnToDateIcon;
	
	@IFindBy(how = How.CSS, using = "div[id$='_msgs-0']", AI = false)
	public WebElement lblZeroResultsMsg;

	public WorkflowStatisticsPage(){
	}

	public WorkflowStatisticsPage(WebDriver driver){
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
		}if (isPageLoaded && !(Utils.waitForElement(driver, btnToDateIcon))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);
}public WorkflowStatisticsPage selectWorkflowType(WebDriver driver,String WorkflowType)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpWorkflowType,WorkflowType,"WorkflowType");
				    return this;
			}
public WorkflowStatisticsPage clickSearch(WebDriver driver)  {
					BrowserActions.click(driver, btnSearch,"Search");
				    return this;
			}
public WorkflowStatisticsPage clickFromDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnFromDateIcon,"FromDateIcon");
				    return this;
			}
public WorkflowStatisticsPage enterFrom(WebDriver driver,String From) {
		            BrowserActions.type(driver, inpFrom,From, "From");
			        return this;
           }
public WorkflowStatisticsPage enterTo(WebDriver driver,String To) {
		            BrowserActions.type(driver, inpTo,To, "To");
			        return this;
           }
public WorkflowStatisticsPage clickReset(WebDriver driver)  {
					BrowserActions.click(driver, btnReset,true,"Reset");
				    return this;
			}
public WorkflowStatisticsPage clickToDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnToDateIcon,"ToDateIcon");
				    return this;
			}
public WorkflowStatisticsPage verifyZeroResultError(WebDriver driver)  {
	BrowserActions.verifyElementDisplayed(driver, lblZeroResultsMsg,"Zero result error");
	return this;
}

public WorkflowStatisticsPage verifyDefaultSelectedValueWorkflowType(WebDriver driver,String textExpected){
	BrowserActions.waitForNetworkIdleState(driver,2);
	//BrowserActions.waitForElementToDisplay(driver, drpWorkflowType);
	Select select=new Select(drpWorkflowType);
	String selectedOption = select.getFirstSelectedOption().getText();
	Log.softAssertThat(selectedOption.equals(textExpected), "Workflow Type Default is " +textExpected+ " is Matching", "Workflow Type Default is "+textExpected+"is not Matching");
	return this;
}


public void verifyDateFieldsAreResetted(WebDriver driver) {
Boolean DateFromBoolean = isAttribtuePresent(inpFrom, "data-gw-prev");
Boolean DateToBoolean = isAttribtuePresent(inpTo, "data-gw-prev");
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
}
