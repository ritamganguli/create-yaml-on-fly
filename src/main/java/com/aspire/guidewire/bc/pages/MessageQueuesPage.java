package com.aspire.guidewire.bc.pages;

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

	@IFindBy(how = How.CSS, using = "#MessagingDestinationControlList-MessagingDestinationControlListScreen-MessagingDestinationControlList_SuspendButton>div[role='button']", AI = false)
	private WebElement btnSuspend;

	@IFindBy(how = How.CSS, using = "div[id$='ResumeButton']", AI = false)
	private WebElement btnResume;

	@IFindBy(how = How.CSS, using = "input[name='MessagingDestinationControlList-MessagingDestinationControlListScreen-MessagingDestinationsControlLV-0-ServerId']", AI = false)
	private WebElement inpServerId;

	@IFindBy(how = How.CSS, using = "div[id$='RestartMessagingEngineButton']", AI = false)
	private WebElement btnRestartMessagingEngine;

	@IFindBy(how = How.CSS, using = "#MessagingDestinationControlList-MessagingDestinationControlListScreen-MessagingDestinationsControlLV-0-DestinationName-DestinationNameMenuIcon>div[role='button']", AI = false)
	private WebElement btnDestinationNameMenuIcon;

	@IFindBy(how = How.CSS, using = "input[name='MessagingDestinationControlList-MessagingDestinationControlListScreen-MessagingDestinationsControlLV-0-DestinationName']", AI = false)
	private WebElement inpDestination;

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
	}@Override
	protected void isLoaded() {
		if (!isPageLoaded) {
			Assert.fail();
		}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, lblTtlBar))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);
	}public MessageQueuesPage enterStatus(WebDriver driver,String Status) {
		BrowserActions.type(driver, inpStatus,Status, "Status");
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
	public MessageQueuesPage clickRestartMessagingEngine(WebDriver driver)  {
		BrowserActions.click(driver, btnRestartMessagingEngine,"RestartMessagingEngine");
		BrowserActions.confirmAlert(driver, "Are you sure you want to restart the Messaging Engine?");
		return new MessageQueuesPage(driver).get();
	}
	public MessageQueuesPage clickDestinationNameMenuIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnDestinationNameMenuIcon,"DestinationNameMenuIcon");
		return this;
	}
	public MessageQueuesPage enterDestination(WebDriver driver,String Destination) {
		BrowserActions.type(driver, inpDestination,Destination, "Destination");
		return this;
	}
	public MessageQueuesPage enterID(WebDriver driver,String ID) {
		BrowserActions.type(driver, inpID,ID, "ID");
		return this;
	}
	public void clickEmail(WebDriver driver)  {
		BrowserActions.click(driver, lnkEmail,"Email ");
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

	public MessageQueuesPage clickAllMessageQueueDestination(WebDriver driver) {
		BrowserActions.click(driver, chkAllMessageQueueDestination, "Message Queue destination all check box");
		return this;
	}

}
