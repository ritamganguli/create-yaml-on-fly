package com.aspire.guidewire.cc.testscripts;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aspire.guidewire.api.datagenerator.CCDataGenerator;
import com.aspire.guidewire.cc.teststeps.personalauto.PersonalAutoConstants.AssignType;
import com.aspire.guidewire.cc.teststeps.personalauto.PersonalAutoConstants.ContactType;
import com.aspire.guidewire.cc.teststeps.personalauto.PersonalAutoConstants.Coverages;
import com.aspire.guidewire.cc.teststeps.personalauto.PersonalAutoConstants.DocumentType;
import com.aspire.guidewire.cc.teststeps.personalauto.PersonalAutoConstants.PaymentType;
import com.aspire.guidewire.cc.teststeps.personalauto.PersonalAutoFeatures.AddPropertyDamage;
import com.aspire.guidewire.cc.teststeps.personalauto.PersonalAutoFeatures.AssignClaim;
import com.aspire.guidewire.cc.teststeps.personalauto.PersonalAutoFeatures.BasicInfo;
import com.aspire.guidewire.cc.teststeps.personalauto.PersonalAutoFeatures.ChooseCoverages;
import com.aspire.guidewire.cc.teststeps.personalauto.PersonalAutoFeatures.ChooseCoveragesByType;
import com.aspire.guidewire.cc.teststeps.personalauto.PersonalAutoFeatures.ChooseDocumentsByType;
import com.aspire.guidewire.cc.teststeps.personalauto.PersonalAutoFeatures.ClaimInfo;
import com.aspire.guidewire.cc.teststeps.personalauto.PersonalAutoFeatures.Contact;
import com.aspire.guidewire.cc.teststeps.personalauto.PersonalAutoFeatures.ContactDetails;
import com.aspire.guidewire.cc.teststeps.personalauto.PersonalAutoFeatures.Coverage;
import com.aspire.guidewire.cc.teststeps.personalauto.PersonalAutoFeatures.CoverageType_C;
import com.aspire.guidewire.cc.teststeps.personalauto.PersonalAutoFeatures.CoverageType_D;
import com.aspire.guidewire.cc.teststeps.personalauto.PersonalAutoFeatures.CoverageType_E;
import com.aspire.guidewire.cc.teststeps.personalauto.PersonalAutoFeatures.CoverageType_P;
import com.aspire.guidewire.cc.teststeps.personalauto.PersonalAutoFeatures.CoverageType_R;
import com.aspire.guidewire.cc.teststeps.personalauto.PersonalAutoFeatures.CoverageType_T;
import com.aspire.guidewire.cc.teststeps.personalauto.PersonalAutoFeatures.CoverageType_U;
import com.aspire.guidewire.cc.teststeps.personalauto.PersonalAutoFeatures.CreateNote;
import com.aspire.guidewire.cc.teststeps.personalauto.PersonalAutoFeatures.EmailDetails;
import com.aspire.guidewire.cc.teststeps.personalauto.PersonalAutoFeatures.ExposureDetails;
import com.aspire.guidewire.cc.teststeps.personalauto.PersonalAutoFeatures.IndicateExistence;
import com.aspire.guidewire.cc.teststeps.personalauto.PersonalAutoFeatures.Legal;
import com.aspire.guidewire.cc.teststeps.personalauto.PersonalAutoFeatures.Liability_BodilyCoverageAndPropertyCoverage;
import com.aspire.guidewire.cc.teststeps.personalauto.PersonalAutoFeatures.LossDetails;
import com.aspire.guidewire.cc.teststeps.personalauto.PersonalAutoFeatures.MexicoCoverageLimited;
import com.aspire.guidewire.cc.teststeps.personalauto.PersonalAutoFeatures.PaymentOptions;
import com.aspire.guidewire.cc.teststeps.personalauto.PersonalAutoFeatures.ReOpenClaim;
import com.aspire.guidewire.cc.teststeps.personalauto.PersonalAutoFeatures.Reserve;
import com.aspire.guidewire.cc.teststeps.personalauto.PersonalAutoFeatures.SearchClaim;
import com.aspire.guidewire.cc.teststeps.personalauto.PersonalAutoFeatures.Searchpolicy;
import com.aspire.guidewire.cc.teststeps.personalauto.PersonalAutoFeatures.ServiceDetails;
import com.aspire.guidewire.cc.teststeps.personalauto.PersonalAutoFeatures.SubrogationDetails;
import com.aspire.guidewire.cc.teststeps.personalauto.PersonalAutoFeatures.TemplateClaim;
import com.aspire.guidewire.cc.teststeps.personalauto.PersonalAutoFeatures.UploadDocument;
import com.aspire.guidewire.cc.teststeps.personalauto.PersonalAutoFeatures.Vendor;
import com.aspire.guidewire.cc.teststeps.personalauto.PersonalAutoDataEngine;
import com.aspire.guidewire.cc.teststeps.personalauto.PersonalAutoSteps;
import com.aspire.guidewire.cc.teststeps.personalauto.PersonalAutoStepsImpl;
import com.aspire.guidewire.utils.DataProviderUtils;
import com.aspire.guidewire.utils.EnvironmentPropertiesReader;
import com.aspire.guidewire.utils.Log;
import com.aspire.guidewire.webdriverManager.DriverManager;


public class CC_PersonalAutoSuite  {

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
	 * Test Description: To verify the auto claim creation
	 * Test ID: TC4
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the auto claim creation", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC4(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the auto claim creation", driver);
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("CC_GWTestData_DataEngine.xlsx", "PersonalAuto", "TC4");
		try {	

			PersonalAutoStepsImpl cc = PersonalAutoSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			cc.createClaim();
			
			String insuredName = cc.searchPolicy(Searchpolicy.builder()
					.policyNo(testData.getPolicy())
					.lossDate(testData.getLossDate())
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

			cc.addServices();

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
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the exposure creation for Collision coverage", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC21(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();

		Log.testCaseInfo("To verify the exposure creation for Collision coverage", driver);
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("CC_GWTestData_DataEngine.xlsx", "PersonalAuto", "TC21");
		try {	

			PersonalAutoStepsImpl cc = PersonalAutoSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			String insuredName = cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());
			
			cc.addCoveragesByType(ChooseCoveragesByType.builder(Coverages.COVERAGE_C)
					.coverage_C(CoverageType_C.builder()
							.collision(Coverage.builder()
									.claimant(insuredName)
									.claimantType(testData.getClaimantType())
									.make(testData.getMake())
									.model(testData.getModel())
									.year(testData.getYear())
									.vehicleName(testData.getVehicleName())
									.driverName(insuredName)
									.lossOccurred(testData.getLossOccurred())
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
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the exposure creation for Comprehensive coverage", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC22(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the exposure creation for Collision coverage", driver);
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("CC_GWTestData_DataEngine.xlsx", "PersonalAuto", "TC22");

		try {	

			PersonalAutoStepsImpl cc = PersonalAutoSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			String insuredName = cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.addCoveragesByType(ChooseCoveragesByType.builder(Coverages.COVERAGE_C)
					.coverage_C(CoverageType_C.builder()
							.comprehensive(Coverage.builder()
									.claimant(insuredName)
									.claimantType(testData.getClaimantType())
									.make(testData.getMake())
									.model(testData.getModel())
									.year(testData.getYear())
									.vehicleName(testData.getVehicleName())
									.driverName(insuredName)
									.lossOccurred(testData.getLossOccurred())
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
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the exposure creation for PIP - Kentucky coverage", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC23(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();

		Log.testCaseInfo("To verify the exposure creation for PIP - Kentucky coverage", driver);
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("CC_GWTestData_DataEngine.xlsx", "PersonalAuto", "TC23");
		try {	
			PersonalAutoStepsImpl cc = PersonalAutoSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			String insuredName = cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.addCoveragesByType(ChooseCoveragesByType.builder(Coverages.COVERAGE_P)
					.coverage_P(CoverageType_P.builder()
							.PIP_Kentucky(Coverage.builder()
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
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the exposure creation for Mexico coverage - PD", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC33(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the exposure creation for Mexico coverage - PD", driver);
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("CC_GWTestData_DataEngine.xlsx", "PersonalAuto", "TC33");

		try {	

			PersonalAutoStepsImpl cc = PersonalAutoSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			String insuredName = cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.addCoverages(ChooseCoverages.builder(Coverages.MEXICO_COVERAGE_LIMITED)
					.contactDetails(ContactDetails.builder()
							.firstName(testData.getFirstName())
							.lastName(testData.getLastName())
							.taxIdSSN(testData.getTaxId())
							.address(testData.getAddress())
							.city(testData.getCity())
							.state(testData.getState())
							.build())
					.mexicoCoverage(MexicoCoverageLimited.builder()
							.mexicoCoverage_PD(Coverage.builder()
									.claimant(insuredName)
									.claimantType(testData.getClaimantType())
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
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the exposure creation for Rental Reimbursement coverage", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC37(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the exposure creation for Rental Reimbursement coverage", driver);
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("CC_GWTestData_DataEngine.xlsx", "PersonalAuto", "TC37");

		try {	

			PersonalAutoStepsImpl cc = PersonalAutoSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			String insuredName = cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());
			
			cc.addCoveragesByType(ChooseCoveragesByType.builder(Coverages.COVERAGE_R)
					.coverage_R(CoverageType_R.builder()
							.rentalReimbursement(Coverage.builder()
									.claimant(insuredName)
									.claimantType(testData.getClaimantType())
									.make(testData.getMake())
									.model(testData.getModel())
									.year(testData.getYear())
									.vehicleName(testData.getVehicleName())
									.driverName(insuredName)
									.lossOccurred(testData.getLossOccurred())
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
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the exposure creation for UMPD coverage", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC41(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the exposure creation for UMPD coverage", driver);
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("CC_GWTestData_DataEngine.xlsx", "PersonalAuto", "TC41");

		try {	

			PersonalAutoStepsImpl cc = PersonalAutoSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			String insuredName = cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());
			
			cc.addCoveragesByType(ChooseCoveragesByType.builder(Coverages.COVERAGE_U)
					.coverage_U(CoverageType_U.builder()
							.uninsuredMotoristsPropertyDamage(Coverage.builder()
									.claimant(insuredName)
									.claimantType(testData.getClaimantType())
									.make(testData.getMake())
									.model(testData.getModel())
									.year(testData.getYear())
									.vehicleName(testData.getVehicleName())
									.driverName(insuredName)
									.lossOccurred(testData.getLossOccurred())
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
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the exposure creation for Tape/Disc media coverage", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC39(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the exposure creation for Tape/Disc media coverage",driver);
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("CC_GWTestData_DataEngine.xlsx", "PersonalAuto", "TC39");

		try {	

			PersonalAutoStepsImpl cc = PersonalAutoSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			String insuredName = cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.addCoveragesByType(ChooseCoveragesByType.builder(Coverages.COVERAGE_T)
					.coverage_T(CoverageType_T.builder()
							.tapeAndDisc(Coverage.builder()
									.claimant(insuredName)
									.claimantType(testData.getClaimantType())
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
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the exposure creation for Towing and labor coverage", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC40(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the exposure creation for Towing and labor coverage",driver);
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("CC_GWTestData_DataEngine.xlsx", "PersonalAuto", "TC40");

		try {	

			PersonalAutoStepsImpl cc = PersonalAutoSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			String insuredName = cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.addCoveragesByType(ChooseCoveragesByType.builder(Coverages.COVERAGE_T)
					.coverage_T(CoverageType_T.builder()
							.towingAndLabor(Coverage.builder()
									.claimant(insuredName)
									.claimantType(testData.getClaimantType())
									.make(testData.getMake())
									.model(testData.getModel())
									.year(testData.getYear())
									.vehicleName(testData.getVehicleName())
									.driverName(insuredName)
									.lossOccurred(testData.getLossOccurred())
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
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the exposure creation for Liability- Bodily Injury coverage", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC24(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the exposure creation for Liability- Bodily Injury coverage",driver);
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("CC_GWTestData_DataEngine.xlsx", "PersonalAuto", "TC24");

		try {	

			PersonalAutoStepsImpl cc = PersonalAutoSteps.create();

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
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the exposure creation for UMBI coverage", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC28(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the exposure creation for UMBI coverage",driver);
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("CC_GWTestData_DataEngine.xlsx", "PersonalAuto", "TC28");

		try {	

			PersonalAutoStepsImpl cc = PersonalAutoSteps.create();

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
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the exposure creation for UIMBI coverage", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC29(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the exposure creation for UIMBI coverage",driver);
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("CC_GWTestData_DataEngine.xlsx", "PersonalAuto", "TC29");

		try {	

			PersonalAutoStepsImpl cc = PersonalAutoSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			String insuredName = cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.addCoverages(ChooseCoverages.builder(Coverages.UNDERINSURED_MOTORIST_BODILY_INJURY)
					.contactDetails(ContactDetails.builder()
							.firstName(testData.getFirstName())
							.lastName(testData.getLastName())
							.taxIdSSN(testData.getTaxId())
							.address(testData.getAddress())
							.city(testData.getCity())
							.state(testData.getState())
							.build())
					.underInsuredMotoristsodilyInjury(Coverage.builder()
							.claimantType(testData.getClaimantType())
							.injuredPerson(insuredName)
							.lossParty(testData.getLossParty())
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
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the exposure creation for Death and disability benefit coverage", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC30(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the exposure creation for Death and disability benefit coverage",driver);
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("CC_GWTestData_DataEngine.xlsx", "PersonalAuto", "TC30");

		try {	

			PersonalAutoStepsImpl cc = PersonalAutoSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			String insuredName = cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.addCoveragesByType(ChooseCoveragesByType.builder(Coverages.COVERAGE_D)
					.coverage_D(CoverageType_D.builder()
							.deathAndDisability(Coverage.builder()
									.claimant(insuredName)
									.claimantType(testData.getClaimantType())
									.injuredPerson(insuredName)
									.lossParty(testData.getLossParty()).build())
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
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the exposure creation for Electronic equipment coverage", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC31(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the exposure creation for Electronic equipment coverage",driver);
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("CC_GWTestData_DataEngine.xlsx", "PersonalAuto", "TC31");

		try {	

			PersonalAutoStepsImpl cc = PersonalAutoSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			String insuredName = cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.addCoveragesByType(ChooseCoveragesByType.builder(Coverages.COVERAGE_E)
					.coverage_E(CoverageType_E.builder()
							.electronicEquipment(Coverage.builder()
									.claimant(insuredName)
									.claimantType(testData.getClaimantType())
									.make(testData.getMake())
									.model(testData.getModel())
									.year(testData.getYear())
									.vehicleName(testData.getVehicleName())
									.driverName(insuredName)
									.lossOccurred(testData.getLossOccurred())
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
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the exposure creation for Mexico coverage - BI", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC32(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the exposure creation for Mexico coverage - BI",driver);
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("CC_GWTestData_DataEngine.xlsx", "PersonalAuto", "TC32");

		try {	

			PersonalAutoStepsImpl cc = PersonalAutoSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			String insuredName = cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.addCoverages(ChooseCoverages.builder(Coverages.MEXICO_COVERAGE_LIMITED)
					.mexicoCoverage(MexicoCoverageLimited.builder()
							.mexicoCoverage_BI(Coverage.builder()
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
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the exposure creation for Rental car loss of use coverage", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC38(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the exposure creation for Rental car loss of use coverage",driver);
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("CC_GWTestData_DataEngine.xlsx", "PersonalAuto", "TC38");

		try {	

			PersonalAutoStepsImpl cc = PersonalAutoSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			String insuredName = cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.addCoveragesByType(ChooseCoveragesByType.builder(Coverages.COVERAGE_R)
					.coverage_R(CoverageType_R.builder()
							.rentalCarLossOfUse(Coverage.builder()
									.claimant(insuredName)
									.claimantType(testData.getClaimantType())
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
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the exposure creation for UIMPD coverage", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC42(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the exposure creation for UIMPD coverage",driver);
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("CC_GWTestData_DataEngine.xlsx", "PersonalAuto", "TC42");
		
		try {	

			PersonalAutoStepsImpl cc = PersonalAutoSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			String insuredName = cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.addCoveragesByType(ChooseCoveragesByType.builder(Coverages.COVERAGE_U)
					.coverage_U(CoverageType_U.builder()
							.underInsuredMotoristsPropertyDamage(Coverage.builder()
									.claimant(insuredName)
									.claimantType(testData.getClaimantType())
									.make(testData.getMake())
									.model(testData.getModel())
									.year(testData.getYear())
									.vehicleName(testData.getVehicleName())
									.driverName(insuredName)
									.lossOccurred(testData.getLossOccurred())
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
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the Note creation while creating an auto claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC133(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the Note creation while creating an auto claim",driver);
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("CC_GWTestData_DataEngine.xlsx", "PersonalAuto", "TC133");
		
		try {	

			PersonalAutoStepsImpl cc = PersonalAutoSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			cc.createClaim();

			String insuredName = cc.searchPolicy(Searchpolicy.builder()
					.policyNo(testData.getPolicy())
					.lossDate(testData.getLossDate())
					.build());

			cc.createNote(CreateNote.builder().text(testData.getText()).build());

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

			cc.addServices();

			cc.saveAndAssignClaim();

			cc.viewClaim();

			cc.verifyNoteCreation(CreateNote.builder()
					.text(testData.getText())
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
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the Vendor-Autobody Repair shop contact creation for personal auto", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC224(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the Vendor-Autobody Repair shop contact creation for personal auto",driver);
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("CC_GWTestData_DataEngine.xlsx", "PersonalAuto", "TC224");
		
		try {	

			PersonalAutoStepsImpl cc = PersonalAutoSteps.create();

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

	/**
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the Vendor-Auto Towing Agency contact creation for personal auto", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC225(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the Vendor-Auto Towing Agency contact creation for personal auto",driver);
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("CC_GWTestData_DataEngine.xlsx", "PersonalAuto", "TC225");
		
		try {	

			PersonalAutoStepsImpl cc = PersonalAutoSteps.create();

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
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the Contact-Person creation for auto claim ", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC223(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the Contact-Person creation for auto claim ",driver);
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("CC_GWTestData_DataEngine.xlsx", "PersonalAuto", "TC223");
		
		try {	

			PersonalAutoStepsImpl cc = PersonalAutoSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());
			
			cc.createContact(Contact.builder().contactType(ContactType.PERSON)
					.person(ContactDetails.builder()
							.firstName(testData.getFirstName())
							.lastName(testData.getLastName())
							.taxIdSSN(testData.getTaxId())
							.address(testData.getAddress())
							.city(testData.getCity())
							.state(testData.getState())
							.roles(testData.getRoles())
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
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the Vendor-Doctor contact creation for auto claim ", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC226(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the Vendor-Doctor contact creation for auto claim ",driver);
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("CC_GWTestData_DataEngine.xlsx", "PersonalAuto", "TC226");
		
		try {	

			PersonalAutoStepsImpl cc = PersonalAutoSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.createContact(Contact.builder().contactType(ContactType.VENDOR)
					.vendor(Vendor.builder()
							.doctor(ContactDetails.builder()
									.firstName(testData.getFirstName())
									.lastName(testData.getLastName())
									.taxIdSSN(testData.getTaxId())
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
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the Vendor-Medical Care Organization contact creation for auto claim ", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC227(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the Vendor-Medical Care Organization contact creation for auto claim ",driver);
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("CC_GWTestData_DataEngine.xlsx", "PersonalAuto", "TC227");
		
		try {	

			PersonalAutoStepsImpl cc = PersonalAutoSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			String insuredName = cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());
			
			cc.createContact(Contact.builder().contactType(ContactType.VENDOR)
					.vendor(Vendor.builder()
							.medicalCareOrganization(ContactDetails.builder()
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
	 * @author surendar.baskaran
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the Vendor-Vendor(Company) contact creation for auto claim ", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC228(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the Vendor-Vendor(Company) contact creation for auto claim ",driver);
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("CC_GWTestData_DataEngine.xlsx", "PersonalAuto", "TC228");
		
		try {	

			PersonalAutoStepsImpl cc = PersonalAutoSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			String insuredName = cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());
			
			cc.createContact(Contact.builder().contactType(ContactType.VENDOR)
					.vendor(Vendor.builder()
							.vendor_Company(ContactDetails.builder()
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
	 * @author surendar.baskaran
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the Company contact creation for auto claim ", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC229(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the Company contact creation for auto claim",driver);
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("CC_GWTestData_DataEngine.xlsx", "PersonalAuto", "TC229");
		
		try {	

			PersonalAutoStepsImpl cc = PersonalAutoSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			String insuredName = cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());
			
			cc.createContact(Contact.builder().contactType(ContactType.COMPANY)
					.company(ContactDetails.builder()
							.name(insuredName)
							.taxId(testData.getTaxId())
							.address(testData.getAddress())
							.city(testData.getCity())
							.state(testData.getState())
							.roles(testData.getRoles())
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
	 * @author surendar.baskaran
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the Legal - Adjudicator contact creation for auto claim ", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC230(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();

		Log.testCaseInfo("To verify the Legal - Adjudicator contact creation for auto claim ",driver);

		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("CC_GWTestData_DataEngine.xlsx", "PersonalAuto", "TC230");
		try {	

			PersonalAutoStepsImpl cc = PersonalAutoSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.createContact(Contact.builder().contactType(ContactType.LEGAL)
					.legal(Legal.builder()
							.adjudicator(ContactDetails.builder()
									.firstName(testData.getFirstName())
									.lastName(testData.getLastName())
									.taxIdSSN(testData.getTaxId())
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
	 * @author surendar.baskaran
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the Legal - Attorney contact creation for auto claim ", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC231(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the Legal - Attorney contact creation for auto claim",driver);
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("CC_GWTestData_DataEngine.xlsx", "PersonalAuto", "TC231");
		
		try {	

			PersonalAutoStepsImpl cc = PersonalAutoSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.createContact(Contact.builder().contactType(ContactType.LEGAL)
					.legal(Legal.builder()
							.attorney(ContactDetails.builder()
									.firstName(testData.getFirstName())
									.lastName(testData.getLastName())
									.taxIdSSN(testData.getTaxId())
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
	 * @author surendar.baskaran
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the Legal - Law Firm contact creation for auto claim ", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC232(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the Legal - Law Firm contact creation for auto claim ",driver);
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("CC_GWTestData_DataEngine.xlsx", "PersonalAuto", "TC232");
	
		try {	

			PersonalAutoStepsImpl cc = PersonalAutoSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			String insuredName = cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.createContact(Contact.builder().contactType(ContactType.LEGAL)
					.legal(Legal.builder()
							.lawFirm(ContactDetails.builder()
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
	 * @author surendar.baskaran
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the Legal - Legal Venue contact creation for auto claim ", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC233(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the Legal - Legal Venue contact creation for auto claim ",driver);
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("CC_GWTestData_DataEngine.xlsx", "PersonalAuto", "TC233");
		
		try {	

			PersonalAutoStepsImpl cc = PersonalAutoSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			String insuredName = cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.createContact(Contact.builder().contactType(ContactType.LEGAL)
					.legal(Legal.builder()
							.legalVenue(ContactDetails.builder()
									.name(insuredName)
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
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the Assign functionality for auto claim by using Search by location", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC169(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the Assign functionality for auto claim by using Search by location",driver);
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("CC_GWTestData_DataEngine.xlsx", "PersonalAuto", "TC169");
		
		try {	

			PersonalAutoStepsImpl cc = PersonalAutoSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.assignClaim(AssignClaim.builder()
					.assignType(AssignType.SEARCH_BY_LOCATION)
					.location(testData.getLocation())
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
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the Assign functionality for auto claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC165(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the Assign functionality for auto claim",driver);
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("CC_GWTestData_DataEngine.xlsx", "PersonalAuto", "TC165");
		
		try {	

			PersonalAutoStepsImpl cc = PersonalAutoSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.assignClaim(AssignClaim.builder()
					.assignType(AssignType.SELECT_FROM_LIST).build());


			Log.testCaseResult(driver);
		} catch (Exception e) {
			Log.exception(e, DriverManager.getDriver());
		} finally {
			DriverManager.quitDriver();
			Log.endTestCase();
		}
	}

	/**
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the Assign functionality for auto claim by using Search by distance from a location", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC173(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the Assign functionality for auto claim by using Search by distance from a location",driver);
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("CC_GWTestData_DataEngine.xlsx", "PersonalAuto", "TC173");
		
		try {	

			PersonalAutoStepsImpl cc = PersonalAutoSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.assignClaim(AssignClaim.builder()
					.assignType(AssignType.SEARCH_BY_DISTANCE_FROM_LOCATION)
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
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the subrogation flow in auto claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC131(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the subrogation flow in auto claim",driver);
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("CC_GWTestData_DataEngine.xlsx", "PersonalAuto", "TC131");
		
		try {	

			PersonalAutoStepsImpl cc = PersonalAutoSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());
			
			cc.updateLossDetails(LossDetails.builder()
					.faultRating(testData.getFaultRating())
					.build());

			cc.addSubrogation(SubrogationDetails.builder()
					.status(testData.getInitialStatus())	
					.build());

			cc.addSubrogation(SubrogationDetails.builder()
					.outcome(testData.getOutcome())
					.status(testData.getFinalStatus())
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
	 * @author surendar.baskaran
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the Email creation for auto claim ", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC193(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the Email creation for auto claim ",driver);
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("CC_GWTestData_DataEngine.xlsx", "PersonalAuto", "TC193");
		
		try {	

			PersonalAutoStepsImpl cc = PersonalAutoSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.emailClaim(EmailDetails.builder()
					.emailAdress(testData.getEmailAddress())
					.subject(testData.getSubject())
					.body(testData.getBody())
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
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify that able to add a Adjudicate claim service for auto claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC255(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to add a Adjudicate claim service for auto claim",driver);
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("CC_GWTestData_DataEngine.xlsx", "PersonalAuto", "TC255");
		
		try {	

			PersonalAutoStepsImpl cc = PersonalAutoSteps.create();

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
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify that able to add a Appraisal service for auto claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC256(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to add a Appraisal service for auto claim",driver);
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("CC_GWTestData_DataEngine.xlsx", "PersonalAuto", "TC256");
		
		try {	

			PersonalAutoStepsImpl cc = PersonalAutoSteps.create();

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
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify that able to add a Audio equipment service for auto claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC257(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to add a Audio equipment service for auto claim",driver);
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("CC_GWTestData_DataEngine.xlsx", "PersonalAuto", "TC257");
		
		try {	

			PersonalAutoStepsImpl cc = PersonalAutoSteps.create();

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
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify that able to add a Auto body service for auto claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC258(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to add a Auto body service for auto claim",driver);
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("CC_GWTestData_DataEngine.xlsx", "PersonalAuto", "TC258");
		
		try {	

			PersonalAutoStepsImpl cc = PersonalAutoSteps.create();

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
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify that able to add a Glass service for auto claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC259(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to add a Glass service for auto claim",driver);
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("CC_GWTestData_DataEngine.xlsx", "PersonalAuto", "TC259");
		
		try {	

			PersonalAutoStepsImpl cc = PersonalAutoSteps.create();

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
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify that able to add a Provide courtesy car service for auto claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC260(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to add a Provide courtesy car service for auto claim",driver);
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("CC_GWTestData_DataEngine.xlsx", "PersonalAuto", "TC260");
		
		try {	

			PersonalAutoStepsImpl cc = PersonalAutoSteps.create();

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
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify that able to add a Roadside assistance service for auto claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC261(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to add a Roadside assistance service for auto claim",driver);
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("CC_GWTestData_DataEngine.xlsx", "PersonalAuto", "TC261");
		
		try {	

			PersonalAutoStepsImpl cc = PersonalAutoSteps.create();

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
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify that able to add a Salvage service for auto claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC262(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to add a Salvage service for auto claim",driver);
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("CC_GWTestData_DataEngine.xlsx", "PersonalAuto", "TC262");
		
		try {	

			PersonalAutoStepsImpl cc = PersonalAutoSteps.create();

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
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify that able to add a Towing service for auto claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC263(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to add a Towing service for auto claim",driver);
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("CC_GWTestData_DataEngine.xlsx", "PersonalAuto", "TC263");
		
		try {	

			PersonalAutoStepsImpl cc = PersonalAutoSteps.create();

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
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify that able to create a Recovery for auto claim using Credit to expense", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC406(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to create a Recovery for auto claim using Credit to expense",driver);
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("CC_GWTestData_DataEngine.xlsx", "PersonalAuto", "TC406");
		
		try {	

			PersonalAutoStepsImpl cc = PersonalAutoSteps.create();

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
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify that able to create a Recovery for auto claim using Credit to loss", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC410(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to create a Recovery for auto claim using Credit to loss",driver);
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("CC_GWTestData_DataEngine.xlsx", "PersonalAuto", "TC410");
		
		try {	

			PersonalAutoStepsImpl cc = PersonalAutoSteps.create();

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
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify that able to create a Recovery for auto claim using Deductible", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC414(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to create a Recovery for auto claim using Deductible",driver);
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("CC_GWTestData_DataEngine.xlsx", "PersonalAuto", "TC414");
		
		try {	

			PersonalAutoStepsImpl cc = PersonalAutoSteps.create();

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
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify that able to create a Recovery for auto claim using Salvage", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC418(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to create a Recovery for auto claim using Salvage",driver);
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("CC_GWTestData_DataEngine.xlsx", "PersonalAuto", "TC418");
		
		try {	

			PersonalAutoStepsImpl cc = PersonalAutoSteps.create();

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
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify that able to create a Recovery for auto claim using Subrogation", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC422(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to create a Recovery for auto claim using Subrogation",driver);
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("CC_GWTestData_DataEngine.xlsx", "PersonalAuto", "TC422");
		
		try {	

			PersonalAutoStepsImpl cc = PersonalAutoSteps.create();

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
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify that able to create a Recovery for auto claim using Unspecified recovery category ", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC426(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to create a Recovery for auto claim using Unspecified recovery category ",driver);
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("CC_GWTestData_DataEngine.xlsx", "PersonalAuto", "TC426");
		
		try {	

			PersonalAutoStepsImpl cc = PersonalAutoSteps.create();

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
	 * @author surendar.baskaran
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the New document creation using create from a template in auto claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC141(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the New document creation using create from a template in auto claim",driver);
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("CC_GWTestData_DataEngine.xlsx", "PersonalAuto", "TC141");
		
		try {	
			PersonalAutoStepsImpl cc = PersonalAutoSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.createDocument(ChooseDocumentsByType.builder().documentType(DocumentType.TEMPLATE_CLAIM)
					.templateClaim(TemplateClaim.builder()
							.type(testData.getType())
							.jurisdiction(testData.getJurisdictionState())
							.build())
					.build());

			cc.verifyDocumentCreation();

		} catch (Exception e) {
			Log.exception(e, DriverManager.getDriver());
		} finally {
			Log.testCaseResult(driver);
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}

	/**
	 * @author surendar.baskaran
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the upload document in auto claim ", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC145(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the upload document in auto claim ",driver);
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("CC_GWTestData_DataEngine.xlsx", "PersonalAuto", "TC145");
		
		try {	

			PersonalAutoStepsImpl cc = PersonalAutoSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.createDocument(ChooseDocumentsByType.builder().documentType(DocumentType.UPLOAD_DOCUMENT)
					.uploadDocument(UploadDocument.builder()
							.documentName(testData.getDocumentName())
							.documentType(testData.getDocumentType())
							.status(testData.getStatus())
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
	 * @author surendar.baskaran
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the document creation using Indicate existence of a Document in auto claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC149(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the document creation using Indicate existence of a Document in auto claim",driver);
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("CC_GWTestData_DataEngine.xlsx", "PersonalAuto", "TC149");
		
		try {	

			PersonalAutoStepsImpl cc = PersonalAutoSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			String insuredName = cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.createDocument(ChooseDocumentsByType.builder().documentType(DocumentType.INDICATE_EXISTENCE)
					.indicateExistence(IndicateExistence.builder()
							.name(insuredName)
							.documentType(testData.getDocumentType())
							.status(testData.getStatus())
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
	 * @author surendar.baskaran
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the New document creation using create from a template while creating an auto claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC153(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the New document creation using create from a template while creating an auto claim",driver);
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("CC_GWTestData_DataEngine.xlsx", "PersonalAuto", "TC153");
	
		try {	

			PersonalAutoStepsImpl cc = PersonalAutoSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			cc.createClaim();

			String insuredName = cc.searchPolicy(Searchpolicy.builder()
					.policyNo(testData.getPolicy())
					.lossDate(testData.getLossDate())
					.build());

			cc.createDocument(ChooseDocumentsByType.builder().documentType(DocumentType.TEMPLATE_CLAIM)
					.templateClaim(TemplateClaim.builder()
							.newDocument(true)
							.type(testData.getType())
							.jurisdiction(testData.getJurisdictionState())
							.build())
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

			cc.addServices();

			cc.saveAndAssignClaim();

			cc.viewClaim();

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
	 * @author surendar.baskaran
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the upload document in auto claim ", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC157(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the upload document in auto claim ",driver);
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("CC_GWTestData_DataEngine.xlsx", "PersonalAuto", "TC157");
		
		try {	

			PersonalAutoStepsImpl cc = PersonalAutoSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			cc.createClaim();

			String insuredName = cc.searchPolicy(Searchpolicy.builder()
					.policyNo(testData.getPolicy())
					.lossDate(testData.getLossDate())
					.build());

			cc.createDocument(ChooseDocumentsByType.builder().documentType(DocumentType.UPLOAD_DOCUMENT)
					.uploadDocument(UploadDocument.builder()
							.newDocument(true)		
							.documentName(testData.getDocumentName())
							.documentType(testData.getDocumentType())
							.status(testData.getStatus())
							.build())
					.build());

			cc.enterBasicInformation(BasicInfo.builder()
					.insuredName(insuredName)
					.build());

			cc.addClaimInformation(ClaimInfo.builder()
					.lossCause(testData.getLossCause())
					.state(testData.getState())
					.city(testData.getCity())
					.build());

			cc.addServices();

			cc.saveAndAssignClaim();

			cc.viewClaim();

			cc.verifyDocumentCreation();

		} catch (Exception e) {
			Log.exception(e, DriverManager.getDriver());
		} finally {
			Log.testCaseResult(driver);
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}

	/**
	 * @author surendar.baskaran
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the document creation using Indicate existence of a Document while creating an auto claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC161(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the document creation using Indicate existence of a Document while creating an auto claim",driver);
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("CC_GWTestData_DataEngine.xlsx", "PersonalAuto", "TC161");
		
		try {	

			PersonalAutoStepsImpl cc = PersonalAutoSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			cc.createClaim();

			String insuredName = cc.searchPolicy(Searchpolicy.builder()
					.policyNo(testData.getPolicy())
					.lossDate(testData.getLossDate())
					.build());

			cc.createDocument(ChooseDocumentsByType.builder().documentType(DocumentType.INDICATE_EXISTENCE)
					.indicateExistence(IndicateExistence.builder()
							.newDocument(true)
							.name(insuredName)
							.documentType(testData.getDocumentType())
							.status(testData.getStatus()).build())
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

			cc.addServices();

			cc.saveAndAssignClaim();

			cc.viewClaim();

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
	 * @author surendar.baskaran
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the Reopen Exposure functionality for auto claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC181(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the Reopen Exposure functionality for auto claim",driver);
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("CC_GWTestData_DataEngine.xlsx", "PersonalAuto", "TC181");
		
		try {	

			PersonalAutoStepsImpl cc = PersonalAutoSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			String insuredName = cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.addCoveragesByType(ChooseCoveragesByType.builder(Coverages.COVERAGE_C)
					.coverage_C(CoverageType_C.builder()
							.collision(Coverage.builder()
									.claimant(insuredName)
									.claimantType(testData.getClaimantType())
									.make(testData.getMake())
									.model(testData.getModel())
									.year(testData.getYear())
									.vehicleName(testData.getVehicleName())
									.driverName(insuredName)
									.lossOccurred(testData.getLossOccurred())
									.build())
							.build())
					.coverage(testData.getCoverage())
					.build());

			cc.updateExposure(ExposureDetails.builder()
					.note(testData.getNote())
					.outcome(testData.getOutcome())
					.closeExposureValue(testData.getClosedExposureValue())
					.note(testData.getNote())
					.reason(testData.getReason())
					.openExposureValue(testData.getOpenExposureValue())
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
	 * @author surendar.baskaran
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the Reopen Claim functionality for auto claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC189(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the Reopen Claim functionality for auto claim",driver);
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("CC_GWTestData_DataEngine.xlsx", "PersonalAuto", "TC189");
		
		try {	

			PersonalAutoStepsImpl cc = PersonalAutoSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());
			
			cc.reOpenClaim(ReOpenClaim.builder()
					.note(testData.getNote())
					.outcome(testData.getOutcome())
					.closedStatus(testData.getClosedExposureValue())
					.note(testData.getNote())
					.reason(testData.getReason())
					.openStatus(testData.getOpenExposureValue())
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
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the reserves creation for Collision exposure", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC83(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the reserves creation for Collision exposure",driver);
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("CC_GWTestData_DataEngine.xlsx", "PersonalAuto", "TC83");
		
		try {	

			PersonalAutoStepsImpl cc = PersonalAutoSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			String insuredName = cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());
			
			cc.addCoveragesByType(ChooseCoveragesByType.builder(Coverages.COVERAGE_C)
					.coverage_C(CoverageType_C.builder()
							.collision(Coverage.builder()
									.claimant(insuredName)
									.claimantType(testData.getClaimantType())
									.make(testData.getMake())
									.model(testData.getModel())
									.year(testData.getYear())
									.vehicleName(testData.getVehicleName())
									.driverName(insuredName)
									.lossOccurred(testData.getLossOccurred())
									.build())
							.build())
					.coverage(testData.getCoverage())
					.build());

			cc.createReserve(Reserve.builder()
					.costType(testData.getCostType())
					.costCategory(testData.getCostCategory())
					.reserveAmount(testData.getAmount())
					.coverageType(testData.getCoverageType())
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
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the reserves creation for Medical expense exposure", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC87(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the reserves creation for Medical expense exposure",driver);
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("CC_GWTestData_DataEngine.xlsx", "PersonalAuto", "TC87");
	
		try {	

			PersonalAutoStepsImpl cc = PersonalAutoSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			String insuredName = cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());
			
			cc.addCoverages(ChooseCoverages.builder(Coverages.MEDICAL_PAYMENTS)
					.medicalpayments(Coverage.builder()
							.claimant(insuredName)
							.claimantType(testData.getClaimantType())
							.injuredPerson(insuredName)
							.lossParty(testData.getLossParty())
							.build())
					.coverage(testData.getCoverage())
					.build());

			cc.createReserve(Reserve.builder()
					.costType(testData.getCostType())
					.costCategory(testData.getCostCategory())
					.reserveAmount(testData.getAmount())
					.coverageType(testData.getCoverageType())
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
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the check payment for auto claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC372(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the check payment for auto claim",driver);
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("CC_GWTestData_DataEngine.xlsx", "PersonalAuto", "TC372");
		
		try {	

			PersonalAutoStepsImpl cc = PersonalAutoSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			String insuredName = cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.addCoveragesByType(ChooseCoveragesByType.builder(Coverages.COVERAGE_C)
					.coverage_C(CoverageType_C.builder()
							.collision(Coverage.builder()
									.claimant(insuredName)
									.claimantType(testData.getClaimantType())
									.make(testData.getMake())
									.model(testData.getModel())
									.year(testData.getYear())
									.vehicleName(testData.getVehicleName())
									.driverName(insuredName)
									.lossOccurred(testData.getLossOccurred())
									.description(testData.getDescription())
									.vin(testData.getVin())
									.build())
							.build())
					.coverage(testData.getCoverage())
					.build());

			cc.createReserve(Reserve.builder()
					.costType(testData.getCostType())
					.costCategory(testData.getCostCategory())
					.reserveAmount(testData.getAmount())
					.coverageType(testData.getCoverageType())
					.build());

			cc.paymentChecks(PaymentOptions.builder()
					.paymentType(PaymentType.MET_CHECK)
					.batchName(testData.getBatchName())
					.beforeRunStatus(testData.getBeforeRunStatus())
					.afterRunStatus(testData.getAfterRunStatus())
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
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the manual check payment for auto claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC376(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the manual check payment for auto claim",driver);
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("CC_GWTestData_DataEngine.xlsx", "PersonalAuto", "TC376");
		
		try {	

			PersonalAutoStepsImpl cc = PersonalAutoSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			String insuredName = cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.addCoverages(ChooseCoverages.builder(Coverages.LIABILITY_BODILY_INJURY_PROPERTY_DAMAGE)
					.contactDetails(ContactDetails.builder()
							.firstName(testData.getFirstName())
							.lastName(testData.getLastName())
							.taxIdSSN(testData.getTaxId())
							.address(testData.getAddress())
							.city(testData.getCity())
							.state(testData.getState())
							.build())
					.liability_Coverage(Liability_BodilyCoverageAndPropertyCoverage.builder()
							.liability_VehicleDamage(Coverage.builder()
									.claimantType(testData.getClaimantType())
									.make(testData.getMake())
									.model(testData.getModel())
									.year(testData.getYear())
									.vehicleName(testData.getVehicleName())
									.driverName(insuredName)
									.lossOccurred(testData.getLossOccurred())
									.description(testData.getDescription())
									.vin(testData.getVin())
									.build())
							.build())
					.coverage(testData.getCoverage())
					.build());

			cc.createReserve(Reserve.builder()
					.costType(testData.getCostType())
					.costCategory(testData.getCostCategory())
					.reserveAmount(testData.getAmount())
					.coverageType(testData.getCoverageType())
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
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the clone check functionality for auto claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC380(String browser) throws Exception {
	
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the clone check functionality for auto claim",driver);
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("CC_GWTestData_DataEngine.xlsx", "PersonalAuto", "TC380");
		
		try {	

			PersonalAutoStepsImpl cc = PersonalAutoSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			String insuredName = cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.addCoveragesByType(ChooseCoveragesByType.builder(Coverages.COVERAGE_C)
					.coverage_C(CoverageType_C.builder()
							.collision(Coverage.builder()
									.claimant(insuredName)
									.claimantType(testData.getClaimantType())
									.make(testData.getMake())
									.model(testData.getModel())
									.year(testData.getYear())
									.vehicleName(testData.getVehicleName())
									.driverName(insuredName)
									.lossOccurred(testData.getLossOccurred())
									.build())
							.build())
					.coverage(testData.getCoverage())
					.build());

			cc.createReserve(Reserve.builder()
					.costType(testData.getCostType())
					.costCategory(testData.getCostCategory())
					.reserveAmount(testData.getAmount())
					.coverageType(testData.getCoverageType())
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
					.paymentType(PaymentType.CLONE_CHECK)
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
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the transfer check functionality for auto claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC384(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the transfer check functionality for auto claim",driver);
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("CC_GWTestData_DataEngine.xlsx", "PersonalAuto", "TC384");
		
		try {	
			
			String claimNumber = CCDataGenerator.createClaimForPersonalAuto(testData.getPolicy());

			PersonalAutoStepsImpl cc = PersonalAutoSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			String insuredName = cc.searchClaim(SearchClaim.builder().claimNo(claimNumber).build());

			cc.addCoverages(ChooseCoverages.builder(Coverages.LIABILITY_BODILY_INJURY_PROPERTY_DAMAGE)
					.contactDetails(ContactDetails.builder()
							.firstName(testData.getFirstName())
							.lastName(testData.getLastName())
							.taxIdSSN(testData.getTaxId())
							.address(testData.getAddress())
							.city(testData.getCity())
							.state(testData.getState())
							.build())
					.liability_Coverage(Liability_BodilyCoverageAndPropertyCoverage.builder()
							.liability_VehicleDamage(Coverage.builder()
									.claimantType(testData.getClaimantType())
									.make(testData.getMake())
									.model(testData.getModel())
									.year(testData.getYear())
									.vehicleName(testData.getVehicleName())
									.driverName(insuredName)
									.lossOccurred(testData.getLossOccurred())
									.description(testData.getDescription())
									.vin(testData.getVin())
									.build())
							.build())
					.coverage(testData.getCoverage())
					.build());

			cc.createReserve(Reserve.builder()
					.costType(testData.getCostType())
					.costCategory(testData.getCostCategory())
					.reserveAmount(testData.getAmount())
					.coverageType(testData.getCoverageType())
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

}