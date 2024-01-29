package com.aspire.guidewire.cc.testscripts;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aspire.guidewire.api.datagenerator.CCDataGenerator;
import com.aspire.guidewire.cc.teststeps.commercialproperty.CommercialPropertyConstants.Coverages;
import com.aspire.guidewire.cc.teststeps.commercialproperty.CommercialPropertyConstants.PaymentType;
import com.aspire.guidewire.cc.teststeps.commercialproperty.CommercialPropertyConstants.State;
import com.aspire.guidewire.cc.teststeps.commercialproperty.CommercialPropertyDataEngine;
import com.aspire.guidewire.cc.teststeps.commercialproperty.CommercialPropertyFeatures.BasicInfo;
import com.aspire.guidewire.cc.teststeps.commercialproperty.CommercialPropertyFeatures.ChooseCoverages;
import com.aspire.guidewire.cc.teststeps.commercialproperty.CommercialPropertyFeatures.ChooseCoveragesByType;
import com.aspire.guidewire.cc.teststeps.commercialproperty.CommercialPropertyFeatures.ClaimInfo;
import com.aspire.guidewire.cc.teststeps.commercialproperty.CommercialPropertyFeatures.ContactDetails;
import com.aspire.guidewire.cc.teststeps.commercialproperty.CommercialPropertyFeatures.Coverage;
import com.aspire.guidewire.cc.teststeps.commercialproperty.CommercialPropertyFeatures.EmailDetails;
import com.aspire.guidewire.cc.teststeps.commercialproperty.CommercialPropertyFeatures.ExposureDetails;
import com.aspire.guidewire.cc.teststeps.commercialproperty.CommercialPropertyFeatures.PaymentOptions;
import com.aspire.guidewire.cc.teststeps.commercialproperty.CommercialPropertyFeatures.Reserve;
import com.aspire.guidewire.cc.teststeps.commercialproperty.CommercialPropertyFeatures.SearchClaim;
import com.aspire.guidewire.cc.teststeps.commercialproperty.CommercialPropertyFeatures.Searchpolicy;
import com.aspire.guidewire.cc.teststeps.commercialproperty.CommercialPropertyFeatures.ServiceDetails;
import com.aspire.guidewire.cc.teststeps.commercialproperty.CommercialPropertySteps;
import com.aspire.guidewire.cc.teststeps.commercialproperty.CommercialPropertyStepsImpl;
import com.aspire.guidewire.cc.teststeps.commercialproperty.DataFakers;
import com.aspire.guidewire.utils.DataProviderUtils;
import com.aspire.guidewire.utils.EnvironmentPropertiesReader;
import com.aspire.guidewire.utils.Log;
import com.aspire.guidewire.webdriverManager.DriverManager;

public class CC_CommercialPropertySuite  {

	boolean LambdatestStatus = false;
	String ccWebSite, browser, contentGraphqlURL, browseAllContentGraphqlURL, sheetName;
	private static EnvironmentPropertiesReader configProperty = EnvironmentPropertiesReader.getInstance();
	protected static ThreadLocal<WebDriver> threadLocalDriver = new ThreadLocal<>();

	@BeforeTest(alwaysRun = true)
	public void init(ITestContext context) {

		ccWebSite = (System.getProperty("ccWebSite") != null ? System.getProperty("ccWebSite"): context.getCurrentXmlTest().getParameter("ccWebSite"));
		DriverManager.setCCWebsite(ccWebSite);

		if(configProperty.hasProperty("runLambdaTestFromLocal") && configProperty.getProperty("runLambdaTestFromLocal").trim().equalsIgnoreCase("true")){
			LambdatestStatus = true;
		}
	}
	
	/**
	 * @author manikandan.manohar
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the Commercial Property claim creation", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC16(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the Commercial Property claim creation", driver);
		CommercialPropertyDataEngine testData = new CommercialPropertyDataEngine("CC_GWTestData_DataEngine.xlsx", "CommercialProperty", "TC16");

		try {	
			CommercialPropertyStepsImpl cc = CommercialPropertySteps.create();

			cc.loginIntoTheApplication("su", "gw");

			cc.createClaim();

			String insuredName = cc.searchPolicy(Searchpolicy.builder()
					.policyNo(testData.getPolicyNumber())
					.lossDate(DataFakers.currentDate())
					.build());

			cc.updateInvolvedPolicyProperties();

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
	@Test(description="To verify the exposure creation for Business Personal Property - Separation of Coverage (Stock) coverage", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC43(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the exposure creation for Business Personal Property - Separation of Coverage (Stock) coverage", driver);
		CommercialPropertyDataEngine testData = new CommercialPropertyDataEngine("CC_GWTestData_DataEngine.xlsx", "CommercialProperty", "TC43");

		try {	

			CommercialPropertyStepsImpl cc = CommercialPropertySteps.create();

			cc.loginIntoTheApplication("su", "gw");
			
			String insuredName = cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.addCoveragesByType(ChooseCoveragesByType.builder(Coverages.BUSINESS_PERSONAL_PROPERTY_SEPARATIONOFSTOCK)
					.businessPersonalPropertyStock(Coverage.builder()
							.claimant(insuredName)
							.claimantType(testData.getClaimantType())
							.description(testData.getDamageDescription())
							.build()).build());
			
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
	@Test(description="To verify the exposure creation for Building Coverage", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC44(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the exposure creation for Building Coverage", driver);
		CommercialPropertyDataEngine testData = new CommercialPropertyDataEngine("CC_GWTestData_DataEngine.xlsx", "CommercialProperty", "TC44");

		try {	

			CommercialPropertyStepsImpl cc = CommercialPropertySteps.create();

			cc.loginIntoTheApplication("su", "gw");

			cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.addCoverages(ChooseCoverages.builder(Coverages.BUSINESS_COVERAGE)
					.contactDetails(ContactDetails.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.taxIdSSN(testData.getTaxId())
					.address(testData.getAddress())
					.city(testData.getCity())
					.state(testData.getState())
					.build())
					.businessCoverage(Coverage.builder()
					.claimantType(testData.getClaimantType())
					.build()).build());
			
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
	@Test(description="To verify the reserves creation for Business Personal Property Coverage exposure", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC68(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the reserves creation for Business Personal Property Coverage exposure", driver);
		CommercialPropertyDataEngine testData = new CommercialPropertyDataEngine("CC_GWTestData_DataEngine.xlsx", "CommercialProperty", "TC68");

		try {	

			CommercialPropertyStepsImpl cc = CommercialPropertySteps.create();

			cc.loginIntoTheApplication("su", "gw");

			cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.addCoverages(ChooseCoverages.builder(Coverages.BUSINESS_COVERAGE)
					.contactDetails(ContactDetails.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.taxIdSSN(testData.getTaxId())
					.address(testData.getAddress())
					.city(testData.getCity())
					.state(testData.getState())
					.build())
					.businessCoverage(Coverage.builder()
					.claimantType(testData.getClaimantType())
					.build()).build());

			cc.createreserve(Reserve.builder().costType(testData.getCostType()).costCategory(testData.getReserveCostCategory()).newAvailableReserves(DataFakers.amount()).build());
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
	@Test(description="To verify that able to add a Property -> Construction services for Commercial Property claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC80(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to add a Property -> Construction services for Commercial Property claim", driver);
		CommercialPropertyDataEngine testData = new CommercialPropertyDataEngine("CC_GWTestData_DataEngine.xlsx", "CommercialProperty", "TC80");

		try {	

			CommercialPropertyStepsImpl cc = CommercialPropertySteps.create();

			cc.loginIntoTheApplication("su", "gw");

		    cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.addClaimService(ServiceDetails.builder()
					.service(testData.getService())
					.requestType(testData.getRequestType())
					.contactDetails(ContactDetails.builder()
							.firstName(DataFakers.firstName())
							.lastName(DataFakers.lastName())
							.taxIdSSN(DataFakers.taxID())
							.address(DataFakers.addressLineOne())
							.city(DataFakers.city())
							.state(State.ARIZONA.getName())
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
	 * @author manikandan.manohar
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the reserves creation for Extra Expense Coverage exposure", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC69(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the reserves creation for Extra Expense Coverage exposure", driver);
		CommercialPropertyDataEngine testData = new CommercialPropertyDataEngine("CC_GWTestData_DataEngine.xlsx", "CommercialProperty", "TC69");

		try {	

			CommercialPropertyStepsImpl cc = CommercialPropertySteps.create();

			cc.loginIntoTheApplication("su", "gw");

			String insuredName = cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());
			
			cc.addCoveragesByType(ChooseCoveragesByType.builder(Coverages.EXTRA_EXPENSE_COVERAGE)
					.extraExpenseCoverage(Coverage.builder()
							.claimant(insuredName)
							.claimantType(testData.getClaimantType())
							.build()).build());

			cc.createreserve(Reserve.builder().costType(testData.getCostType()).costCategory(testData.getCostCategory()).newAvailableReserves(DataFakers.amount()).build());

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
	@Test(description="To verify that able to create a Recovery for Commercial Property claim using Salvage", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC420(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to create a Recovery for Commercial Property claim using Salvage", driver);
		CommercialPropertyDataEngine testData = new CommercialPropertyDataEngine("CC_GWTestData_DataEngine.xlsx", "CommercialProperty", "TC420");

		try {	

			CommercialPropertyStepsImpl cc = CommercialPropertySteps.create();

			cc.loginIntoTheApplication("su", "gw");

			String insuredName = cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.paymentChecks(PaymentOptions.builder()
					.payer(insuredName)
					.paymentType(PaymentType.RECOVERY)
					.reserveLine(testData.getReserveLine())
					.costType(testData.getCostType())
					.costCategory(testData.getCostCategory())
					.recoveryCategory(testData.getRecoveryCategory())
					.amount(DataFakers.amount())
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
	 * @author manikandan.manohar
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify that able to create a Recovery for Commercial Property claim using Salvage", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC427(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to create a Recovery for Commercial Property claim using Salvage", driver);
		CommercialPropertyDataEngine testData = new CommercialPropertyDataEngine("CC_GWTestData_DataEngine.xlsx", "CommercialProperty", "TC427");

		try {	

			CommercialPropertyStepsImpl cc = CommercialPropertySteps.create();

			cc.loginIntoTheApplication("su", "gw");

			String insuredName = cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.paymentChecks(PaymentOptions.builder()
					.payer(insuredName)
					.paymentType(PaymentType.RECOVERY)
					.reserveLine(testData.getReserveLine())
					.costType(testData.getCostType())
					.costCategory(testData.getCostCategory())
					.recoveryCategory(testData.getRecoveryCategory())
					.amount(DataFakers.amount())
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
	 * @author manikandan.manohar
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the transfer check functionality for Commercial Property claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC89(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the transfer check functionality for Commercial Property claim", driver);
		CommercialPropertyDataEngine testData = new CommercialPropertyDataEngine("CC_GWTestData_DataEngine.xlsx", "CommercialProperty", "TC89");

		try {

			String claimNumber = CCDataGenerator.createClaimForCommercialProperty(testData.getPolicyNumber());
			
			CommercialPropertyStepsImpl cc = CommercialPropertySteps.create();

			cc.loginIntoTheApplication("su", "gw");

			String insuredName=cc.searchClaim(SearchClaim.builder().claimNo(claimNumber).build());

			cc.addCoverages(ChooseCoverages.builder(Coverages.EXTRA_EXPENSE_COVERAGE).extraExpenseCoverage(Coverage.builder().claimant(insuredName)
					.claimantType(testData.getClaimantType())
					.build()).build());

			cc.createreserve(Reserve.builder().costType(testData.getCostType()).costCategory(testData.getCostCategory()).newAvailableReserves(DataFakers.amount()).build());

			cc.paymentChecks(PaymentOptions.builder()
					.payer(insuredName)
					.reserveLine(testData.getReserveLine())
					.costCategory(testData.getCostCategory())
					.costType(testData.getCostType())
					.paymentType(PaymentType.MANUAL_CHECK)
					.payment(testData.getPaymentType())
					.amount(DataFakers.amount())
					.build());

			cc.paymentChecks(PaymentOptions.builder()
					.claimNumber(testData.getClaimNumber())
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

	/**
	 * @author manikandan.manohar
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the New document creation using create from a template while creating a Commercial Property claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC155(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the New document creation using create from a template while creating a Commercial Property claim", driver);
		CommercialPropertyDataEngine testData = new CommercialPropertyDataEngine("CC_GWTestData_DataEngine.xlsx", "CommercialProperty", "TC155");

		try {	

			CommercialPropertyStepsImpl cc = CommercialPropertySteps.create();

			cc.loginIntoTheApplication("su", "gw");

			cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

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
	 * @author manikandan.manohar
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the Email creation for Commercial Property claim ", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC194(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the Email creation for Commercial Property claim ", driver);
		CommercialPropertyDataEngine testData = new CommercialPropertyDataEngine("CC_GWTestData_DataEngine.xlsx", "CommercialProperty", "TC194");

		try {	

			CommercialPropertyStepsImpl cc = CommercialPropertySteps.create();

			cc.loginIntoTheApplication("su", "gw");

			cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());
			
			cc.emailClaim(EmailDetails.builder()
					.emailAdress(DataFakers.generateEmail())
					.subject(DataFakers.generateRandomLetters())
					.body(DataFakers.generateRandomLetters())
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
	 * @author manikandan.manohar
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="To verify the Close Claim functionality for Commercial Property claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC186(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the Close Claim functionality for Commercial Property claim", driver);
		CommercialPropertyDataEngine testData = new CommercialPropertyDataEngine("CC_GWTestData_DataEngine.xlsx", "CommercialProperty", "TC186");

		try {	

			CommercialPropertyStepsImpl cc = CommercialPropertySteps.create();

			cc.loginIntoTheApplication("su", "gw");

			String insuredName = cc.searchClaim(SearchClaim.builder().claimNo(testData.getClaimNumber()).build());

			cc.addCoveragesByType(ChooseCoveragesByType.builder(Coverages.EXTRA_EXPENSE_COVERAGE)
					.extraExpenseCoverage(Coverage.builder()
							.claimant(insuredName)
							.claimantType(testData.getClaimantType())
							.build()).build());

			cc.closeExposure(ExposureDetails.builder()
					.note(DataFakers.generateRandomLetters())
					.outcome(testData.getOutcome())
					.exposureValue(testData.getClosedStatus()).build());

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
	@Test(description="To verify the transfer check functionality for Commercial Property claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC382(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the transfer check functionality for Commercial Property claim", driver);
		CommercialPropertyDataEngine testData = new CommercialPropertyDataEngine("CC_GWTestData_DataEngine.xlsx", "CommercialProperty", "TC382");

		try {	
			
			String claimNumber = CCDataGenerator.createClaimForCommercialProperty(testData.getPolicyNumber());

			CommercialPropertyStepsImpl cc = CommercialPropertySteps.create();

			cc.loginIntoTheApplication("su", "gw");

			String insuredName=cc.searchClaim(SearchClaim.builder().claimNo(claimNumber).build());

			cc.addCoveragesByType(ChooseCoveragesByType.builder(Coverages.BUSINESS_PERSONAL_PROPERTY_COVERAGE).businessPersonalPropertyCoverage(Coverage.builder()
					.claimant(insuredName)
					.claimantType(testData.getClaimantType())
					.description(testData.getDamageDescription()).build()).build());
			
			cc.createreserve(Reserve.builder().costType(testData.getCostType()).costCategory(testData.getCostCategory()).newAvailableReserves(DataFakers.amount()).build());

			cc.paymentChecks(PaymentOptions.builder()
					.payer(insuredName)
					.reserveLine(testData.getReserveLine())
					.paymentType(PaymentType.MANUAL_CHECK)
					.payment(testData.getPaymentType())
					.amount(DataFakers.amount())
					.build());

			cc.paymentChecks(PaymentOptions.builder()
					.claimNumber(testData.getClaimNumber())
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