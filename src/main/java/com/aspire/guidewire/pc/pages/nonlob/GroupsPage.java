package com.aspire.guidewire.pc.pages.nonlob;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.testng.Assert;

import com.aspire.guidewire.utils.BrowserActions;
import com.aspire.guidewire.utils.ElementLayer;
import com.aspire.guidewire.utils.Log;
import com.aspire.guidewire.utils.WaitUtils;

import ASPIREAI.customfactories.AjaxElementLocatorFactory;
import ASPIREAI.customfactories.IFindBy;
import ASPIREAI.customfactories.PageFactory;

public class GroupsPage extends LoadableComponent<GroupsPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	@IFindBy(how = How.CSS, using = "#AdminGroupSearchPage-GroupSearchScreen-ttlBar", AI = false)
	private WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "#AdminGroupSearchPage-GroupSearchScreen-AdminGroupSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Search", AI = false)
	private WebElement btnSearch;

	@IFindBy(how = How.CSS, using = "input[name='AdminGroupSearchPage-GroupSearchScreen-AdminGroupSearchDV-ProducerCode']", AI = false)
	private WebElement inpAvailableProducerCode;

	@IFindBy(how = How.CSS, using = "input[name='AdminGroupSearchPage-GroupSearchScreen-AdminGroupSearchDV-Organization']", AI = false)
	private WebElement inpOrganization;

	@IFindBy(how = How.CSS, using = "input[name='AdminGroupSearchPage-GroupSearchScreen-AdminGroupSearchDV-GlobalContactNameInputSet-Name']", AI = false)
	private WebElement inpGroupName;

	@IFindBy(how = How.CSS, using = "#AdminGroupSearchPage-GroupSearchScreen-AdminGroupSearchDV-Organization-SelectOrganization", AI = false)
	private WebElement btnSelectOrganization;

	@IFindBy(how = How.CSS, using = "select[name='AdminGroupSearchPage-GroupSearchScreen-AdminGroupSearchDV-GroupType']", AI = false)
	private WebElement drpGroupType;

	@IFindBy(how = How.CSS, using = "#AdminGroupSearchPage-GroupSearchScreen-AdminGroupSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Reset", AI = false)
	private WebElement btnReset;
	
	@IFindBy(how = How.CSS, using = "div[aria-controls$='QueuesCard']", AI = false)
	public WebElement btnQueues;

	@IFindBy(how = How.CSS, using = "div[id$='SelectOrganization']", AI = false)
	public WebElement btnOrganizationMagnifier;
	
	@IFindBy(how = How.CSS, using = "div[id$='GroupSearchResultsLV-0-Name_button']", AI = false)
	public WebElement btnGroupNameSearch;

	@IFindBy(how = How.CSS, using = "div[aria-controls$='BasicCard']", AI = false)
	public WebElement btnBasics;
		
	@IFindBy(how = How.CSS, using = "div[aria-controls$='RegionsCard']", AI = false)
	public WebElement btnRegion;

	@IFindBy(how = How.CSS, using = "div[aria-controls$='UserCard']", AI = false)
	public WebElement btnUsers;


	public GroupsPage(){
	}

	public GroupsPage(WebDriver driver){
		this.driver = driver;
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(finder, this);
	}
	@Override
	protected void load() {
		isPageLoaded = true;
		WaitUtils.waitForPageLoad(driver);
	}@Override
	protected void isLoaded() {
		if (!isPageLoaded) {
			Assert.fail();
		}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, lblTtlBar))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);
	}
	public GroupsPage clickSearch(WebDriver driver)  {
		BrowserActions.click(driver, btnSearch,true,"Search");
		return new GroupsPage(driver).get();
	}
	public GroupsPage enterAvailableProducerCode(WebDriver driver,String AvailableProducerCode) {
		BrowserActions.type(driver, inpAvailableProducerCode,AvailableProducerCode, "AvailableProducerCode");
		return this;
	}
	public GroupsPage enterOrganization(WebDriver driver,String Organization) {
		BrowserActions.type(driver, inpOrganization,Organization, "Organization");
		return this;
	}
	public GroupsPage enterGroupName(WebDriver driver,String GroupName) {
		BrowserActions.type(driver, inpGroupName,GroupName, "GroupName");
		return this;
	}
	public void clickSelectOrganization(WebDriver driver)  {
		BrowserActions.click(driver, btnSelectOrganization,true,"SelectOrganization");
	}
	public GroupsPage selectGroupType(WebDriver driver,String GroupType)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpGroupType,GroupType,"GroupType");
		return this;
	}
	public GroupsPage clickReset(WebDriver driver)  {
		BrowserActions.click(driver, btnReset,"Reset");
		return this;
	}
	
	/**
	 *Click Group name
	 * @author vignesh.ravi
	 * @param driver
	 * @return 
	 */
	public GroupActuaryUnitOPage clickOnGroupnameResults(WebDriver driver, String groupName) {
		By usernameBy = By.xpath("//div[text()='"+groupName+"']//ancestor::td//preceding-sibling::td//div[contains(@id,'-Name_button')]");
		BrowserActions.waitForElementToDisplay(driver, usernameBy, "username");
		WebElement username = usernameBy.findElement(driver);
		BrowserActions.click(driver, username,2,"GroupName hyperlink");
		return new GroupActuaryUnitOPage(driver).get();
	}
	
	/**
	 * verify all the tabs in Groups
	 * @author charu.anbarasan
	 * @param driver
	 */
	public void verifyUsersTabInGroups(WebDriver driver) {
		BrowserActions.verifyElementDisplayed(driver, btnUsers, "Users tab");
	}
	/**
	 * verify button Basis
	 * @author charu.anbarasan
	 * @param driver
	 */

	public void verifyBasicsTabInGroups(WebDriver driver) {
		BrowserActions.verifyElementDisplayed(driver, btnBasics, "Basics tab");
	}
	
	/**
	 * Click organization magnifier
	 * @author charu.anbarasan
	 * @param driver
	 */

	public void clickOrganizationMagnifier(WebDriver driver)  {
		BrowserActions.click(driver, btnOrganizationMagnifier, "Organization Magnifier icon");
	}
	
	/**
	 * Click Group Name
	 * @author charu.anbarasan
	 * @param driver
	 */
	
	public GroupsPage clickGroupNameInSearchResult(WebDriver driver)  {
		BrowserActions.click(driver, btnGroupNameSearch,"Group Name Search");
		return this;
	}

	public class GroupActuaryUnitOPage extends LoadableComponent<GroupActuaryUnitOPage> {

		WebDriver driver;
		private boolean isPageLoaded;
		public ElementLayer elementLayer;
		String elementObject;
		HashMap<String, String> getPageObjects;
		public  List<Object> pageFactoryKey = new ArrayList<Object>();
		public  List<String> pageFactoryValue = new ArrayList<String>();


		@IFindBy(how = How.CSS, using = "select[name='GroupDetailPage-GroupDetailScreen-GroupUsersLV-1-LoadFactorType']", AI = false)
		private WebElement drpLoadFactorPermissions_17;

		@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-GroupDetail_ProducerCodesLV-1-Branch-GroupPickerMenuIcon>div[role='menuitem']", AI = false)
		private WebElement btnSelectGroup_27;

		@IFindBy(how = How.CSS, using = "input[name='GroupDetailPage-GroupDetailScreen-GroupDetail_ProducerCodesLV-2-Desc']", AI = false)
		private WebElement inpDescription_31;

		@IFindBy(how = How.CSS, using = "select[name='GroupDetailPage-GroupDetailScreen-GroupDetail_ProducerCodesLV-4-Status']", AI = false)
		private WebElement drpStatus_46;

		@IFindBy(how = How.CSS, using = "select[name='GroupDetailPage-GroupDetailScreen-GroupDetailDV-GroupDetailInputSet-SecurityZone']", AI = false)
		private WebElement drpSecurityZone;

		@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-GroupDetail_ProducerCodesLV-0-Branch-GroupPickerMenuIcon>div[role='menuitem']", AI = false)
		private WebElement btnSelectGroup_20;

		@IFindBy(how = How.CSS, using = "input[name='GroupDetailPage-GroupDetailScreen-GroupDetail_ProducerCodesLV-1-Code']", AI = false)
		private WebElement inpCode_23;

		@IFindBy(how = How.CSS, using = "input[name='GroupDetailPage-GroupDetailScreen-GroupDetailDV-Organization']", AI = false)
		private WebElement inpOrganization;

		@IFindBy(how = How.CSS, using = "input[name='GroupDetailPage-GroupDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LocalizedFields-0-0-column']", AI = false)
		private WebElement inpColumn;

		@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-GroupDetail_UserCardTab", AI = false)
		private WebElement btnUsers;

		@IFindBy(how = How.CSS, using = "input[name='GroupDetailPage-GroupDetailScreen-GroupDetail_ProducerCodesLV-0-Code']", AI = false)
		private WebElement inpCode;

		@IFindBy(how = How.CSS, using = "input[name='GroupDetailPage-GroupDetailScreen-GroupDetail_ProducerCodesLV-3-Desc']", AI = false)
		private WebElement inpDescription_38;

		@IFindBy(how = How.CSS, using = "input[name='GroupDetailPage-GroupDetailScreen-GroupUsersLV-1-LoadFactor']", AI = false)
		private WebElement inpLoadFactor_18;

		@IFindBy(how = How.CSS, using = "input[name='GroupDetailPage-GroupDetailScreen-GroupUsersLV-0-LoadFactor']", AI = false)
		private WebElement inpLoadFactor_12;

		@IFindBy(how = How.CSS, using = "input[name='GroupDetailPage-GroupDetailScreen-GroupUsersLV-0-User']", AI = false)
		private WebElement inpUser;

		@IFindBy(how = How.CSS, using = "select[name='GroupDetailPage-GroupDetailScreen-GroupDetail_ProducerCodesLV-2-Status']", AI = false)
		private WebElement drpStatus_32;

		@IFindBy(how = How.CSS, using = "input[name='GroupDetailPage-GroupDetailScreen-GroupUsersLV-1-Member']", AI = false)
		private WebElement chkMember_15;

		@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-GroupDetail_ProducerCodesLV-4-Branch-GroupSearchMenuIcon>div[role='menuitem']", AI = false)
		private WebElement btnSearchforGroup_49;

		@IFindBy(how = How.CSS, using = "input[name='GroupDetailPage-GroupDetailScreen-GroupDetail_ProducerCodesLV-4-Desc']", AI = false)
		private WebElement inpDescription_45;

		@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-GroupDetail_ProducerCodesLV-2-Branch-GroupPickerMenuIcon>div[role='menuitem']", AI = false)
		private WebElement btnSelectGroup_34;

		@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-GroupDetailDV-GroupDetailInputSet-Supervisor-SupervisorMenuIcon>div[role='button']", AI = false)
		private WebElement btnSupervisorMenuIcon;

		@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-GroupQueuesLV_tb-Remove>div[role='button']", AI = false)
		private WebElement btnRemove_51;

		@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-GroupDetail_ProducerCodesLV-3-Branch-GroupSearchMenuIcon>div[role='menuitem']", AI = false)
		private WebElement btnSearchforGroup_42;

		@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-GroupRegionLV_tb-Remove>div[role='button']", AI = false)
		private WebElement btnRemove_53;

		@IFindBy(how = How.CSS, using = "select[name='GroupDetailPage-GroupDetailScreen-GroupDetailDV-Type']", AI = false)
		private WebElement drpType;

		@IFindBy(how = How.CSS, using = "input[name='GroupDetailPage-GroupDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LocalizedFields-2-Language']", AI = false)
		private WebElement inpLanguage_6;

		@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-GroupDetail_ProducerCodesLV-0-Branch-BranchMenuIcon>div[role='button']", AI = false)
		private WebElement btnBranchMenuIcon;

		@IFindBy(how = How.CSS, using = "input[name='GroupDetailPage-GroupDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LocalizedFields-1-Language']", AI = false)
		private WebElement inpLanguage_3;

		@IFindBy(how = How.CSS, using = "select[name='GroupDetailPage-GroupDetailScreen-GroupDetail_ProducerCodesLV-3-Status']", AI = false)
		private WebElement drpStatus_39;

		@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-GroupDetail_ProducerCodesLV-4-Branch-GroupPickerMenuIcon>div[role='menuitem']", AI = false)
		private WebElement btnSelectGroup_48;

		@IFindBy(how = How.CSS, using = "select[name='GroupDetailPage-GroupDetailScreen-GroupDetail_ProducerCodesLV-1-Status']", AI = false)
		private WebElement drpStatus_25;

		@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-GroupDetail_ProducerCodesLV-3-Branch-GroupPickerMenuIcon>div[role='menuitem']", AI = false)
		private WebElement btnSelectGroup_41;

		@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-GroupDetail_ProducerCodesLV-2-Branch-BranchMenuIcon>div[role='button']", AI = false)
		private WebElement btnBranchMenuIcon_33;

		@IFindBy(how = How.CSS, using = "input[name='GroupDetailPage-GroupDetailScreen-GroupDetail_ProducerCodesLV-0-Desc']", AI = false)
		private WebElement inpDescription_19;

		@IFindBy(how = How.CSS, using = "input[name='GroupDetailPage-GroupDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-0-FieldHeading']", AI = false)
		private WebElement inpFieldHeading;

		@IFindBy(how = How.CSS, using = "input[name='GroupDetailPage-GroupDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LocalizedFields-2-1-column']", AI = false)
		private WebElement inpColumn_8;

		@IFindBy(how = How.CSS, using = "input[name='GroupDetailPage-GroupDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LocalizedFields-2-0-column']", AI = false)
		private WebElement inpColumn_7;

		@IFindBy(how = How.CSS, using = "input[name='GroupDetailPage-GroupDetailScreen-GroupDetailDV-GroupDetailInputSet-BranchCode']", AI = false)
		private WebElement inpBranchCode;

		@IFindBy(how = How.CSS, using = "input[name='GroupDetailPage-GroupDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LocalizedFields-1-0-column']", AI = false)
		private WebElement inpColumn_4;

		@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-GroupDetailDV-GroupDetailInputSet-Supervisor-UserBrowseMenuItem>div[role='menuitem']", AI = false)
		private WebElement btnSelectUser;

		@IFindBy(how = How.CSS, using = "input[name='GroupDetailPage-GroupDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LocalizedFields-1-1-column']", AI = false)
		private WebElement inpColumn_5;

		@IFindBy(how = How.CSS, using = "input[name='GroupDetailPage-GroupDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LocalizedFields-0-1-column']", AI = false)
		private WebElement inpColumn_2;

		@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-GroupDetailDV-Parent-GroupPickerMenuIcon>div[role='menuitem']", AI = false)
		private WebElement btnSelectGroup;

		@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-GroupDetailDV-Organization-SelectOrganization", AI = false)
		private WebElement btnSelectOrganization;

		@IFindBy(how = How.CSS, using = "input[name='GroupDetailPage-GroupDetailScreen-GroupUsersLV-0-Manager']", AI = false)
		private WebElement chkManager;

		@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV_tb-Add>div[role='button']", AI = false)
		private WebElement btnAdd;

		@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-GroupDetail_ProducerCodesLV-4-Branch-BranchMenuIcon>div[role='button']", AI = false)
		private WebElement btnBranchMenuIcon_47;

		@IFindBy(how = How.CSS, using = "input[name='GroupDetailPage-GroupDetailScreen-GroupDetailDV-GroupDetailInputSet-Supervisor']", AI = false)
		private WebElement inpSupervisor;

		@IFindBy(how = How.CSS, using = "input[name='GroupDetailPage-GroupDetailScreen-GroupDetail_ProducerCodesLV-1-Desc']", AI = false)
		private WebElement inpDescription_24;

		@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-GroupDetail_ProducerCodesLV-3-Branch-BranchMenuIcon>div[role='button']", AI = false)
		private WebElement btnBranchMenuIcon_40;

		@IFindBy(how = How.CSS, using = "input[name='GroupDetailPage-GroupDetailScreen-GroupDetail_ProducerCodesLV-1-Available']", AI = false)
		private WebElement chkAvailable_22;

		@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-GroupDetailDV-GroupDetailInputSet-Description textarea", AI = false)
		private WebElement inpDescription;

		@IFindBy(how = How.CSS, using = "input[name='GroupDetailPage-GroupDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LocalizedFields-0-Language']", AI = false)
		private WebElement inpLanguage;

		@IFindBy(how = How.CSS, using = "select[name='GroupDetailPage-GroupDetailScreen-GroupUsersLV-0-LoadFactorType']", AI = false)
		private WebElement drpLoadFactorPermissions;

		@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-GroupDetailDV-GroupDetailInputSet-Supervisor-SelectUsers>div[role='menuitem']", AI = false)
		private WebElement btnExistingUsers;

		@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-GroupDetailDV-Parent-ParentMenuIcon>div[role='button']", AI = false)
		private WebElement btnParentMenuIcon;

		@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-GroupDetail_ProducerCodesCardTab", AI = false)
		private WebElement btnProducerCodes;

		@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-GroupUsersLV_tb-Remove>div[role='button']", AI = false)
		private WebElement btnRemove_10;

		@IFindBy(how = How.CSS, using = "input[name='GroupDetailPage-GroupDetailScreen-GroupDetailDV-GlobalContactNameInputSet-Name']", AI = false)
		private WebElement inpGroupName;

		@IFindBy(how = How.CSS, using = "input[name='GroupDetailPage-GroupDetailScreen-GroupUsersLV-0-Member']", AI = false)
		private WebElement chkMember;

		@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-GroupDetail_ProducerCodesLV-1-Branch-BranchMenuIcon>div[role='button']", AI = false)
		private WebElement btnBranchMenuIcon_26;

		@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-GroupRegionLV_tb-Add>div[role='button']", AI = false)
		private WebElement btnAdd_52;

		@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-GroupQueuesLV_tb-Add>div[role='button']", AI = false)
		private WebElement btnAdd_50;

		@IFindBy(how = How.CSS, using = "select[name='GroupDetailPage-GroupDetailScreen-GroupDetailDV-Parent']", AI = false)
		private WebElement drpParentGroup;

		@IFindBy(how = How.CSS, using = "input[name='GroupDetailPage-GroupDetailScreen-GroupDetail_ProducerCodesLV-4-Available']", AI = false)
		private WebElement chkAvailable_43;

		@IFindBy(how = How.CSS, using = "input[name='GroupDetailPage-GroupDetailScreen-GroupDetail_ProducerCodesLV-4-Code']", AI = false)
		private WebElement inpCode_44;

		@IFindBy(how = How.CSS, using = "input[name='GroupDetailPage-GroupDetailScreen-GroupDetail_ProducerCodesLV-0-Available']", AI = false)
		private WebElement chkAvailable;

		@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-ttlBar", AI = false)
		private WebElement lblTtlBar;

		@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-Edit>div[role='button']", AI = false)
		private WebElement btnEdit;

		@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-Update>div[role='button']", AI = false)
		private WebElement btnUpdate;

		@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-GroupDetail_ProducerCodesLV-2-Branch-GroupSearchMenuIcon>div[role='menuitem']", AI = false)
		private WebElement btnSearchforGroup_35;

		@IFindBy(how = How.CSS, using = "input[name='GroupDetailPage-GroupDetailScreen-GroupUsersLV-1-Manager']", AI = false)
		private WebElement chkManager_16;

		@IFindBy(how = How.CSS, using = "input[name='GroupDetailPage-GroupDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-1-FieldHeading']", AI = false)
		private WebElement inpFieldHeading_1;

		@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-GroupDetailScreen_BasicCard_DeleteButton>div[role='button']", AI = false)
		private WebElement btnDelete;

		@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-GroupDetailDV-Parent-GroupSearchMenuIcon>div[role='menuitem']", AI = false)
		private WebElement btnSearchforGroup;

		@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-GroupDetail_BasicCardTab", AI = false)
		private WebElement btnBasics;

		@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-GroupDetail_RegionsCardTab", AI = false)
		private WebElement btnRegions;

		@IFindBy(how = How.CSS, using = "input[name='GroupDetailPage-GroupDetailScreen-GroupUsersLV-1-User']", AI = false)
		private WebElement inpUser_13;

		@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV_tb-Remove>div[role='button']", AI = false)
		private WebElement btnRemove;

		@IFindBy(how = How.CSS, using = "select[name='GroupDetailPage-GroupDetailScreen-GroupDetail_ProducerCodesLV-0-Status']", AI = false)
		private WebElement drpStatus;

		@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-GroupUsersLV_tb-Add>div[role='button']", AI = false)
		private WebElement btnAdd_9;

		@IFindBy(how = How.CSS, using = "input[name='GroupDetailPage-GroupDetailScreen-GroupDetail_ProducerCodesLV-2-Code']", AI = false)
		private WebElement inpCode_30;

		@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-GroupDetail_ProducerCodesLV-1-Branch-GroupSearchMenuIcon>div[role='menuitem']", AI = false)
		private WebElement btnSearchforGroup_28;

		@IFindBy(how = How.CSS, using = "input[name='GroupDetailPage-GroupDetailScreen-GroupDetail_ProducerCodesLV-3-Available']", AI = false)
		private WebElement chkAvailable_36;

		@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-GroupDetail_ProducerCodesLV-0-Branch-GroupSearchMenuIcon>div[role='menuitem']", AI = false)
		private WebElement btnSearchforGroup_21;

		@IFindBy(how = How.CSS, using = "input[name='GroupDetailPage-GroupDetailScreen-GroupDetail_ProducerCodesLV-3-Code']", AI = false)
		private WebElement inpCode_37;

		@IFindBy(how = How.CSS, using = "input[name='GroupDetailPage-GroupDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-LanguageHeading']", AI = false)
		private WebElement inpLanguageHeading;

		@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-Cancel>div[role='button']", AI = false)
		private WebElement btnCancel;

		@IFindBy(how = How.CSS, using = "input[name='GroupDetailPage-GroupDetailScreen-GroupDetailDV-GroupDetailInputSet-LoadFactor']", AI = false)
		private WebElement inpLoadFactor;

		@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-GroupUsersLV-0-User-UserBrowseMenuItem", AI = false)
		private WebElement btnSelectUser_11;

		@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-GroupUsersLV-1-User-UserBrowseMenuItem", AI = false)
		private WebElement btnSelectUser_14;

		@IFindBy(how = How.CSS, using = "input[name='GroupDetailPage-GroupDetailScreen-GroupDetail_ProducerCodesLV-2-Available']", AI = false)
		private WebElement chkAvailable_29;
				
		@IFindBy(how = How.CSS, using = "div[aria-controls$='ProducerCodesCard']", AI = false)
		public WebElement btnProducersCode;
		
		@IFindBy(how = How.CSS, using = "div[aria-controls$='QueuesCard']", AI = false)
		public WebElement btnQueues;

		@IFindBy(how = How.CSS, using = "div[id$='SelectOrganization']", AI = false)
		public WebElement btnOrganizationMagnifier;
		
		@IFindBy(how = How.CSS, using = "div[id$='GroupSearchResultsLV-0-Name_button']", AI = false)
		public WebElement btnGroupNameSearch;
		
		@IFindBy(how = How.XPATH, using = "//div[contains(@id,'GroupUsersLV-0-Manager')] //input[@type='checkbox']", AI = false)
		public WebElement chkManger;
		
		@IFindBy(how = How.CSS, using = "div[id$='User_button']", AI = false)
		public WebElement lblUser;
		
		public GroupActuaryUnitOPage(){
		}

		public GroupActuaryUnitOPage(WebDriver driver){
			this.driver = driver;
			ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, 10);
			PageFactory.initElements(finder, this);
		}
		@Override
		protected void load() {
			isPageLoaded = true;
			WaitUtils.waitForPageLoad(driver);
		}@Override
		protected void isLoaded() {
			if (!isPageLoaded) {
				Assert.fail();
			}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, lblTtlBar))) {
				Log.fail("Page did not open up. Site might be down.", driver);
			}elementLayer = new ElementLayer(driver);
		}public GroupActuaryUnitOPage selectLoadFactorPermissions_17(WebDriver driver,String LoadFactorPermissions_17)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpLoadFactorPermissions_17,LoadFactorPermissions_17,"LoadFactorPermissions_17");
			return this;
		}
		public GroupActuaryUnitOPage clickSelectGroup_27(WebDriver driver)  {
			BrowserActions.click(driver, btnSelectGroup_27,"SelectGroup_27");
			return this;
		}
		public GroupActuaryUnitOPage enterDescription_31(WebDriver driver,String Description_31) {
			BrowserActions.type(driver, inpDescription_31,Description_31, "Description_31");
			return this;
		}
		public GroupActuaryUnitOPage selectStatus_46(WebDriver driver,String Status_46)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpStatus_46,Status_46,"Status_46");
			return this;
		}
		public GroupActuaryUnitOPage selectSecurityZone(WebDriver driver,String SecurityZone)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpSecurityZone,SecurityZone,"SecurityZone");
			return this;
		}
		public GroupActuaryUnitOPage clickSelectGroup_20(WebDriver driver)  {
			BrowserActions.click(driver, btnSelectGroup_20,"SelectGroup_20");
			return this;
		}
		public GroupActuaryUnitOPage enterCode_23(WebDriver driver,String Code_23) {
			BrowserActions.type(driver, inpCode_23,Code_23, "Code_23");
			return this;
		}
		public GroupActuaryUnitOPage enterOrganization(WebDriver driver,String Organization) {
			BrowserActions.type(driver, inpOrganization,Organization, "Organization");
			return this;
		}
		public GroupActuaryUnitOPage enterColumn(WebDriver driver,String Column) {
			BrowserActions.type(driver, inpColumn,Column, "Column");
			return this;
		}
		public GroupActuaryUnitOPage clickUsers(WebDriver driver)  {
			BrowserActions.click(driver, btnUsers,"Users");
			return this;
		}
		public GroupActuaryUnitOPage enterCode(WebDriver driver,String Code) {
			BrowserActions.type(driver, inpCode,Code, "Code");
			return this;
		}
		public GroupActuaryUnitOPage enterDescription_38(WebDriver driver,String Description_38) {
			BrowserActions.type(driver, inpDescription_38,Description_38, "Description_38");
			return this;
		}
		public GroupActuaryUnitOPage enterLoadFactor_18(WebDriver driver,String LoadFactor_18) {
			BrowserActions.type(driver, inpLoadFactor_18,LoadFactor_18, "LoadFactor_18");
			return this;
		}
		public GroupActuaryUnitOPage enterLoadFactor_12(WebDriver driver,String LoadFactor_12) {
			BrowserActions.type(driver, inpLoadFactor_12,LoadFactor_12, "LoadFactor_12");
			return this;
		}
		public GroupActuaryUnitOPage enterUser(WebDriver driver,String User) {
			BrowserActions.type(driver, inpUser,User, "User");
			return this;
		}
		public GroupActuaryUnitOPage selectStatus_32(WebDriver driver,String Status_32)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpStatus_32,Status_32,"Status_32");
			return this;
		}
		public GroupActuaryUnitOPage clickMember_15(WebDriver driver)  {
			BrowserActions.click(driver, chkMember_15,"Member_15");
			return this;
		}
		public GroupActuaryUnitOPage clickSearchforGroup_49(WebDriver driver)  {
			BrowserActions.click(driver, btnSearchforGroup_49,"SearchforGroup_49");
			return this;
		}
		public GroupActuaryUnitOPage enterDescription_45(WebDriver driver,String Description_45) {
			BrowserActions.type(driver, inpDescription_45,Description_45, "Description_45");
			return this;
		}
		public GroupActuaryUnitOPage clickSelectGroup_34(WebDriver driver)  {
			BrowserActions.click(driver, btnSelectGroup_34,"SelectGroup_34");
			return this;
		}
		public GroupActuaryUnitOPage clickSupervisorMenuIcon(WebDriver driver)  {
			BrowserActions.click(driver, btnSupervisorMenuIcon,"SupervisorMenuIcon");
			return this;
		}
		public GroupActuaryUnitOPage clickRemove_51(WebDriver driver)  {
			BrowserActions.click(driver, btnRemove_51,"Remove_51");
			return this;
		}
		public GroupActuaryUnitOPage clickSearchforGroup_42(WebDriver driver)  {
			BrowserActions.click(driver, btnSearchforGroup_42,"SearchforGroup_42");
			return this;
		}
		public GroupActuaryUnitOPage clickRemove_53(WebDriver driver)  {
			BrowserActions.click(driver, btnRemove_53,"Remove_53");
			return this;
		}
		public GroupActuaryUnitOPage selectType(WebDriver driver,String Type)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpType,Type,"Type");
			return this;
		}
		public GroupActuaryUnitOPage enterLanguage_6(WebDriver driver,String Language_6) {
			BrowserActions.type(driver, inpLanguage_6,Language_6, "Language_6");
			return this;
		}
		public GroupActuaryUnitOPage clickBranchMenuIcon(WebDriver driver)  {
			BrowserActions.click(driver, btnBranchMenuIcon,"BranchMenuIcon");
			return this;
		}
		public GroupActuaryUnitOPage enterLanguage_3(WebDriver driver,String Language_3) {
			BrowserActions.type(driver, inpLanguage_3,Language_3, "Language_3");
			return this;
		}
		public GroupActuaryUnitOPage selectStatus_39(WebDriver driver,String Status_39)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpStatus_39,Status_39,"Status_39");
			return this;
		}
		public GroupActuaryUnitOPage clickSelectGroup_48(WebDriver driver)  {
			BrowserActions.click(driver, btnSelectGroup_48,"SelectGroup_48");
			return this;
		}
		public GroupActuaryUnitOPage selectStatus_25(WebDriver driver,String Status_25)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpStatus_25,Status_25,"Status_25");
			return this;
		}
		public GroupActuaryUnitOPage clickSelectGroup_41(WebDriver driver)  {
			BrowserActions.click(driver, btnSelectGroup_41,"SelectGroup_41");
			return this;
		}
		public GroupActuaryUnitOPage clickBranchMenuIcon_33(WebDriver driver)  {
			BrowserActions.click(driver, btnBranchMenuIcon_33,"BranchMenuIcon_33");
			return this;
		}
		public GroupActuaryUnitOPage enterDescription_19(WebDriver driver,String Description_19) {
			BrowserActions.type(driver, inpDescription_19,Description_19, "Description_19");
			return this;
		}
		public GroupActuaryUnitOPage enterFieldHeading(WebDriver driver,String FieldHeading) {
			BrowserActions.type(driver, inpFieldHeading,FieldHeading, "FieldHeading");
			return this;
		}
		public GroupActuaryUnitOPage enterColumn_8(WebDriver driver,String Column_8) {
			BrowserActions.type(driver, inpColumn_8,Column_8, "Column_8");
			return this;
		}
		public GroupActuaryUnitOPage enterColumn_7(WebDriver driver,String Column_7) {
			BrowserActions.type(driver, inpColumn_7,Column_7, "Column_7");
			return this;
		}
		public GroupActuaryUnitOPage enterBranchCode(WebDriver driver,String BranchCode) {
			BrowserActions.type(driver, inpBranchCode,BranchCode, "BranchCode");
			return this;
		}
		public GroupActuaryUnitOPage enterColumn_4(WebDriver driver,String Column_4) {
			BrowserActions.type(driver, inpColumn_4,Column_4, "Column_4");
			return this;
		}
		public GroupActuaryUnitOPage clickSelectUser(WebDriver driver)  {
			BrowserActions.click(driver, btnSelectUser,"SelectUser");
			return this;
		}
		public GroupActuaryUnitOPage enterColumn_5(WebDriver driver,String Column_5) {
			BrowserActions.type(driver, inpColumn_5,Column_5, "Column_5");
			return this;
		}
		public GroupActuaryUnitOPage enterColumn_2(WebDriver driver,String Column_2) {
			BrowserActions.type(driver, inpColumn_2,Column_2, "Column_2");
			return this;
		}
		public GroupActuaryUnitOPage clickSelectGroup(WebDriver driver)  {
			BrowserActions.click(driver, btnSelectGroup,"SelectGroup");
			return this;
		}
		public GroupActuaryUnitOPage clickSelectOrganization(WebDriver driver)  {
			BrowserActions.click(driver, btnSelectOrganization,"SelectOrganization");
			return this;
		}
		public GroupActuaryUnitOPage clickManager(WebDriver driver)  {
			BrowserActions.click(driver, chkManager,"Manager");
			return this;
		}
		public GroupActuaryUnitOPage clickAdd(WebDriver driver)  {
			BrowserActions.click(driver, btnAdd,"Add");
			return this;
		}
		public GroupActuaryUnitOPage clickBranchMenuIcon_47(WebDriver driver)  {
			BrowserActions.click(driver, btnBranchMenuIcon_47,"BranchMenuIcon_47");
			return this;
		}
		public GroupActuaryUnitOPage enterSupervisor(WebDriver driver,String Supervisor) {
			BrowserActions.type(driver, inpSupervisor,Supervisor, "Supervisor");
			return this;
		}
		public GroupActuaryUnitOPage enterDescription_24(WebDriver driver,String Description_24) {
			BrowserActions.type(driver, inpDescription_24,Description_24, "Description_24");
			return this;
		}
		public GroupActuaryUnitOPage clickBranchMenuIcon_40(WebDriver driver)  {
			BrowserActions.click(driver, btnBranchMenuIcon_40,"BranchMenuIcon_40");
			return this;
		}
		public GroupActuaryUnitOPage clickAvailable_22(WebDriver driver)  {
			BrowserActions.click(driver, chkAvailable_22,"Available_22");
			return this;
		}
		public GroupActuaryUnitOPage enterDescription(WebDriver driver,String Description) {
			BrowserActions.type(driver, inpDescription,Description, "Description");
			return this;
		}
		public GroupActuaryUnitOPage enterLanguage(WebDriver driver,String Language) {
			BrowserActions.type(driver, inpLanguage,Language, "Language");
			return this;
		}
		public GroupActuaryUnitOPage selectLoadFactorPermissions(WebDriver driver,String LoadFactorPermissions)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpLoadFactorPermissions,LoadFactorPermissions,"LoadFactorPermissions");
			return this;
		}
		public GroupActuaryUnitOPage clickExistingUsers(WebDriver driver)  {
			BrowserActions.click(driver, btnExistingUsers,"ExistingUsers");
			return this;
		}
		public GroupActuaryUnitOPage clickParentMenuIcon(WebDriver driver)  {
			BrowserActions.click(driver, btnParentMenuIcon,"ParentMenuIcon");
			return this;
		}
		public GroupActuaryUnitOPage clickProducerCodes(WebDriver driver)  {
			BrowserActions.click(driver, btnProducerCodes,"ProducerCodes");
			return this;
		}
		public GroupActuaryUnitOPage clickRemove_10(WebDriver driver)  {
			BrowserActions.click(driver, btnRemove_10,"Remove_10");
			return this;
		}
		public GroupActuaryUnitOPage enterGroupName(WebDriver driver,String GroupName) {
			BrowserActions.type(driver, inpGroupName,GroupName, "GroupName");
			return this;
		}
		public GroupActuaryUnitOPage clickMember(WebDriver driver)  {
			BrowserActions.click(driver, chkMember,"Member");
			return this;
		}
		public GroupActuaryUnitOPage clickBranchMenuIcon_26(WebDriver driver)  {
			BrowserActions.click(driver, btnBranchMenuIcon_26,"BranchMenuIcon_26");
			return this;
		}
		public GroupActuaryUnitOPage clickAdd_52(WebDriver driver)  {
			BrowserActions.click(driver, btnAdd_52,"Add_52");
			return this;
		}
		public GroupActuaryUnitOPage clickAdd_50(WebDriver driver)  {
			BrowserActions.click(driver, btnAdd_50,"Add_50");
			return this;
		}
		public GroupActuaryUnitOPage selectParentGroup(WebDriver driver,String ParentGroup)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpParentGroup,ParentGroup,"ParentGroup");
			return this;
		}
		public GroupActuaryUnitOPage clickAvailable_43(WebDriver driver)  {
			BrowserActions.click(driver, chkAvailable_43,"Available_43");
			return this;
		}
		public GroupActuaryUnitOPage enterCode_44(WebDriver driver,String Code_44) {
			BrowserActions.type(driver, inpCode_44,Code_44, "Code_44");
			return this;
		}
		public GroupActuaryUnitOPage clickAvailable(WebDriver driver)  {
			BrowserActions.click(driver, chkAvailable,"Available");
			return this;
		}
		public GroupActuaryUnitOPage clickEdit(WebDriver driver)  {
			BrowserActions.click(driver, btnEdit,"Edit");
			return this;
		}
		public GroupActuaryUnitOPage clickUpdate(WebDriver driver)  {
			BrowserActions.click(driver, btnUpdate,"Update");
			return this;
		}
		public GroupActuaryUnitOPage clickSearchforGroup_35(WebDriver driver)  {
			BrowserActions.click(driver, btnSearchforGroup_35,"SearchforGroup_35");
			return this;
		}
		public GroupActuaryUnitOPage clickManager_16(WebDriver driver)  {
			BrowserActions.click(driver, chkManager_16,"Manager_16");
			return this;
		}
		public GroupActuaryUnitOPage enterFieldHeading_1(WebDriver driver,String FieldHeading_1) {
			BrowserActions.type(driver, inpFieldHeading_1,FieldHeading_1, "FieldHeading_1");
			return this;
		}
		public GroupActuaryUnitOPage clickDelete(WebDriver driver)  {
			BrowserActions.click(driver, btnDelete,"Delete");
			return this;
		}
		public GroupActuaryUnitOPage clickSearchforGroup(WebDriver driver)  {
			BrowserActions.click(driver, btnSearchforGroup,"SearchforGroup");
			return this;
		}
		public GroupActuaryUnitOPage clickBasics(WebDriver driver)  {
			BrowserActions.click(driver, btnBasics,"Basics");
			return this;
		}
		public GroupActuaryUnitOPage clickRegions(WebDriver driver)  {
			BrowserActions.click(driver, btnRegions,"Regions");
			return this;
		}
		public GroupActuaryUnitOPage enterUser_13(WebDriver driver,String User_13) {
			BrowserActions.type(driver, inpUser_13,User_13, "User_13");
			return this;
		}
		public GroupActuaryUnitOPage clickRemove(WebDriver driver)  {
			BrowserActions.click(driver, btnRemove,"Remove");
			return this;
		}
		public GroupActuaryUnitOPage selectStatus(WebDriver driver,String Status)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpStatus,Status,"Status");
			return this;
		}
		public GroupActuaryUnitOPage clickAdd_9(WebDriver driver)  {
			BrowserActions.click(driver, btnAdd_9,"Add_9");
			return this;
		}
		public GroupActuaryUnitOPage enterCode_30(WebDriver driver,String Code_30) {
			BrowserActions.type(driver, inpCode_30,Code_30, "Code_30");
			return this;
		}
		public GroupActuaryUnitOPage clickSearchforGroup_28(WebDriver driver)  {
			BrowserActions.click(driver, btnSearchforGroup_28,"SearchforGroup_28");
			return this;
		}
		public GroupActuaryUnitOPage clickAvailable_36(WebDriver driver)  {
			BrowserActions.click(driver, chkAvailable_36,"Available_36");
			return this;
		}
		public GroupActuaryUnitOPage clickSearchforGroup_21(WebDriver driver)  {
			BrowserActions.click(driver, btnSearchforGroup_21,"SearchforGroup_21");
			return this;
		}
		public GroupActuaryUnitOPage enterCode_37(WebDriver driver,String Code_37) {
			BrowserActions.type(driver, inpCode_37,Code_37, "Code_37");
			return this;
		}
		public GroupActuaryUnitOPage enterLanguageHeading(WebDriver driver,String LanguageHeading) {
			BrowserActions.type(driver, inpLanguageHeading,LanguageHeading, "LanguageHeading");
			return this;
		}
		public GroupActuaryUnitOPage clickCancel(WebDriver driver)  {
			BrowserActions.click(driver, btnCancel,"Cancel");
			return this;
		}
		public GroupActuaryUnitOPage enterLoadFactor(WebDriver driver,String LoadFactor) {
			BrowserActions.type(driver, inpLoadFactor,LoadFactor, "LoadFactor");
			return this;
		}
		public GroupActuaryUnitOPage clickSelectUser_11(WebDriver driver)  {
			BrowserActions.click(driver, btnSelectUser_11,"SelectUser_11");
			return this;
		}
		public GroupActuaryUnitOPage clickSelectUser_14(WebDriver driver)  {
			BrowserActions.click(driver, btnSelectUser_14,"SelectUser_14");
			return this;
		}
		public GroupActuaryUnitOPage clickAvailable_29(WebDriver driver)  {
			BrowserActions.click(driver, chkAvailable_29,"Available_29");
			return this;
		}
		public GroupActuaryUnitOPage clickQueues(WebDriver driver)  {
			BrowserActions.click(driver, btnQueues,"Queues");
			return this;
		}

	public GroupActuaryUnitOPage clickGroupNameInSearchResult(WebDriver driver)  {
		BrowserActions.click(driver, btnGroupNameSearch,"Group Name Search");
		return this;
	}
	public GroupActuaryUnitOPage clickManagerCheckbox(WebDriver driver) {
		BrowserActions.click(driver, chkManger,"Manager check box");
		return this;	
	}
	
	/**
	 * Verify User is added
	 * @author vignesh.ravi
	 * @param driver 
	 * @return
	 */
	public GroupActuaryUnitOPage verifyUserIsAdded(WebDriver driver) {
		BrowserActions.verifyElementDisplayed(driver, lblUser,"Super User should be  successfully added");
		return this;	
	}
}
}