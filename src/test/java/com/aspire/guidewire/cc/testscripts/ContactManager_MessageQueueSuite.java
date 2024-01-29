package com.aspire.guidewire.cc.testscripts;


import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aspire.guidewire.cc.pages.common.HeaderPage;
import com.aspire.guidewire.cc.pages.nonlob.MessageQueuesPage;
import com.aspire.guidewire.cc.teststeps.nonlob.NonLobFeatures.MessageQueue;
import com.aspire.guidewire.cc.teststeps.nonlob.NonLobImpl;
import com.aspire.guidewire.cc.teststeps.nonlob.NonLobSteps;
import com.aspire.guidewire.utils.DataProviderUtils;
import com.aspire.guidewire.utils.EnvironmentPropertiesReader;
import com.aspire.guidewire.utils.Log;
import com.aspire.guidewire.webdriverManager.DriverManager;

public class ContactManager_MessageQueueSuite {

	boolean LambdatestStatus = false;

	String ccWebSite,cmWebSite, browser, contentGraphqlURL, browseAllContentGraphqlURL, sheetName;

	private static EnvironmentPropertiesReader configProperty = EnvironmentPropertiesReader.getInstance();

	protected static ThreadLocal<WebDriver> threadLocalDriver = new ThreadLocal<>();

	@BeforeTest(alwaysRun = true)
	public void init(ITestContext context) {

		cmWebSite = (System.getProperty("cmWebSite") != null ? System.getProperty("cmWebSite"): context.getCurrentXmlTest().getParameter("cmWebSite"));
		DriverManager.setCMWebsite(cmWebSite);

		ccWebSite = (System.getProperty("ccWebSite") != null ? System.getProperty("ccWebSite"): context.getCurrentXmlTest().getParameter("ccWebSite"));
		DriverManager.setCCWebsite(ccWebSite);

		if(configProperty.hasProperty("runLambdaTestFromLocal") && configProperty.getProperty("runLambdaTestFromLocal").trim().equalsIgnoreCase("true")){
			LambdatestStatus = true;
		}
	}

	/**
	 * @author Manikandan.Maohar
	 * @param browser
	 * @throws Exception
	 */
	@Test(description = "To Verify the Message queues status and resume the suspended ones", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC001(String browser) throws Exception {
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To Verify the Message queues status and resume the suspended ones", driver);
		try {
			
			NonLobImpl cm = NonLobSteps.create();
			cm.loginIntoContactManagerApplication("su", "gw");
			HeaderPage headerPage = new HeaderPage(DriverManager.getDriver());
			headerPage.clickAdministrationbutton(DriverManager.getDriver());
			headerPage.clickToggleMonitoringSubmenu(DriverManager.getDriver());
			headerPage.clickMessageQueue(DriverManager.getDriver());			
			MessageQueuesPage messageQueuesPage = new MessageQueuesPage(DriverManager.getDriver());
			messageQueuesPage.verifyMessageQueueAllDestinationStatus(driver);
			Log.testCaseResult(driver);

		} catch (Exception e) {
			Log.exception(e, DriverManager.getDriver());
		} finally {
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}

	}


	/**
	 * @author Manikandan.Maohar
	 * @param browser
	 * @throws Exception
	 */
	@Test(description = "Update message queues status as resume from suspended ones", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC002(String browser) throws Exception {
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("Update message queues status as resume from suspended ones", driver);

		try {

			NonLobImpl cm = NonLobSteps.create();
			cm.loginIntoContactManagerApplication("su", "gw");
			cm.resumeOrRestartMessageQueues(MessageQueue.builder().build());
			Log.testCaseResult(driver);

		} catch (Exception e) {
			Log.exception(e, DriverManager.getDriver());
		} finally {
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}

	}

	/**
	 * @author Manikandan.Maohar
	 * @param browser
	 * @throws Exception
	 */
	@Test(description = "To Restart the message engine after resuming the message queues", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC003(String browser) throws Exception {
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To Restart the message engine after resuming the message queues", driver);

		try {

			NonLobImpl cm = NonLobSteps.create();
			cm.loginIntoContactManagerApplication("su", "gw");
			cm.resumeOrRestartMessageQueues(MessageQueue.builder().restartMessageQueue(true).build());
			Log.testCaseResult(driver);

		} catch (Exception e) {
			Log.exception(e, DriverManager.getDriver());
		} finally {
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}

	}

}
