package com.aspire.guidewire.cc.testscripts;


import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aspire.guidewire.api.datagenerator.CCDataGenerator;
import com.aspire.guidewire.cc.pages.common.ActionsPage;
import com.aspire.guidewire.cc.pages.common.ActivitiesPage;
import com.aspire.guidewire.cc.pages.common.AssignPage;
import com.aspire.guidewire.cc.pages.common.HeaderPage;
import com.aspire.guidewire.cc.pages.common.ICDCodesPage;
import com.aspire.guidewire.cc.pages.common.NewICDCodePage;
import com.aspire.guidewire.cc.pages.common.SearchOrCreatePolicyPage;
import com.aspire.guidewire.cc.pages.common.WorkplanPage;
import com.aspire.guidewire.cc.pages.nonlob.ActivityPatternsPage;
import com.aspire.guidewire.cc.pages.nonlob.ActivityPatternsPage.NewActivityPatternPage;
import com.aspire.guidewire.cc.pages.nonlob.ActivityRulesPage;
import com.aspire.guidewire.cc.pages.nonlob.ActivityRulesPage.NewActivityRulePage;
import com.aspire.guidewire.cc.pages.nonlob.AddAttributePage;
import com.aspire.guidewire.cc.pages.nonlob.AdvanceSearchClaimsPage;
import com.aspire.guidewire.cc.pages.nonlob.AssignActivitiesPage;
import com.aspire.guidewire.cc.pages.nonlob.BatchProcessInfoPage;
import com.aspire.guidewire.cc.pages.nonlob.BenefitParameterDetailPage;
import com.aspire.guidewire.cc.pages.nonlob.BenefitsParametersPage;
import com.aspire.guidewire.cc.pages.nonlob.BulkInvoiceDetailsPage;
import com.aspire.guidewire.cc.pages.nonlob.BulkInvoicePage;
import com.aspire.guidewire.cc.pages.nonlob.BusinessWeekPage;
import com.aspire.guidewire.cc.pages.nonlob.CalendarPage;
import com.aspire.guidewire.cc.pages.nonlob.CatastrophesPage;
import com.aspire.guidewire.cc.pages.nonlob.CatastrophesPage.NewCatastrophePage;
import com.aspire.guidewire.cc.pages.nonlob.ClaimsPage;
import com.aspire.guidewire.cc.pages.nonlob.CompensabilityParameterDetailPage;
import com.aspire.guidewire.cc.pages.nonlob.CompensabilityParametersPage;
import com.aspire.guidewire.cc.pages.nonlob.CreateANewPortalUserPage;
import com.aspire.guidewire.cc.pages.nonlob.DownloadHistoryPage;
import com.aspire.guidewire.cc.pages.nonlob.ExportDataPage;
import com.aspire.guidewire.cc.pages.nonlob.ExposureRulesPage;
import com.aspire.guidewire.cc.pages.nonlob.ExposureRulesPage.NewExposureRulePage;
import com.aspire.guidewire.cc.pages.nonlob.ExposuresPage;
import com.aspire.guidewire.cc.pages.nonlob.GroupsPage;
import com.aspire.guidewire.cc.pages.nonlob.GuidewireManagedBeanPropertiesPage;
import com.aspire.guidewire.cc.pages.nonlob.HolidaysPage;
import com.aspire.guidewire.cc.pages.nonlob.HolidaysPage.AddHolidayPage;
import com.aspire.guidewire.cc.pages.nonlob.InfoConfigurationPage;
import com.aspire.guidewire.cc.pages.nonlob.IntentionalLoggingPage;
import com.aspire.guidewire.cc.pages.nonlob.LitigationPage;
import com.aspire.guidewire.cc.pages.nonlob.ManagementBeansPage;
import com.aspire.guidewire.cc.pages.nonlob.MetricsThresholdsPage;
import com.aspire.guidewire.cc.pages.nonlob.NewAccountDetailPage;
import com.aspire.guidewire.cc.pages.nonlob.NewAccountDetailPage.SearchAddressBookPage;
import com.aspire.guidewire.cc.pages.nonlob.NewActivityClaimPage;
import com.aspire.guidewire.cc.pages.nonlob.NewAuthorityLimitProfilePage;
import com.aspire.guidewire.cc.pages.nonlob.NewAutomatedActivityPage;
import com.aspire.guidewire.cc.pages.nonlob.NewAutomatedNotificationPage;
import com.aspire.guidewire.cc.pages.nonlob.NewMatterNamePage;
import com.aspire.guidewire.cc.pages.nonlob.NewMatterPage;
import com.aspire.guidewire.cc.pages.nonlob.NewPropertyPage;
import com.aspire.guidewire.cc.pages.nonlob.NewSecurityZonePage;
import com.aspire.guidewire.cc.pages.nonlob.NewServiceTierPage;
import com.aspire.guidewire.cc.pages.nonlob.PPDMinMaxPage;
import com.aspire.guidewire.cc.pages.nonlob.PPDWeeksPage;
import com.aspire.guidewire.cc.pages.nonlob.PrintExportOptionsPage;
import com.aspire.guidewire.cc.pages.nonlob.QueuedActivitiesPage;
import com.aspire.guidewire.cc.pages.nonlob.RegionsPage;
import com.aspire.guidewire.cc.pages.nonlob.RegionsPage.AddRegionPage;
import com.aspire.guidewire.cc.pages.nonlob.ReinsuranceThresholdsPage;
import com.aspire.guidewire.cc.pages.nonlob.ReserveRulesPage;
import com.aspire.guidewire.cc.pages.nonlob.ReserveRulesPage.NewReserveRulePage;
import com.aspire.guidewire.cc.pages.nonlob.RolesPage;
import com.aspire.guidewire.cc.pages.nonlob.RolesPage.NewRolePage;
import com.aspire.guidewire.cc.pages.nonlob.RuntimePropertiesPage;
import com.aspire.guidewire.cc.pages.nonlob.ScriptParametersPage;
import com.aspire.guidewire.cc.pages.nonlob.SearchActivitiesPage;
import com.aspire.guidewire.cc.pages.nonlob.SearchBulkInvoicesPage;
import com.aspire.guidewire.cc.pages.nonlob.SearchChecksPage;
import com.aspire.guidewire.cc.pages.nonlob.SearchClaimsPage;
import com.aspire.guidewire.cc.pages.nonlob.SearchRecoveriesPage;
import com.aspire.guidewire.cc.pages.nonlob.SearchUsersPage;
import com.aspire.guidewire.cc.pages.nonlob.SetLogLevelPage;
import com.aspire.guidewire.cc.pages.nonlob.SpecialHandlingPage;
import com.aspire.guidewire.cc.pages.nonlob.StartableServicesPage;
import com.aspire.guidewire.cc.pages.nonlob.SummaryPage;
import com.aspire.guidewire.cc.pages.nonlob.UsersPage;
import com.aspire.guidewire.cc.pages.nonlob.ViewLogsPage;
import com.aspire.guidewire.cc.pages.nonlob.WorkQueueInfoPage;
import com.aspire.guidewire.cc.pages.nonlob.WorkflowStatisticsPage;
import com.aspire.guidewire.cc.pages.nonlob.WorkflowsPage;
import com.aspire.guidewire.cc.teststeps.nonlob.DataFakers;
import com.aspire.guidewire.cc.teststeps.nonlob.NonLobConstants.PaymentType;
import com.aspire.guidewire.cc.teststeps.nonlob.NonLobDataEngine;
import com.aspire.guidewire.cc.teststeps.nonlob.NonLobFeatures.AddPropertyDamage;
import com.aspire.guidewire.cc.teststeps.nonlob.NonLobFeatures.BasicInfo;
import com.aspire.guidewire.cc.teststeps.nonlob.NonLobFeatures.ClaimInfo;
import com.aspire.guidewire.cc.teststeps.nonlob.NonLobFeatures.ContactDetails;
import com.aspire.guidewire.cc.teststeps.nonlob.NonLobFeatures.PaymentOptions;
import com.aspire.guidewire.cc.teststeps.nonlob.NonLobFeatures.SearchClaim;
import com.aspire.guidewire.cc.teststeps.nonlob.NonLobImpl;
import com.aspire.guidewire.cc.teststeps.nonlob.NonLobSteps;
import com.aspire.guidewire.cc.teststeps.personalauto.PersonalAutoConstants;
import com.aspire.guidewire.cc.teststeps.personalauto.PersonalAutoConstants.Coverages;
import com.aspire.guidewire.cc.teststeps.personalauto.PersonalAutoFeatures;
import com.aspire.guidewire.cc.teststeps.personalauto.PersonalAutoFeatures.Coverage;
import com.aspire.guidewire.cc.teststeps.personalauto.PersonalAutoFeatures.CoverageType_C;
import com.aspire.guidewire.cc.teststeps.personalauto.PersonalAutoSteps;
import com.aspire.guidewire.cc.teststeps.personalauto.PersonalAutoStepsImpl;
import com.aspire.guidewire.pc.pages.common.AccountSummaryPage;
import com.aspire.guidewire.pc.pages.common.DocumentPage;
import com.aspire.guidewire.utils.DataProviderUtils;
import com.aspire.guidewire.utils.EnvironmentPropertiesReader;
import com.aspire.guidewire.utils.Log;
import com.aspire.guidewire.webdriverManager.DriverManager;


public class CC_NonLob  {

	boolean LambdatestStatus = false;

	String ccWebSite,pcWebSite, browser, contentGraphqlURL, browseAllContentGraphqlURL, sheetName;

	private static EnvironmentPropertiesReader configProperty = EnvironmentPropertiesReader.getInstance();

	protected static ThreadLocal<WebDriver> threadLocalDriver = new ThreadLocal<>();

	@BeforeTest(alwaysRun = true)
	public void init(ITestContext context) {

		pcWebSite = (System.getProperty("pcWebSite") != null ? System.getProperty("pcWebSite"): context.getCurrentXmlTest().getParameter("pcWebSite"));
		DriverManager.setPCWebsite(pcWebSite);

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
	@Test(description="To verify the unverified claim creation", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC2(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the unverified claim creation",driver);

		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC2");

		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("sulveling", "gw");

			cc.createClaim();

			SearchOrCreatePolicyPage searchOrCreatePolicyPage = new SearchOrCreatePolicyPage(driver);
			searchOrCreatePolicyPage.clickCreateUnverifiedPolicy(driver);
			searchOrCreatePolicyPage.enterPolicy(driver,testData.getPolicyNumber());
			searchOrCreatePolicyPage.selectType(driver, testData.getType());
			searchOrCreatePolicyPage.enterLossDate(driver,testData.getLossDate());
			searchOrCreatePolicyPage.enterEffective(driver,testData.getEffectiveDate());
			searchOrCreatePolicyPage.enterExpires(driver,testData.getExpirationDate());
			searchOrCreatePolicyPage.clickInsuredNameMenuIcon(driver);
			searchOrCreatePolicyPage.clickInsuredNewPerson(driver);

			cc.addContactInformation(ContactDetails.builder()
					.firstName(testData.getFirstName())
					.lastName(testData.getLastName())
					.build());

			searchOrCreatePolicyPage.clickNext(driver);

			cc.enterBasicInformation(BasicInfo.builder().build());

			cc.addClaimInformation(ClaimInfo.builder()
					.lossCause(testData.getLossCause())
					.state(testData.getState())
					.city(testData.getCity())
					.addPropertyDamage(AddPropertyDamage.builder()
							.damageDescription(testData.getDamageDescription())
							.propertyDescription(testData.setPropertyDescription())
							.propertyName(testData.getPropertyName())
							.build())
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
	@Test(description="To verify the User page in Administration", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC385(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the User page in Administration",driver);

		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC385");

		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clickAdministrationbutton(driver);
			headerPage.clickUserAndSecurityToggle(driver);
			headerPage.clickUser(driver);
			UsersPage usersPage = new UsersPage(driver);
			usersPage.enterUsername(driver, testData.getName());
			usersPage.clickSearch(driver);
			usersPage.clickSearchResultname(driver,testData.getName());
			usersPage.verifyBasicsDetailsIsDisplay(driver);
			usersPage.verifyRolesLabel(driver);
			usersPage.verifyProfileTabIsDisplay(driver);
			usersPage.clickAuthorityLimitsTab(driver);
			usersPage.verifyAuthorityLimits(driver);
			usersPage.verifyAttributeTabIsDisplay(driver);
			usersPage.verifyRegionTabIsDisplay(driver);
			usersPage.verifyDetailsTab(driver);
			usersPage.clickDetailsTab(driver);
			usersPage.verifyDetailsInsured(driver);
			usersPage.verifyDetailsPolicyId(driver);
			usersPage.verifyDetailsTabClaimID(driver);
			usersPage.verifyEditBtnIsDisplay(driver);
			usersPage.clickEdit(driver);
			usersPage.clickRegionTab(driver);
			usersPage.clickAddRegion(driver);
			usersPage.enterRegionsName(driver,testData.getRegionsName());
			usersPage.clickRegionSearch(driver);
			usersPage.clickRegionFromSearchResult(driver);
			usersPage.clickRegionSelect(driver);
			usersPage.clickUpdate(driver);
			usersPage.clickEdit(driver);
			usersPage.clickUsersDetailsRegionList(driver);
			usersPage.clickRemove(driver);
			usersPage.clickUpdate(driver);
			
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
	@Test(description="To verify the Group page in Administration", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC386(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the Group page in Administration",driver);

		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC386");

		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clickAdministrationbutton(driver);
			headerPage.clickUserAndSecurityToggle(driver);
			headerPage.clickGroups(driver);

			GroupsPage groupsPage = new GroupsPage(driver);
			groupsPage.enterGroupName(driver,testData.getName());
			groupsPage.selectGroupType(driver,testData.getType());
			groupsPage.clickSearch(driver);
			groupsPage.clickGroupName(driver);
			groupsPage.verifyProfileTab(driver);
			groupsPage.verifyQueuesTab(driver);
			groupsPage.verifyRegionsTab(driver);
			groupsPage.clickEdit(driver);
			groupsPage.clickQueuesTab(driver);
			groupsPage.clickGroupQueuesAdd(driver);
			groupsPage.enterGroupQueuesName(driver,testData.getFirstName());
			groupsPage.enterGroupQueuesDescription(driver,testData.getDescription());
			groupsPage.clickRegionsTab(driver);
			groupsPage.clickAddRegion(driver);
			groupsPage.enterRegionsName(driver,testData.getRegionsName());
			groupsPage.clickRegionSearch(driver);
			groupsPage.clickRegionFromSearchResult(driver);
			groupsPage.clickRegionSelect(driver);
			groupsPage.clickNameCheckBox(driver,testData.getRegionsName());
			groupsPage.clickRemove(driver);
			
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
	@Test(description="To verify the Roles page in Administration", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC387(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the Roles page in Administration",driver);

		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC387");
		String name = testData.getName();
		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clickAdministrationbutton(driver);
			headerPage.clickUserAndSecurityToggle(driver);
			headerPage.clickRoles(driver);

			RolesPage rolesPage = new RolesPage(driver);
			rolesPage.clickAddRole(driver);
			NewRolePage newRolePage = rolesPage.new NewRolePage(driver);
			newRolePage.enterName(driver, name);
			newRolePage.enterDescription(driver, testData.getDescription());
			newRolePage.clickAdd(driver);
			newRolePage.selectPermission(driver,testData.getPermission());
			newRolePage.clickUpdate(driver);
			newRolePage.clickUpdate(driver);
			newRolePage.verifyAddedRolesIsDisplaying(driver, name);
			newRolePage.clickRolesCheckBox(driver, name);
			newRolePage.clickDelete(driver);

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
	@Test(description="To verify the Regions page in Administration", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC388(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the Regions page in Administration",driver);

		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC388");
		String name = testData.getName();
		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clickAdministrationbutton(driver);
			headerPage.clickUserAndSecurityToggle(driver);
			headerPage.clickRegions(driver);

			RegionsPage regionsPage = new RegionsPage(driver);
			regionsPage.clickAddRegion(driver);
			AddRegionPage newRegionsPage = regionsPage.new AddRegionPage(driver);
			newRegionsPage.enterName(driver,name);
			newRegionsPage.enterEdgePolicyholderEnglish(driver, testData.getEdgePolicyholder());
			newRegionsPage.enterEdgeEnglish(driver, testData.getEdgeEnglish());
			newRegionsPage.clickUpdate(driver);
			regionsPage.verifyAddedRegionsIsDisplayed(driver, name);
			regionsPage.clickRegionsCheckBox(driver, name);
			regionsPage.clickDelete(driver);
			
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
	@Test(description="To verify the Security Zones page in Administration", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC389(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the Security Zones page in Administration",driver);
		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC389");
		String name = testData.getName();
		String zoneName = testData.getFirstName();

		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clickAdministrationbutton(driver);
			headerPage.clickUserAndSecurityToggle(driver);
			headerPage.clickSecurityZones(driver);
			NewSecurityZonePage newSecurityZonePage = new NewSecurityZonePage(driver);
			newSecurityZonePage.clickAddSecurityZone(driver);
			newSecurityZonePage.enterName(driver, name);
			newSecurityZonePage.enterDescription(driver, testData.getDescription());
			newSecurityZonePage.enterDescriptionEdgeEnglish(driver,  testData.getEdgePolicyholder());
			newSecurityZonePage.enterDescriptionEdgePolicyholderEnglish(driver, testData.getEdgePolicyholder());
			newSecurityZonePage.enterNameEdgeEnglish(driver, testData.getFirstName());
			newSecurityZonePage.enterNameEdgePolicyholderEnglish(driver, testData.getFirstName());
			newSecurityZonePage.clickUpdate(driver);
			newSecurityZonePage.verifySecurityZoneIsDisplay(driver, name);
			newSecurityZonePage.clickAddedNameCheckBox(driver, name);
			newSecurityZonePage.clickEdit(driver);
			newSecurityZonePage.enterName(driver, zoneName);
			newSecurityZonePage.clickUpdate(driver);
			newSecurityZonePage.clickAddedNameCheckBox(driver, zoneName);
			newSecurityZonePage.clickDelete(driver);
			newSecurityZonePage.verifyclickAddedUserNameIsNotDisplayed(driver, zoneName);
			
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
	@Test(  description="To verify the Authority Limit Profile page in Administration", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC390(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the Authority Limit Profile page in Administration",driver);
		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC390");
		String name = testData.getName();

		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clickAdministrationbutton(driver);
			headerPage.clickUserAndSecurityToggle(driver);
			headerPage.clickAuthorityLimitProfile(driver);
			NewAuthorityLimitProfilePage newAuthorityLimitProfilePage = new NewAuthorityLimitProfilePage(driver);
			newAuthorityLimitProfilePage.clickAuthorityLimitProfilesAdd(driver);
			newAuthorityLimitProfilePage.enterName(driver, name);
			newAuthorityLimitProfilePage.enterDescription(driver, testData.getDescription());
			newAuthorityLimitProfilePage.clickAdd(driver);
			newAuthorityLimitProfilePage.selectAuthorityLimitsType(driver, testData.getLimitType());
			newAuthorityLimitProfilePage.selectAuthorityPolicyType(driver, testData.getPolicyType());
			newAuthorityLimitProfilePage.selectAuthorityCoverageType(driver, testData.getCoverageType());
			newAuthorityLimitProfilePage.selectAuthorityCostType(driver, testData.getCostType());
			newAuthorityLimitProfilePage.enterAmount(driver, testData.getAmount());
			newAuthorityLimitProfilePage.enterDescriptionEdgeEnglish(driver, testData.getDescription());
			newAuthorityLimitProfilePage.enterDescriptionEdgePolicyholderEnglish(driver, testData.getDescription());
			newAuthorityLimitProfilePage.enterNameEdgeEnglish(driver, name);
			newAuthorityLimitProfilePage.enterNameEdgePolicyholderEnglish(driver, name);
			newAuthorityLimitProfilePage.selectAuthorityLimitsType(driver, testData.getLimitType());
			newAuthorityLimitProfilePage.selectAuthorityPolicyType(driver, testData.getPolicyType());
			newAuthorityLimitProfilePage.selectAuthorityCoverageType(driver,testData.getCoverageType() );
			newAuthorityLimitProfilePage.selectAuthorityCostType(driver, testData.getCostType());
			newAuthorityLimitProfilePage.enterAmount(driver,testData.getAmount());
			newAuthorityLimitProfilePage.clickUpdate(driver);
			newAuthorityLimitProfilePage.verifyNewAuthorityLimitProfileIsDisplay(driver, name);

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
	@Test(description="To verify the Attributes page in Administration", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC391(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the Attributes page in Administration",driver);
		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC391");
		String name = testData.getName();

		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clickAdministrationbutton(driver);
			headerPage.clickUserAndSecurityToggle(driver);
			headerPage.clickAttribute(driver);
			AddAttributePage addAttributePage = new AddAttributePage(driver);
			addAttributePage.clickAddAttribute(driver);
			addAttributePage.enterName(driver, name);
			addAttributePage.enterDescription(driver, testData.getDescription());
			addAttributePage.selectType(driver, testData.getType());
			addAttributePage.enterDescriptionEdgeEnglish(driver, testData.getDescription());
			addAttributePage.enterDescriptionEdgePolicyholderEnglish(driver, testData.getDescription());
			addAttributePage.enterNameEdgeEnglish(driver, testData.getDescription());
			addAttributePage.enterNameEdgePolicyholderEnglish(driver, testData.getDescription());
			addAttributePage.clickUpdate(driver);
			String attributeName = addAttributePage.getAttributeName(driver);
			addAttributePage.clickFirstAttributeNameLink(driver);
			addAttributePage.clickEdit(driver);
			addAttributePage.enterName(driver, testData.getFirstName());
			addAttributePage.clickCancel(driver);
			addAttributePage.verifyAttributeNameIsUpdated(driver, attributeName);
			addAttributePage.clickFirstAttributeNameLink(driver);
			addAttributePage.clickEdit(driver);
			addAttributePage.enterName(driver, testData.getFirstName());
			addAttributePage.clickUpdate(driver);
			addAttributePage.verifyAttributeNameIsUpdated(driver, attributeName);

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
	@Test(enabled = false, description="To verify the Authorized Portal Users page in Administration", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC392(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the Authorized Portal Users page in Administration",driver);
		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC392");
		String firstName= testData.getFirstName();
		String lastName = testData.getLastName();
		String usernameEmailId = testData.getEmail();

		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clickAdministrationbutton(driver);
			headerPage.clickUserAndSecurityToggle(driver);
			headerPage.clickPortalAuthorization(driver);
			CreateANewPortalUserPage createANewPortalUserPage = new CreateANewPortalUserPage(driver);
			createANewPortalUserPage.enterSearchFirstName(driver,testData.getUserFirstName());
			createANewPortalUserPage.enterSearchLastName(driver,testData.getUserLastName());
			createANewPortalUserPage.clickSearchUsers(driver);
			createANewPortalUserPage.verifyFirstName(driver, testData.getUserFirstName());
			createANewPortalUserPage.verifyLastName(driver, testData.getUserLastName());
			createANewPortalUserPage.clickCreateANewUser(driver);
			createANewPortalUserPage.enterFirstName(driver, firstName);
			createANewPortalUserPage.enterLastName(driver, lastName);
			createANewPortalUserPage.enterPassword(driver, testData.getPassword());
			createANewPortalUserPage.enterEmailAddress(driver, usernameEmailId);
			createANewPortalUserPage.clickAddAGrantedAuthority(driver);
			createANewPortalUserPage.clickAccountHolder(driver);
			createANewPortalUserPage.enterAccountNumber(driver, testData.getAccountNumber());
			createANewPortalUserPage.clickUpdate(driver);
			createANewPortalUserPage.clickOK(driver);
			createANewPortalUserPage.clickAddedUserName(driver, usernameEmailId);
			createANewPortalUserPage.clickReturnToPortalAuthorization(driver);
			createANewPortalUserPage.verifyTitleofauthorizedPortal(driver);
			createANewPortalUserPage.clickAddedUserNameCheckBox(driver, usernameEmailId);
			createANewPortalUserPage.clickDelete(driver);
			createANewPortalUserPage.verifyclickAddedUserNameIsNotDisplayed(driver, usernameEmailId);

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
	@Test(description="To verify that able to create account in Special Handling", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC393(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC393");
		Log.testCaseInfo("To verify that able to create account in Special Handling",driver);
		try {	

			com.aspire.guidewire.pc.teststeps.nonlob.NonLobImpl pc = com.aspire.guidewire.pc.teststeps.nonlob.NonLobSteps.create();
			pc.loginIntoTheApplication("su", "gw");
			com.aspire.guidewire.pc.pages.common.HeaderPage headerPagePc = new com.aspire.guidewire.pc.pages.common.HeaderPage(driver);
			headerPagePc.clickToggleAccountSubMenu(driver);
			headerPagePc.enterAccountNumber(driver, testData.getAccountNumber());
			AccountSummaryPage accountSummaryPage = headerPagePc.clickSearchAccountNumber(driver);
			String accountName =accountSummaryPage.getAccountHolderName(driver);
			
			NonLobImpl cc = NonLobSteps.create();
			cc.loginIntoTheApplication("su", "gw");
			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clickAdministrationbutton(driver);
			headerPage.clickSpecialHandlingToggle(driver);
			headerPage.clickSpecialHandlingAccount(driver);
			NewAccountDetailPage newAccountDetailPage = new NewAccountDetailPage(driver);
			newAccountDetailPage.clickAddAccount(driver);
			newAccountDetailPage.enterAccountNumber(driver, testData.getAccountNumber());
			newAccountDetailPage.clickAccountHolderMenuIcon(driver);
			newAccountDetailPage.clickSearchAccountHolderMenuIcon(driver);
			SearchAddressBookPage searchAddressBookPage = newAccountDetailPage.new SearchAddressBookPage(driver);
			searchAddressBookPage.clickSearchByDistance(driver);
			searchAddressBookPage.selectSearchRadius(driver, testData.getSearchRadius());
			searchAddressBookPage.selectCountry(driver, testData.getCountry());
			searchAddressBookPage.selectState(driver, testData.getState());
			searchAddressBookPage.clickSearch(driver);
			searchAddressBookPage.clickSelect(driver);
			newAccountDetailPage.clickSpecialHandling(driver);
			SpecialHandlingPage specialHandlingPage = new SpecialHandlingPage(driver);	
			specialHandlingPage.clickAutomatedNotificationsAdd(driver);
			specialHandlingPage.clickAutomatedNotificationsForFinancialEvent(driver);
			NewAutomatedNotificationPage NewAutomatedNotificationPage = new NewAutomatedNotificationPage(driver);
			NewAutomatedNotificationPage.enterThresholdAmount(driver,testData.getAmount());
			NewAutomatedNotificationPage.clickEmailTemplate(driver);
			NewAutomatedNotificationPage.clickEmailTemplateSearch(driver);
			NewAutomatedNotificationPage.clickSelectEmailTemplateFromSearchResult(driver);
			NewAutomatedNotificationPage.enterEmailAddress(driver, testData.getEmail());
			NewAutomatedNotificationPage.clickOK(driver);
			specialHandlingPage.clickAutomatedActivitiesAdd(driver);
			specialHandlingPage.clickAutomatedActivitiesForFinancialEvent(driver);
			NewAutomatedActivityPage newAutomatedActivityPage = new NewAutomatedActivityPage(driver);
			newAutomatedActivityPage.enterThresholdAmount(driver, testData.getAmount());
			newAutomatedActivityPage.selectActivityPattern(driver, testData.getActivityPattern());
			newAutomatedActivityPage.clickOk(driver);
			newAccountDetailPage.clickDetailsTab(driver);
			newAccountDetailPage.clickOk(driver);
			newAccountDetailPage.clickAccountCheckBox(driver);
			newAccountDetailPage.clickDelete(driver);
			newAccountDetailPage.verifyclickAddedUserNameIsNotDisplayed(driver, accountName);

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
	@Test(description="To verify that able to create Service Tier in Special Handling", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC394(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to create Service Tier in Special Handling",driver);
		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC394");
		String name= testData.getName();

		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clickAdministrationbutton(driver);
			headerPage.clickSpecialHandlingToggle(driver);
			headerPage.clickSpecialHandlingServiceTier(driver);
			NewServiceTierPage newServiceTierPage = new NewServiceTierPage(driver);
			newServiceTierPage.clickAddServiceTiers(driver);
			newServiceTierPage.selectName(driver, name);
			newServiceTierPage.clickSpecialHandling(driver);
			SpecialHandlingPage specialHandlingPage = new SpecialHandlingPage(driver);	
			specialHandlingPage.clickAutomatedNotificationsAdd(driver);
			specialHandlingPage.clickAutomatedNotificationsForFinancialEvent(driver);
			NewAutomatedNotificationPage NewAutomatedNotificationPage = new NewAutomatedNotificationPage(driver);
			NewAutomatedNotificationPage.enterThresholdAmount(driver,testData.getAmount());
			NewAutomatedNotificationPage.clickEmailTemplate(driver);
			NewAutomatedNotificationPage.clickEmailTemplateSearch(driver);
			NewAutomatedNotificationPage.clickSelectEmailTemplateFromSearchResult(driver);
			NewAutomatedNotificationPage.enterEmailAddress(driver, testData.getEmail());
			NewAutomatedNotificationPage.clickOK(driver);
			specialHandlingPage.clickAutomatedActivitiesAdd(driver);
			specialHandlingPage.clickAutomatedActivitiesForFinancialEvent(driver);
			NewAutomatedActivityPage newAutomatedActivityPage = new NewAutomatedActivityPage(driver);
			newAutomatedActivityPage.enterThresholdAmount(driver, testData.getAmount());
			newAutomatedActivityPage.selectActivityPattern(driver, testData.getActivityPattern());
			newAutomatedActivityPage.clickOk(driver);
			newServiceTierPage.clickDetailsTab(driver);
			newServiceTierPage.clickOk(driver);
			newServiceTierPage.clickNameCheckBox(driver, name);
			newServiceTierPage.clickDelete(driver);
			newServiceTierPage.verifyclickAddedUserNameIsNotDisplayed(driver, name);
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
	@Test(description="To verify that able to create Activity Rule in Business setting", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC395(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to create Activity Rule in Business setting",driver);
		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC395");
		String name= testData.getName();

		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clickAdministrationbutton(driver);
			headerPage.clickBusinessSettingsToggle(driver);
			headerPage.clickBusinessSettings(driver);
			headerPage.clickActivityRules(driver);
			ActivityRulesPage activityRulesPage = new ActivityRulesPage(driver);
			activityRulesPage.verifyStatusLabel(driver);
			activityRulesPage.verifyNameLabel(driver);
			activityRulesPage.verifyActionTypeIsDisplayed(driver);
			activityRulesPage.verifyLossTypeIsDisplayed(driver);
			activityRulesPage.verifyPolicyTypesIsDisplayed(driver);
			activityRulesPage.verifyTriggerActionIsDisplayed(driver);
			activityRulesPage.verifyTriggerEntityIsDisplayed(driver);
			activityRulesPage.verifyJurisdictionsIsDisplayed(driver);
			activityRulesPage.clickAdd(driver);
			NewActivityRulePage newActivityRulePage = activityRulesPage.new NewActivityRulePage(driver);
			newActivityRulePage.enterName(driver, name);
			newActivityRulePage.enterDescription(driver, testData.getDescription());
			newActivityRulePage.selectTriggerEntity(driver,testData.getTriggerEntity());
			newActivityRulePage.selectTriggerAction(driver,testData.getTriggerAction());
			newActivityRulePage.clickAdd(driver);
			newActivityRulePage.enterRuleVariableName(driver, name);
			newActivityRulePage.enterRuleVariableDescription(driver, testData.getDescription());
			newActivityRulePage.enterRuleVariableExpression(driver,testData.getRuleVariableExpression());
			newActivityRulePage.clickAddAction(driver);
			newActivityRulePage.selectActionType(driver,testData.getActionType());
			newActivityRulePage.selectType(driver, testData.getActionParameterType());
			newActivityRulePage.enterActionDescription(driver, testData.getDescription());
			newActivityRulePage.clickSave(driver);
			activityRulesPage.clickNameCheckBox(driver, name);
			activityRulesPage.clickClone(driver);
			newActivityRulePage.clickSave(driver);
			activityRulesPage.clickActivityRuleNameLink(driver, name);
			activityRulesPage.clickUpToActivityRules(driver);
			activityRulesPage.clickActivityRuleNameLink(driver, name);
			activityRulesPage.clickDelete(driver);
			activityRulesPage.verifyclickAddedUserNameIsNotDisplayed(driver, name);

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
	@Test(description="To verify the Search functionality for auto claim using 'Simple Search'", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC318(String browser) throws Exception {

		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC318");

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();

		Log.testCaseInfo("To verify the Search functionality for auto claim using 'Simple Search'",driver);

		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("sdunn", "gw");

			HeaderPage headerPage=new HeaderPage(driver);
			headerPage.clickSearchToggleSubMenu(driver);
			headerPage.moveToClaim(driver);
			SearchClaimsPage searchClaimsPage=headerPage.clickSimpleSearch(driver);
			searchClaimsPage.enterClaim(driver, testData.getClaimNumber());
			searchClaimsPage.selectSearchFor(driver, testData.getSearchFor());
			searchClaimsPage.clickSearch(driver);
			searchClaimsPage.verifyClaimantValue(driver);
			searchClaimsPage.verifyInsuredName(driver);
			searchClaimsPage.verifyPolicyValue(driver);
			searchClaimsPage.verifyClaimantName(driver);
			searchClaimsPage.verifyLossDateValue(driver);
			searchClaimsPage.verifyStatusValue(driver);
			searchClaimsPage.clickClaimLink(driver)	;
			SummaryPage SummaryPage=new SummaryPage(driver);
			SummaryPage.verifyBasicsValues(driver);
			SummaryPage.verifyFinaicialsValues(driver);
			SummaryPage.verifyHighRiskIndicatorsValues(driver);
			SummaryPage.verifyLossDateInputValues(driver);
			SummaryPage.verifyLossLocationsInputValues(driver);
			SummaryPage.verifyExposuresValues(driver);

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
	@Test(description="To verify the Search functionality for condo claim using 'Simple Search'", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC319(String browser) throws Exception {

		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC319");
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the Search functionality for condo claim using 'Simple Search'",driver);
		
		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			HeaderPage headerPage=new HeaderPage(driver);
			headerPage.clickSearchToggleSubMenu(driver);
			headerPage.moveToClaim(driver);
			SearchClaimsPage searchClaimsPage=headerPage.clickSimpleSearch(driver);
			searchClaimsPage.enterClaim(driver, testData.getClaimNumber());
			searchClaimsPage.selectSearchFor(driver, testData.getSearchFor());
			searchClaimsPage.clickSearch(driver);
			searchClaimsPage.verifyClaimantValue(driver);
			searchClaimsPage.verifyInsuredName(driver);
			searchClaimsPage.verifyPolicyValue(driver);
			searchClaimsPage.verifyClaimantName(driver);
			searchClaimsPage.verifyLossDateValue(driver);
			searchClaimsPage.verifyStatusValue(driver);
			searchClaimsPage.clickClaimLink(driver)	;
			SummaryPage SummaryPage=new SummaryPage(driver);
			SummaryPage.verifyBasicsValues(driver);
			SummaryPage.verifyFinaicialsValues(driver);
			SummaryPage.verifyHighRiskIndicatorsValues(driver);
			SummaryPage.verifyLossDateInputValues(driver);
			SummaryPage.verifyLossLocationsInputValues(driver);
			SummaryPage.verifyExposuresValues(driver);

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
	@Test(description="To verify the Search functionality for Commercial package claim using 'Simple Search'", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC320(String browser) throws Exception {

		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC320");
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();

		Log.testCaseInfo("To verify the Search functionality for Commercial package claim using 'Simple Search'",driver);

		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			HeaderPage headerPage=new HeaderPage(driver);
			headerPage.clickSearchToggleSubMenu(driver);
			headerPage.moveToClaim(driver);
			SearchClaimsPage searchClaimsPage=headerPage.clickSimpleSearch(driver);
			searchClaimsPage.enterClaim(driver, testData.getClaimNumber());
			searchClaimsPage.selectSearchFor(driver, testData.getSearchFor());
			searchClaimsPage.clickSearch(driver);
			searchClaimsPage.verifyClaimantValue(driver);
			searchClaimsPage.verifyInsuredName(driver);
			searchClaimsPage.verifyPolicyValue(driver);
			searchClaimsPage.verifyClaimantName(driver);
			searchClaimsPage.verifyLossDateValue(driver);
			searchClaimsPage.verifyStatusValue(driver);
			searchClaimsPage.clickClaimLink(driver)	;
			SummaryPage SummaryPage=new SummaryPage(driver);
			SummaryPage.verifyBasicsValues(driver);
			SummaryPage.verifyFinaicialsValues(driver);
			SummaryPage.verifyHighRiskIndicatorsValues(driver);
			SummaryPage.verifyLossDateInputValues(driver);
			SummaryPage.verifyLossLocationsInputValues(driver);
			SummaryPage.verifyExposuresValues(driver);

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
	@Test(description="To verify the Search functionality for Businessowners claim using 'Advanced Search'", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC321(String browser) throws Exception {

		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC321");

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the Search functionality for Businessowners claim using 'Advanced Search'",driver);
	
		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("sulveling", "gw");

			HeaderPage headerPage=new HeaderPage(driver);
			headerPage.clickSearchToggleSubMenu(driver);
			headerPage.moveToClaim(driver);
			AdvanceSearchClaimsPage advanceSearchClaimsPage=headerPage.clickAdvancedSearch(driver);
			advanceSearchClaimsPage.enterClaim(driver, testData.getClaimNumber());
			advanceSearchClaimsPage.selectSearchFor(driver, testData.getSearchFor());
			advanceSearchClaimsPage.selectLineofBusiness(driver,testData.getLineOfBusiness());
			advanceSearchClaimsPage.clickSearch(driver);
			advanceSearchClaimsPage.verifyClaimantValue(driver);
			advanceSearchClaimsPage.verifyInsuredName(driver);
			advanceSearchClaimsPage.verifyPolicyValue(driver);
			advanceSearchClaimsPage.verifyClaimantName(driver);
			advanceSearchClaimsPage.verifyLossDateValue(driver);
			advanceSearchClaimsPage.verifyStatusValue(driver);
			advanceSearchClaimsPage.clickClaimLink(driver)	;
			SummaryPage SummaryPage=new SummaryPage(driver);
			SummaryPage.verifyBasicsValues(driver);
			SummaryPage.verifyFinaicialsValues(driver);
			SummaryPage.verifyHighRiskIndicatorsValues(driver);
			SummaryPage.verifyLossDateInputValues(driver);
			SummaryPage.verifyLossLocationsInputValues(driver);
			SummaryPage.verifyExposuresValues(driver);

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
	@Test(description="To verify the Search functionality for Workers' Compensation claim using 'Advanced Search'", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC322(String browser) throws Exception {

		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC322");
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();

		Log.testCaseInfo("To verify the Search functionality for Workers' Compensation claim using 'Advanced Search'",driver);
		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			HeaderPage headerPage=new HeaderPage(driver);
			headerPage.clickSearchToggleSubMenu(driver);
			headerPage.moveToClaim(driver);
			AdvanceSearchClaimsPage advanceSearchClaimsPage=headerPage.clickAdvancedSearch(driver);
			advanceSearchClaimsPage.enterClaim(driver, testData.getClaimNumber());
			advanceSearchClaimsPage.selectSearchFor(driver, testData.getSearchFor());
			advanceSearchClaimsPage.selectLineofBusiness(driver,testData.getLineOfBusiness());
			advanceSearchClaimsPage.clickSearch(driver);
			advanceSearchClaimsPage.verifyClaimantValue(driver);
			advanceSearchClaimsPage.verifyInsuredName(driver);
			advanceSearchClaimsPage.verifyPolicyValue(driver);
			advanceSearchClaimsPage.verifyClaimantName(driver);
			advanceSearchClaimsPage.verifyLossDateValue(driver);
			advanceSearchClaimsPage.verifyStatusValue(driver);
			advanceSearchClaimsPage.clickClaimLink(driver)	;
			SummaryPage SummaryPage=new SummaryPage(driver);
			SummaryPage.verifyBasicsValues(driver);
			SummaryPage.verifyFinaicialsValues(driver);
			SummaryPage.verifyHighRiskIndicatorsValues(driver);
			SummaryPage.verifyLossDateInputValues(driver);
			SummaryPage.verifyLossLocationsInputValues(driver);
			SummaryPage.verifyExposuresValues(driver);

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
	@Test(description="To verify the Search functionality for commercial auto claim using 'Advanced Search'", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC323(String browser) throws Exception {

		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC323");
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();

		Log.testCaseInfo("To verify the Search functionality for commercial auto claim using 'Advanced Search'",driver);


		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("sdunn", "gw");

			HeaderPage headerPage=new HeaderPage(driver);
			headerPage.clickSearchToggleSubMenu(driver);
			headerPage.moveToClaim(driver);
			AdvanceSearchClaimsPage advanceSearchClaimsPage=headerPage.clickAdvancedSearch(driver);
			advanceSearchClaimsPage.enterClaim(driver,testData.getClaimNumber());
			advanceSearchClaimsPage.selectSearchFor(driver, testData.getSearchFor());
			advanceSearchClaimsPage.selectLineofBusiness(driver,testData.getLineOfBusiness());
			advanceSearchClaimsPage.clickSearch(driver);
			advanceSearchClaimsPage.verifyClaimantValue(driver);
			advanceSearchClaimsPage.verifyInsuredName(driver);
			advanceSearchClaimsPage.verifyPolicyValue(driver);
			advanceSearchClaimsPage.verifyClaimantName(driver);
			advanceSearchClaimsPage.verifyLossDateValue(driver);
			advanceSearchClaimsPage.verifyStatusValue(driver);
			advanceSearchClaimsPage.clickClaimLink(driver)	;
			SummaryPage SummaryPage=new SummaryPage(driver);
			SummaryPage.verifyBasicsValues(driver);
			SummaryPage.verifyFinaicialsValues(driver);
			SummaryPage.verifyHighRiskIndicatorsValues(driver);
			SummaryPage.verifyLossDateInputValues(driver);
			SummaryPage.verifyLossLocationsInputValues(driver);
			SummaryPage.verifyExposuresValues(driver);

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
	@Test(description="To verify the Search functionality for General Liability claim using 'Advanced Search'", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC324(String browser) throws Exception {

		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC324");

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();

		Log.testCaseInfo("To verify the Search functionality for General Liability claim using 'Advanced Search'",driver);

		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			HeaderPage headerPage=new HeaderPage(driver);
			headerPage.clickSearchToggleSubMenu(driver);
			headerPage.moveToClaim(driver);
			AdvanceSearchClaimsPage advanceSearchClaimsPage=headerPage.clickAdvancedSearch(driver);
			advanceSearchClaimsPage.enterClaim(driver, testData.getClaimNumber());
			advanceSearchClaimsPage.selectSearchFor(driver, testData.getSearchFor());
			advanceSearchClaimsPage.selectLineofBusiness(driver,testData.getLineOfBusiness());
			advanceSearchClaimsPage.clickSearch(driver);
			advanceSearchClaimsPage.verifyClaimantValue(driver);
			advanceSearchClaimsPage.verifyInsuredName(driver);
			advanceSearchClaimsPage.verifyPolicyValue(driver);
			advanceSearchClaimsPage.verifyClaimantName(driver);
			advanceSearchClaimsPage.verifyLossDateValue(driver);
			advanceSearchClaimsPage.verifyStatusValue(driver);
			advanceSearchClaimsPage.clickClaimLink(driver)	;
			SummaryPage SummaryPage=new SummaryPage(driver);
			SummaryPage.verifyBasicsValues(driver);
			SummaryPage.verifyFinaicialsValues(driver);
			SummaryPage.verifyHighRiskIndicatorsValues(driver);
			SummaryPage.verifyLossDateInputValues(driver);
			SummaryPage.verifyLossLocationsInputValues(driver);
			SummaryPage.verifyExposuresValues(driver);

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
	@Test(description="To verify the Search functionality for Workers' Compensation claim with respective policy number using Advanced Search", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC329(String browser) throws Exception {
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC329");
		Log.testCaseInfo("To verify the Search functionality for Workers' Compensation claim with respective policy number using Advanced Search",driver);

		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			HeaderPage headerPage=new HeaderPage(driver);
			headerPage.clickSearchToggleSubMenu(driver);
			headerPage.moveToClaim(driver);
			AdvanceSearchClaimsPage advanceSearchClaimsPage=headerPage.clickAdvancedSearch(driver);
			advanceSearchClaimsPage.enterPolicy(driver, testData.getPolicyNumber());
			advanceSearchClaimsPage.selectSearchFor(driver, testData.getSearchFor());
			advanceSearchClaimsPage.selectLineofBusiness(driver,testData.getLineOfBusiness());
			advanceSearchClaimsPage.clickIncludeChildGroupsNo(driver);
			advanceSearchClaimsPage.clickCreatedByMenuIcon(driver);
			SearchUsersPage searchUsersPage=advanceSearchClaimsPage.clickSearchforaUser(driver);
			searchUsersPage.enterFirstname(driver, testData.getName());
			searchUsersPage.clickSearch(driver);
			searchUsersPage.clickSelect(driver);
			advanceSearchClaimsPage.clickSearch(driver);
			advanceSearchClaimsPage.verifyClaimantValue(driver);
			advanceSearchClaimsPage.verifyInsuredName(driver);
			advanceSearchClaimsPage.verifyPolicyValue(driver);
			advanceSearchClaimsPage.verifyClaimantName(driver);
			advanceSearchClaimsPage.verifyLossDateValue(driver);
			advanceSearchClaimsPage.verifyStatusValue(driver);
			advanceSearchClaimsPage.clickClaimLink(driver)	;
			SummaryPage SummaryPage=new SummaryPage(driver);
			SummaryPage.verifyBasicsValues(driver);
			SummaryPage.verifyFinaicialsValues(driver);
			SummaryPage.verifyHighRiskIndicatorsValues(driver);
			SummaryPage.verifyLossDateInputValues(driver);
			SummaryPage.verifyLossLocationsInputValues(driver);
			SummaryPage.verifyExposuresValues(driver);

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
	@Test(description="To verify the Search functionality for General Liability claim with respective policy number using Advanced Search", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC330(String browser) throws Exception {

		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC330");

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();

		Log.testCaseInfo("To verify the Search functionality for General Liability claim with respective policy number using Advanced Search",driver);

		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("sulveling", "gw");

			HeaderPage headerPage=new HeaderPage(driver);
			headerPage.clickSearchToggleSubMenu(driver);
			headerPage.moveToClaim(driver);
			AdvanceSearchClaimsPage advanceSearchClaimsPage=headerPage.clickAdvancedSearch(driver);
			advanceSearchClaimsPage.enterPolicy(driver, testData.getPolicyNumber());
			advanceSearchClaimsPage.selectSearchFor(driver, testData.getSearchFor());
			advanceSearchClaimsPage.selectLineofBusiness(driver,testData.getLineOfBusiness());
			advanceSearchClaimsPage.clickIncludeChildGroupsNo(driver);
			advanceSearchClaimsPage.clickCreatedByMenuIcon(driver);
			SearchUsersPage searchUsersPage=advanceSearchClaimsPage.clickSearchforaUser(driver);
			searchUsersPage.enterFirstname(driver, testData.getName());
			searchUsersPage.clickSearch(driver);
			searchUsersPage.clickSelect(driver);
			advanceSearchClaimsPage.clickSearch(driver);
			advanceSearchClaimsPage.verifyClaimantValue(driver);
			advanceSearchClaimsPage.verifyInsuredName(driver);
			advanceSearchClaimsPage.verifyPolicyValue(driver);
			advanceSearchClaimsPage.verifyClaimantName(driver);
			advanceSearchClaimsPage.verifyLossDateValue(driver);
			advanceSearchClaimsPage.verifyStatusValue(driver);
			advanceSearchClaimsPage.clickClaimLink(driver)	;
			SummaryPage SummaryPage=new SummaryPage(driver);
			SummaryPage.verifyBasicsValues(driver);
			SummaryPage.verifyFinaicialsValues(driver);
			SummaryPage.verifyHighRiskIndicatorsValues(driver);
			SummaryPage.verifyLossDateInputValues(driver);
			SummaryPage.verifyLossLocationsInputValues(driver);
			SummaryPage.verifyExposuresValues(driver);

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
	@Test(description="To verify the Search functionality for Commercial Auto claim with respective policy number using Advanced Search", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC331(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC331");

		Log.testCaseInfo("To verify the Search functionality for Commercial Auto claim with respective policy number using Advanced Search",driver);
		
		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("sdunn", "gw");

			HeaderPage headerPage=new HeaderPage(driver);
			headerPage.clickSearchToggleSubMenu(driver);
			headerPage.moveToClaim(driver);
			AdvanceSearchClaimsPage advanceSearchClaimsPage=headerPage.clickAdvancedSearch(driver);
			advanceSearchClaimsPage.enterClaim(driver, testData.getClaimNumber());
			advanceSearchClaimsPage.selectSearchFor(driver, testData.getSearchFor());
			advanceSearchClaimsPage.selectLineofBusiness(driver,testData.getLineOfBusiness());
			advanceSearchClaimsPage.clickIncludeChildGroupsNo(driver);
			advanceSearchClaimsPage.clickCreatedByMenuIcon(driver);
			SearchUsersPage searchUsersPage=advanceSearchClaimsPage.clickSearchforaUser(driver);
			searchUsersPage.enterFirstname(driver, testData.getName());
			searchUsersPage.clickSearch(driver);
			searchUsersPage.clickSelect(driver);
			advanceSearchClaimsPage.clickSearch(driver);
			advanceSearchClaimsPage.verifyClaimantValue(driver);
			advanceSearchClaimsPage.verifyInsuredName(driver);
			advanceSearchClaimsPage.verifyPolicyValue(driver);
			advanceSearchClaimsPage.verifyClaimantName(driver);
			advanceSearchClaimsPage.verifyLossDateValue(driver);
			advanceSearchClaimsPage.verifyStatusValue(driver);
			advanceSearchClaimsPage.clickClaimLink(driver)	;
			SummaryPage SummaryPage=new SummaryPage(driver);
			SummaryPage.verifyBasicsValues(driver);
			SummaryPage.verifyFinaicialsValues(driver);
			SummaryPage.verifyHighRiskIndicatorsValues(driver);
			SummaryPage.verifyLossDateInputValues(driver);
			SummaryPage.verifyLossLocationsInputValues(driver);
			SummaryPage.verifyExposuresValues(driver);
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
	@Test(description="To verify that able to create Exposure Rule in Business setting", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC396(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to create Exposure Rule in Business setting",driver);
		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC396");
		String name= testData.getName();

		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clickAdministrationbutton(driver);
			headerPage.clickBusinessSettingsToggle(driver);
			headerPage.clickBusinessSettings(driver);
			headerPage.clickExposureRules(driver);
			ExposureRulesPage exposureRulesPage = new ExposureRulesPage(driver);
			exposureRulesPage.verifyStatusLabel(driver);
			exposureRulesPage.verifyNameLabel(driver);
			exposureRulesPage.verifyLossTypeIsDisplayed(driver);
			exposureRulesPage.verifyIncidentTypesIsDisplayed(driver);
			exposureRulesPage.verifyJurisdictionsIsDisplayed(driver);
			exposureRulesPage.clickAdd(driver);
			NewExposureRulePage newExposureRulePage = exposureRulesPage.new NewExposureRulePage(driver);
			newExposureRulePage.enterName(driver, name);
			newExposureRulePage.enterDescription(driver, testData.getDescription());
			newExposureRulePage.selectPolicyType(driver, testData.getPolicyType());
			newExposureRulePage.selectIncidentType(driver, testData.getIncidentType());
			newExposureRulePage.clickAdd(driver);
			newExposureRulePage.enterRuleVariableName(driver, name);
			newExposureRulePage.enterRuleVariableDescription(driver, testData.getDescription());
			newExposureRulePage.enterRuleVariableExpression(driver,testData.getRuleVariableExpression());
			newExposureRulePage.clickAddAction(driver);
			newExposureRulePage.selectCoverageType(driver, testData.getCoverageType());
			newExposureRulePage.clickSave(driver);
			exposureRulesPage.clickNameCheckBox(driver, name);
			exposureRulesPage.clickClone(driver);
			newExposureRulePage.clickSave(driver);
			exposureRulesPage.clickExposureRuleNameLink(driver, name);
			exposureRulesPage.clickUpToExposureRules(driver);
			exposureRulesPage.verifyExposureMainPage(driver);
			exposureRulesPage.clickExposureRuleNameLink(driver, name);
			exposureRulesPage.clickDelete(driver);
			exposureRulesPage.verifyclickAddedUserNameIsDeleted(driver, name);
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
	@Test( description="To verify that able to create Reserve Rules in Business setting", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC397(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to create Reserve Rules in Business setting",driver);
		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC397");
		String name= testData.getName();

		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clickAdministrationbutton(driver);
			headerPage.clickBusinessSettingsToggle(driver);
			headerPage.clickBusinessSettings(driver);
			headerPage.clickReserveRules(driver);
			ReserveRulesPage reserveRulesPage = new ReserveRulesPage(driver);
			reserveRulesPage.verifyStatusLabel(driver);
			reserveRulesPage.verifyNameLabel(driver);
			reserveRulesPage.verifyLossTypeIsDisplayed(driver);
			reserveRulesPage.verifyExposureTypeIsDisplayed(driver);
			reserveRulesPage.verifyJurisdictionsIsDisplayed(driver);
			reserveRulesPage.verifyExposureSegmentIsDisplayed(driver);
			reserveRulesPage.verifyTriggerEntityIsDisplayed(driver);
			reserveRulesPage.verifyTriggerActionIsDisplayed(driver);
			reserveRulesPage.clickAdd(driver);
			NewReserveRulePage newReserveRulePage = reserveRulesPage.new NewReserveRulePage(driver);
			newReserveRulePage.enterName(driver, name);
			newReserveRulePage.enterDescription(driver, testData.getDescription());
			newReserveRulePage.selectLossType(driver, testData.getLossType());
			newReserveRulePage.clickAdd(driver);
			newReserveRulePage.enterRuleVariableName(driver, name);
			newReserveRulePage.enterRuleVariableDescription(driver, testData.getDescription());
			newReserveRulePage.enterRuleVariableExpression(driver,testData.getRuleVariableExpression());
			newReserveRulePage.clickAddAction(driver);
			newReserveRulePage.selectCostType(driver, testData.getCostType());
			newReserveRulePage.selectCostCategory(driver, testData.getCostCategory());
			newReserveRulePage.clickSave(driver);
			reserveRulesPage.clickNameCheckBox(driver, name);
			reserveRulesPage.clickClone(driver);
			newReserveRulePage.clickSave(driver);
			reserveRulesPage.clickReserveRuleNameLink(driver, name);
			reserveRulesPage.clickUpToReserveRules(driver);
			reserveRulesPage.verifyReserveMainPage(driver);
			reserveRulesPage.clickReserveRuleNameLink(driver, name);
			reserveRulesPage.clickDelete(driver);
			reserveRulesPage.verifyclickAddedUserNameIsDeleted(driver, name);
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
	@Test(description="To verify that able to create Activity Pattern in Business settings", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC398(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to create Activity Pattern in Business settings",driver);
		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC398");
		String name= testData.getName();
		String activityName= testData.getActivityPatternName();

		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clickAdministrationbutton(driver);
			headerPage.clickBusinessSettingsToggle(driver);
			headerPage.clickActivityPatterns(driver);
			ActivityPatternsPage activityPatternsPage = new ActivityPatternsPage(driver);
			activityPatternsPage.verifyActivitySubjectIsDisplayed(driver);
			activityPatternsPage.verifyActivityClassIsDisplayed(driver);
			activityPatternsPage.verifyActivityTypeIsDisplayed(driver);
			activityPatternsPage.verifyActivityCategoryIsDisplayed(driver);
			activityPatternsPage.verifyActivityPriorityIsDisplayed(driver);
			activityPatternsPage.verifyActivityMandatoryIsDisplayed(driver);
			activityPatternsPage.verifyActivityAutomatedIsDisplayed(driver);
			activityPatternsPage.clickNewActivityPattern(driver);
			NewActivityPatternPage newActivityPatternPage = activityPatternsPage.new NewActivityPatternPage(driver);
			newActivityPatternPage.enterSubject(driver, name);
			newActivityPatternPage.selectCategory(driver,testData.getCategory());
			newActivityPatternPage.enterCode(driver, testData.getCode());
			newActivityPatternPage.selectCalenderImportance(driver,testData.getCalenderImportance());
			newActivityPatternPage.selectCategory(driver,testData.getCategory());
			newActivityPatternPage.enterEdgeEnglish(driver, name);
			newActivityPatternPage.enterEdgePolicyholderEnglish(driver, name);
			newActivityPatternPage.clickUpdate(driver);
			//updating the subject name
			activityPatternsPage.clickActivityPatternSubjectLink(driver, name);
			activityPatternsPage.clickEdit(driver);
			newActivityPatternPage.enterSubject(driver, activityName);
			newActivityPatternPage.clickUpdate(driver);
			activityPatternsPage.clickUptoActivityPattern(driver);
			//verify the subject is updated
			activityPatternsPage.clickActivityPatternSubjectLink(driver, activityName);
			activityPatternsPage.clickEdit(driver);
			activityPatternsPage.verifyActivitySubjectIsUpdated(driver, name);
			newActivityPatternPage.clickUpdate(driver);
			activityPatternsPage.clickUptoActivityPattern(driver);
			//delete subject and verify the subject is deleted
			activityPatternsPage.clickSubjectCheckBox(driver, activityName);
			activityPatternsPage.clickDelete(driver);
			activityPatternsPage.verifyDeletedActivitySubjectNotDisplayed(driver, activityName);

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
	@Test(description="To verify that able to create Business Week in Business settings", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC399(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to create Business Week in Business settings",driver);
		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC399");
		String name= testData.getName();
		String businessWeekName= testData.getActivityPatternName();
		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clickAdministrationbutton(driver);
			headerPage.clickBusinessSettingsToggle(driver);
			headerPage.clickBusinessSettings(driver);
			headerPage.clickBusinessWeek(driver);
			BusinessWeekPage businessWeekPage = new BusinessWeekPage(driver);
			businessWeekPage.clickAddBusinessWeek(driver);
			businessWeekPage.enterName(driver, name);
			businessWeekPage.clickAppliesToAllZones(driver);
			businessWeekPage.enterEdgePolicyholderEnglish(driver, name);
			businessWeekPage.enterEdgeEnglish(driver, name);
			businessWeekPage.clickUpdate(driver);

			businessWeekPage.clickName(driver,name);
			businessWeekPage.clickEdit(driver);
			businessWeekPage.enterName(driver, businessWeekName);
			businessWeekPage.clickUpdate(driver);
			businessWeekPage.clickUpToBusinessWeek(driver);
			businessWeekPage.clickName(driver,businessWeekName);
			businessWeekPage.clickEdit(driver);
			businessWeekPage.verifyBusinessWeekNameIsUpdated(driver, name);
			businessWeekPage.clickUpdate(driver);
			businessWeekPage.clickUpToBusinessWeek(driver);

			businessWeekPage.clickName(driver,businessWeekName);
			businessWeekPage.clickEdit(driver);
			businessWeekPage.enterName(driver, name);
			businessWeekPage.clickCancel(driver);
			businessWeekPage.verifyclickAddedBusinessWeekIsNotDisplayed(driver, name);

			businessWeekPage.clickNameCheckBox(driver, businessWeekName);
			businessWeekPage.clickDelete(driver);	
			businessWeekPage.verifyclickAddedBusinessWeekIsNotDisplayed(driver, businessWeekName);

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
	@Test(description="To verify the Search functionality for commercial package claim using Any party invloved filter", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC344(String browser) throws Exception {

		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC344");

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();

		Log.testCaseInfo("To verify the Search functionality for commercial package claim using Any party invloved filter",driver);

		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			HeaderPage headerPage=new HeaderPage(driver);
			headerPage.clickSearchToggleSubMenu(driver);
			headerPage.moveToClaim(driver);
			AdvanceSearchClaimsPage advanceSearchClaimsPage=headerPage.clickAdvancedSearch(driver);
			advanceSearchClaimsPage.enterClaim(driver, testData.getClaimNumber());
			advanceSearchClaimsPage.selectSearchFor(driver, testData.getSearchFor());
			advanceSearchClaimsPage.clickIncludeChildGroupsNo(driver);
			advanceSearchClaimsPage.clickCreatedByMenuIcon(driver);
			SearchUsersPage searchUsersPage=advanceSearchClaimsPage.clickSearchforaUser(driver);
			searchUsersPage.enterFirstname(driver, testData.getName());
			searchUsersPage.clickSearch(driver);
			searchUsersPage.clickSelect(driver);
			advanceSearchClaimsPage.clickSearch(driver);
			advanceSearchClaimsPage.verifyClaimantValue(driver);
			advanceSearchClaimsPage.verifyInsuredName(driver);
			advanceSearchClaimsPage.verifyPolicyValue(driver);
			advanceSearchClaimsPage.verifyClaimantName(driver);
			advanceSearchClaimsPage.verifyLossDateValue(driver);
			advanceSearchClaimsPage.verifyStatusValue(driver);
			advanceSearchClaimsPage.clickClaimLink(driver)	;
			SummaryPage SummaryPage=new SummaryPage(driver);
			SummaryPage.verifyBasicsValues(driver);
			SummaryPage.verifyFinaicialsValues(driver);
			SummaryPage.verifyHighRiskIndicatorsValues(driver);
			SummaryPage.verifyLossDateInputValues(driver);
			SummaryPage.verifyLossLocationsInputValues(driver);
			SummaryPage.verifyExposuresValues(driver);


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
	@Test(description="To verify the search functionality in activities page using the claim number", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC365(String browser) throws Exception {

		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC365");

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the search functionality in activities page using the claim number",driver);

		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("sdunn", "gw");

			HeaderPage headerPage=new HeaderPage(driver);
			headerPage.clickSearchToggleSubMenu(driver);
			SearchActivitiesPage searchActivitiesPage=headerPage.clickActivitiesSearchButton(driver);
			searchActivitiesPage.enterClaim(driver, testData.getClaimNumber());
			searchActivitiesPage.clickSearch(driver);
			searchActivitiesPage.verifyInsuredName(driver);
			searchActivitiesPage.verifyStatusValue(driver);
			searchActivitiesPage.verifySubjectValue(driver);

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
	@Test(description="To verify the search functionality in recoveries page using the claim number", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC366(String browser) throws Exception {

		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC366");
		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the search functionality in recoveries page using the claim number",driver);

		try {	

			String claimNumber = CCDataGenerator.createClaimForPersonalAuto(testData.getPolicyNumber());
			
			PersonalAutoStepsImpl cc = PersonalAutoSteps.create();

			cc.loginIntoTheApplication("su", "gw");
			
			// Check Data Creation
			
			String insuredName = cc.searchClaim(PersonalAutoFeatures.SearchClaim.builder()
					.claimNo(claimNumber)
					.build());
			
			cc.addCoveragesByType(PersonalAutoFeatures.ChooseCoveragesByType.builder(Coverages.COVERAGE_C)
					.coverage_C(CoverageType_C.builder()
							.collision(Coverage.builder()
									.claimant(insuredName)
									.claimantType(testData.getClaimantType())
									.make(testData.getMake())
									.model(testData.getModel())
									.year(testData.getYear())
									.vehicleName(testData.getVehicleName())
									.driverName(insuredName)
									.lossOccurred(testData.getLossOccurred())
									.build())
							.build())
					.coverage(testData.getCoverageType())
					.build());
			
			cc.paymentChecks(PersonalAutoFeatures.PaymentOptions.builder()
					.reserveLine(testData.getReserveLine())
					.paymentType(PersonalAutoConstants.PaymentType.CHECK)
					.costType(testData.getCostType())
					.costCategory(testData.getCostCategory())
					.payment(testData.getPaymentType())
					.recoveryCategory(testData.getRecoveryCategory())
					.amount(testData.getAmount())
					.build());
			
			// Test case Step
			
			HeaderPage headerPage=new HeaderPage(driver);
			headerPage.clickSearchToggleSubMenu(driver);
			SearchChecksPage searachChecksPage=headerPage.clickCheckButton(driver);
			searachChecksPage.enterClaimNumber(driver, claimNumber);
			searachChecksPage.clickSearch(driver);
			searachChecksPage.verifyPayTo(driver);
			searachChecksPage.verifyStatusValue(driver);
			searachChecksPage.verifyAmountvalue(driver);

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
	@Test(description="To verify the search functionality in checks page using the claim number", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC367(String browser) throws Exception {

		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC367");

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the search functionality in checks page using the claim number",driver);

		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("sdunn", "gw");
			
			// Data : Recovery Creation
			cc.searchClaim(SearchClaim.builder()
					.claimNo(testData.getClaimNumber())
					.build());
			
			cc.paymentChecks(PaymentOptions.builder()
					.paymentType(PaymentType.RECOVERY)
					.reserveLine(testData.getReserveLine())
					.recoveryCategory(testData.getRecoveryCategory())
					.amount(testData.getAmount())
					.costType(testData.getCostType())
					.costCategory(testData.getCostCategory())
					.build());

			// Test case Steps
			HeaderPage headerPage=new HeaderPage(driver);
			headerPage.clickSearchToggleSubMenu(driver);
			SearchRecoveriesPage searchRecoveriesPage=headerPage.clickRecoveriesButton(driver);
			searchRecoveriesPage.enterClaimNumber(driver, testData.getClaimNumber());
			
			searchRecoveriesPage.clickSearch(driver);
			searchRecoveriesPage.verifyRecoveryCategoryvalue(driver);
			searchRecoveriesPage.verifyStatusValue(driver);
			searchRecoveriesPage.verifyAmountvalue(driver);

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
	@Test(description="To verify the Search functionality for auto claim using Insured filter", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC346(String browser) throws Exception {
		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC346");

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the Search functionality for auto claim using Insured filter",driver);

		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("sulveling", "gw");

			HeaderPage headerPage=new HeaderPage(driver);
			headerPage.clickSearchToggleSubMenu(driver);
			headerPage.moveToClaim(driver);
			AdvanceSearchClaimsPage advanceSearchClaimsPage=headerPage.clickAdvancedSearch(driver);
			advanceSearchClaimsPage.enterClaim(driver, testData.getClaimNumber());
			advanceSearchClaimsPage.selectSearchFor(driver, testData.getSearchFor());
			advanceSearchClaimsPage.clickSearch(driver);
			advanceSearchClaimsPage.verifyClaimantValue(driver);
			advanceSearchClaimsPage.verifyInsuredName(driver);
			advanceSearchClaimsPage.verifyPolicyValue(driver);
			advanceSearchClaimsPage.verifyClaimantName(driver);
			advanceSearchClaimsPage.verifyLossDateValue(driver);
			advanceSearchClaimsPage.verifyStatusValue(driver);
			advanceSearchClaimsPage.clickClaimLink(driver)	;
			SummaryPage SummaryPage=new SummaryPage(driver);
			SummaryPage.verifyBasicsValues(driver);
			SummaryPage.verifyFinaicialsValues(driver);
			SummaryPage.verifyHighRiskIndicatorsValues(driver);
			SummaryPage.verifyLossDateInputValues(driver);
			SummaryPage.verifyLossLocationsInputValues(driver);
			SummaryPage.verifyExposuresValues(driver);


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
	@Test(description="To verify that able to create Catastrophes in Business settings", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC400(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to create Catastrophes in Business settings",driver);
		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC400");
		String name= testData.getName();
		String catastrophes= testData.getCatastrophes();
		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clickAdministrationbutton(driver);
			headerPage.clickBusinessSettingsToggle(driver);
			headerPage.clickBusinessSettings(driver);
			headerPage.clickCatastrophes(driver);
			CatastrophesPage catastrophesPage = new CatastrophesPage(driver);
			catastrophesPage.clickAddCatastrophe(driver);

			NewCatastrophePage newCatastrophePage = catastrophesPage.new NewCatastrophePage(driver);
			newCatastrophePage.enterName(driver, name);
			newCatastrophePage.enterDescription(driver, testData.getDescription());
			newCatastrophePage.enterCATNo(driver, testData.getCode());
			newCatastrophePage.selectType(driver, testData.getType());
			newCatastrophePage.enterBeginDate(driver,testData.getFromDate() );
			newCatastrophePage.enterEndDate(driver,testData.getToDate());
			newCatastrophePage.enterDescriptionEdgeEnglish(driver,  testData.getEdgePolicyholder());
			newCatastrophePage.enterDescriptionEdgePolicyholderEnglish(driver, testData.getEdgePolicyholder());
			newCatastrophePage.enterNameEdgeEnglish(driver, testData.getFirstName());
			newCatastrophePage.enterNameEdgePolicyholderEnglish(driver, testData.getFirstName());
			newCatastrophePage.enterEndDate(driver,testData.getToDate());
			newCatastrophePage.enterDescription(driver, testData.getDescription());
			newCatastrophePage.clickUpdate(driver);

			catastrophesPage.clickCatastrophesNameLink(driver, name);
			catastrophesPage.clickEdit(driver);
			newCatastrophePage.enterName(driver, catastrophes);
			newCatastrophePage.enterName(driver, catastrophes);
			newCatastrophePage.clickUpdate(driver);
			catastrophesPage.clickUptoCatastrophes(driver);
			catastrophesPage.verifyCatastrophesMainPage(driver);
			catastrophesPage.clickCatastrophesNameLink(driver, catastrophes);
			catastrophesPage.clickEdit(driver);
			newCatastrophePage.verifyCatastrophesNameIsUpdated(driver, catastrophes);
			newCatastrophePage.clickCancel(driver);
			catastrophesPage.verifyCatastrophesMainPage(driver);
			catastrophesPage.clickCatastrophesNameLink(driver, catastrophes);
			catastrophesPage.clickEdit(driver);
			newCatastrophePage.clickCancel(driver);

			catastrophesPage.clickNamesCheckBox(driver, catastrophes);
			catastrophesPage.clickDeactivate(driver);
			catastrophesPage.verifyCatastrophesStatusIsInActive(driver, catastrophes);

			catastrophesPage.clickNameCheckBox(driver, catastrophes);
			catastrophesPage.clickActivate(driver);
			catastrophesPage.verifyCatastrophesStatusIsInActive(driver, catastrophes);


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
	@Test(description="To verify that able to search the Workflow in Monitoring", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC401(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the Search functionality for Commercial Auto claim with respective policy number using Advanced Search",driver);

		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC401");

		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			HeaderPage headerPage=new HeaderPage(driver);
			headerPage.clickAdministrationbutton(driver);
			headerPage.clickToggleMonitoringSubmenu(driver);
			WorkflowsPage workflowsPage = headerPage.clickWorkflows(driver);
			workflowsPage.selectWorkflowType(driver, testData.getWorkflowType());
			workflowsPage.enterStartDateRangeFrom(driver, testData.getFromDate());
			workflowsPage.enterStartDateRangeTo(driver, testData.getToDate());
			workflowsPage.enterUpdateDateRangeFrom(driver,testData.getFromDate());
			workflowsPage.enterUpdateDateRangeTo(driver, testData.getToDate());
			workflowsPage.selectHandler(driver, testData.getHandler());
			workflowsPage.selectStatus(driver, testData.getStatus());
			workflowsPage.clickSearch(driver);
			workflowsPage.verifyZeroResultError(driver);
			workflowsPage.clickReset(driver);
			workflowsPage.verifyDateFieldsAreResetted(driver);
			workflowsPage.verifyDefaultSelectedValueWorkflowType(driver, testData.getDefaultValue());
			workflowsPage.verifyDefaultSelectedValueHandler(driver,testData.getDefaultValue());
			workflowsPage.verifyDefaultSelectedValueStatus(driver, testData.getDefaultValue());
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
	@Test(description="To verify that able to search the Workflow Statistics in Monitoring", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC402(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to search the Workflow Statistics in Monitoring",driver);

		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC402");

		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			HeaderPage headerPage=new HeaderPage(driver);
			headerPage.clickAdministrationbutton(driver);
			headerPage.clickToggleMonitoringSubmenu(driver);
			WorkflowStatisticsPage WorkflowStatisticsPage = headerPage.clickWorkflowStatistics(driver);
			WorkflowStatisticsPage.selectWorkflowType(driver, testData.getWorkflowType());
			WorkflowStatisticsPage.enterFrom(driver, testData.getFromDate());
			WorkflowStatisticsPage.enterTo(driver,testData.getToDate());
			WorkflowStatisticsPage.clickSearch(driver);
			WorkflowStatisticsPage.verifyZeroResultError(driver);
			WorkflowStatisticsPage.clickReset(driver);
			WorkflowStatisticsPage.verifyDateFieldsAreResetted(driver);
			WorkflowStatisticsPage.verifyDefaultSelectedValueWorkflowType(driver,testData.getDefaultValue());
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
	@Test(description="To verify that able to run the Activity Escalation Batch process", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC264(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to run the Activity Escalation Batch process",driver);

		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC264");

		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("su", "gw"); //Don't change the username here,su alone having batchprocess 

			HeaderPage headerPage=new HeaderPage(driver);
			BatchProcessInfoPage batchProcessInfoPage=headerPage.clickGotoBatchProcess(driver);
			batchProcessInfoPage.clickBatchProcessRunButton(driver,testData.getBatchProcessName());
			batchProcessInfoPage.verifyBatchProcessLastRun(driver,testData.getBatchProcessName());
			batchProcessInfoPage.verifyBatchProcessLastRunStatus(driver,testData.getBatchProcessName());
			batchProcessInfoPage.verfiyDefaultDropDown(driver, testData.getBatchProcessDropDown());
			batchProcessInfoPage.verifyRefreshButton(driver);
			batchProcessInfoPage.verifyDownloadButton(driver);
			batchProcessInfoPage.verifySchedulerButton(driver);
			batchProcessInfoPage.verifyBatchProcessNextScheduledRun(driver,testData.getBatchProcessName());
			batchProcessInfoPage.verifyBatchProcessSchedule(driver,testData.getBatchProcessName());

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
	@Test(description="To verify that able to run the Aggregate Limit Calculations Batch process", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC265(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to run the Aggregate Limit Calculations Batch process",driver);

		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC265");

		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("su", "gw"); //Don't change the username here, su alone having batchprocess

			HeaderPage headerPage=new HeaderPage(driver);
			BatchProcessInfoPage batchProcessInfoPage=headerPage.clickGotoBatchProcess(driver);
			batchProcessInfoPage.clickBatchProcessRunButton(driver,testData.getBatchProcessName());
			batchProcessInfoPage.verifyBatchProcessLastRun(driver,testData.getBatchProcessName());
			batchProcessInfoPage.verifyBatchProcessLastRunStatus(driver,testData.getBatchProcessName());
			batchProcessInfoPage.verifyNextScheduledRunAggregateLimit(driver);
			batchProcessInfoPage.verifyScheduleActionsAggregateLimit(driver);

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
	@Test(description="To verify that able to run the Archive Reference Tracking Sync Batch process", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC266(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to run the Archive Reference Tracking Sync Batch process",driver);

		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC266");

		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			HeaderPage headerPage=new HeaderPage(driver);
			BatchProcessInfoPage batchProcessInfoPage=headerPage.clickGotoBatchProcess(driver);
			batchProcessInfoPage.clickBatchProcessRunButton(driver,testData.getBatchProcessName());
			batchProcessInfoPage.verifyBatchProcessLastRunStatus(driver,testData.getBatchProcessName());
			DownloadHistoryPage downloadHistoryPage=batchProcessInfoPage.clickBatchProcessDownloadHistory(driver,testData.getBatchProcessName());
			downloadHistoryPage.enterStartdate(driver, testData.getEffectiveDate());
			downloadHistoryPage.enterEnddate(driver, testData.getEffectiveDate());
			downloadHistoryPage.clickDownload(driver);
			downloadHistoryPage.clickReturntoBatchButton(driver);
			
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
	@Test(description="To verify that able to run the Bulk Invoice Escalation Batch process", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC267(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to run the Bulk Invoice Escalation Batch process",driver);

		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC267");

		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			HeaderPage headerPage=new HeaderPage(driver);
			BatchProcessInfoPage batchProcessInfoPage=headerPage.clickGotoBatchProcess(driver);
			batchProcessInfoPage.clickBatchProcessRunButton(driver,testData.getBatchProcessName());
			batchProcessInfoPage.verifyBatchProcessLastRun(driver,testData.getBatchProcessName());
			batchProcessInfoPage.verifyBatchProcessLastRunStatus(driver,testData.getBatchProcessName());
			batchProcessInfoPage.verifyRefreshButton(driver);
			batchProcessInfoPage.verifyDownloadButton(driver);
			batchProcessInfoPage.verifySchedulerButton(driver);
			batchProcessInfoPage.verifyBatchProcessNextScheduledRun(driver,testData.getBatchProcessName());
			batchProcessInfoPage.verifyBatchProcessSchedule(driver,testData.getBatchProcessName());

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
	@Test(description="To verify that able to run the Bulk Invoice Workflow Monitor batch process", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC268(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to run the Bulk Invoice Workflow Monitor batch process",driver);

		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC267");

		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("su", "gw"); //Don't change the username here, su alone having batchprocess

			HeaderPage headerPage=new HeaderPage(driver);
			BatchProcessInfoPage batchProcessInfoPage=headerPage.clickGotoBatchProcess(driver);
			batchProcessInfoPage.clickBatchProcessRunButton(driver,testData.getBatchProcessName());
			batchProcessInfoPage.verifyBatchProcessLastRun(driver,testData.getBatchProcessName());
			batchProcessInfoPage.verifyBatchProcessLastRunStatus(driver,testData.getBatchProcessName());
			batchProcessInfoPage.verifyRefreshButton(driver);
			batchProcessInfoPage.verifyDownloadButton(driver);
			batchProcessInfoPage.verifySchedulerButton(driver);
			batchProcessInfoPage.verifyBatchProcessNextScheduledRun(driver,testData.getBatchProcessName());
			batchProcessInfoPage.verifyBatchProcessSchedule(driver,testData.getBatchProcessName());

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
	@Test(description="To verify the activity assignment by using Use automated assignment", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC196(String browser) throws Exception {
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the activity assignment by using Use automated assignment",driver);

		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC196");

		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clicktoggleClaimSubMenu(driver);
			headerPage.clickClaim(driver);
			ActionsPage actionsPage=new ActionsPage(driver);
			actionsPage.clickActions(driver);
			actionsPage.clickInterview(driver);
			NewActivityClaimPage newActivityClaimPage=actionsPage.clickStatementFromWitness(driver);
			newActivityClaimPage.selectAssignTo(driver, testData.getStatus());
			newActivityClaimPage.clickUpdate(driver);
			headerPage.clicktoggleDesktopSubMenu(driver);
			headerPage.clickActivitiesButton(driver);
			ActivitiesPage activitiesPage=new ActivitiesPage(driver);
			activitiesPage.selectDesktopActivitiesFilter(driver, testData.getActivityPatternName());
			activitiesPage.clickActivity(driver);
			WorkplanPage workplanPage = new WorkplanPage(driver);
			workplanPage.verifyEditbtn(driver);
			workplanPage.verifyCompletebtn(driver);
			workplanPage.verifySkipbtn(driver);
			workplanPage.verifyAssignbtn(driver);
			workplanPage.verifyLinkDocumentbtn(driver);
			workplanPage.verifyViewNotesbtn(driver);
			workplanPage.verifyCloseWorksheetbtn(driver);
			workplanPage.clickCloseWorksheetbtn(driver);
			workplanPage.selectActivity_1(driver);
			workplanPage.selectActivity_2(driver);
			workplanPage.clickAssign(driver);
			AssignActivitiesPage assignActivitiesPage = new AssignActivitiesPage(driver);

			assignActivitiesPage.selectFromList(driver,testData.getSelectFromList());

			assignActivitiesPage.clickAssignmentPopupScreen_ButtonButton(driver);
			
			String adjusterName = workplanPage.getAdjusterName(driver);

			workplanPage.verifyAssignedTo(driver, adjusterName);

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
	@Test(description="To verify that able to add Holidays under Business Settings", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC435(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to add Holidays under Business Settings",driver);
		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC435");
		String fromDate = testData.getFromDate();
		String name = testData.getName();
		String hoildayDate = testData.setDate();
		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			HeaderPage headerPage=new HeaderPage(driver);
			headerPage.clickAdministrationbutton(driver);
			headerPage.clickBusinessSettingsToggle(driver);
			headerPage.clickBusinessSettings(driver);
			headerPage.clickBusinessHoildays(driver);
			HolidaysPage holidaysPage = new HolidaysPage(driver);
			holidaysPage.clickAddHoliday(driver);
			AddHolidayPage addHolidayPage = holidaysPage.new AddHolidayPage(driver);
			addHolidayPage.enterHoliday(driver,name);
			addHolidayPage.enterDate(driver, fromDate);
			addHolidayPage.enterNameEdgePolicyholderEnglish(driver, testData.getEdgePolicyholder());
			addHolidayPage.enterNameEdgeEnglish(driver,testData.getEdgeEnglish());
			addHolidayPage.clickUpdate(driver);

			holidaysPage.clickHolidayNameLink(driver, name);
			holidaysPage.verifyEditButtonIsDisplayed(driver);
			holidaysPage.clickEdit(driver);
			addHolidayPage.verifyUpdateButtonIsDisplayed(driver);
			addHolidayPage.verifyCancelButtonIsDisplayed(driver);
			addHolidayPage.enterDate(driver, testData.setDate());
			addHolidayPage.clickUpdate(driver);
			holidaysPage.clickUptoHoliday(driver);
			holidaysPage.verifyHolidayMainPage(driver);
			holidaysPage.verifyHolidayDateUpdated(driver, name,hoildayDate);
			holidaysPage.selectCreatedHoliday(driver, name);
			holidaysPage.clickDelete(driver);

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
	@Test(description="To verify that able to update Metrics & Thresholds", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC437(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to update Metrics & Thresholds",driver);
		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC437");
		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			HeaderPage headerPage=new HeaderPage(driver);
			headerPage.clickAdministrationbutton(driver);
			headerPage.clickBusinessSettingsToggle(driver);
			headerPage.clickBusinessSettings(driver);
			headerPage.clickMetricsThresholds(driver);
			MetricsThresholdsPage metricsThresholdsPage = new MetricsThresholdsPage(driver);
			metricsThresholdsPage.selectPolicyType(driver, testData.getPolicyType());
			String daysOpenValue = metricsThresholdsPage.getDaysOpenValue(driver);
			String daysSinceLastViewAdjuster = metricsThresholdsPage.getDaysSinceLastViewAdjuster(driver);
			String netTotalIncurredValue = metricsThresholdsPage.getNetTotalIncurredValue(driver);
			metricsThresholdsPage.clickEdit(driver);
			metricsThresholdsPage.enterDaysOpenTargetValue(driver, testData.getDays());
			metricsThresholdsPage.enterDaysSinceLastViewAdjuster(driver,testData.getDays());
			metricsThresholdsPage.enterNetTotalIncurred(driver, testData.getAmount());
			metricsThresholdsPage.clickUpdate(driver);
			metricsThresholdsPage.verifyDaysOpenValueIsUpdated(driver, daysOpenValue);
			metricsThresholdsPage.verifyDaysSinceLastViewAdjusterIsUpdated(driver, daysSinceLastViewAdjuster);
			metricsThresholdsPage.verifyNetTotalIncurredValueIsUpdated(driver, netTotalIncurredValue);
			metricsThresholdsPage.clickExposureMetricLimits(driver);
			metricsThresholdsPage.clickEdit(driver);
			metricsThresholdsPage.enterDaysOpenExposureMetricDefaultLimit(driver, testData.getDaysOpen());
			metricsThresholdsPage.enterPaidLossCostsAsPercentageOfTotalPaid(driver, testData.getDaysOpen());
			metricsThresholdsPage.clickUpdate(driver);
			String exposureMetricLimitDaysOpenValue = metricsThresholdsPage.getDaysOpenValue(driver);
			String paidLossCostsAsPercentageOfTotalPaid = metricsThresholdsPage.getPaidLossCostsAsPercentageOfTotalPaid(driver);

			metricsThresholdsPage.clickEdit(driver);
			metricsThresholdsPage.enterDaysOpenExposureMetricDefaultLimit(driver, testData.getDays());
			metricsThresholdsPage.enterPaidLossCostsAsPercentageOfTotalPaid(driver, testData.getDays());
			metricsThresholdsPage.clickUpdate(driver);
			metricsThresholdsPage.verifyDaysOpenValueIsUpdated(driver, exposureMetricLimitDaysOpenValue);
			metricsThresholdsPage.verifyPaidLossCostsAsPercentageOfTotalPaidIsUpdated(driver, paidLossCostsAsPercentageOfTotalPaid);

			metricsThresholdsPage.clickLargeLossThreshold(driver);
			String largeLossIndicatorAmount = metricsThresholdsPage.getLargeLossIndicatorAmount(driver);
			metricsThresholdsPage.clickEdit(driver);
			metricsThresholdsPage.enterLargeLossIndicator(driver, testData.getAmount());
			metricsThresholdsPage.clickUpdate(driver);
			metricsThresholdsPage.verifyAmountIsPresent(driver, largeLossIndicatorAmount);
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
	@Test(description="To verify that able to update Reinsurance Thresholds", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC438(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to update Reinsurance Thresholds",driver);
		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC438");
		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			HeaderPage headerPage=new HeaderPage(driver);
			headerPage.clickAdministrationbutton(driver);
			headerPage.clickBusinessSettingsToggle(driver);
			headerPage.clickBusinessSettings(driver);
			headerPage.clickReinsuranceThresholds(driver);
			ReinsuranceThresholdsPage reinsuranceThresholdsPage = new ReinsuranceThresholdsPage(driver);
					
			reinsuranceThresholdsPage.clickEdit(driver);
			reinsuranceThresholdsPage.clickAdd(driver);
			reinsuranceThresholdsPage.selectAddNewTreatyType(driver,testData.getTreatyType());
			reinsuranceThresholdsPage.selectAddNewPolicyType(driver,testData.getPolicyType());
			reinsuranceThresholdsPage.enterAddNewThresholdValue(driver,testData.getThresholdValue());
			reinsuranceThresholdsPage.enterAddNewReportingThreshold(driver, testData.getReportingThreshold());
			reinsuranceThresholdsPage.clickUpdate(driver);

			reinsuranceThresholdsPage.clickEdit(driver);
			reinsuranceThresholdsPage.clickAddLossCause(driver);
			reinsuranceThresholdsPage.selectAddNewLossCause(driver,testData.getLossCause());
			reinsuranceThresholdsPage.clickAddCoverageType(driver);
			reinsuranceThresholdsPage.selectAddNewCoverageType(driver,testData.getCoverageType());
			reinsuranceThresholdsPage.clickUpdate(driver);
			
			int beforeAddingLossCauseTableRowSize = reinsuranceThresholdsPage.getNumOfRowsInLossCauseTableBeforeAdding(driver);
			int beforeAddingCoverageTypeTableRowSize = reinsuranceThresholdsPage.getNumOfRowsInCoverageTypeTableBeforeAdding(driver);
			reinsuranceThresholdsPage.clickEdit(driver);
			reinsuranceThresholdsPage.enterAddNewThresholdValue(driver,testData.getThresholdValue());
			reinsuranceThresholdsPage.clickUpdate(driver);
			reinsuranceThresholdsPage.clickEdit(driver);
			reinsuranceThresholdsPage.clickLastAddedLossCauseCheckBox(driver);
			reinsuranceThresholdsPage.clickLossCauseRemove(driver);
			reinsuranceThresholdsPage.clickLastAddedCoverageTypeCheckBox(driver);
			reinsuranceThresholdsPage.clickCoveragesRemove(driver);
			reinsuranceThresholdsPage.clickUpdate(driver);
			
			reinsuranceThresholdsPage.verifyLossCauseListIsUpdatedByRowSize(driver, beforeAddingLossCauseTableRowSize);
			reinsuranceThresholdsPage.verifyCoverageTypeListIsUpdatedByRowSize(driver, beforeAddingCoverageTypeTableRowSize);
			
			reinsuranceThresholdsPage.clickEdit(driver);
			reinsuranceThresholdsPage.clickReinsuranceThresholdCheckBox(driver);
			reinsuranceThresholdsPage.clickRemove(driver);
			reinsuranceThresholdsPage.clickUpdate(driver);
		
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
	@Test(description="To verify that able to update Benefit Parameters", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC439(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to update Benefit Parameters",driver);
		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC439");
		String jurisdiction = testData.getJurisdiction();
		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			HeaderPage headerPage=new HeaderPage(driver);
			headerPage.clickAdministrationbutton(driver);
			headerPage.clickBusinessSettingsToggle(driver);
			headerPage.clickToggleWCParameters(driver);
			headerPage.clickWCBenefitParameter(driver);
			BenefitsParametersPage benefitParametersPage = new BenefitsParametersPage(driver);

			benefitParametersPage.clickAdd(driver);
			BenefitParameterDetailPage benefitParameterDetailPage = new BenefitParameterDetailPage(driver);
			benefitParameterDetailPage.selectJurisdiction(driver,jurisdiction);
			benefitParameterDetailPage.enterStartDate(driver, testData.getFromDate());
			benefitParameterDetailPage.enterEndDate(driver, testData.getToDate());
			benefitParameterDetailPage.clickUpdate(driver);
			benefitParametersPage.verifyAddedJurisdictionIsDisplayed(driver, jurisdiction);
			benefitParametersPage.clickJurisdictionCheckBox(driver,jurisdiction);
			benefitParametersPage.clickRemove(driver);

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
	@Test(description="To verify the activity assignment by using Claim/Exposure Owner", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC197(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the activity assignment by using Claim/Exposure Owner",driver);

		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC197");

		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clicktoggleClaimSubMenu(driver);
			headerPage.clickClaim(driver);
			ActionsPage actionsPage=new ActionsPage(driver);
			actionsPage.clickActions(driver);
			actionsPage.clickInterview(driver);
			NewActivityClaimPage newActivityClaimPage=actionsPage.clickStatementFromWitness(driver);
			newActivityClaimPage.selectAssignTo(driver, testData.getStatus());
			newActivityClaimPage.clickUpdate(driver);
			headerPage.clicktoggleDesktopSubMenu(driver);
			headerPage.clickActivitiesButton(driver);
			ActivitiesPage activitiesPage=new ActivitiesPage(driver);
			activitiesPage.selectDesktopActivitiesFilter(driver, testData.getActivityPatternName());
			activitiesPage.clickActivity(driver);
			WorkplanPage workplanPage = new WorkplanPage(driver);
			workplanPage.verifyEditbtn(driver);
			workplanPage.verifyCompletebtn(driver);
			workplanPage.verifySkipbtn(driver);
			workplanPage.verifyAssignbtn(driver);
			workplanPage.verifyLinkDocumentbtn(driver);
			workplanPage.verifyViewNotesbtn(driver);
			workplanPage.verifyCloseWorksheetbtn(driver);
			workplanPage.clickCloseWorksheetbtn(driver);
			workplanPage.selectActivity_1(driver);
			workplanPage.clickAssign(driver);
			AssignActivitiesPage assignActivitiesPage = new AssignActivitiesPage(driver);

			assignActivitiesPage.selectFromList(driver,testData.getSelectFromList());
			
			assignActivitiesPage.clickAssignmentPopupScreen_ButtonButton(driver);

			String adjusterName = workplanPage.getAdjusterName(driver);

			workplanPage.verifyAssignedTo(driver, adjusterName);

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
	@Test(description="To verify the activity assignment by using Super User", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC198(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the activity assignment by using Super User",driver);

		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC198");

		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clicktoggleClaimSubMenu(driver);
			headerPage.clickClaim(driver);
			ActionsPage actionsPage=new ActionsPage(driver);
			actionsPage.clickActions(driver);
			actionsPage.clickInterview(driver);
			NewActivityClaimPage newActivityClaimPage=actionsPage.clickStatementFromWitness(driver);
			newActivityClaimPage.selectAssignTo(driver, testData.getStatus());
			newActivityClaimPage.clickUpdate(driver);
			headerPage.clicktoggleDesktopSubMenu(driver);
			headerPage.clickActivitiesButton(driver);
			ActivitiesPage activitiesPage=new ActivitiesPage(driver);
			activitiesPage.selectDesktopActivitiesFilter(driver, testData.getActivityPatternName());
			activitiesPage.clickActivity(driver);
			WorkplanPage workplanPage = new WorkplanPage(driver);
			workplanPage.verifyEditbtn(driver);
			workplanPage.verifyCompletebtn(driver);
			workplanPage.verifySkipbtn(driver);
			workplanPage.verifyAssignbtn(driver);
			workplanPage.verifyLinkDocumentbtn(driver);
			workplanPage.verifyViewNotesbtn(driver);
			workplanPage.verifyCloseWorksheetbtn(driver);
			workplanPage.clickCloseWorksheetbtn(driver);
			workplanPage.selectActivity_1(driver);
			workplanPage.clickAssign(driver);
			AssignActivitiesPage assignActivitiesPage = new AssignActivitiesPage(driver);

			assignActivitiesPage.selectFromList(driver,testData.getSelectFromList());

			assignActivitiesPage.clickAssignmentPopupScreen_ButtonButton(driver);
			//verification
			workplanPage.verifyAssignedTo(driver, testData.getAssignedTo());

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
	@Test(description="To verify the activity assignment by using Super Visor", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC199(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the activity assignment by using Super Visor",driver);

		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC199");

		try {	

			NonLobImpl cc = NonLobSteps.create();
			cc.loginIntoTheApplication("su", "gw");

			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clicktoggleClaimSubMenu(driver);
			headerPage.clickClaim(driver);
			ActionsPage actionsPage=new ActionsPage(driver);
			actionsPage.clickActions(driver);
			actionsPage.clickInterview(driver);
			NewActivityClaimPage newActivityClaimPage=actionsPage.clickStatementFromWitness(driver);
			newActivityClaimPage.selectAssignTo(driver, testData.getStatus());
			newActivityClaimPage.clickUpdate(driver);
			headerPage.clicktoggleDesktopSubMenu(driver);
			headerPage.clickActivitiesButton(driver);
			ActivitiesPage activitiesPage=new ActivitiesPage(driver);
			activitiesPage.selectDesktopActivitiesFilter(driver, testData.getActivityPatternName());
			activitiesPage.clickActivity(driver);
			WorkplanPage workplanPage = new WorkplanPage(driver);
			workplanPage.verifyEditbtn(driver);
			workplanPage.verifyCompletebtn(driver);
			workplanPage.verifySkipbtn(driver);
			workplanPage.verifyAssignbtn(driver);
			workplanPage.verifyLinkDocumentbtn(driver);
			workplanPage.verifyViewNotesbtn(driver);
			workplanPage.verifyCloseWorksheetbtn(driver);
			workplanPage.clickCloseWorksheetbtn(driver);
			workplanPage.selectActivity_1(driver);
			workplanPage.selectActivity_2(driver);
			workplanPage.clickAssign(driver);
			AssignActivitiesPage assignActivitiesPage = new AssignActivitiesPage(driver);

			assignActivitiesPage.selectSearchByDistanceFromALocation(driver);
			
			assignActivitiesPage.enterFirstname(driver, testData.getFirstName());
			
			assignActivitiesPage.enterLastname(driver, testData.getLastName());
			
			assignActivitiesPage.clickSearch(driver);

			assignActivitiesPage.clickAssign(driver);
			//verification
			workplanPage.verifyAssignedTo(driver, testData.getAssignedTo());

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
	@Test(description="To verify the activity assignment by using FNOL- Acme insurance", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC200(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the activity assignment by using FNOL- Acme insurance",driver);

		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC200");

		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clicktoggleClaimSubMenu(driver);
			headerPage.clickClaim(driver);
			ActionsPage actionsPage=new ActionsPage(driver);
			actionsPage.clickActions(driver);
			actionsPage.clickInterview(driver);
			NewActivityClaimPage newActivityClaimPage=actionsPage.clickStatementFromWitness(driver);
			newActivityClaimPage.selectAssignTo(driver, testData.getStatus());
			newActivityClaimPage.clickUpdate(driver);
			headerPage.clicktoggleDesktopSubMenu(driver);
			headerPage.clickActivitiesButton(driver);
			ActivitiesPage activitiesPage=new ActivitiesPage(driver);
			activitiesPage.selectDesktopActivitiesFilter(driver, testData.getActivityPatternName());
			activitiesPage.clickActivity(driver);
			WorkplanPage workplanPage = new WorkplanPage(driver);
			workplanPage.verifyEditbtn(driver);
			workplanPage.verifyCompletebtn(driver);
			workplanPage.verifySkipbtn(driver);
			workplanPage.verifyAssignbtn(driver);
			workplanPage.verifyLinkDocumentbtn(driver);
			workplanPage.verifyViewNotesbtn(driver);
			workplanPage.verifyCloseWorksheetbtn(driver);
			workplanPage.clickCloseWorksheetbtn(driver);
			workplanPage.selectActivity_1(driver);
			workplanPage.selectActivity_2(driver);
			workplanPage.clickAssign(driver);
			AssignActivitiesPage assignActivitiesPage = new AssignActivitiesPage(driver);

			assignActivitiesPage.selectFromList(driver,testData.getSelectFromList());

			assignActivitiesPage.clickAssignmentPopupScreen_ButtonButton(driver);
			//verification
			workplanPage.verifyAssignedTo(driver, testData.getAssignedTo());

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
	@Test(description="To verify the activity assignment by using Search by location", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC201(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the activity assignment by using Search by location",driver);

		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC201");

		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clicktoggleClaimSubMenu(driver);
			headerPage.clickClaim(driver);
			ActionsPage actionsPage=new ActionsPage(driver);
			actionsPage.clickActions(driver);
			actionsPage.clickInterview(driver);
			NewActivityClaimPage newActivityClaimPage=actionsPage.clickStatementFromWitness(driver);
			newActivityClaimPage.selectAssignTo(driver, testData.getStatus());
			newActivityClaimPage.clickUpdate(driver);
			headerPage.clicktoggleDesktopSubMenu(driver);
			headerPage.clickActivitiesButton(driver);
			ActivitiesPage activitiesPage=new ActivitiesPage(driver);
			activitiesPage.selectDesktopActivitiesFilter(driver, testData.getActivityPatternName());
			activitiesPage.clickActivity(driver);
			WorkplanPage workplanPage = new WorkplanPage(driver);
			workplanPage.clickCloseWorksheetbtn(driver);
			workplanPage.selectActivity_1(driver);
			workplanPage.clickAssign(driver);
			AssignActivitiesPage assignActivitiesPage = new AssignActivitiesPage(driver);
			assignActivitiesPage.selectSearchByLocation(driver);
			assignActivitiesPage.selectCountry(driver, testData.getCountry());
			assignActivitiesPage.clickSearch(driver);
			assignActivitiesPage.clickSelect(driver);
			activitiesPage.clickActivity(driver);
			assignActivitiesPage.verifyAssignedTo(driver);
			assignActivitiesPage.verifyAssignedGroup(driver);
			assignActivitiesPage.verifyAssignedBy(driver);
			assignActivitiesPage.verifyAssignDate(driver);
			//verification
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
	@Test(description="To verify the activity assignment by using Search by distance from a location", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC202(String browser) throws Exception {

		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC202");
		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the activity assignment by using Search by distance from a location",driver);


		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			HeaderPage headerPage=new HeaderPage(driver);
			headerPage.clickSearchToggleSubMenu(driver);
			headerPage.moveToClaim(driver);
			SearchClaimsPage searchClaimsPage=headerPage.clickSimpleSearch(driver);
			searchClaimsPage.enterClaim(driver, testData.getClaimNumber());
			searchClaimsPage.clickSearch(driver);
			searchClaimsPage.clickClaimLink(driver)	;
			ActionsPage actionsPage = new ActionsPage(driver);
			actionsPage.clickActions(driver);
			actionsPage.clickAssignClaim(driver);
			AssignActivitiesPage assignActivitiesPage = new AssignActivitiesPage(driver);
			AssignPage assignPage = new AssignPage(driver);
			assignPage.selectSelectfromlist(driver,testData.getSelectFromList());
			assignPage.clickAssign(driver);
			headerPage.clicktoggleDesktopSubMenu(driver);
			headerPage.clickClaims(driver);
			ClaimsPage claimsPage = new ClaimsPage(driver);
			claimsPage.clickClaim(driver);
			claimsPage.clickAssign(driver);
			assignActivitiesPage.selectSearchByDistanceFromALocation(driver);
			assignActivitiesPage.selectSearchRadius(driver, testData.getSearchRadius());
			assignActivitiesPage.clickSearch(driver);
			assignActivitiesPage.verifySearchResult(driver);

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
	@Test(description="To verify the Close Activity functionality", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC203(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the Close Activity functionality",driver);

		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC203");

		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clicktoggleClaimSubMenu(driver);
			ActionsPage actionsPage=new ActionsPage(driver);
			actionsPage.enterClaimNumber(driver, testData.getClaimNumber());
			actionsPage.clickSearchClaim(driver);
			actionsPage.clickActions(driver);
			actionsPage.clickInterview(driver);
			NewActivityClaimPage newActivityClaimPage=actionsPage.clickStatementFromWitness(driver);
			newActivityClaimPage.selectAssignTo(driver, testData.getStatus());
			newActivityClaimPage.clickUpdate(driver);
			headerPage.clicktoggleDesktopSubMenu(driver);
			headerPage.clickActivitiesButton(driver);
			ActivitiesPage activitiesPage=new ActivitiesPage(driver);
			activitiesPage.selectDesktopActivitiesFilter(driver, testData.getActivityPatternName());
			activitiesPage.clickActivity(driver);
			WorkplanPage workplanPage = new WorkplanPage(driver);
			workplanPage.clickComplete_1(driver);
			workplanPage.verifyDue(driver);
			workplanPage.verifyPriority(driver);
			workplanPage.verifyStatus(driver);
			workplanPage.verifySubject(driver);
			workplanPage.verifyExposures(driver);
			workplanPage.verifyExternal(driver);

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
	@Test(description="To verify the 'Queued Activities' page using 'Desktop' top banner", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC208(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the 'Queued Activities' page using 'Desktop' top banner",driver);


		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clicktoggleDesktopSubMenu(driver);
			headerPage.clickQueues(driver);
			QueuedActivitiesPage queuedActivitiesPage = new QueuedActivitiesPage(driver);
			queuedActivitiesPage.verifyAssignSelectToMe(driver);
			queuedActivitiesPage.verifyAssign(driver);
			queuedActivitiesPage.verifyAssignNextInQueueToMe(driver);
			queuedActivitiesPage.verifyRefresh(driver);
			queuedActivitiesPage.verifyPrintExport(driver);
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
	@Test(description="To verify the 'Calendar' page using 'Desktop' top banner", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC209(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the 'Calendar' page using 'Desktop' top banner",driver);


		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clicktoggleDesktopSubMenu(driver);
			headerPage.moveToCalendar(driver);
			headerPage.clickMyCalendar(driver);
			CalendarPage calendarPage = new CalendarPage(driver);
			calendarPage.verifyCurrentMonthYear(driver);
			calendarPage.verifyShowFilter(driver);
			calendarPage.verifyPriorityFilter(driver);
			calendarPage.verifyJumpTo(driver);
			calendarPage.verifyActivityFilter(driver);

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
	@Test(description="To verify the 'Supervisor Calendar' page using 'Desktop' top banner", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC210(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the 'Supervisor Calendar' page using 'Desktop' top banner",driver);


		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clicktoggleDesktopSubMenu(driver);
			headerPage.moveToCalendar(driver);
			headerPage.clickSupervisorCalendar(driver);
			CalendarPage calendarPage = new CalendarPage(driver);
			calendarPage.verifyCurrentMonthYear(driver);
			calendarPage.verifyShowFilter(driver);
			calendarPage.verifyPriorityFilter(driver);
			calendarPage.verifyJumpTo(driver);
			calendarPage.verifyActivityFilter(driver);

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
	@Test(description="To verify the 'Bulk Invoices' page using 'Desktop' top banner", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC211(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC211");
		Log.testCaseInfo("To verify the 'Bulk Invoices' page using 'Desktop' top banner",driver);


		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("su", "gw");
			
			// Data: Bulk Invoice Creation
			HeaderPage headerPage=new HeaderPage(driver);
			headerPage.clicktoggleDesktopSubMenu(driver);
			headerPage.clickBulkInvoices(driver);
			BulkInvoicePage bulkInvoicePage=new BulkInvoicePage(driver);
			bulkInvoicePage.clickCreateNew(driver);
			BulkInvoiceDetailsPage bulkInvoiceDetailsPage=new BulkInvoiceDetailsPage(driver);
			bulkInvoiceDetailsPage.enterInvoice(driver,testData.getRandomText());
			bulkInvoiceDetailsPage.enterPayTotheOrderof(driver,testData.getRandomText());
			bulkInvoiceDetailsPage.enterRecipient(driver, testData.getFirstName());
			bulkInvoiceDetailsPage.clickAdd(driver);
			bulkInvoiceDetailsPage.enterClaimNumber(driver, testData.getClaimNumber());
			bulkInvoiceDetailsPage.clickReserveLineHeader(driver);
			bulkInvoiceDetailsPage.selectReserveLine(driver);
			bulkInvoiceDetailsPage.enterAmount(driver,testData.getAmount());
			bulkInvoiceDetailsPage.clickPayeeMenuIcon(driver);
			bulkInvoiceDetailsPage.clickPayeeSearch(driver);
			SearchAddressBookPage searchAddressBookPage = new NewAccountDetailPage(driver).new SearchAddressBookPage(driver);
			searchAddressBookPage.clickSearchByDistance(driver);
			searchAddressBookPage.selectSearchRadius(driver, testData.getSearchRadius());			
			searchAddressBookPage.selectCountry(driver, testData.getCountry());
			searchAddressBookPage.selectState(driver, testData.getState());
			searchAddressBookPage.clickSearch(driver);
			searchAddressBookPage.clickSelect(driver);
			bulkInvoiceDetailsPage.clickUpdate(driver);
			
			headerPage.clicktoggleDesktopSubMenu(driver);
			headerPage.clickBulkInvoices(driver);
			bulkInvoicePage.verifyBulkPayFilter(driver);
			bulkInvoicePage.verifyCreateNew(driver);
			bulkInvoicePage.verifyDelete(driver);
			bulkInvoicePage.verifyRefresh(driver);
			bulkInvoicePage.verifyStop(driver);
			bulkInvoicePage.verifySubmit(driver);
			bulkInvoicePage.verifyVoid(driver);
			bulkInvoicePage.clickInvoice(driver);
			bulkInvoiceDetailsPage.verifyStatus(driver);
			bulkInvoiceDetailsPage.verifyPaymentInstruction(driver);
			bulkInvoiceDetailsPage.verifyInvoiceItemDetail(driver);
			bulkInvoiceDetailsPage.verifyInvoice(driver);
			bulkInvoiceDetailsPage.verifyInvoice(driver);
			bulkInvoiceDetailsPage.verifyCheckDetails(driver);
			bulkInvoiceDetailsPage.verifyApprovalHistory(driver);

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
	@Test(description="To verify the 'Claims' page using 'Desktop' top banner", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC204(String browser) throws Exception {

		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC204");
		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the 'Claims' page using 'Desktop' top banners",driver);

		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clickSearchToggleSubMenu(driver);
			headerPage.moveToClaim(driver);
			SearchClaimsPage searchClaimsPage=headerPage.clickSimpleSearch(driver);
			searchClaimsPage.enterClaim(driver, testData.getClaimNumber());
			searchClaimsPage.clickSearch(driver);
			searchClaimsPage.clickClaimLink(driver)	;
			ActionsPage actionsPage = new ActionsPage(driver);
			actionsPage.clickActions(driver);
			actionsPage.clickAssignClaim(driver);
			AssignPage assignPage = new AssignPage(driver);
			assignPage.selectSelectfromlist(driver,testData.getSelectFromList());
			assignPage.clickAssign(driver);
			headerPage.clicktoggleDesktopSubMenu(driver);
			headerPage.clickClaims(driver);
			ClaimsPage claimsPage = new ClaimsPage(driver);
			claimsPage.clickClaim(driver);
			claimsPage.clickAssign(driver);
			assignPage.clickAssign(driver);
			claimsPage.clickClaim(driver);
			claimsPage.clickPrintExport(driver);
			PrintExportOptionsPage printExportOptionsPage = new PrintExportOptionsPage(driver);
			printExportOptionsPage.clickPrintAsPdf(driver);
			printExportOptionsPage.clickOK(driver);
			DocumentPage documentPage = new DocumentPage(driver);
			documentPage.verifyDownloadedDocument(driver, testData.getDocumentName());

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
	@Test(description="To verify the 'Exposures' page using 'Desktop' top banner", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC205(String browser) throws Exception {

		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC205");

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the 'Exposures' page using 'Desktop' top banner",driver);

		try {	
			
			PersonalAutoStepsImpl cc = PersonalAutoSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			String insuredName = cc.searchClaim(PersonalAutoFeatures.SearchClaim.builder().claimNo(testData.getClaimNumber()).build());
			
			cc.addCoveragesByType(PersonalAutoFeatures.ChooseCoveragesByType.builder(Coverages.COVERAGE_C)
					.coverage_C(CoverageType_C.builder()
							.collision(Coverage.builder()
									.claimant(insuredName)
									.claimantType(testData.getClaimantType())
									.make(testData.getMake())
									.model(testData.getModel())
									.year(testData.getYear())
									.vehicleName(testData.getVehicleName())
									.driverName(insuredName)
									.lossOccurred(testData.getLossOccurred())
									.build())
							.build())
					.coverage(testData.getCoverageType())
					.build());

			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clickSearchToggleSubMenu(driver);
			headerPage.moveToClaim(driver);
			SearchClaimsPage searchClaimsPage=headerPage.clickSimpleSearch(driver);
			searchClaimsPage.enterClaim(driver, testData.getClaimNumber());
			searchClaimsPage.clickSearch(driver);
			searchClaimsPage.clickClaimLink(driver)	;
			ActionsPage actionsPage = new ActionsPage(driver);
			actionsPage.clickActions(driver);
			actionsPage.clickAssignClaim(driver);
			AssignPage assignPage = new AssignPage(driver);
			assignPage.selectSelectfromlist(driver,testData.getSelectFromList());
			assignPage.clickAssign(driver);
			headerPage.clicktoggleDesktopSubMenu(driver);
			headerPage.clickExposures(driver);
			ExposuresPage exposuresPage = new ExposuresPage(driver);
			exposuresPage.clickClaim(driver);
			exposuresPage.clickAssign(driver);
			assignPage.clickAssign(driver);
			exposuresPage.clickClaim(driver);
			exposuresPage.clickPrintExport(driver);
			PrintExportOptionsPage printExportOptionsPage = new PrintExportOptionsPage(driver);
			printExportOptionsPage.clickExportAsPdf(driver);
			printExportOptionsPage.clickPrintAsPdf(driver);
			//Manual Flow also have the same flow. We should click on Ok button 'twice'
			printExportOptionsPage.clickOK(driver);
			printExportOptionsPage.clickOK(driver);
			DocumentPage documentPage = new DocumentPage(driver);
			documentPage.verifyDownloadedDocument(driver,testData.getDocumentName());
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
	@Test(description="To verify that able to run the BulkPurge batch process", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC269(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to run the BulkPurge batch process",driver);

		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC269");

		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			HeaderPage headerPage=new HeaderPage(driver);
			BatchProcessInfoPage batchProcessInfoPage=headerPage.clickGotoBatchProcess(driver);
			batchProcessInfoPage.clickBatchProcessRunButton(driver,testData.getBatchProcessName());
			batchProcessInfoPage.verifyBatchProcessLastRun(driver,testData.getBatchProcessName());
			batchProcessInfoPage.verifyBatchProcessLastRunStatus(driver,testData.getBatchProcessName());
			DownloadHistoryPage downloadHistoryPage=batchProcessInfoPage.clickBatchProcessDownloadHistory(driver,testData.getBatchProcessName());
			downloadHistoryPage.enterStartdate(driver, testData.getEffectiveDate());
			downloadHistoryPage.enterEnddate(driver, testData.getEffectiveDate());
			downloadHistoryPage.clickDownload(driver);
			downloadHistoryPage.clickReturntoBatchButton(driver);

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
	@Test(description="To verify that able to run the BulkPurge batch process", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC270(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to run the BulkPurge batch process",driver);

		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			HeaderPage headerPage=new HeaderPage(driver);
			BatchProcessInfoPage batchProcessInfoPage=headerPage.clickGotoBatchProcess(driver);
			batchProcessInfoPage.clickRefresh(driver);

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
	@Test(description="To verify that able to run the Claim Health Calculations Batch process", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC271(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to run the Claim Health Calculations Batch process",driver);

		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC271");

		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			HeaderPage headerPage=new HeaderPage(driver);
			BatchProcessInfoPage batchProcessInfoPage=headerPage.clickGotoBatchProcess(driver);
			batchProcessInfoPage.clickBatchProcessRunButton(driver,testData.getBatchProcessName());
			batchProcessInfoPage.verifyBatchProcessLastRun(driver,testData.getBatchProcessName());
			batchProcessInfoPage.verifyBatchProcessLastRunStatus(driver,testData.getBatchProcessName());
			batchProcessInfoPage.verifyRefreshButton(driver);
			batchProcessInfoPage.verifyDownloadButton(driver);
			batchProcessInfoPage.verifySchedulerButton(driver);
			batchProcessInfoPage.verifyNextScheduledRunClaimHealth(driver);
			batchProcessInfoPage.verifyScheduleActionsClaimHealth(driver);

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
	@Test( description="To verify that able to run the Claim Center (SPM) Completed Review Sync Batch process", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC272(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to run the Claim Center (SPM) Completed Review Sync Batch process",driver);

		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC272");

		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("su", "gw"); //Don't change the username - su alone having batchprocess

			HeaderPage headerPage=new HeaderPage(driver);
			BatchProcessInfoPage batchProcessInfoPage=headerPage.clickGotoBatchProcess(driver);
			batchProcessInfoPage.clickBatchProcessRunButton(driver,testData.getBatchProcessName());
			batchProcessInfoPage.verifyBatchProcessLastRun(driver,testData.getBatchProcessName());
			batchProcessInfoPage.verifyBatchProcessLastRunStatus(driver,testData.getBatchProcessName());
			batchProcessInfoPage.verifyRefreshButton(driver);
			batchProcessInfoPage.verifyDownloadButton(driver);
			batchProcessInfoPage.verifySchedulerButton(driver);
			batchProcessInfoPage.verifyNextScheduledRunClaimHealthSPM(driver);
			batchProcessInfoPage.verifyScheduleActionsClaimHealthSPM(driver);

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
	@Test(description="To verify that able to run the Claim Center (SPM) Completed Review Sync Batch process", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC273(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to run the Claim Center (SPM) Completed Review Sync Batch process",driver);

		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC273");

		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			HeaderPage headerPage=new HeaderPage(driver);
			BatchProcessInfoPage batchProcessInfoPage=headerPage.clickGotoBatchProcess(driver);
			batchProcessInfoPage.clickDownload(driver, testData.getFileName());

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
	@Test(description="To verify that able to suspend and resume a scheduler", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC274(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to suspend and resume a scheduler",driver);

		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC274");

		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			HeaderPage headerPage=new HeaderPage(driver);
			BatchProcessInfoPage batchProcessInfoPage=headerPage.clickGotoBatchProcess(driver);
			batchProcessInfoPage.clickSuspendScheduler(driver,testData.getSuspendScheduler());
			batchProcessInfoPage.clickResumeScheduler(driver,testData.getResumeScheduler());

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
	@Test(description="To verify that able to add new ICD Codes", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC436(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to add new ICD Codes",driver);

		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC436");
		String code = testData.setIcdCode();
		String codeAfterEdited= testData.setIcdCode();
		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clickAdministrationbutton(driver);
			headerPage.clickBusinessSettingsToggle(driver);
			ICDCodesPage ICDCodesPage = headerPage.clickICDCodes(driver);
			ICDCodesPage.selectBodySystem(driver, testData.setBodySystems());
			ICDCodesPage.clickSearch(driver);
			ICDCodesPage.verifySearchResults(driver,testData.setBodySystems());

			NewICDCodePage NewICDCodePage = ICDCodesPage.clickAddnewcode(driver);
			NewICDCodePage.enterICDCode(driver,code);
			NewICDCodePage.enterDescription(driver, testData.setDescription());
			NewICDCodePage.selectBodySystem(driver,testData.setBodySystems());
			NewICDCodePage.enterDescriptionEdgePolicyHolder(driver, testData.setDescription());
			NewICDCodePage.enterDescriptionEdge(driver, testData.setDescription());
			NewICDCodePage.clickUpdate(driver);

			ICDCodesPage.enterCode(driver,code);
			ICDCodesPage.selectBodySystem(driver, testData.setBodySystems());
			ICDCodesPage.clickSearch(driver);
			ICDCodesPage.clickOnCode(driver);
			ICDCodesPage.clickEdit(driver);
			
			ICDCodesPage.enterCode(driver,codeAfterEdited);
			NewICDCodePage.enterDescriptionEdgePolicyHolder(driver, testData.setDescription());
			NewICDCodePage.enterDescriptionEdge(driver, testData.setDescription());
			NewICDCodePage.clickUpdate(driver);

			ICDCodesPage.enterCode(driver, codeAfterEdited);
			ICDCodesPage.clickSearch(driver);

			ICDCodesPage.verifyCodeIsUpdated(driver, codeAfterEdited);
			ICDCodesPage.clickOnCode(driver);
			ICDCodesPage.clickEdit(driver);
			ICDCodesPage.enterCode(driver, code);
			NewICDCodePage.clickCancel(driver);
			ICDCodesPage.verifyCodeIsNotUpdated(driver, code);

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
	@Test(description="To verify that user is able to filter with 'Default' option", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC275(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that user is able to filter with 'Default' option",driver);

		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC275");

		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			HeaderPage headerPage=new HeaderPage(driver);
			BatchProcessInfoPage batchProcessInfoPage=headerPage.clickGotoBatchProcess(driver);
			batchProcessInfoPage.verfiyDefaultDropDown(driver, testData.getBatchProcessDropDown());

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
	@Test(description="To verify that user is able to filter with 'Schedulable' option", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC276(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that user is able to filter with 'Schedulable' option",driver);

		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC276");

		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("su", "gw"); //Don't change the username - su alone having batchprocess

			HeaderPage headerPage=new HeaderPage(driver);
			BatchProcessInfoPage batchProcessInfoPage=headerPage.clickGotoBatchProcess(driver);
			batchProcessInfoPage.selectBatchProcessDropDown(driver, testData.getBatchProcessDropDown());
			batchProcessInfoPage.verifyBatches(driver);

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
	@Test(description="To verify that user is able to filter with 'Runnable' option", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC277(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that user is able to filter with 'Runnable' option",driver);

		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC277");

		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			HeaderPage headerPage=new HeaderPage(driver);
			BatchProcessInfoPage batchProcessInfoPage=headerPage.clickGotoBatchProcess(driver);
			batchProcessInfoPage.selectBatchProcessDropDown(driver, testData.getBatchProcessDropDown());
			batchProcessInfoPage.verifyBatches(driver);

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
	@Test(description="To verify that able to run the Destroy Contact For Personal Data Batch process", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC278(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to run the Destroy Contact For Personal Data Batch process",driver);

		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC278");

		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			HeaderPage headerPage=new HeaderPage(driver);
			BatchProcessInfoPage batchProcessInfoPage=headerPage.clickGotoBatchProcess(driver);
			WorkQueueInfoPage workQueueInfoPage=batchProcessInfoPage.clickWorkQueueInfo(driver);
			workQueueInfoPage.verifyMaximumPoolSize(driver);
			workQueueInfoPage.verifyPoolSize(driver);
			workQueueInfoPage.verifyActiveThreadsCount(driver);
			workQueueInfoPage.verifyRefresh(driver);
			workQueueInfoPage.verifyDownload(driver);
			workQueueInfoPage.verifyDownloadRawData(driver);
			workQueueInfoPage.verifyWorkqueue(driver);
			workQueueInfoPage.verifyAvaialble(driver);
			workQueueInfoPage.verifyCheckedout(driver);
			workQueueInfoPage.verifyFailed(driver);
			workQueueInfoPage.verifyExecutors(driver);
			workQueueInfoPage.verifyClusterWide(driver);
			workQueueInfoPage.verifyClusterWide(driver);
			workQueueInfoPage.verifyActions(driver);
			workQueueInfoPage.clickRunWriter(driver,testData.getWorkQueueName());
			workQueueInfoPage.verifyAvailableValue(driver,testData.getWorkQueueName());
			workQueueInfoPage.verifyCheckedOutValue(driver,testData.getWorkQueueName());
			workQueueInfoPage.verifyFailedValue(driver,testData.getWorkQueueName());
			workQueueInfoPage.verifyExecutorsRuningValue(driver,testData.getWorkQueueName());
			workQueueInfoPage.verifyClusterWideValue(driver,testData.getWorkQueueName());
			workQueueInfoPage.verifyWriterStatusValue(driver,testData.getWorkQueueName());

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
	@Test(description="To verify that able to run the Encryption Upgrade Batch process", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC279(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to run the Encryption Upgrade Batch process",driver);

		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC279");

		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			HeaderPage headerPage=new HeaderPage(driver);
			BatchProcessInfoPage batchProcessInfoPage=headerPage.clickGotoBatchProcess(driver);
			batchProcessInfoPage.clickBatchProcessRunButton(driver,testData.getBatchProcessName());
			batchProcessInfoPage.verifyBatchProcessLastRun(driver,testData.getBatchProcessName());
			batchProcessInfoPage.verifyBatchProcessLastRunStatus(driver,testData.getBatchProcessName());
			batchProcessInfoPage.verifyRefreshButton(driver);
			batchProcessInfoPage.verifyDownloadButton(driver);
			batchProcessInfoPage.verifySchedulerButton(driver);
			batchProcessInfoPage.verifyBatchProcessNextScheduledRun(driver,testData.getBatchProcessName());
			batchProcessInfoPage.verifyBatchProcessScheduledStartAndStop(driver,testData.getBatchProcessName());

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
	@Test(description="To verify that able to update PPD Min / Max", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC440(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to update PPD Min / Max",driver);
		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC440");
		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			HeaderPage headerPage=new HeaderPage(driver);
			headerPage.clickAdministrationbutton(driver);
			headerPage.clickBusinessSettingsToggle(driver);
			headerPage.clickToggleWCParameters(driver);
			headerPage.clickWCPPDMaxMin(driver);
			PPDMinMaxPage pPDMinMaxPage = new PPDMinMaxPage(driver);
			pPDMinMaxPage.clickEdit(driver);
			pPDMinMaxPage.clickAdd(driver);
			pPDMinMaxPage.selectJurisdiction(driver,testData.getJurisdiction());
			pPDMinMaxPage.enterStartDate(driver, testData.getFromDate());
			pPDMinMaxPage.enterEndDate(driver, testData.getToDate());
			pPDMinMaxPage.enterMaxBenefit(driver,testData.getMaxAmount() );
			pPDMinMaxPage.enterMinBenefit(driver, testData.getMinAmount());
			pPDMinMaxPage.enterMaxPPDPercentage(driver,testData.getMaxppdPercentage());
			pPDMinMaxPage.enterMinPPDPercentage(driver, testData.getMinppdPercentage());
			pPDMinMaxPage.clickUpdate(driver);
			String jurisdictionName = pPDMinMaxPage.getJurisdictionName(driver, testData.getJurisdiction());
			pPDMinMaxPage.clickEdit(driver);
			pPDMinMaxPage.selectJurisdictionState(driver,testData.getState(),jurisdictionName);
			pPDMinMaxPage.clickUpdate(driver);
			String jurisdictionName2 = pPDMinMaxPage.getJurisdictionName(driver , testData.getState());
			String jurisdictionState = pPDMinMaxPage.verifyJurisdictionIsUpdated(driver, jurisdictionName2, jurisdictionName);
			pPDMinMaxPage.clickEdit(driver);
			pPDMinMaxPage.selectJurisdictionState(driver,testData.getJurisdiction(),jurisdictionState);
			pPDMinMaxPage.clickCancel(driver);
			pPDMinMaxPage.verifyJurisdictionIsNotUpdated(driver, jurisdictionName2, jurisdictionName);
			pPDMinMaxPage.clickWCPPDCheckBox(driver ,jurisdictionName2);
			pPDMinMaxPage.clickEdit(driver);
			pPDMinMaxPage.clickRemove(driver);
			pPDMinMaxPage.clickUpdate(driver);
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
	@Test(description="To verify that able to update PPD Weeks", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC441(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to update PPD Weeks",driver);
		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC441");
		String updatedJurisdictionState = DataFakers.state();
		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			HeaderPage headerPage=new HeaderPage(driver);
			headerPage.clickAdministrationbutton(driver);
			headerPage.clickBusinessSettingsToggle(driver);
			headerPage.clickToggleWCParameters(driver);
			headerPage.clickWCPPDWeeks(driver);
			PPDWeeksPage pPDWeeksPage = new PPDWeeksPage(driver);
			pPDWeeksPage.clickEdit(driver);
			pPDWeeksPage.clickAdd(driver);
			pPDWeeksPage.selectJurisdiction(driver, testData.getJurisdiction());
			pPDWeeksPage.enterStartDate(driver, testData.getFromDate());
			pPDWeeksPage.enterEndDate(driver,testData.getToDate());
			pPDWeeksPage.enterPPDPercentage(driver,testData.getMinppdPercentage());
			pPDWeeksPage.enterNumberofWeeks(driver, testData.getDays());
			pPDWeeksPage.clickUpdate(driver);


			String jurisdictionName = pPDWeeksPage.getJurisdictionName(driver,testData.getJurisdiction());
			pPDWeeksPage.clickEdit(driver);
			pPDWeeksPage.selectJurisdictionState(driver,testData.getJurisdictionState());
			pPDWeeksPage.clickUpdate(driver);
			pPDWeeksPage.verifyJurisdictionIsUpdated(driver,testData.getJurisdictionState(), jurisdictionName);

			pPDWeeksPage.clickEdit(driver);
			pPDWeeksPage.selectJurisdictionState(driver,updatedJurisdictionState);
			pPDWeeksPage.clickCancel(driver);
			pPDWeeksPage.verifyJurisdictionIsNotUpdated(driver,testData.getJurisdictionState(),updatedJurisdictionState);
			pPDWeeksPage.clickEdit(driver);
			pPDWeeksPage.clickWCPPDCheckBox(driver ,testData.getJurisdictionState() );
			pPDWeeksPage.clickRemove(driver);
			pPDWeeksPage.clickUpdate(driver);


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
	@Test(description="To verify that able to add the Compensability Parameters", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC442(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to add the Compensability Parameters",driver);
		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC442");
		String jurisdiction = testData.getJurisdiction();
		String jurisdictionstateUpdated = testData.getState();
		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			HeaderPage headerPage=new HeaderPage(driver);
			headerPage.clickAdministrationbutton(driver);
			headerPage.clickBusinessSettingsToggle(driver);
			headerPage.clickToggleWCParameters(driver);
			headerPage.clickCompensabilityParameters(driver);
			CompensabilityParametersPage compensabilityParametersPage = new CompensabilityParametersPage(driver);
			compensabilityParametersPage.clickAdd(driver);
			CompensabilityParameterDetailPage compensabilityParameterDetailPage = new CompensabilityParameterDetailPage(driver);
			compensabilityParameterDetailPage.selectJurisdiction(driver, testData.getJurisdiction());
			compensabilityParameterDetailPage.enterEffectiveDate(driver, testData.getFromDate());
			compensabilityParameterDetailPage.enterExpirationDate(driver, testData.getToDate());
			compensabilityParameterDetailPage.selectDenialPeriodFormula(driver,testData.getDenialPeriodFormula());
			compensabilityParameterDetailPage.enterTargetDaysFromLossx(driver,testData.getDays());
			compensabilityParameterDetailPage.selectTargetIncludeDays(driver,testData.getTargetIncludedDays());
			compensabilityParameterDetailPage.clickUpdate(driver);
			//rename jurisdiction and verify renamed successfully
			compensabilityParametersPage.clickJurisdictionNameLink(driver,jurisdiction);
			compensabilityParameterDetailPage.clickEdit(driver);
			compensabilityParameterDetailPage.selectJurisdiction(driver,jurisdictionstateUpdated);
			compensabilityParameterDetailPage.clickUpdate(driver);
			compensabilityParametersPage.verifyJurisdictionNameIsNotDisplayed(driver,jurisdiction);
			compensabilityParametersPage.verifyJurisdictionNameIsDisplayed(driver,jurisdictionstateUpdated);
			//rename jurisdiction and click cancel,verify not updated 
			compensabilityParametersPage.clickJurisdictionNameLink(driver,jurisdictionstateUpdated);
			compensabilityParameterDetailPage.clickEdit(driver);
			compensabilityParameterDetailPage.selectJurisdiction(driver,jurisdiction);
			compensabilityParameterDetailPage.clickCancel(driver);
			compensabilityParametersPage.verifyJurisdictionNameIsNotDisplayed(driver,jurisdiction);
			compensabilityParametersPage.verifyJurisdictionNameIsDisplayed(driver,jurisdictionstateUpdated);
			//verify clicking return to button it directs to main page
			compensabilityParametersPage.clickJurisdictionNameLink(driver,jurisdictionstateUpdated);
			compensabilityParameterDetailPage.clickEdit(driver);
			compensabilityParametersPage.clickReturnToCompensabilityParameters(driver);
			compensabilityParametersPage.verifyCompensabilityParametersMainPage(driver);
			//verify removed jurisdiction removed successfully
			compensabilityParametersPage.clickJurisdictionDataCheckBox(driver,jurisdictionstateUpdated);
			compensabilityParametersPage.clickRemove(driver);
			
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
	@Test(description="To verify the Export Data functionality", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC443(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the Export Data functionality",driver);
		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC443");
		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			HeaderPage headerPage=new HeaderPage(driver);
			headerPage.clickAdministrationbutton(driver);
			headerPage.clickUtilitiesToggle(driver);
			headerPage.clickExportData(driver);
			ExportDataPage exportDataPage = new ExportDataPage(driver);
			exportDataPage.clickExportAdministrativeDataCheckBox(driver,testData.getExportData());
			exportDataPage.clickExport(driver);
			exportDataPage.clickXMLRadioButton(driver);
			exportDataPage.clickExportAdministrativeDataCheckBox(driver, testData.getExportData());
			exportDataPage.clickExportAdministrativeDataCheckBox(driver, testData.getExportData());
			exportDataPage.clickExport(driver);


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
	@Test(description="To verify that able to edit the Script Parameters", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC444(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to edit the Script Parameters",driver);
		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC444");
		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			HeaderPage headerPage=new HeaderPage(driver);
			headerPage.clickAdministrationbutton(driver);
			headerPage.clickUtilitiesToggle(driver);
			headerPage.clickScriptParameter(driver);
			ScriptParametersPage scriptParametersPage = new ScriptParametersPage(driver);

			String scriptParameterValue = scriptParametersPage.getScriptParameterValue(driver);
			scriptParametersPage.clickScriptParameterName(driver);
			scriptParametersPage.clickEdit(driver);
			scriptParametersPage.enterValue(driver, testData.getScriptParameterValue());
			scriptParametersPage.clickUpdate(driver);
			scriptParametersPage.clickUptoScriptParameter(driver);
			scriptParametersPage.verifyScriptParameterValue(driver, scriptParameterValue);

			scriptParametersPage.clickScriptParameterName(driver);
			scriptParametersPage.clickEdit(driver);
			scriptParametersPage.enterValue(driver, scriptParameterValue);
			scriptParametersPage.clickCancel(driver);
			scriptParametersPage.verifyScriptParameterValue(driver, scriptParameterValue);

			scriptParametersPage.clickScriptParameterName(driver);
			scriptParametersPage.clickEdit(driver);
			scriptParametersPage.clickUptoScriptParameter(driver);
			scriptParametersPage.verifyScriptParameterMainPage(driver);

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
	@Test(description="To verify that able to add a New Property in Runtime Properties page", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC445(String browser) throws Exception {

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to add a New Property in Runtime Properties page",driver);
		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC445");
		String updatedPropertyName = testData.getPropertyName();
		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			HeaderPage headerPage=new HeaderPage(driver);
			headerPage.clickAdministrationbutton(driver);
			headerPage.clickUtilitiesToggle(driver);
			headerPage.clickRunTimeProperties(driver);
			RuntimePropertiesPage runtimePropertiesPage = new RuntimePropertiesPage(driver);
			runtimePropertiesPage.clickNewProperty(driver);
			NewPropertyPage newPropertyPage = new NewPropertyPage(driver);
			newPropertyPage.selectGroup(driver, testData.getGroupName());
			newPropertyPage.enterName(driver, testData.getName());
			newPropertyPage.enterDescription(driver, testData.getPropertyDescription());
			newPropertyPage.clickUpdate(driver);

			runtimePropertiesPage.clickPropertyNameLink(driver, testData.getName());
			newPropertyPage.clickEdit(driver);
			newPropertyPage.enterName(driver, updatedPropertyName);
			newPropertyPage.clickUpdate(driver);
			newPropertyPage.clickReturnUptoRunTimeProperties(driver);
			runtimePropertiesPage.verifyRunTimePropertyMainPage(driver);
			runtimePropertiesPage.verifyPropertyNameIsNotDisplayed(driver, testData.getName());
			runtimePropertiesPage.verifyPropertyNameIsDisplayed(driver, updatedPropertyName);

			runtimePropertiesPage.clickPropertyNameLink(driver,updatedPropertyName);
			newPropertyPage.clickEdit(driver);
			newPropertyPage.enterName(driver, testData.getName());
			newPropertyPage.clickCancel(driver);
			newPropertyPage.clickReturnUptoRunTimeProperties(driver);
			runtimePropertiesPage.verifyRunTimePropertyMainPage(driver);
			runtimePropertiesPage.verifyPropertyNameIsNotDisplayed(driver, testData.getName());
			runtimePropertiesPage.verifyPropertyNameIsDisplayed(driver,updatedPropertyName);

			runtimePropertiesPage.clickPropertyNameCheckbox(driver,updatedPropertyName);
			runtimePropertiesPage.clickDelete(driver);
			runtimePropertiesPage.verifyPropertyNameIsNotDisplayed(driver,updatedPropertyName);
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
	@Test(description="To verify that able to run the Exchange Rate Batch process", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC280(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to run the Exchange Rate Batch process",driver);

		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC280");

		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("su", "gw"); //Don't change the username - su alone having batchprocess

			HeaderPage headerPage=new HeaderPage(driver);
			BatchProcessInfoPage batchProcessInfoPage=headerPage.clickGotoBatchProcess(driver);
			batchProcessInfoPage.verifyRunStatusforExchangeRate(driver,testData.getBatchProcessName());

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
	@Test(description="To verify that able to run the Financials Escalation batch process", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC281(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to run the Financials Escalation batch process",driver);

		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC281");

		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			HeaderPage headerPage=new HeaderPage(driver);
			BatchProcessInfoPage batchProcessInfoPage=headerPage.clickGotoBatchProcess(driver);
			batchProcessInfoPage.clickBatchProcessRunButton(driver,testData.getBatchProcessName());
			batchProcessInfoPage.verifyBatchProcessLastRun(driver,testData.getBatchProcessName());
			batchProcessInfoPage.verifyBatchProcessLastRunStatus(driver,testData.getBatchProcessName());
			batchProcessInfoPage.verifyRefreshButton(driver);
			batchProcessInfoPage.verifyDownloadButton(driver);
			batchProcessInfoPage.verifySchedulerButton(driver);
			batchProcessInfoPage.verifyBatchProcessNextScheduledRun(driver,testData.getBatchProcessName());
			batchProcessInfoPage.verifyBatchProcessScheduledStartAndStop(driver,testData.getBatchProcessName());

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
	@Test(description="To verify that able to run the Geocode Writer batch process", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC282(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to run the Geocode Writer batch process",driver);

		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC282");

		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			HeaderPage headerPage=new HeaderPage(driver);
			BatchProcessInfoPage batchProcessInfoPage=headerPage.clickGotoBatchProcess(driver);
			WorkQueueInfoPage workQueueInfoPage=batchProcessInfoPage.clickWorkQueueInfo(driver);
			workQueueInfoPage.verifyMaximumPoolSize(driver);
			workQueueInfoPage.verifyPoolSize(driver);
			workQueueInfoPage.verifyActiveThreadsCount(driver);
			workQueueInfoPage.verifyRefresh(driver);
			workQueueInfoPage.verifyDownload(driver);
			workQueueInfoPage.verifyDownloadRawData(driver);
			workQueueInfoPage.verifyWorkqueue(driver);
			workQueueInfoPage.verifyAvaialble(driver);
			workQueueInfoPage.verifyCheckedout(driver);
			workQueueInfoPage.verifyFailed(driver);
			workQueueInfoPage.verifyExecutors(driver);
			workQueueInfoPage.verifyClusterWide(driver);
			workQueueInfoPage.verifyClusterWide(driver);
			workQueueInfoPage.verifyActions(driver);
			workQueueInfoPage.clickRunWriter(driver,testData.getWorkQueueName());
			workQueueInfoPage.verifyAvailableValue(driver,testData.getWorkQueueName());
			workQueueInfoPage.verifyCheckedOutValue(driver,testData.getWorkQueueName());
			workQueueInfoPage.verifyFailedValue(driver,testData.getWorkQueueName());
			workQueueInfoPage.verifyExecutorsRuningValue(driver,testData.getWorkQueueName());
			workQueueInfoPage.verifyClusterWideValue(driver,testData.getWorkQueueName());
			workQueueInfoPage.verifyWriterStatusValue(driver,testData.getWorkQueueName());

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
	@Test(description="To verify that able to run the TAccounts Escalation Batch process", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC283(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to run the TAccounts Escalation Batch process",driver);

		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC266");

		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			HeaderPage headerPage=new HeaderPage(driver);
			BatchProcessInfoPage batchProcessInfoPage=headerPage.clickGotoBatchProcess(driver);
			batchProcessInfoPage.clickBatchProcessRunButton(driver,testData.getBatchProcessName());
			batchProcessInfoPage.verifyBatchProcessLastRunStatus(driver,testData.getBatchProcessName());
			DownloadHistoryPage downloadHistoryPage=batchProcessInfoPage.clickBatchProcessDownloadHistory(driver,testData.getBatchProcessName());
			downloadHistoryPage.enterStartdate(driver, testData.getEffectiveDate());
			downloadHistoryPage.enterEnddate(driver, testData.getEffectiveDate());
			downloadHistoryPage.clickDownload(driver);
			downloadHistoryPage.clickReturntoBatchButton(driver);

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
	@Test(description="To verify that able to run the Idle Claim Exception", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC284(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to run the Idle Claim Exception",driver);

		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC284");

		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			HeaderPage headerPage=new HeaderPage(driver);
			BatchProcessInfoPage batchProcessInfoPage=headerPage.clickGotoBatchProcess(driver);
			batchProcessInfoPage.clickBatchProcessRunButton(driver,testData.getBatchProcessName());
			batchProcessInfoPage.verifyBatchProcessLastRun(driver,testData.getBatchProcessName());
			batchProcessInfoPage.verifyBatchProcessLastRunStatus(driver,testData.getBatchProcessName());
			batchProcessInfoPage.verifyNextScheduledRunAggregateLimit(driver);
			batchProcessInfoPage.verifyScheduleActionsAggregateLimit(driver);

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
	@Test(description="To verify that able to run the Idle Closed Claim Exception", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC285(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to run the Idle Closed Claim Exception",driver);

		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC285");

		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("su", "gw"); //Don't change the username here, su alone having batchprocess

			HeaderPage headerPage=new HeaderPage(driver);
			BatchProcessInfoPage batchProcessInfoPage=headerPage.clickGotoBatchProcess(driver);
			WorkQueueInfoPage workQueueInfoPage=batchProcessInfoPage.clickWorkQueueInfo(driver);
			workQueueInfoPage.verifyMaximumPoolSize(driver);
			workQueueInfoPage.verifyPoolSize(driver);
			workQueueInfoPage.verifyActiveThreadsCount(driver);
			workQueueInfoPage.verifyRefresh(driver);
			workQueueInfoPage.verifyDownload(driver);
			workQueueInfoPage.verifyDownloadRawData(driver);
			workQueueInfoPage.verifyWorkqueue(driver);
			workQueueInfoPage.verifyAvaialble(driver);
			workQueueInfoPage.verifyCheckedout(driver);
			workQueueInfoPage.verifyFailed(driver);
			workQueueInfoPage.verifyExecutors(driver);
			workQueueInfoPage.verifyClusterWide(driver);
			workQueueInfoPage.verifyClusterWide(driver);
			workQueueInfoPage.verifyActions(driver);
			workQueueInfoPage.clickRunWriter(driver,testData.getWorkQueueName());
			workQueueInfoPage.verifyAvailableValue(driver,testData.getWorkQueueName());
			workQueueInfoPage.verifyCheckedOutValue(driver,testData.getWorkQueueName());
			workQueueInfoPage.verifyFailedValue(driver,testData.getWorkQueueName());
			workQueueInfoPage.verifyExecutorsRuningValue(driver,testData.getWorkQueueName());
			workQueueInfoPage.verifyClusterWideValue(driver,testData.getWorkQueueName());
			workQueueInfoPage.verifyWriterStatusValue(driver,testData.getWorkQueueName());

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
	@Test(description="To verify that able to run the Inbound Chunk Work Queue Exception Batch process", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC286(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to run the Inbound Chunk Work Queue Exception Batch process",driver);

		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC286");

		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			HeaderPage headerPage=new HeaderPage(driver);
			BatchProcessInfoPage batchProcessInfoPage=headerPage.clickGotoBatchProcess(driver);
			WorkQueueInfoPage workQueueInfoPage=batchProcessInfoPage.clickWorkQueueInfo(driver);
			workQueueInfoPage.verifyMaximumPoolSize(driver);
			workQueueInfoPage.verifyPoolSize(driver);
			workQueueInfoPage.verifyActiveThreadsCount(driver);
			workQueueInfoPage.verifyRefresh(driver);
			workQueueInfoPage.verifyDownload(driver);
			workQueueInfoPage.verifyDownloadRawData(driver);
			workQueueInfoPage.verifyWorkqueue(driver);
			workQueueInfoPage.verifyAvaialble(driver);
			workQueueInfoPage.verifyCheckedout(driver);
			workQueueInfoPage.verifyFailed(driver);
			workQueueInfoPage.verifyExecutors(driver);
			workQueueInfoPage.verifyClusterWide(driver);
			workQueueInfoPage.verifyClusterWide(driver);
			workQueueInfoPage.verifyActions(driver);
			workQueueInfoPage.clickRunWriter(driver,testData.getWorkQueueName());
			workQueueInfoPage.verifyAvailableValue(driver,testData.getWorkQueueName());
			workQueueInfoPage.verifyCheckedOutValue(driver,testData.getWorkQueueName());
			workQueueInfoPage.verifyFailedValue(driver,testData.getWorkQueueName());
			workQueueInfoPage.verifyExecutorsRuningValue(driver,testData.getWorkQueueName());
			workQueueInfoPage.verifyClusterWideValue(driver,testData.getWorkQueueName());
			workQueueInfoPage.verifyWriterStatusValue(driver,testData.getWorkQueueName());

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
	@Test(description="To verify that able to run the Inbound File Purge Work Queue Batch process", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC287(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to run the Inbound File Purge Work Queue Batch process",driver);

		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC287");

		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			HeaderPage headerPage=new HeaderPage(driver);
			BatchProcessInfoPage batchProcessInfoPage=headerPage.clickGotoBatchProcess(driver);
			WorkQueueInfoPage workQueueInfoPage=batchProcessInfoPage.clickWorkQueueInfo(driver);
			workQueueInfoPage.verifyMaximumPoolSize(driver);
			workQueueInfoPage.verifyPoolSize(driver);
			workQueueInfoPage.verifyActiveThreadsCount(driver);
			workQueueInfoPage.verifyRefresh(driver);
			workQueueInfoPage.verifyDownload(driver);
			workQueueInfoPage.verifyDownloadRawData(driver);
			workQueueInfoPage.verifyWorkqueue(driver);
			workQueueInfoPage.verifyAvaialble(driver);
			workQueueInfoPage.verifyCheckedout(driver);
			workQueueInfoPage.verifyFailed(driver);
			workQueueInfoPage.verifyExecutors(driver);
			workQueueInfoPage.verifyClusterWide(driver);
			workQueueInfoPage.verifyClusterWide(driver);
			workQueueInfoPage.verifyActions(driver);
			workQueueInfoPage.clickRunWriter(driver,testData.getWorkQueueName());
			workQueueInfoPage.verifyAvailableValue(driver,testData.getWorkQueueName());
			workQueueInfoPage.verifyCheckedOutValue(driver,testData.getWorkQueueName());
			workQueueInfoPage.verifyFailedValue(driver,testData.getWorkQueueName());
			workQueueInfoPage.verifyExecutorsRuningValue(driver,testData.getWorkQueueName());
			workQueueInfoPage.verifyClusterWideValue(driver,testData.getWorkQueueName());
			workQueueInfoPage.verifyWriterStatusValue(driver,testData.getWorkQueueName());
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
	@Test(description="To verify that able to run the InvoiceProcessing", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC288(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to run the InvoiceProcessing",driver);

		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC288");

		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			HeaderPage headerPage=new HeaderPage(driver);
			BatchProcessInfoPage batchProcessInfoPage=headerPage.clickGotoBatchProcess(driver);
			WorkQueueInfoPage workQueueInfoPage=batchProcessInfoPage.clickWorkQueueInfo(driver);
			workQueueInfoPage.verifyMaximumPoolSize(driver);
			workQueueInfoPage.verifyPoolSize(driver);
			workQueueInfoPage.verifyActiveThreadsCount(driver);
			workQueueInfoPage.verifyRefresh(driver);
			workQueueInfoPage.verifyDownload(driver);
			workQueueInfoPage.verifyDownloadRawData(driver);
			workQueueInfoPage.verifyWorkqueue(driver);
			workQueueInfoPage.verifyAvaialble(driver);
			workQueueInfoPage.verifyCheckedout(driver);
			workQueueInfoPage.verifyFailed(driver);
			workQueueInfoPage.verifyExecutors(driver);
			workQueueInfoPage.verifyClusterWide(driver);
			workQueueInfoPage.verifyClusterWide(driver);
			workQueueInfoPage.verifyActions(driver);
			workQueueInfoPage.clickRunWriter(driver,testData.getWorkQueueName());
			workQueueInfoPage.verifyAvailableValue(driver,testData.getWorkQueueName());
			workQueueInfoPage.verifyCheckedOutValue(driver,testData.getWorkQueueName());
			workQueueInfoPage.verifyFailedValue(driver,testData.getWorkQueueName());
			workQueueInfoPage.verifyExecutorsRuningValue(driver,testData.getWorkQueueName());
			workQueueInfoPage.verifyClusterWideValue(driver,testData.getWorkQueueName());
			workQueueInfoPage.verifyWriterStatusValue(driver,testData.getWorkQueueName());

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
	@Test(description="To verify that able to run the ReviewSync Batch process", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC289(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to run the ReviewSync Batch process",driver);

		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC289");

		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("su", "gw"); //Don't change the username here, su alone having batchprocess

			HeaderPage headerPage=new HeaderPage(driver);
			BatchProcessInfoPage batchProcessInfoPage=headerPage.clickGotoBatchProcess(driver);
			WorkQueueInfoPage workQueueInfoPage=batchProcessInfoPage.clickWorkQueueInfo(driver);
			workQueueInfoPage.verifyMaximumPoolSize(driver);
			workQueueInfoPage.verifyPoolSize(driver);
			workQueueInfoPage.verifyActiveThreadsCount(driver);
			workQueueInfoPage.verifyRefresh(driver);
			workQueueInfoPage.verifyDownload(driver);
			workQueueInfoPage.verifyDownloadRawData(driver);
			workQueueInfoPage.verifyWorkqueue(driver);
			workQueueInfoPage.verifyAvaialble(driver);
			workQueueInfoPage.verifyCheckedout(driver);
			workQueueInfoPage.verifyFailed(driver);
			workQueueInfoPage.verifyExecutors(driver);
			workQueueInfoPage.verifyClusterWide(driver);
			workQueueInfoPage.verifyClusterWide(driver);
			workQueueInfoPage.verifyActions(driver);
			workQueueInfoPage.clickRunWriter(driver,testData.getWorkQueueName());
			workQueueInfoPage.verifyAvailableValue(driver,testData.getWorkQueueName());
			workQueueInfoPage.verifyCheckedOutValue(driver,testData.getWorkQueueName());
			workQueueInfoPage.verifyFailedValue(driver,testData.getWorkQueueName());
			workQueueInfoPage.verifyExecutorsRuningValue(driver,testData.getWorkQueueName());
			workQueueInfoPage.verifyClusterWideValue(driver,testData.getWorkQueueName());
			workQueueInfoPage.verifyWriterStatusValue(driver,testData.getWorkQueueName());
			workQueueInfoPage.clickStop(driver,testData.getWorkQueueName());
			workQueueInfoPage.verifyAvailableValue(driver,testData.getWorkQueueName());
			workQueueInfoPage.verifyCheckedOutValue(driver,testData.getWorkQueueName());
			workQueueInfoPage.verifyFailedValue(driver,testData.getWorkQueueName());
			workQueueInfoPage.verifyExecutorsRuningValue(driver,testData.getWorkQueueName());
			workQueueInfoPage.verifyClusterWideValue(driver,testData.getWorkQueueName());
			workQueueInfoPage.verifyWriterStatusValue(driver,testData.getWorkQueueName());
			workQueueInfoPage.clickRestart(driver,testData.getWorkQueueName());
			workQueueInfoPage.verifyAvailableValue(driver,testData.getWorkQueueName());
			workQueueInfoPage.verifyCheckedOutValue(driver,testData.getWorkQueueName());
			workQueueInfoPage.verifyFailedValue(driver,testData.getWorkQueueName());
			workQueueInfoPage.verifyExecutorsRuningValue(driver,testData.getWorkQueueName());
			workQueueInfoPage.verifyClusterWideValue(driver,testData.getWorkQueueName());
			workQueueInfoPage.verifyWriterStatusValue(driver,testData.getWorkQueueName());

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
	@Test(description="To verify Item Statistics - By Writers in Work Queue Batch process", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC293(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify Item Statistics - By Writers in Work Queue Batch process",driver);

		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC293");

		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			HeaderPage headerPage=new HeaderPage(driver);
			BatchProcessInfoPage batchProcessInfoPage=headerPage.clickGotoBatchProcess(driver);
			WorkQueueInfoPage workQueueInfoPage=batchProcessInfoPage.clickWorkQueueInfo(driver);
			workQueueInfoPage.verifyMaximumPoolSize(driver);
			workQueueInfoPage.verifyPoolSize(driver);
			workQueueInfoPage.verifyActiveThreadsCount(driver);
			workQueueInfoPage.verifyRefresh(driver);
			workQueueInfoPage.verifyDownload(driver);
			workQueueInfoPage.verifyDownloadRawData(driver);
			workQueueInfoPage.verifyWorkqueue(driver);
			workQueueInfoPage.verifyAvaialble(driver);
			workQueueInfoPage.verifyCheckedout(driver);
			workQueueInfoPage.verifyFailed(driver);
			workQueueInfoPage.verifyExecutors(driver);
			workQueueInfoPage.verifyClusterWide(driver);
			workQueueInfoPage.verifyClusterWide(driver);
			workQueueInfoPage.verifyActions(driver);
			workQueueInfoPage.clickRunWriter(driver,testData.getWorkQueueName());
			workQueueInfoPage.verifyAvailableValue(driver,testData.getWorkQueueName());
			workQueueInfoPage.verifyCheckedOutValue(driver,testData.getWorkQueueName());
			workQueueInfoPage.verifyFailedValue(driver,testData.getWorkQueueName());
			workQueueInfoPage.verifyExecutorsRuningValue(driver,testData.getWorkQueueName());
			workQueueInfoPage.verifyClusterWideValue(driver,testData.getWorkQueueName());
			workQueueInfoPage.verifyWriterStatusValue(driver,testData.getWorkQueueName());
			workQueueInfoPage.clickByWriters(driver);
			workQueueInfoPage.verifyProcessIdValue(driver);
			workQueueInfoPage.verifyItemCreationValue(driver);
			workQueueInfoPage.verifyNumberOfItemsValue(driver);

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
	@Test(description="To verify that able to download the configuration in Info pages", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC295(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to download the configuration in Info pages",driver);

		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC295");

		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			HeaderPage headerPage=new HeaderPage(driver);
			BatchProcessInfoPage batchProcessInfoPage=headerPage.clickGotoBatchProcess(driver);
			InfoConfigurationPage infoConfigurationPage=batchProcessInfoPage.clickInfoConfigurationPage(driver);
			infoConfigurationPage.verifyNameAndValueParameters(driver);
			infoConfigurationPage.clickDownload(driver,testData.getFileName());
			
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
	@Test(description="To verify the Set Log Level page", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC430(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the Set Log Level page",driver);

		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC430");

		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clickGotoBatchProcess(driver);
			headerPage.clickSetLogLevelPage(driver);
			SetLogLevelPage setLogLevelPage = new SetLogLevelPage(driver);
			setLogLevelPage.selectLogger(driver, testData.getLogger());
			setLogLevelPage.selectNewConfiguredLevel(driver, testData.getNewConfiguredLevel());
			setLogLevelPage.verifyCurrentConfiguredLevel(driver);
			setLogLevelPage.verifyCurrentActualLevel(driver);
			
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
	@Test(description="To verify the View Logs page", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC431(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the View Logs page",driver);

		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC431");

		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			HeaderPage headerPage = new HeaderPage(driver);
			BatchProcessInfoPage batchProcessInfoPage=headerPage.clickGotoBatchProcess(driver);
			batchProcessInfoPage.clickViewLogsPage(driver);
			ViewLogsPage viewLogsPage = new ViewLogsPage(driver);
			viewLogsPage.selectLogFile(driver, testData.getLogFile());
			viewLogsPage.enterFiltergrep(driver, testData.getFilterGrep());
			viewLogsPage.clickViewLogs(driver);
			viewLogsPage.verifyLogDetails(driver);

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
	@Test(description="To verify the Intentional Logging page", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC432(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the Intentional Logging page",driver);


		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			HeaderPage headerPage = new HeaderPage(driver);
			BatchProcessInfoPage batchProcessInfoPage=headerPage.clickGotoBatchProcess(driver);
			batchProcessInfoPage.clickIntentionalLogging(driver);
			IntentionalLoggingPage intentionalLoggingPage = new IntentionalLoggingPage(driver);
			intentionalLoggingPage.clickEnable_19(driver);
			intentionalLoggingPage.clickDisable_20(driver);
			intentionalLoggingPage.verifyTurnIntentionalLoggingOff(driver);
			intentionalLoggingPage.verifyTurnIntentionalLoggingOn(driver);

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
	@Test(description="To verify the Management Beans page", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC433(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the Management Beans page",driver);


		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			HeaderPage headerPage = new HeaderPage(driver);
			BatchProcessInfoPage batchProcessInfoPage=headerPage.clickGotoBatchProcess(driver);
			batchProcessInfoPage.clickManagementBeans(driver);
			ManagementBeansPage managementBeansPage = new ManagementBeansPage(driver);
			managementBeansPage.clickInputBean_5(driver);
			GuidewireManagedBeanPropertiesPage guidewireManagedBeanPropertiesPage = new GuidewireManagedBeanPropertiesPage(driver);
			guidewireManagedBeanPropertiesPage.verifyNodeStatusJsonExecute(driver);
			guidewireManagedBeanPropertiesPage.verifyResetExecute(driver);
			guidewireManagedBeanPropertiesPage.verifyMBeanPropertyName(driver);
			guidewireManagedBeanPropertiesPage.verifyBackToManagementBeans(driver);

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
	@Test(description="To verify the Startable Services page", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC434(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the Startable Services page",driver);

		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC434");
		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			HeaderPage headerPage = new HeaderPage(driver);
			BatchProcessInfoPage batchProcessInfoPage=headerPage.clickGotoBatchProcess(driver);
			batchProcessInfoPage.clickStartableServices(driver);
			StartableServicesPage startableServicesPage = new StartableServicesPage(driver);
			startableServicesPage.verifyAction(driver);
			startableServicesPage.verifyHost(driver);
			startableServicesPage.verifyName(driver);
			startableServicesPage.verifyStatus(driver);
			startableServicesPage.clickStop(driver);
			startableServicesPage.verifyServiceStatus(driver, testData.getServiceStatus());
			startableServicesPage.clickStart(driver);
			startableServicesPage.verifyServiceStatus(driver, testData.getStatus());

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
	@Test(description="To verify that able to run the InvoiceItemProcessing Batch process", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC290(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to run the InvoiceItemProcessing Batch process",driver);

		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC290");
		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("su", "gw"); //Don't change the username here, su alone having batchprocess

			HeaderPage headerPage = new HeaderPage(driver);
			BatchProcessInfoPage batchProcessInfoPage=headerPage.clickGotoBatchProcess(driver);
			batchProcessInfoPage.clickBatchProcessRunButton(driver,testData.getBatchProcessName());
			batchProcessInfoPage.verifyBatchProcessLastRunStatus(driver,testData.getBatchProcessName());
			DownloadHistoryPage downloadHistoryPage=batchProcessInfoPage.clickBatchProcessDownloadHistory(driver,testData.getBatchProcessName());
			downloadHistoryPage.enterStartdate(driver, testData.getEffectiveDate());
			downloadHistoryPage.enterEnddate(driver, testData.getEffectiveDate());
			downloadHistoryPage.clickDownload(driver);
			downloadHistoryPage.clickReturntoBatchButton(driver);
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
	@Test(description="To verify that able to run the Notify External System For Personal Data Batch process", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC291(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to run the Notify External System For Personal Data Batch process",driver);

		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC291");
		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			HeaderPage headerPage = new HeaderPage(driver);
			BatchProcessInfoPage batchProcessInfoPage=headerPage.clickGotoBatchProcess(driver);
			WorkQueueInfoPage workQueueInfoPage=batchProcessInfoPage.clickWorkQueueInfo(driver);
			workQueueInfoPage.verifyMaximumPoolSize(driver);
			workQueueInfoPage.verifyPoolSize(driver);
			workQueueInfoPage.verifyActiveThreadsCount(driver);
			workQueueInfoPage.verifyRefresh(driver);
			workQueueInfoPage.verifyDownload(driver);
			workQueueInfoPage.verifyDownloadRawData(driver);
			workQueueInfoPage.verifyWorkqueue(driver);
			workQueueInfoPage.verifyAvaialble(driver);
			workQueueInfoPage.verifyCheckedout(driver);
			workQueueInfoPage.verifyFailed(driver);
			workQueueInfoPage.verifyExecutors(driver);
			workQueueInfoPage.verifyClusterWide(driver);
			workQueueInfoPage.verifyClusterWide(driver);
			workQueueInfoPage.verifyActions(driver);
			workQueueInfoPage.clickRunWriter(driver,testData.getWorkQueueName());
			workQueueInfoPage.verifyAvailableValue(driver,testData.getWorkQueueName());
			workQueueInfoPage.verifyCheckedOutValue(driver,testData.getWorkQueueName());
			workQueueInfoPage.verifyFailedValue(driver,testData.getWorkQueueName());
			workQueueInfoPage.verifyExecutorsRuningValue(driver,testData.getWorkQueueName());
			workQueueInfoPage.verifyClusterWideValue(driver,testData.getWorkQueueName());
			workQueueInfoPage.verifyWriterStatusValue(driver,testData.getWorkQueueName());

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
	@Test(description="To verify that able to run the OutboundFileBatchProcess", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC294(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to run the OutboundFileBatchProcess",driver);

		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC294");
		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			HeaderPage headerPage = new HeaderPage(driver);
			BatchProcessInfoPage batchProcessInfoPage=headerPage.clickGotoBatchProcess(driver);
			WorkQueueInfoPage workQueueInfoPage=batchProcessInfoPage.clickWorkQueueInfo(driver);
			workQueueInfoPage.verifyMaximumPoolSize(driver);
			workQueueInfoPage.verifyPoolSize(driver);
			workQueueInfoPage.verifyActiveThreadsCount(driver);
			workQueueInfoPage.verifyRefresh(driver);
			workQueueInfoPage.verifyDownload(driver);
			workQueueInfoPage.verifyDownloadRawData(driver);
			workQueueInfoPage.verifyWorkqueue(driver);
			workQueueInfoPage.verifyAvaialble(driver);
			workQueueInfoPage.verifyCheckedout(driver);
			workQueueInfoPage.verifyFailed(driver);
			workQueueInfoPage.verifyExecutors(driver);
			workQueueInfoPage.verifyClusterWide(driver);
			workQueueInfoPage.verifyClusterWide(driver);
			workQueueInfoPage.verifyActions(driver);
			workQueueInfoPage.clickRunWriter(driver,testData.getWorkQueueName());
			workQueueInfoPage.verifyAvailableValue(driver,testData.getWorkQueueName());
			workQueueInfoPage.verifyCheckedOutValue(driver,testData.getWorkQueueName());
			workQueueInfoPage.verifyFailedValue(driver,testData.getWorkQueueName());
			workQueueInfoPage.verifyExecutorsRuningValue(driver,testData.getWorkQueueName());
			workQueueInfoPage.verifyClusterWideValue(driver,testData.getWorkQueueName());
			workQueueInfoPage.verifyWriterStatusValue(driver,testData.getWorkQueueName());
			
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
	@Test(description="To verify that able to run the Process Completion Monitor Batch process", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC296(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to run the Process Completion Monitor Batch process",driver);

		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC271");

		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			HeaderPage headerPage=new HeaderPage(driver);
			BatchProcessInfoPage batchProcessInfoPage=headerPage.clickGotoBatchProcess(driver);
			batchProcessInfoPage.clickBatchProcessRunButton(driver,testData.getBatchProcessName());
			batchProcessInfoPage.verifyBatchProcessLastRun(driver,testData.getBatchProcessName());
			batchProcessInfoPage.verifyBatchProcessLastRunStatus(driver,testData.getBatchProcessName());
			batchProcessInfoPage.verifyRefreshButton(driver);
			batchProcessInfoPage.verifyDownloadButton(driver);
			batchProcessInfoPage.verifySchedulerButton(driver);
			batchProcessInfoPage.verifyNextScheduledRunProcessCompletionMonitor(driver,testData.getBatchProcessName());
			batchProcessInfoPage.verifyScheduleActionsProcessCompletionMonitorStartButton(driver);
			batchProcessInfoPage.verifyScheduleActionsProcessCompletionMonitorStopButton(driver);

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
	@Test(description="To verify that able to run the  Phone number normalizer Batch process", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC303(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to run the  Phone number normalizer Batch process",driver);

		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC303");
		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("su", "gw"); //Don't change the username here, su alone having batchprocess

			HeaderPage headerPage = new HeaderPage(driver);
			BatchProcessInfoPage batchProcessInfoPage=headerPage.clickGotoBatchProcess(driver);
			WorkQueueInfoPage workQueueInfoPage=batchProcessInfoPage.clickWorkQueueInfo(driver);
			workQueueInfoPage.verifyMaximumPoolSize(driver);
			workQueueInfoPage.verifyPoolSize(driver);
			workQueueInfoPage.verifyActiveThreadsCount(driver);
			workQueueInfoPage.verifyRefresh(driver);
			workQueueInfoPage.verifyDownload(driver);
			workQueueInfoPage.verifyDownloadRawData(driver);
			workQueueInfoPage.verifyWorkqueue(driver);
			workQueueInfoPage.verifyAvaialble(driver);
			workQueueInfoPage.verifyCheckedout(driver);
			workQueueInfoPage.verifyFailed(driver);
			workQueueInfoPage.verifyExecutors(driver);
			workQueueInfoPage.verifyClusterWide(driver);
			workQueueInfoPage.verifyActions(driver);
			workQueueInfoPage.clickRunWriter(driver,testData.getWorkQueueName());
			workQueueInfoPage.verifyAvailableValue(driver,testData.getWorkQueueName());
			workQueueInfoPage.verifyCheckedOutValue(driver,testData.getWorkQueueName());
			workQueueInfoPage.verifyFailedValue(driver,testData.getWorkQueueName());
			workQueueInfoPage.verifyExecutorsRuningValue(driver,testData.getWorkQueueName());
			workQueueInfoPage.verifyClusterWideValue(driver,testData.getWorkQueueName());
			workQueueInfoPage.verifyWriterStatusValue(driver,testData.getWorkQueueName());
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
	@Test(description="To verify that able to run the Recalculate Claim Metrics Batch process", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC306(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to run the Recalculate Claim Metrics Batch process",driver);

		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC306");
		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			HeaderPage headerPage = new HeaderPage(driver);
			BatchProcessInfoPage batchProcessInfoPage=headerPage.clickGotoBatchProcess(driver);
			batchProcessInfoPage.clickBatchProcessRunButton(driver,testData.getBatchProcessName());
			batchProcessInfoPage.verifyBatchProcessLastRunStatus(driver,testData.getBatchProcessName());
			DownloadHistoryPage downloadHistoryPage=batchProcessInfoPage.clickBatchProcessDownloadHistory(driver,testData.getBatchProcessName());
			downloadHistoryPage.enterStartdate(driver, testData.getEffectiveDate());
			downloadHistoryPage.enterEnddate(driver, testData.getEffectiveDate());
			downloadHistoryPage.clickDownload(driver);
			downloadHistoryPage.clickReturntoBatchButton(driver);
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
	@Test(description="To verify that able to run the Service Metric Escalation Batch process", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC308(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to run the Service Metric Escalation Batch process",driver);

		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC308");
		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("su", "gw"); //Don't change the username here, su alone having batchprocess

			HeaderPage headerPage = new HeaderPage(driver);
			BatchProcessInfoPage batchProcessInfoPage=headerPage.clickGotoBatchProcess(driver);
			batchProcessInfoPage.clickBatchProcessRunButton(driver,testData.getBatchProcessName());
			batchProcessInfoPage.verifyBatchProcessLastRunStatus(driver,testData.getBatchProcessName());
			DownloadHistoryPage downloadHistoryPage=batchProcessInfoPage.clickBatchProcessDownloadHistory(driver,testData.getBatchProcessName());
			downloadHistoryPage.enterStartdate(driver, testData.getEffectiveDate());
			downloadHistoryPage.enterEnddate(driver, testData.getEffectiveDate());
			downloadHistoryPage.clickDownload(driver);
			downloadHistoryPage.clickReturntoBatchButton(driver);
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
	@Test(description="To verify that able to run the User Exception Batch process", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC312(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to run the User Exception Batch process",driver);

		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC312");
		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("su", "gw"); //Don't change the username here, su alone having batchprocess

			HeaderPage headerPage = new HeaderPage(driver);
			BatchProcessInfoPage batchProcessInfoPage=headerPage.clickGotoBatchProcess(driver);
			WorkQueueInfoPage workQueueInfoPage=batchProcessInfoPage.clickWorkQueueInfo(driver);
			workQueueInfoPage.verifyMaximumPoolSize(driver);
			workQueueInfoPage.verifyPoolSize(driver);
			workQueueInfoPage.verifyActiveThreadsCount(driver);
			workQueueInfoPage.verifyRefresh(driver);
			workQueueInfoPage.verifyDownload(driver);
			workQueueInfoPage.verifyDownloadRawData(driver);
			workQueueInfoPage.verifyWorkqueue(driver);
			workQueueInfoPage.verifyAvaialble(driver);
			workQueueInfoPage.verifyCheckedout(driver);
			workQueueInfoPage.verifyFailed(driver);
			workQueueInfoPage.verifyExecutors(driver);
			workQueueInfoPage.verifyClusterWide(driver);
			workQueueInfoPage.verifyClusterWide(driver);
			workQueueInfoPage.verifyActions(driver);
			workQueueInfoPage.clickRunWriter(driver,testData.getWorkQueueName());
			workQueueInfoPage.verifyAvailableValue(driver,testData.getWorkQueueName());
			workQueueInfoPage.verifyCheckedOutValue(driver,testData.getWorkQueueName());
			workQueueInfoPage.verifyFailedValue(driver,testData.getWorkQueueName());
			workQueueInfoPage.verifyExecutorsRuningValue(driver,testData.getWorkQueueName());
			workQueueInfoPage.verifyClusterWideValue(driver,testData.getWorkQueueName());
			workQueueInfoPage.verifyWriterStatusValue(driver,testData.getWorkQueueName());
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
	@Test(description="To verify that able to run the Workflow Batch process", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC314(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to run the Workflow Batch process",driver);

		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC314");
		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			HeaderPage headerPage = new HeaderPage(driver);
			BatchProcessInfoPage batchProcessInfoPage=headerPage.clickGotoBatchProcess(driver);
			batchProcessInfoPage.clickBatchProcessRunButton(driver,testData.getBatchProcessName());
			batchProcessInfoPage.verifyBatchProcessLastRunStatus(driver,testData.getBatchProcessName());
			DownloadHistoryPage downloadHistoryPage=batchProcessInfoPage.clickBatchProcessDownloadHistory(driver,testData.getBatchProcessName());
			downloadHistoryPage.enterStartdate(driver, testData.getEffectiveDate());
			downloadHistoryPage.enterEnddate(driver, testData.getEffectiveDate());
			downloadHistoryPage.clickDownload(driver);
			downloadHistoryPage.clickReturntoBatchButton(driver);
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
	@Test(description="To verify that able to run the ServiceRequestMetricsEscalation Batch process", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC316(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to run the ServiceRequestMetricsEscalation Batch process",driver);

		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC316");
		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			HeaderPage headerPage = new HeaderPage(driver);
			BatchProcessInfoPage batchProcessInfoPage=headerPage.clickGotoBatchProcess(driver);
			WorkQueueInfoPage workQueueInfoPage=batchProcessInfoPage.clickWorkQueueInfo(driver);
			workQueueInfoPage.verifyMaximumPoolSize(driver);
			workQueueInfoPage.verifyPoolSize(driver);
			workQueueInfoPage.verifyActiveThreadsCount(driver);
			workQueueInfoPage.verifyRefresh(driver);
			workQueueInfoPage.verifyDownload(driver);
			workQueueInfoPage.verifyDownloadRawData(driver);
			workQueueInfoPage.verifyWorkqueue(driver);
			workQueueInfoPage.verifyAvaialble(driver);
			workQueueInfoPage.verifyCheckedout(driver);
			workQueueInfoPage.verifyFailed(driver);
			workQueueInfoPage.verifyExecutors(driver);
			workQueueInfoPage.verifyClusterWide(driver);
			workQueueInfoPage.verifyClusterWide(driver);
			workQueueInfoPage.verifyActions(driver);
			workQueueInfoPage.clickRunWriter(driver,testData.getWorkQueueName());
			workQueueInfoPage.verifyAvailableValue(driver,testData.getWorkQueueName());
			workQueueInfoPage.verifyCheckedOutValue(driver,testData.getWorkQueueName());
			workQueueInfoPage.verifyFailedValue(driver,testData.getWorkQueueName());
			workQueueInfoPage.verifyExecutorsRuningValue(driver,testData.getWorkQueueName());
			workQueueInfoPage.verifyClusterWideValue(driver,testData.getWorkQueueName());
			workQueueInfoPage.verifyWriterStatusValue(driver,testData.getWorkQueueName());
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
	@Test(description="To verify that able to download the configuration in Info pages", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC292(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to download the configuration in Info pages",driver);

		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC292");

		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("su", "gw"); //Don't change the username here, su alone having batchprocess

			HeaderPage headerPage=new HeaderPage(driver);
			BatchProcessInfoPage batchProcessInfoPage=headerPage.clickGotoBatchProcess(driver);
			WorkQueueInfoPage workQueueInfoPage=batchProcessInfoPage.clickWorkQueueInfo(driver);
			workQueueInfoPage.clickStop(driver,testData.getWorkQueueName());
			workQueueInfoPage.clickByExecutors(driver);
			workQueueInfoPage.verifyHostName(driver);
			workQueueInfoPage.verifyProcessedItems(driver);
			workQueueInfoPage.verifyMaxNumberOfWorkers(driver);
			workQueueInfoPage.verifyExceptions(driver);
			workQueueInfoPage.verifyStarted(driver);
			workQueueInfoPage.verifyUpFor(driver);
			workQueueInfoPage.verifyStatusStopped(driver, testData.getStatus());
			workQueueInfoPage.clickRestart(driver,testData.getWorkQueueName());
			workQueueInfoPage.clickByExecutors(driver);
			workQueueInfoPage.verifyHostName(driver);
			workQueueInfoPage.verifyProcessedItems(driver);
			workQueueInfoPage.verifyMaxNumberOfWorkers(driver);
			workQueueInfoPage.verifyExceptions(driver);
			workQueueInfoPage.verifyStarted(driver);
			workQueueInfoPage.verifyUpFor(driver);
			workQueueInfoPage.verifyStatusRunning(driver, testData.getServiceStatus());

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
	@Test(description="To verify that able to download the configuration in Info pages", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC297(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify that able to download the configuration in Info pages",driver);

		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC297");

		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			HeaderPage headerPage = new HeaderPage(driver);
			BatchProcessInfoPage batchProcessInfoPage=headerPage.clickGotoBatchProcess(driver);
			batchProcessInfoPage.clickViewLogsPage(driver);
			ViewLogsPage viewLogsPage = new ViewLogsPage(driver);
			viewLogsPage.selectLogFile(driver, testData.getLogFile());
			viewLogsPage.enterMaxLinesToDisplaytail(driver, testData.getDescription());
			viewLogsPage.clickViewLogs(driver);
			viewLogsPage.verifyLogDetails(driver);
			viewLogsPage.verifyLogDetailsWithDate(driver,testData.getLogFile());

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
	@Test(description="To verify the Search functionality for home claim using Insured filter", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC345(String browser) throws Exception {
		
		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC345");
		
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the Search functionality for home claim using Insured filter",driver);

		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			HeaderPage headerPage=new HeaderPage(driver);
			headerPage.clickSearchToggleSubMenu(driver);
			headerPage.moveToClaim(driver);
			AdvanceSearchClaimsPage advanceSearchClaimsPage=headerPage.clickAdvancedSearch(driver);
			advanceSearchClaimsPage.enterClaim(driver, testData.getClaimNumber());
			advanceSearchClaimsPage.selectSearchFor(driver, testData.getSearchFor());
			advanceSearchClaimsPage.clickSearch(driver);
			advanceSearchClaimsPage.verifyClaimantValue(driver);
			advanceSearchClaimsPage.verifyInsuredName(driver);
			advanceSearchClaimsPage.verifyPolicyValue(driver);
			advanceSearchClaimsPage.verifyClaimantName(driver);
			advanceSearchClaimsPage.verifyLossDateValue(driver);
			advanceSearchClaimsPage.verifyStatusValue(driver);
			advanceSearchClaimsPage.clickClaimLink(driver)	;
			SummaryPage SummaryPage=new SummaryPage(driver);
			SummaryPage.verifyBasicsValues(driver);
			SummaryPage.verifyFinaicialsValues(driver);
			SummaryPage.verifyHighRiskIndicatorsValues(driver);
			SummaryPage.verifyLossDateInputValues(driver);
			SummaryPage.verifyLossLocationsInputValues(driver);
			SummaryPage.verifyExposuresValues(driver);

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
	@Test(description="To verify the Work Queue Info page", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC429(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the Work Queue Info page",driver);

		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC429");
		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			HeaderPage headerPage = new HeaderPage(driver);
			BatchProcessInfoPage batchProcessInfoPage=headerPage.clickGotoBatchProcess(driver);
			WorkQueueInfoPage workQueueInfoPage=batchProcessInfoPage.clickWorkQueueInfo(driver);
			workQueueInfoPage.verifyMaximumPoolSize(driver);
			workQueueInfoPage.verifyPoolSize(driver);
			workQueueInfoPage.verifyActiveThreadsCount(driver);
			workQueueInfoPage.verifyRefresh(driver);
			workQueueInfoPage.verifyDownload(driver);
			workQueueInfoPage.verifyDownloadRawData(driver);
			workQueueInfoPage.verifyWorkqueue(driver);
			workQueueInfoPage.verifyAvaialble(driver);
			workQueueInfoPage.verifyCheckedout(driver);
			workQueueInfoPage.verifyFailed(driver);
			workQueueInfoPage.verifyExecutors(driver);
			workQueueInfoPage.verifyClusterWide(driver);
			workQueueInfoPage.verifyClusterWide(driver);
			workQueueInfoPage.verifyActions(driver);
			workQueueInfoPage.clickRunWriter(driver,testData.getWorkQueueName());
			workQueueInfoPage.verifyAvailableValue(driver,testData.getWorkQueueName());
			workQueueInfoPage.verifyCheckedOutValue(driver,testData.getWorkQueueName());
			workQueueInfoPage.verifyFailedValue(driver,testData.getWorkQueueName());
			workQueueInfoPage.verifyExecutorsRuningValue(driver,testData.getWorkQueueName());
			workQueueInfoPage.verifyClusterWideValue(driver,testData.getWorkQueueName());
			workQueueInfoPage.verifyWriterStatusValue(driver,testData.getWorkQueueName());
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
	@Test(description="To verify the Search functionality for Inland marine claim using Insured filter", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC347(String browser) throws Exception {
		
		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC347");
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the Search functionality for Inland marine claim using Insured filter",driver);

		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			HeaderPage headerPage=new HeaderPage(driver);
			
			headerPage.clickSearchToggleSubMenu(driver);
			headerPage.moveToClaim(driver);
			AdvanceSearchClaimsPage advanceSearchClaimsPage=headerPage.clickAdvancedSearch(driver);
			advanceSearchClaimsPage.enterClaim(driver, testData.getClaimNumber());
			advanceSearchClaimsPage.selectSearchFor(driver, testData.getSearchFor());
			advanceSearchClaimsPage.clickSearch(driver);
			advanceSearchClaimsPage.verifyClaimantValue(driver);
			advanceSearchClaimsPage.verifyInsuredName(driver);
			advanceSearchClaimsPage.verifyPolicyValue(driver);
			advanceSearchClaimsPage.verifyLossDateValue(driver);
			advanceSearchClaimsPage.verifyStatusValue(driver);
			advanceSearchClaimsPage.clickClaimLink(driver)	;
			SummaryPage SummaryPage=new SummaryPage(driver);
			SummaryPage.verifyBasicsValues(driver);
			SummaryPage.verifyFinaicialsValues(driver);
			SummaryPage.verifyHighRiskIndicatorsValues(driver);
			SummaryPage.verifyLossDateInputValues(driver);
			SummaryPage.verifyLossLocationsInputValues(driver);
			SummaryPage.verifyExposuresValues(driver);

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
	@Test(description="To verify the New Matter is added under Litigation page in a claim", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC207(String browser) throws Exception {


		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the New Matter is added under Litigation page in a claim",driver);

		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC207");
		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.clicktoggleClaimSubMenu(driver);
			ActionsPage actionsPage = new ActionsPage(driver);
			actionsPage.enterClaimNumber(driver, testData.getClaimNumber());
			actionsPage.clickSearchClaim(driver);
			SummaryPage summaryPage = new SummaryPage(driver);
			summaryPage.clickLitigation(driver);
			LitigationPage litigationPage = new LitigationPage(driver);
			litigationPage.clickNewMatter(driver);
			NewMatterPage newMatterPage = new NewMatterPage(driver);
			newMatterPage.enterName(driver, testData.getName());
			newMatterPage.clickUpdate(driver);
			NewMatterNamePage newMatterNamePage =  new NewMatterNamePage(driver);
			newMatterNamePage.clickUpToLitigation(driver);
			litigationPage.selectName(driver);
			litigationPage.verifyAssign(driver);
			litigationPage.verifyCloseMatter(driver);
			litigationPage.verifyMyCalendar(driver);
			litigationPage.verifyNewMatter(driver);
			litigationPage.verifyRefresh(driver);
			litigationPage.verifySupervisorCalendar(driver);

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
	@Test(description="To verify the Search functionality for home claim using 'Simple Search'", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC317(String browser) throws Exception {
		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC317");

		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the Search functionality for home claim using 'Simple Search'",driver);

		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			HeaderPage headerPage=new HeaderPage(driver);
			headerPage.clickSearchToggleSubMenu(driver);
			headerPage.moveToClaim(driver);
			SearchClaimsPage searchClaimsPage=headerPage.clickSimpleSearch(driver);
			searchClaimsPage.enterClaim(driver, testData.getClaimNumber());
			searchClaimsPage.selectSearchFor(driver, testData.getSearchFor());
			searchClaimsPage.clickSearch(driver);
			searchClaimsPage.verifyClaimantValue(driver);
			searchClaimsPage.verifyInsuredName(driver);
			searchClaimsPage.verifyPolicyValue(driver);
			searchClaimsPage.verifyLossDateValue(driver);
			searchClaimsPage.verifyStatusValue(driver);
			searchClaimsPage.clickClaimLink(driver)	;
			SummaryPage SummaryPage=new SummaryPage(driver);
			SummaryPage.verifyBasicsValues(driver);
			SummaryPage.verifyFinaicialsValues(driver);
			SummaryPage.verifyHighRiskIndicatorsValues(driver);
			SummaryPage.verifyLossDateInputValues(driver);
			SummaryPage.verifyLossLocationsInputValues(driver);
			SummaryPage.verifyExposuresValues(driver);

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
	@Test(description="To verify the search functionality in checks page using the claim number", dataProviderClass = DataProviderUtils.class, dataProvider = "parallelTestDataProvider")
	public void TC368(String browser) throws Exception {

		NonLobDataEngine testData = new NonLobDataEngine("CC_GWTestData_DataEngine.xlsx", "NonLob", "TC368");
		DriverManager.setDriver(browser);
		WebDriver driver = DriverManager.getDriver();
		Log.testCaseInfo("To verify the search functionality in checks page using the claim number",driver);

		try {	

			NonLobImpl cc = NonLobSteps.create();

			cc.loginIntoTheApplication("su", "gw");

			// Data: Bulk Invoice Creation
			HeaderPage headerPage=new HeaderPage(driver);
			headerPage.clicktoggleDesktopSubMenu(driver);
			headerPage.clickBulkInvoices(driver);
			BulkInvoicePage bulkInvoicePage=new BulkInvoicePage(driver);
			bulkInvoicePage.clickCreateNew(driver);
			BulkInvoiceDetailsPage bulkInvoiceDetailsPage=new BulkInvoiceDetailsPage(driver);
			bulkInvoiceDetailsPage.enterInvoice(driver,testData.getRandomText());
			bulkInvoiceDetailsPage.enterPayTotheOrderof(driver,testData.getRandomText());
			bulkInvoiceDetailsPage.enterRecipient(driver, testData.getFirstName());
			bulkInvoiceDetailsPage.clickAdd(driver);
			bulkInvoiceDetailsPage.enterClaimNumber(driver, testData.getClaimNumber());
			bulkInvoiceDetailsPage.clickReserveLineHeader(driver);
			bulkInvoiceDetailsPage.selectReserveLine(driver);
			bulkInvoiceDetailsPage.enterAmount(driver,testData.getAmount());
			bulkInvoiceDetailsPage.clickPayeeMenuIcon(driver);
			bulkInvoiceDetailsPage.clickPayeeSearch(driver);
			SearchAddressBookPage searchAddressBookPage = new NewAccountDetailPage(driver).new SearchAddressBookPage(driver);
			searchAddressBookPage.clickSearchByDistance(driver);
			searchAddressBookPage.selectSearchRadius(driver, testData.getSearchRadius());			
			searchAddressBookPage.selectCountry(driver, testData.getCountry());
			searchAddressBookPage.selectState(driver, testData.getState());
			searchAddressBookPage.clickSearch(driver);
			searchAddressBookPage.clickSelect(driver);
			bulkInvoiceDetailsPage.clickUpdate(driver);
			// Testcase 
			headerPage.clickSearchToggleSubMenu(driver);
			SearchBulkInvoicesPage searchBulkInvoicesPage=headerPage.clickBulkInvoicesButton(driver);
			searchBulkInvoicesPage.enterClaim(driver, testData.getClaimNumber());
			searchBulkInvoicesPage.clickSearch(driver);
			searchBulkInvoicesPage.verifyTotalAmountValue(driver);
			searchBulkInvoicesPage.verifyInvoiceLabel(driver);

			Log.testCaseResult(driver);
		} catch (Exception e) {
			Log.exception(e, DriverManager.getDriver());
		} finally {
			DriverManager.quitDriver(driver);
			Log.endTestCase();
		}
	}

	
}
