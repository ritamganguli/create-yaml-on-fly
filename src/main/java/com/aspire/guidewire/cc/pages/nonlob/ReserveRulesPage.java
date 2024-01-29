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

public class ReserveRulesPage extends LoadableComponent<ReserveRulesPage> {

	WebDriver driver;
	private boolean isPageLoaded;
	public ElementLayer elementLayer;
	String elementObject;
	HashMap<String, String> getPageObjects;
	public static List<Object> pageFactoryKey = new ArrayList<Object>();
	public static List<String> pageFactoryValue = new ArrayList<String>();

	@IFindBy(how = How.CSS, using = "input[name='ReserveRules-CCRulesListScreen-RulesLV-0-Status']", AI = false)
	public WebElement inpStatus;

	@IFindBy(how = How.CSS, using = "input[name='ReserveRules-CCRulesListScreen-RulesLV-1-Name']", AI = false)
	public WebElement inpName_10;

	@IFindBy(how = How.CSS, using = "input[name='ReserveRules-CCRulesListScreen-RulesLV-3-Status']", AI = false)
	public WebElement inpStatus_51;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-RulesLV-0-RuleValidationInfo-RuleValidationInfoCell-Invalid", AI = false)
	public WebElement btnInvalid;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-RulesLV-0-RuleExecutionInfo-RuleExecutionInfoCell-NotExecuting", AI = false)
	public WebElement btnNotExecuting;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-RulesLV-0-RuleExecutionInfo-RuleExecutionInfoCell-PrevExecuting", AI = false)
	public WebElement btnPrevExecuting;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-RulesLV-1-ClaimSegments textarea", AI = false)
	public WebElement inpExposureSegment_25;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-RulesLV-2-PolicyTypes textarea", AI = false)
	public WebElement inpPolicyType_40;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-RulesLV-2-ClaimSegments textarea", AI = false)
	public WebElement inpExposureSegment_45;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-RulesLV-0-RuleValidationInfo-RuleValidationInfoCell-Valid", AI = false)
	public WebElement btnValid;

	@IFindBy(how = How.CSS, using = "select[name='ReserveRules-CCRulesListScreen-RulesLV-1-Context']", AI = false)
	public WebElement drpTriggerEntity_16;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-RulesLV-2-ExposureTypes textarea", AI = false)
	public WebElement inpExposureType_44;

	@IFindBy(how = How.CSS, using = "select[name='ReserveRules-CCRulesListScreen-RulesLV-0-Trigger']", AI = false)
	public WebElement drpTriggerAction;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-RulesLV-2-LossPartyType textarea", AI = false)
	public WebElement inpLossPartyType_42;

	@IFindBy(how = How.CSS, using = "select[name='ReserveRules-CCRulesListScreen-RulesLV-0-Context']", AI = false)
	public WebElement drpTriggerEntity;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-RulesLV-0-PolicyTypes textarea", AI = false)
	public WebElement inpPolicyType;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-RulesLV-0-Jurisdictions textarea", AI = false)
	public WebElement inpJurisdiction;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-RulesLV-1-RuleExecutionInfo-RuleExecutionInfoCell-NotExecuting", AI = false)
	public WebElement btnNotExecuting_7;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-RulesLV-0-RuleExecutionInfo-RuleExecutionInfoCell-Unknown", AI = false)
	public WebElement btnUnknown;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-RulesLV-1-Jurisdictions textarea", AI = false)
	public WebElement inpJurisdiction_23;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-RulesLV-4-RuleExecutionInfo-RuleExecutionInfoCell-Executing", AI = false)
	public WebElement btnExecuting_66;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-RollingUpgradeAlert .gw-AlertBar--label", AI = false)
	public WebElement lblRollingUpgradeAlert;

	@IFindBy(how = How.CSS, using = "input[name='ReserveRules-CCRulesListScreen-RulesLV-0-Version']", AI = false)
	public WebElement inpVersion;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-RulesLV-1-PolicyTypes textarea", AI = false)
	public WebElement inpPolicyType_20;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-RulesLV_tb-Filter>div[role='button']", AI = false)
	public WebElement btnFilter;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-RulesLV-3-ClaimSegments textarea", AI = false)
	public WebElement inpExposureSegment_65;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-RulesLV-3-ExposureTypes textarea", AI = false)
	public WebElement inpExposureType_64;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-RulesLV-1-RuleExecutionInfo-RuleExecutionInfoCell-Unknown", AI = false)
	public WebElement btnUnknown_9;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-RulesLV-1-RuleValidationInfo-RuleValidationInfoCell-Invalid", AI = false)
	public WebElement btnInvalid_13;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-RulesLV-3-LossPartyType textarea", AI = false)
	public WebElement inpLossPartyType_62;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-RulesLV-0-RuleExecutionInfo-RuleExecutionInfoCell-Executing", AI = false)
	public WebElement btnExecuting;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-RulesLV-0-RuleValidationInfo-RuleValidationInfoCell-Unknown", AI = false)
	public WebElement btnUnknown_5;

	@IFindBy(how = How.CSS, using = "input[name='ReserveRules-CCRulesListScreen-RulesLV-2-Status']", AI = false)
	public WebElement inpStatus_31;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-CCSelectedRulesAlertBar .gw-AlertBar--label", AI = false)
	public WebElement lblCCSelectedRulesAlertBar;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-ShowHideFilter>div[role='button']", AI = false)
	public WebElement btnShowFilters;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-CreateRuleToolbarButtonSet-Clone>div[role='button']", AI = false)
	public WebElement btnClone;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-RulesLV-4-RuleValidationInfo-RuleValidationInfoCell-Unknown", AI = false)
	public WebElement btnUnknown_75;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-RulesLV-4-LossTypes textarea", AI = false)
	public WebElement inpLossType_79;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-BulkEdit-ExportToCsv>div[role='menuitem']", AI = false)
	public WebElement btnEditAllinSpreadsheet;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-RulesLV-3-RuleExecutionInfo-RuleExecutionInfoCell-Executing", AI = false)
	public WebElement btnExecuting_46;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-DeployRulesToolbarButtonSet-DeployButton>div[role='button']", AI = false)
	public WebElement btnDeploy;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-RulesLV-2-Jurisdictions textarea", AI = false)
	public WebElement inpJurisdiction_43;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-RulesLV-1-RuleValidationInfo-RuleValidationInfoCell-Valid", AI = false)
	public WebElement btnValid_14;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-RulesLV-2-RuleExecutionInfo-RuleExecutionInfoCell-PrevExecuting", AI = false)
	public WebElement btnPrevExecuting_28;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-DeployRulesToolbarButtonSet-DeployButton-DeployAll>div[role='menuitem']", AI = false)
	public WebElement btnDeployAll;

	@IFindBy(how = How.CSS, using = "select[name='ReserveRules-CCRulesListScreen-RulesLV-4-Trigger']", AI = false)
	public WebElement drpTriggerAction_77;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-ExportSelectedToCsv>div[role='button']", AI = false)
	public WebElement btnBulkEditSelected;

	@IFindBy(how = How.CSS, using = "input[name='ReserveRules-CCRulesListScreen-ValidationStatusToolbarInput']", AI = false)
	public WebElement inpValidationStatusToolbarInput;

	@IFindBy(how = How.CSS, using = "select[name='ReserveRules-CCRulesListScreen-SearchCriteriaPanelRef-RuleFilterCriteriaDV-Availability']", AI = false)
	public WebElement drpAvailability;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-RulesLV-0-LossTypes textarea", AI = false)
	public WebElement inpLossType;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-RulesLV-4-ExposureTypes textarea", AI = false)
	public WebElement inpExposureType_84;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-RulesLV-4-RuleExecutionInfo-RuleExecutionInfoCell-Unknown", AI = false)
	public WebElement btnUnknown_69;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-RulesLV-3-LossTypes textarea", AI = false)
	public WebElement inpLossType_59;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-RulesLV-1-RuleExecutionInfo-RuleExecutionInfoCell-Executing", AI = false)
	public WebElement btnExecuting_6;

	@IFindBy(how = How.CSS, using = "input[name='ReserveRules-CCRulesListScreen-RulesLV-4-Status']", AI = false)
	public WebElement inpStatus_71;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-RulesLV-4-RuleExecutionInfo-RuleExecutionInfoCell-PrevExecuting", AI = false)
	public WebElement btnPrevExecuting_68;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-RulesLV-2-RuleExecutionInfo-RuleExecutionInfoCell-Executing", AI = false)
	public WebElement btnExecuting_26;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-RulesLV-3-Jurisdictions textarea", AI = false)
	public WebElement inpJurisdiction_63;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-RulesLV-3-RuleValidationInfo-RuleValidationInfoCell-Unknown", AI = false)
	public WebElement btnUnknown_55;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-RollingUpgradeAlert-CloseBtn", AI = false)
	public WebElement btnClose;

	@IFindBy(how = How.CSS, using = "select[name='ReserveRules-CCRulesListScreen-SearchCriteriaPanelRef-RuleFilterCriteriaDV-PolicyTypeFilter']", AI = false)
	public WebElement drpPolicyType;

	@IFindBy(how = How.CSS, using = "select[name='ReserveRules-CCRulesListScreen-SearchCriteriaPanelRef-RuleFilterCriteriaDV-ExposureTypeFilter']", AI = false)
	public WebElement drpExposureType;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-RulesLV-1-LossPartyType textarea", AI = false)
	public WebElement inpLossPartyType_22;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-RulesLV-1-IncidentType textarea", AI = false)
	public WebElement inpIncidentType_21;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-RulesLV-3-RuleExecutionInfo-RuleExecutionInfoCell-PrevExecuting", AI = false)
	public WebElement btnPrevExecuting_48;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-MoreButton-RuleListMoreButtonMenuItemSet-DisableSelectedRules>div[role='menuitem']", AI = false)
	public WebElement btnDisableSelected;

	@IFindBy(how = How.CSS, using = "select[name='ReserveRules-CCRulesListScreen-RulesLV-3-Trigger']", AI = false)
	public WebElement drpTriggerAction_57;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-MoreButton-RuleListMoreButtonMenuItemSet-ExportSelected>div[role='menuitem']", AI = false)
	public WebElement btnExportSelected;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-RulesLV-0-LossPartyType textarea", AI = false)
	public WebElement inpLossPartyType;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-RulesLV-3-RuleExecutionInfo-RuleExecutionInfoCell-Unknown", AI = false)
	public WebElement btnUnknown_49;

	@IFindBy(how = How.CSS, using = "input[name='ReserveRules-CCRulesListScreen-SearchCriteriaPanelRef-RuleFilterCriteriaDV-TextFilter']", AI = false)
	public WebElement inpNameDescription;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-RulesLV-2-LossTypes textarea", AI = false)
	public WebElement inpLossType_39;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-ValidationProgressAlert .gw-AlertBar--label", AI = false)
	public WebElement lblValidationProgressAlert;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-RulesLV-4-Jurisdictions textarea", AI = false)
	public WebElement inpJurisdiction_83;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-CCSelectedRulesAlertBar-CloseBtn", AI = false)
	public WebElement btnClose_4;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-ValidationProcessFailedAlert-CloseBtn", AI = false)
	public WebElement btnClose_3;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-ValidationProgressAlert-CloseBtn", AI = false)
	public WebElement btnClose_2;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-PendingImportAlert-CloseBtn", AI = false)
	public WebElement btnClose_1;

	@IFindBy(how = How.CSS, using = "input[name='ReserveRules-CCRulesListScreen-RulesLV-4-Version']", AI = false)
	public WebElement inpVersion_72;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-RulesLV-2-RuleValidationInfo-RuleValidationInfoCell-Unknown", AI = false)
	public WebElement btnUnknown_35;

	@IFindBy(how = How.CSS, using = "select[name='ReserveRules-CCRulesListScreen-SearchCriteriaPanelRef-RuleFilterCriteriaDV-JurisdictionFilter']", AI = false)
	public WebElement drpJurisdiction;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-RulesLV-4-RuleValidationInfo-RuleValidationInfoCell-Valid", AI = false)
	public WebElement btnValid_74;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-RulesLV-2-RuleExecutionInfo-RuleExecutionInfoCell-NotExecuting", AI = false)
	public WebElement btnNotExecuting_27;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-RulesLV-2-IncidentType textarea", AI = false)
	public WebElement inpIncidentType_41;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-RulesLV-4-RuleValidationInfo-RuleValidationInfoCell-Invalid", AI = false)
	public WebElement btnInvalid_73;

	@IFindBy(how = How.CSS, using = "input[name='ReserveRules-CCRulesListScreen-RulesLV-3-ActionType']", AI = false)
	public WebElement inpActionType_58;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-RulesLV-2-RuleExecutionInfo-RuleExecutionInfoCell-Unknown", AI = false)
	public WebElement btnUnknown_29;

	@IFindBy(how = How.CSS, using = "select[name='ReserveRules-CCRulesListScreen-RulesLV-2-Trigger']", AI = false)
	public WebElement drpTriggerAction_37;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-RulesLV-1-LossTypes textarea", AI = false)
	public WebElement inpLossType_19;

	@IFindBy(how = How.CSS, using = "input[name='ReserveRules-CCRulesListScreen-RulesLV-4-Name']", AI = false)
	public WebElement inpName_70;

	@IFindBy(how = How.CSS, using = "select[name='ReserveRules-CCRulesListScreen-SearchCriteriaPanelRef-RuleFilterCriteriaDV-ClaimSegmentFilter']", AI = false)
	public WebElement drpExposureSegment;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-RulesLV_tb-Clear>div[role='button']", AI = false)
	public WebElement btnClear;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-RulesLV-0-ExposureTypes textarea", AI = false)
	public WebElement inpExposureType;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-RulesLV-1-RuleExecutionInfo-RuleExecutionInfoCell-PrevExecuting", AI = false)
	public WebElement btnPrevExecuting_8;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-RulesLV-0-ClaimSegments textarea", AI = false)
	public WebElement inpExposureSegment;

	@IFindBy(how = How.CSS, using = "input[name='ReserveRules-CCRulesListScreen-RulesLV-3-Version']", AI = false)
	public WebElement inpVersion_52;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-DeployRulesToolbarButtonSet-DeployButton-DeploySelected>div[role='menuitem']", AI = false)
	public WebElement btnDeploySelected;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-RulesLV-1-RuleValidationInfo-RuleValidationInfoCell-Unknown", AI = false)
	public WebElement btnUnknown_15;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-RulesLV-2-RuleValidationInfo-RuleValidationInfoCell-Valid", AI = false)
	public WebElement btnValid_34;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-RulesLV-3-RuleValidationInfo-RuleValidationInfoCell-Valid", AI = false)
	public WebElement btnValid_54;

	@IFindBy(how = How.CSS, using = "input[name='ReserveRules-CCRulesListScreen-RulesLV-0-Name']", AI = false)
	public WebElement inpName;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-RulesLV-3-RuleExecutionInfo-RuleExecutionInfoCell-NotExecuting", AI = false)
	public WebElement btnNotExecuting_47;

	@IFindBy(how = How.CSS, using = "select[name='ReserveRules-CCRulesListScreen-RulesLV-4-Context']", AI = false)
	public WebElement drpTriggerEntity_76;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-BulkEdit>div[role='button']", AI = false)
	public WebElement btnBulkEdit;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-RulesLV-3-IncidentType textarea", AI = false)
	public WebElement inpIncidentType_61;

	@IFindBy(how = How.CSS, using = "input[name='ReserveRules-CCRulesListScreen-RulesLV-4-ActionType']", AI = false)
	public WebElement inpActionType_78;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-CreateRuleToolbarButtonSet-Add>div[role='button']", AI = false)
	public WebElement btnAdd;

	@IFindBy(how = How.CSS, using = "select[name='ReserveRules-CCRulesListScreen-RulesLV-1-Trigger']", AI = false)
	public WebElement drpTriggerAction_17;

	@IFindBy(how = How.CSS, using = "input[name='ReserveRules-CCRulesListScreen-RulesLV-3-Name']", AI = false)
	public WebElement inpName_50;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-MoreButton-RuleListMoreButtonMenuItemSet-EnableSelectedRules>div[role='menuitem']", AI = false)
	public WebElement btnEnableSelected;

	@IFindBy(how = How.CSS, using = "input[name='ReserveRules-CCRulesListScreen-RulesLV-2-Version']", AI = false)
	public WebElement inpVersion_32;

	@IFindBy(how = How.CSS, using = "input[name='ReserveRules-CCRulesListScreen-RulesLV-0-ActionType']", AI = false)
	public WebElement inpActionType;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-PendingImportAlert .gw-AlertBar--label", AI = false)
	public WebElement lblPendingImportAlert;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-MoreButton>div[role='button']", AI = false)
	public WebElement btnMore;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-RulesLV-4-PolicyTypes textarea", AI = false)
	public WebElement inpPolicyType_80;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-MoreButton-RuleListMoreButtonMenuItemSet-ExportAll>div[role='menuitem']", AI = false)
	public WebElement btnExportAll;

	@IFindBy(how = How.CSS, using = "input[name='ReserveRules-CCRulesListScreen-RulesLV-1-ActionType']", AI = false)
	public WebElement inpActionType_18;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-RulesLV-4-ClaimSegments textarea", AI = false)
	public WebElement inpExposureSegment_85;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-RulesLV-4-LossPartyType textarea", AI = false)
	public WebElement inpLossPartyType_82;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-RulesLV-4-IncidentType textarea", AI = false)
	public WebElement inpIncidentType_81;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-RulesLV-2-RuleValidationInfo-RuleValidationInfoCell-Invalid", AI = false)
	public WebElement btnInvalid_33;

	@IFindBy(how = How.CSS, using = "select[name='ReserveRules-CCRulesListScreen-RulesLV-3-Context']", AI = false)
	public WebElement drpTriggerEntity_56;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-RulesLV-4-RuleExecutionInfo-RuleExecutionInfoCell-NotExecuting", AI = false)
	public WebElement btnNotExecuting_67;

	@IFindBy(how = How.CSS, using = "input[name='ReserveRules-CCRulesListScreen-RulesLV-1-Status']", AI = false)
	public WebElement inpStatus_11;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-MoreButton-RuleListMoreButtonMenuItemSet-Import>div[role='menuitem']", AI = false)
	public WebElement btnImportfromFile;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-RulesLV-0-IncidentType textarea", AI = false)
	public WebElement inpIncidentType;

	@IFindBy(how = How.CSS, using = "input[name='ReserveRules-CCRulesListScreen-RulesLV-2-Name']", AI = false)
	public WebElement inpName_30;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-ttlBar", AI = false)
	public WebElement lblTtlBar;

	@IFindBy(how = How.CSS, using = "input[name='ReserveRules-CCRulesListScreen-RulesLV-1-Version']", AI = false)
	public WebElement inpVersion_12;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-ValidationProcessFailedAlert .gw-AlertBar--label", AI = false)
	public WebElement lblDependentonRender;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-RulesLV-3-PolicyTypes textarea", AI = false)
	public WebElement inpPolicyType_60;

	@IFindBy(how = How.CSS, using = "select[name='ReserveRules-CCRulesListScreen-SearchCriteriaPanelRef-RuleFilterCriteriaDV-Status']", AI = false)
	public WebElement drpStatus;

	@IFindBy(how = How.CSS, using = "select[name='ReserveRules-CCRulesListScreen-SearchCriteriaPanelRef-RuleFilterCriteriaDV-LossTypeFilter']", AI = false)
	public WebElement drpLossType;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-RulesLV-1-ExposureTypes textarea", AI = false)
	public WebElement inpExposureType_24;

	@IFindBy(how = How.CSS, using = "input[name='ReserveRules-CCRulesListScreen-RulesLV-2-ActionType']", AI = false)
	public WebElement inpActionType_38;

	@IFindBy(how = How.CSS, using = "select[name='ReserveRules-CCRulesListScreen-RulesLV-2-Context']", AI = false)
	public WebElement drpTriggerEntity_36;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-RulesLV-3-RuleValidationInfo-RuleValidationInfoCell-Invalid", AI = false)
	public WebElement btnInvalid_53;

	@IFindBy(how = How.CSS, using = "#ReserveRules-CCRulesListScreen-BulkEdit-ImportFromCsv>div[role='menuitem']", AI = false)
	public WebElement btnLoadfromSpreadsheet;
	
	@IFindBy(how = How.CSS, using = "div[id$='RulesLV-1-Status']", AI = false)
	public WebElement lblStatus;

	@IFindBy(how = How.CSS, using = "div[id$='RulesLV-0-Name_button']", AI = false)
	public WebElement lblName;

	@IFindBy(how = How.CSS, using = "div[id$='RulesLV-0-Trigger']", AI = false)
	public WebElement lblTriggerAction;

	@IFindBy(how = How.CSS, using = "div[id$='RulesLV-0-Context']", AI = false)
	public WebElement lblTriggerEntity;

	@IFindBy(how = How.CSS, using = "div[id$='RulesLV-0-ExposureTypes']", AI = false)
	public WebElement lblExposureType;

	@IFindBy(how = How.CSS, using = "div[id$='RulesLV-0-LossTypes']", AI = false)
	public WebElement lblLossType;

	@IFindBy(how = How.CSS, using = "div[id$='RulesLV-0-Jurisdictions']", AI = false)
	public WebElement lblJurisdictions;

	@IFindBy(how = How.CSS, using = "div[id$='RulesLV-0-ClaimSegments']", AI = false)
	public WebElement lblExposureSegment;
	
	@IFindBy(how = How.CSS, using = "div[id$='ReserveRuleDetail_UpLink']", AI = false)
	public WebElement btnUpToReserveRules;

	@IFindBy(how = How.CSS, using = "div[id$='DeleteWip']", AI = false)
	public WebElement btnDelete;

	
	public String rulesNameList = "div[id$='Name_button']";


	public ReserveRulesPage(){
	}

	public ReserveRulesPage(WebDriver driver) throws Exception{
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
		}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, btnLoadfromSpreadsheet))) {
			Log.fail("Page did not open up. Site might be down.", driver);
		}elementLayer = new ElementLayer(driver);
	}public ReserveRulesPage enterStatus(WebDriver driver,String Status) {
		BrowserActions.type(driver, inpStatus,Status, "Status");
		return this;
	}
	public ReserveRulesPage enterName_10(WebDriver driver,String Name_10) {
		BrowserActions.type(driver, inpName_10,Name_10, "Name_10");
		return this;
	}
	public ReserveRulesPage enterStatus_51(WebDriver driver,String Status_51) {
		BrowserActions.type(driver, inpStatus_51,Status_51, "Status_51");
		return this;
	}
	public ReserveRulesPage clickInvalid(WebDriver driver)  {
		BrowserActions.click(driver, btnInvalid,"Invalid");
		return this;
	}
	public ReserveRulesPage clickNotExecuting(WebDriver driver)  {
		BrowserActions.click(driver, btnNotExecuting,"NotExecuting");
		return this;
	}
	public ReserveRulesPage clickPrevExecuting(WebDriver driver)  {
		BrowserActions.click(driver, btnPrevExecuting,"PrevExecuting");
		return this;
	}
	public ReserveRulesPage enterExposureSegment_25(WebDriver driver,String ExposureSegment_25) {
		BrowserActions.type(driver, inpExposureSegment_25,ExposureSegment_25, "ExposureSegment_25");
		return this;
	}
	public ReserveRulesPage enterPolicyType_40(WebDriver driver,String PolicyType_40) {
		BrowserActions.type(driver, inpPolicyType_40,PolicyType_40, "PolicyType_40");
		return this;
	}
	public ReserveRulesPage enterExposureSegment_45(WebDriver driver,String ExposureSegment_45) {
		BrowserActions.type(driver, inpExposureSegment_45,ExposureSegment_45, "ExposureSegment_45");
		return this;
	}
	public ReserveRulesPage clickValid(WebDriver driver)  {
		BrowserActions.click(driver, btnValid,"Valid");
		return this;
	}
	public ReserveRulesPage selectTriggerEntity_16(WebDriver driver,String TriggerEntity_16)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTriggerEntity_16,TriggerEntity_16,"TriggerEntity_16");
		return this;
	}
	public ReserveRulesPage enterExposureType_44(WebDriver driver,String ExposureType_44) {
		BrowserActions.type(driver, inpExposureType_44,ExposureType_44, "ExposureType_44");
		return this;
	}
	public ReserveRulesPage selectTriggerAction(WebDriver driver,String TriggerAction)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTriggerAction,TriggerAction,"TriggerAction");
		return this;
	}
	public ReserveRulesPage enterLossPartyType_42(WebDriver driver,String LossPartyType_42) {
		BrowserActions.type(driver, inpLossPartyType_42,LossPartyType_42, "LossPartyType_42");
		return this;
	}
	public ReserveRulesPage selectTriggerEntity(WebDriver driver,String TriggerEntity)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTriggerEntity,TriggerEntity,"TriggerEntity");
		return this;
	}
	public ReserveRulesPage enterPolicyType(WebDriver driver,String PolicyType) {
		BrowserActions.type(driver, inpPolicyType,PolicyType, "PolicyType");
		return this;
	}
	public ReserveRulesPage enterJurisdiction(WebDriver driver,String Jurisdiction) {
		BrowserActions.type(driver, inpJurisdiction,Jurisdiction, "Jurisdiction");
		return this;
	}
	public ReserveRulesPage clickNotExecuting_7(WebDriver driver)  {
		BrowserActions.click(driver, btnNotExecuting_7,"NotExecuting_7");
		return this;
	}
	public ReserveRulesPage clickUnknown(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown,"Unknown");
		return this;
	}
	public ReserveRulesPage enterJurisdiction_23(WebDriver driver,String Jurisdiction_23) {
		BrowserActions.type(driver, inpJurisdiction_23,Jurisdiction_23, "Jurisdiction_23");
		return this;
	}
	public ReserveRulesPage clickExecuting_66(WebDriver driver)  {
		BrowserActions.click(driver, btnExecuting_66,"Executing_66");
		return this;
	}
	public ReserveRulesPage enterVersion(WebDriver driver,String Version) {
		BrowserActions.type(driver, inpVersion,Version, "Version");
		return this;
	}
	public ReserveRulesPage enterPolicyType_20(WebDriver driver,String PolicyType_20) {
		BrowserActions.type(driver, inpPolicyType_20,PolicyType_20, "PolicyType_20");
		return this;
	}
	public ReserveRulesPage clickFilter(WebDriver driver)  {
		BrowserActions.click(driver, btnFilter,"Filter");
		return this;
	}
	public ReserveRulesPage enterExposureSegment_65(WebDriver driver,String ExposureSegment_65) {
		BrowserActions.type(driver, inpExposureSegment_65,ExposureSegment_65, "ExposureSegment_65");
		return this;
	}
	public ReserveRulesPage enterExposureType_64(WebDriver driver,String ExposureType_64) {
		BrowserActions.type(driver, inpExposureType_64,ExposureType_64, "ExposureType_64");
		return this;
	}
	public ReserveRulesPage clickUnknown_9(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_9,"Unknown_9");
		return this;
	}
	public ReserveRulesPage clickInvalid_13(WebDriver driver)  {
		BrowserActions.click(driver, btnInvalid_13,"Invalid_13");
		return this;
	}
	public ReserveRulesPage enterLossPartyType_62(WebDriver driver,String LossPartyType_62) {
		BrowserActions.type(driver, inpLossPartyType_62,LossPartyType_62, "LossPartyType_62");
		return this;
	}
	public ReserveRulesPage clickExecuting(WebDriver driver)  {
		BrowserActions.click(driver, btnExecuting,"Executing");
		return this;
	}
	public ReserveRulesPage clickUnknown_5(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_5,"Unknown_5");
		return this;
	}
	public ReserveRulesPage enterStatus_31(WebDriver driver,String Status_31) {
		BrowserActions.type(driver, inpStatus_31,Status_31, "Status_31");
		return this;
	}
	public ReserveRulesPage clickShowFilters(WebDriver driver)  {
		BrowserActions.click(driver, btnShowFilters,"ShowFilters");
		return this;
	}
	public ReserveRulesPage clickClone(WebDriver driver)  {
		BrowserActions.click(driver, btnClone,"Clone");
		return this;
	}
	public ReserveRulesPage clickUnknown_75(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_75,"Unknown_75");
		return this;
	}
	public ReserveRulesPage enterLossType_79(WebDriver driver,String LossType_79) {
		BrowserActions.type(driver, inpLossType_79,LossType_79, "LossType_79");
		return this;
	}
	public ReserveRulesPage clickEditAllinSpreadsheet(WebDriver driver)  {
		BrowserActions.click(driver, btnEditAllinSpreadsheet,"EditAllinSpreadsheet");
		return this;
	}
	public ReserveRulesPage clickExecuting_46(WebDriver driver)  {
		BrowserActions.click(driver, btnExecuting_46,"Executing_46");
		return this;
	}
	public ReserveRulesPage clickDeploy(WebDriver driver)  {
		BrowserActions.click(driver, btnDeploy,"Deploy");
		return this;
	}
	public ReserveRulesPage enterJurisdiction_43(WebDriver driver,String Jurisdiction_43) {
		BrowserActions.type(driver, inpJurisdiction_43,Jurisdiction_43, "Jurisdiction_43");
		return this;
	}
	public ReserveRulesPage clickValid_14(WebDriver driver)  {
		BrowserActions.click(driver, btnValid_14,"Valid_14");
		return this;
	}
	public ReserveRulesPage clickPrevExecuting_28(WebDriver driver)  {
		BrowserActions.click(driver, btnPrevExecuting_28,"PrevExecuting_28");
		return this;
	}
	public ReserveRulesPage clickDeployAll(WebDriver driver)  {
		BrowserActions.click(driver, btnDeployAll,"DeployAll");
		return this;
	}
	public ReserveRulesPage selectTriggerAction_77(WebDriver driver,String TriggerAction_77)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTriggerAction_77,TriggerAction_77,"TriggerAction_77");
		return this;
	}
	public ReserveRulesPage clickBulkEditSelected(WebDriver driver)  {
		BrowserActions.click(driver, btnBulkEditSelected,"BulkEditSelected");
		return this;
	}
	public ReserveRulesPage enterValidationStatusToolbarInput(WebDriver driver,String ValidationStatusToolbarInput) {
		BrowserActions.type(driver, inpValidationStatusToolbarInput,ValidationStatusToolbarInput, "ValidationStatusToolbarInput");
		return this;
	}
	public ReserveRulesPage selectAvailability(WebDriver driver,String Availability)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpAvailability,Availability,"Availability");
		return this;
	}
	public ReserveRulesPage enterLossType(WebDriver driver,String LossType) {
		BrowserActions.type(driver, inpLossType,LossType, "LossType");
		return this;
	}
	public ReserveRulesPage enterExposureType_84(WebDriver driver,String ExposureType_84) {
		BrowserActions.type(driver, inpExposureType_84,ExposureType_84, "ExposureType_84");
		return this;
	}
	public ReserveRulesPage clickUnknown_69(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_69,"Unknown_69");
		return this;
	}
	public ReserveRulesPage enterLossType_59(WebDriver driver,String LossType_59) {
		BrowserActions.type(driver, inpLossType_59,LossType_59, "LossType_59");
		return this;
	}
	public ReserveRulesPage clickExecuting_6(WebDriver driver)  {
		BrowserActions.click(driver, btnExecuting_6,"Executing_6");
		return this;
	}
	public ReserveRulesPage enterStatus_71(WebDriver driver,String Status_71) {
		BrowserActions.type(driver, inpStatus_71,Status_71, "Status_71");
		return this;
	}
	public ReserveRulesPage clickPrevExecuting_68(WebDriver driver)  {
		BrowserActions.click(driver, btnPrevExecuting_68,"PrevExecuting_68");
		return this;
	}
	public ReserveRulesPage clickExecuting_26(WebDriver driver)  {
		BrowserActions.click(driver, btnExecuting_26,"Executing_26");
		return this;
	}
	public ReserveRulesPage enterJurisdiction_63(WebDriver driver,String Jurisdiction_63) {
		BrowserActions.type(driver, inpJurisdiction_63,Jurisdiction_63, "Jurisdiction_63");
		return this;
	}
	public ReserveRulesPage clickUnknown_55(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_55,"Unknown_55");
		return this;
	}
	public ReserveRulesPage clickClose(WebDriver driver)  {
		BrowserActions.click(driver, btnClose,"Close");
		return this;
	}
	public ReserveRulesPage selectPolicyType(WebDriver driver,String PolicyType)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpPolicyType,PolicyType,"PolicyType");
		return this;
	}
	public ReserveRulesPage selectExposureType(WebDriver driver,String ExposureType)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpExposureType,ExposureType,"ExposureType");
		return this;
	}
	public ReserveRulesPage enterLossPartyType_22(WebDriver driver,String LossPartyType_22) {
		BrowserActions.type(driver, inpLossPartyType_22,LossPartyType_22, "LossPartyType_22");
		return this;
	}
	public ReserveRulesPage enterIncidentType_21(WebDriver driver,String IncidentType_21) {
		BrowserActions.type(driver, inpIncidentType_21,IncidentType_21, "IncidentType_21");
		return this;
	}
	public ReserveRulesPage clickPrevExecuting_48(WebDriver driver)  {
		BrowserActions.click(driver, btnPrevExecuting_48,"PrevExecuting_48");
		return this;
	}
	public ReserveRulesPage clickDisableSelected(WebDriver driver)  {
		BrowserActions.click(driver, btnDisableSelected,"DisableSelected");
		return this;
	}
	public ReserveRulesPage selectTriggerAction_57(WebDriver driver,String TriggerAction_57)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTriggerAction_57,TriggerAction_57,"TriggerAction_57");
		return this;
	}
	public ReserveRulesPage clickExportSelected(WebDriver driver)  {
		BrowserActions.click(driver, btnExportSelected,"ExportSelected");
		return this;
	}
	public ReserveRulesPage enterLossPartyType(WebDriver driver,String LossPartyType) {
		BrowserActions.type(driver, inpLossPartyType,LossPartyType, "LossPartyType");
		return this;
	}
	public ReserveRulesPage clickUnknown_49(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_49,"Unknown_49");
		return this;
	}
	public ReserveRulesPage enterNameDescription(WebDriver driver,String NameDescription) {
		BrowserActions.type(driver, inpNameDescription,NameDescription, "NameDescription");
		return this;
	}
	public ReserveRulesPage enterLossType_39(WebDriver driver,String LossType_39) {
		BrowserActions.type(driver, inpLossType_39,LossType_39, "LossType_39");
		return this;
	}
	public ReserveRulesPage enterJurisdiction_83(WebDriver driver,String Jurisdiction_83) {
		BrowserActions.type(driver, inpJurisdiction_83,Jurisdiction_83, "Jurisdiction_83");
		return this;
	}
	public ReserveRulesPage clickClose_4(WebDriver driver)  {
		BrowserActions.click(driver, btnClose_4,"Close_4");
		return this;
	}
	public ReserveRulesPage clickClose_3(WebDriver driver)  {
		BrowserActions.click(driver, btnClose_3,"Close_3");
		return this;
	}
	public ReserveRulesPage clickClose_2(WebDriver driver)  {
		BrowserActions.click(driver, btnClose_2,"Close_2");
		return this;
	}
	public ReserveRulesPage clickClose_1(WebDriver driver)  {
		BrowserActions.click(driver, btnClose_1,"Close_1");
		return this;
	}
	public ReserveRulesPage enterVersion_72(WebDriver driver,String Version_72) {
		BrowserActions.type(driver, inpVersion_72,Version_72, "Version_72");
		return this;
	}
	public ReserveRulesPage clickUnknown_35(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_35,"Unknown_35");
		return this;
	}
	public ReserveRulesPage selectJurisdiction(WebDriver driver,String Jurisdiction)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpJurisdiction,Jurisdiction,"Jurisdiction");
		return this;
	}
	public ReserveRulesPage clickValid_74(WebDriver driver)  {
		BrowserActions.click(driver, btnValid_74,"Valid_74");
		return this;
	}
	public ReserveRulesPage clickNotExecuting_27(WebDriver driver)  {
		BrowserActions.click(driver, btnNotExecuting_27,"NotExecuting_27");
		return this;
	}
	public ReserveRulesPage enterIncidentType_41(WebDriver driver,String IncidentType_41) {
		BrowserActions.type(driver, inpIncidentType_41,IncidentType_41, "IncidentType_41");
		return this;
	}
	public ReserveRulesPage clickInvalid_73(WebDriver driver)  {
		BrowserActions.click(driver, btnInvalid_73,"Invalid_73");
		return this;
	}
	public ReserveRulesPage enterActionType_58(WebDriver driver,String ActionType_58) {
		BrowserActions.type(driver, inpActionType_58,ActionType_58, "ActionType_58");
		return this;
	}
	public ReserveRulesPage clickUnknown_29(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_29,"Unknown_29");
		return this;
	}
	public ReserveRulesPage selectTriggerAction_37(WebDriver driver,String TriggerAction_37)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTriggerAction_37,TriggerAction_37,"TriggerAction_37");
		return this;
	}
	public ReserveRulesPage enterLossType_19(WebDriver driver,String LossType_19) {
		BrowserActions.type(driver, inpLossType_19,LossType_19, "LossType_19");
		return this;
	}
	public ReserveRulesPage enterName_70(WebDriver driver,String Name_70) {
		BrowserActions.type(driver, inpName_70,Name_70, "Name_70");
		return this;
	}
	public ReserveRulesPage selectExposureSegment(WebDriver driver,String ExposureSegment)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpExposureSegment,ExposureSegment,"ExposureSegment");
		return this;
	}
	public ReserveRulesPage clickClear(WebDriver driver)  {
		BrowserActions.click(driver, btnClear,"Clear");
		return this;
	}
	public ReserveRulesPage enterExposureType(WebDriver driver,String ExposureType) {
		BrowserActions.type(driver, inpExposureType,ExposureType, "ExposureType");
		return this;
	}
	public ReserveRulesPage clickPrevExecuting_8(WebDriver driver)  {
		BrowserActions.click(driver, btnPrevExecuting_8,"PrevExecuting_8");
		return this;
	}
	public ReserveRulesPage enterExposureSegment(WebDriver driver,String ExposureSegment) {
		BrowserActions.type(driver, inpExposureSegment,ExposureSegment, "ExposureSegment");
		return this;
	}
	public ReserveRulesPage enterVersion_52(WebDriver driver,String Version_52) {
		BrowserActions.type(driver, inpVersion_52,Version_52, "Version_52");
		return this;
	}
	public ReserveRulesPage clickDeploySelected(WebDriver driver)  {
		BrowserActions.click(driver, btnDeploySelected,"DeploySelected");
		return this;
	}
	public ReserveRulesPage clickUnknown_15(WebDriver driver)  {
		BrowserActions.click(driver, btnUnknown_15,"Unknown_15");
		return this;
	}
	public ReserveRulesPage clickValid_34(WebDriver driver)  {
		BrowserActions.click(driver, btnValid_34,"Valid_34");
		return this;
	}
	public ReserveRulesPage clickValid_54(WebDriver driver)  {
		BrowserActions.click(driver, btnValid_54,"Valid_54");
		return this;
	}
	public ReserveRulesPage enterName(WebDriver driver,String Name) {
		BrowserActions.type(driver, inpName,Name, "Name");
		return this;
	}
	public ReserveRulesPage clickNotExecuting_47(WebDriver driver)  {
		BrowserActions.click(driver, btnNotExecuting_47,"NotExecuting_47");
		return this;
	}
	public ReserveRulesPage selectTriggerEntity_76(WebDriver driver,String TriggerEntity_76)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTriggerEntity_76,TriggerEntity_76,"TriggerEntity_76");
		return this;
	}
	public ReserveRulesPage clickBulkEdit(WebDriver driver)  {
		BrowserActions.click(driver, btnBulkEdit,"BulkEdit");
		return this;
	}
	public ReserveRulesPage enterIncidentType_61(WebDriver driver,String IncidentType_61) {
		BrowserActions.type(driver, inpIncidentType_61,IncidentType_61, "IncidentType_61");
		return this;
	}
	public ReserveRulesPage enterActionType_78(WebDriver driver,String ActionType_78) {
		BrowserActions.type(driver, inpActionType_78,ActionType_78, "ActionType_78");
		return this;
	}
	public ReserveRulesPage clickAdd(WebDriver driver)  {
		BrowserActions.click(driver, btnAdd,"Add");
		return this;
	}
	public ReserveRulesPage selectTriggerAction_17(WebDriver driver,String TriggerAction_17)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTriggerAction_17,TriggerAction_17,"TriggerAction_17");
		return this;
	}
	public ReserveRulesPage enterName_50(WebDriver driver,String Name_50) {
		BrowserActions.type(driver, inpName_50,Name_50, "Name_50");
		return this;
	}
	public ReserveRulesPage clickEnableSelected(WebDriver driver)  {
		BrowserActions.click(driver, btnEnableSelected,"EnableSelected");
		return this;
	}
	public ReserveRulesPage enterVersion_32(WebDriver driver,String Version_32) {
		BrowserActions.type(driver, inpVersion_32,Version_32, "Version_32");
		return this;
	}
	public ReserveRulesPage enterActionType(WebDriver driver,String ActionType) {
		BrowserActions.type(driver, inpActionType,ActionType, "ActionType");
		return this;
	}
	public ReserveRulesPage clickMore(WebDriver driver)  {
		BrowserActions.click(driver, btnMore,"More");
		return this;
	}
	public ReserveRulesPage enterPolicyType_80(WebDriver driver,String PolicyType_80) {
		BrowserActions.type(driver, inpPolicyType_80,PolicyType_80, "PolicyType_80");
		return this;
	}
	public ReserveRulesPage clickExportAll(WebDriver driver)  {
		BrowserActions.click(driver, btnExportAll,"ExportAll");
		return this;
	}
	public ReserveRulesPage enterActionType_18(WebDriver driver,String ActionType_18) {
		BrowserActions.type(driver, inpActionType_18,ActionType_18, "ActionType_18");
		return this;
	}
	public ReserveRulesPage enterExposureSegment_85(WebDriver driver,String ExposureSegment_85) {
		BrowserActions.type(driver, inpExposureSegment_85,ExposureSegment_85, "ExposureSegment_85");
		return this;
	}
	public ReserveRulesPage enterLossPartyType_82(WebDriver driver,String LossPartyType_82) {
		BrowserActions.type(driver, inpLossPartyType_82,LossPartyType_82, "LossPartyType_82");
		return this;
	}
	public ReserveRulesPage enterIncidentType_81(WebDriver driver,String IncidentType_81) {
		BrowserActions.type(driver, inpIncidentType_81,IncidentType_81, "IncidentType_81");
		return this;
	}
	public ReserveRulesPage clickInvalid_33(WebDriver driver)  {
		BrowserActions.click(driver, btnInvalid_33,"Invalid_33");
		return this;
	}
	public ReserveRulesPage selectTriggerEntity_56(WebDriver driver,String TriggerEntity_56)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTriggerEntity_56,TriggerEntity_56,"TriggerEntity_56");
		return this;
	}
	public ReserveRulesPage clickNotExecuting_67(WebDriver driver)  {
		BrowserActions.click(driver, btnNotExecuting_67,"NotExecuting_67");
		return this;
	}
	public ReserveRulesPage enterStatus_11(WebDriver driver,String Status_11) {
		BrowserActions.type(driver, inpStatus_11,Status_11, "Status_11");
		return this;
	}
	public ReserveRulesPage clickImportfromFile(WebDriver driver)  {
		BrowserActions.click(driver, btnImportfromFile,"ImportfromFile");
		return this;
	}
	public ReserveRulesPage enterIncidentType(WebDriver driver,String IncidentType) {
		BrowserActions.type(driver, inpIncidentType,IncidentType, "IncidentType");
		return this;
	}
	public ReserveRulesPage enterName_30(WebDriver driver,String Name_30) {
		BrowserActions.type(driver, inpName_30,Name_30, "Name_30");
		return this;
	}
	public ReserveRulesPage enterVersion_12(WebDriver driver,String Version_12) {
		BrowserActions.type(driver, inpVersion_12,Version_12, "Version_12");
		return this;
	}
	public ReserveRulesPage enterPolicyType_60(WebDriver driver,String PolicyType_60) {
		BrowserActions.type(driver, inpPolicyType_60,PolicyType_60, "PolicyType_60");
		return this;
	}
	public ReserveRulesPage selectStatus(WebDriver driver,String Status)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpStatus,Status,"Status");
		return this;
	}
	public ReserveRulesPage selectLossType(WebDriver driver,String LossType)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpLossType,LossType,"LossType");
		return this;
	}
	public ReserveRulesPage enterExposureType_24(WebDriver driver,String ExposureType_24) {
		BrowserActions.type(driver, inpExposureType_24,ExposureType_24, "ExposureType_24");
		return this;
	}
	public ReserveRulesPage enterActionType_38(WebDriver driver,String ActionType_38) {
		BrowserActions.type(driver, inpActionType_38,ActionType_38, "ActionType_38");
		return this;
	}
	public ReserveRulesPage selectTriggerEntity_36(WebDriver driver,String TriggerEntity_36)  {
		BrowserActions.selectDropDownByVisibleText(driver, drpTriggerEntity_36,TriggerEntity_36,"TriggerEntity_36");
		return this;
	}
	public ReserveRulesPage clickInvalid_53(WebDriver driver)  {
		BrowserActions.click(driver, btnInvalid_53,"Invalid_53");
		return this;
	}
	public ReserveRulesPage clickLoadfromSpreadsheet(WebDriver driver)  {
		BrowserActions.click(driver, btnLoadfromSpreadsheet,"LoadfromSpreadsheet");
		return this;
	}
	
	public ReserveRulesPage verifyStatusLabel(WebDriver driver)  {
		BrowserActions.verifyElementDisplayed(driver, lblStatus,"Status");
		return this;
	}

	public ReserveRulesPage verifyNameLabel(WebDriver driver)  {
		BrowserActions.verifyElementDisplayed(driver, lblName,"Name ");
		return this;
	}

	public ReserveRulesPage verifyTriggerActionIsDisplayed(WebDriver driver)  {
		BrowserActions.verifyElementDisplayed(driver, lblTriggerAction,"Trigger Action ");
		return this;
	}

	public ReserveRulesPage verifyTriggerEntityIsDisplayed(WebDriver driver)  {
		BrowserActions.verifyElementDisplayed(driver, lblTriggerEntity,"Trigger Entity");
		return this;
	}

	public ReserveRulesPage verifyExposureTypeIsDisplayed(WebDriver driver)  {
		BrowserActions.verifyElementDisplayed(driver, lblExposureType,"Exposure Type");
		return this;
	}

	public ReserveRulesPage verifyLossTypeIsDisplayed(WebDriver driver)  {
		BrowserActions.verifyElementDisplayed(driver, lblLossType,"Loss Type");
		return this;
	}

	public ReserveRulesPage verifyJurisdictionsIsDisplayed(WebDriver driver)  {
		BrowserActions.verifyElementDisplayed(driver, lblJurisdictions,"Jurisdictions");
		return this;
	}

	public ReserveRulesPage verifyExposureSegmentIsDisplayed(WebDriver driver)  {
		BrowserActions.verifyElementDisplayed(driver, lblExposureSegment,"Incident Type");
		return this;
	}

	public ReserveRulesPage clickNameCheckBox(WebDriver driver,String name) {
		BrowserActions.waitForElementToDisplay(driver,lblTtlBar);
		By nameCheckBoxBy = By.xpath("//div[text()='"+name+"']//ancestor::td//preceding-sibling::td//descendant::div[contains(@id,'_Checkbox')]");
		BrowserActions.waitForElementToDisplay(driver, nameCheckBoxBy,"name check box");
		WebElement nameCheckBox = nameCheckBoxBy.findElement(driver);
		BrowserActions.click(driver, nameCheckBox,"Name check box");
		return this;
	}
	
	public ReserveRulesPage clickReserveRuleNameLink(WebDriver driver,String name) {
		BrowserActions.waitForElementToDisplay(driver,lblName);
		By reserveRuleNameBy = By.xpath("//div[text()='"+name+"']");
		BrowserActions.waitForElementToDisplay(driver, reserveRuleNameBy, "Reserve rules");
		WebElement reserveRuleName = reserveRuleNameBy.findElement(driver);
		BrowserActions.click(driver, reserveRuleName,"Reserve Rule Name Link");
		return this;
	}

	public ReserveRulesPage clickUpToReserveRules(WebDriver driver)  {
		BrowserActions.click(driver, btnUpToReserveRules,"Up to Reserve rules");
		return this;
	}

	public ReserveRulesPage verifyReserveMainPage(WebDriver driver)  {
		BrowserActions.verifyElementDisplayed(driver, lblTtlBar,"Main Page Title");
		return this;
	}
	public ReserveRulesPage clickDelete(WebDriver driver)  {
		BrowserActions.click(driver, btnDelete,"Rule Delete Button");
		BrowserActions.confirmAlert(driver, "Are you sure you want to delete this rule?");
		return this;
	}

	public void verifyclickAddedUserNameIsNotDisplayed(WebDriver driver,String name)  {
		boolean flag = false;
		BrowserActions.waitForElementToDisplay(driver,lblTtlBar);
		By nameBy = By.xpath("//div[text()='"+name+"']");
		int size = BrowserActions.getWebElementSize(driver, nameBy, "nameBy", 0.5);
		if(size == 0) {
			flag = true;
		}
		Log.softAssertThat(flag, "Reserve Rule("+name+") is deleted", "Reserve Rule("+name+") present in list is not deleted");
	}
	
	public void verifyclickAddedUserNameIsDeleted(WebDriver driver,String name)  {
		BrowserActions.waitForElementToDisplay(driver,lblName);
		By ruleNameBy = By.cssSelector(rulesNameList);
		List<WebElement> nameList = BrowserActions.getWebElements(driver, ruleNameBy, "name", 0.5);
		  for (WebElement listOfrules : nameList) {
		    if (listOfrules.getText().equals(name)) {
		      Log.fail("Deleted rules still exist");
		    }
		  }
		Log.message("Deleted Reserve rules not exist");
	}


	public class NewReserveRulePage extends LoadableComponent<NewReserveRulePage> {

		WebDriver driver;
		private boolean isPageLoaded;
		public ElementLayer elementLayer;
		String elementObject;
		HashMap<String, String> getPageObjects;
		public  List<Object> pageFactoryKey = new ArrayList<Object>();
		public  List<String> pageFactoryValue = new ArrayList<String>();


		@IFindBy(how = How.CSS, using = "input[name='CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleVariablesPanelSet-RuleVariableLV-TypeId']", AI = false)
		public WebElement inpTypeId;

		@IFindBy(how = How.CSS, using = "input[name='CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-ApplicabilityCriteriaDV-Jurisdictions-ApplicabilityCriteriaMultiSelectInputSet-AnyOrSelection']", AI = false)
		public WebElement rdbJurisdiction;

		@IFindBy(how = How.CSS, using = "#CreateReserveRulePage-CCRuleCreationScreen-ConditionValidationToolbarButtonSet-ShowValidation>div[role='button']", AI = false)
		public WebElement btnShowValidationErrors;

		@IFindBy(how = How.CSS, using = "input[name='CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-ApplicabilityCriteriaDV-PolicyTypes-ApplicabilityCriteriaMultiSelectInputSet-AnyOrSelection']", AI = false)
		public WebElement rdbPolicyType;

		@IFindBy(how = How.CSS, using = "#CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleVariablesPanelSet-RuleVariableLV-0-ExpressionOperandCell-VariableExpressionFragCell-Expression-ExpressionMenuIcon>div[role='button']", AI = false)
		public WebElement btnExpressionMenuIcon;

		@IFindBy(how = How.CSS, using = "#CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleVariablesPanelSet-RuleVariableLV-0-ExpressionOperandCell-VariableExpressionFragCell-Expression-RuleVariableBuilderExpressionMenuItemSet-8-modeItem>div[role='menuitem']", AI = false)
		public WebElement btnCount;

		@IFindBy(how = How.CSS, using = "input[name='CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-ConditionBuilderLV-OperatorLabel']", AI = false)
		public WebElement inpOperatorLabel_15;

		@IFindBy(how = How.CSS, using = "input[name='CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleVariablesPanelSet-RuleVariableLV-0-ExpressionOperandCell-VariableExpressionFragCell-Expression']", AI = false)
		public WebElement inpExpression;

		@IFindBy(how = How.CSS, using = "input[name='CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-AvailableToRunInputSet-Note']", AI = false)
		public WebElement inpNote;

		@IFindBy(how = How.CSS, using = "input[name='CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-ConditionBuilderLV-LeftParensLabel']", AI = false)
		public WebElement inpLeftParensLabel_13;

		@IFindBy(how = How.CSS, using = "input[name='CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-ConditionBuilderLV-RightParensLabel']", AI = false)
		public WebElement inpRightParensLabel_17;

		@IFindBy(how = How.CSS, using = "input[name='CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-DisplayRuleCondition']", AI = false)
		public WebElement rdbDisplayRuleConditions;

		@IFindBy(how = How.CSS, using = "input[name='CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-ConditionBuilderLV-AndOrLabel']", AI = false)
		public WebElement inpAndOrLabel_12;

		@IFindBy(how = How.CSS, using = "#CreateReserveRulePage-CCRuleCreationScreen-DuplicatedNameAlertBar .gw-AlertBar--label", AI = false)
		public WebElement lblAnotherrulehasthesamename;

		@IFindBy(how = How.CSS, using = "select[name='CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-ApplicabilityCriteriaDV-ClaimSegments-ApplicabilityCriteriaMultiSelectInputSet-InputWidget']", AI = false)
		public WebElement drpInputWidget_3;

		@IFindBy(how = How.CSS, using = "select[name='CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-ApplicabilityCriteriaDV-ExposureTypes-ApplicabilityCriteriaMultiSelectInputSet-InputWidget']", AI = false)
		public WebElement drpInputWidget_2;

		@IFindBy(how = How.CSS, using = "select[name='CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-ApplicabilityCriteriaDV-Jurisdictions-ApplicabilityCriteriaMultiSelectInputSet-InputWidget']", AI = false)
		public WebElement drpInputWidget_1;

		@IFindBy(how = How.CSS, using = "#CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-ConditionBuilderPanelSet-AdvancedConditionsLV-AdvancedConditionToolbar-AdvancedShowPrettyPrint>div[role='button']", AI = false)
		public WebElement btnShowFormattedView;

		@IFindBy(how = How.CSS, using = "#CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleCommandDefinitionsListDetailView-cardTab", AI = false)
		public WebElement btnParameters_21;

		@IFindBy(how = How.CSS, using = "#CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleCommandDefinitionsListDetailView-MoveUp>div[role='button']", AI = false)
		public WebElement btnMoveUp;

		@IFindBy(how = How.CSS, using = "select[name='CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-TriggeringPointKey']", AI = false)
		public WebElement drpTriggerAction;

		@IFindBy(how = How.CSS, using = "input[name='CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleCommandDefinitionsListDetailView-CommandDefinitionDV-CommandDefinitionDV-Comments-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression']", AI = false)
		public WebElement inpCommentsText;

		@IFindBy(how = How.CSS, using = "select[name='CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleContextDefinitionKey']", AI = false)
		public WebElement drpTriggerEntity;

		@IFindBy(how = How.CSS, using = "#CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleCommandDefinitionsListDetailView-Add>div[role='button']", AI = false)
		public WebElement btnAddAction;

		@IFindBy(how = How.CSS, using = "#CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-ConditionBuilderPanelSet-AdvancedConditionsLV-AdvancedConditionToolbar-AdvancedRemove>div[role='button']", AI = false)
		public WebElement btnRemove_5;

		@IFindBy(how = How.CSS, using = "#CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-SimpleConditionToolbar-SimpleMoveDown>div[role='button']", AI = false)
		public WebElement btnSimpleMoveDown;

		@IFindBy(how = How.CSS, using = "#CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-ConditionBuilderPanelSet-AdvancedConditionsLV-AdvancedConditionToolbar-AdvancedContextHelp>div[role='button']", AI = false)
		public WebElement btnContextHelpALTH;

		@IFindBy(how = How.CSS, using = "#CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleCommandDefinitionsListDetailView-CommandDefinitionDV-CommandDefinitionDV-RespectFinancialHolds-ValidatingCommandParameterInputSet-CommandParameterInputSet-BooleanValue-BooleanValueMenuIcon>div[role='button']", AI = false)
		public WebElement btnBooleanValueMenuIcon;

		@IFindBy(how = How.CSS, using = "#CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-SimpleConditionToolbar-SimpleRemove>div[role='button']", AI = false)
		public WebElement btnRemove_8;

		@IFindBy(how = How.CSS, using = "#CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleVariablesPanelSet-RuleVariableLV-0-NameValidationLabel", AI = false)
		public WebElement btnName;

		@IFindBy(how = How.CSS, using = "#CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleCommandDefinitionsListDetailView-Remove>div[role='button']", AI = false)
		public WebElement btnRemoveAction;

		@IFindBy(how = How.CSS, using = "#CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleCommandDefinitionsListDetailView-CommandDefinitionDV-CommandDefinitionDV-Currency-ValidatingCommandParameterInputSet-ValidationErrorsInputSet-Label", AI = false)
		public WebElement btnLabel_30;

		@IFindBy(how = How.CSS, using = "#CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleCommandDefinitionsListDetailView-CommandDefinitionDV-CommandDefinitionDV-Comments-ValidatingCommandParameterInputSet-ValidationErrorsInputSet-Label", AI = false)
		public WebElement btnLabel_32;

		@IFindBy(how = How.CSS, using = "input[name='CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-ConditionBuilderPanelSet-AdvancedConditionsLV-ConditionBuilderLV-LeftOperandLabel']", AI = false)
		public WebElement inpLeftOperandLabel;

		@IFindBy(how = How.CSS, using = "input[name='CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-ConditionBuilderPanelSet-AdvancedConditionsLV-ConditionBuilderLV-AndOrLabel']", AI = false)
		public WebElement inpAndOrLabel;

		@IFindBy(how = How.CSS, using = "input[name='CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleVariablesPanelSet-RuleVariableLV-0-variableType']", AI = false)
		public WebElement inpVariableType;

		@IFindBy(how = How.CSS, using = "#CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleVariablesPanelSet-RuleVariableLV-0-ExpressionOperandCell-VariableExpressionFragCell-Expression-RuleVariableBuilderExpressionMenuItemSet-3-modeItem>div[role='menuitem']", AI = false)
		public WebElement btnCondition;

		@IFindBy(how = How.CSS, using = "select[name='CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleCommandDefinitionsListDetailView-RuleActionKey']", AI = false)
		public WebElement drpActionType;

		@IFindBy(how = How.CSS, using = "input[name='CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-AvailableToRunInputSet-Value']", AI = false)
		public WebElement rdbEnabled;

		@IFindBy(how = How.CSS, using = "#CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleCommandDefinitionsListDetailView-MoveDown>div[role='button']", AI = false)
		public WebElement btnMoveDown;

		@IFindBy(how = How.CSS, using = "input[name='CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleVariablesPanelSet-NoVariableText']", AI = false)
		public WebElement inpNovariablesdeclared;

		@IFindBy(how = How.CSS, using = "input[name='CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleCommandDefinitionsListDetailView-0-actionSequence']", AI = false)
		public WebElement inpSequence;

		@IFindBy(how = How.CSS, using = "#CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleVariablesPanelSet-RuleVariableLV-0-ExpressionOperandCell-VariableExpressionFragCell-Expression-RuleVariableBuilderExpressionMenuItemSet-0-modeItem>div[role='menuitem']", AI = false)
		public WebElement btnYesNo;

		@IFindBy(how = How.CSS, using = "#CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-RuleConditionTitle", AI = false)
		public WebElement lblRuleConditionTitle;

		@IFindBy(how = How.CSS, using = "input[name='CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-Name']", AI = false)
		public WebElement inpName;

		@IFindBy(how = How.CSS, using = "#CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-SimpleConditionToolbar-SimpleContextHelp>div[role='button']", AI = false)
		public WebElement btnContextHelpALTH_11;

		@IFindBy(how = How.CSS, using = "input[name='CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleCommandDefinitionsListDetailView-0-actionDescription']", AI = false)
		public WebElement inpDescription_20;

		@IFindBy(how = How.CSS, using = "#CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleVariablesPanelSet-RuleVariableLV-0-ExpressionOperandCell-VariableExpressionFragCell-Expression-RuleVariableBuilderExpressionMenuItemSet-2-modeItem>div[role='menuitem']", AI = false)
		public WebElement btnDate;

		@IFindBy(how = How.CSS, using = "input[name='CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-ConditionBuilderPanelSet-AdvancedConditionsLV-ConditionBuilderLV-OperatorLabel']", AI = false)
		public WebElement inpOperatorLabel;

		@IFindBy(how = How.CSS, using = "#CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleVariableTitle", AI = false)
		public WebElement lblRuleVariableTitle;

		@IFindBy(how = How.CSS, using = "#CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-ConditionBuilderPanelSet-ConditionValidationErrorsWhenReadOnlyDV-ValidationErrorsInputSet-Label", AI = false)
		public WebElement btnLabel;

		@IFindBy(how = How.CSS, using = "input[name='CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-ApplicabilityCriteriaDV-ExposureTypes-ApplicabilityCriteriaMultiSelectInputSet-AnyOrSelection']", AI = false)
		public WebElement rdbExposureType;

		@IFindBy(how = How.CSS, using = "#CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleCommandDefinitionsListDetailView-cardTab", AI = false)
		public WebElement btnParameters;

		@IFindBy(how = How.CSS, using = "#CreateReserveRulePage-CCRuleCreationScreen-ConditionValidationToolbarButtonSet-HideValidation>div[role='button']", AI = false)
		public WebElement btnHideValidationErrors;

		@IFindBy(how = How.CSS, using = "#CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleVariablesPanelSet-RuleVariableLV_tb-Add>div[role='button']", AI = false)
		public WebElement btnAdd;

		@IFindBy(how = How.CSS, using = "input[name='CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleVariablesPanelSet-RuleVariableLV-VariableDescriptionID']", AI = false)
		public WebElement inpVariableDescriptionID;

		@IFindBy(how = How.CSS, using = "#CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-ConditionBuilderPanelSet-AdvancedConditionsLV-AdvancedConditionToolbar-AdvancedMoveUp>div[role='button']", AI = false)
		public WebElement btnAdvancedMoveUp;

		@IFindBy(how = How.CSS, using = "#CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleCommandDefinitionsListDetailView-CommandDefinitionDV-CommandDefinitionDV-Currency-ValidatingCommandParameterInputSet-ValidationErrorsInputSet-ValidationErrorIcon", AI = false)
		public WebElement btnValidationErrorIcon_29;

		@IFindBy(how = How.CSS, using = "#CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleManagementAuditLinkInputSet-Link", AI = false)
		public WebElement btnViewHistory;

		@IFindBy(how = How.CSS, using = "#CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-ConditionBuilderPanelSet-ValidationErrorsDV-ValidationErrorsInputSet-Label", AI = false)
		public WebElement btnLabel_19;

		@IFindBy(how = How.CSS, using = "#CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleCommandDefinitionsListDetailView-CommandDefinitionDV-CommandDefinitionDV-Amount-ValidatingCommandParameterInputSet-ValidationErrorsInputSet-ValidationErrorIcon", AI = false)
		public WebElement btnValidationErrorIcon_27;

		@IFindBy(how = How.CSS, using = "#CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleCommandDefinitionsListDetailView-CommandDefinitionDV-CommandDefinitionDV-Currency-ValidatingCommandParameterInputSet-CommandParameterInputSet-TypeKey-TypeKeyMenuIcon>div[role='button']", AI = false)
		public WebElement btnTypeKeyMenuIcon;

		@IFindBy(how = How.CSS, using = "#CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-ConditionBuilderPanelSet-AdvancedConditionsLV-AdvancedConditionToolbar-AdvancedHidePrettyPrint>div[role='button']", AI = false)
		public WebElement btnHideFormattedView;

		@IFindBy(how = How.CSS, using = "#CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleVariablesPanelSet-RuleVariableLV-0-ExpressionOperandCell-VariableExpressionFragCell-Expression-RuleVariableBuilderExpressionMenuItemSet-1-modeItem>div[role='menuitem']", AI = false)
		public WebElement btnTypeKey;

		@IFindBy(how = How.CSS, using = "#CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleCommandDefinitionsListDetailView-CommandDefinitionValidationErrors-ValidationErrorsInputSet-ValidationErrorIcon", AI = false)
		public WebElement btnValidationErrorIcon_22;

		@IFindBy(how = How.CSS, using = "input[name='CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-ApplicabilityCriteriaDV-ClaimSegments-ApplicabilityCriteriaMultiSelectInputSet-AnyOrSelection']", AI = false)
		public WebElement rdbExposureSegment;

		@IFindBy(how = How.CSS, using = "#CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-Description textarea", AI = false)
		public WebElement inpDescription;

		@IFindBy(how = How.CSS, using = "input[name='CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleCommandDefinitionsListDetailView-0-actionType']", AI = false)
		public WebElement inpActionType;

		@IFindBy(how = How.CSS, using = "#CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleCommandDefinitionsListDetailView-CommandDefinitionDV-CommandDefinitionDV-RespectFinancialHolds-ValidatingCommandParameterInputSet-ValidationErrorsInputSet-ValidationErrorIcon", AI = false)
		public WebElement btnValidationErrorIcon_24;

		@IFindBy(how = How.CSS, using = "#CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleManagementAuditLinkInputSet-Summary", AI = false)
		public WebElement btnLastEditedbysuon04262023;

		@IFindBy(how = How.CSS, using = "input[name='CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleVariablesPanelSet-RuleVariableLV-0-variableDescription']", AI = false)
		public WebElement inpVariableDescription;

		@IFindBy(how = How.CSS, using = "#CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleVariablesPanelSet-RuleVariableLV-0-ExpressionOperandCell-VariableExpressionFragCell-Expression-RuleVariableBuilderExpressionMenuItemSet-4-modeItem>div[role='menuitem']", AI = false)
		public WebElement btnTextTemplate;

		@IFindBy(how = How.CSS, using = "#CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleCommandDefinitionsListDetailView-CommandDefinitionDV-CommandDefinitionDV-Comments-ValidatingCommandParameterInputSet-CommandParameterInputSet-TemplateExpression-TemplateExpressionMenuIcon>div[role='button']", AI = false)
		public WebElement btnTemplateExpressionMenuIcon;

		@IFindBy(how = How.CSS, using = "input[name='CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleVariablesPanelSet-RuleVariableLV-0-variableName']", AI = false)
		public WebElement inpVariableName;

		@IFindBy(how = How.CSS, using = "#CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleVariablesPanelSet-RuleVariableLV-0-ExpressionOperandCell-VariableExpressionFragCell-Expression-RuleVariableBuilderExpressionMenuItemSet-9-modeItem>div[role='menuitem']", AI = false)
		public WebElement btnSum;

		@IFindBy(how = How.CSS, using = "input[name='CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-ConditionBuilderLV-LeftOperandLabel']", AI = false)
		public WebElement inpLeftOperandLabel_14;

		@IFindBy(how = How.CSS, using = "#CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-ConditionBuilderPanelSet-ValidationErrorsDV-ValidationErrorsInputSet-ValidationErrorIcon", AI = false)
		public WebElement btnValidationErrorIcon_18;

		@IFindBy(how = How.CSS, using = "#CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleCommandDefinitionsListDetailView-CommandDefinitionDV-CommandDefinitionDV-Amount-ValidatingCommandParameterInputSet-ValidationErrorsInputSet-Label", AI = false)
		public WebElement btnLabel_28;

		@IFindBy(how = How.CSS, using = "#CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleCommandDefinitionsListDetailView-CommandDefinitionValidationErrors-ValidationErrorsInputSet-Label", AI = false)
		public WebElement btnLabel_23;

		@IFindBy(how = How.CSS, using = "input[name='CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleCommandDefinitionsListDetailView-CommandDefinitionDV-CommandDefinitionDV-RespectFinancialHolds-ValidatingCommandParameterInputSet-CommandParameterInputSet-BooleanValue']", AI = false)
		public WebElement rdbRespectFinancialHolds;

		@IFindBy(how = How.CSS, using = "#CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleCommandDefinitionsListDetailView-CommandDefinitionDV-CommandDefinitionDV-RespectFinancialHolds-ValidatingCommandParameterInputSet-ValidationErrorsInputSet-Label", AI = false)
		public WebElement btnLabel_25;

		@IFindBy(how = How.CSS, using = "input[name='CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-ConditionBuilderPanelSet-AdvancedConditionsLV-ConditionBuilderLV-RightParensLabel']", AI = false)
		public WebElement inpRightParensLabel;

		@IFindBy(how = How.CSS, using = "input[name='CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleVariablesPanelSet-RuleVariableLV-VariableNameID']", AI = false)
		public WebElement inpVariableNameID;

		@IFindBy(how = How.CSS, using = "#CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleVariablesPanelSet-RuleVariableLV-0-ExpressionValidationLabel", AI = false)
		public WebElement btnExpression;

		@IFindBy(how = How.CSS, using = "#CreateReserveRulePage-CCRuleCreationScreen-Update>div[role='button']", AI = false)
		public WebElement btnSave;

		@IFindBy(how = How.CSS, using = "#CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleVariablesPanelSet-RuleVariableLV-0-ExpressionOperandCell-VariableExpressionFragCell-Expression-RuleVariableBuilderExpressionMenuItemSet-6-modeItem>div[role='menuitem']", AI = false)
		public WebElement btnField;

		@IFindBy(how = How.CSS, using = "#CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-SimpleConditionToolbar-SimpleHidePrettyPrint>div[role='button']", AI = false)
		public WebElement btnHideFormattedView_10;

		@IFindBy(how = How.CSS, using = "input[name='CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-ApplicabilityCriteriaDV-LossTypes-ApplicabilityCriteriaSingleSelectInputSet-ReadonlyDisplay']", AI = false)
		public WebElement inpLossType;

		@IFindBy(how = How.CSS, using = "select[name='CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-ApplicabilityCriteriaDV-PolicyTypes-ApplicabilityCriteriaMultiSelectInputSet-InputWidget']", AI = false)
		public WebElement drpInputWidget;

		@IFindBy(how = How.CSS, using = "#CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleVariablesPanelSet-RuleVariableLV-0-ExpressionErrorIcon", AI = false)
		public WebElement btnExpressionErrorIcon;

		@IFindBy(how = How.CSS, using = "#CreateReserveRulePage-CCRuleCreationScreen-ttlBar", AI = false)
		public WebElement lblTtlBar;

		@IFindBy(how = How.CSS, using = "#CreateReserveRulePage-CCRuleCreationScreen-Edit>div[role='button']", AI = false)
		public WebElement btnEdit;

		@IFindBy(how = How.CSS, using = "input[name='CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-ConditionBuilderPanelSet-AdvancedConditionsLV-ConditionBuilderLV-LeftParensLabel']", AI = false)
		public WebElement inpLeftParensLabel;

		@IFindBy(how = How.CSS, using = "input[name='CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-ConditionBuilderLV-RightOperandLabel']", AI = false)
		public WebElement inpRightOperandLabel_16;

		@IFindBy(how = How.CSS, using = "input[name='CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-ConditionBuilderPanelSet-AdvancedConditionsLV-ConditionBuilderLV-RightOperandLabel']", AI = false)
		public WebElement inpRightOperandLabel;

		@IFindBy(how = How.CSS, using = "#CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-ConditionBuilderPanelSet-AdvancedConditionsLV-AdvancedConditionToolbar-AdvancedInsert>div[role='button']", AI = false)
		public WebElement btnInsert;

		@IFindBy(how = How.CSS, using = "#CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-SimpleConditionToolbar-SimpleInsert>div[role='button']", AI = false)
		public WebElement btnInsert_7;

		@IFindBy(how = How.CSS, using = "input[name='CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleCommandDefinitionsListDetailView-CommandDefinitionDV-CommandDefinitionDV-Amount-ValidatingCommandParameterInputSet-CommandParameterInputSet-Expression']", AI = false)
		public WebElement inpAmountFormula;

		@IFindBy(how = How.CSS, using = "input[name='CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-ContextDescription']", AI = false)
		public WebElement inpContextDescription;

		@IFindBy(how = How.CSS, using = "#CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleVariablesPanelSet-RuleVariableLV-0-ExpressionOperandCell-VariableExpressionFragCell-Expression-RuleVariableBuilderExpressionMenuItemSet-5-modeItem>div[role='menuitem']", AI = false)
		public WebElement btnFormula;

		@IFindBy(how = How.CSS, using = "#CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-ConditionBuilderPanelSet-AdvancedConditionsLV-AdvancedConditionToolbar-AdvancedMoveDown>div[role='button']", AI = false)
		public WebElement btnAdvancedMoveDown;

		@IFindBy(how = How.CSS, using = "#CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-SimpleConditionToolbar-SimpleShowPrettyPrint>div[role='button']", AI = false)
		public WebElement btnShowFormattedView_9;

		@IFindBy(how = How.CSS, using = "#CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleVariablesPanelSet-RuleVariableLV_tb-Remove>div[role='button']", AI = false)
		public WebElement btnRemove;

		@IFindBy(how = How.CSS, using = "select[name*='LossTypes']", AI = false)
		public WebElement drpLossType;

		@IFindBy(how = How.CSS, using = "#CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleVariablesPanelSet-RuleVariableLV-0-ExpressionOperandCell-VariableExpressionFragCell-Expression-RuleVariableBuilderExpressionMenuItemSet-10-modeItem>div[role='menuitem']", AI = false)
		public WebElement btnLookup;

		@IFindBy(how = How.CSS, using = "#CreateReserveRulePage-CCRuleCreationScreen-DuplicatedNameAlertBar-CloseBtn", AI = false)
		public WebElement btnClose;

		@IFindBy(how = How.CSS, using = "#CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-SimpleConditionToolbar-SimpleAdd>div[role='button']", AI = false)
		public WebElement btnAdd_6;

		@IFindBy(how = How.CSS, using = "#CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-ConditionBuilderPanelSet-AdvancedConditionsLV-AdvancedConditionToolbar-AdvancedAdd>div[role='button']", AI = false)
		public WebElement btnAdd_4;

		@IFindBy(how = How.CSS, using = "#CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleCommandDefinitionsListDetailView-CommandDefinitionDV-CommandDefinitionDV-Amount-ValidatingCommandParameterInputSet-CommandParameterInputSet-Expression-ExpressionMenuIcon>div[role='button']", AI = false)
		public WebElement btnExpressionMenuIcon_26;

		@IFindBy(how = How.CSS, using = "#CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleVariablesPanelSet-RuleVariableLV-0-NameValidationErrorIcon", AI = false)
		public WebElement btnNameValidationErrorIcon;

		@IFindBy(how = How.CSS, using = "#CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-ConditionBuilderPanelSet-SimpleConditionsLV-SimpleConditionToolbar-SimpleMoveUp>div[role='button']", AI = false)
		public WebElement btnSimpleMoveUp;

		@IFindBy(how = How.CSS, using = "#CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleCommandDefinitionsListDetailView-CommandDefinitionDV-CommandDefinitionDV-Comments-ValidatingCommandParameterInputSet-ValidationErrorsInputSet-ValidationErrorIcon", AI = false)
		public WebElement btnValidationErrorIcon_31;

		@IFindBy(how = How.CSS, using = "select[name='CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleCommandDefinitionsListDetailView-CommandDefinitionDV-CommandDefinitionDV-CostType']", AI = false)
		public WebElement drpCostType;

		@IFindBy(how = How.CSS, using = "#CreateReserveRulePage-CCRuleCreationScreen-Cancel>div[role='button']", AI = false)
		public WebElement btnCancel;

		@IFindBy(how = How.CSS, using = "select[name='CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleCommandDefinitionsListDetailView-CommandDefinitionDV-CommandDefinitionDV-Currency-ValidatingCommandParameterInputSet-CommandParameterInputSet-TypeKey']", AI = false)
		public WebElement drpCurrency;

		@IFindBy(how = How.CSS, using = "#CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleVariablesPanelSet-RuleVariableLV-0-ExpressionOperandCell-VariableExpressionFragCell-Expression-RuleVariableBuilderExpressionMenuItemSet-7-modeItem>div[role='menuitem']", AI = false)
		public WebElement btnLastsavedvalue;

		@IFindBy(how = How.CSS, using = "input[name='CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleVariablesPanelSet-RuleVariableLV-ExpressionID']", AI = false)
		public WebElement inpExpressionID;

		@IFindBy(how = How.CSS, using = "#CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleConditionPanelSet-ConditionBuilderPanelSet-ConditionValidationErrorsWhenReadOnlyDV-ValidationErrorsInputSet-ValidationErrorIcon", AI = false)
		public WebElement btnValidationErrorIcon;

		@IFindBy(how = How.CSS, using = "select[name='CreateReserveRulePage-CCRuleCreationScreen-RuleDetailPanelSet-RuleCommandDefinitionsListDetailView-CommandDefinitionDV-CommandDefinitionDV-CostCategory']", AI = false)
		public WebElement drpCostCategory;
		
		@IFindBy(how = How.CSS, using = "input[name$='RuleVariableLV-0-variableName']", AI = false)
		public WebElement inpRuleVariableName;

		@IFindBy(how = How.CSS, using = "input[name$='RuleVariableLV-0-variableDescription']", AI = false)
		public WebElement inpRuleVariableDescription;

		@IFindBy(how = How.CSS, using = "input[name$='VariableExpressionFragCell-Expression']", AI = false)
		public WebElement inpRuleVariableExpression;

		public NewReserveRulePage(){
		}

		public NewReserveRulePage(WebDriver driver) throws Exception{
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
			}if (isPageLoaded && !(BrowserActions.waitForElementToDisplay(driver, drpCostCategory))) {
				Log.fail("Page did not open up. Site might be down.", driver);
			}elementLayer = new ElementLayer(driver);
		}public NewReserveRulePage enterTypeId(WebDriver driver,String TypeId) {
			BrowserActions.type(driver, inpTypeId,TypeId, "TypeId");
			return this;
		}
		public NewReserveRulePage clickJurisdiction(WebDriver driver)  {
			BrowserActions.click(driver, rdbJurisdiction,"Jurisdiction");
			return this;
		}
		public NewReserveRulePage clickShowValidationErrors(WebDriver driver)  {
			BrowserActions.click(driver, btnShowValidationErrors,"ShowValidationErrors");
			return this;
		}
		public NewReserveRulePage clickPolicyType(WebDriver driver)  {
			BrowserActions.click(driver, rdbPolicyType,"PolicyType");
			return this;
		}
		public NewReserveRulePage clickExpressionMenuIcon(WebDriver driver)  {
			BrowserActions.click(driver, btnExpressionMenuIcon,"ExpressionMenuIcon");
			return this;
		}
		public NewReserveRulePage clickCount(WebDriver driver)  {
			BrowserActions.click(driver, btnCount,"Count");
			return this;
		}
		public NewReserveRulePage enterOperatorLabel_15(WebDriver driver,String OperatorLabel_15) {
			BrowserActions.type(driver, inpOperatorLabel_15,OperatorLabel_15, "OperatorLabel_15");
			return this;
		}
		public NewReserveRulePage enterExpression(WebDriver driver,String Expression) {
			BrowserActions.type(driver, inpExpression,Expression, "Expression");
			return this;
		}
		public NewReserveRulePage enterNote(WebDriver driver,String Note) {
			BrowserActions.type(driver, inpNote,Note, "Note");
			return this;
		}
		public NewReserveRulePage enterLeftParensLabel_13(WebDriver driver,String LeftParensLabel_13) {
			BrowserActions.type(driver, inpLeftParensLabel_13,LeftParensLabel_13, "LeftParensLabel_13");
			return this;
		}
		public NewReserveRulePage enterRightParensLabel_17(WebDriver driver,String RightParensLabel_17) {
			BrowserActions.type(driver, inpRightParensLabel_17,RightParensLabel_17, "RightParensLabel_17");
			return this;
		}
		public NewReserveRulePage clickDisplayRuleConditions(WebDriver driver)  {
			BrowserActions.click(driver, rdbDisplayRuleConditions,"DisplayRuleConditions");
			return this;
		}
		public NewReserveRulePage enterAndOrLabel_12(WebDriver driver,String AndOrLabel_12) {
			BrowserActions.type(driver, inpAndOrLabel_12,AndOrLabel_12, "AndOrLabel_12");
			return this;
		}
		public NewReserveRulePage selectInputWidget_3(WebDriver driver,String InputWidget_3)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpInputWidget_3,InputWidget_3,"InputWidget_3");
			return this;
		}
		public NewReserveRulePage selectInputWidget_2(WebDriver driver,String InputWidget_2)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpInputWidget_2,InputWidget_2,"InputWidget_2");
			return this;
		}
		public NewReserveRulePage selectInputWidget_1(WebDriver driver,String InputWidget_1)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpInputWidget_1,InputWidget_1,"InputWidget_1");
			return this;
		}
		public NewReserveRulePage clickShowFormattedView(WebDriver driver)  {
			BrowserActions.click(driver, btnShowFormattedView,"ShowFormattedView");
			return this;
		}
		public NewReserveRulePage clickParameters_21(WebDriver driver)  {
			BrowserActions.click(driver, btnParameters_21,"Parameters_21");
			return this;
		}
		public NewReserveRulePage clickMoveUp(WebDriver driver)  {
			BrowserActions.click(driver, btnMoveUp,"MoveUp");
			return this;
		}
		public NewReserveRulePage selectTriggerAction(WebDriver driver,String TriggerAction)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpTriggerAction,TriggerAction,"TriggerAction");
			return this;
		}
		public NewReserveRulePage enterCommentsText(WebDriver driver,String CommentsText) {
			BrowserActions.type(driver, inpCommentsText,CommentsText, "CommentsText");
			return this;
		}
		public NewReserveRulePage selectTriggerEntity(WebDriver driver,String TriggerEntity)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpTriggerEntity,TriggerEntity,"TriggerEntity");
			return this;
		}
		public NewReserveRulePage clickAddAction(WebDriver driver)  {
			BrowserActions.click(driver, btnAddAction,"AddAction");
			return this;
		}
		public NewReserveRulePage clickRemove_5(WebDriver driver)  {
			BrowserActions.click(driver, btnRemove_5,"Remove_5");
			return this;
		}
		public NewReserveRulePage clickSimpleMoveDown(WebDriver driver)  {
			BrowserActions.click(driver, btnSimpleMoveDown,"SimpleMoveDown");
			return this;
		}
		public NewReserveRulePage clickContextHelpALTH(WebDriver driver)  {
			BrowserActions.click(driver, btnContextHelpALTH,"ContextHelpALTH");
			return this;
		}
		public NewReserveRulePage clickBooleanValueMenuIcon(WebDriver driver)  {
			BrowserActions.click(driver, btnBooleanValueMenuIcon,"BooleanValueMenuIcon");
			return this;
		}
		public NewReserveRulePage clickRemove_8(WebDriver driver)  {
			BrowserActions.click(driver, btnRemove_8,"Remove_8");
			return this;
		}
		public NewReserveRulePage clickName(WebDriver driver)  {
			BrowserActions.click(driver, btnName,"Name");
			return this;
		}
		public NewReserveRulePage clickRemoveAction(WebDriver driver)  {
			BrowserActions.click(driver, btnRemoveAction,"RemoveAction");
			return this;
		}
		public NewReserveRulePage clickLabel_30(WebDriver driver)  {
			BrowserActions.click(driver, btnLabel_30,"Label_30");
			return this;
		}
		public NewReserveRulePage clickLabel_32(WebDriver driver)  {
			BrowserActions.click(driver, btnLabel_32,"Label_32");
			return this;
		}
		public NewReserveRulePage enterLeftOperandLabel(WebDriver driver,String LeftOperandLabel) {
			BrowserActions.type(driver, inpLeftOperandLabel,LeftOperandLabel, "LeftOperandLabel");
			return this;
		}
		public NewReserveRulePage enterAndOrLabel(WebDriver driver,String AndOrLabel) {
			BrowserActions.type(driver, inpAndOrLabel,AndOrLabel, "AndOrLabel");
			return this;
		}
		public NewReserveRulePage enterVariableType(WebDriver driver,String VariableType) {
			BrowserActions.type(driver, inpVariableType,VariableType, "VariableType");
			return this;
		}
		public NewReserveRulePage clickCondition(WebDriver driver)  {
			BrowserActions.click(driver, btnCondition,"Condition");
			return this;
		}
		public NewReserveRulePage selectActionType(WebDriver driver,String ActionType)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpActionType,ActionType,"ActionType");
			return this;
		}
		public NewReserveRulePage clickEnabled(WebDriver driver)  {
			BrowserActions.click(driver, rdbEnabled,"Enabled");
			return this;
		}
		public NewReserveRulePage clickMoveDown(WebDriver driver)  {
			BrowserActions.click(driver, btnMoveDown,"MoveDown");
			return this;
		}
		public NewReserveRulePage enterNovariablesdeclared(WebDriver driver,String Novariablesdeclared) {
			BrowserActions.type(driver, inpNovariablesdeclared,Novariablesdeclared, "Novariablesdeclared");
			return this;
		}
		public NewReserveRulePage enterSequence(WebDriver driver,String Sequence) {
			BrowserActions.type(driver, inpSequence,Sequence, "Sequence");
			return this;
		}
		public NewReserveRulePage clickYesNo(WebDriver driver)  {
			BrowserActions.click(driver, btnYesNo,"YesNo");
			return this;
		}
		public NewReserveRulePage enterName(WebDriver driver,String Name) {
			BrowserActions.type(driver, inpName,Name, "Name");
			return this;
		}
		public NewReserveRulePage clickContextHelpALTH_11(WebDriver driver)  {
			BrowserActions.click(driver, btnContextHelpALTH_11,"ContextHelpALTH_11");
			return this;
		}
		public NewReserveRulePage enterDescription_20(WebDriver driver,String Description_20) {
			BrowserActions.type(driver, inpDescription_20,Description_20, "Description_20");
			return this;
		}
		public NewReserveRulePage clickDate(WebDriver driver)  {
			BrowserActions.click(driver, btnDate,"Date");
			return this;
		}
		public NewReserveRulePage enterOperatorLabel(WebDriver driver,String OperatorLabel) {
			BrowserActions.type(driver, inpOperatorLabel,OperatorLabel, "OperatorLabel");
			return this;
		}
		public NewReserveRulePage clickLabel(WebDriver driver)  {
			BrowserActions.click(driver, btnLabel,"Label");
			return this;
		}
		public NewReserveRulePage clickExposureType(WebDriver driver)  {
			BrowserActions.click(driver, rdbExposureType,"ExposureType");
			return this;
		}
		public NewReserveRulePage clickParameters(WebDriver driver)  {
			BrowserActions.click(driver, btnParameters,"Parameters");
			return this;
		}
		public NewReserveRulePage clickHideValidationErrors(WebDriver driver)  {
			BrowserActions.click(driver, btnHideValidationErrors,"HideValidationErrors");
			return this;
		}
		public NewReserveRulePage clickAdd(WebDriver driver)  {
			BrowserActions.click(driver, btnAdd,"Add");
			return this;
		}
		public NewReserveRulePage enterVariableDescriptionID(WebDriver driver,String VariableDescriptionID) {
			BrowserActions.type(driver, inpVariableDescriptionID,VariableDescriptionID, "VariableDescriptionID");
			return this;
		}
		public NewReserveRulePage clickAdvancedMoveUp(WebDriver driver)  {
			BrowserActions.click(driver, btnAdvancedMoveUp,"AdvancedMoveUp");
			return this;
		}
		public NewReserveRulePage clickValidationErrorIcon_29(WebDriver driver)  {
			BrowserActions.click(driver, btnValidationErrorIcon_29,"ValidationErrorIcon_29");
			return this;
		}
		public NewReserveRulePage clickViewHistory(WebDriver driver)  {
			BrowserActions.click(driver, btnViewHistory,"ViewHistory");
			return this;
		}
		public NewReserveRulePage clickLabel_19(WebDriver driver)  {
			BrowserActions.click(driver, btnLabel_19,"Label_19");
			return this;
		}
		public NewReserveRulePage clickValidationErrorIcon_27(WebDriver driver)  {
			BrowserActions.click(driver, btnValidationErrorIcon_27,"ValidationErrorIcon_27");
			return this;
		}
		public NewReserveRulePage clickTypeKeyMenuIcon(WebDriver driver)  {
			BrowserActions.click(driver, btnTypeKeyMenuIcon,"TypeKeyMenuIcon");
			return this;
		}
		public NewReserveRulePage clickHideFormattedView(WebDriver driver)  {
			BrowserActions.click(driver, btnHideFormattedView,"HideFormattedView");
			return this;
		}
		public NewReserveRulePage clickTypeKey(WebDriver driver)  {
			BrowserActions.click(driver, btnTypeKey,"TypeKey");
			return this;
		}
		public NewReserveRulePage clickValidationErrorIcon_22(WebDriver driver)  {
			BrowserActions.click(driver, btnValidationErrorIcon_22,"ValidationErrorIcon_22");
			return this;
		}
		public NewReserveRulePage clickExposureSegment(WebDriver driver)  {
			BrowserActions.click(driver, rdbExposureSegment,"ExposureSegment");
			return this;
		}
		public NewReserveRulePage enterDescription(WebDriver driver,String Description) {
			BrowserActions.type(driver, inpDescription,Description, "Description");
			return this;
		}
		public NewReserveRulePage enterActionType(WebDriver driver,String ActionType) {
			BrowserActions.type(driver, inpActionType,ActionType, "ActionType");
			return this;
		}
		public NewReserveRulePage clickValidationErrorIcon_24(WebDriver driver)  {
			BrowserActions.click(driver, btnValidationErrorIcon_24,"ValidationErrorIcon_24");
			return this;
		}
		public NewReserveRulePage clickLastEditedbysuon04262023(WebDriver driver)  {
			BrowserActions.click(driver, btnLastEditedbysuon04262023,"LastEditedbysuon04262023");
			return this;
		}
		public NewReserveRulePage enterVariableDescription(WebDriver driver,String VariableDescription) {
			BrowserActions.type(driver, inpVariableDescription,VariableDescription, "VariableDescription");
			return this;
		}
		public NewReserveRulePage clickTextTemplate(WebDriver driver)  {
			BrowserActions.click(driver, btnTextTemplate,"TextTemplate");
			return this;
		}
		public NewReserveRulePage clickTemplateExpressionMenuIcon(WebDriver driver)  {
			BrowserActions.click(driver, btnTemplateExpressionMenuIcon,"TemplateExpressionMenuIcon");
			return this;
		}
		public NewReserveRulePage enterVariableName(WebDriver driver,String VariableName) {
			BrowserActions.type(driver, inpVariableName,VariableName, "VariableName");
			return this;
		}
		public NewReserveRulePage clickSum(WebDriver driver)  {
			BrowserActions.click(driver, btnSum,"Sum");
			return this;
		}
		public NewReserveRulePage enterLeftOperandLabel_14(WebDriver driver,String LeftOperandLabel_14) {
			BrowserActions.type(driver, inpLeftOperandLabel_14,LeftOperandLabel_14, "LeftOperandLabel_14");
			return this;
		}
		public NewReserveRulePage clickValidationErrorIcon_18(WebDriver driver)  {
			BrowserActions.click(driver, btnValidationErrorIcon_18,"ValidationErrorIcon_18");
			return this;
		}
		public NewReserveRulePage clickLabel_28(WebDriver driver)  {
			BrowserActions.click(driver, btnLabel_28,"Label_28");
			return this;
		}
		public NewReserveRulePage clickLabel_23(WebDriver driver)  {
			BrowserActions.click(driver, btnLabel_23,"Label_23");
			return this;
		}
		public NewReserveRulePage clickRespectFinancialHolds(WebDriver driver)  {
			BrowserActions.click(driver, rdbRespectFinancialHolds,"RespectFinancialHolds");
			return this;
		}
		public NewReserveRulePage clickLabel_25(WebDriver driver)  {
			BrowserActions.click(driver, btnLabel_25,"Label_25");
			return this;
		}
		public NewReserveRulePage enterRightParensLabel(WebDriver driver,String RightParensLabel) {
			BrowserActions.type(driver, inpRightParensLabel,RightParensLabel, "RightParensLabel");
			return this;
		}
		public NewReserveRulePage enterVariableNameID(WebDriver driver,String VariableNameID) {
			BrowserActions.type(driver, inpVariableNameID,VariableNameID, "VariableNameID");
			return this;
		}
		public NewReserveRulePage clickExpression(WebDriver driver)  {
			BrowserActions.click(driver, btnExpression,"Expression");
			return this;
		}
		public NewReserveRulePage clickSave(WebDriver driver)  {
			BrowserActions.click(driver, btnSave,"Save");
			return this;
		}
		public NewReserveRulePage clickField(WebDriver driver)  {
			BrowserActions.click(driver, btnField,"Field");
			return this;
		}
		public NewReserveRulePage clickHideFormattedView_10(WebDriver driver)  {
			BrowserActions.click(driver, btnHideFormattedView_10,"HideFormattedView_10");
			return this;
		}
		public NewReserveRulePage enterLossType(WebDriver driver,String LossType) {
			BrowserActions.type(driver, inpLossType,LossType, "LossType");
			return this;
		}
		public NewReserveRulePage selectInputWidget(WebDriver driver,String InputWidget)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpInputWidget,InputWidget,"InputWidget");
			return this;
		}
		public NewReserveRulePage clickExpressionErrorIcon(WebDriver driver)  {
			BrowserActions.click(driver, btnExpressionErrorIcon,"ExpressionErrorIcon");
			return this;
		}
		public NewReserveRulePage clickEdit(WebDriver driver)  {
			BrowserActions.click(driver, btnEdit,"Edit");
			return this;
		}
		public NewReserveRulePage enterLeftParensLabel(WebDriver driver,String LeftParensLabel) {
			BrowserActions.type(driver, inpLeftParensLabel,LeftParensLabel, "LeftParensLabel");
			return this;
		}
		public NewReserveRulePage enterRightOperandLabel_16(WebDriver driver,String RightOperandLabel_16) {
			BrowserActions.type(driver, inpRightOperandLabel_16,RightOperandLabel_16, "RightOperandLabel_16");
			return this;
		}
		public NewReserveRulePage enterRightOperandLabel(WebDriver driver,String RightOperandLabel) {
			BrowserActions.type(driver, inpRightOperandLabel,RightOperandLabel, "RightOperandLabel");
			return this;
		}
		public NewReserveRulePage clickInsert(WebDriver driver)  {
			BrowserActions.click(driver, btnInsert,"Insert");
			return this;
		}
		public NewReserveRulePage clickInsert_7(WebDriver driver)  {
			BrowserActions.click(driver, btnInsert_7,"Insert_7");
			return this;
		}
		public NewReserveRulePage enterAmountFormula(WebDriver driver,String AmountFormula) {
			BrowserActions.type(driver, inpAmountFormula,AmountFormula, "AmountFormula");
			return this;
		}
		public NewReserveRulePage enterContextDescription(WebDriver driver,String ContextDescription) {
			BrowserActions.type(driver, inpContextDescription,ContextDescription, "ContextDescription");
			return this;
		}
		public NewReserveRulePage clickFormula(WebDriver driver)  {
			BrowserActions.click(driver, btnFormula,"Formula");
			return this;
		}
		public NewReserveRulePage clickAdvancedMoveDown(WebDriver driver)  {
			BrowserActions.click(driver, btnAdvancedMoveDown,"AdvancedMoveDown");
			return this;
		}
		public NewReserveRulePage clickShowFormattedView_9(WebDriver driver)  {
			BrowserActions.click(driver, btnShowFormattedView_9,"ShowFormattedView_9");
			return this;
		}
		public NewReserveRulePage clickRemove(WebDriver driver)  {
			BrowserActions.click(driver, btnRemove,"Remove");
			return this;
		}
		public NewReserveRulePage selectLossType(WebDriver driver,String LossType)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpLossType,LossType,1,"LossType");
			return this;
		}
		public NewReserveRulePage clickLookup(WebDriver driver)  {
			BrowserActions.click(driver, btnLookup,"Lookup");
			return this;
		}
		public NewReserveRulePage clickClose(WebDriver driver)  {
			BrowserActions.click(driver, btnClose,"Close");
			return this;
		}
		public NewReserveRulePage clickAdd_6(WebDriver driver)  {
			BrowserActions.click(driver, btnAdd_6,"Add_6");
			return this;
		}
		public NewReserveRulePage clickAdd_4(WebDriver driver)  {
			BrowserActions.click(driver, btnAdd_4,"Add_4");
			return this;
		}
		public NewReserveRulePage clickExpressionMenuIcon_26(WebDriver driver)  {
			BrowserActions.click(driver, btnExpressionMenuIcon_26,"ExpressionMenuIcon_26");
			return this;
		}
		public NewReserveRulePage clickNameValidationErrorIcon(WebDriver driver)  {
			BrowserActions.click(driver, btnNameValidationErrorIcon,"NameValidationErrorIcon");
			return this;
		}
		public NewReserveRulePage clickSimpleMoveUp(WebDriver driver)  {
			BrowserActions.click(driver, btnSimpleMoveUp,"SimpleMoveUp");
			return this;
		}
		public NewReserveRulePage clickValidationErrorIcon_31(WebDriver driver)  {
			BrowserActions.click(driver, btnValidationErrorIcon_31,"ValidationErrorIcon_31");
			return this;
		}
		public NewReserveRulePage selectCostType(WebDriver driver,String CostType)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpCostType,CostType,"CostType");
			return this;
		}
		public NewReserveRulePage clickCancel(WebDriver driver)  {
			BrowserActions.click(driver, btnCancel,"Cancel");
			return this;
		}
		public NewReserveRulePage selectCurrency(WebDriver driver,String Currency)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpCurrency,Currency,"Currency");
			return this;
		}
		public NewReserveRulePage clickLastsavedvalue(WebDriver driver)  {
			BrowserActions.click(driver, btnLastsavedvalue,"Lastsavedvalue");
			return this;
		}
		public NewReserveRulePage enterExpressionID(WebDriver driver,String ExpressionID) {
			BrowserActions.type(driver, inpExpressionID,ExpressionID, "ExpressionID");
			return this;
		}
		public NewReserveRulePage clickValidationErrorIcon(WebDriver driver)  {
			BrowserActions.click(driver, btnValidationErrorIcon,"ValidationErrorIcon");
			return this;
		}
		public NewReserveRulePage selectCostCategory(WebDriver driver,String CostCategory)  {
			BrowserActions.selectDropDownByVisibleText(driver, drpCostCategory,CostCategory,1,"CostCategory");
			return this;
		}
		
		public NewReserveRulePage enterRuleVariableName(WebDriver driver,String ruleName) {
			BrowserActions.type(driver, inpRuleVariableName,ruleName, "Rule Name");
			return this;
		}

		public NewReserveRulePage enterRuleVariableDescription(WebDriver driver,String ruleDescription) {
			BrowserActions.type(driver, inpRuleVariableDescription,ruleDescription,1.5, "Rule Description");
			return this;
		}

		public NewReserveRulePage enterRuleVariableExpression(WebDriver driver,String ruleVariableExpression) {
			BrowserActions.type(driver, inpRuleVariableExpression,ruleVariableExpression,1.5, "Rule Variable Expression");
			return this;
		}

	}

}
