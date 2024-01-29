package com.aspire.guidewire.pc.pages.nonlob;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.testng.Assert;

import com.aspire.guidewire.utils.BrowserActions;
import com.aspire.guidewire.utils.ElementLayer;
import com.aspire.guidewire.utils.Log;
import com.aspire.guidewire.utils.Utils;
import com.aspire.guidewire.utils.WaitUtils;

import ASPIREAI.customfactories.AjaxElementLocatorFactory;
import ASPIREAI.customfactories.IFindBy;
import ASPIREAI.customfactories.PageFactory;

public class AdministrationPage  extends LoadableComponent<AdministrationPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	@IFindBy(how = How.ID, using = "AdminUserSearchPage-UserSearchScreen-ttlBar", AI = false)
	public WebElement ttlUsers;

	@IFindBy(how = How.CSS, using = "div[id$='TabBar-AdminTab-Admin_UsersAndSecurity']", AI = false)
	public WebElement lnkUsersAndSecurity;

	@IFindBy(how = How.XPATH, using = "//div[text()='Add Exclusion or Condition']", AI = false)
	public WebElement btnExclusionsOrConditions;

	@IFindBy(how = How.CSS, using = "input[name$='RateModifiers-0-Rate']", AI = false)
	public WebElement txtExperienceModifierValue;

	@IFindBy(how = How.CSS, using = "input[name$='RateModifiers-1-Rate']", AI = false)
	public WebElement txtExpenseModifierValue;

	@IFindBy(how = How.XPATH, using = "//div[text()='State Rating']", AI = false)
	public WebElement tabStateRating;

	@IFindBy(how = How.CSS, using = "div[id$='ExclusionsAndConditionsCardTab']", AI = false)
	public WebElement tabExclusionsAndConditions;

	@IFindBy(how = How.CSS, using = "div[id$='AddExclusionsOrCondition']", AI = false)
	public WebElement btnAddExclusionsOrConditions;

	@IFindBy(how = How.CSS, using = "div[id$='UWAuthorityProfiles']", AI = false)
	public WebElement lnkAuthorityProfile;

	@IFindBy(how = How.CSS, using = "td[id$='Name_Cell']", AI = false)
	public List<WebElement> lblName;

	@IFindBy(how = How.CSS, using = "td[id$='Description_Cell']", AI = false)
	public List<WebElement> lblDescription;

	@IFindBy(how = How.CSS, using = "div[id$='NewButton']", AI = false)
	public WebElement btnNew;

	@IFindBy(how = How.CSS, using = "input[name$='Name']", AI = false)
	public WebElement txtName;

	@IFindBy(how = How.CSS, using = "textarea[name$='Description']", AI = false)
	public WebElement txtDescription;

	@IFindBy(how = How.CSS, using = "div[id$='Add']", AI = false)
	public WebElement btnAdd;

	@IFindBy(how = How.CSS, using = "div[id$='SelectType']", AI = false)
	public WebElement icnSearch;

	@IFindBy(how = How.XPATH, using = "//div[text()='Select']", AI = false)
	public WebElement btnSelectSearchResult;

	@IFindBy(how = How.CSS, using = "input[name$='Value']", AI = false)
	public WebElement txtValue;

	@IFindBy(how = How.XPATH, using = "(//div[text()='Edge Policyholder English (US)']//ancestor::td/following-sibling::td//descendant::input)[1]", AI = false)
	public WebElement txtLocalizationName;

	@IFindBy(how = How.XPATH, using = "(//div[text()='Edge Policyholder English (US)']//ancestor::td/following-sibling::td//descendant::input)[2]", AI = false)
	public WebElement txtLocalizationDescription;

	@IFindBy(how = How.CSS, using = "div[id$='Update']", AI = false)
	public WebElement btnUpdate;

	@IFindBy(how = How.CSS, using = "div[id$='CloneButton']", AI = false)
	public WebElement btnClone;

	@IFindBy(how = How.CSS, using = "div[id$='DeleteWip']", AI = false)
	public WebElement btnDelete;

	@IFindBy(how = How.CSS, using = "div[id$='NewAttributeButton']", AI = false)
	public WebElement btnNewAttribute;

	@IFindBy(how = How.CSS, using = "select[name$='Type']", AI = false)
	public WebElement drpType;

	@IFindBy(how = How.CSS, using = "div[id$='_Attributes']", AI = false)
	public WebElement lnkAttributes;

	@IFindBy(how = How.CSS, using = "Admin-MenuLinks-Admin_UsersAndSecurity-UsersAndSecurity_SearchAffinityGroup", AI = false)
	public WebElement tabAffinityGroups;

	@IFindBy(how = How.CSS, using = "div[id$='Rating']", AI = false)
	public WebElement lnkRating;

	@IFindBy(how = How.CSS, using = "div[id$='RateBooks']", AI = false)
	public WebElement lnkRateBooks;

	@IFindBy(how = How.CSS, using = "select[name$='PolicyLine']", AI = false)
	public WebElement drpPolicyLine;

	@IFindBy(how = How.CSS, using = "select[name$='Status']", AI = false)
	public WebElement drpStatus;

	@IFindBy(how = How.CSS, using = "input[name$='LastStatusChangeDate']", AI = false)
	public WebElement txtActivationDate;

	@IFindBy(how = How.CSS, using = "div[id$='SearchLinksInputSet-Search']", AI = false)
	public WebElement btnSearch;

	@IFindBy(how = How.CSS, using = "div[id$='RateTableDefinitions']", AI = false)
	public WebElement btnRateTableDefinition;

	@IFindBy(how = How.CSS, using = "div[id$='RateRoutines']", AI = false)
	public WebElement btnRateRoutine;

	@IFindBy(how = How.CSS, using = "div[id$='TabBar-AdminTab-Admin_BusinessSettings']", AI = false)
	public WebElement btnBusinessSetting;

	@IFindBy(how = How.CSS, using = "div[id$='NewActivityPatternButton']", AI = false)
	public WebElement btnNewActivityPattern;

	@IFindBy(how = How.XPATH, using = "//div[@id='TabBar-AdminTab']//following::div[@class='gw-action--expand-button']", AI = false)
	public WebElement toggleAdministrationSubMenu;

	@IFindBy(how = How.CSS, using = "div[id$='RateBookDV-Code']", AI = false)
	public WebElement lblCode;

	@IFindBy(how = How.CSS, using = "div[id$='RateBookDV-Status']", AI = false)
	public WebElement lblStatus;

	@IFindBy(how = How.CSS, using = "div[id$='RateBookDV-ActivationDate']", AI = false)
	public WebElement lblActivationDate;

	@IFindBy(how = How.XPATH, using = "//div[text()='Rate Book Details']", AI = false)
	public WebElement lblRateBookDetails;

	@IFindBy(how = How.XPATH, using = "//div[text()='Homeowners Line']//ancestor::td//preceding-sibling::td[contains(@id,'Name_Cell')]", AI = false)
	public WebElement lblname;

	@IFindBy(how = How.CSS, using = "div[id$='UpLink']", AI = false)
	public WebElement btnUpToRateTableDefinition ;

	@IFindBy(how = How.CSS, using = "div[id$='RateTableDefinitionDV']", AI = false)
	public WebElement tabBasicsAllDetails;

	@IFindBy(how = How.CSS, using = "div[id$='ParametersCardTab']", AI = false)
	public WebElement tabParameters;

	@IFindBy(how = How.CSS, using = "div[id$='ParametersCard']", AI = false)
	public WebElement tabParametersAllDetails;

	@IFindBy(how = How.CSS, using = "div[id$='FactorsCardTab']", AI = false)
	public WebElement tabFactor;

	@IFindBy(how = How.CSS, using = "div[id$='FactorsCard']", AI = false)
	public WebElement tabFactorAllDetails;

	@IFindBy(how = How.CSS, using = "div[id$='ArgumentSourceCardTab']", AI = false)
	public WebElement tabArgumentSources;

	@IFindBy(how = How.CSS, using = "div[id$='ArgumentSourceCard']", AI = false)
	public WebElement tabArgumentSourcesAllDetails;

	@IFindBy(how = How.CSS, using = "div[id$='UsageTab']", AI = false)
	public WebElement tabUsage;

	@IFindBy(how = How.CSS, using = "div[id$='RateTableDefinitionUsagePanelSet']", AI = false)
	public WebElement tabUsageAllDetails;

	@IFindBy(how = How.CSS, using = "div[id$='ActivityPatterns']", AI = false)
	public WebElement btnActivityPatterns;

	@IFindBy(how = How.CSS, using = "div[id$='UsersAndSecurity_Roles'][id^='TabBar-AdminTab']", AI = false)
	public WebElement lnkRoles;

	@IFindBy(how = How.CSS, using = "select[name$='Filters']", AI = false)
	public WebElement drpRolesFilters;

	@IFindBy(how = How.CSS, using = "div[id$='NameHeader_inner']", AI = false)
	public WebElement lblNameHeader;

	@IFindBy(how = How.CSS, using = "div[id$='TypeHeader_inner']", AI = false)
	public WebElement lblTypeHeader;

	@IFindBy(how = How.CSS, using = "div[id$='DescriptionHeader_inner']", AI = false)
	public WebElement lblDescriptionHeader;

	@IFindBy(how = How.CSS, using = "div[id$='postLabel']", AI = false)
	public WebElement lblLastPageNo;

	@IFindBy(how = How.CSS, using = "input[id$='ListPaging-input']", AI = false)
	public WebElement txtFirstPageNo;

	@IFindBy(how = How.CSS, using = "div[id$='ListPaging-next']", AI = false)
	public WebElement btnNextArrow;

	@IFindBy(how = How.CSS, using = "div[id$='OrganizationSearchPage']", AI = false)
	public WebElement btnOrganization;

	@IFindBy(how = How.CSS, using = "div[id$='UsersAndSecurity_Regions']", AI = false)
	public WebElement btnRegions;

	@IFindBy(how = How.CSS, using = "div[id$='AdminProducerCodeSearch']", AI = false)
	public WebElement lnkProducerCode;

	@IFindBy(how = How.CSS, using = "input[name$='ProducerCodeSearchDV-Code']", AI = false)
	public WebElement txtProducerCode;

	@IFindBy(how = How.CSS, using = "select[name$='BranchCode']", AI = false)
	public WebElement drpBranchCode;

	@IFindBy(how = How.CSS, using = "input[name$='Organization']", AI = false)
	public WebElement txtOrganization;

	@IFindBy(how = How.CSS, using = "div[id$='Reset']", AI = false)
	public WebElement btnReset;

	@IFindBy(how = How.CSS, using = "div[id$='Code_button']", AI = false)
	public WebElement lnkSearchResultProfucerCode;

	@IFindBy(how = How.CSS, using = "div[aria-controls$='BasicCard']", AI = false)
	public WebElement tabBasic;

	@IFindBy(how = How.CSS, using = "div[aria-controls$='RolesCard']", AI = false)
	public WebElement tabRoles;

	@IFindBy(how = How.CSS, using = "div[aria-controls$='GroupsCard']", AI = false)
	public WebElement tabGroups;

	@IFindBy(how = How.CSS, using = "div[aria-controls$='UsersCard']", AI = false)
	public WebElement tabProducerUser;

	@IFindBy(how = How.CSS, using = "div[id$='Edit']", AI = false)
	public WebElement btnEdit;

	@IFindBy(how = How.CSS, using = "div[id$='AddRoleButton']", AI = false)
	public WebElement btnAddRoleButton;

	@IFindBy(how = How.XPATH, using = "(//tr[contains(@id,'ProducerCodeDetail_RolesLV')])[2]//td[1]", AI = false)
	public WebElement chkProducerCodeDetail1;

	@IFindBy(how = How.CSS, using = "div[id$='RemoveRoleButton']", AI = false)
	public WebElement btnRemoveRole;

	@IFindBy(how = How.CSS, using = "input[name$='Name']", AI = false)
	public WebElement txtOrganizationName;

	@IFindBy(how = How.CSS, using = "select[name$='Type']", AI = false)
	public WebElement drpOrganizationType;

	@IFindBy(how = How.CSS, using = "div[id$='Name_button']", AI = false)
	public WebElement lnkSearchResultOrganizationName;

	@IFindBy(how = How.CSS, using = "div[aria-controls$='UserCard']", AI = false)
	public WebElement tabOrganizationUsers;

	@IFindBy(how = How.CSS, using = "div[aria-controls$='ProducerCodesCard']", AI = false)
	public WebElement tabOrganizationProducerCodes;

	@IFindBy(how = How.CSS, using = "div[aria-controls$='QueuesCard']", AI = false)
	public WebElement tabQueues;

	@IFindBy(how = How.CSS, using = "div[aria-controls$='RegionsCard']", AI = false)
	public WebElement tabRegion;

	@IFindBy(how = How.CSS, using = "div[id^='OrganizationDetail'][id$='GlobalContactNameInputSet-Name_Input']", AI = false)
	public WebElement lblOrganizationDetail;

	@IFindBy(how = How.CSS, using = "div[id$='PrimaryContactLabel_Input']", AI = false)
	public WebElement lblPrimaryContact;

	@IFindBy(how = How.XPATH, using = "//div[text()='Address']", AI = false)
	public WebElement lblAddress;

	@IFindBy(how = How.CSS, using = "div[id*='GroupDetailInputSet']", AI = false)
	public WebElement lblGroup;

	@IFindBy(how = How.XPATH, using = "//div[text()='Assignment Rules']", AI = false)
	public WebElement lblAssignmentRules;

	@IFindBy(how = How.CSS, using = "td[id$='UserHeader_Cell']", AI = false)
	public WebElement lblUserHeader;

	@IFindBy(how = How.CSS, using = "div[id$='CodeHeader_inner']", AI = false)
	public WebElement lblCodeHeader;

	@IFindBy(how = How.CSS, using = "div[id$='DescHeader_inner']", AI = false)
	public WebElement lblDescHeader;

	@IFindBy(how = How.CSS, using = "div[id$='StatusHeader_inner']", AI = false)
	public WebElement lblStatusHeader;

	@IFindBy(how = How.CSS, using = "div[id$='BranchHeader_inner']", AI = false)
	public WebElement lblBranchHeader;

	@IFindBy(how = How.CSS, using = "div[id$='PreferredUnderwriterHeader_inner']", AI = false)
	public WebElement lblPreferredUnderwriterHeader;

	@IFindBy(how = How.CSS, using = "div[id$='VisibleHeader_inner']", AI = false)
	public WebElement lblVisibleInSubHeader;

	@IFindBy(how = How.CSS, using = "div[id$='ZonesHeader_inner']", AI = false)
	public WebElement lblAreaCovered;

	@IFindBy(how = How.CSS, using = "select[name$='zoneType']", AI = false)
	public WebElement drpZoneType;

	@IFindBy(how = How.CSS, using = "input[name$='RegionSearchDV-Name']", AI = false)
	public WebElement txtRegionName;

	@IFindBy(how = How.XPATH, using = "//table[contains(@class,'gw-table')]//tbody", AI = false)
	public WebElement regionsTable;

	@IFindBy(how = How.CSS, using = "div[class$='empty-info-cell']", AI = false)
	public WebElement msgNodata;

	@IFindBy(how = How.CSS, using = "div[id$='UserCardTab']", AI = false)
	public WebElement tabUsers;

	@IFindBy(how = How.CSS, using = "select[name$='Country']", AI = false)
	public WebElement drpCountry;

	@IFindBy(how = How.CSS, using = "div[id$='AddRegionButton']", AI = false)
	public WebElement btnAddRegion;

	@IFindBy(how = How.CSS, using = "select[name$='state']", AI = false)
	public WebElement drpNewRegionState;

	@IFindBy(how = How.XPATH, using = "//select[contains(@id,'ZoneInput_select-left')]//option[1]", AI = false)
	public WebElement txtAreaCoveredLeft;

	@IFindBy(how = How.CSS, using = "div[id$='ZoneInput_add']", AI = false)
	public WebElement btnForwardArrow;

	@IFindBy(how = How.CSS, using = "input[name$='LocalizedFields-0-0-column']", AI = false)
	public WebElement txtEdgePolicyholderEnglish;

	@IFindBy(how = How.CSS, using = "input[name$='LocalizedFields-2-0-column']", AI = false)
	public WebElement txtEdgeEnglish;

	@IFindBy(how = How.CSS, using = "div[id$='ExportButton']", AI = false)
	public WebElement btnExport;

	@IFindBy(how = How.XPATH, using = "div[id$='DownloadButton']", AI = false)
	public WebElement btnDownload;

	@IFindBy(how = How.CSS, using = "div[id$='VersionRateBookButton']", AI = false)
	public WebElement btnCreateNewEdition;

	@IFindBy(how = How.CSS, using = "div[id$='RateBookDV-5']", AI = false)
	public WebElement lblPolicyCriteria;

	@IFindBy(how = How.CSS, using = "div[id$='LocalizedValuesLV']", AI = false)
	public WebElement lblLocalization;

	@IFindBy(how = How.CSS, using = "div[aria-controls$='IncludedRateTablesCard']", AI = false)
	public WebElement tabIncludedRateTables;

	@IFindBy(how = How.CSS, using = "div[aria-controls$='IncludedRateRoutines']", AI = false)
	public WebElement tabIncludedRateRoutines;

	@IFindBy(how = How.CSS, using = "div[id$='Remove']", AI = false)
	public WebElement btnRemove;

	@IFindBy(how = How.CSS, using = "div[id$='BasicsTab']", AI = false)
	public WebElement tabBasics;

	@IFindBy(how = How.CSS, using = "div[id$='AddParameter']", AI = false)
	public WebElement lnkAddParameter;

	@IFindBy(how = How.XPATH, using = "//div[text()='Exact Match']", AI = false)
	public WebElement lnkExactMatch;

	@IFindBy(how = How.CSS, using = "input[name$='ParameterCV-Name']", AI = false)
	public WebElement txtCode;

	@IFindBy(how = How.CSS, using = "input[name$='DisplayText']", AI = false)
	public WebElement txtLabel;

	@IFindBy(how = How.CSS, using = "select[name$='DataType']", AI = false)
	public WebElement drpDataType;

	@IFindBy(how = How.CSS, using = "input[name$='SortOrder']", AI = false)
	public WebElement txtPriority;

	@IFindBy(how = How.CSS, using = "select[name$='DisplayType']", AI = false)
	public WebElement drpDisplayType;

	@IFindBy(how = How.CSS, using = "select[name$='PhysicalColumn']", AI = false)
	public WebElement drpPhysicalColumn;

	@IFindBy(how = How.CSS, using = "input[name$='Code']", AI = false)
	public WebElement txtActPatternCode;

	@IFindBy(how = How.CSS, using = "input[name$='ActivityPatternDetailDV-Subject']", AI = false)
	public WebElement txtActPatternSubject;

	@IFindBy(how = How.CSS, using = "select[name$='PatternLevel']", AI = false)
	public WebElement drpPatternLevel;

	@IFindBy(how = How.CSS, using = "select[name$='ActivityClass']", AI = false)
	public WebElement drpActivityClass;

	@IFindBy(how = How.CSS, using = "div[id$='TabBar-AdminTab-Admin_BusinessSettings-BusinessSettings_BizRules']", AI = false)
	public WebElement btnBusinessRules;

	@IFindBy(how = How.CSS, using = "div[id$='BizRules_UWRules']", AI = false)
	public WebElement btnUnderwritingRule;

	@IFindBy(how = How.CSS, using = "div[id$='RuleExecutionInfoHeader']", AI = false)
	public WebElement lblRunStatusHeader;

	@IFindBy(how = How.CSS, using = "div[id$='StatusHeader']", AI = false)
	public WebElement lblRuleStatusHeader;

	@IFindBy(how = How.CSS, using = "div[id$='VersionHeader']", AI = false)
	public WebElement lblVersionHeader;

	@IFindBy(how = How.CSS, using = "div[id$='RuleValidationInfoHeader']", AI = false)
	public WebElement lblStateHeader;

	@IFindBy(how = How.CSS, using = "div[id$='PolicyTransactionsHeader']", AI = false)
	public WebElement lblPolicyTransactionsHeader;

	@IFindBy(how = How.CSS, using = "div[id$='PolicyLineHeader']", AI = false)
	public WebElement lblPolicyLineHeader;

	@IFindBy(how = How.CSS, using = "div[id$='JurisdictionsHeader']", AI = false)
	public WebElement lblJurisdictionsHeader;

	@IFindBy(how = How.CSS, using = "div[id$='CheckingSetHeader']", AI = false)
	public WebElement lblCheckingSetHeader;

	@IFindBy(how = How.CSS, using = "div[id$='BlockingPointHeader']", AI = false)
	public WebElement lblBlockingPointHeader;

	@IFindBy(how = How.CSS, using = "div[id$='Name_Input']", AI = false)
	public WebElement lblRuleName;

	@IFindBy(how = How.CSS, using = "div[id$='Code_Input']", AI = false)
	public WebElement lblRuleCode;

	@IFindBy(how = How.CSS, using = "div[id$='TriggeringPointKey_Input']", AI = false)
	public WebElement lblRuleCheckingSet;

	@IFindBy(how = How.CSS, using = "div[id$='BlockingPoint_Input']", AI = false)
	public WebElement lblRuleBlockingPoint;

	@IFindBy(how = How.CSS, using = "div[id$='DefaultDurationType_Input']", AI = false)
	public WebElement lblRuleDefaultDurationType;

	@IFindBy(how = How.CSS, using = "div[id$='Value_Input']", AI = false)
	public WebElement lblRuleEnabled;

	@IFindBy(how = How.CSS, using = "div[id$='ApplicabilityCriteriaInputSet-InputWidget_Input']", AI = false)
	public WebElement lblRulePolicyLine;

	@IFindBy(how = How.CSS, using = "div[id*='Jurisdictions'][id$='AnyOrSelection_Input']", AI = false)
	public WebElement lblRuleJurisdictions;

	@IFindBy(how = How.CSS, using = "div[id*='PolicyTransactions'][id$='AnyOrSelection_Input']", AI = false)
	public WebElement lblRulePolicyTransactions;

	@IFindBy(how = How.CSS, using = "div[id$='RuleContext_title']", AI = false)
	public WebElement lblRuleContextTitle;

	@IFindBy(how = How.CSS, using = "div[id$='RuleVariableTitle']", AI = false)
	public WebElement lblRuleVariableTitle;

	@IFindBy(how = How.XPATH, using = "//div[text()='Underwriting Issue Details']", AI = false)
	public WebElement lblRuleUnderwritingIssueDetails ;

	@IFindBy(how = How.XPATH, using = "//div[text()='Condition']", AI = false)
	public WebElement lblRuleCondition;

	@IFindBy(how = How.CSS, using = "div[id*='UWIssueCommandDefinitionDV-ShortDesc']", AI = false)
	public WebElement lblRuleShortDescription;

	@IFindBy(how = How.CSS, using = "div[id*='UWIssueCommandDefinitionDV-LongDesc']", AI = false)
	public WebElement lblRuleLongDescription;

	@IFindBy(how = How.CSS, using = "div[id$='EnableDisableToggle']", AI = false)
	public WebElement btnDisable ;

	@IFindBy(how = How.CSS, using = "div[id$='PromoteToStaged']", AI = false)
	public WebElement btnPromoteToStaged;

	@IFindBy(how = How.CSS, using = "div[id$='HideValidation']", AI = false)
	public WebElement btnHideValidation;

	@IFindBy(how = How.CSS, using = "div[id$='ClearButton']", AI = false)
	public WebElement btnClear;

	@IFindBy(how = How.CSS, using = "select[name$='1-RoleName']", AI = false)
	public WebElement drpRoleNameRow2;

	@IFindBy(how = How.CSS, using = "div[id='TabBar-AdminTab-Admin_Monitoring-Monitoring_MessagingDestinationControlList']", AI = false)
	public WebElement btnMessageQueues;

	@IFindBy(how = How.CSS, using = "div[id$='DestinationNameHeader']", AI = false)
	public WebElement lblDestination;

	@IFindBy(how = How.CSS, using = "div[id$='DestinationIDHeader']", AI = false)
	public WebElement lblId;

	@IFindBy(how = How.CSS, using = "div[id$='StatusHeader']", AI = false)
	public WebElement lblMessageQueuesStatus;

	@IFindBy(how = How.CSS, using = "div[id$='ServerIdHeader']", AI = false)
	public WebElement lblServerId;

	@IFindBy(how = How.XPATH, using = "//div[text()='Email']", AI = false)
	public WebElement lnkEmail;

	@IFindBy(how = How.XPATH, using = "//div[text()='Total Statistics']", AI = false)
	public WebElement lblTotalStatistics;

	@IFindBy(how = How.XPATH, using = "//div[text()='Status']", AI = false)
	public WebElement lblEmailStatus;

	@IFindBy(how = How.CSS, using = "div[id$='Error_Input']", AI = false)
	public WebElement lblFailed;

	@IFindBy(how = How.CSS, using = "div[id$='Retry_Input']", AI = false)
	public WebElement lblRetryableError;

	@IFindBy(how = How.CSS, using = "div[id$='InFlight_Input']", AI = false)
	public WebElement lblInFlight;

	@IFindBy(how = How.CSS, using = "div[id$='Unsent_Input']", AI = false)
	public WebElement lblUnsent;

	@IFindBy(how = How.XPATH, using = "//div[text()='Batched']", AI = false)
	public WebElement lblBatched;

	@IFindBy(how = How.XPATH, using = "//div[text()='Awaiting Retry']", AI = false)
	public WebElement lblAwaitingRetry;

	@IFindBy(how = How.XPATH, using = "//div[text()='Detailed Statistics']", AI = false)
	public WebElement lblDetailedStatistics;

	@IFindBy(how = How.CSS, using = "select[name$='SOOMessageFilter']", AI = false)
	public WebElement drpDetailedStatistics;

	@IFindBy(how = How.CSS, using = "div[id$='SOONameHeader_inner']", AI = false)
	public WebElement lblAccount;

	@IFindBy(how = How.CSS, using = "div[id$='SendTimeHeader_inner']", AI = false)
	public WebElement lblSendTime;

	@IFindBy(how = How.CSS, using = "div[id$='-ErrorHeader_inner']", AI = false)
	public WebElement lblDetailedStatisticsFailed;

	@IFindBy(how = How.CSS, using = "div[id$='RetryableErrorHeader_inner']", AI = false)
	public WebElement lblDetailedStatisticsRetryableError;

	@IFindBy(how = How.CSS, using = "div[id$='InFlightHeader_inner']", AI = false)
	public WebElement lblDetailedStatisticsInFlight;

	@IFindBy(how = How.CSS, using = "div[id$='UnsentHeader_inner']", AI = false)
	public WebElement lblDetailedStatisticsUnsent;

	@IFindBy(how = How.CSS, using = "div[id$='RetryableErrorMessageHeader_inner']", AI = false)
	public WebElement lblErrorMessage;

	@IFindBy(how = How.CSS, using = "div[id$='MessageControlForDestinationList_UpLink']", AI = false)
	public WebElement btnUpToMessageQueues;

	@IFindBy(how = How.CSS, using = "div[id$='RestartMessagingEngineButton']", AI = false)
	public WebElement btnRestartMessagingEngine;

	@IFindBy(how = How.CSS, using = "div[id$='SuspendButton']", AI = false)
	public WebElement btnSuspend;

	@IFindBy(how = How.CSS, using = "div[id$='ResumeButton']", AI = false)
	public WebElement btnResume;

	@IFindBy(how = How.CSS, using = "div[id$='refresh']", AI = false)
	public WebElement btnRefresh;

	@IFindBy(how = How.CSS, using = "div[id='TabBar-AdminTab-Admin_Monitoring']", AI = false)
	public WebElement btnMonitoring;

	@IFindBy(how = How.XPATH, using = "//div[text()='Exports']//ancestor::div[contains(@id,'ExportsLV')]//descendant::td[contains(@id,'StartedByHeader')]", AI = false)
	public WebElement lblExportsStartedBy;

	@IFindBy(how = How.XPATH, using = "//div[text()='Exports']//ancestor::div[contains(@id,'ExportsLV')]//descendant::td[contains(@id,'CreatedHeader')]", AI = false)
	public WebElement lblExportsStartTime;

	@IFindBy(how = How.XPATH, using = "//div[text()='Exports']//ancestor::div[contains(@id,'ExportsLV')]//descendant::td[contains(@id,'RuleTypeHeader')]", AI = false)
	public WebElement lblExportsRuleType;

	@IFindBy(how = How.XPATH, using = "//div[text()='Exports']//ancestor::div[contains(@id,'ExportsLV')]//descendant::td[contains(@id,'RulesHeader')]", AI = false)
	public WebElement lblExportsRules;

	@IFindBy(how = How.XPATH, using = "//div[text()='Exports']//ancestor::div[contains(@id,'ExportsLV')]//descendant::td[contains(@id,'ProgressHeader')]", AI = false)
	public WebElement lblExportsProgress;

	@IFindBy(how = How.XPATH, using = "//div[text()='Exports']//ancestor::div[contains(@id,'ExportsLV')]//descendant::td[contains(@id,'StatusHeader')]", AI = false)
	public WebElement lblExportStatus;

	@IFindBy(how = How.CSS, using = "div[id='TabBar-AdminTab-Admin_BusinessSettings-BusinessSettings_BizRules-BizRules_PCBizRulesExportImportStatus']", AI = false)
	public WebElement lnkImportExportStatus;

	@IFindBy(how = How.CSS, using = "select[name$='ProcessUsageFilter']", AI = false)
	public WebElement drpProcessUsageFilter;

	@IFindBy(how = How.CSS, using = "div[id$='suspendScheduler']", AI = false)
	public WebElement btnSuspendScheduler;

	@IFindBy(how = How.XPATH, using = "//div[text()='Imports']//ancestor::div[contains(@id,'ImportsLV')]//descendant::td[contains(@id,'StartedByHeader')]", AI = false)
	public WebElement lblImportsStartedBy;

	@IFindBy(how = How.XPATH, using = "//div[text()='Imports']//ancestor::div[contains(@id,'ImportsLV')]//descendant::td[contains(@id,'CreatedHeader')]", AI = false)
	public WebElement lblImportsStartTime;

	@IFindBy(how = How.XPATH, using = "//div[text()='Imports']//ancestor::div[contains(@id,'ImportsLV')]//descendant::td[contains(@id,'RuleTypeHeader')]", AI = false)
	public WebElement lblImportsRuleType;

	@IFindBy(how = How.XPATH, using = "//div[text()='Imports']//ancestor::div[contains(@id,'ImportsLV')]//descendant::td[contains(@id,'SourceNameHeader')]", AI = false)
	public WebElement lblImportsSourceName;

	@IFindBy(how = How.XPATH, using = "//div[text()='Imports']//ancestor::div[contains(@id,'ImportsLV')]//descendant::td[contains(@id,'ProgressHeader')]", AI = false)
	public WebElement lblImportsProgress;

	@IFindBy(how = How.XPATH, using = "//div[text()='Imports']//ancestor::div[contains(@id,'ImportsLV')]//descendant::td[contains(@id,'StatusHeader')]", AI = false)
	public WebElement lblImportStatus;

	@IFindBy(how = How.CSS, using = "div[id$='RuleExportImportStatusScreen-Import']", AI = false)
	public WebElement btnImportFromFile;

	@IFindBy(how = How.CSS, using = "div[id$='browseButton']", AI = false)
	public WebElement btnBrowse;

	@IFindBy(how = How.XPATH, using = "//div[text()='Completed']", AI = false)
	public WebElement lblCompleted;

	@IFindBy(how = How.XPATH, using = "//div[text()='100%']", AI = false)
	public WebElement lbl100Percent;

	@IFindBy(how = How.CSS, using = "div[id$='ImportDetails']", AI = false)
	public WebElement btnReview;

	@IFindBy(how = How.ID, using = "RuleImportDetailsPopup-ttlBar", AI = false)
	public WebElement ttlReviewImport;

	@IFindBy(how = How.CSS, using = "div[id$='SourceName']", AI = false)
	public WebElement lblFileName;

	@IFindBy(how = How.CSS, using = "div[id$='NewCountHeader']", AI = false)
	public WebElement lblNewRule;

	@IFindBy(how = How.CSS, using = "div[id$='NoConflictCountHeader']", AI = false)
	public WebElement lblNewVersion;

	@IFindBy(how = How.CSS, using = "div[id$='DeployedCountHeader']", AI = false)
	public WebElement lblRuleDeployment;

	@IFindBy(how = How.XPATH, using = "//div[text()='Versions Conflict']", AI = false)
	public WebElement lblVersionsConflict;

	@IFindBy(how = How.CSS, using = "div[id$='ImportedHeader']", AI = false)
	public WebElement lblImported;

	@IFindBy(how = How.CSS, using = "div[id$='DiscardedHeader']", AI = false)
	public WebElement lblDiscard;

	@IFindBy(how = How.CSS, using = "div[id$='EditedHeader']", AI = false)
	public WebElement lblAppliedEdited;

	@IFindBy(how = How.CSS, using = "div[id$='NoActionHeader']", AI = false)
	public WebElement lblSkipped;

	@IFindBy(how = How.CSS, using = "div[id$='RuleValidationInfoHeader']", AI = false)
	public WebElement lblState;

	@IFindBy(how = How.CSS, using = "div[id$='ExistingVersionHeader']", AI = false)
	public WebElement lblExistingVersion;

	@IFindBy(how = How.CSS, using = "div[id$='ImportingVersionHeader']", AI = false)
	public WebElement lblImportingvVersion;

	@IFindBy(how = How.CSS, using = "div[id$='ImportButton']", AI = false)
	public WebElement btnImport;

	@IFindBy(how = How.CSS, using = "div[id$='RuleExportImportStatusScreen-ttlBar']", AI = false)
	public WebElement ttlImportExportStatus;

	@IFindBy(how = How.ID, using = "ActivityPatterns-ActivityPatternsScreen-ttlBar", AI = false)
	public WebElement ttlActivityPatterns;

	@IFindBy(how = How.CSS, using = "div[id$='next']", AI = false)
	public WebElement btnNext;

	@IFindBy(how = How.CSS, using = "div[id$='last']", AI = false)
	public WebElement btnLast;

	@IFindBy(how = How.CSS, using = "div[id$='prev']", AI = false)
	public WebElement btnPrevious;

	@IFindBy(how = How.XPATH, using = "//div[text()='Issue a policy']", AI = false)
	public WebElement lnkIssuePolicy;

	@IFindBy(how = How.CSS, using = "div[id$='BranchButton']", AI = false)
	public WebElement btnCreateJurisdic;

	@IFindBy(how = How.CSS, using = "div[id$='CopyButton']", AI = false)
	public WebElement btnCopy;

	@IFindBy(how = How.CSS, using = "div[id$='Delete']", AI = false)
	public WebElement btnDeletePolicy;

	@IFindBy(how = How.CSS, using = "div[id$='Priority']", AI = false)
	public WebElement lblPriority;

	@IFindBy(how = How.CSS, using = "div[id$='Description']", AI = false)
	public WebElement lblDescriptionPolicy;

	@IFindBy(how = How.CSS, using = "div[id$='EscalationDays']", AI = false)
	public WebElement lblEscalationDays;

	@IFindBy(how = How.CSS, using = "div[id$='TargetDays']", AI = false)
	public WebElement lblTargetDays;

	@IFindBy(how = How.CSS, using = "td[id$='LanguageHeading_Cell']", AI = false)
	public WebElement lblLanguage;

	@IFindBy(how = How.XPATH, using = "//div[text()='Subject']//ancestor::div[contains(@id,'FieldHeading')]", AI = false)
	public WebElement lblSubject;

	@IFindBy(how = How.CSS, using = "div[id$='ActivityPatternDetailDV-Subject']", AI = false)
	public WebElement lblSubjectPolicy;

	@IFindBy(how = How.XPATH, using = "//div[text()='Short Subject']//ancestor::div[contains(@id,'FieldHeading')]", AI = false)
	public WebElement lblShortSubject;

	@IFindBy(how = How.XPATH, using = "//div[text()='Description']//ancestor::div[contains(@id,'FieldHeading')]", AI = false)
	public WebElement lblDescriptionIssuePolicy;

	@IFindBy(how = How.ID, using = "ActivityPatternDetail-ActivityPatternDetailScreen-ttlBar", AI = false)
	public WebElement ttlIssuePolicy;

	@IFindBy(how = How.CSS, using = "div[id='ServerTools-MenuLinks-ServerTools_WorkQueueInfo']", AI = false)
	public WebElement tabWorkQueueInfo;

	@IFindBy(how = How.CSS, using = "div[id$='WorkQueueInfo-WorkQueueInfoScreen-maximumPoolSize']", AI = false)
	public WebElement lblMaximumPoolSize;

	@IFindBy(how = How.CSS, using = "div[id='WorkQueueInfo-WorkQueueInfoScreen-poolSize']", AI = false)
	public WebElement lblPoolSize;

	@IFindBy(how = How.CSS, using = "div[id='WorkQueueInfo-WorkQueueInfoScreen-activeThreads']", AI = false)
	public WebElement lblActiveThreadsCount;

	@IFindBy(how = How.CSS, using = "div[id$='downloadRawData']", AI = false)
	public WebElement btnDownloadRawData;

	@IFindBy(how = How.CSS, using = "div[id$='RunWriter']", AI = false)
	public WebElement btnRunWriter;

	@IFindBy(how = How.CSS, using = "div[id$='Notify']", AI = false)
	public WebElement btnNotify;

	@IFindBy(how = How.CSS, using = "div[id$='StopWorkers']", AI = false)
	public WebElement btnStop;

	@IFindBy(how = How.CSS, using = "div[id$='RestartWorkers']", AI = false)
	public WebElement btnRestart;

	@IFindBy(how = How.CSS, using = "div[id$='PrintHistory']", AI = false)
	public WebElement btnDownloadHistory;

	@IFindBy(how = How.XPATH, using = "//div[text()='Claim total incurred']", AI = false)
	public WebElement txtClaimTotal;

	@IFindBy(how = How.CSS, using = "div[id$='UWAuthorityProfileDetailScreen-ttlBar']", AI = false)
	public WebElement ttlNewAuthorityProfile;

	@IFindBy(how = How.CSS, using = "div[id$='SearchAffinityGroup']", AI = false)
	public WebElement lnkAffinityGroup;

	@IFindBy(how = How.CSS, using = "div[id='SearchAffinityGroup-AffinityGroupSearchScreen-ttlBar']", AI = false)
	public WebElement ttlAffinityGroups;

	@IFindBy(how = How.CSS, using = "div[id$='SelectOrganization']", AI = false)
	public WebElement icnOrganization;

	@IFindBy(how = How.CSS, using = "div[id='OrganizationSearchPopup-OrganizationSearchPopupScreen-ttlBar']", AI = false)
	public WebElement ttlOrganization;

	@IFindBy(how = How.CSS, using = "input[name$='Name']", AI = false)
	public WebElement txtOrganizationsName;

	@IFindBy(how = How.CSS, using = "div[id$='Select']", AI = false)
	public WebElement btnSelect;

	@IFindBy(how = How.XPATH, using = "//div[text()='No data to display']", AI = false)
	public WebElement lblNoDataDisplay;

	@IFindBy(how = How.XPATH, using = "//div[text()='AccountHolderCount']//ancestor::td//following-sibling::td[contains(@id,'RunBatchWithoutNotifyContent')]//descendant::div[contains(@id,'DownloadHistory')]", AI = false)
	public WebElement btnDownloadHistoryAccountHolder;

	@IFindBy(how = How.CSS, using = "div[id$='BatchProcessDownloadConfigureScreen-ttlBar']", AI = false)
	public WebElement ttlRangeforRecord;

	@IFindBy(how = How.CSS, using = "input[name$='StartDate']", AI = false)
	public WebElement txtStartDate;

	@IFindBy(how = How.CSS, using = "input[name$='StopDate']", AI = false)
	public WebElement txtEndDate;

	@IFindBy(how = How.CSS, using = "div[id$='download']", AI = false)
	public WebElement btnCompleteDownload;

	@IFindBy(how = How.CSS, using = "div[id$='BackButton']", AI = false)
	public WebElement btnReturnToBatchProcessInfo;

	@IFindBy(how = How.CSS, using = "div[id='BatchProcessInfo-BatchProcessScreen-ttlBar']", AI = false)
	public WebElement ttlBatchProcessInfo;

	@IFindBy(how = How.XPATH, using = "//div[text()='Code']/parent::div//descendant::div[contains(@id,'Code')]", AI = false)
	public WebElement lblCodePolicy;

	@IFindBy(how = How.XPATH, using = "//div[text()='Policy Line']/parent::div//descendant::div[contains(@id,'Policy')]", AI = false)
	public WebElement lblPolicyLineHomeownersLine;

	@IFindBy(how = How.XPATH, using = "//div[text()='Localization']/parent::div//descendant::div[contains(@id,'LocalizedValuesLV')]", AI = false)
	public WebElement lblLocalizationeHomeownersLine;

	@IFindBy(how = How.CSS, using = "div[id$='Admin-MenuLinks-Admin_BusinessSettings-BusinessSettings_BizRules'] [data-gw-click='toggleSubMenu']", AI = false)
	public WebElement tabBusinessRules;

	@IFindBy(how = How.CSS, using = "div[id$='Links-Admin_BusinessSettings-BusinessSettings_BizRules-BizRules_UWRules'] ", AI = false)
	public WebElement lnkUnderWritingRules;

	@IFindBy(how = How.CSS, using = "div[id='CreateUWRule-UWRulePanelSet-AdvancedInfoTab']", AI = false)
	public WebElement tabAdvanceUWRule;

	@IFindBy(how = How.CSS, using = "div[id='CreateUWRule-Update']", AI = false)
	public WebElement btnSaveUWRule;

	@IFindBy(how = How.CSS, using = "select[name='CreateUWRule-UWRulePanelSet-Comparator']", AI = false)
	public WebElement btnValueComparator;

	@IFindBy(how = How.CSS, using = "select[name='CreateUWRule-UWRulePanelSet-DefaultValueAssignmentType']", AI = false)
	public WebElement drpDefaultValueAssignmentType;

	@IFindBy(how = How.CSS, using = "div[id='UWRuleDetail-UWRuleDetail_UpLink']", AI = false)
	public WebElement lnkUptoUnderWritingRules;

	@IFindBy(how = How.CSS, using = "input[name='UWRules-RulesLV-0-_Checkbox']", AI = false)
	public WebElement chkUnderWritingRules;

	@IFindBy(how = How.CSS, using = "div[id$='RateTableDefinitions']", AI = false)
	public WebElement lnkRateTableDefinition;

	@IFindBy(how = How.CSS, using = "div[id$='AdminGroupSearchPage']", AI = false)
	public WebElement lnkgroups;

	@IFindBy(how = How.XPATH, using = "//div[text()='Users']", AI = false)
	public WebElement lnkUsers;

	@IFindBy(how = How.CSS, using = "div[id='TabBar-AdminTab-Admin_UsersAndSecurity-UsersAndSecurity_AdminGroupSearchPage']", AI = false)
	public WebElement btnGroup;

	@IFindBy(how = How.CSS, using = "div[id$='UsersAndSecurity_Roles']", AI = false)
	public WebElement btnRoles;

	@IFindBy(how = How.CSS, using = "div[id$='UsersAndSecurity_AdminUserSearchPage']", AI = false)
	public WebElement btnUsers;


	String select="//div[text()='Select']";
	String rolesFiltersOptions="//select[contains(@name,'Filters')]/option";
	String roleNameCell="(//select[contains(@name,'RoleName')])";
	String roleDescription="(//td[contains(@id,'RoleDescription_Cell')])";

	public AdministrationPage() {}

	public AdministrationPage(WebDriver driver){
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

		if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, ttlUsers))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}
		elementLayer = new ElementLayer(driver);
	}// isLoaded


	public AdministrationPage clickAuthorityProfile(WebDriver driver) {
		BrowserActions.click(driver,lnkAuthorityProfile, "Authority Profile");
		return this;
	}

	public void  verifyNameIsDisplayed(WebDriver driver) {
		for (int i = 0; i <= lblName.size()-1; i++) {
			lblName.get(i).isDisplayed();
		}
		Log.message("All the Aurthority Profile Name is displayed");
	}
	public AdministrationPage clickToggleAdministrationSubMenu(WebDriver driver){
		BrowserActions.click(driver, toggleAdministrationSubMenu,"Toggle Administration SubMenu");
		return this;
	}
	public AdministrationPage clickRatingtab(WebDriver driver) throws Exception {
		BrowserActions.moveToElement(driver,lnkRating, "Rating");
		return this;
	}
	public RateTableDefinitionsPage clickRateTableDefinition(WebDriver driver) {
		BrowserActions.click(driver,btnRateTableDefinition, "Rate Table Definition");
		return new RateTableDefinitionsPage(driver).get();
	}
	public void clickRateBook(WebDriver driver) {
		BrowserActions.click(driver,lnkRateBooks, "Rate book");
	}
	public RateRountinesPage clickRateRoutine(WebDriver driver) {
		BrowserActions.click(driver,btnRateRoutine, "Rate Routine");
		return new RateRountinesPage(driver).get();
	}
	public AdministrationPage clickBusinessSetting(WebDriver driver) {
		BrowserActions.moveToElement(driver,btnBusinessSetting, "Business Setting");
		return this;
	}
	public UnderwritingRulesPage clickUnderwritingRule(WebDriver driver) {
		BrowserActions.click(driver, btnUnderwritingRule,"Under writing Rule");
		return new UnderwritingRulesPage(driver).get();
	}
	public ActivityPatternsPage clickActivityPatterns(WebDriver driver) throws InterruptedException {
		BrowserActions.click(driver,btnActivityPatterns, "Activity Patterns");
		return new ActivityPatternsPage(driver).get();
	}
	public AdministrationPage clickBusinessRules(WebDriver driver) {
		BrowserActions.moveToElement(driver, btnBusinessRules,"Business Rules");
		return this;
	}
	public AdministrationPage clickMonitoring(WebDriver driver) {
		BrowserActions.moveToElement(driver,btnMonitoring, "Monitoring");
		return this;
	}

	public MessageQueuesPage clickMessageQueues(WebDriver driver) {
		BrowserActions.click(driver,btnMessageQueues, "Message Queues");
		return new MessageQueuesPage(driver);
	}
	public AdministrationPage clickUsersAndSecurity(WebDriver driver) throws Exception {
		BrowserActions.moveToElement(driver, lnkUsersAndSecurity, "users and Authority");
		return this;
	}
	public RegionsPage clickRegions(WebDriver driver) {
		BrowserActions.click(driver,btnRegions, "Regions");
		return new RegionsPage(driver).get();
	}
	public OrganizationsPage clickOrganizations(WebDriver driver) {
		BrowserActions.click(driver,btnOrganization, "Organization");
		return new OrganizationsPage(driver).get();
	}
	public GroupsPage clickGroups(WebDriver driver) {
		BrowserActions.click(driver, lnkgroups, "Groups");
		return new GroupsPage(driver).get();
	}
	public AffinityGroupsPage clickAffinityGroup(WebDriver driver) {
		BrowserActions.click(driver,lnkAffinityGroup, "Affinity Group");
		return new AffinityGroupsPage(driver).get();
	}
	public AttributesPage clickAttribute(WebDriver driver) {
		BrowserActions.click(driver,lnkAttributes, "Attribute Tab");
		return new AttributesPage(driver).get();
	}

	public ProducerCodesPage clickProducerCode(WebDriver driver){
		BrowserActions.click(driver,lnkProducerCode, "ProducerCode");
		return new ProducerCodesPage(driver).get();
	}

	public UsersPage clickUsers(WebDriver driver) {
		BrowserActions.click(driver, lnkUsers,"users button");
		return new UsersPage(driver).get();
	}
	
	public GroupsPage clickGroup(WebDriver driver) {
		BrowserActions.click(driver,btnGroup, "Group");
		return new GroupsPage(driver).get();
	}
	
	public RolesPage clickRoles(WebDriver driver) {
		BrowserActions.click(driver,btnRoles, "Roles");
		return new RolesPage(driver).get();
	}
	  public ImportExportStatusPage clickImportExportStatus(WebDriver driver) {
	        BrowserActions.click(driver,lnkImportExportStatus, "Import Export Status");
			return new ImportExportStatusPage(driver).get();
	    }

}