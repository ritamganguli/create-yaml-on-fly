package com.aspire.guidewire.bc.testscripts;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aspire.guidewire.bc.teststeps.BillingCenterDataEngine;
import com.aspire.guidewire.bc.teststeps.BillingCenterFeatures.Delinquency;
import com.aspire.guidewire.bc.teststeps.BillingCenterFeatures.DirectBillPayment;
import com.aspire.guidewire.bc.teststeps.BillingCenterFeatures.Disbursment;
import com.aspire.guidewire.bc.teststeps.BillingCenterFeatures.PaymentRequest;
import com.aspire.guidewire.bc.teststeps.BillingCenterFeatures.PolicyNo;
import com.aspire.guidewire.bc.teststeps.BillingCenterFeatures.RunBatchProcess;
import com.aspire.guidewire.bc.teststeps.BillingCenterFeatures.SearchAccount;
import com.aspire.guidewire.bc.teststeps.BillingCenterFeatures.TroubleTicket;
import com.aspire.guidewire.bc.teststeps.BillingCenterFeatures.WriteOff;
import com.aspire.guidewire.bc.teststeps.BillingCenterFeatures.WriteOffReversal;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoSteps;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoStepsImpl;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.PolicyDetails;
import com.aspire.guidewire.bc.teststeps.BillingCenterSteps;
import com.aspire.guidewire.bc.teststeps.BillingCenterStepsImpl;
import com.aspire.guidewire.utils.DataProviderUtils;
import com.aspire.guidewire.utils.EnvironmentPropertiesReader;
import com.aspire.guidewire.utils.Log;
import com.aspire.guidewire.webdriverManager.DriverManager;


public class BC_InterfaceSuite  {
	
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
	 * @author somasundaram.muthu
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Make a New Payment Request in BC.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC1(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("Make a New Payment Request in BC.",driver);
        BillingCenterDataEngine testData = new BillingCenterDataEngine("BC_GWTestData_DataEngine.xlsx", "InterfaceSuite", "TC1");
	
		try {	

			BillingCenterStepsImpl bc = BillingCenterSteps.create();
			
			bc.loginIntoTheApplication("su", "gw");
			
			bc.searchAccount(SearchAccount.builder()
			.AccountNumber(testData.getAccountNumber()).build());
			
			bc.enterPaymentRequest(PaymentRequest.builder()
					.amount(testData.getAmount())
					.paymentMethod(testData.getPaymentMethod()).build());
			Log.testCaseResult(driver);

		} catch (Exception e) {
			Log.exception(e, DriverManager.getDriver());
		} finally {
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}
	
	/**
	 * @author somasundaram.muthu
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Make a Disbursement", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC220(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("Make a Disbursement",driver);
        BillingCenterDataEngine testData = new BillingCenterDataEngine("BC_GWTestData_DataEngine.xlsx", "InterfaceSuite", "TC220");
	
		try {	

			BillingCenterStepsImpl bc = BillingCenterSteps.create();
			
			bc.loginIntoTheApplication("su", "gw");
			
			bc.searchAccount(SearchAccount.builder()
			.AccountNumber(testData.getAccountNumber()).build());
			
			bc.enterNewDirectBillPayment(DirectBillPayment.builder()
					.amount(testData.getAmount())
					.paymentInstrument(testData.getPaymentMethod())
					.UnappliedFund(testData.getUnappliedFund()).build());
			
			bc.enterDisbursment(Disbursment.builder()
					.amount(testData.getDisbursementAmount())
					.date(testData.getPaymentDate())
					.reason(testData.getDisbursementReason()).build());
			Log.testCaseResult(driver);

		} catch (Exception e) {
			Log.exception(e, DriverManager.getDriver());
		} finally {
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}
	
	/**
	 * @author somasundaram.muthu
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Make a Write-Off Reversal", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC120(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("Make a Write-Off Reversal",driver);
        BillingCenterDataEngine testData = new BillingCenterDataEngine("BC_GWTestData_DataEngine.xlsx", "InterfaceSuite", "TC120");
	
		try {	

			BillingCenterStepsImpl bc = BillingCenterSteps.create();

			bc.loginIntoTheApplication("su", "gw");
			
			bc.searchAccount(SearchAccount.builder()
			.AccountNumber(testData.getAccountNumber()).build());
			
			bc.writeOff(WriteOff.builder()
					.chargePattern(testData.getChargePattern())
					.reason(testData.getWriteOffReason())
					.writeoffAmount(testData.getWriteOffAmount()).build());
			
			bc.writeOffReversal(WriteOffReversal.builder()
					.minimumAmount(testData.getMinimumAmount())
					.reason(testData.getWriteOffReason())
					.reasonWriteOffReversal(testData.getWriteOffReversalReason()).build());
			Log.testCaseResult(driver);

		} catch (Exception e) {
			Log.exception(e, DriverManager.getDriver());
		} finally {
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}
		
		/**
		 * @author somasundaram.muthu
		 * @param browser
		 * @throws Exception
		 */
		@Test(description="Create a New Trouble Ticket", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
		public void TC11(String browser) throws Exception {

			DriverManager.setDriver(browser);
			WebDriver driver = DriverManager.getDriver();
			Log.testCaseInfo("Create a New Trouble Ticket",driver);
	        BillingCenterDataEngine testData = new BillingCenterDataEngine("BC_GWTestData_DataEngine.xlsx", "InterfaceSuite", "TC11");
		
			try {	

				BillingCenterStepsImpl bc = BillingCenterSteps.create();

				bc.loginIntoTheApplication("su", "gw");
				
				bc.searchAccount(SearchAccount.builder()
				.AccountNumber(testData.getAccountNumber()).build());
				
				bc.enterNewDirectBillPayment(DirectBillPayment.builder()
						.amount(testData.getAmount())
						.paymentInstrument(testData.getPaymentMethod())
						.UnappliedFund(testData.getUnappliedFund()).build());
				
				bc.createTroubleTicket(TroubleTicket.builder()
						.troubleTicketType(testData.getTroubleTicketType())
						.troubleTicketSubject(testData.getTroubleTicketSubject())
						.troubleTicketDetails(testData.getTroubleTicketDetails())
						.troubleTicketPriority(testData.getTroubleTicketPriority())
						.troubleTicketRealeaseDate(testData.getTroubleTicketRealeseDate())
						.build());
				Log.testCaseResult(driver);

			} catch (Exception e) {
				Log.exception(e, DriverManager.getDriver());
			} finally {
				DriverManager.quitDriver(driver);
				Log.endTestCase();
			}
		}
		
		/**
		 * @author somasundaram.muthu
		 * @param browser
		 * @throws Exception
		 */
		@Test(description="Run a Batch Process - Invoice", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
		public void TC74(String browser) throws Exception {

			DriverManager.setDriver(browser);
			WebDriver driver = DriverManager.getDriver();
			Log.testCaseInfo("Run a Batch Process - Invoice",driver);
	        BillingCenterDataEngine testData = new BillingCenterDataEngine("BC_GWTestData_DataEngine.xlsx", "InterfaceSuite", "TC74");
		
			try {	
				
				BillingCenterStepsImpl bc = BillingCenterSteps.create();
				bc.loginIntoTheApplication("su", "gw");
				
				bc.runBatchProcessInfo(RunBatchProcess.builder()
						.BatchProcessName(testData.getBatchProcessName())
						.EffectiveDate(testData.getEffectiveDate())
						.build());
				Log.testCaseResult(driver);

			} catch (Exception e) {
				Log.exception(e, DriverManager.getDriver());
			} finally {
				DriverManager.quitDriver(driver);
				Log.endTestCase();
			}
		}
		
		/**
		 * @author somasundaram.muthu
		 * @param browser
		 * @throws Exception
		 */
		@Test(description="Start Past Due Deliquency", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
		public void TC40(String browser) throws Exception {

			DriverManager.setDriver(browser);
			WebDriver driver = DriverManager.getDriver();
			Log.testCaseInfo("Start Past Due Deliquency",driver);
	        BillingCenterDataEngine testData = new BillingCenterDataEngine("BC_GWTestData_DataEngine.xlsx", "InterfaceSuite", "TC40");
		
			try {	
				
				PersonalAutoStepsImpl pc = PersonalAutoSteps.create();

				pc.loginIntoTheApplication("su", "gw");

	            pc.searchPolicyNumber(PolicyDetails.builder()
	            		.policyNumber(testData.getPolicyNumber())
	            		.build());
	            
	            pc.copySubmissions();
				
	          String policyNo =  pc.getPolicyNumber();

				BillingCenterStepsImpl bc = BillingCenterSteps.create();
				
				bc.loginIntoTheApplication("su", "gw");
				
				bc.searchPolicy(PolicyNo.builder()
						.policyNo(policyNo)
						.build());
				
				bc.startDelinquency(Delinquency.builder()
						.reason(testData.getDelinquencyReason())
						.policyNo(policyNo)
						.build());
				Log.testCaseResult(driver);

			} catch (Exception e) {
				Log.exception(e, DriverManager.getDriver());
			} finally {
				DriverManager.quitDriver(driver);
				Log.endTestCase();
			}
		}
	
	}