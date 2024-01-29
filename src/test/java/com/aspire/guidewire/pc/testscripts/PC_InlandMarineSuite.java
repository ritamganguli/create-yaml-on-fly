package com.aspire.guidewire.pc.testscripts;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aspire.guidewire.pc.teststeps.inlandmarine.DataFakers;
import com.aspire.guidewire.pc.teststeps.inlandmarine.InlandMarineConstants;
import com.aspire.guidewire.pc.teststeps.inlandmarine.InlandMarineDataEngine;
import com.aspire.guidewire.pc.teststeps.inlandmarine.InlandMarineSteps;
import com.aspire.guidewire.pc.teststeps.inlandmarine.InlandMarineStepsImpl;
import com.aspire.guidewire.pc.teststeps.inlandmarine.InlandMarineConstants.CoveragePart;
import com.aspire.guidewire.pc.teststeps.inlandmarine.InlandMarineConstants.PolicyReviewType;
import com.aspire.guidewire.pc.teststeps.inlandmarine.InlandMarineConstants.Transactions;
import com.aspire.guidewire.pc.teststeps.inlandmarine.InlandMarineFeatures.AddAccountReceivableDetails;
import com.aspire.guidewire.pc.teststeps.inlandmarine.InlandMarineFeatures.AddBuildingLocationDetails;
import com.aspire.guidewire.pc.teststeps.inlandmarine.InlandMarineFeatures.AddContractorsEquipmentDetails;
import com.aspire.guidewire.pc.teststeps.inlandmarine.InlandMarineFeatures.AddCoveragePartSelections;
import com.aspire.guidewire.pc.teststeps.inlandmarine.InlandMarineFeatures.AddSignsDetails;
import com.aspire.guidewire.pc.teststeps.inlandmarine.InlandMarineFeatures.CancellationSource;
import com.aspire.guidewire.pc.teststeps.inlandmarine.InlandMarineFeatures.CloseOptions;
import com.aspire.guidewire.pc.teststeps.inlandmarine.InlandMarineFeatures.CreateNewAccountFromPerson;
import com.aspire.guidewire.pc.teststeps.inlandmarine.InlandMarineFeatures.EnterAccountInformation;
import com.aspire.guidewire.pc.teststeps.inlandmarine.InlandMarineFeatures.Payments;
import com.aspire.guidewire.pc.teststeps.inlandmarine.InlandMarineFeatures.PolicyChange;
import com.aspire.guidewire.pc.teststeps.inlandmarine.InlandMarineFeatures.PolicyDetails;
import com.aspire.guidewire.pc.teststeps.inlandmarine.InlandMarineFeatures.PolicyInfo;
import com.aspire.guidewire.pc.teststeps.inlandmarine.InlandMarineFeatures.PolicyReview;
import com.aspire.guidewire.pc.teststeps.inlandmarine.InlandMarineFeatures.PreRenewalDirection;
import com.aspire.guidewire.pc.teststeps.inlandmarine.InlandMarineFeatures.ReinstatementReason;
import com.aspire.guidewire.pc.teststeps.inlandmarine.InlandMarineFeatures.RenewPolicy;
import com.aspire.guidewire.utils.DataProviderUtils;
import com.aspire.guidewire.utils.EnvironmentPropertiesReader;
import com.aspire.guidewire.utils.Log;
import com.aspire.guidewire.webdriverManager.DriverManager;


public class PC_InlandMarineSuite  {

	boolean LambdatestStatus = false;

	String pCWebSite, browser, contentGraphqlURL, browseAllContentGraphqlURL, sheetName;

	private static EnvironmentPropertiesReader configProperty = EnvironmentPropertiesReader.getInstance();

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
	 * Test Description: Verify whether user able to Create an inland marine policy with 6 month term type.
	 * Test ID: TC146
	 * @author anitha.raphel
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Verify whether user able to Create an inland marine policy with 6 month term type.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC146(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("Verify whether user able to Create an inland marine policy with 6 month term type.", driver);
		InlandMarineDataEngine testData = new InlandMarineDataEngine("GWTestData_DataEngine.xlsx", "InlandMarine", "TC146");

		try {	

			InlandMarineStepsImpl pc = InlandMarineSteps.create();

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
					.organization(testData.getProducerOrganization())
					.build());

			pc.selectProduct(InlandMarineConstants.ProductNames.INLAND_MARINE);

			pc.updatePolicyInfo(PolicyInfo.builder()
					.organizationType(testData.getOrganizationType())
					.policyTerm(testData.getPolicyTerm()).build());

			pc.addCoveragePartSelections(AddCoveragePartSelections.builder()
					.coveragePart(CoveragePart.ACCOUNTS_RECEIVABLE).build());

			pc.addCoveragePartSelections(AddCoveragePartSelections.builder()
					.coveragePart(CoveragePart.CONTRACTORS_EQUIPMENTS).build());

			pc.addCoveragePartSelections(AddCoveragePartSelections.builder()
					.coveragePart(CoveragePart.SIGNS).build());

			pc.addCoveragePartSelections(AddCoveragePartSelections.builder().build());

			pc.addBuildingLocationDetails(AddBuildingLocationDetails.builder()
					.description(testData.getBuildingDescription()).build());

			pc.addAccountReceivableDetails(AddAccountReceivableDetails.builder()
					.businessClass(testData.getBusinessClass())
					.coinsurancePct(testData.getCoinsurancePct())
					.receptacleType(testData.getReceptacleType())
					.percentDuplicated(testData.getPercentDuplicate())
					.limit(testData.getLimit()).build());

			pc.addContractorsEquipmentDetails(AddContractorsEquipmentDetails.builder()
					.contractorType(testData.getContractorType())
					.coinsurancePct(testData.getCoinsurancePct())
					.limit(testData.getLimit())
					.deductible(testData.getDeductible())
					.build());

			pc.addSignsDetails(AddSignsDetails.builder()
					.coinsurancePct(testData.getCoinsurancePct())
					.description(testData.getBuildingDescription())
					.signType(testData.getSignType())
					.limit(testData.getLimit())
					.build());

			pc.selectRiskAnalysis();
			pc.reviewPolicy(PolicyReview.builder(PolicyReviewType.NONE).build());
			pc.viewQuote();
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(Transactions.SUBMISSION);
			pc.viewPolicy();

			Log.testCaseResult(driver);
			
		} catch (Exception e) {
			Log.exception(e, DriverManager.getDriver());
		}  finally {

			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}

	/**
	 * Test Description: Verify whether user able to  Complete a cancellation transaction for inland marine policy..
	 * Test ID: TC132
	 * @author anitha.raphel
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Verify whether user able to  Complete a cancellation transaction for inland marine policy..", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC132(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("Verify whether user able to  Complete a cancellation transaction for inland marine policy.",driver);
		InlandMarineDataEngine testData = new InlandMarineDataEngine("GWTestData_DataEngine.xlsx", "InlandMarine", "TC132");

		try {	

			InlandMarineStepsImpl pc = InlandMarineSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			//Get policy number from Excel sheet which is generated by data generator using auto generated policy number created copy submission 

			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicy()).build());
			pc.copySubmissions();
			pc.viewPolicy();

			//old code
			pc.cancelPolicy(CancellationSource.builder()
					.source(testData.getCancellationSource())
					.reason(testData.getCancellationReason()).build());
			pc.viewPolicy();


			Log.testCaseResult(driver);
			
		} catch (Exception e) {
			Log.exception(e, DriverManager.getDriver());
		}  finally {

			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}

	/**
	 * Test Description: Verify whether user able to Cancel an inland marine policy with flat cancellation method..
	 * Test ID: TC135
	 * @author anitha.raphel
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Verify whether user able to Cancel an inland marine policy with flat cancellation method..", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC135(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("Verify whether user able to Cancel an inland marine policy with flat cancellation method..",driver);
		InlandMarineDataEngine testData = new InlandMarineDataEngine("GWTestData_DataEngine.xlsx", "InlandMarine", "TC135");
		try {	

			InlandMarineStepsImpl pc = InlandMarineSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			//Get policy number from Excel sheet which is generated by data generator using auto generated policy number created copy submission 
			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicy()).build());
			
			pc.copySubmissions();
			
			pc.viewPolicy();
			//old code

			pc.cancelPolicy(CancellationSource.builder()
					.source(testData.getCancellationSource())
					.reason(testData.getCancellationReason()).build());
			
			pc.viewPolicy();

			Log.testCaseResult(driver);
			
		} catch (Exception e) {
			Log.exception(e, DriverManager.getDriver());
		}  finally {

			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}

	/**
	 * Test Description: Verify whether user able to Complete a Policy Reinstatement transaction for inland marine policy..
	 * Test ID: TC133
	 * @author anitha.raphel
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Verify whether user able to Complete a Policy Reinstatement transaction for inland marine policy..", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC133(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("Verify whether user able to Complete a Policy Reinstatement transaction for inland marine policy..", driver);
		InlandMarineDataEngine testData = new InlandMarineDataEngine("GWTestData_DataEngine.xlsx", "InlandMarine", "TC133");

		try {	

			InlandMarineStepsImpl pc = InlandMarineSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			//Get policy number from Excel sheet which is generated by data generator using auto generated policy number created copy submission  
			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicy()).build());
			
			pc.copySubmissions();
			
			pc.viewPolicy();

			//old code
			pc.cancelPolicy(CancellationSource.builder()
					.source(testData.getCancellationSource())
					.reason(testData.getCancellationReason()).build());
			
			pc.viewPolicy();

			pc.reinstatePolicy(ReinstatementReason.builder()
					.reason(testData.getReinstatementReason()).build());
			
			pc.viewPolicy();

			Log.testCaseResult(driver);
			
		} catch (Exception e) {
			Log.exception(e, DriverManager.getDriver());
		}  finally {

			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}

	/**
	 * Test Description: Verify whether user able to Complete a policy change transaction for inland marine policy..
	 * Test ID: TC134
	 * @author anitha.raphel
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Verify whether user able to Complete a policy change transaction for inland marine policy..", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC134(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("Verify whether user able to Complete a policy change transaction for inland marine policy.", driver);
		InlandMarineDataEngine testData = new InlandMarineDataEngine("GWTestData_DataEngine.xlsx", "InlandMarine", "TC134");

		try {	

			InlandMarineStepsImpl pc = InlandMarineSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			//Get policy number from Excel sheet which is generated by data generator using auto generated policy number created copy submission 

			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicy()).build());
			
			pc.copySubmissions();
			
			pc.viewPolicy();

			//old code
			pc.policyChange(PolicyChange.builder()
					.date(testData.getEffectiveDateOneMonthAhead()).build()); 

			pc.updatePolicyInfo(PolicyInfo.builder().build());

			pc.addCoveragePartSelections(AddCoveragePartSelections.builder().build());

			pc.addBuildingLocationDetails(AddBuildingLocationDetails.builder().build());

			pc.addAccountReceivableDetails(AddAccountReceivableDetails.builder().build());

			pc.addContractorsEquipmentDetails(AddContractorsEquipmentDetails.builder().build());

			pc.addSignsDetails(AddSignsDetails.builder().build());	
			
			pc.selectRiskAnalysis();

			pc.reviewPolicy(PolicyReview.builder(PolicyReviewType.NONE).build());
			
			pc.viewQuote();
			
			pc.viewForms();
			
			pc.selectPayments(Payments.builder().build()); 
			
			pc.issuepolicy(InlandMarineConstants.Transactions.POLICY_CHANGE);
			
			pc.viewPolicy();

			Log.testCaseResult(driver);
			
		} catch (Exception e) {
			Log.exception(e, DriverManager.getDriver());
		}  finally {

			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}

	/**
	 * Test Description: Verify whether user able to Create an Inland Marine  policy with cash-  upfront payment method.
	 * Test ID: TC131
	 * @author anitha.raphel
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Verify whether user able to Create an Inland Marine  policy with cash-  upfront payment method.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC131(String browser) throws Exception {
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("Verify whether user able to Create an Inland Marine  policy with cash-  upfront payment method.", driver);
		InlandMarineDataEngine testData = new InlandMarineDataEngine("GWTestData_DataEngine.xlsx", "InlandMarine", "TC131");

		try {	

			InlandMarineStepsImpl pc = InlandMarineSteps.create();

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
					.organization(testData.getProducerOrganization())
					.build());

			pc.selectProduct(InlandMarineConstants.ProductNames.INLAND_MARINE);

			pc.updatePolicyInfo(PolicyInfo.builder()
					.organizationType(testData.getOrganizationType())
					.policyTerm(testData.getPolicyTerm()).build());

			pc.addCoveragePartSelections(AddCoveragePartSelections.builder()
					.coveragePart(CoveragePart.ACCOUNTS_RECEIVABLE).build());

			pc.addCoveragePartSelections(AddCoveragePartSelections.builder()
					.coveragePart(CoveragePart.CONTRACTORS_EQUIPMENTS).build());

			pc.addCoveragePartSelections(AddCoveragePartSelections.builder()
					.coveragePart(CoveragePart.SIGNS).build());

			pc.addCoveragePartSelections(AddCoveragePartSelections.builder().build());

			pc.addBuildingLocationDetails(AddBuildingLocationDetails.builder()
					.description(testData.getBuildingDescription()).build());

			pc.addAccountReceivableDetails(AddAccountReceivableDetails.builder()
					.businessClass(testData.getBusinessClass())
					.coinsurancePct(testData.getCoinsurancePct())
					.receptacleType(testData.getReceptacleType())
					.percentDuplicated(testData.getPercentDuplicate())
					.limit(testData.getLimit()).build());

			pc.addContractorsEquipmentDetails(AddContractorsEquipmentDetails.builder()
					.contractorType(testData.getContractorType())
					.coinsurancePct(testData.getCoinsurancePct())
					.limit(testData.getLimit())
					.deductible(testData.getDeductible())
					.build());

			pc.addSignsDetails(AddSignsDetails.builder()
					.coinsurancePct(testData.getCoinsurancePct())
					.description(testData.getBuildingDescription())
					.signType(testData.getSignType())
					.limit(testData.getLimit())
					.build());

			pc.selectRiskAnalysis();
			
			pc.reviewPolicy(PolicyReview.builder(PolicyReviewType.NONE).build());
			
			pc.viewQuote();
			
			pc.viewForms();
			
			pc.selectPayments(Payments.builder()
					.upFrontPayment(testData.getUpFrontPayment()).build()); 
			
			pc.issuepolicy(InlandMarineConstants.Transactions.SUBMISSION);
			
			pc.viewPolicy();

			Log.testCaseResult(driver);
			
		} catch (Exception e) {
			Log.exception(e, DriverManager.getDriver());
		}  finally {

			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}


	/**
	 * Test Description: Verify whether user able to Complete a rewrite full term transaction for inland marine policy.
	 * Test ID: TC136
	 * @author anitha.raphel
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Verify whether user able to Complete a rewrite full term transaction for inland marine policy.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC136(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("Verify whether user able to Complete a rewrite full term transaction for inland marine policy.", driver);
		InlandMarineDataEngine testData = new InlandMarineDataEngine("GWTestData_DataEngine.xlsx", "InlandMarine", "TC136");

		try {	

			InlandMarineStepsImpl pc = InlandMarineSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			//Get policy number from Excel sheet which is generated by data generator using auto generated policy number created copy submission 
			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicy()).build());
			
			pc.copySubmissions();
			
			pc.viewPolicy();
			
			//old code
			pc.cancelPolicy(CancellationSource.builder()
					.source(testData.getCancellationSource())
					.reason(testData.getCancellationReason()).build());
			
			pc.viewPolicy();

			pc.policyRewriteFullTerm();
			
			pc.updatePolicyInfo(PolicyInfo.builder().build());
			
			pc.addCoveragePartSelections(AddCoveragePartSelections.builder().build());
			
			pc.addBuildingLocationDetails(AddBuildingLocationDetails.builder().build());
			
			pc.addAccountReceivableDetails(AddAccountReceivableDetails.builder().build());
			
			pc.addContractorsEquipmentDetails(AddContractorsEquipmentDetails.builder().build());
			
			pc.addSignsDetails(AddSignsDetails.builder().build());
			
			pc.selectRiskAnalysis();
			
			pc.reviewPolicy(PolicyReview.builder(InlandMarineConstants.PolicyReviewType.NONE).build());
			
			pc.viewQuote();
			
			pc.viewForms();
			
			pc.selectPayments(Payments.builder().build());
			
			pc.issuepolicy(InlandMarineConstants.Transactions.REWRITE_FULL_TERM);
			
			pc.viewPolicy();


			Log.testCaseResult(driver);
			
		} catch (Exception e) {
			Log.exception(e, DriverManager.getDriver());
		}  finally {

			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}
	/**
	 * Test Description: Verify whether user able to Complete a renewal transaction for inland marine policy.
	 * Test ID: TC139
	 * @author anitha.raphel
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Verify whether user able to Complete a renewal transaction for inland marine policy.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC139(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("Verify whether user able to Complete a renewal transaction for inland marine policy.", driver);
		InlandMarineDataEngine testData = new InlandMarineDataEngine("GWTestData_DataEngine.xlsx", "InlandMarine", "TC139");

		try {	

			InlandMarineStepsImpl pc = InlandMarineSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			//Get policy number from Excel sheet which is generated by data generator using auto generated policy number created copy submission 
			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicy()).build());
			
			pc.copySubmissions();
			
			pc.viewPolicy();

			//old code
			pc.policyRenew();
			
			pc.updatePolicyInfo(PolicyInfo.builder().build());
			
			pc.addCoveragePartSelections(AddCoveragePartSelections.builder().build());
			
			pc.addBuildingLocationDetails(AddBuildingLocationDetails.builder().build());
			
			pc.addAccountReceivableDetails(AddAccountReceivableDetails.builder().build());
			
			pc.addContractorsEquipmentDetails(AddContractorsEquipmentDetails.builder().build());
			
			pc.addSignsDetails(AddSignsDetails.builder().build());
			
			pc.selectRiskAnalysis();
			
			pc.reviewPolicy(PolicyReview.builder(PolicyReviewType.RENEW).build());
			
			pc.viewQuote();
			
			pc.viewForms();
			
			pc.issuepolicy(InlandMarineConstants.Transactions.RENEW_POLICY);
			
			pc.policyRenewal(RenewPolicy.builder()
					.renewalcode(testData.getRenewalCode()).build());
			
			pc.viewPolicy();

			Log.testCaseResult(driver);
			
		} catch (Exception e) {
			Log.exception(e, DriverManager.getDriver());
		}  finally {

			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}

	/**
	 * Test Description: Verify whether user able to Close a submission transaction (Not Taken) for inland marine policy.
	 * Test ID: TC140
	 * @author anitha.raphel
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Verify whether user able to Close a submission transaction (Not Taken) for inland marine policy.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC140(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("Verify whether user able to Close a submission transaction (Not Taken) for inland marine policy.", driver);
		InlandMarineDataEngine testData = new InlandMarineDataEngine("GWTestData_DataEngine.xlsx", "InlandMarine", "TC140");

		try {	

			InlandMarineStepsImpl pc = InlandMarineSteps.create();

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
					.organization(testData.getProducerOrganization())
					.build());

			pc.selectProduct(InlandMarineConstants.ProductNames.INLAND_MARINE);

			pc.updatePolicyInfo(PolicyInfo.builder()
					.organizationType(testData.getOrganizationType())
					.policyTerm(testData.getPolicyTerm()).build());

			pc.addCoveragePartSelections(AddCoveragePartSelections.builder()
					.coveragePart(CoveragePart.ACCOUNTS_RECEIVABLE).build());

			pc.addCoveragePartSelections(AddCoveragePartSelections.builder()
					.coveragePart(CoveragePart.CONTRACTORS_EQUIPMENTS).build());

			pc.addCoveragePartSelections(AddCoveragePartSelections.builder()
					.coveragePart(CoveragePart.SIGNS).build());

			pc.addCoveragePartSelections(AddCoveragePartSelections.builder().build());

			pc.addBuildingLocationDetails(AddBuildingLocationDetails.builder()
					.description(testData.getBuildingDescription()).build());

			pc.addAccountReceivableDetails(AddAccountReceivableDetails.builder()
					.businessClass(testData.getBusinessClass())
					.coinsurancePct(testData.getCoinsurancePct())
					.receptacleType(testData.getReceptacleType())
					.percentDuplicated(testData.getPercentDuplicate())
					.limit(testData.getLimit()).build());

			pc.addContractorsEquipmentDetails(AddContractorsEquipmentDetails.builder()
					.contractorType(testData.getContractorType())
					.coinsurancePct(testData.getCoinsurancePct())
					.limit(testData.getLimit())
					.deductible(testData.getDeductible())
					.build());

			pc.addSignsDetails(AddSignsDetails.builder()
					.coinsurancePct(testData.getCoinsurancePct())
					.description(testData.getBuildingDescription())
					.signType(testData.getSignType())
					.limit(testData.getLimit())
					.build());

			pc.selectRiskAnalysis();
			
			pc.reviewPolicy(PolicyReview.builder(PolicyReviewType.NONE).build());
			
			pc.viewQuote();
			
			pc.viewForms();
			
			pc.selectPayments(Payments.builder().build());
			
			pc.policyCloseOptions(CloseOptions.builder(InlandMarineConstants.CloseOptionType.NOT_TAKEN)
					.reasonNotTaken(testData.getNotTakenReason()).build());

			Log.testCaseResult(driver);
			
		} catch (Exception e) {
			Log.exception(e, DriverManager.getDriver());
		}  finally {

			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}

	/**
	 * Test Description: Verify whether user able to Decline an inland marine policy.
	 * Test ID: TC141
	 * @author anitha.raphel
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Verify whether user able to Decline an inland marine policy.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC141(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("Verify whether user able to Decline an inland marine policy.", driver);
		InlandMarineDataEngine testData = new InlandMarineDataEngine("GWTestData_DataEngine.xlsx", "InlandMarine", "TC141");

		try {	

			InlandMarineStepsImpl pc = InlandMarineSteps.create();

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
					.organization(testData.getProducerOrganization())
					.build());

			pc.selectProduct(InlandMarineConstants.ProductNames.INLAND_MARINE);

			pc.updatePolicyInfo(PolicyInfo.builder()
					.organizationType(testData.getOrganizationType())
					.policyTerm(testData.getPolicyTerm()).build());

			pc.addCoveragePartSelections(AddCoveragePartSelections.builder()
					.coveragePart(CoveragePart.ACCOUNTS_RECEIVABLE).build());

			pc.addCoveragePartSelections(AddCoveragePartSelections.builder()
					.coveragePart(CoveragePart.CONTRACTORS_EQUIPMENTS).build());

			pc.addCoveragePartSelections(AddCoveragePartSelections.builder()
					.coveragePart(CoveragePart.SIGNS).build());

			pc.addCoveragePartSelections(AddCoveragePartSelections.builder().build());

			pc.addBuildingLocationDetails(AddBuildingLocationDetails.builder()
					.description(testData.getBuildingDescription()).build());

			pc.addAccountReceivableDetails(AddAccountReceivableDetails.builder()
					.businessClass(testData.getBusinessClass())
					.coinsurancePct(testData.getCoinsurancePct())
					.receptacleType(testData.getReceptacleType())
					.percentDuplicated(testData.getPercentDuplicate())
					.limit(testData.getLimit()).build());

			pc.addContractorsEquipmentDetails(AddContractorsEquipmentDetails.builder()
					.contractorType(testData.getContractorType())
					.coinsurancePct(testData.getCoinsurancePct())
					.limit(testData.getLimit())
					.deductible(testData.getDeductible())
					.build());

			pc.addSignsDetails(AddSignsDetails.builder()
					.coinsurancePct(testData.getCoinsurancePct())
					.description(testData.getBuildingDescription())
					.signType(testData.getSignType())
					.limit(testData.getLimit())
					.build());

			pc.selectRiskAnalysis();
			
			pc.reviewPolicy(PolicyReview.builder(PolicyReviewType.NONE).build());
			
			pc.viewQuote();
			
			pc.viewForms();
			
			pc.selectPayments(Payments.builder().build());
			
			pc.policyCloseOptions(CloseOptions.builder(InlandMarineConstants.CloseOptionType.DECLINE)
					.reasonDeclined(testData.getDeclinedReason()).build());

			Log.testCaseResult(driver);
			
		} catch (Exception e) {
			Log.exception(e, DriverManager.getDriver());
		}  finally {

			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}

	/**
	 * Test Description: Verify whether user able to Withdraw a submission transaction for inland marine policy.
	 * Test ID: TC142
	 * @author anitha.raphel
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Verify whether user able to Withdraw a submission transaction for inland marine policy.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC142(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("Verify whether user able to Withdraw a submission transaction for inland marine policy.", driver);
		InlandMarineDataEngine testData = new InlandMarineDataEngine("GWTestData_DataEngine.xlsx", "InlandMarine", "TC142");

		try {	

			InlandMarineStepsImpl pc = InlandMarineSteps.create();

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
					.organization(testData.getProducerOrganization())
					.build());

			pc.selectProduct(InlandMarineConstants.ProductNames.INLAND_MARINE);

			pc.updatePolicyInfo(PolicyInfo.builder()
					.organizationType(testData.getOrganizationType())
					.policyTerm(testData.getPolicyTerm()).build());

			pc.addCoveragePartSelections(AddCoveragePartSelections.builder()
					.coveragePart(CoveragePart.ACCOUNTS_RECEIVABLE).build());

			pc.addCoveragePartSelections(AddCoveragePartSelections.builder()
					.coveragePart(CoveragePart.CONTRACTORS_EQUIPMENTS).build());

			pc.addCoveragePartSelections(AddCoveragePartSelections.builder()
					.coveragePart(CoveragePart.SIGNS).build());

			pc.addCoveragePartSelections(AddCoveragePartSelections.builder().build());

			pc.addBuildingLocationDetails(AddBuildingLocationDetails.builder()
					.description(testData.getBuildingDescription()).build());

			pc.addAccountReceivableDetails(AddAccountReceivableDetails.builder()
					.businessClass(testData.getBusinessClass())
					.coinsurancePct(testData.getCoinsurancePct())
					.receptacleType(testData.getReceptacleType())
					.percentDuplicated(testData.getPercentDuplicate())
					.limit(testData.getLimit()).build());

			pc.addContractorsEquipmentDetails(AddContractorsEquipmentDetails.builder()
					.contractorType(testData.getContractorType())
					.coinsurancePct(testData.getCoinsurancePct())
					.limit(testData.getLimit())
					.deductible(testData.getDeductible())
					.build());

			pc.addSignsDetails(AddSignsDetails.builder()
					.coinsurancePct(testData.getCoinsurancePct())
					.description(testData.getBuildingDescription())
					.signType(testData.getSignType())
					.limit(testData.getLimit())
					.build());

			pc.selectRiskAnalysis();
			
			pc.reviewPolicy(PolicyReview.builder(PolicyReviewType.NONE).build());
			
			pc.viewQuote();
			
			pc.viewForms();
			
			pc.policyCloseOptions(CloseOptions.builder(InlandMarineConstants.CloseOptionType.WITHDRAW_TRANSACTION).build());

			Log.testCaseResult(driver);
			
		} catch (Exception e) {
			Log.exception(e, DriverManager.getDriver());
		}  finally {

			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}

	/**
	 * Test Description: Verify whether user able to make an out of sequence transaction for Inland Marine policy
	 * Test ID: TC143
	 * @author anitha.raphel
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Verify whether user able to make an out of sequence transaction for Inland Marine policy", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC143(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("Verify whether user able to make an out of sequence transaction for Inland Marine policy", driver);
		InlandMarineDataEngine testData = new InlandMarineDataEngine("GWTestData_DataEngine.xlsx", "InlandMarine", "TC143");

		try {	

			InlandMarineStepsImpl pc = InlandMarineSteps.create();

			pc.loginIntoTheApplication("su", "gw");
			
			//Get policy number from Excel sheet which is generated by data generator using auto generated policy number created copy submission 
			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicy()).build());
			
			pc.copySubmissions();
			
			pc.viewPolicy();
			
			//old code
			pc.policyChange(PolicyChange.builder()
					.date(testData.getEffectiveDateOneMonthAhead()).build());

			pc.updatePolicyInfo(PolicyInfo.builder()
					.organizationType(testData.getOrganizationType2()).build()); 
			
			pc.addCoveragePartSelections(AddCoveragePartSelections.builder().build());
			
			pc.addBuildingLocationDetails(AddBuildingLocationDetails.builder().build());
			
			pc.addAccountReceivableDetails(AddAccountReceivableDetails.builder().build());
			
			pc.addContractorsEquipmentDetails(AddContractorsEquipmentDetails.builder().build());
			
			pc.addSignsDetails(AddSignsDetails.builder().build());
			
			pc.selectRiskAnalysis();
			
			pc.reviewPolicy(PolicyReview.builder(InlandMarineConstants.PolicyReviewType.NONE).build());
			
			pc.viewQuote();
			
			pc.viewForms();
			
			pc.issuepolicy(Transactions.POLICY_CHANGE);
			
			pc.viewPolicy();

			pc.policyChange(PolicyChange.builder().date(DataFakers.currentDate()).build());
			
			pc.verifyOutOfSequenceMessage(PolicyChange.builder()
					.date(testData.getEffectiveDateOneMonthAhead()).build());
			
			pc.updatePolicyInfo(PolicyInfo.builder().build());
			
			pc.verifyOutOfSequenceMessage(PolicyChange.builder().date(testData.getEffectiveDateOneMonthAhead()).build());
			
			pc.addCoveragePartSelections(AddCoveragePartSelections.builder().build());
			
			pc.verifyOutOfSequenceMessage(PolicyChange.builder().date(testData.getEffectiveDateOneMonthAhead()).build());
			
			pc.addBuildingLocationDetails(AddBuildingLocationDetails.builder().build());
			
			pc.verifyOutOfSequenceMessage(PolicyChange.builder().date(testData.getEffectiveDateOneMonthAhead()).build());
			
			pc.addAccountReceivableDetails(AddAccountReceivableDetails.builder().build());
			
			pc.verifyOutOfSequenceMessage(PolicyChange.builder().date(testData.getEffectiveDateOneMonthAhead()).build());
			
			pc.addContractorsEquipmentDetails(AddContractorsEquipmentDetails.builder().build());
			
			pc.verifyOutOfSequenceMessage(PolicyChange.builder().date(testData.getEffectiveDateOneMonthAhead()).build());
			
			pc.addSignsDetails(AddSignsDetails.builder().build());
			
			pc.verifyOutOfSequenceMessage(PolicyChange.builder().date(testData.getEffectiveDateOneMonthAhead()).build());
			
			pc.selectRiskAnalysis();
			
			pc.verifyOutOfSequenceMessage(PolicyChange.builder()
					.date(testData.getEffectiveDateOneMonthAhead()).build());
			
			pc.reviewPolicy(PolicyReview.builder(PolicyReviewType.NONE).build());
			
			pc.verifyOutOfSequenceMessage(PolicyChange.builder()
					.date(testData.getEffectiveDateOneMonthAhead()).build());
			
			pc.viewQuote();
			
			pc.viewForms();
			
			pc.issuepolicy(Transactions.POLICY_CHANGE);
			
			pc.viewPolicy();

			Log.testCaseResult(driver);
			
		} catch (Exception e) {
			Log.exception(e, DriverManager.getDriver());
		}  finally {

			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}

	/**
	 * Test Description: Verify whether user able to set pre-renewal direction for Inland Marine policy.
	 * Test ID: TC144
	 * @author anitha.raphel
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Verify whether user able to set pre-renewal direction for Inland Marine policy.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC144(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("Verify whether user able to set pre-renewal direction for Inland Marine policy.", driver);
		InlandMarineDataEngine testData = new InlandMarineDataEngine("GWTestData_DataEngine.xlsx", "InlandMarine", "TC144");

		try {	

			InlandMarineStepsImpl pc = InlandMarineSteps.create();

			pc.loginIntoTheApplication("su", "gw");
			
			//Get policy number from Excel sheet which is generated by data generator  
			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicy()).build());

			//old code

			pc.policyPreRenewalDirection(PreRenewalDirection.builder()
					.direction(testData.getPreRenewalDirection())
					.security(testData.getPreRenewalSecurity())
					.reason(testData.getPreRenewalReason())
					.text(testData.getPreRenewalText()).build());

			Log.testCaseResult(driver);
			
		} catch (Exception e) {
			Log.exception(e, DriverManager.getDriver());
		}  finally {

			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}
	
	/**
	 * Test Description: Verify whether user able to Complete a rewrite new term transaction for inland marine policy.
	 * Test ID: TC44
	 * @author anitha.raphel
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Verify whether user able to Complete a rewrite new term transaction for inland marine policy.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC44(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("Verify whether user able to Complete a rewrite new term transaction for inland marine policy.", driver);
		InlandMarineDataEngine testData = new InlandMarineDataEngine("GWTestData_DataEngine.xlsx", "InlandMarine", "TC44");

		try {	

			InlandMarineStepsImpl pc = InlandMarineSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			//Get policy number from Excel sheet which is generated by data generator using auto generated policy number created copy submission 
			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicy()).build());
			
			pc.copySubmissions();
			
			pc.viewPolicy();
			//old code
			pc.cancelPolicy(CancellationSource.builder()
					.source(testData.getCancellationSource())
					.reason(testData.getCancellationReason()).build());
			
			pc.viewPolicy();

			pc.policyRewriteNewTerm();
			
			pc.updatePolicyInfo(PolicyInfo.builder().build());

			pc.addCoveragePartSelections(AddCoveragePartSelections.builder().build());

			pc.addBuildingLocationDetails(AddBuildingLocationDetails.builder().build());

			pc.addAccountReceivableDetails(AddAccountReceivableDetails.builder().build());

			pc.addContractorsEquipmentDetails(AddContractorsEquipmentDetails.builder().build());

			pc.addSignsDetails(AddSignsDetails.builder().build());

			pc.selectRiskAnalysis();

			pc.reviewPolicy(PolicyReview.builder(PolicyReviewType.NONE).build());
			
			pc.viewQuote();
			
			pc.viewForms();
			
			pc.selectPayments(Payments.builder().build());  
			
			pc.issuepolicy(InlandMarineConstants.Transactions.REWRITE_NEW_TERM);
			
			pc.approveUWIssues();
			
			pc.issuepolicy(InlandMarineConstants.Transactions.REWRITE_NEW_TERM);
			
			pc.viewPolicy();

			Log.testCaseResult(driver);
			
		} catch (Exception e) {
			Log.exception(e, DriverManager.getDriver());
		}  finally {

			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}
	/**
	 * Test Description: Verify whether user able to Complete a rewrite remainder of term transaction for inland marine policy.
	 * Test ID: TC137
	 * @author anitha.raphel
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Verify whether user able to Complete a rewrite remainder of term transaction for inland marine policy.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC137(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("Verify whether user able to Complete a rewrite remainder of term transaction for inland marine policy.", driver);
		InlandMarineDataEngine testData = new InlandMarineDataEngine("GWTestData_DataEngine.xlsx", "InlandMarine", "TC137");

		try {	

			InlandMarineStepsImpl pc = InlandMarineSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			//Get policy number from Excel sheet which is generated by data generator using auto generated policy number created copy submission 
			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicy()).build());
			
			pc.copySubmissions();
			
			pc.viewPolicy();
			//old code

			pc.cancelPolicy(CancellationSource.builder()
					.source(testData.getCancellationSource())
					.reason(testData.getCancellationReason()).build());
			
			pc.viewPolicy();

			pc.policyRewriteRemainderTerm();
			
			pc.updatePolicyInfo(PolicyInfo.builder().build());

			pc.addCoveragePartSelections(AddCoveragePartSelections.builder().build());

			pc.addBuildingLocationDetails(AddBuildingLocationDetails.builder().build());

			pc.addAccountReceivableDetails(AddAccountReceivableDetails.builder().build());

			pc.addContractorsEquipmentDetails(AddContractorsEquipmentDetails.builder().build());

			pc.addSignsDetails(AddSignsDetails.builder().build());

			pc.selectRiskAnalysis();

			pc.reviewPolicy(PolicyReview.builder(PolicyReviewType.NONE).build());
			
			pc.viewQuote();
			
			pc.viewForms();
			
			pc.selectPayments(Payments.builder().build());  
			
			pc.issuepolicy(InlandMarineConstants.Transactions.REWRITE_REMAINDER_TERM);
			
			pc.viewPolicy();

			Log.testCaseResult(driver);
			
		} catch (Exception e) {
			Log.exception(e, DriverManager.getDriver());
		}  finally {

			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}

}