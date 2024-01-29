package com.aspire.guidewire.cc.testscripts;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aspire.guidewire.api.datagenerator.CCDataGenerator;
import com.aspire.guidewire.cc.teststeps.workerscompensation.DataFakers;
import com.aspire.guidewire.cc.teststeps.workerscompensation.WorkersCompensationConstants.AssignType;
import com.aspire.guidewire.cc.teststeps.workerscompensation.WorkersCompensationConstants.ExposureType;
import com.aspire.guidewire.cc.teststeps.workerscompensation.WorkersCompensationConstants.PaymentType;
import com.aspire.guidewire.cc.teststeps.workerscompensation.WorkersCompensationFeatures.AssignClaim;
import com.aspire.guidewire.cc.teststeps.workerscompensation.WorkersCompensationFeatures.BasicInfo;
import com.aspire.guidewire.cc.teststeps.workerscompensation.WorkersCompensationFeatures.ClaimInfo;
import com.aspire.guidewire.cc.teststeps.workerscompensation.WorkersCompensationFeatures.ClaimStatus;
import com.aspire.guidewire.cc.teststeps.workerscompensation.WorkersCompensationFeatures.CloseClaim;
import com.aspire.guidewire.cc.teststeps.workerscompensation.WorkersCompensationFeatures.CloseExposure;
import com.aspire.guidewire.cc.teststeps.workerscompensation.WorkersCompensationFeatures.ContactDetails;
import com.aspire.guidewire.cc.teststeps.workerscompensation.WorkersCompensationFeatures.EmailDetails;
import com.aspire.guidewire.cc.teststeps.workerscompensation.WorkersCompensationFeatures.Exposure;
import com.aspire.guidewire.cc.teststeps.workerscompensation.WorkersCompensationFeatures.LossDetails;
import com.aspire.guidewire.cc.teststeps.workerscompensation.WorkersCompensationFeatures.PaymentOptions;
import com.aspire.guidewire.cc.teststeps.workerscompensation.WorkersCompensationFeatures.Reserve;
import com.aspire.guidewire.cc.teststeps.workerscompensation.WorkersCompensationFeatures.SearchClaim;
import com.aspire.guidewire.cc.teststeps.workerscompensation.WorkersCompensationFeatures.Searchpolicy;
import com.aspire.guidewire.cc.teststeps.workerscompensation.WorkersCompensationFeatures.ServiceDetails;
import com.aspire.guidewire.cc.teststeps.workerscompensation.WorkersCompensationDataEngine;
import com.aspire.guidewire.cc.teststeps.workerscompensation.WorkersCompensationSteps;
import com.aspire.guidewire.cc.teststeps.workerscompensation.WorkersCompensationStepsImpl;
import com.aspire.guidewire.utils.DataProviderUtils;
import com.aspire.guidewire.utils.EnvironmentPropertiesReader;
import com.aspire.guidewire.utils.Log;
import com.aspire.guidewire.webdriverManager.DriverManager;


public class CC_WorkersCompensationSuite  {

	boolean LambdatestStatus = false;

	String ccWebSite, browser, contentGraphqlURL, browseAllContentGraphqlURL, sheetName, policyNumber;

	private static EnvironmentPropertiesReader configProperty = EnvironmentPropertiesReader.getInstance();

	@BeforeTest(alwaysRun = true)
	public void init(ITestContext context) {

		ccWebSite = (System.getProperty("ccWebSite") != null ? System.getProperty("ccWebSite"): context.getCurrentXmlTest().getParameter("ccWebSite"));
		DriverManager.setCCWebsite(ccWebSite);

		if(configProperty.hasProperty("runLambdaTestFromLocal") && configProperty.getProperty("runLambdaTestFromLocal").trim().equalsIgnoreCase("true")){
			LambdatestStatus = true;
		}

	}

	/**
	 * @author vignesh.ravi
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the Workers' Compensation claim creation", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC17(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the auto claim creation",driver);

		WorkersCompensationDataEngine testData = new WorkersCompensationDataEngine("CC_GWTestData_DataEngine.xlsx", "WorkersCompenstaion", "TC17");

		try {	

			WorkersCompensationStepsImpl cc = WorkersCompensationSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			cc.createClaim();

			String insuredName = cc.searchPolicy(Searchpolicy.builder()
					.policyNo(testData.getPolicyNumber())
					.lossDate(testData.getLossDate())
					.build());
			cc.enterBasicInformation(BasicInfo.builder()
					.reportedByName(insuredName)
					.injuredWorkerName(insuredName)
					.build());

			cc.addClaimInformation(ClaimInfo.builder()
					.dateEmployerNotified(testData.getDateEmployerNotified())
					.injurySource(testData.getInjurySource())
					.radioButtonOptions(testData.getRadioButtonOptions())
					.build());

			cc.saveAndAssignClaim();

			cc.viewClaim();


			Log.testCaseResult(driver);
		} catch (Exception e) {
			Log.exception(e, DriverManager.getDriver());
		} finally {
			DriverManager.quitDriver();
			Log.endTestCase();
		}
	}
	/**
	 * @author vignesh.ravi
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the Assign functionality for Workers' Compensation claim by using Search by location", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC170(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the Assign functionality for Workers' Compensation claim by using Search by location",driver);

		WorkersCompensationDataEngine testData = new WorkersCompensationDataEngine("CC_GWTestData_DataEngine.xlsx", "WorkersCompenstaion", "TC170");

		try {	

			WorkersCompensationStepsImpl cc = WorkersCompensationSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.assignClaim(AssignClaim.builder()
					.assignType(AssignType.SEARCH_BY_LOCATION)
					.country(testData.getCountry())
					.build());

			Log.testCaseResult(driver);
		} catch (Exception e) {
			Log.exception(e, DriverManager.getDriver());
		} finally {
			DriverManager.quitDriver();
			Log.endTestCase();
		}
	}
	/**
	 * @author vignesh.ravi
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the Workers' Compensation claim creation with incident only enabled", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC92(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the Workers' Compensation claim creation with incident only enabled",driver);

		WorkersCompensationDataEngine testData = new WorkersCompensationDataEngine("CC_GWTestData_DataEngine.xlsx", "WorkersCompenstaion", "TC92");

		try {	

			WorkersCompensationStepsImpl cc = WorkersCompensationSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			cc.createClaim();

			String insuredName = cc.searchPolicy(Searchpolicy.builder()
					.policyNo(testData.getPolicyNumber())
					.lossDate(testData.getLossDate())
					.build());

			cc.enterBasicInformation(BasicInfo.builder()
					.reportedByName(insuredName)
					.injuredWorkerName(insuredName)
					.build());

			cc.addClaimInformation(ClaimInfo.builder()
					.incidentOnly(true)
					.dateEmployerNotified(testData.getDateEmployerNotified())
					.injurySource(testData.getInjurySource())
					.radioButtonOptions(testData.getRadioButtonOptions())
					.build());

			cc.saveAndAssignClaim();

			cc.viewClaim();

			Log.testCaseResult(driver);
		} catch (Exception e) {
			Log.exception(e, DriverManager.getDriver());
		} finally {
			DriverManager.quitDriver();
			Log.endTestCase();
		}
	}
	/**
	 * @author vignesh.ravi
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the reserves creation for Medical details exposure", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC72(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the reserves creation for Medical details exposure",driver);

		WorkersCompensationDataEngine testData = new WorkersCompensationDataEngine("CC_GWTestData_DataEngine.xlsx", "WorkersCompenstaion", "TC72");

		try {	
			
			String claimNumber = CCDataGenerator.createClaimForWorkersCompensation(testData.getPolicyNumber());

			WorkersCompensationStepsImpl cc = WorkersCompensationSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			cc.searchClaim(SearchClaim.builder().claimNo(claimNumber).build());

			cc.createReserve(Exposure.builder().exposure(ExposureType.MEDICAL_DETAILS)
					.reserve(Reserve.builder().costType(testData.getCostType())
							.costCategory(testData.getCostCategory())
							.newAvailableReserves(DataFakers.amount())
							.build())
					.build());

			Log.testCaseResult(driver);
		} catch (Exception e) {
			Log.exception(e, DriverManager.getDriver());
		} finally {
			DriverManager.quitDriver();
			Log.endTestCase();
		}
	}
	/**
	 * @author vignesh.ravi
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the Workers' Compensation claim creation with Injury / Illness Result in Death? - enabled", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC94(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the Workers' Compensation claim creation with Injury / Illness Result in Death? - enabled",driver);

		WorkersCompensationDataEngine testData = new WorkersCompensationDataEngine("CC_GWTestData_DataEngine.xlsx", "WorkersCompenstaion", "TC94");

		try {	

			WorkersCompensationStepsImpl cc = WorkersCompensationSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			cc.createClaim();

			String insuredName = cc.searchPolicy(Searchpolicy.builder()
					.policyNo(testData.getPolicyNumber())
					.lossDate(testData.getLossDate())
					.build());

			cc.enterBasicInformation(BasicInfo.builder()
					.reportedByName(insuredName)
					.injuredWorkerName(insuredName)
					.build());

			cc.addClaimInformation(ClaimInfo.builder()
					.dateEmployerNotified(testData.getDateEmployerNotified())
					.injurySource(testData.getInjurySource())
					.radioButtonOptions(testData.getRadioButtonOptions())
					.build());

			cc.saveAndAssignClaim();

			cc.viewClaim();

			Log.testCaseResult(driver);
		} catch (Exception e) {
			Log.exception(e, DriverManager.getDriver());
		} finally {
			DriverManager.quitDriver();
			Log.endTestCase();
		}
	}
	/**
	 * @author vignesh.ravi
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the exposure creation for Medical details coverage", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC56(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the exposure creation for Medical details coverage",driver);

		WorkersCompensationDataEngine testData = new WorkersCompensationDataEngine("CC_GWTestData_DataEngine.xlsx", "WorkersCompenstaion", "TC56");

		try {	

			WorkersCompensationStepsImpl cc = WorkersCompensationSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.verifyExposure(Exposure.builder().exposure(ExposureType.MEDICAL_DETAILS)
					.name(testData.getName()).
					build());

			Log.testCaseResult(driver);
		} catch (Exception e) {
			Log.exception(e, DriverManager.getDriver());
		} finally {
			DriverManager.quitDriver();
			Log.endTestCase();
		}
	}
	/**
	 * @author vignesh.ravi
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the exposure creation for Indemnity coverage", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC57(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the exposure creation for Indemnity coverage",driver);

		WorkersCompensationDataEngine testData = new WorkersCompensationDataEngine("CC_GWTestData_DataEngine.xlsx", "WorkersCompenstaion", "TC57");

		try {	

			WorkersCompensationStepsImpl cc = WorkersCompensationSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.verifyExposure(Exposure.builder().exposure(ExposureType.INDEMNITY)
					.name(testData.getName()).
					build());

			Log.testCaseResult(driver);
		} catch (Exception e) {
			Log.exception(e, DriverManager.getDriver());
		} finally {
			DriverManager.quitDriver();
			Log.endTestCase();
		}
	}
	/**
	 * @author vignesh.ravi
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the reserves creation for Indemnity exposure", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC73(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the reserves creation for Indemnity exposure",driver);

		WorkersCompensationDataEngine testData = new WorkersCompensationDataEngine("CC_GWTestData_DataEngine.xlsx", "WorkersCompenstaion", "TC73");

		try {	
			
			String claimNumber = CCDataGenerator.createClaimForWorkersCompensation(testData.getPolicyNumber());

			WorkersCompensationStepsImpl cc = WorkersCompensationSteps.create();

			cc.loginIntoTheApplication("su", "gw");
			
			cc.searchClaim(SearchClaim.builder().claimNo(claimNumber).build());

			cc.createReserve(Exposure.builder().exposure(ExposureType.INDEMNITY)
					.reserve(Reserve.builder().costType(testData.getCostType())
							.costCategory(testData.getCostCategory())
							.newAvailableReserves(DataFakers.amount())
							.build())
					.build());
			
			Log.testCaseResult(driver);
		} catch (Exception e) {
			Log.exception(e, DriverManager.getDriver());
		} finally {
			DriverManager.quitDriver();
			Log.endTestCase();
		}
	}
	/**
	 * @author vignesh.ravi
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify exposure and reserve creation for Workers' Compensation claim with incident only enabled", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC93(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify exposure and reserve creation for Workers' Compensation claim with incident only enabled",driver);

		WorkersCompensationDataEngine testData = new WorkersCompensationDataEngine("CC_GWTestData_DataEngine.xlsx", "WorkersCompenstaion", "TC93");

		try {	
			
			String claimNumber = CCDataGenerator.createClaimForWorkersCompensation(testData.getPolicyNumber());

			WorkersCompensationStepsImpl cc = WorkersCompensationSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			cc.searchClaim(SearchClaim.builder().claimNo(claimNumber).build());

			cc.createReserve(Exposure.builder().exposure(ExposureType.INDEMNITY)
					.reserve(Reserve.builder().costType(testData.getCostType())
							.costCategory(testData.getCostCategory())
							.newAvailableReserves(DataFakers.amount())
							.build())
					.build());
			
			Log.testCaseResult(driver);
		} catch (Exception e) {
			Log.exception(e, DriverManager.getDriver());
		} finally {
			DriverManager.quitDriver();
			Log.endTestCase();
		}
	}
	/**
	 * @author vignesh.ravi
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify that able to create a Recovery for Workers' Compensation claim using Deductible", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC415(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to create a Recovery for Workers' Compensation claim using Deductible",driver);

		WorkersCompensationDataEngine testData = new WorkersCompensationDataEngine("CC_GWTestData_DataEngine.xlsx", "WorkersCompenstaion", "TC415");

		try {	

			WorkersCompensationStepsImpl cc = WorkersCompensationSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			String insuredName = cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.paymentChecks(PaymentOptions.builder() .payer(insuredName)
					.paymentType(PaymentType.RECOVERY)
					.reserveLine(testData.getReserveLine())
					.costType(testData.getCostType()) 
					.costCategory(testData.getCostCategory())
					.recoveryCategory(testData.getRecoveryCategory())
					.amount(testData.getAmount())
					.recoveryCategory(testData.getRecoveryCategory())
					.build());

			Log.testCaseResult(driver);
		} catch (Exception e) {
			Log.exception(e, DriverManager.getDriver());
		} finally {
			DriverManager.quitDriver();
			Log.endTestCase();
		}
	}
	/**
	 * @author vignesh.ravi
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify that able to create a Recovery for Workers' Compensation claim using Unspecified recovery category ", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC428(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to create a Recovery for Workers' Compensation claim using Unspecified recovery category ",driver);

		WorkersCompensationDataEngine testData = new WorkersCompensationDataEngine("CC_GWTestData_DataEngine.xlsx", "WorkersCompenstaion", "TC428");

		try {	

			WorkersCompensationStepsImpl cc = WorkersCompensationSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			String insuredName =cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.paymentChecks(PaymentOptions.builder() .payer(insuredName)
					.paymentType(PaymentType.RECOVERY)
					.reserveLine(testData.getReserveLine())
					.costType(testData.getCostType()) 
					.costCategory(testData.getCostCategory())
					.recoveryCategory(testData.getRecoveryCategory())
					.amount(testData.getAmount())
					.recoveryCategory(testData.getRecoveryCategory())
					.build());

			Log.testCaseResult(driver);
		} catch (Exception e) {
			Log.exception(e, DriverManager.getDriver());
		} finally {
			DriverManager.quitDriver();
			Log.endTestCase();
		}
	}
	/**
	 * @author vignesh.ravi
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the Email creation for Workers' Compensation claim ", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC195(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the Email creation for Workers' Compensation claim ",driver);

		WorkersCompensationDataEngine testData = new WorkersCompensationDataEngine("CC_GWTestData_DataEngine.xlsx", "WorkersCompenstaion", "TC415");

		try {	

			WorkersCompensationStepsImpl cc = WorkersCompensationSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.emailClaim(EmailDetails.builder()
					.emailAdress(testData.getGenerateEmail())
					.subject(testData.getGenerateRandomLetters())
					.body(testData.getGenerateRandomLetters())
					.build());

			Log.testCaseResult(driver);
		} catch (Exception e) {
			Log.exception(e, DriverManager.getDriver());
		} finally {
			DriverManager.quitDriver();
			Log.endTestCase();
		}
	}
	/**
	 * @author vignesh.ravi
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify that able to add aInspection / Repair service for Workers Compensation claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC81(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to add aInspection / Repair service for Workers Compensation claim",driver);

		WorkersCompensationDataEngine testData = new WorkersCompensationDataEngine("CC_GWTestData_DataEngine.xlsx", "WorkersCompenstaion", "TC81");

		try {	

			WorkersCompensationStepsImpl cc = WorkersCompensationSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.addClaimService(ServiceDetails.builder()
					.service(testData.getService())
					.requestType(testData.getRequestType())
					.contactDetails(ContactDetails.builder()
							.firstName(DataFakers.firstName())
							.lastName(DataFakers.lastName())
							.taxIdSSN(DataFakers.taxID())
							.address(DataFakers.addressLineOne())
							.city(DataFakers.city())
							.state(testData.getState())
							.build())
					.build());
			
			Log.testCaseResult(driver);
		} catch (Exception e) {
			Log.exception(e, DriverManager.getDriver());
		} finally {
			DriverManager.quitDriver();
			Log.endTestCase();
		}
	}
	/**
	 * @author vignesh.ravi
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the transfer check functionality for Workers' Compensation claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC90(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the transfer check functionality for Workers' Compensation claim",driver);

		WorkersCompensationDataEngine testData = new WorkersCompensationDataEngine("CC_GWTestData_DataEngine.xlsx", "WorkersCompenstaion", "TC90");

		try {	
			
			String claimNumber = CCDataGenerator.createClaimForWorkersCompensation(testData.getPolicyNumber());
			
			WorkersCompensationStepsImpl cc = WorkersCompensationSteps.create();

			cc.loginIntoTheApplication("su", "gw");
			
			String insuredName = cc.searchClaim(SearchClaim.builder().claimNo(claimNumber).build());

			cc.createReserve(Exposure.builder().exposure(ExposureType.MEDICAL_DETAILS)
					.reserve(Reserve.builder().costType(testData.getCostType())
							.costCategory(testData.getCostCategory())
							.newAvailableReserves(DataFakers.amount())
							.build())
					.build());

			cc.paymentChecks(PaymentOptions.builder()
					.payer(insuredName)
					.reserveLine(testData.getReserveLine())
					.paymentType(PaymentType.MANUAL_CHECK)
					.payment(testData.getPaymentType())
					.amount(testData.getAmount())
					.build());

			cc.paymentChecks(PaymentOptions.builder()
					.claimNumber(testData.getClaimNumber())
					.paymentType(PaymentType.TRANSFER_CHECK)
					.build());


			Log.testCaseResult(driver);
		} catch (Exception e) {
			Log.exception(e, DriverManager.getDriver());
		} finally {
			DriverManager.quitDriver();
			Log.endTestCase();
		}
	}

	/**
	 * @author vignesh.ravi
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the Close Claim functionality for Workers' Compensation claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC187(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the Close Claim functionality for Workers' Compensation claim",driver);

		WorkersCompensationDataEngine testData = new WorkersCompensationDataEngine("CC_GWTestData_DataEngine.xlsx", "WorkersCompenstaion", "TC187");

		try {	

			String claimNumber = CCDataGenerator.createClaimForWorkersCompensation(testData.getPolicyNumber());
			
			WorkersCompensationStepsImpl cc = WorkersCompensationSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			cc.searchClaim(SearchClaim.builder().claimNo(claimNumber).build());

			cc.updateLossDetails(LossDetails.builder()
					.InjuryDuringEmploymentRadioButton(true)
					.PerformingRegularJobRadioButton(true)
					.EmployerQuestionsClaimRadioButton(true)
					.SafetyEquipmentProvidedRadioButton(true)
					.SafetyEquipmentUsedRadioButton(true)
					.DrugsInvolvedRadioButton(true)
					.compensability(testData.getCompensability())
					.build());
			cc.completeWorkplan();

			cc.closeExistingExposure(CloseExposure.builder()
					.note(testData.getGenerateRandomLetters())
					.outcome(testData.getOutcome())
					.build());

			cc.closeClaim(CloseClaim.builder()
					.note(testData.getGenerateRandomLetters())
					.outcome(testData.getOutcome())
					.build());
			cc.verifyClaimStatus(ClaimStatus.builder()
					.claimStatus(testData.getClaimStatus())
					.build());

			Log.testCaseResult(driver);
		} catch (Exception e) {
			Log.exception(e, DriverManager.getDriver());
		} finally {
			DriverManager.quitDriver();
			Log.endTestCase();
		}
	}

}