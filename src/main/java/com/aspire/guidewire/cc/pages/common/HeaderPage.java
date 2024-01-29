package com.aspire.guidewire.cc.pages.common;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.testng.Assert;

import com.aspire.guidewire.cc.pages.nonlob.AdvanceSearchClaimsPage;
import com.aspire.guidewire.cc.pages.nonlob.BatchProcessInfoPage;
import com.aspire.guidewire.cc.pages.nonlob.CalendarPage;
import com.aspire.guidewire.cc.pages.nonlob.ClaimsPage;
import com.aspire.guidewire.cc.pages.nonlob.ExposuresPage;
import com.aspire.guidewire.cc.pages.nonlob.QueuedActivitiesPage;
import com.aspire.guidewire.cc.pages.nonlob.SearchActivitiesPage;
import com.aspire.guidewire.cc.pages.nonlob.SearchBulkInvoicesPage;
import com.aspire.guidewire.cc.pages.nonlob.SearchChecksPage;
import com.aspire.guidewire.cc.pages.nonlob.SearchClaimsPage;
import com.aspire.guidewire.cc.pages.nonlob.SearchRecoveriesPage;
import com.aspire.guidewire.cc.pages.nonlob.SetLogLevelPage;
import com.aspire.guidewire.cc.pages.nonlob.SummaryPage;
import com.aspire.guidewire.cc.pages.nonlob.WorkflowStatisticsPage;
import com.aspire.guidewire.cc.pages.nonlob.WorkflowsPage;
import com.aspire.guidewire.utils.BrowserActions;
import com.aspire.guidewire.utils.ElementLayer;
import com.aspire.guidewire.utils.Log;
import com.aspire.guidewire.utils.Utils;
import com.aspire.guidewire.utils.WaitUtils;
import com.aspire.guidewire.webdriverManager.DriverManager;

import ASPIREAI.customfactories.AjaxElementLocatorFactory;
import ASPIREAI.customfactories.IFindBy;
import ASPIREAI.customfactories.PageFactory;

public class HeaderPage extends LoadableComponent<HeaderPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	@IFindBy(how = How.XPATH, using = "//div[@id='TabBar-ClaimTab']//following::div[@data-gw-click ='toggleSubMenu']", AI = false)
	public WebElement toggleClaimSubMenu;

	@IFindBy(how = How.CSS, using = "div[id$=TabBar-ClaimTab-ClaimTab_FNOLWizard]", AI = false)
	public WebElement tabNewClaim;

	@IFindBy(how = How.XPATH, using = "//div[@id='TabBar-AdminTab']//following::div[@class='gw-action--expand-button']", AI = false)
	public WebElement toggleAdminSubMenu;

	@IFindBy(how = How.CSS, using = "div[id$='TabBar-AdminTab']", AI = false)
	public WebElement btnAdministration;

	@IFindBy(how = How.CSS, using = "div[id$='more-options']", AI = false)
	public WebElement btnMoreOptions;

	@IFindBy(how = How.XPATH, using = "//div[contains(@id,'Admin_UsersAndSecurity')]//following::div[@class='gw-icon gw-icon--expand']", AI = false)
	public WebElement toggleUserSubMenu;

	@IFindBy(how = How.CSS, using = "div[id$='UsersAndSecurity_AdminUserSearchPage']", AI = false)
	public WebElement lnkUsers;

	@IFindBy(how = How.CSS, using = "div[id$='UsersAndSecurity_AdminGroupSearchPage']", AI = false)
	public WebElement lnkGroup;

	@IFindBy(how = How.CSS, using = "div[id$='UsersAndSecurity_Roles']", AI = false)
	public WebElement lnkRoles;

	@IFindBy(how = How.CSS, using = "div[id$='UsersAndSecurity_Regions']", AI = false)
	public WebElement lnkRegions;

	@IFindBy(how = How.CSS, using = "div[id$='ClaimSearchesGroup']", AI = false)
	public WebElement lblClaim;

	@IFindBy(how = How.CSS, using = "div[id$='SimpleClaimSearch']", AI = false)
	public WebElement lblSimpleSearch;

	@IFindBy(how = How.XPATH, using = "//div[@id='TabBar-SearchTab']//following::div[@data-gw-click='toggleSubMenu']", AI = false)
	public WebElement toggleSearchMenu;

	@IFindBy(how = How.CSS, using = "div[id$='ClaimSearchesGroup_ClaimSearch']", AI = false)
	public WebElement lblAdvancedSearch;

	@IFindBy(how = How.XPATH, using = "//div[text()='Monitoring']//following::div[@data-gw-click='toggleSubMenu']", AI = false)
	public WebElement toggleMonitoringSubmenu;

	@IFindBy(how = How.CSS, using = "div[id$='Monitoring_WorkflowSearch']", AI = false)
	public WebElement lnkWorkflows;

	@IFindBy(how = How.CSS, using = "div[id$='Monitoring_WorkflowStats']", AI = false)
	public WebElement lnkWorkflowsStatistics;

	@IFindBy(how = How.CSS, using = "div[id$='Search_ActivitySearch']", AI = false)
	public WebElement lblActivities;

	@IFindBy(how = How.CSS, using = "div[id$='Search_PaymentSearch']", AI = false)
	public WebElement lblChecks;

	@IFindBy(how = How.CSS, using = "div[id$='Search_RecoverySearch']", AI = false)
	public WebElement lblRecoverySearch;

	@IFindBy(how = How.CSS, using = "div[id$='Search_BulkInvoiceSearch']", AI = false)
	public WebElement lblBulkInvoiceSearch;

	@IFindBy(how = How.XPATH, using = "//div[@id='TabBar-DesktopTab']//following::div[@class='gw-action--expand-button']", AI = false)
	public WebElement toggleDesktopSubMenu;

	@IFindBy(how = How.CSS, using = "div[id$='DesktopActivities']", AI = false)
	public WebElement btnActivities;

	@IFindBy(how = How.CSS, using = "div[id$='UsersAndSecurity_SecurityZones']", AI = false)
	public WebElement lnkSecurityZones;

	@IFindBy(how = How.CSS, using = "div[id$='UsersAndSecurity_AuthorityLimitProfiles']", AI = false)
	public WebElement lnkAuthorityLimitProfiles;

	@IFindBy(how = How.CSS, using = "div[id$='UsersAndSecurity_Attributes']", AI = false)
	public WebElement lnkAttribute;

	@IFindBy(how = How.CSS, using = "div[id$='UsersAndSecurity_PortalAuthorizationAdminPage']", AI = false)
	public WebElement lnkPortalAuthorization;

	@IFindBy(how = How.XPATH, using = "//div[contains(@id,'Admin_SpecialHandling')]//following::div[@class='gw-icon gw-icon--expand']", AI = false)
	public WebElement toggleSpecialHandlingSubMenu;

	@IFindBy(how = How.CSS, using = "div[id$='SpecialHandling_AccountAdmin']", AI = false)
	public WebElement btnSpecialHandlingAccount;

	@IFindBy(how = How.CSS, using = "div[id$='SpecialHandling_CustomerServiceTierAdmin']", AI = false)
	public WebElement btnSpecialHandlingServiceTiers;

	@IFindBy(how = How.XPATH, using = "//div[contains(@id,'Admin_BusinessSettings')]//following::div[@class='gw-action--expand-button']", AI = false)
	public WebElement toggleBusinessSettings;

	@IFindBy(how = How.CSS, using = "div[id$='BusinessSettings_BusinessRules']", AI = false)
	public WebElement lnkBusinessSettings;

	@IFindBy(how = How.CSS, using = "div[id$='BusinessRules_ActivityRules']", AI = false)
	public WebElement lnkActivityRules;

	@IFindBy(how = How.CSS, using = "div[id$='BusinessRules_ExposureRules']", AI = false)
	public WebElement lnkExposureRules;

	@IFindBy(how = How.CSS, using = "div[id$='BusinessRules_ReserveRules']", AI = false)
	public WebElement lnkReserveRules;

	@IFindBy(how = How.CSS, using = "div[id$='BusinessSettings_ActivityPatterns']", AI = false)
	public WebElement lnkActivityPatterns;

	@IFindBy(how = How.CSS, using = "div[id$='Desktop_DesktopClaims']", AI = false)
	public WebElement lblClaims;
	
	@IFindBy(how = How.CSS, using = "div[id$='DesktopTab-Desktop_DesktopQueuedActivities']", AI = false)
	public WebElement lblQueues;
	
	@IFindBy(how = How.CSS, using = "div[id$='DesktopTab-Desktop_DesktopCalendarGroup']", AI = false)
	public WebElement lblCalendar;
	
	@IFindBy(how = How.CSS, using = "div[id$='-DesktopTab-Desktop_DesktopCalendarGroup-DesktopCalendarGroup_Calendar']", AI = false)
	public WebElement lblMyCalendar;
	
	@IFindBy(how = How.CSS, using = "div[id$='DesktopTab-Desktop_DesktopCalendarGroup-DesktopCalendarGroup_SupervisorCalendar']", AI = false)
	public WebElement lblSupervisorCalendar;
	
	@IFindBy(how = How.CSS, using = "div[id$='TabBar-DesktopTab-Desktop_BulkPay']", AI = false)
	public WebElement lblBulkInvoices;
	
	@IFindBy(how = How.CSS, using = "div[id$='Desktop_DesktopExposures']", AI = false)
	public WebElement lblExposures;
	
	@IFindBy(how = How.CSS, using = "div[id$='_ICD']", AI = false)
	public WebElement lnkICDCodes;
	
	@IFindBy(how = How.CSS, using = "div[id$='BusinessSettings_BusinessWeek']", AI = false)
	public WebElement lnkBusinessWeek;
	
	@IFindBy(how = How.CSS, using = "div[id$='PrintButton']", AI = false)
	public WebElement btnPrint;
	
	 @IFindBy(how = How.TAG_NAME, using = "html", AI = false)
	 public WebElement lnkHtml;
	
	@IFindBy(how = How.CSS, using = "div[id$='MenuLinks-ServerTools_SetLogLevel']", AI = false)
	public WebElement lnkSetLogLevelPage;

	@IFindBy(how = How.CSS, using = "div[id$='BusinessSettings_Catastrophes']", AI = false)
	public WebElement lnkCatastrophes;
	
	@IFindBy(how = How.CSS, using = "div[id$='BusinessSettings_Holidays']", AI = false)
	public WebElement lnkBusinessHoildays;

	@IFindBy(how = How.CSS, using = "div[id$='BusinessSettings_KeyMetrics']", AI = false)
	public WebElement lnkMetricsThresholds;
	
	@IFindBy(how = How.CSS, using = "div[id$='BusinessSettings_ReinsuranceThresholds']", AI = false)
	public WebElement lnkReinsuranceThresholds;

	@IFindBy(how = How.XPATH, using = "//div[contains(@id,'BusinessSettings_WCParms')]//following::div[@class='gw-action--expand-button']", AI = false)
	public WebElement toggleWCParameters;
	
	@IFindBy(how = How.CSS, using = "div[id$='WCParms_WCBenefitParameterSet']", AI = false)
	public WebElement lnkWCBenefitParameter;

	@IFindBy(how = How.CSS, using = "div[id$='WCParms_WCPDBenefits']", AI = false)
	public WebElement lnkWCPPDMaxMin;
	
	@IFindBy(how = How.CSS, using = "div[id$='WCParms_WCPDWeeksAndLimits']", AI = false)
	public WebElement lnkWCPPDWeeks;

	@IFindBy(how = How.CSS, using = "div[id$='WCParms_DenialPeriods']", AI = false)
	public WebElement lnkCompensabilityParameter;
	
	@IFindBy(how = How.XPATH, using = "//div[contains(@id,'Admin_Utilities')]//following::div[@class='gw-action--expand-button']", AI = false)
	public WebElement toggleUtilities;

	@IFindBy(how = How.CSS, using = "div[id$='Utilities_ExportData']", AI = false)
	public WebElement lnkExportData;
	
	@IFindBy(how = How.CSS, using = "div[id$='Utilities_ScriptParametersPage']", AI = false)
	public WebElement lnkScriptParameter;

	@IFindBy(how = How.CSS, using = "div[id$='Utilities_Properties']", AI = false)
	public WebElement lnkRunTimeProperties;
	
	@IFindBy(how = How.CSS, using = "div[id='TabBar-ClaimTab-0-ClaimMenuClaim']", AI = false)
	public WebElement lblClaim_1;
	
	@IFindBy(how = How.CSS, using = "div[id='gw-TabBarWidget--settings']", AI = false)
	public WebElement btnSetting;
	
	@IFindBy(how = How.CSS, using = "div[id='TabBar-LogoutTabBarLink']", AI = false)
	public WebElement lnkLogout;
	
	@IFindBy(how = How.CSS, using = "div[id$='Insured']", AI = false)
	public WebElement lblInsuredName;
	
	@IFindBy(how = How.CSS, using = "div[id$='MessagingDestinationControlList']", AI = false)
	public WebElement btnMessageQueue;


	public HeaderPage() {}

	public HeaderPage(WebDriver driver){
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, Utils.maxElementWait);
		PageFactory.initElements(finder, this);
		elementLayer = new ElementLayer(driver);
	}

	@Override
	protected void load() {
		isPageLoaded = true;
		WaitUtils.waitForPageLoad(driver);
	}// load

	@Override
	protected void isLoaded() {
		if (!isPageLoaded) {
			Assert.fail();
		}

		if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, toggleClaimSubMenu))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}
		elementLayer = new ElementLayer(driver);
	}// isLoaded

	public HeaderPage clicktoggleClaimSubMenu(WebDriver driver)  {
		BrowserActions.click(driver, toggleClaimSubMenu,"ToggleClaimSubMenu");
		return this;
	}

	public SearchOrCreatePolicyPage clickNewClaim(WebDriver driver)  {
		BrowserActions.click(driver, tabNewClaim,"New Claim");
		return new SearchOrCreatePolicyPage(driver).get();
	}

	public HeaderPage clickTopBarThreeDotMoreOption(WebDriver driver)  {
		BrowserActions.click(driver, btnMoreOptions,"More Option");
		return this;
	}

	public HeaderPage clicktoggleAdminSubMenu(WebDriver driver)  {
		BrowserActions.click(driver, toggleAdminSubMenu,"toggleAdminSubMenu");
		return this;
	}
	
	/**
	 * clicks on "Action"
	 * @return HeaderPage
	 */
	public HeaderPage clickAdministrationbutton(WebDriver driver){
		BrowserActions.click(driver, btnAdministration, "Administration");
		Log.messageStep("Clicked on Administration",driver);
		return this;
	}

	public void clickUserAndSecurityToggle(WebDriver driver) {
		BrowserActions.click(driver, toggleUserSubMenu, "User Toggle"); 
		Log.messageStep("Clicked on Userandsecurity toggle",driver);
	}

	public void clickUser(WebDriver driver) {
		BrowserActions.click(driver, lnkUsers, "User button"); 
		Log.messageStep("Clicked on User",driver);
	}

	public void clickGroups(WebDriver driver) {
		BrowserActions.click(driver, lnkGroup, "Groups Button"); 
	}

	public void clickRoles(WebDriver driver){
		BrowserActions.click(driver,lnkRoles, "lnk Roles");
	}

	public void clickRegions(WebDriver driver){
		BrowserActions.click(driver,lnkRegions, "Regions");
	}
	public HeaderPage clickToggleMonitoringSubmenu(WebDriver driver){
		BrowserActions.click(driver,toggleMonitoringSubmenu, "monitoring submenu");
		return this;
	}


	/**
	 * Used to click on "Toggle Search Menu"
	 * @author anitha.raphel
	 * @param driver
	 * @return 
	 */
	public HeaderPage clickSearchToggleSubMenu(WebDriver driver)  {
		BrowserActions.click(driver, toggleSearchMenu,2,"Toggle Search Menu");
		return this;
	}

	public void clickSecurityZones(WebDriver driver){
		BrowserActions.click(driver,lnkSecurityZones, "Security Zones");
	}

	public void clickAuthorityLimitProfile(WebDriver driver){
		BrowserActions.click(driver,lnkAuthorityLimitProfiles, "Authority Limit Profiles");
	}

	public void clickAttribute(WebDriver driver){
		BrowserActions.click(driver,lnkAttribute, "Attribute");
	}

	public void clickPortalAuthorization(WebDriver driver){
		BrowserActions.click(driver,lnkPortalAuthorization, "Portal Authorization");
	}

	public void clickSpecialHandlingToggle(WebDriver driver) {
		BrowserActions.click(driver, toggleSpecialHandlingSubMenu, "Special Handling Toggle"); 
	}

	public void clickSpecialHandlingAccount(WebDriver driver) {
		BrowserActions.click(driver, btnSpecialHandlingAccount, "Special Handling Account"); 
	}

	public void clickSpecialHandlingServiceTier(WebDriver driver) {
		BrowserActions.click(driver, btnSpecialHandlingServiceTiers, "Special Handling Service Tier"); 
	}

	public void clickBusinessSettingsToggle(WebDriver driver) {
		BrowserActions.click(driver, toggleBusinessSettings, "Business Settings Toggle"); 
	}

	public void clickBusinessSettings(WebDriver driver) {
		BrowserActions.click(driver, lnkBusinessSettings, "Business Settings"); 
	}

	public void clickActivityRules(WebDriver driver) {
		BrowserActions.click(driver, lnkActivityRules, "Activity Rules"); 
	}


	/**
	 * Used to click on "Simple Search"
	 * @author anitha.raphel
	 * @param driver
	 * @return 
	 */
	public SearchClaimsPage clickSimpleSearch(WebDriver driver)  {
		BrowserActions.click(driver, lblSimpleSearch,"Simple Search");
		Log.messageStep("Clicked on Simple Search", DriverManager.getDriver());;
		return new SearchClaimsPage(driver).get();
	}

	/**
	 * Used to Mouse over on "Claim"
	 * @author anitha.raphel
	 * @param driver
	 * @return 
	 */
	public HeaderPage moveToClaim(WebDriver driver)  {
		BrowserActions.moveToElement(driver, lblClaim,"Claim");
		return this;
	}

	/**
	 * Used to click on "Advanced Search"
	 * @author anitha.raphel
	 * @param driver
	 * @return 
	 */
	public AdvanceSearchClaimsPage clickAdvancedSearch(WebDriver driver)  {
		BrowserActions.click(driver, lblAdvancedSearch,"Advanced Search");
		Log.messageStep("Clicked on Advance Search", DriverManager.getDriver());
		return new AdvanceSearchClaimsPage(driver).get();
	}

	public void clickExposureRules(WebDriver driver) {
		BrowserActions.click(driver, lnkExposureRules, "Exposure Rules"); 
	}

	/**
	 * Used to click ActivitiesButton
	 * @author charu.anbarasan
	 * @param driver
	 * @return
	 */
	public SearchActivitiesPage clickActivitiesSearchButton(WebDriver driver)  {
		BrowserActions.click(driver, lblActivities,"Activities");
		return new SearchActivitiesPage(driver).get();
	}

	/**
	 * Used to click CheckButton
	 * @author charu.anbarasan
	 * @param driver
	 * @return
	 */
	public SearchChecksPage clickCheckButton(WebDriver driver)  {
		BrowserActions.click(driver, lblChecks,"Checks");
		return new SearchChecksPage(driver).get();
	}

	/**
	 * Used to click RecoveriesButton
	 * @author charu.anbarasan
	 * @param driver
	 * @return
	 */
	public SearchRecoveriesPage clickRecoveriesButton(WebDriver driver)  {
		BrowserActions.click(driver, lblRecoverySearch,"Recoveries");
		return new SearchRecoveriesPage(driver).get();
	}

	/**
	 * Used to click RecoveriesButton
	 * @author charu.anbarasan
	 * @param driver
	 * @return
	 */
	public SearchBulkInvoicesPage clickBulkInvoicesButton(WebDriver driver)  {
		BrowserActions.click(driver, lblBulkInvoiceSearch,"Bulk Invoices");
		return new SearchBulkInvoicesPage(driver).get();
	}
	public HeaderPage clicktoggleDesktopSubMenu(WebDriver driver)  {
		BrowserActions.click(driver, toggleDesktopSubMenu,"toggleDesktopSubMenu");
		return this;
	}
	public ActivitiesPage clickActivitiesButton(WebDriver driver)  {
		BrowserActions.click(driver, btnActivities,"Activities");
		return new ActivitiesPage(driver).get();
	}
	public ClaimsPage clickClaims(WebDriver driver)  {
		BrowserActions.click(driver, lblClaims,"Claims");
		return new ClaimsPage(driver).get();
	}
	public QueuedActivitiesPage clickQueues(WebDriver driver)  {
		BrowserActions.click(driver, lblQueues,"Queues");
		return new QueuedActivitiesPage(driver).get();
	}
	public HeaderPage moveToCalendar(WebDriver driver)  {
		BrowserActions.moveToElement(driver, lblCalendar,"Calendar");
		return this;
	}
	
	public CalendarPage clickMyCalendar(WebDriver driver)  {
		BrowserActions.click(driver, lblMyCalendar,"MyCalendar");
		Log.messageStep("Calender Button is Clicked to view Details of Calenders",DriverManager.getDriver());
		return new CalendarPage(driver).get();
	}
	
	public CalendarPage clickSupervisorCalendar(WebDriver driver)  {
		BrowserActions.click(driver, lblSupervisorCalendar,"SupervisorCalendar");
		Log.messageStep("Supervisor Calender Button is Clicked to view Details of Supervisor Calenders",DriverManager.getDriver());
		return new CalendarPage(driver).get();
	}
	
	public HeaderPage clickBulkInvoices(WebDriver driver)  {
		BrowserActions.click(driver, lblBulkInvoices,"Bulk Invoices");
		Log.messageStep("Bulk Invoice Button is Clicked to view Details of Bulk Invoice",DriverManager.getDriver());
		return this;
	}
	public ExposuresPage clickExposures(WebDriver driver)  {
		BrowserActions.click(driver, lblExposures,"Exposures");
		return new ExposuresPage(driver).get();
	}
	
	public BatchProcessInfoPage clickGotoBatchProcess(WebDriver driver) {
		String selectAll = Keys.chord(Keys.ALT, Keys.SHIFT,"t");
		lnkHtml.sendKeys(selectAll);
		Log.messageStep("Entered Alt+Shift+T", DriverManager.getDriver());
		return new BatchProcessInfoPage(driver).get();
	}

	public void clickReserveRules(WebDriver driver) {
		BrowserActions.click(driver, lnkReserveRules, "Reserve Rules");
		Log.messageStep("aaa", DriverManager.getDriver());

	}

	public void clickActivityPatterns(WebDriver driver) {
		BrowserActions.click(driver, lnkActivityPatterns, "Activity Patterns"); 
	}

	public void clickBusinessWeek(WebDriver driver) {
		BrowserActions.click(driver, lnkBusinessWeek, "Business Week"); 
	}
	
	public SetLogLevelPage clickSetLogLevelPage(WebDriver driver) {
		BrowserActions.click(driver, lnkSetLogLevelPage, "SetLogLevelPage"); 
		Log.messageStep("SetLogLevel button is Clicked to view Details of SetLogLevel",DriverManager.getDriver());
		return new SetLogLevelPage(driver).get();
	}
	public ICDCodesPage clickICDCodes(WebDriver driver)  {
		BrowserActions.click(driver, lnkICDCodes,"ICD codes");
		return new ICDCodesPage(driver).get();
	}

	public void clickCatastrophes(WebDriver driver) {
		BrowserActions.click(driver, lnkCatastrophes, "Catastrophes"); 
	}

	public WorkflowsPage clickWorkflows(WebDriver driver){
		BrowserActions.click(driver,lnkWorkflows, "workflow ");
		return new WorkflowsPage(driver).get();
	}
	public WorkflowStatisticsPage clickWorkflowStatistics(WebDriver driver){
		BrowserActions.click(driver,lnkWorkflowsStatistics, "workflow statistics");
		return new WorkflowStatisticsPage(driver).get();
	}
	
	public void clickBusinessHoildays(WebDriver driver) {
		BrowserActions.click(driver, lnkBusinessHoildays, "Business Hoildays"); 
	}

	public void clickReinsuranceThresholds(WebDriver driver) {
		BrowserActions.click(driver, lnkReinsuranceThresholds, "Reinsurance Thresholds"); 
	}

	public void clickMetricsThresholds(WebDriver driver) {
		BrowserActions.click(driver, lnkMetricsThresholds, "Metrics Thresholds"); 
	}

	public void clickToggleWCParameters(WebDriver driver) {
		BrowserActions.click(driver, toggleWCParameters, "Toggle WC Parameters"); 
	}

	public void clickWCBenefitParameter(WebDriver driver) {
		BrowserActions.click(driver, lnkWCBenefitParameter, "WC Benefit Parameter"); 
	}
	

	public void clickWCPPDMaxMin(WebDriver driver) {
		BrowserActions.click(driver, lnkWCPPDMaxMin, "WC PPDMaxMin"); 
	}
	
	public void clickWCPPDWeeks(WebDriver driver) {
		BrowserActions.click(driver, lnkWCPPDWeeks, "WC PPDWeeks"); 
	}

	public void clickCompensabilityParameters(WebDriver driver) {
		BrowserActions.click(driver, lnkCompensabilityParameter, "Compensability parameter"); 
	}
	
	public void clickUtilitiesToggle(WebDriver driver) {
		BrowserActions.click(driver, toggleUtilities, "Utilities toggle"); 
	}

	public void clickExportData(WebDriver driver) {
		BrowserActions.click(driver, lnkExportData, "Export Data"); 
	}

	public void clickScriptParameter(WebDriver driver) {
		BrowserActions.click(driver, lnkScriptParameter, "Script Parameter"); 
	}

	public void clickRunTimeProperties(WebDriver driver) {
		BrowserActions.click(driver, lnkRunTimeProperties, "Run Time Properties"); 
	}
	
	public SummaryPage clickClaim(WebDriver driver) {
		BrowserActions.click(driver, lblClaim_1, "claim");
		return new SummaryPage(driver).get(); 
	}
	
	public HeaderPage clickSettings(WebDriver driver) {
		BrowserActions.click(driver, btnSetting, "Setting Buttons"); 
		return this;
	}
	
	public HeaderPage clickLogout(WebDriver driver) {
		BrowserActions.click(driver, lnkLogout, "Logout Label"); 
		return this;
	}
	public String getInsureName(WebDriver driver) {
		BrowserActions.waitForNetworkIdleState(driver, 3);
		String text = BrowserActions.getText(driver, lblInsuredName, "Insured Name"); 
		return text;
	}

	public HeaderPage clickMessageQueue(WebDriver driver) {
		BrowserActions.click(driver, btnMessageQueue, "MessageQueue"); 
		return this;
	}
}


