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

public class QueuedActivitiesPage extends LoadableComponent<QueuedActivitiesPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
 	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
//	/public TopNavBar topnavbar;
//	public DesktopQueuedActivities desktopqueuedactivitiesTable;

	@IFindBy(how = How.CSS, using = "#DesktopQueuedActivities-DesktopQueuedActivitiesScreen-DesktopQueuedActivities_AssignSelectedButton>div[role='button']", AI = false)
	private WebElement btnAssignSelectedToMe;

	@IFindBy(how = How.CSS, using = "input[name='DesktopQueuedActivities-DesktopQueuedActivitiesScreen-DesktopQueuedActivitiesLV-2-ExternallyOwned']", AI = false)
	private WebElement rdbExternal_25;

	@IFindBy(how = How.CSS, using = "#DesktopQueuedActivities-DesktopQueuedActivitiesScreen-DesktopQueuedActivities_RefreshButton>div[role='button']", AI = false)
	private WebElement btnRefresh;

	@IFindBy(how = How.CSS, using = "input[name='DesktopQueuedActivities-DesktopQueuedActivitiesScreen-DesktopQueuedActivitiesLV-2-NewActivity']", AI = false)
	private WebElement rdbNewActivity_14;

	@IFindBy(how = How.CSS, using = "#DesktopQueuedActivities-DesktopQueuedActivitiesScreen-DesktopQueuedActivitiesLV-1-DueDate_dateIcon", AI = false)
	private WebElement btnDueDateIcon_7;

	@IFindBy(how = How.CSS, using = "#DesktopQueuedActivities-DesktopQueuedActivitiesScreen-DesktopQueuedActivitiesLV-0-AssignmentDate_dateIcon", AI = false)
	private WebElement btnQueuedDateIcon;

	@IFindBy(how = How.CSS, using = "input[name='DesktopQueuedActivities-DesktopQueuedActivitiesScreen-DesktopQueuedActivitiesLV-2-Insured']", AI = false)
	private WebElement inpInsured_23;

	@IFindBy(how = How.CSS, using = "input[name='DesktopQueuedActivities-DesktopQueuedActivitiesScreen-DesktopQueuedActivitiesLV-1-Subject']", AI = false)
	private WebElement inpSubject_9;

	@IFindBy(how = How.CSS, using = "input[name='DesktopQueuedActivities-DesktopQueuedActivitiesScreen-DesktopQueuedActivitiesLV-1-ExternallyOwned']", AI = false)
	private WebElement rdbExternal_13;

	@IFindBy(how = How.CSS, using = "input[name='DesktopQueuedActivities-DesktopQueuedActivitiesScreen-DesktopQueuedActivitiesLV-2-DueDate']", AI = false)
	private WebElement inpDue_18;

	@IFindBy(how = How.CSS, using = "input[name='DesktopQueuedActivities-DesktopQueuedActivitiesScreen-DesktopQueuedActivitiesLV-0-Subject']", AI = false)
	private WebElement inpSubject;

	@IFindBy(how = How.CSS, using = "input[name='DesktopQueuedActivities-DesktopQueuedActivitiesScreen-DesktopQueuedActivitiesLV-0-Escalated']", AI = false)
	private WebElement rdbEscalated;

	@IFindBy(how = How.CSS, using = "#DesktopQueuedActivities-DesktopQueuedActivitiesScreen-DesktopQueuedActivitiesLV-2-AssignmentDate_dateIcon", AI = false)
	private WebElement btnQueuedDateIcon_17;

	@IFindBy(how = How.CSS, using = "select[name='DesktopQueuedActivities-DesktopQueuedActivitiesScreen-DesktopQueuedActivitiesLV-0-Priority']", AI = false)
	private WebElement drpPriority;

	@IFindBy(how = How.CSS, using = "#DesktopQueuedActivities-DesktopQueuedActivitiesScreen-DesktopQueuedActivities_AssignNextButton2>div[role='button']", AI = false)
	private WebElement btnAssignNextInQueueToMe_1;

	@IFindBy(how = How.CSS, using = "input[name='DesktopQueuedActivities-DesktopQueuedActivitiesScreen-DesktopQueuedActivitiesLV-0-Exposure']", AI = false)
	private WebElement inpExposures;

	@IFindBy(how = How.CSS, using = "input[name='DesktopQueuedActivities-DesktopQueuedActivitiesScreen-DesktopQueuedActivitiesLV-1-Exposure']", AI = false)
	private WebElement inpExposures_12;

	@IFindBy(how = How.CSS, using = "input[name='DesktopQueuedActivities-DesktopQueuedActivitiesScreen-DesktopQueuedActivitiesLV-0-ExternallyOwned']", AI = false)
	private WebElement rdbExternal;

	@IFindBy(how = How.CSS, using = "select[name='DesktopQueuedActivities-DesktopQueuedActivitiesScreen-DesktopQueuedActivitiesLV-2-Priority']", AI = false)
	private WebElement drpPriority_20;

	@IFindBy(how = How.CSS, using = "input[name='DesktopQueuedActivities-DesktopQueuedActivitiesScreen-DesktopQueuedActivitiesLV-0-AssignmentDate']", AI = false)
	private WebElement inpQueued;

	@IFindBy(how = How.CSS, using = "input[name='DesktopQueuedActivities-DesktopQueuedActivitiesScreen-DesktopQueuedActivitiesLV-0-CaseID']", AI = false)
	private WebElement inpClaim;

	@IFindBy(how = How.CSS, using = "input[name='DesktopQueuedActivities-DesktopQueuedActivitiesScreen-DesktopQueuedActivitiesLV-0-DueDate']", AI = false)
	private WebElement inpDue;

	@IFindBy(how = How.CSS, using = "input[name='DesktopQueuedActivities-DesktopQueuedActivitiesScreen-DesktopQueuedActivitiesLV-1-Escalated']", AI = false)
	private WebElement rdbEscalated_3;

	@IFindBy(how = How.CSS, using = "input[name='DesktopQueuedActivities-DesktopQueuedActivitiesScreen-DesktopQueuedActivitiesLV-0-Insured']", AI = false)
	private WebElement inpInsured;

	@IFindBy(how = How.CSS, using = "input[name='DesktopQueuedActivities-DesktopQueuedActivitiesScreen-DesktopQueuedActivitiesLV-2-Exposure']", AI = false)
	private WebElement inpExposures_24;

	@IFindBy(how = How.CSS, using = "#DesktopQueuedActivities-DesktopQueuedActivitiesScreen-DesktopQueuedActivitiesLV-2-DueDate_dateIcon", AI = false)
	private WebElement btnDueDateIcon_19;

	@IFindBy(how = How.CSS, using = "#DesktopQueuedActivities-DesktopQueuedActivitiesScreen-DesktopQueuedActivitiesLV-1-AssignmentDate_dateIcon", AI = false)
	private WebElement btnQueuedDateIcon_5;

	@IFindBy(how = How.CSS, using = "input[name='DesktopQueuedActivities-DesktopQueuedActivitiesScreen-DesktopQueuedActivitiesLV-0-NewActivity']", AI = false)
	private WebElement rdbNewActivity;

	@IFindBy(how = How.CSS, using = "input[name='DesktopQueuedActivities-DesktopQueuedActivitiesScreen-DesktopQueuedActivitiesLV-2-Subject']", AI = false)
	private WebElement inpSubject_21;

	@IFindBy(how = How.CSS, using = "select[name='DesktopQueuedActivities-DesktopQueuedActivitiesScreen-AvailableQueues']", AI = false)
	private WebElement drpAvailableQueues;

	@IFindBy(how = How.CSS, using = "#DesktopQueuedActivities-DesktopQueuedActivitiesScreen-DesktopQueuedActivities_PrintButton>div[role='button']", AI = false)
	private WebElement btnPrintExport;

	@IFindBy(how = How.CSS, using = "input[name='DesktopQueuedActivities-DesktopQueuedActivitiesScreen-DesktopQueuedActivitiesLV-1-Insured']", AI = false)
	private WebElement inpInsured_11;

	@IFindBy(how = How.CSS, using = "#DesktopQueuedActivities-DesktopQueuedActivitiesScreen-DesktopQueuedActivitiesLV-0-DueDate_dateIcon", AI = false)
	private WebElement btnDueDateIcon;

	@IFindBy(how = How.CSS, using = "input[name='DesktopQueuedActivities-DesktopQueuedActivitiesScreen-DesktopQueuedActivitiesLV-2-AssignmentDate']", AI = false)
	private WebElement inpQueued_16;

	@IFindBy(how = How.CSS, using = "input[name='DesktopQueuedActivities-DesktopQueuedActivitiesScreen-DesktopQueuedActivitiesLV-1-AssignmentDate']", AI = false)
	private WebElement inpQueued_4;

	@IFindBy(how = How.CSS, using = "input[name='DesktopQueuedActivities-DesktopQueuedActivitiesScreen-DesktopQueuedActivitiesLV-1-CaseID']", AI = false)
	private WebElement inpClaim_10;

	@IFindBy(how = How.CSS, using = "input[name='DesktopQueuedActivities-DesktopQueuedActivitiesScreen-DesktopQueuedActivitiesLV-1-DueDate']", AI = false)
	private WebElement inpDue_6;

	@IFindBy(how = How.CSS, using = "input[name='DesktopQueuedActivities-DesktopQueuedActivitiesScreen-DesktopQueuedActivitiesLV-1-NewActivity']", AI = false)
	private WebElement rdbNewActivity_2;

	@IFindBy(how = How.CSS, using = "#DesktopQueuedActivities-DesktopQueuedActivitiesScreen-DesktopQueuedActivities_AssignNextButton>div[role='button']", AI = false)
	private WebElement btnAssignNextInQueueToMe;

	@IFindBy(how = How.CSS, using = "select[name='DesktopQueuedActivities-DesktopQueuedActivitiesScreen-DesktopQueuedActivitiesLV-1-Priority']", AI = false)
	private WebElement drpPriority_8;

	@IFindBy(how = How.CSS, using = "input[name='DesktopQueuedActivities-DesktopQueuedActivitiesScreen-DesktopQueuedActivitiesLV-2-CaseID']", AI = false)
	private WebElement inpClaim_22;

	@IFindBy(how = How.CSS, using = "#DesktopQueuedActivities-DesktopQueuedActivitiesScreen-DesktopQueuedActivities_AssignButton>div[role='button']", AI = false)
	private WebElement btnAssign;

	@IFindBy(how = How.CSS, using = "input[name='DesktopQueuedActivities-DesktopQueuedActivitiesScreen-DesktopQueuedActivitiesLV-2-Escalated']", AI = false)
	private WebElement rdbEscalated_15;
	
	@IFindBy(how = How.CSS, using = "div[id$='DesktopQueuedActivitiesScreen']", AI = false)
	private WebElement lblttlbar;

	public QueuedActivitiesPage(){
	}

	public QueuedActivitiesPage(WebDriver driver) {
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(finder, this);
		//desktopqueuedactivitiesTable = new DesktopQueuedActivities();
}
@Override
	protected void load() {
		isPageLoaded = true;
		WaitUtils.waitForPageLoad(driver);
	}@Override
	protected void isLoaded() {
		if (!isPageLoaded) {
			Assert.fail();
		}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, lblttlbar))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);
}public QueuedActivitiesPage clickAssignSelectedToMe(WebDriver driver)  {
					BrowserActions.click(driver, btnAssignSelectedToMe,"AssignSelectedToMe");
				    return this;
			}
public QueuedActivitiesPage clickExternal_25(WebDriver driver)  {
					BrowserActions.click(driver, rdbExternal_25,"External_25");
				    return this;
			}
public QueuedActivitiesPage clickRefresh(WebDriver driver)  {
					BrowserActions.click(driver, btnRefresh,"Refresh");
				    return this;
			}
public QueuedActivitiesPage clickNewActivity_14(WebDriver driver)  {
					BrowserActions.click(driver, rdbNewActivity_14,"NewActivity_14");
				    return this;
			}
public QueuedActivitiesPage clickDueDateIcon_7(WebDriver driver)  {
					BrowserActions.click(driver, btnDueDateIcon_7,"DueDateIcon_7");
				    return this;
			}
public QueuedActivitiesPage clickQueuedDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnQueuedDateIcon,"QueuedDateIcon");
				    return this;
			}
public QueuedActivitiesPage enterInsured_23(WebDriver driver,String Insured_23) {
		            BrowserActions.type(driver, inpInsured_23,Insured_23, "Insured_23");
			        return this;
           }
public QueuedActivitiesPage enterSubject_9(WebDriver driver,String Subject_9) {
		            BrowserActions.type(driver, inpSubject_9,Subject_9, "Subject_9");
			        return this;
           }
public QueuedActivitiesPage clickExternal_13(WebDriver driver)  {
					BrowserActions.click(driver, rdbExternal_13,"External_13");
				    return this;
			}
public QueuedActivitiesPage enterDue_18(WebDriver driver,String Due_18) {
		            BrowserActions.type(driver, inpDue_18,Due_18, "Due_18");
			        return this;
           }
public QueuedActivitiesPage enterSubject(WebDriver driver,String Subject) {
		            BrowserActions.type(driver, inpSubject,Subject, "Subject");
			        return this;
           }
public QueuedActivitiesPage clickEscalated(WebDriver driver)  {
					BrowserActions.click(driver, rdbEscalated,"Escalated");
				    return this;
			}
public QueuedActivitiesPage clickQueuedDateIcon_17(WebDriver driver)  {
					BrowserActions.click(driver, btnQueuedDateIcon_17,"QueuedDateIcon_17");
				    return this;
			}
public QueuedActivitiesPage selectPriority(WebDriver driver,String Priority)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPriority,Priority,"Priority");
				    return this;
			}
public QueuedActivitiesPage clickAssignNextInQueueToMe_1(WebDriver driver)  {
					BrowserActions.click(driver, btnAssignNextInQueueToMe_1,"AssignNextInQueueToMe_1");
				    return this;
			}
public QueuedActivitiesPage enterExposures(WebDriver driver,String Exposures) {
		            BrowserActions.type(driver, inpExposures,Exposures, "Exposures");
			        return this;
           }
public QueuedActivitiesPage enterExposures_12(WebDriver driver,String Exposures_12) {
		            BrowserActions.type(driver, inpExposures_12,Exposures_12, "Exposures_12");
			        return this;
           }
public QueuedActivitiesPage clickExternal(WebDriver driver)  {
					BrowserActions.click(driver, rdbExternal,"External");
				    return this;
			}
public QueuedActivitiesPage selectPriority_20(WebDriver driver,String Priority_20)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPriority_20,Priority_20,"Priority_20");
				    return this;
			}
public QueuedActivitiesPage enterQueued(WebDriver driver,String Queued) {
		            BrowserActions.type(driver, inpQueued,Queued, "Queued");
			        return this;
           }
public QueuedActivitiesPage enterClaim(WebDriver driver,String Claim) {
		            BrowserActions.type(driver, inpClaim,Claim, "Claim");
			        return this;
           }
public QueuedActivitiesPage enterDue(WebDriver driver,String Due) {
		            BrowserActions.type(driver, inpDue,Due, "Due");
			        return this;
           }
public QueuedActivitiesPage clickEscalated_3(WebDriver driver)  {
					BrowserActions.click(driver, rdbEscalated_3,"Escalated_3");
				    return this;
			}
public QueuedActivitiesPage enterInsured(WebDriver driver,String Insured) {
		            BrowserActions.type(driver, inpInsured,Insured, "Insured");
			        return this;
           }
public QueuedActivitiesPage enterExposures_24(WebDriver driver,String Exposures_24) {
		            BrowserActions.type(driver, inpExposures_24,Exposures_24, "Exposures_24");
			        return this;
           }
public QueuedActivitiesPage clickDueDateIcon_19(WebDriver driver)  {
					BrowserActions.click(driver, btnDueDateIcon_19,"DueDateIcon_19");
				    return this;
			}
public QueuedActivitiesPage clickQueuedDateIcon_5(WebDriver driver)  {
					BrowserActions.click(driver, btnQueuedDateIcon_5,"QueuedDateIcon_5");
				    return this;
			}
public QueuedActivitiesPage clickNewActivity(WebDriver driver)  {
					BrowserActions.click(driver, rdbNewActivity,"NewActivity");
				    return this;
			}
public QueuedActivitiesPage enterSubject_21(WebDriver driver,String Subject_21) {
		            BrowserActions.type(driver, inpSubject_21,Subject_21, "Subject_21");
			        return this;
           }
public QueuedActivitiesPage selectAvailableQueues(WebDriver driver,String AvailableQueues)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpAvailableQueues,AvailableQueues,"AvailableQueues");
				    return this;
			}
public QueuedActivitiesPage clickPrintExport(WebDriver driver)  {
					BrowserActions.click(driver, btnPrintExport,"PrintExport");
				    return this;
			}
public QueuedActivitiesPage enterInsured_11(WebDriver driver,String Insured_11) {
		            BrowserActions.type(driver, inpInsured_11,Insured_11, "Insured_11");
			        return this;
           }
public QueuedActivitiesPage clickDueDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnDueDateIcon,"DueDateIcon");
				    return this;
			}
public QueuedActivitiesPage enterQueued_16(WebDriver driver,String Queued_16) {
		            BrowserActions.type(driver, inpQueued_16,Queued_16, "Queued_16");
			        return this;
           }
public QueuedActivitiesPage enterQueued_4(WebDriver driver,String Queued_4) {
		            BrowserActions.type(driver, inpQueued_4,Queued_4, "Queued_4");
			        return this;
           }
public QueuedActivitiesPage enterClaim_10(WebDriver driver,String Claim_10) {
		            BrowserActions.type(driver, inpClaim_10,Claim_10, "Claim_10");
			        return this;
           }
public QueuedActivitiesPage enterDue_6(WebDriver driver,String Due_6) {
		            BrowserActions.type(driver, inpDue_6,Due_6, "Due_6");
			        return this;
           }
public QueuedActivitiesPage clickNewActivity_2(WebDriver driver)  {
					BrowserActions.click(driver, rdbNewActivity_2,"NewActivity_2");
				    return this;
			}
public QueuedActivitiesPage clickAssignNextInQueueToMe(WebDriver driver)  {
					BrowserActions.click(driver, btnAssignNextInQueueToMe,"AssignNextInQueueToMe");
				    return this;
			}
public QueuedActivitiesPage selectPriority_8(WebDriver driver,String Priority_8)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPriority_8,Priority_8,"Priority_8");
				    return this;
			}
public QueuedActivitiesPage enterClaim_22(WebDriver driver,String Claim_22) {
		            BrowserActions.type(driver, inpClaim_22,Claim_22, "Claim_22");
			        return this;
           }
public QueuedActivitiesPage clickAssign(WebDriver driver)  {
					BrowserActions.click(driver, btnAssign,"Assign");
				    return this;
			}
public QueuedActivitiesPage clickEscalated_15(WebDriver driver)  {
					BrowserActions.click(driver, rdbEscalated_15,"Escalated_15");
				    return this;
			}
public QueuedActivitiesPage verifyAssignNextInQueueToMe(WebDriver driver)  {
	BrowserActions.verifyElementDisplayed(driver, btnAssignNextInQueueToMe,"AssignNextInQueueToMe");
    return this;
}
public QueuedActivitiesPage verifyRefresh(WebDriver driver)  {
	BrowserActions.verifyElementDisplayed(driver, btnRefresh,"Refresh");
	return this;
}
public QueuedActivitiesPage verifyPrintExport(WebDriver driver)  {
	BrowserActions.verifyElementDisplayed(driver, btnPrintExport,"PrintExport");
	Log.messageStep("AssignSelectedTome , Assign , Refresh , Print Export buttons were Displayed ",DriverManager.getDriver());
	return this;
}
public QueuedActivitiesPage verifyAssignSelectToMe(WebDriver driver)  {
	BrowserActions.verifyElementDisplayed(driver, btnAssignSelectedToMe,"Assign Select To me");
	return this;
}
public QueuedActivitiesPage verifyAssign(WebDriver driver)  {
	BrowserActions.verifyElementDisplayed(driver, btnAssign,"Assign");
	return this;
}
}
