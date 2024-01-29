package com.aspire.guidewire.pc.testscripts;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aspire.guidewire.pc.teststeps.commercialproperty.ComercialPropertyConstants;
import com.aspire.guidewire.pc.teststeps.commercialproperty.ComercialPropertyConstants.PolicyReviewType;
import com.aspire.guidewire.pc.teststeps.commercialproperty.ComercialPropertyConstants.RiskAnalysisType;
import com.aspire.guidewire.pc.teststeps.commercialproperty.CommecialPropertySteps;
import com.aspire.guidewire.pc.teststeps.commercialproperty.CommercialPropertyDataEngine;
import com.aspire.guidewire.pc.teststeps.commercialproperty.CommercialPropertyFeatures.AddBuildingLocationDetails;
import com.aspire.guidewire.pc.teststeps.commercialproperty.CommercialPropertyFeatures.Blanket;
import com.aspire.guidewire.pc.teststeps.commercialproperty.CommercialPropertyFeatures.CancellationSource;
import com.aspire.guidewire.pc.teststeps.commercialproperty.CommercialPropertyFeatures.CreateNewAccountFromPerson;
import com.aspire.guidewire.pc.teststeps.commercialproperty.CommercialPropertyFeatures.EnterAccountInformation;
import com.aspire.guidewire.pc.teststeps.commercialproperty.CommercialPropertyFeatures.LocationInformation;
import com.aspire.guidewire.pc.teststeps.commercialproperty.CommercialPropertyFeatures.NewBuilding;
import com.aspire.guidewire.pc.teststeps.commercialproperty.CommercialPropertyFeatures.Payments;
import com.aspire.guidewire.pc.teststeps.commercialproperty.CommercialPropertyFeatures.PolicyChange;
import com.aspire.guidewire.pc.teststeps.commercialproperty.CommercialPropertyFeatures.PolicyDetails;
import com.aspire.guidewire.pc.teststeps.commercialproperty.CommercialPropertyFeatures.PolicyInfo;
import com.aspire.guidewire.pc.teststeps.commercialproperty.CommercialPropertyFeatures.PolicyReview;
import com.aspire.guidewire.pc.teststeps.commercialproperty.CommercialPropertyFeatures.PreRenewalDirection;
import com.aspire.guidewire.pc.teststeps.commercialproperty.CommercialPropertyFeatures.Quote;
import com.aspire.guidewire.pc.teststeps.commercialproperty.CommercialPropertyFeatures.Rating;
import com.aspire.guidewire.pc.teststeps.commercialproperty.CommercialPropertyFeatures.ReinstatementReason;
import com.aspire.guidewire.pc.teststeps.commercialproperty.CommercialPropertyFeatures.RenewPolicy;
import com.aspire.guidewire.pc.teststeps.commercialproperty.CommercialPropertyFeatures.RiskAnalysis;
import com.aspire.guidewire.pc.teststeps.commercialproperty.CommercialPropertyFeatures.UWIssueType;
import com.aspire.guidewire.pc.teststeps.commercialproperty.CommercialPropertyStepsImpl;
import com.aspire.guidewire.pc.teststeps.commercialproperty.DataFakers;
import com.aspire.guidewire.utils.DataProviderUtils;
import com.aspire.guidewire.utils.Log;
import com.aspire.guidewire.webdriverManager.DriverManager;


public class PC_CommercialPropertySuite  {

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
	 * Submission_NA
	 */
	@Test(description="Verify whether user is able to Create a commercial property policy with 'Other' term type.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC252(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialPropertyDataEngine testData = new CommercialPropertyDataEngine("GWTestData_DataEngine.xlsx", "CommercialProperty", "TC252");
		Log.testCaseInfo("Verify whether user is able to Create a commercial property policy with 'Other' term type.", driver);
		try {		

			CommercialPropertyStepsImpl pc = CommecialPropertySteps.create();

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

			pc.selectProduct(ComercialPropertyConstants.ProductNames.COMMERCIAL_PROPERTY);

			pc.updatePolicyInfo(PolicyInfo.builder()
					.organizationType(testData.getOrganizationType())
					.policyEffectiveDate(testData.getCurrentDate())
					.policyTerm(testData.getPolicyTerm())
					.build());		

			pc.addBuildingLocationDetails(AddBuildingLocationDetails.builder()
					.buildingMenuCount(1)
					.addBuildingCount(1)
					.addNewBuildingCount(1)
					.addBuildingsAndLocation(NewBuilding.builder()
							.propertyClassCode(testData.getClassCode())
							.incomeLimit(testData.getLimit())
							.coverageForm(testData.getCoverageForm())
							.build()).build());

			pc.addBlankets(Blanket.builder()
					.blanketType(testData.getBlanketType())
					.groupType(testData.getGroupType())
					.limit(testData.getLimit())
					.deductible(testData.getDeductible())
					.build());

			pc.addModifiersDetails();

			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());

			pc.reviewPolicy(PolicyReview.builder(ComercialPropertyConstants.PolicyReviewType.NONE).build());

			pc.viewQuote(Quote.builder().build());

			pc.viewForms();

			pc.selectPayments(Payments.builder()
					.billingMethod(testData.getBillingMethod())
					.paymentPlan(testData.getPaymentPlan())
					.build());

			pc.issuepolicy(ComercialPropertyConstants.Transactions.SUBMISSION);

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
	 * 
	 */
	@Test(description="Verify whether user is able to complete Flat policy cancellation transaction for commercial property policy.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC255(String browser)   throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialPropertyDataEngine testData = new CommercialPropertyDataEngine("GWTestData_DataEngine.xlsx", "CommercialProperty", "TC255");
		Log.testCaseInfo("Verify whether user is able to complete Flat policy cancellation transaction for commercial property policy.", driver);
		try {	

			CommercialPropertyStepsImpl pc = CommecialPropertySteps.create();

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
	 * @author anitha.raphel
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Verify whether user is able to complete policy cancellation transaction for commercial property policy.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC256(String browser)  throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialPropertyDataEngine testData = new CommercialPropertyDataEngine("GWTestData_DataEngine.xlsx", "CommercialProperty", "TC256");
		Log.testCaseInfo("Verify whether user is able to complete policy cancellation transaction for commercial property policy.", driver);

		try {	

			CommercialPropertyStepsImpl pc = CommecialPropertySteps.create();

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
	 * @author anitha.raphel
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Verify whether user able to do Pre-Renewal direction for the Commercial Property Policy ", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC264(String browser)   throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialPropertyDataEngine testData = new CommercialPropertyDataEngine("GWTestData_DataEngine.xlsx", "CommercialProperty", "TC264");
		Log.testCaseInfo("Verify whether user able to do Pre-Renewal direction for the Commercial Property Policy ", driver);
		try {	

			CommercialPropertyStepsImpl pc = CommecialPropertySteps.create();

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
	 * @author anitha.raphel
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Verify whether user is able to complete Copy Submission Page transaction for commercial property policy", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC254(String browser)  throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialPropertyDataEngine testData = new CommercialPropertyDataEngine("GWTestData_DataEngine.xlsx", "CommercialProperty", "TC254");
		Log.testCaseInfo("Verify whether user is able to complete Copy Submission Page transaction for commercial property policy", driver);
		try {	

			CommercialPropertyStepsImpl pc = CommecialPropertySteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());

			pc.copySubmission();

			pc.updatePolicyInfo(PolicyInfo.builder().build());

			pc.addBuildingLocationDetails(AddBuildingLocationDetails.builder().build());

			pc.addBlankets(Blanket.builder().build());

			pc.addModifiersDetails();

			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());

			pc.reviewPolicy(PolicyReview.builder(ComercialPropertyConstants.PolicyReviewType.NONE).build());

			pc.viewQuote(Quote.builder().build());

			pc.viewForms();

			pc.selectPayments(Payments.builder().build());

			pc.issuepolicy(ComercialPropertyConstants.Transactions.SUBMISSION);

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
	@Test(description="Verify whether user is able to complete policy Reinstatement transaction for commercial property policy.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC257(String browser)   throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialPropertyDataEngine testData = new CommercialPropertyDataEngine("GWTestData_DataEngine.xlsx", "CommercialProperty", "TC257");
		Log.testCaseInfo("Verify whether user is able to complete policy Reinstatement transaction for commercial property policy.", driver);
		try {	

			CommercialPropertyStepsImpl pc = CommecialPropertySteps.create();

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
	 * @author anitha.raphel
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Verify user able to complete Rewrite remainder of term transaction for commercial property policy.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC261(String browser)   throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialPropertyDataEngine testData = new CommercialPropertyDataEngine("GWTestData_DataEngine.xlsx", "CommercialProperty", "TC261");
		Log.testCaseInfo("Verify user able to complete Rewrite remainder of term transaction for commercial property policy.", driver);
		try {	

			CommercialPropertyStepsImpl pc = CommecialPropertySteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());

			pc.copySubmissions();

			pc.viewPolicy();

			pc.cancelPolicy(CancellationSource.builder().source(testData.getCancellationSource())
					.reason(testData.getCancellationReason()).build());

			pc.viewPolicy();

			pc.policyRewriteRemainderTerm();

			pc.updatePolicyInfo(PolicyInfo.builder().build());

			pc.addBuildingLocationDetails(AddBuildingLocationDetails.builder().build());

			pc.addBlankets(Blanket.builder().build());

			pc.addModifiersDetails();

			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());

			pc.reviewPolicy(PolicyReview.builder(ComercialPropertyConstants.PolicyReviewType.NONE).build());

			pc.viewQuote(Quote.builder().build());

			pc.viewForms();

			pc.selectPayments(Payments.builder().build());

			pc.issuepolicy(ComercialPropertyConstants.Transactions.REWRITE_REMAINDER_TERM);

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
	@Test(description="Verify user able to Rewrite full term transaction for commercial property policy.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC259(String browser)   throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("Verify user able to Rewrite full term transaction for commercial property policy.", driver);
		CommercialPropertyDataEngine testData = new CommercialPropertyDataEngine("GWTestData_DataEngine.xlsx", "CommercialProperty", "TC259");
		try {	

			CommercialPropertyStepsImpl pc = CommecialPropertySteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());

			pc.copySubmissions();

			pc.viewPolicy();  								

			pc.cancelPolicy(CancellationSource.builder().source(testData.getCancellationSource())
					.reason(testData.getCancellationReason()).build());

			pc.viewPolicy();

			pc.policyRewriteFullTerm();

			pc.updatePolicyInfo(PolicyInfo.builder().build());

			pc.addBuildingLocationDetails(AddBuildingLocationDetails.builder().build());

			pc.addBlankets(Blanket.builder().build());

			pc.addModifiersDetails();

			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());

			pc.reviewPolicy(PolicyReview.builder(ComercialPropertyConstants.PolicyReviewType.NONE).build());

			pc.viewQuote(Quote.builder().build());

			pc.viewForms();

			pc.selectPayments(Payments.builder().build());

			pc.issuepolicy(ComercialPropertyConstants.Transactions.REWRITE_FULL_TERM);

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
	@Test(description="Rewrite new term transaction for commercial property policy.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC260(String browser)   throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialPropertyDataEngine testData = new CommercialPropertyDataEngine("GWTestData_DataEngine.xlsx", "CommercialProperty", "TC260");
		Log.testCaseInfo("Rewrite new term transaction for commercial property policy.", driver);
		try {	

			CommercialPropertyStepsImpl pc = CommecialPropertySteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());

			pc.copySubmissions();

			pc.viewPolicy();

			pc.cancelPolicy(CancellationSource.builder().source(testData.getCancellationSource())
					.reason(testData.getCancellationReason()).build());

			pc.viewPolicy();

			pc.policyRewriteNewTerm();

			pc.updatePolicyInfo(PolicyInfo.builder().build());

			pc.addBuildingLocationDetails(AddBuildingLocationDetails.builder().build());

			pc.addBlankets(Blanket.builder().build());

			pc.addModifiersDetails();

			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());

			pc.reviewPolicy(PolicyReview.builder(ComercialPropertyConstants.PolicyReviewType.NONE).build());

			pc.viewQuote(Quote.builder().build());

			pc.viewForms();

			pc.selectPayments(Payments.builder().build());

			pc.issuepolicy(ComercialPropertyConstants.Transactions.REWRITE_NEW_TERM);

			pc.approveUWissue(UWIssueType.builder().build());

			pc.issuepolicy(ComercialPropertyConstants.Transactions.REWRITE_NEW_TERM);

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
	@Test(description="Verify whether user is able to Renew a commercial property policy.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC262(String browser)   throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialPropertyDataEngine testData = new CommercialPropertyDataEngine("GWTestData_DataEngine.xlsx", "CommercialProperty", "TC262");
		Log.testCaseInfo("Verify whether user is able to Renew a commercial property policy.", driver);
		try {	

			CommercialPropertyStepsImpl pc = CommecialPropertySteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());

			pc.copySubmissions();			

			pc.viewPolicy();

			pc.policyRenew();

			pc.updatePolicyInfo(PolicyInfo.builder().build());

			pc.addBuildingLocationDetails(AddBuildingLocationDetails.builder().build());

			pc.addBlankets(Blanket.builder().build());

			pc.addModifiersDetails();

			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());

			pc.reviewPolicy(PolicyReview.builder(ComercialPropertyConstants.PolicyReviewType.RENEW).build());

			pc.viewQuote(Quote.builder().build());

			pc.viewForms();

			pc.issuepolicy(ComercialPropertyConstants.Transactions.RENEW_POLICY);

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
	 * @author anitha.raphel
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Verify whether user is able to Create a commercial property policy with more than one locations.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC253(String browser)   throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialPropertyDataEngine testData = new CommercialPropertyDataEngine("GWTestData_DataEngine.xlsx", "CommercialProperty", "TC253");
		Log.testCaseInfo("Verify whether user is able to Create a commercial property policy with more than one locations.", driver);
		try {	

			CommercialPropertyStepsImpl pc = CommecialPropertySteps.create();

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

			pc.selectProduct(ComercialPropertyConstants.ProductNames.COMMERCIAL_PROPERTY);

			pc.updatePolicyInfo(PolicyInfo.builder()
					.organizationType(testData.getOrganizationType())
					.policyEffectiveDate(testData.getCurrentDate())
					.policyTerm(testData.getPolicyTerm())
					.build());		

			pc.addBuildingLocationDetails(AddBuildingLocationDetails.builder()
					.buildingMenuCount(1)
					.addBuildingCount(1)
					.addNewBuildingCount(1)
					.addBuildingsAndLocation(NewBuilding.builder()
							.propertyClassCode(testData.getClassCode())
							.incomeLimit(testData.getLimit())
							.coverageForm(testData.getCoverageForm())
							.build()).build());

			pc.addBuildingLocationDetails(AddBuildingLocationDetails.builder()
					.addLocation(LocationInformation.builder()
							.addressLine1(testData.getAddressLine1())
							.state(testData.getState())
							.city(testData.getCity())
							.zipCode(testData.getZipcode())
							.build())
					.buildingMenuCount(2)
					.addBuildingCount(2)
					.addNewBuildingCount(2)
					.addBuildingsAndLocation(NewBuilding.builder()
							.propertyClassCode(testData.getClassCode())
							.incomeLimit(testData.getLimit())
							.coverageForm(testData.getCoverageForm())
							.build()).build());


			pc.addBlankets(Blanket.builder()
					.blanketType(testData.getBlanketType())
					.groupType(testData.getGroupType())
					.limit(testData.getLimit())
					.deductible(testData.getDeductible())
					.build());


			pc.addModifiersDetails();

			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());

			pc.reviewPolicy(PolicyReview.builder(ComercialPropertyConstants.PolicyReviewType.NONE).build());

			pc.viewQuote(Quote.builder().build());

			pc.viewForms();

			pc.selectPayments(Payments.builder().build());

			pc.issuepolicy(ComercialPropertyConstants.Transactions.SUBMISSION);

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
	@Test(description="Verify whether user able to create a commercial property policy with one or more additional insured person.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC251(String browser)   throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialPropertyDataEngine testData = new CommercialPropertyDataEngine("GWTestData_DataEngine.xlsx", "CommercialProperty", "TC251");
		Log.testCaseInfo("Verify whether user able to create a commercial property policy with one or more additional insured person.", driver);
		try {	

			CommercialPropertyStepsImpl pc = CommecialPropertySteps.create();

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

			pc.selectProduct(ComercialPropertyConstants.ProductNames.COMMERCIAL_PROPERTY);

			pc.updatePolicyInfo(PolicyInfo.builder().organizationType(testData.getOrganizationType())
					.policyEffectiveDate(testData.getCurrentDate())
					.policyTerm(testData.getPolicyTerm())
					.addAdditionalInsured(true)
					.createInsured(CreateNewAccountFromPerson.builder()
							.addAdditionalInsured(true)
							.firstName(testData.getFirstName())
							.lastName(testData.getLastName())
							.addressLine1(testData.getAddressLine1())
							.state(testData.getState())
							.city(testData.getState())
							.zipCode(testData.getZipcode())
							.addressType(testData.getAddressType()).build()).build());


			pc.addBuildingLocationDetails(AddBuildingLocationDetails.builder()
					.buildingMenuCount(1)
					.addBuildingCount(1)
					.addNewBuildingCount(1)
					.addBuildingsAndLocation(NewBuilding.builder()
							.propertyClassCode(testData.getClassCode())
							.incomeLimit(testData.getLimit())
							.coverageForm(testData.getCoverageForm())
							.build()).build());

			pc.addBlankets(Blanket.builder()
					.blanketType(testData.getBlanketType())
					.groupType(testData.getGroupType())
					.limit(testData.getLimit())
					.deductible(testData.getDeductible())
					.build());


			pc.addModifiersDetails();

			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());

			pc.reviewPolicy(PolicyReview.builder(ComercialPropertyConstants.PolicyReviewType.NONE).build());

			pc.viewQuote(Quote.builder().build());

			pc.viewForms();

			pc.selectPayments(Payments.builder()
					.billingMethod(testData.getBillingMethod())
					.paymentPlan(testData.getPaymentPlan())
					.build());

			pc.issuepolicy(ComercialPropertyConstants.Transactions.SUBMISSION);

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
	@Test(description="Verify whether user is able to create a commercial property policy without any cpp offerings.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC250(String browser)   throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialPropertyDataEngine testData = new CommercialPropertyDataEngine("GWTestData_DataEngine.xlsx", "CommercialProperty", "TC250");
		Log.testCaseInfo("Verify whether user is able to create a commercial property policy without any cpp offerings.", driver);
		try {	

			CommercialPropertyStepsImpl pc = CommecialPropertySteps.create();

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

			pc.selectProduct(ComercialPropertyConstants.ProductNames.COMMERCIAL_PROPERTY);

			pc.updatePolicyInfo(PolicyInfo.builder().organizationType(testData.getOrganizationType())
					.policyEffectiveDate(testData.getCurrentDate())
					.policyTerm(testData.getPolicyTerm())
					.build());


			pc.addBuildingLocationDetails(AddBuildingLocationDetails.builder()
					.buildingMenuCount(1)
					.addBuildingCount(1)
					.addNewBuildingCount(1)
					.addBuildingsAndLocation(NewBuilding.builder()
							.propertyClassCode(testData.getClassCode())
							.incomeLimit(testData.getLimit())
							.coverageForm(testData.getCoverageForm())
							.build()).build());

			pc.addBlankets(Blanket.builder()
					.blanketType(testData.getBlanketType())
					.groupType(testData.getGroupType())
					.limit(testData.getLimit())
					.deductible(testData.getDeductible())
					.build());


			pc.addModifiersDetails();

			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());

			pc.reviewPolicy(PolicyReview.builder(ComercialPropertyConstants.PolicyReviewType.NONE).build());

			pc.viewQuote(Quote.builder().build());

			pc.viewForms();

			pc.selectPayments(Payments.builder()
					.billingMethod(testData.getBillingMethod())
					.paymentPlan(testData.getPaymentPlan())
					.build());

			pc.issuepolicy(ComercialPropertyConstants.Transactions.SUBMISSION);

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
	@Test(description="Verify User able to Policy change transaction by adding a new location.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC258(String browser)   throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialPropertyDataEngine testData = new CommercialPropertyDataEngine("GWTestData_DataEngine.xlsx", "CommercialProperty", "TC258");
		Log.testCaseInfo("Verify User able to Policy change transaction by adding a new location.", driver);
		try {	

			CommercialPropertyStepsImpl pc = CommecialPropertySteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());

			pc.copySubmissions();

			pc.viewPolicy();						

			pc.policyChange(PolicyChange.builder().date(DataFakers.currentDate()).build());

			pc.updatePolicyInfo(PolicyInfo.builder().build());

			pc.addBuildingLocationDetails(AddBuildingLocationDetails.builder().build());

			pc.addBlankets(Blanket.builder().build());

			pc.addModifiersDetails();

			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());

			pc.reviewPolicy(PolicyReview.builder(ComercialPropertyConstants.PolicyReviewType.NONE).build());

			pc.viewQuote(Quote.builder().build());

			pc.viewForms();

			pc.selectPayments(Payments.builder().build());

			pc.issuepolicy(ComercialPropertyConstants.Transactions.POLICY_CHANGE);

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
	@Test(description="Verify wheather user able to make a Out of Sequence (OOS) transaction for a commercial property transaction", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC263(String browser)   throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialPropertyDataEngine testData = new CommercialPropertyDataEngine("GWTestData_DataEngine.xlsx", "CommercialProperty", "TC263");
		Log.testCaseInfo("Verify wheather user able to make a Out of Sequence (OOS) transaction for a commercial property transaction", driver);
		try {	

			CommercialPropertyStepsImpl pc = CommecialPropertySteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());

			pc.copySubmissions();

			pc.viewPolicy();

			pc.policyChange(PolicyChange.builder().date(DataFakers.dateOneMonthAhead()).build());

			pc.updatePolicyInfo(PolicyInfo.builder().build());

			pc.addBuildingLocationDetails(AddBuildingLocationDetails.builder().build());

			pc.addBlankets(Blanket.builder().build());

			pc.addModifiersDetails();

			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());

			pc.reviewPolicy(PolicyReview.builder(ComercialPropertyConstants.PolicyReviewType.NONE).build());

			pc.viewQuote(Quote.builder().build());

			pc.viewForms();

			pc.selectPayments(Payments.builder().build());

			pc.issuepolicy(ComercialPropertyConstants.Transactions.POLICY_CHANGE);

			pc.viewPolicy();

			pc.policyChange(PolicyChange.builder().date(DataFakers.currentDate()).build());

			pc.verifyOutOfSequenceMessage(PolicyChange.builder()
					.date(DataFakers.dateOneMonthAhead()).build());

			pc.updatePolicyInfo(PolicyInfo.builder().build());

			pc.verifyOutOfSequenceMessage(PolicyChange.builder()
					.date(DataFakers.dateOneMonthAhead()).build());


			pc.addBuildingLocationDetails(AddBuildingLocationDetails.builder().build());

			pc.verifyOutOfSequenceMessage(PolicyChange.builder()
					.date(DataFakers.dateOneMonthAhead()).build());

			pc.addBlankets(Blanket.builder().build());

			pc.verifyOutOfSequenceMessage(PolicyChange.builder()
					.date(DataFakers.dateOneMonthAhead()).build());

			pc.addModifiersDetails();

			pc.verifyOutOfSequenceMessage(PolicyChange.builder()
					.date(DataFakers.dateOneMonthAhead()).build());


			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());

			pc.verifyOutOfSequenceMessage(PolicyChange.builder()
					.date(DataFakers.dateOneMonthAhead()).build());


			pc.reviewPolicy(PolicyReview.builder(PolicyReviewType.NONE).build());////need to check 

			pc.viewQuote(Quote.builder().build());

			pc.viewForms();

			pc.selectPayments(Payments.builder().build());

			pc.issuepolicy(ComercialPropertyConstants.Transactions.POLICY_CHANGE);

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
	@Test(description="Verify Whether User able to Create an underwriter issue manually for commercial property policy to block the quote.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC296(String browser)   throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialPropertyDataEngine testData = new CommercialPropertyDataEngine("GWTestData_DataEngine.xlsx", "CommercialProperty", "TC296");
		Log.testCaseInfo("Verify Whether User able to Create an underwriter issue manually for commercial property policy to block the quote.", driver);
		try {	

			CommercialPropertyStepsImpl pc = CommecialPropertySteps.create();

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

			pc.selectProduct(ComercialPropertyConstants.ProductNames.COMMERCIAL_PROPERTY);

			pc.updatePolicyInfo(PolicyInfo.builder().organizationType(testData.getOrganizationType())
					.policyEffectiveDate(testData.getCurrentDate())
					.policyTerm(testData.getPolicyTerm())
					.build());


			pc.addBuildingLocationDetails(AddBuildingLocationDetails.builder()
					.buildingMenuCount(1)
					.addBuildingCount(1)
					.addNewBuildingCount(1)
					.addBuildingsAndLocation(NewBuilding.builder()
							.propertyClassCode(testData.getClassCode())
							.incomeLimit(testData.getLimit())
							.coverageForm(testData.getCoverageForm())
							.build()).build());

			pc.addBlankets(Blanket.builder()
					.blanketType(testData.getBlanketType())
					.groupType(testData.getGroupType())
					.limit(testData.getLimit())
					.deductible(testData.getDeductible())
					.build());


			pc.addModifiersDetails();

			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.UW_ISSUE).uWIssueType(testData.getUwIssueType())
					.contingencyDescription(testData.getLongDescription()).build());

			pc.reviewPolicy(PolicyReview.builder(ComercialPropertyConstants.PolicyReviewType.NONE).build());

			pc.viewQuote(Quote.builder()
					.build());

			pc.approveUWissue(UWIssueType.builder()
					.IssueType(testData.getUwIssueType())
					.build());

			pc.reviewPolicy(PolicyReview.builder(ComercialPropertyConstants.PolicyReviewType.NONE)
					.build());

			pc.viewQuote(Quote.builder()
					.build());

			pc.viewForms();

			pc.selectPayments(Payments.builder()
					.paymentPlan(testData.getPaymentPlan())
					.build());

			pc.issuepolicy(ComercialPropertyConstants.Transactions.SUBMISSION);

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
	@Test(description="Reopen an underwriter issue which was blocking  bind for commercial property policy.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC300(String browser)   throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialPropertyDataEngine testData = new CommercialPropertyDataEngine("GWTestData_DataEngine.xlsx", "CommercialProperty", "TC300");
		Log.testCaseInfo("Reopen an underwriter issue which was blocking  bind for commercial property policy.",driver);
		try {	

			CommercialPropertyStepsImpl pc = CommecialPropertySteps.create();

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

			pc.selectProduct(ComercialPropertyConstants.ProductNames.COMMERCIAL_PROPERTY);

			pc.updatePolicyInfo(PolicyInfo.builder().organizationType(testData.getOrganizationType())
					.policyEffectiveDate(testData.getCurrentDate())
					.policyTerm(testData.getPolicyTerm())
					.build());


			pc.addBuildingLocationDetails(AddBuildingLocationDetails.builder()
					.buildingMenuCount(1)
					.addBuildingCount(1)
					.addNewBuildingCount(1)
					.addBuildingsAndLocation(NewBuilding.builder()
							.propertyClassCode(testData.getClassCode())
							.incomeLimit(testData.getLimit())
							.coverageForm(testData.getCoverageForm())
							.build()).build());

			pc.addBlankets(Blanket.builder()
					.blanketType(testData.getBlanketType())
					.groupType(testData.getGroupType())
					.limit(testData.getLimit())
					.deductible(testData.getDeductible())
					.build());


			pc.addModifiersDetails();

			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.UW_ISSUE)
					.uWIssueType(testData.getUwIssueType())
					.contingencyDescription(testData.getLongDescription())
					.build());

			pc.reviewPolicy(PolicyReview.builder(ComercialPropertyConstants.PolicyReviewType.NONE).build());

			pc.viewQuote(Quote.builder().build());

			pc.viewForms();

			pc.selectPayments(Payments.builder().build());

			pc.issuepolicy(ComercialPropertyConstants.Transactions.BIND_ONLY);

			pc.approveUWissue(UWIssueType.builder()
					.IssueType(testData.getUwIssueType())
					.build());

			pc.reviewPolicy(PolicyReview.builder(ComercialPropertyConstants.PolicyReviewType.REOPEN).build());

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
	@Test(description="Check whether the contingency action - Cancel remainder of term is taken after the due date for commercial property policy", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC316(String browser)   throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialPropertyDataEngine testData = new CommercialPropertyDataEngine("GWTestData_DataEngine.xlsx", "CommercialProperty", "TC316");
		Log.testCaseInfo("Check whether the contingency action - Cancel remainder of term is taken after the due date for commercial property policy.",driver);
		try {	

			CommercialPropertyStepsImpl pc = CommecialPropertySteps.create();

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

			pc.selectProduct(ComercialPropertyConstants.ProductNames.COMMERCIAL_PROPERTY);

			pc.updatePolicyInfo(PolicyInfo.builder().organizationType(testData.getOrganizationType())
					.policyEffectiveDate(testData.getCurrentDate())
					.policyTerm(testData.getPolicyTerm())
					.build());


			pc.addBuildingLocationDetails(AddBuildingLocationDetails.builder()
					.buildingMenuCount(1)
					.addBuildingCount(1)
					.addNewBuildingCount(1)
					.addBuildingsAndLocation(NewBuilding.builder()
							.propertyClassCode(testData.getClassCode())
							.incomeLimit(testData.getLimit())
							.coverageForm(testData.getCoverageForm())
							.build()).build());

			pc.addBlankets(Blanket.builder()
					.blanketType(testData.getBlanketType())
					.groupType(testData.getGroupType())
					.limit(testData.getLimit())
					.deductible(testData.getDeductible())
					.build());


			pc.addModifiersDetails();

			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.CONTINGENCY)
					.contingencyTitle(testData.getLongDescription())
					.contingencyDescription(testData.getLongDescription())
					.contingencyAction(testData.getContingencyAction())
					.contingencyDueDate(testData.getEffectiveDateOneMonthAhead()).build());

			pc.reviewPolicy(PolicyReview.builder(ComercialPropertyConstants.PolicyReviewType.NONE).build());

			pc.viewQuote(Quote.builder().build());

			pc.viewForms();

			pc.selectPayments(Payments.builder().build());

			pc.issuepolicy(ComercialPropertyConstants.Transactions.SUBMISSION);

			pc.viewPolicy();

			pc.runBatchProcessInfo();	

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
	@Test(description="Check whether the contingency action - Change policy for remainder of term is taken after the due date for commercial property policy.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC314(String browser)   throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialPropertyDataEngine testData = new CommercialPropertyDataEngine("GWTestData_DataEngine.xlsx", "CommercialProperty", "TC314");
		Log.testCaseInfo("Check whether the contingency action - Change policy for remainder of term is taken after the due date for commercial property policy.",driver);
		try {	

			CommercialPropertyStepsImpl pc = CommecialPropertySteps.create();

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

			pc.selectProduct(ComercialPropertyConstants.ProductNames.COMMERCIAL_PROPERTY);

			pc.updatePolicyInfo(PolicyInfo.builder().organizationType(testData.getOrganizationType())
					.policyEffectiveDate(testData.getCurrentDate())
					.policyTerm(testData.getPolicyTerm())
					.build());


			pc.addBuildingLocationDetails(AddBuildingLocationDetails.builder()
					.buildingMenuCount(1)
					.addBuildingCount(1)
					.addNewBuildingCount(1)
					.addBuildingsAndLocation(NewBuilding.builder()
							.propertyClassCode(testData.getClassCode())
							.incomeLimit(testData.getLimit())
							.coverageForm(testData.getCoverageForm())
							.build()).build());

			pc.addBlankets(Blanket.builder()
					.blanketType(testData.getBlanketType())
					.groupType(testData.getGroupType())
					.limit(testData.getLimit())
					.deductible(testData.getDeductible())
					.build());


			pc.addModifiersDetails();

			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.CONTINGENCY)
					.contingencyTitle(testData.getContingencyTitle())
					.contingencyDescription(testData.getContingencyDescription())
					.contingencyAction(testData.getContingencyAction())
					.contingencyDueDate(testData.getEffectiveDateOneMonthAhead()).build());

			pc.reviewPolicy(PolicyReview.builder(ComercialPropertyConstants.PolicyReviewType.NONE).build());

			pc.viewQuote(Quote.builder().build());

			pc.viewForms();

			pc.selectPayments(Payments.builder()
					.upFrontPayment(testData.getUpfrontMethod())
					.build());

			pc.issuepolicy(ComercialPropertyConstants.Transactions.SUBMISSION);

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
	 * @author anitha.raphel
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Waive a contingency manually for commercial property policy.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC310(String browser)   throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialPropertyDataEngine testData = new CommercialPropertyDataEngine("GWTestData_DataEngine.xlsx", "CommercialProperty", "TC310");
		Log.testCaseInfo("Waive a contingency manually for commercial property policy.",driver);
		try {	

			CommercialPropertyStepsImpl pc = CommecialPropertySteps.create();

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

			pc.selectProduct(ComercialPropertyConstants.ProductNames.COMMERCIAL_PROPERTY);

			pc.updatePolicyInfo(PolicyInfo.builder().organizationType(testData.getOrganizationType())
					.policyEffectiveDate(testData.getCurrentDate())
					.policyTerm(testData.getPolicyTerm())
					.build());

			pc.addBuildingLocationDetails(AddBuildingLocationDetails.builder()
					.buildingMenuCount(1)
					.addBuildingCount(1)
					.addNewBuildingCount(1)
					.addBuildingsAndLocation(NewBuilding.builder()
							.propertyClassCode(testData.getClassCode())
							.incomeLimit(testData.getLimit())
							.coverageForm(testData.getCoverageForm())
							.build()).build());

			pc.addBlankets(Blanket.builder()
					.blanketType(testData.getBlanketType())
					.groupType(testData.getGroupType())
					.limit(testData.getLimit())
					.deductible(testData.getDeductible())
					.build());


			pc.addModifiersDetails();

			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.CONTINGENCY)
					.contingencyTitle(testData.getContingencyTitle())
					.contingencyDescription(testData.getContingencyDescription())
					.contingencyAction(testData.getContingencyAction())
					.contingencyDueDate(testData.getEffectiveDateOneMonthAhead()).build());

			pc.reviewPolicy(PolicyReview.builder(ComercialPropertyConstants.PolicyReviewType.NONE).build());

			pc.viewQuote(Quote.builder().build());

			pc.viewForms();

			pc.selectPayments(Payments.builder()
					.upFrontPayment(testData.getUpfrontMethod())
					.build());

			pc.issuepolicy(ComercialPropertyConstants.Transactions.SUBMISSION);

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
	 * @author anitha.raphel
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Verify whether User able to Create a commercial property policy by adding a contingency manually.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC308(String browser)   throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialPropertyDataEngine testData = new CommercialPropertyDataEngine("GWTestData_DataEngine.xlsx", "CommercialProperty", "TC308");
		Log.testCaseInfo("Verify whether User able to Create a commercial property policy by adding a contingency manually.",driver);
		try {	

			CommercialPropertyStepsImpl pc = CommecialPropertySteps.create();

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

			pc.selectProduct(ComercialPropertyConstants.ProductNames.COMMERCIAL_PROPERTY);

			pc.updatePolicyInfo(PolicyInfo.builder().organizationType(testData.getOrganizationType())
					.policyEffectiveDate(testData.getCurrentDate())
					.policyTerm(testData.getPolicyTerm())
					.build());


			pc.addBuildingLocationDetails(AddBuildingLocationDetails.builder()
					.buildingMenuCount(1)
					.addBuildingCount(1)
					.addNewBuildingCount(1)
					.addBuildingsAndLocation(NewBuilding.builder()
							.propertyClassCode(testData.getClassCode())
							.incomeLimit(testData.getLimit())
							.coverageForm(testData.getCoverageForm())
							.build()).build());

			pc.addBlankets(Blanket.builder()
					.blanketType(testData.getBlanketType())
					.groupType(testData.getGroupType())
					.limit(testData.getLimit())
					.deductible(testData.getDeductible())
					.build());


			pc.addModifiersDetails();

			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.CONTINGENCY)
					.contingencyTitle(testData.getContingencyTitle())
					.contingencyDescription(testData.getContingencyDescription())
					.contingencyAction(testData.getContingencyAction())
					.contingencyDueDate(testData.getEffectiveDateOneMonthAhead()).build());

			pc.reviewPolicy(PolicyReview.builder(ComercialPropertyConstants.PolicyReviewType.NONE).build());

			pc.viewQuote(Quote.builder().build());

			pc.viewForms();

			pc.selectPayments(Payments.builder()
					.upFrontPayment(testData.getUpfrontMethod())
					.build());

			pc.issuepolicy(ComercialPropertyConstants.Transactions.SUBMISSION);

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
	@Test(description="Verify whether User able to Create a commercial property policy by adding some loss history using documents.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC304(String browser)   throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialPropertyDataEngine testData = new CommercialPropertyDataEngine("GWTestData_DataEngine.xlsx", "CommercialProperty", "TC304");
		Log.testCaseInfo("Verify whether User able to Create a commercial property policy by adding some loss history using documents.",driver);

		try {	

			CommercialPropertyStepsImpl pc = CommecialPropertySteps.create();

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

			pc.selectProduct(ComercialPropertyConstants.ProductNames.COMMERCIAL_PROPERTY);

			pc.updatePolicyInfo(PolicyInfo.builder().organizationType(testData.getOrganizationType())
					.policyEffectiveDate(testData.getCurrentDate())
					.policyTerm(testData.getPolicyTerm())
					.build());


			pc.addBuildingLocationDetails(AddBuildingLocationDetails.builder()
					.buildingMenuCount(1)
					.addBuildingCount(1)
					.addNewBuildingCount(1)
					.addBuildingsAndLocation(NewBuilding.builder()
							.propertyClassCode(testData.getClassCode())
							.incomeLimit(testData.getLimit())
							.coverageForm(testData.getCoverageForm())
							.build()).build());

			pc.addBlankets(Blanket.builder()
					.blanketType(testData.getBlanketType())
					.groupType(testData.getGroupType())
					.limit(testData.getLimit())
					.deductible(testData.getDeductible())
					.build());


			pc.addModifiersDetails();

			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.PRIORLOSSES_ATTACH_DOCUMENT)
					.documentName(testData.getDocumentName())
					.lossHistoryType(testData.getLossHistoryType())
					.lossPercent(testData.getLossPercent())
					.lossTotalIncurred(testData.getTotalIncurred())
					.uploadDocumentStatus(testData.getUploadDocumentStatus()).build());

			pc.reviewPolicy(PolicyReview.builder(ComercialPropertyConstants.PolicyReviewType.NONE).build());

			pc.viewQuote(Quote.builder().build());

			pc.viewForms();

			pc.selectPayments(Payments.builder().build());

			pc.issuepolicy(ComercialPropertyConstants.Transactions.SUBMISSION);

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
	@Test(description="Verify whether User able to Create an underwriter activity for commercial property policy.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC302(String browser)   throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialPropertyDataEngine testData = new CommercialPropertyDataEngine("GWTestData_DataEngine.xlsx", "CommercialProperty", "TC302");
		Log.testCaseInfo("Verify whether User able to Create an underwriter activity for commercial property policy.",driver);

		try {	

			CommercialPropertyStepsImpl pc = CommecialPropertySteps.create();

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

			pc.selectProduct(ComercialPropertyConstants.ProductNames.COMMERCIAL_PROPERTY);

			pc.updatePolicyInfo(PolicyInfo.builder().organizationType(testData.getOrganizationType())
					.policyEffectiveDate(testData.getCurrentDate())
					.policyTerm(testData.getPolicyTerm())
					.build());


			pc.addBuildingLocationDetails(AddBuildingLocationDetails.builder()
					.buildingMenuCount(1)
					.addBuildingCount(1)
					.addNewBuildingCount(1)
					.addBuildingsAndLocation(NewBuilding.builder()
							.propertyClassCode(testData.getClassCode())
							.incomeLimit(testData.getLimit())
							.coverageForm(testData.getCoverageForm())
							.build()).build());

			pc.addBlankets(Blanket.builder()
					.blanketType(testData.getBlanketType())
					.groupType(testData.getGroupType())
					.limit(testData.getLimit())
					.deductible(testData.getDeductible())
					.build());


			pc.addModifiersDetails();

			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.UW_ISSUE_APPROVE_REQUEST)
					.uWIssueType(testData.getUwIssueType())
					.longDescription(testData.getLongDescription()).build());

			pc.reviewPolicy(PolicyReview.builder(ComercialPropertyConstants.PolicyReviewType.NONE).build());

			pc.viewQuote(Quote.builder().build());

			pc.viewForms();

			pc.selectPayments(Payments.builder()
					.upFrontPayment(testData.getUpfrontMethod())
					.build());

			pc.issuepolicy(ComercialPropertyConstants.Transactions.SUBMISSION);

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
	@Test(description="Verify user able to Create an underwriter issue manually for commercial property policy to block the quote.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC306(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialPropertyDataEngine testData = new CommercialPropertyDataEngine("GWTestData_DataEngine.xlsx", "CommercialProperty", "TC306");
		Log.testCaseInfo("Verify whether User able to Create an underwriter issue manually for commercial property policy to block the quote.", driver);
		try {	
			CommercialPropertyStepsImpl pc = CommecialPropertySteps.create();

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

			pc.selectProduct(ComercialPropertyConstants.ProductNames.COMMERCIAL_PROPERTY);

			pc.updatePolicyInfo(PolicyInfo.builder().organizationType(testData.getOrganizationType())
					.policyEffectiveDate(testData.getCurrentDate())
					.policyTerm(testData.getPolicyTerm())
					.build());


			pc.addBuildingLocationDetails(AddBuildingLocationDetails.builder()
					.buildingMenuCount(1)
					.addBuildingCount(1)
					.addNewBuildingCount(1)
					.addBuildingsAndLocation(NewBuilding.builder()
							.propertyClassCode(testData.getClassCode())
							.incomeLimit(testData.getLimit())
							.coverageForm(testData.getCoverageForm())
							.build()).build());

			pc.addBlankets(Blanket.builder()
					.blanketType(testData.getBlanketType())
					.groupType(testData.getGroupType())
					.limit(testData.getLimit())
					.deductible(testData.getDeductible())
					.build());


			pc.addModifiersDetails();

			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.UW_ISSUE)
					.uWIssueType(testData.getUwIssueType())
					.contingencyDescription(testData.getContingencyDescription())
					.build());

			pc.reviewPolicy(PolicyReview.builder(ComercialPropertyConstants.PolicyReviewType.NONE).build());

			pc.viewQuote(Quote.builder().build());
			
			pc.approveUWissue(UWIssueType.builder()
					.IssueType(testData.getUwIssueType())
					.build());
			

			pc.reviewPolicy(PolicyReview.builder(ComercialPropertyConstants.PolicyReviewType.NONE)
					.build());

			pc.viewQuote(Quote.builder()
					.build());

			pc.viewForms();

			pc.selectPayments(Payments.builder().build());

			pc.issuepolicy(ComercialPropertyConstants.Transactions.SUBMISSION);

			pc.viewPolicy();

			Log.testCaseResult(driver);

		} catch (Exception e) {
			Log.exception(e, DriverManager.getDriver());
		} finally {
			DriverManager.getDriver().quit();
			Log.endTestCase();
		}
	}

	/**
	 * @author vignesh.ravi
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Verify whether user is able to Submission - Show Ratings", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC45(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialPropertyDataEngine testData = new CommercialPropertyDataEngine("GWTestData_DataEngine.xlsx", "CommercialProperty", "TC45");
		Log.testCaseInfo("Verify whether user is able to Submission - Show Ratings", driver);
		try {	
			CommercialPropertyStepsImpl pc = CommecialPropertySteps.create();

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

			pc.selectProduct(ComercialPropertyConstants.ProductNames.COMMERCIAL_PROPERTY);

			pc.updatePolicyInfo(PolicyInfo.builder().organizationType(testData.getOrganizationType())
					.policyEffectiveDate(testData.getCurrentDate())
					.policyTerm(testData.getPolicyTerm())
					.build());


			pc.addBuildingLocationDetails(AddBuildingLocationDetails.builder()
					.buildingMenuCount(1)
					.addBuildingCount(1)
					.addNewBuildingCount(1)
					.addBuildingsAndLocation(NewBuilding.builder()
							.propertyClassCode(testData.getClassCode())
							.incomeLimit(testData.getLimit())
							.coverageForm(testData.getCoverageForm())
							.build()).build());

			pc.addBlankets(Blanket.builder()
					.blanketType(testData.getBlanketType())
					.groupType(testData.getGroupType())
					.limit(testData.getLimit())
					.deductible(testData.getDeductible())
					.build());


			pc.addModifiersDetails();

			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());

			pc.reviewPolicy(PolicyReview.builder(ComercialPropertyConstants.PolicyReviewType.NONE).build());

			String effectiveDate = pc.getEffectiveDate();
			String expirationDate = pc.getExpirationDate();

			pc.viewShowRating(Rating.builder()
					.effectiveDate(effectiveDate)
					.expirationDate(expirationDate)
					.showRatingWorksheet(true)
					.coverage1(testData.getCoverage1())
					.coverage2(testData.getCoverage2())
					.coverage3(testData.getCoverage3())
					.coverage4(testData.getCoverage4())
					.fireProductionValue(testData.getFireProductionValue())
					.value(testData.getValue())
					.state(testData.getRatingSheet())
					.limit(testData.getLimit())
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
	 * @author vignesh.ravi
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Verify whether User able to Create an underwriter issue manually for commercial property policy to block the issuance.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC298(String browser)   throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		CommercialPropertyDataEngine testData = new CommercialPropertyDataEngine("GWTestData_DataEngine.xlsx", "CommercialProperty", "TC298");
		Log.testCaseInfo("Verify whether User able to Create an underwriter issue manually for commercial property policy to block the issuance.",driver);
		try {	
			CommercialPropertyStepsImpl pc = CommecialPropertySteps.create();

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

			pc.selectProduct(ComercialPropertyConstants.ProductNames.COMMERCIAL_PROPERTY);

			pc.updatePolicyInfo(PolicyInfo.builder().organizationType(testData.getOrganizationType())
					.policyEffectiveDate(testData.getCurrentDate())
					.policyTerm(testData.getPolicyTerm())
					.build());


			pc.addBuildingLocationDetails(AddBuildingLocationDetails.builder()
					.buildingMenuCount(1)
					.addBuildingCount(1)
					.addNewBuildingCount(1)
					.addBuildingsAndLocation(NewBuilding.builder()
							.propertyClassCode(testData.getClassCode())
							.incomeLimit(testData.getLimit())
							.coverageForm(testData.getCoverageForm())
							.build()).build());

			pc.addBlankets(Blanket.builder()
					.blanketType(testData.getBlanketType())
					.groupType(testData.getGroupType())
					.limit(testData.getLimit())
					.deductible(testData.getDeductible())
					.build());


			pc.addModifiersDetails();

			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.UW_ISSUE)
					.uWIssueType(testData.getUwIssueType())
					.contingencyDescription(testData.getContingencyDescription())
					.build());


			pc.reviewPolicy(PolicyReview.builder(ComercialPropertyConstants.PolicyReviewType.NONE).build());


			pc.viewQuote(Quote.builder().build());

			pc.viewForms();

			pc.selectPayments(Payments.builder()
					.paymentPlan(testData.getPaymentPlan())
					.build());

			pc.issuepolicy(ComercialPropertyConstants.Transactions.SUBMISSION);

			String submissionNo =pc.getSubmissionNo();
			pc.logOutTheApplication();
			pc.loginIntoTheApplication("sulveling", "gw");
			pc.searchSubmission("Submission", submissionNo);
			pc.issuepolicy(ComercialPropertyConstants.Transactions.SUBMISSION);
			pc.approveUWissue(UWIssueType.builder()
					.IssueType(testData.getUwIssueType())
					.build());
			pc.logOutTheApplication();
			pc.loginIntoTheApplication("su", "gw");
			pc.searchSubmission("Submission", submissionNo);

			pc.viewQuote(Quote.builder().build());

			pc.viewForms();

			pc.selectPayments(Payments.builder().build());

			pc.issuepolicy(ComercialPropertyConstants.Transactions.SUBMISSION);

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