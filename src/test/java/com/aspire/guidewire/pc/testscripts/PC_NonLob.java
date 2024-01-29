package com.aspire.guidewire.pc.testscripts;


import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aspire.guidewire.pc.pages.common.AccountSummaryPage;
import com.aspire.guidewire.pc.pages.common.AccountSummaryPage.EditAccountPage;
import com.aspire.guidewire.pc.pages.common.ActionsPage;
import com.aspire.guidewire.pc.pages.common.HeaderPage;
import com.aspire.guidewire.pc.pages.common.PolicySummaryPage;
import com.aspire.guidewire.pc.pages.nonlob.ActivityPatternsPage;
import com.aspire.guidewire.pc.pages.nonlob.ActivityPatternsPage.NewActivityPatternPage;
import com.aspire.guidewire.pc.pages.nonlob.AdministrationPage;
import com.aspire.guidewire.pc.pages.nonlob.AffinityGroupsPage;
import com.aspire.guidewire.pc.pages.nonlob.AttributesPage;
import com.aspire.guidewire.pc.pages.nonlob.AttributesPage.NewAttributePage;
import com.aspire.guidewire.pc.pages.nonlob.AuthorityProfilesPage;
import com.aspire.guidewire.pc.pages.nonlob.AuthorityProfilesPage.NewAuthorityProfilePage;
import com.aspire.guidewire.pc.pages.nonlob.AuthorityProfilesPage.NewAuthorityProfilePage.IssueTypeSearchPage;
import com.aspire.guidewire.pc.pages.nonlob.BatchProcessInfoPage;
import com.aspire.guidewire.pc.pages.nonlob.BatchProcessInfoPage.SelectRangePage;
import com.aspire.guidewire.pc.pages.nonlob.DesktopPage;
import com.aspire.guidewire.pc.pages.nonlob.DestinationEmailPage;
import com.aspire.guidewire.pc.pages.nonlob.GroupsPage;
import com.aspire.guidewire.pc.pages.nonlob.GroupsPage.GroupActuaryUnitOPage;
import com.aspire.guidewire.pc.pages.nonlob.ImportExportStatusPage;
import com.aspire.guidewire.pc.pages.nonlob.ImportExportStatusPage.ImportPage;
import com.aspire.guidewire.pc.pages.nonlob.MergeAccountIntoThisAccountPage;
import com.aspire.guidewire.pc.pages.nonlob.MessageQueuesPage;
import com.aspire.guidewire.pc.pages.nonlob.MovePoliciesToThisAccountPage;
import com.aspire.guidewire.pc.pages.nonlob.MyActivitiesPage;
import com.aspire.guidewire.pc.pages.nonlob.MyActivitiesPage.AssignActivitiesPage;
import com.aspire.guidewire.pc.pages.nonlob.OrganizationsPage;
import com.aspire.guidewire.pc.pages.nonlob.OrganizationsPage.OrganizationNamePage;
import com.aspire.guidewire.pc.pages.nonlob.ProducerCodesPage;
import com.aspire.guidewire.pc.pages.nonlob.ProducerCodesPage.ProducerCodeRolesPage;
import com.aspire.guidewire.pc.pages.nonlob.RateBooksPage;
import com.aspire.guidewire.pc.pages.nonlob.RateBooksPage.DemoRatingPage;
import com.aspire.guidewire.pc.pages.nonlob.RateRountinesPage;
import com.aspire.guidewire.pc.pages.nonlob.RateRountinesPage.RateRountineNamePage;
import com.aspire.guidewire.pc.pages.nonlob.RateTableDefinitionsPage;
import com.aspire.guidewire.pc.pages.nonlob.RegionsPage;
import com.aspire.guidewire.pc.pages.nonlob.RegionsPage.AddRegionPage;
import com.aspire.guidewire.pc.pages.nonlob.RewritePoliciesToThisAccountPage;
import com.aspire.guidewire.pc.pages.nonlob.RolesPage;
import com.aspire.guidewire.pc.pages.nonlob.RolesPage.NewRolesPage;
import com.aspire.guidewire.pc.pages.nonlob.SearchAccountsPage;
import com.aspire.guidewire.pc.pages.nonlob.SearchActivitiesPage;
import com.aspire.guidewire.pc.pages.nonlob.SearchActivitiesPage.SearchUserPage;
import com.aspire.guidewire.pc.pages.nonlob.SearchContactsPage;
import com.aspire.guidewire.pc.pages.nonlob.SearchPoliciesPage;
import com.aspire.guidewire.pc.pages.nonlob.SearchProducerCodes;
import com.aspire.guidewire.pc.pages.nonlob.TestingSystemClockPage;
import com.aspire.guidewire.pc.pages.nonlob.UnderwritingRulesPage;
import com.aspire.guidewire.pc.pages.nonlob.UnderwritingRulesPage.CreateNewRulePage;
import com.aspire.guidewire.pc.pages.nonlob.UnderwritingRulesPage.ExistingRulesPage;
import com.aspire.guidewire.pc.pages.nonlob.UsersPage;
import com.aspire.guidewire.pc.pages.nonlob.UsersPage.UserSuperUserPage;
import com.aspire.guidewire.pc.pages.nonlob.WorkQueueInfoPage;
import com.aspire.guidewire.pc.pages.nonlob.WorkQueueInfoPage.HandleUnresolvedContingencyPage;
import com.aspire.guidewire.pc.teststeps.nonlob.DataFakers;
import com.aspire.guidewire.pc.teststeps.nonlob.NonLobDataEngine;
import com.aspire.guidewire.pc.teststeps.nonlob.NonLobFeatures.CreateNewAccountFromAddressBook;
import com.aspire.guidewire.pc.teststeps.nonlob.NonLobFeatures.CreateNewAccountFromCompany;
import com.aspire.guidewire.pc.teststeps.nonlob.NonLobFeatures.CreateNewAccountFromPerson;
import com.aspire.guidewire.pc.teststeps.nonlob.NonLobFeatures.EnterAccountInformation;
import com.aspire.guidewire.pc.teststeps.nonlob.NonLobFeatures.PolicyDetails;
import com.aspire.guidewire.pc.teststeps.nonlob.NonLobImpl;
import com.aspire.guidewire.pc.teststeps.nonlob.NonLobSteps;
import com.aspire.guidewire.utils.DataProviderUtils;
import com.aspire.guidewire.utils.EnvironmentPropertiesReader;
import com.aspire.guidewire.utils.Log;
import com.aspire.guidewire.webdriverManager.DriverManager;

public class PC_NonLob {

	boolean LambdatestStatus = false;

	private static EnvironmentPropertiesReader configProperty = EnvironmentPropertiesReader.getInstance();

	private static EnvironmentPropertiesReader errorMessagesProperty = EnvironmentPropertiesReader.getInstance("guidewireMessages/nonlobMessages");

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
	 * @author manikandan.manohar
	 * @param browser
	 * @throws Exception
	 */
	@Test(description = "Check whether the user is able to search any activities without Assignee, policy or account number.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC350(String browser) throws Exception {		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		NonLobDataEngine testData = new NonLobDataEngine("GWTestData_DataEngine.xlsx", "NonLob", "TC350");
		Log.testCaseInfo("Check whether the user is able to search any activities without Assignee, policy or account number.", driver);
		String specifyDetailsErrorMessage = errorMessagesProperty.getProperty("specify_assignee_policy_number_account_number");

		try {

			NonLobImpl pc = NonLobSteps.create();
			pc.loginIntoTheApplication("su", "gw");
			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clickToggleSearchSubMenu(driver);
			SearchActivitiesPage searchActivitiesPage = headerPage.clickSearchActivities(driver);
			searchActivitiesPage.verifyAssignedToFieldIsEmpty(driver);
			searchActivitiesPage.verifyAccountNumberFieldIsEmpty(driver);
			searchActivitiesPage.verifyPolicyNumberFieldIsEmpty(driver);
			searchActivitiesPage.selectActivityStatus(driver,testData.getStatus());
			searchActivitiesPage.clickSearch(driver);
			pc.verifyErrorMessage(specifyDetailsErrorMessage);
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
	@Test(description = "Check whether the user is able to reset all the fields in Activities screen (Search tab) to default just by clicking on Reset button.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC351(String browser) throws Exception {		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		NonLobDataEngine testData = new NonLobDataEngine("GWTestData_DataEngine.xlsx", "NonLob", "TC351");
		Log.testCaseInfo("Check whether the user is able to reset all the fields in Activities screen (Search tab) to default just by clicking on Reset button.", driver);

		try {

			NonLobImpl pc = NonLobSteps.create();

			pc.loginIntoTheApplication("su", "gw");
			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clickToggleSearchSubMenu(driver);
			SearchActivitiesPage searchActivitiesPage = headerPage.clickSearchActivities(driver);
			searchActivitiesPage.enterAssignedto(driver, "su");
			searchActivitiesPage.enterPolicyNumber(driver, testData.getPolicyNumber());
			searchActivitiesPage.enterAccountNumber(driver, testData.getAccountNumber());
			searchActivitiesPage.selectActivityStatus(driver, testData.getStatus());
			searchActivitiesPage.selectPriority(driver,testData.getPriority());
			searchActivitiesPage.selectOverdueNow(driver, testData.getOverdue());
			searchActivitiesPage.clickReset(driver);
			searchActivitiesPage.verifyDefaultSelectedValueActivityStatus(driver,testData.getUserType());
			searchActivitiesPage.verifyDefaultSelectedValuePriority(driver,testData.getUserType());
			searchActivitiesPage.verifyDefaultSelectedValueOverDue(driver,testData.getUserType());
			searchActivitiesPage.verifyAccountNumberFieldIsEmpty(driver);
			searchActivitiesPage.verifyAssignedToFieldIsEmpty(driver);
			searchActivitiesPage.verifyPolicyNumberFieldIsEmpty(driver);
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
	 * Test ID: TC352
	 * @param browser
	 * @throws Exception
	 */
	@Test(description = "Check whether the user is able to search all the activates assigned to a particular user.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC352(String browser) throws Exception {		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		NonLobDataEngine testData = new NonLobDataEngine("GWTestData_DataEngine.xlsx", "NonLob", "TC352");
		Log.testCaseInfo("Check whether the user is able to search all the activates assigned to a particular user.", driver);

		try {

			NonLobImpl pc = NonLobSteps.create();
			pc.loginIntoTheApplication("su", "gw");
			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clickToggleSearchSubMenu(driver);
			SearchActivitiesPage searchActivitiesPage = headerPage.clickSearchActivities(driver);
			searchActivitiesPage.clickSelectUser(driver);
			SearchUserPage searchUserPage = searchActivitiesPage.new SearchUserPage(driver);
			searchUserPage.enterSelectUserName(driver, testData.getUserName());
			searchUserPage.clickSearch(driver);
			searchUserPage.clickSelectUser(driver);
			searchActivitiesPage.selectActivityStatus(driver, testData.getStatus());
			searchActivitiesPage.selectOverdueNow(driver, testData.getOverdue());
			searchActivitiesPage.clickSearch(driver);
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
	 * Test ID: TC353
	 * @param browser
	 * @throws Exception
	 */
	@Test(description = "Check whether the user is able to search for open activities only.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC353(String browser) throws Exception {		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		NonLobDataEngine testData = new NonLobDataEngine("GWTestData_DataEngine.xlsx", "NonLob", "TC353");	
		Log.testCaseInfo("Check whether the user is able to search for open activities only.", driver);

		try {

			NonLobImpl pc = NonLobSteps.create();
			pc.loginIntoTheApplication("su", "gw");
			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clickToggleSearchSubMenu(driver);
			SearchActivitiesPage searchActivitiesPage = headerPage.clickSearchActivities(driver);
			searchActivitiesPage.clickSelectUser(driver);
			SearchUserPage searchUserPage = searchActivitiesPage.new SearchUserPage(driver);
			searchUserPage.enterSelectUserName(driver, testData.getUserName());
			searchUserPage.clickSearch(driver);
			searchUserPage.clickSelectUser(driver);
			searchActivitiesPage.selectActivityStatus(driver,testData.getStatus());
			searchActivitiesPage.selectPriority(driver, testData.getPriority());
			searchActivitiesPage.clickSearch(driver);
			searchActivitiesPage.verifyStatus1(driver,testData.getStatus());
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
	 * Test ID: TC354
	 * @param browser
	 */
	@Test(description = "Check whether the user is able to search for cancelled activities only.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC354(String browser) throws Exception {	
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		NonLobDataEngine testData = new NonLobDataEngine("GWTestData_DataEngine.xlsx", "NonLob", "TC354");
		Log.testCaseInfo("Check whether the user is able to search for cancelled activities only.", driver);

		try {

			NonLobImpl pc = NonLobSteps.create();
			pc.loginIntoTheApplication("su", "gw");
			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clickToggleSearchSubMenu(driver);
			SearchActivitiesPage searchActivitiesPage = headerPage.clickSearchActivities(driver);
			searchActivitiesPage.clickSelectUser(driver);
			SearchUserPage searchUserPage = searchActivitiesPage.new SearchUserPage(driver);
			searchUserPage.enterSelectUserName(driver, testData.getUserName());
			searchUserPage.clickSearch(driver);
			searchUserPage.clickSelectUser(driver);
			searchActivitiesPage.selectActivityStatus(driver,testData.getStatus());
			searchActivitiesPage.clickSearch(driver);
			searchActivitiesPage.verifyStatus(driver,testData.getStatus(),5);
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
	 * Test ID: Sprint5_TC_345
	 * Test Description:Check whether the user is able to search for an account number using account number.
	 * @param browser
	 * @throws Exception
	 */
	@Test(description = "Check whether the user is able to search for an account number using account number.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC345(String browser) throws Exception {
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		NonLobDataEngine testData = new NonLobDataEngine("GWTestData_DataEngine.xlsx", "NonLob", "TC345");
		Log.testCaseInfo("Check whether the user is able to search for an account number using account number.",driver);

		try {	

			NonLobImpl pc = NonLobSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchAccount(EnterAccountInformation.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.build());

			String accountNumber = pc.createAccount(CreateNewAccountFromPerson.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.addressLine1(testData.getAddressLine1())
					.state(testData.getState())
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType())
					.organization(testData.getOrganizationName())
					.build()); 

			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clickToggleSearchSubMenu(driver);
			SearchAccountsPage searchAccountsPage = headerPage.clickSearchAccounts(driver);
			searchAccountsPage.enterAccountNumber(driver, accountNumber);
			searchAccountsPage.clickSearchAccount(driver);
			searchAccountsPage.clickSubmissionNoByAccountId(driver);
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
	@Test(description = "Check whether the user is able to search for an invalid account number using account number.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC346(String browser) throws Exception {
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		NonLobDataEngine testData = new NonLobDataEngine("GWTestData_DataEngine.xlsx", "NonLob", "TC346");
		Log.testCaseInfo("Check whether the user is able to search for an invalid account number using account number.", driver);
		String zeroSearchResultError = errorMessagesProperty.getProperty("zero_Search_Result_Error");

		try {

			NonLobImpl pc = NonLobSteps.create();
			pc.loginIntoTheApplication("su", "gw");
			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clickToggleSearchSubMenu(driver);
			SearchAccountsPage searchAccountsPage = headerPage.clickSearchAccounts(driver);
			searchAccountsPage.enterAccountNumber(driver, testData.getAccountNumber());
			searchAccountsPage.clickSearchAccount(driver);
			pc.verifyErrorMessage(zeroSearchResultError);
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
	 * Test ID: Sprint5_TC_346
	 * Test Description:Check whether the user is able to search for an account number using account number.
	 * @param browser
	 * @throws Exception
	 */
	@Test(description = "Check whether the user is able to search for the account numbers using first and last name.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC347(String browser) throws Exception {
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		NonLobDataEngine testData = new NonLobDataEngine("GWTestData_DataEngine.xlsx", "NonLob", "TC347");
		Log.testCaseInfo("Check whether the user is able to search for the account numbers using first and last name.", driver);

		try {

			NonLobImpl pc = NonLobSteps.create();

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
					.organization(testData.getOrganizationName())
					.build()); 

			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clickToggleSearchSubMenu(driver);
			headerPage.clickSearchAccounts(driver);
			SearchAccountsPage searchAccountsPage = new SearchAccountsPage(driver);
			searchAccountsPage.enterFirstname(driver,testData.getFirstName());
			searchAccountsPage.enterLastname(driver,testData.getLastName());
			searchAccountsPage.clickSearchAccount(driver);
			searchAccountsPage.clickSubmissionNoByAccountId(driver);
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
	 * Test ID: Sprint5_TC_346
	 * Test Description:Check whether the user is able to search for an account number using account number.
	 * @param browser
	 * @throws Exception
	 */
	@Test(description = "Check whether the error message is displayed when the user is trying to search for an account only using First name.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC348(String browser) throws Exception {
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		NonLobDataEngine testData = new NonLobDataEngine("GWTestData_DataEngine.xlsx", "NonLob", "TC348");
		Log.testCaseInfo("Check whether the error message is displayed when the user is trying to search for an account only using First name.", driver);
		String EnoughInfoError = errorMessagesProperty.getProperty("Enter_Enough_Info_Error");

		try {

			NonLobImpl pc = NonLobSteps.create();
			pc.loginIntoTheApplication("su", "gw");
			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clickToggleSearchSubMenu(driver);
			headerPage.clickSearchAccounts(driver);
			SearchAccountsPage searchAccountsPage = new SearchAccountsPage(driver);
			searchAccountsPage.enterFirstname(driver,testData.getFirstName());
			searchAccountsPage.clickSearchAccount(driver);
			pc.verifyErrorMessage(EnoughInfoError);
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
	@Test(description = "Check whether the user is able to search for the account numbers using invalid first and last name.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC349(String browser) throws Exception {
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		NonLobDataEngine testData = new NonLobDataEngine("GWTestData_DataEngine.xlsx", "NonLob", "TC349");
		Log.testCaseInfo("Check whether the user is able to search for the account numbers using invalid first and last name.", driver);
		String zeroSearchResultError = errorMessagesProperty.getProperty("zero_Search_Result_Error");

		try {

			NonLobImpl pc = NonLobSteps.create();

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
					.organization(testData.getOrganizationName())
					.build()); 

			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clickToggleSearchSubMenu(driver);
			headerPage.clickSearchAccounts(driver);
			SearchAccountsPage searchAccountsPage = new SearchAccountsPage(driver);
			searchAccountsPage.enterFirstname(driver,DataFakers.firstName());
			searchAccountsPage.enterLastname(driver,DataFakers.lastName());
			searchAccountsPage.clickSearchAccount(driver);
			pc.verifyErrorMessage(zeroSearchResultError);
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
	@Test(description = "Check whether the user is able to search for a producer just by using producer code.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC357(String browser) throws Exception {
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		NonLobDataEngine testData = new NonLobDataEngine("GWTestData_DataEngine.xlsx", "NonLob", "TC357");
		Log.testCaseInfo("Check whether the user is able to search for a producer just by using producer code.", driver);

		try {

			NonLobImpl pc = NonLobSteps.create();
			pc.loginIntoTheApplication("su", "gw");
			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clickToggleSearchSubMenu(driver);
			SearchProducerCodes SearchProducerCodes = headerPage.clickProducerCodes(driver);
			SearchProducerCodes.enterProducerCode(driver, testData.getProducerCode());
			SearchProducerCodes.selectStatus(driver, testData.getStatus());
			SearchProducerCodes.clickSearch(driver);
			SearchProducerCodes.clickProducerCodeFromSearchResults(driver);
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
	@Test(description = "Check whether the user is able to search for a producer just by using underwriter name.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC358(String browser) throws Exception {
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		NonLobDataEngine testData = new NonLobDataEngine("GWTestData_DataEngine.xlsx", "NonLob", "TC358");
		Log.testCaseInfo("Check whether the user is able to search for a producer just by using underwriter name.", driver);

		try {

			NonLobImpl pc = NonLobSteps.create();
			pc.loginIntoTheApplication("su", "gw");
			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clickToggleSearchSubMenu(driver);
			SearchProducerCodes SearchProducerCodes = headerPage.clickProducerCodes(driver);
			SearchProducerCodes.clickSelectUser_UnderWriter(driver);
			SearchActivitiesPage SearchActivitiesPage = new SearchActivitiesPage(driver);
			SearchUserPage searchUserPage = SearchActivitiesPage.new SearchUserPage(driver);
			searchUserPage.enterSelectUserName(driver,testData.getUserName());
			searchUserPage.clickSearch(driver);
			searchUserPage.clickSelectUser(driver);
			SearchProducerCodes.selectStatus(driver,testData.getStatus());
			SearchProducerCodes.clickSearch(driver);
			SearchProducerCodes.clickProducerCodeFromSearchResults(driver);
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
	@Test(description = "Check whether the user is able to search for a contact without company name and EIN number.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC359(String browser) throws Exception {
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		NonLobDataEngine testData = new NonLobDataEngine("GWTestData_DataEngine.xlsx", "NonLob", "TC359");
		Log.testCaseInfo("Check whether the user is able to search for a contact without company name and EIN number.", driver);

		try {

			String companyNameError = errorMessagesProperty.getProperty("Specify_Atleast_First_Five_Characters_CompanyName_Error");

			NonLobImpl pc = NonLobSteps.create();

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
					.organization(testData.getOrganizationName())
					.build()); 
			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clickToggleSearchSubMenu(driver);
			SearchContactsPage SearchContactsPage = headerPage.clickSearchContacts(driver);
			SearchContactsPage.clickSearch(driver);
			pc.verifyErrorMessage(companyNameError);
			SearchContactsPage.selectType(driver,testData.getType());
			SearchContactsPage.enterFirstname(driver, testData.getFirstName());
			SearchContactsPage.enterLastname(driver, testData.getLastName());
			SearchContactsPage.clickSearch(driver);
			SearchContactsPage.clickOnUser(driver);
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
	@Test(description = "Verify whether the user can able to Create a new Person account", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC01(String browser) throws Exception {
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		NonLobDataEngine testData = new NonLobDataEngine("GWTestData_DataEngine.xlsx", "NonLob", "TC01");
		Log.testCaseInfo("Verify whether the user can able to Create a new Person account", driver);

		try {

			NonLobImpl pc = NonLobSteps.create();

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
					.organization(testData.getOrganizationName())
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
	@Test(description = "Create a New Account - Company", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC02(String browser) throws Exception {
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		NonLobDataEngine testData = new NonLobDataEngine("GWTestData_DataEngine.xlsx", "NonLob", "TC02");
		Log.testCaseInfo("Create a New Account - Company", driver);

		try {

			NonLobImpl pc = NonLobSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchAccount(EnterAccountInformation.builder()
					.companyName(testData.getCompanyName())
					.build());

			pc.createAccount(CreateNewAccountFromCompany.builder()
					.companyName(testData.getCompanyName())
					.addressLine1(testData.getAddressLine1())
					.state(testData.getState())
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType())
					.organization(testData.getOrganizationName())
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
	@Test(description = "Create a New Account - From Address Book", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC03(String browser) throws Exception {
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		NonLobDataEngine testData = new NonLobDataEngine("GWTestData_DataEngine.xlsx", "NonLob", "TC03");
		Log.testCaseInfo("Create a New Account - Company", driver);

		try {

			NonLobImpl pc = NonLobSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchAccount(EnterAccountInformation.builder()
					.companyName(testData.getCompanyName())
					.build());

			pc.createAccount(CreateNewAccountFromPerson.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.addressLine1(testData.getAddressLine1())
					.state(testData.getState())
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType())
					.organization(testData.getOrganizationName())
					.build()); 

			pc.searchAccount(EnterAccountInformation.builder()
					.companyName(testData.getCompanyName())
					.build());

			pc.createAccount(CreateNewAccountFromAddressBook.builder()
					.type(testData.getType())
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.addressLine1(testData.getAddressLine1())
					.state(testData.getState())
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType())
					.organization(testData.getOrganizationName())
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
	 * Test ID: TC355
	 * @param browser
	 */
	@Test(description = "Check whether the user is able to search for high priority activities only.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC355(String browser) throws Exception {		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		NonLobDataEngine testData = new NonLobDataEngine("GWTestData_DataEngine.xlsx", "NonLob", "TC355");
		Log.testCaseInfo("Check whether the user is able to search for high priority activities only.", driver);

		try {

			NonLobImpl pc = NonLobSteps.create();
			pc.loginIntoTheApplication("su", "gw");
			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clickToggleSearchSubMenu(driver);
			SearchActivitiesPage searchActivitiesPage = headerPage.clickSearchActivities(driver);
			searchActivitiesPage.clickSelectUser(driver);
			SearchUserPage searchUserPage = searchActivitiesPage.new SearchUserPage(driver);
			searchUserPage.enterSelectUserName(driver, testData.getUserName());
			searchUserPage.clickSearch(driver);
			searchUserPage.clickSelectUser(driver);
			searchActivitiesPage.selectPriority(driver, testData.getPriority());
			searchActivitiesPage.clickSearch(driver);
			searchActivitiesPage.verifyPriority(driver,testData.getPriority(),4);
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
	 * Test ID: TC356
	 * @param browser
	 */
	@Test(description = "Check whether the user is able to search for over due activities only.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC356(String browser) throws Exception {		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		NonLobDataEngine testData = new NonLobDataEngine("GWTestData_DataEngine.xlsx", "NonLob", "TC356");
		Log.testCaseInfo("Check whether the user is able to search for over due activities only.", driver);

		try {

			NonLobImpl pc = NonLobSteps.create();
			pc.loginIntoTheApplication("su", "gw");
			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clickToggleSearchSubMenu(driver);
			SearchActivitiesPage searchActivitiesPage = headerPage.clickSearchActivities(driver);
			searchActivitiesPage.clickSelectUser(driver);
			SearchUserPage searchUserPage = searchActivitiesPage.new SearchUserPage(driver);
			searchUserPage.enterSelectUserName(driver, testData.getUserName());
			searchUserPage.clickSearch(driver);
			searchUserPage.clickSelectUser(driver);
			searchActivitiesPage.selectOverdueNow(driver, testData.getOverdue());
			searchActivitiesPage.clickSearch(driver);
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
	 * Test ID: TC340
	 * @param browser
	 */
	@Test(description = "Check whether the user is able to search for the submission numbers using first and last name.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC340(String browser) throws Exception {		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		NonLobDataEngine testData = new NonLobDataEngine("GWTestData_DataEngine.xlsx", "NonLob", "TC340");
		Log.testCaseInfo("Check whether the user is able to search for the submission numbers using first and last name.", driver);

		try {

			NonLobImpl pc = NonLobSteps.create();
			pc.loginIntoTheApplication("su", "gw");
			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());
			PolicySummaryPage policySummaryPage = new PolicySummaryPage(driver);
			String firstName=policySummaryPage.getFirstName(driver);
			String lastName=policySummaryPage.getLastName(driver);
			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clickSearchTab(driver);
			SearchPoliciesPage searchPoliciesPage = new SearchPoliciesPage(driver).get();
			searchPoliciesPage.selectSearchFor(driver,testData.getSearchFor());
			searchPoliciesPage.enterFirstname(driver,firstName);
			searchPoliciesPage.enterLastname(driver, lastName);
			searchPoliciesPage.clickSearch(driver);
			searchPoliciesPage.clickSubmissionNoStatusSubmissionNo(driver);
			searchPoliciesPage.verifyQuotePageIsDisplayed(driver);
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
	 * Test ID: TC340
	 * @param browser
	 */
	@Test(description = "Check whether the error message is displayed when the user is trying to search for a submission only using First name.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC341(String browser) throws Exception {		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		NonLobDataEngine testData = new NonLobDataEngine("GWTestData_DataEngine.xlsx", "NonLob", "TC341");
		Log.testCaseInfo("Check whether the error message is displayed when the user is trying to search for a submission only using First name.", driver);
		String notEnoughInfoErrorMessage = errorMessagesProperty.getProperty("not_Enough_Info_Error_Messages");

		try {

			NonLobImpl pc = NonLobSteps.create();
			pc.loginIntoTheApplication("su", "gw");
			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clickSearchTab(driver);
			SearchPoliciesPage searchPoliciesPage = new SearchPoliciesPage(driver).get();
			searchPoliciesPage.selectSearchFor(driver,testData.getSearchFor());
			searchPoliciesPage.enterFirstname(driver, testData.getFirstName());
			searchPoliciesPage.clickSearch(driver);
			pc.verifyErrorMessage(notEnoughInfoErrorMessage);
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
	 * Test ID: TC342
	 * @param browser
	 */
	@Test(description = "Check whether the user is able to search for the Policy using the address details and account number.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC342(String browser) throws Exception {		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		NonLobDataEngine testData = new NonLobDataEngine("GWTestData_DataEngine.xlsx", "NonLob", "TC342");
		Log.testCaseInfo("Check whether the user is able to search for the Policy using the address details and account number.", driver);

		try {

			NonLobImpl pc = NonLobSteps.create();
			pc.loginIntoTheApplication("su", "gw");
			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clickSearchTab(driver);
			SearchPoliciesPage searchPoliciesPage = new SearchPoliciesPage(driver).get();
			searchPoliciesPage.selectSearchFor(driver,testData.getSearchFor());
			searchPoliciesPage.enterAccountNumber(driver, testData.getAccountNumber());
			searchPoliciesPage.selectState(driver, testData.getState());
			searchPoliciesPage.enterCity(driver,testData.getCity());
			searchPoliciesPage.selectProduct(driver,testData.getProduct());
			searchPoliciesPage.clickSearch(driver);
			searchPoliciesPage.clickOnBoundSubmissionStatusSubmissionNo(driver);
			searchPoliciesPage.verifyPolicySummaryPageIsDisplayed(driver);
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
	 * Test ID: TC343
	 * @param browser
	 */
	@Test(description = "Check whether the user is able to search for the Policy Change transaction using the policy number and producer details", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC343(String browser) throws Exception {		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		NonLobDataEngine testData = new NonLobDataEngine("GWTestData_DataEngine.xlsx", "NonLob", "TC343");
		Log.testCaseInfo("Check whether the user is able to search for the Policy Change transaction using the policy number and producer details", driver);

		try {

			NonLobImpl pc = NonLobSteps.create();
			pc.loginIntoTheApplication("su", "gw");
			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());
			String policyChangeNo = pc.policyChange(driver);
			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clickSearchTab(driver);
			SearchPoliciesPage searchPoliciesPage = new SearchPoliciesPage(driver).get();
			searchPoliciesPage.selectSearchFor(driver,testData.getSearchFor());
			searchPoliciesPage.enterPolicyNumber(driver, policyChangeNo);
			searchPoliciesPage.clickProducerCodeIcon(driver);
			OrganizationsPage organizationsPage = new OrganizationsPage(driver);
			organizationsPage.enterOrganizationName(driver,testData.getOrganizationName());
			organizationsPage.clickSearch(driver);
			organizationsPage.clickSelect(driver);
			searchPoliciesPage.clickSearch(driver);
			searchPoliciesPage.clickOnBoundSubmissionStatusSubmissionNo(driver);
			searchPoliciesPage.verifyQuotePageIsDisplayed(driver);
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
	 * Test ID: TC344
	 * @param browser
	 */
	@Test(description = "Check whether the user is able to search for the Reinstatement transaction using the first name, last name and Underwriting Company details", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC344(String browser) throws Exception {		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		NonLobDataEngine testData = new NonLobDataEngine("GWTestData_DataEngine.xlsx", "NonLob", "TC344");
		Log.testCaseInfo("Check whether the user is able to search for the Reinstatement transaction using the first name, last name and Underwriting Company details", driver);

		try {

			NonLobImpl pc = NonLobSteps.create();
			pc.loginIntoTheApplication("su", "gw");
			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());
			pc.copySubmissions();
			pc.viewPolicy();
			PolicySummaryPage policySummaryPage = new PolicySummaryPage(driver);
			String firstName=policySummaryPage.getFirstName(driver);
			String lastName=policySummaryPage.getLastName(driver);
			pc.cancelPolicy(driver);
			pc.reinstatePolicy(driver);
			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clickSearchTab(driver);
			SearchPoliciesPage searchPoliciesPage = new SearchPoliciesPage(driver).get();
			searchPoliciesPage.selectSearchFor(driver,testData.getSearchFor());
			searchPoliciesPage.enterFirstname(driver,firstName);
			searchPoliciesPage.enterLastname(driver,lastName);
			searchPoliciesPage.selectUnderwritingCompany(driver, testData.getUnderwritingCompany());
			searchPoliciesPage.clickSearch(driver);
			searchPoliciesPage.clickOnInForceSubmissionStatusSubmissionNo(driver);
			searchPoliciesPage.verifyQuotePageIsDisplayed(driver);
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
	@Test(description = "To verify whether a user able to search and view a Authority Profiles details in Admin tab", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC370(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		NonLobDataEngine testData = new NonLobDataEngine("GWTestData_DataEngine.xlsx", "NonLob", "TC370");
		Log.testCaseInfo("To verify whether a user able to search and view a Authority Profiles details in Admin tab", driver);

		try {

			NonLobImpl pc = NonLobSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			AdministrationPage administrationPage = new AdministrationPage(driver);
			administrationPage.clickToggleAdministrationSubMenu(driver);

			administrationPage.clickUsersAndSecurity(driver);
			administrationPage.clickAuthorityProfile(driver);

			AuthorityProfilesPage authorityProfilesPage = new AuthorityProfilesPage(driver);
			authorityProfilesPage.verifyNameIsDisplayed(driver);
			authorityProfilesPage.verifyDescriptionIsDisplayed(driver);
			authorityProfilesPage.clickNew(driver);

			NewAuthorityProfilePage newAuthorityProfilePage = authorityProfilesPage.new NewAuthorityProfilePage(driver);

			newAuthorityProfilePage.enterName(driver,testData.getFirstName());
			newAuthorityProfilePage.enterDescription(driver,testData.getDescription());

			newAuthorityProfilePage.clickAdd(driver);
			newAuthorityProfilePage.clickSearch(driver);

			IssueTypeSearchPage issueTypeSearchPage =  authorityProfilesPage.new NewAuthorityProfilePage(driver).new IssueTypeSearchPage(driver);
			issueTypeSearchPage.clickSelectIssueType(driver);

			newAuthorityProfilePage.enterLocalizationName(driver,testData.getFirstName());
			newAuthorityProfilePage.enterLocalizationDescription(driver, testData.getDescription());
			newAuthorityProfilePage.enterLocalizationName_1(driver,testData.getFirstName());
			newAuthorityProfilePage.enterLocalizationDescription_1(driver, testData.getDescription());
			newAuthorityProfilePage.clickUpdate(driver);

			authorityProfilesPage.selectCheckBox(driver,testData.getFirstName());
			authorityProfilesPage.verifyCloneButtonIsDisplay(driver);
			authorityProfilesPage.verifyDeleteButtonIsDisplay(driver);
			authorityProfilesPage.clickDelete(driver);
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
	@Test(description = "To verify whether a user able to search and Add a New Attribute in Admin tab", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC371(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		NonLobDataEngine testData = new NonLobDataEngine("GWTestData_DataEngine.xlsx", "NonLob", "TC371");
		Log.testCaseInfo("To verify whether a user able to search and Add a New Attribute in Admin tab", driver);

		try {

			NonLobImpl pc = NonLobSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			AdministrationPage administrationPage = new AdministrationPage(driver);
			administrationPage.clickToggleAdministrationSubMenu(driver);
			administrationPage.clickUsersAndSecurity(driver);
			administrationPage.clickAttribute(driver);
			AttributesPage attributesPage = new AttributesPage(driver);
			attributesPage.clickNewAttribute(driver);
			NewAttributePage newAttributePage = attributesPage.new NewAttributePage(driver);
			newAttributePage.enterName(driver, testData.getFirstName());
			newAttributePage.enterDescription(driver,testData.getDescription());
			newAttributePage.selectType(driver, testData.getAttributeType());
			newAttributePage.enterLocalizationName(driver,testData.getFirstName());
			newAttributePage.enterLocalizationDescription(driver, testData.getDescription());
			newAttributePage.enterLocalizationName_1(driver,testData.getFirstName());
			newAttributePage.enterLocalizationDescription_1(driver, testData.getDescription());
			newAttributePage.clickUpdate(driver);
			attributesPage.verifyAttributeNameIsDisplay(driver,testData.getFirstName());
			attributesPage.clickAttributeChkBox(driver,testData.getFirstName());
			attributesPage.clickDelete(driver);
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
	@Test(description = "To verify whether a user able to get error message zero results found  in Affinity Group in Admin tab", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC372(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		NonLobDataEngine testData = new NonLobDataEngine("GWTestData_DataEngine.xlsx", "NonLob", "TC372");
		Log.testCaseInfo("To verify whether a user able to get error message zero results found  in Affinity Group in Admin tab", driver);

		try {

			NonLobImpl pc = NonLobSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			AdministrationPage administrationPage = new AdministrationPage(driver);
			administrationPage.clickToggleAdministrationSubMenu(driver);
			administrationPage.clickUsersAndSecurity(driver);
			administrationPage.clickAffinityGroup(driver);
			AffinityGroupsPage affinityGroupsPage = new AffinityGroupsPage(driver);
			affinityGroupsPage.clickSelectOrganization(driver);
			OrganizationsPage organizationsPage = new OrganizationsPage(driver);
			organizationsPage.enterOrganizationName(driver, testData.getGroupName());
			organizationsPage.clickSearch(driver);
			organizationsPage.clickSelect(driver);
			affinityGroupsPage.verifyMessege(driver);
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
	@Test(description = "To verify whether a user able to search a Rate Book", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC373(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		NonLobDataEngine testData = new NonLobDataEngine("GWTestData_DataEngine.xlsx", "NonLob", "TC373");
		Log.testCaseInfo("To verify whether a user able to search a Rate Book", driver);

		try {

			NonLobImpl pc = NonLobSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			AdministrationPage administrationPage = new AdministrationPage(driver);
			administrationPage.clickToggleAdministrationSubMenu(driver);
			administrationPage.clickRatingtab(driver);
			administrationPage.clickRateBook(driver);
			RateBooksPage rateBooksPage = new RateBooksPage(driver);
			rateBooksPage.selectPolicyLine(driver,testData.getPolicyLine());
			rateBooksPage.selectStatus(driver, testData.getStatus());
			rateBooksPage.clickSearch(driver);
			rateBooksPage.clickRateBookName(driver);
			DemoRatingPage demoRatingPage = rateBooksPage.new DemoRatingPage(driver);
			demoRatingPage.verifyCodeIsDisplayed(driver);
			demoRatingPage.verifyStatusIsDisplayed(driver);
			demoRatingPage.verifyActivationDateIsDisplayed(driver);
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
	@Test(description = "To verify whether the user able to merge one account is merged into another account successfully", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC06(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		NonLobDataEngine testData = new NonLobDataEngine("GWTestData_DataEngine.xlsx", "NonLob", "TC06");
		Log.testCaseInfo("To verify whether the user able to merge one account is merged into another account successfully", driver);

		try {

			NonLobImpl pc = NonLobSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchAccount(EnterAccountInformation.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.build());

			String createAccountNo1 = pc.createAccount(CreateNewAccountFromPerson.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.addressLine1(testData.getAddressLine1())
					.state(testData.getState())
					.city(testData.getCity())
					.zipCode(testData.getZipcode())
					.addressType(testData.getAddressType())
					.organization(testData.getOrganizationName())
					.build());  

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
					.organization(testData.getOrganizationName())
					.build()); 

			ActionsPage actionsPage = new ActionsPage(driver);
			actionsPage.clickActions(driver);
			actionsPage.clickMergeAccountIntoThisAccount(driver);
			MergeAccountIntoThisAccountPage mergeAccountIntoThisAccountPage = new MergeAccountIntoThisAccountPage(driver);
			mergeAccountIntoThisAccountPage.enterAccountNumber(driver, createAccountNo1); 
			mergeAccountIntoThisAccountPage.clickSearch_3(driver);
			mergeAccountIntoThisAccountPage.clickSelectButton(driver);
			mergeAccountIntoThisAccountPage.clicKMergeAccountsToThisAccountButton(driver);
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
	@Test(description = "To verify Whether  User can able to Withdraw and Re-Open the Account ", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC04(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		NonLobDataEngine testData = new NonLobDataEngine("GWTestData_DataEngine.xlsx", "NonLob", "TC04");
		Log.testCaseInfo("To verify Whether  User can able to Withdraw and Re-Open the Account ", driver);

		try {

			NonLobImpl pc = NonLobSteps.create();

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
					.organization(testData.getOrganizationName())
					.build()); 

			ActionsPage actionsPage = new ActionsPage(driver);
			actionsPage.clickActions(driver);
			actionsPage.clickWithdrawAccount(driver);
			AccountSummaryPage accountSummaryPage = new AccountSummaryPage(driver);
			accountSummaryPage.accountStatus(driver,testData.getStatus());
			actionsPage.clickActions(driver);
			actionsPage.clickReopenAccount(driver);
			accountSummaryPage.accountStatus(driver,testData.getPermission());
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
	@Test(description = "Verify User able to Move the policies from one account into another one", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC05(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		NonLobDataEngine testData = new NonLobDataEngine("GWTestData_DataEngine.xlsx", "NonLob", "TC05");
		Log.testCaseInfo("Verify User able to Move the policies from one account into another one", driver);

		try {

			NonLobImpl pc = NonLobSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());
			PolicySummaryPage policySummaryPage = new PolicySummaryPage(driver);
			String accountNumber=policySummaryPage.getAccountNumberText(driver);

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
					.organization(testData.getOrganizationName())
					.build()); 
			ActionsPage actionsPage = new ActionsPage(driver);
			actionsPage.clickActions(driver);
			actionsPage.clickMovePolicies(driver);
			MovePoliciesToThisAccountPage movePoliciesToThisAccountPage = new MovePoliciesToThisAccountPage(driver);
			movePoliciesToThisAccountPage.enterAccountNumber(driver, accountNumber);
			movePoliciesToThisAccountPage.clickSearch_3(driver);
			movePoliciesToThisAccountPage.clickSelect(driver);
			movePoliciesToThisAccountPage.clicKPoliciesCheckBox(driver);
			movePoliciesToThisAccountPage.clicKMovePoliciesToThisAccountButton(driver);
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
	//currently on hold, data not shown issue(policy number not shown)
	@Test(enabled = false,description = "ReWrite the Polices on One Account Into another account", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC07(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		NonLobDataEngine testData = new NonLobDataEngine("GWTestData_DataEngine.xlsx", "NonLob", "TC07");
		Log.testCaseInfo("ReWrite the Polices on One Account Into another account", driver);

		try {

			NonLobImpl pc = NonLobSteps.create();

			pc.loginIntoTheApplication("su", "gw");
			pc.searchPolicyNumber(PolicyDetails.builder().policyNumber(testData.getPolicyNumber()).build());
			pc.copySubmissions();
			pc.viewPolicy();
			PolicySummaryPage policySummaryPage = new PolicySummaryPage(driver);
			String accountNumber=policySummaryPage.getAccountNumberText(driver);

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
					.organization(testData.getOrganizationName())
					.build());  
			ActionsPage actionsPage = new ActionsPage(driver);
			actionsPage.clickActions(driver);
			actionsPage.clickRewritePolicieToThisAccount(driver);
			RewritePoliciesToThisAccountPage rewritePoliciesToThisAccountPage = new RewritePoliciesToThisAccountPage(driver);
			rewritePoliciesToThisAccountPage.enterAccountNumber(driver,accountNumber);
			rewritePoliciesToThisAccountPage.clickSearch_3(driver);
			rewritePoliciesToThisAccountPage.clickSelect(driver);
			rewritePoliciesToThisAccountPage.clicKPoliciesCheckBox(driver);
			rewritePoliciesToThisAccountPage.clickRewritePoliciesToThisAccount(driver);
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
	@Test(description = "Verify whether the user able to Edit and change the account information.", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC08(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		NonLobDataEngine testData = new NonLobDataEngine("GWTestData_DataEngine.xlsx", "NonLob", "TC08");
		Log.testCaseInfo("Verify whether the user able to Edit and change the account information.", driver);

		try {

			NonLobImpl pc = NonLobSteps.create();

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
					.organization(testData.getOrganizationName())
					.build()); 
			AccountSummaryPage accountSummaryPage = new AccountSummaryPage(driver);
			String accountHolderName = accountSummaryPage.getAccountHolderName(driver);
			accountSummaryPage.clickEdit(driver);
			EditAccountPage editAccountPage = accountSummaryPage.new EditAccountPage(driver);
			editAccountPage.enterFirstname(driver, DataFakers.firstName());
			editAccountPage.enterLastname(driver, DataFakers.lastName());
			editAccountPage.clickUpdate(driver);
			accountSummaryPage.verifyAccountHolderNameUpdated(driver, accountHolderName);
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
	@Test(description = "To verify whether a user able to search and view a Rate Table Definitions", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC374(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		NonLobDataEngine testData = new NonLobDataEngine("GWTestData_DataEngine.xlsx", "NonLob", "TC374");
		Log.testCaseInfo("To verify whether a user able to search and view a Rate Table Definitions", driver);

		try {

			NonLobImpl pc = NonLobSteps.create();
			pc.loginIntoTheApplication("su", "gw");
			AdministrationPage administrationPage = new AdministrationPage(driver);
			administrationPage.clickToggleAdministrationSubMenu(driver);
			administrationPage.clickRatingtab(driver);
			administrationPage.clickRateTableDefinition(driver);
			RateTableDefinitionsPage rateTableDefinitionsPage = new RateTableDefinitionsPage(driver);
			rateTableDefinitionsPage.selectPolicyLine(driver,testData.getPolicyLine());
			rateTableDefinitionsPage.clickSearch(driver);
			rateTableDefinitionsPage.clickName(driver);
			rateTableDefinitionsPage.verifyBasicsDetailsIsDisplay(driver);
			rateTableDefinitionsPage.clickParameters(driver);
			rateTableDefinitionsPage.verifyParameterDetailsIsDisplay(driver);
			rateTableDefinitionsPage.clickFactor(driver);
			rateTableDefinitionsPage.verifyFactorDetailsIsDisplay(driver);
			rateTableDefinitionsPage.clickArgumentSource(driver);
			rateTableDefinitionsPage.verifyArgumentSourceDetailsIsDisplay(driver);
			rateTableDefinitionsPage.clickUsage(driver);
			rateTableDefinitionsPage.verifyUsageDetailsIsDisplay(driver);
			rateTableDefinitionsPage.clickBascis(driver);
			rateTableDefinitionsPage.verifyCodeIsDisplay(driver);
			rateTableDefinitionsPage.verifyPolicyLineIsDisplay(driver);
			rateTableDefinitionsPage.verifyLocalizationIsDisplay(driver);
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
	@Test(description = "To verify whether a user able to search and view a Rate Routines", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC375(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		NonLobDataEngine testData = new NonLobDataEngine("GWTestData_DataEngine.xlsx", "NonLob", "TC375");
		Log.testCaseInfo("To verify whether a user able to search and view a Rate Routines", driver);

		try {

			NonLobImpl pc = NonLobSteps.create();
			pc.loginIntoTheApplication("su", "gw");
			AdministrationPage administrationPage = new AdministrationPage(driver);
			administrationPage.clickToggleAdministrationSubMenu(driver);
			administrationPage.clickRatingtab(driver);
			administrationPage.clickRateRoutine(driver);
			RateRountinesPage rateRountinesPage = new RateRountinesPage(driver);
			rateRountinesPage.selectPolicyLine(driver,testData.getPolicyLine());
			rateRountinesPage.clickSearch(driver);
			rateRountinesPage.clickRateRountineName(driver);
			RateRountineNamePage rateRountineNamePage = rateRountinesPage.new RateRountineNamePage(driver);
			rateRountineNamePage.verifyCreateNewVersion(driver);
			rateRountineNamePage.verifyCreateJurisdictionVariant(driver);
			rateRountineNamePage.verifyCodeIsDisplayed(driver);
			rateRountineNamePage.verifyPolicyLineIsDisplayed(driver);
			rateRountineNamePage.verifyParametersetIsDisplayed(driver);
			rateRountineNamePage.verifyParametersInParameterSetIsDisplayed(driver);
			rateRountineNamePage.verifyInstructionDisplayed(driver);
			rateRountineNamePage.verifyOpDisplayed(driver);
			rateRountineNamePage.verifyOperandDisplayed(driver);
			rateRountineNamePage.verifyLineCommentDisplayed(driver);
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
	@Test(description = "To verify whether a user able to View an existing Activity Pattern", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC376(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		NonLobDataEngine testData = new NonLobDataEngine("GWTestData_DataEngine.xlsx", "NonLob", "TC376");
		Log.testCaseInfo("To verify whether a user able to View an existing Activity Pattern", driver);

		try {

			NonLobImpl pc = NonLobSteps.create();

			pc.loginIntoTheApplication("su", "gw");
			AdministrationPage administrationPage = new AdministrationPage(driver);
			administrationPage.clickToggleAdministrationSubMenu(driver);
			administrationPage.clickBusinessSetting(driver);
			administrationPage.clickActivityPatterns(driver);
			ActivityPatternsPage activityPatternsPage = new ActivityPatternsPage(driver);
			activityPatternsPage.verifySubject(driver);
			activityPatternsPage.verifyActivityClass(driver);
			activityPatternsPage.verifyType(driver);
			activityPatternsPage.verifyPriority(driver);
			activityPatternsPage.verifyMandatory(driver);
			activityPatternsPage.verifyAutomatedOnly(driver);
			activityPatternsPage.verifyCategory(driver);
			activityPatternsPage.verifyPatternLevel(driver);
			activityPatternsPage.clickIssuePolicy(driver,testData.getActivityPatternName());
			activityPatternsPage.verifySubject(driver);
			activityPatternsPage.verifyPriority(driver);
			activityPatternsPage.verifyCode(driver);
			activityPatternsPage.verifyDescription(driver);
			activityPatternsPage.verifyEscalationDays(driver);
			activityPatternsPage.verifyTargetDays(driver);
			activityPatternsPage.verifyLanguage(driver);
			activityPatternsPage.verifyEditbtnIsDisplay(driver);
			activityPatternsPage.verifyDeleteButtonIsDisplay(driver);
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
	@Test(description = "To verify whether a user able to Add a Underwriting Rule", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC377(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		NonLobDataEngine testData = new NonLobDataEngine("GWTestData_DataEngine.xlsx", "NonLob", "TC377");
		Log.testCaseInfo("To verify whether a user able to Add a Underwriting Rule", driver);

		try {

			NonLobImpl pc = NonLobSteps.create();
			pc.loginIntoTheApplication("su", "gw");
			AdministrationPage administrationPage = new AdministrationPage(driver);
			administrationPage.clickToggleAdministrationSubMenu(driver);
			administrationPage.clickBusinessSetting(driver);
			administrationPage.clickBusinessRules(driver);
			administrationPage.clickUnderwritingRule(driver);
			UnderwritingRulesPage underwritingRulesPage = new UnderwritingRulesPage(driver);
			underwritingRulesPage.clickAdd(driver);
			CreateNewRulePage createNewRulePage =underwritingRulesPage.new CreateNewRulePage(driver);
			createNewRulePage.enterName(driver, testData.getDescription());
			createNewRulePage.enterCode(driver, testData.getCode());
			createNewRulePage.clickAdvanced(driver);
			createNewRulePage.clickSave(driver);
			createNewRulePage.clickUptoUnderWritingRules(driver);
			underwritingRulesPage.clickUnderratingCheckBox(driver,testData.getDescription());
			underwritingRulesPage.verifyCloneButtonIsEnabled(driver);
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
	@Test(description = "To verify whether a user able to View Message Queues", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC379(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		NonLobDataEngine testData = new NonLobDataEngine("GWTestData_DataEngine.xlsx", "NonLob", "TC379");
		Log.testCaseInfo("To verify whether a user able to View Message Queues", driver);

		try {

			NonLobImpl pc = NonLobSteps.create();
			pc.loginIntoTheApplication("su", "gw");
			AdministrationPage administrationPage = new AdministrationPage(driver);
			administrationPage.clickToggleAdministrationSubMenu(driver);
			administrationPage.clickBusinessSetting(driver);
			administrationPage.clickBusinessRules(driver);
			administrationPage.clickMonitoring(driver);
			administrationPage.clickMessageQueues(driver);
			MessageQueuesPage messageQueuesPage = new MessageQueuesPage(driver);
			messageQueuesPage.verifyIdIsDisplay(driver);
			messageQueuesPage.verifyServerIdIsDisplay(driver);
			messageQueuesPage.verifyStatusIsDisplay(driver);
			messageQueuesPage.verifyDestinationIsDisplay(driver);
			messageQueuesPage.clickEmail(driver);
			DestinationEmailPage destinationEmailPage = new DestinationEmailPage(driver);
			destinationEmailPage.verifyStatusIsDisplayed(driver);
			destinationEmailPage.verifyFailedIsDisplayed(driver);
			destinationEmailPage.verifyBatchedIsDisplayed(driver);
			destinationEmailPage.verifyInFlightIsDisplayed(driver);
			destinationEmailPage.verifyRetryableErrorIsDisplayed(driver);
			destinationEmailPage.verifyUnsentIsDisplayed(driver);
			destinationEmailPage.verifyAwaitingRetryIsDisplayed(driver);
			destinationEmailPage.selectSOOMessageFilter_1(driver,testData.getSosFilter() );
			destinationEmailPage.verifyStatusIsDisplayed(driver);
			destinationEmailPage.verifyFailedIsDisplayed(driver);
			destinationEmailPage.verifyRetryableErrorIsDisplayed(driver);
			destinationEmailPage.verifyInFlightIsDisplayed(driver);
			destinationEmailPage.verifyUnsentIsDisplayed(driver);
			destinationEmailPage.verifyBatchedIsDisplayed(driver);
			destinationEmailPage.verifyAwaitingRetryIsDisplayed(driver);
			destinationEmailPage.verifyAccountIsDisplayed(driver);
			destinationEmailPage.verifySendTimeIsDisplayed(driver);
			destinationEmailPage.verifyDetailedStatisticsFailedIsDisplayed(driver);
			destinationEmailPage.verifyDetailedStatisticsRetryableErrorIsDisplayed(driver);
			destinationEmailPage.verifyDetailedStatisticsUnsentIsDisplayed(driver);
			destinationEmailPage.verifyErrorMessage(driver);
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
	@Test(description = "To verify whether a user able to Run a Batch Process", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC380(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		NonLobDataEngine testData = new NonLobDataEngine("GWTestData_DataEngine.xlsx", "NonLob", "TC380");
		Log.testCaseInfo("To verify whether a user able to Run a Batch Process", driver);

		try {

			NonLobImpl pc = NonLobSteps.create();
			pc.loginIntoTheApplication("su", "gw");
			BatchProcessInfoPage batchProcessInfoPage = new BatchProcessInfoPage(driver);
			batchProcessInfoPage.clickGotoBatchProcess(driver);
			WorkQueueInfoPage workQueueInfoPage = new WorkQueueInfoPage(driver);
			workQueueInfoPage.clickRunBatchProcess(driver, testData.getBatchProcess());
			batchProcessInfoPage.verifyLastRun(driver);
			batchProcessInfoPage.verifyLastRunStatus(driver);
			batchProcessInfoPage.verifyDownloadButtonIsDisplayed(driver);
			batchProcessInfoPage.verifySuspendSchedulerIsDisplayed(driver);
			batchProcessInfoPage.verifyRefreshButtonIsDisplayed(driver);
			batchProcessInfoPage.verifyDropDown(driver, testData.getDropDownvalue());
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
	@Test(description = "To verify whether a user able to search and edit a Producer Codes details in Admin tab", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC369(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		NonLobDataEngine testData = new NonLobDataEngine("GWTestData_DataEngine.xlsx", "NonLob", "TC369");
		Log.testCaseInfo("To verify whether a user able to search and edit a Producer Codes details in Admin tab", driver);

		try {

			NonLobImpl pc = NonLobSteps.create();
			pc.loginIntoTheApplication("su", "gw");
			AdministrationPage administrationPage = new AdministrationPage(driver);
			administrationPage.clickToggleAdministrationSubMenu(driver);
			administrationPage.clickUsersAndSecurity(driver);
			administrationPage.clickProducerCode(driver);
			ProducerCodesPage producerCodesPage = new ProducerCodesPage(driver);
			producerCodesPage.clearOrganization(driver);
			producerCodesPage.enterProducerCode(driver, testData.getProducerCode());
			producerCodesPage.selectStatus(driver, testData.getStatus());
			producerCodesPage.selectBranchCode(driver, testData.getBranchCode());
			producerCodesPage.clickSearchBtn(driver);
			producerCodesPage.clickSearchResultProducerCode(driver);
			ProducerCodeRolesPage producerCodeRolesPage = producerCodesPage.new ProducerCodeRolesPage(driver);
			producerCodeRolesPage.clickRoles(driver);
			producerCodeRolesPage.clickEdit(driver);
			producerCodeRolesPage.clickProducerCodeDetailCheckBox(driver); 
			producerCodeRolesPage.clickRemove(driver);
			producerCodeRolesPage.clickAddRoleButton(driver);
			producerCodeRolesPage.selectRolesName(driver, testData.getRolesName());
			producerCodeRolesPage.clickUpdate(driver);
			producerCodeRolesPage.verifyNameAdded(driver);
			producerCodeRolesPage.clickEdit(driver);
			producerCodeRolesPage.clickProducerCodeDetailCheckBox(driver); 
			producerCodeRolesPage.clickRemove(driver);
			producerCodeRolesPage.verifyMessege(driver,testData.getRolesName());
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
	@Test(description = "To verify whether a user able to search and view the user details by providing username in Admin tab", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC364(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		NonLobDataEngine testData = new NonLobDataEngine("GWTestData_DataEngine.xlsx", "NonLob", "TC364");
		Log.testCaseInfo("To verify whether a user able to search and view the user details by providing username in Admin tab", driver);

		try {

			NonLobImpl pc = NonLobSteps.create();
			pc.loginIntoTheApplication("su", "gw");
			AdministrationPage administrationPage = new AdministrationPage(driver);
			administrationPage.clickToggleAdministrationSubMenu(driver);
			administrationPage.clickUsersAndSecurity(driver);
			administrationPage.clickUsers(driver);
			UsersPage usersPage = new UsersPage(driver);
			usersPage.enterUsername(driver,testData.getUserName());
			usersPage.clickSearch(driver);
			usersPage.clickUserName(driver,testData.getUserName());
			UserSuperUserPage userSuperUserPage =usersPage.new UserSuperUserPage(driver);
			userSuperUserPage.verifyFirstName(driver,testData.getFirstName());
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
	@Test(description = "To verify whether a user able to search and view a Group details in Admin tab", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC365(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		NonLobDataEngine testData = new NonLobDataEngine("GWTestData_DataEngine.xlsx", "NonLob", "TC365");
		Log.testCaseInfo("To verify whether a user able to search and view a Group details in Admin tab", driver);

		try {

			NonLobImpl pc = NonLobSteps.create();

			pc.loginIntoTheApplication("su", "gw");

			AdministrationPage administrationPage = new AdministrationPage(driver);
			administrationPage.clickToggleAdministrationSubMenu(driver);
			administrationPage.clickUsersAndSecurity(driver);
			administrationPage.clickGroups(driver);

			GroupsPage groupsPage = new GroupsPage(driver);
			groupsPage.enterGroupName(driver,testData.getGroupName());
			groupsPage.clickSelectOrganization(driver);
			OrganizationsPage organizationsPage = new OrganizationsPage(driver);
			organizationsPage.enterOrganizationName(driver, testData.getOrganizationName());
			organizationsPage.clickSearch(driver);
			organizationsPage.clickSelect(driver);
			groupsPage.selectGroupType(driver, testData.getGroupType());
			groupsPage.clickSearch(driver);
			groupsPage.clickOnGroupnameResults(driver,testData.getGroupType());  
			GroupActuaryUnitOPage groupActuaryUnitOPage = groupsPage.new GroupActuaryUnitOPage(driver);
			groupActuaryUnitOPage.clickUsers(driver);
			groupActuaryUnitOPage.clickEdit(driver);
			groupActuaryUnitOPage.clickUpdate(driver);
			groupActuaryUnitOPage.verifyUserIsAdded(driver);
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
	@Test(description = "To verify whether a user able to view a Group details in navigated page in Admin tab", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC385(String browser) throws Exception {		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		NonLobDataEngine testData = new NonLobDataEngine("GWTestData_DataEngine.xlsx", "NonLob", "TC385");
		Log.testCaseInfo("To verify whether a user able to view a Group details in navigated page in Admin tab", driver);

		try {

			NonLobImpl pc = NonLobSteps.create();
			pc.loginIntoTheApplication("su", "gw");
			AdministrationPage administrationPage = new AdministrationPage(driver);
			administrationPage.clickToggleAdministrationSubMenu(driver);
			administrationPage.clickUsersAndSecurity(driver);
			administrationPage.clickGroup(driver);
			GroupsPage groupsPage = new GroupsPage(driver);
			groupsPage.enterGroupName(driver,testData.getGroupName());
			groupsPage.clickOrganizationMagnifier(driver);
			OrganizationsPage organizationsPage = new OrganizationsPage(driver);
			organizationsPage.enterOrganisantionName(driver, testData.getOrganizationName());
			organizationsPage.clickSearch(driver);
			organizationsPage.clickSelect(driver);
			groupsPage.selectGroupType(driver,testData.getGroupType());
			groupsPage.clickSearch(driver);
			groupsPage.clickGroupNameInSearchResult(driver);
			groupsPage.verifyBasicsTabInGroups(driver);
			groupsPage.verifyUsersTabInGroups(driver);
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
	@Test(description = "To verify whether a user able to add and delete Role details in Admin tab", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC386(String browser) throws Exception {		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		NonLobDataEngine testData = new NonLobDataEngine("GWTestData_DataEngine.xlsx", "NonLob", "TC386");
		Log.testCaseInfo("To verify whether a user able to add and delete Role details in Admin tab", driver);

		try {

			NonLobImpl pc = NonLobSteps.create();
			pc.loginIntoTheApplication("su", "gw");
			AdministrationPage administrationPage = new AdministrationPage(driver);
			administrationPage.clickToggleAdministrationSubMenu(driver);
			administrationPage.clickUsersAndSecurity(driver);
			administrationPage.clickRoles(driver);
			RolesPage rolesPage = new RolesPage(driver);
			rolesPage.clickNewRole(driver);
			NewRolesPage newRolesPage = rolesPage.new NewRolesPage(driver);
			newRolesPage.enterName(driver,testData.getFirstName());
			newRolesPage.selectType(driver,testData.getRolesType());
			newRolesPage.clickAdd(driver);
			newRolesPage.selectPermission(driver,testData.getPermission());
			newRolesPage.clickUpdate(driver);
			newRolesPage.clickUpdate(driver);
			rolesPage.verifyRoleIsMatching(driver, testData.getFirstName());
			rolesPage.clickRolesChkBox(driver, testData.getFirstName());
			rolesPage.clickDelete(driver);
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
	@Test(description = "To verify whether a user able to add and delete a Region details in Admin tab", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC387(String browser) throws Exception {	
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		NonLobDataEngine testData = new NonLobDataEngine("GWTestData_DataEngine.xlsx", "NonLob", "TC387");
		Log.testCaseInfo("To verify whether a user able to add and delete a Region details in Admin tab", driver);

		try {
			NonLobImpl pc = NonLobSteps.create();
			pc.loginIntoTheApplication("su", "gw");
			AdministrationPage administrationPage = new AdministrationPage(driver);
			administrationPage.clickToggleAdministrationSubMenu(driver);
			administrationPage.clickUsersAndSecurity(driver);
			administrationPage.clickRegions(driver);
			RegionsPage regionsPage = new RegionsPage(driver);
			regionsPage.clickAddRegion(driver);
			AddRegionPage addRegionPage = regionsPage.new AddRegionPage(driver);
			addRegionPage.enterName(driver,DataFakers.city());
			addRegionPage.selectCountry(driver,testData.getCountry() );
			addRegionPage.selectType(driver,testData.getRegionType() );
			addRegionPage.clickUpdate(driver);
			addRegionPage.clickUpdate(driver);
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
	@Test(description = "To verify whether a user able to Set the date & current time", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC382(String browser) throws Exception {		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify whether a user able to Set the date & current time", driver);

		try {

			NonLobImpl pc = NonLobSteps.create();
			pc.loginIntoTheApplication("su", "gw");
			BatchProcessInfoPage batchProcessInfoPage = new BatchProcessInfoPage(driver);
			batchProcessInfoPage.clickGotoBatchProcess(driver);
			HeaderPage headerpage = new HeaderPage(driver);
			headerpage.clickInternalTool(driver);
			headerpage.clickTestingSystemClock(driver);
			TestingSystemClockPage testingSystemClockPage = new TestingSystemClockPage(driver);
			testingSystemClockPage.verifyCurrentDate(driver);
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
	@Test(description = "To verify whether a user able to search and view the user details by providing roles,usertypes and organization in Admin tab", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC383(String browser) throws Exception {		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		NonLobDataEngine testData = new NonLobDataEngine("GWTestData_DataEngine.xlsx", "NonLob", "TC383");
		Log.testCaseInfo("To verify whether a user able to search and view the user details by providing roles,usertypes and organization in Admin tab", driver);

		try {

			NonLobImpl pc = NonLobSteps.create();
			pc.loginIntoTheApplication("su", "gw");
			AdministrationPage administrationPage = new AdministrationPage(driver);
			administrationPage.clickToggleAdministrationSubMenu(driver);
			administrationPage.clickUsersAndSecurity(driver);
			administrationPage.clickUsers(driver);
			UsersPage usersPage = new UsersPage(driver);
			usersPage.selectUsertypes(driver,testData.getUserType());
			usersPage.selectRole(driver,testData.getRolesName());
			usersPage.clickOrganization(driver);
			OrganizationsPage organizationsPage = new OrganizationsPage(driver);
			organizationsPage.enterOrganisantionName(driver, testData.getOrganizationName());
			organizationsPage.clickSearch(driver);
			organizationsPage.clickSelect(driver);
			usersPage.clickSearch(driver);
			usersPage.clickName(driver, testData.getOrganizationName());
			usersPage.verifyBasicsTabIsDisplay(driver);
			usersPage.verifyRolesTabIsDisplay(driver);
			usersPage.verifyAttributeTabIsDisplay(driver);
			usersPage.verifyAccessTabIsDisplay(driver);
			usersPage.verifyRegionTabIsDisplay(driver);
			usersPage.verifyAuthorityTabIsDisplay(driver);
			usersPage.clickRolesTab(driver);
			usersPage.clickRoles(driver, testData.getRolesName());
			usersPage.verifyEditBtnIsDisplay(driver);
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
	@Test(description = "To verify whether the Desktop summary of the logged in user only displayed", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC360(String browser) throws Exception {		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify whether the Desktop summary of the logged in user only displayed", driver);

		try {

			NonLobImpl pc = NonLobSteps.create();
			pc.loginIntoTheApplication("su", "gw");
			DesktopPage desktopPage = new DesktopPage(driver);
			desktopPage.clickDesktopToggle(driver);
			desktopPage.verifyMyActivitiesSubMenu(driver);
			desktopPage.verifyMyRenewalsSubMenu(driver);
			desktopPage.verifyMySubmissionsSubMenu(driver);
			desktopPage.verifyMySummarySubMenu(driver);
			desktopPage.verifyOtherPolicyTransactionsSubMenu(driver);
			desktopPage.clickMyActivities(driver);
			desktopPage.verifyActivitiesListed(driver);
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
	@Test(description = "To verify whether Multiple activities are assigned to an user", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC362(String browser) throws Exception {		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify whether Multiple activities are assigned to an user", driver);

		try {

			NonLobImpl pc = NonLobSteps.create();
			pc.loginIntoTheApplication("su", "gw");
			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clickDesktopToggle(driver);
			headerPage.clickMyActivities(driver);
			MyActivitiesPage myActivitiesPage = new MyActivitiesPage(driver);
			myActivitiesPage.selectMultipleActivities(driver);
			myActivitiesPage.clickAssign(driver);
			AssignActivitiesPage assignActivitiesPage = myActivitiesPage.new AssignActivitiesPage(driver);
			assignActivitiesPage.clickAssignment(driver);
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
	@Test(description = "To verify whether Multiple activities are Skipped", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC363(String browser) throws Exception {		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify whether Multiple activities are Skipped", driver);

		try {

			NonLobImpl pc = NonLobSteps.create();
			pc.loginIntoTheApplication("su", "gw");
			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clickDesktopToggle(driver);
			headerPage.clickMyActivities(driver);
			MyActivitiesPage myActivitiesPage = new MyActivitiesPage(driver);
			myActivitiesPage.selectMultipleActivities(driver);
			myActivitiesPage.clickAssign(driver);
			AssignActivitiesPage assignActivitiesPage = myActivitiesPage.new AssignActivitiesPage(driver);
			assignActivitiesPage.clickAssignment(driver);
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
	@Test(description = "To verify whether a user able to search and view a Region details in Admin tab", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC367(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		NonLobDataEngine testData = new NonLobDataEngine("GWTestData_DataEngine.xlsx", "NonLob", "TC367");
		Log.testCaseInfo("To verify whether a user able to search and view a Region details in Admin tab", driver);

		try {

			NonLobImpl pc = NonLobSteps.create();
			pc.loginIntoTheApplication("su", "gw");
			AdministrationPage administrationPage = new AdministrationPage(driver);
			administrationPage.clickToggleAdministrationSubMenu(driver);
			administrationPage.clickUsersAndSecurity(driver);
			administrationPage.clickRegions(driver);
			RegionsPage regionsPage = new RegionsPage(driver);
			regionsPage.enterRegionName(driver, testData.getRegionName());
			regionsPage.clickSearch(driver);
			regionsPage.verifSearchRegionIsDisplayed(driver);
			regionsPage.clickReset(driver);
			regionsPage.verifyfieldIsEmpty(driver);
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
	@Test(description = "To verify whether a user able to search and view a Organizations details in Admin tab", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC368(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		NonLobDataEngine testData = new NonLobDataEngine("GWTestData_DataEngine.xlsx", "NonLob", "TC368");
		Log.testCaseInfo("To verify whether a user able to search and view a Organizations details in Admin tab", driver);

		try {

			NonLobImpl pc = NonLobSteps.create();

			pc.loginIntoTheApplication("su", "gw");
			AdministrationPage administrationPage = new AdministrationPage(driver);
			administrationPage.clickToggleAdministrationSubMenu(driver);
			administrationPage.clickUsersAndSecurity(driver);
			administrationPage.clickOrganizations(driver);
			OrganizationsPage organizationsPage = new OrganizationsPage(driver);
			organizationsPage.enterOrganizationName(driver, testData.getOrganizationName());
			organizationsPage.selectOrganizationType(driver,testData.getOrganizationType());
			organizationsPage.selectProducerStatus(driver, testData.getStatus());
			organizationsPage.clickSearch(driver);
			organizationsPage.veriyOrganizationName(driver,testData.getOrganizationName());
			organizationsPage.clickOrganizationName(driver);
			OrganizationNamePage organizationNamePage = organizationsPage.new OrganizationNamePage(driver);
			organizationNamePage.verifyBasicsIsDisplayed(driver);
			organizationNamePage.verifyProducerCodeIsDisplayed(driver);
			organizationNamePage.verifyQueuesIsDisplayed(driver);
			organizationNamePage.verifyRegionsIsDisplayed(driver);
			organizationNamePage.verifyUsersIsDisplayed(driver);
			organizationNamePage.verifyOrganizationNameIsDisplayed(driver);
			organizationNamePage.verifyTypeIsDisplayed(driver);
			organizationNamePage.verifyAgencyStatusIsDisplayed(driver);
			organizationNamePage.verifyGroupIsDisplayed(driver);
			organizationNamePage.verifyAssignmentRuleIsDisplayed(driver);
			organizationNamePage.clickUsers(driver);
			organizationNamePage.verifyUserIsDisplayed(driver);
			organizationNamePage.clickProducerCodes(driver);
			organizationNamePage.verifyCodeIsDisplayed(driver);
			organizationNamePage.verifyDescriptionIsDisplayed(driver);
			organizationNamePage.verifyStatusIsDisplayed(driver);
			organizationNamePage.verifyBranchIsDisplayed(driver);
			organizationNamePage.verifyPreferredUnderwriterIsDisplayed(driver);
			organizationNamePage.clickQueues(driver);
			organizationNamePage.verifyNameIsDisplayed(driver);
			organizationNamePage.verifyVisibleInSubGroupIsDisplayed(driver);
			organizationNamePage.clickRegions(driver);
			organizationNamePage.verifyAreasCoveredIsDisplayed(driver);
			organizationNamePage.verifyEditButtonIsDisplayed(driver);
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
	@Test(description = "To verify whether user is able to View a Underwriting Rule", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC391(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		NonLobDataEngine testData = new NonLobDataEngine("GWTestData_DataEngine.xlsx", "NonLob", "TC391");
		Log.testCaseInfo("To verify whether user is able to View a Underwriting Rule", driver);

		try {

			NonLobImpl pc = NonLobSteps.create();

			pc.loginIntoTheApplication("su", "gw");
			AdministrationPage administrationPage = new AdministrationPage(driver);
			administrationPage.clickToggleAdministrationSubMenu(driver);
			administrationPage.clickBusinessSetting(driver);
			administrationPage.clickBusinessRules(driver);
			administrationPage.clickUnderwritingRule(driver);
			UnderwritingRulesPage underwritingRulesPage = new UnderwritingRulesPage(driver);
			underwritingRulesPage.clickUnderratingRule(driver, testData.getRuleName());
			ExistingRulesPage existingRulesPage = underwritingRulesPage.new ExistingRulesPage(driver);
			existingRulesPage.verifyNameIsDisplayed(driver,  testData.getRuleName());
			existingRulesPage.verifyDeleteButtonIsDisplayed(driver);
			existingRulesPage.verifyEditButtonIsDisplayed(driver);
			existingRulesPage.verifyEnableButtonIsDisplayed(driver);
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
	@Test(description = "To verify whether a user able to search and view a Role details in Admin tab", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC366(String browser) throws Exception {
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		NonLobDataEngine testData = new NonLobDataEngine("GWTestData_DataEngine.xlsx", "NonLob", "TC366");
		Log.testCaseInfo("To verify whether a user able to search and view a Role details in Admin tab", driver);

		try {

			NonLobImpl pc = NonLobSteps.create();
			pc.loginIntoTheApplication("su", "gw");
			AdministrationPage administrationPage = new AdministrationPage(driver);
			administrationPage.clickToggleAdministrationSubMenu(driver);
			administrationPage.clickUsersAndSecurity(driver);
			administrationPage.clickRoles(driver);
			RolesPage rolesPage = new RolesPage(driver);
			rolesPage.verifyRolesDropDownDefaultValue(driver, testData.getRolesName());
			rolesPage.verifyDropDownOptionValuesForRoles(driver);
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
	@Test(description = "To verify whether user is able to Import Underwriting Rule", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC392(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify whether user is able to Import Underwriting Rule", driver);

		try {

			NonLobImpl pc = NonLobSteps.create();
			pc.loginIntoTheApplication("su", "gw");
			AdministrationPage administrationPage = new AdministrationPage(driver);
			administrationPage.clickToggleAdministrationSubMenu(driver);
			administrationPage.clickBusinessSetting(driver);
			administrationPage.clickBusinessRules(driver);
			administrationPage.clickImportExportStatus(driver);
			ImportExportStatusPage importExportStatusPage = new ImportExportStatusPage(driver);
			importExportStatusPage.clickImportfromFile(driver);
			ImportPage importPage = importExportStatusPage.new ImportPage(driver);
			importPage.fileUpload(driver);
			importPage.clickImport(driver);
			importExportStatusPage.clickRefresh(driver);
			importPage.verifyStatusIsCompleted(driver);
			importPage.verifyProgressIsCompleted(driver);
			importPage.clickReviewButton(driver);
			importPage.verifyFileNameIsDisplayed(driver);
			importPage.verifyNewRuleIsDisplayed(driver);
			importPage.verifyNewVersionIsDisplayed(driver);
			importPage.verifyRuleDeploymentIsDisplayed(driver);
			importPage.verifyVersionsConflictIsDisplayed(driver);
			importPage.verifyImportedIsDisplayed(driver);
			importPage.verifyDiscardIsDisplayed(driver);
			importPage.verifyAppliedEditedIsDisplayed(driver);
			importPage.verifySkippedIsDisplayed(driver);
			importPage.verifyStateIsDisplayed(driver);
			importPage.verifyRuleNameIsDisplayed(driver);
			importPage.verifyExistingVersionIsDisplayed(driver);
			importPage.verifyRuleNameIsDisplayed(driver);
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
	@Test(description = "To verify whether user is able to Download Batch Process", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC393(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify whether user is able to Download Batch Process", driver);

		try {

			NonLobImpl pc = NonLobSteps.create();
			pc.loginIntoTheApplication("su", "gw");
			BatchProcessInfoPage batchProcessInfoPage = new BatchProcessInfoPage(driver);
			batchProcessInfoPage.clickGotoBatchProcess(driver);
			batchProcessInfoPage.verifyLastRun(driver);
			batchProcessInfoPage.verifyLastRunStatus(driver);
			batchProcessInfoPage.clickDownloadHistoryBtn(driver);
			SelectRangePage selectRangePage = batchProcessInfoPage.new SelectRangePage(driver);
			selectRangePage.enterEnddate(driver, 1);
			selectRangePage.clickDownload(driver);
			selectRangePage.clickBackButton(driver);
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
	@Test(description = "To verify whether user is able to Download a Writer", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC394(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		NonLobDataEngine testData = new NonLobDataEngine("GWTestData_DataEngine.xlsx", "NonLob", "TC394");
		Log.testCaseInfo("To verify whether user is able to Download a Writer", driver);

		try {

			NonLobImpl pc = NonLobSteps.create();

			pc.loginIntoTheApplication("su", "gw");
			BatchProcessInfoPage batchProcessInfoPage = new BatchProcessInfoPage(driver);
			batchProcessInfoPage.clickGotoBatchProcess(driver);
			batchProcessInfoPage.clickWorkQueueInfo(driver);
			WorkQueueInfoPage workQueueInfoPage = new WorkQueueInfoPage(driver);
			workQueueInfoPage.clickRunWorkInfo(driver, testData.getAvailableValue());
			workQueueInfoPage.clickDownloadHistory(driver);
			HandleUnresolvedContingencyPage handleUnresolvedContingencyPage = workQueueInfoPage.new HandleUnresolvedContingencyPage(driver);
			handleUnresolvedContingencyPage.enterEndDate(driver, 1);
			handleUnresolvedContingencyPage.clickDownload(driver);
			handleUnresolvedContingencyPage.clickReturntoWorkQueueInfo(driver);
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
	@Test(description = "To verify whether a user able to Export Underwriting Rule", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC378(String browser) throws Exception {
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		NonLobDataEngine testData = new NonLobDataEngine("GWTestData_DataEngine.xlsx", "NonLob", "TC378");
		Log.testCaseInfo("To verify whether a user able to Export Underwriting Rule", driver);

		try {

			NonLobImpl pc = NonLobSteps.create();

			pc.loginIntoTheApplication("su", "gw");
			AdministrationPage administrationPage = new AdministrationPage(driver);
			administrationPage.clickToggleAdministrationSubMenu(driver);
			administrationPage.clickBusinessSetting(driver);
			administrationPage.clickBusinessRules(driver);
			administrationPage.clickImportExportStatus(driver);
			ImportExportStatusPage importExportStatusPage = new ImportExportStatusPage(driver);
			importExportStatusPage.clickExportDownload(driver);
			importExportStatusPage.clickRefresh(driver);
			importExportStatusPage.verifyDownloadFileExtension(driver, testData.getFileName());
			Log.testCaseResult(driver);

		} catch (Exception e) {
			Log.exception(e, DriverManager.getDriver());
		} finally {
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}

	}
	/**
	 * @author vignesh.ravi)
	 * @param browser
	 * @throws Exception
	 */
	@Test(description = "To verify whether a user able to Run a Writer", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC381(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		NonLobDataEngine testData = new NonLobDataEngine("GWTestData_DataEngine.xlsx", "NonLob", "TC381");
		Log.testCaseInfo("To verify whether a user able to Run a Writer", driver);

		try {

			NonLobImpl pc = NonLobSteps.create();
			pc.loginIntoTheApplication("su", "gw");
			BatchProcessInfoPage batchProcessInfoPage = new BatchProcessInfoPage(driver);
			batchProcessInfoPage.clickGotoBatchProcess(driver);
			batchProcessInfoPage.clickWorkQueueInfo(driver);
			WorkQueueInfoPage workQueueInfoPage = new WorkQueueInfoPage(driver);
			workQueueInfoPage.clickRunWorkInfo(driver, testData.getBatchProcess());
			workQueueInfoPage.verifyAvailableValue(driver, testData.getBatchProcess(),testData.getAvailableValue());
			workQueueInfoPage.verifyCheckOutValue(driver, testData.getBatchProcess(),testData.getCheckOutValue());
			workQueueInfoPage.verifyFailedValue(driver,testData.getBatchProcess(),testData.getFailedValue());
			workQueueInfoPage.verifyExecutorsRunningValue(driver,testData.getBatchProcess(),testData.getExecutorsRunningValue());
			workQueueInfoPage.verifyClusterWideStateValue(driver,testData.getBatchProcess(),testData.getClusterWideStateValue());
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
	@Test(description = "To verify whether a user able to search a Rate Book", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC388(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		NonLobDataEngine testData = new NonLobDataEngine("GWTestData_DataEngine.xlsx", "NonLob", "TC388");
		Log.testCaseInfo("To verify whether a user able to search a Rate Book", driver);
		

		try {
			NonLobImpl pc = NonLobSteps.create();
			pc.loginIntoTheApplication("su", "gw");
			AdministrationPage administrationPage = new AdministrationPage(driver);
			administrationPage.clickToggleAdministrationSubMenu(driver);
			administrationPage.clickRatingtab(driver);
			administrationPage.clickRateBook(driver);
			RateBooksPage rateBooksPage = new RateBooksPage(driver);
			rateBooksPage.selectPolicyLine(driver,testData.getPolicyLine());
			rateBooksPage.selectStatus(driver,testData.getStatus());
			rateBooksPage.clickSearch(driver);
			rateBooksPage.clickRateBookName(driver);
			DemoRatingPage demoRatingPage = rateBooksPage.new DemoRatingPage(driver);
			demoRatingPage.verifyExportButton(driver);
			demoRatingPage.verifyCreateNewEditionButton(driver);
			demoRatingPage.verifyPolicyCriteriaLabel(driver);
			demoRatingPage.verifyLocalizationLabel(driver);
			demoRatingPage.verifyIncludedRateTablesTab(driver);
			demoRatingPage.verifyIncludedRateRoutinesTab(driver);
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
	@Test(description = "To verify whether the user able to Add & Edit a Rate Table Definitions", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC389(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		NonLobDataEngine testData = new NonLobDataEngine("GWTestData_DataEngine.xlsx", "NonLob", "TC389");
		Log.testCaseInfo("To verify whether the user able to Add & Edit a Rate Table Definitions", driver);

		try {

			NonLobImpl pc = NonLobSteps.create();
			pc.loginIntoTheApplication("su", "gw");
			AdministrationPage administrationPage = new AdministrationPage(driver);
			administrationPage.clickToggleAdministrationSubMenu(driver);
			administrationPage.clickRatingtab(driver);
			administrationPage.clickRateTableDefinition(driver);
			RateTableDefinitionsPage rateTableDefinitionsPage = new RateTableDefinitionsPage(driver);
			rateTableDefinitionsPage.selectPolicyLine(driver,testData.getPolicyLine());
			rateTableDefinitionsPage.clickSearch(driver);
			rateTableDefinitionsPage.clickName(driver);
			rateTableDefinitionsPage.verifyBasicsDetailsIsDisplay(driver);
			rateTableDefinitionsPage.clickParameters(driver);
			rateTableDefinitionsPage.verifyParameterDetailsIsDisplay(driver);
			rateTableDefinitionsPage.clickEdit(driver);
			rateTableDefinitionsPage.clickAddParameter(driver);
			rateTableDefinitionsPage.clickExactMatch(driver);
			rateTableDefinitionsPage.enterParameterCode(driver,testData.getCode());
			rateTableDefinitionsPage.enterLabel(driver,testData.getDescription());
			rateTableDefinitionsPage.selectDataType(driver,testData.getDataType());
			rateTableDefinitionsPage.enterEdgePolicyholderEnglish(driver,testData.getDescription());
			rateTableDefinitionsPage.enterEdgeEnglish(driver,testData.getDescription());
			rateTableDefinitionsPage.enterPriority(driver,testData.getPriority());
			rateTableDefinitionsPage.selectDisplayType(driver,testData.getDisplayType());
			rateTableDefinitionsPage.selectPhysicalColumn(driver);
			rateTableDefinitionsPage.clickUpdate(driver);
			rateTableDefinitionsPage.clickUpdate(driver);
			rateTableDefinitionsPage.clickClearButton(driver);
			rateTableDefinitionsPage.clickUpdate(driver);
			rateTableDefinitionsPage.clickEdit(driver);
			rateTableDefinitionsPage.clickParameterCheckBox(driver, testData.getDescription());
			rateTableDefinitionsPage.clickRemove(driver);
			rateTableDefinitionsPage.clickUpdate(driver);
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
	@Test( description = "To verify whether the user able to Add a New Activity Pattern", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC390(String browser) throws Exception {
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		NonLobDataEngine testData = new NonLobDataEngine("GWTestData_DataEngine.xlsx", "NonLob", "TC390");
		Log.testCaseInfo("To verify whether the user able to Add a New Activity Pattern", driver);

		try {

			NonLobImpl pc = NonLobSteps.create();
			pc.loginIntoTheApplication("su", "gw");
			AdministrationPage administrationPage = new AdministrationPage(driver);
			administrationPage.clickToggleAdministrationSubMenu(driver);
			administrationPage.clickBusinessSetting(driver);
			administrationPage.clickActivityPatterns(driver);
			ActivityPatternsPage activityPatternsPage = new ActivityPatternsPage(driver);
			activityPatternsPage.clickNewActivityPattern(driver);
			NewActivityPatternPage newActivityPatternPage = activityPatternsPage.new NewActivityPatternPage(driver);
			newActivityPatternPage.enterActPatternCode(driver,testData.getCode());
			newActivityPatternPage.enterActPatternSubject(driver,testData.getDescription());
			newActivityPatternPage.selectType(driver, testData.getType());
			newActivityPatternPage.selectPatternLevel(driver,testData.getPatternLevel());
			newActivityPatternPage.enterEdgePolicyholderEnglish(driver,testData.getDescription());
			newActivityPatternPage.enterEdgeEnglish(driver,testData.getDescription());
			newActivityPatternPage.selectActivityClass(driver,testData.getActivityClass());
			newActivityPatternPage.clickUpdate(driver);
			newActivityPatternPage.verifyActivityPattersIsAdded(driver, testData.getDescription());
			newActivityPatternPage.selectCheckBox(driver,testData.getDescription());
			newActivityPatternPage.clickDelete(driver);
			Log.testCaseResult(driver);

		} catch (Exception e) {
			Log.exception(e, DriverManager.getDriver());
		} finally {
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}

	}


	/**
	 * @author Manikandan.Maohar
	 * @param browser
	 * @throws Exception
	 */
	@Test(description = "To verify whether a user able to view the user details after navigating to the details page in Admin tab", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC384(String browser) throws Exception {
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		NonLobDataEngine testData = new NonLobDataEngine("GWTestData_DataEngine.xlsx", "NonLob", "TC384");
		Log.testCaseInfo("To verify whether a user able to view the user details after navigating to the details page in Admin tab", driver);

		try {

			NonLobImpl pc = NonLobSteps.create();
			pc.loginIntoTheApplication("su", "gw");
			AdministrationPage administrationPage = new AdministrationPage(driver);
			administrationPage.clickToggleAdministrationSubMenu(driver);
			administrationPage.clickUsersAndSecurity(driver);
			administrationPage.clickUsers(driver);
			UsersPage usersPage = new UsersPage(driver);
			usersPage.enterUsername(driver,testData.getUserName());
			usersPage.clickSearch(driver);
			usersPage.clickUserName(driver,testData.getUnderwritingCompany());
			UserSuperUserPage userSuperUserPage =usersPage.new UserSuperUserPage(driver);
			userSuperUserPage.verifyFirstName(driver, testData.getFirstName());
			usersPage.verifyBasicsTabIsDisplay(driver);
			usersPage.verifyRolesTabIsDisplay(driver);
			usersPage.verifyAccessTabIsDisplay(driver);
			usersPage.verifyAttributeTabIsDisplay(driver);
			usersPage.verifyProfileTabIsDisplay(driver);
			usersPage.verifyRegionTabIsDisplay(driver);
			usersPage.verifyAuthorityTabIsDisplay(driver);
			Log.testCaseResult(driver);

		} catch (Exception e) {
			Log.exception(e, DriverManager.getDriver());
		} finally {
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}

	}
}