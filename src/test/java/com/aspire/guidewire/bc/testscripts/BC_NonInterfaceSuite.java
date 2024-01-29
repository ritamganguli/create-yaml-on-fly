package com.aspire.guidewire.bc.testscripts;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aspire.guidewire.bc.pages.AccountDisbursementWizardDetailPage;
import com.aspire.guidewire.bc.pages.AccountDisbursementWizardPage;
import com.aspire.guidewire.bc.pages.AccountSummaryPage;
import com.aspire.guidewire.bc.pages.ActionsPage;
import com.aspire.guidewire.bc.pages.CreditReversalWizardPage;
import com.aspire.guidewire.bc.pages.CreditWizardPage;
import com.aspire.guidewire.bc.pages.DirectBillPaymentPage;
import com.aspire.guidewire.bc.pages.DirectBillPaymentPage.NewPaymentInstrumentPage;
import com.aspire.guidewire.bc.pages.HeaderPage;
import com.aspire.guidewire.bc.pages.MyActivitiesPage;
import com.aspire.guidewire.bc.pages.TransactionWizardPage;
import com.aspire.guidewire.bc.pages.TroubleTicketWizardPage;
import com.aspire.guidewire.bc.pages.TroubleTicketsPage;
import com.aspire.guidewire.bc.pages.WriteOffReversalWizardPage;
import com.aspire.guidewire.bc.pages.WriteOffWizardPage;
import com.aspire.guidewire.bc.teststeps.BillingCenterDataEngine;
import com.aspire.guidewire.bc.teststeps.BillingCenterSteps;
import com.aspire.guidewire.bc.teststeps.BillingCenterStepsImpl;
import com.aspire.guidewire.utils.DataProviderUtils;
import com.aspire.guidewire.utils.EnvironmentPropertiesReader;
import com.aspire.guidewire.utils.Log;
import com.aspire.guidewire.webdriverManager.DriverManager;


public class BC_NonInterfaceSuite  {

	boolean LambdatestStatus = false;

	String bcWebSite, pcWebSite, browser, contentGraphqlURL, browseAllContentGraphqlURL, sheetName, policyNumber;
	ThreadLocal <String> policyNumberForClaim = new ThreadLocal<>();
	private static EnvironmentPropertiesReader configProperty = EnvironmentPropertiesReader.getInstance();

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
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To Verify Whether able to make ACH/EFT Payment in BC.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC3(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To Verify Whether able to make ACH/EFT Payment in BC.",driver);
        BillingCenterDataEngine testData = new BillingCenterDataEngine("BC_GWTestData_DataEngine.xlsx", "NonInterfaceSuite", "TC3");
	
		try {	

			BillingCenterStepsImpl bc = BillingCenterSteps.create();
			bc.loginIntoTheApplication("su", "gw");
			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clickPolicyIcon(driver);
			headerPage.enterPolicyNumber(driver,testData.getPolicyNumber());
			headerPage.clickSearch(driver);
			headerPage.clickAccountNumber(driver);
			ActionsPage actionsPage = new ActionsPage(driver);
			actionsPage.clickAction(driver);
			actionsPage.moveToNewPayments(driver);
			DirectBillPaymentPage directBillPaymentPage = actionsPage.clickNewDirectBillPayment(driver);
			directBillPaymentPage.selectUnappliedFund(driver, testData.getUnappliedFund());
			directBillPaymentPage.clickNew(driver);
			NewPaymentInstrumentPage newPaymentInstrumentPage = directBillPaymentPage.new NewPaymentInstrumentPage(driver).get();
			newPaymentInstrumentPage.selectPaymentMethod(driver, testData.getPaymentMethod());
			newPaymentInstrumentPage.clickOK(driver);
			directBillPaymentPage.enterAmount(driver, testData.getAmount());
			AccountSummaryPage accountSummaryPage = directBillPaymentPage.clickExecuteWithoutDistribution(driver);
			accountSummaryPage.verifyAmountIsPresent(driver,testData.getAmount());
			Log.testCaseResult(driver);

		} catch (Exception e) {
			Log.exception(e, DriverManager.getDriver());
		} finally {
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}
	/**
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To Verify Whether able to make CC Payment in BC.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC4(String browser) throws Exception {
		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To Verify Whether able to make CC Payment in BC.",driver);
		BillingCenterDataEngine testData = new BillingCenterDataEngine("BC_GWTestData_DataEngine.xlsx", "NonInterfaceSuite", "TC4");
		
		try {	
			
			BillingCenterStepsImpl bc = BillingCenterSteps.create();
			
			bc.loginIntoTheApplication("su", "gw");
			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clickPolicyIcon(driver);
			headerPage.enterPolicyNumber(driver,testData.getPolicyNumber());
			headerPage.clickSearch(driver);
			headerPage.clickAccountNumber(driver);
			ActionsPage actionsPage = new ActionsPage(driver);
			actionsPage.clickAction(driver);
			actionsPage.moveToNewPayments(driver);
			DirectBillPaymentPage directBillPaymentPage = actionsPage.clickNewDirectBillPayment(driver);
			directBillPaymentPage.selectUnappliedFund(driver, testData.getUnappliedFund());
			directBillPaymentPage.clickNew(driver);
			NewPaymentInstrumentPage newPaymentInstrumentPage = directBillPaymentPage.new NewPaymentInstrumentPage(driver);
			newPaymentInstrumentPage.selectPaymentMethod(driver, testData.getPaymentMethod());
			newPaymentInstrumentPage.clickOK(driver);
			directBillPaymentPage.enterAmount(driver, testData.getAmount());
			AccountSummaryPage accountSummaryPage = directBillPaymentPage.clickExecuteWithoutDistribution(driver);
			accountSummaryPage.verifyAmountIsPresent(driver,testData.getAmount());
			Log.testCaseResult(driver);

		} catch (Exception e) {
			Log.exception(e, DriverManager.getDriver());
		} finally {
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}
	/**
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To Verify Whether able to make Wire Payment in BC.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC5(String browser) throws Exception {
		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To Verify Whether able to make Wire Payment in BC.",driver);
		BillingCenterDataEngine testData = new BillingCenterDataEngine("BC_GWTestData_DataEngine.xlsx", "NonInterfaceSuite", "TC5");
		
		try {	
			
			BillingCenterStepsImpl bc = BillingCenterSteps.create();
			
			bc.loginIntoTheApplication("su", "gw");
			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clickPolicyIcon(driver);
			headerPage.enterPolicyNumber(driver,testData.getPolicyNumber());
			headerPage.clickSearch(driver);
			headerPage.clickAccountNumber(driver);
			ActionsPage actionsPage = new ActionsPage(driver);
			actionsPage.clickAction(driver);
			actionsPage.moveToNewPayments(driver);
			DirectBillPaymentPage directBillPaymentPage = actionsPage.clickNewDirectBillPayment(driver);
			directBillPaymentPage.selectUnappliedFund(driver, testData.getUnappliedFund());
			directBillPaymentPage.clickNew(driver);
			NewPaymentInstrumentPage newPaymentInstrumentPage = directBillPaymentPage.new NewPaymentInstrumentPage(driver);
			newPaymentInstrumentPage.selectPaymentMethod(driver, testData.getPaymentMethod());
			newPaymentInstrumentPage.clickOK(driver);
			directBillPaymentPage.enterAmount(driver, testData.getAmount());
			AccountSummaryPage accountSummaryPage = directBillPaymentPage.clickExecuteWithoutDistribution(driver);
			accountSummaryPage.verifyAmountIsPresent(driver,testData.getAmount());
			Log.testCaseResult(driver);

		} catch (Exception e) {
			Log.exception(e, DriverManager.getDriver());
		} finally {
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}
	/**
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To Verify Whether able to make Misc Payment in BC.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC6(String browser) throws Exception {
		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To Verify Whether able to make Misc Payment in BC.",driver);
		BillingCenterDataEngine testData = new BillingCenterDataEngine("BC_GWTestData_DataEngine.xlsx", "NonInterfaceSuite", "TC6");
		
		try {	
			
			BillingCenterStepsImpl bc = BillingCenterSteps.create();
			
			bc.loginIntoTheApplication("su", "gw");
			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clickPolicyIcon(driver);
			headerPage.enterPolicyNumber(driver,testData.getPolicyNumber());
			headerPage.clickSearch(driver);
			headerPage.clickAccountNumber(driver);
			ActionsPage actionsPage = new ActionsPage(driver);
			actionsPage.clickAction(driver);
			actionsPage.moveToNewPayments(driver);
			DirectBillPaymentPage directBillPaymentPage = actionsPage.clickNewDirectBillPayment(driver);
			directBillPaymentPage.selectUnappliedFund(driver, testData.getUnappliedFund());
			directBillPaymentPage.clickNew(driver);
			NewPaymentInstrumentPage newPaymentInstrumentPage = directBillPaymentPage.new NewPaymentInstrumentPage(driver);
			newPaymentInstrumentPage.selectPaymentMethod(driver, testData.getPaymentMethod());
			newPaymentInstrumentPage.clickOK(driver);
			 directBillPaymentPage.enterAmount(driver, testData.getAmount());
			AccountSummaryPage accountSummaryPage = directBillPaymentPage.clickExecuteWithoutDistribution(driver);
			accountSummaryPage.verifyAmountIsPresent(driver,testData.getAmount());
			Log.testCaseResult(driver);

		} catch (Exception e) {
			Log.exception(e, DriverManager.getDriver());
		} finally {
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}
	
	/**
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To Verify Whether able to make Check Payment in BC.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC7(String browser) throws Exception {
		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To Verify Whether able to make Check Payment in BC.",driver);
		BillingCenterDataEngine testData = new BillingCenterDataEngine("BC_GWTestData_DataEngine.xlsx", "NonInterfaceSuite", "TC7");
		
		try {	
			
			BillingCenterStepsImpl bc = BillingCenterSteps.create();
			
			bc.loginIntoTheApplication("su", "gw");
			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clickPolicyIcon(driver);
			headerPage.enterPolicyNumber(driver,testData.getPolicyNumber());
			headerPage.clickSearch(driver);
			headerPage.clickAccountNumber(driver);
			ActionsPage actionsPage = new ActionsPage(driver);
			actionsPage.clickAction(driver);
			actionsPage.moveToNewPayments(driver);
			DirectBillPaymentPage directBillPaymentPage = actionsPage.clickNewDirectBillPayment(driver);
			directBillPaymentPage.selectUnappliedFund(driver, testData.getUnappliedFund());
			directBillPaymentPage.selectPaymentInstrument(driver, testData.getPaymentInstrument());
			directBillPaymentPage.enterAmount(driver, testData.getAmount());
			AccountSummaryPage accountSummaryPage = directBillPaymentPage.clickExecuteWithoutDistribution(driver);
			accountSummaryPage.verifyAmountIsPresent(driver,testData.getAmount());
			Log.testCaseResult(driver);

		} catch (Exception e) {
			Log.exception(e, DriverManager.getDriver());
		} finally {
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}
	/**
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To Verify Whether able to make Cash Payment in BC.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC8(String browser) throws Exception {
		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To Verify Whether able to make Cash Payment in BC.",driver);
		BillingCenterDataEngine testData = new BillingCenterDataEngine("BC_GWTestData_DataEngine.xlsx", "NonInterfaceSuite", "TC8");
		
		try {	
			
			BillingCenterStepsImpl bc = BillingCenterSteps.create();
			
			bc.loginIntoTheApplication("su", "gw");
			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clickPolicyIcon(driver);
			headerPage.enterPolicyNumber(driver,testData.getPolicyNumber());
			headerPage.clickSearch(driver);
			headerPage.clickAccountNumber(driver);
			ActionsPage actionsPage = new ActionsPage(driver);
			actionsPage.clickAction(driver);
			actionsPage.moveToNewPayments(driver);
			DirectBillPaymentPage directBillPaymentPage = actionsPage.clickNewDirectBillPayment(driver);
			directBillPaymentPage.selectUnappliedFund(driver, testData.getUnappliedFund());
			directBillPaymentPage.selectPaymentInstrument(driver, testData.getPaymentInstrument());
			directBillPaymentPage.enterAmount(driver, testData.getAmount());
			AccountSummaryPage accountSummaryPage = directBillPaymentPage.clickExecuteWithoutDistribution(driver);
			accountSummaryPage.verifyAmountIsPresent(driver,testData.getAmount());
			Log.testCaseResult(driver);

		} catch (Exception e) {
			Log.exception(e, DriverManager.getDriver());
		} finally {
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}
	/**
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To Verify Whether able to make a Direct Bill Payment in BC ", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC1(String browser) throws Exception {
		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To Verify Whether able to make a Direct Bill Payment in BC ",driver);
		BillingCenterDataEngine testData = new BillingCenterDataEngine("BC_GWTestData_DataEngine.xlsx", "NonInterfaceSuite", "TC1");
		
		try {	
			
			BillingCenterStepsImpl bc = BillingCenterSteps.create();
			
			bc.loginIntoTheApplication("su", "gw");
			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clickPolicyIcon(driver);
			headerPage.enterPolicyNumber(driver,testData.getPolicyNumber());
			headerPage.clickSearch(driver);
			headerPage.clickAccountNumber(driver);
			ActionsPage actionsPage = new ActionsPage(driver);
			actionsPage.clickAction(driver);
			actionsPage.moveToNewPayments(driver);
			DirectBillPaymentPage directBillPaymentPage = actionsPage.clickNewDirectBillPayment(driver);
			directBillPaymentPage.selectUnappliedFund(driver, testData.getUnappliedFund());
			directBillPaymentPage.enterAmount(driver, testData.getAmount());
			AccountSummaryPage accountSummaryPage = directBillPaymentPage.clickExecuteWithoutDistribution(driver);
			accountSummaryPage.verifyAmountIsPresent(driver,testData.getAmount());
			Log.testCaseResult(driver);

		} catch (Exception e) {
			Log.exception(e, DriverManager.getDriver());
		} finally {
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}
	/**
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To Verify Whether able to make a Direct Bill Payment in BC ", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC75(String browser) throws Exception {
		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To Verify Whether able to make a Direct Bill Payment in BC ",driver);
		BillingCenterDataEngine testData = new BillingCenterDataEngine("BC_GWTestData_DataEngine.xlsx", "NonInterfaceSuite", "TC75");
		
		try {	
			
			BillingCenterStepsImpl bc = BillingCenterSteps.create();
			
			bc.loginIntoTheApplication("su", "gw");
			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clickPolicyIcon(driver);
			headerPage.enterPolicyNumber(driver,testData.getPolicyNumber());
			headerPage.clickSearch(driver);
			String accNo=headerPage.getAccountNo(driver);
			headerPage.clickAccountNumber(driver);
			ActionsPage actionsPage = new ActionsPage(driver);
			actionsPage.clickAction(driver);
			actionsPage.moveToNewPayments(driver);
			DirectBillPaymentPage directBillPaymentPage = actionsPage.clickNewDirectBillPayment(driver);
			directBillPaymentPage.verifyAccountNo(driver, accNo);
			directBillPaymentPage.verifyReceievedDate(driver);
			directBillPaymentPage.verifyAmount(driver);
			directBillPaymentPage.verifyUnappliedFunds(driver);
			directBillPaymentPage.verifyThisPayment(driver);
			directBillPaymentPage.verifyPaymentInstrument(driver);
			directBillPaymentPage.verifyPaymentDetails(driver);
			directBillPaymentPage.verifyCancelbutton(driver);
			directBillPaymentPage.verifyExecuteWithoutDistributionButton(driver);
			directBillPaymentPage.verifyReturnToAccountSummaryButton(driver);
			Log.testCaseResult(driver);

		} catch (Exception e) {
			Log.exception(e, DriverManager.getDriver());
		} finally {
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}
	/**
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Verify whether Amount field in Direct Bill payment page accepts only numeric values to make payment.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC76(String browser) throws Exception {
		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("Verify whether Amount field in Direct Bill payment page accepts only numeric values to make payment.",driver);
		BillingCenterDataEngine testData = new BillingCenterDataEngine("BC_GWTestData_DataEngine.xlsx", "NonInterfaceSuite", "TC76");
		
		try {	
			
			BillingCenterStepsImpl bc = BillingCenterSteps.create();
			
			bc.loginIntoTheApplication("su", "gw");
			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clickPolicyIcon(driver);
			headerPage.enterPolicyNumber(driver,testData.getPolicyNumber());
			headerPage.clickSearch(driver);
			headerPage.getAccountNo(driver);
			headerPage.clickAccountNumber(driver);
			ActionsPage actionsPage = new ActionsPage(driver);
			actionsPage.clickAction(driver);
			actionsPage.moveToNewPayments(driver);
			DirectBillPaymentPage directBillPaymentPage = actionsPage.clickNewDirectBillPayment(driver);
			directBillPaymentPage.verifyAmountFieldAcceptSplCharandAlphabet(driver);
			directBillPaymentPage.selectUnappliedFund(driver, testData.getUnappliedFund());
			directBillPaymentPage.enterAmount(driver, testData.getAmount());
			AccountSummaryPage accountSummaryPage = directBillPaymentPage.clickExecuteWithoutDistribution(driver);
			accountSummaryPage.verifyAmountIsPresent(driver,testData.getAmount());
			Log.testCaseResult(driver);
			
		} catch (Exception e) {
			Log.exception(e, DriverManager.getDriver());
		} finally {
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}
	/**
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Verify whether the user is navigated back to Account Summary page when clicking on Cancel button in New Direct Bill payment page.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC77(String browser) throws Exception {
		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("Verify whether the user is navigated back to Account Summary page when clicking on Cancel button in New Direct Bill payment page.",driver);
		BillingCenterDataEngine testData = new BillingCenterDataEngine("BC_GWTestData_DataEngine.xlsx", "NonInterfaceSuite", "TC77");
		
		try {	
			
			BillingCenterStepsImpl bc = BillingCenterSteps.create();
			
			bc.loginIntoTheApplication("su", "gw");
			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clickPolicyIcon(driver);
			headerPage.enterPolicyNumber(driver,testData.getPolicyNumber());
			headerPage.clickSearch(driver);
			headerPage.getAccountNo(driver);
			headerPage.clickAccountNumber(driver);
			ActionsPage actionsPage = new ActionsPage(driver);
			actionsPage.clickAction(driver);
			actionsPage.moveToNewPayments(driver);
			DirectBillPaymentPage directBillPaymentPage = actionsPage.clickNewDirectBillPayment(driver);
			directBillPaymentPage.clickCancel(driver);
			Log.message("After clicking cancel button, returned to Account summary page");
			Log.testCaseResult(driver);

			} catch (Exception e) {
				Log.exception(e, DriverManager.getDriver());
			} finally {
				DriverManager.quitDriver(driver);
				Log.endTestCase();
			}
		}
	/**
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Verify whether the user is navigated back to Account Summary page when clicking on Return to Account Summary button in New Direct Bill payment page.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC238(String browser) throws Exception {
		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("Verify whether the user is navigated back to Account Summary page when clicking on Return to Account Summary button in New Direct Bill payment page.",driver);
		BillingCenterDataEngine testData = new BillingCenterDataEngine("BC_GWTestData_DataEngine.xlsx", "NonInterfaceSuite", "TC238");
		
		try {	
			
			BillingCenterStepsImpl bc = BillingCenterSteps.create();
			
			bc.loginIntoTheApplication("su", "gw");
			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clickPolicyIcon(driver);
			headerPage.enterPolicyNumber(driver,testData.getPolicyNumber());
			headerPage.clickSearch(driver);
			headerPage.getAccountNo(driver);
			headerPage.clickAccountNumber(driver);
			ActionsPage actionsPage = new ActionsPage(driver);
			actionsPage.clickAction(driver);
			actionsPage.moveToNewPayments(driver);
			DirectBillPaymentPage directBillPaymentPage = actionsPage.clickNewDirectBillPayment(driver);
			directBillPaymentPage.clickReturntoAccountSummary(driver);
			Log.message("After clicking Return to Account summary button, returned to Account summary page");
			Log.testCaseResult(driver);

			} catch (Exception e) {
				Log.exception(e, DriverManager.getDriver());
			} finally {
				DriverManager.quitDriver(driver);
				Log.endTestCase();
			}
		}
	/**
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Verify whether the user is able to view all the policies available under the account in New Direct Bill payment page_Unapplied Fund dropdown.`", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC239(String browser) throws Exception {
		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("Verify whether the user is able to view all the policies available under the account in New Direct Bill payment page_Unapplied Fund dropdown.`",driver);
		BillingCenterDataEngine testData = new BillingCenterDataEngine("BC_GWTestData_DataEngine.xlsx", "NonInterfaceSuite", "TC239");
		
		try {	
			
			BillingCenterStepsImpl bc = BillingCenterSteps.create();
			
			bc.loginIntoTheApplication("su", "gw");
			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clickPolicyIcon(driver);
			headerPage.enterPolicyNumber(driver,testData.getPolicyNumber());
			headerPage.clickSearch(driver);
			headerPage.getAccountNo(driver);
			headerPage.clickAccountNumber(driver);
			ActionsPage actionsPage = new ActionsPage(driver);
			actionsPage.clickAction(driver);
			actionsPage.moveToNewPayments(driver);
			DirectBillPaymentPage directBillPaymentPage = actionsPage.clickNewDirectBillPayment(driver);
			directBillPaymentPage.verifyUnappliedFundOptions(driver);
			Log.testCaseResult(driver);

			} catch (Exception e) {
				Log.exception(e, DriverManager.getDriver());
			} finally {
				DriverManager.quitDriver(driver);
				Log.endTestCase();
			}
		}
	/**
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Verify whether the user is able to view all the respective details of Account, Payment Details, Payment section", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC240(String browser) throws Exception {
		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("Verify whether the user is able to view all the respective details of Account, Payment Details, Payment section",driver);
		BillingCenterDataEngine testData = new BillingCenterDataEngine("BC_GWTestData_DataEngine.xlsx", "NonInterfaceSuite", "TC240");
		
		try {	
			
			BillingCenterStepsImpl bc = BillingCenterSteps.create();
			
			bc.loginIntoTheApplication("su", "gw");
			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clickPolicyIcon(driver);
			headerPage.enterPolicyNumber(driver,testData.getPolicyNumber());
			headerPage.clickSearch(driver);
			headerPage.getAccountNo(driver);
			headerPage.clickAccountNumber(driver);
			ActionsPage actionsPage = new ActionsPage(driver);
			actionsPage.clickAction(driver);
			actionsPage.moveToNewPayments(driver);
			DirectBillPaymentPage directBillPaymentPage = actionsPage.clickNewDirectBillPayment(driver);
			directBillPaymentPage.verifyAmount(driver);
			directBillPaymentPage.verifyUnappliedFundOptions(driver);
			directBillPaymentPage.verifyPaymentDetails(driver);
			directBillPaymentPage.verifyPaymentInstrument(driver);
			directBillPaymentPage.verifyDescription(driver);
			Log.testCaseResult(driver);

			} catch (Exception e) {
				Log.exception(e, DriverManager.getDriver());
			} finally {
				DriverManager.quitDriver(driver);
				Log.endTestCase();
			}
		}
	/**
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Verify whether the user is able to view all the respective details of Preview Distribution section", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC241(String browser) throws Exception {
		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("Verify whether the user is able to view all the respective details of Preview Distribution section",driver);
		BillingCenterDataEngine testData = new BillingCenterDataEngine("BC_GWTestData_DataEngine.xlsx", "NonInterfaceSuite", "TC241");
		
		try {	
			
			BillingCenterStepsImpl bc = BillingCenterSteps.create();
			
			bc.loginIntoTheApplication("su", "gw");
			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clickPolicyIcon(driver);
			headerPage.enterPolicyNumber(driver,testData.getPolicyNumber());
			headerPage.clickSearch(driver);
			headerPage.getAccountNo(driver);
			headerPage.clickAccountNumber(driver);
			ActionsPage actionsPage = new ActionsPage(driver);
			actionsPage.clickAction(driver);
			actionsPage.moveToNewPayments(driver);
			DirectBillPaymentPage directBillPaymentPage = actionsPage.clickNewDirectBillPayment(driver);
			directBillPaymentPage.verifyOverrideDistribution(driver);
			directBillPaymentPage.verifyClearButton(driver);
			directBillPaymentPage.verifyGoButton(driver);
			directBillPaymentPage.verifyGroupBy(driver);
			directBillPaymentPage.verifyAggregate(driver);
			directBillPaymentPage.verifySortBy(driver);
			directBillPaymentPage.verifyGoTo(driver);
			directBillPaymentPage.verifyItem(driver);
			directBillPaymentPage.verifyPolicyPeriod(driver);
			directBillPaymentPage.verifyInvoiceBillDate(driver);
			directBillPaymentPage.verifyInvoiceDueDate(driver);
			directBillPaymentPage.verifyInvoiceBillDate(driver);
			directBillPaymentPage.verifyOwner(driver);
			directBillPaymentPage.verifyPayer(driver);
			directBillPaymentPage.verifyAmountInDistribution(driver);
			directBillPaymentPage.verifyUnpaidAmount(driver);
			directBillPaymentPage.verifyAmountToApply(driver);
			Log.testCaseResult(driver);

			} catch (Exception e) {
				Log.exception(e, DriverManager.getDriver());
			} finally {
				DriverManager.quitDriver(driver);
				Log.endTestCase();
			}
		}
	/**
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Verify whether the user is able to create disbursement with the reason \"Cancellation\".", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC87(String browser) throws Exception {
		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("Verify whether the user is able to create disbursement with the reason \"Cancellation\".",driver);
		BillingCenterDataEngine testData = new BillingCenterDataEngine("BC_GWTestData_DataEngine.xlsx", "NonInterfaceSuite", "TC87");
		
		try {	
			
			BillingCenterStepsImpl bc = BillingCenterSteps.create();
			
			bc.loginIntoTheApplication("su", "gw");
			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clickPolicyIcon(driver);
			headerPage.enterPolicyNumber(driver,testData.getPolicyNumberPayment());
			headerPage.clickSearch(driver);
			headerPage.getAccountNo(driver);
			headerPage.clickAccountNumber(driver);
			ActionsPage actionsPage = new ActionsPage(driver);
			actionsPage.clickAction(driver);
			actionsPage.moveToNewTransaction(driver);
			AccountDisbursementWizardPage accountDisbursementWizardPage = actionsPage.clickDisbursements(driver);
			accountDisbursementWizardPage.selectUnappliedFund(driver, testData.getPolicyNumberPayment());
			accountDisbursementWizardPage.enterAmount(driver, testData.getDisbursementAmount());
			accountDisbursementWizardPage.enterPaymentDate(driver, testData.getPaymentDate());
			accountDisbursementWizardPage.selectReason(driver, testData.getDisbursementReason());
			accountDisbursementWizardPage.clickNext(driver);
			AccountDisbursementWizardDetailPage accountDisbursementWizardDetailPage = new AccountDisbursementWizardDetailPage(driver);
			accountDisbursementWizardDetailPage.clickFinish(driver);
			Log.testCaseResult(driver);

			} catch (Exception e) {
				Log.exception(e, DriverManager.getDriver());
			} finally {
				DriverManager.quitDriver(driver);
				Log.endTestCase();
			}
		}
	/**
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Verify whether the user is able to create disbursement with the reason \"Other\".", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC88(String browser) throws Exception {
		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("Verify whether the user is able to create disbursement with the reason \"Other\".",driver);
		BillingCenterDataEngine testData = new BillingCenterDataEngine("BC_GWTestData_DataEngine.xlsx", "NonInterfaceSuite", "TC88");
		
		try {	
			
			BillingCenterStepsImpl bc = BillingCenterSteps.create();
			
			bc.loginIntoTheApplication("su", "gw");
			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clickPolicyIcon(driver);
			headerPage.enterPolicyNumber(driver,testData.getPolicyNumberPayment());
			headerPage.clickSearch(driver);
			headerPage.getAccountNo(driver);
			headerPage.clickAccountNumber(driver);
			ActionsPage actionsPage = new ActionsPage(driver);
			actionsPage.clickAction(driver);
			actionsPage.moveToNewTransaction(driver);
			AccountDisbursementWizardPage accountDisbursementWizardPage = actionsPage.clickDisbursements(driver);
			accountDisbursementWizardPage.selectUnappliedFund(driver, testData.getPolicyNumberPayment());
			accountDisbursementWizardPage.enterAmount(driver, testData.getDisbursementAmount());
			accountDisbursementWizardPage.enterPaymentDate(driver, testData.getPaymentDate());
			accountDisbursementWizardPage.selectReason(driver, testData.getDisbursementReason());
			accountDisbursementWizardPage.clickNext(driver);
			AccountDisbursementWizardDetailPage accountDisbursementWizardDetailPage = new AccountDisbursementWizardDetailPage(driver);
			accountDisbursementWizardDetailPage.clickFinish(driver);
			Log.testCaseResult(driver);

			} catch (Exception e) {
				Log.exception(e, DriverManager.getDriver());
			} finally {
				DriverManager.quitDriver(driver);
				Log.endTestCase();
			}
		}
	/**
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Verify whether the user is able to create disbursement with the reason \"Over Payment\".", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC89(String browser) throws Exception {
		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("Verify whether the user is able to create disbursement with the reason \"Over Payment\".",driver);
		BillingCenterDataEngine testData = new BillingCenterDataEngine("BC_GWTestData_DataEngine.xlsx", "NonInterfaceSuite", "TC89");
		
		try {	
			
			BillingCenterStepsImpl bc = BillingCenterSteps.create();
			
			bc.loginIntoTheApplication("su", "gw");
			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clickPolicyIcon(driver);
			headerPage.enterPolicyNumber(driver,testData.getPolicyNumberPayment());
			headerPage.clickSearch(driver);
			headerPage.getAccountNo(driver);
			headerPage.clickAccountNumber(driver);
			ActionsPage actionsPage = new ActionsPage(driver);
			actionsPage.clickAction(driver);
			actionsPage.moveToNewTransaction(driver);
			AccountDisbursementWizardPage accountDisbursementWizardPage = actionsPage.clickDisbursements(driver);
			accountDisbursementWizardPage.selectUnappliedFund(driver, testData.getPolicyNumberPayment());
			accountDisbursementWizardPage.enterAmount(driver, testData.getDisbursementAmount());
			accountDisbursementWizardPage.enterPaymentDate(driver, testData.getPaymentDate());
			accountDisbursementWizardPage.selectReason(driver, testData.getDisbursementReason());
			accountDisbursementWizardPage.clickNext(driver);
			AccountDisbursementWizardDetailPage accountDisbursementWizardDetailPage = new AccountDisbursementWizardDetailPage(driver);
			accountDisbursementWizardDetailPage.clickFinish(driver);
			Log.testCaseResult(driver);

			} catch (Exception e) {
				Log.exception(e, DriverManager.getDriver());
			} finally {
				DriverManager.quitDriver(driver);
				Log.endTestCase();
			}
		}
	/**
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Verify whether the user is able to create disbursement with the reason \"Return Premium Audit\".", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC90(String browser) throws Exception {
		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("Verify whether the user is able to create disbursement with the reason \"Return Premium Audit\".",driver);
		BillingCenterDataEngine testData = new BillingCenterDataEngine("BC_GWTestData_DataEngine.xlsx", "NonInterfaceSuite", "TC90");
		
		try {	
			
			BillingCenterStepsImpl bc = BillingCenterSteps.create();
			
			bc.loginIntoTheApplication("su", "gw");
			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clickPolicyIcon(driver);
			headerPage.enterPolicyNumber(driver,testData.getPolicyNumberPayment());
			headerPage.clickSearch(driver);
			headerPage.getAccountNo(driver);
			headerPage.clickAccountNumber(driver);
			ActionsPage actionsPage = new ActionsPage(driver);
			actionsPage.clickAction(driver);
			actionsPage.moveToNewTransaction(driver);
			AccountDisbursementWizardPage accountDisbursementWizardPage = actionsPage.clickDisbursements(driver);
			accountDisbursementWizardPage.selectUnappliedFund(driver, testData.getPolicyNumberPayment());
			accountDisbursementWizardPage.enterAmount(driver, testData.getDisbursementAmount());
			accountDisbursementWizardPage.enterPaymentDate(driver, testData.getPaymentDate());
			accountDisbursementWizardPage.selectReason(driver, testData.getDisbursementReason());
			accountDisbursementWizardPage.clickNext(driver);
			AccountDisbursementWizardDetailPage accountDisbursementWizardDetailPage = new AccountDisbursementWizardDetailPage(driver);
			accountDisbursementWizardDetailPage.clickFinish(driver);
			Log.testCaseResult(driver);

			} catch (Exception e) {
				Log.exception(e, DriverManager.getDriver());
			} finally {
				DriverManager.quitDriver(driver);
				Log.endTestCase();
			}
		}
	/**
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Verify whether the user is able to create disbursement with the reason \"Return Premium Policy Change\".", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC91(String browser) throws Exception {
		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("Verify whether the user is able to create disbursement with the reason \"Return Premium Policy Change\".",driver);
		BillingCenterDataEngine testData = new BillingCenterDataEngine("BC_GWTestData_DataEngine.xlsx", "NonInterfaceSuite", "TC91");
		
		try {	
			
			BillingCenterStepsImpl bc = BillingCenterSteps.create();
			
			bc.loginIntoTheApplication("su", "gw");
			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clickPolicyIcon(driver);
			headerPage.enterPolicyNumber(driver,testData.getPolicyNumberPayment());
			headerPage.clickSearch(driver);
			headerPage.getAccountNo(driver);
			headerPage.clickAccountNumber(driver);
			ActionsPage actionsPage = new ActionsPage(driver);
			actionsPage.clickAction(driver);
			actionsPage.moveToNewTransaction(driver);
			AccountDisbursementWizardPage accountDisbursementWizardPage = actionsPage.clickDisbursements(driver);
			accountDisbursementWizardPage.selectUnappliedFund(driver, testData.getPolicyNumberPayment());
			accountDisbursementWizardPage.enterAmount(driver, testData.getDisbursementAmount());
			accountDisbursementWizardPage.enterPaymentDate(driver, testData.getPaymentDate());
			accountDisbursementWizardPage.selectReason(driver, testData.getDisbursementReason());
			accountDisbursementWizardPage.clickNext(driver);
			AccountDisbursementWizardDetailPage accountDisbursementWizardDetailPage = new AccountDisbursementWizardDetailPage(driver);
			accountDisbursementWizardDetailPage.clickFinish(driver);
			Log.testCaseResult(driver);

			} catch (Exception e) {
				Log.exception(e, DriverManager.getDriver());
			} finally {
				DriverManager.quitDriver(driver);
				Log.endTestCase();
			}
		}
	/**
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Verify whether the user is able to create disbursement with the reason \"Wrong Payer\".", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC92(String browser) throws Exception {
		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("Verify whether the user is able to create disbursement with the reason \"Wrong Payer\".",driver);
		BillingCenterDataEngine testData = new BillingCenterDataEngine("BC_GWTestData_DataEngine.xlsx", "NonInterfaceSuite", "TC92");
		
		try {	
			
			BillingCenterStepsImpl bc = BillingCenterSteps.create();
			
			bc.loginIntoTheApplication("su", "gw");
			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clickPolicyIcon(driver);
			headerPage.enterPolicyNumber(driver,testData.getPolicyNumberPayment());
			headerPage.clickSearch(driver);
			headerPage.getAccountNo(driver);
			headerPage.clickAccountNumber(driver);
			ActionsPage actionsPage = new ActionsPage(driver);
			actionsPage.clickAction(driver);
			actionsPage.moveToNewTransaction(driver);
			AccountDisbursementWizardPage accountDisbursementWizardPage = actionsPage.clickDisbursements(driver);
			accountDisbursementWizardPage.selectUnappliedFund(driver, testData.getPolicyNumberPayment());
			accountDisbursementWizardPage.enterAmount(driver, testData.getDisbursementAmount());
			accountDisbursementWizardPage.enterPaymentDate(driver, testData.getPaymentDate());
			accountDisbursementWizardPage.selectReason(driver, testData.getDisbursementReason());
			accountDisbursementWizardPage.clickNext(driver);
			AccountDisbursementWizardDetailPage accountDisbursementWizardDetailPage = new AccountDisbursementWizardDetailPage(driver);
			accountDisbursementWizardDetailPage.clickFinish(driver);
			Log.testCaseResult(driver);

			} catch (Exception e) {
				Log.exception(e, DriverManager.getDriver());
			} finally {
				DriverManager.quitDriver(driver);
				Log.endTestCase();
			}
		}
	/**
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Verify whether the user is navigated back to Account Summary page when clicking on Return to Account Summary button in  Account Disbursement Wizard page.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC93(String browser) throws Exception {
		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("Verify whether the user is navigated back to Account Summary page when clicking on Return to Account Summary button in  Account Disbursement Wizard page.",driver);
		BillingCenterDataEngine testData = new BillingCenterDataEngine("BC_GWTestData_DataEngine.xlsx", "NonInterfaceSuite", "TC93");
		
		try {	
			
			BillingCenterStepsImpl bc = BillingCenterSteps.create();
			
			bc.loginIntoTheApplication("su", "gw");
			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clickPolicyIcon(driver);
			headerPage.enterPolicyNumber(driver,testData.getPolicyNumber());
			headerPage.clickSearch(driver);
			headerPage.getAccountNo(driver);
			headerPage.clickAccountNumber(driver);
			ActionsPage actionsPage = new ActionsPage(driver);
			actionsPage.clickAction(driver);
			actionsPage.moveToNewTransaction(driver);
			AccountDisbursementWizardPage accountDisbursementWizardPage = actionsPage.clickDisbursements(driver);
			accountDisbursementWizardPage.clickReturntoAccountSummary(driver);
			Log.message("Returned to account summary page");
			Log.testCaseResult(driver);

			} catch (Exception e) {
				Log.exception(e, DriverManager.getDriver());
			} finally {
				DriverManager.quitDriver(driver);
				Log.endTestCase();
			}
		}
	/**
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Verify whether the user is navigated back to Account Summary page when clicking on Cancel button in  Account Disbursement Wizard page.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC94(String browser) throws Exception {
		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("Verify whether the user is navigated back to Account Summary page when clicking on Cancel button in  Account Disbursement Wizard page.",driver);
		BillingCenterDataEngine testData = new BillingCenterDataEngine("BC_GWTestData_DataEngine.xlsx", "NonInterfaceSuite", "TC94");
		
		try {	
			
			BillingCenterStepsImpl bc = BillingCenterSteps.create();
			
			bc.loginIntoTheApplication("su", "gw");
			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clickPolicyIcon(driver);
			headerPage.enterPolicyNumber(driver,testData.getPolicyNumber());
			headerPage.clickSearch(driver);
			headerPage.getAccountNo(driver);
			headerPage.clickAccountNumber(driver);
			ActionsPage actionsPage = new ActionsPage(driver);
			actionsPage.clickAction(driver);
			actionsPage.moveToNewTransaction(driver);
			AccountDisbursementWizardPage accountDisbursementWizardPage = actionsPage.clickDisbursements(driver);
			accountDisbursementWizardPage.clickCancel(driver);
			Log.message("Returned to account summary page");
			Log.testCaseResult(driver);

			} catch (Exception e) {
				Log.exception(e, DriverManager.getDriver());
			} finally {
				DriverManager.quitDriver(driver);
				Log.endTestCase();
			}
		}
	/**
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify whether able to create Trouble Ticket in a policy by selecting type as \"Processing Error\"", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC95(String browser) throws Exception {
		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify whether able to create Trouble Ticket in a policy by selecting type as \"Processing Error\"",driver);
		BillingCenterDataEngine testData = new BillingCenterDataEngine("BC_GWTestData_DataEngine.xlsx", "NonInterfaceSuite", "TC95");
		try {	
			
			BillingCenterStepsImpl bc = BillingCenterSteps.create();
			
			bc.loginIntoTheApplication("su", "gw");
			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clickPolicyIcon(driver);
			headerPage.enterPolicyNumber(driver,testData.getPolicyNumber());
			headerPage.clickSearch(driver);
			TroubleTicketsPage troubleTicketsPage = headerPage.clickTroubleTickets(driver);
			TroubleTicketWizardPage troubleTicketWizardPage = troubleTicketsPage.clickNew(driver);
			troubleTicketWizardPage.selectType(driver, testData.getTroubleTicketType());
			troubleTicketWizardPage.enterSubject(driver, testData.getTroubleTicketSubject());
			troubleTicketWizardPage.enterDetails(driver, testData.getTroubleTicketDetails());
			troubleTicketWizardPage.selectPriority(driver, testData.getTroubleTicketPriority());
			troubleTicketWizardPage.clickNext(driver);
			troubleTicketWizardPage.clickNext(driver);
			troubleTicketWizardPage.clickNext(driver);
			troubleTicketWizardPage.clickNext(driver);
			troubleTicketWizardPage.selectAssignedTo(driver, testData.getTroubleTicketAssignedTo());
			troubleTicketWizardPage.clickFinish(driver);
			troubleTicketsPage.verifyTicketEntry(driver,testData.getTroubleTicketSubject());
			Log.testCaseResult(driver);

			} catch (Exception e) {
				Log.exception(e, DriverManager.getDriver());
			} finally {
				DriverManager.quitDriver(driver);
				Log.endTestCase();
			}
		}
	/**
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify whether able to create Trouble Ticket in a policy by selecting type as \"Dispute\"", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC96(String browser) throws Exception {
		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify whether able to create Trouble Ticket in a policy by selecting type as \"Dispute\"",driver);
		BillingCenterDataEngine testData = new BillingCenterDataEngine("BC_GWTestData_DataEngine.xlsx", "NonInterfaceSuite", "TC96");
		try {	
			
			BillingCenterStepsImpl bc = BillingCenterSteps.create();
			
			bc.loginIntoTheApplication("su", "gw");
			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clickPolicyIcon(driver);
			headerPage.enterPolicyNumber(driver,testData.getPolicyNumber());
			headerPage.clickSearch(driver);
			TroubleTicketsPage troubleTicketsPage = headerPage.clickTroubleTickets(driver);
			TroubleTicketWizardPage troubleTicketWizardPage = troubleTicketsPage.clickNew(driver);
			troubleTicketWizardPage.selectType(driver, testData.getTroubleTicketType());
			troubleTicketWizardPage.enterSubject(driver, testData.getTroubleTicketSubject());
			troubleTicketWizardPage.enterDetails(driver, testData.getTroubleTicketDetails());
			troubleTicketWizardPage.selectPriority(driver, testData.getTroubleTicketPriority());
			troubleTicketWizardPage.clickNext(driver);
			troubleTicketWizardPage.clickNext(driver);
			troubleTicketWizardPage.clickNext(driver);
			troubleTicketWizardPage.clickNext(driver);
			troubleTicketWizardPage.selectAssignedTo(driver, testData.getTroubleTicketAssignedTo());
			troubleTicketWizardPage.clickFinish(driver);
			troubleTicketsPage.verifyTicketEntry(driver, testData.getTroubleTicketSubject());
			Log.testCaseResult(driver);

			} catch (Exception e) {
				Log.exception(e, DriverManager.getDriver());
			} finally {
				DriverManager.quitDriver(driver);
				Log.endTestCase();
			}
		}
	/**
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify whether able to create Trouble Ticket in a policy by selecting type as \"Customer Complaint\"", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC97(String browser) throws Exception {
		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify whether able to create Trouble Ticket in a policy by selecting type as \"Customer Complaint\"",driver);
		BillingCenterDataEngine testData = new BillingCenterDataEngine("BC_GWTestData_DataEngine.xlsx", "NonInterfaceSuite", "TC97");
		try {	
			
			BillingCenterStepsImpl bc = BillingCenterSteps.create();
			
			bc.loginIntoTheApplication("su", "gw");
			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clickPolicyIcon(driver);
			headerPage.enterPolicyNumber(driver,testData.getPolicyNumber());
			headerPage.clickSearch(driver);
			TroubleTicketsPage troubleTicketsPage = headerPage.clickTroubleTickets(driver);
			TroubleTicketWizardPage troubleTicketWizardPage = troubleTicketsPage.clickNew(driver);
			troubleTicketWizardPage.selectType(driver, testData.getTroubleTicketType());
			troubleTicketWizardPage.enterSubject(driver,  testData.getTroubleTicketSubject());
			troubleTicketWizardPage.enterDetails(driver, testData.getTroubleTicketDetails());
			troubleTicketWizardPage.selectPriority(driver, testData.getTroubleTicketPriority());
			troubleTicketWizardPage.clickNext(driver);
			troubleTicketWizardPage.clickNext(driver);
			troubleTicketWizardPage.clickNext(driver);
			troubleTicketWizardPage.clickNext(driver);
			troubleTicketWizardPage.selectAssignedTo(driver, testData.getTroubleTicketAssignedTo());
			troubleTicketWizardPage.clickFinish(driver);
			troubleTicketsPage.verifyTicketEntry(driver, testData.getTroubleTicketSubject());
			Log.testCaseResult(driver);

			} catch (Exception e) {
				Log.exception(e, DriverManager.getDriver());
			} finally {
				DriverManager.quitDriver(driver);
				Log.endTestCase();
			}
		}
	/**
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify whether able to create Trouble Ticket in a policy by selecting type as \"Customer Question\"", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC98(String browser) throws Exception {
		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify whether able to create Trouble Ticket in a policy by selecting type as \"Customer Question\"",driver);
		BillingCenterDataEngine testData = new BillingCenterDataEngine("BC_GWTestData_DataEngine.xlsx", "NonInterfaceSuite", "TC98");
		try {	
			
			BillingCenterStepsImpl bc = BillingCenterSteps.create();
			
			bc.loginIntoTheApplication("su", "gw");
			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clickPolicyIcon(driver);
			headerPage.enterPolicyNumber(driver,testData.getPolicyNumber());
			headerPage.clickSearch(driver);
			TroubleTicketsPage troubleTicketsPage = headerPage.clickTroubleTickets(driver);
			TroubleTicketWizardPage troubleTicketWizardPage = troubleTicketsPage.clickNew(driver);
			troubleTicketWizardPage.selectType(driver, testData.getTroubleTicketType());
			troubleTicketWizardPage.enterSubject(driver,  testData.getTroubleTicketSubject());
			troubleTicketWizardPage.enterDetails(driver, testData.getTroubleTicketDetails());
			troubleTicketWizardPage.selectPriority(driver, testData.getTroubleTicketPriority());
			troubleTicketWizardPage.clickNext(driver);
			troubleTicketWizardPage.clickNext(driver);
			troubleTicketWizardPage.clickNext(driver);
			troubleTicketWizardPage.clickNext(driver);
			troubleTicketWizardPage.selectAssignedTo(driver, testData.getTroubleTicketAssignedTo());
			troubleTicketWizardPage.clickFinish(driver);
			troubleTicketsPage.verifyTicketEntry(driver, testData.getTroubleTicketSubject());
			Log.testCaseResult(driver);

			} catch (Exception e) {
				Log.exception(e, DriverManager.getDriver());
			} finally {
				DriverManager.quitDriver(driver);
				Log.endTestCase();
			}
		}
	/**
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify whether able to create Trouble Ticket in a policy by selecting type as \"Report Error\"", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC99(String browser) throws Exception {
		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify whether able to create Trouble Ticket in a policy by selecting type as \"Report Error\"",driver);
		BillingCenterDataEngine testData = new BillingCenterDataEngine("BC_GWTestData_DataEngine.xlsx", "NonInterfaceSuite", "TC99");
		try {	
			
			BillingCenterStepsImpl bc = BillingCenterSteps.create();
			
			bc.loginIntoTheApplication("su", "gw");
			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clickPolicyIcon(driver);
			headerPage.enterPolicyNumber(driver,testData.getPolicyNumber());
			headerPage.clickSearch(driver);
			TroubleTicketsPage troubleTicketsPage = headerPage.clickTroubleTickets(driver);
			TroubleTicketWizardPage troubleTicketWizardPage = troubleTicketsPage.clickNew(driver);
			troubleTicketWizardPage.selectType(driver, testData.getTroubleTicketType());
			troubleTicketWizardPage.enterSubject(driver,  testData.getTroubleTicketSubject());
			troubleTicketWizardPage.enterDetails(driver, testData.getTroubleTicketDetails());
			troubleTicketWizardPage.selectPriority(driver, testData.getTroubleTicketPriority());
			troubleTicketWizardPage.clickNext(driver);
			troubleTicketWizardPage.clickNext(driver);
			troubleTicketWizardPage.clickNext(driver);
			troubleTicketWizardPage.clickNext(driver);
			troubleTicketWizardPage.selectAssignedTo(driver, testData.getTroubleTicketAssignedTo());
			troubleTicketWizardPage.clickFinish(driver);
			troubleTicketsPage.verifyTicketEntry(driver, testData.getTroubleTicketSubject());
			Log.testCaseResult(driver);

			} catch (Exception e) {
				Log.exception(e, DriverManager.getDriver());
			} finally {
				DriverManager.quitDriver(driver);
				Log.endTestCase();
			}
		}
	/**
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify whether able to create Trouble Ticket in a policy by selecting type as \"Disaster Hold\"", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC100(String browser) throws Exception {
		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify whether able to create Trouble Ticket in a policy by selecting type as \"Disaster Hold\"",driver);
		BillingCenterDataEngine testData = new BillingCenterDataEngine("BC_GWTestData_DataEngine.xlsx", "NonInterfaceSuite", "TC100");
		try {	
			
			BillingCenterStepsImpl bc = BillingCenterSteps.create();
			
			bc.loginIntoTheApplication("su", "gw");
			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clickPolicyIcon(driver);
			headerPage.enterPolicyNumber(driver,testData.getPolicyNumber());
			headerPage.clickSearch(driver);
			TroubleTicketsPage troubleTicketsPage = headerPage.clickTroubleTickets(driver);
			TroubleTicketWizardPage troubleTicketWizardPage = troubleTicketsPage.clickNew(driver);
			troubleTicketWizardPage.selectType(driver, testData.getTroubleTicketType());
			troubleTicketWizardPage.enterSubject(driver,  testData.getTroubleTicketSubject());
			troubleTicketWizardPage.enterDetails(driver, testData.getTroubleTicketDetails());
			troubleTicketWizardPage.selectPriority(driver, testData.getTroubleTicketPriority());
			troubleTicketWizardPage.clickNext(driver);
			troubleTicketWizardPage.clickNext(driver);
			troubleTicketWizardPage.clickNext(driver);
			troubleTicketWizardPage.clickNext(driver);
			troubleTicketWizardPage.selectAssignedTo(driver, testData.getTroubleTicketAssignedTo());
			troubleTicketWizardPage.clickFinish(driver);
			troubleTicketsPage.verifyTicketEntry(driver, testData.getTroubleTicketSubject());
			Log.testCaseResult(driver);

			} catch (Exception e) {
				Log.exception(e, DriverManager.getDriver());
			} finally {
				DriverManager.quitDriver(driver);
				Log.endTestCase();
			}
		}
	/**
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Verify whether the user is navigated back to Trouble Tickets page when clicking on Return to Trouble tickets button in  Trouble Ticket Creation page.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC101(String browser) throws Exception {
		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("Verify whether the user is navigated back to Trouble Tickets page when clicking on Return to Trouble tickets button in  Trouble Ticket Creation page.",driver);
		BillingCenterDataEngine testData = new BillingCenterDataEngine("BC_GWTestData_DataEngine.xlsx", "NonInterfaceSuite", "TC101");
		try {	
			
			BillingCenterStepsImpl bc = BillingCenterSteps.create();
			
			bc.loginIntoTheApplication("su", "gw");
			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clickPolicyIcon(driver);
			headerPage.enterPolicyNumber(driver,testData.getPolicyNumber());
			headerPage.clickSearch(driver);
			TroubleTicketsPage troubleTicketsPage = headerPage.clickTroubleTickets(driver);
			TroubleTicketWizardPage troubleTicketWizardPage = troubleTicketsPage.clickNew(driver);
			troubleTicketWizardPage.clickReturntoTroubleTickets(driver);
			Log.message("Returned to Trouble tickets page");
			Log.testCaseResult(driver);

			} catch (Exception e) {
				Log.exception(e, DriverManager.getDriver());
			} finally {
				DriverManager.quitDriver(driver);
				Log.endTestCase();
			}
		}
	/**
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Verify whether the user is navigated back to Trouble Tickets page when clicking on Cancel button in  Trouble Ticket Creation page.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC102(String browser) throws Exception {
		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("Verify whether the user is navigated back to Trouble Tickets page when clicking on Cancel button in  Trouble Ticket Creation page.",driver);
		BillingCenterDataEngine testData = new BillingCenterDataEngine("BC_GWTestData_DataEngine.xlsx", "NonInterfaceSuite", "TC102");
		try {	
			
			BillingCenterStepsImpl bc = BillingCenterSteps.create();
			
			bc.loginIntoTheApplication("su", "gw");
			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clickPolicyIcon(driver);
			headerPage.enterPolicyNumber(driver,testData.getPolicyNumber());
			headerPage.clickSearch(driver);
			TroubleTicketsPage troubleTicketsPage = headerPage.clickTroubleTickets(driver);
			TroubleTicketWizardPage troubleTicketWizardPage = troubleTicketsPage.clickNew(driver);
			troubleTicketWizardPage.clickReturntoTroubleTickets(driver);
			Log.message("Returned to Trouble tickets page", driver);
			Log.testCaseResult(driver);

			} catch (Exception e) {
				Log.exception(e, DriverManager.getDriver());
			} finally {
				DriverManager.quitDriver(driver);
				Log.endTestCase();
			}
		}
	/**
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To Verify Whether able to do Credit the Amount in Policy with the reason Goodwill.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC103(String browser) throws Exception {
		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To Verify Whether able to do Credit the Amount in Policy with the reason Goodwill.",driver);
		BillingCenterDataEngine testData = new BillingCenterDataEngine("BC_GWTestData_DataEngine.xlsx", "NonInterfaceSuite", "TC103");
		String amount = testData.getAmount();
		try {	
			
			BillingCenterStepsImpl bc = BillingCenterSteps.create();
			
			bc.loginIntoTheApplication("su", "gw");
			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clickPolicyIcon(driver);
			headerPage.enterPolicyNumber(driver,testData.getPolicyNumber());
			headerPage.clickSearch(driver);
			headerPage.getAccountNo(driver);
			AccountSummaryPage accountSummaryPage = headerPage.clickAccountNumber(driver);
			ActionsPage actionsPage = new ActionsPage(driver);
			actionsPage.clickAction(driver);
			actionsPage.moveToNewPayments(driver);
			DirectBillPaymentPage directBillPaymentPage = actionsPage.clickNewDirectBillPayment(driver);
			directBillPaymentPage.selectUnappliedFund(driver, testData.getUnappliedFund());
			directBillPaymentPage.selectPaymentInstrument(driver, testData.getPaymentInstrument());
			directBillPaymentPage.enterAmount(driver, amount);
			directBillPaymentPage.clickExecuteWithoutDistribution(driver);
			int getunappliedAmount = accountSummaryPage.getUnappliedAmt(driver);
			actionsPage.clickAction(driver);
			actionsPage.moveToNewTransaction(driver);
			CreditWizardPage creditWizardPage = headerPage.clickCredit(driver);
			creditWizardPage.selectUnappliedFund(driver, testData.getUnappliedFund());
			creditWizardPage.selectCreditType(driver, testData.getCreditType());
			creditWizardPage.enterAmount(driver,amount);
			creditWizardPage.clickNext(driver);
			creditWizardPage.clickFinish(driver);
			int getunappliedAmountAfterCredit = accountSummaryPage.getUnappliedAmt(driver);
			accountSummaryPage.verifyAmountValue(driver, getunappliedAmountAfterCredit, getunappliedAmount, amount);
			Log.testCaseResult(driver);

			} catch (Exception e) {
				Log.exception(e, DriverManager.getDriver());
			} finally {
				DriverManager.quitDriver(driver);
				Log.endTestCase();
			}
		}
	/**
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To Verify Whether able to do Credit the Amount in Policy with the reason Interest.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC104(String browser) throws Exception {
		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To Verify Whether able to do Credit the Amount in Policy with the reason Interest.",driver);
		BillingCenterDataEngine testData = new BillingCenterDataEngine("BC_GWTestData_DataEngine.xlsx", "NonInterfaceSuite", "TC104");
		String amount = testData.getAmount();
		try {	
			
			BillingCenterStepsImpl bc = BillingCenterSteps.create();
			
			bc.loginIntoTheApplication("su", "gw");
			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clickPolicyIcon(driver);
			headerPage.enterPolicyNumber(driver,testData.getPolicyNumber());
			headerPage.clickSearch(driver);
		    headerPage.getAccountNo(driver);
			AccountSummaryPage accountSummaryPage = headerPage.clickAccountNumber(driver);
			ActionsPage actionsPage = new ActionsPage(driver);
			actionsPage.clickAction(driver);
			actionsPage.moveToNewPayments(driver);
			DirectBillPaymentPage directBillPaymentPage = actionsPage.clickNewDirectBillPayment(driver);
			directBillPaymentPage.selectUnappliedFund(driver, testData.getUnappliedFund());
			directBillPaymentPage.selectPaymentInstrument(driver, testData.getPaymentInstrument());
			directBillPaymentPage.enterAmount(driver, amount);
			directBillPaymentPage.clickExecuteWithoutDistribution(driver);
			int getunappliedAmount = accountSummaryPage.getUnappliedAmt(driver);
			actionsPage.clickAction(driver);
			actionsPage.moveToNewTransaction(driver);
			CreditWizardPage creditWizardPage = headerPage.clickCredit(driver);
			creditWizardPage.selectUnappliedFund(driver, testData.getUnappliedFund());
			creditWizardPage.selectCreditType(driver, testData.getCreditType());
			creditWizardPage.enterAmount(driver,amount);
			creditWizardPage.clickNext(driver);
			creditWizardPage.clickFinish(driver);
			int getunappliedAmountAfterCredit = accountSummaryPage.getUnappliedAmt(driver);
			accountSummaryPage.verifyAmountValue(driver, getunappliedAmountAfterCredit, getunappliedAmount, amount);
			Log.testCaseResult(driver);

			} catch (Exception e) {
				Log.exception(e, DriverManager.getDriver());
			} finally {
				DriverManager.quitDriver(driver);
				Log.endTestCase();
			}
		}
	/**
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To Verify Whether able to do Credit the Amount in Policy with the reason Other.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC105(String browser) throws Exception {
		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To Verify Whether able to do Credit the Amount in Policy with the reason Other.",driver);
		BillingCenterDataEngine testData = new BillingCenterDataEngine("BC_GWTestData_DataEngine.xlsx", "NonInterfaceSuite", "TC105");
		String amount = testData.getAmount();
		try {	
			
			BillingCenterStepsImpl bc = BillingCenterSteps.create();
			
			bc.loginIntoTheApplication("su", "gw");
			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clickPolicyIcon(driver);
			headerPage.enterPolicyNumber(driver,testData.getPolicyNumber());
			headerPage.clickSearch(driver);
			headerPage.getAccountNo(driver);
			AccountSummaryPage accountSummaryPage = headerPage.clickAccountNumber(driver);
			ActionsPage actionsPage = new ActionsPage(driver);
			actionsPage.clickAction(driver);
			actionsPage.moveToNewPayments(driver);
			DirectBillPaymentPage directBillPaymentPage = actionsPage.clickNewDirectBillPayment(driver);
			directBillPaymentPage.selectUnappliedFund(driver, testData.getUnappliedFund());
			directBillPaymentPage.selectPaymentInstrument(driver, testData.getPaymentInstrument());
			directBillPaymentPage.enterAmount(driver, amount);
			directBillPaymentPage.clickExecuteWithoutDistribution(driver);
			int getunappliedAmount = accountSummaryPage.getUnappliedAmt(driver);
			
			actionsPage.clickAction(driver);
			actionsPage.moveToNewTransaction(driver);
			CreditWizardPage creditWizardPage = headerPage.clickCredit(driver);
			creditWizardPage.selectUnappliedFund(driver, testData.getUnappliedFund());
			creditWizardPage.selectCreditType(driver, testData.getCreditType());
			creditWizardPage.enterAmount(driver,amount);
			creditWizardPage.clickNext(driver);
			creditWizardPage.clickFinish(driver);
			int getunappliedAmountAfterCredit = accountSummaryPage.getUnappliedAmt(driver);
			accountSummaryPage.verifyAmountValue(driver, getunappliedAmountAfterCredit, getunappliedAmount, amount);			
			Log.testCaseResult(driver);

			} catch (Exception e) {
				Log.exception(e, DriverManager.getDriver());
			} finally {
				DriverManager.quitDriver(driver);
				Log.endTestCase();
			}
		}
	/**
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To Verify Whether able to do Credit Reversal Transaction for the reason collection", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC106(String browser) throws Exception {
		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To Verify Whether able to do Credit Reversal Transaction for the reason collection",driver);
		BillingCenterDataEngine testData = new BillingCenterDataEngine("BC_GWTestData_DataEngine.xlsx", "NonInterfaceSuite", "TC106");
		String amount = testData.getAmount();
		try {	
			
			BillingCenterStepsImpl bc = BillingCenterSteps.create();
			
			bc.loginIntoTheApplication("su", "gw");
			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clickPolicyIcon(driver);
			headerPage.enterPolicyNumber(driver,testData.getPolicyNumberPayment());
			headerPage.clickSearch(driver);
			headerPage.getAccountNo(driver);
			AccountSummaryPage accountSummaryPage = headerPage.clickAccountNumber(driver);
			ActionsPage actionsPage = new ActionsPage(driver);
			actionsPage.clickAction(driver);
			actionsPage.moveToNewPayments(driver);
			DirectBillPaymentPage directBillPaymentPage = actionsPage.clickNewDirectBillPayment(driver);
			directBillPaymentPage.selectUnappliedFund(driver, testData.getUnappliedFund());
			directBillPaymentPage.selectPaymentInstrument(driver, testData.getPaymentInstrument());
			directBillPaymentPage.enterAmount(driver, amount);
			directBillPaymentPage.clickExecuteWithoutDistribution(driver);
			actionsPage.clickAction(driver);
			actionsPage.moveToNewTransaction(driver);
			CreditWizardPage creditWizardPage = headerPage.clickCredit(driver);
			creditWizardPage.selectUnappliedFund(driver, testData.getPolicyNumberPayment());
			creditWizardPage.selectCreditType(driver, testData.getCreditType());
			creditWizardPage.enterAmount(driver,amount);
			creditWizardPage.clickNext(driver);
			creditWizardPage.clickFinish(driver);
			int unappliedAmt = accountSummaryPage.getUnappliedAmt(driver);
			actionsPage.clickAction(driver);
			actionsPage.moveToNewTransaction(driver);
			CreditReversalWizardPage creditReversalWizardPage = headerPage.clickCreditReversal(driver);
			creditReversalWizardPage.selectReason(driver, testData.getCreditType());
			creditReversalWizardPage.clickSearch(driver);
			creditReversalWizardPage.clickSelect(driver);
			creditReversalWizardPage.clickFinish(driver);
			int unappliedAmt2 = accountSummaryPage.getUnappliedAmt(driver);
			accountSummaryPage.verifyReversalAmount(driver,unappliedAmt2,unappliedAmt, amount);
			Log.testCaseResult(driver);

			} catch (Exception e) {
				Log.exception(e, DriverManager.getDriver());
			} finally {
				DriverManager.quitDriver(driver);
				Log.endTestCase();
			}
		}
	/**
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To Verify Whether able to do Credit Reversal Transaction for the reason Goodwill", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC107(String browser) throws Exception {
		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To Verify Whether able to do Credit Reversal Transaction for the reason Goodwill",driver);
		BillingCenterDataEngine testData = new BillingCenterDataEngine("BC_GWTestData_DataEngine.xlsx", "NonInterfaceSuite", "TC107");
		String amount = testData.getAmount();
		try {	
			
			BillingCenterStepsImpl bc = BillingCenterSteps.create();
			
			bc.loginIntoTheApplication("su", "gw");
			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clickPolicyIcon(driver);
			headerPage.enterPolicyNumber(driver,testData.getPolicyNumberPayment());
			headerPage.clickSearch(driver);
			headerPage.getAccountNo(driver);
			AccountSummaryPage accountSummaryPage = headerPage.clickAccountNumber(driver);
			ActionsPage actionsPage = new ActionsPage(driver);
			actionsPage.clickAction(driver);
			actionsPage.moveToNewPayments(driver);
			DirectBillPaymentPage directBillPaymentPage = actionsPage.clickNewDirectBillPayment(driver);
			directBillPaymentPage.selectUnappliedFund(driver, testData.getUnappliedFund());
			directBillPaymentPage.selectPaymentInstrument(driver, testData.getPaymentInstrument());
			directBillPaymentPage.enterAmount(driver, amount);
			directBillPaymentPage.clickExecuteWithoutDistribution(driver);
			actionsPage.clickAction(driver);
			actionsPage.moveToNewTransaction(driver);
			CreditWizardPage creditWizardPage = headerPage.clickCredit(driver);
			creditWizardPage.selectUnappliedFund(driver, testData.getPolicyNumberPayment());
			creditWizardPage.selectCreditType(driver, testData.getCreditType());
			creditWizardPage.enterAmount(driver,amount);
			creditWizardPage.clickNext(driver);
			creditWizardPage.clickFinish(driver);
			int unappliedAmt = accountSummaryPage.getUnappliedAmt(driver);
			actionsPage.clickAction(driver);
			actionsPage.moveToNewTransaction(driver);
			CreditReversalWizardPage creditReversalWizardPage = headerPage.clickCreditReversal(driver);
			creditReversalWizardPage.selectReason(driver, testData.getCreditType());
			creditReversalWizardPage.clickSearch(driver);
			creditReversalWizardPage.clickSelect(driver);
			creditReversalWizardPage.clickFinish(driver);
			int unappliedAmt2 = accountSummaryPage.getUnappliedAmt(driver);
			accountSummaryPage.verifyReversalAmount(driver,unappliedAmt2,unappliedAmt, amount);
			Log.testCaseResult(driver);

			} catch (Exception e) {
				Log.exception(e, DriverManager.getDriver());
			} finally {
				DriverManager.quitDriver(driver);
				Log.endTestCase();
			}
		}
	/**
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To Verify Whether able to do Credit Reversal Transaction for the reason Interest", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC108(String browser) throws Exception {
		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To Verify Whether able to do Credit Reversal Transaction for the reason Interest",driver);
		BillingCenterDataEngine testData = new BillingCenterDataEngine("BC_GWTestData_DataEngine.xlsx", "NonInterfaceSuite", "TC108");
		String amount = testData.getAmount();
		try {	
			
			BillingCenterStepsImpl bc = BillingCenterSteps.create();
			
			bc.loginIntoTheApplication("su", "gw");
			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clickPolicyIcon(driver);
			headerPage.enterPolicyNumber(driver,testData.getPolicyNumberPayment());
			headerPage.clickSearch(driver);
			headerPage.getAccountNo(driver);
			AccountSummaryPage accountSummaryPage = headerPage.clickAccountNumber(driver);
			ActionsPage actionsPage = new ActionsPage(driver);
			actionsPage.clickAction(driver);
			actionsPage.moveToNewPayments(driver);
			DirectBillPaymentPage directBillPaymentPage = actionsPage.clickNewDirectBillPayment(driver);
			directBillPaymentPage.selectUnappliedFund(driver, testData.getUnappliedFund());
			directBillPaymentPage.selectPaymentInstrument(driver, testData.getPaymentInstrument());
			directBillPaymentPage.enterAmount(driver, amount);
			directBillPaymentPage.clickExecuteWithoutDistribution(driver);
			actionsPage.clickAction(driver);
			actionsPage.moveToNewTransaction(driver);
			CreditWizardPage creditWizardPage = headerPage.clickCredit(driver);
			creditWizardPage.selectUnappliedFund(driver, testData.getPolicyNumberPayment());
			creditWizardPage.selectCreditType(driver, testData.getCreditType());
			creditWizardPage.enterAmount(driver,amount);
			creditWizardPage.clickNext(driver);
			creditWizardPage.clickFinish(driver);
			int unappliedAmt = accountSummaryPage.getUnappliedAmt(driver);
			actionsPage.clickAction(driver);
			actionsPage.moveToNewTransaction(driver);
			CreditReversalWizardPage creditReversalWizardPage = headerPage.clickCreditReversal(driver);
			creditReversalWizardPage.selectReason(driver, testData.getCreditType());
			creditReversalWizardPage.clickSearch(driver);
			creditReversalWizardPage.clickSelect(driver);
			creditReversalWizardPage.clickFinish(driver);
			int unappliedAmt2 = accountSummaryPage.getUnappliedAmt(driver);
			accountSummaryPage.verifyReversalAmount(driver,unappliedAmt2,unappliedAmt, amount);
			Log.testCaseResult(driver);

			} catch (Exception e) {
				Log.exception(e, DriverManager.getDriver());
			} finally {
				DriverManager.quitDriver(driver);
				Log.endTestCase();
			}
		}
	/**
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To Verify Whether able to do Credit Reversal Transaction for the reason Other", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC109(String browser) throws Exception {
		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To Verify Whether able to do Credit Reversal Transaction for the reason Other",driver);
		BillingCenterDataEngine testData = new BillingCenterDataEngine("BC_GWTestData_DataEngine.xlsx", "NonInterfaceSuite", "TC109");
		String amount = testData.getAmount();
		try {	
			
			BillingCenterStepsImpl bc = BillingCenterSteps.create();
			
			bc.loginIntoTheApplication("su", "gw");
			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clickPolicyIcon(driver);
			headerPage.enterPolicyNumber(driver,testData.getPolicyNumberPayment());
			headerPage.clickSearch(driver);
			headerPage.getAccountNo(driver);
			AccountSummaryPage accountSummaryPage = headerPage.clickAccountNumber(driver);
			ActionsPage actionsPage = new ActionsPage(driver);
			actionsPage.clickAction(driver);
			actionsPage.moveToNewPayments(driver);
			DirectBillPaymentPage directBillPaymentPage = actionsPage.clickNewDirectBillPayment(driver);
			directBillPaymentPage.selectUnappliedFund(driver, testData.getUnappliedFund());
			directBillPaymentPage.selectPaymentInstrument(driver, testData.getPaymentInstrument());
			directBillPaymentPage.enterAmount(driver, amount);
			directBillPaymentPage.clickExecuteWithoutDistribution(driver);
			actionsPage.clickAction(driver);
			actionsPage.moveToNewTransaction(driver);
			CreditWizardPage creditWizardPage = headerPage.clickCredit(driver);
			creditWizardPage.selectUnappliedFund(driver, testData.getPolicyNumberPayment());
			creditWizardPage.selectCreditType(driver, testData.getCreditType());
			creditWizardPage.enterAmount(driver,amount);
			creditWizardPage.clickNext(driver);
			creditWizardPage.clickFinish(driver);
			int unappliedAmt = accountSummaryPage.getUnappliedAmt(driver);
			actionsPage.clickAction(driver);
			actionsPage.moveToNewTransaction(driver);
			CreditReversalWizardPage creditReversalWizardPage = headerPage.clickCreditReversal(driver);
			creditReversalWizardPage.selectReason(driver, testData.getCreditType());
			creditReversalWizardPage.clickSearch(driver);
			creditReversalWizardPage.clickSelect(driver);
			creditReversalWizardPage.clickFinish(driver);
			int unappliedAmt2 = accountSummaryPage.getUnappliedAmt(driver);
			accountSummaryPage.verifyReversalAmount(driver,unappliedAmt2,unappliedAmt, amount);
			Log.testCaseResult(driver);

			} catch (Exception e) {
				Log.exception(e, DriverManager.getDriver());
			} finally {
				DriverManager.quitDriver(driver);
				Log.endTestCase();
			}
		}
	/**
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To Verify whether able to Execute the Write-off  on the Policy with the reason Commission Remainder", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC110(String browser) throws Exception {
		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To Verify whether able to Execute the Write-off  on the Policy with the reason Commission Remainder",driver);
		BillingCenterDataEngine testData = new BillingCenterDataEngine("BC_GWTestData_DataEngine.xlsx", "NonInterfaceSuite", "TC110");
		String amount = testData.getAmount();
		try {	
			
			BillingCenterStepsImpl bc = BillingCenterSteps.create();
			
			bc.loginIntoTheApplication("su", "gw");
			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clickPolicyIcon(driver);
			headerPage.enterPolicyNumber(driver,testData.getPolicyNumber());
			headerPage.clickSearch(driver);
			headerPage.getAccountNo(driver);
			AccountSummaryPage accountSummaryPage = headerPage.clickAccountNumber(driver);
			int writtenOffAmountValue = accountSummaryPage.getActualWriteOff(driver);
			ActionsPage actionsPage = new ActionsPage(driver);
			actionsPage.clickAction(driver);
			actionsPage.moveToNewTransaction(driver);
			WriteOffWizardPage writeOffWizardPage = headerPage.clickWriteOff(driver);
			writeOffWizardPage.clickSelect(driver);
			writeOffWizardPage.clickNext(driver);
			writeOffWizardPage.selectChargePattern(driver,testData.getChargePattern());
			writeOffWizardPage.clickAllCheckbox(driver);
			writeOffWizardPage.selectReason(driver, testData.getWriteOffReason());
			writeOffWizardPage.enterAmount(driver, amount);
			writeOffWizardPage.clickNext(driver);
			writeOffWizardPage.clickFinish(driver);		
			int writtenOffAmountVal = accountSummaryPage.verifyWrittenOffAmountVal(driver);
			accountSummaryPage.verifyAmountValue(driver, writtenOffAmountVal, writtenOffAmountValue, amount);
			Log.testCaseResult(driver);

			} catch (Exception e) {
				Log.exception(e, DriverManager.getDriver());
			} finally {
				DriverManager.quitDriver(driver);
				Log.endTestCase();
			}
		}
	/**
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To Verify whether able to Execute the Write-off  on the Policy with the reason Low balance invoice", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC111(String browser) throws Exception {
		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To Verify whether able to Execute the Write-off  on the Policy with the reason Low balance invoice",driver);
		BillingCenterDataEngine testData = new BillingCenterDataEngine("BC_GWTestData_DataEngine.xlsx", "NonInterfaceSuite", "TC111");
		String amount = testData.getAmount();
		try {	
			
			BillingCenterStepsImpl bc = BillingCenterSteps.create();
			
			bc.loginIntoTheApplication("su", "gw");
			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clickPolicyIcon(driver);
			headerPage.enterPolicyNumber(driver,testData.getPolicyNumber());
			headerPage.clickSearch(driver);
			headerPage.getAccountNo(driver);
			AccountSummaryPage accountSummaryPage = headerPage.clickAccountNumber(driver);
			int writtenOffAmountValue = accountSummaryPage.getActualWriteOff(driver);
			ActionsPage actionsPage = new ActionsPage(driver);
			actionsPage.clickAction(driver);
			actionsPage.moveToNewTransaction(driver);
			WriteOffWizardPage writeOffWizardPage = headerPage.clickWriteOff(driver);
			writeOffWizardPage.clickSelect(driver);
			writeOffWizardPage.clickNext(driver);
			writeOffWizardPage.selectChargePattern(driver,testData.getChargePattern());
			writeOffWizardPage.clickAllCheckbox(driver);
			writeOffWizardPage.selectReason(driver, testData.getWriteOffReason());
			writeOffWizardPage.enterAmount(driver, amount);
			writeOffWizardPage.clickNext(driver);
			writeOffWizardPage.clickFinish(driver);		
			int writtenOffAmountVal = accountSummaryPage.verifyWrittenOffAmountVal(driver);
			accountSummaryPage.verifyAmountValue(driver, writtenOffAmountVal, writtenOffAmountValue, amount);
			Log.testCaseResult(driver);

			} catch (Exception e) {
				Log.exception(e, DriverManager.getDriver());
			} finally {
				DriverManager.quitDriver(driver);
				Log.endTestCase();
			}
		}
	/**
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To Verify whether able to Execute the Write-off  on the Policy with the reason Minor Adjustment", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC112(String browser) throws Exception {
		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To Verify whether able to Execute the Write-off  on the Policy with the reason Minor Adjustment",driver);
		BillingCenterDataEngine testData = new BillingCenterDataEngine("BC_GWTestData_DataEngine.xlsx", "NonInterfaceSuite", "TC112");
		String amount = testData.getAmount();
		try {	
			
			BillingCenterStepsImpl bc = BillingCenterSteps.create();
			
			bc.loginIntoTheApplication("su", "gw");
			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clickPolicyIcon(driver);
			headerPage.enterPolicyNumber(driver,testData.getPolicyNumber());
			headerPage.clickSearch(driver);
			headerPage.getAccountNo(driver);
			AccountSummaryPage accountSummaryPage = headerPage.clickAccountNumber(driver);
			int writtenOffAmountValue = accountSummaryPage.getActualWriteOff(driver);
			ActionsPage actionsPage = new ActionsPage(driver);
			actionsPage.clickAction(driver);
			actionsPage.moveToNewTransaction(driver);
			WriteOffWizardPage writeOffWizardPage = headerPage.clickWriteOff(driver);
			writeOffWizardPage.clickSelect(driver);
			writeOffWizardPage.clickNext(driver);
			writeOffWizardPage.selectChargePattern(driver,testData.getChargePattern());
			writeOffWizardPage.clickAllCheckbox(driver);
			writeOffWizardPage.selectReason(driver, testData.getWriteOffReason());
			writeOffWizardPage.enterAmount(driver, amount);
			writeOffWizardPage.clickNext(driver);
			writeOffWizardPage.clickFinish(driver);		
			int writtenOffAmountVal = accountSummaryPage.verifyWrittenOffAmountVal(driver);
			accountSummaryPage.verifyAmountValue(driver, writtenOffAmountVal, writtenOffAmountValue, amount);
			Log.testCaseResult(driver);

			} catch (Exception e) {
				Log.exception(e, DriverManager.getDriver());
			} finally {
				DriverManager.quitDriver(driver);
				Log.endTestCase();
			}
		}
	/**
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To Verify whether able to Execute the Write-off  on the Policy with the reason Miscellaneous", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC113(String browser) throws Exception {
		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To Verify whether able to Execute the Write-off  on the Policy with the reason Miscellaneous",driver);
		BillingCenterDataEngine testData = new BillingCenterDataEngine("BC_GWTestData_DataEngine.xlsx", "NonInterfaceSuite", "TC113");
		try {	
			
			BillingCenterStepsImpl bc = BillingCenterSteps.create();
			
			bc.loginIntoTheApplication("su", "gw");
			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clickPolicyIcon(driver);
			headerPage.enterPolicyNumber(driver,testData.getPolicyNumber());
			headerPage.clickSearch(driver);
			headerPage.getAccountNo(driver);
		    headerPage.clickAccountNumber(driver);
			ActionsPage actionsPage = new ActionsPage(driver);
			actionsPage.clickAction(driver);
			actionsPage.moveToNewTransaction(driver);
			WriteOffWizardPage writeOffWizardPage = headerPage.clickWriteOff(driver);
			writeOffWizardPage.clickSelectPolicyNo(driver ,testData.getPolicyNumber());
			writeOffWizardPage.clickNext(driver);
			writeOffWizardPage.selectChargePattern(driver,testData.getChargePattern());
			writeOffWizardPage.clickAllCheckbox(driver);
			writeOffWizardPage.selectReason(driver, testData.getWriteOffReason());
			writeOffWizardPage.enterAmount(driver, testData.getAmount());
			writeOffWizardPage.clickNext(driver);
			writeOffWizardPage.clickFinish(driver);		
			Log.testCaseResult(driver);

			} catch (Exception e) {
				Log.exception(e, DriverManager.getDriver());
			} finally {
				DriverManager.quitDriver(driver);
				Log.endTestCase();
			}
		}
	/**
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To Verify whether able to Execute the Write-off  on the Policy with the reason Negotiation", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC114(String browser) throws Exception {
		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To Verify whether able to Execute the Write-off  on the Policy with the reason Negotiation",driver);
		BillingCenterDataEngine testData = new BillingCenterDataEngine("BC_GWTestData_DataEngine.xlsx", "NonInterfaceSuite", "TC114");
		String amount = testData.getAmount();
		try {	
			
			BillingCenterStepsImpl bc = BillingCenterSteps.create();
			
			bc.loginIntoTheApplication("su", "gw");
			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clickPolicyIcon(driver);
			headerPage.enterPolicyNumber(driver,testData.getPolicyNumber());
			headerPage.clickSearch(driver);
			headerPage.getAccountNo(driver);
			AccountSummaryPage accountSummaryPage = headerPage.clickAccountNumber(driver);
			int writtenOffAmountValue = accountSummaryPage.getActualWriteOff(driver);
			ActionsPage actionsPage = new ActionsPage(driver);
			actionsPage.clickAction(driver);
			actionsPage.moveToNewTransaction(driver);
			WriteOffWizardPage writeOffWizardPage = headerPage.clickWriteOff(driver);
			writeOffWizardPage.clickSelectPolicyNo(driver ,testData.getPolicyNumber());
			writeOffWizardPage.clickNext(driver);
			writeOffWizardPage.selectChargePattern(driver,testData.getChargePattern());
			writeOffWizardPage.clickAllCheckbox(driver);
			writeOffWizardPage.selectReason(driver, testData.getWriteOffReason());
			writeOffWizardPage.enterAmount(driver, amount);
			writeOffWizardPage.clickNext(driver);
			writeOffWizardPage.clickFinish(driver);		
			int writtenOffAmountVal = accountSummaryPage.verifyWrittenOffAmountVal(driver);
			accountSummaryPage.verifyAmountValue(driver, writtenOffAmountVal, writtenOffAmountValue, amount);	
			Log.testCaseResult(driver);

			} catch (Exception e) {
				Log.exception(e, DriverManager.getDriver());
			} finally {
				DriverManager.quitDriver(driver);
				Log.endTestCase();
			}
		}
	/**
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To Verify whether able to Execute the Write-off  on the Policy with the reason Recovery Shortfall", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC115(String browser) throws Exception {
		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To Verify whether able to Execute the Write-off  on the Policy with the reason Recovery Shortfall",driver);
		BillingCenterDataEngine testData = new BillingCenterDataEngine("BC_GWTestData_DataEngine.xlsx", "NonInterfaceSuite", "TC115");
		String amount = testData.getAmount();
		try {	
			
			BillingCenterStepsImpl bc = BillingCenterSteps.create();
			
			bc.loginIntoTheApplication("su", "gw");
			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clickPolicyIcon(driver);
			headerPage.enterPolicyNumber(driver,testData.getPolicyNumber());
			headerPage.clickSearch(driver);
			headerPage.getAccountNo(driver);
			AccountSummaryPage accountSummaryPage = headerPage.clickAccountNumber(driver);
			int writtenOffAmountValue = accountSummaryPage.getActualWriteOff(driver);
			ActionsPage actionsPage = new ActionsPage(driver);
			actionsPage.clickAction(driver);
			actionsPage.moveToNewTransaction(driver);
			WriteOffWizardPage writeOffWizardPage = headerPage.clickWriteOff(driver);
			writeOffWizardPage.clickSelectPolicyNo(driver ,testData.getPolicyNumber());
			writeOffWizardPage.clickNext(driver);
			writeOffWizardPage.selectChargePattern(driver,testData.getChargePattern());
			writeOffWizardPage.clickAllCheckbox(driver);
			writeOffWizardPage.selectReason(driver, testData.getWriteOffReason());
			writeOffWizardPage.enterAmount(driver, amount);
			writeOffWizardPage.clickNext(driver);
			writeOffWizardPage.clickFinish(driver);		
			int writtenOffAmountVal = accountSummaryPage.verifyWrittenOffAmountVal(driver);
			accountSummaryPage.verifyAmountValue(driver, writtenOffAmountVal, writtenOffAmountValue, amount);
			Log.testCaseResult(driver);

			} catch (Exception e) {
				Log.exception(e, DriverManager.getDriver());
			} finally {
				DriverManager.quitDriver(driver);
				Log.endTestCase();
			}
		}
	/**
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To Verify whether able to Execute the Write-off  on the Policy with the reason Uncollectable", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC116(String browser) throws Exception {
		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To Verify whether able to Execute the Write-off  on the Policy with the reason Uncollectable",driver);
		BillingCenterDataEngine testData = new BillingCenterDataEngine("BC_GWTestData_DataEngine.xlsx", "NonInterfaceSuite", "TC116");
		String amount = testData.getAmount();
		try {	
			
			BillingCenterStepsImpl bc = BillingCenterSteps.create();
			
			bc.loginIntoTheApplication("su", "gw");
			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clickPolicyIcon(driver);
			headerPage.enterPolicyNumber(driver,testData.getPolicyNumber());
			headerPage.clickSearch(driver);
			headerPage.getAccountNo(driver);
			AccountSummaryPage accountSummaryPage = headerPage.clickAccountNumber(driver);
			int writtenOffAmountValue = accountSummaryPage.getActualWriteOff(driver);
			ActionsPage actionsPage = new ActionsPage(driver);
			actionsPage.clickAction(driver);
			actionsPage.moveToNewTransaction(driver);
			WriteOffWizardPage writeOffWizardPage = headerPage.clickWriteOff(driver);
			writeOffWizardPage.clickSelectPolicyNo(driver ,testData.getPolicyNumber());
			writeOffWizardPage.clickNext(driver);
			writeOffWizardPage.selectChargePattern(driver,testData.getChargePattern());
			writeOffWizardPage.clickAllCheckbox(driver);
			writeOffWizardPage.selectReason(driver, testData.getWriteOffReason());
			writeOffWizardPage.enterAmount(driver, amount);
			writeOffWizardPage.clickNext(driver);
			writeOffWizardPage.clickFinish(driver);		
			int writtenOffAmountVal = accountSummaryPage.verifyWrittenOffAmountVal(driver);
			accountSummaryPage.verifyAmountValue(driver, writtenOffAmountVal, writtenOffAmountValue, amount);
			Log.testCaseResult(driver);

			} catch (Exception e) {
				Log.exception(e, DriverManager.getDriver());
			} finally {
				DriverManager.quitDriver(driver);
				Log.endTestCase();
			}
		}
	/**
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To Verify whether able to Execute the Write-off  on the Policy with the reason Write-off on Cash Application", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC117(String browser) throws Exception {
		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To Verify whether able to Execute the Write-off  on the Policy with the reason Write-off on Cash Application",driver);
		BillingCenterDataEngine testData = new BillingCenterDataEngine("BC_GWTestData_DataEngine.xlsx", "NonInterfaceSuite", "TC117");
		String amount = testData.getAmount();
		try {	
			
			BillingCenterStepsImpl bc = BillingCenterSteps.create();
			
			bc.loginIntoTheApplication("su", "gw");
			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clickPolicyIcon(driver);
			headerPage.enterPolicyNumber(driver,testData.getPolicyNumber());
			headerPage.clickSearch(driver);
			headerPage.getAccountNo(driver);
			AccountSummaryPage accountSummaryPage = headerPage.clickAccountNumber(driver);
			int writtenOffAmountValue = accountSummaryPage.getActualWriteOff(driver);
			ActionsPage actionsPage = new ActionsPage(driver);
			actionsPage.clickAction(driver);
			actionsPage.moveToNewTransaction(driver);
			WriteOffWizardPage writeOffWizardPage = headerPage.clickWriteOff(driver);
			writeOffWizardPage.clickSelectPolicyNo(driver ,testData.getPolicyNumber());
			writeOffWizardPage.clickNext(driver);
			writeOffWizardPage.selectChargePattern(driver,testData.getChargePattern());
			writeOffWizardPage.clickAllCheckbox(driver);
			writeOffWizardPage.selectReason(driver, testData.getWriteOffReason());
			writeOffWizardPage.enterAmount(driver, amount);
			writeOffWizardPage.clickNext(driver);
			writeOffWizardPage.clickFinish(driver);		
			int writtenOffAmountVal = accountSummaryPage.verifyWrittenOffAmountVal(driver);
			accountSummaryPage.verifyAmountValue(driver, writtenOffAmountVal, writtenOffAmountValue, amount);	
			Log.testCaseResult(driver);

			} catch (Exception e) {
				Log.exception(e, DriverManager.getDriver());
			} finally {
				DriverManager.quitDriver(driver);
				Log.endTestCase();
			}
		}
	/**
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To Verify whether able to Execute the Write-off  on the Policy with the Charge Pattern Premium", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC118(String browser) throws Exception {
		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To Verify whether able to Execute the Write-off  on the Policy with the Charge Pattern Premium",driver);
		BillingCenterDataEngine testData = new BillingCenterDataEngine("BC_GWTestData_DataEngine.xlsx", "NonInterfaceSuite", "TC118");
		String amount = testData.getAmount();
		try {	
			
			BillingCenterStepsImpl bc = BillingCenterSteps.create();
			
			bc.loginIntoTheApplication("su", "gw");
			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clickPolicyIcon(driver);
			headerPage.enterPolicyNumber(driver,testData.getPolicyNumber());
			headerPage.clickSearch(driver);
			headerPage.getAccountNo(driver);
			AccountSummaryPage accountSummaryPage = headerPage.clickAccountNumber(driver);
			int writtenOffAmountValue = accountSummaryPage.getActualWriteOff(driver);
			ActionsPage actionsPage = new ActionsPage(driver);
			actionsPage.clickAction(driver);
			actionsPage.moveToNewTransaction(driver);
			WriteOffWizardPage writeOffWizardPage = headerPage.clickWriteOff(driver);
			writeOffWizardPage.clickSelectPolicyNo(driver ,testData.getPolicyNumber());
			writeOffWizardPage.clickNext(driver);
			writeOffWizardPage.selectChargePattern(driver,testData.getChargePattern());
			writeOffWizardPage.clickAllCheckbox(driver);
			writeOffWizardPage.selectReason(driver, testData.getWriteOffReason());
			writeOffWizardPage.enterAmount(driver, amount);
			writeOffWizardPage.clickNext(driver);
			writeOffWizardPage.clickFinish(driver);		
			int writtenOffAmountVal = accountSummaryPage.verifyWrittenOffAmountVal(driver);
			accountSummaryPage.verifyAmountValue(driver, writtenOffAmountVal, writtenOffAmountValue, amount);
			Log.testCaseResult(driver);

			} catch (Exception e) {
				Log.exception(e, DriverManager.getDriver());
			} finally {
				DriverManager.quitDriver(driver);
				Log.endTestCase();
			}
		}
	/**
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To Verify whether able to Execute the Write-off  on the Policy with the Charge Pattern Reinstatement Fee", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC119(String browser) throws Exception {
		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To Verify whether able to Execute the Write-off  on the Policy with the Charge Pattern Reinstatement Fee",driver);
		BillingCenterDataEngine testData = new BillingCenterDataEngine("BC_GWTestData_DataEngine.xlsx", "NonInterfaceSuite", "TC119");
		String amount = testData.getAmount();
		try {	
			
			BillingCenterStepsImpl bc = BillingCenterSteps.create();
			
			bc.loginIntoTheApplication("su", "gw");
			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clickPolicyIcon(driver);
			headerPage.enterPolicyNumber(driver,testData.getPolicyNumber());
			headerPage.clickSearch(driver);
			headerPage.getAccountNo(driver);
			ActionsPage actionsPage = new ActionsPage(driver);
			AccountSummaryPage accountSummaryPage = headerPage.clickAccountNumber(driver);
			actionsPage.clickAction(driver);
			actionsPage.moveToNewTransaction(driver);
			TransactionWizardPage transactionWizardPage = headerPage.clickGeneral(driver);
			transactionWizardPage.clickSelect(driver);
			transactionWizardPage.clickNext(driver);
			transactionWizardPage.selectCategory(driver, testData.getCategory());
			transactionWizardPage.enterAmount(driver, amount);
			transactionWizardPage.clickFinish(driver);
			
			int writtenOffAmountValue = accountSummaryPage.getActualWriteOff(driver);
			actionsPage.clickAction(driver);
			actionsPage.moveToNewTransaction(driver);
			WriteOffWizardPage writeOffWizardPage = headerPage.clickWriteOff(driver);
			writeOffWizardPage.clickSelectPolicyNo(driver ,testData.getPolicyNumber());
			writeOffWizardPage.clickNext(driver);
			writeOffWizardPage.selectChargePattern(driver,testData.getChargePattern());
			writeOffWizardPage.clickAllCheckbox(driver);
			writeOffWizardPage.selectReason(driver, testData.getWriteOffReason());
			writeOffWizardPage.enterAmount(driver, amount);
			writeOffWizardPage.clickNext(driver);
			writeOffWizardPage.clickFinish(driver);		
			int writtenOffAmountVal = accountSummaryPage.verifyWrittenOffAmountVal(driver);
			accountSummaryPage.verifyAmountValue(driver, writtenOffAmountVal, writtenOffAmountValue, amount);
			Log.testCaseResult(driver);

			} catch (Exception e) {
				Log.exception(e, DriverManager.getDriver());
			} finally {
				DriverManager.quitDriver(driver);
				Log.endTestCase();
			}
		}
	/**
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To Verify whether able to Execute the Write-off  on the Policy with the Charge Pattern Reinstatement Fee", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC120(String browser) throws Exception {
		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To Verify whether able to Execute the Write-off  on the Policy with the Charge Pattern Reinstatement Fee",driver);
		BillingCenterDataEngine testData = new BillingCenterDataEngine("BC_GWTestData_DataEngine.xlsx", "NonInterfaceSuite", "TC120");
		
		try {	
			
			BillingCenterStepsImpl bc = BillingCenterSteps.create();
			
			bc.loginIntoTheApplication("su", "gw");
			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clickPolicyIcon(driver);
			headerPage.enterPolicyNumber(driver,testData.getPolicyNumber());
			headerPage.clickSearch(driver);
			headerPage.getAccountNo(driver);
			ActionsPage actionsPage = new ActionsPage(driver);
			AccountSummaryPage accountSummaryPage = headerPage.clickAccountNumber(driver);
			actionsPage.clickAction(driver);
			actionsPage.moveToNewTransaction(driver);
			WriteOffWizardPage writeOffWizardPage = headerPage.clickWriteOff(driver);
			writeOffWizardPage.clickSelectPolicyNo(driver ,testData.getPolicyNumber());
			writeOffWizardPage.clickNext(driver);
			writeOffWizardPage.selectChargePattern(driver,testData.getChargePattern());
			writeOffWizardPage.clickAllCheckbox(driver);
			writeOffWizardPage.selectReason(driver, testData.getWriteOffReason());
			writeOffWizardPage.enterAmount(driver, testData.getWriteOffAmount());
			writeOffWizardPage.clickNext(driver);
			writeOffWizardPage.clickFinish(driver);		
			int writtenOffAmountValue = accountSummaryPage.getActualWriteOff(driver);
			actionsPage.clickAction(driver);
			actionsPage.moveToNewTransaction(driver);
			WriteOffReversalWizardPage writeOffReversalWizardPage = headerPage.clickWriteOffReversal(driver);
			writeOffReversalWizardPage.selectReason(driver,testData.getWriteOffReason());
			writeOffReversalWizardPage.clickSearch(driver);
			writeOffReversalWizardPage.clickSelect(driver);
			writeOffReversalWizardPage.clickFinish(driver);
			int writtenOffAmountVal = accountSummaryPage.verifyWrittenOffAmountVal(driver);
			accountSummaryPage.verifyReversalAmount(driver, writtenOffAmountVal, writtenOffAmountValue, testData.getWriteOffAmount());
			Log.testCaseResult(driver);

			} catch (Exception e) {
				Log.exception(e, DriverManager.getDriver());
			} finally {
				DriverManager.quitDriver(driver);
				Log.endTestCase();
			}
		}
	/**
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To Verify whether able to Execute the Write-off reversal  on the Policy for the Write off reason Low balance invoice", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC121(String browser) throws Exception {
		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To Verify whether able to Execute the Write-off reversal  on the Policy for the Write off reason Low balance invoice",driver);
		BillingCenterDataEngine testData = new BillingCenterDataEngine("BC_GWTestData_DataEngine.xlsx", "NonInterfaceSuite", "TC121");
		String amount = testData.getAmount();
		try {	
			
			BillingCenterStepsImpl bc = BillingCenterSteps.create();
			
			bc.loginIntoTheApplication("su", "gw");
			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clickPolicyIcon(driver);
			headerPage.enterPolicyNumber(driver,testData.getPolicyNumber());
			headerPage.clickSearch(driver);
			headerPage.getAccountNo(driver);
			ActionsPage actionsPage = new ActionsPage(driver);
			AccountSummaryPage accountSummaryPage = headerPage.clickAccountNumber(driver);
			actionsPage.clickAction(driver);
			actionsPage.moveToNewTransaction(driver);
			WriteOffWizardPage writeOffWizardPage = headerPage.clickWriteOff(driver);
			writeOffWizardPage.clickSelectPolicyNo(driver ,testData.getPolicyNumber());
			writeOffWizardPage.clickNext(driver);
			writeOffWizardPage.selectChargePattern(driver,testData.getChargePattern());
			writeOffWizardPage.clickAllCheckbox(driver);
			writeOffWizardPage.selectReason(driver, testData.getWriteOffReason());
			writeOffWizardPage.enterAmount(driver,amount);
			writeOffWizardPage.clickNext(driver);
			writeOffWizardPage.clickFinish(driver);		
			int writtenOffAmountValue = accountSummaryPage.getActualWriteOff(driver);
			actionsPage.clickAction(driver);
			actionsPage.moveToNewTransaction(driver);
			WriteOffReversalWizardPage writeOffReversalWizardPage = headerPage.clickWriteOffReversal(driver);
			writeOffReversalWizardPage.selectReason(driver,testData.getWriteOffReason());
			writeOffReversalWizardPage.clickSearch(driver);
			writeOffReversalWizardPage.clickSelect(driver);
			writeOffReversalWizardPage.clickFinish(driver);
			int writtenOffAmountVal = accountSummaryPage.verifyWrittenOffAmountVal(driver);
			accountSummaryPage.verifyReversalAmount(driver, writtenOffAmountVal, writtenOffAmountValue, amount);
			Log.testCaseResult(driver);

			} catch (Exception e) {
				Log.exception(e, DriverManager.getDriver());
			} finally {
				DriverManager.quitDriver(driver);
				Log.endTestCase();
			}
		}
	/**
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To Verify whether able to Execute the Write-off reversal  on the Policy for the Write off reason Minor Adjustment", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC122(String browser) throws Exception {
		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To Verify whether able to Execute the Write-off reversal  on the Policy for the Write off reason Minor Adjustment",driver);
		BillingCenterDataEngine testData = new BillingCenterDataEngine("BC_GWTestData_DataEngine.xlsx", "NonInterfaceSuite", "TC122");
		String amount = testData.getAmount();
		try {	
			
			BillingCenterStepsImpl bc = BillingCenterSteps.create();
			
			bc.loginIntoTheApplication("su", "gw");
			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clickPolicyIcon(driver);
			headerPage.enterPolicyNumber(driver,testData.getPolicyNumber());
			headerPage.clickSearch(driver);
			headerPage.getAccountNo(driver);
			ActionsPage actionsPage = new ActionsPage(driver);
			AccountSummaryPage accountSummaryPage = headerPage.clickAccountNumber(driver);
			actionsPage.clickAction(driver);
			actionsPage.moveToNewTransaction(driver);
			WriteOffWizardPage writeOffWizardPage = headerPage.clickWriteOff(driver);
			writeOffWizardPage.clickSelectPolicyNo(driver ,testData.getPolicyNumber());
			writeOffWizardPage.clickNext(driver);
			writeOffWizardPage.selectChargePattern(driver,testData.getChargePattern());
			writeOffWizardPage.clickAllCheckbox(driver);
			writeOffWizardPage.selectReason(driver, testData.getWriteOffReason());
			writeOffWizardPage.enterAmount(driver, amount);
			writeOffWizardPage.clickNext(driver);
			writeOffWizardPage.clickFinish(driver);		
			int writtenOffAmountValue = accountSummaryPage.getActualWriteOff(driver);
			actionsPage.clickAction(driver);
			actionsPage.moveToNewTransaction(driver);
			WriteOffReversalWizardPage writeOffReversalWizardPage = headerPage.clickWriteOffReversal(driver);
			writeOffReversalWizardPage.selectReason(driver,testData.getWriteOffReason());
			writeOffReversalWizardPage.clickSearch(driver);
			writeOffReversalWizardPage.clickSelect(driver);
			writeOffReversalWizardPage.clickFinish(driver);
			int writtenOffAmountVal = accountSummaryPage.verifyWrittenOffAmountVal(driver);
			accountSummaryPage.verifyReversalAmount(driver, writtenOffAmountVal, writtenOffAmountValue, amount);
			Log.testCaseResult(driver);

			} catch (Exception e) {
				Log.exception(e, DriverManager.getDriver());
			} finally {
				DriverManager.quitDriver(driver);
				Log.endTestCase();
			}
		}
	/**
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To Verify whether able to Execute the Write-off reversal  on the Policy for the Write off reason Miscellaneous", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC123(String browser) throws Exception {
		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To Verify whether able to Execute the Write-off reversal  on the Policy for the Write off reason Miscellaneous",driver);
		BillingCenterDataEngine testData = new BillingCenterDataEngine("BC_GWTestData_DataEngine.xlsx", "NonInterfaceSuite", "TC123");
		String amount = testData.getAmount();
		try {	
			
			BillingCenterStepsImpl bc = BillingCenterSteps.create();
			
			bc.loginIntoTheApplication("su", "gw");
			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clickPolicyIcon(driver);
			headerPage.enterPolicyNumber(driver,testData.getPolicyNumber());
			headerPage.clickSearch(driver);
			headerPage.getAccountNo(driver);
			ActionsPage actionsPage = new ActionsPage(driver);
			AccountSummaryPage accountSummaryPage = headerPage.clickAccountNumber(driver);
			actionsPage.clickAction(driver);
			actionsPage.moveToNewTransaction(driver);
			WriteOffWizardPage writeOffWizardPage = headerPage.clickWriteOff(driver);
			writeOffWizardPage.clickSelectPolicyNo(driver ,testData.getPolicyNumber());
			writeOffWizardPage.clickNext(driver);
			writeOffWizardPage.selectChargePattern(driver,testData.getChargePattern());
			writeOffWizardPage.clickAllCheckbox(driver);
			writeOffWizardPage.selectReason(driver, testData.getWriteOffReason());
			writeOffWizardPage.enterAmount(driver,amount);
			writeOffWizardPage.clickNext(driver);
			writeOffWizardPage.clickFinish(driver);		
			int writtenOffAmountValue = accountSummaryPage.getActualWriteOff(driver);
			actionsPage.clickAction(driver);
			actionsPage.moveToNewTransaction(driver);
			WriteOffReversalWizardPage writeOffReversalWizardPage = headerPage.clickWriteOffReversal(driver);
			writeOffReversalWizardPage.selectReason(driver,testData.getWriteOffReason());
			writeOffReversalWizardPage.clickSearch(driver);
			writeOffReversalWizardPage.clickSelect(driver);
			writeOffReversalWizardPage.clickFinish(driver);
			int writtenOffAmountVal = accountSummaryPage.verifyWrittenOffAmountVal(driver);
			accountSummaryPage.verifyReversalAmount(driver, writtenOffAmountVal, writtenOffAmountValue, amount);
			Log.testCaseResult(driver);

			} catch (Exception e) {
				Log.exception(e, DriverManager.getDriver());
			} finally {
				DriverManager.quitDriver(driver);
				Log.endTestCase();
			}
		}
	/**
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To Verify whether able to Execute the Write-off reversal  on the Policy for the Write off reason Negotiation", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC124(String browser) throws Exception {
		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To Verify whether able to Execute the Write-off reversal  on the Policy for the Write off reason Negotiation",driver);
		BillingCenterDataEngine testData = new BillingCenterDataEngine("BC_GWTestData_DataEngine.xlsx", "NonInterfaceSuite", "TC124");
		String amount = testData.getAmount();
		try {	
			
			BillingCenterStepsImpl bc = BillingCenterSteps.create();
			
			bc.loginIntoTheApplication("su", "gw");
			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clickPolicyIcon(driver);
			headerPage.enterPolicyNumber(driver,testData.getPolicyNumber());
			headerPage.clickSearch(driver);
			headerPage.getAccountNo(driver);
			ActionsPage actionsPage = new ActionsPage(driver);
			AccountSummaryPage accountSummaryPage = headerPage.clickAccountNumber(driver);
			actionsPage.clickAction(driver);
			actionsPage.moveToNewTransaction(driver);
			WriteOffWizardPage writeOffWizardPage = headerPage.clickWriteOff(driver);
			writeOffWizardPage.clickSelectPolicyNo(driver ,testData.getPolicyNumber());
			writeOffWizardPage.clickNext(driver);
			writeOffWizardPage.selectChargePattern(driver,testData.getChargePattern());
			writeOffWizardPage.clickAllCheckbox(driver);
			writeOffWizardPage.selectReason(driver, testData.getWriteOffReason());
			writeOffWizardPage.enterAmount(driver, amount);
			writeOffWizardPage.clickNext(driver);
			writeOffWizardPage.clickFinish(driver);		
			int writtenOffAmountValue = accountSummaryPage.getActualWriteOff(driver);
			actionsPage.clickAction(driver);
			actionsPage.moveToNewTransaction(driver);
			WriteOffReversalWizardPage writeOffReversalWizardPage = headerPage.clickWriteOffReversal(driver);
			writeOffReversalWizardPage.selectReason(driver,testData.getWriteOffReason());
			writeOffReversalWizardPage.clickSearch(driver);
			writeOffReversalWizardPage.clickSelect(driver);
			writeOffReversalWizardPage.clickFinish(driver);
			int writtenOffAmountVal = accountSummaryPage.verifyWrittenOffAmountVal(driver);
			accountSummaryPage.verifyReversalAmount(driver, writtenOffAmountVal, writtenOffAmountValue, amount);
			Log.testCaseResult(driver);

			} catch (Exception e) {
				Log.exception(e, DriverManager.getDriver());
			} finally {
				DriverManager.quitDriver(driver);
				Log.endTestCase();
			}
		}
	/**
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To Verify whether able to Execute the Write-off reversal  on the Policy for the Write off reason Recovery Shortfall", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC125(String browser) throws Exception {
		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To Verify whether able to Execute the Write-off reversal  on the Policy for the Write off reason Recovery Shortfall",driver);
		BillingCenterDataEngine testData = new BillingCenterDataEngine("BC_GWTestData_DataEngine.xlsx", "NonInterfaceSuite", "TC125");
		String amount = testData.getAmount();
		try {	
			
			BillingCenterStepsImpl bc = BillingCenterSteps.create();
			
			bc.loginIntoTheApplication("su", "gw");
			HeaderPage headerPage = new HeaderPage(driver);
			System.out.println("policNo : "+testData.getPolicyNumber());
			headerPage.clickPolicyIcon(driver);
			headerPage.enterPolicyNumber(driver,testData.getPolicyNumber());
			headerPage.clickSearch(driver);
			headerPage.getAccountNo(driver);
			ActionsPage actionsPage = new ActionsPage(driver);
			AccountSummaryPage accountSummaryPage = headerPage.clickAccountNumber(driver);
			actionsPage.clickAction(driver);
			actionsPage.moveToNewTransaction(driver);
			WriteOffWizardPage writeOffWizardPage = headerPage.clickWriteOff(driver);
			writeOffWizardPage.clickSelectPolicyNo(driver ,testData.getPolicyNumber());
			writeOffWizardPage.clickNext(driver);
			writeOffWizardPage.selectChargePattern(driver,testData.getChargePattern());
			writeOffWizardPage.clickAllCheckbox(driver);
			writeOffWizardPage.selectReason(driver, testData.getWriteOffReason());
			writeOffWizardPage.enterAmount(driver,amount);
			writeOffWizardPage.clickNext(driver);
			writeOffWizardPage.clickFinish(driver);		
			int writtenOffAmountValue = accountSummaryPage.getActualWriteOff(driver);
			actionsPage.clickAction(driver);
			actionsPage.moveToNewTransaction(driver);
			WriteOffReversalWizardPage writeOffReversalWizardPage = headerPage.clickWriteOffReversal(driver);
			writeOffReversalWizardPage.selectReason(driver,testData.getWriteOffReason());
			writeOffReversalWizardPage.clickSearch(driver);
			writeOffReversalWizardPage.clickSelect(driver);
			writeOffReversalWizardPage.clickFinish(driver);
			int writtenOffAmountVal = accountSummaryPage.verifyWrittenOffAmountVal(driver);
			accountSummaryPage.verifyReversalAmount(driver, writtenOffAmountVal, writtenOffAmountValue, amount);
			Log.testCaseResult(driver);

			} catch (Exception e) {
				Log.exception(e, DriverManager.getDriver());
			} finally {
				DriverManager.quitDriver(driver);
				Log.endTestCase();
			}
		}
	/**
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To Verify whether able to Execute the Write-off reversal  on the Policy for the Write off reason Uncollectable", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC126(String browser) throws Exception {
		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To Verify whether able to Execute the Write-off reversal  on the Policy for the Write off reason Uncollectable",driver);
		BillingCenterDataEngine testData = new BillingCenterDataEngine("BC_GWTestData_DataEngine.xlsx", "NonInterfaceSuite", "TC126");
		String amount = testData.getAmount();
		try {	
			
			BillingCenterStepsImpl bc = BillingCenterSteps.create();
			
			bc.loginIntoTheApplication("su", "gw");
			HeaderPage headerPage = new HeaderPage(driver);
			System.out.println("policNo : "+testData.getPolicyNumber());
			headerPage.clickPolicyIcon(driver);
			headerPage.enterPolicyNumber(driver,testData.getPolicyNumber());
			headerPage.clickSearch(driver);
			headerPage.getAccountNo(driver);
			ActionsPage actionsPage = new ActionsPage(driver);
			AccountSummaryPage accountSummaryPage = headerPage.clickAccountNumber(driver);
			actionsPage.clickAction(driver);
			actionsPage.moveToNewTransaction(driver);
			WriteOffWizardPage writeOffWizardPage = headerPage.clickWriteOff(driver);
			writeOffWizardPage.clickSelectPolicyNo(driver ,testData.getPolicyNumber());
			writeOffWizardPage.clickNext(driver);
			writeOffWizardPage.selectChargePattern(driver,testData.getChargePattern());
			writeOffWizardPage.clickAllCheckbox(driver);
			writeOffWizardPage.selectReason(driver, testData.getWriteOffReason());
			writeOffWizardPage.enterAmount(driver, amount);
			writeOffWizardPage.clickNext(driver);
			writeOffWizardPage.clickFinish(driver);		
			int writtenOffAmountValue = accountSummaryPage.getActualWriteOff(driver);
			actionsPage.clickAction(driver);
			actionsPage.moveToNewTransaction(driver);
			WriteOffReversalWizardPage writeOffReversalWizardPage = headerPage.clickWriteOffReversal(driver);
			writeOffReversalWizardPage.selectReason(driver,testData.getWriteOffReason());
			writeOffReversalWizardPage.clickSearch(driver);
			writeOffReversalWizardPage.clickSelect(driver);
			writeOffReversalWizardPage.clickFinish(driver);
			int writtenOffAmountVal = accountSummaryPage.verifyWrittenOffAmountVal(driver);
			accountSummaryPage.verifyReversalAmount(driver, writtenOffAmountVal, writtenOffAmountValue, amount);
			Log.testCaseResult(driver);

			} catch (Exception e) {
				Log.exception(e, DriverManager.getDriver());
			} finally {
				DriverManager.quitDriver(driver);
				Log.endTestCase();
			}
		}
	/**
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To Verify whether able to Execute the Write-off reversal  on the Policy for the Write off reason Write-off on Cash Application", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC127(String browser) throws Exception {
		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To Verify whether able to Execute the Write-off reversal  on the Policy for the Write off reason Uncollectable",driver);
		BillingCenterDataEngine testData = new BillingCenterDataEngine("BC_GWTestData_DataEngine.xlsx", "NonInterfaceSuite", "TC127");
	    String amount = testData.getAmount();
		try {	
			
			BillingCenterStepsImpl bc = BillingCenterSteps.create();
			
			bc.loginIntoTheApplication("su", "gw");
			HeaderPage headerPage = new HeaderPage(driver);
			System.out.println("policNo : "+testData.getPolicyNumber());
			headerPage.clickPolicyIcon(driver);
			headerPage.enterPolicyNumber(driver,testData.getPolicyNumber());
			headerPage.clickSearch(driver);
			headerPage.getAccountNo(driver);
			ActionsPage actionsPage = new ActionsPage(driver);
			AccountSummaryPage accountSummaryPage = headerPage.clickAccountNumber(driver);
			actionsPage.clickAction(driver);
			actionsPage.moveToNewTransaction(driver);
			WriteOffWizardPage writeOffWizardPage = headerPage.clickWriteOff(driver);
			writeOffWizardPage.clickSelectPolicyNo(driver ,testData.getPolicyNumber());
			writeOffWizardPage.clickNext(driver);
			writeOffWizardPage.selectChargePattern(driver,testData.getChargePattern());
			writeOffWizardPage.clickAllCheckbox(driver);
			writeOffWizardPage.selectReason(driver, testData.getWriteOffReason());
			writeOffWizardPage.enterAmount(driver, amount);
			writeOffWizardPage.clickNext(driver);
			writeOffWizardPage.clickFinish(driver);		
			int writtenOffAmountValue = accountSummaryPage.getActualWriteOff(driver);
			actionsPage.clickAction(driver);
			actionsPage.moveToNewTransaction(driver);
			WriteOffReversalWizardPage writeOffReversalWizardPage = headerPage.clickWriteOffReversal(driver);
			writeOffReversalWizardPage.selectReason(driver,testData.getWriteOffReason());
			writeOffReversalWizardPage.clickSearch(driver);
			writeOffReversalWizardPage.clickSelect(driver);
			writeOffReversalWizardPage.clickFinish(driver);
			int writtenOffAmountVal = accountSummaryPage.verifyWrittenOffAmountVal(driver);
			accountSummaryPage.verifyReversalAmount(driver, writtenOffAmountVal, writtenOffAmountValue, amount);
			Log.testCaseResult(driver);

			} catch (Exception e) {
				Log.exception(e, DriverManager.getDriver());
			} finally {
				DriverManager.quitDriver(driver);
				Log.endTestCase();
			}
		}
	/**
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To Verify whether able to Execute Premium Write-off Reversal on the Policy with the reason Error Correction", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC128(String browser) throws Exception {
		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To Verify whether able to Execute Premium Write-off Reversal on the Policy with the reason Error Correction",driver);
		BillingCenterDataEngine testData = new BillingCenterDataEngine("BC_GWTestData_DataEngine.xlsx", "NonInterfaceSuite", "TC128");
		String amount = testData.getAmount();
		try {	
			
			BillingCenterStepsImpl bc = BillingCenterSteps.create();
			
			bc.loginIntoTheApplication("su", "gw");
			HeaderPage headerPage = new HeaderPage(driver);
			System.out.println("policNo : "+testData.getPolicyNumber());
			headerPage.clickPolicyIcon(driver);
			headerPage.enterPolicyNumber(driver,testData.getPolicyNumber());
			headerPage.clickSearch(driver);
			headerPage.getAccountNo(driver);
			ActionsPage actionsPage = new ActionsPage(driver);
			AccountSummaryPage accountSummaryPage = headerPage.clickAccountNumber(driver);
			actionsPage.clickAction(driver);
			actionsPage.moveToNewTransaction(driver);
			WriteOffWizardPage writeOffWizardPage = headerPage.clickWriteOff(driver);
			writeOffWizardPage.clickSelectPolicyNo(driver, testData.getPolicyNumber());
			writeOffWizardPage.clickNext(driver);
			writeOffWizardPage.selectChargePattern(driver,testData.getChargePattern());
			writeOffWizardPage.clickAllCheckbox(driver);
			writeOffWizardPage.selectReason(driver, testData.getWriteOffReason());
			writeOffWizardPage.enterAmount(driver,amount);
			writeOffWizardPage.clickNext(driver);
			writeOffWizardPage.clickFinish(driver);		
			int writtenOffAmountValue = accountSummaryPage.getActualWriteOff(driver);
			actionsPage.clickAction(driver);
			actionsPage.moveToNewTransaction(driver);
			WriteOffReversalWizardPage writeOffReversalWizardPage = headerPage.clickWriteOffReversal(driver);
			writeOffReversalWizardPage.selectReason(driver,testData.getWriteOffReason());
			writeOffReversalWizardPage.clickSearch(driver);
			writeOffReversalWizardPage.clickSelect(driver);
			writeOffReversalWizardPage.selectReasonWriteOffReversal(driver, testData.getWriteOffReversalReason());
			writeOffReversalWizardPage.clickFinish(driver);
			int writtenOffAmountVal = accountSummaryPage.verifyWrittenOffAmountVal(driver);
			accountSummaryPage.verifyReversalAmount(driver, writtenOffAmountVal, writtenOffAmountValue, amount);
			Log.testCaseResult(driver);

			} catch (Exception e) {
				Log.exception(e, DriverManager.getDriver());
			} finally {
				DriverManager.quitDriver(driver);
				Log.endTestCase();
			}
		}
	/**
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To Verify whether able to Execute Premium Write-off Reversal on the Policy with the reason Payment Received", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC129(String browser) throws Exception {
		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To Verify whether able to Execute Premium Write-off Reversal on the Policy with the reason Payment Received",driver);
		
		BillingCenterDataEngine testData = new BillingCenterDataEngine("BC_GWTestData_DataEngine.xlsx", "NonInterfaceSuite", "TC129");
		String amount = testData.getAmount();
		try {	
			
			BillingCenterStepsImpl bc = BillingCenterSteps.create();
			
			bc.loginIntoTheApplication("su", "gw");
			HeaderPage headerPage = new HeaderPage(driver);
			System.out.println("policNo : "+testData.getPolicyNumber());
			headerPage.clickPolicyIcon(driver);
			headerPage.enterPolicyNumber(driver,testData.getPolicyNumber());
			headerPage.clickSearch(driver);
			headerPage.getAccountNo(driver);
			ActionsPage actionsPage = new ActionsPage(driver);
			AccountSummaryPage accountSummaryPage = headerPage.clickAccountNumber(driver);
			actionsPage.clickAction(driver);
			actionsPage.moveToNewTransaction(driver);
			WriteOffWizardPage writeOffWizardPage = headerPage.clickWriteOff(driver);
			writeOffWizardPage.clickSelectPolicyNo(driver ,testData.getPolicyNumber());
			writeOffWizardPage.clickNext(driver);
			writeOffWizardPage.selectChargePattern(driver,testData.getChargePattern());
			writeOffWizardPage.clickAllCheckbox(driver);
			writeOffWizardPage.selectReason(driver, testData.getWriteOffReason());
			writeOffWizardPage.enterAmount(driver, amount);
			writeOffWizardPage.clickNext(driver);
			writeOffWizardPage.clickFinish(driver);		
			int writtenOffAmountValue = accountSummaryPage.getActualWriteOff(driver);
			actionsPage.clickAction(driver);
			actionsPage.moveToNewTransaction(driver);
			WriteOffReversalWizardPage writeOffReversalWizardPage = headerPage.clickWriteOffReversal(driver);
			writeOffReversalWizardPage.selectReason(driver,testData.getWriteOffReason());
			writeOffReversalWizardPage.clickSearch(driver);
			writeOffReversalWizardPage.clickSelect(driver);
			writeOffReversalWizardPage.selectReasonWriteOffReversal(driver, testData.getWriteOffReversalReason());
			writeOffReversalWizardPage.clickFinish(driver);
			int writtenOffAmountVal = accountSummaryPage.verifyWrittenOffAmountVal(driver);
			accountSummaryPage.verifyReversalAmount(driver, writtenOffAmountVal, writtenOffAmountValue, amount);
			Log.testCaseResult(driver);

			} catch (Exception e) {
				Log.exception(e, DriverManager.getDriver());
			} finally {
				DriverManager.quitDriver(driver);
				Log.endTestCase();
			}
		}
	/**
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To Verify whether able to Execute Reinstatement fee Write-off Reversal on the Policy with the reason Error Correction", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC130(String browser) throws Exception {
		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To Verify whether able to Execute Reinstatement fee Write-off Reversal on the Policy with the reason Error Correction",driver);
		BillingCenterDataEngine testData = new BillingCenterDataEngine("BC_GWTestData_DataEngine.xlsx", "NonInterfaceSuite", "TC130");
		String amount = testData.getAmount();
		try {	
			
			BillingCenterStepsImpl bc = BillingCenterSteps.create();
			
			bc.loginIntoTheApplication("su", "gw");
			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clickPolicyIcon(driver);
			headerPage.enterPolicyNumber(driver,testData.getPolicyNumber());
			headerPage.clickSearch(driver);
			headerPage.getAccountNo(driver);
			ActionsPage actionsPage = new ActionsPage(driver);
			AccountSummaryPage accountSummaryPage = headerPage.clickAccountNumber(driver);
			actionsPage.clickAction(driver);
			actionsPage.moveToNewTransaction(driver);
			TransactionWizardPage transactionWizardPage = headerPage.clickGeneral(driver);
			transactionWizardPage.clickSelect(driver);
			transactionWizardPage.clickNext(driver);
			transactionWizardPage.selectCategory(driver, testData.getCategory());
			transactionWizardPage.enterAmount(driver, amount);
			transactionWizardPage.clickFinish(driver);
			actionsPage.clickAction(driver);
			actionsPage.moveToNewTransaction(driver);
			WriteOffWizardPage writeOffWizardPage = headerPage.clickWriteOff(driver);
			writeOffWizardPage.clickSelect(driver);
			writeOffWizardPage.clickNext(driver);
			writeOffWizardPage.selectChargePattern(driver,testData.getChargePattern());
			writeOffWizardPage.clickAllCheckbox(driver);
			writeOffWizardPage.selectReason(driver, testData.getWriteOffReason());
			writeOffWizardPage.enterAmount(driver, amount);
			writeOffWizardPage.clickNext(driver);
			writeOffWizardPage.clickFinish(driver);		
			int writtenOffAmountValue = accountSummaryPage.getActualWriteOff(driver);
			actionsPage.clickAction(driver);
			actionsPage.moveToNewTransaction(driver);
			WriteOffReversalWizardPage writeOffReversalWizardPage = headerPage.clickWriteOffReversal(driver);
			writeOffReversalWizardPage.selectReason(driver,testData.getWriteOffReason());
			writeOffReversalWizardPage.clickSearch(driver);
			writeOffReversalWizardPage.clickSelect(driver);
			writeOffReversalWizardPage.selectReasonWriteOffReversal(driver, testData.getWriteOffReversalReason());
			writeOffReversalWizardPage.clickFinish(driver);
			int writtenOffAmountVal = accountSummaryPage.verifyWrittenOffAmountVal(driver);
			accountSummaryPage.verifyReversalAmount(driver, writtenOffAmountVal, writtenOffAmountValue, amount);
			Log.testCaseResult(driver);

			} catch (Exception e) {
				Log.exception(e, DriverManager.getDriver());
			} finally {
				DriverManager.quitDriver(driver);
				Log.endTestCase();
			}
		}
	/**
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To Verify whether able to Execute the Write-off  on the Policy with the Charge Pattern Reinstatement Fee", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC131(String browser) throws Exception {
		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To Verify whether able to Execute the Write-off  on the Policy with the Charge Pattern Reinstatement Fee",driver);
		BillingCenterDataEngine testData = new BillingCenterDataEngine("BC_GWTestData_DataEngine.xlsx", "NonInterfaceSuite", "TC131");
		String amount = testData.getAmount();
		try {	
			
			BillingCenterStepsImpl bc = BillingCenterSteps.create();
			
			bc.loginIntoTheApplication("su", "gw");
			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clickPolicyIcon(driver);
			headerPage.enterPolicyNumber(driver,testData.getPolicyNumber());
			headerPage.clickSearch(driver);
			headerPage.getAccountNo(driver);
			ActionsPage actionsPage = new ActionsPage(driver);
			AccountSummaryPage accountSummaryPage = headerPage.clickAccountNumber(driver);
			actionsPage.clickAction(driver);
			actionsPage.moveToNewTransaction(driver);
			TransactionWizardPage transactionWizardPage = headerPage.clickGeneral(driver);
			transactionWizardPage.clickSelect(driver);
			transactionWizardPage.clickNext(driver);
			transactionWizardPage.selectCategory(driver, testData.getCategory());
			transactionWizardPage.enterAmount(driver, amount);
			transactionWizardPage.clickFinish(driver);
			actionsPage.clickAction(driver);
			actionsPage.moveToNewTransaction(driver);
			WriteOffWizardPage writeOffWizardPage = headerPage.clickWriteOff(driver);
			writeOffWizardPage.clickSelect(driver);
			writeOffWizardPage.clickNext(driver);
			writeOffWizardPage.selectChargePattern(driver,testData.getChargePattern());
			writeOffWizardPage.clickAllCheckbox(driver);
			writeOffWizardPage.selectReason(driver, testData.getWriteOffReason());
			writeOffWizardPage.enterAmount(driver, amount);
			writeOffWizardPage.clickNext(driver);
			writeOffWizardPage.clickFinish(driver);		
			int writtenOffAmountValue = accountSummaryPage.getActualWriteOff(driver);
			actionsPage.clickAction(driver);
			actionsPage.moveToNewTransaction(driver);
			WriteOffReversalWizardPage writeOffReversalWizardPage = headerPage.clickWriteOffReversal(driver);
			writeOffReversalWizardPage.selectReason(driver,testData.getWriteOffReason());
			writeOffReversalWizardPage.clickSearch(driver);
			writeOffReversalWizardPage.clickSelect(driver);
			writeOffReversalWizardPage.selectReasonWriteOffReversal(driver, testData.getWriteOffReversalReason());
			writeOffReversalWizardPage.clickFinish(driver);
			int writtenOffAmountVal = accountSummaryPage.verifyWrittenOffAmountVal(driver);
			accountSummaryPage.verifyReversalAmount(driver, writtenOffAmountVal, writtenOffAmountValue, amount);
			Log.testCaseResult(driver);

			} catch (Exception e) {
				Log.exception(e, DriverManager.getDriver());
			} finally {
				DriverManager.quitDriver(driver);
				Log.endTestCase();
			}
		}
	/**
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To Verify whether able to Execute the Write-off  on the Policy with the Charge Pattern Reinstatement Fee", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC132(String browser) throws Exception {
		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To Verify whether able to Execute the Write-off  on the Policy with the Charge Pattern Reinstatement Fee",driver);
		try {	
			
			BillingCenterStepsImpl bc = BillingCenterSteps.create();
			
			bc.loginIntoTheApplication("su", "gw");
			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clickDesktopSubMenu(driver);
			MyActivitiesPage myActivitiesPage = headerPage.clickMyActivities(driver);
			myActivitiesPage.verifyAssignButton(driver);
			myActivitiesPage.verifyCompleteButton(driver);
			myActivitiesPage.verifyOptionsInDesktopFilter(driver);
			myActivitiesPage.verifyOptionsInDesktopOwnerFilter(driver);
			myActivitiesPage.verifyOptionsInActivityPatternFilter(driver);
			myActivitiesPage.verifyOpenedTitle(driver);
			myActivitiesPage.verifyDueTitle(driver);
			myActivitiesPage.verifyPriorityTitle(driver);
			myActivitiesPage.verifyStatusTitle(driver);
			myActivitiesPage.verifySubjectTitle(driver);
			myActivitiesPage.verifyTroubleTicketTitle(driver);
			myActivitiesPage.verifyColumnuMenu(driver);
			Log.testCaseResult(driver);

			} catch (Exception e) {
				Log.exception(e, DriverManager.getDriver());
			} finally {
				DriverManager.quitDriver(driver);
				Log.endTestCase();
			}
		}
}