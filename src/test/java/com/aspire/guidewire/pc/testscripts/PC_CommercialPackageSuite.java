package com.aspire.guidewire.pc.testscripts;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageConstants;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageConstants.CoveragePart;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageConstants.CoveragesType;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageConstants.LineType;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageConstants.Location;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageConstants.PolicyReviewType;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageConstants.RiskAnalysisType;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageDataEngine;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.AddAccountReceivableDetails;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.AddBlanketDetails;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.AddBuildingLocationDetails;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.AddContractorsEquipmentDetails;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.AddCoveragePartSelections;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.AddCoveragesDetails;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.AddExposuresDetails;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.AddLineReview;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.AddLineSelectionDetails;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.AddLocationDetails;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.AddSignsDetails;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.CancellationSource;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.CreateNewAccountFromPerson;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.EnterAccountInformation;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.Offerings;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.Payments;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.PolicyChange;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.PolicyInfo;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.PolicyReview;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.PreRenewalDirection;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.ReinstatementReason;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.RenewPolicy;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.RiskAnalysis;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.UWIssueType;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.ViewQuote;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageFeatures.PolicyDetails;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageSteps;
import com.aspire.guidewire.pc.teststeps.commercialpackage.CommercialPackageStepsImpl;
import com.aspire.guidewire.utils.DataProviderUtils;
import com.aspire.guidewire.utils.EnvironmentPropertiesReader;
import com.aspire.guidewire.utils.Log;
import com.aspire.guidewire.webdriverManager.DriverManager;

public class PC_CommercialPackageSuite{

	boolean LambdatestStatus = false;

	private static EnvironmentPropertiesReader configProperty = EnvironmentPropertiesReader.getInstance();

	String pCWebSite, browser;

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
	 * Test Description: Verify whether the User able to Create a commercial package policy with 6 month term type.
	 * Test ID: TC236
	 * @author anitha.raphel
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Verify whether the User able to Create a commercial package policy with 6 month term type.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC236(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		
		Log.testCaseInfo("Verify whether the User able to Create a commercial package policy with 6 month term type.", driver);
		CommercialPackageDataEngine testData = new CommercialPackageDataEngine("GWTestData_DataEngine.xlsx", "CommercialPackage", "TC236");

		try {	

			CommercialPackageStepsImpl pc = CommercialPackageSteps.create();

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

			pc.selectProduct(CommercialPackageConstants.ProductNames.COMMERCIAL_PACKAGE);

			pc.selectOfferings(Offerings.builder()
					.offerings(testData.getOfferings()).build());

			pc.selectQualifications();

			pc.updatePolicyInfo(PolicyInfo.builder()
					.organizationType(testData.getOrganizationType())
					.policyTerm(testData.getPolicyTerm()).build());
	
			pc.addLineSelectionDetails(AddLineSelectionDetails.builder()
					.packageRiskType(testData.getPackageRiskType())
					.unSelectLineType(LineType.GENERAL_LIABILITY_LINE)
					.build());
		
			pc.addLineSelectionDetails(AddLineSelectionDetails.builder().build());

			pc.addLocationDetails(AddLocationDetails.builder().build());

			pc.addBuildingLocationDetails(AddBuildingLocationDetails.builder()
					.buildingDescription(testData.getBuildingDescription())
					.coverageForm(testData.getCoverageForm())
					.limit(testData.getLimit())
					.lineType(LineType.COMMERCIAL_PROPERTY_LINE)
					.build());

			pc.addBlanketDetails(AddBlanketDetails.builder()
					.blanketType(testData.getBlanketType())
					.groupType(testData.getGroupType())
					.deductible(testData.getDeductible())
					.limit(testData.getLimit())
					.build());

			pc.addModifiersDetails();

			pc.addLineReview(AddLineReview.builder()
					.lineType(LineType.COMMERCIAL_PROPERTY_LINE).build());

			pc.addCoveragePartSelections(AddCoveragePartSelections.builder()
					.coveragePart(CoveragePart.ACCOUNTS_RECEIVABLE).build());

			pc.addCoveragePartSelections(AddCoveragePartSelections.builder()
					.coveragePart(CoveragePart.CONTRACTORS_EQUIPMENTS).build());

			pc.addCoveragePartSelections(AddCoveragePartSelections.builder()
					.coveragePart(CoveragePart.SIGNS).build());

			pc.addCoveragePartSelections(AddCoveragePartSelections.builder().build());

			pc.addBuildingLocationDetails(AddBuildingLocationDetails.builder()
					.buildingDescription(testData.getBuildingDescription())
					.lineType(LineType.INLAND_MARINE_LINE).build());

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
					.deductible(testData.getContractorDeductible())
					.build());

			pc.addSignsDetails(AddSignsDetails.builder()
					.coinsurancePct(testData.getCoinsurancePct())
					.description(testData.getBuildingDescription())
					.signType(testData.getSignType())
					.limit(testData.getLimit())
					.build());

			pc.addLineReview(AddLineReview.builder()
					.lineType(LineType.INLAND_MARINE_LINE).build());

			pc.addModifiersDetails();

			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			pc.viewQuote(ViewQuote.builder().build());
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(CommercialPackageConstants.Transactions.SUBMISSION);
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
	 * Test Description: Verify whether user able to Create a commercial package policy without any cpp offerings (with commercial property line).
	 * Test ID: TC233
	 * @author anitha.raphel
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Verify whether user able to Create a commercial package policy without any cpp offerings (with commercial property line).", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC233(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		
		Log.testCaseInfo("Verify whether user able to Create a commercial package policy without any cpp offerings (with commercial property line).", driver);
		CommercialPackageDataEngine testData = new CommercialPackageDataEngine("GWTestData_DataEngine.xlsx", "CommercialPackage", "TC233");
		try {	

			CommercialPackageStepsImpl pc = CommercialPackageSteps.create();

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

			pc.selectProduct(CommercialPackageConstants.ProductNames.COMMERCIAL_PACKAGE);

			pc.selectOfferings(Offerings.builder()
					.offerings(testData.getOfferings()).build());

			pc.selectQualifications();

			pc.updatePolicyInfo(PolicyInfo.builder()
					.organizationType(testData.getOrganizationType())
					.policyTerm(testData.getPolicyTerm()).build());
			
			pc.addLineSelectionDetails(AddLineSelectionDetails.builder()
					.packageRiskType(testData.getPackageRiskType())
					.build());

			pc.addLineSelectionDetails(AddLineSelectionDetails.builder().build());
			
			pc.addLocationDetails(AddLocationDetails.builder().build());
			
			pc.addCoveragesDetails(AddCoveragesDetails.builder()
					.coveragesType(CoveragesType.STANDARD_COVERAGES)
					.policyBasis(testData.getPolicyBasis())
					.build());
			
			pc.addCoveragesDetails(AddCoveragesDetails.builder().build());
			
			pc.addExposuresDetails(AddExposuresDetails.builder()
					.basis(testData.getBasis())
					.code(testData.getClassCode()).build());

			Log.testCaseResult(driver);

		} catch (Exception e) {
			Log.exception(e, DriverManager.getDriver());
		} finally {
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}

	}

	/**
	 * Test Description: Verify whether user is able to add one additional insured person with cpp offerings to create a commercial package policy.
	 * Test ID: TC234
	 * @author anitha.raphel
	 * @param browser
	 * @throws Exception
	 */
	
	@Test(description="Verify whether user is able to add one additional insured person with cpp offerings to create a commercial package policy.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC234(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		
		Log.testCaseInfo("Verify whether user is able to add one additional insured person with cpp offerings to create a commercial package policy.", driver);
		CommercialPackageDataEngine testData = new CommercialPackageDataEngine("GWTestData_DataEngine.xlsx", "CommercialPackage", "TC234");
		
		try {	

			CommercialPackageStepsImpl pc = CommercialPackageSteps.create();

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

			pc.selectProduct(CommercialPackageConstants.ProductNames.COMMERCIAL_PACKAGE);

			pc.selectOfferings(Offerings.builder()
					.offerings(testData.getOfferings()).build());

			pc.selectQualifications();

			pc.updatePolicyInfo(PolicyInfo.builder()
					.organizationType(testData.getOrganizationType())
					.policyTerm(testData.getPolicyTerm()).build());

			pc.addLineSelectionDetails(AddLineSelectionDetails.builder()
					.packageRiskType(testData.getPackageRiskType())
					.unSelectLineType(LineType.COMMERCIAL_PROPERTY_LINE)
					.build());

			pc.addLineSelectionDetails(AddLineSelectionDetails.builder().build());

			pc.addLocationDetails(AddLocationDetails.builder()
					.location(Location.EXISTING_LOCATION).build());
			
			pc.addLocationDetails(AddLocationDetails.builder().build());
			
			pc.addCoveragesDetails(AddCoveragesDetails.builder()
					.coveragesType(CoveragesType.ADDITIONAL_INSURED)
					.createInsured(CreateNewAccountFromPerson.builder()
					.addAdditionalInsured(true)
					.insuredType(testData.getInsuredType())
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.addressLine1(testData.getAddressLine1())
					.state(testData.getState())
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType()).build())
					.build());
			
			pc.addCoveragesDetails(AddCoveragesDetails.builder().build());

			pc.addExposuresDetails(AddExposuresDetails.builder()
					.basis(testData.getBasis())
					.code(testData.getClassCode()).build());

			pc.addModifiersDetails();
			
			pc.addLineReview(AddLineReview.builder()
					.lineType(LineType.INLAND_MARINE_LINE).build());
			
			pc.addModifiersDetails();

			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			pc.viewQuote(ViewQuote.builder().build());
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(CommercialPackageConstants.Transactions.SUBMISSION);
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
	 * Test Description: Verify whether the User able to Create a commercial package policy with more than one locations.
	 * Test ID: TC237
	 * @author anitha.raphel
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Verify whether the User able to Create a commercial package policy with more than one locations.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC237(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		
		Log.testCaseInfo("Verify whether the User able to Create a commercial package policy with more than one locations.", driver);
		CommercialPackageDataEngine testData = new CommercialPackageDataEngine("GWTestData_DataEngine.xlsx", "CommercialPackage", "TC237");
		
		try {	

			CommercialPackageStepsImpl pc = CommercialPackageSteps.create();

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

			pc.selectProduct(CommercialPackageConstants.ProductNames.COMMERCIAL_PACKAGE);

			pc.selectOfferings(Offerings.builder()
					.offerings(testData.getOfferings()).build());

			pc.selectQualifications();

			pc.updatePolicyInfo(PolicyInfo.builder()
					.organizationType(testData.getOrganizationType())
					.policyTerm(testData.getPolicyTerm()).build());

			pc.addLineSelectionDetails(AddLineSelectionDetails.builder()
					.packageRiskType(testData.getPackageRiskType()).build());
			
			pc.addLineSelectionDetails(AddLineSelectionDetails.builder().build());

			pc.addLocationDetails(AddLocationDetails.builder().location(Location.NEW_LOCATION)
					.addressLine1(testData.getAddressLine1())
					.state(testData.getState())
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.build());
			
			pc.addLocationDetails(AddLocationDetails.builder().build());

			pc.addCoveragesDetails(AddCoveragesDetails.builder().build());
			
			pc.addExposuresDetails(AddExposuresDetails.builder()
					.basis(testData.getBasis())
					.code(testData.getClassCode()).build());

			pc.addModifiersDetails();
			
			pc.addLineReview(AddLineReview.builder()
					.lineType(LineType.GENERAL_LIABILITY_LINE).build());
			
			pc.addBuildingLocationDetails(AddBuildingLocationDetails.builder()
					.buildingDescription(testData.getBuildingDescription())
					.coverageForm(testData.getCoverageForm())
					.limit(testData.getLimit())
					.lineType(LineType.COMMERCIAL_PROPERTY_LINE)
					.build());

			pc.addBlanketDetails(AddBlanketDetails.builder()
					.blanketType(testData.getBlanketType())
					.groupType(testData.getGroupType())
					.deductible(testData.getDeductible())
					.limit(testData.getLimit())
					.build());

			pc.addModifiersDetails();

			pc.addLineReview(AddLineReview.builder()
					.lineType(LineType.COMMERCIAL_PROPERTY_LINE).build());

			pc.addCoveragePartSelections(AddCoveragePartSelections.builder()
					.coveragePart(CoveragePart.ACCOUNTS_RECEIVABLE).build());

			pc.addCoveragePartSelections(AddCoveragePartSelections.builder()
					.coveragePart(CoveragePart.CONTRACTORS_EQUIPMENTS).build());

			pc.addCoveragePartSelections(AddCoveragePartSelections.builder()
					.coveragePart(CoveragePart.SIGNS).build());

			pc.addCoveragePartSelections(AddCoveragePartSelections.builder().build());

			pc.addBuildingLocationDetails(AddBuildingLocationDetails.builder()
					.buildingDescription(testData.getBuildingDescription())
					.lineType(LineType.INLAND_MARINE_LINE).build());

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
					.deductible(testData.getContractorDeductible())
					.build());

			pc.addSignsDetails(AddSignsDetails.builder()
					.coinsurancePct(testData.getCoinsurancePct())
					.description(testData.getBuildingDescription())
					.signType(testData.getSignType())
					.limit(testData.getLimit())
					.build());

			pc.addLineReview(AddLineReview.builder()
					.lineType(LineType.INLAND_MARINE_LINE).build());

			pc.addModifiersDetails();

			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			pc.viewQuote(ViewQuote.builder().build());
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(CommercialPackageConstants.Transactions.SUBMISSION);
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
	 * Test Description: Verify whether the User able to Create a commercial package policy with two line types (General Liability Line, Commercial Property Line)
	 * Test ID: TC238
	 * @author anitha.raphel
	 * @param browser
	 * @throws Exception
	 */
	
	@Test(description="Verify whether the User able to Create a commercial package policy with two line types (General Liability Line, Commercial Property Line)", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC238(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		
		Log.testCaseInfo("Verify whether the User able to Create a commercial package policy with two line types (General Liability Line, Commercial Property Line)", driver);
		CommercialPackageDataEngine testData = new CommercialPackageDataEngine("GWTestData_DataEngine.xlsx", "CommercialPackage", "TC238");
		
		try {	

			CommercialPackageStepsImpl pc = CommercialPackageSteps.create();

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
			
			pc.selectProduct(CommercialPackageConstants.ProductNames.COMMERCIAL_PACKAGE);

			pc.selectOfferings(Offerings.builder()
					.offerings(testData.getOfferings()).build());

			pc.selectQualifications();

			pc.updatePolicyInfo(PolicyInfo.builder()
					.organizationType(testData.getOrganizationType())
					.policyTerm(testData.getPolicyTerm()).build());

			
			pc.addLineSelectionDetails(AddLineSelectionDetails.builder()
					.packageRiskType(testData.getPackageRiskType()).build());
			
			pc.addLineSelectionDetails(AddLineSelectionDetails.builder().build());

			pc.addLocationDetails(AddLocationDetails.builder().build());

			pc.addCoveragesDetails(AddCoveragesDetails.builder().build());
			
			pc.addExposuresDetails(AddExposuresDetails.builder()
					.basis(testData.getBasis()).code(testData.getClassCode()).build());

			pc.addModifiersDetails();
			
			pc.addLineReview(AddLineReview.builder()
					.lineType(LineType.GENERAL_LIABILITY_LINE).build());
			
			pc.addBuildingLocationDetails(AddBuildingLocationDetails.builder()
					.buildingDescription(testData.getBuildingDescription())
					.coverageForm(testData.getCoverageForm())
					.limit(testData.getLimit())
					.lineType(LineType.COMMERCIAL_PROPERTY_LINE)
					.build());

			pc.addBlanketDetails(AddBlanketDetails.builder()
					.blanketType(testData.getBlanketType())
					.groupType(testData.getGroupType())
					.deductible(testData.getDeductible())
					.limit(testData.getLimit()).build());

			pc.addModifiersDetails();

			pc.addLineReview(AddLineReview.builder()
					.lineType(LineType.INLAND_MARINE_LINE).build());
			
			pc.addModifiersDetails();

			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			pc.viewQuote(ViewQuote.builder().build());
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(CommercialPackageConstants.Transactions.SUBMISSION);
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
	 * Test Description: Verify the Copy Submission Page transaction for commercial package policy
	 * Test ID: TC239
	 * @author anitha.raphel
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Verify the Copy Submission Page transaction for commercial package policy", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC239(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		
		
		Log.testCaseInfo("Verify the Copy Submission Page transaction for commercial package policy", driver);
		CommercialPackageDataEngine testData = new CommercialPackageDataEngine("GWTestData_DataEngine.xlsx", "CommercialPackage", "TC239");
		
		try {	

			CommercialPackageStepsImpl pc = CommercialPackageSteps.create();

			pc.loginIntoTheApplication("su", "gw");
			
			pc.searchPolicyNumber(PolicyDetails.builder()
					.policyNumber(testData.getPolicyNo()).build());
			
			pc.copySubmission();
			
			pc.selectOfferings(Offerings.builder().build());
			
			pc.selectQualifications();

			pc.updatePolicyInfo(PolicyInfo.builder().build());

			pc.addLineSelectionDetails(AddLineSelectionDetails.builder().build());

			pc.addLocationDetails(AddLocationDetails.builder().build());

			pc.addCoveragesDetails(AddCoveragesDetails.builder().build());
			
			pc.addExposuresDetails(AddExposuresDetails.builder().build());

			pc.addModifiersDetails();
			
			pc.addLineReview(AddLineReview.builder()
					.lineType(LineType.GENERAL_LIABILITY_LINE).build());
			
			pc.addBuildingLocationDetails(AddBuildingLocationDetails.builder().build());
			
			pc.addBlanketDetails(AddBlanketDetails.builder().build());
			
			pc.addModifiersDetails();
			
			pc.addLineReview(AddLineReview.builder()
					.lineType(LineType.COMMERCIAL_PROPERTY_LINE).build());
			
			pc.addCoveragePartSelections(AddCoveragePartSelections.builder().build());
			
			pc.addBuildingLocationDetails(AddBuildingLocationDetails.builder()
					.buildingDescription(testData.getBuildingDescription())
					.coverageForm(testData.getCoverageForm())
					.limit(testData.getLimit())
					.lineType(LineType.INLAND_MARINE_LINE)
					.build());
			
			pc.addAccountReceivableDetails(AddAccountReceivableDetails.builder().build());
			
			pc.addContractorsEquipmentDetails(AddContractorsEquipmentDetails.builder().build());
			
			pc.addSignsDetails(AddSignsDetails.builder().build());
			
			pc.addLineReview(AddLineReview.builder()
					.lineType(LineType.INLAND_MARINE_LINE).build());
			
			pc.addModifiersDetails();
			
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			
			pc.viewQuote(ViewQuote.builder().build());
			
			pc.viewForms();
			
			pc.selectPayments(Payments.builder().build());
			
			pc.issuepolicy(CommercialPackageConstants.Transactions.SUBMISSION);
			
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
	 * Test Description: Verify whether the User able to process Flat policy cancellation transaction for commercial package policy.
	 * Test ID: TC240
	 * @author anitha.raphel
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Verify whether the User able to process Flat policy cancellation transaction for commercial package policy.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC240(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		
		
		Log.testCaseInfo("Verify whether the User able to process Flat policy cancellation transaction for commercial package policy.", driver);
		CommercialPackageDataEngine testData = new CommercialPackageDataEngine("GWTestData_DataEngine.xlsx", "CommercialPackage", "TC240");
		
		try {	

			CommercialPackageStepsImpl pc = CommercialPackageSteps.create();

			pc.loginIntoTheApplication("su", "gw");
			
			pc.searchPolicyNumber(PolicyDetails.builder()
					.policyNumber(testData.getPolicyNo()).build());
			
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
	 * Test Description: Verify whether the User able to process Policy cancellation transaction for commercial package policy.
	 * Test ID: TC241
	 * @author anitha.raphel
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Verify whether the User able to process Policy cancellation transaction for commercial package policy.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC241(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		
		
		Log.testCaseInfo("Verify whether the User able to process Policy cancellation transaction for commercial package policy.", driver);
		CommercialPackageDataEngine testData = new CommercialPackageDataEngine("GWTestData_DataEngine.xlsx", "CommercialPackage", "TC241");
		
		try {	

			CommercialPackageStepsImpl pc = CommercialPackageSteps.create();

			pc.loginIntoTheApplication("su", "gw");
			
			pc.searchPolicyNumber(PolicyDetails.builder()
					.policyNumber(testData.getPolicyNo()).build());
			
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
	 * Test Description: Verify whether the User able to process Policy Reinstatement transaction for commercial package policy.
	 * Test ID: TC242
	 * @author anitha.raphel
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Verify whether the User able to process Policy Reinstatement transaction for commercial package policy.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC242(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("Verify whether the User able to process Policy Reinstatement transaction for commercial package policy.", driver);
		CommercialPackageDataEngine testData = new CommercialPackageDataEngine("GWTestData_DataEngine.xlsx", "CommercialPackage", "TC242");
		
		try {	

			CommercialPackageStepsImpl pc = CommercialPackageSteps.create();

			pc.loginIntoTheApplication("su", "gw");
			
			pc.searchPolicyNumber(PolicyDetails.builder()
					.policyNumber(testData.getPolicyNo()).build());
			
			pc.copySubmissions();
			
			pc.viewPolicy();
			
			pc.cancelPolicy(CancellationSource.builder().source(testData.getCancellationSource())
					.reason(testData.getCancellationReason()).build());
			
			pc.viewPolicy();
			
			pc.reinstatePolicy(ReinstatementReason.builder()
					.reason(testData.getReinstatementReason()).build());
			
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
	 * Test Description: Verify whether the User able to process Policy change transaction by adding a new location.
	 * Test ID: TC243
	 * @author anitha.raphel
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Verify whether the User able to process Policy change transaction by adding a new location.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC243(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		
		
		Log.testCaseInfo("Verify whether the User able to process Policy change transaction by adding a new location.", driver);
		CommercialPackageDataEngine testData = new CommercialPackageDataEngine("GWTestData_DataEngine.xlsx", "CommercialPackage", "TC243");
		
		try {	

			CommercialPackageStepsImpl pc = CommercialPackageSteps.create();

			pc.loginIntoTheApplication("su", "gw");
			
			pc.searchPolicyNumber(PolicyDetails.builder()
					.policyNumber(testData.getPolicyNo()).build());
			
			pc.policyChange(PolicyChange.builder().date(testData.getEffectiveDateOneMonthAhead()).build());
			
			pc.selectOfferings(Offerings.builder().build());
			pc.updatePolicyInfo(PolicyInfo.builder()
					.organizationType(testData.getOrganizationType2()).build());
			
			pc.reviewPolicy(PolicyReview.builder(PolicyReviewType.NONE).build());
			pc.viewQuote(ViewQuote.builder().build());
			pc.viewForms();
			pc.selectPayments(Payments.builder()
					.upFrontPayment(testData.getUpFrontPayment()).build()); 
			pc.issuepolicy(CommercialPackageConstants.Transactions.POLICY_CHANGE);
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
	 * Test Description: Verify whether the User able to process Rewrite full term transaction for commercial package policy.
	 * Test ID: TC244
	 * @author anitha.raphel
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Verify whether the User able to process Rewrite full term transaction for commercial package policy.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC244(String browser) throws Exception {
		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		
		
		Log.testCaseInfo("Verify whether the User able to process Rewrite full term transaction for commercial package policy.", driver);
		CommercialPackageDataEngine testData = new CommercialPackageDataEngine("GWTestData_DataEngine.xlsx", "CommercialPackage", "TC244");
		
		try {	

			CommercialPackageStepsImpl pc = CommercialPackageSteps.create();

			pc.loginIntoTheApplication("su", "gw");
			
			pc.searchPolicyNumber(PolicyDetails.builder()
					.policyNumber(testData.getPolicyNo()).build());
			
			pc.copySubmissions();
			
			pc.viewPolicy();
			
			pc.cancelPolicy(CancellationSource.builder().source(testData.getCancellationSource())
					.reason(testData.getCancellationReason()).build());
			pc.viewPolicy();

			pc.policyRewriteFullTerm();
			
			pc.selectOfferings(Offerings.builder().build());
			pc.updatePolicyInfo(PolicyInfo.builder().build());
			
			pc.reviewPolicy(PolicyReview.builder(PolicyReviewType.NONE).build());
			pc.viewQuote(ViewQuote.builder().build());
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(CommercialPackageConstants.Transactions.REWRITE_FULL_TERM);
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
	 * Test Description: Verify whether the User able to process Rewrite new term transaction for commercial package policy.
	 * Test ID: TC245
	 * @author anitha.raphel
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Verify whether the User able to process Rewrite new term transaction for commercial package policy.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC245(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		
		
		Log.testCaseInfo("Verify whether the User able to process Rewrite new term transaction for commercial package policy.", driver);
		CommercialPackageDataEngine testData = new CommercialPackageDataEngine("GWTestData_DataEngine.xlsx", "CommercialPackage", "TC245");
		
		try {	

			CommercialPackageStepsImpl pc = CommercialPackageSteps.create();

			pc.loginIntoTheApplication("su", "gw");
			
			pc.searchPolicyNumber(PolicyDetails.builder()
					.policyNumber(testData.getPolicyNo()).build());
			
			pc.copySubmissions();
			
			pc.viewPolicy();
			
			pc.cancelPolicy(CancellationSource.builder().source(testData.getCancellationSource())
					.reason(testData.getCancellationReason()).build());
			pc.viewPolicy();

			pc.policyRewriteNewTerm();
			pc.selectOfferings(Offerings.builder().build());
			pc.updatePolicyInfo(PolicyInfo.builder().build());
			pc.reviewPolicy(PolicyReview.builder(PolicyReviewType.NONE).build());
			pc.viewQuote(ViewQuote.builder().build());
			pc.viewForms();			
			pc.selectPayments(Payments.builder().build());  
			pc.issuepolicy(CommercialPackageConstants.Transactions.REWRITE_NEW_TERM);
			pc.approveUWissue(UWIssueType.builder().build());
			pc.issuepolicy(CommercialPackageConstants.Transactions.REWRITE_NEW_TERM);
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
	 * Test Description: Verify whether the User able to process Rewrite remainder of term transaction for commercial package policy.
	 * Test ID: TC246
	 * @author anitha.raphel
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Verify whether the User able to process Rewrite remainder of term transaction for commercial package policy.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC246(String browser) throws Exception {
		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		
		
		Log.testCaseInfo("Verify whether the User able to process Rewrite remainder of term transaction for commercial package policy.", driver);
		CommercialPackageDataEngine testData = new CommercialPackageDataEngine("GWTestData_DataEngine.xlsx", "CommercialPackage", "TC246");
		
		try {	

			CommercialPackageStepsImpl pc = CommercialPackageSteps.create();

			pc.loginIntoTheApplication("su", "gw");
			
			pc.searchPolicyNumber(PolicyDetails.builder()
					.policyNumber(testData.getPolicyNo()).build());
			
			pc.copySubmissions();
			
			pc.viewPolicy();
			
			pc.cancelPolicy(CancellationSource.builder().source(testData.getCancellationSource())
					.reason(testData.getCancellationReason()).build());
			pc.viewPolicy();

			pc.policyRewriteRemainderTerm();
			
			pc.selectOfferings(Offerings.builder().build());
			pc.updatePolicyInfo(PolicyInfo.builder().build());
			pc.reviewPolicy(PolicyReview.builder(PolicyReviewType.NONE).build());
			pc.viewQuote(ViewQuote.builder().build());
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(CommercialPackageConstants.Transactions.REWRITE_REMAINDER_TERM);
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
	 * Test Description:Verify whether the User able to process Renew a commercial package policy.
	 * Test ID: TC247
	 * @author anitha.raphel
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Verify whether the User able to process Renew a commercial package policy.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC247(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		
		Log.testCaseInfo("Verify whether the User able to process Renew a commercial package policy.", driver);
		CommercialPackageDataEngine testData = new CommercialPackageDataEngine("GWTestData_DataEngine.xlsx", "CommercialPackage", "TC247");
		
		try {	

			CommercialPackageStepsImpl pc = CommercialPackageSteps.create();

			pc.loginIntoTheApplication("su", "gw");
			
			pc.searchPolicyNumber(PolicyDetails.builder()
					.policyNumber(testData.getPolicyNo()).build());
			
			pc.copySubmissions();
			
			pc.viewPolicy();
			
			pc.policyRenew();
			
			pc.selectOfferings(Offerings.builder().build());
			pc.updatePolicyInfo(PolicyInfo.builder().build());
			pc.addLineSelectionDetails(AddLineSelectionDetails.builder().build());
			pc.reviewPolicy(PolicyReview.builder(PolicyReviewType.RENEW).build());
			pc.viewQuote(ViewQuote.builder().build());
			pc.viewForms();
			pc.issuepolicy(CommercialPackageConstants.Transactions.RENEW_POLICY);
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
	 * Test Description: Verify whether the User able to process Out of Sequence (OOS) transaction for commercial package policy
	 * Test ID: TC248
	 * @author anitha.raphel
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Verify whether the User able to process Out of Sequence (OOS) transaction for commercial package policy", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC248(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		
		
		Log.testCaseInfo("Verify whether the User able to process Out of Sequence (OOS) transaction for commercial package policy", driver);
		CommercialPackageDataEngine testData = new CommercialPackageDataEngine("GWTestData_DataEngine.xlsx", "CommercialPackage", "TC248");
		
		try {	

			CommercialPackageStepsImpl pc = CommercialPackageSteps.create();

			pc.loginIntoTheApplication("su", "gw");
			
			pc.searchPolicyNumber(PolicyDetails.builder()
					.policyNumber(testData.getPolicyNo()).build());
			
			pc.copySubmissions();
			
			pc.viewPolicy();
			
			pc.policyChange(PolicyChange.builder().date(testData.getEffectiveDateOneMonthAhead()).build());
			pc.selectOfferings(Offerings.builder().build());
			pc.updatePolicyInfo(PolicyInfo.builder().organizationType(testData.getOrganizationType2()).build());
			pc.reviewPolicy(PolicyReview.builder(PolicyReviewType.NONE).build());
			pc.viewQuote(ViewQuote.builder().build());
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(CommercialPackageConstants.Transactions.POLICY_CHANGE);
			pc.viewPolicy();

			pc.policyChange(PolicyChange.builder().date(testData.getEffectiveDateAsCurrentDate()).build());
			pc.verifyOutOfSequenceMessage(PolicyChange.builder()
					.date(testData.getEffectiveDateOneMonthAhead()).build());
			pc.selectOfferings(Offerings.builder().build());
			pc.verifyOutOfSequenceMessage(PolicyChange.builder().date(testData.getEffectiveDateOneMonthAhead()).build());
			pc.updatePolicyInfo(PolicyInfo.builder().organizationType(testData.getOrganizationType3()).build());
			pc.verifyOutOfSequenceMessage(PolicyChange.builder().date(testData.getEffectiveDateOneMonthAhead()).build());

			pc.reviewPolicy(PolicyReview.builder(PolicyReviewType.NONE).build());
			pc.verifyOutOfSequenceMessage(PolicyChange.builder().date(testData.getEffectiveDateOneMonthAhead()).build());
			pc.viewQuote(ViewQuote.builder().build());
			pc.viewForms();
			pc.verifyOutOfSequenceMessage(PolicyChange.builder().date(testData.getEffectiveDateOneMonthAhead()).build());
			
			pc.issuepolicy(CommercialPackageConstants.Transactions.POLICY_CHANGE);
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
	 * Test Description: Verify whether the User able to process Pre-Renewal direction for the Commercial Package Policy 
	 * Test ID: TC249
	 * @author anitha.raphel
	 * @param browser
	 * @throws Exception
	 */
	@Test(description=" Verify whether the User able to process Pre-Renewal direction for the Commercial Package Policy ", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC249(String browser) throws Exception {
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		
		Log.testCaseInfo("Verify whether the User able to process Pre-Renewal direction for the Commercial Package Policy ", driver);
		CommercialPackageDataEngine testData = new CommercialPackageDataEngine("GWTestData_DataEngine.xlsx", "CommercialPackage", "TC249");
		
		try {	

			CommercialPackageStepsImpl pc = CommercialPackageSteps.create();

			pc.loginIntoTheApplication("su", "gw");
			
			pc.searchPolicyNumber(PolicyDetails.builder()
					.policyNumber(testData.getPolicyNo()).build());
			
			pc.copySubmissions();
			
			pc.viewPolicy();
			
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
	 * Test Description: Verify whether the User able to Create an underwriter issue manually for commercial package policy to block bind.
	 * Test ID: TC297
	 * @author anitha.raphel
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Verify whether the User able to Create an underwriter issue manually for commercial package policy to block bind.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC297(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		
		Log.testCaseInfo("Verify whether the User able to Create an underwriter issue manually for commercial package policy to block bind.", driver);
		CommercialPackageDataEngine testData = new CommercialPackageDataEngine("GWTestData_DataEngine.xlsx", "CommercialPackage", "TC297");
		
		try {	
			CommercialPackageStepsImpl pc = CommercialPackageSteps.create();

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

			pc.selectProduct(CommercialPackageConstants.ProductNames.COMMERCIAL_PACKAGE);

			pc.selectOfferings(Offerings.builder()
					.offerings(testData.getOfferings()).build());

			pc.selectQualifications();

			pc.updatePolicyInfo(PolicyInfo.builder()
					.organizationType(testData.getOrganizationType())
					.policyTerm(testData.getPolicyTerm()).build());

			pc.addLineSelectionDetails(AddLineSelectionDetails.builder()
					.packageRiskType(testData.getPackageRiskType())
					.unSelectLineType(LineType.GENERAL_LIABILITY_LINE).build());
			
			pc.addLineSelectionDetails(AddLineSelectionDetails.builder()
					.unSelectLineType(LineType.INLAND_MARINE_LINE).build());
			
			pc.addLineSelectionDetails(AddLineSelectionDetails.builder().build());
			
			pc.addLocationDetails(AddLocationDetails.builder().build());
			
			pc.addBuildingLocationDetails(AddBuildingLocationDetails.builder()
					.buildingDescription(testData.getBuildingDescription())
					.coverageForm(testData.getCoverageForm())
					.limit(testData.getLimit())
					.lineType(LineType.COMMERCIAL_PROPERTY_LINE)
					.build());

			pc.addBlanketDetails(AddBlanketDetails.builder()
					.blanketType(testData.getBlanketType())
					.groupType(testData.getGroupType())
					.deductible(testData.getDeductible())
					.limit(testData.getLimit()).build());

			pc.addModifiersDetails();

			pc.addLineReview(AddLineReview.builder()
					.lineType(LineType.INLAND_MARINE_LINE).build());

			pc.addModifiersDetails();

			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.UW_ISSUE)
					.uWIssueType(testData.getUWIssueType())
					.longDescription(testData.getUWLongDescription())
					.build());
			
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE)
					.lineType(LineType.COMMERCIAL_PROPERTY_LINE)
					.build());
			
			pc.viewQuote(ViewQuote.builder()
					.lineType(LineType.COMMERCIAL_PROPERTY_LINE)
					.build());
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(CommercialPackageConstants.Transactions.BIND_ONLY);
			pc.approveUWissue(UWIssueType.builder()
					.IssueType(testData.getUWIssueType())
					.build());
			pc.viewQuote(ViewQuote.builder()
					.build());
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(CommercialPackageConstants.Transactions.SUBMISSION);
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
	 * Test Description: Verify whether the User able to Reopen an underwriter issue which was blocking the quote for commercial package policy.
	 * Test ID: TC299
	 * @author anitha.raphel
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Verify whether the User able to Reopen an underwriter issue which was blocking the quote for commercial package policy.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC299(String browser) throws Exception {
		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		
		
		Log.testCaseInfo("Verify whether the User able to Reopen an underwriter issue which was blocking the quote for commercial package policy.", driver);
		CommercialPackageDataEngine testData = new CommercialPackageDataEngine("GWTestData_DataEngine.xlsx", "CommercialPackage", "TC299");
		
		try {	

			CommercialPackageStepsImpl pc = CommercialPackageSteps.create();

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

			pc.selectProduct(CommercialPackageConstants.ProductNames.COMMERCIAL_PACKAGE);

			pc.selectOfferings(Offerings.builder()
					.offerings(testData.getOfferings()).build());

			pc.selectQualifications();

			pc.updatePolicyInfo(PolicyInfo.builder()
					.organizationType(testData.getOrganizationType())
					.policyTerm(testData.getPolicyTerm()).build());
			
			pc.addLineSelectionDetails(AddLineSelectionDetails.builder()
					.packageRiskType(testData.getPackageRiskType()).build());
			
			pc.addLineSelectionDetails(AddLineSelectionDetails.builder().build());

			pc.addLocationDetails(AddLocationDetails.builder().build());

			pc.addCoveragesDetails(AddCoveragesDetails.builder().build());
			
			pc.addExposuresDetails(AddExposuresDetails.builder()
					.basis(testData.getBasis()).code(testData.getClassCode()).build());

			pc.addModifiersDetails();
			
			pc.addLineReview(AddLineReview.builder()
					.lineType(LineType.GENERAL_LIABILITY_LINE).build());
			
			pc.addBuildingLocationDetails(AddBuildingLocationDetails.builder()
					.buildingDescription(testData.getBuildingDescription())
					.coverageForm(testData.getCoverageForm())
					.limit(testData.getLimit())
					.lineType(LineType.COMMERCIAL_PROPERTY_LINE)
					.build());

			pc.addBlanketDetails(AddBlanketDetails.builder()
					.blanketType(testData.getBlanketType())
					.groupType(testData.getGroupType())
					.deductible(testData.getDeductible())
					.limit(testData.getLimit()).build());

			pc.addModifiersDetails();

			pc.addLineReview(AddLineReview.builder()
					.lineType(LineType.INLAND_MARINE_LINE).build());
			
			pc.addModifiersDetails();

			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.UW_ISSUE)
					.uWIssueType(testData.getUWIssueType())
					.longDescription(testData.getUWLongDescription())
					.build());	
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE)
					.build());
			
			pc.approveUWissue(UWIssueType.builder()
					.IssueType(testData.getUWIssueType())
					.build());
			
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.REOPEN)
					.lineType(LineType.COMMERCIAL_PROPERTY_LINE)
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
	 * Test Description: Verify whether the User able to Reopen an underwriter issue which was blocking  issuance for commercial package policy.
	 * Test ID: TC301
	 * @author anitha.raphel
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Verify whether the User able to Reopen an underwriter issue which was blocking  issuance for commercial package policy.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC301(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		
		
		Log.testCaseInfo("Verify whether the User able to Reopen an underwriter issue which was blocking  issuance for commercial package policy.", driver);
		CommercialPackageDataEngine testData = new CommercialPackageDataEngine("GWTestData_DataEngine.xlsx", "CommercialPackage", "TC301");
		
		try {	

			CommercialPackageStepsImpl pc = CommercialPackageSteps.create();

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

			pc.selectProduct(CommercialPackageConstants.ProductNames.COMMERCIAL_PACKAGE);

			pc.selectOfferings(Offerings.builder()
					.offerings(testData.getOfferings()).build());

			pc.selectQualifications();

			pc.updatePolicyInfo(PolicyInfo.builder()
					.organizationType(testData.getOrganizationType())
					.policyTerm(testData.getPolicyTerm()).build());
			
			pc.addLineSelectionDetails(AddLineSelectionDetails.builder()
					.packageRiskType(testData.getPackageRiskType()).build());
			
			pc.addLineSelectionDetails(AddLineSelectionDetails.builder().build());

			pc.addLocationDetails(AddLocationDetails.builder().build());

			pc.addCoveragesDetails(AddCoveragesDetails.builder().build());
			
			pc.addExposuresDetails(AddExposuresDetails.builder()
					.basis(testData.getBasis()).code(testData.getClassCode()).build());

			pc.addModifiersDetails();
			
			pc.addLineReview(AddLineReview.builder()
					.lineType(LineType.GENERAL_LIABILITY_LINE).build());
			
			pc.addBuildingLocationDetails(AddBuildingLocationDetails.builder()
					.buildingDescription(testData.getBuildingDescription())
					.coverageForm(testData.getCoverageForm())
					.limit(testData.getLimit())
					.lineType(LineType.COMMERCIAL_PROPERTY_LINE)
					.build());

			pc.addBlanketDetails(AddBlanketDetails.builder()
					.blanketType(testData.getBlanketType())
					.groupType(testData.getGroupType())
					.deductible(testData.getDeductible())
					.limit(testData.getLimit()).build());

			pc.addModifiersDetails();

			pc.addLineReview(AddLineReview.builder()
					.lineType(LineType.INLAND_MARINE_LINE).build());
			
			pc.addModifiersDetails();

			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.UW_ISSUE)
					.uWIssueType(testData.getUWIssueType())
					.longDescription(testData.getUWLongDescription())
					.build());
			
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE)
					.build());
			
			pc.viewQuote(ViewQuote.builder()
					.build());
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(CommercialPackageConstants.Transactions.SUBMISSION);
			pc.approveUWissue(UWIssueType.builder()
					.IssueType(testData.getUWIssueType())
					.build());
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.REOPEN)
					.lineType(LineType.COMMERCIAL_PROPERTY_LINE)
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
	 * Test Description: Verify whether the User able to Create a commercial package policy by adding some loss history.
	 * Test ID: TC303
	 * @author anitha.raphel
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Verify whether the User able to Create a commercial package policy by adding some loss history.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC303(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		
		
		Log.testCaseInfo("Verify whether the User able to Create a commercial package policy by adding some loss history.", driver);
		CommercialPackageDataEngine testData = new CommercialPackageDataEngine("GWTestData_DataEngine.xlsx", "CommercialPackage", "TC303");
		
		try {	

			CommercialPackageStepsImpl pc = CommercialPackageSteps.create();

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

			pc.selectProduct(CommercialPackageConstants.ProductNames.COMMERCIAL_PACKAGE);

			pc.selectOfferings(Offerings.builder()
					.offerings(testData.getOfferings()).build());

			pc.selectQualifications();

			pc.updatePolicyInfo(PolicyInfo.builder()
					.organizationType(testData.getOrganizationType())
					.policyTerm(testData.getPolicyTerm()).build());

			pc.addLineSelectionDetails(AddLineSelectionDetails.builder()
					.packageRiskType(testData.getPackageRiskType()).build());
			
			pc.addLineSelectionDetails(AddLineSelectionDetails.builder().build());

			pc.addLocationDetails(AddLocationDetails.builder().build());

			pc.addCoveragesDetails(AddCoveragesDetails.builder().build());
			
			pc.addExposuresDetails(AddExposuresDetails.builder()
					.basis(testData.getBasis()).code(testData.getClassCode()).build());

			pc.addModifiersDetails();
			
			pc.addLineReview(AddLineReview.builder()
					.lineType(LineType.GENERAL_LIABILITY_LINE).build());
			
			pc.addBuildingLocationDetails(AddBuildingLocationDetails.builder()
					.buildingDescription(testData.getBuildingDescription())
					.coverageForm(testData.getCoverageForm())
					.limit(testData.getLimit())
					.lineType(LineType.COMMERCIAL_PROPERTY_LINE)
					.build());

			pc.addBlanketDetails(AddBlanketDetails.builder()
					.blanketType(testData.getBlanketType())
					.groupType(testData.getGroupType())
					.deductible(testData.getDeductible())
					.limit(testData.getLimit()).build());

			pc.addModifiersDetails();

			pc.addLineReview(AddLineReview.builder()
					.lineType(LineType.INLAND_MARINE_LINE).build());
			
			pc.addModifiersDetails();

			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.PRIORLOSSES_MANUAL_ENTER)
					.lossCount(1)
					.lineType(LineType.COMMERCIAL_PROPERTY_LINE)
					.lossHistoryType(testData.getLossHistoryType())
					.occurenceDateField(testData.getEffectiveDateAsCurrentDate())
					.priorLossDescription(testData.getPriorLossDescription())
					.totalIncurred(testData.getTotalIncurred())
					.amountPaid(testData.getAmountPaid())
					.openReserve(testData.getOpenReserve())
					.lossHistoryStatus(testData.getLossHistoryStatus()).build());
			
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			
			pc.viewQuote(ViewQuote.builder().build());
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(CommercialPackageConstants.Transactions.SUBMISSION);
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
	 * Test Description: Verify whether the user is able to issue a policy with one or more manual loss history.
	 * Test ID: TC305
	 * @author anitha.raphel
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Verify whether the user is able to issue a policy with one or more manual loss history.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC305(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		
		
		Log.testCaseInfo("Verify whether the user is able to issue a policy with one or more manual loss history.", driver);
		CommercialPackageDataEngine testData = new CommercialPackageDataEngine("GWTestData_DataEngine.xlsx", "CommercialPackage", "TC305");
		
		try {	

			CommercialPackageStepsImpl pc = CommercialPackageSteps.create();

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

			pc.selectProduct(CommercialPackageConstants.ProductNames.COMMERCIAL_PACKAGE);

			pc.selectOfferings(Offerings.builder()
					.offerings(testData.getOfferings()).build());

			pc.selectQualifications();

			pc.updatePolicyInfo(PolicyInfo.builder()
					.organizationType(testData.getOrganizationType())
					.policyTerm(testData.getPolicyTerm()).build());

			pc.addLineSelectionDetails(AddLineSelectionDetails.builder()
					.packageRiskType(testData.getPackageRiskType()).build());
			
			pc.addLineSelectionDetails(AddLineSelectionDetails.builder().build());

			pc.addLocationDetails(AddLocationDetails.builder().build());

			pc.addCoveragesDetails(AddCoveragesDetails.builder().build());
			
			pc.addExposuresDetails(AddExposuresDetails.builder()
					.basis(testData.getBasis())
					.code(testData.getClassCode()).build());

			pc.addModifiersDetails();
			
			pc.addLineReview(AddLineReview.builder()
					.lineType(LineType.GENERAL_LIABILITY_LINE).build());
			
			pc.addBuildingLocationDetails(AddBuildingLocationDetails.builder()
					.buildingDescription(testData.getBuildingDescription())
					.coverageForm(testData.getCoverageForm())
					.limit(testData.getLimit())
					.lineType(LineType.COMMERCIAL_PROPERTY_LINE)
					.build());

			pc.addBlanketDetails(AddBlanketDetails.builder()
					.blanketType(testData.getBlanketType())
					.groupType(testData.getGroupType())
					.deductible(testData.getDeductible())
					.limit(testData.getLimit()).build());

			pc.addModifiersDetails();

			pc.addLineReview(AddLineReview.builder()
					.lineType(LineType.INLAND_MARINE_LINE).build());
			
			pc.addModifiersDetails();

			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.PRIORLOSSES_MANUAL_ENTER)
					.lossCount(1)
					.lineType(LineType.COMMERCIAL_PROPERTY_LINE)
					.lossHistoryType(testData.getLossHistoryType())
					.occurenceDateField(testData.getEffectiveDateAsCurrentDate())
					.priorLossDescription(testData.getPriorLossDescription())
					.totalIncurred(testData.getTotalIncurred())
					.amountPaid(testData.getAmountPaid())
					.openReserve(testData.getOpenReserve())
					.lossHistoryStatus(testData.getLossHistoryStatus()).build());
			
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.PRIORLOSSES_MANUAL_ENTER)
					.lossCount(1)
					.lineType(LineType.GENERAL_LIABILITY_LINE)
					.lossHistoryType(testData.getLossHistoryType())
					.occurenceDateField(testData.getEffectiveDateAsCurrentDate())
					.priorLossDescription(testData.getPriorLossDescription())
					.totalIncurred(testData.getTotalIncurred())
					.amountPaid(testData.getAmountPaid())
					.openReserve(testData.getOpenReserve())
					.lossHistoryStatus(testData.getLossHistoryStatus()).build());
			
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			
			pc.viewQuote(ViewQuote.builder().build());
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(CommercialPackageConstants.Transactions.SUBMISSION);
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
	 * Test Description: Check the prior policy history is prefilled for commercial package policy.
	 * Test ID: TC307
	 * @author anitha.raphel
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Check the prior policy history is prefilled for commercial package policy.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC307(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		
		Log.testCaseInfo("Check the prior policy history is prefilled for commercial package policy.", driver);
		CommercialPackageDataEngine testData = new CommercialPackageDataEngine("GWTestData_DataEngine.xlsx", "CommercialPackage", "TC307");
		
		try {	

			CommercialPackageStepsImpl pc = CommercialPackageSteps.create();

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

			pc.selectProduct(CommercialPackageConstants.ProductNames.COMMERCIAL_PACKAGE);

			pc.selectOfferings(Offerings.builder()
					.offerings(testData.getOfferings()).build());

			pc.selectQualifications();

			pc.updatePolicyInfo(PolicyInfo.builder()
					.organizationType(testData.getOrganizationType())
					.policyTerm(testData.getPolicyTerm()).build());

			pc.addLineSelectionDetails(AddLineSelectionDetails.builder()
					.packageRiskType(testData.getPackageRiskType()).build());
			
			pc.addLineSelectionDetails(AddLineSelectionDetails.builder().build());

			pc.addLocationDetails(AddLocationDetails.builder().build());

			pc.addCoveragesDetails(AddCoveragesDetails.builder().build());
			
			pc.addExposuresDetails(AddExposuresDetails.builder()
					.basis(testData.getBasis()).code(testData.getClassCode()).build());

			pc.addModifiersDetails();
			
			pc.addLineReview(AddLineReview.builder()
					.lineType(LineType.GENERAL_LIABILITY_LINE).build());
			
			pc.addBuildingLocationDetails(AddBuildingLocationDetails.builder()
					.buildingDescription(testData.getBuildingDescription())
					.coverageForm(testData.getCoverageForm())
					.limit(testData.getLimit())
					.lineType(LineType.COMMERCIAL_PROPERTY_LINE)
					.build());

			pc.addBlanketDetails(AddBlanketDetails.builder()
					.blanketType(testData.getBlanketType())
					.groupType(testData.getGroupType())
					.deductible(testData.getDeductible())
					.limit(testData.getLimit()).build());

			pc.addModifiersDetails();

			pc.addLineReview(AddLineReview.builder()
					.lineType(LineType.INLAND_MARINE_LINE).build());
			
			pc.addModifiersDetails();

			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.PRIOR_POLICIES)
					.carrier(testData.getCarrier())
					.policyNo(testData.getPolicyNo())
					.effectiveDate(testData.getEffectiveDateAsCurrentDate())
					.expirationDate(testData.getEffectiveDateOneMonthAhead())
					.annualPremium(testData.getLimit())
					.losses(testData.getLimit())
					.totalLosses(testData.getLimit())
					.build());
			
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.NONE).build());
			
			pc.viewQuote(ViewQuote.builder().build());
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(CommercialPackageConstants.Transactions.SUBMISSION);
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
	 * Test Description: Verify whether the User able to Resolve a contingency manually for commercial package policy.
	 * Test ID: TC309
	 * @author anitha.raphel
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Verify whether the User able to Resolve a contingency manually for commercial package policy.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC309(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("Verify whether the User able to Resolve a contingency manually for commercial package policy.", driver);
		CommercialPackageDataEngine testData = new CommercialPackageDataEngine("GWTestData_DataEngine.xlsx", "CommercialPackage", "TC309");
		
		try {	
			
			CommercialPackageStepsImpl pc = CommercialPackageSteps.create();

			pc.loginIntoTheApplication("su", "gw");
			
			pc.searchPolicyNumber(PolicyDetails.builder()
					.policyNumber(testData.getPolicyNo()).build());
			
			pc.copySubmissionsandAddContingincy(RiskAnalysis.builder(RiskAnalysisType.CONTINGENCY)
					.contingencyTitle(testData.getContingencyTitle())
					.contingencyDescription(testData.getContingencyDescription())
					.contingencyAction(testData.getContingencyAction())
					.contingencyDueDate(testData.getEffectiveDateOneMonthAhead()).build());
			
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
	 * Test Description: Verify whether the User able to Resolve the contingency for commercial package policy by uploading required documents.
	 * Test ID: TC311
	 * @author anitha.raphel
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Verify whether the User able to Resolve the contingency for commercial package policy by uploading required documents.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC311(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		
		Log.testCaseInfo("Verify whether the User able to Resolve the contingency for commercial package policy by uploading required documents.", driver);
		CommercialPackageDataEngine testData = new CommercialPackageDataEngine("GWTestData_DataEngine.xlsx", "CommercialPackage", "TC311");
		
		try {	

			CommercialPackageStepsImpl pc = CommercialPackageSteps.create();

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

			pc.selectProduct(CommercialPackageConstants.ProductNames.COMMERCIAL_PACKAGE);

			pc.selectOfferings(Offerings.builder()
					.offerings(testData.getOfferings()).build());

			pc.selectQualifications();

			pc.updatePolicyInfo(PolicyInfo.builder()
					.organizationType(testData.getOrganizationType())
					.policyTerm(testData.getPolicyTerm()).build());

			pc.addLineSelectionDetails(AddLineSelectionDetails.builder()
					.packageRiskType(testData.getPackageRiskType()).build());
			
			pc.addLineSelectionDetails(AddLineSelectionDetails.builder().build());

			pc.addLocationDetails(AddLocationDetails.builder().build());

			pc.addCoveragesDetails(AddCoveragesDetails.builder().build());
			
			pc.addExposuresDetails(AddExposuresDetails.builder()
					.basis(testData.getBasis()).code(testData.getClassCode()).build());

			pc.addModifiersDetails();
			
			pc.addLineReview(AddLineReview.builder()
					.lineType(LineType.GENERAL_LIABILITY_LINE).build());
			
			pc.addBuildingLocationDetails(AddBuildingLocationDetails.builder()
					.buildingDescription(testData.getBuildingDescription())
					.coverageForm(testData.getCoverageForm())
					.limit(testData.getLimit())
					.lineType(LineType.COMMERCIAL_PROPERTY_LINE)
					.build());

			pc.addBlanketDetails(AddBlanketDetails.builder()
					.blanketType(testData.getBlanketType())
					.groupType(testData.getGroupType())
					.deductible(testData.getDeductible())
					.limit(testData.getLimit())
					.build());

			pc.addModifiersDetails();

			pc.addLineReview(AddLineReview.builder()
					.lineType(LineType.INLAND_MARINE_LINE).build());
			
			pc.addModifiersDetails();
			
			pc.selectRiskAnalysis(RiskAnalysis.builder(RiskAnalysisType.CONTINGENCY)
					.contingencyTitle(testData.getContingencyTitle())
					.contingencyDescription(testData.getContingencyDescription())
					.contingencyAction(testData.getContingencyAction())
					.contingencyDueDate(testData.getEffectiveDateOneMonthAhead()).build());

			pc.viewQuote(ViewQuote.builder().build());
			pc.viewForms();
			pc.selectPayments(Payments.builder().build());
			pc.issuepolicy(CommercialPackageConstants.Transactions.SUBMISSION);
			pc.viewPolicy();
			pc.completedPolicyTransactions();
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
	 * Test Description: Verify whether the contingency action - Change policy retroactively is taken after the due date for commercial package policy.
	 * Test ID: TC313
	 * @author anitha.raphel
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Verify whether the contingency action - Change policy retroactively is taken after the due date for commercial package policy.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC313(String browser) throws Exception {
		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		
		
		Log.testCaseInfo("Verify whether the contingency action - Change policy retroactively is taken after the due date for commercial package policy.", driver);
		CommercialPackageDataEngine testData = new CommercialPackageDataEngine("GWTestData_DataEngine.xlsx", "CommercialPackage", "TC313");
		
		try {	

			CommercialPackageStepsImpl pc = CommercialPackageSteps.create();

			pc.loginIntoTheApplication("su", "gw");
			
			pc.searchPolicyNumber(PolicyDetails.builder()
					.policyNumber(testData.getPolicyNo()).build());
			
			pc.copySubmissionsandAddContingincy(RiskAnalysis.builder(RiskAnalysisType.CONTINGENCY)
					.contingencyTitle(testData.getContingencyTitle())
					.contingencyDescription(testData.getContingencyDescription())
					.contingencyAction(testData.getContingencyAction())
					.contingencyDueDate(testData.getEffectiveDateOneMonthAhead()).build());
			
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
	 * Test Description: Verify whether the contingency action - Cancel retroactively is taken after the due date for commercial package policy.
	 * Test ID: TC315
	 * @author anitha.raphel
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Verify whether the contingency action - Cancel retroactively is taken after the due date for commercial package policy.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC315(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("Verify whether the contingency action - Cancel retroactively is taken after the due date for commercial package policy.", driver);
		CommercialPackageDataEngine testData = new CommercialPackageDataEngine("GWTestData_DataEngine.xlsx", "CommercialPackage", "TC315");
		
		try {	
			
			CommercialPackageStepsImpl pc = CommercialPackageSteps.create();

			pc.loginIntoTheApplication("su", "gw");
			
			pc.searchPolicyNumber(PolicyDetails.builder()
					.policyNumber(testData.getPolicyNo()).build());
			
			pc.copySubmissionsandAddContingincy(RiskAnalysis.builder(RiskAnalysisType.CONTINGENCY)
					.contingencyTitle(testData.getContingencyTitle())
					.contingencyDescription(testData.getContingencyDescription())
					.contingencyAction(testData.getContingencyAction())
					.contingencyDueDate(testData.getEffectiveDateOneMonthAhead()).build());
			
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
	 * Test Description: Check whether the contingency action - Cancel / Rewrite is taken after the due date for commercial package policy.
	 * Test ID: TC317
	 * @author anitha.raphel
	 * @param browser
	 * @throws Exception
	 */
	@Test(description="Check whether the contingency action - Cancel / Rewrite is taken after the due date for commercial package policy.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC317(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		
		
		Log.testCaseInfo("Check whether the contingency action - Cancel / Rewrite is taken after the due date for commercial package policy.", driver);
		CommercialPackageDataEngine testData = new CommercialPackageDataEngine("GWTestData_DataEngine.xlsx", "CommercialPackage", "TC317");
		
		try {	
			CommercialPackageStepsImpl pc = CommercialPackageSteps.create();

			pc.loginIntoTheApplication("su", "gw");
			
			pc.searchPolicyNumber(PolicyDetails.builder()
					.policyNumber(testData.getPolicyNo()).build());
			
			pc.copySubmissionsandAddContingincy(RiskAnalysis.builder(RiskAnalysisType.CONTINGENCY)
					.contingencyTitle(testData.getContingencyTitle())
					.contingencyDescription(testData.getContingencyDescription())
					.contingencyAction(testData.getContingencyAction())
					.contingencyDueDate(testData.getEffectiveDateOneMonthAhead()).build());
			
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
	
}