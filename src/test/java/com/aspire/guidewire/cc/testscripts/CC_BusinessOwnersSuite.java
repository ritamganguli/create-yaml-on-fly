package com.aspire.guidewire.cc.testscripts;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aspire.guidewire.cc.teststeps.businessowners.BusinessOwnersConstants.AssignType;
import com.aspire.guidewire.cc.teststeps.businessowners.BusinessOwnersConstants.Coverages;
import com.aspire.guidewire.cc.teststeps.businessowners.BusinessOwnersConstants.DocumentType;
import com.aspire.guidewire.cc.teststeps.businessowners.BusinessOwnersConstants.PaymentType;
import com.aspire.guidewire.cc.teststeps.businessowners.BusinessOwnersFeatures.AssignClaim;
import com.aspire.guidewire.cc.teststeps.businessowners.BusinessOwnersFeatures.BasicInfo;
import com.aspire.guidewire.cc.teststeps.businessowners.BusinessOwnersFeatures.ChooseCoverages;
import com.aspire.guidewire.cc.teststeps.businessowners.BusinessOwnersFeatures.ChooseCoveragesByType;
import com.aspire.guidewire.cc.teststeps.businessowners.BusinessOwnersFeatures.ChooseDocumentsByType;
import com.aspire.guidewire.cc.teststeps.businessowners.BusinessOwnersFeatures.ClaimInfo;
import com.aspire.guidewire.cc.teststeps.businessowners.BusinessOwnersFeatures.ContactDetails;
import com.aspire.guidewire.cc.teststeps.businessowners.BusinessOwnersFeatures.Coverage;
import com.aspire.guidewire.cc.teststeps.businessowners.BusinessOwnersFeatures.CoverageType_A;
import com.aspire.guidewire.cc.teststeps.businessowners.BusinessOwnersFeatures.CoverageType_L;
import com.aspire.guidewire.cc.teststeps.businessowners.BusinessOwnersFeatures.CoverageType_M;
import com.aspire.guidewire.cc.teststeps.businessowners.BusinessOwnersFeatures.CreateNote;
import com.aspire.guidewire.cc.teststeps.businessowners.BusinessOwnersFeatures.ExposureDetails;
import com.aspire.guidewire.cc.teststeps.businessowners.BusinessOwnersFeatures.IndicateExistence;
import com.aspire.guidewire.cc.teststeps.businessowners.BusinessOwnersFeatures.Liability;
import com.aspire.guidewire.cc.teststeps.businessowners.BusinessOwnersFeatures.PaymentOptions;
import com.aspire.guidewire.cc.teststeps.businessowners.BusinessOwnersFeatures.Reserve;
import com.aspire.guidewire.cc.teststeps.businessowners.BusinessOwnersFeatures.Searchpolicy;
import com.aspire.guidewire.cc.teststeps.businessowners.BusinessOwnersFeatures.ServiceDetails;
import com.aspire.guidewire.cc.teststeps.businessowners.BusinessOwnersFeatures.SearchClaim;
import com.aspire.guidewire.cc.teststeps.businessowners.BusinessOwnersSteps;
import com.aspire.guidewire.cc.teststeps.businessowners.BusinessOwnersStepsImpl;
import com.aspire.guidewire.api.datagenerator.CCDataGenerator;
import com.aspire.guidewire.cc.teststeps.businessowners.BusinessOwnersDataEngine;
import com.aspire.guidewire.cc.teststeps.businessowners.DataFakers;
import com.aspire.guidewire.utils.DataProviderUtils;
import com.aspire.guidewire.utils.EnvironmentPropertiesReader;
import com.aspire.guidewire.utils.Log;
import com.aspire.guidewire.webdriverManager.DriverManager;


public class CC_BusinessOwnersSuite  {

	boolean LambdatestStatus = false;

	String ccWebSite, browser, contentGraphqlURL, browseAllContentGraphqlURL, sheetName;

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
	 * @author manikandan.manohar
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the Businessowners claim creation", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC14(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();

		Log.testCaseInfo("To verify the Businessowners claim creation",driver);
		BusinessOwnersDataEngine testData = new BusinessOwnersDataEngine("CC_GWTestData_DataEngine.xlsx", "Businessowners", "TC14");
		try {	

			BusinessOwnersStepsImpl cc = BusinessOwnersSteps.create();

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
					.build());

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
	 * @author manikandan.manohar
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the exposure creation for Money and Securities coverage", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC27(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();

		Log.testCaseInfo("To verify the exposure creation for Money and Securities coverage",driver);

		BusinessOwnersDataEngine testData = new BusinessOwnersDataEngine("CC_GWTestData_DataEngine.xlsx", "Businessowners", "TC27");
		try {	

			BusinessOwnersStepsImpl cc = BusinessOwnersSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			cc.createClaim();

			String insuredName = cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.addCoveragesByType(ChooseCoveragesByType.builder(Coverages.COVERAGE_M)
					.coverage_M(CoverageType_M.builder()
							.moneyAndSecurities(Coverage.builder()
									.claimant(insuredName)
									.claimantType(testData.getClaimantType())
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
	 * @author manikandan.manohar
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the exposure creation for Aggregate Limits of Inusrance - Projects coverage", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC34(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();

		Log.testCaseInfo("To verify the exposure creation for Aggregate Limits of Inusrance - Projects coverage",driver);

		BusinessOwnersDataEngine testData = new BusinessOwnersDataEngine("CC_GWTestData_DataEngine.xlsx", "Businessowners", "TC34");
		try {	

			BusinessOwnersStepsImpl cc = BusinessOwnersSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			cc.createClaim();

			String insuredName = cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.addCoveragesByType(ChooseCoveragesByType.builder(Coverages.COVERAGE_A)
					.coverage_A(CoverageType_A.builder()
							.aggregateLimitsOfInusrance(Coverage.builder()
									.claimant(insuredName)
									.claimantType(testData.getClaimantType())
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
	 * @author manikandan.manohar
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the Note creation after created a Businessowners claim ", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC138(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();

		Log.testCaseInfo("To verify the Note creation after created a Businessowners claim ",driver);

		BusinessOwnersDataEngine testData = new BusinessOwnersDataEngine("CC_GWTestData_DataEngine.xlsx", "Businessowners", "TC138");
		try {	

			BusinessOwnersStepsImpl cc = BusinessOwnersSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			cc.createClaim();

			cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.createNote(CreateNote.builder().text(testData.getText()).build());

			Log.testCaseResult(driver);

		} catch (Exception e) {
			Log.exception(e, DriverManager.getDriver());
		} finally {
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}

	/**
	 * @author manikandan.manohar
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the reserves creation for Liability - PD exposure", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC64(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();

		Log.testCaseInfo("To verify the reserves creation for Liability - PD exposure",driver);

		BusinessOwnersDataEngine testData = new BusinessOwnersDataEngine("CC_GWTestData_DataEngine.xlsx", "Businessowners", "TC64");
		try {	

			BusinessOwnersStepsImpl cc = BusinessOwnersSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			cc.createClaim();

			cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.addCoveragesByType(ChooseCoveragesByType.builder(Coverages.COVERAGE_L)
					.contactDetails(ContactDetails.builder()
							.firstName(testData.getFirstName())
							.lastName(testData.getLastName())
							.taxIdSSN(testData.getTaxIdSSN())
							.address(testData.getAddress())
							.city(testData.getCity())
							.state(testData.getState())
							.build())
					.coverage_L(CoverageType_L.builder()
							.Liability(Liability.builder().
									liability_PD(Coverage.builder()
											.claimantType(testData.getClaimantType())
											.build())
									.build())
							.build())
					.build());

			cc.createReserve(Reserve.builder().costType(testData.getCostType()).costCategory(testData.getReserveCostCategory()).newAvailableReserves(DataFakers.amount()).build());

			Log.testCaseResult(driver);

		} catch (Exception e) {
			Log.exception(e, DriverManager.getDriver());
		} finally {
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}

	/**
	 * @author manikandan.manohar
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the reserves creation for Special coverage packages exposure", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC65(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();

		Log.testCaseInfo("To verify the reserves creation for Special coverage packages exposure",driver);

		BusinessOwnersDataEngine testData = new BusinessOwnersDataEngine("CC_GWTestData_DataEngine.xlsx", "Businessowners", "TC65");
		try {	
           
			String claimNumber = CCDataGenerator.createClaimforBusinessOwners(testData.getPolicyNumber());
			
			BusinessOwnersStepsImpl cc = BusinessOwnersSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			cc.createClaim();

			cc.searchClaim(SearchClaim.builder().claimNo(claimNumber).build());

			cc.addCoverages(ChooseCoverages.builder(Coverages.SPECIAL_COVERAGES_PACKAGES)
					.contactDetails(ContactDetails.builder()
							.firstName(testData.getFirstName())
							.lastName(testData.getLastName())
							.taxIdSSN(testData.getTaxIdSSN())
							.address(testData.getAddress())
							.city(testData.getCity())
							.state(testData.getState())
							.build())
					.specialCoveragePackages(Coverage.builder()
							.claimantType(testData.getClaimantType())
							.build())
					.build());

			cc.createReserve(Reserve.builder().costType(testData.getCostType()).costCategory(testData.getReserveCostCategory()).newAvailableReserves(DataFakers.amount()).build());

			Log.testCaseResult(driver);

		} catch (Exception e) {
			Log.exception(e, DriverManager.getDriver());
		} finally {
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}

	/**
	 * @author manikandan.manohar
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the Assign functionality for Businessowners claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC167(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();

		Log.testCaseInfo("To verify the Assign functionality for Businessowners claim",driver);

		BusinessOwnersDataEngine testData = new BusinessOwnersDataEngine("CC_GWTestData_DataEngine.xlsx", "Businessowners", "TC167");
		try {	

			BusinessOwnersStepsImpl cc = BusinessOwnersSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			cc.createClaim();

			cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.assignClaim(AssignClaim.builder().assignType(AssignType.SEARCH_BY_LOCATION).location(DataFakers.country()).build());

			Log.testCaseResult(driver);

		} catch (Exception e) {
			Log.exception(e, DriverManager.getDriver());
		} finally {
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}

	/**
	 * @author manikandan.manohar
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify that able to create a Recovery for Businessowners claim using Credit to loss", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC411(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();

		Log.testCaseInfo("To verify that able to create a Recovery for Businessowners claim using Credit to loss",driver);

		BusinessOwnersDataEngine testData = new BusinessOwnersDataEngine("CC_GWTestData_DataEngine.xlsx", "Businessowners", "TC411");
		try {	

			BusinessOwnersStepsImpl cc = BusinessOwnersSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			cc.createClaim();

			String insuredName = cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.paymentChecks(PaymentOptions.builder()
					.payer(insuredName)
					.paymentType(PaymentType.RECOVERY)
					.reserveLine(testData.getReserveLine())
					.costType(testData.getCostType())
					.costCategory(testData.getCostCategory())
					.recoveryCategory(testData.getRecoveryCategory())
					.amount(DataFakers.amount())
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
	 * @author manikandan.manohar
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify that able to create a Recovery for Businessowners claim using Subrogation", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC424(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();

		Log.testCaseInfo("To verify that able to create a Recovery for Businessowners claim using Subrogation",driver);

		BusinessOwnersDataEngine testData = new BusinessOwnersDataEngine("CC_GWTestData_DataEngine.xlsx", "Businessowners", "TC424");
		try {	

			BusinessOwnersStepsImpl cc = BusinessOwnersSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			cc.createClaim();

			String insuredName = cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.paymentChecks(PaymentOptions.builder()
					.payer(insuredName)
					.paymentType(PaymentType.RECOVERY)
					.reserveLine(testData.getReserveLine())
					.costType(testData.getCostType())
					.costCategory(testData.getCostCategory())
					.recoveryCategory(testData.getRecoveryCategory())
					.amount(DataFakers.amount())
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
	 * @author manikandan.manohar
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify that able to add a Kitchen appliances service for Businessowners claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC78(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();

		Log.testCaseInfo("To verify that able to add a Kitchen appliances service for Businessowners claim",driver);

		BusinessOwnersDataEngine testData = new BusinessOwnersDataEngine("CC_GWTestData_DataEngine.xlsx", "Businessowners", "TC78");
		try {	

			BusinessOwnersStepsImpl cc = BusinessOwnersSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			cc.createClaim();

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
							.state(DataFakers.state())
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
	 * @author manikandan.manohar
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the manual check payment for Businessowners claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC374(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();

		Log.testCaseInfo("To verify the manual check payment for Businessowners claim",driver);

		BusinessOwnersDataEngine testData = new BusinessOwnersDataEngine("CC_GWTestData_DataEngine.xlsx", "Businessowners", "TC374");
		
		String firstName = testData.getFirstName();
		String lastName = testData.getLastName();
		String payerName = firstName +" "+lastName;
		try {	

			BusinessOwnersStepsImpl cc = BusinessOwnersSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			cc.createClaim();

			cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.addCoverages(ChooseCoverages.builder(Coverages.SPECIAL_COVERAGES_PACKAGES)
					.contactDetails(ContactDetails.builder()
							.firstName(firstName)
							.lastName(lastName)
							.taxIdSSN(testData.getTaxIdSSN())
							.address(testData.getAddress())
							.city(testData.getCity())
							.state(testData.getState())
							.build())
					.specialCoveragePackages(Coverage.builder()
							.claimantType(testData.getClaimantType())
							.build())
					.build());

			cc.createReserve(Reserve.builder().costType(testData.getCostType()).costCategory(testData.getReserveCostCategory()).newAvailableReserves(DataFakers.amount()).build());

			cc.paymentChecks(PaymentOptions.builder()
					.payer(payerName)
					.paymentType(PaymentType.MANUAL_CHECK)
					.costType(testData.getCostType())
					.costCategory(testData.getCostCategory())
					.payment(testData.getPaymentType())
					.amount(DataFakers.amount())
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
	 * @author manikandan.manohar
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the document creation using Indicate existence of a Document in Businessowners claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC151(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();

		Log.testCaseInfo("To verify the document creation using Indicate existence of a Document in Businessowners claim",driver);

		BusinessOwnersDataEngine testData = new BusinessOwnersDataEngine("CC_GWTestData_DataEngine.xlsx", "Businessowners", "TC151");
		try {	

			BusinessOwnersStepsImpl cc = BusinessOwnersSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			cc.createClaim();

			cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.addCoverages(ChooseCoverages.builder(Coverages.SPECIAL_COVERAGES_PACKAGES)
					.contactDetails(ContactDetails.builder()
							.firstName(testData.getFirstName())
							.lastName(testData.getLastName())
							.taxIdSSN(testData.getTaxIdSSN())
							.address(testData.getAddress())
							.city(testData.getCity())
							.state(testData.getState())
							.build())
					.specialCoveragePackages(Coverage.builder()
							.claimantType(testData.getClaimantType())
							.build())
					.build());

			cc.createReserve(Reserve.builder().costType(testData.getCostType()).costCategory(testData.getReserveCostCategory()).newAvailableReserves(DataFakers.amount()).build());

			cc.addNewDocumentClaim(ChooseDocumentsByType.builder()
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
	 * @author manikandan.manohar
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the document creation using Indicate existence of a Document while creating a Businessowners claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider",threadPoolSize = 3)
	public void TC163(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();

		Log.testCaseInfo("To verify the document creation using Indicate existence of a Document in Businessowners claim",driver);

		BusinessOwnersDataEngine testData = new BusinessOwnersDataEngine("CC_GWTestData_DataEngine.xlsx", "Businessowners", "TC163");
		try {	

			BusinessOwnersStepsImpl cc = BusinessOwnersSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			cc.createClaim();

			cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.addNewDocumentClaim(ChooseDocumentsByType.builder()
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
	 * @author manikandan.manohar
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the Reopen Claim functionality for Businessowners claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC190(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();

		Log.testCaseInfo("To verify the Reopen Claim functionality for Businessowners claim",driver);

		BusinessOwnersDataEngine testData = new BusinessOwnersDataEngine("CC_GWTestData_DataEngine.xlsx", "Businessowners", "TC190");
		try {	

			BusinessOwnersStepsImpl cc = BusinessOwnersSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			cc.createClaim();

			cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.addCoverages(ChooseCoverages.builder(Coverages.SPECIAL_COVERAGES_PACKAGES)
					.contactDetails(ContactDetails.builder()
							.firstName(testData.getFirstName())
							.lastName(testData.getLastName())
							.taxIdSSN(testData.getTaxIdSSN())
							.address(testData.getAddress())
							.city(testData.getCity())
							.state(testData.getState())
							.build())
					.specialCoveragePackages(Coverage.builder()
							.claimantType(testData.getClaimantType())
							.build())
					.build());

			cc.createReserve(Reserve.builder().costType(testData.getCostType()).costCategory(testData.getReserveCostCategory()).newAvailableReserves(DataFakers.amount()).build());

			cc.updateExposure(ExposureDetails.builder()
					.note(DataFakers.generateRandomLetters())
					.outcome(testData.getOutcome())
					.exposureValue(testData.getClosedStatus())
					.note(DataFakers.generateRandomLetters())
					.reason(testData.getReason())
					.typeValue(testData.getOpenStatus())
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
	 * @author manikandan.manohar
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the transfer check functionality for Businessowners claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC86(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();

		Log.testCaseInfo("To verify the transfer check functionality for Businessowners claim",driver);

		BusinessOwnersDataEngine testData = new BusinessOwnersDataEngine("CC_GWTestData_DataEngine.xlsx", "Businessowners", "TC86");
		
		String firstName = testData.getFirstName();
		String lastName = testData.getLastName();
		String payerName = firstName +" "+lastName;
		
		try {	

			String claimNumber = CCDataGenerator.createClaimforBusinessOwners(testData.getPolicyNumber());

			BusinessOwnersStepsImpl cc = BusinessOwnersSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			cc.searchClaim(SearchClaim.builder().claimNo(claimNumber).build());

			cc.addCoverages(ChooseCoverages.builder(Coverages.SPECIAL_COVERAGES_PACKAGES)
					.contactDetails(ContactDetails.builder()
							.firstName(firstName)
							.lastName(lastName)
							.taxIdSSN(testData.getTaxIdSSN())
							.address(testData.getAddress())
							.city(testData.getCity())
							.state(testData.getState())
							.build())
					.specialCoveragePackages(Coverage.builder()
							.claimantType(testData.getClaimantType())
							.build())
					.build());

			cc.createReserve(Reserve.builder().costType(testData.getCostType())
					.costCategory(testData.getReserveCostCategory())
					.newAvailableReserves(DataFakers.amount())
					.build());

			cc.paymentChecks(PaymentOptions.builder()
					.payer(payerName)
					.paymentType(PaymentType.MANUAL_CHECK)
					.costType(testData.getCostType())
					.costCategory(testData.getCostCategory())
					.payment(testData.getPaymentType())
					.amount(DataFakers.amount())
					.build());

			cc.paymentChecks(PaymentOptions.builder()
					.claimNumber(testData.getClaimNumber())
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

}