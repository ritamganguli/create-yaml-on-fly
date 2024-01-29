package com.aspire.guidewire.pc.testscripts;


import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aspire.guidewire.pc.teststeps.nonlob.NonLobFeatures.MessageQueue;
import com.aspire.guidewire.pc.pages.nonlob.AdministrationPage;
import com.aspire.guidewire.pc.pages.nonlob.MessageQueuesPage;
import com.aspire.guidewire.pc.teststeps.nonlob.NonLobImpl;
import com.aspire.guidewire.pc.teststeps.nonlob.NonLobSteps;
import com.aspire.guidewire.utils.DataProviderUtils;
import com.aspire.guidewire.utils.EnvironmentPropertiesReader;
import com.aspire.guidewire.utils.Log;
import com.aspire.guidewire.webdriverManager.DriverManager;

public class PC_MessageQueueSuite {

	boolean LambdatestStatus = false;

	private static EnvironmentPropertiesReader configProperty = EnvironmentPropertiesReader.getInstance();

	String pCWebSite, browser, contentGraphqlURL, browseAllContentGraphqlURL, sheetName;

	protected static ThreadLocal<WebDriver> threadLocalDriver = new ThreadLocal<>();

	@BeforeTest(alwaysRun = true)
	public void init(ITestContext context) {

		pCWebSite = (System.getProperty("pCWebSite") != null ? System.getProperty("pCWebSite"): context.getCurrentXmlTest().getParameter("pCWebSite"));
		DriverManager.setPCWebsite(pCWebSite);

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
			
			NonLobImpl pc = NonLobSteps.create();
			pc.loginIntoTheApplication("su", "gw");
			AdministrationPage administrationPage = new AdministrationPage(DriverManager.getDriver());
			administrationPage.clickToggleAdministrationSubMenu(driver);
			administrationPage.clickMonitoring(driver);
			administrationPage.clickMessageQueues(driver);
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

			NonLobImpl pc = NonLobSteps.create();
			pc.loginIntoTheApplication("su", "gw");
			pc.resumeOrRestartMessageQueues(MessageQueue.builder().build());
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

			NonLobImpl pc = NonLobSteps.create();
			pc.loginIntoTheApplication("su", "gw");
			pc.resumeOrRestartMessageQueues(MessageQueue.builder().restartMessageQueue(true).build());
			Log.testCaseResult(driver);

		} catch (Exception e) {
			Log.exception(e, DriverManager.getDriver());
		} finally {
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}

	}

}