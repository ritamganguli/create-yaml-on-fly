package com.aspire.guidewire.pc.testscripts;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoConstants;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoConstants.ProductNames;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoConstants.RiskAnalysisType;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoDataEngine;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoFeatures.CancellationSource;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoFeatures.CommercialAutoLine;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoFeatures.Coverages;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoFeatures.CreateNewAccountFromPerson;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoFeatures.Drivers;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoFeatures.EnterAccountInformation;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoFeatures.Offerings;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoFeatures.Payments;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoFeatures.PolicyChange;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoFeatures.PolicyDetails;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoFeatures.PolicyInfo;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoFeatures.PolicyReview;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoFeatures.PreRenewalDirection;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoFeatures.Qualification;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoFeatures.ReinstatementReason;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoFeatures.RenewPolicy;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoFeatures.RiskAnalysis;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoFeatures.SearchFor;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoFeatures.UWIssueType;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoFeatures.Vehicles;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoSteps;
import com.aspire.guidewire.pc.teststeps.commercialauto.CommercialAutoStepsImpl;
import com.aspire.guidewire.pc.teststeps.commercialauto.DataFakers;
import com.aspire.guidewire.utils.DataProviderUtils;
import com.aspire.guidewire.utils.EnvironmentPropertiesReader;
import com.aspire.guidewire.utils.Log;
import com.aspire.guidewire.webdriverManager.DriverManager;


public class PC_CommercialAutoSuite {

	boolean LambdatestStatus = false;

	private static EnvironmentPropertiesReader configProperty = EnvironmentPropertiesReader.getInstance();

	String pCWebSite, browser, contentGraphqlURL, browseAllContentGraphqlURL, sheetName;

	protected static ThreadLocal<WebDriver> threadLocalDriver = new ThreadLocal<>();

	@BeforeTest(alwaysRun = true)
	public void init(ITestContext context) {
		pCWebSite = (System.getProperty("pCWebSite") != null ? System.getProperty("pCWebSite"): context.getCurrentXmlTest().getParameter("pCWebSite"));
		DriverManager.setPCWebsite(pCWebSite);

		if(configProperty.hasProperty("runLambdaTestFromLocal") && configProperty.getProperty("runLambdaTestFromLocal").trim().equalsIgnoreCase("true")){
			LambdatestStatus = true;
		}
	}

	/**
	 * @author charu.anbarasan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Verify whether user able to create a commercial auto policy with additional insured as 'New person'", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC162(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialAutoDataEngine testData = new CommercialAutoDataEngine("GWTestData_DataEngine.xlsx", "CommercialAuto", "TC162");
		Log.testCaseInfo("Verify whether user able to create a commercial auto policy with additional insured as 'New person'",driver);
		try {	

			CommercialAutoStepsImpl pc = CommercialAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchAccount(EnterAccountInformation.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.build());

			pc.createAccount(CreateNewAccountFromPerson.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.addressLine1(testData.getAddressLine1())
					.state(testData.getState())  
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType())
					.organization(testData.getProducerOrganization())
					.build());

			pc.selectProduct(ProductNames.COMMERCIAL_AUTO);

			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());

			pc.selectQualifications(Qualification.builder().build());

			pc.updatePolicyInfo(PolicyInfo.builder()
					.policyEffectiveDate(testData.getCurrentDate())
					.policyTerm(testData.getPolicyTerm())
					.organizationType(testData.getOrganizationType())
					.build());

			pc.addCommercialAutoLineDetails(CommercialAutoLine.builder()
					.product(testData.getProduct())
					.fleet(testData.getFleet())
					.addAdditionalInsured(true)
					.createInsured(CreateNewAccountFromPerson.builder()
							.addAdditionalInsured(true)
							.firstName(testData.getFirstName())
							.lastName(testData.getLastName())
							.addressLine1(testData.getAddressLine1())
							.city(testData.getCity())
							.state(testData.getState())  
							.zipCode(testData.getZipcode())
							.addressType(testData.getAddressType())
							.insuredType(testData.getInsuredType())
							.build())
					.build());

			pc.addLocations();

			pc.addVehicle(Vehicles.builder()
					.vehicleType(testData.getVehicleType())
					.cost(testData.getCost())
					.VIN(testData.getVin())
					.build());

			pc.addStateInfo();

			pc.addNewDriver(Drivers.builder()
					.yearFirstLicensed(testData.getYearFirstLicensed())
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.dateOfBirth(testData.getDateOfBirth())
					.addressLineOne(testData.getAddressLine1())
					.city(testData.getCity())
					.state(testData.getState())  
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType())
					.licenseNumber(testData.getLicenseNumber())
					.licenseState(testData.getLicenseState())
					.build());

			pc.addCoveredVehicles();
			pc.addModifiersDetails();
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			pc.reviewPolicy(PolicyReview.builder(CommercialAutoConstants.PolicyReviewType.SUBMISSION).build());
			pc.viewQuote();
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(CommercialAutoConstants.Transactions.SUBMISSION);
			pc.viewPolicy();

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
	@Test(description="Verify whether user is able to create a commercial auto policy using Copy Submission Page transaction with Product as Business auto and Fleet as 10 or more units.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC163(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialAutoDataEngine testData = new CommercialAutoDataEngine("GWTestData_DataEngine.xlsx", "CommercialAuto", "TC163");
		Log.testCaseInfo("Verify whether user is able to create a commercial auto policy using Copy Submission Page transaction with Product as Business auto and Fleet as 10 or more units.", driver);
		try {	

			CommercialAutoStepsImpl pc = CommercialAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());

			pc.copySubmission();

			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());

			pc.selectQualifications(Qualification.builder().build());

			pc.updatePolicyInfo(PolicyInfo.builder()
					.build());

			pc.addCommercialAutoLineDetails(CommercialAutoLine.builder()
					.product(testData.getProduct())
					.fleet(testData.getFleet2())
					.build());

			pc.addLocations();
			// Removing existing Vehicle
			pc.addVehicle(Vehicles.builder()
					.existingVehiceDeletionStatus(true)
					.vehicleType(testData.getVehicleType())
					.cost(testData.getCost())
					.VIN(testData.getVin())
					.build());

			for(int i=0;i<10;i++) { 

				pc.addVehicle(Vehicles.builder()
						.vehicleType(testData.getVehicleType())
						.cost(testData.getCost())
						.VIN(DataFakers.VIN())
						.build());
			}

			pc.addStateInfo();

			pc.addNewDriver(Drivers.builder().build());

			pc.addCoveredVehicles();

			pc.addModifiersDetails();

			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());

			pc.reviewPolicy(PolicyReview.builder(CommercialAutoConstants.PolicyReviewType.NONE).build());

			pc.viewQuote();

			pc.viewForms();

			pc.selectPayments(Payments.builder().build());

			pc.issuepolicy(CommercialAutoConstants.Transactions.SUBMISSION);

			pc.viewPolicy();

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
	@Test(description="Verify whether the User able to Cancel the commercial auto policy using flat cancellation method.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC164(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialAutoDataEngine testData = new CommercialAutoDataEngine("GWTestData_DataEngine.xlsx", "CommercialAuto", "TC164");
		Log.testCaseInfo("Verify whether the User able to Cancel the commercial auto policy using flat cancellation method.", driver);
		try {	

			CommercialAutoStepsImpl pc = CommercialAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());

			pc.copySubmissions();

			pc.viewPolicy();

			pc.cancelPolicy(CancellationSource.builder().source(testData.getCancellationSource())
					.reason(testData.getCancellationReason()).build());

			pc.viewPolicy();

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
	@Test(description="Verify whether user able to cancel the commercial auto policy using pro rata cancellation method.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC165(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialAutoDataEngine testData = new CommercialAutoDataEngine("GWTestData_DataEngine.xlsx", "CommercialAuto", "TC165");
		Log.testCaseInfo("Verify whether user able to cancel the commercial auto policy using pro rata cancellation method.", driver);
		try {	

			CommercialAutoStepsImpl pc = CommercialAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());

			pc.copySubmissions();

			pc.viewPolicy();

			pc.cancelPolicy(CancellationSource.builder().source(testData.getCancellationSource())
					.reason(testData.getCancellationReason()).build());

			pc.viewPolicy();

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
	@Test(description="Verify whether user able to Reinstate a cancelled commercial auto policy.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC166(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialAutoDataEngine testData = new CommercialAutoDataEngine("GWTestData_DataEngine.xlsx", "CommercialAuto", "TC166");
		Log.testCaseInfo("Verify whether user able to Reinstate a cancelled commercial auto policy.", driver);
		try {	

			CommercialAutoStepsImpl pc = CommercialAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());

			pc.copySubmissions();

			pc.viewPolicy();

			pc.cancelPolicy(CancellationSource.builder().source(testData.getCancellationSource())
					.reason(testData.getCancellationReason()).build());

			pc.viewPolicy();

			pc.reinstatePolicy(ReinstatementReason.builder().reason(testData.getReinstatementReason()).build());

			pc.viewPolicy();

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
	@Test(description="Verify whether user able to complete a policy change transaction by changing coverages in commercial auto policy.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC167(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialAutoDataEngine testData = new CommercialAutoDataEngine("GWTestData_DataEngine.xlsx", "CommercialAuto", "TC167");
		Log.testCaseInfo("Verify whether user able to complete a policy change transaction by changing coverages in commercial auto policy.", driver);
		try {	

			CommercialAutoStepsImpl pc = CommercialAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());

			pc.copySubmissions();

			pc.viewPolicy();

			pc.policyChange(PolicyChange.builder()
					.date(testData.getCurrentDate())
					.build());

			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());

			pc.updatePolicyInfo(PolicyInfo.builder().build());

			pc.addCommercialAutoLineDetails(CommercialAutoLine.builder()
					.build());
			pc.addLocations();

			pc.addVehicle(Vehicles.builder()	
					.build());

			pc.addStateInfo();

			pc.addNewDriver(Drivers.builder().build());

			pc.addCoveredVehicles();

			pc.addModifiersDetails();

			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());

			pc.reviewPolicy(PolicyReview.builder(CommercialAutoConstants.PolicyReviewType.NONE).build());

			pc.viewQuote();

			pc.viewForms();

			pc.selectPayments(Payments.builder().build());

			pc.issuepolicy(CommercialAutoConstants.Transactions.POLICY_CHANGE);

			pc.viewPolicy();

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
	@Test(description="Verify whether the User able to Complete a policy change transaction by adding vehicles in commercial auto policy.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC168(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialAutoDataEngine testData = new CommercialAutoDataEngine("GWTestData_DataEngine.xlsx", "CommercialAuto", "TC168");

		Log.testCaseInfo("Verify whether the User able to Complete a policy change transaction by adding vehicles in commercial auto policy.", driver);
		try {	

			CommercialAutoStepsImpl pc = CommercialAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());
			
			pc.copySubmissions();

			pc.viewPolicy();

			pc.policyChange(PolicyChange.builder()
					.date(testData.getCurrentDate())
					.build());

			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());

			pc.updatePolicyInfo(PolicyInfo.builder().build());

			pc.addCommercialAutoLineDetails(CommercialAutoLine.builder().build());

			pc.addLocations();

			pc.addVehicle(Vehicles.builder()
					.vehicleType(testData.getVehicleType())
					.cost(testData.getCost())
					.VIN(DataFakers.VIN())
					.build());

			pc.addStateInfo();

			pc.addNewDriver(Drivers.builder().build());

			pc.addCoveredVehicles();

			pc.addModifiersDetails();

			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());

			pc.reviewPolicy(PolicyReview.builder(CommercialAutoConstants.PolicyReviewType.NONE).build());

			pc.viewQuote();

			pc.viewForms();

			pc.selectPayments(Payments.builder().build());

			pc.issuepolicy(CommercialAutoConstants.Transactions.POLICY_CHANGE);

			pc.viewPolicy();

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
	@Test(description="Verify whether the User able to Complete a rewrite full term transaction for commercial auto policy.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC169(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialAutoDataEngine testData = new CommercialAutoDataEngine("GWTestData_DataEngine.xlsx", "CommercialAuto", "TC169");
		Log.testCaseInfo("Verify whether the User able to Complete a rewrite full term transaction for commercial auto policy.", driver);
		try {	

			CommercialAutoStepsImpl pc = CommercialAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());

			pc.copySubmissions();

			pc.viewPolicy();

			pc.cancelPolicy(CancellationSource.builder().source(testData.getCancellationSource())
					.reason(testData.getCancellationReason()).build());

			pc.viewPolicy();

			pc.policyRewriteFullTerm();

			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());

			pc.updatePolicyInfo(PolicyInfo.builder()
					.policyTerm(testData.getPolicyTerm())
					.build());

			pc.addCommercialAutoLineDetails(CommercialAutoLine.builder().build());

			pc.addLocations();
			pc.addVehicle(Vehicles.builder()
					.build());

			pc.addStateInfo();

			pc.addNewDriver(Drivers.builder().build());

			pc.addCoveredVehicles();

			pc.addModifiersDetails();

			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());

			pc.reviewPolicy(PolicyReview.builder(CommercialAutoConstants.PolicyReviewType.NONE).build());

			pc.viewQuote();

			pc.viewForms();

			pc.selectPayments(Payments.builder().build());

			pc.issuepolicy(CommercialAutoConstants.Transactions.REWRITE_FULL_TERM);

			pc.viewPolicy();

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
	@Test(description="Verify whether the User able to Complete a rewrite new term transaction for commercial auto policy.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC170(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialAutoDataEngine testData = new CommercialAutoDataEngine("GWTestData_DataEngine.xlsx", "CommercialAuto", "TC170");
		Log.testCaseInfo("Verify whether the User able to Complete a rewrite new term transaction for commercial auto policy.", driver);
		try {	

			CommercialAutoStepsImpl pc = CommercialAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());

			pc.copySubmissions();

			pc.viewPolicy();

			pc.cancelPolicy(CancellationSource.builder().source(testData.getCancellationSource())
					.reason(testData.getCancellationReason()).build());

			pc.viewPolicy();

			pc.policyRewriteNewTerm();

			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());

			pc.updatePolicyInfo(PolicyInfo.builder()
					.policyTerm(testData.getPolicyTerm())
					.build());

			pc.addCommercialAutoLineDetails(CommercialAutoLine.builder().build());

			pc.addLocations();

			pc.addVehicle(Vehicles.builder()
					.build());

			pc.addStateInfo();

			pc.addNewDriver(Drivers.builder().build());

			pc.addCoveredVehicles();

			pc.addModifiersDetails();

			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());

			pc.reviewPolicy(PolicyReview.builder(CommercialAutoConstants.PolicyReviewType.NONE).build());

			pc.viewQuote();

			pc.viewForms();

			pc.selectPayments(Payments.builder().build());

			pc.issuepolicy(CommercialAutoConstants.Transactions.REWRITE_FULL_TERM);

			pc.approveUWissue(UWIssueType.builder().build());

			pc.issuepolicy(CommercialAutoConstants.Transactions.REWRITE_FULL_TERM);

			pc.viewPolicy();

			Log.testCaseResult(driver);

		} catch (Exception e) {
			Log.exception(e, DriverManager.getDriver());
		} finally {
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}
	/**
	 * @author vignesh.ravi
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Verify whether the user is able to rewrite remainder of term transaction for commercial auto policy", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC171(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialAutoDataEngine testData = new CommercialAutoDataEngine("GWTestData_DataEngine.xlsx", "CommercialAuto", "TC171");
		Log.testCaseInfo("Verify whether the user is able to rewrite remainder of term transaction for commercial auto policy", driver);
		try {	

			CommercialAutoStepsImpl pc = CommercialAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());

			pc.copySubmissions();

			pc.viewPolicy();

			pc.cancelPolicy(CancellationSource.builder().source(testData.getCancellationSource())
					.reason(testData.getCancellationReason()).build());

			pc.viewPolicy();

			pc.policyRewriteRemainderTerm();

			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());

			pc.updatePolicyInfo(PolicyInfo.builder().build());

			pc.addCommercialAutoLineDetails(CommercialAutoLine.builder().build());

			pc.addLocations();

			pc.addVehicle(Vehicles.builder().build());

			pc.addStateInfo();

			pc.addNewDriver(Drivers.builder().build());

			pc.addCoveredVehicles();

			pc.addModifiersDetails();

			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());

			pc.reviewPolicy(PolicyReview.builder(CommercialAutoConstants.PolicyReviewType.NONE).build());

			pc.viewQuote();

			pc.viewForms();

			pc.selectPayments(Payments.builder().build());

			pc.issuepolicy(CommercialAutoConstants.Transactions.REWRITE_REMAINDER_TERM);

			pc.viewPolicy();

			Log.testCaseResult(driver);

		} catch (Exception e) {
			Log.exception(e, DriverManager.getDriver());
		} finally {
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}

	/**
	 * @author vignesh.ravi
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Verify whether the User able to Renew the commercial auto policy.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC172(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialAutoDataEngine testData = new CommercialAutoDataEngine("GWTestData_DataEngine.xlsx", "CommercialAuto", "TC172");
		Log.testCaseInfo("Verify whether the User able to Renew the commercial auto policy.", driver);
		try {	

			CommercialAutoStepsImpl pc = CommercialAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());

			pc.copySubmissions();

			pc.viewPolicy();

			pc.policyRenew();

			pc.selectOfferings(Offerings.builder().build());
			pc.updatePolicyInfo(PolicyInfo.builder().build());
			pc.addCommercialAutoLineDetails(CommercialAutoLine.builder().build());
			pc.addLocations();
			pc.addVehicle(Vehicles.builder().build());

			pc.addStateInfo();

			pc.addNewDriver(Drivers.builder().build());

			pc.addCoveredVehicles();
			pc.addModifiersDetails();
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			pc.reviewPolicy(PolicyReview.builder(CommercialAutoConstants.PolicyReviewType.RENEW).build());
			pc.viewQuote();
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(CommercialAutoConstants.Transactions.RENEW_POLICY);
			pc.policyRenewal(RenewPolicy.builder().renewalcode(testData.getRenewalCode()).build());
			pc.viewPolicy();
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
	@Test(description="Verify whether the User able to Complete an out of sequence transaction for commercial auto policy.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC174(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialAutoDataEngine testData = new CommercialAutoDataEngine("GWTestData_DataEngine.xlsx", "CommercialAuto", "TC174");
		Log.testCaseInfo("Verify whether the User able to Complete an out of sequence transaction for commercial auto policy.", driver);
		try {	

			CommercialAutoStepsImpl pc = CommercialAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());

			pc.copySubmissions();

			pc.viewPolicy();

			pc.policyChange(PolicyChange.builder()
					.date(testData.getEffectiveDateOneMonthAhead())
					.build());
			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());
			pc.updatePolicyInfo(PolicyInfo.builder()
					.build());
			pc.addCommercialAutoLineDetails(CommercialAutoLine.builder()
					.addCoverage(Coverages.builder()
							.state(testData.getState())
							.costOfHire(testData.getCost())
							.build()).build());
			pc.addLocations();

			pc.addVehicle(Vehicles.builder().build());

			pc.addStateInfo();

			pc.addNewDriver(Drivers.builder().build());

			pc.addCoveredVehicles();
			pc.addModifiersDetails();
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			pc.reviewPolicy(PolicyReview.builder(CommercialAutoConstants.PolicyReviewType.NONE).build());
			pc.viewQuote();
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(CommercialAutoConstants.Transactions.POLICY_CHANGE);
			pc.viewPolicy();

			pc.policyChange(PolicyChange.builder()
					.date(testData.getCurrentDate())
					.build());
			pc.verifyOutOfSequenceMessage(PolicyChange.builder()
					.date(testData.getEffectiveDateOneMonthAhead()).build());

			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());
			pc.verifyOutOfSequenceMessage(PolicyChange.builder()
					.date(testData.getEffectiveDateOneMonthAhead()).build());

			pc.updatePolicyInfo(PolicyInfo.builder()
					.build());
			pc.verifyOutOfSequenceMessage(PolicyChange.builder()
					.date(testData.getEffectiveDateOneMonthAhead()).build());

			pc.addCommercialAutoLineDetails(CommercialAutoLine.builder().build());
			pc.verifyOutOfSequenceMessage(PolicyChange.builder()
					.date(testData.getEffectiveDateOneMonthAhead()).build());

			pc.addLocations();
			pc.verifyOutOfSequenceMessage(PolicyChange.builder()
					.date(testData.getEffectiveDateOneMonthAhead()).build());

			pc.addVehicle(Vehicles.builder()
					.vehicleType(testData.getVehicleType())
					.cost(testData.getCost())
					.VIN(DataFakers.VIN())
					.build());
			pc.verifyOutOfSequenceMessage(PolicyChange.builder()
					.date(testData.getEffectiveDateOneMonthAhead()).build());

			pc.addStateInfo();
			pc.verifyOutOfSequenceMessage(PolicyChange.builder()
					.date(testData.getEffectiveDateOneMonthAhead()).build());

			pc.addNewDriver(Drivers.builder().build());
			pc.verifyOutOfSequenceMessage(PolicyChange.builder()
					.date(testData.getEffectiveDateOneMonthAhead()).build());

			pc.addCoveredVehicles();
			pc.verifyOutOfSequenceMessage(PolicyChange.builder()
					.date(testData.getEffectiveDateOneMonthAhead()).build());

			pc.addModifiersDetails();
			pc.verifyOutOfSequenceMessage(PolicyChange.builder()
					.date(testData.getEffectiveDateOneMonthAhead()).build());

			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			pc.verifyOutOfSequenceMessage(PolicyChange.builder()
					.date(testData.getEffectiveDateOneMonthAhead()).build());

			pc.reviewPolicy(PolicyReview.builder(CommercialAutoConstants.PolicyReviewType.NONE).build());
			pc.verifyOutOfSequenceMessage(PolicyChange.builder()
					.date(testData.getEffectiveDateOneMonthAhead()).build());

			pc.viewQuote();
			pc.verifyOutOfSequenceMessage(PolicyChange.builder()
					.date(testData.getEffectiveDateOneMonthAhead()).build());

			pc.viewForms();
			pc.verifyOutOfSequenceMessage(PolicyChange.builder()
					.date(testData.getEffectiveDateOneMonthAhead()).build());
			pc.selectPayments(Payments.builder().build());
			pc.verifyOutOfSequenceMessage(PolicyChange.builder()
					.date(testData.getEffectiveDateOneMonthAhead()).build());
			pc.issuepolicy(CommercialAutoConstants.Transactions.POLICY_CHANGE);
			pc.viewPolicy();

			Log.testCaseResult(driver);

		} catch (Exception e) {
			Log.exception(e, DriverManager.getDriver());
		} finally {
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}

	/**
	 * @author vignesh.ravi
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Verify whether the User able to Set pre renewal direction for commercial auto policy.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC175(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialAutoDataEngine testData = new CommercialAutoDataEngine("GWTestData_DataEngine.xlsx", "CommercialAuto", "TC175");
		Log.testCaseInfo("Verify whether the User able to Set pre renewal direction for commercial auto policy.", driver);
		try {	

			CommercialAutoStepsImpl pc = CommercialAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());

			pc.policyPreRenewalDirection(PreRenewalDirection.builder()
					.direction(testData.getPreRenewalDirection())
					.security(testData.getPreRenewalSecurity())
					.reason(testData.getPreRenewalReason())
					.text(testData.getPreRenewalText()).build());
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
	@Test(description="Verify whether the User able to Create a commercial auto policy with one vehicle.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC176(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialAutoDataEngine testData = new CommercialAutoDataEngine("GWTestData_DataEngine.xlsx", "CommercialAuto", "TC176");
		Log.testCaseInfo("Verify whether the User able to Create a commercial auto policy with one vehicle.", driver);
		try {	

			CommercialAutoStepsImpl pc = CommercialAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchAccount(EnterAccountInformation.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.build());

			pc.createAccount(CreateNewAccountFromPerson.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.addressLine1(testData.getAddressLine1())
					.state(testData.getState())  
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType())
					.organization(testData.getProducerOrganization())
					.build());

			pc.selectProduct(ProductNames.COMMERCIAL_AUTO);

			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());

			pc.selectQualifications(Qualification.builder().build());

			pc.updatePolicyInfo(PolicyInfo.builder()
					.policyEffectiveDate(testData.getCurrentDate())
					.policyTerm(testData.getPolicyTerm())
					.organizationType(testData.getOrganizationType())
					.build());

			pc.addCommercialAutoLineDetails(CommercialAutoLine.builder()
					.product(testData.getProduct())
					.fleet(testData.getFleet())
					.build());

			pc.addLocations();

			pc.addVehicle(Vehicles.builder()
					.vehicleType(testData.getVehicleType())
					.cost(testData.getCost())
					.VIN(testData.getVin())
					.build());

			pc.addStateInfo();

			pc.addNewDriver(Drivers.builder()
					.yearFirstLicensed(testData.getYearFirstLicensed())
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.dateOfBirth(testData.getDateOfBirth())
					.addressLineOne(testData.getAddressLine1())
					.city(testData.getCity())
					.state(testData.getState())  
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType())
					.licenseNumber(testData.getLicenseNumber())
					.licenseState(testData.getLicenseState())
					.build());

			pc.addCoveredVehicles();
			pc.addModifiersDetails();
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			pc.reviewPolicy(PolicyReview.builder(CommercialAutoConstants.PolicyReviewType.SUBMISSION).build());
			pc.viewQuote();
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(CommercialAutoConstants.Transactions.SUBMISSION);
			pc.viewPolicy();

			Log.testCaseResult(driver);

		} catch (Exception e) {
			Log.exception(e, DriverManager.getDriver());
		} finally {
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}

	/**
	 * @author vignesh.ravi
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Verify whether the User able to Renewal transaction for commercial auto policy ", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC201(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialAutoDataEngine testData = new CommercialAutoDataEngine("GWTestData_DataEngine.xlsx", "CommercialAuto", "TC201");
		Log.testCaseInfo("Verify whether the User able to Renewal transaction for commercial auto policy.", driver);

		try {	

			CommercialAutoStepsImpl pc = CommercialAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());

			pc.copySubmissions();

			pc.viewPolicy();

			pc.policyRenew();
			pc.selectOfferings(Offerings.builder().build());
			pc.updatePolicyInfo(PolicyInfo.builder().build());
			pc.addCommercialAutoLineDetails(CommercialAutoLine.builder().build());
			pc.addLocations();
			pc.addVehicle(Vehicles.builder().build());

			pc.addStateInfo();

			pc.addNewDriver(Drivers.builder().build());

			pc.addCoveredVehicles();
			pc.addModifiersDetails();
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			pc.reviewPolicy(PolicyReview.builder(CommercialAutoConstants.PolicyReviewType.RENEW).build());
			pc.viewQuote();
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(CommercialAutoConstants.Transactions.RENEW_POLICY);
			pc.policyRenewal(RenewPolicy.builder().renewalcode(testData.getRenewalCode()).build());
			pc.viewPolicy();
			Log.testCaseResult(driver);

		} catch (Exception e) {
			Log.exception(e, DriverManager.getDriver());
		} finally {
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}

	/**
	 * @author vignesh.ravi
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Verify a rewrite remainder of term transaction for commercial auto policy", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC200(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialAutoDataEngine testData = new CommercialAutoDataEngine("GWTestData_DataEngine.xlsx", "CommercialAuto", "TC200");
		Log.testCaseInfo("Verify a rewrite remainder of term transaction for commercial auto policy", driver);
		try {	


			CommercialAutoStepsImpl pc = CommercialAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());

			pc.copySubmissions();

			pc.viewPolicy();

			pc.cancelPolicy(CancellationSource.builder().source(testData.getCancellationSource())
					.reason(testData.getCancellationReason()).build());
			pc.viewPolicy();

			pc.policyRewriteRemainderTerm();

			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());
			pc.updatePolicyInfo(PolicyInfo.builder().build());
			pc.addCommercialAutoLineDetails(CommercialAutoLine.builder().build());
			pc.addLocations();
			pc.addVehicle(Vehicles.builder().build());

			pc.addStateInfo();

			pc.addNewDriver(Drivers.builder().build());

			pc.addCoveredVehicles();
			pc.addModifiersDetails();
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			pc.reviewPolicy(PolicyReview.builder(CommercialAutoConstants.PolicyReviewType.NONE).build());
			pc.viewQuote();
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(CommercialAutoConstants.Transactions.REWRITE_REMAINDER_TERM);
			pc.viewPolicy();
			Log.testCaseResult(driver);

		} catch (Exception e) {
			Log.exception(e, DriverManager.getDriver());
		} finally {
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}

	/**
	 * @author vignesh.ravi
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Verify whether the User able to process pre renewal direction for a Commercial Auto policy", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC205(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialAutoDataEngine testData = new CommercialAutoDataEngine("GWTestData_DataEngine.xlsx", "CommercialAuto", "TC205");
		Log.testCaseInfo("Verify whether the User able to process pre renewal direction for a Commercial Auto policy", driver);
		try {	

			CommercialAutoStepsImpl pc = CommercialAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());

			pc.policyPreRenewalDirection(PreRenewalDirection.builder()
					.direction(testData.getPreRenewalDirection())
					.security(testData.getPreRenewalSecurity())
					.reason(testData.getPreRenewalReason())
					.text(testData.getPreRenewalText()).build());
			
			Log.testCaseResult(driver);
			
		} catch (Exception e) {
			Log.exception(e, DriverManager.getDriver());
		} finally {
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}

	/**
	 * @author vignesh.ravi
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Verify whether the User able to process Cancel the commercial auto policy using flat cancellation method.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC208(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialAutoDataEngine testData = new CommercialAutoDataEngine("GWTestData_DataEngine.xlsx", "CommercialAuto", "TC208");
		Log.testCaseInfo("Verify whether the User able to process Cancel the commercial auto policy using flat cancellation method.", driver);
		try {	

			CommercialAutoStepsImpl pc = CommercialAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());

			pc.copySubmissions();

			pc.viewPolicy();

			pc.cancelPolicy(CancellationSource.builder().source(testData.getCancellationSource())
					.reason(testData.getCancellationReason()).build());

			pc.viewPolicy();

			Log.testCaseResult(driver);

		} catch (Exception e) {
			Log.exception(e, DriverManager.getDriver());
		} finally {
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}

	/**
	 * @author vignesh.ravi
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Verify whether user able to cancel the commercial auto policy using pro rata cancellation method.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC209(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialAutoDataEngine testData = new CommercialAutoDataEngine("GWTestData_DataEngine.xlsx", "CommercialAuto", "TC209");
		Log.testCaseInfo("Verify whether user able to cancel the commercial auto policy using pro rata cancellation method.", driver);
		try {	

			CommercialAutoStepsImpl pc = CommercialAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());

			pc.copySubmissions();

			pc.viewPolicy();

			pc.cancelPolicy(CancellationSource.builder().source(testData.getCancellationSource())
					.reason(testData.getCancellationReason()).build());
			pc.viewPolicy();

			Log.testCaseResult(driver);

		} catch (Exception e) {
			Log.exception(e, DriverManager.getDriver());
		} finally {
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}

	/**
	 * @author vignesh.ravi
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Verify whether the User able to process Policy Reinstatement transaction for commercial auto policy.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC210(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialAutoDataEngine testData = new CommercialAutoDataEngine("GWTestData_DataEngine.xlsx", "CommercialAuto", "TC210");
		Log.testCaseInfo("Verify whether the User able to process Policy Reinstatement transaction for commercial auto policy.", driver);
		try {	

			CommercialAutoStepsImpl pc = CommercialAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());

			pc.copySubmissions();

			pc.viewPolicy();

			pc.cancelPolicy(CancellationSource.builder().source(testData.getCancellationSource())
					.reason(testData.getCancellationReason()).build());
			pc.viewPolicy();

			pc.reinstatePolicy(ReinstatementReason.builder().reason(testData.getReinstatementReason()).build());
			pc.viewPolicy();

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
	@Test(description="Verify whether user is able to create a commercial auto policy using Copy Submission Page transaction with Product as Business auto and Fleet as 10 or more units.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC207(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialAutoDataEngine testData = new CommercialAutoDataEngine("GWTestData_DataEngine.xlsx", "CommercialAuto", "TC207");
		Log.testCaseInfo("Verify whether user is able to create a commercial auto policy using Copy Submission Page transaction with Product as Business auto and Fleet as 10 or more units.", driver);
		try {	


			CommercialAutoStepsImpl pc = CommercialAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchAccount(EnterAccountInformation.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.build());

			pc.createAccount(CreateNewAccountFromPerson.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.addressLine1(testData.getAddressLine1())
					.state(testData.getState())
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType())
					.organization(testData.getProducerOrganization())
					.build());

			pc.selectProduct(ProductNames.COMMERCIAL_AUTO);

			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());

			pc.selectQualifications(Qualification.builder().build());

			pc.updatePolicyInfo(PolicyInfo.builder()
					.policyEffectiveDate(testData.getCurrentDate())
					.policyTerm(testData.getPolicyTerm())
					.organizationType(testData.getOrganizationType())
					.build());

			pc.addCommercialAutoLineDetails(CommercialAutoLine.builder()
					.product(testData.getProduct())
					.fleet(testData.getFleet())
					.build());

			pc.addLocations();

			for(int i=0;i<10;i++) { 

				pc.addVehicle(Vehicles.builder()
						.vehicleType(testData.getVehicleType())
						.cost(testData.getCost())
						.VIN(DataFakers.VIN())
						.build());
			}

			pc.addStateInfo();

			pc.addNewDriver(Drivers.builder()
					.yearFirstLicensed(testData.getYearFirstLicensed())
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.dateOfBirth(testData.getDateOfBirth())
					.addressLineOne(testData.getAddressLine1())
					.state(testData.getState())
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType())
					.licenseNumber(testData.getLicenseNumber())
					.licenseState(testData.getLicenseState())
					.build());
			pc.addCoveredVehicles();
			pc.addModifiersDetails();
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			pc.reviewPolicy(PolicyReview.builder(CommercialAutoConstants.PolicyReviewType.SUBMISSION).build());
			pc.viewQuote();
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(CommercialAutoConstants.Transactions.SUBMISSION);
			pc.viewPolicy();

			pc.copySubmission();
			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());
			pc.selectQualifications(Qualification.builder().build());
			pc.updatePolicyInfo(PolicyInfo.builder()
					.build());
			pc.addCommercialAutoLineDetails(CommercialAutoLine.builder()
					.build());

			pc.addLocations();
			pc.addVehicle(Vehicles.builder()
					.build());
			pc.addStateInfo();

			pc.addNewDriver(Drivers.builder().build());


			pc.addCoveredVehicles();
			pc.addModifiersDetails();
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			pc.reviewPolicy(PolicyReview.builder(CommercialAutoConstants.PolicyReviewType.NONE).build());
			pc.viewQuote();
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(CommercialAutoConstants.Transactions.SUBMISSION);
			pc.viewPolicy();

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
	@Test(description="Verify whether user able to create a commercial auto policy with one additional insured person.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC173(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialAutoDataEngine testData = new CommercialAutoDataEngine("GWTestData_DataEngine.xlsx", "CommercialAuto", "TC173");
		Log.testCaseInfo("Verify whether user able to create a commercial auto policy with additional insured as 'New person'", driver);
		try {

			CommercialAutoStepsImpl pc = CommercialAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchAccount(EnterAccountInformation.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.build());

			pc.createAccount(CreateNewAccountFromPerson.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.addressLine1(testData.getAddressLine1())
					.state(testData.getState())  
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType())
					.organization(testData.getProducerOrganization())
					.build());

			pc.selectProduct(ProductNames.COMMERCIAL_AUTO);

			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());

			pc.selectQualifications(Qualification.builder().build());

			pc.updatePolicyInfo(PolicyInfo.builder()
					.policyEffectiveDate(testData.getCurrentDate())
					.policyTerm(testData.getPolicyTerm())
					.organizationType(testData.getOrganizationType())
					.build());

			pc.addCommercialAutoLineDetails(CommercialAutoLine.builder()
					.product(testData.getProduct())
					.fleet(testData.getFleet())
					.addAdditionalInsured(true)
					.createInsured(CreateNewAccountFromPerson.builder()
							.addAdditionalInsured(true)
							.firstName(testData.getFirstName())
							.lastName(testData.getLastName())
							.addressLine1(testData.getAddressLine1())
							.city(testData.getCity())
							.state(testData.getState())  
							.zipCode(testData.getZipcode())
							.addressType(testData.getAddressType())
							.insuredType(testData.getInsuredType())
							.build())
					.build());

			pc.addLocations();

			pc.addVehicle(Vehicles.builder()
					.vehicleType(testData.getVehicleType())
					.cost(testData.getCost())
					.VIN(testData.getVin())
					.build());

			pc.addStateInfo();

			pc.addNewDriver(Drivers.builder()
					.yearFirstLicensed(testData.getYearFirstLicensed())
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.dateOfBirth(testData.getDateOfBirth())
					.addressLineOne(testData.getAddressLine1())
					.city(testData.getCity())
					.state(testData.getState())  
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType())
					.licenseNumber(testData.getLicenseNumber())
					.licenseState(testData.getLicenseState())
					.build());

			pc.addCoveredVehicles();
			pc.addModifiersDetails();
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			pc.reviewPolicy(PolicyReview.builder(CommercialAutoConstants.PolicyReviewType.SUBMISSION).build());
			pc.viewQuote();
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(CommercialAutoConstants.Transactions.SUBMISSION);
			pc.viewPolicy();
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
	@Test(description="Verify whether user is able to add 10 vehicles with one additional insured person for commercial auto policy", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC202(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialAutoDataEngine testData = new CommercialAutoDataEngine("GWTestData_DataEngine.xlsx", "CommercialAuto", "TC202");
		Log.testCaseInfo("Verify whether user is able to add 10 vehicles with one additional insured person for commercial auto policy", driver);
		try {	

			CommercialAutoStepsImpl pc = CommercialAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchAccount(EnterAccountInformation.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.build());

			pc.createAccount(CreateNewAccountFromPerson.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.addressLine1(testData.getAddressLine1())
					.state(testData.getState())  
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType())
					.organization(testData.getProducerOrganization())
					.build());

			pc.selectProduct(ProductNames.COMMERCIAL_AUTO);

			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());

			pc.selectQualifications(Qualification.builder().build());

			pc.updatePolicyInfo(PolicyInfo.builder()
					.policyEffectiveDate(testData.getCurrentDate())
					.policyTerm(testData.getPolicyTerm())
					.organizationType(testData.getOrganizationType())
					.build());

			pc.addCommercialAutoLineDetails(CommercialAutoLine.builder()
					.product(testData.getProduct())
					.fleet(testData.getFleet())
					.addAdditionalInsured(true)
					.createInsured(CreateNewAccountFromPerson.builder()
							.addAdditionalInsured(true)
							.firstName(testData.getFirstName())
							.lastName(testData.getLastName())
							.addressLine1(testData.getAddressLine1())
							.city(testData.getCity())
							.state(testData.getState())  
							.zipCode(testData.getZipcode())
							.addressType(testData.getAddressType())
							.insuredType(testData.getInsuredType())
							.build())
					.build());

			pc.addLocations();

			for(int i=0;i<10;i++) { 

				pc.addVehicle(Vehicles.builder()
						.vehicleType(testData.getVehicleType())
						.cost(testData.getCost())
						.VIN(DataFakers.VIN())
						.build());
			}

			pc.addStateInfo();

			pc.addNewDriver(Drivers.builder()
					.yearFirstLicensed(testData.getYearFirstLicensed())
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.dateOfBirth(testData.getDateOfBirth())
					.addressLineOne(testData.getAddressLine1())
					.city(testData.getCity())
					.state(testData.getState())  
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType())
					.licenseNumber(testData.getLicenseNumber())
					.licenseState(testData.getLicenseState())
					.build());

			pc.addCoveredVehicles();
			pc.addModifiersDetails();
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			pc.reviewPolicy(PolicyReview.builder(CommercialAutoConstants.PolicyReviewType.SUBMISSION).build());
			pc.viewQuote();
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(CommercialAutoConstants.Transactions.SUBMISSION);
			pc.viewPolicy();

			Log.testCaseResult(driver);

		} catch (Exception e) {
			Log.exception(e, DriverManager.getDriver());
		} finally {
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}

	/**
	 * @author vignesh.ravi
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Verify whether user is able to add one additional insured person with one vehicle for commercial auto policy ", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC206(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialAutoDataEngine testData = new CommercialAutoDataEngine("GWTestData_DataEngine.xlsx", "CommercialAuto", "TC206");
		Log.testCaseInfo("Verify whether user is able to add one additional insured person with one vehicle for commercial auto policy ", driver);
		try {	

			CommercialAutoStepsImpl pc = CommercialAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchAccount(EnterAccountInformation.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.build());

			pc.createAccount(CreateNewAccountFromPerson.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.addressLine1(testData.getAddressLine1())
					.state(testData.getState())  
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType())
					.organization(testData.getProducerOrganization())
					.build());

			pc.selectProduct(ProductNames.COMMERCIAL_AUTO);

			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());

			pc.selectQualifications(Qualification.builder().build());

			pc.updatePolicyInfo(PolicyInfo.builder()
					.policyEffectiveDate(testData.getCurrentDate())
					.policyTerm(testData.getPolicyTerm())
					.organizationType(testData.getOrganizationType())
					.build());

			pc.addCommercialAutoLineDetails(CommercialAutoLine.builder()
					.product(testData.getProduct())
					.fleet(testData.getFleet())
					.addAdditionalInsured(true)
					.createInsured(CreateNewAccountFromPerson.builder()
							.addAdditionalInsured(true)
							.firstName(testData.getFirstName())
							.lastName(testData.getLastName())
							.addressLine1(testData.getAddressLine1())
							.city(testData.getCity())
							.state(testData.getState())  
							.zipCode(testData.getZipcode())
							.addressType(testData.getAddressType())
							.insuredType(testData.getInsuredType())
							.build())
					.build());

			pc.addLocations();

			pc.addVehicle(Vehicles.builder()
					.vehicleType(testData.getVehicleType())
					.cost(testData.getCost())
					.VIN(DataFakers.VIN())
					.build());

			pc.addStateInfo();

			pc.addNewDriver(Drivers.builder()
					.yearFirstLicensed(testData.getYearFirstLicensed())
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.dateOfBirth(testData.getDateOfBirth())
					.addressLineOne(testData.getAddressLine1())
					.city(testData.getCity())
					.state(testData.getState())  
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType())
					.licenseNumber(testData.getLicenseNumber())
					.licenseState(testData.getLicenseState())
					.build());

			pc.addCoveredVehicles();
			pc.addModifiersDetails();
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			pc.reviewPolicy(PolicyReview.builder(CommercialAutoConstants.PolicyReviewType.SUBMISSION).build());
			pc.viewQuote();
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(CommercialAutoConstants.Transactions.SUBMISSION);
			pc.viewPolicy();

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
	@Test(description="Verify whether the User able to process Commercial auto policy with one additional insured person.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC187(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialAutoDataEngine testData = new CommercialAutoDataEngine("GWTestData_DataEngine.xlsx", "CommercialAuto", "TC187");
		Log.testCaseInfo("Verify whether the User able to process Commercial auto policy with one additional insured person.", driver);
		try {	

			CommercialAutoStepsImpl pc = CommercialAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchAccount(EnterAccountInformation.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.build());

			pc.createAccount(CreateNewAccountFromPerson.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.addressLine1(testData.getAddressLine1())
					.state(testData.getState())  
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType())
					.organization(testData.getProducerOrganization())
					.build());

			pc.selectProduct(ProductNames.COMMERCIAL_AUTO);

			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());

			pc.selectQualifications(Qualification.builder().build());

			pc.updatePolicyInfo(PolicyInfo.builder()
					.policyEffectiveDate(testData.getCurrentDate())
					.policyTerm(testData.getPolicyTerm())
					.organizationType(testData.getOrganizationType())
					.build());

			pc.addCommercialAutoLineDetails(CommercialAutoLine.builder()
					.product(testData.getProduct())
					.fleet(testData.getFleet())
					.addAdditionalInsured(true)
					.createInsured(CreateNewAccountFromPerson.builder()
							.addAdditionalInsured(true)
							.firstName(testData.getFirstName())
							.lastName(testData.getLastName())
							.addressLine1(testData.getAddressLine1())
							.city(testData.getCity())
							.state(testData.getState())  
							.zipCode(testData.getZipcode())
							.addressType(testData.getAddressType())
							.insuredType(testData.getInsuredType())
							.build())
					.build());

			pc.addLocations();


			for(int i=0;i<10;i++) { 

				pc.addVehicle(Vehicles.builder()
						.vehicleType(testData.getVehicleType())
						.cost(testData.getCost())
						.VIN(DataFakers.VIN())
						.build());
			}	

			pc.addStateInfo();

			pc.addNewDriver(Drivers.builder()
					.yearFirstLicensed(testData.getYearFirstLicensed())
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.dateOfBirth(testData.getDateOfBirth())
					.addressLineOne(testData.getAddressLine1())
					.city(testData.getCity())
					.state(testData.getState())  
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType())
					.licenseNumber(testData.getLicenseNumber())
					.licenseState(testData.getLicenseState())
					.build());

			pc.addCoveredVehicles();
			pc.addModifiersDetails();
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			pc.reviewPolicy(PolicyReview.builder(CommercialAutoConstants.PolicyReviewType.SUBMISSION).build());
			pc.viewQuote();
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(CommercialAutoConstants.Transactions.SUBMISSION);
			pc.viewPolicy();

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
	@Test(description="Verify whether the User able to process Commercial auto policy with 10 or more vehicles.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC188(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialAutoDataEngine testData = new CommercialAutoDataEngine("GWTestData_DataEngine.xlsx", "CommercialAuto", "TC188");
		Log.testCaseInfo("Verify whether the User able to process Commercial auto policy with 10 or more vehicles.", driver);
		try {	

			CommercialAutoStepsImpl pc = CommercialAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchAccount(EnterAccountInformation.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.build());

			pc.createAccount(CreateNewAccountFromPerson.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.addressLine1(testData.getAddressLine1())
					.state(testData.getState())  
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType())
					.organization(testData.getProducerOrganization())
					.build());

			pc.selectProduct(ProductNames.COMMERCIAL_AUTO);

			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());

			pc.selectQualifications(Qualification.builder().build());

			pc.updatePolicyInfo(PolicyInfo.builder()
					.policyEffectiveDate(testData.getCurrentDate())
					.policyTerm(testData.getPolicyTerm())
					.organizationType(testData.getOrganizationType())
					.build());

			pc.addCommercialAutoLineDetails(CommercialAutoLine.builder()
					.product(testData.getProduct())
					.fleet(testData.getFleet())
					.addAdditionalInsured(true)
					.createInsured(CreateNewAccountFromPerson.builder()
							.addAdditionalInsured(true)
							.firstName(testData.getFirstName())
							.lastName(testData.getLastName())
							.addressLine1(testData.getAddressLine1())
							.city(testData.getCity())
							.state(testData.getState())  
							.zipCode(testData.getZipcode())
							.addressType(testData.getAddressType())
							.insuredType(testData.getInsuredType())
							.build())
					.build());

			pc.addLocations();

			for(int i=0;i<10;i++) { 

				pc.addVehicle(Vehicles.builder()
						.vehicleType(testData.getVehicleType())
						.cost(testData.getCost())
						.VIN(DataFakers.VIN())
						.build());
			}	
			pc.addStateInfo();

			pc.addNewDriver(Drivers.builder()
					.yearFirstLicensed(testData.getYearFirstLicensed())
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.dateOfBirth(testData.getDateOfBirth())
					.addressLineOne(testData.getAddressLine1())
					.city(testData.getCity())
					.state(testData.getState())  
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType())
					.licenseNumber(testData.getLicenseNumber())
					.licenseState(testData.getLicenseState())
					.build());

			pc.addCoveredVehicles();
			pc.addModifiersDetails();
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			pc.reviewPolicy(PolicyReview.builder(CommercialAutoConstants.PolicyReviewType.SUBMISSION).build());
			pc.viewQuote();
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(CommercialAutoConstants.Transactions.SUBMISSION);
			pc.viewPolicy();

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
	@Test(description="Verify whether the User able to process Out of Sequence transaction", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC189(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialAutoDataEngine testData = new CommercialAutoDataEngine("GWTestData_DataEngine.xlsx", "CommercialAuto", "TC189");
		Log.testCaseInfo("Verify whether the User able to process Out of Sequence transaction", driver);
		try {	

			CommercialAutoStepsImpl pc = CommercialAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());

			pc.copySubmissions();

			pc.viewPolicy();

			pc.policyChange(PolicyChange.builder().date(testData.getEffectiveDateOneMonthAhead()).build());

			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());
			pc.updatePolicyInfo(PolicyInfo.builder()
					.build());
			pc.addCommercialAutoLineDetails(CommercialAutoLine.builder()
					.addCoverage(Coverages.builder()
							.state(testData.getState())
							.costOfHire(testData.getCost())
							.build())
					.build());
			pc.addLocations();
			pc.addVehicle(Vehicles.builder()
					.build());
			pc.addStateInfo();
			pc.addNewDriver(Drivers.builder().build());
			pc.addCoveredVehicles();
			pc.addModifiersDetails();
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			pc.reviewPolicy(PolicyReview.builder(CommercialAutoConstants.PolicyReviewType.NONE).build());
			pc.viewQuote();
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(CommercialAutoConstants.Transactions.POLICY_CHANGE);
			pc.viewPolicy();
			pc.policyChange(PolicyChange.builder().date(testData.getCurrentDate()).build());
			pc.verifyOutOfSequenceMessage(PolicyChange.builder()
					.date(testData.getEffectiveDateOneMonthAhead()).build());
			pc.selectOfferings(Offerings.builder()
					.offerings(testData.getOfferings()).build());
			pc.verifyOutOfSequenceMessage(PolicyChange.builder()
					.date(testData.getEffectiveDateOneMonthAhead()).build());
			pc.updatePolicyInfo(PolicyInfo.builder().build());
			pc.verifyOutOfSequenceMessage(PolicyChange.builder()
					.date(testData.getEffectiveDateOneMonthAhead()).build());
			pc.addCommercialAutoLineDetails(CommercialAutoLine.builder().build());
			pc.verifyOutOfSequenceMessage(PolicyChange.builder()
					.date(testData.getEffectiveDateOneMonthAhead()).build());
			pc.addLocations();
			pc.verifyOutOfSequenceMessage(PolicyChange.builder()
					.date(testData.getEffectiveDateOneMonthAhead()).build());
			pc.addVehicle(Vehicles.builder().build());
			pc.verifyOutOfSequenceMessage(PolicyChange.builder()
					.date(testData.getEffectiveDateOneMonthAhead()).build());
			pc.addStateInfo();
			pc.verifyOutOfSequenceMessage(PolicyChange.builder()
					.date(testData.getEffectiveDateOneMonthAhead()).build());
			pc.addNewDriver(Drivers.builder().build());
			pc.verifyOutOfSequenceMessage(PolicyChange.builder()
					.date(testData.getEffectiveDateOneMonthAhead()).build());
			pc.addCoveredVehicles();
			pc.verifyOutOfSequenceMessage(PolicyChange.builder()
					.date(testData.getEffectiveDateOneMonthAhead()).build());
			pc.addModifiersDetails();
			pc.verifyOutOfSequenceMessage(PolicyChange.builder()
					.date(testData.getEffectiveDateOneMonthAhead()).build());
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			pc.verifyOutOfSequenceMessage(PolicyChange.builder()
					.date(testData.getEffectiveDateOneMonthAhead()).build());
			pc.reviewPolicy(PolicyReview.builder(CommercialAutoConstants.PolicyReviewType.NONE).build());
			pc.verifyOutOfSequenceMessage(PolicyChange.builder()
					.date(testData.getEffectiveDateOneMonthAhead()).build());
			pc.viewQuote();
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(CommercialAutoConstants.Transactions.POLICY_CHANGE);
			pc.viewPolicy();
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
	@Test(description="Verify whether the User able to process Pre-Renewal direction", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC190(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialAutoDataEngine testData = new CommercialAutoDataEngine("GWTestData_DataEngine.xlsx", "CommercialAuto", "TC190");
		Log.testCaseInfo("Verify whether the User able to process Pre-Renewal direction", driver);
		try {	

			CommercialAutoStepsImpl pc = CommercialAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());

			pc.policyPreRenewalDirection(PreRenewalDirection.builder()
					.direction(testData.getPreRenewalDirection())
					.security(testData.getPreRenewalSecurity())
					.reason(testData.getPreRenewalReason())
					.text(testData.getPreRenewalText()).build());

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
	@Test(description="Verify whether the user is able to process Commercial auto policy with one vehicle", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC191(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialAutoDataEngine testData = new CommercialAutoDataEngine("GWTestData_DataEngine.xlsx", "CommercialAuto", "TC191");
		Log.testCaseInfo("Verify whether the user is able to process Commercial auto policy with one vehicle", driver);
		try {	

			CommercialAutoStepsImpl pc = CommercialAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchAccount(EnterAccountInformation.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.build());

			pc.createAccount(CreateNewAccountFromPerson.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.addressLine1(testData.getAddressLine1())
					.state(testData.getState())  
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType())
					.organization(testData.getProducerOrganization())
					.build());

			pc.selectProduct(ProductNames.COMMERCIAL_AUTO);

			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());

			pc.selectQualifications(Qualification.builder().build());

			pc.updatePolicyInfo(PolicyInfo.builder()
					.policyEffectiveDate(testData.getCurrentDate())
					.policyTerm(testData.getPolicyTerm())
					.organizationType(testData.getOrganizationType())
					.build());

			pc.addCommercialAutoLineDetails(CommercialAutoLine.builder()
					.product(testData.getProduct())
					.fleet(testData.getFleet())
					.build());

			pc.addLocations();

			pc.addVehicle(Vehicles.builder()
					.vehicleType(testData.getVehicleType())
					.cost(testData.getCost())
					.VIN(testData.getVin())
					.build());

			pc.addStateInfo();

			pc.addNewDriver(Drivers.builder()
					.yearFirstLicensed(testData.getYearFirstLicensed())
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.dateOfBirth(testData.getDateOfBirth())
					.addressLineOne(testData.getAddressLine1())
					.city(testData.getCity())
					.state(testData.getState())  
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType())
					.licenseNumber(testData.getLicenseNumber())
					.licenseState(testData.getLicenseState())
					.build());

			pc.addCoveredVehicles();
			pc.addModifiersDetails();
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			pc.reviewPolicy(PolicyReview.builder(CommercialAutoConstants.PolicyReviewType.SUBMISSION).build());
			pc.viewQuote();
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(CommercialAutoConstants.Transactions.SUBMISSION);
			pc.viewPolicy();

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
	@Test(description="Verify whether the User is able to process Copy Submission Page transaction for commercial auto policy", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC192(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialAutoDataEngine testData = new CommercialAutoDataEngine("GWTestData_DataEngine.xlsx", "CommercialAuto", "TC192");
		Log.testCaseInfo("Verify whether the User is able to process Copy Submission Page transaction for commercial auto policy", driver);
		try {	

			CommercialAutoStepsImpl pc = CommercialAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());

			pc.copySubmission();
			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());
			pc.selectQualifications(Qualification.builder().build());
			pc.updatePolicyInfo(PolicyInfo.builder()
					.build());
			pc.addCommercialAutoLineDetails(CommercialAutoLine.builder()
					.build());

			pc.addLocations();
			pc.addVehicle(Vehicles.builder()
					.build());
			pc.addStateInfo();

			pc.addNewDriver(Drivers.builder().build());


			pc.addCoveredVehicles();
			pc.addModifiersDetails();
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			pc.reviewPolicy(PolicyReview.builder(CommercialAutoConstants.PolicyReviewType.NONE).build());
			pc.viewQuote();
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(CommercialAutoConstants.Transactions.SUBMISSION);
			pc.viewPolicy();

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
	@Test(description="Verify whether the User able to process Flat policy cancellation transaction for commercial auto policy.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC193(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialAutoDataEngine testData = new CommercialAutoDataEngine("GWTestData_DataEngine.xlsx", "CommercialAuto", "TC193");
		Log.testCaseInfo("Verify whether the User able to process Flat policy cancellation transaction for commercial auto policy.", driver);
		try {	
			CommercialAutoStepsImpl pc = CommercialAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());

			pc.copySubmissions();

			pc.viewPolicy();

			pc.cancelPolicy(CancellationSource.builder().source(testData.getCancellationSource())
					.reason(testData.getCancellationReason()).build());
			pc.viewPolicy();

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
	@Test(description="Verify whether the User able to complete pro rata  policy cancellation transaction for commercial auto policy.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC194(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialAutoDataEngine testData = new CommercialAutoDataEngine("GWTestData_DataEngine.xlsx", "CommercialAuto", "TC194");
		Log.testCaseInfo("Verify whether the User able to complete pro rata  policy cancellation transaction for commercial auto policy.complete pro rata policy cancellation transaction for commercial auto policy.", driver);
		try {	

			CommercialAutoStepsImpl pc = CommercialAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());

			pc.copySubmissions();

			pc.viewPolicy();

			pc.cancelPolicy(CancellationSource.builder().source(testData.getCancellationSource())
					.reason(testData.getCancellationReason()).build());
			pc.viewPolicy();

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
	@Test(description="Verify whether the User able to process Reinstate transaction for commercial auto policy.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC195(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialAutoDataEngine testData = new CommercialAutoDataEngine("GWTestData_DataEngine.xlsx", "CommercialAuto", "TC195");
		Log.testCaseInfo("Verify whether the User able to process Reinstate transaction for commercial auto policy.", driver);
		try {	

			CommercialAutoStepsImpl pc = CommercialAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());

			pc.copySubmissions();

			pc.viewPolicy();
			pc.cancelPolicy(CancellationSource.builder().source(testData.getCancellationSource())
					.reason(testData.getCancellationReason()).build());
			pc.viewPolicy();

			pc.reinstatePolicy(ReinstatementReason.builder().reason(testData.getReinstatementReason()).build());

			pc.viewPolicy();

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
	@Test(description="Verify whether the User able to process Policy change transaction by changing coverage's.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC196(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialAutoDataEngine testData = new CommercialAutoDataEngine("GWTestData_DataEngine.xlsx", "CommercialAuto", "TC196");
		Log.testCaseInfo("Verify whether the User able to process Policy change transaction by changing coverage's.", driver);
		try {	

			CommercialAutoStepsImpl pc = CommercialAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());

			pc.copySubmissions();

			pc.viewPolicy();

			pc.policyChange(PolicyChange.builder().date(testData.getCurrentDate())
					.build());

			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());
			pc.updatePolicyInfo(PolicyInfo.builder().build());
			pc.addCommercialAutoLineDetails(CommercialAutoLine.builder()
					.addCoverage(Coverages.builder()
							.state(testData.getState())
							.costOfHire(testData.getCost())				
							.build()).build());
			pc.addLocations();
			pc.addVehicle(Vehicles.builder()	
					.build());
			pc.addStateInfo();
			pc.addNewDriver(Drivers.builder().build());
			pc.addCoveredVehicles();
			pc.addModifiersDetails();
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			pc.reviewPolicy(PolicyReview.builder(CommercialAutoConstants.PolicyReviewType.NONE).build());
			pc.viewQuote();
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(CommercialAutoConstants.Transactions.POLICY_CHANGE);
			pc.viewPolicy();

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
	@Test(description="Verify whether the User able to process Policy change transaction by adding vehicles.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC197(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialAutoDataEngine testData = new CommercialAutoDataEngine("GWTestData_DataEngine.xlsx", "CommercialAuto", "TC197");
		Log.testCaseInfo("Verify whether the User able to process Policy change transaction by adding vehicles.", driver);
		try {	

			CommercialAutoStepsImpl pc = CommercialAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());

			pc.copySubmissions();

			pc.viewPolicy();

			pc.policyChange(PolicyChange.builder()
					.date(testData.getCurrentDate())
					.build());
			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());
			pc.updatePolicyInfo(PolicyInfo.builder().build());
			pc.addCommercialAutoLineDetails(CommercialAutoLine.builder()
					.addCoverage(Coverages.builder()
							.state(testData.getState())
							.costOfHire(testData.getCost())				
							.build()).build());
			pc.addLocations();
			pc.addVehicle(Vehicles.builder()
					.vehicleType(testData.getVehicleType())
					.cost(testData.getCost())
					.VIN(DataFakers.VIN())
					.build());
			pc.addStateInfo();

			pc.addNewDriver(Drivers.builder().build());

			pc.addCoveredVehicles();
			pc.addModifiersDetails();
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			pc.reviewPolicy(PolicyReview.builder(CommercialAutoConstants.PolicyReviewType.NONE).build());
			pc.viewQuote();
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(CommercialAutoConstants.Transactions.POLICY_CHANGE);
			pc.viewPolicy();

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
	@Test(description="Verify whether user is able to rewrite full term with new location added for commercial auto policy.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC198(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialAutoDataEngine testData = new CommercialAutoDataEngine("GWTestData_DataEngine.xlsx", "CommercialAuto", "TC198");
		Log.testCaseInfo("Verify whether user is able to rewrite full term with new location added for commercial auto policy.", driver);
		try {	

			CommercialAutoStepsImpl pc = CommercialAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());

			pc.copySubmissions();

			pc.viewPolicy();

			pc.cancelPolicy(CancellationSource.builder().source(testData.getCancellationSource())
					.reason(testData.getCancellationReason()).build());
			pc.viewPolicy();


			pc.policyRewriteFullTerm();
			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());
			pc.updatePolicyInfo(PolicyInfo.builder()
					.policyTerm(testData.getPolicyTerm2())
					.build());
			pc.addCommercialAutoLineDetails(CommercialAutoLine.builder().build());
			pc.addLocations();
			pc.addVehicle(Vehicles.builder()
					.build());

			pc.addStateInfo();

			pc.addNewDriver(Drivers.builder().build());

			pc.addCoveredVehicles();
			pc.addModifiersDetails();
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			pc.reviewPolicy(PolicyReview.builder(CommercialAutoConstants.PolicyReviewType.NONE).build());
			pc.viewQuote();
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(CommercialAutoConstants.Transactions.REWRITE_FULL_TERM);
			pc.viewPolicy();

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
	@Test(description="Verify whether the User able to Complete a rewrite new term transaction for commercial auto policy.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC199(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialAutoDataEngine testData = new CommercialAutoDataEngine("GWTestData_DataEngine.xlsx", "CommercialAuto", "TC199");
		Log.testCaseInfo("Verify whether the User able to Complete a rewrite new term transaction for commercial auto policy.", driver);
		try {	

			CommercialAutoStepsImpl pc = CommercialAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());

			pc.copySubmissions();

			pc.viewPolicy();

			pc.cancelPolicy(CancellationSource.builder().source(testData.getCancellationSource())
					.reason(testData.getCancellationReason()).build());
			pc.viewPolicy();

			pc.policyRewriteNewTerm();
			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());
			pc.updatePolicyInfo(PolicyInfo.builder()
					.policyTerm(testData.getPolicyTerm2())
					.build());
			pc.addCommercialAutoLineDetails(CommercialAutoLine.builder().build());
			pc.addLocations();
			pc.addVehicle(Vehicles.builder()
					.build());

			pc.addStateInfo();

			pc.addNewDriver(Drivers.builder().build());

			pc.addCoveredVehicles();
			pc.addModifiersDetails();
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			pc.reviewPolicy(PolicyReview.builder(CommercialAutoConstants.PolicyReviewType.NONE).build());
			pc.viewQuote();
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(CommercialAutoConstants.Transactions.REWRITE_NEW_TERM);
			pc.approveUWissue(UWIssueType.builder().build());
			pc.issuepolicy(CommercialAutoConstants.Transactions.REWRITE_NEW_TERM);
			pc.viewPolicy();

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
	@Test(description="Verify whether the User able to process Out of Sequence transaction", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC204(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialAutoDataEngine testData = new CommercialAutoDataEngine("GWTestData_DataEngine.xlsx", "CommercialAuto", "TC204");
		Log.testCaseInfo("Verify whether the User able to process Out of Sequence transaction", driver);
		try {	
			CommercialAutoStepsImpl pc = CommercialAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());

			pc.copySubmissions();

			pc.viewPolicy();

			pc.policyChange(PolicyChange.builder().date(testData.getEffectiveDateOneMonthAhead()).build());

			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());
			pc.updatePolicyInfo(PolicyInfo.builder()
					.build());
			pc.addCommercialAutoLineDetails(CommercialAutoLine.builder()
					.addCoverage(Coverages.builder()
							.state(testData.getState())
							.costOfHire(testData.getCost())
							.build())
					.build());
			pc.addLocations();
			pc.addVehicle(Vehicles.builder()
					.build());
			pc.addStateInfo();
			pc.addNewDriver(Drivers.builder().build());
			pc.addCoveredVehicles();
			pc.addModifiersDetails();
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			pc.reviewPolicy(PolicyReview.builder(CommercialAutoConstants.PolicyReviewType.NONE).build());
			pc.viewQuote();
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(CommercialAutoConstants.Transactions.POLICY_CHANGE);
			pc.viewPolicy();

			pc.policyChange(PolicyChange.builder().date(testData.getCurrentDate()).build());
			pc.verifyOutOfSequenceMessage(PolicyChange.builder()
					.date(testData.getEffectiveDateOneMonthAhead()).build());
			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());
			pc.verifyOutOfSequenceMessage(PolicyChange.builder()
					.date(testData.getEffectiveDateOneMonthAhead()).build());
			pc.updatePolicyInfo(PolicyInfo.builder().build());
			pc.verifyOutOfSequenceMessage(PolicyChange.builder()
					.date(testData.getEffectiveDateOneMonthAhead()).build());
			pc.addCommercialAutoLineDetails(CommercialAutoLine.builder().build());
			pc.verifyOutOfSequenceMessage(PolicyChange.builder()
					.date(testData.getEffectiveDateOneMonthAhead()).build());
			pc.addLocations();
			pc.verifyOutOfSequenceMessage(PolicyChange.builder()
					.date(testData.getEffectiveDateOneMonthAhead()).build());
			pc.addVehicle(Vehicles.builder().build());
			pc.verifyOutOfSequenceMessage(PolicyChange.builder()
					.date(testData.getEffectiveDateOneMonthAhead()).build());
			pc.addStateInfo();
			pc.verifyOutOfSequenceMessage(PolicyChange.builder()
					.date(testData.getEffectiveDateOneMonthAhead()).build());
			pc.addNewDriver(Drivers.builder().build());
			pc.verifyOutOfSequenceMessage(PolicyChange.builder()
					.date(testData.getEffectiveDateOneMonthAhead()).build());
			pc.addCoveredVehicles();
			pc.verifyOutOfSequenceMessage(PolicyChange.builder()
					.date(testData.getEffectiveDateOneMonthAhead()).build());
			pc.addModifiersDetails();
			pc.verifyOutOfSequenceMessage(PolicyChange.builder()
					.date(testData.getEffectiveDateOneMonthAhead()).build());
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			pc.verifyOutOfSequenceMessage(PolicyChange.builder()
					.date(testData.getEffectiveDateOneMonthAhead()).build());
			pc.reviewPolicy(PolicyReview.builder(CommercialAutoConstants.PolicyReviewType.NONE).build());
			pc.verifyOutOfSequenceMessage(PolicyChange.builder()
					.date(testData.getEffectiveDateOneMonthAhead()).build());
			pc.viewQuote();
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(CommercialAutoConstants.Transactions.POLICY_CHANGE);
			pc.viewPolicy();
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
	@Test(description="Verify whether user able to Create a commercial auto policy using Copy Submission Page transaction.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC177(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialAutoDataEngine testData = new CommercialAutoDataEngine("GWTestData_DataEngine.xlsx", "CommercialAuto", "TC177");
		Log.testCaseInfo("Verify whether user able to Create a commercial auto policy using Copy Submission Page transaction.", driver);
		try {	

			CommercialAutoStepsImpl pc = CommercialAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());

			pc.copySubmission();
			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());
			pc.selectQualifications(Qualification.builder().build());
			pc.updatePolicyInfo(PolicyInfo.builder()
					.build());
			pc.addCommercialAutoLineDetails(CommercialAutoLine.builder()
					.build());

			pc.addLocations();
			pc.addVehicle(Vehicles.builder()
					.build());
			pc.addStateInfo();

			pc.addNewDriver(Drivers.builder().build());

			pc.addCoveredVehicles();
			pc.addModifiersDetails();
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			pc.reviewPolicy(PolicyReview.builder(CommercialAutoConstants.PolicyReviewType.NONE).build());
			pc.viewQuote();
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(CommercialAutoConstants.Transactions.SUBMISSION);
			pc.viewPolicy();


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
	@Test(description="Verify wheather User can able to Flat policy cancellation transaction for commercial auto policy.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC178(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialAutoDataEngine testData = new CommercialAutoDataEngine("GWTestData_DataEngine.xlsx", "CommercialAuto", "TC178");
		Log.testCaseInfo("Verify wheather User can able to Flat policy cancellation transaction for commercial auto policy.", driver);
		try {	

			CommercialAutoStepsImpl pc = CommercialAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());

			pc.copySubmissions();

			pc.viewPolicy();

			pc.cancelPolicy(CancellationSource.builder().source(testData.getCancellationSource())
					.reason(testData.getCancellationReason()).build());

			pc.viewPolicy();

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
	@Test(description="Verify whether the User able to process Pro rata policy cancellation transaction for commercial auto policy.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC179(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialAutoDataEngine testData = new CommercialAutoDataEngine("GWTestData_DataEngine.xlsx", "CommercialAuto", "TC179");
		Log.testCaseInfo("Verify whether the User able to process Pro rata policy cancellation transaction for commercial auto policy.", driver);
		try {	

			CommercialAutoStepsImpl pc = CommercialAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());

			pc.copySubmissions();

			pc.viewPolicy();

			pc.cancelPolicy(CancellationSource.builder().source(testData.getCancellationSource())
					.reason(testData.getCancellationReason()).build());

			pc.viewPolicy();
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
	@Test(description="Verify wheather User can able to reinstatement Policy  transaction for commercial auto policy..", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC180(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialAutoDataEngine testData = new CommercialAutoDataEngine("GWTestData_DataEngine.xlsx", "CommercialAuto", "TC180");
		Log.testCaseInfo("Verify wheather User can able to reinstatement Policy  transaction for commercial auto policy.", driver);
		try {	

			CommercialAutoStepsImpl pc = CommercialAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());

			pc.copySubmissions();

			pc.viewPolicy();

			pc.cancelPolicy(CancellationSource.builder().source(testData.getCancellationSource())
					.reason(testData.getCancellationReason()).build());

			pc.viewPolicy();	

			pc.reinstatePolicy(ReinstatementReason.builder().reason(testData.getReinstatementReason()).build());
			
			pc.viewPolicy();

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
	@Test(description="Verify whether the User able to Rewrite full term transaction for commercial auto policy.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC183(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialAutoDataEngine testData = new CommercialAutoDataEngine("GWTestData_DataEngine.xlsx", "CommercialAuto", "TC183");
		Log.testCaseInfo("Verify whether the User able to Rewrite full term transaction for commercial auto policy.", driver);
		try {	


			CommercialAutoStepsImpl pc = CommercialAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());

			pc.copySubmissions();

			pc.viewPolicy();

			pc.cancelPolicy(CancellationSource.builder().source(testData.getCancellationSource())
					.reason(testData.getCancellationReason()).build());
			pc.viewPolicy();	

			pc.policyRewriteFullTerm();
			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());
			pc.updatePolicyInfo(PolicyInfo.builder()
					.policyTerm(testData.getPolicyTerm2())
					.build());
			pc.addCommercialAutoLineDetails(CommercialAutoLine.builder().build());
			pc.addLocations();
			pc.addVehicle(Vehicles.builder()
					.build());

			pc.addStateInfo();

			pc.addNewDriver(Drivers.builder().build());

			pc.addCoveredVehicles();
			pc.addModifiersDetails();
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			pc.reviewPolicy(PolicyReview.builder(CommercialAutoConstants.PolicyReviewType.NONE).build());
			pc.viewQuote();
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(CommercialAutoConstants.Transactions.REWRITE_FULL_TERM);
			pc.viewPolicy();

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
	@Test(description="Complete a rewrite new term transaction for commercial auto policy.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC184(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialAutoDataEngine testData = new CommercialAutoDataEngine("GWTestData_DataEngine.xlsx", "CommercialAuto", "TC184");
		Log.testCaseInfo("Complete a rewrite new term transaction for commercial auto policy.", driver);
		try {	

			CommercialAutoStepsImpl pc = CommercialAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());

			pc.copySubmissions();

			pc.viewPolicy();

			pc.cancelPolicy(CancellationSource.builder().source(testData.getCancellationSource())
					.reason(testData.getCancellationReason()).build());

			pc.viewPolicy();

			pc.policyRewriteNewTerm();
			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());
			pc.updatePolicyInfo(PolicyInfo.builder()
					.policyTerm(testData.getPolicyTerm2())
					.build());
			pc.addCommercialAutoLineDetails(CommercialAutoLine.builder().build());
			pc.addLocations();
			pc.addVehicle(Vehicles.builder()
					.build());

			pc.addStateInfo();

			pc.addNewDriver(Drivers.builder().build());

			pc.addCoveredVehicles();
			pc.addModifiersDetails();
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			pc.reviewPolicy(PolicyReview.builder(CommercialAutoConstants.PolicyReviewType.NONE).build());
			pc.viewQuote();
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(CommercialAutoConstants.Transactions.REWRITE_FULL_TERM);
			pc.approveUWissue(UWIssueType.builder().build());
			pc.issuepolicy(CommercialAutoConstants.Transactions.REWRITE_FULL_TERM);
			pc.viewPolicy();

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
	@Test(description="Verify whether the User able to Rewrite Remainder term transaction for commercial auto policy.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC185(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialAutoDataEngine testData = new CommercialAutoDataEngine("GWTestData_DataEngine.xlsx", "CommercialAuto", "TC185");
		Log.testCaseInfo("Verify whether the User able to Rewrite Remainder term transaction for commercial auto policy.", driver);
		try {	

			CommercialAutoStepsImpl pc = CommercialAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());

			pc.copySubmissions();

			pc.viewPolicy();

			pc.cancelPolicy(CancellationSource.builder().source(testData.getCancellationSource())
					.reason(testData.getCancellationReason()).build());
			pc.viewPolicy();


			pc.policyRewriteRemainderTerm();
			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());
			pc.updatePolicyInfo(PolicyInfo.builder().build());
			pc.addCommercialAutoLineDetails(CommercialAutoLine.builder().build());
			pc.addLocations();
			pc.addVehicle(Vehicles.builder().build());
			pc.addStateInfo();
			pc.addNewDriver(Drivers.builder().build());
			pc.addCoveredVehicles();
			pc.addModifiersDetails();
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			pc.reviewPolicy(PolicyReview.builder(CommercialAutoConstants.PolicyReviewType.NONE).build());
			pc.viewQuote();
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(CommercialAutoConstants.Transactions.REWRITE_REMAINDER_TERM);
			pc.viewPolicy();

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
	@Test(description="Verify whether the User able to process Renewal term transaction for commercial auto policy..", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC186(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialAutoDataEngine testData = new CommercialAutoDataEngine("GWTestData_DataEngine.xlsx", "CommercialAuto", "TC186");
		Log.testCaseInfo("Verify whether the User able to process Renewal term transaction for commercial auto policy..", driver);
		try {	

			CommercialAutoStepsImpl pc = CommercialAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());

			pc.copySubmissions();

			pc.viewPolicy();

			pc.policyRenew();

			pc.selectOfferings(Offerings.builder().build());
			pc.updatePolicyInfo(PolicyInfo.builder().build());
			pc.addCommercialAutoLineDetails(CommercialAutoLine.builder().build());
			pc.addLocations();
			pc.addVehicle(Vehicles.builder().build());

			pc.addStateInfo();

			pc.addNewDriver(Drivers.builder().build());

			pc.addCoveredVehicles();
			pc.addModifiersDetails();
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			pc.reviewPolicy(PolicyReview.builder(CommercialAutoConstants.PolicyReviewType.RENEW).build());
			pc.viewQuote();
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(CommercialAutoConstants.Transactions.RENEW_POLICY);
			pc.policyRenewal(RenewPolicy.builder().renewalcode(testData.getRenewalCode()).build());
			pc.viewPolicy();

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
	@Test(description="Verify whether the User able to proccess Policy change transaction by changing coverage's..", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC181(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialAutoDataEngine testData = new CommercialAutoDataEngine("GWTestData_DataEngine.xlsx", "CommercialAuto", "TC181");
		Log.testCaseInfo("Verify whether the User able to process Policy change transaction by changing coverage's.", driver);
		try {	

			CommercialAutoStepsImpl pc = CommercialAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());

			pc.copySubmissions();

			pc.viewPolicy();

			pc.policyChange(PolicyChange.builder()
					.date(testData.getCurrentDate())
					.build());
			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());
			pc.updatePolicyInfo(PolicyInfo.builder().build());
			pc.addCommercialAutoLineDetails(CommercialAutoLine.builder()
					.addCoverage(Coverages.builder()
							.state(testData.getState())
							.costOfHire(testData.getCost())				
							.build()).build());
			pc.addLocations();
			pc.addVehicle(Vehicles.builder()	
					.build());

			pc.addStateInfo();

			pc.addNewDriver(Drivers.builder().build());

			pc.addCoveredVehicles();
			pc.addModifiersDetails();
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			pc.reviewPolicy(PolicyReview.builder(CommercialAutoConstants.PolicyReviewType.NONE).build());
			pc.viewQuote();
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(CommercialAutoConstants.Transactions.POLICY_CHANGE);
			pc.viewPolicy();

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
	@Test(description="Verify whether the User able to Add vehicle during policy change .", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC182(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialAutoDataEngine testData = new CommercialAutoDataEngine("GWTestData_DataEngine.xlsx", "CommercialAuto", "TC182");
		Log.testCaseInfo("Verify whether the User able to Add vehicle during policy change .", driver);
		try {	

			CommercialAutoStepsImpl pc = CommercialAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());

			pc.copySubmissions();

			pc.viewPolicy();

			pc.policyChange(PolicyChange.builder()
					.date(testData.getCurrentDate())
					.build());
			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());
			pc.updatePolicyInfo(PolicyInfo.builder().build());
			pc.addCommercialAutoLineDetails(CommercialAutoLine.builder().build());
			pc.addLocations();
			pc.addVehicle(Vehicles.builder()
					.vehicleType(testData.getVehicleType())
					.cost(testData.getCost())
					.VIN(DataFakers.VIN())
					.build());

			pc.addStateInfo();

			pc.addNewDriver(Drivers.builder().build());

			pc.addCoveredVehicles();
			pc.addModifiersDetails();
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			pc.reviewPolicy(PolicyReview.builder(CommercialAutoConstants.PolicyReviewType.NONE).build());
			pc.viewQuote();
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(CommercialAutoConstants.Transactions.POLICY_CHANGE);
			pc.viewPolicy();

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
	@Test(description="Verify whether the User able to process Policy change transaction by changing coverage's..", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC211(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialAutoDataEngine testData = new CommercialAutoDataEngine("GWTestData_DataEngine.xlsx", "CommercialAuto", "TC211");
		Log.testCaseInfo("Verify whether the User able to process Policy change transaction by changing coverage's.", driver);
		try {	
			CommercialAutoStepsImpl pc = CommercialAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());

			pc.copySubmissions();

			pc.viewPolicy();

			pc.policyChange(PolicyChange.builder()
					.date(testData.getCurrentDate())
					.build());
			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());
			pc.updatePolicyInfo(PolicyInfo.builder().build());
			pc.addCommercialAutoLineDetails(CommercialAutoLine.builder()
					.addCoverage(Coverages.builder()
							.state(testData.getState())
							.costOfHire(testData.getCost())				
							.build()).build());
			pc.addLocations();
			pc.addVehicle(Vehicles.builder()	
					.build());

			pc.addStateInfo();

			pc.addNewDriver(Drivers.builder().build());

			pc.addCoveredVehicles();
			pc.addModifiersDetails();
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			pc.reviewPolicy(PolicyReview.builder(CommercialAutoConstants.PolicyReviewType.NONE).build());
			pc.viewQuote();
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(CommercialAutoConstants.Transactions.POLICY_CHANGE);
			pc.viewPolicy();

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
	@Test(description="Verify whether the contingency action is taken after running the Handle unresolved contingency batch process.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC265(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialAutoDataEngine testData = new CommercialAutoDataEngine("GWTestData_DataEngine.xlsx", "CommercialAuto", "TC265");
		Log.testCaseInfo("Verify whether the contingency action is taken after running the Handle unresolved contingency batch process.", driver);
		try {	

			CommercialAutoStepsImpl pc = CommercialAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchAccount(EnterAccountInformation.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.build());

			pc.createAccount(CreateNewAccountFromPerson.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.addressLine1(testData.getAddressLine1())
					.state(testData.getState())  
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType())
					.organization(testData.getProducerOrganization())
					.build());

			pc.selectProduct(ProductNames.COMMERCIAL_AUTO);

			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());

			pc.selectQualifications(Qualification.builder().build());

			pc.updatePolicyInfo(PolicyInfo.builder()
					.policyEffectiveDate(testData.getCurrentDate())
					.policyTerm(testData.getPolicyTerm())
					.organizationType(testData.getOrganizationType())
					.build());

			pc.addCommercialAutoLineDetails(CommercialAutoLine.builder()
					.product(testData.getProduct())
					.fleet(testData.getFleet())
					.build());

			pc.addLocations();

			pc.addVehicle(Vehicles.builder()
					.vehicleType(testData.getVehicleType())
					.cost(testData.getCost())
					.VIN(testData.getVin())
					.build());

			pc.addStateInfo();

			pc.addNewDriver(Drivers.builder()
					.yearFirstLicensed(testData.getYearFirstLicensed())
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.dateOfBirth(testData.getDateOfBirth())
					.addressLineOne(testData.getAddressLine1())
					.city(testData.getCity())
					.state(testData.getState())  
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType())
					.licenseNumber(testData.getLicenseNumber())
					.licenseState(testData.getLicenseState())
					.build());

			pc.addCoveredVehicles();
			pc.addModifiersDetails();
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.CONTINGENCY)
					.contingencyTitle(testData.getContingencyTitle())
					.contingencyDescription(testData.getContingencyDescription())
					.contingencyAction(testData.getContingencyAction())
					.contingencyDueDate(testData.getEffectiveDateOneMonthAhead()).build());
			pc.reviewPolicy(PolicyReview.builder(CommercialAutoConstants.PolicyReviewType.SUBMISSION).build());
			pc.viewQuote();
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(CommercialAutoConstants.Transactions.SUBMISSION);
			pc.viewPolicy();
			pc.runBatchProcessInfo();
			pc.runWorkQueueInfo();

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
	@Test(description="Verify the Content verification on policy confirmation letter  for commercial Auto policy.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC273(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialAutoDataEngine testData = new CommercialAutoDataEngine("GWTestData_DataEngine.xlsx", "CommercialAuto", "TC273");
		Log.testCaseInfo("Verify the Content verification on policy confirmation letter  for commercial Auto policy.", driver);
		try {	

			CommercialAutoStepsImpl pc = CommercialAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchAccount(EnterAccountInformation.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.build());

			pc.createAccount(CreateNewAccountFromPerson.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.addressLine1(testData.getAddressLine1())
					.state(testData.getState())  
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType())
					.organization(testData.getProducerOrganization())
					.build());

			pc.selectProduct(ProductNames.COMMERCIAL_AUTO);

			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());

			pc.selectQualifications(Qualification.builder().build());

			pc.updatePolicyInfo(PolicyInfo.builder()
					.policyEffectiveDate(testData.getCurrentDate())
					.policyTerm(testData.getPolicyTerm())
					.organizationType(testData.getOrganizationType())
					.build());

			pc.addCommercialAutoLineDetails(CommercialAutoLine.builder()
					.product(testData.getProduct())
					.fleet(testData.getFleet())
					.build());

			pc.addLocations();

			pc.addVehicle(Vehicles.builder()
					.vehicleType(testData.getVehicleType())
					.cost(testData.getCost())
					.VIN(testData.getVin())
					.build());

			pc.addStateInfo();

			pc.addNewDriver(Drivers.builder()
					.build());

			pc.addCoveredVehicles();
			pc.addModifiersDetails();
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			pc.reviewPolicy(PolicyReview.builder(CommercialAutoConstants.PolicyReviewType.SUBMISSION).build());
			pc.viewQuote();
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(CommercialAutoConstants.Transactions.SUBMISSION);
			pc.documentCreation();

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
	@Test(description="Verify whether the User able to Create an underwriter issue manually for commercial auto policy to block binding.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC275(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialAutoDataEngine testData = new CommercialAutoDataEngine("GWTestData_DataEngine.xlsx", "CommercialAuto", "TC275");
		Log.testCaseInfo("Verify whether the User able to Create an underwriter issue manually for commercial auto policy to block binding.", driver);
		try {	

			CommercialAutoStepsImpl pc = CommercialAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());

			pc.copySubmission();

			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.UW_ISSUE)
					.uWIssueType(testData.getUwIssueType())
					.longDescription(testData.getLongDescription()).build());	
			pc.reviewPolicy(PolicyReview.builder(CommercialAutoConstants.PolicyReviewType.NONE).build());
			pc.issuepolicy(CommercialAutoConstants.Transactions.BIND_ONLY);
			pc.approveUWissue(UWIssueType.builder()
					.issueType(testData.getUwIssueType())
					.build());
			pc.reviewPolicy(PolicyReview.builder(CommercialAutoConstants.PolicyReviewType.SUBMISSION)
					.build());
			pc.viewQuote();
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(CommercialAutoConstants.Transactions.SUBMISSION);
			pc.viewPolicy();

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
	@Test(description="Verify whether the User able to Create an underwriter issue manually for commercial auto policy to block issuance.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC276(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialAutoDataEngine testData = new CommercialAutoDataEngine("GWTestData_DataEngine.xlsx", "CommercialAuto", "TC276");
		Log.testCaseInfo("Verify whether the User able to process create an underwriter issue manually for commercial auto policy to block issuance.", driver);
		try {	

			CommercialAutoStepsImpl pc = CommercialAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());

			pc.copySubmission();

			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.UW_ISSUE)
					.uWIssueType(testData.getUwIssueType())
					.longDescription(testData.getLongDescription()).build());	
			pc.reviewPolicy(PolicyReview.builder(CommercialAutoConstants.PolicyReviewType.NONE)
					.build());

			pc.issuepolicy(CommercialAutoConstants.Transactions.BIND_ONLY);
			pc.approveUWissue(UWIssueType.builder()
					.issueType(testData.getUwIssueType())
					.build());
			pc.reviewPolicy(PolicyReview.builder(CommercialAutoConstants.PolicyReviewType.SUBMISSION)
					.build());
			pc.viewQuote();
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(CommercialAutoConstants.Transactions.SUBMISSION);
			pc.viewPolicy();

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
	@Test(description="Verify whether the User able to Reopen an underwriter issue which was blocking the quote for commercial auto policy.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC277(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialAutoDataEngine testData = new CommercialAutoDataEngine("GWTestData_DataEngine.xlsx", "CommercialAuto", "TC277");
		Log.testCaseInfo("Verify whether the User able to Reopen an underwriter issue which was blocking the quote for commercial auto policy.", driver);
		try {	

			CommercialAutoStepsImpl pc = CommercialAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());

			pc.copySubmission();

			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.UW_ISSUE)
					.uWIssueType(testData.getUwIssueType())
					.longDescription(testData.getLongDescription()).build());	
			pc.reviewPolicy(PolicyReview.builder(CommercialAutoConstants.PolicyReviewType.NONE)
					.build());
			pc.approveUWissue(UWIssueType.builder()
					.issueType(testData.getUwIssueType())
					.build());
			pc.reviewPolicy(PolicyReview.builder(CommercialAutoConstants.PolicyReviewType.REOPEN)
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
	@Test(description="Verify whether the User able to Reopen an underwriter issue which was blocking  bind for commercial auto policy.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC278(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialAutoDataEngine testData = new CommercialAutoDataEngine("GWTestData_DataEngine.xlsx", "CommercialAuto", "TC278");
		Log.testCaseInfo("Verify whether the User able to Reopen an underwriter issue which was blocking  bind for commercial auto policy.", driver);
		try {	

			CommercialAutoStepsImpl pc = CommercialAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());

			pc.copySubmission();
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.UW_ISSUE)
					.uWIssueType(testData.getUwIssueType())
					.longDescription(testData.getLongDescription()).build());	
			pc.reviewPolicy(PolicyReview.builder(CommercialAutoConstants.PolicyReviewType.NONE)
					.build());
			pc.viewQuote();
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(CommercialAutoConstants.Transactions.BIND_ONLY);
			pc.approveUWissue(UWIssueType.builder()
					.issueType(testData.getUwIssueType())
					.build());

			pc.reviewPolicy(PolicyReview.builder(CommercialAutoConstants.PolicyReviewType.REOPEN)
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
	@Test(description="Verify whether the User able to Reopen an underwriter issue which was blocking  issuance for commercial auto policy.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC279(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialAutoDataEngine testData = new CommercialAutoDataEngine("GWTestData_DataEngine.xlsx", "CommercialAuto", "TC279");
		Log.testCaseInfo("Verify whether the User able to Reopen an underwriter issue which was blocking  issuance for commercial auto policy.", driver);
		try {	

			CommercialAutoStepsImpl pc = CommercialAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());

			pc.copySubmission();

			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.UW_ISSUE)
					.uWIssueType(testData.getUwIssueType())
					.longDescription(testData.getLongDescription()).build());	
			pc.reviewPolicy(PolicyReview.builder(CommercialAutoConstants.PolicyReviewType.NONE)
					.build());
			pc.viewQuote();
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(CommercialAutoConstants.Transactions.SUBMISSION);
			pc.approveUWissue(UWIssueType.builder()
					.issueType(testData.getUwIssueType())
					.build());
			pc.reviewPolicy(PolicyReview.builder(CommercialAutoConstants.PolicyReviewType.REOPEN)
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
	@Test(description="Verify whether the User able to Create an underwriter activity for commercial auto policy.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC280(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialAutoDataEngine testData = new CommercialAutoDataEngine("GWTestData_DataEngine.xlsx", "CommercialAuto", "TC280");
		Log.testCaseInfo("Verify whether the User able to Create an underwriter activity for commercial auto policy.", driver);
		try {	

			CommercialAutoStepsImpl pc = CommercialAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());

			pc.copySubmission();

			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());

			pc.selectQualifications(Qualification.builder().build());

			pc.updatePolicyInfo(PolicyInfo.builder()
					.build());

			pc.addCommercialAutoLineDetails(CommercialAutoLine.builder()
					.build());

			pc.addLocations();
			pc.addVehicle(Vehicles.builder()
					.build());
			pc.addStateInfo();

			pc.addNewDriver(Drivers.builder().build());

			pc.addCoveredVehicles();
			pc.addModifiersDetails();
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.UW_ISSUE_APPROVE_REQUEST).uWIssueType(testData.getUwIssueType())
					.longDescription(testData.getLongDescription()).build());
			pc.reviewPolicy(PolicyReview.builder(CommercialAutoConstants.PolicyReviewType.NONE).build());
			pc.issuepolicy(CommercialAutoConstants.Transactions.SUBMISSION);
			pc.viewPolicy();

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
	@Test(description="Verify whether the user is able to issue a policy with manual loss history.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC281(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialAutoDataEngine testData = new CommercialAutoDataEngine("GWTestData_DataEngine.xlsx", "CommercialAuto", "TC281");
		Log.testCaseInfo("Verify whether the user is able to issue a policy with manual loss history.", driver);
		try {	
			CommercialAutoStepsImpl pc = CommercialAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());

			pc.copySubmission();

			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());

			pc.selectQualifications(Qualification.builder().build());

			pc.updatePolicyInfo(PolicyInfo.builder()
					.build());

			pc.addCommercialAutoLineDetails(CommercialAutoLine.builder()
					.build());

			pc.addLocations();
			pc.addVehicle(Vehicles.builder()
					.build());

			pc.addStateInfo();

			pc.addNewDriver(Drivers.builder().build());

			pc.addCoveredVehicles();

			pc.addModifiersDetails();

			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.PRIORLOSSES_MANUAL_ENTER)
					.lossCount(1)
					.lossHistoryType(testData.getLossHistoryType())
					.occurenceDateField(testData.getCurrentDate())
					.priorLossDescription(testData.getPriorLoss()).totalIncurred(testData.getTotalIncurred()).
					amountPaid(testData.getAmount()).openReserve(testData.getOpenReserve())
					.lossHistoryStatus(testData.getLossHistoryStatus()).build());
			pc.reviewPolicy(PolicyReview.builder(CommercialAutoConstants.PolicyReviewType.NONE).build());
			pc.issuepolicy(CommercialAutoConstants.Transactions.SUBMISSION);
			pc.viewPolicy();

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
	@Test(description="Verify whether the User able to process Rewrite full term transaction with additional coverages added for commercial auto policy.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC213(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialAutoDataEngine testData = new CommercialAutoDataEngine("GWTestData_DataEngine.xlsx", "CommercialAuto", "TC213");
		Log.testCaseInfo("Verify whether the User able to process Rewrite full term transaction with additional coverages added for commercial auto policy.", driver);
		try {	

			CommercialAutoStepsImpl pc = CommercialAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());

			pc.copySubmissions();

			pc.viewPolicy();

			pc.cancelPolicy(CancellationSource.builder().source(testData.getCancellationSource())
					.reason(testData.getCancellationReason()).build());

			pc.viewPolicy();

			pc.policyRewriteFullTerm();
			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());
			pc.updatePolicyInfo(PolicyInfo.builder()
					.policyTerm(testData.getPolicyTerm2())
					.build());
			pc.addCommercialAutoLineDetails(CommercialAutoLine.builder().build());

			pc.addLocations();

			pc.addVehicle(Vehicles.builder()
					.build());

			pc.addStateInfo();

			pc.addNewDriver(Drivers.builder().build());

			pc.addCoveredVehicles();
			pc.addModifiersDetails();
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			pc.reviewPolicy(PolicyReview.builder(CommercialAutoConstants.PolicyReviewType.NONE).build());
			pc.viewQuote();
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(CommercialAutoConstants.Transactions.REWRITE_FULL_TERM);
			pc.viewPolicy();

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
	@Test(description="Verify whether the User able to process Rewrite New term transaction for commercial auto policy.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC214(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialAutoDataEngine testData = new CommercialAutoDataEngine("GWTestData_DataEngine.xlsx", "CommercialAuto", "TC214");
		Log.testCaseInfo("Verify whether the User able to process Rewrite New term transaction for commercial auto policy.", driver);
		try {	

			CommercialAutoStepsImpl pc = CommercialAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());

			pc.copySubmissions();

			pc.viewPolicy();

			pc.cancelPolicy(CancellationSource.builder().source(testData.getCancellationSource())
					.reason(testData.getCancellationReason()).build());

			pc.viewPolicy();

			pc.policyRewriteNewTerm();
			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());
			pc.updatePolicyInfo(PolicyInfo.builder()
					.policyTerm(testData.getPolicyTerm2())
					.build());
			pc.addCommercialAutoLineDetails(CommercialAutoLine.builder().build());
			pc.addLocations();
			pc.addVehicle(Vehicles.builder()
					.build());

			pc.addStateInfo();

			pc.addNewDriver(Drivers.builder().build());

			pc.addCoveredVehicles();
			
			pc.addModifiersDetails();
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			pc.reviewPolicy(PolicyReview.builder(CommercialAutoConstants.PolicyReviewType.NONE).build());
			pc.viewQuote();
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(CommercialAutoConstants.Transactions.REWRITE_NEW_TERM);
			pc.approveUWissue(UWIssueType.builder().build());
			pc.issuepolicy(CommercialAutoConstants.Transactions.REWRITE_NEW_TERM);
			pc.viewPolicy();

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
	@Test(description="Verify whether the user is able to add prior policies manually in Risk Analysis screen for commercial auto policy.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC285(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialAutoDataEngine testData = new CommercialAutoDataEngine("GWTestData_DataEngine.xlsx", "CommercialAuto", "TC285");
		Log.testCaseInfo("Verify whether the user is able to add prior policies manually in Risk Analysis screen for commercial auto policy.",driver);
		try {	

			CommercialAutoStepsImpl pc = CommercialAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());

			pc.copySubmission();

			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());

			pc.selectQualifications(Qualification.builder().build());

			pc.updatePolicyInfo(PolicyInfo.builder()
					.build());

			pc.addCommercialAutoLineDetails(CommercialAutoLine.builder()
					.build());

			pc.addLocations();
			pc.addVehicle(Vehicles.builder()
					.build());
			pc.addStateInfo();

			pc.addNewDriver(Drivers.builder().build());

			pc.addCoveredVehicles();

			pc.addModifiersDetails();

			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.PRIORLOSSES_MANUAL_ENTER)
					.lossCount(1)
					.lossHistoryType(testData.getLossHistoryType())
					.occurenceDateField(testData.getCurrentDate())
					.priorLossDescription(testData.getPriorLoss()).totalIncurred(testData.getTotalIncurred()).
					amountPaid(testData.getAmount()).openReserve(testData.getOpenReserve())
					.lossHistoryStatus(testData.getLossHistoryStatus()).build());

			pc.reviewPolicy(PolicyReview.builder(CommercialAutoConstants.PolicyReviewType.NONE).build());
			pc.issuepolicy(CommercialAutoConstants.Transactions.SUBMISSION);
			pc.viewPolicy();

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
	@Test(description="Verify whether the user is able to Create a commercial auto policy by adding a contingency manually.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC286(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialAutoDataEngine testData = new CommercialAutoDataEngine("GWTestData_DataEngine.xlsx", "CommercialAuto", "TC286");
		Log.testCaseInfo("Verify whether the user is able to Create a commercial auto policy by adding a contingency manually.",driver);
		try {	

			CommercialAutoStepsImpl pc = CommercialAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());

			pc.copySubmission();

			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());

			pc.selectQualifications(Qualification.builder().build());

			pc.updatePolicyInfo(PolicyInfo.builder()
					.build());

			pc.addCommercialAutoLineDetails(CommercialAutoLine.builder()
					.build());

			pc.addLocations();
			pc.addVehicle(Vehicles.builder()
					.build());
			pc.addStateInfo();

			pc.addNewDriver(Drivers.builder().build());

			pc.addCoveredVehicles();
			pc.addModifiersDetails();

			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.CONTINGENCY)
					.contingencyTitle(testData.getContingencyTitle())
					.contingencyDescription(testData.getContingencyDescription())
					.contingencyAction(testData.getContingencyAction())
					.contingencyDueDate(testData.getEffectiveDateOneMonthAhead()).build());

			pc.reviewPolicy(PolicyReview.builder(CommercialAutoConstants.PolicyReviewType.NONE).build());
			
			pc.issuepolicy(CommercialAutoConstants.Transactions.SUBMISSION);
			
			pc.viewPolicy();

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
	@Test(description="Verify whether the User able to Resolve a contingency manually for commercial auto policy.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC287(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialAutoDataEngine testData = new CommercialAutoDataEngine("GWTestData_DataEngine.xlsx", "CommercialAuto", "TC287");
		Log.testCaseInfo("Verify whether the User able to Resolve a contingency manually for commercial auto policy.",driver);
		try {	


			CommercialAutoStepsImpl pc = CommercialAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());

			pc.copySubmission();

			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.CONTINGENCY)
					.contingencyTitle(testData.getContingencyTitle())
					.contingencyDescription(testData.getContingencyDescription())
					.contingencyAction(testData.getContingencyAction())
					.contingencyDueDate(testData.getEffectiveDateOneMonthAhead()).build());
			pc.reviewPolicy(PolicyReview.builder(CommercialAutoConstants.PolicyReviewType.NONE).build());
			pc.viewQuote();
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(CommercialAutoConstants.Transactions.SUBMISSION);
			pc.viewPolicy();
			pc.completedPolicyTransactions();
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.RESOLVE_CONTINGENCY).build());

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
	@Test(description="Verify whether the User able to process Policy change transaction by adding vehicles.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC212(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialAutoDataEngine testData = new CommercialAutoDataEngine("GWTestData_DataEngine.xlsx", "CommercialAuto", "TC212");
		Log.testCaseInfo("Verify whether the User able to process Policy change transaction by adding vehicles.");
		try {	

			CommercialAutoStepsImpl pc = CommercialAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());

			pc.copySubmissions();

			pc.viewPolicy();

			pc.policyChange(PolicyChange.builder()
					.date(testData.getCurrentDate())
					.build());
			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());
			pc.updatePolicyInfo(PolicyInfo.builder().build());

			pc.addCommercialAutoLineDetails(CommercialAutoLine.builder()
					.addCoverage(Coverages.builder()
							.state(testData.getState())
							.costOfHire(testData.getCost())
							.build()).build());

			pc.addLocations();
			pc.addVehicle(Vehicles.builder()
					.vehicleType(testData.getVehicleType())
					.cost(testData.getCost())
					.VIN(DataFakers.VIN())
					.build());

			pc.addVehicle(Vehicles.builder()
					.vehicleType(testData.getVehicleType())
					.cost(testData.getCost())
					.VIN(DataFakers.VIN())
					.build());

			pc.addStateInfo();

			pc.addNewDriver(Drivers.builder().build());

			pc.addCoveredVehicles();
			pc.addModifiersDetails();
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			pc.reviewPolicy(PolicyReview.builder(CommercialAutoConstants.PolicyReviewType.NONE).build());
			pc.viewQuote();
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(CommercialAutoConstants.Transactions.POLICY_CHANGE);
			pc.viewPolicy();

			Log.testCaseResult(driver);

		} catch (Exception e) {
			Log.exception(e, DriverManager.getDriver());
		} finally {
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}

	/**
	 * @author vignesh.ravi
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Verify whether the User able to process Non - Renewal(Pre Renewal Direction) for Commercial Auto", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC220(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialAutoDataEngine testData = new CommercialAutoDataEngine("GWTestData_DataEngine.xlsx", "CommercialAuto", "TC220");
		Log.testCaseInfo("Verify whether the User able to process Non - Renewal(Pre Renewal Direction) for Commercial Auto", driver);
		try {	

			CommercialAutoStepsImpl pc = CommercialAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());

			pc.policyPreRenewalDirection(PreRenewalDirection.builder()
					.direction(testData.getPreRenewalDirection())
					.security(testData.getPreRenewalSecurity())
					.reason(testData.getPreRenewalReason())
					.text(testData.getPreRenewalText()).build());

			Log.testCaseResult(driver);

		} catch (Exception e) {
			Log.exception(e, DriverManager.getDriver());
		} finally {
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}

	/**
	 * @author vignesh.ravi
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Verify whether the User able to process Commercial auto policy with semi annual term.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC221(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialAutoDataEngine testData = new CommercialAutoDataEngine("GWTestData_DataEngine.xlsx", "CommercialAuto", "TC221");
		Log.testCaseInfo("Verify whether the User able to process Commercial auto policy with semi annual term.", driver);
		try {	

			CommercialAutoStepsImpl pc = CommercialAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchAccount(EnterAccountInformation.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.build());

			pc.createAccount(CreateNewAccountFromPerson.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.addressLine1(testData.getAddressLine1())
					.state(testData.getState())  
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType())
					.organization(testData.getProducerOrganization())
					.build());

			pc.selectProduct(ProductNames.COMMERCIAL_AUTO);

			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());

			pc.selectQualifications(Qualification.builder().build());

			pc.updatePolicyInfo(PolicyInfo.builder()
					.policyEffectiveDate(testData.getCurrentDate())
					.policyTerm(testData.getPolicyTerm())
					.organizationType(testData.getOrganizationType())
					.build());

			pc.addCommercialAutoLineDetails(CommercialAutoLine.builder()
					.product(testData.getProduct())
					.fleet(testData.getFleet())
					.build());

			pc.addLocations();

			pc.addVehicle(Vehicles.builder()
					.vehicleType(testData.getVehicleType())
					.cost(testData.getCost())
					.VIN(testData.getVin())
					.build());

			pc.addStateInfo();

			pc.addNewDriver(Drivers.builder()
					.yearFirstLicensed(testData.getYearFirstLicensed())
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.dateOfBirth(testData.getDateOfBirth())
					.addressLineOne(testData.getAddressLine1())
					.city(testData.getCity())
					.state(testData.getState())  
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType())
					.licenseNumber(testData.getLicenseNumber())
					.licenseState(testData.getLicenseState())
					.build());

			pc.addCoveredVehicles();
			pc.addModifiersDetails();
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			pc.reviewPolicy(PolicyReview.builder(CommercialAutoConstants.PolicyReviewType.SUBMISSION).build());
			pc.viewQuote();
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(CommercialAutoConstants.Transactions.SUBMISSION);
			pc.viewPolicy();

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
	@Test(description="Verify whether the user is able to issue a policy with documents.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC282(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialAutoDataEngine testData = new CommercialAutoDataEngine("GWTestData_DataEngine.xlsx", "CommercialAuto", "TC282");
		Log.testCaseInfo("Verify whether the user is able to issue a policy with documents.", driver);
		try {	

			CommercialAutoStepsImpl pc = CommercialAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());

			pc.copySubmission();

			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());

			pc.selectQualifications(Qualification.builder().build());

			pc.updatePolicyInfo(PolicyInfo.builder()
					.build());

			pc.addCommercialAutoLineDetails(CommercialAutoLine.builder()
					.build());

			pc.addLocations();
			pc.addVehicle(Vehicles.builder()
					.build());
			pc.addStateInfo();

			pc.addNewDriver(Drivers.builder().build());

			pc.addCoveredVehicles();
			pc.addModifiersDetails();
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.PRIORLOSSES_ATTACH_DOCUMENT)
					.documentName(testData.getDocumentName())
					.lossHistoryType(testData.getLossHistoryType()).lossPercent(testData.getLossPercent())
					.lossTotalIncurred(testData.getTotalIncurred()).uploadDocumentStatus(testData.getUploadDocumentStatus()).build());
			pc.reviewPolicy(PolicyReview.builder(CommercialAutoConstants.PolicyReviewType.NONE).build());
			pc.issuepolicy(CommercialAutoConstants.Transactions.SUBMISSION);
			pc.viewPolicy();

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
	@Test(description="Verify whether the user is able to issue a policy with one or more manual loss history.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC283(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialAutoDataEngine testData = new CommercialAutoDataEngine("GWTestData_DataEngine.xlsx", "CommercialAuto", "TC283");
		Log.testCaseInfo("Verify whether the user is able to issue a policy with one or more manual loss history.", driver);
		try {	

			CommercialAutoStepsImpl pc = CommercialAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());

			pc.copySubmission();

			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());

			pc.selectQualifications(Qualification.builder().build());

			pc.updatePolicyInfo(PolicyInfo.builder()
					.build());

			pc.addCommercialAutoLineDetails(CommercialAutoLine.builder()
					.build());

			pc.addLocations();
			pc.addVehicle(Vehicles.builder()
					.build());
			pc.addStateInfo();

			pc.addNewDriver(Drivers.builder().build());

			pc.addCoveredVehicles();
			pc.addModifiersDetails();

			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.PRIORLOSSES_MANUAL_ENTER)
					.lossCount(1)
					.lossHistoryType(testData.getLossHistoryType())
					.occurenceDateField(testData.getCurrentDate())
					.priorLossDescription(testData.getPriorLoss()).totalIncurred(testData.getTotalIncurred())
					.amountPaid(testData.getAmount()).openReserve(testData.getOpenReserve())
					.lossHistoryStatus(testData.getLossHistoryStatus()).build());
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.PRIORLOSSES_MANUAL_ENTER)
					.lossCount(2)
					.lossHistoryType(testData.getLossHistoryType())
					.occurenceDateField(testData.getCurrentDate())
					.priorLossDescription(testData.getPriorLoss()).totalIncurred(testData.getTotalIncurred())
					.amountPaid(testData.getAmount()).openReserve(testData.getOpenReserve())
					.lossHistoryStatus(testData.getLossHistoryStatus()).build());
			pc.reviewPolicy(PolicyReview.builder(CommercialAutoConstants.PolicyReviewType.NONE).build());
			pc.issuepolicy(CommercialAutoConstants.Transactions.SUBMISSION);
			pc.viewPolicy();
			
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
	@Test(description="Verify whether the User able to Create a contingency with an action 'Change policy for remainder of term' for commercial auto policy.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC292(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialAutoDataEngine testData = new CommercialAutoDataEngine("GWTestData_DataEngine.xlsx", "CommercialAuto", "TC283");
		Log.testCaseInfo("Verify whether the User able to Create a contingency with an action 'Change policy for remainder of term' for commercial auto policy.", driver);
		try {	

			CommercialAutoStepsImpl pc = CommercialAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());

			pc.copySubmission();

			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.CONTINGENCY)
					.contingencyTitle(testData.getContingencyTitle())
					.contingencyDescription(testData.getContingencyDescription())
					.contingencyAction(testData.getContingencyAction())
					.contingencyDueDate(DataFakers.dateOneMonthAhead()).build());
			pc.reviewPolicy(PolicyReview.builder(CommercialAutoConstants.PolicyReviewType.NONE).build());
			pc.issuepolicy(CommercialAutoConstants.Transactions.SUBMISSION);
			pc.viewPolicy();

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
	@Test(description="Verify whether the user able to Create a contingency with an action 'Cancel retroactively' for commercial auto policy.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC293(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialAutoDataEngine testData = new CommercialAutoDataEngine("GWTestData_DataEngine.xlsx", "CommercialAuto", "TC293");
		Log.testCaseInfo("Verify whether the user able to Create a contingency with an action 'Cancel retroactively' for commercial auto policy.", driver);
		try {	

			CommercialAutoStepsImpl pc = CommercialAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());

			pc.copySubmission();
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.CONTINGENCY)
					.contingencyTitle(testData.getContingencyTitle())
					.contingencyDescription(testData.getContingencyDescription())
					.contingencyAction(testData.getContingencyAction())
					.contingencyDueDate(DataFakers.dateOneMonthAhead()).build());
			pc.reviewPolicy(PolicyReview.builder(CommercialAutoConstants.PolicyReviewType.NONE).build());
			pc.issuepolicy(CommercialAutoConstants.Transactions.SUBMISSION);
			pc.viewPolicy();

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
	@Test(description="Verify whether the User able to Create a contingency with an action ' Cancel remainder of term' for commercial auto policy.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC294(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialAutoDataEngine testData = new CommercialAutoDataEngine("GWTestData_DataEngine.xlsx", "CommercialAuto", "TC294");
		Log.testCaseInfo("Verify whether the User able to Create a contingency with an action ' Cancel remainder of term' for commercial auto policy.", driver);
		try {	

			CommercialAutoStepsImpl pc = CommercialAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());

			pc.copySubmission();
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.CONTINGENCY)
					.contingencyTitle(testData.getContingencyTitle())
					.contingencyDescription(testData.getContingencyDescription())
					.contingencyAction(testData.getContingencyAction())
					.contingencyDueDate(DataFakers.dateOneMonthAhead()).build());
			pc.reviewPolicy(PolicyReview.builder(CommercialAutoConstants.PolicyReviewType.NONE).build());
			pc.issuepolicy(CommercialAutoConstants.Transactions.SUBMISSION);
			pc.viewPolicy();

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
	@Test(description="Verify whether the User able to Create a contingency with an action 'Cancel Rewrite' for commercial auto policy.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC295(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialAutoDataEngine testData = new CommercialAutoDataEngine("GWTestData_DataEngine.xlsx", "CommercialAuto", "TC294");
		Log.testCaseInfo("Verify whether the User able to Create a contingency with an action 'Cancel Rewrite' for commercial auto policy.", driver);
		try {	

			CommercialAutoStepsImpl pc = CommercialAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());

			pc.copySubmission();
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.CONTINGENCY)
					.contingencyTitle(testData.getContingencyTitle())
					.contingencyDescription(testData.getContingencyDescription())
					.contingencyAction(testData.getContingencyAction())
					.contingencyDueDate(DataFakers.dateOneMonthAhead()).build());
			pc.reviewPolicy(PolicyReview.builder(CommercialAutoConstants.PolicyReviewType.NONE).build());
			pc.issuepolicy(CommercialAutoConstants.Transactions.SUBMISSION);
			pc.viewPolicy();

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
	@Test(description="Verify whether the User able to Reopen an underwriter issue which was blocking quote release for commercial auto policy.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC284(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialAutoDataEngine testData = new CommercialAutoDataEngine("GWTestData_DataEngine.xlsx", "CommercialAuto", "TC284");
		Log.testCaseInfo("Verify whether the User able to Reopen an underwriter issue which was blocking quote release for commercial auto policy.", driver);
		try {	
			CommercialAutoStepsImpl pc = CommercialAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());

			pc.copySubmission();

			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.UW_ISSUE)
					.uWIssueType(testData.getUwIssueType())
					.longDescription(testData.getLongDescription()).build());	
			pc.reviewPolicy(PolicyReview.builder(CommercialAutoConstants.PolicyReviewType.NONE)
					.build());
			pc.approveUWissue(UWIssueType.builder()
					.issueType(testData.getUwIssueType())
					.build());
			pc.reviewPolicy(PolicyReview.builder(CommercialAutoConstants.PolicyReviewType.REOPEN)
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
	 * @author vignesh.ravi
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Verify whether the User able to process Rewrite Remainder term transaction for commercial auto policy.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC215(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialAutoDataEngine testData = new CommercialAutoDataEngine("GWTestData_DataEngine.xlsx", "CommercialAuto", "TC215");
		Log.testCaseInfo("Verify whether the User able to process Rewrite Remainder term transaction for commercial auto policy.", driver);
		try {	


			CommercialAutoStepsImpl pc = CommercialAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());

			pc.copySubmissions();

			pc.viewPolicy();


			pc.cancelPolicy(CancellationSource.builder().source(testData.getCancellationSource())
					.reason(testData.getCancellationReason()).build());

			pc.viewPolicy();

			pc.policyRewriteRemainderTerm();

			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());
			pc.updatePolicyInfo(PolicyInfo.builder().build());
			pc.addCommercialAutoLineDetails(CommercialAutoLine.builder().build());
			pc.addLocations();
			pc.addVehicle(Vehicles.builder().build());

			pc.addStateInfo();

			pc.addNewDriver(Drivers.builder().build());

			pc.addCoveredVehicles();
			pc.addModifiersDetails();
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			pc.reviewPolicy(PolicyReview.builder(CommercialAutoConstants.PolicyReviewType.NONE).build());
			pc.viewQuote();
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(CommercialAutoConstants.Transactions.REWRITE_REMAINDER_TERM);
			pc.viewPolicy();
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
	@Test(description="Verify whether the User able to process Renew transaction for commercial auto policy.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC216(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialAutoDataEngine testData = new CommercialAutoDataEngine("GWTestData_DataEngine.xlsx", "CommercialAuto", "TC216");
		Log.testCaseInfo("Verify whether the User able to process Renew transaction for commercial auto policy.", driver);
		try {	

			CommercialAutoStepsImpl pc = CommercialAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());

			pc.copySubmissions();

			pc.viewPolicy();

			pc.policyRenew();

			pc.selectOfferings(Offerings.builder().build());
			pc.updatePolicyInfo(PolicyInfo.builder().build());
			pc.addCommercialAutoLineDetails(CommercialAutoLine.builder().build());
			pc.addLocations();
			pc.addVehicle(Vehicles.builder().build());

			pc.addStateInfo();

			pc.addNewDriver(Drivers.builder().build());

			pc.addCoveredVehicles();
			pc.addModifiersDetails();
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			pc.reviewPolicy(PolicyReview.builder(CommercialAutoConstants.PolicyReviewType.RENEW).build());
			pc.viewQuote();
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(CommercialAutoConstants.Transactions.RENEW_POLICY);
			pc.policyRenewal(RenewPolicy.builder().renewalcode(testData.getRenewalCode()).build());
			pc.viewPolicy();
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
	@Test(description="Verify whether the User able to process Commercial auto policy with one additional insured person.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC217(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialAutoDataEngine testData = new CommercialAutoDataEngine("GWTestData_DataEngine.xlsx", "CommercialAuto", "TC217");
		Log.testCaseInfo("Verify whether the User able to process Commercial auto policy with one additional insured person.");
		try {	
			CommercialAutoStepsImpl pc = CommercialAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchAccount(EnterAccountInformation.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.build());

			pc.createAccount(CreateNewAccountFromPerson.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.addressLine1(testData.getAddressLine1())
					.state(testData.getState())  
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType())
					.organization(testData.getProducerOrganization())
					.build());

			pc.selectProduct(ProductNames.COMMERCIAL_AUTO);

			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());

			pc.selectQualifications(Qualification.builder().build());

			pc.updatePolicyInfo(PolicyInfo.builder()
					.policyEffectiveDate(testData.getCurrentDate())
					.policyTerm(testData.getPolicyTerm())
					.organizationType(testData.getOrganizationType())
					.build());

			pc.addCommercialAutoLineDetails(CommercialAutoLine.builder()
					.product(testData.getProduct())
					.fleet(testData.getFleet())
					.addAdditionalInsured(true)
					.createInsured(CreateNewAccountFromPerson.builder()
							.addAdditionalInsured(true)
							.firstName(testData.getFirstName())
							.lastName(testData.getLastName())
							.addressLine1(testData.getAddressLine1())
							.city(testData.getCity())
							.state(testData.getState())
							.zipCode(testData.getZipcode())
							.addressType(testData.getAddressType())
							.insuredType(testData.getInsuredType())
							.build())
					.build());

			pc.addLocations();

			pc.addVehicle(Vehicles.builder()
					.vehicleType(testData.getVehicleType())
					.cost(testData.getCost())
					.VIN(testData.getVin())
					.build());

			pc.addStateInfo();

			pc.addNewDriver(Drivers.builder()
					.yearFirstLicensed(testData.getYearFirstLicensed())
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.dateOfBirth(testData.getDateOfBirth())
					.addressLineOne(testData.getAddressLine1())
					.city(testData.getCity())
					.state(testData.getState())  
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType())
					.licenseNumber(testData.getLicenseNumber())
					.licenseState(testData.getLicenseState())
					.build());

			pc.addCoveredVehicles();
			pc.addModifiersDetails();
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			pc.reviewPolicy(PolicyReview.builder(CommercialAutoConstants.PolicyReviewType.SUBMISSION).build());
			pc.viewQuote();
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(CommercialAutoConstants.Transactions.SUBMISSION);
			pc.viewPolicy();

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
	@Test(description="Verify whether the User able to process Commercial auto policy with 10 or more vehicles.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC218(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialAutoDataEngine testData = new CommercialAutoDataEngine("GWTestData_DataEngine.xlsx", "CommercialAuto", "TC218");
		Log.testCaseInfo("Verify whether the User able to process Commercial auto policy with 10 or more vehicles.");
		try {	

			CommercialAutoStepsImpl pc = CommercialAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchAccount(EnterAccountInformation.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.build());

			pc.createAccount(CreateNewAccountFromPerson.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.addressLine1(testData.getAddressLine1())
					.state(testData.getState())  
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType())
					.organization(testData.getProducerOrganization())
					.build());

			pc.selectProduct(ProductNames.COMMERCIAL_AUTO);

			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());

			pc.selectQualifications(Qualification.builder().build());

			pc.updatePolicyInfo(PolicyInfo.builder()
					.policyEffectiveDate(testData.getCurrentDate())
					.policyTerm(testData.getPolicyTerm())
					.organizationType(testData.getOrganizationType())
					.build());

			pc.addCommercialAutoLineDetails(CommercialAutoLine.builder()
					.product(testData.getProduct())
					.fleet(testData.getFleet())
					.build());

			pc.addLocations();

			for(int i=0;i<10;i++) { 

				pc.addVehicle(Vehicles.builder()
						.vehicleType(testData.getVehicleType())
						.cost(testData.getCost())
						.VIN(DataFakers.VIN())
						.build());
			}

			pc.addStateInfo();

			pc.addNewDriver(Drivers.builder()
					.yearFirstLicensed(testData.getYearFirstLicensed())
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.dateOfBirth(testData.getDateOfBirth())
					.addressLineOne(testData.getAddressLine1())
					.city(testData.getCity())
					.state(testData.getState())  
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType())
					.licenseNumber(testData.getLicenseNumber())
					.licenseState(testData.getLicenseState())
					.build());

			pc.addCoveredVehicles();
			pc.addModifiersDetails();
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			pc.reviewPolicy(PolicyReview.builder(CommercialAutoConstants.PolicyReviewType.SUBMISSION).build());
			pc.viewQuote();
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(CommercialAutoConstants.Transactions.SUBMISSION);
			pc.viewPolicy();

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
	@Test(description="Verify whether the User able to process Out of Sequence (OOS) for commercial Auto", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC219(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialAutoDataEngine testData = new CommercialAutoDataEngine("GWTestData_DataEngine.xlsx", "CommercialAuto", "TC219");
		Log.testCaseInfo("Verify whether the User able to process Out of Sequence (OOS) for commercial Auto");
		try {	

			CommercialAutoStepsImpl pc = CommercialAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());

			pc.copySubmissions();

			pc.viewPolicy();

			pc.policyChange(PolicyChange.builder().date(testData.getEffectiveDateOneMonthAhead()).build());

			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());
			pc.updatePolicyInfo(PolicyInfo.builder()
					.build());
			pc.addCommercialAutoLineDetails(CommercialAutoLine.builder()
					.addCoverage(Coverages.builder()
							.state(testData.getState())
							.costOfHire(testData.getCost())
							.build()).build());
			pc.addLocations();
			pc.addVehicle(Vehicles.builder()
					.build());
			pc.addStateInfo();
			pc.addNewDriver(Drivers.builder().build());
			pc.addCoveredVehicles();
			pc.addModifiersDetails();
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			pc.reviewPolicy(PolicyReview.builder(CommercialAutoConstants.PolicyReviewType.NONE).build());

			pc.viewQuote();
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(CommercialAutoConstants.Transactions.POLICY_CHANGE);
			pc.viewPolicy();

			pc.policyChange(PolicyChange.builder().date(testData.getCurrentDate()).build());
			pc.verifyOutOfSequenceMessage(PolicyChange.builder()
					.date(testData.getEffectiveDateOneMonthAhead()).build());
			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());
			pc.verifyOutOfSequenceMessage(PolicyChange.builder()
					.date(testData.getEffectiveDateOneMonthAhead()).build());
			pc.updatePolicyInfo(PolicyInfo.builder().build());
			pc.verifyOutOfSequenceMessage(PolicyChange.builder()
					.date(testData.getEffectiveDateOneMonthAhead()).build());
			pc.addCommercialAutoLineDetails(CommercialAutoLine.builder().build());
			pc.verifyOutOfSequenceMessage(PolicyChange.builder()
					.date(testData.getEffectiveDateOneMonthAhead()).build());
			pc.addLocations();
			pc.verifyOutOfSequenceMessage(PolicyChange.builder()
					.date(testData.getEffectiveDateOneMonthAhead()).build());
			pc.addVehicle(Vehicles.builder().build());
			pc.verifyOutOfSequenceMessage(PolicyChange.builder()
					.date(testData.getEffectiveDateOneMonthAhead()).build());
			pc.addStateInfo();
			pc.verifyOutOfSequenceMessage(PolicyChange.builder()
					.date(testData.getEffectiveDateOneMonthAhead()).build());
			pc.addNewDriver(Drivers.builder().build());
			pc.verifyOutOfSequenceMessage(PolicyChange.builder()
					.date(testData.getEffectiveDateOneMonthAhead()).build());
			pc.addCoveredVehicles();
			pc.verifyOutOfSequenceMessage(PolicyChange.builder()
					.date(testData.getEffectiveDateOneMonthAhead()).build());
			pc.addModifiersDetails();
			pc.verifyOutOfSequenceMessage(PolicyChange.builder()
					.date(testData.getEffectiveDateOneMonthAhead()).build());
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			pc.verifyOutOfSequenceMessage(PolicyChange.builder()
					.date(testData.getEffectiveDateOneMonthAhead()).build());
			pc.reviewPolicy(PolicyReview.builder(CommercialAutoConstants.PolicyReviewType.NONE).build());
			pc.verifyOutOfSequenceMessage(PolicyChange.builder()
					.date(testData.getEffectiveDateOneMonthAhead()).build());
			pc.viewQuote();
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(CommercialAutoConstants.Transactions.POLICY_CHANGE);
			pc.viewPolicy();
			
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
	@Test(description="Verify whether the User able to process Waive a contingency manually for commercial auto policy.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC288(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialAutoDataEngine testData = new CommercialAutoDataEngine("GWTestData_DataEngine.xlsx", "CommercialAuto", "TC288");
		Log.testCaseInfo("Verify whether the User able to process Waive a contingency manually for commercial auto policy.", driver);
		try {	

			CommercialAutoStepsImpl pc = CommercialAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());

			pc.copySubmission();

			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.CONTINGENCY)
					.contingencyTitle(testData.getContingencyTitle())
					.contingencyDescription(testData.getContingencyDescription())
					.contingencyAction(testData.getContingencyAction())
					.contingencyDueDate(testData.getEffectiveDateOneMonthAhead()).build());
			pc.reviewPolicy(PolicyReview.builder(CommercialAutoConstants.PolicyReviewType.NONE).build());
			pc.viewQuote();
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(CommercialAutoConstants.Transactions.SUBMISSION);
			pc.viewPolicy();
			pc.completedPolicyTransactions();
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.WAIVE_CONTINGENCY).build());

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
	@Test(description="Verify whether the User able to Resolve the contingency for commercial auto policy by uploading required documents.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC289(String browser) throws Exception {
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialAutoDataEngine testData = new CommercialAutoDataEngine("GWTestData_DataEngine.xlsx", "CommercialAuto", "TC289");
		Log.testCaseInfo("Verify whether the User able to Resolve the contingency for commercial auto policy by uploading required documents.", driver);
		try {	

			CommercialAutoStepsImpl pc = CommercialAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());

			pc.copySubmission();

			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.CONTINGENCY)
					.contingencyTitle(testData.getContingencyTitle())
					.contingencyDescription(testData.getContingencyDescription())
					.contingencyAction(testData.getContingencyAction())
					.contingencyDueDate(testData.getEffectiveDateOneMonthAhead()).build());
			pc.reviewPolicy(PolicyReview.builder(CommercialAutoConstants.PolicyReviewType.NONE).build());
			pc.viewQuote();
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(CommercialAutoConstants.Transactions.SUBMISSION);
			pc.viewPolicy();
			pc.completedPolicyTransactions();
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.ATTACH_DOCUMENT_CONTINGENCY)
					.documentName(testData.getDocumentName())
					.contingencyDocumentStatus(testData.getContingencyDocumentStatus())
					.contingencyDocumentType(testData.getContingencyDocumentType()).build());
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
	@Test(description="Verify whether the User able to Create a contingency with an action 'Change policy retroactively' for commercial auto policy.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC291(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialAutoDataEngine testData = new CommercialAutoDataEngine("GWTestData_DataEngine.xlsx", "CommercialAuto", "TC291");
		Log.testCaseInfo("Verify whether the User able to Create a contingency with an action \"Change policy retroactively\" for commercial auto policy.", driver);
		try {	

			CommercialAutoStepsImpl pc = CommercialAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());

			pc.copySubmission();

			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.CONTINGENCY)
					.contingencyTitle(testData.getContingencyTitle())
					.contingencyDescription(testData.getContingencyDescription())
					.contingencyAction(testData.getContingencyAction())
					.contingencyDueDate(testData.getEffectiveDateOneMonthAhead()).build());

			pc.reviewPolicy(PolicyReview.builder(CommercialAutoConstants.PolicyReviewType.NONE).build());
			pc.issuepolicy(CommercialAutoConstants.Transactions.SUBMISSION);
			pc.viewPolicy();

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
	@Test(description="Verify whether the User able to Create an underwriter issue manually for commercial auto policy to block the quote.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC274(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialAutoDataEngine testData = new CommercialAutoDataEngine("GWTestData_DataEngine.xlsx", "CommercialAuto", "TC274");
		Log.testCaseInfo("Verify whether the User able to Create an underwriter issue manually for commercial auto policy to block the quote.", driver);
		try {	

			CommercialAutoStepsImpl pc = CommercialAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchAccount(EnterAccountInformation.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.build());

			pc.createAccount(CreateNewAccountFromPerson.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.addressLine1(testData.getAddressLine1())
					.state(testData.getState())  
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType())
					.organization(testData.getProducerOrganization())
					.build());

			pc.selectProduct(ProductNames.COMMERCIAL_AUTO);

			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());

			pc.selectQualifications(Qualification.builder().build());

			pc.updatePolicyInfo(PolicyInfo.builder()
					.policyEffectiveDate(testData.getCurrentDate())
					.policyTerm(testData.getPolicyTerm())
					.organizationType(testData.getOrganizationType())
					.build());

			pc.addCommercialAutoLineDetails(CommercialAutoLine.builder()
					.product(testData.getProduct())
					.fleet(testData.getFleet())
					.build());

			pc.addLocations();

			pc.addVehicle(Vehicles.builder()
					.vehicleType(testData.getVehicleType())
					.cost(testData.getCost())
					.VIN(testData.getVin())
					.build());

			pc.addStateInfo();
			pc.addNewDriver(Drivers.builder()
					.yearFirstLicensed(testData.getYearFirstLicensed())
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.dateOfBirth(testData.getDateOfBirth())
					.addressLineOne(testData.getAddressLine1())
					.city(testData.getCity())
					.state(testData.getState())  
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType())
					.licenseNumber(testData.getLicenseNumber())
					.licenseState(testData.getLicenseState())
					.build());

			pc.addCoveredVehicles();
			pc.addModifiersDetails();

			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.UW_ISSUE)
					.uWIssueType(testData.getUwIssueType())
					.longDescription(testData.getLongDescription()).build());		
			pc.reviewPolicy(PolicyReview.builder(CommercialAutoConstants.PolicyReviewType.SUBMISSION).build());
			String submissionNo =pc.getSubmissionNo();


			pc.logOutTheApplication();
			pc.loginIntoTheApplication("sulveling", "gw");
			pc.searchSubmission(SearchFor.builder()
					.searchType(testData.getSearchType())
					.subissionNumber(submissionNo)
					.build());
			pc.issuepolicy(CommercialAutoConstants.Transactions.SUBMISSION);
			pc.approveUWissue(UWIssueType.builder()
					.issueType(testData.getUwIssueType())
					.build());
			pc.logOutTheApplication();

			pc.loginIntoTheApplication("sulveling", "gw");
			pc.searchSubmission(SearchFor.builder()
					.searchType(testData.getSearchType())
					.subissionNumber(submissionNo)
					.build());
			pc.viewQuote();
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(CommercialAutoConstants.Transactions.SUBMISSION);
			pc.viewPolicy();

			Log.testCaseResult(driver);

		} catch (Exception e) {
			Log.exception(e, DriverManager.getDriver());
		} finally {
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}
}


