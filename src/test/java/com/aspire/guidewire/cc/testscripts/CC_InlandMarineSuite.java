package com.aspire.guidewire.cc.testscripts;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aspire.guidewire.api.datagenerator.CCDataGenerator;
import com.aspire.guidewire.cc.teststeps.inlandmarine.DataFakers;
import com.aspire.guidewire.cc.teststeps.inlandmarine.InlandMarineConstants.AssignType;
import com.aspire.guidewire.cc.teststeps.inlandmarine.InlandMarineConstants.Coverages;
import com.aspire.guidewire.cc.teststeps.inlandmarine.InlandMarineConstants.DocumentType;
import com.aspire.guidewire.cc.teststeps.inlandmarine.InlandMarineConstants.PaymentType;
import com.aspire.guidewire.cc.teststeps.inlandmarine.InlandMarineDataEngine;
import com.aspire.guidewire.cc.teststeps.inlandmarine.InlandMarineFeatures.AssignClaim;
import com.aspire.guidewire.cc.teststeps.inlandmarine.InlandMarineFeatures.BasicInfo;
import com.aspire.guidewire.cc.teststeps.inlandmarine.InlandMarineFeatures.ChooseCoverages;
import com.aspire.guidewire.cc.teststeps.inlandmarine.InlandMarineFeatures.ChooseCoveragesByType;
import com.aspire.guidewire.cc.teststeps.inlandmarine.InlandMarineFeatures.ChooseDocumentsByType;
import com.aspire.guidewire.cc.teststeps.inlandmarine.InlandMarineFeatures.ClaimInfo;
import com.aspire.guidewire.cc.teststeps.inlandmarine.InlandMarineFeatures.CloseClaim;
import com.aspire.guidewire.cc.teststeps.inlandmarine.InlandMarineFeatures.ContactDetails;
import com.aspire.guidewire.cc.teststeps.inlandmarine.InlandMarineFeatures.Coverage;
import com.aspire.guidewire.cc.teststeps.inlandmarine.InlandMarineFeatures.CreateNote;
import com.aspire.guidewire.cc.teststeps.inlandmarine.InlandMarineFeatures.IndicateExistence;
import com.aspire.guidewire.cc.teststeps.inlandmarine.InlandMarineFeatures.PaymentOptions;
import com.aspire.guidewire.cc.teststeps.inlandmarine.InlandMarineFeatures.Policy_Level_Coverage;
import com.aspire.guidewire.cc.teststeps.inlandmarine.InlandMarineFeatures.Reserve;
import com.aspire.guidewire.cc.teststeps.inlandmarine.InlandMarineFeatures.SearchClaim;
import com.aspire.guidewire.cc.teststeps.inlandmarine.InlandMarineFeatures.Searchpolicy;
import com.aspire.guidewire.cc.teststeps.inlandmarine.InlandMarineFeatures.ServiceDetails;
import com.aspire.guidewire.cc.teststeps.inlandmarine.InlandMarineFeatures.Ul_Class_A;
import com.aspire.guidewire.cc.teststeps.inlandmarine.InlandMarineFeatures.WorkPlanDataUnavailability;
import com.aspire.guidewire.cc.teststeps.inlandmarine.InlandMarineSteps;
import com.aspire.guidewire.cc.teststeps.inlandmarine.InlandMarineStepsImpl;
import com.aspire.guidewire.utils.DataProviderUtils;
import com.aspire.guidewire.utils.EnvironmentPropertiesReader;
import com.aspire.guidewire.utils.Log;
import com.aspire.guidewire.webdriverManager.DriverManager;


public class CC_InlandMarineSuite  {

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
	 * Test Description: Verify whether user able to Create an inland marine policy with 6 month term type.
	 * Test ID: TC13
	 * @author anitha.raphel
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the Inland Marine claim creation", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC13(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the Inland Marine claim creation", driver);
		InlandMarineDataEngine testData = new InlandMarineDataEngine("CC_GWTestData_DataEngine.xlsx", "InlandMarine", "TC13");

		try {	

			InlandMarineStepsImpl cc = InlandMarineSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			cc.createClaim();

			String insuredName = cc.searchPolicy(Searchpolicy.builder()
					.policyNo(testData.getPolicyNumber())
					.lossDate(DataFakers.currentDate())
					.build());

			cc.enterBasicInformation(BasicInfo.builder()
					.insuredName(insuredName)
					.build());

			cc.addClaimInformation(ClaimInfo.builder()
					.lossCause(testData.getLossCause())
					.state(testData.getState())
					.city(testData.getCity())
					.faultRating(testData.getFaultRating())
					.build());

			cc.addServices();

			cc.saveAndAssignClaim();

			cc.viewClaim();

			Log.testCaseResult(driver);

		} catch (Exception e) {
			Log.exception(e, DriverManager.getDriver());
		} finally {
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}

	/**
	 * Test Description: To verify the exposure creation for Additionally Acquired Property coverage
	 * Test ID: TC25
	 * @author anitha.raphel
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the exposure creation for Additionally Acquired Property coverage", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC25(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the exposure creation for Additionally Acquired Property coverage", driver);
		InlandMarineDataEngine testData = new InlandMarineDataEngine("CC_GWTestData_DataEngine.xlsx", "InlandMarine", "TC25");

		try {	

			InlandMarineStepsImpl cc = InlandMarineSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			String insuredName = cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());
			
			cc.addCoveragesByType(ChooseCoveragesByType.builder(testData.getCoverageByType())
					.coverageByType(Coverage.builder()
							.claimant(insuredName)
							.claimantType(testData.getClaimantType())
							.damageDescription(testData.getDamageDescription())
							.build())
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
	 * Test Description: To verify the exposure creation for Rental Reimbursement coverage
	 * Test ID: TC26	
	 * @author anitha.raphel
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the exposure creation for Rental Reimbursement coverage", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC26(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the exposure creation for Rental Reimbursement coverage", driver);
		InlandMarineDataEngine testData = new InlandMarineDataEngine("CC_GWTestData_DataEngine.xlsx", "InlandMarine", "TC26");

		try {	

			InlandMarineStepsImpl cc = InlandMarineSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			String insuredName = cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());
			
			cc.addCoveragesByType(ChooseCoveragesByType.builder(testData.getCoverageByType())
					.coverageByType(Coverage.builder()
							.claimant(insuredName)
							.claimantType(testData.getClaimantType())
							.damageDescription(testData.getDamageDescription())
							.build())
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
	 * Test Description: To verify the exposure creation in Inland Marine claim for Rented Equipment coverage
	 * Test ID: TC46
	 * @author anitha.raphel
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the exposure creation in Inland Marine claim for Rented Equipment coverage", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC46(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the exposure creation in Inland Marine claim for Rented Equipment coverage", driver);
		InlandMarineDataEngine testData = new InlandMarineDataEngine("CC_GWTestData_DataEngine.xlsx", "InlandMarine", "TC46");

		try {	

			InlandMarineStepsImpl cc = InlandMarineSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.addCoverages(ChooseCoverages.builder(Coverages.POLICY_LEVEL_COVERAGES)
					.contactDetails(ContactDetails.builder()
							.firstName(testData.getFirstName())
							.lastName(testData.getLastName())
							.taxIdSSN(testData.getTaxId())
							.address(testData.getAddress())
							.city(testData.getCity())
							.state(testData.getState())
							.build())
					.policy_Level_Coverage(Policy_Level_Coverage.builder()
							.rented_Equipment(Coverage.builder()
									.claimantType(testData.getClaimantType())
									.damageDescription(testData.getDamageDescription())
									.build())
							.build())
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
	 * Test Description: To verify the reserves creation for Preservation Of Property exposure.
	 * Test ID: TC62
	 * @author anitha.raphel
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the reserves creation for Preservation Of Property exposure", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC62(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the reserves creation for Preservation Of Property exposure", driver);
		InlandMarineDataEngine testData = new InlandMarineDataEngine("CC_GWTestData_DataEngine.xlsx", "InlandMarine", "TC62");

		try {	

			InlandMarineStepsImpl cc = InlandMarineSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			String insuredName = cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.addCoveragesByType(ChooseCoveragesByType.builder(testData.getCoverageByType())
					.coverageByType(Coverage.builder()
							.claimant(insuredName)
							.claimantType(testData.getClaimantType())
							.damageDescription(testData.getDamageDescription())
							.build())
					.build());

			cc.createReserve(Reserve.builder()
					.costType(testData.getCostType())
					.reserveCostCategory(testData.getReserveCostCategory())
					.reserveAmount(testData.getAmount())
					.coverageByType(testData.getCoverageType())
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
	 * Test Description: To verify the reserves creation for Accounts Receivable exposure
	 * Test ID: TC63
	 * @author anitha.raphel
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the reserves creation for Accounts Receivable exposure", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC63(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the reserves creation for Accounts Receivable exposure", driver);
		InlandMarineDataEngine testData = new InlandMarineDataEngine("CC_GWTestData_DataEngine.xlsx", "InlandMarine", "TC63");

		try {	

			InlandMarineStepsImpl cc = InlandMarineSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.addCoverages(ChooseCoverages.builder(Coverages.UL_CLASS_A)
					.contactDetails(ContactDetails.builder()
							.firstName(testData.getFirstName())
							.lastName(testData.getLastName())
							.taxIdSSN(testData.getTaxId())
							.address(testData.getAddress())
							.city(testData.getCity())
							.state(testData.getState())
							.build())
					.ul_Class_A(Ul_Class_A.builder()
							.accounts_Receivable(Coverage.builder()
									.claimantType(testData.getClaimantType())
									.damageDescription(testData.getDamageDescription())
									.build())
							.build())
					.build());

			cc.createReserve(Reserve.builder()
					.costType(testData.getCostType())
					.reserveCostCategory(testData.getReserveCostCategory())
					.reserveAmount(testData.getAmount())
					.coverageByType(testData.getCoverageByType())
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
	 * Test Description: To verify that able to add a Roadside assistance , Salvage service for Inland Marine claim
	 * Test ID: TC77
	 * @author anitha.raphel
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify that able to add a Roadside assistance , Salvage service for Inland Marine claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC77(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to add a Roadside assistance , Salvage service for Inland Marine claim", driver);
		InlandMarineDataEngine testData = new InlandMarineDataEngine("CC_GWTestData_DataEngine.xlsx", "InlandMarine", "TC77");

		try {	

			InlandMarineStepsImpl cc = InlandMarineSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.addClaimService(ServiceDetails.builder()
					.service(testData.getService())
					.requestType(testData.getRequestType())
					.contactDetails(ContactDetails.builder()
							.firstName(DataFakers.firstName())
							.lastName(DataFakers.lastName())
							.taxIdSSN(testData.getTaxId())
							.address(DataFakers.addressLineOne())
							.city(testData.getCity())
							.state(testData.getState())
							.build())
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
	 * Test Description: To verify that able to create a Recovery for Inland Marine claim using Credit to expense
	 * Test ID: TC407
	 * @author anitha.raphel
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify that able to create a Recovery for Inland Marine claim using Credit to expense", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC407(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to create a Recovery for Inland Marine claim using Credit to expense", driver);
		InlandMarineDataEngine testData = new InlandMarineDataEngine("CC_GWTestData_DataEngine.xlsx", "InlandMarine", "TC407");

		try {	

			InlandMarineStepsImpl cc = InlandMarineSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			String insuredName = cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.paymentChecks(PaymentOptions.builder().payer(insuredName)
					.paymentType(PaymentType.RECOVERY)
					.reserveLine(testData.getReserveLine())
					.costType(testData.getCostType())
					.costCategory(testData.getCostCategory())
					.recoveryCategory(testData.getRecoveryCategory())
					.amount(testData.getAmount())
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
	 * Test Description: To verify that able to create a Recovery for Inland Marine claim using Subrogation
	 * Test ID: TC423
	 * @author anitha.raphel
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify that able to create a Recovery for Inland Marine claim using Subrogation", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC423(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to create a Recovery for Inland Marine claim using Subrogation", driver);
		InlandMarineDataEngine testData = new InlandMarineDataEngine("CC_GWTestData_DataEngine.xlsx", "InlandMarine", "TC423");

		try {	

			InlandMarineStepsImpl cc = InlandMarineSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			String insuredName = cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.paymentChecks(PaymentOptions.builder().payer(insuredName)
					.paymentType(PaymentType.RECOVERY)
					.reserveLine(testData.getReserveLine())
					.costType(testData.getCostType())
					.costCategory(testData.getCostCategory())
					.recoveryCategory(testData.getRecoveryCategory())
					.amount(testData.getAmount())
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
	 * Test Description: To verify the transfer check functionality for Inland Marine claim
	 * Test ID: TC85
	 * @author anitha.raphel
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the transfer check functionality for Inland Marine claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC85(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the transfer check functionality for Inland Marine claim", driver);
		InlandMarineDataEngine testData = new InlandMarineDataEngine("CC_GWTestData_DataEngine.xlsx", "InlandMarine", "TC85");

		try {	

			InlandMarineStepsImpl cc = InlandMarineSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			cc.createClaim();

			String insuredName = cc.searchPolicy(Searchpolicy.builder()
					.policyNo(testData.getPolicyNumber())
					.lossDate(DataFakers.currentDate())
					.build());

			cc.enterBasicInformation(BasicInfo.builder()
					.insuredName(insuredName)
					.build());

			cc.addClaimInformation(ClaimInfo.builder()
					.lossCause(testData.getLossCause())
					.state(testData.getState())
					.city(testData.getCity())
					.faultRating(testData.getFaultRating())
					.build());

			cc.addServices();

			String claimNumber = cc.saveAndAssignClaim();

			cc.viewClaim();

			cc.verifyWorkPlanDataUnavailability(WorkPlanDataUnavailability.builder()
					.dataMessage(testData.getDataMessage()).build());

			cc.createClaim();

			String insuredName2 = cc.searchPolicy(Searchpolicy.builder()
					.policyNo(testData.getPolicyNumber())
					.lossDate(DataFakers.currentDate())
					.build());

			cc.enterBasicInformation(BasicInfo.builder()
					.insuredName(insuredName2)
					.build());

			cc.addClaimInformation(ClaimInfo.builder()
					.lossCause(testData.getLossCause())
					.state(testData.getState())
					.city(testData.getCity())
					.faultRating(testData.getFaultRating())
					.build());

			cc.addServices();

			cc.saveAndAssignClaim();

			cc.viewClaim();

			cc.addCoveragesByType(ChooseCoveragesByType.builder(testData.getCoverageByType())
					.coverageByType(Coverage.builder()
							.claimant(insuredName2)
							.claimantType(testData.getClaimantType())
							.damageDescription(testData.getDamageDescription())
							.build())
					.build());

			cc.createReserve(Reserve.builder()
					.costType(testData.getCostType())
					.reserveCostCategory(testData.getReserveCostCategory())
					.reserveAmount(testData.getAmount())
					.coverageByType(testData.getCoverageType())
					.build());

			cc.paymentChecks(PaymentOptions.builder()
					.payer(insuredName2)
					.reserveLine(testData.getReserveLine())
					.paymentType(PaymentType.MANUAL_CHECK)
					.costType(testData.getCostType())
					.costCategory(testData.getReserveCostCategory())
					.payment(testData.getPaymentType())
					.amount(testData.getAmount())
					.build());

			cc.paymentChecks(PaymentOptions.builder()
					.claimNumber(claimNumber)
					.paymentType(PaymentType.TRANSFER_CHECK)
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
	 * Test Description: To verify the Note creation while creating a Inland Marine claim 
	 * Test ID: TC135
	 * @author anitha.raphel
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the Note creation while creating a Inland Marine claim ", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC135(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the Note creation while creating a Inland Marine claim ", driver);
		InlandMarineDataEngine testData = new InlandMarineDataEngine("CC_GWTestData_DataEngine.xlsx", "InlandMarine", "TC135");

		try {	

			InlandMarineStepsImpl cc = InlandMarineSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.createNote(CreateNote.builder()
					.text(testData.getNoteText()).build());

			Log.testCaseResult(driver);

		} catch (Exception e) {
			Log.exception(e, DriverManager.getDriver());
		} finally {
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}

	/**
	 * Test Description: To verify the document creation using Indicate existence of a Document in Inland Marine claim
	 * Test ID: TC150
	 * @author anitha.raphel
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the document creation using Indicate existence of a Document in Inland Marine claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC150(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the document creation using Indicate existence of a Document in Inland Marine claim", driver);
		InlandMarineDataEngine testData = new InlandMarineDataEngine("CC_GWTestData_DataEngine.xlsx", "InlandMarine", "TC150");

		try {	

			InlandMarineStepsImpl cc = InlandMarineSteps.create();

			cc.loginIntoTheApplication("su", "gw");

		    cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.newDocumentClaim(ChooseDocumentsByType.builder()
					.documentType(DocumentType.INDICATE_EXISTENCE)
					.indicateExistence(IndicateExistence.builder()
							.name(DataFakers.firstName())
							.documentType(testData.getDocumentType())
							.status(testData.getStatus())
							.build())
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
	 * Test Description: To verify the Assign functionality for Inland Marine claim
	 * Test ID: TC166
	 * @author anitha.raphel
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the Assign functionality for Inland Marine claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC166(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the Assign functionality for Inland Marine claim", driver);
		InlandMarineDataEngine testData = new InlandMarineDataEngine("CC_GWTestData_DataEngine.xlsx", "InlandMarine", "TC166");

		try {	

			InlandMarineStepsImpl cc = InlandMarineSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.assignClaim(AssignClaim.builder()
					.assignType(AssignType.SEARCH_BY_LOCATION)
					.location(DataFakers.country()).build());

			Log.testCaseResult(driver);

		} catch (Exception e) {
			Log.exception(e, DriverManager.getDriver());
		} finally {
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}

	/**
	 * Test Description: To verify the Assign functionality for Inland Marine claim by using Search by distance from a location
	 * Test ID: TC174
	 * @author anitha.raphel
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the Assign functionality for Inland Marine claim by using Search by distance from a location", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC174(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the Assign functionality for Inland Marine claim by using Search by distance from a location", driver);
		InlandMarineDataEngine testData = new InlandMarineDataEngine("CC_GWTestData_DataEngine.xlsx", "InlandMarine", "TC174");

		try {	

			InlandMarineStepsImpl cc = InlandMarineSteps.create();

			cc.loginIntoTheApplication("su", "gw");

		    cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.assignClaim(AssignClaim.builder()
					.assignType(AssignType.SEARCH_BY_DISTANCE_FROM_LOCATION)
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
	 * Test Description: To verify the Close Claim functionality for Inland Marine claim
	 * Test ID: TC185
	 * @author anitha.raphel
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the Close Claim functionality for Inland Marine claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC185(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the Close Claim functionality for Inland Marine claim", driver);
		InlandMarineDataEngine testData = new InlandMarineDataEngine("CC_GWTestData_DataEngine.xlsx", "InlandMarine", "TC185");

		try {
			//creating claim through API
			String claimNumber = CCDataGenerator.createClaimForInlandMarine(testData.getPolicyNumber());

			InlandMarineStepsImpl cc = InlandMarineSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			cc.searchClaim(SearchClaim.builder().claimNo(claimNumber).build());
			
			cc.closeClaim(CloseClaim.builder()
					.note(testData.getNoteText())
					.dataMessage(testData.getDataMessage())
					.outcome(testData.getOutcome())
					.closedStatus(testData.getClosedStatus())
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
	 * Test Description: To verify the check payment for Inland Marine claim
	 * Test ID: TC370
	 * @author anitha.raphel
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the check payment for Inland Marine claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC370(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the check payment for Inland Marine claim", driver);
		InlandMarineDataEngine testData = new InlandMarineDataEngine("CC_GWTestData_DataEngine.xlsx", "InlandMarine", "TC370");

		try {	

			InlandMarineStepsImpl cc = InlandMarineSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());
			
			cc.addCoverages(ChooseCoverages.builder(Coverages.UL_CLASS_A)
					.contactDetails(ContactDetails.builder()
							.firstName(testData.getFirstName())
							.lastName(testData.getLastName())
							.taxIdSSN(testData.getTaxId())
							.address(testData.getAddress())
							.city(testData.getCity())
							.state(testData.getState())
							.build())
					.ul_Class_A(Ul_Class_A.builder()
							.accounts_Receivable(Coverage.builder()
									.claimantType(testData.getClaimantType())
									.damageDescription(testData.getDamageDescription())
									.build())
							.build())
					.build());

			cc.createReserve(Reserve.builder()
					.costType(testData.getCostType())
					.reserveCostCategory(testData.getReserveCostCategory())
					.reserveAmount(testData.getAmount())
					.coverageByType(testData.getCoverageByType())
					.build());

			cc.paymentChecks(PaymentOptions.builder()
					.paymentType(PaymentType.MET_CHECK)
					.amount(testData.getAmount())
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
