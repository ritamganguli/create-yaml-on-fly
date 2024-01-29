package com.aspire.guidewire.cc.testscripts;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aspire.guidewire.api.datagenerator.CCDataGenerator;
import com.aspire.guidewire.cc.teststeps.generalliability.GeneralLiabilityConstants.AssignType;
import com.aspire.guidewire.cc.teststeps.generalliability.GeneralLiabilityConstants.Coverages;
import com.aspire.guidewire.cc.teststeps.generalliability.GeneralLiabilityConstants.DocumentType;
import com.aspire.guidewire.cc.teststeps.generalliability.GeneralLiabilityConstants.PaymentType;
import com.aspire.guidewire.cc.teststeps.generalliability.GeneralLiabilityDataEngine;
import com.aspire.guidewire.cc.teststeps.generalliability.GeneralLiabilityFeatures.AddPropertyDamage;
import com.aspire.guidewire.cc.teststeps.generalliability.GeneralLiabilityFeatures.AssignClaim;
import com.aspire.guidewire.cc.teststeps.generalliability.GeneralLiabilityFeatures.BasicInfo;
import com.aspire.guidewire.cc.teststeps.generalliability.GeneralLiabilityFeatures.ChooseCoverages;
import com.aspire.guidewire.cc.teststeps.generalliability.GeneralLiabilityFeatures.ChooseCoveragesByType;
import com.aspire.guidewire.cc.teststeps.generalliability.GeneralLiabilityFeatures.ChooseDocumentsByType;
import com.aspire.guidewire.cc.teststeps.generalliability.GeneralLiabilityFeatures.ClaimInfo;
import com.aspire.guidewire.cc.teststeps.generalliability.GeneralLiabilityFeatures.ContactDetails;
import com.aspire.guidewire.cc.teststeps.generalliability.GeneralLiabilityFeatures.Coverage;
import com.aspire.guidewire.cc.teststeps.generalliability.GeneralLiabilityFeatures.CoverageType_C;
import com.aspire.guidewire.cc.teststeps.generalliability.GeneralLiabilityFeatures.CoverageType_G;
import com.aspire.guidewire.cc.teststeps.generalliability.GeneralLiabilityFeatures.CreateNote;
import com.aspire.guidewire.cc.teststeps.generalliability.GeneralLiabilityFeatures.GeneralLiability;
import com.aspire.guidewire.cc.teststeps.generalliability.GeneralLiabilityFeatures.GovermenatalSubdivisions;
import com.aspire.guidewire.cc.teststeps.generalliability.GeneralLiabilityFeatures.PaymentOptions;
import com.aspire.guidewire.cc.teststeps.generalliability.GeneralLiabilityFeatures.Reserve;
import com.aspire.guidewire.cc.teststeps.generalliability.GeneralLiabilityFeatures.SearchClaim;
import com.aspire.guidewire.cc.teststeps.generalliability.GeneralLiabilityFeatures.Searchpolicy;
import com.aspire.guidewire.cc.teststeps.generalliability.GeneralLiabilityFeatures.ServiceDetails;
import com.aspire.guidewire.cc.teststeps.generalliability.GeneralLiabilityFeatures.TemplateClaim;
import com.aspire.guidewire.cc.teststeps.generalliability.GeneralLiabilitySteps;
import com.aspire.guidewire.cc.teststeps.generalliability.GeneralLiabilityStepsImpl;
import com.aspire.guidewire.utils.DataProviderUtils;
import com.aspire.guidewire.utils.EnvironmentPropertiesReader;
import com.aspire.guidewire.utils.Log;
import com.aspire.guidewire.webdriverManager.DriverManager;


public class CC_GeneralLiabilitySuite  {

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
	 * Test Description: To verify the General Liability claim creation
	 * Test ID: TC15
	 * @author surendar.baskaran
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the General Liability claim creation", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC15(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the General Liability claim creation", driver);
		GeneralLiabilityDataEngine testData = new GeneralLiabilityDataEngine("CC_GWTestData_DataEngine.xlsx", "GeneralLiability", "TC15");

		try {	

			GeneralLiabilityStepsImpl cc = GeneralLiabilitySteps.create();

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
					.whatHappened(testData.getWhatHappened())
					.addPropertyDamage(AddPropertyDamage.builder()
							.damageDescription(testData.getDamageDescription())
							.propertyDescription(testData.getPropertyDescription())
							.propertyName(testData.getPropertyName())
							.build())
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
	 * Test Description: To verify the exposure creation for Coverage for Injury to Leased Workers coverage
	 * Test ID: TC35
	 * @author surendar.baskaran
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the exposure creation for Coverage for Injury to Leased Workers coverage", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC35(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the exposure creation for Coverage for Injury to Leased Workers coverage", driver);
		GeneralLiabilityDataEngine testData = new GeneralLiabilityDataEngine("CC_GWTestData_DataEngine.xlsx", "GeneralLiability", "TC35");

		try {	

			GeneralLiabilityStepsImpl cc = GeneralLiabilitySteps.create();

			cc.loginIntoTheApplication("su", "gw");

			String insuredName = cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.addCoveragesByType(ChooseCoveragesByType.builder(Coverages.COVERAGE_C)
					.coverage_C(CoverageType_C.builder()
							.CoverageForInjuryToLeasedWorkers(Coverage.builder()
									.claimant(insuredName)
									.claimantType(testData.getClaimantType())
									.injuredPerson(insuredName)
									.lossParty(testData.getLossParty())
									.build())
							.build())
					.coverage(testData.getCoverage())
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
	 * Test Description:To verify the exposure creation for GL Prod/Comp Ops - Med Pay coverage
	 * Test ID: TC36
	 * @author surendar.baskaran
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the exposure creation for GL Prod/Comp Ops - Med Pay coverage", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC36(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the exposure creation for GL Prod/Comp Ops - Med Pay coverage", driver);
		GeneralLiabilityDataEngine testData = new GeneralLiabilityDataEngine("CC_GWTestData_DataEngine.xlsx", "GeneralLiability", "TC36");

		try {	

			GeneralLiabilityStepsImpl cc = GeneralLiabilitySteps.create();

			cc.loginIntoTheApplication("su", "gw");

			String insuredName = cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.addCoverages(ChooseCoverages.builder(Coverages.GL_PROD_COMP_OPS_MED_PAY)
					.generalLiability(GeneralLiability.builder()
							.gLProdCompOpsMedPay(Coverage.builder()	
									.claimant(insuredName)
									.claimantType(testData.getClaimantType())
									.injuredPerson(insuredName)
									.lossParty(testData.getLossParty())
									.build())
							.build())
					.coverage(testData.getCoverage())
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
	 * Test Description:To verify the reserves creation for Governmental subdivisions - PD exposure
	 * Test ID: TC66
	 * @author surendar.baskaran
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the reserves creation for Governmental subdivisions - PD exposure", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC66(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the reserves creation for Governmental subdivisions - PD exposure", driver);
		GeneralLiabilityDataEngine testData = new GeneralLiabilityDataEngine("CC_GWTestData_DataEngine.xlsx", "GeneralLiability", "TC66");

		try {	

			GeneralLiabilityStepsImpl cc = GeneralLiabilitySteps.create();

			cc.loginIntoTheApplication("su", "gw");

			String insuredName = cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.addCoveragesByType(ChooseCoveragesByType.builder(Coverages.COVERAGE_G)
					.coverage_G(CoverageType_G.builder()
							.govermenatalSubdivisions(GovermenatalSubdivisions.builder()
									.govermenatalSubdivisionsGenDamange(Coverage.builder()
											.claimant(insuredName)
											.claimantType(testData.getClaimantType())
											.build())
									.build())
							.build())
					.coverage(testData.getCoverage())
					.build());

			cc.createReserve(Reserve.builder()
					.exposureFilterName(insuredName)
					.costType(testData.getCostType())
					.costCategory(testData.getCostCategory())
					.reserveAmount(testData.getAmount())
					.coverageType(testData.getCoverage())
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
	 * Test Description:To verify the reserves creation for GL Personal/Advertising Injury exposure
	 * Test ID: TC67
	 * @author surendar.baskaran
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the reserves creation for GL Personal/Advertising Injury exposure", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC67(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the reserves creation for GL Personal/Advertising Injury exposure", driver);
		GeneralLiabilityDataEngine testData = new GeneralLiabilityDataEngine("CC_GWTestData_DataEngine.xlsx", "GeneralLiability", "TC67");

		try {	

			GeneralLiabilityStepsImpl cc = GeneralLiabilitySteps.create();

			cc.loginIntoTheApplication("su", "gw");

			String insuredName = cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.addCoverages(ChooseCoverages.builder(Coverages.GL_PERSONAL_ADVERTISING_INJURY)
					.generalLiability(GeneralLiability.builder()
							.gLPersonalAdvertisingInjury(Coverage.builder()	
									.claimant(insuredName)
									.claimantType(testData.getClaimantType())
									.build())
							.build())
					.coverage(testData.getCoverage())
					.build());		

			cc.createReserve(Reserve.builder()
					.exposureFilterName(insuredName)
					.costType(testData.getCostType())
					.costCategory(testData.getCostCategory())
					.reserveAmount(testData.getAmount())
					.coverageType(testData.getCoverage())
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
	 * Test Description:To verify that able to add a Medical services for General Liability claim
	 * Test ID: TC79
	 * @author surendar.baskaran
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify that able to add a Medical services for General Liability claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC79(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to add a Medical services for General Liability claim", driver);
		GeneralLiabilityDataEngine testData = new GeneralLiabilityDataEngine("CC_GWTestData_DataEngine.xlsx", "GeneralLiability", "TC79");

		try {	

			GeneralLiabilityStepsImpl cc = GeneralLiabilitySteps.create();

			cc.loginIntoTheApplication("su", "gw");

			cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.addClaimService(ServiceDetails.builder()
					.service(testData.getService())
					.requestType(testData.getRequestType())
					.contactDetails(ContactDetails.builder()
							.firstName(testData.getFirstName())
							.lastName(testData.getLastName())
							.taxIdSSN(testData.getTaxId())
							.address(testData.getAddress())
							.city(testData.getCity())
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
	 * Test Description:To verify the transfer check functionality for General Liability claim
	 * Test ID: TC88
	 * @author surendar.baskaran
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the transfer check functionality for General Liability claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC88(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the transfer check functionality for General Liability claim", driver);
		GeneralLiabilityDataEngine testData = new GeneralLiabilityDataEngine("CC_GWTestData_DataEngine.xlsx", "GeneralLiability", "TC88");

		try {	
			
			String claimNumber = CCDataGenerator.createClaimForGeneralLiability(testData.getPolicyNumber());

			GeneralLiabilityStepsImpl cc = GeneralLiabilitySteps.create();

			cc.loginIntoTheApplication("su", "gw");

			String insuredName = cc.searchClaim(SearchClaim.builder().claimNo(claimNumber).build());

			cc.addCoveragesByType(ChooseCoveragesByType.builder(Coverages.COVERAGE_G)
					.coverage_G(CoverageType_G.builder()
							.govermenatalSubdivisions(GovermenatalSubdivisions.builder()
									.govermenatalSubdivisionsPD(Coverage.builder()
											.claimant(insuredName)
											.claimantType(testData.getClaimantType())
											.damageDescription(testData.getDamageDescription())
											.propertyDescription(testData.getPropertyDescription())
											.propertyName(testData.getPropertyName())
											.build())
									.build())
							.build())
					.coverage(testData.getCoverage())
					.build());

			cc.createReserve(Reserve.builder()
					.exposureFilterName(insuredName)
					.costType(testData.getCostType())
					.costCategory(testData.getCostCategory())
					.reserveAmount(testData.getAmount())
					.coverageType(testData.getCoverage())
					.build());

			cc.paymentChecks(PaymentOptions.builder()
					.payer(insuredName)
					.reserveLine(testData.getReserveLine())
					.paymentType(PaymentType.MANUAL_CHECK)
					.costType(testData.getCostType())
					.costCategory(testData.getCostCategory())
					.payment(testData.getPayment())
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
	 * Test Description:To verify the Note creation after created a General Liability claim 
	 * Test ID: TC139
	 * @author surendar.baskaran
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the Note creation after created a General Liability claim ", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC139(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the Note creation after created a General Liability claim ", driver);
		GeneralLiabilityDataEngine testData = new GeneralLiabilityDataEngine("CC_GWTestData_DataEngine.xlsx", "GeneralLiability", "TC139");

		try {	

			GeneralLiabilityStepsImpl cc = GeneralLiabilitySteps.create();

			cc.loginIntoTheApplication("su", "gw");

			cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());
			
			cc.createNote(CreateNote.builder().text(testData.getText()).build());

			Log.testCaseResult(driver);
		} catch (Exception e) {
			Log.exception(e, DriverManager.getDriver());
		} finally {
			DriverManager.quitDriver();
			Log.endTestCase();
		}
	}
	/**
	 * Test Description:To verify the New document creation using create from a template in General Liability claim 
	 * Test ID: TC140
	 * @author surendar.baskaran
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the New document creation using create from a template in General Liability claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC140(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the New document creation using create from a template in General Liability claim", driver);
		GeneralLiabilityDataEngine testData = new GeneralLiabilityDataEngine("CC_GWTestData_DataEngine.xlsx", "GeneralLiability", "TC140");

		try {	

			GeneralLiabilityStepsImpl cc = GeneralLiabilitySteps.create();

			cc.loginIntoTheApplication("su", "gw");

			cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());
			
			cc.createDocument(ChooseDocumentsByType.builder().documentType(DocumentType.TEMPLATE_CLAIM)
					.templateClaim(TemplateClaim.builder()
							.type(testData.getType())
							.jurisdiction(testData.getJurisdictionState())
							.build())
					.build());

			cc.verifyDocumentCreation();
		
			Log.testCaseResult(driver);
		} catch (Exception e) {
			Log.exception(e, DriverManager.getDriver());
		} finally {
			DriverManager.quitDriver();
			Log.endTestCase();
		}
	}

	/**
	 * Test Description:To verify the New document creation using create from a template while creating a General Liability claim 
	 * Test ID: TC154
	 * @author surendar.baskaran
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the New document creation using create from a template while creating a General Liability claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC154(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the New document creation using create from a template while creating a General Liability claim", driver);
		GeneralLiabilityDataEngine testData = new GeneralLiabilityDataEngine("CC_GWTestData_DataEngine.xlsx", "GeneralLiability", "TC154");

		try {	

			GeneralLiabilityStepsImpl cc = GeneralLiabilitySteps.create();

			cc.loginIntoTheApplication("su", "gw");

			cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());
			
			cc.verifyDocumentCreation();
			
			Log.testCaseResult(driver);
		} catch (Exception e) {
			Log.exception(e, DriverManager.getDriver());
		} finally {
			DriverManager.quitDriver();
			Log.endTestCase();
		}
	}


	/**
	 * Test Description:To verify the Assign functionality for General Liability claim by using Search For Group 
	 * Test ID: TC172
	 * @author surendar.baskaran
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the Assign functionality for General Liability claim by using Search For Group", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC172(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the Assign functionality for General Liability claim by using Search For Group", driver);
		GeneralLiabilityDataEngine testData = new GeneralLiabilityDataEngine("CC_GWTestData_DataEngine.xlsx", "GeneralLiability", "TC172");

		try {	

			GeneralLiabilityStepsImpl cc = GeneralLiabilitySteps.create();

			cc.loginIntoTheApplication("su", "gw");

			cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.assignClaim(AssignClaim.builder()
					.assignType(AssignType.SEARCH_BY_DISTANCE_FROM_LOCATION)
					.searchFor(testData.getSearchFor())
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
	 * Test Description:To verify the manual check payment for General Liability claim 
	 * Test ID: TC375
	 * @author surendar.baskaran
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the manual check payment for General Liability claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC375(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the manual check payment for General Liability claim", driver);
		GeneralLiabilityDataEngine testData = new GeneralLiabilityDataEngine("CC_GWTestData_DataEngine.xlsx", "GeneralLiability", "TC375");

		try {	

			GeneralLiabilityStepsImpl cc = GeneralLiabilitySteps.create();

			cc.loginIntoTheApplication("su", "gw");

			String insuredName = cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.addCoveragesByType(ChooseCoveragesByType.builder(Coverages.COVERAGE_G)
					.coverage_G(CoverageType_G.builder()
							.govermenatalSubdivisions(GovermenatalSubdivisions.builder()
									.govermenatalSubdivisionsPD(Coverage.builder()
											.claimant(insuredName)
											.claimantType(testData.getClaimantType())
											.damageDescription(testData.getDamageDescription())
											.propertyDescription(testData.getPropertyDescription())
											.propertyName(testData.getPropertyName())
											.build())
									.build())
							.build())
					.coverage(testData.getCoverage())
					.build());

			cc.createReserve(Reserve.builder()
					.exposureFilterName(insuredName)
					.costType(testData.getCostType())
					.costCategory(testData.getCostCategory())
					.reserveAmount(testData.getAmount())
					.coverageType(testData.getCoverage())
					.build());

			cc.paymentChecks(PaymentOptions.builder()
					.payer(insuredName)
					.reserveLine(testData.getReserveLine())
					.paymentType(PaymentType.MANUAL_CHECK)
					.costType(testData.getCostType())
					.costCategory(testData.getCostCategory())
					.payment(testData.getPayment())
					.amount(testData.getAmount())
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
	 * Test Description:To verify that able to create a Recovery for General Liability claim using Credit to loss 
	 * Test ID: TC412
	 * @author surendar.baskaran
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify that able to create a Recovery for General Liability claim using Credit to loss", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC412(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to create a Recovery for General Liability claim using Credit to loss", driver);
		GeneralLiabilityDataEngine testData = new GeneralLiabilityDataEngine("CC_GWTestData_DataEngine.xlsx", "GeneralLiability", "TC412");

		try {	

			GeneralLiabilityStepsImpl cc = GeneralLiabilitySteps.create();

			cc.loginIntoTheApplication("su", "gw");

			String insuredName = cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());
			
			cc.paymentChecks(PaymentOptions.builder()
					.payer(insuredName)
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
			DriverManager.quitDriver();
			Log.endTestCase();
		}
	}
	/**
	 * Test Description:To verify that able to create a Recovery for General Liability claim using Deductible 
	 * Test ID: TC416
	 * @author surendar.baskaran
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify that able to create a Recovery for General Liability claim using Deductible", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC416(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to create a Recovery for General Liability claim using Deductible", driver);
		GeneralLiabilityDataEngine testData = new GeneralLiabilityDataEngine("CC_GWTestData_DataEngine.xlsx", "GeneralLiability", "TC416");

		try {	

			GeneralLiabilityStepsImpl cc = GeneralLiabilitySteps.create();

			cc.loginIntoTheApplication("su", "gw");

			String insuredName = cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.paymentChecks(PaymentOptions.builder()
					.payer(insuredName)
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
			DriverManager.quitDriver();
			Log.endTestCase();
		}
	}

}


