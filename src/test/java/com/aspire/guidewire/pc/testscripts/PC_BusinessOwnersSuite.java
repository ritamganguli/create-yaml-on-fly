package com.aspire.guidewire.pc.testscripts;


import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersConstants;
import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersConstants.PolicyReviewType;
import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersConstants.RiskAnalysisType;
import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersDataEngine;
import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersFeatures.AddBuildingDetails;
import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersFeatures.AddLocationDetails;
import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersFeatures.CancellationSource;
import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersFeatures.CreateNewAccountFromPerson;
import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersFeatures.EnterAccountInformation;
import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersFeatures.Offerings;
import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersFeatures.Payments;
import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersFeatures.PolicyChange;
import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersFeatures.PolicyDetails;
import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersFeatures.PolicyInfo;
import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersFeatures.PolicyReview;
import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersFeatures.Qualification;
import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersFeatures.ReinstatementReason;
import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersFeatures.RenewPolicy;
import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersFeatures.RiskAnalysis;
import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersFeatures.UWIssueType;
import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersFeatures.UpdateBusinessOwnersLine;
import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersSteps;
import com.aspire.guidewire.pc.teststeps.businessowners.BusinessOwnersStepsImpl;
import com.aspire.guidewire.pc.teststeps.businessowners.DataFakers;
import com.aspire.guidewire.utils.DataProviderUtils;
import com.aspire.guidewire.utils.EnvironmentPropertiesReader;
import com.aspire.guidewire.utils.Log;
import com.aspire.guidewire.webdriverManager.DriverManager;

public class PC_BusinessOwnersSuite {
	
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
	 * Test Description: Verify whether the User able to Create a business owners policy.
	 * Test ID: TC222
	 * @author Manikandan.manohar
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Verify whether the User able to Create a business owners policy.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC222(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("Verify whether the User able to Create a business owners policy.", driver);
		BusinessOwnersDataEngine testData = new BusinessOwnersDataEngine("GWTestData_DataEngine.xlsx", "BusinessOwners", "TC222");
		try {	

			BusinessOwnersStepsImpl pc = BusinessOwnersSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchAccount(EnterAccountInformation.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.build());

			pc.createAccount(CreateNewAccountFromPerson.builder()
					.firstName(testData.getFirstName())
					.addressLine1(testData.getAddressLine1())
					.state(testData.getState())
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType())
					.organization(testData.getOrganization())
					.build());

			pc.selectProduct(BusinessOwnersConstants.ProductNames.BUSINESS_OWNERS);

			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());

			pc.selectQualifications(Qualification.builder().build());

			pc.updatePolicyInfo(PolicyInfo.builder().organizationType(testData.getOrganizationType()).build());

			pc.updateBusinessOwnersLine(UpdateBusinessOwnersLine.builder().businessType(testData.getBusinessType()).build());

			pc.addLocationDetails(AddLocationDetails.builder().build());

			pc.addBuildingDetails(AddBuildingDetails.builder().basicAmount(testData.getAmount())
					.buildingLimit(testData.getAmount()).businessPropertyLimit(testData.getAmount()).build());

			pc.addModifiersDetails();
			
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			
			pc.reviewPolicy(PolicyReview.builder(BusinessOwnersConstants.PolicyReviewType.NONE).build());
			
			pc.viewForms();
			
			pc.selectPayments(Payments.builder().build());
			
			pc.issuepolicy(BusinessOwnersConstants.Transactions.SUBMISSION);
			
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
	 * Test Description: Verify whether the User able to process Copy Submission Page transaction for business owners(Store Retail) policy
	 * Test ID: TC223
	 * @author Manikandan.manohar
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Verify whether the User able to process Copy Submission Page transaction for business owners(Store Retail) policy", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC223(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		BusinessOwnersDataEngine testData = new BusinessOwnersDataEngine("GWTestData_DataEngine.xlsx", "BusinessOwners", "TC223");
		Log.testCaseInfo("Verify whether the User able to process Copy Submission Page transaction for business owners(Store Retail) policy", driver);
		try {	

			BusinessOwnersStepsImpl pc = BusinessOwnersSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			//Get policy number from Excel sheet which is generated by data generator using auto generated policy number created copy submission

			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNo()).build());
			
			pc.copySubmission();
			
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
						
			pc.reviewPolicy(PolicyReview.builder(BusinessOwnersConstants.PolicyReviewType.NONE).build());
			
			pc.issuepolicy(BusinessOwnersConstants.Transactions.SUBMISSION);
			
			pc.viewPolicy();
			
			//old code
			pc.copySubmission();
			
			pc.selectOfferings(Offerings.builder().build());
			
			pc.selectQualifications(Qualification.builder().build());

			pc.updatePolicyInfo(PolicyInfo.builder().build());

			pc.updateBusinessOwnersLine(UpdateBusinessOwnersLine.builder().build());

			pc.addLocationDetails(AddLocationDetails.builder().build());
			
			pc.addBuildingDetails(AddBuildingDetails.builder().build());
			
			pc.addModifiersDetails();
			
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			
			pc.reviewPolicy(PolicyReview.builder(BusinessOwnersConstants.PolicyReviewType.NONE).build());
			
			pc.viewForms();
			
			pc.selectPayments(Payments.builder().build());
			
			pc.issuepolicy(BusinessOwnersConstants.Transactions.SUBMISSION);
			
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
	 * Test Description: Verify whether user is able to rewrite full term transaction with additional name insureds added for business owners policy.
	 * Test ID: TC228
	 * @author Manikandan.manohar
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Verify whether user is able to rewrite full term transaction with additional name insureds added for business owners policy.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC228(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("Verify whether user is able to rewrite full term transaction with additional name insureds added for business owners policy.", driver);
		BusinessOwnersDataEngine testData = new BusinessOwnersDataEngine("GWTestData_DataEngine.xlsx", "BusinessOwners", "TC228");
		try {	

			BusinessOwnersStepsImpl pc = BusinessOwnersSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			//Get policy number from Excel sheet which is generated by data generator using auto generated policy number created copy submission

			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNo()).build());
			
			pc.copySubmission();
			
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
						
			pc.reviewPolicy(PolicyReview.builder(BusinessOwnersConstants.PolicyReviewType.NONE).build());
			
			pc.issuepolicy(BusinessOwnersConstants.Transactions.SUBMISSION);
			
			pc.viewPolicy();
			
			//old code
			pc.cancelPolicy(CancellationSource.builder().source(testData.getCancellationSource())
					.reason(testData.getCancellationReason()).build());
			
			pc.viewPolicy();

			
			pc.policyRewriteFullTerm();
			
			pc.selectOfferings(Offerings.builder().build());
			
			pc.updatePolicyInfo(PolicyInfo.builder().build());
			
			pc.updateBusinessOwnersLine(UpdateBusinessOwnersLine.builder().build());
			
			pc.addLocationDetails(AddLocationDetails.builder().build());
			
			pc.addBuildingDetails(AddBuildingDetails.builder().build());
			
			pc.addModifiersDetails();
			
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			
			pc.reviewPolicy(PolicyReview.builder(BusinessOwnersConstants.PolicyReviewType.NONE).build());
			
			pc.viewForms();
			
			pc.selectPayments(Payments.builder().build());
			
			pc.issuepolicy(BusinessOwnersConstants.Transactions.REWRITE_FULL_TERM);
			
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
	 * Test Description: Verify whether the User able to process Rewrite New term transaction for business owners policy.
	 * Test ID: TC229
	 * @author Manikandan.manohar
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Verify whether the User able to process Rewrite New term transaction for business owners policy.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC229(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("Verify whether the User able to process Rewrite New term transaction for business owners policy.", driver);
		BusinessOwnersDataEngine testData = new BusinessOwnersDataEngine("GWTestData_DataEngine.xlsx", "BusinessOwners", "TC229");
		try {	

			BusinessOwnersStepsImpl pc = BusinessOwnersSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			//Get policy number from Excel sheet which is generated by data generator using auto generated policy number created copy submission

			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNo()).build());
			
			pc.copySubmission();
			
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			
			pc.reviewPolicy(PolicyReview.builder(BusinessOwnersConstants.PolicyReviewType.NONE).build());
			
			pc.issuepolicy(BusinessOwnersConstants.Transactions.SUBMISSION);
			
			pc.viewPolicy();
			
			//old code
			pc.cancelPolicy(CancellationSource.builder().source(testData.getCancellationSource())
					.reason(testData.getCancellationReason()).build());
			
			pc.viewPolicy();
			
			pc.policyRewriteNewTerm();
			
			pc.selectOfferings(Offerings.builder().build());
			
			pc.updatePolicyInfo(PolicyInfo.builder().build());
			
			pc.updateBusinessOwnersLine(UpdateBusinessOwnersLine.builder().build());
			
			pc.addLocationDetails(AddLocationDetails.builder().build());
			
			pc.addBuildingDetails(AddBuildingDetails.builder().build());
			
			pc.addModifiersDetails();
			
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			
			pc.reviewPolicy(PolicyReview.builder(BusinessOwnersConstants.PolicyReviewType.NONE).build());
			
			pc.viewForms();
			
			pc.selectPayments(Payments.builder().build());
			
			pc.issuepolicy(BusinessOwnersConstants.Transactions.REWRITE_NEW_TERM);
			
			pc.approveUWissue(UWIssueType.builder().build());
			
			pc.reviewPolicy(PolicyReview.builder(BusinessOwnersConstants.PolicyReviewType.REWRITE_NEWTERM).build());
			
			pc.viewForms();
			
			pc.selectPayments(Payments.builder().build());
			
			pc.issuepolicy(BusinessOwnersConstants.Transactions.REWRITE_NEW_TERM);
			
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
	 * Test Description: Verify whether the User able to process Rewrite Remainder term transaction for business owners policy.
	 * Test ID: TC230
	 * @author Manikandan.manohar
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Verify whether the User able to process Rewrite Remainder term transaction for business owners policy.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC230(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("Verify whether the User able to process Rewrite Remainder term transaction for business owners policy.", driver);
		BusinessOwnersDataEngine testData = new BusinessOwnersDataEngine("GWTestData_DataEngine.xlsx", "BusinessOwners", "TC230");
		try {	

			BusinessOwnersStepsImpl pc = BusinessOwnersSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			//Get policy number from Excel sheet which is generated by data generator using auto generated policy number created copy submission

			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNo()).build());
			
			pc.copySubmission();
			
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			
			pc.reviewPolicy(PolicyReview.builder(BusinessOwnersConstants.PolicyReviewType.NONE).build());
			
			pc.issuepolicy(BusinessOwnersConstants.Transactions.SUBMISSION);
			
			pc.viewPolicy();
			//old code
			pc.cancelPolicy(CancellationSource.builder().source(testData.getCancellationSource())
					.reason(testData.getCancellationReason()).build());
			
			pc.viewPolicy();

			
			pc.policyRewriteRemainderTerm();
			
			
			pc.selectOfferings(Offerings.builder().build());
			
			pc.updatePolicyInfo(PolicyInfo.builder().build());
			
			pc.updateBusinessOwnersLine(UpdateBusinessOwnersLine.builder().build());
			
			pc.addLocationDetails(AddLocationDetails.builder().build());
			
			pc.addBuildingDetails(AddBuildingDetails.builder().build());
			
			pc.addModifiersDetails();
			
			pc.reviewPolicy(PolicyReview.builder(PolicyReviewType.NONE).build());
			
			pc.viewForms();
			
			pc.selectPayments(Payments.builder().build());
			
			pc.issuepolicy(BusinessOwnersConstants.Transactions.REWRITE_REMAINDER_TERM);
			
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
	 * Test Description: Verify whether the User able to process Renewal transaction for business owners policy.
	 * Test ID: TC231
	 * @author Manikandan.manohar
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Verify whether the User able to process Renewal transaction for business owners policy.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC231(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("Verify whether the User able to process Renewal transaction for business owners policy.", driver);
		BusinessOwnersDataEngine testData = new BusinessOwnersDataEngine("GWTestData_DataEngine.xlsx", "BusinessOwners", "TC231");
		try {	

			BusinessOwnersStepsImpl pc = BusinessOwnersSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			//Get policy number from Excel sheet which is generated by data generator using auto generated policy number created copy submission

			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNo()).build());
			
			pc.copySubmission();
			
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
						
			pc.reviewPolicy(PolicyReview.builder(BusinessOwnersConstants.PolicyReviewType.NONE).build());
			
			pc.issuepolicy(BusinessOwnersConstants.Transactions.SUBMISSION);
			
			pc.viewPolicy();
			//old code
			pc.policyRenew();
			
			pc.selectOfferings(Offerings.builder().build());	
			
			pc.updatePolicyInfo(PolicyInfo.builder().build());
			
			pc.updateBusinessOwnersLine(UpdateBusinessOwnersLine.builder().build());
			
			pc.addLocationDetails(AddLocationDetails.builder().build());
			
			pc.addBuildingDetails(AddBuildingDetails.builder().build());
			
			pc.addModifiersDetails();
			
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			
			pc.reviewPolicy(PolicyReview.builder(PolicyReviewType.RENEW).build());
			
			pc.viewForms();
			
			pc.issuepolicy(BusinessOwnersConstants.Transactions.RENEW_POLICY);
			
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
	 * Test Description: Verify whether the User able to process Business owners policy with one additional insured person.
	 * Test ID: TC232
	 * @author Manikandan.manohar
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Verify whether the User able to process Business owners policy with one additional insured person.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC232(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("Verify whether the User able to process Business owners policy with one additional insured person.", driver);
		BusinessOwnersDataEngine testData = new BusinessOwnersDataEngine("GWTestData_DataEngine.xlsx", "BusinessOwners", "TC232");
		try {	

			BusinessOwnersStepsImpl pc = BusinessOwnersSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchAccount(EnterAccountInformation.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.build());

			pc.createAccount(CreateNewAccountFromPerson.builder()
					.firstName(testData.getFirstName())
					.addressLine1(testData.getAddressLine1())
					.state(testData.getState())
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType())
					.organization(testData.getOrganization())
					.build());

			pc.selectProduct(BusinessOwnersConstants.ProductNames.BUSINESS_OWNERS);

			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());

			pc.selectQualifications(Qualification.builder().build());

			pc.updatePolicyInfo(PolicyInfo.builder().organizationType(testData.getOrganizationType())
					.addAdditionalInsured(true)
					.createInsured(CreateNewAccountFromPerson.builder()
							.addAdditionalInsured(true)
							.firstName(testData.getFirstName())
							.lastName(testData.getLastName())
							.addressLine1(testData.getAddressLine1())
							.state(testData.getState())
							.city(testData.getCity())
							.zipCode(testData.getZipcode())
							.addressType(testData.getAddressType())
							.build())
					.build());
			


			pc.updateBusinessOwnersLine(UpdateBusinessOwnersLine.builder().businessType(testData.getBusinessType()).build());

			pc.addLocationDetails(AddLocationDetails.builder().build());

			pc.addBuildingDetails(AddBuildingDetails.builder().basicAmount(testData.getAmount())
					.buildingLimit(testData.getAmount()).businessPropertyLimit(testData.getAmount()).build());

			pc.addModifiersDetails();
			
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			
			pc.reviewPolicy(PolicyReview.builder(BusinessOwnersConstants.PolicyReviewType.NONE).build());
			
			pc.viewForms();
			
			pc.selectPayments(Payments.builder().build());
			
			pc.issuepolicy(BusinessOwnersConstants.Transactions.SUBMISSION);
			
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
	 * Test Description: Verify whether the User able to process Policy change transaction by changing coverage's
	 * Test ID: TC227
	 * @author Manikandan.manohar
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Verify whether the User able to process Policy change transaction by changing coverage's", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC227(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		BusinessOwnersDataEngine testData = new BusinessOwnersDataEngine("GWTestData_DataEngine.xlsx", "BusinessOwners", "TC227");
		Log.testCaseInfo("Verify whether the User able to process Policy change transaction by changing coverage's", driver);
		try {	

			BusinessOwnersStepsImpl pc = BusinessOwnersSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			//Get policy number from Excel sheet which is generated by data generator using auto generated policy number created copy submission
			
			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNo()).build());
			
			pc.copySubmission();
			
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
						
			pc.reviewPolicy(PolicyReview.builder(BusinessOwnersConstants.PolicyReviewType.NONE).build());
			
			pc.issuepolicy(BusinessOwnersConstants.Transactions.SUBMISSION);
			
			pc.viewPolicy();
			
			//old code
			pc.policyChange(PolicyChange.builder().date(testData.getEffectiveDateOneMonthAhead()).build());

			pc.selectOfferings(Offerings.builder().build());

			pc.updatePolicyInfo(PolicyInfo.builder().build());

			pc.updateBusinessOwnersLine(UpdateBusinessOwnersLine.builder().businessType(testData.getBusinessType())
					.addAdditionalCoverage(true).addExclusionAndCondition(true).build());

			pc.addLocationDetails(AddLocationDetails.builder().build());
			
			pc.addBuildingDetails(AddBuildingDetails.builder().basicAmount(testData.getAmount())
					.buildingLimit(testData.getAmount()).businessPropertyLimit(testData.getAmount()).build());

			pc.addModifiersDetails();

			pc.reviewPolicy(PolicyReview.builder(BusinessOwnersConstants.PolicyReviewType.NONE).build());
			
			pc.viewForms();
			
			pc.selectPayments(Payments.builder().build());
			
			pc.issuepolicy(BusinessOwnersConstants.Transactions.POLICY_CHANGE);
			
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
	 * Test Description: Check whether the user is able to resolve a contingency manually..
	 * Test ID: TC331
	 * @author Manikandan.manohar
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Check whether the user is able to resolve a contingency manually.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC331(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("Check whether the user is able to resolve a contingency manually.", driver);
		BusinessOwnersDataEngine testData = new BusinessOwnersDataEngine("GWTestData_DataEngine.xlsx", "BusinessOwners", "TC331");
		try {	

			BusinessOwnersStepsImpl pc = BusinessOwnersSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchAccount(EnterAccountInformation.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.build());

			pc.createAccount(CreateNewAccountFromPerson.builder()
					.firstName(testData.getFirstName())
					.addressLine1(testData.getAddressLine1())
					.state(testData.getState())
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType())
					.organization(testData.getOrganization())
					.build());

			pc.selectProduct(BusinessOwnersConstants.ProductNames.BUSINESS_OWNERS);

			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());

			pc.selectQualifications(Qualification.builder().build());

			pc.updatePolicyInfo(PolicyInfo.builder().organizationType(testData.getOrganizationType()).build());

			pc.updateBusinessOwnersLine(UpdateBusinessOwnersLine.builder().businessType(testData.getBusinessType()).build());

			pc.addLocationDetails(AddLocationDetails.builder().build());

			pc.addBuildingDetails(AddBuildingDetails.builder().basicAmount(testData.getAmount())
					.buildingLimit(DataFakers.amount()).businessPropertyLimit(DataFakers.amount()).build());

			pc.addModifiersDetails();

			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.CONTINGENCY)
					.contingencyTitle(testData.getContingencyDescription())
					.contingencyDescription(testData.getContingencyDescription())
					.contingencyAction(testData.getContingencyAction())
					.contingencyDueDate(testData.getEffectiveDateOneMonthAhead()).build());

			pc.reviewPolicy(PolicyReview.builder(BusinessOwnersConstants.PolicyReviewType.NONE).build());
			
			pc.viewForms();
			
			pc.selectPayments(Payments.builder().build());
			
			pc.issuepolicy(BusinessOwnersConstants.Transactions.SUBMISSION);
			
			pc.viewPolicy();
			
			pc.CompletedPolicyTransactions();
			
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
	 * Test Description: policy cancellation transaction for business owners policy.
	 * Test ID: TC225
	 * @author Manikandan.manohar
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Policy cancellation transaction for business owners policy.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC225(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("Policy cancellation transaction for business owners policy.", driver);
		BusinessOwnersDataEngine testData = new BusinessOwnersDataEngine("GWTestData_DataEngine.xlsx", "BusinessOwners", "TC225");
		try {	

			BusinessOwnersStepsImpl pc = BusinessOwnersSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			//Get policy number from Excel sheet which is generated by data generator using auto generated policy number created copy submission
			
			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNo()).build());
			
			pc.copySubmission();
			
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
						
			pc.reviewPolicy(PolicyReview.builder(BusinessOwnersConstants.PolicyReviewType.NONE).build());
			
			pc.issuepolicy(BusinessOwnersConstants.Transactions.SUBMISSION);
			
			pc.viewPolicy();
			
			//old code
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
	 * Test Description: Verify whether the User able to process Flat policy cancellation transaction for business owners policy.
	 * Test ID: TC224
	 * @author Manikandan.manohar
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Verify whether the User able to process Flat policy cancellation transaction for business owners policy.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC224(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("Verify whether the User able to process Flat policy cancellation transaction for business owners policy.", driver);
		BusinessOwnersDataEngine testData = new BusinessOwnersDataEngine("GWTestData_DataEngine.xlsx", "BusinessOwners", "TC224");
		try {	

			BusinessOwnersStepsImpl pc = BusinessOwnersSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			//Get policy number from Excel sheet which is generated by data generator using auto generated policy number created copy submission

			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNo()).build());
			
			pc.copySubmission();
			
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
						
			pc.reviewPolicy(PolicyReview.builder(BusinessOwnersConstants.PolicyReviewType.NONE).build());
			
			pc.issuepolicy(BusinessOwnersConstants.Transactions.SUBMISSION);
			
			pc.viewPolicy();
			
			//old code 
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
	 * Test Description: Policy Reinstatement transaction for business owners policy.
	 * Test ID: TC226
	 * @author Manikandan.manohar
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Policy Reinstatement transaction for business owners policy", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC226(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("Policy Reinstatement transaction for business owners policy", driver);
		BusinessOwnersDataEngine testData = new BusinessOwnersDataEngine("GWTestData_DataEngine.xlsx", "BusinessOwners", "TC226");
		try {	

			BusinessOwnersStepsImpl pc = BusinessOwnersSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			//Get policy number from Excel sheet which is generated by data generator using auto generated policy number created copy submission

			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNo()).build());
			
			pc.copySubmission();
		
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
						
			pc.reviewPolicy(PolicyReview.builder(BusinessOwnersConstants.PolicyReviewType.NONE).build());
			
			pc.issuepolicy(BusinessOwnersConstants.Transactions.SUBMISSION);
			
			pc.viewPolicy();
			
			//old code 
			pc.cancelPolicy(CancellationSource.builder().source(testData.getCancellationSource())
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
	 * Test Description: Check whether the contingency action - Change policy retroactively is taken after the due date for businessowners policy.
	 * Test ID: TC335
	 * @author Manikandan.manohar
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Check whether the contingency action - Change policy retroactively is taken after the due date for businessowners policy.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC335(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("Check whether the contingency action - Change policy retroactively is taken after the due date for businessowners policy.", driver);
		BusinessOwnersDataEngine testData = new BusinessOwnersDataEngine("GWTestData_DataEngine.xlsx", "BusinessOwners", "TC335");
		try {	

			BusinessOwnersStepsImpl pc = BusinessOwnersSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			//Get policy number from Excel sheet which is generated by data generator using auto generated policy number created copy submission
			

			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNo()).build());
			
			pc.copySubmission();
			
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
						
			pc.reviewPolicy(PolicyReview.builder(BusinessOwnersConstants.PolicyReviewType.NONE).build());
			
			pc.issuepolicy(BusinessOwnersConstants.Transactions.SUBMISSION);
			
			pc.viewPolicy();
			
			//old code
			
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
	 * Test Description: Check whether the contingency action - Change policy for remainder of term is taken after the due date.
	 * Test ID: TC336
	 * @author Manikandan.manohar
	 * @param browser
	 * @throws Exception
	 */
	@Test(description = "Check whether the contingency action - Change policy for remainder of term is taken after the due date.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC336(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		BusinessOwnersDataEngine testData = new BusinessOwnersDataEngine("GWTestData_DataEngine.xlsx", "BusinessOwners", "TC336");
		Log.testCaseInfo("Check whether the contingency action - Change policy for remainder of term is taken after the due date.", driver);
		try {	

			BusinessOwnersStepsImpl pc = BusinessOwnersSteps.create();

			pc.loginIntoTheApplication("su", "gw");
			//Get policy number from Excel sheet which is generated by data generator using auto generated policy number created copy submission

			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNo()).build());
			
			pc.copySubmission();
			
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
						
			pc.reviewPolicy(PolicyReview.builder(BusinessOwnersConstants.PolicyReviewType.NONE).build());
			
			pc.issuepolicy(BusinessOwnersConstants.Transactions.SUBMISSION);
			
			pc.viewPolicy();
			
			//old code
			
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
	 * Test Description: Check whether the contingency action - Cancel retroactively is taken after the due date.
	 * Test ID: TC337
	 * @author Manikandan.manohar
	 * @param browser
	 * @throws Exception
	 */
	@Test(description = "Check whether the contingency action - Cancel retroactively is taken after the due date.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC337(String browser) throws Exception {
		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("Check whether the contingency action - Cancel retroactively is taken after the due date.", driver);
		BusinessOwnersDataEngine testData = new BusinessOwnersDataEngine("GWTestData_DataEngine.xlsx", "BusinessOwners", "TC337");Log.testCaseInfo("Check whether the contingency action - Cancel retroactively is taken after the due date.", driver);
		try {	

			BusinessOwnersStepsImpl pc = BusinessOwnersSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			//Get policy number from Excel sheet which is generated by data generator using auto generated policy number created copy submission
			

			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNo()).build());
			
			pc.copySubmission();
			
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
						
			pc.reviewPolicy(PolicyReview.builder(BusinessOwnersConstants.PolicyReviewType.NONE).build());
			
			pc.issuepolicy(BusinessOwnersConstants.Transactions.SUBMISSION);
			
			pc.viewPolicy();
			
			//old code
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
	 * Test Description: Check whether the contingency action - Cancel remainder of term is taken after the due date.
	 * Test ID: TC338
	 * @author Manikandan.manohar
	 * @param browser
	 * @throws Exception
	 */
	@Test(description = "Check whether the contingency action - Cancel remainder of term is taken after the due date.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC338(String browser) throws Exception {
		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		BusinessOwnersDataEngine testData = new BusinessOwnersDataEngine("GWTestData_DataEngine.xlsx", "BusinessOwners", "TC338");
		Log.testCaseInfo("Check whether the contingency action - Cancel remainder of term is taken after the due date.", driver);
		try {	

			BusinessOwnersStepsImpl pc = BusinessOwnersSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			//Get policy number from Excel sheet which is generated by data generator using auto generated policy number created copy submission		

			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNo()).build());
			
			pc.copySubmission();
			
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
						
			pc.reviewPolicy(PolicyReview.builder(BusinessOwnersConstants.PolicyReviewType.NONE).build());
			
			pc.issuepolicy(BusinessOwnersConstants.Transactions.SUBMISSION);
			
			pc.viewPolicy();
			
			//old code
			
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
	 * Test Description: Check whether the contingency action - Cancel / Rewrite is taken after the due date.
	 * Test ID: TC339
	 * @author Manikandan.manohar
	 * @param browser
	 * @throws Exception
	 */
	@Test(description = "Check whether the contingency action - Cancel / Rewrite is taken after the due date.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC339(String browser) throws Exception {
		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("Check whether the contingency action - Cancel / Rewrite is taken after the due date.", driver);
		BusinessOwnersDataEngine testData = new BusinessOwnersDataEngine("GWTestData_DataEngine.xlsx", "BusinessOwners", "TC339");
		try {	

			BusinessOwnersStepsImpl pc = BusinessOwnersSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			//Get policy number from Excel sheet which is generated by data generator using auto generated policy number created copy submission
			
			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNo()).build());
			
			pc.copySubmission();
			
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
						
			pc.reviewPolicy(PolicyReview.builder(BusinessOwnersConstants.PolicyReviewType.NONE).build());
			
			pc.issuepolicy(BusinessOwnersConstants.Transactions.SUBMISSION);
			
			pc.viewPolicy();
			
			//old code
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
	 * Test Description: Check whether the user is able to upload the required document for a contingency for businessowners policy.
	 * Test ID: TC333
	 * @author Manikandan.manohar
	 * @param browser
	 * @throws Exception
	 */
	@Test(description = "Check whether the user is able to upload the required document for a contingency for businessowners policy.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC333(String browser) throws Exception {
		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("Check whether the user is able to upload the required document for a contingency for businessowners policy.", driver);
		BusinessOwnersDataEngine testData = new BusinessOwnersDataEngine("GWTestData_DataEngine.xlsx", "BusinessOwners", "TC333");
		try {	

			BusinessOwnersStepsImpl pc = BusinessOwnersSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			//Get policy number from Excel sheet which is generated by data generator using auto generated policy number created copy submission
			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNo()).build());
			
			pc.copySubmission();
			
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.CONTINGENCY)
					.contingencyTitle(testData.getContingencyDescription())
					.contingencyDescription(testData.getContingencyDescription())
					.contingencyAction(testData.getContingencyAction())
					.contingencyDueDate(testData.getEffectiveDateOneMonthAhead())
					.build());
			
			pc.reviewPolicy(PolicyReview.builder(BusinessOwnersConstants.PolicyReviewType.NONE).build());
			
			pc.issuepolicy(BusinessOwnersConstants.Transactions.SUBMISSION);
			
			pc.viewPolicy();
			
			//old code
			pc.CompletedPolicyTransactions();
			
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.ATTACH_DOCUMENT_CONTINGENCY)
					.documentName("orrange.png")
					.contingencyDocumentStatus(testData.getContingencyDocumentStatus())
					.contingencyDocumentType(testData.getContingencyDocumentType())
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
	 * Test Description: Check whether the user is able to waive a contingency manually.
	 * Test ID: TC332
	 * @author Manikandan.manohar
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Check whether the user is able to waive a contingency manually.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC332(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("Check whether the user is able to waive a contingency manually.", driver);
		BusinessOwnersDataEngine testData = new BusinessOwnersDataEngine("GWTestData_DataEngine.xlsx", "BusinessOwners", "TC332");
		try {	

			BusinessOwnersStepsImpl pc = BusinessOwnersSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			//Get policy number from Excel sheet which is generated by data generator using auto generated policy number created copy submission
			
			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNo()).build());
			
			pc.copySubmission();
			
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.CONTINGENCY)
					.contingencyTitle(testData.getContingencyDescription())
					.contingencyDescription(testData.getContingencyDescription())
					.contingencyAction(testData.getContingencyAction())
					.contingencyDueDate(testData.getEffectiveDateOneMonthAhead())
					.build());
			
			pc.reviewPolicy(PolicyReview.builder(BusinessOwnersConstants.PolicyReviewType.NONE).build());
			
			pc.issuepolicy(BusinessOwnersConstants.Transactions.SUBMISSION);
			
			pc.viewPolicy();
			
			//old code
			pc.CompletedPolicyTransactions();
			
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
	 * Test Description:Verify whether the user is able to issue a policy with manual loss history for Blocking quote release
	 * Test ID: TC325
	 * @author Manikandan.manohar
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Verify whether the user is able to issue a policy with manual loss history for Blocking quote release", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC325(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("Verify whether the user is able to issue a policy with manual loss history for Blocking quote release", driver);
		BusinessOwnersDataEngine testData = new BusinessOwnersDataEngine("GWTestData_DataEngine.xlsx", "BusinessOwners", "TC325");
		try {	

			BusinessOwnersStepsImpl pc = BusinessOwnersSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchAccount(EnterAccountInformation.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.build());

			pc.createAccount(CreateNewAccountFromPerson.builder()
					.firstName(testData.getFirstName())
					.addressLine1(testData.getAddressLine1())
					.state(testData.getState())
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType())
					.organization(testData.getOrganization())
					.build());

			pc.selectProduct(BusinessOwnersConstants.ProductNames.BUSINESS_OWNERS);

			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());

			pc.selectQualifications(Qualification.builder().build());

			pc.updatePolicyInfo(PolicyInfo.builder().organizationType(testData.getOrganizationType()).build());

			pc.updateBusinessOwnersLine(UpdateBusinessOwnersLine.builder().businessType(testData.getBusinessType()).build());

			pc.addLocationDetails(AddLocationDetails.builder().build());

			pc.addBuildingDetails(AddBuildingDetails.builder().basicAmount(testData.getAmount())
					.buildingLimit(testData.getAmount()).businessPropertyLimit(testData.getAmount()).build());
			
			pc.addModifiersDetails();

			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.PRIORLOSSES_MANUAL_ENTER).lossHistoryType(testData.getLossHistoryType())
					.lossCount(1)
					.occurenceDateField(DataFakers.currentDate())
					.priorLossDescription(testData.getPriorLoss()).totalIncurred(testData.getTotalIncurred()).
					 amountPaid(testData.getAmountPaid()).openReserve(testData.getOpenReserve())
					.lossHistoryStatus(testData.getLossHistoryStatus())
					.build());

			pc.reviewPolicy(PolicyReview.builder(BusinessOwnersConstants.PolicyReviewType.NONE).build());
			
			pc.viewForms();
			
			pc.selectPayments(Payments.builder().build());
			
			pc.issuepolicy(BusinessOwnersConstants.Transactions.SUBMISSION);
			
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
	 * Test Description: Verify whether user able to add an underwriter issue manually for businessowners policy.
	 * Test ID: TC318
	 * @author Manikandan.manohar
	 * @param browser
	 * @throws Exception
	 */
	@Test(description = "Verify whether user able to add an underwriter issue manually for businessowners policy.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC318(String browser) throws Exception {
		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("Verify whether user able to add an underwriter issue manually for businessowners policy.", driver);
		BusinessOwnersDataEngine testData = new BusinessOwnersDataEngine("GWTestData_DataEngine.xlsx", "BusinessOwners", "TC318");
		try {	

			BusinessOwnersStepsImpl pc = BusinessOwnersSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchAccount(EnterAccountInformation.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.build());

			pc.createAccount(CreateNewAccountFromPerson.builder()
					.firstName(testData.getFirstName())
					.addressLine1(testData.getAddressLine1())
					.state(testData.getState())
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType())
					.organization(testData.getOrganization())
					.build());


			pc.selectProduct(BusinessOwnersConstants.ProductNames.BUSINESS_OWNERS);

			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());

			pc.selectQualifications(Qualification.builder().build());

			pc.updatePolicyInfo(PolicyInfo.builder().organizationType(testData.getOrganizationType()).build());

			pc.updateBusinessOwnersLine(UpdateBusinessOwnersLine.builder().businessType(testData.getBusinessType()).build());

			pc.addLocationDetails(AddLocationDetails.builder().build());

			pc.addBuildingDetails(AddBuildingDetails.builder().basicAmount(testData.getAmount())
					.buildingLimit(testData.getAmount()).businessPropertyLimit(testData.getAmount()).build());
			
			pc.addModifiersDetails();
			
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.UW_ISSUE)
					.uWIssueType(testData.getUwIssueType())
					.longDescription(testData.getDescription())
					.build());	
			
			pc.reviewPolicy(PolicyReview.builder(BusinessOwnersConstants.PolicyReviewType.NONE)
					.build());
			
			pc.approveUWissue(UWIssueType.builder()
					.IssueType(testData.getUwIssueType())
					.build());
			
			pc.reviewPolicy(PolicyReview.builder(BusinessOwnersConstants.PolicyReviewType.NONE)
					.build());
			
			pc.viewForms();
			
			pc.selectPayments(Payments.builder().build());
			
			
			pc.issuepolicy(BusinessOwnersConstants.Transactions.SUBMISSION);
			
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
	 * Test Description:  Verify whether user able to add an underwriter issue manually.
	 * Test ID: TC319
	 * @author Manikandan.manohar
	 * @param browser
	 * @throws Exception
	 */
	@Test(description = "Verify whether user able to add an underwriter issue manually.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC319(String browser) throws Exception {
		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("Verify whether user able to add an underwriter issue manually.", driver);
		BusinessOwnersDataEngine testData = new BusinessOwnersDataEngine("GWTestData_DataEngine.xlsx", "BusinessOwners", "TC319");
		try {	

			BusinessOwnersStepsImpl pc = BusinessOwnersSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchAccount(EnterAccountInformation.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.build());

			pc.createAccount(CreateNewAccountFromPerson.builder()
					.firstName(testData.getFirstName())
					.addressLine1(testData.getAddressLine1())
					.state(testData.getState())
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType())
					.organization(testData.getOrganization())
					.build());


			pc.selectProduct(BusinessOwnersConstants.ProductNames.BUSINESS_OWNERS);

			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());

			pc.selectQualifications(Qualification.builder().build());

			pc.updatePolicyInfo(PolicyInfo.builder().organizationType(testData.getOrganizationType()).build());

			pc.updateBusinessOwnersLine(UpdateBusinessOwnersLine.builder().businessType(testData.getBusinessType()).build());

			pc.addLocationDetails(AddLocationDetails.builder().build());

			pc.addBuildingDetails(AddBuildingDetails.builder().basicAmount(testData.getAmount())
					.buildingLimit(testData.getAmount()).businessPropertyLimit(testData.getAmount()).build());
			
			pc.addModifiersDetails();
			
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.UW_ISSUE)
					.uWIssueType(testData.getUwIssueType())
					.longDescription(testData.getDescription())
					.build());	
			
			pc.reviewPolicy(PolicyReview.builder(BusinessOwnersConstants.PolicyReviewType.NONE).build());
			
			
			pc.viewForms();
			
			pc.selectPayments(Payments.builder().build());
			
			pc.issuepolicy(BusinessOwnersConstants.Transactions.BIND_ONLY);
			
			pc.approveUWissue(UWIssueType.builder()
					.IssueType(testData.getUwIssueType())
					.build());
			
			pc.reviewPolicy(PolicyReview.builder(BusinessOwnersConstants.PolicyReviewType.NONE).build());
			
			pc.viewForms();
			
			pc.selectPayments(Payments.builder().build());
			
			pc.issuepolicy(BusinessOwnersConstants.Transactions.SUBMISSION);
			
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
	 * Test Description:Verify whether the user is able to add an underwriter issue manually.
	 * Test ID: TC320
	 * @author Manikandan.manohar
	 * @param browser
	 * @throws Exception
	 */
	@Test(description = "Verify whether the user is able to add an underwriter issue manually.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC320(String browser) throws Exception {
		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("Verify whether the user is able to add an underwriter issue manually.", driver);
		BusinessOwnersDataEngine testData = new BusinessOwnersDataEngine("GWTestData_DataEngine.xlsx", "BusinessOwners", "TC320");
		try {	

			BusinessOwnersStepsImpl pc = BusinessOwnersSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchAccount(EnterAccountInformation.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.build());

			pc.createAccount(CreateNewAccountFromPerson.builder()
					.firstName(testData.getFirstName())
					.addressLine1(testData.getAddressLine1())
					.state(testData.getState())
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType())
					.organization(testData.getOrganization())
					.build());


			pc.selectProduct(BusinessOwnersConstants.ProductNames.BUSINESS_OWNERS);

			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());

			pc.selectQualifications(Qualification.builder().build());

			pc.updatePolicyInfo(PolicyInfo.builder().organizationType(testData.getOrganizationType()).build());

			pc.updateBusinessOwnersLine(UpdateBusinessOwnersLine.builder().businessType(testData.getBusinessType()).build());

			pc.addLocationDetails(AddLocationDetails.builder().build());

			pc.addBuildingDetails(AddBuildingDetails.builder()
					.basicAmount(testData.getAmount())
					.buildingLimit(testData.getAmount())
					.businessPropertyLimit(testData.getAmount())
					.build());
			
			pc.addModifiersDetails();
			
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.UW_ISSUE)
					.uWIssueType(testData.getUwIssueType())
					.longDescription(testData.getDescription())
					.build());	
			
			pc.reviewPolicy(PolicyReview.builder(BusinessOwnersConstants.PolicyReviewType.NONE).build());
			
			pc.viewForms();
			
			pc.selectPayments(Payments.builder().build());
			
			pc.issuepolicy(BusinessOwnersConstants.Transactions.SUBMISSION);
			
			pc.approveUWissue(UWIssueType.builder()
					.IssueType(testData.getUwIssueType())
					.build());
			
			pc.reviewPolicy(PolicyReview.builder(BusinessOwnersConstants.PolicyReviewType.NONE).build());
			
			pc.viewForms();
			
			pc.selectPayments(Payments.builder().build());
			
			pc.issuepolicy(BusinessOwnersConstants.Transactions.SUBMISSION);
			
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
	 * Test Description: Verify whether the user is able to reopen the closed UW issue for businessowners (Convenience-Store) policy.
	 * Test ID: TC321
	 * @author Manikandan.manohar
	 * @param browser
	 * @throws Exception
	 */
	@Test(description = "Verify whether the user is able to reopen the closed UW issue for businessowners (Convenience-Store) policy.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC321(String browser) throws Exception {
		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("Verify whether the user is able to reopen the closed UW issue for businessowners (Convenience-Store) policy.", driver);
		BusinessOwnersDataEngine testData = new BusinessOwnersDataEngine("GWTestData_DataEngine.xlsx", "BusinessOwners", "TC321");
		try {	

			BusinessOwnersStepsImpl pc = BusinessOwnersSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchAccount(EnterAccountInformation.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.build());

			pc.createAccount(CreateNewAccountFromPerson.builder()
					.firstName(testData.getFirstName())
					.addressLine1(testData.getAddressLine1())
					.state(testData.getState())
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType())
					.organization(testData.getOrganization())
					.build());


			pc.selectProduct(BusinessOwnersConstants.ProductNames.BUSINESS_OWNERS);

			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());

			pc.selectQualifications(Qualification.builder().build());

			pc.updatePolicyInfo(PolicyInfo.builder().organizationType(testData.getOrganizationType()).build());

			pc.updateBusinessOwnersLine(UpdateBusinessOwnersLine.builder().businessType(testData.getBusinessType()).build());

			pc.addLocationDetails(AddLocationDetails.builder().build());

			pc.addBuildingDetails(AddBuildingDetails.builder()
					.basicAmount(testData.getAmount())
					.buildingLimit(testData.getAmount())
					.businessPropertyLimit(testData.getAmount()).build());
			
			pc.addModifiersDetails();
			
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.UW_ISSUE)
					.uWIssueType(testData.getUwIssueType())
					.longDescription(testData.getDescription())
					.build());
			
			pc.reviewPolicy(PolicyReview.builder(BusinessOwnersConstants.PolicyReviewType.NONE)
					.build());
			
			pc.approveUWissue(UWIssueType.builder()
					.IssueType(testData.getUwIssueType())
					.build());
			
			pc.reviewPolicy(PolicyReview.builder(BusinessOwnersConstants.PolicyReviewType.REOPEN)
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
	 * Test Description: Verify whether the user is able to reopen the closed UW issue.
	 * Test ID: TC323
	 * @author Manikandan.manohar
	 * @param browser
	 * @throws Exception
	 */
	@Test(description = "Verify whether the user is able to reopen the closed UW issue.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC323(String browser) throws Exception {
		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("Verify whether the user is able to reopen the closed UW issue.", driver);
		BusinessOwnersDataEngine testData = new BusinessOwnersDataEngine("GWTestData_DataEngine.xlsx", "BusinessOwners", "TC323");
		try {	

			BusinessOwnersStepsImpl pc = BusinessOwnersSteps.create();

			pc.loginIntoTheApplication("su", "gw");
			
			pc.searchAccount(EnterAccountInformation.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.build());

			pc.createAccount(CreateNewAccountFromPerson.builder()
					.firstName(testData.getFirstName())
					.addressLine1(testData.getAddressLine1())
					.state(testData.getState())
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType())
					.organization(testData.getOrganization())
					.build());


			pc.selectProduct(BusinessOwnersConstants.ProductNames.BUSINESS_OWNERS);

			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());

			pc.selectQualifications(Qualification.builder().build());

			pc.updatePolicyInfo(PolicyInfo.builder().organizationType(testData.getOrganizationType()).build());

			pc.updateBusinessOwnersLine(UpdateBusinessOwnersLine.builder().businessType(testData.getBusinessType()).build());

			pc.addLocationDetails(AddLocationDetails.builder().build());

			pc.addBuildingDetails(AddBuildingDetails.builder()
					.basicAmount(testData.getAmount())
					.buildingLimit(testData.getAmount())
					.businessPropertyLimit(testData.getAmount()).build());
			
			pc.addModifiersDetails();
			
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.UW_ISSUE)
					.uWIssueType(testData.getUwIssueType())
					.longDescription(testData.getDescription()).build());
			
			pc.reviewPolicy(PolicyReview.builder(BusinessOwnersConstants.PolicyReviewType.NONE).build());
			
			pc.viewForms();
			
			pc.selectPayments(Payments.builder().build());
			
			pc.issuepolicy(BusinessOwnersConstants.Transactions.SUBMISSION);
			
			pc.approveUWissue(UWIssueType.builder()
					.IssueType(testData.getUwIssueType())
					.build());
			
			pc.reviewPolicy(PolicyReview.builder(BusinessOwnersConstants.PolicyReviewType.REOPEN)
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
	 * Test Description: Verify whether the user is able to issue a policy with manual loss history for Blocking issuance
	 * Test ID: TC326
	 * @author Manikandan.manohar
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Verify whether the user is able to issue a policy with manual loss history for Blocking issuance", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC326(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("Verify whether the user is able to issue a policy with manual loss history for Blocking issuance", driver);
		BusinessOwnersDataEngine testData = new BusinessOwnersDataEngine("GWTestData_DataEngine.xlsx", "BusinessOwners", "TC326");
		try {	

			BusinessOwnersStepsImpl pc = BusinessOwnersSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchAccount(EnterAccountInformation.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.build());

			pc.createAccount(CreateNewAccountFromPerson.builder()
					.firstName(testData.getFirstName())
					.addressLine1(testData.getAddressLine1())
					.state(testData.getState())
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType())
					.organization(testData.getOrganization())
					.build());


			pc.selectProduct(BusinessOwnersConstants.ProductNames.BUSINESS_OWNERS);

			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());

			pc.selectQualifications(Qualification.builder().build());

			pc.updatePolicyInfo(PolicyInfo.builder().organizationType(testData.getOrganizationType()).build());

			pc.updateBusinessOwnersLine(UpdateBusinessOwnersLine.builder().businessType(testData.getBusinessType()).build());

			pc.addLocationDetails(AddLocationDetails.builder().build());

			pc.addBuildingDetails(AddBuildingDetails.builder().basicAmount(testData.getAmount())
					.buildingLimit(testData.getAmount()).businessPropertyLimit(testData.getAmount()).build());
			pc.addModifiersDetails();

			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.PRIORLOSSES_ATTACH_DOCUMENT)
					.lossHistoryType(testData.getLossHistoryType())
					.lossPercent(testData.getLossPercent())
					.lossTotalIncurred(testData.getAmount())
					.documentName("orrange.png")
					.uploadDocumentStatus(testData.getUploadDocumentStatus())
					.build());

			
			pc.reviewPolicy(PolicyReview.builder(BusinessOwnersConstants.PolicyReviewType.NONE).build());
			
			pc.viewForms();
			
			pc.selectPayments(Payments.builder().build());
			
			pc.issuepolicy(BusinessOwnersConstants.Transactions.SUBMISSION);
			
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
	 * Test Description:Verify whether the user is able to add prior policies and contigencies manually in Risk Analysis screen.
	 * Test ID: TC329
	 * @author Manikandan.manohar
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Verify whether the user is able to add prior policies and contigencies manually in Risk Analysis screen.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC329(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("Verify whether the user is able to add prior policies and contigencies manually in Risk Analysis screen.", driver);
		BusinessOwnersDataEngine testData = new BusinessOwnersDataEngine("GWTestData_DataEngine.xlsx", "BusinessOwners", "TC329");
		try {	

			BusinessOwnersStepsImpl pc = BusinessOwnersSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchAccount(EnterAccountInformation.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.build());

			pc.createAccount(CreateNewAccountFromPerson.builder()
					.firstName(testData.getFirstName())
					.addressLine1(testData.getAddressLine1())
					.state(testData.getState())
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType())
					.organization(testData.getOrganization())
					.build());


			pc.selectProduct(BusinessOwnersConstants.ProductNames.BUSINESS_OWNERS);

			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());

			pc.selectQualifications(Qualification.builder().build());

			pc.updatePolicyInfo(PolicyInfo.builder().organizationType(testData.getOrganizationType()).build());

			pc.updateBusinessOwnersLine(UpdateBusinessOwnersLine.builder().businessType(testData.getBusinessType()).build());

			pc.addLocationDetails(AddLocationDetails.builder().build());

			pc.addBuildingDetails(AddBuildingDetails.builder().basicAmount(testData.getAmount())
					.buildingLimit(testData.getAmount()).businessPropertyLimit(testData.getAmount()).build());
			
			pc.addModifiersDetails();

			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.PRIORLOSSES_MANUAL_ENTER)
					.lossHistoryType(testData.getLossHistoryType())
					.lossCount(1)
					.occurenceDateField(DataFakers.currentDate())
					.priorLossDescription(testData.getPriorLoss()).totalIncurred(testData.getTotalIncurred())
					.amountPaid(testData.getAmountPaid()).openReserve(testData.getOpenReserve())
					.lossHistoryStatus(testData.getLossHistoryStatus()).build());
			
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.CONTINGENCY)
					.contingencyTitle(testData.getContingencyDescription())
					.contingencyDescription(testData.getContingencyDescription())
					.contingencyAction(testData.getContingencyAction())
					.contingencyDueDate(testData.getEffectiveDateOneMonthAhead()).build());

			pc.reviewPolicy(PolicyReview.builder(BusinessOwnersConstants.PolicyReviewType.NONE).build());
			
			pc.viewForms();
			
			pc.selectPayments(Payments.builder().build());
			
			pc.issuepolicy(BusinessOwnersConstants.Transactions.SUBMISSION);
			
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
	 * Test Description: Verify whether the user is able to view the prefilled claims in Risk Analysis screen.
	 * Test ID: TC328
	 * @author Manikandan.manohar
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Verify whether user able to Reopen an underwriter issue which was blocking the quote", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC328(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("Verify whether user able to Reopen an underwriter issue which was blocking the quote", driver);
		BusinessOwnersDataEngine testData = new BusinessOwnersDataEngine("GWTestData_DataEngine.xlsx", "BusinessOwners", "TC328");
		try {	

			BusinessOwnersStepsImpl pc = BusinessOwnersSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchAccount(EnterAccountInformation.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.build());

			pc.createAccount(CreateNewAccountFromPerson.builder()
					.firstName(testData.getFirstName())
					.addressLine1(testData.getAddressLine1())
					.state(testData.getState())
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType())
					.organization(testData.getOrganization())
					.build());


			pc.selectProduct(BusinessOwnersConstants.ProductNames.BUSINESS_OWNERS);

			pc.selectOfferings(Offerings.builder().offerings(testData.getOfferings()).build());

			pc.selectQualifications(Qualification.builder().build());

			pc.updatePolicyInfo(PolicyInfo.builder().organizationType(testData.getOrganizationType()).build());

			pc.updateBusinessOwnersLine(UpdateBusinessOwnersLine.builder().businessType(testData.getBusinessType()).build());

			pc.addLocationDetails(AddLocationDetails.builder().build());

			pc.addBuildingDetails(AddBuildingDetails.builder()
					.basicAmount(testData.getAmount())
					.buildingLimit(testData.getAmount())
					.businessPropertyLimit(testData.getAmount())
					.build());

			pc.addModifiersDetails();
			
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.UW_ISSUE)
					.uWIssueType(testData.getUwIssueType())
				.longDescription(testData.getDescription())
				.build());
			
			pc.reviewPolicy(PolicyReview.builder(BusinessOwnersConstants.PolicyReviewType.NONE)
					.build());
			
			pc.approveUWissue(UWIssueType.builder()
					.IssueType(testData.getUwIssueType())
					.build());
			
			pc.reviewPolicy(PolicyReview.builder(BusinessOwnersConstants.PolicyReviewType.REOPEN).build());

			Log.testCaseResult(driver);

		} catch (Exception e) {
			Log.exception(e, DriverManager.getDriver());
		} finally {
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}

}