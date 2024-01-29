package com.aspire.guidewire.cc.testscripts;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aspire.guidewire.api.datagenerator.CCDataGenerator;
import com.aspire.guidewire.cc.teststeps.commercialpackage.CommercialPackageConstants.AssignType;
import com.aspire.guidewire.cc.teststeps.commercialpackage.CommercialPackageConstants.ByCoverages;
import com.aspire.guidewire.cc.teststeps.commercialpackage.CommercialPackageConstants.Coverages;
import com.aspire.guidewire.cc.teststeps.commercialpackage.CommercialPackageConstants.DocumentType;
import com.aspire.guidewire.cc.teststeps.commercialpackage.CommercialPackageConstants.PaymentType;
import com.aspire.guidewire.cc.teststeps.commercialpackage.CommercialPackageDataEngine;
import com.aspire.guidewire.cc.teststeps.commercialpackage.CommercialPackageFeatures.AssignClaim;
import com.aspire.guidewire.cc.teststeps.commercialpackage.CommercialPackageFeatures.BasicInfo;
import com.aspire.guidewire.cc.teststeps.commercialpackage.CommercialPackageFeatures.By_Coverage_Type_E;
import com.aspire.guidewire.cc.teststeps.commercialpackage.CommercialPackageFeatures.By_Coverage_Type_L;
import com.aspire.guidewire.cc.teststeps.commercialpackage.CommercialPackageFeatures.By_Coverage_Type_U;
import com.aspire.guidewire.cc.teststeps.commercialpackage.CommercialPackageFeatures.ChooseCoverages;
import com.aspire.guidewire.cc.teststeps.commercialpackage.CommercialPackageFeatures.ChooseCoveragesByType;
import com.aspire.guidewire.cc.teststeps.commercialpackage.CommercialPackageFeatures.ChooseDocumentsByType;
import com.aspire.guidewire.cc.teststeps.commercialpackage.CommercialPackageFeatures.ClaimInfo;
import com.aspire.guidewire.cc.teststeps.commercialpackage.CommercialPackageFeatures.CloseClaim;
import com.aspire.guidewire.cc.teststeps.commercialpackage.CommercialPackageFeatures.ContactDetails;
import com.aspire.guidewire.cc.teststeps.commercialpackage.CommercialPackageFeatures.Contractual_Liability_Railroads;
import com.aspire.guidewire.cc.teststeps.commercialpackage.CommercialPackageFeatures.Coverage;
import com.aspire.guidewire.cc.teststeps.commercialpackage.CommercialPackageFeatures.CreateNote;
import com.aspire.guidewire.cc.teststeps.commercialpackage.CommercialPackageFeatures.Liquor_Liability_Endorsement;
import com.aspire.guidewire.cc.teststeps.commercialpackage.CommercialPackageFeatures.PaymentOptions;
import com.aspire.guidewire.cc.teststeps.commercialpackage.CommercialPackageFeatures.Policy_Level_Coverage;
import com.aspire.guidewire.cc.teststeps.commercialpackage.CommercialPackageFeatures.ReOpenClaim;
import com.aspire.guidewire.cc.teststeps.commercialpackage.CommercialPackageFeatures.Reserve;
import com.aspire.guidewire.cc.teststeps.commercialpackage.CommercialPackageFeatures.SearchClaim;
import com.aspire.guidewire.cc.teststeps.commercialpackage.CommercialPackageFeatures.Searchpolicy;
import com.aspire.guidewire.cc.teststeps.commercialpackage.CommercialPackageFeatures.ServiceDetails;
import com.aspire.guidewire.cc.teststeps.commercialpackage.CommercialPackageFeatures.UploadDocument;
import com.aspire.guidewire.cc.teststeps.commercialpackage.CommercialPackageSteps;
import com.aspire.guidewire.cc.teststeps.commercialpackage.CommercialPackageStepsImpl;
import com.aspire.guidewire.cc.teststeps.commercialpackage.DataFakers;
import com.aspire.guidewire.utils.DataProviderUtils;
import com.aspire.guidewire.utils.EnvironmentPropertiesReader;
import com.aspire.guidewire.utils.Log;
import com.aspire.guidewire.webdriverManager.DriverManager;


public class CC_CommercialPackageSuite  {

	boolean LambdatestStatus = false;

	String ccWebSite,pcWebSite,  browser, contentGraphqlURL, browseAllContentGraphqlURL, sheetName , policyNumber;

	private static EnvironmentPropertiesReader configProperty = EnvironmentPropertiesReader.getInstance();
	ThreadLocal <String> policyNumberForClaim = new ThreadLocal<>();
	protected static ThreadLocal<WebDriver> threadLocalDriver = new ThreadLocal<>();

		@BeforeTest(alwaysRun = true)
		public void init(ITestContext context) {

			pcWebSite = (System.getProperty("pcWebSite") != null ? System.getProperty("pcWebSite"): context.getCurrentXmlTest().getParameter("pcWebSite"));
			DriverManager.setPCWebsite(pcWebSite);
			ccWebSite = (System.getProperty("ccWebSite") != null ? System.getProperty("ccWebSite"): context.getCurrentXmlTest().getParameter("ccWebSite"));
			DriverManager.setCCWebsite(ccWebSite);
			if(configProperty.hasProperty("runLambdaTestFromLocal") && configProperty.getProperty("runLambdaTestFromLocal").trim().equalsIgnoreCase("true")){
				LambdatestStatus = true;
			}
			
		}

	/**
	 * Test Description: To verify the Commercial Package claim creation
	 * Test ID: TC18
	 * @author anitha.raphel
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the Commercial Package claim creation", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC18(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the Commercial Package claim creation", driver);
		CommercialPackageDataEngine testData = new CommercialPackageDataEngine("CC_GWTestData_DataEngine.xlsx", "CommercialPackage", "TC18");

		try {	

			CommercialPackageStepsImpl cc = CommercialPackageSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			cc.createClaim();

			String insuredName = cc.searchPolicy(Searchpolicy.builder()
					.policyNo(testData.getPolicyNumber())
					.lossDate(testData.getLossDate())
					.build());

			cc.enterBasicInformation(BasicInfo.builder()
					.insuredName(insuredName)
					.build());

			cc.addClaimInformation(ClaimInfo.builder()
					.lossCause(testData.getLossCause())
					.faultRating(testData.getFaultRating())
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
	 * Test Description: To verify the exposure creation in Commercial Package claim for Underground Resources Cov - Gen. Damages coverage
	 * Test ID: TC49
	 * @author anitha.raphel
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the exposure creation in Commercial Package claim for Underground Resources Cov - Gen. Damages coverage", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC49(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the exposure creation in Commercial Package claim for Underground Resources Cov - Gen. Damages coverage", driver);
		CommercialPackageDataEngine testData = new CommercialPackageDataEngine("CC_GWTestData_DataEngine.xlsx", "CommercialPackage", "TC49");

		try {	

			CommercialPackageStepsImpl cc = CommercialPackageSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			String insuredName = cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());
			
			cc.addCoveragesByType(ChooseCoveragesByType.builder(ByCoverages.BY_COVERAGE_TYPE_U)
					.bycoverageType_U(By_Coverage_Type_U.builder()
							.underground_Resources_Cov_Gen_Damages(Coverage.builder()
									.claimant(insuredName)
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
	 * Test Description: To verify the exposure creation for Ltd Contractual Liab for Personal Advertising and Injury coverage
	 * Test ID: TC58
	 * @author anitha.raphel
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the exposure creation for Ltd Contractual Liab for Personal Advertising and Injury coverage", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC58(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the exposure creation for Ltd Contractual Liab for Personal Advertising and Injury coverage", driver);
		CommercialPackageDataEngine testData = new CommercialPackageDataEngine("CC_GWTestData_DataEngine.xlsx", "CommercialPackage", "TC58");

		try {	

			CommercialPackageStepsImpl cc = CommercialPackageSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			String insuredName = cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.addCoveragesByType(ChooseCoveragesByType.builder(ByCoverages.BY_COVERAGE_TYPE_L)
					.bycoverageType_L(By_Coverage_Type_L.builder()
							.contractual_Liab_Personal_Advertising_Injury(Coverage.builder()
									.claimant(insuredName)
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
	 * Test Description: To verify the exposure creation for Contractual Liability - RR - BI coverage
	 * Test ID: TC59
	 * @author anitha.raphel
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the exposure creation for Contractual Liability - RR - BI coverage", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC59(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the exposure creation for Contractual Liability - RR - BI coverage", driver);
		CommercialPackageDataEngine testData = new CommercialPackageDataEngine("CC_GWTestData_DataEngine.xlsx", "CommercialPackage", "TC59");

		try {	

			CommercialPackageStepsImpl cc = CommercialPackageSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			String insuredName = cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());
			
			cc.addCoverages(ChooseCoverages.builder(Coverages.POLICY_LEVEL_COVERAGES)
					.policy_Level_Coverage(Policy_Level_Coverage.builder()
							.contractual_Liability_Railroads(Contractual_Liability_Railroads.builder()
									.contract_Liability_RR_BI(Coverage.builder()
											.claimant(insuredName)
											.claimantType(testData.getClaimantType())
											.injuredPerson(insuredName)
											.lossParty(testData.getLossParty())
											.build())
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
	 * Test Description: To verify the reserves creation for Employee benefits liability exposure
	 * Test ID: TC74
	 * @author anitha.raphel
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the reserves creation for Employee benefits liability exposure", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC74(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the reserves creation for Employee benefits liability exposure", driver);
		CommercialPackageDataEngine testData = new CommercialPackageDataEngine("CC_GWTestData_DataEngine.xlsx", "CommercialPackage", "TC74");

		try {	

			CommercialPackageStepsImpl cc = CommercialPackageSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			String insuredName = cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.addCoveragesByType(ChooseCoveragesByType.builder(ByCoverages.BY_COVERAGE_TYPE_E)
					.bycoverageType_E(By_Coverage_Type_E.builder()
							.employee_Benefits_Liability(Coverage.builder()
									.claimant(insuredName)
									.claimantType(testData.getClaimantType())
									.damageDescription(testData.getDamageDescription())
									.build())
							.build())
					.build());	

			cc.createReserve(Reserve.builder()
					.costType(testData.getCostType())
					.reserveCostCategory(testData.getReserveCostCategory())
					.reserveAmount(testData.getAmount())
					.byCoverageType(testData.getByCoverageType())
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
	 * Test Description: To verify the reserves creation for Liquor liability  Cov - BI exposure
	 * Test ID: TC75
	 * @author anitha.raphel
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the reserves creation for Liquor liability  Cov - BI exposure", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC75(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the reserves creation for Liquor liability  Cov - BI exposure", driver);
		CommercialPackageDataEngine testData = new CommercialPackageDataEngine("CC_GWTestData_DataEngine.xlsx", "CommercialPackage", "TC75");

		try {	

			CommercialPackageStepsImpl cc = CommercialPackageSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			String insuredName = cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.addCoverages(ChooseCoverages.builder(Coverages.LIQUOR_LIABILITY_ENDORSEMENT)
					.policy_Level_Coverage(Policy_Level_Coverage.builder()
							.liquor_Liability_Endorsement(Liquor_Liability_Endorsement.builder()
									.liquor_Liability_Cov_BI(Coverage.builder()
											.claimant(insuredName)
											.claimantType(testData.getClaimantType())
											.injuredPerson(insuredName)
											.lossParty(testData.getLossParty())
											.build())
									.build())
							.build())
					.build());

			cc.createReserve(Reserve.builder()
					.costType(testData.getCostType())
					.reserveCostCategory(testData.getReserveCostCategory())
					.reserveAmount(testData.getAmount())
					.byCoverageType(testData.getByCoverageType())
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
	 * Test Description: To verify that able to add a Property of Emergency services for Commercial Package claim
	 * Test ID: TC82
	 * @author anitha.raphel
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify that able to add a Property of Emergency services for Commercial Package claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC82(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to add a Property of Emergency services for Commercial Package claim", driver);
		CommercialPackageDataEngine testData = new CommercialPackageDataEngine("CC_GWTestData_DataEngine.xlsx", "CommercialPackage", "TC82");

		try {	

			CommercialPackageStepsImpl cc = CommercialPackageSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.addClaimService(ServiceDetails.builder()
					.service(testData.getService())
					.requestType(testData.getRequestType())
					.contactDetails(ContactDetails.builder()
							.firstName(DataFakers.firstName())
							.lastName(DataFakers.lastName())
							.taxIdSSN(testData.getTaxID())
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
	 * Test Description: To verify the transfer check functionality for Commercial Package claim
	 * Test ID: TC91
	 * @author anitha.raphel
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the transfer check functionality for Commercial Package claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC91(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the transfer check functionality for Commercial Package claim", driver);
		CommercialPackageDataEngine testData = new CommercialPackageDataEngine("CC_GWTestData_DataEngine.xlsx", "CommercialPackage", "TC91");

		try {	
			
			String claimNumber = CCDataGenerator.createClaimForCommercialPackage(testData.getPolicyNumber());

			CommercialPackageStepsImpl cc = CommercialPackageSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			String insuredName = cc.searchClaim(SearchClaim.builder().claimNo(claimNumber).build());
			
			cc.addCoverages(ChooseCoverages.builder(Coverages.LIQUOR_LIABILITY_ENDORSEMENT)
					.policy_Level_Coverage(Policy_Level_Coverage.builder()
							.liquor_Liability_Endorsement(Liquor_Liability_Endorsement.builder()
									.liquor_Liability_Cov_BI(Coverage.builder()
											.claimant(insuredName)
											.claimantType(testData.getClaimantType())
											.injuredPerson(insuredName)
											.lossParty(testData.getLossParty())
											.build())
									.build())
							.build())
					.build());

			cc.createReserve(Reserve.builder()
					.costType(testData.getCostType())
					.reserveCostCategory(testData.getReserveCostCategory())
					.reserveAmount(testData.getAmount())
					.byCoverageType(testData.getByCoverageType())
					.build());

			cc.paymentChecks(PaymentOptions.builder()
					.payer(insuredName)
					.reserveLine(testData.getReserveLine())
					.paymentType(PaymentType.MANUAL_CHECK)
					.costType(testData.getCostType())
					.costCategory(testData.getReserveCostCategory())
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
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}

	/**
	 * Test Description: To verify the Note creation after created an Commercial Package claim 
	 * Test ID: TC137
	 * @author anitha.raphel
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the Note creation after created an Commercial Package claim ", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC137(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the Note creation after created an Commercial Package claim ", driver);
		CommercialPackageDataEngine testData = new CommercialPackageDataEngine("CC_GWTestData_DataEngine.xlsx", "CommercialPackage", "TC137");

		try {	

			CommercialPackageStepsImpl cc = CommercialPackageSteps.create();

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
	 * Test Description: To verify the upload document in Commercial Package claim 
	 * Test ID: TC146
	 * @author anitha.raphel
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the upload document in Commercial Package claim ", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC146(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the upload document in Commercial Package claim ", driver);
		CommercialPackageDataEngine testData = new CommercialPackageDataEngine("CC_GWTestData_DataEngine.xlsx", "CommercialPackage", "TC146");

		try {	

			CommercialPackageStepsImpl cc = CommercialPackageSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.newDocumentClaim(ChooseDocumentsByType.builder()
					.documentType(DocumentType.UPLOAD_DOCUMENT)
					.uploadDocument(UploadDocument.builder()
							.documentName(testData.getDocumentName())
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
	 * Test Description: To verify the Assign functionality for Commercial Package claim by using Search by location
	 * Test ID: TC171
	 * @author anitha.raphel
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the Assign functionality for Commercial Package claim by using Search by location", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC171(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the Assign functionality for Commercial Package claim by using Search by location", driver);
		CommercialPackageDataEngine testData = new CommercialPackageDataEngine("CC_GWTestData_DataEngine.xlsx", "CommercialPackage", "TC171");

		try {	

			CommercialPackageStepsImpl cc = CommercialPackageSteps.create();

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
	 * Test Description: To verify the Reopen Claim functionality for Commercial Package claim
	 * Test ID: TC191
	 * @author anitha.raphel
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the Reopen Claim functionality for Commercial Package claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC191(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the Reopen Claim functionality for Commercial Package claim", driver);
		CommercialPackageDataEngine testData = new CommercialPackageDataEngine("CC_GWTestData_DataEngine.xlsx", "CommercialPackage", "TC191");

		try {	
			
			String claimNumber = CCDataGenerator.createClaimForCommercialPackage(testData.getPolicyNumber());

			CommercialPackageStepsImpl cc = CommercialPackageSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			cc.searchClaim(SearchClaim.builder().claimNo(claimNumber).build());

			cc.closeClaim(CloseClaim.builder()
					.dataMessage(testData.getDataMessage())
					.note(testData.getNoteText())
					.outcome(testData.getOutcome())
					.closedStatus(testData.getClosedStatus())
					.build());
					
			cc.reOpenClaim(ReOpenClaim.builder()
					.note(testData.getNoteText())
					.reOpenReason(testData.getReopenReason())
					.openStatus(testData.getReOpenStatus())
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
	 * Test Description: To verify the transfer check functionality for Commercial Package claim
	 * Test ID: TC383
	 * @author anitha.raphel
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the transfer check functionality for Commercial Package claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC383(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the transfer check functionality for Commercial Package claim", driver);
		CommercialPackageDataEngine testData = new CommercialPackageDataEngine("CC_GWTestData_DataEngine.xlsx", "CommercialPackage", "TC383");

		try {	
			
			String claimNumber = CCDataGenerator.createClaimForCommercialPackage(testData.getPolicyNumber());

			CommercialPackageStepsImpl cc = CommercialPackageSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			String insuredName = cc.searchClaim(SearchClaim.builder().claimNo(claimNumber).build());

			cc.addCoverages(ChooseCoverages.builder(Coverages.POLICY_LEVEL_COVERAGES)
					.policy_Level_Coverage(Policy_Level_Coverage.builder()
							.contractual_Liability_Railroads(Contractual_Liability_Railroads.builder()
									.contract_Liability_RR_BI(Coverage.builder()
											.claimant(insuredName)
											.claimantType(testData.getClaimantType())
											.injuredPerson(insuredName)
											.lossParty(testData.getLossParty())
											.build())
									.build())
							.build())
					.build());

			cc.createReserve(Reserve.builder()
					.costType(testData.getCostType())
					.reserveCostCategory(testData.getReserveCostCategory())
					.reserveAmount(testData.getAmount())
					.byCoverageType(testData.getByCoverageType())
					.build());

			cc.paymentChecks(PaymentOptions.builder()
					.payer(insuredName)
					.reserveLine(testData.getReserveLine())
					.paymentType(PaymentType.MANUAL_CHECK)
					.costType(testData.getCostType())
					.costCategory(testData.getReserveCostCategory())
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
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}

	/**
	 * Test Description: To verify that able to create a Recovery for Commercial Package claim using Salvage
	 * Test ID: TC419
	 * @author anitha.raphel
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify that able to create a Recovery for Commercial Package claim using Salvage", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC419(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to create a Recovery for Commercial Package claim using Salvage", driver);
		CommercialPackageDataEngine testData = new CommercialPackageDataEngine("CC_GWTestData_DataEngine.xlsx", "CommercialPackage", "TC419");

		try {	

			CommercialPackageStepsImpl cc = CommercialPackageSteps.create();

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
}