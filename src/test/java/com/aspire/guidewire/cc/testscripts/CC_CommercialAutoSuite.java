package com.aspire.guidewire.cc.testscripts;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aspire.guidewire.api.datagenerator.CCDataGenerator;
import com.aspire.guidewire.cc.teststeps.commercialauto.CommercialAutoConstants.AssignType;
import com.aspire.guidewire.cc.teststeps.commercialauto.CommercialAutoConstants.ContactType;
import com.aspire.guidewire.cc.teststeps.commercialauto.CommercialAutoConstants.Coverages;
import com.aspire.guidewire.cc.teststeps.commercialauto.CommercialAutoConstants.DocumentType;
import com.aspire.guidewire.cc.teststeps.commercialauto.CommercialAutoFeatures.AddPropertyDamage;
import com.aspire.guidewire.cc.teststeps.commercialauto.CommercialAutoFeatures.AssignClaim;
import com.aspire.guidewire.cc.teststeps.commercialauto.CommercialAutoFeatures.BasicInfo;
import com.aspire.guidewire.cc.teststeps.commercialauto.CommercialAutoFeatures.ChooseCoverages;
import com.aspire.guidewire.cc.teststeps.commercialauto.CommercialAutoFeatures.ChooseCoveragesByType;
import com.aspire.guidewire.cc.teststeps.commercialauto.CommercialAutoFeatures.ChooseDocumentsByType;
import com.aspire.guidewire.cc.teststeps.commercialauto.CommercialAutoFeatures.ClaimInfo;
import com.aspire.guidewire.cc.teststeps.commercialauto.CommercialAutoFeatures.Contact;
import com.aspire.guidewire.cc.teststeps.commercialauto.CommercialAutoFeatures.ContactDetails;
import com.aspire.guidewire.cc.teststeps.commercialauto.CommercialAutoFeatures.Coverage;
import com.aspire.guidewire.cc.teststeps.commercialauto.CommercialAutoFeatures.CoverageType_C;
import com.aspire.guidewire.cc.teststeps.commercialauto.CommercialAutoFeatures.CoverageType_H;
import com.aspire.guidewire.cc.teststeps.commercialauto.CommercialAutoFeatures.CreateNote;
import com.aspire.guidewire.cc.teststeps.commercialauto.CommercialAutoFeatures.HiredAutoLiability;
import com.aspire.guidewire.cc.teststeps.commercialauto.CommercialAutoFeatures.Liability_BodilyCoverageAndPropertyCoverage;
import com.aspire.guidewire.cc.teststeps.commercialauto.CommercialAutoFeatures.PaymentOptions;
import com.aspire.guidewire.cc.teststeps.commercialauto.CommercialAutoFeatures.PaymentType;
import com.aspire.guidewire.cc.teststeps.commercialauto.CommercialAutoFeatures.Reserve;
import com.aspire.guidewire.cc.teststeps.commercialauto.CommercialAutoFeatures.Searchpolicy;
import com.aspire.guidewire.cc.teststeps.commercialauto.CommercialAutoFeatures.ServiceDetails;
import com.aspire.guidewire.cc.teststeps.commercialauto.CommercialAutoFeatures.TowingAgency;
import com.aspire.guidewire.cc.teststeps.commercialauto.CommercialAutoFeatures.UploadDocument;
import com.aspire.guidewire.cc.teststeps.commercialauto.CommercialAutoFeatures.Vendor;
import com.aspire.guidewire.cc.teststeps.commercialauto.CommercialAutoDataEngine;
import com.aspire.guidewire.cc.teststeps.commercialauto.CommercialAutoSteps;
import com.aspire.guidewire.cc.teststeps.commercialauto.CommercialAutoStepsImpl;
import com.aspire.guidewire.cc.teststeps.commercialauto.CommercialAutoFeatures.SearchClaim;
import com.aspire.guidewire.utils.DataProviderUtils;
import com.aspire.guidewire.utils.EnvironmentPropertiesReader;
import com.aspire.guidewire.utils.Log;
import com.aspire.guidewire.webdriverManager.DriverManager;


public class CC_CommercialAutoSuite  {

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
	 * @author lavanya.bala
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the Commercial Auto  claim creation", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC1(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the Commercial Auto  claim creation", driver);
		CommercialAutoDataEngine testData = new CommercialAutoDataEngine("CC_GWTestData_DataEngine.xlsx", "CommercialAuto", "TC1");

		try {	

			CommercialAutoStepsImpl cc = CommercialAutoSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			cc.createClaim();

			String insuredName = cc.searchPolicy(Searchpolicy.builder()
					.policyNo(testData.getPolicyNumber())
					.lossDate(testData.getLossDate())
					.build());


			cc.SelectInvolvedPolicyVehicle();

			cc.enterBasicInformation(BasicInfo.builder()
					.insuredName(insuredName)
					.build());

			cc.addClaimInformation(ClaimInfo.builder()
					.lossCause(testData.getLossCause())
					.state(testData.getState())
					.city(testData.getCity())
					.addPropertyDamage(AddPropertyDamage.builder()
							.damageDescription(testData.getDamageDescription())
							.propertyDescription(testData.getPropertyDescription())
							.propertyName(testData.getPropertyName())
							.build())
					.build());

			cc.addServices(TowingAgency.builder()
					.name(testData.getName())
					.taxId(testData.getTaxId()) 
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
	 * @author lavanya.bala
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the exposure creation for Hired Auto Liability - Vehicle Damage coverage", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC19(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the exposure creation for Hired Auto Liability - Vehicle Damage coverage", driver);
		CommercialAutoDataEngine testData = new CommercialAutoDataEngine("CC_GWTestData_DataEngine.xlsx", "CommercialAuto", "TC19");

		try {	

			CommercialAutoStepsImpl cc = CommercialAutoSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			String insuredName = cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.addCoveragesByType(ChooseCoveragesByType.builder(Coverages.COVERAGE_H)
					.coverage_H(CoverageType_H.builder()
							.hiredAutoLiability(HiredAutoLiability.builder()
									.hiredAutoLiability_BI(Coverage.builder()
											.claimant(insuredName)
											.claimantType(testData.getClaimantType())
											.driverName(insuredName)
											.lossOccurred(testData.getLossOccurred())
											.vin(testData.getVin())
											.vehicle(testData.getVehicleName())
											.year(testData.getYear())
											.model(testData.getModel())
											.make(testData.getMake())
											.build())
									.build())
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
	 * @author lavanya.bala
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the exposure creation for Underinsured Motorist - Bodily Injury coverage", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC20(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the exposure creation for Underinsured Motorist - Bodily Injury coverage", driver);
		CommercialAutoDataEngine testData = new CommercialAutoDataEngine("CC_GWTestData_DataEngine.xlsx", "CommercialAuto", "TC20");

		try {	

			CommercialAutoStepsImpl cc = CommercialAutoSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			String insuredName = cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.addCoverages(ChooseCoverages.builder(Coverages.UNINSURED_MOTORISTS_BODILY_INJURY)
					.contactDetails(ContactDetails.builder()
							.firstName(testData.getFirstName())
							.lastName(testData.getLastName())
							.taxIdSSN(testData.getTaxId())
							.address(testData.getAddress())
							.city(testData.getCity())
							.state(testData.getState())
							.build())
					.uninsuredMotoristsodilyInjury(Coverage.builder()
							.claimantType(testData.getClaimantType())
							.injuredPerson(insuredName)
							.lossParty(testData.getLossParty())
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
	 * @author lavanya.bala
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the reserves creation for Collision exposure", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC60(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the reserves creation for Collision exposure", driver);
		CommercialAutoDataEngine testData = new CommercialAutoDataEngine("CC_GWTestData_DataEngine.xlsx", "CommercialAuto", "TC60");

		try {	

			CommercialAutoStepsImpl cc = CommercialAutoSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			String insuredName = cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.addCoveragesByType(ChooseCoveragesByType.builder(Coverages.COVERAGE_C)
					.coverage_C(CoverageType_C.builder()
							.collision(Coverage.builder()
									.claimant(insuredName)
									.claimantType(testData.getClaimantType())
									.driverName(insuredName)
									.vehicle(testData.getVehicleName())
									.lossOccurred(testData.getLossOccurred())
									.vin(testData.getVin())
									.year(testData.getYear())
									.model(testData.getModel())
									.make(testData.getMake())
									.build())
							.build())
					.build());

			cc.createReserve(Reserve.builder()
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
	 * @author lavanya.bala
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the reserves creation for Liability - Bodily Injury exposure", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC61(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the reserves creation for Liability - Bodily Injury exposure", driver);
		CommercialAutoDataEngine testData = new CommercialAutoDataEngine("CC_GWTestData_DataEngine.xlsx", "CommercialAuto", "TC61");

		try {	

			CommercialAutoStepsImpl cc = CommercialAutoSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			String insuredName = cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.addCoverages(ChooseCoverages.builder(Coverages.LIABILITY_BODILY_INJURY_PROPERTY_DAMAGE)
					.liability_Coverage(Liability_BodilyCoverageAndPropertyCoverage.builder()
							.liability_BodilyInjury(Coverage.builder()
									.claimant(insuredName)
									.claimantType(testData.getClaimantType())
									.injuredPerson(insuredName)
									.lossParty(testData.getLossParty())
									.build())
							.build())
					.build());

			cc.createReserve(Reserve.builder()
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
	 * @author lavanya.bala
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify that able to create a Recovery for Commercial Auto claim using Credit to expense", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC408(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to create a Recovery for Commercial Auto claim using Credit to expense", driver);
		CommercialAutoDataEngine testData = new CommercialAutoDataEngine("CC_GWTestData_DataEngine.xlsx", "CommercialAuto", "TC408");

		try {	

			CommercialAutoStepsImpl cc = CommercialAutoSteps.create();

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
	 * @author lavanya.bala
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the check payment for Commercial Auto claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC371(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the check payment for Commercial Auto claim", driver);
		CommercialAutoDataEngine testData = new CommercialAutoDataEngine("CC_GWTestData_DataEngine.xlsx", "CommercialAuto", "TC371");

		try {	

			CommercialAutoStepsImpl cc = CommercialAutoSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			String insuredName = cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());
			
			cc.addCoveragesByType(ChooseCoveragesByType.builder(Coverages.COVERAGE_C)
					.coverage_C(CoverageType_C.builder()
							.collision(Coverage.builder()
									.claimant(insuredName)
									.claimantType(testData.getClaimantType())
									.driverName(insuredName)
									.year(testData.getYear())
									.model(testData.getModel())
									.vehicle(testData.getVehicleName())
									.make(testData.getMake())
									.vin(testData.getVin())
									.lossOccurred(testData.getLossOccurred())
									.description(testData.getDamageDescription())
									.build())
							.build())
					.build());

			cc.createReserve(Reserve.builder()
					.costType(testData.getCostType())
					.costCategory(testData.getCostCategory())
					.reserveAmount(testData.getAmount())
					.coverageType(testData.getCoverage())
					.build());

			cc.paymentChecks(PaymentOptions.builder()
					.paymentType(PaymentType.MET_CHECK)
					.batchName(testData.getBatchName())
					.beforeRunStatus(testData.getBeforeStatus())
					.afterRunStatus(testData.getAfterStatus())
					.amount(testData.getAmount())
					.claimNumber(testData.getClaimNumber())
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
	 * @author lavanya.bala
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the Vendor-Auto Towing Agency contact creation for Commercial auto", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC213(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the Vendor-Auto Towing Agency contact creation for Commercial auto", driver);
		CommercialAutoDataEngine testData = new CommercialAutoDataEngine("CC_GWTestData_DataEngine.xlsx", "CommercialAuto", "TC213");

		try {	

			CommercialAutoStepsImpl cc = CommercialAutoSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			String insuredName = cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.createContact(Contact.builder().contactType(ContactType.VENDOR)
					.vendor(Vendor.builder()
							.autoTowingAgency(ContactDetails.builder()
									.name(insuredName)
									.taxId(testData.getTaxId())
									.address(testData.getAddress())
									.city(testData.getCity())
									.state(testData.getState())
									.roles(testData.getRoles())
									.build())
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
	 * @author lavanya.bala
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify that able to add a Audio equipment service for Commercial Auto claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC76(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to add a Audio equipment service for Commercial Auto claim", driver);
		CommercialAutoDataEngine testData = new CommercialAutoDataEngine("CC_GWTestData_DataEngine.xlsx", "CommercialAuto", "TC76");

		try {	

			CommercialAutoStepsImpl cc = CommercialAutoSteps.create();

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
	 * @author lavanya.bala
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the Note creation while creating a Commercial Auto claim ", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC134(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the Note creation while creating a Commercial Auto claim ", driver);
		CommercialAutoDataEngine testData = new CommercialAutoDataEngine("CC_GWTestData_DataEngine.xlsx", "CommercialAuto", "TC134");

		try {	

			CommercialAutoStepsImpl cc = CommercialAutoSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			cc.createClaim();

			String insuredName = cc.searchPolicy(Searchpolicy.builder()
					.policyNo(testData.getPolicyNumber())
					.lossDate(testData.getLossDate())
					.build());


			cc.SelectInvolvedPolicyVehicle();

			cc.createNote(CreateNote.builder()
					.text(testData.getPropertyDescription())
					.build());

			cc.enterBasicInformation(BasicInfo.builder()
					.insuredName(insuredName)
					.build());

			cc.addClaimInformation(ClaimInfo.builder()
					.lossCause(testData.getLossCause())
					.state(testData.getState())
					.city(testData.getCity())
					.addPropertyDamage(AddPropertyDamage.builder()
							.damageDescription(testData.getDamageDescription())
							.propertyDescription(testData.getPropertyDescription())
							.propertyName(testData.getPropertyName())
							.build())
					.build());

			cc.addServices(TowingAgency.builder()
					.name(testData.getName())
					.taxId(testData.getTaxId()) 
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
	 * @author lavanya.bala
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the upload document in Commercial Auto claim ", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC147(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the upload document in Commercial Auto claim ", driver);
		CommercialAutoDataEngine testData = new CommercialAutoDataEngine("CC_GWTestData_DataEngine.xlsx", "CommercialAuto", "TC147");

		try {	

			CommercialAutoStepsImpl cc = CommercialAutoSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.newDocumentClaim(ChooseDocumentsByType.builder().documentType(DocumentType.UPLOAD_DOCUMENT)
					.uploadDocument(UploadDocument.builder()
							.documentName("orrange.png")
							.documentType(testData.getDocumentType())
							.status(testData.getStatus())
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
	 * @author lavanya.bala
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the Assign functionality for Commercial Auto claim by using Search For Group", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC175(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the Assign functionality for Commercial Auto claim by using Search For Group", driver);
		CommercialAutoDataEngine testData = new CommercialAutoDataEngine("CC_GWTestData_DataEngine.xlsx", "CommercialAuto", "TC175");

		try {	

			CommercialAutoStepsImpl cc = CommercialAutoSteps.create();

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
	 * @author lavanya.bala
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the transfer check functionality for Commercial Auto claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC84(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the transfer check functionality for Commercial Auto claim", driver);
		CommercialAutoDataEngine testData = new CommercialAutoDataEngine("CC_GWTestData_DataEngine.xlsx", "CommercialAuto", "TC84");

		try {
			
            String claimNumber = CCDataGenerator.createClaimForCommercialAuto(testData.getPolicyNumber());
			
			CommercialAutoStepsImpl cc = CommercialAutoSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			String insuredName = cc.searchClaim(SearchClaim.builder().claimNo(claimNumber).build());
			
			cc.addCoverages(ChooseCoverages.builder(Coverages.LIABILITY_BODILY_INJURY_PROPERTY_DAMAGE)
					.liability_Coverage(Liability_BodilyCoverageAndPropertyCoverage.builder()
							.liability_BodilyInjury(Coverage.builder()
									.claimant(insuredName)
									.claimantType(testData.getClaimantType())
									.injuredPerson(insuredName)
									.lossParty(testData.getLossParty())
									.build())
							.build())
					.build());

			cc.createReserve(Reserve.builder()
					.costType(testData.getCostType())
					.costCategory(testData.getCostCategory())
					.reserveAmount(testData.getAmount())
					.coverageType(testData.getCoverage())
					.build());

			cc.paymentChecks(PaymentOptions.builder()
					.payer(insuredName)
					.reserveLine(testData.getPropertyName())
					.paymentType(PaymentType.MANUAL_CHECK)
					.city(testData.getCity())
					.state(testData.getState())
					.costType(testData.getCostType())
					.costCategory(testData.getCostCategory())
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
	 * @author lavanya.bala
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the Vendor-Autobody Repair shop contact creation for Commercial auto", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC214(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the Vendor-Autobody Repair shop contact creation for Commercial auto", driver);
		CommercialAutoDataEngine testData = new CommercialAutoDataEngine("CC_GWTestData_DataEngine.xlsx", "CommercialAuto", "TC214");

		try {	

			CommercialAutoStepsImpl cc = CommercialAutoSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			String insuredName = cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.createContact(Contact.builder().contactType(ContactType.VENDOR)
					.vendor(Vendor.builder()
							.autobodyRepairShop(ContactDetails.builder()
									.name(insuredName)
									.taxId(testData.getTaxId())
									.address(testData.getAddress())
									.city(testData.getCity())
									.state(testData.getState())
									.roles(testData.getRoles())
									.build())
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
}


