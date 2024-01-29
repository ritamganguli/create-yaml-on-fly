package com.aspire.guidewire.cc.testscripts;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aspire.guidewire.api.datagenerator.CCDataGenerator;
import com.aspire.guidewire.cc.teststeps.homeowners.HomeOwnersConstants.AssignType;
import com.aspire.guidewire.cc.teststeps.homeowners.HomeOwnersConstants.ContactType;
import com.aspire.guidewire.cc.teststeps.homeowners.HomeOwnersConstants.Coverages;
import com.aspire.guidewire.cc.teststeps.homeowners.HomeOwnersConstants.DocumentType;
import com.aspire.guidewire.cc.teststeps.homeowners.HomeOwnersConstants.PaymentType;
import com.aspire.guidewire.cc.teststeps.homeowners.HomeOwnersConstants.PolicyType;
import com.aspire.guidewire.cc.teststeps.homeowners.HomeOwnersDataEngine;
import com.aspire.guidewire.cc.teststeps.homeowners.HomeOwnersFeatures.AddPropertyDamage;
import com.aspire.guidewire.cc.teststeps.homeowners.HomeOwnersFeatures.AssignClaim;
import com.aspire.guidewire.cc.teststeps.homeowners.HomeOwnersFeatures.BasicInfo;
import com.aspire.guidewire.cc.teststeps.homeowners.HomeOwnersFeatures.ChooseCoverages;
import com.aspire.guidewire.cc.teststeps.homeowners.HomeOwnersFeatures.ChooseCoveragesByType;
import com.aspire.guidewire.cc.teststeps.homeowners.HomeOwnersFeatures.ChooseDocumentsByType;
import com.aspire.guidewire.cc.teststeps.homeowners.HomeOwnersFeatures.ClaimInfo;
import com.aspire.guidewire.cc.teststeps.homeowners.HomeOwnersFeatures.CloseClaim;
import com.aspire.guidewire.cc.teststeps.homeowners.HomeOwnersFeatures.Contact;
import com.aspire.guidewire.cc.teststeps.homeowners.HomeOwnersFeatures.ContactDetails;
import com.aspire.guidewire.cc.teststeps.homeowners.HomeOwnersFeatures.Coverage;
import com.aspire.guidewire.cc.teststeps.homeowners.HomeOwnersFeatures.CoverageType_C;
import com.aspire.guidewire.cc.teststeps.homeowners.HomeOwnersFeatures.CoverageType_D;
import com.aspire.guidewire.cc.teststeps.homeowners.HomeOwnersFeatures.CoverageType_E;
import com.aspire.guidewire.cc.teststeps.homeowners.HomeOwnersFeatures.CoverageType_F;
import com.aspire.guidewire.cc.teststeps.homeowners.HomeOwnersFeatures.CreateNote;
import com.aspire.guidewire.cc.teststeps.homeowners.HomeOwnersFeatures.EmailDetails;
import com.aspire.guidewire.cc.teststeps.homeowners.HomeOwnersFeatures.ExposureDataUnavailability;
import com.aspire.guidewire.cc.teststeps.homeowners.HomeOwnersFeatures.ExposureDetails;
import com.aspire.guidewire.cc.teststeps.homeowners.HomeOwnersFeatures.IndicateExistence;
import com.aspire.guidewire.cc.teststeps.homeowners.HomeOwnersFeatures.Legal;
import com.aspire.guidewire.cc.teststeps.homeowners.HomeOwnersFeatures.PaymentOptions;
import com.aspire.guidewire.cc.teststeps.homeowners.HomeOwnersFeatures.ReOpenClaim;
import com.aspire.guidewire.cc.teststeps.homeowners.HomeOwnersFeatures.Reserve;
import com.aspire.guidewire.cc.teststeps.homeowners.HomeOwnersFeatures.SearchClaim;
import com.aspire.guidewire.cc.teststeps.homeowners.HomeOwnersFeatures.Searchpolicy;
import com.aspire.guidewire.cc.teststeps.homeowners.HomeOwnersFeatures.ServiceDetails;
import com.aspire.guidewire.cc.teststeps.homeowners.HomeOwnersFeatures.TemplateClaim;
import com.aspire.guidewire.cc.teststeps.homeowners.HomeOwnersFeatures.UploadDocument;
import com.aspire.guidewire.cc.teststeps.homeowners.HomeOwnersFeatures.Vendor;
import com.aspire.guidewire.cc.teststeps.homeowners.HomeOwnersFeatures.WorkPlanDataUnavailability;
import com.aspire.guidewire.cc.teststeps.homeowners.HomeOwnersSteps;
import com.aspire.guidewire.cc.teststeps.homeowners.HomeOwnersStepsImpl;
import com.aspire.guidewire.utils.DataProviderUtils;
import com.aspire.guidewire.utils.EnvironmentPropertiesReader;
import com.aspire.guidewire.utils.Log;
import com.aspire.guidewire.webdriverManager.DriverManager;

public class CC_HomeOwnersSuite  {

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
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test (description="To verify the condo claim creation", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC5(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the condo claim creation",driver);
		HomeOwnersDataEngine testData = new HomeOwnersDataEngine("CC_GWTestData_DataEngine.xlsx", "Homeowners", "TC5");
		try {

			HomeOwnersStepsImpl cc = HomeOwnersSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			cc.createClaim();

			String insuredName = cc.searchPolicy(Searchpolicy.builder()
					.policyType(PolicyType.CONDOMINIUM)
					.policyNo(testData.getPolicy())
					.lossDate(testData.getLossDate())
					.build());

			cc.enterBasicInformation(BasicInfo.builder()
					.insuredName(insuredName)
					.build());

			cc.addClaimInformation(ClaimInfo.builder()
					.lossCause(testData.getLossCause())
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
	@Test(description="To verify the exposure creation in condo claim for Personal Property coverage", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC45(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the exposure creation in condo claim for Personal Property coverage",driver);

		HomeOwnersDataEngine testData = new HomeOwnersDataEngine("CC_GWTestData_DataEngine.xlsx", "Homeowners", "TC45");
		try {	

			HomeOwnersStepsImpl cc = HomeOwnersSteps.create();

			cc.loginIntoTheApplication("su", "gw");
			
			String insuredName = cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.addCoveragesByType(ChooseCoveragesByType.builder(Coverages.COVERAGE_C)
					.coverage_C(CoverageType_C.builder()
							.personalProperty(Coverage.builder()
									.claimant(insuredName)
									.claimantType(testData.getClaimantType())
									.description(testData.getDamageDescription())
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
	@Test(description="To verify the exposure creation in condo claim for Loss of Use coverage", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC47(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the exposure creation in condo claim for Loss of Use coverage",driver);

		HomeOwnersDataEngine testData = new HomeOwnersDataEngine("CC_GWTestData_DataEngine.xlsx", "Homeowners", "TC47");
		try {	

			HomeOwnersStepsImpl cc = HomeOwnersSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			String insuredName = cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.addCoveragesByType(ChooseCoveragesByType.builder(Coverages.COVERAGE_D)
					.coverage_D(CoverageType_D.builder()
							.lossOfUse(Coverage.builder()
									.claimant(insuredName)
									.claimantType(testData.getClaimantType())
									.description(testData.getDamageDescription())
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
	@Test(description="To verify the exposure creation in condo claim for Personal Liablity - Bodily injury coverage", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC48(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the exposure creation in condo claim for Personal Liablity - Bodily injury coverage",driver);

		HomeOwnersDataEngine testData = new HomeOwnersDataEngine("CC_GWTestData_DataEngine.xlsx", "Homeowners", "TC48");
		try {	

			HomeOwnersStepsImpl cc = HomeOwnersSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			String insuredName = cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.addCoveragesByType(ChooseCoveragesByType.builder(Coverages.FUNGUS_AND_MOLD_REMEDIATION)
					.fungusAndMoldRemediation(Coverage.builder()
							.claimant(insuredName)
							.claimantType(testData.getClaimantType())
							.description(testData.getDamageDescription())
							.propertyName(testData.getPropertyName())
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
	@Test(description="To verify the exposure creation in condo claim for Personal Liablity - Bodily injury coverage", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC50(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the exposure creation in condo claim for Personal Liablity - Bodily injury coverage",driver);

		HomeOwnersDataEngine testData = new HomeOwnersDataEngine("CC_GWTestData_DataEngine.xlsx", "Homeowners", "TC50");
		try {	

			HomeOwnersStepsImpl cc = HomeOwnersSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			String insuredName = cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());


			cc.addCoveragesByType(ChooseCoveragesByType.builder(Coverages.COVERAGE_E)
					.coverage_E(CoverageType_E.builder()
							.personalLiabilityBodilyInjury(Coverage.builder()
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
	@Test(description="To verify the exposure creation in condo claim for Med Pay coverage", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC51(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the exposure creation in condo claim for Med Pay coverage",driver);
		HomeOwnersDataEngine testData = new HomeOwnersDataEngine("CC_GWTestData_DataEngine.xlsx", "Homeowners", "TC51");

		try {	

			HomeOwnersStepsImpl cc = HomeOwnersSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			String insuredName = cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());


			cc.addCoveragesByType(ChooseCoveragesByType.builder(Coverages.COVERAGE_F)
					.coverage_F(CoverageType_F.builder()
							.medicalPaymentsToOthers(Coverage.builder()
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
	@Test(description="To verify the exposure creation in condo claim for Identity Theft Protection coverage", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC52(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the exposure creation in condo claim for Identity Theft Protection coverage",driver);
		HomeOwnersDataEngine testData = new HomeOwnersDataEngine("CC_GWTestData_DataEngine.xlsx", "Homeowners", "TC52");

		try {	

			HomeOwnersStepsImpl cc = HomeOwnersSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());


			cc.addCoverages(ChooseCoverages.builder(Coverages.IDENTITY_THEFT_PROTECTION)
					.identityTheftProtection(Coverage.builder()
							.contactDetails(ContactDetails.builder()
									.firstName(testData.getFirstName())
									.lastName(testData.getLastName())
									.taxIdSSN(testData.getTaxId())
									.address(testData.getAddress())
									.city(testData.getCity())
									.state(testData.getState())
									.build())
							.claimantType(testData.getClaimantType())
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
	@Test(description="To verify the exposure creation in condo claim for Personal Liability - General coverage", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC53(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the exposure creation in condo claim for Personal Liability - General coverage",driver);
		HomeOwnersDataEngine testData = new HomeOwnersDataEngine("CC_GWTestData_DataEngine.xlsx", "Homeowners", "TC53");

		try {	

			HomeOwnersStepsImpl cc = HomeOwnersSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			String insuredName = cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.addCoveragesByType(ChooseCoveragesByType.builder(Coverages.COVERAGE_E)
					.coverage_E(CoverageType_E.builder()
							.personalLiabilityGeneral(Coverage.builder()
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
	@Test(description="To verify the exposure creation in condo claim for Personal Liability - property coverage ", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC54(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the exposure creation in condo claim for Personal Liability - property coverage ",driver);
		HomeOwnersDataEngine testData = new HomeOwnersDataEngine("CC_GWTestData_DataEngine.xlsx", "Homeowners", "TC54");

		try {	

			HomeOwnersStepsImpl cc = HomeOwnersSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			String insuredName = cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.addCoveragesByType(ChooseCoveragesByType.builder(Coverages.COVERAGE_E)
					.coverage_E(CoverageType_E.builder()
							.personalLiabilityProperty(Coverage.builder()
									.claimant(insuredName)
									.claimantType(testData.getClaimantType())
									.description(testData.getDamageDescription())
									.propertyName(testData.getPropertyName())
									.build())
							.build())
					.coverage(testData.getCoverage())
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
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the exposure creation in condo claim for Scheduled Personal property coverage ", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC55(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the exposure creation in condo claim for Scheduled Personal property coverage",driver);
		HomeOwnersDataEngine testData = new HomeOwnersDataEngine("CC_GWTestData_DataEngine.xlsx", "Homeowners", "TC55");

		try {	

			HomeOwnersStepsImpl cc = HomeOwnersSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			String insuredName = cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());


			cc.addCoveragesByType(ChooseCoveragesByType.builder(Coverages.SCHEDULED_PERSONAL_PROPERY)
					.scheduledPersonalProperty(Coverage.builder()
							.claimant(insuredName)
							.claimantType(testData.getClaimantType())
							.description(testData.getDamageDescription())
							.build())
					.coverage(testData.getCoverage())
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
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the upload document while creating a condo claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC158(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the upload document while creating a condo claim",driver);
		HomeOwnersDataEngine testData = new HomeOwnersDataEngine("CC_GWTestData_DataEngine.xlsx", "Homeowners", "TC158");

		try {	

			HomeOwnersStepsImpl cc = HomeOwnersSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			cc.createClaim();

			String insuredName = cc.searchPolicy(Searchpolicy.builder()
					.policyType(PolicyType.CONDOMINIUM)
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
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}
	/**
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the clone check functionality for condo claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC378(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the clone check functionality for condo claim",driver);

		HomeOwnersDataEngine testData = new HomeOwnersDataEngine("CC_GWTestData_DataEngine.xlsx", "Homeowners", "TC378");
		try {	

			HomeOwnersStepsImpl cc = HomeOwnersSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			String insuredName = cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.addCoveragesByType(ChooseCoveragesByType.builder(Coverages.COVERAGE_F)
					.coverage_F(CoverageType_F.builder()
							.medicalPaymentsToOthers(Coverage.builder()
									.claimant(insuredName)
									.claimantType(testData.getClaimantType())
									.injuredPerson(insuredName)
									.lossParty(testData.getLossParty())
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
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}
	/**
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the clone check functionality for condo claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC421(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the clone check functionality for condo claim",driver);
		HomeOwnersDataEngine testData = new HomeOwnersDataEngine("CC_GWTestData_DataEngine.xlsx", "Homeowners", "TC421");

		try {	

			HomeOwnersStepsImpl cc = HomeOwnersSteps.create();

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
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}

	/**
	 * @author lavanya.bala
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the Contact-Person creation for home claim ", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC212(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the Contact-Person creation for home claim",driver);
		HomeOwnersDataEngine testData = new HomeOwnersDataEngine("CC_GWTestData_DataEngine.xlsx", "Homeowners", "TC212");

		try {	

			HomeOwnersStepsImpl cc = HomeOwnersSteps.create();

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
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}

	/**
	 * @author lavanya.bala
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the Vendor-Doctor contact creation for home claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC215(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the Vendor-Doctor contact creation for home claim",driver);
		HomeOwnersDataEngine testData = new HomeOwnersDataEngine("CC_GWTestData_DataEngine.xlsx", "Homeowners", "TC215");

		try {	

			HomeOwnersStepsImpl cc = HomeOwnersSteps.create();

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
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}

	/**
	 * @author lavanya.bala
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the Vendor-Medical Care Organization contact creation for home claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC216(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the Vendor-Medical Care Organization contact creation for home claim",driver);
		HomeOwnersDataEngine testData = new HomeOwnersDataEngine("CC_GWTestData_DataEngine.xlsx", "Homeowners", "TC216");

		try {	

			HomeOwnersStepsImpl cc = HomeOwnersSteps.create();

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
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}

	/**
	 * @author lavanya.bala
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the Vendor-Vendor(Company) contact creation for home claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC217(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the Vendor-Vendor(Company) contact creation for home claim",driver);
		HomeOwnersDataEngine testData = new HomeOwnersDataEngine("CC_GWTestData_DataEngine.xlsx", "Homeowners", "TC217");

		try {	

			HomeOwnersStepsImpl cc = HomeOwnersSteps.create();

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
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}

	/**
	 * @author lavanya.bala
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the Company contact creation for home claim ", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC218(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the Company contact creation for home claim ",driver);
		HomeOwnersDataEngine testData = new HomeOwnersDataEngine("CC_GWTestData_DataEngine.xlsx", "Homeowners", "TC218");

		try {	

			HomeOwnersStepsImpl cc = HomeOwnersSteps.create();

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
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}

	/**
	 * @author lavanya.bala
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the Legal - Adjudicator contact creation for home claim ", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC219(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the Legal - Adjudicator contact creation for home claim ",driver);
		HomeOwnersDataEngine testData = new HomeOwnersDataEngine("CC_GWTestData_DataEngine.xlsx", "Homeowners", "TC219");

		try {	

			HomeOwnersStepsImpl cc = HomeOwnersSteps.create();

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
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}

	/**
	 * @author lavanya.bala
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the Legal - Attorney contact creation for home claim ", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC220(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the Legal - Attorney contact creation for home claim ",driver);
		HomeOwnersDataEngine testData = new HomeOwnersDataEngine("CC_GWTestData_DataEngine.xlsx", "Homeowners", "TC220");

		try {	

			HomeOwnersStepsImpl cc = HomeOwnersSteps.create();

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
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}

	/**
	 * @author lavanya.bala
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the Legal - Law Firm contact creation for home claim ", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC221(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the Legal - Law Firm contact creation for home claim ",driver);
		HomeOwnersDataEngine testData = new HomeOwnersDataEngine("CC_GWTestData_DataEngine.xlsx", "Homeowners", "TC221");

		try {	

			HomeOwnersStepsImpl cc = HomeOwnersSteps.create();

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
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}

	/**
	 * @author lavanya.bala
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the Legal - Legal Venue contact creation for home claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC222(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the Legal - Legal Venue contact creation for home claim",driver);
		HomeOwnersDataEngine testData = new HomeOwnersDataEngine("CC_GWTestData_DataEngine.xlsx", "Homeowners", "TC222");

		try {	

			HomeOwnersStepsImpl cc = HomeOwnersSteps.create();

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
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}

	/**
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the home claim creation", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC3(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the home claim creation",driver);
		HomeOwnersDataEngine testData = new HomeOwnersDataEngine("CC_GWTestData_DataEngine.xlsx", "Homeowners", "TC3");

		try {	

			HomeOwnersStepsImpl cc = HomeOwnersSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			cc.createClaim();

			String insuredName = cc.searchPolicy(Searchpolicy.builder()
					.policyType(PolicyType.DWELLING)
					.policyNo(testData.getPolicy())
					.lossDate(testData.getLossDate())
					.build());

			cc.enterBasicInformation(BasicInfo.builder()
					.insuredName(insuredName)
					.build());

			cc.addClaimInformation(ClaimInfo.builder()
					.lossCause(testData.getLossCause())
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
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}
	/**
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the exposure creation for home claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC7(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the exposure creation for home claim",driver);
		HomeOwnersDataEngine testData = new HomeOwnersDataEngine("CC_GWTestData_DataEngine.xlsx", "Homeowners", "TC7");

		try {	

			HomeOwnersStepsImpl cc = HomeOwnersSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.addCoverages(ChooseCoverages.builder(Coverages.IDENTITY_THEFT_PROTECTION)
					.identityTheftProtection(Coverage.builder()
							.contactDetails(ContactDetails.builder()
									.firstName(testData.getFirstName())
									.lastName(testData.getLastName())
									.taxIdSSN(testData.getTaxId())
									.address(testData.getAddress())
									.city(testData.getCity())
									.state(testData.getState())
									.build())
							.claimantType(testData.getClaimantType())
							.build())
					.coverage(testData.getCoverage())
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
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the exposure creation in home claim for Dwelling coverage", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC8(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the exposure creation in home claim for Dwelling coverage",driver);
		HomeOwnersDataEngine testData = new HomeOwnersDataEngine("CC_GWTestData_DataEngine.xlsx", "Homeowners", "TC8");

		try {	

			HomeOwnersStepsImpl cc = HomeOwnersSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());


			cc.addCoverages(ChooseCoverages.builder(Coverages.COVERAGE_A)
					.coverageADwelling(Coverage.builder()
							.contactDetails(ContactDetails.builder()
									.firstName(testData.getFirstName())
									.lastName(testData.getLastName())
									.taxIdSSN(testData.getTaxId())
									.address(testData.getAddress())
									.city(testData.getCity())
									.state(testData.getState())
									.build())
							.claimantType(testData.getClaimantType())
							.description(testData.getDamageDescription())
							.build())
					.coverage(testData.getCoverage())
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
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the exposure creation in home claim for Other Structures coverage", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC9(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the exposure creation in home claim for Other Structures coverage",driver);
		HomeOwnersDataEngine testData = new HomeOwnersDataEngine("CC_GWTestData_DataEngine.xlsx", "Homeowners", "TC9");

		try {	

			HomeOwnersStepsImpl cc = HomeOwnersSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.addCoverages(ChooseCoverages.builder(Coverages.COVERAGE_B)
					.coverageBOtherStructures(Coverage.builder()
							.contactDetails(ContactDetails.builder()
									.firstName(testData.getFirstName())
									.lastName(testData.getLastName())
									.taxIdSSN(testData.getTaxId())
									.address(testData.getAddress())
									.city(testData.getCity())
									.state(testData.getState())
									.build())
							.claimantType(testData.getClaimantType())
							.description(testData.getDamageDescription())
							.build())
					.coverage(testData.getCoverage())
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
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the exposure creation in home claim for Personal Property coverage", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC10(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the exposure creation in home claim for Personal Property coverage",driver);
		HomeOwnersDataEngine testData = new HomeOwnersDataEngine("CC_GWTestData_DataEngine.xlsx", "Homeowners", "TC10");

		try {	

			HomeOwnersStepsImpl cc = HomeOwnersSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.addCoverages(ChooseCoverages.builder(Coverages.COVERAGE_C)
					.coverageCPersonalProperty(Coverage.builder()
							.contactDetails(ContactDetails.builder()
									.firstName(testData.getFirstName())
									.lastName(testData.getLastName())
									.taxIdSSN(testData.getTaxId())
									.address(testData.getAddress())
									.city(testData.getCity())
									.state(testData.getState())
									.build())
							.claimantType(testData.getClaimantType())
							.description(testData.getDamageDescription())
							.build())
					.coverage(testData.getCoverage())
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
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the exposure creation in home claim for Scheduled personal property coverage", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC11(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the exposure creation in home claim for Scheduled personal property coverage",driver);
		HomeOwnersDataEngine testData = new HomeOwnersDataEngine("CC_GWTestData_DataEngine.xlsx", "Homeowners", "TC11");

		try {	

			HomeOwnersStepsImpl cc = HomeOwnersSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			String insuredName = cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.addCoveragesByType(ChooseCoveragesByType.builder(Coverages.SCHEDULED_PERSONAL_PROPERY)
					.scheduledPersonalProperty(Coverage.builder()
							.claimant(insuredName)
							.claimantType(testData.getClaimantType())
							.description(testData.getDamageDescription())
							.build())
					.coverage(testData.getCoverage())
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
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the exposure creation in home claim for Loss of use coverage", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC12(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the exposure creation in home claim for Loss of use coverage",driver);
		HomeOwnersDataEngine testData = new HomeOwnersDataEngine("CC_GWTestData_DataEngine.xlsx", "Homeowners", "TC12");

		try {	

			HomeOwnersStepsImpl cc = HomeOwnersSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.addCoverages(ChooseCoverages.builder(Coverages.COVERAGE_D)
					.coverageDLossOfUse(Coverage.builder()
							.contactDetails(ContactDetails.builder()
									.firstName(testData.getFirstName())
									.lastName(testData.getLastName())
									.taxIdSSN(testData.getTaxId())
									.address(testData.getAddress())
									.city(testData.getCity())
									.state(testData.getState())
									.build())
							.claimantType(testData.getClaimantType())
							.description(testData.getDamageDescription())
							.build())
					.coverage(testData.getCoverage())
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
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the reserves creation in home claim for Dwelling exposure", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC70(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the reserves creation in home claim for Dwelling exposure",driver);
		HomeOwnersDataEngine testData = new HomeOwnersDataEngine("CC_GWTestData_DataEngine.xlsx", "Homeowners", "TC70");

		try {	

			HomeOwnersStepsImpl cc = HomeOwnersSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.addCoverages(ChooseCoverages.builder(Coverages.COVERAGE_A)
					.coverageADwelling(Coverage.builder()
							.contactDetails(ContactDetails.builder()
									.firstName(testData.getFirstName())
									.lastName(testData.getLastName())
									.taxIdSSN(testData.getTaxId())
									.address(testData.getAddress())
									.city(testData.getCity())
									.state(testData.getState())
									.build())
							.claimantType(testData.getClaimantType())
							.description(testData.getDamageDescription())
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
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}

	/**
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the reserves creation in home claim for Other structures exposure", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC71(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the reserves creation in home claim for Other structures exposure",driver);
		HomeOwnersDataEngine testData = new HomeOwnersDataEngine("CC_GWTestData_DataEngine.xlsx", "Homeowners", "TC71");

		try {	

			HomeOwnersStepsImpl cc = HomeOwnersSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.addCoverages(ChooseCoverages.builder(Coverages.COVERAGE_B)
					.coverageBOtherStructures(Coverage.builder()
							.contactDetails(ContactDetails.builder()
									.firstName(testData.getFirstName())
									.lastName(testData.getLastName())
									.taxIdSSN(testData.getTaxId())
									.address(testData.getAddress())
									.city(testData.getCity())
									.state(testData.getState())
									.build())
							.claimantType(testData.getClaimantType())
							.description(testData.getDamageDescription())
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
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}


	/**
	 * @author lavanya.bala
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify that able to Add a Appraisal service for home claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC236(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to Add a Appraisal service for home claim",driver);
		HomeOwnersDataEngine testData = new HomeOwnersDataEngine("CC_GWTestData_DataEngine.xlsx", "Homeowners", "TC236");

		try {	

			HomeOwnersStepsImpl cc = HomeOwnersSteps.create();

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
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}

	/**
	 * @author lavanya.bala
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify that able to add a Alternative accommodation service for home claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC235(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to add a Alternative accommodation service for home claim",driver);
		HomeOwnersDataEngine testData = new HomeOwnersDataEngine("CC_GWTestData_DataEngine.xlsx", "Homeowners", "TC235");

		try {	

			HomeOwnersStepsImpl cc = HomeOwnersSteps.create();

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
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}

	/**
	 * @author lavanya.bala
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify that able to Add a Computer equipment service for home claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC237(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to Add a Computer equipment service for home claim",driver);
		HomeOwnersDataEngine testData = new HomeOwnersDataEngine("CC_GWTestData_DataEngine.xlsx", "Homeowners", "TC237");

		try {	

			HomeOwnersStepsImpl cc = HomeOwnersSteps.create();

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
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}

	/**
	 * @author lavanya.bala
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify that able to Add a Electronics service for home claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC238(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to Add a Electronics service for home claim",driver);
		HomeOwnersDataEngine testData = new HomeOwnersDataEngine("CC_GWTestData_DataEngine.xlsx", "Homeowners", "TC238");

		try {	

			HomeOwnersStepsImpl cc = HomeOwnersSteps.create();

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
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}
	/**
	 * @author lavanya.bala
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify that able to Add a Furniture service for home claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC239(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to Add a Furniture service for home claim",driver);
		HomeOwnersDataEngine testData = new HomeOwnersDataEngine("CC_GWTestData_DataEngine.xlsx", "Homeowners", "TC239");

		try {	

			HomeOwnersStepsImpl cc = HomeOwnersSteps.create();

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
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}

	/**
	 * @author lavanya.bala
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify that able to Add a Garden service for home claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC240(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to Add a Garden service for home claim",driver);
		HomeOwnersDataEngine testData = new HomeOwnersDataEngine("CC_GWTestData_DataEngine.xlsx", "Homeowners", "TC240");

		try {	

			HomeOwnersStepsImpl cc = HomeOwnersSteps.create();

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
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}

	/**
	 * @author lavanya.bala
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify that able to add a Kitchen appliances service for home claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC241(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to add a Kitchen appliances service for home claim",driver);
		HomeOwnersDataEngine testData = new HomeOwnersDataEngine("CC_GWTestData_DataEngine.xlsx", "Homeowners", "TC241");

		try {	

			HomeOwnersStepsImpl cc = HomeOwnersSteps.create();

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
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}

	/**
	 * @author lavanya.bala
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify that able to add an Audio equipment service for home claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC242(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to add an Audio equipment service for home claim",driver);
		HomeOwnersDataEngine testData = new HomeOwnersDataEngine("CC_GWTestData_DataEngine.xlsx", "Homeowners", "TC242");

		try {	

			HomeOwnersStepsImpl cc = HomeOwnersSteps.create();

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
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}

	/**
	 * @author lavanya.bala
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify that able to add a Cleaning service for home claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC243(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to add a Cleaning service for home claim",driver);
		HomeOwnersDataEngine testData = new HomeOwnersDataEngine("CC_GWTestData_DataEngine.xlsx", "Homeowners", "TC243");

		try {	

			HomeOwnersStepsImpl cc = HomeOwnersSteps.create();

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
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}

	/**
	 * @author lavanya.bala
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify that able to add Make safe service for home claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC244(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to add Make safe service for home claim",driver);
		HomeOwnersDataEngine testData = new HomeOwnersDataEngine("CC_GWTestData_DataEngine.xlsx", "Homeowners", "TC244");

		try {	

			HomeOwnersStepsImpl cc = HomeOwnersSteps.create();

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
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}

	/**
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the Note creation while creating a home claim ", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC132(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the Note creation while creating a home claim ",driver);
		HomeOwnersDataEngine testData = new HomeOwnersDataEngine("CC_GWTestData_DataEngine.xlsx", "Homeowners", "TC132");

		try {	

			HomeOwnersStepsImpl cc = HomeOwnersSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			cc.createClaim();

			String insuredName = cc.searchPolicy(Searchpolicy.builder()
					.policyType(PolicyType.DWELLING)
					.policyNo(testData.getPolicy())
					.lossDate(testData.getLossDate())
					.build());

			cc.enterBasicInformation(BasicInfo.builder()
					.insuredName(insuredName)
					.build());

			cc.createNote(CreateNote.builder().text(testData.getText()).build());

			cc.addClaimInformation(ClaimInfo.builder()
					.lossCause(testData.getLossCause())
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
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}
	/**
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the Note creation after created a home claim ", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC136(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the Note creation after created a home claim ",driver);
		HomeOwnersDataEngine testData = new HomeOwnersDataEngine("CC_GWTestData_DataEngine.xlsx", "Homeowners", "TC136");

		try {	

			HomeOwnersStepsImpl cc = HomeOwnersSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.createNote(CreateNote.builder().text(testData.getText()).build());

			cc.verifyNoteCreation(CreateNote.builder()
					.text(testData.getText())
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
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the upload document in home claim ", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC144(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the upload document in home claim ",driver);
		HomeOwnersDataEngine testData = new HomeOwnersDataEngine("CC_GWTestData_DataEngine.xlsx", "Homeowners", "TC144");

		try {	

			HomeOwnersStepsImpl cc = HomeOwnersSteps.create();

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
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}
	/**
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the document creation using Indicate existence of a Document in home claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC148(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the document creation using Indicate existence of a Document in home claim",driver);
		HomeOwnersDataEngine testData = new HomeOwnersDataEngine("CC_GWTestData_DataEngine.xlsx", "Homeowners", "TC148");

		try {	

			HomeOwnersStepsImpl cc = HomeOwnersSteps.create();

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
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}
	/**
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the document creation using Indicate existence of a Document in home claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC152(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the document creation using Indicate existence of a Document in home claim",driver);
		HomeOwnersDataEngine testData = new HomeOwnersDataEngine("CC_GWTestData_DataEngine.xlsx", "Homeowners", "TC152");

		try {	

			HomeOwnersStepsImpl cc = HomeOwnersSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			cc.createClaim();

			String insuredName = cc.searchPolicy(Searchpolicy.builder()
					.policyType(PolicyType.DWELLING)
					.policyNo(testData.getPolicy())
					.lossDate(testData.getLossDate())
					.build());

			cc.createDocument(ChooseDocumentsByType.builder().documentType(DocumentType.TEMPLATE_CLAIM)
					.templateClaim(TemplateClaim.builder()
							.newDocument(true)
							.build())
					.build());

			cc.enterBasicInformation(BasicInfo.builder()
					.insuredName(insuredName)
					.build());

			cc.addClaimInformation(ClaimInfo.builder()
					.lossCause(testData.getLossCause())
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
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}

	/**
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the upload document while creating a home claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC156(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the upload document while creating a home claim",driver);
		HomeOwnersDataEngine testData = new HomeOwnersDataEngine("CC_GWTestData_DataEngine.xlsx", "Homeowners", "TC156");

		try {	

			HomeOwnersStepsImpl cc = HomeOwnersSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			cc.createClaim();

			String insuredName = cc.searchPolicy(Searchpolicy.builder()
					.policyType(PolicyType.DWELLING)
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
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}
	/**
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the document creation using Indicate existence of a Document while creating a home claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC160(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the document creation using Indicate existence of a Document while creating a home claim",driver);
		HomeOwnersDataEngine testData = new HomeOwnersDataEngine("CC_GWTestData_DataEngine.xlsx", "Homeowners", "TC160");

		try {	

			HomeOwnersStepsImpl cc = HomeOwnersSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			cc.createClaim();

			String insuredName = cc.searchPolicy(Searchpolicy.builder()
					.policyType(PolicyType.DWELLING)
					.policyNo(testData.getPolicy())
					.lossDate(testData.getLossDate())
					.build());

			cc.createDocument(ChooseDocumentsByType.builder().documentType(DocumentType.INDICATE_EXISTENCE)
					.indicateExistence(IndicateExistence.builder()
							.newDocument(true)
							.name(insuredName)
							.documentType(testData.getDocumentType())
							.status(testData.getStatus())
							.build())
					.build());

			cc.enterBasicInformation(BasicInfo.builder()
					.insuredName(insuredName)
					.build());

			cc.addClaimInformation(ClaimInfo.builder()
					.lossCause(testData.getLossCause())
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
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}

	/**
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the Assign functionality for home claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC164(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the Assign functionality for home claim",driver);
		HomeOwnersDataEngine testData = new HomeOwnersDataEngine("CC_GWTestData_DataEngine.xlsx", "Homeowners", "TC164");

		try {	

			HomeOwnersStepsImpl cc = HomeOwnersSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.assignClaim(AssignClaim.builder()
					.assignType(AssignType.SELECT_FROM_LIST).build());

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
	@Test(description="To verify the Assign functionality for home claim by using Search by location", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC168(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the Assign functionality for home claim by using Search by location",driver);
		HomeOwnersDataEngine testData = new HomeOwnersDataEngine("CC_GWTestData_DataEngine.xlsx", "Homeowners", "TC168");

		try {	

			HomeOwnersStepsImpl cc = HomeOwnersSteps.create();

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
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}
	/**
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the Close Exposure functionality for home claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC176(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the Close Exposure functionality for home claim",driver);
		HomeOwnersDataEngine testData = new HomeOwnersDataEngine("CC_GWTestData_DataEngine.xlsx", "Homeowners", "TC176");

		try {	

			String claimNumber = CCDataGenerator.createClaimForHomeOwners(testData.getPolicy());
		
			HomeOwnersStepsImpl cc = HomeOwnersSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			cc.searchClaim(SearchClaim.builder().claimNo(claimNumber).build());

			cc.addCoverages(ChooseCoverages.builder(Coverages.IDENTITY_THEFT_PROTECTION)
					.identityTheftProtection(Coverage.builder()
							.contactDetails(ContactDetails.builder()
									.firstName(testData.getFirstName())
									.lastName(testData.getLastName())
									.taxIdSSN(testData.getTaxId())
									.address(testData.getAddress())
									.city(testData.getCity())
									.state(testData.getState())
									.build())
							.claimantType(testData.getClaimantType())
							.build())
					.coverage(testData.getCoverage())
					.build());

			cc.updateExposureStatus(ExposureDetails.builder()
					.note(testData.getNote())
					.outcome(testData.getOutcome())
					.closeExposureValue(testData.getClosedExposureValue())
					.note(testData.getNote())
					.reason(testData.getReason())

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
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the Close Exposure functionality for home claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC180(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the Close Exposure functionality for home claim",driver);
		HomeOwnersDataEngine testData = new HomeOwnersDataEngine("CC_GWTestData_DataEngine.xlsx", "Homeowners", "TC180");

		try {	

			HomeOwnersStepsImpl cc = HomeOwnersSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			String insuredName = cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.addCoveragesByType(ChooseCoveragesByType.builder(Coverages.COVERAGE_F)
					.coverage_F(CoverageType_F.builder()
							.medicalPaymentsToOthers(Coverage.builder()
									.claimant(insuredName)
									.claimantType(testData.getClaimantType())
									.injuredPerson(insuredName)
									.lossParty(testData.getLossParty())
									.build())
							.build())
					.coverage(testData.getCoverage())
					.build());

			cc.updateExposureStatus(ExposureDetails.builder()
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
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}

	/**
	 * @author lavanya.bala
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify that able to add a Medical care service for home claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC245(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to add a Medical care service for home claim",driver);
		HomeOwnersDataEngine testData = new HomeOwnersDataEngine("CC_GWTestData_DataEngine.xlsx", "Homeowners", "TC245");

		try {	

			HomeOwnersStepsImpl cc = HomeOwnersSteps.create();

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
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}

	/**
	 * @author lavanya.bala
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify that able to add a Arborist service for home claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC246(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to add a Arborist service for home claim",driver);
		HomeOwnersDataEngine testData = new HomeOwnersDataEngine("CC_GWTestData_DataEngine.xlsx", "Homeowners", "TC246");

		try {	

			HomeOwnersStepsImpl cc = HomeOwnersSteps.create();

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
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}
	/**
	 * @author lavanya.bala
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify that able to add a Flooring service for home claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC247(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to add a Flooring service for home claim",driver);
		HomeOwnersDataEngine testData = new HomeOwnersDataEngine("CC_GWTestData_DataEngine.xlsx", "Homeowners", "TC247");

		try {	

			HomeOwnersStepsImpl cc = HomeOwnersSteps.create();

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
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}

	/**
	 * @author lavanya.bala
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify that able to add a Plaster service for home claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC248(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to add a Plaster service for home claim",driver);
		HomeOwnersDataEngine testData = new HomeOwnersDataEngine("CC_GWTestData_DataEngine.xlsx", "Homeowners", "TC248");

		try {	

			HomeOwnersStepsImpl cc = HomeOwnersSteps.create();

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
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}

	/**
	 * @author lavanya.bala
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify that able to add a Windows service for home claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC249(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to add a Windows service for home claim",driver);
		HomeOwnersDataEngine testData = new HomeOwnersDataEngine("CC_GWTestData_DataEngine.xlsx", "Homeowners", "TC249");

		try {	

			HomeOwnersStepsImpl cc = HomeOwnersSteps.create();

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
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}

	/**
	 * @author lavanya.bala
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify that able to add a Debris removal service for home claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC250(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to add a Debris removal service for home claim",driver);
		HomeOwnersDataEngine testData = new HomeOwnersDataEngine("CC_GWTestData_DataEngine.xlsx", "Homeowners", "TC250");

		try {	

			HomeOwnersStepsImpl cc = HomeOwnersSteps.create();

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
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}

	/**
	 * @author lavanya.bala
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify that able to add a Make safe service for home claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC251(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to add a Make safe service for home claim",driver);
		HomeOwnersDataEngine testData = new HomeOwnersDataEngine("CC_GWTestData_DataEngine.xlsx", "Homeowners", "TC251");

		try {	

			HomeOwnersStepsImpl cc = HomeOwnersSteps.create();

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
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}

	/**
	 * @author lavanya.bala
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify that able to add a Adjudicate claim service for home claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC252(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to add a Adjudicate claim service for home claim",driver);
		HomeOwnersDataEngine testData = new HomeOwnersDataEngine("CC_GWTestData_DataEngine.xlsx", "Homeowners", "TC252");

		try {	

			HomeOwnersStepsImpl cc = HomeOwnersSteps.create();

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
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}

	/**
	 * @author lavanya.bala
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify that able to add a Appraisal service for home claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC253(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to add a Appraisal service for home claim",driver);
		HomeOwnersDataEngine testData = new HomeOwnersDataEngine("CC_GWTestData_DataEngine.xlsx", "Homeowners", "TC253");

		try {	

			HomeOwnersStepsImpl cc = HomeOwnersSteps.create();

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
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}

	/**
	 * @author lavanya.bala
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify that able to add a Independent appraisal service for home claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC254(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to add a Independent appraisal service for home claim",driver);
		HomeOwnersDataEngine testData = new HomeOwnersDataEngine("CC_GWTestData_DataEngine.xlsx", "Homeowners", "TC254");

		try {	

			HomeOwnersStepsImpl cc = HomeOwnersSteps.create();

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
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}

	/**
	 * @author lavanya.bala
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the Close Claim functionality for home claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC184(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the Close Claim functionality for home claim",driver);
		HomeOwnersDataEngine testData = new HomeOwnersDataEngine("CC_GWTestData_DataEngine.xlsx", "Homeowners", "TC184");

		try {	

			String claimNumber = CCDataGenerator.createClaimForHomeOwners(testData.getPolicy());
			
			HomeOwnersStepsImpl cc = HomeOwnersSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			cc.searchClaim(SearchClaim.builder().claimNo(claimNumber).build());

			cc.verifyExposureDataUnavailability(ExposureDataUnavailability.builder()
					.dataMessage(testData.getDataMessage()).build());

			cc.verifyWorkPlanDataUnavailability(WorkPlanDataUnavailability.builder()
					.dataMessage(testData.getDataMessage()).build());

			cc.closeClaim(CloseClaim.builder()
					.note(testData.getNoteText())
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
	 * @author lavanya.bala
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the Reopen Claim functionality for home claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC188(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the Reopen Claim functionality for home claim",driver);

		HomeOwnersDataEngine testData = new HomeOwnersDataEngine("CC_GWTestData_DataEngine.xlsx", "Homeowners", "TC188");
		try {	

			HomeOwnersStepsImpl cc = HomeOwnersSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.verifyExposureDataUnavailability(ExposureDataUnavailability.builder()
					.dataMessage(testData.getDataMessage()).build());

			cc.verifyWorkPlanDataUnavailability(WorkPlanDataUnavailability.builder()
					.dataMessage(testData.getDataMessage()).build());

			cc.reOpenClaim(ReOpenClaim.builder()
					.note(testData.getNoteText())
					.outcome(testData.getOutcome())
					.closedStatus(testData.getClosedStatus())
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
	 * @author lavanya.bala
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the Email creation for home claim ", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC192(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the Email creation for home claim ",driver);
		HomeOwnersDataEngine testData = new HomeOwnersDataEngine("CC_GWTestData_DataEngine.xlsx", "Homeowners", "TC192");

		try {	

			HomeOwnersStepsImpl cc = HomeOwnersSteps.create();

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
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}

	/**
	 * @author lavanya.bala
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify that able to create a Recovery for home claim using Credit to expense", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC405(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to create a Recovery for home claim using Credit to expense",driver);
		HomeOwnersDataEngine testData = new HomeOwnersDataEngine("CC_GWTestData_DataEngine.xlsx", "Homeowners", "TC405");

		try {	

			HomeOwnersStepsImpl cc = HomeOwnersSteps.create();

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
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}

	/**
	 * @author lavanya.bala
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify that able to create a Recovery for home claim using Credit to loss", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC409(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to create a Recovery for home claim using Credit to loss",driver);
		HomeOwnersDataEngine testData = new HomeOwnersDataEngine("CC_GWTestData_DataEngine.xlsx", "Homeowners", "TC409");

		try {	

			HomeOwnersStepsImpl cc = HomeOwnersSteps.create();

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
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}

	/**
	 * @author lavanya.bala
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify that able to create a Recovery for home claim using Deductible", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC413(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to create a Recovery for home claim using Deductible",driver);
		HomeOwnersDataEngine testData = new HomeOwnersDataEngine("CC_GWTestData_DataEngine.xlsx", "Homeowners", "TC413");

		try {	

			HomeOwnersStepsImpl cc = HomeOwnersSteps.create();

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
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}

	/**
	 * @author lavanya.bala
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify that able to create a Recovery for home claim using Salvage", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC417(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to create a Recovery for home claim using Salvage",driver);
		HomeOwnersDataEngine testData = new HomeOwnersDataEngine("CC_GWTestData_DataEngine.xlsx", "Homeowners", "TC417");

		try {	

			HomeOwnersStepsImpl cc = HomeOwnersSteps.create();

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
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}

	/**
	 * @author lavanya.bala
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify that able to create a Recovery for home claim using Unspecified recovery category", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC425(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to create a Recovery for home claim using Unspecified recovery category",driver);
		HomeOwnersDataEngine testData = new HomeOwnersDataEngine("CC_GWTestData_DataEngine.xlsx", "Homeowners", "TC425");

		try {	

			HomeOwnersStepsImpl cc = HomeOwnersSteps.create();

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
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}


	/**
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the check payment for home claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC369(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the check payment for home claim",driver);
		HomeOwnersDataEngine testData = new HomeOwnersDataEngine("CC_GWTestData_DataEngine.xlsx", "Homeowners", "TC369");

		try {	

			String claimNumber = CCDataGenerator.createClaimForHomeOwners(testData.getPolicy());
			
			HomeOwnersStepsImpl cc = HomeOwnersSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			String insuredName =cc.searchClaim(SearchClaim.builder().claimNo(claimNumber).build());
			
			cc.addCoveragesByType(ChooseCoveragesByType.builder(Coverages.FUNGUS_AND_MOLD_REMEDIATION)
					.fungusAndMoldRemediation(Coverage.builder()
							.claimant(insuredName)
							.claimantType(testData.getClaimantType())
							.description(testData.getDamageDescription())
							.propertyName(testData.getPropertyName())
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
					.claimNumber(claimNumber)
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
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the manual check payment for home claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC373(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the manual check payment for home claim",driver);
		HomeOwnersDataEngine testData = new HomeOwnersDataEngine("CC_GWTestData_DataEngine.xlsx", "Homeowners", "TC373");

		try {	

			String claimNumber = CCDataGenerator.createClaimForHomeOwners(testData.getPolicy());
			
			HomeOwnersStepsImpl cc = HomeOwnersSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			String insuredName = cc.searchClaim(SearchClaim.builder().claimNo(claimNumber).build());

			cc.addCoverages(ChooseCoverages.builder(Coverages.IDENTITY_THEFT_PROTECTION)
					.identityTheftProtection(Coverage.builder()
							.claimant(insuredName)
							.claimantType(testData.getClaimantType())
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
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}

	/**
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the clone check functionality for home claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC377(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the clone check functionality for home claim",driver);
		HomeOwnersDataEngine testData = new HomeOwnersDataEngine("CC_GWTestData_DataEngine.xlsx", "Homeowners", "TC377");

		try {	

			HomeOwnersStepsImpl cc = HomeOwnersSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			String insuredName = cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.addCoveragesByType(ChooseCoveragesByType.builder(Coverages.COVERAGE_F)
					.coverage_F(CoverageType_F.builder()
							.medicalPaymentsToOthers(Coverage.builder()
									.claimant(insuredName)
									.claimantType(testData.getClaimantType())
									.injuredPerson(insuredName)
									.lossParty(testData.getLossParty())
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
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}

	/**
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the renters claim creation", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC6(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the renters claim creation",driver);
		HomeOwnersDataEngine testData = new HomeOwnersDataEngine("CC_GWTestData_DataEngine.xlsx", "Homeowners", "TC6");

		try {	

			HomeOwnersStepsImpl cc = HomeOwnersSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			cc.createClaim();

			String insuredName = cc.searchPolicy(Searchpolicy.builder()
					.policyType(PolicyType.RENTAL)
					.policyNo(testData.getPolicy())
					.lossDate(testData.getLossDate())
					.build());

			cc.enterBasicInformation(BasicInfo.builder()
					.insuredName(insuredName)
					.build());

			cc.addClaimInformation(ClaimInfo.builder()
					.lossCause(testData.getLossCause())
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
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}

	/**
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the clone check functionality for renters claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC379(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the clone check functionality for renters claim",driver);

		HomeOwnersDataEngine testData = new HomeOwnersDataEngine("CC_GWTestData_DataEngine.xlsx", "Homeowners", "TC379");
		try {	

			HomeOwnersStepsImpl cc = HomeOwnersSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			String insuredName = cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.addCoveragesByType(ChooseCoveragesByType.builder(Coverages.COVERAGE_F)
					.coverage_F(CoverageType_F.builder()
							.medicalPaymentsToOthers(Coverage.builder()
									.claimant(insuredName)
									.claimantType(testData.getClaimantType())
									.injuredPerson(insuredName)
									.lossParty(testData.getLossParty())
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
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}

	/**
	 * @author lavanya.bala
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify that able to add the existing contact in claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC234(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to add the existing contact in claim",driver);
		HomeOwnersDataEngine testData = new HomeOwnersDataEngine("CC_GWTestData_DataEngine.xlsx", "Homeowners", "TC234");

		try {	

			HomeOwnersStepsImpl cc = HomeOwnersSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.createContact(Contact.builder()
					.contactType(ContactType.EXISTING_CONTACT)
					.existingContact(ContactDetails.builder()
							.firstName(testData.getFirstName())
							.type(testData.getType())
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
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the transfer check functionality for Homeowners - Dwelling claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC381(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the transfer check functionality for Homeowners - Dwelling claim",driver);
		HomeOwnersDataEngine testData = new HomeOwnersDataEngine("CC_GWTestData_DataEngine.xlsx", "Homeowners", "TC381");

		try {	

			String claimNumber = CCDataGenerator.createClaimForHomeOwners(testData.getPolicy());
			
			HomeOwnersStepsImpl cc = HomeOwnersSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			String insuredName =cc.searchClaim(SearchClaim.builder().claimNo(claimNumber).build());
			
			cc.addCoveragesByType(ChooseCoveragesByType.builder(Coverages.COVERAGE_F)
					.coverage_F(CoverageType_F.builder()
							.medicalPaymentsToOthers(Coverage.builder()
									.claimant(insuredName)
									.claimantType(testData.getClaimantType())
									.injuredPerson(insuredName)
									.lossParty(testData.getLossParty())
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

}