package com.aspire.guidewire.pc.pages.nonlob;

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

public class MessageQueuesPage extends LoadableComponent<MessageQueuesPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	@IFindBy(how = How.CSS, using = "input[name='MessagingDestinationControlList-MessagingDestinationControlListScreen-MessagingDestinationsControlLV-0-Status']", AI = false)
	private WebElement inpStatus;

	@IFindBy(how = How.CSS, using = "input[name='MessagingDestinationControlList-MessagingDestinationControlListScreen-MessagingDestinationsControlLV-2-DestinationID']", AI = false)
	private WebElement inpID_8;

	@IFindBy(how = How.CSS, using = "input[name='MessagingDestinationControlList-MessagingDestinationControlListScreen-MessagingDestinationsControlLV-1-DestinationID']", AI = false)
	private WebElement inpID_3;

	@IFindBy(how = How.CSS, using = "#MessagingDestinationControlList-MessagingDestinationControlListScreen-MessagingDestinationsControlLV-1-DestinationName-DestinationNameMenuIcon>div[role='button']", AI = false)
	private WebElement btnDestinationNameMenuIcon_2;

	@IFindBy(how = How.CSS, using = "#MessagingDestinationControlList-MessagingDestinationControlListScreen-MessagingDestinationsControlLV-2-DestinationName-DestinationNameMenuIcon>div[role='button']", AI = false)
	private WebElement btnDestinationNameMenuIcon_7;

	@IFindBy(how = How.CSS, using = "input[name='MessagingDestinationControlList-MessagingDestinationControlListScreen-MessagingDestinationsControlLV-5-Status']", AI = false)
	private WebElement inpStatus_24;

	@IFindBy(how = How.CSS, using = "input[name='MessagingDestinationControlList-MessagingDestinationControlListScreen-MessagingDestinationsControlLV-6-Status']", AI = false)
	private WebElement inpStatus_29;

	@IFindBy(how = How.CSS, using = "input[name='MessagingDestinationControlList-MessagingDestinationControlListScreen-MessagingDestinationsControlLV-7-Status']", AI = false)
	private WebElement inpStatus_34;

	@IFindBy(how = How.CSS, using = "#MessagingDestinationControlList-MessagingDestinationControlListScreen-MessagingDestinationControlList_SuspendButton>div[role='button']", AI = false)
	private WebElement btnSuspend;

	@IFindBy(how = How.CSS, using = "div[id$='ResumeButton']", AI = false)
	private WebElement btnResume;

	@IFindBy(how = How.CSS, using = "input[name='MessagingDestinationControlList-MessagingDestinationControlListScreen-MessagingDestinationsControlLV-0-ServerId']", AI = false)
	private WebElement inpServerId;

	@IFindBy(how = How.CSS, using = "input[name='MessagingDestinationControlList-MessagingDestinationControlListScreen-MessagingDestinationsControlLV-3-DestinationName']", AI = false)
	private WebElement inpDestination_11;

	@IFindBy(how = How.CSS, using = "div[id$='RestartMessagingEngineButton']", AI = false)
	private WebElement btnRestartMessagingEngine;

	@IFindBy(how = How.CSS, using = "input[name='MessagingDestinationControlList-MessagingDestinationControlListScreen-MessagingDestinationsControlLV-4-DestinationName']", AI = false)
	private WebElement inpDestination_16;

	@IFindBy(how = How.CSS, using = "input[name='MessagingDestinationControlList-MessagingDestinationControlListScreen-MessagingDestinationsControlLV-5-DestinationName']", AI = false)
	private WebElement inpDestination_21;

	@IFindBy(how = How.CSS, using = "input[name='MessagingDestinationControlList-MessagingDestinationControlListScreen-MessagingDestinationsControlLV-6-DestinationName']", AI = false)
	private WebElement inpDestination_26;

	@IFindBy(how = How.CSS, using = "input[name='MessagingDestinationControlList-MessagingDestinationControlListScreen-MessagingDestinationsControlLV-1-Status']", AI = false)
	private WebElement inpStatus_4;

	@IFindBy(how = How.CSS, using = "input[name='MessagingDestinationControlList-MessagingDestinationControlListScreen-MessagingDestinationsControlLV-7-DestinationName']", AI = false)
	private WebElement inpDestination_31;

	@IFindBy(how = How.CSS, using = "input[name='MessagingDestinationControlList-MessagingDestinationControlListScreen-MessagingDestinationsControlLV-2-Status']", AI = false)
	private WebElement inpStatus_9;

	@IFindBy(how = How.CSS, using = "input[name='MessagingDestinationControlList-MessagingDestinationControlListScreen-MessagingDestinationsControlLV-2-DestinationName']", AI = false)
	private WebElement inpDestination_6;

	@IFindBy(how = How.CSS, using = "input[name='MessagingDestinationControlList-MessagingDestinationControlListScreen-MessagingDestinationsControlLV-1-DestinationName']", AI = false)
	private WebElement inpDestination_1;

	@IFindBy(how = How.CSS, using = "input[name='MessagingDestinationControlList-MessagingDestinationControlListScreen-MessagingDestinationsControlLV-1-ServerId']", AI = false)
	private WebElement inpServerId_5;

	@IFindBy(how = How.CSS, using = "#MessagingDestinationControlList-MessagingDestinationControlListScreen-MessagingDestinationsControlLV-0-DestinationName-DestinationNameMenuIcon>div[role='button']", AI = false)
	private WebElement btnDestinationNameMenuIcon;

	@IFindBy(how = How.CSS, using = "#MessagingDestinationControlList-MessagingDestinationControlListScreen-MessagingDestinationsControlLV-4-DestinationName-DestinationNameMenuIcon>div[role='button']", AI = false)
	private WebElement btnDestinationNameMenuIcon_17;

	@IFindBy(how = How.CSS, using = "#MessagingDestinationControlList-MessagingDestinationControlListScreen-MessagingDestinationsControlLV-3-DestinationName-DestinationNameMenuIcon>div[role='button']", AI = false)
	private WebElement btnDestinationNameMenuIcon_12;

	@IFindBy(how = How.CSS, using = "#MessagingDestinationControlList-MessagingDestinationControlListScreen-MessagingDestinationsControlLV-5-DestinationName-DestinationNameMenuIcon>div[role='button']", AI = false)
	private WebElement btnDestinationNameMenuIcon_22;

	@IFindBy(how = How.CSS, using = "#MessagingDestinationControlList-MessagingDestinationControlListScreen-MessagingDestinationsControlLV-6-DestinationName-DestinationNameMenuIcon>div[role='button']", AI = false)
	private WebElement btnDestinationNameMenuIcon_27;

	@IFindBy(how = How.CSS, using = "#MessagingDestinationControlList-MessagingDestinationControlListScreen-MessagingDestinationsControlLV-7-DestinationName-DestinationNameMenuIcon>div[role='button']", AI = false)
	private WebElement btnDestinationNameMenuIcon_32;

	@IFindBy(how = How.CSS, using = "input[name='MessagingDestinationControlList-MessagingDestinationControlListScreen-MessagingDestinationsControlLV-0-DestinationName']", AI = false)
	private WebElement inpDestination;

	@IFindBy(how = How.CSS, using = "input[name='MessagingDestinationControlList-MessagingDestinationControlListScreen-MessagingDestinationsControlLV-3-DestinationID']", AI = false)
	private WebElement inpID_13;

	@IFindBy(how = How.CSS, using = "input[name='MessagingDestinationControlList-MessagingDestinationControlListScreen-MessagingDestinationsControlLV-4-DestinationID']", AI = false)
	private WebElement inpID_18;

	@IFindBy(how = How.CSS, using = "input[name='MessagingDestinationControlList-MessagingDestinationControlListScreen-MessagingDestinationsControlLV-6-DestinationID']", AI = false)
	private WebElement inpID_28;

	@IFindBy(how = How.CSS, using = "input[name='MessagingDestinationControlList-MessagingDestinationControlListScreen-MessagingDestinationsControlLV-5-DestinationID']", AI = false)
	private WebElement inpID_23;

	@IFindBy(how = How.CSS, using = "input[name='MessagingDestinationControlList-MessagingDestinationControlListScreen-MessagingDestinationsControlLV-6-ServerId']", AI = false)
	private WebElement inpServerId_30;

	@IFindBy(how = How.CSS, using = "input[name='MessagingDestinationControlList-MessagingDestinationControlListScreen-MessagingDestinationsControlLV-7-ServerId']", AI = false)
	private WebElement inpServerId_35;

	@IFindBy(how = How.CSS, using = "input[name='MessagingDestinationControlList-MessagingDestinationControlListScreen-MessagingDestinationsControlLV-7-DestinationID']", AI = false)
	private WebElement inpID_33;

	@IFindBy(how = How.CSS, using = "input[name='MessagingDestinationControlList-MessagingDestinationControlListScreen-MessagingDestinationsControlLV-4-ServerId']", AI = false)
	private WebElement inpServerId_20;

	@IFindBy(how = How.CSS, using = "input[name='MessagingDestinationControlList-MessagingDestinationControlListScreen-MessagingDestinationsControlLV-5-ServerId']", AI = false)
	private WebElement inpServerId_25;

	@IFindBy(how = How.CSS, using = "input[name='MessagingDestinationControlList-MessagingDestinationControlListScreen-MessagingDestinationsControlLV-2-ServerId']", AI = false)
	private WebElement inpServerId_10;

	@IFindBy(how = How.CSS, using = "input[name='MessagingDestinationControlList-MessagingDestinationControlListScreen-MessagingDestinationsControlLV-3-ServerId']", AI = false)
	private WebElement inpServerId_15;

	@IFindBy(how = How.CSS, using = "input[name='MessagingDestinationControlList-MessagingDestinationControlListScreen-MessagingDestinationsControlLV-3-Status']", AI = false)
	private WebElement inpStatus_14;

	@IFindBy(how = How.CSS, using = "input[name='MessagingDestinationControlList-MessagingDestinationControlListScreen-MessagingDestinationsControlLV-4-Status']", AI = false)
	private WebElement inpStatus_19;

	@IFindBy(how = How.CSS, using = "input[name='MessagingDestinationControlList-MessagingDestinationControlListScreen-MessagingDestinationsControlLV-0-DestinationID']", AI = false)
	private WebElement inpID;

	@IFindBy(how = How.CSS, using = "#MessagingDestinationControlList-MessagingDestinationControlListScreen-ttlBar", AI = false)
	private WebElement lblTtlBar;

	@IFindBy(how = How.XPATH, using = "//div[text()='Email']", AI = false)
	private WebElement lnkEmail;

	@IFindBy(how = How.CSS, using = "div[id$='DestinationNameHeader']", AI = false)
	public WebElement lblDestination;

	@IFindBy(how = How.CSS, using = "div[id$='DestinationIDHeader']", AI = false)
	public WebElement lblId;

	@IFindBy(how = How.CSS, using = "div[id$='StatusHeader']", AI = false)
	public WebElement lblStatus;

	@IFindBy(how = How.CSS, using = "div[id$='ServerIdHeader']", AI = false)
	public WebElement lblServerId;

	@IFindBy(how = How.CSS, using = "div[id$='MessagingDestinationsControlLV-_Checkbox']", AI = false)
	public WebElement chkAllMessageQueueDestination;

	String destinationRow = "div[id$='{INDEX}-DestinationName']";
	String statusRow = "div[id$='{INDEX}-Status']";
	String destinationQueueList = "div[id$='DestinationName']";
	String chkDestinationStatus = "div[id$='{INDEX}-_Checkbox']";

	public MessageQueuesPage(){
	}

	public MessageQueuesPage(WebDriver driver){
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(finder, this);
	}

	@Override
	protected void load() {
		isPageLoaded = true;
		WaitUtils.waitForPageLoad(driver);
	}
	@Override
	protected void isLoaded() {
		if (!isPageLoaded) {
			Assert.fail();
		}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, lblTtlBar))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);
	}

	public MessageQueuesPage enterStatus(WebDriver driver,String Status) {
		BrowserActions.type(driver, inpStatus,Status, "Status");
		return this;
	}
	public MessageQueuesPage enterID_8(WebDriver driver,String ID_8) {
		BrowserActions.type(driver, inpID_8,ID_8, "ID_8");
		return this;
	}
	public MessageQueuesPage enterID_3(WebDriver driver,String ID_3) {
		BrowserActions.type(driver, inpID_3,ID_3, "ID_3");
		return this;
	}
	public MessageQueuesPage clickDestinationNameMenuIcon_2(WebDriver driver)  {
		BrowserActions.click(driver, btnDestinationNameMenuIcon_2,"DestinationNameMenuIcon_2");
		return this;
	}
	public MessageQueuesPage clickDestinationNameMenuIcon_7(WebDriver driver)  {
		BrowserActions.click(driver, btnDestinationNameMenuIcon_7,"DestinationNameMenuIcon_7");
		return this;
	}
	public MessageQueuesPage enterStatus_24(WebDriver driver,String Status_24) {
		BrowserActions.type(driver, inpStatus_24,Status_24, "Status_24");
		return this;
	}
	public MessageQueuesPage enterStatus_29(WebDriver driver,String Status_29) {
		BrowserActions.type(driver, inpStatus_29,Status_29, "Status_29");
		return this;
	}
	public MessageQueuesPage enterStatus_34(WebDriver driver,String Status_34) {
		BrowserActions.type(driver, inpStatus_34,Status_34, "Status_34");
		return this;
	}
	public MessageQueuesPage clickSuspend(WebDriver driver)  {
		BrowserActions.click(driver, btnSuspend,"Suspend");
		return this;
	}
	public MessageQueuesPage clickResume(WebDriver driver)  {
		BrowserActions.click(driver, btnResume,"Resume");
		return this;
	}
	public MessageQueuesPage enterServerId(WebDriver driver,String ServerId) {
		BrowserActions.type(driver, inpServerId,ServerId, "ServerId");
		return this;
	}
	public MessageQueuesPage enterDestination_11(WebDriver driver,String Destination_11) {
		BrowserActions.type(driver, inpDestination_11,Destination_11, "Destination_11");
		return this;
	}
	public MessageQueuesPage clickRestartMessagingEngine(WebDriver driver)  {
		BrowserActions.click(driver, btnRestartMessagingEngine,"RestartMessagingEngine");
		BrowserActions.confirmAlert(driver, "Are you sure you want to restart the Messaging Engine?");
		return new MessageQueuesPage(driver).get();
	}
	public MessageQueuesPage enterDestination_16(WebDriver driver,String Destination_16) {
		BrowserActions.type(driver, inpDestination_16,Destination_16, "Destination_16");
		return this;
	}
	public MessageQueuesPage enterDestination_21(WebDriver driver,String Destination_21) {
		BrowserActions.type(driver, inpDestination_21,Destination_21, "Destination_21");
		return this;
	}
	public MessageQueuesPage enterDestination_26(WebDriver driver,String Destination_26) {
		BrowserActions.type(driver, inpDestination_26,Destination_26, "Destination_26");
		return this;
	}
	public MessageQueuesPage enterStatus_4(WebDriver driver,String Status_4) {
		BrowserActions.type(driver, inpStatus_4,Status_4, "Status_4");
		return this;
	}
	public MessageQueuesPage enterDestination_31(WebDriver driver,String Destination_31) {
		BrowserActions.type(driver, inpDestination_31,Destination_31, "Destination_31");
		return this;
	}
	public MessageQueuesPage enterStatus_9(WebDriver driver,String Status_9) {
		BrowserActions.type(driver, inpStatus_9,Status_9, "Status_9");
		return this;
	}
	public MessageQueuesPage enterDestination_6(WebDriver driver,String Destination_6) {
		BrowserActions.type(driver, inpDestination_6,Destination_6, "Destination_6");
		return this;
	}
	public MessageQueuesPage enterDestination_1(WebDriver driver,String Destination_1) {
		BrowserActions.type(driver, inpDestination_1,Destination_1, "Destination_1");
		return this;
	}
	public MessageQueuesPage enterServerId_5(WebDriver driver,String ServerId_5) {
		BrowserActions.type(driver, inpServerId_5,ServerId_5, "ServerId_5");
		return this;
	}
	public MessageQueuesPage clickDestinationNameMenuIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnDestinationNameMenuIcon,"DestinationNameMenuIcon");
		return this;
	}
	public MessageQueuesPage clickDestinationNameMenuIcon_17(WebDriver driver)  {
		BrowserActions.click(driver, btnDestinationNameMenuIcon_17,"DestinationNameMenuIcon_17");
		return this;
	}
	public MessageQueuesPage clickDestinationNameMenuIcon_12(WebDriver driver)  {
		BrowserActions.click(driver, btnDestinationNameMenuIcon_12,"DestinationNameMenuIcon_12");
		return this;
	}
	public MessageQueuesPage clickDestinationNameMenuIcon_22(WebDriver driver)  {
		BrowserActions.click(driver, btnDestinationNameMenuIcon_22,"DestinationNameMenuIcon_22");
		return this;
	}
	public MessageQueuesPage clickDestinationNameMenuIcon_27(WebDriver driver)  {
		BrowserActions.click(driver, btnDestinationNameMenuIcon_27,"DestinationNameMenuIcon_27");
		return this;
	}
	public MessageQueuesPage clickDestinationNameMenuIcon_32(WebDriver driver)  {
		BrowserActions.click(driver, btnDestinationNameMenuIcon_32,"DestinationNameMenuIcon_32");
		return this;
	}
	public MessageQueuesPage enterDestination(WebDriver driver,String Destination) {
		BrowserActions.type(driver, inpDestination,Destination, "Destination");
		return this;
	}
	public MessageQueuesPage enterID_13(WebDriver driver,String ID_13) {
		BrowserActions.type(driver, inpID_13,ID_13, "ID_13");
		return this;
	}
	public MessageQueuesPage enterID_18(WebDriver driver,String ID_18) {
		BrowserActions.type(driver, inpID_18,ID_18, "ID_18");
		return this;
	}
	public MessageQueuesPage enterID_28(WebDriver driver,String ID_28) {
		BrowserActions.type(driver, inpID_28,ID_28, "ID_28");
		return this;
	}
	public MessageQueuesPage enterID_23(WebDriver driver,String ID_23) {
		BrowserActions.type(driver, inpID_23,ID_23, "ID_23");
		return this;
	}
	public MessageQueuesPage enterServerId_30(WebDriver driver,String ServerId_30) {
		BrowserActions.type(driver, inpServerId_30,ServerId_30, "ServerId_30");
		return this;
	}
	public MessageQueuesPage enterServerId_35(WebDriver driver,String ServerId_35) {
		BrowserActions.type(driver, inpServerId_35,ServerId_35, "ServerId_35");
		return this;
	}
	public MessageQueuesPage enterID_33(WebDriver driver,String ID_33) {
		BrowserActions.type(driver, inpID_33,ID_33, "ID_33");
		return this;
	}
	public MessageQueuesPage enterServerId_20(WebDriver driver,String ServerId_20) {
		BrowserActions.type(driver, inpServerId_20,ServerId_20, "ServerId_20");
		return this;
	}
	public MessageQueuesPage enterServerId_25(WebDriver driver,String ServerId_25) {
		BrowserActions.type(driver, inpServerId_25,ServerId_25, "ServerId_25");
		return this;
	}
	public MessageQueuesPage enterServerId_10(WebDriver driver,String ServerId_10) {
		BrowserActions.type(driver, inpServerId_10,ServerId_10, "ServerId_10");
		return this;
	}
	public MessageQueuesPage enterServerId_15(WebDriver driver,String ServerId_15) {
		BrowserActions.type(driver, inpServerId_15,ServerId_15, "ServerId_15");
		return this;
	}
	public MessageQueuesPage enterStatus_14(WebDriver driver,String Status_14) {
		BrowserActions.type(driver, inpStatus_14,Status_14, "Status_14");
		return this;
	}
	public MessageQueuesPage enterStatus_19(WebDriver driver,String Status_19) {
		BrowserActions.type(driver, inpStatus_19,Status_19, "Status_19");
		return this;
	}
	public MessageQueuesPage enterID(WebDriver driver,String ID) {
		BrowserActions.type(driver, inpID,ID, "ID");
		return this;
	}
	public DestinationEmailPage clickEmail(WebDriver driver)  {
		BrowserActions.click(driver, lnkEmail,"Email ");
		return new DestinationEmailPage(driver).get();
	}
	public MessageQueuesPage verifyDestinationIsDisplay(WebDriver driver) {
		BrowserActions.verifyElementDisplayed(driver, lblDestination,"Destination");
		return this;
	}
	public MessageQueuesPage verifyStatusIsDisplay(WebDriver driver) {
		BrowserActions.verifyElementDisplayed(driver, lblStatus,"Status");
		return this;
	}
	public MessageQueuesPage verifyServerIdIsDisplay(WebDriver driver) {
		BrowserActions.verifyElementDisplayed(driver, lblServerId,"Server Id");
		return this;
	}
	public MessageQueuesPage verifyIdIsDisplay(WebDriver driver) {
		BrowserActions.verifyElementDisplayed(driver, lblId,"Id");
		return this;
	}
	
	/**
	 * Verify Message Queue All Destination Status
	 * @param driver 
	 * @return
	 */


	public void verifyMessageQueueAllDestinationStatus(WebDriver driver) {
		new MessageQueuesPage(driver).get();
		By destinationRowBy = By.cssSelector(destinationQueueList);
		List<WebElement> statusElements = BrowserActions.getWebElements(driver, destinationRowBy, "destinationQueueList", 0.5);
		int destinationRowCount = statusElements.size();
		for (int i = 0; i < destinationRowCount; i++) {

			String statusColumn = statusRow.replaceAll("\\{INDEX\\}",""+(i));
			String destinationColumn = destinationRow.replaceAll("\\{INDEX\\}",""+(i));

			By statusBy = By.cssSelector(statusColumn);
			BrowserActions.waitForElementToDisplay(driver, statusBy, "Status");
			WebElement status = statusBy.findElement(driver);

			By destinationBy = By.cssSelector(destinationColumn);
			BrowserActions.waitForElementToDisplay(driver, destinationBy, "destination");
			WebElement destinationName = destinationBy.findElement(driver);

			String destinationText = BrowserActions.getText(driver, destinationName, "destination Name");
			String currentstatus = BrowserActions.getText(driver, status, "Status of destination");

			if (!currentstatus.equals("Started")) {
				Log.fail("Status of " + destinationText + " is not Started",driver);
			} 
		}
		Log.messageStep("All Destinations are in - Started status",driver,true);
	}
	
	/**
	 * Validate And Update Message Queue Status As Started
	 * @param driver 
	 * @return
	 */

	public void validateAndUpdateMessageQueueStatusAsStarted(WebDriver driver) {
		new MessageQueuesPage(driver).get();
		By destinationRowBy = By.cssSelector(destinationQueueList);
		List<WebElement> statusElements = BrowserActions.getWebElements(driver, destinationRowBy, "destinationQueueList", 0.5);
		int destinationRowCount = statusElements.size();
		for (int i = 0; i < destinationRowCount; i++) {

			String statusColumn = statusRow.replaceAll("\\{INDEX\\}",""+(i));
			String destinationColumn = destinationRow.replaceAll("\\{INDEX\\}",""+(i));
			String destinationCheckBox = chkDestinationStatus.replaceAll("\\{INDEX\\}",""+(i));

			By statusBy = By.cssSelector(statusColumn);
			BrowserActions.waitForElementToDisplay(driver, statusBy, "Status");
			WebElement status = statusBy.findElement(driver);

			By destinationBy = By.cssSelector(destinationColumn);
			BrowserActions.waitForElementToDisplay(driver, destinationBy, "destination");
			WebElement destinationName = destinationBy.findElement(driver);

			String destinationText = BrowserActions.getText(driver, destinationName, "destination Name");
			String currentstatus = BrowserActions.getText(driver, status, "Status of destination");

			if (!currentstatus.equals("Started")) {
				By checkBoxBy = By.xpath(destinationCheckBox);
				BrowserActions.waitForElementToDisplay(driver, checkBoxBy, "Destination Check Box");
				WebElement suspendCheckBox = checkBoxBy.findElement(driver);
				BrowserActions.click(driver, suspendCheckBox, "Suspend CheckBox");
				BrowserActions.click(driver, btnResume, "Resume");
				Log.message("Status of "+ destinationText +" started again");
			} 
		}
		Log.messageStep("All Destinations are in - Started status",driver,true);

	}
	
	/**
	 *Update Message Queue Status As Resume
	 * @param driver  
	 * @return
	 */

	public MessageQueuesPage updateMessageQueueStatusAsResume(WebDriver driver) {
		By destinationRowBy = By.cssSelector(destinationQueueList);
		List<WebElement> statusElements = BrowserActions.getWebElements(driver, destinationRowBy, "destinationQueueList", 0.5);
		int destinationRowCount = statusElements.size();
		for (int i = 0; i < destinationRowCount; i++) {

			String statusColumn = statusRow.replaceAll("\\{INDEX\\}",""+(i));
			String destinationColumn = destinationRow.replaceAll("\\{INDEX\\}",""+(i));
			String destinationCheckBox = chkDestinationStatus.replaceAll("\\{INDEX\\}",""+(i));

			By statusBy = By.cssSelector(statusColumn);
			BrowserActions.waitForElementToDisplay(driver, statusBy, "Status");
			WebElement status = statusBy.findElement(driver);

			By destinationBy = By.cssSelector(destinationColumn);
			BrowserActions.waitForElementToDisplay(driver, destinationBy, "destination");
			WebElement destinationName = destinationBy.findElement(driver);

			String currentstatus = BrowserActions.getText(driver, status, "status of destination");
			String destinationText = BrowserActions.getText(driver, destinationName, "destination Name");

			if (!currentstatus.equalsIgnoreCase("Started")) {

				By checkBoxBy = By.cssSelector(destinationCheckBox);
				BrowserActions.waitForElementToDisplay(driver, checkBoxBy, "Destination Check Box");
				WebElement suspendCheckBox = checkBoxBy.findElement(driver);
				BrowserActions.click(driver, suspendCheckBox, "Suspend CheckBox");

				BrowserActions.click(driver, btnResume, "Resume");//getText and verify

				String statusCheck = BrowserActions.getText(driver, status, "status of destination");
				if(statusCheck.equals("Started")) {
					Log.messageStep(destinationText + " - resume button clicked and status was updated as Started" +  " ", driver, true);
				}
				Log.messageStep("Resumed the suspended destination - " + destinationText + " ", driver, true);
			}
		}
		Log.messageStep("All Status are Started ", driver, true);
		return this;
	}
	
	/**
	 * Click All Message Queue destination
	 * @param driver 
	 * @return
	 */

	public MessageQueuesPage clickAllMessageQueueDestination(WebDriver driver) {
		BrowserActions.click(driver, chkAllMessageQueueDestination, "Message Queue destination all check box");
		return this;
	}

}
