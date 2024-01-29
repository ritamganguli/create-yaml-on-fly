package com.aspire.guidewire.cc.pages.nonlob;
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
	public WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "input[name='AdminGroupSearchPage-GroupSearchScreen-GroupSearchDV-GroupNameKanji']", AI = false)
	public WebElement inpGroupName_1;

	@IFindBy(how = How.CSS, using = "#AdminGroupSearchPage-GroupSearchScreen-GroupSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Search", AI = false)
	public WebElement btnSearch;

	@IFindBy(how = How.CSS, using = "#AdminGroupSearchPage-GroupSearchScreen-GroupSearchResultsLV-0-Name-NameMenuIcon>div[role='button']", AI = false)
	public WebElement btnNameMenuIcon;

	@IFindBy(how = How.CSS, using = "#AdminGroupSearchPage-GroupSearchScreen-GroupSearchResultsLV-0-ParentGroup-ParentGroupMenuIcon>div[role='button']", AI = false)
	public WebElement btnParentGroupMenuIcon;

	@IFindBy(how = How.CSS, using = "input[name='AdminGroupSearchPage-GroupSearchScreen-GroupSearchDV-GroupName']", AI = false)
	public WebElement inpGroupName;

	@IFindBy(how = How.CSS, using = "select[name='AdminGroupSearchPage-GroupSearchScreen-GroupSearchDV-GroupType']", AI = false)
	public WebElement drpGroupType;

	@IFindBy(how = How.CSS, using = "#AdminGroupSearchPage-GroupSearchScreen-GroupSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Reset", AI = false)
	public WebElement btnReset;

	@IFindBy(how = How.CSS, using = "select[name='AdminGroupSearchPage-GroupSearchScreen-GroupSearchResultsLV-0-ParentGroup']", AI = false)
	public WebElement drpParentGroup;

	@IFindBy(how = How.CSS, using = "select[name='GroupDetailPage-GroupDetailScreen-GroupDetailDV-SecurityZone']", AI = false)
	public WebElement drpSecurityZone;

	@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-GroupQueuesDV-GroupQueuesLV_tb-Remove>div[role='button']", AI = false)
	public WebElement btnRemove_102;

	@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-GroupRegionLV_tb-Remove>div[role='button']", AI = false)
	public WebElement btnRemove_105;

	@IFindBy(how = How.CSS, using = "input[name='GroupDetailPage-GroupDetailScreen-GroupUsersLV-5-GroupUsers_Manager']", AI = false)
	public WebElement chkManager_78;

	@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-GroupDetailDV-Parent-GroupPickerMenuIcon>div[role='menuitem']", AI = false)
	public WebElement btnSelectGroup_3;

	@IFindBy(how = How.CSS, using = "select[name='GroupDetailPage-GroupDetailScreen-GroupUsersLV-1-GroupUsers_LoadFactorType']", AI = false)
	public WebElement drpLoadPerm_15;

	@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-GroupUsersLV-0-GroupUsers_User-GroupUsers_UserMenuIcon>div[role='button']", AI = false)
	public WebElement btnGroupUsers_UserMenuIcon;

	@IFindBy(how = How.CSS, using = "input[name='GroupDetailPage-GroupDetailScreen-GroupUsersLV-1-LoadFactor']", AI = false)
	public WebElement inpLoadFactor_16;

	@IFindBy(how = How.CSS, using = "input[name='GroupDetailPage-GroupDetailScreen-GroupUsersLV-5-WeightedWorkload']", AI = false)
	public WebElement inpWeightedWorkload_81;

	@IFindBy(how = How.CSS, using = "select[name='GroupDetailPage-GroupDetailScreen-GroupUsersLV-0-ProximitySearchStatus']", AI = false)
	public WebElement drpProximitySearchStatus;

	@IFindBy(how = How.CSS, using = "select[name='GroupDetailPage-GroupDetailScreen-GroupUsersLV-4-BackupUser']", AI = false)
	public WebElement drpBackupUser_67;

	@IFindBy(how = How.CSS, using = "input[name='GroupDetailPage-GroupDetailScreen-GroupUsersLV-4-GroupUsers_Manager']", AI = false)
	public WebElement chkManager_62;

	@IFindBy(how = How.CSS, using = "input[name='GroupDetailPage-GroupDetailScreen-GroupUsersLV-4-WeightedWorkload']", AI = false)
	public WebElement inpWeightedWorkload_65;

	@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-GroupDetailDV-Supervisor-SupervisorUserSearchMenuItem>div[role='menuitem']", AI = false)
	public WebElement btnSearchforaUser;

	@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-GroupDetailDV-Supervisor-SupervisorMenuIcon>div[role='button']", AI = false)
	public WebElement btnSupervisorMenuIcon;

	@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-GroupUsersLV-5-GroupUsers_User-GroupUsers_UserMenuIcon>div[role='button']", AI = false)
	public WebElement btnGroupUsers_UserMenuIcon_73;

	@IFindBy(how = How.CSS, using = "input[name='GroupDetailPage-GroupDetailScreen-GroupUsersLV-5-GroupUsers_Active']", AI = false)
	public WebElement chkActive_77;

	@IFindBy(how = How.CSS, using = "select[name='GroupDetailPage-GroupDetailScreen-GroupUsersLV-0-GroupUsers_User']", AI = false)
	public WebElement drpUser;

	@IFindBy(how = How.CSS, using = "select[name='GroupDetailPage-GroupDetailScreen-GroupUsersLV-1-GroupUsers_User']", AI = false)
	public WebElement drpUser_8;

	@IFindBy(how = How.CSS, using = "input[name='GroupDetailPage-GroupDetailScreen-GroupUsersLV-5-GroupUsers_Member']", AI = false)
	public WebElement chkMember_76;

	@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-GroupUsersLV-1-GroupUsers_User-GroupUsers_UserMenuIcon>div[role='button']", AI = false)
	public WebElement btnGroupUsers_UserMenuIcon_9;

	@IFindBy(how = How.CSS, using = "select[name='GroupDetailPage-GroupDetailScreen-GroupUsersLV-2-GroupUsers_LoadFactorType']", AI = false)
	public WebElement drpLoadPerm_31;

	@IFindBy(how = How.CSS, using = "input[name='GroupDetailPage-GroupDetailScreen-GroupUsersLV-2-LoadFactor']", AI = false)
	public WebElement inpLoadFactor_32;

	@IFindBy(how = How.CSS, using = "input[name='GroupDetailPage-GroupDetailScreen-GroupUsersLV-3-GroupUsers_Manager']", AI = false)
	public WebElement chkManager_46;

	@IFindBy(how = How.CSS, using = "select[name='GroupDetailPage-GroupDetailScreen-GroupUsersLV-3-GroupUsers_LoadFactorType']", AI = false)
	public WebElement drpLoadPerm_47;

	@IFindBy(how = How.CSS, using = "input[name='GroupDetailPage-GroupDetailScreen-GroupUsersLV-0-GroupUsers_Manager']", AI = false)
	public WebElement chkManager;

	@IFindBy(how = How.CSS, using = "select[name='GroupDetailPage-GroupDetailScreen-GroupUsersLV-5-BackupUser']", AI = false)
	public WebElement drpBackupUser_83;

	@IFindBy(how = How.CSS, using = "input[name='GroupDetailPage-GroupDetailScreen-GroupUsersLV-4-GroupUsers_Active']", AI = false)
	public WebElement chkActive_61;

	@IFindBy(how = How.CSS, using = "input[name='GroupDetailPage-GroupDetailScreen-GroupUsersLV-2-GroupUsers_Manager']", AI = false)
	public WebElement chkManager_30;

	@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-GroupUsersLV-4-GroupUsers_User-GroupUsers_UserUserSelectMenuItem>div[role='menuitem']", AI = false)
	public WebElement btnSelectUser_59;

	@IFindBy(how = How.CSS, using = "select[name='GroupDetailPage-GroupDetailScreen-GroupUsersLV-0-BackupUser']", AI = false)
	public WebElement drpBackupUser;

	@IFindBy(how = How.CSS, using = "select[name='GroupDetailPage-GroupDetailScreen-GroupUsersLV-1-VacationStatus']", AI = false)
	public WebElement drpVacationStatus_18;

	@IFindBy(how = How.CSS, using = "input[name='GroupDetailPage-GroupDetailScreen-GroupQueuesDV-GroupQueuesLV-0-SubGroupVisible']", AI = false)
	public WebElement rdbVisibleinSubgroups;

	@IFindBy(how = How.CSS, using = "input[name='GroupDetailPage-GroupDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-0-Language']", AI = false)
	public WebElement inpLanguage;

	@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-GroupUsersLV-3-GroupUsers_User-GroupUsers_UserUserSearchMenuItem>div[role='menuitem']", AI = false)
	public WebElement btnSearchforaUser_42;

	@IFindBy(how = How.CSS, using = "input[name='GroupDetailPage-GroupDetailScreen-GroupUsersLV-3-GroupUsers_Active']", AI = false)
	public WebElement chkActive_45;

	@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV_tb-Remove>div[role='button']", AI = false)
	public WebElement btnRemove_90;

	@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-GroupDetailDV-Parent-ParentMenuIcon>div[role='button']", AI = false)
	public WebElement btnParentMenuIcon;

	@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-GroupUsersLV_tb-GroupDetailDV_ClearBackupUserButton>div[role='button']", AI = false)
	public WebElement btnClearBackupUser;

	@IFindBy(how = How.CSS, using = "select[name='GroupDetailPage-GroupDetailScreen-GroupDetailDV-Supervisor']", AI = false)
	public WebElement drpSupervisor;

	@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-GroupUsersLV-5-GroupUsers_User-GroupUsers_UserUserSelectMenuItem>div[role='menuitem']", AI = false)
	public WebElement btnSelectUser_75;

	@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-GroupUsersLV-2-BackupUser-BackupUserUserSearchMenuItem>div[role='menuitem']", AI = false)
	public WebElement btnSearchforaUser_37;

	@IFindBy(how = How.CSS, using = "input[name='GroupDetailPage-GroupDetailScreen-GroupUsersLV-4-GroupUsers_Member']", AI = false)
	public WebElement chkMember_60;

	@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-GroupUsersLV-4-BackupUser-BackupUserUserSelectMenuItem>div[role='menuitem']", AI = false)
	public WebElement btnSelectUser_70;

	@IFindBy(how = How.CSS, using = "select[name='GroupDetailPage-GroupDetailScreen-GroupUsersLV-4-GroupUsers_LoadFactorType']", AI = false)
	public WebElement drpLoadPerm_63;

	@IFindBy(how = How.CSS, using = "div[id$='Edit']", AI = false)
	public WebElement btnEdit;

	@IFindBy(how = How.CSS, using = "input[name='GroupDetailPage-GroupDetailScreen-GroupUsersLV-2-GroupUsers_Member']", AI = false)
	public WebElement chkMember_28;

	@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-GroupDetailToolbarButtonSet-Update>div[role='button']", AI = false)
	public WebElement btnUpdate;

	@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-GroupUsersLV-0-GroupUsers_User-GroupUsers_UserUserSelectMenuItem>div[role='menuitem']", AI = false)
	public WebElement btnSelectUser_5;

	@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-GroupUsersLV-0-BackupUser-BackupUserUserSelectMenuItem>div[role='menuitem']", AI = false)
	public WebElement btnSelectUser_7;

	@IFindBy(how = How.CSS, using = "select[name='GroupDetailPage-GroupDetailScreen-GroupUsersLV-2-VacationStatus']", AI = false)
	public WebElement drpVacationStatus_34;

	@IFindBy(how = How.CSS, using = "input[name='GroupDetailPage-GroupDetailScreen-GroupUsersLV-1-GroupUsers_Manager']", AI = false)
	public WebElement chkManager_14;

	@IFindBy(how = How.CSS, using = "input[name='GroupDetailPage-GroupDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-2-column2']", AI = false)
	public WebElement inpDependentonRender_100;

	@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-GroupUsersLV-5-BackupUser-BackupUserUserSelectMenuItem>div[role='menuitem']", AI = false)
	public WebElement btnSelectUser_86;

	@IFindBy(how = How.CSS, using = "select[name='GroupDetailPage-GroupDetailScreen-GroupUsersLV-5-GroupUsers_LoadFactorType']", AI = false)
	public WebElement drpLoadPerm_79;

	@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-GroupDetailDV-NameReadOnly-GroupSearchMenuIcon>div[role='menuitem']", AI = false)
	public WebElement btnSearchforGroup;

	@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-GroupUsersLV-2-GroupUsers_User-GroupUsers_UserUserSearchMenuItem>div[role='menuitem']", AI = false)
	public WebElement btnSearchforaUser_26;

	@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-GroupUsersLV-1-BackupUser-BackupUserUserSearchMenuItem>div[role='menuitem']", AI = false)
	public WebElement btnSearchforaUser_21;

	@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-GroupUsersLV-4-BackupUser-BackupUserMenuIcon>div[role='button']", AI = false)
	public WebElement btnBackupUserMenuIcon_68;

	@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-GroupUsersLV-5-BackupUser-BackupUserMenuIcon>div[role='button']", AI = false)
	public WebElement btnBackupUserMenuIcon_84;

	@IFindBy(how = How.CSS, using = "input[name='GroupDetailPage-GroupDetailScreen-GroupUsersLV-2-GroupUsers_Active']", AI = false)
	public WebElement chkActive_29;

	@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-GroupDetailToolbarButtonSet-Cancel>div[role='button']", AI = false)
	public WebElement btnCancel;

	@IFindBy(how = How.CSS, using = "input[name='GroupDetailPage-GroupDetailScreen-GroupUsersLV-0-LoadFactor']", AI = false)
	public WebElement inpLoadFactor;

	@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-GroupUsersLV-1-GroupUsers_User-GroupUsers_UserUserSearchMenuItem>div[role='menuitem']", AI = false)
	public WebElement btnSearchforaUser_10;

	@IFindBy(how = How.CSS, using = "div[id$='GroupDetail_QueuesCardTab']", AI = false)
	public WebElement btnQueues;

	@IFindBy(how = How.CSS, using = "input[name='GroupDetailPage-GroupDetailScreen-GroupUsersLV-3-GroupUsers_Member']", AI = false)
	public WebElement chkMember_44;

	@IFindBy(how = How.CSS, using = "input[name='GroupDetailPage-GroupDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-1-column0']", AI = false)
	public WebElement inpName_94;

	@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-GroupDetail_BasicCardTab", AI = false)
	public WebElement btnProfile;

	@IFindBy(how = How.CSS, using = "input[name='GroupDetailPage-GroupDetailScreen-GroupUsersLV-1-GroupUsers_Active']", AI = false)
	public WebElement chkActive_13;

	@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-GroupUsersLV-3-BackupUser-BackupUserMenuIcon>div[role='button']", AI = false)
	public WebElement btnBackupUserMenuIcon_52;

	@IFindBy(how = How.CSS, using = "input[name='GroupDetailPage-GroupDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-0-column0']", AI = false)
	public WebElement inpName_91;

	@IFindBy(how = How.CSS, using = "select[name='GroupDetailPage-GroupDetailScreen-GroupUsersLV-3-VacationStatus']", AI = false)
	public WebElement drpVacationStatus_50;

	@IFindBy(how = How.CSS, using = "input[name='GroupDetailPage-GroupDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-2-column0']", AI = false)
	public WebElement inpName_98;

	@IFindBy(how = How.CSS, using = "select[name='GroupDetailPage-GroupDetailScreen-GroupUsersLV-1-ProximitySearchStatus']", AI = false)
	public WebElement drpProximitySearchStatus_23;

	@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-GroupUsersLV-1-BackupUser-BackupUserUserSelectMenuItem>div[role='menuitem']", AI = false)
	public WebElement btnSelectUser_22;

	@IFindBy(how = How.CSS, using = "select[name='GroupDetailPage-GroupDetailScreen-GroupUsersLV-2-GroupUsers_User']", AI = false)
	public WebElement drpUser_24;

	@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV_tb-Add>div[role='button']", AI = false)
	public WebElement btnAdd_89;

	@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-GroupUsersLV-5-BackupUser-BackupUserUserSearchMenuItem>div[role='menuitem']", AI = false)
	public WebElement btnSearchforaUser_85;

	@IFindBy(how = How.CSS, using = "input[name='GroupDetailPage-GroupDetailScreen-GroupUsersLV-1-GroupUsers_Member']", AI = false)
	public WebElement chkMember_12;

	@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-GroupUsersLV-0-BackupUser-BackupUserMenuIcon>div[role='button']", AI = false)
	public WebElement btnBackupUserMenuIcon;

	@IFindBy(how = How.CSS, using = "input[name='GroupDetailPage-GroupDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-1-Language']", AI = false)
	public WebElement inpLanguage_93;

	@IFindBy(how = How.CSS, using = "select[name='GroupDetailPage-GroupDetailScreen-GroupDetailDV-Parent']", AI = false)
	public WebElement drpParent;

	@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-GroupUsersLV-2-GroupUsers_User-GroupUsers_UserUserSelectMenuItem>div[role='menuitem']", AI = false)
	public WebElement btnSelectUser_27;

	@IFindBy(how = How.CSS, using = "input[name='GroupDetailPage-GroupDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-0-column2']", AI = false)
	public WebElement inpDependentonRender_92;

	@IFindBy(how = How.CSS, using = "input[name='GroupDetailPage-GroupDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-2-Language']", AI = false)
	public WebElement inpLanguage_97;

	@IFindBy(how = How.CSS, using = "input[name='GroupDetailPage-GroupDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-2-column1']", AI = false)
	public WebElement inpDependentonRender_99;

	@IFindBy(how = How.CSS, using = "input[name='GroupDetailPage-GroupDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-1-column1']", AI = false)
	public WebElement inpDependentonRender_95;

	@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-GroupDetailDV-NameReadOnly-NameReadOnlyMenuIcon>div[role='button']", AI = false)
	public WebElement btnNameReadOnlyMenuIcon;

	@IFindBy(how = How.CSS, using = "select[name='GroupDetailPage-GroupDetailScreen-GroupDetailDV-Type']", AI = false)
	public WebElement drpType;

	@IFindBy(how = How.CSS, using = "input[name='GroupDetailPage-GroupDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-1-column2']", AI = false)
	public WebElement inpDependentonRender_96;

	@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-GroupUsersLV-5-GroupUsers_User-GroupUsers_UserUserSearchMenuItem>div[role='menuitem']", AI = false)
	public WebElement btnSearchforaUser_74;

	@IFindBy(how = How.CSS, using = "input[name='GroupDetailPage-GroupDetailScreen-GroupRegionLV-1-Zones']", AI = false)
	public WebElement inpAreasCovered_108;

	@IFindBy(how = How.CSS, using = "input[name='GroupDetailPage-GroupDetailScreen-GroupRegionLV-0-Zones']", AI = false)
	public WebElement inpAreasCovered;

	@IFindBy(how = How.CSS, using = "select[name='GroupDetailPage-GroupDetailScreen-GroupUsersLV-1-BackupUser']", AI = false)
	public WebElement drpBackupUser_19;

	@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-GroupUsersLV-2-BackupUser-BackupUserUserSelectMenuItem>div[role='menuitem']", AI = false)
	public WebElement btnSelectUser_38;

	@IFindBy(how = How.CSS, using = "select[name='GroupDetailPage-GroupDetailScreen-GroupUsersLV-3-GroupUsers_User']", AI = false)
	public WebElement drpUser_40;

	@IFindBy(how = How.CSS, using = "input[name='GroupDetailPage-GroupDetailScreen-GroupUsersLV-1-WeightedWorkload']", AI = false)
	public WebElement inpWeightedWorkload_17;

	@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-GroupUsersLV-4-BackupUser-BackupUserUserSearchMenuItem>div[role='menuitem']", AI = false)
	public WebElement btnSearchforaUser_69;

	@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-GroupUsersLV-3-GroupUsers_User-GroupUsers_UserUserSelectMenuItem>div[role='menuitem']", AI = false)
	public WebElement btnSelectUser_43;

	@IFindBy(how = How.CSS, using = "input[name='GroupDetailPage-GroupDetailScreen-GroupDetailDV-Name']", AI = false)
	public WebElement inpName;

	@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-GroupDetailDV-Supervisor-SupervisorUserSelectMenuItem>div[role='menuitem']", AI = false)
	public WebElement btnSelectUser;

	@IFindBy(how = How.CSS, using = "select[name='GroupDetailPage-GroupDetailScreen-GroupUsersLV-4-VacationStatus']", AI = false)
	public WebElement drpVacationStatus_66;

	@IFindBy(how = How.CSS, using = "select[name='GroupDetailPage-GroupDetailScreen-GroupUsersLV-0-GroupUsers_LoadFactorType']", AI = false)
	public WebElement drpLoadPerm;

	@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-GroupDetailDV-NameReadOnly-GroupPickerMenuIcon>div[role='menuitem']", AI = false)
	public WebElement btnSelectGroup;

	@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-GroupUsersLV-4-GroupUsers_User-GroupUsers_UserUserSearchMenuItem>div[role='menuitem']", AI = false)
	public WebElement btnSearchforaUser_58;

	@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-GroupUsersLV-3-BackupUser-BackupUserUserSelectMenuItem>div[role='menuitem']", AI = false)
	public WebElement btnSelectUser_54;

	@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-GroupUsersLV_tb-Add>div[role='button']", AI = false)
	public WebElement btnAdd;

	@IFindBy(how = How.CSS, using = "select[name='GroupDetailPage-GroupDetailScreen-GroupUsersLV-2-ProximitySearchStatus']", AI = false)
	public WebElement drpProximitySearchStatus_39;

	@IFindBy(how = How.CSS, using = "input[name='GroupDetailPage-GroupDetailScreen-GroupDetailDV-NameKanji']", AI = false)
	public WebElement inpName_1;

	@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-GroupUsersLV-3-BackupUser-BackupUserUserSearchMenuItem>div[role='menuitem']", AI = false)
	public WebElement btnSearchforaUser_53;

	@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-GroupUsersLV-2-BackupUser-BackupUserMenuIcon>div[role='button']", AI = false)
	public WebElement btnBackupUserMenuIcon_36;

	@IFindBy(how = How.CSS, using = "input[name='GroupDetailPage-GroupDetailScreen-GroupUsersLV-4-LoadFactor']", AI = false)
	public WebElement inpLoadFactor_64;

	@IFindBy(how = How.CSS, using = "select[name='GroupDetailPage-GroupDetailScreen-GroupUsersLV-2-BackupUser']", AI = false)
	public WebElement drpBackupUser_35;

	@IFindBy(how = How.CSS, using = "input[name='GroupDetailPage-GroupDetailScreen-GroupUsersLV-2-WeightedWorkload']", AI = false)
	public WebElement inpWeightedWorkload_33;

	@IFindBy(how = How.CSS, using = "input[name='GroupDetailPage-GroupDetailScreen-GroupRegionLV-3-Name']", AI = false)
	public WebElement inpName_111;

	@IFindBy(how = How.CSS, using = "select[name='GroupDetailPage-GroupDetailScreen-GroupDetailDV-NameReadOnly']", AI = false)
	public WebElement drpName;

	@IFindBy(how = How.CSS, using = "input[name='GroupDetailPage-GroupDetailScreen-GroupUsersLV-0-GroupUsers_Active']", AI = false)
	public WebElement chkActive;

	@IFindBy(how = How.CSS, using = "input[name='GroupDetailPage-GroupDetailScreen-GroupQueuesDV-GroupQueuesLV-0-Description']", AI = false)
	public WebElement inpDescription;

	@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-GroupUsersLV-0-GroupUsers_User-GroupUsers_UserUserSearchMenuItem>div[role='menuitem']", AI = false)
	public WebElement btnSearchforaUser_4;

	@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-GroupUsersLV-0-BackupUser-BackupUserUserSearchMenuItem>div[role='menuitem']", AI = false)
	public WebElement btnSearchforaUser_6;

	@IFindBy(how = How.CSS, using = "input[name='GroupDetailPage-GroupDetailScreen-GroupUsersLV-0-WeightedWorkload']", AI = false)
	public WebElement inpWeightedWorkload;

	@IFindBy(how = How.CSS, using = "select[name='GroupDetailPage-GroupDetailScreen-GroupUsersLV-0-VacationStatus']", AI = false)
	public WebElement drpVacationStatus;

	@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-GroupDetailDV-Parent-GroupSearchMenuIcon>div[role='menuitem']", AI = false)
	public WebElement btnSearchforGroup_2;

	@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-GroupUsersLV-3-GroupUsers_User-GroupUsers_UserMenuIcon>div[role='button']", AI = false)
	public WebElement btnGroupUsers_UserMenuIcon_41;

	@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-GroupUsersLV-2-GroupUsers_User-GroupUsers_UserMenuIcon>div[role='button']", AI = false)
	public WebElement btnGroupUsers_UserMenuIcon_25;

	@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-GroupUsersLV-1-BackupUser-BackupUserMenuIcon>div[role='button']", AI = false)
	public WebElement btnBackupUserMenuIcon_20;

	@IFindBy(how = How.CSS, using = "input[name='GroupDetailPage-GroupDetailScreen-GroupQueuesDV-GroupQueuesLV-0-Name']", AI = false)
	public WebElement inpName_103;

	@IFindBy(how = How.CSS, using = "select[name='GroupDetailPage-GroupDetailScreen-GroupUsersLV-5-VacationStatus']", AI = false)
	public WebElement drpVacationStatus_82;

	@IFindBy(how = How.CSS, using = "input[name='GroupDetailPage-GroupDetailScreen-GroupRegionLV-0-Name']", AI = false)
	public WebElement inpName_106;

	@IFindBy(how = How.CSS, using = "input[name='GroupDetailPage-GroupDetailScreen-GroupRegionLV-1-Name']", AI = false)
	public WebElement inpName_107;

	@IFindBy(how = How.CSS, using = "input[name='GroupDetailPage-GroupDetailScreen-GroupRegionLV-2-Name']", AI = false)
	public WebElement inpName_109;

	@IFindBy(how = How.CSS, using = "input[name='GroupDetailPage-GroupDetailScreen-GroupUsersLV-0-GroupUsers_Member']", AI = false)
	public WebElement chkMember;

	@IFindBy(how = How.CSS, using = "select[name='GroupDetailPage-GroupDetailScreen-GroupUsersLV-3-ProximitySearchStatus']", AI = false)
	public WebElement drpProximitySearchStatus_55;

	@IFindBy(how = How.CSS, using = "select[name='GroupDetailPage-GroupDetailScreen-GroupUsersLV-4-GroupUsers_User']", AI = false)
	public WebElement drpUser_56;

	@IFindBy(how = How.CSS, using = "input[name='GroupDetailPage-GroupDetailScreen-GroupRegionLV-2-Zones']", AI = false)
	public WebElement inpAreasCovered_110;

	@IFindBy(how = How.CSS, using = "input[name='GroupDetailPage-GroupDetailScreen-GroupRegionLV-3-Zones']", AI = false)
	public WebElement inpAreasCovered_112;

	@IFindBy(how = How.CSS, using = "input[name='GroupDetailPage-GroupDetailScreen-GroupUsersLV-3-LoadFactor']", AI = false)
	public WebElement inpLoadFactor_48;

	@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-GroupUsersLV-4-GroupUsers_User-GroupUsers_UserMenuIcon>div[role='button']", AI = false)
	public WebElement btnGroupUsers_UserMenuIcon_57;

	@IFindBy(how = How.CSS, using = "input[name='GroupDetailPage-GroupDetailScreen-LoadFactor']", AI = false)
	public WebElement inpLoadFactor_88;

	@IFindBy(how = How.CSS, using = "input[name='GroupDetailPage-GroupDetailScreen-GroupUsersLV-5-LoadFactor']", AI = false)
	public WebElement inpLoadFactor_80;

	@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-GroupDetailToolbarButtonSet-GroupDetailPage_RegionsCard_DeleteButton>div[role='button']", AI = false)
	public WebElement btnDelete;

	@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-GroupDetail_RegionsCardTab", AI = false)
	public WebElement btnRegions;

	@IFindBy(how = How.CSS, using = "select[name='GroupDetailPage-GroupDetailScreen-GroupUsersLV-3-BackupUser']", AI = false)
	public WebElement drpBackupUser_51;

	@IFindBy(how = How.CSS, using = "select[name='GroupDetailPage-GroupDetailScreen-GroupUsersLV-5-ProximitySearchStatus']", AI = false)
	public WebElement drpProximitySearchStatus_87;

	@IFindBy(how = How.CSS, using = "input[name='GroupDetailPage-GroupDetailScreen-GroupUsersLV-3-WeightedWorkload']", AI = false)
	public WebElement inpWeightedWorkload_49;

	@IFindBy(how = How.CSS, using = "select[name='GroupDetailPage-GroupDetailScreen-GroupUsersLV-5-GroupUsers_User']", AI = false)
	public WebElement drpUser_72;

	@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-GroupUsersLV-1-GroupUsers_User-GroupUsers_UserUserSelectMenuItem>div[role='menuitem']", AI = false)
	public WebElement btnSelectUser_11;

	@IFindBy(how = How.CSS, using = "input[name='GroupDetailPage-GroupDetailScreen-LocalizedValuesDV-LocalizedValuesLV-LocalizedValuesLV-0-column1']", AI = false)
	public WebElement inpDependentonRender;

	@IFindBy(how = How.CSS, using = "select[name='GroupDetailPage-GroupDetailScreen-GroupUsersLV-4-ProximitySearchStatus']", AI = false)
	public WebElement drpProximitySearchStatus_71;

	@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-GroupRegionLV_tb-Add>div[role='button']", AI = false)
	public WebElement btnAdd_104;

	@IFindBy(how = How.CSS, using = "#GroupDetailPage-GroupDetailScreen-GroupQueuesDV-GroupQueuesLV_tb-Add>div[role='button']", AI = false)
	public WebElement btnAdd_101;

	@IFindBy(how = How.CSS, using = "div[id$='GroupSearchResultsLV-0-Name']", AI = false)
	public WebElement btnSearchResultName;
	
	@IFindBy(how = How.CSS, using = "div[id$='GroupQueuesLV_tb-Add']", AI = false)
	public WebElement btnGroupQueuesAdd;

	@IFindBy(how = How.XPATH, using = "//tr[last()]//input[contains(@name,'Name')]", AI = false)
	public WebElement inpGroupQueuesName;
	
	@IFindBy(how = How.XPATH, using = "//tr[last()]//input[contains(@name,'Description')]", AI = false)
	public WebElement inpGroupQueuesDescription;

	@IFindBy(how = How.CSS, using = "input[name$='GroupQueuesLV-_Checkbox']", AI = false)
	public WebElement chkGroupQueuesNameList;
	
	@IFindBy(how = How.CSS, using = "div[id$='Remove']", AI = false)
	public WebElement btnRemove;

	@IFindBy(how = How.CSS, using = "div[id$='RegionSearchResultsLV-0-Name']", AI = false)
	public WebElement btnRegionName;
	
	@IFindBy(how = How.CSS, using = "div[id$='RegionLV_tb-Add']", AI = false)
	public WebElement btnAddRegion;

	@IFindBy(how = How.CSS, using = "input[name$='RegionSearchDV-Name']", AI = false)
	public WebElement inpRegionName;

	@IFindBy(how = How.CSS, using = "div[id$='SearchLinksInputSet-Search']", AI = false)
	public WebElement btnRegionSearch;

	@IFindBy(how = How.CSS, using = "div[id$='RegionSearchResultsLV-0-_Checkbox']", AI = false)
	public WebElement chkRegionSearchResult;

	@IFindBy(how = How.CSS, using = "div[id$='RegionPopup_SelectButton']", AI = false)
	public WebElement btnRegionSelect;

	public GroupsPage(){
	}

	public GroupsPage(WebDriver driver) throws Exception{
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
		}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, drpParentGroup))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);
	}

	public GroupsPage enterGroupName_1(WebDriver driver,String GroupName_1) {
		BrowserActions.type(driver, inpGroupName_1,GroupName_1, "GroupName_1");
		return this;
	}
	public GroupsPage clickSearch(WebDriver driver)  {
		BrowserActions.click(driver, btnSearch,"Search");
		return this;
	}
	public GroupsPage selectName(WebDriver driver,String Name)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpName,Name,"Name");
		return this;
	}
	public GroupsPage clickSelectGroup(WebDriver driver)  {
		BrowserActions.click(driver, btnSelectGroup,"SelectGroup");
		return this;
	}
	public GroupsPage clickNameMenuIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnNameMenuIcon,"NameMenuIcon");
		return this;
	}
	public GroupsPage clickParentGroupMenuIcon(WebDriver driver)  {
		BrowserActions.click(driver, btnParentGroupMenuIcon,"ParentGroupMenuIcon");
		return this;
	}
	public GroupsPage clickSelectGroup_3(WebDriver driver)  {
		BrowserActions.click(driver, btnSelectGroup_3,"SelectGroup_3");
		return this;
	}
	public GroupsPage enterGroupName(WebDriver driver,String GroupName) {
		BrowserActions.type(driver, inpGroupName,GroupName, "GroupName");
		return this;
	}
	public GroupsPage clickSearchforGroup(WebDriver driver)  {
		BrowserActions.click(driver, btnSearchforGroup,"SearchforGroup");
		return this;
	}
	public GroupsPage selectType(WebDriver driver,String Type)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpType,Type,"Type");
		return this;
	}
	public GroupsPage clickSearchforGroup_2(WebDriver driver)  {
		BrowserActions.click(driver, btnSearchforGroup_2,"SearchforGroup_2");
		return this;
	}
	public GroupsPage selectGroupType(WebDriver driver,String GroupType)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpGroupType,GroupType,"GroupType");
		return this;
	}
	public GroupsPage clickReset(WebDriver driver)  {
		BrowserActions.click(driver, btnReset,"Reset");
		return this;
	}
	public GroupsPage selectParentGroup(WebDriver driver,String ParentGroup)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpParentGroup,ParentGroup,"ParentGroup");
		return this;
	}
	public GroupsPage clickGroupName(WebDriver driver)  {
		BrowserActions.click(driver, btnSearchResultName,"Search result group name");
		return this;
	}

	public void verifyProfileTab(WebDriver driver) {
		BrowserActions.verifyElementDisplayed(driver, btnProfile, "Profile Tab");
	}
	
	public void clickQueuesTab(WebDriver driver) {
		BrowserActions.click(driver, btnQueues, "Queues Tab");
	}

	public void verifyQueuesTab(WebDriver driver) {
		BrowserActions.verifyElementDisplayed(driver, btnQueues, "Queues Tab");
	}

	public void verifyRegionsTab(WebDriver driver) {
		BrowserActions.verifyElementDisplayed(driver, btnRegions, "Regions Tab");
	}
	
	public void clickRegionsTab(WebDriver driver) {
		BrowserActions.click(driver, btnRegions, "Regions Tab");
	}

	public void clickEdit(WebDriver driver) {
		BrowserActions.click(driver, btnEdit, "Edit Button");
	}

	public void clickGroupQueuesAdd(WebDriver driver) {
		BrowserActions.click(driver, btnGroupQueuesAdd, "Group Queues Add");
	}

	public GroupsPage enterGroupQueuesName(WebDriver driver,String GroupName) {
		BrowserActions.type(driver, inpGroupQueuesName,GroupName, "Group Queue Name");
		return this;
	}
	
	public GroupsPage enterGroupQueuesDescription(WebDriver driver,String description) {
		BrowserActions.type(driver, inpGroupQueuesDescription,description, "Group Queue Description");
		return this;
	}


	public GroupsPage clickGroupQueuesNameCheckBox(WebDriver driver) {
		BrowserActions.click(driver, chkGroupQueuesNameList, "Group Queue Name Checkbox");
		return this;
	}

	public GroupsPage clickRemove(WebDriver driver) {
		BrowserActions.click(driver, btnRemove, "Remove Button");
		return this;
	}

	public GroupsPage clickNameCheckBox(WebDriver driver,String name) {
		BrowserActions.waitForElementToDisplay(driver,btnAddRegion);
		By nameCheckBoxBy = By.xpath("//div[text()='"+name+"']//ancestor::td//preceding-sibling::td//descendant::div[contains(@id,'_Checkbox')]");
		BrowserActions.waitForElementToDisplay(driver, nameCheckBoxBy, "name check box");
		WebElement nameCheckBox = nameCheckBoxBy.findElement(driver);
		BrowserActions.click(driver, nameCheckBox,1,"Name check box");
		return this;
	}
	
	public void clickAddRegion(WebDriver driver) {
		BrowserActions.click(driver, btnAddRegion, "Add Region");
	}
	
	public void clickRegionSearch(WebDriver driver) {
		BrowserActions.click(driver, btnRegionSearch, "Region Search");
	}

	public void clickRegionFromSearchResult(WebDriver driver) {
		BrowserActions.click(driver, chkRegionSearchResult, "Region Search Result");
	}

	public void clickRegionSelect(WebDriver driver) {
		BrowserActions.click(driver, btnRegionSelect, "Region Search Select");
	}

	public void enterRegionsName(WebDriver driver,String name) {
		BrowserActions.type(driver, inpRegionName,name, "Region Name");
	}


}
