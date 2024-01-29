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

public class SummaryPage extends LoadableComponent<SummaryPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
 	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
//	public TopNavBar topnavbar;
//	public ClaimSummaryExposures claimsummaryexposuresTable;
//
//	public PeopleInvolved peopleinvolvedTable;
//
//	public ClaimSummaryActivities claimsummaryactivitiesTable;

	@IFindBy(how = How.CSS, using = "#ClaimSummary-ClaimSummaryScreen-ClaimSummaryExposuresLV-0-StatusIcon", AI = false)
	private WebElement btnStatusIcon;

	@IFindBy(how = How.CSS, using = "#ClaimSummary-ClaimSummaryScreen-Description textarea", AI = false)
	private WebElement inpDescription;

	@IFindBy(how = How.CSS, using = "input[name='ClaimSummary-ClaimSummaryScreen-PeopleInvolvedLV-0-Roles']", AI = false)
	private WebElement inpRoles;

	@IFindBy(how = How.CSS, using = "input[name='ClaimSummary-ClaimSummaryScreen-PeopleInvolvedLV-1-Name']", AI = false)
	private WebElement inpName_13;

	@IFindBy(how = How.CSS, using = "#ClaimSummary-ClaimSummaryScreen-ViewClaimOtherInstructions", AI = false)
	private WebElement btnOtherInstructions;

	@IFindBy(how = How.CSS, using = "#ClaimSummary-ClaimSummaryScreen-ClaimSummaryActivitiesLV-2-DueDate_dateIcon", AI = false)
	private WebElement btnDueDateIcon_9;

	@IFindBy(how = How.CSS, using = "input[name='ClaimSummary-ClaimSummaryScreen-WC_RTW-ReturnToWorkInputSet-ReturnToModWorkDate']", AI = false)
	private WebElement inpReturntoModifiedDuty;

	@IFindBy(how = How.CSS, using = "#ClaimSummary-ClaimSummaryScreen-ReportDate_dateIcon", AI = false)
	private WebElement btnNoticeDateDateIcon;

	@IFindBy(how = How.CSS, using = "#ClaimSummary-ClaimSummaryScreen-ClaimSummaryActivitiesLV-1-DueDate_dateIcon", AI = false)
	private WebElement btnDueDateIcon_4;

	@IFindBy(how = How.CSS, using = "input[name='ClaimSummary-ClaimSummaryScreen-ClaimSummaryActivitiesLV-2-Subject']", AI = false)
	private WebElement inpSubject_11;

	@IFindBy(how = How.CSS, using = "input[name='ClaimSummary-ClaimSummaryScreen-PeopleInvolvedLV-1-Roles']", AI = false)
	private WebElement inpRoles_14;

	@IFindBy(how = How.CSS, using = "input[name='ClaimSummary-ClaimSummaryScreen-ClaimSummaryActivitiesLV-1-DueDate']", AI = false)
	private WebElement inpDue_3;

	@IFindBy(how = How.CSS, using = "input[name='ClaimSummary-ClaimSummaryScreen-Paid']", AI = false)
	private WebElement inpPaid;

	@IFindBy(how = How.CSS, using = "input[name='ClaimSummary-ClaimSummaryScreen-ClaimSummaryActivitiesLV-2-AssignedUser']", AI = false)
	private WebElement inpAssignedTo_12;

	@IFindBy(how = How.CSS, using = "input[name='ClaimSummary-ClaimSummaryScreen-ClaimClosedText']", AI = false)
	private WebElement inpOpen;

	@IFindBy(how = How.CSS, using = "input[name='ClaimSummary-ClaimSummaryScreen-ClaimSummaryActivitiesLV-1-Subject']", AI = false)
	private WebElement inpSubject_6;

	@IFindBy(how = How.CSS, using = "input[name='ClaimSummary-ClaimSummaryScreen-DaysOpenText']", AI = false)
	private WebElement inpDaysOpenText;

	@IFindBy(how = How.CSS, using = "#ClaimSummary-ClaimSummaryScreen-MedicalProviderThreePointContact", AI = false)
	private WebElement btnMedicalProviderThreePointContact;

	@IFindBy(how = How.CSS, using = "input[name='ClaimSummary-ClaimSummaryScreen-ClaimSummaryActivitiesLV-0-Subject']", AI = false)
	private WebElement inpSubject;

	@IFindBy(how = How.CSS, using = "input[name='ClaimSummary-ClaimSummaryScreen-ClaimSummaryActivitiesLV-0-AssignedUser']", AI = false)
	private WebElement inpAssignedTo;

	@IFindBy(how = How.CSS, using = "input[name='ClaimSummary-ClaimSummaryScreen-WC_RTW-ReturnToWorkInputSet-ReturnToWorkDate']", AI = false)
	private WebElement inpReturntoNormalDuty;

	@IFindBy(how = How.CSS, using = "#ClaimSummary-ClaimSummaryScreen-WC_RTW-ReturnToWorkInputSet-ReturnToWorkDate_dateIcon", AI = false)
	private WebElement btnReturntoNormalDutyDateIcon;

	@IFindBy(how = How.CSS, using = "input[name='ClaimSummary-ClaimSummaryScreen-ReportDate']", AI = false)
	private WebElement inpNoticeDate;

	@IFindBy(how = How.CSS, using = "select[name='ClaimSummary-ClaimSummaryScreen-ClaimSummaryExposuresLV-0-Type']", AI = false)
	private WebElement drpType;

	@IFindBy(how = How.CSS, using = "#ClaimSummary-ClaimSummaryScreen-EmployerThreePointContact", AI = false)
	private WebElement btnEmployerThreePointContact;

	@IFindBy(how = How.CSS, using = "select[name='ClaimSummary-ClaimSummaryScreen-ClaimSummaryActivitiesLV-0-Priority']", AI = false)
	private WebElement drpPriority;

	@IFindBy(how = How.CSS, using = "#ClaimSummary-ClaimSummaryScreen-EmployeeThreePointContact", AI = false)
	private WebElement btnEmployeeThreePointContact;

	@IFindBy(how = How.CSS, using = "input[name='ClaimSummary-ClaimSummaryScreen-PeopleInvolvedLV-0-Phone']", AI = false)
	private WebElement inpPhone;

	@IFindBy(how = How.CSS, using = "#ClaimSummary-ClaimSummaryScreen-ttlBar", AI = false)
	private WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "#ClaimSummary-ClaimSummaryScreen-ClaimSummaryActivitiesLV-0-DueDate_dateIcon", AI = false)
	private WebElement btnDueDateIcon;

	@IFindBy(how = How.CSS, using = "input[name='ClaimSummary-ClaimSummaryScreen-WC_RTW-ReturnToWorkInputSet-RTModWReadOnlyMSG']", AI = false)
	private WebElement inpReturntoModifiedDuty_1;

	@IFindBy(how = How.CSS, using = "#ClaimSummary-ClaimSummaryScreen-WC_RTW-ReturnToWorkInputSet-ReturnToModWorkDate_dateIcon", AI = false)
	private WebElement btnReturntoModifiedDutyDateIcon;

	@IFindBy(how = How.CSS, using = "input[name='ClaimSummary-ClaimSummaryScreen-WC_RTW-ReturnToWorkInputSet-ReturnToWorkActual']", AI = false)
	private WebElement rdbReturnToWorkActual;

	@IFindBy(how = How.CSS, using = "input[name='ClaimSummary-ClaimSummaryScreen-ClaimSummaryExposuresLV-0-Order']", AI = false)
	private WebElement inpOrder;

	@IFindBy(how = How.CSS, using = "input[name='ClaimSummary-ClaimSummaryScreen-LossDate']", AI = false)
	private WebElement inpLossDate;

	@IFindBy(how = How.CSS, using = "#ClaimSummary-ClaimSummaryScreen-LossDate_dateIcon", AI = false)
	private WebElement btnLossDateDateIcon;

	@IFindBy(how = How.CSS, using = "input[name='ClaimSummary-ClaimSummaryScreen-WCInjuryWorkStatus']", AI = false)
	private WebElement inpWorkStatus;

	@IFindBy(how = How.CSS, using = "input[name='ClaimSummary-ClaimSummaryScreen-TotalGrossIncurred']", AI = false)
	private WebElement inpGrossIncurred;

	@IFindBy(how = How.CSS, using = "input[name='ClaimSummary-ClaimSummaryScreen-ClaimSummaryActivitiesLV-2-DueDate']", AI = false)
	private WebElement inpDue_8;

	@IFindBy(how = How.CSS, using = "input[name='ClaimSummary-ClaimSummaryScreen-ClaimSummaryActivitiesLV-1-AssignedUser']", AI = false)
	private WebElement inpAssignedTo_7;

	@IFindBy(how = How.CSS, using = "input[name='ClaimSummary-ClaimSummaryScreen-PeopleInvolvedLV-0-Name']", AI = false)
	private WebElement inpName;

	@IFindBy(how = How.CSS, using = "select[name='ClaimSummary-ClaimSummaryScreen-ClaimSummaryActivitiesLV-1-Priority']", AI = false)
	private WebElement drpPriority_5;

	@IFindBy(how = How.CSS, using = "input[name='ClaimSummary-ClaimSummaryScreen-ClaimSummaryActivitiesLV-0-DueDate']", AI = false)
	private WebElement inpDue;

	@IFindBy(how = How.CSS, using = "input[name='ClaimSummary-ClaimSummaryScreen-Location']", AI = false)
	private WebElement inpLossLocation;

	@IFindBy(how = How.CSS, using = "input[name='ClaimSummary-ClaimSummaryScreen-ClaimSummaryExposuresLV-0-Claimant']", AI = false)
	private WebElement inpClaimant;

	@IFindBy(how = How.CSS, using = "input[name='ClaimSummary-ClaimSummaryScreen-WC_RTW-ReturnToWorkInputSet-RTWReadOnlyMSG']", AI = false)
	private WebElement inpReturntoNormalDuty_2;

	@IFindBy(how = How.CSS, using = "input[name='ClaimSummary-ClaimSummaryScreen-WC_RTW-ReturnToWorkInputSet-ReturnToWorkValid']", AI = false)
	private WebElement rdbRTWApplicable;

	@IFindBy(how = How.CSS, using = "input[name='ClaimSummary-ClaimSummaryScreen-WC_RTW-ReturnToWorkInputSet-ReturnToModWorkActual']", AI = false)
	private WebElement rdbReturnToModWorkActual;

	@IFindBy(how = How.CSS, using = "input[name='ClaimSummary-ClaimSummaryScreen-WC_RTW-ReturnToWorkInputSet-ReturnToModWorkValid']", AI = false)
	private WebElement rdbModifiedDutyApplicable;

	@IFindBy(how = How.CSS, using = "select[name='ClaimSummary-ClaimSummaryScreen-ClaimSummaryExposuresLV-0-Coverage']", AI = false)
	private WebElement drpCoverage;

	@IFindBy(how = How.CSS, using = "input[name='ClaimSummary-ClaimSummaryScreen-ClaimSummaryExposuresLV-0-Assignee']", AI = false)
	private WebElement inpAdjuster;

	@IFindBy(how = How.CSS, using = "input[name='ClaimSummary-ClaimSummaryScreen-PeopleInvolvedLV-1-Phone']", AI = false)
	private WebElement inpPhone_15;

	@IFindBy(how = How.CSS, using = "select[name='ClaimSummary-ClaimSummaryScreen-ClaimSummaryActivitiesLV-2-Priority']", AI = false)
	private WebElement drpPriority_10;

	@IFindBy(how = How.CSS, using = "input[name='ClaimSummary-ClaimSummaryScreen-Recovered']", AI = false)
	private WebElement inpRecovered;
	
	@IFindBy(how = How.CSS, using = "div[id$='ClaimSummaryScreen-4']", AI = false)
	private WebElement txtBasics;
	
	@IFindBy(how = How.CSS, using = "div[id$='ClaimSummaryScreen-10']", AI = false)
	private WebElement txtFinancials;
	
	@IFindBy(how = How.CSS, using = "div[id$='ClaimRiskIndicators']", AI = false)
	private WebElement txtHighRisk;
	
	@IFindBy(how = How.CSS, using = "div[id$='ClaimSummaryScreen-LossDate']", AI = false)
	private WebElement txtLossDate;
	
	@IFindBy(how = How.CSS, using = "div[id$='ClaimSummaryScreen-Location']", AI = false)
	private WebElement txtLossLocation;
	
	@IFindBy(how = How.CSS, using = "div[id$='ClaimSummaryExposuresLV--label']", AI = false)
	private WebElement txtExposureLabel;
	
	@IFindBy(how = How.CSS, using = "div[id=Claim-MenuLinks-Claim_ClaimMatters]", AI = false)
	private WebElement lblLitigation;

	public SummaryPage(){
	}

	public SummaryPage(WebDriver driver) {
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(finder, this);
	//	claimsummaryexposuresTable = new ClaimSummaryExposures();
	//	peopleinvolvedTable = new PeopleInvolved();
	//	claimsummaryactivitiesTable = new ClaimSummaryActivities();
}
@Override
	protected void load() {
		isPageLoaded = true;
		WaitUtils.waitForPageLoad(driver);
	}@Override
	protected void isLoaded() {
		if (!isPageLoaded) {
			Assert.fail();
		}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, lblTtlBar))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);
}public SummaryPage clickStatusIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnStatusIcon,"StatusIcon");
				    return this;
			}
public SummaryPage enterDescription(WebDriver driver,String Description) {
		            BrowserActions.type(driver, inpDescription,Description, "Description");
			        return this;
           }
public SummaryPage enterRoles(WebDriver driver,String Roles) {
		            BrowserActions.type(driver, inpRoles,Roles, "Roles");
			        return this;
           }
public SummaryPage enterName_13(WebDriver driver,String Name_13) {
		            BrowserActions.type(driver, inpName_13,Name_13, "Name_13");
			        return this;
           }
public SummaryPage clickOtherInstructions(WebDriver driver)  {
					BrowserActions.click(driver, btnOtherInstructions,"OtherInstructions");
				    return this;
			}
public SummaryPage clickDueDateIcon_9(WebDriver driver)  {
					BrowserActions.click(driver, btnDueDateIcon_9,"DueDateIcon_9");
				    return this;
			}
public SummaryPage enterReturntoModifiedDuty(WebDriver driver,String ReturntoModifiedDuty) {
		            BrowserActions.type(driver, inpReturntoModifiedDuty,ReturntoModifiedDuty, "ReturntoModifiedDuty");
			        return this;
           }
public SummaryPage clickNoticeDateDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnNoticeDateDateIcon,"NoticeDateDateIcon");
				    return this;
			}
public SummaryPage clickDueDateIcon_4(WebDriver driver)  {
					BrowserActions.click(driver, btnDueDateIcon_4,"DueDateIcon_4");
				    return this;
			}
public SummaryPage enterSubject_11(WebDriver driver,String Subject_11) {
		            BrowserActions.type(driver, inpSubject_11,Subject_11, "Subject_11");
			        return this;
           }
public SummaryPage enterRoles_14(WebDriver driver,String Roles_14) {
		            BrowserActions.type(driver, inpRoles_14,Roles_14, "Roles_14");
			        return this;
           }
public SummaryPage enterDue_3(WebDriver driver,String Due_3) {
		            BrowserActions.type(driver, inpDue_3,Due_3, "Due_3");
			        return this;
           }
public SummaryPage enterPaid(WebDriver driver,String Paid) {
		            BrowserActions.type(driver, inpPaid,Paid, "Paid");
			        return this;
           }
public SummaryPage enterAssignedTo_12(WebDriver driver,String AssignedTo_12) {
		            BrowserActions.type(driver, inpAssignedTo_12,AssignedTo_12, "AssignedTo_12");
			        return this;
           }
public SummaryPage enterOpen(WebDriver driver,String Open) {
		            BrowserActions.type(driver, inpOpen,Open, "Open");
			        return this;
           }
public SummaryPage enterSubject_6(WebDriver driver,String Subject_6) {
		            BrowserActions.type(driver, inpSubject_6,Subject_6, "Subject_6");
			        return this;
           }
public SummaryPage enterDaysOpenText(WebDriver driver,String DaysOpenText) {
		            BrowserActions.type(driver, inpDaysOpenText,DaysOpenText, "DaysOpenText");
			        return this;
           }
public SummaryPage clickMedicalProviderThreePointContact(WebDriver driver)  {
					BrowserActions.click(driver, btnMedicalProviderThreePointContact,"MedicalProviderThreePointContact");
				    return this;
			}
public SummaryPage enterSubject(WebDriver driver,String Subject) {
		            BrowserActions.type(driver, inpSubject,Subject, "Subject");
			        return this;
           }
public SummaryPage enterAssignedTo(WebDriver driver,String AssignedTo) {
		            BrowserActions.type(driver, inpAssignedTo,AssignedTo, "AssignedTo");
			        return this;
           }
public SummaryPage enterReturntoNormalDuty(WebDriver driver,String ReturntoNormalDuty) {
		            BrowserActions.type(driver, inpReturntoNormalDuty,ReturntoNormalDuty, "ReturntoNormalDuty");
			        return this;
           }
public SummaryPage clickReturntoNormalDutyDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnReturntoNormalDutyDateIcon,"ReturntoNormalDutyDateIcon");
				    return this;
			}
public SummaryPage enterNoticeDate(WebDriver driver,String NoticeDate) {
		            BrowserActions.type(driver, inpNoticeDate,NoticeDate, "NoticeDate");
			        return this;
           }
public SummaryPage selectType(WebDriver driver,String Type)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpType,Type,"Type");
				    return this;
			}
public SummaryPage clickEmployerThreePointContact(WebDriver driver)  {
					BrowserActions.click(driver, btnEmployerThreePointContact,"EmployerThreePointContact");
				    return this;
			}
public SummaryPage selectPriority(WebDriver driver,String Priority)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPriority,Priority,"Priority");
				    return this;
			}
public SummaryPage clickEmployeeThreePointContact(WebDriver driver)  {
					BrowserActions.click(driver, btnEmployeeThreePointContact,"EmployeeThreePointContact");
				    return this;
			}
public SummaryPage enterPhone(WebDriver driver,String Phone) {
		            BrowserActions.type(driver, inpPhone,Phone, "Phone");
			        return this;
           }
public SummaryPage clickDueDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnDueDateIcon,"DueDateIcon");
				    return this;
			}
public SummaryPage enterReturntoModifiedDuty_1(WebDriver driver,String ReturntoModifiedDuty_1) {
		            BrowserActions.type(driver, inpReturntoModifiedDuty_1,ReturntoModifiedDuty_1, "ReturntoModifiedDuty_1");
			        return this;
           }
public SummaryPage clickReturntoModifiedDutyDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnReturntoModifiedDutyDateIcon,"ReturntoModifiedDutyDateIcon");
				    return this;
			}
public SummaryPage clickReturnToWorkActual(WebDriver driver)  {
					BrowserActions.click(driver, rdbReturnToWorkActual,"ReturnToWorkActual");
				    return this;
			}
public SummaryPage enterOrder(WebDriver driver,String Order) {
		            BrowserActions.type(driver, inpOrder,Order, "Order");
			        return this;
           }
public SummaryPage enterLossDate(WebDriver driver,String LossDate) {
		            BrowserActions.type(driver, inpLossDate,LossDate, "LossDate");
			        return this;
           }
public SummaryPage clickLossDateDateIcon(WebDriver driver)  {
					BrowserActions.click(driver, btnLossDateDateIcon,"LossDateDateIcon");
				    return this;
			}
public SummaryPage enterWorkStatus(WebDriver driver,String WorkStatus) {
		            BrowserActions.type(driver, inpWorkStatus,WorkStatus, "WorkStatus");
			        return this;
           }
public SummaryPage enterGrossIncurred(WebDriver driver,String GrossIncurred) {
		            BrowserActions.type(driver, inpGrossIncurred,GrossIncurred, "GrossIncurred");
			        return this;
           }
public SummaryPage enterDue_8(WebDriver driver,String Due_8) {
		            BrowserActions.type(driver, inpDue_8,Due_8, "Due_8");
			        return this;
           }
public SummaryPage enterAssignedTo_7(WebDriver driver,String AssignedTo_7) {
		            BrowserActions.type(driver, inpAssignedTo_7,AssignedTo_7, "AssignedTo_7");
			        return this;
           }
public SummaryPage enterName(WebDriver driver,String Name) {
		            BrowserActions.type(driver, inpName,Name, "Name");
			        return this;
           }
public SummaryPage selectPriority_5(WebDriver driver,String Priority_5)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPriority_5,Priority_5,"Priority_5");
				    return this;
			}
public SummaryPage enterDue(WebDriver driver,String Due) {
		            BrowserActions.type(driver, inpDue,Due, "Due");
			        return this;
           }
public SummaryPage enterLossLocation(WebDriver driver,String LossLocation) {
		            BrowserActions.type(driver, inpLossLocation,LossLocation, "LossLocation");
			        return this;
           }
public SummaryPage enterClaimant(WebDriver driver,String Claimant) {
		            BrowserActions.type(driver, inpClaimant,Claimant, "Claimant");
			        return this;
           }
public SummaryPage enterReturntoNormalDuty_2(WebDriver driver,String ReturntoNormalDuty_2) {
		            BrowserActions.type(driver, inpReturntoNormalDuty_2,ReturntoNormalDuty_2, "ReturntoNormalDuty_2");
			        return this;
           }
public SummaryPage clickRTWApplicable(WebDriver driver)  {
					BrowserActions.click(driver, rdbRTWApplicable,"RTWApplicable");
				    return this;
			}
public SummaryPage clickReturnToModWorkActual(WebDriver driver)  {
					BrowserActions.click(driver, rdbReturnToModWorkActual,"ReturnToModWorkActual");
				    return this;
			}
public SummaryPage clickModifiedDutyApplicable(WebDriver driver)  {
					BrowserActions.click(driver, rdbModifiedDutyApplicable,"ModifiedDutyApplicable");
				    return this;
			}
public SummaryPage selectCoverage(WebDriver driver,String Coverage)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpCoverage,Coverage,"Coverage");
				    return this;
			}
public SummaryPage enterAdjuster(WebDriver driver,String Adjuster) {
		            BrowserActions.type(driver, inpAdjuster,Adjuster, "Adjuster");
			        return this;
           }
public SummaryPage enterPhone_15(WebDriver driver,String Phone_15) {
		            BrowserActions.type(driver, inpPhone_15,Phone_15, "Phone_15");
			        return this;
           }
public SummaryPage selectPriority_10(WebDriver driver,String Priority_10)  {
					BrowserActions.selectDropDownByVisibleText(driver, drpPriority_10,Priority_10,"Priority_10");
				    return this;
			}
public SummaryPage enterRecovered(WebDriver driver,String Recovered) {
		            BrowserActions.type(driver, inpRecovered,Recovered, "Recovered");
			        return this;
           }
public SummaryPage verifyBasicsValues(WebDriver driver)  {
	BrowserActions.verifyElementDisplayed(driver, txtBasics,"Basics Value");
	return this;
}
public SummaryPage verifyFinaicialsValues(WebDriver driver)  {
	BrowserActions.verifyElementDisplayed(driver, txtFinancials,"Financial Value");
	return this;
}
public SummaryPage verifyHighRiskIndicatorsValues(WebDriver driver)  {
	BrowserActions.verifyElementDisplayed(driver, txtHighRisk,"High Risk Value");
	return this;
}
public SummaryPage verifyLossDateInputValues(WebDriver driver)  {
	BrowserActions.verifyElementDisplayed(driver, txtLossDate,"Loss date Value");
	return this;
}
public SummaryPage verifyLossLocationsInputValues(WebDriver driver)  {
	BrowserActions.verifyElementDisplayed(driver, txtLossLocation,"Loss location Value");
	return this;
}
public SummaryPage verifyExposuresValues(WebDriver driver)  {
	BrowserActions.verifyElementDisplayed(driver, txtExposureLabel,"Exposure label");
	Log.messageStep("Verified all the fields in navigation summary page", DriverManager.getDriver());
	return this;
}
public LitigationPage clickLitigation(WebDriver driver)  {
	BrowserActions.click(driver, lblLitigation,"Litigation");
	Log.messageStep("Litigation is Clicked",DriverManager.getDriver());
    return new LitigationPage(driver).get();
}
}

