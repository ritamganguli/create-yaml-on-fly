package com.aspire.guidewire.bc.testscripts;


import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aspire.guidewire.bc.pages.HeaderPage;
import com.aspire.guidewire.bc.pages.MessageQueuesPage;
import com.aspire.guidewire.bc.teststeps.BillingCenterFeatures.MessageQueue;
import com.aspire.guidewire.bc.teststeps.BillingCenterSteps;
import com.aspire.guidewire.bc.teststeps.BillingCenterStepsImpl;
import com.aspire.guidewire.utils.DataProviderUtils;
import com.aspire.guidewire.utils.EnvironmentPropertiesReader;
import com.aspire.guidewire.utils.Log;
import com.aspire.guidewire.webdriverManager.DriverManager;

public class BC_MessageQueueSuite {

	boolean LambdatestStatus = false;

	String pcWebSite, bcWebSite, browser, contentGraphqlURL, browseAllContentGraphqlURL, sheetName;

	private static EnvironmentPropertiesReader configProperty = EnvironmentPropertiesReader.getInstance();

	protected static ThreadLocal<WebDriver> threadLocalDriver = new ThreadLocal<>();

	@BeforeTest(alwaysRun = true)
	public void init(ITestContext context) {
		
		pcWebSite = (System.getProperty("pcWebSite") != null ? System.getProperty("pcWebSite"): context.getCurrentXmlTest().getParameter("pcWebSite"));
		DriverManager.setPCWebsite(pcWebSite);
		
		bcWebSite = (System.getProperty("bcWebSite") != null ? System.getProperty("bcWebSite"): context.getCurrentXmlTest().getParameter("bcWebSite"));
		DriverManager.setBCWebsite(bcWebSite);
		
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
			
			BillingCenterStepsImpl bc = BillingCenterSteps.create();
			bc.loginIntoTheApplication("su", "gw");
			HeaderPage headerPage = new HeaderPage(DriverManager.getDriver());
			headerPage.clickAdministrationSubMenu(DriverManager.getDriver());
			headerPage.clickAdministrationMonitoring(DriverManager.getDriver());
			headerPage.clickMonitoringMessageQueues(DriverManager.getDriver());			
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

			BillingCenterStepsImpl bc = BillingCenterSteps.create();
			bc.loginIntoTheApplication("su", "gw");
			bc.resumeOrRestartMessageQueues(MessageQueue.builder().build());
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
			BillingCenterStepsImpl bc = BillingCenterSteps.create();
			bc.loginIntoTheApplication("su", "gw");
			bc.resumeOrRestartMessageQueues(MessageQueue.builder().restartMessageQueue(true).build());
			Log.testCaseResult(driver);

		} catch (Exception e) {
			Log.exception(e, DriverManager.getDriver());
		} finally {
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}

	}

}