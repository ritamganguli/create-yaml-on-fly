package com.aspire.guidewire.pc.pages.common;

import java.util.ArrayList;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.testng.Assert;

import com.aspire.guidewire.pc.pages.nonlob.MyActivitiesPage;
import com.aspire.guidewire.pc.pages.nonlob.SearchAccountsPage;
import com.aspire.guidewire.pc.pages.nonlob.SearchActivitiesPage;
import com.aspire.guidewire.pc.pages.nonlob.SearchContactsPage;
import com.aspire.guidewire.pc.pages.nonlob.SearchProducerCodes;
import com.aspire.guidewire.utils.BrowserActions;
import com.aspire.guidewire.utils.ElementLayer;
import com.aspire.guidewire.utils.Log;
import com.aspire.guidewire.utils.Utils;
import com.aspire.guidewire.utils.WaitUtils;

import ASPIREAI.customfactories.AjaxElementLocatorFactory;
import ASPIREAI.customfactories.IFindBy;
import ASPIREAI.customfactories.PageFactory;

public class HeaderPage extends LoadableComponent<HeaderPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	@IFindBy(how = How.CSS, using = "div[id$='GuidewireLogoWidget']", AI = false)
	public WebElement ttlPolicyCenterLogo;

	@IFindBy(how = How.ID, using = "TabBar-AccountTab", AI = false)
	public WebElement tabAccount;

	@IFindBy(how = How.XPATH, using = "//div[@id='TabBar-AccountTab']//child::div[@data-gw-click='toggleSubMenu']", AI = false)
	public WebElement toggleAccountSubMenu;
	
	@IFindBy(how = How.ID, using = "TabBar-PolicyTab", AI = false)
	public WebElement tabPolicy;
	
	@IFindBy(how = How.XPATH, using = "//div[@id='TabBar-PolicyTab']//child::div[@class='gw-action--expand-button']", AI = false)
	public WebElement togglePolicySubMenu;

	@IFindBy(how = How.ID, using = "TabBar-DesktopTab", AI = false)
	public WebElement tabDesktop;

	@IFindBy(how = How.XPATH, using = "//div[@id='TabBar-DesktopTab']//following::div[@class='gw-action--expand-button']", AI = false)
	public WebElement toggleDesktopSubMenu;

	@IFindBy(how = How.ID, using = "TabBar-ContactTab", AI = false)
	public WebElement tabContact;

	@IFindBy(how = How.XPATH, using = "//div[@id='TabBar-ContactTab']//following::div[@class='gw-action--expand-button']", AI = false)
	public WebElement toggleContactSubMenu;

	@IFindBy(how = How.ID, using = "TabBar-SearchTab", AI = false)
	public WebElement tabSearch;

	@IFindBy(how = How.XPATH, using = "//div[@id='TabBar-SearchTab']//following::div[@class='gw-action--expand-button']", AI = false)
	public WebElement toggleSearchSubMenu;

	@IFindBy(how = How.ID, using = "TabBar-AdminTab", AI = false)
	public WebElement tabAdministration;

	@IFindBy(how = How.XPATH, using = "//div[@id='TabBar-AdminTab']//following::div[@class='gw-action--expand-button']", AI = false)
	public WebElement toggleAdministrationSubMenu;

	@IFindBy(how = How.ID, using = "TabBar-TeamTab", AI = false)
	public WebElement tabTeam;

	@IFindBy(how = How.CSS, using = "input[name$='AccountNumberSearchItem']", AI = false)
	public WebElement txtAccountNumber;

	@IFindBy(how = How.CSS, using = "div[id$='AccountNumberSearchItem_Button']", AI = false)
	public WebElement icnAccountNumberSearchIcon;

	@IFindBy(how = How.CSS, using = "input[name$='PolicyRetrievalItem']", AI = false)
	public WebElement txtPolicyNumber;

	@IFindBy(how = How.CSS, using = "div[id$='PolicyRetrievalItem_Button']", AI = false)
	public WebElement icnPolicyNumberSearchIcon;

	@IFindBy(how = How.CSS, using = "div[id*='JobWizardInfoBar-JobLabel']", AI = false)
	public WebElement lblSubmissionJobWizardInfoBar;

	@IFindBy(how = How.CSS, using = "div[id='TabBar-SearchTab-Search_ProducerCodeSearch']", AI = false)
	public WebElement lnkProducerCodes;

	@IFindBy(how = How.CSS, using = "input[name$='ProducerCodeSearchDV-MissingPrefUW']", AI = false)
	public WebElement chkperferredUW;

	@IFindBy(how = How.CSS, using = "div[id$='Search-MenuLinks-Search_ContactSearch']", AI = false)
	public WebElement lnkContactSearch;

	@IFindBy(how = How.CSS, using = "div[id$='DesktopTab-Desktop_Underwriter_MySummary']", AI = false)
	public WebElement tabMySummary;

	@IFindBy(how = How.CSS, using = "div[id$='DesktopTab-Desktop_DesktopActivities']", AI = false)
	public WebElement tabMyActivities;

	@IFindBy(how = How.CSS, using = "div[id$='DesktopTab-Desktop_DesktopAccounts']", AI = false)
	public WebElement tabMyAccounts;

	@IFindBy(how = How.CSS, using = "div[id$='DesktopTab-Desktop_DesktopSubmissions']", AI = false)
	public WebElement tabMySubmissions;

	@IFindBy(how = How.CSS, using = "div[id$='DesktopTab-Desktop_DesktopRenewals']", AI = false)
	public WebElement tabMyRenewals;

	@IFindBy(how = How.CSS, using = "div[id$='DesktopTab-Desktop_DesktopOtherWorkOrders']", AI = false)
	public WebElement tabOtherPolicyTransactions;

	@IFindBy(how = How.XPATH, using = "//div[text()='Accounts']", AI = false)
	public WebElement searchAccounts;

	@IFindBy(how = How.CSS, using = "div[id='TabBar-SearchTab-Search_ActivitySearch']", AI = false)
	public WebElement searchActivities;
	
	@IFindBy(how = How.CSS, using = "div[id='TabBar-SearchTab-Search_ContactSearch']", AI = false)
	public WebElement lnkSearchContacts;

	@IFindBy(how = How.XPATH, using = "//div[text()='My Activities']", AI = false)
	public WebElement myActivities;

	@IFindBy(how = How.CSS, using = "div[data-gw-shortcut*='AssignButton']", AI = false)
	public WebElement btnAssign;

	@IFindBy(how = How.XPATH, using = "//div[text()='Assign']", AI = false)
	public WebElement btnAssignInActivities;

	@IFindBy(how = How.CSS, using = "div[data-gw-shortcut*='SkipButton']", AI = false)
	public WebElement btnSkip;

	@IFindBy(how = How.CSS, using = "div[id$='Admin_UsersAndSecurity']", AI = false)
	public WebElement lnkUsersAndSecurity;

	@IFindBy(how = How.XPATH, using = "//div[text()='Users']", AI = false)
	public WebElement lnkUsers;

	@IFindBy(how = How.CSS, using = "input[name$='Username']", AI = false)
	public WebElement txtUserNameAdminTab;

	@IFindBy(how = How.CSS, using = "div[aria-controls$='BasicCard']", AI = false)
	public WebElement tabBasics;

	@IFindBy(how = How.CSS, using = "div[aria-controls$='AttributesCard']", AI = false)
	public WebElement tabAttributes;

	@IFindBy(how = How.CSS, using = "div[aria-controls$='AccessCard']", AI = false)
	public WebElement tabAccess;

	@IFindBy(how = How.CSS, using = "div[aria-controls$='RolesCard']", AI = false)
	public WebElement tabRoles;

	@IFindBy(how = How.CSS, using = "div[aria-controls$='ProfileCard']", AI = false)
	public WebElement tabProfile;

	@IFindBy(how = How.CSS, using = "div[aria-controls$='RegionsCard']", AI = false)
	public WebElement tabRegion;

	@IFindBy(how = How.CSS, using = "div[aria-controls$='RegionCard']", AI = false)
	public WebElement tabRegionInUser;

	@IFindBy(how = How.CSS, using = "div[aria-controls$='AuthorityCard']", AI = false)
	public WebElement tabUWAuthority;

	@IFindBy(how = How.CSS, using = "div[id$='SearchLinksInputSet-Search']", AI = false)
	public WebElement btnSearch;

	@IFindBy(how = How.CSS, using = "div[id$='AdminGroupSearchPage']", AI = false)
	public WebElement lnkgroups;

	@IFindBy(how = How.CSS, using = "input[name$='Name']", AI = false)
	public WebElement txtGroupName;

	@IFindBy(how = How.CSS, using = "div[aria-controls$='UserCard']", AI = false)
	public WebElement tabUsers;

	@IFindBy(how = How.CSS, using = "div[aria-controls$='ProducerCodesCard']", AI = false)
	public WebElement ProducersCode;

	@IFindBy(how = How.CSS, using = "div[aria-controls$='QueuesCard']", AI = false)
	public WebElement tabQueues;

	@IFindBy(how = How.CSS, using = "div[aria-controls$='ProducerCodesCard']", AI = false)
	public WebElement tabProducerCodes;

	@IFindBy(how = How.CSS, using = "div[aria-controls$='RegionsCard']", AI = false)
	public WebElement tabRegions;

	@IFindBy(how = How.XPATH, using = "//div[text()='Group Name']", AI = false)
	public WebElement fldGroupNameInBasicsTab;

	@IFindBy(how = How.XPATH, using = "//div[text()='Organization']", AI = false)
	public WebElement fldOrganizationInBasicsTab;

	@IFindBy(how = How.XPATH, using = "//div[text()='Type']", AI = false)
	public WebElement fldTypeInBasicsTab;

	@IFindBy(how = How.XPATH, using = "//div[text()='Parent Group']", AI = false)
	public WebElement fldParentGroupInBasicsTab;

	@IFindBy(how = How.CSS, using = "div[data-gw-shortcut*='Edit']", AI = false)
	public WebElement btnEdit;

	@IFindBy(how = How.CSS, using = "div[data-gw-shortcut*='Add']", AI = false)
	public WebElement btnAdd;

	@IFindBy(how = How.CSS, using = "div[data-gw-shortcut*='Update']", AI = false)
	public WebElement btnUpdate;

	@IFindBy(how = How.CSS, using = "select[name$='UserType']", AI = false)
	public WebElement drpUserType;

	@IFindBy(how = How.CSS, using = "select[name$='Role']", AI = false)
	public WebElement drpUserRole;

	@IFindBy(how = How.XPATH, using = "//div[contains(@id,'GroupUsersLV-0-Manager')] //input[@type='checkbox']", AI = false)
	public WebElement chkManger;

	@IFindBy(how = How.XPATH, using = "//div[text()='First name']", AI = false)
	public WebElement fldFirstName;

	@IFindBy(how = How.XPATH, using = "//div[text()='Last name']", AI = false)
	public WebElement fldLastName;

	@IFindBy(how = How.XPATH, using = "//div[text()='Password']", AI = false)
	public WebElement fldPassword;

	@IFindBy(how = How.XPATH, using = "//div[text()='Active']", AI = false)
	public WebElement fldActive;

	@IFindBy(how = How.XPATH, using = "//div[text()='User Type']", AI = false)
	public WebElement fldUserType;

	@IFindBy(how = How.CSS, using = "div[id$='NameHeader_inner']", AI = false)
	public WebElement fldNameinAttributes;

	@IFindBy(how = How.CSS, using = "div[id*='DescriptionHeader_inner']", AI = false)
	public WebElement fldDescriptioninAttributes;

	@IFindBy(how = How.CSS, using = "div[id*='TypeHeader_inner']", AI = false)
	public WebElement fldTypeinAttributes;

	@IFindBy(how = How.CSS, using = "div[id$='UseProducerCodeSecurity_Input']", AI = false)
	public WebElement fldUserProducerCode;

	@IFindBy(how = How.CSS, using = "div[id$='UserAuthorityLV-NameHeader_inner']", AI = false)
	public WebElement fldAuthorityProfileName;

	@IFindBy(how = How.CSS, using = "div[id$='UserAuthorityLV-DescriptionHeader_inner']", AI = false)
	public WebElement fldDescriptionInWTab;

	@IFindBy(how = How.XPATH, using = "//div[text()='Group']", AI = false)
	public WebElement fldGroupInAccessTab;

	@IFindBy(how = How.CSS, using = "div[id$='NameHeader_inner']", AI = false)
	public WebElement fldNameInRolesTab;

	@IFindBy(how = How.CSS, using = "div[id$='DescriptionHeader_inner']", AI = false)
	public WebElement fldDescriptionInRolesTab;

	@IFindBy(how = How.CSS, using = "div[id$='GroupUsersLV-UserHeader_inner']", AI = false)
	public WebElement fldUsersnInAccessTab;

	@IFindBy(how = How.CSS, using = "div[id$='MemberHeader_inner']", AI = false)
	public WebElement fldMemberInAccessTab;

	@IFindBy(how = How.CSS, using = "div[id$='ManagerHeader_inner']", AI = false)
	public WebElement fldManagerInAccessTab;

	@IFindBy(how = How.XPATH, using = "//div[text()='Address']", AI = false)
	public WebElement fldAddressInProfile;

	@IFindBy(how = How.XPATH, using = "//div[text()='Primary Phone']", AI = false)
	public WebElement fldPrimaryPhoneInProfile;

	@IFindBy(how = How.CSS, using = "div[id$='NameHeader_inner']", AI = false)
	public WebElement fldNameInRegionTab;

	@IFindBy(how = How.CSS, using = "div[id$='ZonesHeader_inner']", AI = false)
	public WebElement fldAreasCoveredInRegionTab;

	@IFindBy(how = How.XPATH, using = "//div[text()='User Language']", AI = false)
	public WebElement fldUserLanguageInProfile;

	@IFindBy(how = How.CSS, using = "div[id$='RegionalFormats_Input']", AI = false)
	public WebElement fldRegionalFormatInProfile;

	@IFindBy(how = How.CSS, using = "div[id$='DefaultCountry_Input']", AI = false)
	public WebElement fldDefaultCountryInProfile;

	@IFindBy(how = How.CSS, using = "div[id$='LoadFactorTypeHeader_inner']", AI = false)
	public WebElement fldLoadFactorPermissionsInAccessTab;

	@IFindBy(how = How.CSS, using = "div[id$='LoadFactorHeader_inner']", AI = false)
	public WebElement fldLoadFactorInAccessTab;

	@IFindBy(how = How.CSS, using = "div[id$='SelectOrganization']", AI = false)
	public WebElement icnMagnifier;

	@IFindBy(how = How.CSS, using = "input[name$='GlobalContactNameInputSet-Name']", AI = false)
	public WebElement txtOrganizationName;

	@IFindBy(how = How.CSS, using = "div[id$='_Select']", AI = false)
	public WebElement btnSelect;

	@IFindBy(how = How.CSS, using = "select[name$='GroupType']", AI = false)
	public WebElement drpGroupType;

	@IFindBy(how = How.CSS, using = "div[id$='AvailableHeader_inner']", AI = false)
	public WebElement fldAvailable;

	@IFindBy(how = How.CSS, using = "div[id$='CodeHeader_inner']", AI = false)
	public WebElement fldCode;

	@IFindBy(how = How.CSS, using = "div[id$='DescHeader_inner']", AI = false)
	public WebElement fldDescription;

	@IFindBy(how = How.CSS, using = "div[id$='StatusHeader_inner']", AI = false)
	public WebElement fldStatus;

	@IFindBy(how = How.CSS, using = "div[id$='BranchHeader_inner']", AI = false)
	public WebElement fldBranch;

	@IFindBy(how = How.CSS, using = "div[id$='SubGroupVisibleHeader_inner']", AI = false)
	public WebElement fldVisibleInGroups;

	@IFindBy(how = How.CSS, using = "div[id$='UsersAndSecurity_Roles'][id^='TabBar-AdminTab']", AI = false)
	public WebElement lnkRoles;

	@IFindBy(how = How.CSS, using = "select[name$='Filters']", AI = false)
	public WebElement drpRolesFilters;

	@IFindBy(how = How.CSS, using = "div[id$='_NewRoleButton']", AI = false)
	public WebElement btnNewRoles;

	@IFindBy(how = How.CSS, using = "select[name$='RoleType']", AI = false)
	public WebElement drpRoleType;

	@IFindBy(how = How.CSS, using = "input[name$='RoleDetailDV-Name']", AI = false)
	public WebElement txtNameNewRole;

	@IFindBy(how = How.XPATH, using = "//div[text()='Assignment Rules']", AI = false)
	public WebElement fldAssignmentRules;

	@IFindBy(how = How.XPATH, using = "//div[text()='Localization']", AI = false)
	public WebElement fldLocalization;

	@IFindBy(how = How.CSS, using = "div[id$='SearchTab-Search_AccountSearch']", AI = false)
	public WebElement SearchAccounts;

	@IFindBy(how = How.CSS, using = "div[id$='PanelSet-Warning']", AI = false)
	public WebElement msgOutOfSequence;

	@IFindBy(how = How.CSS, using = "div[id$='AccountTab_NewAccount']", AI = false)
	public WebElement lnkCreateNewAccount;

	@IFindBy(how = How.XPATH, using = "//div[contains(@class,'gw-alert')]", AI = false)
	public WebElement txtWarningMessage;

	@IFindBy(how = How.CSS, using = "div[id$='Actions']", AI = false)
	public WebElement btnActions;

	@IFindBy(how = How.CSS, using = "div[id$='ClaimNewDocumentMenuItemSet_Create']", AI = false)
	public WebElement btnCreateTemplate;

	@IFindBy(how = How.CSS, using = "div[id$='History'] div", AI = false)
	public WebElement lblHistory;
	
	@IFindBy(how = How.ID, using = "InternalToolsTabBar-UnsupportedToolsTab", AI = false)
	public WebElement btnInternalTool;

	@IFindBy(how = How.CSS, using = "div[id='UnsupportedTools-MenuLinks-UnsupportedTools_SystemClock'] div", AI = false)
	public WebElement btnTestingSystemClock;
	
    @IFindBy(how = How.CSS, using = "div[id$='TabBar-DesktopTab'] div[class='gw-action--expand-button']", AI = false)
    public WebElement btnDesktopToggle;

    @IFindBy(how = How.CSS, using = "div[id$='DesktopActivities']", AI = false)
    public WebElement btnMyActivities;
    
    @IFindBy(how = How.ID, using = "TabBar-PolicyTab-PolicyTab_PolicyRetrievalItem_Button", AI = false)
	public WebElement btnPolicySearch;
    
    @IFindBy(how = How.CSS, using = "input[name$='AccountTab_AccountNumberSearchItem']", AI = false)
    public WebElement inpAccountNumber;
    
    @IFindBy(how = How.CSS, using = "div[id$='AccountNumberSearchItem_Button']", AI = false)
    public WebElement btnSearchAccount;

	public String activity ="//input[@type='checkbox']";

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

		if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, ttlPolicyCenterLogo))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}
		elementLayer = new ElementLayer(driver);
	}// isLoaded

	/**
	 * verify out of sequence message 
	 * @author charu.anbarasan
	 * @param driver, date
	 */
	public void verifyOutOfSequenceMessage(WebDriver driver, String date) {
		BrowserActions.verifyElementTextIsDisplayed(driver, msgOutOfSequence, "Your Policy Change is an out-of-sequence transaction. There are future transactions at "+date+".",true,"Out Of Sequence Message");
	}

	/**
	 * @author anitha.raphel
	 * Used to click Toggle Account SubMenu
	 * @param driver
	 * @return
	 * @throws Exception
	 */
	public HeaderPage clickToggleAccountSubMenu(WebDriver driver) {
		BrowserActions.click(driver, toggleAccountSubMenu,0.5,"Toggle Account SubMenu");
		return this;
	}
	
	/**
	 * @author anitha.raphel
	 * Used to click Toggle Policy SubMenu
	 * @param driver
	 * @return
	 * @throws Exception
	 */
	public HeaderPage clickTogglePolicySubMenu(WebDriver driver) {
		BrowserActions.click(driver, togglePolicySubMenu,"Toggle Policy SubMenu");
		return this;
	}
	
	/**
	 * @author somasundaram.muthu
	 * Used to type Policy Number
	 * @param driver
	 * @return
	 * @throws Exception
	 */
	public HeaderPage enterPolicyNumber(WebDriver driver, String PolicyNumber) {
		BrowserActions.type(driver, txtPolicyNumber,PolicyNumber,"Enter Policy Number");
		return this;
	}
	
	public PolicySummaryPage clickPolicySearch(WebDriver driver) {
		BrowserActions.click(driver, btnPolicySearch,"Policy Search");
		return new PolicySummaryPage(driver).get();
	}
	
	/**
	 * @author somasundaram.muthu
	 * Select the New Account 
	 * @param driver
	 * @return
	 */
	public EnterAccountInformationPage clickNewAccount(WebDriver driver)  {
		BrowserActions.click(driver, lnkCreateNewAccount ,1,"New Account");
		return new EnterAccountInformationPage(driver);
	}

	public String getErrorMessage(WebDriver driver) {
		return BrowserActions.getText(driver, txtWarningMessage ,"Warning Message");
	}

	/**
	 * Click History
	 * @author seetha.varanasi
	 * @param driver
	 * @return PolicySummaryPage
	 */
	public HistoryPage clickHistory(WebDriver driver)  {
		BrowserActions.click(driver, lblHistory,true, "History");
		return new HistoryPage();
	}

	/**
	��* Used to click Toggle Search SubMenu
   �� * @author anitha.raphel
	� * @param driver
	� * @return
	� */
	public HeaderPage clickToggleSearchSubMenu(WebDriver driver) {
		BrowserActions.click(driver, toggleSearchSubMenu,"Toggle Search SubMenu");
		return this;
	}

	/**
	���� * Used to search accounts in Policy Tab
	���� * @author charu.anbarasan
	���� * @param driver
	���� * @return
	*/
	public SearchAccountsPage clickSearchAccounts(WebDriver driver){
		BrowserActions.click(driver, searchAccounts,"Search Accounts");
		return new SearchAccountsPage(driver).get();
	}
	/**
	���� * Used to search accounts in Policy Tab
	���� * @author charu.anbarasan
	���� * @param driver
	���� * @return
	 */
	public SearchProducerCodes clickProducerCodes(WebDriver driver){
		BrowserActions.click(driver, lnkProducerCodes,"Producer Codes");
		return new SearchProducerCodes(driver).get();
	}
	
	
	/**
	 * click search activities
	 * @author charu.anbarasan
     * @param driver
	 * @return SearchActivitiesPage
	 */
	public SearchActivitiesPage clickSearchActivities(WebDriver driver) {
		BrowserActions.click(driver, searchActivities,2,"Search Activities");
		return new SearchActivitiesPage(driver).get();
	}
	/**
	 * click search activities
	 * @author charu.anbarasan
	 * @param driver
	 * @return
	 */
	public SearchContactsPage clickSearchContacts(WebDriver driver) {
		BrowserActions.click(driver, lnkSearchContacts,"Search Activities");
		return new SearchContactsPage(driver).get();
	}
	/**
	 * Enter Account number
	 * @author charu.anbarasan
	 * @param driver, accountNo
	 * @return
	 */
	public void enterAccountNumber(WebDriver driver, String accountNo) {
		BrowserActions.type(driver, inpAccountNumber,accountNo,"Account number");
	}
	/**
	 * click search account number button
	 * @author charu.anbarasan
	 * @param driver
	 * @return
	 */
	public AccountSummaryPage clickSearchAccountNumber(WebDriver driver) {
		BrowserActions.click(driver, btnSearchAccount,true,"Account number");
		return new AccountSummaryPage(driver).get();
	}
	
	/**
	 * Used to click Search Tab
	 * @author anitha.raphel
	 * @param driver
	 * @return HeaderPage
	 */
	public HeaderPage clickSearchTab(WebDriver driver) {
		BrowserActions.click(driver, tabSearch,"Search Tab");
		return this;
	}
	
	/**
	 * Used to click Internal Tool
	 * @author Manikandan.Manohar
	 * @param driver
	 */
	public void clickInternalTool(WebDriver driver) {
		BrowserActions.click(driver, btnInternalTool,"Internal Tool");
	}
	
	/**
	 * Used to click Testing System Clock
	 * @author Manikandan.Manohar
	 * @param driver
	 */
	public void clickTestingSystemClock(WebDriver driver) {
		BrowserActions.click(driver, btnTestingSystemClock,"Testing System Clock");
	}
	
	public void clickDesktopToggle(WebDriver driver) {
		BrowserActions.click(driver, btnDesktopToggle, "Desktop Toggle Button");
	}

	public MyActivitiesPage clickMyActivities(WebDriver driver) {
		BrowserActions.click(driver, btnMyActivities,true, "My Activities Button");
		return new MyActivitiesPage(driver).get();
	}
	

}
