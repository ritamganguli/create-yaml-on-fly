package com.aspire.guidewire.cc.pages.common;
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

import com.aspire.guidewire.cc.pages.nonlob.AssignActivitiesPage;
import com.aspire.guidewire.utils.BrowserActions;
import com.aspire.guidewire.utils.ElementLayer;
import com.aspire.guidewire.utils.Log;
import com.aspire.guidewire.utils.WaitUtils;
import com.aspire.guidewire.webdriverManager.DriverManager;

import ASPIREAI.customfactories.AjaxElementLocatorFactory;
import ASPIREAI.customfactories.IFindBy;
import ASPIREAI.customfactories.PageFactory;

public class WorkplanPage extends LoadableComponent<WorkplanPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	//TopNavBar object
	//public TopNavBar topnavbar;
	//public Workplan workplanTable;

	@IFindBy(how = How.CSS, using = "input[name='ClaimWorkplan-ClaimWorkplanScreen-WorkplanLV-1-Escalated']", AI = false)
	private WebElement rdbEscalated_3;

	@IFindBy(how = How.CSS, using = "input[name='ClaimWorkplan-ClaimWorkplanScreen-WorkplanLV-0-Status']", AI = false)
	private WebElement inpStatus;

	@IFindBy(how = How.CSS, using = "#ClaimWorkplan-ClaimWorkplanScreen-ClaimWorkplan_ApproveButton>div[role='button']", AI = false)
	private WebElement btnApprove;

	@IFindBy(how = How.CSS, using = "input[name='ClaimWorkplan-ClaimWorkplanScreen-WorkplanLV-2-ExternallyOwned']", AI = false)
	private WebElement rdbExternal_22;

	@IFindBy(how = How.CSS, using = "input[name='ClaimWorkplan-ClaimWorkplanScreen-WorkplanLV-2-AssignedUser']", AI = false)
	private WebElement inpAssignedTo_25;

	@IFindBy(how = How.CSS, using = "input[name='ClaimWorkplan-ClaimWorkplanScreen-WorkplanLV-0-Assigner']", AI = false)
	private WebElement inpAssignedBy;

	@IFindBy(how = How.CSS, using = "input[name='ClaimWorkplan-ClaimWorkplanScreen-WorkplanLV-3-DueDate']", AI = false)
	private WebElement inpDue_28;

	@IFindBy(how = How.CSS, using = "input[name='ClaimWorkplan-ClaimWorkplanScreen-WorkplanLV-1-ExternalOwner']", AI = false)
	private WebElement inpExtOwner_11;

	@IFindBy(how = How.CSS, using = "input[name='ClaimWorkplan-ClaimWorkplanScreen-WorkplanLV-3-Exposure']", AI = false)
	private WebElement inpExposures_33;

	@IFindBy(how = How.CSS, using = "#ClaimWorkplan-ClaimWorkplanScreen-WorkplanLV-1-DueDate_dateIcon", AI = false)
	private WebElement btnDueDateIcon_5;

	@IFindBy(how = How.CSS, using = "input[name='ClaimWorkplan-ClaimWorkplanScreen-WorkplanLV-3-Escalated']", AI = false)
	private WebElement rdbEscalated_27;

	@IFindBy(how = How.CSS, using = "#ClaimWorkplan-ClaimWorkplanScreen-WorkplanLV-2-DueDate_dateIcon", AI = false)
	private WebElement btnDueDateIcon_17;

	@IFindBy(how = How.CSS, using = "input[name='ClaimWorkplan-ClaimWorkplanScreen-WorkplanLV-1-Assigner']", AI = false)
	private WebElement inpAssignedBy_12;

	@IFindBy(how = How.CSS, using = "input[name='ClaimWorkplan-ClaimWorkplanScreen-WorkplanLV-1-ExternallyOwned']", AI = false)
	private WebElement rdbExternal_10;

	@IFindBy(how = How.CSS, using = "input[name='ClaimWorkplan-ClaimWorkplanScreen-WorkplanLV-1-DueDate']", AI = false)
	private WebElement inpDue_4;

	@IFindBy(how = How.CSS, using = "input[name='ClaimWorkplan-ClaimWorkplanScreen-WorkplanLV-1-AssignedUser']", AI = false)
	private WebElement inpAssignedTo_13;

	@IFindBy(how = How.CSS, using = "input[name='ClaimWorkplan-ClaimWorkplanScreen-WorkplanLV-1-Subject']", AI = false)
	private WebElement inpSubject_8;

	@IFindBy(how = How.CSS, using = "select[name='ClaimWorkplan-ClaimWorkplanScreen-WorkplanLV-WorkplanFilter']", AI = false)
	private WebElement drpWorkplanFilter_1;

	@IFindBy(how = How.CSS, using = "input[name='ClaimWorkplan-ClaimWorkplanScreen-WorkplanLV-3-Updated']", AI = false)
	private WebElement rdbUpdated_26;

	@IFindBy(how = How.CSS, using = "input[name='ClaimWorkplan-ClaimWorkplanScreen-WorkplanLV-0-Subject']", AI = false)
	private WebElement inpSubject;

	@IFindBy(how = How.CSS, using = "input[name='ClaimWorkplan-ClaimWorkplanScreen-WorkplanLV-2-DueDate']", AI = false)
	private WebElement inpDue_16;

	@IFindBy(how = How.CSS, using = "input[name='ClaimWorkplan-ClaimWorkplanScreen-WorkplanLV-0-AssignedUser']", AI = false)
	private WebElement inpAssignedTo;

	@IFindBy(how = How.CSS, using = "input[name='ClaimWorkplan-ClaimWorkplanScreen-WorkplanLV-2-ExternalOwner']", AI = false)
	private WebElement inpExtOwner_23;

	@IFindBy(how = How.CSS, using = "#ClaimWorkplan-ClaimWorkplanScreen-ClaimWorkplan_SkipButton>div[role='button']", AI = false)
	private WebElement btnSkip;

	@IFindBy(how = How.CSS, using = "input[name='ClaimWorkplan-ClaimWorkplanScreen-WorkplanLV-1-Exposure']", AI = false)
	private WebElement inpExposures_9;

	@IFindBy(how = How.CSS, using = "input[name='ClaimWorkplan-ClaimWorkplanScreen-WorkplanLV-2-Exposure']", AI = false)
	private WebElement inpExposures_21;

	@IFindBy(how = How.CSS, using = "input[name='ClaimWorkplan-ClaimWorkplanScreen-WorkplanLV-0-Escalated']", AI = false)
	private WebElement rdbEscalated;

	@IFindBy(how = How.CSS, using = "select[name='ClaimWorkplan-ClaimWorkplanScreen-WorkplanLV-3-Priority']", AI = false)
	private WebElement drpPriority_30;

	@IFindBy(how = How.CSS, using = "input[name='ClaimWorkplan-ClaimWorkplanScreen-WorkplanLV-2-Status']", AI = false)
	private WebElement inpStatus_19;

	@IFindBy(how = How.CSS, using = "select[name='ClaimWorkplan-ClaimWorkplanScreen-WorkplanLV-0-Priority']", AI = false)
	private WebElement drpPriority;

	@IFindBy(how = How.CSS, using = "#ClaimWorkplan-ClaimWorkplanScreen-WorkplanLV-3-DueDate_dateIcon", AI = false)
	private WebElement btnDueDateIcon_29;

	@IFindBy(how = How.CSS, using = "input[name='ClaimWorkplan-ClaimWorkplanScreen-WorkplanLV-2-Subject']", AI = false)
	private WebElement inpSubject_20;

	@IFindBy(how = How.CSS, using = "select[name='ClaimWorkplan-ClaimWorkplanScreen-WorkplanLV-2-Priority']", AI = false)
	private WebElement drpPriority_18;

	@IFindBy(how = How.CSS, using = "#ClaimWorkplan-ClaimWorkplanScreen-WorkplanLV-0-DueDate_dateIcon", AI = false)
	private WebElement btnDueDateIcon;

	@IFindBy(how = How.CSS, using = "input[name='ClaimWorkplan-ClaimWorkplanScreen-WorkplanLV-2-Updated']", AI = false)
	private WebElement rdbUpdated_14;

	@IFindBy(how = How.CSS, using = "input[name='ClaimWorkplan-ClaimWorkplanScreen-WorkplanLV-3-ExternalOwner']", AI = false)
	private WebElement inpExtOwner_35;

	@IFindBy(how = How.CSS, using = "select[name='ClaimWorkplan-ClaimWorkplanScreen-WorkplanLV-WorkplanFilter']", AI = false)
	private WebElement drpWorkplanFilter;

	@IFindBy(how = How.CSS, using = "input[name='ClaimWorkplan-ClaimWorkplanScreen-WorkplanLV-0-Updated']", AI = false)
	private WebElement rdbUpdated;

	@IFindBy(how = How.CSS, using = "input[name='ClaimWorkplan-ClaimWorkplanScreen-WorkplanLV-1-Updated']", AI = false)
	private WebElement rdbUpdated_2;

	@IFindBy(how = How.CSS, using = "#ClaimWorkplan-ClaimWorkplanScreen-ClaimWorkplan_RejectButton>div[role='button']", AI = false)
	private WebElement btnReject;

	@IFindBy(how = How.CSS, using = "input[name='ClaimWorkplan-ClaimWorkplanScreen-WorkplanLV-0-Exposure']", AI = false)
	private WebElement inpExposures;

	@IFindBy(how = How.CSS, using = "input[name='ClaimWorkplan-ClaimWorkplanScreen-WorkplanLV-0-ExternallyOwned']", AI = false)
	private WebElement rdbExternal;

	@IFindBy(how = How.CSS, using = "input[name='ClaimWorkplan-ClaimWorkplanScreen-WorkplanLV-3-Subject']", AI = false)
	private WebElement inpSubject_32;

	@IFindBy(how = How.CSS, using = "input[name='ClaimWorkplan-ClaimWorkplanScreen-WorkplanLV-3-Assigner']", AI = false)
	private WebElement inpAssignedBy_36;

	@IFindBy(how = How.CSS, using = "input[name='ClaimWorkplan-ClaimWorkplanScreen-WorkplanLV-3-AssignedUser']", AI = false)
	private WebElement inpAssignedTo_37;

	@IFindBy(how = How.CSS, using = "input[name='ClaimWorkplan-ClaimWorkplanScreen-WorkplanLV-0-DueDate']", AI = false)
	private WebElement inpDue;

	@IFindBy(how = How.CSS, using = "select[name='ClaimWorkplan-ClaimWorkplanScreen-WorkplanLV-1-Priority']", AI = false)
	private WebElement drpPriority_6;

	@IFindBy(how = How.CSS, using = "input[name='ClaimWorkplan-ClaimWorkplanScreen-WorkplanLV-3-ExternallyOwned']", AI = false)
	private WebElement rdbExternal_34;

	@IFindBy(how = How.CSS, using = "#ClaimWorkplan-ClaimWorkplanScreen-ClaimWorkplan_CompleteButton>div[role='button']", AI = false)
	private WebElement btnComplete;

	@IFindBy(how = How.CSS, using = "input[name='ClaimWorkplan-ClaimWorkplanScreen-WorkplanLV-3-Status']", AI = false)
	private WebElement inpStatus_31;

	@IFindBy(how = How.CSS, using = "input[name='ClaimWorkplan-ClaimWorkplanScreen-WorkplanLV-0-ExternalOwner']", AI = false)
	private WebElement inpExtOwner;

	@IFindBy(how = How.CSS, using = "input[name='ClaimWorkplan-ClaimWorkplanScreen-WorkplanLV-1-Status']", AI = false)
	private WebElement inpStatus_7;

	@IFindBy(how = How.CSS, using = "#ClaimWorkplan-ClaimWorkplanScreen-ClaimWorkplan_AssignButton>div[role='button']", AI = false)
	private WebElement btnAssign;

	@IFindBy(how = How.CSS, using = "input[name='ClaimWorkplan-ClaimWorkplanScreen-WorkplanLV-2-Assigner']", AI = false)
	private WebElement inpAssignedBy_24;

	@IFindBy(how = How.CSS, using = "input[name='ClaimWorkplan-ClaimWorkplanScreen-WorkplanLV-2-Escalated']", AI = false)
	private WebElement rdbEscalated_15;

	@IFindBy(how = How.CSS, using = "input[name$='WorkplanLV-_Checkbox']", AI = false)
	private WebElement chkBoxWorkPlan;

	@IFindBy(how = How.CSS, using = "div[class='gw-ListView--empty-info-row']", AI = false)
	private WebElement lblNoDataToDisplay;
	
	@IFindBy(how = How.XPATH, using = "//div[contains(@id,'ClaimWorkplan-ClaimWorkplanScreen')]//div[text()='Workplan']", AI = false)
	private WebElement ttlWorkPlan;
	
	@IFindBy(how = How.CSS, using = "div[id$='Edit']", AI = false)
	private WebElement btnEdit;
	
	@IFindBy(how = How.CSS, using = "div[id$='ActivityDetailWorksheet-ActivityDetailScreen-ActivityDetailScreen_CompleteButton']", AI = false)
	private WebElement btnComplete_1;
	
	@IFindBy(how = How.CSS, using = "div[id$='SkipButton']", AI = false)
	private WebElement btnSkip_1;
	
	@IFindBy(how = How.CSS, using = "div[id$='ActivityDetailWorksheet-ActivityDetailScreen-ActivityDetailScreen_AssignButton']", AI = false)
	private WebElement btnAssign_1;
	
	@IFindBy(how = How.CSS, using = "div[id$='ActivityDetailScreen_AddDocumentButton']", AI = false)
	private WebElement btnLinkDocument;
	
	@IFindBy(how = How.CSS, using = "div[id$='ActivityDetailScreen_NotesButton']", AI = false)
	private WebElement btnViewNotes;
	
	@IFindBy(how = How.CSS, using = "div[id$='ActivityDetailScreen-Close']", AI = false)
	private WebElement btnCloseWorksheet;
	
	@IFindBy(how = How.CSS, using = "input[name$='WorkplanLV-0-_Checkbox']", AI = false)
	private WebElement inpActivity_1;
	
	@IFindBy(how = How.CSS, using = "input[name$='WorkplanLV-1-_Checkbox']", AI = false)
	private WebElement inpActivity_2;
	
	@IFindBy(how = How.CSS, using = "div[id$='WorkplanLV-0-AssignedUser']", AI = false)
	private WebElement lblAssignedTo;
	
	@IFindBy(how = How.CSS, using = "div[id$='DueDateHeader']", AI = false)
	private WebElement lblDue;
	
	@IFindBy(how = How.CSS, using = "div[id$='PriorityHeader']", AI = false)
	private WebElement lblPriority;
	
	@IFindBy(how = How.CSS, using = "div[id$='StatusHeader']", AI = false)
	private WebElement lblStatus;
	
	@IFindBy(how = How.CSS, using = "div[id$='SubjectHeader']", AI = false)
	private WebElement lblSubject;
	
	@IFindBy(how = How.CSS, using = "div[id$='ExposureHeader']", AI = false)
	private WebElement lblExposures;
	
	@IFindBy(how = How.CSS, using = "div[id$='ExternallyOwnedHeader']", AI = false)
	private WebElement lblExternal;
	
	@IFindBy(how = How.CSS, using = "div[id='Claim-ClaimInfoBar-Adjuster']", AI = false)
	private WebElement lblAdjuster;

	String workPlandata="//table//tr";

	public WorkplanPage(){
	}

	public WorkplanPage(WebDriver driver) {
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
		}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, ttlWorkPlan))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);
	}public WorkplanPage clickEscalated_3(WebDriver driver)  {
		BrowserActions.click(driver, rdbEscalated_3,"Escalated_3");
		return this;
	}
	public WorkplanPage enterStatus(WebDriver driver,String Status) {
		BrowserActions.type(driver, inpStatus,Status, "Status");
		return this;
	}
	public WorkplanPage clickApprove(WebDriver driver)  {
		BrowserActions.click(driver, btnApprove,"Approve");
		return this;
	}
	public WorkplanPage clickExternal_22(WebDriver driver)  {
		BrowserActions.click(driver, rdbExternal_22,"External_22");
		return this;
	}
	public WorkplanPage enterAssignedTo_25(WebDriver driver,String AssignedTo_25) {
		BrowserActions.type(driver, inpAssignedTo_25,AssignedTo_25, "AssignedTo_25");
		return this;
	}
	public WorkplanPage enterAssignedBy(WebDriver driver,String AssignedBy) {
		BrowserActions.type(driver, inpAssignedBy,AssignedBy, "AssignedBy");
		return this;
	}
	public WorkplanPage enterDue_28(WebDriver driver,String Due_28) {
		BrowserActions.type(driver, inpDue_28,Due_28, "Due_28");
		return this;
	}
	public WorkplanPage enterExtOwner_11(WebDriver driver,String ExtOwner_11) {
		BrowserActions.type(driver, inpExtOwner_11,ExtOwner_11, "ExtOwner_11");
		return this;
	}
	public WorkplanPage enterExposures_33(WebDriver driver,String Exposures_33) {
		BrowserActions.type(driver, inpExposures_33,Exposures_33, "Exposures_33");
		return this;
	}
	public WorkplanPage clickDueDateIcon_5(WebDriver driver)  {
		BrowserActions.click(driver, btnDueDateIcon_5,"DueDateIcon_5");
		return this;
	}
	public WorkplanPage clickEscalated_27(WebDriver driver)  {
		BrowserActions.click(driver, rdbEscalated_27,"Escalated_27");
		return this;
	}
	public WorkplanPage clickDueDateIcon_17(WebDriver driver)  {
		BrowserActions.click(driver, btnDueDateIcon_17,"DueDateIcon_17");
		return this;
	}
	public WorkplanPage enterAssignedBy_12(WebDriver driver,String AssignedBy_12) {
		BrowserActions.type(driver, inpAssignedBy_12,AssignedBy_12, "AssignedBy_12");
		return this;
	}
	public WorkplanPage clickExternal_10(WebDriver driver)  {
		BrowserActions.click(driver, rdbExternal_10,"External_10");
		return this;
	}
	public WorkplanPage enterDue_4(WebDriver driver,String Due_4) {
		BrowserActions.type(driver, inpDue_4,Due_4, "Due_4");
		return this;
	}
	public WorkplanPage enterAssignedTo_13(WebDriver driver,String AssignedTo_13) {
		BrowserActions.type(driver, inpAssignedTo_13,AssignedTo_13, "AssignedTo_13");
		return this;
	}
	public WorkplanPage enterSubject_8(WebDriver driver,String Subject_8) {
		BrowserActions.type(driver, inpSubject_8,Subject_8, "Subject_8");
		return this;
	}
	public WorkplanPage selectWorkplanFilter_1(WebDriver driver,String WorkplanFilter_1)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpWorkplanFilter_1,WorkplanFilter_1,"WorkplanFilter_1");
		return this;
	}
	public WorkplanPage clickUpdated_26(WebDriver driver)  {
		BrowserActions.click(driver, rdbUpdated_26,"Updated_26");
		return this;
	}
	public WorkplanPage enterSubject(WebDriver driver,String Subject) {
		BrowserActions.type(driver, inpSubject,Subject, "Subject");
		return this;
	}
	public WorkplanPage enterDue_16(WebDriver driver,String Due_16) {
		BrowserActions.type(driver, inpDue_16,Due_16, "Due_16");
		return this;
	}
	public WorkplanPage enterAssignedTo(WebDriver driver,String AssignedTo) {
		BrowserActions.type(driver, inpAssignedTo,AssignedTo, "AssignedTo");
		return this;
	}
	public WorkplanPage enterExtOwner_23(WebDriver driver,String ExtOwner_23) {
		BrowserActions.type(driver, inpExtOwner_23,ExtOwner_23, "ExtOwner_23");
		return this;
	}
	public WorkplanPage clickSkip(WebDriver driver)  {
		BrowserActions.click(driver, btnSkip,"Skip");
		return this;
	}
	public WorkplanPage enterExposures_9(WebDriver driver,String Exposures_9) {
		BrowserActions.type(driver, inpExposures_9,Exposures_9, "Exposures_9");
		return this;
	}
	public WorkplanPage enterExposures_21(WebDriver driver,String Exposures_21) {
		BrowserActions.type(driver, inpExposures_21,Exposures_21, "Exposures_21");
		return this;
	}
	public WorkplanPage clickEscalated(WebDriver driver)  {
		BrowserActions.click(driver, rdbEscalated,"Escalated");
		return this;
	}
	public WorkplanPage selectPriority_30(WebDriver driver,String Priority_30)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPriority_30,Priority_30,"Priority_30");
		return this;
	}
	public WorkplanPage enterStatus_19(WebDriver driver,String Status_19) {
		BrowserActions.type(driver, inpStatus_19,Status_19, "Status_19");
		return this;
	}
	public WorkplanPage selectPriority(WebDriver driver,String Priority)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPriority,Priority,"Priority");
		return this;
	}
	public WorkplanPage clickDueDateIcon_29(WebDriver driver)  {
		BrowserActions.click(driver, btnDueDateIcon_29,"DueDateIcon_29");
		return this;
	}
	public WorkplanPage enterSubject_20(WebDriver driver,String Subject_20) {
		BrowserActions.type(driver, inpSubject_20,Subject_20, "Subject_20");
		return this;
	}
	public WorkplanPage selectPriority_18(WebDriver driver,String Priority_18)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPriority_18,Priority_18,"Priority_18");
		return this;
	}
	public WorkplanPage clickDueDateIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnDueDateIcon,"DueDateIcon");
		return this;
	}
	public WorkplanPage clickUpdated_14(WebDriver driver)  {
		BrowserActions.click(driver, rdbUpdated_14,"Updated_14");
		return this;
	}
	public WorkplanPage enterExtOwner_35(WebDriver driver,String ExtOwner_35) {
		BrowserActions.type(driver, inpExtOwner_35,ExtOwner_35, "ExtOwner_35");
		return this;
	}
	public WorkplanPage selectWorkplanFilter(WebDriver driver,String WorkplanFilter)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpWorkplanFilter,WorkplanFilter,"WorkplanFilter");
		return this;
	}
	public WorkplanPage clickUpdated(WebDriver driver)  {
		BrowserActions.click(driver, rdbUpdated,"Updated");
		return this;
	}
	public WorkplanPage clickUpdated_2(WebDriver driver)  {
		BrowserActions.click(driver, rdbUpdated_2,"Updated_2");
		return this;
	}
	public WorkplanPage clickReject(WebDriver driver)  {
		BrowserActions.click(driver, btnReject,"Reject");
		return this;
	}
	public WorkplanPage enterExposures(WebDriver driver,String Exposures) {
		BrowserActions.type(driver, inpExposures,Exposures, "Exposures");
		return this;
	}
	public WorkplanPage clickExternal(WebDriver driver)  {
		BrowserActions.click(driver, rdbExternal,"External");
		return this;
	}
	public WorkplanPage enterSubject_32(WebDriver driver,String Subject_32) {
		BrowserActions.type(driver, inpSubject_32,Subject_32, "Subject_32");
		return this;
	}
	public WorkplanPage enterAssignedBy_36(WebDriver driver,String AssignedBy_36) {
		BrowserActions.type(driver, inpAssignedBy_36,AssignedBy_36, "AssignedBy_36");
		return this;
	}
	public WorkplanPage enterAssignedTo_37(WebDriver driver,String AssignedTo_37) {
		BrowserActions.type(driver, inpAssignedTo_37,AssignedTo_37, "AssignedTo_37");
		return this;
	}
	public WorkplanPage enterDue(WebDriver driver,String Due) {
		BrowserActions.type(driver, inpDue,Due, "Due");
		return this;
	}
	public WorkplanPage selectPriority_6(WebDriver driver,String Priority_6)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPriority_6,Priority_6,"Priority_6");
		return this;
	}
	public WorkplanPage clickExternal_34(WebDriver driver)  {
		BrowserActions.click(driver, rdbExternal_34,"External_34");
		return this;
	}
	public WorkplanPage clickComplete(WebDriver driver)  {
		BrowserActions.click(driver, btnComplete,"Complete");
		return this;
	}
	public WorkplanPage enterStatus_31(WebDriver driver,String Status_31) {
		BrowserActions.type(driver, inpStatus_31,Status_31, "Status_31");
		return this;
	}
	public WorkplanPage enterExtOwner(WebDriver driver,String ExtOwner) {
		BrowserActions.type(driver, inpExtOwner,ExtOwner, "ExtOwner");
		return this;
	}
	public WorkplanPage enterStatus_7(WebDriver driver,String Status_7) {
		BrowserActions.type(driver, inpStatus_7,Status_7, "Status_7");
		return this;
	}
	public AssignActivitiesPage clickAssign(WebDriver driver)   {
		BrowserActions.click(driver, btnAssign,true,"Assign");
		return new AssignActivitiesPage(driver).get();
	}
	public WorkplanPage enterAssignedBy_24(WebDriver driver,String AssignedBy_24) {
		BrowserActions.type(driver, inpAssignedBy_24,AssignedBy_24, "AssignedBy_24");
		return this;
	}
	public WorkplanPage clickEscalated_15(WebDriver driver)  {
		BrowserActions.click(driver, rdbEscalated_15,"Escalated_15");
		return this;
	}
	public WorkplanPage clickCheckBoxWorkplan(WebDriver driver)  {
		By tagName = By.tagName("tr");
		int size = BrowserActions.getWebElementSize(driver, tagName,"tag name",0.5);
		if ( size > 1) {
			BrowserActions.click(driver, chkBoxWorkPlan,"Check box");
			BrowserActions.click(driver, btnComplete,"Complete");
		}
		return this;
	}

	public WorkplanPage verifyNoDataMessage(WebDriver driver,String text)  {
		BrowserActions.verifyElementTextIsDisplayed(driver, lblNoDataToDisplay,text,true, "No Data To Display");
		return this;
	}
	public WorkplanPage verifyEditbtn(WebDriver driver)  {
		BrowserActions.verifyElementDisplayed(driver, btnEdit,"Edit");
		return this;
	}
	public WorkplanPage verifyCompletebtn(WebDriver driver)  {
		BrowserActions.verifyElementDisplayed(driver, btnComplete_1,"complete");
		return this;
	}
	public WorkplanPage verifySkipbtn(WebDriver driver)  {
		BrowserActions.verifyElementDisplayed(driver, btnSkip_1,"skip");
		return this;
	}
	public WorkplanPage verifyAssignbtn(WebDriver driver)  {
		BrowserActions.verifyElementDisplayed(driver, btnAssign_1,"Assign");
		return this;
	}
	public WorkplanPage verifyLinkDocumentbtn(WebDriver driver)  {
		BrowserActions.verifyElementDisplayed(driver, btnLinkDocument,"Link Document");
		return this;
	}
	public WorkplanPage verifyViewNotesbtn(WebDriver driver)  {
		BrowserActions.verifyElementDisplayed(driver, btnViewNotes,"View Notes");
		return this;
	}
	public WorkplanPage verifyCloseWorksheetbtn(WebDriver driver)  {
		BrowserActions.verifyElementDisplayed(driver, btnCloseWorksheet,"Close Worksheet");
		Log.messageStep("Edit, Complete, Skip , Link Documents, View Notes , Close Worksheet Buttons were Displayed",DriverManager.getDriver());
		return this;
	}
	public WorkplanPage clickCloseWorksheetbtn(WebDriver driver)  {
		BrowserActions.click(driver, btnCloseWorksheet,"Close Worksheet");
		return this;
	}
	
	public WorkplanPage selectActivity_1(WebDriver driver) {
		BrowserActions.click(driver, inpActivity_1, "Activity_1");
		return this;
	}
	public WorkplanPage selectActivity_2(WebDriver driver) {
		BrowserActions.click(driver, inpActivity_2, "Activity_2");
		return this;
	}
	
	public String getAdjusterName(WebDriver driver) {
		String text = BrowserActions.getText(driver, lblAdjuster, "Adjuster");
		String adjName = text.replace("Adj:\n", "");
		String[] split = adjName.split("\\(");
		return split[0].trim();
	}
	public WorkplanPage verifyAssignedTo(WebDriver driver, String assignedToText) {
		String actualText = BrowserActions.getText(driver, lblAssignedTo, "Assigned To");
		Log.assertThat(actualText.equals(assignedToText), "Assigned to Text is Matched", "Assigned to Text is not Matched");
		Log.messageStep("Activity Assignment is created with name of "+actualText,DriverManager.getDriver());
		return this;
	}
	public WorkplanPage clickComplete_1(WebDriver driver)  {
		BrowserActions.click(driver, btnComplete_1,"complete");
		Log.messageStep("Activity is closed Successfully",DriverManager.getDriver());
		return this;
	}
	public WorkplanPage verifyDue(WebDriver driver)  {
		BrowserActions.verifyElementDisplayed(driver, lblDue,"Due");
		return this;
	}
	public WorkplanPage verifyPriority(WebDriver driver)  {
		BrowserActions.verifyElementDisplayed(driver, lblPriority,"Priority");
		return this;
	}
	public WorkplanPage verifyStatus(WebDriver driver)  {
		BrowserActions.verifyElementDisplayed(driver, lblStatus,"Status");
		return this;
	}
	public WorkplanPage verifySubject(WebDriver driver)  {
		BrowserActions.verifyElementDisplayed(driver, lblSubject,"Subject");
		return this;
	}
	public WorkplanPage verifyExposures(WebDriver driver)  {
		BrowserActions.verifyElementDisplayed(driver, lblExposures,"Exposures");
		return this;
	}
	public WorkplanPage verifyExternal(WebDriver driver)  {
		BrowserActions.verifyElementDisplayed(driver, lblExternal,"External");
		Log.messageStep("Due , Priority , Status , Subject , Exposures and External details were Displayed",DriverManager.getDriver());
		return this;
	}
}
