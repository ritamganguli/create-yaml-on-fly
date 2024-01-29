package com.aspire.guidewire.pc.testscripts;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aspire.guidewire.pc.teststeps.generalliability.DataFakers;
import com.aspire.guidewire.pc.teststeps.generalliability.GeneralLiabilityConstants;
import com.aspire.guidewire.pc.teststeps.generalliability.GeneralLiabilityDataEngine;
import com.aspire.guidewire.pc.teststeps.generalliability.GeneralLiabilityFeatures.AddLocationInfo;
import com.aspire.guidewire.pc.teststeps.generalliability.GeneralLiabilityFeatures.CancellationSource;
import com.aspire.guidewire.pc.teststeps.generalliability.GeneralLiabilityFeatures.CloseOptions;
import com.aspire.guidewire.pc.teststeps.generalliability.GeneralLiabilityFeatures.Coverages;
import com.aspire.guidewire.pc.teststeps.generalliability.GeneralLiabilityFeatures.CreateNewAccountFromPerson;
import com.aspire.guidewire.pc.teststeps.generalliability.GeneralLiabilityFeatures.EnterAccountInformation;
import com.aspire.guidewire.pc.teststeps.generalliability.GeneralLiabilityFeatures.Exposures;
import com.aspire.guidewire.pc.teststeps.generalliability.GeneralLiabilityFeatures.Offerings;
import com.aspire.guidewire.pc.teststeps.generalliability.GeneralLiabilityFeatures.Payments;
import com.aspire.guidewire.pc.teststeps.generalliability.GeneralLiabilityFeatures.PolicyChange;
import com.aspire.guidewire.pc.teststeps.generalliability.GeneralLiabilityFeatures.PolicyDetails;
import com.aspire.guidewire.pc.teststeps.generalliability.GeneralLiabilityFeatures.PolicyInfo;
import com.aspire.guidewire.pc.teststeps.generalliability.GeneralLiabilityFeatures.PolicyReview;
import com.aspire.guidewire.pc.teststeps.generalliability.GeneralLiabilityFeatures.PreRenewalDirection;
import com.aspire.guidewire.pc.teststeps.generalliability.GeneralLiabilityFeatures.Qualification;
import com.aspire.guidewire.pc.teststeps.generalliability.GeneralLiabilityFeatures.ReinstatementReason;
import com.aspire.guidewire.pc.teststeps.generalliability.GeneralLiabilityFeatures.RenewPolicy;
import com.aspire.guidewire.pc.teststeps.generalliability.GeneralLiabilityFeatures.RiskAnalysis;
import com.aspire.guidewire.pc.teststeps.generalliability.GeneralLiabilitySteps;
import com.aspire.guidewire.pc.teststeps.generalliability.GeneralLiabilityStepsImpl;
import com.aspire.guidewire.utils.DataProviderUtils;
import com.aspire.guidewire.utils.Log;
import com.aspire.guidewire.webdriverManager.DriverManager;


public class PC_GeneralLiabilitySuite  {

	String pCWebSite, browser, contentGraphqlURL, browseAllContentGraphqlURL, sheetName;

	protected static ThreadLocal<WebDriver> threadLocalDriver = new ThreadLocal<>();

	@BeforeTest(alwaysRun = true)
	public void init(ITestContext context) {
		pCWebSite = (System.getProperty("pCWebSite") != null ? System.getProperty("pCWebSite"): context.getCurrentXmlTest().getParameter("pCWebSite"));
		DriverManager.setPCWebsite(pCWebSite);
	}

	/**
	 * @author anitha.raphel
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Verify whether user able to Create a General Liability policy", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC116(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();

		Log.testCaseInfo("Verify whether user able to Create a General Liability policy", driver);
		GeneralLiabilityDataEngine testData = new GeneralLiabilityDataEngine("GWTestData_DataEngine.xlsx", "GeneralLiability", "TC116");

		try {	

			GeneralLiabilityStepsImpl pc = GeneralLiabilitySteps.create();

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

			pc.selectProduct(GeneralLiabilityConstants.ProductNames.GENERAL_LIABILITY);

			pc.selectOfferings(Offerings.builder().offering(testData.getOffering()).build());

			pc.selectQualifications(Qualification.builder().build());

			pc.updatePolicyInfo(PolicyInfo.builder()
					.organizationType(testData.getOrganizationType())
					.policyEffectiveDate(testData.getCurrentDate())
					.policyTerm(testData.getPolicyTerm())
					.build());

			pc.addLocation(AddLocationInfo.builder()
					.addressLine1(testData.getAddressLine1())
					.state(testData.getState()) 
					.city(testData.getCity())
					.zipCode(testData.getZipcode()).build());

			pc.addCoverage(Coverages.builder()
					.addAdditionalCoverage(true)
					.designatedPollutants(DataFakers.basis()).build());

			pc.addExposures(Exposures.builder()
					.basis(testData.getExposuresbasis())
					.code(testData.getClassCode()).build());

			pc.addModifiersDetails();

			pc.selectRiskAnalysis(RiskAnalysis.builder().build());
			pc.reviewPolicy(PolicyReview.builder(GeneralLiabilityConstants.PolicyReviewType.NONE).build());
			pc.viewQuote();
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(GeneralLiabilityConstants.Transactions.SUBMISSION);
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
	@Test(description="Verify whether user can able to make Policy change transaction for general liability policy", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC117(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();

		Log.testCaseInfo("Verify whether user can able to make Policy change transaction for general liability policy", driver);
		GeneralLiabilityDataEngine testData = new GeneralLiabilityDataEngine("GWTestData_DataEngine.xlsx", "GeneralLiability", "TC117");

		try {	

			GeneralLiabilityStepsImpl pc = GeneralLiabilitySteps.create();
			
			pc.loginIntoTheApplication("su", "gw");
			
			pc.searchPolicyNumber(PolicyDetails.builder()
					.policyNumber(testData.getPolicyNumber()).build());
			
			pc.copySubmissions();
			
			pc.viewPolicy();
			
			pc.policyChange(PolicyChange.builder().date(testData.getEffectiveDateOneMonthAhead()).build());
			pc.selectOfferings(Offerings.builder().offering(testData.getOffering()).build());
			pc.updatePolicyInfo(PolicyInfo.builder().next(true)
					.build());
			pc.addLocation(AddLocationInfo.builder().next(true).build());
			pc.addCoverage(Coverages.builder().next(true).build());
			pc.addExposures(Exposures.builder().next(true).build());
			pc.addModifiersDetails();
			pc.selectRiskAnalysis(RiskAnalysis.builder().build());
			pc.reviewPolicy(PolicyReview.builder(GeneralLiabilityConstants.PolicyReviewType.NONE).build());
			pc.issuepolicy(GeneralLiabilityConstants.Transactions.POLICY_CHANGE);
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
	@Test(description="Verify whether user can able to complete flat Policy cancellation transaction for general liability policy", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC118(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();

		Log.testCaseInfo("Verify whether user can able to complete flat Policy cancellation transaction for general liability policy",driver);
		GeneralLiabilityDataEngine testData = new GeneralLiabilityDataEngine("GWTestData_DataEngine.xlsx", "GeneralLiability", "TC118");

		try {	

			GeneralLiabilityStepsImpl pc = GeneralLiabilitySteps.create();
			
			pc.loginIntoTheApplication("su", "gw");
			
			pc.searchPolicyNumber(PolicyDetails.builder()
					.policyNumber(testData.getPolicyNumber()).build());
			
			pc.copySubmissions();
			
			pc.viewPolicy();
			
			pc.cancelPolicy(CancellationSource.builder()
					.source(testData.getCancellationSource())
					.reason(testData.getCancellationReason())
					.build());
			
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
	@Test(description="Verify whether user can able to complete a reinstatement transaction for general liability policy", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC119(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();

		Log.testCaseInfo("Verify whether user can able to complete a reinstatement transaction for general liability policy", driver);
		GeneralLiabilityDataEngine testData = new GeneralLiabilityDataEngine("GWTestData_DataEngine.xlsx", "GeneralLiability", "TC119");

		try {	

			GeneralLiabilityStepsImpl pc = GeneralLiabilitySteps.create();
			
			pc.loginIntoTheApplication("su", "gw");
			
			pc.searchPolicyNumber(PolicyDetails.builder()
					.policyNumber(testData.getPolicyNumber()).build());
			
			pc.copySubmissions();
			
			pc.viewPolicy();
			
			pc.cancelPolicy(CancellationSource.builder()
					.source(testData.getCancellationSource())
					.reason(testData.getCancellationReason())
					.build());
			
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
	@Test(description="Verify whether user can able to complete a Copy Submission Page transaction for general liability policy", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC120(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();

		Log.testCaseInfo("Verify whether user can able to complete a Copy Submission Page transaction for general liability policy", driver);
		GeneralLiabilityDataEngine testData = new GeneralLiabilityDataEngine("GWTestData_DataEngine.xlsx", "GeneralLiability", "TC120");

		try {	

			GeneralLiabilityStepsImpl pc = GeneralLiabilitySteps.create();
			
			pc.loginIntoTheApplication("su", "gw");

			pc.searchPolicyNumber(PolicyDetails.builder()
					.policyNumber(testData.getPolicyNumber()).build());
			pc.copySubmission();

			pc.selectOfferings(Offerings.builder().offering(testData.getOffering()).build());
			pc.selectQualifications(Qualification.builder().build());
			pc.updatePolicyInfo(PolicyInfo.builder().build());
			pc.addLocation(AddLocationInfo.builder().next(true).build());
			pc.addCoverage(Coverages.builder().next(true).build());
			pc.addExposures(Exposures.builder().next(true).build());
			pc.addModifiersDetails();
			pc.selectRiskAnalysis(RiskAnalysis.builder().build());

			pc.reviewPolicy(PolicyReview.builder(GeneralLiabilityConstants.PolicyReviewType.NONE).build());
			pc.viewQuote();
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(GeneralLiabilityConstants.Transactions.SUBMISSION);
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
	@Test(description="Verify whether user can able to complete pro rata Policy cancellation transaction for general liability policy", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC121(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();

		Log.testCaseInfo("Verify whether user can able to complete pro rata Policy cancellation transaction for general liability policy", driver);
		GeneralLiabilityDataEngine testData = new GeneralLiabilityDataEngine("GWTestData_DataEngine.xlsx", "GeneralLiability", "TC121");

		try {	

			GeneralLiabilityStepsImpl pc = GeneralLiabilitySteps.create();
			
			pc.loginIntoTheApplication("su", "gw");
			
			pc.searchPolicyNumber(PolicyDetails.builder()
					.policyNumber(testData.getPolicyNumber()).build());
			
			pc.copySubmissions();
			
			pc.viewPolicy();
			
			pc.cancelPolicy(CancellationSource.builder()
					.source(testData.getCancellationSource())
					.reason(testData.getCancellationReason())
					.build());

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
	@Test(description="Verify whether the Complete a rewrite full term transaction for general liability transaction.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC122(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();

		Log.testCaseInfo("Verify whether the Complete a rewrite full term transaction for general liability transaction.", driver);
		GeneralLiabilityDataEngine testData = new GeneralLiabilityDataEngine("GWTestData_DataEngine.xlsx", "GeneralLiability", "TC122");

		try {	

			GeneralLiabilityStepsImpl pc = GeneralLiabilitySteps.create();
			
			pc.loginIntoTheApplication("su", "gw");

			pc.searchPolicyNumber(PolicyDetails.builder()
					.policyNumber(testData.getPolicyNumber()).build());
			
			pc.copySubmissions();
			
			pc.viewPolicy();

			pc.cancelPolicy(CancellationSource.builder().source(testData.getCancellationSource())
					.reason(testData.getCancellationReason()).build());

			pc.viewPolicy();

			pc.policyRewriteFullTerm();

			pc.selectOfferings(Offerings.builder().offering(testData.getOffering()).build());
			pc.updatePolicyInfo(PolicyInfo.builder().build());
			pc.addLocation(AddLocationInfo.builder().next(true).build());
			pc.addCoverage(Coverages.builder().next(true).build());
			pc.addExposures(Exposures.builder().next(true).build());
			pc.addModifiersDetails();
			pc.selectRiskAnalysis(RiskAnalysis.builder().build());
			pc.reviewPolicy(PolicyReview.builder(GeneralLiabilityConstants.PolicyReviewType.NONE).build());
			pc.issuepolicy(GeneralLiabilityConstants.Transactions.REWRITE_FULL_TERM);
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
	@Test(description="Verify whether the Complete a renewal transaction for general liability policy.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC123(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();

		Log.testCaseInfo("Verify whether the Complete a renewal transaction for general liability policy.", driver);

		GeneralLiabilityDataEngine testData = new GeneralLiabilityDataEngine("GWTestData_DataEngine.xlsx", "GeneralLiability", "TC123");

		try {	

			GeneralLiabilityStepsImpl pc = GeneralLiabilitySteps.create();
			
			pc.loginIntoTheApplication("su", "gw");
			
			pc.searchPolicyNumber(PolicyDetails.builder()
					.policyNumber(testData.getPolicyNumber()).build());
			
			pc.copySubmissions();
			
			pc.viewPolicy();
			
			pc.policyRenew();
			pc.selectOfferings(Offerings.builder().offering(testData.getOffering()).build());
			pc.updatePolicyInfo(PolicyInfo.builder().next(true)	.build());
			pc.addLocation(	AddLocationInfo.builder().next(true).build());
			pc.addCoverage(Coverages.builder().next(true).build());
			pc.addExposures(Exposures.builder()	.next(true).build());
			pc.addModifiersDetails();
			pc.selectRiskAnalysis(RiskAnalysis.builder().build());
			pc.reviewPolicy(PolicyReview.builder(GeneralLiabilityConstants.PolicyReviewType.RENEW).build());
			pc.issuepolicy(GeneralLiabilityConstants.Transactions.RENEW_POLICY);
			
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
	@Test(description="Verify whether user can able to make 'Not taken' Submission transaction for General Liability policy.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC124(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();

		Log.testCaseInfo("Verify whether user can able to make 'Not taken' Submission transaction for General Liability policy.", driver);

		GeneralLiabilityDataEngine testData = new GeneralLiabilityDataEngine("GWTestData_DataEngine.xlsx", "GeneralLiability", "TC124");

		try {	

			GeneralLiabilityStepsImpl pc = GeneralLiabilitySteps.create();

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

			pc.selectProduct(GeneralLiabilityConstants.ProductNames.GENERAL_LIABILITY);

			pc.selectOfferings(Offerings.builder().offering(testData.getOffering()).build());

			pc.selectQualifications(Qualification.builder().build());

			pc.updatePolicyInfo(PolicyInfo.builder()
					.organizationType(testData.getOrganizationType())
					.policyEffectiveDate(testData.getCurrentDate())
					.policyTerm(testData.getPolicyTerm())
					.build());

			pc.addLocation(AddLocationInfo.builder()
					.addressLine1(testData.getAddressLine1())
					.state(testData.getState()) 
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.build());

			pc.addCoverage(Coverages.builder().next(true).build());

			pc.addExposures(Exposures.builder()
					.basis(testData.getExposuresbasis())
					.code(testData.getClassCode()).build());

			pc.addModifiersDetails();

			pc.selectRiskAnalysis(RiskAnalysis.builder().build());
			pc.reviewPolicy(PolicyReview.builder(GeneralLiabilityConstants.PolicyReviewType.NONE).build());
			pc.viewQuote();
			pc.viewForms();
			pc.policyCloseOptions(CloseOptions.builder(GeneralLiabilityConstants.CloseOptionType.NOT_TAKEN)
					.reasonNotTaken(testData.getNotTakenReason()).build());
			
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
	@Test(description="Verify whether user can able to Decline a general liability submission transaction.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC125(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();

		Log.testCaseInfo("Verify whether user can able to Decline a general liability submission transaction.", driver);

		GeneralLiabilityDataEngine testData = new GeneralLiabilityDataEngine("GWTestData_DataEngine.xlsx", "GeneralLiability", "TC125");

		try {	

			GeneralLiabilityStepsImpl pc = GeneralLiabilitySteps.create();

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

			pc.selectProduct(GeneralLiabilityConstants.ProductNames.GENERAL_LIABILITY);

			pc.selectOfferings(Offerings.builder().offering(testData.getOffering()).build());

			pc.selectQualifications(Qualification.builder().build());

			pc.updatePolicyInfo(PolicyInfo.builder()
					.organizationType(testData.getOrganizationType())
					.policyEffectiveDate(testData.getCurrentDate())
					.policyTerm(testData.getPolicyTerm())
					.build());

			pc.addLocation(AddLocationInfo.builder()
					.addressLine1(testData.getAddressLine1())
					.state(testData.getState()) 
					.city(testData.getCity())
					.zipCode(testData.getZipcode()).build());

			pc.addCoverage(Coverages.builder().next(true).build());

			pc.addExposures(Exposures.builder()
					.basis(testData.getExposuresbasis())
					.code(testData.getClassCode()).build());

			pc.addModifiersDetails();

			pc.selectRiskAnalysis(RiskAnalysis.builder().build());
			pc.reviewPolicy(PolicyReview.builder(GeneralLiabilityConstants.PolicyReviewType.NONE).build());
			pc.viewQuote();
			pc.viewForms();
			pc.policyCloseOptions(CloseOptions.builder(GeneralLiabilityConstants.CloseOptionType.DECLINE)
					.reasonDeclined(testData.getDeclinedReason()).build());
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
	@Test(description="Verify whether user can able to make Withdraw a general liability submission transaction.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC126(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();

		Log.testCaseInfo("Verify whether user can able to make Withdraw a general liability submission transaction.", driver);

		GeneralLiabilityDataEngine testData = new GeneralLiabilityDataEngine("GWTestData_DataEngine.xlsx", "GeneralLiability", "TC126");

		try {	

			GeneralLiabilityStepsImpl pc = GeneralLiabilitySteps.create();

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

			pc.selectProduct(GeneralLiabilityConstants.ProductNames.GENERAL_LIABILITY);

			pc.selectOfferings(Offerings.builder().offering(testData.getOffering()).build());

			pc.selectQualifications(Qualification.builder().build());

			pc.updatePolicyInfo(PolicyInfo.builder()
					.organizationType(testData.getOrganizationType())
					.policyEffectiveDate(testData.getCurrentDate())
					.policyTerm(testData.getPolicyTerm())
					.build());

			pc.addLocation(AddLocationInfo.builder()
					.addressLine1(testData.getAddressLine1())
					.state(testData.getState()) 
					.city(testData.getCity())
					.zipCode(testData.getZipcode()).build());

			pc.addCoverage(Coverages.builder().next(true).build());

			pc.addExposures(Exposures.builder()
					.basis(testData.getExposuresbasis())
					.code(testData.getClassCode())
					.build());

			pc.addModifiersDetails();

			pc.selectRiskAnalysis(RiskAnalysis.builder().build());
			pc.reviewPolicy(PolicyReview.builder(GeneralLiabilityConstants.PolicyReviewType.NONE).build());
			pc.viewQuote();
			pc.viewForms();
			pc.policyCloseOptions(CloseOptions.builder(GeneralLiabilityConstants.CloseOptionType.WITHDRAW_TRANSACTION).build());

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
	@Test(description="Verify whether the Complete an out of sequence transaction for general liability policy,", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC127(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();

		Log.testCaseInfo("Verify whether the Complete an out of sequence transaction for general liability policy,", driver);
		GeneralLiabilityDataEngine testData = new GeneralLiabilityDataEngine("GWTestData_DataEngine.xlsx", "GeneralLiability", "TC127");

		try {	

			GeneralLiabilityStepsImpl pc = GeneralLiabilitySteps.create();
			
			pc.loginIntoTheApplication("su", "gw");
			
			pc.searchPolicyNumber(PolicyDetails.builder()
					.policyNumber(testData.getPolicyNumber()).build());
			
			pc.copySubmissions();
			
			pc.viewPolicy();

			pc.policyChange(PolicyChange.builder().date(testData.getEffectiveDateOneMonthAhead()).build());

			pc.selectOfferings(Offerings.builder().offering(testData.getOffering()).build());
			pc.updatePolicyInfo(PolicyInfo.builder().next(true)
					.build());
			pc.addLocation(AddLocationInfo.builder().next(true).build());
			pc.addCoverage(Coverages.builder().next(true).build());
			pc.addExposures(Exposures.builder().next(true).build());
			pc.addModifiersDetails();
			pc.selectRiskAnalysis(RiskAnalysis.builder().build());
			pc.reviewPolicy(PolicyReview.builder(GeneralLiabilityConstants.PolicyReviewType.NONE).build());
			pc.issuepolicy(GeneralLiabilityConstants.Transactions.POLICY_CHANGE);
			pc.viewPolicy();

			//policyChange - Changing Effective Date to Current ahead 
			pc.policyChange(PolicyChange.builder().date(DataFakers.currentDate()).build());
			pc.verifyOutOfSequenceMessage(PolicyChange.builder()
					.date(testData.getEffectiveDateOneMonthAhead()).build());
			pc.selectOfferings(Offerings.builder().offering(testData.getOffering()).build());
			pc.verifyOutOfSequenceMessage(PolicyChange.builder()
					.date(testData.getEffectiveDateOneMonthAhead()).build());
			pc.updatePolicyInfo(PolicyInfo.builder().next(true)
					.build());
			pc.verifyOutOfSequenceMessage(PolicyChange.builder()
					.date(testData.getEffectiveDateOneMonthAhead()).build());
			pc.addLocation(AddLocationInfo.builder().next(true).build());
			pc.verifyOutOfSequenceMessage(PolicyChange.builder()
					.date(testData.getEffectiveDateOneMonthAhead()).build());
			pc.addCoverage(Coverages.builder().next(true).build());
			pc.verifyOutOfSequenceMessage(PolicyChange.builder()
					.date(testData.getEffectiveDateOneMonthAhead()).build());
			pc.addExposures(Exposures.builder().next(true).build());
			pc.verifyOutOfSequenceMessage(PolicyChange.builder()
					.date(testData.getEffectiveDateOneMonthAhead()).build());
			pc.addModifiersDetails();
			pc.verifyOutOfSequenceMessage(PolicyChange.builder()
					.date(testData.getEffectiveDateOneMonthAhead()).build());
			pc.selectRiskAnalysis(RiskAnalysis.builder().build());
			pc.verifyOutOfSequenceMessage(PolicyChange.builder()
					.date(testData.getEffectiveDateOneMonthAhead()).build());
			pc.reviewPolicy(PolicyReview.builder(GeneralLiabilityConstants.PolicyReviewType.NONE).build());
			pc.verifyOutOfSequenceMessage(PolicyChange.builder()
					.date(testData.getEffectiveDateOneMonthAhead()).build());
			
			pc.issuepolicy(GeneralLiabilityConstants.Transactions.POLICY_CHANGE);
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
	@Test(description="Verify whether the user able to Set pre renewal direction for a general liability policy.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC128(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();

		Log.testCaseInfo("Verify whether the user able to Set pre renewal direction for a general liability policy.", driver);
		GeneralLiabilityDataEngine testData = new GeneralLiabilityDataEngine("GWTestData_DataEngine.xlsx", "GeneralLiability", "TC128");

		try {	

			GeneralLiabilityStepsImpl pc = GeneralLiabilitySteps.create();
			
			pc.loginIntoTheApplication("su", "gw");
			
			pc.searchPolicyNumber(PolicyDetails.builder()
					.policyNumber(testData.getPolicyNumber()).build());

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
	 * @author anitha.raphel
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Verify whether User able to Create a general liability policy with 6 month term type.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC130(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();

		Log.testCaseInfo("Verify whether User able to Create a general liability policy with 6 month term type.", driver);
		GeneralLiabilityDataEngine testData = new GeneralLiabilityDataEngine("GWTestData_DataEngine.xlsx", "GeneralLiability", "TC130");

		try {	

			GeneralLiabilityStepsImpl pc = GeneralLiabilitySteps.create();

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

			pc.selectProduct(GeneralLiabilityConstants.ProductNames.GENERAL_LIABILITY);

			pc.selectOfferings(Offerings.builder().offering(testData.getOffering()).build());

			pc.selectQualifications(Qualification.builder().build());

			pc.updatePolicyInfo(PolicyInfo.builder()
					.organizationType(testData.getOrganizationType())
					.policyEffectiveDate(testData.getCurrentDate())
					.policyTerm(testData.getPolicyTerm())
					.build());
			
            pc.addLocation(AddLocationInfo.builder()
            		.addressLine1(testData.getAddressLine1())
            		.state(testData.getState()) 
            		.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.build());

			pc.addCoverage(Coverages.builder().next(true).build());

			pc.addExposures(Exposures.builder()
	            		.basis(testData.getExposuresbasis())
	            		.code(testData.getClassCode()).build());

			pc.addModifiersDetails();

			pc.selectRiskAnalysis(RiskAnalysis.builder().build());
			pc.reviewPolicy(PolicyReview.builder(GeneralLiabilityConstants.PolicyReviewType.NONE).build());
			pc.viewQuote();
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(GeneralLiabilityConstants.Transactions.SUBMISSION);
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