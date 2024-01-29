package com.aspire.guidewire.pc.testscripts;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aspire.guidewire.pc.teststeps.personalauto.DataFakers;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoConstants;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.Offerings;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoConstants.PolicyReviewType;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoConstants.RiskAnalysisType;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoConstants.State;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoConstants.Transactions;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoConstants.UserType;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.AdditionalInterestFromOtherContacts;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.Vehicles;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.AdditionalInterestFromPerson;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.CancellationSource;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.CloseOptions;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.CreateNewAccountFromPerson;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.Drivers;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.EnterAccountInformation;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.PACoverage;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.Payments;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.PolicyChange;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.PolicyDetails;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.PolicyInfo;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.PolicyReview;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.PreRenewalDirection;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.Qualification;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.Rating;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.ReinstatementReason;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.RenewPolicy;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.RiskAnalysis;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.SpinOff;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.SplitOff;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.UnderWriterIssue;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoFeatures.UploadDocument;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoDataEngine;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoSteps;
import com.aspire.guidewire.pc.teststeps.personalauto.PersonalAutoStepsImpl;
import com.aspire.guidewire.utils.DataProviderUtils;
import com.aspire.guidewire.utils.EnvironmentPropertiesReader;
import com.aspire.guidewire.utils.Log;
import com.aspire.guidewire.webdriverManager.DriverManager;

public class PC_PersonalAutoSuite {

	boolean LambdatestStatus = false;

	String pCWebSite, browser, contentGraphqlURL, browseAllContentGraphqlURL, sheetName;

	private static EnvironmentPropertiesReader configProperty = EnvironmentPropertiesReader.getInstance();

	private static EnvironmentPropertiesReader errorMessagesProperty = EnvironmentPropertiesReader
			.getInstance("guidewireMessages/personalAutoMessages");

	protected static ThreadLocal<WebDriver> threadLocalDriver = new ThreadLocal<>();

	@BeforeTest(alwaysRun = true)
	public void init(ITestContext context) {

		pCWebSite = (System.getProperty("pCWebSite") != null ? System.getProperty("pCWebSite"): context.getCurrentXmlTest().getParameter("pCWebSite"));
		DriverManager.setPCWebsite(pCWebSite);

		if (configProperty.hasProperty("runLambdaTestFromLocal")&& configProperty.getProperty("runLambdaTestFromLocal").trim().equalsIgnoreCase("true")) {
			LambdatestStatus = true;
		}
	}

	/**
	 * @author anitha.raphel
	 * @param browser
	 * @throws Exception
	 */
	@Test(description = "Verify whether user able to create a personal auto policy by adding drivers, vehicles and coverages", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC09(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("Verify whether user able to create a personal auto policy by adding drivers, vehicles and coverages", driver);
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("GWTestData_DataEngine.xlsx", "PersonalAuto", "TC09");

		try {

			PersonalAutoStepsImpl pc = PersonalAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchAccount(EnterAccountInformation.builder().firstName(testData.getFirstName())
					.lastName(testData.getLastName()).build());

			pc.createAccount(CreateNewAccountFromPerson.builder().firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.addressLine1(testData.getAddressLine1())
					.state(testData.getState())
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType()).organization(testData.getProducerOrganization())
					.build());

			pc.selectProduct(PersonalAutoConstants.ProductNames.PERSONAL_AUTO); 

			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());

			pc.selectQualifications(Qualification.builder().build());

			pc.updatePolicyInfo(PolicyInfo.builder()
					.policyEffectiveDate(testData.getCurrentDate())
					.policyTerm(testData.getPolicyTerm()).build()); 

			pc.addNewDriver(Drivers.builder().usertype(UserType.NEW).yearFirstLicensed(testData.getCurrentYear())
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.dateOfBirth(testData.getDateOfBirth())
					.addressLineOne(testData.getAddressLine1())
					.state(testData.getState())
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType())
					.licenseNumber(testData.getLicenseNumber())
					.licenseState(testData.getState()).numberOfAccidentsPolicyLevel(testData.getRolesAccidentSummary())
					.numberOfAccidentsAccountLevel(testData.getRolesAccidentSummary())
					.numberOfViolationsPolicyLevel(testData.getRolesAccidentSummary())
					.numberOfViolationsAccountLevel(testData.getRolesAccidentSummary()).build());

			pc.addVehicle(Vehicles.builder(PersonalAutoConstants.UserType.NEW)
					.vehicleType(testData.getVehicleType())
					.state(testData.getState())
					.cost(testData.getCostOfVehicle())
					.VIN(testData.getVIN()).build());

			pc.addPACoverage(PACoverage.builder().build());
			
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			
			pc.reviewPolicy(PolicyReview.builder(PersonalAutoConstants.PolicyReviewType.NONE).build());
			
			pc.viewQuote();
			
			pc.viewForms();
			
			pc.selectPayments(Payments.builder().build());
			
			pc.issuepolicy(PersonalAutoConstants.Transactions.SUBMISSION);
			
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
	 * @author siva.panjanathan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description = "Verify User should able to Quote and Issue the  Policy Change Transaction - Personal Auto", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC14(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("Verify User should able to Quote and Issue the  Policy Change Transaction - Personal Auto", driver);
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("GWTestData_DataEngine.xlsx", "PersonalAuto", "TC14");

		try {
			PersonalAutoStepsImpl pc = PersonalAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

            pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());
            			
			pc.policyChange(PolicyChange.builder().date(DataFakers.currentDate()).build());
			
			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());
			
			pc.updatePolicyInfo(PolicyInfo.builder().build());
			
			pc.addNewDriver(Drivers.builder().usertype(UserType.NONE).build());
			
			pc.addVehicle(Vehicles.builder(PersonalAutoConstants.UserType.EXISTING).cost(testData.getCostOfVehicle()).build());
			
			pc.addPACoverage(PACoverage.builder().build());
			
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			
			pc.reviewPolicy(PolicyReview.builder(PersonalAutoConstants.PolicyReviewType.NONE).build());
			
			pc.viewQuote();
			
			pc.viewForms();
			
			pc.selectPayments(Payments.builder().build());
			
			pc.issuepolicy(PersonalAutoConstants.Transactions.POLICY_CHANGE);
			
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
	 * @author Manikandan.Manohar
	 * @param browser
	 * @throws Exception
	 */
	@Test(description = "Verify whether user able to Quote and Issue the Rewrite remainder of term  Transaction for the Policy after pro rata cancellation for Personal Auto Policy", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC19(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("Verify whether user able to Quote and Issue the Rewrite remainder of term  Transaction for the Policy after pro rata cancellation for Personal Auto Policy", driver);
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("GWTestData_DataEngine.xlsx", "PersonalAuto", "TC19");

		try {
			PersonalAutoStepsImpl pc = PersonalAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

            pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());
            
            pc.copySubmissions();
			
            pc.viewPolicy();
			
			pc.cancelPolicy(CancellationSource.builder()
					.source(testData.getSource())
					.reason(testData.getCancellationReason()).build());
			
			pc.viewPolicy();

			pc.policyRewriteRemainderTerm();

			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());
			pc.updatePolicyInfo(PolicyInfo.builder().build());
			pc.addNewDriver(Drivers.builder().usertype(UserType.NONE).build());
			pc.addVehicle(Vehicles.builder(PersonalAutoConstants.UserType.NONE).build());
			pc.addPACoverage(PACoverage.builder().build());
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			pc.reviewPolicy(PolicyReview.builder(PersonalAutoConstants.PolicyReviewType.NONE).build());
			pc.viewQuote();
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(PersonalAutoConstants.Transactions.REWRITE_REMAINDER_TERM);
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
	@Test(description = "To verify the reinstatement of policy is working correctly from new policy to cancel and reinstate", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC17(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the reinstatement of policy is working correctly from new policy to cancel and reinstate", driver);
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("GWTestData_DataEngine.xlsx", "PersonalAuto", "TC17");

		try {
			PersonalAutoStepsImpl pc = PersonalAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

            pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());
            
            pc.copySubmissions();
            
			pc.viewPolicy();
			
			pc.cancelPolicy(CancellationSource.builder()
					.source(testData.getSource())
					.reason(testData.getCancellationReason()).build());
			
			pc.viewPolicy();
			
			pc.reinstatePolicy(ReinstatementReason.builder().reason(testData.getReinstateReason()).build());
			
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

	@Test(description = "Verify whether User can able to Create a Personal Auto Policy and able to Quote and Issue the Rewrite full term Transaction for the Policy after flat cancellation", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC18(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("GWTestData_DataEngine.xlsx", "PersonalAuto", "TC18");
		Log.testCaseInfo("Verify whether User can able to Create a Personal Auto Policy and able to Quote and Issue the Rewrite full term Transaction for the Policy after flat cancellation", driver);
		
		try {

			PersonalAutoStepsImpl pc = PersonalAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

            pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());
            
            pc.copySubmissions();
            
			pc.viewPolicy();
            			
			pc.cancelPolicy(CancellationSource.builder()
					.source(testData.getSource())
					.reason(testData.getCancellationReason()).build());
			
			pc.viewPolicy();
			
			pc.policyRewriteFullTerm();
			
			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());
			
			pc.updatePolicyInfo(PolicyInfo.builder().policyTerm(testData.getPolicyTerm2()).build()); 
			
			pc.addNewDriver(Drivers.builder().usertype(UserType.NONE).build());
			
			pc.addVehicle(Vehicles.builder(PersonalAutoConstants.UserType.NONE).build());
			
			pc.addPACoverage(PACoverage.builder().build());
			
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			
			pc.reviewPolicy(PolicyReview.builder(PersonalAutoConstants.PolicyReviewType.NONE).build());
			
			pc.viewQuote();
			
			pc.viewForms();
			
			pc.selectPayments(Payments.builder().build());
			
			pc.issuepolicy(PersonalAutoConstants.Transactions.REWRITE_FULL_TERM);
						
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
	@Test(description = "Verify whether user able to create a Personal Auto Policy and attempt to set Pre-Renewal direction for the Policy", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC23(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("Verify whether user able to create a Personal Auto Policy and attempt to set Pre-Renewal direction for the Policy", driver);
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("GWTestData_DataEngine.xlsx", "PersonalAuto", "TC23");
		
		try {
			PersonalAutoStepsImpl pc = PersonalAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

            pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());

            pc.policyPreRenewalDirection(
					PreRenewalDirection.builder()
					.direction(testData.getDirection())
					.security(testData.getSecurity())
					.reason(testData.getReason())
					.text(testData.getText()).build());
            
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
	@Test(description = "Verify whether user able to create a new submission using Spin-off the Policy - Personal Auto Policy", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC49(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("Verify whether user able to create a new submission using Spin-off the Policy - Personal Auto Policy",driver);
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("GWTestData_DataEngine.xlsx", "PersonalAuto", "TC49");
		
		try {
			PersonalAutoStepsImpl pc = PersonalAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchAccount(EnterAccountInformation.builder().firstName(testData.getFirstName())
					.lastName(testData.getLastName()).build());

			String accountNumber = pc.createAccount(CreateNewAccountFromPerson.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.addressLine1(testData.getAddressLine1())
					.state(testData.getState())
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType()).organization(testData.getProducerOrganization())
					.build());

			pc.selectProduct(PersonalAutoConstants.ProductNames.PERSONAL_AUTO);

			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());

			pc.selectQualifications(Qualification.builder().build());

			pc.updatePolicyInfo(PolicyInfo.builder()
					.policyEffectiveDate(testData.getCurrentDate())
					.policyTerm(testData.getPolicyTerm()).build()); 

			pc.addNewDriver(Drivers.builder().usertype(UserType.NEW)
					.yearFirstLicensed(testData.getCurrentYear())
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.dateOfBirth(testData.getDateOfBirth())
					.addressLineOne(testData.getAddressLine1())
					.state(testData.getState())
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType())
					.licenseNumber(testData.getLicenseNumber())
					.licenseState(testData.getState()).numberOfAccidentsPolicyLevel(testData.getRolesAccidentSummary())
					.numberOfAccidentsAccountLevel(testData.getRolesAccidentSummary())
					.numberOfViolationsPolicyLevel(testData.getRolesAccidentSummary())
					.numberOfViolationsAccountLevel(testData.getRolesAccidentSummary()).build());


			pc.addVehicle(Vehicles.builder(PersonalAutoConstants.UserType.NEW)
					.vehicleType(testData.getVehicleType())
					.state(testData.getState())
					.cost(testData.getCostOfVehicle())
					.VIN(testData.getVIN()).build());

			pc.addPACoverage(PACoverage.builder().build());
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			pc.reviewPolicy(PolicyReview.builder(PersonalAutoConstants.PolicyReviewType.NONE).build());
			pc.viewQuote();
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(PersonalAutoConstants.Transactions.SUBMISSION);
			pc.viewPolicy();
			pc.spinOffPolicy(SpinOff.builder().accountNumber(accountNumber).build());
			Log.testCaseResult(driver);

		} catch (Exception e) {
			Log.exception(e, DriverManager.getDriver());
		} finally {
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}

	/**
	 * @author siva.panjanathan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description = "Verify User able to Create a Personal Auto Policy and able to Quote and Issue the Renewal Transaction for the Policy", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC21(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("GWTestData_DataEngine.xlsx", "PersonalAuto", "TC21");
		Log.testCaseInfo("Verify User able to Create a Personal Auto Policy and able to Quote and Issue the Renewal Transaction for the Policy",driver);
		
		try {
			PersonalAutoStepsImpl pc = PersonalAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

            pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());
            
            pc.copySubmissions();
            
			pc.viewPolicy();

			pc.policyRenew();
			pc.selectOfferings(Offerings.builder().build());
			pc.updatePolicyInfo(PolicyInfo.builder().build());
			pc.addNewDriver(Drivers.builder().usertype(UserType.NONE).build());
			pc.addVehicle(Vehicles.builder(PersonalAutoConstants.UserType.NONE).build());
			pc.addPACoverage(PACoverage.builder().build());
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			pc.reviewPolicy(PolicyReview.builder(PersonalAutoConstants.PolicyReviewType.RENEW).build());
			pc.viewQuote();
			pc.viewForms();
			pc.issuepolicy(PersonalAutoConstants.Transactions.RENEW_POLICY);
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
	 * @author siva.panjanathan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description = "Verify whether user able to create a two new submission using Split policy into two - Personal Auto Policy", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC50(String browser) throws Exception {
		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("GWTestData_DataEngine.xlsx", "PersonalAuto", "TC50");
		Log.testCaseInfo("Verify whether user able to create a two new submission using Split policy into two - Personal Auto Policy",driver);

		try {
			PersonalAutoStepsImpl pc = PersonalAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchAccount(EnterAccountInformation.builder().firstName(testData.getFirstName())
					.lastName(testData.getLastName()).build());


			String accountNumber1 = pc.createAccount(CreateNewAccountFromPerson.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.addressLine1(testData.getAddressLine1())
					.state(testData.getState())
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType()).organization(testData.getProducerOrganization())
					.build());

			pc.searchAccount(EnterAccountInformation.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName()).build());

			String accountNumber2 = pc.createAccount(CreateNewAccountFromPerson.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.addressLine1(testData.getAddressLine1())
					.state(testData.getState())
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType()).organization(testData.getProducerOrganization())
					.build());

			pc.selectProduct(PersonalAutoConstants.ProductNames.PERSONAL_AUTO);

			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());

			pc.selectQualifications(Qualification.builder().build());

			pc.updatePolicyInfo(PolicyInfo.builder().policyEffectiveDate(testData.getCurrentDate())
					.policyTerm(testData.getPolicyTerm()).build()); 

			pc.addNewDriver(Drivers.builder()
					.usertype(UserType.NEW)
					.yearFirstLicensed(testData.getCurrentYear())
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.dateOfBirth(testData.getDateOfBirth())
					.addressLineOne(testData.getAddressLine1())
					.state(testData.getState())
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType())
					.licenseNumber(testData.getLicenseNumber())
					.licenseState(testData.getState()).numberOfAccidentsPolicyLevel(testData.getRolesAccidentSummary())
					.numberOfAccidentsAccountLevel(testData.getRolesAccidentSummary())
					.numberOfViolationsPolicyLevel(testData.getRolesAccidentSummary())
					.numberOfViolationsAccountLevel(testData.getRolesAccidentSummary()).build());

			pc.addVehicle(Vehicles.builder(PersonalAutoConstants.UserType.NEW)
					.vehicleType(testData.getVehicleType())
					.state(testData.getState())
					.cost(testData.getCostOfVehicle())
					.VIN(testData.getVIN()).build());

			pc.addPACoverage(PACoverage.builder().build());
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			pc.reviewPolicy(PolicyReview.builder(PolicyReviewType.NONE).build());
			pc.viewQuote();
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(PersonalAutoConstants.Transactions.SUBMISSION);
			pc.viewPolicy();
			pc.splitOffPolicy(SplitOff.builder()
					.accountNumber1(accountNumber1)
					.accountNumber2(accountNumber2).build());
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
	@Test(description = "Verify whether the user is able to create a Personal Auto Policy and attempt to Quote and Issue the Personal Auto Policy - Out of Sequence transaction", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC22(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("GWTestData_DataEngine.xlsx", "PersonalAuto", "TC22");
		Log.testCaseInfo("Verify whether the user is able to create a Personal Auto Policy and attempt to Quote and Issue the Personal Auto Policy - Out of Sequence transaction", driver);

		try {
			PersonalAutoStepsImpl pc = PersonalAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

            pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());
            
			pc.copySubmissions();
			
			pc.viewPolicy();
			
			pc.policyChange(PolicyChange.builder().date(testData.getDateOneMonthAhead()).build()); 
			pc.selectOfferings(Offerings.builder().build());
			pc.updatePolicyInfo(PolicyInfo.builder().build());
			pc.addNewDriver(Drivers.builder().usertype(UserType.NONE).build());
			pc.addVehicle(Vehicles.builder(PersonalAutoConstants.UserType.EXISTING)
					.cost(DataFakers.costOfVehicle()).build());
			pc.addPACoverage(PACoverage.builder().build());
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			pc.reviewPolicy(PolicyReview.builder(PolicyReviewType.NONE).build());
			pc.viewQuote();
			pc.viewForms();
			pc.issuepolicy(Transactions.POLICY_CHANGE);
			pc.viewPolicy();
			pc.policyChange(PolicyChange.builder().date(testData.getCurrentDate()).build()); 
			pc.verifyOutOfSequenceMessage(PolicyChange.builder().date(testData.getDateOneMonthAhead()).build());
			pc.selectOfferings(Offerings.builder().build());
			pc.verifyOutOfSequenceMessage(PolicyChange.builder().date(testData.getDateOneMonthAhead()).build());
			pc.updatePolicyInfo(PolicyInfo.builder().build());
			pc.verifyOutOfSequenceMessage(PolicyChange.builder().date(testData.getDateOneMonthAhead()).build());
			pc.addNewDriver(Drivers.builder().usertype(UserType.NONE).build());
			pc.verifyOutOfSequenceMessage(PolicyChange.builder().date(testData.getDateOneMonthAhead()).build());
			pc.addVehicle(Vehicles.builder(PersonalAutoConstants.UserType.EXISTING)
					.cost(DataFakers.costOfVehicle()).build());
			pc.verifyOutOfSequenceMessage(PolicyChange.builder().date(testData.getDateOneMonthAhead()).build());
			pc.addPACoverage(PACoverage.builder().build());
			pc.verifyOutOfSequenceMessage(PolicyChange.builder().date(testData.getDateOneMonthAhead()).build());
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			pc.verifyOutOfSequenceMessage(PolicyChange.builder().date(testData.getDateOneMonthAhead()).build());
			pc.reviewPolicy(PolicyReview.builder(PolicyReviewType.OUT_OF_SEQUENCE).build());
			pc.verifyOutOfSequenceMessage(PolicyChange.builder().date(testData.getDateOneMonthAhead()).build());
			pc.viewQuote();
			pc.viewForms();
			pc.issuepolicy(Transactions.POLICY_CHANGE);
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
	@Test(description = "Verify that Whether the user can Create an auto policy and with-drawn the submission (for Personal auto policy)", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC13(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("GWTestData_DataEngine.xlsx", "PersonalAuto", "TC13");
		Log.testCaseInfo("Verify that Whether the user can Create an auto policy and with-drawn the submission (for Personal auto policy)",driver);
		
		try {

			PersonalAutoStepsImpl pc = PersonalAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchAccount(EnterAccountInformation.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName()).build());


			pc.createAccount(CreateNewAccountFromPerson.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.addressLine1(testData.getAddressLine1())
					.state(testData.getState())
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType()).organization(testData.getProducerOrganization())
					.build());

			pc.selectProduct(PersonalAutoConstants.ProductNames.PERSONAL_AUTO);

			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());

			pc.selectQualifications(Qualification.builder().build());

			pc.updatePolicyInfo(PolicyInfo.builder().policyEffectiveDate(testData.getCurrentDate())
					.policyTerm(testData.getPolicyTerm()).build()); 

			pc.addNewDriver(Drivers.builder()
					.usertype(UserType.NEW).yearFirstLicensed(testData.getCurrentYear())
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.dateOfBirth(testData.getDateOfBirth())
					.addressLineOne(testData.getAddressLine1())
					.state(testData.getState())
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType())
					.licenseNumber(testData.getLicenseNumber())
					.licenseState(testData.getState()).numberOfAccidentsPolicyLevel(testData.getRolesAccidentSummary())
					.numberOfAccidentsAccountLevel(testData.getRolesAccidentSummary())
					.numberOfViolationsPolicyLevel(testData.getRolesAccidentSummary())
					.numberOfViolationsAccountLevel(testData.getRolesAccidentSummary()).build());

			pc.addVehicle(Vehicles.builder(PersonalAutoConstants.UserType.NEW)
					.vehicleType(testData.getVehicleType())
					.state(testData.getState())
					.cost(testData.getCostOfVehicle())
					.VIN(testData.getVIN()).build());

			pc.addPACoverage(PACoverage.builder().build());
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			pc.reviewPolicy(PolicyReview.builder(PersonalAutoConstants.PolicyReviewType.NONE).build());
			pc.viewQuote();
			pc.viewForms();
			pc.policyCloseOptions(CloseOptions.builder(PersonalAutoConstants.CloseOptionType.WITHDRAW_TRANSACTION).build());
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
	@Test(description = "Verify whether the User can able to Create an auto policy and select Not-Taken option on submission for the policy ", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC11(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("Verify whether the User can able to Create an auto policy and select Not-Taken option on submission for the policy ",driver);
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("GWTestData_DataEngine.xlsx", "PersonalAuto", "TC11");

		try {
			PersonalAutoStepsImpl pc = PersonalAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchAccount(EnterAccountInformation.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName()).build());

			pc.createAccount(CreateNewAccountFromPerson.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.addressLine1(testData.getAddressLine1())
					.state(testData.getState())
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType()).organization(testData.getProducerOrganization())
					.build());

			pc.selectProduct(PersonalAutoConstants.ProductNames.PERSONAL_AUTO);

			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());

			pc.selectQualifications(Qualification.builder().build());

			pc.updatePolicyInfo(PolicyInfo.builder()
					.policyEffectiveDate(testData.getCurrentDate())
					.policyTerm(testData.getPolicyTerm()).build()); 

			pc.addNewDriver(Drivers.builder()
					.usertype(UserType.NEW)
					.yearFirstLicensed(testData.getCurrentYear())
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.dateOfBirth(testData.getDateOfBirth())
					.addressLineOne(testData.getAddressLine1())
					.state(testData.getState())
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType())
					.licenseNumber(testData.getLicenseNumber())
					.licenseState(testData.getState()).numberOfAccidentsPolicyLevel(testData.getRolesAccidentSummary())
					.numberOfAccidentsAccountLevel(testData.getRolesAccidentSummary())
					.numberOfViolationsPolicyLevel(testData.getRolesAccidentSummary())
					.numberOfViolationsAccountLevel(testData.getRolesAccidentSummary()).build());

			pc.addVehicle(Vehicles.builder(PersonalAutoConstants.UserType.NEW)
					.vehicleType(testData.getVehicleType())
					.state(testData.getState())
					.cost(testData.getCostOfVehicle())
					.VIN(testData.getVIN()).build());

			pc.addPACoverage(PACoverage.builder().build());
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			pc.reviewPolicy(PolicyReview.builder(PersonalAutoConstants.PolicyReviewType.NONE).build());
			pc.viewQuote();
			pc.viewForms();
			pc.policyCloseOptions(CloseOptions.builder(PersonalAutoConstants.CloseOptionType.NOT_TAKEN)
					.reasonNotTaken(testData.getReasonNotTaken()).build());
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
	@Test(description = "Verify user able to Create an auto policy and decline submission for the  policy", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC12(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("Verify whether user able to Quote and Issue the Rewrite remainder of term  Transaction for the Policy after pro rata cancellation for Personal Auto Policy");
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("GWTestData_DataEngine.xlsx", "PersonalAuto", "TC12");

		try {
			PersonalAutoStepsImpl pc = PersonalAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchAccount(EnterAccountInformation.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName()).build());

			pc.createAccount(CreateNewAccountFromPerson.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.addressLine1(testData.getAddressLine1())
					.state(testData.getState())
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType()).organization(testData.getProducerOrganization())
					.build());

			pc.selectProduct(PersonalAutoConstants.ProductNames.PERSONAL_AUTO);

			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());

			pc.selectQualifications(Qualification.builder().build());

			pc.updatePolicyInfo(PolicyInfo.builder()
					.policyEffectiveDate(testData.getCurrentDate())
					.policyTerm(testData.getPolicyTerm()).build()); 

			pc.addNewDriver(Drivers.builder().usertype(UserType.NEW)
					.yearFirstLicensed(testData.getCurrentYear())
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.dateOfBirth(testData.getDateOfBirth())
					.addressLineOne(testData.getAddressLine1())
					.state(testData.getState())
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType())
					.licenseNumber(testData.getLicenseNumber())
					.licenseState(testData.getState()).numberOfAccidentsPolicyLevel(testData.getRolesAccidentSummary())
					.numberOfAccidentsAccountLevel(testData.getRolesAccidentSummary())
					.numberOfViolationsPolicyLevel(testData.getRolesAccidentSummary())
					.numberOfViolationsAccountLevel(testData.getRolesAccidentSummary()).build());

			pc.addVehicle(Vehicles.builder(PersonalAutoConstants.UserType.NEW)
					.vehicleType(testData.getVehicleType())
					.state(testData.getState())
					.cost(testData.getCostOfVehicle())
					.VIN(testData.getVIN()).build());

			pc.addPACoverage(PACoverage.builder().build());
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			pc.reviewPolicy(PolicyReview.builder(PersonalAutoConstants.PolicyReviewType.NONE).build());
			pc.viewQuote();
			pc.viewForms();
			pc.policyCloseOptions(CloseOptions.builder(PersonalAutoConstants.CloseOptionType.DECLINE)
					.reasonDeclined(testData.getReasonDeclined()).build());
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
	@Test(description = "To verify  copy submission transaction is working correctly for personal auto policy", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC10(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("GWTestData_DataEngine.xlsx", "PersonalAuto", "TC10");
		Log.testCaseInfo("To verify  copy submission transaction is working correctly for personal auto policy");
		
		try {
			PersonalAutoStepsImpl pc = PersonalAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

            pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());
            
			pc.copySubmission();
			
			pc.selectOfferings(Offerings.builder().build());
			
			pc.selectQualifications(Qualification.builder().build());
			
			pc.updatePolicyInfo(PolicyInfo.builder().build());
			
			pc.addNewDriver(Drivers.builder().usertype(UserType.NONE).build());
			
			pc.addVehicle(Vehicles.builder(PersonalAutoConstants.UserType.NONE).build());
			
			pc.addPACoverage(PACoverage.builder().build());
			
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			
			pc.reviewPolicy(PolicyReview.builder(PersonalAutoConstants.PolicyReviewType.NONE).build());
			
			pc.viewQuote();
			
			pc.viewForms();
			
			pc.issuepolicy(Transactions.SUBMISSION);
			
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
	@Test(description = "To verify whether user able to Quote and Issue the Personal Auto Policy with add/remove of vehicles during policy change transaction", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC30(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("GWTestData_DataEngine.xlsx", "PersonalAuto", "TC30");
		Log.testCaseInfo("To verify whether user able to Quote and Issue the Personal Auto Policy with add/remove of vehicles during policy change transaction");
		
		try {
			PersonalAutoStepsImpl pc = PersonalAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchAccount(EnterAccountInformation.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName()).build());

			pc.createAccount(CreateNewAccountFromPerson.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.addressLine1(testData.getAddressLine1())
					.state(testData.getState())
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType()).organization(testData.getProducerOrganization())
					.build());

			pc.selectProduct(PersonalAutoConstants.ProductNames.PERSONAL_AUTO);

			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());

			pc.selectQualifications(Qualification.builder().build());

			pc.updatePolicyInfo(PolicyInfo.builder()
					.policyEffectiveDate(testData.getCurrentDate())
					.policyTerm(testData.getPolicyTerm()).build()); 

			pc.addNewDriver(Drivers.builder().usertype(UserType.NEW)
					.yearFirstLicensed(testData.getCurrentYear())
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.dateOfBirth(testData.getDateOfBirth())
					.addressLineOne(testData.getAddressLine1())
					.state(testData.getState())
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType())
					.licenseNumber(testData.getLicenseNumber())
					.licenseState(testData.getState()).numberOfAccidentsPolicyLevel(testData.getRolesAccidentSummary())
					.numberOfAccidentsAccountLevel(testData.getRolesAccidentSummary())
					.numberOfViolationsPolicyLevel(testData.getRolesAccidentSummary())
					.numberOfViolationsAccountLevel(testData.getRolesAccidentSummary()).build());

			pc.addVehicle(Vehicles.builder(PersonalAutoConstants.UserType.NEW)
					.vehicleType(testData.getVehicleType())
					.state(testData.getState())
					.cost(testData.getCostOfVehicle())
					.VIN(testData.getVIN()).build());

			pc.addVehicle(Vehicles.builder(PersonalAutoConstants.UserType.NEW)
					.vehicleType(testData.getVehicleType())
					.state(testData.getState())
					.cost(testData.getCostOfVehicle())
					.VIN(DataFakers.VIN()).build());

			pc.addPACoverage(PACoverage.builder().build());
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			pc.reviewPolicy(PolicyReview.builder(PersonalAutoConstants.PolicyReviewType.NONE).build());
			pc.viewQuote();
			pc.viewForms();
			pc.issuepolicy(Transactions.SUBMISSION);
			pc.viewPolicy();
			pc.policyChange(PolicyChange.builder().date(testData.getCurrentDate()).build());
			pc.selectOfferings(Offerings.builder().build());
			pc.updatePolicyInfo(PolicyInfo.builder().build());
			pc.addNewDriver(Drivers.builder().usertype(UserType.NONE).build());
			pc.addVehicle(Vehicles.builder(PersonalAutoConstants.UserType.REMOVE).build());
			pc.addPACoverage(PACoverage.builder().build());
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			pc.reviewPolicy(PolicyReview.builder(PolicyReviewType.NONE).build());
			pc.viewQuote();
			pc.viewForms();
			pc.issuepolicy(Transactions.POLICY_CHANGE);
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
	 * @author Manikandan.Manohar
	 * @param browser
	 * @throws Exception
	 */
	@Test(description = "Verify whether user able to Quote and Issue the Personal Auto Policy with multiple vehicles added", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC29(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("GWTestData_DataEngine.xlsx", "PersonalAuto", "TC29");
		Log.testCaseInfo("Verify whether user able to Quote and Issue the Personal Auto Policy with multiple vehicles added");

		try {
			PersonalAutoStepsImpl pc = PersonalAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchAccount(EnterAccountInformation.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName()).build());

			pc.createAccount(CreateNewAccountFromPerson.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.addressLine1(testData.getAddressLine1())
					.state(testData.getState())
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType()).organization(testData.getProducerOrganization())
					.build());

			pc.selectProduct(PersonalAutoConstants.ProductNames.PERSONAL_AUTO);

			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());

			pc.selectQualifications(Qualification.builder().build());

			pc.updatePolicyInfo(PolicyInfo.builder()
					.policyEffectiveDate(testData.getCurrentDate())
					.policyTerm(testData.getPolicyTerm()).build()); 

			pc.addNewDriver(Drivers.builder()
					.usertype(UserType.NEW)
					.yearFirstLicensed(testData.getCurrentYear())
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.dateOfBirth(testData.getDateOfBirth())
					.addressLineOne(testData.getAddressLine1())
					.state(testData.getState())
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType())
					.licenseNumber(testData.getLicenseNumber())
					.licenseState(testData.getState()).numberOfAccidentsPolicyLevel(testData.getRolesAccidentSummary())
					.numberOfAccidentsAccountLevel(testData.getRolesAccidentSummary())
					.numberOfViolationsPolicyLevel(testData.getRolesAccidentSummary())
					.numberOfViolationsAccountLevel(testData.getRolesAccidentSummary()).build());

			pc.addVehicle(Vehicles.builder(PersonalAutoConstants.UserType.NEW)
					.vehicleType(testData.getVehicleType())
					.state(testData.getState())
					.cost(testData.getCostOfVehicle())
					.VIN(testData.getVIN()).build());

			pc.addVehicle(Vehicles.builder(PersonalAutoConstants.UserType.NEW)
					.vehicleType(testData.getVehicleType())
					.state(testData.getState())
					.cost(testData.getCostOfVehicle())
					.VIN(DataFakers.VIN()).build());

			pc.addVehicle(Vehicles.builder(PersonalAutoConstants.UserType.NEW)
					.vehicleType(testData.getVehicleType())
					.state(testData.getState())
					.cost(testData.getCostOfVehicle())
					.VIN(DataFakers.VIN()).build());

			pc.addPACoverage(PACoverage.builder().build());
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			pc.reviewPolicy(PolicyReview.builder(PersonalAutoConstants.PolicyReviewType.NONE).build());
			pc.viewQuote();
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(PersonalAutoConstants.Transactions.SUBMISSION);
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
	 * @author Manikandan.Manohar
	 * @param browser
	 * @throws Exception
	 */
	@Test(description = "Verify whether user able to Quote and Issue - 12 month term type for personal auto submission transaction.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC112(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("GWTestData_DataEngine.xlsx", "PersonalAuto", "TC112");
		Log.testCaseInfo("Verify whether user able to Quote and Issue - 12 month term type for personal auto submission transaction.");

		try {
			PersonalAutoStepsImpl pc = PersonalAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchAccount(EnterAccountInformation.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName()).build());

			pc.createAccount(CreateNewAccountFromPerson.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.addressLine1(testData.getAddressLine1())
					.state(testData.getState())
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType()).organization(testData.getProducerOrganization())
					.build());

			pc.selectProduct(PersonalAutoConstants.ProductNames.PERSONAL_AUTO);

			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());

			pc.selectQualifications(Qualification.builder().build());

			pc.updatePolicyInfo(PolicyInfo.builder()
					.policyEffectiveDate(testData.getCurrentDate())
					.policyTerm(testData.getPolicyTerm()).build()); 

			pc.addNewDriver(Drivers.builder()
					.usertype(UserType.NEW)
					.yearFirstLicensed(testData.getCurrentYear())
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.dateOfBirth(testData.getDateOfBirth())
					.addressLineOne(testData.getAddressLine1())
					.state(testData.getState())
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType())
					.licenseNumber(testData.getLicenseNumber())
					.licenseState(testData.getState()).numberOfAccidentsPolicyLevel(testData.getRolesAccidentSummary())
					.numberOfAccidentsAccountLevel(testData.getRolesAccidentSummary())
					.numberOfViolationsPolicyLevel(testData.getRolesAccidentSummary())
					.numberOfViolationsAccountLevel(testData.getRolesAccidentSummary()).build());

			pc.addVehicle(Vehicles.builder(PersonalAutoConstants.UserType.NEW)
					.vehicleType(testData.getVehicleType())
					.state(testData.getState())
					.cost(testData.getCostOfVehicle())
					.VIN(testData.getVIN()).build());

			pc.addPACoverage(PACoverage.builder().build());
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			pc.reviewPolicy(PolicyReview.builder(PersonalAutoConstants.PolicyReviewType.NONE).build());
			pc.viewQuote();
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(PersonalAutoConstants.Transactions.SUBMISSION);
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
	 * @author Manikandan.Manohar
	 * @param browser
	 * @throws Exception
	 */
	@Test(description = "Verify whether the user able to Create an auto policy and User should able to Cancel Personal Auto Policy", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC15(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("Verify whether the user able to Create an auto policy and User should able to Cancel Personal Auto Policy");
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("GWTestData_DataEngine.xlsx", "PersonalAuto", "TC15");

		try {
			PersonalAutoStepsImpl pc = PersonalAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

            pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());
            
			pc.copySubmissions();
			
			pc.viewPolicy();
			
			pc.cancelPolicy(CancellationSource.builder().source(testData.getSource())
					.reason(testData.getCancellationReason()).build());
			Log.testCaseResult(driver);

		} catch (Exception e) {
			Log.exception(e, DriverManager.getDriver());
		} finally {
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}

	/**
	 * @author Manikandan.Manohar
	 * @param browser
	 * @throws Exception
	 */
	@Test(description = "Verify whether user able to create an auto policy with particular offerings and discount and attempt to  Cancel the policy", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC16(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("Verify whether user able to create an auto policy with particular offerings and discount and attempt to  Cancel the policy");
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("GWTestData_DataEngine.xlsx", "PersonalAuto", "TC16");

		try {
			PersonalAutoStepsImpl pc = PersonalAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

            pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());
            
			pc.copySubmissions();
			
			pc.viewPolicy();
			
			pc.cancelPolicy(CancellationSource.builder().source(testData.getSource())
					.reason(testData.getCancellationReason()).build());
			Log.testCaseResult(driver);

		} catch (Exception e) {
			Log.exception(e, DriverManager.getDriver());
		} finally {
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}

	/**
	 * @author anitha.raphel
	 * @param browser
	 * @throws Exception
	 */
	@Test(description = "Verify whether user able to Quote and Issue the  Personal Auto Policy with multiple drivers", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC27(String browser) throws Exception {
		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("Verify whether user able to Quote and Issue the  Personal Auto Policy with multiple drivers");
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("GWTestData_DataEngine.xlsx", "PersonalAuto", "TC27");

		try {
			PersonalAutoStepsImpl pc = PersonalAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchAccount(EnterAccountInformation.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName()).build());

			pc.createAccount(CreateNewAccountFromPerson.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.addressLine1(testData.getAddressLine1())
					.state(testData.getState())
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType()).organization(testData.getProducerOrganization())
					.build());

			pc.selectProduct(PersonalAutoConstants.ProductNames.PERSONAL_AUTO);

			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());

			pc.selectQualifications(Qualification.builder().build());

			pc.updatePolicyInfo(PolicyInfo.builder()
					.policyEffectiveDate(testData.getCurrentDate())
					.policyTerm(testData.getPolicyTerm()).build()); 

			pc.addNewDriver(Drivers.builder()
					.usertype(UserType.NEW)
					.yearFirstLicensed(testData.getCurrentYear())
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.dateOfBirth(testData.getDateOfBirth())
					.addressLineOne(testData.getAddressLine1())
					.state(testData.getState())
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType())
					.licenseNumber(testData.getLicenseNumber())
					.licenseState(testData.getState()).numberOfAccidentsPolicyLevel(testData.getRolesAccidentSummary())
					.numberOfAccidentsAccountLevel(testData.getRolesAccidentSummary())
					.numberOfViolationsPolicyLevel(testData.getRolesAccidentSummary())
					.numberOfViolationsAccountLevel(testData.getRolesAccidentSummary()).build());

			pc.addVehicle(Vehicles.builder(PersonalAutoConstants.UserType.NEW)
					.vehicleType(testData.getVehicleType())
					.state(testData.getState())
					.cost(testData.getCostOfVehicle())
					.VIN(testData.getVIN()).build());
			
			// To add second driver
			pc.addNewDriver(Drivers.builder().usertype(UserType.NEW)
					.yearFirstLicensed(testData.getCurrentYear())
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.dateOfBirth(testData.getDateOfBirth())
					.addressLineOne(testData.getAddressLine1())
					.state(testData.getState())
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType())
					.licenseNumber(DataFakers.licenseNumber())
					.licenseState(testData.getState()).numberOfAccidentsPolicyLevel(testData.getRolesAccidentSummary())
					.numberOfAccidentsAccountLevel(testData.getRolesAccidentSummary())
					.numberOfViolationsPolicyLevel(testData.getRolesAccidentSummary())
					.numberOfViolationsAccountLevel(testData.getRolesAccidentSummary()).build());

			pc.addVehicle(Vehicles.builder(PersonalAutoConstants.UserType.NONE).build());

			pc.addPACoverage(PACoverage.builder().build());
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			pc.reviewPolicy(PolicyReview.builder(PersonalAutoConstants.PolicyReviewType.NONE).build());
			pc.viewQuote();
			pc.viewForms();
			pc.selectPayments(Payments.builder()
					.billingMethod(testData.getBillingMethod())
					.paymentPlan(testData.getPaymentPlan()).build());
			
			pc.issuepolicy(Transactions.SUBMISSION);
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
	 * @author siva.panjanathan
	 * @param browser
	 * @throws Exception
	 */
	@Test(description = "Verify whether user able to Quote and Issue the  Personal Auto Policy with term type as 6 months", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC26(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("Verify whether user able to Quote and Issue the  Personal Auto Policy with term type as 6 months");
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("GWTestData_DataEngine.xlsx", "PersonalAuto", "TC26");
		
		try {
			PersonalAutoStepsImpl pc = PersonalAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchAccount(EnterAccountInformation.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName()).build());

			pc.createAccount(CreateNewAccountFromPerson.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.addressLine1(testData.getAddressLine1())
					.state(testData.getState())
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType()).organization(testData.getProducerOrganization())
					.build());

			pc.selectProduct(PersonalAutoConstants.ProductNames.PERSONAL_AUTO);

			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());

			pc.selectQualifications(Qualification.builder().build());

			pc.updatePolicyInfo(PolicyInfo.builder()
					.policyEffectiveDate(testData.getCurrentDate())
					.policyTerm(testData.getPolicyTerm2()).build()); 

			pc.addNewDriver(Drivers.builder()
					.usertype(UserType.NEW)
					.yearFirstLicensed(testData.getCurrentYear())
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.dateOfBirth(testData.getDateOfBirth())
					.addressLineOne(testData.getAddressLine1())
					.state(testData.getState())
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType())
					.licenseNumber(testData.getLicenseNumber())
					.licenseState(testData.getState()).numberOfAccidentsPolicyLevel(testData.getRolesAccidentSummary())
					.numberOfAccidentsAccountLevel(testData.getRolesAccidentSummary())
					.numberOfViolationsPolicyLevel(testData.getRolesAccidentSummary())
					.numberOfViolationsAccountLevel(testData.getRolesAccidentSummary()).build());

			pc.addVehicle(Vehicles.builder(PersonalAutoConstants.UserType.NEW)
					.vehicleType(testData.getVehicleType())
					.state(testData.getState())
					.cost(testData.getCostOfVehicle())
					.VIN(testData.getVIN()).build());

			pc.addPACoverage(PACoverage.builder().build());

			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());

			pc.reviewPolicy(PolicyReview.builder(PersonalAutoConstants.PolicyReviewType.NONE).build());
			
			pc.viewQuote();

			pc.viewForms();

			pc.selectPayments(Payments.builder()
					.billingMethod(testData.getBillingMethod()).build());

			pc.issuepolicy(Transactions.SUBMISSION);

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
	@Test(description = "Verify Motor Vehicle Record information for Personal Auto policy.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC269(String browser) throws Exception {
		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("GWTestData_DataEngine.xlsx", "PersonalAuto", "TC269");
		Log.testCaseInfo("Verify Motor Vehicle Record information for Personal Auto policy.");
		
		try {
			PersonalAutoStepsImpl pc = PersonalAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchAccount(EnterAccountInformation.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName()).build());

			pc.createAccount(CreateNewAccountFromPerson.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.addressLine1(testData.getAddressLine1())
					.state(testData.getState())
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType()).organization(testData.getProducerOrganization())
					.build());

			pc.selectProduct(PersonalAutoConstants.ProductNames.PERSONAL_AUTO);

			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());

			pc.selectQualifications(Qualification.builder().build());

			pc.updatePolicyInfo(PolicyInfo.builder()
					.policyTerm(testData.getPolicyTerm2()).build()); 

			pc.addNewDriver(Drivers.builder()
					.usertype(UserType.NEW)
					.yearFirstLicensed(testData.getCurrentYear())
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.dateOfBirth(testData.getDateOfBirth())
					.addressLineOne(testData.getAddressLine1())
					.state(testData.getState())
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType())
					.licenseNumber(testData.getLicenseNumber())
					.licenseState(testData.getState()).numberOfAccidentsPolicyLevel(testData.getRolesAccidentSummary())
					.numberOfAccidentsAccountLevel(testData.getRolesAccidentSummary())
					.numberOfViolationsPolicyLevel(testData.getRolesAccidentSummary())
					.numberOfViolationsAccountLevel(testData.getRolesAccidentSummary())
					.motorVehicleRecord(true).build());

			pc.addVehicle(Vehicles.builder(PersonalAutoConstants.UserType.NEW)
					.vehicleType(testData.getVehicleType())
					.state(testData.getState())
					.cost(testData.getCostOfVehicle())
					.VIN(testData.getVIN()).build());

			pc.addPACoverage(PACoverage.builder().build());
			pc.motorvehicleRecords();
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			pc.reviewPolicy(PolicyReview.builder(PersonalAutoConstants.PolicyReviewType.NONE).build());
			pc.viewQuote();
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(PersonalAutoConstants.Transactions.SUBMISSION);
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
	 * @author Manikandan.Manohar
	 * @param browser
	 * @throws Exception
	 */
	@Test(description = "Verify whether user able to Quote and Issue the Personal Auto Policy with multiple drivers(2 Rated & 1 Excluded drivers)", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC28(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("GWTestData_DataEngine.xlsx", "PersonalAuto", "TC28");
		Log.testCaseInfo("Verify whether user able to Quote and Issue the Personal Auto Policy with multiple drivers(2 Rated & 1 Excluded drivers)");

		try {
			PersonalAutoStepsImpl pc = PersonalAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchAccount(EnterAccountInformation.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName()).build());

			pc.createAccount(CreateNewAccountFromPerson.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.addressLine1(testData.getAddressLine1())
					.state(testData.getState())
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType()).organization(testData.getProducerOrganization())
					.build());

			pc.selectProduct(PersonalAutoConstants.ProductNames.PERSONAL_AUTO);

			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());

			pc.selectQualifications(Qualification.builder().build());

			pc.updatePolicyInfo(PolicyInfo.builder()
					.policyEffectiveDate(DataFakers.currentDate())
					.policyTerm(testData.getPolicyTerm()).build()); 

			pc.addNewDriver(Drivers.builder().usertype(UserType.NEW)
					.yearFirstLicensed(testData.getCurrentYear())
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.dateOfBirth(testData.getDateOfBirth())
					.addressLineOne(testData.getAddressLine1())
					.state(testData.getState())
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType())
					.licenseNumber(testData.getLicenseNumber())
					.licenseState(testData.getState())
					.numberOfAccidentsPolicyLevel(testData.getRolesAccidentSummary())
					.numberOfAccidentsAccountLevel(testData.getRolesAccidentSummary())
					.numberOfViolationsPolicyLevel(testData.getRolesAccidentSummary())
					.numberOfViolationsAccountLevel(testData.getRolesAccidentSummary())
					.goodStudent(true)
					.rdbGoodStudent(PersonalAutoConstants.RadioButton.YES)
					.applyGoodDriverDiscount(true)
					.rdbApplyGoodDriverDiscount(PersonalAutoConstants.RadioButton.YES)
					.qualifiesForGoodDriverDiscount(true)
					.rdbQualifiesForGoodDriverDiscount(PersonalAutoConstants.RadioButton.YES)
					.build());

			pc.addVehicle(Vehicles.builder(PersonalAutoConstants.UserType.NEW)
					.vehicleType(testData.getVehicleType())
					.state(testData.getState())
					.cost(testData.getCostOfVehicle())
					.VIN(testData.getVIN()).build());

			pc.addNewDriver(Drivers.builder().usertype(UserType.NEW)
					.yearFirstLicensed(testData.getCurrentYear())
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.dateOfBirth(testData.getDateOfBirth())
					.addressLineOne(testData.getAddressLine1())
					.state(testData.getState())
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType())
					.licenseNumber(DataFakers.licenseNumber())
					.licenseState(testData.getState())
					.numberOfAccidentsPolicyLevel(testData.getRolesAccidentSummary())
					.numberOfAccidentsAccountLevel(testData.getRolesAccidentSummary())
					.numberOfViolationsPolicyLevel(testData.getRolesAccidentSummary())
					.numberOfViolationsAccountLevel(testData.getRolesAccidentSummary())
					.goodStudent(true)
					.rdbGoodStudent(PersonalAutoConstants.RadioButton.YES)
					.applyGoodDriverDiscount(true)
					.rdbApplyGoodDriverDiscount(PersonalAutoConstants.RadioButton.YES)
					.qualifiesForGoodDriverDiscount(true)
					.rdbQualifiesForGoodDriverDiscount(PersonalAutoConstants.RadioButton.YES)
					.build());

			pc.addNewDriver(Drivers.builder().usertype(UserType.NEW)
					.yearFirstLicensed(testData.getCurrentYear())
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.dateOfBirth(testData.getDateOfBirth())
					.addressLineOne(testData.getAddressLine1())
					.state(testData.getState())
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType())
					.licenseNumber(DataFakers.licenseNumber())
					.licenseState(testData.getState())
					.numberOfAccidentsPolicyLevel(testData.getRolesAccidentSummary())
					.numberOfAccidentsAccountLevel(testData.getRolesAccidentSummary())
					.numberOfViolationsPolicyLevel(testData.getRolesAccidentSummary())
					.numberOfViolationsAccountLevel(testData.getRolesAccidentSummary())
					.exclude(true)
					.rdbExclude(PersonalAutoConstants.RadioButton.YES).build());

			pc.addVehicle(Vehicles.builder(UserType.NONE).build());

			pc.addPACoverage(PACoverage.builder().build());
			
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());

			pc.reviewPolicy(PolicyReview.builder(PersonalAutoConstants.PolicyReviewType.NONE).build());
			
			pc.approvedUWIssues(UnderWriterIssue.builder().UwIssueAlert(true).build());

			pc.reviewPolicy(PolicyReview.builder(PersonalAutoConstants.PolicyReviewType.NONE).build());

			pc.viewQuote();
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(PersonalAutoConstants.Transactions.SUBMISSION);
			pc.approvedUWIssues(UnderWriterIssue.builder().build());
			pc.reviewPolicy(PolicyReview.builder(PersonalAutoConstants.PolicyReviewType.UW_ISSUE).build());
			pc.approvedUWIssues(UnderWriterIssue.builder().build());
			pc.reviewPolicy(PolicyReview.builder(PersonalAutoConstants.PolicyReviewType.UW_ISSUE).build());
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
	 * @author Manikandan.Manohar
	 * @param browser
	 * @throws Exception
	 */
	@Test(description = "Verify whether user able to Quote and Issue when prior policy and claims are added in the Personal Auto Policy", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC40(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("GWTestData_DataEngine.xlsx", "PersonalAuto", "TC40");
		Log.testCaseInfo("Verify whether user able to Quote and Issue when prior policy and claims are added in the Personal Auto Policy");

		try {
			PersonalAutoStepsImpl pc = PersonalAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchAccount(EnterAccountInformation.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName()).build());

			pc.createAccount(CreateNewAccountFromPerson.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.addressLine1(testData.getAddressLine1())
					.state(testData.getState())
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType()).organization(testData.getProducerOrganization())
					.build());

			pc.selectProduct(PersonalAutoConstants.ProductNames.PERSONAL_AUTO);

			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());

			pc.selectQualifications(Qualification.builder().build());

			pc.updatePolicyInfo(PolicyInfo.builder()
					.policyEffectiveDate(testData.getCurrentDate())
					.policyTerm(testData.getPolicyTerm()).build()); 

			pc.addNewDriver(Drivers.builder()
					.usertype(UserType.NEW)
					.yearFirstLicensed(testData.getCurrentYear())
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.dateOfBirth(testData.getDateOfBirth())
					.addressLineOne(testData.getAddressLine1())
					.state(testData.getState())
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType())
					.licenseNumber(testData.getLicenseNumber())
					.licenseState(testData.getState())
					.numberOfAccidentsPolicyLevel(testData.getRolesAccidentSummary())
					.numberOfAccidentsAccountLevel(testData.getRolesAccidentSummary())
					.numberOfViolationsPolicyLevel(testData.getRolesAccidentSummary())
					.numberOfViolationsAccountLevel(testData.getRolesAccidentSummary()).build());

			pc.addVehicle(Vehicles.builder(PersonalAutoConstants.UserType.NEW)
					.vehicleType(testData.getVehicleType())
					.state(testData.getState())
					.cost(testData.getCostOfVehicle())
					.VIN(testData.getVIN()).build());

			pc.addPACoverage(PACoverage.builder().build());
			
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.PRIOR_POLICIES)// Claims are not working in Pc 
					.carrier(testData.getCarrier())
					.policyNo(testData.getPolicyNumber())
					.effectiveDate(testData.getCurrentDate())
					.expirationDate(testData.getDateOneMonthAhead())
					.annualPremium(testData.getBasis())
					.losses(testData.getBasis())
					.totalLosses(testData.getBasis())
					.build());

			pc.reviewPolicy(PolicyReview.builder(PersonalAutoConstants.PolicyReviewType.NONE).build());
			pc.viewQuote();
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(PersonalAutoConstants.Transactions.SUBMISSION);
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
	@Test(description = "Verify whether user able to Quote and Issue when Multiple Secondary Named insured is added in the Personal Auto Policy", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC41(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("GWTestData_DataEngine.xlsx", "PersonalAuto", "TC41");
		Log.testCaseInfo("Verify whether user able to Quote and Issue when Multiple Secondary Named insured is added in the Personal Auto Policy");
		
		try {
			PersonalAutoStepsImpl pc = PersonalAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchAccount(EnterAccountInformation.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName()).build());

			pc.createAccount(CreateNewAccountFromPerson.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.addressLine1(testData.getAddressLine1())
					.state(testData.getState())
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType()).organization(testData.getProducerOrganization())
					.build());

			pc.selectProduct(PersonalAutoConstants.ProductNames.PERSONAL_AUTO);

			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());

			pc.selectQualifications(Qualification.builder().build());

			pc.updatePolicyInfo(PolicyInfo.builder()
					.policyEffectiveDate(testData.getCurrentDate())
					.policyTerm(testData.getPolicyTerm())
					.addSecondaryInsured(true)
					.createInsured(CreateNewAccountFromPerson.builder()
							.addSecondaryInsured(true)
							.firstName(testData.getFirstName())
							.lastName(testData.getLastName())
							.addressLine1(testData.getAddressLine1())
							.state(testData.getState())
							.city(testData.getCity())
							.zipCode(testData.getZipcode())
							.addressType(testData.getAddressType()).build())
					.build());

			pc.updatePolicyInfo(PolicyInfo.builder()
					.addSecondaryInsured(true)
					.createInsured(CreateNewAccountFromPerson.builder()
							.addSecondaryInsured(true)
							.firstName(testData.getFirstName())
							.lastName(testData.getLastName())
							.addressLine1(testData.getAddressLine1())
							.state(testData.getState())
							.city(testData.getCity())
							.zipCode(testData.getZipcode())
							.addressType(testData.getAddressType()).build())
					.build());

			pc.addNewDriver(Drivers.builder().usertype(UserType.NEW)
					.yearFirstLicensed(testData.getCurrentYear())
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.dateOfBirth(testData.getDateOfBirth())
					.addressLineOne(testData.getAddressLine1())
					.state(testData.getState())
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType())
					.licenseNumber(testData.getLicenseNumber())
					.licenseState(testData.getState())
					.numberOfAccidentsPolicyLevel(testData.getRolesAccidentSummary())
					.numberOfAccidentsAccountLevel(testData.getRolesAccidentSummary())
					.numberOfViolationsPolicyLevel(testData.getRolesAccidentSummary())
					.numberOfViolationsAccountLevel(testData.getRolesAccidentSummary()).build());

			pc.addVehicle(Vehicles.builder(PersonalAutoConstants.UserType.NEW)
					.vehicleType(testData.getVehicleType())
					.state(testData.getState())
					.cost(testData.getCostOfVehicle())
					.VIN(testData.getVIN()).build());

			pc.addPACoverage(PACoverage.builder().build());
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			pc.reviewPolicy(PolicyReview.builder(PersonalAutoConstants.PolicyReviewType.NONE).build());
			pc.viewQuote();
			pc.viewForms();
			pc.issuepolicy(Transactions.SUBMISSION);
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
	 * @author Manikandan.Manohar
	 * @param browser
	 * @throws Exception
	 */
	@Test(description = "Verify whether user able to Quote and Issue when additional insurer and secondary insurer as a 'New Person' is added with Address state different from Base state of Policy in the Personal Auto Policy", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC37(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("GWTestData_DataEngine.xlsx", "PersonalAuto", "TC37");
		Log.testCaseInfo("Verify whether user able to Quote and Issue when additional insurer and secondary insurer as a 'New Person' is added with Address state different from Base state of Policy in the Personal Auto Policy");

		try {
			PersonalAutoStepsImpl pc = PersonalAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchAccount(EnterAccountInformation.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName()).build());

			pc.createAccount(CreateNewAccountFromPerson.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.addressLine1(testData.getAddressLine1())
					.state(testData.getState())
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType()).organization(testData.getProducerOrganization())
					.build());

			pc.selectProduct(PersonalAutoConstants.ProductNames.PERSONAL_AUTO);

			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());

			pc.selectQualifications(Qualification.builder().build());

			pc.updatePolicyInfo(
					PolicyInfo.builder().policyEffectiveDate(DataFakers.currentDate())
					.policyTerm(testData.getPolicyTerm())
					.addSecondaryInsured(true)
					.createInsured(CreateNewAccountFromPerson.builder()
							.addSecondaryInsured(true)
							.firstName(testData.getFirstName())
							.lastName(testData.getLastName())
							.addressLine1(testData.getAddressLine1())
							.state(testData.getState())
							.city(testData.getCity())
							.zipCode(testData.getZipcode())
							.addressType(testData.getAddressType()).build())
					.build());

			pc.updatePolicyInfo(PolicyInfo.builder()
					.addAdditionalInsured(true)
					.createInsured(CreateNewAccountFromPerson
							.builder().addAdditionalInsured(true)
							.firstName(testData.getFirstName())
							.lastName(testData.getLastName())
							.addressLine1(testData.getAddressLine1())
							.state(testData.getState())
							.city(testData.getCity())
							.zipCode(testData.getZipcode())
							.addressType(testData.getAddressType()).build()).build());

			pc.addNewDriver(Drivers.builder().usertype(UserType.NEW)
					.yearFirstLicensed(testData.getCurrentYear())
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.dateOfBirth(testData.getDateOfBirth())
					.addressLineOne(testData.getAddressLine1())
					.state(testData.getState())
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType())
					.licenseNumber(testData.getLicenseNumber())
					.licenseState(testData.getState())
					.numberOfAccidentsPolicyLevel(testData.getRolesAccidentSummary())
					.numberOfAccidentsAccountLevel(testData.getRolesAccidentSummary())
					.numberOfViolationsPolicyLevel(testData.getRolesAccidentSummary())
					.numberOfViolationsAccountLevel(testData.getRolesAccidentSummary()).build());

			pc.addVehicle(Vehicles.builder(PersonalAutoConstants.UserType.NEW)
					.vehicleType(testData.getVehicleType())
					.state(testData.getState())
					.cost(testData.getCostOfVehicle())
					.VIN(testData.getVIN()).build());

			pc.addPACoverage(PACoverage.builder().build());
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			pc.reviewPolicy(PolicyReview.builder(PersonalAutoConstants.PolicyReviewType.NONE).build());
			pc.viewQuote();
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(PersonalAutoConstants.Transactions.SUBMISSION);
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
	 * @author Manikandan.Manohar
	 * @param browser
	 * @throws Exception
	 */
	@Test(description = "Verify whether user unable to Quote and Issue when Same person both as Secondary Insurer and Additional Insurer is added in the Personal Auto Policy", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC39(String browser) throws Exception {
		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("GWTestData_DataEngine.xlsx", "PersonalAuto", "TC39");
		Log.testCaseInfo("Verify whether user unable to Quote and Issue when Same person both as Secondary Insurer and Additional Insurer is added in the Personal Auto Policy");

		try {
			PersonalAutoStepsImpl pc = PersonalAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchAccount(EnterAccountInformation.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName()).build());

			pc.createAccount(CreateNewAccountFromPerson.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.addressLine1(testData.getAddressLine1())
					.state(testData.getState())
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType()).organization(testData.getProducerOrganization())
					.build());

			pc.selectProduct(PersonalAutoConstants.ProductNames.PERSONAL_AUTO);

			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());

			pc.selectQualifications(Qualification.builder().build());

			pc.updatePolicyInfo(
					PolicyInfo.builder().policyEffectiveDate(testData.getCurrentDate())
					.policyTerm(testData.getPolicyTerm())
					.addSecondaryInsured(true)
					.createInsured(CreateNewAccountFromPerson.builder()
							.addSecondaryInsured(true)
							.firstName(testData.getFirstName())
							.lastName(testData.getLastName())
							.addressLine1(testData.getAddressLine1())
							.state(testData.getState())
							.city(testData.getCity())
							.zipCode(testData.getZipcode())
							.addressType(testData.getAddressType()).build())
					.build());

			pc.updatePolicyInfo(PolicyInfo.builder()
					.addAdditionalInsured(true)
					.createInsured(CreateNewAccountFromPerson
							.builder().addAdditionalInsured(true)
							.firstName(testData.getFirstName())
							.lastName(testData.getLastName())
							.addressLine1(testData.getAddressLine1())
							.state(testData.getState())
							.city(testData.getCity())
							.zipCode(testData.getZipcode())
							.addressType(testData.getAddressType()).build()).build());

			pc.addNewDriver(Drivers.builder().usertype(UserType.NEW)
					.yearFirstLicensed(testData.getCurrentYear())
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.dateOfBirth(testData.getDateOfBirth())
					.addressLineOne(testData.getAddressLine1())
					.state(testData.getState())
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType())
					.licenseNumber(testData.getLicenseNumber())
					.licenseState(testData.getState())
					.numberOfAccidentsPolicyLevel(testData.getRolesAccidentSummary())
					.numberOfAccidentsAccountLevel(testData.getRolesAccidentSummary())
					.numberOfViolationsPolicyLevel(testData.getRolesAccidentSummary())
					.numberOfViolationsAccountLevel(testData.getRolesAccidentSummary()).build());

			pc.addVehicle(Vehicles.builder(PersonalAutoConstants.UserType.NEW)
					.vehicleType(testData.getVehicleType())
					.state(testData.getState())
					.cost(testData.getCostOfVehicle())
					.VIN(testData.getVIN()).build());

			pc.addPACoverage(PACoverage.builder().build());
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			pc.reviewPolicy(PolicyReview.builder(PersonalAutoConstants.PolicyReviewType.NONE).build());
			pc.viewQuote();
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(PersonalAutoConstants.Transactions.SUBMISSION);
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
	 * @author anitha.raphel
	 * @param browser
	 * @throws Exception
	 */
	@Test(description = "Verify whether user able to assign a multiple Driver for the added one vehicle in Personal Auto Policy ", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC35(String browser) throws Exception {
		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("GWTestData_DataEngine.xlsx", "PersonalAuto", "TC35");
		Log.testCaseInfo("Verify whether user able to assign a multiple Driver for the added one vehicle in Personal Auto Policy ");
		
		String firstName = testData.setFirstName();
		String lastName = testData.setLastName();
		String driverFirstName1 = testData.setFirstName();
		String driverLastName1 = testData.setLastName();
		String driverFirstName2 = testData.setFirstName();
		String driverLastName2 = testData.setLastName();

		try {
			PersonalAutoStepsImpl pc = PersonalAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchAccount(EnterAccountInformation.builder()
					.firstName(firstName)
					.lastName(lastName).build());

			pc.createAccount(CreateNewAccountFromPerson.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.addressLine1(testData.getAddressLine1())
					.state(testData.getState())
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType()).organization(testData.getProducerOrganization())
					.build());

			pc.selectProduct(PersonalAutoConstants.ProductNames.PERSONAL_AUTO);

			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());

			pc.selectQualifications(Qualification.builder().build());

			pc.updatePolicyInfo(PolicyInfo.builder()
					.policyEffectiveDate(testData.getCurrentDate())
					.policyTerm(testData.getPolicyTerm()).build()); 

			pc.addNewDriver(Drivers.builder().usertype(UserType.NEW)
					.yearFirstLicensed(testData.getCurrentYear())
					.firstName(driverFirstName1)
					.lastName(driverLastName1)
					.dateOfBirth(testData.getDateOfBirth())
					.addressLineOne(testData.getAddressLine1())
					.state(testData.getState())
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType())
					.licenseNumber(testData.getLicenseNumber())
					.licenseState(testData.getState())
					.numberOfAccidentsPolicyLevel(testData.getRolesAccidentSummary())
					.numberOfAccidentsAccountLevel(testData.getRolesAccidentSummary())
					.numberOfViolationsPolicyLevel(testData.getRolesAccidentSummary())
					.numberOfViolationsAccountLevel(testData.getRolesAccidentSummary()).build());

			pc.addVehicle(Vehicles.builder(PersonalAutoConstants.UserType.NEW)
					.vehicleType(testData.getVehicleType())
					.state(testData.getState())
					.cost(testData.getCostOfVehicle())
					.VIN(testData.getVIN()).build());

			pc.addNewDriver(Drivers.builder().usertype(UserType.NEW)
					.yearFirstLicensed(testData.getCurrentYear())
					.firstName(driverFirstName2)
					.lastName(driverLastName2)
					.dateOfBirth(testData.getDateOfBirth())
					.addressLineOne(testData.getAddressLine1())
					.state(testData.getState())
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType())
					.licenseNumber(DataFakers.licenseNumber())
					.licenseState(testData.getState())
					.numberOfAccidentsPolicyLevel(testData.getRolesAccidentSummary())
					.numberOfAccidentsAccountLevel(testData.getRolesAccidentSummary())
					.numberOfViolationsPolicyLevel(testData.getRolesAccidentSummary())
					.numberOfViolationsAccountLevel(testData.getRolesAccidentSummary()).build());

			pc.addVehicle(Vehicles.builder(PersonalAutoConstants.UserType.ASSIGN_DRIVERS).build());

			pc.addPACoverage(PACoverage.builder().build());
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			pc.reviewPolicy(PolicyReview.builder(PersonalAutoConstants.PolicyReviewType.NONE).build());
			pc.viewQuote();
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(Transactions.SUBMISSION);
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
	 * @author seetha.varanasi
	 * @param browser
	 * @throws Exception
	 */
	@Test(description = "Verify whether user able to Quote and Issue the  Personal Auto Policy with term type as Annual/12 months", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC25(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("GWTestData_DataEngine.xlsx", "PersonalAuto", "TC25");
		Log.testCaseInfo("Verify whether user able to Quote and Issue the  Personal Auto Policy with term type as Annual/12 months");
		
		try {
			PersonalAutoStepsImpl pc = PersonalAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchAccount(EnterAccountInformation.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName()).build());

			pc.createAccount(CreateNewAccountFromPerson.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.addressLine1(testData.getAddressLine1())
					.state(testData.getState())
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType()).organization(testData.getProducerOrganization())
					.build());

			pc.selectProduct(PersonalAutoConstants.ProductNames.PERSONAL_AUTO);

			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());

			pc.selectQualifications(Qualification.builder().build());

			pc.updatePolicyInfo(PolicyInfo.builder()
					.policyEffectiveDate(testData.getCurrentDate())
					.policyTerm(testData.getPolicyTerm()).build()); 

			pc.addNewDriver(Drivers.builder().usertype(UserType.NEW)
					.yearFirstLicensed(testData.getCurrentYear())
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.dateOfBirth(testData.getDateOfBirth())
					.addressLineOne(testData.getAddressLine1())
					.state(testData.getState())
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType())
					.licenseNumber(testData.getLicenseNumber())
					.licenseState(testData.getState())
					.numberOfAccidentsPolicyLevel(testData.getRolesAccidentSummary())
					.numberOfAccidentsAccountLevel(testData.getRolesAccidentSummary())
					.numberOfViolationsPolicyLevel(testData.getRolesAccidentSummary())
					.numberOfViolationsAccountLevel(testData.getRolesAccidentSummary()).build());

			pc.addVehicle(Vehicles.builder(PersonalAutoConstants.UserType.NEW)
					.vehicleType(testData.getVehicleType())
					.state(testData.getState())
					.cost(testData.getCostOfVehicle())
					.VIN(testData.getVIN()).build());

			pc.addPACoverage(PACoverage.builder().build());
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			pc.reviewPolicy(PolicyReview.builder(PersonalAutoConstants.PolicyReviewType.NONE).build());
			pc.viewQuote();
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(PersonalAutoConstants.Transactions.SUBMISSION);
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
	@Test(description = "Verify whether user able to assign a Driver for the added vehicle in Personal Auto Policy ", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC34(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("GWTestData_DataEngine.xlsx", "PersonalAuto", "TC34");
		Log.testCaseInfo("Verify whether user able to assign a Driver for the added vehicle in Personal Auto Policy");
		
		try {
			PersonalAutoStepsImpl pc = PersonalAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchAccount(EnterAccountInformation.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName()).build());

			pc.createAccount(CreateNewAccountFromPerson.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.addressLine1(testData.getAddressLine1())
					.state(testData.getState())
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType()).organization(testData.getProducerOrganization())
					.build());

			pc.selectProduct(PersonalAutoConstants.ProductNames.PERSONAL_AUTO);

			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());

			pc.selectQualifications(Qualification.builder().build());

			pc.updatePolicyInfo(PolicyInfo.builder()
					.policyEffectiveDate(testData.getCurrentDate())
					.policyTerm(testData.getPolicyTerm()).build()); 

			pc.addNewDriver(Drivers.builder().usertype(UserType.NEW)
					.yearFirstLicensed(testData.getCurrentYear())
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.dateOfBirth(testData.getDateOfBirth())
					.addressLineOne(testData.getAddressLine1())
					.state(testData.getState())
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType())
					.licenseNumber(testData.getLicenseNumber())
					.licenseState(testData.getState())
					.numberOfAccidentsPolicyLevel(testData.getRolesAccidentSummary())
					.numberOfAccidentsAccountLevel(testData.getRolesAccidentSummary())
					.numberOfViolationsPolicyLevel(testData.getRolesAccidentSummary())
					.numberOfViolationsAccountLevel(testData.getRolesAccidentSummary()).build());

			pc.addVehicle(Vehicles.builder(PersonalAutoConstants.UserType.NEW)
					.vehicleType(testData.getVehicleType())
					.state(testData.getState())
					.cost(testData.getCostOfVehicle())
					.VIN(testData.getVIN()).build());

			pc.addPACoverage(PACoverage.builder().build());
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			pc.reviewPolicy(PolicyReview.builder(PersonalAutoConstants.PolicyReviewType.NONE).build());
			pc.viewQuote();
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(PersonalAutoConstants.Transactions.SUBMISSION);
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
	 * 
	 * @author seetha.varanasi
	 * @param browser
	 * @throws Exception
	 */
	@Test(description = "Verify whether a user able to create a New AUTO Submission with 6 month term type and Secondary & Additional Insured", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC113(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("GWTestData_DataEngine.xlsx", "PersonalAuto", "TC113");
		Log.testCaseInfo("Verify whether a user able to create a New AUTO Submission with 6 month term type and Secondary & Additional Insured");
		
		try {
			PersonalAutoStepsImpl pc = PersonalAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchAccount(EnterAccountInformation.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName()).build());

			pc.createAccount(CreateNewAccountFromPerson.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.addressLine1(testData.getAddressLine1())
					.state(testData.getState())
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType()).organization(testData.getProducerOrganization())
					.build());

			pc.selectProduct(PersonalAutoConstants.ProductNames.PERSONAL_AUTO);

			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());

			pc.selectQualifications(Qualification.builder().build());

			pc.updatePolicyInfo(PolicyInfo.builder().policyEffectiveDate(testData.getCurrentDate())
					.policyTerm(testData.getPolicyTerm()).addSecondaryInsured(true)
					.createInsured(CreateNewAccountFromPerson.builder().addSecondaryInsured(true)
							.firstName(testData.getFirstName())
							.lastName(testData.getLastName())
							.addressLine1(testData.getAddressLine1())
							.state(testData.getState())
							.city(testData.getCity())
							.zipCode(testData.getZipcode())
							.addressType(testData.getAddressType()).build())
					.build());

			pc.updatePolicyInfo(PolicyInfo.builder().addAdditionalInsured(true)
					.createInsured(CreateNewAccountFromPerson.builder().addAdditionalInsured(true)
							.firstName(testData.getFirstName())
							.lastName(testData.getLastName())
							.addressLine1(testData.getAddressLine1())
							.state(testData.getState())
							.city(testData.getCity())
							.zipCode(testData.getZipcode())
							.addressType(testData.getAddressType()).build())
					.build());

			pc.addNewDriver(Drivers.builder().usertype(UserType.NEW).yearFirstLicensed(testData.getCurrentYear())
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.dateOfBirth(testData.getDateOfBirth())
					.addressLineOne(testData.getAddressLine1())
					.state(testData.getState())
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType())
					.licenseNumber(testData.getLicenseNumber())
					.licenseState(testData.getState())
					.numberOfAccidentsPolicyLevel(testData.getRolesAccidentSummary())
					.numberOfAccidentsAccountLevel(testData.getRolesAccidentSummary())
					.numberOfViolationsPolicyLevel(testData.getRolesAccidentSummary())
					.numberOfViolationsAccountLevel(testData.getRolesAccidentSummary()).build());

			pc.addVehicle(Vehicles.builder(PersonalAutoConstants.UserType.NEW)
					.vehicleType(testData.getVehicleType()).state(testData.getState())
					.cost(testData.getCostOfVehicle())
					.VIN(testData.getVIN()).build());

			pc.addPACoverage(PACoverage.builder().build());
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			pc.reviewPolicy(PolicyReview.builder(PersonalAutoConstants.PolicyReviewType.NONE).build());
			pc.viewQuote();
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(PersonalAutoConstants.Transactions.SUBMISSION);
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
	 * @author seetha.varanasi
	 * @param browser
	 * @throws Exception
	 */
	@Test(description = "Verify whether user able to assign a one Driver for the added multiple vehicle in Personal Auto Policy ", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC36(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("GWTestData_DataEngine.xlsx", "PersonalAuto", "TC36");
		Log.testCaseInfo("Verify whether User can able to Create a Personal Auto Policy by adding one secondary insured and one additional insured ");
		
		try {
			PersonalAutoStepsImpl pc = PersonalAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchAccount(EnterAccountInformation.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName()).build());

			pc.createAccount(CreateNewAccountFromPerson.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.addressLine1(testData.getAddressLine1())
					.state(testData.getState())
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType()).organization(testData.getProducerOrganization())
					.build());

			pc.selectProduct(PersonalAutoConstants.ProductNames.PERSONAL_AUTO);

			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());

			pc.selectQualifications(Qualification.builder().build());

			pc.updatePolicyInfo(PolicyInfo.builder().policyEffectiveDate(testData.getCurrentDate())
					.policyTerm(testData.getPolicyTerm2()).addSecondaryInsured(true)
					.createInsured(CreateNewAccountFromPerson.builder().addSecondaryInsured(true)
							.firstName(testData.getFirstName())
							.lastName(testData.getLastName())
							.addressLine1(testData.getAddressLine1())
							.state(testData.getState())
							.city(testData.getCity())
							.zipCode(testData.getZipcode())
							.addressType(testData.getAddressType()).build())
					.build());

			pc.updatePolicyInfo(PolicyInfo.builder().addAdditionalInsured(true)
					.createInsured(CreateNewAccountFromPerson.builder().addAdditionalInsured(true)
							.firstName(testData.getFirstName())
							.lastName(testData.getLastName())
							.addressLine1(testData.getAddressLine1())
							.state(testData.getState())
							.city(testData.getCity())
							.zipCode(testData.getZipcode())
							.addressType(testData.getAddressType()).build())
					.build());

			pc.addNewDriver(Drivers.builder().usertype(UserType.NEW).yearFirstLicensed(testData.getCurrentYear())
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.dateOfBirth(testData.getDateOfBirth())
					.addressLineOne(testData.getAddressLine1())
					.state(testData.getState())
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType())
					.licenseNumber(testData.getLicenseNumber())
					.licenseState(testData.getState())
					.numberOfAccidentsPolicyLevel(testData.getRolesAccidentSummary())
					.numberOfAccidentsAccountLevel(testData.getRolesAccidentSummary())
					.numberOfViolationsPolicyLevel(testData.getRolesAccidentSummary())
					.numberOfViolationsAccountLevel(testData.getRolesAccidentSummary()).build());

			pc.addVehicle(Vehicles.builder(PersonalAutoConstants.UserType.NEW)
					.vehicleType(testData.getVehicleType()).state(testData.getState())
					.cost(testData.getCostOfVehicle())
					.VIN(testData.getVIN()).build());


			pc.addVehicle(Vehicles.builder(PersonalAutoConstants.UserType.NEW)
					.vehicleType(testData.getVehicleType()).state(testData.getState())
					.cost(testData.getCostOfVehicle())
					.VIN(DataFakers.VIN()).build());


			pc.addPACoverage(PACoverage.builder().build());
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			pc.reviewPolicy(PolicyReview.builder(PersonalAutoConstants.PolicyReviewType.NONE).build());
			pc.viewQuote();
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(PersonalAutoConstants.Transactions.SUBMISSION);
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
	 * @author Manikandan.Manohar
	 * @param browser
	 * @throws Exception
	 */
	@Test(description = "Verify whether user able to Quote and Issue the Personal Auto Policy with  add/remove of drivers(Rated & Excluded) during policy change transaction ", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC31(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("GWTestData_DataEngine.xlsx", "PersonalAuto", "TC31");
		Log.testCaseInfo("Verify whether user able to Quote and Issue the Personal Auto Policy with  add/remove of drivers(Rated & Excluded) during policy change transaction ");
		
		String firstName = testData.setFirstName();
		String lastName = testData.setLastName();
		String driverFirstName1 = testData.setFirstName();
		String driverLastName1 = testData.setLastName();
		String driverFirstName2 = testData.setFirstName();
		String driverLastName2 = testData.setLastName();
		String driverFirstName3 = testData.setFirstName();
		String driverLastName3 = testData.setLastName();

		try {
			PersonalAutoStepsImpl pc = PersonalAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchAccount(EnterAccountInformation.builder()
					.firstName(firstName)
					.lastName(lastName).build());

			pc.createAccount(CreateNewAccountFromPerson.builder()
					.firstName(firstName)
					.lastName(lastName)
					.addressLine1(testData.getAddressLine1())
					.state(testData.getState())
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType()).organization(testData.getProducerOrganization())
					.build());

			pc.selectProduct(PersonalAutoConstants.ProductNames.PERSONAL_AUTO);

			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());

			pc.selectQualifications(Qualification.builder().build());

			pc.updatePolicyInfo(PolicyInfo.builder().policyEffectiveDate(testData.getCurrentDate())
					.policyTerm(testData.getPolicyTerm()).build()); 

			pc.addNewDriver(Drivers.builder().usertype(UserType.NEW)
					.yearFirstLicensed(testData.getCurrentYear())
					.firstName(driverFirstName1)
					.lastName(driverLastName1)
					.dateOfBirth(testData.getDateOfBirth())
					.addressLineOne(testData.getAddressLine1())
					.state(testData.getState())
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType())
					.licenseNumber(testData.getLicenseNumber())
					.licenseState(testData.getState())
					.numberOfAccidentsPolicyLevel(testData.getRolesAccidentSummary())
					.numberOfAccidentsAccountLevel(testData.getRolesAccidentSummary())
					.numberOfViolationsPolicyLevel(testData.getRolesAccidentSummary())
					.numberOfViolationsAccountLevel(testData.getRolesAccidentSummary())
					.goodStudent(true)
					.rdbGoodStudent(PersonalAutoConstants.RadioButton.YES)
					.applyGoodDriverDiscount(true)
					.rdbApplyGoodDriverDiscount(PersonalAutoConstants.RadioButton.YES)
					.qualifiesForGoodDriverDiscount(true)
					.rdbQualifiesForGoodDriverDiscount(PersonalAutoConstants.RadioButton.YES)
					.build());

			pc.addVehicle(Vehicles.builder(PersonalAutoConstants.UserType.NEW)
					.vehicleType(testData.getVehicleType())
					.state(testData.getState())
					.cost(DataFakers.costOfVehicle())
					.VIN(testData.getVIN()).build());

			pc.addNewDriver(Drivers.builder()
					.usertype(UserType.NEW)
					.yearFirstLicensed(testData.getCurrentYear())
					.firstName(driverFirstName2)
					.lastName(driverLastName2)
					.dateOfBirth(testData.getDateOfBirth())
					.addressLineOne(testData.getAddressLine1())
					.state(testData.getState())
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType())
					.licenseNumber(testData.getLicenseNumber())
					.licenseState(testData.getState())
					.numberOfAccidentsPolicyLevel(testData.getRolesAccidentSummary())
					.numberOfAccidentsAccountLevel(testData.getRolesAccidentSummary())
					.numberOfViolationsPolicyLevel(testData.getRolesAccidentSummary())
					.numberOfViolationsAccountLevel(testData.getRolesAccidentSummary())
					.goodStudent(true)
					.rdbGoodStudent(PersonalAutoConstants.RadioButton.YES)
					.applyGoodDriverDiscount(true)
					.rdbApplyGoodDriverDiscount(PersonalAutoConstants.RadioButton.YES)
					.qualifiesForGoodDriverDiscount(true)
					.rdbQualifiesForGoodDriverDiscount(PersonalAutoConstants.RadioButton.YES)
					.exclude(true)
					.rdbExclude(PersonalAutoConstants.RadioButton.YES)
					.build());

			pc.addVehicle(Vehicles.builder(PersonalAutoConstants.UserType.NONE).build());

			pc.addPACoverage(PACoverage.builder().build());
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			pc.reviewPolicy(PolicyReview.builder(PersonalAutoConstants.PolicyReviewType.NONE).build());
			pc.approvedUWIssues(UnderWriterIssue.builder().UwIssueAlert(true).build());
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			pc.reviewPolicy(PolicyReview.builder(PersonalAutoConstants.PolicyReviewType.NONE).build());
			pc.viewQuote();
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(PersonalAutoConstants.Transactions.SUBMISSION);
			pc.approvedUWIssues(UnderWriterIssue.builder().build());
			pc.issuepolicy(PersonalAutoConstants.Transactions.SUBMISSION);
			pc.viewPolicy();

			pc.policyChange(PolicyChange.builder().date(testData.getDateOneMonthAhead()).build());
			
			pc.selectOfferings(Offerings.builder().build());

			pc.updatePolicyInfo(PolicyInfo.builder().build());

			pc.addNewDriver(Drivers.builder().usertype(UserType.NEW)
					.yearFirstLicensed(testData.getCurrentYear())
					.firstName(driverFirstName3)
					.lastName(driverLastName3)
					.dateOfBirth(testData.getDateOfBirth())
					.addressLineOne(testData.getAddressLine1())
					.state(testData.getState())
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType())
					.licenseNumber(testData.getLicenseNumber())
					.licenseState(testData.getState())
					.numberOfAccidentsPolicyLevel(testData.getRolesAccidentSummary())
					.numberOfAccidentsAccountLevel(testData.getRolesAccidentSummary())
					.numberOfViolationsPolicyLevel(testData.getRolesAccidentSummary())
					.numberOfViolationsAccountLevel(testData.getRolesAccidentSummary())
					.exclude(true)
					.rdbExclude(PersonalAutoConstants.RadioButton.YES).build());

			pc.addVehicle(Vehicles.builder(PersonalAutoConstants.UserType.EXISTING)
					.cost(DataFakers.costOfVehicle()).build());
			pc.addPACoverage(PACoverage.builder().build());
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			pc.reviewPolicy(PolicyReview.builder(PolicyReviewType.NONE).build());
			pc.approvedUWIssues(UnderWriterIssue.builder().UwIssueAlert(true).build());
			pc.reviewPolicy(PolicyReview.builder(PolicyReviewType.NONE).build());
			pc.issuepolicy(PersonalAutoConstants.Transactions.POLICY_CHANGE);
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
	 * @author Manikandan.Manohar
	 * @param browser
	 * @throws Exception
	 */
	@Test(description = "Verify whether user able to Quote and Issue the Personal Auto Policy with multiple drivers(Rated & Excluded)", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC32(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("GWTestData_DataEngine.xlsx", "PersonalAuto", "TC32");
		Log.testCaseInfo("Verify whether user able to Quote and Issue the Personal Auto Policy with multiple drivers(Rated & Excluded)");
	
		String firstName = testData.setFirstName();
		String lastName = testData.setLastName();
		String driverFirstName1 = testData.setFirstName();
		String driverLastName1 = testData.setLastName();
		String driverFirstName2 = testData.setFirstName();
		String driverLastName2 = testData.setLastName();

		try {
			PersonalAutoStepsImpl pc = PersonalAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchAccount(EnterAccountInformation.builder()
					.firstName(firstName)
					.lastName(lastName).build());

			pc.createAccount(CreateNewAccountFromPerson.builder()
					.firstName(firstName)
					.lastName(lastName)
					.addressLine1(testData.getAddressLine1())
					.state(testData.getState())
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType()).organization(testData.getProducerOrganization())
					.build());

			pc.selectProduct(PersonalAutoConstants.ProductNames.PERSONAL_AUTO);

			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());

			pc.selectQualifications(Qualification.builder().build());

			pc.updatePolicyInfo(PolicyInfo.builder().policyEffectiveDate(testData.getCurrentDate())
					.policyTerm(testData.getPolicyTerm()).build()); 

			pc.addNewDriver(Drivers.builder().usertype(UserType.NEW)
					.yearFirstLicensed(testData.getCurrentYear())
					.firstName(driverFirstName1)
					.lastName(driverLastName1)
					.dateOfBirth(testData.getDateOfBirth())
					.addressLineOne(testData.getAddressLine1())
					.state(testData.getState())
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType())
					.licenseNumber(testData.getLicenseNumber())
					.licenseState(testData.getState())
					.numberOfAccidentsPolicyLevel(testData.getRolesAccidentSummary())
					.numberOfAccidentsAccountLevel(testData.getRolesAccidentSummary())
					.numberOfViolationsPolicyLevel(testData.getRolesAccidentSummary())
					.numberOfViolationsAccountLevel(testData.getRolesAccidentSummary())
					.goodStudent(true)
					.rdbGoodStudent(PersonalAutoConstants.RadioButton.YES)
					.applyGoodDriverDiscount(true)
					.rdbApplyGoodDriverDiscount(PersonalAutoConstants.RadioButton.YES)
					.qualifiesForGoodDriverDiscount(true)
					.rdbQualifiesForGoodDriverDiscount(PersonalAutoConstants.RadioButton.YES)
					.build());

			pc.addVehicle(Vehicles.builder(PersonalAutoConstants.UserType.NEW)
					.vehicleType(testData.getVehicleType()).state(testData.getState())
					.cost(testData.getCostOfVehicle())
					.VIN(testData.getVIN()).build());

			pc.addNewDriver(Drivers.builder().usertype(UserType.NEW)
					.yearFirstLicensed(testData.getCurrentYear())
					.firstName(driverFirstName2)
					.lastName(driverLastName2)
					.dateOfBirth(testData.getDateOfBirth())
					.addressLineOne(testData.getAddressLine1())
					.state(testData.getState())
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType())
					.licenseNumber(testData.getLicenseNumber())
					.licenseState(testData.getState())
					.numberOfAccidentsPolicyLevel(testData.getRolesAccidentSummary())
					.numberOfAccidentsAccountLevel(testData.getRolesAccidentSummary())
					.numberOfViolationsPolicyLevel(testData.getRolesAccidentSummary())
					.numberOfViolationsAccountLevel(testData.getRolesAccidentSummary())
					.exclude(true)
					.rdbExclude(PersonalAutoConstants.RadioButton.YES).build());

			pc.addVehicle(Vehicles.builder(PersonalAutoConstants.UserType.NONE)
					.build());

			pc.addPACoverage(PACoverage.builder().build());
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			pc.reviewPolicy(PolicyReview.builder(PersonalAutoConstants.PolicyReviewType.NONE).build());
			pc.approvedUWIssues(UnderWriterIssue.builder().UwIssueAlert(true).build());
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			pc.reviewPolicy(PolicyReview.builder(PersonalAutoConstants.PolicyReviewType.NONE).build());
			pc.viewQuote();
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(PersonalAutoConstants.Transactions.SUBMISSION);
			pc.approvedUWIssues(UnderWriterIssue.builder().build());
			pc.issuepolicy(PersonalAutoConstants.Transactions.SUBMISSION);
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
	 * @author seetha.varanasi
	 * @param browser
	 * @throws Exception
	 */
	@Test(description = "Verify whether user able to Quote and Issue when Personal Vehicle multiple Additional Interests with different Interest type is added in the Personal Auto Policy", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC48(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("GWTestData_DataEngine.xlsx", "PersonalAuto", "TC48");
		Log.testCaseInfo("Verify whether user able to Quote and Issue when Personal Vehicle multiple Additional Interests with different Interest type is added in the Personal Auto Policy");
		String insuredFirstName1 = DataFakers.firstName();
		String insuredLastName1 = DataFakers.lastName();
		String insuredFirstName2 = DataFakers.firstName();
		String insuredLastName2 = DataFakers.lastName();
		String insuredperson1 = new StringBuilder().append(insuredFirstName1).append(" ").append(insuredLastName1)
				.toString();
		String insuredperson2 = new StringBuilder().append(insuredFirstName2).append(" ").append(insuredLastName2)
				.toString();
		
		try {
			PersonalAutoStepsImpl pc = PersonalAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchAccount(EnterAccountInformation.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName()).build());

			pc.createAccount(CreateNewAccountFromPerson.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.addressLine1(testData.getAddressLine1())
					.state(testData.getState())
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType()).organization(testData.getProducerOrganization())
					.build());

			pc.selectProduct(PersonalAutoConstants.ProductNames.PERSONAL_AUTO);

			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());

			pc.selectQualifications(Qualification.builder().build());

			pc.updatePolicyInfo(PolicyInfo.builder().policyEffectiveDate(testData.getCurrentDate())
					.policyTerm(testData.getPolicyTerm()).addAdditionalInsured(true)
					.createInsured(CreateNewAccountFromPerson.builder().addAdditionalInsured(true)
							.firstName(insuredFirstName1).lastName(insuredLastName1)
							.addressLine1(testData.getAddressLine1())
							.state(testData.getState())
							.city(testData.getCity())
							.zipCode(testData.getZipcode())
							.addressType(testData.getAddressType()).build())
					.build());

			pc.updatePolicyInfo(PolicyInfo.builder().policyEffectiveDate(DataFakers.currentDate())
					.policyTerm(testData.getPolicyTerm()).addAdditionalInsured(true)
					.createInsured(CreateNewAccountFromPerson.builder().addAdditionalInsured(true)
							.firstName(insuredFirstName2).lastName(insuredLastName2)
							.addressLine1(testData.getAddressLine1())
							.state(testData.getState())
							.city(testData.getCity())
							.zipCode(testData.getZipcode())
							.addressType(testData.getAddressType()).build())
					.build());

			pc.addNewDriver(Drivers.builder().usertype(UserType.NEW).yearFirstLicensed(testData.getCurrentYear())
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.dateOfBirth(testData.getDateOfBirth())
					.addressLineOne(testData.getAddressLine1())
					.state(testData.getState())
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType())
					.licenseNumber(testData.getLicenseNumber())
					.licenseState(testData.getState())
					.numberOfAccidentsPolicyLevel(testData.getRolesAccidentSummary())
					.numberOfAccidentsAccountLevel(testData.getRolesAccidentSummary())
					.numberOfViolationsPolicyLevel(testData.getRolesAccidentSummary())
					.numberOfViolationsAccountLevel(testData.getRolesAccidentSummary()).build());

			pc.addVehicle(Vehicles.builder(PersonalAutoConstants.UserType.NEW)
					.vehicleType(testData.getVehicleType()).state(testData.getState())
					.cost(testData.getCostOfVehicle())
					.VIN(testData.getVIN()).build());

			pc.addAdditionalInterestInVehicles(AdditionalInterestFromOtherContacts.builder().insuredName(insuredperson1)
					.interestType1(PersonalAutoConstants.InterestType.LOSS_PAYEE).build());

			pc.addAdditionalInterestInVehicles(AdditionalInterestFromOtherContacts.builder().insuredName(insuredperson2)
					.interestType2(PersonalAutoConstants.InterestType.LESSOR).build());

			pc.addPACoverage(PACoverage.builder().build());

			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			pc.reviewPolicy(PolicyReview.builder(PersonalAutoConstants.PolicyReviewType.NONE).build());
			pc.viewQuote();
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(PersonalAutoConstants.Transactions.SUBMISSION);
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
	@Test(description = "Verify whether user able to Quote and Issue when Personal Vehicle multiple Additional Interests with similar Interest type is added in the Personal Auto Policy", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC47(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("GWTestData_DataEngine.xlsx", "PersonalAuto", "TC47");
		Log.testCaseInfo("Verify whether user able to Quote and Issue when Personal Vehicle multiple Additional Interests with similar Interest type is added in the Personal Auto Policy");
	
		try {
			PersonalAutoStepsImpl pc = PersonalAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchAccount(EnterAccountInformation.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName()).build());

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

			pc.selectProduct(PersonalAutoConstants.ProductNames.PERSONAL_AUTO);

			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());

			pc.selectQualifications(Qualification.builder().build());

			pc.updatePolicyInfo(PolicyInfo.builder().policyEffectiveDate(testData.getCurrentDate())
					.policyTerm(testData.getPolicyTerm())
					.createInsured(CreateNewAccountFromPerson.builder().firstName(testData.getFirstName())
							.lastName(testData.getLastName())
							.addressLine1(testData.getAddressLine1())
							.state(testData.getState())
							.city(testData.getCity())
							.zipCode(testData.getZipcode())
							.addressType(testData.getAddressType()).build())
					.build());

			pc.addNewDriver(Drivers.builder().usertype(UserType.NEW).yearFirstLicensed(testData.getCurrentYear())
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.dateOfBirth(testData.getDateOfBirth())
					.addressLineOne(testData.getAddressLine1())
					.state(testData.getState())
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType())
					.licenseNumber(testData.getLicenseNumber())
					.licenseState(testData.getState())
					.numberOfAccidentsPolicyLevel(testData.getRolesAccidentSummary())
					.numberOfAccidentsAccountLevel(testData.getRolesAccidentSummary())
					.numberOfViolationsPolicyLevel(testData.getRolesAccidentSummary())
					.numberOfViolationsAccountLevel(testData.getRolesAccidentSummary()).build());

			pc.addVehicle(Vehicles.builder(PersonalAutoConstants.UserType.NEW)
					.vehicleType(testData.getVehicleType()).state(testData.getState())
					.cost(testData.getCostOfVehicle())
					.VIN(testData.getVIN()).build());

			pc.addAdditionalInterestInVehicles(AdditionalInterestFromPerson.builder()
					.interestType(PersonalAutoConstants.InterestType.LOSS_PAYEE).firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.addressLine1(testData.getAddressLine1())
					.state(testData.getState())
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType()).build());

			pc.addAdditionalInterestInVehicles(AdditionalInterestFromPerson.builder()
					.interestType(PersonalAutoConstants.InterestType.LOSS_PAYEE).firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.addressLine1(testData.getAddressLine1())
					.state(testData.getState())
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType()).build());

			pc.addPACoverage(PACoverage.builder().build());

			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			pc.reviewPolicy(PolicyReview.builder(PersonalAutoConstants.PolicyReviewType.NONE).build());
			pc.viewQuote();
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(PersonalAutoConstants.Transactions.SUBMISSION);
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
	 * @author seetha.varanasi
	 * @param browser
	 * @throws Exception
	 */
	@Test(description = "Verify whether user able to Quote and Issue when Additional Insurer added as Additional Interests in the Personal Auto Policy", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC46(String browser) throws Exception {
		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("GWTestData_DataEngine.xlsx", "PersonalAuto", "TC46");
		Log.testCaseInfo("Verify whether user able to Quote and Issue when Additional Insurer added as Additional Interests in the Personal Auto Policy");
		String insuredFirstName = DataFakers.firstName();
		String insuredLastName = DataFakers.firstName();
		String insuredperson = new StringBuilder().append(insuredFirstName).append(" ").append(insuredLastName).toString();
		
		try {
			PersonalAutoStepsImpl pc = PersonalAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchAccount(EnterAccountInformation.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName()).build());

			pc.createAccount(CreateNewAccountFromPerson.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.addressLine1(testData.getAddressLine1())
					.state(testData.getState())
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType()).organization(testData.getProducerOrganization())
					.build());

			pc.selectProduct(PersonalAutoConstants.ProductNames.PERSONAL_AUTO);

			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());

			pc.selectQualifications(Qualification.builder().build());

			pc.updatePolicyInfo(PolicyInfo.builder().policyEffectiveDate(testData.getCurrentDate())
					.policyTerm(testData.getPolicyTerm()).addAdditionalInsured(true)
					.createInsured(CreateNewAccountFromPerson.builder().addAdditionalInsured(true)
							.firstName(insuredFirstName).lastName(insuredLastName)
							.addressLine1(testData.getAddressLine1())
							.state(testData.getState())
							.city(testData.getCity())
							.zipCode(testData.getZipcode())
							.addressType(testData.getAddressType()).build())
					.build());

			pc.addNewDriver(Drivers.builder().usertype(UserType.NEW).yearFirstLicensed(testData.getCurrentYear())
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.dateOfBirth(testData.getDateOfBirth())
					.addressLineOne(testData.getAddressLine1())
					.state(testData.getState())
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType())
					.licenseNumber(testData.getLicenseNumber())
					.licenseState(testData.getState())
					.numberOfAccidentsPolicyLevel(testData.getRolesAccidentSummary())
					.numberOfAccidentsAccountLevel(testData.getRolesAccidentSummary())
					.numberOfViolationsPolicyLevel(testData.getRolesAccidentSummary())
					.numberOfViolationsAccountLevel(testData.getRolesAccidentSummary()).build());

			pc.addVehicle(Vehicles.builder(PersonalAutoConstants.UserType.NEW)
					.vehicleType(testData.getVehicleType())
					.state(testData.getState())
					.cost(testData.getCostOfVehicle())
					.VIN(testData.getVIN()).build());

			pc.addAdditionalInterestInVehicles(AdditionalInterestFromOtherContacts.builder().insuredName(insuredperson)
					.interestType1(PersonalAutoConstants.InterestType.LOSS_PAYEE).build());

			pc.addPACoverage(PACoverage.builder().build());

			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			pc.reviewPolicy(PolicyReview.builder(PersonalAutoConstants.PolicyReviewType.NONE).build());
			pc.viewQuote();
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(PersonalAutoConstants.Transactions.SUBMISSION);
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
	 * @author Manikandan.Manohar 
	 * Test Description : Verify whether user able to Quote and Issue the Personal Auto Policy with condition of DL state is differ from policy base state
	 * @param browser
	 * @throws Exception
	 */
	@Test(description = "Verify whether user able to Quote and Issue the Personal Auto Policy with condition of DL state is differ from policy base state", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC33(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("GWTestData_DataEngine.xlsx", "PersonalAuto", "TC33");
		Log.testCaseInfo("Verify whether user able to Quote and Issue the Personal Auto Policy with condition of DL state is differ from policy base state");
		String driverStateMismatchError = errorMessagesProperty.getProperty("driver_state_mismatch_error");
		String driverFirstName = DataFakers.firstName();
		String driverLastName = DataFakers.lastName();
		String state = State.ARIZONA.getName();
		String licenseState = State.CALIFORNIA.getName();
		String licenseStateShortcut = "CA";
		driverStateMismatchError = driverStateMismatchError.replaceAll("<FNAME>", driverFirstName);
		driverStateMismatchError = driverStateMismatchError.replaceAll("<LNAME>", driverLastName);
		driverStateMismatchError = driverStateMismatchError.replaceAll("<LSTATE>", licenseStateShortcut);
		driverStateMismatchError = driverStateMismatchError.replaceAll("<PSTATE>", state);
		
		try {
			PersonalAutoStepsImpl pc = PersonalAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchAccount(EnterAccountInformation.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName()).build());

			pc.createAccount(CreateNewAccountFromPerson.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.addressLine1(testData.getAddressLine1())
					.state(testData.getState())
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType()).organization(testData.getProducerOrganization())
					.build());

			pc.selectProduct(PersonalAutoConstants.ProductNames.PERSONAL_AUTO);

			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());

			pc.selectQualifications(Qualification.builder().build());

			pc.updatePolicyInfo(PolicyInfo.builder().policyEffectiveDate(testData.getCurrentDate())
					.policyTerm(testData.getPolicyTerm()).build()); 

			pc.addNewDriver(Drivers.builder().usertype(UserType.NEW).yearFirstLicensed(testData.getCurrentYear())
					.firstName(driverFirstName).lastName(driverLastName).dateOfBirth(testData.getDateOfBirth())
					.addressLineOne(testData.getAddressLine1()).state(state).city(testData.getCity())
					.zipCode(DataFakers.zipCode()).addressType(testData.getAddressType())
					.licenseNumber(testData.getLicenseNumber()).licenseState(licenseState)
					.numberOfAccidentsPolicyLevel(testData.getRolesAccidentSummary())
					.numberOfAccidentsAccountLevel(testData.getRolesAccidentSummary())
					.numberOfViolationsPolicyLevel(testData.getRolesAccidentSummary())
					.numberOfViolationsAccountLevel(testData.getRolesAccidentSummary()).build());

			pc.verifyErrorMessage(driverStateMismatchError);

			pc.addNewDriver(Drivers.builder().usertype(UserType.UPDATE).licenseState(testData.getState()).build());
			
			pc.addVehicle(Vehicles.builder(PersonalAutoConstants.UserType.NEW)
					.vehicleType(testData.getVehicleType()).state(licenseState)
					.cost(testData.getCostOfVehicle())
					.VIN(testData.getVIN()).build());

			pc.addPACoverage(PACoverage.builder().build());
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			pc.reviewPolicy(PolicyReview.builder(PersonalAutoConstants.PolicyReviewType.NONE).build());
			pc.viewQuote();
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(PersonalAutoConstants.Transactions.SUBMISSION);
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
	 * @author Manikandan.Manohar
	 * @param browser
	 * @throws Exception
	 */
	@Test(description = "Create a Personal Auto Policy and able to Quote and Issue the Rewrite new term  Transaction for the Policy after pro rata cancellation", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC20(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("Create a Personal Auto Policy and able to Quote and Issue the Rewrite new term  Transaction for the Policy after pro rata cancellation");
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("GWTestData_DataEngine.xlsx", "PersonalAuto", "TC20");
		
		try {
			PersonalAutoStepsImpl pc = PersonalAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

            pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());
			
			pc.copySubmissions();
			
			pc.viewPolicy();
			
			pc.cancelPolicy(CancellationSource.builder().source(testData.getSource())
					.reason(testData.getCancellationReason()).build());
			pc.viewPolicy();
			pc.policyRewriteNewTerm();
			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());
			pc.updatePolicyInfo(PolicyInfo.builder().build());
			pc.addNewDriver(Drivers.builder().usertype(UserType.NONE).build());
			pc.addVehicle(Vehicles.builder(PersonalAutoConstants.UserType.NONE).build());
			pc.addPACoverage(PACoverage.builder().build());
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			pc.reviewPolicy(PolicyReview.builder(PersonalAutoConstants.PolicyReviewType.NONE).build());
			pc.viewQuote();
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(PersonalAutoConstants.Transactions.REWRITE_NEW_TERM);
			pc.approvedUWIssues(UnderWriterIssue.builder().build());
			pc.issuepolicy(PersonalAutoConstants.Transactions.REWRITE_NEW_TERM);
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
	@Test(description="Upload a document in personal auto policy", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC266(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("Upload a document in personal auto policy",driver);
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("GWTestData_DataEngine.xlsx", "PersonalAuto", "TC266");

		try {	

			PersonalAutoStepsImpl pc = PersonalAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");
			
            pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());

			pc.uploadDocument(UploadDocument.builder()
					.documentType(testData.getDocumentType())
					.documentName(testData.getDocumentName())
					.status(testData.getStatus())
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
	@Test(description = "Validate whether all the Coverages are displayed in Ratings sheet which is added in the 'PA Coverages' screen in Personal Auto Policy", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC43(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("Validate whether all the Coverages are displayed in Ratings sheet which is added in the 'PA Coverages' screen in Personal Auto Policy",driver);
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("GWTestData_DataEngine.xlsx", "PersonalAuto", "TC43");

		try {
			PersonalAutoStepsImpl pc = PersonalAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchAccount(EnterAccountInformation.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName()).build());

			pc.createAccount(CreateNewAccountFromPerson.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.addressLine1(testData.getAddressLine1())
					.state(testData.getState())
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType()).organization(testData.getProducerOrganization())
					.build());

			pc.selectProduct(PersonalAutoConstants.ProductNames.PERSONAL_AUTO);

			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());

			pc.selectQualifications(Qualification.builder().build());

			pc.updatePolicyInfo(PolicyInfo.builder()
					.policyEffectiveDate(testData.getCurrentDate())
					.policyTerm(testData.getPolicyTerm())
					.build());

			pc.addNewDriver(Drivers.builder()
					.usertype(UserType.NEW)
					.yearFirstLicensed(testData.getCurrentYear())
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.dateOfBirth(testData.getDateOfBirth())
					.addressLineOne(testData.getAddressLine1())
					.state(testData.getState())
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType())
					.licenseNumber(testData.getLicenseNumber())
					.licenseState(testData.getState())
					.numberOfAccidentsPolicyLevel(testData.getRolesAccidentSummary())
					.numberOfAccidentsAccountLevel(testData.getRolesAccidentSummary())
					.numberOfViolationsPolicyLevel(testData.getRolesAccidentSummary())					
					.numberOfViolationsAccountLevel(testData.getRolesAccidentSummary()).build());
			
			pc.addVehicle(Vehicles.builder(PersonalAutoConstants.UserType.NEW)
					.vehicleType(testData.getVehicleType())
					.state(testData.getState())
					.cost(testData.getCostOfVehicle())
					.VIN(testData.getVIN()).build());

			pc.addPACoverage(PACoverage.builder().build());
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			pc.reviewPolicy(PolicyReview.builder(PersonalAutoConstants.PolicyReviewType.NONE).build());
			String effectiveDate = pc.getEffectiveDate();
			String expirationDate = pc.getExpirationDate();
			pc.viewShowRating(Rating.builder()
					.effectiveDate(effectiveDate)
					.expirationDate(expirationDate)
					.coverage1(testData.getCoverge1())
					.coverage2(testData.getCoverge2())
					.coverage3(testData.getCoverge3())
					.coverage4(testData.getCoverge4())
					.coverage5(testData.getCoverge5())
					.showRatingWorksheet(true)
					.factorVal(testData.getFactorVal())
					.vehicleTypeValue(testData.getVehicleTypeval())
					.uwValue(testData.getUwvalue())
					.multiCarDiscountValue(testData.getMultiCarDiscountVal())
					.fileName(testData.getFileName())
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
	@Test(description = "To verify the 'Out of Sequence transaction' for a personal auto policy", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC24(String browser) throws Exception {
		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("GWTestData_DataEngine.xlsx", "PersonalAuto", "TC24");
		Log.testCaseInfo("To verify the 'Out of Sequence transaction' for a personal auto policy", driver);

		try {
			PersonalAutoStepsImpl pc = PersonalAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");
			
            pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());
			
			pc.copySubmissions();

			pc.viewPolicy();

			pc.policyChange(PolicyChange.builder().date(testData.getDateOneMonthAhead()).build());
			pc.selectOfferings(Offerings.builder().build());
			pc.updatePolicyInfo(PolicyInfo.builder().build());
			pc.addNewDriver(Drivers.builder().usertype(UserType.NONE).build());
			pc.addVehicle(Vehicles.builder(PersonalAutoConstants.UserType.EXISTING)
					.cost(DataFakers.costOfVehicle()).build());

			pc.addPACoverage(PACoverage.builder().build());
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			pc.reviewPolicy(PolicyReview.builder(PolicyReviewType.NONE).build());
			pc.viewQuote();
			pc.viewForms();
			pc.issuepolicy(Transactions.POLICY_CHANGE);
			pc.viewPolicy();
			pc.policyChange(PolicyChange.builder().date(testData.getCurrentDate()).build());
			pc.verifyOutOfSequenceMessage(PolicyChange.builder().date(testData.getDateOneMonthAhead()).build());
			pc.selectOfferings(Offerings.builder().build());
			pc.verifyOutOfSequenceMessage(PolicyChange.builder().date(testData.getDateOneMonthAhead()).build());
			pc.updatePolicyInfo(PolicyInfo.builder().build());
			pc.verifyOutOfSequenceMessage(PolicyChange.builder().date(testData.getDateOneMonthAhead()).build());
			pc.addNewDriver(Drivers.builder().usertype(UserType.NONE).build());
			pc.verifyOutOfSequenceMessage(PolicyChange.builder().date(testData.getDateOneMonthAhead()).build());
			pc.addVehicle(Vehicles.builder(PersonalAutoConstants.UserType.EXISTING)
					.cost(DataFakers.costOfVehicle()).build());
			pc.verifyOutOfSequenceMessage(PolicyChange.builder().date(testData.getDateOneMonthAhead()).build());
			pc.addPACoverage(PACoverage.builder().build());
			pc.verifyOutOfSequenceMessage(PolicyChange.builder().date(testData.getDateOneMonthAhead()).build());
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			pc.verifyOutOfSequenceMessage(PolicyChange.builder().date(testData.getDateOneMonthAhead()).build());
			pc.reviewPolicy(PolicyReview.builder(PolicyReviewType.OUT_OF_SEQUENCE).build());
			pc.verifyOutOfSequenceMessage(PolicyChange.builder().date(testData.getDateOneMonthAhead()).build());
			pc.viewQuote();
			pc.viewForms();
			pc.issuepolicy(Transactions.POLICY_CHANGE);
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
	 * @author anitha.raphel
	 * @param browser
	 * @throws Exception
	 */
	@Test(description = "Resolve the contingency for Personal Auto policy by uploading required documents and resolved the policy", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC312(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("Resolve the contingency for Personal Auto policy by uploading required documents and resolved the policy", driver);
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("GWTestData_DataEngine.xlsx", "PersonalAuto", "TC312");

		try {

			PersonalAutoStepsImpl pc = PersonalAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchAccount(EnterAccountInformation.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName()).build());

			pc.createAccount(CreateNewAccountFromPerson.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.addressLine1(testData.getAddressLine1())
					.state(testData.getState())
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType()).organization(testData.getProducerOrganization())
					.build());

			pc.selectProduct(PersonalAutoConstants.ProductNames.PERSONAL_AUTO);

			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());

			pc.selectQualifications(Qualification.builder().build());

			pc.updatePolicyInfo(PolicyInfo.builder().policyEffectiveDate(testData.getCurrentDate())
					.policyTerm(testData.getPolicyTerm()).build()); 

			pc.addNewDriver(Drivers.builder().usertype(UserType.NEW).yearFirstLicensed(testData.getCurrentYear())
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.dateOfBirth(testData.getDateOfBirth())
					.addressLineOne(testData.getAddressLine1())
					.state(testData.getState())
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType())
					.licenseNumber(testData.getLicenseNumber())
					.licenseState(testData.getState())
					.numberOfAccidentsPolicyLevel(testData.getRolesAccidentSummary())
					.numberOfAccidentsAccountLevel(testData.getRolesAccidentSummary())
					.numberOfViolationsPolicyLevel(testData.getRolesAccidentSummary())
					.numberOfViolationsAccountLevel(testData.getRolesAccidentSummary()).build());

			pc.addVehicle(Vehicles.builder(PersonalAutoConstants.UserType.NEW)
					.vehicleType(testData.getVehicleType())
					.state(testData.getState())
					.cost(testData.getCostOfVehicle())
					.VIN(testData.getVIN()).build());

			pc.addPACoverage(PACoverage.builder().build());
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.CONTINGENCY).contingencyTitle(testData.getText())
					.contingencyDescription(testData.getText())
					.contingencyAction(testData.getContingencyAction())
					.contingencyDueDate(DataFakers.dateOneMonthAhead()).build());
			pc.reviewPolicy(PolicyReview.builder(PersonalAutoConstants.PolicyReviewType.NONE).build());
			pc.viewQuote();
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(PersonalAutoConstants.Transactions.SUBMISSION);
			pc.viewPolicy();
			pc.completedPolicyTransactions();
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.ATTACH_DOCUMENT_CONTINGENCY_RESOLVE)
					.documentName(testData.getDocumentName())
					.contingencyDocumentStatus(testData.getStatus()).
					contingencyDocumentType(testData.getContingencyDocumentType()).build());
			Log.testCaseResult(driver);

		} catch (Exception e) {
			Log.exception(e, DriverManager.getDriver());
		} finally {
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}

	/**
	 * @author anitha.raphel
	 * @param browser
	 * @throws Exception
	 */
	@Test(description = "Check whether the user is able to upload the required document for a contingency for personal auto policy.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC334(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("Check whether the user is able to upload the required document for a contingency for personal auto policy.", driver);
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("GWTestData_DataEngine.xlsx", "PersonalAuto", "TC334");

		try {

			PersonalAutoStepsImpl pc = PersonalAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchAccount(EnterAccountInformation.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName()).build());

			pc.createAccount(CreateNewAccountFromPerson.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.addressLine1(testData.getAddressLine1())
					.state(testData.getState())
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType()).organization(testData.getProducerOrganization())
					.build());

			pc.selectProduct(PersonalAutoConstants.ProductNames.PERSONAL_AUTO);

			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());

			pc.selectQualifications(Qualification.builder().build());

			pc.updatePolicyInfo(PolicyInfo.builder().policyEffectiveDate(testData.getCurrentDate())
					.policyTerm(testData.getPolicyTerm()).build()); 

			pc.addNewDriver(Drivers.builder().usertype(UserType.NEW).yearFirstLicensed(testData.getCurrentYear())
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.dateOfBirth(testData.getDateOfBirth())
					.addressLineOne(testData.getAddressLine1())
					.state(testData.getState())
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType())
					.licenseNumber(testData.getLicenseNumber())
					.licenseState(testData.getState())
					.numberOfAccidentsPolicyLevel(testData.getRolesAccidentSummary())
					.numberOfAccidentsAccountLevel(testData.getRolesAccidentSummary())
					.numberOfViolationsPolicyLevel(testData.getRolesAccidentSummary())
					.numberOfViolationsAccountLevel(testData.getRolesAccidentSummary()).build());

			pc.addVehicle(Vehicles.builder(PersonalAutoConstants.UserType.NEW)
					.vehicleType(testData.getVehicleType())
					.state(testData.getState())
					.cost(testData.getCostOfVehicle())
					.VIN(testData.getVIN()).build());

			pc.addPACoverage(PACoverage.builder().build());
			
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.CONTINGENCY).contingencyTitle(testData.getText())
					.contingencyDescription(testData.getText())
					.contingencyAction(testData.getContingencyAction())
					.contingencyDueDate(testData.getDateOneMonthAhead()).build());
			pc.reviewPolicy(PolicyReview.builder(PersonalAutoConstants.PolicyReviewType.NONE).build());
			pc.viewQuote();
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(PersonalAutoConstants.Transactions.SUBMISSION);
			pc.viewPolicy();
			pc.completedPolicyTransactions();
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.ATTACH_DOCUMENT_CONTINGENCY)
					.documentName(testData.getDocumentName()).contingencyDocumentStatus(testData.getStatus()).
					contingencyDocumentType(testData.getContingencyDocumentType()).build());
			Log.testCaseResult(driver);

		} catch (Exception e) {
			Log.exception(e, DriverManager.getDriver());
		} finally {
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}

	/**
	 * @author anitha.raphel
	 * @param browser
	 * @throws Exception
	 */
	@Test(description = "Verify vintelligence integration for Personal Auto policy.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC270(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		PersonalAutoDataEngine testData = new PersonalAutoDataEngine("GWTestData_DataEngine.xlsx", "PersonalAuto", "TC270");
		Log.testCaseInfo("Verify vintelligence integration for Personal Auto policy.", driver);
		
		try {

			PersonalAutoStepsImpl pc = PersonalAutoSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchAccount(EnterAccountInformation.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName()).build());

			pc.createAccount(CreateNewAccountFromPerson.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.addressLine1(testData.getAddressLine1())
					.state(testData.getState())
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType()).organization(testData.getProducerOrganization())
					.build());

			pc.selectProduct(PersonalAutoConstants.ProductNames.PERSONAL_AUTO);

			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());

			pc.selectQualifications(Qualification.builder().build());

			pc.updatePolicyInfo(PolicyInfo.builder().policyEffectiveDate(testData.getCurrentDate())
					.policyTerm(testData.getPolicyTerm()).build()); 

			pc.addNewDriver(Drivers.builder().usertype(UserType.NEW).yearFirstLicensed(testData.getCurrentYear())
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.dateOfBirth(testData.getDateOfBirth())
					.addressLineOne(testData.getAddressLine1())
					.state(testData.getState())
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType())
					.licenseNumber(testData.getLicenseNumber())
					.licenseState(testData.getState())
					.numberOfAccidentsPolicyLevel(testData.getRolesAccidentSummary())
					.numberOfAccidentsAccountLevel(testData.getRolesAccidentSummary())
					.numberOfViolationsPolicyLevel(testData.getRolesAccidentSummary())
					.numberOfViolationsAccountLevel(testData.getRolesAccidentSummary()).build());

			pc.addVehicle(Vehicles.builder(PersonalAutoConstants.UserType.NEW)
					.vintelligence(true)//Used to verify the Model year,Make,model Color fields auto population
					.vehicleType(testData.getVehicleType())
					.state(testData.getState())
					.cost(testData.getCostOfVehicle())
					.VIN(testData.getVIN()).build());

			pc.addPACoverage(PACoverage.builder().build());
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			pc.reviewPolicy(PolicyReview.builder(PersonalAutoConstants.PolicyReviewType.NONE).build());
			pc.viewQuote();
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(PersonalAutoConstants.Transactions.SUBMISSION);
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