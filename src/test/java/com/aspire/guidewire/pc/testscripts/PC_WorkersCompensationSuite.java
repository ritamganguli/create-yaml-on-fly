package com.aspire.guidewire.pc.testscripts;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationConstants;
import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationConstants.ProductNames;
import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationConstants.Transactions;
import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationFeatures.AddLocationDetails;
import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationFeatures.AddWcCoverages;
import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationFeatures.AddWcoptions;
import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationFeatures.CancellationSource;
import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationFeatures.CloseOptions;
import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationFeatures.CreateNewAccountFromPerson;
import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationFeatures.EnterAccountInformation;
import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationFeatures.Payments;
import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationFeatures.PolicyChange;
import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationFeatures.PolicyDetails;
import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationFeatures.PolicyInfo;
import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationFeatures.PolicyReview;
import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationFeatures.PreRenewalDirection;
import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationFeatures.Qualification;
import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationFeatures.ReinstatementReason;
import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationFeatures.RenewPolicy;
import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationFeatures.RiskAnalysis;
import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationDataEngine;
import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationSteps;
import com.aspire.guidewire.pc.teststeps.workerscompensation.WorkersCompensationStepsImpl;
import com.aspire.guidewire.utils.DataProviderUtils;
import com.aspire.guidewire.utils.Log;
import com.aspire.guidewire.webdriverManager.DriverManager;



public class PC_WorkersCompensationSuite {

	String pCWebSite, browser;

	protected static ThreadLocal<WebDriver> threadLocalDriver = new ThreadLocal<>();

	@BeforeTest(alwaysRun = true)
	
	public void init(ITestContext context) {
		
		pCWebSite = (System.getProperty("pCWebSite") != null ? System.getProperty("pCWebSite"): context.getCurrentXmlTest().getParameter("pCWebSite"));
		DriverManager.setPCWebsite(pCWebSite);
	}

	/**
	 * @author vignesh.ravi
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Verify whether user able to Create a workers compensation policy with Check -  upfront payment method.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC147(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		WorkersCompensationDataEngine testData = new WorkersCompensationDataEngine("GWTestData_DataEngine.xlsx", "WorkersCompensation", "TC147");
		
		Log.testCaseInfo("Verify whether user able to Create a workers compensation policy with Check -  upfront payment method.", driver);
		try {	

			
			WorkersCompensationStepsImpl pc = WorkersCompensationSteps.create();

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

			pc.selectProduct(ProductNames.WORKERS_COMPENSATION);

			pc.selectQualifications(Qualification.builder()
					.build());

			pc.updatePolicyInfo(PolicyInfo.builder()
					.ssn(testData.getSsn())
					.policyTerm(testData.getPolicyTerm())
					.organizationType(testData.getOrganizationType())
					.build());
			
			pc.addLocationDetails(AddLocationDetails.builder().build());

			pc.addWcCoverages(AddWcCoverages.builder()
					.governingLaw(testData.getGoverningLaw())
					.basis(testData.getBasis())
            		.code(testData.getCode())
            		.build());
			
			pc.addSupplemental();
			
			pc.addWcoptions(AddWcoptions.builder()
					.description(testData.getText())
					.build());
			
			pc.selectRiskAnalysis(RiskAnalysis.builder().build());
			
			pc.reviewPolicy(PolicyReview.builder(WorkersCompensationConstants.PolicyReviewType.NONE).build());
			pc.viewQuote();
			pc.viewForms();
			pc.selectPayments(Payments.builder()
					.upFrontPayment(testData.getUpFrontPayment())
					.build());
			pc.issuepolicy(WorkersCompensationConstants.Transactions.SUBMISSION);
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
	@Test(description="Verify whether user able to Close a workers compensation policy with the reason 'With Drawn", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC159(String browser) throws Exception {
		
		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		WorkersCompensationDataEngine testData = new WorkersCompensationDataEngine("GWTestData_DataEngine.xlsx", "WorkersCompensation", "TC159");
		Log.testCaseInfo("Verify whether user able to Close a workers compensation policy with the reason 'With Drawn",driver);
		try {	
			
			
			WorkersCompensationStepsImpl pc = WorkersCompensationSteps.create();
			
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
			
			pc.selectProduct(ProductNames.WORKERS_COMPENSATION);
			
			pc.selectQualifications(Qualification.builder()
					.build());
			
			pc.updatePolicyInfo(PolicyInfo.builder()
					.ssn(testData.getSsn())
					.policyTerm(testData.getPolicyTerm())
					.organizationType(testData.getOrganizationType())
					.build());
			
			pc.addLocationDetails(AddLocationDetails.builder().build());
			
			pc.addWcCoverages(AddWcCoverages.builder()
					.governingLaw(testData.getGoverningLaw())
					.basis(testData.getBasis())
            		.code(testData.getCode())
            		.build());
			
			pc.addSupplemental();
			
			pc.addWcoptions(AddWcoptions.builder()
					.description(testData.getText())
					. build());
			
			pc.selectRiskAnalysis(RiskAnalysis.builder().build());
			
			pc.reviewPolicy(PolicyReview.builder(WorkersCompensationConstants.PolicyReviewType.NONE).build());
			pc.viewQuote();
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.policyCloseOptions(CloseOptions.builder(WorkersCompensationConstants.CloseOptionType.WITHDRAW_TRANSACTION)
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
	@Test(description="Verify whether user able to Decline the workers compensation policy.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC156(String browser) throws Exception {
		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		WorkersCompensationDataEngine testData = new WorkersCompensationDataEngine("GWTestData_DataEngine.xlsx", "WorkersCompensation", "TC156");
		Log.testCaseInfo("Verify whether user able to Decline the workers compensation policy.", driver);
		
		try {	
			
			WorkersCompensationStepsImpl pc = WorkersCompensationSteps.create();
			
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
			
			pc.selectProduct(ProductNames.WORKERS_COMPENSATION);
			
			pc.selectQualifications(Qualification.builder()
					.build());
			
			pc.updatePolicyInfo(PolicyInfo.builder()
					.ssn(testData.getSsn())
					.policyTerm(testData.getPolicyTerm())
					.organizationType(testData.getOrganizationType())
					.build());
			
			pc.addLocationDetails(AddLocationDetails.builder().build());
			
			pc.addWcCoverages(AddWcCoverages.builder()
					.governingLaw(testData.getGoverningLaw())
					.basis(testData.getBasis())
            		.code(testData.getCode())
            		.build());
			
			pc.addSupplemental();
			
			pc.addWcoptions(AddWcoptions.builder()
					.description(testData.getText())
					.build());
			
			pc.selectRiskAnalysis(RiskAnalysis.builder().build());
			
			pc.reviewPolicy(PolicyReview.builder(WorkersCompensationConstants.PolicyReviewType.NONE).build());
			pc.viewQuote();
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.policyCloseOptions(CloseOptions.builder(WorkersCompensationConstants.CloseOptionType.DECLINE)
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
	 * @author vignesh.ravi
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Verify whether user able to Close the workers compensation policy with the reason Not Taken", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC155(String browser) throws Exception {
		
		
		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("Verify whether user able to Close the workers compensation policy with the reason Not Taken", driver);
		WorkersCompensationDataEngine testData = new WorkersCompensationDataEngine("GWTestData_DataEngine.xlsx", "WorkersCompensation", "TC155");
		try {	
			
			WorkersCompensationStepsImpl pc = WorkersCompensationSteps.create();
			
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
			
			pc.selectProduct(ProductNames.WORKERS_COMPENSATION);
			
			pc.selectQualifications(Qualification.builder()
					.build());
			
			pc.updatePolicyInfo(PolicyInfo.builder()
					.ssn(testData.getSsn())
					.policyTerm(testData.getPolicyTerm())
					.organizationType(testData.getOrganizationType())
					.build());
			
			pc.addLocationDetails(AddLocationDetails.builder().build());
			
			pc.addWcCoverages(AddWcCoverages.builder()
					.governingLaw(testData.getGoverningLaw())
					.basis(testData.getBasis())
            		.code(testData.getCode())
            		.build());
			
			pc.addSupplemental();
			
			pc.addWcoptions(AddWcoptions.builder()
					.description(testData.getText())
					. build());
			
			pc.selectRiskAnalysis(RiskAnalysis.builder().build());
			
			pc.reviewPolicy(PolicyReview.builder(WorkersCompensationConstants.PolicyReviewType.NONE).build());
			pc.viewQuote();
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.policyCloseOptions(CloseOptions.builder(WorkersCompensationConstants.CloseOptionType.NOT_TAKEN)
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
	 * @author vignesh.ravi
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Verify whether user able to Cancel  workers compensation policy with flat cancellation method.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC149(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("Verify whether user able to Cancel  workers compensation policy with flat cancellation method.", driver);
		WorkersCompensationDataEngine testData = new WorkersCompensationDataEngine("GWTestData_DataEngine.xlsx", "WorkersCompensation", "TC149");
		
		try {	

			WorkersCompensationStepsImpl pc = WorkersCompensationSteps.create();

			pc.loginIntoTheApplication("su", "gw");
			
			//Get policy number from Excel sheet which is generated by data generator using auto generated policy number created copy submission 

			
			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());
			
			pc.copySubmissions();

			pc.viewPolicy();
			
			pc.cancelPolicy(CancellationSource.builder().source(testData.getSource())
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
	@Test(description="Verify whether user able to Cancel  workers compensation policy with pro rata cancellation method.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC152(String browser) throws Exception {
		
		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("Verify whether user able to Cancel  workers compensation policy with pro rata cancellation method.", driver);
		WorkersCompensationDataEngine testData = new WorkersCompensationDataEngine("GWTestData_DataEngine.xlsx", "WorkersCompensation", "TC152");
	
		try {	
			
			
			WorkersCompensationStepsImpl pc = WorkersCompensationSteps.create();
			
			pc.loginIntoTheApplication("su", "gw");
			
			//Get policy number from Excel sheet which is generated by data generator using auto generated policy number created copy submission 
			
			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());
			
			pc.copySubmissions();
			
			pc.viewPolicy();
			
				
			pc.cancelPolicy(CancellationSource.builder().source(testData.getSource())
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
	 * @author vignesh.ravi
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Verify whether user able to Copy Submission Page transaction for workers compensation policy", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC151(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		WorkersCompensationDataEngine testData = new WorkersCompensationDataEngine("GWTestData_DataEngine.xlsx", "WorkersCompensation", "TC151");
		Log.testCaseInfo("Verify whether user able to Copy Submission Page transaction for workers compensation policy", driver);
		try {	

			
			WorkersCompensationStepsImpl pc = WorkersCompensationSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			//Get policy number from Excel sheet which is generated by data generator using auto generated policy number created copy submission 

			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());

			pc.copySubmission();
			pc.selectQualifications(Qualification.builder().build());
			pc.updatePolicyInfo(PolicyInfo.builder()
					.next(true).build());
			pc.addLocationDetails(AddLocationDetails.builder().next(true).build());
			pc.addWcCoverages(AddWcCoverages.builder().next(true).build());
			pc.addSupplemental();
			pc.addWcoptions(AddWcoptions.builder().next(true).build());
			
			pc.selectRiskAnalysis(RiskAnalysis.builder().build());
			pc.reviewPolicy(PolicyReview.builder(WorkersCompensationConstants.PolicyReviewType.NONE).build());
			pc.viewQuote();
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(WorkersCompensationConstants.Transactions.SUBMISSION);
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
	@Test(description="Verify whether user able to Set pre-renewal direction for workers compensation policy.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC161(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("Verify whether user able to Set pre-renewal direction for workers compensation policy.", driver);
		WorkersCompensationDataEngine testData = new WorkersCompensationDataEngine("GWTestData_DataEngine.xlsx", "WorkersCompensation", "TC161");
		try {	

			
			WorkersCompensationStepsImpl pc = WorkersCompensationSteps.create();

			pc.loginIntoTheApplication("su", "gw");
			
			//Get policy number from Excel sheet which is generated by data generator using auto generated policy number created copy submission 

			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());

			
			pc.policyPreRenewalDirection(PreRenewalDirection.builder()
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
	 * @author vignesh.ravi
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Verify whether user able to Renew the workers compensation policy.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC154(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		
		Log.testCaseInfo("Verify whether user able to Renew the workers compensation policy.", driver);
		WorkersCompensationDataEngine testData = new WorkersCompensationDataEngine("GWTestData_DataEngine.xlsx", "WorkersCompensation", "TC154");
		
		try {	

			
			WorkersCompensationStepsImpl pc = WorkersCompensationSteps.create();

			pc.loginIntoTheApplication("su", "gw");
			
			//Get policy number from Excel sheet which is generated by data generator using auto generated policy number created copy submission 

			
			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());
			
			pc.copySubmissions();

			pc.viewPolicy();
			
			pc.policyRenew();
			pc.updatePolicyInfo(PolicyInfo.builder()
					.next(true).build());
			pc.addLocationDetails(AddLocationDetails.builder().next(true).build());
			pc.addWcCoverages(AddWcCoverages.builder().next(true).build());
			pc.addSupplemental();
			pc.addWcoptions(AddWcoptions.builder().next(true).build());
			
			pc.selectRiskAnalysis(RiskAnalysis.builder().build());
			pc.reviewPolicy(PolicyReview.builder(WorkersCompensationConstants.PolicyReviewType.RENEW).build());
			pc.viewQuote();
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(WorkersCompensationConstants.Transactions.RENEW_POLICY);
			pc.policyRenewal(RenewPolicy.builder()
					.renewalcode(testData.getRenewalcode())
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
	 * @author vignesh.ravi
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Verify whether user able to Complete a rewrite full term transaction for workers compensation policy.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC153(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("Verify whether user able to Complete a rewrite full term transaction for workers compensation policy.",driver);
		WorkersCompensationDataEngine testData = new WorkersCompensationDataEngine("GWTestData_DataEngine.xlsx", "WorkersCompensation", "TC153");
		
		try {	

			
			WorkersCompensationStepsImpl pc = WorkersCompensationSteps.create();

			pc.loginIntoTheApplication("su", "gw");
			
			//Get policy number from Excel sheet which is generated by data generator using auto generated policy number created copy submission 

			
			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());

			pc.copySubmissions();
			
			pc.viewPolicy();
			
			pc.cancelPolicy(CancellationSource.builder().source(testData.getSource())
					.reason(testData.getCancellationReason()).build());

			pc.viewPolicy();
			
			pc.policyRewriteFullTerm();
			
			pc.updatePolicyInfo(PolicyInfo.builder()
					.next(true).build());
			pc.addLocationDetails(AddLocationDetails.builder().next(true).build());
			pc.addWcCoverages(AddWcCoverages.builder().next(true).build());
			pc.addSupplemental();
			pc.addWcoptions(AddWcoptions.builder().next(true).build());
			
			pc.selectRiskAnalysis(RiskAnalysis.builder().build());
			pc.reviewPolicy(PolicyReview.builder(WorkersCompensationConstants.PolicyReviewType.NONE).build());
			pc.viewQuote();
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(WorkersCompensationConstants.Transactions.REWRITE_REMAINDER_TERM);
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
	@Test(description="Verify whether user able to Reinstate a cancelled workers compensation policy.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC150(String browser) throws Exception {
		
		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("Verify whether user able to Reinstate a cancelled workers compensation policy.",driver);
		WorkersCompensationDataEngine testData = new WorkersCompensationDataEngine("GWTestData_DataEngine.xlsx", "WorkersCompensation", "TC150");
		
		try {	
			
			
			WorkersCompensationStepsImpl pc = WorkersCompensationSteps.create();
			
			pc.loginIntoTheApplication("su", "gw");
			
			//Get policy number from Excel sheet which is generated by data generator using auto generated policy number created copy submission 
			
			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());

			pc.copySubmissions();
			
			pc.viewPolicy();
			
			pc.cancelPolicy(CancellationSource.builder().source(testData.getSource())
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
	@Test(description="Verify whether user able to Create a workers compensation policy with 6 month term type.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC158(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		WorkersCompensationDataEngine testData = new WorkersCompensationDataEngine("GWTestData_DataEngine.xlsx", "WorkersCompensation", "TC158");
		Log.testCaseInfo("Verify whether user able to Create a workers compensation policy with 6 month term type.", driver);
		try {	

			
			WorkersCompensationStepsImpl pc = WorkersCompensationSteps.create();

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

			pc.selectProduct(ProductNames.WORKERS_COMPENSATION);

			pc.selectQualifications(Qualification.builder()
					.build());

			pc.updatePolicyInfo(PolicyInfo.builder()
					.ssn(testData.getSsn())
					.policyTerm(testData.getPolicyTerm())
					.organizationType(testData.getOrganizationType())
					.build());
			
			pc.addLocationDetails(AddLocationDetails.builder().build());

			pc.addWcCoverages(AddWcCoverages.builder()
					.governingLaw(testData.getGoverningLaw())
					.basis(testData.getBasis())
            		.code(testData.getCode())
            		.build());
			
			pc.addSupplemental();
			
			pc.addWcoptions(AddWcoptions.builder()
					.description(testData.getText())
					. build());
			
			pc.selectRiskAnalysis(RiskAnalysis.builder().build());
			
			pc.reviewPolicy(PolicyReview.builder(WorkersCompensationConstants.PolicyReviewType.NONE).build());
			pc.viewQuote();
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(WorkersCompensationConstants.Transactions.SUBMISSION);
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
	 * @author surendar.baskaran
	 * @param browser
	 * @throws Exception
	 */
	@Test(description ="Verify whether user able to Make a policy change transaction in workers compensation policy.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC148(String browser) throws Exception {
		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		WorkersCompensationDataEngine testData = new WorkersCompensationDataEngine("GWTestData_DataEngine.xlsx", "WorkersCompensation", "TC148");
		Log.testCaseInfo("Verify whether user able to Make a policy change transaction in workers compensation policy.", driver);
		try {	

			
			WorkersCompensationStepsImpl pc = WorkersCompensationSteps.create();

			pc.loginIntoTheApplication("su", "gw");
			
			//Get policy number from Excel sheet which is generated by data generator using auto generated policy number created copy submission 

			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());
			
			pc.copySubmissions();
			
			pc.viewPolicy();
			
			pc.policyChange(PolicyChange.builder().date(testData.getDateOneMonthAhead()).build());
			pc.updatePolicyInfo(PolicyInfo.builder()
					.ssn(testData.getSsn())
					.policyTerm(testData.getPolicyTerm())
					.organizationType(testData.getOrganizationType2()) //
					.build());
			
			pc.addLocationDetails(AddLocationDetails.builder().build());

			pc.addWcCoverages(AddWcCoverages.builder().next(true).build());
			pc.addSupplemental();
			pc.addWcoptions(AddWcoptions.builder().next(true).build());
			
			pc.selectRiskAnalysis(RiskAnalysis.builder().build());
			pc.reviewPolicy(PolicyReview.builder(WorkersCompensationConstants.PolicyReviewType.NONE).build());
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
	 * @author surendar.baskaran
	 * @param browser
	 * @throws Exception
	 */
	@Test(description ="Verify whether the user is able to create a  Policy and attempt to Quote and Issue the Workers compensation Policy - Out of Sequence transaction", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC160(String browser) throws Exception {
		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		WorkersCompensationDataEngine testData = new WorkersCompensationDataEngine("GWTestData_DataEngine.xlsx", "WorkersCompensation", "TC160");
		Log.testCaseInfo("Verify whether the user is able to create a  Policy and attempt to Quote and Issue the Workers compensation Policy - Out of Sequence transaction", driver);
		try {	

			
			WorkersCompensationStepsImpl pc = WorkersCompensationSteps.create();

			pc.loginIntoTheApplication("su", "gw");
			
			//Get policy number from Excel sheet which is generated by data generator using auto generated policy number created copy submission 

			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());
			
			pc.copySubmission();
			pc.selectQualifications(Qualification.builder().build());
			pc.updatePolicyInfo(PolicyInfo.builder()
					.next(true).build());
			pc.addLocationDetails(AddLocationDetails.builder().next(true).build());
			pc.addWcCoverages(AddWcCoverages.builder().next(true).build());
			pc.addSupplemental();
			pc.addWcoptions(AddWcoptions.builder().next(true).build());
			
			pc.selectRiskAnalysis(RiskAnalysis.builder().build());
			pc.reviewPolicy(PolicyReview.builder(WorkersCompensationConstants.PolicyReviewType.NONE).build());
			pc.viewQuote();
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(WorkersCompensationConstants.Transactions.SUBMISSION);
			pc.viewPolicy();
			pc.policyChange(PolicyChange.builder().date(testData.getDateOneMonthAhead()).build());
			pc.updatePolicyInfo(PolicyInfo.builder()
					.ssn(testData.getSsn())
					.policyTerm(testData.getPolicyTerm())
					.organizationType(testData.getOrganizationType2())
					.build());
			pc.addLocationDetails(AddLocationDetails.builder().build());
			pc.addWcCoverages(AddWcCoverages.builder().next(true).build());
			pc.addSupplemental();
			pc.addWcoptions(AddWcoptions.builder().next(true).build());
			
			pc.selectRiskAnalysis(RiskAnalysis.builder().build());
			pc.reviewPolicy(PolicyReview.builder(WorkersCompensationConstants.PolicyReviewType.NONE).build());
			pc.viewQuote();
			pc.viewForms();
			pc.issuepolicy(Transactions.POLICY_CHANGE);
			pc.viewPolicy();
			pc.policyChange(PolicyChange.builder().date(testData.getCurrentDate()).build());
            pc.verifyOutOfSequenceMessage(PolicyChange.builder()
					.date(testData.getDateOneMonthAhead()).build());
			pc.updatePolicyInfo(PolicyInfo.builder()
					.next(true).build());
            pc.verifyOutOfSequenceMessage(PolicyChange.builder()
					.date(testData.getDateOneMonthAhead()).build());
			pc.addLocationDetails(AddLocationDetails.builder().build());
            pc.verifyOutOfSequenceMessage(PolicyChange.builder()
					.date(testData.getDateOneMonthAhead()).build());
			pc.addWcCoverages(AddWcCoverages.builder().next(true).build());
            pc.verifyOutOfSequenceMessage(PolicyChange.builder()
					.date(testData.getDateOneMonthAhead()).build());
			pc.addSupplemental();
            pc.verifyOutOfSequenceMessage(PolicyChange.builder()
					.date(testData.getDateOneMonthAhead()).build());
			pc.addWcoptions(AddWcoptions.builder().next(true).build());
            pc.verifyOutOfSequenceMessage(PolicyChange.builder()
					.date(testData.getDateOneMonthAhead()).build());
			pc.selectRiskAnalysis(RiskAnalysis.builder().build());
            pc.verifyOutOfSequenceMessage(PolicyChange.builder()
					.date(testData.getDateOneMonthAhead()).build());
			pc.reviewPolicy(PolicyReview.builder(WorkersCompensationConstants.PolicyReviewType.OUT_OF_SEQUENCE).build());
            pc.verifyOutOfSequenceMessage(PolicyChange.builder()
					.date(testData.getDateOneMonthAhead()).build());
			pc.viewQuote();
            pc.verifyOutOfSequenceMessage(PolicyChange.builder()
					.date(testData.getDateOneMonthAhead()).build());
            pc.viewForms();
            pc.verifyOutOfSequenceMessage(PolicyChange.builder()
					.date(testData.getDateOneMonthAhead()).build());
			pc.issuepolicy(Transactions.POLICY_CHANGE);

			Log.testCaseResult(driver);

			
		} catch (Exception e) {
			Log.exception(e, DriverManager.getDriver());
		} finally {

			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}

	}